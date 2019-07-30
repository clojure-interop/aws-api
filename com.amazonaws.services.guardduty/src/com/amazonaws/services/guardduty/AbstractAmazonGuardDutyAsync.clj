(ns com.amazonaws.services.guardduty.AbstractAmazonGuardDutyAsync
  "Abstract implementation of AmazonGuardDutyAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.guardduty AbstractAmazonGuardDutyAsync]))

(defn untag-resource-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn create-filter-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.CreateFilterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateFilter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.CreateFilterResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.CreateFilterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createFilterAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.CreateFilterRequest request]
    (-> this (.createFilterAsync request))))

(defn list-invitations-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.ListInvitationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListInvitations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.ListInvitationsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.ListInvitationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listInvitationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.ListInvitationsRequest request]
    (-> this (.listInvitationsAsync request))))

(defn stop-monitoring-members-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.StopMonitoringMembersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopMonitoringMembers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.StopMonitoringMembersResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.StopMonitoringMembersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopMonitoringMembersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.StopMonitoringMembersRequest request]
    (-> this (.stopMonitoringMembersAsync request))))

(defn invite-members-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.InviteMembersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the InviteMembers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.InviteMembersResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.InviteMembersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.inviteMembersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.InviteMembersRequest request]
    (-> this (.inviteMembersAsync request))))

(defn unarchive-findings-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.UnarchiveFindingsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UnarchiveFindings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.UnarchiveFindingsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.UnarchiveFindingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.unarchiveFindingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.UnarchiveFindingsRequest request]
    (-> this (.unarchiveFindingsAsync request))))

(defn create-threat-intel-set-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.CreateThreatIntelSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateThreatIntelSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.CreateThreatIntelSetResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.CreateThreatIntelSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createThreatIntelSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.CreateThreatIntelSetRequest request]
    (-> this (.createThreatIntelSetAsync request))))

(defn delete-filter-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.DeleteFilterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFilter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.DeleteFilterResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.DeleteFilterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFilterAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.DeleteFilterRequest request]
    (-> this (.deleteFilterAsync request))))

(defn start-monitoring-members-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.StartMonitoringMembersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartMonitoringMembers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.StartMonitoringMembersResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.StartMonitoringMembersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startMonitoringMembersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.StartMonitoringMembersRequest request]
    (-> this (.startMonitoringMembersAsync request))))

(defn get-findings-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.GetFindingsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFindings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.GetFindingsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.GetFindingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFindingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.GetFindingsRequest request]
    (-> this (.getFindingsAsync request))))

(defn list-members-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.ListMembersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListMembers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.ListMembersResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.ListMembersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listMembersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.ListMembersRequest request]
    (-> this (.listMembersAsync request))))

(defn delete-members-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.DeleteMembersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteMembers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.DeleteMembersResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.DeleteMembersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteMembersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.DeleteMembersRequest request]
    (-> this (.deleteMembersAsync request))))

(defn create-sample-findings-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.CreateSampleFindingsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSampleFindings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.CreateSampleFindingsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.CreateSampleFindingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSampleFindingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.CreateSampleFindingsRequest request]
    (-> this (.createSampleFindingsAsync request))))

(defn list-filters-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.ListFiltersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListFilters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.ListFiltersResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.ListFiltersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listFiltersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.ListFiltersRequest request]
    (-> this (.listFiltersAsync request))))

(defn list-detectors-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.ListDetectorsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDetectors operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.ListDetectorsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.ListDetectorsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDetectorsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.ListDetectorsRequest request]
    (-> this (.listDetectorsAsync request))))

(defn disassociate-members-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.DisassociateMembersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateMembers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.DisassociateMembersResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.DisassociateMembersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateMembersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.DisassociateMembersRequest request]
    (-> this (.disassociateMembersAsync request))))

(defn create-ip-set-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.CreateIPSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateIPSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.CreateIPSetResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.CreateIPSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createIPSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.CreateIPSetRequest request]
    (-> this (.createIPSetAsync request))))

(defn get-ip-set-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.GetIPSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetIPSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.GetIPSetResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.GetIPSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIPSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.GetIPSetRequest request]
    (-> this (.getIPSetAsync request))))

(defn delete-invitations-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.DeleteInvitationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteInvitations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.DeleteInvitationsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.DeleteInvitationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteInvitationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.DeleteInvitationsRequest request]
    (-> this (.deleteInvitationsAsync request))))

(defn decline-invitations-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.DeclineInvitationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeclineInvitations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.DeclineInvitationsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.DeclineInvitationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.declineInvitationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.DeclineInvitationsRequest request]
    (-> this (.declineInvitationsAsync request))))

(defn update-filter-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.UpdateFilterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateFilter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.UpdateFilterResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.UpdateFilterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateFilterAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.UpdateFilterRequest request]
    (-> this (.updateFilterAsync request))))

(defn create-detector-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.CreateDetectorRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDetector operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.CreateDetectorResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.CreateDetectorRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDetectorAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.CreateDetectorRequest request]
    (-> this (.createDetectorAsync request))))

