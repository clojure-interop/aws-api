(ns com.amazonaws.services.ram.AWSRAMClient
  "Client for accessing RAM. All service calls made using this client are blocking, and will not return until the
  service call completes.


  Use AWS Resource Access Manager to share AWS resources between AWS accounts. To share a resource, you create a
  resource share, associate the resource with the resource share, and specify the principals that can access the
  resource. The following principals are supported:




  The ID of an AWS account




  The Amazon Resource Name (ARN) of an OU from AWS Organizations




  The Amazon Resource Name (ARN) of an organization from AWS Organizations




  If you specify an AWS account that doesn't exist in the same organization as the account that owns the resource
  share, the owner of the specified account receives an invitation to accept the resource share. After the owner
  accepts the invitation, they can access the resources in the resource share. An administrator of the specified
  account can use IAM policies to restrict access resources in the resource share."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.ram AWSRAMClient]))

(defn *builder
  "returns: `com.amazonaws.services.ram.AWSRAMClientBuilder`"
  (^com.amazonaws.services.ram.AWSRAMClientBuilder []
    (AWSRAMClient/builder )))

(defn enable-sharing-with-aws-organization
  "Enables resource sharing within your organization.

  request - `com.amazonaws.services.ram.model.EnableSharingWithAwsOrganizationRequest`

  returns: Result of the EnableSharingWithAwsOrganization operation returned by the service. - `com.amazonaws.services.ram.model.EnableSharingWithAwsOrganizationResult`

  throws: com.amazonaws.services.ram.model.OperationNotPermittedException - The requested operation is not permitted."
  (^com.amazonaws.services.ram.model.EnableSharingWithAwsOrganizationResult [^AWSRAMClient this ^com.amazonaws.services.ram.model.EnableSharingWithAwsOrganizationRequest request]
    (-> this (.enableSharingWithAwsOrganization request))))

(defn get-resource-policies
  "Gets the policies for the specifies resources.

  request - `com.amazonaws.services.ram.model.GetResourcePoliciesRequest`

  returns: Result of the GetResourcePolicies operation returned by the service. - `com.amazonaws.services.ram.model.GetResourcePoliciesResult`

  throws: com.amazonaws.services.ram.model.MalformedArnException - The format of an Amazon Resource Name (ARN) is not valid."
  (^com.amazonaws.services.ram.model.GetResourcePoliciesResult [^AWSRAMClient this ^com.amazonaws.services.ram.model.GetResourcePoliciesRequest request]
    (-> this (.getResourcePolicies request))))

(defn disassociate-resource-share
  "Disassociates the specified principals or resources from the specified resource share.

  request - `com.amazonaws.services.ram.model.DisassociateResourceShareRequest`

  returns: Result of the DisassociateResourceShare operation returned by the service. - `com.amazonaws.services.ram.model.DisassociateResourceShareResult`

  throws: com.amazonaws.services.ram.model.ResourceShareLimitExceededException - The requested resource share exceeds the limit for your account."
  (^com.amazonaws.services.ram.model.DisassociateResourceShareResult [^AWSRAMClient this ^com.amazonaws.services.ram.model.DisassociateResourceShareRequest request]
    (-> this (.disassociateResourceShare request))))

(defn update-resource-share
  "Updates the specified resource share.

  request - `com.amazonaws.services.ram.model.UpdateResourceShareRequest`

  returns: Result of the UpdateResourceShare operation returned by the service. - `com.amazonaws.services.ram.model.UpdateResourceShareResult`

  throws: com.amazonaws.services.ram.model.ServerInternalException - The service could not respond to the request due to an internal problem."
  (^com.amazonaws.services.ram.model.UpdateResourceShareResult [^AWSRAMClient this ^com.amazonaws.services.ram.model.UpdateResourceShareRequest request]
    (-> this (.updateResourceShare request))))

(defn untag-resource
  "Removes the specified tags from the specified resource share.

  request - `com.amazonaws.services.ram.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.ram.model.UntagResourceResult`

  throws: com.amazonaws.services.ram.model.InvalidParameterException - A parameter is not valid."
  (^com.amazonaws.services.ram.model.UntagResourceResult [^AWSRAMClient this ^com.amazonaws.services.ram.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn get-resource-share-associations
  "Gets the associations for the specified resource share.

  request - `com.amazonaws.services.ram.model.GetResourceShareAssociationsRequest`

  returns: Result of the GetResourceShareAssociations operation returned by the service. - `com.amazonaws.services.ram.model.GetResourceShareAssociationsResult`

  throws: com.amazonaws.services.ram.model.UnknownResourceException - A specified resource was not found."
  (^com.amazonaws.services.ram.model.GetResourceShareAssociationsResult [^AWSRAMClient this ^com.amazonaws.services.ram.model.GetResourceShareAssociationsRequest request]
    (-> this (.getResourceShareAssociations request))))

(defn delete-resource-share
  "Deletes the specified resource share.

  request - `com.amazonaws.services.ram.model.DeleteResourceShareRequest`

  returns: Result of the DeleteResourceShare operation returned by the service. - `com.amazonaws.services.ram.model.DeleteResourceShareResult`

  throws: com.amazonaws.services.ram.model.ServerInternalException - The service could not respond to the request due to an internal problem."
  (^com.amazonaws.services.ram.model.DeleteResourceShareResult [^AWSRAMClient this ^com.amazonaws.services.ram.model.DeleteResourceShareRequest request]
    (-> this (.deleteResourceShare request))))

(defn list-resources
  "Lists the resources that the specified principal can access.

  request - `com.amazonaws.services.ram.model.ListResourcesRequest`

  returns: Result of the ListResources operation returned by the service. - `com.amazonaws.services.ram.model.ListResourcesResult`

  throws: com.amazonaws.services.ram.model.InvalidResourceTypeException - The specified resource type is not valid."
  (^com.amazonaws.services.ram.model.ListResourcesResult [^AWSRAMClient this ^com.amazonaws.services.ram.model.ListResourcesRequest request]
    (-> this (.listResources request))))

(defn associate-resource-share
  "Associates the specified resource share with the specified principals and resources.

  request - `com.amazonaws.services.ram.model.AssociateResourceShareRequest`

  returns: Result of the AssociateResourceShare operation returned by the service. - `com.amazonaws.services.ram.model.AssociateResourceShareResult`

  throws: com.amazonaws.services.ram.model.ResourceShareLimitExceededException - The requested resource share exceeds the limit for your account."
  (^com.amazonaws.services.ram.model.AssociateResourceShareResult [^AWSRAMClient this ^com.amazonaws.services.ram.model.AssociateResourceShareRequest request]
    (-> this (.associateResourceShare request))))

(defn get-resource-share-invitations
  "Gets the specified invitations for resource sharing.

  request - `com.amazonaws.services.ram.model.GetResourceShareInvitationsRequest`

  returns: Result of the GetResourceShareInvitations operation returned by the service. - `com.amazonaws.services.ram.model.GetResourceShareInvitationsResult`

  throws: com.amazonaws.services.ram.model.ResourceShareInvitationArnNotFoundException - The Amazon Resource Name (ARN) for an invitation was not found."
  (^com.amazonaws.services.ram.model.GetResourceShareInvitationsResult [^AWSRAMClient this ^com.amazonaws.services.ram.model.GetResourceShareInvitationsRequest request]
    (-> this (.getResourceShareInvitations request))))

(defn reject-resource-share-invitation
  "Rejects an invitation to a resource share from another AWS account.

  request - `com.amazonaws.services.ram.model.RejectResourceShareInvitationRequest`

  returns: Result of the RejectResourceShareInvitation operation returned by the service. - `com.amazonaws.services.ram.model.RejectResourceShareInvitationResult`

  throws: com.amazonaws.services.ram.model.MalformedArnException - The format of an Amazon Resource Name (ARN) is not valid."
  (^com.amazonaws.services.ram.model.RejectResourceShareInvitationResult [^AWSRAMClient this ^com.amazonaws.services.ram.model.RejectResourceShareInvitationRequest request]
    (-> this (.rejectResourceShareInvitation request))))

(defn create-resource-share
  "Creates a resource share.

  request - `com.amazonaws.services.ram.model.CreateResourceShareRequest`

  returns: Result of the CreateResourceShare operation returned by the service. - `com.amazonaws.services.ram.model.CreateResourceShareResult`

  throws: com.amazonaws.services.ram.model.ResourceShareLimitExceededException - The requested resource share exceeds the limit for your account."
  (^com.amazonaws.services.ram.model.CreateResourceShareResult [^AWSRAMClient this ^com.amazonaws.services.ram.model.CreateResourceShareRequest request]
    (-> this (.createResourceShare request))))

(defn accept-resource-share-invitation
  "Accepts an invitation to a resource share from another AWS account.

  request - `com.amazonaws.services.ram.model.AcceptResourceShareInvitationRequest`

  returns: Result of the AcceptResourceShareInvitation operation returned by the service. - `com.amazonaws.services.ram.model.AcceptResourceShareInvitationResult`

  throws: com.amazonaws.services.ram.model.MalformedArnException - The format of an Amazon Resource Name (ARN) is not valid."
  (^com.amazonaws.services.ram.model.AcceptResourceShareInvitationResult [^AWSRAMClient this ^com.amazonaws.services.ram.model.AcceptResourceShareInvitationRequest request]
    (-> this (.acceptResourceShareInvitation request))))

(defn get-resource-shares
  "Gets the specified resource shares or all of your resource shares.

  request - `com.amazonaws.services.ram.model.GetResourceSharesRequest`

  returns: Result of the GetResourceShares operation returned by the service. - `com.amazonaws.services.ram.model.GetResourceSharesResult`

  throws: com.amazonaws.services.ram.model.UnknownResourceException - A specified resource was not found."
  (^com.amazonaws.services.ram.model.GetResourceSharesResult [^AWSRAMClient this ^com.amazonaws.services.ram.model.GetResourceSharesRequest request]
    (-> this (.getResourceShares request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSRAMClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn list-principals
  "Lists the principals with access to the specified resource.

  request - `com.amazonaws.services.ram.model.ListPrincipalsRequest`

  returns: Result of the ListPrincipals operation returned by the service. - `com.amazonaws.services.ram.model.ListPrincipalsResult`

  throws: com.amazonaws.services.ram.model.MalformedArnException - The format of an Amazon Resource Name (ARN) is not valid."
  (^com.amazonaws.services.ram.model.ListPrincipalsResult [^AWSRAMClient this ^com.amazonaws.services.ram.model.ListPrincipalsRequest request]
    (-> this (.listPrincipals request))))

(defn tag-resource
  "Adds the specified tags to the specified resource share.

  request - `com.amazonaws.services.ram.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.ram.model.TagResourceResult`

  throws: com.amazonaws.services.ram.model.InvalidParameterException - A parameter is not valid."
  (^com.amazonaws.services.ram.model.TagResourceResult [^AWSRAMClient this ^com.amazonaws.services.ram.model.TagResourceRequest request]
    (-> this (.tagResource request))))

