(ns com.amazonaws.regions.RegionImpl
  "Interface for an region implementation."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.regions RegionImpl]))

(defn get-name
  "The unique system ID for this region; ex: \"us-east-1\".

  returns: The unique system ID for this region. - `java.lang.String`"
  (^java.lang.String [^RegionImpl this]
    (-> this (.getName))))

(defn get-domain
  "Returns the domain for this region; ex: \"amazonaws.com\".

  returns: The domain for this region. - `java.lang.String`"
  (^java.lang.String [^RegionImpl this]
    (-> this (.getDomain))))

(defn get-partition
  "Returns the partition this region is in. I.E. 'aws' or 'aws-cn'

  returns: The partition this region is in. - `java.lang.String`"
  (^java.lang.String [^RegionImpl this]
    (-> this (.getPartition))))

(defn service-supported?
  "Returns whether the given service is supported in this region.

  service-name - The service endpoint prefix which can be retrieved from the constant ENDPOINT_PREFIX of the specific service client interface, e.g. AmazonEC2.ENDPOINT_PREFIX. - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^RegionImpl this ^java.lang.String service-name]
    (-> this (.isServiceSupported service-name))))

(defn get-service-endpoint
  "Returns the endpoint for the service given.

  service-name - The service endpoint prefix which can be retrieved from the constant ENDPOINT_PREFIX of the specific service client interface, e.g. AmazonEC2.ENDPOINT_PREFIX. - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^RegionImpl this ^java.lang.String service-name]
    (-> this (.getServiceEndpoint service-name))))

(defn has-http-endpoint?
  "Returns whether the given service support the http protocol in this region.

  service-name - The service endpoint prefix which can be retrieved from the constant ENDPOINT_PREFIX of the specific service client interface, e.g. AmazonEC2.ENDPOINT_PREFIX. - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^RegionImpl this ^java.lang.String service-name]
    (-> this (.hasHttpEndpoint service-name))))

(defn has-https-endpoint?
  "Returns whether the given service support the https protocol in this region.

  service-name - The service endpoint prefix which can be retrieved from the constant ENDPOINT_PREFIX of the specific service client interface, e.g. AmazonEC2.ENDPOINT_PREFIX. - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^RegionImpl this ^java.lang.String service-name]
    (-> this (.hasHttpsEndpoint service-name))))

(defn get-available-endpoints
  "Returns an immutable collection of all the endpoints available in the
   region
   metadata.

  returns: `java.util.Collection<java.lang.String>`"
  (^java.util.Collection [^RegionImpl this]
    (-> this (.getAvailableEndpoints))))

