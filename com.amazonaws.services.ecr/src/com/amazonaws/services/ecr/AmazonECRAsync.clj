(ns com.amazonaws.services.ecr.AmazonECRAsync
  "Interface for accessing Amazon ECR asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonECRAsync instead.


  Amazon Elastic Container Registry

  Amazon Elastic Container Registry (Amazon ECR) is a managed Docker registry service. Customers can use the familiar
  Docker CLI to push, pull, and manage images. Amazon ECR provides a secure, scalable, and reliable registry. Amazon
  ECR supports private Docker repositories with resource-based permissions using IAM so that specific users or Amazon
  EC2 instances can access repositories and images. Developers can use the Docker CLI to author and manage images."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.ecr AmazonECRAsync]))

(defn untag-resource-async
  "Deletes specified tags from a resource.

  untag-resource-request - `com.amazonaws.services.ecr.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn initiate-layer-upload-async
  "Notify Amazon ECR that you intend to upload an image layer.



   This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling
   and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images.

  initiate-layer-upload-request - `com.amazonaws.services.ecr.model.InitiateLayerUploadRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the InitiateLayerUpload operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.InitiateLayerUploadResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.InitiateLayerUploadRequest initiate-layer-upload-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.initiateLayerUploadAsync initiate-layer-upload-request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.InitiateLayerUploadRequest initiate-layer-upload-request]
    (-> this (.initiateLayerUploadAsync initiate-layer-upload-request))))

(defn get-download-url-for-layer-async
  "Retrieves the pre-signed Amazon S3 download URL corresponding to an image layer. You can only get URLs for image
   layers that are referenced in an image.



   This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling
   and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images.

  get-download-url-for-layer-request - `com.amazonaws.services.ecr.model.GetDownloadUrlForLayerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDownloadUrlForLayer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.GetDownloadUrlForLayerResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.GetDownloadUrlForLayerRequest get-download-url-for-layer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDownloadUrlForLayerAsync get-download-url-for-layer-request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.GetDownloadUrlForLayerRequest get-download-url-for-layer-request]
    (-> this (.getDownloadUrlForLayerAsync get-download-url-for-layer-request))))

(defn set-repository-policy-async
  "Applies a repository policy on a specified repository to control access permissions. For more information, see Amazon ECR Repository
   Policies in the Amazon Elastic Container Registry User Guide.

  set-repository-policy-request - `com.amazonaws.services.ecr.model.SetRepositoryPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetRepositoryPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.SetRepositoryPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.SetRepositoryPolicyRequest set-repository-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setRepositoryPolicyAsync set-repository-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.SetRepositoryPolicyRequest set-repository-policy-request]
    (-> this (.setRepositoryPolicyAsync set-repository-policy-request))))

(defn get-lifecycle-policy-async
  "Retrieves the specified lifecycle policy.

  get-lifecycle-policy-request - `com.amazonaws.services.ecr.model.GetLifecyclePolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLifecyclePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.GetLifecyclePolicyResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.GetLifecyclePolicyRequest get-lifecycle-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLifecyclePolicyAsync get-lifecycle-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.GetLifecyclePolicyRequest get-lifecycle-policy-request]
    (-> this (.getLifecyclePolicyAsync get-lifecycle-policy-request))))

(defn create-repository-async
  "Creates an image repository.

  create-repository-request - `com.amazonaws.services.ecr.model.CreateRepositoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRepository operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.CreateRepositoryResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.CreateRepositoryRequest create-repository-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRepositoryAsync create-repository-request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.CreateRepositoryRequest create-repository-request]
    (-> this (.createRepositoryAsync create-repository-request))))

(defn put-image-async
  "Creates or updates the image manifest and tags associated with an image.



   This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling
   and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images.

  put-image-request - `com.amazonaws.services.ecr.model.PutImageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutImage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.PutImageResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.PutImageRequest put-image-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putImageAsync put-image-request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.PutImageRequest put-image-request]
    (-> this (.putImageAsync put-image-request))))

(defn delete-lifecycle-policy-async
  "Deletes the specified lifecycle policy.

  delete-lifecycle-policy-request - `com.amazonaws.services.ecr.model.DeleteLifecyclePolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLifecyclePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.DeleteLifecyclePolicyResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.DeleteLifecyclePolicyRequest delete-lifecycle-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLifecyclePolicyAsync delete-lifecycle-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.DeleteLifecyclePolicyRequest delete-lifecycle-policy-request]
    (-> this (.deleteLifecyclePolicyAsync delete-lifecycle-policy-request))))

