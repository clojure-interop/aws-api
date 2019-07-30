(ns com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflowClientBuilder
  "Fluent builder for AmazonSimpleWorkflow. Use of the builder is
  preferred over using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.simpleworkflow AmazonSimpleWorkflowClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflowClientBuilder`"
  (^com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflowClientBuilder []
    (AmazonSimpleWorkflowClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow`"
  (^com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow []
    (AmazonSimpleWorkflowClientBuilder/defaultClient )))

