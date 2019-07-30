(ns com.amazonaws.services.gamelift.AmazonGameLiftClientBuilder
  "Fluent builder for AmazonGameLift. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.gamelift AmazonGameLiftClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.gamelift.AmazonGameLiftClientBuilder`"
  (^com.amazonaws.services.gamelift.AmazonGameLiftClientBuilder []
    (AmazonGameLiftClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.gamelift.AmazonGameLift`"
  (^com.amazonaws.services.gamelift.AmazonGameLift []
    (AmazonGameLiftClientBuilder/defaultClient )))

