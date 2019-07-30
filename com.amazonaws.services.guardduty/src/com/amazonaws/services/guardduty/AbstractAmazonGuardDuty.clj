(ns com.amazonaws.services.guardduty.AbstractAmazonGuardDuty
  "Abstract implementation of AmazonGuardDuty. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.guardduty AbstractAmazonGuardDuty]))

(defn list-findings
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.ListFindingsRequest`

  returns: Result of the ListFindings operation returned by the service. - `com.amazonaws.services.guardduty.model.ListFindingsResult`"
  (^com.amazonaws.services.guardduty.model.ListFindingsResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.ListFindingsRequest request]
    (-> this (.listFindings request))))

(defn list-tags-for-resource
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.guardduty.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.guardduty.model.ListTagsForResourceResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn accept-invitation
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.AcceptInvitationRequest`

  returns: Result of the AcceptInvitation operation returned by the service. - `com.amazonaws.services.guardduty.model.AcceptInvitationResult`"
  (^com.amazonaws.services.guardduty.model.AcceptInvitationResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.AcceptInvitationRequest request]
    (-> this (.acceptInvitation request))))

(defn update-filter
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.UpdateFilterRequest`

  returns: Result of the UpdateFilter operation returned by the service. - `com.amazonaws.services.guardduty.model.UpdateFilterResult`"
  (^com.amazonaws.services.guardduty.model.UpdateFilterResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.UpdateFilterRequest request]
    (-> this (.updateFilter request))))

(defn invite-members
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.InviteMembersRequest`

  returns: Result of the InviteMembers operation returned by the service. - `com.amazonaws.services.guardduty.model.InviteMembersResult`"
  (^com.amazonaws.services.guardduty.model.InviteMembersResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.InviteMembersRequest request]
    (-> this (.inviteMembers request))))

(defn list-ip-sets
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.ListIPSetsRequest`

  returns: Result of the ListIPSets operation returned by the service. - `com.amazonaws.services.guardduty.model.ListIPSetsResult`"
  (^com.amazonaws.services.guardduty.model.ListIPSetsResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.ListIPSetsRequest request]
    (-> this (.listIPSets request))))

(defn unarchive-findings
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.UnarchiveFindingsRequest`

  returns: Result of the UnarchiveFindings operation returned by the service. - `com.amazonaws.services.guardduty.model.UnarchiveFindingsResult`"
  (^com.amazonaws.services.guardduty.model.UnarchiveFindingsResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.UnarchiveFindingsRequest request]
    (-> this (.unarchiveFindings request))))

(defn get-members
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.GetMembersRequest`

  returns: Result of the GetMembers operation returned by the service. - `com.amazonaws.services.guardduty.model.GetMembersResult`"
  (^com.amazonaws.services.guardduty.model.GetMembersResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.GetMembersRequest request]
    (-> this (.getMembers request))))

(defn get-findings-statistics
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.GetFindingsStatisticsRequest`

  returns: Result of the GetFindingsStatistics operation returned by the service. - `com.amazonaws.services.guardduty.model.GetFindingsStatisticsResult`"
  (^com.amazonaws.services.guardduty.model.GetFindingsStatisticsResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.GetFindingsStatisticsRequest request]
    (-> this (.getFindingsStatistics request))))

(defn get-master-account
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.GetMasterAccountRequest`

  returns: Result of the GetMasterAccount operation returned by the service. - `com.amazonaws.services.guardduty.model.GetMasterAccountResult`"
  (^com.amazonaws.services.guardduty.model.GetMasterAccountResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.GetMasterAccountRequest request]
    (-> this (.getMasterAccount request))))

(defn start-monitoring-members
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.StartMonitoringMembersRequest`

  returns: Result of the StartMonitoringMembers operation returned by the service. - `com.amazonaws.services.guardduty.model.StartMonitoringMembersResult`"
  (^com.amazonaws.services.guardduty.model.StartMonitoringMembersResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.StartMonitoringMembersRequest request]
    (-> this (.startMonitoringMembers request))))

