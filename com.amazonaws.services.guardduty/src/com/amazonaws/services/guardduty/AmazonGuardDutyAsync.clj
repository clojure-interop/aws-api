(ns com.amazonaws.services.guardduty.AmazonGuardDutyAsync
  "Interface for accessing Amazon GuardDuty asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonGuardDutyAsync instead.



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
  (:import [com.amazonaws.services.guardduty AmazonGuardDutyAsync]))

(defn untag-resource-async
  "Removes tags from a resource.

  untag-resource-request - `com.amazonaws.services.guardduty.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn create-filter-async
  "Creates a filter using the specified finding criteria.

  create-filter-request - `com.amazonaws.services.guardduty.model.CreateFilterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateFilter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.CreateFilterResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.CreateFilterRequest create-filter-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createFilterAsync create-filter-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.CreateFilterRequest create-filter-request]
    (-> this (.createFilterAsync create-filter-request))))

(defn list-invitations-async
  "Lists all GuardDuty membership invitations that were sent to the current AWS account.

  list-invitations-request - `com.amazonaws.services.guardduty.model.ListInvitationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListInvitations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.ListInvitationsResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.ListInvitationsRequest list-invitations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listInvitationsAsync list-invitations-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.ListInvitationsRequest list-invitations-request]
    (-> this (.listInvitationsAsync list-invitations-request))))

(defn stop-monitoring-members-async
  "Disables GuardDuty from monitoring findings of the member accounts specified by the account IDs. After running
   this command, a master GuardDuty account can run StartMonitoringMembers to re-enable GuardDuty to monitor these
   members’ findings.

  stop-monitoring-members-request - `com.amazonaws.services.guardduty.model.StopMonitoringMembersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopMonitoringMembers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.StopMonitoringMembersResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.StopMonitoringMembersRequest stop-monitoring-members-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopMonitoringMembersAsync stop-monitoring-members-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.StopMonitoringMembersRequest stop-monitoring-members-request]
    (-> this (.stopMonitoringMembersAsync stop-monitoring-members-request))))

(defn invite-members-async
  "Invites other AWS accounts (created as members of the current AWS account by CreateMembers) to enable GuardDuty
   and allow the current AWS account to view and manage these accounts' GuardDuty findings on their behalf as the
   master account.

  invite-members-request - `com.amazonaws.services.guardduty.model.InviteMembersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the InviteMembers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.InviteMembersResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.InviteMembersRequest invite-members-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.inviteMembersAsync invite-members-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.InviteMembersRequest invite-members-request]
    (-> this (.inviteMembersAsync invite-members-request))))

(defn unarchive-findings-async
  "Unarchives Amazon GuardDuty findings specified by the list of finding IDs.

  unarchive-findings-request - `com.amazonaws.services.guardduty.model.UnarchiveFindingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UnarchiveFindings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.UnarchiveFindingsResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.UnarchiveFindingsRequest unarchive-findings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.unarchiveFindingsAsync unarchive-findings-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.UnarchiveFindingsRequest unarchive-findings-request]
    (-> this (.unarchiveFindingsAsync unarchive-findings-request))))

(defn create-threat-intel-set-async
  "Create a new ThreatIntelSet. ThreatIntelSets consist of known malicious IP addresses. GuardDuty generates
   findings based on ThreatIntelSets.

  create-threat-intel-set-request - `com.amazonaws.services.guardduty.model.CreateThreatIntelSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateThreatIntelSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.CreateThreatIntelSetResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.CreateThreatIntelSetRequest create-threat-intel-set-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createThreatIntelSetAsync create-threat-intel-set-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.CreateThreatIntelSetRequest create-threat-intel-set-request]
    (-> this (.createThreatIntelSetAsync create-threat-intel-set-request))))

(defn delete-filter-async
  "Deletes the filter specified by the filter name.

  delete-filter-request - `com.amazonaws.services.guardduty.model.DeleteFilterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFilter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.DeleteFilterResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.DeleteFilterRequest delete-filter-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFilterAsync delete-filter-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.DeleteFilterRequest delete-filter-request]
    (-> this (.deleteFilterAsync delete-filter-request))))

