(ns com.amazonaws.services.guardduty.AmazonGuardDuty
  "Interface for accessing Amazon GuardDuty.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonGuardDuty instead.



  Amazon GuardDuty is a continuous security monitoring service that analyzes and processes the following data sources:
  VPC Flow Logs, AWS CloudTrail event logs, and DNS logs. It uses threat intelligence feeds, such as lists of malicious
  IPs and domains, and machine learning to identify unexpected and potentially unauthorized and malicious activity
  within your AWS environment. This can include issues like escalations of privileges, uses of exposed credentials, or
  communication with malicious IPs, URLs, or domains. For example, GuardDuty can detect compromised EC2 instances
  serving malware or mining bitcoin. It also monitors AWS account access behavior for signs of compromise, such as
  unauthorized infrastructure deployments, like instances deployed in a region that has never been used, or unusual API
  calls, like a password policy change to reduce password strength. GuardDuty informs you of the status of your AWS
  environment by producing security findings that you can view in the GuardDuty console or through Amazon CloudWatch
  events. For more information, see
  Amazon GuardDuty User Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.guardduty AmazonGuardDuty]))

(defn list-findings
  "Lists Amazon GuardDuty findings for the specified detector ID.

  list-findings-request - `com.amazonaws.services.guardduty.model.ListFindingsRequest`

  returns: Result of the ListFindings operation returned by the service. - `com.amazonaws.services.guardduty.model.ListFindingsResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.ListFindingsResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.ListFindingsRequest list-findings-request]
    (-> this (.listFindings list-findings-request))))

(defn list-tags-for-resource
  "Lists tags for a resource. Tagging is currently supported for detectors, finding filters, IP sets, and Threat
   Intel sets, with a limit of 50 tags per resource. When invoked, this operation returns all assigned tags for a
   given resource..

  list-tags-for-resource-request - `com.amazonaws.services.guardduty.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.guardduty.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.ListTagsForResourceResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn accept-invitation
  "Accepts the invitation to be monitored by a master GuardDuty account.

  accept-invitation-request - `com.amazonaws.services.guardduty.model.AcceptInvitationRequest`

  returns: Result of the AcceptInvitation operation returned by the service. - `com.amazonaws.services.guardduty.model.AcceptInvitationResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.AcceptInvitationResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.AcceptInvitationRequest accept-invitation-request]
    (-> this (.acceptInvitation accept-invitation-request))))

(defn update-filter
  "Updates the filter specified by the filter name.

  update-filter-request - `com.amazonaws.services.guardduty.model.UpdateFilterRequest`

  returns: Result of the UpdateFilter operation returned by the service. - `com.amazonaws.services.guardduty.model.UpdateFilterResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.UpdateFilterResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.UpdateFilterRequest update-filter-request]
    (-> this (.updateFilter update-filter-request))))

(defn invite-members
  "Invites other AWS accounts (created as members of the current AWS account by CreateMembers) to enable GuardDuty
   and allow the current AWS account to view and manage these accounts' GuardDuty findings on their behalf as the
   master account.

  invite-members-request - `com.amazonaws.services.guardduty.model.InviteMembersRequest`

  returns: Result of the InviteMembers operation returned by the service. - `com.amazonaws.services.guardduty.model.InviteMembersResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.InviteMembersResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.InviteMembersRequest invite-members-request]
    (-> this (.inviteMembers invite-members-request))))

(defn list-ip-sets
  "Lists the IPSets of the GuardDuty service specified by the detector ID.

  list-ip-sets-request - `com.amazonaws.services.guardduty.model.ListIPSetsRequest`

  returns: Result of the ListIPSets operation returned by the service. - `com.amazonaws.services.guardduty.model.ListIPSetsResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.ListIPSetsResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.ListIPSetsRequest list-ip-sets-request]
    (-> this (.listIPSets list-ip-sets-request))))

(defn unarchive-findings
  "Unarchives Amazon GuardDuty findings specified by the list of finding IDs.

  unarchive-findings-request - `com.amazonaws.services.guardduty.model.UnarchiveFindingsRequest`

  returns: Result of the UnarchiveFindings operation returned by the service. - `com.amazonaws.services.guardduty.model.UnarchiveFindingsResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.UnarchiveFindingsResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.UnarchiveFindingsRequest unarchive-findings-request]
    (-> this (.unarchiveFindings unarchive-findings-request))))

(defn get-members
  "Retrieves GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.

  get-members-request - `com.amazonaws.services.guardduty.model.GetMembersRequest`

  returns: Result of the GetMembers operation returned by the service. - `com.amazonaws.services.guardduty.model.GetMembersResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.GetMembersResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.GetMembersRequest get-members-request]
    (-> this (.getMembers get-members-request))))

