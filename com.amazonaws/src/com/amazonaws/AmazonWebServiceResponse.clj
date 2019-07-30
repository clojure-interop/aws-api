(ns com.amazonaws.AmazonWebServiceResponse
  "Represents the response from an AWS service, including the result payload and
  any response metadata. AWS response metadata consists primarily of the AWS
  request ID, which can be used for debugging purposes when services aren't
  acting as expected."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws AmazonWebServiceResponse]))

(defn ->amazon-web-service-response
  "Constructor."
  (^AmazonWebServiceResponse []
    (new AmazonWebServiceResponse )))

(defn get-result
  "Returns the result contained by this response.

  returns: The result contained by this response. - `T`"
  ([^AmazonWebServiceResponse this]
    (-> this (.getResult))))

(defn set-result
  "Sets the result contained by this response.

  result - The result contained by this response. - `T`"
  ([^AmazonWebServiceResponse this result]
    (-> this (.setResult result))))

(defn set-response-metadata
  "Sets the response metadata associated with this response.

  response-metadata - The response metadata for this response. - `com.amazonaws.ResponseMetadata`"
  ([^AmazonWebServiceResponse this ^com.amazonaws.ResponseMetadata response-metadata]
    (-> this (.setResponseMetadata response-metadata))))

(defn get-response-metadata
  "Returns the response metadata for this response. Response metadata
   provides additional information about a response that isn't necessarily
   directly part of the data the service is returning. Response metadata is
   primarily used for debugging issues with AWS support when a service isn't
   working as expected.

  returns: The response metadata for this response. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonWebServiceResponse this]
    (-> this (.getResponseMetadata))))

(defn get-request-id
  "Returns the AWS request ID from the response metadata section of an AWS
   response.

  returns: The AWS request ID from the response metadata section of an AWS
           response. - `java.lang.String`"
  (^java.lang.String [^AmazonWebServiceResponse this]
    (-> this (.getRequestId))))

