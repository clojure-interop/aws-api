(ns com.amazonaws.http.AmazonHttpClient
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.http AmazonHttpClient]))

(defn ->amazon-http-client
  "Constructor.

  Constructs a new AWS client using the specified client configuration options (ex: max retry
   attempts, proxy httpClientSettings, etc), and request metric collector.

  config - Configuration options specifying how this client will communicate with AWS (ex: proxy httpClientSettings, retry count, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - client specific request metric collector, which takes precedence over the one at the AWS SDK level; or null if there is none. - `com.amazonaws.metrics.RequestMetricCollector`
  use-browser-compatible-host-name-verifier - `boolean`
  calculate-crc-32-from-compressed-data - The flag indicating whether the CRC32 checksum is calculated from compressed data or not. It is only applicable when the header \"x-amz-crc32\" is set in the response. - `boolean`"
  (^AmazonHttpClient [^com.amazonaws.ClientConfiguration config ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector ^Boolean use-browser-compatible-host-name-verifier ^Boolean calculate-crc-32-from-compressed-data]
    (new AmazonHttpClient config request-metric-collector use-browser-compatible-host-name-verifier calculate-crc-32-from-compressed-data))
  (^AmazonHttpClient [^com.amazonaws.ClientConfiguration config ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector ^Boolean use-browser-compatible-host-name-verifier]
    (new AmazonHttpClient config request-metric-collector use-browser-compatible-host-name-verifier))
  (^AmazonHttpClient [^com.amazonaws.ClientConfiguration config ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AmazonHttpClient config request-metric-collector))
  (^AmazonHttpClient [^com.amazonaws.ClientConfiguration config]
    (new AmazonHttpClient config)))

(def *-header-user-agent
  "Static Constant.

  type: java.lang.String"
  AmazonHttpClient/HEADER_USER_AGENT)

(def *-header-sdk-transaction-id
  "Static Constant.

  type: java.lang.String"
  AmazonHttpClient/HEADER_SDK_TRANSACTION_ID)

(def *-header-sdk-retry-info
  "Static Constant.

  type: java.lang.String"
  AmazonHttpClient/HEADER_SDK_RETRY_INFO)

(def *-request-log
  "Static Constant.

  Logger providing detailed information on requests/responses. Users can enable this logger to
   get access to AWS request IDs for responses, individual requests and parameters sent to AWS,
   etc.

  type: org.apache.commons.logging.Log"
  AmazonHttpClient/requestLog)

(defn *builder
  "returns: `com.amazonaws.http.AmazonHttpClient$Builder`"
  (^com.amazonaws.http.AmazonHttpClient$Builder []
    (AmazonHttpClient/builder )))

(defn shutdown
  "Shuts down this HTTP client object, releasing any resources that might be held open. This is
   an optional method, and callers are not expected to call it, but can if they want to
   explicitly release any open resources. Once a client has been shutdown, it cannot be used to
   make more requests."
  ([^AmazonHttpClient this]
    (-> this (.shutdown))))

(defn get-http-request-timer
  "Package protected for unit-testing

  returns: `com.amazonaws.http.timers.request.HttpRequestTimer`"
  (^com.amazonaws.http.timers.request.HttpRequestTimer [^AmazonHttpClient this]
    (-> this (.getHttpRequestTimer))))

(defn get-client-execution-timer
  "Package protected for unit-testing

  returns: `com.amazonaws.http.timers.client.ClientExecutionTimer`"
  (^com.amazonaws.http.timers.client.ClientExecutionTimer [^AmazonHttpClient this]
    (-> this (.getClientExecutionTimer))))

(defn get-response-metadata-for-request
  "Returns additional response metadata for an executed request. Response metadata isn't
   considered part of the standard results returned by an operation, so it's accessed instead
   through this diagnostic interface. Response metadata is typically used for troubleshooting
   issues with AWS support staff when services aren't acting as expected.

  request - A previously executed AmazonWebServiceRequest object, whose response metadata is desired. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, otherwise null if there is no
   response metadata available for the request. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonHttpClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getResponseMetadataForRequest request))))

(defn get-request-metric-collector
  "Returns the httpClientSettings client specific request metric collector; or null if there is
   none.

  returns: `com.amazonaws.metrics.RequestMetricCollector`"
  (^com.amazonaws.metrics.RequestMetricCollector [^AmazonHttpClient this]
    (-> this (.getRequestMetricCollector))))

(defn get-time-offset
  "Returns the time difference in seconds between this client and AWS.

  returns: `int`"
  (^Integer [^AmazonHttpClient this]
    (-> this (.getTimeOffset))))

(defn execute
  "Deprecated. Use requestExecutionBuilder() to configure and execute a HTTP request.

  request - The AmazonWebServices request to send to the remote server - `com.amazonaws.Request`
  response-handler - A response handler to accept a successful response from the remote server - `com.amazonaws.http.HttpResponseHandler`
  error-response-handler - A response handler to accept an unsuccessful response from the remote server - `com.amazonaws.http.HttpResponseHandler`
  execution-context - Additional information about the context of this web service call - `com.amazonaws.http.ExecutionContext`

  returns: `<T> com.amazonaws.Response<T>`"
  ([^AmazonHttpClient this ^com.amazonaws.Request request ^com.amazonaws.http.HttpResponseHandler response-handler ^com.amazonaws.http.HttpResponseHandler error-response-handler ^com.amazonaws.http.ExecutionContext execution-context]
    (-> this (.execute request response-handler error-response-handler execution-context)))
  ([^AmazonHttpClient this ^com.amazonaws.Request request ^com.amazonaws.http.HttpResponseHandler response-handler ^com.amazonaws.http.HttpResponseHandler error-response-handler ^com.amazonaws.http.ExecutionContext execution-context ^com.amazonaws.RequestConfig request-config]
    (-> this (.execute request response-handler error-response-handler execution-context request-config))))

(defn request-execution-builder
  "returns: A builder used to configure and execute a HTTP request. - `com.amazonaws.http.AmazonHttpClient$RequestExecutionBuilder`"
  (^com.amazonaws.http.AmazonHttpClient$RequestExecutionBuilder [^AmazonHttpClient this]
    (-> this (.requestExecutionBuilder))))

