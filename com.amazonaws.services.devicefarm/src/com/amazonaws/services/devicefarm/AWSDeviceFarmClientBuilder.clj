(ns com.amazonaws.services.devicefarm.AWSDeviceFarmClientBuilder
  "Fluent builder for AWSDeviceFarm. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.devicefarm AWSDeviceFarmClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.devicefarm.AWSDeviceFarmClientBuilder`"
  (^com.amazonaws.services.devicefarm.AWSDeviceFarmClientBuilder []
    (AWSDeviceFarmClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.devicefarm.AWSDeviceFarm`"
  (^com.amazonaws.services.devicefarm.AWSDeviceFarm []
    (AWSDeviceFarmClientBuilder/defaultClient )))

