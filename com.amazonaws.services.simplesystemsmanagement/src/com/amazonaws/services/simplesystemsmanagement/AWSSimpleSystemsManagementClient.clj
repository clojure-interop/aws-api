(ns com.amazonaws.services.simplesystemsmanagement.AWSSimpleSystemsManagementClient
  "Client for accessing Amazon SSM. All service calls made using this client are blocking, and will not return until the
  service call completes.

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
  (:import [com.amazonaws.services.simplesystemsmanagement AWSSimpleSystemsManagementClient]))

(defn ->aws-simple-systems-management-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to Amazon SSM (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AWSSimpleSystemsManagementClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AWSSimpleSystemsManagementClient aws-credentials-provider client-configuration request-metric-collector))
  (^AWSSimpleSystemsManagementClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSSimpleSystemsManagementClient aws-credentials client-configuration))
  (^AWSSimpleSystemsManagementClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSSimpleSystemsManagementClient client-configuration))
  (^AWSSimpleSystemsManagementClient []
    (new AWSSimpleSystemsManagementClient )))

(defn *builder
  "returns: `com.amazonaws.services.simplesystemsmanagement.AWSSimpleSystemsManagementClientBuilder`"
  (^com.amazonaws.services.simplesystemsmanagement.AWSSimpleSystemsManagementClientBuilder []
    (AWSSimpleSystemsManagementClient/builder )))

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

  request - `com.amazonaws.services.simplesystemsmanagement.model.PutComplianceItemsRequest`

  returns: Result of the PutComplianceItems operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.PutComplianceItemsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.PutComplianceItemsResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.PutComplianceItemsRequest request]
    (-> this (.putComplianceItems request))))

(defn get-patch-baseline-for-patch-group
  "Retrieves the patch baseline that should be used for the specified patch group.

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineForPatchGroupRequest`

  returns: Result of the GetPatchBaselineForPatchGroup operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineForPatchGroupResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineForPatchGroupResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineForPatchGroupRequest request]
    (-> this (.getPatchBaselineForPatchGroup request))))

(defn describe-maintenance-window-targets
  "Lists the targets registered with the maintenance window.

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTargetsRequest`

  returns: Result of the DescribeMaintenanceWindowTargets operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTargetsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.DoesNotExistException - Error returned when the ID specified for a resource, such as a maintenance window or Patch baseline, doesn't exist. For information about resource limits in Systems Manager, see AWS Systems Manager Limits."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTargetsResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTargetsRequest request]
    (-> this (.describeMaintenanceWindowTargets request))))

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

  request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateServiceSettingRequest`

  returns: Result of the UpdateServiceSetting operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.UpdateServiceSettingResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.UpdateServiceSettingResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateServiceSettingRequest request]
    (-> this (.updateServiceSetting request))))

(defn list-tags-for-resource
  "Returns a list of the tags assigned to the specified resource.

  request - `com.amazonaws.services.simplesystemsmanagement.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidResourceTypeException - The resource type is not valid. For example, if you are attempting to tag an instance, the instance must be a registered, managed instance."
  (^com.amazonaws.services.simplesystemsmanagement.model.ListTagsForResourceResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn terminate-session
  "Permanently ends a session and closes the data connection between the Session Manager client and SSM Agent on the
   instance. A terminated session cannot be resumed.

  request - `com.amazonaws.services.simplesystemsmanagement.model.TerminateSessionRequest`

  returns: Result of the TerminateSession operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.TerminateSessionResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.DoesNotExistException - Error returned when the ID specified for a resource, such as a maintenance window or Patch baseline, doesn't exist. For information about resource limits in Systems Manager, see AWS Systems Manager Limits."
  (^com.amazonaws.services.simplesystemsmanagement.model.TerminateSessionResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.TerminateSessionRequest request]
    (-> this (.terminateSession request))))

(defn list-inventory-entries
  "A list of inventory items returned by the request.

  request - `com.amazonaws.services.simplesystemsmanagement.model.ListInventoryEntriesRequest`

  returns: Result of the ListInventoryEntries operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ListInventoryEntriesResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.ListInventoryEntriesResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.ListInventoryEntriesRequest request]
    (-> this (.listInventoryEntries request))))

(defn describe-automation-executions
  "Provides details about all active and terminated Automation executions.

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationExecutionsRequest`

  returns: Result of the DescribeAutomationExecutions operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationExecutionsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidFilterKeyException - The specified key is not valid."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationExecutionsResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationExecutionsRequest request]
    (-> this (.describeAutomationExecutions request))))

(defn register-target-with-maintenance-window
  "Registers a target with a maintenance window.

  request - `com.amazonaws.services.simplesystemsmanagement.model.RegisterTargetWithMaintenanceWindowRequest`

  returns: Result of the RegisterTargetWithMaintenanceWindow operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.RegisterTargetWithMaintenanceWindowResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.IdempotentParameterMismatchException - Error returned when an idempotent operation is retried and the parameters don't match the original call to the API with the same idempotency token."
  (^com.amazonaws.services.simplesystemsmanagement.model.RegisterTargetWithMaintenanceWindowResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.RegisterTargetWithMaintenanceWindowRequest request]
    (-> this (.registerTargetWithMaintenanceWindow request))))

(defn delete-resource-data-sync
  "Deletes a Resource Data Sync configuration. After the configuration is deleted, changes to inventory data on
   managed instances are no longer synced with the target Amazon S3 bucket. Deleting a sync configuration does not
   delete data in the target Amazon S3 bucket.

  request - `com.amazonaws.services.simplesystemsmanagement.model.DeleteResourceDataSyncRequest`

  returns: Result of the DeleteResourceDataSync operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DeleteResourceDataSyncResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DeleteResourceDataSyncResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteResourceDataSyncRequest request]
    (-> this (.deleteResourceDataSync request))))

(defn describe-instance-associations-status
  "The status of the associations for the instance(s).

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceAssociationsStatusRequest`

  returns: Result of the DescribeInstanceAssociationsStatus operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceAssociationsStatusResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceAssociationsStatusResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceAssociationsStatusRequest request]
    (-> this (.describeInstanceAssociationsStatus request))))

(defn delete-maintenance-window
  "Deletes a maintenance window.

  request - `com.amazonaws.services.simplesystemsmanagement.model.DeleteMaintenanceWindowRequest`

  returns: Result of the DeleteMaintenanceWindow operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DeleteMaintenanceWindowResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DeleteMaintenanceWindowResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteMaintenanceWindowRequest request]
    (-> this (.deleteMaintenanceWindow request))))

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

  request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTargetRequest`

  returns: Result of the UpdateMaintenanceWindowTarget operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTargetResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.DoesNotExistException - Error returned when the ID specified for a resource, such as a maintenance window or Patch baseline, doesn't exist. For information about resource limits in Systems Manager, see AWS Systems Manager Limits."
  (^com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTargetResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTargetRequest request]
    (-> this (.updateMaintenanceWindowTarget request))))

(defn update-maintenance-window
  "Updates an existing maintenance window. Only specified parameters are modified.

  request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowRequest`

  returns: Result of the UpdateMaintenanceWindow operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.DoesNotExistException - Error returned when the ID specified for a resource, such as a maintenance window or Patch baseline, doesn't exist. For information about resource limits in Systems Manager, see AWS Systems Manager Limits."
  (^com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowRequest request]
    (-> this (.updateMaintenanceWindow request))))

