package com.shekhar.demo.mvvmdatabindinglivedatademo.model

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.library.baseAdapters.BR

class UserLoginDetails : BaseObservable() {

    var mobileNumber: String? = null
        @Bindable get() = field
        set(mobileNumber) {
            field = mobileNumber
            notifyPropertyChanged(BR.mobileNumber)
        }

    var password: String? = null
        @Bindable get() = field
        set(password) {
            field = password
            notifyPropertyChanged(BR.password)
        }

}