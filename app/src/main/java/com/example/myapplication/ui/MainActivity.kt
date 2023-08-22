package com.example.myapplication.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import com.airbnb.lottie.LottieAnimationView
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initviews()

    }

    private fun initviews() {
        val imageview = findViewById<ImageView>(R.id.iv_jpg)
        val anim = findViewById<ImageView>(R.id.la_anim1)
        val zoomB = findViewById<Button>(R.id.bt_zoom)
        val rotateB = findViewById<Button>(R.id.bt_rotate)
        val fadeB = findViewById<Button>(R.id.bt_fade)
        val blinkB = findViewById<Button>(R.id.bt_blink)
        val moveB = findViewById<Button>(R.id.bt_move)
        val slideB = findViewById<Button>(R.id.bt_slide)
        val bounceB = findViewById<Button>(R.id.bt_bounce)
        val sequenB = findViewById<Button>(R.id.bt_sequential)
        val togatherB = findViewById<Button>(R.id.bt_togather)

        val lavLoading = findViewById<LottieAnimationView>(R.id.la_anim1)
        val play = findViewById<Button>(R.id.bt_play)
        val pausa = findViewById<Button>(R.id.bt_pause)
        val nextAnim = findViewById<Button>(R.id.bt_nextanim)
        val prevAnim = findViewById<Button>(R.id.bt_prevanim)

        zoomB.setOnClickListener {
            val zoomIn = AnimationUtils.loadAnimation(this, R.anim.anim_zoom_in)
            imageview.startAnimation(zoomIn)
        }

        rotateB.setOnClickListener {
            val rotateIn = AnimationUtils.loadAnimation(this, R.anim.anim_rotate_in)
            imageview.startAnimation(rotateIn)
        }

        fadeB.setOnClickListener {
            val fadeIn = AnimationUtils.loadAnimation(this, R.anim.anim_fade_in)
            imageview.startAnimation(fadeIn)
        }

        blinkB.setOnClickListener {
            val blinkIn = AnimationUtils.loadAnimation(this, R.anim.anim_blink_in)
            imageview.startAnimation(blinkIn)
        }

        moveB.setOnClickListener {
            val moveIn = AnimationUtils.loadAnimation(this, R.anim.anim_move_in)
            imageview.startAnimation(moveIn)
        }

        slideB.setOnClickListener {
            val slideIn = AnimationUtils.loadAnimation(this, R.anim.anim_slide_in)
            imageview.startAnimation(slideIn)
        }

        bounceB.setOnClickListener{
            val bounceIn = AnimationUtils.loadAnimation(this, R.anim.anim_bounce_in)
        }

        sequenB.setOnClickListener{
            val sequntialIn = AnimationUtils.loadAnimation(this, R.anim.anim_sequential_in)
        }

        togatherB.setOnClickListener{
            val togatherB = AnimationUtils.loadAnimation(this, R.anim.anim_togather_in)
        }

        pausa.setOnClickListener {
            lavLoading.pauseAnimation()
        }

        play.setOnClickListener {
            lavLoading.playAnimation()
        }

        nextAnim.setOnClickListener {
            lavLoading.setAnimation("loading2.json")
            lavLoading.playAnimation()
        }

        prevAnim.setOnClickListener {
            lavLoading.setAnimation("loading.json")
            lavLoading.playAnimation()
        }

    }
}