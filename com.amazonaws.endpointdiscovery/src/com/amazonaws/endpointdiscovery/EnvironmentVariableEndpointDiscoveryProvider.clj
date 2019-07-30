(ns com.amazonaws.endpointdiscovery.EnvironmentVariableEndpointDiscoveryProvider
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.endpointdiscovery EnvironmentVariableEndpointDiscoveryProvider]))

(defn ->environment-variable-endpoint-discovery-provider
  "Constructor."
  (^EnvironmentVariableEndpointDiscoveryProvider []
    (new EnvironmentVariableEndpointDiscoveryProvider )))

(defn endpoint-discovery-enabled
  "returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^EnvironmentVariableEndpointDiscoveryProvider this]
    (-> this (.endpointDiscoveryEnabled))))

