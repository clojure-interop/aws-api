(ns com.amazonaws.services.sagemaker.AmazonSageMakerClientBuilder
  "Fluent builder for AmazonSageMaker. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.sagemaker AmazonSageMakerClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.sagemaker.AmazonSageMakerClientBuilder`"
  (^com.amazonaws.services.sagemaker.AmazonSageMakerClientBuilder []
    (AmazonSageMakerClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.sagemaker.AmazonSageMaker`"
  (^com.amazonaws.services.sagemaker.AmazonSageMaker []
    (AmazonSageMakerClientBuilder/defaultClient )))

