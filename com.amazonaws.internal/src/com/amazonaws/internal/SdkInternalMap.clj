(ns com.amazonaws.internal.SdkInternalMap
  "Map with auto construct flag to indicate whether it is auto constructed by
  Java SDK."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.internal SdkInternalMap]))

(defn ->sdk-internal-map
  "Constructor.

  m - `java.util.Map`"
  (^SdkInternalMap [^java.util.Map m]
    (new SdkInternalMap m))
  (^SdkInternalMap []
    (new SdkInternalMap )))

(defn values
  "returns: `java.util.Collection<V>`"
  (^java.util.Collection [^SdkInternalMap this]
    (-> this (.values))))

(defn put-all
  "m - `java.util.Map`"
  ([^SdkInternalMap this ^java.util.Map m]
    (-> this (.putAll m))))

(defn auto-construct?
  "Return true if the map is auto constructed by Java SDK; false otherwise.

  returns: `boolean`"
  (^Boolean [^SdkInternalMap this]
    (-> this (.isAutoConstruct))))

(defn put
  "key - `K`
  value - `V`

  returns: `V`"
  ([^SdkInternalMap this key value]
    (-> this (.put key value))))

(defn entry-set
  "returns: `java.util.Set<java.util.Map$Entry<K,V>>`"
  (^java.util.Set [^SdkInternalMap this]
    (-> this (.entrySet))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SdkInternalMap this]
    (-> this (.toString))))

(defn contains-value
  "value - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SdkInternalMap this ^java.lang.Object value]
    (-> this (.containsValue value))))

(defn remove
  "key - `java.lang.Object`

  returns: `V`"
  ([^SdkInternalMap this ^java.lang.Object key]
    (-> this (.remove key))))

(defn key-set
  "returns: `java.util.Set<K>`"
  (^java.util.Set [^SdkInternalMap this]
    (-> this (.keySet))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SdkInternalMap this]
    (-> this (.hashCode))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^SdkInternalMap this]
    (-> this (.isEmpty))))

(defn size
  "returns: `int`"
  (^Integer [^SdkInternalMap this]
    (-> this (.size))))

(defn clear
  ""
  ([^SdkInternalMap this]
    (-> this (.clear))))

(defn contains-key
  "key - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SdkInternalMap this ^java.lang.Object key]
    (-> this (.containsKey key))))

(defn get
  "key - `java.lang.Object`

  returns: `V`"
  ([^SdkInternalMap this ^java.lang.Object key]
    (-> this (.get key))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SdkInternalMap this ^java.lang.Object o]
    (-> this (.equals o))))

