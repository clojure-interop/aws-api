(ns com.amazonaws.services.cognitosync.AmazonCognitoSyncClient
  "Client for accessing Amazon Cognito Sync. All service calls made using this client are blocking, and will not return
  until the service call completes.

  Amazon Cognito Sync

  Amazon Cognito Sync provides an AWS service and client library that enable cross-device syncing of
  application-related user data. High-level client libraries are available for both iOS and Android. You can use these
  libraries to persist data locally so that it's available even if the device is offline. Developer credentials don't
  need to be stored on the mobile device to access the service. You can use Amazon Cognito to obtain a normalized user
  ID and credentials. User data is persisted in a dataset that can store up to 1 MB of key-value pairs, and you can
  have up to 20 datasets per user identity.


  With Amazon Cognito Sync, the data stored for each identity is accessible only to credentials assigned to that
  identity. In order to use the Cognito Sync service, you need to make API calls using credentials retrieved with Amazon Cognito Identity
  service.


  If you want to use Cognito Sync in an Android or iOS application, you will probably want to make API calls via the
  AWS Mobile SDK. To learn more, see the Developer Guide for
  Android and the Developer
  Guide for iOS."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cognitosync AmazonCognitoSyncClient]))

(defn ->amazon-cognito-sync-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to Amazon Cognito Sync (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AmazonCognitoSyncClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AmazonCognitoSyncClient aws-credentials-provider client-configuration request-metric-collector))
  (^AmazonCognitoSyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonCognitoSyncClient aws-credentials client-configuration))
  (^AmazonCognitoSyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonCognitoSyncClient client-configuration))
  (^AmazonCognitoSyncClient []
    (new AmazonCognitoSyncClient )))

(defn *builder
  "returns: `com.amazonaws.services.cognitosync.AmazonCognitoSyncClientBuilder`"
  (^com.amazonaws.services.cognitosync.AmazonCognitoSyncClientBuilder []
    (AmazonCognitoSyncClient/builder )))

(defn bulk-publish
  "Initiates a bulk publish of all existing datasets for an Identity Pool to the configured stream. Customers are
   limited to one successful bulk publish per 24 hours. Bulk publish is an asynchronous request, customers can see
   the status of the request via the GetBulkPublishDetails operation.


   This API can only be called with developer credentials. You cannot call this API with the temporary user
   credentials provided by Cognito Identity.

  request - `com.amazonaws.services.cognitosync.model.BulkPublishRequest`

  returns: Result of the BulkPublish operation returned by the service. - `com.amazonaws.services.cognitosync.model.BulkPublishResult`

  throws: com.amazonaws.services.cognitosync.model.NotAuthorizedException - Thrown when a user is not authorized to access the requested resource."
  (^com.amazonaws.services.cognitosync.model.BulkPublishResult [^AmazonCognitoSyncClient this ^com.amazonaws.services.cognitosync.model.BulkPublishRequest request]
    (-> this (.bulkPublish request))))

(defn list-identity-pool-usage
  "Gets a list of identity pools registered with Cognito.


   ListIdentityPoolUsage can only be called with developer credentials. You cannot make this API call with the
   temporary user credentials provided by Cognito Identity.

  request - `com.amazonaws.services.cognitosync.model.ListIdentityPoolUsageRequest`

  returns: Result of the ListIdentityPoolUsage operation returned by the service. - `com.amazonaws.services.cognitosync.model.ListIdentityPoolUsageResult`

  throws: com.amazonaws.services.cognitosync.model.NotAuthorizedException - Thrown when a user is not authorized to access the requested resource."
  (^com.amazonaws.services.cognitosync.model.ListIdentityPoolUsageResult [^AmazonCognitoSyncClient this ^com.amazonaws.services.cognitosync.model.ListIdentityPoolUsageRequest request]
    (-> this (.listIdentityPoolUsage request))))

(defn register-device
  "Registers a device to receive push sync notifications.


   This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API
   with developer credentials.

  request - `com.amazonaws.services.cognitosync.model.RegisterDeviceRequest`

  returns: Result of the RegisterDevice operation returned by the service. - `com.amazonaws.services.cognitosync.model.RegisterDeviceResult`

  throws: com.amazonaws.services.cognitosync.model.NotAuthorizedException - Thrown when a user is not authorized to access the requested resource."
  (^com.amazonaws.services.cognitosync.model.RegisterDeviceResult [^AmazonCognitoSyncClient this ^com.amazonaws.services.cognitosync.model.RegisterDeviceRequest request]
    (-> this (.registerDevice request))))

