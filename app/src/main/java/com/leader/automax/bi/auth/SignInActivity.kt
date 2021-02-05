package com.leader.automax.bi.auth

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.leader.automax.bi.R
import com.leader.automax.bi.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activitySignInBinding: ActivitySignInBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_sign_in)
        val signInActivityVM = SignInActivityVM(this)
        activitySignInBinding.signInActivityVM = signInActivityVM
    }
}