(ns com.amazonaws.services.kms.AWSKMSClient
  "Client for accessing KMS. All service calls made using this client are blocking, and will not return until the
  service call completes.

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
  (:import [com.amazonaws.services.kms AWSKMSClient]))

(defn ->awskms-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to KMS (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AWSKMSClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AWSKMSClient aws-credentials-provider client-configuration request-metric-collector))
  (^AWSKMSClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSKMSClient aws-credentials client-configuration))
  (^AWSKMSClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSKMSClient client-configuration))
  (^AWSKMSClient []
    (new AWSKMSClient )))

(defn *builder
  "returns: `com.amazonaws.services.kms.AWSKMSClientBuilder`"
  (^com.amazonaws.services.kms.AWSKMSClientBuilder []
    (AWSKMSClient/builder )))

(defn encrypt
  "Encrypts plaintext into ciphertext by using a customer master key (CMK). The Encrypt operation has
   two primary use cases:




   You can encrypt up to 4 kilobytes (4096 bytes) of arbitrary data such as an RSA key, a database password, or
   other sensitive information.




   You can use the Encrypt operation to move encrypted data from one AWS region to another. In the
   first region, generate a data key and use the plaintext key to encrypt the data. Then, in the new region, call
   the Encrypt method on same plaintext data key. Now, you can safely move the encrypted data and
   encrypted data key to the new region, and decrypt in the new region when necessary.




   You don't need use this operation to encrypt a data key within a region. The GenerateDataKey and
   GenerateDataKeyWithoutPlaintext operations return an encrypted data key.


   Also, you don't need to use this operation to encrypt data in your application. You can use the plaintext and
   encrypted data keys that the GenerateDataKey operation returns.


   The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a
   Customer Master Key in the AWS Key Management Service Developer Guide.


   To perform this operation on a CMK in a different AWS account, specify the key ARN or alias ARN in the value of
   the KeyId parameter.

  request - `com.amazonaws.services.kms.model.EncryptRequest`

  returns: Result of the Encrypt operation returned by the service. - `com.amazonaws.services.kms.model.EncryptResult`

  throws: com.amazonaws.services.kms.model.NotFoundException - The request was rejected because the specified entity or resource could not be found."
  (^com.amazonaws.services.kms.model.EncryptResult [^AWSKMSClient this ^com.amazonaws.services.kms.model.EncryptRequest request]
    (-> this (.encrypt request))))

(defn cancel-key-deletion
  "Cancels the deletion of a customer master key (CMK). When this operation is successful, the CMK is set to the
   Disabled state. To enable a CMK, use EnableKey. You cannot perform this operation on a CMK in
   a different AWS account.


   For more information about scheduling and canceling deletion of a CMK, see Deleting Customer Master Keys
   in the AWS Key Management Service Developer Guide.


   The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a
   Customer Master Key in the AWS Key Management Service Developer Guide.

  request - `com.amazonaws.services.kms.model.CancelKeyDeletionRequest`

  returns: Result of the CancelKeyDeletion operation returned by the service. - `com.amazonaws.services.kms.model.CancelKeyDeletionResult`

  throws: com.amazonaws.services.kms.model.NotFoundException - The request was rejected because the specified entity or resource could not be found."
  (^com.amazonaws.services.kms.model.CancelKeyDeletionResult [^AWSKMSClient this ^com.amazonaws.services.kms.model.CancelKeyDeletionRequest request]
    (-> this (.cancelKeyDeletion request))))

(defn enable-key-rotation
  "Enables automatic rotation of
   the key material for the specified customer master key (CMK). You cannot perform this operation on a CMK in a
   different AWS account.


   You cannot enable automatic rotation of CMKs with imported key material or CMKs in a custom key store.


   The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a
   Customer Master Key in the AWS Key Management Service Developer Guide.

  request - `com.amazonaws.services.kms.model.EnableKeyRotationRequest`

  returns: Result of the EnableKeyRotation operation returned by the service. - `com.amazonaws.services.kms.model.EnableKeyRotationResult`

  throws: com.amazonaws.services.kms.model.NotFoundException - The request was rejected because the specified entity or resource could not be found."
  (^com.amazonaws.services.kms.model.EnableKeyRotationResult [^AWSKMSClient this ^com.amazonaws.services.kms.model.EnableKeyRotationRequest request]
    (-> this (.enableKeyRotation request))))

(defn import-key-material
  "Imports key material into an existing AWS KMS customer master key (CMK) that was created without key material.
   You cannot perform this operation on a CMK in a different AWS account. For more information about creating CMKs
   with no key material and then importing key material, see Importing Key Material in
   the AWS Key Management Service Developer Guide.


   Before using this operation, call GetParametersForImport. Its response includes a public key and an import
   token. Use the public key to encrypt the key material. Then, submit the import token from the same
   GetParametersForImport response.


   When calling this operation, you must specify the following values:




   The key ID or key ARN of a CMK with no key material. Its Origin must be EXTERNAL.


   To create a CMK with no key material, call CreateKey and set the value of its Origin
   parameter to EXTERNAL. To get the Origin of a CMK, call DescribeKey.)




   The encrypted key material. To get the public key to encrypt the key material, call
   GetParametersForImport.




   The import token that GetParametersForImport returned. This token and the public key used to encrypt the
   key material must have come from the same response.




   Whether the key material expires and if so, when. If you set an expiration date, you can change it only by
   reimporting the same key material and specifying a new expiration date. If the key material expires, AWS KMS
   deletes the key material and the CMK becomes unusable. To use the CMK again, you must reimport the same key
   material.




   When this operation is successful, the key state of the CMK changes from PendingImport to
   Enabled, and you can use the CMK. After you successfully import key material into a CMK, you can
   reimport the same key material into that CMK, but you cannot import different key material.


   The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a
   Customer Master Key in the AWS Key Management Service Developer Guide.

  request - `com.amazonaws.services.kms.model.ImportKeyMaterialRequest`

  returns: Result of the ImportKeyMaterial operation returned by the service. - `com.amazonaws.services.kms.model.ImportKeyMaterialResult`

  throws: com.amazonaws.services.kms.model.InvalidImportTokenException - The request was rejected because the provided import token is invalid or is associated with a different customer master key (CMK)."
  (^com.amazonaws.services.kms.model.ImportKeyMaterialResult [^AWSKMSClient this ^com.amazonaws.services.kms.model.ImportKeyMaterialRequest request]
    (-> this (.importKeyMaterial request))))

