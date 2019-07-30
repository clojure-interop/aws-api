(ns com.amazonaws.services.applicationinsights.AmazonApplicationInsightsClientBuilder
  "Fluent builder for AmazonApplicationInsights. Use of the builder
  is preferred over using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.applicationinsights AmazonApplicationInsightsClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.applicationinsights.AmazonApplicationInsightsClientBuilder`"
  (^com.amazonaws.services.applicationinsights.AmazonApplicationInsightsClientBuilder []
    (AmazonApplicationInsightsClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.applicationinsights.AmazonApplicationInsights`"
  (^com.amazonaws.services.applicationinsights.AmazonApplicationInsights []
    (AmazonApplicationInsightsClientBuilder/defaultClient )))