(defn get-bulk-publish-details
  "Get the status of the last BulkPublish operation for an identity pool.


   This API can only be called with developer credentials. You cannot call this API with the temporary user
   credentials provided by Cognito Identity.

  request - `com.amazonaws.services.cognitosync.model.GetBulkPublishDetailsRequest`

  returns: Result of the GetBulkPublishDetails operation returned by the service. - `com.amazonaws.services.cognitosync.model.GetBulkPublishDetailsResult`

  throws: com.amazonaws.services.cognitosync.model.NotAuthorizedException - Thrown when a user is not authorized to access the requested resource."
  (^com.amazonaws.services.cognitosync.model.GetBulkPublishDetailsResult [^AmazonCognitoSyncClient this ^com.amazonaws.services.cognitosync.model.GetBulkPublishDetailsRequest request]
    (-> this (.getBulkPublishDetails request))))

(defn set-identity-pool-configuration
  "Sets the necessary configuration for push sync.


   This API can only be called with developer credentials. You cannot call this API with the temporary user
   credentials provided by Cognito Identity.

  request - `com.amazonaws.services.cognitosync.model.SetIdentityPoolConfigurationRequest`

  returns: Result of the SetIdentityPoolConfiguration operation returned by the service. - `com.amazonaws.services.cognitosync.model.SetIdentityPoolConfigurationResult`

  throws: com.amazonaws.services.cognitosync.model.NotAuthorizedException - Thrown when a user is not authorized to access the requested resource."
  (^com.amazonaws.services.cognitosync.model.SetIdentityPoolConfigurationResult [^AmazonCognitoSyncClient this ^com.amazonaws.services.cognitosync.model.SetIdentityPoolConfigurationRequest request]
    (-> this (.setIdentityPoolConfiguration request))))

(defn get-cognito-events
  "Gets the events and the corresponding Lambda functions associated with an identity pool.


   This API can only be called with developer credentials. You cannot call this API with the temporary user
   credentials provided by Cognito Identity.

  request - `com.amazonaws.services.cognitosync.model.GetCognitoEventsRequest`

  returns: Result of the GetCognitoEvents operation returned by the service. - `com.amazonaws.services.cognitosync.model.GetCognitoEventsResult`

  throws: com.amazonaws.services.cognitosync.model.InvalidParameterException - Thrown when a request parameter does not comply with the associated constraints."
  (^com.amazonaws.services.cognitosync.model.GetCognitoEventsResult [^AmazonCognitoSyncClient this ^com.amazonaws.services.cognitosync.model.GetCognitoEventsRequest request]
    (-> this (.getCognitoEvents request))))

(defn update-records
  "Posts updates to records and adds and deletes records for a dataset and user.


   The sync count in the record patch is your last known sync count for that record. The server will reject an
   UpdateRecords request with a ResourceConflictException if you try to patch a record with a new value but a stale
   sync count.


   For example, if the sync count on the server is 5 for a key called highScore and you try and submit a new
   highScore with sync count of 4, the request will be rejected. To obtain the current sync count for a record, call
   ListRecords. On a successful update of the record, the response returns the new sync count for that record. You
   should present that sync count the next time you try to update that same record. When the record does not exist,
   specify the sync count as 0.


   This API can be called with temporary user credentials provided by Cognito Identity or with developer
   credentials.

  request - `com.amazonaws.services.cognitosync.model.UpdateRecordsRequest`

  returns: Result of the UpdateRecords operation returned by the service. - `com.amazonaws.services.cognitosync.model.UpdateRecordsResult`

  throws: com.amazonaws.services.cognitosync.model.NotAuthorizedException - Thrown when a user is not authorized to access the requested resource."
  (^com.amazonaws.services.cognitosync.model.UpdateRecordsResult [^AmazonCognitoSyncClient this ^com.amazonaws.services.cognitosync.model.UpdateRecordsRequest request]
    (-> this (.updateRecords request))))

