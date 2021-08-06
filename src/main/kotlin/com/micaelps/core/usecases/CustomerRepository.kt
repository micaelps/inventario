package com.micaelps.core.usecases

import com.micaelps.core.domain.Customer
import javax.inject.Singleton

@Singleton
interface CustomerRepository {
    fun persist(customer: Customer): Customer
}
