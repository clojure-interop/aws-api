(ns com.amazonaws.monitoring.SystemPropertyCsmConfigurationProvider
  "Configuration provider that sources the client side monitoring
  configuration parameters from system properties."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.monitoring SystemPropertyCsmConfigurationProvider]))

(defn ->system-property-csm-configuration-provider
  "Constructor."
  (^SystemPropertyCsmConfigurationProvider []
    (new SystemPropertyCsmConfigurationProvider )))

(defn get-configuration
  "returns: The resolved configuration. - `com.amazonaws.monitoring.CsmConfiguration`

  throws: com.amazonaws.SdkClientException - If the configuration could not be found."
  (^com.amazonaws.monitoring.CsmConfiguration [^SystemPropertyCsmConfigurationProvider this]
    (-> this (.getConfiguration))))

