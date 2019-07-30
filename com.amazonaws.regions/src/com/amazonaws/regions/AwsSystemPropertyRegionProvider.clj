(ns com.amazonaws.regions.AwsSystemPropertyRegionProvider
  "Loads region information from the '\"aws.region\"' JVM system
  property."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.regions AwsSystemPropertyRegionProvider]))

(defn ->aws-system-property-region-provider
  "Constructor."
  (^AwsSystemPropertyRegionProvider []
    (new AwsSystemPropertyRegionProvider )))

(defn get-region
  "returns: Region name to use or null if region information is not available. - `java.lang.String`

  throws: com.amazonaws.SdkClientException"
  (^java.lang.String [^AwsSystemPropertyRegionProvider this]
    (-> this (.getRegion))))

