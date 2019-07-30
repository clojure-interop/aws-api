(ns com.amazonaws.services.cloudfront.AmazonCloudFrontAsync
  "Interface for accessing CloudFront asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonCloudFrontAsync instead.


  Amazon CloudFront

  This is the Amazon CloudFront API Reference. This guide is for developers who need detailed information about
  CloudFront API actions, data types, and errors. For detailed information about CloudFront features, see the Amazon
  CloudFront Developer Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudfront AmazonCloudFrontAsync]))

(defn untag-resource-async
  "Remove tags from a CloudFront resource.

  untag-resource-request - The request to remove tags from a CloudFront resource. - `com.amazonaws.services.cloudfront.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn create-streaming-distribution-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateStreamingDistribution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.CreateStreamingDistributionResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.CreateStreamingDistributionRequest create-streaming-distribution-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createStreamingDistributionAsync create-streaming-distribution-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.CreateStreamingDistributionRequest create-streaming-distribution-request]
    (-> this (.createStreamingDistributionAsync create-streaming-distribution-request))))

(defn list-field-level-encryption-configs-async
  "List all field-level encryption configurations that have been created in CloudFront for this account.

  list-field-level-encryption-configs-request - `com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionConfigsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListFieldLevelEncryptionConfigs operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionConfigsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionConfigsRequest list-field-level-encryption-configs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listFieldLevelEncryptionConfigsAsync list-field-level-encryption-configs-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionConfigsRequest list-field-level-encryption-configs-request]
    (-> this (.listFieldLevelEncryptionConfigsAsync list-field-level-encryption-configs-request))))

(defn update-field-level-encryption-config-async
  "Update a field-level encryption configuration.

  update-field-level-encryption-config-request - `com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateFieldLevelEncryptionConfig operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionConfigResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionConfigRequest update-field-level-encryption-config-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateFieldLevelEncryptionConfigAsync update-field-level-encryption-config-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionConfigRequest update-field-level-encryption-config-request]
    (-> this (.updateFieldLevelEncryptionConfigAsync update-field-level-encryption-config-request))))

(defn create-streaming-distribution-with-tags-async
  "Create a new streaming distribution with tags.

  create-streaming-distribution-with-tags-request - The request to create a new streaming distribution with tags. - `com.amazonaws.services.cloudfront.model.CreateStreamingDistributionWithTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateStreamingDistributionWithTags operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.CreateStreamingDistributionWithTagsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.CreateStreamingDistributionWithTagsRequest create-streaming-distribution-with-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createStreamingDistributionWithTagsAsync create-streaming-distribution-with-tags-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.CreateStreamingDistributionWithTagsRequest create-streaming-distribution-with-tags-request]
    (-> this (.createStreamingDistributionWithTagsAsync create-streaming-distribution-with-tags-request))))

(defn list-invalidations-async
  "Lists invalidation batches.

  list-invalidations-request - The request to list invalidations. - `com.amazonaws.services.cloudfront.model.ListInvalidationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListInvalidations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.ListInvalidationsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.ListInvalidationsRequest list-invalidations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listInvalidationsAsync list-invalidations-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.ListInvalidationsRequest list-invalidations-request]
    (-> this (.listInvalidationsAsync list-invalidations-request))))

(defn create-distribution-with-tags-async
  "Create a new distribution with tags.

  create-distribution-with-tags-request - The request to create a new distribution with tags. - `com.amazonaws.services.cloudfront.model.CreateDistributionWithTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDistributionWithTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.CreateDistributionWithTagsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.CreateDistributionWithTagsRequest create-distribution-with-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDistributionWithTagsAsync create-distribution-with-tags-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.CreateDistributionWithTagsRequest create-distribution-with-tags-request]
    (-> this (.createDistributionWithTagsAsync create-distribution-with-tags-request))))

