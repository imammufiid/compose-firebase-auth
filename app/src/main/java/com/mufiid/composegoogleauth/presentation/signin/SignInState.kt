package com.mufiid.composegoogleauth.presentation.signin

data class SignInState(
    val isSignInSuccessful: Boolean = false,
    val errorMessage: String? = null
)
