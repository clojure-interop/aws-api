(ns com.amazonaws.cache.CacheLoader
  "Interface for providing objects to be loaded into a Cache."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.cache CacheLoader]))

(defn load
  "key - `K`

  returns: `V`"
  ([^CacheLoader this key]
    (-> this (.load key))))

