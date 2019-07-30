(ns com.amazonaws.services.guardduty.AmazonGuardDutyClient
  "Client for accessing Amazon GuardDuty. All service calls made using this client are blocking, and will not return
  until the service call completes.


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
  (:import [com.amazonaws.services.guardduty AmazonGuardDutyClient]))

(defn *builder
  "returns: `com.amazonaws.services.guardduty.AmazonGuardDutyClientBuilder`"
  (^com.amazonaws.services.guardduty.AmazonGuardDutyClientBuilder []
    (AmazonGuardDutyClient/builder )))

(defn list-findings
  "Lists Amazon GuardDuty findings for the specified detector ID.

  request - `com.amazonaws.services.guardduty.model.ListFindingsRequest`

  returns: Result of the ListFindings operation returned by the service. - `com.amazonaws.services.guardduty.model.ListFindingsResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.ListFindingsResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.ListFindingsRequest request]
    (-> this (.listFindings request))))

(defn list-tags-for-resource
  "Lists tags for a resource. Tagging is currently supported for detectors, finding filters, IP sets, and Threat
   Intel sets, with a limit of 50 tags per resource. When invoked, this operation returns all assigned tags for a
   given resource..

  request - `com.amazonaws.services.guardduty.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.guardduty.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.ListTagsForResourceResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn accept-invitation
  "Accepts the invitation to be monitored by a master GuardDuty account.

  request - `com.amazonaws.services.guardduty.model.AcceptInvitationRequest`

  returns: Result of the AcceptInvitation operation returned by the service. - `com.amazonaws.services.guardduty.model.AcceptInvitationResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.AcceptInvitationResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.AcceptInvitationRequest request]
    (-> this (.acceptInvitation request))))

(defn update-filter
  "Updates the filter specified by the filter name.

  request - `com.amazonaws.services.guardduty.model.UpdateFilterRequest`

  returns: Result of the UpdateFilter operation returned by the service. - `com.amazonaws.services.guardduty.model.UpdateFilterResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.UpdateFilterResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.UpdateFilterRequest request]
    (-> this (.updateFilter request))))

(defn invite-members
  "Invites other AWS accounts (created as members of the current AWS account by CreateMembers) to enable GuardDuty
   and allow the current AWS account to view and manage these accounts' GuardDuty findings on their behalf as the
   master account.

  request - `com.amazonaws.services.guardduty.model.InviteMembersRequest`

  returns: Result of the InviteMembers operation returned by the service. - `com.amazonaws.services.guardduty.model.InviteMembersResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.InviteMembersResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.InviteMembersRequest request]
    (-> this (.inviteMembers request))))

(defn list-ip-sets
  "Lists the IPSets of the GuardDuty service specified by the detector ID.

  request - `com.amazonaws.services.guardduty.model.ListIPSetsRequest`

  returns: Result of the ListIPSets operation returned by the service. - `com.amazonaws.services.guardduty.model.ListIPSetsResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.ListIPSetsResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.ListIPSetsRequest request]
    (-> this (.listIPSets request))))

(defn unarchive-findings
  "Unarchives Amazon GuardDuty findings specified by the list of finding IDs.

  request - `com.amazonaws.services.guardduty.model.UnarchiveFindingsRequest`

  returns: Result of the UnarchiveFindings operation returned by the service. - `com.amazonaws.services.guardduty.model.UnarchiveFindingsResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.UnarchiveFindingsResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.UnarchiveFindingsRequest request]
    (-> this (.unarchiveFindings request))))

(defn get-members
  "Retrieves GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.

  request - `com.amazonaws.services.guardduty.model.GetMembersRequest`

  returns: Result of the GetMembers operation returned by the service. - `com.amazonaws.services.guardduty.model.GetMembersResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.GetMembersResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.GetMembersRequest request]
    (-> this (.getMembers request))))

