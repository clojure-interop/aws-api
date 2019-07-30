(ns com.amazonaws.util.EC2MetadataUtils$IAMSecurityCredential
  "The temporary security credentials (AccessKeyId, SecretAccessKey,
  SessionToken, and Expiration) associated with the IAM role."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.util EC2MetadataUtils$IAMSecurityCredential]))

(defn ->iam-security-credential
  "Constructor."
  (^EC2MetadataUtils$IAMSecurityCredential []
    (new EC2MetadataUtils$IAMSecurityCredential )))

(defn code
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^EC2MetadataUtils$IAMSecurityCredential this]
    (-> this .-code)))

(defn message
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^EC2MetadataUtils$IAMSecurityCredential this]
    (-> this .-message)))

(defn last-updated
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^EC2MetadataUtils$IAMSecurityCredential this]
    (-> this .-lastUpdated)))

(defn type
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^EC2MetadataUtils$IAMSecurityCredential this]
    (-> this .-type)))

(defn access-key-id
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^EC2MetadataUtils$IAMSecurityCredential this]
    (-> this .-accessKeyId)))

(defn secret-access-key
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^EC2MetadataUtils$IAMSecurityCredential this]
    (-> this .-secretAccessKey)))

(defn token
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^EC2MetadataUtils$IAMSecurityCredential this]
    (-> this .-token)))

(defn expiration
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^EC2MetadataUtils$IAMSecurityCredential this]
    (-> this .-expiration)))

(defn secret-acess-key
  "Instance Field.

  Deprecated. because it is spelled incorrectly

  type: java.lang.String"
  (^java.lang.String [^EC2MetadataUtils$IAMSecurityCredential this]
    (-> this .-secretAcessKey)))

