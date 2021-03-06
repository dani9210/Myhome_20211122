package com.example.myHome.api

import com.example.myHome.datas.BasicResponse
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.POST

interface ServerAPIService {

//    기능별 주소 (endpoint) / 메쏘드(POST) / 파라미터 명시.

     @POST("/user")
     fun  postRequestLogin(
         @Field("email")  email : String,
         @Field("password")  pw : String
     ) : Call<BasicResponse>
}