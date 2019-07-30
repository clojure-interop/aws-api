(ns com.amazonaws.internal.DelegateSSLSocket
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.internal DelegateSSLSocket]))

(defn ->delegate-ssl-socket
  "Constructor.

  sock - `javax.net.ssl.SSLSocket`"
  (^DelegateSSLSocket [^javax.net.ssl.SSLSocket sock]
    (new DelegateSSLSocket sock)))

(defn set-traffic-class
  "tc - `int`

  throws: java.net.SocketException"
  ([^DelegateSSLSocket this ^Integer tc]
    (-> this (.setTrafficClass tc))))

(defn get-need-client-auth?
  "returns: `boolean`"
  (^Boolean [^DelegateSSLSocket this]
    (-> this (.getNeedClientAuth))))

(defn set-performance-preferences
  "connection-time - `int`
  latency - `int`
  bandwidth - `int`"
  ([^DelegateSSLSocket this ^Integer connection-time ^Integer latency ^Integer bandwidth]
    (-> this (.setPerformancePreferences connection-time latency bandwidth))))

(defn get-supported-protocols
  "returns: `java.lang.String[]`"
  ([^DelegateSSLSocket this]
    (-> this (.getSupportedProtocols))))

(defn get-send-buffer-size
  "returns: `int`

  throws: java.net.SocketException"
  (^Integer [^DelegateSSLSocket this]
    (-> this (.getSendBufferSize))))

(defn get-local-port
  "returns: `int`"
  (^Integer [^DelegateSSLSocket this]
    (-> this (.getLocalPort))))

(defn set-so-timeout
  "timeout - `int`

  throws: java.net.SocketException"
  ([^DelegateSSLSocket this ^Integer timeout]
    (-> this (.setSoTimeout timeout))))

(defn send-urgent-data
  "data - `int`

  throws: java.io.IOException"
  ([^DelegateSSLSocket this ^Integer data]
    (-> this (.sendUrgentData data))))

(defn shutdown-output
  "throws: java.io.IOException"
  ([^DelegateSSLSocket this]
    (-> this (.shutdownOutput))))

(defn bind
  "bindpoint - `java.net.SocketAddress`

  throws: java.io.IOException"
  ([^DelegateSSLSocket this ^java.net.SocketAddress bindpoint]
    (-> this (.bind bindpoint))))

(defn set-use-client-mode
  "mode - `boolean`"
  ([^DelegateSSLSocket this ^Boolean mode]
    (-> this (.setUseClientMode mode))))

(defn set-reuse-address
  "on - `boolean`

  throws: java.net.SocketException"
  ([^DelegateSSLSocket this ^Boolean on]
    (-> this (.setReuseAddress on))))

(defn output-shutdown?
  "returns: `boolean`"
  (^Boolean [^DelegateSSLSocket this]
    (-> this (.isOutputShutdown))))

(defn remove-handshake-completed-listener
  "listener - `javax.net.ssl.HandshakeCompletedListener`"
  ([^DelegateSSLSocket this ^javax.net.ssl.HandshakeCompletedListener listener]
    (-> this (.removeHandshakeCompletedListener listener))))

(defn connected?
  "returns: `boolean`"
  (^Boolean [^DelegateSSLSocket this]
    (-> this (.isConnected))))

(defn get-tcp-no-delay?
  "returns: `boolean`

  throws: java.net.SocketException"
  (^Boolean [^DelegateSSLSocket this]
    (-> this (.getTcpNoDelay))))

(defn get-use-client-mode?
  "returns: `boolean`"
  (^Boolean [^DelegateSSLSocket this]
    (-> this (.getUseClientMode))))

(defn set-want-client-auth
  "want - `boolean`"
  ([^DelegateSSLSocket this ^Boolean want]
    (-> this (.setWantClientAuth want))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DelegateSSLSocket this]
    (-> this (.toString))))

(defn get-oob-inline?
  "returns: `boolean`

  throws: java.net.SocketException"
  (^Boolean [^DelegateSSLSocket this]
    (-> this (.getOOBInline))))

(defn get-so-timeout
  "returns: `int`

  throws: java.net.SocketException"
  (^Integer [^DelegateSSLSocket this]
    (-> this (.getSoTimeout))))

(defn get-session
  "returns: `javax.net.ssl.SSLSession`"
  (^javax.net.ssl.SSLSession [^DelegateSSLSocket this]
    (-> this (.getSession))))

(defn get-remote-socket-address
  "returns: `java.net.SocketAddress`"
  (^java.net.SocketAddress [^DelegateSSLSocket this]
    (-> this (.getRemoteSocketAddress))))

(defn input-shutdown?
  "returns: `boolean`"
  (^Boolean [^DelegateSSLSocket this]
    (-> this (.isInputShutdown))))

(defn connect
  "endpoint - `java.net.SocketAddress`
  timeout - `int`

  throws: java.io.IOException"
  ([^DelegateSSLSocket this ^java.net.SocketAddress endpoint ^Integer timeout]
    (-> this (.connect endpoint timeout)))
  ([^DelegateSSLSocket this ^java.net.SocketAddress endpoint]
    (-> this (.connect endpoint))))

(defn closed?
  "returns: `boolean`"
  (^Boolean [^DelegateSSLSocket this]
    (-> this (.isClosed))))

(defn set-so-linger
  "on - `boolean`
  linger - `int`

  throws: java.net.SocketException"
  ([^DelegateSSLSocket this ^Boolean on ^Integer linger]
    (-> this (.setSoLinger on linger))))

