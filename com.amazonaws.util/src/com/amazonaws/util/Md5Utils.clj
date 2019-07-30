(ns com.amazonaws.util.Md5Utils
  "Utility methods for computing MD5 sums."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.util Md5Utils]))

(defn ->md-5-utils
  "Constructor."
  (^Md5Utils []
    (new Md5Utils )))

(defn *compute-md-5-hash
  "Computes the MD5 hash of the data in the given input stream and returns
   it as an array of bytes.
   Note this method closes the given input stream upon completion.

  is - `java.io.InputStream`

  returns: `byte[]`

  throws: java.io.IOException"
  ([^java.io.InputStream is]
    (Md5Utils/computeMD5Hash is)))

(defn *md-5-as-base-64
  "Returns the MD5 in base64 for the data from the given input stream.
   Note this method closes the given input stream upon completion.

  is - `java.io.InputStream`

  returns: `java.lang.String`

  throws: java.io.IOException"
  (^java.lang.String [^java.io.InputStream is]
    (Md5Utils/md5AsBase64 is)))

