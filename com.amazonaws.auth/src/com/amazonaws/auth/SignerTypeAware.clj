(ns com.amazonaws.auth.SignerTypeAware
  "Used to mark implementations of AmazonWebServiceRequest that specify a custom signer type."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth SignerTypeAware]))

(defn get-signer-type
  "returns: `java.lang.String`"
  (^java.lang.String [^SignerTypeAware this]
    (-> this (.getSignerType))))

