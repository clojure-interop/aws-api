(ns com.amazonaws.http.SdkHttpMetadata
  "Metadata about the HTTP response."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.http SdkHttpMetadata]))

(defn *from
  "Static factory to create an SdkHttpMetadata from the details in a HttpResponse.

  http-response - `com.amazonaws.http.HttpResponse`

  returns: `com.amazonaws.http.SdkHttpMetadata`"
  (^com.amazonaws.http.SdkHttpMetadata [^com.amazonaws.http.HttpResponse http-response]
    (SdkHttpMetadata/from http-response)))

(defn get-http-headers
  "returns: All HTTP headers in response. - `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^SdkHttpMetadata this]
    (-> this (.getHttpHeaders))))

(defn get-http-status-code
  "returns: HTTP status code of response. - `int`"
  (^Integer [^SdkHttpMetadata this]
    (-> this (.getHttpStatusCode))))

