(ns com.amazonaws.util.EC2MetadataUtils
  "Utility class for retrieving Amazon EC2 instance metadata.
  You can use the data to build more generic AMIs that can be modified by
  configuration files supplied at launch time. For example, if you run web
  servers for various small businesses, they can all use the same AMI and
  retrieve their content from the Amazon S3 bucket you specify at launch. To
  add a new customer at any time, simply create a bucket for the customer, add
  their content, and launch your AMI.


  You can disable the use of the EC2 Instance meta data service by either setting the
  SDKGlobalConfiguration.AWS_EC2_METADATA_DISABLED_ENV_VAR or
  SDKGlobalConfiguration.AWS_EC2_METADATA_DISABLED_SYSTEM_PROPERTY to 'true'(not case sensitive).

  More information about Amazon EC2 Metadata"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.util EC2MetadataUtils]))

(defn ->ec-2-metadata-utils
  "Constructor."
  (^EC2MetadataUtils []
    (new EC2MetadataUtils )))

(def *-security-credentials-resource
  "Static Constant.

  Default resource path for credentials in the Amazon EC2 Instance Metadata Service.

  type: java.lang.String"
  EC2MetadataUtils/SECURITY_CREDENTIALS_RESOURCE)

(defn *get-iam-security-credentials
  "Returns the temporary security credentials (AccessKeyId, SecretAccessKey,
   SessionToken, and Expiration) associated with the IAM roles on the
   instance.

  returns: `java.util.Map<java.lang.String,com.amazonaws.util.EC2MetadataUtils$IAMSecurityCredential>`"
  (^java.util.Map []
    (EC2MetadataUtils/getIAMSecurityCredentials )))

(defn *get-ramdisk-id
  "Get the ID of the RAM disk specified at launch time, if applicable.

  returns: `java.lang.String`"
  (^java.lang.String []
    (EC2MetadataUtils/getRamdiskId )))

(defn *get-data
  "path - `java.lang.String`
  tries - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String path ^Integer tries]
    (EC2MetadataUtils/getData path tries))
  (^java.lang.String [^java.lang.String path]
    (EC2MetadataUtils/getData path)))

(defn *get-availability-zone
  "Get the Availability Zone in which the instance launched.

  returns: `java.lang.String`"
  (^java.lang.String []
    (EC2MetadataUtils/getAvailabilityZone )))

(defn *get-ancestor-ami-ids
  "Get the list of AMI IDs of any instances that were rebundled to created
   this AMI. Will only exist if the AMI manifest file contained an
   ancestor-amis key.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (EC2MetadataUtils/getAncestorAmiIds )))

(defn *get-instance-signature
  "Get the signature of the instance.

  returns: `java.lang.String`"
  (^java.lang.String []
    (EC2MetadataUtils/getInstanceSignature )))

(defn *get-reservation-id
  "Get the ID of the reservation.

  returns: `java.lang.String`"
  (^java.lang.String []
    (EC2MetadataUtils/getReservationId )))

(defn *get-user-data
  "Get the metadata sent to the instance

  returns: `java.lang.String`"
  (^java.lang.String []
    (EC2MetadataUtils/getUserData )))

(defn *get-instance-action
  "Notifies the instance that it should reboot in preparation for bundling.
   Valid values: none | shutdown | bundle-pending.

  returns: `java.lang.String`"
  (^java.lang.String []
    (EC2MetadataUtils/getInstanceAction )))

