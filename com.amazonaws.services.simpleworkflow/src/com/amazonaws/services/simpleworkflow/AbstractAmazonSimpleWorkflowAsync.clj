(ns com.amazonaws.services.simpleworkflow.AbstractAmazonSimpleWorkflowAsync
  "Abstract implementation of AmazonSimpleWorkflowAsync. Convenient method forms pass through to the
  corresponding overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.simpleworkflow AbstractAmazonSimpleWorkflowAsync]))

(defn register-activity-type-async
  "Description copied from interface: AmazonSimpleWorkflowAsync

  request - `com.amazonaws.services.simpleworkflow.model.RegisterActivityTypeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<java.lang.Void>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.RegisterActivityTypeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerActivityTypeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.RegisterActivityTypeRequest request]
    (-> this (.registerActivityTypeAsync request))))

(defn untag-resource-async
  "Description copied from interface: AmazonSimpleWorkflowAsync

  request - `com.amazonaws.services.simpleworkflow.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<java.lang.Void>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn deprecate-workflow-type-async
  "Description copied from interface: AmazonSimpleWorkflowAsync

  request - `com.amazonaws.services.simpleworkflow.model.DeprecateWorkflowTypeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<java.lang.Void>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.DeprecateWorkflowTypeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deprecateWorkflowTypeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.DeprecateWorkflowTypeRequest request]
    (-> this (.deprecateWorkflowTypeAsync request))))

(defn poll-for-activity-task-async
  "Description copied from interface: AmazonSimpleWorkflowAsync

  request - `com.amazonaws.services.simpleworkflow.model.PollForActivityTaskRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PollForActivityTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleworkflow.model.ActivityTask>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.PollForActivityTaskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.pollForActivityTaskAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.PollForActivityTaskRequest request]
    (-> this (.pollForActivityTaskAsync request))))

(defn start-workflow-execution-async
  "Description copied from interface: AmazonSimpleWorkflowAsync

  request - `com.amazonaws.services.simpleworkflow.model.StartWorkflowExecutionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartWorkflowExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleworkflow.model.Run>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.StartWorkflowExecutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startWorkflowExecutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.StartWorkflowExecutionRequest request]
    (-> this (.startWorkflowExecutionAsync request))))

(defn respond-activity-task-completed-async
  "Description copied from interface: AmazonSimpleWorkflowAsync

  request - `com.amazonaws.services.simpleworkflow.model.RespondActivityTaskCompletedRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<java.lang.Void>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.RespondActivityTaskCompletedRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.respondActivityTaskCompletedAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.RespondActivityTaskCompletedRequest request]
    (-> this (.respondActivityTaskCompletedAsync request))))

(defn poll-for-decision-task-async
  "Description copied from interface: AmazonSimpleWorkflowAsync

  request - `com.amazonaws.services.simpleworkflow.model.PollForDecisionTaskRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PollForDecisionTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleworkflow.model.DecisionTask>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.PollForDecisionTaskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.pollForDecisionTaskAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.PollForDecisionTaskRequest request]
    (-> this (.pollForDecisionTaskAsync request))))

(defn describe-activity-type-async
  "Description copied from interface: AmazonSimpleWorkflowAsync

  request - `com.amazonaws.services.simpleworkflow.model.DescribeActivityTypeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeActivityType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleworkflow.model.ActivityTypeDetail>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.DescribeActivityTypeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeActivityTypeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.DescribeActivityTypeRequest request]
    (-> this (.describeActivityTypeAsync request))))

(defn register-workflow-type-async
  "Description copied from interface: AmazonSimpleWorkflowAsync

  request - `com.amazonaws.services.simpleworkflow.model.RegisterWorkflowTypeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<java.lang.Void>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.RegisterWorkflowTypeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerWorkflowTypeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.RegisterWorkflowTypeRequest request]
    (-> this (.registerWorkflowTypeAsync request))))

(defn count-open-workflow-executions-async
  "Description copied from interface: AmazonSimpleWorkflowAsync

  request - `com.amazonaws.services.simpleworkflow.model.CountOpenWorkflowExecutionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CountOpenWorkflowExecutions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleworkflow.model.WorkflowExecutionCount>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.CountOpenWorkflowExecutionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.countOpenWorkflowExecutionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.CountOpenWorkflowExecutionsRequest request]
    (-> this (.countOpenWorkflowExecutionsAsync request))))

(defn terminate-workflow-execution-async
  "Description copied from interface: AmazonSimpleWorkflowAsync

  request - `com.amazonaws.services.simpleworkflow.model.TerminateWorkflowExecutionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<java.lang.Void>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.TerminateWorkflowExecutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.terminateWorkflowExecutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.TerminateWorkflowExecutionRequest request]
    (-> this (.terminateWorkflowExecutionAsync request))))

(defn get-workflow-execution-history-async
  "Description copied from interface: AmazonSimpleWorkflowAsync

  request - `com.amazonaws.services.simpleworkflow.model.GetWorkflowExecutionHistoryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetWorkflowExecutionHistory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleworkflow.model.History>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.GetWorkflowExecutionHistoryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getWorkflowExecutionHistoryAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.GetWorkflowExecutionHistoryRequest request]
    (-> this (.getWorkflowExecutionHistoryAsync request))))