(defn get-findings-statistics
  "Lists Amazon GuardDuty findings' statistics for the specified detector ID.

  request - `com.amazonaws.services.guardduty.model.GetFindingsStatisticsRequest`

  returns: Result of the GetFindingsStatistics operation returned by the service. - `com.amazonaws.services.guardduty.model.GetFindingsStatisticsResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.GetFindingsStatisticsResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.GetFindingsStatisticsRequest request]
    (-> this (.getFindingsStatistics request))))

(defn get-master-account
  "Provides the details for the GuardDuty master account to the current GuardDuty member account.

  request - `com.amazonaws.services.guardduty.model.GetMasterAccountRequest`

  returns: Result of the GetMasterAccount operation returned by the service. - `com.amazonaws.services.guardduty.model.GetMasterAccountResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.GetMasterAccountResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.GetMasterAccountRequest request]
    (-> this (.getMasterAccount request))))

(defn start-monitoring-members
  "Re-enables GuardDuty to monitor findings of the member accounts specified by the account IDs. A master GuardDuty
   account can run this command after disabling GuardDuty from monitoring these members' findings by running
   StopMonitoringMembers.

  request - `com.amazonaws.services.guardduty.model.StartMonitoringMembersRequest`

  returns: Result of the StartMonitoringMembers operation returned by the service. - `com.amazonaws.services.guardduty.model.StartMonitoringMembersResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.StartMonitoringMembersResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.StartMonitoringMembersRequest request]
    (-> this (.startMonitoringMembers request))))

(defn disassociate-from-master-account
  "Disassociates the current GuardDuty member account from its master account.

  request - `com.amazonaws.services.guardduty.model.DisassociateFromMasterAccountRequest`

  returns: Result of the DisassociateFromMasterAccount operation returned by the service. - `com.amazonaws.services.guardduty.model.DisassociateFromMasterAccountResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.DisassociateFromMasterAccountResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.DisassociateFromMasterAccountRequest request]
    (-> this (.disassociateFromMasterAccount request))))

(defn untag-resource
  "Removes tags from a resource.

  request - `com.amazonaws.services.guardduty.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.guardduty.model.UntagResourceResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.UntagResourceResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn update-ip-set
  "Updates the IPSet specified by the IPSet ID.

  request - `com.amazonaws.services.guardduty.model.UpdateIPSetRequest`

  returns: Result of the UpdateIPSet operation returned by the service. - `com.amazonaws.services.guardduty.model.UpdateIPSetResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.UpdateIPSetResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.UpdateIPSetRequest request]
    (-> this (.updateIPSet request))))

(defn list-detectors
  "Lists detectorIds of all the existing Amazon GuardDuty detector resources.

  request - `com.amazonaws.services.guardduty.model.ListDetectorsRequest`

  returns: Result of the ListDetectors operation returned by the service. - `com.amazonaws.services.guardduty.model.ListDetectorsResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.ListDetectorsResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.ListDetectorsRequest request]
    (-> this (.listDetectors request))))

(defn delete-threat-intel-set
  "Deletes ThreatIntelSet specified by the ThreatIntelSet ID.

  request - `com.amazonaws.services.guardduty.model.DeleteThreatIntelSetRequest`

  returns: Result of the DeleteThreatIntelSet operation returned by the service. - `com.amazonaws.services.guardduty.model.DeleteThreatIntelSetResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.DeleteThreatIntelSetResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.DeleteThreatIntelSetRequest request]
    (-> this (.deleteThreatIntelSet request))))

(defn stop-monitoring-members
  "Disables GuardDuty from monitoring findings of the member accounts specified by the account IDs. After running
   this command, a master GuardDuty account can run StartMonitoringMembers to re-enable GuardDuty to monitor these
   members’ findings.

  request - `com.amazonaws.services.guardduty.model.StopMonitoringMembersRequest`

  returns: Result of the StopMonitoringMembers operation returned by the service. - `com.amazonaws.services.guardduty.model.StopMonitoringMembersResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.StopMonitoringMembersResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.StopMonitoringMembersRequest request]
    (-> this (.stopMonitoringMembers request))))

(defn delete-invitations
  "Deletes invitations sent to the current member account by AWS accounts specified by their account IDs.

  request - `com.amazonaws.services.guardduty.model.DeleteInvitationsRequest`

  returns: Result of the DeleteInvitations operation returned by the service. - `com.amazonaws.services.guardduty.model.DeleteInvitationsResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.DeleteInvitationsResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.DeleteInvitationsRequest request]
    (-> this (.deleteInvitations request))))

