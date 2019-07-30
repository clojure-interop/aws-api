(ns com.amazonaws.auth.ContainerCredentialsProvider
  " AWSCredentialsProvider implementation that loads credentials
  from an Amazon Elastic Container.


  By default, the URI path is retrieved from the environment variable
  \"AWS_CONTAINER_CREDENTIALS_RELATIVE_URI\" in the container's environment."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth ContainerCredentialsProvider]))

(defn ->container-credentials-provider
  "Constructor.

  Deprecated. use ContainerCredentialsProvider(CredentialsEndpointProvider)"
  (^ContainerCredentialsProvider []
    (new ContainerCredentialsProvider ))
  (^ContainerCredentialsProvider [^com.amazonaws.internal.CredentialsEndpointProvider credentials-endpoint-provider]
    (new ContainerCredentialsProvider credentials-endpoint-provider)))

(defn get-credentials
  "Description copied from interface: AWSCredentialsProvider

  returns: AWSCredentials which the caller can use to authorize an AWS request. - `com.amazonaws.auth.AWSCredentials`"
  (^com.amazonaws.auth.AWSCredentials [^ContainerCredentialsProvider this]
    (-> this (.getCredentials))))

(defn refresh
  "Description copied from interface: AWSCredentialsProvider"
  ([^ContainerCredentialsProvider this]
    (-> this (.refresh))))

(defn get-credentials-expiration
  "returns: `java.util.Date`"
  (^java.util.Date [^ContainerCredentialsProvider this]
    (-> this (.getCredentialsExpiration))))

