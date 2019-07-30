(ns com.amazonaws.services.lambda.AWSLambdaClient
  "Client for accessing AWS Lambda. All service calls made using this client are blocking, and will not return until the
  service call completes.

  AWS Lambda

  Overview


  This is the AWS Lambda API Reference. The AWS Lambda Developer Guide provides additional information. For the
  service overview, see What is AWS Lambda, and
  for information about how the service works, see AWS Lambda: How it Works in the
  AWS Lambda Developer Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.lambda AWSLambdaClient]))

(defn ->aws-lambda-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to AWS Lambda (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AWSLambdaClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AWSLambdaClient aws-credentials-provider client-configuration request-metric-collector))
  (^AWSLambdaClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSLambdaClient aws-credentials client-configuration))
  (^AWSLambdaClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSLambdaClient client-configuration))
  (^AWSLambdaClient []
    (new AWSLambdaClient )))

(defn *builder
  "returns: `com.amazonaws.services.lambda.AWSLambdaClientBuilder`"
  (^com.amazonaws.services.lambda.AWSLambdaClientBuilder []
    (AWSLambdaClient/builder )))

(defn publish-version
  "Creates a version from the
   current code and configuration of a function. Use versions to create a snapshot of your function code and
   configuration that doesn't change.


   AWS Lambda doesn't publish a version if the function's configuration and code haven't changed since the last
   version. Use UpdateFunctionCode or UpdateFunctionConfiguration to update the function before
   publishing a version.


   Clients can invoke versions directly or with an alias. To create an alias, use CreateAlias.

  request - `com.amazonaws.services.lambda.model.PublishVersionRequest`

  returns: Result of the PublishVersion operation returned by the service. - `com.amazonaws.services.lambda.model.PublishVersionResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.PublishVersionResult [^AWSLambdaClient this ^com.amazonaws.services.lambda.model.PublishVersionRequest request]
    (-> this (.publishVersion request))))

(defn invoke
  "Invokes a Lambda function. You can invoke a function synchronously (and wait for the response), or
   asynchronously. To invoke a function asynchronously, set InvocationType to Event.


   For synchronous invocation, details about the function response, including errors, are included in the response
   body and headers. For either invocation type, you can find more information in the execution log and trace. To record function errors for
   asynchronous invocations, configure your function with a dead letter queue.


   When an error occurs, your function may be invoked multiple times. Retry behavior varies by error type, client,
   event source, and invocation type. For example, if you invoke a function asynchronously and it returns an error,
   Lambda executes the function up to two more times. For more information, see Retry Behavior.


   The status code in the API response doesn't reflect function errors. Error codes are reserved for errors that
   prevent your function from executing, such as permissions errors, limit errors, or issues with your function's
   code and configuration. For example, Lambda returns TooManyRequestsException if executing the
   function would cause you to exceed a concurrency limit at either the account level (
   ConcurrentInvocationLimitExceeded) or function level (
   ReservedFunctionConcurrentInvocationLimitExceeded).


   For functions with a long timeout, your client might be disconnected during synchronous invocation while it waits
   for a response. Configure your HTTP client, SDK, firewall, proxy, or operating system to allow for long
   connections with timeout or keep-alive settings.


   This operation requires permission for the lambda:InvokeFunction action.

  request - `com.amazonaws.services.lambda.model.InvokeRequest`

  returns: Result of the Invoke operation returned by the service. - `com.amazonaws.services.lambda.model.InvokeResult`

  throws: com.amazonaws.services.lambda.model.UnsupportedMediaTypeException - The content type of the Invoke request body is not JSON."
  (^com.amazonaws.services.lambda.model.InvokeResult [^AWSLambdaClient this ^com.amazonaws.services.lambda.model.InvokeRequest request]
    (-> this (.invoke request))))

(defn get-layer-version-policy
  "Returns the permission policy for a version of an AWS Lambda layer. For more
   information, see AddLayerVersionPermission.

  request - `com.amazonaws.services.lambda.model.GetLayerVersionPolicyRequest`

  returns: Result of the GetLayerVersionPolicy operation returned by the service. - `com.amazonaws.services.lambda.model.GetLayerVersionPolicyResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.GetLayerVersionPolicyResult [^AWSLambdaClient this ^com.amazonaws.services.lambda.model.GetLayerVersionPolicyRequest request]
    (-> this (.getLayerVersionPolicy request))))

