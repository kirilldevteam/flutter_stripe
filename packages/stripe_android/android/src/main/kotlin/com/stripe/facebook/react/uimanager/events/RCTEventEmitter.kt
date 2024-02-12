package com.stripe.facebook.react.uimanager.events

import com.stripe.facebook.react.bridge.WritableMap
import io.flutter.plugin.common.MethodChannel

class RCTEventEmitter(private val channel: MethodChannel) {

    fun receiveEvent(viewTag: Any, eventName: String, serializeEventData: WritableMap?) {
        channel.invokeMethod(eventName, serializeEventData)
    }
}
