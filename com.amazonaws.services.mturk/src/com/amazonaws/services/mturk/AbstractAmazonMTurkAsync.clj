(ns com.amazonaws.services.mturk.AbstractAmazonMTurkAsync
  "Abstract implementation of AmazonMTurkAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mturk AbstractAmazonMTurkAsync]))

(defn list-workers-with-qualification-type-async
  "Description copied from interface: AmazonMTurkAsync

  request - `com.amazonaws.services.mturk.model.ListWorkersWithQualificationTypeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListWorkersWithQualificationType operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.mturk.model.ListWorkersWithQualificationTypeResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.ListWorkersWithQualificationTypeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listWorkersWithQualificationTypeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.ListWorkersWithQualificationTypeRequest request]
    (-> this (.listWorkersWithQualificationTypeAsync request))))

(defn send-bonus-async
  "Description copied from interface: AmazonMTurkAsync

  request - `com.amazonaws.services.mturk.model.SendBonusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SendBonus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mturk.model.SendBonusResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.SendBonusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendBonusAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.SendBonusRequest request]
    (-> this (.sendBonusAsync request))))

(defn update-expiration-for-hit-async
  "Description copied from interface: AmazonMTurkAsync

  request - `com.amazonaws.services.mturk.model.UpdateExpirationForHITRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateExpirationForHIT operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mturk.model.UpdateExpirationForHITResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.UpdateExpirationForHITRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateExpirationForHITAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.UpdateExpirationForHITRequest request]
    (-> this (.updateExpirationForHITAsync request))))

(defn reject-qualification-request-async
  "Description copied from interface: AmazonMTurkAsync

  request - `com.amazonaws.services.mturk.model.RejectQualificationRequestRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RejectQualificationRequest operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mturk.model.RejectQualificationRequestResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.RejectQualificationRequestRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rejectQualificationRequestAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.RejectQualificationRequestRequest request]
    (-> this (.rejectQualificationRequestAsync request))))

(defn list-bonus-payments-async
  "Description copied from interface: AmazonMTurkAsync

  request - `com.amazonaws.services.mturk.model.ListBonusPaymentsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBonusPayments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mturk.model.ListBonusPaymentsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.ListBonusPaymentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBonusPaymentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.ListBonusPaymentsRequest request]
    (-> this (.listBonusPaymentsAsync request))))

(defn get-file-upload-url-async
  "Description copied from interface: AmazonMTurkAsync

  request - `com.amazonaws.services.mturk.model.GetFileUploadURLRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFileUploadURL operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mturk.model.GetFileUploadURLResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.GetFileUploadURLRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFileUploadURLAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.GetFileUploadURLRequest request]
    (-> this (.getFileUploadURLAsync request))))

(defn notify-workers-async
  "Description copied from interface: AmazonMTurkAsync

  request - `com.amazonaws.services.mturk.model.NotifyWorkersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the NotifyWorkers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mturk.model.NotifyWorkersResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.NotifyWorkersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.notifyWorkersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.NotifyWorkersRequest request]
    (-> this (.notifyWorkersAsync request))))

(defn update-qualification-type-async
  "Description copied from interface: AmazonMTurkAsync

  request - `com.amazonaws.services.mturk.model.UpdateQualificationTypeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateQualificationType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mturk.model.UpdateQualificationTypeResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.UpdateQualificationTypeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateQualificationTypeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.UpdateQualificationTypeRequest request]
    (-> this (.updateQualificationTypeAsync request))))

(defn list-qualification-requests-async
  "Description copied from interface: AmazonMTurkAsync

  request - `com.amazonaws.services.mturk.model.ListQualificationRequestsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListQualificationRequests operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mturk.model.ListQualificationRequestsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.ListQualificationRequestsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listQualificationRequestsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.ListQualificationRequestsRequest request]
    (-> this (.listQualificationRequestsAsync request))))

(defn disassociate-qualification-from-worker-async
  "Description copied from interface: AmazonMTurkAsync

  request - `com.amazonaws.services.mturk.model.DisassociateQualificationFromWorkerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateQualificationFromWorker operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.mturk.model.DisassociateQualificationFromWorkerResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.DisassociateQualificationFromWorkerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateQualificationFromWorkerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.DisassociateQualificationFromWorkerRequest request]
    (-> this (.disassociateQualificationFromWorkerAsync request))))

