(ns com.amazonaws.internal.FIFOCache
  "A bounded cache that has a FIFO eviction policy when the cache is full."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.internal FIFOCache]))

(defn ->fifo-cache
  "Constructor.

  max-size - the maximum number of entries of the cache - `int`"
  (^FIFOCache [^Integer max-size]
    (new FIFOCache max-size)))

(defn add
  "Adds an entry to the cache, evicting the earliest entry if necessary.

  key - `java.lang.String`
  value - `T`

  returns: `T`"
  ([^FIFOCache this ^java.lang.String key value]
    (-> this (.add key value))))

(defn get
  "Returns the value of the given key; or null of no such entry exists.

  key - `java.lang.String`

  returns: `T`"
  ([^FIFOCache this ^java.lang.String key]
    (-> this (.get key))))

(defn size
  "Returns the current size of the cache.

  returns: `int`"
  (^Integer [^FIFOCache this]
    (-> this (.size))))

(defn get-max-size
  "Returns the maximum size of the cache.

  returns: `int`"
  (^Integer [^FIFOCache this]
    (-> this (.getMaxSize))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^FIFOCache this]
    (-> this (.toString))))

