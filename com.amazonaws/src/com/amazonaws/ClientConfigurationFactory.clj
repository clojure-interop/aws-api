(ns com.amazonaws.ClientConfigurationFactory
  "Factory producing predefined ClientConfiguration instances.
  Individual service clients may extend this factory to override
  these with service specific configuration values."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws ClientConfigurationFactory]))

(defn ->client-configuration-factory
  "Constructor."
  (^ClientConfigurationFactory []
    (new ClientConfigurationFactory )))

(defn get-config
  "Builds a ClientConfiguration instance with the default configuration
   for the current client.  If the SDKGlobalConfiguration.ENABLE_IN_REGION_OPTIMIZED_MODE
   system property has been set, in-region optimized configuration will be used.

  returns: constructed ClientConfiguration instance - `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration [^ClientConfigurationFactory this]
    (-> this (.getConfig))))

