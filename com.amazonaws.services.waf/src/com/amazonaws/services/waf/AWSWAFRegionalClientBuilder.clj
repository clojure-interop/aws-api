(ns com.amazonaws.services.waf.AWSWAFRegionalClientBuilder
  "Fluent builder for AWSWAFRegional. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.waf AWSWAFRegionalClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.waf.AWSWAFRegionalClientBuilder`"
  (^com.amazonaws.services.waf.AWSWAFRegionalClientBuilder []
    (AWSWAFRegionalClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.waf.AWSWAFRegional`"
  (^com.amazonaws.services.waf.AWSWAFRegional []
    (AWSWAFRegionalClientBuilder/defaultClient )))

