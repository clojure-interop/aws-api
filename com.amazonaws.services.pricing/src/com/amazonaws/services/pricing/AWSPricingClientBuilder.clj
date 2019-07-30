(ns com.amazonaws.services.pricing.AWSPricingClientBuilder
  "Fluent builder for AWSPricing. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.pricing AWSPricingClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.pricing.AWSPricingClientBuilder`"
  (^com.amazonaws.services.pricing.AWSPricingClientBuilder []
    (AWSPricingClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.pricing.AWSPricing`"
  (^com.amazonaws.services.pricing.AWSPricing []
    (AWSPricingClientBuilder/defaultClient )))

