(ns com.amazonaws.services.simplesystemsmanagement.AWSSimpleSystemsManagement
  "Interface for accessing Amazon SSM.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSSimpleSystemsManagement instead.


  AWS Systems Manager

  AWS Systems Manager is a collection of capabilities that helps you automate management tasks such as collecting
  system inventory, applying operating system (OS) patches, automating the creation of Amazon Machine Images (AMIs),
  and configuring operating systems (OSs) and applications at scale. Systems Manager lets you remotely and securely
  manage the configuration of your managed instances. A managed instance is any Amazon EC2 instance or
  on-premises machine in your hybrid environment that has been configured for Systems Manager.


  This reference is intended to be used with the AWS Systems Manager User Guide.


  To get started, verify prerequisites and configure managed instances. For more information, see Setting Up AWS
  Systems Manager in the AWS Systems Manager User Guide.


  For information about other API actions you can perform on Amazon EC2 instances, see the Amazon EC2 API Reference. For information about how
  to use a Query API, see Making API Requests."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.simplesystemsmanagement AWSSimpleSystemsManagement]))

(defn put-compliance-items
  "Registers a compliance type and other compliance details on a designated resource. This action lets you register
   custom compliance details with a resource. This call overwrites existing compliance information on the resource,
   so you must provide a full list of compliance items each time that you send the request.


   ComplianceType can be one of the following:




   ExecutionId: The execution ID when the patch, association, or custom compliance item was applied.




   ExecutionType: Specify patch, association, or Custom:string.




   ExecutionTime. The time the patch, association, or custom compliance item was applied to the instance.




   Id: The patch, association, or custom compliance ID.




   Title: A title.




   Status: The status of the compliance item. For example, approved for patches, or Failed
   for associations.




   Severity: A patch severity. For example, critical.




   DocumentName: A SSM document name. For example, AWS-RunPatchBaseline.




   DocumentVersion: An SSM document version number. For example, 4.




   Classification: A patch classification. For example, security updates.




   PatchBaselineId: A patch baseline ID.




   PatchSeverity: A patch severity. For example, Critical.




   PatchState: A patch state. For example, InstancesWithFailedPatches.




   PatchGroup: The name of a patch group.




   InstalledTime: The time the association, patch, or custom compliance item was applied to the resource. Specify
   the time by using the following format: yyyy-MM-dd'T'HH:mm:ss'Z'

  put-compliance-items-request - `com.amazonaws.services.simplesystemsmanagement.model.PutComplianceItemsRequest`

  returns: Result of the PutComplianceItems operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.PutComplianceItemsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.PutComplianceItemsResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.PutComplianceItemsRequest put-compliance-items-request]
    (-> this (.putComplianceItems put-compliance-items-request))))

(defn get-patch-baseline-for-patch-group
  "Retrieves the patch baseline that should be used for the specified patch group.

  get-patch-baseline-for-patch-group-request - `com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineForPatchGroupRequest`

  returns: Result of the GetPatchBaselineForPatchGroup operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineForPatchGroupResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineForPatchGroupResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineForPatchGroupRequest get-patch-baseline-for-patch-group-request]
    (-> this (.getPatchBaselineForPatchGroup get-patch-baseline-for-patch-group-request))))

(defn describe-maintenance-window-targets
  "Lists the targets registered with the maintenance window.

  describe-maintenance-window-targets-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTargetsRequest`

  returns: Result of the DescribeMaintenanceWindowTargets operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTargetsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.DoesNotExistException - Error returned when the ID specified for a resource, such as a maintenance window or Patch baseline, doesn't exist. For information about resource limits in Systems Manager, see AWS Systems Manager Limits."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTargetsResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTargetsRequest describe-maintenance-window-targets-request]
    (-> this (.describeMaintenanceWindowTargets describe-maintenance-window-targets-request))))

(defn update-service-setting
  "ServiceSetting is an account-level setting for an AWS service. This setting defines how a user
   interacts with or uses a service or a feature of a service. For example, if an AWS service charges money to the
   account based on feature or service usage, then the AWS service team might create a default setting of \"false\".
   This means the user can't use this feature unless they change the setting to \"true\" and intentionally opt in for
   a paid feature.


   Services map a SettingId object to a setting value. AWS services teams define the default value for
   a SettingId. You can't create a new SettingId, but you can overwrite the default value
   if you have the ssm:UpdateServiceSetting permission for the setting. Use the
   GetServiceSetting API action to view the current value. Or, use the ResetServiceSetting to change
   the value back to the original value defined by the AWS service team.


   Update the service setting for the account.

  update-service-setting-request - The request body of the UpdateServiceSetting API action. - `com.amazonaws.services.simplesystemsmanagement.model.UpdateServiceSettingRequest`

  returns: Result of the UpdateServiceSetting operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.UpdateServiceSettingResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.UpdateServiceSettingResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateServiceSettingRequest update-service-setting-request]
    (-> this (.updateServiceSetting update-service-setting-request))))

(defn list-tags-for-resource
  "Returns a list of the tags assigned to the specified resource.

  list-tags-for-resource-request - `com.amazonaws.services.simplesystemsmanagement.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidResourceTypeException - The resource type is not valid. For example, if you are attempting to tag an instance, the instance must be a registered, managed instance."
  (^com.amazonaws.services.simplesystemsmanagement.model.ListTagsForResourceResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn terminate-session
  "Permanently ends a session and closes the data connection between the Session Manager client and SSM Agent on the
   instance. A terminated session cannot be resumed.

  terminate-session-request - `com.amazonaws.services.simplesystemsmanagement.model.TerminateSessionRequest`

  returns: Result of the TerminateSession operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.TerminateSessionResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.DoesNotExistException - Error returned when the ID specified for a resource, such as a maintenance window or Patch baseline, doesn't exist. For information about resource limits in Systems Manager, see AWS Systems Manager Limits."
  (^com.amazonaws.services.simplesystemsmanagement.model.TerminateSessionResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.TerminateSessionRequest terminate-session-request]
    (-> this (.terminateSession terminate-session-request))))

(defn list-inventory-entries
  "A list of inventory items returned by the request.

  list-inventory-entries-request - `com.amazonaws.services.simplesystemsmanagement.model.ListInventoryEntriesRequest`

  returns: Result of the ListInventoryEntries operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ListInventoryEntriesResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.ListInventoryEntriesResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.ListInventoryEntriesRequest list-inventory-entries-request]
    (-> this (.listInventoryEntries list-inventory-entries-request))))

(defn describe-automation-executions
  "Provides details about all active and terminated Automation executions.

  describe-automation-executions-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationExecutionsRequest`

  returns: Result of the DescribeAutomationExecutions operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationExecutionsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidFilterKeyException - The specified key is not valid."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationExecutionsResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationExecutionsRequest describe-automation-executions-request]
    (-> this (.describeAutomationExecutions describe-automation-executions-request))))

(defn register-target-with-maintenance-window
  "Registers a target with a maintenance window.

  register-target-with-maintenance-window-request - `com.amazonaws.services.simplesystemsmanagement.model.RegisterTargetWithMaintenanceWindowRequest`

  returns: Result of the RegisterTargetWithMaintenanceWindow operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.RegisterTargetWithMaintenanceWindowResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.IdempotentParameterMismatchException - Error returned when an idempotent operation is retried and the parameters don't match the original call to the API with the same idempotency token."
  (^com.amazonaws.services.simplesystemsmanagement.model.RegisterTargetWithMaintenanceWindowResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.RegisterTargetWithMaintenanceWindowRequest register-target-with-maintenance-window-request]
    (-> this (.registerTargetWithMaintenanceWindow register-target-with-maintenance-window-request))))

(defn delete-resource-data-sync
  "Deletes a Resource Data Sync configuration. After the configuration is deleted, changes to inventory data on
   managed instances are no longer synced with the target Amazon S3 bucket. Deleting a sync configuration does not
   delete data in the target Amazon S3 bucket.

  delete-resource-data-sync-request - `com.amazonaws.services.simplesystemsmanagement.model.DeleteResourceDataSyncRequest`

  returns: Result of the DeleteResourceDataSync operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DeleteResourceDataSyncResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DeleteResourceDataSyncResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteResourceDataSyncRequest delete-resource-data-sync-request]
    (-> this (.deleteResourceDataSync delete-resource-data-sync-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AWSSimpleSystemsManagement this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn describe-instance-associations-status
  "The status of the associations for the instance(s).

  describe-instance-associations-status-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceAssociationsStatusRequest`

  returns: Result of the DescribeInstanceAssociationsStatus operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceAssociationsStatusResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceAssociationsStatusResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceAssociationsStatusRequest describe-instance-associations-status-request]
    (-> this (.describeInstanceAssociationsStatus describe-instance-associations-status-request))))

(defn delete-maintenance-window
  "Deletes a maintenance window.

  delete-maintenance-window-request - `com.amazonaws.services.simplesystemsmanagement.model.DeleteMaintenanceWindowRequest`

  returns: Result of the DeleteMaintenanceWindow operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DeleteMaintenanceWindowResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DeleteMaintenanceWindowResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteMaintenanceWindowRequest delete-maintenance-window-request]
    (-> this (.deleteMaintenanceWindow delete-maintenance-window-request))))

