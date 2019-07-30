(ns com.amazonaws.internal.EC2MetadataClient
  "Deprecated.
 Refer EC2MetadataUtils"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.internal EC2MetadataClient]))

(defn ->ec-2-metadata-client
  "Constructor.

  Deprecated."
  (^EC2MetadataClient []
    (new EC2MetadataClient )))

(def *-security-credentials-resource
  "Static Constant.

  Deprecated.

  type: java.lang.String"
  EC2MetadataClient/SECURITY_CREDENTIALS_RESOURCE)

(defn get-default-credentials
  "Deprecated.

  returns: The response from the Amazon EC2 Instance Metadata Service, or
           null if no credential information was available. - `java.lang.String`

  throws: java.io.IOException - If any problems are encountered while connecting to the Amazon EC2 Instance Metadata Service."
  (^java.lang.String [^EC2MetadataClient this]
    (-> this (.getDefaultCredentials))))

(defn read-resource
  "Deprecated.

  resource-path - The resource - `java.lang.String`

  returns: The text payload returned from the Amazon EC2 Instance Metadata
           service for the specified resource path. - `java.lang.String`

  throws: java.io.IOException - If any problems were encountered while connecting to metadata service for the requested resource path."
  (^java.lang.String [^EC2MetadataClient this ^java.lang.String resource-path]
    (-> this (.readResource resource-path))))

