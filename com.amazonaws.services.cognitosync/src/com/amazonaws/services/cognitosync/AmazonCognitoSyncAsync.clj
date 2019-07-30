(ns com.amazonaws.services.cognitosync.AmazonCognitoSyncAsync
  "Interface for accessing Amazon Cognito Sync asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonCognitoSyncAsync instead.


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
  (:import [com.amazonaws.services.cognitosync AmazonCognitoSyncAsync]))

(defn delete-dataset-async
  "Deletes the specific dataset. The dataset will be deleted permanently, and the action can't be undone. Datasets
   that this dataset was merged with will no longer report the merge. Any subsequent operation on this dataset will
   result in a ResourceNotFoundException.


   This API can be called with temporary user credentials provided by Cognito Identity or with developer
   credentials.

  delete-dataset-request - A request to delete the specific dataset. - `com.amazonaws.services.cognitosync.model.DeleteDatasetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDataset operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitosync.model.DeleteDatasetResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsync this ^com.amazonaws.services.cognitosync.model.DeleteDatasetRequest delete-dataset-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDatasetAsync delete-dataset-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsync this ^com.amazonaws.services.cognitosync.model.DeleteDatasetRequest delete-dataset-request]
    (-> this (.deleteDatasetAsync delete-dataset-request))))

(defn list-datasets-async
  "Lists datasets for an identity. With Amazon Cognito Sync, each identity has access only to its own data. Thus,
   the credentials used to make this API call need to have access to the identity data.


   ListDatasets can be called with temporary user credentials provided by Cognito Identity or with developer
   credentials. You should use the Cognito Identity credentials to make this API call.

  list-datasets-request - Request for a list of datasets for an identity. - `com.amazonaws.services.cognitosync.model.ListDatasetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDatasets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitosync.model.ListDatasetsResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsync this ^com.amazonaws.services.cognitosync.model.ListDatasetsRequest list-datasets-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDatasetsAsync list-datasets-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsync this ^com.amazonaws.services.cognitosync.model.ListDatasetsRequest list-datasets-request]
    (-> this (.listDatasetsAsync list-datasets-request))))

(defn get-cognito-events-async
  "Gets the events and the corresponding Lambda functions associated with an identity pool.


   This API can only be called with developer credentials. You cannot call this API with the temporary user
   credentials provided by Cognito Identity.

  get-cognito-events-request - A request for a list of the configured Cognito Events - `com.amazonaws.services.cognitosync.model.GetCognitoEventsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCognitoEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitosync.model.GetCognitoEventsResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsync this ^com.amazonaws.services.cognitosync.model.GetCognitoEventsRequest get-cognito-events-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCognitoEventsAsync get-cognito-events-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsync this ^com.amazonaws.services.cognitosync.model.GetCognitoEventsRequest get-cognito-events-request]
    (-> this (.getCognitoEventsAsync get-cognito-events-request))))

(defn set-identity-pool-configuration-async
  "Sets the necessary configuration for push sync.


   This API can only be called with developer credentials. You cannot call this API with the temporary user
   credentials provided by Cognito Identity.

  set-identity-pool-configuration-request - The input for the SetIdentityPoolConfiguration operation. - `com.amazonaws.services.cognitosync.model.SetIdentityPoolConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetIdentityPoolConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cognitosync.model.SetIdentityPoolConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsync this ^com.amazonaws.services.cognitosync.model.SetIdentityPoolConfigurationRequest set-identity-pool-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setIdentityPoolConfigurationAsync set-identity-pool-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsync this ^com.amazonaws.services.cognitosync.model.SetIdentityPoolConfigurationRequest set-identity-pool-configuration-request]
    (-> this (.setIdentityPoolConfigurationAsync set-identity-pool-configuration-request))))

(defn list-identity-pool-usage-async
  "Gets a list of identity pools registered with Cognito.


   ListIdentityPoolUsage can only be called with developer credentials. You cannot make this API call with the
   temporary user credentials provided by Cognito Identity.

  list-identity-pool-usage-request - A request for usage information on an identity pool. - `com.amazonaws.services.cognitosync.model.ListIdentityPoolUsageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListIdentityPoolUsage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitosync.model.ListIdentityPoolUsageResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsync this ^com.amazonaws.services.cognitosync.model.ListIdentityPoolUsageRequest list-identity-pool-usage-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listIdentityPoolUsageAsync list-identity-pool-usage-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsync this ^com.amazonaws.services.cognitosync.model.ListIdentityPoolUsageRequest list-identity-pool-usage-request]
    (-> this (.listIdentityPoolUsageAsync list-identity-pool-usage-request))))

(defn describe-dataset-async
  "Gets meta data about a dataset by identity and dataset name. With Amazon Cognito Sync, each identity has access
   only to its own data. Thus, the credentials used to make this API call need to have access to the identity data.


   This API can be called with temporary user credentials provided by Cognito Identity or with developer
   credentials. You should use Cognito Identity credentials to make this API call.

  describe-dataset-request - A request for meta data about a dataset (creation date, number of records, size) by owner and dataset name. - `com.amazonaws.services.cognitosync.model.DescribeDatasetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDataset operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitosync.model.DescribeDatasetResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsync this ^com.amazonaws.services.cognitosync.model.DescribeDatasetRequest describe-dataset-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDatasetAsync describe-dataset-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsync this ^com.amazonaws.services.cognitosync.model.DescribeDatasetRequest describe-dataset-request]
    (-> this (.describeDatasetAsync describe-dataset-request))))

