package com.example.intent_20211113

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_message.*

class ViewMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_message)

//        이 {}안에 바로 적는 일들은 -> 화면에 들어올 때 같이 실행하주는 일들.

//        1. 나한테 보내준 문구를 받아서 변수로 담아두자.
//        나한테 올때 사용한 intent를 이용하자 -> 거기에 첨부된 짐을 거내자.

        val sendMessage = intent.getStringExtra("message")

//        2. 메세지를 보여주는 텍스트뷰의 문구로 반영. set.
        txtMessage.text = sendMessage



    }
}