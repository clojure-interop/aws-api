(ns com.amazonaws.services.mediaconnect.AbstractAWSMediaConnectAsync
  "Abstract implementation of AWSMediaConnectAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mediaconnect AbstractAWSMediaConnectAsync]))

(defn untag-resource-async
  "Description copied from interface: AWSMediaConnectAsync

  request - `com.amazonaws.services.mediaconnect.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconnect.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn list-flows-async
  "Description copied from interface: AWSMediaConnectAsync

  request - `com.amazonaws.services.mediaconnect.model.ListFlowsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListFlows operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconnect.model.ListFlowsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.ListFlowsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listFlowsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.ListFlowsRequest request]
    (-> this (.listFlowsAsync request))))

(defn start-flow-async
  "Description copied from interface: AWSMediaConnectAsync

  request - `com.amazonaws.services.mediaconnect.model.StartFlowRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartFlow operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconnect.model.StartFlowResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.StartFlowRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startFlowAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.StartFlowRequest request]
    (-> this (.startFlowAsync request))))

(defn describe-flow-async
  "Description copied from interface: AWSMediaConnectAsync

  request - `com.amazonaws.services.mediaconnect.model.DescribeFlowRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeFlow operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconnect.model.DescribeFlowResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.DescribeFlowRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeFlowAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.DescribeFlowRequest request]
    (-> this (.describeFlowAsync request))))

(defn update-flow-source-async
  "Description copied from interface: AWSMediaConnectAsync

  request - A request to update the source of a flow. - `com.amazonaws.services.mediaconnect.model.UpdateFlowSourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateFlowSource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconnect.model.UpdateFlowSourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.UpdateFlowSourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateFlowSourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.UpdateFlowSourceRequest request]
    (-> this (.updateFlowSourceAsync request))))

(defn add-flow-outputs-async
  "Description copied from interface: AWSMediaConnectAsync

  request - A request to add outputs to the specified flow. - `com.amazonaws.services.mediaconnect.model.AddFlowOutputsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddFlowOutputs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconnect.model.AddFlowOutputsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.AddFlowOutputsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addFlowOutputsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.AddFlowOutputsRequest request]
    (-> this (.addFlowOutputsAsync request))))

(defn stop-flow-async
  "Description copied from interface: AWSMediaConnectAsync

  request - `com.amazonaws.services.mediaconnect.model.StopFlowRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopFlow operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconnect.model.StopFlowResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.StopFlowRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopFlowAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.StopFlowRequest request]
    (-> this (.stopFlowAsync request))))

(defn list-entitlements-async
  "Description copied from interface: AWSMediaConnectAsync

  request - `com.amazonaws.services.mediaconnect.model.ListEntitlementsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListEntitlements operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconnect.model.ListEntitlementsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.ListEntitlementsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listEntitlementsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.ListEntitlementsRequest request]
    (-> this (.listEntitlementsAsync request))))

(defn remove-flow-output-async
  "Description copied from interface: AWSMediaConnectAsync

  request - `com.amazonaws.services.mediaconnect.model.RemoveFlowOutputRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveFlowOutput operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconnect.model.RemoveFlowOutputResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.RemoveFlowOutputRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeFlowOutputAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.RemoveFlowOutputRequest request]
    (-> this (.removeFlowOutputAsync request))))

(defn revoke-flow-entitlement-async
  "Description copied from interface: AWSMediaConnectAsync

  request - `com.amazonaws.services.mediaconnect.model.RevokeFlowEntitlementRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RevokeFlowEntitlement operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconnect.model.RevokeFlowEntitlementResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.RevokeFlowEntitlementRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.revokeFlowEntitlementAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.RevokeFlowEntitlementRequest request]
    (-> this (.revokeFlowEntitlementAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AWSMediaConnectAsync

  request - `com.amazonaws.services.mediaconnect.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconnect.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn delete-flow-async
  "Description copied from interface: AWSMediaConnectAsync

  request - `com.amazonaws.services.mediaconnect.model.DeleteFlowRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFlow operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconnect.model.DeleteFlowResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.DeleteFlowRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFlowAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.DeleteFlowRequest request]
    (-> this (.deleteFlowAsync request))))

(defn create-flow-async
  "Description copied from interface: AWSMediaConnectAsync

  request - Creates a new flow. The request must include one source. The request optionally can include outputs (up to 20) and entitlements (up to 50). - `com.amazonaws.services.mediaconnect.model.CreateFlowRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateFlow operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconnect.model.CreateFlowResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.CreateFlowRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createFlowAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.CreateFlowRequest request]
    (-> this (.createFlowAsync request))))

(defn grant-flow-entitlements-async
  "Description copied from interface: AWSMediaConnectAsync

  request - A request to grant entitlements on a flow. - `com.amazonaws.services.mediaconnect.model.GrantFlowEntitlementsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GrantFlowEntitlements operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconnect.model.GrantFlowEntitlementsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.GrantFlowEntitlementsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.grantFlowEntitlementsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.GrantFlowEntitlementsRequest request]
    (-> this (.grantFlowEntitlementsAsync request))))

(defn update-flow-output-async
  "Description copied from interface: AWSMediaConnectAsync

  request - The fields that you want to update in the output. - `com.amazonaws.services.mediaconnect.model.UpdateFlowOutputRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateFlowOutput operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconnect.model.UpdateFlowOutputResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.UpdateFlowOutputRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateFlowOutputAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.UpdateFlowOutputRequest request]
    (-> this (.updateFlowOutputAsync request))))

(defn tag-resource-async
  "Description copied from interface: AWSMediaConnectAsync

  request - The tags to add to the resource. A tag is an array of key-value pairs. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters. - `com.amazonaws.services.mediaconnect.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconnect.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn update-flow-entitlement-async
  "Description copied from interface: AWSMediaConnectAsync

  request - The entitlement fields that you want to update. - `com.amazonaws.services.mediaconnect.model.UpdateFlowEntitlementRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateFlowEntitlement operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconnect.model.UpdateFlowEntitlementResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.UpdateFlowEntitlementRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateFlowEntitlementAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.UpdateFlowEntitlementRequest request]
    (-> this (.updateFlowEntitlementAsync request))))

