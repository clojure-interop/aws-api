(ns com.amazonaws.services.organizations.AbstractAWSOrganizations
  "Abstract implementation of AWSOrganizations. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.organizations AbstractAWSOrganizations]))

(defn list-tags-for-resource
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.organizations.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.organizations.model.ListTagsForResourceResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn set-region
  "Description copied from interface: AWSOrganizations

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAWSOrganizations this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn disable-aws-service-access
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.DisableAWSServiceAccessRequest`

  returns: Result of the DisableAWSServiceAccess operation returned by the service. - `com.amazonaws.services.organizations.model.DisableAWSServiceAccessResult`"
  (^com.amazonaws.services.organizations.model.DisableAWSServiceAccessResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.DisableAWSServiceAccessRequest request]
    (-> this (.disableAWSServiceAccess request))))

(defn update-organizational-unit
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.UpdateOrganizationalUnitRequest`

  returns: Result of the UpdateOrganizationalUnit operation returned by the service. - `com.amazonaws.services.organizations.model.UpdateOrganizationalUnitResult`"
  (^com.amazonaws.services.organizations.model.UpdateOrganizationalUnitResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.UpdateOrganizationalUnitRequest request]
    (-> this (.updateOrganizationalUnit request))))

(defn disable-policy-type
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.DisablePolicyTypeRequest`

  returns: Result of the DisablePolicyType operation returned by the service. - `com.amazonaws.services.organizations.model.DisablePolicyTypeResult`"
  (^com.amazonaws.services.organizations.model.DisablePolicyTypeResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.DisablePolicyTypeRequest request]
    (-> this (.disablePolicyType request))))

(defn untag-resource
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.organizations.model.UntagResourceResult`"
  (^com.amazonaws.services.organizations.model.UntagResourceResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn list-handshakes-for-organization
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.ListHandshakesForOrganizationRequest`

  returns: Result of the ListHandshakesForOrganization operation returned by the service. - `com.amazonaws.services.organizations.model.ListHandshakesForOrganizationResult`"
  (^com.amazonaws.services.organizations.model.ListHandshakesForOrganizationResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.ListHandshakesForOrganizationRequest request]
    (-> this (.listHandshakesForOrganization request))))

(defn delete-organization
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.DeleteOrganizationRequest`

  returns: Result of the DeleteOrganization operation returned by the service. - `com.amazonaws.services.organizations.model.DeleteOrganizationResult`"
  (^com.amazonaws.services.organizations.model.DeleteOrganizationResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.DeleteOrganizationRequest request]
    (-> this (.deleteOrganization request))))

(defn enable-aws-service-access
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.EnableAWSServiceAccessRequest`

  returns: Result of the EnableAWSServiceAccess operation returned by the service. - `com.amazonaws.services.organizations.model.EnableAWSServiceAccessResult`"
  (^com.amazonaws.services.organizations.model.EnableAWSServiceAccessResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.EnableAWSServiceAccessRequest request]
    (-> this (.enableAWSServiceAccess request))))

(defn list-targets-for-policy
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.ListTargetsForPolicyRequest`

  returns: Result of the ListTargetsForPolicy operation returned by the service. - `com.amazonaws.services.organizations.model.ListTargetsForPolicyResult`"
  (^com.amazonaws.services.organizations.model.ListTargetsForPolicyResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.ListTargetsForPolicyRequest request]
    (-> this (.listTargetsForPolicy request))))

(defn leave-organization
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.LeaveOrganizationRequest`

  returns: Result of the LeaveOrganization operation returned by the service. - `com.amazonaws.services.organizations.model.LeaveOrganizationResult`"
  (^com.amazonaws.services.organizations.model.LeaveOrganizationResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.LeaveOrganizationRequest request]
    (-> this (.leaveOrganization request))))

(defn list-parents
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.ListParentsRequest`

  returns: Result of the ListParents operation returned by the service. - `com.amazonaws.services.organizations.model.ListParentsResult`"
  (^com.amazonaws.services.organizations.model.ListParentsResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.ListParentsRequest request]
    (-> this (.listParents request))))