(defn list-streaming-distributions-async
  "List streaming distributions.

  list-streaming-distributions-request - The request to list your streaming distributions. - `com.amazonaws.services.cloudfront.model.ListStreamingDistributionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListStreamingDistributions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.ListStreamingDistributionsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.ListStreamingDistributionsRequest list-streaming-distributions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listStreamingDistributionsAsync list-streaming-distributions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.ListStreamingDistributionsRequest list-streaming-distributions-request]
    (-> this (.listStreamingDistributionsAsync list-streaming-distributions-request))))

(defn delete-field-level-encryption-profile-async
  "Remove a field-level encryption profile.

  delete-field-level-encryption-profile-request - `com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFieldLevelEncryptionProfile operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionProfileResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionProfileRequest delete-field-level-encryption-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFieldLevelEncryptionProfileAsync delete-field-level-encryption-profile-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionProfileRequest delete-field-level-encryption-profile-request]
    (-> this (.deleteFieldLevelEncryptionProfileAsync delete-field-level-encryption-profile-request))))

(defn create-public-key-async
  "Add a new public key to CloudFront to use, for example, for field-level encryption. You can add a maximum of 10
   public keys with one AWS account.

  create-public-key-request - `com.amazonaws.services.cloudfront.model.CreatePublicKeyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePublicKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.CreatePublicKeyResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.CreatePublicKeyRequest create-public-key-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPublicKeyAsync create-public-key-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.CreatePublicKeyRequest create-public-key-request]
    (-> this (.createPublicKeyAsync create-public-key-request))))

(defn update-public-key-async
  "Update public key information. Note that the only value you can change is the comment.

  update-public-key-request - `com.amazonaws.services.cloudfront.model.UpdatePublicKeyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdatePublicKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.UpdatePublicKeyResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.UpdatePublicKeyRequest update-public-key-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updatePublicKeyAsync update-public-key-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.UpdatePublicKeyRequest update-public-key-request]
    (-> this (.updatePublicKeyAsync update-public-key-request))))

(defn get-field-level-encryption-profile-async
  "Get the field-level encryption profile information.

  get-field-level-encryption-profile-request - `com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFieldLevelEncryptionProfile operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileRequest get-field-level-encryption-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFieldLevelEncryptionProfileAsync get-field-level-encryption-profile-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileRequest get-field-level-encryption-profile-request]
    (-> this (.getFieldLevelEncryptionProfileAsync get-field-level-encryption-profile-request))))

(defn list-cloud-front-origin-access-identities-async
  "Lists origin access identities.

  list-cloud-front-origin-access-identities-request - The request to list origin access identities. - `com.amazonaws.services.cloudfront.model.ListCloudFrontOriginAccessIdentitiesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListCloudFrontOriginAccessIdentities operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.ListCloudFrontOriginAccessIdentitiesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.ListCloudFrontOriginAccessIdentitiesRequest list-cloud-front-origin-access-identities-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listCloudFrontOriginAccessIdentitiesAsync list-cloud-front-origin-access-identities-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.ListCloudFrontOriginAccessIdentitiesRequest list-cloud-front-origin-access-identities-request]
    (-> this (.listCloudFrontOriginAccessIdentitiesAsync list-cloud-front-origin-access-identities-request))))

(defn list-distributions-async
  "List CloudFront distributions.

  list-distributions-request - The request to list your distributions. - `com.amazonaws.services.cloudfront.model.ListDistributionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDistributions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.ListDistributionsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.ListDistributionsRequest list-distributions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDistributionsAsync list-distributions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.ListDistributionsRequest list-distributions-request]
    (-> this (.listDistributionsAsync list-distributions-request))))

(defn get-cloud-front-origin-access-identity-async
  "Get the information about an origin access identity.

  get-cloud-front-origin-access-identity-request - The request to get an origin access identity's information. - `com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCloudFrontOriginAccessIdentity operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityRequest get-cloud-front-origin-access-identity-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCloudFrontOriginAccessIdentityAsync get-cloud-front-origin-access-identity-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityRequest get-cloud-front-origin-access-identity-request]
    (-> this (.getCloudFrontOriginAccessIdentityAsync get-cloud-front-origin-access-identity-request))))

