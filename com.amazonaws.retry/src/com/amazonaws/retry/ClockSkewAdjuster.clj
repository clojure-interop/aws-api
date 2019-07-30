(ns com.amazonaws.retry.ClockSkewAdjuster
  "Applies heuristics to suggest a clock skew adjustment that should be applied to future requests based on a given service error.

  This handles cases that are definitely clock skew errors (where RetryUtils.isClockSkewError(com.amazonaws.SdkBaseException) is true) as well as
  cases that may or may not be clock skew errors."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.retry ClockSkewAdjuster]))

(defn ->clock-skew-adjuster
  "Constructor."
  (^ClockSkewAdjuster []
    (new ClockSkewAdjuster )))

(defn get-adjustment
  "Recommend a ClockSkewAdjuster.ClockSkewAdjustment, based on the provided ClockSkewAdjuster.AdjustmentRequest.

  adjustment-request - `com.amazonaws.retry.ClockSkewAdjuster$AdjustmentRequest`

  returns: `com.amazonaws.retry.ClockSkewAdjuster$ClockSkewAdjustment`"
  (^com.amazonaws.retry.ClockSkewAdjuster$ClockSkewAdjustment [^ClockSkewAdjuster this ^com.amazonaws.retry.ClockSkewAdjuster$AdjustmentRequest adjustment-request]
    (-> this (.getAdjustment adjustment-request))))

