(ns com.amazonaws.internal.SdkSSLSocket
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.internal SdkSSLSocket]))

(defn ->sdk-ssl-socket
  "Constructor.

  sock - `javax.net.ssl.SSLSocket`"
  (^SdkSSLSocket [^javax.net.ssl.SSLSocket sock]
    (new SdkSSLSocket sock)))

(defn connect
  "endpoint - `java.net.SocketAddress`
  timeout - `int`

  throws: java.io.IOException"
  ([^SdkSSLSocket this ^java.net.SocketAddress endpoint ^Integer timeout]
    (-> this (.connect endpoint timeout)))
  ([^SdkSSLSocket this ^java.net.SocketAddress endpoint]
    (-> this (.connect endpoint))))

(defn close
  "throws: java.io.IOException"
  ([^SdkSSLSocket this]
    (-> this (.close))))

(defn shutdown-input
  "throws: java.io.IOException"
  ([^SdkSSLSocket this]
    (-> this (.shutdownInput))))

(defn shutdown-output
  "throws: java.io.IOException"
  ([^SdkSSLSocket this]
    (-> this (.shutdownOutput))))

