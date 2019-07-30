(ns com.amazonaws.monitoring.CsmConfigurationProvider
  "Provides Client Side Monitoring configuration options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.monitoring CsmConfigurationProvider]))

(defn get-configuration
  "returns: The resolved configuration. - `com.amazonaws.monitoring.CsmConfiguration`

  throws: com.amazonaws.SdkClientException - If the configuration could not be found."
  (^com.amazonaws.monitoring.CsmConfiguration [^CsmConfigurationProvider this]
    (-> this (.getConfiguration))))

