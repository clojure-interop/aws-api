(ns com.amazonaws.services.appsync.AWSAppSyncAsync
  "Interface for accessing AWSAppSync asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSAppSyncAsync instead.



  AWS AppSync provides API actions for creating and interacting with data sources using GraphQL from your application."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.appsync AWSAppSyncAsync]))

(defn untag-resource-async
  "Untags a resource.

  untag-resource-request - `com.amazonaws.services.appsync.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn list-graphql-apis-async
  "Lists your GraphQL APIs.

  list-graphql-apis-request - `com.amazonaws.services.appsync.model.ListGraphqlApisRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGraphqlApis operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.ListGraphqlApisResult>`"
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.ListGraphqlApisRequest list-graphql-apis-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGraphqlApisAsync list-graphql-apis-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.ListGraphqlApisRequest list-graphql-apis-request]
    (-> this (.listGraphqlApisAsync list-graphql-apis-request))))

(defn update-resolver-async
  "Updates a Resolver object.

  update-resolver-request - `com.amazonaws.services.appsync.model.UpdateResolverRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateResolver operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.UpdateResolverResult>`"
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.UpdateResolverRequest update-resolver-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateResolverAsync update-resolver-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.UpdateResolverRequest update-resolver-request]
    (-> this (.updateResolverAsync update-resolver-request))))

(defn create-data-source-async
  "Creates a DataSource object.

  create-data-source-request - `com.amazonaws.services.appsync.model.CreateDataSourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDataSource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.CreateDataSourceResult>`"
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.CreateDataSourceRequest create-data-source-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDataSourceAsync create-data-source-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.CreateDataSourceRequest create-data-source-request]
    (-> this (.createDataSourceAsync create-data-source-request))))

(defn get-introspection-schema-async
  "Retrieves the introspection schema for a GraphQL API.

  get-introspection-schema-request - `com.amazonaws.services.appsync.model.GetIntrospectionSchemaRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetIntrospectionSchema operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.GetIntrospectionSchemaResult>`"
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.GetIntrospectionSchemaRequest get-introspection-schema-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIntrospectionSchemaAsync get-introspection-schema-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.GetIntrospectionSchemaRequest get-introspection-schema-request]
    (-> this (.getIntrospectionSchemaAsync get-introspection-schema-request))))

(defn get-type-async
  "Retrieves a Type object.

  get-type-request - `com.amazonaws.services.appsync.model.GetTypeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.GetTypeResult>`"
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.GetTypeRequest get-type-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTypeAsync get-type-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.GetTypeRequest get-type-request]
    (-> this (.getTypeAsync get-type-request))))

(defn list-functions-async
  "List multiple functions.

  list-functions-request - `com.amazonaws.services.appsync.model.ListFunctionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListFunctions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.ListFunctionsResult>`"
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.ListFunctionsRequest list-functions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listFunctionsAsync list-functions-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.ListFunctionsRequest list-functions-request]
    (-> this (.listFunctionsAsync list-functions-request))))

(defn list-api-keys-async
  "Lists the API keys for a given API.



   API keys are deleted automatically sometime after they expire. However, they may still be included in the
   response until they have actually been deleted. You can safely call DeleteApiKey to manually delete
   a key before it's automatically deleted.

  list-api-keys-request - `com.amazonaws.services.appsync.model.ListApiKeysRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListApiKeys operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.ListApiKeysResult>`"
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.ListApiKeysRequest list-api-keys-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listApiKeysAsync list-api-keys-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.ListApiKeysRequest list-api-keys-request]
    (-> this (.listApiKeysAsync list-api-keys-request))))

(defn get-graphql-api-async
  "Retrieves a GraphqlApi object.

  get-graphql-api-request - `com.amazonaws.services.appsync.model.GetGraphqlApiRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetGraphqlApi operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.GetGraphqlApiResult>`"
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.GetGraphqlApiRequest get-graphql-api-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getGraphqlApiAsync get-graphql-api-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.GetGraphqlApiRequest get-graphql-api-request]
    (-> this (.getGraphqlApiAsync get-graphql-api-request))))

(defn get-resolver-async
  "Retrieves a Resolver object.

  get-resolver-request - `com.amazonaws.services.appsync.model.GetResolverRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetResolver operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.GetResolverResult>`"
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.GetResolverRequest get-resolver-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getResolverAsync get-resolver-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.GetResolverRequest get-resolver-request]
    (-> this (.getResolverAsync get-resolver-request))))

(defn delete-type-async
  "Deletes a Type object.

  delete-type-request - `com.amazonaws.services.appsync.model.DeleteTypeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.DeleteTypeResult>`"
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.DeleteTypeRequest delete-type-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTypeAsync delete-type-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.DeleteTypeRequest delete-type-request]
    (-> this (.deleteTypeAsync delete-type-request))))

(defn create-resolver-async
  "Creates a Resolver object.


   A resolver converts incoming requests into a format that a data source can understand and converts the data
   source's responses into GraphQL.

  create-resolver-request - `com.amazonaws.services.appsync.model.CreateResolverRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateResolver operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.CreateResolverResult>`"
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.CreateResolverRequest create-resolver-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createResolverAsync create-resolver-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.CreateResolverRequest create-resolver-request]
    (-> this (.createResolverAsync create-resolver-request))))

(defn delete-api-key-async
  "Deletes an API key.

  delete-api-key-request - `com.amazonaws.services.appsync.model.DeleteApiKeyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApiKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.DeleteApiKeyResult>`"
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.DeleteApiKeyRequest delete-api-key-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApiKeyAsync delete-api-key-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.DeleteApiKeyRequest delete-api-key-request]
    (-> this (.deleteApiKeyAsync delete-api-key-request))))

(defn start-schema-creation-async
  "Adds a new schema to your GraphQL API.


   This operation is asynchronous. Use to determine when it has completed.

  start-schema-creation-request - `com.amazonaws.services.appsync.model.StartSchemaCreationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartSchemaCreation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.StartSchemaCreationResult>`"
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.StartSchemaCreationRequest start-schema-creation-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startSchemaCreationAsync start-schema-creation-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.StartSchemaCreationRequest start-schema-creation-request]
    (-> this (.startSchemaCreationAsync start-schema-creation-request))))

(defn list-types-async
  "Lists the types for a given API.

  list-types-request - `com.amazonaws.services.appsync.model.ListTypesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTypes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.ListTypesResult>`"
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.ListTypesRequest list-types-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTypesAsync list-types-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.ListTypesRequest list-types-request]
    (-> this (.listTypesAsync list-types-request))))

(defn update-api-key-async
  "Updates an API key.

  update-api-key-request - `com.amazonaws.services.appsync.model.UpdateApiKeyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateApiKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.UpdateApiKeyResult>`"
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.UpdateApiKeyRequest update-api-key-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateApiKeyAsync update-api-key-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.UpdateApiKeyRequest update-api-key-request]
    (-> this (.updateApiKeyAsync update-api-key-request))))

(defn delete-resolver-async
  "Deletes a Resolver object.

  delete-resolver-request - `com.amazonaws.services.appsync.model.DeleteResolverRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteResolver operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.DeleteResolverResult>`"
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.DeleteResolverRequest delete-resolver-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteResolverAsync delete-resolver-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.DeleteResolverRequest delete-resolver-request]
    (-> this (.deleteResolverAsync delete-resolver-request))))

(defn get-function-async
  "Get a Function.

  get-function-request - `com.amazonaws.services.appsync.model.GetFunctionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFunction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.GetFunctionResult>`"
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.GetFunctionRequest get-function-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFunctionAsync get-function-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.GetFunctionRequest get-function-request]
    (-> this (.getFunctionAsync get-function-request))))

(defn get-schema-creation-status-async
  "Retrieves the current status of a schema creation operation.

  get-schema-creation-status-request - `com.amazonaws.services.appsync.model.GetSchemaCreationStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSchemaCreationStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.GetSchemaCreationStatusResult>`"
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.GetSchemaCreationStatusRequest get-schema-creation-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSchemaCreationStatusAsync get-schema-creation-status-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.GetSchemaCreationStatusRequest get-schema-creation-status-request]
    (-> this (.getSchemaCreationStatusAsync get-schema-creation-status-request))))

(defn update-type-async
  "Updates a Type object.

  update-type-request - `com.amazonaws.services.appsync.model.UpdateTypeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.UpdateTypeResult>`"
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.UpdateTypeRequest update-type-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateTypeAsync update-type-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.UpdateTypeRequest update-type-request]
    (-> this (.updateTypeAsync update-type-request))))

(defn update-data-source-async
  "Updates a DataSource object.

  update-data-source-request - `com.amazonaws.services.appsync.model.UpdateDataSourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDataSource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.UpdateDataSourceResult>`"
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.UpdateDataSourceRequest update-data-source-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDataSourceAsync update-data-source-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.UpdateDataSourceRequest update-data-source-request]
    (-> this (.updateDataSourceAsync update-data-source-request))))

(defn list-tags-for-resource-async
  "Lists the tags for a resource.

  list-tags-for-resource-request - `com.amazonaws.services.appsync.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn create-graphql-api-async
  "Creates a GraphqlApi object.

  create-graphql-api-request - `com.amazonaws.services.appsync.model.CreateGraphqlApiRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateGraphqlApi operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.CreateGraphqlApiResult>`"
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.CreateGraphqlApiRequest create-graphql-api-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createGraphqlApiAsync create-graphql-api-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.CreateGraphqlApiRequest create-graphql-api-request]
    (-> this (.createGraphqlApiAsync create-graphql-api-request))))

