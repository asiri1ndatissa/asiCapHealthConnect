package com.asi.healthconnect

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import androidx.health.connect.client.HealthConnectClient
import com.getcapacitor.JSObject
import com.getcapacitor.Plugin
import com.getcapacitor.PluginCall
import com.getcapacitor.PluginMethod
import com.getcapacitor.annotation.CapacitorPlugin

@CapacitorPlugin(name = "HealthConnect")
class HealthConnectPlugin : Plugin() {

    @PluginMethod
    fun isAvailable(call: PluginCall) {
        val result = JSObject()

        try {
            // Health Connect is only available on Android 9+ (API 28+)
            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.P) {
                result.put("available", false)
                call.resolve(result)
                return
            }

            // Check if Health Connect is available using the SDK
            val availability = HealthConnectClient.getSdkStatus(context)
            val isAvailable = availability == HealthConnectClient.SDK_AVAILABLE

            result.put("available", isAvailable)
            call.resolve(result)
        } catch (e: Exception) {
            // If Health Connect SDK is not available or any other error occurs
            result.put("available", false)
            call.resolve(result)
        }
    }
}
