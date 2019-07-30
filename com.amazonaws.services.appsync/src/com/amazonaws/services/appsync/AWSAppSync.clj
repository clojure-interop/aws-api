(ns com.amazonaws.services.appsync.AWSAppSync
  "Interface for accessing AWSAppSync.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSAppSync instead.



  AWS AppSync provides API actions for creating and interacting with data sources using GraphQL from your application."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.appsync AWSAppSync]))

(defn list-tags-for-resource
  "Lists the tags for a resource.

  list-tags-for-resource-request - `com.amazonaws.services.appsync.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.appsync.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.ListTagsForResourceResult [^AWSAppSync this ^com.amazonaws.services.appsync.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn list-resolvers-by-function
  "List the resolvers that are associated with a specific function.

  list-resolvers-by-function-request - `com.amazonaws.services.appsync.model.ListResolversByFunctionRequest`

  returns: Result of the ListResolversByFunction operation returned by the service. - `com.amazonaws.services.appsync.model.ListResolversByFunctionResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.ListResolversByFunctionResult [^AWSAppSync this ^com.amazonaws.services.appsync.model.ListResolversByFunctionRequest list-resolvers-by-function-request]
    (-> this (.listResolversByFunction list-resolvers-by-function-request))))

(defn get-function
  "Get a Function.

  get-function-request - `com.amazonaws.services.appsync.model.GetFunctionRequest`

  returns: Result of the GetFunction operation returned by the service. - `com.amazonaws.services.appsync.model.GetFunctionResult`

  throws: com.amazonaws.services.appsync.model.ConcurrentModificationException - Another modification is in progress at this time and it must complete before you can make your change."
  (^com.amazonaws.services.appsync.model.GetFunctionResult [^AWSAppSync this ^com.amazonaws.services.appsync.model.GetFunctionRequest get-function-request]
    (-> this (.getFunction get-function-request))))

(defn get-type
  "Retrieves a Type object.

  get-type-request - `com.amazonaws.services.appsync.model.GetTypeRequest`

  returns: Result of the GetType operation returned by the service. - `com.amazonaws.services.appsync.model.GetTypeResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.GetTypeResult [^AWSAppSync this ^com.amazonaws.services.appsync.model.GetTypeRequest get-type-request]
    (-> this (.getType get-type-request))))

(defn create-graphql-api
  "Creates a GraphqlApi object.

  create-graphql-api-request - `com.amazonaws.services.appsync.model.CreateGraphqlApiRequest`

  returns: Result of the CreateGraphqlApi operation returned by the service. - `com.amazonaws.services.appsync.model.CreateGraphqlApiResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.CreateGraphqlApiResult [^AWSAppSync this ^com.amazonaws.services.appsync.model.CreateGraphqlApiRequest create-graphql-api-request]
    (-> this (.createGraphqlApi create-graphql-api-request))))

(defn list-data-sources
  "Lists the data sources for a given API.

  list-data-sources-request - `com.amazonaws.services.appsync.model.ListDataSourcesRequest`

  returns: Result of the ListDataSources operation returned by the service. - `com.amazonaws.services.appsync.model.ListDataSourcesResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.ListDataSourcesResult [^AWSAppSync this ^com.amazonaws.services.appsync.model.ListDataSourcesRequest list-data-sources-request]
    (-> this (.listDataSources list-data-sources-request))))

(defn update-function
  "Updates a Function object.

  update-function-request - `com.amazonaws.services.appsync.model.UpdateFunctionRequest`

  returns: Result of the UpdateFunction operation returned by the service. - `com.amazonaws.services.appsync.model.UpdateFunctionResult`

  throws: com.amazonaws.services.appsync.model.ConcurrentModificationException - Another modification is in progress at this time and it must complete before you can make your change."
  (^com.amazonaws.services.appsync.model.UpdateFunctionResult [^AWSAppSync this ^com.amazonaws.services.appsync.model.UpdateFunctionRequest update-function-request]
    (-> this (.updateFunction update-function-request))))

(defn list-functions
  "List multiple functions.

  list-functions-request - `com.amazonaws.services.appsync.model.ListFunctionsRequest`

  returns: Result of the ListFunctions operation returned by the service. - `com.amazonaws.services.appsync.model.ListFunctionsResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.ListFunctionsResult [^AWSAppSync this ^com.amazonaws.services.appsync.model.ListFunctionsRequest list-functions-request]
    (-> this (.listFunctions list-functions-request))))

