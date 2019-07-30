(ns com.amazonaws.services.apigateway.AbstractAmazonApiGatewayAsync
  "Abstract implementation of AmazonApiGatewayAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.apigateway AbstractAmazonApiGatewayAsync]))

(defn update-documentation-part-async
  "request - Updates an existing documentation part of a given API. - `com.amazonaws.services.apigateway.model.UpdateDocumentationPartRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDocumentationPart operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateDocumentationPartResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateDocumentationPartRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDocumentationPartAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateDocumentationPartRequest request]
    (-> this (.updateDocumentationPartAsync request))))

(defn untag-resource-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Removes a tag from a given resource. - `com.amazonaws.services.apigateway.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn get-usage-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - The GET request to get the usage data of a usage plan in a specified time interval. - `com.amazonaws.services.apigateway.model.GetUsageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUsage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetUsageResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetUsageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUsageAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetUsageRequest request]
    (-> this (.getUsageAsync request))))

(defn get-account-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Requests API Gateway to get information about the current Account resource. - `com.amazonaws.services.apigateway.model.GetAccountRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetAccountResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetAccountRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAccountAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetAccountRequest request]
    (-> this (.getAccountAsync request))))

(defn get-client-certificate-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - A request to get information about the current ClientCertificate resource. - `com.amazonaws.services.apigateway.model.GetClientCertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetClientCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetClientCertificateResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetClientCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getClientCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetClientCertificateRequest request]
    (-> this (.getClientCertificateAsync request))))

(defn get-client-certificates-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - A request to get information about a collection of ClientCertificate resources. - `com.amazonaws.services.apigateway.model.GetClientCertificatesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetClientCertificates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetClientCertificatesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetClientCertificatesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getClientCertificatesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetClientCertificatesRequest request]
    (-> this (.getClientCertificatesAsync request))))

(defn get-base-path-mapping-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Request to describe a BasePathMapping resource. - `com.amazonaws.services.apigateway.model.GetBasePathMappingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBasePathMapping operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetBasePathMappingResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetBasePathMappingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBasePathMappingAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetBasePathMappingRequest request]
    (-> this (.getBasePathMappingAsync request))))

(defn create-stage-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Requests API Gateway to create a Stage resource. - `com.amazonaws.services.apigateway.model.CreateStageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateStage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.CreateStageResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateStageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createStageAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateStageRequest request]
    (-> this (.createStageAsync request))))

(defn delete-integration-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Represents a delete integration request. - `com.amazonaws.services.apigateway.model.DeleteIntegrationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteIntegration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.DeleteIntegrationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteIntegrationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteIntegrationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteIntegrationRequest request]
    (-> this (.deleteIntegrationAsync request))))

(defn get-export-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Request a new export of a RestApi for a particular Stage. - `com.amazonaws.services.apigateway.model.GetExportRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetExport operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetExportResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetExportRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getExportAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetExportRequest request]
    (-> this (.getExportAsync request))))

(defn update-request-validator-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Updates a RequestValidator of a given RestApi. - `com.amazonaws.services.apigateway.model.UpdateRequestValidatorRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRequestValidator operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateRequestValidatorResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateRequestValidatorRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRequestValidatorAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateRequestValidatorRequest request]
    (-> this (.updateRequestValidatorAsync request))))

(defn get-model-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Request to list information about a model in an existing RestApi resource. - `com.amazonaws.services.apigateway.model.GetModelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetModel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetModelResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetModelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getModelAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetModelRequest request]
    (-> this (.getModelAsync request))))

(defn update-integration-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Represents an update integration request. - `com.amazonaws.services.apigateway.model.UpdateIntegrationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateIntegration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateIntegrationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateIntegrationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateIntegrationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateIntegrationRequest request]
    (-> this (.updateIntegrationAsync request))))

(defn create-authorizer-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Request to add a new Authorizer to an existing RestApi resource. - `com.amazonaws.services.apigateway.model.CreateAuthorizerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAuthorizer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.CreateAuthorizerResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateAuthorizerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAuthorizerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateAuthorizerRequest request]
    (-> this (.createAuthorizerAsync request))))

(defn put-integration-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Sets up a method's integration. - `com.amazonaws.services.apigateway.model.PutIntegrationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutIntegration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.PutIntegrationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.PutIntegrationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putIntegrationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.PutIntegrationRequest request]
    (-> this (.putIntegrationAsync request))))

(defn update-method-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Request to update an existing Method resource. - `com.amazonaws.services.apigateway.model.UpdateMethodRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateMethod operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateMethodResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateMethodRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateMethodAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateMethodRequest request]
    (-> this (.updateMethodAsync request))))

(defn get-domain-name-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Request to get the name of a DomainName resource. - `com.amazonaws.services.apigateway.model.GetDomainNameRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDomainName operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetDomainNameResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetDomainNameRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDomainNameAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetDomainNameRequest request]
    (-> this (.getDomainNameAsync request))))