(defn set-cognito-events
  "Sets the AWS Lambda function for a given event type for an identity pool. This request only updates the key/value
   pair specified. Other key/values pairs are not updated. To remove a key value pair, pass a empty value for the
   particular key.


   This API can only be called with developer credentials. You cannot call this API with the temporary user
   credentials provided by Cognito Identity.

  request - `com.amazonaws.services.cognitosync.model.SetCognitoEventsRequest`

  returns: Result of the SetCognitoEvents operation returned by the service. - `com.amazonaws.services.cognitosync.model.SetCognitoEventsResult`

  throws: com.amazonaws.services.cognitosync.model.InvalidParameterException - Thrown when a request parameter does not comply with the associated constraints."
  (^com.amazonaws.services.cognitosync.model.SetCognitoEventsResult [^AmazonCognitoSyncClient this ^com.amazonaws.services.cognitosync.model.SetCognitoEventsRequest request]
    (-> this (.setCognitoEvents request))))

(defn unsubscribe-from-dataset
  "Unsubscribes from receiving notifications when a dataset is modified by another device.


   This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API
   with developer credentials.

  request - `com.amazonaws.services.cognitosync.model.UnsubscribeFromDatasetRequest`

  returns: Result of the UnsubscribeFromDataset operation returned by the service. - `com.amazonaws.services.cognitosync.model.UnsubscribeFromDatasetResult`

  throws: com.amazonaws.services.cognitosync.model.NotAuthorizedException - Thrown when a user is not authorized to access the requested resource."
  (^com.amazonaws.services.cognitosync.model.UnsubscribeFromDatasetResult [^AmazonCognitoSyncClient this ^com.amazonaws.services.cognitosync.model.UnsubscribeFromDatasetRequest request]
    (-> this (.unsubscribeFromDataset request))))

(defn describe-dataset
  "Gets meta data about a dataset by identity and dataset name. With Amazon Cognito Sync, each identity has access
   only to its own data. Thus, the credentials used to make this API call need to have access to the identity data.


   This API can be called with temporary user credentials provided by Cognito Identity or with developer
   credentials. You should use Cognito Identity credentials to make this API call.

  request - `com.amazonaws.services.cognitosync.model.DescribeDatasetRequest`

  returns: Result of the DescribeDataset operation returned by the service. - `com.amazonaws.services.cognitosync.model.DescribeDatasetResult`

  throws: com.amazonaws.services.cognitosync.model.NotAuthorizedException - Thrown when a user is not authorized to access the requested resource."
  (^com.amazonaws.services.cognitosync.model.DescribeDatasetResult [^AmazonCognitoSyncClient this ^com.amazonaws.services.cognitosync.model.DescribeDatasetRequest request]
    (-> this (.describeDataset request))))

(defn list-datasets
  "Lists datasets for an identity. With Amazon Cognito Sync, each identity has access only to its own data. Thus,
   the credentials used to make this API call need to have access to the identity data.


   ListDatasets can be called with temporary user credentials provided by Cognito Identity or with developer
   credentials. You should use the Cognito Identity credentials to make this API call.

  request - `com.amazonaws.services.cognitosync.model.ListDatasetsRequest`

  returns: Result of the ListDatasets operation returned by the service. - `com.amazonaws.services.cognitosync.model.ListDatasetsResult`

  throws: com.amazonaws.services.cognitosync.model.NotAuthorizedException - Thrown when a user is not authorized to access the requested resource."
  (^com.amazonaws.services.cognitosync.model.ListDatasetsResult [^AmazonCognitoSyncClient this ^com.amazonaws.services.cognitosync.model.ListDatasetsRequest request]
    (-> this (.listDatasets request))))

(defn subscribe-to-dataset
  "Subscribes to receive notifications when a dataset is modified by another device.


   This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API
   with developer credentials.

  request - `com.amazonaws.services.cognitosync.model.SubscribeToDatasetRequest`

  returns: Result of the SubscribeToDataset operation returned by the service. - `com.amazonaws.services.cognitosync.model.SubscribeToDatasetResult`

  throws: com.amazonaws.services.cognitosync.model.NotAuthorizedException - Thrown when a user is not authorized to access the requested resource."
  (^com.amazonaws.services.cognitosync.model.SubscribeToDatasetResult [^AmazonCognitoSyncClient this ^com.amazonaws.services.cognitosync.model.SubscribeToDatasetRequest request]
    (-> this (.subscribeToDataset request))))

