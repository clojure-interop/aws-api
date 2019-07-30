(ns com.amazonaws.services.backup.AbstractAWSBackup
  "Abstract implementation of AWSBackup. Convenient method forms pass through to the corresponding overload that
  takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.backup AbstractAWSBackup]))

(defn get-supported-resource-types
  "Description copied from interface: AWSBackup

  request - `com.amazonaws.services.backup.model.GetSupportedResourceTypesRequest`

  returns: Result of the GetSupportedResourceTypes operation returned by the service. - `com.amazonaws.services.backup.model.GetSupportedResourceTypesResult`"
  (^com.amazonaws.services.backup.model.GetSupportedResourceTypesResult [^AbstractAWSBackup this ^com.amazonaws.services.backup.model.GetSupportedResourceTypesRequest request]
    (-> this (.getSupportedResourceTypes request))))

(defn update-backup-plan
  "Description copied from interface: AWSBackup

  request - `com.amazonaws.services.backup.model.UpdateBackupPlanRequest`

  returns: Result of the UpdateBackupPlan operation returned by the service. - `com.amazonaws.services.backup.model.UpdateBackupPlanResult`"
  (^com.amazonaws.services.backup.model.UpdateBackupPlanResult [^AbstractAWSBackup this ^com.amazonaws.services.backup.model.UpdateBackupPlanRequest request]
    (-> this (.updateBackupPlan request))))

(defn list-backup-jobs
  "Description copied from interface: AWSBackup

  request - `com.amazonaws.services.backup.model.ListBackupJobsRequest`

  returns: Result of the ListBackupJobs operation returned by the service. - `com.amazonaws.services.backup.model.ListBackupJobsResult`"
  (^com.amazonaws.services.backup.model.ListBackupJobsResult [^AbstractAWSBackup this ^com.amazonaws.services.backup.model.ListBackupJobsRequest request]
    (-> this (.listBackupJobs request))))

(defn update-recovery-point-lifecycle
  "Description copied from interface: AWSBackup

  request - `com.amazonaws.services.backup.model.UpdateRecoveryPointLifecycleRequest`

  returns: Result of the UpdateRecoveryPointLifecycle operation returned by the service. - `com.amazonaws.services.backup.model.UpdateRecoveryPointLifecycleResult`"
  (^com.amazonaws.services.backup.model.UpdateRecoveryPointLifecycleResult [^AbstractAWSBackup this ^com.amazonaws.services.backup.model.UpdateRecoveryPointLifecycleRequest request]
    (-> this (.updateRecoveryPointLifecycle request))))

(defn put-backup-vault-notifications
  "Description copied from interface: AWSBackup

  request - `com.amazonaws.services.backup.model.PutBackupVaultNotificationsRequest`

  returns: Result of the PutBackupVaultNotifications operation returned by the service. - `com.amazonaws.services.backup.model.PutBackupVaultNotificationsResult`"
  (^com.amazonaws.services.backup.model.PutBackupVaultNotificationsResult [^AbstractAWSBackup this ^com.amazonaws.services.backup.model.PutBackupVaultNotificationsRequest request]
    (-> this (.putBackupVaultNotifications request))))

(defn get-backup-vault-access-policy
  "Description copied from interface: AWSBackup

  request - `com.amazonaws.services.backup.model.GetBackupVaultAccessPolicyRequest`

  returns: Result of the GetBackupVaultAccessPolicy operation returned by the service. - `com.amazonaws.services.backup.model.GetBackupVaultAccessPolicyResult`"
  (^com.amazonaws.services.backup.model.GetBackupVaultAccessPolicyResult [^AbstractAWSBackup this ^com.amazonaws.services.backup.model.GetBackupVaultAccessPolicyRequest request]
    (-> this (.getBackupVaultAccessPolicy request))))

