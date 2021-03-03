package com.shekhar.demo.mvvmdatabindinglivedatademo.view

import androidx.lifecycle.ViewModelProviders
import com.shekhar.demo.mvvmdatabindinglivedatademo.R
import androidx.databinding.library.baseAdapters.BR
import com.shekhar.demo.mvvmdatabindinglivedatademo.base.BaseActivity
import com.shekhar.demo.mvvmdatabindinglivedatademo.databinding.ActivityUserLoginBinding
import com.shekhar.demo.mvvmdatabindinglivedatademo.model.UserLoginDetails
import com.shekhar.demo.mvvmdatabindinglivedatademo.viewmodel.UserLoginViewModel

class UserLoginActivity : BaseActivity<ActivityUserLoginBinding, UserLoginViewModel>() {

    override fun getViewModel(): UserLoginViewModel {
        return ViewModelProviders.of(this).get(UserLoginViewModel::class.java)
    }

    override fun getBindingVariable(): Int = BR.loginViewModel


    override fun init() {
        mViewDataBinding?.userDetails = UserLoginDetails()
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_user_login
    }

}