(defn waiters
  "returns: `com.amazonaws.services.lambda.waiters.AWSLambdaWaiters`"
  (^com.amazonaws.services.lambda.waiters.AWSLambdaWaiters [^AWSLambdaClient this]
    (-> this (.waiters))))

(defn get-function
  "Returns information about the function or function version, with a link to download the deployment package that's
   valid for 10 minutes. If you specify a function version, only details that are specific to that version are
   returned.

  request - `com.amazonaws.services.lambda.model.GetFunctionRequest`

  returns: Result of the GetFunction operation returned by the service. - `com.amazonaws.services.lambda.model.GetFunctionResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.GetFunctionResult [^AWSLambdaClient this ^com.amazonaws.services.lambda.model.GetFunctionRequest request]
    (-> this (.getFunction request))))

(defn list-tags
  "Returns a function's tags. You can also
   view tags with GetFunction.

  request - `com.amazonaws.services.lambda.model.ListTagsRequest`

  returns: Result of the ListTags operation returned by the service. - `com.amazonaws.services.lambda.model.ListTagsResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.ListTagsResult [^AWSLambdaClient this ^com.amazonaws.services.lambda.model.ListTagsRequest request]
    (-> this (.listTags request))))

(defn list-layers
  "Lists AWS Lambda layers and
   shows information about the latest version of each. Specify a runtime identifier to list only
   layers that indicate that they're compatible with that runtime.

  request - `com.amazonaws.services.lambda.model.ListLayersRequest`

  returns: Result of the ListLayers operation returned by the service. - `com.amazonaws.services.lambda.model.ListLayersResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.ListLayersResult [^AWSLambdaClient this ^com.amazonaws.services.lambda.model.ListLayersRequest request]
    (-> this (.listLayers request))))

(defn update-event-source-mapping
  "Updates an event source mapping. You can change the function that AWS Lambda invokes, or pause invocation and
   resume later from the same location.

  request - `com.amazonaws.services.lambda.model.UpdateEventSourceMappingRequest`

  returns: Result of the UpdateEventSourceMapping operation returned by the service. - `com.amazonaws.services.lambda.model.UpdateEventSourceMappingResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.UpdateEventSourceMappingResult [^AWSLambdaClient this ^com.amazonaws.services.lambda.model.UpdateEventSourceMappingRequest request]
    (-> this (.updateEventSourceMapping request))))

(defn publish-layer-version
  "Creates an AWS Lambda layer
   from a ZIP archive. Each time you call PublishLayerVersion with the same version name, a new version
   is created.


   Add layers to your function with CreateFunction or UpdateFunctionConfiguration.

  request - `com.amazonaws.services.lambda.model.PublishLayerVersionRequest`

  returns: Result of the PublishLayerVersion operation returned by the service. - `com.amazonaws.services.lambda.model.PublishLayerVersionResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.PublishLayerVersionResult [^AWSLambdaClient this ^com.amazonaws.services.lambda.model.PublishLayerVersionRequest request]
    (-> this (.publishLayerVersion request))))

(defn get-layer-version
  "Returns information about a version of an AWS Lambda layer, with a link
   to download the layer archive that's valid for 10 minutes.

  request - `com.amazonaws.services.lambda.model.GetLayerVersionRequest`

  returns: Result of the GetLayerVersion operation returned by the service. - `com.amazonaws.services.lambda.model.GetLayerVersionResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.GetLayerVersionResult [^AWSLambdaClient this ^com.amazonaws.services.lambda.model.GetLayerVersionRequest request]
    (-> this (.getLayerVersion request))))

