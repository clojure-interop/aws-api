(ns com.amazonaws.partitions.PartitionsLoader
  "Loads all the partition files into memory."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.partitions PartitionsLoader]))

(defn ->partitions-loader
  "Constructor."
  (^PartitionsLoader []
    (new PartitionsLoader )))

(def *-partitions-resource-path
  "Static Constant.

  class path from where all partition files are loaded.

  type: java.lang.String"
  PartitionsLoader/PARTITIONS_RESOURCE_PATH)

(def *-partitions-override-resource-path
  "Static Constant.

  override class path from where all partition files are loaded.

  type: java.lang.String"
  PartitionsLoader/PARTITIONS_OVERRIDE_RESOURCE_PATH)

(defn build
  "Loads the partition files from the PARTITIONS_OVERRIDE_RESOURCE_PATH. If no files are present, then
   loads the partition files from the PARTITIONS_RESOURCE_PATH

   Builds the RegionMetadata from the partition files.

  returns: `com.amazonaws.partitions.PartitionMetadataProvider`"
  (^com.amazonaws.partitions.PartitionMetadataProvider [^PartitionsLoader this]
    (-> this (.build))))

