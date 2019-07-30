(ns com.amazonaws.http.DefaultErrorResponseHandler
  "Implementation of HttpResponseHandler that handles only error responses from Amazon Web Services.
  A list of unmarshallers is passed into the constructor, and while handling a response, each
  unmarshaller is tried, in order, until one is found that can successfully unmarshall the error
  response.  If no unmarshaller is found that can unmarshall the error response, a generic
  AmazonServiceException is created and populated with the AWS error response information (error
  message, AWS error code, AWS request ID, etc)."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.http DefaultErrorResponseHandler]))

(defn ->default-error-response-handler
  "Constructor.

  Constructs a new DefaultErrorResponseHandler that will handle error responses from Amazon
   services using the specified list of unmarshallers. Each unmarshaller will be tried, in
   order, until one is found that can unmarshall the error response.

  unmarshaller-list - The list of unmarshallers to try using when handling an error response. - `java.util.List`"
  (^DefaultErrorResponseHandler [^java.util.List unmarshaller-list]
    (new DefaultErrorResponseHandler unmarshaller-list)))

(defn handle
  "Description copied from interface: HttpResponseHandler

  error-response - The HTTP response to handle, as received from an AWS service. - `com.amazonaws.http.HttpResponse`

  returns: An object of type T, as defined by individual implementations. - `com.amazonaws.AmazonServiceException`

  throws: java.lang.Exception - If any problems are encountered handling the response."
  (^com.amazonaws.AmazonServiceException [^DefaultErrorResponseHandler this ^com.amazonaws.http.HttpResponse error-response]
    (-> this (.handle error-response))))

(defn needs-connection-left-open
  "Since this response handler completely consumes all the data from the underlying HTTP
   connection during the handle method, we don't need to keep the HTTP connection open.

  returns: True if this response handler requires that the underlying HTTP
           connection be left open, and not automatically closed, otherwise
           false. - `boolean`"
  (^Boolean [^DefaultErrorResponseHandler this]
    (-> this (.needsConnectionLeftOpen))))

