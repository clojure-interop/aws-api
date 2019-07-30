(ns com.amazonaws.regions.LegacyRegionXmlLoadUtils
  "Deprecated."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.regions LegacyRegionXmlLoadUtils]))

(defn ->legacy-region-xml-load-utils
  "Constructor.

  Deprecated."
  (^LegacyRegionXmlLoadUtils []
    (new LegacyRegionXmlLoadUtils )))

(defn *load
  "Deprecated.

  uri - the uri of the XML file to parse - `java.net.URI`
  config - configuration for the HTTP client to use to fetch the file - `com.amazonaws.ClientConfiguration`

  returns: `com.amazonaws.regions.RegionMetadata`

  throws: java.io.IOException - any error while reading data."
  (^com.amazonaws.regions.RegionMetadata [^java.net.URI uri ^com.amazonaws.ClientConfiguration config]
    (LegacyRegionXmlLoadUtils/load uri config))
  (^com.amazonaws.regions.RegionMetadata [^java.io.File file]
    (LegacyRegionXmlLoadUtils/load file)))

