package com.example.flutter_hybrid

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import androidx.annotation.Nullable
import io.flutter.plugin.platform.PlatformView


class NativeView(context: Context, id: Int,
                 @Nullable creationParams: Map<String?, Any?>?) : PlatformView {

    private val nativeView: View

    override fun getView(): View {
        return nativeView
    }

    override fun dispose() {}

    init {
        nativeView = LayoutInflater.from(context).inflate(R.layout.layout_native_view, null)
        setupViews(nativeView)
    }

    private fun setupViews(nativeView: View?) {

    }

}