(defn deregister-task-from-maintenance-window
  "Removes a task from a maintenance window.

  request - `com.amazonaws.services.simplesystemsmanagement.model.DeregisterTaskFromMaintenanceWindowRequest`

  returns: Result of the DeregisterTaskFromMaintenanceWindow operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DeregisterTaskFromMaintenanceWindowResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.DoesNotExistException - Error returned when the ID specified for a resource, such as a maintenance window or Patch baseline, doesn't exist. For information about resource limits in Systems Manager, see AWS Systems Manager Limits."
  (^com.amazonaws.services.simplesystemsmanagement.model.DeregisterTaskFromMaintenanceWindowResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DeregisterTaskFromMaintenanceWindowRequest request]
    (-> this (.deregisterTaskFromMaintenanceWindow request))))

(defn get-document
  "Gets the contents of the specified Systems Manager document.

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetDocumentRequest`

  returns: Result of the GetDocument operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetDocumentResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetDocumentResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.GetDocumentRequest request]
    (-> this (.getDocument request))))

(defn register-task-with-maintenance-window
  "Adds a new task to a maintenance window.

  request - `com.amazonaws.services.simplesystemsmanagement.model.RegisterTaskWithMaintenanceWindowRequest`

  returns: Result of the RegisterTaskWithMaintenanceWindow operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.RegisterTaskWithMaintenanceWindowResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.IdempotentParameterMismatchException - Error returned when an idempotent operation is retried and the parameters don't match the original call to the API with the same idempotency token."
  (^com.amazonaws.services.simplesystemsmanagement.model.RegisterTaskWithMaintenanceWindowResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.RegisterTaskWithMaintenanceWindowRequest request]
    (-> this (.registerTaskWithMaintenanceWindow request))))

(defn describe-maintenance-window-tasks
  "Lists the tasks in a maintenance window.

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTasksRequest`

  returns: Result of the DescribeMaintenanceWindowTasks operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTasksResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.DoesNotExistException - Error returned when the ID specified for a resource, such as a maintenance window or Patch baseline, doesn't exist. For information about resource limits in Systems Manager, see AWS Systems Manager Limits."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTasksResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTasksRequest request]
    (-> this (.describeMaintenanceWindowTasks request))))

(defn get-ops-summary
  "View a summary of OpsItems based on specified filters and aggregators.

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetOpsSummaryRequest`

  returns: Result of the GetOpsSummary operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetOpsSummaryResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetOpsSummaryResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.GetOpsSummaryRequest request]
    (-> this (.getOpsSummary request))))

(defn describe-association-execution-targets
  "Use this API action to view information about a specific execution of a specific association.

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationExecutionTargetsRequest`

  returns: Result of the DescribeAssociationExecutionTargets operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationExecutionTargetsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationExecutionTargetsResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationExecutionTargetsRequest request]
    (-> this (.describeAssociationExecutionTargets request))))

(defn describe-maintenance-window-execution-tasks
  "For a given maintenance window execution, lists the tasks that were run.

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTasksRequest`

  returns: Result of the DescribeMaintenanceWindowExecutionTasks operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTasksResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.DoesNotExistException - Error returned when the ID specified for a resource, such as a maintenance window or Patch baseline, doesn't exist. For information about resource limits in Systems Manager, see AWS Systems Manager Limits."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTasksResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTasksRequest request]
    (-> this (.describeMaintenanceWindowExecutionTasks request))))

(defn describe-ops-items
  "Query a set of OpsItems. You must have permission in AWS Identity and Access Management (IAM) to query a list of
   OpsItems. For more information, see Getting Started
   with OpsCenter in the AWS Systems Manager User Guide.


   Operations engineers and IT professionals use OpsCenter to view, investigate, and remediate operational issues
   impacting the performance and health of their AWS resources. For more information, see AWS Systems Manager
   OpsCenter in the AWS Systems Manager User Guide.

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeOpsItemsRequest`

  returns: Result of the DescribeOpsItems operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeOpsItemsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeOpsItemsResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeOpsItemsRequest request]
    (-> this (.describeOpsItems request))))

(defn start-associations-once
  "Use this API action to run an association immediately and only one time. This action can be helpful when
   troubleshooting associations.

  request - `com.amazonaws.services.simplesystemsmanagement.model.StartAssociationsOnceRequest`

  returns: Result of the StartAssociationsOnce operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.StartAssociationsOnceResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidAssociationException - The association is not valid or does not exist."
  (^com.amazonaws.services.simplesystemsmanagement.model.StartAssociationsOnceResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.StartAssociationsOnceRequest request]
    (-> this (.startAssociationsOnce request))))

(defn cancel-command
  "Attempts to cancel the command specified by the Command ID. There is no guarantee that the command will be
   terminated and the underlying process stopped.

  request - `com.amazonaws.services.simplesystemsmanagement.model.CancelCommandRequest`

  returns: Result of the CancelCommand operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.CancelCommandResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.CancelCommandResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.CancelCommandRequest request]
    (-> this (.cancelCommand request))))

(defn describe-association
  "Describes the association for the specified target or instance. If you created the association by using the
   Targets parameter, then you must retrieve the association by using the association ID. If you
   created the association by specifying an instance ID and a Systems Manager document, then you retrieve the
   association by specifying the document name and the instance ID.

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationRequest`

  returns: Result of the DescribeAssociation operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.AssociationDoesNotExistException - The specified association does not exist."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationRequest request]
    (-> this (.describeAssociation request))))

(defn list-commands
  "Lists the commands requested by users of the AWS account.

  request - `com.amazonaws.services.simplesystemsmanagement.model.ListCommandsRequest`

  returns: Result of the ListCommands operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ListCommandsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.ListCommandsResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.ListCommandsRequest request]
    (-> this (.listCommands request))))

(defn create-ops-item
  "Creates a new OpsItem. You must have permission in AWS Identity and Access Management (IAM) to create a new
   OpsItem. For more information, see Getting Started
   with OpsCenter in the AWS Systems Manager User Guide.


   Operations engineers and IT professionals use OpsCenter to view, investigate, and remediate operational issues
   impacting the performance and health of their AWS resources. For more information, see AWS Systems Manager
   OpsCenter in the AWS Systems Manager User Guide.

  request - `com.amazonaws.services.simplesystemsmanagement.model.CreateOpsItemRequest`

  returns: Result of the CreateOpsItem operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.CreateOpsItemResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.CreateOpsItemResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.CreateOpsItemRequest request]
    (-> this (.createOpsItem request))))

(defn cancel-maintenance-window-execution
  "Stops a maintenance window execution that is already in progress and cancels any tasks in the window that have
   not already starting running. (Tasks already in progress will continue to completion.)

  request - `com.amazonaws.services.simplesystemsmanagement.model.CancelMaintenanceWindowExecutionRequest`

  returns: Result of the CancelMaintenanceWindowExecution operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.CancelMaintenanceWindowExecutionResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.CancelMaintenanceWindowExecutionResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.CancelMaintenanceWindowExecutionRequest request]
    (-> this (.cancelMaintenanceWindowExecution request))))

(defn get-default-patch-baseline
  "Retrieves the default patch baseline. Note that Systems Manager supports creating multiple default patch
   baselines. For example, you can create a default patch baseline for each operating system.


   If you do not specify an operating system value, the default patch baseline for Windows is returned.

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetDefaultPatchBaselineRequest`

  returns: Result of the GetDefaultPatchBaseline operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetDefaultPatchBaselineResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetDefaultPatchBaselineResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.GetDefaultPatchBaselineRequest request]
    (-> this (.getDefaultPatchBaseline request))))