(defn update-rest-api-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Request to update an existing RestApi resource in your collection. - `com.amazonaws.services.apigateway.model.UpdateRestApiRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRestApi operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateRestApiResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateRestApiRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRestApiAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateRestApiRequest request]
    (-> this (.updateRestApiAsync request))))

(defn get-deployment-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Requests API Gateway to get information about a Deployment resource. - `com.amazonaws.services.apigateway.model.GetDeploymentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDeployment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetDeploymentResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetDeploymentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDeploymentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetDeploymentRequest request]
    (-> this (.getDeploymentAsync request))))

(defn get-base-path-mappings-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - A request to get information about a collection of BasePathMapping resources. - `com.amazonaws.services.apigateway.model.GetBasePathMappingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBasePathMappings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetBasePathMappingsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetBasePathMappingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBasePathMappingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetBasePathMappingsRequest request]
    (-> this (.getBasePathMappingsAsync request))))

(defn create-usage-plan-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - The POST request to create a usage plan with the name, description, throttle limits and quota limits, as well as the associated API stages, specified in the payload. - `com.amazonaws.services.apigateway.model.CreateUsagePlanRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateUsagePlan operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.CreateUsagePlanResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateUsagePlanRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createUsagePlanAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateUsagePlanRequest request]
    (-> this (.createUsagePlanAsync request))))

(defn get-domain-names-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Request to describe a collection of DomainName resources. - `com.amazonaws.services.apigateway.model.GetDomainNamesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDomainNames operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetDomainNamesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetDomainNamesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDomainNamesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetDomainNamesRequest request]
    (-> this (.getDomainNamesAsync request))))

(defn get-usage-plan-keys-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - The GET request to get all the usage plan keys representing the API keys added to a specified usage plan. - `com.amazonaws.services.apigateway.model.GetUsagePlanKeysRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUsagePlanKeys operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetUsagePlanKeysResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetUsagePlanKeysRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUsagePlanKeysAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetUsagePlanKeysRequest request]
    (-> this (.getUsagePlanKeysAsync request))))

(defn update-stage-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Requests API Gateway to change information about a Stage resource. - `com.amazonaws.services.apigateway.model.UpdateStageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateStage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateStageResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateStageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateStageAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateStageRequest request]
    (-> this (.updateStageAsync request))))

(defn get-resources-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Request to list information about a collection of resources. - `com.amazonaws.services.apigateway.model.GetResourcesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetResources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetResourcesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetResourcesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getResourcesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetResourcesRequest request]
    (-> this (.getResourcesAsync request))))

(defn delete-gateway-response-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Clears any customization of a GatewayResponse of a specified response type on the given RestApi and resets it with the default settings. - `com.amazonaws.services.apigateway.model.DeleteGatewayResponseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteGatewayResponse operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.DeleteGatewayResponseResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteGatewayResponseRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteGatewayResponseAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteGatewayResponseRequest request]
    (-> this (.deleteGatewayResponseAsync request))))

(defn update-gateway-response-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Updates a GatewayResponse of a specified response type on the given RestApi. - `com.amazonaws.services.apigateway.model.UpdateGatewayResponseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateGatewayResponse operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateGatewayResponseResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateGatewayResponseRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateGatewayResponseAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateGatewayResponseRequest request]
    (-> this (.updateGatewayResponseAsync request))))

(defn get-integration-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Represents a request to get the integration configuration. - `com.amazonaws.services.apigateway.model.GetIntegrationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetIntegration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetIntegrationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetIntegrationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIntegrationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetIntegrationRequest request]
    (-> this (.getIntegrationAsync request))))

(defn delete-authorizer-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Request to delete an existing Authorizer resource. - `com.amazonaws.services.apigateway.model.DeleteAuthorizerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAuthorizer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.DeleteAuthorizerResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteAuthorizerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAuthorizerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteAuthorizerRequest request]
    (-> this (.deleteAuthorizerAsync request))))

(defn test-invoke-authorizer-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Make a request to simulate the execution of an Authorizer. - `com.amazonaws.services.apigateway.model.TestInvokeAuthorizerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TestInvokeAuthorizer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.TestInvokeAuthorizerResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.TestInvokeAuthorizerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.testInvokeAuthorizerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.TestInvokeAuthorizerRequest request]
    (-> this (.testInvokeAuthorizerAsync request))))

(defn get-request-validator-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Gets a RequestValidator of a given RestApi. - `com.amazonaws.services.apigateway.model.GetRequestValidatorRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRequestValidator operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetRequestValidatorResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetRequestValidatorRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRequestValidatorAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetRequestValidatorRequest request]
    (-> this (.getRequestValidatorAsync request))))

