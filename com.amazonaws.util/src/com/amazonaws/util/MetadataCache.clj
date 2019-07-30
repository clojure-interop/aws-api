(ns com.amazonaws.util.MetadataCache
  "Interface for caches interacting with response metadata."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.util MetadataCache]))

(defn add
  "Adds a new entry to this cache, possibly evicting the oldest entry if the
   cache is at its size limit.

  obj - The key by which to store the metadata. - `java.lang.Object`
  metadata - The metadata for this entry. - `com.amazonaws.ResponseMetadata`"
  ([^MetadataCache this ^java.lang.Object obj ^com.amazonaws.ResponseMetadata metadata]
    (-> this (.add obj metadata))))

(defn get
  "Returns the response metadata associated with the specified object, or
   null if no metadata is associated with that object.

  obj - The key by which the desired metadata is stored. - `java.lang.Object`

  returns: The response metadata associated with the given object key,
           otherwise null if no metadata is associated with that object. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^MetadataCache this ^java.lang.Object obj]
    (-> this (.get obj))))

