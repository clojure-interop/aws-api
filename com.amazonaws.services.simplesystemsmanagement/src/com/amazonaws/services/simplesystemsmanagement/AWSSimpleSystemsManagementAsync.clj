(ns com.amazonaws.services.simplesystemsmanagement.AWSSimpleSystemsManagementAsync
  "Interface for accessing Amazon SSM asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSSimpleSystemsManagementAsync instead.


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
  (:import [com.amazonaws.services.simplesystemsmanagement AWSSimpleSystemsManagementAsync]))

(defn send-automation-signal-async
  "Sends a signal to an Automation execution to change the current behavior or status of the execution.

  send-automation-signal-request - `com.amazonaws.services.simplesystemsmanagement.model.SendAutomationSignalRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SendAutomationSignal operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.SendAutomationSignalResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.SendAutomationSignalRequest send-automation-signal-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendAutomationSignalAsync send-automation-signal-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.SendAutomationSignalRequest send-automation-signal-request]
    (-> this (.sendAutomationSignalAsync send-automation-signal-request))))

(defn list-resource-compliance-summaries-async
  "Returns a resource-level summary count. The summary includes information about compliant and non-compliant
   statuses and detailed compliance-item severity counts, according to the filter criteria you specify.

  list-resource-compliance-summaries-request - `com.amazonaws.services.simplesystemsmanagement.model.ListResourceComplianceSummariesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListResourceComplianceSummaries operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.ListResourceComplianceSummariesResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListResourceComplianceSummariesRequest list-resource-compliance-summaries-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listResourceComplianceSummariesAsync list-resource-compliance-summaries-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListResourceComplianceSummariesRequest list-resource-compliance-summaries-request]
    (-> this (.listResourceComplianceSummariesAsync list-resource-compliance-summaries-request))))

(defn get-parameters-async
  "Get details of a parameter. Don't confuse this API action with the GetParameter API action.

  get-parameters-request - `com.amazonaws.services.simplesystemsmanagement.model.GetParametersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetParameters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetParametersResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetParametersRequest get-parameters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getParametersAsync get-parameters-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetParametersRequest get-parameters-request]
    (-> this (.getParametersAsync get-parameters-request))))

(defn get-maintenance-window-async
  "Retrieves a maintenance window.

  get-maintenance-window-request - `com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMaintenanceWindow operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowRequest get-maintenance-window-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMaintenanceWindowAsync get-maintenance-window-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowRequest get-maintenance-window-request]
    (-> this (.getMaintenanceWindowAsync get-maintenance-window-request))))

(defn update-maintenance-window-target-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateMaintenanceWindowTarget operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTargetResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTargetRequest update-maintenance-window-target-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateMaintenanceWindowTargetAsync update-maintenance-window-target-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTargetRequest update-maintenance-window-target-request]
    (-> this (.updateMaintenanceWindowTargetAsync update-maintenance-window-target-request))))

(defn describe-maintenance-window-targets-async
  "Lists the targets registered with the maintenance window.

  describe-maintenance-window-targets-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTargetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeMaintenanceWindowTargets operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTargetsResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTargetsRequest describe-maintenance-window-targets-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeMaintenanceWindowTargetsAsync describe-maintenance-window-targets-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTargetsRequest describe-maintenance-window-targets-request]
    (-> this (.describeMaintenanceWindowTargetsAsync describe-maintenance-window-targets-request))))

(defn update-ops-item-async
  "Edit or change an OpsItem. You must have permission in AWS Identity and Access Management (IAM) to update an
   OpsItem. For more information, see Getting Started
   with OpsCenter in the AWS Systems Manager User Guide.


   Operations engineers and IT professionals use OpsCenter to view, investigate, and remediate operational issues
   impacting the performance and health of their AWS resources. For more information, see AWS Systems Manager
   OpsCenter in the AWS Systems Manager User Guide.

  update-ops-item-request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateOpsItemRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateOpsItem operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.UpdateOpsItemResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateOpsItemRequest update-ops-item-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateOpsItemAsync update-ops-item-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateOpsItemRequest update-ops-item-request]
    (-> this (.updateOpsItemAsync update-ops-item-request))))

(defn describe-activations-async
  "Describes details about the activation, such as the date and time the activation was created, its expiration
   date, the IAM role assigned to the instances in the activation, and the number of instances registered by using
   this activation.

  describe-activations-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeActivationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeActivations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeActivationsResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeActivationsRequest describe-activations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeActivationsAsync describe-activations-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeActivationsRequest describe-activations-request]
    (-> this (.describeActivationsAsync describe-activations-request))))

(defn get-inventory-async
  "Query inventory information.

  get-inventory-request - `com.amazonaws.services.simplesystemsmanagement.model.GetInventoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetInventory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetInventoryResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetInventoryRequest get-inventory-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getInventoryAsync get-inventory-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetInventoryRequest get-inventory-request]
    (-> this (.getInventoryAsync get-inventory-request))))

(defn list-commands-async
  "Lists the commands requested by users of the AWS account.

  list-commands-request - `com.amazonaws.services.simplesystemsmanagement.model.ListCommandsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListCommands operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.ListCommandsResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListCommandsRequest list-commands-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listCommandsAsync list-commands-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListCommandsRequest list-commands-request]
    (-> this (.listCommandsAsync list-commands-request))))

(defn get-ops-item-async
  "Get information about an OpsItem by using the ID. You must have permission in AWS Identity and Access Management
   (IAM) to view information about an OpsItem. For more information, see Getting Started
   with OpsCenter in the AWS Systems Manager User Guide.


   Operations engineers and IT professionals use OpsCenter to view, investigate, and remediate operational issues
   impacting the performance and health of their AWS resources. For more information, see AWS Systems Manager
   OpsCenter in the AWS Systems Manager User Guide.

  get-ops-item-request - `com.amazonaws.services.simplesystemsmanagement.model.GetOpsItemRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetOpsItem operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetOpsItemResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetOpsItemRequest get-ops-item-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getOpsItemAsync get-ops-item-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetOpsItemRequest get-ops-item-request]
    (-> this (.getOpsItemAsync get-ops-item-request))))

(defn describe-effective-patches-for-patch-baseline-async
  "Retrieves the current effective patches (the patch and the approval state) for the specified patch baseline. Note
   that this API applies only to Windows patch baselines.

  describe-effective-patches-for-patch-baseline-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectivePatchesForPatchBaselineRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEffectivePatchesForPatchBaseline operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectivePatchesForPatchBaselineResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectivePatchesForPatchBaselineRequest describe-effective-patches-for-patch-baseline-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEffectivePatchesForPatchBaselineAsync describe-effective-patches-for-patch-baseline-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectivePatchesForPatchBaselineRequest describe-effective-patches-for-patch-baseline-request]
    (-> this (.describeEffectivePatchesForPatchBaselineAsync describe-effective-patches-for-patch-baseline-request))))

(defn describe-maintenance-window-schedule-async
  "Retrieves information about upcoming executions of a maintenance window.

  describe-maintenance-window-schedule-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowScheduleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeMaintenanceWindowSchedule operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowScheduleResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowScheduleRequest describe-maintenance-window-schedule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeMaintenanceWindowScheduleAsync describe-maintenance-window-schedule-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowScheduleRequest describe-maintenance-window-schedule-request]
    (-> this (.describeMaintenanceWindowScheduleAsync describe-maintenance-window-schedule-request))))

(defn start-automation-execution-async
  "Initiates execution of an Automation document.

  start-automation-execution-request - `com.amazonaws.services.simplesystemsmanagement.model.StartAutomationExecutionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartAutomationExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.StartAutomationExecutionResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.StartAutomationExecutionRequest start-automation-execution-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startAutomationExecutionAsync start-automation-execution-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.StartAutomationExecutionRequest start-automation-execution-request]
    (-> this (.startAutomationExecutionAsync start-automation-execution-request))))

