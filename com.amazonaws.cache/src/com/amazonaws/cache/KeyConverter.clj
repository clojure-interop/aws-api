(ns com.amazonaws.cache.KeyConverter
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.cache KeyConverter]))

(defn get-key
  "request - `com.amazonaws.Request`

  returns: `java.lang.String`"
  (^java.lang.String [^KeyConverter this ^com.amazonaws.Request request]
    (-> this (.getKey request))))

