(ns com.amazonaws.services.backup.AbstractAWSBackupAsync
  "Abstract implementation of AWSBackupAsync. Convenient method forms pass through to the corresponding overload
  that takes a request object and an AsyncHandler, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.backup AbstractAWSBackupAsync]))

(defn untag-resource-async
  "Description copied from interface: AWSBackupAsync

  request - `com.amazonaws.services.backup.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn get-supported-resource-types-async
  "Description copied from interface: AWSBackupAsync

  request - `com.amazonaws.services.backup.model.GetSupportedResourceTypesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSupportedResourceTypes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.GetSupportedResourceTypesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.GetSupportedResourceTypesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSupportedResourceTypesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.GetSupportedResourceTypesRequest request]
    (-> this (.getSupportedResourceTypesAsync request))))

(defn list-backup-jobs-async
  "Description copied from interface: AWSBackupAsync

  request - `com.amazonaws.services.backup.model.ListBackupJobsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBackupJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.ListBackupJobsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.ListBackupJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBackupJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.ListBackupJobsRequest request]
    (-> this (.listBackupJobsAsync request))))

(defn describe-backup-vault-async
  "Description copied from interface: AWSBackupAsync

  request - `com.amazonaws.services.backup.model.DescribeBackupVaultRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeBackupVault operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.DescribeBackupVaultResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.DescribeBackupVaultRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeBackupVaultAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.DescribeBackupVaultRequest request]
    (-> this (.describeBackupVaultAsync request))))

(defn get-recovery-point-restore-metadata-async
  "Description copied from interface: AWSBackupAsync

  request - `com.amazonaws.services.backup.model.GetRecoveryPointRestoreMetadataRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRecoveryPointRestoreMetadata operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.GetRecoveryPointRestoreMetadataResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.GetRecoveryPointRestoreMetadataRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRecoveryPointRestoreMetadataAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.GetRecoveryPointRestoreMetadataRequest request]
    (-> this (.getRecoveryPointRestoreMetadataAsync request))))

(defn get-backup-selection-async
  "Description copied from interface: AWSBackupAsync

  request - `com.amazonaws.services.backup.model.GetBackupSelectionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBackupSelection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.GetBackupSelectionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.GetBackupSelectionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBackupSelectionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.GetBackupSelectionRequest request]
    (-> this (.getBackupSelectionAsync request))))

(defn update-backup-plan-async
  "Description copied from interface: AWSBackupAsync

  request - `com.amazonaws.services.backup.model.UpdateBackupPlanRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateBackupPlan operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.UpdateBackupPlanResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.UpdateBackupPlanRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateBackupPlanAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.UpdateBackupPlanRequest request]
    (-> this (.updateBackupPlanAsync request))))

(defn list-backup-plan-templates-async
  "Description copied from interface: AWSBackupAsync

  request - `com.amazonaws.services.backup.model.ListBackupPlanTemplatesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBackupPlanTemplates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.ListBackupPlanTemplatesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.ListBackupPlanTemplatesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBackupPlanTemplatesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.ListBackupPlanTemplatesRequest request]
    (-> this (.listBackupPlanTemplatesAsync request))))

(defn get-backup-plan-from-template-async
  "Description copied from interface: AWSBackupAsync

  request - `com.amazonaws.services.backup.model.GetBackupPlanFromTemplateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBackupPlanFromTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.GetBackupPlanFromTemplateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.GetBackupPlanFromTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBackupPlanFromTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.GetBackupPlanFromTemplateRequest request]
    (-> this (.getBackupPlanFromTemplateAsync request))))

(defn list-tags-async
  "Description copied from interface: AWSBackupAsync

  request - `com.amazonaws.services.backup.model.ListTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.ListTagsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.ListTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.ListTagsRequest request]
    (-> this (.listTagsAsync request))))