(defn start-session-async
  "Initiates a connection to a target (for example, an instance) for a Session Manager session. Returns a URL and
   token that can be used to open a WebSocket connection for sending input and receiving outputs.



   AWS CLI usage: start-session is an interactive command that requires the Session Manager plugin to
   be installed on the client machine making the call. For information, see
   Install the Session Manager Plugin for the AWS CLI in the AWS Systems Manager User Guide.

  start-session-request - `com.amazonaws.services.simplesystemsmanagement.model.StartSessionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartSession operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.StartSessionResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.StartSessionRequest start-session-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startSessionAsync start-session-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.StartSessionRequest start-session-request]
    (-> this (.startSessionAsync start-session-request))))

(defn get-inventory-schema-async
  "Return a list of inventory type names for the account, or return a list of attribute names for a specific
   Inventory item type.

  get-inventory-schema-request - `com.amazonaws.services.simplesystemsmanagement.model.GetInventorySchemaRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetInventorySchema operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetInventorySchemaResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetInventorySchemaRequest get-inventory-schema-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getInventorySchemaAsync get-inventory-schema-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetInventorySchemaRequest get-inventory-schema-request]
    (-> this (.getInventorySchemaAsync get-inventory-schema-request))))

(defn describe-maintenance-window-execution-task-invocations-async
  "Retrieves the individual task executions (one per target) for a particular task run as part of a maintenance
   window execution.

  describe-maintenance-window-execution-task-invocations-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTaskInvocationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeMaintenanceWindowExecutionTaskInvocations operation
           returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTaskInvocationsResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTaskInvocationsRequest describe-maintenance-window-execution-task-invocations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeMaintenanceWindowExecutionTaskInvocationsAsync describe-maintenance-window-execution-task-invocations-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTaskInvocationsRequest describe-maintenance-window-execution-task-invocations-request]
    (-> this (.describeMaintenanceWindowExecutionTaskInvocationsAsync describe-maintenance-window-execution-task-invocations-request))))

(defn delete-patch-baseline-async
  "Deletes a patch baseline.

  delete-patch-baseline-request - `com.amazonaws.services.simplesystemsmanagement.model.DeletePatchBaselineRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePatchBaseline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DeletePatchBaselineResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeletePatchBaselineRequest delete-patch-baseline-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePatchBaselineAsync delete-patch-baseline-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeletePatchBaselineRequest delete-patch-baseline-request]
    (-> this (.deletePatchBaselineAsync delete-patch-baseline-request))))

(defn put-compliance-items-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutComplianceItems operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.PutComplianceItemsResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.PutComplianceItemsRequest put-compliance-items-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putComplianceItemsAsync put-compliance-items-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.PutComplianceItemsRequest put-compliance-items-request]
    (-> this (.putComplianceItemsAsync put-compliance-items-request))))

(defn describe-document-async
  "Describes the specified Systems Manager document.

  describe-document-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDocument operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentRequest describe-document-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDocumentAsync describe-document-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentRequest describe-document-request]
    (-> this (.describeDocumentAsync describe-document-request))))

(defn deregister-patch-baseline-for-patch-group-async
  "Removes a patch group from a patch baseline.

  deregister-patch-baseline-for-patch-group-request - `com.amazonaws.services.simplesystemsmanagement.model.DeregisterPatchBaselineForPatchGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterPatchBaselineForPatchGroup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DeregisterPatchBaselineForPatchGroupResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeregisterPatchBaselineForPatchGroupRequest deregister-patch-baseline-for-patch-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterPatchBaselineForPatchGroupAsync deregister-patch-baseline-for-patch-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeregisterPatchBaselineForPatchGroupRequest deregister-patch-baseline-for-patch-group-request]
    (-> this (.deregisterPatchBaselineForPatchGroupAsync deregister-patch-baseline-for-patch-group-request))))

(defn describe-association-execution-targets-async
  "Use this API action to view information about a specific execution of a specific association.

  describe-association-execution-targets-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationExecutionTargetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAssociationExecutionTargets operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationExecutionTargetsResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationExecutionTargetsRequest describe-association-execution-targets-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAssociationExecutionTargetsAsync describe-association-execution-targets-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationExecutionTargetsRequest describe-association-execution-targets-request]
    (-> this (.describeAssociationExecutionTargetsAsync describe-association-execution-targets-request))))

(defn register-task-with-maintenance-window-async
  "Adds a new task to a maintenance window.

  register-task-with-maintenance-window-request - `com.amazonaws.services.simplesystemsmanagement.model.RegisterTaskWithMaintenanceWindowRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterTaskWithMaintenanceWindow operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.RegisterTaskWithMaintenanceWindowResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.RegisterTaskWithMaintenanceWindowRequest register-task-with-maintenance-window-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerTaskWithMaintenanceWindowAsync register-task-with-maintenance-window-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.RegisterTaskWithMaintenanceWindowRequest register-task-with-maintenance-window-request]
    (-> this (.registerTaskWithMaintenanceWindowAsync register-task-with-maintenance-window-request))))

(defn delete-document-async
  "Deletes the Systems Manager document and all instance associations to the document.


   Before you delete the document, we recommend that you use DeleteAssociation to disassociate all instances
   that are associated with the document.

  delete-document-request - `com.amazonaws.services.simplesystemsmanagement.model.DeleteDocumentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDocument operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DeleteDocumentResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteDocumentRequest delete-document-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDocumentAsync delete-document-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteDocumentRequest delete-document-request]
    (-> this (.deleteDocumentAsync delete-document-request))))

(defn describe-automation-executions-async
  "Provides details about all active and terminated Automation executions.

  describe-automation-executions-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationExecutionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAutomationExecutions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationExecutionsResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationExecutionsRequest describe-automation-executions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAutomationExecutionsAsync describe-automation-executions-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationExecutionsRequest describe-automation-executions-request]
    (-> this (.describeAutomationExecutionsAsync describe-automation-executions-request))))

(defn register-target-with-maintenance-window-async
  "Registers a target with a maintenance window.

  register-target-with-maintenance-window-request - `com.amazonaws.services.simplesystemsmanagement.model.RegisterTargetWithMaintenanceWindowRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterTargetWithMaintenanceWindow operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.RegisterTargetWithMaintenanceWindowResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.RegisterTargetWithMaintenanceWindowRequest register-target-with-maintenance-window-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerTargetWithMaintenanceWindowAsync register-target-with-maintenance-window-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.RegisterTargetWithMaintenanceWindowRequest register-target-with-maintenance-window-request]
    (-> this (.registerTargetWithMaintenanceWindowAsync register-target-with-maintenance-window-request))))

(defn stop-automation-execution-async
  "Stop an Automation that is currently running.

  stop-automation-execution-request - `com.amazonaws.services.simplesystemsmanagement.model.StopAutomationExecutionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopAutomationExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.StopAutomationExecutionResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.StopAutomationExecutionRequest stop-automation-execution-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopAutomationExecutionAsync stop-automation-execution-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.StopAutomationExecutionRequest stop-automation-execution-request]
    (-> this (.stopAutomationExecutionAsync stop-automation-execution-request))))

(defn get-patch-baseline-async
  "Retrieves information about a patch baseline.

  get-patch-baseline-request - `com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPatchBaseline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineRequest get-patch-baseline-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPatchBaselineAsync get-patch-baseline-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineRequest get-patch-baseline-request]
    (-> this (.getPatchBaselineAsync get-patch-baseline-request))))

(defn update-patch-baseline-async
  "Modifies an existing patch baseline. Fields not specified in the request are left unchanged.



   For information about valid key and value pairs in PatchFilters for each supported operating system
   type, see PatchFilter.

  update-patch-baseline-request - `com.amazonaws.services.simplesystemsmanagement.model.UpdatePatchBaselineRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdatePatchBaseline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.UpdatePatchBaselineResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdatePatchBaselineRequest update-patch-baseline-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updatePatchBaselineAsync update-patch-baseline-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdatePatchBaselineRequest update-patch-baseline-request]
    (-> this (.updatePatchBaselineAsync update-patch-baseline-request))))

