(ns com.amazonaws.ClientConfiguration
  "Client configuration options such as proxy settings, user agent string, max retry attempts, etc."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws ClientConfiguration]))

(defn ->client-configuration
  "Constructor.

  other - `com.amazonaws.ClientConfiguration`"
  (^ClientConfiguration [^com.amazonaws.ClientConfiguration other]
    (new ClientConfiguration other))
  (^ClientConfiguration []
    (new ClientConfiguration )))

(def *-default-connection-timeout
  "Static Constant.

  The default timeout for creating new connections.

  type: int"
  ClientConfiguration/DEFAULT_CONNECTION_TIMEOUT)

(def *-default-socket-timeout
  "Static Constant.

  The default timeout for reading from a connected socket.

  type: int"
  ClientConfiguration/DEFAULT_SOCKET_TIMEOUT)

(def *-default-request-timeout
  "Static Constant.

  The default timeout for a request. This is disabled by default.

  type: int"
  ClientConfiguration/DEFAULT_REQUEST_TIMEOUT)

(def *-default-client-execution-timeout
  "Static Constant.

  The default timeout for a request. This is disabled by default.

  type: int"
  ClientConfiguration/DEFAULT_CLIENT_EXECUTION_TIMEOUT)

(def *-default-disable-socket-proxy
  "Static Constant.

  The default on whether to disable Socket proxies.

  type: boolean"
  ClientConfiguration/DEFAULT_DISABLE_SOCKET_PROXY)

(def *-default-max-connections
  "Static Constant.

  The default max connection pool size.

  type: int"
  ClientConfiguration/DEFAULT_MAX_CONNECTIONS)

(def *-default-use-expect-continue
  "Static Constant.

  The default on whether to utilize the USE_EXPECT_CONTINUE handshake for operations. Currently
   only honored for PUT operations.

  type: boolean"
  ClientConfiguration/DEFAULT_USE_EXPECT_CONTINUE)

(def *-default-user-agent
  "Static Constant.

  The default HTTP user agent header for AWS Java SDK clients.

  type: java.lang.String"
  ClientConfiguration/DEFAULT_USER_AGENT)

(def *-default-retry-policy
  "Static Constant.

  Default request retry policy, including the maximum retry count of 3, the default retry
   condition and the default back-off strategy.

  type: com.amazonaws.retry.RetryPolicy"
  ClientConfiguration/DEFAULT_RETRY_POLICY)

(def *-default-use-reaper
  "Static Constant.

  The default on whether to use the IdleConnectionReaper to manage stale connections

  type: boolean"
  ClientConfiguration/DEFAULT_USE_REAPER)

(def *-default-use-gzip
  "Static Constant.

  The default on whether to use gzip compression.

  type: boolean"
  ClientConfiguration/DEFAULT_USE_GZIP)

(def *-default-connection-ttl
  "Static Constant.

  The default expiration time (in milliseconds) for a connection in the connection pool.

  type: long"
  ClientConfiguration/DEFAULT_CONNECTION_TTL)

(def *-default-connection-max-idle-millis
  "Static Constant.

  The default maximum idle time (in milliseconds) for a connection in the connection pool.

  type: long"
  ClientConfiguration/DEFAULT_CONNECTION_MAX_IDLE_MILLIS)

(def *-default-validate-after-inactivity-millis
  "Static Constant.

  The default time a connection can be idle in the connection pool before it must be validated that it's still open.

  type: int"
  ClientConfiguration/DEFAULT_VALIDATE_AFTER_INACTIVITY_MILLIS)

(def *-default-tcp-keep-alive
  "Static Constant.

  The default on whether to use TCP KeepAlive.

  type: boolean"
  ClientConfiguration/DEFAULT_TCP_KEEP_ALIVE)

(def *-default-throttle-retries
  "Static Constant.

  The default on whether to throttle retries.

  type: boolean"
  ClientConfiguration/DEFAULT_THROTTLE_RETRIES)

(def *-default-cache-response-metadata
  "Static Constant.

  The default on whether to cache response metadata.

  type: boolean"
  ClientConfiguration/DEFAULT_CACHE_RESPONSE_METADATA)

(def *-default-response-metadata-cache-size
  "Static Constant.

  The default response metadata cache size.

  type: int"
  ClientConfiguration/DEFAULT_RESPONSE_METADATA_CACHE_SIZE)

(def *-default-max-consecutive-retries-before-throttling
  "Static Constant.

  type: int"
  ClientConfiguration/DEFAULT_MAX_CONSECUTIVE_RETRIES_BEFORE_THROTTLING)

(defn get-socket-timeout
  "Returns the amount of time to wait (in milliseconds) for data to be transfered over an
   established, open connection before the connection times out and is closed. A value of 0
   means infinity, and isn't recommended.

  returns: The amount of time to wait (in milliseconds) for data to be transfered over an
           established, open connection before the connection times out and is closed. - `int`"
  (^Integer [^ClientConfiguration this]
    (-> this (.getSocketTimeout))))

(defn with-disable-socket-proxy
  "Set whether to disable proxies at the socket level.

  disable-socket-proxy - Whether to disable proxies at the socket level. - `boolean`

  returns: The updated ClientConfiguration object. - `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration [^ClientConfiguration this ^Boolean disable-socket-proxy]
    (-> this (.withDisableSocketProxy disable-socket-proxy))))

(defn use-throttled-retries
  "Returns whether retry throttling will be used.

   Retry throttling is a feature which intelligently throttles retry attempts when a
   large percentage of requests are failing and retries are unsuccessful, particularly
   in scenarios of degraded service health.  In these situations the client will drain its
   internal retry capacity and slowly roll off from retry attempts until requests begin
   to succeed again.  At that point the retry capacity pool will begin to refill and
   retries will once again be permitted.


   In situations where retries have been throttled this feature will effectively result in
   fail-fast behavior from the client.  Because retries are circumvented exceptions will
   be immediately returned to the caller if the initial request is unsuccessful.  This
   will result in a greater number of exceptions being returned up front but prevents
   requests being tied up attempting subsequent retries which are also likely to fail.

  returns: true if retry throttling will be used - `boolean`"
  (^Boolean [^ClientConfiguration this]
    (-> this (.useThrottledRetries))))

(defn with-non-proxy-hosts
  "Set the optional hosts the client will access without going
   through the proxy.

  non-proxy-hosts - The hosts the client will access without going through the proxy. - `java.lang.String`

  returns: The updated ClientConfiguration object. - `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration [^ClientConfiguration this ^java.lang.String non-proxy-hosts]
    (-> this (.withNonProxyHosts non-proxy-hosts))))

