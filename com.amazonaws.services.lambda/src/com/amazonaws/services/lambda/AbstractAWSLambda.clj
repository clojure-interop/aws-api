(ns com.amazonaws.services.lambda.AbstractAWSLambda
  "Abstract implementation of AWSLambda. Convenient method forms pass through to the corresponding overload that
  takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.lambda AbstractAWSLambda]))

(defn publish-version
  "Description copied from interface: AWSLambda

  request - `com.amazonaws.services.lambda.model.PublishVersionRequest`

  returns: Result of the PublishVersion operation returned by the service. - `com.amazonaws.services.lambda.model.PublishVersionResult`"
  (^com.amazonaws.services.lambda.model.PublishVersionResult [^AbstractAWSLambda this ^com.amazonaws.services.lambda.model.PublishVersionRequest request]
    (-> this (.publishVersion request))))

(defn invoke
  "Description copied from interface: AWSLambda

  request - `com.amazonaws.services.lambda.model.InvokeRequest`

  returns: Result of the Invoke operation returned by the service. - `com.amazonaws.services.lambda.model.InvokeResult`"
  (^com.amazonaws.services.lambda.model.InvokeResult [^AbstractAWSLambda this ^com.amazonaws.services.lambda.model.InvokeRequest request]
    (-> this (.invoke request))))

(defn set-region
  "Description copied from interface: AWSLambda

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAWSLambda this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn get-layer-version-policy
  "Description copied from interface: AWSLambda

  request - `com.amazonaws.services.lambda.model.GetLayerVersionPolicyRequest`

  returns: Result of the GetLayerVersionPolicy operation returned by the service. - `com.amazonaws.services.lambda.model.GetLayerVersionPolicyResult`"
  (^com.amazonaws.services.lambda.model.GetLayerVersionPolicyResult [^AbstractAWSLambda this ^com.amazonaws.services.lambda.model.GetLayerVersionPolicyRequest request]
    (-> this (.getLayerVersionPolicy request))))

(defn waiters
  "returns: `com.amazonaws.services.lambda.waiters.AWSLambdaWaiters`"
  (^com.amazonaws.services.lambda.waiters.AWSLambdaWaiters [^AbstractAWSLambda this]
    (-> this (.waiters))))

(defn get-function
  "Description copied from interface: AWSLambda

  request - `com.amazonaws.services.lambda.model.GetFunctionRequest`

  returns: Result of the GetFunction operation returned by the service. - `com.amazonaws.services.lambda.model.GetFunctionResult`"
  (^com.amazonaws.services.lambda.model.GetFunctionResult [^AbstractAWSLambda this ^com.amazonaws.services.lambda.model.GetFunctionRequest request]
    (-> this (.getFunction request))))

(defn list-tags
  "Description copied from interface: AWSLambda

  request - `com.amazonaws.services.lambda.model.ListTagsRequest`

  returns: Result of the ListTags operation returned by the service. - `com.amazonaws.services.lambda.model.ListTagsResult`"
  (^com.amazonaws.services.lambda.model.ListTagsResult [^AbstractAWSLambda this ^com.amazonaws.services.lambda.model.ListTagsRequest request]
    (-> this (.listTags request))))

(defn list-layers
  "Description copied from interface: AWSLambda

  request - `com.amazonaws.services.lambda.model.ListLayersRequest`

  returns: Result of the ListLayers operation returned by the service. - `com.amazonaws.services.lambda.model.ListLayersResult`"
  (^com.amazonaws.services.lambda.model.ListLayersResult [^AbstractAWSLambda this ^com.amazonaws.services.lambda.model.ListLayersRequest request]
    (-> this (.listLayers request))))

(defn update-event-source-mapping
  "Description copied from interface: AWSLambda

  request - `com.amazonaws.services.lambda.model.UpdateEventSourceMappingRequest`

  returns: Result of the UpdateEventSourceMapping operation returned by the service. - `com.amazonaws.services.lambda.model.UpdateEventSourceMappingResult`"
  (^com.amazonaws.services.lambda.model.UpdateEventSourceMappingResult [^AbstractAWSLambda this ^com.amazonaws.services.lambda.model.UpdateEventSourceMappingRequest request]
    (-> this (.updateEventSourceMapping request))))

