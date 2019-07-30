(ns com.amazonaws.services.marketplacemetering.AWSMarketplaceMeteringAsyncClient
  "Client for accessing AWSMarketplace Metering asynchronously. Each asynchronous method will return a Java Future
  object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  AWS Marketplace Metering Service

  This reference provides descriptions of the low-level AWS Marketplace Metering Service API.


  AWS Marketplace sellers can use this API to submit usage data for custom usage dimensions.


  Submitting Metering Records




  MeterUsage- Submits the metering record for a Marketplace product. MeterUsage is called from an EC2 instance.




  BatchMeterUsage- Submits the metering record for a set of customers. BatchMeterUsage is called from a
  software-as-a-service (SaaS) application.




  Accepting New Customers




  ResolveCustomer- Called by a SaaS application during the registration process. When a buyer visits your
  website during the registration process, the buyer submits a Registration Token through the browser. The Registration
  Token is resolved through this API to obtain a CustomerIdentifier and Product Code.




  Entitlement and Metering for Paid Container Products




  Paid container software products sold through AWS Marketplace must integrate with the AWS Marketplace Metering
  Service and call the RegisterUsage operation for software entitlement and metering. Calling RegisterUsage from
  containers running outside of Amazon Elastic Container Service (Amazon ECR) isn't supported. Free and BYOL products
  for ECS aren't required to call RegisterUsage, but you can do so if you want to receive usage data in your seller
  reports. For more information on using the RegisterUsage operation, see Container-Based
  Products.




  BatchMeterUsage API calls are captured by AWS CloudTrail. You can use Cloudtrail to verify that the SaaS metering
  records that you sent are accurate by searching for records with the eventName of BatchMeterUsage. You can also use
  CloudTrail to audit records over time. For more information, see the  AWS CloudTrail User
  Guide ."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.marketplacemetering AWSMarketplaceMeteringAsyncClient]))

(defn ->aws-marketplace-metering-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AWSMarketplaceMeteringAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AWSMarketplaceMeteringAsyncClient aws-credentials client-configuration executor-service))
  (^AWSMarketplaceMeteringAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AWSMarketplaceMeteringAsyncClient aws-credentials executor-service))
  (^AWSMarketplaceMeteringAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSMarketplaceMeteringAsyncClient client-configuration))
  (^AWSMarketplaceMeteringAsyncClient []
    (new AWSMarketplaceMeteringAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.marketplacemetering.AWSMarketplaceMeteringAsyncClientBuilder`"
  (^com.amazonaws.services.marketplacemetering.AWSMarketplaceMeteringAsyncClientBuilder []
    (AWSMarketplaceMeteringAsyncClient/asyncBuilder )))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSMarketplaceMeteringAsyncClient this]
    (-> this (.getExecutorService))))

(defn batch-meter-usage-async
  "Description copied from interface: AWSMarketplaceMeteringAsync

  request - A BatchMeterUsageRequest contains UsageRecords, which indicate quantities of usage within your application. - `com.amazonaws.services.marketplacemetering.model.BatchMeterUsageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchMeterUsage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.marketplacemetering.model.BatchMeterUsageResult>`"
  (^java.util.concurrent.Future [^AWSMarketplaceMeteringAsyncClient this ^com.amazonaws.services.marketplacemetering.model.BatchMeterUsageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchMeterUsageAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMarketplaceMeteringAsyncClient this ^com.amazonaws.services.marketplacemetering.model.BatchMeterUsageRequest request]
    (-> this (.batchMeterUsageAsync request))))

(defn meter-usage-async
  "Description copied from interface: AWSMarketplaceMeteringAsync

  request - `com.amazonaws.services.marketplacemetering.model.MeterUsageRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the MeterUsage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.marketplacemetering.model.MeterUsageResult>`"
  (^java.util.concurrent.Future [^AWSMarketplaceMeteringAsyncClient this ^com.amazonaws.services.marketplacemetering.model.MeterUsageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.meterUsageAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMarketplaceMeteringAsyncClient this ^com.amazonaws.services.marketplacemetering.model.MeterUsageRequest request]
    (-> this (.meterUsageAsync request))))

(defn register-usage-async
  "Description copied from interface: AWSMarketplaceMeteringAsync

  request - `com.amazonaws.services.marketplacemetering.model.RegisterUsageRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterUsage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.marketplacemetering.model.RegisterUsageResult>`"
  (^java.util.concurrent.Future [^AWSMarketplaceMeteringAsyncClient this ^com.amazonaws.services.marketplacemetering.model.RegisterUsageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerUsageAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMarketplaceMeteringAsyncClient this ^com.amazonaws.services.marketplacemetering.model.RegisterUsageRequest request]
    (-> this (.registerUsageAsync request))))

(defn resolve-customer-async
  "Description copied from interface: AWSMarketplaceMeteringAsync

  request - Contains input to the ResolveCustomer operation. - `com.amazonaws.services.marketplacemetering.model.ResolveCustomerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResolveCustomer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.marketplacemetering.model.ResolveCustomerResult>`"
  (^java.util.concurrent.Future [^AWSMarketplaceMeteringAsyncClient this ^com.amazonaws.services.marketplacemetering.model.ResolveCustomerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resolveCustomerAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMarketplaceMeteringAsyncClient this ^com.amazonaws.services.marketplacemetering.model.ResolveCustomerRequest request]
    (-> this (.resolveCustomerAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSMarketplaceMeteringAsyncClient this]
    (-> this (.shutdown))))

