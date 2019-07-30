(ns com.amazonaws.services.lambda.AWSLambdaAsync
  "Interface for accessing AWS Lambda asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSLambdaAsync instead.


  AWS Lambda

  Overview


  This is the AWS Lambda API Reference. The AWS Lambda Developer Guide provides additional information. For the
  service overview, see What is AWS Lambda, and
  for information about how the service works, see AWS Lambda: How it Works in the
  AWS Lambda Developer Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.lambda AWSLambdaAsync]))

(defn untag-resource-async
  "Removes tags from a function.

  untag-resource-request - `com.amazonaws.services.lambda.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn delete-event-source-mapping-async
  "Deletes an event source
   mapping. You can get the identifier of a mapping from the output of ListEventSourceMappings.

  delete-event-source-mapping-request - `com.amazonaws.services.lambda.model.DeleteEventSourceMappingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEventSourceMapping operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.DeleteEventSourceMappingResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.DeleteEventSourceMappingRequest delete-event-source-mapping-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEventSourceMappingAsync delete-event-source-mapping-request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.DeleteEventSourceMappingRequest delete-event-source-mapping-request]
    (-> this (.deleteEventSourceMappingAsync delete-event-source-mapping-request))))

(defn list-aliases-async
  "Returns a list of aliases for
   a Lambda function.

  list-aliases-request - `com.amazonaws.services.lambda.model.ListAliasesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAliases operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.ListAliasesResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.ListAliasesRequest list-aliases-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAliasesAsync list-aliases-request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.ListAliasesRequest list-aliases-request]
    (-> this (.listAliasesAsync list-aliases-request))))

(defn get-account-settings-async
  "Retrieves details about your account's limits and usage in an AWS Region.

  get-account-settings-request - `com.amazonaws.services.lambda.model.GetAccountSettingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAccountSettings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.GetAccountSettingsResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.GetAccountSettingsRequest get-account-settings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAccountSettingsAsync get-account-settings-request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.GetAccountSettingsRequest get-account-settings-request]
    (-> this (.getAccountSettingsAsync get-account-settings-request))))

(defn create-alias-async
  "Creates an alias for a Lambda
   function version. Use aliases to provide clients with a function identifier that you can update to invoke a
   different version.


   You can also map an alias to split invocation requests between two versions. Use the RoutingConfig
   parameter to specify a second version and the percentage of invocation requests that it receives.

  create-alias-request - `com.amazonaws.services.lambda.model.CreateAliasRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAlias operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.CreateAliasResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.CreateAliasRequest create-alias-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAliasAsync create-alias-request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.CreateAliasRequest create-alias-request]
    (-> this (.createAliasAsync create-alias-request))))

(defn list-tags-async
  "Returns a function's tags. You can also
   view tags with GetFunction.

  list-tags-request - `com.amazonaws.services.lambda.model.ListTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.ListTagsResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.ListTagsRequest list-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsAsync list-tags-request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.ListTagsRequest list-tags-request]
    (-> this (.listTagsAsync list-tags-request))))

(defn delete-layer-version-async
  "Deletes a version of an AWS
   Lambda layer. Deleted versions can no longer be viewed or added to functions. To avoid breaking functions, a
   copy of the version remains in Lambda until no functions refer to it.

  delete-layer-version-request - `com.amazonaws.services.lambda.model.DeleteLayerVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLayerVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.DeleteLayerVersionResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.DeleteLayerVersionRequest delete-layer-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLayerVersionAsync delete-layer-version-request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.DeleteLayerVersionRequest delete-layer-version-request]
    (-> this (.deleteLayerVersionAsync delete-layer-version-request))))

(defn get-layer-version-async
  "Returns information about a version of an AWS Lambda layer, with a link
   to download the layer archive that's valid for 10 minutes.

  get-layer-version-request - `com.amazonaws.services.lambda.model.GetLayerVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLayerVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.GetLayerVersionResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.GetLayerVersionRequest get-layer-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLayerVersionAsync get-layer-version-request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.GetLayerVersionRequest get-layer-version-request]
    (-> this (.getLayerVersionAsync get-layer-version-request))))

