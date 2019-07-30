(ns com.amazonaws.http.ExecutionContext
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.http ExecutionContext]))

(defn ->execution-context
  "Constructor.

  Deprecated.

  request-handler-2s - `java.util.List`
  is-metric-enabled - `boolean`
  aws-client - `com.amazonaws.AmazonWebServiceClient`"
  (^ExecutionContext [^java.util.List request-handler-2s ^Boolean is-metric-enabled ^com.amazonaws.AmazonWebServiceClient aws-client]
    (new ExecutionContext request-handler-2s is-metric-enabled aws-client))
  (^ExecutionContext [^Boolean is-metric-enabled]
    (new ExecutionContext is-metric-enabled))
  (^ExecutionContext []
    (new ExecutionContext )))

(defn *builder
  "returns: `com.amazonaws.http.ExecutionContext$Builder`"
  (^com.amazonaws.http.ExecutionContext$Builder []
    (ExecutionContext/builder )))

(defn set-signer
  "Deprecated.

  signer - `com.amazonaws.auth.Signer`"
  ([^ExecutionContext this ^com.amazonaws.auth.Signer signer]
    (-> this (.setSigner signer))))

(defn get-client-execution-tracker-task
  "returns: `com.amazonaws.http.timers.client.ClientExecutionAbortTrackerTask`"
  (^com.amazonaws.http.timers.client.ClientExecutionAbortTrackerTask [^ExecutionContext this]
    (-> this (.getClientExecutionTrackerTask))))

(defn retry-capacity-consumed
  "Returns whether retry capacity was consumed during this request lifecycle.
   This can be inspected to determine whether capacity should be released if a retry succeeds.

  returns: true if retry capacity was consumed - `boolean`"
  (^Boolean [^ExecutionContext this]
    (-> this (.retryCapacityConsumed))))

(defn get-request-handler-2s
  "returns: `java.util.List<com.amazonaws.handlers.RequestHandler2>`"
  (^java.util.List [^ExecutionContext this]
    (-> this (.getRequestHandler2s))))

(defn get-credentials-provider
  "Returns the credentials provider used for fetching the credentials. The credentials fetched
   is used for signing the request. If there is no credential provider, then the runtime will
   not attempt to sign (or resign on retries) requests.

  returns: the credentials provider to fetch AWSCredentials - `com.amazonaws.auth.AWSCredentialsProvider`"
  (^com.amazonaws.auth.AWSCredentialsProvider [^ExecutionContext this]
    (-> this (.getCredentialsProvider))))

(defn set-auth-error-retry-strategy
  "Sets the optional auth error retry strategy for this request execution.

  auth-error-retry-strategy - `com.amazonaws.retry.internal.AuthErrorRetryStrategy`"
  ([^ExecutionContext this ^com.amazonaws.retry.internal.AuthErrorRetryStrategy auth-error-retry-strategy]
    (-> this (.setAuthErrorRetryStrategy auth-error-retry-strategy))))

(defn set-client-execution-tracker-task
  "client-execution-tracker-task - `com.amazonaws.http.timers.client.ClientExecutionAbortTrackerTask`"
  ([^ExecutionContext this ^com.amazonaws.http.timers.client.ClientExecutionAbortTrackerTask client-execution-tracker-task]
    (-> this (.setClientExecutionTrackerTask client-execution-tracker-task))))

(defn set-credentials-provider
  "Sets the credentials provider used for fetching the credentials. The credentials fetched is
   used for signing the request. If there is no credential provider, then the runtime will not
   attempt to sign (or resign on retries) requests.

  credentials-provider - the credentials provider to fetch AWSCredentials - `com.amazonaws.auth.AWSCredentialsProvider`"
  ([^ExecutionContext this ^com.amazonaws.auth.AWSCredentialsProvider credentials-provider]
    (-> this (.setCredentialsProvider credentials-provider))))

(defn get-signer
  "Passes in the provided SignerProviderContext into a SignerProvider and returns
   a Signer instance.

  context - `com.amazonaws.internal.auth.SignerProviderContext`

  returns: `com.amazonaws.auth.Signer`"
  (^com.amazonaws.auth.Signer [^ExecutionContext this ^com.amazonaws.internal.auth.SignerProviderContext context]
    (-> this (.getSigner context))))

(defn get-signer-by-uri
  "Deprecated.

  uri - `java.net.URI`

  returns: `com.amazonaws.auth.Signer`"
  (^com.amazonaws.auth.Signer [^ExecutionContext this ^java.net.URI uri]
    (-> this (.getSignerByURI uri))))

(defn get-auth-error-retry-strategy
  "Returns the retry strategy for auth errors. This is currently only used by the S3 client for
   auto-resolving sigv4-required regions.

   Note that this will be checked BEFORE the HTTP client consults the user-specified
   RetryPolicy. i.e. if the configured AuthErrorRetryStrategy says the request should be
   retried, the retry will be performed internally and the effect is transparent to the user's
   RetryPolicy.

  returns: `com.amazonaws.retry.internal.AuthErrorRetryStrategy`"
  (^com.amazonaws.retry.internal.AuthErrorRetryStrategy [^ExecutionContext this]
    (-> this (.getAuthErrorRetryStrategy))))

(defn mark-retry-capacity-consumed
  "Marks that a retry during this request lifecycle has consumed retry capacity.  This is inspected
   when determining if capacity should be released if a retry succeeds."
  ([^ExecutionContext this]
    (-> this (.markRetryCapacityConsumed))))

(defn get-aws-request-metrics
  "returns: `com.amazonaws.util.AWSRequestMetrics`"
  (^com.amazonaws.util.AWSRequestMetrics [^ExecutionContext this]
    (-> this (.getAwsRequestMetrics))))

