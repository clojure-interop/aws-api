(ns com.amazonaws.services.secretsmanager.AbstractAWSSecretsManagerAsync
  "Abstract implementation of AWSSecretsManagerAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.secretsmanager AbstractAWSSecretsManagerAsync]))

(defn untag-resource-async
  "Description copied from interface: AWSSecretsManagerAsync

  request - `com.amazonaws.services.secretsmanager.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.secretsmanager.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecretsManagerAsync this ^com.amazonaws.services.secretsmanager.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecretsManagerAsync this ^com.amazonaws.services.secretsmanager.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn rotate-secret-async
  "Description copied from interface: AWSSecretsManagerAsync

  request - `com.amazonaws.services.secretsmanager.model.RotateSecretRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RotateSecret operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.secretsmanager.model.RotateSecretResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecretsManagerAsync this ^com.amazonaws.services.secretsmanager.model.RotateSecretRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rotateSecretAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecretsManagerAsync this ^com.amazonaws.services.secretsmanager.model.RotateSecretRequest request]
    (-> this (.rotateSecretAsync request))))

(defn list-secrets-async
  "Description copied from interface: AWSSecretsManagerAsync

  request - `com.amazonaws.services.secretsmanager.model.ListSecretsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSecrets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.secretsmanager.model.ListSecretsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecretsManagerAsync this ^com.amazonaws.services.secretsmanager.model.ListSecretsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSecretsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecretsManagerAsync this ^com.amazonaws.services.secretsmanager.model.ListSecretsRequest request]
    (-> this (.listSecretsAsync request))))

(defn cancel-rotate-secret-async
  "Description copied from interface: AWSSecretsManagerAsync

  request - `com.amazonaws.services.secretsmanager.model.CancelRotateSecretRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelRotateSecret operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.secretsmanager.model.CancelRotateSecretResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecretsManagerAsync this ^com.amazonaws.services.secretsmanager.model.CancelRotateSecretRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelRotateSecretAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecretsManagerAsync this ^com.amazonaws.services.secretsmanager.model.CancelRotateSecretRequest request]
    (-> this (.cancelRotateSecretAsync request))))

(defn update-secret-async
  "Description copied from interface: AWSSecretsManagerAsync

  request - `com.amazonaws.services.secretsmanager.model.UpdateSecretRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSecret operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.secretsmanager.model.UpdateSecretResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecretsManagerAsync this ^com.amazonaws.services.secretsmanager.model.UpdateSecretRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSecretAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecretsManagerAsync this ^com.amazonaws.services.secretsmanager.model.UpdateSecretRequest request]
    (-> this (.updateSecretAsync request))))

(defn describe-secret-async
  "Description copied from interface: AWSSecretsManagerAsync

  request - `com.amazonaws.services.secretsmanager.model.DescribeSecretRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSecret operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.secretsmanager.model.DescribeSecretResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecretsManagerAsync this ^com.amazonaws.services.secretsmanager.model.DescribeSecretRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSecretAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecretsManagerAsync this ^com.amazonaws.services.secretsmanager.model.DescribeSecretRequest request]
    (-> this (.describeSecretAsync request))))

(defn update-secret-version-stage-async
  "Description copied from interface: AWSSecretsManagerAsync

  request - `com.amazonaws.services.secretsmanager.model.UpdateSecretVersionStageRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSecretVersionStage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.secretsmanager.model.UpdateSecretVersionStageResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecretsManagerAsync this ^com.amazonaws.services.secretsmanager.model.UpdateSecretVersionStageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSecretVersionStageAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecretsManagerAsync this ^com.amazonaws.services.secretsmanager.model.UpdateSecretVersionStageRequest request]
    (-> this (.updateSecretVersionStageAsync request))))

(defn get-secret-value-async
  "Description copied from interface: AWSSecretsManagerAsync

  request - `com.amazonaws.services.secretsmanager.model.GetSecretValueRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSecretValue operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.secretsmanager.model.GetSecretValueResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecretsManagerAsync this ^com.amazonaws.services.secretsmanager.model.GetSecretValueRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSecretValueAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecretsManagerAsync this ^com.amazonaws.services.secretsmanager.model.GetSecretValueRequest request]
    (-> this (.getSecretValueAsync request))))

