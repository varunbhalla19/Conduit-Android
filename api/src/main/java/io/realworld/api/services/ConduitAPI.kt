package io.realworld.api.services

import io.realworld.api.models.entities.SignupUser
import io.realworld.api.models.entities.User
import io.realworld.api.models.request.SignupRequest
import io.realworld.api.models.response.ArticlesResponse
import io.realworld.api.models.response.UserResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface ConduitAPI {

    @GET("articles")
    suspend fun getArticles(
        @Query("author") author: String? = null,
        @Query("favourited") favourited: String? = null,
        @Query("tag") tag: String? = null
    ): Response<ArticlesResponse>

}