(ns com.amazonaws.cache.Cache
  "Holds an instance of the CacheLoader"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.cache Cache]))

(defn get
  "key - `K`

  returns: `V`"
  ([^Cache this key]
    (-> this (.get key))))

(defn put
  "key - `K`
  value - `V`"
  ([^Cache this key value]
    (-> this (.put key value))))

