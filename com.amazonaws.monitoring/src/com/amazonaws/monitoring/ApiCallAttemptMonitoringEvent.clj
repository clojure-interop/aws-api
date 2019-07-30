(ns com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent
  "A Monitoring Event that described the results of an Api Call Attempt."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.monitoring ApiCallAttemptMonitoringEvent]))

(defn ->api-call-attempt-monitoring-event
  "Constructor."
  (^ApiCallAttemptMonitoringEvent []
    (new ApiCallAttemptMonitoringEvent )))

(def *-api-call-attempt-monitoring-event-type
  "Static Constant.

  type: java.lang.String"
  ApiCallAttemptMonitoringEvent/API_CALL_ATTEMPT_MONITORING_EVENT_TYPE)

(defn with-sdk-exception-message
  "Sets the sdkExceptionMessage

  sdk-exception-message - The new sdkExceptionMessage value. - `java.lang.String`

  returns: This object for method chaining. - `com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent`"
  (^com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent [^ApiCallAttemptMonitoringEvent this ^java.lang.String sdk-exception-message]
    (-> this (.withSdkExceptionMessage sdk-exception-message))))

(defn get-attempt-latency
  "returns: the elapsed time, in milliseconds, between the construction of the http request and the point in time where the
   http response has been parsed or the attempt has definitively failed - `java.lang.Long`"
  (^java.lang.Long [^ApiCallAttemptMonitoringEvent this]
    (-> this (.getAttemptLatency))))

(defn getx-amzn-request-id
  "returns: the value of x-amzn-RequestId in response header - `java.lang.String`"
  (^java.lang.String [^ApiCallAttemptMonitoringEvent this]
    (-> this (.getxAmznRequestId))))

(defn with-access-key
  "Sets the accessKey

  access-key - The new accessKey value. - `java.lang.String`

  returns: This object for method chaining. - `com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent`"
  (^com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent [^ApiCallAttemptMonitoringEvent this ^java.lang.String access-key]
    (-> this (.withAccessKey access-key))))

(defn get-session-token
  "returns: Contains the session token passed in the x-amz-security-token header. - `java.lang.String`"
  (^java.lang.String [^ApiCallAttemptMonitoringEvent this]
    (-> this (.getSessionToken))))

(defn with-attempt-latency
  "Sets the latency

  attempt-latency - The new latency value. - `java.lang.Long`

  returns: This object for method chaining. - `com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent`"
  (^com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent [^ApiCallAttemptMonitoringEvent this ^java.lang.Long attempt-latency]
    (-> this (.withAttemptLatency attempt-latency))))

(defn with-fqdn
  "Sets the fqdn

  fqdn - The new fqdn value. - `java.lang.String`

  returns: This object for method chaining. - `com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent`"
  (^com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent [^ApiCallAttemptMonitoringEvent this ^java.lang.String fqdn]
    (-> this (.withFqdn fqdn))))

(defn with-x-amz-id-2
  "Sets the value of x-amz-id-2 in response header

  x-amz-id-2 - the new value. - `java.lang.String`

  returns: This object for method chaining. - `com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent`"
  (^com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent [^ApiCallAttemptMonitoringEvent this ^java.lang.String x-amz-id-2]
    (-> this (.withXAmzId2 x-amz-id-2))))

(defn getx-amz-request-id
  "returns: the value of x-amz-request-id in response header - `java.lang.String`"
  (^java.lang.String [^ApiCallAttemptMonitoringEvent this]
    (-> this (.getxAmzRequestId))))

(defn with-aws-exception-message
  "Sets the awsExceptionMessage

  aws-exception-message - The new awsExceptionMessage value. - `java.lang.String`

  returns: This object for method chaining. - `com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent`"
  (^com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent [^ApiCallAttemptMonitoringEvent this ^java.lang.String aws-exception-message]
    (-> this (.withAwsExceptionMessage aws-exception-message))))

(defn get-type
  "returns: the type of the event - `java.lang.String`"
  (^java.lang.String [^ApiCallAttemptMonitoringEvent this]
    (-> this (.getType))))

(defn get-sdk-exception-message
  "returns: Contains the full text for any attempt-level failure that is due to something other than an Aws exception. - `java.lang.String`"
  (^java.lang.String [^ApiCallAttemptMonitoringEvent this]
    (-> this (.getSdkExceptionMessage))))

(defn getx-amz-id-2
  "returns: the value of x-amz-id-2 in response header - `java.lang.String`"
  (^java.lang.String [^ApiCallAttemptMonitoringEvent this]
    (-> this (.getxAmzId2))))

(defn get-http-status-code
  "returns: the attempt's response status code, as returned by the http client. - `java.lang.Integer`"
  (^java.lang.Integer [^ApiCallAttemptMonitoringEvent this]
    (-> this (.getHttpStatusCode))))

(defn with-api
  "Description copied from class: ApiMonitoringEvent

  api - The new api value. - `java.lang.String`

  returns: This object for method chaining. - `com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent`"
  (^com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent [^ApiCallAttemptMonitoringEvent this ^java.lang.String api]
    (-> this (.withApi api))))

(defn with-timestamp
  "Sets the timestamp, in milliseconds, since January 1st, 1970, for the time point at which the event.


   This is when the request attempt is passed to the http client.

  timestamp - The new timestamp value. - `java.lang.Long`

  returns: This object for method chaining. - `com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent`"
  (^com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent [^ApiCallAttemptMonitoringEvent this ^java.lang.Long timestamp]
    (-> this (.withTimestamp timestamp))))

