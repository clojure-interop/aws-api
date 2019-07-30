(ns com.amazonaws.regions.RegionUtils
  "Utilities for working with regions."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.regions RegionUtils]))

(defn ->region-utils
  "Constructor."
  (^RegionUtils []
    (new RegionUtils )))

(defn *get-regions-for-service
  "Returns a list of the regions that support the service given.

  service-abbreviation - The service endpoint prefix which can be retrieved from the constant ENDPOINT_PREFIX of the specific service client interface. - `java.lang.String`

  returns: `java.util.List<com.amazonaws.regions.Region>`"
  (^java.util.List [^java.lang.String service-abbreviation]
    (RegionUtils/getRegionsForService service-abbreviation)))

(defn *load-metadata-from-uri
  "Deprecated.

  uri - the uri of the XML file to parse - `java.net.URI`
  config - configuration for the HTTP client to use to fetch the file - `com.amazonaws.ClientConfiguration`

  returns: the parsed region metadata - `com.amazonaws.regions.RegionMetadata`

  throws: java.io.IOException - on error fetching or parsing the XML file"
  (^com.amazonaws.regions.RegionMetadata [^java.net.URI uri ^com.amazonaws.ClientConfiguration config]
    (RegionUtils/loadMetadataFromURI uri config))
  (^com.amazonaws.regions.RegionMetadata [^java.net.URI uri]
    (RegionUtils/loadMetadataFromURI uri)))

(defn *initialize-from-resource
  "Deprecated.

  clazz - the class to use as a base for the resource - `java.lang.Class`
  name - the path to the resource, relative to the given class - `java.lang.String`

  throws: com.amazonaws.SdkClientException - on error"
  ([^java.lang.Class clazz ^java.lang.String name]
    (RegionUtils/initializeFromResource clazz name))
  ([^java.lang.String name]
    (RegionUtils/initializeFromResource name)))

(defn *get-region-metadata
  "Returns the current set of region metadata for this process,
   initializing it if it has not yet been explicitly initialized before.

  returns: the current set of region metadata - `com.amazonaws.regions.RegionMetadata`"
  (^com.amazonaws.regions.RegionMetadata []
    (RegionUtils/getRegionMetadata )))

(defn *initialize-from-file
  "Deprecated.

  file - the file to load from - `java.io.File`

  throws: com.amazonaws.SdkClientException - on error opening or reading from the file"
  ([^java.io.File file]
    (RegionUtils/initializeFromFile file)))

(defn *load-metadata-from-resource
  "Deprecated.

  clazz - the class to use as a base for the resource - `java.lang.Class`
  name - the path to the resource, relative to the given class - `java.lang.String`

  returns: the parsed region metadata - `com.amazonaws.regions.RegionMetadata`

  throws: java.io.IOException - if the resource is not found or cannot be parsed"
  (^com.amazonaws.regions.RegionMetadata [^java.lang.Class clazz ^java.lang.String name]
    (RegionUtils/loadMetadataFromResource clazz name))
  (^com.amazonaws.regions.RegionMetadata [^java.lang.String name]
    (RegionUtils/loadMetadataFromResource name)))

(defn *initialize-from-uri
  "Deprecated.

  uri - the uri of the XML file to parse - `java.net.URI`
  config - configuration for the HTTP client to use to fetch the file - `com.amazonaws.ClientConfiguration`

  throws: com.amazonaws.SdkClientException - on error"
  ([^java.net.URI uri ^com.amazonaws.ClientConfiguration config]
    (RegionUtils/initializeFromURI uri config))
  ([^java.net.URI uri]
    (RegionUtils/initializeFromURI uri)))

(defn *initialize
  "Initializes the region metadata by loading from the default hierarchy
   of region metadata locations."
  ([]
    (RegionUtils/initialize )))

(defn *initialize-with-metadata
  "Directly sets the singleton RegionMetadata instance.

  metadata - the new region metadata object - `com.amazonaws.regions.RegionMetadata`"
  ([^com.amazonaws.regions.RegionMetadata metadata]
    (RegionUtils/initializeWithMetadata metadata)))

(defn *init
  "Deprecated. in favor of initialize()"
  ([]
    (RegionUtils/init )))

(defn *load-metadata-from-file
  "Deprecated.

  file - the file to load from - `java.io.File`

  returns: the loaded region metadata - `com.amazonaws.regions.RegionMetadata`

  throws: java.io.IOException - on error opening or reading from the file"
  (^com.amazonaws.regions.RegionMetadata [^java.io.File file]
    (RegionUtils/loadMetadataFromFile file)))

(defn *load-metadata-from-input-stream
  "Deprecated.

  stream - the stream to load from - `java.io.InputStream`

  returns: the loaded region metadata - `com.amazonaws.regions.RegionMetadata`

  throws: java.io.IOException - on error reading from the stream"
  (^com.amazonaws.regions.RegionMetadata [^java.io.InputStream stream]
    (RegionUtils/loadMetadataFromInputStream stream)))

(defn *get-regions
  "Returns a list of the available AWS regions.

  returns: `java.util.List<com.amazonaws.regions.Region>`"
  (^java.util.List []
    (RegionUtils/getRegions )))

(defn *get-region
  "Returns the region with the given regionName and proper partition if found in region metadata.
   Otherwise, returns a Region object with given regionName and aws partition.

  region-name - `java.lang.String`

  returns: `com.amazonaws.regions.Region`"
  (^com.amazonaws.regions.Region [^java.lang.String region-name]
    (RegionUtils/getRegion region-name)))

