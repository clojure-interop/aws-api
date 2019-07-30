(ns com.amazonaws.services.cloudfront.AmazonCloudFrontAsyncClient
  "Client for accessing CloudFront asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Amazon CloudFront

  This is the Amazon CloudFront API Reference. This guide is for developers who need detailed information about
  CloudFront API actions, data types, and errors. For detailed information about CloudFront features, see the Amazon
  CloudFront Developer Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudfront AmazonCloudFrontAsyncClient]))

(defn ->amazon-cloud-front-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AmazonCloudFrontAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonCloudFrontAsyncClient aws-credentials client-configuration executor-service))
  (^AmazonCloudFrontAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonCloudFrontAsyncClient aws-credentials executor-service))
  (^AmazonCloudFrontAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonCloudFrontAsyncClient client-configuration))
  (^AmazonCloudFrontAsyncClient []
    (new AmazonCloudFrontAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.cloudfront.AmazonCloudFrontAsyncClientBuilder`"
  (^com.amazonaws.services.cloudfront.AmazonCloudFrontAsyncClientBuilder []
    (AmazonCloudFrontAsyncClient/asyncBuilder )))

(defn untag-resource-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - The request to remove tags from a CloudFront resource. - `com.amazonaws.services.cloudfront.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn create-streaming-distribution-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - The request to create a new streaming distribution. - `com.amazonaws.services.cloudfront.model.CreateStreamingDistributionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateStreamingDistribution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.CreateStreamingDistributionResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.CreateStreamingDistributionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createStreamingDistributionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.CreateStreamingDistributionRequest request]
    (-> this (.createStreamingDistributionAsync request))))

(defn list-field-level-encryption-configs-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - `com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionConfigsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListFieldLevelEncryptionConfigs operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionConfigsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionConfigsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listFieldLevelEncryptionConfigsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionConfigsRequest request]
    (-> this (.listFieldLevelEncryptionConfigsAsync request))))

(defn update-field-level-encryption-config-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - `com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionConfigRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateFieldLevelEncryptionConfig operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionConfigResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionConfigRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateFieldLevelEncryptionConfigAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionConfigRequest request]
    (-> this (.updateFieldLevelEncryptionConfigAsync request))))

(defn create-streaming-distribution-with-tags-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - The request to create a new streaming distribution with tags. - `com.amazonaws.services.cloudfront.model.CreateStreamingDistributionWithTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateStreamingDistributionWithTags operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.CreateStreamingDistributionWithTagsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.CreateStreamingDistributionWithTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createStreamingDistributionWithTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.CreateStreamingDistributionWithTagsRequest request]
    (-> this (.createStreamingDistributionWithTagsAsync request))))

(defn list-invalidations-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - The request to list invalidations. - `com.amazonaws.services.cloudfront.model.ListInvalidationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListInvalidations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.ListInvalidationsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.ListInvalidationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listInvalidationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.ListInvalidationsRequest request]
    (-> this (.listInvalidationsAsync request))))

(defn create-distribution-with-tags-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - The request to create a new distribution with tags. - `com.amazonaws.services.cloudfront.model.CreateDistributionWithTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDistributionWithTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.CreateDistributionWithTagsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.CreateDistributionWithTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDistributionWithTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.CreateDistributionWithTagsRequest request]
    (-> this (.createDistributionWithTagsAsync request))))

(defn list-streaming-distributions-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - The request to list your streaming distributions. - `com.amazonaws.services.cloudfront.model.ListStreamingDistributionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListStreamingDistributions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.ListStreamingDistributionsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.ListStreamingDistributionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listStreamingDistributionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.ListStreamingDistributionsRequest request]
    (-> this (.listStreamingDistributionsAsync request))))

(defn delete-field-level-encryption-profile-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - `com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFieldLevelEncryptionProfile operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionProfileResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFieldLevelEncryptionProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionProfileRequest request]
    (-> this (.deleteFieldLevelEncryptionProfileAsync request))))

(defn create-public-key-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - `com.amazonaws.services.cloudfront.model.CreatePublicKeyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePublicKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.CreatePublicKeyResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.CreatePublicKeyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPublicKeyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.CreatePublicKeyRequest request]
    (-> this (.createPublicKeyAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonCloudFrontAsyncClient this]
    (-> this (.getExecutorService))))

(defn update-public-key-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - `com.amazonaws.services.cloudfront.model.UpdatePublicKeyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdatePublicKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.UpdatePublicKeyResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.UpdatePublicKeyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updatePublicKeyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.UpdatePublicKeyRequest request]
    (-> this (.updatePublicKeyAsync request))))

