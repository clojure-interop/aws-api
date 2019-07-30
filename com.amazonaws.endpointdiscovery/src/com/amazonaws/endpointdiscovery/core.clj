(ns com.amazonaws.endpointdiscovery.core
  (:refer-clojure :only [require comment defn ->])
  (:import ))

(require '[com.amazonaws.endpointdiscovery.AwsProfileEndpointDiscoveryProvider])
(require '[com.amazonaws.endpointdiscovery.Constants])
(require '[com.amazonaws.endpointdiscovery.DaemonThreadFactory])
(require '[com.amazonaws.endpointdiscovery.DefaultEndpointDiscoveryProviderChain])
(require '[com.amazonaws.endpointdiscovery.EndpointDiscoveryProvider])
(require '[com.amazonaws.endpointdiscovery.EndpointDiscoveryProviderChain])
(require '[com.amazonaws.endpointdiscovery.EndpointDiscoveryRefreshCache])
(require '[com.amazonaws.endpointdiscovery.EnvironmentVariableEndpointDiscoveryProvider])
(require '[com.amazonaws.endpointdiscovery.SystemPropertyEndpointDiscoveryProvider])
