package io.deepz.clean.data.service

import io.deepz.clean.domain.entity.EmployeeResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface EmployeeAPI {

    @GET("api/v1/employees")
    suspend fun getEmployeeList(): Response<EmployeeResponse>

}