package com.artikov.modul_5_lesson_7_ums_real

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.navigation.Navigation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

    }

    override fun onSupportNavigateUp(): Boolean {
        return Navigation.findNavController(this,R.id.my_nav_host_fragment).navigateUp()
    }

}