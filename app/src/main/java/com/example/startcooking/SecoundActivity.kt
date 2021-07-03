package com.example.startcooking

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import eightbitlab.com.blurview.BlurView
import eightbitlab.com.blurview.RenderScriptBlur


class SecoundActivity : AppCompatActivity() {
    lateinit var blurView: BlurView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secound)

        blurView = findViewById(R.id.blurView)
        blurBackground()
    }

    private fun blurBackground() {
        val radius = 3f
        val decorView: View = window.decorView
        val windowBackground: Drawable = decorView.getBackground()

        blurView.setupWith(decorView.findViewById(android.R.id.content))
            .setFrameClearDrawable(windowBackground)
            .setBlurAlgorithm(RenderScriptBlur(this))
            .setBlurRadius(radius)
            .setBlurAutoUpdate(true)
            .setHasFixedTransformationMatrix(true)
    }


}