(defn update-maintenance-window-target
  "Modifies the target of an existing maintenance window. You can change the following:




   Name




   Description




   Owner




   IDs for an ID target




   Tags for a Tag target




   From any supported tag type to another. The three supported tag types are ID target, Tag target, and resource
   group. For more information, see Target.





   If a parameter is null, then the corresponding field is not modified.

  update-maintenance-window-target-request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTargetRequest`

  returns: Result of the UpdateMaintenanceWindowTarget operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTargetResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.DoesNotExistException - Error returned when the ID specified for a resource, such as a maintenance window or Patch baseline, doesn't exist. For information about resource limits in Systems Manager, see AWS Systems Manager Limits."
  (^com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTargetResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTargetRequest update-maintenance-window-target-request]
    (-> this (.updateMaintenanceWindowTarget update-maintenance-window-target-request))))

(defn update-maintenance-window
  "Updates an existing maintenance window. Only specified parameters are modified.

  update-maintenance-window-request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowRequest`

  returns: Result of the UpdateMaintenanceWindow operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.DoesNotExistException - Error returned when the ID specified for a resource, such as a maintenance window or Patch baseline, doesn't exist. For information about resource limits in Systems Manager, see AWS Systems Manager Limits."
  (^com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowRequest update-maintenance-window-request]
    (-> this (.updateMaintenanceWindow update-maintenance-window-request))))

(defn deregister-task-from-maintenance-window
  "Removes a task from a maintenance window.

  deregister-task-from-maintenance-window-request - `com.amazonaws.services.simplesystemsmanagement.model.DeregisterTaskFromMaintenanceWindowRequest`

  returns: Result of the DeregisterTaskFromMaintenanceWindow operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DeregisterTaskFromMaintenanceWindowResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.DoesNotExistException - Error returned when the ID specified for a resource, such as a maintenance window or Patch baseline, doesn't exist. For information about resource limits in Systems Manager, see AWS Systems Manager Limits."
  (^com.amazonaws.services.simplesystemsmanagement.model.DeregisterTaskFromMaintenanceWindowResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DeregisterTaskFromMaintenanceWindowRequest deregister-task-from-maintenance-window-request]
    (-> this (.deregisterTaskFromMaintenanceWindow deregister-task-from-maintenance-window-request))))

(defn get-document
  "Gets the contents of the specified Systems Manager document.

  get-document-request - `com.amazonaws.services.simplesystemsmanagement.model.GetDocumentRequest`

  returns: Result of the GetDocument operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetDocumentResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetDocumentResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetDocumentRequest get-document-request]
    (-> this (.getDocument get-document-request))))

(defn register-task-with-maintenance-window
  "Adds a new task to a maintenance window.

  register-task-with-maintenance-window-request - `com.amazonaws.services.simplesystemsmanagement.model.RegisterTaskWithMaintenanceWindowRequest`

  returns: Result of the RegisterTaskWithMaintenanceWindow operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.RegisterTaskWithMaintenanceWindowResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.IdempotentParameterMismatchException - Error returned when an idempotent operation is retried and the parameters don't match the original call to the API with the same idempotency token."
  (^com.amazonaws.services.simplesystemsmanagement.model.RegisterTaskWithMaintenanceWindowResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.RegisterTaskWithMaintenanceWindowRequest register-task-with-maintenance-window-request]
    (-> this (.registerTaskWithMaintenanceWindow register-task-with-maintenance-window-request))))

(defn describe-maintenance-window-tasks
  "Lists the tasks in a maintenance window.

  describe-maintenance-window-tasks-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTasksRequest`

  returns: Result of the DescribeMaintenanceWindowTasks operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTasksResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.DoesNotExistException - Error returned when the ID specified for a resource, such as a maintenance window or Patch baseline, doesn't exist. For information about resource limits in Systems Manager, see AWS Systems Manager Limits."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTasksResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTasksRequest describe-maintenance-window-tasks-request]
    (-> this (.describeMaintenanceWindowTasks describe-maintenance-window-tasks-request))))

(defn get-ops-summary
  "View a summary of OpsItems based on specified filters and aggregators.

  get-ops-summary-request - `com.amazonaws.services.simplesystemsmanagement.model.GetOpsSummaryRequest`

  returns: Result of the GetOpsSummary operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetOpsSummaryResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetOpsSummaryResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetOpsSummaryRequest get-ops-summary-request]
    (-> this (.getOpsSummary get-ops-summary-request))))

(defn describe-association-execution-targets
  "Use this API action to view information about a specific execution of a specific association.

  describe-association-execution-targets-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationExecutionTargetsRequest`

  returns: Result of the DescribeAssociationExecutionTargets operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationExecutionTargetsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationExecutionTargetsResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationExecutionTargetsRequest describe-association-execution-targets-request]
    (-> this (.describeAssociationExecutionTargets describe-association-execution-targets-request))))

(defn describe-maintenance-window-execution-tasks
  "For a given maintenance window execution, lists the tasks that were run.

  describe-maintenance-window-execution-tasks-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTasksRequest`

  returns: Result of the DescribeMaintenanceWindowExecutionTasks operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTasksResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.DoesNotExistException - Error returned when the ID specified for a resource, such as a maintenance window or Patch baseline, doesn't exist. For information about resource limits in Systems Manager, see AWS Systems Manager Limits."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTasksResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTasksRequest describe-maintenance-window-execution-tasks-request]
    (-> this (.describeMaintenanceWindowExecutionTasks describe-maintenance-window-execution-tasks-request))))

(defn describe-ops-items
  "Query a set of OpsItems. You must have permission in AWS Identity and Access Management (IAM) to query a list of
   OpsItems. For more information, see Getting Started
   with OpsCenter in the AWS Systems Manager User Guide.


   Operations engineers and IT professionals use OpsCenter to view, investigate, and remediate operational issues
   impacting the performance and health of their AWS resources. For more information, see AWS Systems Manager
   OpsCenter in the AWS Systems Manager User Guide.

  describe-ops-items-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeOpsItemsRequest`

  returns: Result of the DescribeOpsItems operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeOpsItemsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeOpsItemsResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeOpsItemsRequest describe-ops-items-request]
    (-> this (.describeOpsItems describe-ops-items-request))))

(defn start-associations-once
  "Use this API action to run an association immediately and only one time. This action can be helpful when
   troubleshooting associations.

  start-associations-once-request - `com.amazonaws.services.simplesystemsmanagement.model.StartAssociationsOnceRequest`

  returns: Result of the StartAssociationsOnce operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.StartAssociationsOnceResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidAssociationException - The association is not valid or does not exist."
  (^com.amazonaws.services.simplesystemsmanagement.model.StartAssociationsOnceResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.StartAssociationsOnceRequest start-associations-once-request]
    (-> this (.startAssociationsOnce start-associations-once-request))))

(defn cancel-command
  "Attempts to cancel the command specified by the Command ID. There is no guarantee that the command will be
   terminated and the underlying process stopped.

  cancel-command-request - `com.amazonaws.services.simplesystemsmanagement.model.CancelCommandRequest`

  returns: Result of the CancelCommand operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.CancelCommandResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.CancelCommandResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.CancelCommandRequest cancel-command-request]
    (-> this (.cancelCommand cancel-command-request))))