(defn publish-layer-version
  "Description copied from interface: AWSLambda

  request - `com.amazonaws.services.lambda.model.PublishLayerVersionRequest`

  returns: Result of the PublishLayerVersion operation returned by the service. - `com.amazonaws.services.lambda.model.PublishLayerVersionResult`"
  (^com.amazonaws.services.lambda.model.PublishLayerVersionResult [^AbstractAWSLambda this ^com.amazonaws.services.lambda.model.PublishLayerVersionRequest request]
    (-> this (.publishLayerVersion request))))

(defn get-layer-version
  "Description copied from interface: AWSLambda

  request - `com.amazonaws.services.lambda.model.GetLayerVersionRequest`

  returns: Result of the GetLayerVersion operation returned by the service. - `com.amazonaws.services.lambda.model.GetLayerVersionResult`"
  (^com.amazonaws.services.lambda.model.GetLayerVersionResult [^AbstractAWSLambda this ^com.amazonaws.services.lambda.model.GetLayerVersionRequest request]
    (-> this (.getLayerVersion request))))

(defn list-functions
  "Description copied from interface: AWSLambda

  request - `com.amazonaws.services.lambda.model.ListFunctionsRequest`

  returns: Result of the ListFunctions operation returned by the service. - `com.amazonaws.services.lambda.model.ListFunctionsResult`"
  (^com.amazonaws.services.lambda.model.ListFunctionsResult [^AbstractAWSLambda this ^com.amazonaws.services.lambda.model.ListFunctionsRequest request]
    (-> this (.listFunctions request)))
  (^com.amazonaws.services.lambda.model.ListFunctionsResult [^AbstractAWSLambda this]
    (-> this (.listFunctions))))

