(ns com.amazonaws.services.route53.AmazonRoute53ClientBuilder
  "Fluent builder for AmazonRoute53. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.route53 AmazonRoute53ClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.route53.AmazonRoute53ClientBuilder`"
  (^com.amazonaws.services.route53.AmazonRoute53ClientBuilder []
    (AmazonRoute53ClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.route53.AmazonRoute53`"
  (^com.amazonaws.services.route53.AmazonRoute53 []
    (AmazonRoute53ClientBuilder/defaultClient )))

