(ns com.amazonaws.util.EC2MetadataUtils$InstanceInfo
  "This POJO is a best attempt to capture the instance info which is only
  guaranteed to be a JSON document per
  http://docs.aws.amazon.com/AWSEC2/latest
  /UserGuide/ec2-instance-metadata.html

  Instance info includes dynamic information about the current instance
  such as region, instanceId, private IP address, etc."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.util EC2MetadataUtils$InstanceInfo]))

(defn ->instance-info
  "Constructor.

  pending-time - `java.lang.String`
  instance-type - `java.lang.String`
  image-id - `java.lang.String`
  instance-id - `java.lang.String`
  billing-products - `java.lang.String[]`
  architecture - `java.lang.String`
  account-id - `java.lang.String`
  kernel-id - `java.lang.String`
  ramdisk-id - `java.lang.String`
  region - `java.lang.String`
  version - `java.lang.String`
  availability-zone - `java.lang.String`
  private-ip - `java.lang.String`
  devpay-product-codes - `java.lang.String[]`"
  (^EC2MetadataUtils$InstanceInfo [^java.lang.String pending-time ^java.lang.String instance-type ^java.lang.String image-id ^java.lang.String instance-id billing-products ^java.lang.String architecture ^java.lang.String account-id ^java.lang.String kernel-id ^java.lang.String ramdisk-id ^java.lang.String region ^java.lang.String version ^java.lang.String availability-zone ^java.lang.String private-ip devpay-product-codes]
    (new EC2MetadataUtils$InstanceInfo pending-time instance-type image-id instance-id billing-products architecture account-id kernel-id ramdisk-id region version availability-zone private-ip devpay-product-codes)))

(defn get-image-id
  "returns: `java.lang.String`"
  (^java.lang.String [^EC2MetadataUtils$InstanceInfo this]
    (-> this (.getImageId))))

(defn get-billing-products
  "returns: `java.lang.String[]`"
  ([^EC2MetadataUtils$InstanceInfo this]
    (-> this (.getBillingProducts))))

(defn get-kernel-id
  "returns: `java.lang.String`"
  (^java.lang.String [^EC2MetadataUtils$InstanceInfo this]
    (-> this (.getKernelId))))

(defn get-ramdisk-id
  "returns: `java.lang.String`"
  (^java.lang.String [^EC2MetadataUtils$InstanceInfo this]
    (-> this (.getRamdiskId))))

(defn get-availability-zone
  "returns: `java.lang.String`"
  (^java.lang.String [^EC2MetadataUtils$InstanceInfo this]
    (-> this (.getAvailabilityZone))))

(defn get-pending-time
  "returns: `java.lang.String`"
  (^java.lang.String [^EC2MetadataUtils$InstanceInfo this]
    (-> this (.getPendingTime))))

(defn get-account-id
  "returns: `java.lang.String`"
  (^java.lang.String [^EC2MetadataUtils$InstanceInfo this]
    (-> this (.getAccountId))))

(defn get-architecture
  "returns: `java.lang.String`"
  (^java.lang.String [^EC2MetadataUtils$InstanceInfo this]
    (-> this (.getArchitecture))))

(defn get-private-ip
  "returns: `java.lang.String`"
  (^java.lang.String [^EC2MetadataUtils$InstanceInfo this]
    (-> this (.getPrivateIp))))

(defn get-version
  "returns: `java.lang.String`"
  (^java.lang.String [^EC2MetadataUtils$InstanceInfo this]
    (-> this (.getVersion))))

(defn get-instance-type
  "returns: `java.lang.String`"
  (^java.lang.String [^EC2MetadataUtils$InstanceInfo this]
    (-> this (.getInstanceType))))

(defn get-devpay-product-codes
  "returns: `java.lang.String[]`"
  ([^EC2MetadataUtils$InstanceInfo this]
    (-> this (.getDevpayProductCodes))))

(defn get-instance-id
  "returns: `java.lang.String`"
  (^java.lang.String [^EC2MetadataUtils$InstanceInfo this]
    (-> this (.getInstanceId))))

(defn get-region
  "returns: `java.lang.String`"
  (^java.lang.String [^EC2MetadataUtils$InstanceInfo this]
    (-> this (.getRegion))))

