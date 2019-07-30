(ns com.amazonaws.regions.AwsRegionProvider
  "Interface for providing AWS region information. Implementations are free to use any strategy for
  providing region information."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.regions AwsRegionProvider]))

(defn ->aws-region-provider
  "Constructor."
  (^AwsRegionProvider []
    (new AwsRegionProvider )))

(defn get-region
  "returns: Region name to use or null if region information is not available. - `java.lang.String`

  throws: com.amazonaws.SdkClientException"
  (^java.lang.String [^AwsRegionProvider this]
    (-> this (.getRegion))))

