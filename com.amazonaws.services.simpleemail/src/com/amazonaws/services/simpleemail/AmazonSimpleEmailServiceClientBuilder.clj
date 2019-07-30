(ns com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder
  "Fluent builder for AmazonSimpleEmailService. Use of the builder is
  preferred over using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.simpleemail AmazonSimpleEmailServiceClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder`"
  (^com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder []
    (AmazonSimpleEmailServiceClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.simpleemail.AmazonSimpleEmailService`"
  (^com.amazonaws.services.simpleemail.AmazonSimpleEmailService []
    (AmazonSimpleEmailServiceClientBuilder/defaultClient )))

