(ns com.amazonaws.services.s3.AmazonS3URI
  "A URI wrapper that can parse out information about an S3 URI."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.s3 AmazonS3URI]))

(defn ->amazon-s-3-uri
  "Constructor.

  Creates a new AmazonS3URI by parsing the given string.
   String will optionally be URL encoded before generating the URI.
   URL encoding is recommended if you work with bucket names or object
   keys with special characters.  This can be disabled if you pre-encode
   URI strings before passing them to this class.

  str - the URI to parse. - `java.lang.String`
  url-encode - true if string should be URL encoded - `boolean`"
  (^AmazonS3URI [^java.lang.String str ^Boolean url-encode]
    (new AmazonS3URI str url-encode))
  (^AmazonS3URI [^java.lang.String str]
    (new AmazonS3URI str)))

(defn get-uri
  "returns: the S3 URI being parsed - `java.net.URI`"
  (^java.net.URI [^AmazonS3URI this]
    (-> this (.getURI))))

(defn path-style?
  "returns: true if the URI contains the bucket in the path, false if it
           contains the bucket in the authority - `boolean`"
  (^Boolean [^AmazonS3URI this]
    (-> this (.isPathStyle))))

(defn get-key
  "returns: the key parsed from the URI (or null if no key specified) - `java.lang.String`"
  (^java.lang.String [^AmazonS3URI this]
    (-> this (.getKey))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AmazonS3URI this]
    (-> this (.toString))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AmazonS3URI this]
    (-> this (.hashCode))))

(defn get-bucket
  "returns: the bucket name parsed from the URI (or null if no bucket
           specified) - `java.lang.String`"
  (^java.lang.String [^AmazonS3URI this]
    (-> this (.getBucket))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AmazonS3URI this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-version-id
  "returns: the version id parsed from the URI (or null if no version specified) - `java.lang.String`"
  (^java.lang.String [^AmazonS3URI this]
    (-> this (.getVersionId))))

(defn get-region
  "returns: the region parsed from the URI (or null if no region specified) - `java.lang.String`"
  (^java.lang.String [^AmazonS3URI this]
    (-> this (.getRegion))))

