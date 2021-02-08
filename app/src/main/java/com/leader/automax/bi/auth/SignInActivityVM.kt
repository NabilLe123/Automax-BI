package com.leader.automax.bi.auth

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.databinding.ObservableField
import com.leader.automax.bi.MainActivity
import com.leader.automax.bi.R


class SignInActivityVM internal constructor(
    private val mContext: Context
) {
    var etEmailAccount = ObservableField("")
    var etPassword = ObservableField("")

    //Username : Eamana\Automaxsup
    //Password : 3PM940@l3@d3r
    fun onSubmit(view: View) {
        Log.d("rxjava", etEmailAccount.get() + " : " + etPassword.get())

        if (etEmailAccount.get().toString().trim() == "Eamana\\Automaxsup"
            &&
            etPassword.get().toString().trim() == "3PM940@l3@d3r"
        ) {
            val intent = Intent(mContext, MainActivity::class.java)
            mContext.startActivity(intent)
            (mContext as Activity).finish()
        } else {
            AlertDialog.Builder(mContext)
                .setMessage(R.string.invalid_credentials)
                .setPositiveButton(android.R.string.ok, null)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show()
        }
    }
}