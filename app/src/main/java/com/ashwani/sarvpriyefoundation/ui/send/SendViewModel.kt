package com.ashwani.sarvpriyefoundation.ui.send

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SendViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "About Us"
    }
    val text: LiveData<String> = _text
}