(defn get-field-level-encryption-profile-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - `com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFieldLevelEncryptionProfile operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFieldLevelEncryptionProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileRequest request]
    (-> this (.getFieldLevelEncryptionProfileAsync request))))

(defn list-cloud-front-origin-access-identities-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - The request to list origin access identities. - `com.amazonaws.services.cloudfront.model.ListCloudFrontOriginAccessIdentitiesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListCloudFrontOriginAccessIdentities operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.ListCloudFrontOriginAccessIdentitiesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.ListCloudFrontOriginAccessIdentitiesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listCloudFrontOriginAccessIdentitiesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.ListCloudFrontOriginAccessIdentitiesRequest request]
    (-> this (.listCloudFrontOriginAccessIdentitiesAsync request))))

(defn list-distributions-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - The request to list your distributions. - `com.amazonaws.services.cloudfront.model.ListDistributionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDistributions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.ListDistributionsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.ListDistributionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDistributionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.ListDistributionsRequest request]
    (-> this (.listDistributionsAsync request))))

(defn get-cloud-front-origin-access-identity-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - The request to get an origin access identity's information. - `com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCloudFrontOriginAccessIdentity operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCloudFrontOriginAccessIdentityAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityRequest request]
    (-> this (.getCloudFrontOriginAccessIdentityAsync request))))

(defn get-field-level-encryption-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - `com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFieldLevelEncryption operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFieldLevelEncryptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionRequest request]
    (-> this (.getFieldLevelEncryptionAsync request))))

(defn list-distributions-by-web-acl-id-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - The request to list distributions that are associated with a specified AWS WAF web ACL. - `com.amazonaws.services.cloudfront.model.ListDistributionsByWebACLIdRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDistributionsByWebACLId operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.ListDistributionsByWebACLIdResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.ListDistributionsByWebACLIdRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDistributionsByWebACLIdAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.ListDistributionsByWebACLIdRequest request]
    (-> this (.listDistributionsByWebACLIdAsync request))))

(defn delete-cloud-front-origin-access-identity-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - Deletes a origin access identity. - `com.amazonaws.services.cloudfront.model.DeleteCloudFrontOriginAccessIdentityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCloudFrontOriginAccessIdentity operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.DeleteCloudFrontOriginAccessIdentityResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.DeleteCloudFrontOriginAccessIdentityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCloudFrontOriginAccessIdentityAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.DeleteCloudFrontOriginAccessIdentityRequest request]
    (-> this (.deleteCloudFrontOriginAccessIdentityAsync request))))

(defn get-invalidation-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - The request to get an invalidation's information. - `com.amazonaws.services.cloudfront.model.GetInvalidationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetInvalidation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.GetInvalidationResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.GetInvalidationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getInvalidationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.GetInvalidationRequest request]
    (-> this (.getInvalidationAsync request))))

(defn update-distribution-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - The request to update a distribution. - `com.amazonaws.services.cloudfront.model.UpdateDistributionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDistribution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.UpdateDistributionResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.UpdateDistributionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDistributionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.UpdateDistributionRequest request]
    (-> this (.updateDistributionAsync request))))

(defn update-streaming-distribution-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - The request to update a streaming distribution. - `com.amazonaws.services.cloudfront.model.UpdateStreamingDistributionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateStreamingDistribution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.UpdateStreamingDistributionResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.UpdateStreamingDistributionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateStreamingDistributionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.UpdateStreamingDistributionRequest request]
    (-> this (.updateStreamingDistributionAsync request))))

(defn delete-streaming-distribution-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - The request to delete a streaming distribution. - `com.amazonaws.services.cloudfront.model.DeleteStreamingDistributionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteStreamingDistribution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.DeleteStreamingDistributionResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.DeleteStreamingDistributionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteStreamingDistributionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.DeleteStreamingDistributionRequest request]
    (-> this (.deleteStreamingDistributionAsync request))))

(defn get-cloud-front-origin-access-identity-config-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - The origin access identity's configuration information. For more information, see CloudFrontOriginAccessIdentityConfig. - `com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCloudFrontOriginAccessIdentityConfig operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityConfigResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityConfigRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCloudFrontOriginAccessIdentityConfigAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityConfigRequest request]
    (-> this (.getCloudFrontOriginAccessIdentityConfigAsync request))))

