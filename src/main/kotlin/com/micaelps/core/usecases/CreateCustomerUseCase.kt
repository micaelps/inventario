package com.micaelps.core.usecases;

import com.micaelps.core.domain.Customer


class CreateCustomerUseCase(private val repository:CustomerRepository) {

    fun executa( customer: Customer) = repository.persist(customer);

}
