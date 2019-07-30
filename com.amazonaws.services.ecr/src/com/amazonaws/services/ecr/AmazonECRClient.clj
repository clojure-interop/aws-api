(ns com.amazonaws.services.ecr.AmazonECRClient
  "Client for accessing Amazon ECR. All service calls made using this client are blocking, and will not return until the
  service call completes.

  Amazon Elastic Container Registry

  Amazon Elastic Container Registry (Amazon ECR) is a managed Docker registry service. Customers can use the familiar
  Docker CLI to push, pull, and manage images. Amazon ECR provides a secure, scalable, and reliable registry. Amazon
  ECR supports private Docker repositories with resource-based permissions using IAM so that specific users or Amazon
  EC2 instances can access repositories and images. Developers can use the Docker CLI to author and manage images."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.ecr AmazonECRClient]))

(defn ->amazon-ecr-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to Amazon ECR (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AmazonECRClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AmazonECRClient aws-credentials-provider client-configuration request-metric-collector))
  (^AmazonECRClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonECRClient aws-credentials client-configuration))
  (^AmazonECRClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonECRClient client-configuration))
  (^AmazonECRClient []
    (new AmazonECRClient )))

(defn *builder
  "returns: `com.amazonaws.services.ecr.AmazonECRClientBuilder`"
  (^com.amazonaws.services.ecr.AmazonECRClientBuilder []
    (AmazonECRClient/builder )))

