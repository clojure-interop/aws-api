(ns com.amazonaws.internal.CredentialsEndpointProvider
  " Abstract class to return an endpoint URI from which the credentials can be loaded.


  By default, the request won't be retried if the request fails while computing endpoint."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.internal CredentialsEndpointProvider]))

(defn ->credentials-endpoint-provider
  "Constructor."
  (^CredentialsEndpointProvider []
    (new CredentialsEndpointProvider )))

(defn get-credentials-endpoint
  "Returns the URI that contains the credentials.

  returns: URI to retrieve the credentials. - `java.net.URI`

  throws: java.net.URISyntaxException - If the endpoint string could not be parsed as a URI reference."
  (^java.net.URI [^CredentialsEndpointProvider this]
    (-> this (.getCredentialsEndpoint))))

(defn get-retry-policy
  "Allows the extending class to provide a custom retry policy.
   The default behavior is not to retry.

  returns: `com.amazonaws.retry.internal.CredentialsEndpointRetryPolicy`"
  (^com.amazonaws.retry.internal.CredentialsEndpointRetryPolicy [^CredentialsEndpointProvider this]
    (-> this (.getRetryPolicy))))

(defn get-headers
  "Allows passing additional headers to the request

  returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^CredentialsEndpointProvider this]
    (-> this (.getHeaders))))

