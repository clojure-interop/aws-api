(ns com.amazonaws.metrics.SimpleMetricType
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.metrics SimpleMetricType]))

(defn ->simple-metric-type
  "Constructor."
  (^SimpleMetricType []
    (new SimpleMetricType )))

(defn name
  "Description copied from interface: MetricType

  returns: `java.lang.String`"
  (^java.lang.String [^SimpleMetricType this]
    (-> this (.name))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SimpleMetricType this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SimpleMetricType this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SimpleMetricType this]
    (-> this (.toString))))

