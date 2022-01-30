package com.hafidmust.studyjam5

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {
    private val _dataValue = MutableLiveData<Int>()
    val dataValue = _dataValue
    private var i = 0

    fun add(){
        i++
        _dataValue.value = i
    }
}