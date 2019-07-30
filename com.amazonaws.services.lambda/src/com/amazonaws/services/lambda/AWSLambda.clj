(ns com.amazonaws.services.lambda.AWSLambda
  "Interface for accessing AWS Lambda.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSLambda instead.


  AWS Lambda

  Overview


  This is the AWS Lambda API Reference. The AWS Lambda Developer Guide provides additional information. For the
  service overview, see What is AWS Lambda, and
  for information about how the service works, see AWS Lambda: How it Works in the
  AWS Lambda Developer Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.lambda AWSLambda]))

(defn publish-version
  "Creates a version from the
   current code and configuration of a function. Use versions to create a snapshot of your function code and
   configuration that doesn't change.


   AWS Lambda doesn't publish a version if the function's configuration and code haven't changed since the last
   version. Use UpdateFunctionCode or UpdateFunctionConfiguration to update the function before
   publishing a version.


   Clients can invoke versions directly or with an alias. To create an alias, use CreateAlias.

  publish-version-request - `com.amazonaws.services.lambda.model.PublishVersionRequest`

  returns: Result of the PublishVersion operation returned by the service. - `com.amazonaws.services.lambda.model.PublishVersionResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.PublishVersionResult [^AWSLambda this ^com.amazonaws.services.lambda.model.PublishVersionRequest publish-version-request]
    (-> this (.publishVersion publish-version-request))))

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

  invoke-request - `com.amazonaws.services.lambda.model.InvokeRequest`

  returns: Result of the Invoke operation returned by the service. - `com.amazonaws.services.lambda.model.InvokeResult`

  throws: com.amazonaws.services.lambda.model.UnsupportedMediaTypeException - The content type of the Invoke request body is not JSON."
  (^com.amazonaws.services.lambda.model.InvokeResult [^AWSLambda this ^com.amazonaws.services.lambda.model.InvokeRequest invoke-request]
    (-> this (.invoke invoke-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AWSLambda this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn get-layer-version-policy
  "Returns the permission policy for a version of an AWS Lambda layer. For more
   information, see AddLayerVersionPermission.

  get-layer-version-policy-request - `com.amazonaws.services.lambda.model.GetLayerVersionPolicyRequest`

  returns: Result of the GetLayerVersionPolicy operation returned by the service. - `com.amazonaws.services.lambda.model.GetLayerVersionPolicyResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.GetLayerVersionPolicyResult [^AWSLambda this ^com.amazonaws.services.lambda.model.GetLayerVersionPolicyRequest get-layer-version-policy-request]
    (-> this (.getLayerVersionPolicy get-layer-version-policy-request))))

(defn waiters
  "returns: `com.amazonaws.services.lambda.waiters.AWSLambdaWaiters`"
  (^com.amazonaws.services.lambda.waiters.AWSLambdaWaiters [^AWSLambda this]
    (-> this (.waiters))))

(defn get-function
  "Returns information about the function or function version, with a link to download the deployment package that's
   valid for 10 minutes. If you specify a function version, only details that are specific to that version are
   returned.

  get-function-request - `com.amazonaws.services.lambda.model.GetFunctionRequest`

  returns: Result of the GetFunction operation returned by the service. - `com.amazonaws.services.lambda.model.GetFunctionResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.GetFunctionResult [^AWSLambda this ^com.amazonaws.services.lambda.model.GetFunctionRequest get-function-request]
    (-> this (.getFunction get-function-request))))

(defn list-tags
  "Returns a function's tags. You can also
   view tags with GetFunction.

  list-tags-request - `com.amazonaws.services.lambda.model.ListTagsRequest`

  returns: Result of the ListTags operation returned by the service. - `com.amazonaws.services.lambda.model.ListTagsResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.ListTagsResult [^AWSLambda this ^com.amazonaws.services.lambda.model.ListTagsRequest list-tags-request]
    (-> this (.listTags list-tags-request))))