(defn delete-distribution-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - This action deletes a web distribution. To delete a web distribution using the CloudFront API, perform the following steps. To delete a web distribution using the CloudFront API: Disable the web distribution Submit a GET Distribution Config request to get the current configuration and the Etag header for the distribution. Update the XML document that was returned in the response to your GET Distribution Config request to change the value of Enabled to false. Submit a PUT Distribution Config request to update the configuration for your distribution. In the request body, include the XML document that you updated in Step 3. Set the value of the HTTP If-Match header to the value of the ETag header that CloudFront returned when you submitted the GET Distribution Config request in Step 2. Review the response to the PUT Distribution Config request to confirm that the distribution was successfully disabled. Submit a GET Distribution request to confirm that your changes have propagated. When propagation is complete, the value of Status is Deployed. Submit a DELETE Distribution request. Set the value of the HTTP If-Match header to the value of the ETag header that CloudFront returned when you submitted the GET Distribution Config request in Step 6. Review the response to your DELETE Distribution request to confirm that the distribution was successfully deleted. For information about deleting a distribution using the CloudFront console, see Deleting a Distribution in the Amazon CloudFront Developer Guide. - `com.amazonaws.services.cloudfront.model.DeleteDistributionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDistribution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.DeleteDistributionResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.DeleteDistributionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDistributionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.DeleteDistributionRequest request]
    (-> this (.deleteDistributionAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonCloudFrontAsyncClient this]
    (-> this (.shutdown))))

(defn create-field-level-encryption-profile-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - `com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateFieldLevelEncryptionProfile operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionProfileResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createFieldLevelEncryptionProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionProfileRequest request]
    (-> this (.createFieldLevelEncryptionProfileAsync request))))

(defn delete-public-key-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - `com.amazonaws.services.cloudfront.model.DeletePublicKeyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePublicKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.DeletePublicKeyResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.DeletePublicKeyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePublicKeyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.DeletePublicKeyRequest request]
    (-> this (.deletePublicKeyAsync request))))

(defn get-distribution-config-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - The request to get a distribution configuration. - `com.amazonaws.services.cloudfront.model.GetDistributionConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDistributionConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.GetDistributionConfigResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.GetDistributionConfigRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDistributionConfigAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.GetDistributionConfigRequest request]
    (-> this (.getDistributionConfigAsync request))))

(defn create-field-level-encryption-config-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - `com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionConfigRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateFieldLevelEncryptionConfig operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionConfigResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionConfigRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createFieldLevelEncryptionConfigAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionConfigRequest request]
    (-> this (.createFieldLevelEncryptionConfigAsync request))))

(defn create-cloud-front-origin-access-identity-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - The request to create a new origin access identity (OAI). An origin access identity is a special CloudFront user that you can associate with Amazon S3 origins, so that you can secure all or just some of your Amazon S3 content. For more information, see Restricting Access to Amazon S3 Content by Using an Origin Access Identity in the Amazon CloudFront Developer Guide. - `com.amazonaws.services.cloudfront.model.CreateCloudFrontOriginAccessIdentityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCloudFrontOriginAccessIdentity operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.CreateCloudFrontOriginAccessIdentityResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.CreateCloudFrontOriginAccessIdentityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCloudFrontOriginAccessIdentityAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.CreateCloudFrontOriginAccessIdentityRequest request]
    (-> this (.createCloudFrontOriginAccessIdentityAsync request))))

(defn create-invalidation-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - The request to create an invalidation. - `com.amazonaws.services.cloudfront.model.CreateInvalidationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateInvalidation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.CreateInvalidationResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.CreateInvalidationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createInvalidationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.CreateInvalidationRequest request]
    (-> this (.createInvalidationAsync request))))

(defn update-cloud-front-origin-access-identity-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - The request to update an origin access identity. - `com.amazonaws.services.cloudfront.model.UpdateCloudFrontOriginAccessIdentityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateCloudFrontOriginAccessIdentity operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.UpdateCloudFrontOriginAccessIdentityResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.UpdateCloudFrontOriginAccessIdentityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateCloudFrontOriginAccessIdentityAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.UpdateCloudFrontOriginAccessIdentityRequest request]
    (-> this (.updateCloudFrontOriginAccessIdentityAsync request))))

