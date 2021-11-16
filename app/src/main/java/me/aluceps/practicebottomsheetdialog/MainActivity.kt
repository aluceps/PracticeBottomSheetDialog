package me.aluceps.practicebottomsheetdialog

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import me.aluceps.practicebottomsheetdialog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.button.setOnClickListener {
        }
    }
}