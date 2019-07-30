(ns com.amazonaws.auth.InstanceProfileCredentialsProvider
  "Credentials provider implementation that loads credentials from the Amazon EC2 Instance Metadata Service.

  When using InstanceProfileCredentialsProvider with asynchronous refreshing it is
  strongly recommended to explicitly call close() to release the async thread."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth InstanceProfileCredentialsProvider]))

(defn ->instance-profile-credentials-provider
  "Constructor.

  Spins up a new thread to refresh the credentials asynchronously if
   refreshCredentialsAsync is set to true, otherwise the credentials will be
   refreshed from the instance metadata service synchronously,

   It is strongly recommended to reuse instances of this credentials provider, especially
   when async refreshing is used since a background thread is created.

  refresh-credentials-async - true if credentials needs to be refreshed asynchronously else false. - `boolean`"
  (^InstanceProfileCredentialsProvider [^Boolean refresh-credentials-async]
    (new InstanceProfileCredentialsProvider refresh-credentials-async))
  (^InstanceProfileCredentialsProvider []
    (new InstanceProfileCredentialsProvider )))

(defn *create-async-refreshing-provider
  "Spins up a new thread to refresh the credentials asynchronously.

   It is strongly recommended to reuse instances of this credentials provider, especially
   when async refreshing is used since a background thread is created.

  eagerly-refresh-credentials-async - when set to false will not attempt to refresh credentials asynchronously until after a call has been made to getCredentials() - ensures that EC2CredentialsFetcher.getCredentials() is only hit when this CredentialProvider is actually required - `boolean`

  returns: `com.amazonaws.auth.InstanceProfileCredentialsProvider`"
  (^com.amazonaws.auth.InstanceProfileCredentialsProvider [^Boolean eagerly-refresh-credentials-async]
    (InstanceProfileCredentialsProvider/createAsyncRefreshingProvider eagerly-refresh-credentials-async)))

(defn *get-instance
  "Returns a singleton InstanceProfileCredentialsProvider that does not refresh credentials asynchronously.


   See InstanceProfileCredentialsProvider(boolean) or createAsyncRefreshingProvider(boolean) for
   asynchronous credentials refreshing.

  returns: `com.amazonaws.auth.InstanceProfileCredentialsProvider`"
  (^com.amazonaws.auth.InstanceProfileCredentialsProvider []
    (InstanceProfileCredentialsProvider/getInstance )))

(defn get-credentials
  "Returns AWSCredentials which the caller can use to authorize an AWS request.
   Each implementation of AWSCredentialsProvider can chose its own strategy for
   loading credentials.  For example, an implementation might load credentials
   from an existing key management system, or load new credentials when
   credentials are rotated.

  returns: AWSCredentials which the caller can use to authorize an AWS request. - `com.amazonaws.auth.AWSCredentials`

  throws: com.amazonaws.AmazonClientException - if SDKGlobalConfiguration.isEc2MetadataDisabled() is true"
  (^com.amazonaws.auth.AWSCredentials [^InstanceProfileCredentialsProvider this]
    (-> this (.getCredentials))))

(defn refresh
  "Description copied from interface: AWSCredentialsProvider"
  ([^InstanceProfileCredentialsProvider this]
    (-> this (.refresh))))

(defn close
  "throws: java.io.IOException"
  ([^InstanceProfileCredentialsProvider this]
    (-> this (.close))))

