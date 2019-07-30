(ns com.amazonaws.services.kms.AWSKMSAsyncClient
  "Client for accessing KMS asynchronously. Each asynchronous method will return a Java Future object representing the
  asynchronous operation; overloads which accept an AsyncHandler can be used to receive notification when an
  asynchronous operation completes.

  AWS Key Management Service

  AWS Key Management Service (AWS KMS) is an encryption and key management web service. This guide describes the AWS
  KMS operations that you can call programmatically. For general information about AWS KMS, see the  AWS Key Management Service Developer Guide
  .



  AWS provides SDKs that consist of libraries and sample code for various programming languages and platforms (Java,
  Ruby, .Net, macOS, Android, etc.). The SDKs provide a convenient way to create programmatic access to AWS KMS and
  other AWS services. For example, the SDKs take care of tasks such as signing requests (see below), managing errors,
  and retrying requests automatically. For more information about the AWS SDKs, including how to download and install
  them, see Tools for Amazon Web Services.



  We recommend that you use the AWS SDKs to make programmatic API calls to AWS KMS.


  Clients must support TLS (Transport Layer Security) 1.0. We recommend TLS 1.2. Clients must also support cipher
  suites with Perfect Forward Secrecy (PFS) such as Ephemeral Diffie-Hellman (DHE) or Elliptic Curve Ephemeral
  Diffie-Hellman (ECDHE). Most modern systems such as Java 7 and later support these modes.


  Signing Requests


  Requests must be signed by using an access key ID and a secret access key. We strongly recommend that you do
  not use your AWS account (root) access key ID and secret key for everyday work with AWS KMS. Instead, use the
  access key ID and secret access key for an IAM user. You can also use the AWS Security Token Service to generate
  temporary security credentials that you can use to sign requests.


  All AWS KMS operations require Signature Version 4.


  Logging API Requests


  AWS KMS supports AWS CloudTrail, a service that logs AWS API calls and related events for your AWS account and
  delivers them to an Amazon S3 bucket that you specify. By using the information collected by CloudTrail, you can
  determine what requests were made to AWS KMS, who made the request, when it was made, and so on. To learn more about
  CloudTrail, including how to turn it on and find your log files, see the AWS CloudTrail User Guide.


  Additional Resources


  For more information about credentials and request signing, see the following:




  AWS Security Credentials -
  This topic provides general information about the types of credentials used for accessing AWS.




  Temporary Security
  Credentials - This section of the IAM User Guide describes how to create and use temporary security
  credentials.




  Signature Version 4 Signing
  Process - This set of topics walks you through the process of signing a request using an access key ID and a
  secret access key.




  Commonly Used API Operations


  Of the API operations discussed in this guide, the following will prove the most useful for most applications. You
  will likely perform operations other than these, such as creating keys and assigning policies, by using the console.




  Encrypt




  Decrypt




  GenerateDataKey




  GenerateDataKeyWithoutPlaintext"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kms AWSKMSAsyncClient]))

(defn ->awskms-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AWSKMSAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AWSKMSAsyncClient aws-credentials client-configuration executor-service))
  (^AWSKMSAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AWSKMSAsyncClient aws-credentials executor-service))
  (^AWSKMSAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSKMSAsyncClient client-configuration))
  (^AWSKMSAsyncClient []
    (new AWSKMSAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.kms.AWSKMSAsyncClientBuilder`"
  (^com.amazonaws.services.kms.AWSKMSAsyncClientBuilder []
    (AWSKMSAsyncClient/asyncBuilder )))

(defn untag-resource-async
  "Description copied from interface: AWSKMSAsync

  request - `com.amazonaws.services.kms.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kms.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn list-aliases-async
  "Description copied from interface: AWSKMSAsync

  request - `com.amazonaws.services.kms.model.ListAliasesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAliases operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kms.model.ListAliasesResult>`"
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.ListAliasesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAliasesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.ListAliasesRequest request]
    (-> this (.listAliasesAsync request)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this]
    (-> this (.listAliasesAsync))))

(defn create-grant-async
  "Description copied from interface: AWSKMSAsync

  request - `com.amazonaws.services.kms.model.CreateGrantRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateGrant operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kms.model.CreateGrantResult>`"
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.CreateGrantRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createGrantAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.CreateGrantRequest request]
    (-> this (.createGrantAsync request))))

(defn describe-custom-key-stores-async
  "Description copied from interface: AWSKMSAsync

  request - `com.amazonaws.services.kms.model.DescribeCustomKeyStoresRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCustomKeyStores operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kms.model.DescribeCustomKeyStoresResult>`"
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.DescribeCustomKeyStoresRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCustomKeyStoresAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.DescribeCustomKeyStoresRequest request]
    (-> this (.describeCustomKeyStoresAsync request))))

