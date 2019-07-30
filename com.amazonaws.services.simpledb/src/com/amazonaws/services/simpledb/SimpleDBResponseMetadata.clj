(ns com.amazonaws.services.simpledb.SimpleDBResponseMetadata
  "Extension of ResponseMetadata with Amazon SimpleDB specific data. In addition to the
  standard AWS request ID contained in all services' response metadata, Amazon SimpleDB also
  includes information on how much compute capacity, or box usage, was used to process your
  request.

  SimpleDB box usage is useful when looking at how different queries perform on your data. You can
  use that information to tune your queries, and reduce your monthly SimpleDB usage charges."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.simpledb SimpleDBResponseMetadata]))

(defn ->simple-db-response-metadata
  "Constructor.

  Creates a new SimpleDBResponseMetadata object from a specified map of metadata information.

  metadata - The raw metadata for the new SimpleDBResponseMetadata object. - `java.util.Map`"
  (^SimpleDBResponseMetadata [^java.util.Map metadata]
    (new SimpleDBResponseMetadata metadata)))

(def *-box-usage
  "Static Constant.

  type: java.lang.String"
  SimpleDBResponseMetadata/BOX_USAGE)

(defn get-box-usage
  "Returns the SimpleDB box usage reported in a response's metadata. SimpleDB box usage
   indicates how much compute capacity was used to process your request.

   Box usage is useful when looking at how different queries perform on your data. You can use
   that information to tune your queries, and reduce your monthly SimpleDB usage charges.

  returns: The SimpleDB box usage reported for the associated request. - `float`"
  (^Float [^SimpleDBResponseMetadata this]
    (-> this (.getBoxUsage))))

