(ns com.amazonaws.http.ExecutionContext$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.http ExecutionContext$Builder]))

(defn set-signer-provider
  "signer-provider - `com.amazonaws.internal.auth.SignerProvider`"
  ([^ExecutionContext$Builder this ^com.amazonaws.internal.auth.SignerProvider signer-provider]
    (-> this (.setSignerProvider signer-provider))))

(defn get-aws-client
  "returns: `com.amazonaws.AmazonWebServiceClient`"
  (^com.amazonaws.AmazonWebServiceClient [^ExecutionContext$Builder this]
    (-> this (.getAwsClient))))

(defn get-request-handler-2s
  "returns: `java.util.List<com.amazonaws.handlers.RequestHandler2>`"
  (^java.util.List [^ExecutionContext$Builder this]
    (-> this (.getRequestHandler2s))))

(defn set-use-request-metrics
  "use-request-metrics - `boolean`"
  ([^ExecutionContext$Builder this ^Boolean use-request-metrics]
    (-> this (.setUseRequestMetrics use-request-metrics))))

(defn with-request-handler-2s
  "request-handler-2s - `java.util.List`

  returns: `com.amazonaws.http.ExecutionContext$Builder`"
  (^com.amazonaws.http.ExecutionContext$Builder [^ExecutionContext$Builder this ^java.util.List request-handler-2s]
    (-> this (.withRequestHandler2s request-handler-2s))))

(defn with-use-request-metrics
  "with-use-request-metrics - `boolean`

  returns: `com.amazonaws.http.ExecutionContext$Builder`"
  (^com.amazonaws.http.ExecutionContext$Builder [^ExecutionContext$Builder this ^Boolean with-use-request-metrics]
    (-> this (.withUseRequestMetrics with-use-request-metrics))))

(defn build
  "returns: `com.amazonaws.http.ExecutionContext`"
  (^com.amazonaws.http.ExecutionContext [^ExecutionContext$Builder this]
    (-> this (.build))))

(defn get-signer-provider
  "returns: `com.amazonaws.internal.auth.SignerProvider`"
  (^com.amazonaws.internal.auth.SignerProvider [^ExecutionContext$Builder this]
    (-> this (.getSignerProvider))))

(defn use-request-metrics
  "returns: `boolean`"
  (^Boolean [^ExecutionContext$Builder this]
    (-> this (.useRequestMetrics))))

(defn with-aws-client
  "aws-client - `com.amazonaws.AmazonWebServiceClient`

  returns: `com.amazonaws.http.ExecutionContext$Builder`"
  (^com.amazonaws.http.ExecutionContext$Builder [^ExecutionContext$Builder this ^com.amazonaws.AmazonWebServiceClient aws-client]
    (-> this (.withAwsClient aws-client))))

(defn set-aws-client
  "aws-client - `com.amazonaws.AmazonWebServiceClient`"
  ([^ExecutionContext$Builder this ^com.amazonaws.AmazonWebServiceClient aws-client]
    (-> this (.setAwsClient aws-client))))

(defn set-request-handler-2s
  "request-handler-2s - `java.util.List`"
  ([^ExecutionContext$Builder this ^java.util.List request-handler-2s]
    (-> this (.setRequestHandler2s request-handler-2s))))

(defn with-signer-provider
  "signer-provider - `com.amazonaws.internal.auth.SignerProvider`

  returns: `com.amazonaws.http.ExecutionContext$Builder`"
  (^com.amazonaws.http.ExecutionContext$Builder [^ExecutionContext$Builder this ^com.amazonaws.internal.auth.SignerProvider signer-provider]
    (-> this (.withSignerProvider signer-provider))))

