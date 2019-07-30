(ns com.amazonaws.internal.SdkSSLContext
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.internal SdkSSLContext]))

(defn ->sdk-ssl-context
  "Constructor."
  (^SdkSSLContext []
    (new SdkSSLContext )))

(defn *get-preferred-ssl-context
  "secure-random - `java.security.SecureRandom`

  returns: `javax.net.ssl.SSLContext`"
  (^javax.net.ssl.SSLContext [^java.security.SecureRandom secure-random]
    (SdkSSLContext/getPreferredSSLContext secure-random)))

