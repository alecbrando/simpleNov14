package com.example.simplenov14.data.repository

import com.example.simplenov14.domain.models.Person
import com.example.simplenov14.domain.repository.Repo

object RepoImpl: Repo {
    // variables
    override fun getPeople(): List<Person> {
        // in here to send HTTP request
        return listOf(
            Person("Alec", 27),
            Person("Tyson", 17),
            Person("Kassi", 32),
            Person("Talia", 50),
            Person("Harrison", 51),
            Person("Mom", 60),
        )
    }
}