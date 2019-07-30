(ns com.amazonaws.services.ecs.AmazonECSClientBuilder
  "Fluent builder for AmazonECS. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.ecs AmazonECSClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.ecs.AmazonECSClientBuilder`"
  (^com.amazonaws.services.ecs.AmazonECSClientBuilder []
    (AmazonECSClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.ecs.AmazonECS`"
  (^com.amazonaws.services.ecs.AmazonECS []
    (AmazonECSClientBuilder/defaultClient )))

