(ns com.amazonaws.services.mediapackage.AWSMediaPackageClientBuilder
  "Fluent builder for AWSMediaPackage. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mediapackage AWSMediaPackageClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.mediapackage.AWSMediaPackageClientBuilder`"
  (^com.amazonaws.services.mediapackage.AWSMediaPackageClientBuilder []
    (AWSMediaPackageClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.mediapackage.AWSMediaPackage`"
  (^com.amazonaws.services.mediapackage.AWSMediaPackage []
    (AWSMediaPackageClientBuilder/defaultClient )))