(defn get-findings-statistics
  "Lists Amazon GuardDuty findings' statistics for the specified detector ID.

  get-findings-statistics-request - `com.amazonaws.services.guardduty.model.GetFindingsStatisticsRequest`

  returns: Result of the GetFindingsStatistics operation returned by the service. - `com.amazonaws.services.guardduty.model.GetFindingsStatisticsResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.GetFindingsStatisticsResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.GetFindingsStatisticsRequest get-findings-statistics-request]
    (-> this (.getFindingsStatistics get-findings-statistics-request))))

(defn get-master-account
  "Provides the details for the GuardDuty master account to the current GuardDuty member account.

  get-master-account-request - `com.amazonaws.services.guardduty.model.GetMasterAccountRequest`

  returns: Result of the GetMasterAccount operation returned by the service. - `com.amazonaws.services.guardduty.model.GetMasterAccountResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.GetMasterAccountResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.GetMasterAccountRequest get-master-account-request]
    (-> this (.getMasterAccount get-master-account-request))))

(defn start-monitoring-members
  "Re-enables GuardDuty to monitor findings of the member accounts specified by the account IDs. A master GuardDuty
   account can run this command after disabling GuardDuty from monitoring these members' findings by running
   StopMonitoringMembers.

  start-monitoring-members-request - `com.amazonaws.services.guardduty.model.StartMonitoringMembersRequest`

  returns: Result of the StartMonitoringMembers operation returned by the service. - `com.amazonaws.services.guardduty.model.StartMonitoringMembersResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.StartMonitoringMembersResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.StartMonitoringMembersRequest start-monitoring-members-request]
    (-> this (.startMonitoringMembers start-monitoring-members-request))))

(defn disassociate-from-master-account
  "Disassociates the current GuardDuty member account from its master account.

  disassociate-from-master-account-request - `com.amazonaws.services.guardduty.model.DisassociateFromMasterAccountRequest`

  returns: Result of the DisassociateFromMasterAccount operation returned by the service. - `com.amazonaws.services.guardduty.model.DisassociateFromMasterAccountResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.DisassociateFromMasterAccountResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.DisassociateFromMasterAccountRequest disassociate-from-master-account-request]
    (-> this (.disassociateFromMasterAccount disassociate-from-master-account-request))))

(defn untag-resource
  "Removes tags from a resource.

  untag-resource-request - `com.amazonaws.services.guardduty.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.guardduty.model.UntagResourceResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.UntagResourceResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn update-ip-set
  "Updates the IPSet specified by the IPSet ID.

  update-ip-set-request - `com.amazonaws.services.guardduty.model.UpdateIPSetRequest`

  returns: Result of the UpdateIPSet operation returned by the service. - `com.amazonaws.services.guardduty.model.UpdateIPSetResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.UpdateIPSetResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.UpdateIPSetRequest update-ip-set-request]
    (-> this (.updateIPSet update-ip-set-request))))

(defn list-detectors
  "Lists detectorIds of all the existing Amazon GuardDuty detector resources.

  list-detectors-request - `com.amazonaws.services.guardduty.model.ListDetectorsRequest`

  returns: Result of the ListDetectors operation returned by the service. - `com.amazonaws.services.guardduty.model.ListDetectorsResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.ListDetectorsResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.ListDetectorsRequest list-detectors-request]
    (-> this (.listDetectors list-detectors-request))))

(defn delete-threat-intel-set
  "Deletes ThreatIntelSet specified by the ThreatIntelSet ID.

  delete-threat-intel-set-request - `com.amazonaws.services.guardduty.model.DeleteThreatIntelSetRequest`

  returns: Result of the DeleteThreatIntelSet operation returned by the service. - `com.amazonaws.services.guardduty.model.DeleteThreatIntelSetResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.DeleteThreatIntelSetResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.DeleteThreatIntelSetRequest delete-threat-intel-set-request]
    (-> this (.deleteThreatIntelSet delete-threat-intel-set-request))))