(defn get-default-patch-baseline-async
  "Retrieves the default patch baseline. Note that Systems Manager supports creating multiple default patch
   baselines. For example, you can create a default patch baseline for each operating system.


   If you do not specify an operating system value, the default patch baseline for Windows is returned.

  get-default-patch-baseline-request - `com.amazonaws.services.simplesystemsmanagement.model.GetDefaultPatchBaselineRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDefaultPatchBaseline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetDefaultPatchBaselineResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetDefaultPatchBaselineRequest get-default-patch-baseline-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDefaultPatchBaselineAsync get-default-patch-baseline-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetDefaultPatchBaselineRequest get-default-patch-baseline-request]
    (-> this (.getDefaultPatchBaselineAsync get-default-patch-baseline-request))))

(defn describe-parameters-async
  "Get information about a parameter.


   Request results are returned on a best-effort basis. If you specify MaxResults in the request, the
   response includes information up to the limit specified. The number of items returned, however, can be between
   zero and the value of MaxResults. If the service reaches an internal limit while processing the
   results, it stops the operation and returns the matching values up to that point and a NextToken.
   You can specify the NextToken in a subsequent call to get the next set of results.

  describe-parameters-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeParametersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeParameters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeParametersResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeParametersRequest describe-parameters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeParametersAsync describe-parameters-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeParametersRequest describe-parameters-request]
    (-> this (.describeParametersAsync describe-parameters-request))))

(defn get-automation-execution-async
  "Get detailed information about a particular Automation execution.

  get-automation-execution-request - `com.amazonaws.services.simplesystemsmanagement.model.GetAutomationExecutionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAutomationExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetAutomationExecutionResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetAutomationExecutionRequest get-automation-execution-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAutomationExecutionAsync get-automation-execution-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetAutomationExecutionRequest get-automation-execution-request]
    (-> this (.getAutomationExecutionAsync get-automation-execution-request))))

(defn describe-instance-information-async
  "Describes one or more of your instances. You can use this to get information about instances like the operating
   system platform, the SSM Agent version (Linux), status etc. If you specify one or more instance IDs, it returns
   information for those instances. If you do not specify instance IDs, it returns information for all your
   instances. If you specify an instance ID that is not valid or an instance that you do not own, you receive an
   error.



   The IamRole field for this API action is the Amazon Identity and Access Management (IAM) role assigned to
   on-premises instances. This call does not return the IAM role for Amazon EC2 instances.

  describe-instance-information-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceInformationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeInstanceInformation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceInformationResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceInformationRequest describe-instance-information-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeInstanceInformationAsync describe-instance-information-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceInformationRequest describe-instance-information-request]
    (-> this (.describeInstanceInformationAsync describe-instance-information-request))))

(defn create-association-batch-async
  "Associates the specified Systems Manager document with the specified instances or targets.


   When you associate a document with one or more instances using instance IDs or tags, SSM Agent running on the
   instance processes the document and configures the instance as specified.


   If you associate a document with an instance that already has an associated document, the system returns the
   AssociationAlreadyExists exception.

  create-association-batch-request - `com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationBatchRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAssociationBatch operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationBatchResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationBatchRequest create-association-batch-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAssociationBatchAsync create-association-batch-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationBatchRequest create-association-batch-request]
    (-> this (.createAssociationBatchAsync create-association-batch-request))))

(defn update-managed-instance-role-async
  "Assigns or changes an Amazon Identity and Access Management (IAM) role for the managed instance.

  update-managed-instance-role-request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateManagedInstanceRoleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateManagedInstanceRole operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.UpdateManagedInstanceRoleResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateManagedInstanceRoleRequest update-managed-instance-role-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateManagedInstanceRoleAsync update-managed-instance-role-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateManagedInstanceRoleRequest update-managed-instance-role-request]
    (-> this (.updateManagedInstanceRoleAsync update-managed-instance-role-request))))

(defn update-document-async
  "Updates one or more values for an SSM document.

  update-document-request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDocument operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentRequest update-document-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDocumentAsync update-document-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentRequest update-document-request]
    (-> this (.updateDocumentAsync update-document-request))))

(defn create-activation-async
  "Registers your on-premises server or virtual machine with Amazon EC2 so that you can manage these resources using
   Run Command. An on-premises server or virtual machine that has been registered with EC2 is called a managed
   instance. For more information about activations, see Setting
   Up AWS Systems Manager for Hybrid Environments.

  create-activation-request - `com.amazonaws.services.simplesystemsmanagement.model.CreateActivationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateActivation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.CreateActivationResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.CreateActivationRequest create-activation-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createActivationAsync create-activation-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.CreateActivationRequest create-activation-request]
    (-> this (.createActivationAsync create-activation-request))))

(defn describe-patch-groups-async
  "Lists all patch groups that have been registered with patch baselines.

  describe-patch-groups-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePatchGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupsResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupsRequest describe-patch-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePatchGroupsAsync describe-patch-groups-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupsRequest describe-patch-groups-request]
    (-> this (.describePatchGroupsAsync describe-patch-groups-request))))

(defn describe-maintenance-windows-for-target-async
  "Retrieves information about the maintenance window targets or tasks that an instance is associated with.

  describe-maintenance-windows-for-target-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsForTargetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeMaintenanceWindowsForTarget operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsForTargetResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsForTargetRequest describe-maintenance-windows-for-target-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeMaintenanceWindowsForTargetAsync describe-maintenance-windows-for-target-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsForTargetRequest describe-maintenance-windows-for-target-request]
    (-> this (.describeMaintenanceWindowsForTargetAsync describe-maintenance-windows-for-target-request))))

(defn describe-maintenance-window-execution-tasks-async
  "For a given maintenance window execution, lists the tasks that were run.

  describe-maintenance-window-execution-tasks-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTasksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeMaintenanceWindowExecutionTasks operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTasksResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTasksRequest describe-maintenance-window-execution-tasks-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeMaintenanceWindowExecutionTasksAsync describe-maintenance-window-execution-tasks-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTasksRequest describe-maintenance-window-execution-tasks-request]
    (-> this (.describeMaintenanceWindowExecutionTasksAsync describe-maintenance-window-execution-tasks-request))))

(defn update-maintenance-window-task-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateMaintenanceWindowTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTaskResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTaskRequest update-maintenance-window-task-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateMaintenanceWindowTaskAsync update-maintenance-window-task-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTaskRequest update-maintenance-window-task-request]
    (-> this (.updateMaintenanceWindowTaskAsync update-maintenance-window-task-request))))

(defn update-document-default-version-async
  "Set the default version of a document.

  update-document-default-version-request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentDefaultVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDocumentDefaultVersion operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentDefaultVersionResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentDefaultVersionRequest update-document-default-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDocumentDefaultVersionAsync update-document-default-version-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentDefaultVersionRequest update-document-default-version-request]
    (-> this (.updateDocumentDefaultVersionAsync update-document-default-version-request))))

(defn register-patch-baseline-for-patch-group-async
  "Registers a patch baseline for a patch group.

  register-patch-baseline-for-patch-group-request - `com.amazonaws.services.simplesystemsmanagement.model.RegisterPatchBaselineForPatchGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterPatchBaselineForPatchGroup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.RegisterPatchBaselineForPatchGroupResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.RegisterPatchBaselineForPatchGroupRequest register-patch-baseline-for-patch-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerPatchBaselineForPatchGroupAsync register-patch-baseline-for-patch-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.RegisterPatchBaselineForPatchGroupRequest register-patch-baseline-for-patch-group-request]
    (-> this (.registerPatchBaselineForPatchGroupAsync register-patch-baseline-for-patch-group-request))))

(defn list-compliance-items-async
  "For a specified resource ID, this API action returns a list of compliance statuses for different resource types.
   Currently, you can only specify one resource ID per call. List results depend on the criteria specified in the
   filter.

  list-compliance-items-request - `com.amazonaws.services.simplesystemsmanagement.model.ListComplianceItemsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListComplianceItems operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.ListComplianceItemsResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListComplianceItemsRequest list-compliance-items-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listComplianceItemsAsync list-compliance-items-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListComplianceItemsRequest list-compliance-items-request]
    (-> this (.listComplianceItemsAsync list-compliance-items-request))))