(defn respond-decision-task-completed-async
  "Description copied from interface: AmazonSimpleWorkflowAsync

  request - Input data for a TaskCompleted response to a decision task. - `com.amazonaws.services.simpleworkflow.model.RespondDecisionTaskCompletedRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<java.lang.Void>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.RespondDecisionTaskCompletedRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.respondDecisionTaskCompletedAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.RespondDecisionTaskCompletedRequest request]
    (-> this (.respondDecisionTaskCompletedAsync request))))

(defn count-pending-decision-tasks-async
  "Description copied from interface: AmazonSimpleWorkflowAsync

  request - `com.amazonaws.services.simpleworkflow.model.CountPendingDecisionTasksRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CountPendingDecisionTasks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleworkflow.model.PendingTaskCount>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.CountPendingDecisionTasksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.countPendingDecisionTasksAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.CountPendingDecisionTasksRequest request]
    (-> this (.countPendingDecisionTasksAsync request))))

(defn count-pending-activity-tasks-async
  "Description copied from interface: AmazonSimpleWorkflowAsync

  request - `com.amazonaws.services.simpleworkflow.model.CountPendingActivityTasksRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CountPendingActivityTasks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleworkflow.model.PendingTaskCount>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.CountPendingActivityTasksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.countPendingActivityTasksAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.CountPendingActivityTasksRequest request]
    (-> this (.countPendingActivityTasksAsync request))))

(defn deprecate-domain-async
  "Description copied from interface: AmazonSimpleWorkflowAsync

  request - `com.amazonaws.services.simpleworkflow.model.DeprecateDomainRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<java.lang.Void>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.DeprecateDomainRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deprecateDomainAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.DeprecateDomainRequest request]
    (-> this (.deprecateDomainAsync request))))

(defn list-workflow-types-async
  "Description copied from interface: AmazonSimpleWorkflowAsync

  request - `com.amazonaws.services.simpleworkflow.model.ListWorkflowTypesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListWorkflowTypes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleworkflow.model.WorkflowTypeInfos>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.ListWorkflowTypesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listWorkflowTypesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.ListWorkflowTypesRequest request]
    (-> this (.listWorkflowTypesAsync request))))

(defn respond-activity-task-failed-async
  "Description copied from interface: AmazonSimpleWorkflowAsync

  request - `com.amazonaws.services.simpleworkflow.model.RespondActivityTaskFailedRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<java.lang.Void>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.RespondActivityTaskFailedRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.respondActivityTaskFailedAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.RespondActivityTaskFailedRequest request]
    (-> this (.respondActivityTaskFailedAsync request))))

(defn request-cancel-workflow-execution-async
  "Description copied from interface: AmazonSimpleWorkflowAsync

  request - `com.amazonaws.services.simpleworkflow.model.RequestCancelWorkflowExecutionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<java.lang.Void>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.RequestCancelWorkflowExecutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.requestCancelWorkflowExecutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.RequestCancelWorkflowExecutionRequest request]
    (-> this (.requestCancelWorkflowExecutionAsync request))))

(defn register-domain-async
  "Description copied from interface: AmazonSimpleWorkflowAsync

  request - `com.amazonaws.services.simpleworkflow.model.RegisterDomainRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<java.lang.Void>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.RegisterDomainRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerDomainAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.RegisterDomainRequest request]
    (-> this (.registerDomainAsync request))))

(defn describe-domain-async
  "Description copied from interface: AmazonSimpleWorkflowAsync

  request - `com.amazonaws.services.simpleworkflow.model.DescribeDomainRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleworkflow.model.DomainDetail>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.DescribeDomainRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDomainAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.DescribeDomainRequest request]
    (-> this (.describeDomainAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AmazonSimpleWorkflowAsync

  request - `com.amazonaws.services.simpleworkflow.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleworkflow.model.ListTagsForResourceOutput>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn deprecate-activity-type-async
  "Description copied from interface: AmazonSimpleWorkflowAsync

  request - `com.amazonaws.services.simpleworkflow.model.DeprecateActivityTypeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<java.lang.Void>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.DeprecateActivityTypeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deprecateActivityTypeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.DeprecateActivityTypeRequest request]
    (-> this (.deprecateActivityTypeAsync request))))

(defn list-open-workflow-executions-async
  "Description copied from interface: AmazonSimpleWorkflowAsync

  request - `com.amazonaws.services.simpleworkflow.model.ListOpenWorkflowExecutionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListOpenWorkflowExecutions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleworkflow.model.WorkflowExecutionInfos>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.ListOpenWorkflowExecutionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listOpenWorkflowExecutionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.ListOpenWorkflowExecutionsRequest request]
    (-> this (.listOpenWorkflowExecutionsAsync request))))

