(ns com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancingClientBuilder
  "Fluent builder for AmazonElasticLoadBalancing. Use of the builder
  is preferred over using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.elasticloadbalancing AmazonElasticLoadBalancingClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancingClientBuilder`"
  (^com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancingClientBuilder []
    (AmazonElasticLoadBalancingClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing`"
  (^com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing []
    (AmazonElasticLoadBalancingClientBuilder/defaultClient )))

