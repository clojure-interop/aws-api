(ns com.amazonaws.services.inspector.AmazonInspectorClientBuilder
  "Fluent builder for AmazonInspector. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.inspector AmazonInspectorClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.inspector.AmazonInspectorClientBuilder`"
  (^com.amazonaws.services.inspector.AmazonInspectorClientBuilder []
    (AmazonInspectorClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.inspector.AmazonInspector`"
  (^com.amazonaws.services.inspector.AmazonInspector []
    (AmazonInspectorClientBuilder/defaultClient )))

