(ns com.amazonaws.util.EncodingScheme
  "Encoding scheme."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.util EncodingScheme]))

(defn encode-as-string
  "bytes - `byte[]`

  returns: `java.lang.String`"
  (^java.lang.String [^EncodingScheme this bytes]
    (-> this (.encodeAsString bytes))))

(defn decode
  "encoded - `java.lang.String`

  returns: `byte[]`"
  ([^EncodingScheme this ^java.lang.String encoded]
    (-> this (.decode encoded))))

