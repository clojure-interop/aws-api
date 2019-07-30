(ns com.amazonaws.internal.AmazonWebServiceRequestAdapter
  "Adapts the configuration present in AmazonWebServiceRequest to RequestConfig."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.internal AmazonWebServiceRequestAdapter]))

(defn ->amazon-web-service-request-adapter
  "Constructor.

  request - `com.amazonaws.AmazonWebServiceRequest`"
  (^AmazonWebServiceRequestAdapter [^com.amazonaws.AmazonWebServiceRequest request]
    (new AmazonWebServiceRequestAdapter request)))

(defn get-progress-listener
  "returns: `com.amazonaws.event.ProgressListener`"
  (^com.amazonaws.event.ProgressListener [^AmazonWebServiceRequestAdapter this]
    (-> this (.getProgressListener))))

(defn get-request-timeout
  "returns: `java.lang.Integer`"
  (^java.lang.Integer [^AmazonWebServiceRequestAdapter this]
    (-> this (.getRequestTimeout))))

(defn get-custom-query-parameters
  "returns: A non null map of custom query parameters to inject into the request. - `java.util.Map<java.lang.String,java.util.List<java.lang.String>>`"
  (^java.util.Map [^AmazonWebServiceRequestAdapter this]
    (-> this (.getCustomQueryParameters))))

(defn get-credentials-provider
  "returns: `com.amazonaws.auth.AWSCredentialsProvider`"
  (^com.amazonaws.auth.AWSCredentialsProvider [^AmazonWebServiceRequestAdapter this]
    (-> this (.getCredentialsProvider))))

(defn get-original-request
  "returns: The original request object. May be delivered to various strategies or hooks for
   extra context. I.E. RequestHandler2 or RetryPolicy. - `java.lang.Object`"
  (^java.lang.Object [^AmazonWebServiceRequestAdapter this]
    (-> this (.getOriginalRequest))))

(defn get-client-execution-timeout
  "returns: `java.lang.Integer`"
  (^java.lang.Integer [^AmazonWebServiceRequestAdapter this]
    (-> this (.getClientExecutionTimeout))))

(defn get-request-type
  "returns: String identifying the 'type' (i.e. operation) of the request. Used in metrics
   subsystem. - `java.lang.String`"
  (^java.lang.String [^AmazonWebServiceRequestAdapter this]
    (-> this (.getRequestType))))

(defn get-custom-request-headers
  "returns: A non null map of custom headers to inject into the request. - `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^AmazonWebServiceRequestAdapter this]
    (-> this (.getCustomRequestHeaders))))

(defn get-request-client-options
  "returns: `com.amazonaws.RequestClientOptions`"
  (^com.amazonaws.RequestClientOptions [^AmazonWebServiceRequestAdapter this]
    (-> this (.getRequestClientOptions))))

(defn get-request-metrics-collector
  "returns: `com.amazonaws.metrics.RequestMetricCollector`"
  (^com.amazonaws.metrics.RequestMetricCollector [^AmazonWebServiceRequestAdapter this]
    (-> this (.getRequestMetricsCollector))))

