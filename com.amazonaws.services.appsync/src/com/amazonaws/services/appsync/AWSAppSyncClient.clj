(ns com.amazonaws.services.appsync.AWSAppSyncClient
  "Client for accessing AWSAppSync. All service calls made using this client are blocking, and will not return until the
  service call completes.


  AWS AppSync provides API actions for creating and interacting with data sources using GraphQL from your application."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.appsync AWSAppSyncClient]))

(defn *builder
  "returns: `com.amazonaws.services.appsync.AWSAppSyncClientBuilder`"
  (^com.amazonaws.services.appsync.AWSAppSyncClientBuilder []
    (AWSAppSyncClient/builder )))

(defn list-tags-for-resource
  "Lists the tags for a resource.

  request - `com.amazonaws.services.appsync.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.appsync.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.ListTagsForResourceResult [^AWSAppSyncClient this ^com.amazonaws.services.appsync.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn list-resolvers-by-function
  "List the resolvers that are associated with a specific function.

  request - `com.amazonaws.services.appsync.model.ListResolversByFunctionRequest`

  returns: Result of the ListResolversByFunction operation returned by the service. - `com.amazonaws.services.appsync.model.ListResolversByFunctionResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.ListResolversByFunctionResult [^AWSAppSyncClient this ^com.amazonaws.services.appsync.model.ListResolversByFunctionRequest request]
    (-> this (.listResolversByFunction request))))

(defn get-function
  "Get a Function.

  request - `com.amazonaws.services.appsync.model.GetFunctionRequest`

  returns: Result of the GetFunction operation returned by the service. - `com.amazonaws.services.appsync.model.GetFunctionResult`

  throws: com.amazonaws.services.appsync.model.ConcurrentModificationException - Another modification is in progress at this time and it must complete before you can make your change."
  (^com.amazonaws.services.appsync.model.GetFunctionResult [^AWSAppSyncClient this ^com.amazonaws.services.appsync.model.GetFunctionRequest request]
    (-> this (.getFunction request))))

(defn get-type
  "Retrieves a Type object.

  request - `com.amazonaws.services.appsync.model.GetTypeRequest`

  returns: Result of the GetType operation returned by the service. - `com.amazonaws.services.appsync.model.GetTypeResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.GetTypeResult [^AWSAppSyncClient this ^com.amazonaws.services.appsync.model.GetTypeRequest request]
    (-> this (.getType request))))

(defn create-graphql-api
  "Creates a GraphqlApi object.

  request - `com.amazonaws.services.appsync.model.CreateGraphqlApiRequest`

  returns: Result of the CreateGraphqlApi operation returned by the service. - `com.amazonaws.services.appsync.model.CreateGraphqlApiResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.CreateGraphqlApiResult [^AWSAppSyncClient this ^com.amazonaws.services.appsync.model.CreateGraphqlApiRequest request]
    (-> this (.createGraphqlApi request))))

(defn list-data-sources
  "Lists the data sources for a given API.

  request - `com.amazonaws.services.appsync.model.ListDataSourcesRequest`

  returns: Result of the ListDataSources operation returned by the service. - `com.amazonaws.services.appsync.model.ListDataSourcesResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.ListDataSourcesResult [^AWSAppSyncClient this ^com.amazonaws.services.appsync.model.ListDataSourcesRequest request]
    (-> this (.listDataSources request))))

(defn update-function
  "Updates a Function object.

  request - `com.amazonaws.services.appsync.model.UpdateFunctionRequest`

  returns: Result of the UpdateFunction operation returned by the service. - `com.amazonaws.services.appsync.model.UpdateFunctionResult`

  throws: com.amazonaws.services.appsync.model.ConcurrentModificationException - Another modification is in progress at this time and it must complete before you can make your change."
  (^com.amazonaws.services.appsync.model.UpdateFunctionResult [^AWSAppSyncClient this ^com.amazonaws.services.appsync.model.UpdateFunctionRequest request]
    (-> this (.updateFunction request))))

(defn list-functions
  "List multiple functions.

  request - `com.amazonaws.services.appsync.model.ListFunctionsRequest`

  returns: Result of the ListFunctions operation returned by the service. - `com.amazonaws.services.appsync.model.ListFunctionsResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.ListFunctionsResult [^AWSAppSyncClient this ^com.amazonaws.services.appsync.model.ListFunctionsRequest request]
    (-> this (.listFunctions request))))

