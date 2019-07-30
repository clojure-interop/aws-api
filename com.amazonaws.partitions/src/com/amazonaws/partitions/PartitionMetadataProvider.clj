(ns com.amazonaws.partitions.PartitionMetadataProvider
  "Region metadata provider based on partitions."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.partitions PartitionMetadataProvider]))

(defn ->partition-metadata-provider
  "Constructor.

  partitions - `java.util.List`"
  (^PartitionMetadataProvider [^java.util.List partitions]
    (new PartitionMetadataProvider partitions)))

(defn get-regions
  "Description copied from interface: RegionMetadataProvider

  returns: an immutable list of all regions - `java.util.List<com.amazonaws.regions.Region>`"
  (^java.util.List [^PartitionMetadataProvider this]
    (-> this (.getRegions))))

(defn get-region
  "Description copied from interface: RegionMetadataProvider

  region-name - the name of the region to search for - `java.lang.String`

  returns: the corresponding region, if it exists or derived. - `com.amazonaws.regions.Region`"
  (^com.amazonaws.regions.Region [^PartitionMetadataProvider this ^java.lang.String region-name]
    (-> this (.getRegion region-name))))

(defn get-regions-for-service
  "Description copied from interface: RegionMetadataProvider

  service-name - The service endpoint prefix which can be retrieved from the constant ENDPOINT_PREFIX of the specific service client interface, e.g. AmazonEC2.ENDPOINT_PREFIX. - `java.lang.String`

  returns: the list of regions with support for the given service - `java.util.List<com.amazonaws.regions.Region>`"
  (^java.util.List [^PartitionMetadataProvider this ^java.lang.String service-name]
    (-> this (.getRegionsForService service-name))))

