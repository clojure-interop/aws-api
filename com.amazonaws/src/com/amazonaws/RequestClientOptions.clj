(ns com.amazonaws.RequestClientOptions
  "Client request options such as client markers for individual
  AmazonWebServiceRequests."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws RequestClientOptions]))

(defn ->request-client-options
  "Constructor."
  (^RequestClientOptions []
    (new RequestClientOptions )))

(def *-default-stream-buffer-size
  "Static Constant.

  Used to enable mark-and-reset for
   non-mark-and-resettable non-file input stream for up to 128K memory
   buffering by default. Add 1 to get around an implementation quirk of
   BufferedInputStream.

   Retries after reading DEFAULT_STREAM_BUFFER_SIZE bytes would
   fail to reset the underlying input stream as the mark position would
   have been invalidated.

  type: int"
  RequestClientOptions/DEFAULT_STREAM_BUFFER_SIZE)

(defn get-client-marker
  "Returns the value of the specified marker; or null if there is no such
   value.

  marker - `com.amazonaws.RequestClientOptions$Marker`

  returns: `java.lang.String`"
  (^java.lang.String [^RequestClientOptions this ^com.amazonaws.RequestClientOptions$Marker marker]
    (-> this (.getClientMarker marker))))

(defn put-client-marker
  "Associates the given value with the given marker.
   Note the RequestClientOptions.Marker.USER_AGENT is only intended for internal use
   by the AWS SDK.

  marker - `com.amazonaws.RequestClientOptions$Marker`
  value - `java.lang.String`"
  ([^RequestClientOptions this ^com.amazonaws.RequestClientOptions$Marker marker ^java.lang.String value]
    (-> this (.putClientMarker marker value))))

(defn append-user-agent
  "Appends a user agent to the USER_AGENT client marker.
   This method is intended only for internal use by the AWS SDK.

  user-agent - `java.lang.String`"
  ([^RequestClientOptions this ^java.lang.String user-agent]
    (-> this (.appendUserAgent user-agent))))

(defn get-read-limit
  "Returns the mark-and-reset read limit; defaults to
   131073.

  returns: `int`"
  (^Integer [^RequestClientOptions this]
    (-> this (.getReadLimit))))

(defn set-read-limit
  "Sets the optional mark-and-reset read limit used for signing and retry
   purposes.

  read-limit - `int`"
  ([^RequestClientOptions this ^Integer read-limit]
    (-> this (.setReadLimit read-limit))))

(defn skip-append-uri-path?
  "Gets the boolean value to skip the appendUri call in ApacheHttpRequestFactory.create(Request, HttpClientSettings)
   method. The default value is false, which means the appendUri call is not skipped.

   This options is used in APIs that directly execute given presigned urls. For these requests, the extra slash
   should not be included.

  returns: `boolean`"
  (^Boolean [^RequestClientOptions this]
    (-> this (.isSkipAppendUriPath))))

(defn set-skip-append-uri-path
  "Sets the boolean value to skip the appendUri call in ApacheHttpRequestFactory.create(Request, HttpClientSettings)
   method. The default value is false, which means the appendUri call is not skipped.

   This options is used in APIs that directly execute given presigned urls. For these requests, the extra slash
   should not be included.

  skip-append-uri-path - `boolean`"
  ([^RequestClientOptions this ^Boolean skip-append-uri-path]
    (-> this (.setSkipAppendUriPath skip-append-uri-path))))

