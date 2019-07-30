(ns com.amazonaws.services.simplesystemsmanagement.AbstractAWSSimpleSystemsManagementAsync
  "Abstract implementation of AWSSimpleSystemsManagementAsync. Convenient method forms pass through to the
  corresponding overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.simplesystemsmanagement AbstractAWSSimpleSystemsManagementAsync]))

(defn send-automation-signal-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.SendAutomationSignalRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SendAutomationSignal operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.SendAutomationSignalResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.SendAutomationSignalRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendAutomationSignalAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.SendAutomationSignalRequest request]
    (-> this (.sendAutomationSignalAsync request))))

(defn list-resource-compliance-summaries-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.ListResourceComplianceSummariesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListResourceComplianceSummaries operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.ListResourceComplianceSummariesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListResourceComplianceSummariesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listResourceComplianceSummariesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListResourceComplianceSummariesRequest request]
    (-> this (.listResourceComplianceSummariesAsync request))))

(defn get-parameters-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetParametersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetParameters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetParametersResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetParametersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getParametersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetParametersRequest request]
    (-> this (.getParametersAsync request))))

(defn get-maintenance-window-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMaintenanceWindow operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMaintenanceWindowAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowRequest request]
    (-> this (.getMaintenanceWindowAsync request))))

(defn update-maintenance-window-target-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTargetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateMaintenanceWindowTarget operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTargetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTargetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateMaintenanceWindowTargetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTargetRequest request]
    (-> this (.updateMaintenanceWindowTargetAsync request))))

(defn describe-maintenance-window-targets-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTargetsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeMaintenanceWindowTargets operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTargetsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTargetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeMaintenanceWindowTargetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTargetsRequest request]
    (-> this (.describeMaintenanceWindowTargetsAsync request))))

(defn update-ops-item-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateOpsItemRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateOpsItem operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.UpdateOpsItemResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateOpsItemRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateOpsItemAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateOpsItemRequest request]
    (-> this (.updateOpsItemAsync request))))

(defn describe-activations-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeActivationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeActivations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeActivationsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeActivationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeActivationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeActivationsRequest request]
    (-> this (.describeActivationsAsync request))))

(defn get-inventory-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetInventoryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetInventory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetInventoryResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetInventoryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getInventoryAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetInventoryRequest request]
    (-> this (.getInventoryAsync request))))

(defn list-commands-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.ListCommandsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListCommands operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.ListCommandsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListCommandsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listCommandsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListCommandsRequest request]
    (-> this (.listCommandsAsync request))))

(defn get-ops-item-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetOpsItemRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetOpsItem operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetOpsItemResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetOpsItemRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getOpsItemAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetOpsItemRequest request]
    (-> this (.getOpsItemAsync request))))

(defn describe-effective-patches-for-patch-baseline-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectivePatchesForPatchBaselineRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEffectivePatchesForPatchBaseline operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectivePatchesForPatchBaselineResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectivePatchesForPatchBaselineRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEffectivePatchesForPatchBaselineAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectivePatchesForPatchBaselineRequest request]
    (-> this (.describeEffectivePatchesForPatchBaselineAsync request))))

(defn describe-maintenance-window-schedule-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowScheduleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeMaintenanceWindowSchedule operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowScheduleResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowScheduleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeMaintenanceWindowScheduleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowScheduleRequest request]
    (-> this (.describeMaintenanceWindowScheduleAsync request))))

(defn start-automation-execution-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.StartAutomationExecutionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartAutomationExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.StartAutomationExecutionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.StartAutomationExecutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startAutomationExecutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.StartAutomationExecutionRequest request]
    (-> this (.startAutomationExecutionAsync request))))

(defn start-session-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.StartSessionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartSession operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.StartSessionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.StartSessionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startSessionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.StartSessionRequest request]
    (-> this (.startSessionAsync request))))

(defn get-inventory-schema-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetInventorySchemaRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetInventorySchema operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetInventorySchemaResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetInventorySchemaRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getInventorySchemaAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetInventorySchemaRequest request]
    (-> this (.getInventorySchemaAsync request))))

