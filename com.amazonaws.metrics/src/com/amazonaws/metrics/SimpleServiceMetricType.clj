(ns com.amazonaws.metrics.SimpleServiceMetricType
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.metrics SimpleServiceMetricType]))

(defn ->simple-service-metric-type
  "Constructor.

  name - `java.lang.String`
  service-name - `java.lang.String`"
  (^SimpleServiceMetricType [^java.lang.String name ^java.lang.String service-name]
    (new SimpleServiceMetricType name service-name)))

(defn name
  "Description copied from interface: MetricType

  returns: `java.lang.String`"
  (^java.lang.String [^SimpleServiceMetricType this]
    (-> this (.name))))

(defn get-service-name
  "returns: `java.lang.String`"
  (^java.lang.String [^SimpleServiceMetricType this]
    (-> this (.getServiceName))))