(defn get-enabled-cipher-suites
  "returns: `java.lang.String[]`"
  ([^DelegateSSLSocket this]
    (-> this (.getEnabledCipherSuites))))

(defn get-reuse-address?
  "returns: `boolean`

  throws: java.net.SocketException"
  (^Boolean [^DelegateSSLSocket this]
    (-> this (.getReuseAddress))))

(defn set-send-buffer-size
  "size - `int`

  throws: java.net.SocketException"
  ([^DelegateSSLSocket this ^Integer size]
    (-> this (.setSendBufferSize size))))

(defn get-local-socket-address
  "returns: `java.net.SocketAddress`"
  (^java.net.SocketAddress [^DelegateSSLSocket this]
    (-> this (.getLocalSocketAddress))))

(defn get-supported-cipher-suites
  "returns: `java.lang.String[]`"
  ([^DelegateSSLSocket this]
    (-> this (.getSupportedCipherSuites))))

(defn get-local-address
  "returns: `java.net.InetAddress`"
  (^java.net.InetAddress [^DelegateSSLSocket this]
    (-> this (.getLocalAddress))))

(defn get-keep-alive?
  "returns: `boolean`

  throws: java.net.SocketException"
  (^Boolean [^DelegateSSLSocket this]
    (-> this (.getKeepAlive))))

(defn close
  "throws: java.io.IOException"
  ([^DelegateSSLSocket this]
    (-> this (.close))))

(defn get-receive-buffer-size
  "returns: `int`

  throws: java.net.SocketException"
  (^Integer [^DelegateSSLSocket this]
    (-> this (.getReceiveBufferSize))))

(defn get-output-stream
  "returns: `java.io.OutputStream`

  throws: java.io.IOException"
  (^java.io.OutputStream [^DelegateSSLSocket this]
    (-> this (.getOutputStream))))

(defn start-handshake
  "throws: java.io.IOException"
  ([^DelegateSSLSocket this]
    (-> this (.startHandshake))))

(defn get-traffic-class
  "returns: `int`

  throws: java.net.SocketException"
  (^Integer [^DelegateSSLSocket this]
    (-> this (.getTrafficClass))))

(defn set-receive-buffer-size
  "size - `int`

  throws: java.net.SocketException"
  ([^DelegateSSLSocket this ^Integer size]
    (-> this (.setReceiveBufferSize size))))

(defn set-enabled-cipher-suites
  "suites - `java.lang.String[]`"
  ([^DelegateSSLSocket this suites]
    (-> this (.setEnabledCipherSuites suites))))

(defn get-port
  "returns: `int`"
  (^Integer [^DelegateSSLSocket this]
    (-> this (.getPort))))

(defn get-enable-session-creation?
  "returns: `boolean`"
  (^Boolean [^DelegateSSLSocket this]
    (-> this (.getEnableSessionCreation))))

(defn set-oob-inline
  "on - `boolean`

  throws: java.net.SocketException"
  ([^DelegateSSLSocket this ^Boolean on]
    (-> this (.setOOBInline on))))

(defn set-tcp-no-delay
  "on - `boolean`

  throws: java.net.SocketException"
  ([^DelegateSSLSocket this ^Boolean on]
    (-> this (.setTcpNoDelay on))))

(defn get-input-stream
  "returns: `java.io.InputStream`

  throws: java.io.IOException"
  (^java.io.InputStream [^DelegateSSLSocket this]
    (-> this (.getInputStream))))

(defn bound?
  "returns: `boolean`"
  (^Boolean [^DelegateSSLSocket this]
    (-> this (.isBound))))

(defn shutdown-input
  "throws: java.io.IOException"
  ([^DelegateSSLSocket this]
    (-> this (.shutdownInput))))

(defn add-handshake-completed-listener
  "listener - `javax.net.ssl.HandshakeCompletedListener`"
  ([^DelegateSSLSocket this ^javax.net.ssl.HandshakeCompletedListener listener]
    (-> this (.addHandshakeCompletedListener listener))))

(defn set-enable-session-creation
  "flag - `boolean`"
  ([^DelegateSSLSocket this ^Boolean flag]
    (-> this (.setEnableSessionCreation flag))))

(defn get-so-linger
  "returns: `int`

  throws: java.net.SocketException"
  (^Integer [^DelegateSSLSocket this]
    (-> this (.getSoLinger))))

(defn get-channel
  "returns: `java.nio.channels.SocketChannel`"
  (^java.nio.channels.SocketChannel [^DelegateSSLSocket this]
    (-> this (.getChannel))))

(defn set-enabled-protocols
  "protocols - `java.lang.String[]`"
  ([^DelegateSSLSocket this protocols]
    (-> this (.setEnabledProtocols protocols))))

(defn set-need-client-auth
  "need - `boolean`"
  ([^DelegateSSLSocket this ^Boolean need]
    (-> this (.setNeedClientAuth need))))

(defn get-enabled-protocols
  "returns: `java.lang.String[]`"
  ([^DelegateSSLSocket this]
    (-> this (.getEnabledProtocols))))

(defn get-want-client-auth?
  "returns: `boolean`"
  (^Boolean [^DelegateSSLSocket this]
    (-> this (.getWantClientAuth))))

(defn get-inet-address
  "returns: `java.net.InetAddress`"
  (^java.net.InetAddress [^DelegateSSLSocket this]
    (-> this (.getInetAddress))))

(defn set-keep-alive
  "on - `boolean`

  throws: java.net.SocketException"
  ([^DelegateSSLSocket this ^Boolean on]
    (-> this (.setKeepAlive on))))

