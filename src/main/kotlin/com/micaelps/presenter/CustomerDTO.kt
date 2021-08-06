package com.micaelps.presenter

import com.fasterxml.jackson.annotation.JsonProperty
import com.micaelps.core.domain.Customer

class CustomerDTO {
    @JsonProperty("name")
    var name: String? = null

    constructor(name: String?) {
        this.name = name
    }

    constructor() {}

    fun toDomain(): Customer {
        return Customer(name!!)
    }
}