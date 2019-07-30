(ns com.amazonaws.services.ram.AWSRAMAsync
  "Interface for accessing RAM asynchronously. Each asynchronous method will return a Java Future object representing
  the asynchronous operation; overloads which accept an AsyncHandler can be used to receive notification when
  an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSRAMAsync instead.



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
  (:import [com.amazonaws.services.ram AWSRAMAsync]))

(defn untag-resource-async
  "Removes the specified tags from the specified resource share.

  untag-resource-request - `com.amazonaws.services.ram.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ram.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSRAMAsync this ^com.amazonaws.services.ram.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSRAMAsync this ^com.amazonaws.services.ram.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn get-resource-policies-async
  "Gets the policies for the specifies resources.

  get-resource-policies-request - `com.amazonaws.services.ram.model.GetResourcePoliciesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetResourcePolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ram.model.GetResourcePoliciesResult>`"
  (^java.util.concurrent.Future [^AWSRAMAsync this ^com.amazonaws.services.ram.model.GetResourcePoliciesRequest get-resource-policies-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getResourcePoliciesAsync get-resource-policies-request async-handler)))
  (^java.util.concurrent.Future [^AWSRAMAsync this ^com.amazonaws.services.ram.model.GetResourcePoliciesRequest get-resource-policies-request]
    (-> this (.getResourcePoliciesAsync get-resource-policies-request))))

(defn get-resource-share-invitations-async
  "Gets the specified invitations for resource sharing.

  get-resource-share-invitations-request - `com.amazonaws.services.ram.model.GetResourceShareInvitationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetResourceShareInvitations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ram.model.GetResourceShareInvitationsResult>`"
  (^java.util.concurrent.Future [^AWSRAMAsync this ^com.amazonaws.services.ram.model.GetResourceShareInvitationsRequest get-resource-share-invitations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getResourceShareInvitationsAsync get-resource-share-invitations-request async-handler)))
  (^java.util.concurrent.Future [^AWSRAMAsync this ^com.amazonaws.services.ram.model.GetResourceShareInvitationsRequest get-resource-share-invitations-request]
    (-> this (.getResourceShareInvitationsAsync get-resource-share-invitations-request))))

(defn delete-resource-share-async
  "Deletes the specified resource share.

  delete-resource-share-request - `com.amazonaws.services.ram.model.DeleteResourceShareRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteResourceShare operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ram.model.DeleteResourceShareResult>`"
  (^java.util.concurrent.Future [^AWSRAMAsync this ^com.amazonaws.services.ram.model.DeleteResourceShareRequest delete-resource-share-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteResourceShareAsync delete-resource-share-request async-handler)))
  (^java.util.concurrent.Future [^AWSRAMAsync this ^com.amazonaws.services.ram.model.DeleteResourceShareRequest delete-resource-share-request]
    (-> this (.deleteResourceShareAsync delete-resource-share-request))))

(defn accept-resource-share-invitation-async
  "Accepts an invitation to a resource share from another AWS account.

  accept-resource-share-invitation-request - `com.amazonaws.services.ram.model.AcceptResourceShareInvitationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AcceptResourceShareInvitation operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ram.model.AcceptResourceShareInvitationResult>`"
  (^java.util.concurrent.Future [^AWSRAMAsync this ^com.amazonaws.services.ram.model.AcceptResourceShareInvitationRequest accept-resource-share-invitation-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.acceptResourceShareInvitationAsync accept-resource-share-invitation-request async-handler)))
  (^java.util.concurrent.Future [^AWSRAMAsync this ^com.amazonaws.services.ram.model.AcceptResourceShareInvitationRequest accept-resource-share-invitation-request]
    (-> this (.acceptResourceShareInvitationAsync accept-resource-share-invitation-request))))

(defn create-resource-share-async
  "Creates a resource share.

  create-resource-share-request - `com.amazonaws.services.ram.model.CreateResourceShareRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateResourceShare operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ram.model.CreateResourceShareResult>`"
  (^java.util.concurrent.Future [^AWSRAMAsync this ^com.amazonaws.services.ram.model.CreateResourceShareRequest create-resource-share-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createResourceShareAsync create-resource-share-request async-handler)))
  (^java.util.concurrent.Future [^AWSRAMAsync this ^com.amazonaws.services.ram.model.CreateResourceShareRequest create-resource-share-request]
    (-> this (.createResourceShareAsync create-resource-share-request))))

(defn associate-resource-share-async
  "Associates the specified resource share with the specified principals and resources.

  associate-resource-share-request - `com.amazonaws.services.ram.model.AssociateResourceShareRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateResourceShare operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ram.model.AssociateResourceShareResult>`"
  (^java.util.concurrent.Future [^AWSRAMAsync this ^com.amazonaws.services.ram.model.AssociateResourceShareRequest associate-resource-share-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateResourceShareAsync associate-resource-share-request async-handler)))
  (^java.util.concurrent.Future [^AWSRAMAsync this ^com.amazonaws.services.ram.model.AssociateResourceShareRequest associate-resource-share-request]
    (-> this (.associateResourceShareAsync associate-resource-share-request))))

(defn get-resource-share-associations-async
  "Gets the associations for the specified resource share.

  get-resource-share-associations-request - `com.amazonaws.services.ram.model.GetResourceShareAssociationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetResourceShareAssociations operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ram.model.GetResourceShareAssociationsResult>`"
  (^java.util.concurrent.Future [^AWSRAMAsync this ^com.amazonaws.services.ram.model.GetResourceShareAssociationsRequest get-resource-share-associations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getResourceShareAssociationsAsync get-resource-share-associations-request async-handler)))
  (^java.util.concurrent.Future [^AWSRAMAsync this ^com.amazonaws.services.ram.model.GetResourceShareAssociationsRequest get-resource-share-associations-request]
    (-> this (.getResourceShareAssociationsAsync get-resource-share-associations-request))))

(defn list-resources-async
  "Lists the resources that the specified principal can access.

  list-resources-request - `com.amazonaws.services.ram.model.ListResourcesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListResources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ram.model.ListResourcesResult>`"
  (^java.util.concurrent.Future [^AWSRAMAsync this ^com.amazonaws.services.ram.model.ListResourcesRequest list-resources-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listResourcesAsync list-resources-request async-handler)))
  (^java.util.concurrent.Future [^AWSRAMAsync this ^com.amazonaws.services.ram.model.ListResourcesRequest list-resources-request]
    (-> this (.listResourcesAsync list-resources-request))))

(defn update-resource-share-async
  "Updates the specified resource share.

  update-resource-share-request - `com.amazonaws.services.ram.model.UpdateResourceShareRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateResourceShare operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ram.model.UpdateResourceShareResult>`"
  (^java.util.concurrent.Future [^AWSRAMAsync this ^com.amazonaws.services.ram.model.UpdateResourceShareRequest update-resource-share-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateResourceShareAsync update-resource-share-request async-handler)))
  (^java.util.concurrent.Future [^AWSRAMAsync this ^com.amazonaws.services.ram.model.UpdateResourceShareRequest update-resource-share-request]
    (-> this (.updateResourceShareAsync update-resource-share-request))))

(defn disassociate-resource-share-async
  "Disassociates the specified principals or resources from the specified resource share.

  disassociate-resource-share-request - `com.amazonaws.services.ram.model.DisassociateResourceShareRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateResourceShare operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ram.model.DisassociateResourceShareResult>`"
  (^java.util.concurrent.Future [^AWSRAMAsync this ^com.amazonaws.services.ram.model.DisassociateResourceShareRequest disassociate-resource-share-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateResourceShareAsync disassociate-resource-share-request async-handler)))
  (^java.util.concurrent.Future [^AWSRAMAsync this ^com.amazonaws.services.ram.model.DisassociateResourceShareRequest disassociate-resource-share-request]
    (-> this (.disassociateResourceShareAsync disassociate-resource-share-request))))

(defn reject-resource-share-invitation-async
  "Rejects an invitation to a resource share from another AWS account.

  reject-resource-share-invitation-request - `com.amazonaws.services.ram.model.RejectResourceShareInvitationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RejectResourceShareInvitation operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ram.model.RejectResourceShareInvitationResult>`"
  (^java.util.concurrent.Future [^AWSRAMAsync this ^com.amazonaws.services.ram.model.RejectResourceShareInvitationRequest reject-resource-share-invitation-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rejectResourceShareInvitationAsync reject-resource-share-invitation-request async-handler)))
  (^java.util.concurrent.Future [^AWSRAMAsync this ^com.amazonaws.services.ram.model.RejectResourceShareInvitationRequest reject-resource-share-invitation-request]
    (-> this (.rejectResourceShareInvitationAsync reject-resource-share-invitation-request))))

(defn enable-sharing-with-aws-organization-async
  "Enables resource sharing within your organization.

  enable-sharing-with-aws-organization-request - `com.amazonaws.services.ram.model.EnableSharingWithAwsOrganizationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableSharingWithAwsOrganization operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ram.model.EnableSharingWithAwsOrganizationResult>`"
  (^java.util.concurrent.Future [^AWSRAMAsync this ^com.amazonaws.services.ram.model.EnableSharingWithAwsOrganizationRequest enable-sharing-with-aws-organization-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableSharingWithAwsOrganizationAsync enable-sharing-with-aws-organization-request async-handler)))
  (^java.util.concurrent.Future [^AWSRAMAsync this ^com.amazonaws.services.ram.model.EnableSharingWithAwsOrganizationRequest enable-sharing-with-aws-organization-request]
    (-> this (.enableSharingWithAwsOrganizationAsync enable-sharing-with-aws-organization-request))))

(defn get-resource-shares-async
  "Gets the specified resource shares or all of your resource shares.

  get-resource-shares-request - `com.amazonaws.services.ram.model.GetResourceSharesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetResourceShares operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ram.model.GetResourceSharesResult>`"
  (^java.util.concurrent.Future [^AWSRAMAsync this ^com.amazonaws.services.ram.model.GetResourceSharesRequest get-resource-shares-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getResourceSharesAsync get-resource-shares-request async-handler)))
  (^java.util.concurrent.Future [^AWSRAMAsync this ^com.amazonaws.services.ram.model.GetResourceSharesRequest get-resource-shares-request]
    (-> this (.getResourceSharesAsync get-resource-shares-request))))

(defn tag-resource-async
  "Adds the specified tags to the specified resource share.

  tag-resource-request - `com.amazonaws.services.ram.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ram.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSRAMAsync this ^com.amazonaws.services.ram.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSRAMAsync this ^com.amazonaws.services.ram.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn list-principals-async
  "Lists the principals with access to the specified resource.

  list-principals-request - `com.amazonaws.services.ram.model.ListPrincipalsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPrincipals operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ram.model.ListPrincipalsResult>`"
  (^java.util.concurrent.Future [^AWSRAMAsync this ^com.amazonaws.services.ram.model.ListPrincipalsRequest list-principals-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPrincipalsAsync list-principals-request async-handler)))
  (^java.util.concurrent.Future [^AWSRAMAsync this ^com.amazonaws.services.ram.model.ListPrincipalsRequest list-principals-request]
    (-> this (.listPrincipalsAsync list-principals-request))))