(defn set-repository-policy
  "Applies a repository policy on a specified repository to control access permissions. For more information, see Amazon ECR Repository
   Policies in the Amazon Elastic Container Registry User Guide.

  request - `com.amazonaws.services.ecr.model.SetRepositoryPolicyRequest`

  returns: Result of the SetRepositoryPolicy operation returned by the service. - `com.amazonaws.services.ecr.model.SetRepositoryPolicyResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.SetRepositoryPolicyResult [^AmazonECRClient this ^com.amazonaws.services.ecr.model.SetRepositoryPolicyRequest request]
    (-> this (.setRepositoryPolicy request))))

(defn list-tags-for-resource
  "List the tags for an Amazon ECR resource.

  request - `com.amazonaws.services.ecr.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.ecr.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.ecr.model.InvalidParameterException - The specified parameter is invalid. Review the available parameters for the API request."
  (^com.amazonaws.services.ecr.model.ListTagsForResourceResult [^AmazonECRClient this ^com.amazonaws.services.ecr.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn get-lifecycle-policy
  "Retrieves the specified lifecycle policy.

  request - `com.amazonaws.services.ecr.model.GetLifecyclePolicyRequest`

  returns: Result of the GetLifecyclePolicy operation returned by the service. - `com.amazonaws.services.ecr.model.GetLifecyclePolicyResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.GetLifecyclePolicyResult [^AmazonECRClient this ^com.amazonaws.services.ecr.model.GetLifecyclePolicyRequest request]
    (-> this (.getLifecyclePolicy request))))

(defn delete-repository-policy
  "Deletes the repository policy from a specified repository.

  request - `com.amazonaws.services.ecr.model.DeleteRepositoryPolicyRequest`

  returns: Result of the DeleteRepositoryPolicy operation returned by the service. - `com.amazonaws.services.ecr.model.DeleteRepositoryPolicyResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.DeleteRepositoryPolicyResult [^AmazonECRClient this ^com.amazonaws.services.ecr.model.DeleteRepositoryPolicyRequest request]
    (-> this (.deleteRepositoryPolicy request))))

(defn batch-check-layer-availability
  "Check the availability of multiple image layers in a specified registry and repository.



   This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling
   and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images.

  request - `com.amazonaws.services.ecr.model.BatchCheckLayerAvailabilityRequest`

  returns: Result of the BatchCheckLayerAvailability operation returned by the service. - `com.amazonaws.services.ecr.model.BatchCheckLayerAvailabilityResult`

  throws: com.amazonaws.services.ecr.model.RepositoryNotFoundException - The specified repository could not be found. Check the spelling of the specified repository and ensure that you are performing operations on the correct registry."
  (^com.amazonaws.services.ecr.model.BatchCheckLayerAvailabilityResult [^AmazonECRClient this ^com.amazonaws.services.ecr.model.BatchCheckLayerAvailabilityRequest request]
    (-> this (.batchCheckLayerAvailability request))))

(defn untag-resource
  "Deletes specified tags from a resource.

  request - `com.amazonaws.services.ecr.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.ecr.model.UntagResourceResult`

  throws: com.amazonaws.services.ecr.model.InvalidParameterException - The specified parameter is invalid. Review the available parameters for the API request."
  (^com.amazonaws.services.ecr.model.UntagResourceResult [^AmazonECRClient this ^com.amazonaws.services.ecr.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn get-download-url-for-layer
  "Retrieves the pre-signed Amazon S3 download URL corresponding to an image layer. You can only get URLs for image
   layers that are referenced in an image.



   This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling
   and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images.

  request - `com.amazonaws.services.ecr.model.GetDownloadUrlForLayerRequest`

  returns: Result of the GetDownloadUrlForLayer operation returned by the service. - `com.amazonaws.services.ecr.model.GetDownloadUrlForLayerResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.GetDownloadUrlForLayerResult [^AmazonECRClient this ^com.amazonaws.services.ecr.model.GetDownloadUrlForLayerRequest request]
    (-> this (.getDownloadUrlForLayer request))))

(defn delete-lifecycle-policy
  "Deletes the specified lifecycle policy.

  request - `com.amazonaws.services.ecr.model.DeleteLifecyclePolicyRequest`

  returns: Result of the DeleteLifecyclePolicy operation returned by the service. - `com.amazonaws.services.ecr.model.DeleteLifecyclePolicyResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.DeleteLifecyclePolicyResult [^AmazonECRClient this ^com.amazonaws.services.ecr.model.DeleteLifecyclePolicyRequest request]
    (-> this (.deleteLifecyclePolicy request))))

(defn get-repository-policy
  "Retrieves the repository policy for a specified repository.

  request - `com.amazonaws.services.ecr.model.GetRepositoryPolicyRequest`

  returns: Result of the GetRepositoryPolicy operation returned by the service. - `com.amazonaws.services.ecr.model.GetRepositoryPolicyResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.GetRepositoryPolicyResult [^AmazonECRClient this ^com.amazonaws.services.ecr.model.GetRepositoryPolicyRequest request]
    (-> this (.getRepositoryPolicy request))))

(defn get-lifecycle-policy-preview
  "Retrieves the results of the specified lifecycle policy preview request.

  request - `com.amazonaws.services.ecr.model.GetLifecyclePolicyPreviewRequest`

  returns: Result of the GetLifecyclePolicyPreview operation returned by the service. - `com.amazonaws.services.ecr.model.GetLifecyclePolicyPreviewResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.GetLifecyclePolicyPreviewResult [^AmazonECRClient this ^com.amazonaws.services.ecr.model.GetLifecyclePolicyPreviewRequest request]
    (-> this (.getLifecyclePolicyPreview request))))

(defn initiate-layer-upload
  "Notify Amazon ECR that you intend to upload an image layer.



   This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling
   and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images.

  request - `com.amazonaws.services.ecr.model.InitiateLayerUploadRequest`

  returns: Result of the InitiateLayerUpload operation returned by the service. - `com.amazonaws.services.ecr.model.InitiateLayerUploadResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.InitiateLayerUploadResult [^AmazonECRClient this ^com.amazonaws.services.ecr.model.InitiateLayerUploadRequest request]
    (-> this (.initiateLayerUpload request))))

(defn complete-layer-upload
  "Informs Amazon ECR that the image layer upload has completed for a specified registry, repository name, and
   upload ID. You can optionally provide a sha256 digest of the image layer for data validation
   purposes.



   This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling
   and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images.

  request - `com.amazonaws.services.ecr.model.CompleteLayerUploadRequest`

  returns: Result of the CompleteLayerUpload operation returned by the service. - `com.amazonaws.services.ecr.model.CompleteLayerUploadResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.CompleteLayerUploadResult [^AmazonECRClient this ^com.amazonaws.services.ecr.model.CompleteLayerUploadRequest request]
    (-> this (.completeLayerUpload request))))

