(ns com.amazonaws.services.cloudtrail.AWSCloudTrailClientBuilder
  "Fluent builder for AWSCloudTrail. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudtrail AWSCloudTrailClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.cloudtrail.AWSCloudTrailClientBuilder`"
  (^com.amazonaws.services.cloudtrail.AWSCloudTrailClientBuilder []
    (AWSCloudTrailClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.cloudtrail.AWSCloudTrail`"
  (^com.amazonaws.services.cloudtrail.AWSCloudTrail []
    (AWSCloudTrailClientBuilder/defaultClient )))

