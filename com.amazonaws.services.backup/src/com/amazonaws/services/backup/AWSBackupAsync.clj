(ns com.amazonaws.services.backup.AWSBackupAsync
  "Interface for accessing AWS Backup asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSBackupAsync instead.


  AWS Backup

  AWS Backup is a unified backup service designed to protect AWS services and their associated data. AWS Backup
  simplifies the creation, migration, restoration, and deletion of backups, while also providing reporting and
  auditing."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.backup AWSBackupAsync]))

(defn untag-resource-async
  "Removes a set of key-value pairs from a recovery point, backup plan, or backup vault identified by an Amazon
   Resource Name (ARN)

  untag-resource-request - `com.amazonaws.services.backup.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn get-supported-resource-types-async
  "Returns the AWS resource types supported by AWS Backup.

  get-supported-resource-types-request - `com.amazonaws.services.backup.model.GetSupportedResourceTypesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSupportedResourceTypes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.GetSupportedResourceTypesResult>`"
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.GetSupportedResourceTypesRequest get-supported-resource-types-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSupportedResourceTypesAsync get-supported-resource-types-request async-handler)))
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.GetSupportedResourceTypesRequest get-supported-resource-types-request]
    (-> this (.getSupportedResourceTypesAsync get-supported-resource-types-request))))

(defn list-backup-jobs-async
  "Returns metadata about your backup jobs.

  list-backup-jobs-request - `com.amazonaws.services.backup.model.ListBackupJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBackupJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.ListBackupJobsResult>`"
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.ListBackupJobsRequest list-backup-jobs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBackupJobsAsync list-backup-jobs-request async-handler)))
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.ListBackupJobsRequest list-backup-jobs-request]
    (-> this (.listBackupJobsAsync list-backup-jobs-request))))

(defn describe-backup-vault-async
  "Returns metadata about a backup vault specified by its name.

  describe-backup-vault-request - `com.amazonaws.services.backup.model.DescribeBackupVaultRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeBackupVault operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.DescribeBackupVaultResult>`"
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.DescribeBackupVaultRequest describe-backup-vault-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeBackupVaultAsync describe-backup-vault-request async-handler)))
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.DescribeBackupVaultRequest describe-backup-vault-request]
    (-> this (.describeBackupVaultAsync describe-backup-vault-request))))

(defn get-recovery-point-restore-metadata-async
  "Returns two sets of metadata key-value pairs. The first set lists the metadata that the recovery point was
   created with. The second set lists the metadata key-value pairs that are required to restore the recovery point.


   These sets can be the same, or the restore metadata set can contain different values if the target service to be
   restored has changed since the recovery point was created and now requires additional or different information in
   order to be restored.

  get-recovery-point-restore-metadata-request - `com.amazonaws.services.backup.model.GetRecoveryPointRestoreMetadataRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRecoveryPointRestoreMetadata operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.GetRecoveryPointRestoreMetadataResult>`"
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.GetRecoveryPointRestoreMetadataRequest get-recovery-point-restore-metadata-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRecoveryPointRestoreMetadataAsync get-recovery-point-restore-metadata-request async-handler)))
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.GetRecoveryPointRestoreMetadataRequest get-recovery-point-restore-metadata-request]
    (-> this (.getRecoveryPointRestoreMetadataAsync get-recovery-point-restore-metadata-request))))

(defn get-backup-selection-async
  "Returns selection metadata and a document in JSON format that specifies a list of resources that are associated
   with a backup plan.

  get-backup-selection-request - `com.amazonaws.services.backup.model.GetBackupSelectionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBackupSelection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.GetBackupSelectionResult>`"
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.GetBackupSelectionRequest get-backup-selection-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBackupSelectionAsync get-backup-selection-request async-handler)))
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.GetBackupSelectionRequest get-backup-selection-request]
    (-> this (.getBackupSelectionAsync get-backup-selection-request))))

(defn update-backup-plan-async
  "Replaces the body of a saved backup plan identified by its backupPlanId with the input document in
   JSON format. The new version is uniquely identified by a VersionId.

  update-backup-plan-request - `com.amazonaws.services.backup.model.UpdateBackupPlanRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateBackupPlan operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.UpdateBackupPlanResult>`"
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.UpdateBackupPlanRequest update-backup-plan-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateBackupPlanAsync update-backup-plan-request async-handler)))
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.UpdateBackupPlanRequest update-backup-plan-request]
    (-> this (.updateBackupPlanAsync update-backup-plan-request))))

(defn list-backup-plan-templates-async
  "Returns metadata of your saved backup plan templates, including the template ID, name, and the creation and
   deletion dates.

  list-backup-plan-templates-request - `com.amazonaws.services.backup.model.ListBackupPlanTemplatesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBackupPlanTemplates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.ListBackupPlanTemplatesResult>`"
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.ListBackupPlanTemplatesRequest list-backup-plan-templates-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBackupPlanTemplatesAsync list-backup-plan-templates-request async-handler)))
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.ListBackupPlanTemplatesRequest list-backup-plan-templates-request]
    (-> this (.listBackupPlanTemplatesAsync list-backup-plan-templates-request))))

(defn get-backup-plan-from-template-async
  "Returns the template specified by its templateId as a backup plan.

  get-backup-plan-from-template-request - `com.amazonaws.services.backup.model.GetBackupPlanFromTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBackupPlanFromTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.GetBackupPlanFromTemplateResult>`"
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.GetBackupPlanFromTemplateRequest get-backup-plan-from-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBackupPlanFromTemplateAsync get-backup-plan-from-template-request async-handler)))
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.GetBackupPlanFromTemplateRequest get-backup-plan-from-template-request]
    (-> this (.getBackupPlanFromTemplateAsync get-backup-plan-from-template-request))))

(defn list-tags-async
  "Returns a list of key-value pairs assigned to a target recovery point, backup plan, or backup vault.

  list-tags-request - `com.amazonaws.services.backup.model.ListTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.ListTagsResult>`"
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.ListTagsRequest list-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsAsync list-tags-request async-handler)))
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.ListTagsRequest list-tags-request]
    (-> this (.listTagsAsync list-tags-request))))

(defn describe-protected-resource-async
  "Returns information about a saved resource, including the last time it was backed-up, its Amazon Resource Name
   (ARN), and the AWS service type of the saved resource.

  describe-protected-resource-request - `com.amazonaws.services.backup.model.DescribeProtectedResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeProtectedResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.DescribeProtectedResourceResult>`"
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.DescribeProtectedResourceRequest describe-protected-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeProtectedResourceAsync describe-protected-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.DescribeProtectedResourceRequest describe-protected-resource-request]
    (-> this (.describeProtectedResourceAsync describe-protected-resource-request))))

(defn describe-backup-job-async
  "Returns metadata associated with creating a backup of a resource.

  describe-backup-job-request - `com.amazonaws.services.backup.model.DescribeBackupJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeBackupJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.DescribeBackupJobResult>`"
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.DescribeBackupJobRequest describe-backup-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeBackupJobAsync describe-backup-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.DescribeBackupJobRequest describe-backup-job-request]
    (-> this (.describeBackupJobAsync describe-backup-job-request))))

(defn delete-backup-vault-notifications-async
  "Deletes event notifications for the specified backup vault.

  delete-backup-vault-notifications-request - `com.amazonaws.services.backup.model.DeleteBackupVaultNotificationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBackupVaultNotifications operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.DeleteBackupVaultNotificationsResult>`"
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.DeleteBackupVaultNotificationsRequest delete-backup-vault-notifications-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBackupVaultNotificationsAsync delete-backup-vault-notifications-request async-handler)))
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.DeleteBackupVaultNotificationsRequest delete-backup-vault-notifications-request]
    (-> this (.deleteBackupVaultNotificationsAsync delete-backup-vault-notifications-request))))

(defn export-backup-plan-template-async
  "Returns the backup plan that is specified by the plan ID as a backup template.

  export-backup-plan-template-request - `com.amazonaws.services.backup.model.ExportBackupPlanTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ExportBackupPlanTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.ExportBackupPlanTemplateResult>`"
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.ExportBackupPlanTemplateRequest export-backup-plan-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.exportBackupPlanTemplateAsync export-backup-plan-template-request async-handler)))
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.ExportBackupPlanTemplateRequest export-backup-plan-template-request]
    (-> this (.exportBackupPlanTemplateAsync export-backup-plan-template-request))))

(defn list-recovery-points-by-resource-async
  "Returns detailed information about recovery points of the type specified by a resource Amazon Resource Name
   (ARN).

  list-recovery-points-by-resource-request - `com.amazonaws.services.backup.model.ListRecoveryPointsByResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRecoveryPointsByResource operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.ListRecoveryPointsByResourceResult>`"
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.ListRecoveryPointsByResourceRequest list-recovery-points-by-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRecoveryPointsByResourceAsync list-recovery-points-by-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.ListRecoveryPointsByResourceRequest list-recovery-points-by-resource-request]
    (-> this (.listRecoveryPointsByResourceAsync list-recovery-points-by-resource-request))))

(defn start-restore-job-async
  "Recovers the saved resource identified by an Amazon Resource Name (ARN).


   If the resource ARN is included in the request, then the last complete backup of that resource is recovered. If
   the ARN of a recovery point is supplied, then that recovery point is restored.

  start-restore-job-request - `com.amazonaws.services.backup.model.StartRestoreJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartRestoreJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.StartRestoreJobResult>`"
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.StartRestoreJobRequest start-restore-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startRestoreJobAsync start-restore-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.StartRestoreJobRequest start-restore-job-request]
    (-> this (.startRestoreJobAsync start-restore-job-request))))

(defn list-backup-plans-async
  "Returns metadata of your saved backup plans, including Amazon Resource Names (ARNs), plan IDs, creation and
   deletion dates, version IDs, plan names, and creator request IDs.

  list-backup-plans-request - `com.amazonaws.services.backup.model.ListBackupPlansRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBackupPlans operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.ListBackupPlansResult>`"
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.ListBackupPlansRequest list-backup-plans-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBackupPlansAsync list-backup-plans-request async-handler)))
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.ListBackupPlansRequest list-backup-plans-request]
    (-> this (.listBackupPlansAsync list-backup-plans-request))))

(defn get-backup-plan-from-json-async
  "Returns a valid JSON document specifying a backup plan or an error.

  get-backup-plan-from-json-request - `com.amazonaws.services.backup.model.GetBackupPlanFromJSONRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBackupPlanFromJSON operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.GetBackupPlanFromJSONResult>`"
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.GetBackupPlanFromJSONRequest get-backup-plan-from-json-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBackupPlanFromJSONAsync get-backup-plan-from-json-request async-handler)))
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.GetBackupPlanFromJSONRequest get-backup-plan-from-json-request]
    (-> this (.getBackupPlanFromJSONAsync get-backup-plan-from-json-request))))

(defn update-recovery-point-lifecycle-async
  "Sets the transition lifecycle of a recovery point.


   The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup
   transitions and expires backups automatically according to the lifecycle that you define.


   Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the
   “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The
   “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold.

  update-recovery-point-lifecycle-request - `com.amazonaws.services.backup.model.UpdateRecoveryPointLifecycleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRecoveryPointLifecycle operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.UpdateRecoveryPointLifecycleResult>`"
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.UpdateRecoveryPointLifecycleRequest update-recovery-point-lifecycle-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRecoveryPointLifecycleAsync update-recovery-point-lifecycle-request async-handler)))
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.UpdateRecoveryPointLifecycleRequest update-recovery-point-lifecycle-request]
    (-> this (.updateRecoveryPointLifecycleAsync update-recovery-point-lifecycle-request))))

(defn put-backup-vault-notifications-async
  "Turns on notifications on a backup vault for the specified topic and events.

  put-backup-vault-notifications-request - `com.amazonaws.services.backup.model.PutBackupVaultNotificationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutBackupVaultNotifications operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.PutBackupVaultNotificationsResult>`"
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.PutBackupVaultNotificationsRequest put-backup-vault-notifications-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putBackupVaultNotificationsAsync put-backup-vault-notifications-request async-handler)))
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.PutBackupVaultNotificationsRequest put-backup-vault-notifications-request]
    (-> this (.putBackupVaultNotificationsAsync put-backup-vault-notifications-request))))

(defn get-backup-plan-async
  "Returns the body of a backup plan in JSON format, in addition to plan metadata.

  get-backup-plan-request - `com.amazonaws.services.backup.model.GetBackupPlanRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBackupPlan operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.GetBackupPlanResult>`"
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.GetBackupPlanRequest get-backup-plan-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBackupPlanAsync get-backup-plan-request async-handler)))
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.GetBackupPlanRequest get-backup-plan-request]
    (-> this (.getBackupPlanAsync get-backup-plan-request))))

(defn get-backup-vault-notifications-async
  "Returns event notifications for the specified backup vault.

  get-backup-vault-notifications-request - `com.amazonaws.services.backup.model.GetBackupVaultNotificationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBackupVaultNotifications operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.GetBackupVaultNotificationsResult>`"
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.GetBackupVaultNotificationsRequest get-backup-vault-notifications-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBackupVaultNotificationsAsync get-backup-vault-notifications-request async-handler)))
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.GetBackupVaultNotificationsRequest get-backup-vault-notifications-request]
    (-> this (.getBackupVaultNotificationsAsync get-backup-vault-notifications-request))))

(defn list-restore-jobs-async
  "Returns a list of jobs that AWS Backup initiated to restore a saved resource, including metadata about the
   recovery process.

  list-restore-jobs-request - `com.amazonaws.services.backup.model.ListRestoreJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRestoreJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.ListRestoreJobsResult>`"
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.ListRestoreJobsRequest list-restore-jobs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRestoreJobsAsync list-restore-jobs-request async-handler)))
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.ListRestoreJobsRequest list-restore-jobs-request]
    (-> this (.listRestoreJobsAsync list-restore-jobs-request))))

(defn start-backup-job-async
  "Starts a job to create a one-time backup of the specified resource.

  start-backup-job-request - `com.amazonaws.services.backup.model.StartBackupJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartBackupJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.StartBackupJobResult>`"
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.StartBackupJobRequest start-backup-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startBackupJobAsync start-backup-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.StartBackupJobRequest start-backup-job-request]
    (-> this (.startBackupJobAsync start-backup-job-request))))

(defn create-backup-selection-async
  "Creates a JSON document that specifies a set of resources to assign to a backup plan. Resources can be included
   by specifying patterns for a ListOfTags and selected Resources.


   For example, consider the following patterns:




   Resources: \"arn:aws:ec2:region:account-id:volume/volume-id\"




   ConditionKey:\"department\"


   ConditionValue:\"finance\"


   ConditionType:\"StringEquals\"




   ConditionKey:\"importance\"


   ConditionValue:\"critical\"


   ConditionType:\"StringEquals\"




   Using these patterns would back up all Amazon Elastic Block Store (Amazon EBS) volumes that are tagged as
   \"department=finance\", \"importance=critical\", in addition to an EBS volume with the
   specified volume Id.


   Resources and conditions are additive in that all resources that match the pattern are selected. This shouldn't
   be confused with a logical AND, where all conditions must match. The matching patterns are logically 'put
   together using the OR operator. In other words, all patterns that match are selected for backup.

  create-backup-selection-request - `com.amazonaws.services.backup.model.CreateBackupSelectionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateBackupSelection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.CreateBackupSelectionResult>`"
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.CreateBackupSelectionRequest create-backup-selection-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createBackupSelectionAsync create-backup-selection-request async-handler)))
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.CreateBackupSelectionRequest create-backup-selection-request]
    (-> this (.createBackupSelectionAsync create-backup-selection-request))))

(defn create-backup-vault-async
  "Creates a logical container where backups are stored. A CreateBackupVault request includes a name,
   optionally one or more resource tags, an encryption key, and a request ID.



   Sensitive data, such as passport numbers, should not be included the name of a backup vault.

  create-backup-vault-request - `com.amazonaws.services.backup.model.CreateBackupVaultRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateBackupVault operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.CreateBackupVaultResult>`"
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.CreateBackupVaultRequest create-backup-vault-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createBackupVaultAsync create-backup-vault-request async-handler)))
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.CreateBackupVaultRequest create-backup-vault-request]
    (-> this (.createBackupVaultAsync create-backup-vault-request))))

(defn describe-recovery-point-async
  "Returns metadata associated with a recovery point, including ID, status, encryption, and lifecycle.

  describe-recovery-point-request - `com.amazonaws.services.backup.model.DescribeRecoveryPointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRecoveryPoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.DescribeRecoveryPointResult>`"
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.DescribeRecoveryPointRequest describe-recovery-point-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRecoveryPointAsync describe-recovery-point-request async-handler)))
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.DescribeRecoveryPointRequest describe-recovery-point-request]
    (-> this (.describeRecoveryPointAsync describe-recovery-point-request))))

(defn delete-backup-selection-async
  "Deletes the resource selection associated with a backup plan that is specified by the SelectionId.

  delete-backup-selection-request - `com.amazonaws.services.backup.model.DeleteBackupSelectionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBackupSelection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.DeleteBackupSelectionResult>`"
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.DeleteBackupSelectionRequest delete-backup-selection-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBackupSelectionAsync delete-backup-selection-request async-handler)))
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.DeleteBackupSelectionRequest delete-backup-selection-request]
    (-> this (.deleteBackupSelectionAsync delete-backup-selection-request))))

(defn delete-backup-vault-access-policy-async
  "Deletes the policy document that manages permissions on a backup vault.

  delete-backup-vault-access-policy-request - `com.amazonaws.services.backup.model.DeleteBackupVaultAccessPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBackupVaultAccessPolicy operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.DeleteBackupVaultAccessPolicyResult>`"
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.DeleteBackupVaultAccessPolicyRequest delete-backup-vault-access-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBackupVaultAccessPolicyAsync delete-backup-vault-access-policy-request async-handler)))
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.DeleteBackupVaultAccessPolicyRequest delete-backup-vault-access-policy-request]
    (-> this (.deleteBackupVaultAccessPolicyAsync delete-backup-vault-access-policy-request))))

(defn delete-backup-vault-async
  "Deletes the backup vault identified by its name. A vault can be deleted only if it is empty.

  delete-backup-vault-request - `com.amazonaws.services.backup.model.DeleteBackupVaultRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBackupVault operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.DeleteBackupVaultResult>`"
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.DeleteBackupVaultRequest delete-backup-vault-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBackupVaultAsync delete-backup-vault-request async-handler)))
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.DeleteBackupVaultRequest delete-backup-vault-request]
    (-> this (.deleteBackupVaultAsync delete-backup-vault-request))))

(defn list-protected-resources-async
  "Returns an array of resources successfully backed up by AWS Backup, including the time the resource was saved, an
   Amazon Resource Name (ARN) of the resource, and a resource type.

  list-protected-resources-request - `com.amazonaws.services.backup.model.ListProtectedResourcesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListProtectedResources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.ListProtectedResourcesResult>`"
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.ListProtectedResourcesRequest list-protected-resources-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listProtectedResourcesAsync list-protected-resources-request async-handler)))
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.ListProtectedResourcesRequest list-protected-resources-request]
    (-> this (.listProtectedResourcesAsync list-protected-resources-request))))

(defn describe-restore-job-async
  "Returns metadata associated with a restore job that is specified by a job ID.

  describe-restore-job-request - `com.amazonaws.services.backup.model.DescribeRestoreJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRestoreJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.DescribeRestoreJobResult>`"
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.DescribeRestoreJobRequest describe-restore-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRestoreJobAsync describe-restore-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.DescribeRestoreJobRequest describe-restore-job-request]
    (-> this (.describeRestoreJobAsync describe-restore-job-request))))

(defn list-backup-vaults-async
  "Returns a list of recovery point storage containers along with information about them.

  list-backup-vaults-request - `com.amazonaws.services.backup.model.ListBackupVaultsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBackupVaults operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.ListBackupVaultsResult>`"
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.ListBackupVaultsRequest list-backup-vaults-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBackupVaultsAsync list-backup-vaults-request async-handler)))
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.ListBackupVaultsRequest list-backup-vaults-request]
    (-> this (.listBackupVaultsAsync list-backup-vaults-request))))

(defn list-backup-selections-async
  "Returns an array containing metadata of the resources associated with the target backup plan.

  list-backup-selections-request - `com.amazonaws.services.backup.model.ListBackupSelectionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBackupSelections operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.ListBackupSelectionsResult>`"
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.ListBackupSelectionsRequest list-backup-selections-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBackupSelectionsAsync list-backup-selections-request async-handler)))
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.ListBackupSelectionsRequest list-backup-selections-request]
    (-> this (.listBackupSelectionsAsync list-backup-selections-request))))

(defn delete-recovery-point-async
  "Deletes the recovery point specified by a recovery point ID.

  delete-recovery-point-request - `com.amazonaws.services.backup.model.DeleteRecoveryPointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRecoveryPoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.DeleteRecoveryPointResult>`"
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.DeleteRecoveryPointRequest delete-recovery-point-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRecoveryPointAsync delete-recovery-point-request async-handler)))
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.DeleteRecoveryPointRequest delete-recovery-point-request]
    (-> this (.deleteRecoveryPointAsync delete-recovery-point-request))))

(defn create-backup-plan-async
  "Backup plans are documents that contain information that AWS Backup uses to schedule tasks that create recovery
   points of resources.


   If you call CreateBackupPlan with a plan that already exists, the existing backupPlanId
   is returned.

  create-backup-plan-request - `com.amazonaws.services.backup.model.CreateBackupPlanRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateBackupPlan operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.CreateBackupPlanResult>`"
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.CreateBackupPlanRequest create-backup-plan-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createBackupPlanAsync create-backup-plan-request async-handler)))
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.CreateBackupPlanRequest create-backup-plan-request]
    (-> this (.createBackupPlanAsync create-backup-plan-request))))

(defn get-backup-vault-access-policy-async
  "Returns the access policy document that is associated with the named backup vault.

  get-backup-vault-access-policy-request - `com.amazonaws.services.backup.model.GetBackupVaultAccessPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBackupVaultAccessPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.GetBackupVaultAccessPolicyResult>`"
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.GetBackupVaultAccessPolicyRequest get-backup-vault-access-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBackupVaultAccessPolicyAsync get-backup-vault-access-policy-request async-handler)))
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.GetBackupVaultAccessPolicyRequest get-backup-vault-access-policy-request]
    (-> this (.getBackupVaultAccessPolicyAsync get-backup-vault-access-policy-request))))

(defn list-recovery-points-by-backup-vault-async
  "Returns detailed information about the recovery points stored in a backup vault.

  list-recovery-points-by-backup-vault-request - `com.amazonaws.services.backup.model.ListRecoveryPointsByBackupVaultRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRecoveryPointsByBackupVault operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.ListRecoveryPointsByBackupVaultResult>`"
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.ListRecoveryPointsByBackupVaultRequest list-recovery-points-by-backup-vault-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRecoveryPointsByBackupVaultAsync list-recovery-points-by-backup-vault-request async-handler)))
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.ListRecoveryPointsByBackupVaultRequest list-recovery-points-by-backup-vault-request]
    (-> this (.listRecoveryPointsByBackupVaultAsync list-recovery-points-by-backup-vault-request))))

(defn tag-resource-async
  "Assigns a set of key-value pairs to a recovery point, backup plan, or backup vault identified by an Amazon
   Resource Name (ARN).

  tag-resource-request - `com.amazonaws.services.backup.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn delete-backup-plan-async
  "Deletes a backup plan. A backup plan can only be deleted after all associated selections of resources have been
   deleted. Deleting a backup plan deletes the current version of a backup plan. Previous versions, if any, will
   still exist.

  delete-backup-plan-request - `com.amazonaws.services.backup.model.DeleteBackupPlanRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBackupPlan operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.DeleteBackupPlanResult>`"
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.DeleteBackupPlanRequest delete-backup-plan-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBackupPlanAsync delete-backup-plan-request async-handler)))
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.DeleteBackupPlanRequest delete-backup-plan-request]
    (-> this (.deleteBackupPlanAsync delete-backup-plan-request))))

