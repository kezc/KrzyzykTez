package com.example.kolkoikrzyzyk.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kolkoikrzyzyk.notifyObserver

class UsersViewModel : ViewModel() {
    private val _users = MutableLiveData<MutableList<String>>(mutableListOf())
    val users: LiveData<MutableList<String>>
        get() = _users

    fun addUser(name: String) {
        _users.value?.add(name)
        _users.notifyObserver()
    }

}