(defn get-field-level-encryption-async
  "Get the field-level encryption configuration information.

  get-field-level-encryption-request - `com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFieldLevelEncryption operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionRequest get-field-level-encryption-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFieldLevelEncryptionAsync get-field-level-encryption-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionRequest get-field-level-encryption-request]
    (-> this (.getFieldLevelEncryptionAsync get-field-level-encryption-request))))

(defn list-distributions-by-web-acl-id-async
  "List the distributions that are associated with a specified AWS WAF web ACL.

  list-distributions-by-web-acl-id-request - The request to list distributions that are associated with a specified AWS WAF web ACL. - `com.amazonaws.services.cloudfront.model.ListDistributionsByWebACLIdRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDistributionsByWebACLId operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.ListDistributionsByWebACLIdResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.ListDistributionsByWebACLIdRequest list-distributions-by-web-acl-id-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDistributionsByWebACLIdAsync list-distributions-by-web-acl-id-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.ListDistributionsByWebACLIdRequest list-distributions-by-web-acl-id-request]
    (-> this (.listDistributionsByWebACLIdAsync list-distributions-by-web-acl-id-request))))

(defn delete-cloud-front-origin-access-identity-async
  "Delete an origin access identity.

  delete-cloud-front-origin-access-identity-request - Deletes a origin access identity. - `com.amazonaws.services.cloudfront.model.DeleteCloudFrontOriginAccessIdentityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCloudFrontOriginAccessIdentity operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.DeleteCloudFrontOriginAccessIdentityResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.DeleteCloudFrontOriginAccessIdentityRequest delete-cloud-front-origin-access-identity-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCloudFrontOriginAccessIdentityAsync delete-cloud-front-origin-access-identity-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.DeleteCloudFrontOriginAccessIdentityRequest delete-cloud-front-origin-access-identity-request]
    (-> this (.deleteCloudFrontOriginAccessIdentityAsync delete-cloud-front-origin-access-identity-request))))

(defn get-invalidation-async
  "Get the information about an invalidation.

  get-invalidation-request - The request to get an invalidation's information. - `com.amazonaws.services.cloudfront.model.GetInvalidationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetInvalidation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.GetInvalidationResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.GetInvalidationRequest get-invalidation-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getInvalidationAsync get-invalidation-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.GetInvalidationRequest get-invalidation-request]
    (-> this (.getInvalidationAsync get-invalidation-request))))

(defn update-distribution-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDistribution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.UpdateDistributionResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.UpdateDistributionRequest update-distribution-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDistributionAsync update-distribution-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.UpdateDistributionRequest update-distribution-request]
    (-> this (.updateDistributionAsync update-distribution-request))))

(defn update-streaming-distribution-async
  "Update a streaming distribution.

  update-streaming-distribution-request - The request to update a streaming distribution. - `com.amazonaws.services.cloudfront.model.UpdateStreamingDistributionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateStreamingDistribution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.UpdateStreamingDistributionResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.UpdateStreamingDistributionRequest update-streaming-distribution-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateStreamingDistributionAsync update-streaming-distribution-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.UpdateStreamingDistributionRequest update-streaming-distribution-request]
    (-> this (.updateStreamingDistributionAsync update-streaming-distribution-request))))

(defn delete-streaming-distribution-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteStreamingDistribution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.DeleteStreamingDistributionResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.DeleteStreamingDistributionRequest delete-streaming-distribution-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteStreamingDistributionAsync delete-streaming-distribution-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.DeleteStreamingDistributionRequest delete-streaming-distribution-request]
    (-> this (.deleteStreamingDistributionAsync delete-streaming-distribution-request))))

(defn get-cloud-front-origin-access-identity-config-async
  "Get the configuration information about an origin access identity.

  get-cloud-front-origin-access-identity-config-request - The origin access identity's configuration information. For more information, see CloudFrontOriginAccessIdentityConfig. - `com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCloudFrontOriginAccessIdentityConfig operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityConfigResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityConfigRequest get-cloud-front-origin-access-identity-config-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCloudFrontOriginAccessIdentityConfigAsync get-cloud-front-origin-access-identity-config-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityConfigRequest get-cloud-front-origin-access-identity-config-request]
    (-> this (.getCloudFrontOriginAccessIdentityConfigAsync get-cloud-front-origin-access-identity-config-request))))

