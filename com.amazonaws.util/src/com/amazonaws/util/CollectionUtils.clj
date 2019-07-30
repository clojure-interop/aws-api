(ns com.amazonaws.util.CollectionUtils
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.util CollectionUtils]))

(defn ->collection-utils
  "Constructor."
  (^CollectionUtils []
    (new CollectionUtils )))

(defn *is-null-or-empty
  "collection - `java.util.Collection`

  returns: `<T> boolean`"
  ([^java.util.Collection collection]
    (CollectionUtils/isNullOrEmpty collection)))

(defn *merge-lists
  "Returns a new list containing the second list appended to the first list.

  list-1 - `java.util.List`
  list-2 - `java.util.List`

  returns: `<T> java.util.List<T>`"
  ([^java.util.List list-1 ^java.util.List list-2]
    (CollectionUtils/mergeLists list-1 list-2)))

(defn *join
  "Joins a collection of strings with the given separator into a single string.

  to-join - Collection containing items to join. - `java.util.Collection`
  separator - String to join items with. - `java.lang.String`

  returns: Empty string if collection is null or empty. Otherwise joins all strings in the collection with the separator. - `java.lang.String`"
  (^java.lang.String [^java.util.Collection to-join ^java.lang.String separator]
    (CollectionUtils/join to-join separator)))

