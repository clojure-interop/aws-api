(ns com.amazonaws.ResponseMetadata
  "Represents additional metadata included with a response from AWS. Response
  metadata varies by service, but all services return an AWS request ID that
  can be used in the event a service call isn't working as expected and you
  need to work with AWS support to debug an issue.

  Access to AWS request IDs is also available through the com.amazonaws.request
  logger in the AWS SDK for Java."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws ResponseMetadata]))

(defn ->response-metadata
  "Constructor.

  Creates a new ResponseMetadata object from a specified map of raw
   metadata information.

  metadata - The raw metadata for the new ResponseMetadata object. - `java.util.Map`"
  (^ResponseMetadata [^java.util.Map metadata]
    (new ResponseMetadata metadata)))

(def *-aws-request-id
  "Static Constant.

  type: java.lang.String"
  ResponseMetadata/AWS_REQUEST_ID)

(def *-aws-extended-request-id
  "Static Constant.

  type: java.lang.String"
  ResponseMetadata/AWS_EXTENDED_REQUEST_ID)

(defn get-request-id
  "Returns the AWS request ID contained in this response metadata object.
   AWS request IDs can be used in the event a service call isn't working as
   expected and you need to work with AWS support to debug an issue.

  returns: The AWS request ID contained in this response metadata object. - `java.lang.String`"
  (^java.lang.String [^ResponseMetadata this]
    (-> this (.getRequestId))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ResponseMetadata this]
    (-> this (.toString))))

