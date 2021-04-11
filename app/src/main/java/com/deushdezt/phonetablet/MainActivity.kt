package com.deushdezt.phonetablet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.deushdezt.phonetablet.fragments.MenuFragment
import com.deushdezt.phonetablet.fragments.MessageFragment
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(), MenuFragment.OnClickHandler {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val menuFragment = MenuFragment()

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame_menu, menuFragment)
            .addToBackStack(null)
            .commit()
    }

    override fun onClickShowBtn() {
        val isTablet = resources.getBoolean(R.bool.isTablet)

        if(isTablet){
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.frame_message, MessageFragment())
                .addToBackStack(null)
                .commit()
        }else {
            val intent = Intent(this, MessageActivity::class.java)
            startActivity(intent)
        }
    }
}