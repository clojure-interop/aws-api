(ns com.amazonaws.services.neptune.AmazonNeptuneClientBuilder
  "Fluent builder for AmazonNeptune. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.neptune AmazonNeptuneClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.neptune.AmazonNeptuneClientBuilder`"
  (^com.amazonaws.services.neptune.AmazonNeptuneClientBuilder []
    (AmazonNeptuneClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.neptune.AmazonNeptune`"
  (^com.amazonaws.services.neptune.AmazonNeptune []
    (AmazonNeptuneClientBuilder/defaultClient )))

