(ns com.amazonaws.RequestConfig
  "Generic representation of request level configuration. The customer interface for specifying
  request level configuration is a base request class with configuration methods."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws RequestConfig]))

(defn ->request-config
  "Constructor."
  (^RequestConfig []
    (new RequestConfig )))

(def *-no-op
  "Static Constant.

  No op implementation to initalize request config in DefaultRequest.

  type: com.amazonaws.RequestConfig"
  RequestConfig/NO_OP)

(defn get-progress-listener
  "returns: `com.amazonaws.event.ProgressListener`"
  (^com.amazonaws.event.ProgressListener [^RequestConfig this]
    (-> this (.getProgressListener))))

(defn get-request-timeout
  "returns: `java.lang.Integer`"
  (^java.lang.Integer [^RequestConfig this]
    (-> this (.getRequestTimeout))))

(defn get-custom-query-parameters
  "returns: A non null map of custom query parameters to inject into the request. - `java.util.Map<java.lang.String,java.util.List<java.lang.String>>`"
  (^java.util.Map [^RequestConfig this]
    (-> this (.getCustomQueryParameters))))

(defn get-credentials-provider
  "returns: `com.amazonaws.auth.AWSCredentialsProvider`"
  (^com.amazonaws.auth.AWSCredentialsProvider [^RequestConfig this]
    (-> this (.getCredentialsProvider))))

(defn get-original-request
  "returns: The original request object. May be delivered to various strategies or hooks for
   extra context. I.E. RequestHandler2 or RetryPolicy. - `java.lang.Object`"
  (^java.lang.Object [^RequestConfig this]
    (-> this (.getOriginalRequest))))

(defn get-client-execution-timeout
  "returns: `java.lang.Integer`"
  (^java.lang.Integer [^RequestConfig this]
    (-> this (.getClientExecutionTimeout))))

(defn get-request-type
  "returns: String identifying the 'type' (i.e. operation) of the request. Used in metrics
   subsystem. - `java.lang.String`"
  (^java.lang.String [^RequestConfig this]
    (-> this (.getRequestType))))

(defn get-custom-request-headers
  "returns: A non null map of custom headers to inject into the request. - `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^RequestConfig this]
    (-> this (.getCustomRequestHeaders))))

(defn get-request-client-options
  "returns: `com.amazonaws.RequestClientOptions`"
  (^com.amazonaws.RequestClientOptions [^RequestConfig this]
    (-> this (.getRequestClientOptions))))

(defn get-request-metrics-collector
  "returns: `com.amazonaws.metrics.RequestMetricCollector`"
  (^com.amazonaws.metrics.RequestMetricCollector [^RequestConfig this]
    (-> this (.getRequestMetricsCollector))))