(defn start-monitoring-members-async
  "Re-enables GuardDuty to monitor findings of the member accounts specified by the account IDs. A master GuardDuty
   account can run this command after disabling GuardDuty from monitoring these members' findings by running
   StopMonitoringMembers.

  start-monitoring-members-request - `com.amazonaws.services.guardduty.model.StartMonitoringMembersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartMonitoringMembers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.StartMonitoringMembersResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.StartMonitoringMembersRequest start-monitoring-members-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startMonitoringMembersAsync start-monitoring-members-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.StartMonitoringMembersRequest start-monitoring-members-request]
    (-> this (.startMonitoringMembersAsync start-monitoring-members-request))))

(defn get-findings-async
  "Describes Amazon GuardDuty findings specified by finding IDs.

  get-findings-request - `com.amazonaws.services.guardduty.model.GetFindingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFindings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.GetFindingsResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.GetFindingsRequest get-findings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFindingsAsync get-findings-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.GetFindingsRequest get-findings-request]
    (-> this (.getFindingsAsync get-findings-request))))

(defn list-members-async
  "Lists details about all member accounts for the current GuardDuty master account.

  list-members-request - `com.amazonaws.services.guardduty.model.ListMembersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListMembers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.ListMembersResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.ListMembersRequest list-members-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listMembersAsync list-members-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.ListMembersRequest list-members-request]
    (-> this (.listMembersAsync list-members-request))))

(defn delete-members-async
  "Deletes GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.

  delete-members-request - `com.amazonaws.services.guardduty.model.DeleteMembersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteMembers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.DeleteMembersResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.DeleteMembersRequest delete-members-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteMembersAsync delete-members-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.DeleteMembersRequest delete-members-request]
    (-> this (.deleteMembersAsync delete-members-request))))

(defn create-sample-findings-async
  "Generates example findings of types specified by the list of finding types. If 'NULL' is specified for
   findingTypes, the API generates example findings of all supported finding types.

  create-sample-findings-request - `com.amazonaws.services.guardduty.model.CreateSampleFindingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSampleFindings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.CreateSampleFindingsResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.CreateSampleFindingsRequest create-sample-findings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSampleFindingsAsync create-sample-findings-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.CreateSampleFindingsRequest create-sample-findings-request]
    (-> this (.createSampleFindingsAsync create-sample-findings-request))))

(defn list-filters-async
  "Returns a paginated list of the current filters.

  list-filters-request - `com.amazonaws.services.guardduty.model.ListFiltersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListFilters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.ListFiltersResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.ListFiltersRequest list-filters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listFiltersAsync list-filters-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.ListFiltersRequest list-filters-request]
    (-> this (.listFiltersAsync list-filters-request))))

(defn list-detectors-async
  "Lists detectorIds of all the existing Amazon GuardDuty detector resources.

  list-detectors-request - `com.amazonaws.services.guardduty.model.ListDetectorsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDetectors operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.ListDetectorsResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.ListDetectorsRequest list-detectors-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDetectorsAsync list-detectors-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.ListDetectorsRequest list-detectors-request]
    (-> this (.listDetectorsAsync list-detectors-request))))

(defn disassociate-members-async
  "Disassociates GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.

  disassociate-members-request - `com.amazonaws.services.guardduty.model.DisassociateMembersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateMembers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.DisassociateMembersResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.DisassociateMembersRequest disassociate-members-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateMembersAsync disassociate-members-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.DisassociateMembersRequest disassociate-members-request]
    (-> this (.disassociateMembersAsync disassociate-members-request))))

(defn create-ip-set-async
  "Creates a new IPSet - a list of trusted IP addresses that have been whitelisted for secure communication with AWS
   infrastructure and applications.

  create-ip-set-request - `com.amazonaws.services.guardduty.model.CreateIPSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateIPSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.CreateIPSetResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.CreateIPSetRequest create-ip-set-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createIPSetAsync create-ip-set-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.CreateIPSetRequest create-ip-set-request]
    (-> this (.createIPSetAsync create-ip-set-request))))

(defn get-ip-set-async
  "Retrieves the IPSet specified by the IPSet ID.

  get-ip-set-request - `com.amazonaws.services.guardduty.model.GetIPSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetIPSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.GetIPSetResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.GetIPSetRequest get-ip-set-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIPSetAsync get-ip-set-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.GetIPSetRequest get-ip-set-request]
    (-> this (.getIPSetAsync get-ip-set-request))))

