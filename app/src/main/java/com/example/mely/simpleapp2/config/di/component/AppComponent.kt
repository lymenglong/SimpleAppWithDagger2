package com.example.mely.simpleapp2.config.di.component

import com.example.mely.simpleapp2.config.application.App
import com.example.mely.simpleapp2.config.di.module.AppModule
import com.example.mely.simpleapp2.config.di.provider.ActivityProvider
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, AppModule :: class, ActivityProvider :: class])
interface AppComponent {
    fun inject (application: App)
}