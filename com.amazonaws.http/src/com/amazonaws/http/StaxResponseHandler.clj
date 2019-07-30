(ns com.amazonaws.http.StaxResponseHandler
  "Default implementation of HttpResponseHandler that handles a successful
  response from an AWS service and unmarshalls the result using a StAX
  unmarshaller."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.http StaxResponseHandler]))

(defn ->stax-response-handler
  "Constructor.

  Constructs a new response handler that will use the specified StAX
   unmarshaller to unmarshall the service response and uses the specified
   response element path to find the root of the business data in the
   service's response.

  response-unmarshaller - The StAX unmarshaller to use on the response. - `com.amazonaws.transform.Unmarshaller`"
  (^StaxResponseHandler [^com.amazonaws.transform.Unmarshaller response-unmarshaller]
    (new StaxResponseHandler response-unmarshaller)))

(defn handle
  "Description copied from interface: HttpResponseHandler

  response - The HTTP response to handle, as received from an AWS service. - `com.amazonaws.http.HttpResponse`

  returns: An object of type T, as defined by individual implementations. - `com.amazonaws.AmazonWebServiceResponse<T>`

  throws: java.lang.Exception - If any problems are encountered handling the response."
  (^com.amazonaws.AmazonWebServiceResponse [^StaxResponseHandler this ^com.amazonaws.http.HttpResponse response]
    (-> this (.handle response))))

(defn needs-connection-left-open
  "Since this response handler completely consumes all the data from the
   underlying HTTP connection during the handle method, we don't need to
   keep the HTTP connection open.

  returns: True if this response handler requires that the underlying HTTP
           connection be left open, and not automatically closed, otherwise
           false. - `boolean`"
  (^Boolean [^StaxResponseHandler this]
    (-> this (.needsConnectionLeftOpen))))

