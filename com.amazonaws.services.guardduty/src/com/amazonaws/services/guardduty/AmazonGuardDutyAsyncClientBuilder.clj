(ns com.amazonaws.services.guardduty.AmazonGuardDutyAsyncClientBuilder
  "Fluent builder for AmazonGuardDutyAsync. Use of the builder is preferred
  over using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.guardduty AmazonGuardDutyAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.guardduty.AmazonGuardDutyAsyncClientBuilder`"
  (^com.amazonaws.services.guardduty.AmazonGuardDutyAsyncClientBuilder []
    (AmazonGuardDutyAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.guardduty.AmazonGuardDutyAsync`"
  (^com.amazonaws.services.guardduty.AmazonGuardDutyAsync []
    (AmazonGuardDutyAsyncClientBuilder/defaultClient )))