(defn describe-maintenance-window-execution-task-invocations-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTaskInvocationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeMaintenanceWindowExecutionTaskInvocations operation
           returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTaskInvocationsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTaskInvocationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeMaintenanceWindowExecutionTaskInvocationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTaskInvocationsRequest request]
    (-> this (.describeMaintenanceWindowExecutionTaskInvocationsAsync request))))

(defn delete-patch-baseline-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DeletePatchBaselineRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePatchBaseline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DeletePatchBaselineResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeletePatchBaselineRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePatchBaselineAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeletePatchBaselineRequest request]
    (-> this (.deletePatchBaselineAsync request))))

(defn put-compliance-items-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.PutComplianceItemsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutComplianceItems operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.PutComplianceItemsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.PutComplianceItemsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putComplianceItemsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.PutComplianceItemsRequest request]
    (-> this (.putComplianceItemsAsync request))))

(defn describe-document-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDocument operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDocumentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentRequest request]
    (-> this (.describeDocumentAsync request))))

(defn deregister-patch-baseline-for-patch-group-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DeregisterPatchBaselineForPatchGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterPatchBaselineForPatchGroup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DeregisterPatchBaselineForPatchGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeregisterPatchBaselineForPatchGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterPatchBaselineForPatchGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeregisterPatchBaselineForPatchGroupRequest request]
    (-> this (.deregisterPatchBaselineForPatchGroupAsync request))))

(defn describe-association-execution-targets-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationExecutionTargetsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAssociationExecutionTargets operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationExecutionTargetsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationExecutionTargetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAssociationExecutionTargetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationExecutionTargetsRequest request]
    (-> this (.describeAssociationExecutionTargetsAsync request))))

(defn register-task-with-maintenance-window-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.RegisterTaskWithMaintenanceWindowRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterTaskWithMaintenanceWindow operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.RegisterTaskWithMaintenanceWindowResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.RegisterTaskWithMaintenanceWindowRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerTaskWithMaintenanceWindowAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.RegisterTaskWithMaintenanceWindowRequest request]
    (-> this (.registerTaskWithMaintenanceWindowAsync request))))

(defn delete-document-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DeleteDocumentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDocument operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DeleteDocumentResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteDocumentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDocumentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteDocumentRequest request]
    (-> this (.deleteDocumentAsync request))))

(defn describe-automation-executions-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationExecutionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAutomationExecutions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationExecutionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationExecutionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAutomationExecutionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationExecutionsRequest request]
    (-> this (.describeAutomationExecutionsAsync request))))

(defn register-target-with-maintenance-window-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.RegisterTargetWithMaintenanceWindowRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterTargetWithMaintenanceWindow operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.RegisterTargetWithMaintenanceWindowResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.RegisterTargetWithMaintenanceWindowRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerTargetWithMaintenanceWindowAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.RegisterTargetWithMaintenanceWindowRequest request]
    (-> this (.registerTargetWithMaintenanceWindowAsync request))))

(defn stop-automation-execution-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.StopAutomationExecutionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopAutomationExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.StopAutomationExecutionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.StopAutomationExecutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopAutomationExecutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.StopAutomationExecutionRequest request]
    (-> this (.stopAutomationExecutionAsync request))))

(defn get-patch-baseline-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPatchBaseline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPatchBaselineAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineRequest request]
    (-> this (.getPatchBaselineAsync request))))

(defn update-patch-baseline-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.UpdatePatchBaselineRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdatePatchBaseline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.UpdatePatchBaselineResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdatePatchBaselineRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updatePatchBaselineAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdatePatchBaselineRequest request]
    (-> this (.updatePatchBaselineAsync request))))

(defn get-default-patch-baseline-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetDefaultPatchBaselineRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDefaultPatchBaseline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetDefaultPatchBaselineResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetDefaultPatchBaselineRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDefaultPatchBaselineAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetDefaultPatchBaselineRequest request]
    (-> this (.getDefaultPatchBaselineAsync request))))

(defn describe-parameters-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeParametersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeParameters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeParametersResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeParametersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeParametersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeParametersRequest request]
    (-> this (.describeParametersAsync request))))

(defn get-automation-execution-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetAutomationExecutionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAutomationExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetAutomationExecutionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetAutomationExecutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAutomationExecutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetAutomationExecutionRequest request]
    (-> this (.getAutomationExecutionAsync request))))

