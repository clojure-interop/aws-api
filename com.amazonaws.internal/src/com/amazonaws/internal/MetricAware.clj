(ns com.amazonaws.internal.MetricAware
  "Used to check if any metrics gathering activity is already turned on in one
  of the underlying wrapped objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.internal MetricAware]))

(defn metric-activated?
  "Returns true if this object or one of it's inner wrapped objects has
   metrics gathering activity turned on; false otherwise.

  returns: `boolean`"
  (^Boolean [^MetricAware this]
    (-> this (.isMetricActivated))))