(defn list-functions
  "Returns a list of Lambda functions, with the version-specific configuration of each.


   Set FunctionVersion to ALL to include all published versions of each function in
   addition to the unpublished version. To get more information about a function or version, use GetFunction.

  request - `com.amazonaws.services.lambda.model.ListFunctionsRequest`

  returns: Result of the ListFunctions operation returned by the service. - `com.amazonaws.services.lambda.model.ListFunctionsResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.ListFunctionsResult [^AWSLambdaClient this ^com.amazonaws.services.lambda.model.ListFunctionsRequest request]
    (-> this (.listFunctions request)))
  (^com.amazonaws.services.lambda.model.ListFunctionsResult [^AWSLambdaClient this]
    (-> this (.listFunctions))))

(defn untag-resource
  "Removes tags from a function.

  request - `com.amazonaws.services.lambda.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.lambda.model.UntagResourceResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.UntagResourceResult [^AWSLambdaClient this ^com.amazonaws.services.lambda.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn get-event-source-mapping
  "Returns details about an event source mapping. You can get the identifier of a mapping from the output of
   ListEventSourceMappings.

  request - `com.amazonaws.services.lambda.model.GetEventSourceMappingRequest`

  returns: Result of the GetEventSourceMapping operation returned by the service. - `com.amazonaws.services.lambda.model.GetEventSourceMappingResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.GetEventSourceMappingResult [^AWSLambdaClient this ^com.amazonaws.services.lambda.model.GetEventSourceMappingRequest request]
    (-> this (.getEventSourceMapping request))))

(defn list-layer-versions
  "Lists the versions of an AWS
   Lambda layer. Versions that have been deleted aren't listed. Specify a runtime identifier to list only
   versions that indicate that they're compatible with that runtime.

  request - `com.amazonaws.services.lambda.model.ListLayerVersionsRequest`

  returns: Result of the ListLayerVersions operation returned by the service. - `com.amazonaws.services.lambda.model.ListLayerVersionsResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.ListLayerVersionsResult [^AWSLambdaClient this ^com.amazonaws.services.lambda.model.ListLayerVersionsRequest request]
    (-> this (.listLayerVersions request))))

(defn create-alias
  "Creates an alias for a Lambda
   function version. Use aliases to provide clients with a function identifier that you can update to invoke a
   different version.


   You can also map an alias to split invocation requests between two versions. Use the RoutingConfig
   parameter to specify a second version and the percentage of invocation requests that it receives.

  request - `com.amazonaws.services.lambda.model.CreateAliasRequest`

  returns: Result of the CreateAlias operation returned by the service. - `com.amazonaws.services.lambda.model.CreateAliasResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.CreateAliasResult [^AWSLambdaClient this ^com.amazonaws.services.lambda.model.CreateAliasRequest request]
    (-> this (.createAlias request))))

(defn delete-alias
  "Deletes a Lambda function alias.

  request - `com.amazonaws.services.lambda.model.DeleteAliasRequest`

  returns: Result of the DeleteAlias operation returned by the service. - `com.amazonaws.services.lambda.model.DeleteAliasResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.DeleteAliasResult [^AWSLambdaClient this ^com.amazonaws.services.lambda.model.DeleteAliasRequest request]
    (-> this (.deleteAlias request))))

