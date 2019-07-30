(ns com.amazonaws.services.guardduty.AmazonGuardDutyClientBuilder
  "Fluent builder for AmazonGuardDuty. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.guardduty AmazonGuardDutyClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.guardduty.AmazonGuardDutyClientBuilder`"
  (^com.amazonaws.services.guardduty.AmazonGuardDutyClientBuilder []
    (AmazonGuardDutyClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.guardduty.AmazonGuardDuty`"
  (^com.amazonaws.services.guardduty.AmazonGuardDuty []
    (AmazonGuardDutyClientBuilder/defaultClient )))