(defn create-filter
  "Creates a filter using the specified finding criteria.

  request - `com.amazonaws.services.guardduty.model.CreateFilterRequest`

  returns: Result of the CreateFilter operation returned by the service. - `com.amazonaws.services.guardduty.model.CreateFilterResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.CreateFilterResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.CreateFilterRequest request]
    (-> this (.createFilter request))))

(defn update-threat-intel-set
  "Updates the ThreatIntelSet specified by ThreatIntelSet ID.

  request - `com.amazonaws.services.guardduty.model.UpdateThreatIntelSetRequest`

  returns: Result of the UpdateThreatIntelSet operation returned by the service. - `com.amazonaws.services.guardduty.model.UpdateThreatIntelSetResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.UpdateThreatIntelSetResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.UpdateThreatIntelSetRequest request]
    (-> this (.updateThreatIntelSet request))))

(defn create-detector
  "Creates a single Amazon GuardDuty detector. A detector is an object that represents the GuardDuty service. A
   detector must be created in order for GuardDuty to become operational.

  request - `com.amazonaws.services.guardduty.model.CreateDetectorRequest`

  returns: Result of the CreateDetector operation returned by the service. - `com.amazonaws.services.guardduty.model.CreateDetectorResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.CreateDetectorResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.CreateDetectorRequest request]
    (-> this (.createDetector request))))

(defn delete-filter
  "Deletes the filter specified by the filter name.

  request - `com.amazonaws.services.guardduty.model.DeleteFilterRequest`

  returns: Result of the DeleteFilter operation returned by the service. - `com.amazonaws.services.guardduty.model.DeleteFilterResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.DeleteFilterResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.DeleteFilterRequest request]
    (-> this (.deleteFilter request))))

(defn disassociate-members
  "Disassociates GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.

  request - `com.amazonaws.services.guardduty.model.DisassociateMembersRequest`

  returns: Result of the DisassociateMembers operation returned by the service. - `com.amazonaws.services.guardduty.model.DisassociateMembersResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.DisassociateMembersResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.DisassociateMembersRequest request]
    (-> this (.disassociateMembers request))))

(defn list-filters
  "Returns a paginated list of the current filters.

  request - `com.amazonaws.services.guardduty.model.ListFiltersRequest`

  returns: Result of the ListFilters operation returned by the service. - `com.amazonaws.services.guardduty.model.ListFiltersResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.ListFiltersResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.ListFiltersRequest request]
    (-> this (.listFilters request))))

(defn get-filter
  "Returns the details of the filter specified by the filter name.

  request - `com.amazonaws.services.guardduty.model.GetFilterRequest`

  returns: Result of the GetFilter operation returned by the service. - `com.amazonaws.services.guardduty.model.GetFilterResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.GetFilterResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.GetFilterRequest request]
    (-> this (.getFilter request))))

(defn get-invitations-count
  "Returns the count of all GuardDuty membership invitations that were sent to the current member account except the
   currently accepted invitation.

  request - `com.amazonaws.services.guardduty.model.GetInvitationsCountRequest`

  returns: Result of the GetInvitationsCount operation returned by the service. - `com.amazonaws.services.guardduty.model.GetInvitationsCountResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.GetInvitationsCountResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.GetInvitationsCountRequest request]
    (-> this (.getInvitationsCount request))))

