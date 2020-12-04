package com.example.gulftech_androidtask.di


import com.example.gulftech_androidtask.data.repository.HomeRepository
import com.example.gulftech_androidtask.data.repository.HomeRepositoryImp
import org.koin.dsl.module

val repository = module {
    single<HomeRepository> { HomeRepositoryImp(get()) }
}