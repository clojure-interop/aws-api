(ns com.amazonaws.services.secretsmanager.AbstractAWSSecretsManager
  "Abstract implementation of AWSSecretsManager. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.secretsmanager AbstractAWSSecretsManager]))

(defn list-secrets
  "Description copied from interface: AWSSecretsManager

  request - `com.amazonaws.services.secretsmanager.model.ListSecretsRequest`

  returns: Result of the ListSecrets operation returned by the service. - `com.amazonaws.services.secretsmanager.model.ListSecretsResult`"
  (^com.amazonaws.services.secretsmanager.model.ListSecretsResult [^AbstractAWSSecretsManager this ^com.amazonaws.services.secretsmanager.model.ListSecretsRequest request]
    (-> this (.listSecrets request))))

(defn delete-resource-policy
  "Description copied from interface: AWSSecretsManager

  request - `com.amazonaws.services.secretsmanager.model.DeleteResourcePolicyRequest`

  returns: Result of the DeleteResourcePolicy operation returned by the service. - `com.amazonaws.services.secretsmanager.model.DeleteResourcePolicyResult`"
  (^com.amazonaws.services.secretsmanager.model.DeleteResourcePolicyResult [^AbstractAWSSecretsManager this ^com.amazonaws.services.secretsmanager.model.DeleteResourcePolicyRequest request]
    (-> this (.deleteResourcePolicy request))))

(defn untag-resource
  "Description copied from interface: AWSSecretsManager

  request - `com.amazonaws.services.secretsmanager.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.secretsmanager.model.UntagResourceResult`"
  (^com.amazonaws.services.secretsmanager.model.UntagResourceResult [^AbstractAWSSecretsManager this ^com.amazonaws.services.secretsmanager.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn put-secret-value
  "Description copied from interface: AWSSecretsManager

  request - `com.amazonaws.services.secretsmanager.model.PutSecretValueRequest`

  returns: Result of the PutSecretValue operation returned by the service. - `com.amazonaws.services.secretsmanager.model.PutSecretValueResult`"
  (^com.amazonaws.services.secretsmanager.model.PutSecretValueResult [^AbstractAWSSecretsManager this ^com.amazonaws.services.secretsmanager.model.PutSecretValueRequest request]
    (-> this (.putSecretValue request))))

(defn cancel-rotate-secret
  "Description copied from interface: AWSSecretsManager

  request - `com.amazonaws.services.secretsmanager.model.CancelRotateSecretRequest`

  returns: Result of the CancelRotateSecret operation returned by the service. - `com.amazonaws.services.secretsmanager.model.CancelRotateSecretResult`"
  (^com.amazonaws.services.secretsmanager.model.CancelRotateSecretResult [^AbstractAWSSecretsManager this ^com.amazonaws.services.secretsmanager.model.CancelRotateSecretRequest request]
    (-> this (.cancelRotateSecret request))))

(defn put-resource-policy
  "Description copied from interface: AWSSecretsManager

  request - `com.amazonaws.services.secretsmanager.model.PutResourcePolicyRequest`

  returns: Result of the PutResourcePolicy operation returned by the service. - `com.amazonaws.services.secretsmanager.model.PutResourcePolicyResult`"
  (^com.amazonaws.services.secretsmanager.model.PutResourcePolicyResult [^AbstractAWSSecretsManager this ^com.amazonaws.services.secretsmanager.model.PutResourcePolicyRequest request]
    (-> this (.putResourcePolicy request))))

(defn restore-secret
  "Description copied from interface: AWSSecretsManager

  request - `com.amazonaws.services.secretsmanager.model.RestoreSecretRequest`

  returns: Result of the RestoreSecret operation returned by the service. - `com.amazonaws.services.secretsmanager.model.RestoreSecretResult`"
  (^com.amazonaws.services.secretsmanager.model.RestoreSecretResult [^AbstractAWSSecretsManager this ^com.amazonaws.services.secretsmanager.model.RestoreSecretRequest request]
    (-> this (.restoreSecret request))))

(defn describe-secret
  "Description copied from interface: AWSSecretsManager

  request - `com.amazonaws.services.secretsmanager.model.DescribeSecretRequest`

  returns: Result of the DescribeSecret operation returned by the service. - `com.amazonaws.services.secretsmanager.model.DescribeSecretResult`"
  (^com.amazonaws.services.secretsmanager.model.DescribeSecretResult [^AbstractAWSSecretsManager this ^com.amazonaws.services.secretsmanager.model.DescribeSecretRequest request]
    (-> this (.describeSecret request))))

(defn shutdown
  "Description copied from interface: AWSSecretsManager"
  ([^AbstractAWSSecretsManager this]
    (-> this (.shutdown))))

(defn update-secret
  "Description copied from interface: AWSSecretsManager

  request - `com.amazonaws.services.secretsmanager.model.UpdateSecretRequest`

  returns: Result of the UpdateSecret operation returned by the service. - `com.amazonaws.services.secretsmanager.model.UpdateSecretResult`"
  (^com.amazonaws.services.secretsmanager.model.UpdateSecretResult [^AbstractAWSSecretsManager this ^com.amazonaws.services.secretsmanager.model.UpdateSecretRequest request]
    (-> this (.updateSecret request))))

(defn update-secret-version-stage
  "Description copied from interface: AWSSecretsManager

  request - `com.amazonaws.services.secretsmanager.model.UpdateSecretVersionStageRequest`

  returns: Result of the UpdateSecretVersionStage operation returned by the service. - `com.amazonaws.services.secretsmanager.model.UpdateSecretVersionStageResult`"
  (^com.amazonaws.services.secretsmanager.model.UpdateSecretVersionStageResult [^AbstractAWSSecretsManager this ^com.amazonaws.services.secretsmanager.model.UpdateSecretVersionStageRequest request]
    (-> this (.updateSecretVersionStage request))))

(defn rotate-secret
  "Description copied from interface: AWSSecretsManager

  request - `com.amazonaws.services.secretsmanager.model.RotateSecretRequest`

  returns: Result of the RotateSecret operation returned by the service. - `com.amazonaws.services.secretsmanager.model.RotateSecretResult`"
  (^com.amazonaws.services.secretsmanager.model.RotateSecretResult [^AbstractAWSSecretsManager this ^com.amazonaws.services.secretsmanager.model.RotateSecretRequest request]
    (-> this (.rotateSecret request))))

(defn delete-secret
  "Description copied from interface: AWSSecretsManager

  request - `com.amazonaws.services.secretsmanager.model.DeleteSecretRequest`

  returns: Result of the DeleteSecret operation returned by the service. - `com.amazonaws.services.secretsmanager.model.DeleteSecretResult`"
  (^com.amazonaws.services.secretsmanager.model.DeleteSecretResult [^AbstractAWSSecretsManager this ^com.amazonaws.services.secretsmanager.model.DeleteSecretRequest request]
    (-> this (.deleteSecret request))))

(defn get-resource-policy
  "Description copied from interface: AWSSecretsManager

  request - `com.amazonaws.services.secretsmanager.model.GetResourcePolicyRequest`

  returns: Result of the GetResourcePolicy operation returned by the service. - `com.amazonaws.services.secretsmanager.model.GetResourcePolicyResult`"
  (^com.amazonaws.services.secretsmanager.model.GetResourcePolicyResult [^AbstractAWSSecretsManager this ^com.amazonaws.services.secretsmanager.model.GetResourcePolicyRequest request]
    (-> this (.getResourcePolicy request))))

(defn list-secret-version-ids
  "Description copied from interface: AWSSecretsManager

  request - `com.amazonaws.services.secretsmanager.model.ListSecretVersionIdsRequest`

  returns: Result of the ListSecretVersionIds operation returned by the service. - `com.amazonaws.services.secretsmanager.model.ListSecretVersionIdsResult`"
  (^com.amazonaws.services.secretsmanager.model.ListSecretVersionIdsResult [^AbstractAWSSecretsManager this ^com.amazonaws.services.secretsmanager.model.ListSecretVersionIdsRequest request]
    (-> this (.listSecretVersionIds request))))

(defn create-secret
  "Description copied from interface: AWSSecretsManager

  request - `com.amazonaws.services.secretsmanager.model.CreateSecretRequest`

  returns: Result of the CreateSecret operation returned by the service. - `com.amazonaws.services.secretsmanager.model.CreateSecretResult`"
  (^com.amazonaws.services.secretsmanager.model.CreateSecretResult [^AbstractAWSSecretsManager this ^com.amazonaws.services.secretsmanager.model.CreateSecretRequest request]
    (-> this (.createSecret request))))

(defn get-secret-value
  "Description copied from interface: AWSSecretsManager

  request - `com.amazonaws.services.secretsmanager.model.GetSecretValueRequest`

  returns: Result of the GetSecretValue operation returned by the service. - `com.amazonaws.services.secretsmanager.model.GetSecretValueResult`"
  (^com.amazonaws.services.secretsmanager.model.GetSecretValueResult [^AbstractAWSSecretsManager this ^com.amazonaws.services.secretsmanager.model.GetSecretValueRequest request]
    (-> this (.getSecretValue request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSSecretsManager

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSSecretsManager this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-random-password
  "Description copied from interface: AWSSecretsManager

  request - `com.amazonaws.services.secretsmanager.model.GetRandomPasswordRequest`

  returns: Result of the GetRandomPassword operation returned by the service. - `com.amazonaws.services.secretsmanager.model.GetRandomPasswordResult`"
  (^com.amazonaws.services.secretsmanager.model.GetRandomPasswordResult [^AbstractAWSSecretsManager this ^com.amazonaws.services.secretsmanager.model.GetRandomPasswordRequest request]
    (-> this (.getRandomPassword request))))

(defn tag-resource
  "Description copied from interface: AWSSecretsManager

  request - `com.amazonaws.services.secretsmanager.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.secretsmanager.model.TagResourceResult`"
  (^com.amazonaws.services.secretsmanager.model.TagResourceResult [^AbstractAWSSecretsManager this ^com.amazonaws.services.secretsmanager.model.TagResourceRequest request]
    (-> this (.tagResource request))))

