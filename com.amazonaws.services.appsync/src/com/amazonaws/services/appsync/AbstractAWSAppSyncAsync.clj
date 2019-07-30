(ns com.amazonaws.services.appsync.AbstractAWSAppSyncAsync
  "Abstract implementation of AWSAppSyncAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.appsync AbstractAWSAppSyncAsync]))

(defn untag-resource-async
  "Description copied from interface: AWSAppSyncAsync

  request - `com.amazonaws.services.appsync.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn list-graphql-apis-async
  "Description copied from interface: AWSAppSyncAsync

  request - `com.amazonaws.services.appsync.model.ListGraphqlApisRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGraphqlApis operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.ListGraphqlApisResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.ListGraphqlApisRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGraphqlApisAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.ListGraphqlApisRequest request]
    (-> this (.listGraphqlApisAsync request))))

(defn update-resolver-async
  "Description copied from interface: AWSAppSyncAsync

  request - `com.amazonaws.services.appsync.model.UpdateResolverRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateResolver operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.UpdateResolverResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.UpdateResolverRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateResolverAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.UpdateResolverRequest request]
    (-> this (.updateResolverAsync request))))

(defn create-data-source-async
  "Description copied from interface: AWSAppSyncAsync

  request - `com.amazonaws.services.appsync.model.CreateDataSourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDataSource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.CreateDataSourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.CreateDataSourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDataSourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.CreateDataSourceRequest request]
    (-> this (.createDataSourceAsync request))))

(defn get-introspection-schema-async
  "Description copied from interface: AWSAppSyncAsync

  request - `com.amazonaws.services.appsync.model.GetIntrospectionSchemaRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetIntrospectionSchema operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.GetIntrospectionSchemaResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.GetIntrospectionSchemaRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIntrospectionSchemaAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.GetIntrospectionSchemaRequest request]
    (-> this (.getIntrospectionSchemaAsync request))))

(defn get-type-async
  "Description copied from interface: AWSAppSyncAsync

  request - `com.amazonaws.services.appsync.model.GetTypeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.GetTypeResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.GetTypeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTypeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.GetTypeRequest request]
    (-> this (.getTypeAsync request))))

(defn list-functions-async
  "Description copied from interface: AWSAppSyncAsync

  request - `com.amazonaws.services.appsync.model.ListFunctionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListFunctions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.ListFunctionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.ListFunctionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listFunctionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.ListFunctionsRequest request]
    (-> this (.listFunctionsAsync request))))

(defn list-api-keys-async
  "Description copied from interface: AWSAppSyncAsync

  request - `com.amazonaws.services.appsync.model.ListApiKeysRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListApiKeys operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.ListApiKeysResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.ListApiKeysRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listApiKeysAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.ListApiKeysRequest request]
    (-> this (.listApiKeysAsync request))))

(defn get-graphql-api-async
  "Description copied from interface: AWSAppSyncAsync

  request - `com.amazonaws.services.appsync.model.GetGraphqlApiRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetGraphqlApi operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.GetGraphqlApiResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.GetGraphqlApiRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getGraphqlApiAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.GetGraphqlApiRequest request]
    (-> this (.getGraphqlApiAsync request))))

(defn get-resolver-async
  "Description copied from interface: AWSAppSyncAsync

  request - `com.amazonaws.services.appsync.model.GetResolverRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetResolver operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.GetResolverResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.GetResolverRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getResolverAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.GetResolverRequest request]
    (-> this (.getResolverAsync request))))

(defn delete-type-async
  "Description copied from interface: AWSAppSyncAsync

  request - `com.amazonaws.services.appsync.model.DeleteTypeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.DeleteTypeResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.DeleteTypeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTypeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.DeleteTypeRequest request]
    (-> this (.deleteTypeAsync request))))

(defn create-resolver-async
  "Description copied from interface: AWSAppSyncAsync

  request - `com.amazonaws.services.appsync.model.CreateResolverRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateResolver operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.CreateResolverResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.CreateResolverRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createResolverAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.CreateResolverRequest request]
    (-> this (.createResolverAsync request))))

