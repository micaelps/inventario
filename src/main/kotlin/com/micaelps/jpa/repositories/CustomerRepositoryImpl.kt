package com.micaelps.jpa.repositories
import com.micaelps.core.domain.Customer
import com.micaelps.core.usecases.CustomerRepository
import com.micaelps.jpa.entities.CustomerData
import io.micronaut.data.annotation.Repository

@Repository
open class CustomerRepositoryImpl(private val repository: JpaCustomerRepository) : CustomerRepository {
    override fun persist(customer: Customer): Customer {
        val customerData: CustomerData = CustomerData.from(customer)
        return repository.save(customerData).fromThis()
    }
}