(defn list-hi-ts-for-qualification-type-async
  "Description copied from interface: AmazonMTurkAsync

  request - `com.amazonaws.services.mturk.model.ListHITsForQualificationTypeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListHITsForQualificationType operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.mturk.model.ListHITsForQualificationTypeResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.ListHITsForQualificationTypeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listHITsForQualificationTypeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.ListHITsForQualificationTypeRequest request]
    (-> this (.listHITsForQualificationTypeAsync request))))

(defn delete-qualification-type-async
  "Description copied from interface: AmazonMTurkAsync

  request - `com.amazonaws.services.mturk.model.DeleteQualificationTypeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteQualificationType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mturk.model.DeleteQualificationTypeResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.DeleteQualificationTypeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteQualificationTypeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.DeleteQualificationTypeRequest request]
    (-> this (.deleteQualificationTypeAsync request))))

(defn list-assignments-for-hit-async
  "Description copied from interface: AmazonMTurkAsync

  request - `com.amazonaws.services.mturk.model.ListAssignmentsForHITRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAssignmentsForHIT operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mturk.model.ListAssignmentsForHITResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.ListAssignmentsForHITRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAssignmentsForHITAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.ListAssignmentsForHITRequest request]
    (-> this (.listAssignmentsForHITAsync request))))

(defn reject-assignment-async
  "Description copied from interface: AmazonMTurkAsync

  request - `com.amazonaws.services.mturk.model.RejectAssignmentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RejectAssignment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mturk.model.RejectAssignmentResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.RejectAssignmentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rejectAssignmentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.RejectAssignmentRequest request]
    (-> this (.rejectAssignmentAsync request))))

(defn create-qualification-type-async
  "Description copied from interface: AmazonMTurkAsync

  request - `com.amazonaws.services.mturk.model.CreateQualificationTypeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateQualificationType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mturk.model.CreateQualificationTypeResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.CreateQualificationTypeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createQualificationTypeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.CreateQualificationTypeRequest request]
    (-> this (.createQualificationTypeAsync request))))

(defn list-review-policy-results-for-hit-async
  "Description copied from interface: AmazonMTurkAsync

  request - `com.amazonaws.services.mturk.model.ListReviewPolicyResultsForHITRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListReviewPolicyResultsForHIT operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.mturk.model.ListReviewPolicyResultsForHITResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.ListReviewPolicyResultsForHITRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listReviewPolicyResultsForHITAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.ListReviewPolicyResultsForHITRequest request]
    (-> this (.listReviewPolicyResultsForHITAsync request))))

(defn delete-hit-async
  "Description copied from interface: AmazonMTurkAsync

  request - `com.amazonaws.services.mturk.model.DeleteHITRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteHIT operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mturk.model.DeleteHITResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.DeleteHITRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteHITAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.DeleteHITRequest request]
    (-> this (.deleteHITAsync request))))

(defn create-worker-block-async
  "Description copied from interface: AmazonMTurkAsync

  request - `com.amazonaws.services.mturk.model.CreateWorkerBlockRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateWorkerBlock operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mturk.model.CreateWorkerBlockResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.CreateWorkerBlockRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createWorkerBlockAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.CreateWorkerBlockRequest request]
    (-> this (.createWorkerBlockAsync request))))

