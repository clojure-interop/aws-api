(ns com.amazonaws.services.mediaconnect.AWSMediaConnectAsync
  "Interface for accessing AWS MediaConnect asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSMediaConnectAsync instead.


  API for AWS Elemental MediaConnect"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mediaconnect AWSMediaConnectAsync]))

(defn untag-resource-async
  "Deletes specified tags from a resource.

  untag-resource-request - `com.amazonaws.services.mediaconnect.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconnect.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn list-flows-async
  "Displays a list of flows that are associated with this account. This request returns a paginated result.

  list-flows-request - `com.amazonaws.services.mediaconnect.model.ListFlowsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListFlows operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconnect.model.ListFlowsResult>`"
  (^java.util.concurrent.Future [^AWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.ListFlowsRequest list-flows-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listFlowsAsync list-flows-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.ListFlowsRequest list-flows-request]
    (-> this (.listFlowsAsync list-flows-request))))

(defn start-flow-async
  "Starts a flow.

  start-flow-request - `com.amazonaws.services.mediaconnect.model.StartFlowRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartFlow operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconnect.model.StartFlowResult>`"
  (^java.util.concurrent.Future [^AWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.StartFlowRequest start-flow-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startFlowAsync start-flow-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.StartFlowRequest start-flow-request]
    (-> this (.startFlowAsync start-flow-request))))

(defn describe-flow-async
  "Displays the details of a flow. The response includes the flow ARN, name, and Availability Zone, as well as
   details about the source, outputs, and entitlements.

  describe-flow-request - `com.amazonaws.services.mediaconnect.model.DescribeFlowRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeFlow operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconnect.model.DescribeFlowResult>`"
  (^java.util.concurrent.Future [^AWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.DescribeFlowRequest describe-flow-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeFlowAsync describe-flow-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.DescribeFlowRequest describe-flow-request]
    (-> this (.describeFlowAsync describe-flow-request))))

(defn update-flow-source-async
  "Updates the source of a flow.

  update-flow-source-request - A request to update the source of a flow. - `com.amazonaws.services.mediaconnect.model.UpdateFlowSourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateFlowSource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconnect.model.UpdateFlowSourceResult>`"
  (^java.util.concurrent.Future [^AWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.UpdateFlowSourceRequest update-flow-source-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateFlowSourceAsync update-flow-source-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.UpdateFlowSourceRequest update-flow-source-request]
    (-> this (.updateFlowSourceAsync update-flow-source-request))))

(defn add-flow-outputs-async
  "Adds outputs to an existing flow. You can create up to 20 outputs per flow.

  add-flow-outputs-request - A request to add outputs to the specified flow. - `com.amazonaws.services.mediaconnect.model.AddFlowOutputsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddFlowOutputs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconnect.model.AddFlowOutputsResult>`"
  (^java.util.concurrent.Future [^AWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.AddFlowOutputsRequest add-flow-outputs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addFlowOutputsAsync add-flow-outputs-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.AddFlowOutputsRequest add-flow-outputs-request]
    (-> this (.addFlowOutputsAsync add-flow-outputs-request))))

(defn stop-flow-async
  "Stops a flow.

  stop-flow-request - `com.amazonaws.services.mediaconnect.model.StopFlowRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopFlow operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconnect.model.StopFlowResult>`"
  (^java.util.concurrent.Future [^AWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.StopFlowRequest stop-flow-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopFlowAsync stop-flow-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.StopFlowRequest stop-flow-request]
    (-> this (.stopFlowAsync stop-flow-request))))

(defn list-entitlements-async
  "Displays a list of all entitlements that have been granted to this account. This request returns 20 results per
   page.

  list-entitlements-request - `com.amazonaws.services.mediaconnect.model.ListEntitlementsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListEntitlements operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconnect.model.ListEntitlementsResult>`"
  (^java.util.concurrent.Future [^AWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.ListEntitlementsRequest list-entitlements-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listEntitlementsAsync list-entitlements-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.ListEntitlementsRequest list-entitlements-request]
    (-> this (.listEntitlementsAsync list-entitlements-request))))

(defn remove-flow-output-async
  "Removes an output from an existing flow. This request can be made only on an output that does not have an
   entitlement associated with it. If the output has an entitlement, you must revoke the entitlement instead. When
   an entitlement is revoked from a flow, the service automatically removes the associated output.

  remove-flow-output-request - `com.amazonaws.services.mediaconnect.model.RemoveFlowOutputRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveFlowOutput operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconnect.model.RemoveFlowOutputResult>`"
  (^java.util.concurrent.Future [^AWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.RemoveFlowOutputRequest remove-flow-output-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeFlowOutputAsync remove-flow-output-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.RemoveFlowOutputRequest remove-flow-output-request]
    (-> this (.removeFlowOutputAsync remove-flow-output-request))))

(defn revoke-flow-entitlement-async
  "Revokes an entitlement from a flow. Once an entitlement is revoked, the content becomes unavailable to the
   subscriber and the associated output is removed.

  revoke-flow-entitlement-request - `com.amazonaws.services.mediaconnect.model.RevokeFlowEntitlementRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RevokeFlowEntitlement operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconnect.model.RevokeFlowEntitlementResult>`"
  (^java.util.concurrent.Future [^AWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.RevokeFlowEntitlementRequest revoke-flow-entitlement-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.revokeFlowEntitlementAsync revoke-flow-entitlement-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.RevokeFlowEntitlementRequest revoke-flow-entitlement-request]
    (-> this (.revokeFlowEntitlementAsync revoke-flow-entitlement-request))))

(defn list-tags-for-resource-async
  "List all tags on an AWS Elemental MediaConnect resource

  list-tags-for-resource-request - `com.amazonaws.services.mediaconnect.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconnect.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn delete-flow-async
  "Deletes a flow. Before you can delete a flow, you must stop the flow.

  delete-flow-request - `com.amazonaws.services.mediaconnect.model.DeleteFlowRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFlow operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconnect.model.DeleteFlowResult>`"
  (^java.util.concurrent.Future [^AWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.DeleteFlowRequest delete-flow-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFlowAsync delete-flow-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.DeleteFlowRequest delete-flow-request]
    (-> this (.deleteFlowAsync delete-flow-request))))

(defn create-flow-async
  "Creates a new flow. The request must include one source. The request optionally can include outputs (up to 20)
   and entitlements (up to 50).

  create-flow-request - Creates a new flow. The request must include one source. The request optionally can include outputs (up to 20) and entitlements (up to 50). - `com.amazonaws.services.mediaconnect.model.CreateFlowRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateFlow operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconnect.model.CreateFlowResult>`"
  (^java.util.concurrent.Future [^AWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.CreateFlowRequest create-flow-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createFlowAsync create-flow-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.CreateFlowRequest create-flow-request]
    (-> this (.createFlowAsync create-flow-request))))

(defn grant-flow-entitlements-async
  "Grants entitlements to an existing flow.

  grant-flow-entitlements-request - A request to grant entitlements on a flow. - `com.amazonaws.services.mediaconnect.model.GrantFlowEntitlementsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GrantFlowEntitlements operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconnect.model.GrantFlowEntitlementsResult>`"
  (^java.util.concurrent.Future [^AWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.GrantFlowEntitlementsRequest grant-flow-entitlements-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.grantFlowEntitlementsAsync grant-flow-entitlements-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.GrantFlowEntitlementsRequest grant-flow-entitlements-request]
    (-> this (.grantFlowEntitlementsAsync grant-flow-entitlements-request))))

(defn update-flow-output-async
  "Updates an existing flow output.

  update-flow-output-request - The fields that you want to update in the output. - `com.amazonaws.services.mediaconnect.model.UpdateFlowOutputRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateFlowOutput operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconnect.model.UpdateFlowOutputResult>`"
  (^java.util.concurrent.Future [^AWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.UpdateFlowOutputRequest update-flow-output-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateFlowOutputAsync update-flow-output-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.UpdateFlowOutputRequest update-flow-output-request]
    (-> this (.updateFlowOutputAsync update-flow-output-request))))

(defn tag-resource-async
  "Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource are
   not specified in the request parameters, they are not changed. When a resource is deleted, the tags associated
   with that resource are deleted as well.

  tag-resource-request - The tags to add to the resource. A tag is an array of key-value pairs. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters. - `com.amazonaws.services.mediaconnect.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconnect.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn update-flow-entitlement-async
  "You can change an entitlement's description, subscribers, and encryption. If you change the subscribers, the
   service will remove the outputs that are are used by the subscribers that are removed.

  update-flow-entitlement-request - The entitlement fields that you want to update. - `com.amazonaws.services.mediaconnect.model.UpdateFlowEntitlementRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateFlowEntitlement operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconnect.model.UpdateFlowEntitlementResult>`"
  (^java.util.concurrent.Future [^AWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.UpdateFlowEntitlementRequest update-flow-entitlement-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateFlowEntitlementAsync update-flow-entitlement-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaConnectAsync this ^com.amazonaws.services.mediaconnect.model.UpdateFlowEntitlementRequest update-flow-entitlement-request]
    (-> this (.updateFlowEntitlementAsync update-flow-entitlement-request))))

