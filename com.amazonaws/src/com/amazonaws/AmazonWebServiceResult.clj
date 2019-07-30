(ns com.amazonaws.AmazonWebServiceResult
  "Base type for all AWS response objects. Exposes metadata about the request such as the request
  id and access to details in the HTTP response."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws AmazonWebServiceResult]))

(defn ->amazon-web-service-result
  "Constructor."
  (^AmazonWebServiceResult []
    (new AmazonWebServiceResult )))

(defn get-sdk-response-metadata
  "returns: The response metadata associated with this request. - `T`"
  ([^AmazonWebServiceResult this]
    (-> this (.getSdkResponseMetadata))))

(defn set-sdk-response-metadata
  "sdk-response-metadata - `T`

  returns: `com.amazonaws.AmazonWebServiceResult<T>`"
  (^com.amazonaws.AmazonWebServiceResult [^AmazonWebServiceResult this sdk-response-metadata]
    (-> this (.setSdkResponseMetadata sdk-response-metadata))))

(defn get-sdk-http-metadata
  "returns: HTTP related metadata like headers and status code. - `com.amazonaws.http.SdkHttpMetadata`"
  (^com.amazonaws.http.SdkHttpMetadata [^AmazonWebServiceResult this]
    (-> this (.getSdkHttpMetadata))))

(defn set-sdk-http-metadata
  "sdk-http-metadata - `com.amazonaws.http.SdkHttpMetadata`

  returns: `com.amazonaws.AmazonWebServiceResult<T>`"
  (^com.amazonaws.AmazonWebServiceResult [^AmazonWebServiceResult this ^com.amazonaws.http.SdkHttpMetadata sdk-http-metadata]
    (-> this (.setSdkHttpMetadata sdk-http-metadata))))

