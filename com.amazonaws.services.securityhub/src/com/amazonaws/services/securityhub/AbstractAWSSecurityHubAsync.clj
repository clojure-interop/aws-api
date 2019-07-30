(ns com.amazonaws.services.securityhub.AbstractAWSSecurityHubAsync
  "Abstract implementation of AWSSecurityHubAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.securityhub AbstractAWSSecurityHubAsync]))

(defn delete-insight-async
  "Description copied from interface: AWSSecurityHubAsync

  request - `com.amazonaws.services.securityhub.model.DeleteInsightRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteInsight operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.DeleteInsightResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DeleteInsightRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteInsightAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DeleteInsightRequest request]
    (-> this (.deleteInsightAsync request))))

(defn untag-resource-async
  "Description copied from interface: AWSSecurityHubAsync

  request - `com.amazonaws.services.securityhub.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn list-invitations-async
  "Description copied from interface: AWSSecurityHubAsync

  request - `com.amazonaws.services.securityhub.model.ListInvitationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListInvitations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.ListInvitationsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.ListInvitationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listInvitationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.ListInvitationsRequest request]
    (-> this (.listInvitationsAsync request))))

(defn update-insight-async
  "Description copied from interface: AWSSecurityHubAsync

  request - `com.amazonaws.services.securityhub.model.UpdateInsightRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateInsight operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.UpdateInsightResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.UpdateInsightRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateInsightAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.UpdateInsightRequest request]
    (-> this (.updateInsightAsync request))))

(defn describe-products-async
  "Description copied from interface: AWSSecurityHubAsync

  request - `com.amazonaws.services.securityhub.model.DescribeProductsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeProducts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.DescribeProductsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DescribeProductsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeProductsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DescribeProductsRequest request]
    (-> this (.describeProductsAsync request))))

(defn disable-security-hub-async
  "Description copied from interface: AWSSecurityHubAsync

  request - `com.amazonaws.services.securityhub.model.DisableSecurityHubRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableSecurityHub operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.DisableSecurityHubResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DisableSecurityHubRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableSecurityHubAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DisableSecurityHubRequest request]
    (-> this (.disableSecurityHubAsync request))))

(defn invite-members-async
  "Description copied from interface: AWSSecurityHubAsync

  request - `com.amazonaws.services.securityhub.model.InviteMembersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the InviteMembers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.InviteMembersResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.InviteMembersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.inviteMembersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.InviteMembersRequest request]
    (-> this (.inviteMembersAsync request))))

(defn create-insight-async
  "Description copied from interface: AWSSecurityHubAsync

  request - `com.amazonaws.services.securityhub.model.CreateInsightRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateInsight operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.CreateInsightResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.CreateInsightRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createInsightAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.CreateInsightRequest request]
    (-> this (.createInsightAsync request))))

(defn batch-enable-standards-async
  "Description copied from interface: AWSSecurityHubAsync

  request - `com.amazonaws.services.securityhub.model.BatchEnableStandardsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchEnableStandards operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.BatchEnableStandardsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.BatchEnableStandardsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchEnableStandardsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.BatchEnableStandardsRequest request]
    (-> this (.batchEnableStandardsAsync request))))

(defn disable-import-findings-for-product-async
  "Description copied from interface: AWSSecurityHubAsync

  request - `com.amazonaws.services.securityhub.model.DisableImportFindingsForProductRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableImportFindingsForProduct operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.DisableImportFindingsForProductResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DisableImportFindingsForProductRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableImportFindingsForProductAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DisableImportFindingsForProductRequest request]
    (-> this (.disableImportFindingsForProductAsync request))))

(defn list-enabled-products-for-import-async
  "Description copied from interface: AWSSecurityHubAsync

  request - `com.amazonaws.services.securityhub.model.ListEnabledProductsForImportRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListEnabledProductsForImport operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.ListEnabledProductsForImportResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.ListEnabledProductsForImportRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listEnabledProductsForImportAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.ListEnabledProductsForImportRequest request]
    (-> this (.listEnabledProductsForImportAsync request))))

(defn create-action-target-async
  "Description copied from interface: AWSSecurityHubAsync

  request - `com.amazonaws.services.securityhub.model.CreateActionTargetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateActionTarget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.CreateActionTargetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.CreateActionTargetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createActionTargetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.CreateActionTargetRequest request]
    (-> this (.createActionTargetAsync request))))

