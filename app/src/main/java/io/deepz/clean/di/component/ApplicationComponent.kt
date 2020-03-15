package io.deepz.clean.di.component

import dagger.Component
import io.deepz.clean.data.repository.EmployeeRepositoryImpl
import io.deepz.clean.di.RetrofitClient
import io.deepz.clean.presentation.MainActivity
import javax.inject.Singleton


@Singleton
@Component(modules = [RetrofitClient::class])
interface ApplicationComponent {

    fun injectMain(mainActivity: MainActivity)

}
