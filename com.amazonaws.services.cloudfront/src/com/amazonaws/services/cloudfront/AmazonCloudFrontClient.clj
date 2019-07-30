(ns com.amazonaws.services.cloudfront.AmazonCloudFrontClient
  "Client for accessing CloudFront. All service calls made using this client are blocking, and will not return until the
  service call completes.

  Amazon CloudFront

  This is the Amazon CloudFront API Reference. This guide is for developers who need detailed information about
  CloudFront API actions, data types, and errors. For detailed information about CloudFront features, see the Amazon
  CloudFront Developer Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudfront AmazonCloudFrontClient]))

(defn ->amazon-cloud-front-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to CloudFront (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AmazonCloudFrontClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AmazonCloudFrontClient aws-credentials-provider client-configuration request-metric-collector))
  (^AmazonCloudFrontClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonCloudFrontClient aws-credentials client-configuration))
  (^AmazonCloudFrontClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonCloudFrontClient client-configuration))
  (^AmazonCloudFrontClient []
    (new AmazonCloudFrontClient )))

(defn *builder
  "returns: `com.amazonaws.services.cloudfront.AmazonCloudFrontClientBuilder`"
  (^com.amazonaws.services.cloudfront.AmazonCloudFrontClientBuilder []
    (AmazonCloudFrontClient/builder )))

(defn create-public-key
  "Add a new public key to CloudFront to use, for example, for field-level encryption. You can add a maximum of 10
   public keys with one AWS account.

  request - `com.amazonaws.services.cloudfront.model.CreatePublicKeyRequest`

  returns: Result of the CreatePublicKey operation returned by the service. - `com.amazonaws.services.cloudfront.model.CreatePublicKeyResult`

  throws: com.amazonaws.services.cloudfront.model.PublicKeyAlreadyExistsException - The specified public key already exists."
  (^com.amazonaws.services.cloudfront.model.CreatePublicKeyResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.CreatePublicKeyRequest request]
    (-> this (.createPublicKey request))))

