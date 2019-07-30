(ns com.amazonaws.monitoring.CsmConfiguration
  "Configuration for Client Side Monitoring."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.monitoring CsmConfiguration]))

(defn ->csm-configuration
  "Constructor.

  enabled - `boolean`
  port - `int`
  client-id - `java.lang.String`"
  (^CsmConfiguration [^Boolean enabled ^Integer port ^java.lang.String client-id]
    (new CsmConfiguration enabled port client-id)))

(defn *builder
  "returns: `com.amazonaws.monitoring.CsmConfiguration$Builder`"
  (^com.amazonaws.monitoring.CsmConfiguration$Builder []
    (CsmConfiguration/builder )))

(defn enabled?
  "true if client side monitoring is enabled, false
   otherwise.

  returns: `boolean`"
  (^Boolean [^CsmConfiguration this]
    (-> this (.isEnabled))))

(defn get-host
  "The host to send monitoring events to.

  returns: `java.lang.String`"
  (^java.lang.String [^CsmConfiguration this]
    (-> this (.getHost))))

(defn get-port
  "The port on the specified host to send monitoring events to.

  returns: `int`"
  (^Integer [^CsmConfiguration this]
    (-> this (.getPort))))

(defn get-client-id
  "The client ID to set on the monitoring events.

  returns: `java.lang.String`"
  (^java.lang.String [^CsmConfiguration this]
    (-> this (.getClientId))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^CsmConfiguration this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^CsmConfiguration this]
    (-> this (.hashCode))))

