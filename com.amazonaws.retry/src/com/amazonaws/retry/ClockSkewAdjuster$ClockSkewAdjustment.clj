(ns com.amazonaws.retry.ClockSkewAdjuster$ClockSkewAdjustment
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.retry ClockSkewAdjuster$ClockSkewAdjustment]))

(defn should-adjust-for-skew?
  "returns: `boolean`"
  (^Boolean [^ClockSkewAdjuster$ClockSkewAdjustment this]
    (-> this (.shouldAdjustForSkew))))

(defn in-seconds
  "returns: `int`"
  (^Integer [^ClockSkewAdjuster$ClockSkewAdjustment this]
    (-> this (.inSeconds))))