(defn delete-invitations-async
  "Deletes invitations sent to the current member account by AWS accounts specified by their account IDs.

  delete-invitations-request - `com.amazonaws.services.guardduty.model.DeleteInvitationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteInvitations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.DeleteInvitationsResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.DeleteInvitationsRequest delete-invitations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteInvitationsAsync delete-invitations-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.DeleteInvitationsRequest delete-invitations-request]
    (-> this (.deleteInvitationsAsync delete-invitations-request))))

(defn decline-invitations-async
  "Declines invitations sent to the current member account by AWS account specified by their account IDs.

  decline-invitations-request - `com.amazonaws.services.guardduty.model.DeclineInvitationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeclineInvitations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.DeclineInvitationsResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.DeclineInvitationsRequest decline-invitations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.declineInvitationsAsync decline-invitations-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.DeclineInvitationsRequest decline-invitations-request]
    (-> this (.declineInvitationsAsync decline-invitations-request))))

(defn update-filter-async
  "Updates the filter specified by the filter name.

  update-filter-request - `com.amazonaws.services.guardduty.model.UpdateFilterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateFilter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.UpdateFilterResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.UpdateFilterRequest update-filter-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateFilterAsync update-filter-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.UpdateFilterRequest update-filter-request]
    (-> this (.updateFilterAsync update-filter-request))))

(defn create-detector-async
  "Creates a single Amazon GuardDuty detector. A detector is an object that represents the GuardDuty service. A
   detector must be created in order for GuardDuty to become operational.

  create-detector-request - `com.amazonaws.services.guardduty.model.CreateDetectorRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDetector operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.CreateDetectorResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.CreateDetectorRequest create-detector-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDetectorAsync create-detector-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.CreateDetectorRequest create-detector-request]
    (-> this (.createDetectorAsync create-detector-request))))

(defn update-threat-intel-set-async
  "Updates the ThreatIntelSet specified by ThreatIntelSet ID.

  update-threat-intel-set-request - `com.amazonaws.services.guardduty.model.UpdateThreatIntelSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateThreatIntelSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.UpdateThreatIntelSetResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.UpdateThreatIntelSetRequest update-threat-intel-set-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateThreatIntelSetAsync update-threat-intel-set-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.UpdateThreatIntelSetRequest update-threat-intel-set-request]
    (-> this (.updateThreatIntelSetAsync update-threat-intel-set-request))))

(defn list-ip-sets-async
  "Lists the IPSets of the GuardDuty service specified by the detector ID.

  list-ip-sets-request - `com.amazonaws.services.guardduty.model.ListIPSetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListIPSets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.ListIPSetsResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.ListIPSetsRequest list-ip-sets-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listIPSetsAsync list-ip-sets-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.ListIPSetsRequest list-ip-sets-request]
    (-> this (.listIPSetsAsync list-ip-sets-request))))

(defn update-findings-feedback-async
  "Marks specified Amazon GuardDuty findings as useful or not useful.

  update-findings-feedback-request - `com.amazonaws.services.guardduty.model.UpdateFindingsFeedbackRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateFindingsFeedback operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.UpdateFindingsFeedbackResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.UpdateFindingsFeedbackRequest update-findings-feedback-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateFindingsFeedbackAsync update-findings-feedback-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.UpdateFindingsFeedbackRequest update-findings-feedback-request]
    (-> this (.updateFindingsFeedbackAsync update-findings-feedback-request))))

(defn list-tags-for-resource-async
  "Lists tags for a resource. Tagging is currently supported for detectors, finding filters, IP sets, and Threat
   Intel sets, with a limit of 50 tags per resource. When invoked, this operation returns all assigned tags for a
   given resource..

  list-tags-for-resource-request - `com.amazonaws.services.guardduty.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn delete-ip-set-async
  "Deletes the IPSet specified by the IPSet ID.

  delete-ip-set-request - `com.amazonaws.services.guardduty.model.DeleteIPSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteIPSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.DeleteIPSetResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.DeleteIPSetRequest delete-ip-set-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteIPSetAsync delete-ip-set-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.DeleteIPSetRequest delete-ip-set-request]
    (-> this (.deleteIPSetAsync delete-ip-set-request))))

(defn archive-findings-async
  "Archives Amazon GuardDuty findings specified by the list of finding IDs.

  archive-findings-request - `com.amazonaws.services.guardduty.model.ArchiveFindingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ArchiveFindings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.ArchiveFindingsResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.ArchiveFindingsRequest archive-findings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.archiveFindingsAsync archive-findings-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.ArchiveFindingsRequest archive-findings-request]
    (-> this (.archiveFindingsAsync archive-findings-request))))

