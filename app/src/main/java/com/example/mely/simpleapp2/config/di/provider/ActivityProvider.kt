package com.example.mely.simpleapp2.config.di.provider

import com.example.mely.simpleapp2.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityProvider {
    @ContributesAndroidInjector
    abstract fun provideMainActivity() : MainActivity
}