(defn list-layer-versions-async
  "Lists the versions of an AWS
   Lambda layer. Versions that have been deleted aren't listed. Specify a runtime identifier to list only
   versions that indicate that they're compatible with that runtime.

  list-layer-versions-request - `com.amazonaws.services.lambda.model.ListLayerVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListLayerVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.ListLayerVersionsResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.ListLayerVersionsRequest list-layer-versions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listLayerVersionsAsync list-layer-versions-request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.ListLayerVersionsRequest list-layer-versions-request]
    (-> this (.listLayerVersionsAsync list-layer-versions-request))))

(defn remove-layer-version-permission-async
  "Removes a statement from the permissions policy for a version of an AWS Lambda layer. For more
   information, see AddLayerVersionPermission.

  remove-layer-version-permission-request - `com.amazonaws.services.lambda.model.RemoveLayerVersionPermissionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveLayerVersionPermission operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.RemoveLayerVersionPermissionResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.RemoveLayerVersionPermissionRequest remove-layer-version-permission-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeLayerVersionPermissionAsync remove-layer-version-permission-request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.RemoveLayerVersionPermissionRequest remove-layer-version-permission-request]
    (-> this (.removeLayerVersionPermissionAsync remove-layer-version-permission-request))))

(defn list-versions-by-function-async
  "Returns a list of versions,
   with the version-specific configuration of each.

  list-versions-by-function-request - `com.amazonaws.services.lambda.model.ListVersionsByFunctionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListVersionsByFunction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.ListVersionsByFunctionResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.ListVersionsByFunctionRequest list-versions-by-function-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listVersionsByFunctionAsync list-versions-by-function-request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.ListVersionsByFunctionRequest list-versions-by-function-request]
    (-> this (.listVersionsByFunctionAsync list-versions-by-function-request))))

(defn list-functions-async
  "Returns a list of Lambda functions, with the version-specific configuration of each.


   Set FunctionVersion to ALL to include all published versions of each function in
   addition to the unpublished version. To get more information about a function or version, use GetFunction.

  list-functions-request - `com.amazonaws.services.lambda.model.ListFunctionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListFunctions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.ListFunctionsResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.ListFunctionsRequest list-functions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listFunctionsAsync list-functions-request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.ListFunctionsRequest list-functions-request]
    (-> this (.listFunctionsAsync list-functions-request)))
  (^java.util.concurrent.Future [^AWSLambdaAsync this]
    (-> this (.listFunctionsAsync))))

(defn update-function-configuration-async
  "Modify the version-specific settings of a Lambda function.


   These settings can vary between versions of a function and are locked when you publish a version. You can't
   modify the configuration of a published version, only the unpublished version.


   To configure function concurrency, use PutFunctionConcurrency. To grant invoke permissions to an account
   or AWS service, use AddPermission.

  update-function-configuration-request - `com.amazonaws.services.lambda.model.UpdateFunctionConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateFunctionConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.UpdateFunctionConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.UpdateFunctionConfigurationRequest update-function-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateFunctionConfigurationAsync update-function-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.UpdateFunctionConfigurationRequest update-function-configuration-request]
    (-> this (.updateFunctionConfigurationAsync update-function-configuration-request))))

(defn add-layer-version-permission-async
  "Adds permissions to the resource-based policy of a version of an AWS Lambda layer. Use this
   action to grant layer usage permission to other accounts. You can grant permission to a single account, all AWS
   accounts, or all accounts in an organization.


   To revoke permission, call RemoveLayerVersionPermission with the statement ID that you specified when you
   added it.

  add-layer-version-permission-request - `com.amazonaws.services.lambda.model.AddLayerVersionPermissionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddLayerVersionPermission operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.AddLayerVersionPermissionResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.AddLayerVersionPermissionRequest add-layer-version-permission-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addLayerVersionPermissionAsync add-layer-version-permission-request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.AddLayerVersionPermissionRequest add-layer-version-permission-request]
    (-> this (.addLayerVersionPermissionAsync add-layer-version-permission-request))))

