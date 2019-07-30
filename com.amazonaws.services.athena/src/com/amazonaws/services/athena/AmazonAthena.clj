(ns com.amazonaws.services.athena.AmazonAthena
  "Interface for accessing Amazon Athena.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonAthena instead.



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
  (:import [com.amazonaws.services.athena AmazonAthena]))

(defn list-tags-for-resource
  "Lists the tags associated with this workgroup.

  list-tags-for-resource-request - `com.amazonaws.services.athena.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.athena.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.athena.model.InternalServerException - Indicates a platform issue, which may be due to a transient condition or outage."
  (^com.amazonaws.services.athena.model.ListTagsForResourceResult [^AmazonAthena this ^com.amazonaws.services.athena.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn update-work-group
  "Updates the workgroup with the specified name. The workgroup's name cannot be changed.

  update-work-group-request - `com.amazonaws.services.athena.model.UpdateWorkGroupRequest`

  returns: Result of the UpdateWorkGroup operation returned by the service. - `com.amazonaws.services.athena.model.UpdateWorkGroupResult`

  throws: com.amazonaws.services.athena.model.InternalServerException - Indicates a platform issue, which may be due to a transient condition or outage."
  (^com.amazonaws.services.athena.model.UpdateWorkGroupResult [^AmazonAthena this ^com.amazonaws.services.athena.model.UpdateWorkGroupRequest update-work-group-request]
    (-> this (.updateWorkGroup update-work-group-request))))

(defn stop-query-execution
  "Stops a query execution. Requires you to have access to the workgroup in which the query ran.


   For code samples using the AWS SDK for Java, see Examples and Code Samples in the
   Amazon Athena User Guide.

  stop-query-execution-request - `com.amazonaws.services.athena.model.StopQueryExecutionRequest`

  returns: Result of the StopQueryExecution operation returned by the service. - `com.amazonaws.services.athena.model.StopQueryExecutionResult`

  throws: com.amazonaws.services.athena.model.InternalServerException - Indicates a platform issue, which may be due to a transient condition or outage."
  (^com.amazonaws.services.athena.model.StopQueryExecutionResult [^AmazonAthena this ^com.amazonaws.services.athena.model.StopQueryExecutionRequest stop-query-execution-request]
    (-> this (.stopQueryExecution stop-query-execution-request))))

(defn untag-resource
  "Removes one or more tags from the workgroup resource. Takes as an input a list of TagKey Strings separated by
   commas, and removes their tags at the same time.

  untag-resource-request - `com.amazonaws.services.athena.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.athena.model.UntagResourceResult`

  throws: com.amazonaws.services.athena.model.InternalServerException - Indicates a platform issue, which may be due to a transient condition or outage."
  (^com.amazonaws.services.athena.model.UntagResourceResult [^AmazonAthena this ^com.amazonaws.services.athena.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn get-named-query
  "Returns information about a single query. Requires that you have access to the workgroup in which the query was
   saved.

  get-named-query-request - `com.amazonaws.services.athena.model.GetNamedQueryRequest`

  returns: Result of the GetNamedQuery operation returned by the service. - `com.amazonaws.services.athena.model.GetNamedQueryResult`

  throws: com.amazonaws.services.athena.model.InternalServerException - Indicates a platform issue, which may be due to a transient condition or outage."
  (^com.amazonaws.services.athena.model.GetNamedQueryResult [^AmazonAthena this ^com.amazonaws.services.athena.model.GetNamedQueryRequest get-named-query-request]
    (-> this (.getNamedQuery get-named-query-request))))

(defn start-query-execution
  "Runs the SQL query statements contained in the Query. Requires you to have access to the workgroup
   in which the query ran.


   For code samples using the AWS SDK for Java, see Examples and Code Samples in the
   Amazon Athena User Guide.

  start-query-execution-request - `com.amazonaws.services.athena.model.StartQueryExecutionRequest`

  returns: Result of the StartQueryExecution operation returned by the service. - `com.amazonaws.services.athena.model.StartQueryExecutionResult`

  throws: com.amazonaws.services.athena.model.InternalServerException - Indicates a platform issue, which may be due to a transient condition or outage."
  (^com.amazonaws.services.athena.model.StartQueryExecutionResult [^AmazonAthena this ^com.amazonaws.services.athena.model.StartQueryExecutionRequest start-query-execution-request]
    (-> this (.startQueryExecution start-query-execution-request))))

(defn get-work-group
  "Returns information about the workgroup with the specified name.

  get-work-group-request - `com.amazonaws.services.athena.model.GetWorkGroupRequest`

  returns: Result of the GetWorkGroup operation returned by the service. - `com.amazonaws.services.athena.model.GetWorkGroupResult`

  throws: com.amazonaws.services.athena.model.InternalServerException - Indicates a platform issue, which may be due to a transient condition or outage."
  (^com.amazonaws.services.athena.model.GetWorkGroupResult [^AmazonAthena this ^com.amazonaws.services.athena.model.GetWorkGroupRequest get-work-group-request]
    (-> this (.getWorkGroup get-work-group-request))))

(defn batch-get-query-execution
  "Returns the details of a single query execution or a list of up to 50 query executions, which you provide as an
   array of query execution ID strings. Requires you to have access to the workgroup in which the queries ran. To
   get a list of query execution IDs, use ListQueryExecutionsInput$WorkGroup. Query executions differ from
   named (saved) queries. Use BatchGetNamedQueryInput to get details about named queries.

  batch-get-query-execution-request - `com.amazonaws.services.athena.model.BatchGetQueryExecutionRequest`

  returns: Result of the BatchGetQueryExecution operation returned by the service. - `com.amazonaws.services.athena.model.BatchGetQueryExecutionResult`

  throws: com.amazonaws.services.athena.model.InternalServerException - Indicates a platform issue, which may be due to a transient condition or outage."
  (^com.amazonaws.services.athena.model.BatchGetQueryExecutionResult [^AmazonAthena this ^com.amazonaws.services.athena.model.BatchGetQueryExecutionRequest batch-get-query-execution-request]
    (-> this (.batchGetQueryExecution batch-get-query-execution-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonAthena this]
    (-> this (.shutdown))))

(defn delete-work-group
  "Deletes the workgroup with the specified name. The primary workgroup cannot be deleted.

  delete-work-group-request - `com.amazonaws.services.athena.model.DeleteWorkGroupRequest`

  returns: Result of the DeleteWorkGroup operation returned by the service. - `com.amazonaws.services.athena.model.DeleteWorkGroupResult`

  throws: com.amazonaws.services.athena.model.InternalServerException - Indicates a platform issue, which may be due to a transient condition or outage."
  (^com.amazonaws.services.athena.model.DeleteWorkGroupResult [^AmazonAthena this ^com.amazonaws.services.athena.model.DeleteWorkGroupRequest delete-work-group-request]
    (-> this (.deleteWorkGroup delete-work-group-request))))

(defn list-named-queries
  "Provides a list of available query IDs only for queries saved in the specified workgroup. Requires that you have
   access to the workgroup.


   For code samples using the AWS SDK for Java, see Examples and Code Samples in the
   Amazon Athena User Guide.

  list-named-queries-request - `com.amazonaws.services.athena.model.ListNamedQueriesRequest`

  returns: Result of the ListNamedQueries operation returned by the service. - `com.amazonaws.services.athena.model.ListNamedQueriesResult`

  throws: com.amazonaws.services.athena.model.InternalServerException - Indicates a platform issue, which may be due to a transient condition or outage."
  (^com.amazonaws.services.athena.model.ListNamedQueriesResult [^AmazonAthena this ^com.amazonaws.services.athena.model.ListNamedQueriesRequest list-named-queries-request]
    (-> this (.listNamedQueries list-named-queries-request))))

(defn batch-get-named-query
  "Returns the details of a single named query or a list of up to 50 queries, which you provide as an array of query
   ID strings. Requires you to have access to the workgroup in which the queries were saved. Use
   ListNamedQueriesInput to get the list of named query IDs in the specified workgroup. If information could
   not be retrieved for a submitted query ID, information about the query ID submitted is listed under
   UnprocessedNamedQueryId. Named queries differ from executed queries. Use
   BatchGetQueryExecutionInput to get details about each unique query execution, and
   ListQueryExecutionsInput to get a list of query execution IDs.

  batch-get-named-query-request - `com.amazonaws.services.athena.model.BatchGetNamedQueryRequest`

  returns: Result of the BatchGetNamedQuery operation returned by the service. - `com.amazonaws.services.athena.model.BatchGetNamedQueryResult`

  throws: com.amazonaws.services.athena.model.InternalServerException - Indicates a platform issue, which may be due to a transient condition or outage."
  (^com.amazonaws.services.athena.model.BatchGetNamedQueryResult [^AmazonAthena this ^com.amazonaws.services.athena.model.BatchGetNamedQueryRequest batch-get-named-query-request]
    (-> this (.batchGetNamedQuery batch-get-named-query-request))))

(defn get-query-execution
  "Returns information about a single execution of a query if you have access to the workgroup in which the query
   ran. Each time a query executes, information about the query execution is saved with a unique ID.

  get-query-execution-request - `com.amazonaws.services.athena.model.GetQueryExecutionRequest`

  returns: Result of the GetQueryExecution operation returned by the service. - `com.amazonaws.services.athena.model.GetQueryExecutionResult`

  throws: com.amazonaws.services.athena.model.InternalServerException - Indicates a platform issue, which may be due to a transient condition or outage."
  (^com.amazonaws.services.athena.model.GetQueryExecutionResult [^AmazonAthena this ^com.amazonaws.services.athena.model.GetQueryExecutionRequest get-query-execution-request]
    (-> this (.getQueryExecution get-query-execution-request))))

(defn get-query-results
  "Returns the results of a single query execution specified by QueryExecutionId if you have access to
   the workgroup in which the query ran. This request does not execute the query but returns results. Use
   StartQueryExecution to run a query.

  get-query-results-request - `com.amazonaws.services.athena.model.GetQueryResultsRequest`

  returns: Result of the GetQueryResults operation returned by the service. - `com.amazonaws.services.athena.model.GetQueryResultsResult`

  throws: com.amazonaws.services.athena.model.InternalServerException - Indicates a platform issue, which may be due to a transient condition or outage."
  (^com.amazonaws.services.athena.model.GetQueryResultsResult [^AmazonAthena this ^com.amazonaws.services.athena.model.GetQueryResultsRequest get-query-results-request]
    (-> this (.getQueryResults get-query-results-request))))

(defn list-work-groups
  "Lists available workgroups for the account.

  list-work-groups-request - `com.amazonaws.services.athena.model.ListWorkGroupsRequest`

  returns: Result of the ListWorkGroups operation returned by the service. - `com.amazonaws.services.athena.model.ListWorkGroupsResult`

  throws: com.amazonaws.services.athena.model.InternalServerException - Indicates a platform issue, which may be due to a transient condition or outage."
  (^com.amazonaws.services.athena.model.ListWorkGroupsResult [^AmazonAthena this ^com.amazonaws.services.athena.model.ListWorkGroupsRequest list-work-groups-request]
    (-> this (.listWorkGroups list-work-groups-request))))

(defn create-work-group
  "Creates a workgroup with the specified name.

  create-work-group-request - `com.amazonaws.services.athena.model.CreateWorkGroupRequest`

  returns: Result of the CreateWorkGroup operation returned by the service. - `com.amazonaws.services.athena.model.CreateWorkGroupResult`

  throws: com.amazonaws.services.athena.model.InternalServerException - Indicates a platform issue, which may be due to a transient condition or outage."
  (^com.amazonaws.services.athena.model.CreateWorkGroupResult [^AmazonAthena this ^com.amazonaws.services.athena.model.CreateWorkGroupRequest create-work-group-request]
    (-> this (.createWorkGroup create-work-group-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonAthena this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn list-query-executions
  "Provides a list of available query execution IDs for the queries in the specified workgroup. Requires you to have
   access to the workgroup in which the queries ran.


   For code samples using the AWS SDK for Java, see Examples and Code Samples in the
   Amazon Athena User Guide.

  list-query-executions-request - `com.amazonaws.services.athena.model.ListQueryExecutionsRequest`

  returns: Result of the ListQueryExecutions operation returned by the service. - `com.amazonaws.services.athena.model.ListQueryExecutionsResult`

  throws: com.amazonaws.services.athena.model.InternalServerException - Indicates a platform issue, which may be due to a transient condition or outage."
  (^com.amazonaws.services.athena.model.ListQueryExecutionsResult [^AmazonAthena this ^com.amazonaws.services.athena.model.ListQueryExecutionsRequest list-query-executions-request]
    (-> this (.listQueryExecutions list-query-executions-request))))

(defn tag-resource
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

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.athena.model.TagResourceResult`

  throws: com.amazonaws.services.athena.model.InternalServerException - Indicates a platform issue, which may be due to a transient condition or outage."
  (^com.amazonaws.services.athena.model.TagResourceResult [^AmazonAthena this ^com.amazonaws.services.athena.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

(defn create-named-query
  "Creates a named query in the specified workgroup. Requires that you have access to the workgroup.


   For code samples using the AWS SDK for Java, see Examples and Code Samples in the
   Amazon Athena User Guide.

  create-named-query-request - `com.amazonaws.services.athena.model.CreateNamedQueryRequest`

  returns: Result of the CreateNamedQuery operation returned by the service. - `com.amazonaws.services.athena.model.CreateNamedQueryResult`

  throws: com.amazonaws.services.athena.model.InternalServerException - Indicates a platform issue, which may be due to a transient condition or outage."
  (^com.amazonaws.services.athena.model.CreateNamedQueryResult [^AmazonAthena this ^com.amazonaws.services.athena.model.CreateNamedQueryRequest create-named-query-request]
    (-> this (.createNamedQuery create-named-query-request))))

(defn delete-named-query
  "Deletes the named query if you have access to the workgroup in which the query was saved.


   For code samples using the AWS SDK for Java, see Examples and Code Samples in the
   Amazon Athena User Guide.

  delete-named-query-request - `com.amazonaws.services.athena.model.DeleteNamedQueryRequest`

  returns: Result of the DeleteNamedQuery operation returned by the service. - `com.amazonaws.services.athena.model.DeleteNamedQueryResult`

  throws: com.amazonaws.services.athena.model.InternalServerException - Indicates a platform issue, which may be due to a transient condition or outage."
  (^com.amazonaws.services.athena.model.DeleteNamedQueryResult [^AmazonAthena this ^com.amazonaws.services.athena.model.DeleteNamedQueryRequest delete-named-query-request]
    (-> this (.deleteNamedQuery delete-named-query-request))))