(defn create-secret-async
  "Description copied from interface: AWSSecretsManagerAsync

  request - `com.amazonaws.services.secretsmanager.model.CreateSecretRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSecret operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.secretsmanager.model.CreateSecretResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecretsManagerAsync this ^com.amazonaws.services.secretsmanager.model.CreateSecretRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSecretAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecretsManagerAsync this ^com.amazonaws.services.secretsmanager.model.CreateSecretRequest request]
    (-> this (.createSecretAsync request))))

(defn put-secret-value-async
  "Description copied from interface: AWSSecretsManagerAsync

  request - `com.amazonaws.services.secretsmanager.model.PutSecretValueRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutSecretValue operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.secretsmanager.model.PutSecretValueResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecretsManagerAsync this ^com.amazonaws.services.secretsmanager.model.PutSecretValueRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putSecretValueAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecretsManagerAsync this ^com.amazonaws.services.secretsmanager.model.PutSecretValueRequest request]
    (-> this (.putSecretValueAsync request))))

(defn get-random-password-async
  "Description copied from interface: AWSSecretsManagerAsync

  request - `com.amazonaws.services.secretsmanager.model.GetRandomPasswordRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRandomPassword operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.secretsmanager.model.GetRandomPasswordResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecretsManagerAsync this ^com.amazonaws.services.secretsmanager.model.GetRandomPasswordRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRandomPasswordAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecretsManagerAsync this ^com.amazonaws.services.secretsmanager.model.GetRandomPasswordRequest request]
    (-> this (.getRandomPasswordAsync request))))

(defn delete-resource-policy-async
  "Description copied from interface: AWSSecretsManagerAsync

  request - `com.amazonaws.services.secretsmanager.model.DeleteResourcePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteResourcePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.secretsmanager.model.DeleteResourcePolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecretsManagerAsync this ^com.amazonaws.services.secretsmanager.model.DeleteResourcePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteResourcePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecretsManagerAsync this ^com.amazonaws.services.secretsmanager.model.DeleteResourcePolicyRequest request]
    (-> this (.deleteResourcePolicyAsync request))))

(defn list-secret-version-ids-async
  "Description copied from interface: AWSSecretsManagerAsync

  request - `com.amazonaws.services.secretsmanager.model.ListSecretVersionIdsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSecretVersionIds operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.secretsmanager.model.ListSecretVersionIdsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecretsManagerAsync this ^com.amazonaws.services.secretsmanager.model.ListSecretVersionIdsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSecretVersionIdsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecretsManagerAsync this ^com.amazonaws.services.secretsmanager.model.ListSecretVersionIdsRequest request]
    (-> this (.listSecretVersionIdsAsync request))))

(defn restore-secret-async
  "Description copied from interface: AWSSecretsManagerAsync

  request - `com.amazonaws.services.secretsmanager.model.RestoreSecretRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestoreSecret operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.secretsmanager.model.RestoreSecretResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecretsManagerAsync this ^com.amazonaws.services.secretsmanager.model.RestoreSecretRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restoreSecretAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecretsManagerAsync this ^com.amazonaws.services.secretsmanager.model.RestoreSecretRequest request]
    (-> this (.restoreSecretAsync request))))

(defn put-resource-policy-async
  "Description copied from interface: AWSSecretsManagerAsync

  request - `com.amazonaws.services.secretsmanager.model.PutResourcePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutResourcePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.secretsmanager.model.PutResourcePolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecretsManagerAsync this ^com.amazonaws.services.secretsmanager.model.PutResourcePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putResourcePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecretsManagerAsync this ^com.amazonaws.services.secretsmanager.model.PutResourcePolicyRequest request]
    (-> this (.putResourcePolicyAsync request))))

(defn get-resource-policy-async
  "Description copied from interface: AWSSecretsManagerAsync

  request - `com.amazonaws.services.secretsmanager.model.GetResourcePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetResourcePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.secretsmanager.model.GetResourcePolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecretsManagerAsync this ^com.amazonaws.services.secretsmanager.model.GetResourcePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getResourcePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecretsManagerAsync this ^com.amazonaws.services.secretsmanager.model.GetResourcePolicyRequest request]
    (-> this (.getResourcePolicyAsync request))))

(defn tag-resource-async
  "Description copied from interface: AWSSecretsManagerAsync

  request - `com.amazonaws.services.secretsmanager.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.secretsmanager.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecretsManagerAsync this ^com.amazonaws.services.secretsmanager.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecretsManagerAsync this ^com.amazonaws.services.secretsmanager.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn delete-secret-async
  "Description copied from interface: AWSSecretsManagerAsync

  request - `com.amazonaws.services.secretsmanager.model.DeleteSecretRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSecret operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.secretsmanager.model.DeleteSecretResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecretsManagerAsync this ^com.amazonaws.services.secretsmanager.model.DeleteSecretRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSecretAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecretsManagerAsync this ^com.amazonaws.services.secretsmanager.model.DeleteSecretRequest request]
    (-> this (.deleteSecretAsync request))))