(defn list-layers
  "Lists AWS Lambda layers and
   shows information about the latest version of each. Specify a runtime identifier to list only
   layers that indicate that they're compatible with that runtime.

  list-layers-request - `com.amazonaws.services.lambda.model.ListLayersRequest`

  returns: Result of the ListLayers operation returned by the service. - `com.amazonaws.services.lambda.model.ListLayersResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.ListLayersResult [^AWSLambda this ^com.amazonaws.services.lambda.model.ListLayersRequest list-layers-request]
    (-> this (.listLayers list-layers-request))))

(defn update-event-source-mapping
  "Updates an event source mapping. You can change the function that AWS Lambda invokes, or pause invocation and
   resume later from the same location.

  update-event-source-mapping-request - `com.amazonaws.services.lambda.model.UpdateEventSourceMappingRequest`

  returns: Result of the UpdateEventSourceMapping operation returned by the service. - `com.amazonaws.services.lambda.model.UpdateEventSourceMappingResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.UpdateEventSourceMappingResult [^AWSLambda this ^com.amazonaws.services.lambda.model.UpdateEventSourceMappingRequest update-event-source-mapping-request]
    (-> this (.updateEventSourceMapping update-event-source-mapping-request))))

(defn publish-layer-version
  "Creates an AWS Lambda layer
   from a ZIP archive. Each time you call PublishLayerVersion with the same version name, a new version
   is created.


   Add layers to your function with CreateFunction or UpdateFunctionConfiguration.

  publish-layer-version-request - `com.amazonaws.services.lambda.model.PublishLayerVersionRequest`

  returns: Result of the PublishLayerVersion operation returned by the service. - `com.amazonaws.services.lambda.model.PublishLayerVersionResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.PublishLayerVersionResult [^AWSLambda this ^com.amazonaws.services.lambda.model.PublishLayerVersionRequest publish-layer-version-request]
    (-> this (.publishLayerVersion publish-layer-version-request))))

(defn get-layer-version
  "Returns information about a version of an AWS Lambda layer, with a link
   to download the layer archive that's valid for 10 minutes.

  get-layer-version-request - `com.amazonaws.services.lambda.model.GetLayerVersionRequest`

  returns: Result of the GetLayerVersion operation returned by the service. - `com.amazonaws.services.lambda.model.GetLayerVersionResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.GetLayerVersionResult [^AWSLambda this ^com.amazonaws.services.lambda.model.GetLayerVersionRequest get-layer-version-request]
    (-> this (.getLayerVersion get-layer-version-request))))

(defn list-functions
  "Returns a list of Lambda functions, with the version-specific configuration of each.


   Set FunctionVersion to ALL to include all published versions of each function in
   addition to the unpublished version. To get more information about a function or version, use GetFunction.

  list-functions-request - `com.amazonaws.services.lambda.model.ListFunctionsRequest`

  returns: Result of the ListFunctions operation returned by the service. - `com.amazonaws.services.lambda.model.ListFunctionsResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.ListFunctionsResult [^AWSLambda this ^com.amazonaws.services.lambda.model.ListFunctionsRequest list-functions-request]
    (-> this (.listFunctions list-functions-request)))
  (^com.amazonaws.services.lambda.model.ListFunctionsResult [^AWSLambda this]
    (-> this (.listFunctions))))

(defn untag-resource
  "Removes tags from a function.

  untag-resource-request - `com.amazonaws.services.lambda.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.lambda.model.UntagResourceResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.UntagResourceResult [^AWSLambda this ^com.amazonaws.services.lambda.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn get-event-source-mapping
  "Returns details about an event source mapping. You can get the identifier of a mapping from the output of
   ListEventSourceMappings.

  get-event-source-mapping-request - `com.amazonaws.services.lambda.model.GetEventSourceMappingRequest`

  returns: Result of the GetEventSourceMapping operation returned by the service. - `com.amazonaws.services.lambda.model.GetEventSourceMappingResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.GetEventSourceMappingResult [^AWSLambda this ^com.amazonaws.services.lambda.model.GetEventSourceMappingRequest get-event-source-mapping-request]
    (-> this (.getEventSourceMapping get-event-source-mapping-request))))

(defn list-layer-versions
  "Lists the versions of an AWS
   Lambda layer. Versions that have been deleted aren't listed. Specify a runtime identifier to list only
   versions that indicate that they're compatible with that runtime.

  list-layer-versions-request - `com.amazonaws.services.lambda.model.ListLayerVersionsRequest`

  returns: Result of the ListLayerVersions operation returned by the service. - `com.amazonaws.services.lambda.model.ListLayerVersionsResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.ListLayerVersionsResult [^AWSLambda this ^com.amazonaws.services.lambda.model.ListLayerVersionsRequest list-layer-versions-request]
    (-> this (.listLayerVersions list-layer-versions-request))))