(defn delete-function-async
  "Deletes a Function.

  delete-function-request - `com.amazonaws.services.appsync.model.DeleteFunctionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFunction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.DeleteFunctionResult>`"
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.DeleteFunctionRequest delete-function-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFunctionAsync delete-function-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.DeleteFunctionRequest delete-function-request]
    (-> this (.deleteFunctionAsync delete-function-request))))

(defn list-resolvers-by-function-async
  "List the resolvers that are associated with a specific function.

  list-resolvers-by-function-request - `com.amazonaws.services.appsync.model.ListResolversByFunctionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListResolversByFunction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.ListResolversByFunctionResult>`"
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.ListResolversByFunctionRequest list-resolvers-by-function-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listResolversByFunctionAsync list-resolvers-by-function-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.ListResolversByFunctionRequest list-resolvers-by-function-request]
    (-> this (.listResolversByFunctionAsync list-resolvers-by-function-request))))

(defn get-data-source-async
  "Retrieves a DataSource object.

  get-data-source-request - `com.amazonaws.services.appsync.model.GetDataSourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDataSource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.GetDataSourceResult>`"
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.GetDataSourceRequest get-data-source-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDataSourceAsync get-data-source-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.GetDataSourceRequest get-data-source-request]
    (-> this (.getDataSourceAsync get-data-source-request))))

