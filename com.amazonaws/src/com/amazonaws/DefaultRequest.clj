(ns com.amazonaws.DefaultRequest
  "Default implementation of the com.amazonaws.Request interface.

  This class is only intended for internal use inside the AWS client libraries.
  Callers shouldn't ever interact directly with objects of this class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws DefaultRequest]))

(defn ->default-request
  "Constructor.

  Constructs a new DefaultRequest with the specified service name and the
   original, user facing request object.

  original-request - The original, user facing, AWS request being represented by this internal request object. - `com.amazonaws.AmazonWebServiceRequest`
  service-name - The name of the service to which this request is being sent. - `java.lang.String`"
  (^DefaultRequest [^com.amazonaws.AmazonWebServiceRequest original-request ^java.lang.String service-name]
    (new DefaultRequest original-request service-name))
  (^DefaultRequest [^java.lang.String service-name]
    (new DefaultRequest service-name)))

(defn set-http-method
  "Description copied from interface: Request

  http-method - The HTTP method to use when sending this request. - `com.amazonaws.http.HttpMethodName`"
  ([^DefaultRequest this ^com.amazonaws.http.HttpMethodName http-method]
    (-> this (.setHttpMethod http-method))))

(defn set-parameters
  "Description copied from interface: Request

  parameters - `java.util.Map`"
  ([^DefaultRequest this ^java.util.Map parameters]
    (-> this (.setParameters parameters))))

(defn set-time-offset
  "Description copied from interface: Request

  time-offset - The optional value for time offset (in seconds) for this request. - `int`"
  ([^DefaultRequest this ^Integer time-offset]
    (-> this (.setTimeOffset time-offset))))

(defn get-original-request-object
  "Description copied from interface: ImmutableRequest

  returns: an instance of request as an Object. - `java.lang.Object`"
  (^java.lang.Object [^DefaultRequest this]
    (-> this (.getOriginalRequestObject))))

(defn get-original-request
  "Returns the original, user facing request object which this internal
   request object is representing.

  returns: The original, user facing request object which this request
           object is representing. - `com.amazonaws.AmazonWebServiceRequest`"
  (^com.amazonaws.AmazonWebServiceRequest [^DefaultRequest this]
    (-> this (.getOriginalRequest))))

(defn add-header
  "Description copied from interface: SignableRequest

  name - The name of the header to set. - `java.lang.String`
  value - The header's value. - `java.lang.String`"
  ([^DefaultRequest this ^java.lang.String name ^java.lang.String value]
    (-> this (.addHeader name value))))

(defn with-time-offset
  "Description copied from interface: Request

  time-offset - `int`

  returns: The updated request object. - `com.amazonaws.Request<T>`"
  (^com.amazonaws.Request [^DefaultRequest this ^Integer time-offset]
    (-> this (.withTimeOffset time-offset))))

(defn set-resource-path
  "Description copied from interface: Request

  resource-path - The path to the resource being requested. - `java.lang.String`"
  ([^DefaultRequest this ^java.lang.String resource-path]
    (-> this (.setResourcePath resource-path))))

(defn set-aws-request-metrics
  "Description copied from interface: Request

  metrics - `com.amazonaws.util.AWSRequestMetrics`"
  ([^DefaultRequest this ^com.amazonaws.util.AWSRequestMetrics metrics]
    (-> this (.setAWSRequestMetrics metrics))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DefaultRequest this]
    (-> this (.toString))))

(defn get-parameters
  "Description copied from interface: ImmutableRequest

  returns: A map of all parameters in this request. - `java.util.Map<java.lang.String,java.util.List<java.lang.String>>`"
  (^java.util.Map [^DefaultRequest this]
    (-> this (.getParameters))))

(defn set-headers
  "Description copied from interface: Request

  headers - `java.util.Map`"
  ([^DefaultRequest this ^java.util.Map headers]
    (-> this (.setHeaders headers))))

(defn get-service-name
  "returns: The name of the Amazon service this request is for. This is used
           as the service name set in request metrics and service
           exceptions. This is NOT the same as the service name returned by
           AmazonWebServiceClient.getServiceName() which is used for
           signing purpose. - `java.lang.String`"
  (^java.lang.String [^DefaultRequest this]
    (-> this (.getServiceName))))

