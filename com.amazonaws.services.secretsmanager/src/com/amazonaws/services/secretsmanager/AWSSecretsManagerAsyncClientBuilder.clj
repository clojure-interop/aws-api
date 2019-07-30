(ns com.amazonaws.services.secretsmanager.AWSSecretsManagerAsyncClientBuilder
  "Fluent builder for AWSSecretsManagerAsync. Use of the builder is
  preferred over using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.secretsmanager AWSSecretsManagerAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.secretsmanager.AWSSecretsManagerAsyncClientBuilder`"
  (^com.amazonaws.services.secretsmanager.AWSSecretsManagerAsyncClientBuilder []
    (AWSSecretsManagerAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.secretsmanager.AWSSecretsManagerAsync`"
  (^com.amazonaws.services.secretsmanager.AWSSecretsManagerAsync []
    (AWSSecretsManagerAsyncClientBuilder/defaultClient )))

