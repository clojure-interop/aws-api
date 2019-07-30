(ns com.amazonaws.services.marketplacecommerceanalytics.AWSMarketplaceCommerceAnalyticsAsync
  "Interface for accessing AWS Marketplace Commerce Analytics asynchronously. Each asynchronous method will return a
  Java Future object representing the asynchronous operation; overloads which accept an AsyncHandler can be
  used to receive notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSMarketplaceCommerceAnalyticsAsync instead.


  Provides AWS Marketplace business intelligence data on-demand."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.marketplacecommerceanalytics AWSMarketplaceCommerceAnalyticsAsync]))

(defn generate-data-set-async
  "Given a data set type and data set publication date, asynchronously publishes the requested data set to the
   specified S3 bucket and notifies the specified SNS topic once the data is available. Returns a unique request
   identifier that can be used to correlate requests with notifications from the SNS topic. Data sets will be
   published in comma-separated values (CSV) format with the file name {data_set_type}_YYYY-MM-DD.csv. If a file with
   the same name already exists (e.g. if the same data set is requested twice), the original file will be overwritten
   by the new file. Requires a Role with an attached permissions policy providing Allow permissions for the following
   actions: s3:PutObject, s3:GetBucketLocation, sns:GetTopicAttributes, sns:Publish, iam:GetRolePolicy.

  generate-data-set-request - Container for the parameters to the GenerateDataSet operation. - `com.amazonaws.services.marketplacecommerceanalytics.model.GenerateDataSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GenerateDataSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.marketplacecommerceanalytics.model.GenerateDataSetResult>`"
  (^java.util.concurrent.Future [^AWSMarketplaceCommerceAnalyticsAsync this ^com.amazonaws.services.marketplacecommerceanalytics.model.GenerateDataSetRequest generate-data-set-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.generateDataSetAsync generate-data-set-request async-handler)))
  (^java.util.concurrent.Future [^AWSMarketplaceCommerceAnalyticsAsync this ^com.amazonaws.services.marketplacecommerceanalytics.model.GenerateDataSetRequest generate-data-set-request]
    (-> this (.generateDataSetAsync generate-data-set-request))))

(defn start-support-data-export-async
  "Given a data set type and a from date, asynchronously publishes the requested customer support data to the
   specified S3 bucket and notifies the specified SNS topic once the data is available. Returns a unique request
   identifier that can be used to correlate requests with notifications from the SNS topic. Data sets will be
   published in comma-separated values (CSV) format with the file name {data_set_type}_YYYY-MM-DD'T'HH-mm-ss'Z'.csv.
   If a file with the same name already exists (e.g. if the same data set is requested twice), the original file will
   be overwritten by the new file. Requires a Role with an attached permissions policy providing Allow permissions
   for the following actions: s3:PutObject, s3:GetBucketLocation, sns:GetTopicAttributes, sns:Publish,
   iam:GetRolePolicy.

  start-support-data-export-request - Container for the parameters to the StartSupportDataExport operation. - `com.amazonaws.services.marketplacecommerceanalytics.model.StartSupportDataExportRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartSupportDataExport operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.marketplacecommerceanalytics.model.StartSupportDataExportResult>`"
  (^java.util.concurrent.Future [^AWSMarketplaceCommerceAnalyticsAsync this ^com.amazonaws.services.marketplacecommerceanalytics.model.StartSupportDataExportRequest start-support-data-export-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startSupportDataExportAsync start-support-data-export-request async-handler)))
  (^java.util.concurrent.Future [^AWSMarketplaceCommerceAnalyticsAsync this ^com.amazonaws.services.marketplacecommerceanalytics.model.StartSupportDataExportRequest start-support-data-export-request]
    (-> this (.startSupportDataExportAsync start-support-data-export-request))))