(defn untag-resource
  "Untags a resource.

  request - `com.amazonaws.services.appsync.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.appsync.model.UntagResourceResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.UntagResourceResult [^AWSAppSyncClient this ^com.amazonaws.services.appsync.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn create-api-key
  "Creates a unique key that you can distribute to clients who are executing your API.

  request - `com.amazonaws.services.appsync.model.CreateApiKeyRequest`

  returns: Result of the CreateApiKey operation returned by the service. - `com.amazonaws.services.appsync.model.CreateApiKeyResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.CreateApiKeyResult [^AWSAppSyncClient this ^com.amazonaws.services.appsync.model.CreateApiKeyRequest request]
    (-> this (.createApiKey request))))

(defn delete-type
  "Deletes a Type object.

  request - `com.amazonaws.services.appsync.model.DeleteTypeRequest`

  returns: Result of the DeleteType operation returned by the service. - `com.amazonaws.services.appsync.model.DeleteTypeResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.DeleteTypeResult [^AWSAppSyncClient this ^com.amazonaws.services.appsync.model.DeleteTypeRequest request]
    (-> this (.deleteType request))))

(defn delete-api-key
  "Deletes an API key.

  request - `com.amazonaws.services.appsync.model.DeleteApiKeyRequest`

  returns: Result of the DeleteApiKey operation returned by the service. - `com.amazonaws.services.appsync.model.DeleteApiKeyResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.DeleteApiKeyResult [^AWSAppSyncClient this ^com.amazonaws.services.appsync.model.DeleteApiKeyRequest request]
    (-> this (.deleteApiKey request))))

(defn start-schema-creation
  "Adds a new schema to your GraphQL API.


   This operation is asynchronous. Use to determine when it has completed.

  request - `com.amazonaws.services.appsync.model.StartSchemaCreationRequest`

  returns: Result of the StartSchemaCreation operation returned by the service. - `com.amazonaws.services.appsync.model.StartSchemaCreationResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.StartSchemaCreationResult [^AWSAppSyncClient this ^com.amazonaws.services.appsync.model.StartSchemaCreationRequest request]
    (-> this (.startSchemaCreation request))))

(defn create-resolver
  "Creates a Resolver object.


   A resolver converts incoming requests into a format that a data source can understand and converts the data
   source's responses into GraphQL.

  request - `com.amazonaws.services.appsync.model.CreateResolverRequest`

  returns: Result of the CreateResolver operation returned by the service. - `com.amazonaws.services.appsync.model.CreateResolverResult`

  throws: com.amazonaws.services.appsync.model.ConcurrentModificationException - Another modification is in progress at this time and it must complete before you can make your change."
  (^com.amazonaws.services.appsync.model.CreateResolverResult [^AWSAppSyncClient this ^com.amazonaws.services.appsync.model.CreateResolverRequest request]
    (-> this (.createResolver request))))

(defn delete-graphql-api
  "Deletes a GraphqlApi object.

  request - `com.amazonaws.services.appsync.model.DeleteGraphqlApiRequest`

  returns: Result of the DeleteGraphqlApi operation returned by the service. - `com.amazonaws.services.appsync.model.DeleteGraphqlApiResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.DeleteGraphqlApiResult [^AWSAppSyncClient this ^com.amazonaws.services.appsync.model.DeleteGraphqlApiRequest request]
    (-> this (.deleteGraphqlApi request))))

(defn list-graphql-apis
  "Lists your GraphQL APIs.

  request - `com.amazonaws.services.appsync.model.ListGraphqlApisRequest`

  returns: Result of the ListGraphqlApis operation returned by the service. - `com.amazonaws.services.appsync.model.ListGraphqlApisResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.ListGraphqlApisResult [^AWSAppSyncClient this ^com.amazonaws.services.appsync.model.ListGraphqlApisRequest request]
    (-> this (.listGraphqlApis request))))

(defn update-resolver
  "Updates a Resolver object.

  request - `com.amazonaws.services.appsync.model.UpdateResolverRequest`

  returns: Result of the UpdateResolver operation returned by the service. - `com.amazonaws.services.appsync.model.UpdateResolverResult`

  throws: com.amazonaws.services.appsync.model.ConcurrentModificationException - Another modification is in progress at this time and it must complete before you can make your change."
  (^com.amazonaws.services.appsync.model.UpdateResolverResult [^AWSAppSyncClient this ^com.amazonaws.services.appsync.model.UpdateResolverRequest request]
    (-> this (.updateResolver request))))

(defn create-data-source
  "Creates a DataSource object.

  request - `com.amazonaws.services.appsync.model.CreateDataSourceRequest`

  returns: Result of the CreateDataSource operation returned by the service. - `com.amazonaws.services.appsync.model.CreateDataSourceResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.CreateDataSourceResult [^AWSAppSyncClient this ^com.amazonaws.services.appsync.model.CreateDataSourceRequest request]
    (-> this (.createDataSource request))))