(defn add-layer-version-permission
  "Adds permissions to the resource-based policy of a version of an AWS Lambda layer. Use this
   action to grant layer usage permission to other accounts. You can grant permission to a single account, all AWS
   accounts, or all accounts in an organization.


   To revoke permission, call RemoveLayerVersionPermission with the statement ID that you specified when you
   added it.

  request - `com.amazonaws.services.lambda.model.AddLayerVersionPermissionRequest`

  returns: Result of the AddLayerVersionPermission operation returned by the service. - `com.amazonaws.services.lambda.model.AddLayerVersionPermissionResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.AddLayerVersionPermissionResult [^AWSLambdaClient this ^com.amazonaws.services.lambda.model.AddLayerVersionPermissionRequest request]
    (-> this (.addLayerVersionPermission request))))

(defn list-event-source-mappings
  "Lists event source mappings. Specify an EventSourceArn to only show event source mappings for a
   single event source.

  request - `com.amazonaws.services.lambda.model.ListEventSourceMappingsRequest`

  returns: Result of the ListEventSourceMappings operation returned by the service. - `com.amazonaws.services.lambda.model.ListEventSourceMappingsResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.ListEventSourceMappingsResult [^AWSLambdaClient this ^com.amazonaws.services.lambda.model.ListEventSourceMappingsRequest request]
    (-> this (.listEventSourceMappings request)))
  (^com.amazonaws.services.lambda.model.ListEventSourceMappingsResult [^AWSLambdaClient this]
    (-> this (.listEventSourceMappings))))

(defn get-alias
  "Returns details about a Lambda function alias.

  request - `com.amazonaws.services.lambda.model.GetAliasRequest`

  returns: Result of the GetAlias operation returned by the service. - `com.amazonaws.services.lambda.model.GetAliasResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.GetAliasResult [^AWSLambdaClient this ^com.amazonaws.services.lambda.model.GetAliasRequest request]
    (-> this (.getAlias request))))

(defn update-function-configuration
  "Modify the version-specific settings of a Lambda function.


   These settings can vary between versions of a function and are locked when you publish a version. You can't
   modify the configuration of a published version, only the unpublished version.


   To configure function concurrency, use PutFunctionConcurrency. To grant invoke permissions to an account
   or AWS service, use AddPermission.

  request - `com.amazonaws.services.lambda.model.UpdateFunctionConfigurationRequest`

  returns: Result of the UpdateFunctionConfiguration operation returned by the service. - `com.amazonaws.services.lambda.model.UpdateFunctionConfigurationResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.UpdateFunctionConfigurationResult [^AWSLambdaClient this ^com.amazonaws.services.lambda.model.UpdateFunctionConfigurationRequest request]
    (-> this (.updateFunctionConfiguration request))))

(defn remove-permission
  "Revokes function-use permission from an AWS service or another account. You can get the ID of the statement from
   the output of GetPolicy.

  request - `com.amazonaws.services.lambda.model.RemovePermissionRequest`

  returns: Result of the RemovePermission operation returned by the service. - `com.amazonaws.services.lambda.model.RemovePermissionResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.RemovePermissionResult [^AWSLambdaClient this ^com.amazonaws.services.lambda.model.RemovePermissionRequest request]
    (-> this (.removePermission request))))

(defn remove-layer-version-permission
  "Removes a statement from the permissions policy for a version of an AWS Lambda layer. For more
   information, see AddLayerVersionPermission.

  request - `com.amazonaws.services.lambda.model.RemoveLayerVersionPermissionRequest`

  returns: Result of the RemoveLayerVersionPermission operation returned by the service. - `com.amazonaws.services.lambda.model.RemoveLayerVersionPermissionResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.RemoveLayerVersionPermissionResult [^AWSLambdaClient this ^com.amazonaws.services.lambda.model.RemoveLayerVersionPermissionRequest request]
    (-> this (.removeLayerVersionPermission request))))

(defn shutdown
  "Description copied from class: AmazonWebServiceClient"
  ([^AWSLambdaClient this]
    (-> this (.shutdown))))

