(ns com.amazonaws.client.AwsSyncClientParams
  "Provides access to all params needed in a synchronous AWS service client constructor. Abstract
  to allow additions to the params while maintaining backwards compatibility."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.client AwsSyncClientParams]))

(defn ->aws-sync-client-params
  "Constructor."
  (^AwsSyncClientParams []
    (new AwsSyncClientParams )))

(defn get-advanced-config
  "returns: `com.amazonaws.client.builder.AdvancedConfig`"
  (^com.amazonaws.client.builder.AdvancedConfig [^AwsSyncClientParams this]
    (-> this (.getAdvancedConfig))))

(defn get-credentials-provider
  "returns: `com.amazonaws.auth.AWSCredentialsProvider`"
  (^com.amazonaws.auth.AWSCredentialsProvider [^AwsSyncClientParams this]
    (-> this (.getCredentialsProvider))))

(defn get-client-configuration
  "returns: `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration [^AwsSyncClientParams this]
    (-> this (.getClientConfiguration))))

(defn get-request-metric-collector
  "returns: `com.amazonaws.metrics.RequestMetricCollector`"
  (^com.amazonaws.metrics.RequestMetricCollector [^AwsSyncClientParams this]
    (-> this (.getRequestMetricCollector))))

(defn get-signer-provider
  "returns: `com.amazonaws.internal.auth.SignerProvider`"
  (^com.amazonaws.internal.auth.SignerProvider [^AwsSyncClientParams this]
    (-> this (.getSignerProvider))))

(defn get-endpoint
  "returns: `java.net.URI`"
  (^java.net.URI [^AwsSyncClientParams this]
    (-> this (.getEndpoint))))

(defn get-monitoring-listener
  "returns: `com.amazonaws.monitoring.MonitoringListener`"
  (^com.amazonaws.monitoring.MonitoringListener [^AwsSyncClientParams this]
    (-> this (.getMonitoringListener))))

(defn get-retry-policy
  "returns: `com.amazonaws.retry.v2.RetryPolicy`"
  (^com.amazonaws.retry.v2.RetryPolicy [^AwsSyncClientParams this]
    (-> this (.getRetryPolicy))))

(defn get-client-side-monitoring-configuration-provider
  "returns: `com.amazonaws.monitoring.CsmConfigurationProvider`"
  (^com.amazonaws.monitoring.CsmConfigurationProvider [^AwsSyncClientParams this]
    (-> this (.getClientSideMonitoringConfigurationProvider))))

(defn get-request-handlers
  "returns: `java.util.List<com.amazonaws.handlers.RequestHandler2>`"
  (^java.util.List [^AwsSyncClientParams this]
    (-> this (.getRequestHandlers))))

