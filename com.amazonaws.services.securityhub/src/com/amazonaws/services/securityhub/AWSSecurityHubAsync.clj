(ns com.amazonaws.services.securityhub.AWSSecurityHubAsync
  "Interface for accessing AWS SecurityHub asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSSecurityHubAsync instead.



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
  (:import [com.amazonaws.services.securityhub AWSSecurityHubAsync]))

(defn delete-insight-async
  "Deletes the insight specified by the InsightArn.

  delete-insight-request - `com.amazonaws.services.securityhub.model.DeleteInsightRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteInsight operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.DeleteInsightResult>`"
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DeleteInsightRequest delete-insight-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteInsightAsync delete-insight-request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DeleteInsightRequest delete-insight-request]
    (-> this (.deleteInsightAsync delete-insight-request))))

(defn untag-resource-async
  "Removes one or more tags from a resource.

  untag-resource-request - `com.amazonaws.services.securityhub.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn list-invitations-async
  "Lists all Security Hub membership invitations that were sent to the current AWS account.

  list-invitations-request - `com.amazonaws.services.securityhub.model.ListInvitationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListInvitations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.ListInvitationsResult>`"
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.ListInvitationsRequest list-invitations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listInvitationsAsync list-invitations-request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.ListInvitationsRequest list-invitations-request]
    (-> this (.listInvitationsAsync list-invitations-request))))

(defn update-insight-async
  "Updates the Security Hub insight that the insight ARN specifies.

  update-insight-request - `com.amazonaws.services.securityhub.model.UpdateInsightRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateInsight operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.UpdateInsightResult>`"
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.UpdateInsightRequest update-insight-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateInsightAsync update-insight-request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.UpdateInsightRequest update-insight-request]
    (-> this (.updateInsightAsync update-insight-request))))

(defn describe-products-async
  "Returns information about the products available that you can subscribe to and integrate with Security Hub to
   consolidate findings.

  describe-products-request - `com.amazonaws.services.securityhub.model.DescribeProductsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeProducts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.DescribeProductsResult>`"
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DescribeProductsRequest describe-products-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeProductsAsync describe-products-request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DescribeProductsRequest describe-products-request]
    (-> this (.describeProductsAsync describe-products-request))))

(defn disable-security-hub-async
  "Disables Security Hub in your account only in the current Region. To disable Security Hub in all Regions, you
   must submit one request per Region where you have enabled Security Hub. When you disable Security Hub for a
   master account, it doesn't disable Security Hub for any associated member accounts.


   When you disable Security Hub, your existing findings and insights and any Security Hub configuration settings
   are deleted after 90 days and can't be recovered. Any standards that were enabled are disabled, and your master
   and member account associations are removed. If you want to save your existing findings, you must export them
   before you disable Security Hub.

  disable-security-hub-request - `com.amazonaws.services.securityhub.model.DisableSecurityHubRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableSecurityHub operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.DisableSecurityHubResult>`"
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DisableSecurityHubRequest disable-security-hub-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableSecurityHubAsync disable-security-hub-request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DisableSecurityHubRequest disable-security-hub-request]
    (-> this (.disableSecurityHubAsync disable-security-hub-request))))

(defn invite-members-async
  "Invites other AWS accounts to become member accounts for the Security Hub master account that the invitation is
   sent from. Before you can use this action to invite a member, you must first create the member account in
   Security Hub by using the CreateMembers action. When the account owner accepts the invitation to become a
   member account and enables Security Hub, the master account can view the findings generated from member account.

  invite-members-request - `com.amazonaws.services.securityhub.model.InviteMembersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the InviteMembers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.InviteMembersResult>`"
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.InviteMembersRequest invite-members-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.inviteMembersAsync invite-members-request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.InviteMembersRequest invite-members-request]
    (-> this (.inviteMembersAsync invite-members-request))))

(defn create-insight-async
  "Creates a custom insight in Security Hub. An insight is a consolidation of findings that relate to a security
   issue that requires attention or remediation. Use the GroupByAttribute to group the related findings
   in the insight.

  create-insight-request - `com.amazonaws.services.securityhub.model.CreateInsightRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateInsight operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.CreateInsightResult>`"
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.CreateInsightRequest create-insight-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createInsightAsync create-insight-request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.CreateInsightRequest create-insight-request]
    (-> this (.createInsightAsync create-insight-request))))

(defn batch-enable-standards-async
  "Enables the standards specified by the provided standardsArn. In this release, only CIS AWS
   Foundations standards are supported. For more information, see Standards Supported in
   AWS Security Hub.

  batch-enable-standards-request - `com.amazonaws.services.securityhub.model.BatchEnableStandardsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchEnableStandards operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.BatchEnableStandardsResult>`"
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.BatchEnableStandardsRequest batch-enable-standards-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchEnableStandardsAsync batch-enable-standards-request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.BatchEnableStandardsRequest batch-enable-standards-request]
    (-> this (.batchEnableStandardsAsync batch-enable-standards-request))))

(defn disable-import-findings-for-product-async
  "Disables the integration of the specified product with Security Hub. Findings from that product are no longer
   sent to Security Hub after the integration is disabled.

  disable-import-findings-for-product-request - `com.amazonaws.services.securityhub.model.DisableImportFindingsForProductRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableImportFindingsForProduct operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.DisableImportFindingsForProductResult>`"
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DisableImportFindingsForProductRequest disable-import-findings-for-product-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableImportFindingsForProductAsync disable-import-findings-for-product-request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DisableImportFindingsForProductRequest disable-import-findings-for-product-request]
    (-> this (.disableImportFindingsForProductAsync disable-import-findings-for-product-request))))

(defn list-enabled-products-for-import-async
  "Lists all findings-generating solutions (products) whose findings you have subscribed to receive in Security Hub.

  list-enabled-products-for-import-request - `com.amazonaws.services.securityhub.model.ListEnabledProductsForImportRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListEnabledProductsForImport operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.ListEnabledProductsForImportResult>`"
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.ListEnabledProductsForImportRequest list-enabled-products-for-import-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listEnabledProductsForImportAsync list-enabled-products-for-import-request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.ListEnabledProductsForImportRequest list-enabled-products-for-import-request]
    (-> this (.listEnabledProductsForImportAsync list-enabled-products-for-import-request))))

(defn create-action-target-async
  "Creates a custom action target in Security Hub. You can use custom actions on findings and insights in Security
   Hub to trigger target actions in Amazon CloudWatch Events.

  create-action-target-request - `com.amazonaws.services.securityhub.model.CreateActionTargetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateActionTarget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.CreateActionTargetResult>`"
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.CreateActionTargetRequest create-action-target-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createActionTargetAsync create-action-target-request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.CreateActionTargetRequest create-action-target-request]
    (-> this (.createActionTargetAsync create-action-target-request))))

(defn get-findings-async
  "Returns a list of findings that match the specified criteria.

  get-findings-request - `com.amazonaws.services.securityhub.model.GetFindingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFindings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.GetFindingsResult>`"
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.GetFindingsRequest get-findings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFindingsAsync get-findings-request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.GetFindingsRequest get-findings-request]
    (-> this (.getFindingsAsync get-findings-request))))

(defn list-members-async
  "Lists details about all member accounts for the current Security Hub master account.

  list-members-request - `com.amazonaws.services.securityhub.model.ListMembersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListMembers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.ListMembersResult>`"
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.ListMembersRequest list-members-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listMembersAsync list-members-request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.ListMembersRequest list-members-request]
    (-> this (.listMembersAsync list-members-request))))

(defn enable-import-findings-for-product-async
  "Enables the integration of a partner product with Security Hub. Integrated products send findings to Security
   Hub. When you enable a product integration, a permission policy that grants permission for the product to send
   findings to Security Hub is applied.

  enable-import-findings-for-product-request - `com.amazonaws.services.securityhub.model.EnableImportFindingsForProductRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableImportFindingsForProduct operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.EnableImportFindingsForProductResult>`"
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.EnableImportFindingsForProductRequest enable-import-findings-for-product-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableImportFindingsForProductAsync enable-import-findings-for-product-request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.EnableImportFindingsForProductRequest enable-import-findings-for-product-request]
    (-> this (.enableImportFindingsForProductAsync enable-import-findings-for-product-request))))

(defn delete-members-async
  "Deletes the specified member accounts from Security Hub.

  delete-members-request - `com.amazonaws.services.securityhub.model.DeleteMembersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteMembers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.DeleteMembersResult>`"
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DeleteMembersRequest delete-members-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteMembersAsync delete-members-request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DeleteMembersRequest delete-members-request]
    (-> this (.deleteMembersAsync delete-members-request))))

(defn get-insight-results-async
  "Lists the results of the Security Hub insight that the insight ARN specifies.

  get-insight-results-request - `com.amazonaws.services.securityhub.model.GetInsightResultsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetInsightResults operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.GetInsightResultsResult>`"
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.GetInsightResultsRequest get-insight-results-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getInsightResultsAsync get-insight-results-request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.GetInsightResultsRequest get-insight-results-request]
    (-> this (.getInsightResultsAsync get-insight-results-request))))

(defn disassociate-members-async
  "Disassociates the specified member accounts from the associated master account.

  disassociate-members-request - `com.amazonaws.services.securityhub.model.DisassociateMembersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateMembers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.DisassociateMembersResult>`"
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DisassociateMembersRequest disassociate-members-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateMembersAsync disassociate-members-request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DisassociateMembersRequest disassociate-members-request]
    (-> this (.disassociateMembersAsync disassociate-members-request))))

(defn batch-disable-standards-async
  "Disables the standards specified by the provided StandardsSubscriptionArns. For more information,
   see Standards
   Supported in AWS Security Hub.

  batch-disable-standards-request - `com.amazonaws.services.securityhub.model.BatchDisableStandardsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchDisableStandards operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.BatchDisableStandardsResult>`"
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.BatchDisableStandardsRequest batch-disable-standards-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchDisableStandardsAsync batch-disable-standards-request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.BatchDisableStandardsRequest batch-disable-standards-request]
    (-> this (.batchDisableStandardsAsync batch-disable-standards-request))))

(defn delete-invitations-async
  "Deletes invitations received by the AWS account to become a member account.

  delete-invitations-request - `com.amazonaws.services.securityhub.model.DeleteInvitationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteInvitations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.DeleteInvitationsResult>`"
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DeleteInvitationsRequest delete-invitations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteInvitationsAsync delete-invitations-request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DeleteInvitationsRequest delete-invitations-request]
    (-> this (.deleteInvitationsAsync delete-invitations-request))))

(defn delete-action-target-async
  "Deletes a custom action target from Security Hub. Deleting a custom action target doesn't affect any findings or
   insights that were already sent to Amazon CloudWatch Events using the custom action.

  delete-action-target-request - `com.amazonaws.services.securityhub.model.DeleteActionTargetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteActionTarget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.DeleteActionTargetResult>`"
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DeleteActionTargetRequest delete-action-target-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteActionTargetAsync delete-action-target-request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DeleteActionTargetRequest delete-action-target-request]
    (-> this (.deleteActionTargetAsync delete-action-target-request))))

(defn update-findings-async
  "Updates the Note and RecordState of the Security Hub-aggregated findings that the
   filter attributes specify. Any member account that can view the finding also sees the update to the finding.

  update-findings-request - `com.amazonaws.services.securityhub.model.UpdateFindingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateFindings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.UpdateFindingsResult>`"
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.UpdateFindingsRequest update-findings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateFindingsAsync update-findings-request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.UpdateFindingsRequest update-findings-request]
    (-> this (.updateFindingsAsync update-findings-request))))

(defn describe-hub-async
  "Returns details about the Hub resource in your account, including the HubArn and the time when you
   enabled Security Hub.

  describe-hub-request - `com.amazonaws.services.securityhub.model.DescribeHubRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeHub operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.DescribeHubResult>`"
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DescribeHubRequest describe-hub-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeHubAsync describe-hub-request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DescribeHubRequest describe-hub-request]
    (-> this (.describeHubAsync describe-hub-request))))

(defn decline-invitations-async
  "Declines invitations to become a member account.

  decline-invitations-request - `com.amazonaws.services.securityhub.model.DeclineInvitationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeclineInvitations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.DeclineInvitationsResult>`"
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DeclineInvitationsRequest decline-invitations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.declineInvitationsAsync decline-invitations-request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DeclineInvitationsRequest decline-invitations-request]
    (-> this (.declineInvitationsAsync decline-invitations-request))))

(defn enable-security-hub-async
  "Enables Security Hub for your account in the current Region or the Region you specify in the request. When you
   enable Security Hub, you grant to Security Hub the permissions necessary to gather findings from AWS Config,
   Amazon GuardDuty, Amazon Inspector, and Amazon Macie. To learn more, see Setting Up AWS
   Security Hub.

  enable-security-hub-request - `com.amazonaws.services.securityhub.model.EnableSecurityHubRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableSecurityHub operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.EnableSecurityHubResult>`"
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.EnableSecurityHubRequest enable-security-hub-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableSecurityHubAsync enable-security-hub-request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.EnableSecurityHubRequest enable-security-hub-request]
    (-> this (.enableSecurityHubAsync enable-security-hub-request))))

(defn list-tags-for-resource-async
  "Returns a list of tags associated with a resource.

  list-tags-for-resource-request - `com.amazonaws.services.securityhub.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn update-action-target-async
  "Updates the name and description of a custom action target in Security Hub.

  update-action-target-request - `com.amazonaws.services.securityhub.model.UpdateActionTargetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateActionTarget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.UpdateActionTargetResult>`"
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.UpdateActionTargetRequest update-action-target-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateActionTargetAsync update-action-target-request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.UpdateActionTargetRequest update-action-target-request]
    (-> this (.updateActionTargetAsync update-action-target-request))))

