(ns com.amazonaws.services.cognitosync.AmazonCognitoSync
  "Interface for accessing Amazon Cognito Sync.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonCognitoSync instead.


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
  (:import [com.amazonaws.services.cognitosync AmazonCognitoSync]))

(defn bulk-publish
  "Initiates a bulk publish of all existing datasets for an Identity Pool to the configured stream. Customers are
   limited to one successful bulk publish per 24 hours. Bulk publish is an asynchronous request, customers can see
   the status of the request via the GetBulkPublishDetails operation.


   This API can only be called with developer credentials. You cannot call this API with the temporary user
   credentials provided by Cognito Identity.

  bulk-publish-request - The input for the BulkPublish operation. - `com.amazonaws.services.cognitosync.model.BulkPublishRequest`

  returns: Result of the BulkPublish operation returned by the service. - `com.amazonaws.services.cognitosync.model.BulkPublishResult`

  throws: com.amazonaws.services.cognitosync.model.NotAuthorizedException - Thrown when a user is not authorized to access the requested resource."
  (^com.amazonaws.services.cognitosync.model.BulkPublishResult [^AmazonCognitoSync this ^com.amazonaws.services.cognitosync.model.BulkPublishRequest bulk-publish-request]
    (-> this (.bulkPublish bulk-publish-request))))

(defn list-identity-pool-usage
  "Gets a list of identity pools registered with Cognito.


   ListIdentityPoolUsage can only be called with developer credentials. You cannot make this API call with the
   temporary user credentials provided by Cognito Identity.

  list-identity-pool-usage-request - A request for usage information on an identity pool. - `com.amazonaws.services.cognitosync.model.ListIdentityPoolUsageRequest`

  returns: Result of the ListIdentityPoolUsage operation returned by the service. - `com.amazonaws.services.cognitosync.model.ListIdentityPoolUsageResult`

  throws: com.amazonaws.services.cognitosync.model.NotAuthorizedException - Thrown when a user is not authorized to access the requested resource."
  (^com.amazonaws.services.cognitosync.model.ListIdentityPoolUsageResult [^AmazonCognitoSync this ^com.amazonaws.services.cognitosync.model.ListIdentityPoolUsageRequest list-identity-pool-usage-request]
    (-> this (.listIdentityPoolUsage list-identity-pool-usage-request))))

