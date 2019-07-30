(ns com.amazonaws.services.simplesystemsmanagement.AbstractAWSSimpleSystemsManagement
  "Abstract implementation of AWSSimpleSystemsManagement. Convenient method forms pass through to the
  corresponding overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.simplesystemsmanagement AbstractAWSSimpleSystemsManagement]))

(defn put-compliance-items
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.PutComplianceItemsRequest`

  returns: Result of the PutComplianceItems operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.PutComplianceItemsResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.PutComplianceItemsResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.PutComplianceItemsRequest request]
    (-> this (.putComplianceItems request))))

(defn get-patch-baseline-for-patch-group
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineForPatchGroupRequest`

  returns: Result of the GetPatchBaselineForPatchGroup operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineForPatchGroupResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineForPatchGroupResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineForPatchGroupRequest request]
    (-> this (.getPatchBaselineForPatchGroup request))))

(defn describe-maintenance-window-targets
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTargetsRequest`

  returns: Result of the DescribeMaintenanceWindowTargets operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTargetsResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTargetsResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTargetsRequest request]
    (-> this (.describeMaintenanceWindowTargets request))))

(defn update-service-setting
  "Description copied from interface: AWSSimpleSystemsManagement

  request - The request body of the UpdateServiceSetting API action. - `com.amazonaws.services.simplesystemsmanagement.model.UpdateServiceSettingRequest`

  returns: Result of the UpdateServiceSetting operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.UpdateServiceSettingResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.UpdateServiceSettingResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateServiceSettingRequest request]
    (-> this (.updateServiceSetting request))))

(defn list-tags-for-resource
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.ListTagsForResourceResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn terminate-session
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.TerminateSessionRequest`

  returns: Result of the TerminateSession operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.TerminateSessionResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.TerminateSessionResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.TerminateSessionRequest request]
    (-> this (.terminateSession request))))

(defn list-inventory-entries
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.ListInventoryEntriesRequest`

  returns: Result of the ListInventoryEntries operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ListInventoryEntriesResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.ListInventoryEntriesResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.ListInventoryEntriesRequest request]
    (-> this (.listInventoryEntries request))))

(defn describe-automation-executions
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationExecutionsRequest`

  returns: Result of the DescribeAutomationExecutions operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationExecutionsResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationExecutionsResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationExecutionsRequest request]
    (-> this (.describeAutomationExecutions request))))

(defn register-target-with-maintenance-window
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.RegisterTargetWithMaintenanceWindowRequest`

  returns: Result of the RegisterTargetWithMaintenanceWindow operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.RegisterTargetWithMaintenanceWindowResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.RegisterTargetWithMaintenanceWindowResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.RegisterTargetWithMaintenanceWindowRequest request]
    (-> this (.registerTargetWithMaintenanceWindow request))))

(defn delete-resource-data-sync
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DeleteResourceDataSyncRequest`

  returns: Result of the DeleteResourceDataSync operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DeleteResourceDataSyncResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DeleteResourceDataSyncResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteResourceDataSyncRequest request]
    (-> this (.deleteResourceDataSync request))))

(defn set-region
  "Description copied from interface: AWSSimpleSystemsManagement

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn describe-instance-associations-status
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceAssociationsStatusRequest`

  returns: Result of the DescribeInstanceAssociationsStatus operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceAssociationsStatusResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceAssociationsStatusResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceAssociationsStatusRequest request]
    (-> this (.describeInstanceAssociationsStatus request))))

(defn delete-maintenance-window
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DeleteMaintenanceWindowRequest`

  returns: Result of the DeleteMaintenanceWindow operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DeleteMaintenanceWindowResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DeleteMaintenanceWindowResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteMaintenanceWindowRequest request]
    (-> this (.deleteMaintenanceWindow request))))

(defn update-maintenance-window-target
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTargetRequest`

  returns: Result of the UpdateMaintenanceWindowTarget operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTargetResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTargetResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTargetRequest request]
    (-> this (.updateMaintenanceWindowTarget request))))

(defn update-maintenance-window
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowRequest`

  returns: Result of the UpdateMaintenanceWindow operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowRequest request]
    (-> this (.updateMaintenanceWindow request))))