(defn create-association-batch
  "Associates the specified Systems Manager document with the specified instances or targets.


   When you associate a document with one or more instances using instance IDs or tags, SSM Agent running on the
   instance processes the document and configures the instance as specified.


   If you associate a document with an instance that already has an associated document, the system returns the
   AssociationAlreadyExists exception.

  request - `com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationBatchRequest`

  returns: Result of the CreateAssociationBatch operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationBatchResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidDocumentException - The specified document does not exist."
  (^com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationBatchResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationBatchRequest request]
    (-> this (.createAssociationBatch request))))

(defn delete-inventory
  "Delete a custom inventory type, or the data associated with a custom Inventory type. Deleting a custom inventory
   type is also referred to as deleting a custom inventory schema.

  request - `com.amazonaws.services.simplesystemsmanagement.model.DeleteInventoryRequest`

  returns: Result of the DeleteInventory operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DeleteInventoryResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DeleteInventoryResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteInventoryRequest request]
    (-> this (.deleteInventory request))))

(defn create-document
  "Creates a Systems Manager document.


   After you create a document, you can use CreateAssociation to associate it with one or more running instances.

  request - `com.amazonaws.services.simplesystemsmanagement.model.CreateDocumentRequest`

  returns: Result of the CreateDocument operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.CreateDocumentResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.DocumentAlreadyExistsException - The specified document already exists."
  (^com.amazonaws.services.simplesystemsmanagement.model.CreateDocumentResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.CreateDocumentRequest request]
    (-> this (.createDocument request))))

(defn register-default-patch-baseline
  "Defines the default patch baseline for the relevant operating system.


   To reset the AWS predefined patch baseline as the default, specify the full patch baseline ARN as the baseline ID
   value. For example, for CentOS, specify
   arn:aws:ssm:us-east-2:733109147000:patchbaseline/pb-0574b43a65ea646ed instead of
   pb-0574b43a65ea646ed.

  request - `com.amazonaws.services.simplesystemsmanagement.model.RegisterDefaultPatchBaselineRequest`

  returns: Result of the RegisterDefaultPatchBaseline operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.RegisterDefaultPatchBaselineResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidResourceIdException - The resource ID is not valid. Verify that you entered the correct ID and try again."
  (^com.amazonaws.services.simplesystemsmanagement.model.RegisterDefaultPatchBaselineResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.RegisterDefaultPatchBaselineRequest request]
    (-> this (.registerDefaultPatchBaseline request))))

(defn start-automation-execution
  "Initiates execution of an Automation document.

  request - `com.amazonaws.services.simplesystemsmanagement.model.StartAutomationExecutionRequest`

  returns: Result of the StartAutomationExecution operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.StartAutomationExecutionResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.AutomationDefinitionNotFoundException - An Automation document with the specified name could not be found."
  (^com.amazonaws.services.simplesystemsmanagement.model.StartAutomationExecutionResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.StartAutomationExecutionRequest request]
    (-> this (.startAutomationExecution request))))

(defn describe-effective-instance-associations
  "All associations for the instance(s).

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectiveInstanceAssociationsRequest`

  returns: Result of the DescribeEffectiveInstanceAssociations operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectiveInstanceAssociationsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectiveInstanceAssociationsResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectiveInstanceAssociationsRequest request]
    (-> this (.describeEffectiveInstanceAssociations request))))

(defn describe-maintenance-window-execution-task-invocations
  "Retrieves the individual task executions (one per target) for a particular task run as part of a maintenance
   window execution.

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTaskInvocationsRequest`

  returns: Result of the DescribeMaintenanceWindowExecutionTaskInvocations operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTaskInvocationsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.DoesNotExistException - Error returned when the ID specified for a resource, such as a maintenance window or Patch baseline, doesn't exist. For information about resource limits in Systems Manager, see AWS Systems Manager Limits."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTaskInvocationsResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTaskInvocationsRequest request]
    (-> this (.describeMaintenanceWindowExecutionTaskInvocations request))))

(defn get-patch-baseline
  "Retrieves information about a patch baseline.

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineRequest`

  returns: Result of the GetPatchBaseline operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.DoesNotExistException - Error returned when the ID specified for a resource, such as a maintenance window or Patch baseline, doesn't exist. For information about resource limits in Systems Manager, see AWS Systems Manager Limits."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineRequest request]
    (-> this (.getPatchBaseline request))))

(defn update-ops-item
  "Edit or change an OpsItem. You must have permission in AWS Identity and Access Management (IAM) to update an
   OpsItem. For more information, see Getting Started
   with OpsCenter in the AWS Systems Manager User Guide.


   Operations engineers and IT professionals use OpsCenter to view, investigate, and remediate operational issues
   impacting the performance and health of their AWS resources. For more information, see AWS Systems Manager
   OpsCenter in the AWS Systems Manager User Guide.

  request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateOpsItemRequest`

  returns: Result of the UpdateOpsItem operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.UpdateOpsItemResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.UpdateOpsItemResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateOpsItemRequest request]
    (-> this (.updateOpsItem request))))

(defn describe-maintenance-windows
  "Retrieves the maintenance windows in an AWS account.

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsRequest`

  returns: Result of the DescribeMaintenanceWindows operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsRequest request]
    (-> this (.describeMaintenanceWindows request))))

(defn get-maintenance-window-execution
  "Retrieves details about a specific a maintenance window execution.

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionRequest`

  returns: Result of the GetMaintenanceWindowExecution operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.DoesNotExistException - Error returned when the ID specified for a resource, such as a maintenance window or Patch baseline, doesn't exist. For information about resource limits in Systems Manager, see AWS Systems Manager Limits."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionRequest request]
    (-> this (.getMaintenanceWindowExecution request))))

(defn update-managed-instance-role
  "Assigns or changes an Amazon Identity and Access Management (IAM) role for the managed instance.

  request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateManagedInstanceRoleRequest`

  returns: Result of the UpdateManagedInstanceRole operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.UpdateManagedInstanceRoleResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidInstanceIdException - The following problems can cause this exception: You do not have permission to access the instance. SSM Agent is not running. Verify that SSM Agent is running. SSM Agent is not registered with the SSM endpoint. Try reinstalling SSM Agent. The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states are: Shutting-down and Terminated."
  (^com.amazonaws.services.simplesystemsmanagement.model.UpdateManagedInstanceRoleResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateManagedInstanceRoleRequest request]
    (-> this (.updateManagedInstanceRole request))))

(defn list-resource-data-sync
  "Lists your resource data sync configurations. Includes information about the last time a sync attempted to start,
   the last sync status, and the last time a sync successfully completed.


   The number of sync configurations might be too large to return using a single call to
   ListResourceDataSync. You can limit the number of sync configurations returned by using the
   MaxResults parameter. To determine whether there are more sync configurations to list, check the
   value of NextToken in the output. If there are more sync configurations to list, you can request
   them by specifying the NextToken returned in the call to the parameter of a subsequent call.

  request - `com.amazonaws.services.simplesystemsmanagement.model.ListResourceDataSyncRequest`

  returns: Result of the ListResourceDataSync operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ListResourceDataSyncResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.ListResourceDataSyncResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.ListResourceDataSyncRequest request]
    (-> this (.listResourceDataSync request))))

(defn update-association-status
  "Updates the status of the Systems Manager document associated with the specified instance.

  request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationStatusRequest`

  returns: Result of the UpdateAssociationStatus operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationStatusResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationStatusResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationStatusRequest request]
    (-> this (.updateAssociationStatus request))))

