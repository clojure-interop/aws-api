(ns com.amazonaws.services.organizations.AbstractAWSOrganizationsAsync
  "Abstract implementation of AWSOrganizationsAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.organizations AbstractAWSOrganizationsAsync]))

(defn untag-resource-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn cancel-handshake-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.CancelHandshakeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelHandshake operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.CancelHandshakeResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.CancelHandshakeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelHandshakeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.CancelHandshakeRequest request]
    (-> this (.cancelHandshakeAsync request))))

(defn disable-policy-type-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.DisablePolicyTypeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisablePolicyType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.DisablePolicyTypeResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.DisablePolicyTypeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disablePolicyTypeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.DisablePolicyTypeRequest request]
    (-> this (.disablePolicyTypeAsync request))))

(defn delete-policy-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.DeletePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.DeletePolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.DeletePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.DeletePolicyRequest request]
    (-> this (.deletePolicyAsync request))))

(defn list-parents-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.ListParentsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListParents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.ListParentsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.ListParentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listParentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.ListParentsRequest request]
    (-> this (.listParentsAsync request))))

(defn list-policies-for-target-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.ListPoliciesForTargetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPoliciesForTarget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.ListPoliciesForTargetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.ListPoliciesForTargetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPoliciesForTargetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.ListPoliciesForTargetRequest request]
    (-> this (.listPoliciesForTargetAsync request))))

(defn list-accounts-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.ListAccountsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAccounts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.ListAccountsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.ListAccountsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAccountsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.ListAccountsRequest request]
    (-> this (.listAccountsAsync request))))

(defn invite-account-to-organization-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.InviteAccountToOrganizationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the InviteAccountToOrganization operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.InviteAccountToOrganizationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.InviteAccountToOrganizationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.inviteAccountToOrganizationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.InviteAccountToOrganizationRequest request]
    (-> this (.inviteAccountToOrganizationAsync request))))

(defn update-policy-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.UpdatePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdatePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.UpdatePolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.UpdatePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updatePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.UpdatePolicyRequest request]
    (-> this (.updatePolicyAsync request))))

(defn list-aws-service-access-for-organization-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.ListAWSServiceAccessForOrganizationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAWSServiceAccessForOrganization operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.ListAWSServiceAccessForOrganizationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.ListAWSServiceAccessForOrganizationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAWSServiceAccessForOrganizationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.ListAWSServiceAccessForOrganizationRequest request]
    (-> this (.listAWSServiceAccessForOrganizationAsync request))))

(defn attach-policy-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.AttachPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.AttachPolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.AttachPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.AttachPolicyRequest request]
    (-> this (.attachPolicyAsync request))))

(defn create-policy-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.CreatePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.CreatePolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.CreatePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.CreatePolicyRequest request]
    (-> this (.createPolicyAsync request))))

(defn describe-account-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.DescribeAccountRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.DescribeAccountResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.DescribeAccountRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAccountAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.DescribeAccountRequest request]
    (-> this (.describeAccountAsync request))))

(defn list-handshakes-for-account-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.ListHandshakesForAccountRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListHandshakesForAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.ListHandshakesForAccountResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.ListHandshakesForAccountRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listHandshakesForAccountAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.ListHandshakesForAccountRequest request]
    (-> this (.listHandshakesForAccountAsync request))))

(defn enable-aws-service-access-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.EnableAWSServiceAccessRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableAWSServiceAccess operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.EnableAWSServiceAccessResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.EnableAWSServiceAccessRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableAWSServiceAccessAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.EnableAWSServiceAccessRequest request]
    (-> this (.enableAWSServiceAccessAsync request))))

(defn accept-handshake-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.AcceptHandshakeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AcceptHandshake operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.AcceptHandshakeResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.AcceptHandshakeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.acceptHandshakeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.AcceptHandshakeRequest request]
    (-> this (.acceptHandshakeAsync request))))

(defn describe-handshake-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.DescribeHandshakeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeHandshake operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.DescribeHandshakeResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.DescribeHandshakeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeHandshakeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.DescribeHandshakeRequest request]
    (-> this (.describeHandshakeAsync request))))

(defn detach-policy-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.DetachPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.DetachPolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.DetachPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.DetachPolicyRequest request]
    (-> this (.detachPolicyAsync request))))

(defn delete-organization-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.DeleteOrganizationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteOrganization operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.DeleteOrganizationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.DeleteOrganizationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteOrganizationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.DeleteOrganizationRequest request]
    (-> this (.deleteOrganizationAsync request))))

(defn describe-create-account-status-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.DescribeCreateAccountStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCreateAccountStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.DescribeCreateAccountStatusResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.DescribeCreateAccountStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCreateAccountStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.DescribeCreateAccountStatusRequest request]
    (-> this (.describeCreateAccountStatusAsync request))))

(defn list-children-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.ListChildrenRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListChildren operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.ListChildrenResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.ListChildrenRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listChildrenAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.ListChildrenRequest request]
    (-> this (.listChildrenAsync request))))

(defn describe-policy-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.DescribePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.DescribePolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.DescribePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.DescribePolicyRequest request]
    (-> this (.describePolicyAsync request))))

(defn list-handshakes-for-organization-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.ListHandshakesForOrganizationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListHandshakesForOrganization operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.ListHandshakesForOrganizationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.ListHandshakesForOrganizationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listHandshakesForOrganizationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.ListHandshakesForOrganizationRequest request]
    (-> this (.listHandshakesForOrganizationAsync request))))

(defn leave-organization-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.LeaveOrganizationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the LeaveOrganization operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.LeaveOrganizationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.LeaveOrganizationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.leaveOrganizationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.LeaveOrganizationRequest request]
    (-> this (.leaveOrganizationAsync request))))