(defn put-parameter-async
  "Add a parameter to the system.

  put-parameter-request - `com.amazonaws.services.simplesystemsmanagement.model.PutParameterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutParameter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.PutParameterResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.PutParameterRequest put-parameter-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putParameterAsync put-parameter-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.PutParameterRequest put-parameter-request]
    (-> this (.putParameterAsync put-parameter-request))))

(defn create-maintenance-window-async
  "Creates a new maintenance window.

  create-maintenance-window-request - `com.amazonaws.services.simplesystemsmanagement.model.CreateMaintenanceWindowRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateMaintenanceWindow operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.CreateMaintenanceWindowResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.CreateMaintenanceWindowRequest create-maintenance-window-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createMaintenanceWindowAsync create-maintenance-window-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.CreateMaintenanceWindowRequest create-maintenance-window-request]
    (-> this (.createMaintenanceWindowAsync create-maintenance-window-request))))

(defn start-associations-once-async
  "Use this API action to run an association immediately and only one time. This action can be helpful when
   troubleshooting associations.

  start-associations-once-request - `com.amazonaws.services.simplesystemsmanagement.model.StartAssociationsOnceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartAssociationsOnce operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.StartAssociationsOnceResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.StartAssociationsOnceRequest start-associations-once-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startAssociationsOnceAsync start-associations-once-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.StartAssociationsOnceRequest start-associations-once-request]
    (-> this (.startAssociationsOnceAsync start-associations-once-request))))

(defn get-connection-status-async
  "Retrieves the Session Manager connection status for an instance to determine whether it is connected and ready to
   receive Session Manager connections.

  get-connection-status-request - `com.amazonaws.services.simplesystemsmanagement.model.GetConnectionStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetConnectionStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetConnectionStatusResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetConnectionStatusRequest get-connection-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getConnectionStatusAsync get-connection-status-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetConnectionStatusRequest get-connection-status-request]
    (-> this (.getConnectionStatusAsync get-connection-status-request))))

(defn list-documents-async
  "Describes one or more of your Systems Manager documents.

  list-documents-request - `com.amazonaws.services.simplesystemsmanagement.model.ListDocumentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDocuments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.ListDocumentsResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListDocumentsRequest list-documents-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDocumentsAsync list-documents-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListDocumentsRequest list-documents-request]
    (-> this (.listDocumentsAsync list-documents-request)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this]
    (-> this (.listDocumentsAsync))))

(defn put-inventory-async
  "Bulk update custom inventory items on one more instance. The request adds an inventory item, if it doesn't
   already exist, or updates an inventory item, if it does exist.

  put-inventory-request - `com.amazonaws.services.simplesystemsmanagement.model.PutInventoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutInventory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.PutInventoryResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.PutInventoryRequest put-inventory-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putInventoryAsync put-inventory-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.PutInventoryRequest put-inventory-request]
    (-> this (.putInventoryAsync put-inventory-request))))

(defn describe-available-patches-async
  "Lists all patches eligible to be included in a patch baseline.

  describe-available-patches-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAvailablePatchesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAvailablePatches operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeAvailablePatchesResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeAvailablePatchesRequest describe-available-patches-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAvailablePatchesAsync describe-available-patches-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeAvailablePatchesRequest describe-available-patches-request]
    (-> this (.describeAvailablePatchesAsync describe-available-patches-request))))

(defn get-maintenance-window-task-async
  "Lists the tasks in a maintenance window.

  get-maintenance-window-task-request - `com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowTaskRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMaintenanceWindowTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowTaskResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowTaskRequest get-maintenance-window-task-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMaintenanceWindowTaskAsync get-maintenance-window-task-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowTaskRequest get-maintenance-window-task-request]
    (-> this (.getMaintenanceWindowTaskAsync get-maintenance-window-task-request))))

(defn create-patch-baseline-async
  "Creates a patch baseline.



   For information about valid key and value pairs in PatchFilters for each supported operating system
   type, see PatchFilter.

  create-patch-baseline-request - `com.amazonaws.services.simplesystemsmanagement.model.CreatePatchBaselineRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePatchBaseline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.CreatePatchBaselineResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.CreatePatchBaselineRequest create-patch-baseline-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPatchBaselineAsync create-patch-baseline-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.CreatePatchBaselineRequest create-patch-baseline-request]
    (-> this (.createPatchBaselineAsync create-patch-baseline-request))))

(defn describe-instance-patch-states-async
  "Retrieves the high-level patch state of one or more instances.

  describe-instance-patch-states-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeInstancePatchStates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesRequest describe-instance-patch-states-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeInstancePatchStatesAsync describe-instance-patch-states-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesRequest describe-instance-patch-states-request]
    (-> this (.describeInstancePatchStatesAsync describe-instance-patch-states-request))))

(defn register-default-patch-baseline-async
  "Defines the default patch baseline for the relevant operating system.


   To reset the AWS predefined patch baseline as the default, specify the full patch baseline ARN as the baseline ID
   value. For example, for CentOS, specify
   arn:aws:ssm:us-east-2:733109147000:patchbaseline/pb-0574b43a65ea646ed instead of
   pb-0574b43a65ea646ed.

  register-default-patch-baseline-request - `com.amazonaws.services.simplesystemsmanagement.model.RegisterDefaultPatchBaselineRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterDefaultPatchBaseline operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.RegisterDefaultPatchBaselineResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.RegisterDefaultPatchBaselineRequest register-default-patch-baseline-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerDefaultPatchBaselineAsync register-default-patch-baseline-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.RegisterDefaultPatchBaselineRequest register-default-patch-baseline-request]
    (-> this (.registerDefaultPatchBaselineAsync register-default-patch-baseline-request))))

(defn create-association-async
  "Associates the specified Systems Manager document with the specified instances or targets.


   When you associate a document with one or more instances using instance IDs or tags, SSM Agent running on the
   instance processes the document and configures the instance as specified.


   If you associate a document with an instance that already has an associated document, the system returns the
   AssociationAlreadyExists exception.

  create-association-request - `com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAssociation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationRequest create-association-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAssociationAsync create-association-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationRequest create-association-request]
    (-> this (.createAssociationAsync create-association-request))))

(defn send-command-async
  "Runs commands on one or more managed instances.

  send-command-request - `com.amazonaws.services.simplesystemsmanagement.model.SendCommandRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SendCommand operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.SendCommandResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.SendCommandRequest send-command-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendCommandAsync send-command-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.SendCommandRequest send-command-request]
    (-> this (.sendCommandAsync send-command-request))))

(defn update-maintenance-window-async
  "Updates an existing maintenance window. Only specified parameters are modified.

  update-maintenance-window-request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateMaintenanceWindow operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowRequest update-maintenance-window-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateMaintenanceWindowAsync update-maintenance-window-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowRequest update-maintenance-window-request]
    (-> this (.updateMaintenanceWindowAsync update-maintenance-window-request))))

(defn get-ops-summary-async
  "View a summary of OpsItems based on specified filters and aggregators.

  get-ops-summary-request - `com.amazonaws.services.simplesystemsmanagement.model.GetOpsSummaryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetOpsSummary operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetOpsSummaryResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetOpsSummaryRequest get-ops-summary-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getOpsSummaryAsync get-ops-summary-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetOpsSummaryRequest get-ops-summary-request]
    (-> this (.getOpsSummaryAsync get-ops-summary-request))))

