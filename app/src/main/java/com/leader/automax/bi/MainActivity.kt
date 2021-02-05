package com.leader.automax.bi

import android.content.DialogInterface
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onBackPressed() {
        AlertDialog.Builder(this)
            .setMessage(R.string.exit_prompt)
            .setPositiveButton(android.R.string.ok) { _: DialogInterface?, _: Int -> finishAffinity() }
            .setNegativeButton(android.R.string.cancel, null)
            .setIcon(android.R.drawable.ic_dialog_alert)
            .show()
    }
}