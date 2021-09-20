package com.mongodb.realmsplashscreen

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val isAppReady: LiveData<Boolean> = MutableLiveData(false)


}