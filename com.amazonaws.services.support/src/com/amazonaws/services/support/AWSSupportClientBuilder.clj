(ns com.amazonaws.services.support.AWSSupportClientBuilder
  "Fluent builder for AWSSupport. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.support AWSSupportClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.support.AWSSupportClientBuilder`"
  (^com.amazonaws.services.support.AWSSupportClientBuilder []
    (AWSSupportClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.support.AWSSupport`"
  (^com.amazonaws.services.support.AWSSupport []
    (AWSSupportClientBuilder/defaultClient )))

