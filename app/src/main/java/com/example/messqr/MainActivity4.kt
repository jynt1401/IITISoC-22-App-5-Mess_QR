package com.example.messqr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton



class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        //handle click special meal button
        val button4:Button=findViewById(R.id.button4)
        button4.setOnClickListener {
            Intent(this,MainActivity8::class.java).also{
                startActivity(it)
            }
        }

        //handle click announcement Image button
        val announceImageButtonButton:ImageButton =  findViewById(R.id.announce_Ibutton)
        announceImageButtonButton.setOnClickListener {
            Intent(this,MainActivity9::class.java).also{
                startActivity(it)
            }
        }

        //handle click payment Image button
        val paymentImageButton:ImageButton =  findViewById(R.id.payment_Ibutton)
        paymentImageButton.setOnClickListener {
            Intent(this,MainActivity5::class.java).also{
                startActivity(it)
            }
        }

        //handle click history Image button
        val historyImageButton:ImageButton =  findViewById(R.id.history_Ibutton)
        historyImageButton.setOnClickListener {
            Intent(this,MainActivity10::class.java).also{
                startActivity(it)
            }
        }

        //this is only for reference that how it will work
//        val button6:Button=findViewById(R.id.button6)
//        button6.setOnClickListener {
//            val intent2=Intent(this, MainActivity10::class.java)
//            startActivity(intent2)
//        }

        //rupee navigate button
//        val rupeeBtn:ImageButton=findViewById(R.id.imageButton9)
//        rupeeBtn.setOnClickListener {
//            val intent3=Intent(this, MainActivity5::class.java)
//            startActivity(intent3)
//        }

    }
}