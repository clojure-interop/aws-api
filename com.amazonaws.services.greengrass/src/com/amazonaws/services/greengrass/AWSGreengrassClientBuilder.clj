(ns com.amazonaws.services.greengrass.AWSGreengrassClientBuilder
  "Fluent builder for AWSGreengrass. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.greengrass AWSGreengrassClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.greengrass.AWSGreengrassClientBuilder`"
  (^com.amazonaws.services.greengrass.AWSGreengrassClientBuilder []
    (AWSGreengrassClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.greengrass.AWSGreengrass`"
  (^com.amazonaws.services.greengrass.AWSGreengrass []
    (AWSGreengrassClientBuilder/defaultClient )))

