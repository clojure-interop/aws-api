(ns com.amazonaws.regions.AwsEnvVarOverrideRegionProvider
  "Loads region information from the '\"AWS_REGION\"'
  environment variable."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.regions AwsEnvVarOverrideRegionProvider]))

(defn ->aws-env-var-override-region-provider
  "Constructor."
  (^AwsEnvVarOverrideRegionProvider []
    (new AwsEnvVarOverrideRegionProvider )))

(defn get-region
  "returns: Region name to use or null if region information is not available. - `java.lang.String`

  throws: com.amazonaws.SdkClientException"
  (^java.lang.String [^AwsEnvVarOverrideRegionProvider this]
    (-> this (.getRegion))))

