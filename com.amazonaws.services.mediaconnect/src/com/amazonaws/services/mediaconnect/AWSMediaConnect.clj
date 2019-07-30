(ns com.amazonaws.services.mediaconnect.AWSMediaConnect
  "Interface for accessing AWS MediaConnect.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSMediaConnect instead.


  API for AWS Elemental MediaConnect"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mediaconnect AWSMediaConnect]))

(defn list-tags-for-resource
  "List all tags on an AWS Elemental MediaConnect resource

  list-tags-for-resource-request - `com.amazonaws.services.mediaconnect.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.mediaconnect.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.mediaconnect.model.NotFoundException - The requested resource was not found"
  (^com.amazonaws.services.mediaconnect.model.ListTagsForResourceResult [^AWSMediaConnect this ^com.amazonaws.services.mediaconnect.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn update-flow-entitlement
  "You can change an entitlement's description, subscribers, and encryption. If you change the subscribers, the
   service will remove the outputs that are are used by the subscribers that are removed.

  update-flow-entitlement-request - The entitlement fields that you want to update. - `com.amazonaws.services.mediaconnect.model.UpdateFlowEntitlementRequest`

  returns: Result of the UpdateFlowEntitlement operation returned by the service. - `com.amazonaws.services.mediaconnect.model.UpdateFlowEntitlementResult`

  throws: com.amazonaws.services.mediaconnect.model.BadRequestException - The request that you submitted is not valid."
  (^com.amazonaws.services.mediaconnect.model.UpdateFlowEntitlementResult [^AWSMediaConnect this ^com.amazonaws.services.mediaconnect.model.UpdateFlowEntitlementRequest update-flow-entitlement-request]
    (-> this (.updateFlowEntitlement update-flow-entitlement-request))))

(defn list-flows
  "Displays a list of flows that are associated with this account. This request returns a paginated result.

  list-flows-request - `com.amazonaws.services.mediaconnect.model.ListFlowsRequest`

  returns: Result of the ListFlows operation returned by the service. - `com.amazonaws.services.mediaconnect.model.ListFlowsResult`

  throws: com.amazonaws.services.mediaconnect.model.ServiceUnavailableException - AWS Elemental MediaConnect is currently unavailable. Try again later."
  (^com.amazonaws.services.mediaconnect.model.ListFlowsResult [^AWSMediaConnect this ^com.amazonaws.services.mediaconnect.model.ListFlowsRequest list-flows-request]
    (-> this (.listFlows list-flows-request))))

(defn untag-resource
  "Deletes specified tags from a resource.

  untag-resource-request - `com.amazonaws.services.mediaconnect.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.mediaconnect.model.UntagResourceResult`

  throws: com.amazonaws.services.mediaconnect.model.NotFoundException - The requested resource was not found"
  (^com.amazonaws.services.mediaconnect.model.UntagResourceResult [^AWSMediaConnect this ^com.amazonaws.services.mediaconnect.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn create-flow
  "Creates a new flow. The request must include one source. The request optionally can include outputs (up to 20)
   and entitlements (up to 50).

  create-flow-request - Creates a new flow. The request must include one source. The request optionally can include outputs (up to 20) and entitlements (up to 50). - `com.amazonaws.services.mediaconnect.model.CreateFlowRequest`

  returns: Result of the CreateFlow operation returned by the service. - `com.amazonaws.services.mediaconnect.model.CreateFlowResult`

  throws: com.amazonaws.services.mediaconnect.model.CreateFlow420Exception - Your account already contains the maximum number of 20 flows per account, per Region. For more information, contact AWS Customer Support."
  (^com.amazonaws.services.mediaconnect.model.CreateFlowResult [^AWSMediaConnect this ^com.amazonaws.services.mediaconnect.model.CreateFlowRequest create-flow-request]
    (-> this (.createFlow create-flow-request))))

(defn update-flow-source
  "Updates the source of a flow.

  update-flow-source-request - A request to update the source of a flow. - `com.amazonaws.services.mediaconnect.model.UpdateFlowSourceRequest`

  returns: Result of the UpdateFlowSource operation returned by the service. - `com.amazonaws.services.mediaconnect.model.UpdateFlowSourceResult`

  throws: com.amazonaws.services.mediaconnect.model.BadRequestException - The request that you submitted is not valid."
  (^com.amazonaws.services.mediaconnect.model.UpdateFlowSourceResult [^AWSMediaConnect this ^com.amazonaws.services.mediaconnect.model.UpdateFlowSourceRequest update-flow-source-request]
    (-> this (.updateFlowSource update-flow-source-request))))

(defn grant-flow-entitlements
  "Grants entitlements to an existing flow.

  grant-flow-entitlements-request - A request to grant entitlements on a flow. - `com.amazonaws.services.mediaconnect.model.GrantFlowEntitlementsRequest`

  returns: Result of the GrantFlowEntitlements operation returned by the service. - `com.amazonaws.services.mediaconnect.model.GrantFlowEntitlementsResult`

  throws: com.amazonaws.services.mediaconnect.model.GrantFlowEntitlements420Exception - AWS Elemental MediaConnect can't complete this request because this flow already has the maximum number of allowed entitlements (50). For more information, contact AWS Customer Support."
  (^com.amazonaws.services.mediaconnect.model.GrantFlowEntitlementsResult [^AWSMediaConnect this ^com.amazonaws.services.mediaconnect.model.GrantFlowEntitlementsRequest grant-flow-entitlements-request]
    (-> this (.grantFlowEntitlements grant-flow-entitlements-request))))

(defn revoke-flow-entitlement
  "Revokes an entitlement from a flow. Once an entitlement is revoked, the content becomes unavailable to the
   subscriber and the associated output is removed.

  revoke-flow-entitlement-request - `com.amazonaws.services.mediaconnect.model.RevokeFlowEntitlementRequest`

  returns: Result of the RevokeFlowEntitlement operation returned by the service. - `com.amazonaws.services.mediaconnect.model.RevokeFlowEntitlementResult`

  throws: com.amazonaws.services.mediaconnect.model.BadRequestException - The request that you submitted is not valid."
  (^com.amazonaws.services.mediaconnect.model.RevokeFlowEntitlementResult [^AWSMediaConnect this ^com.amazonaws.services.mediaconnect.model.RevokeFlowEntitlementRequest revoke-flow-entitlement-request]
    (-> this (.revokeFlowEntitlement revoke-flow-entitlement-request))))

(defn remove-flow-output
  "Removes an output from an existing flow. This request can be made only on an output that does not have an
   entitlement associated with it. If the output has an entitlement, you must revoke the entitlement instead. When
   an entitlement is revoked from a flow, the service automatically removes the associated output.

  remove-flow-output-request - `com.amazonaws.services.mediaconnect.model.RemoveFlowOutputRequest`

  returns: Result of the RemoveFlowOutput operation returned by the service. - `com.amazonaws.services.mediaconnect.model.RemoveFlowOutputResult`

  throws: com.amazonaws.services.mediaconnect.model.BadRequestException - The request that you submitted is not valid."
  (^com.amazonaws.services.mediaconnect.model.RemoveFlowOutputResult [^AWSMediaConnect this ^com.amazonaws.services.mediaconnect.model.RemoveFlowOutputRequest remove-flow-output-request]
    (-> this (.removeFlowOutput remove-flow-output-request))))

(defn delete-flow
  "Deletes a flow. Before you can delete a flow, you must stop the flow.

  delete-flow-request - `com.amazonaws.services.mediaconnect.model.DeleteFlowRequest`

  returns: Result of the DeleteFlow operation returned by the service. - `com.amazonaws.services.mediaconnect.model.DeleteFlowResult`

  throws: com.amazonaws.services.mediaconnect.model.BadRequestException - The request that you submitted is not valid."
  (^com.amazonaws.services.mediaconnect.model.DeleteFlowResult [^AWSMediaConnect this ^com.amazonaws.services.mediaconnect.model.DeleteFlowRequest delete-flow-request]
    (-> this (.deleteFlow delete-flow-request))))

(defn describe-flow
  "Displays the details of a flow. The response includes the flow ARN, name, and Availability Zone, as well as
   details about the source, outputs, and entitlements.

  describe-flow-request - `com.amazonaws.services.mediaconnect.model.DescribeFlowRequest`

  returns: Result of the DescribeFlow operation returned by the service. - `com.amazonaws.services.mediaconnect.model.DescribeFlowResult`

  throws: com.amazonaws.services.mediaconnect.model.BadRequestException - The request that you submitted is not valid."
  (^com.amazonaws.services.mediaconnect.model.DescribeFlowResult [^AWSMediaConnect this ^com.amazonaws.services.mediaconnect.model.DescribeFlowRequest describe-flow-request]
    (-> this (.describeFlow describe-flow-request))))

(defn add-flow-outputs
  "Adds outputs to an existing flow. You can create up to 20 outputs per flow.

  add-flow-outputs-request - A request to add outputs to the specified flow. - `com.amazonaws.services.mediaconnect.model.AddFlowOutputsRequest`

  returns: Result of the AddFlowOutputs operation returned by the service. - `com.amazonaws.services.mediaconnect.model.AddFlowOutputsResult`

  throws: com.amazonaws.services.mediaconnect.model.AddFlowOutputs420Exception - AWS Elemental MediaConnect can't complete this request because this flow already has the maximum number of allowed outputs (20). For more information, contact AWS Customer Support."
  (^com.amazonaws.services.mediaconnect.model.AddFlowOutputsResult [^AWSMediaConnect this ^com.amazonaws.services.mediaconnect.model.AddFlowOutputsRequest add-flow-outputs-request]
    (-> this (.addFlowOutputs add-flow-outputs-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSMediaConnect this]
    (-> this (.shutdown))))

(defn stop-flow
  "Stops a flow.

  stop-flow-request - `com.amazonaws.services.mediaconnect.model.StopFlowRequest`

  returns: Result of the StopFlow operation returned by the service. - `com.amazonaws.services.mediaconnect.model.StopFlowResult`

  throws: com.amazonaws.services.mediaconnect.model.BadRequestException - The request that you submitted is not valid."
  (^com.amazonaws.services.mediaconnect.model.StopFlowResult [^AWSMediaConnect this ^com.amazonaws.services.mediaconnect.model.StopFlowRequest stop-flow-request]
    (-> this (.stopFlow stop-flow-request))))

(defn start-flow
  "Starts a flow.

  start-flow-request - `com.amazonaws.services.mediaconnect.model.StartFlowRequest`

  returns: Result of the StartFlow operation returned by the service. - `com.amazonaws.services.mediaconnect.model.StartFlowResult`

  throws: com.amazonaws.services.mediaconnect.model.BadRequestException - The request that you submitted is not valid."
  (^com.amazonaws.services.mediaconnect.model.StartFlowResult [^AWSMediaConnect this ^com.amazonaws.services.mediaconnect.model.StartFlowRequest start-flow-request]
    (-> this (.startFlow start-flow-request))))

(defn list-entitlements
  "Displays a list of all entitlements that have been granted to this account. This request returns 20 results per
   page.

  list-entitlements-request - `com.amazonaws.services.mediaconnect.model.ListEntitlementsRequest`

  returns: Result of the ListEntitlements operation returned by the service. - `com.amazonaws.services.mediaconnect.model.ListEntitlementsResult`

  throws: com.amazonaws.services.mediaconnect.model.ServiceUnavailableException - AWS Elemental MediaConnect is currently unavailable. Try again later."
  (^com.amazonaws.services.mediaconnect.model.ListEntitlementsResult [^AWSMediaConnect this ^com.amazonaws.services.mediaconnect.model.ListEntitlementsRequest list-entitlements-request]
    (-> this (.listEntitlements list-entitlements-request))))

(defn update-flow-output
  "Updates an existing flow output.

  update-flow-output-request - The fields that you want to update in the output. - `com.amazonaws.services.mediaconnect.model.UpdateFlowOutputRequest`

  returns: Result of the UpdateFlowOutput operation returned by the service. - `com.amazonaws.services.mediaconnect.model.UpdateFlowOutputResult`

  throws: com.amazonaws.services.mediaconnect.model.BadRequestException - The request that you submitted is not valid."
  (^com.amazonaws.services.mediaconnect.model.UpdateFlowOutputResult [^AWSMediaConnect this ^com.amazonaws.services.mediaconnect.model.UpdateFlowOutputRequest update-flow-output-request]
    (-> this (.updateFlowOutput update-flow-output-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSMediaConnect this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn tag-resource
  "Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource are
   not specified in the request parameters, they are not changed. When a resource is deleted, the tags associated
   with that resource are deleted as well.

  tag-resource-request - The tags to add to the resource. A tag is an array of key-value pairs. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters. - `com.amazonaws.services.mediaconnect.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.mediaconnect.model.TagResourceResult`

  throws: com.amazonaws.services.mediaconnect.model.NotFoundException - The requested resource was not found"
  (^com.amazonaws.services.mediaconnect.model.TagResourceResult [^AWSMediaConnect this ^com.amazonaws.services.mediaconnect.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

