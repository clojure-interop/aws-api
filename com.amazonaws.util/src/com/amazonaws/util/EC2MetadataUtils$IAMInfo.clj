(ns com.amazonaws.util.EC2MetadataUtils$IAMInfo
  "Information about the last time the instance profile was updated,
  including the instance's LastUpdated date, InstanceProfileArn, and
  InstanceProfileId."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.util EC2MetadataUtils$IAMInfo]))

(defn ->iam-info
  "Constructor."
  (^EC2MetadataUtils$IAMInfo []
    (new EC2MetadataUtils$IAMInfo )))

(defn code
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^EC2MetadataUtils$IAMInfo this]
    (-> this .-code)))

(defn message
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^EC2MetadataUtils$IAMInfo this]
    (-> this .-message)))

(defn last-updated
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^EC2MetadataUtils$IAMInfo this]
    (-> this .-lastUpdated)))

(defn instance-profile-arn
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^EC2MetadataUtils$IAMInfo this]
    (-> this .-instanceProfileArn)))

(defn instance-profile-id
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^EC2MetadataUtils$IAMInfo this]
    (-> this .-instanceProfileId)))

