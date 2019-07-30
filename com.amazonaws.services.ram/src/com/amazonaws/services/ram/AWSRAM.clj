(ns com.amazonaws.services.ram.AWSRAM
  "Interface for accessing RAM.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSRAM instead.



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
  (:import [com.amazonaws.services.ram AWSRAM]))

(defn enable-sharing-with-aws-organization
  "Enables resource sharing within your organization.

  enable-sharing-with-aws-organization-request - `com.amazonaws.services.ram.model.EnableSharingWithAwsOrganizationRequest`

  returns: Result of the EnableSharingWithAwsOrganization operation returned by the service. - `com.amazonaws.services.ram.model.EnableSharingWithAwsOrganizationResult`

  throws: com.amazonaws.services.ram.model.OperationNotPermittedException - The requested operation is not permitted."
  (^com.amazonaws.services.ram.model.EnableSharingWithAwsOrganizationResult [^AWSRAM this ^com.amazonaws.services.ram.model.EnableSharingWithAwsOrganizationRequest enable-sharing-with-aws-organization-request]
    (-> this (.enableSharingWithAwsOrganization enable-sharing-with-aws-organization-request))))

(defn get-resource-policies
  "Gets the policies for the specifies resources.

  get-resource-policies-request - `com.amazonaws.services.ram.model.GetResourcePoliciesRequest`

  returns: Result of the GetResourcePolicies operation returned by the service. - `com.amazonaws.services.ram.model.GetResourcePoliciesResult`

  throws: com.amazonaws.services.ram.model.MalformedArnException - The format of an Amazon Resource Name (ARN) is not valid."
  (^com.amazonaws.services.ram.model.GetResourcePoliciesResult [^AWSRAM this ^com.amazonaws.services.ram.model.GetResourcePoliciesRequest get-resource-policies-request]
    (-> this (.getResourcePolicies get-resource-policies-request))))

(defn disassociate-resource-share
  "Disassociates the specified principals or resources from the specified resource share.

  disassociate-resource-share-request - `com.amazonaws.services.ram.model.DisassociateResourceShareRequest`

  returns: Result of the DisassociateResourceShare operation returned by the service. - `com.amazonaws.services.ram.model.DisassociateResourceShareResult`

  throws: com.amazonaws.services.ram.model.ResourceShareLimitExceededException - The requested resource share exceeds the limit for your account."
  (^com.amazonaws.services.ram.model.DisassociateResourceShareResult [^AWSRAM this ^com.amazonaws.services.ram.model.DisassociateResourceShareRequest disassociate-resource-share-request]
    (-> this (.disassociateResourceShare disassociate-resource-share-request))))

(defn update-resource-share
  "Updates the specified resource share.

  update-resource-share-request - `com.amazonaws.services.ram.model.UpdateResourceShareRequest`

  returns: Result of the UpdateResourceShare operation returned by the service. - `com.amazonaws.services.ram.model.UpdateResourceShareResult`

  throws: com.amazonaws.services.ram.model.ServerInternalException - The service could not respond to the request due to an internal problem."
  (^com.amazonaws.services.ram.model.UpdateResourceShareResult [^AWSRAM this ^com.amazonaws.services.ram.model.UpdateResourceShareRequest update-resource-share-request]
    (-> this (.updateResourceShare update-resource-share-request))))

