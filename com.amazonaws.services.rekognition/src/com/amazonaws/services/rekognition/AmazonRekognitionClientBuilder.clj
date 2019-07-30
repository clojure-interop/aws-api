(ns com.amazonaws.services.rekognition.AmazonRekognitionClientBuilder
  "Fluent builder for AmazonRekognition. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.rekognition AmazonRekognitionClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.rekognition.AmazonRekognitionClientBuilder`"
  (^com.amazonaws.services.rekognition.AmazonRekognitionClientBuilder []
    (AmazonRekognitionClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.rekognition.AmazonRekognition`"
  (^com.amazonaws.services.rekognition.AmazonRekognition []
    (AmazonRekognitionClientBuilder/defaultClient )))

