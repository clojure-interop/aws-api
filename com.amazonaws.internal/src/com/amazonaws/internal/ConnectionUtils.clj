(ns com.amazonaws.internal.ConnectionUtils
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.internal ConnectionUtils]))

(defn *get-instance
  "returns: `com.amazonaws.internal.ConnectionUtils`"
  (^com.amazonaws.internal.ConnectionUtils []
    (ConnectionUtils/getInstance )))

(defn connect-to-endpoint
  "endpoint - `java.net.URI`
  headers - `java.util.Map`

  returns: `java.net.HttpURLConnection`

  throws: java.io.IOException"
  (^java.net.HttpURLConnection [^ConnectionUtils this ^java.net.URI endpoint ^java.util.Map headers]
    (-> this (.connectToEndpoint endpoint headers))))

