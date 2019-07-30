(ns com.amazonaws.monitoring.StaticCsmConfigurationProvider
  "Provider that returns the given CsmConfiguration."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.monitoring StaticCsmConfigurationProvider]))

(defn ->static-csm-configuration-provider
  "Constructor.

  csm-config - `com.amazonaws.monitoring.CsmConfiguration`"
  (^StaticCsmConfigurationProvider [^com.amazonaws.monitoring.CsmConfiguration csm-config]
    (new StaticCsmConfigurationProvider csm-config)))

(defn get-configuration
  "returns: The resolved configuration. - `com.amazonaws.monitoring.CsmConfiguration`"
  (^com.amazonaws.monitoring.CsmConfiguration [^StaticCsmConfigurationProvider this]
    (-> this (.getConfiguration))))