(defn describe-association
  "Describes the association for the specified target or instance. If you created the association by using the
   Targets parameter, then you must retrieve the association by using the association ID. If you
   created the association by specifying an instance ID and a Systems Manager document, then you retrieve the
   association by specifying the document name and the instance ID.

  describe-association-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationRequest`

  returns: Result of the DescribeAssociation operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.AssociationDoesNotExistException - The specified association does not exist."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationRequest describe-association-request]
    (-> this (.describeAssociation describe-association-request))))

(defn list-commands
  "Lists the commands requested by users of the AWS account.

  list-commands-request - `com.amazonaws.services.simplesystemsmanagement.model.ListCommandsRequest`

  returns: Result of the ListCommands operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ListCommandsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.ListCommandsResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.ListCommandsRequest list-commands-request]
    (-> this (.listCommands list-commands-request))))

(defn create-ops-item
  "Creates a new OpsItem. You must have permission in AWS Identity and Access Management (IAM) to create a new
   OpsItem. For more information, see Getting Started
   with OpsCenter in the AWS Systems Manager User Guide.


   Operations engineers and IT professionals use OpsCenter to view, investigate, and remediate operational issues
   impacting the performance and health of their AWS resources. For more information, see AWS Systems Manager
   OpsCenter in the AWS Systems Manager User Guide.

  create-ops-item-request - `com.amazonaws.services.simplesystemsmanagement.model.CreateOpsItemRequest`

  returns: Result of the CreateOpsItem operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.CreateOpsItemResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.CreateOpsItemResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.CreateOpsItemRequest create-ops-item-request]
    (-> this (.createOpsItem create-ops-item-request))))

(defn cancel-maintenance-window-execution
  "Stops a maintenance window execution that is already in progress and cancels any tasks in the window that have
   not already starting running. (Tasks already in progress will continue to completion.)

  cancel-maintenance-window-execution-request - `com.amazonaws.services.simplesystemsmanagement.model.CancelMaintenanceWindowExecutionRequest`

  returns: Result of the CancelMaintenanceWindowExecution operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.CancelMaintenanceWindowExecutionResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.CancelMaintenanceWindowExecutionResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.CancelMaintenanceWindowExecutionRequest cancel-maintenance-window-execution-request]
    (-> this (.cancelMaintenanceWindowExecution cancel-maintenance-window-execution-request))))

(defn get-default-patch-baseline
  "Retrieves the default patch baseline. Note that Systems Manager supports creating multiple default patch
   baselines. For example, you can create a default patch baseline for each operating system.


   If you do not specify an operating system value, the default patch baseline for Windows is returned.

  get-default-patch-baseline-request - `com.amazonaws.services.simplesystemsmanagement.model.GetDefaultPatchBaselineRequest`

  returns: Result of the GetDefaultPatchBaseline operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetDefaultPatchBaselineResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetDefaultPatchBaselineResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetDefaultPatchBaselineRequest get-default-patch-baseline-request]
    (-> this (.getDefaultPatchBaseline get-default-patch-baseline-request))))

(defn create-association-batch
  "Associates the specified Systems Manager document with the specified instances or targets.


   When you associate a document with one or more instances using instance IDs or tags, SSM Agent running on the
   instance processes the document and configures the instance as specified.


   If you associate a document with an instance that already has an associated document, the system returns the
   AssociationAlreadyExists exception.

  create-association-batch-request - `com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationBatchRequest`

  returns: Result of the CreateAssociationBatch operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationBatchResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidDocumentException - The specified document does not exist."
  (^com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationBatchResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationBatchRequest create-association-batch-request]
    (-> this (.createAssociationBatch create-association-batch-request))))

(defn delete-inventory
  "Delete a custom inventory type, or the data associated with a custom Inventory type. Deleting a custom inventory
   type is also referred to as deleting a custom inventory schema.

  delete-inventory-request - `com.amazonaws.services.simplesystemsmanagement.model.DeleteInventoryRequest`

  returns: Result of the DeleteInventory operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DeleteInventoryResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DeleteInventoryResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteInventoryRequest delete-inventory-request]
    (-> this (.deleteInventory delete-inventory-request))))

(defn create-document
  "Creates a Systems Manager document.


   After you create a document, you can use CreateAssociation to associate it with one or more running instances.

  create-document-request - `com.amazonaws.services.simplesystemsmanagement.model.CreateDocumentRequest`

  returns: Result of the CreateDocument operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.CreateDocumentResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.DocumentAlreadyExistsException - The specified document already exists."
  (^com.amazonaws.services.simplesystemsmanagement.model.CreateDocumentResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.CreateDocumentRequest create-document-request]
    (-> this (.createDocument create-document-request))))

(defn register-default-patch-baseline
  "Defines the default patch baseline for the relevant operating system.


   To reset the AWS predefined patch baseline as the default, specify the full patch baseline ARN as the baseline ID
   value. For example, for CentOS, specify
   arn:aws:ssm:us-east-2:733109147000:patchbaseline/pb-0574b43a65ea646ed instead of
   pb-0574b43a65ea646ed.

  register-default-patch-baseline-request - `com.amazonaws.services.simplesystemsmanagement.model.RegisterDefaultPatchBaselineRequest`

  returns: Result of the RegisterDefaultPatchBaseline operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.RegisterDefaultPatchBaselineResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidResourceIdException - The resource ID is not valid. Verify that you entered the correct ID and try again."
  (^com.amazonaws.services.simplesystemsmanagement.model.RegisterDefaultPatchBaselineResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.RegisterDefaultPatchBaselineRequest register-default-patch-baseline-request]
    (-> this (.registerDefaultPatchBaseline register-default-patch-baseline-request))))

(defn start-automation-execution
  "Initiates execution of an Automation document.

  start-automation-execution-request - `com.amazonaws.services.simplesystemsmanagement.model.StartAutomationExecutionRequest`

  returns: Result of the StartAutomationExecution operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.StartAutomationExecutionResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.AutomationDefinitionNotFoundException - An Automation document with the specified name could not be found."
  (^com.amazonaws.services.simplesystemsmanagement.model.StartAutomationExecutionResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.StartAutomationExecutionRequest start-automation-execution-request]
    (-> this (.startAutomationExecution start-automation-execution-request))))

(defn describe-effective-instance-associations
  "All associations for the instance(s).

  describe-effective-instance-associations-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectiveInstanceAssociationsRequest`

  returns: Result of the DescribeEffectiveInstanceAssociations operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectiveInstanceAssociationsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectiveInstanceAssociationsResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectiveInstanceAssociationsRequest describe-effective-instance-associations-request]
    (-> this (.describeEffectiveInstanceAssociations describe-effective-instance-associations-request))))

(defn describe-maintenance-window-execution-task-invocations
  "Retrieves the individual task executions (one per target) for a particular task run as part of a maintenance
   window execution.

  describe-maintenance-window-execution-task-invocations-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTaskInvocationsRequest`

  returns: Result of the DescribeMaintenanceWindowExecutionTaskInvocations operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTaskInvocationsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.DoesNotExistException - Error returned when the ID specified for a resource, such as a maintenance window or Patch baseline, doesn't exist. For information about resource limits in Systems Manager, see AWS Systems Manager Limits."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTaskInvocationsResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTaskInvocationsRequest describe-maintenance-window-execution-task-invocations-request]
    (-> this (.describeMaintenanceWindowExecutionTaskInvocations describe-maintenance-window-execution-task-invocations-request))))

(defn get-patch-baseline
  "Retrieves information about a patch baseline.

  get-patch-baseline-request - `com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineRequest`

  returns: Result of the GetPatchBaseline operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.DoesNotExistException - Error returned when the ID specified for a resource, such as a maintenance window or Patch baseline, doesn't exist. For information about resource limits in Systems Manager, see AWS Systems Manager Limits."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineRequest get-patch-baseline-request]
    (-> this (.getPatchBaseline get-patch-baseline-request))))

(defn update-ops-item
  "Edit or change an OpsItem. You must have permission in AWS Identity and Access Management (IAM) to update an
   OpsItem. For more information, see Getting Started
   with OpsCenter in the AWS Systems Manager User Guide.


   Operations engineers and IT professionals use OpsCenter to view, investigate, and remediate operational issues
   impacting the performance and health of their AWS resources. For more information, see AWS Systems Manager
   OpsCenter in the AWS Systems Manager User Guide.

  update-ops-item-request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateOpsItemRequest`

  returns: Result of the UpdateOpsItem operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.UpdateOpsItemResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.UpdateOpsItemResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateOpsItemRequest update-ops-item-request]
    (-> this (.updateOpsItem update-ops-item-request))))

(defn describe-maintenance-windows
  "Retrieves the maintenance windows in an AWS account.

  describe-maintenance-windows-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsRequest`

  returns: Result of the DescribeMaintenanceWindows operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsRequest describe-maintenance-windows-request]
    (-> this (.describeMaintenanceWindows describe-maintenance-windows-request))))

(defn get-maintenance-window-execution
  "Retrieves details about a specific a maintenance window execution.

  get-maintenance-window-execution-request - `com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionRequest`

  returns: Result of the GetMaintenanceWindowExecution operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.DoesNotExistException - Error returned when the ID specified for a resource, such as a maintenance window or Patch baseline, doesn't exist. For information about resource limits in Systems Manager, see AWS Systems Manager Limits."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionRequest get-maintenance-window-execution-request]
    (-> this (.getMaintenanceWindowExecution get-maintenance-window-execution-request))))

(defn update-managed-instance-role
  "Assigns or changes an Amazon Identity and Access Management (IAM) role for the managed instance.

  update-managed-instance-role-request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateManagedInstanceRoleRequest`

  returns: Result of the UpdateManagedInstanceRole operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.UpdateManagedInstanceRoleResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidInstanceIdException - The following problems can cause this exception: You do not have permission to access the instance. SSM Agent is not running. Verify that SSM Agent is running. SSM Agent is not registered with the SSM endpoint. Try reinstalling SSM Agent. The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states are: Shutting-down and Terminated."
  (^com.amazonaws.services.simplesystemsmanagement.model.UpdateManagedInstanceRoleResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateManagedInstanceRoleRequest update-managed-instance-role-request]
    (-> this (.updateManagedInstanceRole update-managed-instance-role-request))))

(defn list-resource-data-sync
  "Lists your resource data sync configurations. Includes information about the last time a sync attempted to start,
   the last sync status, and the last time a sync successfully completed.


   The number of sync configurations might be too large to return using a single call to
   ListResourceDataSync. You can limit the number of sync configurations returned by using the
   MaxResults parameter. To determine whether there are more sync configurations to list, check the
   value of NextToken in the output. If there are more sync configurations to list, you can request
   them by specifying the NextToken returned in the call to the parameter of a subsequent call.

  list-resource-data-sync-request - `com.amazonaws.services.simplesystemsmanagement.model.ListResourceDataSyncRequest`

  returns: Result of the ListResourceDataSync operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ListResourceDataSyncResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.ListResourceDataSyncResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.ListResourceDataSyncRequest list-resource-data-sync-request]
    (-> this (.listResourceDataSync list-resource-data-sync-request))))

(defn update-association-status
  "Updates the status of the Systems Manager document associated with the specified instance.

  update-association-status-request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationStatusRequest`

  returns: Result of the UpdateAssociationStatus operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationStatusResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationStatusResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationStatusRequest update-association-status-request]
    (-> this (.updateAssociationStatus update-association-status-request))))

(defn get-parameters
  "Get details of a parameter. Don't confuse this API action with the GetParameter API action.

  get-parameters-request - `com.amazonaws.services.simplesystemsmanagement.model.GetParametersRequest`

  returns: Result of the GetParameters operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetParametersResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidKeyIdException - The query key ID is not valid."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetParametersResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetParametersRequest get-parameters-request]
    (-> this (.getParameters get-parameters-request))))

(defn update-document
  "Updates one or more values for an SSM document.

  update-document-request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentRequest`

  returns: Result of the UpdateDocument operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidDocumentOperationException - You attempted to delete a document while it is still shared. You must stop sharing the document before you can delete it."
  (^com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentRequest update-document-request]
    (-> this (.updateDocument update-document-request))))

