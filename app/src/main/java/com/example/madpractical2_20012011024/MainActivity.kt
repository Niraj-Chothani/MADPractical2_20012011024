package com.example.madpractical2_20012011024

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    val TAG="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("onCreate: Function Called")
    }

    fun showMessage(msg:String){
        Log.i(TAG,msg)
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
        Snackbar.make(findViewById(R.id.mymsg),msg,Snackbar.LENGTH_LONG).show()
    }

    override fun onStart() {
        showMessage("onStart: Function Called")
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
        showMessage("onResume: Function Called")

    }

    override fun onRestart() {
        super.onRestart()
        showMessage("onRestart: Function Called")
    }

    override fun onPause() {
        super.onPause()
        showMessage("onPause: Function Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        showMessage("onDestroy: Function Called")
    }

    override fun onStop() {
        super.onStop()
        showMessage("onStop: Function Called")
    }
}