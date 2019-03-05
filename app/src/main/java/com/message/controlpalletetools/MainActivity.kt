package com.message.controlpalletetools

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.text="1"
        exit.setOnClickListener(){

            finishAffinity()
        }
        increase.setOnClickListener(){
            addNumber()
        }
        decrease.setOnClickListener(){
            reduceNumber()


        }
    }
    fun addNumber(){
        if(textView.text =="7"){

            Toast.makeText(this,"The number has reached 7",Toast.LENGTH_SHORT).show()
            textView.visibility=View.GONE
        }
         else{
            textView.visibility=View.VISIBLE
        val getNumber=textView.text.toString()
        val addResults:Int=getNumber.toInt()+1
        textView.text=addResults.toString()
        }
    }
    fun reduceNumber(){
        if(textView.text == "0"){
            Toast.makeText(this,  "The number has reached zero",Toast.LENGTH_SHORT).show()
            textView.visibility=View.GONE
        }
          else{
            textView.visibility=View.VISIBLE
            val reduceNumber =textView.text.toString()
            val reduced:Int =reduceNumber.toInt()-1
            textView.text=reduced.toString()

        }


    }

}
