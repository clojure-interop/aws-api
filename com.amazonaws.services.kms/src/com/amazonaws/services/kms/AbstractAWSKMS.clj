(ns com.amazonaws.services.kms.AbstractAWSKMS
  "Abstract implementation of AWSKMS. Convenient method forms pass through to the corresponding overload that
  takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kms AbstractAWSKMS]))

(defn encrypt
  "Description copied from interface: AWSKMS

  request - `com.amazonaws.services.kms.model.EncryptRequest`

  returns: Result of the Encrypt operation returned by the service. - `com.amazonaws.services.kms.model.EncryptResult`"
  (^com.amazonaws.services.kms.model.EncryptResult [^AbstractAWSKMS this ^com.amazonaws.services.kms.model.EncryptRequest request]
    (-> this (.encrypt request))))

(defn cancel-key-deletion
  "Description copied from interface: AWSKMS

  request - `com.amazonaws.services.kms.model.CancelKeyDeletionRequest`

  returns: Result of the CancelKeyDeletion operation returned by the service. - `com.amazonaws.services.kms.model.CancelKeyDeletionResult`"
  (^com.amazonaws.services.kms.model.CancelKeyDeletionResult [^AbstractAWSKMS this ^com.amazonaws.services.kms.model.CancelKeyDeletionRequest request]
    (-> this (.cancelKeyDeletion request))))

(defn enable-key-rotation
  "Description copied from interface: AWSKMS

  request - `com.amazonaws.services.kms.model.EnableKeyRotationRequest`

  returns: Result of the EnableKeyRotation operation returned by the service. - `com.amazonaws.services.kms.model.EnableKeyRotationResult`"
  (^com.amazonaws.services.kms.model.EnableKeyRotationResult [^AbstractAWSKMS this ^com.amazonaws.services.kms.model.EnableKeyRotationRequest request]
    (-> this (.enableKeyRotation request))))

(defn set-region
  "Description copied from interface: AWSKMS

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAWSKMS this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn import-key-material
  "Description copied from interface: AWSKMS

  request - `com.amazonaws.services.kms.model.ImportKeyMaterialRequest`

  returns: Result of the ImportKeyMaterial operation returned by the service. - `com.amazonaws.services.kms.model.ImportKeyMaterialResult`"
  (^com.amazonaws.services.kms.model.ImportKeyMaterialResult [^AbstractAWSKMS this ^com.amazonaws.services.kms.model.ImportKeyMaterialRequest request]
    (-> this (.importKeyMaterial request))))

(defn disconnect-custom-key-store
  "Description copied from interface: AWSKMS

  request - `com.amazonaws.services.kms.model.DisconnectCustomKeyStoreRequest`

  returns: Result of the DisconnectCustomKeyStore operation returned by the service. - `com.amazonaws.services.kms.model.DisconnectCustomKeyStoreResult`"
  (^com.amazonaws.services.kms.model.DisconnectCustomKeyStoreResult [^AbstractAWSKMS this ^com.amazonaws.services.kms.model.DisconnectCustomKeyStoreRequest request]
    (-> this (.disconnectCustomKeyStore request))))

(defn generate-data-key-without-plaintext
  "Description copied from interface: AWSKMS

  request - `com.amazonaws.services.kms.model.GenerateDataKeyWithoutPlaintextRequest`

  returns: Result of the GenerateDataKeyWithoutPlaintext operation returned by the service. - `com.amazonaws.services.kms.model.GenerateDataKeyWithoutPlaintextResult`"
  (^com.amazonaws.services.kms.model.GenerateDataKeyWithoutPlaintextResult [^AbstractAWSKMS this ^com.amazonaws.services.kms.model.GenerateDataKeyWithoutPlaintextRequest request]
    (-> this (.generateDataKeyWithoutPlaintext request))))

(defn update-key-description
  "Description copied from interface: AWSKMS

  request - `com.amazonaws.services.kms.model.UpdateKeyDescriptionRequest`

  returns: Result of the UpdateKeyDescription operation returned by the service. - `com.amazonaws.services.kms.model.UpdateKeyDescriptionResult`"
  (^com.amazonaws.services.kms.model.UpdateKeyDescriptionResult [^AbstractAWSKMS this ^com.amazonaws.services.kms.model.UpdateKeyDescriptionRequest request]
    (-> this (.updateKeyDescription request))))

