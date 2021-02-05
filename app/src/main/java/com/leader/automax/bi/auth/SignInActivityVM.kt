package com.leader.automax.bi.auth

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.View
import androidx.databinding.ObservableField
import com.leader.automax.bi.MainActivity

class SignInActivityVM internal constructor(
    private val mContext: Context
) {
    var etEmailAccount = ObservableField("")
    var etPassword = ObservableField("")

    fun onSubmit(view: View) {
        val intent = Intent(mContext, MainActivity::class.java)
        mContext.startActivity(intent)
        (mContext as Activity).finish()
    }
}