(defn get-request-latency
  "returns: the time interval (in milliseconds) between when the request begins transmission to the service and when the response has been parsed, excluding streaming payloads. - `java.lang.Long`"
  (^java.lang.Long [^ApiCallAttemptMonitoringEvent this]
    (-> this (.getRequestLatency))))

(defn with-service
  "Description copied from class: ApiMonitoringEvent

  service - The new service value. - `java.lang.String`

  returns: This object for method chaining. - `com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent`"
  (^com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent [^ApiCallAttemptMonitoringEvent this ^java.lang.String service]
    (-> this (.withService service))))

(defn get-aws-exception-message
  "returns: the exception message - `java.lang.String`"
  (^java.lang.String [^ApiCallAttemptMonitoringEvent this]
    (-> this (.getAwsExceptionMessage))))

(defn with-version
  "Description copied from class: ApiMonitoringEvent

  version - the new version value. - `java.lang.Integer`

  returns: This object for method chaining. - `com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent`"
  (^com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent [^ApiCallAttemptMonitoringEvent this ^java.lang.Integer version]
    (-> this (.withVersion version))))

(defn get-access-key
  "returns: Contains the aws_access_key value that was used to sign the http request. - `java.lang.String`"
  (^java.lang.String [^ApiCallAttemptMonitoringEvent this]
    (-> this (.getAccessKey))))

(defn with-region
  "Sets the region

  region - The new region value. - `java.lang.String`

  returns: This object for method chaining. - `com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent`"
  (^com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent [^ApiCallAttemptMonitoringEvent this ^java.lang.String region]
    (-> this (.withRegion region))))

(defn get-sdk-exception
  "returns: the exception class name - `java.lang.String`"
  (^java.lang.String [^ApiCallAttemptMonitoringEvent this]
    (-> this (.getSdkException))))

(defn get-fqdn
  "returns: the fully-qualified domain name of the endpoint that the request attempt was submitted to. - `java.lang.String`"
  (^java.lang.String [^ApiCallAttemptMonitoringEvent this]
    (-> this (.getFqdn))))

(defn with-request-latency
  "Sets the requestLatency

  request-latency - The new requestLatency value. - `java.lang.Long`

  returns: This object for method chaining. - `com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent`"
  (^com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent [^ApiCallAttemptMonitoringEvent this ^java.lang.Long request-latency]
    (-> this (.withRequestLatency request-latency))))

(defn with-http-status-code
  "Sets the httpStatusCode

  http-status-code - The new httpStatusCode value. - `java.lang.Integer`

  returns: This object for method chaining. - `com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent`"
  (^com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent [^ApiCallAttemptMonitoringEvent this ^java.lang.Integer http-status-code]
    (-> this (.withHttpStatusCode http-status-code))))

(defn with-aws-exception
  "Sets the awsException

  aws-exception - The new awsException value. - `java.lang.String`

  returns: This object for method chaining. - `com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent`"
  (^com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent [^ApiCallAttemptMonitoringEvent this ^java.lang.String aws-exception]
    (-> this (.withAwsException aws-exception))))

(defn with-user-agent
  "Description copied from class: ApiMonitoringEvent

  user-agent - The new userAgent value. - `java.lang.String`

  returns: This object for method chaining. - `com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent`"
  (^com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent [^ApiCallAttemptMonitoringEvent this ^java.lang.String user-agent]
    (-> this (.withUserAgent user-agent))))

(defn with-session-token
  "Sets the sessionToken

  session-token - The new sessionToken value. - `java.lang.String`

  returns: This object for method chaining. - `com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent`"
  (^com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent [^ApiCallAttemptMonitoringEvent this ^java.lang.String session-token]
    (-> this (.withSessionToken session-token))))

(defn with-client-id
  "Description copied from class: ApiMonitoringEvent

  client-id - The new clientId value. - `java.lang.String`

  returns: This object for method chaining. - `com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent`"
  (^com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent [^ApiCallAttemptMonitoringEvent this ^java.lang.String client-id]
    (-> this (.withClientId client-id))))

(defn with-x-amz-request-id
  "Sets the value of x-amz-request-id in response header

  x-amz-request-id - The new value. - `java.lang.String`

  returns: This object for method chaining. - `com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent`"
  (^com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent [^ApiCallAttemptMonitoringEvent this ^java.lang.String x-amz-request-id]
    (-> this (.withXAmzRequestId x-amz-request-id))))

(defn with-x-amzn-request-id
  "Sets the value of x-amzn-RequestId in response header

  x-amzn-request-id - The new value. - `java.lang.String`

  returns: This object for method chaining. - `com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent`"
  (^com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent [^ApiCallAttemptMonitoringEvent this ^java.lang.String x-amzn-request-id]
    (-> this (.withXAmznRequestId x-amzn-request-id))))

(defn get-aws-exception
  "returns: the Aws exception code - `java.lang.String`"
  (^java.lang.String [^ApiCallAttemptMonitoringEvent this]
    (-> this (.getAwsException))))

(defn with-sdk-exception
  "Sets the sdkException

  sdk-exception - The new sdkException value. - `java.lang.String`

  returns: This object for method chaining. - `com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent`"
  (^com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent [^ApiCallAttemptMonitoringEvent this ^java.lang.String sdk-exception]
    (-> this (.withSdkException sdk-exception))))

