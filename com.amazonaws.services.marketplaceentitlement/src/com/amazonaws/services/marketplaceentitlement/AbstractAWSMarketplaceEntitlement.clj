(ns com.amazonaws.services.marketplaceentitlement.AbstractAWSMarketplaceEntitlement
  "Abstract implementation of AWSMarketplaceEntitlement. Convenient method forms pass through to the
  corresponding overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.marketplaceentitlement AbstractAWSMarketplaceEntitlement]))

(defn get-entitlements
  "Description copied from interface: AWSMarketplaceEntitlement

  request - The GetEntitlementsRequest contains parameters for the GetEntitlements operation. - `com.amazonaws.services.marketplaceentitlement.model.GetEntitlementsRequest`

  returns: Result of the GetEntitlements operation returned by the service. - `com.amazonaws.services.marketplaceentitlement.model.GetEntitlementsResult`"
  (^com.amazonaws.services.marketplaceentitlement.model.GetEntitlementsResult [^AbstractAWSMarketplaceEntitlement this ^com.amazonaws.services.marketplaceentitlement.model.GetEntitlementsRequest request]
    (-> this (.getEntitlements request))))

(defn shutdown
  "Description copied from interface: AWSMarketplaceEntitlement"
  ([^AbstractAWSMarketplaceEntitlement this]
    (-> this (.shutdown))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSMarketplaceEntitlement

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSMarketplaceEntitlement this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