(defn get-parameter-async
  "Get information about a parameter by using the parameter name. Don't confuse this API action with the
   GetParameters API action.

  get-parameter-request - `com.amazonaws.services.simplesystemsmanagement.model.GetParameterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetParameter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetParameterResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetParameterRequest get-parameter-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getParameterAsync get-parameter-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetParameterRequest get-parameter-request]
    (-> this (.getParameterAsync get-parameter-request))))

(defn deregister-target-from-maintenance-window-async
  "Removes a target from a maintenance window.

  deregister-target-from-maintenance-window-request - `com.amazonaws.services.simplesystemsmanagement.model.DeregisterTargetFromMaintenanceWindowRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterTargetFromMaintenanceWindow operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DeregisterTargetFromMaintenanceWindowResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeregisterTargetFromMaintenanceWindowRequest deregister-target-from-maintenance-window-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterTargetFromMaintenanceWindowAsync deregister-target-from-maintenance-window-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeregisterTargetFromMaintenanceWindowRequest deregister-target-from-maintenance-window-request]
    (-> this (.deregisterTargetFromMaintenanceWindowAsync deregister-target-from-maintenance-window-request))))

(defn create-resource-data-sync-async
  "Creates a resource data sync configuration to a single bucket in Amazon S3. This is an asynchronous operation
   that returns immediately. After a successful initial sync is completed, the system continuously syncs data to the
   Amazon S3 bucket. To check the status of the sync, use the ListResourceDataSync.


   By default, data is not encrypted in Amazon S3. We strongly recommend that you enable encryption in Amazon S3 to
   ensure secure data storage. We also recommend that you secure access to the Amazon S3 bucket by creating a
   restrictive bucket policy. For more information, see Configuring
   Resource Data Sync for Inventory in the AWS Systems Manager User Guide.

  create-resource-data-sync-request - `com.amazonaws.services.simplesystemsmanagement.model.CreateResourceDataSyncRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateResourceDataSync operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.CreateResourceDataSyncResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.CreateResourceDataSyncRequest create-resource-data-sync-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createResourceDataSyncAsync create-resource-data-sync-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.CreateResourceDataSyncRequest create-resource-data-sync-request]
    (-> this (.createResourceDataSyncAsync create-resource-data-sync-request))))

(defn describe-maintenance-window-tasks-async
  "Lists the tasks in a maintenance window.

  describe-maintenance-window-tasks-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTasksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeMaintenanceWindowTasks operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTasksResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTasksRequest describe-maintenance-window-tasks-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeMaintenanceWindowTasksAsync describe-maintenance-window-tasks-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTasksRequest describe-maintenance-window-tasks-request]
    (-> this (.describeMaintenanceWindowTasksAsync describe-maintenance-window-tasks-request))))

(defn describe-document-permission-async
  "Describes the permissions for a Systems Manager document. If you created the document, you are the owner. If a
   document is shared, it can either be shared privately (by specifying a user's AWS account ID) or publicly
   (All).

  describe-document-permission-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentPermissionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDocumentPermission operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentPermissionResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentPermissionRequest describe-document-permission-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDocumentPermissionAsync describe-document-permission-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentPermissionRequest describe-document-permission-request]
    (-> this (.describeDocumentPermissionAsync describe-document-permission-request))))

(defn list-associations-async
  "Lists the associations for the specified Systems Manager document or instance.

  list-associations-request - `com.amazonaws.services.simplesystemsmanagement.model.ListAssociationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAssociations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.ListAssociationsResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListAssociationsRequest list-associations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAssociationsAsync list-associations-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListAssociationsRequest list-associations-request]
    (-> this (.listAssociationsAsync list-associations-request))))

(defn delete-maintenance-window-async
  "Deletes a maintenance window.

  delete-maintenance-window-request - `com.amazonaws.services.simplesystemsmanagement.model.DeleteMaintenanceWindowRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteMaintenanceWindow operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DeleteMaintenanceWindowResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteMaintenanceWindowRequest delete-maintenance-window-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteMaintenanceWindowAsync delete-maintenance-window-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteMaintenanceWindowRequest delete-maintenance-window-request]
    (-> this (.deleteMaintenanceWindowAsync delete-maintenance-window-request))))

(defn get-maintenance-window-execution-async
  "Retrieves details about a specific a maintenance window execution.

  get-maintenance-window-execution-request - `com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMaintenanceWindowExecution operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionRequest get-maintenance-window-execution-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMaintenanceWindowExecutionAsync get-maintenance-window-execution-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionRequest get-maintenance-window-execution-request]
    (-> this (.getMaintenanceWindowExecutionAsync get-maintenance-window-execution-request))))

(defn describe-association-executions-async
  "Use this API action to view all executions for a specific association ID.

  describe-association-executions-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationExecutionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAssociationExecutions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationExecutionsResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationExecutionsRequest describe-association-executions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAssociationExecutionsAsync describe-association-executions-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationExecutionsRequest describe-association-executions-request]
    (-> this (.describeAssociationExecutionsAsync describe-association-executions-request))))

(defn list-association-versions-async
  "Retrieves all versions of an association for a specific association ID.

  list-association-versions-request - `com.amazonaws.services.simplesystemsmanagement.model.ListAssociationVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAssociationVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.ListAssociationVersionsResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListAssociationVersionsRequest list-association-versions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAssociationVersionsAsync list-association-versions-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListAssociationVersionsRequest list-association-versions-request]
    (-> this (.listAssociationVersionsAsync list-association-versions-request))))

(defn deregister-task-from-maintenance-window-async
  "Removes a task from a maintenance window.

  deregister-task-from-maintenance-window-request - `com.amazonaws.services.simplesystemsmanagement.model.DeregisterTaskFromMaintenanceWindowRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterTaskFromMaintenanceWindow operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DeregisterTaskFromMaintenanceWindowResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeregisterTaskFromMaintenanceWindowRequest deregister-task-from-maintenance-window-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterTaskFromMaintenanceWindowAsync deregister-task-from-maintenance-window-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeregisterTaskFromMaintenanceWindowRequest deregister-task-from-maintenance-window-request]
    (-> this (.deregisterTaskFromMaintenanceWindowAsync deregister-task-from-maintenance-window-request))))

(defn delete-association-async
  "Disassociates the specified Systems Manager document from the specified instance.


   When you disassociate a document from an instance, it does not change the configuration of the instance. To
   change the configuration state of an instance after you disassociate a document, you must create a new document
   with the desired configuration and associate it with the instance.

  delete-association-request - `com.amazonaws.services.simplesystemsmanagement.model.DeleteAssociationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAssociation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DeleteAssociationResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteAssociationRequest delete-association-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAssociationAsync delete-association-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteAssociationRequest delete-association-request]
    (-> this (.deleteAssociationAsync delete-association-request))))

(defn delete-inventory-async
  "Delete a custom inventory type, or the data associated with a custom Inventory type. Deleting a custom inventory
   type is also referred to as deleting a custom inventory schema.

  delete-inventory-request - `com.amazonaws.services.simplesystemsmanagement.model.DeleteInventoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteInventory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DeleteInventoryResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteInventoryRequest delete-inventory-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteInventoryAsync delete-inventory-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteInventoryRequest delete-inventory-request]
    (-> this (.deleteInventoryAsync delete-inventory-request))))

(defn deregister-managed-instance-async
  "Removes the server or virtual machine from the list of registered servers. You can reregister the instance again
   at any time. If you don't plan to use Run Command on the server, we suggest uninstalling SSM Agent first.

  deregister-managed-instance-request - `com.amazonaws.services.simplesystemsmanagement.model.DeregisterManagedInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterManagedInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DeregisterManagedInstanceResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeregisterManagedInstanceRequest deregister-managed-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterManagedInstanceAsync deregister-managed-instance-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeregisterManagedInstanceRequest deregister-managed-instance-request]
    (-> this (.deregisterManagedInstanceAsync deregister-managed-instance-request))))

(defn cancel-command-async
  "Attempts to cancel the command specified by the Command ID. There is no guarantee that the command will be
   terminated and the underlying process stopped.

  cancel-command-request - `com.amazonaws.services.simplesystemsmanagement.model.CancelCommandRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelCommand operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.CancelCommandResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.CancelCommandRequest cancel-command-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelCommandAsync cancel-command-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.CancelCommandRequest cancel-command-request]
    (-> this (.cancelCommandAsync cancel-command-request))))

