package com.example.auth_api.data

import com.example.auth_api.data.model.EmailGetModel
import com.example.auth_api.data.model.EmailSendModel
import com.example.auth_api.data.model.SendStatus
import com.example.auth_api.data.model.UserInfoModel
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthApiService {

    @POST("user/email/signin")
    suspend fun signIngEmail(@Body emailSendModel: EmailSendModel):EmailGetModel

    @POST("user/email/login")
    suspend fun loginEmail(@Body emailSendModel: EmailSendModel):EmailGetModel

    @POST("user/register/senddata")
    suspend fun sendUserInfo(@Body userInfoModel: UserInfoModel):SendStatus

}