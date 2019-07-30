(ns com.amazonaws.regions.RegionMetadataParser
  "Parses a region metadata file to pull out information about the
  available regions, names, IDs, and what service endpoints are available
  in each region."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.regions RegionMetadataParser]))

(defn ->region-metadata-parser
  "Constructor.

  Deprecated. since this object is stateless"
  (^RegionMetadataParser []
    (new RegionMetadataParser )))

(defn *parse
  "Parses the specified input stream and returns a RegionMetadata
   object.

  input - the input stream to parse - `java.io.InputStream`

  returns: the parsed region metadata - `com.amazonaws.regions.RegionMetadata`

  throws: java.io.IOException - on error"
  (^com.amazonaws.regions.RegionMetadata [^java.io.InputStream input]
    (RegionMetadataParser/parse input)))

(defn parse-region-metadata
  "Deprecated. in favor of parse(InputStream)

  input - The stream containing the region metadata to parse. - `java.io.InputStream`
  endpoint-verification - Whether to verify each region endpoint - `boolean`

  returns: The list of parsed regions. - `java.util.List<com.amazonaws.regions.Region>`

  throws: java.io.IOException"
  (^java.util.List [^RegionMetadataParser this ^java.io.InputStream input ^Boolean endpoint-verification]
    (-> this (.parseRegionMetadata input endpoint-verification)))
  (^java.util.List [^RegionMetadataParser this ^java.io.InputStream input]
    (-> this (.parseRegionMetadata input))))

