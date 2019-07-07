package com.hausberger.architectcomponents

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.hausberger.architectcomponents.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        //binding.name.text = "Dan Brown"
        //binding.email.text = "danbrown@gmail.com"
        binding.contact = Contact("Dan Brown", "danb@gmail.com")
        binding.handler = EventHandler(this)
    }
}