(defn get-resolver
  "Retrieves a Resolver object.

  request - `com.amazonaws.services.appsync.model.GetResolverRequest`

  returns: Result of the GetResolver operation returned by the service. - `com.amazonaws.services.appsync.model.GetResolverResult`

  throws: com.amazonaws.services.appsync.model.ConcurrentModificationException - Another modification is in progress at this time and it must complete before you can make your change."
  (^com.amazonaws.services.appsync.model.GetResolverResult [^AWSAppSyncClient this ^com.amazonaws.services.appsync.model.GetResolverRequest request]
    (-> this (.getResolver request))))

(defn list-resolvers
  "Lists the resolvers for a given API and type.

  request - `com.amazonaws.services.appsync.model.ListResolversRequest`

  returns: Result of the ListResolvers operation returned by the service. - `com.amazonaws.services.appsync.model.ListResolversResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.ListResolversResult [^AWSAppSyncClient this ^com.amazonaws.services.appsync.model.ListResolversRequest request]
    (-> this (.listResolvers request))))

(defn get-schema-creation-status
  "Retrieves the current status of a schema creation operation.

  request - `com.amazonaws.services.appsync.model.GetSchemaCreationStatusRequest`

  returns: Result of the GetSchemaCreationStatus operation returned by the service. - `com.amazonaws.services.appsync.model.GetSchemaCreationStatusResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.GetSchemaCreationStatusResult [^AWSAppSyncClient this ^com.amazonaws.services.appsync.model.GetSchemaCreationStatusRequest request]
    (-> this (.getSchemaCreationStatus request))))

(defn delete-data-source
  "Deletes a DataSource object.

  request - `com.amazonaws.services.appsync.model.DeleteDataSourceRequest`

  returns: Result of the DeleteDataSource operation returned by the service. - `com.amazonaws.services.appsync.model.DeleteDataSourceResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.DeleteDataSourceResult [^AWSAppSyncClient this ^com.amazonaws.services.appsync.model.DeleteDataSourceRequest request]
    (-> this (.deleteDataSource request))))

(defn create-type
  "Creates a Type object.

  request - `com.amazonaws.services.appsync.model.CreateTypeRequest`

  returns: Result of the CreateType operation returned by the service. - `com.amazonaws.services.appsync.model.CreateTypeResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.CreateTypeResult [^AWSAppSyncClient this ^com.amazonaws.services.appsync.model.CreateTypeRequest request]
    (-> this (.createType request))))

(defn update-api-key
  "Updates an API key.

  request - `com.amazonaws.services.appsync.model.UpdateApiKeyRequest`

  returns: Result of the UpdateApiKey operation returned by the service. - `com.amazonaws.services.appsync.model.UpdateApiKeyResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.UpdateApiKeyResult [^AWSAppSyncClient this ^com.amazonaws.services.appsync.model.UpdateApiKeyRequest request]
    (-> this (.updateApiKey request))))

(defn create-function
  "Creates a Function object.


   A function is a reusable entity. Multiple functions can be used to compose the resolver logic.

  request - `com.amazonaws.services.appsync.model.CreateFunctionRequest`

  returns: Result of the CreateFunction operation returned by the service. - `com.amazonaws.services.appsync.model.CreateFunctionResult`

  throws: com.amazonaws.services.appsync.model.ConcurrentModificationException - Another modification is in progress at this time and it must complete before you can make your change."
  (^com.amazonaws.services.appsync.model.CreateFunctionResult [^AWSAppSyncClient this ^com.amazonaws.services.appsync.model.CreateFunctionRequest request]
    (-> this (.createFunction request))))

(defn update-data-source
  "Updates a DataSource object.

  request - `com.amazonaws.services.appsync.model.UpdateDataSourceRequest`

  returns: Result of the UpdateDataSource operation returned by the service. - `com.amazonaws.services.appsync.model.UpdateDataSourceResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.UpdateDataSourceResult [^AWSAppSyncClient this ^com.amazonaws.services.appsync.model.UpdateDataSourceRequest request]
    (-> this (.updateDataSource request))))

(defn update-type
  "Updates a Type object.

  request - `com.amazonaws.services.appsync.model.UpdateTypeRequest`

  returns: Result of the UpdateType operation returned by the service. - `com.amazonaws.services.appsync.model.UpdateTypeResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.UpdateTypeResult [^AWSAppSyncClient this ^com.amazonaws.services.appsync.model.UpdateTypeRequest request]
    (-> this (.updateType request))))

(defn update-graphql-api
  "Updates a GraphqlApi object.

  request - `com.amazonaws.services.appsync.model.UpdateGraphqlApiRequest`

  returns: Result of the UpdateGraphqlApi operation returned by the service. - `com.amazonaws.services.appsync.model.UpdateGraphqlApiResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.UpdateGraphqlApiResult [^AWSAppSyncClient this ^com.amazonaws.services.appsync.model.UpdateGraphqlApiRequest request]
    (-> this (.updateGraphqlApi request))))

