package com.stripe.facebook.react.bridge;

public interface ReadableMapKeySetIterator {

  boolean hasNextKey();

  String nextKey();
}