(defn get-parameters
  "Get details of a parameter. Don't confuse this API action with the GetParameter API action.

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetParametersRequest`

  returns: Result of the GetParameters operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetParametersResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidKeyIdException - The query key ID is not valid."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetParametersResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.GetParametersRequest request]
    (-> this (.getParameters request))))

(defn update-document
  "Updates one or more values for an SSM document.

  request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentRequest`

  returns: Result of the UpdateDocument operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidDocumentOperationException - You attempted to delete a document while it is still shared. You must stop sharing the document before you can delete it."
  (^com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentRequest request]
    (-> this (.updateDocument request))))

(defn describe-instance-patch-states
  "Retrieves the high-level patch state of one or more instances.

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesRequest`

  returns: Result of the DescribeInstancePatchStates operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesRequest request]
    (-> this (.describeInstancePatchStates request))))

(defn describe-patch-baselines
  "Lists the patch baselines in your AWS account.

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribePatchBaselinesRequest`

  returns: Result of the DescribePatchBaselines operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribePatchBaselinesResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribePatchBaselinesResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DescribePatchBaselinesRequest request]
    (-> this (.describePatchBaselines request))))

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

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribePatchPropertiesRequest`

  returns: Result of the DescribePatchProperties operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribePatchPropertiesResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribePatchPropertiesResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DescribePatchPropertiesRequest request]
    (-> this (.describePatchProperties request))))

(defn create-resource-data-sync
  "Creates a resource data sync configuration to a single bucket in Amazon S3. This is an asynchronous operation
   that returns immediately. After a successful initial sync is completed, the system continuously syncs data to the
   Amazon S3 bucket. To check the status of the sync, use the ListResourceDataSync.


   By default, data is not encrypted in Amazon S3. We strongly recommend that you enable encryption in Amazon S3 to
   ensure secure data storage. We also recommend that you secure access to the Amazon S3 bucket by creating a
   restrictive bucket policy. For more information, see Configuring
   Resource Data Sync for Inventory in the AWS Systems Manager User Guide.

  request - `com.amazonaws.services.simplesystemsmanagement.model.CreateResourceDataSyncRequest`

  returns: Result of the CreateResourceDataSync operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.CreateResourceDataSyncResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.CreateResourceDataSyncResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.CreateResourceDataSyncRequest request]
    (-> this (.createResourceDataSync request))))

(defn describe-maintenance-window-executions
  "Lists the executions of a maintenance window. This includes information about when the maintenance window was
   scheduled to be active, and information about tasks registered and run with the maintenance window.

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionsRequest`

  returns: Result of the DescribeMaintenanceWindowExecutions operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionsResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionsRequest request]
    (-> this (.describeMaintenanceWindowExecutions request))))

(defn get-connection-status
  "Retrieves the Session Manager connection status for an instance to determine whether it is connected and ready to
   receive Session Manager connections.

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetConnectionStatusRequest`

  returns: Result of the GetConnectionStatus operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetConnectionStatusResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetConnectionStatusResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.GetConnectionStatusRequest request]
    (-> this (.getConnectionStatus request))))

(defn create-patch-baseline
  "Creates a patch baseline.



   For information about valid key and value pairs in PatchFilters for each supported operating system
   type, see PatchFilter.

  request - `com.amazonaws.services.simplesystemsmanagement.model.CreatePatchBaselineRequest`

  returns: Result of the CreatePatchBaseline operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.CreatePatchBaselineResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.IdempotentParameterMismatchException - Error returned when an idempotent operation is retried and the parameters don't match the original call to the API with the same idempotency token."
  (^com.amazonaws.services.simplesystemsmanagement.model.CreatePatchBaselineResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.CreatePatchBaselineRequest request]
    (-> this (.createPatchBaseline request))))

(defn list-associations
  "Lists the associations for the specified Systems Manager document or instance.

  request - `com.amazonaws.services.simplesystemsmanagement.model.ListAssociationsRequest`

  returns: Result of the ListAssociations operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ListAssociationsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.ListAssociationsResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.ListAssociationsRequest request]
    (-> this (.listAssociations request))))

(defn describe-instance-patches
  "Retrieves information about the patches on the specified instance and their state relative to the patch baseline
   being used for the instance.

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchesRequest`

  returns: Result of the DescribeInstancePatches operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchesResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchesResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchesRequest request]
    (-> this (.describeInstancePatches request))))

(defn list-resource-compliance-summaries
  "Returns a resource-level summary count. The summary includes information about compliant and non-compliant
   statuses and detailed compliance-item severity counts, according to the filter criteria you specify.

  request - `com.amazonaws.services.simplesystemsmanagement.model.ListResourceComplianceSummariesRequest`

  returns: Result of the ListResourceComplianceSummaries operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ListResourceComplianceSummariesResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidFilterException - The filter name is not valid. Verify the you entered the correct name and try again."
  (^com.amazonaws.services.simplesystemsmanagement.model.ListResourceComplianceSummariesResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.ListResourceComplianceSummariesRequest request]
    (-> this (.listResourceComplianceSummaries request))))

(defn describe-inventory-deletions
  "Describes a specific delete inventory operation.

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInventoryDeletionsRequest`

  returns: Result of the DescribeInventoryDeletions operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInventoryDeletionsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeInventoryDeletionsResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeInventoryDeletionsRequest request]
    (-> this (.describeInventoryDeletions request))))

(defn describe-activations
  "Describes details about the activation, such as the date and time the activation was created, its expiration
   date, the IAM role assigned to the instances in the activation, and the number of instances registered by using
   this activation.

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeActivationsRequest`

  returns: Result of the DescribeActivations operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeActivationsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidFilterException - The filter name is not valid. Verify the you entered the correct name and try again."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeActivationsResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeActivationsRequest request]
    (-> this (.describeActivations request))))

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

  request - `com.amazonaws.services.simplesystemsmanagement.model.ResetServiceSettingRequest`

  returns: Result of the ResetServiceSetting operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ResetServiceSettingResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.ResetServiceSettingResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.ResetServiceSettingRequest request]
    (-> this (.resetServiceSetting request))))

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

  request - `com.amazonaws.services.simplesystemsmanagement.model.LabelParameterVersionRequest`

  returns: Result of the LabelParameterVersion operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.LabelParameterVersionResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.LabelParameterVersionResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.LabelParameterVersionRequest request]
    (-> this (.labelParameterVersion request))))

(defn list-command-invocations
  "An invocation is copy of a command sent to a specific instance. A command can apply to one or more instances. A
   command invocation applies to one instance. For example, if a user runs SendCommand against three instances, then
   a command invocation is created for each requested instance ID. ListCommandInvocations provide status about
   command execution.

  request - `com.amazonaws.services.simplesystemsmanagement.model.ListCommandInvocationsRequest`

  returns: Result of the ListCommandInvocations operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ListCommandInvocationsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.ListCommandInvocationsResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.ListCommandInvocationsRequest request]
    (-> this (.listCommandInvocations request))))