(defn describe-images-async
  "Returns metadata about the images in a repository, including image size, image tags, and creation date.



   Beginning with Docker version 1.9, the Docker client compresses image layers before pushing them to a V2 Docker
   registry. The output of the docker images command shows the uncompressed image size, so it may
   return a larger image size than the image sizes returned by DescribeImages.

  describe-images-request - `com.amazonaws.services.ecr.model.DescribeImagesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeImages operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.DescribeImagesResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.DescribeImagesRequest describe-images-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeImagesAsync describe-images-request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.DescribeImagesRequest describe-images-request]
    (-> this (.describeImagesAsync describe-images-request))))

(defn start-lifecycle-policy-preview-async
  "Starts a preview of the specified lifecycle policy. This allows you to see the results before creating the
   lifecycle policy.

  start-lifecycle-policy-preview-request - `com.amazonaws.services.ecr.model.StartLifecyclePolicyPreviewRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartLifecyclePolicyPreview operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.StartLifecyclePolicyPreviewResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.StartLifecyclePolicyPreviewRequest start-lifecycle-policy-preview-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startLifecyclePolicyPreviewAsync start-lifecycle-policy-preview-request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.StartLifecyclePolicyPreviewRequest start-lifecycle-policy-preview-request]
    (-> this (.startLifecyclePolicyPreviewAsync start-lifecycle-policy-preview-request))))

(defn list-images-async
  "Lists all the image IDs for a given repository.


   You can filter images based on whether or not they are tagged by setting the tagStatus parameter to
   TAGGED or UNTAGGED. For example, you can filter your results to return only
   UNTAGGED images and then pipe that result to a BatchDeleteImage operation to delete them. Or,
   you can filter your results to return only TAGGED images to list all of the tags in your repository.

  list-images-request - `com.amazonaws.services.ecr.model.ListImagesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListImages operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.ListImagesResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.ListImagesRequest list-images-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listImagesAsync list-images-request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.ListImagesRequest list-images-request]
    (-> this (.listImagesAsync list-images-request))))

(defn get-repository-policy-async
  "Retrieves the repository policy for a specified repository.

  get-repository-policy-request - `com.amazonaws.services.ecr.model.GetRepositoryPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRepositoryPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.GetRepositoryPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.GetRepositoryPolicyRequest get-repository-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRepositoryPolicyAsync get-repository-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.GetRepositoryPolicyRequest get-repository-policy-request]
    (-> this (.getRepositoryPolicyAsync get-repository-policy-request))))

(defn delete-repository-async
  "Deletes an existing image repository. If a repository contains images, you must use the force option
   to delete it.

  delete-repository-request - `com.amazonaws.services.ecr.model.DeleteRepositoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRepository operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.DeleteRepositoryResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.DeleteRepositoryRequest delete-repository-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRepositoryAsync delete-repository-request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.DeleteRepositoryRequest delete-repository-request]
    (-> this (.deleteRepositoryAsync delete-repository-request))))

(defn batch-get-image-async
  "Gets detailed information for specified images within a specified repository. Images are specified with either
   imageTag or imageDigest.

  batch-get-image-request - `com.amazonaws.services.ecr.model.BatchGetImageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetImage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.BatchGetImageResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.BatchGetImageRequest batch-get-image-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetImageAsync batch-get-image-request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.BatchGetImageRequest batch-get-image-request]
    (-> this (.batchGetImageAsync batch-get-image-request))))

(defn get-lifecycle-policy-preview-async
  "Retrieves the results of the specified lifecycle policy preview request.

  get-lifecycle-policy-preview-request - `com.amazonaws.services.ecr.model.GetLifecyclePolicyPreviewRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLifecyclePolicyPreview operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.GetLifecyclePolicyPreviewResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.GetLifecyclePolicyPreviewRequest get-lifecycle-policy-preview-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLifecyclePolicyPreviewAsync get-lifecycle-policy-preview-request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.GetLifecyclePolicyPreviewRequest get-lifecycle-policy-preview-request]
    (-> this (.getLifecyclePolicyPreviewAsync get-lifecycle-policy-preview-request))))

(defn put-image-tag-mutability-async
  "Updates the image tag mutability settings for a repository.

  put-image-tag-mutability-request - `com.amazonaws.services.ecr.model.PutImageTagMutabilityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutImageTagMutability operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.PutImageTagMutabilityResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.PutImageTagMutabilityRequest put-image-tag-mutability-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putImageTagMutabilityAsync put-image-tag-mutability-request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.PutImageTagMutabilityRequest put-image-tag-mutability-request]
    (-> this (.putImageTagMutabilityAsync put-image-tag-mutability-request))))

(defn list-tags-for-resource-async
  "List the tags for an Amazon ECR resource.

  list-tags-for-resource-request - `com.amazonaws.services.ecr.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn upload-layer-part-async
  "Uploads an image layer part to Amazon ECR.



   This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling
   and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images.

  upload-layer-part-request - `com.amazonaws.services.ecr.model.UploadLayerPartRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UploadLayerPart operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.UploadLayerPartResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.UploadLayerPartRequest upload-layer-part-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.uploadLayerPartAsync upload-layer-part-request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.UploadLayerPartRequest upload-layer-part-request]
    (-> this (.uploadLayerPartAsync upload-layer-part-request))))

