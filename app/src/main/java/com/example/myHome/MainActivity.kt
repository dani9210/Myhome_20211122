package com.example.myHome

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.myHome.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

        binding.btnLogin.setOnClickListener {


//            1. 입력한 id/pw 변수담자

            val inputEmail = binding.edtEmail.text.toString()
            val inputPassword = binding.edtPassword.text.toString()

//            2. 서버에 로그인 API 호출 -> Retrofit





        }

    }

    override fun setValues() {

    }
}