(ns com.amazonaws.services.ram.AbstractAWSRAM
  "Abstract implementation of AWSRAM. Convenient method forms pass through to the corresponding overload that
  takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.ram AbstractAWSRAM]))

(defn enable-sharing-with-aws-organization
  "Description copied from interface: AWSRAM

  request - `com.amazonaws.services.ram.model.EnableSharingWithAwsOrganizationRequest`

  returns: Result of the EnableSharingWithAwsOrganization operation returned by the service. - `com.amazonaws.services.ram.model.EnableSharingWithAwsOrganizationResult`"
  (^com.amazonaws.services.ram.model.EnableSharingWithAwsOrganizationResult [^AbstractAWSRAM this ^com.amazonaws.services.ram.model.EnableSharingWithAwsOrganizationRequest request]
    (-> this (.enableSharingWithAwsOrganization request))))

(defn get-resource-policies
  "Description copied from interface: AWSRAM

  request - `com.amazonaws.services.ram.model.GetResourcePoliciesRequest`

  returns: Result of the GetResourcePolicies operation returned by the service. - `com.amazonaws.services.ram.model.GetResourcePoliciesResult`"
  (^com.amazonaws.services.ram.model.GetResourcePoliciesResult [^AbstractAWSRAM this ^com.amazonaws.services.ram.model.GetResourcePoliciesRequest request]
    (-> this (.getResourcePolicies request))))

(defn disassociate-resource-share
  "Description copied from interface: AWSRAM

  request - `com.amazonaws.services.ram.model.DisassociateResourceShareRequest`

  returns: Result of the DisassociateResourceShare operation returned by the service. - `com.amazonaws.services.ram.model.DisassociateResourceShareResult`"
  (^com.amazonaws.services.ram.model.DisassociateResourceShareResult [^AbstractAWSRAM this ^com.amazonaws.services.ram.model.DisassociateResourceShareRequest request]
    (-> this (.disassociateResourceShare request))))

(defn update-resource-share
  "Description copied from interface: AWSRAM

  request - `com.amazonaws.services.ram.model.UpdateResourceShareRequest`

  returns: Result of the UpdateResourceShare operation returned by the service. - `com.amazonaws.services.ram.model.UpdateResourceShareResult`"
  (^com.amazonaws.services.ram.model.UpdateResourceShareResult [^AbstractAWSRAM this ^com.amazonaws.services.ram.model.UpdateResourceShareRequest request]
    (-> this (.updateResourceShare request))))