(defn untag-resource
  "Description copied from interface: AWSLambda

  request - `com.amazonaws.services.lambda.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.lambda.model.UntagResourceResult`"
  (^com.amazonaws.services.lambda.model.UntagResourceResult [^AbstractAWSLambda this ^com.amazonaws.services.lambda.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn get-event-source-mapping
  "Description copied from interface: AWSLambda

  request - `com.amazonaws.services.lambda.model.GetEventSourceMappingRequest`

  returns: Result of the GetEventSourceMapping operation returned by the service. - `com.amazonaws.services.lambda.model.GetEventSourceMappingResult`"
  (^com.amazonaws.services.lambda.model.GetEventSourceMappingResult [^AbstractAWSLambda this ^com.amazonaws.services.lambda.model.GetEventSourceMappingRequest request]
    (-> this (.getEventSourceMapping request))))

(defn list-layer-versions
  "Description copied from interface: AWSLambda

  request - `com.amazonaws.services.lambda.model.ListLayerVersionsRequest`

  returns: Result of the ListLayerVersions operation returned by the service. - `com.amazonaws.services.lambda.model.ListLayerVersionsResult`"
  (^com.amazonaws.services.lambda.model.ListLayerVersionsResult [^AbstractAWSLambda this ^com.amazonaws.services.lambda.model.ListLayerVersionsRequest request]
    (-> this (.listLayerVersions request))))

(defn create-alias
  "Description copied from interface: AWSLambda

  request - `com.amazonaws.services.lambda.model.CreateAliasRequest`

  returns: Result of the CreateAlias operation returned by the service. - `com.amazonaws.services.lambda.model.CreateAliasResult`"
  (^com.amazonaws.services.lambda.model.CreateAliasResult [^AbstractAWSLambda this ^com.amazonaws.services.lambda.model.CreateAliasRequest request]
    (-> this (.createAlias request))))

(defn delete-alias
  "Description copied from interface: AWSLambda

  request - `com.amazonaws.services.lambda.model.DeleteAliasRequest`

  returns: Result of the DeleteAlias operation returned by the service. - `com.amazonaws.services.lambda.model.DeleteAliasResult`"
  (^com.amazonaws.services.lambda.model.DeleteAliasResult [^AbstractAWSLambda this ^com.amazonaws.services.lambda.model.DeleteAliasRequest request]
    (-> this (.deleteAlias request))))

(defn add-layer-version-permission
  "Description copied from interface: AWSLambda

  request - `com.amazonaws.services.lambda.model.AddLayerVersionPermissionRequest`

  returns: Result of the AddLayerVersionPermission operation returned by the service. - `com.amazonaws.services.lambda.model.AddLayerVersionPermissionResult`"
  (^com.amazonaws.services.lambda.model.AddLayerVersionPermissionResult [^AbstractAWSLambda this ^com.amazonaws.services.lambda.model.AddLayerVersionPermissionRequest request]
    (-> this (.addLayerVersionPermission request))))

(defn list-event-source-mappings
  "Description copied from interface: AWSLambda

  request - `com.amazonaws.services.lambda.model.ListEventSourceMappingsRequest`

  returns: Result of the ListEventSourceMappings operation returned by the service. - `com.amazonaws.services.lambda.model.ListEventSourceMappingsResult`"
  (^com.amazonaws.services.lambda.model.ListEventSourceMappingsResult [^AbstractAWSLambda this ^com.amazonaws.services.lambda.model.ListEventSourceMappingsRequest request]
    (-> this (.listEventSourceMappings request)))
  (^com.amazonaws.services.lambda.model.ListEventSourceMappingsResult [^AbstractAWSLambda this]
    (-> this (.listEventSourceMappings))))

(defn get-alias
  "Description copied from interface: AWSLambda

  request - `com.amazonaws.services.lambda.model.GetAliasRequest`

  returns: Result of the GetAlias operation returned by the service. - `com.amazonaws.services.lambda.model.GetAliasResult`"
  (^com.amazonaws.services.lambda.model.GetAliasResult [^AbstractAWSLambda this ^com.amazonaws.services.lambda.model.GetAliasRequest request]
    (-> this (.getAlias request))))

(defn update-function-configuration
  "Description copied from interface: AWSLambda

  request - `com.amazonaws.services.lambda.model.UpdateFunctionConfigurationRequest`

  returns: Result of the UpdateFunctionConfiguration operation returned by the service. - `com.amazonaws.services.lambda.model.UpdateFunctionConfigurationResult`"
  (^com.amazonaws.services.lambda.model.UpdateFunctionConfigurationResult [^AbstractAWSLambda this ^com.amazonaws.services.lambda.model.UpdateFunctionConfigurationRequest request]
    (-> this (.updateFunctionConfiguration request))))

(defn remove-permission
  "Description copied from interface: AWSLambda

  request - `com.amazonaws.services.lambda.model.RemovePermissionRequest`

  returns: Result of the RemovePermission operation returned by the service. - `com.amazonaws.services.lambda.model.RemovePermissionResult`"
  (^com.amazonaws.services.lambda.model.RemovePermissionResult [^AbstractAWSLambda this ^com.amazonaws.services.lambda.model.RemovePermissionRequest request]
    (-> this (.removePermission request))))

(defn remove-layer-version-permission
  "Description copied from interface: AWSLambda

  request - `com.amazonaws.services.lambda.model.RemoveLayerVersionPermissionRequest`

  returns: Result of the RemoveLayerVersionPermission operation returned by the service. - `com.amazonaws.services.lambda.model.RemoveLayerVersionPermissionResult`"
  (^com.amazonaws.services.lambda.model.RemoveLayerVersionPermissionResult [^AbstractAWSLambda this ^com.amazonaws.services.lambda.model.RemoveLayerVersionPermissionRequest request]
    (-> this (.removeLayerVersionPermission request))))

(defn shutdown
  "Description copied from interface: AWSLambda"
  ([^AbstractAWSLambda this]
    (-> this (.shutdown))))

(defn update-alias
  "Description copied from interface: AWSLambda

  request - `com.amazonaws.services.lambda.model.UpdateAliasRequest`

  returns: Result of the UpdateAlias operation returned by the service. - `com.amazonaws.services.lambda.model.UpdateAliasResult`"
  (^com.amazonaws.services.lambda.model.UpdateAliasResult [^AbstractAWSLambda this ^com.amazonaws.services.lambda.model.UpdateAliasRequest request]
    (-> this (.updateAlias request))))

(defn update-function-code
  "Description copied from interface: AWSLambda

  request - `com.amazonaws.services.lambda.model.UpdateFunctionCodeRequest`

  returns: Result of the UpdateFunctionCode operation returned by the service. - `com.amazonaws.services.lambda.model.UpdateFunctionCodeResult`"
  (^com.amazonaws.services.lambda.model.UpdateFunctionCodeResult [^AbstractAWSLambda this ^com.amazonaws.services.lambda.model.UpdateFunctionCodeRequest request]
    (-> this (.updateFunctionCode request))))

(defn set-endpoint
  "Description copied from interface: AWSLambda

  endpoint - The endpoint (ex: \"lambda.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"lambda.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAWSLambda this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn delete-layer-version
  "Description copied from interface: AWSLambda

  request - `com.amazonaws.services.lambda.model.DeleteLayerVersionRequest`

  returns: Result of the DeleteLayerVersion operation returned by the service. - `com.amazonaws.services.lambda.model.DeleteLayerVersionResult`"
  (^com.amazonaws.services.lambda.model.DeleteLayerVersionResult [^AbstractAWSLambda this ^com.amazonaws.services.lambda.model.DeleteLayerVersionRequest request]
    (-> this (.deleteLayerVersion request))))

(defn delete-event-source-mapping
  "Description copied from interface: AWSLambda

  request - `com.amazonaws.services.lambda.model.DeleteEventSourceMappingRequest`

  returns: Result of the DeleteEventSourceMapping operation returned by the service. - `com.amazonaws.services.lambda.model.DeleteEventSourceMappingResult`"
  (^com.amazonaws.services.lambda.model.DeleteEventSourceMappingResult [^AbstractAWSLambda this ^com.amazonaws.services.lambda.model.DeleteEventSourceMappingRequest request]
    (-> this (.deleteEventSourceMapping request))))

(defn get-policy
  "Description copied from interface: AWSLambda

  request - `com.amazonaws.services.lambda.model.GetPolicyRequest`

  returns: Result of the GetPolicy operation returned by the service. - `com.amazonaws.services.lambda.model.GetPolicyResult`"
  (^com.amazonaws.services.lambda.model.GetPolicyResult [^AbstractAWSLambda this ^com.amazonaws.services.lambda.model.GetPolicyRequest request]
    (-> this (.getPolicy request))))

(defn create-function
  "Description copied from interface: AWSLambda

  request - `com.amazonaws.services.lambda.model.CreateFunctionRequest`

  returns: Result of the CreateFunction operation returned by the service. - `com.amazonaws.services.lambda.model.CreateFunctionResult`"
  (^com.amazonaws.services.lambda.model.CreateFunctionResult [^AbstractAWSLambda this ^com.amazonaws.services.lambda.model.CreateFunctionRequest request]
    (-> this (.createFunction request))))

(defn list-versions-by-function
  "Description copied from interface: AWSLambda

  request - `com.amazonaws.services.lambda.model.ListVersionsByFunctionRequest`

  returns: Result of the ListVersionsByFunction operation returned by the service. - `com.amazonaws.services.lambda.model.ListVersionsByFunctionResult`"
  (^com.amazonaws.services.lambda.model.ListVersionsByFunctionResult [^AbstractAWSLambda this ^com.amazonaws.services.lambda.model.ListVersionsByFunctionRequest request]
    (-> this (.listVersionsByFunction request))))

(defn invoke-async
  "Deprecated.

  request - `com.amazonaws.services.lambda.model.InvokeAsyncRequest`

  returns: Result of the InvokeAsync operation returned by the service. - `com.amazonaws.services.lambda.model.InvokeAsyncResult`"
  (^com.amazonaws.services.lambda.model.InvokeAsyncResult [^AbstractAWSLambda this ^com.amazonaws.services.lambda.model.InvokeAsyncRequest request]
    (-> this (.invokeAsync request))))

(defn list-aliases
  "Description copied from interface: AWSLambda

  request - `com.amazonaws.services.lambda.model.ListAliasesRequest`

  returns: Result of the ListAliases operation returned by the service. - `com.amazonaws.services.lambda.model.ListAliasesResult`"
  (^com.amazonaws.services.lambda.model.ListAliasesResult [^AbstractAWSLambda this ^com.amazonaws.services.lambda.model.ListAliasesRequest request]
    (-> this (.listAliases request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSLambda

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSLambda this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn put-function-concurrency
  "Description copied from interface: AWSLambda

  request - `com.amazonaws.services.lambda.model.PutFunctionConcurrencyRequest`

  returns: Result of the PutFunctionConcurrency operation returned by the service. - `com.amazonaws.services.lambda.model.PutFunctionConcurrencyResult`"
  (^com.amazonaws.services.lambda.model.PutFunctionConcurrencyResult [^AbstractAWSLambda this ^com.amazonaws.services.lambda.model.PutFunctionConcurrencyRequest request]
    (-> this (.putFunctionConcurrency request))))

(defn delete-function
  "Description copied from interface: AWSLambda

  request - `com.amazonaws.services.lambda.model.DeleteFunctionRequest`

  returns: Result of the DeleteFunction operation returned by the service. - `com.amazonaws.services.lambda.model.DeleteFunctionResult`"
  (^com.amazonaws.services.lambda.model.DeleteFunctionResult [^AbstractAWSLambda this ^com.amazonaws.services.lambda.model.DeleteFunctionRequest request]
    (-> this (.deleteFunction request))))

(defn get-account-settings
  "Description copied from interface: AWSLambda

  request - `com.amazonaws.services.lambda.model.GetAccountSettingsRequest`

  returns: Result of the GetAccountSettings operation returned by the service. - `com.amazonaws.services.lambda.model.GetAccountSettingsResult`"
  (^com.amazonaws.services.lambda.model.GetAccountSettingsResult [^AbstractAWSLambda this ^com.amazonaws.services.lambda.model.GetAccountSettingsRequest request]
    (-> this (.getAccountSettings request))))

(defn delete-function-concurrency
  "Description copied from interface: AWSLambda

  request - `com.amazonaws.services.lambda.model.DeleteFunctionConcurrencyRequest`

  returns: Result of the DeleteFunctionConcurrency operation returned by the service. - `com.amazonaws.services.lambda.model.DeleteFunctionConcurrencyResult`"
  (^com.amazonaws.services.lambda.model.DeleteFunctionConcurrencyResult [^AbstractAWSLambda this ^com.amazonaws.services.lambda.model.DeleteFunctionConcurrencyRequest request]
    (-> this (.deleteFunctionConcurrency request))))

(defn create-event-source-mapping
  "Description copied from interface: AWSLambda

  request - `com.amazonaws.services.lambda.model.CreateEventSourceMappingRequest`

  returns: Result of the CreateEventSourceMapping operation returned by the service. - `com.amazonaws.services.lambda.model.CreateEventSourceMappingResult`"
  (^com.amazonaws.services.lambda.model.CreateEventSourceMappingResult [^AbstractAWSLambda this ^com.amazonaws.services.lambda.model.CreateEventSourceMappingRequest request]
    (-> this (.createEventSourceMapping request))))

(defn tag-resource
  "Description copied from interface: AWSLambda

  request - `com.amazonaws.services.lambda.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.lambda.model.TagResourceResult`"
  (^com.amazonaws.services.lambda.model.TagResourceResult [^AbstractAWSLambda this ^com.amazonaws.services.lambda.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn get-function-configuration
  "Description copied from interface: AWSLambda

  request - `com.amazonaws.services.lambda.model.GetFunctionConfigurationRequest`

  returns: Result of the GetFunctionConfiguration operation returned by the service. - `com.amazonaws.services.lambda.model.GetFunctionConfigurationResult`"
  (^com.amazonaws.services.lambda.model.GetFunctionConfigurationResult [^AbstractAWSLambda this ^com.amazonaws.services.lambda.model.GetFunctionConfigurationRequest request]
    (-> this (.getFunctionConfiguration request))))

(defn add-permission
  "Description copied from interface: AWSLambda

  request - `com.amazonaws.services.lambda.model.AddPermissionRequest`

  returns: Result of the AddPermission operation returned by the service. - `com.amazonaws.services.lambda.model.AddPermissionResult`"
  (^com.amazonaws.services.lambda.model.AddPermissionResult [^AbstractAWSLambda this ^com.amazonaws.services.lambda.model.AddPermissionRequest request]
    (-> this (.addPermission request))))

(defn get-layer-version-by-arn
  "Description copied from interface: AWSLambda

  request - `com.amazonaws.services.lambda.model.GetLayerVersionByArnRequest`

  returns: Result of the GetLayerVersionByArn operation returned by the service. - `com.amazonaws.services.lambda.model.GetLayerVersionByArnResult`"
  (^com.amazonaws.services.lambda.model.GetLayerVersionByArnResult [^AbstractAWSLambda this ^com.amazonaws.services.lambda.model.GetLayerVersionByArnRequest request]
    (-> this (.getLayerVersionByArn request))))

