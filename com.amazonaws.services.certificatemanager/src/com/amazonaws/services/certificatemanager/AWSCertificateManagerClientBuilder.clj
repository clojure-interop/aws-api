(ns com.amazonaws.services.certificatemanager.AWSCertificateManagerClientBuilder
  "Fluent builder for AWSCertificateManager. Use of the builder is
  preferred over using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.certificatemanager AWSCertificateManagerClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.certificatemanager.AWSCertificateManagerClientBuilder`"
  (^com.amazonaws.services.certificatemanager.AWSCertificateManagerClientBuilder []
    (AWSCertificateManagerClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.certificatemanager.AWSCertificateManager`"
  (^com.amazonaws.services.certificatemanager.AWSCertificateManager []
    (AWSCertificateManagerClientBuilder/defaultClient )))

