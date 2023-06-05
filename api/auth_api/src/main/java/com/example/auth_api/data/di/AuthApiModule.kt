package com.example.auth_api.data.di

import com.example.auth_api.data.AuthApiService
import com.example.core.utils.Constants
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
object AuthApiModule {
    @Singleton
    @Provides
    fun authApiService():AuthApiService =
        Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create(AuthApiService::class.java)
}