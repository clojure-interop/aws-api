(ns com.amazonaws.services.ecr.AmazonECR
  "Interface for accessing Amazon ECR.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonECR instead.


  Amazon Elastic Container Registry

  Amazon Elastic Container Registry (Amazon ECR) is a managed Docker registry service. Customers can use the familiar
  Docker CLI to push, pull, and manage images. Amazon ECR provides a secure, scalable, and reliable registry. Amazon
  ECR supports private Docker repositories with resource-based permissions using IAM so that specific users or Amazon
  EC2 instances can access repositories and images. Developers can use the Docker CLI to author and manage images."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.ecr AmazonECR]))

(defn set-repository-policy
  "Applies a repository policy on a specified repository to control access permissions. For more information, see Amazon ECR Repository
   Policies in the Amazon Elastic Container Registry User Guide.

  set-repository-policy-request - `com.amazonaws.services.ecr.model.SetRepositoryPolicyRequest`

  returns: Result of the SetRepositoryPolicy operation returned by the service. - `com.amazonaws.services.ecr.model.SetRepositoryPolicyResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.SetRepositoryPolicyResult [^AmazonECR this ^com.amazonaws.services.ecr.model.SetRepositoryPolicyRequest set-repository-policy-request]
    (-> this (.setRepositoryPolicy set-repository-policy-request))))

(defn list-tags-for-resource
  "List the tags for an Amazon ECR resource.

  list-tags-for-resource-request - `com.amazonaws.services.ecr.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.ecr.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.ecr.model.InvalidParameterException - The specified parameter is invalid. Review the available parameters for the API request."
  (^com.amazonaws.services.ecr.model.ListTagsForResourceResult [^AmazonECR this ^com.amazonaws.services.ecr.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn get-lifecycle-policy
  "Retrieves the specified lifecycle policy.

  get-lifecycle-policy-request - `com.amazonaws.services.ecr.model.GetLifecyclePolicyRequest`

  returns: Result of the GetLifecyclePolicy operation returned by the service. - `com.amazonaws.services.ecr.model.GetLifecyclePolicyResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.GetLifecyclePolicyResult [^AmazonECR this ^com.amazonaws.services.ecr.model.GetLifecyclePolicyRequest get-lifecycle-policy-request]
    (-> this (.getLifecyclePolicy get-lifecycle-policy-request))))

(defn delete-repository-policy
  "Deletes the repository policy from a specified repository.

  delete-repository-policy-request - `com.amazonaws.services.ecr.model.DeleteRepositoryPolicyRequest`

  returns: Result of the DeleteRepositoryPolicy operation returned by the service. - `com.amazonaws.services.ecr.model.DeleteRepositoryPolicyResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.DeleteRepositoryPolicyResult [^AmazonECR this ^com.amazonaws.services.ecr.model.DeleteRepositoryPolicyRequest delete-repository-policy-request]
    (-> this (.deleteRepositoryPolicy delete-repository-policy-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AmazonECR this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn batch-check-layer-availability
  "Check the availability of multiple image layers in a specified registry and repository.



   This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling
   and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images.

  batch-check-layer-availability-request - `com.amazonaws.services.ecr.model.BatchCheckLayerAvailabilityRequest`

  returns: Result of the BatchCheckLayerAvailability operation returned by the service. - `com.amazonaws.services.ecr.model.BatchCheckLayerAvailabilityResult`

  throws: com.amazonaws.services.ecr.model.RepositoryNotFoundException - The specified repository could not be found. Check the spelling of the specified repository and ensure that you are performing operations on the correct registry."
  (^com.amazonaws.services.ecr.model.BatchCheckLayerAvailabilityResult [^AmazonECR this ^com.amazonaws.services.ecr.model.BatchCheckLayerAvailabilityRequest batch-check-layer-availability-request]
    (-> this (.batchCheckLayerAvailability batch-check-layer-availability-request))))

(defn untag-resource
  "Deletes specified tags from a resource.

  untag-resource-request - `com.amazonaws.services.ecr.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.ecr.model.UntagResourceResult`

  throws: com.amazonaws.services.ecr.model.InvalidParameterException - The specified parameter is invalid. Review the available parameters for the API request."
  (^com.amazonaws.services.ecr.model.UntagResourceResult [^AmazonECR this ^com.amazonaws.services.ecr.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn get-download-url-for-layer
  "Retrieves the pre-signed Amazon S3 download URL corresponding to an image layer. You can only get URLs for image
   layers that are referenced in an image.



   This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling
   and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images.

  get-download-url-for-layer-request - `com.amazonaws.services.ecr.model.GetDownloadUrlForLayerRequest`

  returns: Result of the GetDownloadUrlForLayer operation returned by the service. - `com.amazonaws.services.ecr.model.GetDownloadUrlForLayerResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.GetDownloadUrlForLayerResult [^AmazonECR this ^com.amazonaws.services.ecr.model.GetDownloadUrlForLayerRequest get-download-url-for-layer-request]
    (-> this (.getDownloadUrlForLayer get-download-url-for-layer-request))))

(defn delete-lifecycle-policy
  "Deletes the specified lifecycle policy.

  delete-lifecycle-policy-request - `com.amazonaws.services.ecr.model.DeleteLifecyclePolicyRequest`

  returns: Result of the DeleteLifecyclePolicy operation returned by the service. - `com.amazonaws.services.ecr.model.DeleteLifecyclePolicyResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.DeleteLifecyclePolicyResult [^AmazonECR this ^com.amazonaws.services.ecr.model.DeleteLifecyclePolicyRequest delete-lifecycle-policy-request]
    (-> this (.deleteLifecyclePolicy delete-lifecycle-policy-request))))

(defn get-repository-policy
  "Retrieves the repository policy for a specified repository.

  get-repository-policy-request - `com.amazonaws.services.ecr.model.GetRepositoryPolicyRequest`

  returns: Result of the GetRepositoryPolicy operation returned by the service. - `com.amazonaws.services.ecr.model.GetRepositoryPolicyResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.GetRepositoryPolicyResult [^AmazonECR this ^com.amazonaws.services.ecr.model.GetRepositoryPolicyRequest get-repository-policy-request]
    (-> this (.getRepositoryPolicy get-repository-policy-request))))

(defn get-lifecycle-policy-preview
  "Retrieves the results of the specified lifecycle policy preview request.

  get-lifecycle-policy-preview-request - `com.amazonaws.services.ecr.model.GetLifecyclePolicyPreviewRequest`

  returns: Result of the GetLifecyclePolicyPreview operation returned by the service. - `com.amazonaws.services.ecr.model.GetLifecyclePolicyPreviewResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.GetLifecyclePolicyPreviewResult [^AmazonECR this ^com.amazonaws.services.ecr.model.GetLifecyclePolicyPreviewRequest get-lifecycle-policy-preview-request]
    (-> this (.getLifecyclePolicyPreview get-lifecycle-policy-preview-request))))

(defn initiate-layer-upload
  "Notify Amazon ECR that you intend to upload an image layer.



   This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling
   and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images.

  initiate-layer-upload-request - `com.amazonaws.services.ecr.model.InitiateLayerUploadRequest`

  returns: Result of the InitiateLayerUpload operation returned by the service. - `com.amazonaws.services.ecr.model.InitiateLayerUploadResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.InitiateLayerUploadResult [^AmazonECR this ^com.amazonaws.services.ecr.model.InitiateLayerUploadRequest initiate-layer-upload-request]
    (-> this (.initiateLayerUpload initiate-layer-upload-request))))

(defn complete-layer-upload
  "Informs Amazon ECR that the image layer upload has completed for a specified registry, repository name, and
   upload ID. You can optionally provide a sha256 digest of the image layer for data validation
   purposes.



   This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling
   and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images.

  complete-layer-upload-request - `com.amazonaws.services.ecr.model.CompleteLayerUploadRequest`

  returns: Result of the CompleteLayerUpload operation returned by the service. - `com.amazonaws.services.ecr.model.CompleteLayerUploadResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.CompleteLayerUploadResult [^AmazonECR this ^com.amazonaws.services.ecr.model.CompleteLayerUploadRequest complete-layer-upload-request]
    (-> this (.completeLayerUpload complete-layer-upload-request))))

(defn create-repository
  "Creates an image repository.

  create-repository-request - `com.amazonaws.services.ecr.model.CreateRepositoryRequest`

  returns: Result of the CreateRepository operation returned by the service. - `com.amazonaws.services.ecr.model.CreateRepositoryResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.CreateRepositoryResult [^AmazonECR this ^com.amazonaws.services.ecr.model.CreateRepositoryRequest create-repository-request]
    (-> this (.createRepository create-repository-request))))

(defn list-images
  "Lists all the image IDs for a given repository.


   You can filter images based on whether or not they are tagged by setting the tagStatus parameter to
   TAGGED or UNTAGGED. For example, you can filter your results to return only
   UNTAGGED images and then pipe that result to a BatchDeleteImage operation to delete them. Or,
   you can filter your results to return only TAGGED images to list all of the tags in your repository.

  list-images-request - `com.amazonaws.services.ecr.model.ListImagesRequest`

  returns: Result of the ListImages operation returned by the service. - `com.amazonaws.services.ecr.model.ListImagesResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.ListImagesResult [^AmazonECR this ^com.amazonaws.services.ecr.model.ListImagesRequest list-images-request]
    (-> this (.listImages list-images-request))))

(defn put-image
  "Creates or updates the image manifest and tags associated with an image.



   This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling
   and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images.

  put-image-request - `com.amazonaws.services.ecr.model.PutImageRequest`

  returns: Result of the PutImage operation returned by the service. - `com.amazonaws.services.ecr.model.PutImageResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.PutImageResult [^AmazonECR this ^com.amazonaws.services.ecr.model.PutImageRequest put-image-request]
    (-> this (.putImage put-image-request))))

(defn delete-repository
  "Deletes an existing image repository. If a repository contains images, you must use the force option
   to delete it.

  delete-repository-request - `com.amazonaws.services.ecr.model.DeleteRepositoryRequest`

  returns: Result of the DeleteRepository operation returned by the service. - `com.amazonaws.services.ecr.model.DeleteRepositoryResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.DeleteRepositoryResult [^AmazonECR this ^com.amazonaws.services.ecr.model.DeleteRepositoryRequest delete-repository-request]
    (-> this (.deleteRepository delete-repository-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonECR this]
    (-> this (.shutdown))))

(defn describe-repositories
  "Describes image repositories in a registry.

  describe-repositories-request - `com.amazonaws.services.ecr.model.DescribeRepositoriesRequest`

  returns: Result of the DescribeRepositories operation returned by the service. - `com.amazonaws.services.ecr.model.DescribeRepositoriesResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.DescribeRepositoriesResult [^AmazonECR this ^com.amazonaws.services.ecr.model.DescribeRepositoriesRequest describe-repositories-request]
    (-> this (.describeRepositories describe-repositories-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"api.ecr.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"api.ecr.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AmazonECR this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn batch-delete-image
  "Deletes a list of specified images within a specified repository. Images are specified with either
   imageTag or imageDigest.


   You can remove a tag from an image by specifying the image's tag in your request. When you remove the last tag
   from an image, the image is deleted from your repository.


   You can completely delete an image (and all of its tags) by specifying the image's digest in your request.

  batch-delete-image-request - Deletes specified images within a specified repository. Images are specified with either the imageTag or imageDigest. - `com.amazonaws.services.ecr.model.BatchDeleteImageRequest`

  returns: Result of the BatchDeleteImage operation returned by the service. - `com.amazonaws.services.ecr.model.BatchDeleteImageResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.BatchDeleteImageResult [^AmazonECR this ^com.amazonaws.services.ecr.model.BatchDeleteImageRequest batch-delete-image-request]
    (-> this (.batchDeleteImage batch-delete-image-request))))

(defn get-authorization-token
  "Retrieves a token that is valid for a specified registry for 12 hours. This command allows you to use the
   docker CLI to push and pull images with Amazon ECR. If you do not specify a registry, the default
   registry is assumed.


   The authorizationToken returned for each registry specified is a base64 encoded string that can be
   decoded and used in a docker login command to authenticate to a registry. The AWS CLI offers an
   aws ecr get-login command that simplifies the login process.

  get-authorization-token-request - `com.amazonaws.services.ecr.model.GetAuthorizationTokenRequest`

  returns: Result of the GetAuthorizationToken operation returned by the service. - `com.amazonaws.services.ecr.model.GetAuthorizationTokenResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.GetAuthorizationTokenResult [^AmazonECR this ^com.amazonaws.services.ecr.model.GetAuthorizationTokenRequest get-authorization-token-request]
    (-> this (.getAuthorizationToken get-authorization-token-request))))

(defn put-image-tag-mutability
  "Updates the image tag mutability settings for a repository.

  put-image-tag-mutability-request - `com.amazonaws.services.ecr.model.PutImageTagMutabilityRequest`

  returns: Result of the PutImageTagMutability operation returned by the service. - `com.amazonaws.services.ecr.model.PutImageTagMutabilityResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.PutImageTagMutabilityResult [^AmazonECR this ^com.amazonaws.services.ecr.model.PutImageTagMutabilityRequest put-image-tag-mutability-request]
    (-> this (.putImageTagMutability put-image-tag-mutability-request))))

(defn upload-layer-part
  "Uploads an image layer part to Amazon ECR.



   This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling
   and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images.

  upload-layer-part-request - `com.amazonaws.services.ecr.model.UploadLayerPartRequest`

  returns: Result of the UploadLayerPart operation returned by the service. - `com.amazonaws.services.ecr.model.UploadLayerPartResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.UploadLayerPartResult [^AmazonECR this ^com.amazonaws.services.ecr.model.UploadLayerPartRequest upload-layer-part-request]
    (-> this (.uploadLayerPart upload-layer-part-request))))

(defn put-lifecycle-policy
  "Creates or updates a lifecycle policy. For information about lifecycle policy syntax, see Lifecycle Policy
   Template.

  put-lifecycle-policy-request - `com.amazonaws.services.ecr.model.PutLifecyclePolicyRequest`

  returns: Result of the PutLifecyclePolicy operation returned by the service. - `com.amazonaws.services.ecr.model.PutLifecyclePolicyResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.PutLifecyclePolicyResult [^AmazonECR this ^com.amazonaws.services.ecr.model.PutLifecyclePolicyRequest put-lifecycle-policy-request]
    (-> this (.putLifecyclePolicy put-lifecycle-policy-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonECR this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn start-lifecycle-policy-preview
  "Starts a preview of the specified lifecycle policy. This allows you to see the results before creating the
   lifecycle policy.

  start-lifecycle-policy-preview-request - `com.amazonaws.services.ecr.model.StartLifecyclePolicyPreviewRequest`

  returns: Result of the StartLifecyclePolicyPreview operation returned by the service. - `com.amazonaws.services.ecr.model.StartLifecyclePolicyPreviewResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.StartLifecyclePolicyPreviewResult [^AmazonECR this ^com.amazonaws.services.ecr.model.StartLifecyclePolicyPreviewRequest start-lifecycle-policy-preview-request]
    (-> this (.startLifecyclePolicyPreview start-lifecycle-policy-preview-request))))

(defn tag-resource
  "Adds specified tags to a resource with the specified ARN. Existing tags on a resource are not changed if they are
   not specified in the request parameters.

  tag-resource-request - `com.amazonaws.services.ecr.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.ecr.model.TagResourceResult`

  throws: com.amazonaws.services.ecr.model.InvalidParameterException - The specified parameter is invalid. Review the available parameters for the API request."
  (^com.amazonaws.services.ecr.model.TagResourceResult [^AmazonECR this ^com.amazonaws.services.ecr.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

(defn describe-images
  "Returns metadata about the images in a repository, including image size, image tags, and creation date.



   Beginning with Docker version 1.9, the Docker client compresses image layers before pushing them to a V2 Docker
   registry. The output of the docker images command shows the uncompressed image size, so it may
   return a larger image size than the image sizes returned by DescribeImages.

  describe-images-request - `com.amazonaws.services.ecr.model.DescribeImagesRequest`

  returns: Result of the DescribeImages operation returned by the service. - `com.amazonaws.services.ecr.model.DescribeImagesResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.DescribeImagesResult [^AmazonECR this ^com.amazonaws.services.ecr.model.DescribeImagesRequest describe-images-request]
    (-> this (.describeImages describe-images-request))))

(defn batch-get-image
  "Gets detailed information for specified images within a specified repository. Images are specified with either
   imageTag or imageDigest.

  batch-get-image-request - `com.amazonaws.services.ecr.model.BatchGetImageRequest`

  returns: Result of the BatchGetImage operation returned by the service. - `com.amazonaws.services.ecr.model.BatchGetImageResult`

  throws: com.amazonaws.services.ecr.model.ServerException - These errors are usually caused by a server-side issue."
  (^com.amazonaws.services.ecr.model.BatchGetImageResult [^AmazonECR this ^com.amazonaws.services.ecr.model.BatchGetImageRequest batch-get-image-request]
    (-> this (.batchGetImage batch-get-image-request))))

