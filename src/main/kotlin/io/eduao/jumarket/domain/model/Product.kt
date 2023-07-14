package io.eduao.jumarket.domain.model

data class Product(
        val id: Long? = null,
        val name: String,
        val unitOfMeasure: String,
        val unitPrice: Double
)