(defn get-sdk-type-async
  "request - Get an SdkType instance. - `com.amazonaws.services.apigateway.model.GetSdkTypeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSdkType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetSdkTypeResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetSdkTypeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSdkTypeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetSdkTypeRequest request]
    (-> this (.getSdkTypeAsync request))))

(defn import-api-keys-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - The POST request to import API keys from an external source, such as a CSV-formatted file. - `com.amazonaws.services.apigateway.model.ImportApiKeysRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ImportApiKeys operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.ImportApiKeysResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.ImportApiKeysRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.importApiKeysAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.ImportApiKeysRequest request]
    (-> this (.importApiKeysAsync request))))

(defn get-stages-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Requests API Gateway to get information about one or more Stage resources. - `com.amazonaws.services.apigateway.model.GetStagesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetStages operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetStagesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetStagesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getStagesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetStagesRequest request]
    (-> this (.getStagesAsync request))))

(defn delete-method-response-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - A request to delete an existing MethodResponse resource. - `com.amazonaws.services.apigateway.model.DeleteMethodResponseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteMethodResponse operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.DeleteMethodResponseResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteMethodResponseRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteMethodResponseAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteMethodResponseRequest request]
    (-> this (.deleteMethodResponseAsync request))))

(defn put-method-response-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Request to add a MethodResponse to an existing Method resource. - `com.amazonaws.services.apigateway.model.PutMethodResponseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutMethodResponse operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.PutMethodResponseResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.PutMethodResponseRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putMethodResponseAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.PutMethodResponseRequest request]
    (-> this (.putMethodResponseAsync request))))

(defn generate-client-certificate-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - A request to generate a ClientCertificate resource. - `com.amazonaws.services.apigateway.model.GenerateClientCertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GenerateClientCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GenerateClientCertificateResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GenerateClientCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.generateClientCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GenerateClientCertificateRequest request]
    (-> this (.generateClientCertificateAsync request))))

(defn delete-client-certificate-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - A request to delete the ClientCertificate resource. - `com.amazonaws.services.apigateway.model.DeleteClientCertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteClientCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.DeleteClientCertificateResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteClientCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteClientCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteClientCertificateRequest request]
    (-> this (.deleteClientCertificateAsync request))))

(defn put-method-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Request to add a method to an existing Resource resource. - `com.amazonaws.services.apigateway.model.PutMethodRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutMethod operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.PutMethodResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.PutMethodRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putMethodAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.PutMethodRequest request]
    (-> this (.putMethodAsync request))))

(defn import-rest-api-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - A POST request to import an API to API Gateway using an input of an API definition file. - `com.amazonaws.services.apigateway.model.ImportRestApiRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ImportRestApi operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.ImportRestApiResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.ImportRestApiRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.importRestApiAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.ImportRestApiRequest request]
    (-> this (.importRestApiAsync request))))

(defn update-usage-plan-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - The PATCH request to update a usage plan of a given plan Id. - `com.amazonaws.services.apigateway.model.UpdateUsagePlanRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUsagePlan operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateUsagePlanResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateUsagePlanRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUsagePlanAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateUsagePlanRequest request]
    (-> this (.updateUsagePlanAsync request))))

(defn update-usage-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - The PATCH request to grant a temporary extension to the remaining quota of a usage plan associated with a specified API key. - `com.amazonaws.services.apigateway.model.UpdateUsageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUsage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateUsageResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateUsageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUsageAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateUsageRequest request]
    (-> this (.updateUsageAsync request))))

(defn delete-rest-api-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Request to delete the specified API from your collection. - `com.amazonaws.services.apigateway.model.DeleteRestApiRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRestApi operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.DeleteRestApiResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteRestApiRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRestApiAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteRestApiRequest request]
    (-> this (.deleteRestApiAsync request))))

(defn get-resource-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Request to list information about a resource. - `com.amazonaws.services.apigateway.model.GetResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetResourceRequest request]
    (-> this (.getResourceAsync request))))

(defn update-vpc-link-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Updates an existing VpcLink of a specified identifier. - `com.amazonaws.services.apigateway.model.UpdateVpcLinkRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateVpcLink operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateVpcLinkResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateVpcLinkRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateVpcLinkAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateVpcLinkRequest request]
    (-> this (.updateVpcLinkAsync request))))

(defn test-invoke-method-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Make a request to simulate the execution of a Method. - `com.amazonaws.services.apigateway.model.TestInvokeMethodRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TestInvokeMethod operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.TestInvokeMethodResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.TestInvokeMethodRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.testInvokeMethodAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.TestInvokeMethodRequest request]
    (-> this (.testInvokeMethodAsync request))))

