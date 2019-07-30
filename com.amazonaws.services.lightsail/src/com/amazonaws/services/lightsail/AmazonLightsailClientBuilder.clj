(ns com.amazonaws.services.lightsail.AmazonLightsailClientBuilder
  "Fluent builder for AmazonLightsail. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.lightsail AmazonLightsailClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.lightsail.AmazonLightsailClientBuilder`"
  (^com.amazonaws.services.lightsail.AmazonLightsailClientBuilder []
    (AmazonLightsailClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.lightsail.AmazonLightsail`"
  (^com.amazonaws.services.lightsail.AmazonLightsail []
    (AmazonLightsailClientBuilder/defaultClient )))