(defn list-grants-async
  "Description copied from interface: AWSKMSAsync

  request - `com.amazonaws.services.kms.model.ListGrantsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGrants operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kms.model.ListGrantsResult>`"
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.ListGrantsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGrantsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.ListGrantsRequest request]
    (-> this (.listGrantsAsync request))))

(defn update-custom-key-store-async
  "Description copied from interface: AWSKMSAsync

  request - `com.amazonaws.services.kms.model.UpdateCustomKeyStoreRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateCustomKeyStore operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kms.model.UpdateCustomKeyStoreResult>`"
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.UpdateCustomKeyStoreRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateCustomKeyStoreAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.UpdateCustomKeyStoreRequest request]
    (-> this (.updateCustomKeyStoreAsync request))))

(defn decrypt-async
  "Description copied from interface: AWSKMSAsync

  request - `com.amazonaws.services.kms.model.DecryptRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the Decrypt operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kms.model.DecryptResult>`"
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.DecryptRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.decryptAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.DecryptRequest request]
    (-> this (.decryptAsync request))))

(defn retire-grant-async
  "Description copied from interface: AWSKMSAsync

  request - `com.amazonaws.services.kms.model.RetireGrantRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RetireGrant operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kms.model.RetireGrantResult>`"
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.RetireGrantRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.retireGrantAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.RetireGrantRequest request]
    (-> this (.retireGrantAsync request)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this]
    (-> this (.retireGrantAsync))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSKMSAsyncClient this]
    (-> this (.getExecutorService))))

(defn create-key-async
  "Description copied from interface: AWSKMSAsync

  request - `com.amazonaws.services.kms.model.CreateKeyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kms.model.CreateKeyResult>`"
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.CreateKeyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createKeyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.CreateKeyRequest request]
    (-> this (.createKeyAsync request)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this]
    (-> this (.createKeyAsync))))

(defn delete-custom-key-store-async
  "Description copied from interface: AWSKMSAsync

  request - `com.amazonaws.services.kms.model.DeleteCustomKeyStoreRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCustomKeyStore operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kms.model.DeleteCustomKeyStoreResult>`"
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.DeleteCustomKeyStoreRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCustomKeyStoreAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.DeleteCustomKeyStoreRequest request]
    (-> this (.deleteCustomKeyStoreAsync request))))

(defn create-alias-async
  "Description copied from interface: AWSKMSAsync

  request - `com.amazonaws.services.kms.model.CreateAliasRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAlias operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kms.model.CreateAliasResult>`"
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.CreateAliasRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAliasAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.CreateAliasRequest request]
    (-> this (.createAliasAsync request))))

(defn delete-imported-key-material-async
  "Description copied from interface: AWSKMSAsync

  request - `com.amazonaws.services.kms.model.DeleteImportedKeyMaterialRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteImportedKeyMaterial operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kms.model.DeleteImportedKeyMaterialResult>`"
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.DeleteImportedKeyMaterialRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteImportedKeyMaterialAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.DeleteImportedKeyMaterialRequest request]
    (-> this (.deleteImportedKeyMaterialAsync request))))

(defn schedule-key-deletion-async
  "Description copied from interface: AWSKMSAsync

  request - `com.amazonaws.services.kms.model.ScheduleKeyDeletionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ScheduleKeyDeletion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kms.model.ScheduleKeyDeletionResult>`"
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.ScheduleKeyDeletionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.scheduleKeyDeletionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.ScheduleKeyDeletionRequest request]
    (-> this (.scheduleKeyDeletionAsync request))))

(defn get-key-rotation-status-async
  "Description copied from interface: AWSKMSAsync

  request - `com.amazonaws.services.kms.model.GetKeyRotationStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetKeyRotationStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kms.model.GetKeyRotationStatusResult>`"
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.GetKeyRotationStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getKeyRotationStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.GetKeyRotationStatusRequest request]
    (-> this (.getKeyRotationStatusAsync request))))

(defn encrypt-async
  "Description copied from interface: AWSKMSAsync

  request - `com.amazonaws.services.kms.model.EncryptRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the Encrypt operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kms.model.EncryptResult>`"
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.EncryptRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.encryptAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.EncryptRequest request]
    (-> this (.encryptAsync request))))

(defn enable-key-async
  "Description copied from interface: AWSKMSAsync

  request - `com.amazonaws.services.kms.model.EnableKeyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kms.model.EnableKeyResult>`"
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.EnableKeyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableKeyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.EnableKeyRequest request]
    (-> this (.enableKeyAsync request))))

