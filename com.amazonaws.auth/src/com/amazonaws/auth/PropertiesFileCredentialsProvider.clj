(ns com.amazonaws.auth.PropertiesFileCredentialsProvider
  "AWSCredentialsProvider implementation that loads AWS security
  credentials from a properties file provided on initialization.

  The AWS access key ID is expected to be in the accessKey
  property and the AWS secret key is expected to be in the
  secretKey property."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth PropertiesFileCredentialsProvider]))

(defn ->properties-file-credentials-provider
  "Constructor.

  Creates a new PropertiesFileCredentialsProvider that will attempt to load
   a custom file from the path specified to read AWS security credentials.

  credentials-file-path - The custom classpath resource path to a properties file from which the AWS security credentials should be loaded. For example, /etc/somewhere/credentials.properties - `java.lang.String`"
  (^PropertiesFileCredentialsProvider [^java.lang.String credentials-file-path]
    (new PropertiesFileCredentialsProvider credentials-file-path)))

(defn get-credentials
  "Description copied from interface: AWSCredentialsProvider

  returns: AWSCredentials which the caller can use to authorize an AWS request. - `com.amazonaws.auth.AWSCredentials`"
  (^com.amazonaws.auth.AWSCredentials [^PropertiesFileCredentialsProvider this]
    (-> this (.getCredentials))))

(defn refresh
  "Description copied from interface: AWSCredentialsProvider"
  ([^PropertiesFileCredentialsProvider this]
    (-> this (.refresh))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^PropertiesFileCredentialsProvider this]
    (-> this (.toString))))

