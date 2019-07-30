(ns com.amazonaws.services.athena.AmazonAthenaAsync
  "Interface for accessing Amazon Athena asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonAthenaAsync instead.



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
  (:import [com.amazonaws.services.athena AmazonAthenaAsync]))

(defn untag-resource-async
  "Removes one or more tags from the workgroup resource. Takes as an input a list of TagKey Strings separated by
   commas, and removes their tags at the same time.

  untag-resource-request - `com.amazonaws.services.athena.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.athena.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonAthenaAsync this ^com.amazonaws.services.athena.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAthenaAsync this ^com.amazonaws.services.athena.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn batch-get-query-execution-async
  "Returns the details of a single query execution or a list of up to 50 query executions, which you provide as an
   array of query execution ID strings. Requires you to have access to the workgroup in which the queries ran. To
   get a list of query execution IDs, use ListQueryExecutionsInput$WorkGroup. Query executions differ from
   named (saved) queries. Use BatchGetNamedQueryInput to get details about named queries.

  batch-get-query-execution-request - `com.amazonaws.services.athena.model.BatchGetQueryExecutionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetQueryExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.athena.model.BatchGetQueryExecutionResult>`"
  (^java.util.concurrent.Future [^AmazonAthenaAsync this ^com.amazonaws.services.athena.model.BatchGetQueryExecutionRequest batch-get-query-execution-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetQueryExecutionAsync batch-get-query-execution-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAthenaAsync this ^com.amazonaws.services.athena.model.BatchGetQueryExecutionRequest batch-get-query-execution-request]
    (-> this (.batchGetQueryExecutionAsync batch-get-query-execution-request))))

(defn list-query-executions-async
  "Provides a list of available query execution IDs for the queries in the specified workgroup. Requires you to have
   access to the workgroup in which the queries ran.


   For code samples using the AWS SDK for Java, see Examples and Code Samples in the
   Amazon Athena User Guide.

  list-query-executions-request - `com.amazonaws.services.athena.model.ListQueryExecutionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListQueryExecutions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.athena.model.ListQueryExecutionsResult>`"
  (^java.util.concurrent.Future [^AmazonAthenaAsync this ^com.amazonaws.services.athena.model.ListQueryExecutionsRequest list-query-executions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listQueryExecutionsAsync list-query-executions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAthenaAsync this ^com.amazonaws.services.athena.model.ListQueryExecutionsRequest list-query-executions-request]
    (-> this (.listQueryExecutionsAsync list-query-executions-request))))

(defn update-work-group-async
  "Updates the workgroup with the specified name. The workgroup's name cannot be changed.

  update-work-group-request - `com.amazonaws.services.athena.model.UpdateWorkGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateWorkGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.athena.model.UpdateWorkGroupResult>`"
  (^java.util.concurrent.Future [^AmazonAthenaAsync this ^com.amazonaws.services.athena.model.UpdateWorkGroupRequest update-work-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateWorkGroupAsync update-work-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAthenaAsync this ^com.amazonaws.services.athena.model.UpdateWorkGroupRequest update-work-group-request]
    (-> this (.updateWorkGroupAsync update-work-group-request))))

(defn create-work-group-async
  "Creates a workgroup with the specified name.

  create-work-group-request - `com.amazonaws.services.athena.model.CreateWorkGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateWorkGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.athena.model.CreateWorkGroupResult>`"
  (^java.util.concurrent.Future [^AmazonAthenaAsync this ^com.amazonaws.services.athena.model.CreateWorkGroupRequest create-work-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createWorkGroupAsync create-work-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAthenaAsync this ^com.amazonaws.services.athena.model.CreateWorkGroupRequest create-work-group-request]
    (-> this (.createWorkGroupAsync create-work-group-request))))

(defn get-work-group-async
  "Returns information about the workgroup with the specified name.

  get-work-group-request - `com.amazonaws.services.athena.model.GetWorkGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetWorkGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.athena.model.GetWorkGroupResult>`"
  (^java.util.concurrent.Future [^AmazonAthenaAsync this ^com.amazonaws.services.athena.model.GetWorkGroupRequest get-work-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getWorkGroupAsync get-work-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAthenaAsync this ^com.amazonaws.services.athena.model.GetWorkGroupRequest get-work-group-request]
    (-> this (.getWorkGroupAsync get-work-group-request))))

(defn get-named-query-async
  "Returns information about a single query. Requires that you have access to the workgroup in which the query was
   saved.

  get-named-query-request - `com.amazonaws.services.athena.model.GetNamedQueryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetNamedQuery operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.athena.model.GetNamedQueryResult>`"
  (^java.util.concurrent.Future [^AmazonAthenaAsync this ^com.amazonaws.services.athena.model.GetNamedQueryRequest get-named-query-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getNamedQueryAsync get-named-query-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAthenaAsync this ^com.amazonaws.services.athena.model.GetNamedQueryRequest get-named-query-request]
    (-> this (.getNamedQueryAsync get-named-query-request))))

(defn get-query-results-async
  "Returns the results of a single query execution specified by QueryExecutionId if you have access to
   the workgroup in which the query ran. This request does not execute the query but returns results. Use
   StartQueryExecution to run a query.

  get-query-results-request - `com.amazonaws.services.athena.model.GetQueryResultsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetQueryResults operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.athena.model.GetQueryResultsResult>`"
  (^java.util.concurrent.Future [^AmazonAthenaAsync this ^com.amazonaws.services.athena.model.GetQueryResultsRequest get-query-results-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getQueryResultsAsync get-query-results-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAthenaAsync this ^com.amazonaws.services.athena.model.GetQueryResultsRequest get-query-results-request]
    (-> this (.getQueryResultsAsync get-query-results-request))))

(defn delete-work-group-async
  "Deletes the workgroup with the specified name. The primary workgroup cannot be deleted.

  delete-work-group-request - `com.amazonaws.services.athena.model.DeleteWorkGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteWorkGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.athena.model.DeleteWorkGroupResult>`"
  (^java.util.concurrent.Future [^AmazonAthenaAsync this ^com.amazonaws.services.athena.model.DeleteWorkGroupRequest delete-work-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteWorkGroupAsync delete-work-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAthenaAsync this ^com.amazonaws.services.athena.model.DeleteWorkGroupRequest delete-work-group-request]
    (-> this (.deleteWorkGroupAsync delete-work-group-request))))

(defn delete-named-query-async
  "Deletes the named query if you have access to the workgroup in which the query was saved.


   For code samples using the AWS SDK for Java, see Examples and Code Samples in the
   Amazon Athena User Guide.

  delete-named-query-request - `com.amazonaws.services.athena.model.DeleteNamedQueryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteNamedQuery operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.athena.model.DeleteNamedQueryResult>`"
  (^java.util.concurrent.Future [^AmazonAthenaAsync this ^com.amazonaws.services.athena.model.DeleteNamedQueryRequest delete-named-query-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteNamedQueryAsync delete-named-query-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAthenaAsync this ^com.amazonaws.services.athena.model.DeleteNamedQueryRequest delete-named-query-request]
    (-> this (.deleteNamedQueryAsync delete-named-query-request))))

(defn batch-get-named-query-async
  "Returns the details of a single named query or a list of up to 50 queries, which you provide as an array of query
   ID strings. Requires you to have access to the workgroup in which the queries were saved. Use
   ListNamedQueriesInput to get the list of named query IDs in the specified workgroup. If information could
   not be retrieved for a submitted query ID, information about the query ID submitted is listed under
   UnprocessedNamedQueryId. Named queries differ from executed queries. Use
   BatchGetQueryExecutionInput to get details about each unique query execution, and
   ListQueryExecutionsInput to get a list of query execution IDs.

  batch-get-named-query-request - `com.amazonaws.services.athena.model.BatchGetNamedQueryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetNamedQuery operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.athena.model.BatchGetNamedQueryResult>`"
  (^java.util.concurrent.Future [^AmazonAthenaAsync this ^com.amazonaws.services.athena.model.BatchGetNamedQueryRequest batch-get-named-query-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetNamedQueryAsync batch-get-named-query-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAthenaAsync this ^com.amazonaws.services.athena.model.BatchGetNamedQueryRequest batch-get-named-query-request]
    (-> this (.batchGetNamedQueryAsync batch-get-named-query-request))))

(defn stop-query-execution-async
  "Stops a query execution. Requires you to have access to the workgroup in which the query ran.


   For code samples using the AWS SDK for Java, see Examples and Code Samples in the
   Amazon Athena User Guide.

  stop-query-execution-request - `com.amazonaws.services.athena.model.StopQueryExecutionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopQueryExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.athena.model.StopQueryExecutionResult>`"
  (^java.util.concurrent.Future [^AmazonAthenaAsync this ^com.amazonaws.services.athena.model.StopQueryExecutionRequest stop-query-execution-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopQueryExecutionAsync stop-query-execution-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAthenaAsync this ^com.amazonaws.services.athena.model.StopQueryExecutionRequest stop-query-execution-request]
    (-> this (.stopQueryExecutionAsync stop-query-execution-request))))

(defn get-query-execution-async
  "Returns information about a single execution of a query if you have access to the workgroup in which the query
   ran. Each time a query executes, information about the query execution is saved with a unique ID.

  get-query-execution-request - `com.amazonaws.services.athena.model.GetQueryExecutionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetQueryExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.athena.model.GetQueryExecutionResult>`"
  (^java.util.concurrent.Future [^AmazonAthenaAsync this ^com.amazonaws.services.athena.model.GetQueryExecutionRequest get-query-execution-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getQueryExecutionAsync get-query-execution-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAthenaAsync this ^com.amazonaws.services.athena.model.GetQueryExecutionRequest get-query-execution-request]
    (-> this (.getQueryExecutionAsync get-query-execution-request))))

(defn list-work-groups-async
  "Lists available workgroups for the account.

  list-work-groups-request - `com.amazonaws.services.athena.model.ListWorkGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListWorkGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.athena.model.ListWorkGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonAthenaAsync this ^com.amazonaws.services.athena.model.ListWorkGroupsRequest list-work-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listWorkGroupsAsync list-work-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAthenaAsync this ^com.amazonaws.services.athena.model.ListWorkGroupsRequest list-work-groups-request]
    (-> this (.listWorkGroupsAsync list-work-groups-request))))

