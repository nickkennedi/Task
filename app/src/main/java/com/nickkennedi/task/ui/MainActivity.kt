package com.nickkennedi.task.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import com.nickkennedi.task.R
import com.nickkennedi.task.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*supportFragmentManager.findFragmentById(binding.navHostFragment.id) as NavHostFragment*/
        supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment

    }

}