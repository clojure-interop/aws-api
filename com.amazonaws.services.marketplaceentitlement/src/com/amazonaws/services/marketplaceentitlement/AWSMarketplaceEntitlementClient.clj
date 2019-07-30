(ns com.amazonaws.services.marketplaceentitlement.AWSMarketplaceEntitlementClient
  "Client for accessing AWS Marketplace Entitlement Service. All service calls made using this client are blocking, and
  will not return until the service call completes.

  AWS Marketplace Entitlement Service

  This reference provides descriptions of the AWS Marketplace Entitlement Service API.


  AWS Marketplace Entitlement Service is used to determine the entitlement of a customer to a given product. An
  entitlement represents capacity in a product owned by the customer. For example, a customer might own some number of
  users or seats in an SaaS application or some amount of data capacity in a multi-tenant database.


  Getting Entitlement Records




  GetEntitlements- Gets the entitlements for a Marketplace product."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.marketplaceentitlement AWSMarketplaceEntitlementClient]))

(defn *builder
  "returns: `com.amazonaws.services.marketplaceentitlement.AWSMarketplaceEntitlementClientBuilder`"
  (^com.amazonaws.services.marketplaceentitlement.AWSMarketplaceEntitlementClientBuilder []
    (AWSMarketplaceEntitlementClient/builder )))

(defn get-entitlements
  "GetEntitlements retrieves entitlement values for a given product. The results can be filtered based on customer
   identifier or product dimensions.

  request - `com.amazonaws.services.marketplaceentitlement.model.GetEntitlementsRequest`

  returns: Result of the GetEntitlements operation returned by the service. - `com.amazonaws.services.marketplaceentitlement.model.GetEntitlementsResult`

  throws: com.amazonaws.services.marketplaceentitlement.model.InvalidParameterException - One or more parameters in your request was invalid."
  (^com.amazonaws.services.marketplaceentitlement.model.GetEntitlementsResult [^AWSMarketplaceEntitlementClient this ^com.amazonaws.services.marketplaceentitlement.model.GetEntitlementsRequest request]
    (-> this (.getEntitlements request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSMarketplaceEntitlementClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

