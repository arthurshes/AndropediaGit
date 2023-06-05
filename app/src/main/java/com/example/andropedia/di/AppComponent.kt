package com.example.andropedia.di

import com.example.local_db.di.LocalDbModule
import dagger.Component

@Component(modules = [LocalDbModule::class])
interface AppComponent {

}