package com.cypressworks.proguardissue

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        View(this).holder(::Holder)
    }

    class Holder(val v: View)
}