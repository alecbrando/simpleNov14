package com.example.simplenov14

import androidx.lifecycle.ViewModel
import com.example.simplenov14.data.repository.RepoImpl
import com.example.simplenov14.domain.models.Person
import com.example.simplenov14.domain.repository.Repo

class MainViewModel: ViewModel() {
    private val repo: Repo = RepoImpl

    // encapsulation
    private var _people: List<Person> = emptyList()
    val people get() = _people


    fun getPeople() {
        _people = repo.getPeople()
    }
}