(defn get-parameters-by-path
  "Retrieve parameters in a specific hierarchy. For more information, see Working with
   Systems Manager Parameters in the AWS Systems Manager User Guide.


   Request results are returned on a best-effort basis. If you specify MaxResults in the request, the
   response includes information up to the limit specified. The number of items returned, however, can be between
   zero and the value of MaxResults. If the service reaches an internal limit while processing the
   results, it stops the operation and returns the matching values up to that point and a NextToken.
   You can specify the NextToken in a subsequent call to get the next set of results.



   This API action doesn't support filtering by tags.

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetParametersByPathRequest`

  returns: Result of the GetParametersByPath operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetParametersByPathResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetParametersByPathResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.GetParametersByPathRequest request]
    (-> this (.getParametersByPath request))))

(defn create-association
  "Associates the specified Systems Manager document with the specified instances or targets.


   When you associate a document with one or more instances using instance IDs or tags, SSM Agent running on the
   instance processes the document and configures the instance as specified.


   If you associate a document with an instance that already has an associated document, the system returns the
   AssociationAlreadyExists exception.

  request - `com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationRequest`

  returns: Result of the CreateAssociation operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidDocumentException - The specified document does not exist."
  (^com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationRequest request]
    (-> this (.createAssociation request))))

(defn put-inventory
  "Bulk update custom inventory items on one more instance. The request adds an inventory item, if it doesn't
   already exist, or updates an inventory item, if it does exist.

  request - `com.amazonaws.services.simplesystemsmanagement.model.PutInventoryRequest`

  returns: Result of the PutInventory operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.PutInventoryResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.SubTypeCountLimitExceededException - The sub-type count exceeded the limit for the inventory type."
  (^com.amazonaws.services.simplesystemsmanagement.model.PutInventoryResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.PutInventoryRequest request]
    (-> this (.putInventory request))))

(defn describe-document-permission
  "Describes the permissions for a Systems Manager document. If you created the document, you are the owner. If a
   document is shared, it can either be shared privately (by specifying a user's AWS account ID) or publicly
   (All).

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentPermissionRequest`

  returns: Result of the DescribeDocumentPermission operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentPermissionResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentPermissionResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentPermissionRequest request]
    (-> this (.describeDocumentPermission request))))

(defn delete-patch-baseline
  "Deletes a patch baseline.

  request - `com.amazonaws.services.simplesystemsmanagement.model.DeletePatchBaselineRequest`

  returns: Result of the DeletePatchBaseline operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DeletePatchBaselineResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.ResourceInUseException - Error returned if an attempt is made to delete a patch baseline that is registered for a patch group."
  (^com.amazonaws.services.simplesystemsmanagement.model.DeletePatchBaselineResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DeletePatchBaselineRequest request]
    (-> this (.deletePatchBaseline request))))

(defn update-document-default-version
  "Set the default version of a document.

  request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentDefaultVersionRequest`

  returns: Result of the UpdateDocumentDefaultVersion operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentDefaultVersionResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentDefaultVersionResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentDefaultVersionRequest request]
    (-> this (.updateDocumentDefaultVersion request))))

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

  request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTaskRequest`

  returns: Result of the UpdateMaintenanceWindowTask operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTaskResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.DoesNotExistException - Error returned when the ID specified for a resource, such as a maintenance window or Patch baseline, doesn't exist. For information about resource limits in Systems Manager, see AWS Systems Manager Limits."
  (^com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTaskResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTaskRequest request]
    (-> this (.updateMaintenanceWindowTask request))))

(defn list-document-versions
  "List all versions for a document.

  request - `com.amazonaws.services.simplesystemsmanagement.model.ListDocumentVersionsRequest`

  returns: Result of the ListDocumentVersions operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ListDocumentVersionsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.ListDocumentVersionsResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.ListDocumentVersionsRequest request]
    (-> this (.listDocumentVersions request))))

(defn delete-parameters
  "Delete a list of parameters.

  request - `com.amazonaws.services.simplesystemsmanagement.model.DeleteParametersRequest`

  returns: Result of the DeleteParameters operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DeleteParametersResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DeleteParametersResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteParametersRequest request]
    (-> this (.deleteParameters request))))

(defn describe-sessions
  "Retrieves a list of all active sessions (both connected and disconnected) or terminated sessions from the past 30
   days.

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeSessionsRequest`

  returns: Result of the DescribeSessions operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeSessionsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeSessionsResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeSessionsRequest request]
    (-> this (.describeSessions request))))

(defn describe-parameters
  "Get information about a parameter.


   Request results are returned on a best-effort basis. If you specify MaxResults in the request, the
   response includes information up to the limit specified. The number of items returned, however, can be between
   zero and the value of MaxResults. If the service reaches an internal limit while processing the
   results, it stops the operation and returns the matching values up to that point and a NextToken.
   You can specify the NextToken in a subsequent call to get the next set of results.

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeParametersRequest`

  returns: Result of the DescribeParameters operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeParametersResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeParametersResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeParametersRequest request]
    (-> this (.describeParameters request))))

(defn get-parameter
  "Get information about a parameter by using the parameter name. Don't confuse this API action with the
   GetParameters API action.

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetParameterRequest`

  returns: Result of the GetParameter operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetParameterResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetParameterResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.GetParameterRequest request]
    (-> this (.getParameter request))))

(defn stop-automation-execution
  "Stop an Automation that is currently running.

  request - `com.amazonaws.services.simplesystemsmanagement.model.StopAutomationExecutionRequest`

  returns: Result of the StopAutomationExecution operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.StopAutomationExecutionResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.AutomationExecutionNotFoundException - There is no automation execution information for the requested automation execution ID."
  (^com.amazonaws.services.simplesystemsmanagement.model.StopAutomationExecutionResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.StopAutomationExecutionRequest request]
    (-> this (.stopAutomationExecution request))))

(defn describe-patch-groups
  "Lists all patch groups that have been registered with patch baselines.

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupsRequest`

  returns: Result of the DescribePatchGroups operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupsResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupsRequest request]
    (-> this (.describePatchGroups request))))

(defn create-maintenance-window
  "Creates a new maintenance window.

  request - `com.amazonaws.services.simplesystemsmanagement.model.CreateMaintenanceWindowRequest`

  returns: Result of the CreateMaintenanceWindow operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.CreateMaintenanceWindowResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.IdempotentParameterMismatchException - Error returned when an idempotent operation is retried and the parameters don't match the original call to the API with the same idempotency token."
  (^com.amazonaws.services.simplesystemsmanagement.model.CreateMaintenanceWindowResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.CreateMaintenanceWindowRequest request]
    (-> this (.createMaintenanceWindow request))))

(defn list-documents
  "Describes one or more of your Systems Manager documents.

  request - `com.amazonaws.services.simplesystemsmanagement.model.ListDocumentsRequest`

  returns: Result of the ListDocuments operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ListDocumentsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.ListDocumentsResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.ListDocumentsRequest request]
    (-> this (.listDocuments request)))
  (^com.amazonaws.services.simplesystemsmanagement.model.ListDocumentsResult [^AWSSimpleSystemsManagementClient this]
    (-> this (.listDocuments))))