(defn untag-resource
  "Untags a resource.

  untag-resource-request - `com.amazonaws.services.appsync.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.appsync.model.UntagResourceResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.UntagResourceResult [^AWSAppSync this ^com.amazonaws.services.appsync.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn create-api-key
  "Creates a unique key that you can distribute to clients who are executing your API.

  create-api-key-request - `com.amazonaws.services.appsync.model.CreateApiKeyRequest`

  returns: Result of the CreateApiKey operation returned by the service. - `com.amazonaws.services.appsync.model.CreateApiKeyResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.CreateApiKeyResult [^AWSAppSync this ^com.amazonaws.services.appsync.model.CreateApiKeyRequest create-api-key-request]
    (-> this (.createApiKey create-api-key-request))))

(defn delete-type
  "Deletes a Type object.

  delete-type-request - `com.amazonaws.services.appsync.model.DeleteTypeRequest`

  returns: Result of the DeleteType operation returned by the service. - `com.amazonaws.services.appsync.model.DeleteTypeResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.DeleteTypeResult [^AWSAppSync this ^com.amazonaws.services.appsync.model.DeleteTypeRequest delete-type-request]
    (-> this (.deleteType delete-type-request))))

(defn delete-api-key
  "Deletes an API key.

  delete-api-key-request - `com.amazonaws.services.appsync.model.DeleteApiKeyRequest`

  returns: Result of the DeleteApiKey operation returned by the service. - `com.amazonaws.services.appsync.model.DeleteApiKeyResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.DeleteApiKeyResult [^AWSAppSync this ^com.amazonaws.services.appsync.model.DeleteApiKeyRequest delete-api-key-request]
    (-> this (.deleteApiKey delete-api-key-request))))

(defn start-schema-creation
  "Adds a new schema to your GraphQL API.


   This operation is asynchronous. Use to determine when it has completed.

  start-schema-creation-request - `com.amazonaws.services.appsync.model.StartSchemaCreationRequest`

  returns: Result of the StartSchemaCreation operation returned by the service. - `com.amazonaws.services.appsync.model.StartSchemaCreationResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.StartSchemaCreationResult [^AWSAppSync this ^com.amazonaws.services.appsync.model.StartSchemaCreationRequest start-schema-creation-request]
    (-> this (.startSchemaCreation start-schema-creation-request))))

(defn create-resolver
  "Creates a Resolver object.


   A resolver converts incoming requests into a format that a data source can understand and converts the data
   source's responses into GraphQL.

  create-resolver-request - `com.amazonaws.services.appsync.model.CreateResolverRequest`

  returns: Result of the CreateResolver operation returned by the service. - `com.amazonaws.services.appsync.model.CreateResolverResult`

  throws: com.amazonaws.services.appsync.model.ConcurrentModificationException - Another modification is in progress at this time and it must complete before you can make your change."
  (^com.amazonaws.services.appsync.model.CreateResolverResult [^AWSAppSync this ^com.amazonaws.services.appsync.model.CreateResolverRequest create-resolver-request]
    (-> this (.createResolver create-resolver-request))))

(defn delete-graphql-api
  "Deletes a GraphqlApi object.

  delete-graphql-api-request - `com.amazonaws.services.appsync.model.DeleteGraphqlApiRequest`

  returns: Result of the DeleteGraphqlApi operation returned by the service. - `com.amazonaws.services.appsync.model.DeleteGraphqlApiResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.DeleteGraphqlApiResult [^AWSAppSync this ^com.amazonaws.services.appsync.model.DeleteGraphqlApiRequest delete-graphql-api-request]
    (-> this (.deleteGraphqlApi delete-graphql-api-request))))