(defn get-identity-pool-configuration-async
  "Gets the configuration settings of an identity pool.


   This API can only be called with developer credentials. You cannot call this API with the temporary user
   credentials provided by Cognito Identity.

  get-identity-pool-configuration-request - The input for the GetIdentityPoolConfiguration operation. - `com.amazonaws.services.cognitosync.model.GetIdentityPoolConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetIdentityPoolConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cognitosync.model.GetIdentityPoolConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsync this ^com.amazonaws.services.cognitosync.model.GetIdentityPoolConfigurationRequest get-identity-pool-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIdentityPoolConfigurationAsync get-identity-pool-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsync this ^com.amazonaws.services.cognitosync.model.GetIdentityPoolConfigurationRequest get-identity-pool-configuration-request]
    (-> this (.getIdentityPoolConfigurationAsync get-identity-pool-configuration-request))))

(defn set-cognito-events-async
  "Sets the AWS Lambda function for a given event type for an identity pool. This request only updates the key/value
   pair specified. Other key/values pairs are not updated. To remove a key value pair, pass a empty value for the
   particular key.


   This API can only be called with developer credentials. You cannot call this API with the temporary user
   credentials provided by Cognito Identity.

  set-cognito-events-request - A request to configure Cognito Events\" - `com.amazonaws.services.cognitosync.model.SetCognitoEventsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetCognitoEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitosync.model.SetCognitoEventsResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsync this ^com.amazonaws.services.cognitosync.model.SetCognitoEventsRequest set-cognito-events-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setCognitoEventsAsync set-cognito-events-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsync this ^com.amazonaws.services.cognitosync.model.SetCognitoEventsRequest set-cognito-events-request]
    (-> this (.setCognitoEventsAsync set-cognito-events-request))))

(defn get-bulk-publish-details-async
  "Get the status of the last BulkPublish operation for an identity pool.


   This API can only be called with developer credentials. You cannot call this API with the temporary user
   credentials provided by Cognito Identity.

  get-bulk-publish-details-request - The input for the GetBulkPublishDetails operation. - `com.amazonaws.services.cognitosync.model.GetBulkPublishDetailsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBulkPublishDetails operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitosync.model.GetBulkPublishDetailsResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsync this ^com.amazonaws.services.cognitosync.model.GetBulkPublishDetailsRequest get-bulk-publish-details-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBulkPublishDetailsAsync get-bulk-publish-details-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsync this ^com.amazonaws.services.cognitosync.model.GetBulkPublishDetailsRequest get-bulk-publish-details-request]
    (-> this (.getBulkPublishDetailsAsync get-bulk-publish-details-request))))

(defn describe-identity-usage-async
  "Gets usage information for an identity, including number of datasets and data usage.


   This API can be called with temporary user credentials provided by Cognito Identity or with developer
   credentials.

  describe-identity-usage-request - A request for information about the usage of an identity pool. - `com.amazonaws.services.cognitosync.model.DescribeIdentityUsageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeIdentityUsage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitosync.model.DescribeIdentityUsageResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsync this ^com.amazonaws.services.cognitosync.model.DescribeIdentityUsageRequest describe-identity-usage-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeIdentityUsageAsync describe-identity-usage-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsync this ^com.amazonaws.services.cognitosync.model.DescribeIdentityUsageRequest describe-identity-usage-request]
    (-> this (.describeIdentityUsageAsync describe-identity-usage-request))))

