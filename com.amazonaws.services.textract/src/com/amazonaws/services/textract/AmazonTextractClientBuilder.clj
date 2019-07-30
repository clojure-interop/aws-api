(ns com.amazonaws.services.textract.AmazonTextractClientBuilder
  "Fluent builder for AmazonTextract. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.textract AmazonTextractClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.textract.AmazonTextractClientBuilder`"
  (^com.amazonaws.services.textract.AmazonTextractClientBuilder []
    (AmazonTextractClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.textract.AmazonTextract`"
  (^com.amazonaws.services.textract.AmazonTextract []
    (AmazonTextractClientBuilder/defaultClient )))

