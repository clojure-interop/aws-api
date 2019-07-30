(ns com.amazonaws.services.glue.AWSGlueClientBuilder
  "Fluent builder for AWSGlue. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.glue AWSGlueClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.glue.AWSGlueClientBuilder`"
  (^com.amazonaws.services.glue.AWSGlueClientBuilder []
    (AWSGlueClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.glue.AWSGlue`"
  (^com.amazonaws.services.glue.AWSGlue []
    (AWSGlueClientBuilder/defaultClient )))

