package io.deepz.clean.domain.repository

import androidx.lifecycle.MutableLiveData
import io.deepz.clean.domain.entity.EmployeeResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.Call

interface EmployeeRepository {
    fun getEmployeeList(): MutableLiveData<EmployeeResponse>

}