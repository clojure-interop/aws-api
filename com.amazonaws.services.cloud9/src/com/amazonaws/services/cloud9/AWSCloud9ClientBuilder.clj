(ns com.amazonaws.services.cloud9.AWSCloud9ClientBuilder
  "Fluent builder for AWSCloud9. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloud9 AWSCloud9ClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.cloud9.AWSCloud9ClientBuilder`"
  (^com.amazonaws.services.cloud9.AWSCloud9ClientBuilder []
    (AWSCloud9ClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.cloud9.AWSCloud9`"
  (^com.amazonaws.services.cloud9.AWSCloud9 []
    (AWSCloud9ClientBuilder/defaultClient )))

