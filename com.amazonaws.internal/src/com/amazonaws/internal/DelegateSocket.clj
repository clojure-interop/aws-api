(ns com.amazonaws.internal.DelegateSocket
  "Socket delegate class. Subclasses could extend this class, so that
  they only need to override methods they are interested in enhancing."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.internal DelegateSocket]))

(defn ->delegate-socket
  "Constructor.

  sock - `java.net.Socket`"
  (^DelegateSocket [^java.net.Socket sock]
    (new DelegateSocket sock)))

(defn set-traffic-class
  "tc - `int`

  throws: java.net.SocketException"
  ([^DelegateSocket this ^Integer tc]
    (-> this (.setTrafficClass tc))))

(defn set-performance-preferences
  "connection-time - `int`
  latency - `int`
  bandwidth - `int`"
  ([^DelegateSocket this ^Integer connection-time ^Integer latency ^Integer bandwidth]
    (-> this (.setPerformancePreferences connection-time latency bandwidth))))

(defn get-send-buffer-size
  "returns: `int`

  throws: java.net.SocketException"
  (^Integer [^DelegateSocket this]
    (-> this (.getSendBufferSize))))

(defn get-local-port
  "returns: `int`"
  (^Integer [^DelegateSocket this]
    (-> this (.getLocalPort))))

(defn set-so-timeout
  "timeout - `int`

  throws: java.net.SocketException"
  ([^DelegateSocket this ^Integer timeout]
    (-> this (.setSoTimeout timeout))))

(defn send-urgent-data
  "data - `int`

  throws: java.io.IOException"
  ([^DelegateSocket this ^Integer data]
    (-> this (.sendUrgentData data))))

(defn shutdown-output
  "throws: java.io.IOException"
  ([^DelegateSocket this]
    (-> this (.shutdownOutput))))

(defn bind
  "bindpoint - `java.net.SocketAddress`

  throws: java.io.IOException"
  ([^DelegateSocket this ^java.net.SocketAddress bindpoint]
    (-> this (.bind bindpoint))))

(defn set-reuse-address
  "on - `boolean`

  throws: java.net.SocketException"
  ([^DelegateSocket this ^Boolean on]
    (-> this (.setReuseAddress on))))

(defn output-shutdown?
  "returns: `boolean`"
  (^Boolean [^DelegateSocket this]
    (-> this (.isOutputShutdown))))

(defn connected?
  "returns: `boolean`"
  (^Boolean [^DelegateSocket this]
    (-> this (.isConnected))))

(defn get-tcp-no-delay?
  "returns: `boolean`

  throws: java.net.SocketException"
  (^Boolean [^DelegateSocket this]
    (-> this (.getTcpNoDelay))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DelegateSocket this]
    (-> this (.toString))))

(defn get-oob-inline?
  "returns: `boolean`

  throws: java.net.SocketException"
  (^Boolean [^DelegateSocket this]
    (-> this (.getOOBInline))))

(defn get-so-timeout
  "returns: `int`

  throws: java.net.SocketException"
  (^Integer [^DelegateSocket this]
    (-> this (.getSoTimeout))))

(defn get-remote-socket-address
  "returns: `java.net.SocketAddress`"
  (^java.net.SocketAddress [^DelegateSocket this]
    (-> this (.getRemoteSocketAddress))))

(defn input-shutdown?
  "returns: `boolean`"
  (^Boolean [^DelegateSocket this]
    (-> this (.isInputShutdown))))

(defn connect
  "endpoint - `java.net.SocketAddress`
  timeout - `int`

  throws: java.io.IOException"
  ([^DelegateSocket this ^java.net.SocketAddress endpoint ^Integer timeout]
    (-> this (.connect endpoint timeout)))
  ([^DelegateSocket this ^java.net.SocketAddress endpoint]
    (-> this (.connect endpoint))))

(defn closed?
  "returns: `boolean`"
  (^Boolean [^DelegateSocket this]
    (-> this (.isClosed))))

(defn set-so-linger
  "on - `boolean`
  linger - `int`

  throws: java.net.SocketException"
  ([^DelegateSocket this ^Boolean on ^Integer linger]
    (-> this (.setSoLinger on linger))))

(defn get-reuse-address?
  "returns: `boolean`

  throws: java.net.SocketException"
  (^Boolean [^DelegateSocket this]
    (-> this (.getReuseAddress))))

(defn set-send-buffer-size
  "size - `int`

  throws: java.net.SocketException"
  ([^DelegateSocket this ^Integer size]
    (-> this (.setSendBufferSize size))))

(defn get-local-socket-address
  "returns: `java.net.SocketAddress`"
  (^java.net.SocketAddress [^DelegateSocket this]
    (-> this (.getLocalSocketAddress))))

(defn get-local-address
  "returns: `java.net.InetAddress`"
  (^java.net.InetAddress [^DelegateSocket this]
    (-> this (.getLocalAddress))))

(defn get-keep-alive?
  "returns: `boolean`

  throws: java.net.SocketException"
  (^Boolean [^DelegateSocket this]
    (-> this (.getKeepAlive))))

(defn close
  "throws: java.io.IOException"
  ([^DelegateSocket this]
    (-> this (.close))))

(defn get-receive-buffer-size
  "returns: `int`

  throws: java.net.SocketException"
  (^Integer [^DelegateSocket this]
    (-> this (.getReceiveBufferSize))))

(defn get-output-stream
  "returns: `java.io.OutputStream`

  throws: java.io.IOException"
  (^java.io.OutputStream [^DelegateSocket this]
    (-> this (.getOutputStream))))

(defn get-traffic-class
  "returns: `int`

  throws: java.net.SocketException"
  (^Integer [^DelegateSocket this]
    (-> this (.getTrafficClass))))

(defn set-receive-buffer-size
  "size - `int`

  throws: java.net.SocketException"
  ([^DelegateSocket this ^Integer size]
    (-> this (.setReceiveBufferSize size))))

(defn get-port
  "returns: `int`"
  (^Integer [^DelegateSocket this]
    (-> this (.getPort))))

(defn set-oob-inline
  "on - `boolean`

  throws: java.net.SocketException"
  ([^DelegateSocket this ^Boolean on]
    (-> this (.setOOBInline on))))

(defn set-tcp-no-delay
  "on - `boolean`

  throws: java.net.SocketException"
  ([^DelegateSocket this ^Boolean on]
    (-> this (.setTcpNoDelay on))))

(defn get-input-stream
  "returns: `java.io.InputStream`

  throws: java.io.IOException"
  (^java.io.InputStream [^DelegateSocket this]
    (-> this (.getInputStream))))

(defn bound?
  "returns: `boolean`"
  (^Boolean [^DelegateSocket this]
    (-> this (.isBound))))

(defn shutdown-input
  "throws: java.io.IOException"
  ([^DelegateSocket this]
    (-> this (.shutdownInput))))

(defn get-so-linger
  "returns: `int`

  throws: java.net.SocketException"
  (^Integer [^DelegateSocket this]
    (-> this (.getSoLinger))))

(defn get-channel
  "returns: `java.nio.channels.SocketChannel`"
  (^java.nio.channels.SocketChannel [^DelegateSocket this]
    (-> this (.getChannel))))

(defn get-inet-address
  "returns: `java.net.InetAddress`"
  (^java.net.InetAddress [^DelegateSocket this]
    (-> this (.getInetAddress))))

(defn set-keep-alive
  "on - `boolean`

  throws: java.net.SocketException"
  ([^DelegateSocket this ^Boolean on]
    (-> this (.setKeepAlive on))))