(defn with-disable-host-prefix-injection
  "Sets the configuration option to disable the host prefix injection.

   The hostPrefix template is specified in the service model and is used by the SDK to modify the endpoint
   the request is sent to. Host prefix injection is enabled by default. This option can be set to disable the behavior.

  disable-host-prefix-injection - `boolean`

  returns: `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration [^ClientConfiguration this ^Boolean disable-host-prefix-injection]
    (-> this (.withDisableHostPrefixInjection disable-host-prefix-injection))))

(defn get-user-agent-prefix
  "Returns the HTTP user agent header prefix to send with all requests.

  returns: The user agent string prefix to use when sending requests. - `java.lang.String`"
  (^java.lang.String [^ClientConfiguration this]
    (-> this (.getUserAgentPrefix))))

(defn get-dns-resolver
  "Returns the DnsResolver for resolving AWS IP addresses.
   Returns the SystemDefaultDnsResolver by default if not
   explicitly configured by the user.

  returns: `com.amazonaws.DnsResolver`"
  (^com.amazonaws.DnsResolver [^ClientConfiguration this]
    (-> this (.getDnsResolver))))

(defn set-signer-override
  "Sets the name of the signature algorithm to use for signing requests made by this client. If
   not set or explicitly set to null, the client will choose a signature algorithm to use based
   on a configuration file of supported signature algorithms for the service and region.

   Most users do not need to concern themselves with which signature algorithm is being used, as
   the defaults will be sufficient. This setting exists only so advanced users can opt in to
   newer signature protocols which have not yet been made the default for a particular
   service/region.

   Not all services support all signature algorithms, and configuring an unsupported signature
   algorithm will lead to authentication failures. Use me at your own risk, and only after
   consulting the documentation for the service to ensure it actually does supports your chosen
   algorithm.

   If non-null, the name returned from this method is used to look up a Signer class
   implementing the chosen algorithm by the com.amazonaws.auth.SignerFactory class.

  value - The signature algorithm to use for this client, or null to use the default. - `java.lang.String`"
  ([^ClientConfiguration this ^java.lang.String value]
    (-> this (.setSignerOverride value))))

(defn get-request-timeout
  "Returns the amount of time to wait (in milliseconds) for the request to complete before
   giving up and timing out. A non-positive value disables this feature.

   This feature requires buffering the entire response (for non-streaming APIs) into memory to
   enforce a hard timeout when reading the response. For APIs that return large responses this
   could be expensive.


   The request timeout feature doesn't have strict guarantees on how quickly a request is
   aborted when the timeout is breached. The typical case aborts the request within a few
   milliseconds but there may occasionally be requests that don't get aborted until several
   seconds after the timer has been breached. Because of this, the request timeout feature
   should not be used when absolute precision is needed.

   Note: This feature is not compatible with Java 1.6.

  returns: The amount of time to wait (in milliseconds) for the request to complete before
           giving up and timing out. - `int`"
  (^Integer [^ClientConfiguration this]
    (-> this (.getRequestTimeout))))

(defn set-max-connections
  "Sets the maximum number of allowed open HTTP connections.

  max-connections - The maximum number of allowed open HTTP connections. - `int`"
  ([^ClientConfiguration this ^Integer max-connections]
    (-> this (.setMaxConnections max-connections))))

(defn with-client-execution-timeout
  "Sets the amount of time (in milliseconds) to allow the client to complete the execution of
   an API call. This timeout covers the entire client execution except for marshalling. This
   includes request handler execution, all HTTP request including retries, unmarshalling, etc.

   This feature requires buffering the entire response (for non-streaming APIs) into memory to
   enforce a hard timeout when reading the response. For APIs that return large responses this
   could be expensive.


   The client execution timeout feature doesn't have strict guarantees on how quickly a request
   is aborted when the timeout is breached. The typical case aborts the request within a few
   milliseconds but there may occasionally be requests that don't get aborted until several
   seconds after the timer has been breached. Because of this, the client execution timeout
   feature should not be used when absolute precision is needed.


   This may be used together with setRequestTimeout(int) to enforce
   both a timeout on each individual HTTP request (i.e. each retry) and the total time spent on
   all requests across retries (i.e. the 'client execution' time). A non-positive value disables
   this feature.


   Note: This feature is not compatible with Java 1.6.

  client-execution-timeout - The amount of time (in milliseconds) to allow the client to complete the execution of an API call. A value of '0' disables this feature. - `int`

  returns: The updated ClientConfiguration object for method chaining - `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration [^ClientConfiguration this ^Integer client-execution-timeout]
    (-> this (.withClientExecutionTimeout client-execution-timeout))))

(defn with-reaper
  "Sets whether the IdleConnectionReaper is to be started as a daemon thread

  use - the IdleConnectionReaper is to be started as a daemon thread - `boolean`

  returns: The updated ClientConfiguration object. - `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration [^ClientConfiguration this ^Boolean use]
    (-> this (.withReaper use))))

(defn set-socket-timeout
  "Sets the amount of time to wait (in milliseconds) for data to be transfered over an
   established, open connection before the connection times out and is closed. A value of 0
   means infinity, and isn't recommended.

  socket-timeout - The amount of time to wait (in milliseconds) for data to be transfered over an established, open connection before the connection times out and is closed. - `int`"
  ([^ClientConfiguration this ^Integer socket-timeout]
    (-> this (.setSocketTimeout socket-timeout))))

(defn set-response-metadata-cache-size
  "Sets the response metadata cache size. By default, it is set to
   50.

  response-metadata-cache-size - maximum cache size. - `int`"
  ([^ClientConfiguration this ^Integer response-metadata-cache-size]
    (-> this (.setResponseMetadataCacheSize response-metadata-cache-size))))

(defn with-protocol
  "Sets the protocol (i.e. HTTP or HTTPS) to use when connecting to Amazon Web Services, and
   returns the updated ClientConfiguration object so that additional calls may be chained
   together.

   The default configuration is to use HTTPS for all requests for increased security.

   Individual clients can also override this setting by explicitly including the protocol as
   part of the endpoint URL when calling AmazonWebServiceClient.setEndpoint(String).

  protocol - The protocol to use when connecting to Amazon Web Services. - `com.amazonaws.Protocol`

  returns: The updated ClientConfiguration object with the new max HTTP connections setting. - `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration [^ClientConfiguration this ^com.amazonaws.Protocol protocol]
    (-> this (.withProtocol protocol))))

(defn set-use-reaper
  "Sets whether the IdleConnectionReaper is to be started as a daemon thread

  use - whether the IdleConnectionReaper is to be started as a daemon thread - `boolean`"
  ([^ClientConfiguration this ^Boolean use]
    (-> this (.setUseReaper use))))

(defn with-user-agent-suffix
  "Sets the HTTP user agent suffix header used in requests and returns the updated ClientConfiguration
   object.

  suffix - The string to suffix to user agent to use when sending requests. - `java.lang.String`

  returns: The updated ClientConfiguration object. - `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration [^ClientConfiguration this ^java.lang.String suffix]
    (-> this (.withUserAgentSuffix suffix))))

(defn with-proxy-protocol
  "Set the Protocol to use for connecting to the proxy.

  proxy-protocol - The protocol. - `com.amazonaws.Protocol`

  returns: The updated ClientConfiguration object. - `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration [^ClientConfiguration this ^com.amazonaws.Protocol proxy-protocol]
    (-> this (.withProxyProtocol proxy-protocol))))

(defn get-max-connections
  "Returns the maximum number of allowed open HTTP connections.

  returns: The maximum number of allowed open HTTP connections. - `int`"
  (^Integer [^ClientConfiguration this]
    (-> this (.getMaxConnections))))

(defn get-proxy-authentication-methods
  "Returns the list of authentication methods that should be used when authenticating against an HTTP proxy, in the order they
   should be attempted.

  returns: An unmodifiable view of the proxy authentication methods that should be attempted, in order. - `java.util.List<com.amazonaws.ProxyAuthenticationMethod>`"
  (^java.util.List [^ClientConfiguration this]
    (-> this (.getProxyAuthenticationMethods))))

(defn set-connection-max-idle-millis
  "Sets the maximum amount of time that an idle connection may sit in the connection pool and
   still be eligible for reuse. When retrieving a connection from the pool to make a request,
   the amount of time the connection has been idle is compared against this value. Connections
   which have been idle for longer are discarded, and if needed a new connection is created.

   Tuning this setting down reduces the likelihood of a race condition (wherein you begin
   sending a request down a connection which appears to be healthy, but before it arrives the
   service decides the connection has been idle for too long and closes it) at the cost of
   having to re-establish new connections more frequently.

   By default, it is set to one minute (60000ms).

  connection-max-idle-millis - the connection maximum idle time, in milliseconds - `long`"
  ([^ClientConfiguration this ^Long connection-max-idle-millis]
    (-> this (.setConnectionMaxIdleMillis connection-max-idle-millis))))

(defn set-socket-buffer-size-hints
  "Sets the optional size hints (in bytes) for the low level TCP send and receive buffers. This
   is an advanced option for advanced users who want to tune low level TCP parameters to try and
   squeeze out more performance.

   The optimal TCP buffer sizes for a particular application are highly dependent on network
   configuration and operating system configuration and capabilities. For example, most modern
   operating systems provide auto-tuning functionality for TCP buffer sizes, which can have a
   big impact on performance for TCP connections that are held open long enough for the
   auto-tuning to optimize buffer sizes.

   Large buffer sizes (ex: 2MB) will allow the operating system to buffer more data in memory
   without requiring the remote server to acknowledge receipt of that information, so can be
   particularly useful when the network has high latency.

   This is only a hint, and the operating system may choose not to honor it. When using
   this option, users should always check the operating system's configured limits and
   defaults. Most OS's have a maximum TCP buffer size limit configured, and won't let you go
   beyond that limit unless you explicitly raise the max TCP buffer size limit.

   There are many resources available online to help with configuring TCP buffer sizes and
   operating system specific TCP settings, including:

   http://onlamp.com/pub/a/onlamp/2005/11/17/tcp_tuning.html
   http://fasterdata.es.net/TCP-tuning/

  socket-send-buffer-size-hint - The size hint (in bytes) for the low level TCP send buffer. - `int`
  socket-receive-buffer-size-hint - The size hint (in bytes) for the low level TCP receive buffer. - `int`"
  ([^ClientConfiguration this ^Integer socket-send-buffer-size-hint ^Integer socket-receive-buffer-size-hint]
    (-> this (.setSocketBufferSizeHints socket-send-buffer-size-hint socket-receive-buffer-size-hint))))

