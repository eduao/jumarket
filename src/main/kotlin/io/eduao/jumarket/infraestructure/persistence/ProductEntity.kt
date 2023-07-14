package io.eduao.jumarket.infraestructure.persistence

import io.eduao.jumarket.domain.model.Product
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "product")
data class ProductEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,
        val name: String,
        val unitOfMeasure: String,
        val unitPrice: Double
) {
    constructor() : this(null, "", "", 0.0)
    companion object {
        fun fromProduct(product: Product): ProductEntity {
            return ProductEntity(
                id = product.id,
                name = product.name,
                unitOfMeasure = product.unitOfMeasure,
                unitPrice = product.unitPrice
            )
        }
    }

    fun toProduct(): Product {
        return Product(
            id = id,
            name = name,
            unitOfMeasure = unitOfMeasure,
            unitPrice = unitPrice,
        )
    }
}