(defn create-function-async
  "Creates a Function object.


   A function is a reusable entity. Multiple functions can be used to compose the resolver logic.

  create-function-request - `com.amazonaws.services.appsync.model.CreateFunctionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateFunction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.CreateFunctionResult>`"
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.CreateFunctionRequest create-function-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createFunctionAsync create-function-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.CreateFunctionRequest create-function-request]
    (-> this (.createFunctionAsync create-function-request))))

(defn list-data-sources-async
  "Lists the data sources for a given API.

  list-data-sources-request - `com.amazonaws.services.appsync.model.ListDataSourcesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDataSources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.ListDataSourcesResult>`"
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.ListDataSourcesRequest list-data-sources-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDataSourcesAsync list-data-sources-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.ListDataSourcesRequest list-data-sources-request]
    (-> this (.listDataSourcesAsync list-data-sources-request))))

(defn delete-graphql-api-async
  "Deletes a GraphqlApi object.

  delete-graphql-api-request - `com.amazonaws.services.appsync.model.DeleteGraphqlApiRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteGraphqlApi operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.DeleteGraphqlApiResult>`"
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.DeleteGraphqlApiRequest delete-graphql-api-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteGraphqlApiAsync delete-graphql-api-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.DeleteGraphqlApiRequest delete-graphql-api-request]
    (-> this (.deleteGraphqlApiAsync delete-graphql-api-request))))

(defn delete-data-source-async
  "Deletes a DataSource object.

  delete-data-source-request - `com.amazonaws.services.appsync.model.DeleteDataSourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDataSource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.DeleteDataSourceResult>`"
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.DeleteDataSourceRequest delete-data-source-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDataSourceAsync delete-data-source-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.DeleteDataSourceRequest delete-data-source-request]
    (-> this (.deleteDataSourceAsync delete-data-source-request))))

(defn tag-resource-async
  "Tags a resource with user-supplied tags.

  tag-resource-request - `com.amazonaws.services.appsync.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn update-graphql-api-async
  "Updates a GraphqlApi object.

  update-graphql-api-request - `com.amazonaws.services.appsync.model.UpdateGraphqlApiRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateGraphqlApi operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.UpdateGraphqlApiResult>`"
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.UpdateGraphqlApiRequest update-graphql-api-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateGraphqlApiAsync update-graphql-api-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.UpdateGraphqlApiRequest update-graphql-api-request]
    (-> this (.updateGraphqlApiAsync update-graphql-api-request))))

(defn update-function-async
  "Updates a Function object.

  update-function-request - `com.amazonaws.services.appsync.model.UpdateFunctionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateFunction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.UpdateFunctionResult>`"
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.UpdateFunctionRequest update-function-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateFunctionAsync update-function-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.UpdateFunctionRequest update-function-request]
    (-> this (.updateFunctionAsync update-function-request))))

(defn create-api-key-async
  "Creates a unique key that you can distribute to clients who are executing your API.

  create-api-key-request - `com.amazonaws.services.appsync.model.CreateApiKeyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateApiKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.CreateApiKeyResult>`"
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.CreateApiKeyRequest create-api-key-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createApiKeyAsync create-api-key-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.CreateApiKeyRequest create-api-key-request]
    (-> this (.createApiKeyAsync create-api-key-request))))

(defn list-resolvers-async
  "Lists the resolvers for a given API and type.

  list-resolvers-request - `com.amazonaws.services.appsync.model.ListResolversRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListResolvers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.ListResolversResult>`"
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.ListResolversRequest list-resolvers-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listResolversAsync list-resolvers-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.ListResolversRequest list-resolvers-request]
    (-> this (.listResolversAsync list-resolvers-request))))

(defn create-type-async
  "Creates a Type object.

  create-type-request - `com.amazonaws.services.appsync.model.CreateTypeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appsync.model.CreateTypeResult>`"
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.CreateTypeRequest create-type-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTypeAsync create-type-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppSyncAsync this ^com.amazonaws.services.appsync.model.CreateTypeRequest create-type-request]
    (-> this (.createTypeAsync create-type-request))))

