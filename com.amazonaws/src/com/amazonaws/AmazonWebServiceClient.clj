(ns com.amazonaws.AmazonWebServiceClient
  "Abstract base class for Amazon Web Service Java clients.

  Responsible for basic client capabilities that are the same across all AWS
  SDK Java clients (ex: setting the client endpoint)."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws AmazonWebServiceClient]))

(defn ->amazon-web-service-client
  "Constructor.

  Constructs a new AmazonWebServiceClient object using the specified
   configuration and request metric collector.

  client-configuration - The client configuration for this client. - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector to be used at the http client level; can be null. - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AmazonWebServiceClient [^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AmazonWebServiceClient client-configuration request-metric-collector))
  (^AmazonWebServiceClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonWebServiceClient client-configuration)))

(def *-logging-aws-request-metric
  "Static Constant.

  Deprecated. No longer used.

  type: boolean"
  AmazonWebServiceClient/LOGGING_AWS_REQUEST_METRIC)

(defn configure-region
  "Deprecated. use AwsClientBuilder.setRegion(String)

  region - region to set to; must not be null. - `com.amazonaws.regions.Regions`"
  ([^AmazonWebServiceClient this ^com.amazonaws.regions.Regions region]
    (-> this (.configureRegion region))))

(defn get-monitoring-listeners
  "Returns MonitoringListener; or null if there is none.

  returns: `java.util.Collection<com.amazonaws.monitoring.MonitoringListener>`"
  (^java.util.Collection [^AmazonWebServiceClient this]
    (-> this (.getMonitoringListeners))))

(defn get-endpoint-prefix
  "returns: the service name that should be used when computing the region
           endpoints. This method returns the value of the
           regionMetadataServiceName configuration in the internal config
           file if such configuration is specified for the current client,
           otherwise it returns the same service name that is used for
           request signing. - `java.lang.String`"
  (^java.lang.String [^AmazonWebServiceClient this]
    (-> this (.getEndpointPrefix))))

(defn set-region
  "Deprecated. use AwsClientBuilder.setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. - `com.amazonaws.regions.Region`

  throws: java.lang.IllegalArgumentException - If the given region is null, or if this service isn't available in the given region. See Region.isServiceSupported(String)"
  ([^AmazonWebServiceClient this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn set-time-offset
  "Sets the optional value for time offset for this client.  This
   value will be applied to all requests processed through this client.
   Value is in seconds, positive values imply the current clock is \"fast\",
   negative values imply clock is slow.

  time-offset - The optional value for time offset (in seconds) for this client. - `int`"
  ([^AmazonWebServiceClient this ^Integer time-offset]
    (-> this (.setTimeOffset time-offset))))

(defn with-time-offset
  "Sets the optional value for time offset for this client.  This
   value will be applied to all requests processed through this client.
   Value is in seconds, positive values imply the current clock is \"fast\",
   negative values imply clock is slow.

  time-offset - The optional value for time offset (in seconds) for this client. - `int`

  returns: the updated web service client - `com.amazonaws.AmazonWebServiceClient`"
  (^com.amazonaws.AmazonWebServiceClient [^AmazonWebServiceClient this ^Integer time-offset]
    (-> this (.withTimeOffset time-offset))))

(defn add-request-handler
  "Deprecated. by addRequestHandler(RequestHandler2).

   Appends a request handler to the list of registered handlers that are run
   as part of a request's lifecycle.

  request-handler - The new handler to add to the current list of request handlers. - `com.amazonaws.handlers.RequestHandler`"
  ([^AmazonWebServiceClient this ^com.amazonaws.handlers.RequestHandler request-handler]
    (-> this (.addRequestHandler request-handler))))

(defn get-signer-region-override
  "Returns the signer region override.

  returns: `java.lang.String`"
  (^java.lang.String [^AmazonWebServiceClient this]
    (-> this (.getSignerRegionOverride))))

(defn set-service-name-intern
  "An internal method used to explicitly override the service name
   computed by the default implementation. This method is not expected to be
   normally called except for AWS internal development purposes.

  service-name - `java.lang.String`"
  ([^AmazonWebServiceClient this ^java.lang.String service-name]
    (-> this (.setServiceNameIntern service-name))))

(defn get-service-name
  "Returns the service abbreviation for this service, used for identifying
   service endpoints by region, identifying the necessary signer, etc.
   Used to be call \"getServiceAbbreviation\".

  returns: `java.lang.String`"
  (^java.lang.String [^AmazonWebServiceClient this]
    (-> this (.getServiceName))))

(defn get-client-configuration
  "returns: `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration [^AmazonWebServiceClient this]
    (-> this (.getClientConfiguration))))

(defn get-signer-by-uri
  "Returns the signer based on the given URI and the current AWS client
   configuration. Currently only the SQS client can have different region on
   a per request basis. For other AWS clients, the region remains the same
   on a per AWS client level.

   Note, however, the signer returned for S3 is incomplete at this stage as
   the information on the S3 bucket and key is not yet known.

  uri - `java.net.URI`

  returns: `com.amazonaws.auth.Signer`"
  (^com.amazonaws.auth.Signer [^AmazonWebServiceClient this ^java.net.URI uri]
    (-> this (.getSignerByURI uri))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held
   open. If this method is not invoked, resources may be leaked. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonWebServiceClient this]
    (-> this (.shutdown))))