(defn describe-instance-patch-states
  "Retrieves the high-level patch state of one or more instances.

  describe-instance-patch-states-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesRequest`

  returns: Result of the DescribeInstancePatchStates operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesRequest describe-instance-patch-states-request]
    (-> this (.describeInstancePatchStates describe-instance-patch-states-request))))

(defn describe-patch-baselines
  "Lists the patch baselines in your AWS account.

  describe-patch-baselines-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribePatchBaselinesRequest`

  returns: Result of the DescribePatchBaselines operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribePatchBaselinesResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribePatchBaselinesResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribePatchBaselinesRequest describe-patch-baselines-request]
    (-> this (.describePatchBaselines describe-patch-baselines-request))))

(defn describe-patch-properties
  "Lists the properties of available patches organized by product, product family, classification, severity, and
   other properties of available patches. You can use the reported properties in the filters you specify in requests
   for actions such as CreatePatchBaseline, UpdatePatchBaseline, DescribeAvailablePatches, and
   DescribePatchBaselines.


   The following section lists the properties that can be used in filters for each major operating system type:


   WINDOWS


   Valid properties: PRODUCT, PRODUCT_FAMILY, CLASSIFICATION, MSRC_SEVERITY


   AMAZON_LINUX


   Valid properties: PRODUCT, CLASSIFICATION, SEVERITY


   AMAZON_LINUX_2


   Valid properties: PRODUCT, CLASSIFICATION, SEVERITY


   UBUNTU


   Valid properties: PRODUCT, PRIORITY


   REDHAT_ENTERPRISE_LINUX


   Valid properties: PRODUCT, CLASSIFICATION, SEVERITY


   SUSE


   Valid properties: PRODUCT, CLASSIFICATION, SEVERITY


   CENTOS


   Valid properties: PRODUCT, CLASSIFICATION, SEVERITY

  describe-patch-properties-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribePatchPropertiesRequest`

  returns: Result of the DescribePatchProperties operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribePatchPropertiesResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribePatchPropertiesResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribePatchPropertiesRequest describe-patch-properties-request]
    (-> this (.describePatchProperties describe-patch-properties-request))))

(defn create-resource-data-sync
  "Creates a resource data sync configuration to a single bucket in Amazon S3. This is an asynchronous operation
   that returns immediately. After a successful initial sync is completed, the system continuously syncs data to the
   Amazon S3 bucket. To check the status of the sync, use the ListResourceDataSync.


   By default, data is not encrypted in Amazon S3. We strongly recommend that you enable encryption in Amazon S3 to
   ensure secure data storage. We also recommend that you secure access to the Amazon S3 bucket by creating a
   restrictive bucket policy. For more information, see Configuring
   Resource Data Sync for Inventory in the AWS Systems Manager User Guide.

  create-resource-data-sync-request - `com.amazonaws.services.simplesystemsmanagement.model.CreateResourceDataSyncRequest`

  returns: Result of the CreateResourceDataSync operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.CreateResourceDataSyncResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.CreateResourceDataSyncResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.CreateResourceDataSyncRequest create-resource-data-sync-request]
    (-> this (.createResourceDataSync create-resource-data-sync-request))))

(defn describe-maintenance-window-executions
  "Lists the executions of a maintenance window. This includes information about when the maintenance window was
   scheduled to be active, and information about tasks registered and run with the maintenance window.

  describe-maintenance-window-executions-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionsRequest`

  returns: Result of the DescribeMaintenanceWindowExecutions operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionsResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionsRequest describe-maintenance-window-executions-request]
    (-> this (.describeMaintenanceWindowExecutions describe-maintenance-window-executions-request))))

(defn get-connection-status
  "Retrieves the Session Manager connection status for an instance to determine whether it is connected and ready to
   receive Session Manager connections.

  get-connection-status-request - `com.amazonaws.services.simplesystemsmanagement.model.GetConnectionStatusRequest`

  returns: Result of the GetConnectionStatus operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetConnectionStatusResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetConnectionStatusResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetConnectionStatusRequest get-connection-status-request]
    (-> this (.getConnectionStatus get-connection-status-request))))

(defn create-patch-baseline
  "Creates a patch baseline.



   For information about valid key and value pairs in PatchFilters for each supported operating system
   type, see PatchFilter.

  create-patch-baseline-request - `com.amazonaws.services.simplesystemsmanagement.model.CreatePatchBaselineRequest`

  returns: Result of the CreatePatchBaseline operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.CreatePatchBaselineResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.IdempotentParameterMismatchException - Error returned when an idempotent operation is retried and the parameters don't match the original call to the API with the same idempotency token."
  (^com.amazonaws.services.simplesystemsmanagement.model.CreatePatchBaselineResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.CreatePatchBaselineRequest create-patch-baseline-request]
    (-> this (.createPatchBaseline create-patch-baseline-request))))

(defn list-associations
  "Lists the associations for the specified Systems Manager document or instance.

  list-associations-request - `com.amazonaws.services.simplesystemsmanagement.model.ListAssociationsRequest`

  returns: Result of the ListAssociations operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ListAssociationsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.ListAssociationsResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.ListAssociationsRequest list-associations-request]
    (-> this (.listAssociations list-associations-request))))

(defn describe-instance-patches
  "Retrieves information about the patches on the specified instance and their state relative to the patch baseline
   being used for the instance.

  describe-instance-patches-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchesRequest`

  returns: Result of the DescribeInstancePatches operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchesResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchesResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchesRequest describe-instance-patches-request]
    (-> this (.describeInstancePatches describe-instance-patches-request))))

(defn list-resource-compliance-summaries
  "Returns a resource-level summary count. The summary includes information about compliant and non-compliant
   statuses and detailed compliance-item severity counts, according to the filter criteria you specify.

  list-resource-compliance-summaries-request - `com.amazonaws.services.simplesystemsmanagement.model.ListResourceComplianceSummariesRequest`

  returns: Result of the ListResourceComplianceSummaries operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ListResourceComplianceSummariesResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidFilterException - The filter name is not valid. Verify the you entered the correct name and try again."
  (^com.amazonaws.services.simplesystemsmanagement.model.ListResourceComplianceSummariesResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.ListResourceComplianceSummariesRequest list-resource-compliance-summaries-request]
    (-> this (.listResourceComplianceSummaries list-resource-compliance-summaries-request))))

(defn describe-inventory-deletions
  "Describes a specific delete inventory operation.

  describe-inventory-deletions-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInventoryDeletionsRequest`

  returns: Result of the DescribeInventoryDeletions operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInventoryDeletionsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeInventoryDeletionsResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeInventoryDeletionsRequest describe-inventory-deletions-request]
    (-> this (.describeInventoryDeletions describe-inventory-deletions-request))))

