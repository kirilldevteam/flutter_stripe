package com.reactnativestripesdk
import com.stripe.facebook.react.bridge.Arguments
import com.stripe.facebook.react.bridge.WritableMap
import com.stripe.facebook.react.uimanager.events.Event
import com.stripe.facebook.react.uimanager.events.RCTEventEmitter

internal class FormCompleteEvent constructor(viewTag: Int, private val formDetails: MutableMap<String, Any>) : Event<FormCompleteEvent>(viewTag) {
  override fun getEventName(): String {
    return EVENT_NAME
  }

  override fun dispatch(rctEventEmitter: RCTEventEmitter) {
    rctEventEmitter.receiveEvent(viewTag, eventName, serializeEventData())
  }

  private fun serializeEventData(): WritableMap {
    val eventData = Arguments.createMap()
    eventData.putString("accountNumber", formDetails["accountNumber"].toString())
    eventData.putString("bsbNumber", formDetails["bsbNumber"].toString())
    eventData.putString("email", formDetails["email"].toString())
    eventData.putString("name", formDetails["name"].toString())

    return eventData
  }

  companion object {
    const val EVENT_NAME = "onCompleteAction"
  }
}
