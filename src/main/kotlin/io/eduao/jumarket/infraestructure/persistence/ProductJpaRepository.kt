package io.eduao.jumarket.infraestructure.persistence


import org.springframework.data.jpa.repository.JpaRepository

interface ProductJpaRepository : JpaRepository<ProductEntity, Long> {
    // Você pode adicionar métodos adicionais personalizados para consultas específicas, se necessário
}