(defn update-alias
  "Updates the configuration of a Lambda function alias.

  request - `com.amazonaws.services.lambda.model.UpdateAliasRequest`

  returns: Result of the UpdateAlias operation returned by the service. - `com.amazonaws.services.lambda.model.UpdateAliasResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.UpdateAliasResult [^AWSLambdaClient this ^com.amazonaws.services.lambda.model.UpdateAliasRequest request]
    (-> this (.updateAlias request))))

(defn update-function-code
  "Updates a Lambda function's code.


   The function's code is locked when you publish a version. You can't modify the code of a published version, only
   the unpublished version.

  request - `com.amazonaws.services.lambda.model.UpdateFunctionCodeRequest`

  returns: Result of the UpdateFunctionCode operation returned by the service. - `com.amazonaws.services.lambda.model.UpdateFunctionCodeResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.UpdateFunctionCodeResult [^AWSLambdaClient this ^com.amazonaws.services.lambda.model.UpdateFunctionCodeRequest request]
    (-> this (.updateFunctionCode request))))

(defn delete-layer-version
  "Deletes a version of an AWS
   Lambda layer. Deleted versions can no longer be viewed or added to functions. To avoid breaking functions, a
   copy of the version remains in Lambda until no functions refer to it.

  request - `com.amazonaws.services.lambda.model.DeleteLayerVersionRequest`

  returns: Result of the DeleteLayerVersion operation returned by the service. - `com.amazonaws.services.lambda.model.DeleteLayerVersionResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.DeleteLayerVersionResult [^AWSLambdaClient this ^com.amazonaws.services.lambda.model.DeleteLayerVersionRequest request]
    (-> this (.deleteLayerVersion request))))

(defn delete-event-source-mapping
  "Deletes an event source
   mapping. You can get the identifier of a mapping from the output of ListEventSourceMappings.

  request - `com.amazonaws.services.lambda.model.DeleteEventSourceMappingRequest`

  returns: Result of the DeleteEventSourceMapping operation returned by the service. - `com.amazonaws.services.lambda.model.DeleteEventSourceMappingResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.DeleteEventSourceMappingResult [^AWSLambdaClient this ^com.amazonaws.services.lambda.model.DeleteEventSourceMappingRequest request]
    (-> this (.deleteEventSourceMapping request))))

(defn get-policy
  "Returns the resource-based IAM
   policy for a function, version, or alias.

  request - `com.amazonaws.services.lambda.model.GetPolicyRequest`

  returns: Result of the GetPolicy operation returned by the service. - `com.amazonaws.services.lambda.model.GetPolicyResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.GetPolicyResult [^AWSLambdaClient this ^com.amazonaws.services.lambda.model.GetPolicyRequest request]
    (-> this (.getPolicy request))))

(defn create-function
  "Creates a Lambda function. To create a function, you need a deployment package and an
   execution role. The deployment package contains your function code. The execution role grants the function
   permission to use AWS services, such as Amazon CloudWatch Logs for log streaming and AWS X-Ray for request
   tracing.


   A function has an unpublished version, and can have published versions and aliases. The unpublished version
   changes when you update your function's code and configuration. A published version is a snapshot of your
   function code and configuration that can't be changed. An alias is a named resource that maps to a version, and
   can be changed to map to a different version. Use the Publish parameter to create version
   1 of your function from its initial configuration.


   The other parameters let you configure version-specific and function-level settings. You can modify
   version-specific settings later with UpdateFunctionConfiguration. Function-level settings apply to both
   the unpublished and published versions of the function, and include tags (TagResource) and per-function
   concurrency limits (PutFunctionConcurrency).


   If another account or an AWS service invokes your function, use AddPermission to grant permission by
   creating a resource-based IAM policy. You can grant permissions at the function level, on a version, or on an
   alias.


   To invoke your function directly, use Invoke. To invoke your function in response to events in other AWS
   services, create an event source mapping (CreateEventSourceMapping), or configure a function trigger in
   the other service. For more information, see Invoking Functions.

  request - `com.amazonaws.services.lambda.model.CreateFunctionRequest`

  returns: Result of the CreateFunction operation returned by the service. - `com.amazonaws.services.lambda.model.CreateFunctionResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.CreateFunctionResult [^AWSLambdaClient this ^com.amazonaws.services.lambda.model.CreateFunctionRequest request]
    (-> this (.createFunction request))))

