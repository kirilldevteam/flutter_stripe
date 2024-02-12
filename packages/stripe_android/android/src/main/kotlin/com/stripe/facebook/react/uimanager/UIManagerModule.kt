package com.stripe.facebook.react.uimanager

import com.stripe.facebook.react.uimanager.events.Event
import com.stripe.facebook.react.uimanager.events.EventDispatcher
import com.stripe.facebook.react.uimanager.events.RCTEventEmitter
import io.flutter.plugin.common.MethodChannel

class UIManagerModule(channel: MethodChannel) {

    private val rctInstance: RCTEventEmitter = RCTEventEmitter(channel)

    val eventDispatcher: EventDispatcher = object : EventDispatcher {
        override fun dispatchEvent(event: Event<*>) {
            event.dispatch(rctInstance)
        }
    }
}