(ns com.amazonaws.regions.Region
  "Metadata for an AWS region, including its name and what services
  are available in it."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.regions Region]))

(defn ->region
  "Constructor.

  region-impl - `com.amazonaws.regions.RegionImpl`"
  (^Region [^com.amazonaws.regions.RegionImpl region-impl]
    (new Region region-impl)))

(defn *get-region
  "Returns the region with the id given, or null if it cannot be found in
   the current regions.xml file.

  region - `com.amazonaws.regions.Regions`

  returns: `com.amazonaws.regions.Region`"
  (^com.amazonaws.regions.Region [^com.amazonaws.regions.Regions region]
    (Region/getRegion region)))

(defn create-client
  "Deprecated. use appropriate AwsClientBuilder implementation
               for the service being constructed. For example:
               AmazonSNSClientBuilder.standard().withRegion(region).build();

  service-class - The service client class to instantiate, e.g. AmazonS3Client.class - `java.lang.Class`
  credentials - The credentials provider to use, or null for the default credentials provider - `com.amazonaws.auth.AWSCredentialsProvider`
  config - The configuration to use, or null for the default configuration - `com.amazonaws.ClientConfiguration`

  returns: `<T extends com.amazonaws.AmazonWebServiceClient> T`"
  ([^Region this ^java.lang.Class service-class ^com.amazonaws.auth.AWSCredentialsProvider credentials ^com.amazonaws.ClientConfiguration config]
    (-> this (.createClient service-class credentials config))))

(defn service-supported?
  "Returns whether the given service is supported in this region.

  service-name - The service endpoint prefix which can be retrieved from the constant ENDPOINT_PREFIX of the specific service client interface, e.g. AmazonEC2.ENDPOINT_PREFIX. - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^Region this ^java.lang.String service-name]
    (-> this (.isServiceSupported service-name))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Region this]
    (-> this (.toString))))

(defn has-http-endpoint?
  "Returns whether the given service support the http protocol in this region.

  service-name - The service endpoint prefix which can be retrieved from the constant ENDPOINT_PREFIX of the specific service client interface, e.g. AmazonEC2.ENDPOINT_PREFIX. - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^Region this ^java.lang.String service-name]
    (-> this (.hasHttpEndpoint service-name))))

(defn get-available-endpoints
  "Returns a immutable collection of all endpoints available in the
   metadata.

  returns: `java.util.Collection<java.lang.String>`"
  (^java.util.Collection [^Region this]
    (-> this (.getAvailableEndpoints))))

(defn get-name
  "The unique system ID for this region; ex: \"us-east-1\".

  returns: The unique system ID for this region. - `java.lang.String`"
  (^java.lang.String [^Region this]
    (-> this (.getName))))

(defn get-service-endpoint
  "Returns the endpoint for the service given.

  endpoint-prefix - The service endpoint prefix which can be retrieved from the constant ENDPOINT_PREFIX of the specific service client interface, e.g. AmazonEC2.ENDPOINT_PREFIX. - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^Region this ^java.lang.String endpoint-prefix]
    (-> this (.getServiceEndpoint endpoint-prefix))))

(defn get-partition
  "Returns the partition this region is in. I.E. 'aws' or 'aws-cn'

  returns: The partition this region is in. - `java.lang.String`"
  (^java.lang.String [^Region this]
    (-> this (.getPartition))))

(defn get-domain
  "Returns the domain for this region; ex: \"amazonaws.com\".

  returns: The domain for this region. - `java.lang.String`"
  (^java.lang.String [^Region this]
    (-> this (.getDomain))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Region this]
    (-> this (.hashCode))))

(defn has-https-endpoint?
  "Returns whether the given service support the https protocol in this region.

  service-name - The service endpoint prefix which can be retrieved from the constant ENDPOINT_PREFIX of the specific service client interface, e.g. AmazonEC2.ENDPOINT_PREFIX. - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^Region this ^java.lang.String service-name]
    (-> this (.hasHttpsEndpoint service-name))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Region this ^java.lang.Object obj]
    (-> this (.equals obj))))