(defn delete-api-key-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - A request to delete the ApiKey resource. - `com.amazonaws.services.apigateway.model.DeleteApiKeyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApiKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.DeleteApiKeyResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteApiKeyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApiKeyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteApiKeyRequest request]
    (-> this (.deleteApiKeyAsync request))))

(defn get-gateway-response-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Gets a GatewayResponse of a specified response type on the given RestApi. - `com.amazonaws.services.apigateway.model.GetGatewayResponseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetGatewayResponse operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetGatewayResponseResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetGatewayResponseRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getGatewayResponseAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetGatewayResponseRequest request]
    (-> this (.getGatewayResponseAsync request))))

(defn delete-resource-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Request to delete a Resource. - `com.amazonaws.services.apigateway.model.DeleteResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.DeleteResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteResourceRequest request]
    (-> this (.deleteResourceAsync request))))

(defn update-domain-name-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - A request to change information about the DomainName resource. - `com.amazonaws.services.apigateway.model.UpdateDomainNameRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDomainName operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateDomainNameResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateDomainNameRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDomainNameAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateDomainNameRequest request]
    (-> this (.updateDomainNameAsync request))))

(defn get-documentation-parts-async
  "request - Gets the documentation parts of an API. The result may be filtered by the type, name, or path of API entities (targets). - `com.amazonaws.services.apigateway.model.GetDocumentationPartsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDocumentationParts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetDocumentationPartsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetDocumentationPartsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDocumentationPartsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetDocumentationPartsRequest request]
    (-> this (.getDocumentationPartsAsync request))))

(defn get-deployments-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Requests API Gateway to get information about a Deployments collection. - `com.amazonaws.services.apigateway.model.GetDeploymentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDeployments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetDeploymentsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetDeploymentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDeploymentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetDeploymentsRequest request]
    (-> this (.getDeploymentsAsync request))))

(defn delete-deployment-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Requests API Gateway to delete a Deployment resource. - `com.amazonaws.services.apigateway.model.DeleteDeploymentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDeployment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.DeleteDeploymentResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteDeploymentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDeploymentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteDeploymentRequest request]
    (-> this (.deleteDeploymentAsync request))))

(defn get-documentation-version-async
  "request - Gets a documentation snapshot of an API. - `com.amazonaws.services.apigateway.model.GetDocumentationVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDocumentationVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetDocumentationVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetDocumentationVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDocumentationVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetDocumentationVersionRequest request]
    (-> this (.getDocumentationVersionAsync request))))

(defn create-base-path-mapping-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Requests API Gateway to create a new BasePathMapping resource. - `com.amazonaws.services.apigateway.model.CreateBasePathMappingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateBasePathMapping operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.CreateBasePathMappingResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateBasePathMappingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createBasePathMappingAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateBasePathMappingRequest request]
    (-> this (.createBasePathMappingAsync request))))

(defn get-usage-plan-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - The GET request to get a usage plan of a given plan identifier. - `com.amazonaws.services.apigateway.model.GetUsagePlanRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUsagePlan operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetUsagePlanResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetUsagePlanRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUsagePlanAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetUsagePlanRequest request]
    (-> this (.getUsagePlanAsync request))))

(defn get-sdk-types-async
  "request - Get the SdkTypes collection. - `com.amazonaws.services.apigateway.model.GetSdkTypesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSdkTypes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetSdkTypesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetSdkTypesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSdkTypesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetSdkTypesRequest request]
    (-> this (.getSdkTypesAsync request))))

(defn delete-documentation-version-async
  "request - Deletes an existing documentation version of an API. - `com.amazonaws.services.apigateway.model.DeleteDocumentationVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDocumentationVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.DeleteDocumentationVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteDocumentationVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDocumentationVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteDocumentationVersionRequest request]
    (-> this (.deleteDocumentationVersionAsync request))))

(defn get-stage-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Requests API Gateway to get information about a Stage resource. - `com.amazonaws.services.apigateway.model.GetStageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetStage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetStageResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetStageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getStageAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetStageRequest request]
    (-> this (.getStageAsync request))))

(defn get-vpc-links-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Gets the VpcLinks collection under the caller's account in a selected region. - `com.amazonaws.services.apigateway.model.GetVpcLinksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetVpcLinks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetVpcLinksResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetVpcLinksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getVpcLinksAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetVpcLinksRequest request]
    (-> this (.getVpcLinksAsync request))))

