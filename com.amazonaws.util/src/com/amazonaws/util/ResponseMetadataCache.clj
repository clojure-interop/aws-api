(ns com.amazonaws.util.ResponseMetadataCache
  "Cache of response metadata for recently executed requests for diagnostic
  purposes. This cache has a max size and as entries are added, the oldest
  entry is aged out once the max size has been reached."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.util ResponseMetadataCache]))

(defn ->response-metadata-cache
  "Constructor.

  Creates a new cache that will contain, at most the specified number of
   entries.

  max-entries - The maximum size of this cache. - `int`"
  (^ResponseMetadataCache [^Integer max-entries]
    (new ResponseMetadataCache max-entries)))

(defn add
  "Description copied from interface: MetadataCache

  obj - The key by which to store the metadata. - `java.lang.Object`
  metadata - The metadata for this entry. - `com.amazonaws.ResponseMetadata`"
  ([^ResponseMetadataCache this ^java.lang.Object obj ^com.amazonaws.ResponseMetadata metadata]
    (-> this (.add obj metadata))))

(defn get
  "Description copied from interface: MetadataCache

  obj - The key by which the desired metadata is stored. - `java.lang.Object`

  returns: The response metadata associated with the given object key,
           otherwise null if no metadata is associated with that object. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^ResponseMetadataCache this ^java.lang.Object obj]
    (-> this (.get obj))))

