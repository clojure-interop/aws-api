(ns com.amazonaws.util.EC2MetadataUtils$NetworkInterface
  "All of the metadata associated with a network interface on the instance."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.util EC2MetadataUtils$NetworkInterface]))

(defn ->network-interface
  "Constructor.

  mac-address - `java.lang.String`"
  (^EC2MetadataUtils$NetworkInterface [^java.lang.String mac-address]
    (new EC2MetadataUtils$NetworkInterface mac-address)))

(defn get-public-i-pv-4s
  "The elastic IP addresses associated with the interface.
   There may be multiple IP addresses on an instance.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^EC2MetadataUtils$NetworkInterface this]
    (-> this (.getPublicIPv4s))))

(defn get-subnet-id
  "ID of the subnet in which the interface resides.
   Returned only for Amazon EC2 instances launched into a VPC.

  returns: `java.lang.String`"
  (^java.lang.String [^EC2MetadataUtils$NetworkInterface this]
    (-> this (.getSubnetId))))

(defn get-i-pv-4-association
  "Get the private IPv4 address(es) that are associated with the
   public-ip address and assigned to that interface.

  public-ip - The public IP address - `java.lang.String`

  returns: Private IPv4 address(es) associated with the public IP
           address. - `java.util.List<java.lang.String>`"
  (^java.util.List [^EC2MetadataUtils$NetworkInterface this ^java.lang.String public-ip]
    (-> this (.getIPv4Association public-ip))))

(defn get-vpc-i-pv-4-cidr-block
  "The CIDR block of the Amazon EC2-VPC in which the interface
   resides.
   Returned only for Amazon EC2 instances launched into a VPC.

  returns: `java.lang.String`"
  (^java.lang.String [^EC2MetadataUtils$NetworkInterface this]
    (-> this (.getVpcIPv4CidrBlock))))

(defn get-subnet-i-pv-4-cidr-block
  "The CIDR block of the Amazon EC2-VPC subnet in which the interface
   resides.
   Returned only for Amazon EC2 instances launched into a VPC.

  returns: `java.lang.String`"
  (^java.lang.String [^EC2MetadataUtils$NetworkInterface this]
    (-> this (.getSubnetIPv4CidrBlock))))

(defn get-hostname
  "The interface's local hostname.

  returns: `java.lang.String`"
  (^java.lang.String [^EC2MetadataUtils$NetworkInterface this]
    (-> this (.getHostname))))

(defn get-public-hostname
  "The interface's public hostname.

  returns: `java.lang.String`"
  (^java.lang.String [^EC2MetadataUtils$NetworkInterface this]
    (-> this (.getPublicHostname))))

(defn get-mac-address
  "The interface's Media Acess Control (mac) address

  returns: `java.lang.String`"
  (^java.lang.String [^EC2MetadataUtils$NetworkInterface this]
    (-> this (.getMacAddress))))

(defn get-local-i-pv-4s
  "The private IP addresses associated with the interface.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^EC2MetadataUtils$NetworkInterface this]
    (-> this (.getLocalIPv4s))))

(defn get-security-group-ids
  "IDs of the security groups to which the network interface belongs.
   Returned only for Amazon EC2 instances launched into a VPC.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^EC2MetadataUtils$NetworkInterface this]
    (-> this (.getSecurityGroupIds))))

(defn get-owner-id
  "The ID of the owner of the network interface.
   In multiple-interface environments, an interface can be attached by a
   third party, such as Elastic Load Balancing. Traffic on an interface
   is always billed to the interface owner.

  returns: `java.lang.String`"
  (^java.lang.String [^EC2MetadataUtils$NetworkInterface this]
    (-> this (.getOwnerId))))

(defn get-vpc-id
  "ID of the Amazon EC2-VPC in which the interface resides.
   Returned only for Amazon EC2 instances launched into a VPC.

  returns: `java.lang.String`"
  (^java.lang.String [^EC2MetadataUtils$NetworkInterface this]
    (-> this (.getVpcId))))

(defn get-profile
  "The interface's profile.

  returns: `java.lang.String`"
  (^java.lang.String [^EC2MetadataUtils$NetworkInterface this]
    (-> this (.getProfile))))

(defn get-security-groups
  "Security groups to which the network interface belongs.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^EC2MetadataUtils$NetworkInterface this]
    (-> this (.getSecurityGroups))))