(defn publish-version-async
  "Creates a version from the
   current code and configuration of a function. Use versions to create a snapshot of your function code and
   configuration that doesn't change.


   AWS Lambda doesn't publish a version if the function's configuration and code haven't changed since the last
   version. Use UpdateFunctionCode or UpdateFunctionConfiguration to update the function before
   publishing a version.


   Clients can invoke versions directly or with an alias. To create an alias, use CreateAlias.

  publish-version-request - `com.amazonaws.services.lambda.model.PublishVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PublishVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.PublishVersionResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.PublishVersionRequest publish-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.publishVersionAsync publish-version-request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.PublishVersionRequest publish-version-request]
    (-> this (.publishVersionAsync publish-version-request))))

(defn publish-layer-version-async
  "Creates an AWS Lambda layer
   from a ZIP archive. Each time you call PublishLayerVersion with the same version name, a new version
   is created.


   Add layers to your function with CreateFunction or UpdateFunctionConfiguration.

  publish-layer-version-request - `com.amazonaws.services.lambda.model.PublishLayerVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PublishLayerVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.PublishLayerVersionResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.PublishLayerVersionRequest publish-layer-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.publishLayerVersionAsync publish-layer-version-request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.PublishLayerVersionRequest publish-layer-version-request]
    (-> this (.publishLayerVersionAsync publish-layer-version-request))))

(defn remove-permission-async
  "Revokes function-use permission from an AWS service or another account. You can get the ID of the statement from
   the output of GetPolicy.

  remove-permission-request - `com.amazonaws.services.lambda.model.RemovePermissionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemovePermission operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.RemovePermissionResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.RemovePermissionRequest remove-permission-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removePermissionAsync remove-permission-request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.RemovePermissionRequest remove-permission-request]
    (-> this (.removePermissionAsync remove-permission-request))))

(defn list-event-source-mappings-async
  "Lists event source mappings. Specify an EventSourceArn to only show event source mappings for a
   single event source.

  list-event-source-mappings-request - `com.amazonaws.services.lambda.model.ListEventSourceMappingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListEventSourceMappings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.ListEventSourceMappingsResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.ListEventSourceMappingsRequest list-event-source-mappings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listEventSourceMappingsAsync list-event-source-mappings-request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.ListEventSourceMappingsRequest list-event-source-mappings-request]
    (-> this (.listEventSourceMappingsAsync list-event-source-mappings-request)))
  (^java.util.concurrent.Future [^AWSLambdaAsync this]
    (-> this (.listEventSourceMappingsAsync))))

(defn update-event-source-mapping-async
  "Updates an event source mapping. You can change the function that AWS Lambda invokes, or pause invocation and
   resume later from the same location.

  update-event-source-mapping-request - `com.amazonaws.services.lambda.model.UpdateEventSourceMappingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateEventSourceMapping operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.UpdateEventSourceMappingResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.UpdateEventSourceMappingRequest update-event-source-mapping-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateEventSourceMappingAsync update-event-source-mapping-request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.UpdateEventSourceMappingRequest update-event-source-mapping-request]
    (-> this (.updateEventSourceMappingAsync update-event-source-mapping-request))))

(defn delete-function-concurrency-async
  "Removes a concurrent execution limit from a function.

  delete-function-concurrency-request - `com.amazonaws.services.lambda.model.DeleteFunctionConcurrencyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFunctionConcurrency operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.DeleteFunctionConcurrencyResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.DeleteFunctionConcurrencyRequest delete-function-concurrency-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFunctionConcurrencyAsync delete-function-concurrency-request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.DeleteFunctionConcurrencyRequest delete-function-concurrency-request]
    (-> this (.deleteFunctionConcurrencyAsync delete-function-concurrency-request))))