(defn list-graphql-apis
  "Lists your GraphQL APIs.

  list-graphql-apis-request - `com.amazonaws.services.appsync.model.ListGraphqlApisRequest`

  returns: Result of the ListGraphqlApis operation returned by the service. - `com.amazonaws.services.appsync.model.ListGraphqlApisResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.ListGraphqlApisResult [^AWSAppSync this ^com.amazonaws.services.appsync.model.ListGraphqlApisRequest list-graphql-apis-request]
    (-> this (.listGraphqlApis list-graphql-apis-request))))

(defn update-resolver
  "Updates a Resolver object.

  update-resolver-request - `com.amazonaws.services.appsync.model.UpdateResolverRequest`

  returns: Result of the UpdateResolver operation returned by the service. - `com.amazonaws.services.appsync.model.UpdateResolverResult`

  throws: com.amazonaws.services.appsync.model.ConcurrentModificationException - Another modification is in progress at this time and it must complete before you can make your change."
  (^com.amazonaws.services.appsync.model.UpdateResolverResult [^AWSAppSync this ^com.amazonaws.services.appsync.model.UpdateResolverRequest update-resolver-request]
    (-> this (.updateResolver update-resolver-request))))

(defn create-data-source
  "Creates a DataSource object.

  create-data-source-request - `com.amazonaws.services.appsync.model.CreateDataSourceRequest`

  returns: Result of the CreateDataSource operation returned by the service. - `com.amazonaws.services.appsync.model.CreateDataSourceResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.CreateDataSourceResult [^AWSAppSync this ^com.amazonaws.services.appsync.model.CreateDataSourceRequest create-data-source-request]
    (-> this (.createDataSource create-data-source-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSAppSync this]
    (-> this (.shutdown))))

(defn get-resolver
  "Retrieves a Resolver object.

  get-resolver-request - `com.amazonaws.services.appsync.model.GetResolverRequest`

  returns: Result of the GetResolver operation returned by the service. - `com.amazonaws.services.appsync.model.GetResolverResult`

  throws: com.amazonaws.services.appsync.model.ConcurrentModificationException - Another modification is in progress at this time and it must complete before you can make your change."
  (^com.amazonaws.services.appsync.model.GetResolverResult [^AWSAppSync this ^com.amazonaws.services.appsync.model.GetResolverRequest get-resolver-request]
    (-> this (.getResolver get-resolver-request))))

(defn list-resolvers
  "Lists the resolvers for a given API and type.

  list-resolvers-request - `com.amazonaws.services.appsync.model.ListResolversRequest`

  returns: Result of the ListResolvers operation returned by the service. - `com.amazonaws.services.appsync.model.ListResolversResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.ListResolversResult [^AWSAppSync this ^com.amazonaws.services.appsync.model.ListResolversRequest list-resolvers-request]
    (-> this (.listResolvers list-resolvers-request))))

(defn get-schema-creation-status
  "Retrieves the current status of a schema creation operation.

  get-schema-creation-status-request - `com.amazonaws.services.appsync.model.GetSchemaCreationStatusRequest`

  returns: Result of the GetSchemaCreationStatus operation returned by the service. - `com.amazonaws.services.appsync.model.GetSchemaCreationStatusResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.GetSchemaCreationStatusResult [^AWSAppSync this ^com.amazonaws.services.appsync.model.GetSchemaCreationStatusRequest get-schema-creation-status-request]
    (-> this (.getSchemaCreationStatus get-schema-creation-status-request))))

