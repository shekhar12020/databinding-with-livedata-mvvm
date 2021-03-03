package com.shekhar.demo.mvvmdatabindinglivedatademo.viewmodel

import androidx.databinding.Observable
import androidx.lifecycle.MutableLiveData
import com.shekhar.demo.mvvmdatabindinglivedatademo.base.BaseViewModel
import com.shekhar.demo.mvvmdatabindinglivedatademo.model.UserLoginDetails

class UserLoginViewModel : BaseViewModel() {

    fun doLoginRequest(userLoginDetails: UserLoginDetails?) {
        println("Mobile Number : " + userLoginDetails?.mobileNumber)
        println("Password : " + userLoginDetails?.password)
    }

    fun handleSuccessResponse() {

    }

    fun handleFailureResponse() {

    }

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {

    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {

    }

}