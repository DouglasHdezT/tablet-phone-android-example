package com.deushdezt.phonetablet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.deushdezt.phonetablet.fragments.MessageFragment

class MessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame_message, MessageFragment())
            .addToBackStack(null)
            .commit()
    }
}