(defn list-keys-async
  "Description copied from interface: AWSKMSAsync

  request - `com.amazonaws.services.kms.model.ListKeysRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListKeys operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kms.model.ListKeysResult>`"
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.ListKeysRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listKeysAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.ListKeysRequest request]
    (-> this (.listKeysAsync request)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this]
    (-> this (.listKeysAsync))))

(defn import-key-material-async
  "Description copied from interface: AWSKMSAsync

  request - `com.amazonaws.services.kms.model.ImportKeyMaterialRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ImportKeyMaterial operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kms.model.ImportKeyMaterialResult>`"
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.ImportKeyMaterialRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.importKeyMaterialAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.ImportKeyMaterialRequest request]
    (-> this (.importKeyMaterialAsync request))))

(defn enable-key-rotation-async
  "Description copied from interface: AWSKMSAsync

  request - `com.amazonaws.services.kms.model.EnableKeyRotationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableKeyRotation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kms.model.EnableKeyRotationResult>`"
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.EnableKeyRotationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableKeyRotationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.EnableKeyRotationRequest request]
    (-> this (.enableKeyRotationAsync request))))

(defn create-custom-key-store-async
  "Description copied from interface: AWSKMSAsync

  request - `com.amazonaws.services.kms.model.CreateCustomKeyStoreRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCustomKeyStore operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kms.model.CreateCustomKeyStoreResult>`"
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.CreateCustomKeyStoreRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCustomKeyStoreAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.CreateCustomKeyStoreRequest request]
    (-> this (.createCustomKeyStoreAsync request))))

(defn re-encrypt-async
  "Description copied from interface: AWSKMSAsync

  request - `com.amazonaws.services.kms.model.ReEncryptRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ReEncrypt operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kms.model.ReEncryptResult>`"
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.ReEncryptRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.reEncryptAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.ReEncryptRequest request]
    (-> this (.reEncryptAsync request))))

(defn put-key-policy-async
  "Description copied from interface: AWSKMSAsync

  request - `com.amazonaws.services.kms.model.PutKeyPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutKeyPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kms.model.PutKeyPolicyResult>`"
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.PutKeyPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putKeyPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.PutKeyPolicyRequest request]
    (-> this (.putKeyPolicyAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSKMSAsyncClient this]
    (-> this (.shutdown))))

(defn disable-key-async
  "Description copied from interface: AWSKMSAsync

  request - `com.amazonaws.services.kms.model.DisableKeyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kms.model.DisableKeyResult>`"
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.DisableKeyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableKeyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.DisableKeyRequest request]
    (-> this (.disableKeyAsync request))))

(defn generate-data-key-without-plaintext-async
  "Description copied from interface: AWSKMSAsync

  request - `com.amazonaws.services.kms.model.GenerateDataKeyWithoutPlaintextRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GenerateDataKeyWithoutPlaintext operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.kms.model.GenerateDataKeyWithoutPlaintextResult>`"
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.GenerateDataKeyWithoutPlaintextRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.generateDataKeyWithoutPlaintextAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.GenerateDataKeyWithoutPlaintextRequest request]
    (-> this (.generateDataKeyWithoutPlaintextAsync request))))

(defn list-retirable-grants-async
  "Description copied from interface: AWSKMSAsync

  request - `com.amazonaws.services.kms.model.ListRetirableGrantsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRetirableGrants operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kms.model.ListRetirableGrantsResult>`"
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.ListRetirableGrantsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRetirableGrantsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.ListRetirableGrantsRequest request]
    (-> this (.listRetirableGrantsAsync request))))

(defn update-key-description-async
  "Description copied from interface: AWSKMSAsync

  request - `com.amazonaws.services.kms.model.UpdateKeyDescriptionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateKeyDescription operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kms.model.UpdateKeyDescriptionResult>`"
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.UpdateKeyDescriptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateKeyDescriptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.UpdateKeyDescriptionRequest request]
    (-> this (.updateKeyDescriptionAsync request))))

(defn disable-key-rotation-async
  "Description copied from interface: AWSKMSAsync

  request - `com.amazonaws.services.kms.model.DisableKeyRotationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableKeyRotation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kms.model.DisableKeyRotationResult>`"
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.DisableKeyRotationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableKeyRotationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.DisableKeyRotationRequest request]
    (-> this (.disableKeyRotationAsync request))))

(defn revoke-grant-async
  "Description copied from interface: AWSKMSAsync

  request - `com.amazonaws.services.kms.model.RevokeGrantRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RevokeGrant operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kms.model.RevokeGrantResult>`"
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.RevokeGrantRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.revokeGrantAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.RevokeGrantRequest request]
    (-> this (.revokeGrantAsync request))))

