(ns com.amazonaws.services.elasticloadbalancingv2.AmazonElasticLoadBalancingClientBuilder
  "Fluent builder for AmazonElasticLoadBalancing. Use of the
  builder is preferred over using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.elasticloadbalancingv2 AmazonElasticLoadBalancingClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.elasticloadbalancingv2.AmazonElasticLoadBalancingClientBuilder`"
  (^com.amazonaws.services.elasticloadbalancingv2.AmazonElasticLoadBalancingClientBuilder []
    (AmazonElasticLoadBalancingClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.elasticloadbalancingv2.AmazonElasticLoadBalancing`"
  (^com.amazonaws.services.elasticloadbalancingv2.AmazonElasticLoadBalancing []
    (AmazonElasticLoadBalancingClientBuilder/defaultClient )))

