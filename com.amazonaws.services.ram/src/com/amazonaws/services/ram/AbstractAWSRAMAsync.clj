(ns com.amazonaws.services.ram.AbstractAWSRAMAsync
  "Abstract implementation of AWSRAMAsync. Convenient method forms pass through to the corresponding overload
  that takes a request object and an AsyncHandler, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.ram AbstractAWSRAMAsync]))

(defn untag-resource-async
  "Description copied from interface: AWSRAMAsync

  request - `com.amazonaws.services.ram.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ram.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSRAMAsync this ^com.amazonaws.services.ram.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSRAMAsync this ^com.amazonaws.services.ram.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn get-resource-policies-async
  "Description copied from interface: AWSRAMAsync

  request - `com.amazonaws.services.ram.model.GetResourcePoliciesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetResourcePolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ram.model.GetResourcePoliciesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSRAMAsync this ^com.amazonaws.services.ram.model.GetResourcePoliciesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getResourcePoliciesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSRAMAsync this ^com.amazonaws.services.ram.model.GetResourcePoliciesRequest request]
    (-> this (.getResourcePoliciesAsync request))))

(defn get-resource-share-invitations-async
  "Description copied from interface: AWSRAMAsync

  request - `com.amazonaws.services.ram.model.GetResourceShareInvitationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetResourceShareInvitations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ram.model.GetResourceShareInvitationsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSRAMAsync this ^com.amazonaws.services.ram.model.GetResourceShareInvitationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getResourceShareInvitationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSRAMAsync this ^com.amazonaws.services.ram.model.GetResourceShareInvitationsRequest request]
    (-> this (.getResourceShareInvitationsAsync request))))

(defn delete-resource-share-async
  "Description copied from interface: AWSRAMAsync

  request - `com.amazonaws.services.ram.model.DeleteResourceShareRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteResourceShare operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ram.model.DeleteResourceShareResult>`"
  (^java.util.concurrent.Future [^AbstractAWSRAMAsync this ^com.amazonaws.services.ram.model.DeleteResourceShareRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteResourceShareAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSRAMAsync this ^com.amazonaws.services.ram.model.DeleteResourceShareRequest request]
    (-> this (.deleteResourceShareAsync request))))

(defn accept-resource-share-invitation-async
  "Description copied from interface: AWSRAMAsync

  request - `com.amazonaws.services.ram.model.AcceptResourceShareInvitationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AcceptResourceShareInvitation operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ram.model.AcceptResourceShareInvitationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSRAMAsync this ^com.amazonaws.services.ram.model.AcceptResourceShareInvitationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.acceptResourceShareInvitationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSRAMAsync this ^com.amazonaws.services.ram.model.AcceptResourceShareInvitationRequest request]
    (-> this (.acceptResourceShareInvitationAsync request))))

(defn create-resource-share-async
  "Description copied from interface: AWSRAMAsync

  request - `com.amazonaws.services.ram.model.CreateResourceShareRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateResourceShare operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ram.model.CreateResourceShareResult>`"
  (^java.util.concurrent.Future [^AbstractAWSRAMAsync this ^com.amazonaws.services.ram.model.CreateResourceShareRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createResourceShareAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSRAMAsync this ^com.amazonaws.services.ram.model.CreateResourceShareRequest request]
    (-> this (.createResourceShareAsync request))))

(defn associate-resource-share-async
  "Description copied from interface: AWSRAMAsync

  request - `com.amazonaws.services.ram.model.AssociateResourceShareRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateResourceShare operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ram.model.AssociateResourceShareResult>`"
  (^java.util.concurrent.Future [^AbstractAWSRAMAsync this ^com.amazonaws.services.ram.model.AssociateResourceShareRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateResourceShareAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSRAMAsync this ^com.amazonaws.services.ram.model.AssociateResourceShareRequest request]
    (-> this (.associateResourceShareAsync request))))