(defn delete-alias-async
  "Description copied from interface: AWSKMSAsync

  request - `com.amazonaws.services.kms.model.DeleteAliasRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAlias operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kms.model.DeleteAliasResult>`"
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.DeleteAliasRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAliasAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.DeleteAliasRequest request]
    (-> this (.deleteAliasAsync request))))

(defn generate-random-async
  "Description copied from interface: AWSKMSAsync

  request - `com.amazonaws.services.kms.model.GenerateRandomRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GenerateRandom operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kms.model.GenerateRandomResult>`"
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.GenerateRandomRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.generateRandomAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.GenerateRandomRequest request]
    (-> this (.generateRandomAsync request)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this]
    (-> this (.generateRandomAsync))))

(defn cancel-key-deletion-async
  "Description copied from interface: AWSKMSAsync

  request - `com.amazonaws.services.kms.model.CancelKeyDeletionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelKeyDeletion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kms.model.CancelKeyDeletionResult>`"
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.CancelKeyDeletionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelKeyDeletionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.CancelKeyDeletionRequest request]
    (-> this (.cancelKeyDeletionAsync request))))

(defn generate-data-key-async
  "Description copied from interface: AWSKMSAsync

  request - `com.amazonaws.services.kms.model.GenerateDataKeyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GenerateDataKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kms.model.GenerateDataKeyResult>`"
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.GenerateDataKeyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.generateDataKeyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.GenerateDataKeyRequest request]
    (-> this (.generateDataKeyAsync request))))

(defn connect-custom-key-store-async
  "Description copied from interface: AWSKMSAsync

  request - `com.amazonaws.services.kms.model.ConnectCustomKeyStoreRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ConnectCustomKeyStore operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kms.model.ConnectCustomKeyStoreResult>`"
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.ConnectCustomKeyStoreRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.connectCustomKeyStoreAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.ConnectCustomKeyStoreRequest request]
    (-> this (.connectCustomKeyStoreAsync request))))

(defn describe-key-async
  "Description copied from interface: AWSKMSAsync

  request - `com.amazonaws.services.kms.model.DescribeKeyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kms.model.DescribeKeyResult>`"
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.DescribeKeyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeKeyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.DescribeKeyRequest request]
    (-> this (.describeKeyAsync request))))

(defn update-alias-async
  "Description copied from interface: AWSKMSAsync

  request - `com.amazonaws.services.kms.model.UpdateAliasRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAlias operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kms.model.UpdateAliasResult>`"
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.UpdateAliasRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAliasAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.UpdateAliasRequest request]
    (-> this (.updateAliasAsync request))))

(defn get-parameters-for-import-async
  "Description copied from interface: AWSKMSAsync

  request - `com.amazonaws.services.kms.model.GetParametersForImportRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetParametersForImport operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kms.model.GetParametersForImportResult>`"
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.GetParametersForImportRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getParametersForImportAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.GetParametersForImportRequest request]
    (-> this (.getParametersForImportAsync request))))

(defn list-key-policies-async
  "Description copied from interface: AWSKMSAsync

  request - `com.amazonaws.services.kms.model.ListKeyPoliciesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListKeyPolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kms.model.ListKeyPoliciesResult>`"
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.ListKeyPoliciesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listKeyPoliciesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.ListKeyPoliciesRequest request]
    (-> this (.listKeyPoliciesAsync request))))

(defn tag-resource-async
  "Description copied from interface: AWSKMSAsync

  request - `com.amazonaws.services.kms.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kms.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn list-resource-tags-async
  "Description copied from interface: AWSKMSAsync

  request - `com.amazonaws.services.kms.model.ListResourceTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListResourceTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kms.model.ListResourceTagsResult>`"
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.ListResourceTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listResourceTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.ListResourceTagsRequest request]
    (-> this (.listResourceTagsAsync request))))

(defn disconnect-custom-key-store-async
  "Description copied from interface: AWSKMSAsync

  request - `com.amazonaws.services.kms.model.DisconnectCustomKeyStoreRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisconnectCustomKeyStore operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kms.model.DisconnectCustomKeyStoreResult>`"
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.DisconnectCustomKeyStoreRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disconnectCustomKeyStoreAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.DisconnectCustomKeyStoreRequest request]
    (-> this (.disconnectCustomKeyStoreAsync request))))

(defn get-key-policy-async
  "Description copied from interface: AWSKMSAsync

  request - `com.amazonaws.services.kms.model.GetKeyPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetKeyPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kms.model.GetKeyPolicyResult>`"
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.GetKeyPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getKeyPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKMSAsyncClient this ^com.amazonaws.services.kms.model.GetKeyPolicyRequest request]
    (-> this (.getKeyPolicyAsync request))))