(defn with-cache-response-metadata
  "Sets whether or not to cache response metadata.

   Response metadata is typically used for troubleshooting issues with AWS support staff when
   services aren't acting as expected.


   While this feature is useful for debugging it adds overhead and disabling it may
   be desired in high throughput applications.

  should-cache - true if response metadata should be cached - `boolean`

  returns: The updated ClientConfiguration object. - `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration [^ClientConfiguration this ^Boolean should-cache]
    (-> this (.withCacheResponseMetadata should-cache))))

(defn get-client-execution-timeout
  "Returns the amount of time (in milliseconds) to allow the client to complete the execution of
   an API call. This timeout covers the entire client execution except for marshalling. This
   includes request handler execution, all HTTP request including retries, unmarshalling, etc.

   This feature requires buffering the entire response (for non-streaming APIs) into memory to
   enforce a hard timeout when reading the response. For APIs that return large responses this
   could be expensive.


   The client execution timeout feature doesn't have strict guarantees on how quickly a request
   is aborted when the timeout is breached. The typical case aborts the request within a few
   milliseconds but there may occasionally be requests that don't get aborted until several
   seconds after the timer has been breached. Because of this, the client execution timeout
   feature should not be used when absolute precision is needed.


   This may be used together with setRequestTimeout(int) to enforce
   both a timeout on each individual HTTP request (i.e. each retry) and the total time spent on
   all requests across retries (i.e. the 'client execution' time). A non-positive value disables
   this feature.


   Note: This feature is not compatible with Java 1.6.

  returns: The amount of time (in milliseconds) to allow the client to complete the execution of
           an API call. - `int`"
  (^Integer [^ClientConfiguration this]
    (-> this (.getClientExecutionTimeout))))

(defn with-connection-timeout
  "Sets the amount of time to wait (in milliseconds) when initially establishing a connection
   before giving up and timing out, and returns the updated ClientConfiguration object so that
   additional method calls may be chained together.

  connection-timeout - the amount of time to wait (in milliseconds) when initially establishing a connection before giving up and timing out. - `int`

  returns: The updated ClientConfiguration object. - `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration [^ClientConfiguration this ^Integer connection-timeout]
    (-> this (.withConnectionTimeout connection-timeout))))

(defn get-user-agent
  "Deprecated. Replaced by getUserAgentPrefix() and getUserAgentSuffix()

  returns: The user agent string to use when sending requests. - `java.lang.String`"
  (^java.lang.String [^ClientConfiguration this]
    (-> this (.getUserAgent))))

(defn get-apache-http-client-config
  "Returns a non-null object that can be used to specify Apache HTTP client specific custom
   configurations.

  returns: `com.amazonaws.ApacheHttpClientConfig`"
  (^com.amazonaws.ApacheHttpClientConfig [^ClientConfiguration this]
    (-> this (.getApacheHttpClientConfig))))

(defn get-proxy-port
  "Returns the optional proxy port the client will connect
   through.  Returns either the proxyPort set on this object, or
   if not provided, checks the value of the Java system property
   for proxy port according to getProtocol(): i.e. if
   protocol is https, returns the value of the system property
   https.proxyPort, otherwise returns value of http.proxyPort.
   If neither are set, checks the value of the environment variable
   according to getProtocol(): i.e. if protocol is https,
   returns the port in the value of the HTTPS_PROXY/https_proxy
   environment variable, otherwise returns the port in the value
   of the HTTP_PROXY/http_proxy environment variable.

  returns: The proxy port the client will connect through. - `int`"
  (^Integer [^ClientConfiguration this]
    (-> this (.getProxyPort))))

(defn add-header
  "Adds a header to be added on all requests

  name - the name of the header - `java.lang.String`
  value - the value of the header - `java.lang.String`"
  ([^ClientConfiguration this ^java.lang.String name ^java.lang.String value]
    (-> this (.addHeader name value))))

(defn with-dns-resolver
  "Sets the DNS Resolver that should be used to for resolving AWS IP addresses.

  resolver - `com.amazonaws.DnsResolver`

  returns: The updated ClientConfiguration object. - `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration [^ClientConfiguration this ^com.amazonaws.DnsResolver resolver]
    (-> this (.withDnsResolver resolver))))

(defn with-request-timeout
  "Sets the amount of time to wait (in milliseconds) for the request to complete before giving
   up and timing out. A non-positive value disables this feature. Returns the updated
   ClientConfiguration object so that additional method calls may be chained together.

   This feature requires buffering the entire response (for non-streaming APIs) into memory to
   enforce a hard timeout when reading the response. For APIs that return large responses this
   could be expensive.


   The request timeout feature doesn't have strict guarantees on how quickly a request is
   aborted when the timeout is breached. The typical case aborts the request within a few
   milliseconds but there may occasionally be requests that don't get aborted until several
   seconds after the timer has been breached. Because of this, the request timeout feature
   should not be used when absolute precision is needed.


   Note: This feature is not compatible with Java 1.6.

  request-timeout - The amount of time to wait (in milliseconds) for the request to complete before giving up and timing out. - `int`

  returns: The updated ClientConfiguration object. - `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration [^ClientConfiguration this ^Integer request-timeout]
    (-> this (.withRequestTimeout request-timeout))))

(defn with-socket-timeout
  "Sets the amount of time to wait (in milliseconds) for data to be transfered over an
   established, open connection before the connection times out and is closed, and returns the
   updated ClientConfiguration object so that additional method calls may be chained together.

  socket-timeout - The amount of time to wait (in milliseconds) for data to be transfered over an established, open connection before the connection times out and is closed. - `int`

  returns: The updated ClientConfiguration object. - `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration [^ClientConfiguration this ^Integer socket-timeout]
    (-> this (.withSocketTimeout socket-timeout))))

(defn with-max-consecutive-retries-before-throttling
  "Set the maximum number of consecutive failed retries that the client will permit before
   throttling all subsequent retries of failed requests.

   Note: This does not guarantee that each failed request will be retried up to this many times.
   Depending on the configured RetryPolicy and the number of past failed and successful
   requests, the actual number of retries attempted may be less.

   This has a default value of DEFAULT_MAX_CONSECUTIVE_RETRIES_BEFORE_THROTTLING.

  max-consecutive-retries-before-throttling - The maximum number of consecutive retries. - `int`

  returns: This object for chaining. - `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration [^ClientConfiguration this ^Integer max-consecutive-retries-before-throttling]
    (-> this (.withMaxConsecutiveRetriesBeforeThrottling max-consecutive-retries-before-throttling))))

(defn set-proxy-domain
  "Sets the optional Windows domain name for configuration an NTLM proxy. If you aren't using a
   Windows NTLM proxy, you do not need to set this field.

  proxy-domain - The optional Windows domain name for configuring an NTLM proxy. - `java.lang.String`"
  ([^ClientConfiguration this ^java.lang.String proxy-domain]
    (-> this (.setProxyDomain proxy-domain))))

(defn set-proxy-workstation
  "Sets the optional Windows workstation name for configuring NTLM proxy support. If you aren't
   using a Windows NTLM proxy, you do not need to set this field.

  proxy-workstation - The optional Windows workstation name for configuring NTLM proxy support. - `java.lang.String`"
  ([^ClientConfiguration this ^java.lang.String proxy-workstation]
    (-> this (.setProxyWorkstation proxy-workstation))))

(defn set-validate-after-inactivity-millis
  "Sets the amount of time (in milliseconds) that a connection can be idle in the connection pool before it must be validated
   to ensure it's still open. This \"stale connection check\" adds a small bit of overhead to validate the connection. Setting
   this value to larger values may increase the likelihood that the connection is not usable, potentially resulting in a
   NoHttpResponseException. Lowering this setting increases the overhead when leasing connections
   from the connection pool. It is recommended to tune this setting based on how long a service allows a connection to be
   idle before closing.

   A non positive value disables validation of connections.

   The default value is 5000 milliseconds.

  validate-after-inactivity-millis - The allowed time, in milliseconds, a connection can be idle before it must be re-validated. - `int`"
  ([^ClientConfiguration this ^Integer validate-after-inactivity-millis]
    (-> this (.setValidateAfterInactivityMillis validate-after-inactivity-millis))))