(defn disconnect-custom-key-store
  "Disconnects the custom key store
   from its associated AWS CloudHSM cluster. While a custom key store is disconnected, you can manage the custom key
   store and its customer master keys (CMKs), but you cannot create or use CMKs in the custom key store. You can
   reconnect the custom key store at any time.



   While a custom key store is disconnected, all attempts to create customer master keys (CMKs) in the custom key
   store or to use existing CMKs in cryptographic operations will fail. This action can prevent users from storing
   and accessing sensitive data.




   To find the connection state of a custom key store, use the DescribeCustomKeyStores operation. To
   reconnect a custom key store, use the ConnectCustomKeyStore operation.


   If the operation succeeds, it returns a JSON object with no properties.


   This operation is part of the Custom Key Store
   feature feature in AWS KMS, which combines the convenience and extensive integration of AWS KMS with the
   isolation and control of a single-tenant key store.

  request - `com.amazonaws.services.kms.model.DisconnectCustomKeyStoreRequest`

  returns: Result of the DisconnectCustomKeyStore operation returned by the service. - `com.amazonaws.services.kms.model.DisconnectCustomKeyStoreResult`

  throws: com.amazonaws.services.kms.model.CustomKeyStoreInvalidStateException - The request was rejected because of the ConnectionState of the custom key store. To get the ConnectionState of a custom key store, use the DescribeCustomKeyStores operation. This exception is thrown under the following conditions: You requested the CreateKey or GenerateRandom operation in a custom key store that is not connected. These operations are valid only when the custom key store ConnectionState is CONNECTED. You requested the UpdateCustomKeyStore or DeleteCustomKeyStore operation on a custom key store that is not disconnected. This operation is valid only when the custom key store ConnectionState is DISCONNECTED. You requested the ConnectCustomKeyStore operation on a custom key store with a ConnectionState of DISCONNECTING or FAILED. This operation is valid for all other ConnectionState values."
  (^com.amazonaws.services.kms.model.DisconnectCustomKeyStoreResult [^AWSKMSClient this ^com.amazonaws.services.kms.model.DisconnectCustomKeyStoreRequest request]
    (-> this (.disconnectCustomKeyStore request))))

(defn generate-data-key-without-plaintext
  "Generates a unique data key. This operation returns a data key that is encrypted under a customer master key
   (CMK) that you specify. GenerateDataKeyWithoutPlaintext is identical to GenerateDataKey
   except that returns only the encrypted copy of the data key.


   Like GenerateDataKey, GenerateDataKeyWithoutPlaintext returns a unique data key for
   each request. The bytes in the key are not related to the caller or CMK that is used to encrypt the data key.


   This operation is useful for systems that need to encrypt data at some point, but not immediately. When you need
   to encrypt the data, you call the Decrypt operation on the encrypted copy of the key.


   It's also useful in distributed systems with different levels of trust. For example, you might store encrypted
   data in containers. One component of your system creates new containers and stores an encrypted data key with
   each container. Then, a different component puts the data into the containers. That component first decrypts the
   data key, uses the plaintext data key to encrypt data, puts the encrypted data into the container, and then
   destroys the plaintext data key. In this system, the component that creates the containers never sees the
   plaintext data key.


   The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a
   Customer Master Key in the AWS Key Management Service Developer Guide.

  request - `com.amazonaws.services.kms.model.GenerateDataKeyWithoutPlaintextRequest`

  returns: Result of the GenerateDataKeyWithoutPlaintext operation returned by the service. - `com.amazonaws.services.kms.model.GenerateDataKeyWithoutPlaintextResult`

  throws: com.amazonaws.services.kms.model.NotFoundException - The request was rejected because the specified entity or resource could not be found."
  (^com.amazonaws.services.kms.model.GenerateDataKeyWithoutPlaintextResult [^AWSKMSClient this ^com.amazonaws.services.kms.model.GenerateDataKeyWithoutPlaintextRequest request]
    (-> this (.generateDataKeyWithoutPlaintext request))))

(defn update-key-description
  "Updates the description of a customer master key (CMK). To see the description of a CMK, use DescribeKey.


   You cannot perform this operation on a CMK in a different AWS account.


   The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a
   Customer Master Key in the AWS Key Management Service Developer Guide.

  request - `com.amazonaws.services.kms.model.UpdateKeyDescriptionRequest`

  returns: Result of the UpdateKeyDescription operation returned by the service. - `com.amazonaws.services.kms.model.UpdateKeyDescriptionResult`

  throws: com.amazonaws.services.kms.model.NotFoundException - The request was rejected because the specified entity or resource could not be found."
  (^com.amazonaws.services.kms.model.UpdateKeyDescriptionResult [^AWSKMSClient this ^com.amazonaws.services.kms.model.UpdateKeyDescriptionRequest request]
    (-> this (.updateKeyDescription request))))