(defn stop-monitoring-members
  "Disables GuardDuty from monitoring findings of the member accounts specified by the account IDs. After running
   this command, a master GuardDuty account can run StartMonitoringMembers to re-enable GuardDuty to monitor these
   members’ findings.

  stop-monitoring-members-request - `com.amazonaws.services.guardduty.model.StopMonitoringMembersRequest`

  returns: Result of the StopMonitoringMembers operation returned by the service. - `com.amazonaws.services.guardduty.model.StopMonitoringMembersResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.StopMonitoringMembersResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.StopMonitoringMembersRequest stop-monitoring-members-request]
    (-> this (.stopMonitoringMembers stop-monitoring-members-request))))

(defn delete-invitations
  "Deletes invitations sent to the current member account by AWS accounts specified by their account IDs.

  delete-invitations-request - `com.amazonaws.services.guardduty.model.DeleteInvitationsRequest`

  returns: Result of the DeleteInvitations operation returned by the service. - `com.amazonaws.services.guardduty.model.DeleteInvitationsResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.DeleteInvitationsResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.DeleteInvitationsRequest delete-invitations-request]
    (-> this (.deleteInvitations delete-invitations-request))))

(defn create-filter
  "Creates a filter using the specified finding criteria.

  create-filter-request - `com.amazonaws.services.guardduty.model.CreateFilterRequest`

  returns: Result of the CreateFilter operation returned by the service. - `com.amazonaws.services.guardduty.model.CreateFilterResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.CreateFilterResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.CreateFilterRequest create-filter-request]
    (-> this (.createFilter create-filter-request))))

(defn update-threat-intel-set
  "Updates the ThreatIntelSet specified by ThreatIntelSet ID.

  update-threat-intel-set-request - `com.amazonaws.services.guardduty.model.UpdateThreatIntelSetRequest`

  returns: Result of the UpdateThreatIntelSet operation returned by the service. - `com.amazonaws.services.guardduty.model.UpdateThreatIntelSetResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.UpdateThreatIntelSetResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.UpdateThreatIntelSetRequest update-threat-intel-set-request]
    (-> this (.updateThreatIntelSet update-threat-intel-set-request))))

(defn create-detector
  "Creates a single Amazon GuardDuty detector. A detector is an object that represents the GuardDuty service. A
   detector must be created in order for GuardDuty to become operational.

  create-detector-request - `com.amazonaws.services.guardduty.model.CreateDetectorRequest`

  returns: Result of the CreateDetector operation returned by the service. - `com.amazonaws.services.guardduty.model.CreateDetectorResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.CreateDetectorResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.CreateDetectorRequest create-detector-request]
    (-> this (.createDetector create-detector-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonGuardDuty this]
    (-> this (.shutdown))))

(defn delete-filter
  "Deletes the filter specified by the filter name.

  delete-filter-request - `com.amazonaws.services.guardduty.model.DeleteFilterRequest`

  returns: Result of the DeleteFilter operation returned by the service. - `com.amazonaws.services.guardduty.model.DeleteFilterResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.DeleteFilterResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.DeleteFilterRequest delete-filter-request]
    (-> this (.deleteFilter delete-filter-request))))

(defn disassociate-members
  "Disassociates GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.

  disassociate-members-request - `com.amazonaws.services.guardduty.model.DisassociateMembersRequest`

  returns: Result of the DisassociateMembers operation returned by the service. - `com.amazonaws.services.guardduty.model.DisassociateMembersResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.DisassociateMembersResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.DisassociateMembersRequest disassociate-members-request]
    (-> this (.disassociateMembers disassociate-members-request))))

(defn list-filters
  "Returns a paginated list of the current filters.

  list-filters-request - `com.amazonaws.services.guardduty.model.ListFiltersRequest`

  returns: Result of the ListFilters operation returned by the service. - `com.amazonaws.services.guardduty.model.ListFiltersResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.ListFiltersResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.ListFiltersRequest list-filters-request]
    (-> this (.listFilters list-filters-request))))

(defn get-filter
  "Returns the details of the filter specified by the filter name.

  get-filter-request - `com.amazonaws.services.guardduty.model.GetFilterRequest`

  returns: Result of the GetFilter operation returned by the service. - `com.amazonaws.services.guardduty.model.GetFilterResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.GetFilterResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.GetFilterRequest get-filter-request]
    (-> this (.getFilter get-filter-request))))

(defn get-invitations-count
  "Returns the count of all GuardDuty membership invitations that were sent to the current member account except the
   currently accepted invitation.

  get-invitations-count-request - `com.amazonaws.services.guardduty.model.GetInvitationsCountRequest`

  returns: Result of the GetInvitationsCount operation returned by the service. - `com.amazonaws.services.guardduty.model.GetInvitationsCountResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.GetInvitationsCountResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.GetInvitationsCountRequest get-invitations-count-request]
    (-> this (.getInvitationsCount get-invitations-count-request))))