(defn disassociate-from-master-account-async
  "Disassociates the current Security Hub member account from the associated master account.

  disassociate-from-master-account-request - `com.amazonaws.services.securityhub.model.DisassociateFromMasterAccountRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateFromMasterAccount operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.DisassociateFromMasterAccountResult>`"
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DisassociateFromMasterAccountRequest disassociate-from-master-account-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateFromMasterAccountAsync disassociate-from-master-account-request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DisassociateFromMasterAccountRequest disassociate-from-master-account-request]
    (-> this (.disassociateFromMasterAccountAsync disassociate-from-master-account-request))))

(defn get-invitations-count-async
  "Returns the count of all Security Hub membership invitations that were sent to the current member account, not
   including the currently accepted invitation.

  get-invitations-count-request - `com.amazonaws.services.securityhub.model.GetInvitationsCountRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetInvitationsCount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.GetInvitationsCountResult>`"
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.GetInvitationsCountRequest get-invitations-count-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getInvitationsCountAsync get-invitations-count-request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.GetInvitationsCountRequest get-invitations-count-request]
    (-> this (.getInvitationsCountAsync get-invitations-count-request))))

(defn batch-import-findings-async
  "Imports security findings generated from an integrated third-party product into Security Hub. This action is
   requested by the integrated product to import its findings into Security Hub. The maximum allowed size for a
   finding is 240 Kb. An error is returned for any finding larger than 240 Kb.

  batch-import-findings-request - `com.amazonaws.services.securityhub.model.BatchImportFindingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchImportFindings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.BatchImportFindingsResult>`"
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.BatchImportFindingsRequest batch-import-findings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchImportFindingsAsync batch-import-findings-request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.BatchImportFindingsRequest batch-import-findings-request]
    (-> this (.batchImportFindingsAsync batch-import-findings-request))))

