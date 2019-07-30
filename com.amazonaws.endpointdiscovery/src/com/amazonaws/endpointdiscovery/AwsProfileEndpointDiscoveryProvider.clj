(ns com.amazonaws.endpointdiscovery.AwsProfileEndpointDiscoveryProvider
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.endpointdiscovery AwsProfileEndpointDiscoveryProvider]))

(defn ->aws-profile-endpoint-discovery-provider
  "Constructor.

  profile-name - `java.lang.String`"
  (^AwsProfileEndpointDiscoveryProvider [^java.lang.String profile-name]
    (new AwsProfileEndpointDiscoveryProvider profile-name))
  (^AwsProfileEndpointDiscoveryProvider []
    (new AwsProfileEndpointDiscoveryProvider )))

(defn endpoint-discovery-enabled
  "returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^AwsProfileEndpointDiscoveryProvider this]
    (-> this (.endpointDiscoveryEnabled))))