(defn describe-protected-resource-async
  "Description copied from interface: AWSBackupAsync

  request - `com.amazonaws.services.backup.model.DescribeProtectedResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeProtectedResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.DescribeProtectedResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.DescribeProtectedResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeProtectedResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.DescribeProtectedResourceRequest request]
    (-> this (.describeProtectedResourceAsync request))))

(defn describe-backup-job-async
  "Description copied from interface: AWSBackupAsync

  request - `com.amazonaws.services.backup.model.DescribeBackupJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeBackupJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.DescribeBackupJobResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.DescribeBackupJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeBackupJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.DescribeBackupJobRequest request]
    (-> this (.describeBackupJobAsync request))))

(defn delete-backup-vault-notifications-async
  "Description copied from interface: AWSBackupAsync

  request - `com.amazonaws.services.backup.model.DeleteBackupVaultNotificationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBackupVaultNotifications operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.DeleteBackupVaultNotificationsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.DeleteBackupVaultNotificationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBackupVaultNotificationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.DeleteBackupVaultNotificationsRequest request]
    (-> this (.deleteBackupVaultNotificationsAsync request))))

(defn export-backup-plan-template-async
  "Description copied from interface: AWSBackupAsync

  request - `com.amazonaws.services.backup.model.ExportBackupPlanTemplateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ExportBackupPlanTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.ExportBackupPlanTemplateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.ExportBackupPlanTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.exportBackupPlanTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.ExportBackupPlanTemplateRequest request]
    (-> this (.exportBackupPlanTemplateAsync request))))

(defn list-recovery-points-by-resource-async
  "Description copied from interface: AWSBackupAsync

  request - `com.amazonaws.services.backup.model.ListRecoveryPointsByResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRecoveryPointsByResource operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.ListRecoveryPointsByResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.ListRecoveryPointsByResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRecoveryPointsByResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.ListRecoveryPointsByResourceRequest request]
    (-> this (.listRecoveryPointsByResourceAsync request))))

(defn start-restore-job-async
  "Description copied from interface: AWSBackupAsync

  request - `com.amazonaws.services.backup.model.StartRestoreJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartRestoreJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.StartRestoreJobResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.StartRestoreJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startRestoreJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.StartRestoreJobRequest request]
    (-> this (.startRestoreJobAsync request))))

(defn list-backup-plans-async
  "Description copied from interface: AWSBackupAsync

  request - `com.amazonaws.services.backup.model.ListBackupPlansRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBackupPlans operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.ListBackupPlansResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.ListBackupPlansRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBackupPlansAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.ListBackupPlansRequest request]
    (-> this (.listBackupPlansAsync request))))

(defn get-backup-plan-from-json-async
  "Description copied from interface: AWSBackupAsync

  request - `com.amazonaws.services.backup.model.GetBackupPlanFromJSONRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBackupPlanFromJSON operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.GetBackupPlanFromJSONResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.GetBackupPlanFromJSONRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBackupPlanFromJSONAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.GetBackupPlanFromJSONRequest request]
    (-> this (.getBackupPlanFromJSONAsync request))))

(defn update-recovery-point-lifecycle-async
  "Description copied from interface: AWSBackupAsync

  request - `com.amazonaws.services.backup.model.UpdateRecoveryPointLifecycleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRecoveryPointLifecycle operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.UpdateRecoveryPointLifecycleResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.UpdateRecoveryPointLifecycleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRecoveryPointLifecycleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.UpdateRecoveryPointLifecycleRequest request]
    (-> this (.updateRecoveryPointLifecycleAsync request))))

(defn put-backup-vault-notifications-async
  "Description copied from interface: AWSBackupAsync

  request - `com.amazonaws.services.backup.model.PutBackupVaultNotificationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutBackupVaultNotifications operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.PutBackupVaultNotificationsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.PutBackupVaultNotificationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putBackupVaultNotificationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.PutBackupVaultNotificationsRequest request]
    (-> this (.putBackupVaultNotificationsAsync request))))