(defn get-insights-async
  "Lists and describes insights that insight ARNs specify.

  get-insights-request - `com.amazonaws.services.securityhub.model.GetInsightsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetInsights operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.GetInsightsResult>`"
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.GetInsightsRequest get-insights-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getInsightsAsync get-insights-request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.GetInsightsRequest get-insights-request]
    (-> this (.getInsightsAsync get-insights-request))))

(defn accept-invitation-async
  "Accepts the invitation to be a member account and be monitored by the Security Hub master account that the
   invitation was sent from. When the member account accepts the invitation, permission is granted to the master
   account to view findings generated in the member account.

  accept-invitation-request - `com.amazonaws.services.securityhub.model.AcceptInvitationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AcceptInvitation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.AcceptInvitationResult>`"
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.AcceptInvitationRequest accept-invitation-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.acceptInvitationAsync accept-invitation-request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.AcceptInvitationRequest accept-invitation-request]
    (-> this (.acceptInvitationAsync accept-invitation-request))))

(defn get-members-async
  "Returns the details on the Security Hub member accounts that the account IDs specify.

  get-members-request - `com.amazonaws.services.securityhub.model.GetMembersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMembers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.GetMembersResult>`"
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.GetMembersRequest get-members-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMembersAsync get-members-request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.GetMembersRequest get-members-request]
    (-> this (.getMembersAsync get-members-request))))