(defn create-sample-findings
  "Generates example findings of types specified by the list of finding types. If 'NULL' is specified for
   findingTypes, the API generates example findings of all supported finding types.

  create-sample-findings-request - `com.amazonaws.services.guardduty.model.CreateSampleFindingsRequest`

  returns: Result of the CreateSampleFindings operation returned by the service. - `com.amazonaws.services.guardduty.model.CreateSampleFindingsResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.CreateSampleFindingsResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.CreateSampleFindingsRequest create-sample-findings-request]
    (-> this (.createSampleFindings create-sample-findings-request))))

(defn delete-detector
  "Deletes a Amazon GuardDuty detector specified by the detector ID.

  delete-detector-request - `com.amazonaws.services.guardduty.model.DeleteDetectorRequest`

  returns: Result of the DeleteDetector operation returned by the service. - `com.amazonaws.services.guardduty.model.DeleteDetectorResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.DeleteDetectorResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.DeleteDetectorRequest delete-detector-request]
    (-> this (.deleteDetector delete-detector-request))))

(defn list-members
  "Lists details about all member accounts for the current GuardDuty master account.

  list-members-request - `com.amazonaws.services.guardduty.model.ListMembersRequest`

  returns: Result of the ListMembers operation returned by the service. - `com.amazonaws.services.guardduty.model.ListMembersResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.ListMembersResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.ListMembersRequest list-members-request]
    (-> this (.listMembers list-members-request))))

(defn delete-members
  "Deletes GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.

  delete-members-request - `com.amazonaws.services.guardduty.model.DeleteMembersRequest`

  returns: Result of the DeleteMembers operation returned by the service. - `com.amazonaws.services.guardduty.model.DeleteMembersResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.DeleteMembersResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.DeleteMembersRequest delete-members-request]
    (-> this (.deleteMembers delete-members-request))))

(defn create-threat-intel-set
  "Create a new ThreatIntelSet. ThreatIntelSets consist of known malicious IP addresses. GuardDuty generates
   findings based on ThreatIntelSets.

  create-threat-intel-set-request - `com.amazonaws.services.guardduty.model.CreateThreatIntelSetRequest`

  returns: Result of the CreateThreatIntelSet operation returned by the service. - `com.amazonaws.services.guardduty.model.CreateThreatIntelSetResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.CreateThreatIntelSetResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.CreateThreatIntelSetRequest create-threat-intel-set-request]
    (-> this (.createThreatIntelSet create-threat-intel-set-request))))

(defn get-threat-intel-set
  "Retrieves the ThreatIntelSet that is specified by the ThreatIntelSet ID.

  get-threat-intel-set-request - `com.amazonaws.services.guardduty.model.GetThreatIntelSetRequest`

  returns: Result of the GetThreatIntelSet operation returned by the service. - `com.amazonaws.services.guardduty.model.GetThreatIntelSetResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.GetThreatIntelSetResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.GetThreatIntelSetRequest get-threat-intel-set-request]
    (-> this (.getThreatIntelSet get-threat-intel-set-request))))

(defn create-members
  "Creates member accounts of the current AWS account by specifying a list of AWS account IDs. The current AWS
   account can then invite these members to manage GuardDuty in their accounts.

  create-members-request - `com.amazonaws.services.guardduty.model.CreateMembersRequest`

  returns: Result of the CreateMembers operation returned by the service. - `com.amazonaws.services.guardduty.model.CreateMembersResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.CreateMembersResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.CreateMembersRequest create-members-request]
    (-> this (.createMembers create-members-request))))

(defn get-ip-set
  "Retrieves the IPSet specified by the IPSet ID.

  get-ip-set-request - `com.amazonaws.services.guardduty.model.GetIPSetRequest`

  returns: Result of the GetIPSet operation returned by the service. - `com.amazonaws.services.guardduty.model.GetIPSetResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.GetIPSetResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.GetIPSetRequest get-ip-set-request]
    (-> this (.getIPSet get-ip-set-request))))

