package io.deepz.clean.domain.entity

import com.squareup.moshi.Json


data class EmployeeResponse(
    @field:Json(name = "status") val status: String,
    @field:Json(name ="data") val data: List<Data>)

data class Data
    (
    @field:Json(name ="id") val id: Int,
    @field:Json(name ="employee_name") val employee_name: String,
    @field:Json(name ="employee_salary") val employee_salary: Int,
    @field:Json(name ="employee_age") val employee_age: Int,
    @field:Json(name ="profile_image") val profile_image: String)