(defn update-threat-intel-set-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.UpdateThreatIntelSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateThreatIntelSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.UpdateThreatIntelSetResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.UpdateThreatIntelSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateThreatIntelSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.UpdateThreatIntelSetRequest request]
    (-> this (.updateThreatIntelSetAsync request))))

(defn list-ip-sets-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.ListIPSetsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListIPSets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.ListIPSetsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.ListIPSetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listIPSetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.ListIPSetsRequest request]
    (-> this (.listIPSetsAsync request))))

(defn update-findings-feedback-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.UpdateFindingsFeedbackRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateFindingsFeedback operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.UpdateFindingsFeedbackResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.UpdateFindingsFeedbackRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateFindingsFeedbackAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.UpdateFindingsFeedbackRequest request]
    (-> this (.updateFindingsFeedbackAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn delete-ip-set-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.DeleteIPSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteIPSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.DeleteIPSetResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.DeleteIPSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteIPSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.DeleteIPSetRequest request]
    (-> this (.deleteIPSetAsync request))))

(defn archive-findings-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.ArchiveFindingsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ArchiveFindings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.ArchiveFindingsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.ArchiveFindingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.archiveFindingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.ArchiveFindingsRequest request]
    (-> this (.archiveFindingsAsync request))))

(defn disassociate-from-master-account-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.DisassociateFromMasterAccountRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateFromMasterAccount operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.DisassociateFromMasterAccountResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.DisassociateFromMasterAccountRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateFromMasterAccountAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.DisassociateFromMasterAccountRequest request]
    (-> this (.disassociateFromMasterAccountAsync request))))

(defn list-threat-intel-sets-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.ListThreatIntelSetsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListThreatIntelSets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.ListThreatIntelSetsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.ListThreatIntelSetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listThreatIntelSetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.ListThreatIntelSetsRequest request]
    (-> this (.listThreatIntelSetsAsync request))))

(defn get-findings-statistics-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.GetFindingsStatisticsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFindingsStatistics operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.GetFindingsStatisticsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.GetFindingsStatisticsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFindingsStatisticsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.GetFindingsStatisticsRequest request]
    (-> this (.getFindingsStatisticsAsync request))))

(defn get-detector-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.GetDetectorRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDetector operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.GetDetectorResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.GetDetectorRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDetectorAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.GetDetectorRequest request]
    (-> this (.getDetectorAsync request))))

(defn update-ip-set-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.UpdateIPSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateIPSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.UpdateIPSetResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.UpdateIPSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateIPSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.UpdateIPSetRequest request]
    (-> this (.updateIPSetAsync request))))

(defn get-invitations-count-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.GetInvitationsCountRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetInvitationsCount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.GetInvitationsCountResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.GetInvitationsCountRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getInvitationsCountAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.GetInvitationsCountRequest request]
    (-> this (.getInvitationsCountAsync request))))

(defn accept-invitation-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.AcceptInvitationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AcceptInvitation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.AcceptInvitationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.AcceptInvitationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.acceptInvitationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.AcceptInvitationRequest request]
    (-> this (.acceptInvitationAsync request))))

(defn update-detector-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.UpdateDetectorRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDetector operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.UpdateDetectorResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.UpdateDetectorRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDetectorAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.UpdateDetectorRequest request]
    (-> this (.updateDetectorAsync request))))

(defn get-members-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.GetMembersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMembers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.GetMembersResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.GetMembersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMembersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.GetMembersRequest request]
    (-> this (.getMembersAsync request))))

(defn get-master-account-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.GetMasterAccountRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMasterAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.GetMasterAccountResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.GetMasterAccountRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMasterAccountAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.GetMasterAccountRequest request]
    (-> this (.getMasterAccountAsync request))))

(defn delete-detector-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.DeleteDetectorRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDetector operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.DeleteDetectorResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.DeleteDetectorRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDetectorAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.DeleteDetectorRequest request]
    (-> this (.deleteDetectorAsync request))))

(defn get-filter-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.GetFilterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFilter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.GetFilterResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.GetFilterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFilterAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.GetFilterRequest request]
    (-> this (.getFilterAsync request))))

(defn list-findings-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.ListFindingsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListFindings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.ListFindingsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.ListFindingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listFindingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.ListFindingsRequest request]
    (-> this (.listFindingsAsync request))))

(defn tag-resource-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn create-members-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.CreateMembersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateMembers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.CreateMembersResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.CreateMembersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createMembersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.CreateMembersRequest request]
    (-> this (.createMembersAsync request))))

(defn get-threat-intel-set-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.GetThreatIntelSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetThreatIntelSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.GetThreatIntelSetResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.GetThreatIntelSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getThreatIntelSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.GetThreatIntelSetRequest request]
    (-> this (.getThreatIntelSetAsync request))))

(defn delete-threat-intel-set-async
  "Description copied from interface: AmazonGuardDutyAsync

  request - `com.amazonaws.services.guardduty.model.DeleteThreatIntelSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteThreatIntelSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.guardduty.model.DeleteThreatIntelSetResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.DeleteThreatIntelSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteThreatIntelSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonGuardDutyAsync this ^com.amazonaws.services.guardduty.model.DeleteThreatIntelSetRequest request]
    (-> this (.deleteThreatIntelSetAsync request))))

