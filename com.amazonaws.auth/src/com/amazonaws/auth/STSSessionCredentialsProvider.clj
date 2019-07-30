(ns com.amazonaws.auth.STSSessionCredentialsProvider
  "AWSCredentialsProvider implementation that uses the AWS Security Token Service to create
  temporary, short-lived sessions to use for authentication.

  This credentials provider uses a background thread to refresh credentials. This background thread can be shut down via the
  close() method when the credentials provider is no longer used."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth STSSessionCredentialsProvider]))

(defn ->sts-session-credentials-provider
  "Constructor.

  Constructs a new STSSessionCredentialsProvider, which will use the specified long lived AWS
   credentials to make a request to the AWS Security Token Service (STS) to request short lived
   session credentials, which will then be returned by this class's getCredentials()
   method.

  long-lived-credentials - The main AWS credentials for a user's account. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration connection parameters. - `com.amazonaws.ClientConfiguration`"
  (^STSSessionCredentialsProvider [^com.amazonaws.auth.AWSCredentials long-lived-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new STSSessionCredentialsProvider long-lived-credentials client-configuration))
  (^STSSessionCredentialsProvider [^com.amazonaws.auth.AWSCredentials long-lived-credentials]
    (new STSSessionCredentialsProvider long-lived-credentials)))

(def *-default-duration-seconds
  "Static Constant.

  Default duration for started sessions

  type: int"
  STSSessionCredentialsProvider/DEFAULT_DURATION_SECONDS)

(defn set-sts-client-endpoint
  "Deprecated. This method may be removed in a future major version. Create multiple providers
   if you need to work with multiple STS endpoints.

  endpoint - `java.lang.String`"
  ([^STSSessionCredentialsProvider this ^java.lang.String endpoint]
    (-> this (.setSTSClientEndpoint endpoint))))

(defn get-credentials
  "Method will return valid session credentials or throw an AmazonClientException due to STS
   service time-out or thread interruption. The first call will block until valid session
   credentials are fetched. Subsequent calls will re-use fetched credentials that are still
   valid. Expiring credentials are automatically refreshed via a background thread. Multiple
   threads may call this method concurrently without causing simultaneous network calls to the
   STS service. Care has been taken to resist Throttling exceptions.

  returns: AWSCredentials which the caller can use to authorize an AWS request. - `com.amazonaws.auth.AWSSessionCredentials`"
  (^com.amazonaws.auth.AWSSessionCredentials [^STSSessionCredentialsProvider this]
    (-> this (.getCredentials))))

(defn refresh
  "Force refresh of session credentials. A decision to use this method should be made
   judiciously since this class automatically manages refreshing expiring credentials limiting
   its usefulness. Calling this method may temporarily cause getCredentials() to block until a
   new session is fetched from the STS service."
  ([^STSSessionCredentialsProvider this]
    (-> this (.refresh))))

(defn close
  "Shut down this credentials provider, shutting down the thread that performs asynchronous credential refreshing. This
   should not be invoked if the credentials provider is still in use by an AWS client."
  ([^STSSessionCredentialsProvider this]
    (-> this (.close))))

