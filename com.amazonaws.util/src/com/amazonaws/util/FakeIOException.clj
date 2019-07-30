(ns com.amazonaws.util.FakeIOException
  "Used for simulating an IOException for test purposes."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.util FakeIOException]))

(defn ->fake-io-exception
  "Constructor.

  message - `java.lang.String`"
  (^FakeIOException [^java.lang.String message]
    (new FakeIOException message)))