(defn untag-resource
  "Description copied from interface: AWSKMS

  request - `com.amazonaws.services.kms.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.kms.model.UntagResourceResult`"
  (^com.amazonaws.services.kms.model.UntagResourceResult [^AbstractAWSKMS this ^com.amazonaws.services.kms.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn delete-custom-key-store
  "Description copied from interface: AWSKMS

  request - `com.amazonaws.services.kms.model.DeleteCustomKeyStoreRequest`

  returns: Result of the DeleteCustomKeyStore operation returned by the service. - `com.amazonaws.services.kms.model.DeleteCustomKeyStoreResult`"
  (^com.amazonaws.services.kms.model.DeleteCustomKeyStoreResult [^AbstractAWSKMS this ^com.amazonaws.services.kms.model.DeleteCustomKeyStoreRequest request]
    (-> this (.deleteCustomKeyStore request))))

(defn delete-imported-key-material
  "Description copied from interface: AWSKMS

  request - `com.amazonaws.services.kms.model.DeleteImportedKeyMaterialRequest`

  returns: Result of the DeleteImportedKeyMaterial operation returned by the service. - `com.amazonaws.services.kms.model.DeleteImportedKeyMaterialResult`"
  (^com.amazonaws.services.kms.model.DeleteImportedKeyMaterialResult [^AbstractAWSKMS this ^com.amazonaws.services.kms.model.DeleteImportedKeyMaterialRequest request]
    (-> this (.deleteImportedKeyMaterial request))))

(defn create-key
  "Description copied from interface: AWSKMS

  request - `com.amazonaws.services.kms.model.CreateKeyRequest`

  returns: Result of the CreateKey operation returned by the service. - `com.amazonaws.services.kms.model.CreateKeyResult`"
  (^com.amazonaws.services.kms.model.CreateKeyResult [^AbstractAWSKMS this ^com.amazonaws.services.kms.model.CreateKeyRequest request]
    (-> this (.createKey request)))
  (^com.amazonaws.services.kms.model.CreateKeyResult [^AbstractAWSKMS this]
    (-> this (.createKey))))

(defn create-alias
  "Description copied from interface: AWSKMS

  request - `com.amazonaws.services.kms.model.CreateAliasRequest`

  returns: Result of the CreateAlias operation returned by the service. - `com.amazonaws.services.kms.model.CreateAliasResult`"
  (^com.amazonaws.services.kms.model.CreateAliasResult [^AbstractAWSKMS this ^com.amazonaws.services.kms.model.CreateAliasRequest request]
    (-> this (.createAlias request))))

(defn delete-alias
  "Description copied from interface: AWSKMS

  request - `com.amazonaws.services.kms.model.DeleteAliasRequest`

  returns: Result of the DeleteAlias operation returned by the service. - `com.amazonaws.services.kms.model.DeleteAliasResult`"
  (^com.amazonaws.services.kms.model.DeleteAliasResult [^AbstractAWSKMS this ^com.amazonaws.services.kms.model.DeleteAliasRequest request]
    (-> this (.deleteAlias request))))

(defn revoke-grant
  "Description copied from interface: AWSKMS

  request - `com.amazonaws.services.kms.model.RevokeGrantRequest`

  returns: Result of the RevokeGrant operation returned by the service. - `com.amazonaws.services.kms.model.RevokeGrantResult`"
  (^com.amazonaws.services.kms.model.RevokeGrantResult [^AbstractAWSKMS this ^com.amazonaws.services.kms.model.RevokeGrantRequest request]
    (-> this (.revokeGrant request))))

(defn list-keys
  "Description copied from interface: AWSKMS

  request - `com.amazonaws.services.kms.model.ListKeysRequest`

  returns: Result of the ListKeys operation returned by the service. - `com.amazonaws.services.kms.model.ListKeysResult`"
  (^com.amazonaws.services.kms.model.ListKeysResult [^AbstractAWSKMS this ^com.amazonaws.services.kms.model.ListKeysRequest request]
    (-> this (.listKeys request)))
  (^com.amazonaws.services.kms.model.ListKeysResult [^AbstractAWSKMS this]
    (-> this (.listKeys))))

(defn schedule-key-deletion
  "Description copied from interface: AWSKMS

  request - `com.amazonaws.services.kms.model.ScheduleKeyDeletionRequest`

  returns: Result of the ScheduleKeyDeletion operation returned by the service. - `com.amazonaws.services.kms.model.ScheduleKeyDeletionResult`"
  (^com.amazonaws.services.kms.model.ScheduleKeyDeletionResult [^AbstractAWSKMS this ^com.amazonaws.services.kms.model.ScheduleKeyDeletionRequest request]
    (-> this (.scheduleKeyDeletion request))))

(defn shutdown
  "Description copied from interface: AWSKMS"
  ([^AbstractAWSKMS this]
    (-> this (.shutdown))))

(defn get-key-rotation-status
  "Description copied from interface: AWSKMS

  request - `com.amazonaws.services.kms.model.GetKeyRotationStatusRequest`

  returns: Result of the GetKeyRotationStatus operation returned by the service. - `com.amazonaws.services.kms.model.GetKeyRotationStatusResult`"
  (^com.amazonaws.services.kms.model.GetKeyRotationStatusResult [^AbstractAWSKMS this ^com.amazonaws.services.kms.model.GetKeyRotationStatusRequest request]
    (-> this (.getKeyRotationStatus request))))

(defn create-custom-key-store
  "Description copied from interface: AWSKMS

  request - `com.amazonaws.services.kms.model.CreateCustomKeyStoreRequest`

  returns: Result of the CreateCustomKeyStore operation returned by the service. - `com.amazonaws.services.kms.model.CreateCustomKeyStoreResult`"
  (^com.amazonaws.services.kms.model.CreateCustomKeyStoreResult [^AbstractAWSKMS this ^com.amazonaws.services.kms.model.CreateCustomKeyStoreRequest request]
    (-> this (.createCustomKeyStore request))))

(defn update-alias
  "Description copied from interface: AWSKMS

  request - `com.amazonaws.services.kms.model.UpdateAliasRequest`

  returns: Result of the UpdateAlias operation returned by the service. - `com.amazonaws.services.kms.model.UpdateAliasResult`"
  (^com.amazonaws.services.kms.model.UpdateAliasResult [^AbstractAWSKMS this ^com.amazonaws.services.kms.model.UpdateAliasRequest request]
    (-> this (.updateAlias request))))

(defn set-endpoint
  "Description copied from interface: AWSKMS

  endpoint - The endpoint (ex: \"kms.us-east-1.amazonaws.com/\") or a full URL, including the protocol (ex: \"https://kms.us-east-1.amazonaws.com/\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAWSKMS this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn generate-random
  "Description copied from interface: AWSKMS

  request - `com.amazonaws.services.kms.model.GenerateRandomRequest`

  returns: Result of the GenerateRandom operation returned by the service. - `com.amazonaws.services.kms.model.GenerateRandomResult`"
  (^com.amazonaws.services.kms.model.GenerateRandomResult [^AbstractAWSKMS this ^com.amazonaws.services.kms.model.GenerateRandomRequest request]
    (-> this (.generateRandom request)))
  (^com.amazonaws.services.kms.model.GenerateRandomResult [^AbstractAWSKMS this]
    (-> this (.generateRandom))))

(defn get-key-policy
  "Description copied from interface: AWSKMS

  request - `com.amazonaws.services.kms.model.GetKeyPolicyRequest`

  returns: Result of the GetKeyPolicy operation returned by the service. - `com.amazonaws.services.kms.model.GetKeyPolicyResult`"
  (^com.amazonaws.services.kms.model.GetKeyPolicyResult [^AbstractAWSKMS this ^com.amazonaws.services.kms.model.GetKeyPolicyRequest request]
    (-> this (.getKeyPolicy request))))

(defn retire-grant
  "Description copied from interface: AWSKMS

  request - `com.amazonaws.services.kms.model.RetireGrantRequest`

  returns: Result of the RetireGrant operation returned by the service. - `com.amazonaws.services.kms.model.RetireGrantResult`"
  (^com.amazonaws.services.kms.model.RetireGrantResult [^AbstractAWSKMS this ^com.amazonaws.services.kms.model.RetireGrantRequest request]
    (-> this (.retireGrant request)))
  (^com.amazonaws.services.kms.model.RetireGrantResult [^AbstractAWSKMS this]
    (-> this (.retireGrant))))

(defn list-key-policies
  "Description copied from interface: AWSKMS

  request - `com.amazonaws.services.kms.model.ListKeyPoliciesRequest`

  returns: Result of the ListKeyPolicies operation returned by the service. - `com.amazonaws.services.kms.model.ListKeyPoliciesResult`"
  (^com.amazonaws.services.kms.model.ListKeyPoliciesResult [^AbstractAWSKMS this ^com.amazonaws.services.kms.model.ListKeyPoliciesRequest request]
    (-> this (.listKeyPolicies request))))

(defn put-key-policy
  "Description copied from interface: AWSKMS

  request - `com.amazonaws.services.kms.model.PutKeyPolicyRequest`

  returns: Result of the PutKeyPolicy operation returned by the service. - `com.amazonaws.services.kms.model.PutKeyPolicyResult`"
  (^com.amazonaws.services.kms.model.PutKeyPolicyResult [^AbstractAWSKMS this ^com.amazonaws.services.kms.model.PutKeyPolicyRequest request]
    (-> this (.putKeyPolicy request))))

(defn generate-data-key
  "Description copied from interface: AWSKMS

  request - `com.amazonaws.services.kms.model.GenerateDataKeyRequest`

  returns: Result of the GenerateDataKey operation returned by the service. - `com.amazonaws.services.kms.model.GenerateDataKeyResult`"
  (^com.amazonaws.services.kms.model.GenerateDataKeyResult [^AbstractAWSKMS this ^com.amazonaws.services.kms.model.GenerateDataKeyRequest request]
    (-> this (.generateDataKey request))))

(defn describe-custom-key-stores
  "Description copied from interface: AWSKMS

  request - `com.amazonaws.services.kms.model.DescribeCustomKeyStoresRequest`

  returns: Result of the DescribeCustomKeyStores operation returned by the service. - `com.amazonaws.services.kms.model.DescribeCustomKeyStoresResult`"
  (^com.amazonaws.services.kms.model.DescribeCustomKeyStoresResult [^AbstractAWSKMS this ^com.amazonaws.services.kms.model.DescribeCustomKeyStoresRequest request]
    (-> this (.describeCustomKeyStores request))))

(defn list-resource-tags
  "Description copied from interface: AWSKMS

  request - `com.amazonaws.services.kms.model.ListResourceTagsRequest`

  returns: Result of the ListResourceTags operation returned by the service. - `com.amazonaws.services.kms.model.ListResourceTagsResult`"
  (^com.amazonaws.services.kms.model.ListResourceTagsResult [^AbstractAWSKMS this ^com.amazonaws.services.kms.model.ListResourceTagsRequest request]
    (-> this (.listResourceTags request))))

(defn decrypt
  "Description copied from interface: AWSKMS

  request - `com.amazonaws.services.kms.model.DecryptRequest`

  returns: Result of the Decrypt operation returned by the service. - `com.amazonaws.services.kms.model.DecryptResult`"
  (^com.amazonaws.services.kms.model.DecryptResult [^AbstractAWSKMS this ^com.amazonaws.services.kms.model.DecryptRequest request]
    (-> this (.decrypt request))))

(defn describe-key
  "Description copied from interface: AWSKMS

  request - `com.amazonaws.services.kms.model.DescribeKeyRequest`

  returns: Result of the DescribeKey operation returned by the service. - `com.amazonaws.services.kms.model.DescribeKeyResult`"
  (^com.amazonaws.services.kms.model.DescribeKeyResult [^AbstractAWSKMS this ^com.amazonaws.services.kms.model.DescribeKeyRequest request]
    (-> this (.describeKey request))))

(defn disable-key-rotation
  "Description copied from interface: AWSKMS

  request - `com.amazonaws.services.kms.model.DisableKeyRotationRequest`

  returns: Result of the DisableKeyRotation operation returned by the service. - `com.amazonaws.services.kms.model.DisableKeyRotationResult`"
  (^com.amazonaws.services.kms.model.DisableKeyRotationResult [^AbstractAWSKMS this ^com.amazonaws.services.kms.model.DisableKeyRotationRequest request]
    (-> this (.disableKeyRotation request))))

(defn list-aliases
  "Description copied from interface: AWSKMS

  request - `com.amazonaws.services.kms.model.ListAliasesRequest`

  returns: Result of the ListAliases operation returned by the service. - `com.amazonaws.services.kms.model.ListAliasesResult`"
  (^com.amazonaws.services.kms.model.ListAliasesResult [^AbstractAWSKMS this ^com.amazonaws.services.kms.model.ListAliasesRequest request]
    (-> this (.listAliases request)))
  (^com.amazonaws.services.kms.model.ListAliasesResult [^AbstractAWSKMS this]
    (-> this (.listAliases))))

(defn list-grants
  "Description copied from interface: AWSKMS

  request - `com.amazonaws.services.kms.model.ListGrantsRequest`

  returns: Result of the ListGrants operation returned by the service. - `com.amazonaws.services.kms.model.ListGrantsResult`"
  (^com.amazonaws.services.kms.model.ListGrantsResult [^AbstractAWSKMS this ^com.amazonaws.services.kms.model.ListGrantsRequest request]
    (-> this (.listGrants request))))

(defn re-encrypt
  "Description copied from interface: AWSKMS

  request - `com.amazonaws.services.kms.model.ReEncryptRequest`

  returns: Result of the ReEncrypt operation returned by the service. - `com.amazonaws.services.kms.model.ReEncryptResult`"
  (^com.amazonaws.services.kms.model.ReEncryptResult [^AbstractAWSKMS this ^com.amazonaws.services.kms.model.ReEncryptRequest request]
    (-> this (.reEncrypt request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSKMS

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSKMS this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn create-grant
  "Description copied from interface: AWSKMS

  request - `com.amazonaws.services.kms.model.CreateGrantRequest`

  returns: Result of the CreateGrant operation returned by the service. - `com.amazonaws.services.kms.model.CreateGrantResult`"
  (^com.amazonaws.services.kms.model.CreateGrantResult [^AbstractAWSKMS this ^com.amazonaws.services.kms.model.CreateGrantRequest request]
    (-> this (.createGrant request))))

(defn list-retirable-grants
  "Description copied from interface: AWSKMS

  request - `com.amazonaws.services.kms.model.ListRetirableGrantsRequest`

  returns: Result of the ListRetirableGrants operation returned by the service. - `com.amazonaws.services.kms.model.ListRetirableGrantsResult`"
  (^com.amazonaws.services.kms.model.ListRetirableGrantsResult [^AbstractAWSKMS this ^com.amazonaws.services.kms.model.ListRetirableGrantsRequest request]
    (-> this (.listRetirableGrants request))))

(defn tag-resource
  "Description copied from interface: AWSKMS

  request - `com.amazonaws.services.kms.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.kms.model.TagResourceResult`"
  (^com.amazonaws.services.kms.model.TagResourceResult [^AbstractAWSKMS this ^com.amazonaws.services.kms.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn disable-key
  "Description copied from interface: AWSKMS

  request - `com.amazonaws.services.kms.model.DisableKeyRequest`

  returns: Result of the DisableKey operation returned by the service. - `com.amazonaws.services.kms.model.DisableKeyResult`"
  (^com.amazonaws.services.kms.model.DisableKeyResult [^AbstractAWSKMS this ^com.amazonaws.services.kms.model.DisableKeyRequest request]
    (-> this (.disableKey request))))

(defn enable-key
  "Description copied from interface: AWSKMS

  request - `com.amazonaws.services.kms.model.EnableKeyRequest`

  returns: Result of the EnableKey operation returned by the service. - `com.amazonaws.services.kms.model.EnableKeyResult`"
  (^com.amazonaws.services.kms.model.EnableKeyResult [^AbstractAWSKMS this ^com.amazonaws.services.kms.model.EnableKeyRequest request]
    (-> this (.enableKey request))))

(defn connect-custom-key-store
  "Description copied from interface: AWSKMS

  request - `com.amazonaws.services.kms.model.ConnectCustomKeyStoreRequest`

  returns: Result of the ConnectCustomKeyStore operation returned by the service. - `com.amazonaws.services.kms.model.ConnectCustomKeyStoreResult`"
  (^com.amazonaws.services.kms.model.ConnectCustomKeyStoreResult [^AbstractAWSKMS this ^com.amazonaws.services.kms.model.ConnectCustomKeyStoreRequest request]
    (-> this (.connectCustomKeyStore request))))

(defn get-parameters-for-import
  "Description copied from interface: AWSKMS

  request - `com.amazonaws.services.kms.model.GetParametersForImportRequest`

  returns: Result of the GetParametersForImport operation returned by the service. - `com.amazonaws.services.kms.model.GetParametersForImportResult`"
  (^com.amazonaws.services.kms.model.GetParametersForImportResult [^AbstractAWSKMS this ^com.amazonaws.services.kms.model.GetParametersForImportRequest request]
    (-> this (.getParametersForImport request))))

(defn update-custom-key-store
  "Description copied from interface: AWSKMS

  request - `com.amazonaws.services.kms.model.UpdateCustomKeyStoreRequest`

  returns: Result of the UpdateCustomKeyStore operation returned by the service. - `com.amazonaws.services.kms.model.UpdateCustomKeyStoreResult`"
  (^com.amazonaws.services.kms.model.UpdateCustomKeyStoreResult [^AbstractAWSKMS this ^com.amazonaws.services.kms.model.UpdateCustomKeyStoreRequest request]
    (-> this (.updateCustomKeyStore request))))

