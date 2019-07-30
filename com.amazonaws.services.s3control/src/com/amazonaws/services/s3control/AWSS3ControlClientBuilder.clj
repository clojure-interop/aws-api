(ns com.amazonaws.services.s3control.AWSS3ControlClientBuilder
  "Fluent builder for AWSS3Control. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.s3control AWSS3ControlClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.s3control.AWSS3ControlClientBuilder`"
  (^com.amazonaws.services.s3control.AWSS3ControlClientBuilder []
    (AWSS3ControlClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.s3control.AWSS3Control`"
  (^com.amazonaws.services.s3control.AWSS3Control []
    (AWSS3ControlClientBuilder/defaultClient )))

(defn dualstack-enabled?
  "returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^AWSS3ControlClientBuilder this]
    (-> this (.isDualstackEnabled))))

(defn enable-dualstack
  "Enables use of Dual-Stack endpoints (supports both IPv4 and IPv6) on clients built with this builder.

  returns: `com.amazonaws.services.s3control.AWSS3ControlClientBuilder`"
  (^com.amazonaws.services.s3control.AWSS3ControlClientBuilder [^AWSS3ControlClientBuilder this]
    (-> this (.enableDualstack))))

(defn set-dualstack-enabled
  "Sets the status of Dual-Stack endpoints (supports both IPv4 and IPv6) for clients built with this builder. The
   default is to not use Dual-Stack endpoints.

  dualstack-enabled - True if Dual-Stack endpoints should be used, false if Dual-Stack endpoints should not be used. - `java.lang.Boolean`"
  ([^AWSS3ControlClientBuilder this ^java.lang.Boolean dualstack-enabled]
    (-> this (.setDualstackEnabled dualstack-enabled))))

(defn with-dualstack-enabled
  "Sets the status of Dual-Stack endpoints (supports both IPv4 and IPv6) for clients built with this builder. The
   default is to not use Dual-Stack endpoints.

  dualstack-enabled - True if Dual-Stack endpoints should be used, false if Dual-Stack endpoints should not be used. - `java.lang.Boolean`

  returns: `com.amazonaws.services.s3control.AWSS3ControlClientBuilder`"
  (^com.amazonaws.services.s3control.AWSS3ControlClientBuilder [^AWSS3ControlClientBuilder this ^java.lang.Boolean dualstack-enabled]
    (-> this (.withDualstackEnabled dualstack-enabled))))

(defn fips-enabled?
  "returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^AWSS3ControlClientBuilder this]
    (-> this (.isFipsEnabled))))

(defn enable-fips
  "Enables use of FIPS endpoints on clients built with this builder.

  returns: `com.amazonaws.services.s3control.AWSS3ControlClientBuilder`"
  (^com.amazonaws.services.s3control.AWSS3ControlClientBuilder [^AWSS3ControlClientBuilder this]
    (-> this (.enableFips))))

(defn set-fips-enabled
  "Sets the status of FIPS enabled endpoints for clients built with this builder. The default is to not use FIPS
   endpoints.

  fips-enabled - True if FIPS endpoints should be used, false if FIPS endpoints should not be used. - `java.lang.Boolean`"
  ([^AWSS3ControlClientBuilder this ^java.lang.Boolean fips-enabled]
    (-> this (.setFipsEnabled fips-enabled))))

(defn with-fips-enabled
  "Sets the status of FIPS enabled endpoints for clients built with this builder. The default is to not use FIPS
   endpoints.

  fips-enabled - True if FIPS endpoints should be used, false if FIPS endpoints should not be used. - `java.lang.Boolean`

  returns: `com.amazonaws.services.s3control.AWSS3ControlClientBuilder`"
  (^com.amazonaws.services.s3control.AWSS3ControlClientBuilder [^AWSS3ControlClientBuilder this ^java.lang.Boolean fips-enabled]
    (-> this (.withFipsEnabled fips-enabled))))