(defn disassociate-from-master-account
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.DisassociateFromMasterAccountRequest`

  returns: Result of the DisassociateFromMasterAccount operation returned by the service. - `com.amazonaws.services.guardduty.model.DisassociateFromMasterAccountResult`"
  (^com.amazonaws.services.guardduty.model.DisassociateFromMasterAccountResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.DisassociateFromMasterAccountRequest request]
    (-> this (.disassociateFromMasterAccount request))))

(defn untag-resource
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.guardduty.model.UntagResourceResult`"
  (^com.amazonaws.services.guardduty.model.UntagResourceResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn update-ip-set
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.UpdateIPSetRequest`

  returns: Result of the UpdateIPSet operation returned by the service. - `com.amazonaws.services.guardduty.model.UpdateIPSetResult`"
  (^com.amazonaws.services.guardduty.model.UpdateIPSetResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.UpdateIPSetRequest request]
    (-> this (.updateIPSet request))))

(defn list-detectors
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.ListDetectorsRequest`

  returns: Result of the ListDetectors operation returned by the service. - `com.amazonaws.services.guardduty.model.ListDetectorsResult`"
  (^com.amazonaws.services.guardduty.model.ListDetectorsResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.ListDetectorsRequest request]
    (-> this (.listDetectors request))))

(defn delete-threat-intel-set
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.DeleteThreatIntelSetRequest`

  returns: Result of the DeleteThreatIntelSet operation returned by the service. - `com.amazonaws.services.guardduty.model.DeleteThreatIntelSetResult`"
  (^com.amazonaws.services.guardduty.model.DeleteThreatIntelSetResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.DeleteThreatIntelSetRequest request]
    (-> this (.deleteThreatIntelSet request))))

(defn stop-monitoring-members
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.StopMonitoringMembersRequest`

  returns: Result of the StopMonitoringMembers operation returned by the service. - `com.amazonaws.services.guardduty.model.StopMonitoringMembersResult`"
  (^com.amazonaws.services.guardduty.model.StopMonitoringMembersResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.StopMonitoringMembersRequest request]
    (-> this (.stopMonitoringMembers request))))

(defn delete-invitations
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.DeleteInvitationsRequest`

  returns: Result of the DeleteInvitations operation returned by the service. - `com.amazonaws.services.guardduty.model.DeleteInvitationsResult`"
  (^com.amazonaws.services.guardduty.model.DeleteInvitationsResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.DeleteInvitationsRequest request]
    (-> this (.deleteInvitations request))))

(defn create-filter
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.CreateFilterRequest`

  returns: Result of the CreateFilter operation returned by the service. - `com.amazonaws.services.guardduty.model.CreateFilterResult`"
  (^com.amazonaws.services.guardduty.model.CreateFilterResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.CreateFilterRequest request]
    (-> this (.createFilter request))))

(defn update-threat-intel-set
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.UpdateThreatIntelSetRequest`

  returns: Result of the UpdateThreatIntelSet operation returned by the service. - `com.amazonaws.services.guardduty.model.UpdateThreatIntelSetResult`"
  (^com.amazonaws.services.guardduty.model.UpdateThreatIntelSetResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.UpdateThreatIntelSetRequest request]
    (-> this (.updateThreatIntelSet request))))

(defn create-detector
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.CreateDetectorRequest`

  returns: Result of the CreateDetector operation returned by the service. - `com.amazonaws.services.guardduty.model.CreateDetectorResult`"
  (^com.amazonaws.services.guardduty.model.CreateDetectorResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.CreateDetectorRequest request]
    (-> this (.createDetector request))))

(defn shutdown
  "Description copied from interface: AmazonGuardDuty"
  ([^AbstractAmazonGuardDuty this]
    (-> this (.shutdown))))

(defn delete-filter
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.DeleteFilterRequest`

  returns: Result of the DeleteFilter operation returned by the service. - `com.amazonaws.services.guardduty.model.DeleteFilterResult`"
  (^com.amazonaws.services.guardduty.model.DeleteFilterResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.DeleteFilterRequest request]
    (-> this (.deleteFilter request))))

(defn disassociate-members
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.DisassociateMembersRequest`

  returns: Result of the DisassociateMembers operation returned by the service. - `com.amazonaws.services.guardduty.model.DisassociateMembersResult`"
  (^com.amazonaws.services.guardduty.model.DisassociateMembersResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.DisassociateMembersRequest request]
    (-> this (.disassociateMembers request))))