(defn create-repository
  "Creates an image repository.

  request - `com.amazonaws.services.ecr.model.CreateRepositoryRequest`

  returns: Result of the CreateRepository operation returned by the service. - `com.amazonaws.services.ecr.model.CreateRepositoryResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.CreateRepositoryResult [^AmazonECRClient this ^com.amazonaws.services.ecr.model.CreateRepositoryRequest request]
    (-> this (.createRepository request))))

(defn list-images
  "Lists all the image IDs for a given repository.


   You can filter images based on whether or not they are tagged by setting the tagStatus parameter to
   TAGGED or UNTAGGED. For example, you can filter your results to return only
   UNTAGGED images and then pipe that result to a BatchDeleteImage operation to delete them. Or,
   you can filter your results to return only TAGGED images to list all of the tags in your repository.

  request - `com.amazonaws.services.ecr.model.ListImagesRequest`

  returns: Result of the ListImages operation returned by the service. - `com.amazonaws.services.ecr.model.ListImagesResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.ListImagesResult [^AmazonECRClient this ^com.amazonaws.services.ecr.model.ListImagesRequest request]
    (-> this (.listImages request))))

(defn put-image
  "Creates or updates the image manifest and tags associated with an image.



   This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling
   and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images.

  request - `com.amazonaws.services.ecr.model.PutImageRequest`

  returns: Result of the PutImage operation returned by the service. - `com.amazonaws.services.ecr.model.PutImageResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.PutImageResult [^AmazonECRClient this ^com.amazonaws.services.ecr.model.PutImageRequest request]
    (-> this (.putImage request))))

(defn delete-repository
  "Deletes an existing image repository. If a repository contains images, you must use the force option
   to delete it.

  request - `com.amazonaws.services.ecr.model.DeleteRepositoryRequest`

  returns: Result of the DeleteRepository operation returned by the service. - `com.amazonaws.services.ecr.model.DeleteRepositoryResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.DeleteRepositoryResult [^AmazonECRClient this ^com.amazonaws.services.ecr.model.DeleteRepositoryRequest request]
    (-> this (.deleteRepository request))))

(defn describe-repositories
  "Describes image repositories in a registry.

  request - `com.amazonaws.services.ecr.model.DescribeRepositoriesRequest`

  returns: Result of the DescribeRepositories operation returned by the service. - `com.amazonaws.services.ecr.model.DescribeRepositoriesResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.DescribeRepositoriesResult [^AmazonECRClient this ^com.amazonaws.services.ecr.model.DescribeRepositoriesRequest request]
    (-> this (.describeRepositories request))))

(defn batch-delete-image
  "Deletes a list of specified images within a specified repository. Images are specified with either
   imageTag or imageDigest.


   You can remove a tag from an image by specifying the image's tag in your request. When you remove the last tag
   from an image, the image is deleted from your repository.


   You can completely delete an image (and all of its tags) by specifying the image's digest in your request.

  request - `com.amazonaws.services.ecr.model.BatchDeleteImageRequest`

  returns: Result of the BatchDeleteImage operation returned by the service. - `com.amazonaws.services.ecr.model.BatchDeleteImageResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.BatchDeleteImageResult [^AmazonECRClient this ^com.amazonaws.services.ecr.model.BatchDeleteImageRequest request]
    (-> this (.batchDeleteImage request))))

(defn get-authorization-token
  "Retrieves a token that is valid for a specified registry for 12 hours. This command allows you to use the
   docker CLI to push and pull images with Amazon ECR. If you do not specify a registry, the default
   registry is assumed.


   The authorizationToken returned for each registry specified is a base64 encoded string that can be
   decoded and used in a docker login command to authenticate to a registry. The AWS CLI offers an
   aws ecr get-login command that simplifies the login process.

  request - `com.amazonaws.services.ecr.model.GetAuthorizationTokenRequest`

  returns: Result of the GetAuthorizationToken operation returned by the service. - `com.amazonaws.services.ecr.model.GetAuthorizationTokenResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.GetAuthorizationTokenResult [^AmazonECRClient this ^com.amazonaws.services.ecr.model.GetAuthorizationTokenRequest request]
    (-> this (.getAuthorizationToken request))))

(defn put-image-tag-mutability
  "Updates the image tag mutability settings for a repository.

  request - `com.amazonaws.services.ecr.model.PutImageTagMutabilityRequest`

  returns: Result of the PutImageTagMutability operation returned by the service. - `com.amazonaws.services.ecr.model.PutImageTagMutabilityResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.PutImageTagMutabilityResult [^AmazonECRClient this ^com.amazonaws.services.ecr.model.PutImageTagMutabilityRequest request]
    (-> this (.putImageTagMutability request))))

