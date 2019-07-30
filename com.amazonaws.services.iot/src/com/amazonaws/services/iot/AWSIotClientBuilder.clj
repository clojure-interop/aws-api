(ns com.amazonaws.services.iot.AWSIotClientBuilder
  "Fluent builder for AWSIot. Use of the builder is preferred over using constructors
  of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.iot AWSIotClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.iot.AWSIotClientBuilder`"
  (^com.amazonaws.services.iot.AWSIotClientBuilder []
    (AWSIotClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.iot.AWSIot`"
  (^com.amazonaws.services.iot.AWSIot []
    (AWSIotClientBuilder/defaultClient )))

