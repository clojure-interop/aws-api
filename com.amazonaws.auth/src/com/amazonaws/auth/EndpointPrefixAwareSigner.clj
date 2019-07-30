(ns com.amazonaws.auth.EndpointPrefixAwareSigner
  "A signer that knows the endpoint prefix of the AWS service.

  For example,
  s3 is the endpoint prefix for Amazon S3 service.
  iot is the endpoint prefix for AWS Iot service.

  The endpoint prefix will be used to compute the region to use
  for signing if it is not already computed."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth EndpointPrefixAwareSigner]))

(defn set-endpoint-prefix
  "Configure the signer with the endpoint prefix
   of the service it is talking to.

  value - The endpoint prefix of the service - `java.lang.String`"
  ([^EndpointPrefixAwareSigner this ^java.lang.String value]
    (-> this (.setEndpointPrefix value))))

