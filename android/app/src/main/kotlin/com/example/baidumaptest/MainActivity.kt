package com.example.baidumaptest

import android.os.Bundle

import io.flutter.app.FlutterActivity
import io.flutter.plugins.GeneratedPluginRegistrant
import com.baidu.mapapi.map.MapView



class MainActivity: FlutterActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val mapView = MapView(this)
//    GeneratedPluginRegistrant.registerWith(this)
    MapRegistrant.registerWith(this, mapView);
  }
}
