(ns com.amazonaws.services.marketplacemetering.AWSMarketplaceMeteringClient
  "Client for accessing AWSMarketplace Metering. All service calls made using this client are blocking, and will not
  return until the service call completes.

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
  (:import [com.amazonaws.services.marketplacemetering AWSMarketplaceMeteringClient]))

(defn ->aws-marketplace-metering-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to AWSMarketplace Metering (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AWSMarketplaceMeteringClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AWSMarketplaceMeteringClient aws-credentials-provider client-configuration request-metric-collector))
  (^AWSMarketplaceMeteringClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSMarketplaceMeteringClient aws-credentials client-configuration))
  (^AWSMarketplaceMeteringClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSMarketplaceMeteringClient client-configuration))
  (^AWSMarketplaceMeteringClient []
    (new AWSMarketplaceMeteringClient )))

(defn *builder
  "returns: `com.amazonaws.services.marketplacemetering.AWSMarketplaceMeteringClientBuilder`"
  (^com.amazonaws.services.marketplacemetering.AWSMarketplaceMeteringClientBuilder []
    (AWSMarketplaceMeteringClient/builder )))

(defn batch-meter-usage
  "BatchMeterUsage is called from a SaaS application listed on the AWS Marketplace to post metering records for a
   set of customers.


   For identical requests, the API is idempotent; requests can be retried with the same records or a subset of the
   input records.


   Every request to BatchMeterUsage is for one product. If you need to meter usage for multiple products, you must
   make multiple calls to BatchMeterUsage.


   BatchMeterUsage can process up to 25 UsageRecords at a time.

  request - `com.amazonaws.services.marketplacemetering.model.BatchMeterUsageRequest`

  returns: Result of the BatchMeterUsage operation returned by the service. - `com.amazonaws.services.marketplacemetering.model.BatchMeterUsageResult`

  throws: com.amazonaws.services.marketplacemetering.model.InternalServiceErrorException - An internal error has occurred. Retry your request. If the problem persists, post a message with details on the AWS forums."
  (^com.amazonaws.services.marketplacemetering.model.BatchMeterUsageResult [^AWSMarketplaceMeteringClient this ^com.amazonaws.services.marketplacemetering.model.BatchMeterUsageRequest request]
    (-> this (.batchMeterUsage request))))

(defn meter-usage
  "API to emit metering records. For identical requests, the API is idempotent. It simply returns the metering
   record ID.


   MeterUsage is authenticated on the buyer's AWS account, generally when running from an EC2 instance on the AWS
   Marketplace.

  request - `com.amazonaws.services.marketplacemetering.model.MeterUsageRequest`

  returns: Result of the MeterUsage operation returned by the service. - `com.amazonaws.services.marketplacemetering.model.MeterUsageResult`

  throws: com.amazonaws.services.marketplacemetering.model.InternalServiceErrorException - An internal error has occurred. Retry your request. If the problem persists, post a message with details on the AWS forums."
  (^com.amazonaws.services.marketplacemetering.model.MeterUsageResult [^AWSMarketplaceMeteringClient this ^com.amazonaws.services.marketplacemetering.model.MeterUsageRequest request]
    (-> this (.meterUsage request))))

(defn register-usage
  "Paid container software products sold through AWS Marketplace must integrate with the AWS Marketplace Metering
   Service and call the RegisterUsage operation for software entitlement and metering. Calling RegisterUsage from
   containers running outside of ECS is not currently supported. Free and BYOL products for ECS aren't required to
   call RegisterUsage, but you may choose to do so if you would like to receive usage data in your seller reports.
   The sections below explain the behavior of RegisterUsage. RegisterUsage performs two primary functions: metering
   and entitlement.




   Entitlement: RegisterUsage allows you to verify that the customer running your paid software is subscribed
   to your product on AWS Marketplace, enabling you to guard against unauthorized use. Your container image that
   integrates with RegisterUsage is only required to guard against unauthorized use at container startup, as such a
   CustomerNotSubscribedException/PlatformNotSupportedException will only be thrown on the initial call to
   RegisterUsage. Subsequent calls from the same Amazon ECS task instance (e.g. task-id) will not throw a
   CustomerNotSubscribedException, even if the customer unsubscribes while the Amazon ECS task is still running.




   Metering: RegisterUsage meters software use per ECS task, per hour, with usage prorated to the second. A
   minimum of 1 minute of usage applies to tasks that are short lived. For example, if a customer has a 10 node ECS
   cluster and creates an ECS service configured as a Daemon Set, then ECS will launch a task on all 10 cluster
   nodes and the customer will be charged: (10 * hourly_rate). Metering for software use is automatically handled by
   the AWS Marketplace Metering Control Plane -- your software is not required to perform any metering specific
   actions, other than call RegisterUsage once for metering of software use to commence. The AWS Marketplace
   Metering Control Plane will also continue to bill customers for running ECS tasks, regardless of the customers
   subscription state, removing the need for your software to perform entitlement checks at runtime.

  request - `com.amazonaws.services.marketplacemetering.model.RegisterUsageRequest`

  returns: Result of the RegisterUsage operation returned by the service. - `com.amazonaws.services.marketplacemetering.model.RegisterUsageResult`

  throws: com.amazonaws.services.marketplacemetering.model.InvalidProductCodeException - The product code passed does not match the product code used for publishing the product."
  (^com.amazonaws.services.marketplacemetering.model.RegisterUsageResult [^AWSMarketplaceMeteringClient this ^com.amazonaws.services.marketplacemetering.model.RegisterUsageRequest request]
    (-> this (.registerUsage request))))

(defn resolve-customer
  "ResolveCustomer is called by a SaaS application during the registration process. When a buyer visits your website
   during the registration process, the buyer submits a registration token through their browser. The registration
   token is resolved through this API to obtain a CustomerIdentifier and product code.

  request - `com.amazonaws.services.marketplacemetering.model.ResolveCustomerRequest`

  returns: Result of the ResolveCustomer operation returned by the service. - `com.amazonaws.services.marketplacemetering.model.ResolveCustomerResult`

  throws: com.amazonaws.services.marketplacemetering.model.InvalidTokenException - Registration token is invalid."
  (^com.amazonaws.services.marketplacemetering.model.ResolveCustomerResult [^AWSMarketplaceMeteringClient this ^com.amazonaws.services.marketplacemetering.model.ResolveCustomerRequest request]
    (-> this (.resolveCustomer request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSMarketplaceMeteringClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

