(ns com.amazonaws.endpointdiscovery.EndpointDiscoveryRefreshCache
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.endpointdiscovery EndpointDiscoveryRefreshCache]))

(defn ->endpoint-discovery-refresh-cache
  "Constructor.

  cache-loader - `com.amazonaws.cache.CacheLoader`"
  (^EndpointDiscoveryRefreshCache [^com.amazonaws.cache.CacheLoader cache-loader]
    (new EndpointDiscoveryRefreshCache cache-loader)))

(defn get
  "Abstract method to be implemented by each service to handle retrieving
   endpoints from a cache. Each service must handle converting a request
   object into the relevant cache key.

  key - - The cache key to use - `K`
  required - - Whether or not the service requires use of endpoint discovery - `boolean`
  default-endpoint - - The default endpoint for the service - `java.net.URI`

  returns: The endpoint to use for this request - `java.net.URI`"
  (^java.net.URI [^EndpointDiscoveryRefreshCache this key ^Boolean required ^java.net.URI default-endpoint]
    (-> this (.get key required default-endpoint))))

(defn put
  "Abstract method to be implemented by each service to handle storing endpoints
   in it's cache. This method must schedule refresh of cache values whenever putting
   a new endpoint into it's cache.

  key - - The cache key - `java.lang.String`
  endpoint-details - - The details for an endpoint including the address and cache period. - `java.util.Map`
  default-endpoint - `java.net.URI`

  returns: The endpoint used for this request - `java.net.URI`"
  (^java.net.URI [^EndpointDiscoveryRefreshCache this ^java.lang.String key ^java.util.Map endpoint-details ^java.net.URI default-endpoint]
    (-> this (.put key endpoint-details default-endpoint))))

(defn evict
  "key - `java.lang.String`"
  ([^EndpointDiscoveryRefreshCache this ^java.lang.String key]
    (-> this (.evict key))))

(defn discover-endpoint
  "key - `java.lang.String`
  required - `boolean`
  default-endpoint - `java.net.URI`

  returns: `java.net.URI`"
  (^java.net.URI [^EndpointDiscoveryRefreshCache this ^java.lang.String key ^Boolean required ^java.net.URI default-endpoint]
    (-> this (.discoverEndpoint key required default-endpoint))))

(defn load-and-schedule-refresh
  "key - `java.lang.String`
  refresh-period - `long`
  default-endpoint - `java.net.URI`

  returns: `java.util.concurrent.ScheduledFuture<java.net.URI>`"
  (^java.util.concurrent.ScheduledFuture [^EndpointDiscoveryRefreshCache this ^java.lang.String key ^Long refresh-period ^java.net.URI default-endpoint]
    (-> this (.loadAndScheduleRefresh key refresh-period default-endpoint))))

(defn shutdown
  ""
  ([^EndpointDiscoveryRefreshCache this]
    (-> this (.shutdown))))

