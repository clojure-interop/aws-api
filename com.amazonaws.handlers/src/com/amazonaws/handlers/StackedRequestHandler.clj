(ns com.amazonaws.handlers.StackedRequestHandler
  "Composite RequestHandler2 to execute a chain of RequestHandler2 implementations
  in stack order. That is if you have request handlers R1, R2, R3 the order of execution is as
  follows



  R1.beforeMarshalling
  R2.beforeMarshalling
  R3.beforeMarshalling

  R1.beforeRequest
  R2.beforeRequest
  R3.beforeRequest

  R3.beforeUnmarshalling
  R2.beforeUnmarshalling
  R1.beforeUnmarshalling

  R3.after(Response|Error)
  R2.after(Response|Error)
  R1.after(Response|Error)"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.handlers StackedRequestHandler]))

(defn ->stacked-request-handler
  "Constructor.

  request-handlers - `com.amazonaws.handlers.RequestHandler2`"
  (^StackedRequestHandler [^com.amazonaws.handlers.RequestHandler2 request-handlers]
    (new StackedRequestHandler request-handlers)))

(defn before-execution
  "Description copied from interface: IRequestHandler2

  orig-request - the request passed in by the user - `com.amazonaws.AmazonWebServiceRequest`

  returns: the (possibly different) request to execute - `com.amazonaws.AmazonWebServiceRequest`"
  (^com.amazonaws.AmazonWebServiceRequest [^StackedRequestHandler this ^com.amazonaws.AmazonWebServiceRequest orig-request]
    (-> this (.beforeExecution orig-request))))

(defn before-marshalling
  "Description copied from interface: IRequestHandler2

  orig-request - the request passed in by the user - `com.amazonaws.AmazonWebServiceRequest`

  returns: the (possibly different) request to marshal - `com.amazonaws.AmazonWebServiceRequest`"
  (^com.amazonaws.AmazonWebServiceRequest [^StackedRequestHandler this ^com.amazonaws.AmazonWebServiceRequest orig-request]
    (-> this (.beforeMarshalling orig-request))))

(defn before-request
  "Description copied from interface: IRequestHandler2

  request - The low level request being processed. - `com.amazonaws.Request`"
  ([^StackedRequestHandler this ^com.amazonaws.Request request]
    (-> this (.beforeRequest request))))

(defn before-attempt
  "Description copied from interface: IRequestHandler2

  context - container for callback-related data; includes the request - `com.amazonaws.handlers.HandlerBeforeAttemptContext`"
  ([^StackedRequestHandler this ^com.amazonaws.handlers.HandlerBeforeAttemptContext context]
    (-> this (.beforeAttempt context))))

(defn before-unmarshalling
  "Description copied from interface: IRequestHandler2

  request - The low level request being processed. - `com.amazonaws.Request`
  orig-http-response - The Raw HTTP response before being unmarshalled - `com.amazonaws.http.HttpResponse`

  returns: HttpResponse to replace the actual response. May be a mutated version of the
           original or a completely new HttpResponse object - `com.amazonaws.http.HttpResponse`"
  (^com.amazonaws.http.HttpResponse [^StackedRequestHandler this ^com.amazonaws.Request request ^com.amazonaws.http.HttpResponse orig-http-response]
    (-> this (.beforeUnmarshalling request orig-http-response))))

(defn after-attempt
  "Description copied from interface: IRequestHandler2

  context - container for the request as well as all possible results of the attempt - `com.amazonaws.handlers.HandlerAfterAttemptContext`"
  ([^StackedRequestHandler this ^com.amazonaws.handlers.HandlerAfterAttemptContext context]
    (-> this (.afterAttempt context))))

(defn after-response
  "Description copied from interface: IRequestHandler2

  request - The low level request being processed. - `com.amazonaws.Request`
  response - The response generated from the specified request. - `com.amazonaws.Response`"
  ([^StackedRequestHandler this ^com.amazonaws.Request request ^com.amazonaws.Response response]
    (-> this (.afterResponse request response))))

(defn after-error
  "Description copied from interface: IRequestHandler2

  request - The request that generated an error. - `com.amazonaws.Request`
  response - the response or null if the failure occurred before the response is made available - `com.amazonaws.Response`
  e - The error that resulted from executing the request. - `java.lang.Exception`"
  ([^StackedRequestHandler this ^com.amazonaws.Request request ^com.amazonaws.Response response ^java.lang.Exception e]
    (-> this (.afterError request response e))))