(defn create-hit-type-async
  "Description copied from interface: AmazonMTurkAsync

  request - `com.amazonaws.services.mturk.model.CreateHITTypeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateHITType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mturk.model.CreateHITTypeResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.CreateHITTypeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createHITTypeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.CreateHITTypeRequest request]
    (-> this (.createHITTypeAsync request))))

(defn get-qualification-score-async
  "Description copied from interface: AmazonMTurkAsync

  request - `com.amazonaws.services.mturk.model.GetQualificationScoreRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetQualificationScore operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mturk.model.GetQualificationScoreResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.GetQualificationScoreRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getQualificationScoreAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.GetQualificationScoreRequest request]
    (-> this (.getQualificationScoreAsync request))))

(defn create-hit-async
  "Description copied from interface: AmazonMTurkAsync

  request - `com.amazonaws.services.mturk.model.CreateHITRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateHIT operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mturk.model.CreateHITResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.CreateHITRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createHITAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.CreateHITRequest request]
    (-> this (.createHITAsync request))))

(defn list-qualification-types-async
  "Description copied from interface: AmazonMTurkAsync

  request - `com.amazonaws.services.mturk.model.ListQualificationTypesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListQualificationTypes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mturk.model.ListQualificationTypesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.ListQualificationTypesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listQualificationTypesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.ListQualificationTypesRequest request]
    (-> this (.listQualificationTypesAsync request))))

(defn get-assignment-async
  "Description copied from interface: AmazonMTurkAsync

  request - `com.amazonaws.services.mturk.model.GetAssignmentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAssignment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mturk.model.GetAssignmentResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.GetAssignmentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAssignmentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.GetAssignmentRequest request]
    (-> this (.getAssignmentAsync request))))

(defn send-test-event-notification-async
  "Description copied from interface: AmazonMTurkAsync

  request - `com.amazonaws.services.mturk.model.SendTestEventNotificationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SendTestEventNotification operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mturk.model.SendTestEventNotificationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.SendTestEventNotificationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendTestEventNotificationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.SendTestEventNotificationRequest request]
    (-> this (.sendTestEventNotificationAsync request))))

(defn get-qualification-type-async
  "Description copied from interface: AmazonMTurkAsync

  request - `com.amazonaws.services.mturk.model.GetQualificationTypeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetQualificationType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mturk.model.GetQualificationTypeResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.GetQualificationTypeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getQualificationTypeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.GetQualificationTypeRequest request]
    (-> this (.getQualificationTypeAsync request))))

(defn list-reviewable-hi-ts-async
  "Description copied from interface: AmazonMTurkAsync

  request - `com.amazonaws.services.mturk.model.ListReviewableHITsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListReviewableHITs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mturk.model.ListReviewableHITsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.ListReviewableHITsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listReviewableHITsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.ListReviewableHITsRequest request]
    (-> this (.listReviewableHITsAsync request))))

(defn approve-assignment-async
  "Description copied from interface: AmazonMTurkAsync

  request - `com.amazonaws.services.mturk.model.ApproveAssignmentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ApproveAssignment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mturk.model.ApproveAssignmentResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.ApproveAssignmentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.approveAssignmentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.ApproveAssignmentRequest request]
    (-> this (.approveAssignmentAsync request))))

(defn update-notification-settings-async
  "Description copied from interface: AmazonMTurkAsync

  request - `com.amazonaws.services.mturk.model.UpdateNotificationSettingsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateNotificationSettings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mturk.model.UpdateNotificationSettingsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.UpdateNotificationSettingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateNotificationSettingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.UpdateNotificationSettingsRequest request]
    (-> this (.updateNotificationSettingsAsync request))))

(defn delete-worker-block-async
  "Description copied from interface: AmazonMTurkAsync

  request - `com.amazonaws.services.mturk.model.DeleteWorkerBlockRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteWorkerBlock operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mturk.model.DeleteWorkerBlockResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.DeleteWorkerBlockRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteWorkerBlockAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.DeleteWorkerBlockRequest request]
    (-> this (.deleteWorkerBlockAsync request))))

(defn update-hit-type-of-hit-async
  "Description copied from interface: AmazonMTurkAsync

  request - `com.amazonaws.services.mturk.model.UpdateHITTypeOfHITRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateHITTypeOfHIT operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mturk.model.UpdateHITTypeOfHITResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.UpdateHITTypeOfHITRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateHITTypeOfHITAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.UpdateHITTypeOfHITRequest request]
    (-> this (.updateHITTypeOfHITAsync request))))

