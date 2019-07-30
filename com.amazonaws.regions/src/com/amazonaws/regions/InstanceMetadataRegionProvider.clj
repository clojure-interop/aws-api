(ns com.amazonaws.regions.InstanceMetadataRegionProvider
  "Attempts to load region information from the EC2 Metadata service. If the application is not
  running on EC2 or SDKGlobalConfiguration.isEc2MetadataDisabled() returns true,
  this provider will return null."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.regions InstanceMetadataRegionProvider]))

(defn ->instance-metadata-region-provider
  "Constructor."
  (^InstanceMetadataRegionProvider []
    (new InstanceMetadataRegionProvider )))

(defn get-region
  "returns: Region name to use or null if region information is not available. - `java.lang.String`

  throws: com.amazonaws.AmazonClientException - if SDKGlobalConfiguration.isEc2MetadataDisabled() is true"
  (^java.lang.String [^InstanceMetadataRegionProvider this]
    (-> this (.getRegion))))

