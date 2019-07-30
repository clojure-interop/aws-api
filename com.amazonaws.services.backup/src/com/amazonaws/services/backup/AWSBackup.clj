(ns com.amazonaws.services.backup.AWSBackup
  "Interface for accessing AWS Backup.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSBackup instead.


  AWS Backup

  AWS Backup is a unified backup service designed to protect AWS services and their associated data. AWS Backup
  simplifies the creation, migration, restoration, and deletion of backups, while also providing reporting and
  auditing."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.backup AWSBackup]))

(defn get-supported-resource-types
  "Returns the AWS resource types supported by AWS Backup.

  get-supported-resource-types-request - `com.amazonaws.services.backup.model.GetSupportedResourceTypesRequest`

  returns: Result of the GetSupportedResourceTypes operation returned by the service. - `com.amazonaws.services.backup.model.GetSupportedResourceTypesResult`

  throws: com.amazonaws.services.backup.model.ServiceUnavailableException - The request failed due to a temporary failure of the server."
  (^com.amazonaws.services.backup.model.GetSupportedResourceTypesResult [^AWSBackup this ^com.amazonaws.services.backup.model.GetSupportedResourceTypesRequest get-supported-resource-types-request]
    (-> this (.getSupportedResourceTypes get-supported-resource-types-request))))

(defn update-backup-plan
  "Replaces the body of a saved backup plan identified by its backupPlanId with the input document in
   JSON format. The new version is uniquely identified by a VersionId.

  update-backup-plan-request - `com.amazonaws.services.backup.model.UpdateBackupPlanRequest`

  returns: Result of the UpdateBackupPlan operation returned by the service. - `com.amazonaws.services.backup.model.UpdateBackupPlanResult`

  throws: com.amazonaws.services.backup.model.ResourceNotFoundException - A resource that is required for the action doesn't exist."
  (^com.amazonaws.services.backup.model.UpdateBackupPlanResult [^AWSBackup this ^com.amazonaws.services.backup.model.UpdateBackupPlanRequest update-backup-plan-request]
    (-> this (.updateBackupPlan update-backup-plan-request))))

(defn list-backup-jobs
  "Returns metadata about your backup jobs.

  list-backup-jobs-request - `com.amazonaws.services.backup.model.ListBackupJobsRequest`

  returns: Result of the ListBackupJobs operation returned by the service. - `com.amazonaws.services.backup.model.ListBackupJobsResult`

  throws: com.amazonaws.services.backup.model.InvalidParameterValueException - Indicates that something is wrong with a parameter's value. For example, the value is out of range."
  (^com.amazonaws.services.backup.model.ListBackupJobsResult [^AWSBackup this ^com.amazonaws.services.backup.model.ListBackupJobsRequest list-backup-jobs-request]
    (-> this (.listBackupJobs list-backup-jobs-request))))

(defn update-recovery-point-lifecycle
  "Sets the transition lifecycle of a recovery point.


   The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup
   transitions and expires backups automatically according to the lifecycle that you define.


   Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the
   “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The
   “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold.

  update-recovery-point-lifecycle-request - `com.amazonaws.services.backup.model.UpdateRecoveryPointLifecycleRequest`

  returns: Result of the UpdateRecoveryPointLifecycle operation returned by the service. - `com.amazonaws.services.backup.model.UpdateRecoveryPointLifecycleResult`

  throws: com.amazonaws.services.backup.model.ResourceNotFoundException - A resource that is required for the action doesn't exist."
  (^com.amazonaws.services.backup.model.UpdateRecoveryPointLifecycleResult [^AWSBackup this ^com.amazonaws.services.backup.model.UpdateRecoveryPointLifecycleRequest update-recovery-point-lifecycle-request]
    (-> this (.updateRecoveryPointLifecycle update-recovery-point-lifecycle-request))))

(defn put-backup-vault-notifications
  "Turns on notifications on a backup vault for the specified topic and events.

  put-backup-vault-notifications-request - `com.amazonaws.services.backup.model.PutBackupVaultNotificationsRequest`

  returns: Result of the PutBackupVaultNotifications operation returned by the service. - `com.amazonaws.services.backup.model.PutBackupVaultNotificationsResult`

  throws: com.amazonaws.services.backup.model.ResourceNotFoundException - A resource that is required for the action doesn't exist."
  (^com.amazonaws.services.backup.model.PutBackupVaultNotificationsResult [^AWSBackup this ^com.amazonaws.services.backup.model.PutBackupVaultNotificationsRequest put-backup-vault-notifications-request]
    (-> this (.putBackupVaultNotifications put-backup-vault-notifications-request))))

(defn get-backup-vault-access-policy
  "Returns the access policy document that is associated with the named backup vault.

  get-backup-vault-access-policy-request - `com.amazonaws.services.backup.model.GetBackupVaultAccessPolicyRequest`

  returns: Result of the GetBackupVaultAccessPolicy operation returned by the service. - `com.amazonaws.services.backup.model.GetBackupVaultAccessPolicyResult`

  throws: com.amazonaws.services.backup.model.ResourceNotFoundException - A resource that is required for the action doesn't exist."
  (^com.amazonaws.services.backup.model.GetBackupVaultAccessPolicyResult [^AWSBackup this ^com.amazonaws.services.backup.model.GetBackupVaultAccessPolicyRequest get-backup-vault-access-policy-request]
    (-> this (.getBackupVaultAccessPolicy get-backup-vault-access-policy-request))))

(defn delete-backup-vault
  "Deletes the backup vault identified by its name. A vault can be deleted only if it is empty.

  delete-backup-vault-request - `com.amazonaws.services.backup.model.DeleteBackupVaultRequest`

  returns: Result of the DeleteBackupVault operation returned by the service. - `com.amazonaws.services.backup.model.DeleteBackupVaultResult`

  throws: com.amazonaws.services.backup.model.ResourceNotFoundException - A resource that is required for the action doesn't exist."
  (^com.amazonaws.services.backup.model.DeleteBackupVaultResult [^AWSBackup this ^com.amazonaws.services.backup.model.DeleteBackupVaultRequest delete-backup-vault-request]
    (-> this (.deleteBackupVault delete-backup-vault-request))))

(defn list-backup-selections
  "Returns an array containing metadata of the resources associated with the target backup plan.

  list-backup-selections-request - `com.amazonaws.services.backup.model.ListBackupSelectionsRequest`

  returns: Result of the ListBackupSelections operation returned by the service. - `com.amazonaws.services.backup.model.ListBackupSelectionsResult`

  throws: com.amazonaws.services.backup.model.ResourceNotFoundException - A resource that is required for the action doesn't exist."
  (^com.amazonaws.services.backup.model.ListBackupSelectionsResult [^AWSBackup this ^com.amazonaws.services.backup.model.ListBackupSelectionsRequest list-backup-selections-request]
    (-> this (.listBackupSelections list-backup-selections-request))))

(defn start-restore-job
  "Recovers the saved resource identified by an Amazon Resource Name (ARN).


   If the resource ARN is included in the request, then the last complete backup of that resource is recovered. If
   the ARN of a recovery point is supplied, then that recovery point is restored.

  start-restore-job-request - `com.amazonaws.services.backup.model.StartRestoreJobRequest`

  returns: Result of the StartRestoreJob operation returned by the service. - `com.amazonaws.services.backup.model.StartRestoreJobResult`

  throws: com.amazonaws.services.backup.model.ResourceNotFoundException - A resource that is required for the action doesn't exist."
  (^com.amazonaws.services.backup.model.StartRestoreJobResult [^AWSBackup this ^com.amazonaws.services.backup.model.StartRestoreJobRequest start-restore-job-request]
    (-> this (.startRestoreJob start-restore-job-request))))

(defn list-tags
  "Returns a list of key-value pairs assigned to a target recovery point, backup plan, or backup vault.

  list-tags-request - `com.amazonaws.services.backup.model.ListTagsRequest`

  returns: Result of the ListTags operation returned by the service. - `com.amazonaws.services.backup.model.ListTagsResult`

  throws: com.amazonaws.services.backup.model.ResourceNotFoundException - A resource that is required for the action doesn't exist."
  (^com.amazonaws.services.backup.model.ListTagsResult [^AWSBackup this ^com.amazonaws.services.backup.model.ListTagsRequest list-tags-request]
    (-> this (.listTags list-tags-request))))

(defn list-backup-plan-templates
  "Returns metadata of your saved backup plan templates, including the template ID, name, and the creation and
   deletion dates.

  list-backup-plan-templates-request - `com.amazonaws.services.backup.model.ListBackupPlanTemplatesRequest`

  returns: Result of the ListBackupPlanTemplates operation returned by the service. - `com.amazonaws.services.backup.model.ListBackupPlanTemplatesResult`

  throws: com.amazonaws.services.backup.model.InvalidParameterValueException - Indicates that something is wrong with a parameter's value. For example, the value is out of range."
  (^com.amazonaws.services.backup.model.ListBackupPlanTemplatesResult [^AWSBackup this ^com.amazonaws.services.backup.model.ListBackupPlanTemplatesRequest list-backup-plan-templates-request]
    (-> this (.listBackupPlanTemplates list-backup-plan-templates-request))))

(defn create-backup-plan
  "Backup plans are documents that contain information that AWS Backup uses to schedule tasks that create recovery
   points of resources.


   If you call CreateBackupPlan with a plan that already exists, the existing backupPlanId
   is returned.

  create-backup-plan-request - `com.amazonaws.services.backup.model.CreateBackupPlanRequest`

  returns: Result of the CreateBackupPlan operation returned by the service. - `com.amazonaws.services.backup.model.CreateBackupPlanResult`

  throws: com.amazonaws.services.backup.model.LimitExceededException - A limit in the request has been exceeded; for example, a maximum number of items allowed in a request."
  (^com.amazonaws.services.backup.model.CreateBackupPlanResult [^AWSBackup this ^com.amazonaws.services.backup.model.CreateBackupPlanRequest create-backup-plan-request]
    (-> this (.createBackupPlan create-backup-plan-request))))

(defn export-backup-plan-template
  "Returns the backup plan that is specified by the plan ID as a backup template.

  export-backup-plan-template-request - `com.amazonaws.services.backup.model.ExportBackupPlanTemplateRequest`

  returns: Result of the ExportBackupPlanTemplate operation returned by the service. - `com.amazonaws.services.backup.model.ExportBackupPlanTemplateResult`

  throws: com.amazonaws.services.backup.model.InvalidParameterValueException - Indicates that something is wrong with a parameter's value. For example, the value is out of range."
  (^com.amazonaws.services.backup.model.ExportBackupPlanTemplateResult [^AWSBackup this ^com.amazonaws.services.backup.model.ExportBackupPlanTemplateRequest export-backup-plan-template-request]
    (-> this (.exportBackupPlanTemplate export-backup-plan-template-request))))

(defn delete-backup-vault-access-policy
  "Deletes the policy document that manages permissions on a backup vault.

  delete-backup-vault-access-policy-request - `com.amazonaws.services.backup.model.DeleteBackupVaultAccessPolicyRequest`

  returns: Result of the DeleteBackupVaultAccessPolicy operation returned by the service. - `com.amazonaws.services.backup.model.DeleteBackupVaultAccessPolicyResult`

  throws: com.amazonaws.services.backup.model.ResourceNotFoundException - A resource that is required for the action doesn't exist."
  (^com.amazonaws.services.backup.model.DeleteBackupVaultAccessPolicyResult [^AWSBackup this ^com.amazonaws.services.backup.model.DeleteBackupVaultAccessPolicyRequest delete-backup-vault-access-policy-request]
    (-> this (.deleteBackupVaultAccessPolicy delete-backup-vault-access-policy-request))))

(defn delete-backup-vault-notifications
  "Deletes event notifications for the specified backup vault.

  delete-backup-vault-notifications-request - `com.amazonaws.services.backup.model.DeleteBackupVaultNotificationsRequest`

  returns: Result of the DeleteBackupVaultNotifications operation returned by the service. - `com.amazonaws.services.backup.model.DeleteBackupVaultNotificationsResult`

  throws: com.amazonaws.services.backup.model.ResourceNotFoundException - A resource that is required for the action doesn't exist."
  (^com.amazonaws.services.backup.model.DeleteBackupVaultNotificationsResult [^AWSBackup this ^com.amazonaws.services.backup.model.DeleteBackupVaultNotificationsRequest delete-backup-vault-notifications-request]
    (-> this (.deleteBackupVaultNotifications delete-backup-vault-notifications-request))))

(defn untag-resource
  "Removes a set of key-value pairs from a recovery point, backup plan, or backup vault identified by an Amazon
   Resource Name (ARN)

  untag-resource-request - `com.amazonaws.services.backup.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.backup.model.UntagResourceResult`

  throws: com.amazonaws.services.backup.model.ResourceNotFoundException - A resource that is required for the action doesn't exist."
  (^com.amazonaws.services.backup.model.UntagResourceResult [^AWSBackup this ^com.amazonaws.services.backup.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn start-backup-job
  "Starts a job to create a one-time backup of the specified resource.

  start-backup-job-request - `com.amazonaws.services.backup.model.StartBackupJobRequest`

  returns: Result of the StartBackupJob operation returned by the service. - `com.amazonaws.services.backup.model.StartBackupJobResult`

  throws: com.amazonaws.services.backup.model.ResourceNotFoundException - A resource that is required for the action doesn't exist."
  (^com.amazonaws.services.backup.model.StartBackupJobResult [^AWSBackup this ^com.amazonaws.services.backup.model.StartBackupJobRequest start-backup-job-request]
    (-> this (.startBackupJob start-backup-job-request))))

(defn get-backup-plan
  "Returns the body of a backup plan in JSON format, in addition to plan metadata.

  get-backup-plan-request - `com.amazonaws.services.backup.model.GetBackupPlanRequest`

  returns: Result of the GetBackupPlan operation returned by the service. - `com.amazonaws.services.backup.model.GetBackupPlanResult`

  throws: com.amazonaws.services.backup.model.ResourceNotFoundException - A resource that is required for the action doesn't exist."
  (^com.amazonaws.services.backup.model.GetBackupPlanResult [^AWSBackup this ^com.amazonaws.services.backup.model.GetBackupPlanRequest get-backup-plan-request]
    (-> this (.getBackupPlan get-backup-plan-request))))

(defn describe-backup-job
  "Returns metadata associated with creating a backup of a resource.

  describe-backup-job-request - `com.amazonaws.services.backup.model.DescribeBackupJobRequest`

  returns: Result of the DescribeBackupJob operation returned by the service. - `com.amazonaws.services.backup.model.DescribeBackupJobResult`

  throws: com.amazonaws.services.backup.model.ResourceNotFoundException - A resource that is required for the action doesn't exist."
  (^com.amazonaws.services.backup.model.DescribeBackupJobResult [^AWSBackup this ^com.amazonaws.services.backup.model.DescribeBackupJobRequest describe-backup-job-request]
    (-> this (.describeBackupJob describe-backup-job-request))))

(defn list-restore-jobs
  "Returns a list of jobs that AWS Backup initiated to restore a saved resource, including metadata about the
   recovery process.

  list-restore-jobs-request - `com.amazonaws.services.backup.model.ListRestoreJobsRequest`

  returns: Result of the ListRestoreJobs operation returned by the service. - `com.amazonaws.services.backup.model.ListRestoreJobsResult`

  throws: com.amazonaws.services.backup.model.ResourceNotFoundException - A resource that is required for the action doesn't exist."
  (^com.amazonaws.services.backup.model.ListRestoreJobsResult [^AWSBackup this ^com.amazonaws.services.backup.model.ListRestoreJobsRequest list-restore-jobs-request]
    (-> this (.listRestoreJobs list-restore-jobs-request))))

(defn describe-restore-job
  "Returns metadata associated with a restore job that is specified by a job ID.

  describe-restore-job-request - `com.amazonaws.services.backup.model.DescribeRestoreJobRequest`

  returns: Result of the DescribeRestoreJob operation returned by the service. - `com.amazonaws.services.backup.model.DescribeRestoreJobResult`

  throws: com.amazonaws.services.backup.model.ResourceNotFoundException - A resource that is required for the action doesn't exist."
  (^com.amazonaws.services.backup.model.DescribeRestoreJobResult [^AWSBackup this ^com.amazonaws.services.backup.model.DescribeRestoreJobRequest describe-restore-job-request]
    (-> this (.describeRestoreJob describe-restore-job-request))))

(defn list-recovery-points-by-resource
  "Returns detailed information about recovery points of the type specified by a resource Amazon Resource Name
   (ARN).

  list-recovery-points-by-resource-request - `com.amazonaws.services.backup.model.ListRecoveryPointsByResourceRequest`

  returns: Result of the ListRecoveryPointsByResource operation returned by the service. - `com.amazonaws.services.backup.model.ListRecoveryPointsByResourceResult`

  throws: com.amazonaws.services.backup.model.ResourceNotFoundException - A resource that is required for the action doesn't exist."
  (^com.amazonaws.services.backup.model.ListRecoveryPointsByResourceResult [^AWSBackup this ^com.amazonaws.services.backup.model.ListRecoveryPointsByResourceRequest list-recovery-points-by-resource-request]
    (-> this (.listRecoveryPointsByResource list-recovery-points-by-resource-request))))

(defn delete-backup-selection
  "Deletes the resource selection associated with a backup plan that is specified by the SelectionId.

  delete-backup-selection-request - `com.amazonaws.services.backup.model.DeleteBackupSelectionRequest`

  returns: Result of the DeleteBackupSelection operation returned by the service. - `com.amazonaws.services.backup.model.DeleteBackupSelectionResult`

  throws: com.amazonaws.services.backup.model.ResourceNotFoundException - A resource that is required for the action doesn't exist."
  (^com.amazonaws.services.backup.model.DeleteBackupSelectionResult [^AWSBackup this ^com.amazonaws.services.backup.model.DeleteBackupSelectionRequest delete-backup-selection-request]
    (-> this (.deleteBackupSelection delete-backup-selection-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSBackup this]
    (-> this (.shutdown))))

(defn list-recovery-points-by-backup-vault
  "Returns detailed information about the recovery points stored in a backup vault.

  list-recovery-points-by-backup-vault-request - `com.amazonaws.services.backup.model.ListRecoveryPointsByBackupVaultRequest`

  returns: Result of the ListRecoveryPointsByBackupVault operation returned by the service. - `com.amazonaws.services.backup.model.ListRecoveryPointsByBackupVaultResult`

  throws: com.amazonaws.services.backup.model.ResourceNotFoundException - A resource that is required for the action doesn't exist."
  (^com.amazonaws.services.backup.model.ListRecoveryPointsByBackupVaultResult [^AWSBackup this ^com.amazonaws.services.backup.model.ListRecoveryPointsByBackupVaultRequest list-recovery-points-by-backup-vault-request]
    (-> this (.listRecoveryPointsByBackupVault list-recovery-points-by-backup-vault-request))))

(defn get-backup-plan-from-json
  "Returns a valid JSON document specifying a backup plan or an error.

  get-backup-plan-from-json-request - `com.amazonaws.services.backup.model.GetBackupPlanFromJSONRequest`

  returns: Result of the GetBackupPlanFromJSON operation returned by the service. - `com.amazonaws.services.backup.model.GetBackupPlanFromJSONResult`

  throws: com.amazonaws.services.backup.model.LimitExceededException - A limit in the request has been exceeded; for example, a maximum number of items allowed in a request."
  (^com.amazonaws.services.backup.model.GetBackupPlanFromJSONResult [^AWSBackup this ^com.amazonaws.services.backup.model.GetBackupPlanFromJSONRequest get-backup-plan-from-json-request]
    (-> this (.getBackupPlanFromJSON get-backup-plan-from-json-request))))

(defn describe-backup-vault
  "Returns metadata about a backup vault specified by its name.

  describe-backup-vault-request - `com.amazonaws.services.backup.model.DescribeBackupVaultRequest`

  returns: Result of the DescribeBackupVault operation returned by the service. - `com.amazonaws.services.backup.model.DescribeBackupVaultResult`

  throws: com.amazonaws.services.backup.model.ResourceNotFoundException - A resource that is required for the action doesn't exist."
  (^com.amazonaws.services.backup.model.DescribeBackupVaultResult [^AWSBackup this ^com.amazonaws.services.backup.model.DescribeBackupVaultRequest describe-backup-vault-request]
    (-> this (.describeBackupVault describe-backup-vault-request))))

(defn describe-recovery-point
  "Returns metadata associated with a recovery point, including ID, status, encryption, and lifecycle.

  describe-recovery-point-request - `com.amazonaws.services.backup.model.DescribeRecoveryPointRequest`

  returns: Result of the DescribeRecoveryPoint operation returned by the service. - `com.amazonaws.services.backup.model.DescribeRecoveryPointResult`

  throws: com.amazonaws.services.backup.model.ResourceNotFoundException - A resource that is required for the action doesn't exist."
  (^com.amazonaws.services.backup.model.DescribeRecoveryPointResult [^AWSBackup this ^com.amazonaws.services.backup.model.DescribeRecoveryPointRequest describe-recovery-point-request]
    (-> this (.describeRecoveryPoint describe-recovery-point-request))))

(defn stop-backup-job
  "Attempts to cancel a job to create a one-time backup of a resource.

  stop-backup-job-request - `com.amazonaws.services.backup.model.StopBackupJobRequest`

  returns: Result of the StopBackupJob operation returned by the service. - `com.amazonaws.services.backup.model.StopBackupJobResult`

  throws: com.amazonaws.services.backup.model.MissingParameterValueException - Indicates that a required parameter is missing."
  (^com.amazonaws.services.backup.model.StopBackupJobResult [^AWSBackup this ^com.amazonaws.services.backup.model.StopBackupJobRequest stop-backup-job-request]
    (-> this (.stopBackupJob stop-backup-job-request))))

(defn put-backup-vault-access-policy
  "Sets a resource-based policy that is used to manage access permissions on the target backup vault. Requires a
   backup vault name and an access policy document in JSON format.

  put-backup-vault-access-policy-request - `com.amazonaws.services.backup.model.PutBackupVaultAccessPolicyRequest`

  returns: Result of the PutBackupVaultAccessPolicy operation returned by the service. - `com.amazonaws.services.backup.model.PutBackupVaultAccessPolicyResult`

  throws: com.amazonaws.services.backup.model.ResourceNotFoundException - A resource that is required for the action doesn't exist."
  (^com.amazonaws.services.backup.model.PutBackupVaultAccessPolicyResult [^AWSBackup this ^com.amazonaws.services.backup.model.PutBackupVaultAccessPolicyRequest put-backup-vault-access-policy-request]
    (-> this (.putBackupVaultAccessPolicy put-backup-vault-access-policy-request))))

(defn list-backup-plans
  "Returns metadata of your saved backup plans, including Amazon Resource Names (ARNs), plan IDs, creation and
   deletion dates, version IDs, plan names, and creator request IDs.

  list-backup-plans-request - `com.amazonaws.services.backup.model.ListBackupPlansRequest`

  returns: Result of the ListBackupPlans operation returned by the service. - `com.amazonaws.services.backup.model.ListBackupPlansResult`

  throws: com.amazonaws.services.backup.model.ResourceNotFoundException - A resource that is required for the action doesn't exist."
  (^com.amazonaws.services.backup.model.ListBackupPlansResult [^AWSBackup this ^com.amazonaws.services.backup.model.ListBackupPlansRequest list-backup-plans-request]
    (-> this (.listBackupPlans list-backup-plans-request))))

(defn get-recovery-point-restore-metadata
  "Returns two sets of metadata key-value pairs. The first set lists the metadata that the recovery point was
   created with. The second set lists the metadata key-value pairs that are required to restore the recovery point.


   These sets can be the same, or the restore metadata set can contain different values if the target service to be
   restored has changed since the recovery point was created and now requires additional or different information in
   order to be restored.

  get-recovery-point-restore-metadata-request - `com.amazonaws.services.backup.model.GetRecoveryPointRestoreMetadataRequest`

  returns: Result of the GetRecoveryPointRestoreMetadata operation returned by the service. - `com.amazonaws.services.backup.model.GetRecoveryPointRestoreMetadataResult`

  throws: com.amazonaws.services.backup.model.ResourceNotFoundException - A resource that is required for the action doesn't exist."
  (^com.amazonaws.services.backup.model.GetRecoveryPointRestoreMetadataResult [^AWSBackup this ^com.amazonaws.services.backup.model.GetRecoveryPointRestoreMetadataRequest get-recovery-point-restore-metadata-request]
    (-> this (.getRecoveryPointRestoreMetadata get-recovery-point-restore-metadata-request))))

(defn describe-protected-resource
  "Returns information about a saved resource, including the last time it was backed-up, its Amazon Resource Name
   (ARN), and the AWS service type of the saved resource.

  describe-protected-resource-request - `com.amazonaws.services.backup.model.DescribeProtectedResourceRequest`

  returns: Result of the DescribeProtectedResource operation returned by the service. - `com.amazonaws.services.backup.model.DescribeProtectedResourceResult`

  throws: com.amazonaws.services.backup.model.MissingParameterValueException - Indicates that a required parameter is missing."
  (^com.amazonaws.services.backup.model.DescribeProtectedResourceResult [^AWSBackup this ^com.amazonaws.services.backup.model.DescribeProtectedResourceRequest describe-protected-resource-request]
    (-> this (.describeProtectedResource describe-protected-resource-request))))

(defn delete-recovery-point
  "Deletes the recovery point specified by a recovery point ID.

  delete-recovery-point-request - `com.amazonaws.services.backup.model.DeleteRecoveryPointRequest`

  returns: Result of the DeleteRecoveryPoint operation returned by the service. - `com.amazonaws.services.backup.model.DeleteRecoveryPointResult`

  throws: com.amazonaws.services.backup.model.ResourceNotFoundException - A resource that is required for the action doesn't exist."
  (^com.amazonaws.services.backup.model.DeleteRecoveryPointResult [^AWSBackup this ^com.amazonaws.services.backup.model.DeleteRecoveryPointRequest delete-recovery-point-request]
    (-> this (.deleteRecoveryPoint delete-recovery-point-request))))

(defn create-backup-vault
  "Creates a logical container where backups are stored. A CreateBackupVault request includes a name,
   optionally one or more resource tags, an encryption key, and a request ID.



   Sensitive data, such as passport numbers, should not be included the name of a backup vault.

  create-backup-vault-request - `com.amazonaws.services.backup.model.CreateBackupVaultRequest`

  returns: Result of the CreateBackupVault operation returned by the service. - `com.amazonaws.services.backup.model.CreateBackupVaultResult`

  throws: com.amazonaws.services.backup.model.InvalidParameterValueException - Indicates that something is wrong with a parameter's value. For example, the value is out of range."
  (^com.amazonaws.services.backup.model.CreateBackupVaultResult [^AWSBackup this ^com.amazonaws.services.backup.model.CreateBackupVaultRequest create-backup-vault-request]
    (-> this (.createBackupVault create-backup-vault-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSBackup this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn create-backup-selection
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

  returns: Result of the CreateBackupSelection operation returned by the service. - `com.amazonaws.services.backup.model.CreateBackupSelectionResult`

  throws: com.amazonaws.services.backup.model.LimitExceededException - A limit in the request has been exceeded; for example, a maximum number of items allowed in a request."
  (^com.amazonaws.services.backup.model.CreateBackupSelectionResult [^AWSBackup this ^com.amazonaws.services.backup.model.CreateBackupSelectionRequest create-backup-selection-request]
    (-> this (.createBackupSelection create-backup-selection-request))))

(defn list-backup-vaults
  "Returns a list of recovery point storage containers along with information about them.

  list-backup-vaults-request - `com.amazonaws.services.backup.model.ListBackupVaultsRequest`

  returns: Result of the ListBackupVaults operation returned by the service. - `com.amazonaws.services.backup.model.ListBackupVaultsResult`

  throws: com.amazonaws.services.backup.model.ResourceNotFoundException - A resource that is required for the action doesn't exist."
  (^com.amazonaws.services.backup.model.ListBackupVaultsResult [^AWSBackup this ^com.amazonaws.services.backup.model.ListBackupVaultsRequest list-backup-vaults-request]
    (-> this (.listBackupVaults list-backup-vaults-request))))

(defn list-backup-plan-versions
  "Returns version metadata of your backup plans, including Amazon Resource Names (ARNs), backup plan IDs, creation
   and deletion dates, plan names, and version IDs.

  list-backup-plan-versions-request - `com.amazonaws.services.backup.model.ListBackupPlanVersionsRequest`

  returns: Result of the ListBackupPlanVersions operation returned by the service. - `com.amazonaws.services.backup.model.ListBackupPlanVersionsResult`

  throws: com.amazonaws.services.backup.model.ResourceNotFoundException - A resource that is required for the action doesn't exist."
  (^com.amazonaws.services.backup.model.ListBackupPlanVersionsResult [^AWSBackup this ^com.amazonaws.services.backup.model.ListBackupPlanVersionsRequest list-backup-plan-versions-request]
    (-> this (.listBackupPlanVersions list-backup-plan-versions-request))))

(defn tag-resource
  "Assigns a set of key-value pairs to a recovery point, backup plan, or backup vault identified by an Amazon
   Resource Name (ARN).

  tag-resource-request - `com.amazonaws.services.backup.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.backup.model.TagResourceResult`

  throws: com.amazonaws.services.backup.model.ResourceNotFoundException - A resource that is required for the action doesn't exist."
  (^com.amazonaws.services.backup.model.TagResourceResult [^AWSBackup this ^com.amazonaws.services.backup.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

(defn get-backup-plan-from-template
  "Returns the template specified by its templateId as a backup plan.

  get-backup-plan-from-template-request - `com.amazonaws.services.backup.model.GetBackupPlanFromTemplateRequest`

  returns: Result of the GetBackupPlanFromTemplate operation returned by the service. - `com.amazonaws.services.backup.model.GetBackupPlanFromTemplateResult`

  throws: com.amazonaws.services.backup.model.InvalidParameterValueException - Indicates that something is wrong with a parameter's value. For example, the value is out of range."
  (^com.amazonaws.services.backup.model.GetBackupPlanFromTemplateResult [^AWSBackup this ^com.amazonaws.services.backup.model.GetBackupPlanFromTemplateRequest get-backup-plan-from-template-request]
    (-> this (.getBackupPlanFromTemplate get-backup-plan-from-template-request))))

(defn get-backup-vault-notifications
  "Returns event notifications for the specified backup vault.

  get-backup-vault-notifications-request - `com.amazonaws.services.backup.model.GetBackupVaultNotificationsRequest`

  returns: Result of the GetBackupVaultNotifications operation returned by the service. - `com.amazonaws.services.backup.model.GetBackupVaultNotificationsResult`

  throws: com.amazonaws.services.backup.model.ResourceNotFoundException - A resource that is required for the action doesn't exist."
  (^com.amazonaws.services.backup.model.GetBackupVaultNotificationsResult [^AWSBackup this ^com.amazonaws.services.backup.model.GetBackupVaultNotificationsRequest get-backup-vault-notifications-request]
    (-> this (.getBackupVaultNotifications get-backup-vault-notifications-request))))

(defn list-protected-resources
  "Returns an array of resources successfully backed up by AWS Backup, including the time the resource was saved, an
   Amazon Resource Name (ARN) of the resource, and a resource type.

  list-protected-resources-request - `com.amazonaws.services.backup.model.ListProtectedResourcesRequest`

  returns: Result of the ListProtectedResources operation returned by the service. - `com.amazonaws.services.backup.model.ListProtectedResourcesResult`

  throws: com.amazonaws.services.backup.model.InvalidParameterValueException - Indicates that something is wrong with a parameter's value. For example, the value is out of range."
  (^com.amazonaws.services.backup.model.ListProtectedResourcesResult [^AWSBackup this ^com.amazonaws.services.backup.model.ListProtectedResourcesRequest list-protected-resources-request]
    (-> this (.listProtectedResources list-protected-resources-request))))

(defn get-backup-selection
  "Returns selection metadata and a document in JSON format that specifies a list of resources that are associated
   with a backup plan.

  get-backup-selection-request - `com.amazonaws.services.backup.model.GetBackupSelectionRequest`

  returns: Result of the GetBackupSelection operation returned by the service. - `com.amazonaws.services.backup.model.GetBackupSelectionResult`

  throws: com.amazonaws.services.backup.model.ResourceNotFoundException - A resource that is required for the action doesn't exist."
  (^com.amazonaws.services.backup.model.GetBackupSelectionResult [^AWSBackup this ^com.amazonaws.services.backup.model.GetBackupSelectionRequest get-backup-selection-request]
    (-> this (.getBackupSelection get-backup-selection-request))))

(defn delete-backup-plan
  "Deletes a backup plan. A backup plan can only be deleted after all associated selections of resources have been
   deleted. Deleting a backup plan deletes the current version of a backup plan. Previous versions, if any, will
   still exist.

  delete-backup-plan-request - `com.amazonaws.services.backup.model.DeleteBackupPlanRequest`

  returns: Result of the DeleteBackupPlan operation returned by the service. - `com.amazonaws.services.backup.model.DeleteBackupPlanResult`

  throws: com.amazonaws.services.backup.model.ResourceNotFoundException - A resource that is required for the action doesn't exist."
  (^com.amazonaws.services.backup.model.DeleteBackupPlanResult [^AWSBackup this ^com.amazonaws.services.backup.model.DeleteBackupPlanRequest delete-backup-plan-request]
    (-> this (.deleteBackupPlan delete-backup-plan-request))))

