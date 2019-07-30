(ns com.amazonaws.http.HttpResponseHandler
  "Responsible for handling an HTTP response and returning an object of type T.
  For example, a typical response handler might accept a response, and
  translate it into a concrete typed object."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.http HttpResponseHandler]))

(defn handle
  "Accepts an HTTP response object, and returns an object of type T.
   Individual implementations may choose to handle the response however they
   need to, and return any type that they need to.

  response - The HTTP response to handle, as received from an AWS service. - `com.amazonaws.http.HttpResponse`

  returns: An object of type T, as defined by individual implementations. - `T`

  throws: java.lang.Exception - If any problems are encountered handling the response."
  ([^HttpResponseHandler this ^com.amazonaws.http.HttpResponse response]
    (-> this (.handle response))))

(defn needs-connection-left-open
  "Indicates if this response handler requires that the underlying HTTP
   connection not be closed automatically after the response is
   handled.

   For example, if the object returned by this response handler manually
   manages the stream of data from the HTTP connection, and doesn't read all
   the data from the connection in the handle(HttpResponse) method,
   this method can be used to prevent the underlying connection from being
   prematurely closed.

   Response handlers should use this option very carefully, since it means
   that resource cleanup is no longer handled automatically, and if
   neglected, can result in the client runtime running out of resources for
   new HTTP connections.

  returns: True if this response handler requires that the underlying HTTP
           connection be left open, and not automatically closed, otherwise
           false. - `boolean`"
  (^Boolean [^HttpResponseHandler this]
    (-> this (.needsConnectionLeftOpen))))

