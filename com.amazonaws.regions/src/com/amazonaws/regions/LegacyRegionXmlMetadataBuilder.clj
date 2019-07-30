(ns com.amazonaws.regions.LegacyRegionXmlMetadataBuilder
  "A region metadata builder that loads the data by looking at all the
  legacy metadata locations."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.regions LegacyRegionXmlMetadataBuilder]))

(defn ->legacy-region-xml-metadata-builder
  "Constructor."
  (^LegacyRegionXmlMetadataBuilder []
    (new LegacyRegionXmlMetadataBuilder )))

(defn build
  "returns: `com.amazonaws.regions.RegionMetadata`"
  (^com.amazonaws.regions.RegionMetadata [^LegacyRegionXmlMetadataBuilder this]
    (-> this (.build))))

