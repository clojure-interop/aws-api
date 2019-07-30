(ns com.amazonaws.services.securityhub.AWSSecurityHubClient
  "Client for accessing AWS SecurityHub. All service calls made using this client are blocking, and will not return
  until the service call completes.


  Security Hub provides you with a comprehensive view of the security state of your AWS environment and resources. It
  also provides you with the compliance status of your environment based on CIS AWS Foundations compliance checks.
  Security Hub collects security data from AWS accounts, services, and integrated third-party products and helps you
  analyze security trends in your environment to identify the highest priority security issues. For more information
  about Security Hub, see the  AWS Security Hub User
  Guide .


  When you use operations in the Security Hub API, the requests are executed only in the AWS Region that is currently
  active or in the specific AWS Region that you specify in your request. Any configuration or settings change that
  results from the operation is applied only to that Region. To make the same change in other Regions, execute the same
  command for each Region to apply the change to. For example, if your Region is set to us-west-2, when
  you use CreateMembers to add a member account to Security Hub, the association of the member account
  with the master account is created only in the us-west-2 Region. Security Hub must be enabled for the member account
  in the same Region that the invite was sent from."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.securityhub AWSSecurityHubClient]))

(defn *builder
  "returns: `com.amazonaws.services.securityhub.AWSSecurityHubClientBuilder`"
  (^com.amazonaws.services.securityhub.AWSSecurityHubClientBuilder []
    (AWSSecurityHubClient/builder )))

(defn list-tags-for-resource
  "Returns a list of tags associated with a resource.

  request - `com.amazonaws.services.securityhub.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.securityhub.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.securityhub.model.InternalException - Internal server error."
  (^com.amazonaws.services.securityhub.model.ListTagsForResourceResult [^AWSSecurityHubClient this ^com.amazonaws.services.securityhub.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn describe-products
  "Returns information about the products available that you can subscribe to and integrate with Security Hub to
   consolidate findings.

  request - `com.amazonaws.services.securityhub.model.DescribeProductsRequest`

  returns: Result of the DescribeProducts operation returned by the service. - `com.amazonaws.services.securityhub.model.DescribeProductsResult`

  throws: com.amazonaws.services.securityhub.model.InternalException - Internal server error."
  (^com.amazonaws.services.securityhub.model.DescribeProductsResult [^AWSSecurityHubClient this ^com.amazonaws.services.securityhub.model.DescribeProductsRequest request]
    (-> this (.describeProducts request))))

(defn accept-invitation
  "Accepts the invitation to be a member account and be monitored by the Security Hub master account that the
   invitation was sent from. When the member account accepts the invitation, permission is granted to the master
   account to view findings generated in the member account.

  request - `com.amazonaws.services.securityhub.model.AcceptInvitationRequest`

  returns: Result of the AcceptInvitation operation returned by the service. - `com.amazonaws.services.securityhub.model.AcceptInvitationResult`

  throws: com.amazonaws.services.securityhub.model.InternalException - Internal server error."
  (^com.amazonaws.services.securityhub.model.AcceptInvitationResult [^AWSSecurityHubClient this ^com.amazonaws.services.securityhub.model.AcceptInvitationRequest request]
    (-> this (.acceptInvitation request))))

(defn describe-action-targets
  "Returns a list of the custom action targets in Security Hub in your account.

  request - `com.amazonaws.services.securityhub.model.DescribeActionTargetsRequest`

  returns: Result of the DescribeActionTargets operation returned by the service. - `com.amazonaws.services.securityhub.model.DescribeActionTargetsResult`

  throws: com.amazonaws.services.securityhub.model.InternalException - Internal server error."
  (^com.amazonaws.services.securityhub.model.DescribeActionTargetsResult [^AWSSecurityHubClient this ^com.amazonaws.services.securityhub.model.DescribeActionTargetsRequest request]
    (-> this (.describeActionTargets request))))

(defn invite-members
  "Invites other AWS accounts to become member accounts for the Security Hub master account that the invitation is
   sent from. Before you can use this action to invite a member, you must first create the member account in
   Security Hub by using the CreateMembers action. When the account owner accepts the invitation to become a
   member account and enables Security Hub, the master account can view the findings generated from member account.

  request - `com.amazonaws.services.securityhub.model.InviteMembersRequest`

  returns: Result of the InviteMembers operation returned by the service. - `com.amazonaws.services.securityhub.model.InviteMembersResult`

  throws: com.amazonaws.services.securityhub.model.InternalException - Internal server error."
  (^com.amazonaws.services.securityhub.model.InviteMembersResult [^AWSSecurityHubClient this ^com.amazonaws.services.securityhub.model.InviteMembersRequest request]
    (-> this (.inviteMembers request))))

(defn batch-enable-standards
  "Enables the standards specified by the provided standardsArn. In this release, only CIS AWS
   Foundations standards are supported. For more information, see Standards Supported in
   AWS Security Hub.

  request - `com.amazonaws.services.securityhub.model.BatchEnableStandardsRequest`

  returns: Result of the BatchEnableStandards operation returned by the service. - `com.amazonaws.services.securityhub.model.BatchEnableStandardsResult`

  throws: com.amazonaws.services.securityhub.model.InternalException - Internal server error."
  (^com.amazonaws.services.securityhub.model.BatchEnableStandardsResult [^AWSSecurityHubClient this ^com.amazonaws.services.securityhub.model.BatchEnableStandardsRequest request]
    (-> this (.batchEnableStandards request))))

(defn get-members
  "Returns the details on the Security Hub member accounts that the account IDs specify.

  request - `com.amazonaws.services.securityhub.model.GetMembersRequest`

  returns: Result of the GetMembers operation returned by the service. - `com.amazonaws.services.securityhub.model.GetMembersResult`

  throws: com.amazonaws.services.securityhub.model.InternalException - Internal server error."
  (^com.amazonaws.services.securityhub.model.GetMembersResult [^AWSSecurityHubClient this ^com.amazonaws.services.securityhub.model.GetMembersRequest request]
    (-> this (.getMembers request))))

(defn get-master-account
  "Provides the details for the Security Hub master account to the current member account.

  request - `com.amazonaws.services.securityhub.model.GetMasterAccountRequest`

  returns: Result of the GetMasterAccount operation returned by the service. - `com.amazonaws.services.securityhub.model.GetMasterAccountResult`

  throws: com.amazonaws.services.securityhub.model.InternalException - Internal server error."
  (^com.amazonaws.services.securityhub.model.GetMasterAccountResult [^AWSSecurityHubClient this ^com.amazonaws.services.securityhub.model.GetMasterAccountRequest request]
    (-> this (.getMasterAccount request))))

(defn disassociate-from-master-account
  "Disassociates the current Security Hub member account from the associated master account.

  request - `com.amazonaws.services.securityhub.model.DisassociateFromMasterAccountRequest`

  returns: Result of the DisassociateFromMasterAccount operation returned by the service. - `com.amazonaws.services.securityhub.model.DisassociateFromMasterAccountResult`

  throws: com.amazonaws.services.securityhub.model.InternalException - Internal server error."
  (^com.amazonaws.services.securityhub.model.DisassociateFromMasterAccountResult [^AWSSecurityHubClient this ^com.amazonaws.services.securityhub.model.DisassociateFromMasterAccountRequest request]
    (-> this (.disassociateFromMasterAccount request))))

(defn untag-resource
  "Removes one or more tags from a resource.

  request - `com.amazonaws.services.securityhub.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.securityhub.model.UntagResourceResult`

  throws: com.amazonaws.services.securityhub.model.InternalException - Internal server error."
  (^com.amazonaws.services.securityhub.model.UntagResourceResult [^AWSSecurityHubClient this ^com.amazonaws.services.securityhub.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn update-insight
  "Updates the Security Hub insight that the insight ARN specifies.

  request - `com.amazonaws.services.securityhub.model.UpdateInsightRequest`

  returns: Result of the UpdateInsight operation returned by the service. - `com.amazonaws.services.securityhub.model.UpdateInsightResult`

  throws: com.amazonaws.services.securityhub.model.InternalException - Internal server error."
  (^com.amazonaws.services.securityhub.model.UpdateInsightResult [^AWSSecurityHubClient this ^com.amazonaws.services.securityhub.model.UpdateInsightRequest request]
    (-> this (.updateInsight request))))

(defn disable-security-hub
  "Disables Security Hub in your account only in the current Region. To disable Security Hub in all Regions, you
   must submit one request per Region where you have enabled Security Hub. When you disable Security Hub for a
   master account, it doesn't disable Security Hub for any associated member accounts.


   When you disable Security Hub, your existing findings and insights and any Security Hub configuration settings
   are deleted after 90 days and can't be recovered. Any standards that were enabled are disabled, and your master
   and member account associations are removed. If you want to save your existing findings, you must export them
   before you disable Security Hub.

  request - `com.amazonaws.services.securityhub.model.DisableSecurityHubRequest`

  returns: Result of the DisableSecurityHub operation returned by the service. - `com.amazonaws.services.securityhub.model.DisableSecurityHubResult`

  throws: com.amazonaws.services.securityhub.model.InternalException - Internal server error."
  (^com.amazonaws.services.securityhub.model.DisableSecurityHubResult [^AWSSecurityHubClient this ^com.amazonaws.services.securityhub.model.DisableSecurityHubRequest request]
    (-> this (.disableSecurityHub request))))

(defn create-action-target
  "Creates a custom action target in Security Hub. You can use custom actions on findings and insights in Security
   Hub to trigger target actions in Amazon CloudWatch Events.

  request - `com.amazonaws.services.securityhub.model.CreateActionTargetRequest`

  returns: Result of the CreateActionTarget operation returned by the service. - `com.amazonaws.services.securityhub.model.CreateActionTargetResult`

  throws: com.amazonaws.services.securityhub.model.InternalException - Internal server error."
  (^com.amazonaws.services.securityhub.model.CreateActionTargetResult [^AWSSecurityHubClient this ^com.amazonaws.services.securityhub.model.CreateActionTargetRequest request]
    (-> this (.createActionTarget request))))

(defn batch-import-findings
  "Imports security findings generated from an integrated third-party product into Security Hub. This action is
   requested by the integrated product to import its findings into Security Hub. The maximum allowed size for a
   finding is 240 Kb. An error is returned for any finding larger than 240 Kb.

  request - `com.amazonaws.services.securityhub.model.BatchImportFindingsRequest`

  returns: Result of the BatchImportFindings operation returned by the service. - `com.amazonaws.services.securityhub.model.BatchImportFindingsResult`

  throws: com.amazonaws.services.securityhub.model.InternalException - Internal server error."
  (^com.amazonaws.services.securityhub.model.BatchImportFindingsResult [^AWSSecurityHubClient this ^com.amazonaws.services.securityhub.model.BatchImportFindingsRequest request]
    (-> this (.batchImportFindings request))))

(defn describe-hub
  "Returns details about the Hub resource in your account, including the HubArn and the time when you
   enabled Security Hub.

  request - `com.amazonaws.services.securityhub.model.DescribeHubRequest`

  returns: Result of the DescribeHub operation returned by the service. - `com.amazonaws.services.securityhub.model.DescribeHubResult`

  throws: com.amazonaws.services.securityhub.model.InternalException - Internal server error."
  (^com.amazonaws.services.securityhub.model.DescribeHubResult [^AWSSecurityHubClient this ^com.amazonaws.services.securityhub.model.DescribeHubRequest request]
    (-> this (.describeHub request))))

(defn update-findings
  "Updates the Note and RecordState of the Security Hub-aggregated findings that the
   filter attributes specify. Any member account that can view the finding also sees the update to the finding.

  request - `com.amazonaws.services.securityhub.model.UpdateFindingsRequest`

  returns: Result of the UpdateFindings operation returned by the service. - `com.amazonaws.services.securityhub.model.UpdateFindingsResult`

  throws: com.amazonaws.services.securityhub.model.InternalException - Internal server error."
  (^com.amazonaws.services.securityhub.model.UpdateFindingsResult [^AWSSecurityHubClient this ^com.amazonaws.services.securityhub.model.UpdateFindingsRequest request]
    (-> this (.updateFindings request))))

(defn delete-invitations
  "Deletes invitations received by the AWS account to become a member account.

  request - `com.amazonaws.services.securityhub.model.DeleteInvitationsRequest`

  returns: Result of the DeleteInvitations operation returned by the service. - `com.amazonaws.services.securityhub.model.DeleteInvitationsResult`

  throws: com.amazonaws.services.securityhub.model.InternalException - Internal server error."
  (^com.amazonaws.services.securityhub.model.DeleteInvitationsResult [^AWSSecurityHubClient this ^com.amazonaws.services.securityhub.model.DeleteInvitationsRequest request]
    (-> this (.deleteInvitations request))))

(defn get-enabled-standards
  "Returns a list of the standards that are currently enabled.

  request - `com.amazonaws.services.securityhub.model.GetEnabledStandardsRequest`

  returns: Result of the GetEnabledStandards operation returned by the service. - `com.amazonaws.services.securityhub.model.GetEnabledStandardsResult`

  throws: com.amazonaws.services.securityhub.model.InternalException - Internal server error."
  (^com.amazonaws.services.securityhub.model.GetEnabledStandardsResult [^AWSSecurityHubClient this ^com.amazonaws.services.securityhub.model.GetEnabledStandardsRequest request]
    (-> this (.getEnabledStandards request))))

(defn disassociate-members
  "Disassociates the specified member accounts from the associated master account.

  request - `com.amazonaws.services.securityhub.model.DisassociateMembersRequest`

  returns: Result of the DisassociateMembers operation returned by the service. - `com.amazonaws.services.securityhub.model.DisassociateMembersResult`

  throws: com.amazonaws.services.securityhub.model.InternalException - Internal server error."
  (^com.amazonaws.services.securityhub.model.DisassociateMembersResult [^AWSSecurityHubClient this ^com.amazonaws.services.securityhub.model.DisassociateMembersRequest request]
    (-> this (.disassociateMembers request))))

(defn enable-security-hub
  "Enables Security Hub for your account in the current Region or the Region you specify in the request. When you
   enable Security Hub, you grant to Security Hub the permissions necessary to gather findings from AWS Config,
   Amazon GuardDuty, Amazon Inspector, and Amazon Macie. To learn more, see Setting Up AWS
   Security Hub.

  request - `com.amazonaws.services.securityhub.model.EnableSecurityHubRequest`

  returns: Result of the EnableSecurityHub operation returned by the service. - `com.amazonaws.services.securityhub.model.EnableSecurityHubResult`

  throws: com.amazonaws.services.securityhub.model.InternalException - Internal server error."
  (^com.amazonaws.services.securityhub.model.EnableSecurityHubResult [^AWSSecurityHubClient this ^com.amazonaws.services.securityhub.model.EnableSecurityHubRequest request]
    (-> this (.enableSecurityHub request))))

(defn batch-disable-standards
  "Disables the standards specified by the provided StandardsSubscriptionArns. For more information,
   see Standards
   Supported in AWS Security Hub.

  request - `com.amazonaws.services.securityhub.model.BatchDisableStandardsRequest`

  returns: Result of the BatchDisableStandards operation returned by the service. - `com.amazonaws.services.securityhub.model.BatchDisableStandardsResult`

  throws: com.amazonaws.services.securityhub.model.InternalException - Internal server error."
  (^com.amazonaws.services.securityhub.model.BatchDisableStandardsResult [^AWSSecurityHubClient this ^com.amazonaws.services.securityhub.model.BatchDisableStandardsRequest request]
    (-> this (.batchDisableStandards request))))

(defn delete-action-target
  "Deletes a custom action target from Security Hub. Deleting a custom action target doesn't affect any findings or
   insights that were already sent to Amazon CloudWatch Events using the custom action.

  request - `com.amazonaws.services.securityhub.model.DeleteActionTargetRequest`

  returns: Result of the DeleteActionTarget operation returned by the service. - `com.amazonaws.services.securityhub.model.DeleteActionTargetResult`

  throws: com.amazonaws.services.securityhub.model.InternalException - Internal server error."
  (^com.amazonaws.services.securityhub.model.DeleteActionTargetResult [^AWSSecurityHubClient this ^com.amazonaws.services.securityhub.model.DeleteActionTargetRequest request]
    (-> this (.deleteActionTarget request))))

(defn get-invitations-count
  "Returns the count of all Security Hub membership invitations that were sent to the current member account, not
   including the currently accepted invitation.

  request - `com.amazonaws.services.securityhub.model.GetInvitationsCountRequest`

  returns: Result of the GetInvitationsCount operation returned by the service. - `com.amazonaws.services.securityhub.model.GetInvitationsCountResult`

  throws: com.amazonaws.services.securityhub.model.InternalException - Internal server error."
  (^com.amazonaws.services.securityhub.model.GetInvitationsCountResult [^AWSSecurityHubClient this ^com.amazonaws.services.securityhub.model.GetInvitationsCountRequest request]
    (-> this (.getInvitationsCount request))))

(defn create-insight
  "Creates a custom insight in Security Hub. An insight is a consolidation of findings that relate to a security
   issue that requires attention or remediation. Use the GroupByAttribute to group the related findings
   in the insight.

  request - `com.amazonaws.services.securityhub.model.CreateInsightRequest`

  returns: Result of the CreateInsight operation returned by the service. - `com.amazonaws.services.securityhub.model.CreateInsightResult`

  throws: com.amazonaws.services.securityhub.model.InternalException - Internal server error."
  (^com.amazonaws.services.securityhub.model.CreateInsightResult [^AWSSecurityHubClient this ^com.amazonaws.services.securityhub.model.CreateInsightRequest request]
    (-> this (.createInsight request))))

(defn list-members
  "Lists details about all member accounts for the current Security Hub master account.

  request - `com.amazonaws.services.securityhub.model.ListMembersRequest`

  returns: Result of the ListMembers operation returned by the service. - `com.amazonaws.services.securityhub.model.ListMembersResult`

  throws: com.amazonaws.services.securityhub.model.InternalException - Internal server error."
  (^com.amazonaws.services.securityhub.model.ListMembersResult [^AWSSecurityHubClient this ^com.amazonaws.services.securityhub.model.ListMembersRequest request]
    (-> this (.listMembers request))))

(defn delete-members
  "Deletes the specified member accounts from Security Hub.

  request - `com.amazonaws.services.securityhub.model.DeleteMembersRequest`

  returns: Result of the DeleteMembers operation returned by the service. - `com.amazonaws.services.securityhub.model.DeleteMembersResult`

  throws: com.amazonaws.services.securityhub.model.InternalException - Internal server error."
  (^com.amazonaws.services.securityhub.model.DeleteMembersResult [^AWSSecurityHubClient this ^com.amazonaws.services.securityhub.model.DeleteMembersRequest request]
    (-> this (.deleteMembers request))))

(defn get-insight-results
  "Lists the results of the Security Hub insight that the insight ARN specifies.

  request - `com.amazonaws.services.securityhub.model.GetInsightResultsRequest`

  returns: Result of the GetInsightResults operation returned by the service. - `com.amazonaws.services.securityhub.model.GetInsightResultsResult`

  throws: com.amazonaws.services.securityhub.model.InternalException - Internal server error."
  (^com.amazonaws.services.securityhub.model.GetInsightResultsResult [^AWSSecurityHubClient this ^com.amazonaws.services.securityhub.model.GetInsightResultsRequest request]
    (-> this (.getInsightResults request))))

(defn enable-import-findings-for-product
  "Enables the integration of a partner product with Security Hub. Integrated products send findings to Security
   Hub. When you enable a product integration, a permission policy that grants permission for the product to send
   findings to Security Hub is applied.

  request - `com.amazonaws.services.securityhub.model.EnableImportFindingsForProductRequest`

  returns: Result of the EnableImportFindingsForProduct operation returned by the service. - `com.amazonaws.services.securityhub.model.EnableImportFindingsForProductResult`

  throws: com.amazonaws.services.securityhub.model.InternalException - Internal server error."
  (^com.amazonaws.services.securityhub.model.EnableImportFindingsForProductResult [^AWSSecurityHubClient this ^com.amazonaws.services.securityhub.model.EnableImportFindingsForProductRequest request]
    (-> this (.enableImportFindingsForProduct request))))

(defn create-members
  "Creates a member association in Security Hub between the specified accounts and the account used to make the
   request, which is the master account. To successfully create a member, you must use this action from an account
   that already has Security Hub enabled. You can use the EnableSecurityHub to enable Security Hub.


   After you use CreateMembers to create member account associations in Security Hub, you need to use
   the InviteMembers action, which invites the accounts to enable Security Hub and become member accounts in
   Security Hub. If the invitation is accepted by the account owner, the account becomes a member account in
   Security Hub, and a permission policy is added that permits the master account to view the findings generated in
   the member account. When Security Hub is enabled in the invited account, findings start being sent to both the
   member and master accounts.


   You can remove the association between the master and member accounts by using the
   DisassociateFromMasterAccount or DisassociateMembers operation.

  request - `com.amazonaws.services.securityhub.model.CreateMembersRequest`

  returns: Result of the CreateMembers operation returned by the service. - `com.amazonaws.services.securityhub.model.CreateMembersResult`

  throws: com.amazonaws.services.securityhub.model.InternalException - Internal server error."
  (^com.amazonaws.services.securityhub.model.CreateMembersResult [^AWSSecurityHubClient this ^com.amazonaws.services.securityhub.model.CreateMembersRequest request]
    (-> this (.createMembers request))))

(defn list-enabled-products-for-import
  "Lists all findings-generating solutions (products) whose findings you have subscribed to receive in Security Hub.

  request - `com.amazonaws.services.securityhub.model.ListEnabledProductsForImportRequest`

  returns: Result of the ListEnabledProductsForImport operation returned by the service. - `com.amazonaws.services.securityhub.model.ListEnabledProductsForImportResult`

  throws: com.amazonaws.services.securityhub.model.InternalException - Internal server error."
  (^com.amazonaws.services.securityhub.model.ListEnabledProductsForImportResult [^AWSSecurityHubClient this ^com.amazonaws.services.securityhub.model.ListEnabledProductsForImportRequest request]
    (-> this (.listEnabledProductsForImport request))))

(defn disable-import-findings-for-product
  "Disables the integration of the specified product with Security Hub. Findings from that product are no longer
   sent to Security Hub after the integration is disabled.

  request - `com.amazonaws.services.securityhub.model.DisableImportFindingsForProductRequest`

  returns: Result of the DisableImportFindingsForProduct operation returned by the service. - `com.amazonaws.services.securityhub.model.DisableImportFindingsForProductResult`

  throws: com.amazonaws.services.securityhub.model.InternalException - Internal server error."
  (^com.amazonaws.services.securityhub.model.DisableImportFindingsForProductResult [^AWSSecurityHubClient this ^com.amazonaws.services.securityhub.model.DisableImportFindingsForProductRequest request]
    (-> this (.disableImportFindingsForProduct request))))

(defn update-action-target
  "Updates the name and description of a custom action target in Security Hub.

  request - `com.amazonaws.services.securityhub.model.UpdateActionTargetRequest`

  returns: Result of the UpdateActionTarget operation returned by the service. - `com.amazonaws.services.securityhub.model.UpdateActionTargetResult`

  throws: com.amazonaws.services.securityhub.model.InternalException - Internal server error."
  (^com.amazonaws.services.securityhub.model.UpdateActionTargetResult [^AWSSecurityHubClient this ^com.amazonaws.services.securityhub.model.UpdateActionTargetRequest request]
    (-> this (.updateActionTarget request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSSecurityHubClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-findings
  "Returns a list of findings that match the specified criteria.

  request - `com.amazonaws.services.securityhub.model.GetFindingsRequest`

  returns: Result of the GetFindings operation returned by the service. - `com.amazonaws.services.securityhub.model.GetFindingsResult`

  throws: com.amazonaws.services.securityhub.model.InternalException - Internal server error."
  (^com.amazonaws.services.securityhub.model.GetFindingsResult [^AWSSecurityHubClient this ^com.amazonaws.services.securityhub.model.GetFindingsRequest request]
    (-> this (.getFindings request))))

(defn get-insights
  "Lists and describes insights that insight ARNs specify.

  request - `com.amazonaws.services.securityhub.model.GetInsightsRequest`

  returns: Result of the GetInsights operation returned by the service. - `com.amazonaws.services.securityhub.model.GetInsightsResult`

  throws: com.amazonaws.services.securityhub.model.InternalException - Internal server error."
  (^com.amazonaws.services.securityhub.model.GetInsightsResult [^AWSSecurityHubClient this ^com.amazonaws.services.securityhub.model.GetInsightsRequest request]
    (-> this (.getInsights request))))

(defn tag-resource
  "Adds one or more tags to a resource.

  request - `com.amazonaws.services.securityhub.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.securityhub.model.TagResourceResult`

  throws: com.amazonaws.services.securityhub.model.InternalException - Internal server error."
  (^com.amazonaws.services.securityhub.model.TagResourceResult [^AWSSecurityHubClient this ^com.amazonaws.services.securityhub.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn list-invitations
  "Lists all Security Hub membership invitations that were sent to the current AWS account.

  request - `com.amazonaws.services.securityhub.model.ListInvitationsRequest`

  returns: Result of the ListInvitations operation returned by the service. - `com.amazonaws.services.securityhub.model.ListInvitationsResult`

  throws: com.amazonaws.services.securityhub.model.InternalException - Internal server error."
  (^com.amazonaws.services.securityhub.model.ListInvitationsResult [^AWSSecurityHubClient this ^com.amazonaws.services.securityhub.model.ListInvitationsRequest request]
    (-> this (.listInvitations request))))

(defn delete-insight
  "Deletes the insight specified by the InsightArn.

  request - `com.amazonaws.services.securityhub.model.DeleteInsightRequest`

  returns: Result of the DeleteInsight operation returned by the service. - `com.amazonaws.services.securityhub.model.DeleteInsightResult`

  throws: com.amazonaws.services.securityhub.model.InternalException - Internal server error."
  (^com.amazonaws.services.securityhub.model.DeleteInsightResult [^AWSSecurityHubClient this ^com.amazonaws.services.securityhub.model.DeleteInsightRequest request]
    (-> this (.deleteInsight request))))

(defn decline-invitations
  "Declines invitations to become a member account.

  request - `com.amazonaws.services.securityhub.model.DeclineInvitationsRequest`

  returns: Result of the DeclineInvitations operation returned by the service. - `com.amazonaws.services.securityhub.model.DeclineInvitationsResult`

  throws: com.amazonaws.services.securityhub.model.InternalException - Internal server error."
  (^com.amazonaws.services.securityhub.model.DeclineInvitationsResult [^AWSSecurityHubClient this ^com.amazonaws.services.securityhub.model.DeclineInvitationsRequest request]
    (-> this (.declineInvitations request))))

