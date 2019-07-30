(ns com.amazonaws.services.lambda.AWSLambdaAsyncClient
  "Client for accessing AWS Lambda asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  AWS Lambda

  Overview


  This is the AWS Lambda API Reference. The AWS Lambda Developer Guide provides additional information. For the
  service overview, see What is AWS Lambda, and
  for information about how the service works, see AWS Lambda: How it Works in the
  AWS Lambda Developer Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.lambda AWSLambdaAsyncClient]))

(defn ->aws-lambda-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AWSLambdaAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AWSLambdaAsyncClient aws-credentials client-configuration executor-service))
  (^AWSLambdaAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AWSLambdaAsyncClient aws-credentials executor-service))
  (^AWSLambdaAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSLambdaAsyncClient client-configuration))
  (^AWSLambdaAsyncClient []
    (new AWSLambdaAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.lambda.AWSLambdaAsyncClientBuilder`"
  (^com.amazonaws.services.lambda.AWSLambdaAsyncClientBuilder []
    (AWSLambdaAsyncClient/asyncBuilder )))

(defn untag-resource-async
  "Description copied from interface: AWSLambdaAsync

  request - `com.amazonaws.services.lambda.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn delete-event-source-mapping-async
  "Description copied from interface: AWSLambdaAsync

  request - `com.amazonaws.services.lambda.model.DeleteEventSourceMappingRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEventSourceMapping operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.DeleteEventSourceMappingResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.DeleteEventSourceMappingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEventSourceMappingAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.DeleteEventSourceMappingRequest request]
    (-> this (.deleteEventSourceMappingAsync request))))

(defn list-aliases-async
  "Description copied from interface: AWSLambdaAsync

  request - `com.amazonaws.services.lambda.model.ListAliasesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAliases operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.ListAliasesResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.ListAliasesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAliasesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.ListAliasesRequest request]
    (-> this (.listAliasesAsync request))))

(defn get-account-settings-async
  "Description copied from interface: AWSLambdaAsync

  request - `com.amazonaws.services.lambda.model.GetAccountSettingsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAccountSettings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.GetAccountSettingsResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.GetAccountSettingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAccountSettingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.GetAccountSettingsRequest request]
    (-> this (.getAccountSettingsAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSLambdaAsyncClient this]
    (-> this (.getExecutorService))))

(defn create-alias-async
  "Description copied from interface: AWSLambdaAsync

  request - `com.amazonaws.services.lambda.model.CreateAliasRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAlias operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.CreateAliasResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.CreateAliasRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAliasAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.CreateAliasRequest request]
    (-> this (.createAliasAsync request))))

(defn list-tags-async
  "Description copied from interface: AWSLambdaAsync

  request - `com.amazonaws.services.lambda.model.ListTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.ListTagsResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.ListTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.ListTagsRequest request]
    (-> this (.listTagsAsync request))))

(defn delete-layer-version-async
  "Description copied from interface: AWSLambdaAsync

  request - `com.amazonaws.services.lambda.model.DeleteLayerVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLayerVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.DeleteLayerVersionResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.DeleteLayerVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLayerVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.DeleteLayerVersionRequest request]
    (-> this (.deleteLayerVersionAsync request))))

(defn get-layer-version-async
  "Description copied from interface: AWSLambdaAsync

  request - `com.amazonaws.services.lambda.model.GetLayerVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLayerVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.GetLayerVersionResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.GetLayerVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLayerVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.GetLayerVersionRequest request]
    (-> this (.getLayerVersionAsync request))))

(defn list-layer-versions-async
  "Description copied from interface: AWSLambdaAsync

  request - `com.amazonaws.services.lambda.model.ListLayerVersionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListLayerVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.ListLayerVersionsResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.ListLayerVersionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listLayerVersionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.ListLayerVersionsRequest request]
    (-> this (.listLayerVersionsAsync request))))

(defn remove-layer-version-permission-async
  "Description copied from interface: AWSLambdaAsync

  request - `com.amazonaws.services.lambda.model.RemoveLayerVersionPermissionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveLayerVersionPermission operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.RemoveLayerVersionPermissionResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.RemoveLayerVersionPermissionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeLayerVersionPermissionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.RemoveLayerVersionPermissionRequest request]
    (-> this (.removeLayerVersionPermissionAsync request))))

(defn list-versions-by-function-async
  "Description copied from interface: AWSLambdaAsync

  request - `com.amazonaws.services.lambda.model.ListVersionsByFunctionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListVersionsByFunction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.ListVersionsByFunctionResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.ListVersionsByFunctionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listVersionsByFunctionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.ListVersionsByFunctionRequest request]
    (-> this (.listVersionsByFunctionAsync request))))

