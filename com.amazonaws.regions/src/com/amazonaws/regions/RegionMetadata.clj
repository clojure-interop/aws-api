(ns com.amazonaws.regions.RegionMetadata
  "A collection of metadata about a set of regions and the services they
  contain."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.regions RegionMetadata]))

(defn ->region-metadata
  "Constructor.

  Creates a new RegionMetadata object from the given list of regions.

  regions - the list of regions - `java.util.List`"
  (^RegionMetadata [^java.util.List regions]
    (new RegionMetadata regions)))

(defn get-regions
  "Returns an immutable list of all regions known to this region metadata
   object, in no particular order.

  returns: an immutable list of all regions - `java.util.List<com.amazonaws.regions.Region>`"
  (^java.util.List [^RegionMetadata this]
    (-> this (.getRegions))))

(defn get-region
  "Returns the region with the name given, if it exists. Otherwise, returns
   null.

  name - the name of the region to search for - `java.lang.String`

  returns: the corresponding region, if it exists - `com.amazonaws.regions.Region`"
  (^com.amazonaws.regions.Region [^RegionMetadata this ^java.lang.String name]
    (-> this (.getRegion name))))

(defn get-regions-for-service
  "Returns a list of the regions that support the service given.

  service - The service endpoint prefix which can be retrieved from the constant ENDPOINT_PREFIX of the specific service client interface, e.g. AmazonEC2.ENDPOINT_PREFIX. - `java.lang.String`

  returns: the list of regions with support for the given service - `java.util.List<com.amazonaws.regions.Region>`"
  (^java.util.List [^RegionMetadata this ^java.lang.String service]
    (-> this (.getRegionsForService service))))

(defn get-region-by-endpoint
  "Deprecated. sdk no longer holds the complete endpoint for every service in the region.
   It now uses the partition metadata to compute the endpoints dynamically for new regions and services.

  endpoint - The endpoint for any service residing in the desired region. - `java.lang.String`

  returns: The region containing any service running at the specified
   endpoint, otherwise an exception is thrown if no region is found
   with a service at the specified endpoint. - `com.amazonaws.regions.Region`

  throws: java.lang.IllegalArgumentException - If the given URL is malformed, or if the one of the service URLs on record is malformed."
  (^com.amazonaws.regions.Region [^RegionMetadata this ^java.lang.String endpoint]
    (-> this (.getRegionByEndpoint endpoint))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^RegionMetadata this]
    (-> this (.toString))))

