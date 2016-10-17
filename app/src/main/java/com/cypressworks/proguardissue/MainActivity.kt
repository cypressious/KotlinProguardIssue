package com.cypressworks.proguardissue

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import java.io.Serializable

class MainActivity : AppCompatActivity(), Mixin {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        foo()

        listOf<Station>().forEachIndexed { i, (id, name, distance) -> println("${id} ${distance}") }
    }

}

data class GeoLocation(val lat: Double, val lng: Double)

data class Station(
        val id: String?,
        val name: String,
        val distance: Int,
        val location: GeoLocation?) : Serializable