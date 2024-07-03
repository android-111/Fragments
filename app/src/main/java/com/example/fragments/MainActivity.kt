package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.fragments.databinding.ActivityMainBinding
import com.example.fragments.fragments.BlankFragment1
import com.example.fragments.fragments.BlankFragment2
import com.example.fragments.fragments.BlankFragment3

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val manager = supportFragmentManager.beginTransaction()
        manager.replace(R.id.frame,BlankFragment1())
        manager.commit()

        binding.button1.setOnClickListener {
            val manager1 = supportFragmentManager.beginTransaction()
            manager1.replace(R.id.frame,BlankFragment1())
            manager1.commit()
        }

        binding.button2.setOnClickListener{
            val manager2 = supportFragmentManager.beginTransaction()
            manager2.replace(R.id.frame, BlankFragment2())
            manager2.commit()
        }

        binding.button3.setOnClickListener {
            val manger3 = supportFragmentManager.beginTransaction()
            manger3.replace(R.id.frame,BlankFragment3())
            manger3.commit()
        }
    }
}