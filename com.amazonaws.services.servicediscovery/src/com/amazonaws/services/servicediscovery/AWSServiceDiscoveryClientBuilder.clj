(ns com.amazonaws.services.servicediscovery.AWSServiceDiscoveryClientBuilder
  "Fluent builder for AWSServiceDiscovery. Use of the builder is
  preferred over using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.servicediscovery AWSServiceDiscoveryClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.servicediscovery.AWSServiceDiscoveryClientBuilder`"
  (^com.amazonaws.services.servicediscovery.AWSServiceDiscoveryClientBuilder []
    (AWSServiceDiscoveryClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.servicediscovery.AWSServiceDiscovery`"
  (^com.amazonaws.services.servicediscovery.AWSServiceDiscovery []
    (AWSServiceDiscoveryClientBuilder/defaultClient )))

