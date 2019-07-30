(ns com.amazonaws.Response
  "Response wrapper to provide access to not only the original AWS response
  but also the associated http response."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws Response]))

(defn ->response
  "Constructor.

  response - `T`
  http-response - `com.amazonaws.http.HttpResponse`"
  (^Response [response ^com.amazonaws.http.HttpResponse http-response]
    (new Response response http-response)))

(defn get-aws-response
  "returns: `T`"
  ([^Response this]
    (-> this (.getAwsResponse))))

(defn get-http-response
  "returns: `com.amazonaws.http.HttpResponse`"
  (^com.amazonaws.http.HttpResponse [^Response this]
    (-> this (.getHttpResponse))))

