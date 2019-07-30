(ns com.amazonaws.services.cloudfront.AbstractAmazonCloudFront
  "Abstract implementation of AmazonCloudFront. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudfront AbstractAmazonCloudFront]))

(defn create-public-key
  "Description copied from interface: AmazonCloudFront

  request - `com.amazonaws.services.cloudfront.model.CreatePublicKeyRequest`

  returns: Result of the CreatePublicKey operation returned by the service. - `com.amazonaws.services.cloudfront.model.CreatePublicKeyResult`"
  (^com.amazonaws.services.cloudfront.model.CreatePublicKeyResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.CreatePublicKeyRequest request]
    (-> this (.createPublicKey request))))

(defn list-tags-for-resource
  "Description copied from interface: AmazonCloudFront

  request - The request to list tags for a CloudFront resource. - `com.amazonaws.services.cloudfront.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.cloudfront.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.cloudfront.model.ListTagsForResourceResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn get-field-level-encryption-profile
  "Description copied from interface: AmazonCloudFront

  request - `com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileRequest`

  returns: Result of the GetFieldLevelEncryptionProfile operation returned by the service. - `com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileResult`"
  (^com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileRequest request]
    (-> this (.getFieldLevelEncryptionProfile request))))

(defn set-region
  "Description copied from interface: AmazonCloudFront

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonCloudFront this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn get-field-level-encryption-profile-config
  "Description copied from interface: AmazonCloudFront

  request - `com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileConfigRequest`

  returns: Result of the GetFieldLevelEncryptionProfileConfig operation returned by the service. - `com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileConfigResult`"
  (^com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileConfigResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileConfigRequest request]
    (-> this (.getFieldLevelEncryptionProfileConfig request))))

(defn waiters
  "returns: `com.amazonaws.services.cloudfront.waiters.AmazonCloudFrontWaiters`"
  (^com.amazonaws.services.cloudfront.waiters.AmazonCloudFrontWaiters [^AbstractAmazonCloudFront this]
    (-> this (.waiters))))

(defn get-distribution-config
  "Description copied from interface: AmazonCloudFront

  request - The request to get a distribution configuration. - `com.amazonaws.services.cloudfront.model.GetDistributionConfigRequest`

  returns: Result of the GetDistributionConfig operation returned by the service. - `com.amazonaws.services.cloudfront.model.GetDistributionConfigResult`"
  (^com.amazonaws.services.cloudfront.model.GetDistributionConfigResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.GetDistributionConfigRequest request]
    (-> this (.getDistributionConfig request))))

(defn update-field-level-encryption-profile
  "Description copied from interface: AmazonCloudFront

  request - `com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionProfileRequest`

  returns: Result of the UpdateFieldLevelEncryptionProfile operation returned by the service. - `com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionProfileResult`"
  (^com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionProfileResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionProfileRequest request]
    (-> this (.updateFieldLevelEncryptionProfile request))))

(defn create-cloud-front-origin-access-identity
  "Description copied from interface: AmazonCloudFront

  request - The request to create a new origin access identity (OAI). An origin access identity is a special CloudFront user that you can associate with Amazon S3 origins, so that you can secure all or just some of your Amazon S3 content. For more information, see Restricting Access to Amazon S3 Content by Using an Origin Access Identity in the Amazon CloudFront Developer Guide. - `com.amazonaws.services.cloudfront.model.CreateCloudFrontOriginAccessIdentityRequest`

  returns: Result of the CreateCloudFrontOriginAccessIdentity operation returned by the service. - `com.amazonaws.services.cloudfront.model.CreateCloudFrontOriginAccessIdentityResult`"
  (^com.amazonaws.services.cloudfront.model.CreateCloudFrontOriginAccessIdentityResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.CreateCloudFrontOriginAccessIdentityRequest request]
    (-> this (.createCloudFrontOriginAccessIdentity request))))

(defn create-field-level-encryption-profile
  "Description copied from interface: AmazonCloudFront

  request - `com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionProfileRequest`

  returns: Result of the CreateFieldLevelEncryptionProfile operation returned by the service. - `com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionProfileResult`"
  (^com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionProfileResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionProfileRequest request]
    (-> this (.createFieldLevelEncryptionProfile request))))

(defn get-distribution
  "Description copied from interface: AmazonCloudFront

  request - The request to get a distribution's information. - `com.amazonaws.services.cloudfront.model.GetDistributionRequest`

  returns: Result of the GetDistribution operation returned by the service. - `com.amazonaws.services.cloudfront.model.GetDistributionResult`"
  (^com.amazonaws.services.cloudfront.model.GetDistributionResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.GetDistributionRequest request]
    (-> this (.getDistribution request))))

(defn list-cloud-front-origin-access-identities
  "Description copied from interface: AmazonCloudFront

  request - The request to list origin access identities. - `com.amazonaws.services.cloudfront.model.ListCloudFrontOriginAccessIdentitiesRequest`

  returns: Result of the ListCloudFrontOriginAccessIdentities operation returned by the service. - `com.amazonaws.services.cloudfront.model.ListCloudFrontOriginAccessIdentitiesResult`"
  (^com.amazonaws.services.cloudfront.model.ListCloudFrontOriginAccessIdentitiesResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.ListCloudFrontOriginAccessIdentitiesRequest request]
    (-> this (.listCloudFrontOriginAccessIdentities request))))

(defn get-invalidation
  "Description copied from interface: AmazonCloudFront

  request - The request to get an invalidation's information. - `com.amazonaws.services.cloudfront.model.GetInvalidationRequest`

  returns: Result of the GetInvalidation operation returned by the service. - `com.amazonaws.services.cloudfront.model.GetInvalidationResult`"
  (^com.amazonaws.services.cloudfront.model.GetInvalidationResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.GetInvalidationRequest request]
    (-> this (.getInvalidation request))))

(defn delete-field-level-encryption-profile
  "Description copied from interface: AmazonCloudFront

  request - `com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionProfileRequest`

  returns: Result of the DeleteFieldLevelEncryptionProfile operation returned by the service. - `com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionProfileResult`"
  (^com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionProfileResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionProfileRequest request]
    (-> this (.deleteFieldLevelEncryptionProfile request))))

(defn untag-resource
  "Description copied from interface: AmazonCloudFront

  request - The request to remove tags from a CloudFront resource. - `com.amazonaws.services.cloudfront.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.cloudfront.model.UntagResourceResult`"
  (^com.amazonaws.services.cloudfront.model.UntagResourceResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn list-invalidations
  "Description copied from interface: AmazonCloudFront

  request - The request to list invalidations. - `com.amazonaws.services.cloudfront.model.ListInvalidationsRequest`

  returns: Result of the ListInvalidations operation returned by the service. - `com.amazonaws.services.cloudfront.model.ListInvalidationsResult`"
  (^com.amazonaws.services.cloudfront.model.ListInvalidationsResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.ListInvalidationsRequest request]
    (-> this (.listInvalidations request))))

(defn get-field-level-encryption
  "Description copied from interface: AmazonCloudFront

  request - `com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionRequest`

  returns: Result of the GetFieldLevelEncryption operation returned by the service. - `com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionResult`"
  (^com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionRequest request]
    (-> this (.getFieldLevelEncryption request))))

(defn list-distributions
  "Description copied from interface: AmazonCloudFront

  request - The request to list your distributions. - `com.amazonaws.services.cloudfront.model.ListDistributionsRequest`

  returns: Result of the ListDistributions operation returned by the service. - `com.amazonaws.services.cloudfront.model.ListDistributionsResult`"
  (^com.amazonaws.services.cloudfront.model.ListDistributionsResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.ListDistributionsRequest request]
    (-> this (.listDistributions request))))

(defn list-field-level-encryption-profiles
  "Description copied from interface: AmazonCloudFront

  request - `com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionProfilesRequest`

  returns: Result of the ListFieldLevelEncryptionProfiles operation returned by the service. - `com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionProfilesResult`"
  (^com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionProfilesResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionProfilesRequest request]
    (-> this (.listFieldLevelEncryptionProfiles request))))

(defn update-cloud-front-origin-access-identity
  "Description copied from interface: AmazonCloudFront

  request - The request to update an origin access identity. - `com.amazonaws.services.cloudfront.model.UpdateCloudFrontOriginAccessIdentityRequest`

  returns: Result of the UpdateCloudFrontOriginAccessIdentity operation returned by the service. - `com.amazonaws.services.cloudfront.model.UpdateCloudFrontOriginAccessIdentityResult`"
  (^com.amazonaws.services.cloudfront.model.UpdateCloudFrontOriginAccessIdentityResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.UpdateCloudFrontOriginAccessIdentityRequest request]
    (-> this (.updateCloudFrontOriginAccessIdentity request))))

(defn update-distribution
  "Description copied from interface: AmazonCloudFront

  request - The request to update a distribution. - `com.amazonaws.services.cloudfront.model.UpdateDistributionRequest`

  returns: Result of the UpdateDistribution operation returned by the service. - `com.amazonaws.services.cloudfront.model.UpdateDistributionResult`"
  (^com.amazonaws.services.cloudfront.model.UpdateDistributionResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.UpdateDistributionRequest request]
    (-> this (.updateDistribution request))))

(defn delete-cloud-front-origin-access-identity
  "Description copied from interface: AmazonCloudFront

  request - Deletes a origin access identity. - `com.amazonaws.services.cloudfront.model.DeleteCloudFrontOriginAccessIdentityRequest`

  returns: Result of the DeleteCloudFrontOriginAccessIdentity operation returned by the service. - `com.amazonaws.services.cloudfront.model.DeleteCloudFrontOriginAccessIdentityResult`"
  (^com.amazonaws.services.cloudfront.model.DeleteCloudFrontOriginAccessIdentityResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.DeleteCloudFrontOriginAccessIdentityRequest request]
    (-> this (.deleteCloudFrontOriginAccessIdentity request))))

(defn get-field-level-encryption-config
  "Description copied from interface: AmazonCloudFront

  request - `com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionConfigRequest`

  returns: Result of the GetFieldLevelEncryptionConfig operation returned by the service. - `com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionConfigResult`"
  (^com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionConfigResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionConfigRequest request]
    (-> this (.getFieldLevelEncryptionConfig request))))

(defn delete-public-key
  "Description copied from interface: AmazonCloudFront

  request - `com.amazonaws.services.cloudfront.model.DeletePublicKeyRequest`

  returns: Result of the DeletePublicKey operation returned by the service. - `com.amazonaws.services.cloudfront.model.DeletePublicKeyResult`"
  (^com.amazonaws.services.cloudfront.model.DeletePublicKeyResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.DeletePublicKeyRequest request]
    (-> this (.deletePublicKey request))))

(defn update-field-level-encryption-config
  "Description copied from interface: AmazonCloudFront

  request - `com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionConfigRequest`

  returns: Result of the UpdateFieldLevelEncryptionConfig operation returned by the service. - `com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionConfigResult`"
  (^com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionConfigResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionConfigRequest request]
    (-> this (.updateFieldLevelEncryptionConfig request))))

(defn create-distribution
  "Description copied from interface: AmazonCloudFront

  request - The request to create a new distribution. - `com.amazonaws.services.cloudfront.model.CreateDistributionRequest`

  returns: Result of the CreateDistribution operation returned by the service. - `com.amazonaws.services.cloudfront.model.CreateDistributionResult`"
  (^com.amazonaws.services.cloudfront.model.CreateDistributionResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.CreateDistributionRequest request]
    (-> this (.createDistribution request))))

(defn get-cloud-front-origin-access-identity-config
  "Description copied from interface: AmazonCloudFront

  request - The origin access identity's configuration information. For more information, see CloudFrontOriginAccessIdentityConfig. - `com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityConfigRequest`

  returns: Result of the GetCloudFrontOriginAccessIdentityConfig operation returned by the service. - `com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityConfigResult`"
  (^com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityConfigResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityConfigRequest request]
    (-> this (.getCloudFrontOriginAccessIdentityConfig request))))

(defn list-public-keys
  "Description copied from interface: AmazonCloudFront

  request - `com.amazonaws.services.cloudfront.model.ListPublicKeysRequest`

  returns: Result of the ListPublicKeys operation returned by the service. - `com.amazonaws.services.cloudfront.model.ListPublicKeysResult`"
  (^com.amazonaws.services.cloudfront.model.ListPublicKeysResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.ListPublicKeysRequest request]
    (-> this (.listPublicKeys request))))

(defn create-streaming-distribution-with-tags
  "Description copied from interface: AmazonCloudFront

  request - The request to create a new streaming distribution with tags. - `com.amazonaws.services.cloudfront.model.CreateStreamingDistributionWithTagsRequest`

  returns: Result of the CreateStreamingDistributionWithTags operation returned by the service. - `com.amazonaws.services.cloudfront.model.CreateStreamingDistributionWithTagsResult`"
  (^com.amazonaws.services.cloudfront.model.CreateStreamingDistributionWithTagsResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.CreateStreamingDistributionWithTagsRequest request]
    (-> this (.createStreamingDistributionWithTags request))))

(defn delete-field-level-encryption-config
  "Description copied from interface: AmazonCloudFront

  request - `com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionConfigRequest`

  returns: Result of the DeleteFieldLevelEncryptionConfig operation returned by the service. - `com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionConfigResult`"
  (^com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionConfigResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionConfigRequest request]
    (-> this (.deleteFieldLevelEncryptionConfig request))))

(defn create-distribution-with-tags
  "Description copied from interface: AmazonCloudFront

  request - The request to create a new distribution with tags. - `com.amazonaws.services.cloudfront.model.CreateDistributionWithTagsRequest`

  returns: Result of the CreateDistributionWithTags operation returned by the service. - `com.amazonaws.services.cloudfront.model.CreateDistributionWithTagsResult`"
  (^com.amazonaws.services.cloudfront.model.CreateDistributionWithTagsResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.CreateDistributionWithTagsRequest request]
    (-> this (.createDistributionWithTags request))))

(defn shutdown
  "Description copied from interface: AmazonCloudFront"
  ([^AbstractAmazonCloudFront this]
    (-> this (.shutdown))))

(defn list-streaming-distributions
  "Description copied from interface: AmazonCloudFront

  request - The request to list your streaming distributions. - `com.amazonaws.services.cloudfront.model.ListStreamingDistributionsRequest`

  returns: Result of the ListStreamingDistributions operation returned by the service. - `com.amazonaws.services.cloudfront.model.ListStreamingDistributionsResult`"
  (^com.amazonaws.services.cloudfront.model.ListStreamingDistributionsResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.ListStreamingDistributionsRequest request]
    (-> this (.listStreamingDistributions request))))

(defn set-endpoint
  "Description copied from interface: AmazonCloudFront

  endpoint - The endpoint (ex: \"cloudfront.amazonaws.com/\") or a full URL, including the protocol (ex: \"https://cloudfront.amazonaws.com/\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonCloudFront this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn get-public-key
  "Description copied from interface: AmazonCloudFront

  request - `com.amazonaws.services.cloudfront.model.GetPublicKeyRequest`

  returns: Result of the GetPublicKey operation returned by the service. - `com.amazonaws.services.cloudfront.model.GetPublicKeyResult`"
  (^com.amazonaws.services.cloudfront.model.GetPublicKeyResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.GetPublicKeyRequest request]
    (-> this (.getPublicKey request))))

(defn list-distributions-by-web-acl-id
  "Description copied from interface: AmazonCloudFront

  request - The request to list distributions that are associated with a specified AWS WAF web ACL. - `com.amazonaws.services.cloudfront.model.ListDistributionsByWebACLIdRequest`

  returns: Result of the ListDistributionsByWebACLId operation returned by the service. - `com.amazonaws.services.cloudfront.model.ListDistributionsByWebACLIdResult`"
  (^com.amazonaws.services.cloudfront.model.ListDistributionsByWebACLIdResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.ListDistributionsByWebACLIdRequest request]
    (-> this (.listDistributionsByWebACLId request))))

(defn get-public-key-config
  "Description copied from interface: AmazonCloudFront

  request - `com.amazonaws.services.cloudfront.model.GetPublicKeyConfigRequest`

  returns: Result of the GetPublicKeyConfig operation returned by the service. - `com.amazonaws.services.cloudfront.model.GetPublicKeyConfigResult`"
  (^com.amazonaws.services.cloudfront.model.GetPublicKeyConfigResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.GetPublicKeyConfigRequest request]
    (-> this (.getPublicKeyConfig request))))

(defn delete-streaming-distribution
  "Description copied from interface: AmazonCloudFront

  request - The request to delete a streaming distribution. - `com.amazonaws.services.cloudfront.model.DeleteStreamingDistributionRequest`

  returns: Result of the DeleteStreamingDistribution operation returned by the service. - `com.amazonaws.services.cloudfront.model.DeleteStreamingDistributionResult`"
  (^com.amazonaws.services.cloudfront.model.DeleteStreamingDistributionResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.DeleteStreamingDistributionRequest request]
    (-> this (.deleteStreamingDistribution request))))

(defn update-public-key
  "Description copied from interface: AmazonCloudFront

  request - `com.amazonaws.services.cloudfront.model.UpdatePublicKeyRequest`

  returns: Result of the UpdatePublicKey operation returned by the service. - `com.amazonaws.services.cloudfront.model.UpdatePublicKeyResult`"
  (^com.amazonaws.services.cloudfront.model.UpdatePublicKeyResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.UpdatePublicKeyRequest request]
    (-> this (.updatePublicKey request))))

(defn create-invalidation
  "Description copied from interface: AmazonCloudFront

  request - The request to create an invalidation. - `com.amazonaws.services.cloudfront.model.CreateInvalidationRequest`

  returns: Result of the CreateInvalidation operation returned by the service. - `com.amazonaws.services.cloudfront.model.CreateInvalidationResult`"
  (^com.amazonaws.services.cloudfront.model.CreateInvalidationResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.CreateInvalidationRequest request]
    (-> this (.createInvalidation request))))

(defn update-streaming-distribution
  "Description copied from interface: AmazonCloudFront

  request - The request to update a streaming distribution. - `com.amazonaws.services.cloudfront.model.UpdateStreamingDistributionRequest`

  returns: Result of the UpdateStreamingDistribution operation returned by the service. - `com.amazonaws.services.cloudfront.model.UpdateStreamingDistributionResult`"
  (^com.amazonaws.services.cloudfront.model.UpdateStreamingDistributionResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.UpdateStreamingDistributionRequest request]
    (-> this (.updateStreamingDistribution request))))

(defn get-streaming-distribution-config
  "Description copied from interface: AmazonCloudFront

  request - To request to get a streaming distribution configuration. - `com.amazonaws.services.cloudfront.model.GetStreamingDistributionConfigRequest`

  returns: Result of the GetStreamingDistributionConfig operation returned by the service. - `com.amazonaws.services.cloudfront.model.GetStreamingDistributionConfigResult`"
  (^com.amazonaws.services.cloudfront.model.GetStreamingDistributionConfigResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.GetStreamingDistributionConfigRequest request]
    (-> this (.getStreamingDistributionConfig request))))

(defn get-streaming-distribution
  "Description copied from interface: AmazonCloudFront

  request - The request to get a streaming distribution's information. - `com.amazonaws.services.cloudfront.model.GetStreamingDistributionRequest`

  returns: Result of the GetStreamingDistribution operation returned by the service. - `com.amazonaws.services.cloudfront.model.GetStreamingDistributionResult`"
  (^com.amazonaws.services.cloudfront.model.GetStreamingDistributionResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.GetStreamingDistributionRequest request]
    (-> this (.getStreamingDistribution request))))

(defn create-streaming-distribution
  "Description copied from interface: AmazonCloudFront

  request - The request to create a new streaming distribution. - `com.amazonaws.services.cloudfront.model.CreateStreamingDistributionRequest`

  returns: Result of the CreateStreamingDistribution operation returned by the service. - `com.amazonaws.services.cloudfront.model.CreateStreamingDistributionResult`"
  (^com.amazonaws.services.cloudfront.model.CreateStreamingDistributionResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.CreateStreamingDistributionRequest request]
    (-> this (.createStreamingDistribution request))))

(defn delete-distribution
  "Description copied from interface: AmazonCloudFront

  request - This action deletes a web distribution. To delete a web distribution using the CloudFront API, perform the following steps. To delete a web distribution using the CloudFront API: Disable the web distribution Submit a GET Distribution Config request to get the current configuration and the Etag header for the distribution. Update the XML document that was returned in the response to your GET Distribution Config request to change the value of Enabled to false. Submit a PUT Distribution Config request to update the configuration for your distribution. In the request body, include the XML document that you updated in Step 3. Set the value of the HTTP If-Match header to the value of the ETag header that CloudFront returned when you submitted the GET Distribution Config request in Step 2. Review the response to the PUT Distribution Config request to confirm that the distribution was successfully disabled. Submit a GET Distribution request to confirm that your changes have propagated. When propagation is complete, the value of Status is Deployed. Submit a DELETE Distribution request. Set the value of the HTTP If-Match header to the value of the ETag header that CloudFront returned when you submitted the GET Distribution Config request in Step 6. Review the response to your DELETE Distribution request to confirm that the distribution was successfully deleted. For information about deleting a distribution using the CloudFront console, see Deleting a Distribution in the Amazon CloudFront Developer Guide. - `com.amazonaws.services.cloudfront.model.DeleteDistributionRequest`

  returns: Result of the DeleteDistribution operation returned by the service. - `com.amazonaws.services.cloudfront.model.DeleteDistributionResult`"
  (^com.amazonaws.services.cloudfront.model.DeleteDistributionResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.DeleteDistributionRequest request]
    (-> this (.deleteDistribution request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonCloudFront

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonCloudFront this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-cloud-front-origin-access-identity
  "Description copied from interface: AmazonCloudFront

  request - The request to get an origin access identity's information. - `com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityRequest`

  returns: Result of the GetCloudFrontOriginAccessIdentity operation returned by the service. - `com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityResult`"
  (^com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityRequest request]
    (-> this (.getCloudFrontOriginAccessIdentity request))))

(defn create-field-level-encryption-config
  "Description copied from interface: AmazonCloudFront

  request - `com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionConfigRequest`

  returns: Result of the CreateFieldLevelEncryptionConfig operation returned by the service. - `com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionConfigResult`"
  (^com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionConfigResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionConfigRequest request]
    (-> this (.createFieldLevelEncryptionConfig request))))

(defn tag-resource
  "Description copied from interface: AmazonCloudFront

  request - The request to add tags to a CloudFront resource. - `com.amazonaws.services.cloudfront.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.cloudfront.model.TagResourceResult`"
  (^com.amazonaws.services.cloudfront.model.TagResourceResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn list-field-level-encryption-configs
  "Description copied from interface: AmazonCloudFront

  request - `com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionConfigsRequest`

  returns: Result of the ListFieldLevelEncryptionConfigs operation returned by the service. - `com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionConfigsResult`"
  (^com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionConfigsResult [^AbstractAmazonCloudFront this ^com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionConfigsRequest request]
    (-> this (.listFieldLevelEncryptionConfigs request))))

