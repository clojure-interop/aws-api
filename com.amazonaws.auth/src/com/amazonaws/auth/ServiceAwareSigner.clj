(ns com.amazonaws.auth.ServiceAwareSigner
  "A signer that needs to know which service it is talking to."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth ServiceAwareSigner]))

(defn set-service-name
  "Configure this signer with the name of the service it will be used
   to sign requests for.

  value - The name of the service. - `java.lang.String`"
  ([^ServiceAwareSigner this ^java.lang.String value]
    (-> this (.setServiceName value))))

