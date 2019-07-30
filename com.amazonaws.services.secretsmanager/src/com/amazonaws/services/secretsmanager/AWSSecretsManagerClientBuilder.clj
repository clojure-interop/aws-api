(ns com.amazonaws.services.secretsmanager.AWSSecretsManagerClientBuilder
  "Fluent builder for AWSSecretsManager. Use of the builder is preferred
  over using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.secretsmanager AWSSecretsManagerClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.secretsmanager.AWSSecretsManagerClientBuilder`"
  (^com.amazonaws.services.secretsmanager.AWSSecretsManagerClientBuilder []
    (AWSSecretsManagerClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.secretsmanager.AWSSecretsManager`"
  (^com.amazonaws.services.secretsmanager.AWSSecretsManager []
    (AWSSecretsManagerClientBuilder/defaultClient )))

