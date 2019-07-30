(ns com.amazonaws.regions.InMemoryRegionImpl
  "An implementation of RegionImpl that holds all information in memory."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.regions InMemoryRegionImpl]))

(defn ->in-memory-region-impl
  "Constructor.

  name - `java.lang.String`
  domain - `java.lang.String`"
  (^InMemoryRegionImpl [^java.lang.String name ^java.lang.String domain]
    (new InMemoryRegionImpl name domain)))

(defn add-https
  "service-name - `java.lang.String`

  returns: `com.amazonaws.regions.InMemoryRegionImpl`"
  (^com.amazonaws.regions.InMemoryRegionImpl [^InMemoryRegionImpl this ^java.lang.String service-name]
    (-> this (.addHttps service-name))))

(defn service-supported?
  "Description copied from interface: RegionImpl

  service-name - The service endpoint prefix which can be retrieved from the constant ENDPOINT_PREFIX of the specific service client interface, e.g. AmazonEC2.ENDPOINT_PREFIX. - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^InMemoryRegionImpl this ^java.lang.String service-name]
    (-> this (.isServiceSupported service-name))))

(defn has-http-endpoint?
  "Description copied from interface: RegionImpl

  service-name - The service endpoint prefix which can be retrieved from the constant ENDPOINT_PREFIX of the specific service client interface, e.g. AmazonEC2.ENDPOINT_PREFIX. - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^InMemoryRegionImpl this ^java.lang.String service-name]
    (-> this (.hasHttpEndpoint service-name))))

(defn get-available-endpoints
  "Description copied from interface: RegionImpl

  returns: `java.util.Collection<java.lang.String>`"
  (^java.util.Collection [^InMemoryRegionImpl this]
    (-> this (.getAvailableEndpoints))))

(defn get-name
  "Description copied from interface: RegionImpl

  returns: The unique system ID for this region. - `java.lang.String`"
  (^java.lang.String [^InMemoryRegionImpl this]
    (-> this (.getName))))

(defn add-endpoint
  "service-name - `java.lang.String`
  endpoint - `java.lang.String`

  returns: `com.amazonaws.regions.InMemoryRegionImpl`"
  (^com.amazonaws.regions.InMemoryRegionImpl [^InMemoryRegionImpl this ^java.lang.String service-name ^java.lang.String endpoint]
    (-> this (.addEndpoint service-name endpoint))))

(defn get-service-endpoint
  "Description copied from interface: RegionImpl

  service-name - The service endpoint prefix which can be retrieved from the constant ENDPOINT_PREFIX of the specific service client interface, e.g. AmazonEC2.ENDPOINT_PREFIX. - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^InMemoryRegionImpl this ^java.lang.String service-name]
    (-> this (.getServiceEndpoint service-name))))

(defn get-partition
  "Description copied from interface: RegionImpl

  returns: The partition this region is in. - `java.lang.String`"
  (^java.lang.String [^InMemoryRegionImpl this]
    (-> this (.getPartition))))

(defn get-domain
  "Description copied from interface: RegionImpl

  returns: The domain for this region. - `java.lang.String`"
  (^java.lang.String [^InMemoryRegionImpl this]
    (-> this (.getDomain))))

(defn has-https-endpoint?
  "Description copied from interface: RegionImpl

  service-name - The service endpoint prefix which can be retrieved from the constant ENDPOINT_PREFIX of the specific service client interface, e.g. AmazonEC2.ENDPOINT_PREFIX. - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^InMemoryRegionImpl this ^java.lang.String service-name]
    (-> this (.hasHttpsEndpoint service-name))))

(defn add-http
  "service-name - `java.lang.String`

  returns: `com.amazonaws.regions.InMemoryRegionImpl`"
  (^com.amazonaws.regions.InMemoryRegionImpl [^InMemoryRegionImpl this ^java.lang.String service-name]
    (-> this (.addHttp service-name))))

