package com.leader.automax.bi

import android.content.DialogInterface
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.browser.customtabs.CustomTabsIntent
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    //private val url: String = "https://www.webpagetest.org/"

    private val url: String =
        "https://Eamana%5CAutomaxsup:3PM940%40l3%40d3r@940bi.eamana.gov.sa/reports/powerbi/IncidentDashboardCovid19MobileAR?rs:embed=true"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cvIncidents = findViewById<CardView>(R.id.cv_incidents)
        cvIncidents.setOnClickListener {
            //val intent = Intent(this, IncidentsActivity::class.java)
            //startActivity(intent)

            val builder = CustomTabsIntent.Builder()
            builder.setUrlBarHidingEnabled(false)
            val customTabsIntent = builder.build()
            customTabsIntent.launchUrl(this, Uri.parse(url))
        }
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