(defn create-sample-findings
  "Generates example findings of types specified by the list of finding types. If 'NULL' is specified for
   findingTypes, the API generates example findings of all supported finding types.

  request - `com.amazonaws.services.guardduty.model.CreateSampleFindingsRequest`

  returns: Result of the CreateSampleFindings operation returned by the service. - `com.amazonaws.services.guardduty.model.CreateSampleFindingsResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.CreateSampleFindingsResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.CreateSampleFindingsRequest request]
    (-> this (.createSampleFindings request))))

(defn delete-detector
  "Deletes a Amazon GuardDuty detector specified by the detector ID.

  request - `com.amazonaws.services.guardduty.model.DeleteDetectorRequest`

  returns: Result of the DeleteDetector operation returned by the service. - `com.amazonaws.services.guardduty.model.DeleteDetectorResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.DeleteDetectorResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.DeleteDetectorRequest request]
    (-> this (.deleteDetector request))))

(defn list-members
  "Lists details about all member accounts for the current GuardDuty master account.

  request - `com.amazonaws.services.guardduty.model.ListMembersRequest`

  returns: Result of the ListMembers operation returned by the service. - `com.amazonaws.services.guardduty.model.ListMembersResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.ListMembersResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.ListMembersRequest request]
    (-> this (.listMembers request))))

(defn delete-members
  "Deletes GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.

  request - `com.amazonaws.services.guardduty.model.DeleteMembersRequest`

  returns: Result of the DeleteMembers operation returned by the service. - `com.amazonaws.services.guardduty.model.DeleteMembersResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.DeleteMembersResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.DeleteMembersRequest request]
    (-> this (.deleteMembers request))))

(defn create-threat-intel-set
  "Create a new ThreatIntelSet. ThreatIntelSets consist of known malicious IP addresses. GuardDuty generates
   findings based on ThreatIntelSets.

  request - `com.amazonaws.services.guardduty.model.CreateThreatIntelSetRequest`

  returns: Result of the CreateThreatIntelSet operation returned by the service. - `com.amazonaws.services.guardduty.model.CreateThreatIntelSetResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.CreateThreatIntelSetResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.CreateThreatIntelSetRequest request]
    (-> this (.createThreatIntelSet request))))

(defn get-threat-intel-set
  "Retrieves the ThreatIntelSet that is specified by the ThreatIntelSet ID.

  request - `com.amazonaws.services.guardduty.model.GetThreatIntelSetRequest`

  returns: Result of the GetThreatIntelSet operation returned by the service. - `com.amazonaws.services.guardduty.model.GetThreatIntelSetResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.GetThreatIntelSetResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.GetThreatIntelSetRequest request]
    (-> this (.getThreatIntelSet request))))

(defn create-members
  "Creates member accounts of the current AWS account by specifying a list of AWS account IDs. The current AWS
   account can then invite these members to manage GuardDuty in their accounts.

  request - `com.amazonaws.services.guardduty.model.CreateMembersRequest`

  returns: Result of the CreateMembers operation returned by the service. - `com.amazonaws.services.guardduty.model.CreateMembersResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.CreateMembersResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.CreateMembersRequest request]
    (-> this (.createMembers request))))

(defn get-ip-set
  "Retrieves the IPSet specified by the IPSet ID.

  request - `com.amazonaws.services.guardduty.model.GetIPSetRequest`

  returns: Result of the GetIPSet operation returned by the service. - `com.amazonaws.services.guardduty.model.GetIPSetResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.GetIPSetResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.GetIPSetRequest request]
    (-> this (.getIPSet request))))

