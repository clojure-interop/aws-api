(ns com.amazonaws.handlers.IRequestHandler2
  "Interface for RequestHandler2. Do not use this outside the core SDK. We can and will add
  methods to this interface in the future. Extend RequestHandler2 to implement a custom
  request handler."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.handlers IRequestHandler2]))

(defn before-execution
  "Runs any additional processing logic on the specified request object as soon as the request
   is provided to the service client.

   This request handler is excluded from the client execution time metrics and is run on the
   application's thread, even for asynchronous requests.

   Warning: Modifications to this message will leak out to the user, who might reuse the request
   object without realizing that it was modified as part of sending it the first time. For this
   reason, we recommend that you only modify the request in the beforeRequest(Request)
   method. If you require data that is not available in that method, you should create a
   AmazonWebServiceRequest.clone() of the request (which performs a deep copy of the
   handler context map), add any context data you require in the beforeRequest(Request)
   method using AmazonWebServiceRequest.addHandlerContext(HandlerContextKey, Object), and
   return your cloned message from this method. You can then extract that data for use in the
   request using HandlerContextAware.getHandlerContext(HandlerContextKey).

  request - the request passed in by the user - `com.amazonaws.AmazonWebServiceRequest`

  returns: the (possibly different) request to execute - `com.amazonaws.AmazonWebServiceRequest`"
  (^com.amazonaws.AmazonWebServiceRequest [^IRequestHandler2 this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.beforeExecution request))))

(defn before-marshalling
  "Runs any additional processing logic on the specified request object before it is marshaled
   into an HTTP request.

   Warning: Modifications to this message will leak out to the user, who might reuse the request
   object without realizing that it was modified as part of sending it the first time. For this
   reason, we recommend that you only modify the request in the beforeRequest(Request)
   method. If you require data that is not available in that method, you should create a
   AmazonWebServiceRequest.clone() of the request (which performs a deep copy of the
   handler context map), add any context data you require in the beforeRequest(Request)
   method using AmazonWebServiceRequest.addHandlerContext(HandlerContextKey, Object), and
   return your cloned message from this method. You can then extract that data for use in the
   request using HandlerContextAware.getHandlerContext(HandlerContextKey).

  request - the request passed in by the user - `com.amazonaws.AmazonWebServiceRequest`

  returns: the (possibly different) request to marshal - `com.amazonaws.AmazonWebServiceRequest`"
  (^com.amazonaws.AmazonWebServiceRequest [^IRequestHandler2 this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.beforeMarshalling request))))

(defn before-request
  "Runs any additional processing logic on the specified request (before it is executed by the
   client runtime).

  request - The low level request being processed. - `com.amazonaws.Request`"
  ([^IRequestHandler2 this ^com.amazonaws.Request request]
    (-> this (.beforeRequest request))))

(defn before-attempt
  "Runs any additional processing logic on a request before each individual attempt is made.

  context - container for callback-related data; includes the request - `com.amazonaws.handlers.HandlerBeforeAttemptContext`"
  ([^IRequestHandler2 this ^com.amazonaws.handlers.HandlerBeforeAttemptContext context]
    (-> this (.beforeAttempt context))))

(defn before-unmarshalling
  "Runs any additional processing logic on the specified response before it's unmarshalled. This
   callback is only invoked on successful responses that will be unmarshalled into an
   appropriate modeled class and not for unsuccessful responses that will be unmarshalled into a
   subclass of AmazonServiceException

  request - The low level request being processed. - `com.amazonaws.Request`
  http-response - The Raw HTTP response before being unmarshalled - `com.amazonaws.http.HttpResponse`

  returns: HttpResponse to replace the actual response. May be a mutated version of the
           original or a completely new HttpResponse object - `com.amazonaws.http.HttpResponse`"
  (^com.amazonaws.http.HttpResponse [^IRequestHandler2 this ^com.amazonaws.Request request ^com.amazonaws.http.HttpResponse http-response]
    (-> this (.beforeUnmarshalling request http-response))))

(defn after-attempt
  "Runs any additional processing logic on a request after each individual attempt.  Callback is
   invoked whether or not the attempt resulted in a successful response or an error.  This callback
   is invoked within a finally block and so any exceptions it generates will \"replace\" the current
   exception, if one is outstanding.

  context - container for the request as well as all possible results of the attempt - `com.amazonaws.handlers.HandlerAfterAttemptContext`"
  ([^IRequestHandler2 this ^com.amazonaws.handlers.HandlerAfterAttemptContext context]
    (-> this (.afterAttempt context))))

(defn after-response
  "Runs any additional processing logic on the specified request (after is has been executed by
   the client runtime).

  request - The low level request being processed. - `com.amazonaws.Request`
  response - The response generated from the specified request. - `com.amazonaws.Response`"
  ([^IRequestHandler2 this ^com.amazonaws.Request request ^com.amazonaws.Response response]
    (-> this (.afterResponse request response))))

(defn after-error
  "Runs any additional processing logic on a request after it has failed.  This callback is invoked
   from a catch block.  If it generates an exception, the original AmazonClientException will be lost.

  request - The request that generated an error. - `com.amazonaws.Request`
  response - the response or null if the failure occurred before the response is made available - `com.amazonaws.Response`
  e - The error that resulted from executing the request. - `java.lang.Exception`"
  ([^IRequestHandler2 this ^com.amazonaws.Request request ^com.amazonaws.Response response ^java.lang.Exception e]
    (-> this (.afterError request response e))))