(defn count-closed-workflow-executions-async
  "Description copied from interface: AmazonSimpleWorkflowAsync

  request - `com.amazonaws.services.simpleworkflow.model.CountClosedWorkflowExecutionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CountClosedWorkflowExecutions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simpleworkflow.model.WorkflowExecutionCount>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.CountClosedWorkflowExecutionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.countClosedWorkflowExecutionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.CountClosedWorkflowExecutionsRequest request]
    (-> this (.countClosedWorkflowExecutionsAsync request))))

(defn respond-activity-task-canceled-async
  "Description copied from interface: AmazonSimpleWorkflowAsync

  request - `com.amazonaws.services.simpleworkflow.model.RespondActivityTaskCanceledRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<java.lang.Void>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.RespondActivityTaskCanceledRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.respondActivityTaskCanceledAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.RespondActivityTaskCanceledRequest request]
    (-> this (.respondActivityTaskCanceledAsync request))))

(defn describe-workflow-execution-async
  "Description copied from interface: AmazonSimpleWorkflowAsync

  request - `com.amazonaws.services.simpleworkflow.model.DescribeWorkflowExecutionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeWorkflowExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleworkflow.model.WorkflowExecutionDetail>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.DescribeWorkflowExecutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeWorkflowExecutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.DescribeWorkflowExecutionRequest request]
    (-> this (.describeWorkflowExecutionAsync request))))

(defn undeprecate-domain-async
  "Description copied from interface: AmazonSimpleWorkflowAsync

  request - `com.amazonaws.services.simpleworkflow.model.UndeprecateDomainRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<java.lang.Void>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.UndeprecateDomainRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.undeprecateDomainAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.UndeprecateDomainRequest request]
    (-> this (.undeprecateDomainAsync request))))

(defn signal-workflow-execution-async
  "Description copied from interface: AmazonSimpleWorkflowAsync

  request - `com.amazonaws.services.simpleworkflow.model.SignalWorkflowExecutionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<java.lang.Void>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.SignalWorkflowExecutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.signalWorkflowExecutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.SignalWorkflowExecutionRequest request]
    (-> this (.signalWorkflowExecutionAsync request))))

(defn list-activity-types-async
  "Description copied from interface: AmazonSimpleWorkflowAsync

  request - `com.amazonaws.services.simpleworkflow.model.ListActivityTypesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListActivityTypes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleworkflow.model.ActivityTypeInfos>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.ListActivityTypesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listActivityTypesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.ListActivityTypesRequest request]
    (-> this (.listActivityTypesAsync request))))

(defn list-domains-async
  "Description copied from interface: AmazonSimpleWorkflowAsync

  request - `com.amazonaws.services.simpleworkflow.model.ListDomainsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDomains operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleworkflow.model.DomainInfos>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.ListDomainsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDomainsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.ListDomainsRequest request]
    (-> this (.listDomainsAsync request))))

(defn undeprecate-activity-type-async
  "Description copied from interface: AmazonSimpleWorkflowAsync

  request - `com.amazonaws.services.simpleworkflow.model.UndeprecateActivityTypeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<java.lang.Void>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.UndeprecateActivityTypeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.undeprecateActivityTypeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.UndeprecateActivityTypeRequest request]
    (-> this (.undeprecateActivityTypeAsync request))))

(defn undeprecate-workflow-type-async
  "Description copied from interface: AmazonSimpleWorkflowAsync

  request - `com.amazonaws.services.simpleworkflow.model.UndeprecateWorkflowTypeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<java.lang.Void>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.UndeprecateWorkflowTypeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.undeprecateWorkflowTypeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.UndeprecateWorkflowTypeRequest request]
    (-> this (.undeprecateWorkflowTypeAsync request))))

(defn tag-resource-async
  "Description copied from interface: AmazonSimpleWorkflowAsync

  request - `com.amazonaws.services.simpleworkflow.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<java.lang.Void>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn describe-workflow-type-async
  "Description copied from interface: AmazonSimpleWorkflowAsync

  request - `com.amazonaws.services.simpleworkflow.model.DescribeWorkflowTypeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeWorkflowType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleworkflow.model.WorkflowTypeDetail>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.DescribeWorkflowTypeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeWorkflowTypeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.DescribeWorkflowTypeRequest request]
    (-> this (.describeWorkflowTypeAsync request))))

(defn list-closed-workflow-executions-async
  "Description copied from interface: AmazonSimpleWorkflowAsync

  request - `com.amazonaws.services.simpleworkflow.model.ListClosedWorkflowExecutionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListClosedWorkflowExecutions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simpleworkflow.model.WorkflowExecutionInfos>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.ListClosedWorkflowExecutionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listClosedWorkflowExecutionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.ListClosedWorkflowExecutionsRequest request]
    (-> this (.listClosedWorkflowExecutionsAsync request))))

(defn record-activity-task-heartbeat-async
  "Description copied from interface: AmazonSimpleWorkflowAsync

  request - `com.amazonaws.services.simpleworkflow.model.RecordActivityTaskHeartbeatRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RecordActivityTaskHeartbeat operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleworkflow.model.ActivityTaskStatus>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.RecordActivityTaskHeartbeatRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.recordActivityTaskHeartbeatAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleWorkflowAsync this ^com.amazonaws.services.simpleworkflow.model.RecordActivityTaskHeartbeatRequest request]
    (-> this (.recordActivityTaskHeartbeatAsync request))))

