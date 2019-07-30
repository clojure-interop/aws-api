(ns com.amazonaws.regions.AwsProfileRegionProvider
  "Loads region information from the shared AWS config file. Uses the default profile unless
  otherwise specified."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.regions AwsProfileRegionProvider]))

(defn ->aws-profile-region-provider
  "Constructor.

  profile-name - `java.lang.String`"
  (^AwsProfileRegionProvider [^java.lang.String profile-name]
    (new AwsProfileRegionProvider profile-name))
  (^AwsProfileRegionProvider []
    (new AwsProfileRegionProvider )))

(defn get-region
  "returns: Region name to use or null if region information is not available. - `java.lang.String`

  throws: com.amazonaws.SdkClientException"
  (^java.lang.String [^AwsProfileRegionProvider this]
    (-> this (.getRegion))))

