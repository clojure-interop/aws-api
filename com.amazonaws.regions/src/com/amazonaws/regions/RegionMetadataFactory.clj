(ns com.amazonaws.regions.RegionMetadataFactory
  "A factory to create RegionMetadata"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.regions RegionMetadataFactory]))

(defn *create
  "returns: `com.amazonaws.regions.RegionMetadata`"
  (^com.amazonaws.regions.RegionMetadata []
    (RegionMetadataFactory/create )))

