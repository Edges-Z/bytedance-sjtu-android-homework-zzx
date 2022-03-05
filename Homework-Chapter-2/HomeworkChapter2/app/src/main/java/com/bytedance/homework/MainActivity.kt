package com.bytedance.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import com.bytedance.homework.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.block_1).setOnClickListener(){
            val intent = Intent()
            intent.setClass(this, Problem_1_Activity::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.block_2).setOnClickListener(){
            val intent = Intent()
            intent.setClass(this, Problem_2_Activity::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.block_3).setOnClickListener(){
            val intent = Intent()
            intent.setClass(this, Problem_3_Activity::class.java)
            startActivity(intent)
        }
    }
}