(defn get-identity-pool-configuration
  "Gets the configuration settings of an identity pool.


   This API can only be called with developer credentials. You cannot call this API with the temporary user
   credentials provided by Cognito Identity.

  request - `com.amazonaws.services.cognitosync.model.GetIdentityPoolConfigurationRequest`

  returns: Result of the GetIdentityPoolConfiguration operation returned by the service. - `com.amazonaws.services.cognitosync.model.GetIdentityPoolConfigurationResult`

  throws: com.amazonaws.services.cognitosync.model.NotAuthorizedException - Thrown when a user is not authorized to access the requested resource."
  (^com.amazonaws.services.cognitosync.model.GetIdentityPoolConfigurationResult [^AmazonCognitoSyncClient this ^com.amazonaws.services.cognitosync.model.GetIdentityPoolConfigurationRequest request]
    (-> this (.getIdentityPoolConfiguration request))))

(defn list-records
  "Gets paginated records, optionally changed after a particular sync count for a dataset and identity. With Amazon
   Cognito Sync, each identity has access only to its own data. Thus, the credentials used to make this API call
   need to have access to the identity data.


   ListRecords can be called with temporary user credentials provided by Cognito Identity or with developer
   credentials. You should use Cognito Identity credentials to make this API call.

  request - `com.amazonaws.services.cognitosync.model.ListRecordsRequest`

  returns: Result of the ListRecords operation returned by the service. - `com.amazonaws.services.cognitosync.model.ListRecordsResult`

  throws: com.amazonaws.services.cognitosync.model.InvalidParameterException - Thrown when a request parameter does not comply with the associated constraints."
  (^com.amazonaws.services.cognitosync.model.ListRecordsResult [^AmazonCognitoSyncClient this ^com.amazonaws.services.cognitosync.model.ListRecordsRequest request]
    (-> this (.listRecords request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonCognitoSyncClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn delete-dataset
  "Deletes the specific dataset. The dataset will be deleted permanently, and the action can't be undone. Datasets
   that this dataset was merged with will no longer report the merge. Any subsequent operation on this dataset will
   result in a ResourceNotFoundException.


   This API can be called with temporary user credentials provided by Cognito Identity or with developer
   credentials.

  request - `com.amazonaws.services.cognitosync.model.DeleteDatasetRequest`

  returns: Result of the DeleteDataset operation returned by the service. - `com.amazonaws.services.cognitosync.model.DeleteDatasetResult`

  throws: com.amazonaws.services.cognitosync.model.NotAuthorizedException - Thrown when a user is not authorized to access the requested resource."
  (^com.amazonaws.services.cognitosync.model.DeleteDatasetResult [^AmazonCognitoSyncClient this ^com.amazonaws.services.cognitosync.model.DeleteDatasetRequest request]
    (-> this (.deleteDataset request))))

(defn describe-identity-usage
  "Gets usage information for an identity, including number of datasets and data usage.


   This API can be called with temporary user credentials provided by Cognito Identity or with developer
   credentials.

  request - `com.amazonaws.services.cognitosync.model.DescribeIdentityUsageRequest`

  returns: Result of the DescribeIdentityUsage operation returned by the service. - `com.amazonaws.services.cognitosync.model.DescribeIdentityUsageResult`

  throws: com.amazonaws.services.cognitosync.model.NotAuthorizedException - Thrown when a user is not authorized to access the requested resource."
  (^com.amazonaws.services.cognitosync.model.DescribeIdentityUsageResult [^AmazonCognitoSyncClient this ^com.amazonaws.services.cognitosync.model.DescribeIdentityUsageRequest request]
    (-> this (.describeIdentityUsage request))))

(defn describe-identity-pool-usage
  "Gets usage details (for example, data storage) about a particular identity pool.


   This API can only be called with developer credentials. You cannot call this API with the temporary user
   credentials provided by Cognito Identity.

  request - `com.amazonaws.services.cognitosync.model.DescribeIdentityPoolUsageRequest`

  returns: Result of the DescribeIdentityPoolUsage operation returned by the service. - `com.amazonaws.services.cognitosync.model.DescribeIdentityPoolUsageResult`

  throws: com.amazonaws.services.cognitosync.model.NotAuthorizedException - Thrown when a user is not authorized to access the requested resource."
  (^com.amazonaws.services.cognitosync.model.DescribeIdentityPoolUsageResult [^AmazonCognitoSyncClient this ^com.amazonaws.services.cognitosync.model.DescribeIdentityPoolUsageRequest request]
    (-> this (.describeIdentityPoolUsage request))))

