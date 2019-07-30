(ns com.amazonaws.monitoring.CsmConfiguration$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.monitoring CsmConfiguration$Builder]))

(defn with-enabled
  "enabled - `java.lang.Boolean`

  returns: `com.amazonaws.monitoring.CsmConfiguration$Builder`"
  (^com.amazonaws.monitoring.CsmConfiguration$Builder [^CsmConfiguration$Builder this ^java.lang.Boolean enabled]
    (-> this (.withEnabled enabled))))

(defn with-client-id
  "client-id - `java.lang.String`

  returns: `com.amazonaws.monitoring.CsmConfiguration$Builder`"
  (^com.amazonaws.monitoring.CsmConfiguration$Builder [^CsmConfiguration$Builder this ^java.lang.String client-id]
    (-> this (.withClientId client-id))))

(defn with-host
  "host - `java.lang.String`

  returns: `com.amazonaws.monitoring.CsmConfiguration$Builder`"
  (^com.amazonaws.monitoring.CsmConfiguration$Builder [^CsmConfiguration$Builder this ^java.lang.String host]
    (-> this (.withHost host))))

(defn with-port
  "port - `java.lang.Integer`

  returns: `com.amazonaws.monitoring.CsmConfiguration$Builder`"
  (^com.amazonaws.monitoring.CsmConfiguration$Builder [^CsmConfiguration$Builder this ^java.lang.Integer port]
    (-> this (.withPort port))))

(defn build
  "returns: `com.amazonaws.monitoring.CsmConfiguration`"
  (^com.amazonaws.monitoring.CsmConfiguration [^CsmConfiguration$Builder this]
    (-> this (.build))))

