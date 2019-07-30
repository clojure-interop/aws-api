(ns com.amazonaws.internal.ServiceEndpointBuilder
  "Construct a service endpoint based on metadata like service name and region"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.internal ServiceEndpointBuilder]))

(defn ->service-endpoint-builder
  "Constructor."
  (^ServiceEndpointBuilder []
    (new ServiceEndpointBuilder )))

(defn get-service-endpoint
  "Get the URI of the service endpoint

  returns: URI of endpoint - `java.net.URI`"
  (^java.net.URI [^ServiceEndpointBuilder this]
    (-> this (.getServiceEndpoint))))

(defn get-region
  "returns: `com.amazonaws.regions.Region`"
  (^com.amazonaws.regions.Region [^ServiceEndpointBuilder this]
    (-> this (.getRegion))))

(defn with-region
  "Changes the region of the endpoint builder

  region - New region to use in endpoint determination - `com.amazonaws.regions.Region`

  returns: A reference to this updated object so that method calls can be chained together. - `com.amazonaws.internal.ServiceEndpointBuilder`"
  (^com.amazonaws.internal.ServiceEndpointBuilder [^ServiceEndpointBuilder this ^com.amazonaws.regions.Region region]
    (-> this (.withRegion region))))

