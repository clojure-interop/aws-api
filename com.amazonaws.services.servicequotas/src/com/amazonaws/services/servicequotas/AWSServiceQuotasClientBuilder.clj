(ns com.amazonaws.services.servicequotas.AWSServiceQuotasClientBuilder
  "Fluent builder for AWSServiceQuotas. Use of the builder is preferred
  over using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.servicequotas AWSServiceQuotasClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.servicequotas.AWSServiceQuotasClientBuilder`"
  (^com.amazonaws.services.servicequotas.AWSServiceQuotasClientBuilder []
    (AWSServiceQuotasClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.servicequotas.AWSServiceQuotas`"
  (^com.amazonaws.services.servicequotas.AWSServiceQuotas []
    (AWSServiceQuotasClientBuilder/defaultClient )))