(defn create-alias
  "Creates an alias for a Lambda
   function version. Use aliases to provide clients with a function identifier that you can update to invoke a
   different version.


   You can also map an alias to split invocation requests between two versions. Use the RoutingConfig
   parameter to specify a second version and the percentage of invocation requests that it receives.

  create-alias-request - `com.amazonaws.services.lambda.model.CreateAliasRequest`

  returns: Result of the CreateAlias operation returned by the service. - `com.amazonaws.services.lambda.model.CreateAliasResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.CreateAliasResult [^AWSLambda this ^com.amazonaws.services.lambda.model.CreateAliasRequest create-alias-request]
    (-> this (.createAlias create-alias-request))))

(defn delete-alias
  "Deletes a Lambda function alias.

  delete-alias-request - `com.amazonaws.services.lambda.model.DeleteAliasRequest`

  returns: Result of the DeleteAlias operation returned by the service. - `com.amazonaws.services.lambda.model.DeleteAliasResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.DeleteAliasResult [^AWSLambda this ^com.amazonaws.services.lambda.model.DeleteAliasRequest delete-alias-request]
    (-> this (.deleteAlias delete-alias-request))))

(defn add-layer-version-permission
  "Adds permissions to the resource-based policy of a version of an AWS Lambda layer. Use this
   action to grant layer usage permission to other accounts. You can grant permission to a single account, all AWS
   accounts, or all accounts in an organization.


   To revoke permission, call RemoveLayerVersionPermission with the statement ID that you specified when you
   added it.

  add-layer-version-permission-request - `com.amazonaws.services.lambda.model.AddLayerVersionPermissionRequest`

  returns: Result of the AddLayerVersionPermission operation returned by the service. - `com.amazonaws.services.lambda.model.AddLayerVersionPermissionResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.AddLayerVersionPermissionResult [^AWSLambda this ^com.amazonaws.services.lambda.model.AddLayerVersionPermissionRequest add-layer-version-permission-request]
    (-> this (.addLayerVersionPermission add-layer-version-permission-request))))

(defn list-event-source-mappings
  "Lists event source mappings. Specify an EventSourceArn to only show event source mappings for a
   single event source.

  list-event-source-mappings-request - `com.amazonaws.services.lambda.model.ListEventSourceMappingsRequest`

  returns: Result of the ListEventSourceMappings operation returned by the service. - `com.amazonaws.services.lambda.model.ListEventSourceMappingsResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.ListEventSourceMappingsResult [^AWSLambda this ^com.amazonaws.services.lambda.model.ListEventSourceMappingsRequest list-event-source-mappings-request]
    (-> this (.listEventSourceMappings list-event-source-mappings-request)))
  (^com.amazonaws.services.lambda.model.ListEventSourceMappingsResult [^AWSLambda this]
    (-> this (.listEventSourceMappings))))

(defn get-alias
  "Returns details about a Lambda function alias.

  get-alias-request - `com.amazonaws.services.lambda.model.GetAliasRequest`

  returns: Result of the GetAlias operation returned by the service. - `com.amazonaws.services.lambda.model.GetAliasResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.GetAliasResult [^AWSLambda this ^com.amazonaws.services.lambda.model.GetAliasRequest get-alias-request]
    (-> this (.getAlias get-alias-request))))

(defn update-function-configuration
  "Modify the version-specific settings of a Lambda function.


   These settings can vary between versions of a function and are locked when you publish a version. You can't
   modify the configuration of a published version, only the unpublished version.


   To configure function concurrency, use PutFunctionConcurrency. To grant invoke permissions to an account
   or AWS service, use AddPermission.

  update-function-configuration-request - `com.amazonaws.services.lambda.model.UpdateFunctionConfigurationRequest`

  returns: Result of the UpdateFunctionConfiguration operation returned by the service. - `com.amazonaws.services.lambda.model.UpdateFunctionConfigurationResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.UpdateFunctionConfigurationResult [^AWSLambda this ^com.amazonaws.services.lambda.model.UpdateFunctionConfigurationRequest update-function-configuration-request]
    (-> this (.updateFunctionConfiguration update-function-configuration-request))))

