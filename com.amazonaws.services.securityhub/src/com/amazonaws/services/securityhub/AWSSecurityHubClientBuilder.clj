(ns com.amazonaws.services.securityhub.AWSSecurityHubClientBuilder
  "Fluent builder for AWSSecurityHub. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.securityhub AWSSecurityHubClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.securityhub.AWSSecurityHubClientBuilder`"
  (^com.amazonaws.services.securityhub.AWSSecurityHubClientBuilder []
    (AWSSecurityHubClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.securityhub.AWSSecurityHub`"
  (^com.amazonaws.services.securityhub.AWSSecurityHub []
    (AWSSecurityHubClientBuilder/defaultClient )))

