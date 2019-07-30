(ns com.amazonaws.auth.ProcessCredentialsProvider
  "A credentials provider that can load credentials from an external process. This is used to support the credential_process
  setting in the profile credentials file. See
  https://docs.aws.amazon.com/cli/latest/topic/config-vars.html#sourcing-credentials-from-external-processes for more
  information.

  Created using builder().

  Available settings:

      Command - The command that should be executed to retrieve credentials.
      ExpirationBuffer - The amount of time between when the credentials expire and when the credentials should start to be
      refreshed. This allows the credentials to be refreshed *before* they are reported to expire. Default: 15 seconds.
      ProcessOutputLimit - The maximum amount of data that can be returned by the external process before an exception is
      raised. Default: 1024 bytes."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth ProcessCredentialsProvider]))

(defn *builder
  "Retrieve a new builder that can be used to create and configure a ProcessCredentialsProvider.

  returns: `com.amazonaws.auth.ProcessCredentialsProvider$Builder`"
  (^com.amazonaws.auth.ProcessCredentialsProvider$Builder []
    (ProcessCredentialsProvider/builder )))

(defn get-credentials
  "Description copied from interface: AWSCredentialsProvider

  returns: AWSCredentials which the caller can use to authorize an AWS request. - `com.amazonaws.auth.AWSCredentials`"
  (^com.amazonaws.auth.AWSCredentials [^ProcessCredentialsProvider this]
    (-> this (.getCredentials))))

(defn refresh
  "Description copied from interface: AWSCredentialsProvider"
  ([^ProcessCredentialsProvider this]
    (-> this (.refresh))))

(defn get-credential-expiration-time
  "Get the time at which this credentials provider will block to refresh the credentials. This is usually the expiration time
   returned by the credentials process, minus the configured expiration buffer.

  returns: `org.joda.time.DateTime`"
  (^org.joda.time.DateTime [^ProcessCredentialsProvider this]
    (-> this (.getCredentialExpirationTime))))

