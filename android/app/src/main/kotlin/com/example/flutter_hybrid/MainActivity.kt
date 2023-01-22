package com.example.flutter_hybrid

import io.flutter.embedding.android.FlutterActivity

import androidx.annotation.NonNull
import io.flutter.embedding.engine.FlutterEngine

class MainActivity: FlutterActivity() {
    @Override
    override fun configureFlutterEngine(@NonNull flutterEngine: FlutterEngine) {
        flutterEngine
            .platformViewsController
            .registry
            .registerViewFactory("hybrid-view-type", NativeViewFactory())
    }
}
