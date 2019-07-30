(ns com.amazonaws.services.elasticache.AmazonElastiCacheClientBuilder
  "Fluent builder for AmazonElastiCache. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.elasticache AmazonElastiCacheClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.elasticache.AmazonElastiCacheClientBuilder`"
  (^com.amazonaws.services.elasticache.AmazonElastiCacheClientBuilder []
    (AmazonElastiCacheClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.elasticache.AmazonElastiCache`"
  (^com.amazonaws.services.elasticache.AmazonElastiCache []
    (AmazonElastiCacheClientBuilder/defaultClient )))