(defn remove-permission
  "Revokes function-use permission from an AWS service or another account. You can get the ID of the statement from
   the output of GetPolicy.

  remove-permission-request - `com.amazonaws.services.lambda.model.RemovePermissionRequest`

  returns: Result of the RemovePermission operation returned by the service. - `com.amazonaws.services.lambda.model.RemovePermissionResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.RemovePermissionResult [^AWSLambda this ^com.amazonaws.services.lambda.model.RemovePermissionRequest remove-permission-request]
    (-> this (.removePermission remove-permission-request))))

(defn remove-layer-version-permission
  "Removes a statement from the permissions policy for a version of an AWS Lambda layer. For more
   information, see AddLayerVersionPermission.

  remove-layer-version-permission-request - `com.amazonaws.services.lambda.model.RemoveLayerVersionPermissionRequest`

  returns: Result of the RemoveLayerVersionPermission operation returned by the service. - `com.amazonaws.services.lambda.model.RemoveLayerVersionPermissionResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.RemoveLayerVersionPermissionResult [^AWSLambda this ^com.amazonaws.services.lambda.model.RemoveLayerVersionPermissionRequest remove-layer-version-permission-request]
    (-> this (.removeLayerVersionPermission remove-layer-version-permission-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSLambda this]
    (-> this (.shutdown))))

(defn update-alias
  "Updates the configuration of a Lambda function alias.

  update-alias-request - `com.amazonaws.services.lambda.model.UpdateAliasRequest`

  returns: Result of the UpdateAlias operation returned by the service. - `com.amazonaws.services.lambda.model.UpdateAliasResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.UpdateAliasResult [^AWSLambda this ^com.amazonaws.services.lambda.model.UpdateAliasRequest update-alias-request]
    (-> this (.updateAlias update-alias-request))))

(defn update-function-code
  "Updates a Lambda function's code.


   The function's code is locked when you publish a version. You can't modify the code of a published version, only
   the unpublished version.

  update-function-code-request - `com.amazonaws.services.lambda.model.UpdateFunctionCodeRequest`

  returns: Result of the UpdateFunctionCode operation returned by the service. - `com.amazonaws.services.lambda.model.UpdateFunctionCodeResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.UpdateFunctionCodeResult [^AWSLambda this ^com.amazonaws.services.lambda.model.UpdateFunctionCodeRequest update-function-code-request]
    (-> this (.updateFunctionCode update-function-code-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"lambda.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"lambda.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AWSLambda this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn delete-layer-version
  "Deletes a version of an AWS
   Lambda layer. Deleted versions can no longer be viewed or added to functions. To avoid breaking functions, a
   copy of the version remains in Lambda until no functions refer to it.

  delete-layer-version-request - `com.amazonaws.services.lambda.model.DeleteLayerVersionRequest`

  returns: Result of the DeleteLayerVersion operation returned by the service. - `com.amazonaws.services.lambda.model.DeleteLayerVersionResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.DeleteLayerVersionResult [^AWSLambda this ^com.amazonaws.services.lambda.model.DeleteLayerVersionRequest delete-layer-version-request]
    (-> this (.deleteLayerVersion delete-layer-version-request))))

(defn delete-event-source-mapping
  "Deletes an event source
   mapping. You can get the identifier of a mapping from the output of ListEventSourceMappings.

  delete-event-source-mapping-request - `com.amazonaws.services.lambda.model.DeleteEventSourceMappingRequest`

  returns: Result of the DeleteEventSourceMapping operation returned by the service. - `com.amazonaws.services.lambda.model.DeleteEventSourceMappingResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.DeleteEventSourceMappingResult [^AWSLambda this ^com.amazonaws.services.lambda.model.DeleteEventSourceMappingRequest delete-event-source-mapping-request]
    (-> this (.deleteEventSourceMapping delete-event-source-mapping-request))))

(defn get-policy
  "Returns the resource-based IAM
   policy for a function, version, or alias.

  get-policy-request - `com.amazonaws.services.lambda.model.GetPolicyRequest`

  returns: Result of the GetPolicy operation returned by the service. - `com.amazonaws.services.lambda.model.GetPolicyResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.GetPolicyResult [^AWSLambda this ^com.amazonaws.services.lambda.model.GetPolicyRequest get-policy-request]
    (-> this (.getPolicy get-policy-request))))

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

  create-function-request - `com.amazonaws.services.lambda.model.CreateFunctionRequest`

  returns: Result of the CreateFunction operation returned by the service. - `com.amazonaws.services.lambda.model.CreateFunctionResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.CreateFunctionResult [^AWSLambda this ^com.amazonaws.services.lambda.model.CreateFunctionRequest create-function-request]
    (-> this (.createFunction create-function-request))))

