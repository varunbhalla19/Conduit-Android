package io.realworld.api.models.request


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import io.realworld.api.models.entities.SignupUser

@JsonClass(generateAdapter = true)
data class SignupRequest(
    @Json(name = "user")
    val user: SignupUser
)