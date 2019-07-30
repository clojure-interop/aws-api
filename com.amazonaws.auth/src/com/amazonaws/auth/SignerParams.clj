(ns com.amazonaws.auth.SignerParams
  "Shared parameter structure to contain information required for signing by
  various signer implementations."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth SignerParams]))

(defn ->signer-params
  "Constructor.

  service-name - `java.lang.String`
  region-name - `java.lang.String`"
  (^SignerParams [^java.lang.String service-name ^java.lang.String region-name]
    (new SignerParams service-name region-name)))

(defn get-service-name
  "returns: `java.lang.String`"
  (^java.lang.String [^SignerParams this]
    (-> this (.getServiceName))))

(defn get-region-name
  "returns: `java.lang.String`"
  (^java.lang.String [^SignerParams this]
    (-> this (.getRegionName))))

