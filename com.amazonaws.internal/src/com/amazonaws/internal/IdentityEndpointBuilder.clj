(ns com.amazonaws.internal.IdentityEndpointBuilder
  "More of a No-Op endpoint builder that just returns the same endpoint it was constructed with"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.internal IdentityEndpointBuilder]))

(defn ->identity-endpoint-builder
  "Constructor.

  endpoint - `java.net.URI`"
  (^IdentityEndpointBuilder [^java.net.URI endpoint]
    (new IdentityEndpointBuilder endpoint)))

(defn get-service-endpoint
  "Description copied from class: ServiceEndpointBuilder

  returns: URI of endpoint - `java.net.URI`"
  (^java.net.URI [^IdentityEndpointBuilder this]
    (-> this (.getServiceEndpoint))))

(defn with-region
  "Description copied from class: ServiceEndpointBuilder

  region - New region to use in endpoint determination - `com.amazonaws.regions.Region`

  returns: A reference to this updated object so that method calls can be chained together. - `com.amazonaws.internal.DefaultServiceEndpointBuilder`"
  (^com.amazonaws.internal.DefaultServiceEndpointBuilder [^IdentityEndpointBuilder this ^com.amazonaws.regions.Region region]
    (-> this (.withRegion region))))

(defn get-region
  "returns: `com.amazonaws.regions.Region`"
  (^com.amazonaws.regions.Region [^IdentityEndpointBuilder this]
    (-> this (.getRegion))))

