(ns com.amazonaws.services.mediastore.AWSMediaStoreAsyncClientBuilder
  "Fluent builder for AWSMediaStoreAsync. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mediastore AWSMediaStoreAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.mediastore.AWSMediaStoreAsyncClientBuilder`"
  (^com.amazonaws.services.mediastore.AWSMediaStoreAsyncClientBuilder []
    (AWSMediaStoreAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.mediastore.AWSMediaStoreAsync`"
  (^com.amazonaws.services.mediastore.AWSMediaStoreAsync []
    (AWSMediaStoreAsyncClientBuilder/defaultClient )))

