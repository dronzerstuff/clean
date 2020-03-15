package io.deepz.clean.domain.usecase

import io.deepz.clean.data.repository.EmployeeRepositoryImpl
import io.deepz.clean.domain.entity.EmployeeResponse
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class GetEmployeeListUseCase
//@Inject constructor(
//    private val employeeRepository: EmployeeRepositoryImpl
//) :
//    SingleUseCase<EmployeeResponse>() {
//
//
//    override fun buildUseCaseSingle(): Single<EmployeeResponse> {
//
//
//        return <employeeRepository.getEmployeeList();
//    }
//}
