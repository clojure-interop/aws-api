(ns com.amazonaws.services.stepfunctions.AWSStepFunctionsClientBuilder
  "Fluent builder for AWSStepFunctions. Use of the builder is preferred
  over using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.stepfunctions AWSStepFunctionsClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.stepfunctions.AWSStepFunctionsClientBuilder`"
  (^com.amazonaws.services.stepfunctions.AWSStepFunctionsClientBuilder []
    (AWSStepFunctionsClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.stepfunctions.AWSStepFunctions`"
  (^com.amazonaws.services.stepfunctions.AWSStepFunctions []
    (AWSStepFunctionsClientBuilder/defaultClient )))

