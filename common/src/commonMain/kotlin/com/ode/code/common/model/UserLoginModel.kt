package com.ode.code.common.model

data class UserLoginModel(
    var userName: String = "",
    var isLoggedIn: Boolean = false,
    var password: String = ""
)
