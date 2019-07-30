(ns com.amazonaws.services.marketplaceentitlement.AbstractAWSMarketplaceEntitlementAsync
  "Abstract implementation of AWSMarketplaceEntitlementAsync. Convenient method forms pass through to the
  corresponding overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.marketplaceentitlement AbstractAWSMarketplaceEntitlementAsync]))

(defn get-entitlements-async
  "Description copied from interface: AWSMarketplaceEntitlementAsync

  request - The GetEntitlementsRequest contains parameters for the GetEntitlements operation. - `com.amazonaws.services.marketplaceentitlement.model.GetEntitlementsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetEntitlements operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.marketplaceentitlement.model.GetEntitlementsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMarketplaceEntitlementAsync this ^com.amazonaws.services.marketplaceentitlement.model.GetEntitlementsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getEntitlementsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMarketplaceEntitlementAsync this ^com.amazonaws.services.marketplaceentitlement.model.GetEntitlementsRequest request]
    (-> this (.getEntitlementsAsync request))))