(defn remove-tags-from-resource-async
  "Removes tag keys from the specified resource.

  remove-tags-from-resource-request - `com.amazonaws.services.simplesystemsmanagement.model.RemoveTagsFromResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveTagsFromResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.RemoveTagsFromResourceResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.RemoveTagsFromResourceRequest remove-tags-from-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeTagsFromResourceAsync remove-tags-from-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.RemoveTagsFromResourceRequest remove-tags-from-resource-request]
    (-> this (.removeTagsFromResourceAsync remove-tags-from-resource-request))))

(defn label-parameter-version-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the LabelParameterVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.LabelParameterVersionResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.LabelParameterVersionRequest label-parameter-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.labelParameterVersionAsync label-parameter-version-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.LabelParameterVersionRequest label-parameter-version-request]
    (-> this (.labelParameterVersionAsync label-parameter-version-request))))

(defn cancel-maintenance-window-execution-async
  "Stops a maintenance window execution that is already in progress and cancels any tasks in the window that have
   not already starting running. (Tasks already in progress will continue to completion.)

  cancel-maintenance-window-execution-request - `com.amazonaws.services.simplesystemsmanagement.model.CancelMaintenanceWindowExecutionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelMaintenanceWindowExecution operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.CancelMaintenanceWindowExecutionResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.CancelMaintenanceWindowExecutionRequest cancel-maintenance-window-execution-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelMaintenanceWindowExecutionAsync cancel-maintenance-window-execution-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.CancelMaintenanceWindowExecutionRequest cancel-maintenance-window-execution-request]
    (-> this (.cancelMaintenanceWindowExecutionAsync cancel-maintenance-window-execution-request))))

(defn delete-activation-async
  "Deletes an activation. You are not required to delete an activation. If you delete an activation, you can no
   longer use it to register additional managed instances. Deleting an activation does not de-register managed
   instances. You must manually de-register managed instances.

  delete-activation-request - `com.amazonaws.services.simplesystemsmanagement.model.DeleteActivationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteActivation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DeleteActivationResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteActivationRequest delete-activation-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteActivationAsync delete-activation-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteActivationRequest delete-activation-request]
    (-> this (.deleteActivationAsync delete-activation-request))))

(defn list-inventory-entries-async
  "A list of inventory items returned by the request.

  list-inventory-entries-request - `com.amazonaws.services.simplesystemsmanagement.model.ListInventoryEntriesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListInventoryEntries operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.ListInventoryEntriesResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListInventoryEntriesRequest list-inventory-entries-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listInventoryEntriesAsync list-inventory-entries-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListInventoryEntriesRequest list-inventory-entries-request]
    (-> this (.listInventoryEntriesAsync list-inventory-entries-request))))

(defn update-service-setting-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateServiceSetting operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.UpdateServiceSettingResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateServiceSettingRequest update-service-setting-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateServiceSettingAsync update-service-setting-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateServiceSettingRequest update-service-setting-request]
    (-> this (.updateServiceSettingAsync update-service-setting-request))))

(defn list-compliance-summaries-async
  "Returns a summary count of compliant and non-compliant resources for a compliance type. For example, this call
   can return State Manager associations, patches, or custom compliance types according to the filter criteria that
   you specify.

  list-compliance-summaries-request - `com.amazonaws.services.simplesystemsmanagement.model.ListComplianceSummariesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListComplianceSummaries operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.ListComplianceSummariesResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListComplianceSummariesRequest list-compliance-summaries-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listComplianceSummariesAsync list-compliance-summaries-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListComplianceSummariesRequest list-compliance-summaries-request]
    (-> this (.listComplianceSummariesAsync list-compliance-summaries-request))))

(defn reset-service-setting-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResetServiceSetting operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.ResetServiceSettingResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ResetServiceSettingRequest reset-service-setting-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resetServiceSettingAsync reset-service-setting-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ResetServiceSettingRequest reset-service-setting-request]
    (-> this (.resetServiceSettingAsync reset-service-setting-request))))

(defn describe-sessions-async
  "Retrieves a list of all active sessions (both connected and disconnected) or terminated sessions from the past 30
   days.

  describe-sessions-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeSessionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSessions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeSessionsResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeSessionsRequest describe-sessions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSessionsAsync describe-sessions-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeSessionsRequest describe-sessions-request]
    (-> this (.describeSessionsAsync describe-sessions-request))))

(defn get-maintenance-window-execution-task-async
  "Retrieves the details about a specific task run as part of a maintenance window execution.

  get-maintenance-window-execution-task-request - `com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMaintenanceWindowExecutionTask operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskRequest get-maintenance-window-execution-task-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMaintenanceWindowExecutionTaskAsync get-maintenance-window-execution-task-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskRequest get-maintenance-window-execution-task-request]
    (-> this (.getMaintenanceWindowExecutionTaskAsync get-maintenance-window-execution-task-request))))

(defn list-tags-for-resource-async
  "Returns a list of the tags assigned to the specified resource.

  list-tags-for-resource-request - `com.amazonaws.services.simplesystemsmanagement.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn get-patch-baseline-for-patch-group-async
  "Retrieves the patch baseline that should be used for the specified patch group.

  get-patch-baseline-for-patch-group-request - `com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineForPatchGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPatchBaselineForPatchGroup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineForPatchGroupResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineForPatchGroupRequest get-patch-baseline-for-patch-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPatchBaselineForPatchGroupAsync get-patch-baseline-for-patch-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineForPatchGroupRequest get-patch-baseline-for-patch-group-request]
    (-> this (.getPatchBaselineForPatchGroupAsync get-patch-baseline-for-patch-group-request))))

(defn list-resource-data-sync-async
  "Lists your resource data sync configurations. Includes information about the last time a sync attempted to start,
   the last sync status, and the last time a sync successfully completed.


   The number of sync configurations might be too large to return using a single call to
   ListResourceDataSync. You can limit the number of sync configurations returned by using the
   MaxResults parameter. To determine whether there are more sync configurations to list, check the
   value of NextToken in the output. If there are more sync configurations to list, you can request
   them by specifying the NextToken returned in the call to the parameter of a subsequent call.

  list-resource-data-sync-request - `com.amazonaws.services.simplesystemsmanagement.model.ListResourceDataSyncRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListResourceDataSync operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.ListResourceDataSyncResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListResourceDataSyncRequest list-resource-data-sync-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listResourceDataSyncAsync list-resource-data-sync-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListResourceDataSyncRequest list-resource-data-sync-request]
    (-> this (.listResourceDataSyncAsync list-resource-data-sync-request))))

(defn describe-instance-patches-async
  "Retrieves information about the patches on the specified instance and their state relative to the patch baseline
   being used for the instance.

  describe-instance-patches-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeInstancePatches operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchesResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchesRequest describe-instance-patches-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeInstancePatchesAsync describe-instance-patches-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchesRequest describe-instance-patches-request]
    (-> this (.describeInstancePatchesAsync describe-instance-patches-request))))

(defn get-service-setting-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetServiceSetting operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetServiceSettingResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetServiceSettingRequest get-service-setting-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getServiceSettingAsync get-service-setting-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetServiceSettingRequest get-service-setting-request]
    (-> this (.getServiceSettingAsync get-service-setting-request))))

(defn describe-ops-items-async
  "Query a set of OpsItems. You must have permission in AWS Identity and Access Management (IAM) to query a list of
   OpsItems. For more information, see Getting Started
   with OpsCenter in the AWS Systems Manager User Guide.


   Operations engineers and IT professionals use OpsCenter to view, investigate, and remediate operational issues
   impacting the performance and health of their AWS resources. For more information, see AWS Systems Manager
   OpsCenter in the AWS Systems Manager User Guide.

  describe-ops-items-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeOpsItemsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeOpsItems operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeOpsItemsResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeOpsItemsRequest describe-ops-items-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeOpsItemsAsync describe-ops-items-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeOpsItemsRequest describe-ops-items-request]
    (-> this (.describeOpsItemsAsync describe-ops-items-request))))

(defn describe-instance-patch-states-for-patch-group-async
  "Retrieves the high-level patch state for the instances in the specified patch group.

  describe-instance-patch-states-for-patch-group-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesForPatchGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeInstancePatchStatesForPatchGroup operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesForPatchGroupResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesForPatchGroupRequest describe-instance-patch-states-for-patch-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeInstancePatchStatesForPatchGroupAsync describe-instance-patch-states-for-patch-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesForPatchGroupRequest describe-instance-patch-states-for-patch-group-request]
    (-> this (.describeInstancePatchStatesForPatchGroupAsync describe-instance-patch-states-for-patch-group-request))))

(defn get-parameter-history-async
  "Query a list of all parameters used by the AWS account.

  get-parameter-history-request - `com.amazonaws.services.simplesystemsmanagement.model.GetParameterHistoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetParameterHistory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetParameterHistoryResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetParameterHistoryRequest get-parameter-history-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getParameterHistoryAsync get-parameter-history-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetParameterHistoryRequest get-parameter-history-request]
    (-> this (.getParameterHistoryAsync get-parameter-history-request))))