(defn upload-layer-part
  "Uploads an image layer part to Amazon ECR.



   This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling
   and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images.

  request - `com.amazonaws.services.ecr.model.UploadLayerPartRequest`

  returns: Result of the UploadLayerPart operation returned by the service. - `com.amazonaws.services.ecr.model.UploadLayerPartResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.UploadLayerPartResult [^AmazonECRClient this ^com.amazonaws.services.ecr.model.UploadLayerPartRequest request]
    (-> this (.uploadLayerPart request))))

(defn put-lifecycle-policy
  "Creates or updates a lifecycle policy. For information about lifecycle policy syntax, see Lifecycle Policy
   Template.

  request - `com.amazonaws.services.ecr.model.PutLifecyclePolicyRequest`

  returns: Result of the PutLifecyclePolicy operation returned by the service. - `com.amazonaws.services.ecr.model.PutLifecyclePolicyResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.PutLifecyclePolicyResult [^AmazonECRClient this ^com.amazonaws.services.ecr.model.PutLifecyclePolicyRequest request]
    (-> this (.putLifecyclePolicy request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonECRClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn start-lifecycle-policy-preview
  "Starts a preview of the specified lifecycle policy. This allows you to see the results before creating the
   lifecycle policy.

  request - `com.amazonaws.services.ecr.model.StartLifecyclePolicyPreviewRequest`

  returns: Result of the StartLifecyclePolicyPreview operation returned by the service. - `com.amazonaws.services.ecr.model.StartLifecyclePolicyPreviewResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.StartLifecyclePolicyPreviewResult [^AmazonECRClient this ^com.amazonaws.services.ecr.model.StartLifecyclePolicyPreviewRequest request]
    (-> this (.startLifecyclePolicyPreview request))))

(defn tag-resource
  "Adds specified tags to a resource with the specified ARN. Existing tags on a resource are not changed if they are
   not specified in the request parameters.

  request - `com.amazonaws.services.ecr.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.ecr.model.TagResourceResult`

  throws: com.amazonaws.services.ecr.model.InvalidParameterException - The specified parameter is invalid. Review the available parameters for the API request."
  (^com.amazonaws.services.ecr.model.TagResourceResult [^AmazonECRClient this ^com.amazonaws.services.ecr.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn describe-images
  "Returns metadata about the images in a repository, including image size, image tags, and creation date.



   Beginning with Docker version 1.9, the Docker client compresses image layers before pushing them to a V2 Docker
   registry. The output of the docker images command shows the uncompressed image size, so it may
   return a larger image size than the image sizes returned by DescribeImages.

  request - `com.amazonaws.services.ecr.model.DescribeImagesRequest`

  returns: Result of the DescribeImages operation returned by the service. - `com.amazonaws.services.ecr.model.DescribeImagesResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.DescribeImagesResult [^AmazonECRClient this ^com.amazonaws.services.ecr.model.DescribeImagesRequest request]
    (-> this (.describeImages request))))

(defn batch-get-image
  "Gets detailed information for specified images within a specified repository. Images are specified with either
   imageTag or imageDigest.

  request - `com.amazonaws.services.ecr.model.BatchGetImageRequest`

  returns: Result of the BatchGetImage operation returned by the service. - `com.amazonaws.services.ecr.model.BatchGetImageResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.BatchGetImageResult [^AmazonECRClient this ^com.amazonaws.services.ecr.model.BatchGetImageRequest request]
    (-> this (.batchGetImage request))))

