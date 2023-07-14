package io.eduao.jumarket.application.dtos

import io.eduao.jumarket.domain.model.Product

class ProductDto(
    val id: Long? = null,
    val name: String,
    val unitOfMeasure: String,
    val unitPrice: Double
) {
    fun toProduct(): Product {
        return Product(id = id, name = name, unitOfMeasure = unitOfMeasure, unitPrice = unitPrice)
    }
}