(defn start-query-execution-async
  "Runs the SQL query statements contained in the Query. Requires you to have access to the workgroup
   in which the query ran.


   For code samples using the AWS SDK for Java, see Examples and Code Samples in the
   Amazon Athena User Guide.

  start-query-execution-request - `com.amazonaws.services.athena.model.StartQueryExecutionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartQueryExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.athena.model.StartQueryExecutionResult>`"
  (^java.util.concurrent.Future [^AmazonAthenaAsync this ^com.amazonaws.services.athena.model.StartQueryExecutionRequest start-query-execution-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startQueryExecutionAsync start-query-execution-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAthenaAsync this ^com.amazonaws.services.athena.model.StartQueryExecutionRequest start-query-execution-request]
    (-> this (.startQueryExecutionAsync start-query-execution-request))))

(defn list-tags-for-resource-async
  "Lists the tags associated with this workgroup.

  list-tags-for-resource-request - `com.amazonaws.services.athena.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.athena.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonAthenaAsync this ^com.amazonaws.services.athena.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAthenaAsync this ^com.amazonaws.services.athena.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn create-named-query-async
  "Creates a named query in the specified workgroup. Requires that you have access to the workgroup.


   For code samples using the AWS SDK for Java, see Examples and Code Samples in the
   Amazon Athena User Guide.

  create-named-query-request - `com.amazonaws.services.athena.model.CreateNamedQueryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateNamedQuery operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.athena.model.CreateNamedQueryResult>`"
  (^java.util.concurrent.Future [^AmazonAthenaAsync this ^com.amazonaws.services.athena.model.CreateNamedQueryRequest create-named-query-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createNamedQueryAsync create-named-query-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAthenaAsync this ^com.amazonaws.services.athena.model.CreateNamedQueryRequest create-named-query-request]
    (-> this (.createNamedQueryAsync create-named-query-request))))

(defn tag-resource-async
  "Adds one or more tags to the resource, such as a workgroup. A tag is a label that you assign to an AWS Athena
   resource (a workgroup). Each tag consists of a key and an optional value, both of which you define. Tags enable
   you to categorize resources (workgroups) in Athena, for example, by purpose, owner, or environment. Use a
   consistent set of tag keys to make it easier to search and filter workgroups in your account. For best practices,
   see AWS Tagging
   Strategies. The key length is from 1 (minimum) to 128 (maximum) Unicode characters in UTF-8. The tag value
   length is from 0 (minimum) to 256 (maximum) Unicode characters in UTF-8. You can use letters and numbers
   representable in UTF-8, and the following characters:  - = . _ : / @. Tag keys and values are case-sensitive.
   Tag keys must be unique per resource. If you specify more than one, separate them by commas.

  tag-resource-request - `com.amazonaws.services.athena.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.athena.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonAthenaAsync this ^com.amazonaws.services.athena.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAthenaAsync this ^com.amazonaws.services.athena.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn list-named-queries-async
  "Provides a list of available query IDs only for queries saved in the specified workgroup. Requires that you have
   access to the workgroup.


   For code samples using the AWS SDK for Java, see Examples and Code Samples in the
   Amazon Athena User Guide.

  list-named-queries-request - `com.amazonaws.services.athena.model.ListNamedQueriesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListNamedQueries operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.athena.model.ListNamedQueriesResult>`"
  (^java.util.concurrent.Future [^AmazonAthenaAsync this ^com.amazonaws.services.athena.model.ListNamedQueriesRequest list-named-queries-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listNamedQueriesAsync list-named-queries-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAthenaAsync this ^com.amazonaws.services.athena.model.ListNamedQueriesRequest list-named-queries-request]
    (-> this (.listNamedQueriesAsync list-named-queries-request))))

