(ns com.amazonaws.services.mediaconnect.AWSMediaConnectClient
  "Client for accessing AWS MediaConnect. All service calls made using this client are blocking, and will not return
  until the service call completes.

  API for AWS Elemental MediaConnect"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mediaconnect AWSMediaConnectClient]))

(defn *builder
  "returns: `com.amazonaws.services.mediaconnect.AWSMediaConnectClientBuilder`"
  (^com.amazonaws.services.mediaconnect.AWSMediaConnectClientBuilder []
    (AWSMediaConnectClient/builder )))

(defn list-tags-for-resource
  "List all tags on an AWS Elemental MediaConnect resource

  request - `com.amazonaws.services.mediaconnect.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.mediaconnect.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.mediaconnect.model.NotFoundException - The requested resource was not found"
  (^com.amazonaws.services.mediaconnect.model.ListTagsForResourceResult [^AWSMediaConnectClient this ^com.amazonaws.services.mediaconnect.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn update-flow-entitlement
  "You can change an entitlement's description, subscribers, and encryption. If you change the subscribers, the
   service will remove the outputs that are are used by the subscribers that are removed.

  request - `com.amazonaws.services.mediaconnect.model.UpdateFlowEntitlementRequest`

  returns: Result of the UpdateFlowEntitlement operation returned by the service. - `com.amazonaws.services.mediaconnect.model.UpdateFlowEntitlementResult`

  throws: com.amazonaws.services.mediaconnect.model.BadRequestException - The request that you submitted is not valid."
  (^com.amazonaws.services.mediaconnect.model.UpdateFlowEntitlementResult [^AWSMediaConnectClient this ^com.amazonaws.services.mediaconnect.model.UpdateFlowEntitlementRequest request]
    (-> this (.updateFlowEntitlement request))))

(defn list-flows
  "Displays a list of flows that are associated with this account. This request returns a paginated result.

  request - `com.amazonaws.services.mediaconnect.model.ListFlowsRequest`

  returns: Result of the ListFlows operation returned by the service. - `com.amazonaws.services.mediaconnect.model.ListFlowsResult`

  throws: com.amazonaws.services.mediaconnect.model.ServiceUnavailableException - AWS Elemental MediaConnect is currently unavailable. Try again later."
  (^com.amazonaws.services.mediaconnect.model.ListFlowsResult [^AWSMediaConnectClient this ^com.amazonaws.services.mediaconnect.model.ListFlowsRequest request]
    (-> this (.listFlows request))))

(defn untag-resource
  "Deletes specified tags from a resource.

  request - `com.amazonaws.services.mediaconnect.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.mediaconnect.model.UntagResourceResult`

  throws: com.amazonaws.services.mediaconnect.model.NotFoundException - The requested resource was not found"
  (^com.amazonaws.services.mediaconnect.model.UntagResourceResult [^AWSMediaConnectClient this ^com.amazonaws.services.mediaconnect.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn create-flow
  "Creates a new flow. The request must include one source. The request optionally can include outputs (up to 20)
   and entitlements (up to 50).

  request - `com.amazonaws.services.mediaconnect.model.CreateFlowRequest`

  returns: Result of the CreateFlow operation returned by the service. - `com.amazonaws.services.mediaconnect.model.CreateFlowResult`

  throws: com.amazonaws.services.mediaconnect.model.CreateFlow420Exception - Your account already contains the maximum number of 20 flows per account, per Region. For more information, contact AWS Customer Support."
  (^com.amazonaws.services.mediaconnect.model.CreateFlowResult [^AWSMediaConnectClient this ^com.amazonaws.services.mediaconnect.model.CreateFlowRequest request]
    (-> this (.createFlow request))))

(defn update-flow-source
  "Updates the source of a flow.

  request - `com.amazonaws.services.mediaconnect.model.UpdateFlowSourceRequest`

  returns: Result of the UpdateFlowSource operation returned by the service. - `com.amazonaws.services.mediaconnect.model.UpdateFlowSourceResult`

  throws: com.amazonaws.services.mediaconnect.model.BadRequestException - The request that you submitted is not valid."
  (^com.amazonaws.services.mediaconnect.model.UpdateFlowSourceResult [^AWSMediaConnectClient this ^com.amazonaws.services.mediaconnect.model.UpdateFlowSourceRequest request]
    (-> this (.updateFlowSource request))))

(defn grant-flow-entitlements
  "Grants entitlements to an existing flow.

  request - `com.amazonaws.services.mediaconnect.model.GrantFlowEntitlementsRequest`

  returns: Result of the GrantFlowEntitlements operation returned by the service. - `com.amazonaws.services.mediaconnect.model.GrantFlowEntitlementsResult`

  throws: com.amazonaws.services.mediaconnect.model.GrantFlowEntitlements420Exception - AWS Elemental MediaConnect can't complete this request because this flow already has the maximum number of allowed entitlements (50). For more information, contact AWS Customer Support."
  (^com.amazonaws.services.mediaconnect.model.GrantFlowEntitlementsResult [^AWSMediaConnectClient this ^com.amazonaws.services.mediaconnect.model.GrantFlowEntitlementsRequest request]
    (-> this (.grantFlowEntitlements request))))

(defn revoke-flow-entitlement
  "Revokes an entitlement from a flow. Once an entitlement is revoked, the content becomes unavailable to the
   subscriber and the associated output is removed.

  request - `com.amazonaws.services.mediaconnect.model.RevokeFlowEntitlementRequest`

  returns: Result of the RevokeFlowEntitlement operation returned by the service. - `com.amazonaws.services.mediaconnect.model.RevokeFlowEntitlementResult`

  throws: com.amazonaws.services.mediaconnect.model.BadRequestException - The request that you submitted is not valid."
  (^com.amazonaws.services.mediaconnect.model.RevokeFlowEntitlementResult [^AWSMediaConnectClient this ^com.amazonaws.services.mediaconnect.model.RevokeFlowEntitlementRequest request]
    (-> this (.revokeFlowEntitlement request))))

(defn remove-flow-output
  "Removes an output from an existing flow. This request can be made only on an output that does not have an
   entitlement associated with it. If the output has an entitlement, you must revoke the entitlement instead. When
   an entitlement is revoked from a flow, the service automatically removes the associated output.

  request - `com.amazonaws.services.mediaconnect.model.RemoveFlowOutputRequest`

  returns: Result of the RemoveFlowOutput operation returned by the service. - `com.amazonaws.services.mediaconnect.model.RemoveFlowOutputResult`

  throws: com.amazonaws.services.mediaconnect.model.BadRequestException - The request that you submitted is not valid."
  (^com.amazonaws.services.mediaconnect.model.RemoveFlowOutputResult [^AWSMediaConnectClient this ^com.amazonaws.services.mediaconnect.model.RemoveFlowOutputRequest request]
    (-> this (.removeFlowOutput request))))

(defn delete-flow
  "Deletes a flow. Before you can delete a flow, you must stop the flow.

  request - `com.amazonaws.services.mediaconnect.model.DeleteFlowRequest`

  returns: Result of the DeleteFlow operation returned by the service. - `com.amazonaws.services.mediaconnect.model.DeleteFlowResult`

  throws: com.amazonaws.services.mediaconnect.model.BadRequestException - The request that you submitted is not valid."
  (^com.amazonaws.services.mediaconnect.model.DeleteFlowResult [^AWSMediaConnectClient this ^com.amazonaws.services.mediaconnect.model.DeleteFlowRequest request]
    (-> this (.deleteFlow request))))

(defn describe-flow
  "Displays the details of a flow. The response includes the flow ARN, name, and Availability Zone, as well as
   details about the source, outputs, and entitlements.

  request - `com.amazonaws.services.mediaconnect.model.DescribeFlowRequest`

  returns: Result of the DescribeFlow operation returned by the service. - `com.amazonaws.services.mediaconnect.model.DescribeFlowResult`

  throws: com.amazonaws.services.mediaconnect.model.BadRequestException - The request that you submitted is not valid."
  (^com.amazonaws.services.mediaconnect.model.DescribeFlowResult [^AWSMediaConnectClient this ^com.amazonaws.services.mediaconnect.model.DescribeFlowRequest request]
    (-> this (.describeFlow request))))

(defn add-flow-outputs
  "Adds outputs to an existing flow. You can create up to 20 outputs per flow.

  request - `com.amazonaws.services.mediaconnect.model.AddFlowOutputsRequest`

  returns: Result of the AddFlowOutputs operation returned by the service. - `com.amazonaws.services.mediaconnect.model.AddFlowOutputsResult`

  throws: com.amazonaws.services.mediaconnect.model.AddFlowOutputs420Exception - AWS Elemental MediaConnect can't complete this request because this flow already has the maximum number of allowed outputs (20). For more information, contact AWS Customer Support."
  (^com.amazonaws.services.mediaconnect.model.AddFlowOutputsResult [^AWSMediaConnectClient this ^com.amazonaws.services.mediaconnect.model.AddFlowOutputsRequest request]
    (-> this (.addFlowOutputs request))))

(defn stop-flow
  "Stops a flow.

  request - `com.amazonaws.services.mediaconnect.model.StopFlowRequest`

  returns: Result of the StopFlow operation returned by the service. - `com.amazonaws.services.mediaconnect.model.StopFlowResult`

  throws: com.amazonaws.services.mediaconnect.model.BadRequestException - The request that you submitted is not valid."
  (^com.amazonaws.services.mediaconnect.model.StopFlowResult [^AWSMediaConnectClient this ^com.amazonaws.services.mediaconnect.model.StopFlowRequest request]
    (-> this (.stopFlow request))))

(defn start-flow
  "Starts a flow.

  request - `com.amazonaws.services.mediaconnect.model.StartFlowRequest`

  returns: Result of the StartFlow operation returned by the service. - `com.amazonaws.services.mediaconnect.model.StartFlowResult`

  throws: com.amazonaws.services.mediaconnect.model.BadRequestException - The request that you submitted is not valid."
  (^com.amazonaws.services.mediaconnect.model.StartFlowResult [^AWSMediaConnectClient this ^com.amazonaws.services.mediaconnect.model.StartFlowRequest request]
    (-> this (.startFlow request))))

(defn list-entitlements
  "Displays a list of all entitlements that have been granted to this account. This request returns 20 results per
   page.

  request - `com.amazonaws.services.mediaconnect.model.ListEntitlementsRequest`

  returns: Result of the ListEntitlements operation returned by the service. - `com.amazonaws.services.mediaconnect.model.ListEntitlementsResult`

  throws: com.amazonaws.services.mediaconnect.model.ServiceUnavailableException - AWS Elemental MediaConnect is currently unavailable. Try again later."
  (^com.amazonaws.services.mediaconnect.model.ListEntitlementsResult [^AWSMediaConnectClient this ^com.amazonaws.services.mediaconnect.model.ListEntitlementsRequest request]
    (-> this (.listEntitlements request))))

(defn update-flow-output
  "Updates an existing flow output.

  request - `com.amazonaws.services.mediaconnect.model.UpdateFlowOutputRequest`

  returns: Result of the UpdateFlowOutput operation returned by the service. - `com.amazonaws.services.mediaconnect.model.UpdateFlowOutputResult`

  throws: com.amazonaws.services.mediaconnect.model.BadRequestException - The request that you submitted is not valid."
  (^com.amazonaws.services.mediaconnect.model.UpdateFlowOutputResult [^AWSMediaConnectClient this ^com.amazonaws.services.mediaconnect.model.UpdateFlowOutputRequest request]
    (-> this (.updateFlowOutput request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSMediaConnectClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn tag-resource
  "Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource are
   not specified in the request parameters, they are not changed. When a resource is deleted, the tags associated
   with that resource are deleted as well.

  request - `com.amazonaws.services.mediaconnect.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.mediaconnect.model.TagResourceResult`

  throws: com.amazonaws.services.mediaconnect.model.NotFoundException - The requested resource was not found"
  (^com.amazonaws.services.mediaconnect.model.TagResourceResult [^AWSMediaConnectClient this ^com.amazonaws.services.mediaconnect.model.TagResourceRequest request]
    (-> this (.tagResource request))))

