(ns com.amazonaws.monitoring.CsmConfigurationProviderChain
  "A CsmConfigurationProvider that delegates to a list of other CsmConfigurationProviders in order and returns the first result."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.monitoring CsmConfigurationProviderChain]))

(defn ->csm-configuration-provider-chain
  "Constructor.

  providers - `com.amazonaws.monitoring.CsmConfigurationProvider`"
  (^CsmConfigurationProviderChain [^com.amazonaws.monitoring.CsmConfigurationProvider providers]
    (new CsmConfigurationProviderChain providers)))

(defn get-configuration
  "returns: The resolved configuration. - `com.amazonaws.monitoring.CsmConfiguration`"
  (^com.amazonaws.monitoring.CsmConfiguration [^CsmConfigurationProviderChain this]
    (-> this (.getConfiguration))))

