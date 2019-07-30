(ns com.amazonaws.services.marketplacemetering.AWSMarketplaceMeteringAsync
  "Interface for accessing AWSMarketplace Metering asynchronously. Each asynchronous method will return a Java Future
  object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSMarketplaceMeteringAsync instead.


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
  (:import [com.amazonaws.services.marketplacemetering AWSMarketplaceMeteringAsync]))

(defn batch-meter-usage-async
  "BatchMeterUsage is called from a SaaS application listed on the AWS Marketplace to post metering records for a
   set of customers.


   For identical requests, the API is idempotent; requests can be retried with the same records or a subset of the
   input records.


   Every request to BatchMeterUsage is for one product. If you need to meter usage for multiple products, you must
   make multiple calls to BatchMeterUsage.


   BatchMeterUsage can process up to 25 UsageRecords at a time.

  batch-meter-usage-request - A BatchMeterUsageRequest contains UsageRecords, which indicate quantities of usage within your application. - `com.amazonaws.services.marketplacemetering.model.BatchMeterUsageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchMeterUsage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.marketplacemetering.model.BatchMeterUsageResult>`"
  (^java.util.concurrent.Future [^AWSMarketplaceMeteringAsync this ^com.amazonaws.services.marketplacemetering.model.BatchMeterUsageRequest batch-meter-usage-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchMeterUsageAsync batch-meter-usage-request async-handler)))
  (^java.util.concurrent.Future [^AWSMarketplaceMeteringAsync this ^com.amazonaws.services.marketplacemetering.model.BatchMeterUsageRequest batch-meter-usage-request]
    (-> this (.batchMeterUsageAsync batch-meter-usage-request))))

(defn meter-usage-async
  "API to emit metering records. For identical requests, the API is idempotent. It simply returns the metering
   record ID.


   MeterUsage is authenticated on the buyer's AWS account, generally when running from an EC2 instance on the AWS
   Marketplace.

  meter-usage-request - `com.amazonaws.services.marketplacemetering.model.MeterUsageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the MeterUsage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.marketplacemetering.model.MeterUsageResult>`"
  (^java.util.concurrent.Future [^AWSMarketplaceMeteringAsync this ^com.amazonaws.services.marketplacemetering.model.MeterUsageRequest meter-usage-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.meterUsageAsync meter-usage-request async-handler)))
  (^java.util.concurrent.Future [^AWSMarketplaceMeteringAsync this ^com.amazonaws.services.marketplacemetering.model.MeterUsageRequest meter-usage-request]
    (-> this (.meterUsageAsync meter-usage-request))))

(defn register-usage-async
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

  register-usage-request - `com.amazonaws.services.marketplacemetering.model.RegisterUsageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterUsage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.marketplacemetering.model.RegisterUsageResult>`"
  (^java.util.concurrent.Future [^AWSMarketplaceMeteringAsync this ^com.amazonaws.services.marketplacemetering.model.RegisterUsageRequest register-usage-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerUsageAsync register-usage-request async-handler)))
  (^java.util.concurrent.Future [^AWSMarketplaceMeteringAsync this ^com.amazonaws.services.marketplacemetering.model.RegisterUsageRequest register-usage-request]
    (-> this (.registerUsageAsync register-usage-request))))

(defn resolve-customer-async
  "ResolveCustomer is called by a SaaS application during the registration process. When a buyer visits your website
   during the registration process, the buyer submits a registration token through their browser. The registration
   token is resolved through this API to obtain a CustomerIdentifier and product code.

  resolve-customer-request - Contains input to the ResolveCustomer operation. - `com.amazonaws.services.marketplacemetering.model.ResolveCustomerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResolveCustomer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.marketplacemetering.model.ResolveCustomerResult>`"
  (^java.util.concurrent.Future [^AWSMarketplaceMeteringAsync this ^com.amazonaws.services.marketplacemetering.model.ResolveCustomerRequest resolve-customer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resolveCustomerAsync resolve-customer-request async-handler)))
  (^java.util.concurrent.Future [^AWSMarketplaceMeteringAsync this ^com.amazonaws.services.marketplacemetering.model.ResolveCustomerRequest resolve-customer-request]
    (-> this (.resolveCustomerAsync resolve-customer-request))))