(defn delete-policy
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.DeletePolicyRequest`

  returns: Result of the DeletePolicy operation returned by the service. - `com.amazonaws.services.organizations.model.DeletePolicyResult`"
  (^com.amazonaws.services.organizations.model.DeletePolicyResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.DeletePolicyRequest request]
    (-> this (.deletePolicy request))))

(defn shutdown
  "Description copied from interface: AWSOrganizations"
  ([^AbstractAWSOrganizations this]
    (-> this (.shutdown))))

(defn enable-all-features
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.EnableAllFeaturesRequest`

  returns: Result of the EnableAllFeatures operation returned by the service. - `com.amazonaws.services.organizations.model.EnableAllFeaturesResult`"
  (^com.amazonaws.services.organizations.model.EnableAllFeaturesResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.EnableAllFeaturesRequest request]
    (-> this (.enableAllFeatures request))))

(defn delete-organizational-unit
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.DeleteOrganizationalUnitRequest`

  returns: Result of the DeleteOrganizationalUnit operation returned by the service. - `com.amazonaws.services.organizations.model.DeleteOrganizationalUnitResult`"
  (^com.amazonaws.services.organizations.model.DeleteOrganizationalUnitResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.DeleteOrganizationalUnitRequest request]
    (-> this (.deleteOrganizationalUnit request))))

(defn attach-policy
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.AttachPolicyRequest`

  returns: Result of the AttachPolicy operation returned by the service. - `com.amazonaws.services.organizations.model.AttachPolicyResult`"
  (^com.amazonaws.services.organizations.model.AttachPolicyResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.AttachPolicyRequest request]
    (-> this (.attachPolicy request))))

(defn move-account
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.MoveAccountRequest`

  returns: Result of the MoveAccount operation returned by the service. - `com.amazonaws.services.organizations.model.MoveAccountResult`"
  (^com.amazonaws.services.organizations.model.MoveAccountResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.MoveAccountRequest request]
    (-> this (.moveAccount request))))

(defn set-endpoint
  "Description copied from interface: AWSOrganizations

  endpoint - The endpoint (ex: \"organizations.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"organizations.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAWSOrganizations this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn describe-organizational-unit
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.DescribeOrganizationalUnitRequest`

  returns: Result of the DescribeOrganizationalUnit operation returned by the service. - `com.amazonaws.services.organizations.model.DescribeOrganizationalUnitResult`"
  (^com.amazonaws.services.organizations.model.DescribeOrganizationalUnitResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.DescribeOrganizationalUnitRequest request]
    (-> this (.describeOrganizationalUnit request))))

(defn update-policy
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.UpdatePolicyRequest`

  returns: Result of the UpdatePolicy operation returned by the service. - `com.amazonaws.services.organizations.model.UpdatePolicyResult`"
  (^com.amazonaws.services.organizations.model.UpdatePolicyResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.UpdatePolicyRequest request]
    (-> this (.updatePolicy request))))

(defn list-handshakes-for-account
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.ListHandshakesForAccountRequest`

  returns: Result of the ListHandshakesForAccount operation returned by the service. - `com.amazonaws.services.organizations.model.ListHandshakesForAccountResult`"
  (^com.amazonaws.services.organizations.model.ListHandshakesForAccountResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.ListHandshakesForAccountRequest request]
    (-> this (.listHandshakesForAccount request))))

(defn describe-account
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.DescribeAccountRequest`

  returns: Result of the DescribeAccount operation returned by the service. - `com.amazonaws.services.organizations.model.DescribeAccountResult`"
  (^com.amazonaws.services.organizations.model.DescribeAccountResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.DescribeAccountRequest request]
    (-> this (.describeAccount request))))

(defn remove-account-from-organization
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.RemoveAccountFromOrganizationRequest`

  returns: Result of the RemoveAccountFromOrganization operation returned by the service. - `com.amazonaws.services.organizations.model.RemoveAccountFromOrganizationResult`"
  (^com.amazonaws.services.organizations.model.RemoveAccountFromOrganizationResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.RemoveAccountFromOrganizationRequest request]
    (-> this (.removeAccountFromOrganization request))))

(defn detach-policy
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.DetachPolicyRequest`

  returns: Result of the DetachPolicy operation returned by the service. - `com.amazonaws.services.organizations.model.DetachPolicyResult`"
  (^com.amazonaws.services.organizations.model.DetachPolicyResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.DetachPolicyRequest request]
    (-> this (.detachPolicy request))))

(defn describe-organization
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.DescribeOrganizationRequest`

  returns: Result of the DescribeOrganization operation returned by the service. - `com.amazonaws.services.organizations.model.DescribeOrganizationResult`"
  (^com.amazonaws.services.organizations.model.DescribeOrganizationResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.DescribeOrganizationRequest request]
    (-> this (.describeOrganization request))))

