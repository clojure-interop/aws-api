(ns com.amazonaws.handlers.RequestHandler
  "Deprecated.
 by RequestHandler2.

  Interface for addition request handling in clients. A request handler is
  executed on a request object before it is sent to the client runtime
  to be executed."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.handlers RequestHandler]))

(defn before-request
  "Deprecated.

  request - The low level request being processed. - `com.amazonaws.Request`"
  ([^RequestHandler this ^com.amazonaws.Request request]
    (-> this (.beforeRequest request))))

(defn after-response
  "Deprecated.

  request - The low level request being processed. - `com.amazonaws.Request`
  response - The response generated from the specified request. - `java.lang.Object`
  timing-info - Timing information on the request's processing. - `com.amazonaws.util.TimingInfo`"
  ([^RequestHandler this ^com.amazonaws.Request request ^java.lang.Object response ^com.amazonaws.util.TimingInfo timing-info]
    (-> this (.afterResponse request response timing-info))))

(defn after-error
  "Deprecated.

  request - The request that generated an error. - `com.amazonaws.Request`
  e - The error that resulted from executing the request. - `java.lang.Exception`"
  ([^RequestHandler this ^com.amazonaws.Request request ^java.lang.Exception e]
    (-> this (.afterError request e))))

