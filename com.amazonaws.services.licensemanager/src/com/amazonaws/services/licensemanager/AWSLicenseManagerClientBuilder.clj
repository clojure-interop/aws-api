(ns com.amazonaws.services.licensemanager.AWSLicenseManagerClientBuilder
  "Fluent builder for AWSLicenseManager. Use of the builder is preferred
  over using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.licensemanager AWSLicenseManagerClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.licensemanager.AWSLicenseManagerClientBuilder`"
  (^com.amazonaws.services.licensemanager.AWSLicenseManagerClientBuilder []
    (AWSLicenseManagerClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.licensemanager.AWSLicenseManager`"
  (^com.amazonaws.services.licensemanager.AWSLicenseManager []
    (AWSLicenseManagerClientBuilder/defaultClient )))

