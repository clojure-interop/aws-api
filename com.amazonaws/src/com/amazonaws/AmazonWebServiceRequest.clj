(ns com.amazonaws.AmazonWebServiceRequest
  "Base class for all user facing web service requests."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws AmazonWebServiceRequest]))

(defn ->amazon-web-service-request
  "Constructor."
  (^AmazonWebServiceRequest []
    (new AmazonWebServiceRequest )))

(def *-noop
  "Static Constant.

  type: com.amazonaws.AmazonWebServiceRequest"
  AmazonWebServiceRequest/NOOP)

(defn put-custom-request-header
  "Put a new custom header to the map of custom header names to custom header values, and return
   the previous value if the header has already been set in this map.

   Any custom headers that are defined are used in the HTTP request to the AWS service. These
   headers will be silently ignored in the event that AWS does not recognize them.

   NOTE: Custom header values set via this method will overwrite any conflicting values coming
   from the request parameters.

  name - The name of the header to add - `java.lang.String`
  value - The value of the header to add - `java.lang.String`

  returns: the previous value for the name if it was set, null otherwise - `java.lang.String`"
  (^java.lang.String [^AmazonWebServiceRequest this ^java.lang.String name ^java.lang.String value]
    (-> this (.putCustomRequestHeader name value))))

(defn get-general-progress-listener
  "Returns the optional progress listener for receiving updates about the progress of the
   request.

  returns: the optional progress listener for receiving updates about the progress of the
           request. - `com.amazonaws.event.ProgressListener`"
  (^com.amazonaws.event.ProgressListener [^AmazonWebServiceRequest this]
    (-> this (.getGeneralProgressListener))))

(defn get-clone-source
  "Returns the source object from which the current object was cloned; or null if there isn't
   one.

  returns: `com.amazonaws.AmazonWebServiceRequest`"
  (^com.amazonaws.AmazonWebServiceRequest [^AmazonWebServiceRequest this]
    (-> this (.getCloneSource))))

(defn with-request-credentials-provider
  "Sets the optional credentials provider to use for this request, overriding the default credentials
   provider at the client level.

  credentials-provider - The optional AWS security credentials provider to use for this request, overriding the default credentials provider at the client level. - `com.amazonaws.auth.AWSCredentialsProvider`

  returns: A reference to this updated object so that method calls can be chained together. - `<T extends com.amazonaws.AmazonWebServiceRequest> T`"
  ([^AmazonWebServiceRequest this ^com.amazonaws.auth.AWSCredentialsProvider credentials-provider]
    (-> this (.withRequestCredentialsProvider credentials-provider))))

(defn get-request-credentials-provider
  "Returns the optional credentials provider to use to sign this request, overriding the default
   credentials provider at the client level.

  returns: The optional credentials provider to use to sign this request, overriding the default
           credentials provider at the client level. - `com.amazonaws.auth.AWSCredentialsProvider`"
  (^com.amazonaws.auth.AWSCredentialsProvider [^AmazonWebServiceRequest this]
    (-> this (.getRequestCredentialsProvider))))

(defn set-sdk-client-execution-timeout
  "Sets the amount of time (in milliseconds) to allow the client to complete the execution of
   an API call. This timeout covers the entire client execution except for marshalling. This
   includes request handler execution, all HTTP request including retries, unmarshalling, etc.

   This feature requires buffering the entire response (for non-streaming APIs) into memory to
   enforce a hard timeout when reading the response. For APIs that return large responses this
   could be expensive.


   The client execution timeout feature doesn't have strict guarantees on how quickly a request
   is aborted when the timeout is breached. The typical case aborts the request within a few
   milliseconds but there may occasionally be requests that don't get aborted until several
   seconds after the timer has been breached. Because of this the client execution timeout
   feature should not be used when absolute precision is needed.


   This may be used together with setSdkRequestTimeout(int) to
   enforce both a timeout on each individual HTTP request (i.e. each retry) and the total time
   spent on all requests across retries (i.e. the 'client execution' time). A non-positive value
   disables this feature.


   Note: This feature is not compatible with Java 1.6.

  sdk-client-execution-timeout - The amount of time (in milliseconds) to allow the client to complete the execution of an API call. A non-positive value disables the timeout for this request. - `int`"
  ([^AmazonWebServiceRequest this ^Integer sdk-client-execution-timeout]
    (-> this (.setSdkClientExecutionTimeout sdk-client-execution-timeout))))

