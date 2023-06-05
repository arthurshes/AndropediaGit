package com.example.user_api

import com.example.user_api.model.SendStatus
import com.example.user_api.model.UserProfileInfo
import com.example.user_api.model.UserSubscribesModel
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface UserInfoApiService {

   @GET("user/get/profile")
   suspend fun getMyProfile(
       @Query("token") token:String
   ):UserProfileInfo

   @GET("user/get/subscribe")
   suspend fun getUserSubscribes(
       @Query("token") token:String
   ):UserSubscribesModel

   @POST("user/send/transaction")
   suspend fun sendUserSubscribe(
       @Body userSubscribesModel: UserSubscribesModel
   ):SendStatus

   @POST("user/send/profile")
   suspend fun sendMyProfile(
       @Body userProfileInfo: UserProfileInfo
   ):SendStatus


}