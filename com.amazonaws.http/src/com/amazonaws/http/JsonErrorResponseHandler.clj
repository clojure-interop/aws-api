(ns com.amazonaws.http.JsonErrorResponseHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.http JsonErrorResponseHandler]))

(defn ->json-error-response-handler
  "Constructor.

  error-unmarshallers - `java.util.List`
  error-code-parser - `com.amazonaws.internal.http.ErrorCodeParser`
  error-message-parser - `com.amazonaws.internal.http.JsonErrorMessageParser`
  json-factory - `com.fasterxml.jackson.core.JsonFactory`"
  (^JsonErrorResponseHandler [^java.util.List error-unmarshallers ^com.amazonaws.internal.http.ErrorCodeParser error-code-parser ^com.amazonaws.internal.http.JsonErrorMessageParser error-message-parser ^com.fasterxml.jackson.core.JsonFactory json-factory]
    (new JsonErrorResponseHandler error-unmarshallers error-code-parser error-message-parser json-factory)))

(defn needs-connection-left-open
  "Description copied from interface: HttpResponseHandler

  returns: True if this response handler requires that the underlying HTTP
           connection be left open, and not automatically closed, otherwise
           false. - `boolean`"
  (^Boolean [^JsonErrorResponseHandler this]
    (-> this (.needsConnectionLeftOpen))))

(defn handle
  "Description copied from interface: HttpResponseHandler

  response - The HTTP response to handle, as received from an AWS service. - `com.amazonaws.http.HttpResponse`

  returns: An object of type T, as defined by individual implementations. - `com.amazonaws.AmazonServiceException`

  throws: java.lang.Exception - If any problems are encountered handling the response."
  (^com.amazonaws.AmazonServiceException [^JsonErrorResponseHandler this ^com.amazonaws.http.HttpResponse response]
    (-> this (.handle response))))

