(ns com.amazonaws.services.marketplacecommerceanalytics.AbstractAWSMarketplaceCommerceAnalyticsAsync
  "Abstract implementation of AWSMarketplaceCommerceAnalyticsAsync. Convenient method forms pass through to the
  corresponding overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.marketplacecommerceanalytics AbstractAWSMarketplaceCommerceAnalyticsAsync]))

(defn generate-data-set-async
  "Description copied from interface: AWSMarketplaceCommerceAnalyticsAsync

  request - Container for the parameters to the GenerateDataSet operation. - `com.amazonaws.services.marketplacecommerceanalytics.model.GenerateDataSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GenerateDataSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.marketplacecommerceanalytics.model.GenerateDataSetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMarketplaceCommerceAnalyticsAsync this ^com.amazonaws.services.marketplacecommerceanalytics.model.GenerateDataSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.generateDataSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMarketplaceCommerceAnalyticsAsync this ^com.amazonaws.services.marketplacecommerceanalytics.model.GenerateDataSetRequest request]
    (-> this (.generateDataSetAsync request))))

(defn start-support-data-export-async
  "Description copied from interface: AWSMarketplaceCommerceAnalyticsAsync

  request - Container for the parameters to the StartSupportDataExport operation. - `com.amazonaws.services.marketplacecommerceanalytics.model.StartSupportDataExportRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartSupportDataExport operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.marketplacecommerceanalytics.model.StartSupportDataExportResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMarketplaceCommerceAnalyticsAsync this ^com.amazonaws.services.marketplacecommerceanalytics.model.StartSupportDataExportRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startSupportDataExportAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMarketplaceCommerceAnalyticsAsync this ^com.amazonaws.services.marketplacecommerceanalytics.model.StartSupportDataExportRequest request]
    (-> this (.startSupportDataExportAsync request))))

