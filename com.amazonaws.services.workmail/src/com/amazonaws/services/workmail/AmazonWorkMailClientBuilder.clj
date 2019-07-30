(ns com.amazonaws.services.workmail.AmazonWorkMailClientBuilder
  "Fluent builder for AmazonWorkMail. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.workmail AmazonWorkMailClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.workmail.AmazonWorkMailClientBuilder`"
  (^com.amazonaws.services.workmail.AmazonWorkMailClientBuilder []
    (AmazonWorkMailClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.workmail.AmazonWorkMail`"
  (^com.amazonaws.services.workmail.AmazonWorkMail []
    (AmazonWorkMailClientBuilder/defaultClient )))