(defn with-region
  "Deprecated. use AwsClientBuilder.withRegion(Region) for example:
   AmazonSNSClientBuilder.standard().withRegion(region).build();

  region - `com.amazonaws.regions.Region`

  returns: `<T extends com.amazonaws.AmazonWebServiceClient> T`"
  ([^AmazonWebServiceClient this ^com.amazonaws.regions.Region region]
    (-> this (.withRegion region))))

(defn set-endpoint
  "Deprecated. Please use the client builders instead. The
   AwsClientBuilder.withEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) method on the builder allows
   setting both endpoint and signing region. See
   Creating Service Clients
   for more information.

  endpoint - The endpoint (ex: \"dynamodb.us-east-1.amazonaws.com/\") or a full URL, including the protocol (ex: \"http://dynamodb.us-east-1.amazonaws.com/\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`
  service-name - This parameter is ignored. - `java.lang.String`
  region-id - The ID of the region in which this service resides AND the overriding region for signing purposes. - `java.lang.String`

  throws: java.lang.IllegalArgumentException - If any problems are detected with the specified endpoint."
  ([^AmazonWebServiceClient this ^java.lang.String endpoint ^java.lang.String service-name ^java.lang.String region-id]
    (-> this (.setEndpoint endpoint service-name region-id)))
  ([^AmazonWebServiceClient this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn with-endpoint
  "Deprecated. use AwsClientBuilder.withEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for example:
   AmazonSNSClientBuilder.standard().withEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion)).build();

  endpoint - `java.lang.String`

  returns: `<T extends com.amazonaws.AmazonWebServiceClient> T`"
  ([^AmazonWebServiceClient this ^java.lang.String endpoint]
    (-> this (.withEndpoint endpoint))))

(defn make-immutable
  "Deprecated."
  ([^AmazonWebServiceClient this]
    (-> this (.makeImmutable))))

(defn remove-request-handler
  "Deprecated. use AwsClientBuilder.withRequestHandlers(RequestHandler2...)

  request-handler - The handler to remove from the current list of request handlers. - `com.amazonaws.handlers.RequestHandler`"
  ([^AmazonWebServiceClient this ^com.amazonaws.handlers.RequestHandler request-handler]
    (-> this (.removeRequestHandler request-handler))))

(defn get-signer-override
  "returns: `java.lang.String`"
  (^java.lang.String [^AmazonWebServiceClient this]
    (-> this (.getSignerOverride))))

(defn get-request-metrics-collector
  "Returns the client specific RequestMetricCollector; or null if
   there is none.

  returns: `com.amazonaws.metrics.RequestMetricCollector`"
  (^com.amazonaws.metrics.RequestMetricCollector [^AmazonWebServiceClient this]
    (-> this (.getRequestMetricsCollector))))

(defn set-signer-region-override
  "An internal method used to explicitly override the internal signer region
   computed by the default implementation. This method is not expected to be
   normally called except for AWS internal development purposes.

  signer-region-override - `java.lang.String`"
  ([^AmazonWebServiceClient this ^java.lang.String signer-region-override]
    (-> this (.setSignerRegionOverride signer-region-override))))

(defn get-time-offset
  "Returns the optional value for time offset for this client.  This
   value will be applied to all requests processed through this client.
   Value is in seconds, positive values imply the current clock is \"fast\",
   negative values imply clock is slow.

  returns: The optional value for time offset (in seconds) for this client. - `int`"
  (^Integer [^AmazonWebServiceClient this]
    (-> this (.getTimeOffset))))