(defn describe-repositories-async
  "Describes image repositories in a registry.

  describe-repositories-request - `com.amazonaws.services.ecr.model.DescribeRepositoriesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRepositories operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.DescribeRepositoriesResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.DescribeRepositoriesRequest describe-repositories-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRepositoriesAsync describe-repositories-request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.DescribeRepositoriesRequest describe-repositories-request]
    (-> this (.describeRepositoriesAsync describe-repositories-request))))

(defn put-lifecycle-policy-async
  "Creates or updates a lifecycle policy. For information about lifecycle policy syntax, see Lifecycle Policy
   Template.

  put-lifecycle-policy-request - `com.amazonaws.services.ecr.model.PutLifecyclePolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutLifecyclePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.PutLifecyclePolicyResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.PutLifecyclePolicyRequest put-lifecycle-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putLifecyclePolicyAsync put-lifecycle-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.PutLifecyclePolicyRequest put-lifecycle-policy-request]
    (-> this (.putLifecyclePolicyAsync put-lifecycle-policy-request))))

(defn batch-delete-image-async
  "Deletes a list of specified images within a specified repository. Images are specified with either
   imageTag or imageDigest.


   You can remove a tag from an image by specifying the image's tag in your request. When you remove the last tag
   from an image, the image is deleted from your repository.


   You can completely delete an image (and all of its tags) by specifying the image's digest in your request.

  batch-delete-image-request - Deletes specified images within a specified repository. Images are specified with either the imageTag or imageDigest. - `com.amazonaws.services.ecr.model.BatchDeleteImageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchDeleteImage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.BatchDeleteImageResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.BatchDeleteImageRequest batch-delete-image-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchDeleteImageAsync batch-delete-image-request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.BatchDeleteImageRequest batch-delete-image-request]
    (-> this (.batchDeleteImageAsync batch-delete-image-request))))

(defn delete-repository-policy-async
  "Deletes the repository policy from a specified repository.

  delete-repository-policy-request - `com.amazonaws.services.ecr.model.DeleteRepositoryPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRepositoryPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.DeleteRepositoryPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.DeleteRepositoryPolicyRequest delete-repository-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRepositoryPolicyAsync delete-repository-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.DeleteRepositoryPolicyRequest delete-repository-policy-request]
    (-> this (.deleteRepositoryPolicyAsync delete-repository-policy-request))))

(defn complete-layer-upload-async
  "Informs Amazon ECR that the image layer upload has completed for a specified registry, repository name, and
   upload ID. You can optionally provide a sha256 digest of the image layer for data validation
   purposes.



   This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling
   and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images.

  complete-layer-upload-request - `com.amazonaws.services.ecr.model.CompleteLayerUploadRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CompleteLayerUpload operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.CompleteLayerUploadResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.CompleteLayerUploadRequest complete-layer-upload-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.completeLayerUploadAsync complete-layer-upload-request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.CompleteLayerUploadRequest complete-layer-upload-request]
    (-> this (.completeLayerUploadAsync complete-layer-upload-request))))

(defn get-authorization-token-async
  "Retrieves a token that is valid for a specified registry for 12 hours. This command allows you to use the
   docker CLI to push and pull images with Amazon ECR. If you do not specify a registry, the default
   registry is assumed.


   The authorizationToken returned for each registry specified is a base64 encoded string that can be
   decoded and used in a docker login command to authenticate to a registry. The AWS CLI offers an
   aws ecr get-login command that simplifies the login process.

  get-authorization-token-request - `com.amazonaws.services.ecr.model.GetAuthorizationTokenRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAuthorizationToken operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.GetAuthorizationTokenResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.GetAuthorizationTokenRequest get-authorization-token-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAuthorizationTokenAsync get-authorization-token-request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.GetAuthorizationTokenRequest get-authorization-token-request]
    (-> this (.getAuthorizationTokenAsync get-authorization-token-request))))

(defn tag-resource-async
  "Adds specified tags to a resource with the specified ARN. Existing tags on a resource are not changed if they are
   not specified in the request parameters.

  tag-resource-request - `com.amazonaws.services.ecr.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn batch-check-layer-availability-async
  "Check the availability of multiple image layers in a specified registry and repository.



   This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling
   and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images.

  batch-check-layer-availability-request - `com.amazonaws.services.ecr.model.BatchCheckLayerAvailabilityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchCheckLayerAvailability operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecr.model.BatchCheckLayerAvailabilityResult>`"
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.BatchCheckLayerAvailabilityRequest batch-check-layer-availability-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchCheckLayerAvailabilityAsync batch-check-layer-availability-request async-handler)))
  (^java.util.concurrent.Future [^AmazonECRAsync this ^com.amazonaws.services.ecr.model.BatchCheckLayerAvailabilityRequest batch-check-layer-availability-request]
    (-> this (.batchCheckLayerAvailabilityAsync batch-check-layer-availability-request))))