(defn get-backup-plan-async
  "Description copied from interface: AWSBackupAsync

  request - `com.amazonaws.services.backup.model.GetBackupPlanRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBackupPlan operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.GetBackupPlanResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.GetBackupPlanRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBackupPlanAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.GetBackupPlanRequest request]
    (-> this (.getBackupPlanAsync request))))

(defn get-backup-vault-notifications-async
  "Description copied from interface: AWSBackupAsync

  request - `com.amazonaws.services.backup.model.GetBackupVaultNotificationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBackupVaultNotifications operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.GetBackupVaultNotificationsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.GetBackupVaultNotificationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBackupVaultNotificationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.GetBackupVaultNotificationsRequest request]
    (-> this (.getBackupVaultNotificationsAsync request))))

(defn list-restore-jobs-async
  "Description copied from interface: AWSBackupAsync

  request - `com.amazonaws.services.backup.model.ListRestoreJobsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRestoreJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.ListRestoreJobsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.ListRestoreJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRestoreJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.ListRestoreJobsRequest request]
    (-> this (.listRestoreJobsAsync request))))

(defn start-backup-job-async
  "Description copied from interface: AWSBackupAsync

  request - `com.amazonaws.services.backup.model.StartBackupJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartBackupJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.StartBackupJobResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.StartBackupJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startBackupJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.StartBackupJobRequest request]
    (-> this (.startBackupJobAsync request))))

(defn create-backup-selection-async
  "Description copied from interface: AWSBackupAsync

  request - `com.amazonaws.services.backup.model.CreateBackupSelectionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateBackupSelection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.CreateBackupSelectionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.CreateBackupSelectionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createBackupSelectionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.CreateBackupSelectionRequest request]
    (-> this (.createBackupSelectionAsync request))))

(defn create-backup-vault-async
  "Description copied from interface: AWSBackupAsync

  request - `com.amazonaws.services.backup.model.CreateBackupVaultRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateBackupVault operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.CreateBackupVaultResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.CreateBackupVaultRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createBackupVaultAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.CreateBackupVaultRequest request]
    (-> this (.createBackupVaultAsync request))))

(defn describe-recovery-point-async
  "Description copied from interface: AWSBackupAsync

  request - `com.amazonaws.services.backup.model.DescribeRecoveryPointRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRecoveryPoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.DescribeRecoveryPointResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.DescribeRecoveryPointRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRecoveryPointAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.DescribeRecoveryPointRequest request]
    (-> this (.describeRecoveryPointAsync request))))

(defn delete-backup-selection-async
  "Description copied from interface: AWSBackupAsync

  request - `com.amazonaws.services.backup.model.DeleteBackupSelectionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBackupSelection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.DeleteBackupSelectionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.DeleteBackupSelectionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBackupSelectionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.DeleteBackupSelectionRequest request]
    (-> this (.deleteBackupSelectionAsync request))))

(defn delete-backup-vault-access-policy-async
  "Description copied from interface: AWSBackupAsync

  request - `com.amazonaws.services.backup.model.DeleteBackupVaultAccessPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBackupVaultAccessPolicy operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.DeleteBackupVaultAccessPolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.DeleteBackupVaultAccessPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBackupVaultAccessPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.DeleteBackupVaultAccessPolicyRequest request]
    (-> this (.deleteBackupVaultAccessPolicyAsync request))))

(defn delete-backup-vault-async
  "Description copied from interface: AWSBackupAsync

  request - `com.amazonaws.services.backup.model.DeleteBackupVaultRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBackupVault operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.DeleteBackupVaultResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.DeleteBackupVaultRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBackupVaultAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.DeleteBackupVaultRequest request]
    (-> this (.deleteBackupVaultAsync request))))

(defn list-protected-resources-async
  "Description copied from interface: AWSBackupAsync

  request - `com.amazonaws.services.backup.model.ListProtectedResourcesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListProtectedResources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.ListProtectedResourcesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.ListProtectedResourcesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listProtectedResourcesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.ListProtectedResourcesRequest request]
    (-> this (.listProtectedResourcesAsync request))))

(defn describe-restore-job-async
  "Description copied from interface: AWSBackupAsync

  request - `com.amazonaws.services.backup.model.DescribeRestoreJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRestoreJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.DescribeRestoreJobResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.DescribeRestoreJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRestoreJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.DescribeRestoreJobRequest request]
    (-> this (.describeRestoreJobAsync request))))