(defn describe-identity-pool-usage-async
  "Gets usage details (for example, data storage) about a particular identity pool.


   This API can only be called with developer credentials. You cannot call this API with the temporary user
   credentials provided by Cognito Identity.

  describe-identity-pool-usage-request - A request for usage information about the identity pool. - `com.amazonaws.services.cognitosync.model.DescribeIdentityPoolUsageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeIdentityPoolUsage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitosync.model.DescribeIdentityPoolUsageResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsync this ^com.amazonaws.services.cognitosync.model.DescribeIdentityPoolUsageRequest describe-identity-pool-usage-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeIdentityPoolUsageAsync describe-identity-pool-usage-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsync this ^com.amazonaws.services.cognitosync.model.DescribeIdentityPoolUsageRequest describe-identity-pool-usage-request]
    (-> this (.describeIdentityPoolUsageAsync describe-identity-pool-usage-request))))

(defn subscribe-to-dataset-async
  "Subscribes to receive notifications when a dataset is modified by another device.


   This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API
   with developer credentials.

  subscribe-to-dataset-request - A request to SubscribeToDatasetRequest. - `com.amazonaws.services.cognitosync.model.SubscribeToDatasetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SubscribeToDataset operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitosync.model.SubscribeToDatasetResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsync this ^com.amazonaws.services.cognitosync.model.SubscribeToDatasetRequest subscribe-to-dataset-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.subscribeToDatasetAsync subscribe-to-dataset-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsync this ^com.amazonaws.services.cognitosync.model.SubscribeToDatasetRequest subscribe-to-dataset-request]
    (-> this (.subscribeToDatasetAsync subscribe-to-dataset-request))))

(defn bulk-publish-async
  "Initiates a bulk publish of all existing datasets for an Identity Pool to the configured stream. Customers are
   limited to one successful bulk publish per 24 hours. Bulk publish is an asynchronous request, customers can see
   the status of the request via the GetBulkPublishDetails operation.


   This API can only be called with developer credentials. You cannot call this API with the temporary user
   credentials provided by Cognito Identity.

  bulk-publish-request - The input for the BulkPublish operation. - `com.amazonaws.services.cognitosync.model.BulkPublishRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BulkPublish operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitosync.model.BulkPublishResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsync this ^com.amazonaws.services.cognitosync.model.BulkPublishRequest bulk-publish-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.bulkPublishAsync bulk-publish-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsync this ^com.amazonaws.services.cognitosync.model.BulkPublishRequest bulk-publish-request]
    (-> this (.bulkPublishAsync bulk-publish-request))))

(defn unsubscribe-from-dataset-async
  "Unsubscribes from receiving notifications when a dataset is modified by another device.


   This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API
   with developer credentials.

  unsubscribe-from-dataset-request - A request to UnsubscribeFromDataset. - `com.amazonaws.services.cognitosync.model.UnsubscribeFromDatasetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UnsubscribeFromDataset operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitosync.model.UnsubscribeFromDatasetResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsync this ^com.amazonaws.services.cognitosync.model.UnsubscribeFromDatasetRequest unsubscribe-from-dataset-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.unsubscribeFromDatasetAsync unsubscribe-from-dataset-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsync this ^com.amazonaws.services.cognitosync.model.UnsubscribeFromDatasetRequest unsubscribe-from-dataset-request]
    (-> this (.unsubscribeFromDatasetAsync unsubscribe-from-dataset-request))))

(defn register-device-async
  "Registers a device to receive push sync notifications.


   This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API
   with developer credentials.

  register-device-request - A request to RegisterDevice. - `com.amazonaws.services.cognitosync.model.RegisterDeviceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterDevice operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitosync.model.RegisterDeviceResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsync this ^com.amazonaws.services.cognitosync.model.RegisterDeviceRequest register-device-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerDeviceAsync register-device-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsync this ^com.amazonaws.services.cognitosync.model.RegisterDeviceRequest register-device-request]
    (-> this (.registerDeviceAsync register-device-request))))

(defn update-records-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRecords operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitosync.model.UpdateRecordsResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsync this ^com.amazonaws.services.cognitosync.model.UpdateRecordsRequest update-records-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRecordsAsync update-records-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsync this ^com.amazonaws.services.cognitosync.model.UpdateRecordsRequest update-records-request]
    (-> this (.updateRecordsAsync update-records-request))))

(defn list-records-async
  "Gets paginated records, optionally changed after a particular sync count for a dataset and identity. With Amazon
   Cognito Sync, each identity has access only to its own data. Thus, the credentials used to make this API call
   need to have access to the identity data.


   ListRecords can be called with temporary user credentials provided by Cognito Identity or with developer
   credentials. You should use Cognito Identity credentials to make this API call.

  list-records-request - A request for a list of records. - `com.amazonaws.services.cognitosync.model.ListRecordsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRecords operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitosync.model.ListRecordsResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsync this ^com.amazonaws.services.cognitosync.model.ListRecordsRequest list-records-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRecordsAsync list-records-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsync this ^com.amazonaws.services.cognitosync.model.ListRecordsRequest list-records-request]
    (-> this (.listRecordsAsync list-records-request))))

