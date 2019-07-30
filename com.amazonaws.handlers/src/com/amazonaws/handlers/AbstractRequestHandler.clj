(ns com.amazonaws.handlers.AbstractRequestHandler
  "Deprecated.
 by RequestHandler2.

  Simple implementation of RequestHandler to stub out required methods."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.handlers AbstractRequestHandler]))

(defn ->abstract-request-handler
  "Constructor.

  Deprecated."
  (^AbstractRequestHandler []
    (new AbstractRequestHandler )))

(defn before-request
  "Deprecated.

  request - The low level request being processed. - `com.amazonaws.Request`"
  ([^AbstractRequestHandler this ^com.amazonaws.Request request]
    (-> this (.beforeRequest request))))

(defn after-response
  "Deprecated.

  request - The low level request being processed. - `com.amazonaws.Request`
  response - The response generated from the specified request. - `java.lang.Object`
  timing-info - Timing information on the request's processing. - `com.amazonaws.util.TimingInfo`"
  ([^AbstractRequestHandler this ^com.amazonaws.Request request ^java.lang.Object response ^com.amazonaws.util.TimingInfo timing-info]
    (-> this (.afterResponse request response timing-info))))

(defn after-error
  "Deprecated.

  request - The request that generated an error. - `com.amazonaws.Request`
  e - The error that resulted from executing the request. - `java.lang.Exception`"
  ([^AbstractRequestHandler this ^com.amazonaws.Request request ^java.lang.Exception e]
    (-> this (.afterError request e))))