(defn describe-instance-information-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceInformationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeInstanceInformation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceInformationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceInformationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeInstanceInformationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceInformationRequest request]
    (-> this (.describeInstanceInformationAsync request))))

(defn create-association-batch-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationBatchRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAssociationBatch operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationBatchResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationBatchRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAssociationBatchAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationBatchRequest request]
    (-> this (.createAssociationBatchAsync request))))

(defn update-managed-instance-role-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateManagedInstanceRoleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateManagedInstanceRole operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.UpdateManagedInstanceRoleResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateManagedInstanceRoleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateManagedInstanceRoleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateManagedInstanceRoleRequest request]
    (-> this (.updateManagedInstanceRoleAsync request))))

(defn update-document-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDocument operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDocumentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentRequest request]
    (-> this (.updateDocumentAsync request))))

(defn create-activation-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.CreateActivationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateActivation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.CreateActivationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.CreateActivationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createActivationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.CreateActivationRequest request]
    (-> this (.createActivationAsync request))))

(defn describe-patch-groups-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePatchGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePatchGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupsRequest request]
    (-> this (.describePatchGroupsAsync request))))

(defn describe-maintenance-windows-for-target-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsForTargetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeMaintenanceWindowsForTarget operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsForTargetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsForTargetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeMaintenanceWindowsForTargetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsForTargetRequest request]
    (-> this (.describeMaintenanceWindowsForTargetAsync request))))

(defn describe-maintenance-window-execution-tasks-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTasksRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeMaintenanceWindowExecutionTasks operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTasksResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTasksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeMaintenanceWindowExecutionTasksAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTasksRequest request]
    (-> this (.describeMaintenanceWindowExecutionTasksAsync request))))

(defn update-maintenance-window-task-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTaskRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateMaintenanceWindowTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTaskResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTaskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateMaintenanceWindowTaskAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTaskRequest request]
    (-> this (.updateMaintenanceWindowTaskAsync request))))

(defn update-document-default-version-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentDefaultVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDocumentDefaultVersion operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentDefaultVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentDefaultVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDocumentDefaultVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentDefaultVersionRequest request]
    (-> this (.updateDocumentDefaultVersionAsync request))))

(defn register-patch-baseline-for-patch-group-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.RegisterPatchBaselineForPatchGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterPatchBaselineForPatchGroup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.RegisterPatchBaselineForPatchGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.RegisterPatchBaselineForPatchGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerPatchBaselineForPatchGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.RegisterPatchBaselineForPatchGroupRequest request]
    (-> this (.registerPatchBaselineForPatchGroupAsync request))))

(defn list-compliance-items-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.ListComplianceItemsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListComplianceItems operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.ListComplianceItemsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListComplianceItemsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listComplianceItemsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListComplianceItemsRequest request]
    (-> this (.listComplianceItemsAsync request))))

(defn put-parameter-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.PutParameterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutParameter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.PutParameterResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.PutParameterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putParameterAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.PutParameterRequest request]
    (-> this (.putParameterAsync request))))

(defn create-maintenance-window-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.CreateMaintenanceWindowRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateMaintenanceWindow operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.CreateMaintenanceWindowResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.CreateMaintenanceWindowRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createMaintenanceWindowAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.CreateMaintenanceWindowRequest request]
    (-> this (.createMaintenanceWindowAsync request))))

(defn start-associations-once-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.StartAssociationsOnceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartAssociationsOnce operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.StartAssociationsOnceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.StartAssociationsOnceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startAssociationsOnceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.StartAssociationsOnceRequest request]
    (-> this (.startAssociationsOnceAsync request))))

(defn get-connection-status-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetConnectionStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetConnectionStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetConnectionStatusResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetConnectionStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getConnectionStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetConnectionStatusRequest request]
    (-> this (.getConnectionStatusAsync request))))

(defn list-documents-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.ListDocumentsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDocuments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.ListDocumentsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListDocumentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDocumentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListDocumentsRequest request]
    (-> this (.listDocumentsAsync request)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this]
    (-> this (.listDocumentsAsync))))

(defn put-inventory-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.PutInventoryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutInventory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.PutInventoryResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.PutInventoryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putInventoryAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.PutInventoryRequest request]
    (-> this (.putInventoryAsync request))))

