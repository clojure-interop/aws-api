(ns com.amazonaws.regions.DefaultAwsRegionProviderChain
  "Default region provider chain used when no explicit region is supplied to a client builder."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.regions DefaultAwsRegionProviderChain]))

(defn ->default-aws-region-provider-chain
  "Constructor."
  (^DefaultAwsRegionProviderChain []
    (new DefaultAwsRegionProviderChain )))