(defn delete-data-source
  "Deletes a DataSource object.

  delete-data-source-request - `com.amazonaws.services.appsync.model.DeleteDataSourceRequest`

  returns: Result of the DeleteDataSource operation returned by the service. - `com.amazonaws.services.appsync.model.DeleteDataSourceResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.DeleteDataSourceResult [^AWSAppSync this ^com.amazonaws.services.appsync.model.DeleteDataSourceRequest delete-data-source-request]
    (-> this (.deleteDataSource delete-data-source-request))))

(defn create-type
  "Creates a Type object.

  create-type-request - `com.amazonaws.services.appsync.model.CreateTypeRequest`

  returns: Result of the CreateType operation returned by the service. - `com.amazonaws.services.appsync.model.CreateTypeResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.CreateTypeResult [^AWSAppSync this ^com.amazonaws.services.appsync.model.CreateTypeRequest create-type-request]
    (-> this (.createType create-type-request))))

(defn update-api-key
  "Updates an API key.

  update-api-key-request - `com.amazonaws.services.appsync.model.UpdateApiKeyRequest`

  returns: Result of the UpdateApiKey operation returned by the service. - `com.amazonaws.services.appsync.model.UpdateApiKeyResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.UpdateApiKeyResult [^AWSAppSync this ^com.amazonaws.services.appsync.model.UpdateApiKeyRequest update-api-key-request]
    (-> this (.updateApiKey update-api-key-request))))

(defn create-function
  "Creates a Function object.


   A function is a reusable entity. Multiple functions can be used to compose the resolver logic.

  create-function-request - `com.amazonaws.services.appsync.model.CreateFunctionRequest`

  returns: Result of the CreateFunction operation returned by the service. - `com.amazonaws.services.appsync.model.CreateFunctionResult`

  throws: com.amazonaws.services.appsync.model.ConcurrentModificationException - Another modification is in progress at this time and it must complete before you can make your change."
  (^com.amazonaws.services.appsync.model.CreateFunctionResult [^AWSAppSync this ^com.amazonaws.services.appsync.model.CreateFunctionRequest create-function-request]
    (-> this (.createFunction create-function-request))))

(defn update-data-source
  "Updates a DataSource object.

  update-data-source-request - `com.amazonaws.services.appsync.model.UpdateDataSourceRequest`

  returns: Result of the UpdateDataSource operation returned by the service. - `com.amazonaws.services.appsync.model.UpdateDataSourceResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.UpdateDataSourceResult [^AWSAppSync this ^com.amazonaws.services.appsync.model.UpdateDataSourceRequest update-data-source-request]
    (-> this (.updateDataSource update-data-source-request))))

(defn update-type
  "Updates a Type object.

  update-type-request - `com.amazonaws.services.appsync.model.UpdateTypeRequest`

  returns: Result of the UpdateType operation returned by the service. - `com.amazonaws.services.appsync.model.UpdateTypeResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.UpdateTypeResult [^AWSAppSync this ^com.amazonaws.services.appsync.model.UpdateTypeRequest update-type-request]
    (-> this (.updateType update-type-request))))

(defn update-graphql-api
  "Updates a GraphqlApi object.

  update-graphql-api-request - `com.amazonaws.services.appsync.model.UpdateGraphqlApiRequest`

  returns: Result of the UpdateGraphqlApi operation returned by the service. - `com.amazonaws.services.appsync.model.UpdateGraphqlApiResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.UpdateGraphqlApiResult [^AWSAppSync this ^com.amazonaws.services.appsync.model.UpdateGraphqlApiRequest update-graphql-api-request]
    (-> this (.updateGraphqlApi update-graphql-api-request))))