(defn delete-api-key-async
  "Description copied from interface: AWSAppSyncAsync

  request - `com.amazonaws.services.appsync.model.DeleteApiKeyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApiKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.DeleteApiKeyResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.DeleteApiKeyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApiKeyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.DeleteApiKeyRequest request]
    (-> this (.deleteApiKeyAsync request))))

(defn start-schema-creation-async
  "Description copied from interface: AWSAppSyncAsync

  request - `com.amazonaws.services.appsync.model.StartSchemaCreationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartSchemaCreation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.StartSchemaCreationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.StartSchemaCreationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startSchemaCreationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.StartSchemaCreationRequest request]
    (-> this (.startSchemaCreationAsync request))))

(defn list-types-async
  "Description copied from interface: AWSAppSyncAsync

  request - `com.amazonaws.services.appsync.model.ListTypesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTypes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.ListTypesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.ListTypesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTypesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.ListTypesRequest request]
    (-> this (.listTypesAsync request))))

(defn update-api-key-async
  "Description copied from interface: AWSAppSyncAsync

  request - `com.amazonaws.services.appsync.model.UpdateApiKeyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateApiKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.UpdateApiKeyResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.UpdateApiKeyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateApiKeyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.UpdateApiKeyRequest request]
    (-> this (.updateApiKeyAsync request))))

(defn delete-resolver-async
  "Description copied from interface: AWSAppSyncAsync

  request - `com.amazonaws.services.appsync.model.DeleteResolverRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteResolver operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.DeleteResolverResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.DeleteResolverRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteResolverAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.DeleteResolverRequest request]
    (-> this (.deleteResolverAsync request))))

(defn get-function-async
  "Description copied from interface: AWSAppSyncAsync

  request - `com.amazonaws.services.appsync.model.GetFunctionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFunction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.GetFunctionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.GetFunctionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFunctionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.GetFunctionRequest request]
    (-> this (.getFunctionAsync request))))

(defn get-schema-creation-status-async
  "Description copied from interface: AWSAppSyncAsync

  request - `com.amazonaws.services.appsync.model.GetSchemaCreationStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSchemaCreationStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.GetSchemaCreationStatusResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.GetSchemaCreationStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSchemaCreationStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.GetSchemaCreationStatusRequest request]
    (-> this (.getSchemaCreationStatusAsync request))))

(defn update-type-async
  "Description copied from interface: AWSAppSyncAsync

  request - `com.amazonaws.services.appsync.model.UpdateTypeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.UpdateTypeResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.UpdateTypeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateTypeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.UpdateTypeRequest request]
    (-> this (.updateTypeAsync request))))

(defn update-data-source-async
  "Description copied from interface: AWSAppSyncAsync

  request - `com.amazonaws.services.appsync.model.UpdateDataSourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDataSource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.UpdateDataSourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.UpdateDataSourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDataSourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.UpdateDataSourceRequest request]
    (-> this (.updateDataSourceAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AWSAppSyncAsync

  request - `com.amazonaws.services.appsync.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn create-graphql-api-async
  "Description copied from interface: AWSAppSyncAsync

  request - `com.amazonaws.services.appsync.model.CreateGraphqlApiRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateGraphqlApi operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.CreateGraphqlApiResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.CreateGraphqlApiRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createGraphqlApiAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.CreateGraphqlApiRequest request]
    (-> this (.createGraphqlApiAsync request))))

(defn delete-function-async
  "Description copied from interface: AWSAppSyncAsync

  request - `com.amazonaws.services.appsync.model.DeleteFunctionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFunction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.DeleteFunctionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.DeleteFunctionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFunctionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.DeleteFunctionRequest request]
    (-> this (.deleteFunctionAsync request))))