(defn deregister-patch-baseline-for-patch-group
  "Removes a patch group from a patch baseline.

  request - `com.amazonaws.services.simplesystemsmanagement.model.DeregisterPatchBaselineForPatchGroupRequest`

  returns: Result of the DeregisterPatchBaselineForPatchGroup operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DeregisterPatchBaselineForPatchGroupResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidResourceIdException - The resource ID is not valid. Verify that you entered the correct ID and try again."
  (^com.amazonaws.services.simplesystemsmanagement.model.DeregisterPatchBaselineForPatchGroupResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DeregisterPatchBaselineForPatchGroupRequest request]
    (-> this (.deregisterPatchBaselineForPatchGroup request))))

(defn start-session
  "Initiates a connection to a target (for example, an instance) for a Session Manager session. Returns a URL and
   token that can be used to open a WebSocket connection for sending input and receiving outputs.



   AWS CLI usage: start-session is an interactive command that requires the Session Manager plugin to
   be installed on the client machine making the call. For information, see
   Install the Session Manager Plugin for the AWS CLI in the AWS Systems Manager User Guide.

  request - `com.amazonaws.services.simplesystemsmanagement.model.StartSessionRequest`

  returns: Result of the StartSession operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.StartSessionResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidDocumentException - The specified document does not exist."
  (^com.amazonaws.services.simplesystemsmanagement.model.StartSessionResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.StartSessionRequest request]
    (-> this (.startSession request))))

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

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetServiceSettingRequest`

  returns: Result of the GetServiceSetting operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetServiceSettingResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetServiceSettingResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.GetServiceSettingRequest request]
    (-> this (.getServiceSetting request))))

(defn get-maintenance-window-execution-task-invocation
  "Retrieves information about a specific task running on a specific target.

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskInvocationRequest`

  returns: Result of the GetMaintenanceWindowExecutionTaskInvocation operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskInvocationResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.DoesNotExistException - Error returned when the ID specified for a resource, such as a maintenance window or Patch baseline, doesn't exist. For information about resource limits in Systems Manager, see AWS Systems Manager Limits."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskInvocationResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskInvocationRequest request]
    (-> this (.getMaintenanceWindowExecutionTaskInvocation request))))

(defn delete-parameter
  "Delete a parameter from the system.

  request - `com.amazonaws.services.simplesystemsmanagement.model.DeleteParameterRequest`

  returns: Result of the DeleteParameter operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DeleteParameterResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DeleteParameterResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteParameterRequest request]
    (-> this (.deleteParameter request))))

(defn get-inventory
  "Query inventory information.

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetInventoryRequest`

  returns: Result of the GetInventory operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetInventoryResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetInventoryResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.GetInventoryRequest request]
    (-> this (.getInventory request))))

(defn get-maintenance-window-execution-task
  "Retrieves the details about a specific task run as part of a maintenance window execution.

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskRequest`

  returns: Result of the GetMaintenanceWindowExecutionTask operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.DoesNotExistException - Error returned when the ID specified for a resource, such as a maintenance window or Patch baseline, doesn't exist. For information about resource limits in Systems Manager, see AWS Systems Manager Limits."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskRequest request]
    (-> this (.getMaintenanceWindowExecutionTask request))))

(defn remove-tags-from-resource
  "Removes tag keys from the specified resource.

  request - `com.amazonaws.services.simplesystemsmanagement.model.RemoveTagsFromResourceRequest`

  returns: Result of the RemoveTagsFromResource operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.RemoveTagsFromResourceResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidResourceTypeException - The resource type is not valid. For example, if you are attempting to tag an instance, the instance must be a registered, managed instance."
  (^com.amazonaws.services.simplesystemsmanagement.model.RemoveTagsFromResourceResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.RemoveTagsFromResourceRequest request]
    (-> this (.removeTagsFromResource request))))

(defn describe-instance-patch-states-for-patch-group
  "Retrieves the high-level patch state for the instances in the specified patch group.

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesForPatchGroupRequest`

  returns: Result of the DescribeInstancePatchStatesForPatchGroup operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesForPatchGroupResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesForPatchGroupResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesForPatchGroupRequest request]
    (-> this (.describeInstancePatchStatesForPatchGroup request))))

(defn send-command
  "Runs commands on one or more managed instances.

  request - `com.amazonaws.services.simplesystemsmanagement.model.SendCommandRequest`

  returns: Result of the SendCommand operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.SendCommandResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidOutputFolderException - The S3 bucket does not exist."
  (^com.amazonaws.services.simplesystemsmanagement.model.SendCommandResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.SendCommandRequest request]
    (-> this (.sendCommand request))))

(defn list-compliance-items
  "For a specified resource ID, this API action returns a list of compliance statuses for different resource types.
   Currently, you can only specify one resource ID per call. List results depend on the criteria specified in the
   filter.

  request - `com.amazonaws.services.simplesystemsmanagement.model.ListComplianceItemsRequest`

  returns: Result of the ListComplianceItems operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ListComplianceItemsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidResourceTypeException - The resource type is not valid. For example, if you are attempting to tag an instance, the instance must be a registered, managed instance."
  (^com.amazonaws.services.simplesystemsmanagement.model.ListComplianceItemsResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.ListComplianceItemsRequest request]
    (-> this (.listComplianceItems request))))

(defn register-patch-baseline-for-patch-group
  "Registers a patch baseline for a patch group.

  request - `com.amazonaws.services.simplesystemsmanagement.model.RegisterPatchBaselineForPatchGroupRequest`

  returns: Result of the RegisterPatchBaselineForPatchGroup operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.RegisterPatchBaselineForPatchGroupResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.AlreadyExistsException - Error returned if an attempt is made to register a patch group with a patch baseline that is already registered with a different patch baseline."
  (^com.amazonaws.services.simplesystemsmanagement.model.RegisterPatchBaselineForPatchGroupResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.RegisterPatchBaselineForPatchGroupRequest request]
    (-> this (.registerPatchBaselineForPatchGroup request))))

(defn get-deployable-patch-snapshot-for-instance
  "Retrieves the current snapshot for the patch baseline the instance uses. This API is primarily used by the
   AWS-RunPatchBaseline Systems Manager document.

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetDeployablePatchSnapshotForInstanceRequest`

  returns: Result of the GetDeployablePatchSnapshotForInstance operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetDeployablePatchSnapshotForInstanceResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetDeployablePatchSnapshotForInstanceResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.GetDeployablePatchSnapshotForInstanceRequest request]
    (-> this (.getDeployablePatchSnapshotForInstance request))))

(defn list-compliance-summaries
  "Returns a summary count of compliant and non-compliant resources for a compliance type. For example, this call
   can return State Manager associations, patches, or custom compliance types according to the filter criteria that
   you specify.

  request - `com.amazonaws.services.simplesystemsmanagement.model.ListComplianceSummariesRequest`

  returns: Result of the ListComplianceSummaries operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ListComplianceSummariesResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidFilterException - The filter name is not valid. Verify the you entered the correct name and try again."
  (^com.amazonaws.services.simplesystemsmanagement.model.ListComplianceSummariesResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.ListComplianceSummariesRequest request]
    (-> this (.listComplianceSummaries request))))

