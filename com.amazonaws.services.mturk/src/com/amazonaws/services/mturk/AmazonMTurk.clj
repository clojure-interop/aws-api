(ns com.amazonaws.services.mturk.AmazonMTurk
  "Interface for accessing Amazon MTurk.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonMTurk instead.


  Amazon Mechanical Turk API Reference"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mturk AmazonMTurk]))

(defn create-worker-block
  "The CreateWorkerBlock operation allows you to prevent a Worker from working on your HITs. For
   example, you can block a Worker who is producing poor quality work. You can block up to 100,000 Workers.

  create-worker-block-request - `com.amazonaws.services.mturk.model.CreateWorkerBlockRequest`

  returns: Result of the CreateWorkerBlock operation returned by the service. - `com.amazonaws.services.mturk.model.CreateWorkerBlockResult`

  throws: com.amazonaws.services.mturk.model.ServiceException - Amazon Mechanical Turk is temporarily unable to process your request. Try your call again."
  (^com.amazonaws.services.mturk.model.CreateWorkerBlockResult [^AmazonMTurk this ^com.amazonaws.services.mturk.model.CreateWorkerBlockRequest create-worker-block-request]
    (-> this (.createWorkerBlock create-worker-block-request))))

(defn create-hit-type
  "The CreateHITType operation creates a new HIT type. This operation allows you to define a standard
   set of HIT properties to use when creating HITs. If you register a HIT type with values that match an existing
   HIT type, the HIT type ID of the existing type will be returned.

  create-hit-type-request - `com.amazonaws.services.mturk.model.CreateHITTypeRequest`

  returns: Result of the CreateHITType operation returned by the service. - `com.amazonaws.services.mturk.model.CreateHITTypeResult`

  throws: com.amazonaws.services.mturk.model.ServiceException - Amazon Mechanical Turk is temporarily unable to process your request. Try your call again."
  (^com.amazonaws.services.mturk.model.CreateHITTypeResult [^AmazonMTurk this ^com.amazonaws.services.mturk.model.CreateHITTypeRequest create-hit-type-request]
    (-> this (.createHITType create-hit-type-request))))

(defn update-qualification-type
  "The UpdateQualificationType operation modifies the attributes of an existing Qualification type,
   which is represented by a QualificationType data structure. Only the owner of a Qualification type can modify its
   attributes.


   Most attributes of a Qualification type can be changed after the type has been created. However, the Name and
   Keywords fields cannot be modified. The RetryDelayInSeconds parameter can be modified or added to change the
   delay or to enable retries, but RetryDelayInSeconds cannot be used to disable retries.


   You can use this operation to update the test for a Qualification type. The test is updated based on the values
   specified for the Test, TestDurationInSeconds and AnswerKey parameters. All three parameters specify the updated
   test. If you are updating the test for a type, you must specify the Test and TestDurationInSeconds parameters.
   The AnswerKey parameter is optional; omitting it specifies that the updated test does not have an answer key.


   If you omit the Test parameter, the test for the Qualification type is unchanged. There is no way to remove a
   test from a Qualification type that has one. If the type already has a test, you cannot update it to be
   AutoGranted. If the Qualification type does not have a test and one is provided by an update, the type will
   henceforth have a test.


   If you want to update the test duration or answer key for an existing test without changing the questions, you
   must specify a Test parameter with the original questions, along with the updated values.


   If you provide an updated Test but no AnswerKey, the new test will not have an answer key. Requests for such
   Qualifications must be granted manually.


   You can also update the AutoGranted and AutoGrantedValue attributes of the Qualification type.

  update-qualification-type-request - `com.amazonaws.services.mturk.model.UpdateQualificationTypeRequest`

  returns: Result of the UpdateQualificationType operation returned by the service. - `com.amazonaws.services.mturk.model.UpdateQualificationTypeResult`

  throws: com.amazonaws.services.mturk.model.ServiceException - Amazon Mechanical Turk is temporarily unable to process your request. Try your call again."
  (^com.amazonaws.services.mturk.model.UpdateQualificationTypeResult [^AmazonMTurk this ^com.amazonaws.services.mturk.model.UpdateQualificationTypeRequest update-qualification-type-request]
    (-> this (.updateQualificationType update-qualification-type-request))))

(defn get-hit
  "The GetHIT operation retrieves the details of the specified HIT.

  get-hit-request - `com.amazonaws.services.mturk.model.GetHITRequest`

  returns: Result of the GetHIT operation returned by the service. - `com.amazonaws.services.mturk.model.GetHITResult`

  throws: com.amazonaws.services.mturk.model.ServiceException - Amazon Mechanical Turk is temporarily unable to process your request. Try your call again."
  (^com.amazonaws.services.mturk.model.GetHITResult [^AmazonMTurk this ^com.amazonaws.services.mturk.model.GetHITRequest get-hit-request]
    (-> this (.getHIT get-hit-request))))

(defn create-hit-with-hit-type
  "The CreateHITWithHITType operation creates a new Human Intelligence Task (HIT) using an existing
   HITTypeID generated by the CreateHITType operation.


   This is an alternative way to create HITs from the CreateHIT operation. This is the recommended best
   practice for Requesters who are creating large numbers of HITs.


   CreateHITWithHITType also supports several ways to provide question data: by providing a value for the
   Question parameter that fully specifies the contents of the HIT, or by providing a
   HitLayoutId and associated HitLayoutParameters.



   If a HIT is created with 10 or more maximum assignments, there is an additional fee. For more information, see Amazon Mechanical Turk Pricing.

  create-hit-with-hit-type-request - `com.amazonaws.services.mturk.model.CreateHITWithHITTypeRequest`

  returns: Result of the CreateHITWithHITType operation returned by the service. - `com.amazonaws.services.mturk.model.CreateHITWithHITTypeResult`

  throws: com.amazonaws.services.mturk.model.ServiceException - Amazon Mechanical Turk is temporarily unable to process your request. Try your call again."
  (^com.amazonaws.services.mturk.model.CreateHITWithHITTypeResult [^AmazonMTurk this ^com.amazonaws.services.mturk.model.CreateHITWithHITTypeRequest create-hit-with-hit-type-request]
    (-> this (.createHITWithHITType create-hit-with-hit-type-request))))

(defn list-hi-ts
  "The ListHITs operation returns all of a Requester's HITs. The operation returns HITs of any status,
   except for HITs that have been deleted of with the DeleteHIT operation or that have been auto-deleted.

  list-hi-ts-request - `com.amazonaws.services.mturk.model.ListHITsRequest`

  returns: Result of the ListHITs operation returned by the service. - `com.amazonaws.services.mturk.model.ListHITsResult`

  throws: com.amazonaws.services.mturk.model.ServiceException - Amazon Mechanical Turk is temporarily unable to process your request. Try your call again."
  (^com.amazonaws.services.mturk.model.ListHITsResult [^AmazonMTurk this ^com.amazonaws.services.mturk.model.ListHITsRequest list-hi-ts-request]
    (-> this (.listHITs list-hi-ts-request))))

(defn delete-hit
  "The DeleteHIT operation is used to delete HIT that is no longer needed. Only the Requester who
   created the HIT can delete it.


   You can only dispose of HITs that are in the Reviewable state, with all of their submitted
   assignments already either approved or rejected. If you call the DeleteHIT operation on a HIT that is not in the
   Reviewable state (for example, that has not expired, or still has active assignments), or on a HIT
   that is Reviewable but without all of its submitted assignments already approved or rejected, the service will
   return an error.





   HITs are automatically disposed of after 120 days.




   After you dispose of a HIT, you can no longer approve the HIT's rejected assignments.




   Disposed HITs are not returned in results for the ListHITs operation.




   Disposing HITs can improve the performance of operations such as ListReviewableHITs and ListHITs.

  delete-hit-request - `com.amazonaws.services.mturk.model.DeleteHITRequest`

  returns: Result of the DeleteHIT operation returned by the service. - `com.amazonaws.services.mturk.model.DeleteHITResult`

  throws: com.amazonaws.services.mturk.model.ServiceException - Amazon Mechanical Turk is temporarily unable to process your request. Try your call again."
  (^com.amazonaws.services.mturk.model.DeleteHITResult [^AmazonMTurk this ^com.amazonaws.services.mturk.model.DeleteHITRequest delete-hit-request]
    (-> this (.deleteHIT delete-hit-request))))

(defn get-account-balance
  "The GetAccountBalance operation retrieves the amount of money in your Amazon Mechanical Turk
   account.

  get-account-balance-request - `com.amazonaws.services.mturk.model.GetAccountBalanceRequest`

  returns: Result of the GetAccountBalance operation returned by the service. - `com.amazonaws.services.mturk.model.GetAccountBalanceResult`

  throws: com.amazonaws.services.mturk.model.ServiceException - Amazon Mechanical Turk is temporarily unable to process your request. Try your call again."
  (^com.amazonaws.services.mturk.model.GetAccountBalanceResult [^AmazonMTurk this ^com.amazonaws.services.mturk.model.GetAccountBalanceRequest get-account-balance-request]
    (-> this (.getAccountBalance get-account-balance-request))))

(defn update-hit-type-of-hit
  "The UpdateHITTypeOfHIT operation allows you to change the HITType properties of a HIT. This
   operation disassociates the HIT from its old HITType properties and associates it with the new HITType
   properties. The HIT takes on the properties of the new HITType in place of the old ones.

  update-hit-type-of-hit-request - `com.amazonaws.services.mturk.model.UpdateHITTypeOfHITRequest`

  returns: Result of the UpdateHITTypeOfHIT operation returned by the service. - `com.amazonaws.services.mturk.model.UpdateHITTypeOfHITResult`

  throws: com.amazonaws.services.mturk.model.ServiceException - Amazon Mechanical Turk is temporarily unable to process your request. Try your call again."
  (^com.amazonaws.services.mturk.model.UpdateHITTypeOfHITResult [^AmazonMTurk this ^com.amazonaws.services.mturk.model.UpdateHITTypeOfHITRequest update-hit-type-of-hit-request]
    (-> this (.updateHITTypeOfHIT update-hit-type-of-hit-request))))

(defn update-notification-settings
  "The UpdateNotificationSettings operation creates, updates, disables or re-enables notifications for
   a HIT type. If you call the UpdateNotificationSettings operation for a HIT type that already has a notification
   specification, the operation replaces the old specification with a new one. You can call the
   UpdateNotificationSettings operation to enable or disable notifications for the HIT type, without having to
   modify the notification specification itself by providing updates to the Active status without specifying a new
   notification specification. To change the Active status of a HIT type's notifications, the HIT type must already
   have a notification specification, or one must be provided in the same call to
   UpdateNotificationSettings.

  update-notification-settings-request - `com.amazonaws.services.mturk.model.UpdateNotificationSettingsRequest`

  returns: Result of the UpdateNotificationSettings operation returned by the service. - `com.amazonaws.services.mturk.model.UpdateNotificationSettingsResult`

  throws: com.amazonaws.services.mturk.model.ServiceException - Amazon Mechanical Turk is temporarily unable to process your request. Try your call again."
  (^com.amazonaws.services.mturk.model.UpdateNotificationSettingsResult [^AmazonMTurk this ^com.amazonaws.services.mturk.model.UpdateNotificationSettingsRequest update-notification-settings-request]
    (-> this (.updateNotificationSettings update-notification-settings-request))))

(defn list-assignments-for-hit
  "The ListAssignmentsForHIT operation retrieves completed assignments for a HIT. You can use this
   operation to retrieve the results for a HIT.


   You can get assignments for a HIT at any time, even if the HIT is not yet Reviewable. If a HIT requested multiple
   assignments, and has received some results but has not yet become Reviewable, you can still retrieve the partial
   results with this operation.


   Use the AssignmentStatus parameter to control which set of assignments for a HIT are returned. The
   ListAssignmentsForHIT operation can return submitted assignments awaiting approval, or it can return assignments
   that have already been approved or rejected. You can set AssignmentStatus=Approved,Rejected to get assignments
   that have already been approved and rejected together in one result set.


   Only the Requester who created the HIT can retrieve the assignments for that HIT.


   Results are sorted and divided into numbered pages and the operation returns a single page of results. You can
   use the parameters of the operation to control sorting and pagination.

  list-assignments-for-hit-request - `com.amazonaws.services.mturk.model.ListAssignmentsForHITRequest`

  returns: Result of the ListAssignmentsForHIT operation returned by the service. - `com.amazonaws.services.mturk.model.ListAssignmentsForHITResult`

  throws: com.amazonaws.services.mturk.model.ServiceException - Amazon Mechanical Turk is temporarily unable to process your request. Try your call again."
  (^com.amazonaws.services.mturk.model.ListAssignmentsForHITResult [^AmazonMTurk this ^com.amazonaws.services.mturk.model.ListAssignmentsForHITRequest list-assignments-for-hit-request]
    (-> this (.listAssignmentsForHIT list-assignments-for-hit-request))))

(defn list-worker-blocks
  "The ListWorkersBlocks operation retrieves a list of Workers who are blocked from working on your
   HITs.

  list-worker-blocks-request - `com.amazonaws.services.mturk.model.ListWorkerBlocksRequest`

  returns: Result of the ListWorkerBlocks operation returned by the service. - `com.amazonaws.services.mturk.model.ListWorkerBlocksResult`

  throws: com.amazonaws.services.mturk.model.ServiceException - Amazon Mechanical Turk is temporarily unable to process your request. Try your call again."
  (^com.amazonaws.services.mturk.model.ListWorkerBlocksResult [^AmazonMTurk this ^com.amazonaws.services.mturk.model.ListWorkerBlocksRequest list-worker-blocks-request]
    (-> this (.listWorkerBlocks list-worker-blocks-request))))

(defn get-assignment
  "The GetAssignment operation retrieves the details of the specified Assignment.

  get-assignment-request - `com.amazonaws.services.mturk.model.GetAssignmentRequest`

  returns: Result of the GetAssignment operation returned by the service. - `com.amazonaws.services.mturk.model.GetAssignmentResult`

  throws: com.amazonaws.services.mturk.model.ServiceException - Amazon Mechanical Turk is temporarily unable to process your request. Try your call again."
  (^com.amazonaws.services.mturk.model.GetAssignmentResult [^AmazonMTurk this ^com.amazonaws.services.mturk.model.GetAssignmentRequest get-assignment-request]
    (-> this (.getAssignment get-assignment-request))))

(defn get-qualification-type
  "The GetQualificationTypeoperation retrieves information about a Qualification type using its ID.

  get-qualification-type-request - `com.amazonaws.services.mturk.model.GetQualificationTypeRequest`

  returns: Result of the GetQualificationType operation returned by the service. - `com.amazonaws.services.mturk.model.GetQualificationTypeResult`

  throws: com.amazonaws.services.mturk.model.ServiceException - Amazon Mechanical Turk is temporarily unable to process your request. Try your call again."
  (^com.amazonaws.services.mturk.model.GetQualificationTypeResult [^AmazonMTurk this ^com.amazonaws.services.mturk.model.GetQualificationTypeRequest get-qualification-type-request]
    (-> this (.getQualificationType get-qualification-type-request))))

(defn list-workers-with-qualification-type
  "The ListWorkersWithQualificationType operation returns all of the Workers that have been associated
   with a given Qualification type.

  list-workers-with-qualification-type-request - `com.amazonaws.services.mturk.model.ListWorkersWithQualificationTypeRequest`

  returns: Result of the ListWorkersWithQualificationType operation returned by the service. - `com.amazonaws.services.mturk.model.ListWorkersWithQualificationTypeResult`

  throws: com.amazonaws.services.mturk.model.ServiceException - Amazon Mechanical Turk is temporarily unable to process your request. Try your call again."
  (^com.amazonaws.services.mturk.model.ListWorkersWithQualificationTypeResult [^AmazonMTurk this ^com.amazonaws.services.mturk.model.ListWorkersWithQualificationTypeRequest list-workers-with-qualification-type-request]
    (-> this (.listWorkersWithQualificationType list-workers-with-qualification-type-request))))

(defn get-file-upload-url
  "The GetFileUploadURL operation generates and returns a temporary URL. You use the temporary URL to
   retrieve a file uploaded by a Worker as an answer to a FileUploadAnswer question for a HIT. The temporary URL is
   generated the instant the GetFileUploadURL operation is called, and is valid for 60 seconds. You can get a
   temporary file upload URL any time until the HIT is disposed. After the HIT is disposed, any uploaded files are
   deleted, and cannot be retrieved. Pending Deprecation on December 12, 2017. The Answer Specification structure
   will no longer support the FileUploadAnswer element to be used for the QuestionForm data structure.
   Instead, we recommend that Requesters who want to create HITs asking Workers to upload files to use Amazon S3.

  get-file-upload-url-request - `com.amazonaws.services.mturk.model.GetFileUploadURLRequest`

  returns: Result of the GetFileUploadURL operation returned by the service. - `com.amazonaws.services.mturk.model.GetFileUploadURLResult`

  throws: com.amazonaws.services.mturk.model.ServiceException - Amazon Mechanical Turk is temporarily unable to process your request. Try your call again."
  (^com.amazonaws.services.mturk.model.GetFileUploadURLResult [^AmazonMTurk this ^com.amazonaws.services.mturk.model.GetFileUploadURLRequest get-file-upload-url-request]
    (-> this (.getFileUploadURL get-file-upload-url-request))))

(defn send-test-event-notification
  "The SendTestEventNotification operation causes Amazon Mechanical Turk to send a notification message
   as if a HIT event occurred, according to the provided notification specification. This allows you to test
   notifications without setting up notifications for a real HIT type and trying to trigger them using the website.
   When you call this operation, the service attempts to send the test notification immediately.

  send-test-event-notification-request - `com.amazonaws.services.mturk.model.SendTestEventNotificationRequest`

  returns: Result of the SendTestEventNotification operation returned by the service. - `com.amazonaws.services.mturk.model.SendTestEventNotificationResult`

  throws: com.amazonaws.services.mturk.model.ServiceException - Amazon Mechanical Turk is temporarily unable to process your request. Try your call again."
  (^com.amazonaws.services.mturk.model.SendTestEventNotificationResult [^AmazonMTurk this ^com.amazonaws.services.mturk.model.SendTestEventNotificationRequest send-test-event-notification-request]
    (-> this (.sendTestEventNotification send-test-event-notification-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonMTurk this]
    (-> this (.shutdown))))

(defn accept-qualification-request
  "The AcceptQualificationRequest operation approves a Worker's request for a Qualification.


   Only the owner of the Qualification type can grant a Qualification request for that type.


   A successful request for the AcceptQualificationRequest operation returns with no errors and an
   empty body.

  accept-qualification-request-request - `com.amazonaws.services.mturk.model.AcceptQualificationRequestRequest`

  returns: Result of the AcceptQualificationRequest operation returned by the service. - `com.amazonaws.services.mturk.model.AcceptQualificationRequestResult`

  throws: com.amazonaws.services.mturk.model.ServiceException - Amazon Mechanical Turk is temporarily unable to process your request. Try your call again."
  (^com.amazonaws.services.mturk.model.AcceptQualificationRequestResult [^AmazonMTurk this ^com.amazonaws.services.mturk.model.AcceptQualificationRequestRequest accept-qualification-request-request]
    (-> this (.acceptQualificationRequest accept-qualification-request-request))))

(defn delete-qualification-type
  "The DeleteQualificationType deletes a Qualification type and deletes any HIT types that are
   associated with the Qualification type.


   This operation does not revoke Qualifications already assigned to Workers because the Qualifications might be
   needed for active HITs. If there are any pending requests for the Qualification type, Amazon Mechanical Turk
   rejects those requests. After you delete a Qualification type, you can no longer use it to create HITs or HIT
   types.



   DeleteQualificationType must wait for all the HITs that use the deleted Qualification type to be deleted before
   completing. It may take up to 48 hours before DeleteQualificationType completes and the unique name of the
   Qualification type is available for reuse with CreateQualificationType.

  delete-qualification-type-request - `com.amazonaws.services.mturk.model.DeleteQualificationTypeRequest`

  returns: Result of the DeleteQualificationType operation returned by the service. - `com.amazonaws.services.mturk.model.DeleteQualificationTypeResult`

  throws: com.amazonaws.services.mturk.model.ServiceException - Amazon Mechanical Turk is temporarily unable to process your request. Try your call again."
  (^com.amazonaws.services.mturk.model.DeleteQualificationTypeResult [^AmazonMTurk this ^com.amazonaws.services.mturk.model.DeleteQualificationTypeRequest delete-qualification-type-request]
    (-> this (.deleteQualificationType delete-qualification-type-request))))

(defn associate-qualification-with-worker
  "The AssociateQualificationWithWorker operation gives a Worker a Qualification.
   AssociateQualificationWithWorker does not require that the Worker submit a Qualification request. It
   gives the Qualification directly to the Worker.


   You can only assign a Qualification of a Qualification type that you created (using the
   CreateQualificationType operation).



   Note: AssociateQualificationWithWorker does not affect any pending Qualification requests for the
   Qualification by the Worker. If you assign a Qualification to a Worker, then later grant a Qualification request
   made by the Worker, the granting of the request may modify the Qualification score. To resolve a pending
   Qualification request without affecting the Qualification the Worker already has, reject the request with the
   RejectQualificationRequest operation.

  associate-qualification-with-worker-request - `com.amazonaws.services.mturk.model.AssociateQualificationWithWorkerRequest`

  returns: Result of the AssociateQualificationWithWorker operation returned by the service. - `com.amazonaws.services.mturk.model.AssociateQualificationWithWorkerResult`

  throws: com.amazonaws.services.mturk.model.ServiceException - Amazon Mechanical Turk is temporarily unable to process your request. Try your call again."
  (^com.amazonaws.services.mturk.model.AssociateQualificationWithWorkerResult [^AmazonMTurk this ^com.amazonaws.services.mturk.model.AssociateQualificationWithWorkerRequest associate-qualification-with-worker-request]
    (-> this (.associateQualificationWithWorker associate-qualification-with-worker-request))))

(defn list-bonus-payments
  "The ListBonusPayments operation retrieves the amounts of bonuses you have paid to Workers for a
   given HIT or assignment.

  list-bonus-payments-request - `com.amazonaws.services.mturk.model.ListBonusPaymentsRequest`

  returns: Result of the ListBonusPayments operation returned by the service. - `com.amazonaws.services.mturk.model.ListBonusPaymentsResult`

  throws: com.amazonaws.services.mturk.model.ServiceException - Amazon Mechanical Turk is temporarily unable to process your request. Try your call again."
  (^com.amazonaws.services.mturk.model.ListBonusPaymentsResult [^AmazonMTurk this ^com.amazonaws.services.mturk.model.ListBonusPaymentsRequest list-bonus-payments-request]
    (-> this (.listBonusPayments list-bonus-payments-request))))

(defn list-review-policy-results-for-hit
  "The ListReviewPolicyResultsForHIT operation retrieves the computed results and the actions taken in
   the course of executing your Review Policies for a given HIT. For information about how to specify Review
   Policies when you call CreateHIT, see Review Policies. The ListReviewPolicyResultsForHIT operation can return
   results for both Assignment-level and HIT-level review results.

  list-review-policy-results-for-hit-request - `com.amazonaws.services.mturk.model.ListReviewPolicyResultsForHITRequest`

  returns: Result of the ListReviewPolicyResultsForHIT operation returned by the service. - `com.amazonaws.services.mturk.model.ListReviewPolicyResultsForHITResult`

  throws: com.amazonaws.services.mturk.model.ServiceException - Amazon Mechanical Turk is temporarily unable to process your request. Try your call again."
  (^com.amazonaws.services.mturk.model.ListReviewPolicyResultsForHITResult [^AmazonMTurk this ^com.amazonaws.services.mturk.model.ListReviewPolicyResultsForHITRequest list-review-policy-results-for-hit-request]
    (-> this (.listReviewPolicyResultsForHIT list-review-policy-results-for-hit-request))))

(defn list-qualification-types
  "The ListQualificationTypes operation returns a list of Qualification types, filtered by an optional
   search term.

  list-qualification-types-request - `com.amazonaws.services.mturk.model.ListQualificationTypesRequest`

  returns: Result of the ListQualificationTypes operation returned by the service. - `com.amazonaws.services.mturk.model.ListQualificationTypesResult`

  throws: com.amazonaws.services.mturk.model.ServiceException - Amazon Mechanical Turk is temporarily unable to process your request. Try your call again."
  (^com.amazonaws.services.mturk.model.ListQualificationTypesResult [^AmazonMTurk this ^com.amazonaws.services.mturk.model.ListQualificationTypesRequest list-qualification-types-request]
    (-> this (.listQualificationTypes list-qualification-types-request))))

(defn get-qualification-score
  "The GetQualificationScore operation returns the value of a Worker's Qualification for a given
   Qualification type.


   To get a Worker's Qualification, you must know the Worker's ID. The Worker's ID is included in the assignment
   data returned by the ListAssignmentsForHIT operation.


   Only the owner of a Qualification type can query the value of a Worker's Qualification of that type.

  get-qualification-score-request - `com.amazonaws.services.mturk.model.GetQualificationScoreRequest`

  returns: Result of the GetQualificationScore operation returned by the service. - `com.amazonaws.services.mturk.model.GetQualificationScoreResult`

  throws: com.amazonaws.services.mturk.model.ServiceException - Amazon Mechanical Turk is temporarily unable to process your request. Try your call again."
  (^com.amazonaws.services.mturk.model.GetQualificationScoreResult [^AmazonMTurk this ^com.amazonaws.services.mturk.model.GetQualificationScoreRequest get-qualification-score-request]
    (-> this (.getQualificationScore get-qualification-score-request))))

(defn update-expiration-for-hit
  "The UpdateExpirationForHIT operation allows you update the expiration time of a HIT. If you update
   it to a time in the past, the HIT will be immediately expired.

  update-expiration-for-hit-request - `com.amazonaws.services.mturk.model.UpdateExpirationForHITRequest`

  returns: Result of the UpdateExpirationForHIT operation returned by the service. - `com.amazonaws.services.mturk.model.UpdateExpirationForHITResult`

  throws: com.amazonaws.services.mturk.model.ServiceException - Amazon Mechanical Turk is temporarily unable to process your request. Try your call again."
  (^com.amazonaws.services.mturk.model.UpdateExpirationForHITResult [^AmazonMTurk this ^com.amazonaws.services.mturk.model.UpdateExpirationForHITRequest update-expiration-for-hit-request]
    (-> this (.updateExpirationForHIT update-expiration-for-hit-request))))

(defn notify-workers
  "The NotifyWorkers operation sends an email to one or more Workers that you specify with the Worker
   ID. You can specify up to 100 Worker IDs to send the same message with a single call to the NotifyWorkers
   operation. The NotifyWorkers operation will send a notification email to a Worker only if you have previously
   approved or rejected work from the Worker.

  notify-workers-request - `com.amazonaws.services.mturk.model.NotifyWorkersRequest`

  returns: Result of the NotifyWorkers operation returned by the service. - `com.amazonaws.services.mturk.model.NotifyWorkersResult`

  throws: com.amazonaws.services.mturk.model.ServiceException - Amazon Mechanical Turk is temporarily unable to process your request. Try your call again."
  (^com.amazonaws.services.mturk.model.NotifyWorkersResult [^AmazonMTurk this ^com.amazonaws.services.mturk.model.NotifyWorkersRequest notify-workers-request]
    (-> this (.notifyWorkers notify-workers-request))))

(defn reject-qualification-request
  "The RejectQualificationRequest operation rejects a user's request for a Qualification.


   You can provide a text message explaining why the request was rejected. The Worker who made the request can see
   this message.

  reject-qualification-request-request - `com.amazonaws.services.mturk.model.RejectQualificationRequestRequest`

  returns: Result of the RejectQualificationRequest operation returned by the service. - `com.amazonaws.services.mturk.model.RejectQualificationRequestResult`

  throws: com.amazonaws.services.mturk.model.ServiceException - Amazon Mechanical Turk is temporarily unable to process your request. Try your call again."
  (^com.amazonaws.services.mturk.model.RejectQualificationRequestResult [^AmazonMTurk this ^com.amazonaws.services.mturk.model.RejectQualificationRequestRequest reject-qualification-request-request]
    (-> this (.rejectQualificationRequest reject-qualification-request-request))))

(defn create-qualification-type
  "The CreateQualificationType operation creates a new Qualification type, which is represented by a
   QualificationType data structure.

  create-qualification-type-request - `com.amazonaws.services.mturk.model.CreateQualificationTypeRequest`

  returns: Result of the CreateQualificationType operation returned by the service. - `com.amazonaws.services.mturk.model.CreateQualificationTypeResult`

  throws: com.amazonaws.services.mturk.model.ServiceException - Amazon Mechanical Turk is temporarily unable to process your request. Try your call again."
  (^com.amazonaws.services.mturk.model.CreateQualificationTypeResult [^AmazonMTurk this ^com.amazonaws.services.mturk.model.CreateQualificationTypeRequest create-qualification-type-request]
    (-> this (.createQualificationType create-qualification-type-request))))

(defn create-additional-assignments-for-hit
  "The CreateAdditionalAssignmentsForHIT operation increases the maximum number of assignments of an
   existing HIT.


   To extend the maximum number of assignments, specify the number of additional assignments.





   HITs created with fewer than 10 assignments cannot be extended to have 10 or more assignments. Attempting to add
   assignments in a way that brings the total number of assignments for a HIT from fewer than 10 assignments to 10
   or more assignments will result in an AWS.MechanicalTurk.InvalidMaximumAssignmentsIncrease
   exception.




   HITs that were created before July 22, 2015 cannot be extended. Attempting to extend HITs that were created
   before July 22, 2015 will result in an AWS.MechanicalTurk.HITTooOldForExtension exception.

  create-additional-assignments-for-hit-request - `com.amazonaws.services.mturk.model.CreateAdditionalAssignmentsForHITRequest`

  returns: Result of the CreateAdditionalAssignmentsForHIT operation returned by the service. - `com.amazonaws.services.mturk.model.CreateAdditionalAssignmentsForHITResult`

  throws: com.amazonaws.services.mturk.model.ServiceException - Amazon Mechanical Turk is temporarily unable to process your request. Try your call again."
  (^com.amazonaws.services.mturk.model.CreateAdditionalAssignmentsForHITResult [^AmazonMTurk this ^com.amazonaws.services.mturk.model.CreateAdditionalAssignmentsForHITRequest create-additional-assignments-for-hit-request]
    (-> this (.createAdditionalAssignmentsForHIT create-additional-assignments-for-hit-request))))

(defn disassociate-qualification-from-worker
  "The DisassociateQualificationFromWorker revokes a previously granted Qualification from a user.


   You can provide a text message explaining why the Qualification was revoked. The user who had the Qualification
   can see this message.

  disassociate-qualification-from-worker-request - `com.amazonaws.services.mturk.model.DisassociateQualificationFromWorkerRequest`

  returns: Result of the DisassociateQualificationFromWorker operation returned by the service. - `com.amazonaws.services.mturk.model.DisassociateQualificationFromWorkerResult`

  throws: com.amazonaws.services.mturk.model.ServiceException - Amazon Mechanical Turk is temporarily unable to process your request. Try your call again."
  (^com.amazonaws.services.mturk.model.DisassociateQualificationFromWorkerResult [^AmazonMTurk this ^com.amazonaws.services.mturk.model.DisassociateQualificationFromWorkerRequest disassociate-qualification-from-worker-request]
    (-> this (.disassociateQualificationFromWorker disassociate-qualification-from-worker-request))))

(defn create-hit
  "The CreateHIT operation creates a new Human Intelligence Task (HIT). The new HIT is made available
   for Workers to find and accept on the Amazon Mechanical Turk website.


   This operation allows you to specify a new HIT by passing in values for the properties of the HIT, such as its
   title, reward amount and number of assignments. When you pass these values to CreateHIT, a new HIT
   is created for you, with a new HITTypeID. The HITTypeID can be used to create additional HITs in the
   future without needing to specify common parameters such as the title, description and reward amount each time.


   An alternative way to create HITs is to first generate a HITTypeID using the CreateHITType operation
   and then call the CreateHITWithHITType operation. This is the recommended best practice for
   Requesters who are creating large numbers of HITs.


   CreateHIT also supports several ways to provide question data: by providing a value for the Question
   parameter that fully specifies the contents of the HIT, or by providing a HitLayoutId and associated
   HitLayoutParameters.



   If a HIT is created with 10 or more maximum assignments, there is an additional fee. For more information, see Amazon Mechanical Turk Pricing.

  create-hit-request - `com.amazonaws.services.mturk.model.CreateHITRequest`

  returns: Result of the CreateHIT operation returned by the service. - `com.amazonaws.services.mturk.model.CreateHITResult`

  throws: com.amazonaws.services.mturk.model.ServiceException - Amazon Mechanical Turk is temporarily unable to process your request. Try your call again."
  (^com.amazonaws.services.mturk.model.CreateHITResult [^AmazonMTurk this ^com.amazonaws.services.mturk.model.CreateHITRequest create-hit-request]
    (-> this (.createHIT create-hit-request))))

(defn update-hit-review-status
  "The UpdateHITReviewStatus operation updates the status of a HIT. If the status is Reviewable, this
   operation can update the status to Reviewing, or it can revert a Reviewing HIT back to the Reviewable status.

  update-hit-review-status-request - `com.amazonaws.services.mturk.model.UpdateHITReviewStatusRequest`

  returns: Result of the UpdateHITReviewStatus operation returned by the service. - `com.amazonaws.services.mturk.model.UpdateHITReviewStatusResult`

  throws: com.amazonaws.services.mturk.model.ServiceException - Amazon Mechanical Turk is temporarily unable to process your request. Try your call again."
  (^com.amazonaws.services.mturk.model.UpdateHITReviewStatusResult [^AmazonMTurk this ^com.amazonaws.services.mturk.model.UpdateHITReviewStatusRequest update-hit-review-status-request]
    (-> this (.updateHITReviewStatus update-hit-review-status-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonMTurk this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn list-reviewable-hi-ts
  "The ListReviewableHITs operation retrieves the HITs with Status equal to Reviewable or Status equal
   to Reviewing that belong to the Requester calling the operation.

  list-reviewable-hi-ts-request - `com.amazonaws.services.mturk.model.ListReviewableHITsRequest`

  returns: Result of the ListReviewableHITs operation returned by the service. - `com.amazonaws.services.mturk.model.ListReviewableHITsResult`

  throws: com.amazonaws.services.mturk.model.ServiceException - Amazon Mechanical Turk is temporarily unable to process your request. Try your call again."
  (^com.amazonaws.services.mturk.model.ListReviewableHITsResult [^AmazonMTurk this ^com.amazonaws.services.mturk.model.ListReviewableHITsRequest list-reviewable-hi-ts-request]
    (-> this (.listReviewableHITs list-reviewable-hi-ts-request))))

(defn send-bonus
  "The SendBonus operation issues a payment of money from your account to a Worker. This payment
   happens separately from the reward you pay to the Worker when you approve the Worker's assignment. The SendBonus
   operation requires the Worker's ID and the assignment ID as parameters to initiate payment of the bonus. You must
   include a message that explains the reason for the bonus payment, as the Worker may not be expecting the payment.
   Amazon Mechanical Turk collects a fee for bonus payments, similar to the HIT listing fee. This operation fails if
   your account does not have enough funds to pay for both the bonus and the fees.

  send-bonus-request - `com.amazonaws.services.mturk.model.SendBonusRequest`

  returns: Result of the SendBonus operation returned by the service. - `com.amazonaws.services.mturk.model.SendBonusResult`

  throws: com.amazonaws.services.mturk.model.ServiceException - Amazon Mechanical Turk is temporarily unable to process your request. Try your call again."
  (^com.amazonaws.services.mturk.model.SendBonusResult [^AmazonMTurk this ^com.amazonaws.services.mturk.model.SendBonusRequest send-bonus-request]
    (-> this (.sendBonus send-bonus-request))))

(defn approve-assignment
  "The ApproveAssignment operation approves the results of a completed assignment.


   Approving an assignment initiates two payments from the Requester's Amazon.com account




   The Worker who submitted the results is paid the reward specified in the HIT.




   Amazon Mechanical Turk fees are debited.




   If the Requester's account does not have adequate funds for these payments, the call to ApproveAssignment returns
   an exception, and the approval is not processed. You can include an optional feedback message with the approval,
   which the Worker can see in the Status section of the web site.


   You can also call this operation for assignments that were previous rejected and approve them by explicitly
   overriding the previous rejection. This only works on rejected assignments that were submitted within the
   previous 30 days and only if the assignment's related HIT has not been deleted.

  approve-assignment-request - `com.amazonaws.services.mturk.model.ApproveAssignmentRequest`

  returns: Result of the ApproveAssignment operation returned by the service. - `com.amazonaws.services.mturk.model.ApproveAssignmentResult`

  throws: com.amazonaws.services.mturk.model.ServiceException - Amazon Mechanical Turk is temporarily unable to process your request. Try your call again."
  (^com.amazonaws.services.mturk.model.ApproveAssignmentResult [^AmazonMTurk this ^com.amazonaws.services.mturk.model.ApproveAssignmentRequest approve-assignment-request]
    (-> this (.approveAssignment approve-assignment-request))))

(defn reject-assignment
  "The RejectAssignment operation rejects the results of a completed assignment.


   You can include an optional feedback message with the rejection, which the Worker can see in the Status section
   of the web site. When you include a feedback message with the rejection, it helps the Worker understand why the
   assignment was rejected, and can improve the quality of the results the Worker submits in the future.


   Only the Requester who created the HIT can reject an assignment for the HIT.

  reject-assignment-request - `com.amazonaws.services.mturk.model.RejectAssignmentRequest`

  returns: Result of the RejectAssignment operation returned by the service. - `com.amazonaws.services.mturk.model.RejectAssignmentResult`

  throws: com.amazonaws.services.mturk.model.ServiceException - Amazon Mechanical Turk is temporarily unable to process your request. Try your call again."
  (^com.amazonaws.services.mturk.model.RejectAssignmentResult [^AmazonMTurk this ^com.amazonaws.services.mturk.model.RejectAssignmentRequest reject-assignment-request]
    (-> this (.rejectAssignment reject-assignment-request))))

(defn list-hi-ts-for-qualification-type
  "The ListHITsForQualificationType operation returns the HITs that use the given Qualification type
   for a Qualification requirement. The operation returns HITs of any status, except for HITs that have been deleted
   with the DeleteHIT operation or that have been auto-deleted.

  list-hi-ts-for-qualification-type-request - `com.amazonaws.services.mturk.model.ListHITsForQualificationTypeRequest`

  returns: Result of the ListHITsForQualificationType operation returned by the service. - `com.amazonaws.services.mturk.model.ListHITsForQualificationTypeResult`

  throws: com.amazonaws.services.mturk.model.ServiceException - Amazon Mechanical Turk is temporarily unable to process your request. Try your call again."
  (^com.amazonaws.services.mturk.model.ListHITsForQualificationTypeResult [^AmazonMTurk this ^com.amazonaws.services.mturk.model.ListHITsForQualificationTypeRequest list-hi-ts-for-qualification-type-request]
    (-> this (.listHITsForQualificationType list-hi-ts-for-qualification-type-request))))

(defn list-qualification-requests
  "The ListQualificationRequests operation retrieves requests for Qualifications of a particular
   Qualification type. The owner of the Qualification type calls this operation to poll for pending requests, and
   accepts them using the AcceptQualification operation.

  list-qualification-requests-request - `com.amazonaws.services.mturk.model.ListQualificationRequestsRequest`

  returns: Result of the ListQualificationRequests operation returned by the service. - `com.amazonaws.services.mturk.model.ListQualificationRequestsResult`

  throws: com.amazonaws.services.mturk.model.ServiceException - Amazon Mechanical Turk is temporarily unable to process your request. Try your call again."
  (^com.amazonaws.services.mturk.model.ListQualificationRequestsResult [^AmazonMTurk this ^com.amazonaws.services.mturk.model.ListQualificationRequestsRequest list-qualification-requests-request]
    (-> this (.listQualificationRequests list-qualification-requests-request))))

(defn delete-worker-block
  "The DeleteWorkerBlock operation allows you to reinstate a blocked Worker to work on your HITs. This
   operation reverses the effects of the CreateWorkerBlock operation. You need the Worker ID to use this operation.
   If the Worker ID is missing or invalid, this operation fails and returns the message “WorkerId is invalid.” If
   the specified Worker is not blocked, this operation returns successfully.

  delete-worker-block-request - `com.amazonaws.services.mturk.model.DeleteWorkerBlockRequest`

  returns: Result of the DeleteWorkerBlock operation returned by the service. - `com.amazonaws.services.mturk.model.DeleteWorkerBlockResult`

  throws: com.amazonaws.services.mturk.model.ServiceException - Amazon Mechanical Turk is temporarily unable to process your request. Try your call again."
  (^com.amazonaws.services.mturk.model.DeleteWorkerBlockResult [^AmazonMTurk this ^com.amazonaws.services.mturk.model.DeleteWorkerBlockRequest delete-worker-block-request]
    (-> this (.deleteWorkerBlock delete-worker-block-request))))

