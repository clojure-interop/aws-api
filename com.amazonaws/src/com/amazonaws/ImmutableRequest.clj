(ns com.amazonaws.ImmutableRequest
  "Represents a request being sent to an Amazon Web Service, including the
  parameters being sent as part of the request, the endpoint to which the
  request should be sent, etc.
  Members of this class should be considered read-only and not mutated"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws ImmutableRequest]))

(defn get-original-request-object
  "Returns the original, user facing request object which this internal
   request object is representing.

  returns: an instance of request as an Object. - `java.lang.Object`"
  (^java.lang.Object [^ImmutableRequest this]
    (-> this (.getOriginalRequestObject))))

(defn get-parameters
  "Returns a map of all parameters in this request.

  returns: A map of all parameters in this request. - `java.util.Map<java.lang.String,java.util.List<java.lang.String>>`"
  (^java.util.Map [^ImmutableRequest this]
    (-> this (.getParameters))))

(defn get-read-limit-info
  "Returns the read limit info about the original request.

  returns: `com.amazonaws.ReadLimitInfo`"
  (^com.amazonaws.ReadLimitInfo [^ImmutableRequest this]
    (-> this (.getReadLimitInfo))))

(defn get-content-unwrapped
  "Returns the optional raw stream containing the payload data to include
   for this request, with all progress stream wrappers. Not all requests
   contain payload data.

  returns: The optional raw stream containing the payload data to include
           for this request, with all progress stream wrappers removed. - `java.io.InputStream`"
  (^java.io.InputStream [^ImmutableRequest this]
    (-> this (.getContentUnwrapped))))

(defn get-endpoint
  "Returns the service endpoint (ex: \"https://ec2.amazonaws.com\") to which
   this request should be sent.

  returns: The service endpoint to which this request should be sent. - `java.net.URI`"
  (^java.net.URI [^ImmutableRequest this]
    (-> this (.getEndpoint))))

(defn get-resource-path
  "Returns the path to the resource being requested.

  returns: The path to the resource being requested. - `java.lang.String`"
  (^java.lang.String [^ImmutableRequest this]
    (-> this (.getResourcePath))))

(defn get-http-method
  "Returns the HTTP method (GET, POST, etc) to use when sending this
   request.

  returns: The HTTP method to use when sending this request. - `com.amazonaws.http.HttpMethodName`"
  (^com.amazonaws.http.HttpMethodName [^ImmutableRequest this]
    (-> this (.getHttpMethod))))

(defn get-time-offset
  "Returns the optional value for time offset for this request.  This
   will be used by the signer to adjust for potential clock skew.
   Value is in seconds, positive values imply the current clock is \"fast\",
   negative values imply clock is slow.

  returns: The optional value for time offset (in seconds) for this request. - `int`"
  (^Integer [^ImmutableRequest this]
    (-> this (.getTimeOffset))))

(defn get-headers
  "Returns a map of all the headers included in this request.

  returns: A map of all the headers included in this request. - `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ImmutableRequest this]
    (-> this (.getHeaders))))

(defn get-content
  "Returns the optional stream containing the payload data to include for
   this request. Not all requests will contain payload data.

  returns: The optional stream containing the payload data to include for
           this request. - `java.io.InputStream`"
  (^java.io.InputStream [^ImmutableRequest this]
    (-> this (.getContent))))

