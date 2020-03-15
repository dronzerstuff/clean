package io.deepz.clean.di

import android.app.Application
import io.deepz.clean.di.component.ApplicationComponent
import io.deepz.clean.di.component.DaggerApplicationComponent

class MyApplication : Application() {


    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()


        applicationComponent=  DaggerApplicationComponent.builder()
            .retrofitClient(RetrofitClient())
            .build();

    }

    fun getAplicationComponeny(): ApplicationComponent = applicationComponent;
}