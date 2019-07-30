(ns com.amazonaws.regions.RegionMetadataProvider
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.regions RegionMetadataProvider]))

(defn get-regions
  "Returns an immutable list of all regions known to this region metadata
   object, in no particular order.

  returns: an immutable list of all regions - `java.util.List<com.amazonaws.regions.Region>`"
  (^java.util.List [^RegionMetadataProvider this]
    (-> this (.getRegions))))

(defn get-region
  "Returns the region with the name given, if it exists in the metadata
   or if it can be derived from the metadata.
   Otherwise, returns null.

  region-name - the name of the region to search for - `java.lang.String`

  returns: the corresponding region, if it exists or derived. - `com.amazonaws.regions.Region`"
  (^com.amazonaws.regions.Region [^RegionMetadataProvider this ^java.lang.String region-name]
    (-> this (.getRegion region-name))))

(defn get-regions-for-service
  "Returns a list of the regions that support the service given.

  service-name - The service endpoint prefix which can be retrieved from the constant ENDPOINT_PREFIX of the specific service client interface, e.g. AmazonEC2.ENDPOINT_PREFIX. - `java.lang.String`

  returns: the list of regions with support for the given service - `java.util.List<com.amazonaws.regions.Region>`"
  (^java.util.List [^RegionMetadataProvider this ^java.lang.String service-name]
    (-> this (.getRegionsForService service-name))))

(defn get-region-by-endpoint
  "Deprecated. sdk no longer holds the complete endpoint for every service in the region.
   It now uses the partition metadata to compute the endpoints dynamically for new regions and services.

  endpoint - The endpoint for any service residing in the desired region. - `java.lang.String`

  returns: The region containing any service running at the specified
   endpoint, otherwise an exception is thrown if no region is found
   with a service at the specified endpoint. - `com.amazonaws.regions.Region`

  throws: java.lang.IllegalArgumentException - If the given URL is malformed, or if the one of the service URLs on record is malformed."
  (^com.amazonaws.regions.Region [^RegionMetadataProvider this ^java.lang.String endpoint]
    (-> this (.getRegionByEndpoint endpoint))))

