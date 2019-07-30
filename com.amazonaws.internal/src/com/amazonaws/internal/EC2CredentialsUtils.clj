(ns com.amazonaws.internal.EC2CredentialsUtils
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.internal EC2CredentialsUtils]))

(defn *get-instance
  "returns: `com.amazonaws.internal.EC2CredentialsUtils`"
  (^com.amazonaws.internal.EC2CredentialsUtils []
    (EC2CredentialsUtils/getInstance )))

(defn read-resource
  "Connects to the given endpoint to read the resource
   and returns the text contents.

  endpoint - The service endpoint to connect to. - `java.net.URI`
  retry-policy - The custom retry policy that determines whether a failed request should be retried or not. - `com.amazonaws.retry.internal.CredentialsEndpointRetryPolicy`
  headers - `java.util.Map`

  returns: The text payload returned from the Amazon EC2 endpoint
           service for the specified resource path. - `java.lang.String`

  throws: java.io.IOException - If any problems were encountered while connecting to the service for the requested resource path."
  (^java.lang.String [^EC2CredentialsUtils this ^java.net.URI endpoint ^com.amazonaws.retry.internal.CredentialsEndpointRetryPolicy retry-policy ^java.util.Map headers]
    (-> this (.readResource endpoint retry-policy headers)))
  (^java.lang.String [^EC2CredentialsUtils this ^java.net.URI endpoint]
    (-> this (.readResource endpoint))))