(defn *get-product-codes
  "Get the list of product codes associated with the instance, if any.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (EC2MetadataUtils/getProductCodes )))

(defn *get-ami-id
  "Get the AMI ID used to launch the instance.

  returns: `java.lang.String`"
  (^java.lang.String []
    (EC2MetadataUtils/getAmiId )))

(defn *get-instance-info
  "The instance info is only guaranteed to be a JSON document per
   http://docs
   .aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html

   This method is only a best attempt to capture the instance info as a
   typed object.

   Get an InstanceInfo object with dynamic information about this instance.

  returns: `com.amazonaws.util.EC2MetadataUtils$InstanceInfo`"
  (^com.amazonaws.util.EC2MetadataUtils$InstanceInfo []
    (EC2MetadataUtils/getInstanceInfo )))

(defn *get-network-interfaces
  "Get the list of network interfaces on the instance.

  returns: `java.util.List<com.amazonaws.util.EC2MetadataUtils$NetworkInterface>`"
  (^java.util.List []
    (EC2MetadataUtils/getNetworkInterfaces )))

(defn *get-ami-launch-index
  "Get the index of this instance in the reservation.

  returns: `java.lang.String`"
  (^java.lang.String []
    (EC2MetadataUtils/getAmiLaunchIndex )))

(defn *get-private-ip-address
  "Get the private IP address of the instance. In cases where multiple
   network interfaces are present, this refers to the eth0 device (the
   device for which device-number is 0).

  returns: `java.lang.String`"
  (^java.lang.String []
    (EC2MetadataUtils/getPrivateIpAddress )))

(defn *get-items
  "path - Path to query. - `java.lang.String`
  tries - Number of attempts to query EC2 metadata service for items. - `int`

  returns: List of items for given path or null if path does not exist. - `java.util.List<java.lang.String>`"
  (^java.util.List [^java.lang.String path ^Integer tries]
    (EC2MetadataUtils/getItems path tries))
  (^java.util.List [^java.lang.String path]
    (EC2MetadataUtils/getItems path)))

(defn *get-public-key
  "Get the public key. Only available if supplied at instance launch time.

  returns: `java.lang.String`"
  (^java.lang.String []
    (EC2MetadataUtils/getPublicKey )))

(defn *get-ami-manifest-path
  "Get the manifest path of the AMI with which the instance was launched.

  returns: `java.lang.String`"
  (^java.lang.String []
    (EC2MetadataUtils/getAmiManifestPath )))

(defn *get-mac-address
  "Get the MAC address of the instance. In cases where multiple network
   interfaces are present, this refers to the eth0 device (the device for
   which device-number is 0).

  returns: `java.lang.String`"
  (^java.lang.String []
    (EC2MetadataUtils/getMacAddress )))

(defn *get-ec-2-instance-region
  "Returns the current region of this running EC2 instance; or null if
   it is unable to do so. The method avoids interpreting other parts of the
   instance info JSON document to minimize potential failure.

   The instance info is only guaranteed to be a JSON document per
   http://docs
   .aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html

  returns: `java.lang.String`"
  (^java.lang.String []
    (EC2MetadataUtils/getEC2InstanceRegion )))

(defn *get-instance-type
  "Get the type of the instance.

  returns: `java.lang.String`"
  (^java.lang.String []
    (EC2MetadataUtils/getInstanceType )))

(defn *get-block-device-mapping
  "Get the virtual devices associated with the ami, root, ebs, and swap.

  returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map []
    (EC2MetadataUtils/getBlockDeviceMapping )))

(defn *get-instance-id
  "Get the ID of this instance.

  returns: `java.lang.String`"
  (^java.lang.String []
    (EC2MetadataUtils/getInstanceId )))

(defn *get-host-address-for-ec-2-metadata-service
  "Returns the host address of the Amazon EC2 Instance Metadata Service.

  returns: `java.lang.String`"
  (^java.lang.String []
    (EC2MetadataUtils/getHostAddressForEC2MetadataService )))

(defn *get-security-groups
  "Get the list of names of the security groups applied to the instance.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (EC2MetadataUtils/getSecurityGroups )))

(defn *get-iam-instance-profile-info
  "Get information about the last time the instance profile was updated,
   including the instance's LastUpdated date, InstanceProfileArn, and
   InstanceProfileId.

  returns: `com.amazonaws.util.EC2MetadataUtils$IAMInfo`"
  (^com.amazonaws.util.EC2MetadataUtils$IAMInfo []
    (EC2MetadataUtils/getIAMInstanceProfileInfo )))

(defn *get-local-host-name
  "Get the local hostname of the instance. In cases where multiple network
   interfaces are present, this refers to the eth0 device (the device for
   which device-number is 0).

  returns: `java.lang.String`"
  (^java.lang.String []
    (EC2MetadataUtils/getLocalHostName )))

