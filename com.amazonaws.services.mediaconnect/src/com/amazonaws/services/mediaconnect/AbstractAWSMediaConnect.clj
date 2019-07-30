(ns com.amazonaws.services.mediaconnect.AbstractAWSMediaConnect
  "Abstract implementation of AWSMediaConnect. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mediaconnect AbstractAWSMediaConnect]))

(defn list-tags-for-resource
  "Description copied from interface: AWSMediaConnect

  request - `com.amazonaws.services.mediaconnect.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.mediaconnect.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.mediaconnect.model.ListTagsForResourceResult [^AbstractAWSMediaConnect this ^com.amazonaws.services.mediaconnect.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn update-flow-entitlement
  "Description copied from interface: AWSMediaConnect

  request - The entitlement fields that you want to update. - `com.amazonaws.services.mediaconnect.model.UpdateFlowEntitlementRequest`

  returns: Result of the UpdateFlowEntitlement operation returned by the service. - `com.amazonaws.services.mediaconnect.model.UpdateFlowEntitlementResult`"
  (^com.amazonaws.services.mediaconnect.model.UpdateFlowEntitlementResult [^AbstractAWSMediaConnect this ^com.amazonaws.services.mediaconnect.model.UpdateFlowEntitlementRequest request]
    (-> this (.updateFlowEntitlement request))))

(defn list-flows
  "Description copied from interface: AWSMediaConnect

  request - `com.amazonaws.services.mediaconnect.model.ListFlowsRequest`

  returns: Result of the ListFlows operation returned by the service. - `com.amazonaws.services.mediaconnect.model.ListFlowsResult`"
  (^com.amazonaws.services.mediaconnect.model.ListFlowsResult [^AbstractAWSMediaConnect this ^com.amazonaws.services.mediaconnect.model.ListFlowsRequest request]
    (-> this (.listFlows request))))

(defn untag-resource
  "Description copied from interface: AWSMediaConnect

  request - `com.amazonaws.services.mediaconnect.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.mediaconnect.model.UntagResourceResult`"
  (^com.amazonaws.services.mediaconnect.model.UntagResourceResult [^AbstractAWSMediaConnect this ^com.amazonaws.services.mediaconnect.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn create-flow
  "Description copied from interface: AWSMediaConnect

  request - Creates a new flow. The request must include one source. The request optionally can include outputs (up to 20) and entitlements (up to 50). - `com.amazonaws.services.mediaconnect.model.CreateFlowRequest`

  returns: Result of the CreateFlow operation returned by the service. - `com.amazonaws.services.mediaconnect.model.CreateFlowResult`"
  (^com.amazonaws.services.mediaconnect.model.CreateFlowResult [^AbstractAWSMediaConnect this ^com.amazonaws.services.mediaconnect.model.CreateFlowRequest request]
    (-> this (.createFlow request))))

(defn update-flow-source
  "Description copied from interface: AWSMediaConnect

  request - A request to update the source of a flow. - `com.amazonaws.services.mediaconnect.model.UpdateFlowSourceRequest`

  returns: Result of the UpdateFlowSource operation returned by the service. - `com.amazonaws.services.mediaconnect.model.UpdateFlowSourceResult`"
  (^com.amazonaws.services.mediaconnect.model.UpdateFlowSourceResult [^AbstractAWSMediaConnect this ^com.amazonaws.services.mediaconnect.model.UpdateFlowSourceRequest request]
    (-> this (.updateFlowSource request))))

(defn grant-flow-entitlements
  "Description copied from interface: AWSMediaConnect

  request - A request to grant entitlements on a flow. - `com.amazonaws.services.mediaconnect.model.GrantFlowEntitlementsRequest`

  returns: Result of the GrantFlowEntitlements operation returned by the service. - `com.amazonaws.services.mediaconnect.model.GrantFlowEntitlementsResult`"
  (^com.amazonaws.services.mediaconnect.model.GrantFlowEntitlementsResult [^AbstractAWSMediaConnect this ^com.amazonaws.services.mediaconnect.model.GrantFlowEntitlementsRequest request]
    (-> this (.grantFlowEntitlements request))))

(defn revoke-flow-entitlement
  "Description copied from interface: AWSMediaConnect

  request - `com.amazonaws.services.mediaconnect.model.RevokeFlowEntitlementRequest`

  returns: Result of the RevokeFlowEntitlement operation returned by the service. - `com.amazonaws.services.mediaconnect.model.RevokeFlowEntitlementResult`"
  (^com.amazonaws.services.mediaconnect.model.RevokeFlowEntitlementResult [^AbstractAWSMediaConnect this ^com.amazonaws.services.mediaconnect.model.RevokeFlowEntitlementRequest request]
    (-> this (.revokeFlowEntitlement request))))

(defn remove-flow-output
  "Description copied from interface: AWSMediaConnect

  request - `com.amazonaws.services.mediaconnect.model.RemoveFlowOutputRequest`

  returns: Result of the RemoveFlowOutput operation returned by the service. - `com.amazonaws.services.mediaconnect.model.RemoveFlowOutputResult`"
  (^com.amazonaws.services.mediaconnect.model.RemoveFlowOutputResult [^AbstractAWSMediaConnect this ^com.amazonaws.services.mediaconnect.model.RemoveFlowOutputRequest request]
    (-> this (.removeFlowOutput request))))

(defn delete-flow
  "Description copied from interface: AWSMediaConnect

  request - `com.amazonaws.services.mediaconnect.model.DeleteFlowRequest`

  returns: Result of the DeleteFlow operation returned by the service. - `com.amazonaws.services.mediaconnect.model.DeleteFlowResult`"
  (^com.amazonaws.services.mediaconnect.model.DeleteFlowResult [^AbstractAWSMediaConnect this ^com.amazonaws.services.mediaconnect.model.DeleteFlowRequest request]
    (-> this (.deleteFlow request))))

(defn describe-flow
  "Description copied from interface: AWSMediaConnect

  request - `com.amazonaws.services.mediaconnect.model.DescribeFlowRequest`

  returns: Result of the DescribeFlow operation returned by the service. - `com.amazonaws.services.mediaconnect.model.DescribeFlowResult`"
  (^com.amazonaws.services.mediaconnect.model.DescribeFlowResult [^AbstractAWSMediaConnect this ^com.amazonaws.services.mediaconnect.model.DescribeFlowRequest request]
    (-> this (.describeFlow request))))

(defn add-flow-outputs
  "Description copied from interface: AWSMediaConnect

  request - A request to add outputs to the specified flow. - `com.amazonaws.services.mediaconnect.model.AddFlowOutputsRequest`

  returns: Result of the AddFlowOutputs operation returned by the service. - `com.amazonaws.services.mediaconnect.model.AddFlowOutputsResult`"
  (^com.amazonaws.services.mediaconnect.model.AddFlowOutputsResult [^AbstractAWSMediaConnect this ^com.amazonaws.services.mediaconnect.model.AddFlowOutputsRequest request]
    (-> this (.addFlowOutputs request))))

(defn shutdown
  "Description copied from interface: AWSMediaConnect"
  ([^AbstractAWSMediaConnect this]
    (-> this (.shutdown))))

(defn stop-flow
  "Description copied from interface: AWSMediaConnect

  request - `com.amazonaws.services.mediaconnect.model.StopFlowRequest`

  returns: Result of the StopFlow operation returned by the service. - `com.amazonaws.services.mediaconnect.model.StopFlowResult`"
  (^com.amazonaws.services.mediaconnect.model.StopFlowResult [^AbstractAWSMediaConnect this ^com.amazonaws.services.mediaconnect.model.StopFlowRequest request]
    (-> this (.stopFlow request))))

(defn start-flow
  "Description copied from interface: AWSMediaConnect

  request - `com.amazonaws.services.mediaconnect.model.StartFlowRequest`

  returns: Result of the StartFlow operation returned by the service. - `com.amazonaws.services.mediaconnect.model.StartFlowResult`"
  (^com.amazonaws.services.mediaconnect.model.StartFlowResult [^AbstractAWSMediaConnect this ^com.amazonaws.services.mediaconnect.model.StartFlowRequest request]
    (-> this (.startFlow request))))

(defn list-entitlements
  "Description copied from interface: AWSMediaConnect

  request - `com.amazonaws.services.mediaconnect.model.ListEntitlementsRequest`

  returns: Result of the ListEntitlements operation returned by the service. - `com.amazonaws.services.mediaconnect.model.ListEntitlementsResult`"
  (^com.amazonaws.services.mediaconnect.model.ListEntitlementsResult [^AbstractAWSMediaConnect this ^com.amazonaws.services.mediaconnect.model.ListEntitlementsRequest request]
    (-> this (.listEntitlements request))))

(defn update-flow-output
  "Description copied from interface: AWSMediaConnect

  request - The fields that you want to update in the output. - `com.amazonaws.services.mediaconnect.model.UpdateFlowOutputRequest`

  returns: Result of the UpdateFlowOutput operation returned by the service. - `com.amazonaws.services.mediaconnect.model.UpdateFlowOutputResult`"
  (^com.amazonaws.services.mediaconnect.model.UpdateFlowOutputResult [^AbstractAWSMediaConnect this ^com.amazonaws.services.mediaconnect.model.UpdateFlowOutputRequest request]
    (-> this (.updateFlowOutput request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSMediaConnect

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSMediaConnect this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn tag-resource
  "Description copied from interface: AWSMediaConnect

  request - The tags to add to the resource. A tag is an array of key-value pairs. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters. - `com.amazonaws.services.mediaconnect.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.mediaconnect.model.TagResourceResult`"
  (^com.amazonaws.services.mediaconnect.model.TagResourceResult [^AbstractAWSMediaConnect this ^com.amazonaws.services.mediaconnect.model.TagResourceRequest request]
    (-> this (.tagResource request))))

