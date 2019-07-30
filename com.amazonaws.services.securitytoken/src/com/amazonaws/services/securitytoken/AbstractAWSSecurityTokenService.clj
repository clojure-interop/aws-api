(ns com.amazonaws.services.securitytoken.AbstractAWSSecurityTokenService
  "Abstract implementation of AWSSecurityTokenService. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.securitytoken AbstractAWSSecurityTokenService]))

(defn set-region
  "Description copied from interface: AWSSecurityTokenService

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAWSSecurityTokenService this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn get-session-token
  "Description copied from interface: AWSSecurityTokenService

  request - `com.amazonaws.services.securitytoken.model.GetSessionTokenRequest`

  returns: Result of the GetSessionToken operation returned by the service. - `com.amazonaws.services.securitytoken.model.GetSessionTokenResult`"
  (^com.amazonaws.services.securitytoken.model.GetSessionTokenResult [^AbstractAWSSecurityTokenService this ^com.amazonaws.services.securitytoken.model.GetSessionTokenRequest request]
    (-> this (.getSessionToken request)))
  (^com.amazonaws.services.securitytoken.model.GetSessionTokenResult [^AbstractAWSSecurityTokenService this]
    (-> this (.getSessionToken))))

(defn get-access-key-info
  "Description copied from interface: AWSSecurityTokenService

  request - `com.amazonaws.services.securitytoken.model.GetAccessKeyInfoRequest`

  returns: Result of the GetAccessKeyInfo operation returned by the service. - `com.amazonaws.services.securitytoken.model.GetAccessKeyInfoResult`"
  (^com.amazonaws.services.securitytoken.model.GetAccessKeyInfoResult [^AbstractAWSSecurityTokenService this ^com.amazonaws.services.securitytoken.model.GetAccessKeyInfoRequest request]
    (-> this (.getAccessKeyInfo request))))

(defn get-caller-identity
  "Description copied from interface: AWSSecurityTokenService

  request - `com.amazonaws.services.securitytoken.model.GetCallerIdentityRequest`

  returns: Result of the GetCallerIdentity operation returned by the service. - `com.amazonaws.services.securitytoken.model.GetCallerIdentityResult`"
  (^com.amazonaws.services.securitytoken.model.GetCallerIdentityResult [^AbstractAWSSecurityTokenService this ^com.amazonaws.services.securitytoken.model.GetCallerIdentityRequest request]
    (-> this (.getCallerIdentity request))))

(defn assume-role-with-saml
  "Description copied from interface: AWSSecurityTokenService

  request - `com.amazonaws.services.securitytoken.model.AssumeRoleWithSAMLRequest`

  returns: Result of the AssumeRoleWithSAML operation returned by the service. - `com.amazonaws.services.securitytoken.model.AssumeRoleWithSAMLResult`"
  (^com.amazonaws.services.securitytoken.model.AssumeRoleWithSAMLResult [^AbstractAWSSecurityTokenService this ^com.amazonaws.services.securitytoken.model.AssumeRoleWithSAMLRequest request]
    (-> this (.assumeRoleWithSAML request))))

(defn assume-role-with-web-identity
  "Description copied from interface: AWSSecurityTokenService

  request - `com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityRequest`

  returns: Result of the AssumeRoleWithWebIdentity operation returned by the service. - `com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityResult`"
  (^com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityResult [^AbstractAWSSecurityTokenService this ^com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityRequest request]
    (-> this (.assumeRoleWithWebIdentity request))))

(defn assume-role
  "Description copied from interface: AWSSecurityTokenService

  request - `com.amazonaws.services.securitytoken.model.AssumeRoleRequest`

  returns: Result of the AssumeRole operation returned by the service. - `com.amazonaws.services.securitytoken.model.AssumeRoleResult`"
  (^com.amazonaws.services.securitytoken.model.AssumeRoleResult [^AbstractAWSSecurityTokenService this ^com.amazonaws.services.securitytoken.model.AssumeRoleRequest request]
    (-> this (.assumeRole request))))

(defn shutdown
  "Description copied from interface: AWSSecurityTokenService"
  ([^AbstractAWSSecurityTokenService this]
    (-> this (.shutdown))))

(defn decode-authorization-message
  "Description copied from interface: AWSSecurityTokenService

  request - `com.amazonaws.services.securitytoken.model.DecodeAuthorizationMessageRequest`

  returns: Result of the DecodeAuthorizationMessage operation returned by the service. - `com.amazonaws.services.securitytoken.model.DecodeAuthorizationMessageResult`"
  (^com.amazonaws.services.securitytoken.model.DecodeAuthorizationMessageResult [^AbstractAWSSecurityTokenService this ^com.amazonaws.services.securitytoken.model.DecodeAuthorizationMessageRequest request]
    (-> this (.decodeAuthorizationMessage request))))

(defn set-endpoint
  "Description copied from interface: AWSSecurityTokenService

  endpoint - The endpoint (ex: \"sts.amazonaws.com\") or a full URL, including the protocol (ex: \"sts.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAWSSecurityTokenService this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSSecurityTokenService

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSSecurityTokenService this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-federation-token
  "Description copied from interface: AWSSecurityTokenService

  request - `com.amazonaws.services.securitytoken.model.GetFederationTokenRequest`

  returns: Result of the GetFederationToken operation returned by the service. - `com.amazonaws.services.securitytoken.model.GetFederationTokenResult`"
  (^com.amazonaws.services.securitytoken.model.GetFederationTokenResult [^AbstractAWSSecurityTokenService this ^com.amazonaws.services.securitytoken.model.GetFederationTokenRequest request]
    (-> this (.getFederationToken request))))