(defn deregister-task-from-maintenance-window
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DeregisterTaskFromMaintenanceWindowRequest`

  returns: Result of the DeregisterTaskFromMaintenanceWindow operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DeregisterTaskFromMaintenanceWindowResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DeregisterTaskFromMaintenanceWindowResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DeregisterTaskFromMaintenanceWindowRequest request]
    (-> this (.deregisterTaskFromMaintenanceWindow request))))

(defn get-document
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetDocumentRequest`

  returns: Result of the GetDocument operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetDocumentResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.GetDocumentResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetDocumentRequest request]
    (-> this (.getDocument request))))

(defn register-task-with-maintenance-window
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.RegisterTaskWithMaintenanceWindowRequest`

  returns: Result of the RegisterTaskWithMaintenanceWindow operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.RegisterTaskWithMaintenanceWindowResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.RegisterTaskWithMaintenanceWindowResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.RegisterTaskWithMaintenanceWindowRequest request]
    (-> this (.registerTaskWithMaintenanceWindow request))))

(defn describe-maintenance-window-tasks
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTasksRequest`

  returns: Result of the DescribeMaintenanceWindowTasks operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTasksResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTasksResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTasksRequest request]
    (-> this (.describeMaintenanceWindowTasks request))))

(defn get-ops-summary
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetOpsSummaryRequest`

  returns: Result of the GetOpsSummary operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetOpsSummaryResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.GetOpsSummaryResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetOpsSummaryRequest request]
    (-> this (.getOpsSummary request))))

(defn describe-association-execution-targets
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationExecutionTargetsRequest`

  returns: Result of the DescribeAssociationExecutionTargets operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationExecutionTargetsResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationExecutionTargetsResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationExecutionTargetsRequest request]
    (-> this (.describeAssociationExecutionTargets request))))

(defn describe-maintenance-window-execution-tasks
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTasksRequest`

  returns: Result of the DescribeMaintenanceWindowExecutionTasks operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTasksResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTasksResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTasksRequest request]
    (-> this (.describeMaintenanceWindowExecutionTasks request))))

(defn describe-ops-items
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeOpsItemsRequest`

  returns: Result of the DescribeOpsItems operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeOpsItemsResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeOpsItemsResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeOpsItemsRequest request]
    (-> this (.describeOpsItems request))))

(defn start-associations-once
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.StartAssociationsOnceRequest`

  returns: Result of the StartAssociationsOnce operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.StartAssociationsOnceResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.StartAssociationsOnceResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.StartAssociationsOnceRequest request]
    (-> this (.startAssociationsOnce request))))

(defn cancel-command
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.CancelCommandRequest`

  returns: Result of the CancelCommand operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.CancelCommandResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.CancelCommandResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.CancelCommandRequest request]
    (-> this (.cancelCommand request))))

(defn describe-association
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationRequest`

  returns: Result of the DescribeAssociation operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationRequest request]
    (-> this (.describeAssociation request))))

(defn list-commands
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.ListCommandsRequest`

  returns: Result of the ListCommands operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ListCommandsResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.ListCommandsResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.ListCommandsRequest request]
    (-> this (.listCommands request))))

(defn create-ops-item
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.CreateOpsItemRequest`

  returns: Result of the CreateOpsItem operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.CreateOpsItemResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.CreateOpsItemResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.CreateOpsItemRequest request]
    (-> this (.createOpsItem request))))

(defn cancel-maintenance-window-execution
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.CancelMaintenanceWindowExecutionRequest`

  returns: Result of the CancelMaintenanceWindowExecution operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.CancelMaintenanceWindowExecutionResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.CancelMaintenanceWindowExecutionResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.CancelMaintenanceWindowExecutionRequest request]
    (-> this (.cancelMaintenanceWindowExecution request))))