(defn disassociate-from-master-account-async
  "Disassociates the current GuardDuty member account from its master account.

  disassociate-from-master-account-request - `com.amazonaws.services.guardduty.model.DisassociateFromMasterAccountRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateFromMasterAccount operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.DisassociateFromMasterAccountResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.DisassociateFromMasterAccountRequest disassociate-from-master-account-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateFromMasterAccountAsync disassociate-from-master-account-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.DisassociateFromMasterAccountRequest disassociate-from-master-account-request]
    (-> this (.disassociateFromMasterAccountAsync disassociate-from-master-account-request))))

(defn list-threat-intel-sets-async
  "Lists the ThreatIntelSets of the GuardDuty service specified by the detector ID.

  list-threat-intel-sets-request - `com.amazonaws.services.guardduty.model.ListThreatIntelSetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListThreatIntelSets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.ListThreatIntelSetsResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.ListThreatIntelSetsRequest list-threat-intel-sets-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listThreatIntelSetsAsync list-threat-intel-sets-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.ListThreatIntelSetsRequest list-threat-intel-sets-request]
    (-> this (.listThreatIntelSetsAsync list-threat-intel-sets-request))))

(defn get-findings-statistics-async
  "Lists Amazon GuardDuty findings' statistics for the specified detector ID.

  get-findings-statistics-request - `com.amazonaws.services.guardduty.model.GetFindingsStatisticsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFindingsStatistics operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.GetFindingsStatisticsResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.GetFindingsStatisticsRequest get-findings-statistics-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFindingsStatisticsAsync get-findings-statistics-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.GetFindingsStatisticsRequest get-findings-statistics-request]
    (-> this (.getFindingsStatisticsAsync get-findings-statistics-request))))

(defn get-detector-async
  "Retrieves an Amazon GuardDuty detector specified by the detectorId.

  get-detector-request - `com.amazonaws.services.guardduty.model.GetDetectorRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDetector operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.GetDetectorResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.GetDetectorRequest get-detector-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDetectorAsync get-detector-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.GetDetectorRequest get-detector-request]
    (-> this (.getDetectorAsync get-detector-request))))

(defn update-ip-set-async
  "Updates the IPSet specified by the IPSet ID.

  update-ip-set-request - `com.amazonaws.services.guardduty.model.UpdateIPSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateIPSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.UpdateIPSetResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.UpdateIPSetRequest update-ip-set-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateIPSetAsync update-ip-set-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.UpdateIPSetRequest update-ip-set-request]
    (-> this (.updateIPSetAsync update-ip-set-request))))

(defn get-invitations-count-async
  "Returns the count of all GuardDuty membership invitations that were sent to the current member account except the
   currently accepted invitation.

  get-invitations-count-request - `com.amazonaws.services.guardduty.model.GetInvitationsCountRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetInvitationsCount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.GetInvitationsCountResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.GetInvitationsCountRequest get-invitations-count-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getInvitationsCountAsync get-invitations-count-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.GetInvitationsCountRequest get-invitations-count-request]
    (-> this (.getInvitationsCountAsync get-invitations-count-request))))