(defn list-field-level-encryption-profiles-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - `com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionProfilesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListFieldLevelEncryptionProfiles operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionProfilesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionProfilesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listFieldLevelEncryptionProfilesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionProfilesRequest request]
    (-> this (.listFieldLevelEncryptionProfilesAsync request))))

(defn list-public-keys-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - `com.amazonaws.services.cloudfront.model.ListPublicKeysRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPublicKeys operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.ListPublicKeysResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.ListPublicKeysRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPublicKeysAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.ListPublicKeysRequest request]
    (-> this (.listPublicKeysAsync request))))

(defn update-field-level-encryption-profile-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - `com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateFieldLevelEncryptionProfile operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionProfileResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateFieldLevelEncryptionProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionProfileRequest request]
    (-> this (.updateFieldLevelEncryptionProfileAsync request))))

(defn get-public-key-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - `com.amazonaws.services.cloudfront.model.GetPublicKeyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPublicKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.GetPublicKeyResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.GetPublicKeyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPublicKeyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.GetPublicKeyRequest request]
    (-> this (.getPublicKeyAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - The request to list tags for a CloudFront resource. - `com.amazonaws.services.cloudfront.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn get-field-level-encryption-profile-config-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - `com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileConfigRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFieldLevelEncryptionProfileConfig operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileConfigResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileConfigRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFieldLevelEncryptionProfileConfigAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileConfigRequest request]
    (-> this (.getFieldLevelEncryptionProfileConfigAsync request))))

(defn get-distribution-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - The request to get a distribution's information. - `com.amazonaws.services.cloudfront.model.GetDistributionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDistribution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.GetDistributionResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.GetDistributionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDistributionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.GetDistributionRequest request]
    (-> this (.getDistributionAsync request))))

(defn get-streaming-distribution-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - The request to get a streaming distribution's information. - `com.amazonaws.services.cloudfront.model.GetStreamingDistributionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetStreamingDistribution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.GetStreamingDistributionResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.GetStreamingDistributionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getStreamingDistributionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.GetStreamingDistributionRequest request]
    (-> this (.getStreamingDistributionAsync request))))

(defn get-public-key-config-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - `com.amazonaws.services.cloudfront.model.GetPublicKeyConfigRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPublicKeyConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.GetPublicKeyConfigResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.GetPublicKeyConfigRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPublicKeyConfigAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.GetPublicKeyConfigRequest request]
    (-> this (.getPublicKeyConfigAsync request))))

(defn get-streaming-distribution-config-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - To request to get a streaming distribution configuration. - `com.amazonaws.services.cloudfront.model.GetStreamingDistributionConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetStreamingDistributionConfig operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.GetStreamingDistributionConfigResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.GetStreamingDistributionConfigRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getStreamingDistributionConfigAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.GetStreamingDistributionConfigRequest request]
    (-> this (.getStreamingDistributionConfigAsync request))))

(defn delete-field-level-encryption-config-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - `com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionConfigRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFieldLevelEncryptionConfig operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionConfigResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionConfigRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFieldLevelEncryptionConfigAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionConfigRequest request]
    (-> this (.deleteFieldLevelEncryptionConfigAsync request))))

(defn tag-resource-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - The request to add tags to a CloudFront resource. - `com.amazonaws.services.cloudfront.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn create-distribution-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - The request to create a new distribution. - `com.amazonaws.services.cloudfront.model.CreateDistributionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDistribution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.CreateDistributionResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.CreateDistributionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDistributionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.CreateDistributionRequest request]
    (-> this (.createDistributionAsync request))))

(defn get-field-level-encryption-config-async
  "Description copied from interface: AmazonCloudFrontAsync

  request - `com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionConfigRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFieldLevelEncryptionConfig operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionConfigResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionConfigRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFieldLevelEncryptionConfigAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFrontAsyncClient this ^com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionConfigRequest request]
    (-> this (.getFieldLevelEncryptionConfigAsync request))))