(defn delete-backup-vault
  "Description copied from interface: AWSBackup

  request - `com.amazonaws.services.backup.model.DeleteBackupVaultRequest`

  returns: Result of the DeleteBackupVault operation returned by the service. - `com.amazonaws.services.backup.model.DeleteBackupVaultResult`"
  (^com.amazonaws.services.backup.model.DeleteBackupVaultResult [^AbstractAWSBackup this ^com.amazonaws.services.backup.model.DeleteBackupVaultRequest request]
    (-> this (.deleteBackupVault request))))

(defn list-backup-selections
  "Description copied from interface: AWSBackup

  request - `com.amazonaws.services.backup.model.ListBackupSelectionsRequest`

  returns: Result of the ListBackupSelections operation returned by the service. - `com.amazonaws.services.backup.model.ListBackupSelectionsResult`"
  (^com.amazonaws.services.backup.model.ListBackupSelectionsResult [^AbstractAWSBackup this ^com.amazonaws.services.backup.model.ListBackupSelectionsRequest request]
    (-> this (.listBackupSelections request))))

(defn start-restore-job
  "Description copied from interface: AWSBackup

  request - `com.amazonaws.services.backup.model.StartRestoreJobRequest`

  returns: Result of the StartRestoreJob operation returned by the service. - `com.amazonaws.services.backup.model.StartRestoreJobResult`"
  (^com.amazonaws.services.backup.model.StartRestoreJobResult [^AbstractAWSBackup this ^com.amazonaws.services.backup.model.StartRestoreJobRequest request]
    (-> this (.startRestoreJob request))))

(defn list-tags
  "Description copied from interface: AWSBackup

  request - `com.amazonaws.services.backup.model.ListTagsRequest`

  returns: Result of the ListTags operation returned by the service. - `com.amazonaws.services.backup.model.ListTagsResult`"
  (^com.amazonaws.services.backup.model.ListTagsResult [^AbstractAWSBackup this ^com.amazonaws.services.backup.model.ListTagsRequest request]
    (-> this (.listTags request))))

(defn list-backup-plan-templates
  "Description copied from interface: AWSBackup

  request - `com.amazonaws.services.backup.model.ListBackupPlanTemplatesRequest`

  returns: Result of the ListBackupPlanTemplates operation returned by the service. - `com.amazonaws.services.backup.model.ListBackupPlanTemplatesResult`"
  (^com.amazonaws.services.backup.model.ListBackupPlanTemplatesResult [^AbstractAWSBackup this ^com.amazonaws.services.backup.model.ListBackupPlanTemplatesRequest request]
    (-> this (.listBackupPlanTemplates request))))

(defn create-backup-plan
  "Description copied from interface: AWSBackup

  request - `com.amazonaws.services.backup.model.CreateBackupPlanRequest`

  returns: Result of the CreateBackupPlan operation returned by the service. - `com.amazonaws.services.backup.model.CreateBackupPlanResult`"
  (^com.amazonaws.services.backup.model.CreateBackupPlanResult [^AbstractAWSBackup this ^com.amazonaws.services.backup.model.CreateBackupPlanRequest request]
    (-> this (.createBackupPlan request))))

(defn export-backup-plan-template
  "Description copied from interface: AWSBackup

  request - `com.amazonaws.services.backup.model.ExportBackupPlanTemplateRequest`

  returns: Result of the ExportBackupPlanTemplate operation returned by the service. - `com.amazonaws.services.backup.model.ExportBackupPlanTemplateResult`"
  (^com.amazonaws.services.backup.model.ExportBackupPlanTemplateResult [^AbstractAWSBackup this ^com.amazonaws.services.backup.model.ExportBackupPlanTemplateRequest request]
    (-> this (.exportBackupPlanTemplate request))))

(defn delete-backup-vault-access-policy
  "Description copied from interface: AWSBackup

  request - `com.amazonaws.services.backup.model.DeleteBackupVaultAccessPolicyRequest`

  returns: Result of the DeleteBackupVaultAccessPolicy operation returned by the service. - `com.amazonaws.services.backup.model.DeleteBackupVaultAccessPolicyResult`"
  (^com.amazonaws.services.backup.model.DeleteBackupVaultAccessPolicyResult [^AbstractAWSBackup this ^com.amazonaws.services.backup.model.DeleteBackupVaultAccessPolicyRequest request]
    (-> this (.deleteBackupVaultAccessPolicy request))))

