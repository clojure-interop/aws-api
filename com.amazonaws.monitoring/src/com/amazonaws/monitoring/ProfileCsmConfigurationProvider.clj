(ns com.amazonaws.monitoring.ProfileCsmConfigurationProvider
  "Configuration provider that sources the client side monitoring configuration
  parameters from the configured profile in the shared AWS config file.

  If no profile name is given, AwsProfileNameLoader will be used to
  find the profile to load the configuration from."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.monitoring ProfileCsmConfigurationProvider]))

(defn ->profile-csm-configuration-provider
  "Constructor.

  Create an instance that loads the configuration from the given profile
   name and config file location.

  profile-name - The name of the profile. - `java.lang.String`
  config-file-location-provider - The provider to use to locate the config file. - `com.amazonaws.profile.path.AwsProfileFileLocationProvider`"
  (^ProfileCsmConfigurationProvider [^java.lang.String profile-name ^com.amazonaws.profile.path.AwsProfileFileLocationProvider config-file-location-provider]
    (new ProfileCsmConfigurationProvider profile-name config-file-location-provider))
  (^ProfileCsmConfigurationProvider [^java.lang.String profile-name]
    (new ProfileCsmConfigurationProvider profile-name))
  (^ProfileCsmConfigurationProvider []
    (new ProfileCsmConfigurationProvider )))

(def *-csm-enabled-property
  "Static Constant.

  type: java.lang.String"
  ProfileCsmConfigurationProvider/CSM_ENABLED_PROPERTY)

(def *-csm-host-property
  "Static Constant.

  type: java.lang.String"
  ProfileCsmConfigurationProvider/CSM_HOST_PROPERTY)

(def *-csm-port-property
  "Static Constant.

  type: java.lang.String"
  ProfileCsmConfigurationProvider/CSM_PORT_PROPERTY)

(def *-csm-client-id-property
  "Static Constant.

  type: java.lang.String"
  ProfileCsmConfigurationProvider/CSM_CLIENT_ID_PROPERTY)

(defn get-configuration
  "returns: The resolved configuration. - `com.amazonaws.monitoring.CsmConfiguration`"
  (^com.amazonaws.monitoring.CsmConfiguration [^ProfileCsmConfigurationProvider this]
    (-> this (.getConfiguration))))

