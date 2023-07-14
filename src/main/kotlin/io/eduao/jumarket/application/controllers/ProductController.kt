package io.eduao.jumarket.application.controllers

import io.eduao.jumarket.application.dtos.ProductDto
import io.eduao.jumarket.usecases.CreateProductUseCase
import io.eduao.jumarket.usecases.GetProductByIdUseCase
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/product")
class ProductController(
    private val createProductUseCase: CreateProductUseCase,
    private val getProductByIdUseCase: GetProductByIdUseCase
) {
    @PostMapping
    fun createProduct(@RequestBody productDto: ProductDto): ResponseEntity<Unit> {
        createProductUseCase.execute(productDto.toProduct())
        return ResponseEntity.status(HttpStatus.CREATED).build()
    }

    @GetMapping("/{id}")
    fun getProduct(@PathVariable id : Long): ResponseEntity<ProductDto> {
        val product = getProductByIdUseCase.execute(id)
        return if (product != null) {
            val productDto = ProductDto(product.id, product.name, product.unitOfMeasure, product.unitPrice)
            ResponseEntity.ok(productDto)
        } else {
            ResponseEntity.notFound().build()
        }
    }
}