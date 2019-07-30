(ns com.amazonaws.monitoring.DefaultCsmConfigurationProviderChain
  "The default chain of CsmConfigurationProviders.

  This chain attempts to load the client side monitoring configuration by
  delegating to the following providers in order, and returning the first
  result:

      EnvironmentVariableCsmConfigurationProvider
      SystemPropertyCsmConfigurationProvider
      ProfileCsmConfigurationProvider, using AwsProfileFileLocationProvider.DEFAULT_CONFIG_LOCATION_PROVIDER to
      locate the configuration file"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.monitoring DefaultCsmConfigurationProviderChain]))

(defn *get-instance
  "returns: `com.amazonaws.monitoring.DefaultCsmConfigurationProviderChain`"
  (^com.amazonaws.monitoring.DefaultCsmConfigurationProviderChain []
    (DefaultCsmConfigurationProviderChain/getInstance )))

