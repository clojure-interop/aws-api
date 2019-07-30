(ns com.amazonaws.auth.AWSSessionCredentialsProvider
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth AWSSessionCredentialsProvider]))

(defn get-credentials
  "Description copied from interface: AWSCredentialsProvider

  returns: AWSCredentials which the caller can use to authorize an AWS request. - `com.amazonaws.auth.AWSSessionCredentials`"
  (^com.amazonaws.auth.AWSSessionCredentials [^AWSSessionCredentialsProvider this]
    (-> this (.getCredentials))))