(defn get-layer-version-policy-async
  "Returns the permission policy for a version of an AWS Lambda layer. For more
   information, see AddLayerVersionPermission.

  get-layer-version-policy-request - `com.amazonaws.services.lambda.model.GetLayerVersionPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLayerVersionPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.GetLayerVersionPolicyResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.GetLayerVersionPolicyRequest get-layer-version-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLayerVersionPolicyAsync get-layer-version-policy-request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.GetLayerVersionPolicyRequest get-layer-version-policy-request]
    (-> this (.getLayerVersionPolicyAsync get-layer-version-policy-request))))

(defn add-permission-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddPermission operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.AddPermissionResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.AddPermissionRequest add-permission-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addPermissionAsync add-permission-request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.AddPermissionRequest add-permission-request]
    (-> this (.addPermissionAsync add-permission-request))))

(defn update-function-code-async
  "Updates a Lambda function's code.


   The function's code is locked when you publish a version. You can't modify the code of a published version, only
   the unpublished version.

  update-function-code-request - `com.amazonaws.services.lambda.model.UpdateFunctionCodeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateFunctionCode operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.UpdateFunctionCodeResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.UpdateFunctionCodeRequest update-function-code-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateFunctionCodeAsync update-function-code-request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.UpdateFunctionCodeRequest update-function-code-request]
    (-> this (.updateFunctionCodeAsync update-function-code-request))))

(defn create-event-source-mapping-async
  "Creates a mapping between an event source and an AWS Lambda function. Lambda reads items from the event source
   and triggers the function.


   For details about each event source type, see the following topics.




   Using AWS Lambda with Amazon Kinesis




   Using AWS Lambda with Amazon SQS




   Using AWS Lambda with Amazon DynamoDB

  create-event-source-mapping-request - `com.amazonaws.services.lambda.model.CreateEventSourceMappingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateEventSourceMapping operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.CreateEventSourceMappingResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.CreateEventSourceMappingRequest create-event-source-mapping-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createEventSourceMappingAsync create-event-source-mapping-request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.CreateEventSourceMappingRequest create-event-source-mapping-request]
    (-> this (.createEventSourceMappingAsync create-event-source-mapping-request))))

(defn put-function-concurrency-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutFunctionConcurrency operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.PutFunctionConcurrencyResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.PutFunctionConcurrencyRequest put-function-concurrency-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putFunctionConcurrencyAsync put-function-concurrency-request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.PutFunctionConcurrencyRequest put-function-concurrency-request]
    (-> this (.putFunctionConcurrencyAsync put-function-concurrency-request))))

(defn get-function-configuration-async
  "Returns the version-specific settings of a Lambda function or version. The output includes only options that can
   vary between versions of a function. To modify these settings, use UpdateFunctionConfiguration.


   To get all of a function's details, including function-level settings, use GetFunction.

  get-function-configuration-request - `com.amazonaws.services.lambda.model.GetFunctionConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFunctionConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.GetFunctionConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.GetFunctionConfigurationRequest get-function-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFunctionConfigurationAsync get-function-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.GetFunctionConfigurationRequest get-function-configuration-request]
    (-> this (.getFunctionConfigurationAsync get-function-configuration-request))))

(defn get-event-source-mapping-async
  "Returns details about an event source mapping. You can get the identifier of a mapping from the output of
   ListEventSourceMappings.

  get-event-source-mapping-request - `com.amazonaws.services.lambda.model.GetEventSourceMappingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetEventSourceMapping operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.GetEventSourceMappingResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.GetEventSourceMappingRequest get-event-source-mapping-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getEventSourceMappingAsync get-event-source-mapping-request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.GetEventSourceMappingRequest get-event-source-mapping-request]
    (-> this (.getEventSourceMappingAsync get-event-source-mapping-request))))

(defn delete-alias-async
  "Deletes a Lambda function alias.

  delete-alias-request - `com.amazonaws.services.lambda.model.DeleteAliasRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAlias operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.DeleteAliasResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.DeleteAliasRequest delete-alias-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAliasAsync delete-alias-request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.DeleteAliasRequest delete-alias-request]
    (-> this (.deleteAliasAsync delete-alias-request))))

