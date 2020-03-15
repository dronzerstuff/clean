package io.deepz.clean.di

import dagger.Module
import dagger.Provides
import io.deepz.clean.data.service.EmployeeAPI
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
class RetrofitClient() {

    @Provides
    @Singleton

    fun getApiInterface(): EmployeeAPI {
        return Retrofit.Builder()
            .baseUrl("http://dummy.restapiexample.com/")
            .addConverterFactory(MoshiConverterFactory.create())
            .client(
                OkHttpClient.Builder()
                    .build()
            )
            .build().create<EmployeeAPI>(EmployeeAPI::class.java)
    }

//    @Provides
//    @Singleton
//    fun getRetrofit(): Retrofit? {
//        return Retrofit.Builder()
//            .baseUrl("https://swapi.co/api/")
//            .addConverterFactory(GsonConverterFactory.create())
//            .client(OkHttpClient.Builder()
//                .build())
//            .build()
//    }


}