(defn untag-resource
  "Removes the specified tags from the specified resource share.

  untag-resource-request - `com.amazonaws.services.ram.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.ram.model.UntagResourceResult`

  throws: com.amazonaws.services.ram.model.InvalidParameterException - A parameter is not valid."
  (^com.amazonaws.services.ram.model.UntagResourceResult [^AWSRAM this ^com.amazonaws.services.ram.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn get-resource-share-associations
  "Gets the associations for the specified resource share.

  get-resource-share-associations-request - `com.amazonaws.services.ram.model.GetResourceShareAssociationsRequest`

  returns: Result of the GetResourceShareAssociations operation returned by the service. - `com.amazonaws.services.ram.model.GetResourceShareAssociationsResult`

  throws: com.amazonaws.services.ram.model.UnknownResourceException - A specified resource was not found."
  (^com.amazonaws.services.ram.model.GetResourceShareAssociationsResult [^AWSRAM this ^com.amazonaws.services.ram.model.GetResourceShareAssociationsRequest get-resource-share-associations-request]
    (-> this (.getResourceShareAssociations get-resource-share-associations-request))))

(defn delete-resource-share
  "Deletes the specified resource share.

  delete-resource-share-request - `com.amazonaws.services.ram.model.DeleteResourceShareRequest`

  returns: Result of the DeleteResourceShare operation returned by the service. - `com.amazonaws.services.ram.model.DeleteResourceShareResult`

  throws: com.amazonaws.services.ram.model.ServerInternalException - The service could not respond to the request due to an internal problem."
  (^com.amazonaws.services.ram.model.DeleteResourceShareResult [^AWSRAM this ^com.amazonaws.services.ram.model.DeleteResourceShareRequest delete-resource-share-request]
    (-> this (.deleteResourceShare delete-resource-share-request))))

(defn list-resources
  "Lists the resources that the specified principal can access.

  list-resources-request - `com.amazonaws.services.ram.model.ListResourcesRequest`

  returns: Result of the ListResources operation returned by the service. - `com.amazonaws.services.ram.model.ListResourcesResult`

  throws: com.amazonaws.services.ram.model.InvalidResourceTypeException - The specified resource type is not valid."
  (^com.amazonaws.services.ram.model.ListResourcesResult [^AWSRAM this ^com.amazonaws.services.ram.model.ListResourcesRequest list-resources-request]
    (-> this (.listResources list-resources-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSRAM this]
    (-> this (.shutdown))))

(defn associate-resource-share
  "Associates the specified resource share with the specified principals and resources.

  associate-resource-share-request - `com.amazonaws.services.ram.model.AssociateResourceShareRequest`

  returns: Result of the AssociateResourceShare operation returned by the service. - `com.amazonaws.services.ram.model.AssociateResourceShareResult`

  throws: com.amazonaws.services.ram.model.ResourceShareLimitExceededException - The requested resource share exceeds the limit for your account."
  (^com.amazonaws.services.ram.model.AssociateResourceShareResult [^AWSRAM this ^com.amazonaws.services.ram.model.AssociateResourceShareRequest associate-resource-share-request]
    (-> this (.associateResourceShare associate-resource-share-request))))

(defn get-resource-share-invitations
  "Gets the specified invitations for resource sharing.

  get-resource-share-invitations-request - `com.amazonaws.services.ram.model.GetResourceShareInvitationsRequest`

  returns: Result of the GetResourceShareInvitations operation returned by the service. - `com.amazonaws.services.ram.model.GetResourceShareInvitationsResult`

  throws: com.amazonaws.services.ram.model.ResourceShareInvitationArnNotFoundException - The Amazon Resource Name (ARN) for an invitation was not found."
  (^com.amazonaws.services.ram.model.GetResourceShareInvitationsResult [^AWSRAM this ^com.amazonaws.services.ram.model.GetResourceShareInvitationsRequest get-resource-share-invitations-request]
    (-> this (.getResourceShareInvitations get-resource-share-invitations-request))))

(defn reject-resource-share-invitation
  "Rejects an invitation to a resource share from another AWS account.

  reject-resource-share-invitation-request - `com.amazonaws.services.ram.model.RejectResourceShareInvitationRequest`

  returns: Result of the RejectResourceShareInvitation operation returned by the service. - `com.amazonaws.services.ram.model.RejectResourceShareInvitationResult`

  throws: com.amazonaws.services.ram.model.MalformedArnException - The format of an Amazon Resource Name (ARN) is not valid."
  (^com.amazonaws.services.ram.model.RejectResourceShareInvitationResult [^AWSRAM this ^com.amazonaws.services.ram.model.RejectResourceShareInvitationRequest reject-resource-share-invitation-request]
    (-> this (.rejectResourceShareInvitation reject-resource-share-invitation-request))))

(defn create-resource-share
  "Creates a resource share.

  create-resource-share-request - `com.amazonaws.services.ram.model.CreateResourceShareRequest`

  returns: Result of the CreateResourceShare operation returned by the service. - `com.amazonaws.services.ram.model.CreateResourceShareResult`

  throws: com.amazonaws.services.ram.model.ResourceShareLimitExceededException - The requested resource share exceeds the limit for your account."
  (^com.amazonaws.services.ram.model.CreateResourceShareResult [^AWSRAM this ^com.amazonaws.services.ram.model.CreateResourceShareRequest create-resource-share-request]
    (-> this (.createResourceShare create-resource-share-request))))

(defn accept-resource-share-invitation
  "Accepts an invitation to a resource share from another AWS account.

  accept-resource-share-invitation-request - `com.amazonaws.services.ram.model.AcceptResourceShareInvitationRequest`

  returns: Result of the AcceptResourceShareInvitation operation returned by the service. - `com.amazonaws.services.ram.model.AcceptResourceShareInvitationResult`

  throws: com.amazonaws.services.ram.model.MalformedArnException - The format of an Amazon Resource Name (ARN) is not valid."
  (^com.amazonaws.services.ram.model.AcceptResourceShareInvitationResult [^AWSRAM this ^com.amazonaws.services.ram.model.AcceptResourceShareInvitationRequest accept-resource-share-invitation-request]
    (-> this (.acceptResourceShareInvitation accept-resource-share-invitation-request))))

(defn get-resource-shares
  "Gets the specified resource shares or all of your resource shares.

  get-resource-shares-request - `com.amazonaws.services.ram.model.GetResourceSharesRequest`

  returns: Result of the GetResourceShares operation returned by the service. - `com.amazonaws.services.ram.model.GetResourceSharesResult`

  throws: com.amazonaws.services.ram.model.UnknownResourceException - A specified resource was not found."
  (^com.amazonaws.services.ram.model.GetResourceSharesResult [^AWSRAM this ^com.amazonaws.services.ram.model.GetResourceSharesRequest get-resource-shares-request]
    (-> this (.getResourceShares get-resource-shares-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSRAM this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn list-principals
  "Lists the principals with access to the specified resource.

  list-principals-request - `com.amazonaws.services.ram.model.ListPrincipalsRequest`

  returns: Result of the ListPrincipals operation returned by the service. - `com.amazonaws.services.ram.model.ListPrincipalsResult`

  throws: com.amazonaws.services.ram.model.MalformedArnException - The format of an Amazon Resource Name (ARN) is not valid."
  (^com.amazonaws.services.ram.model.ListPrincipalsResult [^AWSRAM this ^com.amazonaws.services.ram.model.ListPrincipalsRequest list-principals-request]
    (-> this (.listPrincipals list-principals-request))))

(defn tag-resource
  "Adds the specified tags to the specified resource share.

  tag-resource-request - `com.amazonaws.services.ram.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.ram.model.TagResourceResult`

  throws: com.amazonaws.services.ram.model.InvalidParameterException - A parameter is not valid."
  (^com.amazonaws.services.ram.model.TagResourceResult [^AWSRAM this ^com.amazonaws.services.ram.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

