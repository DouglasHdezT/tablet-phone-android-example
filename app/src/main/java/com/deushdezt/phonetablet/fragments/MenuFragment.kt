package com.deushdezt.phonetablet.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.deushdezt.phonetablet.R
import java.lang.Exception

class MenuFragment: Fragment() {

    lateinit var tools: OnClickHandler

    override fun onAttach(context: Context) {
        super.onAttach(context)

        if(context is OnClickHandler){
            tools = context
        }else{
            throw Exception("Require an implementation of OnClickHandler")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_menu, container, false)

        view.findViewById<Button>(R.id.action_show).setOnClickListener {
            tools.onClickShowBtn()
        }

        return view;
    }

    interface OnClickHandler {
        fun onClickShowBtn()
    }

}