(defn delete-distribution-async
  "Delete a distribution.

  delete-distribution-request - This action deletes a web distribution. To delete a web distribution using the CloudFront API, perform the following steps. To delete a web distribution using the CloudFront API: Disable the web distribution Submit a GET Distribution Config request to get the current configuration and the Etag header for the distribution. Update the XML document that was returned in the response to your GET Distribution Config request to change the value of Enabled to false. Submit a PUT Distribution Config request to update the configuration for your distribution. In the request body, include the XML document that you updated in Step 3. Set the value of the HTTP If-Match header to the value of the ETag header that CloudFront returned when you submitted the GET Distribution Config request in Step 2. Review the response to the PUT Distribution Config request to confirm that the distribution was successfully disabled. Submit a GET Distribution request to confirm that your changes have propagated. When propagation is complete, the value of Status is Deployed. Submit a DELETE Distribution request. Set the value of the HTTP If-Match header to the value of the ETag header that CloudFront returned when you submitted the GET Distribution Config request in Step 6. Review the response to your DELETE Distribution request to confirm that the distribution was successfully deleted. For information about deleting a distribution using the CloudFront console, see Deleting a Distribution in the Amazon CloudFront Developer Guide. - `com.amazonaws.services.cloudfront.model.DeleteDistributionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDistribution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.DeleteDistributionResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.DeleteDistributionRequest delete-distribution-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDistributionAsync delete-distribution-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.DeleteDistributionRequest delete-distribution-request]
    (-> this (.deleteDistributionAsync delete-distribution-request))))

(defn create-field-level-encryption-profile-async
  "Create a field-level encryption profile.

  create-field-level-encryption-profile-request - `com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateFieldLevelEncryptionProfile operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionProfileResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionProfileRequest create-field-level-encryption-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createFieldLevelEncryptionProfileAsync create-field-level-encryption-profile-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionProfileRequest create-field-level-encryption-profile-request]
    (-> this (.createFieldLevelEncryptionProfileAsync create-field-level-encryption-profile-request))))

(defn delete-public-key-async
  "Remove a public key you previously added to CloudFront.

  delete-public-key-request - `com.amazonaws.services.cloudfront.model.DeletePublicKeyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePublicKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.DeletePublicKeyResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.DeletePublicKeyRequest delete-public-key-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePublicKeyAsync delete-public-key-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.DeletePublicKeyRequest delete-public-key-request]
    (-> this (.deletePublicKeyAsync delete-public-key-request))))

(defn get-distribution-config-async
  "Get the configuration information about a distribution.

  get-distribution-config-request - The request to get a distribution configuration. - `com.amazonaws.services.cloudfront.model.GetDistributionConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDistributionConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.GetDistributionConfigResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.GetDistributionConfigRequest get-distribution-config-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDistributionConfigAsync get-distribution-config-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.GetDistributionConfigRequest get-distribution-config-request]
    (-> this (.getDistributionConfigAsync get-distribution-config-request))))

(defn create-field-level-encryption-config-async
  "Create a new field-level encryption configuration.

  create-field-level-encryption-config-request - `com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateFieldLevelEncryptionConfig operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionConfigResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionConfigRequest create-field-level-encryption-config-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createFieldLevelEncryptionConfigAsync create-field-level-encryption-config-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionConfigRequest create-field-level-encryption-config-request]
    (-> this (.createFieldLevelEncryptionConfigAsync create-field-level-encryption-config-request))))

(defn create-cloud-front-origin-access-identity-async
  "Creates a new origin access identity. If you're using Amazon S3 for your origin, you can use an origin access
   identity to require users to access your content using a CloudFront URL instead of the Amazon S3 URL. For more
   information about how to use origin access identities, see Serving Private
   Content through CloudFront in the Amazon CloudFront Developer Guide.

  create-cloud-front-origin-access-identity-request - The request to create a new origin access identity (OAI). An origin access identity is a special CloudFront user that you can associate with Amazon S3 origins, so that you can secure all or just some of your Amazon S3 content. For more information, see Restricting Access to Amazon S3 Content by Using an Origin Access Identity in the Amazon CloudFront Developer Guide. - `com.amazonaws.services.cloudfront.model.CreateCloudFrontOriginAccessIdentityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCloudFrontOriginAccessIdentity operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.CreateCloudFrontOriginAccessIdentityResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.CreateCloudFrontOriginAccessIdentityRequest create-cloud-front-origin-access-identity-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCloudFrontOriginAccessIdentityAsync create-cloud-front-origin-access-identity-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.CreateCloudFrontOriginAccessIdentityRequest create-cloud-front-origin-access-identity-request]
    (-> this (.createCloudFrontOriginAccessIdentityAsync create-cloud-front-origin-access-identity-request))))

