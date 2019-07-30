(ns com.amazonaws.services.ecr.AmazonECRAsyncClient
  "Client for accessing Amazon ECR asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Amazon Elastic Container Registry

  Amazon Elastic Container Registry (Amazon ECR) is a managed Docker registry service. Customers can use the familiar
  Docker CLI to push, pull, and manage images. Amazon ECR provides a secure, scalable, and reliable registry. Amazon
  ECR supports private Docker repositories with resource-based permissions using IAM so that specific users or Amazon
  EC2 instances can access repositories and images. Developers can use the Docker CLI to author and manage images."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.ecr AmazonECRAsyncClient]))

(defn ->amazon-ecr-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AmazonECRAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonECRAsyncClient aws-credentials client-configuration executor-service))
  (^AmazonECRAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonECRAsyncClient aws-credentials executor-service))
  (^AmazonECRAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonECRAsyncClient client-configuration))
  (^AmazonECRAsyncClient []
    (new AmazonECRAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.ecr.AmazonECRAsyncClientBuilder`"
  (^com.amazonaws.services.ecr.AmazonECRAsyncClientBuilder []
    (AmazonECRAsyncClient/asyncBuilder )))

(defn untag-resource-async
  "Description copied from interface: AmazonECRAsync

  request - `com.amazonaws.services.ecr.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn initiate-layer-upload-async
  "Description copied from interface: AmazonECRAsync

  request - `com.amazonaws.services.ecr.model.InitiateLayerUploadRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the InitiateLayerUpload operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.InitiateLayerUploadResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.InitiateLayerUploadRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.initiateLayerUploadAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.InitiateLayerUploadRequest request]
    (-> this (.initiateLayerUploadAsync request))))

(defn get-download-url-for-layer-async
  "Description copied from interface: AmazonECRAsync

  request - `com.amazonaws.services.ecr.model.GetDownloadUrlForLayerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDownloadUrlForLayer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.GetDownloadUrlForLayerResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.GetDownloadUrlForLayerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDownloadUrlForLayerAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.GetDownloadUrlForLayerRequest request]
    (-> this (.getDownloadUrlForLayerAsync request))))

(defn set-repository-policy-async
  "Description copied from interface: AmazonECRAsync

  request - `com.amazonaws.services.ecr.model.SetRepositoryPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetRepositoryPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.SetRepositoryPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.SetRepositoryPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setRepositoryPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.SetRepositoryPolicyRequest request]
    (-> this (.setRepositoryPolicyAsync request))))

(defn get-lifecycle-policy-async
  "Description copied from interface: AmazonECRAsync

  request - `com.amazonaws.services.ecr.model.GetLifecyclePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLifecyclePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.GetLifecyclePolicyResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.GetLifecyclePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLifecyclePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.GetLifecyclePolicyRequest request]
    (-> this (.getLifecyclePolicyAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonECRAsyncClient this]
    (-> this (.getExecutorService))))

(defn create-repository-async
  "Description copied from interface: AmazonECRAsync

  request - `com.amazonaws.services.ecr.model.CreateRepositoryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRepository operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.CreateRepositoryResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.CreateRepositoryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRepositoryAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.CreateRepositoryRequest request]
    (-> this (.createRepositoryAsync request))))

(defn put-image-async
  "Description copied from interface: AmazonECRAsync

  request - `com.amazonaws.services.ecr.model.PutImageRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutImage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.PutImageResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.PutImageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putImageAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.PutImageRequest request]
    (-> this (.putImageAsync request))))

(defn delete-lifecycle-policy-async
  "Description copied from interface: AmazonECRAsync

  request - `com.amazonaws.services.ecr.model.DeleteLifecyclePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLifecyclePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.DeleteLifecyclePolicyResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.DeleteLifecyclePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLifecyclePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.DeleteLifecyclePolicyRequest request]
    (-> this (.deleteLifecyclePolicyAsync request))))

(defn describe-images-async
  "Description copied from interface: AmazonECRAsync

  request - `com.amazonaws.services.ecr.model.DescribeImagesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeImages operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.DescribeImagesResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.DescribeImagesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeImagesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.DescribeImagesRequest request]
    (-> this (.describeImagesAsync request))))

(defn start-lifecycle-policy-preview-async
  "Description copied from interface: AmazonECRAsync

  request - `com.amazonaws.services.ecr.model.StartLifecyclePolicyPreviewRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartLifecyclePolicyPreview operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.StartLifecyclePolicyPreviewResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.StartLifecyclePolicyPreviewRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startLifecyclePolicyPreviewAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.StartLifecyclePolicyPreviewRequest request]
    (-> this (.startLifecyclePolicyPreviewAsync request))))

(defn list-images-async
  "Description copied from interface: AmazonECRAsync

  request - `com.amazonaws.services.ecr.model.ListImagesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListImages operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.ListImagesResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.ListImagesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listImagesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.ListImagesRequest request]
    (-> this (.listImagesAsync request))))

