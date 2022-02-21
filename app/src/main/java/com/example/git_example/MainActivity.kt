package com.example.git_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.FrameLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.git_example.Adapter.AdapterSchool
import com.example.git_example.Data.Datasource

class MainActivity : AppCompatActivity() {
    private var screen = "home"

    private var dataSet = Datasource().loadCNS()

    private val home = "home"
    private val cns = "Collage Of Natural Sciences"
    private val la = "Collage Of Liberal Arts"
    private val eng = "Collage Of Engineering"
    private val edu = "Collage Of Education"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.backButton)
        button.visibility = View.GONE
        val mainScreen = findViewById<FrameLayout>(R.id.main)
        val cnsImage = findViewById<TextView>(R.id.cnsText)
        val eduImage = findViewById<TextView>(R.id.eduText)
        val laImage = findViewById<TextView>(R.id.laText)
        val faImage = findViewById<TextView>(R.id.faText)
        val infoImage = findViewById<TextView>(R.id.infoText)
        val pharmaImage = findViewById<TextView>(R.id.pharmaText)
        val gradImage = findViewById<TextView>(R.id.gradText)
        val engImage = findViewById<TextView>(R.id.engineeringText)
        val medImage = findViewById<TextView>(R.id.medText)
        val geoImage = findViewById<TextView>(R.id.geoText)
        val pAffairsImage = findViewById<TextView>(R.id.pAffairsText)
        val commImage = findViewById<TextView>(R.id.commText)
        val businessImage = findViewById<TextView>(R.id.businessText)
        val archImage = findViewById<TextView>(R.id.archText)
        val lawImage = findViewById<TextView>(R.id.lawText)
        val nurseImage = findViewById<TextView>(R.id.nurseText)
        val socialImage = findViewById<TextView>(R.id.socialText)
        val undergradImage = findViewById<TextView>(R.id.underText)

        button!!.setOnClickListener {
            screen = home
            schoolClicked(mainScreen, button)
        }
        cnsImage!!.setOnClickListener {
            screen = cns
            schoolClicked(mainScreen, button)
        }
        infoImage!!.setOnClickListener {
            screen = cns
            schoolClicked(mainScreen, button)
        }
        pharmaImage!!.setOnClickListener {
            screen = cns
            schoolClicked(mainScreen, button)
        }
        faImage!!.setOnClickListener {
            screen = cns
            schoolClicked(mainScreen, button)
        }
        medImage!!.setOnClickListener {
            screen = cns
            schoolClicked(mainScreen, button)
        }
        gradImage!!.setOnClickListener {
            screen = cns
            schoolClicked(mainScreen, button)
        }
        engImage!!.setOnClickListener {
            screen = eng
            schoolClicked(mainScreen, button)
        }
        eduImage!!.setOnClickListener {
            screen = edu
            schoolClicked(mainScreen, button)
        }
        laImage!!.setOnClickListener {
            screen = edu
            schoolClicked(mainScreen, button)
        }
        undergradImage!!.setOnClickListener {
            screen = edu
            schoolClicked(mainScreen, button)
        }
        socialImage!!.setOnClickListener {
            screen = edu
            schoolClicked(mainScreen, button)
        }
        nurseImage!!.setOnClickListener {
            screen = edu
            schoolClicked(mainScreen, button)
        }
        lawImage!!.setOnClickListener {
            screen = edu
            schoolClicked(mainScreen, button)
        }
        archImage!!.setOnClickListener {
            screen = edu
            schoolClicked(mainScreen, button)
        }
        businessImage!!.setOnClickListener {
            screen = edu
            schoolClicked(mainScreen, button)
        }
        commImage!!.setOnClickListener {
            screen = edu
            schoolClicked(mainScreen, button)
        }
        pAffairsImage!!.setOnClickListener {
            screen = edu
            schoolClicked(mainScreen, button)
        }
        geoImage!!.setOnClickListener {
            screen = edu
            schoolClicked(mainScreen, button)
        }

    }

    private fun schoolClicked(mainScreen: FrameLayout, button: Button) {
        val recyclerView =
            findViewById<RecyclerView>(R.id.recycler_view)
        dataSet = when (screen) {
            cns -> Datasource().loadCNS()
            la -> Datasource().loadLA()
            else -> Datasource().loadLA()
        }
        if (screen == home) {
            recyclerView.visibility = View.GONE
            button.visibility = View.GONE
            mainScreen.visibility = View.VISIBLE
        } else {
            recyclerView.adapter = AdapterSchool(this, dataSet)
            recyclerView.visibility = View.VISIBLE
            button.visibility = View.VISIBLE
            mainScreen.visibility = View.GONE
        }
    }
}