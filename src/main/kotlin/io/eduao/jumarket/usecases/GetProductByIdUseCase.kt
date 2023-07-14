package io.eduao.jumarket.usecases

import io.eduao.jumarket.domain.model.Product
import io.eduao.jumarket.domain.repository.ProductRepository
import org.springframework.stereotype.Component

@Component
class GetProductByIdUseCase(private val productRepository: ProductRepository) {
    fun execute(productId: Long): Product? {
        return productRepository.getProductById(productId)
    }
}