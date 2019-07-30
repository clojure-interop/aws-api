(ns com.amazonaws.services.secretsmanager.AWSSecretsManagerAsyncClient
  "Client for accessing AWS Secrets Manager asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  AWS Secrets Manager API Reference

  AWS Secrets Manager is a web service that enables you to store, manage, and retrieve, secrets.


  This guide provides descriptions of the Secrets Manager API. For more information about using this service, see the
  AWS Secrets Manager User
  Guide.


  API Version


  This version of the Secrets Manager API Reference documents the Secrets Manager API version 2017-10-17.



  As an alternative to using the API directly, you can use one of the AWS SDKs, which consist of libraries and sample
  code for various programming languages and platforms (such as Java, Ruby, .NET, iOS, and Android). The SDKs provide a
  convenient way to create programmatic access to AWS Secrets Manager. For example, the SDKs take care of
  cryptographically signing requests, managing errors, and retrying requests automatically. For more information about
  the AWS SDKs, including how to download and install them, see Tools for Amazon
  Web Services.



  We recommend that you use the AWS SDKs to make programmatic API calls to Secrets Manager. However, you also can use
  the Secrets Manager HTTP Query API to make direct calls to the Secrets Manager web service. To learn more about the
  Secrets Manager HTTP Query API, see Making Query Requests in
  the AWS Secrets Manager User Guide.


  Secrets Manager supports GET and POST requests for all actions. That is, the API doesn't require you to use GET for
  some actions and POST for others. However, GET requests are subject to the limitation size of a URL. Therefore, for
  operations that require larger sizes, use a POST request.


  Support and Feedback for AWS Secrets Manager


  We welcome your feedback. Send your comments to awssecretsmanager-feedback@amazon.com, or post your feedback
  and questions in the AWS Secrets Manager Discussion
  Forum. For more information about the AWS Discussion Forums, see Forums Help.


  How examples are presented


  The JSON that AWS Secrets Manager expects as your request parameters and that the service returns as a response to
  HTTP query requests are single, long strings without line breaks or white space formatting. The JSON shown in the
  examples is formatted with both line breaks and white space to improve readability. When example input parameters
  would also result in long strings that extend beyond the screen, we insert line breaks to enhance readability. You
  should always submit the input as a single JSON text string.


  Logging API Requests


  AWS Secrets Manager supports AWS CloudTrail, a service that records AWS API calls for your AWS account and delivers
  log files to an Amazon S3 bucket. By using information that's collected by AWS CloudTrail, you can determine which
  requests were successfully made to Secrets Manager, who made the request, when it was made, and so on. For more about
  AWS Secrets Manager and its support for AWS CloudTrail, see Logging AWS
  Secrets Manager Events with AWS CloudTrail in the AWS Secrets Manager User Guide. To learn more about
  CloudTrail, including how to turn it on and find your log files, see the AWS CloudTrail
  User Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.secretsmanager AWSSecretsManagerAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.secretsmanager.AWSSecretsManagerAsyncClientBuilder`"
  (^com.amazonaws.services.secretsmanager.AWSSecretsManagerAsyncClientBuilder []
    (AWSSecretsManagerAsyncClient/asyncBuilder )))

(defn untag-resource-async
  "Description copied from interface: AWSSecretsManagerAsync

  request - `com.amazonaws.services.secretsmanager.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.secretsmanager.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSSecretsManagerAsyncClient this ^com.amazonaws.services.secretsmanager.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSSecretsManagerAsyncClient this ^com.amazonaws.services.secretsmanager.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn rotate-secret-async
  "Description copied from interface: AWSSecretsManagerAsync

  request - `com.amazonaws.services.secretsmanager.model.RotateSecretRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RotateSecret operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.secretsmanager.model.RotateSecretResult>`"
  (^java.util.concurrent.Future [^AWSSecretsManagerAsyncClient this ^com.amazonaws.services.secretsmanager.model.RotateSecretRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rotateSecretAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSSecretsManagerAsyncClient this ^com.amazonaws.services.secretsmanager.model.RotateSecretRequest request]
    (-> this (.rotateSecretAsync request))))

(defn list-secrets-async
  "Description copied from interface: AWSSecretsManagerAsync

  request - `com.amazonaws.services.secretsmanager.model.ListSecretsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSecrets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.secretsmanager.model.ListSecretsResult>`"
  (^java.util.concurrent.Future [^AWSSecretsManagerAsyncClient this ^com.amazonaws.services.secretsmanager.model.ListSecretsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSecretsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSSecretsManagerAsyncClient this ^com.amazonaws.services.secretsmanager.model.ListSecretsRequest request]
    (-> this (.listSecretsAsync request))))

