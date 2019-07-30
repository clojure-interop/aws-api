(ns com.amazonaws.auth.WebIdentityFederationSessionCredentialsProvider
  "AWSCredentialsProvider implementation that uses the AWS Security Token
  Service to create temporary, short-lived sessions to use for authentication."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth WebIdentityFederationSessionCredentialsProvider]))

(defn ->web-identity-federation-session-credentials-provider
  "Constructor.

  Constructs a new WebIdentityFederationSessionCredentialsProvider, which will use the
   specified 3rd-party web identity provider to make a request to the AWS
   Security Token Service (STS) to request short lived session credentials,
   which will then be returned by this class's getCredentials()
   method.

  wif-token - The OAuth/OpenID token from the the Identity Provider - `java.lang.String`
  wif-provider - The name of the Identity Provider (null for OpenID providers) - `java.lang.String`
  role-arn - The ARN of the IAM Role that will be assumed - `java.lang.String`
  client-configuration - `com.amazonaws.ClientConfiguration`"
  (^WebIdentityFederationSessionCredentialsProvider [^java.lang.String wif-token ^java.lang.String wif-provider ^java.lang.String role-arn ^com.amazonaws.ClientConfiguration client-configuration]
    (new WebIdentityFederationSessionCredentialsProvider wif-token wif-provider role-arn client-configuration))
  (^WebIdentityFederationSessionCredentialsProvider [^java.lang.String wif-token ^java.lang.String wif-provider ^java.lang.String role-arn]
    (new WebIdentityFederationSessionCredentialsProvider wif-token wif-provider role-arn)))

(def *-default-duration-seconds
  "Static Constant.

  Default duration for started sessions

  type: int"
  WebIdentityFederationSessionCredentialsProvider/DEFAULT_DURATION_SECONDS)

(def *-default-threshold-seconds
  "Static Constant.

  Default threshold for refreshing session credentials

  type: int"
  WebIdentityFederationSessionCredentialsProvider/DEFAULT_THRESHOLD_SECONDS)

(defn set-session-duration
  "Set the duration of the session credentials created by this client in
   seconds. Values must be supported by AssumeRoleWithWebIdentityRequest.

  session-duration - The new duration for session credentials created by this provider - `int`"
  ([^WebIdentityFederationSessionCredentialsProvider this ^Integer session-duration]
    (-> this (.setSessionDuration session-duration))))

(defn with-refresh-threshold
  "Set the refresh threshold for the session credentials created by this client in
   seconds. This value will be used internally to determine if new
   credentials should be fetched from STS. Returns a refrence to the object
   so methods can be chained.

  refresh-threshold - The new refresh threshold for session credentials created by this provider - `int`

  returns: A reference to this updated object so that method calls
            can be chained together. - `com.amazonaws.auth.WebIdentityFederationSessionCredentialsProvider`"
  (^com.amazonaws.auth.WebIdentityFederationSessionCredentialsProvider [^WebIdentityFederationSessionCredentialsProvider this ^Integer refresh-threshold]
    (-> this (.withRefreshThreshold refresh-threshold))))

(defn with-session-duration
  "Set the duration of the session credentials created by this client in
   seconds. Values must be supported by AssumeRoleWithWebIdentityRequest.
   Returns refreence to object so methods can be chained together.

  session-duration - The new duration for session credentials created by this provider - `int`

  returns: A reference to this updated object so that method calls
            can be chained together. - `com.amazonaws.auth.WebIdentityFederationSessionCredentialsProvider`"
  (^com.amazonaws.auth.WebIdentityFederationSessionCredentialsProvider [^WebIdentityFederationSessionCredentialsProvider this ^Integer session-duration]
    (-> this (.withSessionDuration session-duration))))

(defn refresh
  "Description copied from interface: AWSCredentialsProvider"
  ([^WebIdentityFederationSessionCredentialsProvider this]
    (-> this (.refresh))))

(defn get-subject-from-wif
  "Get the identifier returned from the Identity Provider for the
   authenticated user.  This value is returned as part of the
   AssumeRoleWithIdentityResult

  returns: The identifier returned from Identity Provider - `java.lang.String`"
  (^java.lang.String [^WebIdentityFederationSessionCredentialsProvider this]
    (-> this (.getSubjectFromWIF))))

(defn get-session-duration
  "Get the duration of the session credentials created by this client in
   seconds. Values must be supported by AssumeRoleWithWebIdentityRequest.

  returns: The duration for session credentials created by this provider - `int`"
  (^Integer [^WebIdentityFederationSessionCredentialsProvider this]
    (-> this (.getSessionDuration))))

(defn get-refresh-threshold
  "Get the refresh threshold for the session credentials created by this client in
   seconds. This value will be used internally to determine if new
   credentials should be fetched from STS.

  returns: The refresh threshold for session credentials created by this provider - `int`"
  (^Integer [^WebIdentityFederationSessionCredentialsProvider this]
    (-> this (.getRefreshThreshold))))

(defn set-refresh-threshold
  "Set the refresh threshold for the session credentials created by this client in
   seconds. This value will be used internally to determine if new
   credentials should be fetched from STS.

  refresh-threshold - The new refresh threshold for session credentials created by this provider - `int`"
  ([^WebIdentityFederationSessionCredentialsProvider this ^Integer refresh-threshold]
    (-> this (.setRefreshThreshold refresh-threshold))))

(defn get-credentials
  "Description copied from interface: AWSCredentialsProvider

  returns: AWSCredentials which the caller can use to authorize an AWS request. - `com.amazonaws.auth.AWSSessionCredentials`"
  (^com.amazonaws.auth.AWSSessionCredentials [^WebIdentityFederationSessionCredentialsProvider this]
    (-> this (.getCredentials))))

