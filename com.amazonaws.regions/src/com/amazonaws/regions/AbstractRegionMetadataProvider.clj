(ns com.amazonaws.regions.AbstractRegionMetadataProvider
  "An abstract implementation of RegionMetadataProvider"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.regions AbstractRegionMetadataProvider]))

(defn ->abstract-region-metadata-provider
  "Constructor."
  (^AbstractRegionMetadataProvider []
    (new AbstractRegionMetadataProvider )))

(defn get-region-by-endpoint
  "Description copied from interface: RegionMetadataProvider

  endpoint - The endpoint for any service residing in the desired region. - `java.lang.String`

  returns: The region containing any service running at the specified
   endpoint, otherwise an exception is thrown if no region is found
   with a service at the specified endpoint. - `com.amazonaws.regions.Region`"
  (^com.amazonaws.regions.Region [^AbstractRegionMetadataProvider this ^java.lang.String endpoint]
    (-> this (.getRegionByEndpoint endpoint))))

