package com.ode.code.android

import android.content.Context
import com.ode.code.android.core.firebase.StoreManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DependencyProvider {
    @Singleton
    @Provides
    fun provideStoreManager(@ApplicationContext context: Context): StoreManager = StoreManager(context)
}