(defn list-versions-by-function
  "Returns a list of versions,
   with the version-specific configuration of each.

  list-versions-by-function-request - `com.amazonaws.services.lambda.model.ListVersionsByFunctionRequest`

  returns: Result of the ListVersionsByFunction operation returned by the service. - `com.amazonaws.services.lambda.model.ListVersionsByFunctionResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.ListVersionsByFunctionResult [^AWSLambda this ^com.amazonaws.services.lambda.model.ListVersionsByFunctionRequest list-versions-by-function-request]
    (-> this (.listVersionsByFunction list-versions-by-function-request))))

(defn invoke-async
  "Deprecated.

  invoke-async-request - `com.amazonaws.services.lambda.model.InvokeAsyncRequest`

  returns: Result of the InvokeAsync operation returned by the service. - `com.amazonaws.services.lambda.model.InvokeAsyncResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.InvokeAsyncResult [^AWSLambda this ^com.amazonaws.services.lambda.model.InvokeAsyncRequest invoke-async-request]
    (-> this (.invokeAsync invoke-async-request))))

(defn list-aliases
  "Returns a list of aliases for
   a Lambda function.

  list-aliases-request - `com.amazonaws.services.lambda.model.ListAliasesRequest`

  returns: Result of the ListAliases operation returned by the service. - `com.amazonaws.services.lambda.model.ListAliasesResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.ListAliasesResult [^AWSLambda this ^com.amazonaws.services.lambda.model.ListAliasesRequest list-aliases-request]
    (-> this (.listAliases list-aliases-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSLambda this ^com.amazonaws.AmazonWebServiceRequest request]
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

  put-function-concurrency-request - `com.amazonaws.services.lambda.model.PutFunctionConcurrencyRequest`

  returns: Result of the PutFunctionConcurrency operation returned by the service. - `com.amazonaws.services.lambda.model.PutFunctionConcurrencyResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.PutFunctionConcurrencyResult [^AWSLambda this ^com.amazonaws.services.lambda.model.PutFunctionConcurrencyRequest put-function-concurrency-request]
    (-> this (.putFunctionConcurrency put-function-concurrency-request))))