(defn cancel-rotate-secret-async
  "Description copied from interface: AWSSecretsManagerAsync

  request - `com.amazonaws.services.secretsmanager.model.CancelRotateSecretRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelRotateSecret operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.secretsmanager.model.CancelRotateSecretResult>`"
  (^java.util.concurrent.Future [^AWSSecretsManagerAsyncClient this ^com.amazonaws.services.secretsmanager.model.CancelRotateSecretRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelRotateSecretAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSSecretsManagerAsyncClient this ^com.amazonaws.services.secretsmanager.model.CancelRotateSecretRequest request]
    (-> this (.cancelRotateSecretAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSSecretsManagerAsyncClient this]
    (-> this (.getExecutorService))))

(defn update-secret-async
  "Description copied from interface: AWSSecretsManagerAsync

  request - `com.amazonaws.services.secretsmanager.model.UpdateSecretRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSecret operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.secretsmanager.model.UpdateSecretResult>`"
  (^java.util.concurrent.Future [^AWSSecretsManagerAsyncClient this ^com.amazonaws.services.secretsmanager.model.UpdateSecretRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSecretAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSSecretsManagerAsyncClient this ^com.amazonaws.services.secretsmanager.model.UpdateSecretRequest request]
    (-> this (.updateSecretAsync request))))

(defn describe-secret-async
  "Description copied from interface: AWSSecretsManagerAsync

  request - `com.amazonaws.services.secretsmanager.model.DescribeSecretRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSecret operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.secretsmanager.model.DescribeSecretResult>`"
  (^java.util.concurrent.Future [^AWSSecretsManagerAsyncClient this ^com.amazonaws.services.secretsmanager.model.DescribeSecretRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSecretAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSSecretsManagerAsyncClient this ^com.amazonaws.services.secretsmanager.model.DescribeSecretRequest request]
    (-> this (.describeSecretAsync request))))

(defn update-secret-version-stage-async
  "Description copied from interface: AWSSecretsManagerAsync

  request - `com.amazonaws.services.secretsmanager.model.UpdateSecretVersionStageRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSecretVersionStage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.secretsmanager.model.UpdateSecretVersionStageResult>`"
  (^java.util.concurrent.Future [^AWSSecretsManagerAsyncClient this ^com.amazonaws.services.secretsmanager.model.UpdateSecretVersionStageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSecretVersionStageAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSSecretsManagerAsyncClient this ^com.amazonaws.services.secretsmanager.model.UpdateSecretVersionStageRequest request]
    (-> this (.updateSecretVersionStageAsync request))))

(defn get-secret-value-async
  "Description copied from interface: AWSSecretsManagerAsync

  request - `com.amazonaws.services.secretsmanager.model.GetSecretValueRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSecretValue operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.secretsmanager.model.GetSecretValueResult>`"
  (^java.util.concurrent.Future [^AWSSecretsManagerAsyncClient this ^com.amazonaws.services.secretsmanager.model.GetSecretValueRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSecretValueAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSSecretsManagerAsyncClient this ^com.amazonaws.services.secretsmanager.model.GetSecretValueRequest request]
    (-> this (.getSecretValueAsync request))))

(defn create-secret-async
  "Description copied from interface: AWSSecretsManagerAsync

  request - `com.amazonaws.services.secretsmanager.model.CreateSecretRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSecret operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.secretsmanager.model.CreateSecretResult>`"
  (^java.util.concurrent.Future [^AWSSecretsManagerAsyncClient this ^com.amazonaws.services.secretsmanager.model.CreateSecretRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSecretAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSSecretsManagerAsyncClient this ^com.amazonaws.services.secretsmanager.model.CreateSecretRequest request]
    (-> this (.createSecretAsync request))))

(defn put-secret-value-async
  "Description copied from interface: AWSSecretsManagerAsync

  request - `com.amazonaws.services.secretsmanager.model.PutSecretValueRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutSecretValue operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.secretsmanager.model.PutSecretValueResult>`"
  (^java.util.concurrent.Future [^AWSSecretsManagerAsyncClient this ^com.amazonaws.services.secretsmanager.model.PutSecretValueRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putSecretValueAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSSecretsManagerAsyncClient this ^com.amazonaws.services.secretsmanager.model.PutSecretValueRequest request]
    (-> this (.putSecretValueAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSSecretsManagerAsyncClient this]
    (-> this (.shutdown))))

(defn get-random-password-async
  "Description copied from interface: AWSSecretsManagerAsync

  request - `com.amazonaws.services.secretsmanager.model.GetRandomPasswordRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRandomPassword operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.secretsmanager.model.GetRandomPasswordResult>`"
  (^java.util.concurrent.Future [^AWSSecretsManagerAsyncClient this ^com.amazonaws.services.secretsmanager.model.GetRandomPasswordRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRandomPasswordAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSSecretsManagerAsyncClient this ^com.amazonaws.services.secretsmanager.model.GetRandomPasswordRequest request]
    (-> this (.getRandomPasswordAsync request))))

(defn delete-resource-policy-async
  "Description copied from interface: AWSSecretsManagerAsync

  request - `com.amazonaws.services.secretsmanager.model.DeleteResourcePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteResourcePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.secretsmanager.model.DeleteResourcePolicyResult>`"
  (^java.util.concurrent.Future [^AWSSecretsManagerAsyncClient this ^com.amazonaws.services.secretsmanager.model.DeleteResourcePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteResourcePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSSecretsManagerAsyncClient this ^com.amazonaws.services.secretsmanager.model.DeleteResourcePolicyRequest request]
    (-> this (.deleteResourcePolicyAsync request))))

(defn list-secret-version-ids-async
  "Description copied from interface: AWSSecretsManagerAsync

  request - `com.amazonaws.services.secretsmanager.model.ListSecretVersionIdsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSecretVersionIds operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.secretsmanager.model.ListSecretVersionIdsResult>`"
  (^java.util.concurrent.Future [^AWSSecretsManagerAsyncClient this ^com.amazonaws.services.secretsmanager.model.ListSecretVersionIdsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSecretVersionIdsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSSecretsManagerAsyncClient this ^com.amazonaws.services.secretsmanager.model.ListSecretVersionIdsRequest request]
    (-> this (.listSecretVersionIdsAsync request))))

(defn restore-secret-async
  "Description copied from interface: AWSSecretsManagerAsync

  request - `com.amazonaws.services.secretsmanager.model.RestoreSecretRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestoreSecret operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.secretsmanager.model.RestoreSecretResult>`"
  (^java.util.concurrent.Future [^AWSSecretsManagerAsyncClient this ^com.amazonaws.services.secretsmanager.model.RestoreSecretRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restoreSecretAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSSecretsManagerAsyncClient this ^com.amazonaws.services.secretsmanager.model.RestoreSecretRequest request]
    (-> this (.restoreSecretAsync request))))

(defn put-resource-policy-async
  "Description copied from interface: AWSSecretsManagerAsync

  request - `com.amazonaws.services.secretsmanager.model.PutResourcePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutResourcePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.secretsmanager.model.PutResourcePolicyResult>`"
  (^java.util.concurrent.Future [^AWSSecretsManagerAsyncClient this ^com.amazonaws.services.secretsmanager.model.PutResourcePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putResourcePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSSecretsManagerAsyncClient this ^com.amazonaws.services.secretsmanager.model.PutResourcePolicyRequest request]
    (-> this (.putResourcePolicyAsync request))))

(defn get-resource-policy-async
  "Description copied from interface: AWSSecretsManagerAsync

  request - `com.amazonaws.services.secretsmanager.model.GetResourcePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetResourcePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.secretsmanager.model.GetResourcePolicyResult>`"
  (^java.util.concurrent.Future [^AWSSecretsManagerAsyncClient this ^com.amazonaws.services.secretsmanager.model.GetResourcePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getResourcePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSSecretsManagerAsyncClient this ^com.amazonaws.services.secretsmanager.model.GetResourcePolicyRequest request]
    (-> this (.getResourcePolicyAsync request))))

(defn tag-resource-async
  "Description copied from interface: AWSSecretsManagerAsync

  request - `com.amazonaws.services.secretsmanager.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.secretsmanager.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSSecretsManagerAsyncClient this ^com.amazonaws.services.secretsmanager.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSSecretsManagerAsyncClient this ^com.amazonaws.services.secretsmanager.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn delete-secret-async
  "Description copied from interface: AWSSecretsManagerAsync

  request - `com.amazonaws.services.secretsmanager.model.DeleteSecretRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSecret operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.secretsmanager.model.DeleteSecretResult>`"
  (^java.util.concurrent.Future [^AWSSecretsManagerAsyncClient this ^com.amazonaws.services.secretsmanager.model.DeleteSecretRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSecretAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSSecretsManagerAsyncClient this ^com.amazonaws.services.secretsmanager.model.DeleteSecretRequest request]
    (-> this (.deleteSecretAsync request))))

