(ns com.amazonaws.AmazonServiceException
  "Extension of SdkClientException that represents an error response returned
  by an Amazon web service. Receiving an exception of this type indicates that
  the caller's request was correctly transmitted to the service, but for some
  reason, the service was not able to process it, and returned an error
  response instead.

  AmazonServiceException provides callers several pieces of
  information that can be used to obtain more information about the error and
  why it occurred. In particular, the errorType field can be used to determine
  if the caller's request was invalid, or the service encountered an error on
  the server side while processing it."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws AmazonServiceException]))

(defn ->amazon-service-exception
  "Constructor.

  Constructs a new AmazonServiceException with the specified message and
   exception indicating the root cause.

  error-message - An error message describing what went wrong. - `java.lang.String`
  cause - The root exception that caused this exception to be thrown. - `java.lang.Exception`"
  (^AmazonServiceException [^java.lang.String error-message ^java.lang.Exception cause]
    (new AmazonServiceException error-message cause))
  (^AmazonServiceException [^java.lang.String error-message]
    (new AmazonServiceException error-message)))

(defn set-status-code
  "Sets the HTTP status code that was returned with this service exception.

  status-code - The HTTP status code that was returned with this service exception. - `int`"
  ([^AmazonServiceException this ^Integer status-code]
    (-> this (.setStatusCode status-code))))

(defn set-error-type
  "Sets the type of error represented by this exception (sender, receiver,
   or unknown), indicating if this exception was the caller's fault, or the
   service's fault.

  error-type - The type of error represented by this exception (sender or receiver), indicating if this exception was the caller's fault or the service's fault. - `com.amazonaws.AmazonServiceException$ErrorType`"
  ([^AmazonServiceException this ^com.amazonaws.AmazonServiceException$ErrorType error-type]
    (-> this (.setErrorType error-type))))

(defn set-error-code
  "Sets the AWS error code represented by this exception.

  error-code - The AWS error code represented by this exception. - `java.lang.String`"
  ([^AmazonServiceException this ^java.lang.String error-code]
    (-> this (.setErrorCode error-code))))

(defn get-raw-response
  "Returns the response payload as bytes.

  returns: `byte[]`"
  ([^AmazonServiceException this]
    (-> this (.getRawResponse))))

(defn get-service-name
  "Returns the name of the service that sent this error response.

  returns: The name of the service that sent this error response. - `java.lang.String`"
  (^java.lang.String [^AmazonServiceException this]
    (-> this (.getServiceName))))

(defn set-http-headers
  "Sets the headers present in the error response.

  http-headers - `java.util.Map`"
  ([^AmazonServiceException this ^java.util.Map http-headers]
    (-> this (.setHttpHeaders http-headers))))

(defn set-raw-response-content
  "Sets the raw response content.

  raw-response-content - `java.lang.String`"
  ([^AmazonServiceException this ^java.lang.String raw-response-content]
    (-> this (.setRawResponseContent raw-response-content))))

(defn get-error-message
  "returns: the human-readable error message provided by the service - `java.lang.String`"
  (^java.lang.String [^AmazonServiceException this]
    (-> this (.getErrorMessage))))

(defn set-request-id
  "Sets the AWS requestId for this exception.

  request-id - The unique identifier for the service request the caller made. - `java.lang.String`"
  ([^AmazonServiceException this ^java.lang.String request-id]
    (-> this (.setRequestId request-id))))

(defn get-http-headers
  "returns: A Map of HTTP headers associated with the error response. - `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^AmazonServiceException this]
    (-> this (.getHttpHeaders))))

(defn get-error-code
  "Returns the AWS error code represented by this exception.

  returns: The AWS error code represented by this exception. - `java.lang.String`"
  (^java.lang.String [^AmazonServiceException this]
    (-> this (.getErrorCode))))

(defn set-service-name
  "Sets the name of the service that sent this error response.

  service-name - The name of the service that sent this error response. - `java.lang.String`"
  ([^AmazonServiceException this ^java.lang.String service-name]
    (-> this (.setServiceName service-name))))

(defn get-request-id
  "Returns the AWS request ID that uniquely identifies the service request
   the caller made.

  returns: The AWS request ID that uniquely identifies the service request
           the caller made. - `java.lang.String`"
  (^java.lang.String [^AmazonServiceException this]
    (-> this (.getRequestId))))

(defn get-status-code
  "Returns the HTTP status code that was returned with this service
   exception.

  returns: The HTTP status code that was returned with this service
           exception. - `int`"
  (^Integer [^AmazonServiceException this]
    (-> this (.getStatusCode))))

(defn get-error-type
  "Indicates who is responsible for this exception (caller, service,
   or unknown).

  returns: A value indicating who is responsible for this exception (caller, service, or unknown). - `com.amazonaws.AmazonServiceException$ErrorType`"
  (^com.amazonaws.AmazonServiceException$ErrorType [^AmazonServiceException this]
    (-> this (.getErrorType))))

(defn get-message
  "returns: `java.lang.String`"
  (^java.lang.String [^AmazonServiceException this]
    (-> this (.getMessage))))

(defn set-raw-response
  "Sets the raw response content.

  raw-response - `byte[]`"
  ([^AmazonServiceException this raw-response]
    (-> this (.setRawResponse raw-response))))

(defn get-raw-response-content
  "Typically only useful for debugging purpose if for some reason the SDK cannot parse the HTTP
   response from a service

  returns: The raw content of the HTTP response as a String. - `java.lang.String`"
  (^java.lang.String [^AmazonServiceException this]
    (-> this (.getRawResponseContent))))

(defn set-error-message
  "Sets the human-readable error message provided by the service.

   NOTE: errorMessage by default is set to the same as the message value
   passed to the constructor of AmazonServiceException.

  value - `java.lang.String`"
  ([^AmazonServiceException this ^java.lang.String value]
    (-> this (.setErrorMessage value))))