(defn accept-handshake
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.AcceptHandshakeRequest`

  returns: Result of the AcceptHandshake operation returned by the service. - `com.amazonaws.services.organizations.model.AcceptHandshakeResult`"
  (^com.amazonaws.services.organizations.model.AcceptHandshakeResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.AcceptHandshakeRequest request]
    (-> this (.acceptHandshake request))))

(defn list-policies-for-target
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.ListPoliciesForTargetRequest`

  returns: Result of the ListPoliciesForTarget operation returned by the service. - `com.amazonaws.services.organizations.model.ListPoliciesForTargetResult`"
  (^com.amazonaws.services.organizations.model.ListPoliciesForTargetResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.ListPoliciesForTargetRequest request]
    (-> this (.listPoliciesForTarget request))))

(defn list-accounts
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.ListAccountsRequest`

  returns: Result of the ListAccounts operation returned by the service. - `com.amazonaws.services.organizations.model.ListAccountsResult`"
  (^com.amazonaws.services.organizations.model.ListAccountsResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.ListAccountsRequest request]
    (-> this (.listAccounts request))))

(defn list-create-account-status
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.ListCreateAccountStatusRequest`

  returns: Result of the ListCreateAccountStatus operation returned by the service. - `com.amazonaws.services.organizations.model.ListCreateAccountStatusResult`"
  (^com.amazonaws.services.organizations.model.ListCreateAccountStatusResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.ListCreateAccountStatusRequest request]
    (-> this (.listCreateAccountStatus request))))

(defn enable-policy-type
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.EnablePolicyTypeRequest`

  returns: Result of the EnablePolicyType operation returned by the service. - `com.amazonaws.services.organizations.model.EnablePolicyTypeResult`"
  (^com.amazonaws.services.organizations.model.EnablePolicyTypeResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.EnablePolicyTypeRequest request]
    (-> this (.enablePolicyType request))))

(defn list-accounts-for-parent
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.ListAccountsForParentRequest`

  returns: Result of the ListAccountsForParent operation returned by the service. - `com.amazonaws.services.organizations.model.ListAccountsForParentResult`"
  (^com.amazonaws.services.organizations.model.ListAccountsForParentResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.ListAccountsForParentRequest request]
    (-> this (.listAccountsForParent request))))

(defn cancel-handshake
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.CancelHandshakeRequest`

  returns: Result of the CancelHandshake operation returned by the service. - `com.amazonaws.services.organizations.model.CancelHandshakeResult`"
  (^com.amazonaws.services.organizations.model.CancelHandshakeResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.CancelHandshakeRequest request]
    (-> this (.cancelHandshake request))))

(defn create-policy
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.CreatePolicyRequest`

  returns: Result of the CreatePolicy operation returned by the service. - `com.amazonaws.services.organizations.model.CreatePolicyResult`"
  (^com.amazonaws.services.organizations.model.CreatePolicyResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.CreatePolicyRequest request]
    (-> this (.createPolicy request))))

(defn list-policies
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.ListPoliciesRequest`

  returns: Result of the ListPolicies operation returned by the service. - `com.amazonaws.services.organizations.model.ListPoliciesResult`"
  (^com.amazonaws.services.organizations.model.ListPoliciesResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.ListPoliciesRequest request]
    (-> this (.listPolicies request))))

(defn list-children
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.ListChildrenRequest`

  returns: Result of the ListChildren operation returned by the service. - `com.amazonaws.services.organizations.model.ListChildrenResult`"
  (^com.amazonaws.services.organizations.model.ListChildrenResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.ListChildrenRequest request]
    (-> this (.listChildren request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSOrganizations

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSOrganizations this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn create-organizational-unit
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.CreateOrganizationalUnitRequest`

  returns: Result of the CreateOrganizationalUnit operation returned by the service. - `com.amazonaws.services.organizations.model.CreateOrganizationalUnitResult`"
  (^com.amazonaws.services.organizations.model.CreateOrganizationalUnitResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.CreateOrganizationalUnitRequest request]
    (-> this (.createOrganizationalUnit request))))

(defn create-gov-cloud-account
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.CreateGovCloudAccountRequest`

  returns: Result of the CreateGovCloudAccount operation returned by the service. - `com.amazonaws.services.organizations.model.CreateGovCloudAccountResult`"
  (^com.amazonaws.services.organizations.model.CreateGovCloudAccountResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.CreateGovCloudAccountRequest request]
    (-> this (.createGovCloudAccount request))))

(defn list-aws-service-access-for-organization
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.ListAWSServiceAccessForOrganizationRequest`

  returns: Result of the ListAWSServiceAccessForOrganization operation returned by the service. - `com.amazonaws.services.organizations.model.ListAWSServiceAccessForOrganizationResult`"
  (^com.amazonaws.services.organizations.model.ListAWSServiceAccessForOrganizationResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.ListAWSServiceAccessForOrganizationRequest request]
    (-> this (.listAWSServiceAccessForOrganization request))))

(defn create-organization
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.CreateOrganizationRequest`

  returns: Result of the CreateOrganization operation returned by the service. - `com.amazonaws.services.organizations.model.CreateOrganizationResult`"
  (^com.amazonaws.services.organizations.model.CreateOrganizationResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.CreateOrganizationRequest request]
    (-> this (.createOrganization request))))

