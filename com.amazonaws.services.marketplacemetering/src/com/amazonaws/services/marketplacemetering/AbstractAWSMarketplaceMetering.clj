(ns com.amazonaws.services.marketplacemetering.AbstractAWSMarketplaceMetering
  "Abstract implementation of AWSMarketplaceMetering. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.marketplacemetering AbstractAWSMarketplaceMetering]))

(defn set-endpoint
  "Description copied from interface: AWSMarketplaceMetering

  endpoint - The endpoint (ex: \"metering.marketplace.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://metering.marketplace.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAWSMarketplaceMetering this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn set-region
  "Description copied from interface: AWSMarketplaceMetering

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAWSMarketplaceMetering this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn batch-meter-usage
  "Description copied from interface: AWSMarketplaceMetering

  request - A BatchMeterUsageRequest contains UsageRecords, which indicate quantities of usage within your application. - `com.amazonaws.services.marketplacemetering.model.BatchMeterUsageRequest`

  returns: Result of the BatchMeterUsage operation returned by the service. - `com.amazonaws.services.marketplacemetering.model.BatchMeterUsageResult`"
  (^com.amazonaws.services.marketplacemetering.model.BatchMeterUsageResult [^AbstractAWSMarketplaceMetering this ^com.amazonaws.services.marketplacemetering.model.BatchMeterUsageRequest request]
    (-> this (.batchMeterUsage request))))

(defn meter-usage
  "Description copied from interface: AWSMarketplaceMetering

  request - `com.amazonaws.services.marketplacemetering.model.MeterUsageRequest`

  returns: Result of the MeterUsage operation returned by the service. - `com.amazonaws.services.marketplacemetering.model.MeterUsageResult`"
  (^com.amazonaws.services.marketplacemetering.model.MeterUsageResult [^AbstractAWSMarketplaceMetering this ^com.amazonaws.services.marketplacemetering.model.MeterUsageRequest request]
    (-> this (.meterUsage request))))

(defn register-usage
  "Description copied from interface: AWSMarketplaceMetering

  request - `com.amazonaws.services.marketplacemetering.model.RegisterUsageRequest`

  returns: Result of the RegisterUsage operation returned by the service. - `com.amazonaws.services.marketplacemetering.model.RegisterUsageResult`"
  (^com.amazonaws.services.marketplacemetering.model.RegisterUsageResult [^AbstractAWSMarketplaceMetering this ^com.amazonaws.services.marketplacemetering.model.RegisterUsageRequest request]
    (-> this (.registerUsage request))))

(defn resolve-customer
  "Description copied from interface: AWSMarketplaceMetering

  request - Contains input to the ResolveCustomer operation. - `com.amazonaws.services.marketplacemetering.model.ResolveCustomerRequest`

  returns: Result of the ResolveCustomer operation returned by the service. - `com.amazonaws.services.marketplacemetering.model.ResolveCustomerResult`"
  (^com.amazonaws.services.marketplacemetering.model.ResolveCustomerResult [^AbstractAWSMarketplaceMetering this ^com.amazonaws.services.marketplacemetering.model.ResolveCustomerRequest request]
    (-> this (.resolveCustomer request))))

(defn shutdown
  "Description copied from interface: AWSMarketplaceMetering"
  ([^AbstractAWSMarketplaceMetering this]
    (-> this (.shutdown))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSMarketplaceMetering

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSMarketplaceMetering this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