(defn describe-available-patches-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAvailablePatchesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAvailablePatches operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeAvailablePatchesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeAvailablePatchesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAvailablePatchesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeAvailablePatchesRequest request]
    (-> this (.describeAvailablePatchesAsync request))))

(defn get-maintenance-window-task-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowTaskRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMaintenanceWindowTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowTaskResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowTaskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMaintenanceWindowTaskAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowTaskRequest request]
    (-> this (.getMaintenanceWindowTaskAsync request))))

(defn create-patch-baseline-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.CreatePatchBaselineRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePatchBaseline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.CreatePatchBaselineResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.CreatePatchBaselineRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPatchBaselineAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.CreatePatchBaselineRequest request]
    (-> this (.createPatchBaselineAsync request))))

(defn describe-instance-patch-states-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeInstancePatchStates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeInstancePatchStatesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesRequest request]
    (-> this (.describeInstancePatchStatesAsync request))))

(defn register-default-patch-baseline-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.RegisterDefaultPatchBaselineRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterDefaultPatchBaseline operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.RegisterDefaultPatchBaselineResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.RegisterDefaultPatchBaselineRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerDefaultPatchBaselineAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.RegisterDefaultPatchBaselineRequest request]
    (-> this (.registerDefaultPatchBaselineAsync request))))

(defn create-association-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAssociation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAssociationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationRequest request]
    (-> this (.createAssociationAsync request))))

(defn send-command-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.SendCommandRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SendCommand operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.SendCommandResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.SendCommandRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendCommandAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.SendCommandRequest request]
    (-> this (.sendCommandAsync request))))

(defn update-maintenance-window-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateMaintenanceWindow operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateMaintenanceWindowAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowRequest request]
    (-> this (.updateMaintenanceWindowAsync request))))

(defn get-ops-summary-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetOpsSummaryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetOpsSummary operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetOpsSummaryResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetOpsSummaryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getOpsSummaryAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetOpsSummaryRequest request]
    (-> this (.getOpsSummaryAsync request))))

(defn get-parameter-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetParameterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetParameter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetParameterResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetParameterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getParameterAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetParameterRequest request]
    (-> this (.getParameterAsync request))))

(defn deregister-target-from-maintenance-window-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DeregisterTargetFromMaintenanceWindowRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterTargetFromMaintenanceWindow operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DeregisterTargetFromMaintenanceWindowResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeregisterTargetFromMaintenanceWindowRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterTargetFromMaintenanceWindowAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeregisterTargetFromMaintenanceWindowRequest request]
    (-> this (.deregisterTargetFromMaintenanceWindowAsync request))))

(defn create-resource-data-sync-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.CreateResourceDataSyncRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateResourceDataSync operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.CreateResourceDataSyncResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.CreateResourceDataSyncRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createResourceDataSyncAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.CreateResourceDataSyncRequest request]
    (-> this (.createResourceDataSyncAsync request))))

(defn describe-maintenance-window-tasks-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTasksRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeMaintenanceWindowTasks operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTasksResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTasksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeMaintenanceWindowTasksAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTasksRequest request]
    (-> this (.describeMaintenanceWindowTasksAsync request))))

(defn describe-document-permission-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentPermissionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDocumentPermission operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentPermissionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentPermissionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDocumentPermissionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentPermissionRequest request]
    (-> this (.describeDocumentPermissionAsync request))))

(defn list-associations-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.ListAssociationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAssociations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.ListAssociationsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListAssociationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAssociationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListAssociationsRequest request]
    (-> this (.listAssociationsAsync request))))

(defn delete-maintenance-window-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DeleteMaintenanceWindowRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteMaintenanceWindow operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DeleteMaintenanceWindowResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteMaintenanceWindowRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteMaintenanceWindowAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteMaintenanceWindowRequest request]
    (-> this (.deleteMaintenanceWindowAsync request))))

(defn get-maintenance-window-execution-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMaintenanceWindowExecution operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMaintenanceWindowExecutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionRequest request]
    (-> this (.getMaintenanceWindowExecutionAsync request))))

(defn describe-association-executions-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationExecutionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAssociationExecutions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationExecutionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationExecutionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAssociationExecutionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationExecutionsRequest request]
    (-> this (.describeAssociationExecutionsAsync request))))