(defn with-proxy-username
  "Sets the optional proxy user name and returns the updated ClientConfiguration object.

  proxy-username - The proxy user name to use if connecting through a proxy. - `java.lang.String`

  returns: The updated ClientConfiguration object. - `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration [^ClientConfiguration this ^java.lang.String proxy-username]
    (-> this (.withProxyUsername proxy-username))))

(defn with-validate-after-inactivity-millis
  "Sets the amount of time (in milliseconds) that a connection can be idle in the connection pool before it must be validated
   to ensure it's still open. This \"stale connection check\" adds a small bit of overhead to validate the connection. Setting
   this value to larger values may increase the likelihood that the connection is not usable, potentially resulting in a
   NoHttpResponseException. Lowering this setting increases the overhead when leasing connections
   from the connection pool. It is recommended to tune this setting based on how long a service allows a connection to be
   idle before closing.

   A non positive value disables validation of connections.

   The default value is 5000 milliseconds.

  validate-after-inactivity-millis - The allowed time, in milliseconds, a connection can be idle before it must be re-validated. - `int`

  returns: The updated ClientConfiguration object. - `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration [^ClientConfiguration this ^Integer validate-after-inactivity-millis]
    (-> this (.withValidateAfterInactivityMillis validate-after-inactivity-millis))))

(defn set-max-consecutive-retries-before-throttling
  "Set the maximum number of consecutive failed retries that the client will permit before
   throttling all subsequent retries of failed requests.

   Note: This does not guarantee that each failed request will be retried up to this many times.
   Depending on the configured RetryPolicy and the number of past failed and successful
   requests, the actual number of retries attempted may be less.

   This has a default value of DEFAULT_MAX_CONSECUTIVE_RETRIES_BEFORE_THROTTLING.

  max-consecutive-retries-before-throttling - The maximum number of consecutive retries. - `int`"
  ([^ClientConfiguration this ^Integer max-consecutive-retries-before-throttling]
    (-> this (.setMaxConsecutiveRetriesBeforeThrottling max-consecutive-retries-before-throttling))))

(defn get-max-consecutive-retries-before-throttling
  "returns: Set the maximum number of consecutive failed retries that the client will permit
   before throttling all subsequent retries of failed requests. - `int`"
  (^Integer [^ClientConfiguration this]
    (-> this (.getMaxConsecutiveRetriesBeforeThrottling))))

(defn with-tcp-keep-alive
  "Sets whether or not to enable TCP KeepAlive support at the socket level.

  use - `boolean`

  returns: The updated ClientConfiguration object. - `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration [^ClientConfiguration this ^Boolean use]
    (-> this (.withTcpKeepAlive use))))

(defn with-signer-override
  "Sets the name of the signature algorithm to use for signing requests made by this client. If
   not set or explicitly set to null, the client will choose a signature algorithm to use based
   on a configuration file of supported signature algorithms for the service and region.

   Most users do not need to concern themselves with which signature algorithm is being used, as
   the defaults will be sufficient. This setting exists only so advanced users can opt in to
   newer signature protocols which have not yet been made the default for a particular
   service/region.

   Not all services support all signature algorithms, and configuring an unsupported signature
   algorithm will lead to authentication failures. Use me at your own risk, and only after
   consulting the documentation for the service to ensure it actually does supports your chosen
   algorithm.

   If non-null, the name returned from this method is used to look up a Signer class
   implementing the chosen algorithm by the com.amazonaws.auth.SignerFactory class.

  value - The signature algorithm to use for this client, or null to use the default. - `java.lang.String`

  returns: The updated ClientConfiguration object. - `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration [^ClientConfiguration this ^java.lang.String value]
    (-> this (.withSignerOverride value))))

(defn get-connection-ttl
  "Returns the expiration time (in milliseconds) for a connection in the connection pool. When
   retrieving a connection from the pool to make a request, the total time that the connection
   has been open is compared against this value. Connections which have been open for longer are
   discarded, and if needed a new connection is created.

   Tuning this setting down (together with an appropriately-low setting for Java's DNS cache
   TTL) ensures that your application will quickly rotate over to new IP addresses when the
   service begins announcing them through DNS, at the cost of having to re-establish new
   connections more frequently.

  returns: the connection TTL, in milliseconds - `long`"
  (^Long [^ClientConfiguration this]
    (-> this (.getConnectionTTL))))

(defn set-proxy-username
  "Sets the optional proxy user name to use if connecting through a proxy.

  proxy-username - The proxy user name to use if connecting through a proxy. - `java.lang.String`"
  ([^ClientConfiguration this ^java.lang.String proxy-username]
    (-> this (.setProxyUsername proxy-username))))

(defn use-gzip
  "Checks if gzip compression is used

  returns: if gzip compression is used - `boolean`"
  (^Boolean [^ClientConfiguration this]
    (-> this (.useGzip))))

(defn with-proxy-host
  "Sets the optional proxy host the client will connect through and returns the updated
   ClientConfiguration object.

  proxy-host - The proxy host the client will connect through. - `java.lang.String`

  returns: The updated ClientConfiguration object. - `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration [^ClientConfiguration this ^java.lang.String proxy-host]
    (-> this (.withProxyHost proxy-host))))

(defn get-max-error-retry
  "Returns the maximum number of retry attempts for failed retryable requests (ex: 5xx error
   responses from a service). This method returns -1 before a maxErrorRetry value is explicitly
   set by setMaxErrorRetry(int), in which case the configured RetryPolicy will be used
   to control the retry count.

  returns: The maximum number of retry attempts for failed retryable requests, or -1 if
           maxErrorRetry has not been set by setMaxErrorRetry(int). - `int`"
  (^Integer [^ClientConfiguration this]
    (-> this (.getMaxErrorRetry))))

(defn set-use-tcp-keep-alive
  "Sets whether or not to enable TCP KeepAlive support at the socket level.

  use - `boolean`"
  ([^ClientConfiguration this ^Boolean use]
    (-> this (.setUseTcpKeepAlive use))))

(defn set-user-agent-prefix
  "Sets the HTTP user agent prefix to send with all requests.

  prefix - The string to prefix to user agent to use when sending requests. - `java.lang.String`"
  ([^ClientConfiguration this ^java.lang.String prefix]
    (-> this (.setUserAgentPrefix prefix))))

(defn use-expect-continue?
  "Returns the use expect continue flag

  returns: `boolean`"
  (^Boolean [^ClientConfiguration this]
    (-> this (.isUseExpectContinue))))

(defn set-cache-response-metadata
  "Sets whether or not to cache response metadata.

   Response metadata is typically used for troubleshooting issues with AWS support staff when
   services aren't acting as expected.


   While this feature is useful for debugging it adds overhead and disabling it may
   be desired in high throughput applications.

  should-cache - true if response metadata should be cached - `boolean`"
  ([^ClientConfiguration this ^Boolean should-cache]
    (-> this (.setCacheResponseMetadata should-cache))))

(defn set-retry-policy
  "Sets the retry policy upon failed requests. User could specify whether the RetryPolicy should
   honor maxErrorRetry set by setMaxErrorRetry(int).

  retry-policy - The retry policy upon failed requests. - `com.amazonaws.retry.RetryPolicy`"
  ([^ClientConfiguration this ^com.amazonaws.retry.RetryPolicy retry-policy]
    (-> this (.setRetryPolicy retry-policy))))

(defn get-proxy-protocol
  "returns: The Protocol to use for connecting to the proxy. - `com.amazonaws.Protocol`"
  (^com.amazonaws.Protocol [^ClientConfiguration this]
    (-> this (.getProxyProtocol))))

(defn disable-host-prefix-injection?
  "Returns the boolean value to indicate if the host prefix injection is disabled or not.

   The hostPrefix template is specified in the service model and is used by the SDK to modify the endpoint
   the request is sent to. Host prefix injection is enabled by default. This option can be set to disable the behavior.

  returns: `boolean`"
  (^Boolean [^ClientConfiguration this]
    (-> this (.isDisableHostPrefixInjection))))

(defn use-reaper
  "Checks if the IdleConnectionReaper is to be started

  returns: if the IdleConnectionReaper is to be started - `boolean`"
  (^Boolean [^ClientConfiguration this]
    (-> this (.useReaper))))

(defn with-proxy-workstation
  "Sets the optional Windows workstation name for configuring NTLM proxy support, and returns
   the updated ClientConfiguration object so that additional method calls can be chained
   together. If you aren't using a Windows NTLM proxy, you do not need to set this field.

  proxy-workstation - The optional Windows workstation name for configuring NTLM proxy support. - `java.lang.String`

  returns: The updated ClientConfiguration object. - `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration [^ClientConfiguration this ^java.lang.String proxy-workstation]
    (-> this (.withProxyWorkstation proxy-workstation))))

