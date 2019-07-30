(ns com.amazonaws.services.organizations.AWSOrganizationsClientBuilder
  "Fluent builder for AWSOrganizations. Use of the builder is preferred
  over using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.organizations AWSOrganizationsClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.organizations.AWSOrganizationsClientBuilder`"
  (^com.amazonaws.services.organizations.AWSOrganizationsClientBuilder []
    (AWSOrganizationsClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.organizations.AWSOrganizations`"
  (^com.amazonaws.services.organizations.AWSOrganizations []
    (AWSOrganizationsClientBuilder/defaultClient )))

