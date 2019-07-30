(ns com.amazonaws.internal.DefaultServiceEndpointBuilder
  "Uses region metdata to construct an endpoint for a specific service"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.internal DefaultServiceEndpointBuilder]))

(defn ->default-service-endpoint-builder
  "Constructor.

  service-name - `java.lang.String`
  protocol - `java.lang.String`"
  (^DefaultServiceEndpointBuilder [^java.lang.String service-name ^java.lang.String protocol]
    (new DefaultServiceEndpointBuilder service-name protocol)))

(defn with-region
  "Description copied from class: ServiceEndpointBuilder

  region - New region to use in endpoint determination - `com.amazonaws.regions.Region`

  returns: A reference to this updated object so that method calls can be chained together. - `com.amazonaws.internal.DefaultServiceEndpointBuilder`"
  (^com.amazonaws.internal.DefaultServiceEndpointBuilder [^DefaultServiceEndpointBuilder this ^com.amazonaws.regions.Region region]
    (-> this (.withRegion region))))

(defn get-service-endpoint
  "Description copied from class: ServiceEndpointBuilder

  returns: URI of endpoint - `java.net.URI`"
  (^java.net.URI [^DefaultServiceEndpointBuilder this]
    (-> this (.getServiceEndpoint))))

(defn get-region
  "returns: `com.amazonaws.regions.Region`"
  (^com.amazonaws.regions.Region [^DefaultServiceEndpointBuilder this]
    (-> this (.getRegion))))

