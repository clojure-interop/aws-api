(ns com.amazonaws.services.athena.AbstractAmazonAthena
  "Abstract implementation of AmazonAthena. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.athena AbstractAmazonAthena]))

(defn list-tags-for-resource
  "Description copied from interface: AmazonAthena

  request - `com.amazonaws.services.athena.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.athena.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.athena.model.ListTagsForResourceResult [^AbstractAmazonAthena this ^com.amazonaws.services.athena.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn update-work-group
  "Description copied from interface: AmazonAthena

  request - `com.amazonaws.services.athena.model.UpdateWorkGroupRequest`

  returns: Result of the UpdateWorkGroup operation returned by the service. - `com.amazonaws.services.athena.model.UpdateWorkGroupResult`"
  (^com.amazonaws.services.athena.model.UpdateWorkGroupResult [^AbstractAmazonAthena this ^com.amazonaws.services.athena.model.UpdateWorkGroupRequest request]
    (-> this (.updateWorkGroup request))))

(defn stop-query-execution
  "Description copied from interface: AmazonAthena

  request - `com.amazonaws.services.athena.model.StopQueryExecutionRequest`

  returns: Result of the StopQueryExecution operation returned by the service. - `com.amazonaws.services.athena.model.StopQueryExecutionResult`"
  (^com.amazonaws.services.athena.model.StopQueryExecutionResult [^AbstractAmazonAthena this ^com.amazonaws.services.athena.model.StopQueryExecutionRequest request]
    (-> this (.stopQueryExecution request))))

(defn untag-resource
  "Description copied from interface: AmazonAthena

  request - `com.amazonaws.services.athena.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.athena.model.UntagResourceResult`"
  (^com.amazonaws.services.athena.model.UntagResourceResult [^AbstractAmazonAthena this ^com.amazonaws.services.athena.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn get-named-query
  "Description copied from interface: AmazonAthena

  request - `com.amazonaws.services.athena.model.GetNamedQueryRequest`

  returns: Result of the GetNamedQuery operation returned by the service. - `com.amazonaws.services.athena.model.GetNamedQueryResult`"
  (^com.amazonaws.services.athena.model.GetNamedQueryResult [^AbstractAmazonAthena this ^com.amazonaws.services.athena.model.GetNamedQueryRequest request]
    (-> this (.getNamedQuery request))))

(defn start-query-execution
  "Description copied from interface: AmazonAthena

  request - `com.amazonaws.services.athena.model.StartQueryExecutionRequest`

  returns: Result of the StartQueryExecution operation returned by the service. - `com.amazonaws.services.athena.model.StartQueryExecutionResult`"
  (^com.amazonaws.services.athena.model.StartQueryExecutionResult [^AbstractAmazonAthena this ^com.amazonaws.services.athena.model.StartQueryExecutionRequest request]
    (-> this (.startQueryExecution request))))

(defn get-work-group
  "Description copied from interface: AmazonAthena

  request - `com.amazonaws.services.athena.model.GetWorkGroupRequest`

  returns: Result of the GetWorkGroup operation returned by the service. - `com.amazonaws.services.athena.model.GetWorkGroupResult`"
  (^com.amazonaws.services.athena.model.GetWorkGroupResult [^AbstractAmazonAthena this ^com.amazonaws.services.athena.model.GetWorkGroupRequest request]
    (-> this (.getWorkGroup request))))

(defn batch-get-query-execution
  "Description copied from interface: AmazonAthena

  request - `com.amazonaws.services.athena.model.BatchGetQueryExecutionRequest`

  returns: Result of the BatchGetQueryExecution operation returned by the service. - `com.amazonaws.services.athena.model.BatchGetQueryExecutionResult`"
  (^com.amazonaws.services.athena.model.BatchGetQueryExecutionResult [^AbstractAmazonAthena this ^com.amazonaws.services.athena.model.BatchGetQueryExecutionRequest request]
    (-> this (.batchGetQueryExecution request))))

(defn shutdown
  "Description copied from interface: AmazonAthena"
  ([^AbstractAmazonAthena this]
    (-> this (.shutdown))))

(defn delete-work-group
  "Description copied from interface: AmazonAthena

  request - `com.amazonaws.services.athena.model.DeleteWorkGroupRequest`

  returns: Result of the DeleteWorkGroup operation returned by the service. - `com.amazonaws.services.athena.model.DeleteWorkGroupResult`"
  (^com.amazonaws.services.athena.model.DeleteWorkGroupResult [^AbstractAmazonAthena this ^com.amazonaws.services.athena.model.DeleteWorkGroupRequest request]
    (-> this (.deleteWorkGroup request))))

(defn list-named-queries
  "Description copied from interface: AmazonAthena

  request - `com.amazonaws.services.athena.model.ListNamedQueriesRequest`

  returns: Result of the ListNamedQueries operation returned by the service. - `com.amazonaws.services.athena.model.ListNamedQueriesResult`"
  (^com.amazonaws.services.athena.model.ListNamedQueriesResult [^AbstractAmazonAthena this ^com.amazonaws.services.athena.model.ListNamedQueriesRequest request]
    (-> this (.listNamedQueries request))))

(defn batch-get-named-query
  "Description copied from interface: AmazonAthena

  request - `com.amazonaws.services.athena.model.BatchGetNamedQueryRequest`

  returns: Result of the BatchGetNamedQuery operation returned by the service. - `com.amazonaws.services.athena.model.BatchGetNamedQueryResult`"
  (^com.amazonaws.services.athena.model.BatchGetNamedQueryResult [^AbstractAmazonAthena this ^com.amazonaws.services.athena.model.BatchGetNamedQueryRequest request]
    (-> this (.batchGetNamedQuery request))))

(defn get-query-execution
  "Description copied from interface: AmazonAthena

  request - `com.amazonaws.services.athena.model.GetQueryExecutionRequest`

  returns: Result of the GetQueryExecution operation returned by the service. - `com.amazonaws.services.athena.model.GetQueryExecutionResult`"
  (^com.amazonaws.services.athena.model.GetQueryExecutionResult [^AbstractAmazonAthena this ^com.amazonaws.services.athena.model.GetQueryExecutionRequest request]
    (-> this (.getQueryExecution request))))

(defn get-query-results
  "Description copied from interface: AmazonAthena

  request - `com.amazonaws.services.athena.model.GetQueryResultsRequest`

  returns: Result of the GetQueryResults operation returned by the service. - `com.amazonaws.services.athena.model.GetQueryResultsResult`"
  (^com.amazonaws.services.athena.model.GetQueryResultsResult [^AbstractAmazonAthena this ^com.amazonaws.services.athena.model.GetQueryResultsRequest request]
    (-> this (.getQueryResults request))))

(defn list-work-groups
  "Description copied from interface: AmazonAthena

  request - `com.amazonaws.services.athena.model.ListWorkGroupsRequest`

  returns: Result of the ListWorkGroups operation returned by the service. - `com.amazonaws.services.athena.model.ListWorkGroupsResult`"
  (^com.amazonaws.services.athena.model.ListWorkGroupsResult [^AbstractAmazonAthena this ^com.amazonaws.services.athena.model.ListWorkGroupsRequest request]
    (-> this (.listWorkGroups request))))

(defn create-work-group
  "Description copied from interface: AmazonAthena

  request - `com.amazonaws.services.athena.model.CreateWorkGroupRequest`

  returns: Result of the CreateWorkGroup operation returned by the service. - `com.amazonaws.services.athena.model.CreateWorkGroupResult`"
  (^com.amazonaws.services.athena.model.CreateWorkGroupResult [^AbstractAmazonAthena this ^com.amazonaws.services.athena.model.CreateWorkGroupRequest request]
    (-> this (.createWorkGroup request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonAthena

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonAthena this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn list-query-executions
  "Description copied from interface: AmazonAthena

  request - `com.amazonaws.services.athena.model.ListQueryExecutionsRequest`

  returns: Result of the ListQueryExecutions operation returned by the service. - `com.amazonaws.services.athena.model.ListQueryExecutionsResult`"
  (^com.amazonaws.services.athena.model.ListQueryExecutionsResult [^AbstractAmazonAthena this ^com.amazonaws.services.athena.model.ListQueryExecutionsRequest request]
    (-> this (.listQueryExecutions request))))

(defn tag-resource
  "Description copied from interface: AmazonAthena

  request - `com.amazonaws.services.athena.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.athena.model.TagResourceResult`"
  (^com.amazonaws.services.athena.model.TagResourceResult [^AbstractAmazonAthena this ^com.amazonaws.services.athena.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn create-named-query
  "Description copied from interface: AmazonAthena

  request - `com.amazonaws.services.athena.model.CreateNamedQueryRequest`

  returns: Result of the CreateNamedQuery operation returned by the service. - `com.amazonaws.services.athena.model.CreateNamedQueryResult`"
  (^com.amazonaws.services.athena.model.CreateNamedQueryResult [^AbstractAmazonAthena this ^com.amazonaws.services.athena.model.CreateNamedQueryRequest request]
    (-> this (.createNamedQuery request))))

(defn delete-named-query
  "Description copied from interface: AmazonAthena

  request - `com.amazonaws.services.athena.model.DeleteNamedQueryRequest`

  returns: Result of the DeleteNamedQuery operation returned by the service. - `com.amazonaws.services.athena.model.DeleteNamedQueryResult`"
  (^com.amazonaws.services.athena.model.DeleteNamedQueryResult [^AbstractAmazonAthena this ^com.amazonaws.services.athena.model.DeleteNamedQueryRequest request]
    (-> this (.deleteNamedQuery request))))

