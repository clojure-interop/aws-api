(ns com.amazonaws.util.ImmutableMapParameter
  "An immutable map that could be built by convenient constructors.

  Example of using map Builder:



  {
      @code
      Map<String, AttibuteValue> item = new ImmutableMapParameter.Builder<String, AttibuteValue>()
              .put(\"one\", new AttibuteValue(\"1\"))
              .put(\"two\", new AttibuteValue(\"2\"))
              .put(\"three\", new AttibuteValue(\"3\")).build();
  }

  For small immutable maps (up to five entries), the
  ImmutableMapParamter.of() methods are preferred:



    Map<String, AttibuteValue> item =
        ImmutableMapParameter
            .of(\"one\", new AttributeValue(\"1\"),
                \"two\", new AttributeValue(\"2\"),
                \"three\", new AttributeValue(\"3\"),"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.util ImmutableMapParameter]))

(defn *builder
  "Returns a new MapParameterBuilder instance.

  returns: `<K,V> com.amazonaws.util.ImmutableMapParameter$Builder<K,V>`"
  ([]
    (ImmutableMapParameter/builder )))

(defn *of
  "Returns an ImmutableMapParameter instance containing five entries.

  k-0 - Key of the first entry. - `K`
  v-0 - Value of the first entry. - `V`
  k-1 - Key of the second entry. - `K`
  v-1 - Value of the second entry. - `V`
  k-2 - Key of the third entry. - `K`
  v-2 - Value of the third entry. - `V`
  k-3 - Key of the fourth entry. - `K`
  v-3 - Value of the fourth entry. - `V`
  k-4 - Key of the fifth entry. - `K`
  v-4 - Value of the fifth entry. - `V`

  returns: `<K,V> com.amazonaws.util.ImmutableMapParameter<K,V>`"
  ([k-0 v-0 k-1 v-1 k-2 v-2 k-3 v-3 k-4 v-4]
    (ImmutableMapParameter/of k-0 v-0 k-1 v-1 k-2 v-2 k-3 v-3 k-4 v-4))
  ([k-0 v-0 k-1 v-1 k-2 v-2 k-3 v-3]
    (ImmutableMapParameter/of k-0 v-0 k-1 v-1 k-2 v-2 k-3 v-3))
  ([k-0 v-0 k-1 v-1 k-2 v-2]
    (ImmutableMapParameter/of k-0 v-0 k-1 v-1 k-2 v-2))
  ([k-0 v-0 k-1 v-1]
    (ImmutableMapParameter/of k-0 v-0 k-1 v-1))
  ([k-0 v-0]
    (ImmutableMapParameter/of k-0 v-0)))

(defn values
  "returns: `java.util.Collection<V>`"
  (^java.util.Collection [^ImmutableMapParameter this]
    (-> this (.values))))

(defn put-all
  "map - `java.util.Map`"
  ([^ImmutableMapParameter this ^java.util.Map map]
    (-> this (.putAll map))))

(defn put
  "key - `K`
  value - `V`

  returns: `V`"
  ([^ImmutableMapParameter this key value]
    (-> this (.put key value))))

(defn entry-set
  "returns: `java.util.Set<java.util.Map$Entry<K,V>>`"
  (^java.util.Set [^ImmutableMapParameter this]
    (-> this (.entrySet))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ImmutableMapParameter this]
    (-> this (.toString))))

(defn contains-value
  "value - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ImmutableMapParameter this ^java.lang.Object value]
    (-> this (.containsValue value))))

(defn remove
  "key - `java.lang.Object`

  returns: `V`"
  ([^ImmutableMapParameter this ^java.lang.Object key]
    (-> this (.remove key))))

(defn key-set
  "returns: `java.util.Set<K>`"
  (^java.util.Set [^ImmutableMapParameter this]
    (-> this (.keySet))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ImmutableMapParameter this]
    (-> this (.hashCode))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^ImmutableMapParameter this]
    (-> this (.isEmpty))))

(defn size
  "returns: `int`"
  (^Integer [^ImmutableMapParameter this]
    (-> this (.size))))

(defn clear
  "Unsupported methods"
  ([^ImmutableMapParameter this]
    (-> this (.clear))))

(defn contains-key
  "Inherited methods

  key - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ImmutableMapParameter this ^java.lang.Object key]
    (-> this (.containsKey key))))

(defn get
  "key - `java.lang.Object`

  returns: `V`"
  ([^ImmutableMapParameter this ^java.lang.Object key]
    (-> this (.get key))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ImmutableMapParameter this ^java.lang.Object o]
    (-> this (.equals o))))

