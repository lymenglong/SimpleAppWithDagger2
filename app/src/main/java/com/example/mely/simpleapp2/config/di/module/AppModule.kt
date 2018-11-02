package com.example.mely.simpleapp2.config.di.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class AppModule (private var app : Application) {
    @Provides
    fun provideApplicationContext(): Context = app
    @Provides
    fun provideText () :String = "TestTextProvider"
}