(defn list-functions-async
  "Description copied from interface: AWSLambdaAsync

  request - `com.amazonaws.services.lambda.model.ListFunctionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListFunctions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.ListFunctionsResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.ListFunctionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listFunctionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.ListFunctionsRequest request]
    (-> this (.listFunctionsAsync request)))
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this]
    (-> this (.listFunctionsAsync))))

(defn update-function-configuration-async
  "Description copied from interface: AWSLambdaAsync

  request - `com.amazonaws.services.lambda.model.UpdateFunctionConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateFunctionConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.UpdateFunctionConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.UpdateFunctionConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateFunctionConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.UpdateFunctionConfigurationRequest request]
    (-> this (.updateFunctionConfigurationAsync request))))

(defn add-layer-version-permission-async
  "Description copied from interface: AWSLambdaAsync

  request - `com.amazonaws.services.lambda.model.AddLayerVersionPermissionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddLayerVersionPermission operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.AddLayerVersionPermissionResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.AddLayerVersionPermissionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addLayerVersionPermissionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.AddLayerVersionPermissionRequest request]
    (-> this (.addLayerVersionPermissionAsync request))))

(defn publish-version-async
  "Description copied from interface: AWSLambdaAsync

  request - `com.amazonaws.services.lambda.model.PublishVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PublishVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.PublishVersionResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.PublishVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.publishVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.PublishVersionRequest request]
    (-> this (.publishVersionAsync request))))

(defn publish-layer-version-async
  "Description copied from interface: AWSLambdaAsync

  request - `com.amazonaws.services.lambda.model.PublishLayerVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PublishLayerVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.PublishLayerVersionResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.PublishLayerVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.publishLayerVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.PublishLayerVersionRequest request]
    (-> this (.publishLayerVersionAsync request))))

(defn remove-permission-async
  "Description copied from interface: AWSLambdaAsync

  request - `com.amazonaws.services.lambda.model.RemovePermissionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemovePermission operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.RemovePermissionResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.RemovePermissionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removePermissionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.RemovePermissionRequest request]
    (-> this (.removePermissionAsync request))))

(defn list-event-source-mappings-async
  "Description copied from interface: AWSLambdaAsync

  request - `com.amazonaws.services.lambda.model.ListEventSourceMappingsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListEventSourceMappings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.ListEventSourceMappingsResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.ListEventSourceMappingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listEventSourceMappingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.ListEventSourceMappingsRequest request]
    (-> this (.listEventSourceMappingsAsync request)))
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this]
    (-> this (.listEventSourceMappingsAsync))))

(defn update-event-source-mapping-async
  "Description copied from interface: AWSLambdaAsync

  request - `com.amazonaws.services.lambda.model.UpdateEventSourceMappingRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateEventSourceMapping operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.UpdateEventSourceMappingResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.UpdateEventSourceMappingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateEventSourceMappingAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.UpdateEventSourceMappingRequest request]
    (-> this (.updateEventSourceMappingAsync request))))

(defn delete-function-concurrency-async
  "Description copied from interface: AWSLambdaAsync

  request - `com.amazonaws.services.lambda.model.DeleteFunctionConcurrencyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFunctionConcurrency operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.DeleteFunctionConcurrencyResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.DeleteFunctionConcurrencyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFunctionConcurrencyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.DeleteFunctionConcurrencyRequest request]
    (-> this (.deleteFunctionConcurrencyAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSLambdaAsyncClient this]
    (-> this (.shutdown))))

(defn get-layer-version-policy-async
  "Description copied from interface: AWSLambdaAsync

  request - `com.amazonaws.services.lambda.model.GetLayerVersionPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLayerVersionPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.GetLayerVersionPolicyResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.GetLayerVersionPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLayerVersionPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.GetLayerVersionPolicyRequest request]
    (-> this (.getLayerVersionPolicyAsync request))))

(defn add-permission-async
  "Description copied from interface: AWSLambdaAsync

  request - `com.amazonaws.services.lambda.model.AddPermissionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddPermission operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.AddPermissionResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.AddPermissionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addPermissionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.AddPermissionRequest request]
    (-> this (.addPermissionAsync request))))

(defn update-function-code-async
  "Description copied from interface: AWSLambdaAsync

  request - `com.amazonaws.services.lambda.model.UpdateFunctionCodeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateFunctionCode operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.UpdateFunctionCodeResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.UpdateFunctionCodeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateFunctionCodeAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.UpdateFunctionCodeRequest request]
    (-> this (.updateFunctionCodeAsync request))))