(defn list-types
  "Lists the types for a given API.

  request - `com.amazonaws.services.appsync.model.ListTypesRequest`

  returns: Result of the ListTypes operation returned by the service. - `com.amazonaws.services.appsync.model.ListTypesResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.ListTypesResult [^AWSAppSyncClient this ^com.amazonaws.services.appsync.model.ListTypesRequest request]
    (-> this (.listTypes request))))

(defn delete-resolver
  "Deletes a Resolver object.

  request - `com.amazonaws.services.appsync.model.DeleteResolverRequest`

  returns: Result of the DeleteResolver operation returned by the service. - `com.amazonaws.services.appsync.model.DeleteResolverResult`

  throws: com.amazonaws.services.appsync.model.ConcurrentModificationException - Another modification is in progress at this time and it must complete before you can make your change."
  (^com.amazonaws.services.appsync.model.DeleteResolverResult [^AWSAppSyncClient this ^com.amazonaws.services.appsync.model.DeleteResolverRequest request]
    (-> this (.deleteResolver request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSAppSyncClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-introspection-schema
  "Retrieves the introspection schema for a GraphQL API.

  request - `com.amazonaws.services.appsync.model.GetIntrospectionSchemaRequest`

  returns: Result of the GetIntrospectionSchema operation returned by the service. - `com.amazonaws.services.appsync.model.GetIntrospectionSchemaResult`

  throws: com.amazonaws.services.appsync.model.GraphQLSchemaException - The GraphQL schema is not valid."
  (^com.amazonaws.services.appsync.model.GetIntrospectionSchemaResult [^AWSAppSyncClient this ^com.amazonaws.services.appsync.model.GetIntrospectionSchemaRequest request]
    (-> this (.getIntrospectionSchema request))))

(defn list-api-keys
  "Lists the API keys for a given API.



   API keys are deleted automatically sometime after they expire. However, they may still be included in the
   response until they have actually been deleted. You can safely call DeleteApiKey to manually delete
   a key before it's automatically deleted.

  request - `com.amazonaws.services.appsync.model.ListApiKeysRequest`

  returns: Result of the ListApiKeys operation returned by the service. - `com.amazonaws.services.appsync.model.ListApiKeysResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.ListApiKeysResult [^AWSAppSyncClient this ^com.amazonaws.services.appsync.model.ListApiKeysRequest request]
    (-> this (.listApiKeys request))))

(defn delete-function
  "Deletes a Function.

  request - `com.amazonaws.services.appsync.model.DeleteFunctionRequest`

  returns: Result of the DeleteFunction operation returned by the service. - `com.amazonaws.services.appsync.model.DeleteFunctionResult`

  throws: com.amazonaws.services.appsync.model.ConcurrentModificationException - Another modification is in progress at this time and it must complete before you can make your change."
  (^com.amazonaws.services.appsync.model.DeleteFunctionResult [^AWSAppSyncClient this ^com.amazonaws.services.appsync.model.DeleteFunctionRequest request]
    (-> this (.deleteFunction request))))

(defn get-graphql-api
  "Retrieves a GraphqlApi object.

  request - `com.amazonaws.services.appsync.model.GetGraphqlApiRequest`

  returns: Result of the GetGraphqlApi operation returned by the service. - `com.amazonaws.services.appsync.model.GetGraphqlApiResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.GetGraphqlApiResult [^AWSAppSyncClient this ^com.amazonaws.services.appsync.model.GetGraphqlApiRequest request]
    (-> this (.getGraphqlApi request))))

(defn tag-resource
  "Tags a resource with user-supplied tags.

  request - `com.amazonaws.services.appsync.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.appsync.model.TagResourceResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.TagResourceResult [^AWSAppSyncClient this ^com.amazonaws.services.appsync.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn get-data-source
  "Retrieves a DataSource object.

  request - `com.amazonaws.services.appsync.model.GetDataSourceRequest`

  returns: Result of the GetDataSource operation returned by the service. - `com.amazonaws.services.appsync.model.GetDataSourceResult`

  throws: com.amazonaws.services.appsync.model.BadRequestException - The request is not well formed. For example, a value is invalid or a required field is missing. Check the field values, and then try again."
  (^com.amazonaws.services.appsync.model.GetDataSourceResult [^AWSAppSyncClient this ^com.amazonaws.services.appsync.model.GetDataSourceRequest request]
    (-> this (.getDataSource request))))