(defn update-integration-response-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Represents an update integration response request. - `com.amazonaws.services.apigateway.model.UpdateIntegrationResponseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateIntegrationResponse operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateIntegrationResponseResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateIntegrationResponseRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateIntegrationResponseAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateIntegrationResponseRequest request]
    (-> this (.updateIntegrationResponseAsync request))))

(defn delete-usage-plan-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - The DELETE request to delete a usage plan of a given plan Id. - `com.amazonaws.services.apigateway.model.DeleteUsagePlanRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUsagePlan operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.DeleteUsagePlanResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteUsagePlanRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUsagePlanAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteUsagePlanRequest request]
    (-> this (.deleteUsagePlanAsync request))))

(defn get-integration-response-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Represents a get integration response request. - `com.amazonaws.services.apigateway.model.GetIntegrationResponseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetIntegrationResponse operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetIntegrationResponseResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetIntegrationResponseRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIntegrationResponseAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetIntegrationResponseRequest request]
    (-> this (.getIntegrationResponseAsync request))))

(defn update-deployment-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Requests API Gateway to change information about a Deployment resource. - `com.amazonaws.services.apigateway.model.UpdateDeploymentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDeployment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateDeploymentResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateDeploymentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDeploymentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateDeploymentRequest request]
    (-> this (.updateDeploymentAsync request))))

(defn put-rest-api-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - A PUT request to update an existing API, with external API definitions specified as the request body. - `com.amazonaws.services.apigateway.model.PutRestApiRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutRestApi operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.PutRestApiResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.PutRestApiRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putRestApiAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.PutRestApiRequest request]
    (-> this (.putRestApiAsync request))))

(defn delete-integration-response-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Represents a delete integration response request. - `com.amazonaws.services.apigateway.model.DeleteIntegrationResponseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteIntegrationResponse operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.DeleteIntegrationResponseResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteIntegrationResponseRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteIntegrationResponseAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteIntegrationResponseRequest request]
    (-> this (.deleteIntegrationResponseAsync request))))

(defn update-api-key-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - A request to change information about an ApiKey resource. - `com.amazonaws.services.apigateway.model.UpdateApiKeyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateApiKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateApiKeyResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateApiKeyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateApiKeyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateApiKeyRequest request]
    (-> this (.updateApiKeyAsync request))))

(defn create-domain-name-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - A request to create a new domain name. - `com.amazonaws.services.apigateway.model.CreateDomainNameRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDomainName operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.CreateDomainNameResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateDomainNameRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDomainNameAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateDomainNameRequest request]
    (-> this (.createDomainNameAsync request))))

(defn delete-vpc-link-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Deletes an existing VpcLink of a specified identifier. - `com.amazonaws.services.apigateway.model.DeleteVpcLinkRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVpcLink operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.DeleteVpcLinkResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteVpcLinkRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVpcLinkAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteVpcLinkRequest request]
    (-> this (.deleteVpcLinkAsync request))))

(defn get-usage-plan-key-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - The GET request to get a usage plan key of a given key identifier. - `com.amazonaws.services.apigateway.model.GetUsagePlanKeyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUsagePlanKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetUsagePlanKeyResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetUsagePlanKeyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUsagePlanKeyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetUsagePlanKeyRequest request]
    (-> this (.getUsagePlanKeyAsync request))))

(defn get-method-response-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Request to describe a MethodResponse resource. - `com.amazonaws.services.apigateway.model.GetMethodResponseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMethodResponse operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetMethodResponseResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetMethodResponseRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMethodResponseAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetMethodResponseRequest request]
    (-> this (.getMethodResponseAsync request))))

(defn delete-model-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Request to delete an existing model in an existing RestApi resource. - `com.amazonaws.services.apigateway.model.DeleteModelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteModel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.DeleteModelResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteModelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteModelAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteModelRequest request]
    (-> this (.deleteModelAsync request))))

(defn delete-usage-plan-key-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - The DELETE request to delete a usage plan key and remove the underlying API key from the associated usage plan. - `com.amazonaws.services.apigateway.model.DeleteUsagePlanKeyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUsagePlanKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.DeleteUsagePlanKeyResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteUsagePlanKeyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUsagePlanKeyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteUsagePlanKeyRequest request]
    (-> this (.deleteUsagePlanKeyAsync request))))

(defn create-usage-plan-key-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - The POST request to create a usage plan key for adding an existing API key to a usage plan. - `com.amazonaws.services.apigateway.model.CreateUsagePlanKeyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateUsagePlanKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.CreateUsagePlanKeyResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateUsagePlanKeyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createUsagePlanKeyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateUsagePlanKeyRequest request]
    (-> this (.createUsagePlanKeyAsync request))))

