(ns com.amazonaws.services.marketplaceentitlement.AWSMarketplaceEntitlementAsyncClient
  "Client for accessing AWS Marketplace Entitlement Service asynchronously. Each asynchronous method will return a Java
  Future object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to
  receive notification when an asynchronous operation completes.

  AWS Marketplace Entitlement Service

  This reference provides descriptions of the AWS Marketplace Entitlement Service API.


  AWS Marketplace Entitlement Service is used to determine the entitlement of a customer to a given product. An
  entitlement represents capacity in a product owned by the customer. For example, a customer might own some number of
  users or seats in an SaaS application or some amount of data capacity in a multi-tenant database.


  Getting Entitlement Records




  GetEntitlements- Gets the entitlements for a Marketplace product."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.marketplaceentitlement AWSMarketplaceEntitlementAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.marketplaceentitlement.AWSMarketplaceEntitlementAsyncClientBuilder`"
  (^com.amazonaws.services.marketplaceentitlement.AWSMarketplaceEntitlementAsyncClientBuilder []
    (AWSMarketplaceEntitlementAsyncClient/asyncBuilder )))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSMarketplaceEntitlementAsyncClient this]
    (-> this (.getExecutorService))))

(defn get-entitlements-async
  "Description copied from interface: AWSMarketplaceEntitlementAsync

  request - The GetEntitlementsRequest contains parameters for the GetEntitlements operation. - `com.amazonaws.services.marketplaceentitlement.model.GetEntitlementsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetEntitlements operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.marketplaceentitlement.model.GetEntitlementsResult>`"
  (^java.util.concurrent.Future [^AWSMarketplaceEntitlementAsyncClient this ^com.amazonaws.services.marketplaceentitlement.model.GetEntitlementsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getEntitlementsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMarketplaceEntitlementAsyncClient this ^com.amazonaws.services.marketplaceentitlement.model.GetEntitlementsRequest request]
    (-> this (.getEntitlementsAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSMarketplaceEntitlementAsyncClient this]
    (-> this (.shutdown))))