(defn get-resource-share-associations-async
  "Description copied from interface: AWSRAMAsync

  request - `com.amazonaws.services.ram.model.GetResourceShareAssociationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetResourceShareAssociations operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ram.model.GetResourceShareAssociationsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSRAMAsync this ^com.amazonaws.services.ram.model.GetResourceShareAssociationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getResourceShareAssociationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSRAMAsync this ^com.amazonaws.services.ram.model.GetResourceShareAssociationsRequest request]
    (-> this (.getResourceShareAssociationsAsync request))))

(defn list-resources-async
  "Description copied from interface: AWSRAMAsync

  request - `com.amazonaws.services.ram.model.ListResourcesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListResources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ram.model.ListResourcesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSRAMAsync this ^com.amazonaws.services.ram.model.ListResourcesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listResourcesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSRAMAsync this ^com.amazonaws.services.ram.model.ListResourcesRequest request]
    (-> this (.listResourcesAsync request))))

(defn update-resource-share-async
  "Description copied from interface: AWSRAMAsync

  request - `com.amazonaws.services.ram.model.UpdateResourceShareRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateResourceShare operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ram.model.UpdateResourceShareResult>`"
  (^java.util.concurrent.Future [^AbstractAWSRAMAsync this ^com.amazonaws.services.ram.model.UpdateResourceShareRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateResourceShareAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSRAMAsync this ^com.amazonaws.services.ram.model.UpdateResourceShareRequest request]
    (-> this (.updateResourceShareAsync request))))

(defn disassociate-resource-share-async
  "Description copied from interface: AWSRAMAsync

  request - `com.amazonaws.services.ram.model.DisassociateResourceShareRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateResourceShare operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ram.model.DisassociateResourceShareResult>`"
  (^java.util.concurrent.Future [^AbstractAWSRAMAsync this ^com.amazonaws.services.ram.model.DisassociateResourceShareRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateResourceShareAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSRAMAsync this ^com.amazonaws.services.ram.model.DisassociateResourceShareRequest request]
    (-> this (.disassociateResourceShareAsync request))))

(defn reject-resource-share-invitation-async
  "Description copied from interface: AWSRAMAsync

  request - `com.amazonaws.services.ram.model.RejectResourceShareInvitationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RejectResourceShareInvitation operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ram.model.RejectResourceShareInvitationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSRAMAsync this ^com.amazonaws.services.ram.model.RejectResourceShareInvitationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rejectResourceShareInvitationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSRAMAsync this ^com.amazonaws.services.ram.model.RejectResourceShareInvitationRequest request]
    (-> this (.rejectResourceShareInvitationAsync request))))

(defn enable-sharing-with-aws-organization-async
  "Description copied from interface: AWSRAMAsync

  request - `com.amazonaws.services.ram.model.EnableSharingWithAwsOrganizationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableSharingWithAwsOrganization operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ram.model.EnableSharingWithAwsOrganizationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSRAMAsync this ^com.amazonaws.services.ram.model.EnableSharingWithAwsOrganizationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableSharingWithAwsOrganizationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSRAMAsync this ^com.amazonaws.services.ram.model.EnableSharingWithAwsOrganizationRequest request]
    (-> this (.enableSharingWithAwsOrganizationAsync request))))

(defn get-resource-shares-async
  "Description copied from interface: AWSRAMAsync

  request - `com.amazonaws.services.ram.model.GetResourceSharesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetResourceShares operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ram.model.GetResourceSharesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSRAMAsync this ^com.amazonaws.services.ram.model.GetResourceSharesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getResourceSharesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSRAMAsync this ^com.amazonaws.services.ram.model.GetResourceSharesRequest request]
    (-> this (.getResourceSharesAsync request))))

(defn tag-resource-async
  "Description copied from interface: AWSRAMAsync

  request - `com.amazonaws.services.ram.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ram.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSRAMAsync this ^com.amazonaws.services.ram.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSRAMAsync this ^com.amazonaws.services.ram.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn list-principals-async
  "Description copied from interface: AWSRAMAsync

  request - `com.amazonaws.services.ram.model.ListPrincipalsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPrincipals operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ram.model.ListPrincipalsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSRAMAsync this ^com.amazonaws.services.ram.model.ListPrincipalsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPrincipalsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSRAMAsync this ^com.amazonaws.services.ram.model.ListPrincipalsRequest request]
    (-> this (.listPrincipalsAsync request))))

