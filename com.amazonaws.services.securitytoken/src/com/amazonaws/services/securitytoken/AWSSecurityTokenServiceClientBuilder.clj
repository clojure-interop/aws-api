(ns com.amazonaws.services.securitytoken.AWSSecurityTokenServiceClientBuilder
  "Fluent builder for AWSSecurityTokenService. Use of the builder is
  preferred over using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.securitytoken AWSSecurityTokenServiceClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.securitytoken.AWSSecurityTokenServiceClientBuilder`"
  (^com.amazonaws.services.securitytoken.AWSSecurityTokenServiceClientBuilder []
    (AWSSecurityTokenServiceClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.securitytoken.AWSSecurityTokenService`"
  (^com.amazonaws.services.securitytoken.AWSSecurityTokenService []
    (AWSSecurityTokenServiceClientBuilder/defaultClient )))

