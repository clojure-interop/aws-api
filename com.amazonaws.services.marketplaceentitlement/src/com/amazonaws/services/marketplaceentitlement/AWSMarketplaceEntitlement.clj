(ns com.amazonaws.services.marketplaceentitlement.AWSMarketplaceEntitlement
  "Interface for accessing AWS Marketplace Entitlement Service.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSMarketplaceEntitlement instead.


  AWS Marketplace Entitlement Service

  This reference provides descriptions of the AWS Marketplace Entitlement Service API.


  AWS Marketplace Entitlement Service is used to determine the entitlement of a customer to a given product. An
  entitlement represents capacity in a product owned by the customer. For example, a customer might own some number of
  users or seats in an SaaS application or some amount of data capacity in a multi-tenant database.


  Getting Entitlement Records




  GetEntitlements- Gets the entitlements for a Marketplace product."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.marketplaceentitlement AWSMarketplaceEntitlement]))

(defn get-entitlements
  "GetEntitlements retrieves entitlement values for a given product. The results can be filtered based on customer
   identifier or product dimensions.

  get-entitlements-request - The GetEntitlementsRequest contains parameters for the GetEntitlements operation. - `com.amazonaws.services.marketplaceentitlement.model.GetEntitlementsRequest`

  returns: Result of the GetEntitlements operation returned by the service. - `com.amazonaws.services.marketplaceentitlement.model.GetEntitlementsResult`

  throws: com.amazonaws.services.marketplaceentitlement.model.InvalidParameterException - One or more parameters in your request was invalid."
  (^com.amazonaws.services.marketplaceentitlement.model.GetEntitlementsResult [^AWSMarketplaceEntitlement this ^com.amazonaws.services.marketplaceentitlement.model.GetEntitlementsRequest get-entitlements-request]
    (-> this (.getEntitlements get-entitlements-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSMarketplaceEntitlement this]
    (-> this (.shutdown))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSMarketplaceEntitlement this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