(defn describe-activations
  "Describes details about the activation, such as the date and time the activation was created, its expiration
   date, the IAM role assigned to the instances in the activation, and the number of instances registered by using
   this activation.

  describe-activations-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeActivationsRequest`

  returns: Result of the DescribeActivations operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeActivationsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidFilterException - The filter name is not valid. Verify the you entered the correct name and try again."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeActivationsResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeActivationsRequest describe-activations-request]
    (-> this (.describeActivations describe-activations-request))))

(defn reset-service-setting
  "ServiceSetting is an account-level setting for an AWS service. This setting defines how a user
   interacts with or uses a service or a feature of a service. For example, if an AWS service charges money to the
   account based on feature or service usage, then the AWS service team might create a default setting of \"false\".
   This means the user can't use this feature unless they change the setting to \"true\" and intentionally opt in for
   a paid feature.


   Services map a SettingId object to a setting value. AWS services teams define the default value for
   a SettingId. You can't create a new SettingId, but you can overwrite the default value
   if you have the ssm:UpdateServiceSetting permission for the setting. Use the
   GetServiceSetting API action to view the current value. Use the UpdateServiceSetting API action to
   change the default setting.


   Reset the service setting for the account to the default value as provisioned by the AWS service team.

  reset-service-setting-request - The request body of the ResetServiceSetting API action. - `com.amazonaws.services.simplesystemsmanagement.model.ResetServiceSettingRequest`

  returns: Result of the ResetServiceSetting operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ResetServiceSettingResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.ResetServiceSettingResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.ResetServiceSettingRequest reset-service-setting-request]
    (-> this (.resetServiceSetting reset-service-setting-request))))

(defn label-parameter-version
  "A parameter label is a user-defined alias to help you manage different versions of a parameter. When you modify a
   parameter, Systems Manager automatically saves a new version and increments the version number by one. A label
   can help you remember the purpose of a parameter when there are multiple versions.


   Parameter labels have the following requirements and restrictions.




   A version of a parameter can have a maximum of 10 labels.




   You can't attach the same label to different versions of the same parameter. For example, if version 1 has the
   label Production, then you can't attach Production to version 2.




   You can move a label from one version of a parameter to another.




   You can't create a label when you create a new parameter. You must attach a label to a specific version of a
   parameter.




   You can't delete a parameter label. If you no longer want to use a parameter label, then you must move it to a
   different version of a parameter.




   A label can have a maximum of 100 characters.




   Labels can contain letters (case sensitive), numbers, periods (.), hyphens (-), or underscores (_).




   Labels can't begin with a number, \"aws,\" or \"ssm\" (not case sensitive). If a label fails to meet these
   requirements, then the label is not associated with a parameter and the system displays it in the list of
   InvalidLabels.

  label-parameter-version-request - `com.amazonaws.services.simplesystemsmanagement.model.LabelParameterVersionRequest`

  returns: Result of the LabelParameterVersion operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.LabelParameterVersionResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.LabelParameterVersionResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.LabelParameterVersionRequest label-parameter-version-request]
    (-> this (.labelParameterVersion label-parameter-version-request))))

(defn list-command-invocations
  "An invocation is copy of a command sent to a specific instance. A command can apply to one or more instances. A
   command invocation applies to one instance. For example, if a user runs SendCommand against three instances, then
   a command invocation is created for each requested instance ID. ListCommandInvocations provide status about
   command execution.

  list-command-invocations-request - `com.amazonaws.services.simplesystemsmanagement.model.ListCommandInvocationsRequest`

  returns: Result of the ListCommandInvocations operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ListCommandInvocationsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.ListCommandInvocationsResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.ListCommandInvocationsRequest list-command-invocations-request]
    (-> this (.listCommandInvocations list-command-invocations-request))))

(defn get-parameters-by-path
  "Retrieve parameters in a specific hierarchy. For more information, see Working with
   Systems Manager Parameters in the AWS Systems Manager User Guide.


   Request results are returned on a best-effort basis. If you specify MaxResults in the request, the
   response includes information up to the limit specified. The number of items returned, however, can be between
   zero and the value of MaxResults. If the service reaches an internal limit while processing the
   results, it stops the operation and returns the matching values up to that point and a NextToken.
   You can specify the NextToken in a subsequent call to get the next set of results.



   This API action doesn't support filtering by tags.

  get-parameters-by-path-request - `com.amazonaws.services.simplesystemsmanagement.model.GetParametersByPathRequest`

  returns: Result of the GetParametersByPath operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetParametersByPathResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetParametersByPathResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetParametersByPathRequest get-parameters-by-path-request]
    (-> this (.getParametersByPath get-parameters-by-path-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSSimpleSystemsManagement this]
    (-> this (.shutdown))))

(defn create-association
  "Associates the specified Systems Manager document with the specified instances or targets.


   When you associate a document with one or more instances using instance IDs or tags, SSM Agent running on the
   instance processes the document and configures the instance as specified.


   If you associate a document with an instance that already has an associated document, the system returns the
   AssociationAlreadyExists exception.

  create-association-request - `com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationRequest`

  returns: Result of the CreateAssociation operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidDocumentException - The specified document does not exist."
  (^com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationRequest create-association-request]
    (-> this (.createAssociation create-association-request))))

(defn put-inventory
  "Bulk update custom inventory items on one more instance. The request adds an inventory item, if it doesn't
   already exist, or updates an inventory item, if it does exist.

  put-inventory-request - `com.amazonaws.services.simplesystemsmanagement.model.PutInventoryRequest`

  returns: Result of the PutInventory operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.PutInventoryResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.SubTypeCountLimitExceededException - The sub-type count exceeded the limit for the inventory type."
  (^com.amazonaws.services.simplesystemsmanagement.model.PutInventoryResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.PutInventoryRequest put-inventory-request]
    (-> this (.putInventory put-inventory-request))))

(defn describe-document-permission
  "Describes the permissions for a Systems Manager document. If you created the document, you are the owner. If a
   document is shared, it can either be shared privately (by specifying a user's AWS account ID) or publicly
   (All).

  describe-document-permission-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentPermissionRequest`

  returns: Result of the DescribeDocumentPermission operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentPermissionResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentPermissionResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentPermissionRequest describe-document-permission-request]
    (-> this (.describeDocumentPermission describe-document-permission-request))))

(defn delete-patch-baseline
  "Deletes a patch baseline.

  delete-patch-baseline-request - `com.amazonaws.services.simplesystemsmanagement.model.DeletePatchBaselineRequest`

  returns: Result of the DeletePatchBaseline operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DeletePatchBaselineResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.ResourceInUseException - Error returned if an attempt is made to delete a patch baseline that is registered for a patch group."
  (^com.amazonaws.services.simplesystemsmanagement.model.DeletePatchBaselineResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DeletePatchBaselineRequest delete-patch-baseline-request]
    (-> this (.deletePatchBaseline delete-patch-baseline-request))))

(defn update-document-default-version
  "Set the default version of a document.

  update-document-default-version-request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentDefaultVersionRequest`

  returns: Result of the UpdateDocumentDefaultVersion operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentDefaultVersionResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentDefaultVersionResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentDefaultVersionRequest update-document-default-version-request]
    (-> this (.updateDocumentDefaultVersion update-document-default-version-request))))

(defn update-maintenance-window-task
  "Modifies a task assigned to a maintenance window. You can't change the task type, but you can change the
   following values:




   TaskARN. For example, you can change a RUN_COMMAND task from AWS-RunPowerShellScript to AWS-RunShellScript.




   ServiceRoleArn




   TaskInvocationParameters




   Priority




   MaxConcurrency




   MaxErrors




   If a parameter is null, then the corresponding field is not modified. Also, if you set Replace to true, then all
   fields required by the RegisterTaskWithMaintenanceWindow action are required for this request. Optional
   fields that aren't specified are set to null.

  update-maintenance-window-task-request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTaskRequest`

  returns: Result of the UpdateMaintenanceWindowTask operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTaskResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.DoesNotExistException - Error returned when the ID specified for a resource, such as a maintenance window or Patch baseline, doesn't exist. For information about resource limits in Systems Manager, see AWS Systems Manager Limits."
  (^com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTaskResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTaskRequest update-maintenance-window-task-request]
    (-> this (.updateMaintenanceWindowTask update-maintenance-window-task-request))))

(defn list-document-versions
  "List all versions for a document.

  list-document-versions-request - `com.amazonaws.services.simplesystemsmanagement.model.ListDocumentVersionsRequest`

  returns: Result of the ListDocumentVersions operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ListDocumentVersionsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.ListDocumentVersionsResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.ListDocumentVersionsRequest list-document-versions-request]
    (-> this (.listDocumentVersions list-document-versions-request))))

(defn delete-parameters
  "Delete a list of parameters.

  delete-parameters-request - `com.amazonaws.services.simplesystemsmanagement.model.DeleteParametersRequest`

  returns: Result of the DeleteParameters operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DeleteParametersResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DeleteParametersResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteParametersRequest delete-parameters-request]
    (-> this (.deleteParameters delete-parameters-request))))

(defn describe-sessions
  "Retrieves a list of all active sessions (both connected and disconnected) or terminated sessions from the past 30
   days.

  describe-sessions-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeSessionsRequest`

  returns: Result of the DescribeSessions operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeSessionsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeSessionsResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeSessionsRequest describe-sessions-request]
    (-> this (.describeSessions describe-sessions-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"ssm.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://ssm.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AWSSimpleSystemsManagement this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn describe-parameters
  "Get information about a parameter.


   Request results are returned on a best-effort basis. If you specify MaxResults in the request, the
   response includes information up to the limit specified. The number of items returned, however, can be between
   zero and the value of MaxResults. If the service reaches an internal limit while processing the
   results, it stops the operation and returns the matching values up to that point and a NextToken.
   You can specify the NextToken in a subsequent call to get the next set of results.

  describe-parameters-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeParametersRequest`

  returns: Result of the DescribeParameters operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeParametersResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeParametersResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeParametersRequest describe-parameters-request]
    (-> this (.describeParameters describe-parameters-request))))

(defn get-parameter
  "Get information about a parameter by using the parameter name. Don't confuse this API action with the
   GetParameters API action.

  get-parameter-request - `com.amazonaws.services.simplesystemsmanagement.model.GetParameterRequest`

  returns: Result of the GetParameter operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetParameterResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetParameterResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetParameterRequest get-parameter-request]
    (-> this (.getParameter get-parameter-request))))

(defn stop-automation-execution
  "Stop an Automation that is currently running.

  stop-automation-execution-request - `com.amazonaws.services.simplesystemsmanagement.model.StopAutomationExecutionRequest`

  returns: Result of the StopAutomationExecution operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.StopAutomationExecutionResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.AutomationExecutionNotFoundException - There is no automation execution information for the requested automation execution ID."
  (^com.amazonaws.services.simplesystemsmanagement.model.StopAutomationExecutionResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.StopAutomationExecutionRequest stop-automation-execution-request]
    (-> this (.stopAutomationExecution stop-automation-execution-request))))

