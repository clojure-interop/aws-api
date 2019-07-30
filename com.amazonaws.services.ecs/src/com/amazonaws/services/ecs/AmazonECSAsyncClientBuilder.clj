(ns com.amazonaws.services.ecs.AmazonECSAsyncClientBuilder
  "Fluent builder for AmazonECSAsync. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.ecs AmazonECSAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.ecs.AmazonECSAsyncClientBuilder`"
  (^com.amazonaws.services.ecs.AmazonECSAsyncClientBuilder []
    (AmazonECSAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.ecs.AmazonECSAsync`"
  (^com.amazonaws.services.ecs.AmazonECSAsync []
    (AmazonECSAsyncClientBuilder/defaultClient )))