(defn get-findings-async
  "Description copied from interface: AWSSecurityHubAsync

  request - `com.amazonaws.services.securityhub.model.GetFindingsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFindings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.GetFindingsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.GetFindingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFindingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.GetFindingsRequest request]
    (-> this (.getFindingsAsync request))))

(defn list-members-async
  "Description copied from interface: AWSSecurityHubAsync

  request - `com.amazonaws.services.securityhub.model.ListMembersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListMembers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.ListMembersResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.ListMembersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listMembersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.ListMembersRequest request]
    (-> this (.listMembersAsync request))))

(defn enable-import-findings-for-product-async
  "Description copied from interface: AWSSecurityHubAsync

  request - `com.amazonaws.services.securityhub.model.EnableImportFindingsForProductRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableImportFindingsForProduct operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.EnableImportFindingsForProductResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.EnableImportFindingsForProductRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableImportFindingsForProductAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.EnableImportFindingsForProductRequest request]
    (-> this (.enableImportFindingsForProductAsync request))))

(defn delete-members-async
  "Description copied from interface: AWSSecurityHubAsync

  request - `com.amazonaws.services.securityhub.model.DeleteMembersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteMembers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.DeleteMembersResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DeleteMembersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteMembersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DeleteMembersRequest request]
    (-> this (.deleteMembersAsync request))))

(defn get-insight-results-async
  "Description copied from interface: AWSSecurityHubAsync

  request - `com.amazonaws.services.securityhub.model.GetInsightResultsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetInsightResults operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.GetInsightResultsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.GetInsightResultsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getInsightResultsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.GetInsightResultsRequest request]
    (-> this (.getInsightResultsAsync request))))

(defn disassociate-members-async
  "Description copied from interface: AWSSecurityHubAsync

  request - `com.amazonaws.services.securityhub.model.DisassociateMembersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateMembers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.DisassociateMembersResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DisassociateMembersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateMembersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DisassociateMembersRequest request]
    (-> this (.disassociateMembersAsync request))))

(defn batch-disable-standards-async
  "Description copied from interface: AWSSecurityHubAsync

  request - `com.amazonaws.services.securityhub.model.BatchDisableStandardsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchDisableStandards operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.BatchDisableStandardsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.BatchDisableStandardsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchDisableStandardsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.BatchDisableStandardsRequest request]
    (-> this (.batchDisableStandardsAsync request))))

(defn delete-invitations-async
  "Description copied from interface: AWSSecurityHubAsync

  request - `com.amazonaws.services.securityhub.model.DeleteInvitationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteInvitations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.DeleteInvitationsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DeleteInvitationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteInvitationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DeleteInvitationsRequest request]
    (-> this (.deleteInvitationsAsync request))))

(defn delete-action-target-async
  "Description copied from interface: AWSSecurityHubAsync

  request - `com.amazonaws.services.securityhub.model.DeleteActionTargetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteActionTarget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.DeleteActionTargetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DeleteActionTargetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteActionTargetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DeleteActionTargetRequest request]
    (-> this (.deleteActionTargetAsync request))))

(defn update-findings-async
  "Description copied from interface: AWSSecurityHubAsync

  request - `com.amazonaws.services.securityhub.model.UpdateFindingsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateFindings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.UpdateFindingsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.UpdateFindingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateFindingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.UpdateFindingsRequest request]
    (-> this (.updateFindingsAsync request))))

(defn describe-hub-async
  "Description copied from interface: AWSSecurityHubAsync

  request - `com.amazonaws.services.securityhub.model.DescribeHubRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeHub operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.DescribeHubResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DescribeHubRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeHubAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DescribeHubRequest request]
    (-> this (.describeHubAsync request))))

(defn decline-invitations-async
  "Description copied from interface: AWSSecurityHubAsync

  request - `com.amazonaws.services.securityhub.model.DeclineInvitationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeclineInvitations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.DeclineInvitationsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DeclineInvitationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.declineInvitationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DeclineInvitationsRequest request]
    (-> this (.declineInvitationsAsync request))))

