(ns com.amazonaws.monitoring.EnvironmentVariableCsmConfigurationProvider
  "Configuration provider that sources the client side monitoring
  configuration parameters from environment variables."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.monitoring EnvironmentVariableCsmConfigurationProvider]))

(defn ->environment-variable-csm-configuration-provider
  "Constructor."
  (^EnvironmentVariableCsmConfigurationProvider []
    (new EnvironmentVariableCsmConfigurationProvider )))

(defn get-configuration
  "returns: The resolved configuration. - `com.amazonaws.monitoring.CsmConfiguration`"
  (^com.amazonaws.monitoring.CsmConfiguration [^EnvironmentVariableCsmConfigurationProvider this]
    (-> this (.getConfiguration))))