(defn list-create-account-status-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.ListCreateAccountStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListCreateAccountStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.ListCreateAccountStatusResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.ListCreateAccountStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listCreateAccountStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.ListCreateAccountStatusRequest request]
    (-> this (.listCreateAccountStatusAsync request))))

(defn list-roots-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.ListRootsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRoots operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.ListRootsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.ListRootsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRootsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.ListRootsRequest request]
    (-> this (.listRootsAsync request))))

(defn list-targets-for-policy-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.ListTargetsForPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTargetsForPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.ListTargetsForPolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.ListTargetsForPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTargetsForPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.ListTargetsForPolicyRequest request]
    (-> this (.listTargetsForPolicyAsync request))))

(defn enable-policy-type-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.EnablePolicyTypeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnablePolicyType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.EnablePolicyTypeResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.EnablePolicyTypeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enablePolicyTypeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.EnablePolicyTypeRequest request]
    (-> this (.enablePolicyTypeAsync request))))

(defn list-policies-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.ListPoliciesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.ListPoliciesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.ListPoliciesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPoliciesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.ListPoliciesRequest request]
    (-> this (.listPoliciesAsync request))))

(defn list-accounts-for-parent-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.ListAccountsForParentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAccountsForParent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.ListAccountsForParentResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.ListAccountsForParentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAccountsForParentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.ListAccountsForParentRequest request]
    (-> this (.listAccountsForParentAsync request))))

(defn create-gov-cloud-account-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.CreateGovCloudAccountRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateGovCloudAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.CreateGovCloudAccountResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.CreateGovCloudAccountRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createGovCloudAccountAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.CreateGovCloudAccountRequest request]
    (-> this (.createGovCloudAccountAsync request))))

(defn describe-organizational-unit-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.DescribeOrganizationalUnitRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeOrganizationalUnit operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.DescribeOrganizationalUnitResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.DescribeOrganizationalUnitRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeOrganizationalUnitAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.DescribeOrganizationalUnitRequest request]
    (-> this (.describeOrganizationalUnitAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn list-organizational-units-for-parent-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.ListOrganizationalUnitsForParentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListOrganizationalUnitsForParent operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.ListOrganizationalUnitsForParentResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.ListOrganizationalUnitsForParentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listOrganizationalUnitsForParentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.ListOrganizationalUnitsForParentRequest request]
    (-> this (.listOrganizationalUnitsForParentAsync request))))

(defn create-account-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.CreateAccountRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.CreateAccountResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.CreateAccountRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAccountAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.CreateAccountRequest request]
    (-> this (.createAccountAsync request))))

(defn enable-all-features-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.EnableAllFeaturesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableAllFeatures operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.EnableAllFeaturesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.EnableAllFeaturesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableAllFeaturesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.EnableAllFeaturesRequest request]
    (-> this (.enableAllFeaturesAsync request))))

(defn decline-handshake-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.DeclineHandshakeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeclineHandshake operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.DeclineHandshakeResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.DeclineHandshakeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.declineHandshakeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.DeclineHandshakeRequest request]
    (-> this (.declineHandshakeAsync request))))

(defn update-organizational-unit-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.UpdateOrganizationalUnitRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateOrganizationalUnit operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.UpdateOrganizationalUnitResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.UpdateOrganizationalUnitRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateOrganizationalUnitAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.UpdateOrganizationalUnitRequest request]
    (-> this (.updateOrganizationalUnitAsync request))))

(defn create-organizational-unit-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.CreateOrganizationalUnitRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateOrganizationalUnit operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.CreateOrganizationalUnitResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.CreateOrganizationalUnitRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createOrganizationalUnitAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.CreateOrganizationalUnitRequest request]
    (-> this (.createOrganizationalUnitAsync request))))

(defn move-account-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.MoveAccountRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the MoveAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.MoveAccountResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.MoveAccountRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.moveAccountAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.MoveAccountRequest request]
    (-> this (.moveAccountAsync request))))

(defn describe-organization-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.DescribeOrganizationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeOrganization operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.DescribeOrganizationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.DescribeOrganizationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeOrganizationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.DescribeOrganizationRequest request]
    (-> this (.describeOrganizationAsync request))))

(defn disable-aws-service-access-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.DisableAWSServiceAccessRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableAWSServiceAccess operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.DisableAWSServiceAccessResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.DisableAWSServiceAccessRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableAWSServiceAccessAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.DisableAWSServiceAccessRequest request]
    (-> this (.disableAWSServiceAccessAsync request))))

(defn tag-resource-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn delete-organizational-unit-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.DeleteOrganizationalUnitRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteOrganizationalUnit operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.DeleteOrganizationalUnitResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.DeleteOrganizationalUnitRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteOrganizationalUnitAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.DeleteOrganizationalUnitRequest request]
    (-> this (.deleteOrganizationalUnitAsync request))))

(defn create-organization-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.CreateOrganizationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateOrganization operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.CreateOrganizationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.CreateOrganizationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createOrganizationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.CreateOrganizationRequest request]
    (-> this (.createOrganizationAsync request))))

(defn remove-account-from-organization-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.RemoveAccountFromOrganizationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveAccountFromOrganization operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.RemoveAccountFromOrganizationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.RemoveAccountFromOrganizationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeAccountFromOrganizationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOrganizationsAsync this ^com.amazonaws.services.organizations.model.RemoveAccountFromOrganizationRequest request]
    (-> this (.removeAccountFromOrganizationAsync request))))

