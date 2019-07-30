(ns com.amazonaws.endpointdiscovery.SystemPropertyEndpointDiscoveryProvider
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.endpointdiscovery SystemPropertyEndpointDiscoveryProvider]))

(defn ->system-property-endpoint-discovery-provider
  "Constructor."
  (^SystemPropertyEndpointDiscoveryProvider []
    (new SystemPropertyEndpointDiscoveryProvider )))

(defn endpoint-discovery-enabled
  "returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^SystemPropertyEndpointDiscoveryProvider this]
    (-> this (.endpointDiscoveryEnabled))))

