(ns com.amazonaws.endpointdiscovery.EndpointDiscoveryProvider
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.endpointdiscovery EndpointDiscoveryProvider]))

(defn endpoint-discovery-enabled
  "returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^EndpointDiscoveryProvider this]
    (-> this (.endpointDiscoveryEnabled))))