(defn get-layer-version-by-arn-async
  "Returns information about a version of an AWS Lambda layer, with a link
   to download the layer archive that's valid for 10 minutes.

  get-layer-version-by-arn-request - `com.amazonaws.services.lambda.model.GetLayerVersionByArnRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLayerVersionByArn operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.GetLayerVersionByArnResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.GetLayerVersionByArnRequest get-layer-version-by-arn-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLayerVersionByArnAsync get-layer-version-by-arn-request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.GetLayerVersionByArnRequest get-layer-version-by-arn-request]
    (-> this (.getLayerVersionByArnAsync get-layer-version-by-arn-request))))

(defn get-function-async
  "Returns information about the function or function version, with a link to download the deployment package that's
   valid for 10 minutes. If you specify a function version, only details that are specific to that version are
   returned.

  get-function-request - `com.amazonaws.services.lambda.model.GetFunctionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFunction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.GetFunctionResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.GetFunctionRequest get-function-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFunctionAsync get-function-request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.GetFunctionRequest get-function-request]
    (-> this (.getFunctionAsync get-function-request))))

(defn get-policy-async
  "Returns the resource-based IAM
   policy for a function, version, or alias.

  get-policy-request - `com.amazonaws.services.lambda.model.GetPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.GetPolicyResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.GetPolicyRequest get-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPolicyAsync get-policy-request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.GetPolicyRequest get-policy-request]
    (-> this (.getPolicyAsync get-policy-request))))

(defn list-layers-async
  "Lists AWS Lambda layers and
   shows information about the latest version of each. Specify a runtime identifier to list only
   layers that indicate that they're compatible with that runtime.

  list-layers-request - `com.amazonaws.services.lambda.model.ListLayersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListLayers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.ListLayersResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.ListLayersRequest list-layers-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listLayersAsync list-layers-request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.ListLayersRequest list-layers-request]
    (-> this (.listLayersAsync list-layers-request))))

(defn delete-function-async
  "Deletes a Lambda function. To delete a specific function version, use the Qualifier parameter.
   Otherwise, all versions and aliases are deleted.


   To delete Lambda event source mappings that invoke a function, use DeleteEventSourceMapping. For AWS
   services and resources that invoke your function directly, delete the trigger in the service where you originally
   configured it.

  delete-function-request - `com.amazonaws.services.lambda.model.DeleteFunctionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFunction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.DeleteFunctionResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.DeleteFunctionRequest delete-function-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFunctionAsync delete-function-request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.DeleteFunctionRequest delete-function-request]
    (-> this (.deleteFunctionAsync delete-function-request))))

(defn invoke-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the Invoke operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.InvokeResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.InvokeRequest invoke-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.invokeAsync invoke-request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.InvokeRequest invoke-request]
    (-> this (.invokeAsync invoke-request))))

(defn get-alias-async
  "Returns details about a Lambda function alias.

  get-alias-request - `com.amazonaws.services.lambda.model.GetAliasRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAlias operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.GetAliasResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.GetAliasRequest get-alias-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAliasAsync get-alias-request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.GetAliasRequest get-alias-request]
    (-> this (.getAliasAsync get-alias-request))))

(defn update-alias-async
  "Updates the configuration of a Lambda function alias.

  update-alias-request - `com.amazonaws.services.lambda.model.UpdateAliasRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAlias operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.UpdateAliasResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.UpdateAliasRequest update-alias-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAliasAsync update-alias-request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.UpdateAliasRequest update-alias-request]
    (-> this (.updateAliasAsync update-alias-request))))

(defn create-function-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateFunction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.CreateFunctionResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.CreateFunctionRequest create-function-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createFunctionAsync create-function-request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.CreateFunctionRequest create-function-request]
    (-> this (.createFunctionAsync create-function-request))))

(defn invoke-async-async
  "Deprecated.

  invoke-async-request - `com.amazonaws.services.lambda.model.InvokeAsyncRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the InvokeAsync operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.InvokeAsyncResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.InvokeAsyncRequest invoke-async-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.invokeAsyncAsync invoke-async-request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.InvokeAsyncRequest invoke-async-request]
    (-> this (.invokeAsyncAsync invoke-async-request))))

(defn tag-resource-async
  "Adds tags to a function.

  tag-resource-request - `com.amazonaws.services.lambda.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lambda.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSLambdaAsync this ^com.amazonaws.services.lambda.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

