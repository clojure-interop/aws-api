(ns com.amazonaws.services.simpleworkflow.AbstractAmazonSimpleWorkflow
  "Abstract implementation of AmazonSimpleWorkflow. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.simpleworkflow AbstractAmazonSimpleWorkflow]))

(defn register-workflow-type
  "Description copied from interface: AmazonSimpleWorkflow

  request - `com.amazonaws.services.simpleworkflow.model.RegisterWorkflowTypeRequest`"
  ([^AbstractAmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.RegisterWorkflowTypeRequest request]
    (-> this (.registerWorkflowType request))))

(defn list-tags-for-resource
  "Description copied from interface: AmazonSimpleWorkflow

  request - `com.amazonaws.services.simpleworkflow.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.simpleworkflow.model.ListTagsForResourceOutput`"
  (^com.amazonaws.services.simpleworkflow.model.ListTagsForResourceOutput [^AbstractAmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn describe-activity-type
  "Description copied from interface: AmazonSimpleWorkflow

  request - `com.amazonaws.services.simpleworkflow.model.DescribeActivityTypeRequest`

  returns: Result of the DescribeActivityType operation returned by the service. - `com.amazonaws.services.simpleworkflow.model.ActivityTypeDetail`"
  (^com.amazonaws.services.simpleworkflow.model.ActivityTypeDetail [^AbstractAmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.DescribeActivityTypeRequest request]
    (-> this (.describeActivityType request))))

(defn set-region
  "Description copied from interface: AmazonSimpleWorkflow

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonSimpleWorkflow this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn respond-activity-task-completed
  "Description copied from interface: AmazonSimpleWorkflow

  request - `com.amazonaws.services.simpleworkflow.model.RespondActivityTaskCompletedRequest`"
  ([^AbstractAmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.RespondActivityTaskCompletedRequest request]
    (-> this (.respondActivityTaskCompleted request))))

(defn start-workflow-execution
  "Description copied from interface: AmazonSimpleWorkflow

  request - `com.amazonaws.services.simpleworkflow.model.StartWorkflowExecutionRequest`

  returns: Result of the StartWorkflowExecution operation returned by the service. - `com.amazonaws.services.simpleworkflow.model.Run`"
  (^com.amazonaws.services.simpleworkflow.model.Run [^AbstractAmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.StartWorkflowExecutionRequest request]
    (-> this (.startWorkflowExecution request))))

(defn count-pending-activity-tasks
  "Description copied from interface: AmazonSimpleWorkflow

  request - `com.amazonaws.services.simpleworkflow.model.CountPendingActivityTasksRequest`

  returns: Result of the CountPendingActivityTasks operation returned by the service. - `com.amazonaws.services.simpleworkflow.model.PendingTaskCount`"
  (^com.amazonaws.services.simpleworkflow.model.PendingTaskCount [^AbstractAmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.CountPendingActivityTasksRequest request]
    (-> this (.countPendingActivityTasks request))))

(defn signal-workflow-execution
  "Description copied from interface: AmazonSimpleWorkflow

  request - `com.amazonaws.services.simpleworkflow.model.SignalWorkflowExecutionRequest`"
  ([^AbstractAmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.SignalWorkflowExecutionRequest request]
    (-> this (.signalWorkflowExecution request))))

(defn describe-workflow-type
  "Description copied from interface: AmazonSimpleWorkflow

  request - `com.amazonaws.services.simpleworkflow.model.DescribeWorkflowTypeRequest`

  returns: Result of the DescribeWorkflowType operation returned by the service. - `com.amazonaws.services.simpleworkflow.model.WorkflowTypeDetail`"
  (^com.amazonaws.services.simpleworkflow.model.WorkflowTypeDetail [^AbstractAmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.DescribeWorkflowTypeRequest request]
    (-> this (.describeWorkflowType request))))

(defn deprecate-workflow-type
  "Description copied from interface: AmazonSimpleWorkflow

  request - `com.amazonaws.services.simpleworkflow.model.DeprecateWorkflowTypeRequest`"
  ([^AbstractAmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.DeprecateWorkflowTypeRequest request]
    (-> this (.deprecateWorkflowType request))))

(defn untag-resource
  "Description copied from interface: AmazonSimpleWorkflow

  request - `com.amazonaws.services.simpleworkflow.model.UntagResourceRequest`"
  ([^AbstractAmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn undeprecate-workflow-type
  "Description copied from interface: AmazonSimpleWorkflow

  request - `com.amazonaws.services.simpleworkflow.model.UndeprecateWorkflowTypeRequest`"
  ([^AbstractAmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.UndeprecateWorkflowTypeRequest request]
    (-> this (.undeprecateWorkflowType request))))

(defn respond-activity-task-failed
  "Description copied from interface: AmazonSimpleWorkflow

  request - `com.amazonaws.services.simpleworkflow.model.RespondActivityTaskFailedRequest`"
  ([^AbstractAmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.RespondActivityTaskFailedRequest request]
    (-> this (.respondActivityTaskFailed request))))

(defn request-cancel-workflow-execution
  "Description copied from interface: AmazonSimpleWorkflow

  request - `com.amazonaws.services.simpleworkflow.model.RequestCancelWorkflowExecutionRequest`"
  ([^AbstractAmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.RequestCancelWorkflowExecutionRequest request]
    (-> this (.requestCancelWorkflowExecution request))))

(defn respond-decision-task-completed
  "Description copied from interface: AmazonSimpleWorkflow

  request - Input data for a TaskCompleted response to a decision task. - `com.amazonaws.services.simpleworkflow.model.RespondDecisionTaskCompletedRequest`"
  ([^AbstractAmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.RespondDecisionTaskCompletedRequest request]
    (-> this (.respondDecisionTaskCompleted request))))

(defn list-closed-workflow-executions
  "Description copied from interface: AmazonSimpleWorkflow

  request - `com.amazonaws.services.simpleworkflow.model.ListClosedWorkflowExecutionsRequest`

  returns: Result of the ListClosedWorkflowExecutions operation returned by the service. - `com.amazonaws.services.simpleworkflow.model.WorkflowExecutionInfos`"
  (^com.amazonaws.services.simpleworkflow.model.WorkflowExecutionInfos [^AbstractAmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.ListClosedWorkflowExecutionsRequest request]
    (-> this (.listClosedWorkflowExecutions request))))

(defn list-activity-types
  "Description copied from interface: AmazonSimpleWorkflow

  request - `com.amazonaws.services.simpleworkflow.model.ListActivityTypesRequest`

  returns: Result of the ListActivityTypes operation returned by the service. - `com.amazonaws.services.simpleworkflow.model.ActivityTypeInfos`"
  (^com.amazonaws.services.simpleworkflow.model.ActivityTypeInfos [^AbstractAmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.ListActivityTypesRequest request]
    (-> this (.listActivityTypes request))))

(defn undeprecate-domain
  "Description copied from interface: AmazonSimpleWorkflow

  request - `com.amazonaws.services.simpleworkflow.model.UndeprecateDomainRequest`"
  ([^AbstractAmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.UndeprecateDomainRequest request]
    (-> this (.undeprecateDomain request))))

(defn deprecate-domain
  "Description copied from interface: AmazonSimpleWorkflow

  request - `com.amazonaws.services.simpleworkflow.model.DeprecateDomainRequest`"
  ([^AbstractAmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.DeprecateDomainRequest request]
    (-> this (.deprecateDomain request))))

(defn poll-for-decision-task
  "Description copied from interface: AmazonSimpleWorkflow

  request - `com.amazonaws.services.simpleworkflow.model.PollForDecisionTaskRequest`

  returns: Result of the PollForDecisionTask operation returned by the service. - `com.amazonaws.services.simpleworkflow.model.DecisionTask`"
  (^com.amazonaws.services.simpleworkflow.model.DecisionTask [^AbstractAmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.PollForDecisionTaskRequest request]
    (-> this (.pollForDecisionTask request))))

(defn shutdown
  "Description copied from interface: AmazonSimpleWorkflow"
  ([^AbstractAmazonSimpleWorkflow this]
    (-> this (.shutdown))))

(defn terminate-workflow-execution
  "Description copied from interface: AmazonSimpleWorkflow

  request - `com.amazonaws.services.simpleworkflow.model.TerminateWorkflowExecutionRequest`"
  ([^AbstractAmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.TerminateWorkflowExecutionRequest request]
    (-> this (.terminateWorkflowExecution request))))

(defn register-activity-type
  "Description copied from interface: AmazonSimpleWorkflow

  request - `com.amazonaws.services.simpleworkflow.model.RegisterActivityTypeRequest`"
  ([^AbstractAmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.RegisterActivityTypeRequest request]
    (-> this (.registerActivityType request))))

(defn list-domains
  "Description copied from interface: AmazonSimpleWorkflow

  request - `com.amazonaws.services.simpleworkflow.model.ListDomainsRequest`

  returns: Result of the ListDomains operation returned by the service. - `com.amazonaws.services.simpleworkflow.model.DomainInfos`"
  (^com.amazonaws.services.simpleworkflow.model.DomainInfos [^AbstractAmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.ListDomainsRequest request]
    (-> this (.listDomains request))))

(defn set-endpoint
  "Description copied from interface: AmazonSimpleWorkflow

  endpoint - The endpoint (ex: \"swf.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"swf.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonSimpleWorkflow this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn count-pending-decision-tasks
  "Description copied from interface: AmazonSimpleWorkflow

  request - `com.amazonaws.services.simpleworkflow.model.CountPendingDecisionTasksRequest`

  returns: Result of the CountPendingDecisionTasks operation returned by the service. - `com.amazonaws.services.simpleworkflow.model.PendingTaskCount`"
  (^com.amazonaws.services.simpleworkflow.model.PendingTaskCount [^AbstractAmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.CountPendingDecisionTasksRequest request]
    (-> this (.countPendingDecisionTasks request))))

(defn respond-activity-task-canceled
  "Description copied from interface: AmazonSimpleWorkflow

  request - `com.amazonaws.services.simpleworkflow.model.RespondActivityTaskCanceledRequest`"
  ([^AbstractAmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.RespondActivityTaskCanceledRequest request]
    (-> this (.respondActivityTaskCanceled request))))

(defn describe-domain
  "Description copied from interface: AmazonSimpleWorkflow

  request - `com.amazonaws.services.simpleworkflow.model.DescribeDomainRequest`

  returns: Result of the DescribeDomain operation returned by the service. - `com.amazonaws.services.simpleworkflow.model.DomainDetail`"
  (^com.amazonaws.services.simpleworkflow.model.DomainDetail [^AbstractAmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.DescribeDomainRequest request]
    (-> this (.describeDomain request))))

(defn deprecate-activity-type
  "Description copied from interface: AmazonSimpleWorkflow

  request - `com.amazonaws.services.simpleworkflow.model.DeprecateActivityTypeRequest`"
  ([^AbstractAmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.DeprecateActivityTypeRequest request]
    (-> this (.deprecateActivityType request))))

(defn get-workflow-execution-history
  "Description copied from interface: AmazonSimpleWorkflow

  request - `com.amazonaws.services.simpleworkflow.model.GetWorkflowExecutionHistoryRequest`

  returns: Result of the GetWorkflowExecutionHistory operation returned by the service. - `com.amazonaws.services.simpleworkflow.model.History`"
  (^com.amazonaws.services.simpleworkflow.model.History [^AbstractAmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.GetWorkflowExecutionHistoryRequest request]
    (-> this (.getWorkflowExecutionHistory request))))

(defn count-closed-workflow-executions
  "Description copied from interface: AmazonSimpleWorkflow

  request - `com.amazonaws.services.simpleworkflow.model.CountClosedWorkflowExecutionsRequest`

  returns: Result of the CountClosedWorkflowExecutions operation returned by the service. - `com.amazonaws.services.simpleworkflow.model.WorkflowExecutionCount`"
  (^com.amazonaws.services.simpleworkflow.model.WorkflowExecutionCount [^AbstractAmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.CountClosedWorkflowExecutionsRequest request]
    (-> this (.countClosedWorkflowExecutions request))))

(defn poll-for-activity-task
  "Description copied from interface: AmazonSimpleWorkflow

  request - `com.amazonaws.services.simpleworkflow.model.PollForActivityTaskRequest`

  returns: Result of the PollForActivityTask operation returned by the service. - `com.amazonaws.services.simpleworkflow.model.ActivityTask`"
  (^com.amazonaws.services.simpleworkflow.model.ActivityTask [^AbstractAmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.PollForActivityTaskRequest request]
    (-> this (.pollForActivityTask request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonSimpleWorkflow

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonSimpleWorkflow this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn count-open-workflow-executions
  "Description copied from interface: AmazonSimpleWorkflow

  request - `com.amazonaws.services.simpleworkflow.model.CountOpenWorkflowExecutionsRequest`

  returns: Result of the CountOpenWorkflowExecutions operation returned by the service. - `com.amazonaws.services.simpleworkflow.model.WorkflowExecutionCount`"
  (^com.amazonaws.services.simpleworkflow.model.WorkflowExecutionCount [^AbstractAmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.CountOpenWorkflowExecutionsRequest request]
    (-> this (.countOpenWorkflowExecutions request))))

(defn list-workflow-types
  "Description copied from interface: AmazonSimpleWorkflow

  request - `com.amazonaws.services.simpleworkflow.model.ListWorkflowTypesRequest`

  returns: Result of the ListWorkflowTypes operation returned by the service. - `com.amazonaws.services.simpleworkflow.model.WorkflowTypeInfos`"
  (^com.amazonaws.services.simpleworkflow.model.WorkflowTypeInfos [^AbstractAmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.ListWorkflowTypesRequest request]
    (-> this (.listWorkflowTypes request))))

(defn undeprecate-activity-type
  "Description copied from interface: AmazonSimpleWorkflow

  request - `com.amazonaws.services.simpleworkflow.model.UndeprecateActivityTypeRequest`"
  ([^AbstractAmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.UndeprecateActivityTypeRequest request]
    (-> this (.undeprecateActivityType request))))

(defn record-activity-task-heartbeat
  "Description copied from interface: AmazonSimpleWorkflow

  request - `com.amazonaws.services.simpleworkflow.model.RecordActivityTaskHeartbeatRequest`

  returns: Result of the RecordActivityTaskHeartbeat operation returned by the service. - `com.amazonaws.services.simpleworkflow.model.ActivityTaskStatus`"
  (^com.amazonaws.services.simpleworkflow.model.ActivityTaskStatus [^AbstractAmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.RecordActivityTaskHeartbeatRequest request]
    (-> this (.recordActivityTaskHeartbeat request))))

(defn describe-workflow-execution
  "Description copied from interface: AmazonSimpleWorkflow

  request - `com.amazonaws.services.simpleworkflow.model.DescribeWorkflowExecutionRequest`

  returns: Result of the DescribeWorkflowExecution operation returned by the service. - `com.amazonaws.services.simpleworkflow.model.WorkflowExecutionDetail`"
  (^com.amazonaws.services.simpleworkflow.model.WorkflowExecutionDetail [^AbstractAmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.DescribeWorkflowExecutionRequest request]
    (-> this (.describeWorkflowExecution request))))

(defn list-open-workflow-executions
  "Description copied from interface: AmazonSimpleWorkflow

  request - `com.amazonaws.services.simpleworkflow.model.ListOpenWorkflowExecutionsRequest`

  returns: Result of the ListOpenWorkflowExecutions operation returned by the service. - `com.amazonaws.services.simpleworkflow.model.WorkflowExecutionInfos`"
  (^com.amazonaws.services.simpleworkflow.model.WorkflowExecutionInfos [^AbstractAmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.ListOpenWorkflowExecutionsRequest request]
    (-> this (.listOpenWorkflowExecutions request))))

(defn tag-resource
  "Description copied from interface: AmazonSimpleWorkflow

  request - `com.amazonaws.services.simpleworkflow.model.TagResourceRequest`"
  ([^AbstractAmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn register-domain
  "Description copied from interface: AmazonSimpleWorkflow

  request - `com.amazonaws.services.simpleworkflow.model.RegisterDomainRequest`"
  ([^AbstractAmazonSimpleWorkflow this ^com.amazonaws.services.simpleworkflow.model.RegisterDomainRequest request]
    (-> this (.registerDomain request))))

