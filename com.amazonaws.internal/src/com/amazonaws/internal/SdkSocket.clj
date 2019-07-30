(ns com.amazonaws.internal.SdkSocket
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.internal SdkSocket]))

(defn ->sdk-socket
  "Constructor.

  sock - `java.net.Socket`"
  (^SdkSocket [^java.net.Socket sock]
    (new SdkSocket sock)))

(defn connect
  "endpoint - `java.net.SocketAddress`
  timeout - `int`

  throws: java.io.IOException"
  ([^SdkSocket this ^java.net.SocketAddress endpoint ^Integer timeout]
    (-> this (.connect endpoint timeout)))
  ([^SdkSocket this ^java.net.SocketAddress endpoint]
    (-> this (.connect endpoint))))

(defn close
  "throws: java.io.IOException"
  ([^SdkSocket this]
    (-> this (.close))))

(defn shutdown-input
  "throws: java.io.IOException"
  ([^SdkSocket this]
    (-> this (.shutdownInput))))

(defn shutdown-output
  "throws: java.io.IOException"
  ([^SdkSocket this]
    (-> this (.shutdownOutput))))

