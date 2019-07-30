(ns com.amazonaws.services.mturk.AbstractAmazonMTurk
  "Abstract implementation of AmazonMTurk. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mturk AbstractAmazonMTurk]))

(defn create-worker-block
  "Description copied from interface: AmazonMTurk

  request - `com.amazonaws.services.mturk.model.CreateWorkerBlockRequest`

  returns: Result of the CreateWorkerBlock operation returned by the service. - `com.amazonaws.services.mturk.model.CreateWorkerBlockResult`"
  (^com.amazonaws.services.mturk.model.CreateWorkerBlockResult [^AbstractAmazonMTurk this ^com.amazonaws.services.mturk.model.CreateWorkerBlockRequest request]
    (-> this (.createWorkerBlock request))))

(defn create-hit-type
  "Description copied from interface: AmazonMTurk

  request - `com.amazonaws.services.mturk.model.CreateHITTypeRequest`

  returns: Result of the CreateHITType operation returned by the service. - `com.amazonaws.services.mturk.model.CreateHITTypeResult`"
  (^com.amazonaws.services.mturk.model.CreateHITTypeResult [^AbstractAmazonMTurk this ^com.amazonaws.services.mturk.model.CreateHITTypeRequest request]
    (-> this (.createHITType request))))

(defn update-qualification-type
  "Description copied from interface: AmazonMTurk

  request - `com.amazonaws.services.mturk.model.UpdateQualificationTypeRequest`

  returns: Result of the UpdateQualificationType operation returned by the service. - `com.amazonaws.services.mturk.model.UpdateQualificationTypeResult`"
  (^com.amazonaws.services.mturk.model.UpdateQualificationTypeResult [^AbstractAmazonMTurk this ^com.amazonaws.services.mturk.model.UpdateQualificationTypeRequest request]
    (-> this (.updateQualificationType request))))

(defn get-hit
  "Description copied from interface: AmazonMTurk

  request - `com.amazonaws.services.mturk.model.GetHITRequest`

  returns: Result of the GetHIT operation returned by the service. - `com.amazonaws.services.mturk.model.GetHITResult`"
  (^com.amazonaws.services.mturk.model.GetHITResult [^AbstractAmazonMTurk this ^com.amazonaws.services.mturk.model.GetHITRequest request]
    (-> this (.getHIT request))))

(defn create-hit-with-hit-type
  "Description copied from interface: AmazonMTurk

  request - `com.amazonaws.services.mturk.model.CreateHITWithHITTypeRequest`

  returns: Result of the CreateHITWithHITType operation returned by the service. - `com.amazonaws.services.mturk.model.CreateHITWithHITTypeResult`"
  (^com.amazonaws.services.mturk.model.CreateHITWithHITTypeResult [^AbstractAmazonMTurk this ^com.amazonaws.services.mturk.model.CreateHITWithHITTypeRequest request]
    (-> this (.createHITWithHITType request))))

(defn list-hi-ts
  "Description copied from interface: AmazonMTurk

  request - `com.amazonaws.services.mturk.model.ListHITsRequest`

  returns: Result of the ListHITs operation returned by the service. - `com.amazonaws.services.mturk.model.ListHITsResult`"
  (^com.amazonaws.services.mturk.model.ListHITsResult [^AbstractAmazonMTurk this ^com.amazonaws.services.mturk.model.ListHITsRequest request]
    (-> this (.listHITs request))))

(defn delete-hit
  "Description copied from interface: AmazonMTurk

  request - `com.amazonaws.services.mturk.model.DeleteHITRequest`

  returns: Result of the DeleteHIT operation returned by the service. - `com.amazonaws.services.mturk.model.DeleteHITResult`"
  (^com.amazonaws.services.mturk.model.DeleteHITResult [^AbstractAmazonMTurk this ^com.amazonaws.services.mturk.model.DeleteHITRequest request]
    (-> this (.deleteHIT request))))

(defn get-account-balance
  "Description copied from interface: AmazonMTurk

  request - `com.amazonaws.services.mturk.model.GetAccountBalanceRequest`

  returns: Result of the GetAccountBalance operation returned by the service. - `com.amazonaws.services.mturk.model.GetAccountBalanceResult`"
  (^com.amazonaws.services.mturk.model.GetAccountBalanceResult [^AbstractAmazonMTurk this ^com.amazonaws.services.mturk.model.GetAccountBalanceRequest request]
    (-> this (.getAccountBalance request))))

(defn update-hit-type-of-hit
  "Description copied from interface: AmazonMTurk

  request - `com.amazonaws.services.mturk.model.UpdateHITTypeOfHITRequest`

  returns: Result of the UpdateHITTypeOfHIT operation returned by the service. - `com.amazonaws.services.mturk.model.UpdateHITTypeOfHITResult`"
  (^com.amazonaws.services.mturk.model.UpdateHITTypeOfHITResult [^AbstractAmazonMTurk this ^com.amazonaws.services.mturk.model.UpdateHITTypeOfHITRequest request]
    (-> this (.updateHITTypeOfHIT request))))

(defn update-notification-settings
  "Description copied from interface: AmazonMTurk

  request - `com.amazonaws.services.mturk.model.UpdateNotificationSettingsRequest`

  returns: Result of the UpdateNotificationSettings operation returned by the service. - `com.amazonaws.services.mturk.model.UpdateNotificationSettingsResult`"
  (^com.amazonaws.services.mturk.model.UpdateNotificationSettingsResult [^AbstractAmazonMTurk this ^com.amazonaws.services.mturk.model.UpdateNotificationSettingsRequest request]
    (-> this (.updateNotificationSettings request))))

(defn list-assignments-for-hit
  "Description copied from interface: AmazonMTurk

  request - `com.amazonaws.services.mturk.model.ListAssignmentsForHITRequest`

  returns: Result of the ListAssignmentsForHIT operation returned by the service. - `com.amazonaws.services.mturk.model.ListAssignmentsForHITResult`"
  (^com.amazonaws.services.mturk.model.ListAssignmentsForHITResult [^AbstractAmazonMTurk this ^com.amazonaws.services.mturk.model.ListAssignmentsForHITRequest request]
    (-> this (.listAssignmentsForHIT request))))

(defn list-worker-blocks
  "Description copied from interface: AmazonMTurk

  request - `com.amazonaws.services.mturk.model.ListWorkerBlocksRequest`

  returns: Result of the ListWorkerBlocks operation returned by the service. - `com.amazonaws.services.mturk.model.ListWorkerBlocksResult`"
  (^com.amazonaws.services.mturk.model.ListWorkerBlocksResult [^AbstractAmazonMTurk this ^com.amazonaws.services.mturk.model.ListWorkerBlocksRequest request]
    (-> this (.listWorkerBlocks request))))

(defn get-assignment
  "Description copied from interface: AmazonMTurk

  request - `com.amazonaws.services.mturk.model.GetAssignmentRequest`

  returns: Result of the GetAssignment operation returned by the service. - `com.amazonaws.services.mturk.model.GetAssignmentResult`"
  (^com.amazonaws.services.mturk.model.GetAssignmentResult [^AbstractAmazonMTurk this ^com.amazonaws.services.mturk.model.GetAssignmentRequest request]
    (-> this (.getAssignment request))))

(defn get-qualification-type
  "Description copied from interface: AmazonMTurk

  request - `com.amazonaws.services.mturk.model.GetQualificationTypeRequest`

  returns: Result of the GetQualificationType operation returned by the service. - `com.amazonaws.services.mturk.model.GetQualificationTypeResult`"
  (^com.amazonaws.services.mturk.model.GetQualificationTypeResult [^AbstractAmazonMTurk this ^com.amazonaws.services.mturk.model.GetQualificationTypeRequest request]
    (-> this (.getQualificationType request))))

(defn list-workers-with-qualification-type
  "Description copied from interface: AmazonMTurk

  request - `com.amazonaws.services.mturk.model.ListWorkersWithQualificationTypeRequest`

  returns: Result of the ListWorkersWithQualificationType operation returned by the service. - `com.amazonaws.services.mturk.model.ListWorkersWithQualificationTypeResult`"
  (^com.amazonaws.services.mturk.model.ListWorkersWithQualificationTypeResult [^AbstractAmazonMTurk this ^com.amazonaws.services.mturk.model.ListWorkersWithQualificationTypeRequest request]
    (-> this (.listWorkersWithQualificationType request))))

(defn get-file-upload-url
  "Description copied from interface: AmazonMTurk

  request - `com.amazonaws.services.mturk.model.GetFileUploadURLRequest`

  returns: Result of the GetFileUploadURL operation returned by the service. - `com.amazonaws.services.mturk.model.GetFileUploadURLResult`"
  (^com.amazonaws.services.mturk.model.GetFileUploadURLResult [^AbstractAmazonMTurk this ^com.amazonaws.services.mturk.model.GetFileUploadURLRequest request]
    (-> this (.getFileUploadURL request))))

(defn send-test-event-notification
  "Description copied from interface: AmazonMTurk

  request - `com.amazonaws.services.mturk.model.SendTestEventNotificationRequest`

  returns: Result of the SendTestEventNotification operation returned by the service. - `com.amazonaws.services.mturk.model.SendTestEventNotificationResult`"
  (^com.amazonaws.services.mturk.model.SendTestEventNotificationResult [^AbstractAmazonMTurk this ^com.amazonaws.services.mturk.model.SendTestEventNotificationRequest request]
    (-> this (.sendTestEventNotification request))))

(defn shutdown
  "Description copied from interface: AmazonMTurk"
  ([^AbstractAmazonMTurk this]
    (-> this (.shutdown))))

(defn accept-qualification-request
  "Description copied from interface: AmazonMTurk

  request - `com.amazonaws.services.mturk.model.AcceptQualificationRequestRequest`

  returns: Result of the AcceptQualificationRequest operation returned by the service. - `com.amazonaws.services.mturk.model.AcceptQualificationRequestResult`"
  (^com.amazonaws.services.mturk.model.AcceptQualificationRequestResult [^AbstractAmazonMTurk this ^com.amazonaws.services.mturk.model.AcceptQualificationRequestRequest request]
    (-> this (.acceptQualificationRequest request))))

(defn delete-qualification-type
  "Description copied from interface: AmazonMTurk

  request - `com.amazonaws.services.mturk.model.DeleteQualificationTypeRequest`

  returns: Result of the DeleteQualificationType operation returned by the service. - `com.amazonaws.services.mturk.model.DeleteQualificationTypeResult`"
  (^com.amazonaws.services.mturk.model.DeleteQualificationTypeResult [^AbstractAmazonMTurk this ^com.amazonaws.services.mturk.model.DeleteQualificationTypeRequest request]
    (-> this (.deleteQualificationType request))))

(defn associate-qualification-with-worker
  "Description copied from interface: AmazonMTurk

  request - `com.amazonaws.services.mturk.model.AssociateQualificationWithWorkerRequest`

  returns: Result of the AssociateQualificationWithWorker operation returned by the service. - `com.amazonaws.services.mturk.model.AssociateQualificationWithWorkerResult`"
  (^com.amazonaws.services.mturk.model.AssociateQualificationWithWorkerResult [^AbstractAmazonMTurk this ^com.amazonaws.services.mturk.model.AssociateQualificationWithWorkerRequest request]
    (-> this (.associateQualificationWithWorker request))))

(defn list-bonus-payments
  "Description copied from interface: AmazonMTurk

  request - `com.amazonaws.services.mturk.model.ListBonusPaymentsRequest`

  returns: Result of the ListBonusPayments operation returned by the service. - `com.amazonaws.services.mturk.model.ListBonusPaymentsResult`"
  (^com.amazonaws.services.mturk.model.ListBonusPaymentsResult [^AbstractAmazonMTurk this ^com.amazonaws.services.mturk.model.ListBonusPaymentsRequest request]
    (-> this (.listBonusPayments request))))

(defn list-review-policy-results-for-hit
  "Description copied from interface: AmazonMTurk

  request - `com.amazonaws.services.mturk.model.ListReviewPolicyResultsForHITRequest`

  returns: Result of the ListReviewPolicyResultsForHIT operation returned by the service. - `com.amazonaws.services.mturk.model.ListReviewPolicyResultsForHITResult`"
  (^com.amazonaws.services.mturk.model.ListReviewPolicyResultsForHITResult [^AbstractAmazonMTurk this ^com.amazonaws.services.mturk.model.ListReviewPolicyResultsForHITRequest request]
    (-> this (.listReviewPolicyResultsForHIT request))))

(defn list-qualification-types
  "Description copied from interface: AmazonMTurk

  request - `com.amazonaws.services.mturk.model.ListQualificationTypesRequest`

  returns: Result of the ListQualificationTypes operation returned by the service. - `com.amazonaws.services.mturk.model.ListQualificationTypesResult`"
  (^com.amazonaws.services.mturk.model.ListQualificationTypesResult [^AbstractAmazonMTurk this ^com.amazonaws.services.mturk.model.ListQualificationTypesRequest request]
    (-> this (.listQualificationTypes request))))

(defn get-qualification-score
  "Description copied from interface: AmazonMTurk

  request - `com.amazonaws.services.mturk.model.GetQualificationScoreRequest`

  returns: Result of the GetQualificationScore operation returned by the service. - `com.amazonaws.services.mturk.model.GetQualificationScoreResult`"
  (^com.amazonaws.services.mturk.model.GetQualificationScoreResult [^AbstractAmazonMTurk this ^com.amazonaws.services.mturk.model.GetQualificationScoreRequest request]
    (-> this (.getQualificationScore request))))

(defn update-expiration-for-hit
  "Description copied from interface: AmazonMTurk

  request - `com.amazonaws.services.mturk.model.UpdateExpirationForHITRequest`

  returns: Result of the UpdateExpirationForHIT operation returned by the service. - `com.amazonaws.services.mturk.model.UpdateExpirationForHITResult`"
  (^com.amazonaws.services.mturk.model.UpdateExpirationForHITResult [^AbstractAmazonMTurk this ^com.amazonaws.services.mturk.model.UpdateExpirationForHITRequest request]
    (-> this (.updateExpirationForHIT request))))

(defn notify-workers
  "Description copied from interface: AmazonMTurk

  request - `com.amazonaws.services.mturk.model.NotifyWorkersRequest`

  returns: Result of the NotifyWorkers operation returned by the service. - `com.amazonaws.services.mturk.model.NotifyWorkersResult`"
  (^com.amazonaws.services.mturk.model.NotifyWorkersResult [^AbstractAmazonMTurk this ^com.amazonaws.services.mturk.model.NotifyWorkersRequest request]
    (-> this (.notifyWorkers request))))

(defn reject-qualification-request
  "Description copied from interface: AmazonMTurk

  request - `com.amazonaws.services.mturk.model.RejectQualificationRequestRequest`

  returns: Result of the RejectQualificationRequest operation returned by the service. - `com.amazonaws.services.mturk.model.RejectQualificationRequestResult`"
  (^com.amazonaws.services.mturk.model.RejectQualificationRequestResult [^AbstractAmazonMTurk this ^com.amazonaws.services.mturk.model.RejectQualificationRequestRequest request]
    (-> this (.rejectQualificationRequest request))))

(defn create-qualification-type
  "Description copied from interface: AmazonMTurk

  request - `com.amazonaws.services.mturk.model.CreateQualificationTypeRequest`

  returns: Result of the CreateQualificationType operation returned by the service. - `com.amazonaws.services.mturk.model.CreateQualificationTypeResult`"
  (^com.amazonaws.services.mturk.model.CreateQualificationTypeResult [^AbstractAmazonMTurk this ^com.amazonaws.services.mturk.model.CreateQualificationTypeRequest request]
    (-> this (.createQualificationType request))))

(defn create-additional-assignments-for-hit
  "Description copied from interface: AmazonMTurk

  request - `com.amazonaws.services.mturk.model.CreateAdditionalAssignmentsForHITRequest`

  returns: Result of the CreateAdditionalAssignmentsForHIT operation returned by the service. - `com.amazonaws.services.mturk.model.CreateAdditionalAssignmentsForHITResult`"
  (^com.amazonaws.services.mturk.model.CreateAdditionalAssignmentsForHITResult [^AbstractAmazonMTurk this ^com.amazonaws.services.mturk.model.CreateAdditionalAssignmentsForHITRequest request]
    (-> this (.createAdditionalAssignmentsForHIT request))))

(defn disassociate-qualification-from-worker
  "Description copied from interface: AmazonMTurk

  request - `com.amazonaws.services.mturk.model.DisassociateQualificationFromWorkerRequest`

  returns: Result of the DisassociateQualificationFromWorker operation returned by the service. - `com.amazonaws.services.mturk.model.DisassociateQualificationFromWorkerResult`"
  (^com.amazonaws.services.mturk.model.DisassociateQualificationFromWorkerResult [^AbstractAmazonMTurk this ^com.amazonaws.services.mturk.model.DisassociateQualificationFromWorkerRequest request]
    (-> this (.disassociateQualificationFromWorker request))))

(defn create-hit
  "Description copied from interface: AmazonMTurk

  request - `com.amazonaws.services.mturk.model.CreateHITRequest`

  returns: Result of the CreateHIT operation returned by the service. - `com.amazonaws.services.mturk.model.CreateHITResult`"
  (^com.amazonaws.services.mturk.model.CreateHITResult [^AbstractAmazonMTurk this ^com.amazonaws.services.mturk.model.CreateHITRequest request]
    (-> this (.createHIT request))))

(defn update-hit-review-status
  "Description copied from interface: AmazonMTurk

  request - `com.amazonaws.services.mturk.model.UpdateHITReviewStatusRequest`

  returns: Result of the UpdateHITReviewStatus operation returned by the service. - `com.amazonaws.services.mturk.model.UpdateHITReviewStatusResult`"
  (^com.amazonaws.services.mturk.model.UpdateHITReviewStatusResult [^AbstractAmazonMTurk this ^com.amazonaws.services.mturk.model.UpdateHITReviewStatusRequest request]
    (-> this (.updateHITReviewStatus request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonMTurk

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonMTurk this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn list-reviewable-hi-ts
  "Description copied from interface: AmazonMTurk

  request - `com.amazonaws.services.mturk.model.ListReviewableHITsRequest`

  returns: Result of the ListReviewableHITs operation returned by the service. - `com.amazonaws.services.mturk.model.ListReviewableHITsResult`"
  (^com.amazonaws.services.mturk.model.ListReviewableHITsResult [^AbstractAmazonMTurk this ^com.amazonaws.services.mturk.model.ListReviewableHITsRequest request]
    (-> this (.listReviewableHITs request))))

(defn send-bonus
  "Description copied from interface: AmazonMTurk

  request - `com.amazonaws.services.mturk.model.SendBonusRequest`

  returns: Result of the SendBonus operation returned by the service. - `com.amazonaws.services.mturk.model.SendBonusResult`"
  (^com.amazonaws.services.mturk.model.SendBonusResult [^AbstractAmazonMTurk this ^com.amazonaws.services.mturk.model.SendBonusRequest request]
    (-> this (.sendBonus request))))

(defn approve-assignment
  "Description copied from interface: AmazonMTurk

  request - `com.amazonaws.services.mturk.model.ApproveAssignmentRequest`

  returns: Result of the ApproveAssignment operation returned by the service. - `com.amazonaws.services.mturk.model.ApproveAssignmentResult`"
  (^com.amazonaws.services.mturk.model.ApproveAssignmentResult [^AbstractAmazonMTurk this ^com.amazonaws.services.mturk.model.ApproveAssignmentRequest request]
    (-> this (.approveAssignment request))))

(defn reject-assignment
  "Description copied from interface: AmazonMTurk

  request - `com.amazonaws.services.mturk.model.RejectAssignmentRequest`

  returns: Result of the RejectAssignment operation returned by the service. - `com.amazonaws.services.mturk.model.RejectAssignmentResult`"
  (^com.amazonaws.services.mturk.model.RejectAssignmentResult [^AbstractAmazonMTurk this ^com.amazonaws.services.mturk.model.RejectAssignmentRequest request]
    (-> this (.rejectAssignment request))))

(defn list-hi-ts-for-qualification-type
  "Description copied from interface: AmazonMTurk

  request - `com.amazonaws.services.mturk.model.ListHITsForQualificationTypeRequest`

  returns: Result of the ListHITsForQualificationType operation returned by the service. - `com.amazonaws.services.mturk.model.ListHITsForQualificationTypeResult`"
  (^com.amazonaws.services.mturk.model.ListHITsForQualificationTypeResult [^AbstractAmazonMTurk this ^com.amazonaws.services.mturk.model.ListHITsForQualificationTypeRequest request]
    (-> this (.listHITsForQualificationType request))))

(defn list-qualification-requests
  "Description copied from interface: AmazonMTurk

  request - `com.amazonaws.services.mturk.model.ListQualificationRequestsRequest`

  returns: Result of the ListQualificationRequests operation returned by the service. - `com.amazonaws.services.mturk.model.ListQualificationRequestsResult`"
  (^com.amazonaws.services.mturk.model.ListQualificationRequestsResult [^AbstractAmazonMTurk this ^com.amazonaws.services.mturk.model.ListQualificationRequestsRequest request]
    (-> this (.listQualificationRequests request))))

(defn delete-worker-block
  "Description copied from interface: AmazonMTurk

  request - `com.amazonaws.services.mturk.model.DeleteWorkerBlockRequest`

  returns: Result of the DeleteWorkerBlock operation returned by the service. - `com.amazonaws.services.mturk.model.DeleteWorkerBlockResult`"
  (^com.amazonaws.services.mturk.model.DeleteWorkerBlockResult [^AbstractAmazonMTurk this ^com.amazonaws.services.mturk.model.DeleteWorkerBlockRequest request]
    (-> this (.deleteWorkerBlock request))))