(defn update-detector
  "Updates an Amazon GuardDuty detector specified by the detectorId.

  update-detector-request - `com.amazonaws.services.guardduty.model.UpdateDetectorRequest`

  returns: Result of the UpdateDetector operation returned by the service. - `com.amazonaws.services.guardduty.model.UpdateDetectorResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.UpdateDetectorResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.UpdateDetectorRequest update-detector-request]
    (-> this (.updateDetector update-detector-request))))

(defn list-threat-intel-sets
  "Lists the ThreatIntelSets of the GuardDuty service specified by the detector ID.

  list-threat-intel-sets-request - `com.amazonaws.services.guardduty.model.ListThreatIntelSetsRequest`

  returns: Result of the ListThreatIntelSets operation returned by the service. - `com.amazonaws.services.guardduty.model.ListThreatIntelSetsResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.ListThreatIntelSetsResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.ListThreatIntelSetsRequest list-threat-intel-sets-request]
    (-> this (.listThreatIntelSets list-threat-intel-sets-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonGuardDuty this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-findings
  "Describes Amazon GuardDuty findings specified by finding IDs.

  get-findings-request - `com.amazonaws.services.guardduty.model.GetFindingsRequest`

  returns: Result of the GetFindings operation returned by the service. - `com.amazonaws.services.guardduty.model.GetFindingsResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.GetFindingsResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.GetFindingsRequest get-findings-request]
    (-> this (.getFindings get-findings-request))))

(defn create-ip-set
  "Creates a new IPSet - a list of trusted IP addresses that have been whitelisted for secure communication with AWS
   infrastructure and applications.

  create-ip-set-request - `com.amazonaws.services.guardduty.model.CreateIPSetRequest`

  returns: Result of the CreateIPSet operation returned by the service. - `com.amazonaws.services.guardduty.model.CreateIPSetResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.CreateIPSetResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.CreateIPSetRequest create-ip-set-request]
    (-> this (.createIPSet create-ip-set-request))))

(defn tag-resource
  "Adds tags to a resource.

  tag-resource-request - `com.amazonaws.services.guardduty.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.guardduty.model.TagResourceResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.TagResourceResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

(defn list-invitations
  "Lists all GuardDuty membership invitations that were sent to the current AWS account.

  list-invitations-request - `com.amazonaws.services.guardduty.model.ListInvitationsRequest`

  returns: Result of the ListInvitations operation returned by the service. - `com.amazonaws.services.guardduty.model.ListInvitationsResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.ListInvitationsResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.ListInvitationsRequest list-invitations-request]
    (-> this (.listInvitations list-invitations-request))))

(defn delete-ip-set
  "Deletes the IPSet specified by the IPSet ID.

  delete-ip-set-request - `com.amazonaws.services.guardduty.model.DeleteIPSetRequest`

  returns: Result of the DeleteIPSet operation returned by the service. - `com.amazonaws.services.guardduty.model.DeleteIPSetResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.DeleteIPSetResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.DeleteIPSetRequest delete-ip-set-request]
    (-> this (.deleteIPSet delete-ip-set-request))))

(defn archive-findings
  "Archives Amazon GuardDuty findings specified by the list of finding IDs.

  archive-findings-request - `com.amazonaws.services.guardduty.model.ArchiveFindingsRequest`

  returns: Result of the ArchiveFindings operation returned by the service. - `com.amazonaws.services.guardduty.model.ArchiveFindingsResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.ArchiveFindingsResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.ArchiveFindingsRequest archive-findings-request]
    (-> this (.archiveFindings archive-findings-request))))

(defn update-findings-feedback
  "Marks specified Amazon GuardDuty findings as useful or not useful.

  update-findings-feedback-request - `com.amazonaws.services.guardduty.model.UpdateFindingsFeedbackRequest`

  returns: Result of the UpdateFindingsFeedback operation returned by the service. - `com.amazonaws.services.guardduty.model.UpdateFindingsFeedbackResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.UpdateFindingsFeedbackResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.UpdateFindingsFeedbackRequest update-findings-feedback-request]
    (-> this (.updateFindingsFeedback update-findings-feedback-request))))

(defn decline-invitations
  "Declines invitations sent to the current member account by AWS account specified by their account IDs.

  decline-invitations-request - `com.amazonaws.services.guardduty.model.DeclineInvitationsRequest`

  returns: Result of the DeclineInvitations operation returned by the service. - `com.amazonaws.services.guardduty.model.DeclineInvitationsResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.DeclineInvitationsResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.DeclineInvitationsRequest decline-invitations-request]
    (-> this (.declineInvitations decline-invitations-request))))

(defn get-detector
  "Retrieves an Amazon GuardDuty detector specified by the detectorId.

  get-detector-request - `com.amazonaws.services.guardduty.model.GetDetectorRequest`

  returns: Result of the GetDetector operation returned by the service. - `com.amazonaws.services.guardduty.model.GetDetectorResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.GetDetectorResult [^AmazonGuardDuty this ^com.amazonaws.services.guardduty.model.GetDetectorRequest get-detector-request]
    (-> this (.getDetector get-detector-request))))

