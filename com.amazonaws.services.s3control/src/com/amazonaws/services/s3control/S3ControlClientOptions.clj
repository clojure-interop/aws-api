(ns com.amazonaws.services.s3control.S3ControlClientOptions
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.s3control S3ControlClientOptions]))

(defn ->s-3-control-client-options
  "Constructor."
  (^S3ControlClientOptions []
    (new S3ControlClientOptions )))

(def *-dualstack-enabled
  "Static Constant.

  Advanced option to enable dualstack endpoints.

  type: com.amazonaws.client.builder.AdvancedConfig$Key<java.lang.Boolean>"
  S3ControlClientOptions/DUALSTACK_ENABLED)

(def *-fips-enabled
  "Static Constant.

  Advanced option to use fips endpoints.

  type: com.amazonaws.client.builder.AdvancedConfig$Key<java.lang.Boolean>"
  S3ControlClientOptions/FIPS_ENABLED)

