package com.example.logonrmlocal.testeparanac

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ServiceGitHub{

    @GET("/users/{username}")
    fun buscarUsuario(@Path("username") username: String):Call<Usuario>
}