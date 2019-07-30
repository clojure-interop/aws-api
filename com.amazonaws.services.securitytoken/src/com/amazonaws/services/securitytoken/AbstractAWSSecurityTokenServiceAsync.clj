(ns com.amazonaws.services.securitytoken.AbstractAWSSecurityTokenServiceAsync
  "Abstract implementation of AWSSecurityTokenServiceAsync. Convenient method forms pass through to the
  corresponding overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.securitytoken AbstractAWSSecurityTokenServiceAsync]))

(defn assume-role-async
  "Description copied from interface: AWSSecurityTokenServiceAsync

  request - `com.amazonaws.services.securitytoken.model.AssumeRoleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssumeRole operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securitytoken.model.AssumeRoleResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityTokenServiceAsync this ^com.amazonaws.services.securitytoken.model.AssumeRoleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.assumeRoleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityTokenServiceAsync this ^com.amazonaws.services.securitytoken.model.AssumeRoleRequest request]
    (-> this (.assumeRoleAsync request))))

(defn assume-role-with-saml-async
  "Description copied from interface: AWSSecurityTokenServiceAsync

  request - `com.amazonaws.services.securitytoken.model.AssumeRoleWithSAMLRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssumeRoleWithSAML operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securitytoken.model.AssumeRoleWithSAMLResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityTokenServiceAsync this ^com.amazonaws.services.securitytoken.model.AssumeRoleWithSAMLRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.assumeRoleWithSAMLAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityTokenServiceAsync this ^com.amazonaws.services.securitytoken.model.AssumeRoleWithSAMLRequest request]
    (-> this (.assumeRoleWithSAMLAsync request))))

(defn assume-role-with-web-identity-async
  "Description copied from interface: AWSSecurityTokenServiceAsync

  request - `com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssumeRoleWithWebIdentity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityTokenServiceAsync this ^com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.assumeRoleWithWebIdentityAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityTokenServiceAsync this ^com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityRequest request]
    (-> this (.assumeRoleWithWebIdentityAsync request))))

(defn decode-authorization-message-async
  "Description copied from interface: AWSSecurityTokenServiceAsync

  request - `com.amazonaws.services.securitytoken.model.DecodeAuthorizationMessageRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DecodeAuthorizationMessage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securitytoken.model.DecodeAuthorizationMessageResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityTokenServiceAsync this ^com.amazonaws.services.securitytoken.model.DecodeAuthorizationMessageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.decodeAuthorizationMessageAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityTokenServiceAsync this ^com.amazonaws.services.securitytoken.model.DecodeAuthorizationMessageRequest request]
    (-> this (.decodeAuthorizationMessageAsync request))))

(defn get-access-key-info-async
  "Description copied from interface: AWSSecurityTokenServiceAsync

  request - `com.amazonaws.services.securitytoken.model.GetAccessKeyInfoRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAccessKeyInfo operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securitytoken.model.GetAccessKeyInfoResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityTokenServiceAsync this ^com.amazonaws.services.securitytoken.model.GetAccessKeyInfoRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAccessKeyInfoAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityTokenServiceAsync this ^com.amazonaws.services.securitytoken.model.GetAccessKeyInfoRequest request]
    (-> this (.getAccessKeyInfoAsync request))))

(defn get-caller-identity-async
  "Description copied from interface: AWSSecurityTokenServiceAsync

  request - `com.amazonaws.services.securitytoken.model.GetCallerIdentityRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCallerIdentity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securitytoken.model.GetCallerIdentityResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityTokenServiceAsync this ^com.amazonaws.services.securitytoken.model.GetCallerIdentityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCallerIdentityAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityTokenServiceAsync this ^com.amazonaws.services.securitytoken.model.GetCallerIdentityRequest request]
    (-> this (.getCallerIdentityAsync request))))

(defn get-federation-token-async
  "Description copied from interface: AWSSecurityTokenServiceAsync

  request - `com.amazonaws.services.securitytoken.model.GetFederationTokenRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFederationToken operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securitytoken.model.GetFederationTokenResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityTokenServiceAsync this ^com.amazonaws.services.securitytoken.model.GetFederationTokenRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFederationTokenAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityTokenServiceAsync this ^com.amazonaws.services.securitytoken.model.GetFederationTokenRequest request]
    (-> this (.getFederationTokenAsync request))))

(defn get-session-token-async
  "Description copied from interface: AWSSecurityTokenServiceAsync

  request - `com.amazonaws.services.securitytoken.model.GetSessionTokenRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSessionToken operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securitytoken.model.GetSessionTokenResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityTokenServiceAsync this ^com.amazonaws.services.securitytoken.model.GetSessionTokenRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSessionTokenAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityTokenServiceAsync this ^com.amazonaws.services.securitytoken.model.GetSessionTokenRequest request]
    (-> this (.getSessionTokenAsync request)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityTokenServiceAsync this]
    (-> this (.getSessionTokenAsync))))

