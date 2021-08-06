package com.micaelps.jpa.entities

import com.micaelps.core.domain.Customer
import javax.persistence.*

@Entity
class CustomerData(@field:Column(nullable = false) var name: String) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    fun fromThis(): Customer {
        return Customer(
            name
        )
    }

    companion object {
        fun from(customer: Customer): CustomerData {
            return CustomerData(customer.name)
        }
    }
}