(ns com.amazonaws.services.marketplacecommerceanalytics.AWSMarketplaceCommerceAnalyticsClient
  "Client for accessing AWS Marketplace Commerce Analytics. All service calls made using this client are blocking, and
  will not return until the service call completes.

  Provides AWS Marketplace business intelligence data on-demand."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.marketplacecommerceanalytics AWSMarketplaceCommerceAnalyticsClient]))

(defn ->aws-marketplace-commerce-analytics-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to AWS Marketplace Commerce Analytics (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AWSMarketplaceCommerceAnalyticsClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AWSMarketplaceCommerceAnalyticsClient aws-credentials-provider client-configuration request-metric-collector))
  (^AWSMarketplaceCommerceAnalyticsClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSMarketplaceCommerceAnalyticsClient aws-credentials client-configuration))
  (^AWSMarketplaceCommerceAnalyticsClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSMarketplaceCommerceAnalyticsClient client-configuration))
  (^AWSMarketplaceCommerceAnalyticsClient []
    (new AWSMarketplaceCommerceAnalyticsClient )))

(defn *builder
  "returns: `com.amazonaws.services.marketplacecommerceanalytics.AWSMarketplaceCommerceAnalyticsClientBuilder`"
  (^com.amazonaws.services.marketplacecommerceanalytics.AWSMarketplaceCommerceAnalyticsClientBuilder []
    (AWSMarketplaceCommerceAnalyticsClient/builder )))

(defn generate-data-set
  "Given a data set type and data set publication date, asynchronously publishes the requested data set to the
   specified S3 bucket and notifies the specified SNS topic once the data is available. Returns a unique request
   identifier that can be used to correlate requests with notifications from the SNS topic. Data sets will be
   published in comma-separated values (CSV) format with the file name {data_set_type}_YYYY-MM-DD.csv. If a file with
   the same name already exists (e.g. if the same data set is requested twice), the original file will be overwritten
   by the new file. Requires a Role with an attached permissions policy providing Allow permissions for the following
   actions: s3:PutObject, s3:GetBucketLocation, sns:GetTopicAttributes, sns:Publish, iam:GetRolePolicy.

  request - `com.amazonaws.services.marketplacecommerceanalytics.model.GenerateDataSetRequest`

  returns: Result of the GenerateDataSet operation returned by the service. - `com.amazonaws.services.marketplacecommerceanalytics.model.GenerateDataSetResult`

  throws: com.amazonaws.services.marketplacecommerceanalytics.model.MarketplaceCommerceAnalyticsException - This exception is thrown when an internal service error occurs."
  (^com.amazonaws.services.marketplacecommerceanalytics.model.GenerateDataSetResult [^AWSMarketplaceCommerceAnalyticsClient this ^com.amazonaws.services.marketplacecommerceanalytics.model.GenerateDataSetRequest request]
    (-> this (.generateDataSet request))))

(defn start-support-data-export
  "Given a data set type and a from date, asynchronously publishes the requested customer support data to the
   specified S3 bucket and notifies the specified SNS topic once the data is available. Returns a unique request
   identifier that can be used to correlate requests with notifications from the SNS topic. Data sets will be
   published in comma-separated values (CSV) format with the file name {data_set_type}_YYYY-MM-DD'T'HH-mm-ss'Z'.csv.
   If a file with the same name already exists (e.g. if the same data set is requested twice), the original file will
   be overwritten by the new file. Requires a Role with an attached permissions policy providing Allow permissions
   for the following actions: s3:PutObject, s3:GetBucketLocation, sns:GetTopicAttributes, sns:Publish,
   iam:GetRolePolicy.

  request - `com.amazonaws.services.marketplacecommerceanalytics.model.StartSupportDataExportRequest`

  returns: Result of the StartSupportDataExport operation returned by the service. - `com.amazonaws.services.marketplacecommerceanalytics.model.StartSupportDataExportResult`

  throws: com.amazonaws.services.marketplacecommerceanalytics.model.MarketplaceCommerceAnalyticsException - This exception is thrown when an internal service error occurs."
  (^com.amazonaws.services.marketplacecommerceanalytics.model.StartSupportDataExportResult [^AWSMarketplaceCommerceAnalyticsClient this ^com.amazonaws.services.marketplacecommerceanalytics.model.StartSupportDataExportRequest request]
    (-> this (.startSupportDataExport request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSMarketplaceCommerceAnalyticsClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