(defn create-document-async
  "Creates a Systems Manager document.


   After you create a document, you can use CreateAssociation to associate it with one or more running instances.

  create-document-request - `com.amazonaws.services.simplesystemsmanagement.model.CreateDocumentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDocument operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.CreateDocumentResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.CreateDocumentRequest create-document-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDocumentAsync create-document-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.CreateDocumentRequest create-document-request]
    (-> this (.createDocumentAsync create-document-request))))

(defn delete-parameters-async
  "Delete a list of parameters.

  delete-parameters-request - `com.amazonaws.services.simplesystemsmanagement.model.DeleteParametersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteParameters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DeleteParametersResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteParametersRequest delete-parameters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteParametersAsync delete-parameters-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteParametersRequest delete-parameters-request]
    (-> this (.deleteParametersAsync delete-parameters-request))))

(defn update-association-status-async
  "Updates the status of the Systems Manager document associated with the specified instance.

  update-association-status-request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAssociationStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationStatusResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationStatusRequest update-association-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAssociationStatusAsync update-association-status-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationStatusRequest update-association-status-request]
    (-> this (.updateAssociationStatusAsync update-association-status-request))))

(defn describe-maintenance-windows-async
  "Retrieves the maintenance windows in an AWS account.

  describe-maintenance-windows-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeMaintenanceWindows operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsRequest describe-maintenance-windows-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeMaintenanceWindowsAsync describe-maintenance-windows-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsRequest describe-maintenance-windows-request]
    (-> this (.describeMaintenanceWindowsAsync describe-maintenance-windows-request))))

(defn get-deployable-patch-snapshot-for-instance-async
  "Retrieves the current snapshot for the patch baseline the instance uses. This API is primarily used by the
   AWS-RunPatchBaseline Systems Manager document.

  get-deployable-patch-snapshot-for-instance-request - `com.amazonaws.services.simplesystemsmanagement.model.GetDeployablePatchSnapshotForInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDeployablePatchSnapshotForInstance operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetDeployablePatchSnapshotForInstanceResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetDeployablePatchSnapshotForInstanceRequest get-deployable-patch-snapshot-for-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDeployablePatchSnapshotForInstanceAsync get-deployable-patch-snapshot-for-instance-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetDeployablePatchSnapshotForInstanceRequest get-deployable-patch-snapshot-for-instance-request]
    (-> this (.getDeployablePatchSnapshotForInstanceAsync get-deployable-patch-snapshot-for-instance-request))))

(defn delete-parameter-async
  "Delete a parameter from the system.

  delete-parameter-request - `com.amazonaws.services.simplesystemsmanagement.model.DeleteParameterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteParameter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DeleteParameterResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteParameterRequest delete-parameter-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteParameterAsync delete-parameter-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteParameterRequest delete-parameter-request]
    (-> this (.deleteParameterAsync delete-parameter-request))))

(defn describe-patch-group-state-async
  "Returns high-level aggregated patch compliance state for a patch group.

  describe-patch-group-state-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupStateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePatchGroupState operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupStateResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupStateRequest describe-patch-group-state-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePatchGroupStateAsync describe-patch-group-state-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupStateRequest describe-patch-group-state-request]
    (-> this (.describePatchGroupStateAsync describe-patch-group-state-request))))

(defn resume-session-async
  "Reconnects a session to an instance after it has been disconnected. Connections can be resumed for disconnected
   sessions, but not terminated sessions.



   This command is primarily for use by client machines to automatically reconnect during intermittent network
   issues. It is not intended for any other use.

  resume-session-request - `com.amazonaws.services.simplesystemsmanagement.model.ResumeSessionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResumeSession operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.ResumeSessionResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ResumeSessionRequest resume-session-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resumeSessionAsync resume-session-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ResumeSessionRequest resume-session-request]
    (-> this (.resumeSessionAsync resume-session-request))))

(defn add-tags-to-resource-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddTagsToResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.AddTagsToResourceResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.AddTagsToResourceRequest add-tags-to-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addTagsToResourceAsync add-tags-to-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.AddTagsToResourceRequest add-tags-to-resource-request]
    (-> this (.addTagsToResourceAsync add-tags-to-resource-request))))

(defn get-command-invocation-async
  "Returns detailed information about command execution for an invocation or plugin.

  get-command-invocation-request - `com.amazonaws.services.simplesystemsmanagement.model.GetCommandInvocationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCommandInvocation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetCommandInvocationResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetCommandInvocationRequest get-command-invocation-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCommandInvocationAsync get-command-invocation-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetCommandInvocationRequest get-command-invocation-request]
    (-> this (.getCommandInvocationAsync get-command-invocation-request))))

(defn update-association-async
  "Updates an association. You can update the association name and version, the document version, schedule,
   parameters, and Amazon S3 output.



   When you update an association, the association immediately runs against the specified targets.

  update-association-request - `com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAssociation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationRequest update-association-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAssociationAsync update-association-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationRequest update-association-request]
    (-> this (.updateAssociationAsync update-association-request))))

(defn get-parameters-by-path-async
  "Retrieve parameters in a specific hierarchy. For more information, see Working with
   Systems Manager Parameters in the AWS Systems Manager User Guide.


   Request results are returned on a best-effort basis. If you specify MaxResults in the request, the
   response includes information up to the limit specified. The number of items returned, however, can be between
   zero and the value of MaxResults. If the service reaches an internal limit while processing the
   results, it stops the operation and returns the matching values up to that point and a NextToken.
   You can specify the NextToken in a subsequent call to get the next set of results.



   This API action doesn't support filtering by tags.

  get-parameters-by-path-request - `com.amazonaws.services.simplesystemsmanagement.model.GetParametersByPathRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetParametersByPath operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetParametersByPathResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetParametersByPathRequest get-parameters-by-path-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getParametersByPathAsync get-parameters-by-path-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetParametersByPathRequest get-parameters-by-path-request]
    (-> this (.getParametersByPathAsync get-parameters-by-path-request))))

(defn list-document-versions-async
  "List all versions for a document.

  list-document-versions-request - `com.amazonaws.services.simplesystemsmanagement.model.ListDocumentVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDocumentVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.ListDocumentVersionsResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListDocumentVersionsRequest list-document-versions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDocumentVersionsAsync list-document-versions-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListDocumentVersionsRequest list-document-versions-request]
    (-> this (.listDocumentVersionsAsync list-document-versions-request))))

(defn create-ops-item-async
  "Creates a new OpsItem. You must have permission in AWS Identity and Access Management (IAM) to create a new
   OpsItem. For more information, see Getting Started
   with OpsCenter in the AWS Systems Manager User Guide.


   Operations engineers and IT professionals use OpsCenter to view, investigate, and remediate operational issues
   impacting the performance and health of their AWS resources. For more information, see AWS Systems Manager
   OpsCenter in the AWS Systems Manager User Guide.

  create-ops-item-request - `com.amazonaws.services.simplesystemsmanagement.model.CreateOpsItemRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateOpsItem operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.CreateOpsItemResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.CreateOpsItemRequest create-ops-item-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createOpsItemAsync create-ops-item-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.CreateOpsItemRequest create-ops-item-request]
    (-> this (.createOpsItemAsync create-ops-item-request))))