(defn add-parameter
  "Description copied from interface: SignableRequest

  name - The name of the request parameter. - `java.lang.String`
  value - The value of the request parameter. - `java.lang.String`"
  ([^DefaultRequest this ^java.lang.String name ^java.lang.String value]
    (-> this (.addParameter name value))))

(defn get-read-limit-info
  "Description copied from interface: ImmutableRequest

  returns: `com.amazonaws.ReadLimitInfo`"
  (^com.amazonaws.ReadLimitInfo [^DefaultRequest this]
    (-> this (.getReadLimitInfo))))

(defn set-endpoint
  "Description copied from interface: Request

  endpoint - The service endpoint to which this request should be sent. - `java.net.URI`"
  ([^DefaultRequest this ^java.net.URI endpoint]
    (-> this (.setEndpoint endpoint))))

(defn get-content-unwrapped
  "Description copied from interface: ImmutableRequest

  returns: The optional raw stream containing the payload data to include
           for this request, with all progress stream wrappers removed. - `java.io.InputStream`"
  (^java.io.InputStream [^DefaultRequest this]
    (-> this (.getContentUnwrapped))))

(defn get-endpoint
  "Description copied from interface: ImmutableRequest

  returns: The service endpoint to which this request should be sent. - `java.net.URI`"
  (^java.net.URI [^DefaultRequest this]
    (-> this (.getEndpoint))))

(defn get-resource-path
  "Description copied from interface: ImmutableRequest

  returns: The path to the resource being requested. - `java.lang.String`"
  (^java.lang.String [^DefaultRequest this]
    (-> this (.getResourcePath))))

(defn add-handler-context
  "Description copied from interface: HandlerContextAware

  key - the key for the property being set in the request. - `com.amazonaws.handlers.HandlerContextKey`
  value - the value for the property being set in the request. - `X`

  returns: `<X> void`"
  ([^DefaultRequest this ^com.amazonaws.handlers.HandlerContextKey key value]
    (-> this (.addHandlerContext key value))))

(defn get-http-method
  "Description copied from interface: ImmutableRequest

  returns: The HTTP method to use when sending this request. - `com.amazonaws.http.HttpMethodName`"
  (^com.amazonaws.http.HttpMethodName [^DefaultRequest this]
    (-> this (.getHttpMethod))))

(defn get-handler-context
  "Description copied from interface: HandlerContextAware

  key - the key for the context - `com.amazonaws.handlers.HandlerContextKey`

  returns: the context if present else null. - `<X> X`"
  ([^DefaultRequest this ^com.amazonaws.handlers.HandlerContextKey key]
    (-> this (.getHandlerContext key))))

(defn get-aws-request-metrics
  "Description copied from interface: Request

  returns: `com.amazonaws.util.AWSRequestMetrics`"
  (^com.amazonaws.util.AWSRequestMetrics [^DefaultRequest this]
    (-> this (.getAWSRequestMetrics))))

(defn with-parameter
  "Description copied from interface: Request

  name - The name of the request parameter. - `java.lang.String`
  value - The value of the request parameter. - `java.lang.String`

  returns: The updated request object. - `com.amazonaws.Request<T>`"
  (^com.amazonaws.Request [^DefaultRequest this ^java.lang.String name ^java.lang.String value]
    (-> this (.withParameter name value))))

(defn set-content
  "Description copied from interface: SignableRequest

  content - The optional stream containing the payload data to include for this request. - `java.io.InputStream`"
  ([^DefaultRequest this ^java.io.InputStream content]
    (-> this (.setContent content))))

(defn add-parameters
  "Description copied from interface: Request

  name - The name of the request parameter. - `java.lang.String`
  values - The value of the request parameter. - `java.util.List`"
  ([^DefaultRequest this ^java.lang.String name ^java.util.List values]
    (-> this (.addParameters name values))))

(defn get-time-offset
  "Description copied from interface: ImmutableRequest

  returns: The optional value for time offset (in seconds) for this request. - `int`"
  (^Integer [^DefaultRequest this]
    (-> this (.getTimeOffset))))

(defn get-headers
  "Description copied from interface: ImmutableRequest

  returns: A map of all the headers included in this request. - `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^DefaultRequest this]
    (-> this (.getHeaders))))

(defn get-content
  "Description copied from interface: ImmutableRequest

  returns: The optional stream containing the payload data to include for
           this request. - `java.io.InputStream`"
  (^java.io.InputStream [^DefaultRequest this]
    (-> this (.getContent))))