(defn register-device
  "Registers a device to receive push sync notifications.


   This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API
   with developer credentials.

  register-device-request - A request to RegisterDevice. - `com.amazonaws.services.cognitosync.model.RegisterDeviceRequest`

  returns: Result of the RegisterDevice operation returned by the service. - `com.amazonaws.services.cognitosync.model.RegisterDeviceResult`

  throws: com.amazonaws.services.cognitosync.model.NotAuthorizedException - Thrown when a user is not authorized to access the requested resource."
  (^com.amazonaws.services.cognitosync.model.RegisterDeviceResult [^AmazonCognitoSync this ^com.amazonaws.services.cognitosync.model.RegisterDeviceRequest register-device-request]
    (-> this (.registerDevice register-device-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AmazonCognitoSync this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn get-bulk-publish-details
  "Get the status of the last BulkPublish operation for an identity pool.


   This API can only be called with developer credentials. You cannot call this API with the temporary user
   credentials provided by Cognito Identity.

  get-bulk-publish-details-request - The input for the GetBulkPublishDetails operation. - `com.amazonaws.services.cognitosync.model.GetBulkPublishDetailsRequest`

  returns: Result of the GetBulkPublishDetails operation returned by the service. - `com.amazonaws.services.cognitosync.model.GetBulkPublishDetailsResult`

  throws: com.amazonaws.services.cognitosync.model.NotAuthorizedException - Thrown when a user is not authorized to access the requested resource."
  (^com.amazonaws.services.cognitosync.model.GetBulkPublishDetailsResult [^AmazonCognitoSync this ^com.amazonaws.services.cognitosync.model.GetBulkPublishDetailsRequest get-bulk-publish-details-request]
    (-> this (.getBulkPublishDetails get-bulk-publish-details-request))))

(defn set-identity-pool-configuration
  "Sets the necessary configuration for push sync.


   This API can only be called with developer credentials. You cannot call this API with the temporary user
   credentials provided by Cognito Identity.

  set-identity-pool-configuration-request - The input for the SetIdentityPoolConfiguration operation. - `com.amazonaws.services.cognitosync.model.SetIdentityPoolConfigurationRequest`

  returns: Result of the SetIdentityPoolConfiguration operation returned by the service. - `com.amazonaws.services.cognitosync.model.SetIdentityPoolConfigurationResult`

  throws: com.amazonaws.services.cognitosync.model.NotAuthorizedException - Thrown when a user is not authorized to access the requested resource."
  (^com.amazonaws.services.cognitosync.model.SetIdentityPoolConfigurationResult [^AmazonCognitoSync this ^com.amazonaws.services.cognitosync.model.SetIdentityPoolConfigurationRequest set-identity-pool-configuration-request]
    (-> this (.setIdentityPoolConfiguration set-identity-pool-configuration-request))))

(defn get-cognito-events
  "Gets the events and the corresponding Lambda functions associated with an identity pool.


   This API can only be called with developer credentials. You cannot call this API with the temporary user
   credentials provided by Cognito Identity.

  get-cognito-events-request - A request for a list of the configured Cognito Events - `com.amazonaws.services.cognitosync.model.GetCognitoEventsRequest`

  returns: Result of the GetCognitoEvents operation returned by the service. - `com.amazonaws.services.cognitosync.model.GetCognitoEventsResult`

  throws: com.amazonaws.services.cognitosync.model.InvalidParameterException - Thrown when a request parameter does not comply with the associated constraints."
  (^com.amazonaws.services.cognitosync.model.GetCognitoEventsResult [^AmazonCognitoSync this ^com.amazonaws.services.cognitosync.model.GetCognitoEventsRequest get-cognito-events-request]
    (-> this (.getCognitoEvents get-cognito-events-request))))

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

  update-records-request - A request to post updates to records or add and delete records for a dataset and user. - `com.amazonaws.services.cognitosync.model.UpdateRecordsRequest`

  returns: Result of the UpdateRecords operation returned by the service. - `com.amazonaws.services.cognitosync.model.UpdateRecordsResult`

  throws: com.amazonaws.services.cognitosync.model.NotAuthorizedException - Thrown when a user is not authorized to access the requested resource."
  (^com.amazonaws.services.cognitosync.model.UpdateRecordsResult [^AmazonCognitoSync this ^com.amazonaws.services.cognitosync.model.UpdateRecordsRequest update-records-request]
    (-> this (.updateRecords update-records-request))))

(defn set-cognito-events
  "Sets the AWS Lambda function for a given event type for an identity pool. This request only updates the key/value
   pair specified. Other key/values pairs are not updated. To remove a key value pair, pass a empty value for the
   particular key.


   This API can only be called with developer credentials. You cannot call this API with the temporary user
   credentials provided by Cognito Identity.

  set-cognito-events-request - A request to configure Cognito Events\" - `com.amazonaws.services.cognitosync.model.SetCognitoEventsRequest`

  returns: Result of the SetCognitoEvents operation returned by the service. - `com.amazonaws.services.cognitosync.model.SetCognitoEventsResult`

  throws: com.amazonaws.services.cognitosync.model.InvalidParameterException - Thrown when a request parameter does not comply with the associated constraints."
  (^com.amazonaws.services.cognitosync.model.SetCognitoEventsResult [^AmazonCognitoSync this ^com.amazonaws.services.cognitosync.model.SetCognitoEventsRequest set-cognito-events-request]
    (-> this (.setCognitoEvents set-cognito-events-request))))

(defn unsubscribe-from-dataset
  "Unsubscribes from receiving notifications when a dataset is modified by another device.


   This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API
   with developer credentials.

  unsubscribe-from-dataset-request - A request to UnsubscribeFromDataset. - `com.amazonaws.services.cognitosync.model.UnsubscribeFromDatasetRequest`

  returns: Result of the UnsubscribeFromDataset operation returned by the service. - `com.amazonaws.services.cognitosync.model.UnsubscribeFromDatasetResult`

  throws: com.amazonaws.services.cognitosync.model.NotAuthorizedException - Thrown when a user is not authorized to access the requested resource."
  (^com.amazonaws.services.cognitosync.model.UnsubscribeFromDatasetResult [^AmazonCognitoSync this ^com.amazonaws.services.cognitosync.model.UnsubscribeFromDatasetRequest unsubscribe-from-dataset-request]
    (-> this (.unsubscribeFromDataset unsubscribe-from-dataset-request))))

(defn describe-dataset
  "Gets meta data about a dataset by identity and dataset name. With Amazon Cognito Sync, each identity has access
   only to its own data. Thus, the credentials used to make this API call need to have access to the identity data.


   This API can be called with temporary user credentials provided by Cognito Identity or with developer
   credentials. You should use Cognito Identity credentials to make this API call.

  describe-dataset-request - A request for meta data about a dataset (creation date, number of records, size) by owner and dataset name. - `com.amazonaws.services.cognitosync.model.DescribeDatasetRequest`

  returns: Result of the DescribeDataset operation returned by the service. - `com.amazonaws.services.cognitosync.model.DescribeDatasetResult`

  throws: com.amazonaws.services.cognitosync.model.NotAuthorizedException - Thrown when a user is not authorized to access the requested resource."
  (^com.amazonaws.services.cognitosync.model.DescribeDatasetResult [^AmazonCognitoSync this ^com.amazonaws.services.cognitosync.model.DescribeDatasetRequest describe-dataset-request]
    (-> this (.describeDataset describe-dataset-request))))

(defn list-datasets
  "Lists datasets for an identity. With Amazon Cognito Sync, each identity has access only to its own data. Thus,
   the credentials used to make this API call need to have access to the identity data.


   ListDatasets can be called with temporary user credentials provided by Cognito Identity or with developer
   credentials. You should use the Cognito Identity credentials to make this API call.

  list-datasets-request - Request for a list of datasets for an identity. - `com.amazonaws.services.cognitosync.model.ListDatasetsRequest`

  returns: Result of the ListDatasets operation returned by the service. - `com.amazonaws.services.cognitosync.model.ListDatasetsResult`

  throws: com.amazonaws.services.cognitosync.model.NotAuthorizedException - Thrown when a user is not authorized to access the requested resource."
  (^com.amazonaws.services.cognitosync.model.ListDatasetsResult [^AmazonCognitoSync this ^com.amazonaws.services.cognitosync.model.ListDatasetsRequest list-datasets-request]
    (-> this (.listDatasets list-datasets-request))))

(defn subscribe-to-dataset
  "Subscribes to receive notifications when a dataset is modified by another device.


   This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API
   with developer credentials.

  subscribe-to-dataset-request - A request to SubscribeToDatasetRequest. - `com.amazonaws.services.cognitosync.model.SubscribeToDatasetRequest`

  returns: Result of the SubscribeToDataset operation returned by the service. - `com.amazonaws.services.cognitosync.model.SubscribeToDatasetResult`

  throws: com.amazonaws.services.cognitosync.model.NotAuthorizedException - Thrown when a user is not authorized to access the requested resource."
  (^com.amazonaws.services.cognitosync.model.SubscribeToDatasetResult [^AmazonCognitoSync this ^com.amazonaws.services.cognitosync.model.SubscribeToDatasetRequest subscribe-to-dataset-request]
    (-> this (.subscribeToDataset subscribe-to-dataset-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonCognitoSync this]
    (-> this (.shutdown))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"cognito-sync.us-east-1.amazonaws.com/\") or a full URL, including the protocol (ex: \"https://cognito-sync.us-east-1.amazonaws.com/\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AmazonCognitoSync this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn get-identity-pool-configuration
  "Gets the configuration settings of an identity pool.


   This API can only be called with developer credentials. You cannot call this API with the temporary user
   credentials provided by Cognito Identity.

  get-identity-pool-configuration-request - The input for the GetIdentityPoolConfiguration operation. - `com.amazonaws.services.cognitosync.model.GetIdentityPoolConfigurationRequest`

  returns: Result of the GetIdentityPoolConfiguration operation returned by the service. - `com.amazonaws.services.cognitosync.model.GetIdentityPoolConfigurationResult`

  throws: com.amazonaws.services.cognitosync.model.NotAuthorizedException - Thrown when a user is not authorized to access the requested resource."
  (^com.amazonaws.services.cognitosync.model.GetIdentityPoolConfigurationResult [^AmazonCognitoSync this ^com.amazonaws.services.cognitosync.model.GetIdentityPoolConfigurationRequest get-identity-pool-configuration-request]
    (-> this (.getIdentityPoolConfiguration get-identity-pool-configuration-request))))

(defn list-records
  "Gets paginated records, optionally changed after a particular sync count for a dataset and identity. With Amazon
   Cognito Sync, each identity has access only to its own data. Thus, the credentials used to make this API call
   need to have access to the identity data.


   ListRecords can be called with temporary user credentials provided by Cognito Identity or with developer
   credentials. You should use Cognito Identity credentials to make this API call.

  list-records-request - A request for a list of records. - `com.amazonaws.services.cognitosync.model.ListRecordsRequest`

  returns: Result of the ListRecords operation returned by the service. - `com.amazonaws.services.cognitosync.model.ListRecordsResult`

  throws: com.amazonaws.services.cognitosync.model.InvalidParameterException - Thrown when a request parameter does not comply with the associated constraints."
  (^com.amazonaws.services.cognitosync.model.ListRecordsResult [^AmazonCognitoSync this ^com.amazonaws.services.cognitosync.model.ListRecordsRequest list-records-request]
    (-> this (.listRecords list-records-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonCognitoSync this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn delete-dataset
  "Deletes the specific dataset. The dataset will be deleted permanently, and the action can't be undone. Datasets
   that this dataset was merged with will no longer report the merge. Any subsequent operation on this dataset will
   result in a ResourceNotFoundException.


   This API can be called with temporary user credentials provided by Cognito Identity or with developer
   credentials.

  delete-dataset-request - A request to delete the specific dataset. - `com.amazonaws.services.cognitosync.model.DeleteDatasetRequest`

  returns: Result of the DeleteDataset operation returned by the service. - `com.amazonaws.services.cognitosync.model.DeleteDatasetResult`

  throws: com.amazonaws.services.cognitosync.model.NotAuthorizedException - Thrown when a user is not authorized to access the requested resource."
  (^com.amazonaws.services.cognitosync.model.DeleteDatasetResult [^AmazonCognitoSync this ^com.amazonaws.services.cognitosync.model.DeleteDatasetRequest delete-dataset-request]
    (-> this (.deleteDataset delete-dataset-request))))

(defn describe-identity-usage
  "Gets usage information for an identity, including number of datasets and data usage.


   This API can be called with temporary user credentials provided by Cognito Identity or with developer
   credentials.

  describe-identity-usage-request - A request for information about the usage of an identity pool. - `com.amazonaws.services.cognitosync.model.DescribeIdentityUsageRequest`

  returns: Result of the DescribeIdentityUsage operation returned by the service. - `com.amazonaws.services.cognitosync.model.DescribeIdentityUsageResult`

  throws: com.amazonaws.services.cognitosync.model.NotAuthorizedException - Thrown when a user is not authorized to access the requested resource."
  (^com.amazonaws.services.cognitosync.model.DescribeIdentityUsageResult [^AmazonCognitoSync this ^com.amazonaws.services.cognitosync.model.DescribeIdentityUsageRequest describe-identity-usage-request]
    (-> this (.describeIdentityUsage describe-identity-usage-request))))

(defn describe-identity-pool-usage
  "Gets usage details (for example, data storage) about a particular identity pool.


   This API can only be called with developer credentials. You cannot call this API with the temporary user
   credentials provided by Cognito Identity.

  describe-identity-pool-usage-request - A request for usage information about the identity pool. - `com.amazonaws.services.cognitosync.model.DescribeIdentityPoolUsageRequest`

  returns: Result of the DescribeIdentityPoolUsage operation returned by the service. - `com.amazonaws.services.cognitosync.model.DescribeIdentityPoolUsageResult`

  throws: com.amazonaws.services.cognitosync.model.NotAuthorizedException - Thrown when a user is not authorized to access the requested resource."
  (^com.amazonaws.services.cognitosync.model.DescribeIdentityPoolUsageResult [^AmazonCognitoSync this ^com.amazonaws.services.cognitosync.model.DescribeIdentityPoolUsageRequest describe-identity-pool-usage-request]
    (-> this (.describeIdentityPoolUsage describe-identity-pool-usage-request))))

