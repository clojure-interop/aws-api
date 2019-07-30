(ns com.amazonaws.services.mediastore.AWSMediaStoreClientBuilder
  "Fluent builder for AWSMediaStore. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mediastore AWSMediaStoreClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.mediastore.AWSMediaStoreClientBuilder`"
  (^com.amazonaws.services.mediastore.AWSMediaStoreClientBuilder []
    (AWSMediaStoreClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.mediastore.AWSMediaStore`"
  (^com.amazonaws.services.mediastore.AWSMediaStore []
    (AWSMediaStoreClientBuilder/defaultClient )))

