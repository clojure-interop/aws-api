(ns com.amazonaws.services.robomaker.AWSRoboMakerClientBuilder
  "Fluent builder for AWSRoboMaker. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.robomaker AWSRoboMakerClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.robomaker.AWSRoboMakerClientBuilder`"
  (^com.amazonaws.services.robomaker.AWSRoboMakerClientBuilder []
    (AWSRoboMakerClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.robomaker.AWSRoboMaker`"
  (^com.amazonaws.services.robomaker.AWSRoboMaker []
    (AWSRoboMakerClientBuilder/defaultClient )))