(defn list-backup-vaults-async
  "Description copied from interface: AWSBackupAsync

  request - `com.amazonaws.services.backup.model.ListBackupVaultsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBackupVaults operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.ListBackupVaultsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.ListBackupVaultsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBackupVaultsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.ListBackupVaultsRequest request]
    (-> this (.listBackupVaultsAsync request))))

(defn list-backup-selections-async
  "Description copied from interface: AWSBackupAsync

  request - `com.amazonaws.services.backup.model.ListBackupSelectionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBackupSelections operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.ListBackupSelectionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.ListBackupSelectionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBackupSelectionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.ListBackupSelectionsRequest request]
    (-> this (.listBackupSelectionsAsync request))))

(defn delete-recovery-point-async
  "Description copied from interface: AWSBackupAsync

  request - `com.amazonaws.services.backup.model.DeleteRecoveryPointRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRecoveryPoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.DeleteRecoveryPointResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.DeleteRecoveryPointRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRecoveryPointAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.DeleteRecoveryPointRequest request]
    (-> this (.deleteRecoveryPointAsync request))))

(defn create-backup-plan-async
  "Description copied from interface: AWSBackupAsync

  request - `com.amazonaws.services.backup.model.CreateBackupPlanRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateBackupPlan operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.CreateBackupPlanResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.CreateBackupPlanRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createBackupPlanAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.CreateBackupPlanRequest request]
    (-> this (.createBackupPlanAsync request))))

(defn get-backup-vault-access-policy-async
  "Description copied from interface: AWSBackupAsync

  request - `com.amazonaws.services.backup.model.GetBackupVaultAccessPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBackupVaultAccessPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.GetBackupVaultAccessPolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.GetBackupVaultAccessPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBackupVaultAccessPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.GetBackupVaultAccessPolicyRequest request]
    (-> this (.getBackupVaultAccessPolicyAsync request))))

(defn list-recovery-points-by-backup-vault-async
  "Description copied from interface: AWSBackupAsync

  request - `com.amazonaws.services.backup.model.ListRecoveryPointsByBackupVaultRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRecoveryPointsByBackupVault operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.ListRecoveryPointsByBackupVaultResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.ListRecoveryPointsByBackupVaultRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRecoveryPointsByBackupVaultAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.ListRecoveryPointsByBackupVaultRequest request]
    (-> this (.listRecoveryPointsByBackupVaultAsync request))))

(defn tag-resource-async
  "Description copied from interface: AWSBackupAsync

  request - `com.amazonaws.services.backup.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn delete-backup-plan-async
  "Description copied from interface: AWSBackupAsync

  request - `com.amazonaws.services.backup.model.DeleteBackupPlanRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBackupPlan operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.DeleteBackupPlanResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.DeleteBackupPlanRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBackupPlanAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.DeleteBackupPlanRequest request]
    (-> this (.deleteBackupPlanAsync request))))

(defn list-backup-plan-versions-async
  "Description copied from interface: AWSBackupAsync

  request - `com.amazonaws.services.backup.model.ListBackupPlanVersionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBackupPlanVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.ListBackupPlanVersionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.ListBackupPlanVersionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBackupPlanVersionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.ListBackupPlanVersionsRequest request]
    (-> this (.listBackupPlanVersionsAsync request))))

(defn put-backup-vault-access-policy-async
  "Description copied from interface: AWSBackupAsync

  request - `com.amazonaws.services.backup.model.PutBackupVaultAccessPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutBackupVaultAccessPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.PutBackupVaultAccessPolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.PutBackupVaultAccessPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putBackupVaultAccessPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.PutBackupVaultAccessPolicyRequest request]
    (-> this (.putBackupVaultAccessPolicyAsync request))))

(defn stop-backup-job-async
  "Description copied from interface: AWSBackupAsync

  request - `com.amazonaws.services.backup.model.StopBackupJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopBackupJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.backup.model.StopBackupJobResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.StopBackupJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopBackupJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBackupAsync this ^com.amazonaws.services.backup.model.StopBackupJobRequest request]
    (-> this (.stopBackupJobAsync request))))

