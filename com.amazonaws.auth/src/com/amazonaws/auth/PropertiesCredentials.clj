(ns com.amazonaws.auth.PropertiesCredentials
  "Simple implementation AWSCredentials that reads in AWS access keys from a
  properties file. The AWS access key is expected to be in the \"accessKey\"
  property and the AWS secret key id is expected to be in the \"secretKey\"
  property."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth PropertiesCredentials]))

(defn ->properties-credentials
  "Constructor.

  Reads the specified file as a Java properties file and extracts the
   AWS access key from the \"accessKey\" property and AWS secret access
   key from the \"secretKey\" property. If the specified file doesn't
   contain the AWS access keys an IOException will be thrown.

  file - The file from which to read the AWS credentials properties. - `java.io.File`

  throws: java.io.FileNotFoundException - If the specified file isn't found."
  (^PropertiesCredentials [^java.io.File file]
    (new PropertiesCredentials file)))

(defn get-aws-access-key-id
  "Description copied from interface: AWSCredentials

  returns: The AWS access key ID for this credentials object. - `java.lang.String`"
  (^java.lang.String [^PropertiesCredentials this]
    (-> this (.getAWSAccessKeyId))))

(defn get-aws-secret-key
  "Description copied from interface: AWSCredentials

  returns: The AWS secret access key for this credentials object. - `java.lang.String`"
  (^java.lang.String [^PropertiesCredentials this]
    (-> this (.getAWSSecretKey))))