(defn create-request-validator-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Creates a RequestValidator of a given RestApi. - `com.amazonaws.services.apigateway.model.CreateRequestValidatorRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRequestValidator operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.CreateRequestValidatorResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateRequestValidatorRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRequestValidatorAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateRequestValidatorRequest request]
    (-> this (.createRequestValidatorAsync request))))

(defn delete-documentation-part-async
  "request - Deletes an existing documentation part of an API. - `com.amazonaws.services.apigateway.model.DeleteDocumentationPartRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDocumentationPart operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.DeleteDocumentationPartResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteDocumentationPartRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDocumentationPartAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteDocumentationPartRequest request]
    (-> this (.deleteDocumentationPartAsync request))))

(defn update-client-certificate-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - A request to change information about an ClientCertificate resource. - `com.amazonaws.services.apigateway.model.UpdateClientCertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateClientCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateClientCertificateResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateClientCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateClientCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateClientCertificateRequest request]
    (-> this (.updateClientCertificateAsync request))))

(defn update-resource-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Request to change information about a Resource resource. - `com.amazonaws.services.apigateway.model.UpdateResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateResourceRequest request]
    (-> this (.updateResourceAsync request))))

(defn create-resource-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Requests API Gateway to create a Resource resource. - `com.amazonaws.services.apigateway.model.CreateResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.CreateResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateResourceRequest request]
    (-> this (.createResourceAsync request))))

(defn get-method-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Request to describe an existing Method resource. - `com.amazonaws.services.apigateway.model.GetMethodRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMethod operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetMethodResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetMethodRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMethodAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetMethodRequest request]
    (-> this (.getMethodAsync request))))

(defn create-documentation-part-async
  "request - Creates a new documentation part of a given API. - `com.amazonaws.services.apigateway.model.CreateDocumentationPartRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDocumentationPart operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.CreateDocumentationPartResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateDocumentationPartRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDocumentationPartAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateDocumentationPartRequest request]
    (-> this (.createDocumentationPartAsync request))))

(defn get-api-key-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - A request to get information about the current ApiKey resource. - `com.amazonaws.services.apigateway.model.GetApiKeyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetApiKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetApiKeyResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetApiKeyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getApiKeyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetApiKeyRequest request]
    (-> this (.getApiKeyAsync request))))

(defn delete-stage-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Requests API Gateway to delete a Stage resource. - `com.amazonaws.services.apigateway.model.DeleteStageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteStage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.DeleteStageResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteStageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteStageAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteStageRequest request]
    (-> this (.deleteStageAsync request))))

(defn get-usage-plans-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - The GET request to get all the usage plans of the caller's account. - `com.amazonaws.services.apigateway.model.GetUsagePlansRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUsagePlans operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetUsagePlansResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetUsagePlansRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUsagePlansAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetUsagePlansRequest request]
    (-> this (.getUsagePlansAsync request))))

(defn get-api-keys-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - A request to get information about the current ApiKeys resource. - `com.amazonaws.services.apigateway.model.GetApiKeysRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetApiKeys operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetApiKeysResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetApiKeysRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getApiKeysAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetApiKeysRequest request]
    (-> this (.getApiKeysAsync request))))

(defn create-model-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Request to add a new Model to an existing RestApi resource. - `com.amazonaws.services.apigateway.model.CreateModelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateModel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.CreateModelResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateModelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createModelAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateModelRequest request]
    (-> this (.createModelAsync request))))

(defn create-rest-api-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - The POST Request to add a new RestApi resource to your collection. - `com.amazonaws.services.apigateway.model.CreateRestApiRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRestApi operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.CreateRestApiResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateRestApiRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRestApiAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateRestApiRequest request]
    (-> this (.createRestApiAsync request))))

(defn get-request-validators-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Gets the RequestValidators collection of a given RestApi. - `com.amazonaws.services.apigateway.model.GetRequestValidatorsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRequestValidators operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetRequestValidatorsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetRequestValidatorsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRequestValidatorsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetRequestValidatorsRequest request]
    (-> this (.getRequestValidatorsAsync request))))

(defn get-documentation-versions-async
  "request - Gets the documentation versions of an API. - `com.amazonaws.services.apigateway.model.GetDocumentationVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDocumentationVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetDocumentationVersionsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetDocumentationVersionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDocumentationVersionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetDocumentationVersionsRequest request]
    (-> this (.getDocumentationVersionsAsync request))))

(defn create-vpc-link-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Creates a VPC link, under the caller's account in a selected region, in an asynchronous operation that typically takes 2-4 minutes to complete and become operational. The caller must have permissions to create and update VPC Endpoint services. - `com.amazonaws.services.apigateway.model.CreateVpcLinkRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateVpcLink operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.CreateVpcLinkResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateVpcLinkRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createVpcLinkAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateVpcLinkRequest request]
    (-> this (.createVpcLinkAsync request))))