(defn create-invalidation-async
  "Create a new invalidation.

  create-invalidation-request - The request to create an invalidation. - `com.amazonaws.services.cloudfront.model.CreateInvalidationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateInvalidation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.CreateInvalidationResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.CreateInvalidationRequest create-invalidation-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createInvalidationAsync create-invalidation-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.CreateInvalidationRequest create-invalidation-request]
    (-> this (.createInvalidationAsync create-invalidation-request))))

(defn update-cloud-front-origin-access-identity-async
  "Update an origin access identity.

  update-cloud-front-origin-access-identity-request - The request to update an origin access identity. - `com.amazonaws.services.cloudfront.model.UpdateCloudFrontOriginAccessIdentityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateCloudFrontOriginAccessIdentity operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.UpdateCloudFrontOriginAccessIdentityResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.UpdateCloudFrontOriginAccessIdentityRequest update-cloud-front-origin-access-identity-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateCloudFrontOriginAccessIdentityAsync update-cloud-front-origin-access-identity-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.UpdateCloudFrontOriginAccessIdentityRequest update-cloud-front-origin-access-identity-request]
    (-> this (.updateCloudFrontOriginAccessIdentityAsync update-cloud-front-origin-access-identity-request))))

(defn list-field-level-encryption-profiles-async
  "Request a list of field-level encryption profiles that have been created in CloudFront for this account.

  list-field-level-encryption-profiles-request - `com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionProfilesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListFieldLevelEncryptionProfiles operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionProfilesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionProfilesRequest list-field-level-encryption-profiles-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listFieldLevelEncryptionProfilesAsync list-field-level-encryption-profiles-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionProfilesRequest list-field-level-encryption-profiles-request]
    (-> this (.listFieldLevelEncryptionProfilesAsync list-field-level-encryption-profiles-request))))

(defn list-public-keys-async
  "List all public keys that have been added to CloudFront for this account.

  list-public-keys-request - `com.amazonaws.services.cloudfront.model.ListPublicKeysRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPublicKeys operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.ListPublicKeysResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.ListPublicKeysRequest list-public-keys-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPublicKeysAsync list-public-keys-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.ListPublicKeysRequest list-public-keys-request]
    (-> this (.listPublicKeysAsync list-public-keys-request))))

(defn update-field-level-encryption-profile-async
  "Update a field-level encryption profile.

  update-field-level-encryption-profile-request - `com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateFieldLevelEncryptionProfile operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionProfileResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionProfileRequest update-field-level-encryption-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateFieldLevelEncryptionProfileAsync update-field-level-encryption-profile-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionProfileRequest update-field-level-encryption-profile-request]
    (-> this (.updateFieldLevelEncryptionProfileAsync update-field-level-encryption-profile-request))))

(defn get-public-key-async
  "Get the public key information.

  get-public-key-request - `com.amazonaws.services.cloudfront.model.GetPublicKeyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPublicKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.GetPublicKeyResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.GetPublicKeyRequest get-public-key-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPublicKeyAsync get-public-key-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.GetPublicKeyRequest get-public-key-request]
    (-> this (.getPublicKeyAsync get-public-key-request))))

(defn list-tags-for-resource-async
  "List tags for a CloudFront resource.

  list-tags-for-resource-request - The request to list tags for a CloudFront resource. - `com.amazonaws.services.cloudfront.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn get-field-level-encryption-profile-config-async
  "Get the field-level encryption profile configuration information.

  get-field-level-encryption-profile-config-request - `com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFieldLevelEncryptionProfileConfig operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileConfigResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileConfigRequest get-field-level-encryption-profile-config-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFieldLevelEncryptionProfileConfigAsync get-field-level-encryption-profile-config-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileConfigRequest get-field-level-encryption-profile-config-request]
    (-> this (.getFieldLevelEncryptionProfileConfigAsync get-field-level-encryption-profile-config-request))))