(defn get-default-patch-baseline
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetDefaultPatchBaselineRequest`

  returns: Result of the GetDefaultPatchBaseline operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetDefaultPatchBaselineResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.GetDefaultPatchBaselineResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetDefaultPatchBaselineRequest request]
    (-> this (.getDefaultPatchBaseline request))))

(defn create-association-batch
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationBatchRequest`

  returns: Result of the CreateAssociationBatch operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationBatchResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationBatchResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationBatchRequest request]
    (-> this (.createAssociationBatch request))))

(defn delete-inventory
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DeleteInventoryRequest`

  returns: Result of the DeleteInventory operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DeleteInventoryResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DeleteInventoryResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteInventoryRequest request]
    (-> this (.deleteInventory request))))

(defn create-document
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.CreateDocumentRequest`

  returns: Result of the CreateDocument operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.CreateDocumentResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.CreateDocumentResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.CreateDocumentRequest request]
    (-> this (.createDocument request))))

(defn register-default-patch-baseline
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.RegisterDefaultPatchBaselineRequest`

  returns: Result of the RegisterDefaultPatchBaseline operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.RegisterDefaultPatchBaselineResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.RegisterDefaultPatchBaselineResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.RegisterDefaultPatchBaselineRequest request]
    (-> this (.registerDefaultPatchBaseline request))))

(defn start-automation-execution
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.StartAutomationExecutionRequest`

  returns: Result of the StartAutomationExecution operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.StartAutomationExecutionResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.StartAutomationExecutionResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.StartAutomationExecutionRequest request]
    (-> this (.startAutomationExecution request))))

(defn describe-effective-instance-associations
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectiveInstanceAssociationsRequest`

  returns: Result of the DescribeEffectiveInstanceAssociations operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectiveInstanceAssociationsResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectiveInstanceAssociationsResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectiveInstanceAssociationsRequest request]
    (-> this (.describeEffectiveInstanceAssociations request))))

(defn describe-maintenance-window-execution-task-invocations
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTaskInvocationsRequest`

  returns: Result of the DescribeMaintenanceWindowExecutionTaskInvocations operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTaskInvocationsResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTaskInvocationsResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTaskInvocationsRequest request]
    (-> this (.describeMaintenanceWindowExecutionTaskInvocations request))))

(defn get-patch-baseline
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineRequest`

  returns: Result of the GetPatchBaseline operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineRequest request]
    (-> this (.getPatchBaseline request))))

(defn update-ops-item
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateOpsItemRequest`

  returns: Result of the UpdateOpsItem operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.UpdateOpsItemResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.UpdateOpsItemResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateOpsItemRequest request]
    (-> this (.updateOpsItem request))))

(defn describe-maintenance-windows
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsRequest`

  returns: Result of the DescribeMaintenanceWindows operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsRequest request]
    (-> this (.describeMaintenanceWindows request))))

(defn get-maintenance-window-execution
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionRequest`

  returns: Result of the GetMaintenanceWindowExecution operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionRequest request]
    (-> this (.getMaintenanceWindowExecution request))))

(defn update-managed-instance-role
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateManagedInstanceRoleRequest`

  returns: Result of the UpdateManagedInstanceRole operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.UpdateManagedInstanceRoleResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.UpdateManagedInstanceRoleResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateManagedInstanceRoleRequest request]
    (-> this (.updateManagedInstanceRole request))))

(defn list-resource-data-sync
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.ListResourceDataSyncRequest`

  returns: Result of the ListResourceDataSync operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ListResourceDataSyncResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.ListResourceDataSyncResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.ListResourceDataSyncRequest request]
    (-> this (.listResourceDataSync request))))

(defn update-association-status
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationStatusRequest`

  returns: Result of the UpdateAssociationStatus operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationStatusResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationStatusResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationStatusRequest request]
    (-> this (.updateAssociationStatus request))))

(defn get-parameters
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetParametersRequest`

  returns: Result of the GetParameters operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetParametersResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.GetParametersResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetParametersRequest request]
    (-> this (.getParameters request))))

