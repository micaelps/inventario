package com.micaelps.jpa.repositories

import io.micronaut.data.jpa.repository.JpaRepository
import com.micaelps.jpa.entities.CustomerData
import io.micronaut.data.annotation.Repository

@Repository
interface JpaCustomerRepository : JpaRepository<CustomerData, Long>