(ns com.amazonaws.services.fsx.AmazonFSxClientBuilder
  "Fluent builder for AmazonFSx. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.fsx AmazonFSxClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.fsx.AmazonFSxClientBuilder`"
  (^com.amazonaws.services.fsx.AmazonFSxClientBuilder []
    (AmazonFSxClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.fsx.AmazonFSx`"
  (^com.amazonaws.services.fsx.AmazonFSx []
    (AmazonFSxClientBuilder/defaultClient )))

