(ns com.amazonaws.monitoring.ApiCallMonitoringEvent
  "A Monitoring Event that describes the results of an Api Call."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.monitoring ApiCallMonitoringEvent]))

(defn ->api-call-monitoring-event
  "Constructor."
  (^ApiCallMonitoringEvent []
    (new ApiCallMonitoringEvent )))

(def *-api-call-monitoring-event-type
  "Static Constant.

  type: java.lang.String"
  ApiCallMonitoringEvent/API_CALL_MONITORING_EVENT_TYPE)

(defn get-final-sdk-exception-message
  "The ApiCallAttemptMonitoringEvent.getSdkExceptionMessage() from the last reported API call attempt. This does
   not include any exceptions raised between the completion of last API call attempt and the completion of the API call.
   Consequently, this may be null even if an SdkException thrown by the client.

  returns: `java.lang.String`"
  (^java.lang.String [^ApiCallMonitoringEvent this]
    (-> this (.getFinalSdkExceptionMessage))))

(defn get-type
  "returns: the type of the event - `java.lang.String`"
  (^java.lang.String [^ApiCallMonitoringEvent this]
    (-> this (.getType))))

(defn get-attempt-count
  "returns: The total number of attempts that were made by the service client to fulfill this request before succeeding or
   failing. - `java.lang.Integer`"
  (^java.lang.Integer [^ApiCallMonitoringEvent this]
    (-> this (.getAttemptCount))))

(defn with-api
  "Description copied from class: ApiMonitoringEvent

  api - The new api value. - `java.lang.String`

  returns: This object for method chaining. - `com.amazonaws.monitoring.ApiCallMonitoringEvent`"
  (^com.amazonaws.monitoring.ApiCallMonitoringEvent [^ApiCallMonitoringEvent this ^java.lang.String api]
    (-> this (.withApi api))))

(defn with-final-sdk-exception
  "final-sdk-exception - `java.lang.String`

  returns: `com.amazonaws.monitoring.ApiCallMonitoringEvent`"
  (^com.amazonaws.monitoring.ApiCallMonitoringEvent [^ApiCallMonitoringEvent this ^java.lang.String final-sdk-exception]
    (-> this (.withFinalSdkException final-sdk-exception))))

(defn with-timestamp
  "Sets the timestamp, in milliseconds, since January 1st, 1970, for the time point at which the event.


   This is when the request is first seen by the service client.

  timestamp - The new timestamp value. - `java.lang.Long`

  returns: This object for method chaining. - `com.amazonaws.monitoring.ApiCallMonitoringEvent`"
  (^com.amazonaws.monitoring.ApiCallMonitoringEvent [^ApiCallMonitoringEvent this ^java.lang.Long timestamp]
    (-> this (.withTimestamp timestamp))))

(defn with-max-retries-exceeded
  "Sets the api call timeout

  max-retries-exceeded - The new maxRetriesExceeded value. - `int`

  returns: This object for method chaining. - `com.amazonaws.monitoring.ApiCallMonitoringEvent`"
  (^com.amazonaws.monitoring.ApiCallMonitoringEvent [^ApiCallMonitoringEvent this ^Integer max-retries-exceeded]
    (-> this (.withMaxRetriesExceeded max-retries-exceeded))))

(defn with-service
  "Description copied from class: ApiMonitoringEvent

  service - The new service value. - `java.lang.String`

  returns: This object for method chaining. - `com.amazonaws.monitoring.ApiCallMonitoringEvent`"
  (^com.amazonaws.monitoring.ApiCallMonitoringEvent [^ApiCallMonitoringEvent this ^java.lang.String service]
    (-> this (.withService service))))

(defn with-attempt-count
  "Sets the attemptCount

  attempt-count - The new attemptCount value. - `java.lang.Integer`

  returns: This object for method chaining. - `com.amazonaws.monitoring.ApiCallMonitoringEvent`"
  (^com.amazonaws.monitoring.ApiCallMonitoringEvent [^ApiCallMonitoringEvent this ^java.lang.Integer attempt-count]
    (-> this (.withAttemptCount attempt-count))))

(defn with-version
  "Description copied from class: ApiMonitoringEvent

  version - the new version value. - `java.lang.Integer`

  returns: This object for method chaining. - `com.amazonaws.monitoring.ApiCallMonitoringEvent`"
  (^com.amazonaws.monitoring.ApiCallMonitoringEvent [^ApiCallMonitoringEvent this ^java.lang.Integer version]
    (-> this (.withVersion version))))

(defn get-final-http-status-code
  "The last status code returned by the service. This may be null if the API call or last API call attempt did not succeed.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^ApiCallMonitoringEvent this]
    (-> this (.getFinalHttpStatusCode))))

(defn get-api-call-timeout
  "returns: a boolean (0/1) value that is 0 unless the Api call failed due to hitting an Api Call time limit. - `int`"
  (^Integer [^ApiCallMonitoringEvent this]
    (-> this (.getApiCallTimeout))))

(defn with-region
  "Description copied from class: ApiMonitoringEvent

  region - The new region value. - `java.lang.String`

  returns: This object for method chaining. - `com.amazonaws.monitoring.ApiCallMonitoringEvent`"
  (^com.amazonaws.monitoring.ApiCallMonitoringEvent [^ApiCallMonitoringEvent this ^java.lang.String region]
    (-> this (.withRegion region))))