(defn update-document
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentRequest`

  returns: Result of the UpdateDocument operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentRequest request]
    (-> this (.updateDocument request))))

(defn describe-instance-patch-states
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesRequest`

  returns: Result of the DescribeInstancePatchStates operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesRequest request]
    (-> this (.describeInstancePatchStates request))))

(defn describe-patch-baselines
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribePatchBaselinesRequest`

  returns: Result of the DescribePatchBaselines operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribePatchBaselinesResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribePatchBaselinesResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribePatchBaselinesRequest request]
    (-> this (.describePatchBaselines request))))

(defn describe-patch-properties
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribePatchPropertiesRequest`

  returns: Result of the DescribePatchProperties operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribePatchPropertiesResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribePatchPropertiesResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribePatchPropertiesRequest request]
    (-> this (.describePatchProperties request))))

(defn create-resource-data-sync
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.CreateResourceDataSyncRequest`

  returns: Result of the CreateResourceDataSync operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.CreateResourceDataSyncResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.CreateResourceDataSyncResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.CreateResourceDataSyncRequest request]
    (-> this (.createResourceDataSync request))))

(defn describe-maintenance-window-executions
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionsRequest`

  returns: Result of the DescribeMaintenanceWindowExecutions operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionsResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionsResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionsRequest request]
    (-> this (.describeMaintenanceWindowExecutions request))))

(defn get-connection-status
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetConnectionStatusRequest`

  returns: Result of the GetConnectionStatus operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetConnectionStatusResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.GetConnectionStatusResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetConnectionStatusRequest request]
    (-> this (.getConnectionStatus request))))

(defn create-patch-baseline
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.CreatePatchBaselineRequest`

  returns: Result of the CreatePatchBaseline operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.CreatePatchBaselineResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.CreatePatchBaselineResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.CreatePatchBaselineRequest request]
    (-> this (.createPatchBaseline request))))

(defn list-associations
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.ListAssociationsRequest`

  returns: Result of the ListAssociations operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ListAssociationsResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.ListAssociationsResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.ListAssociationsRequest request]
    (-> this (.listAssociations request))))

(defn describe-instance-patches
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchesRequest`

  returns: Result of the DescribeInstancePatches operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchesResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchesResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchesRequest request]
    (-> this (.describeInstancePatches request))))

(defn list-resource-compliance-summaries
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.ListResourceComplianceSummariesRequest`

  returns: Result of the ListResourceComplianceSummaries operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ListResourceComplianceSummariesResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.ListResourceComplianceSummariesResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.ListResourceComplianceSummariesRequest request]
    (-> this (.listResourceComplianceSummaries request))))

(defn describe-inventory-deletions
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInventoryDeletionsRequest`

  returns: Result of the DescribeInventoryDeletions operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInventoryDeletionsResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeInventoryDeletionsResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeInventoryDeletionsRequest request]
    (-> this (.describeInventoryDeletions request))))

(defn describe-activations
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeActivationsRequest`

  returns: Result of the DescribeActivations operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeActivationsResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeActivationsResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeActivationsRequest request]
    (-> this (.describeActivations request))))

(defn reset-service-setting
  "Description copied from interface: AWSSimpleSystemsManagement

  request - The request body of the ResetServiceSetting API action. - `com.amazonaws.services.simplesystemsmanagement.model.ResetServiceSettingRequest`

  returns: Result of the ResetServiceSetting operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ResetServiceSettingResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.ResetServiceSettingResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.ResetServiceSettingRequest request]
    (-> this (.resetServiceSetting request))))

(defn label-parameter-version
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.LabelParameterVersionRequest`

  returns: Result of the LabelParameterVersion operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.LabelParameterVersionResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.LabelParameterVersionResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.LabelParameterVersionRequest request]
    (-> this (.labelParameterVersion request))))

(defn list-command-invocations
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.ListCommandInvocationsRequest`

  returns: Result of the ListCommandInvocations operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ListCommandInvocationsResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.ListCommandInvocationsResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.ListCommandInvocationsRequest request]
    (-> this (.listCommandInvocations request))))

(defn get-parameters-by-path
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetParametersByPathRequest`

  returns: Result of the GetParametersByPath operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetParametersByPathResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.GetParametersByPathResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetParametersByPathRequest request]
    (-> this (.getParametersByPath request))))

