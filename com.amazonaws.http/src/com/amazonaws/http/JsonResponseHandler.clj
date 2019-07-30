(ns com.amazonaws.http.JsonResponseHandler
  "Default implementation of HttpResponseHandler that handles a successful response from an AWS
  service and unmarshalls the result using a JSON unmarshaller."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.http JsonResponseHandler]))

(defn ->json-response-handler
  "Constructor.

  Constructs a new response handler that will use the specified JSON unmarshaller to unmarshall
   the service response and uses the specified response element path to find the root of the
   business data in the service's response.

  response-unmarshaller - The JSON unmarshaller to use on the response. - `com.amazonaws.transform.Unmarshaller`
  simple-type-unmarshallers - List of unmarshallers to be used for scalar types. - `java.util.Map`
  custom-type-marshallers - List of custom unmarshallers to be used for special types. - `java.util.Map`
  json-factory - the json factory to be used for parsing the response. - `com.fasterxml.jackson.core.JsonFactory`
  needs-connection-left-open - `boolean`
  is-payload-json - `boolean`"
  (^JsonResponseHandler [^com.amazonaws.transform.Unmarshaller response-unmarshaller ^java.util.Map simple-type-unmarshallers ^java.util.Map custom-type-marshallers ^com.fasterxml.jackson.core.JsonFactory json-factory ^Boolean needs-connection-left-open ^Boolean is-payload-json]
    (new JsonResponseHandler response-unmarshaller simple-type-unmarshallers custom-type-marshallers json-factory needs-connection-left-open is-payload-json)))

(defn handle
  "Description copied from interface: HttpResponseHandler

  response - The HTTP response to handle, as received from an AWS service. - `com.amazonaws.http.HttpResponse`

  returns: An object of type T, as defined by individual implementations. - `com.amazonaws.AmazonWebServiceResponse<T>`

  throws: java.lang.Exception - If any problems are encountered handling the response."
  (^com.amazonaws.AmazonWebServiceResponse [^JsonResponseHandler this ^com.amazonaws.http.HttpResponse response]
    (-> this (.handle response))))

(defn needs-connection-left-open
  "Description copied from interface: HttpResponseHandler

  returns: True if this response handler requires that the underlying HTTP
           connection be left open, and not automatically closed, otherwise
           false. - `boolean`"
  (^Boolean [^JsonResponseHandler this]
    (-> this (.needsConnectionLeftOpen))))