(defn delete-function
  "Deletes a Lambda function. To delete a specific function version, use the Qualifier parameter.
   Otherwise, all versions and aliases are deleted.


   To delete Lambda event source mappings that invoke a function, use DeleteEventSourceMapping. For AWS
   services and resources that invoke your function directly, delete the trigger in the service where you originally
   configured it.

  delete-function-request - `com.amazonaws.services.lambda.model.DeleteFunctionRequest`

  returns: Result of the DeleteFunction operation returned by the service. - `com.amazonaws.services.lambda.model.DeleteFunctionResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.DeleteFunctionResult [^AWSLambda this ^com.amazonaws.services.lambda.model.DeleteFunctionRequest delete-function-request]
    (-> this (.deleteFunction delete-function-request))))

(defn get-account-settings
  "Retrieves details about your account's limits and usage in an AWS Region.

  get-account-settings-request - `com.amazonaws.services.lambda.model.GetAccountSettingsRequest`

  returns: Result of the GetAccountSettings operation returned by the service. - `com.amazonaws.services.lambda.model.GetAccountSettingsResult`

  throws: com.amazonaws.services.lambda.model.TooManyRequestsException - Request throughput limit exceeded."
  (^com.amazonaws.services.lambda.model.GetAccountSettingsResult [^AWSLambda this ^com.amazonaws.services.lambda.model.GetAccountSettingsRequest get-account-settings-request]
    (-> this (.getAccountSettings get-account-settings-request))))

(defn delete-function-concurrency
  "Removes a concurrent execution limit from a function.

  delete-function-concurrency-request - `com.amazonaws.services.lambda.model.DeleteFunctionConcurrencyRequest`

  returns: Result of the DeleteFunctionConcurrency operation returned by the service. - `com.amazonaws.services.lambda.model.DeleteFunctionConcurrencyResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.DeleteFunctionConcurrencyResult [^AWSLambda this ^com.amazonaws.services.lambda.model.DeleteFunctionConcurrencyRequest delete-function-concurrency-request]
    (-> this (.deleteFunctionConcurrency delete-function-concurrency-request))))

(defn create-event-source-mapping
  "Creates a mapping between an event source and an AWS Lambda function. Lambda reads items from the event source
   and triggers the function.


   For details about each event source type, see the following topics.




   Using AWS Lambda with Amazon Kinesis




   Using AWS Lambda with Amazon SQS




   Using AWS Lambda with Amazon DynamoDB

  create-event-source-mapping-request - `com.amazonaws.services.lambda.model.CreateEventSourceMappingRequest`

  returns: Result of the CreateEventSourceMapping operation returned by the service. - `com.amazonaws.services.lambda.model.CreateEventSourceMappingResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.CreateEventSourceMappingResult [^AWSLambda this ^com.amazonaws.services.lambda.model.CreateEventSourceMappingRequest create-event-source-mapping-request]
    (-> this (.createEventSourceMapping create-event-source-mapping-request))))

(defn tag-resource
  "Adds tags to a function.

  tag-resource-request - `com.amazonaws.services.lambda.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.lambda.model.TagResourceResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.TagResourceResult [^AWSLambda this ^com.amazonaws.services.lambda.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

(defn get-function-configuration
  "Returns the version-specific settings of a Lambda function or version. The output includes only options that can
   vary between versions of a function. To modify these settings, use UpdateFunctionConfiguration.


   To get all of a function's details, including function-level settings, use GetFunction.

  get-function-configuration-request - `com.amazonaws.services.lambda.model.GetFunctionConfigurationRequest`

  returns: Result of the GetFunctionConfiguration operation returned by the service. - `com.amazonaws.services.lambda.model.GetFunctionConfigurationResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.GetFunctionConfigurationResult [^AWSLambda this ^com.amazonaws.services.lambda.model.GetFunctionConfigurationRequest get-function-configuration-request]
    (-> this (.getFunctionConfiguration get-function-configuration-request))))

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

  add-permission-request - `com.amazonaws.services.lambda.model.AddPermissionRequest`

  returns: Result of the AddPermission operation returned by the service. - `com.amazonaws.services.lambda.model.AddPermissionResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.AddPermissionResult [^AWSLambda this ^com.amazonaws.services.lambda.model.AddPermissionRequest add-permission-request]
    (-> this (.addPermission add-permission-request))))

(defn get-layer-version-by-arn
  "Returns information about a version of an AWS Lambda layer, with a link
   to download the layer archive that's valid for 10 minutes.

  get-layer-version-by-arn-request - `com.amazonaws.services.lambda.model.GetLayerVersionByArnRequest`

  returns: Result of the GetLayerVersionByArn operation returned by the service. - `com.amazonaws.services.lambda.model.GetLayerVersionByArnResult`

  throws: com.amazonaws.services.lambda.model.ServiceException - The AWS Lambda service encountered an internal error."
  (^com.amazonaws.services.lambda.model.GetLayerVersionByArnResult [^AWSLambda this ^com.amazonaws.services.lambda.model.GetLayerVersionByArnRequest get-layer-version-by-arn-request]
    (-> this (.getLayerVersionByArn get-layer-version-by-arn-request))))

