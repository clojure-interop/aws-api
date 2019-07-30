(ns com.amazonaws.services.identitymanagement.AmazonIdentityManagementClientBuilder
  "Fluent builder for AmazonIdentityManagement. Use of the builder is
  preferred over using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.identitymanagement AmazonIdentityManagementClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.identitymanagement.AmazonIdentityManagementClientBuilder`"
  (^com.amazonaws.services.identitymanagement.AmazonIdentityManagementClientBuilder []
    (AmazonIdentityManagementClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.identitymanagement.AmazonIdentityManagement`"
  (^com.amazonaws.services.identitymanagement.AmazonIdentityManagement []
    (AmazonIdentityManagementClientBuilder/defaultClient )))

