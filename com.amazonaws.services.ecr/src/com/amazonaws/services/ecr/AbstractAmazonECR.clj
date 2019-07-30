(ns com.amazonaws.services.ecr.AbstractAmazonECR
  "Abstract implementation of AmazonECR. Convenient method forms pass through to the corresponding overload that
  takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.ecr AbstractAmazonECR]))

(defn set-repository-policy
  "Description copied from interface: AmazonECR

  request - `com.amazonaws.services.ecr.model.SetRepositoryPolicyRequest`

  returns: Result of the SetRepositoryPolicy operation returned by the service. - `com.amazonaws.services.ecr.model.SetRepositoryPolicyResult`"
  (^com.amazonaws.services.ecr.model.SetRepositoryPolicyResult [^AbstractAmazonECR this ^com.amazonaws.services.ecr.model.SetRepositoryPolicyRequest request]
    (-> this (.setRepositoryPolicy request))))

(defn list-tags-for-resource
  "Description copied from interface: AmazonECR

  request - `com.amazonaws.services.ecr.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.ecr.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.ecr.model.ListTagsForResourceResult [^AbstractAmazonECR this ^com.amazonaws.services.ecr.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn get-lifecycle-policy
  "Description copied from interface: AmazonECR

  request - `com.amazonaws.services.ecr.model.GetLifecyclePolicyRequest`

  returns: Result of the GetLifecyclePolicy operation returned by the service. - `com.amazonaws.services.ecr.model.GetLifecyclePolicyResult`"
  (^com.amazonaws.services.ecr.model.GetLifecyclePolicyResult [^AbstractAmazonECR this ^com.amazonaws.services.ecr.model.GetLifecyclePolicyRequest request]
    (-> this (.getLifecyclePolicy request))))

(defn delete-repository-policy
  "Description copied from interface: AmazonECR

  request - `com.amazonaws.services.ecr.model.DeleteRepositoryPolicyRequest`

  returns: Result of the DeleteRepositoryPolicy operation returned by the service. - `com.amazonaws.services.ecr.model.DeleteRepositoryPolicyResult`"
  (^com.amazonaws.services.ecr.model.DeleteRepositoryPolicyResult [^AbstractAmazonECR this ^com.amazonaws.services.ecr.model.DeleteRepositoryPolicyRequest request]
    (-> this (.deleteRepositoryPolicy request))))

(defn set-region
  "Description copied from interface: AmazonECR

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonECR this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn batch-check-layer-availability
  "Description copied from interface: AmazonECR

  request - `com.amazonaws.services.ecr.model.BatchCheckLayerAvailabilityRequest`

  returns: Result of the BatchCheckLayerAvailability operation returned by the service. - `com.amazonaws.services.ecr.model.BatchCheckLayerAvailabilityResult`"
  (^com.amazonaws.services.ecr.model.BatchCheckLayerAvailabilityResult [^AbstractAmazonECR this ^com.amazonaws.services.ecr.model.BatchCheckLayerAvailabilityRequest request]
    (-> this (.batchCheckLayerAvailability request))))

(defn untag-resource
  "Description copied from interface: AmazonECR

  request - `com.amazonaws.services.ecr.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.ecr.model.UntagResourceResult`"
  (^com.amazonaws.services.ecr.model.UntagResourceResult [^AbstractAmazonECR this ^com.amazonaws.services.ecr.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn get-download-url-for-layer
  "Description copied from interface: AmazonECR

  request - `com.amazonaws.services.ecr.model.GetDownloadUrlForLayerRequest`

  returns: Result of the GetDownloadUrlForLayer operation returned by the service. - `com.amazonaws.services.ecr.model.GetDownloadUrlForLayerResult`"
  (^com.amazonaws.services.ecr.model.GetDownloadUrlForLayerResult [^AbstractAmazonECR this ^com.amazonaws.services.ecr.model.GetDownloadUrlForLayerRequest request]
    (-> this (.getDownloadUrlForLayer request))))

(defn delete-lifecycle-policy
  "Description copied from interface: AmazonECR

  request - `com.amazonaws.services.ecr.model.DeleteLifecyclePolicyRequest`

  returns: Result of the DeleteLifecyclePolicy operation returned by the service. - `com.amazonaws.services.ecr.model.DeleteLifecyclePolicyResult`"
  (^com.amazonaws.services.ecr.model.DeleteLifecyclePolicyResult [^AbstractAmazonECR this ^com.amazonaws.services.ecr.model.DeleteLifecyclePolicyRequest request]
    (-> this (.deleteLifecyclePolicy request))))

(defn get-repository-policy
  "Description copied from interface: AmazonECR

  request - `com.amazonaws.services.ecr.model.GetRepositoryPolicyRequest`

  returns: Result of the GetRepositoryPolicy operation returned by the service. - `com.amazonaws.services.ecr.model.GetRepositoryPolicyResult`"
  (^com.amazonaws.services.ecr.model.GetRepositoryPolicyResult [^AbstractAmazonECR this ^com.amazonaws.services.ecr.model.GetRepositoryPolicyRequest request]
    (-> this (.getRepositoryPolicy request))))

(defn get-lifecycle-policy-preview
  "Description copied from interface: AmazonECR

  request - `com.amazonaws.services.ecr.model.GetLifecyclePolicyPreviewRequest`

  returns: Result of the GetLifecyclePolicyPreview operation returned by the service. - `com.amazonaws.services.ecr.model.GetLifecyclePolicyPreviewResult`"
  (^com.amazonaws.services.ecr.model.GetLifecyclePolicyPreviewResult [^AbstractAmazonECR this ^com.amazonaws.services.ecr.model.GetLifecyclePolicyPreviewRequest request]
    (-> this (.getLifecyclePolicyPreview request))))

(defn initiate-layer-upload
  "Description copied from interface: AmazonECR

  request - `com.amazonaws.services.ecr.model.InitiateLayerUploadRequest`

  returns: Result of the InitiateLayerUpload operation returned by the service. - `com.amazonaws.services.ecr.model.InitiateLayerUploadResult`"
  (^com.amazonaws.services.ecr.model.InitiateLayerUploadResult [^AbstractAmazonECR this ^com.amazonaws.services.ecr.model.InitiateLayerUploadRequest request]
    (-> this (.initiateLayerUpload request))))

(defn complete-layer-upload
  "Description copied from interface: AmazonECR

  request - `com.amazonaws.services.ecr.model.CompleteLayerUploadRequest`

  returns: Result of the CompleteLayerUpload operation returned by the service. - `com.amazonaws.services.ecr.model.CompleteLayerUploadResult`"
  (^com.amazonaws.services.ecr.model.CompleteLayerUploadResult [^AbstractAmazonECR this ^com.amazonaws.services.ecr.model.CompleteLayerUploadRequest request]
    (-> this (.completeLayerUpload request))))

(defn create-repository
  "Description copied from interface: AmazonECR

  request - `com.amazonaws.services.ecr.model.CreateRepositoryRequest`

  returns: Result of the CreateRepository operation returned by the service. - `com.amazonaws.services.ecr.model.CreateRepositoryResult`"
  (^com.amazonaws.services.ecr.model.CreateRepositoryResult [^AbstractAmazonECR this ^com.amazonaws.services.ecr.model.CreateRepositoryRequest request]
    (-> this (.createRepository request))))

(defn list-images
  "Description copied from interface: AmazonECR

  request - `com.amazonaws.services.ecr.model.ListImagesRequest`

  returns: Result of the ListImages operation returned by the service. - `com.amazonaws.services.ecr.model.ListImagesResult`"
  (^com.amazonaws.services.ecr.model.ListImagesResult [^AbstractAmazonECR this ^com.amazonaws.services.ecr.model.ListImagesRequest request]
    (-> this (.listImages request))))

(defn put-image
  "Description copied from interface: AmazonECR

  request - `com.amazonaws.services.ecr.model.PutImageRequest`

  returns: Result of the PutImage operation returned by the service. - `com.amazonaws.services.ecr.model.PutImageResult`"
  (^com.amazonaws.services.ecr.model.PutImageResult [^AbstractAmazonECR this ^com.amazonaws.services.ecr.model.PutImageRequest request]
    (-> this (.putImage request))))

(defn delete-repository
  "Description copied from interface: AmazonECR

  request - `com.amazonaws.services.ecr.model.DeleteRepositoryRequest`

  returns: Result of the DeleteRepository operation returned by the service. - `com.amazonaws.services.ecr.model.DeleteRepositoryResult`"
  (^com.amazonaws.services.ecr.model.DeleteRepositoryResult [^AbstractAmazonECR this ^com.amazonaws.services.ecr.model.DeleteRepositoryRequest request]
    (-> this (.deleteRepository request))))

(defn shutdown
  "Description copied from interface: AmazonECR"
  ([^AbstractAmazonECR this]
    (-> this (.shutdown))))

(defn describe-repositories
  "Description copied from interface: AmazonECR

  request - `com.amazonaws.services.ecr.model.DescribeRepositoriesRequest`

  returns: Result of the DescribeRepositories operation returned by the service. - `com.amazonaws.services.ecr.model.DescribeRepositoriesResult`"
  (^com.amazonaws.services.ecr.model.DescribeRepositoriesResult [^AbstractAmazonECR this ^com.amazonaws.services.ecr.model.DescribeRepositoriesRequest request]
    (-> this (.describeRepositories request))))

(defn set-endpoint
  "Description copied from interface: AmazonECR

  endpoint - The endpoint (ex: \"api.ecr.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"api.ecr.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonECR this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn batch-delete-image
  "Description copied from interface: AmazonECR

  request - Deletes specified images within a specified repository. Images are specified with either the imageTag or imageDigest. - `com.amazonaws.services.ecr.model.BatchDeleteImageRequest`

  returns: Result of the BatchDeleteImage operation returned by the service. - `com.amazonaws.services.ecr.model.BatchDeleteImageResult`"
  (^com.amazonaws.services.ecr.model.BatchDeleteImageResult [^AbstractAmazonECR this ^com.amazonaws.services.ecr.model.BatchDeleteImageRequest request]
    (-> this (.batchDeleteImage request))))

(defn get-authorization-token
  "Description copied from interface: AmazonECR

  request - `com.amazonaws.services.ecr.model.GetAuthorizationTokenRequest`

  returns: Result of the GetAuthorizationToken operation returned by the service. - `com.amazonaws.services.ecr.model.GetAuthorizationTokenResult`"
  (^com.amazonaws.services.ecr.model.GetAuthorizationTokenResult [^AbstractAmazonECR this ^com.amazonaws.services.ecr.model.GetAuthorizationTokenRequest request]
    (-> this (.getAuthorizationToken request))))

(defn put-image-tag-mutability
  "Description copied from interface: AmazonECR

  request - `com.amazonaws.services.ecr.model.PutImageTagMutabilityRequest`

  returns: Result of the PutImageTagMutability operation returned by the service. - `com.amazonaws.services.ecr.model.PutImageTagMutabilityResult`"
  (^com.amazonaws.services.ecr.model.PutImageTagMutabilityResult [^AbstractAmazonECR this ^com.amazonaws.services.ecr.model.PutImageTagMutabilityRequest request]
    (-> this (.putImageTagMutability request))))

(defn upload-layer-part
  "Description copied from interface: AmazonECR

  request - `com.amazonaws.services.ecr.model.UploadLayerPartRequest`

  returns: Result of the UploadLayerPart operation returned by the service. - `com.amazonaws.services.ecr.model.UploadLayerPartResult`"
  (^com.amazonaws.services.ecr.model.UploadLayerPartResult [^AbstractAmazonECR this ^com.amazonaws.services.ecr.model.UploadLayerPartRequest request]
    (-> this (.uploadLayerPart request))))

(defn put-lifecycle-policy
  "Description copied from interface: AmazonECR

  request - `com.amazonaws.services.ecr.model.PutLifecyclePolicyRequest`

  returns: Result of the PutLifecyclePolicy operation returned by the service. - `com.amazonaws.services.ecr.model.PutLifecyclePolicyResult`"
  (^com.amazonaws.services.ecr.model.PutLifecyclePolicyResult [^AbstractAmazonECR this ^com.amazonaws.services.ecr.model.PutLifecyclePolicyRequest request]
    (-> this (.putLifecyclePolicy request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonECR

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonECR this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn start-lifecycle-policy-preview
  "Description copied from interface: AmazonECR

  request - `com.amazonaws.services.ecr.model.StartLifecyclePolicyPreviewRequest`

  returns: Result of the StartLifecyclePolicyPreview operation returned by the service. - `com.amazonaws.services.ecr.model.StartLifecyclePolicyPreviewResult`"
  (^com.amazonaws.services.ecr.model.StartLifecyclePolicyPreviewResult [^AbstractAmazonECR this ^com.amazonaws.services.ecr.model.StartLifecyclePolicyPreviewRequest request]
    (-> this (.startLifecyclePolicyPreview request))))

(defn tag-resource
  "Description copied from interface: AmazonECR

  request - `com.amazonaws.services.ecr.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.ecr.model.TagResourceResult`"
  (^com.amazonaws.services.ecr.model.TagResourceResult [^AbstractAmazonECR this ^com.amazonaws.services.ecr.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn describe-images
  "Description copied from interface: AmazonECR

  request - `com.amazonaws.services.ecr.model.DescribeImagesRequest`

  returns: Result of the DescribeImages operation returned by the service. - `com.amazonaws.services.ecr.model.DescribeImagesResult`"
  (^com.amazonaws.services.ecr.model.DescribeImagesResult [^AbstractAmazonECR this ^com.amazonaws.services.ecr.model.DescribeImagesRequest request]
    (-> this (.describeImages request))))

(defn batch-get-image
  "Description copied from interface: AmazonECR

  request - `com.amazonaws.services.ecr.model.BatchGetImageRequest`

  returns: Result of the BatchGetImage operation returned by the service. - `com.amazonaws.services.ecr.model.BatchGetImageResult`"
  (^com.amazonaws.services.ecr.model.BatchGetImageResult [^AbstractAmazonECR this ^com.amazonaws.services.ecr.model.BatchGetImageRequest request]
    (-> this (.batchGetImage request))))