(defn get-proxy-host
  "Returns the optional proxy host the client will connect
   through.  Returns either the proxyHost set on this object, or
   if not provided, checks the value of the Java system property
   for proxy host according to getProtocol(): i.e. if
   protocol is https, returns the value of the system property
   https.proxyHost, otherwise returns value of http.proxyHost.
   If neither are set, checks the value of the environment variable
   according to getProtocol(): i.e. if protocol is https,
   returns the host in the value of the HTTPS_PROXY/https_proxy
   environment variable, otherwise returns the host in the value
   of the HTTP_PROXY/http_proxy environment variable.

  returns: The proxy host the client will connect through. - `java.lang.String`"
  (^java.lang.String [^ClientConfiguration this]
    (-> this (.getProxyHost))))

(defn with-throttled-retries
  "Sets whether throttled retries should be used

   Retry throttling is a feature which intelligently throttles retry attempts when a
   large percentage of requests are failing and retries are unsuccessful, particularly
   in scenarios of degraded service health.  In these situations the client will drain its
   internal retry capacity and slowly roll off from retry attempts until requests begin
   to succeed again.  At that point the retry capacity pool will begin to refill and
   retries will once again be permitted.


   In situations where retries have been throttled this feature will effectively result in
   fail-fast behavior from the client.  Because retries are circumvented exceptions will
   be immediately returned to the caller if the initial request is unsuccessful.  This
   will result in a greater number of exceptions being returned up front but prevents
   requests being tied up attempting subsequent retries which are also likely to fail.

  use - true if throttled retries should be used - `boolean`

  returns: The updated ClientConfiguration object. - `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration [^ClientConfiguration this ^Boolean use]
    (-> this (.withThrottledRetries use))))

(defn with-socket-buffer-size-hints
  "Sets the optional size hints (in bytes) for the low level TCP send and receive buffers, and
   returns the updated ClientConfiguration object so that additional method calls may be chained
   together.

   This is an advanced option for advanced users who want to tune low level TCP parameters to
   try and squeeze out more performance.

   The optimal TCP buffer sizes for a particular application are highly dependent on network
   configuration and operating system configuration and capabilities. For example, most modern
   operating systems provide auto-tuning functionality for TCP buffer sizes, which can have a
   big impact on performance for TCP connections that are held open long enough for the
   auto-tuning to optimize buffer sizes.

   Large buffer sizes (ex: 2MB) will allow the operating system to buffer more data in memory
   without requiring the remote server to acknowledge receipt of that information, so can be
   particularly useful when the network has high latency.

   This is only a hint, and the operating system may choose not to honor it. When using
   this option, users should always check the operating system's configured limits and
   defaults. Most OS's have a maximum TCP buffer size limit configured, and won't let you go
   beyond that limit unless you explicitly raise the max TCP buffer size limit.

   There are many resources available online to help with configuring TCP buffer sizes and
   operating system specific TCP settings, including:

   http://onlamp.com/pub/a/onlamp/2005/11/17/tcp_tuning.html
   http://fasterdata.es.net/TCP-tuning/

  socket-send-buffer-size-hint - The size hint (in bytes) for the low level TCP send buffer. - `int`
  socket-receive-buffer-size-hint - The size hint (in bytes) for the low level TCP receive buffer. - `int`

  returns: The updated ClientConfiguration object. - `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration [^ClientConfiguration this ^Integer socket-send-buffer-size-hint ^Integer socket-receive-buffer-size-hint]
    (-> this (.withSocketBufferSizeHints socket-send-buffer-size-hint socket-receive-buffer-size-hint))))

(defn with-preemptive-basic-proxy-auth
  "Sets whether to attempt to authenticate preemptively against proxy servers using basic
   authentication, and returns the updated ClientConfiguration object so that additional method
   calls may be chained together.

  preemptive-basic-proxy-auth - Whether to authenticate preemptively against proxy server. - `boolean`

  returns: The updated ClientConfiguration object. - `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration [^ClientConfiguration this ^Boolean preemptive-basic-proxy-auth]
    (-> this (.withPreemptiveBasicProxyAuth preemptive-basic-proxy-auth))))

(defn set-proxy-password
  "Sets the optional proxy password to use when connecting through a proxy.

  proxy-password - The password to use when connecting through a proxy. - `java.lang.String`"
  ([^ClientConfiguration this ^java.lang.String proxy-password]
    (-> this (.setProxyPassword proxy-password))))

(defn get-socket-buffer-size-hints
  "Returns the optional size hints (in bytes) for the low level TCP send and receive buffers.
   This is an advanced option for advanced users who want to tune low level TCP parameters to
   try and squeeze out more performance.

   The optimal TCP buffer sizes for a particular application are highly dependent on network
   configuration and operating system configuration and capabilities. For example, most modern
   operating systems provide auto-tuning functionality for TCP buffer sizes, which can have a
   big impact on performance for TCP connections that are held open long enough for the
   auto-tuning to optimize buffer sizes.

   Large buffer sizes (ex: 2MB) will allow the operating system to buffer more data in memory
   without requiring the remote server to acknowledge receipt of that information, so can be
   particularly useful when the network has high latency.

   This is only a hint, and the operating system may choose not to honor it. When using
   this option, users should always check the operating system's configured limits and
   defaults. Most OS's have a maximum TCP buffer size limit configured, and won't let you go
   beyond that limit unless you explicitly raise the max TCP buffer size limit.

   There are many resources available online to help with configuring TCP buffer sizes and
   operating system specific TCP settings, including:

   http://onlamp.com/pub/a/onlamp/2005/11/17/tcp_tuning.html
   http://fasterdata.es.net/TCP-tuning/

  returns: A two element array containing first the TCP send buffer size hint and then the TCP
           receive buffer size hint. - `int[]`"
  ([^ClientConfiguration this]
    (-> this (.getSocketBufferSizeHints))))

(defn set-proxy-authentication-methods
  "Configure the list of authentication methods that should be used when authenticating against an HTTP proxy, in the order
   they should be attempted. Any methods not included in this list will not be attempted. If one authentication method fails,
   the next method will be attempted, until a working method is found (or all methods have been attempted).

   Setting this value to null indicates using the default behavior, which is to try all authentication methods in an
   unspecified order.

  proxy-authentication-methods - The proxy authentication methods to be attempted, in the order they should be attempted. - `java.util.List`"
  ([^ClientConfiguration this ^java.util.List proxy-authentication-methods]
    (-> this (.setProxyAuthenticationMethods proxy-authentication-methods))))

(defn with-secure-random
  "Fluent API for setSecureRandom(SecureRandom).

  secure-random - `java.security.SecureRandom`

  returns: `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration [^ClientConfiguration this ^java.security.SecureRandom secure-random]
    (-> this (.withSecureRandom secure-random))))

(defn set-connection-timeout
  "Sets the amount of time to wait (in milliseconds) when initially establishing a connection
   before giving up and timing out. A value of 0 means infinity, and is not recommended.

  connection-timeout - The amount of time to wait (in milliseconds) when initially establishing a connection before giving up and timing out. - `int`"
  ([^ClientConfiguration this ^Integer connection-timeout]
    (-> this (.setConnectionTimeout connection-timeout))))

