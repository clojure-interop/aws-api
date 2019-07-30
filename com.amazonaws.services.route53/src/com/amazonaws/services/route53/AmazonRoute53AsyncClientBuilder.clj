(ns com.amazonaws.services.route53.AmazonRoute53AsyncClientBuilder
  "Fluent builder for AmazonRoute53Async. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.route53 AmazonRoute53AsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.route53.AmazonRoute53AsyncClientBuilder`"
  (^com.amazonaws.services.route53.AmazonRoute53AsyncClientBuilder []
    (AmazonRoute53AsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.route53.AmazonRoute53Async`"
  (^com.amazonaws.services.route53.AmazonRoute53Async []
    (AmazonRoute53AsyncClientBuilder/defaultClient )))

