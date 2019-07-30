(ns com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow
  "Interface for accessing Amazon SWF.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonSimpleWorkflow instead.


  Amazon Simple Workflow Service

  The Amazon Simple Workflow Service (Amazon SWF) makes it easy to build applications that use Amazon's cloud to
  coordinate work across distributed components. In Amazon SWF, a task represents a logical unit of work that is
  performed by a component of your workflow. Coordinating tasks in a workflow involves managing intertask dependencies,
  scheduling, and concurrency in accordance with the logical flow of the application.


  Amazon SWF gives you full control over implementing tasks and coordinating them without worrying about underlying
  complexities such as tracking their progress and maintaining their state.


  This documentation serves as reference only. For a broader overview of the Amazon SWF programming model, see the
  Amazon SWF Developer Guide ."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.simpleworkflow AmazonSimpleWorkflow]))

(defn register-workflow-type
  "Registers a new workflow type and its configuration settings in the specified domain.


   The retention period for the workflow history is set by the RegisterDomain action.



   If the type already exists, then a TypeAlreadyExists fault is returned. You cannot change the
   configuration settings of a workflow type once it is registered and it must be registered as a new version.



   Access Control


   You can use IAM policies to control this action's access to Amazon SWF resources as follows:




   Use a Resource element with the domain name to limit the action to only specified domains.




   Use an Action element to allow or deny permission to call this action.




   Constrain the following parameters by using a Condition element with the appropriate keys.




   defaultTaskList.name: String constraint. The key is swf:defaultTaskList.name.




   name: String constraint. The key is swf:name.




   version: String constraint. The key is swf:version.






   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
   specified constraints, the action fails. The associated event attribute's cause parameter is set to
   OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to
   Amazon SWF Workflows in the Amazon SWF Developer Guide.

  register-workflow-type-request - `com.amazonaws.services.simpleworkflow.model.RegisterWorkflowTypeRequest`

  throws: com.amazonaws.services.simpleworkflow.model.TypeAlreadyExistsException - Returned if the type already exists in the specified domain. You may get this fault if you are registering a type that is either already registered or deprecated, or if you undeprecate a type that is currently registered."
  ([^AmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.RegisterWorkflowTypeRequest register-workflow-type-request]
    (-> this (.registerWorkflowType register-workflow-type-request))))

(defn list-tags-for-resource
  "List tags for a given domain.

  list-tags-for-resource-request - `com.amazonaws.services.simpleworkflow.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.simpleworkflow.model.ListTagsForResourceOutput`

  throws: com.amazonaws.services.simpleworkflow.model.UnknownResourceException - Returned when the named resource cannot be found with in the scope of this operation (region or domain). This could happen if the named resource was never created or is no longer available for this operation."
  (^com.amazonaws.services.simpleworkflow.model.ListTagsForResourceOutput [^AmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn describe-activity-type
  "Returns information about the specified activity type. This includes configuration settings provided when the
   type was registered and other general information about the type.


   Access Control


   You can use IAM policies to control this action's access to Amazon SWF resources as follows:




   Use a Resource element with the domain name to limit the action to only specified domains.




   Use an Action element to allow or deny permission to call this action.




   Constrain the following parameters by using a Condition element with the appropriate keys.




   activityType.name: String constraint. The key is swf:activityType.name.




   activityType.version: String constraint. The key is swf:activityType.version.






   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
   specified constraints, the action fails. The associated event attribute's cause parameter is set to
   OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to
   Amazon SWF Workflows in the Amazon SWF Developer Guide.

  describe-activity-type-request - `com.amazonaws.services.simpleworkflow.model.DescribeActivityTypeRequest`

  returns: Result of the DescribeActivityType operation returned by the service. - `com.amazonaws.services.simpleworkflow.model.ActivityTypeDetail`

  throws: com.amazonaws.services.simpleworkflow.model.UnknownResourceException - Returned when the named resource cannot be found with in the scope of this operation (region or domain). This could happen if the named resource was never created or is no longer available for this operation."
  (^com.amazonaws.services.simpleworkflow.model.ActivityTypeDetail [^AmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.DescribeActivityTypeRequest describe-activity-type-request]
    (-> this (.describeActivityType describe-activity-type-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AmazonSimpleWorkflow this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn respond-activity-task-completed
  "Used by workers to tell the service that the ActivityTask identified by the taskToken
   completed successfully with a result (if provided). The result appears in the
   ActivityTaskCompleted event in the workflow history.



   If the requested task doesn't complete successfully, use RespondActivityTaskFailed instead. If the worker
   finds that the task is canceled through the canceled flag returned by
   RecordActivityTaskHeartbeat, it should cancel the task, clean up and then call
   RespondActivityTaskCanceled.



   A task is considered open from the time that it is scheduled until it is closed. Therefore a task is reported as
   open while a worker is processing it. A task is closed after it has been specified in a call to
   RespondActivityTaskCompleted, RespondActivityTaskCanceled, RespondActivityTaskFailed, or the task
   has timed
   out.


   Access Control


   You can use IAM policies to control this action's access to Amazon SWF resources as follows:




   Use a Resource element with the domain name to limit the action to only specified domains.




   Use an Action element to allow or deny permission to call this action.




   You cannot use an IAM policy to constrain this action's parameters.




   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
   specified constraints, the action fails. The associated event attribute's cause parameter is set to
   OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to
   Amazon SWF Workflows in the Amazon SWF Developer Guide.

  respond-activity-task-completed-request - `com.amazonaws.services.simpleworkflow.model.RespondActivityTaskCompletedRequest`

  throws: com.amazonaws.services.simpleworkflow.model.UnknownResourceException - Returned when the named resource cannot be found with in the scope of this operation (region or domain). This could happen if the named resource was never created or is no longer available for this operation."
  ([^AmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.RespondActivityTaskCompletedRequest respond-activity-task-completed-request]
    (-> this (.respondActivityTaskCompleted respond-activity-task-completed-request))))

(defn start-workflow-execution
  "Starts an execution of the workflow type in the specified domain using the provided workflowId and
   input data.


   This action returns the newly started workflow execution.


   Access Control


   You can use IAM policies to control this action's access to Amazon SWF resources as follows:




   Use a Resource element with the domain name to limit the action to only specified domains.




   Use an Action element to allow or deny permission to call this action.




   Constrain the following parameters by using a Condition element with the appropriate keys.




   tagList.member.0: The key is swf:tagList.member.0.




   tagList.member.1: The key is swf:tagList.member.1.




   tagList.member.2: The key is swf:tagList.member.2.




   tagList.member.3: The key is swf:tagList.member.3.




   tagList.member.4: The key is swf:tagList.member.4.




   taskList: String constraint. The key is swf:taskList.name.




   workflowType.name: String constraint. The key is swf:workflowType.name.




   workflowType.version: String constraint. The key is swf:workflowType.version.






   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
   specified constraints, the action fails. The associated event attribute's cause parameter is set to
   OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to
   Amazon SWF Workflows in the Amazon SWF Developer Guide.

  start-workflow-execution-request - `com.amazonaws.services.simpleworkflow.model.StartWorkflowExecutionRequest`

  returns: Result of the StartWorkflowExecution operation returned by the service. - `com.amazonaws.services.simpleworkflow.model.Run`

  throws: com.amazonaws.services.simpleworkflow.model.UnknownResourceException - Returned when the named resource cannot be found with in the scope of this operation (region or domain). This could happen if the named resource was never created or is no longer available for this operation."
  (^com.amazonaws.services.simpleworkflow.model.Run [^AmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.StartWorkflowExecutionRequest start-workflow-execution-request]
    (-> this (.startWorkflowExecution start-workflow-execution-request))))

(defn count-pending-activity-tasks
  "Returns the estimated number of activity tasks in the specified task list. The count returned is an approximation
   and isn't guaranteed to be exact. If you specify a task list that no activity task was ever scheduled in then
   0 is returned.


   Access Control


   You can use IAM policies to control this action's access to Amazon SWF resources as follows:




   Use a Resource element with the domain name to limit the action to only specified domains.




   Use an Action element to allow or deny permission to call this action.




   Constrain the taskList.name parameter by using a Condition element with the
   swf:taskList.name key to allow the action to access only certain task lists.




   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
   specified constraints, the action fails. The associated event attribute's cause parameter is set to
   OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to
   Amazon SWF Workflows in the Amazon SWF Developer Guide.

  count-pending-activity-tasks-request - `com.amazonaws.services.simpleworkflow.model.CountPendingActivityTasksRequest`

  returns: Result of the CountPendingActivityTasks operation returned by the service. - `com.amazonaws.services.simpleworkflow.model.PendingTaskCount`

  throws: com.amazonaws.services.simpleworkflow.model.UnknownResourceException - Returned when the named resource cannot be found with in the scope of this operation (region or domain). This could happen if the named resource was never created or is no longer available for this operation."
  (^com.amazonaws.services.simpleworkflow.model.PendingTaskCount [^AmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.CountPendingActivityTasksRequest count-pending-activity-tasks-request]
    (-> this (.countPendingActivityTasks count-pending-activity-tasks-request))))

(defn signal-workflow-execution
  "Records a WorkflowExecutionSignaled event in the workflow execution history and creates a decision
   task for the workflow execution identified by the given domain, workflowId and runId. The event is recorded with
   the specified user defined signalName and input (if provided).



   If a runId isn't specified, then the WorkflowExecutionSignaled event is recorded in the history of
   the current open workflow with the matching workflowId in the domain.



   If the specified workflow execution isn't open, this method fails with UnknownResource.



   Access Control


   You can use IAM policies to control this action's access to Amazon SWF resources as follows:




   Use a Resource element with the domain name to limit the action to only specified domains.




   Use an Action element to allow or deny permission to call this action.




   You cannot use an IAM policy to constrain this action's parameters.




   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
   specified constraints, the action fails. The associated event attribute's cause parameter is set to
   OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to
   Amazon SWF Workflows in the Amazon SWF Developer Guide.

  signal-workflow-execution-request - `com.amazonaws.services.simpleworkflow.model.SignalWorkflowExecutionRequest`

  throws: com.amazonaws.services.simpleworkflow.model.UnknownResourceException - Returned when the named resource cannot be found with in the scope of this operation (region or domain). This could happen if the named resource was never created or is no longer available for this operation."
  ([^AmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.SignalWorkflowExecutionRequest signal-workflow-execution-request]
    (-> this (.signalWorkflowExecution signal-workflow-execution-request))))

(defn describe-workflow-type
  "Returns information about the specified workflow type. This includes configuration settings specified when
   the type was registered and other information such as creation date, current status, etc.


   Access Control


   You can use IAM policies to control this action's access to Amazon SWF resources as follows:




   Use a Resource element with the domain name to limit the action to only specified domains.




   Use an Action element to allow or deny permission to call this action.




   Constrain the following parameters by using a Condition element with the appropriate keys.




   workflowType.name: String constraint. The key is swf:workflowType.name.




   workflowType.version: String constraint. The key is swf:workflowType.version.






   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
   specified constraints, the action fails. The associated event attribute's cause parameter is set to
   OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to
   Amazon SWF Workflows in the Amazon SWF Developer Guide.

  describe-workflow-type-request - `com.amazonaws.services.simpleworkflow.model.DescribeWorkflowTypeRequest`

  returns: Result of the DescribeWorkflowType operation returned by the service. - `com.amazonaws.services.simpleworkflow.model.WorkflowTypeDetail`

  throws: com.amazonaws.services.simpleworkflow.model.UnknownResourceException - Returned when the named resource cannot be found with in the scope of this operation (region or domain). This could happen if the named resource was never created or is no longer available for this operation."
  (^com.amazonaws.services.simpleworkflow.model.WorkflowTypeDetail [^AmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.DescribeWorkflowTypeRequest describe-workflow-type-request]
    (-> this (.describeWorkflowType describe-workflow-type-request))))

(defn deprecate-workflow-type
  "Deprecates the specified workflow type. After a workflow type has been deprecated, you cannot create new
   executions of that type. Executions that were started before the type was deprecated continues to run. A
   deprecated workflow type may still be used when calling visibility actions.



   This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates
   and changes.



   Access Control


   You can use IAM policies to control this action's access to Amazon SWF resources as follows:




   Use a Resource element with the domain name to limit the action to only specified domains.




   Use an Action element to allow or deny permission to call this action.




   Constrain the following parameters by using a Condition element with the appropriate keys.




   workflowType.name: String constraint. The key is swf:workflowType.name.




   workflowType.version: String constraint. The key is swf:workflowType.version.






   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
   specified constraints, the action fails. The associated event attribute's cause parameter is set to
   OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to
   Amazon SWF Workflows in the Amazon SWF Developer Guide.

  deprecate-workflow-type-request - `com.amazonaws.services.simpleworkflow.model.DeprecateWorkflowTypeRequest`

  throws: com.amazonaws.services.simpleworkflow.model.UnknownResourceException - Returned when the named resource cannot be found with in the scope of this operation (region or domain). This could happen if the named resource was never created or is no longer available for this operation."
  ([^AmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.DeprecateWorkflowTypeRequest deprecate-workflow-type-request]
    (-> this (.deprecateWorkflowType deprecate-workflow-type-request))))

(defn untag-resource
  "Remove a tag from a Amazon SWF domain.

  untag-resource-request - `com.amazonaws.services.simpleworkflow.model.UntagResourceRequest`

  throws: com.amazonaws.services.simpleworkflow.model.UnknownResourceException - Returned when the named resource cannot be found with in the scope of this operation (region or domain). This could happen if the named resource was never created or is no longer available for this operation."
  ([^AmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn undeprecate-workflow-type
  "Undeprecates a previously deprecated workflow type. After a workflow type has been undeprecated, you can
   create new executions of that type.



   This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates
   and changes.



   Access Control


   You can use IAM policies to control this action's access to Amazon SWF resources as follows:




   Use a Resource element with the domain name to limit the action to only specified domains.




   Use an Action element to allow or deny permission to call this action.




   Constrain the following parameters by using a Condition element with the appropriate keys.




   workflowType.name: String constraint. The key is swf:workflowType.name.




   workflowType.version: String constraint. The key is swf:workflowType.version.






   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
   specified constraints, the action fails. The associated event attribute's cause parameter is set to
   OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to
   Amazon SWF Workflows in the Amazon SWF Developer Guide.

  undeprecate-workflow-type-request - `com.amazonaws.services.simpleworkflow.model.UndeprecateWorkflowTypeRequest`

  throws: com.amazonaws.services.simpleworkflow.model.UnknownResourceException - Returned when the named resource cannot be found with in the scope of this operation (region or domain). This could happen if the named resource was never created or is no longer available for this operation."
  ([^AmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.UndeprecateWorkflowTypeRequest undeprecate-workflow-type-request]
    (-> this (.undeprecateWorkflowType undeprecate-workflow-type-request))))

(defn respond-activity-task-failed
  "Used by workers to tell the service that the ActivityTask identified by the taskToken has
   failed with reason (if specified). The reason and details appear in the
   ActivityTaskFailed event added to the workflow history.


   A task is considered open from the time that it is scheduled until it is closed. Therefore a task is reported as
   open while a worker is processing it. A task is closed after it has been specified in a call to
   RespondActivityTaskCompleted, RespondActivityTaskCanceled, RespondActivityTaskFailed, or the task
   has timed
   out.


   Access Control


   You can use IAM policies to control this action's access to Amazon SWF resources as follows:




   Use a Resource element with the domain name to limit the action to only specified domains.




   Use an Action element to allow or deny permission to call this action.




   You cannot use an IAM policy to constrain this action's parameters.




   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
   specified constraints, the action fails. The associated event attribute's cause parameter is set to
   OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to
   Amazon SWF Workflows in the Amazon SWF Developer Guide.

  respond-activity-task-failed-request - `com.amazonaws.services.simpleworkflow.model.RespondActivityTaskFailedRequest`

  throws: com.amazonaws.services.simpleworkflow.model.UnknownResourceException - Returned when the named resource cannot be found with in the scope of this operation (region or domain). This could happen if the named resource was never created or is no longer available for this operation."
  ([^AmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.RespondActivityTaskFailedRequest respond-activity-task-failed-request]
    (-> this (.respondActivityTaskFailed respond-activity-task-failed-request))))

(defn request-cancel-workflow-execution
  "Records a WorkflowExecutionCancelRequested event in the currently running workflow execution
   identified by the given domain, workflowId, and runId. This logically requests the cancellation of the workflow
   execution as a whole. It is up to the decider to take appropriate actions when it receives an execution history
   with this event.



   If the runId isn't specified, the WorkflowExecutionCancelRequested event is recorded in the history
   of the current open workflow execution with the specified workflowId in the domain.



   Because this action allows the workflow to properly clean up and gracefully close, it should be used instead of
   TerminateWorkflowExecution when possible.



   Access Control


   You can use IAM policies to control this action's access to Amazon SWF resources as follows:




   Use a Resource element with the domain name to limit the action to only specified domains.




   Use an Action element to allow or deny permission to call this action.




   You cannot use an IAM policy to constrain this action's parameters.




   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
   specified constraints, the action fails. The associated event attribute's cause parameter is set to
   OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to
   Amazon SWF Workflows in the Amazon SWF Developer Guide.

  request-cancel-workflow-execution-request - `com.amazonaws.services.simpleworkflow.model.RequestCancelWorkflowExecutionRequest`

  throws: com.amazonaws.services.simpleworkflow.model.UnknownResourceException - Returned when the named resource cannot be found with in the scope of this operation (region or domain). This could happen if the named resource was never created or is no longer available for this operation."
  ([^AmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.RequestCancelWorkflowExecutionRequest request-cancel-workflow-execution-request]
    (-> this (.requestCancelWorkflowExecution request-cancel-workflow-execution-request))))

(defn respond-decision-task-completed
  "Used by deciders to tell the service that the DecisionTask identified by the taskToken has
   successfully completed. The decisions argument specifies the list of decisions made while processing
   the task.


   A DecisionTaskCompleted event is added to the workflow history. The executionContext
   specified is attached to the event in the workflow execution history.


   Access Control


   If an IAM policy grants permission to use RespondDecisionTaskCompleted, it can express permissions
   for the list of decisions in the decisions parameter. Each of the decisions has one or more
   parameters, much like a regular API call. To allow for policies to be as readable as possible, you can express
   permissions on decisions as if they were actual API calls, including applying conditions to some parameters. For
   more information, see Using IAM to Manage Access to
   Amazon SWF Workflows in the Amazon SWF Developer Guide.

  respond-decision-task-completed-request - Input data for a TaskCompleted response to a decision task. - `com.amazonaws.services.simpleworkflow.model.RespondDecisionTaskCompletedRequest`

  throws: com.amazonaws.services.simpleworkflow.model.UnknownResourceException - Returned when the named resource cannot be found with in the scope of this operation (region or domain). This could happen if the named resource was never created or is no longer available for this operation."
  ([^AmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.RespondDecisionTaskCompletedRequest respond-decision-task-completed-request]
    (-> this (.respondDecisionTaskCompleted respond-decision-task-completed-request))))

(defn list-closed-workflow-executions
  "Returns a list of closed workflow executions in the specified domain that meet the filtering criteria. The
   results may be split into multiple pages. To retrieve subsequent pages, make the call again using the
   nextPageToken returned by the initial call.



   This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates
   and changes.



   Access Control


   You can use IAM policies to control this action's access to Amazon SWF resources as follows:




   Use a Resource element with the domain name to limit the action to only specified domains.




   Use an Action element to allow or deny permission to call this action.




   Constrain the following parameters by using a Condition element with the appropriate keys.




   tagFilter.tag: String constraint. The key is swf:tagFilter.tag.




   typeFilter.name: String constraint. The key is swf:typeFilter.name.




   typeFilter.version: String constraint. The key is swf:typeFilter.version.






   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
   specified constraints, the action fails. The associated event attribute's cause parameter is set to
   OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to
   Amazon SWF Workflows in the Amazon SWF Developer Guide.

  list-closed-workflow-executions-request - `com.amazonaws.services.simpleworkflow.model.ListClosedWorkflowExecutionsRequest`

  returns: Result of the ListClosedWorkflowExecutions operation returned by the service. - `com.amazonaws.services.simpleworkflow.model.WorkflowExecutionInfos`

  throws: com.amazonaws.services.simpleworkflow.model.UnknownResourceException - Returned when the named resource cannot be found with in the scope of this operation (region or domain). This could happen if the named resource was never created or is no longer available for this operation."
  (^com.amazonaws.services.simpleworkflow.model.WorkflowExecutionInfos [^AmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.ListClosedWorkflowExecutionsRequest list-closed-workflow-executions-request]
    (-> this (.listClosedWorkflowExecutions list-closed-workflow-executions-request))))

(defn list-activity-types
  "Returns information about all activities registered in the specified domain that match the specified name and
   registration status. The result includes information like creation date, current status of the activity, etc. The
   results may be split into multiple pages. To retrieve subsequent pages, make the call again using the
   nextPageToken returned by the initial call.


   Access Control


   You can use IAM policies to control this action's access to Amazon SWF resources as follows:




   Use a Resource element with the domain name to limit the action to only specified domains.




   Use an Action element to allow or deny permission to call this action.




   You cannot use an IAM policy to constrain this action's parameters.




   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
   specified constraints, the action fails. The associated event attribute's cause parameter is set to
   OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to
   Amazon SWF Workflows in the Amazon SWF Developer Guide.

  list-activity-types-request - `com.amazonaws.services.simpleworkflow.model.ListActivityTypesRequest`

  returns: Result of the ListActivityTypes operation returned by the service. - `com.amazonaws.services.simpleworkflow.model.ActivityTypeInfos`

  throws: com.amazonaws.services.simpleworkflow.model.OperationNotPermittedException - Returned when the caller doesn't have sufficient permissions to invoke the action."
  (^com.amazonaws.services.simpleworkflow.model.ActivityTypeInfos [^AmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.ListActivityTypesRequest list-activity-types-request]
    (-> this (.listActivityTypes list-activity-types-request))))

(defn undeprecate-domain
  "Undeprecates a previously deprecated domain. After a domain has been undeprecated it can be used to create new
   workflow executions or register new types.



   This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates
   and changes.



   Access Control


   You can use IAM policies to control this action's access to Amazon SWF resources as follows:




   Use a Resource element with the domain name to limit the action to only specified domains.




   Use an Action element to allow or deny permission to call this action.




   You cannot use an IAM policy to constrain this action's parameters.




   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
   specified constraints, the action fails. The associated event attribute's cause parameter is set to
   OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to
   Amazon SWF Workflows in the Amazon SWF Developer Guide.

  undeprecate-domain-request - `com.amazonaws.services.simpleworkflow.model.UndeprecateDomainRequest`

  throws: com.amazonaws.services.simpleworkflow.model.UnknownResourceException - Returned when the named resource cannot be found with in the scope of this operation (region or domain). This could happen if the named resource was never created or is no longer available for this operation."
  ([^AmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.UndeprecateDomainRequest undeprecate-domain-request]
    (-> this (.undeprecateDomain undeprecate-domain-request))))

(defn deprecate-domain
  "Deprecates the specified domain. After a domain has been deprecated it cannot be used to create new workflow
   executions or register new types. However, you can still use visibility actions on this domain. Deprecating a
   domain also deprecates all activity and workflow types registered in the domain. Executions that were started
   before the domain was deprecated continues to run.



   This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates
   and changes.



   Access Control


   You can use IAM policies to control this action's access to Amazon SWF resources as follows:




   Use a Resource element with the domain name to limit the action to only specified domains.




   Use an Action element to allow or deny permission to call this action.




   You cannot use an IAM policy to constrain this action's parameters.




   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
   specified constraints, the action fails. The associated event attribute's cause parameter is set to
   OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to
   Amazon SWF Workflows in the Amazon SWF Developer Guide.

  deprecate-domain-request - `com.amazonaws.services.simpleworkflow.model.DeprecateDomainRequest`

  throws: com.amazonaws.services.simpleworkflow.model.UnknownResourceException - Returned when the named resource cannot be found with in the scope of this operation (region or domain). This could happen if the named resource was never created or is no longer available for this operation."
  ([^AmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.DeprecateDomainRequest deprecate-domain-request]
    (-> this (.deprecateDomain deprecate-domain-request))))

(defn poll-for-decision-task
  "Used by deciders to get a DecisionTask from the specified decision taskList. A decision task
   may be returned for any open workflow execution that is using the specified task list. The task includes a
   paginated view of the history of the workflow execution. The decider should use the workflow type and the history
   to determine how to properly handle the task.


   This action initiates a long poll, where the service holds the HTTP connection open and responds as soon a task
   becomes available. If no decision task is available in the specified task list before the timeout of 60 seconds
   expires, an empty result is returned. An empty result, in this context, means that a DecisionTask is returned,
   but that the value of taskToken is an empty string.



   Deciders should set their client side socket timeout to at least 70 seconds (10 seconds higher than the timeout).



   Because the number of workflow history events for a single workflow execution might be very large, the result
   returned might be split up across a number of pages. To retrieve subsequent pages, make additional calls to
   PollForDecisionTask using the nextPageToken returned by the initial call. Note that you
   do not call GetWorkflowExecutionHistory with this nextPageToken. Instead, call
   PollForDecisionTask again.



   Access Control


   You can use IAM policies to control this action's access to Amazon SWF resources as follows:




   Use a Resource element with the domain name to limit the action to only specified domains.




   Use an Action element to allow or deny permission to call this action.




   Constrain the taskList.name parameter by using a Condition element with the
   swf:taskList.name key to allow the action to access only certain task lists.




   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
   specified constraints, the action fails. The associated event attribute's cause parameter is set to
   OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to
   Amazon SWF Workflows in the Amazon SWF Developer Guide.

  poll-for-decision-task-request - `com.amazonaws.services.simpleworkflow.model.PollForDecisionTaskRequest`

  returns: Result of the PollForDecisionTask operation returned by the service. - `com.amazonaws.services.simpleworkflow.model.DecisionTask`

  throws: com.amazonaws.services.simpleworkflow.model.UnknownResourceException - Returned when the named resource cannot be found with in the scope of this operation (region or domain). This could happen if the named resource was never created or is no longer available for this operation."
  (^com.amazonaws.services.simpleworkflow.model.DecisionTask [^AmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.PollForDecisionTaskRequest poll-for-decision-task-request]
    (-> this (.pollForDecisionTask poll-for-decision-task-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonSimpleWorkflow this]
    (-> this (.shutdown))))

(defn terminate-workflow-execution
  "Records a WorkflowExecutionTerminated event and forces closure of the workflow execution identified
   by the given domain, runId, and workflowId. The child policy, registered with the workflow type or specified when
   starting this execution, is applied to any open child workflow executions of this workflow execution.



   If the identified workflow execution was in progress, it is terminated immediately.



   If a runId isn't specified, then the WorkflowExecutionTerminated event is recorded in the history of
   the current open workflow with the matching workflowId in the domain.



   You should consider using RequestCancelWorkflowExecution action instead because it allows the workflow to
   gracefully close while TerminateWorkflowExecution doesn't.



   Access Control


   You can use IAM policies to control this action's access to Amazon SWF resources as follows:




   Use a Resource element with the domain name to limit the action to only specified domains.




   Use an Action element to allow or deny permission to call this action.




   You cannot use an IAM policy to constrain this action's parameters.




   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
   specified constraints, the action fails. The associated event attribute's cause parameter is set to
   OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to
   Amazon SWF Workflows in the Amazon SWF Developer Guide.

  terminate-workflow-execution-request - `com.amazonaws.services.simpleworkflow.model.TerminateWorkflowExecutionRequest`

  throws: com.amazonaws.services.simpleworkflow.model.UnknownResourceException - Returned when the named resource cannot be found with in the scope of this operation (region or domain). This could happen if the named resource was never created or is no longer available for this operation."
  ([^AmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.TerminateWorkflowExecutionRequest terminate-workflow-execution-request]
    (-> this (.terminateWorkflowExecution terminate-workflow-execution-request))))

(defn register-activity-type
  "Registers a new activity type along with its configuration settings in the specified domain.



   A TypeAlreadyExists fault is returned if the type already exists in the domain. You cannot change
   any configuration settings of the type after its registration, and it must be registered as a new version.



   Access Control


   You can use IAM policies to control this action's access to Amazon SWF resources as follows:




   Use a Resource element with the domain name to limit the action to only specified domains.




   Use an Action element to allow or deny permission to call this action.




   Constrain the following parameters by using a Condition element with the appropriate keys.




   defaultTaskList.name: String constraint. The key is swf:defaultTaskList.name.




   name: String constraint. The key is swf:name.




   version: String constraint. The key is swf:version.






   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
   specified constraints, the action fails. The associated event attribute's cause parameter is set to
   OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to
   Amazon SWF Workflows in the Amazon SWF Developer Guide.

  register-activity-type-request - `com.amazonaws.services.simpleworkflow.model.RegisterActivityTypeRequest`

  throws: com.amazonaws.services.simpleworkflow.model.TypeAlreadyExistsException - Returned if the type already exists in the specified domain. You may get this fault if you are registering a type that is either already registered or deprecated, or if you undeprecate a type that is currently registered."
  ([^AmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.RegisterActivityTypeRequest register-activity-type-request]
    (-> this (.registerActivityType register-activity-type-request))))

(defn list-domains
  "Returns the list of domains registered in the account. The results may be split into multiple pages. To retrieve
   subsequent pages, make the call again using the nextPageToken returned by the initial call.



   This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates
   and changes.



   Access Control


   You can use IAM policies to control this action's access to Amazon SWF resources as follows:




   Use a Resource element with the domain name to limit the action to only specified domains. The
   element must be set to arn:aws:swf::AccountID:domain/*, where AccountID is the account ID,
   with no dashes.




   Use an Action element to allow or deny permission to call this action.




   You cannot use an IAM policy to constrain this action's parameters.




   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
   specified constraints, the action fails. The associated event attribute's cause parameter is set to
   OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to
   Amazon SWF Workflows in the Amazon SWF Developer Guide.

  list-domains-request - `com.amazonaws.services.simpleworkflow.model.ListDomainsRequest`

  returns: Result of the ListDomains operation returned by the service. - `com.amazonaws.services.simpleworkflow.model.DomainInfos`

  throws: com.amazonaws.services.simpleworkflow.model.OperationNotPermittedException - Returned when the caller doesn't have sufficient permissions to invoke the action."
  (^com.amazonaws.services.simpleworkflow.model.DomainInfos [^AmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.ListDomainsRequest list-domains-request]
    (-> this (.listDomains list-domains-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"swf.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"swf.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AmazonSimpleWorkflow this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn count-pending-decision-tasks
  "Returns the estimated number of decision tasks in the specified task list. The count returned is an approximation
   and isn't guaranteed to be exact. If you specify a task list that no decision task was ever scheduled in then
   0 is returned.


   Access Control


   You can use IAM policies to control this action's access to Amazon SWF resources as follows:




   Use a Resource element with the domain name to limit the action to only specified domains.




   Use an Action element to allow or deny permission to call this action.




   Constrain the taskList.name parameter by using a Condition element with the
   swf:taskList.name key to allow the action to access only certain task lists.




   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
   specified constraints, the action fails. The associated event attribute's cause parameter is set to
   OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to
   Amazon SWF Workflows in the Amazon SWF Developer Guide.

  count-pending-decision-tasks-request - `com.amazonaws.services.simpleworkflow.model.CountPendingDecisionTasksRequest`

  returns: Result of the CountPendingDecisionTasks operation returned by the service. - `com.amazonaws.services.simpleworkflow.model.PendingTaskCount`

  throws: com.amazonaws.services.simpleworkflow.model.UnknownResourceException - Returned when the named resource cannot be found with in the scope of this operation (region or domain). This could happen if the named resource was never created or is no longer available for this operation."
  (^com.amazonaws.services.simpleworkflow.model.PendingTaskCount [^AmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.CountPendingDecisionTasksRequest count-pending-decision-tasks-request]
    (-> this (.countPendingDecisionTasks count-pending-decision-tasks-request))))

(defn respond-activity-task-canceled
  "Used by workers to tell the service that the ActivityTask identified by the taskToken was
   successfully canceled. Additional details can be provided using the details argument.


   These details (if provided) appear in the ActivityTaskCanceled event added to the
   workflow history.



   Only use this operation if the canceled flag of a RecordActivityTaskHeartbeat request returns
   true and if the activity can be safely undone or abandoned.



   A task is considered open from the time that it is scheduled until it is closed. Therefore a task is reported as
   open while a worker is processing it. A task is closed after it has been specified in a call to
   RespondActivityTaskCompleted, RespondActivityTaskCanceled, RespondActivityTaskFailed, or the task
   has timed
   out.


   Access Control


   You can use IAM policies to control this action's access to Amazon SWF resources as follows:




   Use a Resource element with the domain name to limit the action to only specified domains.




   Use an Action element to allow or deny permission to call this action.




   You cannot use an IAM policy to constrain this action's parameters.




   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
   specified constraints, the action fails. The associated event attribute's cause parameter is set to
   OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to
   Amazon SWF Workflows in the Amazon SWF Developer Guide.

  respond-activity-task-canceled-request - `com.amazonaws.services.simpleworkflow.model.RespondActivityTaskCanceledRequest`

  throws: com.amazonaws.services.simpleworkflow.model.UnknownResourceException - Returned when the named resource cannot be found with in the scope of this operation (region or domain). This could happen if the named resource was never created or is no longer available for this operation."
  ([^AmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.RespondActivityTaskCanceledRequest respond-activity-task-canceled-request]
    (-> this (.respondActivityTaskCanceled respond-activity-task-canceled-request))))

(defn describe-domain
  "Returns information about the specified domain, including description and status.


   Access Control


   You can use IAM policies to control this action's access to Amazon SWF resources as follows:




   Use a Resource element with the domain name to limit the action to only specified domains.




   Use an Action element to allow or deny permission to call this action.




   You cannot use an IAM policy to constrain this action's parameters.




   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
   specified constraints, the action fails. The associated event attribute's cause parameter is set to
   OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to
   Amazon SWF Workflows in the Amazon SWF Developer Guide.

  describe-domain-request - `com.amazonaws.services.simpleworkflow.model.DescribeDomainRequest`

  returns: Result of the DescribeDomain operation returned by the service. - `com.amazonaws.services.simpleworkflow.model.DomainDetail`

  throws: com.amazonaws.services.simpleworkflow.model.UnknownResourceException - Returned when the named resource cannot be found with in the scope of this operation (region or domain). This could happen if the named resource was never created or is no longer available for this operation."
  (^com.amazonaws.services.simpleworkflow.model.DomainDetail [^AmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.DescribeDomainRequest describe-domain-request]
    (-> this (.describeDomain describe-domain-request))))

(defn deprecate-activity-type
  "Deprecates the specified activity type. After an activity type has been deprecated, you cannot create new
   tasks of that activity type. Tasks of this type that were scheduled before the type was deprecated continue to
   run.



   This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates
   and changes.



   Access Control


   You can use IAM policies to control this action's access to Amazon SWF resources as follows:




   Use a Resource element with the domain name to limit the action to only specified domains.




   Use an Action element to allow or deny permission to call this action.




   Constrain the following parameters by using a Condition element with the appropriate keys.




   activityType.name: String constraint. The key is swf:activityType.name.




   activityType.version: String constraint. The key is swf:activityType.version.






   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
   specified constraints, the action fails. The associated event attribute's cause parameter is set to
   OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to
   Amazon SWF Workflows in the Amazon SWF Developer Guide.

  deprecate-activity-type-request - `com.amazonaws.services.simpleworkflow.model.DeprecateActivityTypeRequest`

  throws: com.amazonaws.services.simpleworkflow.model.UnknownResourceException - Returned when the named resource cannot be found with in the scope of this operation (region or domain). This could happen if the named resource was never created or is no longer available for this operation."
  ([^AmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.DeprecateActivityTypeRequest deprecate-activity-type-request]
    (-> this (.deprecateActivityType deprecate-activity-type-request))))

(defn get-workflow-execution-history
  "Returns the history of the specified workflow execution. The results may be split into multiple pages. To
   retrieve subsequent pages, make the call again using the nextPageToken returned by the initial call.



   This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates
   and changes.



   Access Control


   You can use IAM policies to control this action's access to Amazon SWF resources as follows:




   Use a Resource element with the domain name to limit the action to only specified domains.




   Use an Action element to allow or deny permission to call this action.




   You cannot use an IAM policy to constrain this action's parameters.




   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
   specified constraints, the action fails. The associated event attribute's cause parameter is set to
   OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to
   Amazon SWF Workflows in the Amazon SWF Developer Guide.

  get-workflow-execution-history-request - `com.amazonaws.services.simpleworkflow.model.GetWorkflowExecutionHistoryRequest`

  returns: Result of the GetWorkflowExecutionHistory operation returned by the service. - `com.amazonaws.services.simpleworkflow.model.History`

  throws: com.amazonaws.services.simpleworkflow.model.UnknownResourceException - Returned when the named resource cannot be found with in the scope of this operation (region or domain). This could happen if the named resource was never created or is no longer available for this operation."
  (^com.amazonaws.services.simpleworkflow.model.History [^AmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.GetWorkflowExecutionHistoryRequest get-workflow-execution-history-request]
    (-> this (.getWorkflowExecutionHistory get-workflow-execution-history-request))))

(defn count-closed-workflow-executions
  "Returns the number of closed workflow executions within the given domain that meet the specified filtering
   criteria.



   This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates
   and changes.



   Access Control


   You can use IAM policies to control this action's access to Amazon SWF resources as follows:




   Use a Resource element with the domain name to limit the action to only specified domains.




   Use an Action element to allow or deny permission to call this action.




   Constrain the following parameters by using a Condition element with the appropriate keys.




   tagFilter.tag: String constraint. The key is swf:tagFilter.tag.




   typeFilter.name: String constraint. The key is swf:typeFilter.name.




   typeFilter.version: String constraint. The key is swf:typeFilter.version.






   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
   specified constraints, the action fails. The associated event attribute's cause parameter is set to
   OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to
   Amazon SWF Workflows in the Amazon SWF Developer Guide.

  count-closed-workflow-executions-request - `com.amazonaws.services.simpleworkflow.model.CountClosedWorkflowExecutionsRequest`

  returns: Result of the CountClosedWorkflowExecutions operation returned by the service. - `com.amazonaws.services.simpleworkflow.model.WorkflowExecutionCount`

  throws: com.amazonaws.services.simpleworkflow.model.UnknownResourceException - Returned when the named resource cannot be found with in the scope of this operation (region or domain). This could happen if the named resource was never created or is no longer available for this operation."
  (^com.amazonaws.services.simpleworkflow.model.WorkflowExecutionCount [^AmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.CountClosedWorkflowExecutionsRequest count-closed-workflow-executions-request]
    (-> this (.countClosedWorkflowExecutions count-closed-workflow-executions-request))))

(defn poll-for-activity-task
  "Used by workers to get an ActivityTask from the specified activity taskList. This initiates a
   long poll, where the service holds the HTTP connection open and responds as soon as a task becomes available. The
   maximum time the service holds on to the request before responding is 60 seconds. If no task is available within
   60 seconds, the poll returns an empty result. An empty result, in this context, means that an ActivityTask is
   returned, but that the value of taskToken is an empty string. If a task is returned, the worker should use its
   type to identify and process it correctly.



   Workers should set their client side socket timeout to at least 70 seconds (10 seconds higher than the maximum
   time service may hold the poll request).



   Access Control


   You can use IAM policies to control this action's access to Amazon SWF resources as follows:




   Use a Resource element with the domain name to limit the action to only specified domains.




   Use an Action element to allow or deny permission to call this action.




   Constrain the taskList.name parameter by using a Condition element with the
   swf:taskList.name key to allow the action to access only certain task lists.




   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
   specified constraints, the action fails. The associated event attribute's cause parameter is set to
   OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to
   Amazon SWF Workflows in the Amazon SWF Developer Guide.

  poll-for-activity-task-request - `com.amazonaws.services.simpleworkflow.model.PollForActivityTaskRequest`

  returns: Result of the PollForActivityTask operation returned by the service. - `com.amazonaws.services.simpleworkflow.model.ActivityTask`

  throws: com.amazonaws.services.simpleworkflow.model.UnknownResourceException - Returned when the named resource cannot be found with in the scope of this operation (region or domain). This could happen if the named resource was never created or is no longer available for this operation."
  (^com.amazonaws.services.simpleworkflow.model.ActivityTask [^AmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.PollForActivityTaskRequest poll-for-activity-task-request]
    (-> this (.pollForActivityTask poll-for-activity-task-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonSimpleWorkflow this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn count-open-workflow-executions
  "Returns the number of open workflow executions within the given domain that meet the specified filtering
   criteria.



   This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates
   and changes.



   Access Control


   You can use IAM policies to control this action's access to Amazon SWF resources as follows:




   Use a Resource element with the domain name to limit the action to only specified domains.




   Use an Action element to allow or deny permission to call this action.




   Constrain the following parameters by using a Condition element with the appropriate keys.




   tagFilter.tag: String constraint. The key is swf:tagFilter.tag.




   typeFilter.name: String constraint. The key is swf:typeFilter.name.




   typeFilter.version: String constraint. The key is swf:typeFilter.version.






   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
   specified constraints, the action fails. The associated event attribute's cause parameter is set to
   OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to
   Amazon SWF Workflows in the Amazon SWF Developer Guide.

  count-open-workflow-executions-request - `com.amazonaws.services.simpleworkflow.model.CountOpenWorkflowExecutionsRequest`

  returns: Result of the CountOpenWorkflowExecutions operation returned by the service. - `com.amazonaws.services.simpleworkflow.model.WorkflowExecutionCount`

  throws: com.amazonaws.services.simpleworkflow.model.UnknownResourceException - Returned when the named resource cannot be found with in the scope of this operation (region or domain). This could happen if the named resource was never created or is no longer available for this operation."
  (^com.amazonaws.services.simpleworkflow.model.WorkflowExecutionCount [^AmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.CountOpenWorkflowExecutionsRequest count-open-workflow-executions-request]
    (-> this (.countOpenWorkflowExecutions count-open-workflow-executions-request))))

(defn list-workflow-types
  "Returns information about workflow types in the specified domain. The results may be split into multiple pages
   that can be retrieved by making the call repeatedly.


   Access Control


   You can use IAM policies to control this action's access to Amazon SWF resources as follows:




   Use a Resource element with the domain name to limit the action to only specified domains.




   Use an Action element to allow or deny permission to call this action.




   You cannot use an IAM policy to constrain this action's parameters.




   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
   specified constraints, the action fails. The associated event attribute's cause parameter is set to
   OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to
   Amazon SWF Workflows in the Amazon SWF Developer Guide.

  list-workflow-types-request - `com.amazonaws.services.simpleworkflow.model.ListWorkflowTypesRequest`

  returns: Result of the ListWorkflowTypes operation returned by the service. - `com.amazonaws.services.simpleworkflow.model.WorkflowTypeInfos`

  throws: com.amazonaws.services.simpleworkflow.model.OperationNotPermittedException - Returned when the caller doesn't have sufficient permissions to invoke the action."
  (^com.amazonaws.services.simpleworkflow.model.WorkflowTypeInfos [^AmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.ListWorkflowTypesRequest list-workflow-types-request]
    (-> this (.listWorkflowTypes list-workflow-types-request))))

(defn undeprecate-activity-type
  "Undeprecates a previously deprecated activity type. After an activity type has been undeprecated, you can
   create new tasks of that activity type.



   This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates
   and changes.



   Access Control


   You can use IAM policies to control this action's access to Amazon SWF resources as follows:




   Use a Resource element with the domain name to limit the action to only specified domains.




   Use an Action element to allow or deny permission to call this action.




   Constrain the following parameters by using a Condition element with the appropriate keys.




   activityType.name: String constraint. The key is swf:activityType.name.




   activityType.version: String constraint. The key is swf:activityType.version.






   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
   specified constraints, the action fails. The associated event attribute's cause parameter is set to
   OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to
   Amazon SWF Workflows in the Amazon SWF Developer Guide.

  undeprecate-activity-type-request - `com.amazonaws.services.simpleworkflow.model.UndeprecateActivityTypeRequest`

  throws: com.amazonaws.services.simpleworkflow.model.UnknownResourceException - Returned when the named resource cannot be found with in the scope of this operation (region or domain). This could happen if the named resource was never created or is no longer available for this operation."
  ([^AmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.UndeprecateActivityTypeRequest undeprecate-activity-type-request]
    (-> this (.undeprecateActivityType undeprecate-activity-type-request))))

(defn record-activity-task-heartbeat
  "Used by activity workers to report to the service that the ActivityTask represented by the specified
   taskToken is still making progress. The worker can also specify details of the progress, for example
   percent complete, using the details parameter. This action can also be used by the worker as a
   mechanism to check if cancellation is being requested for the activity task. If a cancellation is being attempted
   for the specified task, then the boolean cancelRequested flag returned by the service is set to
   true.


   This action resets the taskHeartbeatTimeout clock. The taskHeartbeatTimeout is
   specified in RegisterActivityType.


   This action doesn't in itself create an event in the workflow execution history. However, if the task times out,
   the workflow execution history contains a ActivityTaskTimedOut event that contains the information
   from the last heartbeat generated by the activity worker.



   The taskStartToCloseTimeout of an activity type is the maximum duration of an activity task,
   regardless of the number of RecordActivityTaskHeartbeat requests received. The
   taskStartToCloseTimeout is also specified in RegisterActivityType.



   This operation is only useful for long-lived activities to report liveliness of the task and to determine if a
   cancellation is being attempted.



   If the cancelRequested flag returns true, a cancellation is being attempted. If the
   worker can cancel the activity, it should respond with RespondActivityTaskCanceled. Otherwise, it should
   ignore the cancellation request.



   Access Control


   You can use IAM policies to control this action's access to Amazon SWF resources as follows:




   Use a Resource element with the domain name to limit the action to only specified domains.




   Use an Action element to allow or deny permission to call this action.




   You cannot use an IAM policy to constrain this action's parameters.




   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
   specified constraints, the action fails. The associated event attribute's cause parameter is set to
   OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to
   Amazon SWF Workflows in the Amazon SWF Developer Guide.

  record-activity-task-heartbeat-request - `com.amazonaws.services.simpleworkflow.model.RecordActivityTaskHeartbeatRequest`

  returns: Result of the RecordActivityTaskHeartbeat operation returned by the service. - `com.amazonaws.services.simpleworkflow.model.ActivityTaskStatus`

  throws: com.amazonaws.services.simpleworkflow.model.UnknownResourceException - Returned when the named resource cannot be found with in the scope of this operation (region or domain). This could happen if the named resource was never created or is no longer available for this operation."
  (^com.amazonaws.services.simpleworkflow.model.ActivityTaskStatus [^AmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.RecordActivityTaskHeartbeatRequest record-activity-task-heartbeat-request]
    (-> this (.recordActivityTaskHeartbeat record-activity-task-heartbeat-request))))

(defn describe-workflow-execution
  "Returns information about the specified workflow execution including its type and some statistics.



   This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates
   and changes.



   Access Control


   You can use IAM policies to control this action's access to Amazon SWF resources as follows:




   Use a Resource element with the domain name to limit the action to only specified domains.




   Use an Action element to allow or deny permission to call this action.




   You cannot use an IAM policy to constrain this action's parameters.




   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
   specified constraints, the action fails. The associated event attribute's cause parameter is set to
   OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to
   Amazon SWF Workflows in the Amazon SWF Developer Guide.

  describe-workflow-execution-request - `com.amazonaws.services.simpleworkflow.model.DescribeWorkflowExecutionRequest`

  returns: Result of the DescribeWorkflowExecution operation returned by the service. - `com.amazonaws.services.simpleworkflow.model.WorkflowExecutionDetail`

  throws: com.amazonaws.services.simpleworkflow.model.UnknownResourceException - Returned when the named resource cannot be found with in the scope of this operation (region or domain). This could happen if the named resource was never created or is no longer available for this operation."
  (^com.amazonaws.services.simpleworkflow.model.WorkflowExecutionDetail [^AmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.DescribeWorkflowExecutionRequest describe-workflow-execution-request]
    (-> this (.describeWorkflowExecution describe-workflow-execution-request))))

(defn list-open-workflow-executions
  "Returns a list of open workflow executions in the specified domain that meet the filtering criteria. The results
   may be split into multiple pages. To retrieve subsequent pages, make the call again using the nextPageToken
   returned by the initial call.



   This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates
   and changes.



   Access Control


   You can use IAM policies to control this action's access to Amazon SWF resources as follows:




   Use a Resource element with the domain name to limit the action to only specified domains.




   Use an Action element to allow or deny permission to call this action.




   Constrain the following parameters by using a Condition element with the appropriate keys.




   tagFilter.tag: String constraint. The key is swf:tagFilter.tag.




   typeFilter.name: String constraint. The key is swf:typeFilter.name.




   typeFilter.version: String constraint. The key is swf:typeFilter.version.






   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
   specified constraints, the action fails. The associated event attribute's cause parameter is set to
   OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to
   Amazon SWF Workflows in the Amazon SWF Developer Guide.

  list-open-workflow-executions-request - `com.amazonaws.services.simpleworkflow.model.ListOpenWorkflowExecutionsRequest`

  returns: Result of the ListOpenWorkflowExecutions operation returned by the service. - `com.amazonaws.services.simpleworkflow.model.WorkflowExecutionInfos`

  throws: com.amazonaws.services.simpleworkflow.model.UnknownResourceException - Returned when the named resource cannot be found with in the scope of this operation (region or domain). This could happen if the named resource was never created or is no longer available for this operation."
  (^com.amazonaws.services.simpleworkflow.model.WorkflowExecutionInfos [^AmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.ListOpenWorkflowExecutionsRequest list-open-workflow-executions-request]
    (-> this (.listOpenWorkflowExecutions list-open-workflow-executions-request))))

(defn tag-resource
  "Add a tag to a Amazon SWF domain.



   Amazon SWF supports a maximum of 50 tags per resource.

  tag-resource-request - `com.amazonaws.services.simpleworkflow.model.TagResourceRequest`

  throws: com.amazonaws.services.simpleworkflow.model.UnknownResourceException - Returned when the named resource cannot be found with in the scope of this operation (region or domain). This could happen if the named resource was never created or is no longer available for this operation."
  ([^AmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

(defn register-domain
  "Registers a new domain.


   Access Control


   You can use IAM policies to control this action's access to Amazon SWF resources as follows:




   You cannot use an IAM policy to control domain access for this action. The name of the domain being registered is
   available as the resource of this action.




   Use an Action element to allow or deny permission to call this action.




   You cannot use an IAM policy to constrain this action's parameters.




   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
   specified constraints, the action fails. The associated event attribute's cause parameter is set to
   OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to
   Amazon SWF Workflows in the Amazon SWF Developer Guide.

  register-domain-request - `com.amazonaws.services.simpleworkflow.model.RegisterDomainRequest`

  throws: com.amazonaws.services.simpleworkflow.model.DomainAlreadyExistsException - Returned if the domain already exists. You may get this fault if you are registering a domain that is either already registered or deprecated, or if you undeprecate a domain that is currently registered."
  ([^AmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.RegisterDomainRequest register-domain-request]
    (-> this (.registerDomain register-domain-request))))