(defn list-filters
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.ListFiltersRequest`

  returns: Result of the ListFilters operation returned by the service. - `com.amazonaws.services.guardduty.model.ListFiltersResult`"
  (^com.amazonaws.services.guardduty.model.ListFiltersResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.ListFiltersRequest request]
    (-> this (.listFilters request))))

(defn get-filter
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.GetFilterRequest`

  returns: Result of the GetFilter operation returned by the service. - `com.amazonaws.services.guardduty.model.GetFilterResult`"
  (^com.amazonaws.services.guardduty.model.GetFilterResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.GetFilterRequest request]
    (-> this (.getFilter request))))

(defn get-invitations-count
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.GetInvitationsCountRequest`

  returns: Result of the GetInvitationsCount operation returned by the service. - `com.amazonaws.services.guardduty.model.GetInvitationsCountResult`"
  (^com.amazonaws.services.guardduty.model.GetInvitationsCountResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.GetInvitationsCountRequest request]
    (-> this (.getInvitationsCount request))))

(defn create-sample-findings
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.CreateSampleFindingsRequest`

  returns: Result of the CreateSampleFindings operation returned by the service. - `com.amazonaws.services.guardduty.model.CreateSampleFindingsResult`"
  (^com.amazonaws.services.guardduty.model.CreateSampleFindingsResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.CreateSampleFindingsRequest request]
    (-> this (.createSampleFindings request))))

(defn delete-detector
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.DeleteDetectorRequest`

  returns: Result of the DeleteDetector operation returned by the service. - `com.amazonaws.services.guardduty.model.DeleteDetectorResult`"
  (^com.amazonaws.services.guardduty.model.DeleteDetectorResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.DeleteDetectorRequest request]
    (-> this (.deleteDetector request))))

(defn list-members
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.ListMembersRequest`

  returns: Result of the ListMembers operation returned by the service. - `com.amazonaws.services.guardduty.model.ListMembersResult`"
  (^com.amazonaws.services.guardduty.model.ListMembersResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.ListMembersRequest request]
    (-> this (.listMembers request))))

(defn delete-members
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.DeleteMembersRequest`

  returns: Result of the DeleteMembers operation returned by the service. - `com.amazonaws.services.guardduty.model.DeleteMembersResult`"
  (^com.amazonaws.services.guardduty.model.DeleteMembersResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.DeleteMembersRequest request]
    (-> this (.deleteMembers request))))

(defn create-threat-intel-set
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.CreateThreatIntelSetRequest`

  returns: Result of the CreateThreatIntelSet operation returned by the service. - `com.amazonaws.services.guardduty.model.CreateThreatIntelSetResult`"
  (^com.amazonaws.services.guardduty.model.CreateThreatIntelSetResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.CreateThreatIntelSetRequest request]
    (-> this (.createThreatIntelSet request))))

(defn get-threat-intel-set
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.GetThreatIntelSetRequest`

  returns: Result of the GetThreatIntelSet operation returned by the service. - `com.amazonaws.services.guardduty.model.GetThreatIntelSetResult`"
  (^com.amazonaws.services.guardduty.model.GetThreatIntelSetResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.GetThreatIntelSetRequest request]
    (-> this (.getThreatIntelSet request))))

(defn create-members
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.CreateMembersRequest`

  returns: Result of the CreateMembers operation returned by the service. - `com.amazonaws.services.guardduty.model.CreateMembersResult`"
  (^com.amazonaws.services.guardduty.model.CreateMembersResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.CreateMembersRequest request]
    (-> this (.createMembers request))))

