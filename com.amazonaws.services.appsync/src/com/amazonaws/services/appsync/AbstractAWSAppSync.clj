(ns com.amazonaws.services.appsync.AbstractAWSAppSync
  "Abstract implementation of AWSAppSync. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.appsync AbstractAWSAppSync]))

(defn list-tags-for-resource
  "Description copied from interface: AWSAppSync

  request - `com.amazonaws.services.appsync.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.appsync.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.appsync.model.ListTagsForResourceResult [^AbstractAWSAppSync this ^com.amazonaws.services.appsync.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn list-resolvers-by-function
  "Description copied from interface: AWSAppSync

  request - `com.amazonaws.services.appsync.model.ListResolversByFunctionRequest`

  returns: Result of the ListResolversByFunction operation returned by the service. - `com.amazonaws.services.appsync.model.ListResolversByFunctionResult`"
  (^com.amazonaws.services.appsync.model.ListResolversByFunctionResult [^AbstractAWSAppSync this ^com.amazonaws.services.appsync.model.ListResolversByFunctionRequest request]
    (-> this (.listResolversByFunction request))))

(defn get-function
  "Description copied from interface: AWSAppSync

  request - `com.amazonaws.services.appsync.model.GetFunctionRequest`

  returns: Result of the GetFunction operation returned by the service. - `com.amazonaws.services.appsync.model.GetFunctionResult`"
  (^com.amazonaws.services.appsync.model.GetFunctionResult [^AbstractAWSAppSync this ^com.amazonaws.services.appsync.model.GetFunctionRequest request]
    (-> this (.getFunction request))))

(defn get-type
  "Description copied from interface: AWSAppSync

  request - `com.amazonaws.services.appsync.model.GetTypeRequest`

  returns: Result of the GetType operation returned by the service. - `com.amazonaws.services.appsync.model.GetTypeResult`"
  (^com.amazonaws.services.appsync.model.GetTypeResult [^AbstractAWSAppSync this ^com.amazonaws.services.appsync.model.GetTypeRequest request]
    (-> this (.getType request))))

(defn create-graphql-api
  "Description copied from interface: AWSAppSync

  request - `com.amazonaws.services.appsync.model.CreateGraphqlApiRequest`

  returns: Result of the CreateGraphqlApi operation returned by the service. - `com.amazonaws.services.appsync.model.CreateGraphqlApiResult`"
  (^com.amazonaws.services.appsync.model.CreateGraphqlApiResult [^AbstractAWSAppSync this ^com.amazonaws.services.appsync.model.CreateGraphqlApiRequest request]
    (-> this (.createGraphqlApi request))))

(defn list-data-sources
  "Description copied from interface: AWSAppSync

  request - `com.amazonaws.services.appsync.model.ListDataSourcesRequest`

  returns: Result of the ListDataSources operation returned by the service. - `com.amazonaws.services.appsync.model.ListDataSourcesResult`"
  (^com.amazonaws.services.appsync.model.ListDataSourcesResult [^AbstractAWSAppSync this ^com.amazonaws.services.appsync.model.ListDataSourcesRequest request]
    (-> this (.listDataSources request))))

(defn update-function
  "Description copied from interface: AWSAppSync

  request - `com.amazonaws.services.appsync.model.UpdateFunctionRequest`

  returns: Result of the UpdateFunction operation returned by the service. - `com.amazonaws.services.appsync.model.UpdateFunctionResult`"
  (^com.amazonaws.services.appsync.model.UpdateFunctionResult [^AbstractAWSAppSync this ^com.amazonaws.services.appsync.model.UpdateFunctionRequest request]
    (-> this (.updateFunction request))))

(defn list-functions
  "Description copied from interface: AWSAppSync

  request - `com.amazonaws.services.appsync.model.ListFunctionsRequest`

  returns: Result of the ListFunctions operation returned by the service. - `com.amazonaws.services.appsync.model.ListFunctionsResult`"
  (^com.amazonaws.services.appsync.model.ListFunctionsResult [^AbstractAWSAppSync this ^com.amazonaws.services.appsync.model.ListFunctionsRequest request]
    (-> this (.listFunctions request))))

(defn untag-resource
  "Description copied from interface: AWSAppSync

  request - `com.amazonaws.services.appsync.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.appsync.model.UntagResourceResult`"
  (^com.amazonaws.services.appsync.model.UntagResourceResult [^AbstractAWSAppSync this ^com.amazonaws.services.appsync.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn create-api-key
  "Description copied from interface: AWSAppSync

  request - `com.amazonaws.services.appsync.model.CreateApiKeyRequest`

  returns: Result of the CreateApiKey operation returned by the service. - `com.amazonaws.services.appsync.model.CreateApiKeyResult`"
  (^com.amazonaws.services.appsync.model.CreateApiKeyResult [^AbstractAWSAppSync this ^com.amazonaws.services.appsync.model.CreateApiKeyRequest request]
    (-> this (.createApiKey request))))

(defn delete-type
  "Description copied from interface: AWSAppSync

  request - `com.amazonaws.services.appsync.model.DeleteTypeRequest`

  returns: Result of the DeleteType operation returned by the service. - `com.amazonaws.services.appsync.model.DeleteTypeResult`"
  (^com.amazonaws.services.appsync.model.DeleteTypeResult [^AbstractAWSAppSync this ^com.amazonaws.services.appsync.model.DeleteTypeRequest request]
    (-> this (.deleteType request))))

(defn delete-api-key
  "Description copied from interface: AWSAppSync

  request - `com.amazonaws.services.appsync.model.DeleteApiKeyRequest`

  returns: Result of the DeleteApiKey operation returned by the service. - `com.amazonaws.services.appsync.model.DeleteApiKeyResult`"
  (^com.amazonaws.services.appsync.model.DeleteApiKeyResult [^AbstractAWSAppSync this ^com.amazonaws.services.appsync.model.DeleteApiKeyRequest request]
    (-> this (.deleteApiKey request))))

(defn start-schema-creation
  "Description copied from interface: AWSAppSync

  request - `com.amazonaws.services.appsync.model.StartSchemaCreationRequest`

  returns: Result of the StartSchemaCreation operation returned by the service. - `com.amazonaws.services.appsync.model.StartSchemaCreationResult`"
  (^com.amazonaws.services.appsync.model.StartSchemaCreationResult [^AbstractAWSAppSync this ^com.amazonaws.services.appsync.model.StartSchemaCreationRequest request]
    (-> this (.startSchemaCreation request))))

(defn create-resolver
  "Description copied from interface: AWSAppSync

  request - `com.amazonaws.services.appsync.model.CreateResolverRequest`

  returns: Result of the CreateResolver operation returned by the service. - `com.amazonaws.services.appsync.model.CreateResolverResult`"
  (^com.amazonaws.services.appsync.model.CreateResolverResult [^AbstractAWSAppSync this ^com.amazonaws.services.appsync.model.CreateResolverRequest request]
    (-> this (.createResolver request))))

(defn delete-graphql-api
  "Description copied from interface: AWSAppSync

  request - `com.amazonaws.services.appsync.model.DeleteGraphqlApiRequest`

  returns: Result of the DeleteGraphqlApi operation returned by the service. - `com.amazonaws.services.appsync.model.DeleteGraphqlApiResult`"
  (^com.amazonaws.services.appsync.model.DeleteGraphqlApiResult [^AbstractAWSAppSync this ^com.amazonaws.services.appsync.model.DeleteGraphqlApiRequest request]
    (-> this (.deleteGraphqlApi request))))

(defn list-graphql-apis
  "Description copied from interface: AWSAppSync

  request - `com.amazonaws.services.appsync.model.ListGraphqlApisRequest`

  returns: Result of the ListGraphqlApis operation returned by the service. - `com.amazonaws.services.appsync.model.ListGraphqlApisResult`"
  (^com.amazonaws.services.appsync.model.ListGraphqlApisResult [^AbstractAWSAppSync this ^com.amazonaws.services.appsync.model.ListGraphqlApisRequest request]
    (-> this (.listGraphqlApis request))))

(defn update-resolver
  "Description copied from interface: AWSAppSync

  request - `com.amazonaws.services.appsync.model.UpdateResolverRequest`

  returns: Result of the UpdateResolver operation returned by the service. - `com.amazonaws.services.appsync.model.UpdateResolverResult`"
  (^com.amazonaws.services.appsync.model.UpdateResolverResult [^AbstractAWSAppSync this ^com.amazonaws.services.appsync.model.UpdateResolverRequest request]
    (-> this (.updateResolver request))))

(defn create-data-source
  "Description copied from interface: AWSAppSync

  request - `com.amazonaws.services.appsync.model.CreateDataSourceRequest`

  returns: Result of the CreateDataSource operation returned by the service. - `com.amazonaws.services.appsync.model.CreateDataSourceResult`"
  (^com.amazonaws.services.appsync.model.CreateDataSourceResult [^AbstractAWSAppSync this ^com.amazonaws.services.appsync.model.CreateDataSourceRequest request]
    (-> this (.createDataSource request))))

(defn shutdown
  "Description copied from interface: AWSAppSync"
  ([^AbstractAWSAppSync this]
    (-> this (.shutdown))))

(defn get-resolver
  "Description copied from interface: AWSAppSync

  request - `com.amazonaws.services.appsync.model.GetResolverRequest`

  returns: Result of the GetResolver operation returned by the service. - `com.amazonaws.services.appsync.model.GetResolverResult`"
  (^com.amazonaws.services.appsync.model.GetResolverResult [^AbstractAWSAppSync this ^com.amazonaws.services.appsync.model.GetResolverRequest request]
    (-> this (.getResolver request))))

(defn list-resolvers
  "Description copied from interface: AWSAppSync

  request - `com.amazonaws.services.appsync.model.ListResolversRequest`

  returns: Result of the ListResolvers operation returned by the service. - `com.amazonaws.services.appsync.model.ListResolversResult`"
  (^com.amazonaws.services.appsync.model.ListResolversResult [^AbstractAWSAppSync this ^com.amazonaws.services.appsync.model.ListResolversRequest request]
    (-> this (.listResolvers request))))

(defn get-schema-creation-status
  "Description copied from interface: AWSAppSync

  request - `com.amazonaws.services.appsync.model.GetSchemaCreationStatusRequest`

  returns: Result of the GetSchemaCreationStatus operation returned by the service. - `com.amazonaws.services.appsync.model.GetSchemaCreationStatusResult`"
  (^com.amazonaws.services.appsync.model.GetSchemaCreationStatusResult [^AbstractAWSAppSync this ^com.amazonaws.services.appsync.model.GetSchemaCreationStatusRequest request]
    (-> this (.getSchemaCreationStatus request))))

(defn delete-data-source
  "Description copied from interface: AWSAppSync

  request - `com.amazonaws.services.appsync.model.DeleteDataSourceRequest`

  returns: Result of the DeleteDataSource operation returned by the service. - `com.amazonaws.services.appsync.model.DeleteDataSourceResult`"
  (^com.amazonaws.services.appsync.model.DeleteDataSourceResult [^AbstractAWSAppSync this ^com.amazonaws.services.appsync.model.DeleteDataSourceRequest request]
    (-> this (.deleteDataSource request))))

(defn create-type
  "Description copied from interface: AWSAppSync

  request - `com.amazonaws.services.appsync.model.CreateTypeRequest`

  returns: Result of the CreateType operation returned by the service. - `com.amazonaws.services.appsync.model.CreateTypeResult`"
  (^com.amazonaws.services.appsync.model.CreateTypeResult [^AbstractAWSAppSync this ^com.amazonaws.services.appsync.model.CreateTypeRequest request]
    (-> this (.createType request))))

(defn update-api-key
  "Description copied from interface: AWSAppSync

  request - `com.amazonaws.services.appsync.model.UpdateApiKeyRequest`

  returns: Result of the UpdateApiKey operation returned by the service. - `com.amazonaws.services.appsync.model.UpdateApiKeyResult`"
  (^com.amazonaws.services.appsync.model.UpdateApiKeyResult [^AbstractAWSAppSync this ^com.amazonaws.services.appsync.model.UpdateApiKeyRequest request]
    (-> this (.updateApiKey request))))

(defn create-function
  "Description copied from interface: AWSAppSync

  request - `com.amazonaws.services.appsync.model.CreateFunctionRequest`

  returns: Result of the CreateFunction operation returned by the service. - `com.amazonaws.services.appsync.model.CreateFunctionResult`"
  (^com.amazonaws.services.appsync.model.CreateFunctionResult [^AbstractAWSAppSync this ^com.amazonaws.services.appsync.model.CreateFunctionRequest request]
    (-> this (.createFunction request))))

(defn update-data-source
  "Description copied from interface: AWSAppSync

  request - `com.amazonaws.services.appsync.model.UpdateDataSourceRequest`

  returns: Result of the UpdateDataSource operation returned by the service. - `com.amazonaws.services.appsync.model.UpdateDataSourceResult`"
  (^com.amazonaws.services.appsync.model.UpdateDataSourceResult [^AbstractAWSAppSync this ^com.amazonaws.services.appsync.model.UpdateDataSourceRequest request]
    (-> this (.updateDataSource request))))

(defn update-type
  "Description copied from interface: AWSAppSync

  request - `com.amazonaws.services.appsync.model.UpdateTypeRequest`

  returns: Result of the UpdateType operation returned by the service. - `com.amazonaws.services.appsync.model.UpdateTypeResult`"
  (^com.amazonaws.services.appsync.model.UpdateTypeResult [^AbstractAWSAppSync this ^com.amazonaws.services.appsync.model.UpdateTypeRequest request]
    (-> this (.updateType request))))

(defn update-graphql-api
  "Description copied from interface: AWSAppSync

  request - `com.amazonaws.services.appsync.model.UpdateGraphqlApiRequest`

  returns: Result of the UpdateGraphqlApi operation returned by the service. - `com.amazonaws.services.appsync.model.UpdateGraphqlApiResult`"
  (^com.amazonaws.services.appsync.model.UpdateGraphqlApiResult [^AbstractAWSAppSync this ^com.amazonaws.services.appsync.model.UpdateGraphqlApiRequest request]
    (-> this (.updateGraphqlApi request))))

(defn list-types
  "Description copied from interface: AWSAppSync

  request - `com.amazonaws.services.appsync.model.ListTypesRequest`

  returns: Result of the ListTypes operation returned by the service. - `com.amazonaws.services.appsync.model.ListTypesResult`"
  (^com.amazonaws.services.appsync.model.ListTypesResult [^AbstractAWSAppSync this ^com.amazonaws.services.appsync.model.ListTypesRequest request]
    (-> this (.listTypes request))))

(defn delete-resolver
  "Description copied from interface: AWSAppSync

  request - `com.amazonaws.services.appsync.model.DeleteResolverRequest`

  returns: Result of the DeleteResolver operation returned by the service. - `com.amazonaws.services.appsync.model.DeleteResolverResult`"
  (^com.amazonaws.services.appsync.model.DeleteResolverResult [^AbstractAWSAppSync this ^com.amazonaws.services.appsync.model.DeleteResolverRequest request]
    (-> this (.deleteResolver request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSAppSync

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSAppSync this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-introspection-schema
  "Description copied from interface: AWSAppSync

  request - `com.amazonaws.services.appsync.model.GetIntrospectionSchemaRequest`

  returns: Result of the GetIntrospectionSchema operation returned by the service. - `com.amazonaws.services.appsync.model.GetIntrospectionSchemaResult`"
  (^com.amazonaws.services.appsync.model.GetIntrospectionSchemaResult [^AbstractAWSAppSync this ^com.amazonaws.services.appsync.model.GetIntrospectionSchemaRequest request]
    (-> this (.getIntrospectionSchema request))))

(defn list-api-keys
  "Description copied from interface: AWSAppSync

  request - `com.amazonaws.services.appsync.model.ListApiKeysRequest`

  returns: Result of the ListApiKeys operation returned by the service. - `com.amazonaws.services.appsync.model.ListApiKeysResult`"
  (^com.amazonaws.services.appsync.model.ListApiKeysResult [^AbstractAWSAppSync this ^com.amazonaws.services.appsync.model.ListApiKeysRequest request]
    (-> this (.listApiKeys request))))

(defn delete-function
  "Description copied from interface: AWSAppSync

  request - `com.amazonaws.services.appsync.model.DeleteFunctionRequest`

  returns: Result of the DeleteFunction operation returned by the service. - `com.amazonaws.services.appsync.model.DeleteFunctionResult`"
  (^com.amazonaws.services.appsync.model.DeleteFunctionResult [^AbstractAWSAppSync this ^com.amazonaws.services.appsync.model.DeleteFunctionRequest request]
    (-> this (.deleteFunction request))))

(defn get-graphql-api
  "Description copied from interface: AWSAppSync

  request - `com.amazonaws.services.appsync.model.GetGraphqlApiRequest`

  returns: Result of the GetGraphqlApi operation returned by the service. - `com.amazonaws.services.appsync.model.GetGraphqlApiResult`"
  (^com.amazonaws.services.appsync.model.GetGraphqlApiResult [^AbstractAWSAppSync this ^com.amazonaws.services.appsync.model.GetGraphqlApiRequest request]
    (-> this (.getGraphqlApi request))))

(defn tag-resource
  "Description copied from interface: AWSAppSync

  request - `com.amazonaws.services.appsync.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.appsync.model.TagResourceResult`"
  (^com.amazonaws.services.appsync.model.TagResourceResult [^AbstractAWSAppSync this ^com.amazonaws.services.appsync.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn get-data-source
  "Description copied from interface: AWSAppSync

  request - `com.amazonaws.services.appsync.model.GetDataSourceRequest`

  returns: Result of the GetDataSource operation returned by the service. - `com.amazonaws.services.appsync.model.GetDataSourceResult`"
  (^com.amazonaws.services.appsync.model.GetDataSourceResult [^AbstractAWSAppSync this ^com.amazonaws.services.appsync.model.GetDataSourceRequest request]
    (-> this (.getDataSource request))))

