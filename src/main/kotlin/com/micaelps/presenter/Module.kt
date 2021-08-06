package com.micaelps.presenter

import com.micaelps.core.usecases.CustomerRepository
import com.micaelps.core.usecases.CreateCustomerUseCase
import io.micronaut.context.annotation.Factory
import javax.inject.Singleton

@Factory
class Module {
    @Singleton
    fun createCustomerUseCase(repository: CustomerRepository?): CreateCustomerUseCase {
        return CreateCustomerUseCase(repository!!)
    }
}