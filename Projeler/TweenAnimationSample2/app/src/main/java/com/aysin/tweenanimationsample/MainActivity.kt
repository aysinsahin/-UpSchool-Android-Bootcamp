package com.aysin.tweenanimationsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var ımageView: ImageView

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ımageView = findViewById(R.id.imageView2)
        button = findViewById(R.id.button)
        var anim = AnimationUtils.loadAnimation(this, R.anim.tweenanimation)

        button.setOnClickListener{
            imageView2.startAnimation(anim)

        }
    }
}