(defn untag-resource
  "Removes the specified tags from the specified customer master key (CMK). You cannot perform this operation on a
   CMK in a different AWS account.


   To remove a tag, specify the tag key. To change the tag value of an existing tag key, use TagResource.


   The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a
   Customer Master Key in the AWS Key Management Service Developer Guide.

  request - `com.amazonaws.services.kms.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.kms.model.UntagResourceResult`

  throws: com.amazonaws.services.kms.model.KMSInternalException - The request was rejected because an internal exception occurred. The request can be retried."
  (^com.amazonaws.services.kms.model.UntagResourceResult [^AWSKMSClient this ^com.amazonaws.services.kms.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn delete-custom-key-store
  "Deletes a custom
   key store. This operation does not delete the AWS CloudHSM cluster that is associated with the custom key
   store, or affect any users or keys in the cluster.


   The custom key store that you delete cannot contain any AWS KMS customer master keys
   (CMKs). Before deleting the key store, verify that you will never need to use any of the CMKs in the key
   store for any cryptographic operations. Then, use ScheduleKeyDeletion to delete the AWS KMS customer
   master keys (CMKs) from the key store. When the scheduled waiting period expires, the
   ScheduleKeyDeletion operation deletes the CMKs. Then it makes a best effort to delete the key
   material from the associated cluster. However, you might need to manually delete
   the orphaned key material from the cluster and its backups.


   After all CMKs are deleted from AWS KMS, use DisconnectCustomKeyStore to disconnect the key store from AWS
   KMS. Then, you can delete the custom key store.


   Instead of deleting the custom key store, consider using DisconnectCustomKeyStore to disconnect it from
   AWS KMS. While the key store is disconnected, you cannot create or use the CMKs in the key store. But, you do not
   need to delete CMKs and you can reconnect a disconnected custom key store at any time.


   If the operation succeeds, it returns a JSON object with no properties.


   This operation is part of the Custom Key Store
   feature feature in AWS KMS, which combines the convenience and extensive integration of AWS KMS with the
   isolation and control of a single-tenant key store.

  request - `com.amazonaws.services.kms.model.DeleteCustomKeyStoreRequest`

  returns: Result of the DeleteCustomKeyStore operation returned by the service. - `com.amazonaws.services.kms.model.DeleteCustomKeyStoreResult`

  throws: com.amazonaws.services.kms.model.CustomKeyStoreHasCMKsException - The request was rejected because the custom key store contains AWS KMS customer master keys (CMKs). After verifying that you do not need to use the CMKs, use the ScheduleKeyDeletion operation to delete the CMKs. After they are deleted, you can delete the custom key store."
  (^com.amazonaws.services.kms.model.DeleteCustomKeyStoreResult [^AWSKMSClient this ^com.amazonaws.services.kms.model.DeleteCustomKeyStoreRequest request]
    (-> this (.deleteCustomKeyStore request))))

(defn delete-imported-key-material
  "Deletes key material that you previously imported. This operation makes the specified customer master key (CMK)
   unusable. For more information about importing key material into AWS KMS, see Importing Key Material in
   the AWS Key Management Service Developer Guide. You cannot perform this operation on a CMK in a different
   AWS account.


   When the specified CMK is in the PendingDeletion state, this operation does not change the CMK's
   state. Otherwise, it changes the CMK's state to PendingImport.


   After you delete key material, you can use ImportKeyMaterial to reimport the same key material into the
   CMK.


   The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a
   Customer Master Key in the AWS Key Management Service Developer Guide.

  request - `com.amazonaws.services.kms.model.DeleteImportedKeyMaterialRequest`

  returns: Result of the DeleteImportedKeyMaterial operation returned by the service. - `com.amazonaws.services.kms.model.DeleteImportedKeyMaterialResult`

  throws: com.amazonaws.services.kms.model.InvalidArnException - The request was rejected because a specified ARN, or an ARN in a key policy, is not valid."
  (^com.amazonaws.services.kms.model.DeleteImportedKeyMaterialResult [^AWSKMSClient this ^com.amazonaws.services.kms.model.DeleteImportedKeyMaterialRequest request]
    (-> this (.deleteImportedKeyMaterial request))))

(defn create-key
  "Creates a customer managed customer master key
   (CMK) in your AWS account.


   You can use a CMK to encrypt small amounts of data (up to 4096 bytes) directly. But CMKs are more commonly used
   to encrypt the data
   keys that are used to encrypt data.


   To create a CMK for imported key material, use the Origin parameter with a value of
   EXTERNAL.


   To create a CMK in a custom key store,
   use the CustomKeyStoreId parameter to specify the custom key store. You must also use the
   Origin parameter with a value of AWS_CLOUDHSM. The AWS CloudHSM cluster that is
   associated with the custom key store must have at least two active HSMs in different Availability Zones in the
   AWS Region.


   You cannot use this operation to create a CMK in a different AWS account.

  request - `com.amazonaws.services.kms.model.CreateKeyRequest`

  returns: Result of the CreateKey operation returned by the service. - `com.amazonaws.services.kms.model.CreateKeyResult`

  throws: com.amazonaws.services.kms.model.CustomKeyStoreInvalidStateException - The request was rejected because of the ConnectionState of the custom key store. To get the ConnectionState of a custom key store, use the DescribeCustomKeyStores operation. This exception is thrown under the following conditions: You requested the CreateKey or GenerateRandom operation in a custom key store that is not connected. These operations are valid only when the custom key store ConnectionState is CONNECTED. You requested the UpdateCustomKeyStore or DeleteCustomKeyStore operation on a custom key store that is not disconnected. This operation is valid only when the custom key store ConnectionState is DISCONNECTED. You requested the ConnectCustomKeyStore operation on a custom key store with a ConnectionState of DISCONNECTING or FAILED. This operation is valid for all other ConnectionState values."
  (^com.amazonaws.services.kms.model.CreateKeyResult [^AWSKMSClient this ^com.amazonaws.services.kms.model.CreateKeyRequest request]
    (-> this (.createKey request)))
  (^com.amazonaws.services.kms.model.CreateKeyResult [^AWSKMSClient this]
    (-> this (.createKey))))

(defn create-alias
  "Creates a display name for a customer managed customer master key (CMK). You can use an alias to identify a CMK
   in selected operations, such as Encrypt and GenerateDataKey.


   Each CMK can have multiple aliases, but each alias points to only one CMK. The alias name must be unique in the
   AWS account and region. To simplify code that runs in multiple regions, use the same alias name, but point it to
   a different CMK in each region.


   Because an alias is not a property of a CMK, you can delete and change the aliases of a CMK without affecting the
   CMK. Also, aliases do not appear in the response from the DescribeKey operation. To get the aliases of all
   CMKs, use the ListAliases operation.


   The alias name must begin with alias/ followed by a name, such as alias/ExampleAlias.
   It can contain only alphanumeric characters, forward slashes (/), underscores (_), and dashes (-). The alias name
   cannot begin with alias/aws/. The alias/aws/ prefix is reserved for AWS managed CMKs.


   The alias and the CMK it is mapped to must be in the same AWS account and the same region. You cannot perform
   this operation on an alias in a different AWS account.


   To map an existing alias to a different CMK, call UpdateAlias.


   The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a
   Customer Master Key in the AWS Key Management Service Developer Guide.

  request - `com.amazonaws.services.kms.model.CreateAliasRequest`

  returns: Result of the CreateAlias operation returned by the service. - `com.amazonaws.services.kms.model.CreateAliasResult`

  throws: com.amazonaws.services.kms.model.DependencyTimeoutException - The system timed out while trying to fulfill the request. The request can be retried."
  (^com.amazonaws.services.kms.model.CreateAliasResult [^AWSKMSClient this ^com.amazonaws.services.kms.model.CreateAliasRequest request]
    (-> this (.createAlias request))))

(defn delete-alias
  "Deletes the specified alias. You cannot perform this operation on an alias in a different AWS account.


   Because an alias is not a property of a CMK, you can delete and change the aliases of a CMK without affecting the
   CMK. Also, aliases do not appear in the response from the DescribeKey operation. To get the aliases of all
   CMKs, use the ListAliases operation.


   Each CMK can have multiple aliases. To change the alias of a CMK, use DeleteAlias to delete the current
   alias and CreateAlias to create a new alias. To associate an existing alias with a different customer
   master key (CMK), call UpdateAlias.

  request - `com.amazonaws.services.kms.model.DeleteAliasRequest`

  returns: Result of the DeleteAlias operation returned by the service. - `com.amazonaws.services.kms.model.DeleteAliasResult`

  throws: com.amazonaws.services.kms.model.DependencyTimeoutException - The system timed out while trying to fulfill the request. The request can be retried."
  (^com.amazonaws.services.kms.model.DeleteAliasResult [^AWSKMSClient this ^com.amazonaws.services.kms.model.DeleteAliasRequest request]
    (-> this (.deleteAlias request))))

(defn revoke-grant
  "Revokes the specified grant for the specified customer master key (CMK). You can revoke a grant to actively deny
   operations that depend on it.


   To perform this operation on a CMK in a different AWS account, specify the key ARN in the value of the
   KeyId parameter.

  request - `com.amazonaws.services.kms.model.RevokeGrantRequest`

  returns: Result of the RevokeGrant operation returned by the service. - `com.amazonaws.services.kms.model.RevokeGrantResult`

  throws: com.amazonaws.services.kms.model.NotFoundException - The request was rejected because the specified entity or resource could not be found."
  (^com.amazonaws.services.kms.model.RevokeGrantResult [^AWSKMSClient this ^com.amazonaws.services.kms.model.RevokeGrantRequest request]
    (-> this (.revokeGrant request))))

(defn list-keys
  "Gets a list of all customer master keys (CMKs) in the caller's AWS account and region.

  request - `com.amazonaws.services.kms.model.ListKeysRequest`

  returns: Result of the ListKeys operation returned by the service. - `com.amazonaws.services.kms.model.ListKeysResult`

  throws: com.amazonaws.services.kms.model.DependencyTimeoutException - The system timed out while trying to fulfill the request. The request can be retried."
  (^com.amazonaws.services.kms.model.ListKeysResult [^AWSKMSClient this ^com.amazonaws.services.kms.model.ListKeysRequest request]
    (-> this (.listKeys request)))
  (^com.amazonaws.services.kms.model.ListKeysResult [^AWSKMSClient this]
    (-> this (.listKeys))))

(defn schedule-key-deletion
  "Schedules the deletion of a customer master key (CMK). You may provide a waiting period, specified in days,
   before deletion occurs. If you do not provide a waiting period, the default period of 30 days is used. When this
   operation is successful, the key state of the CMK changes to PendingDeletion. Before the waiting
   period ends, you can use CancelKeyDeletion to cancel the deletion of the CMK. After the waiting period
   ends, AWS KMS deletes the CMK and all AWS KMS data associated with it, including all aliases that refer to it.



   Deleting a CMK is a destructive and potentially dangerous operation. When a CMK is deleted, all data that was
   encrypted under the CMK is unrecoverable. To prevent the use of a CMK without deleting it, use DisableKey.



   If you schedule deletion of a CMK from a custom key store,
   when the waiting period expires, ScheduleKeyDeletion deletes the CMK from AWS KMS. Then AWS KMS
   makes a best effort to delete the key material from the associated AWS CloudHSM cluster. However, you might need
   to manually delete
   the orphaned key material from the cluster and its backups.


   You cannot perform this operation on a CMK in a different AWS account.


   For more information about scheduling a CMK for deletion, see Deleting Customer Master Keys
   in the AWS Key Management Service Developer Guide.


   The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a
   Customer Master Key in the AWS Key Management Service Developer Guide.

  request - `com.amazonaws.services.kms.model.ScheduleKeyDeletionRequest`

  returns: Result of the ScheduleKeyDeletion operation returned by the service. - `com.amazonaws.services.kms.model.ScheduleKeyDeletionResult`

  throws: com.amazonaws.services.kms.model.NotFoundException - The request was rejected because the specified entity or resource could not be found."
  (^com.amazonaws.services.kms.model.ScheduleKeyDeletionResult [^AWSKMSClient this ^com.amazonaws.services.kms.model.ScheduleKeyDeletionRequest request]
    (-> this (.scheduleKeyDeletion request))))

(defn get-key-rotation-status
  "Gets a Boolean value that indicates whether automatic rotation of the key
   material is enabled for the specified customer master key (CMK).


   The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a
   Customer Master Key in the AWS Key Management Service Developer Guide.




   Disabled: The key rotation status does not change when you disable a CMK. However, while the CMK is disabled, AWS
   KMS does not rotate the backing key.




   Pending deletion: While a CMK is pending deletion, its key rotation status is false and AWS KMS does
   not rotate the backing key. If you cancel the deletion, the original key rotation status is restored.




   To perform this operation on a CMK in a different AWS account, specify the key ARN in the value of the
   KeyId parameter.

  request - `com.amazonaws.services.kms.model.GetKeyRotationStatusRequest`

  returns: Result of the GetKeyRotationStatus operation returned by the service. - `com.amazonaws.services.kms.model.GetKeyRotationStatusResult`

  throws: com.amazonaws.services.kms.model.NotFoundException - The request was rejected because the specified entity or resource could not be found."
  (^com.amazonaws.services.kms.model.GetKeyRotationStatusResult [^AWSKMSClient this ^com.amazonaws.services.kms.model.GetKeyRotationStatusRequest request]
    (-> this (.getKeyRotationStatus request))))

(defn create-custom-key-store
  "Creates a custom
   key store that is associated with an AWS CloudHSM cluster that you own
   and manage.


   This operation is part of the Custom Key Store
   feature feature in AWS KMS, which combines the convenience and extensive integration of AWS KMS with the
   isolation and control of a single-tenant key store.


   Before you create the custom key store, you must assemble the required elements, including an AWS CloudHSM
   cluster that fulfills the requirements for a custom key store. For details about the required elements, see Assemble the
   Prerequisites in the AWS Key Management Service Developer Guide.


   When the operation completes successfully, it returns the ID of the new custom key store. Before you can use your
   new custom key store, you need to use the ConnectCustomKeyStore operation to connect the new key store to
   its AWS CloudHSM cluster. Even if you are not going to use your custom key store immediately, you might want to
   connect it to verify that all settings are correct and then disconnect it until you are ready to use it.


   For help with failures, see Troubleshooting a Custom Key
   Store in the AWS Key Management Service Developer Guide.

  request - `com.amazonaws.services.kms.model.CreateCustomKeyStoreRequest`

  returns: Result of the CreateCustomKeyStore operation returned by the service. - `com.amazonaws.services.kms.model.CreateCustomKeyStoreResult`

  throws: com.amazonaws.services.kms.model.CloudHsmClusterInUseException - The request was rejected because the specified AWS CloudHSM cluster is already associated with a custom key store or it shares a backup history with a cluster that is associated with a custom key store. Each custom key store must be associated with a different AWS CloudHSM cluster. Clusters that share a backup history have the same cluster certificate. To view the cluster certificate of a cluster, use the DescribeClusters operation."
  (^com.amazonaws.services.kms.model.CreateCustomKeyStoreResult [^AWSKMSClient this ^com.amazonaws.services.kms.model.CreateCustomKeyStoreRequest request]
    (-> this (.createCustomKeyStore request))))

(defn update-alias
  "Associates an existing alias with a different customer master key (CMK). Each CMK can have multiple aliases, but
   the aliases must be unique within the account and region. You cannot perform this operation on an alias in a
   different AWS account.


   This operation works only on existing aliases. To change the alias of a CMK to a new value, use
   CreateAlias to create a new alias and DeleteAlias to delete the old alias.


   Because an alias is not a property of a CMK, you can create, update, and delete the aliases of a CMK without
   affecting the CMK. Also, aliases do not appear in the response from the DescribeKey operation. To get the
   aliases of all CMKs in the account, use the ListAliases operation.


   The alias name must begin with alias/ followed by a name, such as alias/ExampleAlias.
   It can contain only alphanumeric characters, forward slashes (/), underscores (_), and dashes (-). The alias name
   cannot begin with alias/aws/. The alias/aws/ prefix is reserved for AWS managed CMKs.


   The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a
   Customer Master Key in the AWS Key Management Service Developer Guide.

  request - `com.amazonaws.services.kms.model.UpdateAliasRequest`

  returns: Result of the UpdateAlias operation returned by the service. - `com.amazonaws.services.kms.model.UpdateAliasResult`

  throws: com.amazonaws.services.kms.model.DependencyTimeoutException - The system timed out while trying to fulfill the request. The request can be retried."
  (^com.amazonaws.services.kms.model.UpdateAliasResult [^AWSKMSClient this ^com.amazonaws.services.kms.model.UpdateAliasRequest request]
    (-> this (.updateAlias request))))

(defn generate-random
  "Returns a random byte string that is cryptographically secure.


   By default, the random byte string is generated in AWS KMS. To generate the byte string in the AWS CloudHSM
   cluster that is associated with a custom key store,
   specify the custom key store ID.


   For more information about entropy and random number generation, see the AWS Key Management Service
   Cryptographic Details whitepaper.

  request - `com.amazonaws.services.kms.model.GenerateRandomRequest`

  returns: Result of the GenerateRandom operation returned by the service. - `com.amazonaws.services.kms.model.GenerateRandomResult`

  throws: com.amazonaws.services.kms.model.DependencyTimeoutException - The system timed out while trying to fulfill the request. The request can be retried."
  (^com.amazonaws.services.kms.model.GenerateRandomResult [^AWSKMSClient this ^com.amazonaws.services.kms.model.GenerateRandomRequest request]
    (-> this (.generateRandom request)))
  (^com.amazonaws.services.kms.model.GenerateRandomResult [^AWSKMSClient this]
    (-> this (.generateRandom))))

(defn get-key-policy
  "Gets a key policy attached to the specified customer master key (CMK). You cannot perform this operation on a CMK
   in a different AWS account.

  request - `com.amazonaws.services.kms.model.GetKeyPolicyRequest`

  returns: Result of the GetKeyPolicy operation returned by the service. - `com.amazonaws.services.kms.model.GetKeyPolicyResult`

  throws: com.amazonaws.services.kms.model.NotFoundException - The request was rejected because the specified entity or resource could not be found."
  (^com.amazonaws.services.kms.model.GetKeyPolicyResult [^AWSKMSClient this ^com.amazonaws.services.kms.model.GetKeyPolicyRequest request]
    (-> this (.getKeyPolicy request))))

(defn retire-grant
  "Retires a grant. To clean up, you can retire a grant when you're done using it. You should revoke a grant when
   you intend to actively deny operations that depend on it. The following are permitted to call this API:




   The AWS account (root user) under which the grant was created




   The RetiringPrincipal, if present in the grant




   The GranteePrincipal, if RetireGrant is an operation specified in the grant




   You must identify the grant to retire by its grant token or by a combination of the grant ID and the Amazon
   Resource Name (ARN) of the customer master key (CMK). A grant token is a unique variable-length base64-encoded
   string. A grant ID is a 64 character unique identifier of a grant. The CreateGrant operation returns both.

  request - `com.amazonaws.services.kms.model.RetireGrantRequest`

  returns: Result of the RetireGrant operation returned by the service. - `com.amazonaws.services.kms.model.RetireGrantResult`

  throws: com.amazonaws.services.kms.model.InvalidArnException - The request was rejected because a specified ARN, or an ARN in a key policy, is not valid."
  (^com.amazonaws.services.kms.model.RetireGrantResult [^AWSKMSClient this ^com.amazonaws.services.kms.model.RetireGrantRequest request]
    (-> this (.retireGrant request)))
  (^com.amazonaws.services.kms.model.RetireGrantResult [^AWSKMSClient this]
    (-> this (.retireGrant))))

(defn list-key-policies
  "Gets the names of the key policies that are attached to a customer master key (CMK). This operation is designed
   to get policy names that you can use in a GetKeyPolicy operation. However, the only valid policy name is
   default. You cannot perform this operation on a CMK in a different AWS account.

  request - `com.amazonaws.services.kms.model.ListKeyPoliciesRequest`

  returns: Result of the ListKeyPolicies operation returned by the service. - `com.amazonaws.services.kms.model.ListKeyPoliciesResult`

  throws: com.amazonaws.services.kms.model.NotFoundException - The request was rejected because the specified entity or resource could not be found."
  (^com.amazonaws.services.kms.model.ListKeyPoliciesResult [^AWSKMSClient this ^com.amazonaws.services.kms.model.ListKeyPoliciesRequest request]
    (-> this (.listKeyPolicies request))))

(defn put-key-policy
  "Attaches a key policy to the specified customer master key (CMK). You cannot perform this operation on a CMK in a
   different AWS account.


   For more information about key policies, see Key Policies in the AWS Key
   Management Service Developer Guide.

  request - `com.amazonaws.services.kms.model.PutKeyPolicyRequest`

  returns: Result of the PutKeyPolicy operation returned by the service. - `com.amazonaws.services.kms.model.PutKeyPolicyResult`

  throws: com.amazonaws.services.kms.model.NotFoundException - The request was rejected because the specified entity or resource could not be found."
  (^com.amazonaws.services.kms.model.PutKeyPolicyResult [^AWSKMSClient this ^com.amazonaws.services.kms.model.PutKeyPolicyRequest request]
    (-> this (.putKeyPolicy request))))

(defn generate-data-key
  "Generates a unique data key. This operation returns a plaintext copy of the data key and a copy that is encrypted
   under a customer master key (CMK) that you specify. You can use the plaintext key to encrypt your data outside of
   KMS and store the encrypted data key with the encrypted data.


   GenerateDataKey returns a unique data key for each request. The bytes in the key are not related to
   the caller or CMK that is used to encrypt the data key.


   To generate a data key, you need to specify the customer master key (CMK) that will be used to encrypt the data
   key. You must also specify the length of the data key using either the KeySpec or
   NumberOfBytes field (but not both). For common key lengths (128-bit and 256-bit symmetric keys), we
   recommend that you use KeySpec. To perform this operation on a CMK in a different AWS account,
   specify the key ARN or alias ARN in the value of the KeyId parameter.


   You will find the plaintext copy of the data key in the Plaintext field of the response, and the
   encrypted copy of the data key in the CiphertextBlob field.


   We recommend that you use the following pattern to encrypt data locally in your application:




   Use the GenerateDataKey operation to get a data encryption key.




   Use the plaintext data key (returned in the Plaintext field of the response) to encrypt data
   locally, then erase the plaintext data key from memory.




   Store the encrypted data key (returned in the CiphertextBlob field of the response) alongside the
   locally encrypted data.




   To decrypt data locally:




   Use the Decrypt operation to decrypt the encrypted data key. The operation returns a plaintext copy of the
   data key.




   Use the plaintext data key to decrypt data locally, then erase the plaintext data key from memory.




   To get only an encrypted copy of the data key, use GenerateDataKeyWithoutPlaintext. To get a
   cryptographically secure random byte string, use GenerateRandom.


   You can use the optional encryption context to add additional security to your encryption operation. When you
   specify an EncryptionContext in the GenerateDataKey operation, you must specify the
   same encryption context (a case-sensitive exact match) in your request to Decrypt the data key. Otherwise,
   the request to decrypt fails with an InvalidCiphertextException. For more information, see Encryption Context
   in the  AWS Key Management Service Developer Guide .


   The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a
   Customer Master Key in the AWS Key Management Service Developer Guide.

  request - `com.amazonaws.services.kms.model.GenerateDataKeyRequest`

  returns: Result of the GenerateDataKey operation returned by the service. - `com.amazonaws.services.kms.model.GenerateDataKeyResult`

  throws: com.amazonaws.services.kms.model.NotFoundException - The request was rejected because the specified entity or resource could not be found."
  (^com.amazonaws.services.kms.model.GenerateDataKeyResult [^AWSKMSClient this ^com.amazonaws.services.kms.model.GenerateDataKeyRequest request]
    (-> this (.generateDataKey request))))

(defn describe-custom-key-stores
  "Gets information about custom key stores
   in the account and region.


   This operation is part of the Custom Key Store
   feature feature in AWS KMS, which combines the convenience and extensive integration of AWS KMS with the
   isolation and control of a single-tenant key store.


   By default, this operation returns information about all custom key stores in the account and region. To get only
   information about a particular custom key store, use either the CustomKeyStoreName or
   CustomKeyStoreId parameter (but not both).


   To determine whether the custom key store is connected to its AWS CloudHSM cluster, use the
   ConnectionState element in the response. If an attempt to connect the custom key store failed, the
   ConnectionState value is FAILED and the ConnectionErrorCode element in the
   response indicates the cause of the failure. For help interpreting the ConnectionErrorCode, see
   CustomKeyStoresListEntry.


   Custom key stores have a DISCONNECTED connection state if the key store has never been connected or
   you use the DisconnectCustomKeyStore operation to disconnect it. If your custom key store state is
   CONNECTED but you are having trouble using it, make sure that its associated AWS CloudHSM cluster is
   active and contains the minimum number of HSMs required for the operation, if any.


   For help repairing your custom key store, see the Troubleshooting Custom Key
   Stores topic in the AWS Key Management Service Developer Guide.

  request - `com.amazonaws.services.kms.model.DescribeCustomKeyStoresRequest`

  returns: Result of the DescribeCustomKeyStores operation returned by the service. - `com.amazonaws.services.kms.model.DescribeCustomKeyStoresResult`

  throws: com.amazonaws.services.kms.model.CustomKeyStoreNotFoundException - The request was rejected because AWS KMS cannot find a custom key store with the specified key store name or ID."
  (^com.amazonaws.services.kms.model.DescribeCustomKeyStoresResult [^AWSKMSClient this ^com.amazonaws.services.kms.model.DescribeCustomKeyStoresRequest request]
    (-> this (.describeCustomKeyStores request))))

(defn list-resource-tags
  "Returns a list of all tags for the specified customer master key (CMK).


   You cannot perform this operation on a CMK in a different AWS account.

  request - `com.amazonaws.services.kms.model.ListResourceTagsRequest`

  returns: Result of the ListResourceTags operation returned by the service. - `com.amazonaws.services.kms.model.ListResourceTagsResult`

  throws: com.amazonaws.services.kms.model.KMSInternalException - The request was rejected because an internal exception occurred. The request can be retried."
  (^com.amazonaws.services.kms.model.ListResourceTagsResult [^AWSKMSClient this ^com.amazonaws.services.kms.model.ListResourceTagsRequest request]
    (-> this (.listResourceTags request))))

(defn decrypt
  "Decrypts ciphertext. Ciphertext is plaintext that has been previously encrypted by using any of the following
   operations:




   GenerateDataKey




   GenerateDataKeyWithoutPlaintext




   Encrypt




   Whenever possible, use key policies to give users permission to call the Decrypt operation on the CMK, instead of
   IAM policies. Otherwise, you might create an IAM user policy that gives the user Decrypt permission on all CMKs.
   This user could decrypt ciphertext that was encrypted by CMKs in other accounts if the key policy for the
   cross-account CMK permits it. If you must use an IAM policy for Decrypt permissions, limit the user
   to particular CMKs or particular trusted accounts.


   The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a
   Customer Master Key in the AWS Key Management Service Developer Guide.

  request - `com.amazonaws.services.kms.model.DecryptRequest`

  returns: Result of the Decrypt operation returned by the service. - `com.amazonaws.services.kms.model.DecryptResult`

  throws: com.amazonaws.services.kms.model.NotFoundException - The request was rejected because the specified entity or resource could not be found."
  (^com.amazonaws.services.kms.model.DecryptResult [^AWSKMSClient this ^com.amazonaws.services.kms.model.DecryptRequest request]
    (-> this (.decrypt request))))

(defn describe-key
  "Provides detailed information about the specified customer master key (CMK).


   You can use DescribeKey on a predefined AWS alias, that is, an AWS alias with no key ID. When you
   do, AWS KMS associates the alias with an AWS managed CMK and
   returns its KeyId and Arn in the response.


   To perform this operation on a CMK in a different AWS account, specify the key ARN or alias ARN in the value of
   the KeyId parameter.

  request - `com.amazonaws.services.kms.model.DescribeKeyRequest`

  returns: Result of the DescribeKey operation returned by the service. - `com.amazonaws.services.kms.model.DescribeKeyResult`

  throws: com.amazonaws.services.kms.model.NotFoundException - The request was rejected because the specified entity or resource could not be found."
  (^com.amazonaws.services.kms.model.DescribeKeyResult [^AWSKMSClient this ^com.amazonaws.services.kms.model.DescribeKeyRequest request]
    (-> this (.describeKey request))))

(defn disable-key-rotation
  "Disables automatic rotation of
   the key material for the specified customer master key (CMK). You cannot perform this operation on a CMK in a
   different AWS account.


   The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a
   Customer Master Key in the AWS Key Management Service Developer Guide.

  request - `com.amazonaws.services.kms.model.DisableKeyRotationRequest`

  returns: Result of the DisableKeyRotation operation returned by the service. - `com.amazonaws.services.kms.model.DisableKeyRotationResult`

  throws: com.amazonaws.services.kms.model.NotFoundException - The request was rejected because the specified entity or resource could not be found."
  (^com.amazonaws.services.kms.model.DisableKeyRotationResult [^AWSKMSClient this ^com.amazonaws.services.kms.model.DisableKeyRotationRequest request]
    (-> this (.disableKeyRotation request))))

(defn list-aliases
  "Gets a list of aliases in the caller's AWS account and region. You cannot list aliases in other accounts. For
   more information about aliases, see CreateAlias.


   By default, the ListAliases command returns all aliases in the account and region. To get only the aliases that
   point to a particular customer master key (CMK), use the KeyId parameter.


   The ListAliases response can include aliases that you created and associated with your customer
   managed CMKs, and aliases that AWS created and associated with AWS managed CMKs in your account. You can
   recognize AWS aliases because their names have the format aws/<service-name>, such as
   aws/dynamodb.


   The response might also include aliases that have no TargetKeyId field. These are predefined aliases
   that AWS has created but has not yet associated with a CMK. Aliases that AWS creates in your account, including
   predefined aliases, do not count against your AWS KMS aliases limit.

  request - `com.amazonaws.services.kms.model.ListAliasesRequest`

  returns: Result of the ListAliases operation returned by the service. - `com.amazonaws.services.kms.model.ListAliasesResult`

  throws: com.amazonaws.services.kms.model.DependencyTimeoutException - The system timed out while trying to fulfill the request. The request can be retried."
  (^com.amazonaws.services.kms.model.ListAliasesResult [^AWSKMSClient this ^com.amazonaws.services.kms.model.ListAliasesRequest request]
    (-> this (.listAliases request)))
  (^com.amazonaws.services.kms.model.ListAliasesResult [^AWSKMSClient this]
    (-> this (.listAliases))))

(defn list-grants
  "Gets a list of all grants for the specified customer master key (CMK).


   To perform this operation on a CMK in a different AWS account, specify the key ARN in the value of the
   KeyId parameter.

  request - `com.amazonaws.services.kms.model.ListGrantsRequest`

  returns: Result of the ListGrants operation returned by the service. - `com.amazonaws.services.kms.model.ListGrantsResult`

  throws: com.amazonaws.services.kms.model.NotFoundException - The request was rejected because the specified entity or resource could not be found."
  (^com.amazonaws.services.kms.model.ListGrantsResult [^AWSKMSClient this ^com.amazonaws.services.kms.model.ListGrantsRequest request]
    (-> this (.listGrants request))))

(defn re-encrypt
  "Encrypts data on the server side with a new customer master key (CMK) without exposing the plaintext of the data
   on the client side. The data is first decrypted and then reencrypted. You can also use this operation to change
   the encryption context of a ciphertext.


   You can reencrypt data using CMKs in different AWS accounts.


   Unlike other operations, ReEncrypt is authorized twice, once as ReEncryptFrom on the
   source CMK and once as ReEncryptTo on the destination CMK. We recommend that you include the
   \"kms:ReEncrypt*\" permission in your key policies to permit
   reencryption from or to the CMK. This permission is automatically included in the key policy when you create a
   CMK through the console. But you must include it manually when you create a CMK programmatically or when you set
   a key policy with the PutKeyPolicy operation.


   The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a
   Customer Master Key in the AWS Key Management Service Developer Guide.

  request - `com.amazonaws.services.kms.model.ReEncryptRequest`

  returns: Result of the ReEncrypt operation returned by the service. - `com.amazonaws.services.kms.model.ReEncryptResult`

  throws: com.amazonaws.services.kms.model.InvalidKeyUsageException - The request was rejected because the specified KeySpec value is not valid."
  (^com.amazonaws.services.kms.model.ReEncryptResult [^AWSKMSClient this ^com.amazonaws.services.kms.model.ReEncryptRequest request]
    (-> this (.reEncrypt request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSKMSClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn create-grant
  "Adds a grant to a customer master key (CMK). The grant allows the grantee principal to use the CMK when the
   conditions specified in the grant are met. When setting permissions, grants are an alternative to key policies.


   To create a grant that allows a cryptographic operation only when the encryption context in the operation request
   matches or includes a specified encryption context, use the Constraints parameter. For details, see
   GrantConstraints.


   To perform this operation on a CMK in a different AWS account, specify the key ARN in the value of the
   KeyId parameter. For more information about grants, see Grants in the  AWS Key
   Management Service Developer Guide .


   The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a
   Customer Master Key in the AWS Key Management Service Developer Guide.

  request - `com.amazonaws.services.kms.model.CreateGrantRequest`

  returns: Result of the CreateGrant operation returned by the service. - `com.amazonaws.services.kms.model.CreateGrantResult`

  throws: com.amazonaws.services.kms.model.NotFoundException - The request was rejected because the specified entity or resource could not be found."
  (^com.amazonaws.services.kms.model.CreateGrantResult [^AWSKMSClient this ^com.amazonaws.services.kms.model.CreateGrantRequest request]
    (-> this (.createGrant request))))

(defn list-retirable-grants
  "Returns a list of all grants for which the grant's RetiringPrincipal matches the one specified.


   A typical use is to list all grants that you are able to retire. To retire a grant, use RetireGrant.

  request - `com.amazonaws.services.kms.model.ListRetirableGrantsRequest`

  returns: Result of the ListRetirableGrants operation returned by the service. - `com.amazonaws.services.kms.model.ListRetirableGrantsResult`

  throws: com.amazonaws.services.kms.model.DependencyTimeoutException - The system timed out while trying to fulfill the request. The request can be retried."
  (^com.amazonaws.services.kms.model.ListRetirableGrantsResult [^AWSKMSClient this ^com.amazonaws.services.kms.model.ListRetirableGrantsRequest request]
    (-> this (.listRetirableGrants request))))

(defn tag-resource
  "Adds or edits tags for a customer master key (CMK). You cannot perform this operation on a CMK in a different AWS
   account.


   Each tag consists of a tag key and a tag value. Tag keys and tag values are both required, but tag values can be
   empty (null) strings.


   You can only use a tag key once for each CMK. If you use the tag key again, AWS KMS replaces the current tag
   value with the specified value.


   For information about the rules that apply to tag keys and tag values, see User-Defined
   Tag Restrictions in the AWS Billing and Cost Management User Guide.


   The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a
   Customer Master Key in the AWS Key Management Service Developer Guide.

  request - `com.amazonaws.services.kms.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.kms.model.TagResourceResult`

  throws: com.amazonaws.services.kms.model.KMSInternalException - The request was rejected because an internal exception occurred. The request can be retried."
  (^com.amazonaws.services.kms.model.TagResourceResult [^AWSKMSClient this ^com.amazonaws.services.kms.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn disable-key
  "Sets the state of a customer master key (CMK) to disabled, thereby preventing its use for cryptographic
   operations. You cannot perform this operation on a CMK in a different AWS account.


   For more information about how key state affects the use of a CMK, see How Key State Affects the Use of a
   Customer Master Key in the  AWS Key Management Service Developer Guide .


   The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a
   Customer Master Key in the AWS Key Management Service Developer Guide.

  request - `com.amazonaws.services.kms.model.DisableKeyRequest`

  returns: Result of the DisableKey operation returned by the service. - `com.amazonaws.services.kms.model.DisableKeyResult`

  throws: com.amazonaws.services.kms.model.NotFoundException - The request was rejected because the specified entity or resource could not be found."
  (^com.amazonaws.services.kms.model.DisableKeyResult [^AWSKMSClient this ^com.amazonaws.services.kms.model.DisableKeyRequest request]
    (-> this (.disableKey request))))

(defn enable-key
  "Sets the key state of a customer master key (CMK) to enabled. This allows you to use the CMK for cryptographic
   operations. You cannot perform this operation on a CMK in a different AWS account.


   The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a
   Customer Master Key in the AWS Key Management Service Developer Guide.

  request - `com.amazonaws.services.kms.model.EnableKeyRequest`

  returns: Result of the EnableKey operation returned by the service. - `com.amazonaws.services.kms.model.EnableKeyResult`

  throws: com.amazonaws.services.kms.model.NotFoundException - The request was rejected because the specified entity or resource could not be found."
  (^com.amazonaws.services.kms.model.EnableKeyResult [^AWSKMSClient this ^com.amazonaws.services.kms.model.EnableKeyRequest request]
    (-> this (.enableKey request))))

(defn connect-custom-key-store
  "Connects or reconnects a custom key store
   to its associated AWS CloudHSM cluster.


   The custom key store must be connected before you can create customer master keys (CMKs) in the key store or use
   the CMKs it contains. You can disconnect and reconnect a custom key store at any time.


   To connect a custom key store, its associated AWS CloudHSM cluster must have at least one active HSM. To get the
   number of active HSMs in a cluster, use the DescribeClusters
   operation. To add HSMs to the cluster, use the CreateHsm operation.


   The connection process can take an extended amount of time to complete; up to 20 minutes. This operation starts
   the connection process, but it does not wait for it to complete. When it succeeds, this operation quickly returns
   an HTTP 200 response and a JSON object with no properties. However, this response does not indicate that the
   custom key store is connected. To get the connection state of the custom key store, use the
   DescribeCustomKeyStores operation.


   During the connection process, AWS KMS finds the AWS CloudHSM cluster that is associated with the custom key
   store, creates the connection infrastructure, connects to the cluster, logs into the AWS CloudHSM client as the

   kmsuser crypto user (CU), and rotates its password.


   The ConnectCustomKeyStore operation might fail for various reasons. To find the reason, use the
   DescribeCustomKeyStores operation and see the ConnectionErrorCode in the response. For help
   interpreting the ConnectionErrorCode, see CustomKeyStoresListEntry.


   To fix the failure, use the DisconnectCustomKeyStore operation to disconnect the custom key store, correct
   the error, use the UpdateCustomKeyStore operation if necessary, and then use
   ConnectCustomKeyStore again.


   If you are having trouble connecting or disconnecting a custom key store, see Troubleshooting a Custom Key
   Store in the AWS Key Management Service Developer Guide.

  request - `com.amazonaws.services.kms.model.ConnectCustomKeyStoreRequest`

  returns: Result of the ConnectCustomKeyStore operation returned by the service. - `com.amazonaws.services.kms.model.ConnectCustomKeyStoreResult`

  throws: com.amazonaws.services.kms.model.CloudHsmClusterNotActiveException - The request was rejected because the AWS CloudHSM cluster that is associated with the custom key store is not active. Initialize and activate the cluster and try the command again. For detailed instructions, see Getting Started in the AWS CloudHSM User Guide."
  (^com.amazonaws.services.kms.model.ConnectCustomKeyStoreResult [^AWSKMSClient this ^com.amazonaws.services.kms.model.ConnectCustomKeyStoreRequest request]
    (-> this (.connectCustomKeyStore request))))

(defn get-parameters-for-import
  "Returns the items you need in order to import key material into AWS KMS from your existing key management
   infrastructure. For more information about importing key material into AWS KMS, see Importing Key Material in
   the AWS Key Management Service Developer Guide.


   You must specify the key ID of the customer master key (CMK) into which you will import key material. This CMK's
   Origin must be EXTERNAL. You must also specify the wrapping algorithm and type of
   wrapping key (public key) that you will use to encrypt the key material. You cannot perform this operation on a
   CMK in a different AWS account.


   This operation returns a public key and an import token. Use the public key to encrypt the key material. Store
   the import token to send with a subsequent ImportKeyMaterial request. The public key and import token from
   the same response must be used together. These items are valid for 24 hours. When they expire, they cannot be
   used for a subsequent ImportKeyMaterial request. To get new ones, send another
   GetParametersForImport request.


   The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a
   Customer Master Key in the AWS Key Management Service Developer Guide.

  request - `com.amazonaws.services.kms.model.GetParametersForImportRequest`

  returns: Result of the GetParametersForImport operation returned by the service. - `com.amazonaws.services.kms.model.GetParametersForImportResult`

  throws: com.amazonaws.services.kms.model.InvalidArnException - The request was rejected because a specified ARN, or an ARN in a key policy, is not valid."
  (^com.amazonaws.services.kms.model.GetParametersForImportResult [^AWSKMSClient this ^com.amazonaws.services.kms.model.GetParametersForImportRequest request]
    (-> this (.getParametersForImport request))))

(defn update-custom-key-store
  "Changes the properties of a custom key store. Use the CustomKeyStoreId parameter to identify the
   custom key store you want to edit. Use the remaining parameters to change the properties of the custom key store.


   You can only update a custom key store that is disconnected. To disconnect the custom key store, use
   DisconnectCustomKeyStore. To reconnect the custom key store after the update completes, use
   ConnectCustomKeyStore. To find the connection state of a custom key store, use the
   DescribeCustomKeyStores operation.


   Use the parameters of UpdateCustomKeyStore to edit your keystore settings.




   Use the NewCustomKeyStoreName parameter to change the friendly name of the custom key store to the value
   that you specify.





   Use the KeyStorePassword parameter tell AWS KMS the current password of the
   kmsuser crypto user (CU) in the associated AWS CloudHSM cluster. You can use this parameter to
   fix
   connection failures that occur when AWS KMS cannot log into the associated cluster because the
   kmsuser password has changed. This value does not change the password in the AWS CloudHSM cluster.





   Use the CloudHsmClusterId parameter to associate the custom key store with a different, but related, AWS
   CloudHSM cluster. You can use this parameter to repair a custom key store if its AWS CloudHSM cluster becomes
   corrupted or is deleted, or when you need to create or restore a cluster from a backup.




   If the operation succeeds, it returns a JSON object with no properties.


   This operation is part of the Custom Key Store
   feature feature in AWS KMS, which combines the convenience and extensive integration of AWS KMS with the
   isolation and control of a single-tenant key store.

  request - `com.amazonaws.services.kms.model.UpdateCustomKeyStoreRequest`

  returns: Result of the UpdateCustomKeyStore operation returned by the service. - `com.amazonaws.services.kms.model.UpdateCustomKeyStoreResult`

  throws: com.amazonaws.services.kms.model.CustomKeyStoreNotFoundException - The request was rejected because AWS KMS cannot find a custom key store with the specified key store name or ID."
  (^com.amazonaws.services.kms.model.UpdateCustomKeyStoreResult [^AWSKMSClient this ^com.amazonaws.services.kms.model.UpdateCustomKeyStoreRequest request]
    (-> this (.updateCustomKeyStore request))))

