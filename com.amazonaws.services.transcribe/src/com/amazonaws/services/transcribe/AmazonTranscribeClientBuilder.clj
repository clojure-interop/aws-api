(ns com.amazonaws.services.transcribe.AmazonTranscribeClientBuilder
  "Fluent builder for AmazonTranscribe. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.transcribe AmazonTranscribeClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.transcribe.AmazonTranscribeClientBuilder`"
  (^com.amazonaws.services.transcribe.AmazonTranscribeClientBuilder []
    (AmazonTranscribeClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.transcribe.AmazonTranscribe`"
  (^com.amazonaws.services.transcribe.AmazonTranscribe []
    (AmazonTranscribeClientBuilder/defaultClient )))

