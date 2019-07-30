(ns com.amazonaws.SystemDefaultDnsResolver
  "Default dns resolver that uses InetAddress.getAllByName(String)
  to resolve hosts to ip addresses"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws SystemDefaultDnsResolver]))

(defn ->system-default-dns-resolver
  "Constructor."
  (^SystemDefaultDnsResolver []
    (new SystemDefaultDnsResolver )))

(defn resolve
  "host - `java.lang.String`

  returns: `java.net.InetAddress[]`

  throws: java.net.UnknownHostException"
  ([^SystemDefaultDnsResolver this ^java.lang.String host]
    (-> this (.resolve host))))