(defn get-master-account-async
  "Provides the details for the Security Hub master account to the current member account.

  get-master-account-request - `com.amazonaws.services.securityhub.model.GetMasterAccountRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMasterAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.GetMasterAccountResult>`"
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.GetMasterAccountRequest get-master-account-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMasterAccountAsync get-master-account-request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.GetMasterAccountRequest get-master-account-request]
    (-> this (.getMasterAccountAsync get-master-account-request))))

(defn get-enabled-standards-async
  "Returns a list of the standards that are currently enabled.

  get-enabled-standards-request - `com.amazonaws.services.securityhub.model.GetEnabledStandardsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetEnabledStandards operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.GetEnabledStandardsResult>`"
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.GetEnabledStandardsRequest get-enabled-standards-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getEnabledStandardsAsync get-enabled-standards-request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.GetEnabledStandardsRequest get-enabled-standards-request]
    (-> this (.getEnabledStandardsAsync get-enabled-standards-request))))

(defn tag-resource-async
  "Adds one or more tags to a resource.

  tag-resource-request - `com.amazonaws.services.securityhub.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn create-members-async
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

  create-members-request - `com.amazonaws.services.securityhub.model.CreateMembersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateMembers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.CreateMembersResult>`"
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.CreateMembersRequest create-members-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createMembersAsync create-members-request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.CreateMembersRequest create-members-request]
    (-> this (.createMembersAsync create-members-request))))

(defn describe-action-targets-async
  "Returns a list of the custom action targets in Security Hub in your account.

  describe-action-targets-request - `com.amazonaws.services.securityhub.model.DescribeActionTargetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeActionTargets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securityhub.model.DescribeActionTargetsResult>`"
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DescribeActionTargetsRequest describe-action-targets-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeActionTargetsAsync describe-action-targets-request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityHubAsync this ^com.amazonaws.services.securityhub.model.DescribeActionTargetsRequest describe-action-targets-request]
    (-> this (.describeActionTargetsAsync describe-action-targets-request))))

