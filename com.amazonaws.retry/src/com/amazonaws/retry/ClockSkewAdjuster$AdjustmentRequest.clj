(ns com.amazonaws.retry.ClockSkewAdjuster$AdjustmentRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.retry ClockSkewAdjuster$AdjustmentRequest]))

(defn ->adjustment-request
  "Constructor."
  (^ClockSkewAdjuster$AdjustmentRequest []
    (new ClockSkewAdjuster$AdjustmentRequest )))

(defn client-request
  "client-request - `com.amazonaws.Request`

  returns: `com.amazonaws.retry.ClockSkewAdjuster$AdjustmentRequest`"
  (^com.amazonaws.retry.ClockSkewAdjuster$AdjustmentRequest [^ClockSkewAdjuster$AdjustmentRequest this ^com.amazonaws.Request client-request]
    (-> this (.clientRequest client-request))))

(defn service-response
  "service-response - `org.apache.http.HttpResponse`

  returns: `com.amazonaws.retry.ClockSkewAdjuster$AdjustmentRequest`"
  (^com.amazonaws.retry.ClockSkewAdjuster$AdjustmentRequest [^ClockSkewAdjuster$AdjustmentRequest this ^org.apache.http.HttpResponse service-response]
    (-> this (.serviceResponse service-response))))

(defn exception
  "exception - `com.amazonaws.SdkBaseException`

  returns: `com.amazonaws.retry.ClockSkewAdjuster$AdjustmentRequest`"
  (^com.amazonaws.retry.ClockSkewAdjuster$AdjustmentRequest [^ClockSkewAdjuster$AdjustmentRequest this ^com.amazonaws.SdkBaseException exception]
    (-> this (.exception exception))))

(defn current-time
  "current-time - `long`

  returns: `com.amazonaws.retry.ClockSkewAdjuster$AdjustmentRequest`"
  (^com.amazonaws.retry.ClockSkewAdjuster$AdjustmentRequest [^ClockSkewAdjuster$AdjustmentRequest this ^Long current-time]
    (-> this (.currentTime current-time))))

