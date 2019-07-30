(ns com.amazonaws.services.athena.AmazonAthenaClient
  "Client for accessing Amazon Athena. All service calls made using this client are blocking, and will not return until
  the service call completes.


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
  (:import [com.amazonaws.services.athena AmazonAthenaClient]))

(defn *builder
  "returns: `com.amazonaws.services.athena.AmazonAthenaClientBuilder`"
  (^com.amazonaws.services.athena.AmazonAthenaClientBuilder []
    (AmazonAthenaClient/builder )))

(defn list-tags-for-resource
  "Lists the tags associated with this workgroup.

  request - `com.amazonaws.services.athena.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.athena.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.athena.model.InternalServerException - Indicates a platform issue, which may be due to a transient condition or outage."
  (^com.amazonaws.services.athena.model.ListTagsForResourceResult [^AmazonAthenaClient this ^com.amazonaws.services.athena.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn update-work-group
  "Updates the workgroup with the specified name. The workgroup's name cannot be changed.

  request - `com.amazonaws.services.athena.model.UpdateWorkGroupRequest`

  returns: Result of the UpdateWorkGroup operation returned by the service. - `com.amazonaws.services.athena.model.UpdateWorkGroupResult`

  throws: com.amazonaws.services.athena.model.InternalServerException - Indicates a platform issue, which may be due to a transient condition or outage."
  (^com.amazonaws.services.athena.model.UpdateWorkGroupResult [^AmazonAthenaClient this ^com.amazonaws.services.athena.model.UpdateWorkGroupRequest request]
    (-> this (.updateWorkGroup request))))

(defn stop-query-execution
  "Stops a query execution. Requires you to have access to the workgroup in which the query ran.


   For code samples using the AWS SDK for Java, see Examples and Code Samples in the
   Amazon Athena User Guide.

  request - `com.amazonaws.services.athena.model.StopQueryExecutionRequest`

  returns: Result of the StopQueryExecution operation returned by the service. - `com.amazonaws.services.athena.model.StopQueryExecutionResult`

  throws: com.amazonaws.services.athena.model.InternalServerException - Indicates a platform issue, which may be due to a transient condition or outage."
  (^com.amazonaws.services.athena.model.StopQueryExecutionResult [^AmazonAthenaClient this ^com.amazonaws.services.athena.model.StopQueryExecutionRequest request]
    (-> this (.stopQueryExecution request))))

(defn untag-resource
  "Removes one or more tags from the workgroup resource. Takes as an input a list of TagKey Strings separated by
   commas, and removes their tags at the same time.

  request - `com.amazonaws.services.athena.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.athena.model.UntagResourceResult`

  throws: com.amazonaws.services.athena.model.InternalServerException - Indicates a platform issue, which may be due to a transient condition or outage."
  (^com.amazonaws.services.athena.model.UntagResourceResult [^AmazonAthenaClient this ^com.amazonaws.services.athena.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn get-named-query
  "Returns information about a single query. Requires that you have access to the workgroup in which the query was
   saved.

  request - `com.amazonaws.services.athena.model.GetNamedQueryRequest`

  returns: Result of the GetNamedQuery operation returned by the service. - `com.amazonaws.services.athena.model.GetNamedQueryResult`

  throws: com.amazonaws.services.athena.model.InternalServerException - Indicates a platform issue, which may be due to a transient condition or outage."
  (^com.amazonaws.services.athena.model.GetNamedQueryResult [^AmazonAthenaClient this ^com.amazonaws.services.athena.model.GetNamedQueryRequest request]
    (-> this (.getNamedQuery request))))

(defn start-query-execution
  "Runs the SQL query statements contained in the Query. Requires you to have access to the workgroup
   in which the query ran.


   For code samples using the AWS SDK for Java, see Examples and Code Samples in the
   Amazon Athena User Guide.

  request - `com.amazonaws.services.athena.model.StartQueryExecutionRequest`

  returns: Result of the StartQueryExecution operation returned by the service. - `com.amazonaws.services.athena.model.StartQueryExecutionResult`

  throws: com.amazonaws.services.athena.model.InternalServerException - Indicates a platform issue, which may be due to a transient condition or outage."
  (^com.amazonaws.services.athena.model.StartQueryExecutionResult [^AmazonAthenaClient this ^com.amazonaws.services.athena.model.StartQueryExecutionRequest request]
    (-> this (.startQueryExecution request))))

(defn get-work-group
  "Returns information about the workgroup with the specified name.

  request - `com.amazonaws.services.athena.model.GetWorkGroupRequest`

  returns: Result of the GetWorkGroup operation returned by the service. - `com.amazonaws.services.athena.model.GetWorkGroupResult`

  throws: com.amazonaws.services.athena.model.InternalServerException - Indicates a platform issue, which may be due to a transient condition or outage."
  (^com.amazonaws.services.athena.model.GetWorkGroupResult [^AmazonAthenaClient this ^com.amazonaws.services.athena.model.GetWorkGroupRequest request]
    (-> this (.getWorkGroup request))))

(defn batch-get-query-execution
  "Returns the details of a single query execution or a list of up to 50 query executions, which you provide as an
   array of query execution ID strings. Requires you to have access to the workgroup in which the queries ran. To
   get a list of query execution IDs, use ListQueryExecutionsInput$WorkGroup. Query executions differ from
   named (saved) queries. Use BatchGetNamedQueryInput to get details about named queries.

  request - `com.amazonaws.services.athena.model.BatchGetQueryExecutionRequest`

  returns: Result of the BatchGetQueryExecution operation returned by the service. - `com.amazonaws.services.athena.model.BatchGetQueryExecutionResult`

  throws: com.amazonaws.services.athena.model.InternalServerException - Indicates a platform issue, which may be due to a transient condition or outage."
  (^com.amazonaws.services.athena.model.BatchGetQueryExecutionResult [^AmazonAthenaClient this ^com.amazonaws.services.athena.model.BatchGetQueryExecutionRequest request]
    (-> this (.batchGetQueryExecution request))))

(defn delete-work-group
  "Deletes the workgroup with the specified name. The primary workgroup cannot be deleted.

  request - `com.amazonaws.services.athena.model.DeleteWorkGroupRequest`

  returns: Result of the DeleteWorkGroup operation returned by the service. - `com.amazonaws.services.athena.model.DeleteWorkGroupResult`

  throws: com.amazonaws.services.athena.model.InternalServerException - Indicates a platform issue, which may be due to a transient condition or outage."
  (^com.amazonaws.services.athena.model.DeleteWorkGroupResult [^AmazonAthenaClient this ^com.amazonaws.services.athena.model.DeleteWorkGroupRequest request]
    (-> this (.deleteWorkGroup request))))

(defn list-named-queries
  "Provides a list of available query IDs only for queries saved in the specified workgroup. Requires that you have
   access to the workgroup.


   For code samples using the AWS SDK for Java, see Examples and Code Samples in the
   Amazon Athena User Guide.

  request - `com.amazonaws.services.athena.model.ListNamedQueriesRequest`

  returns: Result of the ListNamedQueries operation returned by the service. - `com.amazonaws.services.athena.model.ListNamedQueriesResult`

  throws: com.amazonaws.services.athena.model.InternalServerException - Indicates a platform issue, which may be due to a transient condition or outage."
  (^com.amazonaws.services.athena.model.ListNamedQueriesResult [^AmazonAthenaClient this ^com.amazonaws.services.athena.model.ListNamedQueriesRequest request]
    (-> this (.listNamedQueries request))))

(defn batch-get-named-query
  "Returns the details of a single named query or a list of up to 50 queries, which you provide as an array of query
   ID strings. Requires you to have access to the workgroup in which the queries were saved. Use
   ListNamedQueriesInput to get the list of named query IDs in the specified workgroup. If information could
   not be retrieved for a submitted query ID, information about the query ID submitted is listed under
   UnprocessedNamedQueryId. Named queries differ from executed queries. Use
   BatchGetQueryExecutionInput to get details about each unique query execution, and
   ListQueryExecutionsInput to get a list of query execution IDs.

  request - `com.amazonaws.services.athena.model.BatchGetNamedQueryRequest`

  returns: Result of the BatchGetNamedQuery operation returned by the service. - `com.amazonaws.services.athena.model.BatchGetNamedQueryResult`

  throws: com.amazonaws.services.athena.model.InternalServerException - Indicates a platform issue, which may be due to a transient condition or outage."
  (^com.amazonaws.services.athena.model.BatchGetNamedQueryResult [^AmazonAthenaClient this ^com.amazonaws.services.athena.model.BatchGetNamedQueryRequest request]
    (-> this (.batchGetNamedQuery request))))

(defn get-query-execution
  "Returns information about a single execution of a query if you have access to the workgroup in which the query
   ran. Each time a query executes, information about the query execution is saved with a unique ID.

  request - `com.amazonaws.services.athena.model.GetQueryExecutionRequest`

  returns: Result of the GetQueryExecution operation returned by the service. - `com.amazonaws.services.athena.model.GetQueryExecutionResult`

  throws: com.amazonaws.services.athena.model.InternalServerException - Indicates a platform issue, which may be due to a transient condition or outage."
  (^com.amazonaws.services.athena.model.GetQueryExecutionResult [^AmazonAthenaClient this ^com.amazonaws.services.athena.model.GetQueryExecutionRequest request]
    (-> this (.getQueryExecution request))))

(defn get-query-results
  "Returns the results of a single query execution specified by QueryExecutionId if you have access to
   the workgroup in which the query ran. This request does not execute the query but returns results. Use
   StartQueryExecution to run a query.

  request - `com.amazonaws.services.athena.model.GetQueryResultsRequest`

  returns: Result of the GetQueryResults operation returned by the service. - `com.amazonaws.services.athena.model.GetQueryResultsResult`

  throws: com.amazonaws.services.athena.model.InternalServerException - Indicates a platform issue, which may be due to a transient condition or outage."
  (^com.amazonaws.services.athena.model.GetQueryResultsResult [^AmazonAthenaClient this ^com.amazonaws.services.athena.model.GetQueryResultsRequest request]
    (-> this (.getQueryResults request))))

(defn list-work-groups
  "Lists available workgroups for the account.

  request - `com.amazonaws.services.athena.model.ListWorkGroupsRequest`

  returns: Result of the ListWorkGroups operation returned by the service. - `com.amazonaws.services.athena.model.ListWorkGroupsResult`

  throws: com.amazonaws.services.athena.model.InternalServerException - Indicates a platform issue, which may be due to a transient condition or outage."
  (^com.amazonaws.services.athena.model.ListWorkGroupsResult [^AmazonAthenaClient this ^com.amazonaws.services.athena.model.ListWorkGroupsRequest request]
    (-> this (.listWorkGroups request))))

(defn create-work-group
  "Creates a workgroup with the specified name.

  request - `com.amazonaws.services.athena.model.CreateWorkGroupRequest`

  returns: Result of the CreateWorkGroup operation returned by the service. - `com.amazonaws.services.athena.model.CreateWorkGroupResult`

  throws: com.amazonaws.services.athena.model.InternalServerException - Indicates a platform issue, which may be due to a transient condition or outage."
  (^com.amazonaws.services.athena.model.CreateWorkGroupResult [^AmazonAthenaClient this ^com.amazonaws.services.athena.model.CreateWorkGroupRequest request]
    (-> this (.createWorkGroup request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonAthenaClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn list-query-executions
  "Provides a list of available query execution IDs for the queries in the specified workgroup. Requires you to have
   access to the workgroup in which the queries ran.


   For code samples using the AWS SDK for Java, see Examples and Code Samples in the
   Amazon Athena User Guide.

  request - `com.amazonaws.services.athena.model.ListQueryExecutionsRequest`

  returns: Result of the ListQueryExecutions operation returned by the service. - `com.amazonaws.services.athena.model.ListQueryExecutionsResult`

  throws: com.amazonaws.services.athena.model.InternalServerException - Indicates a platform issue, which may be due to a transient condition or outage."
  (^com.amazonaws.services.athena.model.ListQueryExecutionsResult [^AmazonAthenaClient this ^com.amazonaws.services.athena.model.ListQueryExecutionsRequest request]
    (-> this (.listQueryExecutions request))))

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

  request - `com.amazonaws.services.athena.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.athena.model.TagResourceResult`

  throws: com.amazonaws.services.athena.model.InternalServerException - Indicates a platform issue, which may be due to a transient condition or outage."
  (^com.amazonaws.services.athena.model.TagResourceResult [^AmazonAthenaClient this ^com.amazonaws.services.athena.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn create-named-query
  "Creates a named query in the specified workgroup. Requires that you have access to the workgroup.


   For code samples using the AWS SDK for Java, see Examples and Code Samples in the
   Amazon Athena User Guide.

  request - `com.amazonaws.services.athena.model.CreateNamedQueryRequest`

  returns: Result of the CreateNamedQuery operation returned by the service. - `com.amazonaws.services.athena.model.CreateNamedQueryResult`

  throws: com.amazonaws.services.athena.model.InternalServerException - Indicates a platform issue, which may be due to a transient condition or outage."
  (^com.amazonaws.services.athena.model.CreateNamedQueryResult [^AmazonAthenaClient this ^com.amazonaws.services.athena.model.CreateNamedQueryRequest request]
    (-> this (.createNamedQuery request))))

(defn delete-named-query
  "Deletes the named query if you have access to the workgroup in which the query was saved.


   For code samples using the AWS SDK for Java, see Examples and Code Samples in the
   Amazon Athena User Guide.

  request - `com.amazonaws.services.athena.model.DeleteNamedQueryRequest`

  returns: Result of the DeleteNamedQuery operation returned by the service. - `com.amazonaws.services.athena.model.DeleteNamedQueryResult`

  throws: com.amazonaws.services.athena.model.InternalServerException - Indicates a platform issue, which may be due to a transient condition or outage."
  (^com.amazonaws.services.athena.model.DeleteNamedQueryResult [^AmazonAthenaClient this ^com.amazonaws.services.athena.model.DeleteNamedQueryRequest request]
    (-> this (.deleteNamedQuery request))))