(defn get-custom-query-parameters
  "returns: the immutable map of custom query parameters. The parameter value is modeled as a
           list of strings because multiple values can be specified for the same parameter name. - `java.util.Map<java.lang.String,java.util.List<java.lang.String>>`"
  (^java.util.Map [^AmazonWebServiceRequest this]
    (-> this (.getCustomQueryParameters))))

(defn get-read-limit
  "Description copied from interface: ReadLimitInfo

  returns: `int`"
  (^Integer [^AmazonWebServiceRequest this]
    (-> this (.getReadLimit))))

(defn set-request-metric-collector
  "Sets a request level request metric collector which takes precedence over the ones at the
   http client level and AWS SDK level.

  request-metric-collector - `com.amazonaws.metrics.RequestMetricCollector`"
  ([^AmazonWebServiceRequest this ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (-> this (.setRequestMetricCollector request-metric-collector))))

(defn get-request-credentials
  "Deprecated. by getRequestCredentialsProvider()

  returns: The optional credentials to use to sign this request, overriding the default
           credentials set at the client level. - `com.amazonaws.auth.AWSCredentials`"
  (^com.amazonaws.auth.AWSCredentials [^AmazonWebServiceRequest this]
    (-> this (.getRequestCredentials))))

(defn with-request-metric-collector
  "Specifies a request level metric collector which takes precedence over the ones at the http
   client level and AWS SDK level.

  metric-collector - `com.amazonaws.metrics.RequestMetricCollector`

  returns: `<T extends com.amazonaws.AmazonWebServiceRequest> T`"
  ([^AmazonWebServiceRequest this ^com.amazonaws.metrics.RequestMetricCollector metric-collector]
    (-> this (.withRequestMetricCollector metric-collector))))

(defn put-custom-query-parameter
  "Add a custom query parameter for the request. Since multiple values are allowed for the same
   query parameter, this method does NOT overwrite any existing parameter values in the request.

   Any custom query parameters that are defined are used in the HTTP request to the AWS service.

  name - The name of the query parameter - `java.lang.String`
  value - The value of the query parameter. Only the parameter name will be added in the URI if the value is set to null. For example, putCustomQueryParameter(\"param\", null) will be serialized to \"?param\", while putCustomQueryParameter(\"param\", \"\") will be serialized to \"?param=\". - `java.lang.String`"
  ([^AmazonWebServiceRequest this ^java.lang.String name ^java.lang.String value]
    (-> this (.putCustomQueryParameter name value))))

(defn set-request-credentials
  "Deprecated. by setRequestCredentialsProvider(AWSCredentialsProvider). If you must use AWSCredentials you
   can wrap it with a AWSStaticCredentialsProvider.

  credentials - The optional AWS security credentials to use for this request, overriding the default credentials set at the client level. - `com.amazonaws.auth.AWSCredentials`"
  ([^AmazonWebServiceRequest this ^com.amazonaws.auth.AWSCredentials credentials]
    (-> this (.setRequestCredentials credentials))))

(defn with-general-progress-listener
  "Sets the optional progress listener for receiving updates about the progress of the request,
   and returns a reference to this object so that method calls can be chained together.

  progress-listener - The new progress listener. - `com.amazonaws.event.ProgressListener`

  returns: A reference to this updated object so that method calls can be chained together. - `<T extends com.amazonaws.AmazonWebServiceRequest> T`"
  ([^AmazonWebServiceRequest this ^com.amazonaws.event.ProgressListener progress-listener]
    (-> this (.withGeneralProgressListener progress-listener))))

(defn set-sdk-request-timeout
  "Sets the amount of time to wait (in milliseconds) for the request to complete before giving
   up and timing out. A non-positive value disables this feature.

   This feature requires buffering the entire response (for non-streaming APIs) into memory to
   enforce a hard timeout when reading the response. For APIs that return large responses this
   could be expensive.


   The request timeout feature doesn't have strict guarantees on how quickly a request is
   aborted when the timeout is breached. The typical case aborts the request within a few
   milliseconds but there may occasionally be requests that don't get aborted until several
   seconds after the timer has been breached. Because of this the request timeout feature should
   not be used when absolute precision is needed.


   Note: This feature is not compatible with Java 1.6.

  sdk-request-timeout - The amount of time to wait (in milliseconds) for the request to complete before giving up and timing out. A non-positive value disables the timeout for this request. - `int`"
  ([^AmazonWebServiceRequest this ^Integer sdk-request-timeout]
    (-> this (.setSdkRequestTimeout sdk-request-timeout))))

(defn get-request-metric-collector
  "Returns a request level metric collector; or null if not specified.

  returns: `com.amazonaws.metrics.RequestMetricCollector`"
  (^com.amazonaws.metrics.RequestMetricCollector [^AmazonWebServiceRequest this]
    (-> this (.getRequestMetricCollector))))

(defn with-sdk-client-execution-timeout
  "Sets the amount of time (in milliseconds) to allow the client to complete the execution of
   an API call. This timeout covers the entire client execution except for marshalling. This
   includes request handler execution, all HTTP request including retries, unmarshalling, etc.

   This feature requires buffering the entire response (for non-streaming APIs) into memory to
   enforce a hard timeout when reading the response. For APIs that return large responses this
   could be expensive.


   The client execution timeout feature doesn't have strict guarantees on how quickly a request
   is aborted when the timeout is breached. The typical case aborts the request within a few
   milliseconds but there may occasionally be requests that don't get aborted until several
   seconds after the timer has been breached. Because of this the client execution timeout
   feature should not be used when absolute precision is needed.


   This may be used together with setSdkRequestTimeout(int) to
   enforce both a timeout on each individual HTTP request (i.e. each retry) and the total time
   spent on all requests across retries (i.e. the 'client execution' time). A non-positive value
   disables this feature.


   Note: This feature is not compatible with Java 1.6.

  sdk-client-execution-timeout - The amount of time (in milliseconds) to allow the client to complete the execution of an API call. A non-positive value disables the timeout for this request. - `int`

  returns: The updated AmazonWebServiceRequest object for method chaining - `<T extends com.amazonaws.AmazonWebServiceRequest> T`"
  ([^AmazonWebServiceRequest this ^Integer sdk-client-execution-timeout]
    (-> this (.withSdkClientExecutionTimeout sdk-client-execution-timeout))))

(defn with-sdk-request-timeout
  "Sets the amount of time to wait (in milliseconds) for the request to complete before giving
   up and timing out. A non-positive value disables this feature. Returns the updated
   AmazonWebServiceRequest object so that additional method calls may be chained together.

   This feature requires buffering the entire response (for non-streaming APIs) into memory to
   enforce a hard timeout when reading the response. For APIs that return large responses this
   could be expensive.


   The request timeout feature doesn't have strict guarantees on how quickly a request is
   aborted when the timeout is breached. The typical case aborts the request within a few
   milliseconds but there may occasionally be requests that don't get aborted until several
   seconds after the timer has been breached. Because of this the request timeout feature should
   not be used when absolute precision is needed.


   Note: This feature is not compatible with Java 1.6.

  sdk-request-timeout - The amount of time to wait (in milliseconds) for the request to complete before giving up and timing out. A non-positive value disables the timeout for this request. - `int`

  returns: The updated AmazonWebServiceRequest object. - `<T extends com.amazonaws.AmazonWebServiceRequest> T`"
  ([^AmazonWebServiceRequest this ^Integer sdk-request-timeout]
    (-> this (.withSdkRequestTimeout sdk-request-timeout))))

(defn get-sdk-request-timeout
  "Returns the amount of time to wait (in milliseconds) for the request to complete before
   giving up and timing out. A non-positive value disables this feature.

   This feature requires buffering the entire response (for non-streaming APIs) into memory to
   enforce a hard timeout when reading the response. For APIs that return large responses this
   could be expensive.


   The request timeout feature doesn't have strict guarantees on how quickly a request is
   aborted when the timeout is breached. The typical case aborts the request within a few
   milliseconds but there may occasionally be requests that don't get aborted until several
   seconds after the timer has been breached. Because of this the request timeout feature should
   not be used when absolute precision is needed.


   Note: This feature is not compatible with Java 1.6.

  returns: The amount of time to wait (in milliseconds) for the request to complete before
           giving up and timing out. A non-positive value disables the timeout for this request. - `java.lang.Integer`"
  (^java.lang.Integer [^AmazonWebServiceRequest this]
    (-> this (.getSdkRequestTimeout))))

(defn get-custom-request-headers
  "Returns an immutable map of custom header names to header values.

  returns: The immutable map of custom header names to header values. - `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^AmazonWebServiceRequest this]
    (-> this (.getCustomRequestHeaders))))

(defn add-handler-context
  "Description copied from interface: HandlerContextAware

  key - the key for the property being set in the request. - `com.amazonaws.handlers.HandlerContextKey`
  value - the value for the property being set in the request. - `X`

  returns: `<X> void`"
  ([^AmazonWebServiceRequest this ^com.amazonaws.handlers.HandlerContextKey key value]
    (-> this (.addHandlerContext key value))))

(defn clone
  "Creates a shallow clone of this object for all fields except the handler context. Explicitly does not clone the
   deep structure of the other fields in the message.

  returns: `com.amazonaws.AmazonWebServiceRequest`"
  (^com.amazonaws.AmazonWebServiceRequest [^AmazonWebServiceRequest this]
    (-> this (.clone))))

(defn set-request-credentials-provider
  "Sets the optional credentials provider to use for this request, overriding the default credentials
   provider at the client level.

  credentials-provider - The optional AWS security credentials provider to use for this request, overriding the default credentials provider at the client level. - `com.amazonaws.auth.AWSCredentialsProvider`"
  ([^AmazonWebServiceRequest this ^com.amazonaws.auth.AWSCredentialsProvider credentials-provider]
    (-> this (.setRequestCredentialsProvider credentials-provider))))

(defn get-clone-root
  "Returns the root object from which the current object was cloned; or null if there isn't one.

  returns: `com.amazonaws.AmazonWebServiceRequest`"
  (^com.amazonaws.AmazonWebServiceRequest [^AmazonWebServiceRequest this]
    (-> this (.getCloneRoot))))

(defn get-sdk-client-execution-timeout
  "Returns the amount of time (in milliseconds) to allow the client to complete the execution of
   an API call. This timeout covers the entire client execution except for marshalling. This
   includes request handler execution, all HTTP request including retries, unmarshalling, etc.

   This feature requires buffering the entire response (for non-streaming APIs) into memory to
   enforce a hard timeout when reading the response. For APIs that return large responses this
   could be expensive.


   The client execution timeout feature doesn't have strict guarantees on how quickly a request
   is aborted when the timeout is breached. The typical case aborts the request within a few
   milliseconds but there may occasionally be requests that don't get aborted until several
   seconds after the timer has been breached. Because of this the client execution timeout
   feature should not be used when absolute precision is needed.


   This may be used together with setSdkRequestTimeout(int) to
   enforce both a timeout on each individual HTTP request (i.e. each retry) and the total time
   spent on all requests across retries (i.e. the 'client execution' time). A non-positive value
   disables this feature.


   Note: This feature is not compatible with Java 1.6.

  returns: The amount of time (in milliseconds) to allow the client to complete the execution of
           an API call. A non-positive value disables the timeout for this request. - `java.lang.Integer`"
  (^java.lang.Integer [^AmazonWebServiceRequest this]
    (-> this (.getSdkClientExecutionTimeout))))

(defn get-handler-context
  "Description copied from interface: HandlerContextAware

  key - the key for the context - `com.amazonaws.handlers.HandlerContextKey`

  returns: the context if present else null. - `<X> X`"
  ([^AmazonWebServiceRequest this ^com.amazonaws.handlers.HandlerContextKey key]
    (-> this (.getHandlerContext key))))

(defn get-request-client-options
  "Gets the options stored with this request object. Intended for internal use only.

  returns: `com.amazonaws.RequestClientOptions`"
  (^com.amazonaws.RequestClientOptions [^AmazonWebServiceRequest this]
    (-> this (.getRequestClientOptions))))

(defn set-general-progress-listener
  "Sets the optional progress listener for receiving updates about the progress of the request.

  progress-listener - The new progress listener. - `com.amazonaws.event.ProgressListener`"
  ([^AmazonWebServiceRequest this ^com.amazonaws.event.ProgressListener progress-listener]
    (-> this (.setGeneralProgressListener progress-listener))))

