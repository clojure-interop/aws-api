(ns com.amazonaws.util.AWSRequestMetrics$Field
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.util AWSRequestMetrics$Field]))

(def AWSErrorCode
  "Enum Constant.

  type: com.amazonaws.util.AWSRequestMetrics$Field"
  AWSRequestMetrics$Field/AWSErrorCode)

(def AWSRequestID
  "Enum Constant.

  type: com.amazonaws.util.AWSRequestMetrics$Field"
  AWSRequestMetrics$Field/AWSRequestID)

(def RequestType
  "Enum Constant.

  The specific request subtype, such as PutItemRequest, PutObjectRequest, etc.

  type: com.amazonaws.util.AWSRequestMetrics$Field"
  AWSRequestMetrics$Field/RequestType)

(def BytesProcessed
  "Enum Constant.

  type: com.amazonaws.util.AWSRequestMetrics$Field"
  AWSRequestMetrics$Field/BytesProcessed)

(def ClientExecuteTime
  "Enum Constant.

  Total number of milliseconds taken for a request/response including
   the time taken to execute the request handlers, round trip to AWS,
   and the time taken to execute the response handlers.

  type: com.amazonaws.util.AWSRequestMetrics$Field"
  AWSRequestMetrics$Field/ClientExecuteTime)

(def CredentialsRequestTime
  "Enum Constant.

  type: com.amazonaws.util.AWSRequestMetrics$Field"
  AWSRequestMetrics$Field/CredentialsRequestTime)

(def Exception
  "Enum Constant.

  type: com.amazonaws.util.AWSRequestMetrics$Field"
  AWSRequestMetrics$Field/Exception)

(def ThrottleException
  "Enum Constant.

  Used to count and preserve the throttle related exceptions.

  type: com.amazonaws.util.AWSRequestMetrics$Field"
  AWSRequestMetrics$Field/ThrottleException)

(def HttpRequestTime
  "Enum Constant.

  Number of milliseconds taken for a request/response round trip to AWS.

  type: com.amazonaws.util.AWSRequestMetrics$Field"
  AWSRequestMetrics$Field/HttpRequestTime)

(def RedirectLocation
  "Enum Constant.

  type: com.amazonaws.util.AWSRequestMetrics$Field"
  AWSRequestMetrics$Field/RedirectLocation)

(def RequestMarshallTime
  "Enum Constant.

  type: com.amazonaws.util.AWSRequestMetrics$Field"
  AWSRequestMetrics$Field/RequestMarshallTime)

(def RequestSigningTime
  "Enum Constant.

  Number of milliseconds taken to sign a request.

  type: com.amazonaws.util.AWSRequestMetrics$Field"
  AWSRequestMetrics$Field/RequestSigningTime)

(def ResponseProcessingTime
  "Enum Constant.

  Number of milliseconds taken to execute the response handler for a response from AWS.

  type: com.amazonaws.util.AWSRequestMetrics$Field"
  AWSRequestMetrics$Field/ResponseProcessingTime)

(def RequestCount
  "Enum Constant.

  Number of requests to AWS.

  type: com.amazonaws.util.AWSRequestMetrics$Field"
  AWSRequestMetrics$Field/RequestCount)

(def RetryCount
  "Enum Constant.

  Number of retries of AWS SDK sending a request to AWS.

  type: com.amazonaws.util.AWSRequestMetrics$Field"
  AWSRequestMetrics$Field/RetryCount)

(def RetryCapacityConsumed
  "Enum Constant.

  Snapshot of currently consumed retry capacity.

  type: com.amazonaws.util.AWSRequestMetrics$Field"
  AWSRequestMetrics$Field/RetryCapacityConsumed)

(def ThrottledRetryCount
  "Enum Constant.

  Number of retries that were not attempted due to retry throttling.

  type: com.amazonaws.util.AWSRequestMetrics$Field"
  AWSRequestMetrics$Field/ThrottledRetryCount)

(def HttpClientRetryCount
  "Enum Constant.

  Number of retries of the underlying http client library in sending a
   request to AWS.

  type: com.amazonaws.util.AWSRequestMetrics$Field"
  AWSRequestMetrics$Field/HttpClientRetryCount)

(def HttpClientSendRequestTime
  "Enum Constant.

  Time taken to send a request to AWS by the http client library,
   excluding any retry.

  type: com.amazonaws.util.AWSRequestMetrics$Field"
  AWSRequestMetrics$Field/HttpClientSendRequestTime)

(def HttpClientReceiveResponseTime
  "Enum Constant.

  Time taken to receive a response from AWS by the http client library,
   excluding any retry.

  type: com.amazonaws.util.AWSRequestMetrics$Field"
  AWSRequestMetrics$Field/HttpClientReceiveResponseTime)

(def HttpSocketReadTime
  "Enum Constant.

  Time taken for socket to read.

  type: com.amazonaws.util.AWSRequestMetrics$Field"
  AWSRequestMetrics$Field/HttpSocketReadTime)

(def HttpClientPoolAvailableCount
  "Enum Constant.

  The number of idle persistent connections.

   Reference: https://hc.apache
   .org/httpcomponents-core-ga/httpcore/apidocs/org/apache
   /http/pool/PoolStats.html

  type: com.amazonaws.util.AWSRequestMetrics$Field"
  AWSRequestMetrics$Field/HttpClientPoolAvailableCount)

(def HttpClientPoolLeasedCount
  "Enum Constant.

  The number of persistent connections tracked by the connection
   manager currently being used to execute requests.

   Reference: https://hc
   .apache.org/httpcomponents-core-ga/httpcore/apidocs/org/apache
   /http/pool/PoolStats.html

  type: com.amazonaws.util.AWSRequestMetrics$Field"
  AWSRequestMetrics$Field/HttpClientPoolLeasedCount)

(def HttpClientPoolPendingCount
  "Enum Constant.

  The number of connection requests being blocked awaiting a free
   connection.

   Reference: https://hc.apache.org/httpcomponents-core-ga/httpcore
   /apidocs/org/apache/http/pool/PoolStats.html

  type: com.amazonaws.util.AWSRequestMetrics$Field"
  AWSRequestMetrics$Field/HttpClientPoolPendingCount)

(def RetryPauseTime
  "Enum Constant.

  type: com.amazonaws.util.AWSRequestMetrics$Field"
  AWSRequestMetrics$Field/RetryPauseTime)

(def ServiceEndpoint
  "Enum Constant.

  type: com.amazonaws.util.AWSRequestMetrics$Field"
  AWSRequestMetrics$Field/ServiceEndpoint)

(def ServiceName
  "Enum Constant.

  type: com.amazonaws.util.AWSRequestMetrics$Field"
  AWSRequestMetrics$Field/ServiceName)

(def StatusCode
  "Enum Constant.

  type: com.amazonaws.util.AWSRequestMetrics$Field"
  AWSRequestMetrics$Field/StatusCode)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (AWSRequestMetrics.Field c : AWSRequestMetrics.Field.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.amazonaws.util.AWSRequestMetrics$Field[]`"
  ([]
    (AWSRequestMetrics$Field/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.amazonaws.util.AWSRequestMetrics$Field`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.amazonaws.util.AWSRequestMetrics$Field [^java.lang.String name]
    (AWSRequestMetrics$Field/valueOf name)))

