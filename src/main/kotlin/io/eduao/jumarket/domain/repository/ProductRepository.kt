package io.eduao.jumarket.domain.repository

import io.eduao.jumarket.domain.model.Product

interface ProductRepository {
    fun createProduct(product: Product)
    fun getProductById(id: Long): Product?
}