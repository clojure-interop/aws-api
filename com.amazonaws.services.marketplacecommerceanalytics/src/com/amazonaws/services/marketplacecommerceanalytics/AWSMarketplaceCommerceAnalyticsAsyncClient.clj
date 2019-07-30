(ns com.amazonaws.services.marketplacecommerceanalytics.AWSMarketplaceCommerceAnalyticsAsyncClient
  "Client for accessing AWS Marketplace Commerce Analytics asynchronously. Each asynchronous method will return a Java
  Future object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to
  receive notification when an asynchronous operation completes.

  Provides AWS Marketplace business intelligence data on-demand."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.marketplacecommerceanalytics AWSMarketplaceCommerceAnalyticsAsyncClient]))

(defn ->aws-marketplace-commerce-analytics-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider)
               and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration)
               and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AWSMarketplaceCommerceAnalyticsAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AWSMarketplaceCommerceAnalyticsAsyncClient aws-credentials client-configuration executor-service))
  (^AWSMarketplaceCommerceAnalyticsAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AWSMarketplaceCommerceAnalyticsAsyncClient aws-credentials executor-service))
  (^AWSMarketplaceCommerceAnalyticsAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSMarketplaceCommerceAnalyticsAsyncClient client-configuration))
  (^AWSMarketplaceCommerceAnalyticsAsyncClient []
    (new AWSMarketplaceCommerceAnalyticsAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.marketplacecommerceanalytics.AWSMarketplaceCommerceAnalyticsAsyncClientBuilder`"
  (^com.amazonaws.services.marketplacecommerceanalytics.AWSMarketplaceCommerceAnalyticsAsyncClientBuilder []
    (AWSMarketplaceCommerceAnalyticsAsyncClient/asyncBuilder )))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSMarketplaceCommerceAnalyticsAsyncClient this]
    (-> this (.getExecutorService))))

(defn generate-data-set-async
  "Description copied from interface: AWSMarketplaceCommerceAnalyticsAsync

  request - Container for the parameters to the GenerateDataSet operation. - `com.amazonaws.services.marketplacecommerceanalytics.model.GenerateDataSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GenerateDataSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.marketplacecommerceanalytics.model.GenerateDataSetResult>`"
  (^java.util.concurrent.Future [^AWSMarketplaceCommerceAnalyticsAsyncClient this ^com.amazonaws.services.marketplacecommerceanalytics.model.GenerateDataSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.generateDataSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMarketplaceCommerceAnalyticsAsyncClient this ^com.amazonaws.services.marketplacecommerceanalytics.model.GenerateDataSetRequest request]
    (-> this (.generateDataSetAsync request))))

(defn start-support-data-export-async
  "Description copied from interface: AWSMarketplaceCommerceAnalyticsAsync

  request - Container for the parameters to the StartSupportDataExport operation. - `com.amazonaws.services.marketplacecommerceanalytics.model.StartSupportDataExportRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartSupportDataExport operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.marketplacecommerceanalytics.model.StartSupportDataExportResult>`"
  (^java.util.concurrent.Future [^AWSMarketplaceCommerceAnalyticsAsyncClient this ^com.amazonaws.services.marketplacecommerceanalytics.model.StartSupportDataExportRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startSupportDataExportAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMarketplaceCommerceAnalyticsAsyncClient this ^com.amazonaws.services.marketplacecommerceanalytics.model.StartSupportDataExportRequest request]
    (-> this (.startSupportDataExportAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSMarketplaceCommerceAnalyticsAsyncClient this]
    (-> this (.shutdown))))