(defn get-final-aws-exception
  "The ApiCallAttemptMonitoringEvent.getAwsException() from the last reported API call attempt. This does
   not include any exceptions raised between the completion of last API call attempt and the completion of the API call.
   Consequently, this may be null even if an AwsException thrown by the client.

  returns: `java.lang.String`"
  (^java.lang.String [^ApiCallMonitoringEvent this]
    (-> this (.getFinalAwsException))))

(defn with-final-http-status-code
  "final-http-status-code - `java.lang.Integer`

  returns: `com.amazonaws.monitoring.ApiCallMonitoringEvent`"
  (^com.amazonaws.monitoring.ApiCallMonitoringEvent [^ApiCallMonitoringEvent this ^java.lang.Integer final-http-status-code]
    (-> this (.withFinalHttpStatusCode final-http-status-code))))

(defn with-latency
  "Sets the latency

  latency - The new latency value. - `java.lang.Long`

  returns: This object for method chaining. - `com.amazonaws.monitoring.ApiCallMonitoringEvent`"
  (^com.amazonaws.monitoring.ApiCallMonitoringEvent [^ApiCallMonitoringEvent this ^java.lang.Long latency]
    (-> this (.withLatency latency))))

(defn get-latency
  "returns: The elapsed time, in milliseconds, between when the Api Call was begun and when a final response or error is
   manifested to the caller. - `java.lang.Long`"
  (^java.lang.Long [^ApiCallMonitoringEvent this]
    (-> this (.getLatency))))

(defn with-user-agent
  "Description copied from class: ApiMonitoringEvent

  user-agent - The new userAgent value. - `java.lang.String`

  returns: This object for method chaining. - `com.amazonaws.monitoring.ApiCallMonitoringEvent`"
  (^com.amazonaws.monitoring.ApiCallMonitoringEvent [^ApiCallMonitoringEvent this ^java.lang.String user-agent]
    (-> this (.withUserAgent user-agent))))

(defn get-final-sdk-exception
  "The ApiCallAttemptMonitoringEvent.getSdkException() from the last reported API call attempt. This does
   not include any exceptions raised between the completion of last API call attempt and the completion of the API call.
   Consequently, this may be null even if an SdkException thrown by the client.

  returns: `java.lang.String`"
  (^java.lang.String [^ApiCallMonitoringEvent this]
    (-> this (.getFinalSdkException))))

(defn with-client-id
  "Description copied from class: ApiMonitoringEvent

  client-id - The new clientId value. - `java.lang.String`

  returns: This object for method chaining. - `com.amazonaws.monitoring.ApiCallMonitoringEvent`"
  (^com.amazonaws.monitoring.ApiCallMonitoringEvent [^ApiCallMonitoringEvent this ^java.lang.String client-id]
    (-> this (.withClientId client-id))))

(defn get-final-aws-exception-message
  "The ApiCallAttemptMonitoringEvent.getAwsExceptionMessage() from the last reported API call attempt. This does
   not include any exceptions raised between the completion of last API call attempt and the completion of the API call.
   Consequently, this may be null even if an AwsException thrown by the client.

  returns: `java.lang.String`"
  (^java.lang.String [^ApiCallMonitoringEvent this]
    (-> this (.getFinalAwsExceptionMessage))))

(defn with-final-aws-exception-message
  "final-aws-exception-message - `java.lang.String`

  returns: `com.amazonaws.monitoring.ApiCallMonitoringEvent`"
  (^com.amazonaws.monitoring.ApiCallMonitoringEvent [^ApiCallMonitoringEvent this ^java.lang.String final-aws-exception-message]
    (-> this (.withFinalAwsExceptionMessage final-aws-exception-message))))

(defn with-final-aws-exception
  "final-aws-exception - `java.lang.String`

  returns: `com.amazonaws.monitoring.ApiCallMonitoringEvent`"
  (^com.amazonaws.monitoring.ApiCallMonitoringEvent [^ApiCallMonitoringEvent this ^java.lang.String final-aws-exception]
    (-> this (.withFinalAwsException final-aws-exception))))

(defn with-api-call-timeout
  "Sets the api call timeout

  api-call-timeout - The new apiCallTimeout value. - `int`

  returns: This object for method chaining. - `com.amazonaws.monitoring.ApiCallMonitoringEvent`"
  (^com.amazonaws.monitoring.ApiCallMonitoringEvent [^ApiCallMonitoringEvent this ^Integer api-call-timeout]
    (-> this (.withApiCallTimeout api-call-timeout))))

(defn get-max-retries-exceeded
  "returns: a boolean (0/1) value that is 0 unless the Api call failed and the final attempt returned a retryable error. - `int`"
  (^Integer [^ApiCallMonitoringEvent this]
    (-> this (.getMaxRetriesExceeded))))

(defn with-final-sdk-exception-message
  "final-sdk-exception-message - `java.lang.String`

  returns: `com.amazonaws.monitoring.ApiCallMonitoringEvent`"
  (^com.amazonaws.monitoring.ApiCallMonitoringEvent [^ApiCallMonitoringEvent this ^java.lang.String final-sdk-exception-message]
    (-> this (.withFinalSdkExceptionMessage final-sdk-exception-message))))

