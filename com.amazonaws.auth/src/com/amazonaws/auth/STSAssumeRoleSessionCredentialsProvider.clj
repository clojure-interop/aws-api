(ns com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider
  "AWSCredentialsProvider implementation that uses the AWS Security Token Service to assume a Role
  and create temporary, short-lived sessions to use for authentication.

  This credentials provider uses a background thread to refresh credentials. This background thread can be shut down via the
  close() method when the credentials provider is no longer used."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth STSAssumeRoleSessionCredentialsProvider]))

(defn ->sts-assume-role-session-credentials-provider
  "Constructor.

  Deprecated. Use the STSAssumeRoleSessionCredentialsProvider.Builder instead.

  long-lived-credentials - The main AWS credentials for a user's account. - `com.amazonaws.auth.AWSCredentials`
  role-arn - The ARN of the Role to be assumed. - `java.lang.String`
  role-session-name - An identifier for the assumed role session. - `java.lang.String`
  client-configuration - Client configuration connection parameters. - `com.amazonaws.ClientConfiguration`"
  (^STSAssumeRoleSessionCredentialsProvider [^com.amazonaws.auth.AWSCredentials long-lived-credentials ^java.lang.String role-arn ^java.lang.String role-session-name ^com.amazonaws.ClientConfiguration client-configuration]
    (new STSAssumeRoleSessionCredentialsProvider long-lived-credentials role-arn role-session-name client-configuration))
  (^STSAssumeRoleSessionCredentialsProvider [^com.amazonaws.auth.AWSCredentials long-lived-credentials ^java.lang.String role-arn ^java.lang.String role-session-name]
    (new STSAssumeRoleSessionCredentialsProvider long-lived-credentials role-arn role-session-name))
  (^STSAssumeRoleSessionCredentialsProvider [^java.lang.String role-arn ^java.lang.String role-session-name]
    (new STSAssumeRoleSessionCredentialsProvider role-arn role-session-name)))

(def *-default-duration-seconds
  "Static Constant.

  Default duration for started sessions.

  type: int"
  STSAssumeRoleSessionCredentialsProvider/DEFAULT_DURATION_SECONDS)

(defn set-sts-client-endpoint
  "Deprecated. This method may be removed in a future major version. Create multiple providers
   if you need to work with multiple STS endpoints.

  endpoint - `java.lang.String`"
  ([^STSAssumeRoleSessionCredentialsProvider this ^java.lang.String endpoint]
    (-> this (.setSTSClientEndpoint endpoint))))

(defn get-credentials
  "Description copied from interface: AWSCredentialsProvider

  returns: AWSCredentials which the caller can use to authorize an AWS request. - `com.amazonaws.auth.AWSSessionCredentials`"
  (^com.amazonaws.auth.AWSSessionCredentials [^STSAssumeRoleSessionCredentialsProvider this]
    (-> this (.getCredentials))))

(defn refresh
  "Description copied from interface: AWSCredentialsProvider"
  ([^STSAssumeRoleSessionCredentialsProvider this]
    (-> this (.refresh))))

(defn close
  "Shut down this credentials provider, shutting down the thread that performs asynchronous credential refreshing. This
   should not be invoked if the credentials provider is still in use by an AWS client."
  ([^STSAssumeRoleSessionCredentialsProvider this]
    (-> this (.close))))

