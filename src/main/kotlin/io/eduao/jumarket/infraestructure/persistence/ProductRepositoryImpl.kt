package io.eduao.jumarket.infraestructure.persistence

import io.eduao.jumarket.domain.model.Product
import io.eduao.jumarket.domain.repository.ProductRepository
import org.springframework.stereotype.Repository

@Repository
class ProductRepositoryImpl(private val productJpaRepository: ProductJpaRepository): ProductRepository {
    override fun createProduct(product: Product) {
        productJpaRepository.save(ProductEntity.fromProduct(product))
    }

    override fun getProductById(id: Long): Product? {
        val productEntity = productJpaRepository.findById(id).orElse(null)
        return productEntity?.toProduct()
    }
}