(defn shutdown
  "Description copied from interface: AWSSimpleSystemsManagement"
  ([^AbstractAWSSimpleSystemsManagement this]
    (-> this (.shutdown))))

(defn create-association
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationRequest`

  returns: Result of the CreateAssociation operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationRequest request]
    (-> this (.createAssociation request))))

(defn put-inventory
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.PutInventoryRequest`

  returns: Result of the PutInventory operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.PutInventoryResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.PutInventoryResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.PutInventoryRequest request]
    (-> this (.putInventory request))))

(defn describe-document-permission
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentPermissionRequest`

  returns: Result of the DescribeDocumentPermission operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentPermissionResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentPermissionResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentPermissionRequest request]
    (-> this (.describeDocumentPermission request))))

(defn delete-patch-baseline
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DeletePatchBaselineRequest`

  returns: Result of the DeletePatchBaseline operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DeletePatchBaselineResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DeletePatchBaselineResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DeletePatchBaselineRequest request]
    (-> this (.deletePatchBaseline request))))

(defn update-document-default-version
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentDefaultVersionRequest`

  returns: Result of the UpdateDocumentDefaultVersion operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentDefaultVersionResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentDefaultVersionResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentDefaultVersionRequest request]
    (-> this (.updateDocumentDefaultVersion request))))

(defn update-maintenance-window-task
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTaskRequest`

  returns: Result of the UpdateMaintenanceWindowTask operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTaskResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTaskResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTaskRequest request]
    (-> this (.updateMaintenanceWindowTask request))))

(defn list-document-versions
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.ListDocumentVersionsRequest`

  returns: Result of the ListDocumentVersions operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ListDocumentVersionsResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.ListDocumentVersionsResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.ListDocumentVersionsRequest request]
    (-> this (.listDocumentVersions request))))

(defn delete-parameters
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DeleteParametersRequest`

  returns: Result of the DeleteParameters operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DeleteParametersResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DeleteParametersResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteParametersRequest request]
    (-> this (.deleteParameters request))))

(defn describe-sessions
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeSessionsRequest`

  returns: Result of the DescribeSessions operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeSessionsResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeSessionsResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeSessionsRequest request]
    (-> this (.describeSessions request))))

(defn set-endpoint
  "Description copied from interface: AWSSimpleSystemsManagement

  endpoint - The endpoint (ex: \"ssm.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://ssm.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAWSSimpleSystemsManagement this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn describe-parameters
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeParametersRequest`

  returns: Result of the DescribeParameters operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeParametersResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeParametersResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeParametersRequest request]
    (-> this (.describeParameters request))))

(defn get-parameter
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetParameterRequest`

  returns: Result of the GetParameter operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetParameterResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.GetParameterResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetParameterRequest request]
    (-> this (.getParameter request))))

(defn stop-automation-execution
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.StopAutomationExecutionRequest`

  returns: Result of the StopAutomationExecution operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.StopAutomationExecutionResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.StopAutomationExecutionResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.StopAutomationExecutionRequest request]
    (-> this (.stopAutomationExecution request))))

(defn describe-patch-groups
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupsRequest`

  returns: Result of the DescribePatchGroups operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupsResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupsResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupsRequest request]
    (-> this (.describePatchGroups request))))

(defn create-maintenance-window
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.CreateMaintenanceWindowRequest`

  returns: Result of the CreateMaintenanceWindow operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.CreateMaintenanceWindowResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.CreateMaintenanceWindowResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.CreateMaintenanceWindowRequest request]
    (-> this (.createMaintenanceWindow request))))