(defn describe-patch-groups
  "Lists all patch groups that have been registered with patch baselines.

  describe-patch-groups-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupsRequest`

  returns: Result of the DescribePatchGroups operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupsResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupsRequest describe-patch-groups-request]
    (-> this (.describePatchGroups describe-patch-groups-request))))

(defn create-maintenance-window
  "Creates a new maintenance window.

  create-maintenance-window-request - `com.amazonaws.services.simplesystemsmanagement.model.CreateMaintenanceWindowRequest`

  returns: Result of the CreateMaintenanceWindow operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.CreateMaintenanceWindowResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.IdempotentParameterMismatchException - Error returned when an idempotent operation is retried and the parameters don't match the original call to the API with the same idempotency token."
  (^com.amazonaws.services.simplesystemsmanagement.model.CreateMaintenanceWindowResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.CreateMaintenanceWindowRequest create-maintenance-window-request]
    (-> this (.createMaintenanceWindow create-maintenance-window-request))))

(defn list-documents
  "Describes one or more of your Systems Manager documents.

  list-documents-request - `com.amazonaws.services.simplesystemsmanagement.model.ListDocumentsRequest`

  returns: Result of the ListDocuments operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ListDocumentsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.ListDocumentsResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.ListDocumentsRequest list-documents-request]
    (-> this (.listDocuments list-documents-request)))
  (^com.amazonaws.services.simplesystemsmanagement.model.ListDocumentsResult [^AWSSimpleSystemsManagement this]
    (-> this (.listDocuments))))

(defn deregister-patch-baseline-for-patch-group
  "Removes a patch group from a patch baseline.

  deregister-patch-baseline-for-patch-group-request - `com.amazonaws.services.simplesystemsmanagement.model.DeregisterPatchBaselineForPatchGroupRequest`

  returns: Result of the DeregisterPatchBaselineForPatchGroup operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DeregisterPatchBaselineForPatchGroupResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidResourceIdException - The resource ID is not valid. Verify that you entered the correct ID and try again."
  (^com.amazonaws.services.simplesystemsmanagement.model.DeregisterPatchBaselineForPatchGroupResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DeregisterPatchBaselineForPatchGroupRequest deregister-patch-baseline-for-patch-group-request]
    (-> this (.deregisterPatchBaselineForPatchGroup deregister-patch-baseline-for-patch-group-request))))

(defn start-session
  "Initiates a connection to a target (for example, an instance) for a Session Manager session. Returns a URL and
   token that can be used to open a WebSocket connection for sending input and receiving outputs.



   AWS CLI usage: start-session is an interactive command that requires the Session Manager plugin to
   be installed on the client machine making the call. For information, see
   Install the Session Manager Plugin for the AWS CLI in the AWS Systems Manager User Guide.

  start-session-request - `com.amazonaws.services.simplesystemsmanagement.model.StartSessionRequest`

  returns: Result of the StartSession operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.StartSessionResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidDocumentException - The specified document does not exist."
  (^com.amazonaws.services.simplesystemsmanagement.model.StartSessionResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.StartSessionRequest start-session-request]
    (-> this (.startSession start-session-request))))

(defn get-service-setting
  "ServiceSetting is an account-level setting for an AWS service. This setting defines how a user
   interacts with or uses a service or a feature of a service. For example, if an AWS service charges money to the
   account based on feature or service usage, then the AWS service team might create a default setting of \"false\".
   This means the user can't use this feature unless they change the setting to \"true\" and intentionally opt in for
   a paid feature.


   Services map a SettingId object to a setting value. AWS services teams define the default value for
   a SettingId. You can't create a new SettingId, but you can overwrite the default value
   if you have the ssm:UpdateServiceSetting permission for the setting. Use the
   UpdateServiceSetting API action to change the default setting. Or use the ResetServiceSetting to
   change the value back to the original value defined by the AWS service team.


   Query the current service setting for the account.

  get-service-setting-request - The request body of the GetServiceSetting API action. - `com.amazonaws.services.simplesystemsmanagement.model.GetServiceSettingRequest`

  returns: Result of the GetServiceSetting operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetServiceSettingResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetServiceSettingResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetServiceSettingRequest get-service-setting-request]
    (-> this (.getServiceSetting get-service-setting-request))))

(defn get-maintenance-window-execution-task-invocation
  "Retrieves information about a specific task running on a specific target.

  get-maintenance-window-execution-task-invocation-request - `com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskInvocationRequest`

  returns: Result of the GetMaintenanceWindowExecutionTaskInvocation operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskInvocationResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.DoesNotExistException - Error returned when the ID specified for a resource, such as a maintenance window or Patch baseline, doesn't exist. For information about resource limits in Systems Manager, see AWS Systems Manager Limits."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskInvocationResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskInvocationRequest get-maintenance-window-execution-task-invocation-request]
    (-> this (.getMaintenanceWindowExecutionTaskInvocation get-maintenance-window-execution-task-invocation-request))))

(defn delete-parameter
  "Delete a parameter from the system.

  delete-parameter-request - `com.amazonaws.services.simplesystemsmanagement.model.DeleteParameterRequest`

  returns: Result of the DeleteParameter operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DeleteParameterResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DeleteParameterResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteParameterRequest delete-parameter-request]
    (-> this (.deleteParameter delete-parameter-request))))

(defn get-inventory
  "Query inventory information.

  get-inventory-request - `com.amazonaws.services.simplesystemsmanagement.model.GetInventoryRequest`

  returns: Result of the GetInventory operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetInventoryResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetInventoryResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetInventoryRequest get-inventory-request]
    (-> this (.getInventory get-inventory-request))))

(defn get-maintenance-window-execution-task
  "Retrieves the details about a specific task run as part of a maintenance window execution.

  get-maintenance-window-execution-task-request - `com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskRequest`

  returns: Result of the GetMaintenanceWindowExecutionTask operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.DoesNotExistException - Error returned when the ID specified for a resource, such as a maintenance window or Patch baseline, doesn't exist. For information about resource limits in Systems Manager, see AWS Systems Manager Limits."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskRequest get-maintenance-window-execution-task-request]
    (-> this (.getMaintenanceWindowExecutionTask get-maintenance-window-execution-task-request))))

(defn remove-tags-from-resource
  "Removes tag keys from the specified resource.

  remove-tags-from-resource-request - `com.amazonaws.services.simplesystemsmanagement.model.RemoveTagsFromResourceRequest`

  returns: Result of the RemoveTagsFromResource operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.RemoveTagsFromResourceResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidResourceTypeException - The resource type is not valid. For example, if you are attempting to tag an instance, the instance must be a registered, managed instance."
  (^com.amazonaws.services.simplesystemsmanagement.model.RemoveTagsFromResourceResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.RemoveTagsFromResourceRequest remove-tags-from-resource-request]
    (-> this (.removeTagsFromResource remove-tags-from-resource-request))))

(defn describe-instance-patch-states-for-patch-group
  "Retrieves the high-level patch state for the instances in the specified patch group.

  describe-instance-patch-states-for-patch-group-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesForPatchGroupRequest`

  returns: Result of the DescribeInstancePatchStatesForPatchGroup operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesForPatchGroupResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesForPatchGroupResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesForPatchGroupRequest describe-instance-patch-states-for-patch-group-request]
    (-> this (.describeInstancePatchStatesForPatchGroup describe-instance-patch-states-for-patch-group-request))))

(defn send-command
  "Runs commands on one or more managed instances.

  send-command-request - `com.amazonaws.services.simplesystemsmanagement.model.SendCommandRequest`

  returns: Result of the SendCommand operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.SendCommandResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidOutputFolderException - The S3 bucket does not exist."
  (^com.amazonaws.services.simplesystemsmanagement.model.SendCommandResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.SendCommandRequest send-command-request]
    (-> this (.sendCommand send-command-request))))

(defn list-compliance-items
  "For a specified resource ID, this API action returns a list of compliance statuses for different resource types.
   Currently, you can only specify one resource ID per call. List results depend on the criteria specified in the
   filter.

  list-compliance-items-request - `com.amazonaws.services.simplesystemsmanagement.model.ListComplianceItemsRequest`

  returns: Result of the ListComplianceItems operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ListComplianceItemsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidResourceTypeException - The resource type is not valid. For example, if you are attempting to tag an instance, the instance must be a registered, managed instance."
  (^com.amazonaws.services.simplesystemsmanagement.model.ListComplianceItemsResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.ListComplianceItemsRequest list-compliance-items-request]
    (-> this (.listComplianceItems list-compliance-items-request))))

(defn register-patch-baseline-for-patch-group
  "Registers a patch baseline for a patch group.

  register-patch-baseline-for-patch-group-request - `com.amazonaws.services.simplesystemsmanagement.model.RegisterPatchBaselineForPatchGroupRequest`

  returns: Result of the RegisterPatchBaselineForPatchGroup operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.RegisterPatchBaselineForPatchGroupResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.AlreadyExistsException - Error returned if an attempt is made to register a patch group with a patch baseline that is already registered with a different patch baseline."
  (^com.amazonaws.services.simplesystemsmanagement.model.RegisterPatchBaselineForPatchGroupResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.RegisterPatchBaselineForPatchGroupRequest register-patch-baseline-for-patch-group-request]
    (-> this (.registerPatchBaselineForPatchGroup register-patch-baseline-for-patch-group-request))))

(defn get-deployable-patch-snapshot-for-instance
  "Retrieves the current snapshot for the patch baseline the instance uses. This API is primarily used by the
   AWS-RunPatchBaseline Systems Manager document.

  get-deployable-patch-snapshot-for-instance-request - `com.amazonaws.services.simplesystemsmanagement.model.GetDeployablePatchSnapshotForInstanceRequest`

  returns: Result of the GetDeployablePatchSnapshotForInstance operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetDeployablePatchSnapshotForInstanceResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetDeployablePatchSnapshotForInstanceResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetDeployablePatchSnapshotForInstanceRequest get-deployable-patch-snapshot-for-instance-request]
    (-> this (.getDeployablePatchSnapshotForInstance get-deployable-patch-snapshot-for-instance-request))))

