(ns com.amazonaws.services.s3control.S3ControlResponseMetadata
  "Response metadata for AWS S3 Control Service."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.s3control S3ControlResponseMetadata]))

(defn ->s-3-control-response-metadata
  "Constructor.

  metadata - `java.util.Map`"
  (^S3ControlResponseMetadata [^java.util.Map metadata]
    (new S3ControlResponseMetadata metadata)))

(defn get-extended-request-id
  "returns: The extended request ID if available. This is needed in addition to ResponseMetadata.getRequestId() to
   troubleshoot requests with the S3 service team. - `java.lang.String`"
  (^java.lang.String [^S3ControlResponseMetadata this]
    (-> this (.getExtendedRequestId))))