(defn with-proxy-port
  "Sets the optional proxy port the client will connect through and returns the updated
   ClientConfiguration object.

  proxy-port - The proxy port the client will connect through. - `int`

  returns: The updated ClientConfiguration object. - `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration [^ClientConfiguration this ^Integer proxy-port]
    (-> this (.withProxyPort proxy-port))))

(defn get-cache-response-metadata?
  "Returns whether or not to cache response metadata.

   Response metadata is typically used for troubleshooting issues with AWS support staff when
   services aren't acting as expected.


   While this feature is useful for debugging it adds overhead and disabling it may
   be desired in high throughput applications.

  returns: true if response metadata will be cached - `boolean`"
  (^Boolean [^ClientConfiguration this]
    (-> this (.getCacheResponseMetadata))))

(defn get-response-metadata-cache-size
  "Returns the response metadata cache size.

  returns: `int`"
  (^Integer [^ClientConfiguration this]
    (-> this (.getResponseMetadataCacheSize))))

(defn get-local-address
  "Returns the optional local address the client will bind to.

  returns: The local address the client will bind to. - `java.net.InetAddress`"
  (^java.net.InetAddress [^ClientConfiguration this]
    (-> this (.getLocalAddress))))

(defn set-proxy-port
  "Sets the optional proxy port the client will connect through.

  proxy-port - The proxy port the client will connect through. - `int`"
  ([^ClientConfiguration this ^Integer proxy-port]
    (-> this (.setProxyPort proxy-port))))

(defn with-max-connections
  "Sets the maximum number of allowed open HTTP connections and returns the updated
   ClientConfiguration object.

  max-connections - The maximum number of allowed open HTTP connections. - `int`

  returns: The updated ClientConfiguration object with the new max HTTP connections setting. - `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration [^ClientConfiguration this ^Integer max-connections]
    (-> this (.withMaxConnections max-connections))))

(defn set-disable-host-prefix-injection
  "Sets the configuration option to disable the host prefix injection.

   The hostPrefix template is specified in the service model and is used by the SDK to modify the endpoint
   the request is sent to. Host prefix injection is enabled by default. This option can be set to disable the behavior.

  disable-host-prefix-injection - `boolean`"
  ([^ClientConfiguration this ^Boolean disable-host-prefix-injection]
    (-> this (.setDisableHostPrefixInjection disable-host-prefix-injection))))

(defn set-user-agent
  "Deprecated. Replaced by setUserAgentPrefix(String) and setUserAgentSuffix(String)

  user-agent - The user agent string to use when sending requests. - `java.lang.String`"
  ([^ClientConfiguration this ^java.lang.String user-agent]
    (-> this (.setUserAgent user-agent))))

(defn set-non-proxy-hosts
  "Set the optional hosts the client will access without going
   through the proxy.

  non-proxy-hosts - The hosts the client will access without going through the proxy. - `java.lang.String`"
  ([^ClientConfiguration this ^java.lang.String non-proxy-hosts]
    (-> this (.setNonProxyHosts non-proxy-hosts))))

(defn set-use-throttle-retries
  "Sets whether throttled retries should be used

   Retry throttling is a feature which intelligently throttles retry attempts when a
   large percentage of requests are failing and retries are unsuccessful, particularly
   in scenarios of degraded service health.  In these situations the client will drain its
   internal retry capacity and slowly roll off from retry attempts until requests begin
   to succeed again.  At that point the retry capacity pool will begin to refill and
   retries will once again be permitted.


   In situations where retries have been throttled this feature will effectively result in
   fail-fast behavior from the client.  Because retries are circumvented exceptions will
   be immediately returned to the caller if the initial request is unsuccessful.  This
   will result in a greater number of exceptions being returned up front but prevents
   requests being tied up attempting subsequent retries which are also likely to fail.

  use - true if throttled retries should be used - `boolean`"
  ([^ClientConfiguration this ^Boolean use]
    (-> this (.setUseThrottleRetries use))))

(defn set-request-timeout
  "Sets the amount of time to wait (in milliseconds) for the request to complete before giving
   up and timing out. A non-positive value disables this feature.

   This feature requires buffering the entire response (for non-streaming APIs) into memory to
   enforce a hard timeout when reading the response. For APIs that return large responses this
   could be expensive.


   The request timeout feature doesn't have strict guarantees on how quickly a request is
   aborted when the timeout is breached. The typical case aborts the request within a few
   milliseconds but there may occasionally be requests that don't get aborted until several
   seconds after the timer has been breached. Because of this, the request timeout feature
   should not be used when absolute precision is needed.


   Note: This feature is not compatible with Java 1.6.

  request-timeout - The amount of time to wait (in milliseconds) for the request to complete before giving up and timing out. - `int`"
  ([^ClientConfiguration this ^Integer request-timeout]
    (-> this (.setRequestTimeout request-timeout))))

(defn with-local-address
  "Sets the optional local address the client will bind to and returns the updated
   ClientConfiguration object.

  local-address - The local address the client will bind to. - `java.net.InetAddress`

  returns: The updated ClientConfiguration object. - `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration [^ClientConfiguration this ^java.net.InetAddress local-address]
    (-> this (.withLocalAddress local-address))))

(defn with-use-expect-continue
  "Sets if use expect continue should be enabled. By default, it is set to
   true.

  use-expect-continue - use expect continue HTTP/1.1 header. - `boolean`

  returns: The updated ClientConfiguration object. - `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration [^ClientConfiguration this ^Boolean use-expect-continue]
    (-> this (.withUseExpectContinue use-expect-continue))))

(defn get-user-agent-suffix
  "Returns the HTTP user agent header suffix to add to the end of the user agent header on all requests.

  returns: The user agent string suffix to use when sending requests. - `java.lang.String`"
  (^java.lang.String [^ClientConfiguration this]
    (-> this (.getUserAgentSuffix))))

(defn set-secure-random
  "Sets an instance of SecureRandom to be used by the SDK.

  secure-random - `java.security.SecureRandom`"
  ([^ClientConfiguration this ^java.security.SecureRandom secure-random]
    (-> this (.setSecureRandom secure-random))))

(defn get-proxy-workstation
  "Returns the optional Windows workstation name for configuring NTLM proxy support. If you
   aren't using a Windows NTLM proxy, you do not need to set this field.

  returns: The optional Windows workstation name for configuring NTLM proxy support. - `java.lang.String`"
  (^java.lang.String [^ClientConfiguration this]
    (-> this (.getProxyWorkstation))))

(defn with-user-agent-prefix
  "Sets the HTTP user agent prefix header used in requests and returns the updated ClientConfiguration
   object.

  prefix - The string to prefix to user agent to use when sending requests. - `java.lang.String`

  returns: The updated ClientConfiguration object. - `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration [^ClientConfiguration this ^java.lang.String prefix]
    (-> this (.withUserAgentPrefix prefix))))

(defn set-user-agent-suffix
  "Sets the HTTP user agent suffix to send with all requests.

  suffix - The string to suffix to user agent to use when sending requests. - `java.lang.String`"
  ([^ClientConfiguration this ^java.lang.String suffix]
    (-> this (.setUserAgentSuffix suffix))))

(defn set-proxy-host
  "Sets the optional proxy host the client will connect through.

  proxy-host - The proxy host the client will connect through. - `java.lang.String`"
  ([^ClientConfiguration this ^java.lang.String proxy-host]
    (-> this (.setProxyHost proxy-host))))

(defn get-non-proxy-hosts
  "Returns the optional hosts the client will access without going
   through the proxy. Returns either the nonProxyHosts set on this
   object, or if not provided, returns the value of the Java system property
   http.nonProxyHosts. We still honor this property even when
   getProtocol() is https, see http://docs.oracle.com/javase/7/docs/api/java/net/doc-files/net-properties.html.
   This property is expected to be set as a pipe separated list. If neither are set,
   returns the value of the environment variable NO_PROXY/no_proxy. This environment
   variable is expected to be set as a comma separated list.

  returns: The hosts the client will connect through bypassing the proxy. - `java.lang.String`"
  (^java.lang.String [^ClientConfiguration this]
    (-> this (.getNonProxyHosts))))

(defn set-max-error-retry
  "Sets the maximum number of retry attempts for failed retryable requests (ex: 5xx error
   responses from services).

  max-error-retry - The maximum number of retry attempts for failed retryable requests. This value should not be negative. - `int`"
  ([^ClientConfiguration this ^Integer max-error-retry]
    (-> this (.setMaxErrorRetry max-error-retry))))

(defn get-secure-random
  "Returns the instance of SecureRandom configured by the user; or the JDK default if it
   is null.

  returns: a non-null instance of SecureRandom. - `java.security.SecureRandom`"
  (^java.security.SecureRandom [^ClientConfiguration this]
    (-> this (.getSecureRandom))))

(defn with-user-agent
  "Deprecated. Replaced by withUserAgentPrefix(String) and withUserAgentSuffix(String)

  user-agent - The user agent string to use when sending requests. - `java.lang.String`

  returns: The updated ClientConfiguration object. - `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration [^ClientConfiguration this ^java.lang.String user-agent]
    (-> this (.withUserAgent user-agent))))