(defn enable-security-hub-async
  "Description copied from interface: AWSSecurityHubAsync

  request - `com.amazonaws.services.securityhub.model.EnableSecurityHubRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableSecurityHub operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.EnableSecurityHubResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.EnableSecurityHubRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableSecurityHubAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.EnableSecurityHubRequest request]
    (-> this (.enableSecurityHubAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AWSSecurityHubAsync

  request - `com.amazonaws.services.securityhub.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn update-action-target-async
  "Description copied from interface: AWSSecurityHubAsync

  request - `com.amazonaws.services.securityhub.model.UpdateActionTargetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateActionTarget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.UpdateActionTargetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.UpdateActionTargetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateActionTargetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.UpdateActionTargetRequest request]
    (-> this (.updateActionTargetAsync request))))

(defn disassociate-from-master-account-async
  "Description copied from interface: AWSSecurityHubAsync

  request - `com.amazonaws.services.securityhub.model.DisassociateFromMasterAccountRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateFromMasterAccount operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.DisassociateFromMasterAccountResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DisassociateFromMasterAccountRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateFromMasterAccountAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DisassociateFromMasterAccountRequest request]
    (-> this (.disassociateFromMasterAccountAsync request))))

(defn get-invitations-count-async
  "Description copied from interface: AWSSecurityHubAsync

  request - `com.amazonaws.services.securityhub.model.GetInvitationsCountRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetInvitationsCount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.GetInvitationsCountResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.GetInvitationsCountRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getInvitationsCountAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.GetInvitationsCountRequest request]
    (-> this (.getInvitationsCountAsync request))))

(defn batch-import-findings-async
  "Description copied from interface: AWSSecurityHubAsync

  request - `com.amazonaws.services.securityhub.model.BatchImportFindingsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchImportFindings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.BatchImportFindingsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.BatchImportFindingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchImportFindingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.BatchImportFindingsRequest request]
    (-> this (.batchImportFindingsAsync request))))

(defn get-insights-async
  "Description copied from interface: AWSSecurityHubAsync

  request - `com.amazonaws.services.securityhub.model.GetInsightsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetInsights operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.GetInsightsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.GetInsightsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getInsightsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.GetInsightsRequest request]
    (-> this (.getInsightsAsync request))))

(defn accept-invitation-async
  "Description copied from interface: AWSSecurityHubAsync

  request - `com.amazonaws.services.securityhub.model.AcceptInvitationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AcceptInvitation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.AcceptInvitationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.AcceptInvitationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.acceptInvitationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.AcceptInvitationRequest request]
    (-> this (.acceptInvitationAsync request))))

(defn get-members-async
  "Description copied from interface: AWSSecurityHubAsync

  request - `com.amazonaws.services.securityhub.model.GetMembersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMembers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.GetMembersResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.GetMembersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMembersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.GetMembersRequest request]
    (-> this (.getMembersAsync request))))

(defn get-master-account-async
  "Description copied from interface: AWSSecurityHubAsync

  request - `com.amazonaws.services.securityhub.model.GetMasterAccountRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMasterAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.GetMasterAccountResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.GetMasterAccountRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMasterAccountAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.GetMasterAccountRequest request]
    (-> this (.getMasterAccountAsync request))))

(defn get-enabled-standards-async
  "Description copied from interface: AWSSecurityHubAsync

  request - `com.amazonaws.services.securityhub.model.GetEnabledStandardsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetEnabledStandards operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.GetEnabledStandardsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.GetEnabledStandardsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getEnabledStandardsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.GetEnabledStandardsRequest request]
    (-> this (.getEnabledStandardsAsync request))))

(defn tag-resource-async
  "Description copied from interface: AWSSecurityHubAsync

  request - `com.amazonaws.services.securityhub.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn create-members-async
  "Description copied from interface: AWSSecurityHubAsync

  request - `com.amazonaws.services.securityhub.model.CreateMembersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateMembers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.CreateMembersResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.CreateMembersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createMembersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.CreateMembersRequest request]
    (-> this (.createMembersAsync request))))

(defn describe-action-targets-async
  "Description copied from interface: AWSSecurityHubAsync

  request - `com.amazonaws.services.securityhub.model.DescribeActionTargetsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeActionTargets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.DescribeActionTargetsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DescribeActionTargetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeActionTargetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DescribeActionTargetsRequest request]
    (-> this (.describeActionTargetsAsync request))))