(defn list-tags-for-resource
  "List tags for a CloudFront resource.

  request - `com.amazonaws.services.cloudfront.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.cloudfront.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.cloudfront.model.AccessDeniedException - Access denied."
  (^com.amazonaws.services.cloudfront.model.ListTagsForResourceResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn get-field-level-encryption-profile
  "Get the field-level encryption profile information.

  request - `com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileRequest`

  returns: Result of the GetFieldLevelEncryptionProfile operation returned by the service. - `com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileResult`

  throws: com.amazonaws.services.cloudfront.model.AccessDeniedException - Access denied."
  (^com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileRequest request]
    (-> this (.getFieldLevelEncryptionProfile request))))

(defn get-field-level-encryption-profile-config
  "Get the field-level encryption profile configuration information.

  request - `com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileConfigRequest`

  returns: Result of the GetFieldLevelEncryptionProfileConfig operation returned by the service. - `com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileConfigResult`

  throws: com.amazonaws.services.cloudfront.model.AccessDeniedException - Access denied."
  (^com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileConfigResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileConfigRequest request]
    (-> this (.getFieldLevelEncryptionProfileConfig request))))

(defn waiters
  "returns: `com.amazonaws.services.cloudfront.waiters.AmazonCloudFrontWaiters`"
  (^com.amazonaws.services.cloudfront.waiters.AmazonCloudFrontWaiters [^AmazonCloudFrontClient this]
    (-> this (.waiters))))

(defn get-distribution-config
  "Get the configuration information about a distribution.

  request - `com.amazonaws.services.cloudfront.model.GetDistributionConfigRequest`

  returns: Result of the GetDistributionConfig operation returned by the service. - `com.amazonaws.services.cloudfront.model.GetDistributionConfigResult`

  throws: com.amazonaws.services.cloudfront.model.NoSuchDistributionException - The specified distribution does not exist."
  (^com.amazonaws.services.cloudfront.model.GetDistributionConfigResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.GetDistributionConfigRequest request]
    (-> this (.getDistributionConfig request))))

(defn update-field-level-encryption-profile
  "Update a field-level encryption profile.

  request - `com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionProfileRequest`

  returns: Result of the UpdateFieldLevelEncryptionProfile operation returned by the service. - `com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionProfileResult`

  throws: com.amazonaws.services.cloudfront.model.TooManyFieldLevelEncryptionFieldPatternsException - The maximum number of field patterns for field-level encryption have been created."
  (^com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionProfileResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionProfileRequest request]
    (-> this (.updateFieldLevelEncryptionProfile request))))

(defn create-cloud-front-origin-access-identity
  "Creates a new origin access identity. If you're using Amazon S3 for your origin, you can use an origin access
   identity to require users to access your content using a CloudFront URL instead of the Amazon S3 URL. For more
   information about how to use origin access identities, see Serving Private
   Content through CloudFront in the Amazon CloudFront Developer Guide.

  request - `com.amazonaws.services.cloudfront.model.CreateCloudFrontOriginAccessIdentityRequest`

  returns: Result of the CreateCloudFrontOriginAccessIdentity operation returned by the service. - `com.amazonaws.services.cloudfront.model.CreateCloudFrontOriginAccessIdentityResult`

  throws: com.amazonaws.services.cloudfront.model.CloudFrontOriginAccessIdentityAlreadyExistsException - If the CallerReference is a value you already sent in a previous request to create an identity but the content of the CloudFrontOriginAccessIdentityConfig is different from the original request, CloudFront returns a CloudFrontOriginAccessIdentityAlreadyExists error."
  (^com.amazonaws.services.cloudfront.model.CreateCloudFrontOriginAccessIdentityResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.CreateCloudFrontOriginAccessIdentityRequest request]
    (-> this (.createCloudFrontOriginAccessIdentity request))))

(defn create-field-level-encryption-profile
  "Create a field-level encryption profile.

  request - `com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionProfileRequest`

  returns: Result of the CreateFieldLevelEncryptionProfile operation returned by the service. - `com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionProfileResult`

  throws: com.amazonaws.services.cloudfront.model.InconsistentQuantitiesException - The value of Quantity and the size of Items don't match."
  (^com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionProfileResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionProfileRequest request]
    (-> this (.createFieldLevelEncryptionProfile request))))

(defn get-distribution
  "Get the information about a distribution.

  request - `com.amazonaws.services.cloudfront.model.GetDistributionRequest`

  returns: Result of the GetDistribution operation returned by the service. - `com.amazonaws.services.cloudfront.model.GetDistributionResult`

  throws: com.amazonaws.services.cloudfront.model.NoSuchDistributionException - The specified distribution does not exist."
  (^com.amazonaws.services.cloudfront.model.GetDistributionResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.GetDistributionRequest request]
    (-> this (.getDistribution request))))

(defn list-cloud-front-origin-access-identities
  "Lists origin access identities.

  request - `com.amazonaws.services.cloudfront.model.ListCloudFrontOriginAccessIdentitiesRequest`

  returns: Result of the ListCloudFrontOriginAccessIdentities operation returned by the service. - `com.amazonaws.services.cloudfront.model.ListCloudFrontOriginAccessIdentitiesResult`

  throws: com.amazonaws.services.cloudfront.model.InvalidArgumentException - The argument is invalid."
  (^com.amazonaws.services.cloudfront.model.ListCloudFrontOriginAccessIdentitiesResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.ListCloudFrontOriginAccessIdentitiesRequest request]
    (-> this (.listCloudFrontOriginAccessIdentities request))))

(defn get-invalidation
  "Get the information about an invalidation.

  request - `com.amazonaws.services.cloudfront.model.GetInvalidationRequest`

  returns: Result of the GetInvalidation operation returned by the service. - `com.amazonaws.services.cloudfront.model.GetInvalidationResult`

  throws: com.amazonaws.services.cloudfront.model.NoSuchInvalidationException - The specified invalidation does not exist."
  (^com.amazonaws.services.cloudfront.model.GetInvalidationResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.GetInvalidationRequest request]
    (-> this (.getInvalidation request))))

(defn delete-field-level-encryption-profile
  "Remove a field-level encryption profile.

  request - `com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionProfileRequest`

  returns: Result of the DeleteFieldLevelEncryptionProfile operation returned by the service. - `com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionProfileResult`

  throws: com.amazonaws.services.cloudfront.model.AccessDeniedException - Access denied."
  (^com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionProfileResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionProfileRequest request]
    (-> this (.deleteFieldLevelEncryptionProfile request))))

(defn untag-resource
  "Remove tags from a CloudFront resource.

  request - `com.amazonaws.services.cloudfront.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.cloudfront.model.UntagResourceResult`

  throws: com.amazonaws.services.cloudfront.model.AccessDeniedException - Access denied."
  (^com.amazonaws.services.cloudfront.model.UntagResourceResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn list-invalidations
  "Lists invalidation batches.

  request - `com.amazonaws.services.cloudfront.model.ListInvalidationsRequest`

  returns: Result of the ListInvalidations operation returned by the service. - `com.amazonaws.services.cloudfront.model.ListInvalidationsResult`

  throws: com.amazonaws.services.cloudfront.model.InvalidArgumentException - The argument is invalid."
  (^com.amazonaws.services.cloudfront.model.ListInvalidationsResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.ListInvalidationsRequest request]
    (-> this (.listInvalidations request))))

(defn get-field-level-encryption
  "Get the field-level encryption configuration information.

  request - `com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionRequest`

  returns: Result of the GetFieldLevelEncryption operation returned by the service. - `com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionResult`

  throws: com.amazonaws.services.cloudfront.model.AccessDeniedException - Access denied."
  (^com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionRequest request]
    (-> this (.getFieldLevelEncryption request))))

(defn list-distributions
  "List CloudFront distributions.

  request - `com.amazonaws.services.cloudfront.model.ListDistributionsRequest`

  returns: Result of the ListDistributions operation returned by the service. - `com.amazonaws.services.cloudfront.model.ListDistributionsResult`

  throws: com.amazonaws.services.cloudfront.model.InvalidArgumentException - The argument is invalid."
  (^com.amazonaws.services.cloudfront.model.ListDistributionsResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.ListDistributionsRequest request]
    (-> this (.listDistributions request))))

(defn list-field-level-encryption-profiles
  "Request a list of field-level encryption profiles that have been created in CloudFront for this account.

  request - `com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionProfilesRequest`

  returns: Result of the ListFieldLevelEncryptionProfiles operation returned by the service. - `com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionProfilesResult`

  throws: com.amazonaws.services.cloudfront.model.InvalidArgumentException - The argument is invalid."
  (^com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionProfilesResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionProfilesRequest request]
    (-> this (.listFieldLevelEncryptionProfiles request))))

(defn update-cloud-front-origin-access-identity
  "Update an origin access identity.

  request - `com.amazonaws.services.cloudfront.model.UpdateCloudFrontOriginAccessIdentityRequest`

  returns: Result of the UpdateCloudFrontOriginAccessIdentity operation returned by the service. - `com.amazonaws.services.cloudfront.model.UpdateCloudFrontOriginAccessIdentityResult`

  throws: com.amazonaws.services.cloudfront.model.AccessDeniedException - Access denied."
  (^com.amazonaws.services.cloudfront.model.UpdateCloudFrontOriginAccessIdentityResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.UpdateCloudFrontOriginAccessIdentityRequest request]
    (-> this (.updateCloudFrontOriginAccessIdentity request))))

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

  request - `com.amazonaws.services.cloudfront.model.UpdateDistributionRequest`

  returns: Result of the UpdateDistribution operation returned by the service. - `com.amazonaws.services.cloudfront.model.UpdateDistributionResult`

  throws: com.amazonaws.services.cloudfront.model.InvalidHeadersForS3OriginException - The headers specified are not valid for an Amazon S3 origin."
  (^com.amazonaws.services.cloudfront.model.UpdateDistributionResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.UpdateDistributionRequest request]
    (-> this (.updateDistribution request))))

(defn delete-cloud-front-origin-access-identity
  "Delete an origin access identity.

  request - `com.amazonaws.services.cloudfront.model.DeleteCloudFrontOriginAccessIdentityRequest`

  returns: Result of the DeleteCloudFrontOriginAccessIdentity operation returned by the service. - `com.amazonaws.services.cloudfront.model.DeleteCloudFrontOriginAccessIdentityResult`

  throws: com.amazonaws.services.cloudfront.model.AccessDeniedException - Access denied."
  (^com.amazonaws.services.cloudfront.model.DeleteCloudFrontOriginAccessIdentityResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.DeleteCloudFrontOriginAccessIdentityRequest request]
    (-> this (.deleteCloudFrontOriginAccessIdentity request))))

(defn get-field-level-encryption-config
  "Get the field-level encryption configuration information.

  request - `com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionConfigRequest`

  returns: Result of the GetFieldLevelEncryptionConfig operation returned by the service. - `com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionConfigResult`

  throws: com.amazonaws.services.cloudfront.model.AccessDeniedException - Access denied."
  (^com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionConfigResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionConfigRequest request]
    (-> this (.getFieldLevelEncryptionConfig request))))

(defn delete-public-key
  "Remove a public key you previously added to CloudFront.

  request - `com.amazonaws.services.cloudfront.model.DeletePublicKeyRequest`

  returns: Result of the DeletePublicKey operation returned by the service. - `com.amazonaws.services.cloudfront.model.DeletePublicKeyResult`

  throws: com.amazonaws.services.cloudfront.model.AccessDeniedException - Access denied."
  (^com.amazonaws.services.cloudfront.model.DeletePublicKeyResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.DeletePublicKeyRequest request]
    (-> this (.deletePublicKey request))))

(defn update-field-level-encryption-config
  "Update a field-level encryption configuration.

  request - `com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionConfigRequest`

  returns: Result of the UpdateFieldLevelEncryptionConfig operation returned by the service. - `com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionConfigResult`

  throws: com.amazonaws.services.cloudfront.model.NoSuchFieldLevelEncryptionConfigException - The specified configuration for field-level encryption doesn't exist."
  (^com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionConfigResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionConfigRequest request]
    (-> this (.updateFieldLevelEncryptionConfig request))))

(defn create-distribution
  "Creates a new web distribution. You create a CloudFront distribution to tell CloudFront where you want content to
   be delivered from, and the details about how to track and manage content delivery. Send a POST
   request to the /CloudFront API version/distribution/distribution ID resource.



   When you update a distribution, there are more required fields than when you create a distribution. When you
   update your distribution by using UpdateDistribution, follow the steps included in the documentation to get the current configuration and then
   make your updates. This helps to make sure that you include all of the required fields. To view a summary, see Required Fields for Create Distribution and Update Distribution in the Amazon CloudFront Developer
   Guide.

  request - `com.amazonaws.services.cloudfront.model.CreateDistributionRequest`

  returns: Result of the CreateDistribution operation returned by the service. - `com.amazonaws.services.cloudfront.model.CreateDistributionResult`

  throws: com.amazonaws.services.cloudfront.model.InvalidHeadersForS3OriginException - The headers specified are not valid for an Amazon S3 origin."
  (^com.amazonaws.services.cloudfront.model.CreateDistributionResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.CreateDistributionRequest request]
    (-> this (.createDistribution request))))

(defn get-cloud-front-origin-access-identity-config
  "Get the configuration information about an origin access identity.

  request - `com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityConfigRequest`

  returns: Result of the GetCloudFrontOriginAccessIdentityConfig operation returned by the service. - `com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityConfigResult`

  throws: com.amazonaws.services.cloudfront.model.NoSuchCloudFrontOriginAccessIdentityException - The specified origin access identity does not exist."
  (^com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityConfigResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityConfigRequest request]
    (-> this (.getCloudFrontOriginAccessIdentityConfig request))))

(defn list-public-keys
  "List all public keys that have been added to CloudFront for this account.

  request - `com.amazonaws.services.cloudfront.model.ListPublicKeysRequest`

  returns: Result of the ListPublicKeys operation returned by the service. - `com.amazonaws.services.cloudfront.model.ListPublicKeysResult`

  throws: com.amazonaws.services.cloudfront.model.InvalidArgumentException - The argument is invalid."
  (^com.amazonaws.services.cloudfront.model.ListPublicKeysResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.ListPublicKeysRequest request]
    (-> this (.listPublicKeys request))))

(defn create-streaming-distribution-with-tags
  "Create a new streaming distribution with tags.

  request - `com.amazonaws.services.cloudfront.model.CreateStreamingDistributionWithTagsRequest`

  returns: Result of the CreateStreamingDistributionWithTags operation returned by the service. - `com.amazonaws.services.cloudfront.model.CreateStreamingDistributionWithTagsResult`

  throws: com.amazonaws.services.cloudfront.model.TooManyStreamingDistributionCNAMEsException - Your request contains more CNAMEs than are allowed per distribution."
  (^com.amazonaws.services.cloudfront.model.CreateStreamingDistributionWithTagsResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.CreateStreamingDistributionWithTagsRequest request]
    (-> this (.createStreamingDistributionWithTags request))))

(defn delete-field-level-encryption-config
  "Remove a field-level encryption configuration.

  request - `com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionConfigRequest`

  returns: Result of the DeleteFieldLevelEncryptionConfig operation returned by the service. - `com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionConfigResult`

  throws: com.amazonaws.services.cloudfront.model.AccessDeniedException - Access denied."
  (^com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionConfigResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionConfigRequest request]
    (-> this (.deleteFieldLevelEncryptionConfig request))))

(defn create-distribution-with-tags
  "Create a new distribution with tags.

  request - `com.amazonaws.services.cloudfront.model.CreateDistributionWithTagsRequest`

  returns: Result of the CreateDistributionWithTags operation returned by the service. - `com.amazonaws.services.cloudfront.model.CreateDistributionWithTagsResult`

  throws: com.amazonaws.services.cloudfront.model.InvalidHeadersForS3OriginException - The headers specified are not valid for an Amazon S3 origin."
  (^com.amazonaws.services.cloudfront.model.CreateDistributionWithTagsResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.CreateDistributionWithTagsRequest request]
    (-> this (.createDistributionWithTags request))))

(defn shutdown
  "Description copied from class: AmazonWebServiceClient"
  ([^AmazonCloudFrontClient this]
    (-> this (.shutdown))))

(defn list-streaming-distributions
  "List streaming distributions.

  request - `com.amazonaws.services.cloudfront.model.ListStreamingDistributionsRequest`

  returns: Result of the ListStreamingDistributions operation returned by the service. - `com.amazonaws.services.cloudfront.model.ListStreamingDistributionsResult`

  throws: com.amazonaws.services.cloudfront.model.InvalidArgumentException - The argument is invalid."
  (^com.amazonaws.services.cloudfront.model.ListStreamingDistributionsResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.ListStreamingDistributionsRequest request]
    (-> this (.listStreamingDistributions request))))

(defn get-public-key
  "Get the public key information.

  request - `com.amazonaws.services.cloudfront.model.GetPublicKeyRequest`

  returns: Result of the GetPublicKey operation returned by the service. - `com.amazonaws.services.cloudfront.model.GetPublicKeyResult`

  throws: com.amazonaws.services.cloudfront.model.AccessDeniedException - Access denied."
  (^com.amazonaws.services.cloudfront.model.GetPublicKeyResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.GetPublicKeyRequest request]
    (-> this (.getPublicKey request))))

(defn list-distributions-by-web-acl-id
  "List the distributions that are associated with a specified AWS WAF web ACL.

  request - `com.amazonaws.services.cloudfront.model.ListDistributionsByWebACLIdRequest`

  returns: Result of the ListDistributionsByWebACLId operation returned by the service. - `com.amazonaws.services.cloudfront.model.ListDistributionsByWebACLIdResult`

  throws: com.amazonaws.services.cloudfront.model.InvalidArgumentException - The argument is invalid."
  (^com.amazonaws.services.cloudfront.model.ListDistributionsByWebACLIdResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.ListDistributionsByWebACLIdRequest request]
    (-> this (.listDistributionsByWebACLId request))))

(defn get-public-key-config
  "Return public key configuration informaation

  request - `com.amazonaws.services.cloudfront.model.GetPublicKeyConfigRequest`

  returns: Result of the GetPublicKeyConfig operation returned by the service. - `com.amazonaws.services.cloudfront.model.GetPublicKeyConfigResult`

  throws: com.amazonaws.services.cloudfront.model.AccessDeniedException - Access denied."
  (^com.amazonaws.services.cloudfront.model.GetPublicKeyConfigResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.GetPublicKeyConfigRequest request]
    (-> this (.getPublicKeyConfig request))))

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

  request - `com.amazonaws.services.cloudfront.model.DeleteStreamingDistributionRequest`

  returns: Result of the DeleteStreamingDistribution operation returned by the service. - `com.amazonaws.services.cloudfront.model.DeleteStreamingDistributionResult`

  throws: com.amazonaws.services.cloudfront.model.AccessDeniedException - Access denied."
  (^com.amazonaws.services.cloudfront.model.DeleteStreamingDistributionResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.DeleteStreamingDistributionRequest request]
    (-> this (.deleteStreamingDistribution request))))

(defn update-public-key
  "Update public key information. Note that the only value you can change is the comment.

  request - `com.amazonaws.services.cloudfront.model.UpdatePublicKeyRequest`

  returns: Result of the UpdatePublicKey operation returned by the service. - `com.amazonaws.services.cloudfront.model.UpdatePublicKeyResult`

  throws: com.amazonaws.services.cloudfront.model.AccessDeniedException - Access denied."
  (^com.amazonaws.services.cloudfront.model.UpdatePublicKeyResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.UpdatePublicKeyRequest request]
    (-> this (.updatePublicKey request))))

(defn create-invalidation
  "Create a new invalidation.

  request - `com.amazonaws.services.cloudfront.model.CreateInvalidationRequest`

  returns: Result of the CreateInvalidation operation returned by the service. - `com.amazonaws.services.cloudfront.model.CreateInvalidationResult`

  throws: com.amazonaws.services.cloudfront.model.AccessDeniedException - Access denied."
  (^com.amazonaws.services.cloudfront.model.CreateInvalidationResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.CreateInvalidationRequest request]
    (-> this (.createInvalidation request))))

(defn update-streaming-distribution
  "Update a streaming distribution.

  request - `com.amazonaws.services.cloudfront.model.UpdateStreamingDistributionRequest`

  returns: Result of the UpdateStreamingDistribution operation returned by the service. - `com.amazonaws.services.cloudfront.model.UpdateStreamingDistributionResult`

  throws: com.amazonaws.services.cloudfront.model.TooManyStreamingDistributionCNAMEsException - Your request contains more CNAMEs than are allowed per distribution."
  (^com.amazonaws.services.cloudfront.model.UpdateStreamingDistributionResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.UpdateStreamingDistributionRequest request]
    (-> this (.updateStreamingDistribution request))))

(defn get-streaming-distribution-config
  "Get the configuration information about a streaming distribution.

  request - `com.amazonaws.services.cloudfront.model.GetStreamingDistributionConfigRequest`

  returns: Result of the GetStreamingDistributionConfig operation returned by the service. - `com.amazonaws.services.cloudfront.model.GetStreamingDistributionConfigResult`

  throws: com.amazonaws.services.cloudfront.model.NoSuchStreamingDistributionException - The specified streaming distribution does not exist."
  (^com.amazonaws.services.cloudfront.model.GetStreamingDistributionConfigResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.GetStreamingDistributionConfigRequest request]
    (-> this (.getStreamingDistributionConfig request))))

(defn get-streaming-distribution
  "Gets information about a specified RTMP distribution, including the distribution configuration.

  request - `com.amazonaws.services.cloudfront.model.GetStreamingDistributionRequest`

  returns: Result of the GetStreamingDistribution operation returned by the service. - `com.amazonaws.services.cloudfront.model.GetStreamingDistributionResult`

  throws: com.amazonaws.services.cloudfront.model.NoSuchStreamingDistributionException - The specified streaming distribution does not exist."
  (^com.amazonaws.services.cloudfront.model.GetStreamingDistributionResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.GetStreamingDistributionRequest request]
    (-> this (.getStreamingDistribution request))))

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

  request - `com.amazonaws.services.cloudfront.model.CreateStreamingDistributionRequest`

  returns: Result of the CreateStreamingDistribution operation returned by the service. - `com.amazonaws.services.cloudfront.model.CreateStreamingDistributionResult`

  throws: com.amazonaws.services.cloudfront.model.TooManyStreamingDistributionCNAMEsException - Your request contains more CNAMEs than are allowed per distribution."
  (^com.amazonaws.services.cloudfront.model.CreateStreamingDistributionResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.CreateStreamingDistributionRequest request]
    (-> this (.createStreamingDistribution request))))

(defn delete-distribution
  "Delete a distribution.

  request - `com.amazonaws.services.cloudfront.model.DeleteDistributionRequest`

  returns: Result of the DeleteDistribution operation returned by the service. - `com.amazonaws.services.cloudfront.model.DeleteDistributionResult`

  throws: com.amazonaws.services.cloudfront.model.AccessDeniedException - Access denied."
  (^com.amazonaws.services.cloudfront.model.DeleteDistributionResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.DeleteDistributionRequest request]
    (-> this (.deleteDistribution request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonCloudFrontClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-cloud-front-origin-access-identity
  "Get the information about an origin access identity.

  request - `com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityRequest`

  returns: Result of the GetCloudFrontOriginAccessIdentity operation returned by the service. - `com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityResult`

  throws: com.amazonaws.services.cloudfront.model.NoSuchCloudFrontOriginAccessIdentityException - The specified origin access identity does not exist."
  (^com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityRequest request]
    (-> this (.getCloudFrontOriginAccessIdentity request))))

(defn create-field-level-encryption-config
  "Create a new field-level encryption configuration.

  request - `com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionConfigRequest`

  returns: Result of the CreateFieldLevelEncryptionConfig operation returned by the service. - `com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionConfigResult`

  throws: com.amazonaws.services.cloudfront.model.InconsistentQuantitiesException - The value of Quantity and the size of Items don't match."
  (^com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionConfigResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionConfigRequest request]
    (-> this (.createFieldLevelEncryptionConfig request))))

(defn tag-resource
  "Add tags to a CloudFront resource.

  request - `com.amazonaws.services.cloudfront.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.cloudfront.model.TagResourceResult`

  throws: com.amazonaws.services.cloudfront.model.AccessDeniedException - Access denied."
  (^com.amazonaws.services.cloudfront.model.TagResourceResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn list-field-level-encryption-configs
  "List all field-level encryption configurations that have been created in CloudFront for this account.

  request - `com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionConfigsRequest`

  returns: Result of the ListFieldLevelEncryptionConfigs operation returned by the service. - `com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionConfigsResult`

  throws: com.amazonaws.services.cloudfront.model.InvalidArgumentException - The argument is invalid."
  (^com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionConfigsResult [^AmazonCloudFrontClient this ^com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionConfigsRequest request]
    (-> this (.listFieldLevelEncryptionConfigs request))))

