(ns com.amazonaws.http.AmazonHttpClient$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.http AmazonHttpClient$Builder]))

(defn client-configuration
  "client-config - `com.amazonaws.ClientConfiguration`

  returns: `com.amazonaws.http.AmazonHttpClient$Builder`"
  (^com.amazonaws.http.AmazonHttpClient$Builder [^AmazonHttpClient$Builder this ^com.amazonaws.ClientConfiguration client-config]
    (-> this (.clientConfiguration client-config))))

(defn retry-policy
  "retry-policy - `com.amazonaws.retry.v2.RetryPolicy`

  returns: `com.amazonaws.http.AmazonHttpClient$Builder`"
  (^com.amazonaws.http.AmazonHttpClient$Builder [^AmazonHttpClient$Builder this ^com.amazonaws.retry.v2.RetryPolicy retry-policy]
    (-> this (.retryPolicy retry-policy))))

(defn request-metric-collector
  "request-metric-collector - `com.amazonaws.metrics.RequestMetricCollector`

  returns: `com.amazonaws.http.AmazonHttpClient$Builder`"
  (^com.amazonaws.http.AmazonHttpClient$Builder [^AmazonHttpClient$Builder this ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (-> this (.requestMetricCollector request-metric-collector))))

(defn use-browser-compatible-host-name-verifier
  "use-browser-compatible-host-name-verifier - `boolean`

  returns: `com.amazonaws.http.AmazonHttpClient$Builder`"
  (^com.amazonaws.http.AmazonHttpClient$Builder [^AmazonHttpClient$Builder this ^Boolean use-browser-compatible-host-name-verifier]
    (-> this (.useBrowserCompatibleHostNameVerifier use-browser-compatible-host-name-verifier))))

(defn calculate-crc-32-from-compressed-data
  "calculate-crc-32-from-compressed-data - `boolean`

  returns: `com.amazonaws.http.AmazonHttpClient$Builder`"
  (^com.amazonaws.http.AmazonHttpClient$Builder [^AmazonHttpClient$Builder this ^Boolean calculate-crc-32-from-compressed-data]
    (-> this (.calculateCRC32FromCompressedData calculate-crc-32-from-compressed-data))))

(defn build
  "returns: `com.amazonaws.http.AmazonHttpClient`"
  (^com.amazonaws.http.AmazonHttpClient [^AmazonHttpClient$Builder this]
    (-> this (.build))))

