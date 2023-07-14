package io.eduao.jumarket.usecases

import io.eduao.jumarket.domain.model.Product
import io.eduao.jumarket.domain.repository.ProductRepository
import org.springframework.stereotype.Component

@Component
class CreateProductUseCase(private val productRepository: ProductRepository) {
    fun execute(product: Product) {
        // Aqui você pode adicionar a lógica de negócio necessária antes de persistir o produto

        productRepository.createProduct(product)
    }
}