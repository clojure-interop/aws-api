(ns com.amazonaws.internal.DateTimeJsonSerializer
  "A Jackson serializer for Joda DateTimes."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.internal DateTimeJsonSerializer]))

(defn ->date-time-json-serializer
  "Constructor."
  (^DateTimeJsonSerializer []
    (new DateTimeJsonSerializer )))

(defn serialize
  "value - `org.joda.time.DateTime`
  jgen - `com.fasterxml.jackson.core.JsonGenerator`
  provider - `com.fasterxml.jackson.databind.SerializerProvider`

  throws: java.io.IOException"
  ([^DateTimeJsonSerializer this ^org.joda.time.DateTime value ^com.fasterxml.jackson.core.JsonGenerator jgen ^com.fasterxml.jackson.databind.SerializerProvider provider]
    (-> this (.serialize value jgen provider))))