(defn list-documents
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.ListDocumentsRequest`

  returns: Result of the ListDocuments operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ListDocumentsResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.ListDocumentsResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.ListDocumentsRequest request]
    (-> this (.listDocuments request)))
  (^com.amazonaws.services.simplesystemsmanagement.model.ListDocumentsResult [^AbstractAWSSimpleSystemsManagement this]
    (-> this (.listDocuments))))

(defn deregister-patch-baseline-for-patch-group
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DeregisterPatchBaselineForPatchGroupRequest`

  returns: Result of the DeregisterPatchBaselineForPatchGroup operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DeregisterPatchBaselineForPatchGroupResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DeregisterPatchBaselineForPatchGroupResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DeregisterPatchBaselineForPatchGroupRequest request]
    (-> this (.deregisterPatchBaselineForPatchGroup request))))

(defn start-session
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.StartSessionRequest`

  returns: Result of the StartSession operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.StartSessionResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.StartSessionResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.StartSessionRequest request]
    (-> this (.startSession request))))

(defn get-service-setting
  "Description copied from interface: AWSSimpleSystemsManagement

  request - The request body of the GetServiceSetting API action. - `com.amazonaws.services.simplesystemsmanagement.model.GetServiceSettingRequest`

  returns: Result of the GetServiceSetting operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetServiceSettingResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.GetServiceSettingResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetServiceSettingRequest request]
    (-> this (.getServiceSetting request))))

(defn get-maintenance-window-execution-task-invocation
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskInvocationRequest`

  returns: Result of the GetMaintenanceWindowExecutionTaskInvocation operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskInvocationResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskInvocationResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskInvocationRequest request]
    (-> this (.getMaintenanceWindowExecutionTaskInvocation request))))

(defn delete-parameter
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DeleteParameterRequest`

  returns: Result of the DeleteParameter operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DeleteParameterResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DeleteParameterResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteParameterRequest request]
    (-> this (.deleteParameter request))))

(defn get-inventory
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetInventoryRequest`

  returns: Result of the GetInventory operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetInventoryResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.GetInventoryResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetInventoryRequest request]
    (-> this (.getInventory request))))

(defn get-maintenance-window-execution-task
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskRequest`

  returns: Result of the GetMaintenanceWindowExecutionTask operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskRequest request]
    (-> this (.getMaintenanceWindowExecutionTask request))))

(defn remove-tags-from-resource
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.RemoveTagsFromResourceRequest`

  returns: Result of the RemoveTagsFromResource operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.RemoveTagsFromResourceResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.RemoveTagsFromResourceResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.RemoveTagsFromResourceRequest request]
    (-> this (.removeTagsFromResource request))))

(defn describe-instance-patch-states-for-patch-group
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesForPatchGroupRequest`

  returns: Result of the DescribeInstancePatchStatesForPatchGroup operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesForPatchGroupResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesForPatchGroupResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesForPatchGroupRequest request]
    (-> this (.describeInstancePatchStatesForPatchGroup request))))

(defn send-command
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.SendCommandRequest`

  returns: Result of the SendCommand operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.SendCommandResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.SendCommandResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.SendCommandRequest request]
    (-> this (.sendCommand request))))

(defn list-compliance-items
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.ListComplianceItemsRequest`

  returns: Result of the ListComplianceItems operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ListComplianceItemsResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.ListComplianceItemsResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.ListComplianceItemsRequest request]
    (-> this (.listComplianceItems request))))

(defn register-patch-baseline-for-patch-group
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.RegisterPatchBaselineForPatchGroupRequest`

  returns: Result of the RegisterPatchBaselineForPatchGroup operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.RegisterPatchBaselineForPatchGroupResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.RegisterPatchBaselineForPatchGroupResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.RegisterPatchBaselineForPatchGroupRequest request]
    (-> this (.registerPatchBaselineForPatchGroup request))))

(defn get-deployable-patch-snapshot-for-instance
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetDeployablePatchSnapshotForInstanceRequest`

  returns: Result of the GetDeployablePatchSnapshotForInstance operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetDeployablePatchSnapshotForInstanceResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.GetDeployablePatchSnapshotForInstanceResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetDeployablePatchSnapshotForInstanceRequest request]
    (-> this (.getDeployablePatchSnapshotForInstance request))))

(defn list-compliance-summaries
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.ListComplianceSummariesRequest`

  returns: Result of the ListComplianceSummaries operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ListComplianceSummariesResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.ListComplianceSummariesResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.ListComplianceSummariesRequest request]
    (-> this (.listComplianceSummaries request))))

