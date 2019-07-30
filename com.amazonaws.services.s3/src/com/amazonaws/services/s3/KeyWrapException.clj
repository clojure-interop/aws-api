(ns com.amazonaws.services.s3.KeyWrapException
  "Key wrapping related security exception."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.s3 KeyWrapException]))

(defn ->key-wrap-exception
  "Constructor.

  message - `java.lang.String`
  cause - `java.lang.Throwable`"
  (^KeyWrapException [^java.lang.String message ^java.lang.Throwable cause]
    (new KeyWrapException message cause))
  (^KeyWrapException [^java.lang.String s]
    (new KeyWrapException s))
  (^KeyWrapException []
    (new KeyWrapException )))