(defn get-ip-set
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.GetIPSetRequest`

  returns: Result of the GetIPSet operation returned by the service. - `com.amazonaws.services.guardduty.model.GetIPSetResult`"
  (^com.amazonaws.services.guardduty.model.GetIPSetResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.GetIPSetRequest request]
    (-> this (.getIPSet request))))

(defn update-detector
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.UpdateDetectorRequest`

  returns: Result of the UpdateDetector operation returned by the service. - `com.amazonaws.services.guardduty.model.UpdateDetectorResult`"
  (^com.amazonaws.services.guardduty.model.UpdateDetectorResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.UpdateDetectorRequest request]
    (-> this (.updateDetector request))))

(defn list-threat-intel-sets
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.ListThreatIntelSetsRequest`

  returns: Result of the ListThreatIntelSets operation returned by the service. - `com.amazonaws.services.guardduty.model.ListThreatIntelSetsResult`"
  (^com.amazonaws.services.guardduty.model.ListThreatIntelSetsResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.ListThreatIntelSetsRequest request]
    (-> this (.listThreatIntelSets request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonGuardDuty

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonGuardDuty this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-findings
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.GetFindingsRequest`

  returns: Result of the GetFindings operation returned by the service. - `com.amazonaws.services.guardduty.model.GetFindingsResult`"
  (^com.amazonaws.services.guardduty.model.GetFindingsResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.GetFindingsRequest request]
    (-> this (.getFindings request))))

(defn create-ip-set
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.CreateIPSetRequest`

  returns: Result of the CreateIPSet operation returned by the service. - `com.amazonaws.services.guardduty.model.CreateIPSetResult`"
  (^com.amazonaws.services.guardduty.model.CreateIPSetResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.CreateIPSetRequest request]
    (-> this (.createIPSet request))))

(defn tag-resource
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.guardduty.model.TagResourceResult`"
  (^com.amazonaws.services.guardduty.model.TagResourceResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn list-invitations
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.ListInvitationsRequest`

  returns: Result of the ListInvitations operation returned by the service. - `com.amazonaws.services.guardduty.model.ListInvitationsResult`"
  (^com.amazonaws.services.guardduty.model.ListInvitationsResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.ListInvitationsRequest request]
    (-> this (.listInvitations request))))

(defn delete-ip-set
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.DeleteIPSetRequest`

  returns: Result of the DeleteIPSet operation returned by the service. - `com.amazonaws.services.guardduty.model.DeleteIPSetResult`"
  (^com.amazonaws.services.guardduty.model.DeleteIPSetResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.DeleteIPSetRequest request]
    (-> this (.deleteIPSet request))))

(defn archive-findings
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.ArchiveFindingsRequest`

  returns: Result of the ArchiveFindings operation returned by the service. - `com.amazonaws.services.guardduty.model.ArchiveFindingsResult`"
  (^com.amazonaws.services.guardduty.model.ArchiveFindingsResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.ArchiveFindingsRequest request]
    (-> this (.archiveFindings request))))

(defn update-findings-feedback
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.UpdateFindingsFeedbackRequest`

  returns: Result of the UpdateFindingsFeedback operation returned by the service. - `com.amazonaws.services.guardduty.model.UpdateFindingsFeedbackResult`"
  (^com.amazonaws.services.guardduty.model.UpdateFindingsFeedbackResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.UpdateFindingsFeedbackRequest request]
    (-> this (.updateFindingsFeedback request))))

(defn decline-invitations
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.DeclineInvitationsRequest`

  returns: Result of the DeclineInvitations operation returned by the service. - `com.amazonaws.services.guardduty.model.DeclineInvitationsResult`"
  (^com.amazonaws.services.guardduty.model.DeclineInvitationsResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.DeclineInvitationsRequest request]
    (-> this (.declineInvitations request))))

(defn get-detector
  "Description copied from interface: AmazonGuardDuty

  request - `com.amazonaws.services.guardduty.model.GetDetectorRequest`

  returns: Result of the GetDetector operation returned by the service. - `com.amazonaws.services.guardduty.model.GetDetectorResult`"
  (^com.amazonaws.services.guardduty.model.GetDetectorResult [^AbstractAmazonGuardDuty this ^com.amazonaws.services.guardduty.model.GetDetectorRequest request]
    (-> this (.getDetector request))))

