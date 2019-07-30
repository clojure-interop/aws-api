(ns com.amazonaws.services.securityhub.AbstractAWSSecurityHub
  "Abstract implementation of AWSSecurityHub. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.securityhub AbstractAWSSecurityHub]))

(defn list-tags-for-resource
  "Description copied from interface: AWSSecurityHub

  request - `com.amazonaws.services.securityhub.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.securityhub.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.securityhub.model.ListTagsForResourceResult [^AbstractAWSSecurityHub this ^com.amazonaws.services.securityhub.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn describe-products
  "Description copied from interface: AWSSecurityHub

  request - `com.amazonaws.services.securityhub.model.DescribeProductsRequest`

  returns: Result of the DescribeProducts operation returned by the service. - `com.amazonaws.services.securityhub.model.DescribeProductsResult`"
  (^com.amazonaws.services.securityhub.model.DescribeProductsResult [^AbstractAWSSecurityHub this ^com.amazonaws.services.securityhub.model.DescribeProductsRequest request]
    (-> this (.describeProducts request))))

(defn accept-invitation
  "Description copied from interface: AWSSecurityHub

  request - `com.amazonaws.services.securityhub.model.AcceptInvitationRequest`

  returns: Result of the AcceptInvitation operation returned by the service. - `com.amazonaws.services.securityhub.model.AcceptInvitationResult`"
  (^com.amazonaws.services.securityhub.model.AcceptInvitationResult [^AbstractAWSSecurityHub this ^com.amazonaws.services.securityhub.model.AcceptInvitationRequest request]
    (-> this (.acceptInvitation request))))

(defn describe-action-targets
  "Description copied from interface: AWSSecurityHub

  request - `com.amazonaws.services.securityhub.model.DescribeActionTargetsRequest`

  returns: Result of the DescribeActionTargets operation returned by the service. - `com.amazonaws.services.securityhub.model.DescribeActionTargetsResult`"
  (^com.amazonaws.services.securityhub.model.DescribeActionTargetsResult [^AbstractAWSSecurityHub this ^com.amazonaws.services.securityhub.model.DescribeActionTargetsRequest request]
    (-> this (.describeActionTargets request))))

(defn invite-members
  "Description copied from interface: AWSSecurityHub

  request - `com.amazonaws.services.securityhub.model.InviteMembersRequest`

  returns: Result of the InviteMembers operation returned by the service. - `com.amazonaws.services.securityhub.model.InviteMembersResult`"
  (^com.amazonaws.services.securityhub.model.InviteMembersResult [^AbstractAWSSecurityHub this ^com.amazonaws.services.securityhub.model.InviteMembersRequest request]
    (-> this (.inviteMembers request))))

(defn batch-enable-standards
  "Description copied from interface: AWSSecurityHub

  request - `com.amazonaws.services.securityhub.model.BatchEnableStandardsRequest`

  returns: Result of the BatchEnableStandards operation returned by the service. - `com.amazonaws.services.securityhub.model.BatchEnableStandardsResult`"
  (^com.amazonaws.services.securityhub.model.BatchEnableStandardsResult [^AbstractAWSSecurityHub this ^com.amazonaws.services.securityhub.model.BatchEnableStandardsRequest request]
    (-> this (.batchEnableStandards request))))

(defn get-members
  "Description copied from interface: AWSSecurityHub

  request - `com.amazonaws.services.securityhub.model.GetMembersRequest`

  returns: Result of the GetMembers operation returned by the service. - `com.amazonaws.services.securityhub.model.GetMembersResult`"
  (^com.amazonaws.services.securityhub.model.GetMembersResult [^AbstractAWSSecurityHub this ^com.amazonaws.services.securityhub.model.GetMembersRequest request]
    (-> this (.getMembers request))))

(defn get-master-account
  "Description copied from interface: AWSSecurityHub

  request - `com.amazonaws.services.securityhub.model.GetMasterAccountRequest`

  returns: Result of the GetMasterAccount operation returned by the service. - `com.amazonaws.services.securityhub.model.GetMasterAccountResult`"
  (^com.amazonaws.services.securityhub.model.GetMasterAccountResult [^AbstractAWSSecurityHub this ^com.amazonaws.services.securityhub.model.GetMasterAccountRequest request]
    (-> this (.getMasterAccount request))))

(defn disassociate-from-master-account
  "Description copied from interface: AWSSecurityHub

  request - `com.amazonaws.services.securityhub.model.DisassociateFromMasterAccountRequest`

  returns: Result of the DisassociateFromMasterAccount operation returned by the service. - `com.amazonaws.services.securityhub.model.DisassociateFromMasterAccountResult`"
  (^com.amazonaws.services.securityhub.model.DisassociateFromMasterAccountResult [^AbstractAWSSecurityHub this ^com.amazonaws.services.securityhub.model.DisassociateFromMasterAccountRequest request]
    (-> this (.disassociateFromMasterAccount request))))

(defn untag-resource
  "Description copied from interface: AWSSecurityHub

  request - `com.amazonaws.services.securityhub.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.securityhub.model.UntagResourceResult`"
  (^com.amazonaws.services.securityhub.model.UntagResourceResult [^AbstractAWSSecurityHub this ^com.amazonaws.services.securityhub.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn update-insight
  "Description copied from interface: AWSSecurityHub

  request - `com.amazonaws.services.securityhub.model.UpdateInsightRequest`

  returns: Result of the UpdateInsight operation returned by the service. - `com.amazonaws.services.securityhub.model.UpdateInsightResult`"
  (^com.amazonaws.services.securityhub.model.UpdateInsightResult [^AbstractAWSSecurityHub this ^com.amazonaws.services.securityhub.model.UpdateInsightRequest request]
    (-> this (.updateInsight request))))

(defn disable-security-hub
  "Description copied from interface: AWSSecurityHub

  request - `com.amazonaws.services.securityhub.model.DisableSecurityHubRequest`

  returns: Result of the DisableSecurityHub operation returned by the service. - `com.amazonaws.services.securityhub.model.DisableSecurityHubResult`"
  (^com.amazonaws.services.securityhub.model.DisableSecurityHubResult [^AbstractAWSSecurityHub this ^com.amazonaws.services.securityhub.model.DisableSecurityHubRequest request]
    (-> this (.disableSecurityHub request))))

(defn create-action-target
  "Description copied from interface: AWSSecurityHub

  request - `com.amazonaws.services.securityhub.model.CreateActionTargetRequest`

  returns: Result of the CreateActionTarget operation returned by the service. - `com.amazonaws.services.securityhub.model.CreateActionTargetResult`"
  (^com.amazonaws.services.securityhub.model.CreateActionTargetResult [^AbstractAWSSecurityHub this ^com.amazonaws.services.securityhub.model.CreateActionTargetRequest request]
    (-> this (.createActionTarget request))))

(defn batch-import-findings
  "Description copied from interface: AWSSecurityHub

  request - `com.amazonaws.services.securityhub.model.BatchImportFindingsRequest`

  returns: Result of the BatchImportFindings operation returned by the service. - `com.amazonaws.services.securityhub.model.BatchImportFindingsResult`"
  (^com.amazonaws.services.securityhub.model.BatchImportFindingsResult [^AbstractAWSSecurityHub this ^com.amazonaws.services.securityhub.model.BatchImportFindingsRequest request]
    (-> this (.batchImportFindings request))))

(defn describe-hub
  "Description copied from interface: AWSSecurityHub

  request - `com.amazonaws.services.securityhub.model.DescribeHubRequest`

  returns: Result of the DescribeHub operation returned by the service. - `com.amazonaws.services.securityhub.model.DescribeHubResult`"
  (^com.amazonaws.services.securityhub.model.DescribeHubResult [^AbstractAWSSecurityHub this ^com.amazonaws.services.securityhub.model.DescribeHubRequest request]
    (-> this (.describeHub request))))

(defn update-findings
  "Description copied from interface: AWSSecurityHub

  request - `com.amazonaws.services.securityhub.model.UpdateFindingsRequest`

  returns: Result of the UpdateFindings operation returned by the service. - `com.amazonaws.services.securityhub.model.UpdateFindingsResult`"
  (^com.amazonaws.services.securityhub.model.UpdateFindingsResult [^AbstractAWSSecurityHub this ^com.amazonaws.services.securityhub.model.UpdateFindingsRequest request]
    (-> this (.updateFindings request))))

(defn delete-invitations
  "Description copied from interface: AWSSecurityHub

  request - `com.amazonaws.services.securityhub.model.DeleteInvitationsRequest`

  returns: Result of the DeleteInvitations operation returned by the service. - `com.amazonaws.services.securityhub.model.DeleteInvitationsResult`"
  (^com.amazonaws.services.securityhub.model.DeleteInvitationsResult [^AbstractAWSSecurityHub this ^com.amazonaws.services.securityhub.model.DeleteInvitationsRequest request]
    (-> this (.deleteInvitations request))))

(defn get-enabled-standards
  "Description copied from interface: AWSSecurityHub

  request - `com.amazonaws.services.securityhub.model.GetEnabledStandardsRequest`

  returns: Result of the GetEnabledStandards operation returned by the service. - `com.amazonaws.services.securityhub.model.GetEnabledStandardsResult`"
  (^com.amazonaws.services.securityhub.model.GetEnabledStandardsResult [^AbstractAWSSecurityHub this ^com.amazonaws.services.securityhub.model.GetEnabledStandardsRequest request]
    (-> this (.getEnabledStandards request))))

(defn shutdown
  "Description copied from interface: AWSSecurityHub"
  ([^AbstractAWSSecurityHub this]
    (-> this (.shutdown))))

(defn disassociate-members
  "Description copied from interface: AWSSecurityHub

  request - `com.amazonaws.services.securityhub.model.DisassociateMembersRequest`

  returns: Result of the DisassociateMembers operation returned by the service. - `com.amazonaws.services.securityhub.model.DisassociateMembersResult`"
  (^com.amazonaws.services.securityhub.model.DisassociateMembersResult [^AbstractAWSSecurityHub this ^com.amazonaws.services.securityhub.model.DisassociateMembersRequest request]
    (-> this (.disassociateMembers request))))

(defn enable-security-hub
  "Description copied from interface: AWSSecurityHub

  request - `com.amazonaws.services.securityhub.model.EnableSecurityHubRequest`

  returns: Result of the EnableSecurityHub operation returned by the service. - `com.amazonaws.services.securityhub.model.EnableSecurityHubResult`"
  (^com.amazonaws.services.securityhub.model.EnableSecurityHubResult [^AbstractAWSSecurityHub this ^com.amazonaws.services.securityhub.model.EnableSecurityHubRequest request]
    (-> this (.enableSecurityHub request))))

(defn batch-disable-standards
  "Description copied from interface: AWSSecurityHub

  request - `com.amazonaws.services.securityhub.model.BatchDisableStandardsRequest`

  returns: Result of the BatchDisableStandards operation returned by the service. - `com.amazonaws.services.securityhub.model.BatchDisableStandardsResult`"
  (^com.amazonaws.services.securityhub.model.BatchDisableStandardsResult [^AbstractAWSSecurityHub this ^com.amazonaws.services.securityhub.model.BatchDisableStandardsRequest request]
    (-> this (.batchDisableStandards request))))

(defn delete-action-target
  "Description copied from interface: AWSSecurityHub

  request - `com.amazonaws.services.securityhub.model.DeleteActionTargetRequest`

  returns: Result of the DeleteActionTarget operation returned by the service. - `com.amazonaws.services.securityhub.model.DeleteActionTargetResult`"
  (^com.amazonaws.services.securityhub.model.DeleteActionTargetResult [^AbstractAWSSecurityHub this ^com.amazonaws.services.securityhub.model.DeleteActionTargetRequest request]
    (-> this (.deleteActionTarget request))))

(defn get-invitations-count
  "Description copied from interface: AWSSecurityHub

  request - `com.amazonaws.services.securityhub.model.GetInvitationsCountRequest`

  returns: Result of the GetInvitationsCount operation returned by the service. - `com.amazonaws.services.securityhub.model.GetInvitationsCountResult`"
  (^com.amazonaws.services.securityhub.model.GetInvitationsCountResult [^AbstractAWSSecurityHub this ^com.amazonaws.services.securityhub.model.GetInvitationsCountRequest request]
    (-> this (.getInvitationsCount request))))

(defn create-insight
  "Description copied from interface: AWSSecurityHub

  request - `com.amazonaws.services.securityhub.model.CreateInsightRequest`

  returns: Result of the CreateInsight operation returned by the service. - `com.amazonaws.services.securityhub.model.CreateInsightResult`"
  (^com.amazonaws.services.securityhub.model.CreateInsightResult [^AbstractAWSSecurityHub this ^com.amazonaws.services.securityhub.model.CreateInsightRequest request]
    (-> this (.createInsight request))))

(defn list-members
  "Description copied from interface: AWSSecurityHub

  request - `com.amazonaws.services.securityhub.model.ListMembersRequest`

  returns: Result of the ListMembers operation returned by the service. - `com.amazonaws.services.securityhub.model.ListMembersResult`"
  (^com.amazonaws.services.securityhub.model.ListMembersResult [^AbstractAWSSecurityHub this ^com.amazonaws.services.securityhub.model.ListMembersRequest request]
    (-> this (.listMembers request))))

(defn delete-members
  "Description copied from interface: AWSSecurityHub

  request - `com.amazonaws.services.securityhub.model.DeleteMembersRequest`

  returns: Result of the DeleteMembers operation returned by the service. - `com.amazonaws.services.securityhub.model.DeleteMembersResult`"
  (^com.amazonaws.services.securityhub.model.DeleteMembersResult [^AbstractAWSSecurityHub this ^com.amazonaws.services.securityhub.model.DeleteMembersRequest request]
    (-> this (.deleteMembers request))))

(defn get-insight-results
  "Description copied from interface: AWSSecurityHub

  request - `com.amazonaws.services.securityhub.model.GetInsightResultsRequest`

  returns: Result of the GetInsightResults operation returned by the service. - `com.amazonaws.services.securityhub.model.GetInsightResultsResult`"
  (^com.amazonaws.services.securityhub.model.GetInsightResultsResult [^AbstractAWSSecurityHub this ^com.amazonaws.services.securityhub.model.GetInsightResultsRequest request]
    (-> this (.getInsightResults request))))

(defn enable-import-findings-for-product
  "Description copied from interface: AWSSecurityHub

  request - `com.amazonaws.services.securityhub.model.EnableImportFindingsForProductRequest`

  returns: Result of the EnableImportFindingsForProduct operation returned by the service. - `com.amazonaws.services.securityhub.model.EnableImportFindingsForProductResult`"
  (^com.amazonaws.services.securityhub.model.EnableImportFindingsForProductResult [^AbstractAWSSecurityHub this ^com.amazonaws.services.securityhub.model.EnableImportFindingsForProductRequest request]
    (-> this (.enableImportFindingsForProduct request))))

(defn create-members
  "Description copied from interface: AWSSecurityHub

  request - `com.amazonaws.services.securityhub.model.CreateMembersRequest`

  returns: Result of the CreateMembers operation returned by the service. - `com.amazonaws.services.securityhub.model.CreateMembersResult`"
  (^com.amazonaws.services.securityhub.model.CreateMembersResult [^AbstractAWSSecurityHub this ^com.amazonaws.services.securityhub.model.CreateMembersRequest request]
    (-> this (.createMembers request))))

(defn list-enabled-products-for-import
  "Description copied from interface: AWSSecurityHub

  request - `com.amazonaws.services.securityhub.model.ListEnabledProductsForImportRequest`

  returns: Result of the ListEnabledProductsForImport operation returned by the service. - `com.amazonaws.services.securityhub.model.ListEnabledProductsForImportResult`"
  (^com.amazonaws.services.securityhub.model.ListEnabledProductsForImportResult [^AbstractAWSSecurityHub this ^com.amazonaws.services.securityhub.model.ListEnabledProductsForImportRequest request]
    (-> this (.listEnabledProductsForImport request))))

(defn disable-import-findings-for-product
  "Description copied from interface: AWSSecurityHub

  request - `com.amazonaws.services.securityhub.model.DisableImportFindingsForProductRequest`

  returns: Result of the DisableImportFindingsForProduct operation returned by the service. - `com.amazonaws.services.securityhub.model.DisableImportFindingsForProductResult`"
  (^com.amazonaws.services.securityhub.model.DisableImportFindingsForProductResult [^AbstractAWSSecurityHub this ^com.amazonaws.services.securityhub.model.DisableImportFindingsForProductRequest request]
    (-> this (.disableImportFindingsForProduct request))))

(defn update-action-target
  "Description copied from interface: AWSSecurityHub

  request - `com.amazonaws.services.securityhub.model.UpdateActionTargetRequest`

  returns: Result of the UpdateActionTarget operation returned by the service. - `com.amazonaws.services.securityhub.model.UpdateActionTargetResult`"
  (^com.amazonaws.services.securityhub.model.UpdateActionTargetResult [^AbstractAWSSecurityHub this ^com.amazonaws.services.securityhub.model.UpdateActionTargetRequest request]
    (-> this (.updateActionTarget request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSSecurityHub

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSSecurityHub this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-findings
  "Description copied from interface: AWSSecurityHub

  request - `com.amazonaws.services.securityhub.model.GetFindingsRequest`

  returns: Result of the GetFindings operation returned by the service. - `com.amazonaws.services.securityhub.model.GetFindingsResult`"
  (^com.amazonaws.services.securityhub.model.GetFindingsResult [^AbstractAWSSecurityHub this ^com.amazonaws.services.securityhub.model.GetFindingsRequest request]
    (-> this (.getFindings request))))

(defn get-insights
  "Description copied from interface: AWSSecurityHub

  request - `com.amazonaws.services.securityhub.model.GetInsightsRequest`

  returns: Result of the GetInsights operation returned by the service. - `com.amazonaws.services.securityhub.model.GetInsightsResult`"
  (^com.amazonaws.services.securityhub.model.GetInsightsResult [^AbstractAWSSecurityHub this ^com.amazonaws.services.securityhub.model.GetInsightsRequest request]
    (-> this (.getInsights request))))

(defn tag-resource
  "Description copied from interface: AWSSecurityHub

  request - `com.amazonaws.services.securityhub.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.securityhub.model.TagResourceResult`"
  (^com.amazonaws.services.securityhub.model.TagResourceResult [^AbstractAWSSecurityHub this ^com.amazonaws.services.securityhub.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn list-invitations
  "Description copied from interface: AWSSecurityHub

  request - `com.amazonaws.services.securityhub.model.ListInvitationsRequest`

  returns: Result of the ListInvitations operation returned by the service. - `com.amazonaws.services.securityhub.model.ListInvitationsResult`"
  (^com.amazonaws.services.securityhub.model.ListInvitationsResult [^AbstractAWSSecurityHub this ^com.amazonaws.services.securityhub.model.ListInvitationsRequest request]
    (-> this (.listInvitations request))))

(defn delete-insight
  "Description copied from interface: AWSSecurityHub

  request - `com.amazonaws.services.securityhub.model.DeleteInsightRequest`

  returns: Result of the DeleteInsight operation returned by the service. - `com.amazonaws.services.securityhub.model.DeleteInsightResult`"
  (^com.amazonaws.services.securityhub.model.DeleteInsightResult [^AbstractAWSSecurityHub this ^com.amazonaws.services.securityhub.model.DeleteInsightRequest request]
    (-> this (.deleteInsight request))))

(defn decline-invitations
  "Description copied from interface: AWSSecurityHub

  request - `com.amazonaws.services.securityhub.model.DeclineInvitationsRequest`

  returns: Result of the DeclineInvitations operation returned by the service. - `com.amazonaws.services.securityhub.model.DeclineInvitationsResult`"
  (^com.amazonaws.services.securityhub.model.DeclineInvitationsResult [^AbstractAWSSecurityHub this ^com.amazonaws.services.securityhub.model.DeclineInvitationsRequest request]
    (-> this (.declineInvitations request))))