(defn untag-resource
  "Description copied from interface: AWSRAM

  request - `com.amazonaws.services.ram.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.ram.model.UntagResourceResult`"
  (^com.amazonaws.services.ram.model.UntagResourceResult [^AbstractAWSRAM this ^com.amazonaws.services.ram.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn get-resource-share-associations
  "Description copied from interface: AWSRAM

  request - `com.amazonaws.services.ram.model.GetResourceShareAssociationsRequest`

  returns: Result of the GetResourceShareAssociations operation returned by the service. - `com.amazonaws.services.ram.model.GetResourceShareAssociationsResult`"
  (^com.amazonaws.services.ram.model.GetResourceShareAssociationsResult [^AbstractAWSRAM this ^com.amazonaws.services.ram.model.GetResourceShareAssociationsRequest request]
    (-> this (.getResourceShareAssociations request))))

(defn delete-resource-share
  "Description copied from interface: AWSRAM

  request - `com.amazonaws.services.ram.model.DeleteResourceShareRequest`

  returns: Result of the DeleteResourceShare operation returned by the service. - `com.amazonaws.services.ram.model.DeleteResourceShareResult`"
  (^com.amazonaws.services.ram.model.DeleteResourceShareResult [^AbstractAWSRAM this ^com.amazonaws.services.ram.model.DeleteResourceShareRequest request]
    (-> this (.deleteResourceShare request))))

(defn list-resources
  "Description copied from interface: AWSRAM

  request - `com.amazonaws.services.ram.model.ListResourcesRequest`

  returns: Result of the ListResources operation returned by the service. - `com.amazonaws.services.ram.model.ListResourcesResult`"
  (^com.amazonaws.services.ram.model.ListResourcesResult [^AbstractAWSRAM this ^com.amazonaws.services.ram.model.ListResourcesRequest request]
    (-> this (.listResources request))))

(defn shutdown
  "Description copied from interface: AWSRAM"
  ([^AbstractAWSRAM this]
    (-> this (.shutdown))))

(defn associate-resource-share
  "Description copied from interface: AWSRAM

  request - `com.amazonaws.services.ram.model.AssociateResourceShareRequest`

  returns: Result of the AssociateResourceShare operation returned by the service. - `com.amazonaws.services.ram.model.AssociateResourceShareResult`"
  (^com.amazonaws.services.ram.model.AssociateResourceShareResult [^AbstractAWSRAM this ^com.amazonaws.services.ram.model.AssociateResourceShareRequest request]
    (-> this (.associateResourceShare request))))

(defn get-resource-share-invitations
  "Description copied from interface: AWSRAM

  request - `com.amazonaws.services.ram.model.GetResourceShareInvitationsRequest`

  returns: Result of the GetResourceShareInvitations operation returned by the service. - `com.amazonaws.services.ram.model.GetResourceShareInvitationsResult`"
  (^com.amazonaws.services.ram.model.GetResourceShareInvitationsResult [^AbstractAWSRAM this ^com.amazonaws.services.ram.model.GetResourceShareInvitationsRequest request]
    (-> this (.getResourceShareInvitations request))))

(defn reject-resource-share-invitation
  "Description copied from interface: AWSRAM

  request - `com.amazonaws.services.ram.model.RejectResourceShareInvitationRequest`

  returns: Result of the RejectResourceShareInvitation operation returned by the service. - `com.amazonaws.services.ram.model.RejectResourceShareInvitationResult`"
  (^com.amazonaws.services.ram.model.RejectResourceShareInvitationResult [^AbstractAWSRAM this ^com.amazonaws.services.ram.model.RejectResourceShareInvitationRequest request]
    (-> this (.rejectResourceShareInvitation request))))

(defn create-resource-share
  "Description copied from interface: AWSRAM

  request - `com.amazonaws.services.ram.model.CreateResourceShareRequest`

  returns: Result of the CreateResourceShare operation returned by the service. - `com.amazonaws.services.ram.model.CreateResourceShareResult`"
  (^com.amazonaws.services.ram.model.CreateResourceShareResult [^AbstractAWSRAM this ^com.amazonaws.services.ram.model.CreateResourceShareRequest request]
    (-> this (.createResourceShare request))))

(defn accept-resource-share-invitation
  "Description copied from interface: AWSRAM

  request - `com.amazonaws.services.ram.model.AcceptResourceShareInvitationRequest`

  returns: Result of the AcceptResourceShareInvitation operation returned by the service. - `com.amazonaws.services.ram.model.AcceptResourceShareInvitationResult`"
  (^com.amazonaws.services.ram.model.AcceptResourceShareInvitationResult [^AbstractAWSRAM this ^com.amazonaws.services.ram.model.AcceptResourceShareInvitationRequest request]
    (-> this (.acceptResourceShareInvitation request))))

(defn get-resource-shares
  "Description copied from interface: AWSRAM

  request - `com.amazonaws.services.ram.model.GetResourceSharesRequest`

  returns: Result of the GetResourceShares operation returned by the service. - `com.amazonaws.services.ram.model.GetResourceSharesResult`"
  (^com.amazonaws.services.ram.model.GetResourceSharesResult [^AbstractAWSRAM this ^com.amazonaws.services.ram.model.GetResourceSharesRequest request]
    (-> this (.getResourceShares request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSRAM

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSRAM this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn list-principals
  "Description copied from interface: AWSRAM

  request - `com.amazonaws.services.ram.model.ListPrincipalsRequest`

  returns: Result of the ListPrincipals operation returned by the service. - `com.amazonaws.services.ram.model.ListPrincipalsResult`"
  (^com.amazonaws.services.ram.model.ListPrincipalsResult [^AbstractAWSRAM this ^com.amazonaws.services.ram.model.ListPrincipalsRequest request]
    (-> this (.listPrincipals request))))

(defn tag-resource
  "Description copied from interface: AWSRAM

  request - `com.amazonaws.services.ram.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.ram.model.TagResourceResult`"
  (^com.amazonaws.services.ram.model.TagResourceResult [^AbstractAWSRAM this ^com.amazonaws.services.ram.model.TagResourceRequest request]
    (-> this (.tagResource request))))