(defn get-repository-policy-async
  "Description copied from interface: AmazonECRAsync

  request - `com.amazonaws.services.ecr.model.GetRepositoryPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRepositoryPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.GetRepositoryPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.GetRepositoryPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRepositoryPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.GetRepositoryPolicyRequest request]
    (-> this (.getRepositoryPolicyAsync request))))

(defn delete-repository-async
  "Description copied from interface: AmazonECRAsync

  request - `com.amazonaws.services.ecr.model.DeleteRepositoryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRepository operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.DeleteRepositoryResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.DeleteRepositoryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRepositoryAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.DeleteRepositoryRequest request]
    (-> this (.deleteRepositoryAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonECRAsyncClient this]
    (-> this (.shutdown))))

(defn batch-get-image-async
  "Description copied from interface: AmazonECRAsync

  request - `com.amazonaws.services.ecr.model.BatchGetImageRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetImage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.BatchGetImageResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.BatchGetImageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetImageAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.BatchGetImageRequest request]
    (-> this (.batchGetImageAsync request))))

(defn get-lifecycle-policy-preview-async
  "Description copied from interface: AmazonECRAsync

  request - `com.amazonaws.services.ecr.model.GetLifecyclePolicyPreviewRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLifecyclePolicyPreview operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.GetLifecyclePolicyPreviewResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.GetLifecyclePolicyPreviewRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLifecyclePolicyPreviewAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.GetLifecyclePolicyPreviewRequest request]
    (-> this (.getLifecyclePolicyPreviewAsync request))))

(defn put-image-tag-mutability-async
  "Description copied from interface: AmazonECRAsync

  request - `com.amazonaws.services.ecr.model.PutImageTagMutabilityRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutImageTagMutability operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.PutImageTagMutabilityResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.PutImageTagMutabilityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putImageTagMutabilityAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.PutImageTagMutabilityRequest request]
    (-> this (.putImageTagMutabilityAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AmazonECRAsync

  request - `com.amazonaws.services.ecr.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn upload-layer-part-async
  "Description copied from interface: AmazonECRAsync

  request - `com.amazonaws.services.ecr.model.UploadLayerPartRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UploadLayerPart operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.UploadLayerPartResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.UploadLayerPartRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.uploadLayerPartAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.UploadLayerPartRequest request]
    (-> this (.uploadLayerPartAsync request))))

(defn describe-repositories-async
  "Description copied from interface: AmazonECRAsync

  request - `com.amazonaws.services.ecr.model.DescribeRepositoriesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRepositories operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.DescribeRepositoriesResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.DescribeRepositoriesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRepositoriesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.DescribeRepositoriesRequest request]
    (-> this (.describeRepositoriesAsync request))))

(defn put-lifecycle-policy-async
  "Description copied from interface: AmazonECRAsync

  request - `com.amazonaws.services.ecr.model.PutLifecyclePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutLifecyclePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.PutLifecyclePolicyResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.PutLifecyclePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putLifecyclePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.PutLifecyclePolicyRequest request]
    (-> this (.putLifecyclePolicyAsync request))))

(defn batch-delete-image-async
  "Description copied from interface: AmazonECRAsync

  request - Deletes specified images within a specified repository. Images are specified with either the imageTag or imageDigest. - `com.amazonaws.services.ecr.model.BatchDeleteImageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchDeleteImage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.BatchDeleteImageResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.BatchDeleteImageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchDeleteImageAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.BatchDeleteImageRequest request]
    (-> this (.batchDeleteImageAsync request))))

(defn delete-repository-policy-async
  "Description copied from interface: AmazonECRAsync

  request - `com.amazonaws.services.ecr.model.DeleteRepositoryPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRepositoryPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.DeleteRepositoryPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.DeleteRepositoryPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRepositoryPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.DeleteRepositoryPolicyRequest request]
    (-> this (.deleteRepositoryPolicyAsync request))))

(defn complete-layer-upload-async
  "Description copied from interface: AmazonECRAsync

  request - `com.amazonaws.services.ecr.model.CompleteLayerUploadRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CompleteLayerUpload operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.CompleteLayerUploadResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.CompleteLayerUploadRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.completeLayerUploadAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.CompleteLayerUploadRequest request]
    (-> this (.completeLayerUploadAsync request))))

(defn get-authorization-token-async
  "Description copied from interface: AmazonECRAsync

  request - `com.amazonaws.services.ecr.model.GetAuthorizationTokenRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAuthorizationToken operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.GetAuthorizationTokenResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.GetAuthorizationTokenRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAuthorizationTokenAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.GetAuthorizationTokenRequest request]
    (-> this (.getAuthorizationTokenAsync request))))

(defn tag-resource-async
  "Description copied from interface: AmazonECRAsync

  request - `com.amazonaws.services.ecr.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn batch-check-layer-availability-async
  "Description copied from interface: AmazonECRAsync

  request - `com.amazonaws.services.ecr.model.BatchCheckLayerAvailabilityRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchCheckLayerAvailability operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.BatchCheckLayerAvailabilityResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.BatchCheckLayerAvailabilityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchCheckLayerAvailabilityAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsyncClient this ^com.amazonaws.services.ecr.model.BatchCheckLayerAvailabilityRequest request]
    (-> this (.batchCheckLayerAvailabilityAsync request))))

