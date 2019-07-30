(ns com.amazonaws.http.DelegatingDnsResolver
  "Implements the DnsResolver interface,
  taking in a DnsResolver implementation and executing its
  DnsResolver.resolve(String) method to perform the
  actual DNS resolution."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.http DelegatingDnsResolver]))

(defn ->delegating-dns-resolver
  "Constructor.

  delegate - `com.amazonaws.DnsResolver`"
  (^DelegatingDnsResolver [^com.amazonaws.DnsResolver delegate]
    (new DelegatingDnsResolver delegate)))

(defn resolve
  "host - `java.lang.String`

  returns: `java.net.InetAddress[]`

  throws: java.net.UnknownHostException"
  ([^DelegatingDnsResolver this ^java.lang.String host]
    (-> this (.resolve host))))

