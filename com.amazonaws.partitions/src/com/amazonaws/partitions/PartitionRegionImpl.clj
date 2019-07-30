(ns com.amazonaws.partitions.PartitionRegionImpl
  "A region implementation backed by the partition."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.partitions PartitionRegionImpl]))

(defn ->partition-region-impl
  "Constructor.

  region - `java.lang.String`
  p - `com.amazonaws.partitions.model.Partition`"
  (^PartitionRegionImpl [^java.lang.String region ^com.amazonaws.partitions.model.Partition p]
    (new PartitionRegionImpl region p)))

(defn get-name
  "Description copied from interface: RegionImpl

  returns: The unique system ID for this region. - `java.lang.String`"
  (^java.lang.String [^PartitionRegionImpl this]
    (-> this (.getName))))

(defn get-domain
  "Description copied from interface: RegionImpl

  returns: The domain for this region. - `java.lang.String`"
  (^java.lang.String [^PartitionRegionImpl this]
    (-> this (.getDomain))))

(defn get-partition
  "Description copied from interface: RegionImpl

  returns: The partition this region is in. - `java.lang.String`"
  (^java.lang.String [^PartitionRegionImpl this]
    (-> this (.getPartition))))

(defn get-service-endpoint
  "Returns the endpoint for the given service.
   If the region is not present under service configuration; but matches
   the region regex, then this system tries to guess the endpoint and
   returns it.

  service-name - The service endpoint prefix which can be retrieved from the constant ENDPOINT_PREFIX of the specific service client interface, e.g. AmazonEC2.ENDPOINT_PREFIX. - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^PartitionRegionImpl this ^java.lang.String service-name]
    (-> this (.getServiceEndpoint service-name))))

(defn service-supported?
  "Returns true if the service is explicitly enabled for a region or a
   service is partition wide enabled. Returns false otherwise.

   For new regions that match the partition's region regex, if the
   service is enabled partition wide then this method will return true.

  service-name - The service endpoint prefix which can be retrieved from the constant ENDPOINT_PREFIX of the specific service client interface, e.g. AmazonEC2.ENDPOINT_PREFIX. - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^PartitionRegionImpl this ^java.lang.String service-name]
    (-> this (.isServiceSupported service-name))))

(defn has-https-endpoint?
  "Returns true if the service is explicitly enabled for https in this
   region or a service is partition wide enabled. Returns false otherwise.

   For new regions that match the partition's region regex, if the
   service is enabled partition wide then this method will return true.

  service-name - The service endpoint prefix which can be retrieved from the constant ENDPOINT_PREFIX of the specific service client interface, e.g. AmazonEC2.ENDPOINT_PREFIX. - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^PartitionRegionImpl this ^java.lang.String service-name]
    (-> this (.hasHttpsEndpoint service-name))))

(defn has-http-endpoint?
  "Returns true if the service is explicitly enabled for http in this
   region or a service is partition wide enabled. Returns false otherwise.

   For new regions that match the partition's region regex, if the
   service is enabled partition wide then this method will return true.

  service-name - The service endpoint prefix which can be retrieved from the constant ENDPOINT_PREFIX of the specific service client interface, e.g. AmazonEC2.ENDPOINT_PREFIX. - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^PartitionRegionImpl this ^java.lang.String service-name]
    (-> this (.hasHttpEndpoint service-name))))

(defn get-available-endpoints
  "Description copied from interface: RegionImpl

  returns: `java.util.Collection<java.lang.String>`"
  (^java.util.Collection [^PartitionRegionImpl this]
    (-> this (.getAvailableEndpoints))))