(defn describe-handshake
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.DescribeHandshakeRequest`

  returns: Result of the DescribeHandshake operation returned by the service. - `com.amazonaws.services.organizations.model.DescribeHandshakeResult`"
  (^com.amazonaws.services.organizations.model.DescribeHandshakeResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.DescribeHandshakeRequest request]
    (-> this (.describeHandshake request))))

(defn tag-resource
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.organizations.model.TagResourceResult`"
  (^com.amazonaws.services.organizations.model.TagResourceResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn decline-handshake
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.DeclineHandshakeRequest`

  returns: Result of the DeclineHandshake operation returned by the service. - `com.amazonaws.services.organizations.model.DeclineHandshakeResult`"
  (^com.amazonaws.services.organizations.model.DeclineHandshakeResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.DeclineHandshakeRequest request]
    (-> this (.declineHandshake request))))

(defn list-organizational-units-for-parent
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.ListOrganizationalUnitsForParentRequest`

  returns: Result of the ListOrganizationalUnitsForParent operation returned by the service. - `com.amazonaws.services.organizations.model.ListOrganizationalUnitsForParentResult`"
  (^com.amazonaws.services.organizations.model.ListOrganizationalUnitsForParentResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.ListOrganizationalUnitsForParentRequest request]
    (-> this (.listOrganizationalUnitsForParent request))))

(defn describe-create-account-status
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.DescribeCreateAccountStatusRequest`

  returns: Result of the DescribeCreateAccountStatus operation returned by the service. - `com.amazonaws.services.organizations.model.DescribeCreateAccountStatusResult`"
  (^com.amazonaws.services.organizations.model.DescribeCreateAccountStatusResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.DescribeCreateAccountStatusRequest request]
    (-> this (.describeCreateAccountStatus request))))

(defn describe-policy
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.DescribePolicyRequest`

  returns: Result of the DescribePolicy operation returned by the service. - `com.amazonaws.services.organizations.model.DescribePolicyResult`"
  (^com.amazonaws.services.organizations.model.DescribePolicyResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.DescribePolicyRequest request]
    (-> this (.describePolicy request))))

(defn create-account
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.CreateAccountRequest`

  returns: Result of the CreateAccount operation returned by the service. - `com.amazonaws.services.organizations.model.CreateAccountResult`"
  (^com.amazonaws.services.organizations.model.CreateAccountResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.CreateAccountRequest request]
    (-> this (.createAccount request))))

(defn invite-account-to-organization
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.InviteAccountToOrganizationRequest`

  returns: Result of the InviteAccountToOrganization operation returned by the service. - `com.amazonaws.services.organizations.model.InviteAccountToOrganizationResult`"
  (^com.amazonaws.services.organizations.model.InviteAccountToOrganizationResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.InviteAccountToOrganizationRequest request]
    (-> this (.inviteAccountToOrganization request))))

(defn list-roots
  "Description copied from interface: AWSOrganizations

  request - `com.amazonaws.services.organizations.model.ListRootsRequest`

  returns: Result of the ListRoots operation returned by the service. - `com.amazonaws.services.organizations.model.ListRootsResult`"
  (^com.amazonaws.services.organizations.model.ListRootsResult [^AbstractAWSOrganizations this ^com.amazonaws.services.organizations.model.ListRootsRequest request]
    (-> this (.listRoots request))))

