(ns com.amazonaws.services.iotevents.AWSIoTEventsClientBuilder
  "Fluent builder for AWSIoTEvents. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.iotevents AWSIoTEventsClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.iotevents.AWSIoTEventsClientBuilder`"
  (^com.amazonaws.services.iotevents.AWSIoTEventsClientBuilder []
    (AWSIoTEventsClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.iotevents.AWSIoTEvents`"
  (^com.amazonaws.services.iotevents.AWSIoTEvents []
    (AWSIoTEventsClientBuilder/defaultClient )))