(defn get-inventory-schema
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetInventorySchemaRequest`

  returns: Result of the GetInventorySchema operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetInventorySchemaResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.GetInventorySchemaResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetInventorySchemaRequest request]
    (-> this (.getInventorySchema request))))

(defn describe-patch-group-state
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupStateRequest`

  returns: Result of the DescribePatchGroupState operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupStateResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupStateResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupStateRequest request]
    (-> this (.describePatchGroupState request))))

(defn describe-available-patches
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAvailablePatchesRequest`

  returns: Result of the DescribeAvailablePatches operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAvailablePatchesResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeAvailablePatchesResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeAvailablePatchesRequest request]
    (-> this (.describeAvailablePatches request))))

(defn get-maintenance-window
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowRequest`

  returns: Result of the GetMaintenanceWindow operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowRequest request]
    (-> this (.getMaintenanceWindow request))))

(defn resume-session
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.ResumeSessionRequest`

  returns: Result of the ResumeSession operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ResumeSessionResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.ResumeSessionResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.ResumeSessionRequest request]
    (-> this (.resumeSession request))))

(defn list-association-versions
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.ListAssociationVersionsRequest`

  returns: Result of the ListAssociationVersions operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ListAssociationVersionsResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.ListAssociationVersionsResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.ListAssociationVersionsRequest request]
    (-> this (.listAssociationVersions request))))

(defn describe-instance-information
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceInformationRequest`

  returns: Result of the DescribeInstanceInformation operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceInformationResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceInformationResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceInformationRequest request]
    (-> this (.describeInstanceInformation request))))

(defn deregister-target-from-maintenance-window
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DeregisterTargetFromMaintenanceWindowRequest`

  returns: Result of the DeregisterTargetFromMaintenanceWindow operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DeregisterTargetFromMaintenanceWindowResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DeregisterTargetFromMaintenanceWindowResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DeregisterTargetFromMaintenanceWindowRequest request]
    (-> this (.deregisterTargetFromMaintenanceWindow request))))

(defn describe-association-executions
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationExecutionsRequest`

  returns: Result of the DescribeAssociationExecutions operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationExecutionsResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationExecutionsResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationExecutionsRequest request]
    (-> this (.describeAssociationExecutions request))))

(defn describe-automation-step-executions
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationStepExecutionsRequest`

  returns: Result of the DescribeAutomationStepExecutions operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationStepExecutionsResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationStepExecutionsResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationStepExecutionsRequest request]
    (-> this (.describeAutomationStepExecutions request))))

(defn get-parameter-history
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetParameterHistoryRequest`

  returns: Result of the GetParameterHistory operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetParameterHistoryResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.GetParameterHistoryResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetParameterHistoryRequest request]
    (-> this (.getParameterHistory request))))

(defn get-command-invocation
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetCommandInvocationRequest`

  returns: Result of the GetCommandInvocation operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetCommandInvocationResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.GetCommandInvocationResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetCommandInvocationRequest request]
    (-> this (.getCommandInvocation request))))

(defn create-activation
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.CreateActivationRequest`

  returns: Result of the CreateActivation operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.CreateActivationResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.CreateActivationResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.CreateActivationRequest request]
    (-> this (.createActivation request))))

(defn add-tags-to-resource
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.AddTagsToResourceRequest`

  returns: Result of the AddTagsToResource operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.AddTagsToResourceResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.AddTagsToResourceResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.AddTagsToResourceRequest request]
    (-> this (.addTagsToResource request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSSimpleSystemsManagement

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn describe-document
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentRequest`

  returns: Result of the DescribeDocument operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentRequest request]
    (-> this (.describeDocument request))))

(defn update-association
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationRequest`

  returns: Result of the UpdateAssociation operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationRequest request]
    (-> this (.updateAssociation request))))

