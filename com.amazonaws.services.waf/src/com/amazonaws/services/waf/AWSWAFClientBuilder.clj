(ns com.amazonaws.services.waf.AWSWAFClientBuilder
  "Fluent builder for AWSWAF. Use of the builder is preferred over using constructors
  of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.waf AWSWAFClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.waf.AWSWAFClientBuilder`"
  (^com.amazonaws.services.waf.AWSWAFClientBuilder []
    (AWSWAFClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.waf.AWSWAF`"
  (^com.amazonaws.services.waf.AWSWAF []
    (AWSWAFClientBuilder/defaultClient )))

