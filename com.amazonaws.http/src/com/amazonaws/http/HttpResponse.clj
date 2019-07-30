(ns com.amazonaws.http.HttpResponse
  "Represents an HTTP response returned by an AWS service in response to a
  service request."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.http HttpResponse]))

(defn ->http-response
  "Constructor.

  Constructs a new HttpResponse associated with the specified request.

  request - The associated request that generated this response. - `com.amazonaws.Request`
  http-request - The underlying http request that generated this response. - `org.apache.http.client.methods.HttpRequestBase`

  throws: java.io.IOException"
  (^HttpResponse [^com.amazonaws.Request request ^org.apache.http.client.methods.HttpRequestBase http-request]
    (new HttpResponse request http-request))
  (^HttpResponse [^com.amazonaws.Request request ^org.apache.http.client.methods.HttpRequestBase http-request ^org.apache.http.protocol.HttpContext context]
    (new HttpResponse request http-request context)))

(defn get-status-text
  "Returns the HTTP status text associated with this response.

  returns: The HTTP status text associated with this response. - `java.lang.String`"
  (^java.lang.String [^HttpResponse this]
    (-> this (.getStatusText))))

(defn set-status-code
  "Sets the HTTP status code that was returned with this response.

  status-code - The HTTP status code (ex: 200, 404, etc) associated with this response. - `int`"
  ([^HttpResponse this ^Integer status-code]
    (-> this (.setStatusCode status-code))))

(defn get-request
  "Returns the original request associated with this response.

  returns: The original request associated with this response. - `com.amazonaws.Request<?>`"
  (^com.amazonaws.Request [^HttpResponse this]
    (-> this (.getRequest))))

(defn get-crc-32-checksum
  "Returns the CRC32 checksum calculated by the underlying CRC32ChecksumCalculatingInputStream.

  returns: The CRC32 checksum. - `long`"
  (^Long [^HttpResponse this]
    (-> this (.getCRC32Checksum))))

(defn add-header
  "Adds an HTTP header to the set associated with this response.

  name - The name of the HTTP header. - `java.lang.String`
  value - The value of the HTTP header. - `java.lang.String`"
  ([^HttpResponse this ^java.lang.String name ^java.lang.String value]
    (-> this (.addHeader name value))))

(defn get-header
  "Looks up a header by name and returns its value. Does case insensitive comparison.

  header-name - Name of header to get value for. - `java.lang.String`

  returns: The header value of the given header. Null if header is not present. - `java.lang.String`"
  (^java.lang.String [^HttpResponse this ^java.lang.String header-name]
    (-> this (.getHeader header-name))))

(defn get-http-request
  "Returns the original http request associated with this response.

  returns: The original http request associated with this response. - `org.apache.http.client.methods.HttpRequestBase`"
  (^org.apache.http.client.methods.HttpRequestBase [^HttpResponse this]
    (-> this (.getHttpRequest))))

(defn get-status-code
  "Returns the HTTP status code (ex: 200, 404, etc) associated with this
   response.

  returns: The HTTP status code associated with this response. - `int`"
  (^Integer [^HttpResponse this]
    (-> this (.getStatusCode))))

(defn set-status-text
  "Sets the HTTP status text returned with this response.

  status-text - The HTTP status text (ex: \"Not found\") returned with this response. - `java.lang.String`"
  ([^HttpResponse this ^java.lang.String status-text]
    (-> this (.setStatusText status-text))))

(defn set-content
  "Sets the input stream containing the response content.

  content - The input stream containing the response content. - `java.io.InputStream`"
  ([^HttpResponse this ^java.io.InputStream content]
    (-> this (.setContent content))))

(defn get-headers
  "Returns the HTTP headers returned with this response.

  returns: The set of HTTP headers returned with this HTTP response. - `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^HttpResponse this]
    (-> this (.getHeaders))))

(defn get-content
  "Returns the input stream containing the response content.

  returns: The input stream containing the response content. - `java.io.InputStream`"
  (^java.io.InputStream [^HttpResponse this]
    (-> this (.getContent))))