(defn list-association-versions-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.ListAssociationVersionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAssociationVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.ListAssociationVersionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListAssociationVersionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAssociationVersionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListAssociationVersionsRequest request]
    (-> this (.listAssociationVersionsAsync request))))

(defn deregister-task-from-maintenance-window-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DeregisterTaskFromMaintenanceWindowRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterTaskFromMaintenanceWindow operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DeregisterTaskFromMaintenanceWindowResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeregisterTaskFromMaintenanceWindowRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterTaskFromMaintenanceWindowAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeregisterTaskFromMaintenanceWindowRequest request]
    (-> this (.deregisterTaskFromMaintenanceWindowAsync request))))

(defn delete-association-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DeleteAssociationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAssociation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DeleteAssociationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteAssociationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAssociationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteAssociationRequest request]
    (-> this (.deleteAssociationAsync request))))

(defn delete-inventory-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DeleteInventoryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteInventory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DeleteInventoryResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteInventoryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteInventoryAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteInventoryRequest request]
    (-> this (.deleteInventoryAsync request))))

(defn deregister-managed-instance-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DeregisterManagedInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterManagedInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DeregisterManagedInstanceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeregisterManagedInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterManagedInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeregisterManagedInstanceRequest request]
    (-> this (.deregisterManagedInstanceAsync request))))

(defn cancel-command-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.CancelCommandRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelCommand operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.CancelCommandResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.CancelCommandRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelCommandAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.CancelCommandRequest request]
    (-> this (.cancelCommandAsync request))))

(defn remove-tags-from-resource-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.RemoveTagsFromResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveTagsFromResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.RemoveTagsFromResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.RemoveTagsFromResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeTagsFromResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.RemoveTagsFromResourceRequest request]
    (-> this (.removeTagsFromResourceAsync request))))

(defn label-parameter-version-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.LabelParameterVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the LabelParameterVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.LabelParameterVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.LabelParameterVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.labelParameterVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.LabelParameterVersionRequest request]
    (-> this (.labelParameterVersionAsync request))))

(defn cancel-maintenance-window-execution-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.CancelMaintenanceWindowExecutionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelMaintenanceWindowExecution operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.CancelMaintenanceWindowExecutionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.CancelMaintenanceWindowExecutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelMaintenanceWindowExecutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.CancelMaintenanceWindowExecutionRequest request]
    (-> this (.cancelMaintenanceWindowExecutionAsync request))))

(defn delete-activation-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DeleteActivationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteActivation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DeleteActivationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteActivationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteActivationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteActivationRequest request]
    (-> this (.deleteActivationAsync request))))

(defn list-inventory-entries-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.ListInventoryEntriesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListInventoryEntries operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.ListInventoryEntriesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListInventoryEntriesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listInventoryEntriesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListInventoryEntriesRequest request]
    (-> this (.listInventoryEntriesAsync request))))

(defn update-service-setting-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - The request body of the UpdateServiceSetting API action. - `com.amazonaws.services.simplesystemsmanagement.model.UpdateServiceSettingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateServiceSetting operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.UpdateServiceSettingResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateServiceSettingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateServiceSettingAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateServiceSettingRequest request]
    (-> this (.updateServiceSettingAsync request))))

(defn list-compliance-summaries-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.ListComplianceSummariesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListComplianceSummaries operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.ListComplianceSummariesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListComplianceSummariesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listComplianceSummariesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListComplianceSummariesRequest request]
    (-> this (.listComplianceSummariesAsync request))))

(defn reset-service-setting-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - The request body of the ResetServiceSetting API action. - `com.amazonaws.services.simplesystemsmanagement.model.ResetServiceSettingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResetServiceSetting operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.ResetServiceSettingResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ResetServiceSettingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resetServiceSettingAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ResetServiceSettingRequest request]
    (-> this (.resetServiceSettingAsync request))))

(defn describe-sessions-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeSessionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSessions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeSessionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeSessionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSessionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeSessionsRequest request]
    (-> this (.describeSessionsAsync request))))