(defn accept-invitation-async
  "Accepts the invitation to be monitored by a master GuardDuty account.

  accept-invitation-request - `com.amazonaws.services.guardduty.model.AcceptInvitationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AcceptInvitation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.AcceptInvitationResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.AcceptInvitationRequest accept-invitation-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.acceptInvitationAsync accept-invitation-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.AcceptInvitationRequest accept-invitation-request]
    (-> this (.acceptInvitationAsync accept-invitation-request))))

(defn update-detector-async
  "Updates an Amazon GuardDuty detector specified by the detectorId.

  update-detector-request - `com.amazonaws.services.guardduty.model.UpdateDetectorRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDetector operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.UpdateDetectorResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.UpdateDetectorRequest update-detector-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDetectorAsync update-detector-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.UpdateDetectorRequest update-detector-request]
    (-> this (.updateDetectorAsync update-detector-request))))

(defn get-members-async
  "Retrieves GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.

  get-members-request - `com.amazonaws.services.guardduty.model.GetMembersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMembers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.GetMembersResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.GetMembersRequest get-members-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMembersAsync get-members-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.GetMembersRequest get-members-request]
    (-> this (.getMembersAsync get-members-request))))

(defn get-master-account-async
  "Provides the details for the GuardDuty master account to the current GuardDuty member account.

  get-master-account-request - `com.amazonaws.services.guardduty.model.GetMasterAccountRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMasterAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.GetMasterAccountResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.GetMasterAccountRequest get-master-account-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMasterAccountAsync get-master-account-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.GetMasterAccountRequest get-master-account-request]
    (-> this (.getMasterAccountAsync get-master-account-request))))

(defn delete-detector-async
  "Deletes a Amazon GuardDuty detector specified by the detector ID.

  delete-detector-request - `com.amazonaws.services.guardduty.model.DeleteDetectorRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDetector operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.DeleteDetectorResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.DeleteDetectorRequest delete-detector-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDetectorAsync delete-detector-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.DeleteDetectorRequest delete-detector-request]
    (-> this (.deleteDetectorAsync delete-detector-request))))

(defn get-filter-async
  "Returns the details of the filter specified by the filter name.

  get-filter-request - `com.amazonaws.services.guardduty.model.GetFilterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFilter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.GetFilterResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.GetFilterRequest get-filter-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFilterAsync get-filter-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.GetFilterRequest get-filter-request]
    (-> this (.getFilterAsync get-filter-request))))

(defn list-findings-async
  "Lists Amazon GuardDuty findings for the specified detector ID.

  list-findings-request - `com.amazonaws.services.guardduty.model.ListFindingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListFindings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.ListFindingsResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.ListFindingsRequest list-findings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listFindingsAsync list-findings-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.ListFindingsRequest list-findings-request]
    (-> this (.listFindingsAsync list-findings-request))))

(defn tag-resource-async
  "Adds tags to a resource.

  tag-resource-request - `com.amazonaws.services.guardduty.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn create-members-async
  "Creates member accounts of the current AWS account by specifying a list of AWS account IDs. The current AWS
   account can then invite these members to manage GuardDuty in their accounts.

  create-members-request - `com.amazonaws.services.guardduty.model.CreateMembersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateMembers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.CreateMembersResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.CreateMembersRequest create-members-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createMembersAsync create-members-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.CreateMembersRequest create-members-request]
    (-> this (.createMembersAsync create-members-request))))

(defn get-threat-intel-set-async
  "Retrieves the ThreatIntelSet that is specified by the ThreatIntelSet ID.

  get-threat-intel-set-request - `com.amazonaws.services.guardduty.model.GetThreatIntelSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetThreatIntelSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.GetThreatIntelSetResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.GetThreatIntelSetRequest get-threat-intel-set-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getThreatIntelSetAsync get-threat-intel-set-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.GetThreatIntelSetRequest get-threat-intel-set-request]
    (-> this (.getThreatIntelSetAsync get-threat-intel-set-request))))

(defn delete-threat-intel-set-async
  "Deletes ThreatIntelSet specified by the ThreatIntelSet ID.

  delete-threat-intel-set-request - `com.amazonaws.services.guardduty.model.DeleteThreatIntelSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteThreatIntelSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.DeleteThreatIntelSetResult>`"
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.DeleteThreatIntelSetRequest delete-threat-intel-set-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteThreatIntelSetAsync delete-threat-intel-set-request async-handler)))
  (^java.util.concurrent.Future [^AmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.DeleteThreatIntelSetRequest delete-threat-intel-set-request]
    (-> this (.deleteThreatIntelSetAsync delete-threat-intel-set-request))))

