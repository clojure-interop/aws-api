(ns com.amazonaws.metrics.ServiceMetricType
  "Service specific Metric type (eg S3, DynamoDB, etc.)"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.metrics ServiceMetricType]))

(defn get-service-name
  "returns: `java.lang.String`"
  (^java.lang.String [^ServiceMetricType this]
    (-> this (.getServiceName))))