(defn list-worker-blocks-async
  "Description copied from interface: AmazonMTurkAsync

  request - `com.amazonaws.services.mturk.model.ListWorkerBlocksRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListWorkerBlocks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mturk.model.ListWorkerBlocksResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.ListWorkerBlocksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listWorkerBlocksAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.ListWorkerBlocksRequest request]
    (-> this (.listWorkerBlocksAsync request))))

(defn accept-qualification-request-async
  "Description copied from interface: AmazonMTurkAsync

  request - `com.amazonaws.services.mturk.model.AcceptQualificationRequestRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AcceptQualificationRequest operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mturk.model.AcceptQualificationRequestResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.AcceptQualificationRequestRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.acceptQualificationRequestAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.AcceptQualificationRequestRequest request]
    (-> this (.acceptQualificationRequestAsync request))))

(defn update-hit-review-status-async
  "Description copied from interface: AmazonMTurkAsync

  request - `com.amazonaws.services.mturk.model.UpdateHITReviewStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateHITReviewStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mturk.model.UpdateHITReviewStatusResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.UpdateHITReviewStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateHITReviewStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.UpdateHITReviewStatusRequest request]
    (-> this (.updateHITReviewStatusAsync request))))

(defn get-account-balance-async
  "Description copied from interface: AmazonMTurkAsync

  request - `com.amazonaws.services.mturk.model.GetAccountBalanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAccountBalance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mturk.model.GetAccountBalanceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.GetAccountBalanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAccountBalanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.GetAccountBalanceRequest request]
    (-> this (.getAccountBalanceAsync request))))

(defn associate-qualification-with-worker-async
  "Description copied from interface: AmazonMTurkAsync

  request - `com.amazonaws.services.mturk.model.AssociateQualificationWithWorkerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateQualificationWithWorker operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.mturk.model.AssociateQualificationWithWorkerResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.AssociateQualificationWithWorkerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateQualificationWithWorkerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.AssociateQualificationWithWorkerRequest request]
    (-> this (.associateQualificationWithWorkerAsync request))))

(defn create-additional-assignments-for-hit-async
  "Description copied from interface: AmazonMTurkAsync

  request - `com.amazonaws.services.mturk.model.CreateAdditionalAssignmentsForHITRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAdditionalAssignmentsForHIT operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.mturk.model.CreateAdditionalAssignmentsForHITResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.CreateAdditionalAssignmentsForHITRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAdditionalAssignmentsForHITAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.CreateAdditionalAssignmentsForHITRequest request]
    (-> this (.createAdditionalAssignmentsForHITAsync request))))

(defn create-hit-with-hit-type-async
  "Description copied from interface: AmazonMTurkAsync

  request - `com.amazonaws.services.mturk.model.CreateHITWithHITTypeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateHITWithHITType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mturk.model.CreateHITWithHITTypeResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.CreateHITWithHITTypeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createHITWithHITTypeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.CreateHITWithHITTypeRequest request]
    (-> this (.createHITWithHITTypeAsync request))))

(defn get-hit-async
  "Description copied from interface: AmazonMTurkAsync

  request - `com.amazonaws.services.mturk.model.GetHITRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetHIT operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mturk.model.GetHITResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.GetHITRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getHITAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.GetHITRequest request]
    (-> this (.getHITAsync request))))

(defn list-hi-ts-async
  "Description copied from interface: AmazonMTurkAsync

  request - `com.amazonaws.services.mturk.model.ListHITsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListHITs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mturk.model.ListHITsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.ListHITsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listHITsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMTurkAsync this ^com.amazonaws.services.mturk.model.ListHITsRequest request]
    (-> this (.listHITsAsync request))))

