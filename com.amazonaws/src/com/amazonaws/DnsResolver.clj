(ns com.amazonaws.DnsResolver
  "Given a hostname, will resolve the hostname to an ip, or list of ip addresses."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws DnsResolver]))

(defn resolve
  "host - `java.lang.String`

  returns: `java.net.InetAddress[]`

  throws: java.net.UnknownHostException"
  ([^DnsResolver this ^java.lang.String host]
    (-> this (.resolve host))))