(defn get-inventory-schema
  "Return a list of inventory type names for the account, or return a list of attribute names for a specific
   Inventory item type.

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetInventorySchemaRequest`

  returns: Result of the GetInventorySchema operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetInventorySchemaResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetInventorySchemaResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.GetInventorySchemaRequest request]
    (-> this (.getInventorySchema request))))

(defn describe-patch-group-state
  "Returns high-level aggregated patch compliance state for a patch group.

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupStateRequest`

  returns: Result of the DescribePatchGroupState operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupStateResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupStateResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupStateRequest request]
    (-> this (.describePatchGroupState request))))

(defn describe-available-patches
  "Lists all patches eligible to be included in a patch baseline.

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAvailablePatchesRequest`

  returns: Result of the DescribeAvailablePatches operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAvailablePatchesResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeAvailablePatchesResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeAvailablePatchesRequest request]
    (-> this (.describeAvailablePatches request))))

(defn get-maintenance-window
  "Retrieves a maintenance window.

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowRequest`

  returns: Result of the GetMaintenanceWindow operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.DoesNotExistException - Error returned when the ID specified for a resource, such as a maintenance window or Patch baseline, doesn't exist. For information about resource limits in Systems Manager, see AWS Systems Manager Limits."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowRequest request]
    (-> this (.getMaintenanceWindow request))))

(defn resume-session
  "Reconnects a session to an instance after it has been disconnected. Connections can be resumed for disconnected
   sessions, but not terminated sessions.



   This command is primarily for use by client machines to automatically reconnect during intermittent network
   issues. It is not intended for any other use.

  request - `com.amazonaws.services.simplesystemsmanagement.model.ResumeSessionRequest`

  returns: Result of the ResumeSession operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ResumeSessionResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.DoesNotExistException - Error returned when the ID specified for a resource, such as a maintenance window or Patch baseline, doesn't exist. For information about resource limits in Systems Manager, see AWS Systems Manager Limits."
  (^com.amazonaws.services.simplesystemsmanagement.model.ResumeSessionResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.ResumeSessionRequest request]
    (-> this (.resumeSession request))))

(defn list-association-versions
  "Retrieves all versions of an association for a specific association ID.

  request - `com.amazonaws.services.simplesystemsmanagement.model.ListAssociationVersionsRequest`

  returns: Result of the ListAssociationVersions operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ListAssociationVersionsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.ListAssociationVersionsResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.ListAssociationVersionsRequest request]
    (-> this (.listAssociationVersions request))))

(defn describe-instance-information
  "Describes one or more of your instances. You can use this to get information about instances like the operating
   system platform, the SSM Agent version (Linux), status etc. If you specify one or more instance IDs, it returns
   information for those instances. If you do not specify instance IDs, it returns information for all your
   instances. If you specify an instance ID that is not valid or an instance that you do not own, you receive an
   error.



   The IamRole field for this API action is the Amazon Identity and Access Management (IAM) role assigned to
   on-premises instances. This call does not return the IAM role for Amazon EC2 instances.

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceInformationRequest`

  returns: Result of the DescribeInstanceInformation operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceInformationResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceInformationResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceInformationRequest request]
    (-> this (.describeInstanceInformation request))))

(defn deregister-target-from-maintenance-window
  "Removes a target from a maintenance window.

  request - `com.amazonaws.services.simplesystemsmanagement.model.DeregisterTargetFromMaintenanceWindowRequest`

  returns: Result of the DeregisterTargetFromMaintenanceWindow operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DeregisterTargetFromMaintenanceWindowResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.DoesNotExistException - Error returned when the ID specified for a resource, such as a maintenance window or Patch baseline, doesn't exist. For information about resource limits in Systems Manager, see AWS Systems Manager Limits."
  (^com.amazonaws.services.simplesystemsmanagement.model.DeregisterTargetFromMaintenanceWindowResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DeregisterTargetFromMaintenanceWindowRequest request]
    (-> this (.deregisterTargetFromMaintenanceWindow request))))

(defn describe-association-executions
  "Use this API action to view all executions for a specific association ID.

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationExecutionsRequest`

  returns: Result of the DescribeAssociationExecutions operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationExecutionsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationExecutionsResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationExecutionsRequest request]
    (-> this (.describeAssociationExecutions request))))

(defn describe-automation-step-executions
  "Information about all active and terminated step executions in an Automation workflow.

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationStepExecutionsRequest`

  returns: Result of the DescribeAutomationStepExecutions operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationStepExecutionsResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.AutomationExecutionNotFoundException - There is no automation execution information for the requested automation execution ID."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationStepExecutionsResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationStepExecutionsRequest request]
    (-> this (.describeAutomationStepExecutions request))))

(defn get-parameter-history
  "Query a list of all parameters used by the AWS account.

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetParameterHistoryRequest`

  returns: Result of the GetParameterHistory operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetParameterHistoryResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetParameterHistoryResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.GetParameterHistoryRequest request]
    (-> this (.getParameterHistory request))))

(defn get-command-invocation
  "Returns detailed information about command execution for an invocation or plugin.

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetCommandInvocationRequest`

  returns: Result of the GetCommandInvocation operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetCommandInvocationResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetCommandInvocationResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.GetCommandInvocationRequest request]
    (-> this (.getCommandInvocation request))))

(defn create-activation
  "Registers your on-premises server or virtual machine with Amazon EC2 so that you can manage these resources using
   Run Command. An on-premises server or virtual machine that has been registered with EC2 is called a managed
   instance. For more information about activations, see Setting
   Up AWS Systems Manager for Hybrid Environments.

  request - `com.amazonaws.services.simplesystemsmanagement.model.CreateActivationRequest`

  returns: Result of the CreateActivation operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.CreateActivationResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.CreateActivationResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.CreateActivationRequest request]
    (-> this (.createActivation request))))

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

  request - `com.amazonaws.services.simplesystemsmanagement.model.AddTagsToResourceRequest`

  returns: Result of the AddTagsToResource operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.AddTagsToResourceResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidResourceTypeException - The resource type is not valid. For example, if you are attempting to tag an instance, the instance must be a registered, managed instance."
  (^com.amazonaws.services.simplesystemsmanagement.model.AddTagsToResourceResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.AddTagsToResourceRequest request]
    (-> this (.addTagsToResource request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSSimpleSystemsManagementClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn describe-document
  "Describes the specified Systems Manager document.

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentRequest`

  returns: Result of the DescribeDocument operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentRequest request]
    (-> this (.describeDocument request))))

(defn update-association
  "Updates an association. You can update the association name and version, the document version, schedule,
   parameters, and Amazon S3 output.



   When you update an association, the association immediately runs against the specified targets.

  request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationRequest`

  returns: Result of the UpdateAssociation operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidUpdateException - The update is not valid."
  (^com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationRequest request]
    (-> this (.updateAssociation request))))

(defn describe-effective-patches-for-patch-baseline
  "Retrieves the current effective patches (the patch and the approval state) for the specified patch baseline. Note
   that this API applies only to Windows patch baselines.

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectivePatchesForPatchBaselineRequest`

  returns: Result of the DescribeEffectivePatchesForPatchBaseline operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectivePatchesForPatchBaselineResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidResourceIdException - The resource ID is not valid. Verify that you entered the correct ID and try again."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectivePatchesForPatchBaselineResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectivePatchesForPatchBaselineRequest request]
    (-> this (.describeEffectivePatchesForPatchBaseline request))))

