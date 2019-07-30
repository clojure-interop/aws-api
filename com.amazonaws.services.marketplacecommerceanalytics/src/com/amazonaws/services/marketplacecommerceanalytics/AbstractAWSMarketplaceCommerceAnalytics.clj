(ns com.amazonaws.services.marketplacecommerceanalytics.AbstractAWSMarketplaceCommerceAnalytics
  "Abstract implementation of AWSMarketplaceCommerceAnalytics. Convenient method forms pass through to the
  corresponding overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.marketplacecommerceanalytics AbstractAWSMarketplaceCommerceAnalytics]))

(defn set-endpoint
  "Description copied from interface: AWSMarketplaceCommerceAnalytics

  endpoint - The endpoint (ex: \"marketplacecommerceanalytics.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://marketplacecommerceanalytics.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAWSMarketplaceCommerceAnalytics this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn set-region
  "Description copied from interface: AWSMarketplaceCommerceAnalytics

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAWSMarketplaceCommerceAnalytics this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn generate-data-set
  "Description copied from interface: AWSMarketplaceCommerceAnalytics

  request - Container for the parameters to the GenerateDataSet operation. - `com.amazonaws.services.marketplacecommerceanalytics.model.GenerateDataSetRequest`

  returns: Result of the GenerateDataSet operation returned by the service. - `com.amazonaws.services.marketplacecommerceanalytics.model.GenerateDataSetResult`"
  (^com.amazonaws.services.marketplacecommerceanalytics.model.GenerateDataSetResult [^AbstractAWSMarketplaceCommerceAnalytics this ^com.amazonaws.services.marketplacecommerceanalytics.model.GenerateDataSetRequest request]
    (-> this (.generateDataSet request))))

(defn start-support-data-export
  "Description copied from interface: AWSMarketplaceCommerceAnalytics

  request - Container for the parameters to the StartSupportDataExport operation. - `com.amazonaws.services.marketplacecommerceanalytics.model.StartSupportDataExportRequest`

  returns: Result of the StartSupportDataExport operation returned by the service. - `com.amazonaws.services.marketplacecommerceanalytics.model.StartSupportDataExportResult`"
  (^com.amazonaws.services.marketplacecommerceanalytics.model.StartSupportDataExportResult [^AbstractAWSMarketplaceCommerceAnalytics this ^com.amazonaws.services.marketplacecommerceanalytics.model.StartSupportDataExportRequest request]
    (-> this (.startSupportDataExport request))))

(defn shutdown
  "Description copied from interface: AWSMarketplaceCommerceAnalytics"
  ([^AbstractAWSMarketplaceCommerceAnalytics this]
    (-> this (.shutdown))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSMarketplaceCommerceAnalytics

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSMarketplaceCommerceAnalytics this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

