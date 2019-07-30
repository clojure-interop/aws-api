(ns com.amazonaws.services.codedeploy.AmazonCodeDeployClientBuilder
  "Fluent builder for AmazonCodeDeploy. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.codedeploy AmazonCodeDeployClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.codedeploy.AmazonCodeDeployClientBuilder`"
  (^com.amazonaws.services.codedeploy.AmazonCodeDeployClientBuilder []
    (AmazonCodeDeployClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.codedeploy.AmazonCodeDeploy`"
  (^com.amazonaws.services.codedeploy.AmazonCodeDeploy []
    (AmazonCodeDeployClientBuilder/defaultClient )))

