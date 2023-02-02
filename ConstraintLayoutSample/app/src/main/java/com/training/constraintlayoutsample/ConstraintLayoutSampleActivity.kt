package com.training.constraintlayoutsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ConstraintLayoutSampleActivity : AppCompatActivity() {

   companion object {
       val BUNDLE_LAYOUT = "BUNDLE_LAYOUT"
   }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var layout = intent.getIntExtra(BUNDLE_LAYOUT,0)
        setContentView(layout)
    }
}