(defn list-versions-by-function
  "Returns a list of versions,
   with the version-specific configuration of each.

  request - `com.amazonaws.services.lambda.model.ListVersionsByFunctionRequest`

  returns: Result of the ListVersionsByFunction operation returned by the service. - `com.amazonaws.services.lambda.model.ListVersionsByFunctionResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.ListVersionsByFunctionResult [^AWSLambdaClient this ^com.amazonaws.services.lambda.model.ListVersionsByFunctionRequest request]
    (-> this (.listVersionsByFunction request))))

(defn invoke-async
  "Deprecated.

  request - `com.amazonaws.services.lambda.model.InvokeAsyncRequest`

  returns: Result of the InvokeAsync operation returned by the service. - `com.amazonaws.services.lambda.model.InvokeAsyncResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.InvokeAsyncResult [^AWSLambdaClient this ^com.amazonaws.services.lambda.model.InvokeAsyncRequest request]
    (-> this (.invokeAsync request))))

(defn list-aliases
  "Returns a list of aliases for
   a Lambda function.

  request - `com.amazonaws.services.lambda.model.ListAliasesRequest`

  returns: Result of the ListAliases operation returned by the service. - `com.amazonaws.services.lambda.model.ListAliasesResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.ListAliasesResult [^AWSLambdaClient this ^com.amazonaws.services.lambda.model.ListAliasesRequest request]
    (-> this (.listAliases request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSLambdaClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn put-function-concurrency
  "Sets the maximum number of simultaneous executions for a function, and reserves capacity for that concurrency
   level.


   Concurrency settings apply to the function as a whole, including all published versions and the unpublished
   version. Reserving concurrency both ensures that your function has capacity to process the specified number of
   events simultaneously, and prevents it from scaling beyond that level. Use GetFunction to see the current
   setting for a function.


   Use GetAccountSettings to see your regional concurrency limit. You can reserve concurrency for as many
   functions as you like, as long as you leave at least 100 simultaneous executions unreserved for functions that
   aren't configured with a per-function limit. For more information, see Managing Concurrency.

  request - `com.amazonaws.services.lambda.model.PutFunctionConcurrencyRequest`

  returns: Result of the PutFunctionConcurrency operation returned by the service. - `com.amazonaws.services.lambda.model.PutFunctionConcurrencyResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.PutFunctionConcurrencyResult [^AWSLambdaClient this ^com.amazonaws.services.lambda.model.PutFunctionConcurrencyRequest request]
    (-> this (.putFunctionConcurrency request))))

(defn delete-function
  "Deletes a Lambda function. To delete a specific function version, use the Qualifier parameter.
   Otherwise, all versions and aliases are deleted.


   To delete Lambda event source mappings that invoke a function, use DeleteEventSourceMapping. For AWS
   services and resources that invoke your function directly, delete the trigger in the service where you originally
   configured it.

  request - `com.amazonaws.services.lambda.model.DeleteFunctionRequest`

  returns: Result of the DeleteFunction operation returned by the service. - `com.amazonaws.services.lambda.model.DeleteFunctionResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.DeleteFunctionResult [^AWSLambdaClient this ^com.amazonaws.services.lambda.model.DeleteFunctionRequest request]
    (-> this (.deleteFunction request))))

(defn get-account-settings
  "Retrieves details about your account's limits and usage in an AWS Region.

  request - `com.amazonaws.services.lambda.model.GetAccountSettingsRequest`

  returns: Result of the GetAccountSettings operation returned by the service. - `com.amazonaws.services.lambda.model.GetAccountSettingsResult`

  throws: com.amazonaws.services.lambda.model.TooManyRequestsException - Request throughput limit exceeded."
  (^com.amazonaws.services.lambda.model.GetAccountSettingsResult [^AWSLambdaClient this ^com.amazonaws.services.lambda.model.GetAccountSettingsRequest request]
    (-> this (.getAccountSettings request))))

(defn delete-function-concurrency
  "Removes a concurrent execution limit from a function.

  request - `com.amazonaws.services.lambda.model.DeleteFunctionConcurrencyRequest`

  returns: Result of the DeleteFunctionConcurrency operation returned by the service. - `com.amazonaws.services.lambda.model.DeleteFunctionConcurrencyResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.DeleteFunctionConcurrencyResult [^AWSLambdaClient this ^com.amazonaws.services.lambda.model.DeleteFunctionConcurrencyRequest request]
    (-> this (.deleteFunctionConcurrency request))))

