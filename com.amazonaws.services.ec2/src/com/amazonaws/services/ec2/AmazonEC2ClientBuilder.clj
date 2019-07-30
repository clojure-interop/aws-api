(ns com.amazonaws.services.ec2.AmazonEC2ClientBuilder
  "Fluent builder for AmazonEC2. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.ec2 AmazonEC2ClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.ec2.AmazonEC2ClientBuilder`"
  (^com.amazonaws.services.ec2.AmazonEC2ClientBuilder []
    (AmazonEC2ClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.ec2.AmazonEC2`"
  (^com.amazonaws.services.ec2.AmazonEC2 []
    (AmazonEC2ClientBuilder/defaultClient )))

