(ns com.amazonaws.metrics.MetricType
  "Metric type."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.metrics MetricType]))

(defn name
  "Non-null name of the metric type. Used to uniquely identify the metric
   type. Therefore, the name returned must be globally unique across all
   metric types that implement this interface.

  returns: `java.lang.String`"
  (^java.lang.String [^MetricType this]
    (-> this (.name))))