(defn get-maintenance-window-execution-task-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMaintenanceWindowExecutionTask operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMaintenanceWindowExecutionTaskAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskRequest request]
    (-> this (.getMaintenanceWindowExecutionTaskAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn get-patch-baseline-for-patch-group-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineForPatchGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPatchBaselineForPatchGroup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineForPatchGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineForPatchGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPatchBaselineForPatchGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineForPatchGroupRequest request]
    (-> this (.getPatchBaselineForPatchGroupAsync request))))

(defn list-resource-data-sync-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.ListResourceDataSyncRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListResourceDataSync operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.ListResourceDataSyncResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListResourceDataSyncRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listResourceDataSyncAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListResourceDataSyncRequest request]
    (-> this (.listResourceDataSyncAsync request))))

(defn describe-instance-patches-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeInstancePatches operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeInstancePatchesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchesRequest request]
    (-> this (.describeInstancePatchesAsync request))))

(defn get-service-setting-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - The request body of the GetServiceSetting API action. - `com.amazonaws.services.simplesystemsmanagement.model.GetServiceSettingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetServiceSetting operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetServiceSettingResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetServiceSettingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getServiceSettingAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetServiceSettingRequest request]
    (-> this (.getServiceSettingAsync request))))

(defn describe-ops-items-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeOpsItemsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeOpsItems operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeOpsItemsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeOpsItemsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeOpsItemsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeOpsItemsRequest request]
    (-> this (.describeOpsItemsAsync request))))

(defn describe-instance-patch-states-for-patch-group-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesForPatchGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeInstancePatchStatesForPatchGroup operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesForPatchGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesForPatchGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeInstancePatchStatesForPatchGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesForPatchGroupRequest request]
    (-> this (.describeInstancePatchStatesForPatchGroupAsync request))))

(defn get-parameter-history-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetParameterHistoryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetParameterHistory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetParameterHistoryResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetParameterHistoryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getParameterHistoryAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetParameterHistoryRequest request]
    (-> this (.getParameterHistoryAsync request))))

(defn create-document-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.CreateDocumentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDocument operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.CreateDocumentResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.CreateDocumentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDocumentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.CreateDocumentRequest request]
    (-> this (.createDocumentAsync request))))

(defn delete-parameters-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DeleteParametersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteParameters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DeleteParametersResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteParametersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteParametersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteParametersRequest request]
    (-> this (.deleteParametersAsync request))))

(defn update-association-status-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAssociationStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationStatusResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAssociationStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationStatusRequest request]
    (-> this (.updateAssociationStatusAsync request))))

(defn describe-maintenance-windows-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeMaintenanceWindows operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeMaintenanceWindowsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsRequest request]
    (-> this (.describeMaintenanceWindowsAsync request))))

(defn get-deployable-patch-snapshot-for-instance-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetDeployablePatchSnapshotForInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDeployablePatchSnapshotForInstance operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetDeployablePatchSnapshotForInstanceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetDeployablePatchSnapshotForInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDeployablePatchSnapshotForInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetDeployablePatchSnapshotForInstanceRequest request]
    (-> this (.getDeployablePatchSnapshotForInstanceAsync request))))

(defn delete-parameter-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DeleteParameterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteParameter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DeleteParameterResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteParameterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteParameterAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteParameterRequest request]
    (-> this (.deleteParameterAsync request))))

(defn describe-patch-group-state-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupStateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePatchGroupState operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupStateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupStateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePatchGroupStateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupStateRequest request]
    (-> this (.describePatchGroupStateAsync request))))

(defn resume-session-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.ResumeSessionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResumeSession operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.ResumeSessionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ResumeSessionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resumeSessionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ResumeSessionRequest request]
    (-> this (.resumeSessionAsync request))))

(defn add-tags-to-resource-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.AddTagsToResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddTagsToResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.AddTagsToResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.AddTagsToResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addTagsToResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.AddTagsToResourceRequest request]
    (-> this (.addTagsToResourceAsync request))))

(defn get-command-invocation-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetCommandInvocationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCommandInvocation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetCommandInvocationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetCommandInvocationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCommandInvocationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetCommandInvocationRequest request]
    (-> this (.getCommandInvocationAsync request))))

(defn update-association-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAssociation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAssociationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationRequest request]
    (-> this (.updateAssociationAsync request))))

(defn get-parameters-by-path-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetParametersByPathRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetParametersByPath operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetParametersByPathResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetParametersByPathRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getParametersByPathAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetParametersByPathRequest request]
    (-> this (.getParametersByPathAsync request))))

(defn list-document-versions-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.ListDocumentVersionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDocumentVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.ListDocumentVersionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListDocumentVersionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDocumentVersionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListDocumentVersionsRequest request]
    (-> this (.listDocumentVersionsAsync request))))

(defn create-ops-item-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.CreateOpsItemRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateOpsItem operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.CreateOpsItemResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.CreateOpsItemRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createOpsItemAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.CreateOpsItemRequest request]
    (-> this (.createOpsItemAsync request))))

(defn describe-inventory-deletions-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInventoryDeletionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeInventoryDeletions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeInventoryDeletionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeInventoryDeletionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeInventoryDeletionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeInventoryDeletionsRequest request]
    (-> this (.describeInventoryDeletionsAsync request))))

(defn describe-instance-associations-status-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceAssociationsStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeInstanceAssociationsStatus operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceAssociationsStatusResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceAssociationsStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeInstanceAssociationsStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceAssociationsStatusRequest request]
    (-> this (.describeInstanceAssociationsStatusAsync request))))

(defn describe-maintenance-window-executions-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeMaintenanceWindowExecutions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeMaintenanceWindowExecutionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionsRequest request]
    (-> this (.describeMaintenanceWindowExecutionsAsync request))))

(defn get-document-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetDocumentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDocument operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetDocumentResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetDocumentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDocumentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetDocumentRequest request]
    (-> this (.getDocumentAsync request))))

(defn modify-document-permission-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.ModifyDocumentPermissionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyDocumentPermission operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.ModifyDocumentPermissionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ModifyDocumentPermissionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyDocumentPermissionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ModifyDocumentPermissionRequest request]
    (-> this (.modifyDocumentPermissionAsync request))))

(defn describe-automation-step-executions-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationStepExecutionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAutomationStepExecutions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationStepExecutionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationStepExecutionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAutomationStepExecutionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationStepExecutionsRequest request]
    (-> this (.describeAutomationStepExecutionsAsync request))))

(defn list-command-invocations-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.ListCommandInvocationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListCommandInvocations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.ListCommandInvocationsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListCommandInvocationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listCommandInvocationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListCommandInvocationsRequest request]
    (-> this (.listCommandInvocationsAsync request))))

(defn delete-resource-data-sync-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DeleteResourceDataSyncRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteResourceDataSync operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DeleteResourceDataSyncResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteResourceDataSyncRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteResourceDataSyncAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteResourceDataSyncRequest request]
    (-> this (.deleteResourceDataSyncAsync request))))

(defn describe-effective-instance-associations-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectiveInstanceAssociationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEffectiveInstanceAssociations operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectiveInstanceAssociationsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectiveInstanceAssociationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEffectiveInstanceAssociationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectiveInstanceAssociationsRequest request]
    (-> this (.describeEffectiveInstanceAssociationsAsync request))))

(defn terminate-session-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.TerminateSessionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TerminateSession operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.TerminateSessionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.TerminateSessionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.terminateSessionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.TerminateSessionRequest request]
    (-> this (.terminateSessionAsync request))))

(defn describe-patch-baselines-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribePatchBaselinesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePatchBaselines operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribePatchBaselinesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribePatchBaselinesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePatchBaselinesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribePatchBaselinesRequest request]
    (-> this (.describePatchBaselinesAsync request))))

(defn get-maintenance-window-execution-task-invocation-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskInvocationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMaintenanceWindowExecutionTaskInvocation operation returned
           by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskInvocationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskInvocationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMaintenanceWindowExecutionTaskInvocationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskInvocationRequest request]
    (-> this (.getMaintenanceWindowExecutionTaskInvocationAsync request))))

(defn describe-association-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAssociation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAssociationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationRequest request]
    (-> this (.describeAssociationAsync request))))

(defn describe-patch-properties-async
  "Description copied from interface: AWSSimpleSystemsManagementAsync

  request - `com.amazonaws.services.simplesystemsmanagement.model.DescribePatchPropertiesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePatchProperties operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribePatchPropertiesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribePatchPropertiesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePatchPropertiesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribePatchPropertiesRequest request]
    (-> this (.describePatchPropertiesAsync request))))

