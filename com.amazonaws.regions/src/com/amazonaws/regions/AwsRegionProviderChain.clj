(ns com.amazonaws.regions.AwsRegionProviderChain
  "Composite AwsRegionProvider that sequentially delegates to a chain of providers looking
  for region information."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.regions AwsRegionProviderChain]))

(defn ->aws-region-provider-chain
  "Constructor.

  providers - `com.amazonaws.regions.AwsRegionProvider`"
  (^AwsRegionProviderChain [^com.amazonaws.regions.AwsRegionProvider providers]
    (new AwsRegionProviderChain providers)))

(defn get-region
  "returns: Region name to use or null if region information is not available. - `java.lang.String`

  throws: com.amazonaws.SdkClientException"
  (^java.lang.String [^AwsRegionProviderChain this]
    (-> this (.getRegion))))

