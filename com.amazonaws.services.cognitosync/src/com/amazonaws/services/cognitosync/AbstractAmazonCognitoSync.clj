(ns com.amazonaws.services.cognitosync.AbstractAmazonCognitoSync
  "Abstract implementation of AmazonCognitoSync. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cognitosync AbstractAmazonCognitoSync]))

(defn bulk-publish
  "Description copied from interface: AmazonCognitoSync

  request - The input for the BulkPublish operation. - `com.amazonaws.services.cognitosync.model.BulkPublishRequest`

  returns: Result of the BulkPublish operation returned by the service. - `com.amazonaws.services.cognitosync.model.BulkPublishResult`"
  (^com.amazonaws.services.cognitosync.model.BulkPublishResult [^AbstractAmazonCognitoSync this ^com.amazonaws.services.cognitosync.model.BulkPublishRequest request]
    (-> this (.bulkPublish request))))

(defn list-identity-pool-usage
  "Description copied from interface: AmazonCognitoSync

  request - A request for usage information on an identity pool. - `com.amazonaws.services.cognitosync.model.ListIdentityPoolUsageRequest`

  returns: Result of the ListIdentityPoolUsage operation returned by the service. - `com.amazonaws.services.cognitosync.model.ListIdentityPoolUsageResult`"
  (^com.amazonaws.services.cognitosync.model.ListIdentityPoolUsageResult [^AbstractAmazonCognitoSync this ^com.amazonaws.services.cognitosync.model.ListIdentityPoolUsageRequest request]
    (-> this (.listIdentityPoolUsage request))))

(defn register-device
  "Description copied from interface: AmazonCognitoSync

  request - A request to RegisterDevice. - `com.amazonaws.services.cognitosync.model.RegisterDeviceRequest`

  returns: Result of the RegisterDevice operation returned by the service. - `com.amazonaws.services.cognitosync.model.RegisterDeviceResult`"
  (^com.amazonaws.services.cognitosync.model.RegisterDeviceResult [^AbstractAmazonCognitoSync this ^com.amazonaws.services.cognitosync.model.RegisterDeviceRequest request]
    (-> this (.registerDevice request))))

(defn set-region
  "Description copied from interface: AmazonCognitoSync

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonCognitoSync this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn get-bulk-publish-details
  "Description copied from interface: AmazonCognitoSync

  request - The input for the GetBulkPublishDetails operation. - `com.amazonaws.services.cognitosync.model.GetBulkPublishDetailsRequest`

  returns: Result of the GetBulkPublishDetails operation returned by the service. - `com.amazonaws.services.cognitosync.model.GetBulkPublishDetailsResult`"
  (^com.amazonaws.services.cognitosync.model.GetBulkPublishDetailsResult [^AbstractAmazonCognitoSync this ^com.amazonaws.services.cognitosync.model.GetBulkPublishDetailsRequest request]
    (-> this (.getBulkPublishDetails request))))

(defn set-identity-pool-configuration
  "Description copied from interface: AmazonCognitoSync

  request - The input for the SetIdentityPoolConfiguration operation. - `com.amazonaws.services.cognitosync.model.SetIdentityPoolConfigurationRequest`

  returns: Result of the SetIdentityPoolConfiguration operation returned by the service. - `com.amazonaws.services.cognitosync.model.SetIdentityPoolConfigurationResult`"
  (^com.amazonaws.services.cognitosync.model.SetIdentityPoolConfigurationResult [^AbstractAmazonCognitoSync this ^com.amazonaws.services.cognitosync.model.SetIdentityPoolConfigurationRequest request]
    (-> this (.setIdentityPoolConfiguration request))))

(defn get-cognito-events
  "Description copied from interface: AmazonCognitoSync

  request - A request for a list of the configured Cognito Events - `com.amazonaws.services.cognitosync.model.GetCognitoEventsRequest`

  returns: Result of the GetCognitoEvents operation returned by the service. - `com.amazonaws.services.cognitosync.model.GetCognitoEventsResult`"
  (^com.amazonaws.services.cognitosync.model.GetCognitoEventsResult [^AbstractAmazonCognitoSync this ^com.amazonaws.services.cognitosync.model.GetCognitoEventsRequest request]
    (-> this (.getCognitoEvents request))))

(defn update-records
  "Description copied from interface: AmazonCognitoSync

  request - A request to post updates to records or add and delete records for a dataset and user. - `com.amazonaws.services.cognitosync.model.UpdateRecordsRequest`

  returns: Result of the UpdateRecords operation returned by the service. - `com.amazonaws.services.cognitosync.model.UpdateRecordsResult`"
  (^com.amazonaws.services.cognitosync.model.UpdateRecordsResult [^AbstractAmazonCognitoSync this ^com.amazonaws.services.cognitosync.model.UpdateRecordsRequest request]
    (-> this (.updateRecords request))))

(defn set-cognito-events
  "Description copied from interface: AmazonCognitoSync

  request - A request to configure Cognito Events\" - `com.amazonaws.services.cognitosync.model.SetCognitoEventsRequest`

  returns: Result of the SetCognitoEvents operation returned by the service. - `com.amazonaws.services.cognitosync.model.SetCognitoEventsResult`"
  (^com.amazonaws.services.cognitosync.model.SetCognitoEventsResult [^AbstractAmazonCognitoSync this ^com.amazonaws.services.cognitosync.model.SetCognitoEventsRequest request]
    (-> this (.setCognitoEvents request))))

(defn unsubscribe-from-dataset
  "Description copied from interface: AmazonCognitoSync

  request - A request to UnsubscribeFromDataset. - `com.amazonaws.services.cognitosync.model.UnsubscribeFromDatasetRequest`

  returns: Result of the UnsubscribeFromDataset operation returned by the service. - `com.amazonaws.services.cognitosync.model.UnsubscribeFromDatasetResult`"
  (^com.amazonaws.services.cognitosync.model.UnsubscribeFromDatasetResult [^AbstractAmazonCognitoSync this ^com.amazonaws.services.cognitosync.model.UnsubscribeFromDatasetRequest request]
    (-> this (.unsubscribeFromDataset request))))

(defn describe-dataset
  "Description copied from interface: AmazonCognitoSync

  request - A request for meta data about a dataset (creation date, number of records, size) by owner and dataset name. - `com.amazonaws.services.cognitosync.model.DescribeDatasetRequest`

  returns: Result of the DescribeDataset operation returned by the service. - `com.amazonaws.services.cognitosync.model.DescribeDatasetResult`"
  (^com.amazonaws.services.cognitosync.model.DescribeDatasetResult [^AbstractAmazonCognitoSync this ^com.amazonaws.services.cognitosync.model.DescribeDatasetRequest request]
    (-> this (.describeDataset request))))

(defn list-datasets
  "Description copied from interface: AmazonCognitoSync

  request - Request for a list of datasets for an identity. - `com.amazonaws.services.cognitosync.model.ListDatasetsRequest`

  returns: Result of the ListDatasets operation returned by the service. - `com.amazonaws.services.cognitosync.model.ListDatasetsResult`"
  (^com.amazonaws.services.cognitosync.model.ListDatasetsResult [^AbstractAmazonCognitoSync this ^com.amazonaws.services.cognitosync.model.ListDatasetsRequest request]
    (-> this (.listDatasets request))))

(defn subscribe-to-dataset
  "Description copied from interface: AmazonCognitoSync

  request - A request to SubscribeToDatasetRequest. - `com.amazonaws.services.cognitosync.model.SubscribeToDatasetRequest`

  returns: Result of the SubscribeToDataset operation returned by the service. - `com.amazonaws.services.cognitosync.model.SubscribeToDatasetResult`"
  (^com.amazonaws.services.cognitosync.model.SubscribeToDatasetResult [^AbstractAmazonCognitoSync this ^com.amazonaws.services.cognitosync.model.SubscribeToDatasetRequest request]
    (-> this (.subscribeToDataset request))))

(defn shutdown
  "Description copied from interface: AmazonCognitoSync"
  ([^AbstractAmazonCognitoSync this]
    (-> this (.shutdown))))

(defn set-endpoint
  "Description copied from interface: AmazonCognitoSync

  endpoint - The endpoint (ex: \"cognito-sync.us-east-1.amazonaws.com/\") or a full URL, including the protocol (ex: \"https://cognito-sync.us-east-1.amazonaws.com/\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonCognitoSync this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn get-identity-pool-configuration
  "Description copied from interface: AmazonCognitoSync

  request - The input for the GetIdentityPoolConfiguration operation. - `com.amazonaws.services.cognitosync.model.GetIdentityPoolConfigurationRequest`

  returns: Result of the GetIdentityPoolConfiguration operation returned by the service. - `com.amazonaws.services.cognitosync.model.GetIdentityPoolConfigurationResult`"
  (^com.amazonaws.services.cognitosync.model.GetIdentityPoolConfigurationResult [^AbstractAmazonCognitoSync this ^com.amazonaws.services.cognitosync.model.GetIdentityPoolConfigurationRequest request]
    (-> this (.getIdentityPoolConfiguration request))))

(defn list-records
  "Description copied from interface: AmazonCognitoSync

  request - A request for a list of records. - `com.amazonaws.services.cognitosync.model.ListRecordsRequest`

  returns: Result of the ListRecords operation returned by the service. - `com.amazonaws.services.cognitosync.model.ListRecordsResult`"
  (^com.amazonaws.services.cognitosync.model.ListRecordsResult [^AbstractAmazonCognitoSync this ^com.amazonaws.services.cognitosync.model.ListRecordsRequest request]
    (-> this (.listRecords request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonCognitoSync

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonCognitoSync this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn delete-dataset
  "Description copied from interface: AmazonCognitoSync

  request - A request to delete the specific dataset. - `com.amazonaws.services.cognitosync.model.DeleteDatasetRequest`

  returns: Result of the DeleteDataset operation returned by the service. - `com.amazonaws.services.cognitosync.model.DeleteDatasetResult`"
  (^com.amazonaws.services.cognitosync.model.DeleteDatasetResult [^AbstractAmazonCognitoSync this ^com.amazonaws.services.cognitosync.model.DeleteDatasetRequest request]
    (-> this (.deleteDataset request))))

(defn describe-identity-usage
  "Description copied from interface: AmazonCognitoSync

  request - A request for information about the usage of an identity pool. - `com.amazonaws.services.cognitosync.model.DescribeIdentityUsageRequest`

  returns: Result of the DescribeIdentityUsage operation returned by the service. - `com.amazonaws.services.cognitosync.model.DescribeIdentityUsageResult`"
  (^com.amazonaws.services.cognitosync.model.DescribeIdentityUsageResult [^AbstractAmazonCognitoSync this ^com.amazonaws.services.cognitosync.model.DescribeIdentityUsageRequest request]
    (-> this (.describeIdentityUsage request))))

(defn describe-identity-pool-usage
  "Description copied from interface: AmazonCognitoSync

  request - A request for usage information about the identity pool. - `com.amazonaws.services.cognitosync.model.DescribeIdentityPoolUsageRequest`

  returns: Result of the DescribeIdentityPoolUsage operation returned by the service. - `com.amazonaws.services.cognitosync.model.DescribeIdentityPoolUsageResult`"
  (^com.amazonaws.services.cognitosync.model.DescribeIdentityPoolUsageResult [^AbstractAmazonCognitoSync this ^com.amazonaws.services.cognitosync.model.DescribeIdentityPoolUsageRequest request]
    (-> this (.describeIdentityPoolUsage request))))

