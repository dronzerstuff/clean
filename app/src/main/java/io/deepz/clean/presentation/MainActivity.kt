package io.deepz.clean.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.deepz.clean.R
import io.deepz.clean.data.repository.EmployeeRepositoryImpl
import io.deepz.clean.data.service.EmployeeAPI
import io.deepz.clean.di.MyApplication
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var restImpl: EmployeeRepositoryImpl
    @Inject
    lateinit var client: EmployeeAPI

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (application as MyApplication).getAplicationComponeny().injectMain(this)
        EmployeeRepositoryImpl(client).getEmployeeList()


    }
}
