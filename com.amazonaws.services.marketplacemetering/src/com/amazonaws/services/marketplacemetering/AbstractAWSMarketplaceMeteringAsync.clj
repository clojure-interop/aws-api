(ns com.amazonaws.services.marketplacemetering.AbstractAWSMarketplaceMeteringAsync
  "Abstract implementation of AWSMarketplaceMeteringAsync. Convenient method forms pass through to the
  corresponding overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.marketplacemetering AbstractAWSMarketplaceMeteringAsync]))

(defn batch-meter-usage-async
  "Description copied from interface: AWSMarketplaceMeteringAsync

  request - A BatchMeterUsageRequest contains UsageRecords, which indicate quantities of usage within your application. - `com.amazonaws.services.marketplacemetering.model.BatchMeterUsageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchMeterUsage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.marketplacemetering.model.BatchMeterUsageResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMarketplaceMeteringAsync this ^com.amazonaws.services.marketplacemetering.model.BatchMeterUsageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchMeterUsageAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMarketplaceMeteringAsync this ^com.amazonaws.services.marketplacemetering.model.BatchMeterUsageRequest request]
    (-> this (.batchMeterUsageAsync request))))

(defn meter-usage-async
  "Description copied from interface: AWSMarketplaceMeteringAsync

  request - `com.amazonaws.services.marketplacemetering.model.MeterUsageRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the MeterUsage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.marketplacemetering.model.MeterUsageResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMarketplaceMeteringAsync this ^com.amazonaws.services.marketplacemetering.model.MeterUsageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.meterUsageAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMarketplaceMeteringAsync this ^com.amazonaws.services.marketplacemetering.model.MeterUsageRequest request]
    (-> this (.meterUsageAsync request))))

(defn register-usage-async
  "Description copied from interface: AWSMarketplaceMeteringAsync

  request - `com.amazonaws.services.marketplacemetering.model.RegisterUsageRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterUsage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.marketplacemetering.model.RegisterUsageResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMarketplaceMeteringAsync this ^com.amazonaws.services.marketplacemetering.model.RegisterUsageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerUsageAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMarketplaceMeteringAsync this ^com.amazonaws.services.marketplacemetering.model.RegisterUsageRequest request]
    (-> this (.registerUsageAsync request))))

(defn resolve-customer-async
  "Description copied from interface: AWSMarketplaceMeteringAsync

  request - Contains input to the ResolveCustomer operation. - `com.amazonaws.services.marketplacemetering.model.ResolveCustomerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResolveCustomer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.marketplacemetering.model.ResolveCustomerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMarketplaceMeteringAsync this ^com.amazonaws.services.marketplacemetering.model.ResolveCustomerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resolveCustomerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMarketplaceMeteringAsync this ^com.amazonaws.services.marketplacemetering.model.ResolveCustomerRequest request]
    (-> this (.resolveCustomerAsync request))))