(defn create-event-source-mapping-async
  "Description copied from interface: AWSLambdaAsync

  request - `com.amazonaws.services.lambda.model.CreateEventSourceMappingRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateEventSourceMapping operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.CreateEventSourceMappingResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.CreateEventSourceMappingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createEventSourceMappingAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.CreateEventSourceMappingRequest request]
    (-> this (.createEventSourceMappingAsync request))))

(defn put-function-concurrency-async
  "Description copied from interface: AWSLambdaAsync

  request - `com.amazonaws.services.lambda.model.PutFunctionConcurrencyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutFunctionConcurrency operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.PutFunctionConcurrencyResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.PutFunctionConcurrencyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putFunctionConcurrencyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.PutFunctionConcurrencyRequest request]
    (-> this (.putFunctionConcurrencyAsync request))))

(defn get-function-configuration-async
  "Description copied from interface: AWSLambdaAsync

  request - `com.amazonaws.services.lambda.model.GetFunctionConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFunctionConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.GetFunctionConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.GetFunctionConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFunctionConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.GetFunctionConfigurationRequest request]
    (-> this (.getFunctionConfigurationAsync request))))

(defn get-event-source-mapping-async
  "Description copied from interface: AWSLambdaAsync

  request - `com.amazonaws.services.lambda.model.GetEventSourceMappingRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetEventSourceMapping operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.GetEventSourceMappingResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.GetEventSourceMappingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getEventSourceMappingAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.GetEventSourceMappingRequest request]
    (-> this (.getEventSourceMappingAsync request))))

(defn delete-alias-async
  "Description copied from interface: AWSLambdaAsync

  request - `com.amazonaws.services.lambda.model.DeleteAliasRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAlias operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.DeleteAliasResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.DeleteAliasRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAliasAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.DeleteAliasRequest request]
    (-> this (.deleteAliasAsync request))))

(defn get-layer-version-by-arn-async
  "Description copied from interface: AWSLambdaAsync

  request - `com.amazonaws.services.lambda.model.GetLayerVersionByArnRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLayerVersionByArn operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.GetLayerVersionByArnResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.GetLayerVersionByArnRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLayerVersionByArnAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.GetLayerVersionByArnRequest request]
    (-> this (.getLayerVersionByArnAsync request))))

(defn get-function-async
  "Description copied from interface: AWSLambdaAsync

  request - `com.amazonaws.services.lambda.model.GetFunctionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFunction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.GetFunctionResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.GetFunctionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFunctionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.GetFunctionRequest request]
    (-> this (.getFunctionAsync request))))

(defn get-policy-async
  "Description copied from interface: AWSLambdaAsync

  request - `com.amazonaws.services.lambda.model.GetPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.GetPolicyResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.GetPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.GetPolicyRequest request]
    (-> this (.getPolicyAsync request))))

(defn list-layers-async
  "Description copied from interface: AWSLambdaAsync

  request - `com.amazonaws.services.lambda.model.ListLayersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListLayers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.ListLayersResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.ListLayersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listLayersAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.ListLayersRequest request]
    (-> this (.listLayersAsync request))))

(defn delete-function-async
  "Description copied from interface: AWSLambdaAsync

  request - `com.amazonaws.services.lambda.model.DeleteFunctionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFunction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.DeleteFunctionResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.DeleteFunctionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFunctionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.DeleteFunctionRequest request]
    (-> this (.deleteFunctionAsync request))))

(defn invoke-async
  "Description copied from interface: AWSLambdaAsync

  request - `com.amazonaws.services.lambda.model.InvokeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the Invoke operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.InvokeResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.InvokeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.invokeAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.InvokeRequest request]
    (-> this (.invokeAsync request))))

(defn get-alias-async
  "Description copied from interface: AWSLambdaAsync

  request - `com.amazonaws.services.lambda.model.GetAliasRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAlias operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.GetAliasResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.GetAliasRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAliasAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.GetAliasRequest request]
    (-> this (.getAliasAsync request))))

(defn update-alias-async
  "Description copied from interface: AWSLambdaAsync

  request - `com.amazonaws.services.lambda.model.UpdateAliasRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAlias operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.UpdateAliasResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.UpdateAliasRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAliasAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.UpdateAliasRequest request]
    (-> this (.updateAliasAsync request))))

(defn create-function-async
  "Description copied from interface: AWSLambdaAsync

  request - `com.amazonaws.services.lambda.model.CreateFunctionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateFunction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.CreateFunctionResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.CreateFunctionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createFunctionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.CreateFunctionRequest request]
    (-> this (.createFunctionAsync request))))

(defn invoke-async-async
  "Deprecated.

  request - `com.amazonaws.services.lambda.model.InvokeAsyncRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the InvokeAsync operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.InvokeAsyncResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.InvokeAsyncRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.invokeAsyncAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.InvokeAsyncRequest request]
    (-> this (.invokeAsyncAsync request))))

(defn tag-resource-async
  "Description copied from interface: AWSLambdaAsync

  request - `com.amazonaws.services.lambda.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsyncClient this ^com.amazonaws.services.lambda.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

