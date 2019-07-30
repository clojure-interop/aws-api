(ns com.amazonaws.services.mediapackage.AWSMediaPackageAsyncClientBuilder
  "Fluent builder for AWSMediaPackageAsync. Use of the builder is preferred
  over using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mediapackage AWSMediaPackageAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.mediapackage.AWSMediaPackageAsyncClientBuilder`"
  (^com.amazonaws.services.mediapackage.AWSMediaPackageAsyncClientBuilder []
    (AWSMediaPackageAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.mediapackage.AWSMediaPackageAsync`"
  (^com.amazonaws.services.mediapackage.AWSMediaPackageAsync []
    (AWSMediaPackageAsyncClientBuilder/defaultClient )))

