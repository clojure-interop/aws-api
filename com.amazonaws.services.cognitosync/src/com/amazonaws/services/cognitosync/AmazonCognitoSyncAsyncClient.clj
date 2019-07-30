(ns com.amazonaws.services.cognitosync.AmazonCognitoSyncAsyncClient
  "Client for accessing Amazon Cognito Sync asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

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
  (:import [com.amazonaws.services.cognitosync AmazonCognitoSyncAsyncClient]))

(defn ->amazon-cognito-sync-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AmazonCognitoSyncAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonCognitoSyncAsyncClient aws-credentials client-configuration executor-service))
  (^AmazonCognitoSyncAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonCognitoSyncAsyncClient aws-credentials executor-service))
  (^AmazonCognitoSyncAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonCognitoSyncAsyncClient client-configuration))
  (^AmazonCognitoSyncAsyncClient []
    (new AmazonCognitoSyncAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.cognitosync.AmazonCognitoSyncAsyncClientBuilder`"
  (^com.amazonaws.services.cognitosync.AmazonCognitoSyncAsyncClientBuilder []
    (AmazonCognitoSyncAsyncClient/asyncBuilder )))

(defn delete-dataset-async
  "Description copied from interface: AmazonCognitoSyncAsync

  request - A request to delete the specific dataset. - `com.amazonaws.services.cognitosync.model.DeleteDatasetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDataset operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitosync.model.DeleteDatasetResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsyncClient this ^com.amazonaws.services.cognitosync.model.DeleteDatasetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDatasetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsyncClient this ^com.amazonaws.services.cognitosync.model.DeleteDatasetRequest request]
    (-> this (.deleteDatasetAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonCognitoSyncAsyncClient this]
    (-> this (.getExecutorService))))

(defn list-datasets-async
  "Description copied from interface: AmazonCognitoSyncAsync

  request - Request for a list of datasets for an identity. - `com.amazonaws.services.cognitosync.model.ListDatasetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDatasets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitosync.model.ListDatasetsResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsyncClient this ^com.amazonaws.services.cognitosync.model.ListDatasetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDatasetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsyncClient this ^com.amazonaws.services.cognitosync.model.ListDatasetsRequest request]
    (-> this (.listDatasetsAsync request))))

(defn get-cognito-events-async
  "Description copied from interface: AmazonCognitoSyncAsync

  request - A request for a list of the configured Cognito Events - `com.amazonaws.services.cognitosync.model.GetCognitoEventsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCognitoEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitosync.model.GetCognitoEventsResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsyncClient this ^com.amazonaws.services.cognitosync.model.GetCognitoEventsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCognitoEventsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsyncClient this ^com.amazonaws.services.cognitosync.model.GetCognitoEventsRequest request]
    (-> this (.getCognitoEventsAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonCognitoSyncAsyncClient this]
    (-> this (.shutdown))))

(defn set-identity-pool-configuration-async
  "Description copied from interface: AmazonCognitoSyncAsync

  request - The input for the SetIdentityPoolConfiguration operation. - `com.amazonaws.services.cognitosync.model.SetIdentityPoolConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetIdentityPoolConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cognitosync.model.SetIdentityPoolConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsyncClient this ^com.amazonaws.services.cognitosync.model.SetIdentityPoolConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setIdentityPoolConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsyncClient this ^com.amazonaws.services.cognitosync.model.SetIdentityPoolConfigurationRequest request]
    (-> this (.setIdentityPoolConfigurationAsync request))))

(defn list-identity-pool-usage-async
  "Description copied from interface: AmazonCognitoSyncAsync

  request - A request for usage information on an identity pool. - `com.amazonaws.services.cognitosync.model.ListIdentityPoolUsageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListIdentityPoolUsage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitosync.model.ListIdentityPoolUsageResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsyncClient this ^com.amazonaws.services.cognitosync.model.ListIdentityPoolUsageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listIdentityPoolUsageAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsyncClient this ^com.amazonaws.services.cognitosync.model.ListIdentityPoolUsageRequest request]
    (-> this (.listIdentityPoolUsageAsync request))))

(defn describe-dataset-async
  "Description copied from interface: AmazonCognitoSyncAsync

  request - A request for meta data about a dataset (creation date, number of records, size) by owner and dataset name. - `com.amazonaws.services.cognitosync.model.DescribeDatasetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDataset operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitosync.model.DescribeDatasetResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsyncClient this ^com.amazonaws.services.cognitosync.model.DescribeDatasetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDatasetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsyncClient this ^com.amazonaws.services.cognitosync.model.DescribeDatasetRequest request]
    (-> this (.describeDatasetAsync request))))

(defn get-identity-pool-configuration-async
  "Description copied from interface: AmazonCognitoSyncAsync

  request - The input for the GetIdentityPoolConfiguration operation. - `com.amazonaws.services.cognitosync.model.GetIdentityPoolConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetIdentityPoolConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cognitosync.model.GetIdentityPoolConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsyncClient this ^com.amazonaws.services.cognitosync.model.GetIdentityPoolConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIdentityPoolConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsyncClient this ^com.amazonaws.services.cognitosync.model.GetIdentityPoolConfigurationRequest request]
    (-> this (.getIdentityPoolConfigurationAsync request))))

