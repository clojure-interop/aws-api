(ns com.amazonaws.jmespath.InvalidTypeException
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.jmespath InvalidTypeException]))

(defn ->invalid-type-exception
  "Constructor.

  message - `java.lang.String`
  t - `java.lang.Throwable`"
  (^InvalidTypeException [^java.lang.String message ^java.lang.Throwable t]
    (new InvalidTypeException message t))
  (^InvalidTypeException [^java.lang.String message]
    (new InvalidTypeException message)))

