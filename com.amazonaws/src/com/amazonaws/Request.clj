(ns com.amazonaws.Request
  "Represents a request being sent to an Amazon Web Service, including the
  parameters being sent as part of the request, the endpoint to which the
  request should be sent, etc.

  This class is only intended for use inside the AWS client libraries and
  request handlers. Users of the AWS SDK for Java should not implement this
  interface."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws Request]))

(defn set-http-method
  "Sets the HTTP method (GET, POST, etc) to use when sending this request.

  http-method - The HTTP method to use when sending this request. - `com.amazonaws.http.HttpMethodName`"
  ([^Request this ^com.amazonaws.http.HttpMethodName http-method]
    (-> this (.setHttpMethod http-method))))

(defn set-parameters
  "Sets all parameters, clearing any existing values.

   Note that List values within the parameters Map must use an implementation that supports null
   values.

  parameters - `java.util.Map`"
  ([^Request this ^java.util.Map parameters]
    (-> this (.setParameters parameters))))

(defn set-time-offset
  "Sets the optional value for time offset for this request.  This
   will be used by the signer to adjust for potential clock skew.
   Value is in seconds, positive values imply the current clock is \"fast\",
   negative values imply clock is slow.

  time-offset - The optional value for time offset (in seconds) for this request. - `int`"
  ([^Request this ^Integer time-offset]
    (-> this (.setTimeOffset time-offset))))

(defn get-original-request
  "Returns the original, user facing request object which this internal
   request object is representing.

  returns: `com.amazonaws.AmazonWebServiceRequest`"
  (^com.amazonaws.AmazonWebServiceRequest [^Request this]
    (-> this (.getOriginalRequest))))

(defn with-time-offset
  "Sets the optional value for time offset for this request.  This
   will be used by the signer to adjust for potential clock skew.
   Value is in seconds, positive values imply the current clock is \"fast\",
   negative values imply clock is slow.

  time-offset - `int`

  returns: The updated request object. - `com.amazonaws.Request<T>`"
  (^com.amazonaws.Request [^Request this ^Integer time-offset]
    (-> this (.withTimeOffset time-offset))))

(defn set-resource-path
  "Sets the path to the resource being requested.

  path - The path to the resource being requested. - `java.lang.String`"
  ([^Request this ^java.lang.String path]
    (-> this (.setResourcePath path))))

(defn set-aws-request-metrics
  "Bind the request metrics to the request. Note metrics can be captured
   before the request is created.

  metrics - `com.amazonaws.util.AWSRequestMetrics`

  throws: java.lang.IllegalStateException - if the binding has already occurred"
  ([^Request this ^com.amazonaws.util.AWSRequestMetrics metrics]
    (-> this (.setAWSRequestMetrics metrics))))

(defn set-headers
  "Sets all headers, clearing any existing ones.

  headers - `java.util.Map`"
  ([^Request this ^java.util.Map headers]
    (-> this (.setHeaders headers))))

(defn get-service-name
  "returns: The name of the Amazon service this request is for. This is used
           as the service name set in request metrics and service
           exceptions. This is NOT the same as the service name returned by
           AmazonWebServiceClient.getServiceName() which is used for
           signing purpose. - `java.lang.String`"
  (^java.lang.String [^Request this]
    (-> this (.getServiceName))))

(defn set-endpoint
  "Sets the service endpoint (ex: \"https://ec2.amazonaws.com\") to which this
   request should be sent.

  endpoint - The service endpoint to which this request should be sent. - `java.net.URI`"
  ([^Request this ^java.net.URI endpoint]
    (-> this (.setEndpoint endpoint))))

(defn get-aws-request-metrics
  "Returns the request metrics.

  returns: `com.amazonaws.util.AWSRequestMetrics`"
  (^com.amazonaws.util.AWSRequestMetrics [^Request this]
    (-> this (.getAWSRequestMetrics))))

(defn with-parameter
  "Adds the specified request parameter to this request, and returns the
   updated request object.

  name - The name of the request parameter. - `java.lang.String`
  value - The value of the request parameter. - `java.lang.String`

  returns: The updated request object. - `com.amazonaws.Request<T>`"
  (^com.amazonaws.Request [^Request this ^java.lang.String name ^java.lang.String value]
    (-> this (.withParameter name value))))

(defn add-parameters
  "Adds the specified request parameter and list of values to this request.

  name - The name of the request parameter. - `java.lang.String`
  values - The value of the request parameter. - `java.util.List`"
  ([^Request this ^java.lang.String name ^java.util.List values]
    (-> this (.addParameters name values))))