(defn list-backup-plan-versions-async
  "Returns version metadata of your backup plans, including Amazon Resource Names (ARNs), backup plan IDs, creation
   and deletion dates, plan names, and version IDs.

  list-backup-plan-versions-request - `com.amazonaws.services.backup.model.ListBackupPlanVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBackupPlanVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.ListBackupPlanVersionsResult>`"
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.ListBackupPlanVersionsRequest list-backup-plan-versions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBackupPlanVersionsAsync list-backup-plan-versions-request async-handler)))
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.ListBackupPlanVersionsRequest list-backup-plan-versions-request]
    (-> this (.listBackupPlanVersionsAsync list-backup-plan-versions-request))))

(defn put-backup-vault-access-policy-async
  "Sets a resource-based policy that is used to manage access permissions on the target backup vault. Requires a
   backup vault name and an access policy document in JSON format.

  put-backup-vault-access-policy-request - `com.amazonaws.services.backup.model.PutBackupVaultAccessPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutBackupVaultAccessPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.PutBackupVaultAccessPolicyResult>`"
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.PutBackupVaultAccessPolicyRequest put-backup-vault-access-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putBackupVaultAccessPolicyAsync put-backup-vault-access-policy-request async-handler)))
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.PutBackupVaultAccessPolicyRequest put-backup-vault-access-policy-request]
    (-> this (.putBackupVaultAccessPolicyAsync put-backup-vault-access-policy-request))))

(defn stop-backup-job-async
  "Attempts to cancel a job to create a one-time backup of a resource.

  stop-backup-job-request - `com.amazonaws.services.backup.model.StopBackupJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopBackupJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.StopBackupJobResult>`"
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.StopBackupJobRequest stop-backup-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopBackupJobAsync stop-backup-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSBackupAsync this ^com.amazonaws.services.backup.model.StopBackupJobRequest stop-backup-job-request]
    (-> this (.stopBackupJobAsync stop-backup-job-request))))

