(ns com.amazonaws.services.opsworks.AWSOpsWorksClientBuilder
  "Fluent builder for AWSOpsWorks. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.opsworks AWSOpsWorksClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.opsworks.AWSOpsWorksClientBuilder`"
  (^com.amazonaws.services.opsworks.AWSOpsWorksClientBuilder []
    (AWSOpsWorksClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.opsworks.AWSOpsWorks`"
  (^com.amazonaws.services.opsworks.AWSOpsWorks []
    (AWSOpsWorksClientBuilder/defaultClient )))