(defn update-documentation-version-async
  "request - Updates an existing documentation version of an API. - `com.amazonaws.services.apigateway.model.UpdateDocumentationVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDocumentationVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateDocumentationVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateDocumentationVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDocumentationVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateDocumentationVersionRequest request]
    (-> this (.updateDocumentationVersionAsync request))))

(defn delete-method-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Request to delete an existing Method resource. - `com.amazonaws.services.apigateway.model.DeleteMethodRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteMethod operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.DeleteMethodResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteMethodRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteMethodAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteMethodRequest request]
    (-> this (.deleteMethodAsync request))))

(defn flush-stage-cache-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Requests API Gateway to flush a stage's cache. - `com.amazonaws.services.apigateway.model.FlushStageCacheRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the FlushStageCache operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.FlushStageCacheResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.FlushStageCacheRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.flushStageCacheAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.FlushStageCacheRequest request]
    (-> this (.flushStageCacheAsync request))))

(defn get-authorizers-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Request to describe an existing Authorizers resource. - `com.amazonaws.services.apigateway.model.GetAuthorizersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAuthorizers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetAuthorizersResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetAuthorizersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAuthorizersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetAuthorizersRequest request]
    (-> this (.getAuthorizersAsync request))))

(defn get-documentation-part-async
  "request - Gets a specified documentation part of a given API. - `com.amazonaws.services.apigateway.model.GetDocumentationPartRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDocumentationPart operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetDocumentationPartResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetDocumentationPartRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDocumentationPartAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetDocumentationPartRequest request]
    (-> this (.getDocumentationPartAsync request))))

(defn put-integration-response-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Represents a put integration response request. - `com.amazonaws.services.apigateway.model.PutIntegrationResponseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutIntegrationResponse operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.PutIntegrationResponseResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.PutIntegrationResponseRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putIntegrationResponseAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.PutIntegrationResponseRequest request]
    (-> this (.putIntegrationResponseAsync request))))

(defn delete-domain-name-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - A request to delete the DomainName resource. - `com.amazonaws.services.apigateway.model.DeleteDomainNameRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDomainName operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.DeleteDomainNameResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteDomainNameRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDomainNameAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteDomainNameRequest request]
    (-> this (.deleteDomainNameAsync request))))

(defn create-deployment-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Requests API Gateway to create a Deployment resource. - `com.amazonaws.services.apigateway.model.CreateDeploymentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDeployment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.CreateDeploymentResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateDeploymentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDeploymentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateDeploymentRequest request]
    (-> this (.createDeploymentAsync request))))

(defn delete-base-path-mapping-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - A request to delete the BasePathMapping resource. - `com.amazonaws.services.apigateway.model.DeleteBasePathMappingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBasePathMapping operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.DeleteBasePathMappingResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteBasePathMappingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBasePathMappingAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteBasePathMappingRequest request]
    (-> this (.deleteBasePathMappingAsync request))))

(defn get-vpc-link-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Gets a specified VPC link under the caller's account in a region. - `com.amazonaws.services.apigateway.model.GetVpcLinkRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetVpcLink operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetVpcLinkResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetVpcLinkRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getVpcLinkAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetVpcLinkRequest request]
    (-> this (.getVpcLinkAsync request))))

(defn delete-request-validator-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Deletes a specified RequestValidator of a given RestApi. - `com.amazonaws.services.apigateway.model.DeleteRequestValidatorRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRequestValidator operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.DeleteRequestValidatorResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteRequestValidatorRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRequestValidatorAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteRequestValidatorRequest request]
    (-> this (.deleteRequestValidatorAsync request))))

(defn put-gateway-response-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Creates a customization of a GatewayResponse of a specified response type and status code on the given RestApi. - `com.amazonaws.services.apigateway.model.PutGatewayResponseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutGatewayResponse operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.PutGatewayResponseResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.PutGatewayResponseRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putGatewayResponseAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.PutGatewayResponseRequest request]
    (-> this (.putGatewayResponseAsync request))))

(defn get-gateway-responses-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Gets the GatewayResponses collection on the given RestApi. If an API developer has not added any definitions for gateway responses, the result will be the API Gateway-generated default GatewayResponses collection for the supported response types. - `com.amazonaws.services.apigateway.model.GetGatewayResponsesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetGatewayResponses operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetGatewayResponsesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetGatewayResponsesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getGatewayResponsesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetGatewayResponsesRequest request]
    (-> this (.getGatewayResponsesAsync request))))

(defn update-account-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Requests API Gateway to change information about the current Account resource. - `com.amazonaws.services.apigateway.model.UpdateAccountRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateAccountResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateAccountRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAccountAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateAccountRequest request]
    (-> this (.updateAccountAsync request))))