(defn update-detector
  "Updates an Amazon GuardDuty detector specified by the detectorId.

  request - `com.amazonaws.services.guardduty.model.UpdateDetectorRequest`

  returns: Result of the UpdateDetector operation returned by the service. - `com.amazonaws.services.guardduty.model.UpdateDetectorResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.UpdateDetectorResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.UpdateDetectorRequest request]
    (-> this (.updateDetector request))))

(defn list-threat-intel-sets
  "Lists the ThreatIntelSets of the GuardDuty service specified by the detector ID.

  request - `com.amazonaws.services.guardduty.model.ListThreatIntelSetsRequest`

  returns: Result of the ListThreatIntelSets operation returned by the service. - `com.amazonaws.services.guardduty.model.ListThreatIntelSetsResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.ListThreatIntelSetsResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.ListThreatIntelSetsRequest request]
    (-> this (.listThreatIntelSets request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonGuardDutyClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-findings
  "Describes Amazon GuardDuty findings specified by finding IDs.

  request - `com.amazonaws.services.guardduty.model.GetFindingsRequest`

  returns: Result of the GetFindings operation returned by the service. - `com.amazonaws.services.guardduty.model.GetFindingsResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.GetFindingsResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.GetFindingsRequest request]
    (-> this (.getFindings request))))

(defn create-ip-set
  "Creates a new IPSet - a list of trusted IP addresses that have been whitelisted for secure communication with AWS
   infrastructure and applications.

  request - `com.amazonaws.services.guardduty.model.CreateIPSetRequest`

  returns: Result of the CreateIPSet operation returned by the service. - `com.amazonaws.services.guardduty.model.CreateIPSetResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.CreateIPSetResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.CreateIPSetRequest request]
    (-> this (.createIPSet request))))

(defn tag-resource
  "Adds tags to a resource.

  request - `com.amazonaws.services.guardduty.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.guardduty.model.TagResourceResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.TagResourceResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn list-invitations
  "Lists all GuardDuty membership invitations that were sent to the current AWS account.

  request - `com.amazonaws.services.guardduty.model.ListInvitationsRequest`

  returns: Result of the ListInvitations operation returned by the service. - `com.amazonaws.services.guardduty.model.ListInvitationsResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.ListInvitationsResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.ListInvitationsRequest request]
    (-> this (.listInvitations request))))

(defn delete-ip-set
  "Deletes the IPSet specified by the IPSet ID.

  request - `com.amazonaws.services.guardduty.model.DeleteIPSetRequest`

  returns: Result of the DeleteIPSet operation returned by the service. - `com.amazonaws.services.guardduty.model.DeleteIPSetResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.DeleteIPSetResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.DeleteIPSetRequest request]
    (-> this (.deleteIPSet request))))

(defn archive-findings
  "Archives Amazon GuardDuty findings specified by the list of finding IDs.

  request - `com.amazonaws.services.guardduty.model.ArchiveFindingsRequest`

  returns: Result of the ArchiveFindings operation returned by the service. - `com.amazonaws.services.guardduty.model.ArchiveFindingsResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.ArchiveFindingsResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.ArchiveFindingsRequest request]
    (-> this (.archiveFindings request))))

(defn update-findings-feedback
  "Marks specified Amazon GuardDuty findings as useful or not useful.

  request - `com.amazonaws.services.guardduty.model.UpdateFindingsFeedbackRequest`

  returns: Result of the UpdateFindingsFeedback operation returned by the service. - `com.amazonaws.services.guardduty.model.UpdateFindingsFeedbackResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.UpdateFindingsFeedbackResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.UpdateFindingsFeedbackRequest request]
    (-> this (.updateFindingsFeedback request))))

(defn decline-invitations
  "Declines invitations sent to the current member account by AWS account specified by their account IDs.

  request - `com.amazonaws.services.guardduty.model.DeclineInvitationsRequest`

  returns: Result of the DeclineInvitations operation returned by the service. - `com.amazonaws.services.guardduty.model.DeclineInvitationsResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.DeclineInvitationsResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.DeclineInvitationsRequest request]
    (-> this (.declineInvitations request))))

(defn get-detector
  "Retrieves an Amazon GuardDuty detector specified by the detectorId.

  request - `com.amazonaws.services.guardduty.model.GetDetectorRequest`

  returns: Result of the GetDetector operation returned by the service. - `com.amazonaws.services.guardduty.model.GetDetectorResult`

  throws: com.amazonaws.services.guardduty.model.BadRequestException - Bad request exception object."
  (^com.amazonaws.services.guardduty.model.GetDetectorResult [^AmazonGuardDutyClient this ^com.amazonaws.services.guardduty.model.GetDetectorRequest request]
    (-> this (.getDetector request))))

