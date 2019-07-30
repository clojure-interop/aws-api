(ns com.amazonaws.services.marketplaceentitlement.AWSMarketplaceEntitlementAsync
  "Interface for accessing AWS Marketplace Entitlement Service asynchronously. Each asynchronous method will return a
  Java Future object representing the asynchronous operation; overloads which accept an AsyncHandler can be
  used to receive notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSMarketplaceEntitlementAsync instead.


  AWS Marketplace Entitlement Service

  This reference provides descriptions of the AWS Marketplace Entitlement Service API.


  AWS Marketplace Entitlement Service is used to determine the entitlement of a customer to a given product. An
  entitlement represents capacity in a product owned by the customer. For example, a customer might own some number of
  users or seats in an SaaS application or some amount of data capacity in a multi-tenant database.


  Getting Entitlement Records




  GetEntitlements- Gets the entitlements for a Marketplace product."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.marketplaceentitlement AWSMarketplaceEntitlementAsync]))

(defn get-entitlements-async
  "GetEntitlements retrieves entitlement values for a given product. The results can be filtered based on customer
   identifier or product dimensions.

  get-entitlements-request - The GetEntitlementsRequest contains parameters for the GetEntitlements operation. - `com.amazonaws.services.marketplaceentitlement.model.GetEntitlementsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetEntitlements operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.marketplaceentitlement.model.GetEntitlementsResult>`"
  (^java.util.concurrent.Future [^AWSMarketplaceEntitlementAsync this ^com.amazonaws.services.marketplaceentitlement.model.GetEntitlementsRequest get-entitlements-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getEntitlementsAsync get-entitlements-request async-handler)))
  (^java.util.concurrent.Future [^AWSMarketplaceEntitlementAsync this ^com.amazonaws.services.marketplaceentitlement.model.GetEntitlementsRequest get-entitlements-request]
    (-> this (.getEntitlementsAsync get-entitlements-request))))

