package com.training.constraintlayoutsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun linearVertical(V: View) {
        var intent = Intent(this@MainActivity, ConstraintLayoutSampleActivity::class.java)
        intent.putExtra(ConstraintLayoutSampleActivity.BUNDLE_LAYOUT, R.layout.activity_linear_vertical)
        startActivity(intent)
    }

    fun linearHorizontal(V: View) {
        var intent = Intent(this@MainActivity, ConstraintLayoutSampleActivity::class.java)
        intent.putExtra(ConstraintLayoutSampleActivity.BUNDLE_LAYOUT, R.layout.activity_linear_horizontal)
        startActivity(intent)
    }

    fun linearWeight(V: View) {
        var intent = Intent(this@MainActivity, ConstraintLayoutSampleActivity::class.java)
        intent.putExtra(ConstraintLayoutSampleActivity.BUNDLE_LAYOUT, R.layout.activity_linear_weight)
        startActivity(intent)
    }

    fun relativeParent(V: View) {
        var intent = Intent(this@MainActivity, ConstraintLayoutSampleActivity::class.java)
        intent.putExtra(ConstraintLayoutSampleActivity.BUNDLE_LAYOUT, R.layout.activity_relative_parent)
        startActivity(intent)
    }

    fun relativeChild(V: View) {
        var intent = Intent(this@MainActivity, ConstraintLayoutSampleActivity::class.java)
        intent.putExtra(ConstraintLayoutSampleActivity.BUNDLE_LAYOUT, R.layout.activity_relative_child)
        startActivity(intent)
    }
}