(defn list-resolvers-by-function-async
  "Description copied from interface: AWSAppSyncAsync

  request - `com.amazonaws.services.appsync.model.ListResolversByFunctionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListResolversByFunction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.ListResolversByFunctionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.ListResolversByFunctionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listResolversByFunctionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.ListResolversByFunctionRequest request]
    (-> this (.listResolversByFunctionAsync request))))

(defn get-data-source-async
  "Description copied from interface: AWSAppSyncAsync

  request - `com.amazonaws.services.appsync.model.GetDataSourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDataSource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.GetDataSourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.GetDataSourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDataSourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.GetDataSourceRequest request]
    (-> this (.getDataSourceAsync request))))

(defn create-function-async
  "Description copied from interface: AWSAppSyncAsync

  request - `com.amazonaws.services.appsync.model.CreateFunctionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateFunction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.CreateFunctionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.CreateFunctionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createFunctionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.CreateFunctionRequest request]
    (-> this (.createFunctionAsync request))))

(defn list-data-sources-async
  "Description copied from interface: AWSAppSyncAsync

  request - `com.amazonaws.services.appsync.model.ListDataSourcesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDataSources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.ListDataSourcesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.ListDataSourcesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDataSourcesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.ListDataSourcesRequest request]
    (-> this (.listDataSourcesAsync request))))

(defn delete-graphql-api-async
  "Description copied from interface: AWSAppSyncAsync

  request - `com.amazonaws.services.appsync.model.DeleteGraphqlApiRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteGraphqlApi operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.DeleteGraphqlApiResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.DeleteGraphqlApiRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteGraphqlApiAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.DeleteGraphqlApiRequest request]
    (-> this (.deleteGraphqlApiAsync request))))

(defn delete-data-source-async
  "Description copied from interface: AWSAppSyncAsync

  request - `com.amazonaws.services.appsync.model.DeleteDataSourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDataSource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.DeleteDataSourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.DeleteDataSourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDataSourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.DeleteDataSourceRequest request]
    (-> this (.deleteDataSourceAsync request))))

(defn tag-resource-async
  "Description copied from interface: AWSAppSyncAsync

  request - `com.amazonaws.services.appsync.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn update-graphql-api-async
  "Description copied from interface: AWSAppSyncAsync

  request - `com.amazonaws.services.appsync.model.UpdateGraphqlApiRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateGraphqlApi operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.UpdateGraphqlApiResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.UpdateGraphqlApiRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateGraphqlApiAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.UpdateGraphqlApiRequest request]
    (-> this (.updateGraphqlApiAsync request))))

(defn update-function-async
  "Description copied from interface: AWSAppSyncAsync

  request - `com.amazonaws.services.appsync.model.UpdateFunctionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateFunction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.UpdateFunctionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.UpdateFunctionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateFunctionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.UpdateFunctionRequest request]
    (-> this (.updateFunctionAsync request))))

(defn create-api-key-async
  "Description copied from interface: AWSAppSyncAsync

  request - `com.amazonaws.services.appsync.model.CreateApiKeyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateApiKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.CreateApiKeyResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.CreateApiKeyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createApiKeyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.CreateApiKeyRequest request]
    (-> this (.createApiKeyAsync request))))

(defn list-resolvers-async
  "Description copied from interface: AWSAppSyncAsync

  request - `com.amazonaws.services.appsync.model.ListResolversRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListResolvers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.ListResolversResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.ListResolversRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listResolversAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.ListResolversRequest request]
    (-> this (.listResolversAsync request))))

(defn create-type-async
  "Description copied from interface: AWSAppSyncAsync

  request - `com.amazonaws.services.appsync.model.CreateTypeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.CreateTypeResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.CreateTypeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTypeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppSyncAsync this ^com.amazonaws.services.appsync.model.CreateTypeRequest request]
    (-> this (.createTypeAsync request))))

