(ns com.amazonaws.endpointdiscovery.Constants
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.endpointdiscovery Constants]))

(defn ->constants
  "Constructor."
  (^Constants []
    (new Constants )))

(def *-cache-period
  "Static Constant.

  type: java.lang.String"
  Constants/CACHE_PERIOD)

(def *-endpoint
  "Static Constant.

  type: java.lang.String"
  Constants/ENDPOINT)

(def *-endpoint-discovery-environment-variable
  "Static Constant.

  type: java.lang.String"
  Constants/ENDPOINT_DISCOVERY_ENVIRONMENT_VARIABLE)

(def *-endpoint-discovery-system-property
  "Static Constant.

  type: java.lang.String"
  Constants/ENDPOINT_DISCOVERY_SYSTEM_PROPERTY)

