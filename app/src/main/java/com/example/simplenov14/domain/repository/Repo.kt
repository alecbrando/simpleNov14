package com.example.simplenov14.domain.repository

import com.example.simplenov14.domain.models.Person

interface Repo {
    fun getPeople(): List<Person>
}