(defn update-base-path-mapping-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - A request to change information about the BasePathMapping resource. - `com.amazonaws.services.apigateway.model.UpdateBasePathMappingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateBasePathMapping operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateBasePathMappingResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateBasePathMappingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateBasePathMappingAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateBasePathMappingRequest request]
    (-> this (.updateBasePathMappingAsync request))))

(defn get-rest-apis-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - The GET request to list existing RestApis defined for your collection. - `com.amazonaws.services.apigateway.model.GetRestApisRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRestApis operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetRestApisResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetRestApisRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRestApisAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetRestApisRequest request]
    (-> this (.getRestApisAsync request))))

(defn create-documentation-version-async
  "request - Creates a new documentation version of a given API. - `com.amazonaws.services.apigateway.model.CreateDocumentationVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDocumentationVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.CreateDocumentationVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateDocumentationVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDocumentationVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateDocumentationVersionRequest request]
    (-> this (.createDocumentationVersionAsync request))))

(defn tag-resource-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Adds or updates a tag on a given resource. - `com.amazonaws.services.apigateway.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn update-method-response-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - A request to update an existing MethodResponse resource. - `com.amazonaws.services.apigateway.model.UpdateMethodResponseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateMethodResponse operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateMethodResponseResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateMethodResponseRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateMethodResponseAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateMethodResponseRequest request]
    (-> this (.updateMethodResponseAsync request))))

(defn update-authorizer-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Request to update an existing Authorizer resource. - `com.amazonaws.services.apigateway.model.UpdateAuthorizerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAuthorizer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateAuthorizerResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateAuthorizerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAuthorizerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateAuthorizerRequest request]
    (-> this (.updateAuthorizerAsync request))))

(defn import-documentation-parts-async
  "request - Import documentation parts from an external (e.g., OpenAPI) definition file. - `com.amazonaws.services.apigateway.model.ImportDocumentationPartsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ImportDocumentationParts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.ImportDocumentationPartsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.ImportDocumentationPartsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.importDocumentationPartsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.ImportDocumentationPartsRequest request]
    (-> this (.importDocumentationPartsAsync request))))

(defn get-authorizer-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Request to describe an existing Authorizer resource. - `com.amazonaws.services.apigateway.model.GetAuthorizerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAuthorizer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetAuthorizerResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetAuthorizerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAuthorizerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetAuthorizerRequest request]
    (-> this (.getAuthorizerAsync request))))

(defn create-api-key-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Request to create an ApiKey resource. - `com.amazonaws.services.apigateway.model.CreateApiKeyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateApiKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.CreateApiKeyResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateApiKeyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createApiKeyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateApiKeyRequest request]
    (-> this (.createApiKeyAsync request))))

(defn update-model-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Request to update an existing model in an existing RestApi resource. - `com.amazonaws.services.apigateway.model.UpdateModelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateModel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateModelResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateModelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateModelAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateModelRequest request]
    (-> this (.updateModelAsync request))))

(defn get-model-template-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Request to generate a sample mapping template used to transform the payload. - `com.amazonaws.services.apigateway.model.GetModelTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetModelTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetModelTemplateResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetModelTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getModelTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetModelTemplateRequest request]
    (-> this (.getModelTemplateAsync request))))

(defn flush-stage-authorizers-cache-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Request to flush authorizer cache entries on a specified stage. - `com.amazonaws.services.apigateway.model.FlushStageAuthorizersCacheRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the FlushStageAuthorizersCache operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.FlushStageAuthorizersCacheResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.FlushStageAuthorizersCacheRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.flushStageAuthorizersCacheAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.FlushStageAuthorizersCacheRequest request]
    (-> this (.flushStageAuthorizersCacheAsync request))))

(defn get-sdk-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Request a new generated client SDK for a RestApi and Stage. - `com.amazonaws.services.apigateway.model.GetSdkRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSdk operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetSdkResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetSdkRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSdkAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetSdkRequest request]
    (-> this (.getSdkAsync request))))

(defn get-rest-api-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - The GET request to list an existing RestApi defined for your collection. - `com.amazonaws.services.apigateway.model.GetRestApiRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRestApi operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetRestApiResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetRestApiRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRestApiAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetRestApiRequest request]
    (-> this (.getRestApiAsync request))))

(defn get-models-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Request to list existing Models defined for a RestApi resource. - `com.amazonaws.services.apigateway.model.GetModelsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetModels operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetModelsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetModelsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getModelsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetModelsRequest request]
    (-> this (.getModelsAsync request))))

(defn get-tags-async
  "Description copied from interface: AmazonApiGatewayAsync

  request - Gets the Tags collection for a given resource. - `com.amazonaws.services.apigateway.model.GetTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetTagsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetTagsRequest request]
    (-> this (.getTagsAsync request))))

