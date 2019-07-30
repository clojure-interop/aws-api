(ns com.amazonaws.services.route53domains.AmazonRoute53DomainsClientBuilder
  "Fluent builder for AmazonRoute53Domains. Use of the builder is
  preferred over using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.route53domains AmazonRoute53DomainsClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.route53domains.AmazonRoute53DomainsClientBuilder`"
  (^com.amazonaws.services.route53domains.AmazonRoute53DomainsClientBuilder []
    (AmazonRoute53DomainsClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.route53domains.AmazonRoute53Domains`"
  (^com.amazonaws.services.route53domains.AmazonRoute53Domains []
    (AmazonRoute53DomainsClientBuilder/defaultClient )))