(defn delete-backup-vault-notifications
  "Description copied from interface: AWSBackup

  request - `com.amazonaws.services.backup.model.DeleteBackupVaultNotificationsRequest`

  returns: Result of the DeleteBackupVaultNotifications operation returned by the service. - `com.amazonaws.services.backup.model.DeleteBackupVaultNotificationsResult`"
  (^com.amazonaws.services.backup.model.DeleteBackupVaultNotificationsResult [^AbstractAWSBackup this ^com.amazonaws.services.backup.model.DeleteBackupVaultNotificationsRequest request]
    (-> this (.deleteBackupVaultNotifications request))))

(defn untag-resource
  "Description copied from interface: AWSBackup

  request - `com.amazonaws.services.backup.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.backup.model.UntagResourceResult`"
  (^com.amazonaws.services.backup.model.UntagResourceResult [^AbstractAWSBackup this ^com.amazonaws.services.backup.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn start-backup-job
  "Description copied from interface: AWSBackup

  request - `com.amazonaws.services.backup.model.StartBackupJobRequest`

  returns: Result of the StartBackupJob operation returned by the service. - `com.amazonaws.services.backup.model.StartBackupJobResult`"
  (^com.amazonaws.services.backup.model.StartBackupJobResult [^AbstractAWSBackup this ^com.amazonaws.services.backup.model.StartBackupJobRequest request]
    (-> this (.startBackupJob request))))

(defn get-backup-plan
  "Description copied from interface: AWSBackup

  request - `com.amazonaws.services.backup.model.GetBackupPlanRequest`

  returns: Result of the GetBackupPlan operation returned by the service. - `com.amazonaws.services.backup.model.GetBackupPlanResult`"
  (^com.amazonaws.services.backup.model.GetBackupPlanResult [^AbstractAWSBackup this ^com.amazonaws.services.backup.model.GetBackupPlanRequest request]
    (-> this (.getBackupPlan request))))

(defn describe-backup-job
  "Description copied from interface: AWSBackup

  request - `com.amazonaws.services.backup.model.DescribeBackupJobRequest`

  returns: Result of the DescribeBackupJob operation returned by the service. - `com.amazonaws.services.backup.model.DescribeBackupJobResult`"
  (^com.amazonaws.services.backup.model.DescribeBackupJobResult [^AbstractAWSBackup this ^com.amazonaws.services.backup.model.DescribeBackupJobRequest request]
    (-> this (.describeBackupJob request))))

(defn list-restore-jobs
  "Description copied from interface: AWSBackup

  request - `com.amazonaws.services.backup.model.ListRestoreJobsRequest`

  returns: Result of the ListRestoreJobs operation returned by the service. - `com.amazonaws.services.backup.model.ListRestoreJobsResult`"
  (^com.amazonaws.services.backup.model.ListRestoreJobsResult [^AbstractAWSBackup this ^com.amazonaws.services.backup.model.ListRestoreJobsRequest request]
    (-> this (.listRestoreJobs request))))

(defn describe-restore-job
  "Description copied from interface: AWSBackup

  request - `com.amazonaws.services.backup.model.DescribeRestoreJobRequest`

  returns: Result of the DescribeRestoreJob operation returned by the service. - `com.amazonaws.services.backup.model.DescribeRestoreJobResult`"
  (^com.amazonaws.services.backup.model.DescribeRestoreJobResult [^AbstractAWSBackup this ^com.amazonaws.services.backup.model.DescribeRestoreJobRequest request]
    (-> this (.describeRestoreJob request))))

(defn list-recovery-points-by-resource
  "Description copied from interface: AWSBackup

  request - `com.amazonaws.services.backup.model.ListRecoveryPointsByResourceRequest`

  returns: Result of the ListRecoveryPointsByResource operation returned by the service. - `com.amazonaws.services.backup.model.ListRecoveryPointsByResourceResult`"
  (^com.amazonaws.services.backup.model.ListRecoveryPointsByResourceResult [^AbstractAWSBackup this ^com.amazonaws.services.backup.model.ListRecoveryPointsByResourceRequest request]
    (-> this (.listRecoveryPointsByResource request))))

(defn delete-backup-selection
  "Description copied from interface: AWSBackup

  request - `com.amazonaws.services.backup.model.DeleteBackupSelectionRequest`

  returns: Result of the DeleteBackupSelection operation returned by the service. - `com.amazonaws.services.backup.model.DeleteBackupSelectionResult`"
  (^com.amazonaws.services.backup.model.DeleteBackupSelectionResult [^AbstractAWSBackup this ^com.amazonaws.services.backup.model.DeleteBackupSelectionRequest request]
    (-> this (.deleteBackupSelection request))))

(defn shutdown
  "Description copied from interface: AWSBackup"
  ([^AbstractAWSBackup this]
    (-> this (.shutdown))))

(defn list-recovery-points-by-backup-vault
  "Description copied from interface: AWSBackup

  request - `com.amazonaws.services.backup.model.ListRecoveryPointsByBackupVaultRequest`

  returns: Result of the ListRecoveryPointsByBackupVault operation returned by the service. - `com.amazonaws.services.backup.model.ListRecoveryPointsByBackupVaultResult`"
  (^com.amazonaws.services.backup.model.ListRecoveryPointsByBackupVaultResult [^AbstractAWSBackup this ^com.amazonaws.services.backup.model.ListRecoveryPointsByBackupVaultRequest request]
    (-> this (.listRecoveryPointsByBackupVault request))))

(defn get-backup-plan-from-json
  "Description copied from interface: AWSBackup

  request - `com.amazonaws.services.backup.model.GetBackupPlanFromJSONRequest`

  returns: Result of the GetBackupPlanFromJSON operation returned by the service. - `com.amazonaws.services.backup.model.GetBackupPlanFromJSONResult`"
  (^com.amazonaws.services.backup.model.GetBackupPlanFromJSONResult [^AbstractAWSBackup this ^com.amazonaws.services.backup.model.GetBackupPlanFromJSONRequest request]
    (-> this (.getBackupPlanFromJSON request))))

(defn describe-backup-vault
  "Description copied from interface: AWSBackup

  request - `com.amazonaws.services.backup.model.DescribeBackupVaultRequest`

  returns: Result of the DescribeBackupVault operation returned by the service. - `com.amazonaws.services.backup.model.DescribeBackupVaultResult`"
  (^com.amazonaws.services.backup.model.DescribeBackupVaultResult [^AbstractAWSBackup this ^com.amazonaws.services.backup.model.DescribeBackupVaultRequest request]
    (-> this (.describeBackupVault request))))

(defn describe-recovery-point
  "Description copied from interface: AWSBackup

  request - `com.amazonaws.services.backup.model.DescribeRecoveryPointRequest`

  returns: Result of the DescribeRecoveryPoint operation returned by the service. - `com.amazonaws.services.backup.model.DescribeRecoveryPointResult`"
  (^com.amazonaws.services.backup.model.DescribeRecoveryPointResult [^AbstractAWSBackup this ^com.amazonaws.services.backup.model.DescribeRecoveryPointRequest request]
    (-> this (.describeRecoveryPoint request))))

(defn stop-backup-job
  "Description copied from interface: AWSBackup

  request - `com.amazonaws.services.backup.model.StopBackupJobRequest`

  returns: Result of the StopBackupJob operation returned by the service. - `com.amazonaws.services.backup.model.StopBackupJobResult`"
  (^com.amazonaws.services.backup.model.StopBackupJobResult [^AbstractAWSBackup this ^com.amazonaws.services.backup.model.StopBackupJobRequest request]
    (-> this (.stopBackupJob request))))

(defn put-backup-vault-access-policy
  "Description copied from interface: AWSBackup

  request - `com.amazonaws.services.backup.model.PutBackupVaultAccessPolicyRequest`

  returns: Result of the PutBackupVaultAccessPolicy operation returned by the service. - `com.amazonaws.services.backup.model.PutBackupVaultAccessPolicyResult`"
  (^com.amazonaws.services.backup.model.PutBackupVaultAccessPolicyResult [^AbstractAWSBackup this ^com.amazonaws.services.backup.model.PutBackupVaultAccessPolicyRequest request]
    (-> this (.putBackupVaultAccessPolicy request))))

(defn list-backup-plans
  "Description copied from interface: AWSBackup

  request - `com.amazonaws.services.backup.model.ListBackupPlansRequest`

  returns: Result of the ListBackupPlans operation returned by the service. - `com.amazonaws.services.backup.model.ListBackupPlansResult`"
  (^com.amazonaws.services.backup.model.ListBackupPlansResult [^AbstractAWSBackup this ^com.amazonaws.services.backup.model.ListBackupPlansRequest request]
    (-> this (.listBackupPlans request))))

(defn get-recovery-point-restore-metadata
  "Description copied from interface: AWSBackup

  request - `com.amazonaws.services.backup.model.GetRecoveryPointRestoreMetadataRequest`

  returns: Result of the GetRecoveryPointRestoreMetadata operation returned by the service. - `com.amazonaws.services.backup.model.GetRecoveryPointRestoreMetadataResult`"
  (^com.amazonaws.services.backup.model.GetRecoveryPointRestoreMetadataResult [^AbstractAWSBackup this ^com.amazonaws.services.backup.model.GetRecoveryPointRestoreMetadataRequest request]
    (-> this (.getRecoveryPointRestoreMetadata request))))

(defn describe-protected-resource
  "Description copied from interface: AWSBackup

  request - `com.amazonaws.services.backup.model.DescribeProtectedResourceRequest`

  returns: Result of the DescribeProtectedResource operation returned by the service. - `com.amazonaws.services.backup.model.DescribeProtectedResourceResult`"
  (^com.amazonaws.services.backup.model.DescribeProtectedResourceResult [^AbstractAWSBackup this ^com.amazonaws.services.backup.model.DescribeProtectedResourceRequest request]
    (-> this (.describeProtectedResource request))))

(defn delete-recovery-point
  "Description copied from interface: AWSBackup

  request - `com.amazonaws.services.backup.model.DeleteRecoveryPointRequest`

  returns: Result of the DeleteRecoveryPoint operation returned by the service. - `com.amazonaws.services.backup.model.DeleteRecoveryPointResult`"
  (^com.amazonaws.services.backup.model.DeleteRecoveryPointResult [^AbstractAWSBackup this ^com.amazonaws.services.backup.model.DeleteRecoveryPointRequest request]
    (-> this (.deleteRecoveryPoint request))))

(defn create-backup-vault
  "Description copied from interface: AWSBackup

  request - `com.amazonaws.services.backup.model.CreateBackupVaultRequest`

  returns: Result of the CreateBackupVault operation returned by the service. - `com.amazonaws.services.backup.model.CreateBackupVaultResult`"
  (^com.amazonaws.services.backup.model.CreateBackupVaultResult [^AbstractAWSBackup this ^com.amazonaws.services.backup.model.CreateBackupVaultRequest request]
    (-> this (.createBackupVault request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSBackup

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSBackup this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn create-backup-selection
  "Description copied from interface: AWSBackup

  request - `com.amazonaws.services.backup.model.CreateBackupSelectionRequest`

  returns: Result of the CreateBackupSelection operation returned by the service. - `com.amazonaws.services.backup.model.CreateBackupSelectionResult`"
  (^com.amazonaws.services.backup.model.CreateBackupSelectionResult [^AbstractAWSBackup this ^com.amazonaws.services.backup.model.CreateBackupSelectionRequest request]
    (-> this (.createBackupSelection request))))

(defn list-backup-vaults
  "Description copied from interface: AWSBackup

  request - `com.amazonaws.services.backup.model.ListBackupVaultsRequest`

  returns: Result of the ListBackupVaults operation returned by the service. - `com.amazonaws.services.backup.model.ListBackupVaultsResult`"
  (^com.amazonaws.services.backup.model.ListBackupVaultsResult [^AbstractAWSBackup this ^com.amazonaws.services.backup.model.ListBackupVaultsRequest request]
    (-> this (.listBackupVaults request))))

(defn list-backup-plan-versions
  "Description copied from interface: AWSBackup

  request - `com.amazonaws.services.backup.model.ListBackupPlanVersionsRequest`

  returns: Result of the ListBackupPlanVersions operation returned by the service. - `com.amazonaws.services.backup.model.ListBackupPlanVersionsResult`"
  (^com.amazonaws.services.backup.model.ListBackupPlanVersionsResult [^AbstractAWSBackup this ^com.amazonaws.services.backup.model.ListBackupPlanVersionsRequest request]
    (-> this (.listBackupPlanVersions request))))

(defn tag-resource
  "Description copied from interface: AWSBackup

  request - `com.amazonaws.services.backup.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.backup.model.TagResourceResult`"
  (^com.amazonaws.services.backup.model.TagResourceResult [^AbstractAWSBackup this ^com.amazonaws.services.backup.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn get-backup-plan-from-template
  "Description copied from interface: AWSBackup

  request - `com.amazonaws.services.backup.model.GetBackupPlanFromTemplateRequest`

  returns: Result of the GetBackupPlanFromTemplate operation returned by the service. - `com.amazonaws.services.backup.model.GetBackupPlanFromTemplateResult`"
  (^com.amazonaws.services.backup.model.GetBackupPlanFromTemplateResult [^AbstractAWSBackup this ^com.amazonaws.services.backup.model.GetBackupPlanFromTemplateRequest request]
    (-> this (.getBackupPlanFromTemplate request))))

(defn get-backup-vault-notifications
  "Description copied from interface: AWSBackup

  request - `com.amazonaws.services.backup.model.GetBackupVaultNotificationsRequest`

  returns: Result of the GetBackupVaultNotifications operation returned by the service. - `com.amazonaws.services.backup.model.GetBackupVaultNotificationsResult`"
  (^com.amazonaws.services.backup.model.GetBackupVaultNotificationsResult [^AbstractAWSBackup this ^com.amazonaws.services.backup.model.GetBackupVaultNotificationsRequest request]
    (-> this (.getBackupVaultNotifications request))))

(defn list-protected-resources
  "Description copied from interface: AWSBackup

  request - `com.amazonaws.services.backup.model.ListProtectedResourcesRequest`

  returns: Result of the ListProtectedResources operation returned by the service. - `com.amazonaws.services.backup.model.ListProtectedResourcesResult`"
  (^com.amazonaws.services.backup.model.ListProtectedResourcesResult [^AbstractAWSBackup this ^com.amazonaws.services.backup.model.ListProtectedResourcesRequest request]
    (-> this (.listProtectedResources request))))

(defn get-backup-selection
  "Description copied from interface: AWSBackup

  request - `com.amazonaws.services.backup.model.GetBackupSelectionRequest`

  returns: Result of the GetBackupSelection operation returned by the service. - `com.amazonaws.services.backup.model.GetBackupSelectionResult`"
  (^com.amazonaws.services.backup.model.GetBackupSelectionResult [^AbstractAWSBackup this ^com.amazonaws.services.backup.model.GetBackupSelectionRequest request]
    (-> this (.getBackupSelection request))))

(defn delete-backup-plan
  "Description copied from interface: AWSBackup

  request - `com.amazonaws.services.backup.model.DeleteBackupPlanRequest`

  returns: Result of the DeleteBackupPlan operation returned by the service. - `com.amazonaws.services.backup.model.DeleteBackupPlanResult`"
  (^com.amazonaws.services.backup.model.DeleteBackupPlanResult [^AbstractAWSBackup this ^com.amazonaws.services.backup.model.DeleteBackupPlanRequest request]
    (-> this (.deleteBackupPlan request))))