(defn get-distribution-async
  "Get the information about a distribution.

  get-distribution-request - The request to get a distribution's information. - `com.amazonaws.services.cloudfront.model.GetDistributionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDistribution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.GetDistributionResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.GetDistributionRequest get-distribution-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDistributionAsync get-distribution-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.GetDistributionRequest get-distribution-request]
    (-> this (.getDistributionAsync get-distribution-request))))

(defn get-streaming-distribution-async
  "Gets information about a specified RTMP distribution, including the distribution configuration.

  get-streaming-distribution-request - The request to get a streaming distribution's information. - `com.amazonaws.services.cloudfront.model.GetStreamingDistributionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetStreamingDistribution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.GetStreamingDistributionResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.GetStreamingDistributionRequest get-streaming-distribution-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getStreamingDistributionAsync get-streaming-distribution-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.GetStreamingDistributionRequest get-streaming-distribution-request]
    (-> this (.getStreamingDistributionAsync get-streaming-distribution-request))))

(defn get-public-key-config-async
  "Return public key configuration informaation

  get-public-key-config-request - `com.amazonaws.services.cloudfront.model.GetPublicKeyConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPublicKeyConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.GetPublicKeyConfigResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.GetPublicKeyConfigRequest get-public-key-config-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPublicKeyConfigAsync get-public-key-config-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.GetPublicKeyConfigRequest get-public-key-config-request]
    (-> this (.getPublicKeyConfigAsync get-public-key-config-request))))

(defn get-streaming-distribution-config-async
  "Get the configuration information about a streaming distribution.

  get-streaming-distribution-config-request - To request to get a streaming distribution configuration. - `com.amazonaws.services.cloudfront.model.GetStreamingDistributionConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetStreamingDistributionConfig operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.GetStreamingDistributionConfigResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.GetStreamingDistributionConfigRequest get-streaming-distribution-config-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getStreamingDistributionConfigAsync get-streaming-distribution-config-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.GetStreamingDistributionConfigRequest get-streaming-distribution-config-request]
    (-> this (.getStreamingDistributionConfigAsync get-streaming-distribution-config-request))))

(defn delete-field-level-encryption-config-async
  "Remove a field-level encryption configuration.

  delete-field-level-encryption-config-request - `com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFieldLevelEncryptionConfig operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionConfigResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionConfigRequest delete-field-level-encryption-config-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFieldLevelEncryptionConfigAsync delete-field-level-encryption-config-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionConfigRequest delete-field-level-encryption-config-request]
    (-> this (.deleteFieldLevelEncryptionConfigAsync delete-field-level-encryption-config-request))))

(defn tag-resource-async
  "Add tags to a CloudFront resource.

  tag-resource-request - The request to add tags to a CloudFront resource. - `com.amazonaws.services.cloudfront.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn create-distribution-async
  "Creates a new web distribution. You create a CloudFront distribution to tell CloudFront where you want content to
   be delivered from, and the details about how to track and manage content delivery. Send a POST
   request to the /CloudFront API version/distribution/distribution ID resource.



   When you update a distribution, there are more required fields than when you create a distribution. When you
   update your distribution by using UpdateDistribution, follow the steps included in the documentation to get the current configuration and then
   make your updates. This helps to make sure that you include all of the required fields. To view a summary, see Required Fields for Create Distribution and Update Distribution in the Amazon CloudFront Developer
   Guide.

  create-distribution-request - The request to create a new distribution. - `com.amazonaws.services.cloudfront.model.CreateDistributionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDistribution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.CreateDistributionResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.CreateDistributionRequest create-distribution-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDistributionAsync create-distribution-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.CreateDistributionRequest create-distribution-request]
    (-> this (.createDistributionAsync create-distribution-request))))

(defn get-field-level-encryption-config-async
  "Get the field-level encryption configuration information.

  get-field-level-encryption-config-request - `com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFieldLevelEncryptionConfig operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionConfigResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionConfigRequest get-field-level-encryption-config-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFieldLevelEncryptionConfigAsync get-field-level-encryption-config-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsync this ^com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionConfigRequest get-field-level-encryption-config-request]
    (-> this (.getFieldLevelEncryptionConfigAsync get-field-level-encryption-config-request))))

