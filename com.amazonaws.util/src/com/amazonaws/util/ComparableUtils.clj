(ns com.amazonaws.util.ComparableUtils
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.util ComparableUtils]))

(defn ->comparable-utils
  "Constructor."
  (^ComparableUtils []
    (new ComparableUtils )))

(defn *safe-compare
  "Does a safe comparison of two Comparable objects accounting for nulls

  d-1 - First object - `java.lang.Comparable`
  d-2 - Second object - `T`

  returns: A positive number if the object double is larger, a negative number if the second
           object is larger, or 0 if they are equal. Null is considered less than any non-null
           value - `<T> int`"
  ([^java.lang.Comparable d-1 d-2]
    (ComparableUtils/safeCompare d-1 d-2)))

