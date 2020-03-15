package io.deepz.clean.data.repository

import androidx.lifecycle.MutableLiveData
import io.deepz.clean.data.service.EmployeeAPI
import io.deepz.clean.domain.entity.EmployeeResponse
import io.deepz.clean.domain.repository.EmployeeRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject


class EmployeeRepositoryImpl @Inject constructor(val api: EmployeeAPI) : EmployeeRepository {


    override fun getEmployeeList(): MutableLiveData<EmployeeResponse> {

        val liveData = MutableLiveData<EmployeeResponse>()


        CoroutineScope(Dispatchers.IO).launch {
            val response = api.getEmployeeList()
            withContext(Dispatchers.Main) {
                println("yoyoo"+response.body()!!.status)
                liveData.value = response.body()

            }


        }

        return liveData;
    }


}