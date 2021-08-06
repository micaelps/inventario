package com.micaelps.presenter

import com.micaelps.InventarioRequest
import com.micaelps.InventarioResponse
import com.micaelps.InventarioServiceGrpcKt
import com.micaelps.core.usecases.CreateCustomerUseCase
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CustomerResource(
    @Inject val teste:CreateCustomerUseCase
): InventarioServiceGrpcKt.InventarioServiceCoroutineImplBase() {


    override suspend fun send(request: InventarioRequest): InventarioResponse {
        return InventarioResponse.newBuilder().setMessage("aa").build()
    }
//    private CreateCustomerUseCase createCustomerUseCase;
    //
    //    public CustomerResource(CreateCustomerUseCase createCustomerUseCase) {
    //        this.createCustomerUseCase = createCustomerUseCase;
    //    }
    //
    //    @PostMapping
    //    public void eita(@RequestBody CustomerDTO customerDTO) {
    //        createCustomerUseCase.executa(customerDTO.toDomain());
    //    }
}