(ns com.amazonaws.util.NullResponseMetadataCache
  "No-op response metadata cache used when a client instance is configured
  without response metadata caching enabled."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.util NullResponseMetadataCache]))

(defn ->null-response-metadata-cache
  "Constructor."
  (^NullResponseMetadataCache []
    (new NullResponseMetadataCache )))

(defn add
  "Description copied from interface: MetadataCache

  obj - The key by which to store the metadata. - `java.lang.Object`
  metadata - The metadata for this entry. - `com.amazonaws.ResponseMetadata`"
  ([^NullResponseMetadataCache this ^java.lang.Object obj ^com.amazonaws.ResponseMetadata metadata]
    (-> this (.add obj metadata))))

(defn get
  "Description copied from interface: MetadataCache

  obj - The key by which the desired metadata is stored. - `java.lang.Object`

  returns: The response metadata associated with the given object key,
           otherwise null if no metadata is associated with that object. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^NullResponseMetadataCache this ^java.lang.Object obj]
    (-> this (.get obj))))

