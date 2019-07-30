(ns com.amazonaws.services.translate.AmazonTranslateClientBuilder
  "Fluent builder for AmazonTranslate. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.translate AmazonTranslateClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.translate.AmazonTranslateClientBuilder`"
  (^com.amazonaws.services.translate.AmazonTranslateClientBuilder []
    (AmazonTranslateClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.translate.AmazonTranslate`"
  (^com.amazonaws.services.translate.AmazonTranslate []
    (AmazonTranslateClientBuilder/defaultClient )))