(defn list-types
  "Lists the types for a given API.

  list-types-request - `com.amazonaws.services.appsync.model.ListTypesRequest`

  returns: Result of the ListTypes operation returned by the service. - `com.amazonaws.services.appsync.model.ListTypesResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.ListTypesResult [^AWSAppSync this ^com.amazonaws.services.appsync.model.ListTypesRequest list-types-request]
    (-> this (.listTypes list-types-request))))

(defn delete-resolver
  "Deletes a Resolver object.

  delete-resolver-request - `com.amazonaws.services.appsync.model.DeleteResolverRequest`

  returns: Result of the DeleteResolver operation returned by the service. - `com.amazonaws.services.appsync.model.DeleteResolverResult`

  throws: com.amazonaws.services.appsync.model.ConcurrentModificationException - Another modification is in progress at this time and it must complete before you can make your change."
  (^com.amazonaws.services.appsync.model.DeleteResolverResult [^AWSAppSync this ^com.amazonaws.services.appsync.model.DeleteResolverRequest delete-resolver-request]
    (-> this (.deleteResolver delete-resolver-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSAppSync this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-introspection-schema
  "Retrieves the introspection schema for a GraphQL API.

  get-introspection-schema-request - `com.amazonaws.services.appsync.model.GetIntrospectionSchemaRequest`

  returns: Result of the GetIntrospectionSchema operation returned by the service. - `com.amazonaws.services.appsync.model.GetIntrospectionSchemaResult`

  throws: com.amazonaws.services.appsync.model.GraphQLSchemaException - The GraphQL schema is not valid."
  (^com.amazonaws.services.appsync.model.GetIntrospectionSchemaResult [^AWSAppSync this ^com.amazonaws.services.appsync.model.GetIntrospectionSchemaRequest get-introspection-schema-request]
    (-> this (.getIntrospectionSchema get-introspection-schema-request))))

(defn list-api-keys
  "Lists the API keys for a given API.



   API keys are deleted automatically sometime after they expire. However, they may still be included in the
   response until they have actually been deleted. You can safely call DeleteApiKey to manually delete
   a key before it's automatically deleted.

  list-api-keys-request - `com.amazonaws.services.appsync.model.ListApiKeysRequest`

  returns: Result of the ListApiKeys operation returned by the service. - `com.amazonaws.services.appsync.model.ListApiKeysResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.ListApiKeysResult [^AWSAppSync this ^com.amazonaws.services.appsync.model.ListApiKeysRequest list-api-keys-request]
    (-> this (.listApiKeys list-api-keys-request))))

(defn delete-function
  "Deletes a Function.

  delete-function-request - `com.amazonaws.services.appsync.model.DeleteFunctionRequest`

  returns: Result of the DeleteFunction operation returned by the service. - `com.amazonaws.services.appsync.model.DeleteFunctionResult`

  throws: com.amazonaws.services.appsync.model.ConcurrentModificationException - Another modification is in progress at this time and it must complete before you can make your change."
  (^com.amazonaws.services.appsync.model.DeleteFunctionResult [^AWSAppSync this ^com.amazonaws.services.appsync.model.DeleteFunctionRequest delete-function-request]
    (-> this (.deleteFunction delete-function-request))))

(defn get-graphql-api
  "Retrieves a GraphqlApi object.

  get-graphql-api-request - `com.amazonaws.services.appsync.model.GetGraphqlApiRequest`

  returns: Result of the GetGraphqlApi operation returned by the service. - `com.amazonaws.services.appsync.model.GetGraphqlApiResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.GetGraphqlApiResult [^AWSAppSync this ^com.amazonaws.services.appsync.model.GetGraphqlApiRequest get-graphql-api-request]
    (-> this (.getGraphqlApi get-graphql-api-request))))

(defn tag-resource
  "Tags a resource with user-supplied tags.

  tag-resource-request - `com.amazonaws.services.appsync.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.appsync.model.TagResourceResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.TagResourceResult [^AWSAppSync this ^com.amazonaws.services.appsync.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

(defn get-data-source
  "Retrieves a DataSource object.

  get-data-source-request - `com.amazonaws.services.appsync.model.GetDataSourceRequest`

  returns: Result of the GetDataSource operation returned by the service. - `com.amazonaws.services.appsync.model.GetDataSourceResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.GetDataSourceResult [^AWSAppSync this ^com.amazonaws.services.appsync.model.GetDataSourceRequest get-data-source-request]
    (-> this (.getDataSource get-data-source-request))))