(defn describe-effective-patches-for-patch-baseline
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectivePatchesForPatchBaselineRequest`

  returns: Result of the DescribeEffectivePatchesForPatchBaseline operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectivePatchesForPatchBaselineResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectivePatchesForPatchBaselineResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectivePatchesForPatchBaselineRequest request]
    (-> this (.describeEffectivePatchesForPatchBaseline request))))

(defn delete-document
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DeleteDocumentRequest`

  returns: Result of the DeleteDocument operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DeleteDocumentResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DeleteDocumentResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteDocumentRequest request]
    (-> this (.deleteDocument request))))

(defn deregister-managed-instance
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DeregisterManagedInstanceRequest`

  returns: Result of the DeregisterManagedInstance operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DeregisterManagedInstanceResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DeregisterManagedInstanceResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DeregisterManagedInstanceRequest request]
    (-> this (.deregisterManagedInstance request))))

(defn delete-association
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DeleteAssociationRequest`

  returns: Result of the DeleteAssociation operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DeleteAssociationResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DeleteAssociationResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteAssociationRequest request]
    (-> this (.deleteAssociation request))))

(defn get-ops-item
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetOpsItemRequest`

  returns: Result of the GetOpsItem operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetOpsItemResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.GetOpsItemResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetOpsItemRequest request]
    (-> this (.getOpsItem request))))

(defn put-parameter
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.PutParameterRequest`

  returns: Result of the PutParameter operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.PutParameterResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.PutParameterResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.PutParameterRequest request]
    (-> this (.putParameter request))))

(defn get-maintenance-window-task
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowTaskRequest`

  returns: Result of the GetMaintenanceWindowTask operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowTaskResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowTaskResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowTaskRequest request]
    (-> this (.getMaintenanceWindowTask request))))

(defn describe-maintenance-window-schedule
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowScheduleRequest`

  returns: Result of the DescribeMaintenanceWindowSchedule operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowScheduleResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowScheduleResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowScheduleRequest request]
    (-> this (.describeMaintenanceWindowSchedule request))))

(defn describe-maintenance-windows-for-target
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsForTargetRequest`

  returns: Result of the DescribeMaintenanceWindowsForTarget operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsForTargetResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsForTargetResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsForTargetRequest request]
    (-> this (.describeMaintenanceWindowsForTarget request))))

(defn send-automation-signal
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.SendAutomationSignalRequest`

  returns: Result of the SendAutomationSignal operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.SendAutomationSignalResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.SendAutomationSignalResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.SendAutomationSignalRequest request]
    (-> this (.sendAutomationSignal request))))

(defn delete-activation
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.DeleteActivationRequest`

  returns: Result of the DeleteActivation operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.DeleteActivationResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.DeleteActivationResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteActivationRequest request]
    (-> this (.deleteActivation request))))

(defn modify-document-permission
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.ModifyDocumentPermissionRequest`

  returns: Result of the ModifyDocumentPermission operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.ModifyDocumentPermissionResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.ModifyDocumentPermissionResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.ModifyDocumentPermissionRequest request]
    (-> this (.modifyDocumentPermission request))))

(defn get-automation-execution
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetAutomationExecutionRequest`

  returns: Result of the GetAutomationExecution operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.GetAutomationExecutionResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.GetAutomationExecutionResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.GetAutomationExecutionRequest request]
    (-> this (.getAutomationExecution request))))

(defn update-patch-baseline
  "Description copied from interface: AWSSimpleSystemsManagement

  request - `com.amazonaws.services.simplesystemsmanagement.model.UpdatePatchBaselineRequest`

  returns: Result of the UpdatePatchBaseline operation returned by the service. - `com.amazonaws.services.simplesystemsmanagement.model.UpdatePatchBaselineResult`"
  (^com.amazonaws.services.simplesystemsmanagement.model.UpdatePatchBaselineResult [^AbstractAWSSimpleSystemsManagement this ^com.amazonaws.services.simplesystemsmanagement.model.UpdatePatchBaselineRequest request]
    (-> this (.updatePatchBaseline request))))