(defn list-compliance-summaries
  "Returns a summary count of compliant and non-compliant resources for a compliance type. For example, this call
   can return State Manager associations, patches, or custom compliance types according to the filter criteria that
   you specify.

  list-compliance-summaries-request - `com.amazonaws.services.simplesystemsmanagement.model.ListComplianceSummariesRequest`

  returns: Result of the ListComplianceSummaries operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ListComplianceSummariesResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidFilterException - The filter name is not valid. Verify the you entered the correct name and try again."
  (^com.amazonaws.services.simplesystemsmanagement.model.ListComplianceSummariesResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.ListComplianceSummariesRequest list-compliance-summaries-request]
    (-> this (.listComplianceSummaries list-compliance-summaries-request))))

(defn get-inventory-schema
  "Return a list of inventory type names for the account, or return a list of attribute names for a specific
   Inventory item type.

  get-inventory-schema-request - `com.amazonaws.services.simplesystemsmanagement.model.GetInventorySchemaRequest`

  returns: Result of the GetInventorySchema operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetInventorySchemaResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetInventorySchemaResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetInventorySchemaRequest get-inventory-schema-request]
    (-> this (.getInventorySchema get-inventory-schema-request))))

(defn describe-patch-group-state
  "Returns high-level aggregated patch compliance state for a patch group.

  describe-patch-group-state-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupStateRequest`

  returns: Result of the DescribePatchGroupState operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupStateResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupStateResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupStateRequest describe-patch-group-state-request]
    (-> this (.describePatchGroupState describe-patch-group-state-request))))

(defn describe-available-patches
  "Lists all patches eligible to be included in a patch baseline.

  describe-available-patches-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAvailablePatchesRequest`

  returns: Result of the DescribeAvailablePatches operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAvailablePatchesResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeAvailablePatchesResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeAvailablePatchesRequest describe-available-patches-request]
    (-> this (.describeAvailablePatches describe-available-patches-request))))

(defn get-maintenance-window
  "Retrieves a maintenance window.

  get-maintenance-window-request - `com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowRequest`

  returns: Result of the GetMaintenanceWindow operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.DoesNotExistException - Error returned when the ID specified for a resource, such as a maintenance window or Patch baseline, doesn't exist. For information about resource limits in Systems Manager, see AWS Systems Manager Limits."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowRequest get-maintenance-window-request]
    (-> this (.getMaintenanceWindow get-maintenance-window-request))))

(defn resume-session
  "Reconnects a session to an instance after it has been disconnected. Connections can be resumed for disconnected
   sessions, but not terminated sessions.



   This command is primarily for use by client machines to automatically reconnect during intermittent network
   issues. It is not intended for any other use.

  resume-session-request - `com.amazonaws.services.simplesystemsmanagement.model.ResumeSessionRequest`

  returns: Result of the ResumeSession operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ResumeSessionResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.DoesNotExistException - Error returned when the ID specified for a resource, such as a maintenance window or Patch baseline, doesn't exist. For information about resource limits in Systems Manager, see AWS Systems Manager Limits."
  (^com.amazonaws.services.simplesystemsmanagement.model.ResumeSessionResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.ResumeSessionRequest resume-session-request]
    (-> this (.resumeSession resume-session-request))))

(defn list-association-versions
  "Retrieves all versions of an association for a specific association ID.

  list-association-versions-request - `com.amazonaws.services.simplesystemsmanagement.model.ListAssociationVersionsRequest`

  returns: Result of the ListAssociationVersions operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ListAssociationVersionsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.ListAssociationVersionsResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.ListAssociationVersionsRequest list-association-versions-request]
    (-> this (.listAssociationVersions list-association-versions-request))))

(defn describe-instance-information
  "Describes one or more of your instances. You can use this to get information about instances like the operating
   system platform, the SSM Agent version (Linux), status etc. If you specify one or more instance IDs, it returns
   information for those instances. If you do not specify instance IDs, it returns information for all your
   instances. If you specify an instance ID that is not valid or an instance that you do not own, you receive an
   error.



   The IamRole field for this API action is the Amazon Identity and Access Management (IAM) role assigned to
   on-premises instances. This call does not return the IAM role for Amazon EC2 instances.

  describe-instance-information-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceInformationRequest`

  returns: Result of the DescribeInstanceInformation operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceInformationResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceInformationResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceInformationRequest describe-instance-information-request]
    (-> this (.describeInstanceInformation describe-instance-information-request))))

(defn deregister-target-from-maintenance-window
  "Removes a target from a maintenance window.

  deregister-target-from-maintenance-window-request - `com.amazonaws.services.simplesystemsmanagement.model.DeregisterTargetFromMaintenanceWindowRequest`

  returns: Result of the DeregisterTargetFromMaintenanceWindow operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DeregisterTargetFromMaintenanceWindowResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.DoesNotExistException - Error returned when the ID specified for a resource, such as a maintenance window or Patch baseline, doesn't exist. For information about resource limits in Systems Manager, see AWS Systems Manager Limits."
  (^com.amazonaws.services.simplesystemsmanagement.model.DeregisterTargetFromMaintenanceWindowResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DeregisterTargetFromMaintenanceWindowRequest deregister-target-from-maintenance-window-request]
    (-> this (.deregisterTargetFromMaintenanceWindow deregister-target-from-maintenance-window-request))))

(defn describe-association-executions
  "Use this API action to view all executions for a specific association ID.

  describe-association-executions-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationExecutionsRequest`

  returns: Result of the DescribeAssociationExecutions operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationExecutionsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationExecutionsResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationExecutionsRequest describe-association-executions-request]
    (-> this (.describeAssociationExecutions describe-association-executions-request))))

(defn describe-automation-step-executions
  "Information about all active and terminated step executions in an Automation workflow.

  describe-automation-step-executions-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationStepExecutionsRequest`

  returns: Result of the DescribeAutomationStepExecutions operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationStepExecutionsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.AutomationExecutionNotFoundException - There is no automation execution information for the requested automation execution ID."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationStepExecutionsResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationStepExecutionsRequest describe-automation-step-executions-request]
    (-> this (.describeAutomationStepExecutions describe-automation-step-executions-request))))

(defn get-parameter-history
  "Query a list of all parameters used by the AWS account.

  get-parameter-history-request - `com.amazonaws.services.simplesystemsmanagement.model.GetParameterHistoryRequest`

  returns: Result of the GetParameterHistory operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetParameterHistoryResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetParameterHistoryResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetParameterHistoryRequest get-parameter-history-request]
    (-> this (.getParameterHistory get-parameter-history-request))))

(defn get-command-invocation
  "Returns detailed information about command execution for an invocation or plugin.

  get-command-invocation-request - `com.amazonaws.services.simplesystemsmanagement.model.GetCommandInvocationRequest`

  returns: Result of the GetCommandInvocation operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetCommandInvocationResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetCommandInvocationResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetCommandInvocationRequest get-command-invocation-request]
    (-> this (.getCommandInvocation get-command-invocation-request))))

(defn create-activation
  "Registers your on-premises server or virtual machine with Amazon EC2 so that you can manage these resources using
   Run Command. An on-premises server or virtual machine that has been registered with EC2 is called a managed
   instance. For more information about activations, see Setting
   Up AWS Systems Manager for Hybrid Environments.

  create-activation-request - `com.amazonaws.services.simplesystemsmanagement.model.CreateActivationRequest`

  returns: Result of the CreateActivation operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.CreateActivationResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.CreateActivationResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.CreateActivationRequest create-activation-request]
    (-> this (.createActivation create-activation-request))))

(defn add-tags-to-resource
  "Adds or overwrites one or more tags for the specified resource. Tags are metadata that you can assign to your
   documents, managed instances, maintenance windows, Parameter Store parameters, and patch baselines. Tags enable
   you to categorize your resources in different ways, for example, by purpose, owner, or environment. Each tag
   consists of a key and an optional value, both of which you define. For example, you could define a set of tags
   for your account's managed instances that helps you track each instance's owner and stack level. For example:
   Key=Owner and Value=DbAdmin, SysAdmin, or Dev. Or Key=Stack and Value=Production, Pre-Production, or Test.


   Each resource can have a maximum of 50 tags.


   We recommend that you devise a set of tag keys that meets your needs for each resource type. Using a consistent
   set of tag keys makes it easier for you to manage your resources. You can search and filter the resources based
   on the tags you add. Tags don't have any semantic meaning to Amazon EC2 and are interpreted strictly as a string
   of characters.


   For more information about tags, see Tagging Your Amazon EC2 Resources
   in the Amazon EC2 User Guide.

  add-tags-to-resource-request - `com.amazonaws.services.simplesystemsmanagement.model.AddTagsToResourceRequest`

  returns: Result of the AddTagsToResource operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.AddTagsToResourceResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidResourceTypeException - The resource type is not valid. For example, if you are attempting to tag an instance, the instance must be a registered, managed instance."
  (^com.amazonaws.services.simplesystemsmanagement.model.AddTagsToResourceResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.AddTagsToResourceRequest add-tags-to-resource-request]
    (-> this (.addTagsToResource add-tags-to-resource-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSSimpleSystemsManagement this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn describe-document
  "Describes the specified Systems Manager document.

  describe-document-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentRequest`

  returns: Result of the DescribeDocument operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentRequest describe-document-request]
    (-> this (.describeDocument describe-document-request))))

