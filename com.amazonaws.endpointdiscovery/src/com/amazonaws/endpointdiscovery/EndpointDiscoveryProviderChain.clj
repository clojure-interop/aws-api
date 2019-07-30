(ns com.amazonaws.endpointdiscovery.EndpointDiscoveryProviderChain
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.endpointdiscovery EndpointDiscoveryProviderChain]))

(defn ->endpoint-discovery-provider-chain
  "Constructor.

  providers - `com.amazonaws.endpointdiscovery.EndpointDiscoveryProvider`"
  (^EndpointDiscoveryProviderChain [^com.amazonaws.endpointdiscovery.EndpointDiscoveryProvider providers]
    (new EndpointDiscoveryProviderChain providers)))

(defn endpoint-discovery-enabled
  "returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^EndpointDiscoveryProviderChain this]
    (-> this (.endpointDiscoveryEnabled))))

