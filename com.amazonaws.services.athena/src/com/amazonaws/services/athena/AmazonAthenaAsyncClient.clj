(ns com.amazonaws.services.athena.AmazonAthenaAsyncClient
  "Client for accessing Amazon Athena asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.


  Amazon Athena is an interactive query service that lets you use standard SQL to analyze data directly in Amazon S3.
  You can point Athena at your data in Amazon S3 and run ad-hoc queries and get results in seconds. Athena is
  serverless, so there is no infrastructure to set up or manage. You pay only for the queries you run. Athena scales
  automatically—executing queries in parallel—so results are fast, even with large datasets and complex queries. For
  more information, see What is Amazon Athena in
  the Amazon Athena User Guide.


  If you connect to Athena using the JDBC driver, use version 1.1.0 of the driver or later with the Amazon Athena API.
  Earlier version drivers do not support the API. For more information and to download the driver, see Accessing Amazon Athena with JDBC.


  For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon
  Athena User Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.athena AmazonAthenaAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.athena.AmazonAthenaAsyncClientBuilder`"
  (^com.amazonaws.services.athena.AmazonAthenaAsyncClientBuilder []
    (AmazonAthenaAsyncClient/asyncBuilder )))

(defn untag-resource-async
  "Description copied from interface: AmazonAthenaAsync

  request - `com.amazonaws.services.athena.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.athena.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonAthenaAsyncClient this ^com.amazonaws.services.athena.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAthenaAsyncClient this ^com.amazonaws.services.athena.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn batch-get-query-execution-async
  "Description copied from interface: AmazonAthenaAsync

  request - `com.amazonaws.services.athena.model.BatchGetQueryExecutionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetQueryExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.athena.model.BatchGetQueryExecutionResult>`"
  (^java.util.concurrent.Future [^AmazonAthenaAsyncClient this ^com.amazonaws.services.athena.model.BatchGetQueryExecutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetQueryExecutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAthenaAsyncClient this ^com.amazonaws.services.athena.model.BatchGetQueryExecutionRequest request]
    (-> this (.batchGetQueryExecutionAsync request))))

(defn list-query-executions-async
  "Description copied from interface: AmazonAthenaAsync

  request - `com.amazonaws.services.athena.model.ListQueryExecutionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListQueryExecutions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.athena.model.ListQueryExecutionsResult>`"
  (^java.util.concurrent.Future [^AmazonAthenaAsyncClient this ^com.amazonaws.services.athena.model.ListQueryExecutionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listQueryExecutionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAthenaAsyncClient this ^com.amazonaws.services.athena.model.ListQueryExecutionsRequest request]
    (-> this (.listQueryExecutionsAsync request))))

(defn update-work-group-async
  "Description copied from interface: AmazonAthenaAsync

  request - `com.amazonaws.services.athena.model.UpdateWorkGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateWorkGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.athena.model.UpdateWorkGroupResult>`"
  (^java.util.concurrent.Future [^AmazonAthenaAsyncClient this ^com.amazonaws.services.athena.model.UpdateWorkGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateWorkGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAthenaAsyncClient this ^com.amazonaws.services.athena.model.UpdateWorkGroupRequest request]
    (-> this (.updateWorkGroupAsync request))))