(defn with-proxy-authentication-methods
  "Configure the list of authentication methods that should be used when authenticating against an HTTP proxy, in the order
   they should be attempted. Any methods not included in this list will not be attempted. If one authentication method fails,
   the next method will be attempted, until a working method is found (or all methods have been attempted).

   Setting this value to null indicates using the default behavior, which is to try all authentication methods in an
   unspecified order.

  proxy-authentication-methods - The proxy authentication methods to be attempted, in the order they should be attempted. - `java.util.List`

  returns: The updated ClientConfiguration object. - `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration [^ClientConfiguration this ^java.util.List proxy-authentication-methods]
    (-> this (.withProxyAuthenticationMethods proxy-authentication-methods))))

(defn get-protocol
  "Returns the protocol (HTTP or HTTPS) to use when connecting to Amazon Web Services.

   The default configuration is to use HTTPS for all requests for increased security.

   Individual clients can also override this setting by explicitly including the protocol as
   part of the endpoint URL when calling AmazonWebServiceClient.setEndpoint(String).

  returns: The protocol to use when connecting to Amazon Web Services. - `com.amazonaws.Protocol`"
  (^com.amazonaws.Protocol [^ClientConfiguration this]
    (-> this (.getProtocol))))

(defn set-disable-socket-proxy
  "Set whether to disable proxies at the socket level.

  disable-socket-proxy - Whether to disable proxies at the socket level. - `boolean`"
  ([^ClientConfiguration this ^Boolean disable-socket-proxy]
    (-> this (.setDisableSocketProxy disable-socket-proxy))))

(defn set-preemptive-basic-proxy-auth
  "Sets whether to attempt to authenticate preemptively against proxy servers using basic
   authentication

  preemptive-basic-proxy-auth - Whether to authenticate preemptively against proxy server. - `java.lang.Boolean`"
  ([^ClientConfiguration this ^java.lang.Boolean preemptive-basic-proxy-auth]
    (-> this (.setPreemptiveBasicProxyAuth preemptive-basic-proxy-auth))))

(defn set-client-execution-timeout
  "Sets the amount of time (in milliseconds) to allow the client to complete the execution of
   an API call. This timeout covers the entire client execution except for marshalling. This
   includes request handler execution, all HTTP request including retries, unmarshalling, etc.

   This feature requires buffering the entire response (for non-streaming APIs) into memory to
   enforce a hard timeout when reading the response. For APIs that return large responses this
   could be expensive.


   The client execution timeout feature doesn't have strict guarantees on how quickly a request
   is aborted when the timeout is breached. The typical case aborts the request within a few
   milliseconds but there may occasionally be requests that don't get aborted until several
   seconds after the timer has been breached. Because of this, the client execution timeout
   feature should not be used when absolute precision is needed.


   This may be used together with setRequestTimeout(int) to enforce
   both a timeout on each individual HTTP request (i.e. each retry) and the total time spent on
   all requests across retries (i.e. the 'client execution' time). A non-positive value disables
   this feature.


   Note: This feature is not compatible with Java 1.6.

  client-execution-timeout - The amount of time (in milliseconds) to allow the client to complete the execution of an API call. A value of '0' disables this feature. - `int`"
  ([^ClientConfiguration this ^Integer client-execution-timeout]
    (-> this (.setClientExecutionTimeout client-execution-timeout))))

(defn get-connection-timeout
  "Returns the amount of time to wait (in milliseconds) when initially establishing a connection
   before giving up and timing out. A value of 0 means infinity, and is not recommended.

  returns: The amount of time to wait (in milliseconds) when initially establishing a connection
           before giving up and timing out. - `int`"
  (^Integer [^ClientConfiguration this]
    (-> this (.getConnectionTimeout))))

(defn set-use-expect-continue
  "Sets if use expect continue should be enabled. By default, it is set to
   true.

  use-expect-continue - use expect continue HTTP/1.1 header. - `boolean`"
  ([^ClientConfiguration this ^Boolean use-expect-continue]
    (-> this (.setUseExpectContinue use-expect-continue))))

(defn get-proxy-domain
  "Returns the optional Windows domain name for configuring an NTLM proxy. If you aren't using a
   Windows NTLM proxy, you do not need to set this field.

  returns: The optional Windows domain name for configuring an NTLM proxy. - `java.lang.String`"
  (^java.lang.String [^ClientConfiguration this]
    (-> this (.getProxyDomain))))

(defn preemptive-basic-proxy-auth?
  "Returns whether to attempt to authenticate preemptively against proxy servers using basic
   authentication

  returns: Whether to authenticate preemptively against proxy server. - `boolean`"
  (^Boolean [^ClientConfiguration this]
    (-> this (.isPreemptiveBasicProxyAuth))))

(defn get-signer-override
  "Returns the name of the signature algorithm to use for signing requests made by this client.
   If not set or explicitly set to null, the client will choose a signature algorithm to use
   based on a configuration file of supported signature algorithms for the service and region.

   Most users do not need to concern themselves with which signature algorithm is being used, as
   the defaults will be sufficient. This setting exists only so advanced users can opt in to
   newer signature protocols which have not yet been made the default for a particular
   service/region.

   Not all services support all signature algorithms, and configuring an unsupported signature
   algorithm will lead to authentication failures. Use me at your own risk, and only after
   consulting the documentation for the service to ensure it actually does supports your chosen
   algorithm.

   If non-null, the name returned from this method is used to look up a Signer class
   implementing the chosen algorithm by the com.amazonaws.auth.SignerFactory class.

  returns: The signature algorithm to use for this client, or null to use the default. - `java.lang.String`"
  (^java.lang.String [^ClientConfiguration this]
    (-> this (.getSignerOverride))))

(defn with-max-error-retry
  "Sets the maximum number of retry attempts for failed retryable requests (ex: 5xx error
   responses from services), and returns the updated ClientConfiguration object.

  max-error-retry - The maximum number of retry attempts for failed retryable requests. This value should not be negative. - `int`

  returns: The updated ClientConfiguration object. - `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration [^ClientConfiguration this ^Integer max-error-retry]
    (-> this (.withMaxErrorRetry max-error-retry))))

(defn with-response-metadata-cache-size
  "Sets the response metadata cache size. By default, it is set to
   50.

  response-metadata-cache-size - maximum cache size. - `int`

  returns: The updated ClientConfiguration object. - `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration [^ClientConfiguration this ^Integer response-metadata-cache-size]
    (-> this (.withResponseMetadataCacheSize response-metadata-cache-size))))

(defn set-protocol
  "Sets the protocol (i.e. HTTP or HTTPS) to use when connecting to Amazon Web Services.

   The default configuration is to use HTTPS for all requests for increased security.

   Individual clients can also override this setting by explicitly including the protocol as
   part of the endpoint URL when calling AmazonWebServiceClient.setEndpoint(String).

  protocol - The protocol to use when connecting to Amazon Web Services. - `com.amazonaws.Protocol`"
  ([^ClientConfiguration this ^com.amazonaws.Protocol protocol]
    (-> this (.setProtocol protocol))))

(defn get-retry-policy
  "Returns the retry policy upon failed requests.

  returns: The retry policy upon failed requests. - `com.amazonaws.retry.RetryPolicy`"
  (^com.amazonaws.retry.RetryPolicy [^ClientConfiguration this]
    (-> this (.getRetryPolicy))))

(defn set-local-address
  "Sets the optional local address the client will bind to.

  local-address - The local address the client will bind to. - `java.net.InetAddress`"
  ([^ClientConfiguration this ^java.net.InetAddress local-address]
    (-> this (.setLocalAddress local-address))))

(defn get-proxy-password
  "Returns the optional proxy password to use if connecting
   through a proxy.  Returns either the proxyPassword set on this
   object, or if not provided, checks the value of the Java system
   property for proxy password according to getProtocol():
   i.e. if protocol is https, returns the value of the system
   property https.proxyPassword, otherwise returns value of
   http.proxyPassword. If neither are set, checks the value of the
   environment variable according to getProtocol(): i.e. if
   protocol is https, returns the password in the value of the
   HTTPS_PROXY/https_proxy environment variable, otherwise returns
   the password in the value of the HTTP_PROXY/http_proxy environment
   variable.

  returns: The password to use when connecting through a proxy. - `java.lang.String`"
  (^java.lang.String [^ClientConfiguration this]
    (-> this (.getProxyPassword))))

(defn with-header
  "Adds a header to be added on all requests and returns the ClientConfiguration object

  name - the name of the header - `java.lang.String`
  value - the value of the header - `java.lang.String`

  returns: The updated ClientConfiguration object. - `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration [^ClientConfiguration this ^java.lang.String name ^java.lang.String value]
    (-> this (.withHeader name value))))

