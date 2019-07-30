(ns com.amazonaws.services.kinesisvideo.AmazonKinesisVideoPutMediaClientBuilder
  "Fluent builder for AmazonKinesisVideoPutMedia. An instance of this builder may be obtained via AmazonKinesisVideoPutMediaClient.builder() or via standard()."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kinesisvideo AmazonKinesisVideoPutMediaClientBuilder]))

(defn *standard
  "returns: A new instance of builder with all defaults set. - `com.amazonaws.services.kinesisvideo.AmazonKinesisVideoPutMediaClientBuilder`"
  (^com.amazonaws.services.kinesisvideo.AmazonKinesisVideoPutMediaClientBuilder []
    (AmazonKinesisVideoPutMediaClientBuilder/standard )))

(defn get-number-of-threads
  "returns: The currently configured number of threads for the async event loop. - `java.lang.Integer`"
  (^java.lang.Integer [^AmazonKinesisVideoPutMediaClientBuilder this]
    (-> this (.getNumberOfThreads))))

(defn set-region
  "Sets the signing region to be used by the client. This region will NOT be used to compute the endpoint, the endpoint
   must be explicitly provided via the setEndpoint(URI) or withEndpoint(URI) methods.

  region - Region to sign with. - `java.lang.String`"
  ([^AmazonKinesisVideoPutMediaClientBuilder this ^java.lang.String region]
    (-> this (.setRegion region))))

(defn get-connection-timeout-in-millis
  "returns: The currently configured connection timeout in milliseconds. - `java.lang.Integer`"
  (^java.lang.Integer [^AmazonKinesisVideoPutMediaClientBuilder this]
    (-> this (.getConnectionTimeoutInMillis))))

(defn set-number-of-threads
  "Sets the number of threads to use in the async event loop. Higher values allow for higher
   numbers of concurrent requests.

  number-of-threads - Number of threads to use in the event loop. - `java.lang.Integer`"
  ([^AmazonKinesisVideoPutMediaClientBuilder this ^java.lang.Integer number-of-threads]
    (-> this (.setNumberOfThreads number-of-threads))))

(defn with-region
  "Sets the signing region to be used by the client. This region will NOT be used to compute the endpoint, the endpoint
   must be explicitly provided via the setEndpoint(URI) or withEndpoint(URI) methods.

  region - Region to sign with. - `java.lang.String`

  returns: This object for method chaining. - `com.amazonaws.services.kinesisvideo.AmazonKinesisVideoPutMediaClientBuilder`"
  (^com.amazonaws.services.kinesisvideo.AmazonKinesisVideoPutMediaClientBuilder [^AmazonKinesisVideoPutMediaClientBuilder this ^java.lang.String region]
    (-> this (.withRegion region))))

(defn with-number-of-threads
  "Sets the number of threads to use in the async event loop. Higher values allow for higher
   numbers of concurrent requests.

  number-of-threads - Number of threads to use in the event loop. - `java.lang.Integer`

  returns: This object for method chaining. - `com.amazonaws.services.kinesisvideo.AmazonKinesisVideoPutMediaClientBuilder`"
  (^com.amazonaws.services.kinesisvideo.AmazonKinesisVideoPutMediaClientBuilder [^AmazonKinesisVideoPutMediaClientBuilder this ^java.lang.Integer number-of-threads]
    (-> this (.withNumberOfThreads number-of-threads))))

(defn with-credentials
  "Sets the AWSCredentialsProvider used by the client. If not specified then DefaultAWSCredentialsProviderChain is used.

  credentials-provider - New AWSCredentialsProvider to use. - `com.amazonaws.auth.AWSCredentialsProvider`

  returns: This object for method chaining. - `com.amazonaws.services.kinesisvideo.AmazonKinesisVideoPutMediaClientBuilder`"
  (^com.amazonaws.services.kinesisvideo.AmazonKinesisVideoPutMediaClientBuilder [^AmazonKinesisVideoPutMediaClientBuilder this ^com.amazonaws.auth.AWSCredentialsProvider credentials-provider]
    (-> this (.withCredentials credentials-provider))))

(defn build
  "returns: `com.amazonaws.services.kinesisvideo.AmazonKinesisVideoPutMedia`"
  (^com.amazonaws.services.kinesisvideo.AmazonKinesisVideoPutMedia [^AmazonKinesisVideoPutMediaClientBuilder this]
    (-> this (.build))))

(defn set-endpoint
  "Sets the endpoint to make requests against.

  endpoint - Endpoint to use. - `java.net.URI`"
  ([^AmazonKinesisVideoPutMediaClientBuilder this ^java.net.URI endpoint]
    (-> this (.setEndpoint endpoint))))

(defn with-endpoint
  "Sets the endpoint to make requests against.

  endpoint - Endpoint to use. - `java.net.URI`

  returns: This object for method chaining. - `com.amazonaws.services.kinesisvideo.AmazonKinesisVideoPutMediaClientBuilder`"
  (^com.amazonaws.services.kinesisvideo.AmazonKinesisVideoPutMediaClientBuilder [^AmazonKinesisVideoPutMediaClientBuilder this ^java.net.URI endpoint]
    (-> this (.withEndpoint endpoint))))

(defn with-connection-timeout-in-millis
  "Sets the timeout (in milliseconds) when establishing new connections to the service. The default if not specified is
    milliseconds.

  connection-timeout-in-millis - New connection timeout value in milliseconds. - `java.lang.Integer`

  returns: This object for method chaining. - `com.amazonaws.services.kinesisvideo.AmazonKinesisVideoPutMediaClientBuilder`"
  (^com.amazonaws.services.kinesisvideo.AmazonKinesisVideoPutMediaClientBuilder [^AmazonKinesisVideoPutMediaClientBuilder this ^java.lang.Integer connection-timeout-in-millis]
    (-> this (.withConnectionTimeoutInMillis connection-timeout-in-millis))))

(defn get-endpoint
  "returns: The currently configured endpoint used to contact the service. - `java.net.URI`"
  (^java.net.URI [^AmazonKinesisVideoPutMediaClientBuilder this]
    (-> this (.getEndpoint))))

(defn set-credentials
  "Sets the AWSCredentialsProvider used by the client. If not specified then DefaultAWSCredentialsProviderChain is used.

  credentials-provider - New AWSCredentialsProvider to use. - `com.amazonaws.auth.AWSCredentialsProvider`"
  ([^AmazonKinesisVideoPutMediaClientBuilder this ^com.amazonaws.auth.AWSCredentialsProvider credentials-provider]
    (-> this (.setCredentials credentials-provider))))

(defn set-connection-timeout-in-millis
  "Sets the timeout (in milliseconds) when establishing new connections to the service. The default if not specified is
    milliseconds.

  connection-timeout-in-millis - New connection timeout value in milliseconds. - `java.lang.Integer`"
  ([^AmazonKinesisVideoPutMediaClientBuilder this ^java.lang.Integer connection-timeout-in-millis]
    (-> this (.setConnectionTimeoutInMillis connection-timeout-in-millis))))

(defn get-credentials
  "returns: The AWSCredentialsProvider currently configured in the builder. - `com.amazonaws.auth.AWSCredentialsProvider`"
  (^com.amazonaws.auth.AWSCredentialsProvider [^AmazonKinesisVideoPutMediaClientBuilder this]
    (-> this (.getCredentials))))

(defn get-region
  "returns: The region currently configured in the builder. - `java.lang.String`"
  (^java.lang.String [^AmazonKinesisVideoPutMediaClientBuilder this]
    (-> this (.getRegion))))

