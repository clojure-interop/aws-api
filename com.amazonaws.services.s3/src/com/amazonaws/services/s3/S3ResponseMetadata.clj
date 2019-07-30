(ns com.amazonaws.services.s3.S3ResponseMetadata
  "Extension of ResponseMetadata with Amazon S3 specific data. In
  addition to the standard AWS request ID contained in all services' response
  metadata, Amazon S3 also includes a host ID that can be provided to AWS
  support when debugging an issue with Amazon S3."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.s3 S3ResponseMetadata]))

(defn ->s-3-response-metadata
  "Constructor.

  Creates a new S3ResponseMetadata object from a specified map of metadata
   information.

  metadata - The raw metadata for the new S3ResponseMetadata object. - `java.util.Map`"
  (^S3ResponseMetadata [^java.util.Map metadata]
    (new S3ResponseMetadata metadata)))

(def *-host-id
  "Static Constant.

  type: java.lang.String"
  S3ResponseMetadata/HOST_ID)

(def *-cloud-front-id
  "Static Constant.

  type: java.lang.String"
  S3ResponseMetadata/CLOUD_FRONT_ID)

(defn get-host-id
  "Returns the Amazon S3 host ID, providing additional debugging information
   about how a request was handled. You can provide AWS support with this ID
   to help troubleshoot issues where Amazon S3 isn't handling your request
   as expected.

  returns: The Amazon S3 host ID, providing additional debugging information
           about how a request was handled. - `java.lang.String`"
  (^java.lang.String [^S3ResponseMetadata this]
    (-> this (.getHostId))))

(defn get-cloud-front-id
  "returns: `java.lang.String`"
  (^java.lang.String [^S3ResponseMetadata this]
    (-> this (.getCloudFrontId))))

