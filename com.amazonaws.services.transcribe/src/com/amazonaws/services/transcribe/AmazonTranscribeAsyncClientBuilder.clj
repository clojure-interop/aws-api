(ns com.amazonaws.services.transcribe.AmazonTranscribeAsyncClientBuilder
  "Fluent builder for AmazonTranscribeAsync. Use of the builder is preferred
  over using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.transcribe AmazonTranscribeAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.transcribe.AmazonTranscribeAsyncClientBuilder`"
  (^com.amazonaws.services.transcribe.AmazonTranscribeAsyncClientBuilder []
    (AmazonTranscribeAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.transcribe.AmazonTranscribeAsync`"
  (^com.amazonaws.services.transcribe.AmazonTranscribeAsync []
    (AmazonTranscribeAsyncClientBuilder/defaultClient )))