(defn describe-inventory-deletions-async
  "Describes a specific delete inventory operation.

  describe-inventory-deletions-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInventoryDeletionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeInventoryDeletions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeInventoryDeletionsResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeInventoryDeletionsRequest describe-inventory-deletions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeInventoryDeletionsAsync describe-inventory-deletions-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeInventoryDeletionsRequest describe-inventory-deletions-request]
    (-> this (.describeInventoryDeletionsAsync describe-inventory-deletions-request))))

(defn describe-instance-associations-status-async
  "The status of the associations for the instance(s).

  describe-instance-associations-status-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceAssociationsStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeInstanceAssociationsStatus operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceAssociationsStatusResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceAssociationsStatusRequest describe-instance-associations-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeInstanceAssociationsStatusAsync describe-instance-associations-status-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceAssociationsStatusRequest describe-instance-associations-status-request]
    (-> this (.describeInstanceAssociationsStatusAsync describe-instance-associations-status-request))))

(defn describe-maintenance-window-executions-async
  "Lists the executions of a maintenance window. This includes information about when the maintenance window was
   scheduled to be active, and information about tasks registered and run with the maintenance window.

  describe-maintenance-window-executions-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeMaintenanceWindowExecutions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionsResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionsRequest describe-maintenance-window-executions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeMaintenanceWindowExecutionsAsync describe-maintenance-window-executions-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionsRequest describe-maintenance-window-executions-request]
    (-> this (.describeMaintenanceWindowExecutionsAsync describe-maintenance-window-executions-request))))

(defn get-document-async
  "Gets the contents of the specified Systems Manager document.

  get-document-request - `com.amazonaws.services.simplesystemsmanagement.model.GetDocumentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDocument operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetDocumentResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetDocumentRequest get-document-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDocumentAsync get-document-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetDocumentRequest get-document-request]
    (-> this (.getDocumentAsync get-document-request))))

(defn modify-document-permission-async
  "Shares a Systems Manager document publicly or privately. If you share a document privately, you must specify the
   AWS user account IDs for those people who can use the document. If you share a document publicly, you must
   specify All as the account ID.

  modify-document-permission-request - `com.amazonaws.services.simplesystemsmanagement.model.ModifyDocumentPermissionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyDocumentPermission operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.ModifyDocumentPermissionResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ModifyDocumentPermissionRequest modify-document-permission-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyDocumentPermissionAsync modify-document-permission-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ModifyDocumentPermissionRequest modify-document-permission-request]
    (-> this (.modifyDocumentPermissionAsync modify-document-permission-request))))

(defn describe-automation-step-executions-async
  "Information about all active and terminated step executions in an Automation workflow.

  describe-automation-step-executions-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationStepExecutionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAutomationStepExecutions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationStepExecutionsResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationStepExecutionsRequest describe-automation-step-executions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAutomationStepExecutionsAsync describe-automation-step-executions-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationStepExecutionsRequest describe-automation-step-executions-request]
    (-> this (.describeAutomationStepExecutionsAsync describe-automation-step-executions-request))))

(defn list-command-invocations-async
  "An invocation is copy of a command sent to a specific instance. A command can apply to one or more instances. A
   command invocation applies to one instance. For example, if a user runs SendCommand against three instances, then
   a command invocation is created for each requested instance ID. ListCommandInvocations provide status about
   command execution.

  list-command-invocations-request - `com.amazonaws.services.simplesystemsmanagement.model.ListCommandInvocationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListCommandInvocations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.ListCommandInvocationsResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListCommandInvocationsRequest list-command-invocations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listCommandInvocationsAsync list-command-invocations-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.ListCommandInvocationsRequest list-command-invocations-request]
    (-> this (.listCommandInvocationsAsync list-command-invocations-request))))

(defn delete-resource-data-sync-async
  "Deletes a Resource Data Sync configuration. After the configuration is deleted, changes to inventory data on
   managed instances are no longer synced with the target Amazon S3 bucket. Deleting a sync configuration does not
   delete data in the target Amazon S3 bucket.

  delete-resource-data-sync-request - `com.amazonaws.services.simplesystemsmanagement.model.DeleteResourceDataSyncRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteResourceDataSync operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DeleteResourceDataSyncResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteResourceDataSyncRequest delete-resource-data-sync-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteResourceDataSyncAsync delete-resource-data-sync-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DeleteResourceDataSyncRequest delete-resource-data-sync-request]
    (-> this (.deleteResourceDataSyncAsync delete-resource-data-sync-request))))

(defn describe-effective-instance-associations-async
  "All associations for the instance(s).

  describe-effective-instance-associations-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectiveInstanceAssociationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEffectiveInstanceAssociations operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectiveInstanceAssociationsResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectiveInstanceAssociationsRequest describe-effective-instance-associations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEffectiveInstanceAssociationsAsync describe-effective-instance-associations-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectiveInstanceAssociationsRequest describe-effective-instance-associations-request]
    (-> this (.describeEffectiveInstanceAssociationsAsync describe-effective-instance-associations-request))))

(defn terminate-session-async
  "Permanently ends a session and closes the data connection between the Session Manager client and SSM Agent on the
   instance. A terminated session cannot be resumed.

  terminate-session-request - `com.amazonaws.services.simplesystemsmanagement.model.TerminateSessionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TerminateSession operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.TerminateSessionResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.TerminateSessionRequest terminate-session-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.terminateSessionAsync terminate-session-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.TerminateSessionRequest terminate-session-request]
    (-> this (.terminateSessionAsync terminate-session-request))))

(defn describe-patch-baselines-async
  "Lists the patch baselines in your AWS account.

  describe-patch-baselines-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribePatchBaselinesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePatchBaselines operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribePatchBaselinesResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribePatchBaselinesRequest describe-patch-baselines-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePatchBaselinesAsync describe-patch-baselines-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribePatchBaselinesRequest describe-patch-baselines-request]
    (-> this (.describePatchBaselinesAsync describe-patch-baselines-request))))

(defn get-maintenance-window-execution-task-invocation-async
  "Retrieves information about a specific task running on a specific target.

  get-maintenance-window-execution-task-invocation-request - `com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskInvocationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMaintenanceWindowExecutionTaskInvocation operation returned
           by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskInvocationResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskInvocationRequest get-maintenance-window-execution-task-invocation-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMaintenanceWindowExecutionTaskInvocationAsync get-maintenance-window-execution-task-invocation-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskInvocationRequest get-maintenance-window-execution-task-invocation-request]
    (-> this (.getMaintenanceWindowExecutionTaskInvocationAsync get-maintenance-window-execution-task-invocation-request))))

(defn describe-association-async
  "Describes the association for the specified target or instance. If you created the association by using the
   Targets parameter, then you must retrieve the association by using the association ID. If you
   created the association by specifying an instance ID and a Systems Manager document, then you retrieve the
   association by specifying the document name and the instance ID.

  describe-association-request - `com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAssociation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationRequest describe-association-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAssociationAsync describe-association-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationRequest describe-association-request]
    (-> this (.describeAssociationAsync describe-association-request))))

(defn describe-patch-properties-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePatchProperties operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simplesystemsmanagement.model.DescribePatchPropertiesResult>`"
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribePatchPropertiesRequest describe-patch-properties-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePatchPropertiesAsync describe-patch-properties-request async-handler)))
  (^java.util.concurrent.Future [^AWSSimpleSystemsManagementAsync this ^com.amazonaws.services.simplesystemsmanagement.model.DescribePatchPropertiesRequest describe-patch-properties-request]
    (-> this (.describePatchPropertiesAsync describe-patch-properties-request))))