(defn set-cognito-events-async
  "Description copied from interface: AmazonCognitoSyncAsync

  request - A request to configure Cognito Events\" - `com.amazonaws.services.cognitosync.model.SetCognitoEventsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetCognitoEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitosync.model.SetCognitoEventsResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsyncClient this ^com.amazonaws.services.cognitosync.model.SetCognitoEventsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setCognitoEventsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsyncClient this ^com.amazonaws.services.cognitosync.model.SetCognitoEventsRequest request]
    (-> this (.setCognitoEventsAsync request))))

(defn get-bulk-publish-details-async
  "Description copied from interface: AmazonCognitoSyncAsync

  request - The input for the GetBulkPublishDetails operation. - `com.amazonaws.services.cognitosync.model.GetBulkPublishDetailsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBulkPublishDetails operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitosync.model.GetBulkPublishDetailsResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsyncClient this ^com.amazonaws.services.cognitosync.model.GetBulkPublishDetailsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBulkPublishDetailsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsyncClient this ^com.amazonaws.services.cognitosync.model.GetBulkPublishDetailsRequest request]
    (-> this (.getBulkPublishDetailsAsync request))))

(defn describe-identity-usage-async
  "Description copied from interface: AmazonCognitoSyncAsync

  request - A request for information about the usage of an identity pool. - `com.amazonaws.services.cognitosync.model.DescribeIdentityUsageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeIdentityUsage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitosync.model.DescribeIdentityUsageResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsyncClient this ^com.amazonaws.services.cognitosync.model.DescribeIdentityUsageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeIdentityUsageAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsyncClient this ^com.amazonaws.services.cognitosync.model.DescribeIdentityUsageRequest request]
    (-> this (.describeIdentityUsageAsync request))))

(defn describe-identity-pool-usage-async
  "Description copied from interface: AmazonCognitoSyncAsync

  request - A request for usage information about the identity pool. - `com.amazonaws.services.cognitosync.model.DescribeIdentityPoolUsageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeIdentityPoolUsage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitosync.model.DescribeIdentityPoolUsageResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsyncClient this ^com.amazonaws.services.cognitosync.model.DescribeIdentityPoolUsageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeIdentityPoolUsageAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsyncClient this ^com.amazonaws.services.cognitosync.model.DescribeIdentityPoolUsageRequest request]
    (-> this (.describeIdentityPoolUsageAsync request))))

(defn subscribe-to-dataset-async
  "Description copied from interface: AmazonCognitoSyncAsync

  request - A request to SubscribeToDatasetRequest. - `com.amazonaws.services.cognitosync.model.SubscribeToDatasetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SubscribeToDataset operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitosync.model.SubscribeToDatasetResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsyncClient this ^com.amazonaws.services.cognitosync.model.SubscribeToDatasetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.subscribeToDatasetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsyncClient this ^com.amazonaws.services.cognitosync.model.SubscribeToDatasetRequest request]
    (-> this (.subscribeToDatasetAsync request))))

(defn bulk-publish-async
  "Description copied from interface: AmazonCognitoSyncAsync

  request - The input for the BulkPublish operation. - `com.amazonaws.services.cognitosync.model.BulkPublishRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BulkPublish operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitosync.model.BulkPublishResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsyncClient this ^com.amazonaws.services.cognitosync.model.BulkPublishRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.bulkPublishAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsyncClient this ^com.amazonaws.services.cognitosync.model.BulkPublishRequest request]
    (-> this (.bulkPublishAsync request))))

(defn unsubscribe-from-dataset-async
  "Description copied from interface: AmazonCognitoSyncAsync

  request - A request to UnsubscribeFromDataset. - `com.amazonaws.services.cognitosync.model.UnsubscribeFromDatasetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UnsubscribeFromDataset operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitosync.model.UnsubscribeFromDatasetResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsyncClient this ^com.amazonaws.services.cognitosync.model.UnsubscribeFromDatasetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.unsubscribeFromDatasetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsyncClient this ^com.amazonaws.services.cognitosync.model.UnsubscribeFromDatasetRequest request]
    (-> this (.unsubscribeFromDatasetAsync request))))

(defn register-device-async
  "Description copied from interface: AmazonCognitoSyncAsync

  request - A request to RegisterDevice. - `com.amazonaws.services.cognitosync.model.RegisterDeviceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterDevice operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitosync.model.RegisterDeviceResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsyncClient this ^com.amazonaws.services.cognitosync.model.RegisterDeviceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerDeviceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsyncClient this ^com.amazonaws.services.cognitosync.model.RegisterDeviceRequest request]
    (-> this (.registerDeviceAsync request))))

(defn update-records-async
  "Description copied from interface: AmazonCognitoSyncAsync

  request - A request to post updates to records or add and delete records for a dataset and user. - `com.amazonaws.services.cognitosync.model.UpdateRecordsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRecords operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitosync.model.UpdateRecordsResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsyncClient this ^com.amazonaws.services.cognitosync.model.UpdateRecordsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRecordsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsyncClient this ^com.amazonaws.services.cognitosync.model.UpdateRecordsRequest request]
    (-> this (.updateRecordsAsync request))))

(defn list-records-async
  "Description copied from interface: AmazonCognitoSyncAsync

  request - A request for a list of records. - `com.amazonaws.services.cognitosync.model.ListRecordsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRecords operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitosync.model.ListRecordsResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsyncClient this ^com.amazonaws.services.cognitosync.model.ListRecordsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRecordsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoSyncAsyncClient this ^com.amazonaws.services.cognitosync.model.ListRecordsRequest request]
    (-> this (.listRecordsAsync request))))

