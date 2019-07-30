(ns com.amazonaws.services.sagemaker.AmazonSageMakerAsyncClientBuilder
  "Fluent builder for AmazonSageMakerAsync. Use of the builder is preferred
  over using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.sagemaker AmazonSageMakerAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.sagemaker.AmazonSageMakerAsyncClientBuilder`"
  (^com.amazonaws.services.sagemaker.AmazonSageMakerAsyncClientBuilder []
    (AmazonSageMakerAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.sagemaker.AmazonSageMakerAsync`"
  (^com.amazonaws.services.sagemaker.AmazonSageMakerAsync []
    (AmazonSageMakerAsyncClientBuilder/defaultClient )))