(defn create-work-group-async
  "Description copied from interface: AmazonAthenaAsync

  request - `com.amazonaws.services.athena.model.CreateWorkGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateWorkGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.athena.model.CreateWorkGroupResult>`"
  (^java.util.concurrent.Future [^AmazonAthenaAsyncClient this ^com.amazonaws.services.athena.model.CreateWorkGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createWorkGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAthenaAsyncClient this ^com.amazonaws.services.athena.model.CreateWorkGroupRequest request]
    (-> this (.createWorkGroupAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonAthenaAsyncClient this]
    (-> this (.getExecutorService))))

(defn get-work-group-async
  "Description copied from interface: AmazonAthenaAsync

  request - `com.amazonaws.services.athena.model.GetWorkGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetWorkGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.athena.model.GetWorkGroupResult>`"
  (^java.util.concurrent.Future [^AmazonAthenaAsyncClient this ^com.amazonaws.services.athena.model.GetWorkGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getWorkGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAthenaAsyncClient this ^com.amazonaws.services.athena.model.GetWorkGroupRequest request]
    (-> this (.getWorkGroupAsync request))))

(defn get-named-query-async
  "Description copied from interface: AmazonAthenaAsync

  request - `com.amazonaws.services.athena.model.GetNamedQueryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetNamedQuery operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.athena.model.GetNamedQueryResult>`"
  (^java.util.concurrent.Future [^AmazonAthenaAsyncClient this ^com.amazonaws.services.athena.model.GetNamedQueryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getNamedQueryAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAthenaAsyncClient this ^com.amazonaws.services.athena.model.GetNamedQueryRequest request]
    (-> this (.getNamedQueryAsync request))))

(defn get-query-results-async
  "Description copied from interface: AmazonAthenaAsync

  request - `com.amazonaws.services.athena.model.GetQueryResultsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetQueryResults operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.athena.model.GetQueryResultsResult>`"
  (^java.util.concurrent.Future [^AmazonAthenaAsyncClient this ^com.amazonaws.services.athena.model.GetQueryResultsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getQueryResultsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAthenaAsyncClient this ^com.amazonaws.services.athena.model.GetQueryResultsRequest request]
    (-> this (.getQueryResultsAsync request))))

(defn delete-work-group-async
  "Description copied from interface: AmazonAthenaAsync

  request - `com.amazonaws.services.athena.model.DeleteWorkGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteWorkGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.athena.model.DeleteWorkGroupResult>`"
  (^java.util.concurrent.Future [^AmazonAthenaAsyncClient this ^com.amazonaws.services.athena.model.DeleteWorkGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteWorkGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAthenaAsyncClient this ^com.amazonaws.services.athena.model.DeleteWorkGroupRequest request]
    (-> this (.deleteWorkGroupAsync request))))

(defn delete-named-query-async
  "Description copied from interface: AmazonAthenaAsync

  request - `com.amazonaws.services.athena.model.DeleteNamedQueryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteNamedQuery operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.athena.model.DeleteNamedQueryResult>`"
  (^java.util.concurrent.Future [^AmazonAthenaAsyncClient this ^com.amazonaws.services.athena.model.DeleteNamedQueryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteNamedQueryAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAthenaAsyncClient this ^com.amazonaws.services.athena.model.DeleteNamedQueryRequest request]
    (-> this (.deleteNamedQueryAsync request))))

(defn batch-get-named-query-async
  "Description copied from interface: AmazonAthenaAsync

  request - `com.amazonaws.services.athena.model.BatchGetNamedQueryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetNamedQuery operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.athena.model.BatchGetNamedQueryResult>`"
  (^java.util.concurrent.Future [^AmazonAthenaAsyncClient this ^com.amazonaws.services.athena.model.BatchGetNamedQueryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetNamedQueryAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAthenaAsyncClient this ^com.amazonaws.services.athena.model.BatchGetNamedQueryRequest request]
    (-> this (.batchGetNamedQueryAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonAthenaAsyncClient this]
    (-> this (.shutdown))))

(defn stop-query-execution-async
  "Description copied from interface: AmazonAthenaAsync

  request - `com.amazonaws.services.athena.model.StopQueryExecutionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopQueryExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.athena.model.StopQueryExecutionResult>`"
  (^java.util.concurrent.Future [^AmazonAthenaAsyncClient this ^com.amazonaws.services.athena.model.StopQueryExecutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopQueryExecutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAthenaAsyncClient this ^com.amazonaws.services.athena.model.StopQueryExecutionRequest request]
    (-> this (.stopQueryExecutionAsync request))))

(defn get-query-execution-async
  "Description copied from interface: AmazonAthenaAsync

  request - `com.amazonaws.services.athena.model.GetQueryExecutionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetQueryExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.athena.model.GetQueryExecutionResult>`"
  (^java.util.concurrent.Future [^AmazonAthenaAsyncClient this ^com.amazonaws.services.athena.model.GetQueryExecutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getQueryExecutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAthenaAsyncClient this ^com.amazonaws.services.athena.model.GetQueryExecutionRequest request]
    (-> this (.getQueryExecutionAsync request))))

(defn list-work-groups-async
  "Description copied from interface: AmazonAthenaAsync

  request - `com.amazonaws.services.athena.model.ListWorkGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListWorkGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.athena.model.ListWorkGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonAthenaAsyncClient this ^com.amazonaws.services.athena.model.ListWorkGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listWorkGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAthenaAsyncClient this ^com.amazonaws.services.athena.model.ListWorkGroupsRequest request]
    (-> this (.listWorkGroupsAsync request))))

(defn start-query-execution-async
  "Description copied from interface: AmazonAthenaAsync

  request - `com.amazonaws.services.athena.model.StartQueryExecutionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartQueryExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.athena.model.StartQueryExecutionResult>`"
  (^java.util.concurrent.Future [^AmazonAthenaAsyncClient this ^com.amazonaws.services.athena.model.StartQueryExecutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startQueryExecutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAthenaAsyncClient this ^com.amazonaws.services.athena.model.StartQueryExecutionRequest request]
    (-> this (.startQueryExecutionAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AmazonAthenaAsync

  request - `com.amazonaws.services.athena.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.athena.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonAthenaAsyncClient this ^com.amazonaws.services.athena.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAthenaAsyncClient this ^com.amazonaws.services.athena.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn create-named-query-async
  "Description copied from interface: AmazonAthenaAsync

  request - `com.amazonaws.services.athena.model.CreateNamedQueryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateNamedQuery operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.athena.model.CreateNamedQueryResult>`"
  (^java.util.concurrent.Future [^AmazonAthenaAsyncClient this ^com.amazonaws.services.athena.model.CreateNamedQueryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createNamedQueryAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAthenaAsyncClient this ^com.amazonaws.services.athena.model.CreateNamedQueryRequest request]
    (-> this (.createNamedQueryAsync request))))

(defn tag-resource-async
  "Description copied from interface: AmazonAthenaAsync

  request - `com.amazonaws.services.athena.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.athena.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonAthenaAsyncClient this ^com.amazonaws.services.athena.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAthenaAsyncClient this ^com.amazonaws.services.athena.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn list-named-queries-async
  "Description copied from interface: AmazonAthenaAsync

  request - `com.amazonaws.services.athena.model.ListNamedQueriesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListNamedQueries operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.athena.model.ListNamedQueriesResult>`"
  (^java.util.concurrent.Future [^AmazonAthenaAsyncClient this ^com.amazonaws.services.athena.model.ListNamedQueriesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listNamedQueriesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAthenaAsyncClient this ^com.amazonaws.services.athena.model.ListNamedQueriesRequest request]
    (-> this (.listNamedQueriesAsync request))))

