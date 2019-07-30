(ns com.amazonaws.services.marketplacecommerceanalytics.AWSMarketplaceCommerceAnalytics
  "Interface for accessing AWS Marketplace Commerce Analytics.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSMarketplaceCommerceAnalytics instead.


  Provides AWS Marketplace business intelligence data on-demand."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.marketplacecommerceanalytics AWSMarketplaceCommerceAnalytics]))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"marketplacecommerceanalytics.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://marketplacecommerceanalytics.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AWSMarketplaceCommerceAnalytics this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AWSMarketplaceCommerceAnalytics this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn generate-data-set
  "Given a data set type and data set publication date, asynchronously publishes the requested data set to the
   specified S3 bucket and notifies the specified SNS topic once the data is available. Returns a unique request
   identifier that can be used to correlate requests with notifications from the SNS topic. Data sets will be
   published in comma-separated values (CSV) format with the file name {data_set_type}_YYYY-MM-DD.csv. If a file with
   the same name already exists (e.g. if the same data set is requested twice), the original file will be overwritten
   by the new file. Requires a Role with an attached permissions policy providing Allow permissions for the following
   actions: s3:PutObject, s3:GetBucketLocation, sns:GetTopicAttributes, sns:Publish, iam:GetRolePolicy.

  generate-data-set-request - Container for the parameters to the GenerateDataSet operation. - `com.amazonaws.services.marketplacecommerceanalytics.model.GenerateDataSetRequest`

  returns: Result of the GenerateDataSet operation returned by the service. - `com.amazonaws.services.marketplacecommerceanalytics.model.GenerateDataSetResult`

  throws: com.amazonaws.services.marketplacecommerceanalytics.model.MarketplaceCommerceAnalyticsException - This exception is thrown when an internal service error occurs."
  (^com.amazonaws.services.marketplacecommerceanalytics.model.GenerateDataSetResult [^AWSMarketplaceCommerceAnalytics this ^com.amazonaws.services.marketplacecommerceanalytics.model.GenerateDataSetRequest generate-data-set-request]
    (-> this (.generateDataSet generate-data-set-request))))

(defn start-support-data-export
  "Given a data set type and a from date, asynchronously publishes the requested customer support data to the
   specified S3 bucket and notifies the specified SNS topic once the data is available. Returns a unique request
   identifier that can be used to correlate requests with notifications from the SNS topic. Data sets will be
   published in comma-separated values (CSV) format with the file name {data_set_type}_YYYY-MM-DD'T'HH-mm-ss'Z'.csv.
   If a file with the same name already exists (e.g. if the same data set is requested twice), the original file will
   be overwritten by the new file. Requires a Role with an attached permissions policy providing Allow permissions
   for the following actions: s3:PutObject, s3:GetBucketLocation, sns:GetTopicAttributes, sns:Publish,
   iam:GetRolePolicy.

  start-support-data-export-request - Container for the parameters to the StartSupportDataExport operation. - `com.amazonaws.services.marketplacecommerceanalytics.model.StartSupportDataExportRequest`

  returns: Result of the StartSupportDataExport operation returned by the service. - `com.amazonaws.services.marketplacecommerceanalytics.model.StartSupportDataExportResult`

  throws: com.amazonaws.services.marketplacecommerceanalytics.model.MarketplaceCommerceAnalyticsException - This exception is thrown when an internal service error occurs."
  (^com.amazonaws.services.marketplacecommerceanalytics.model.StartSupportDataExportResult [^AWSMarketplaceCommerceAnalytics this ^com.amazonaws.services.marketplacecommerceanalytics.model.StartSupportDataExportRequest start-support-data-export-request]
    (-> this (.startSupportDataExport start-support-data-export-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSMarketplaceCommerceAnalytics this]
    (-> this (.shutdown))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSMarketplaceCommerceAnalytics this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