(defn update-association
  "Updates an association. You can update the association name and version, the document version, schedule,
   parameters, and Amazon S3 output.



   When you update an association, the association immediately runs against the specified targets.

  update-association-request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationRequest`

  returns: Result of the UpdateAssociation operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidUpdateException - The update is not valid."
  (^com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationRequest update-association-request]
    (-> this (.updateAssociation update-association-request))))

(defn describe-effective-patches-for-patch-baseline
  "Retrieves the current effective patches (the patch and the approval state) for the specified patch baseline. Note
   that this API applies only to Windows patch baselines.

  describe-effective-patches-for-patch-baseline-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectivePatchesForPatchBaselineRequest`

  returns: Result of the DescribeEffectivePatchesForPatchBaseline operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectivePatchesForPatchBaselineResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidResourceIdException - The resource ID is not valid. Verify that you entered the correct ID and try again."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectivePatchesForPatchBaselineResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectivePatchesForPatchBaselineRequest describe-effective-patches-for-patch-baseline-request]
    (-> this (.describeEffectivePatchesForPatchBaseline describe-effective-patches-for-patch-baseline-request))))

(defn delete-document
  "Deletes the Systems Manager document and all instance associations to the document.


   Before you delete the document, we recommend that you use DeleteAssociation to disassociate all instances
   that are associated with the document.

  delete-document-request - `com.amazonaws.services.simplesystemsmanagement.model.DeleteDocumentRequest`

  returns: Result of the DeleteDocument operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DeleteDocumentResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DeleteDocumentResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteDocumentRequest delete-document-request]
    (-> this (.deleteDocument delete-document-request))))

(defn deregister-managed-instance
  "Removes the server or virtual machine from the list of registered servers. You can reregister the instance again
   at any time. If you don't plan to use Run Command on the server, we suggest uninstalling SSM Agent first.

  deregister-managed-instance-request - `com.amazonaws.services.simplesystemsmanagement.model.DeregisterManagedInstanceRequest`

  returns: Result of the DeregisterManagedInstance operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DeregisterManagedInstanceResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidInstanceIdException - The following problems can cause this exception: You do not have permission to access the instance. SSM Agent is not running. Verify that SSM Agent is running. SSM Agent is not registered with the SSM endpoint. Try reinstalling SSM Agent. The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states are: Shutting-down and Terminated."
  (^com.amazonaws.services.simplesystemsmanagement.model.DeregisterManagedInstanceResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DeregisterManagedInstanceRequest deregister-managed-instance-request]
    (-> this (.deregisterManagedInstance deregister-managed-instance-request))))

(defn delete-association
  "Disassociates the specified Systems Manager document from the specified instance.


   When you disassociate a document from an instance, it does not change the configuration of the instance. To
   change the configuration state of an instance after you disassociate a document, you must create a new document
   with the desired configuration and associate it with the instance.

  delete-association-request - `com.amazonaws.services.simplesystemsmanagement.model.DeleteAssociationRequest`

  returns: Result of the DeleteAssociation operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DeleteAssociationResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.AssociationDoesNotExistException - The specified association does not exist."
  (^com.amazonaws.services.simplesystemsmanagement.model.DeleteAssociationResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteAssociationRequest delete-association-request]
    (-> this (.deleteAssociation delete-association-request))))

(defn get-ops-item
  "Get information about an OpsItem by using the ID. You must have permission in AWS Identity and Access Management
   (IAM) to view information about an OpsItem. For more information, see Getting Started
   with OpsCenter in the AWS Systems Manager User Guide.


   Operations engineers and IT professionals use OpsCenter to view, investigate, and remediate operational issues
   impacting the performance and health of their AWS resources. For more information, see AWS Systems Manager
   OpsCenter in the AWS Systems Manager User Guide.

  get-ops-item-request - `com.amazonaws.services.simplesystemsmanagement.model.GetOpsItemRequest`

  returns: Result of the GetOpsItem operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetOpsItemResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetOpsItemResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetOpsItemRequest get-ops-item-request]
    (-> this (.getOpsItem get-ops-item-request))))

(defn put-parameter
  "Add a parameter to the system.

  put-parameter-request - `com.amazonaws.services.simplesystemsmanagement.model.PutParameterRequest`

  returns: Result of the PutParameter operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.PutParameterResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidAllowedPatternException - The request does not meet the regular expression requirement."
  (^com.amazonaws.services.simplesystemsmanagement.model.PutParameterResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.PutParameterRequest put-parameter-request]
    (-> this (.putParameter put-parameter-request))))

(defn get-maintenance-window-task
  "Lists the tasks in a maintenance window.

  get-maintenance-window-task-request - `com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowTaskRequest`

  returns: Result of the GetMaintenanceWindowTask operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowTaskResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.DoesNotExistException - Error returned when the ID specified for a resource, such as a maintenance window or Patch baseline, doesn't exist. For information about resource limits in Systems Manager, see AWS Systems Manager Limits."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowTaskResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowTaskRequest get-maintenance-window-task-request]
    (-> this (.getMaintenanceWindowTask get-maintenance-window-task-request))))

(defn describe-maintenance-window-schedule
  "Retrieves information about upcoming executions of a maintenance window.

  describe-maintenance-window-schedule-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowScheduleRequest`

  returns: Result of the DescribeMaintenanceWindowSchedule operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowScheduleResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowScheduleResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowScheduleRequest describe-maintenance-window-schedule-request]
    (-> this (.describeMaintenanceWindowSchedule describe-maintenance-window-schedule-request))))

(defn describe-maintenance-windows-for-target
  "Retrieves information about the maintenance window targets or tasks that an instance is associated with.

  describe-maintenance-windows-for-target-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsForTargetRequest`

  returns: Result of the DescribeMaintenanceWindowsForTarget operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsForTargetResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsForTargetResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsForTargetRequest describe-maintenance-windows-for-target-request]
    (-> this (.describeMaintenanceWindowsForTarget describe-maintenance-windows-for-target-request))))

(defn send-automation-signal
  "Sends a signal to an Automation execution to change the current behavior or status of the execution.

  send-automation-signal-request - `com.amazonaws.services.simplesystemsmanagement.model.SendAutomationSignalRequest`

  returns: Result of the SendAutomationSignal operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.SendAutomationSignalResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.AutomationExecutionNotFoundException - There is no automation execution information for the requested automation execution ID."
  (^com.amazonaws.services.simplesystemsmanagement.model.SendAutomationSignalResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.SendAutomationSignalRequest send-automation-signal-request]
    (-> this (.sendAutomationSignal send-automation-signal-request))))

(defn delete-activation
  "Deletes an activation. You are not required to delete an activation. If you delete an activation, you can no
   longer use it to register additional managed instances. Deleting an activation does not de-register managed
   instances. You must manually de-register managed instances.

  delete-activation-request - `com.amazonaws.services.simplesystemsmanagement.model.DeleteActivationRequest`

  returns: Result of the DeleteActivation operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DeleteActivationResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidActivationIdException - The activation ID is not valid. Verify the you entered the correct ActivationId or ActivationCode and try again."
  (^com.amazonaws.services.simplesystemsmanagement.model.DeleteActivationResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteActivationRequest delete-activation-request]
    (-> this (.deleteActivation delete-activation-request))))

(defn modify-document-permission
  "Shares a Systems Manager document publicly or privately. If you share a document privately, you must specify the
   AWS user account IDs for those people who can use the document. If you share a document publicly, you must
   specify All as the account ID.

  modify-document-permission-request - `com.amazonaws.services.simplesystemsmanagement.model.ModifyDocumentPermissionRequest`

  returns: Result of the ModifyDocumentPermission operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ModifyDocumentPermissionResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.ModifyDocumentPermissionResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.ModifyDocumentPermissionRequest modify-document-permission-request]
    (-> this (.modifyDocumentPermission modify-document-permission-request))))

(defn get-automation-execution
  "Get detailed information about a particular Automation execution.

  get-automation-execution-request - `com.amazonaws.services.simplesystemsmanagement.model.GetAutomationExecutionRequest`

  returns: Result of the GetAutomationExecution operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetAutomationExecutionResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.AutomationExecutionNotFoundException - There is no automation execution information for the requested automation execution ID."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetAutomationExecutionResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetAutomationExecutionRequest get-automation-execution-request]
    (-> this (.getAutomationExecution get-automation-execution-request))))

(defn update-patch-baseline
  "Modifies an existing patch baseline. Fields not specified in the request are left unchanged.



   For information about valid key and value pairs in PatchFilters for each supported operating system
   type, see PatchFilter.

  update-patch-baseline-request - `com.amazonaws.services.simplesystemsmanagement.model.UpdatePatchBaselineRequest`

  returns: Result of the UpdatePatchBaseline operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.UpdatePatchBaselineResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.DoesNotExistException - Error returned when the ID specified for a resource, such as a maintenance window or Patch baseline, doesn't exist. For information about resource limits in Systems Manager, see AWS Systems Manager Limits."
  (^com.amazonaws.services.simplesystemsmanagement.model.UpdatePatchBaselineResult [^AWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.UpdatePatchBaselineRequest update-patch-baseline-request]
    (-> this (.updatePatchBaseline update-patch-baseline-request))))

