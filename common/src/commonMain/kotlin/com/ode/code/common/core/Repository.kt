package com.ode.code.common.core

interface Repository<T> {
    fun get(): T
}