(defn get-connection-max-idle-millis
  "Returns the maximum amount of time that an idle connection may sit in the connection pool and
   still be eligible for reuse. When retrieving a connection from the pool to make a request,
   the amount of time the connection has been idle is compared against this value. Connections
   which have been idle for longer are discarded, and if needed a new connection is created.

   Tuning this setting down reduces the likelihood of a race condition (wherein you begin
   sending a request down a connection which appears to be healthy, but before it arrives the
   service decides the connection has been idle for too long and closes it) at the cost of
   having to re-establish new connections more frequently.

  returns: the connection maximum idle time, in milliseconds - `long`"
  (^Long [^ClientConfiguration this]
    (-> this (.getConnectionMaxIdleMillis))))

(defn with-retry-policy
  "Sets the retry policy upon failed requests, and returns the updated ClientConfiguration
   object. User could specify whether the RetryPolicy should honor maxErrorRetry set by
   setMaxErrorRetry(int)

  retry-policy - The retry policy upon failed requests. - `com.amazonaws.retry.RetryPolicy`

  returns: `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration [^ClientConfiguration this ^com.amazonaws.retry.RetryPolicy retry-policy]
    (-> this (.withRetryPolicy retry-policy))))

(defn disable-socket-proxy
  "returns: Whether to disable proxies at the socket level. - `boolean`"
  (^Boolean [^ClientConfiguration this]
    (-> this (.disableSocketProxy))))

(defn get-validate-after-inactivity-millis
  "Returns the amount of time (in milliseconds) that a connection can be idle in the connection pool before it must be
   validated to ensure it's still open. This \"stale connection check\" adds a small bit of overhead to validate the
   connection. Setting this value to larger values may increase the likelihood that the connection is not usable, potentially
   resulting in a NoHttpResponseException. Lowering this setting increases the overhead when leasing
   connections from the connection pool. It is recommended to tune this setting based on how long a service allows a
   connection to be idle before closing.

   A non positive value disables validation of connections.

   The default value is 5000 milliseconds.

  returns: `int`"
  (^Integer [^ClientConfiguration this]
    (-> this (.getValidateAfterInactivityMillis))))

(defn with-connection-ttl
  "Sets the expiration time (in milliseconds) for a connection in the connection pool. When
   retrieving a connection from the pool to make a request, the total time that the connection
   has been open is compared against this value. Connections which have been open for longer are
   discarded, and if needed a new connection is created.

   Tuning this setting down (together with an appropriately-low setting for Java's DNS cache
   TTL) ensures that your application will quickly rotate over to new IP addresses when the
   service begins announcing them through DNS, at the cost of having to re-establish new
   connections more frequently.

   By default, it is set to -1, i.e. connections do not expire.

  connection-ttl - the connection TTL, in milliseconds - `long`

  returns: the updated ClientConfiguration object - `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration [^ClientConfiguration this ^Long connection-ttl]
    (-> this (.withConnectionTTL connection-ttl))))

(defn set-dns-resolver
  "Sets the DNS Resolver that should be used to for resolving AWS IP addresses.

  resolver - `com.amazonaws.DnsResolver`"
  ([^ClientConfiguration this ^com.amazonaws.DnsResolver resolver]
    (-> this (.setDnsResolver resolver))))

(defn set-proxy-protocol
  "Set the Protocol to use for connecting to the proxy.

  proxy-protocol - The protocol. - `com.amazonaws.Protocol`"
  ([^ClientConfiguration this ^com.amazonaws.Protocol proxy-protocol]
    (-> this (.setProxyProtocol proxy-protocol))))

(defn with-gzip
  "Sets whether gzip compression should be used

  use - whether gzip compression should be used - `boolean`

  returns: The updated ClientConfiguration object. - `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration [^ClientConfiguration this ^Boolean use]
    (-> this (.withGzip use))))

(defn with-connection-max-idle-millis
  "Sets the maximum amount of time that an idle connection may sit in the connection pool and
   still be eligible for reuse. When retrieving a connection from the pool to make a request,
   the amount of time the connection has been idle is compared against this value. Connections
   which have been idle for longer are discarded, and if needed a new connection is created.

   Tuning this setting down reduces the likelihood of a race condition (wherein you begin
   sending a request down a connection which appears to be healthy, but before it arrives the
   service decides the connection has been idle for too long and closes it) at the cost of
   having to re-establish new connections more frequently.

   By default, it is set to one minute (60000ms).

  connection-max-idle-millis - the connection maximum idle time, in milliseconds - `long`

  returns: the updated ClientConfiguration object - `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration [^ClientConfiguration this ^Long connection-max-idle-millis]
    (-> this (.withConnectionMaxIdleMillis connection-max-idle-millis))))

(defn use-tcp-keep-alive
  "Returns whether or not TCP KeepAlive support is enabled.

  returns: `boolean`"
  (^Boolean [^ClientConfiguration this]
    (-> this (.useTcpKeepAlive))))

(defn set-use-gzip
  "Sets whether gzip compression should be used

  use - whether gzip compression should be used - `boolean`"
  ([^ClientConfiguration this ^Boolean use]
    (-> this (.setUseGzip use))))

(defn with-proxy-password
  "Sets the optional proxy password to use when connecting through a proxy, and returns the
   updated ClientConfiguration object.

  proxy-password - The password to use when connecting through a proxy. - `java.lang.String`

  returns: The updated ClientConfiguration object. - `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration [^ClientConfiguration this ^java.lang.String proxy-password]
    (-> this (.withProxyPassword proxy-password))))

(defn with-proxy-domain
  "Sets the optional Windows domain name for configuration an NTLM proxy and returns a reference
   to this updated ClientConfiguration object so that additional method calls can be chained
   together. If you aren't using a Windows NTLM proxy, you do not need to set this field.

  proxy-domain - The optional Windows domain name for configuring an NTLM proxy. - `java.lang.String`

  returns: The updated ClientConfiguration object. - `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration [^ClientConfiguration this ^java.lang.String proxy-domain]
    (-> this (.withProxyDomain proxy-domain))))

(defn get-proxy-username
  "Returns the optional proxy user name to use if connecting
   through a proxy.  Returns either the proxyUsername set on this
   object, or if not provided, checks the value of the Java system
   property for proxy user name according to getProtocol():
   i.e. if protocol is https, returns the value of the system
   property https.proxyUser, otherwise returns value of
   http.proxyUser. If neither are set, checks the value of the
   environment variable according to getProtocol(): i.e.
   if protocol is https, returns the user name in the value of the
   HTTPS_PROXY/https_proxy environment variable, otherwise returns
   the user name in the value of the HTTP_PROXY/http_proxy environment
   variable.

  returns: The optional proxy user name the configured client will use if connecting through a
           proxy. - `java.lang.String`"
  (^java.lang.String [^ClientConfiguration this]
    (-> this (.getProxyUsername))))

(defn set-connection-ttl
  "Sets the expiration time (in milliseconds) for a connection in the connection pool. When
   retrieving a connection from the pool to make a request, the total time that the connection
   has been open is compared against this value. Connections which have been open for longer are
   discarded, and if needed a new connection is created.

   Tuning this setting down (together with an appropriately-low setting for Java's DNS cache
   TTL) ensures that your application will quickly rotate over to new IP addresses when the
   service begins announcing them through DNS, at the cost of having to re-establish new
   connections more frequently.

   By default, it is set to {@code -1], i.e. connections do not expire.

  connection-ttl - the connection TTL, in milliseconds - `long`"
  ([^ClientConfiguration this ^Long connection-ttl]
    (-> this (.setConnectionTTL connection-ttl))))

(defn get-headers
  "Returns headers to be added to all requests

  returns: headers to be added to all requests - `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ClientConfiguration this]
    (-> this (.getHeaders))))

