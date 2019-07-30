(ns com.amazonaws.handlers.RequestHandler2
  "Interface for addition request handling in clients. A request handler is executed on a request
  object before it is sent to the client runtime to be executed.

  This interface deprecates RequestHandler by providing access to not only the AWS
  response, but also the associated http response via Response.

  Note TimingInfo is accessible via Request.getAWSRequestMetrics() and hence is
  omitted from the interface to reduce duplication by design."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.handlers RequestHandler2]))

(defn ->request-handler-2
  "Constructor."
  (^RequestHandler2 []
    (new RequestHandler2 )))

(defn *adapt
  "Returns an instance of request handler adapted to the RequestHandler2 interface from
   the given request handler implementing the deprecated RequestHandler interface.

  old - `com.amazonaws.handlers.RequestHandler`

  returns: `com.amazonaws.handlers.RequestHandler2`"
  (^com.amazonaws.handlers.RequestHandler2 [^com.amazonaws.handlers.RequestHandler old]
    (RequestHandler2/adapt old)))

(defn before-execution
  "Description copied from interface: IRequestHandler2

  request - the request passed in by the user - `com.amazonaws.AmazonWebServiceRequest`

  returns: the (possibly different) request to execute - `com.amazonaws.AmazonWebServiceRequest`"
  (^com.amazonaws.AmazonWebServiceRequest [^RequestHandler2 this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.beforeExecution request))))

(defn before-marshalling
  "Description copied from interface: IRequestHandler2

  request - the request passed in by the user - `com.amazonaws.AmazonWebServiceRequest`

  returns: the (possibly different) request to marshal - `com.amazonaws.AmazonWebServiceRequest`"
  (^com.amazonaws.AmazonWebServiceRequest [^RequestHandler2 this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.beforeMarshalling request))))

(defn before-request
  "Description copied from interface: IRequestHandler2

  request - The low level request being processed. - `com.amazonaws.Request`"
  ([^RequestHandler2 this ^com.amazonaws.Request request]
    (-> this (.beforeRequest request))))

(defn before-attempt
  "Description copied from interface: IRequestHandler2

  context - container for callback-related data; includes the request - `com.amazonaws.handlers.HandlerBeforeAttemptContext`"
  ([^RequestHandler2 this ^com.amazonaws.handlers.HandlerBeforeAttemptContext context]
    (-> this (.beforeAttempt context))))

(defn before-unmarshalling
  "Description copied from interface: IRequestHandler2

  request - The low level request being processed. - `com.amazonaws.Request`
  http-response - The Raw HTTP response before being unmarshalled - `com.amazonaws.http.HttpResponse`

  returns: HttpResponse to replace the actual response. May be a mutated version of the
           original or a completely new HttpResponse object - `com.amazonaws.http.HttpResponse`"
  (^com.amazonaws.http.HttpResponse [^RequestHandler2 this ^com.amazonaws.Request request ^com.amazonaws.http.HttpResponse http-response]
    (-> this (.beforeUnmarshalling request http-response))))

(defn after-attempt
  "Description copied from interface: IRequestHandler2

  context - container for the request as well as all possible results of the attempt - `com.amazonaws.handlers.HandlerAfterAttemptContext`"
  ([^RequestHandler2 this ^com.amazonaws.handlers.HandlerAfterAttemptContext context]
    (-> this (.afterAttempt context))))

(defn after-response
  "Description copied from interface: IRequestHandler2

  request - The low level request being processed. - `com.amazonaws.Request`
  response - The response generated from the specified request. - `com.amazonaws.Response`"
  ([^RequestHandler2 this ^com.amazonaws.Request request ^com.amazonaws.Response response]
    (-> this (.afterResponse request response))))

(defn after-error
  "Description copied from interface: IRequestHandler2

  request - The request that generated an error. - `com.amazonaws.Request`
  response - the response or null if the failure occurred before the response is made available - `com.amazonaws.Response`
  e - The error that resulted from executing the request. - `java.lang.Exception`"
  ([^RequestHandler2 this ^com.amazonaws.Request request ^com.amazonaws.Response response ^java.lang.Exception e]
    (-> this (.afterError request response e))))

