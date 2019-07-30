(ns com.amazonaws.services.cloudfront.AmazonCloudFront
  "Interface for accessing CloudFront.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonCloudFront instead.


  Amazon CloudFront

  This is the Amazon CloudFront API Reference. This guide is for developers who need detailed information about
  CloudFront API actions, data types, and errors. For detailed information about CloudFront features, see the Amazon
  CloudFront Developer Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudfront AmazonCloudFront]))

(defn create-public-key
  "Add a new public key to CloudFront to use, for example, for field-level encryption. You can add a maximum of 10
   public keys with one AWS account.

  create-public-key-request - `com.amazonaws.services.cloudfront.model.CreatePublicKeyRequest`

  returns: Result of the CreatePublicKey operation returned by the service. - `com.amazonaws.services.cloudfront.model.CreatePublicKeyResult`

  throws: com.amazonaws.services.cloudfront.model.PublicKeyAlreadyExistsException - The specified public key already exists."
  (^com.amazonaws.services.cloudfront.model.CreatePublicKeyResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.CreatePublicKeyRequest create-public-key-request]
    (-> this (.createPublicKey create-public-key-request))))

(defn list-tags-for-resource
  "List tags for a CloudFront resource.

  list-tags-for-resource-request - The request to list tags for a CloudFront resource. - `com.amazonaws.services.cloudfront.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.cloudfront.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.cloudfront.model.AccessDeniedException - Access denied."
  (^com.amazonaws.services.cloudfront.model.ListTagsForResourceResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn get-field-level-encryption-profile
  "Get the field-level encryption profile information.

  get-field-level-encryption-profile-request - `com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileRequest`

  returns: Result of the GetFieldLevelEncryptionProfile operation returned by the service. - `com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileResult`

  throws: com.amazonaws.services.cloudfront.model.AccessDeniedException - Access denied."
  (^com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileRequest get-field-level-encryption-profile-request]
    (-> this (.getFieldLevelEncryptionProfile get-field-level-encryption-profile-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AmazonCloudFront this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn get-field-level-encryption-profile-config
  "Get the field-level encryption profile configuration information.

  get-field-level-encryption-profile-config-request - `com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileConfigRequest`

  returns: Result of the GetFieldLevelEncryptionProfileConfig operation returned by the service. - `com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileConfigResult`

  throws: com.amazonaws.services.cloudfront.model.AccessDeniedException - Access denied."
  (^com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileConfigResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileConfigRequest get-field-level-encryption-profile-config-request]
    (-> this (.getFieldLevelEncryptionProfileConfig get-field-level-encryption-profile-config-request))))

(defn waiters
  "returns: `com.amazonaws.services.cloudfront.waiters.AmazonCloudFrontWaiters`"
  (^com.amazonaws.services.cloudfront.waiters.AmazonCloudFrontWaiters [^AmazonCloudFront this]
    (-> this (.waiters))))

(defn get-distribution-config
  "Get the configuration information about a distribution.

  get-distribution-config-request - The request to get a distribution configuration. - `com.amazonaws.services.cloudfront.model.GetDistributionConfigRequest`

  returns: Result of the GetDistributionConfig operation returned by the service. - `com.amazonaws.services.cloudfront.model.GetDistributionConfigResult`

  throws: com.amazonaws.services.cloudfront.model.NoSuchDistributionException - The specified distribution does not exist."
  (^com.amazonaws.services.cloudfront.model.GetDistributionConfigResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.GetDistributionConfigRequest get-distribution-config-request]
    (-> this (.getDistributionConfig get-distribution-config-request))))

(defn update-field-level-encryption-profile
  "Update a field-level encryption profile.

  update-field-level-encryption-profile-request - `com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionProfileRequest`

  returns: Result of the UpdateFieldLevelEncryptionProfile operation returned by the service. - `com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionProfileResult`

  throws: com.amazonaws.services.cloudfront.model.TooManyFieldLevelEncryptionFieldPatternsException - The maximum number of field patterns for field-level encryption have been created."
  (^com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionProfileResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionProfileRequest update-field-level-encryption-profile-request]
    (-> this (.updateFieldLevelEncryptionProfile update-field-level-encryption-profile-request))))

(defn create-cloud-front-origin-access-identity
  "Creates a new origin access identity. If you're using Amazon S3 for your origin, you can use an origin access
   identity to require users to access your content using a CloudFront URL instead of the Amazon S3 URL. For more
   information about how to use origin access identities, see Serving Private
   Content through CloudFront in the Amazon CloudFront Developer Guide.

  create-cloud-front-origin-access-identity-request - The request to create a new origin access identity (OAI). An origin access identity is a special CloudFront user that you can associate with Amazon S3 origins, so that you can secure all or just some of your Amazon S3 content. For more information, see Restricting Access to Amazon S3 Content by Using an Origin Access Identity in the Amazon CloudFront Developer Guide. - `com.amazonaws.services.cloudfront.model.CreateCloudFrontOriginAccessIdentityRequest`

  returns: Result of the CreateCloudFrontOriginAccessIdentity operation returned by the service. - `com.amazonaws.services.cloudfront.model.CreateCloudFrontOriginAccessIdentityResult`

  throws: com.amazonaws.services.cloudfront.model.CloudFrontOriginAccessIdentityAlreadyExistsException - If the CallerReference is a value you already sent in a previous request to create an identity but the content of the CloudFrontOriginAccessIdentityConfig is different from the original request, CloudFront returns a CloudFrontOriginAccessIdentityAlreadyExists error."
  (^com.amazonaws.services.cloudfront.model.CreateCloudFrontOriginAccessIdentityResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.CreateCloudFrontOriginAccessIdentityRequest create-cloud-front-origin-access-identity-request]
    (-> this (.createCloudFrontOriginAccessIdentity create-cloud-front-origin-access-identity-request))))

(defn create-field-level-encryption-profile
  "Create a field-level encryption profile.

  create-field-level-encryption-profile-request - `com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionProfileRequest`

  returns: Result of the CreateFieldLevelEncryptionProfile operation returned by the service. - `com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionProfileResult`

  throws: com.amazonaws.services.cloudfront.model.InconsistentQuantitiesException - The value of Quantity and the size of Items don't match."
  (^com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionProfileResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionProfileRequest create-field-level-encryption-profile-request]
    (-> this (.createFieldLevelEncryptionProfile create-field-level-encryption-profile-request))))

(defn get-distribution
  "Get the information about a distribution.

  get-distribution-request - The request to get a distribution's information. - `com.amazonaws.services.cloudfront.model.GetDistributionRequest`

  returns: Result of the GetDistribution operation returned by the service. - `com.amazonaws.services.cloudfront.model.GetDistributionResult`

  throws: com.amazonaws.services.cloudfront.model.NoSuchDistributionException - The specified distribution does not exist."
  (^com.amazonaws.services.cloudfront.model.GetDistributionResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.GetDistributionRequest get-distribution-request]
    (-> this (.getDistribution get-distribution-request))))

(defn list-cloud-front-origin-access-identities
  "Lists origin access identities.

  list-cloud-front-origin-access-identities-request - The request to list origin access identities. - `com.amazonaws.services.cloudfront.model.ListCloudFrontOriginAccessIdentitiesRequest`

  returns: Result of the ListCloudFrontOriginAccessIdentities operation returned by the service. - `com.amazonaws.services.cloudfront.model.ListCloudFrontOriginAccessIdentitiesResult`

  throws: com.amazonaws.services.cloudfront.model.InvalidArgumentException - The argument is invalid."
  (^com.amazonaws.services.cloudfront.model.ListCloudFrontOriginAccessIdentitiesResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.ListCloudFrontOriginAccessIdentitiesRequest list-cloud-front-origin-access-identities-request]
    (-> this (.listCloudFrontOriginAccessIdentities list-cloud-front-origin-access-identities-request))))

(defn get-invalidation
  "Get the information about an invalidation.

  get-invalidation-request - The request to get an invalidation's information. - `com.amazonaws.services.cloudfront.model.GetInvalidationRequest`

  returns: Result of the GetInvalidation operation returned by the service. - `com.amazonaws.services.cloudfront.model.GetInvalidationResult`

  throws: com.amazonaws.services.cloudfront.model.NoSuchInvalidationException - The specified invalidation does not exist."
  (^com.amazonaws.services.cloudfront.model.GetInvalidationResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.GetInvalidationRequest get-invalidation-request]
    (-> this (.getInvalidation get-invalidation-request))))

(defn delete-field-level-encryption-profile
  "Remove a field-level encryption profile.

  delete-field-level-encryption-profile-request - `com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionProfileRequest`

  returns: Result of the DeleteFieldLevelEncryptionProfile operation returned by the service. - `com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionProfileResult`

  throws: com.amazonaws.services.cloudfront.model.AccessDeniedException - Access denied."
  (^com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionProfileResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionProfileRequest delete-field-level-encryption-profile-request]
    (-> this (.deleteFieldLevelEncryptionProfile delete-field-level-encryption-profile-request))))

(defn untag-resource
  "Remove tags from a CloudFront resource.

  untag-resource-request - The request to remove tags from a CloudFront resource. - `com.amazonaws.services.cloudfront.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.cloudfront.model.UntagResourceResult`

  throws: com.amazonaws.services.cloudfront.model.AccessDeniedException - Access denied."
  (^com.amazonaws.services.cloudfront.model.UntagResourceResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn list-invalidations
  "Lists invalidation batches.

  list-invalidations-request - The request to list invalidations. - `com.amazonaws.services.cloudfront.model.ListInvalidationsRequest`

  returns: Result of the ListInvalidations operation returned by the service. - `com.amazonaws.services.cloudfront.model.ListInvalidationsResult`

  throws: com.amazonaws.services.cloudfront.model.InvalidArgumentException - The argument is invalid."
  (^com.amazonaws.services.cloudfront.model.ListInvalidationsResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.ListInvalidationsRequest list-invalidations-request]
    (-> this (.listInvalidations list-invalidations-request))))

(defn get-field-level-encryption
  "Get the field-level encryption configuration information.

  get-field-level-encryption-request - `com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionRequest`

  returns: Result of the GetFieldLevelEncryption operation returned by the service. - `com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionResult`

  throws: com.amazonaws.services.cloudfront.model.AccessDeniedException - Access denied."
  (^com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionRequest get-field-level-encryption-request]
    (-> this (.getFieldLevelEncryption get-field-level-encryption-request))))

(defn list-distributions
  "List CloudFront distributions.

  list-distributions-request - The request to list your distributions. - `com.amazonaws.services.cloudfront.model.ListDistributionsRequest`

  returns: Result of the ListDistributions operation returned by the service. - `com.amazonaws.services.cloudfront.model.ListDistributionsResult`

  throws: com.amazonaws.services.cloudfront.model.InvalidArgumentException - The argument is invalid."
  (^com.amazonaws.services.cloudfront.model.ListDistributionsResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.ListDistributionsRequest list-distributions-request]
    (-> this (.listDistributions list-distributions-request))))

(defn list-field-level-encryption-profiles
  "Request a list of field-level encryption profiles that have been created in CloudFront for this account.

  list-field-level-encryption-profiles-request - `com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionProfilesRequest`

  returns: Result of the ListFieldLevelEncryptionProfiles operation returned by the service. - `com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionProfilesResult`

  throws: com.amazonaws.services.cloudfront.model.InvalidArgumentException - The argument is invalid."
  (^com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionProfilesResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionProfilesRequest list-field-level-encryption-profiles-request]
    (-> this (.listFieldLevelEncryptionProfiles list-field-level-encryption-profiles-request))))

(defn update-cloud-front-origin-access-identity
  "Update an origin access identity.

  update-cloud-front-origin-access-identity-request - The request to update an origin access identity. - `com.amazonaws.services.cloudfront.model.UpdateCloudFrontOriginAccessIdentityRequest`

  returns: Result of the UpdateCloudFrontOriginAccessIdentity operation returned by the service. - `com.amazonaws.services.cloudfront.model.UpdateCloudFrontOriginAccessIdentityResult`

  throws: com.amazonaws.services.cloudfront.model.AccessDeniedException - Access denied."
  (^com.amazonaws.services.cloudfront.model.UpdateCloudFrontOriginAccessIdentityResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.UpdateCloudFrontOriginAccessIdentityRequest update-cloud-front-origin-access-identity-request]
    (-> this (.updateCloudFrontOriginAccessIdentity update-cloud-front-origin-access-identity-request))))

(defn update-distribution
  "Updates the configuration for a web distribution.



   When you update a distribution, there are more required fields than when you create a distribution. When you
   update your distribution by using this API action, follow the steps here to get the current configuration and
   then make your updates, to make sure that you include all of the required fields. To view a summary, see Required Fields for Create Distribution and Update Distribution in the Amazon CloudFront Developer
   Guide.



   The update process includes getting the current distribution configuration, updating the XML document that is
   returned to make your changes, and then submitting an UpdateDistribution request to make the
   updates.


   For information about updating a distribution using the CloudFront console instead, see Creating a Distribution in the Amazon CloudFront Developer Guide.


   To update a web distribution using the CloudFront API




   Submit a
   GetDistributionConfig request to get the current configuration and an Etag header for the
   distribution.



   If you update the distribution again, you must get a new Etag header.




   Update the XML document that was returned in the response to your GetDistributionConfig request to
   include your changes.



   When you edit the XML file, be aware of the following:




   You must strip out the ETag parameter that is returned.




   Additional fields are required when you update a distribution. There may be fields included in the XML file for
   features that you haven't configured for your distribution. This is expected and required to successfully update
   the distribution.




   You can't change the value of CallerReference. If you try to change this value, CloudFront returns
   an IllegalUpdate error.




   The new configuration replaces the existing configuration; the values that you specify in an
   UpdateDistribution request are not merged into your existing configuration. When you add, delete, or
   replace values in an element that allows multiple values (for example, CNAME), you must specify all
   of the values that you want to appear in the updated distribution. In addition, you must update the corresponding
   Quantity element.






   Submit an UpdateDistribution request to update the configuration for your distribution:




   In the request body, include the XML document that you updated in Step 2. The request body must include an XML
   document with a DistributionConfig element.




   Set the value of the HTTP If-Match header to the value of the ETag header that
   CloudFront returned when you submitted the GetDistributionConfig request in Step 1.






   Review the response to the UpdateDistribution request to confirm that the configuration was
   successfully updated.




   Optional: Submit a GetDistribution
   request to confirm that your changes have propagated. When propagation is complete, the value of
   Status is Deployed.

  update-distribution-request - The request to update a distribution. - `com.amazonaws.services.cloudfront.model.UpdateDistributionRequest`

  returns: Result of the UpdateDistribution operation returned by the service. - `com.amazonaws.services.cloudfront.model.UpdateDistributionResult`

  throws: com.amazonaws.services.cloudfront.model.InvalidHeadersForS3OriginException - The headers specified are not valid for an Amazon S3 origin."
  (^com.amazonaws.services.cloudfront.model.UpdateDistributionResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.UpdateDistributionRequest update-distribution-request]
    (-> this (.updateDistribution update-distribution-request))))

(defn delete-cloud-front-origin-access-identity
  "Delete an origin access identity.

  delete-cloud-front-origin-access-identity-request - Deletes a origin access identity. - `com.amazonaws.services.cloudfront.model.DeleteCloudFrontOriginAccessIdentityRequest`

  returns: Result of the DeleteCloudFrontOriginAccessIdentity operation returned by the service. - `com.amazonaws.services.cloudfront.model.DeleteCloudFrontOriginAccessIdentityResult`

  throws: com.amazonaws.services.cloudfront.model.AccessDeniedException - Access denied."
  (^com.amazonaws.services.cloudfront.model.DeleteCloudFrontOriginAccessIdentityResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.DeleteCloudFrontOriginAccessIdentityRequest delete-cloud-front-origin-access-identity-request]
    (-> this (.deleteCloudFrontOriginAccessIdentity delete-cloud-front-origin-access-identity-request))))

(defn get-field-level-encryption-config
  "Get the field-level encryption configuration information.

  get-field-level-encryption-config-request - `com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionConfigRequest`

  returns: Result of the GetFieldLevelEncryptionConfig operation returned by the service. - `com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionConfigResult`

  throws: com.amazonaws.services.cloudfront.model.AccessDeniedException - Access denied."
  (^com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionConfigResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionConfigRequest get-field-level-encryption-config-request]
    (-> this (.getFieldLevelEncryptionConfig get-field-level-encryption-config-request))))

(defn delete-public-key
  "Remove a public key you previously added to CloudFront.

  delete-public-key-request - `com.amazonaws.services.cloudfront.model.DeletePublicKeyRequest`

  returns: Result of the DeletePublicKey operation returned by the service. - `com.amazonaws.services.cloudfront.model.DeletePublicKeyResult`

  throws: com.amazonaws.services.cloudfront.model.AccessDeniedException - Access denied."
  (^com.amazonaws.services.cloudfront.model.DeletePublicKeyResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.DeletePublicKeyRequest delete-public-key-request]
    (-> this (.deletePublicKey delete-public-key-request))))

(defn update-field-level-encryption-config
  "Update a field-level encryption configuration.

  update-field-level-encryption-config-request - `com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionConfigRequest`

  returns: Result of the UpdateFieldLevelEncryptionConfig operation returned by the service. - `com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionConfigResult`

  throws: com.amazonaws.services.cloudfront.model.NoSuchFieldLevelEncryptionConfigException - The specified configuration for field-level encryption doesn't exist."
  (^com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionConfigResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionConfigRequest update-field-level-encryption-config-request]
    (-> this (.updateFieldLevelEncryptionConfig update-field-level-encryption-config-request))))

(defn create-distribution
  "Creates a new web distribution. You create a CloudFront distribution to tell CloudFront where you want content to
   be delivered from, and the details about how to track and manage content delivery. Send a POST
   request to the /CloudFront API version/distribution/distribution ID resource.



   When you update a distribution, there are more required fields than when you create a distribution. When you
   update your distribution by using UpdateDistribution, follow the steps included in the documentation to get the current configuration and then
   make your updates. This helps to make sure that you include all of the required fields. To view a summary, see Required Fields for Create Distribution and Update Distribution in the Amazon CloudFront Developer
   Guide.

  create-distribution-request - The request to create a new distribution. - `com.amazonaws.services.cloudfront.model.CreateDistributionRequest`

  returns: Result of the CreateDistribution operation returned by the service. - `com.amazonaws.services.cloudfront.model.CreateDistributionResult`

  throws: com.amazonaws.services.cloudfront.model.InvalidHeadersForS3OriginException - The headers specified are not valid for an Amazon S3 origin."
  (^com.amazonaws.services.cloudfront.model.CreateDistributionResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.CreateDistributionRequest create-distribution-request]
    (-> this (.createDistribution create-distribution-request))))

(defn get-cloud-front-origin-access-identity-config
  "Get the configuration information about an origin access identity.

  get-cloud-front-origin-access-identity-config-request - The origin access identity's configuration information. For more information, see CloudFrontOriginAccessIdentityConfig. - `com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityConfigRequest`

  returns: Result of the GetCloudFrontOriginAccessIdentityConfig operation returned by the service. - `com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityConfigResult`

  throws: com.amazonaws.services.cloudfront.model.NoSuchCloudFrontOriginAccessIdentityException - The specified origin access identity does not exist."
  (^com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityConfigResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityConfigRequest get-cloud-front-origin-access-identity-config-request]
    (-> this (.getCloudFrontOriginAccessIdentityConfig get-cloud-front-origin-access-identity-config-request))))

(defn list-public-keys
  "List all public keys that have been added to CloudFront for this account.

  list-public-keys-request - `com.amazonaws.services.cloudfront.model.ListPublicKeysRequest`

  returns: Result of the ListPublicKeys operation returned by the service. - `com.amazonaws.services.cloudfront.model.ListPublicKeysResult`

  throws: com.amazonaws.services.cloudfront.model.InvalidArgumentException - The argument is invalid."
  (^com.amazonaws.services.cloudfront.model.ListPublicKeysResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.ListPublicKeysRequest list-public-keys-request]
    (-> this (.listPublicKeys list-public-keys-request))))

(defn create-streaming-distribution-with-tags
  "Create a new streaming distribution with tags.

  create-streaming-distribution-with-tags-request - The request to create a new streaming distribution with tags. - `com.amazonaws.services.cloudfront.model.CreateStreamingDistributionWithTagsRequest`

  returns: Result of the CreateStreamingDistributionWithTags operation returned by the service. - `com.amazonaws.services.cloudfront.model.CreateStreamingDistributionWithTagsResult`

  throws: com.amazonaws.services.cloudfront.model.TooManyStreamingDistributionCNAMEsException - Your request contains more CNAMEs than are allowed per distribution."
  (^com.amazonaws.services.cloudfront.model.CreateStreamingDistributionWithTagsResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.CreateStreamingDistributionWithTagsRequest create-streaming-distribution-with-tags-request]
    (-> this (.createStreamingDistributionWithTags create-streaming-distribution-with-tags-request))))

(defn delete-field-level-encryption-config
  "Remove a field-level encryption configuration.

  delete-field-level-encryption-config-request - `com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionConfigRequest`

  returns: Result of the DeleteFieldLevelEncryptionConfig operation returned by the service. - `com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionConfigResult`

  throws: com.amazonaws.services.cloudfront.model.AccessDeniedException - Access denied."
  (^com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionConfigResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionConfigRequest delete-field-level-encryption-config-request]
    (-> this (.deleteFieldLevelEncryptionConfig delete-field-level-encryption-config-request))))

(defn create-distribution-with-tags
  "Create a new distribution with tags.

  create-distribution-with-tags-request - The request to create a new distribution with tags. - `com.amazonaws.services.cloudfront.model.CreateDistributionWithTagsRequest`

  returns: Result of the CreateDistributionWithTags operation returned by the service. - `com.amazonaws.services.cloudfront.model.CreateDistributionWithTagsResult`

  throws: com.amazonaws.services.cloudfront.model.InvalidHeadersForS3OriginException - The headers specified are not valid for an Amazon S3 origin."
  (^com.amazonaws.services.cloudfront.model.CreateDistributionWithTagsResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.CreateDistributionWithTagsRequest create-distribution-with-tags-request]
    (-> this (.createDistributionWithTags create-distribution-with-tags-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonCloudFront this]
    (-> this (.shutdown))))

(defn list-streaming-distributions
  "List streaming distributions.

  list-streaming-distributions-request - The request to list your streaming distributions. - `com.amazonaws.services.cloudfront.model.ListStreamingDistributionsRequest`

  returns: Result of the ListStreamingDistributions operation returned by the service. - `com.amazonaws.services.cloudfront.model.ListStreamingDistributionsResult`

  throws: com.amazonaws.services.cloudfront.model.InvalidArgumentException - The argument is invalid."
  (^com.amazonaws.services.cloudfront.model.ListStreamingDistributionsResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.ListStreamingDistributionsRequest list-streaming-distributions-request]
    (-> this (.listStreamingDistributions list-streaming-distributions-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"cloudfront.amazonaws.com/\") or a full URL, including the protocol (ex: \"https://cloudfront.amazonaws.com/\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AmazonCloudFront this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn get-public-key
  "Get the public key information.

  get-public-key-request - `com.amazonaws.services.cloudfront.model.GetPublicKeyRequest`

  returns: Result of the GetPublicKey operation returned by the service. - `com.amazonaws.services.cloudfront.model.GetPublicKeyResult`

  throws: com.amazonaws.services.cloudfront.model.AccessDeniedException - Access denied."
  (^com.amazonaws.services.cloudfront.model.GetPublicKeyResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.GetPublicKeyRequest get-public-key-request]
    (-> this (.getPublicKey get-public-key-request))))

(defn list-distributions-by-web-acl-id
  "List the distributions that are associated with a specified AWS WAF web ACL.

  list-distributions-by-web-acl-id-request - The request to list distributions that are associated with a specified AWS WAF web ACL. - `com.amazonaws.services.cloudfront.model.ListDistributionsByWebACLIdRequest`

  returns: Result of the ListDistributionsByWebACLId operation returned by the service. - `com.amazonaws.services.cloudfront.model.ListDistributionsByWebACLIdResult`

  throws: com.amazonaws.services.cloudfront.model.InvalidArgumentException - The argument is invalid."
  (^com.amazonaws.services.cloudfront.model.ListDistributionsByWebACLIdResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.ListDistributionsByWebACLIdRequest list-distributions-by-web-acl-id-request]
    (-> this (.listDistributionsByWebACLId list-distributions-by-web-acl-id-request))))

(defn get-public-key-config
  "Return public key configuration informaation

  get-public-key-config-request - `com.amazonaws.services.cloudfront.model.GetPublicKeyConfigRequest`

  returns: Result of the GetPublicKeyConfig operation returned by the service. - `com.amazonaws.services.cloudfront.model.GetPublicKeyConfigResult`

  throws: com.amazonaws.services.cloudfront.model.AccessDeniedException - Access denied."
  (^com.amazonaws.services.cloudfront.model.GetPublicKeyConfigResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.GetPublicKeyConfigRequest get-public-key-config-request]
    (-> this (.getPublicKeyConfig get-public-key-config-request))))

(defn delete-streaming-distribution
  "Delete a streaming distribution. To delete an RTMP distribution using the CloudFront API, perform the following
   steps.


   To delete an RTMP distribution using the CloudFront API:




   Disable the RTMP distribution.




   Submit a GET Streaming Distribution Config request to get the current configuration and the
   Etag header for the distribution.




   Update the XML document that was returned in the response to your GET Streaming Distribution Config
   request to change the value of Enabled to false.




   Submit a PUT Streaming Distribution Config request to update the configuration for your
   distribution. In the request body, include the XML document that you updated in Step 3. Then set the value of the
   HTTP If-Match header to the value of the ETag header that CloudFront returned when you
   submitted the GET Streaming Distribution Config request in Step 2.




   Review the response to the PUT Streaming Distribution Config request to confirm that the
   distribution was successfully disabled.




   Submit a GET Streaming Distribution Config request to confirm that your changes have propagated.
   When propagation is complete, the value of Status is Deployed.




   Submit a DELETE Streaming Distribution request. Set the value of the HTTP If-Match
   header to the value of the ETag header that CloudFront returned when you submitted the
   GET Streaming Distribution Config request in Step 2.




   Review the response to your DELETE Streaming Distribution request to confirm that the distribution
   was successfully deleted.




   For information about deleting a distribution using the CloudFront console, see Deleting a
   Distribution in the Amazon CloudFront Developer Guide.

  delete-streaming-distribution-request - The request to delete a streaming distribution. - `com.amazonaws.services.cloudfront.model.DeleteStreamingDistributionRequest`

  returns: Result of the DeleteStreamingDistribution operation returned by the service. - `com.amazonaws.services.cloudfront.model.DeleteStreamingDistributionResult`

  throws: com.amazonaws.services.cloudfront.model.AccessDeniedException - Access denied."
  (^com.amazonaws.services.cloudfront.model.DeleteStreamingDistributionResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.DeleteStreamingDistributionRequest delete-streaming-distribution-request]
    (-> this (.deleteStreamingDistribution delete-streaming-distribution-request))))

(defn update-public-key
  "Update public key information. Note that the only value you can change is the comment.

  update-public-key-request - `com.amazonaws.services.cloudfront.model.UpdatePublicKeyRequest`

  returns: Result of the UpdatePublicKey operation returned by the service. - `com.amazonaws.services.cloudfront.model.UpdatePublicKeyResult`

  throws: com.amazonaws.services.cloudfront.model.AccessDeniedException - Access denied."
  (^com.amazonaws.services.cloudfront.model.UpdatePublicKeyResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.UpdatePublicKeyRequest update-public-key-request]
    (-> this (.updatePublicKey update-public-key-request))))

(defn create-invalidation
  "Create a new invalidation.

  create-invalidation-request - The request to create an invalidation. - `com.amazonaws.services.cloudfront.model.CreateInvalidationRequest`

  returns: Result of the CreateInvalidation operation returned by the service. - `com.amazonaws.services.cloudfront.model.CreateInvalidationResult`

  throws: com.amazonaws.services.cloudfront.model.AccessDeniedException - Access denied."
  (^com.amazonaws.services.cloudfront.model.CreateInvalidationResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.CreateInvalidationRequest create-invalidation-request]
    (-> this (.createInvalidation create-invalidation-request))))

(defn update-streaming-distribution
  "Update a streaming distribution.

  update-streaming-distribution-request - The request to update a streaming distribution. - `com.amazonaws.services.cloudfront.model.UpdateStreamingDistributionRequest`

  returns: Result of the UpdateStreamingDistribution operation returned by the service. - `com.amazonaws.services.cloudfront.model.UpdateStreamingDistributionResult`

  throws: com.amazonaws.services.cloudfront.model.TooManyStreamingDistributionCNAMEsException - Your request contains more CNAMEs than are allowed per distribution."
  (^com.amazonaws.services.cloudfront.model.UpdateStreamingDistributionResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.UpdateStreamingDistributionRequest update-streaming-distribution-request]
    (-> this (.updateStreamingDistribution update-streaming-distribution-request))))

(defn get-streaming-distribution-config
  "Get the configuration information about a streaming distribution.

  get-streaming-distribution-config-request - To request to get a streaming distribution configuration. - `com.amazonaws.services.cloudfront.model.GetStreamingDistributionConfigRequest`

  returns: Result of the GetStreamingDistributionConfig operation returned by the service. - `com.amazonaws.services.cloudfront.model.GetStreamingDistributionConfigResult`

  throws: com.amazonaws.services.cloudfront.model.NoSuchStreamingDistributionException - The specified streaming distribution does not exist."
  (^com.amazonaws.services.cloudfront.model.GetStreamingDistributionConfigResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.GetStreamingDistributionConfigRequest get-streaming-distribution-config-request]
    (-> this (.getStreamingDistributionConfig get-streaming-distribution-config-request))))

(defn get-streaming-distribution
  "Gets information about a specified RTMP distribution, including the distribution configuration.

  get-streaming-distribution-request - The request to get a streaming distribution's information. - `com.amazonaws.services.cloudfront.model.GetStreamingDistributionRequest`

  returns: Result of the GetStreamingDistribution operation returned by the service. - `com.amazonaws.services.cloudfront.model.GetStreamingDistributionResult`

  throws: com.amazonaws.services.cloudfront.model.NoSuchStreamingDistributionException - The specified streaming distribution does not exist."
  (^com.amazonaws.services.cloudfront.model.GetStreamingDistributionResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.GetStreamingDistributionRequest get-streaming-distribution-request]
    (-> this (.getStreamingDistribution get-streaming-distribution-request))))

(defn create-streaming-distribution
  "Creates a new RTMP distribution. An RTMP distribution is similar to a web distribution, but an RTMP distribution
   streams media files using the Adobe Real-Time Messaging Protocol (RTMP) instead of serving files using HTTP.


   To create a new distribution, submit a POST request to the CloudFront API
   version/distribution resource. The request body must include a document with a
   StreamingDistributionConfig element. The response echoes the StreamingDistributionConfig
   element and returns other information about the RTMP distribution.


   To get the status of your request, use the GET StreamingDistribution API action. When the value of
   Enabled is true and the value of Status is Deployed, your
   distribution is ready. A distribution usually deploys in less than 15 minutes.


   For more information about web distributions, see Working with
   RTMP Distributions in the Amazon CloudFront Developer Guide.



   Beginning with the 2012-05-05 version of the CloudFront API, we made substantial changes to the format of the XML
   document that you include in the request body when you create or update a web distribution or an RTMP
   distribution, and when you invalidate objects. With previous versions of the API, we discovered that it was too
   easy to accidentally delete one or more values for an element that accepts multiple values, for example, CNAMEs
   and trusted signers. Our changes for the 2012-05-05 release are intended to prevent these accidental deletions
   and to notify you when there's a mismatch between the number of values you say you're specifying in the
   Quantity element and the number of values specified.

  create-streaming-distribution-request - The request to create a new streaming distribution. - `com.amazonaws.services.cloudfront.model.CreateStreamingDistributionRequest`

  returns: Result of the CreateStreamingDistribution operation returned by the service. - `com.amazonaws.services.cloudfront.model.CreateStreamingDistributionResult`

  throws: com.amazonaws.services.cloudfront.model.TooManyStreamingDistributionCNAMEsException - Your request contains more CNAMEs than are allowed per distribution."
  (^com.amazonaws.services.cloudfront.model.CreateStreamingDistributionResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.CreateStreamingDistributionRequest create-streaming-distribution-request]
    (-> this (.createStreamingDistribution create-streaming-distribution-request))))

(defn delete-distribution
  "Delete a distribution.

  delete-distribution-request - This action deletes a web distribution. To delete a web distribution using the CloudFront API, perform the following steps. To delete a web distribution using the CloudFront API: Disable the web distribution Submit a GET Distribution Config request to get the current configuration and the Etag header for the distribution. Update the XML document that was returned in the response to your GET Distribution Config request to change the value of Enabled to false. Submit a PUT Distribution Config request to update the configuration for your distribution. In the request body, include the XML document that you updated in Step 3. Set the value of the HTTP If-Match header to the value of the ETag header that CloudFront returned when you submitted the GET Distribution Config request in Step 2. Review the response to the PUT Distribution Config request to confirm that the distribution was successfully disabled. Submit a GET Distribution request to confirm that your changes have propagated. When propagation is complete, the value of Status is Deployed. Submit a DELETE Distribution request. Set the value of the HTTP If-Match header to the value of the ETag header that CloudFront returned when you submitted the GET Distribution Config request in Step 6. Review the response to your DELETE Distribution request to confirm that the distribution was successfully deleted. For information about deleting a distribution using the CloudFront console, see Deleting a Distribution in the Amazon CloudFront Developer Guide. - `com.amazonaws.services.cloudfront.model.DeleteDistributionRequest`

  returns: Result of the DeleteDistribution operation returned by the service. - `com.amazonaws.services.cloudfront.model.DeleteDistributionResult`

  throws: com.amazonaws.services.cloudfront.model.AccessDeniedException - Access denied."
  (^com.amazonaws.services.cloudfront.model.DeleteDistributionResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.DeleteDistributionRequest delete-distribution-request]
    (-> this (.deleteDistribution delete-distribution-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonCloudFront this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-cloud-front-origin-access-identity
  "Get the information about an origin access identity.

  get-cloud-front-origin-access-identity-request - The request to get an origin access identity's information. - `com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityRequest`

  returns: Result of the GetCloudFrontOriginAccessIdentity operation returned by the service. - `com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityResult`

  throws: com.amazonaws.services.cloudfront.model.NoSuchCloudFrontOriginAccessIdentityException - The specified origin access identity does not exist."
  (^com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityRequest get-cloud-front-origin-access-identity-request]
    (-> this (.getCloudFrontOriginAccessIdentity get-cloud-front-origin-access-identity-request))))

(defn create-field-level-encryption-config
  "Create a new field-level encryption configuration.

  create-field-level-encryption-config-request - `com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionConfigRequest`

  returns: Result of the CreateFieldLevelEncryptionConfig operation returned by the service. - `com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionConfigResult`

  throws: com.amazonaws.services.cloudfront.model.InconsistentQuantitiesException - The value of Quantity and the size of Items don't match."
  (^com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionConfigResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionConfigRequest create-field-level-encryption-config-request]
    (-> this (.createFieldLevelEncryptionConfig create-field-level-encryption-config-request))))

(defn tag-resource
  "Add tags to a CloudFront resource.

  tag-resource-request - The request to add tags to a CloudFront resource. - `com.amazonaws.services.cloudfront.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.cloudfront.model.TagResourceResult`

  throws: com.amazonaws.services.cloudfront.model.AccessDeniedException - Access denied."
  (^com.amazonaws.services.cloudfront.model.TagResourceResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

(defn list-field-level-encryption-configs
  "List all field-level encryption configurations that have been created in CloudFront for this account.

  list-field-level-encryption-configs-request - `com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionConfigsRequest`

  returns: Result of the ListFieldLevelEncryptionConfigs operation returned by the service. - `com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionConfigsResult`

  throws: com.amazonaws.services.cloudfront.model.InvalidArgumentException - The argument is invalid."
  (^com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionConfigsResult [^AmazonCloudFront this ^com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionConfigsRequest list-field-level-encryption-configs-request]
    (-> this (.listFieldLevelEncryptionConfigs list-field-level-encryption-configs-request))))

