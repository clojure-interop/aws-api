(ns com.amazonaws.auth.AWS4Signer
  "Signer implementation that signs requests with the AWS4 signing protocol."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth AWS4Signer]))

(defn ->aws-4-signer
  "Constructor.

  Construct a new AWS4 signer instance.

  double-url-encoding - Whether double url-encode the resource path when constructing the canonical request. - `boolean`"
  (^AWS4Signer [^Boolean double-url-encoding]
    (new AWS4Signer double-url-encoding))
  (^AWS4Signer []
    (new AWS4Signer )))

(defn set-endpoint-prefix
  "Sets the endpoint prefix which is used to compute the region that is
   used for signing the request.

   This value is passed to AWS4SignerRequestParams class which
   has the logic to compute region.

  endpoint-prefix - The endpoint prefix of the service - `java.lang.String`"
  ([^AWS4Signer this ^java.lang.String endpoint-prefix]
    (-> this (.setEndpointPrefix endpoint-prefix))))

(defn presign-request
  "Description copied from interface: Presigner

  request - The request to sign. - `com.amazonaws.SignableRequest`
  credentials - The credentials to sign it with. - `com.amazonaws.auth.AWSCredentials`
  user-specified-expiration-date - The time when this presigned URL will expire. - `java.util.Date`"
  ([^AWS4Signer this ^com.amazonaws.SignableRequest request ^com.amazonaws.auth.AWSCredentials credentials ^java.util.Date user-specified-expiration-date]
    (-> this (.presignRequest request credentials user-specified-expiration-date))))

(defn set-override-date
  "Sets the date that overrides the signing date in the request. This method
   is internal and should be used only for testing purposes.

  overridden-date - `java.util.Date`"
  ([^AWS4Signer this ^java.util.Date overridden-date]
    (-> this (.setOverrideDate overridden-date))))

(defn get-service-name
  "Returns the service name that is used when calculating the signature.

  returns: `java.lang.String`"
  (^java.lang.String [^AWS4Signer this]
    (-> this (.getServiceName))))

(defn get-region-name
  "Returns the region name that is used when calculating the signature.

  returns: `java.lang.String`"
  (^java.lang.String [^AWS4Signer this]
    (-> this (.getRegionName))))

(defn set-region-name
  "Sets the region name that this signer should use when calculating request
   signatures. This can almost always be determined directly from the
   request's end point, so you shouldn't need this method, but it's provided
   for the edge case where the information is not in the endpoint.

  region-name - The region name to use when calculating signatures in this signer. - `java.lang.String`"
  ([^AWS4Signer this ^java.lang.String region-name]
    (-> this (.setRegionName region-name))))

(defn set-service-name
  "Sets the service name that this signer should use when calculating
   request signatures. This can almost always be determined directly from
   the request's end point, so you shouldn't need this method, but it's
   provided for the edge case where the information is not in the endpoint.

  service-name - The service name to use when calculating signatures in this signer. - `java.lang.String`"
  ([^AWS4Signer this ^java.lang.String service-name]
    (-> this (.setServiceName service-name))))

(defn get-overridden-date
  "Returns a copy of date that overrides the signing date in the request.
   Return null by default.

  returns: `java.util.Date`"
  (^java.util.Date [^AWS4Signer this]
    (-> this (.getOverriddenDate))))

(defn sign
  "Description copied from interface: Signer

  request - The request to sign. - `com.amazonaws.SignableRequest`
  credentials - The credentials to sign the request with. - `com.amazonaws.auth.AWSCredentials`"
  ([^AWS4Signer this ^com.amazonaws.SignableRequest request ^com.amazonaws.auth.AWSCredentials credentials]
    (-> this (.sign request credentials))))