(defn delete-document
  "Deletes the Systems Manager document and all instance associations to the document.


   Before you delete the document, we recommend that you use DeleteAssociation to disassociate all instances
   that are associated with the document.

  request - `com.amazonaws.services.simplesystemsmanagement.model.DeleteDocumentRequest`

  returns: Result of the DeleteDocument operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DeleteDocumentResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DeleteDocumentResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteDocumentRequest request]
    (-> this (.deleteDocument request))))

(defn deregister-managed-instance
  "Removes the server or virtual machine from the list of registered servers. You can reregister the instance again
   at any time. If you don't plan to use Run Command on the server, we suggest uninstalling SSM Agent first.

  request - `com.amazonaws.services.simplesystemsmanagement.model.DeregisterManagedInstanceRequest`

  returns: Result of the DeregisterManagedInstance operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DeregisterManagedInstanceResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidInstanceIdException - The following problems can cause this exception: You do not have permission to access the instance. SSM Agent is not running. Verify that SSM Agent is running. SSM Agent is not registered with the SSM endpoint. Try reinstalling SSM Agent. The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states are: Shutting-down and Terminated."
  (^com.amazonaws.services.simplesystemsmanagement.model.DeregisterManagedInstanceResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DeregisterManagedInstanceRequest request]
    (-> this (.deregisterManagedInstance request))))

(defn delete-association
  "Disassociates the specified Systems Manager document from the specified instance.


   When you disassociate a document from an instance, it does not change the configuration of the instance. To
   change the configuration state of an instance after you disassociate a document, you must create a new document
   with the desired configuration and associate it with the instance.

  request - `com.amazonaws.services.simplesystemsmanagement.model.DeleteAssociationRequest`

  returns: Result of the DeleteAssociation operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DeleteAssociationResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.AssociationDoesNotExistException - The specified association does not exist."
  (^com.amazonaws.services.simplesystemsmanagement.model.DeleteAssociationResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteAssociationRequest request]
    (-> this (.deleteAssociation request))))

(defn get-ops-item
  "Get information about an OpsItem by using the ID. You must have permission in AWS Identity and Access Management
   (IAM) to view information about an OpsItem. For more information, see Getting Started
   with OpsCenter in the AWS Systems Manager User Guide.


   Operations engineers and IT professionals use OpsCenter to view, investigate, and remediate operational issues
   impacting the performance and health of their AWS resources. For more information, see AWS Systems Manager
   OpsCenter in the AWS Systems Manager User Guide.

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetOpsItemRequest`

  returns: Result of the GetOpsItem operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetOpsItemResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetOpsItemResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.GetOpsItemRequest request]
    (-> this (.getOpsItem request))))

(defn put-parameter
  "Add a parameter to the system.

  request - `com.amazonaws.services.simplesystemsmanagement.model.PutParameterRequest`

  returns: Result of the PutParameter operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.PutParameterResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidAllowedPatternException - The request does not meet the regular expression requirement."
  (^com.amazonaws.services.simplesystemsmanagement.model.PutParameterResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.PutParameterRequest request]
    (-> this (.putParameter request))))

(defn get-maintenance-window-task
  "Lists the tasks in a maintenance window.

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowTaskRequest`

  returns: Result of the GetMaintenanceWindowTask operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowTaskResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.DoesNotExistException - Error returned when the ID specified for a resource, such as a maintenance window or Patch baseline, doesn't exist. For information about resource limits in Systems Manager, see AWS Systems Manager Limits."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowTaskResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowTaskRequest request]
    (-> this (.getMaintenanceWindowTask request))))

(defn describe-maintenance-window-schedule
  "Retrieves information about upcoming executions of a maintenance window.

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowScheduleRequest`

  returns: Result of the DescribeMaintenanceWindowSchedule operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowScheduleResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowScheduleResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowScheduleRequest request]
    (-> this (.describeMaintenanceWindowSchedule request))))

(defn describe-maintenance-windows-for-target
  "Retrieves information about the maintenance window targets or tasks that an instance is associated with.

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsForTargetRequest`

  returns: Result of the DescribeMaintenanceWindowsForTarget operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsForTargetResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsForTargetResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsForTargetRequest request]
    (-> this (.describeMaintenanceWindowsForTarget request))))

(defn send-automation-signal
  "Sends a signal to an Automation execution to change the current behavior or status of the execution.

  request - `com.amazonaws.services.simplesystemsmanagement.model.SendAutomationSignalRequest`

  returns: Result of the SendAutomationSignal operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.SendAutomationSignalResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.AutomationExecutionNotFoundException - There is no automation execution information for the requested automation execution ID."
  (^com.amazonaws.services.simplesystemsmanagement.model.SendAutomationSignalResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.SendAutomationSignalRequest request]
    (-> this (.sendAutomationSignal request))))

(defn delete-activation
  "Deletes an activation. You are not required to delete an activation. If you delete an activation, you can no
   longer use it to register additional managed instances. Deleting an activation does not de-register managed
   instances. You must manually de-register managed instances.

  request - `com.amazonaws.services.simplesystemsmanagement.model.DeleteActivationRequest`

  returns: Result of the DeleteActivation operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DeleteActivationResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InvalidActivationIdException - The activation ID is not valid. Verify the you entered the correct ActivationId or ActivationCode and try again."
  (^com.amazonaws.services.simplesystemsmanagement.model.DeleteActivationResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteActivationRequest request]
    (-> this (.deleteActivation request))))

(defn modify-document-permission
  "Shares a Systems Manager document publicly or privately. If you share a document privately, you must specify the
   AWS user account IDs for those people who can use the document. If you share a document publicly, you must
   specify All as the account ID.

  request - `com.amazonaws.services.simplesystemsmanagement.model.ModifyDocumentPermissionRequest`

  returns: Result of the ModifyDocumentPermission operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ModifyDocumentPermissionResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.simplesystemsmanagement.model.ModifyDocumentPermissionResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.ModifyDocumentPermissionRequest request]
    (-> this (.modifyDocumentPermission request))))

(defn get-automation-execution
  "Get detailed information about a particular Automation execution.

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetAutomationExecutionRequest`

  returns: Result of the GetAutomationExecution operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetAutomationExecutionResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.AutomationExecutionNotFoundException - There is no automation execution information for the requested automation execution ID."
  (^com.amazonaws.services.simplesystemsmanagement.model.GetAutomationExecutionResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.GetAutomationExecutionRequest request]
    (-> this (.getAutomationExecution request))))

(defn update-patch-baseline
  "Modifies an existing patch baseline. Fields not specified in the request are left unchanged.



   For information about valid key and value pairs in PatchFilters for each supported operating system
   type, see PatchFilter.

  request - `com.amazonaws.services.simplesystemsmanagement.model.UpdatePatchBaselineRequest`

  returns: Result of the UpdatePatchBaseline operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.UpdatePatchBaselineResult`

  throws: com.amazonaws.services.simplesystemsmanagement.model.DoesNotExistException - Error returned when the ID specified for a resource, such as a maintenance window or Patch baseline, doesn't exist. For information about resource limits in Systems Manager, see AWS Systems Manager Limits."
  (^com.amazonaws.services.simplesystemsmanagement.model.UpdatePatchBaselineResult [^AWSSimpleSystemsManagementClient this ^com.amazonaws.services.simplesystemsmanagement.model.UpdatePatchBaselineRequest request]
    (-> this (.updatePatchBaseline request))))