(defn create-event-source-mapping
  "Creates a mapping between an event source and an AWS Lambda function. Lambda reads items from the event source
   and triggers the function.


   For details about each event source type, see the following topics.




   Using AWS Lambda with Amazon Kinesis




   Using AWS Lambda with Amazon SQS




   Using AWS Lambda with Amazon DynamoDB

  request - `com.amazonaws.services.lambda.model.CreateEventSourceMappingRequest`

  returns: Result of the CreateEventSourceMapping operation returned by the service. - `com.amazonaws.services.lambda.model.CreateEventSourceMappingResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.CreateEventSourceMappingResult [^AWSLambdaClient this ^com.amazonaws.services.lambda.model.CreateEventSourceMappingRequest request]
    (-> this (.createEventSourceMapping request))))

(defn tag-resource
  "Adds tags to a function.

  request - `com.amazonaws.services.lambda.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.lambda.model.TagResourceResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.TagResourceResult [^AWSLambdaClient this ^com.amazonaws.services.lambda.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn get-function-configuration
  "Returns the version-specific settings of a Lambda function or version. The output includes only options that can
   vary between versions of a function. To modify these settings, use UpdateFunctionConfiguration.


   To get all of a function's details, including function-level settings, use GetFunction.

  request - `com.amazonaws.services.lambda.model.GetFunctionConfigurationRequest`

  returns: Result of the GetFunctionConfiguration operation returned by the service. - `com.amazonaws.services.lambda.model.GetFunctionConfigurationResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.GetFunctionConfigurationResult [^AWSLambdaClient this ^com.amazonaws.services.lambda.model.GetFunctionConfigurationRequest request]
    (-> this (.getFunctionConfiguration request))))

(defn add-permission
  "Grants an AWS service or another account permission to use a function. You can apply the policy at the function
   level, or specify a qualifier to restrict access to a single version or alias. If you use a qualifier, the
   invoker must use the full Amazon Resource Name (ARN) of that version or alias to invoke the function.


   To grant permission to another account, specify the account ID as the Principal. For AWS services,
   the principal is a domain-style identifier defined by the service, like s3.amazonaws.com or
   sns.amazonaws.com. For AWS services, you can also specify the ARN or owning account of the
   associated resource as the SourceArn or SourceAccount. If you grant permission to a
   service principal without specifying the source, other accounts could potentially configure resources in their
   account to invoke your Lambda function.


   This action adds a statement to a resource-based permission policy for the function. For more information about
   function policies, see Lambda Function
   Policies.

  request - `com.amazonaws.services.lambda.model.AddPermissionRequest`

  returns: Result of the AddPermission operation returned by the service. - `com.amazonaws.services.lambda.model.AddPermissionResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.AddPermissionResult [^AWSLambdaClient this ^com.amazonaws.services.lambda.model.AddPermissionRequest request]
    (-> this (.addPermission request))))

(defn get-layer-version-by-arn
  "Returns information about a version of an AWS Lambda layer, with a link
   to download the layer archive that's valid for 10 minutes.

  request - `com.amazonaws.services.lambda.model.GetLayerVersionByArnRequest`

  returns: Result of the GetLayerVersionByArn operation returned by the service. - `com.amazonaws.services.lambda.model.GetLayerVersionByArnResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.GetLayerVersionByArnResult [^AWSLambdaClient this ^com.amazonaws.services.lambda.model.GetLayerVersionByArnRequest request]
    (-> this (.getLayerVersionByArn request))))

