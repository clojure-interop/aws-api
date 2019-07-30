(ns com.amazonaws.services.apigateway.AmazonApiGatewayAsync
  "Interface for accessing Amazon API Gateway asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonApiGatewayAsync instead.


  Amazon API Gateway

  Amazon API Gateway helps developers deliver robust, secure, and scalable mobile and web application back ends. API
  Gateway allows developers to securely connect mobile and web applications to APIs that run on AWS Lambda, Amazon EC2,
  or other publicly addressable web services that are hosted outside of AWS."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.apigateway AmazonApiGatewayAsync]))

(defn update-documentation-part-async
  "update-documentation-part-request - Updates an existing documentation part of a given API. - `com.amazonaws.services.apigateway.model.UpdateDocumentationPartRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDocumentationPart operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateDocumentationPartResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateDocumentationPartRequest update-documentation-part-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDocumentationPartAsync update-documentation-part-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateDocumentationPartRequest update-documentation-part-request]
    (-> this (.updateDocumentationPartAsync update-documentation-part-request))))

(defn untag-resource-async
  "Removes a tag from a given resource.

  untag-resource-request - Removes a tag from a given resource. - `com.amazonaws.services.apigateway.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn get-usage-async
  "Gets the usage data of a usage plan in a specified time interval.

  get-usage-request - The GET request to get the usage data of a usage plan in a specified time interval. - `com.amazonaws.services.apigateway.model.GetUsageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUsage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetUsageResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetUsageRequest get-usage-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUsageAsync get-usage-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetUsageRequest get-usage-request]
    (-> this (.getUsageAsync get-usage-request))))

(defn get-account-async
  "Gets information about the current Account resource.

  get-account-request - Requests API Gateway to get information about the current Account resource. - `com.amazonaws.services.apigateway.model.GetAccountRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetAccountResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetAccountRequest get-account-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAccountAsync get-account-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetAccountRequest get-account-request]
    (-> this (.getAccountAsync get-account-request))))

(defn get-client-certificate-async
  "Gets information about the current ClientCertificate resource.

  get-client-certificate-request - A request to get information about the current ClientCertificate resource. - `com.amazonaws.services.apigateway.model.GetClientCertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetClientCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetClientCertificateResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetClientCertificateRequest get-client-certificate-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getClientCertificateAsync get-client-certificate-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetClientCertificateRequest get-client-certificate-request]
    (-> this (.getClientCertificateAsync get-client-certificate-request))))

(defn get-client-certificates-async
  "Gets a collection of ClientCertificate resources.

  get-client-certificates-request - A request to get information about a collection of ClientCertificate resources. - `com.amazonaws.services.apigateway.model.GetClientCertificatesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetClientCertificates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetClientCertificatesResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetClientCertificatesRequest get-client-certificates-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getClientCertificatesAsync get-client-certificates-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetClientCertificatesRequest get-client-certificates-request]
    (-> this (.getClientCertificatesAsync get-client-certificates-request))))

(defn get-base-path-mapping-async
  "Describe a BasePathMapping resource.

  get-base-path-mapping-request - Request to describe a BasePathMapping resource. - `com.amazonaws.services.apigateway.model.GetBasePathMappingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBasePathMapping operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetBasePathMappingResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetBasePathMappingRequest get-base-path-mapping-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBasePathMappingAsync get-base-path-mapping-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetBasePathMappingRequest get-base-path-mapping-request]
    (-> this (.getBasePathMappingAsync get-base-path-mapping-request))))

(defn create-stage-async
  "Creates a new Stage resource that references a pre-existing Deployment for the API.

  create-stage-request - Requests API Gateway to create a Stage resource. - `com.amazonaws.services.apigateway.model.CreateStageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateStage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.CreateStageResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateStageRequest create-stage-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createStageAsync create-stage-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateStageRequest create-stage-request]
    (-> this (.createStageAsync create-stage-request))))

(defn delete-integration-async
  "Represents a delete integration.

  delete-integration-request - Represents a delete integration request. - `com.amazonaws.services.apigateway.model.DeleteIntegrationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteIntegration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.DeleteIntegrationResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteIntegrationRequest delete-integration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteIntegrationAsync delete-integration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteIntegrationRequest delete-integration-request]
    (-> this (.deleteIntegrationAsync delete-integration-request))))

(defn get-export-async
  "Exports a deployed version of a RestApi in a specified format.

  get-export-request - Request a new export of a RestApi for a particular Stage. - `com.amazonaws.services.apigateway.model.GetExportRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetExport operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetExportResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetExportRequest get-export-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getExportAsync get-export-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetExportRequest get-export-request]
    (-> this (.getExportAsync get-export-request))))

(defn update-request-validator-async
  "Updates a RequestValidator of a given RestApi.

  update-request-validator-request - Updates a RequestValidator of a given RestApi. - `com.amazonaws.services.apigateway.model.UpdateRequestValidatorRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRequestValidator operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateRequestValidatorResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateRequestValidatorRequest update-request-validator-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRequestValidatorAsync update-request-validator-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateRequestValidatorRequest update-request-validator-request]
    (-> this (.updateRequestValidatorAsync update-request-validator-request))))

(defn get-model-async
  "Describes an existing model defined for a RestApi resource.

  get-model-request - Request to list information about a model in an existing RestApi resource. - `com.amazonaws.services.apigateway.model.GetModelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetModel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetModelResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetModelRequest get-model-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getModelAsync get-model-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetModelRequest get-model-request]
    (-> this (.getModelAsync get-model-request))))

(defn update-integration-async
  "Represents an update integration.

  update-integration-request - Represents an update integration request. - `com.amazonaws.services.apigateway.model.UpdateIntegrationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateIntegration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateIntegrationResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateIntegrationRequest update-integration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateIntegrationAsync update-integration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateIntegrationRequest update-integration-request]
    (-> this (.updateIntegrationAsync update-integration-request))))

(defn create-authorizer-async
  "Adds a new Authorizer resource to an existing RestApi resource.

   AWS CLI

  create-authorizer-request - Request to add a new Authorizer to an existing RestApi resource. - `com.amazonaws.services.apigateway.model.CreateAuthorizerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAuthorizer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.CreateAuthorizerResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateAuthorizerRequest create-authorizer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAuthorizerAsync create-authorizer-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateAuthorizerRequest create-authorizer-request]
    (-> this (.createAuthorizerAsync create-authorizer-request))))

(defn put-integration-async
  "Sets up a method's integration.

  put-integration-request - Sets up a method's integration. - `com.amazonaws.services.apigateway.model.PutIntegrationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutIntegration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.PutIntegrationResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.PutIntegrationRequest put-integration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putIntegrationAsync put-integration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.PutIntegrationRequest put-integration-request]
    (-> this (.putIntegrationAsync put-integration-request))))

(defn update-method-async
  "Updates an existing Method resource.

  update-method-request - Request to update an existing Method resource. - `com.amazonaws.services.apigateway.model.UpdateMethodRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateMethod operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateMethodResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateMethodRequest update-method-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateMethodAsync update-method-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateMethodRequest update-method-request]
    (-> this (.updateMethodAsync update-method-request))))

(defn get-domain-name-async
  "Represents a domain name that is contained in a simpler, more intuitive URL that can be called.

  get-domain-name-request - Request to get the name of a DomainName resource. - `com.amazonaws.services.apigateway.model.GetDomainNameRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDomainName operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetDomainNameResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetDomainNameRequest get-domain-name-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDomainNameAsync get-domain-name-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetDomainNameRequest get-domain-name-request]
    (-> this (.getDomainNameAsync get-domain-name-request))))

(defn update-rest-api-async
  "Changes information about the specified API.

  update-rest-api-request - Request to update an existing RestApi resource in your collection. - `com.amazonaws.services.apigateway.model.UpdateRestApiRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRestApi operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateRestApiResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateRestApiRequest update-rest-api-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRestApiAsync update-rest-api-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateRestApiRequest update-rest-api-request]
    (-> this (.updateRestApiAsync update-rest-api-request))))

(defn get-deployment-async
  "Gets information about a Deployment resource.

  get-deployment-request - Requests API Gateway to get information about a Deployment resource. - `com.amazonaws.services.apigateway.model.GetDeploymentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDeployment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetDeploymentResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetDeploymentRequest get-deployment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDeploymentAsync get-deployment-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetDeploymentRequest get-deployment-request]
    (-> this (.getDeploymentAsync get-deployment-request))))

(defn get-base-path-mappings-async
  "Represents a collection of BasePathMapping resources.

  get-base-path-mappings-request - A request to get information about a collection of BasePathMapping resources. - `com.amazonaws.services.apigateway.model.GetBasePathMappingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBasePathMappings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetBasePathMappingsResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetBasePathMappingsRequest get-base-path-mappings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBasePathMappingsAsync get-base-path-mappings-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetBasePathMappingsRequest get-base-path-mappings-request]
    (-> this (.getBasePathMappingsAsync get-base-path-mappings-request))))

(defn create-usage-plan-async
  "Creates a usage plan with the throttle and quota limits, as well as the associated API stages, specified in the
   payload.

  create-usage-plan-request - The POST request to create a usage plan with the name, description, throttle limits and quota limits, as well as the associated API stages, specified in the payload. - `com.amazonaws.services.apigateway.model.CreateUsagePlanRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateUsagePlan operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.CreateUsagePlanResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateUsagePlanRequest create-usage-plan-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createUsagePlanAsync create-usage-plan-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateUsagePlanRequest create-usage-plan-request]
    (-> this (.createUsagePlanAsync create-usage-plan-request))))

(defn get-domain-names-async
  "Represents a collection of DomainName resources.

  get-domain-names-request - Request to describe a collection of DomainName resources. - `com.amazonaws.services.apigateway.model.GetDomainNamesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDomainNames operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetDomainNamesResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetDomainNamesRequest get-domain-names-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDomainNamesAsync get-domain-names-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetDomainNamesRequest get-domain-names-request]
    (-> this (.getDomainNamesAsync get-domain-names-request))))

(defn get-usage-plan-keys-async
  "Gets all the usage plan keys representing the API keys added to a specified usage plan.

  get-usage-plan-keys-request - The GET request to get all the usage plan keys representing the API keys added to a specified usage plan. - `com.amazonaws.services.apigateway.model.GetUsagePlanKeysRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUsagePlanKeys operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetUsagePlanKeysResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetUsagePlanKeysRequest get-usage-plan-keys-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUsagePlanKeysAsync get-usage-plan-keys-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetUsagePlanKeysRequest get-usage-plan-keys-request]
    (-> this (.getUsagePlanKeysAsync get-usage-plan-keys-request))))

(defn update-stage-async
  "Changes information about a Stage resource.

  update-stage-request - Requests API Gateway to change information about a Stage resource. - `com.amazonaws.services.apigateway.model.UpdateStageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateStage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateStageResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateStageRequest update-stage-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateStageAsync update-stage-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateStageRequest update-stage-request]
    (-> this (.updateStageAsync update-stage-request))))

(defn get-resources-async
  "Lists information about a collection of Resource resources.

  get-resources-request - Request to list information about a collection of resources. - `com.amazonaws.services.apigateway.model.GetResourcesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetResources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetResourcesResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetResourcesRequest get-resources-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getResourcesAsync get-resources-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetResourcesRequest get-resources-request]
    (-> this (.getResourcesAsync get-resources-request))))

(defn delete-gateway-response-async
  "Clears any customization of a GatewayResponse of a specified response type on the given RestApi and
   resets it with the default settings.

  delete-gateway-response-request - Clears any customization of a GatewayResponse of a specified response type on the given RestApi and resets it with the default settings. - `com.amazonaws.services.apigateway.model.DeleteGatewayResponseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteGatewayResponse operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.DeleteGatewayResponseResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteGatewayResponseRequest delete-gateway-response-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteGatewayResponseAsync delete-gateway-response-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteGatewayResponseRequest delete-gateway-response-request]
    (-> this (.deleteGatewayResponseAsync delete-gateway-response-request))))

(defn update-gateway-response-async
  "Updates a GatewayResponse of a specified response type on the given RestApi.

  update-gateway-response-request - Updates a GatewayResponse of a specified response type on the given RestApi. - `com.amazonaws.services.apigateway.model.UpdateGatewayResponseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateGatewayResponse operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateGatewayResponseResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateGatewayResponseRequest update-gateway-response-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateGatewayResponseAsync update-gateway-response-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateGatewayResponseRequest update-gateway-response-request]
    (-> this (.updateGatewayResponseAsync update-gateway-response-request))))

(defn get-integration-async
  "Get the integration settings.

  get-integration-request - Represents a request to get the integration configuration. - `com.amazonaws.services.apigateway.model.GetIntegrationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetIntegration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetIntegrationResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetIntegrationRequest get-integration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIntegrationAsync get-integration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetIntegrationRequest get-integration-request]
    (-> this (.getIntegrationAsync get-integration-request))))

(defn delete-authorizer-async
  "Deletes an existing Authorizer resource.

   AWS CLI

  delete-authorizer-request - Request to delete an existing Authorizer resource. - `com.amazonaws.services.apigateway.model.DeleteAuthorizerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAuthorizer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.DeleteAuthorizerResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteAuthorizerRequest delete-authorizer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAuthorizerAsync delete-authorizer-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteAuthorizerRequest delete-authorizer-request]
    (-> this (.deleteAuthorizerAsync delete-authorizer-request))))

(defn test-invoke-authorizer-async
  "Simulate the execution of an Authorizer in your RestApi with headers, parameters, and an incoming
   request body.

    Use
   Lambda Function as Authorizer Use
   Cognito User Pool as Authorizer

  test-invoke-authorizer-request - Make a request to simulate the execution of an Authorizer. - `com.amazonaws.services.apigateway.model.TestInvokeAuthorizerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TestInvokeAuthorizer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.TestInvokeAuthorizerResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.TestInvokeAuthorizerRequest test-invoke-authorizer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.testInvokeAuthorizerAsync test-invoke-authorizer-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.TestInvokeAuthorizerRequest test-invoke-authorizer-request]
    (-> this (.testInvokeAuthorizerAsync test-invoke-authorizer-request))))

(defn get-request-validator-async
  "Gets a RequestValidator of a given RestApi.

  get-request-validator-request - Gets a RequestValidator of a given RestApi. - `com.amazonaws.services.apigateway.model.GetRequestValidatorRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRequestValidator operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetRequestValidatorResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetRequestValidatorRequest get-request-validator-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRequestValidatorAsync get-request-validator-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetRequestValidatorRequest get-request-validator-request]
    (-> this (.getRequestValidatorAsync get-request-validator-request))))

(defn get-sdk-type-async
  "get-sdk-type-request - Get an SdkType instance. - `com.amazonaws.services.apigateway.model.GetSdkTypeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSdkType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetSdkTypeResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetSdkTypeRequest get-sdk-type-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSdkTypeAsync get-sdk-type-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetSdkTypeRequest get-sdk-type-request]
    (-> this (.getSdkTypeAsync get-sdk-type-request))))

(defn import-api-keys-async
  "Import API keys from an external source, such as a CSV-formatted file.

  import-api-keys-request - The POST request to import API keys from an external source, such as a CSV-formatted file. - `com.amazonaws.services.apigateway.model.ImportApiKeysRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ImportApiKeys operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.ImportApiKeysResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.ImportApiKeysRequest import-api-keys-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.importApiKeysAsync import-api-keys-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.ImportApiKeysRequest import-api-keys-request]
    (-> this (.importApiKeysAsync import-api-keys-request))))

(defn get-stages-async
  "Gets information about one or more Stage resources.

  get-stages-request - Requests API Gateway to get information about one or more Stage resources. - `com.amazonaws.services.apigateway.model.GetStagesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetStages operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetStagesResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetStagesRequest get-stages-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getStagesAsync get-stages-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetStagesRequest get-stages-request]
    (-> this (.getStagesAsync get-stages-request))))

(defn delete-method-response-async
  "Deletes an existing MethodResponse resource.

  delete-method-response-request - A request to delete an existing MethodResponse resource. - `com.amazonaws.services.apigateway.model.DeleteMethodResponseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteMethodResponse operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.DeleteMethodResponseResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteMethodResponseRequest delete-method-response-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteMethodResponseAsync delete-method-response-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteMethodResponseRequest delete-method-response-request]
    (-> this (.deleteMethodResponseAsync delete-method-response-request))))

(defn put-method-response-async
  "Adds a MethodResponse to an existing Method resource.

  put-method-response-request - Request to add a MethodResponse to an existing Method resource. - `com.amazonaws.services.apigateway.model.PutMethodResponseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutMethodResponse operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.PutMethodResponseResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.PutMethodResponseRequest put-method-response-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putMethodResponseAsync put-method-response-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.PutMethodResponseRequest put-method-response-request]
    (-> this (.putMethodResponseAsync put-method-response-request))))

(defn generate-client-certificate-async
  "Generates a ClientCertificate resource.

  generate-client-certificate-request - A request to generate a ClientCertificate resource. - `com.amazonaws.services.apigateway.model.GenerateClientCertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GenerateClientCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GenerateClientCertificateResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GenerateClientCertificateRequest generate-client-certificate-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.generateClientCertificateAsync generate-client-certificate-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GenerateClientCertificateRequest generate-client-certificate-request]
    (-> this (.generateClientCertificateAsync generate-client-certificate-request))))

(defn delete-client-certificate-async
  "Deletes the ClientCertificate resource.

  delete-client-certificate-request - A request to delete the ClientCertificate resource. - `com.amazonaws.services.apigateway.model.DeleteClientCertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteClientCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.DeleteClientCertificateResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteClientCertificateRequest delete-client-certificate-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteClientCertificateAsync delete-client-certificate-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteClientCertificateRequest delete-client-certificate-request]
    (-> this (.deleteClientCertificateAsync delete-client-certificate-request))))

(defn put-method-async
  "Add a method to an existing Resource resource.

  put-method-request - Request to add a method to an existing Resource resource. - `com.amazonaws.services.apigateway.model.PutMethodRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutMethod operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.PutMethodResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.PutMethodRequest put-method-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putMethodAsync put-method-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.PutMethodRequest put-method-request]
    (-> this (.putMethodAsync put-method-request))))

(defn import-rest-api-async
  "A feature of the API Gateway control service for creating a new API from an external API definition file.

  import-rest-api-request - A POST request to import an API to API Gateway using an input of an API definition file. - `com.amazonaws.services.apigateway.model.ImportRestApiRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ImportRestApi operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.ImportRestApiResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.ImportRestApiRequest import-rest-api-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.importRestApiAsync import-rest-api-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.ImportRestApiRequest import-rest-api-request]
    (-> this (.importRestApiAsync import-rest-api-request))))

(defn update-usage-plan-async
  "Updates a usage plan of a given plan Id.

  update-usage-plan-request - The PATCH request to update a usage plan of a given plan Id. - `com.amazonaws.services.apigateway.model.UpdateUsagePlanRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUsagePlan operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateUsagePlanResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateUsagePlanRequest update-usage-plan-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUsagePlanAsync update-usage-plan-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateUsagePlanRequest update-usage-plan-request]
    (-> this (.updateUsagePlanAsync update-usage-plan-request))))

(defn update-usage-async
  "Grants a temporary extension to the remaining quota of a usage plan associated with a specified API key.

  update-usage-request - The PATCH request to grant a temporary extension to the remaining quota of a usage plan associated with a specified API key. - `com.amazonaws.services.apigateway.model.UpdateUsageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUsage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateUsageResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateUsageRequest update-usage-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUsageAsync update-usage-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateUsageRequest update-usage-request]
    (-> this (.updateUsageAsync update-usage-request))))

(defn delete-rest-api-async
  "Deletes the specified API.

  delete-rest-api-request - Request to delete the specified API from your collection. - `com.amazonaws.services.apigateway.model.DeleteRestApiRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRestApi operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.DeleteRestApiResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteRestApiRequest delete-rest-api-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRestApiAsync delete-rest-api-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteRestApiRequest delete-rest-api-request]
    (-> this (.deleteRestApiAsync delete-rest-api-request))))

(defn get-resource-async
  "Lists information about a resource.

  get-resource-request - Request to list information about a resource. - `com.amazonaws.services.apigateway.model.GetResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetResourceResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetResourceRequest get-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getResourceAsync get-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetResourceRequest get-resource-request]
    (-> this (.getResourceAsync get-resource-request))))

(defn update-vpc-link-async
  "Updates an existing VpcLink of a specified identifier.

  update-vpc-link-request - Updates an existing VpcLink of a specified identifier. - `com.amazonaws.services.apigateway.model.UpdateVpcLinkRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateVpcLink operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateVpcLinkResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateVpcLinkRequest update-vpc-link-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateVpcLinkAsync update-vpc-link-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateVpcLinkRequest update-vpc-link-request]
    (-> this (.updateVpcLinkAsync update-vpc-link-request))))

(defn test-invoke-method-async
  "Simulate the execution of a Method in your RestApi with headers, parameters, and an incoming
   request body.

  test-invoke-method-request - Make a request to simulate the execution of a Method. - `com.amazonaws.services.apigateway.model.TestInvokeMethodRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TestInvokeMethod operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.TestInvokeMethodResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.TestInvokeMethodRequest test-invoke-method-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.testInvokeMethodAsync test-invoke-method-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.TestInvokeMethodRequest test-invoke-method-request]
    (-> this (.testInvokeMethodAsync test-invoke-method-request))))

(defn delete-api-key-async
  "Deletes the ApiKey resource.

  delete-api-key-request - A request to delete the ApiKey resource. - `com.amazonaws.services.apigateway.model.DeleteApiKeyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApiKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.DeleteApiKeyResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteApiKeyRequest delete-api-key-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApiKeyAsync delete-api-key-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteApiKeyRequest delete-api-key-request]
    (-> this (.deleteApiKeyAsync delete-api-key-request))))

(defn get-gateway-response-async
  "Gets a GatewayResponse of a specified response type on the given RestApi.

  get-gateway-response-request - Gets a GatewayResponse of a specified response type on the given RestApi. - `com.amazonaws.services.apigateway.model.GetGatewayResponseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetGatewayResponse operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetGatewayResponseResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetGatewayResponseRequest get-gateway-response-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getGatewayResponseAsync get-gateway-response-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetGatewayResponseRequest get-gateway-response-request]
    (-> this (.getGatewayResponseAsync get-gateway-response-request))))

(defn delete-resource-async
  "Deletes a Resource resource.

  delete-resource-request - Request to delete a Resource. - `com.amazonaws.services.apigateway.model.DeleteResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.DeleteResourceResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteResourceRequest delete-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteResourceAsync delete-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteResourceRequest delete-resource-request]
    (-> this (.deleteResourceAsync delete-resource-request))))

(defn update-domain-name-async
  "Changes information about the DomainName resource.

  update-domain-name-request - A request to change information about the DomainName resource. - `com.amazonaws.services.apigateway.model.UpdateDomainNameRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDomainName operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateDomainNameResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateDomainNameRequest update-domain-name-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDomainNameAsync update-domain-name-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateDomainNameRequest update-domain-name-request]
    (-> this (.updateDomainNameAsync update-domain-name-request))))

(defn get-documentation-parts-async
  "get-documentation-parts-request - Gets the documentation parts of an API. The result may be filtered by the type, name, or path of API entities (targets). - `com.amazonaws.services.apigateway.model.GetDocumentationPartsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDocumentationParts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetDocumentationPartsResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetDocumentationPartsRequest get-documentation-parts-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDocumentationPartsAsync get-documentation-parts-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetDocumentationPartsRequest get-documentation-parts-request]
    (-> this (.getDocumentationPartsAsync get-documentation-parts-request))))

(defn get-deployments-async
  "Gets information about a Deployments collection.

  get-deployments-request - Requests API Gateway to get information about a Deployments collection. - `com.amazonaws.services.apigateway.model.GetDeploymentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDeployments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetDeploymentsResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetDeploymentsRequest get-deployments-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDeploymentsAsync get-deployments-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetDeploymentsRequest get-deployments-request]
    (-> this (.getDeploymentsAsync get-deployments-request))))

(defn delete-deployment-async
  "Deletes a Deployment resource. Deleting a deployment will only succeed if there are no Stage
   resources associated with it.

  delete-deployment-request - Requests API Gateway to delete a Deployment resource. - `com.amazonaws.services.apigateway.model.DeleteDeploymentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDeployment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.DeleteDeploymentResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteDeploymentRequest delete-deployment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDeploymentAsync delete-deployment-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteDeploymentRequest delete-deployment-request]
    (-> this (.deleteDeploymentAsync delete-deployment-request))))

(defn get-documentation-version-async
  "get-documentation-version-request - Gets a documentation snapshot of an API. - `com.amazonaws.services.apigateway.model.GetDocumentationVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDocumentationVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetDocumentationVersionResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetDocumentationVersionRequest get-documentation-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDocumentationVersionAsync get-documentation-version-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetDocumentationVersionRequest get-documentation-version-request]
    (-> this (.getDocumentationVersionAsync get-documentation-version-request))))

(defn create-base-path-mapping-async
  "Creates a new BasePathMapping resource.

  create-base-path-mapping-request - Requests API Gateway to create a new BasePathMapping resource. - `com.amazonaws.services.apigateway.model.CreateBasePathMappingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateBasePathMapping operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.CreateBasePathMappingResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateBasePathMappingRequest create-base-path-mapping-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createBasePathMappingAsync create-base-path-mapping-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateBasePathMappingRequest create-base-path-mapping-request]
    (-> this (.createBasePathMappingAsync create-base-path-mapping-request))))

(defn get-usage-plan-async
  "Gets a usage plan of a given plan identifier.

  get-usage-plan-request - The GET request to get a usage plan of a given plan identifier. - `com.amazonaws.services.apigateway.model.GetUsagePlanRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUsagePlan operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetUsagePlanResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetUsagePlanRequest get-usage-plan-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUsagePlanAsync get-usage-plan-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetUsagePlanRequest get-usage-plan-request]
    (-> this (.getUsagePlanAsync get-usage-plan-request))))

(defn get-sdk-types-async
  "get-sdk-types-request - Get the SdkTypes collection. - `com.amazonaws.services.apigateway.model.GetSdkTypesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSdkTypes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetSdkTypesResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetSdkTypesRequest get-sdk-types-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSdkTypesAsync get-sdk-types-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetSdkTypesRequest get-sdk-types-request]
    (-> this (.getSdkTypesAsync get-sdk-types-request))))

(defn delete-documentation-version-async
  "delete-documentation-version-request - Deletes an existing documentation version of an API. - `com.amazonaws.services.apigateway.model.DeleteDocumentationVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDocumentationVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.DeleteDocumentationVersionResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteDocumentationVersionRequest delete-documentation-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDocumentationVersionAsync delete-documentation-version-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteDocumentationVersionRequest delete-documentation-version-request]
    (-> this (.deleteDocumentationVersionAsync delete-documentation-version-request))))

(defn get-stage-async
  "Gets information about a Stage resource.

  get-stage-request - Requests API Gateway to get information about a Stage resource. - `com.amazonaws.services.apigateway.model.GetStageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetStage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetStageResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetStageRequest get-stage-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getStageAsync get-stage-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetStageRequest get-stage-request]
    (-> this (.getStageAsync get-stage-request))))

(defn get-vpc-links-async
  "Gets the VpcLinks collection under the caller's account in a selected region.

  get-vpc-links-request - Gets the VpcLinks collection under the caller's account in a selected region. - `com.amazonaws.services.apigateway.model.GetVpcLinksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetVpcLinks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetVpcLinksResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetVpcLinksRequest get-vpc-links-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getVpcLinksAsync get-vpc-links-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetVpcLinksRequest get-vpc-links-request]
    (-> this (.getVpcLinksAsync get-vpc-links-request))))

(defn update-integration-response-async
  "Represents an update integration response.

  update-integration-response-request - Represents an update integration response request. - `com.amazonaws.services.apigateway.model.UpdateIntegrationResponseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateIntegrationResponse operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateIntegrationResponseResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateIntegrationResponseRequest update-integration-response-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateIntegrationResponseAsync update-integration-response-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateIntegrationResponseRequest update-integration-response-request]
    (-> this (.updateIntegrationResponseAsync update-integration-response-request))))

(defn delete-usage-plan-async
  "Deletes a usage plan of a given plan Id.

  delete-usage-plan-request - The DELETE request to delete a usage plan of a given plan Id. - `com.amazonaws.services.apigateway.model.DeleteUsagePlanRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUsagePlan operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.DeleteUsagePlanResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteUsagePlanRequest delete-usage-plan-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUsagePlanAsync delete-usage-plan-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteUsagePlanRequest delete-usage-plan-request]
    (-> this (.deleteUsagePlanAsync delete-usage-plan-request))))

(defn get-integration-response-async
  "Represents a get integration response.

  get-integration-response-request - Represents a get integration response request. - `com.amazonaws.services.apigateway.model.GetIntegrationResponseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetIntegrationResponse operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetIntegrationResponseResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetIntegrationResponseRequest get-integration-response-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIntegrationResponseAsync get-integration-response-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetIntegrationResponseRequest get-integration-response-request]
    (-> this (.getIntegrationResponseAsync get-integration-response-request))))

(defn update-deployment-async
  "Changes information about a Deployment resource.

  update-deployment-request - Requests API Gateway to change information about a Deployment resource. - `com.amazonaws.services.apigateway.model.UpdateDeploymentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDeployment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateDeploymentResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateDeploymentRequest update-deployment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDeploymentAsync update-deployment-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateDeploymentRequest update-deployment-request]
    (-> this (.updateDeploymentAsync update-deployment-request))))

(defn put-rest-api-async
  "A feature of the API Gateway control service for updating an existing API with an input of external API
   definitions. The update can take the form of merging the supplied definition into the existing API or overwriting
   the existing API.

  put-rest-api-request - A PUT request to update an existing API, with external API definitions specified as the request body. - `com.amazonaws.services.apigateway.model.PutRestApiRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutRestApi operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.PutRestApiResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.PutRestApiRequest put-rest-api-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putRestApiAsync put-rest-api-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.PutRestApiRequest put-rest-api-request]
    (-> this (.putRestApiAsync put-rest-api-request))))

(defn delete-integration-response-async
  "Represents a delete integration response.

  delete-integration-response-request - Represents a delete integration response request. - `com.amazonaws.services.apigateway.model.DeleteIntegrationResponseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteIntegrationResponse operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.DeleteIntegrationResponseResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteIntegrationResponseRequest delete-integration-response-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteIntegrationResponseAsync delete-integration-response-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteIntegrationResponseRequest delete-integration-response-request]
    (-> this (.deleteIntegrationResponseAsync delete-integration-response-request))))

(defn update-api-key-async
  "Changes information about an ApiKey resource.

  update-api-key-request - A request to change information about an ApiKey resource. - `com.amazonaws.services.apigateway.model.UpdateApiKeyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateApiKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateApiKeyResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateApiKeyRequest update-api-key-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateApiKeyAsync update-api-key-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateApiKeyRequest update-api-key-request]
    (-> this (.updateApiKeyAsync update-api-key-request))))

(defn create-domain-name-async
  "Creates a new domain name.

  create-domain-name-request - A request to create a new domain name. - `com.amazonaws.services.apigateway.model.CreateDomainNameRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDomainName operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.CreateDomainNameResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateDomainNameRequest create-domain-name-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDomainNameAsync create-domain-name-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateDomainNameRequest create-domain-name-request]
    (-> this (.createDomainNameAsync create-domain-name-request))))

(defn delete-vpc-link-async
  "Deletes an existing VpcLink of a specified identifier.

  delete-vpc-link-request - Deletes an existing VpcLink of a specified identifier. - `com.amazonaws.services.apigateway.model.DeleteVpcLinkRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVpcLink operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.DeleteVpcLinkResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteVpcLinkRequest delete-vpc-link-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVpcLinkAsync delete-vpc-link-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteVpcLinkRequest delete-vpc-link-request]
    (-> this (.deleteVpcLinkAsync delete-vpc-link-request))))

(defn get-usage-plan-key-async
  "Gets a usage plan key of a given key identifier.

  get-usage-plan-key-request - The GET request to get a usage plan key of a given key identifier. - `com.amazonaws.services.apigateway.model.GetUsagePlanKeyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUsagePlanKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetUsagePlanKeyResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetUsagePlanKeyRequest get-usage-plan-key-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUsagePlanKeyAsync get-usage-plan-key-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetUsagePlanKeyRequest get-usage-plan-key-request]
    (-> this (.getUsagePlanKeyAsync get-usage-plan-key-request))))

(defn get-method-response-async
  "Describes a MethodResponse resource.

  get-method-response-request - Request to describe a MethodResponse resource. - `com.amazonaws.services.apigateway.model.GetMethodResponseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMethodResponse operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetMethodResponseResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetMethodResponseRequest get-method-response-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMethodResponseAsync get-method-response-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetMethodResponseRequest get-method-response-request]
    (-> this (.getMethodResponseAsync get-method-response-request))))

(defn delete-model-async
  "Deletes a model.

  delete-model-request - Request to delete an existing model in an existing RestApi resource. - `com.amazonaws.services.apigateway.model.DeleteModelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteModel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.DeleteModelResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteModelRequest delete-model-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteModelAsync delete-model-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteModelRequest delete-model-request]
    (-> this (.deleteModelAsync delete-model-request))))

(defn delete-usage-plan-key-async
  "Deletes a usage plan key and remove the underlying API key from the associated usage plan.

  delete-usage-plan-key-request - The DELETE request to delete a usage plan key and remove the underlying API key from the associated usage plan. - `com.amazonaws.services.apigateway.model.DeleteUsagePlanKeyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUsagePlanKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.DeleteUsagePlanKeyResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteUsagePlanKeyRequest delete-usage-plan-key-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUsagePlanKeyAsync delete-usage-plan-key-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteUsagePlanKeyRequest delete-usage-plan-key-request]
    (-> this (.deleteUsagePlanKeyAsync delete-usage-plan-key-request))))

(defn create-usage-plan-key-async
  "Creates a usage plan key for adding an existing API key to a usage plan.

  create-usage-plan-key-request - The POST request to create a usage plan key for adding an existing API key to a usage plan. - `com.amazonaws.services.apigateway.model.CreateUsagePlanKeyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateUsagePlanKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.CreateUsagePlanKeyResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateUsagePlanKeyRequest create-usage-plan-key-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createUsagePlanKeyAsync create-usage-plan-key-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateUsagePlanKeyRequest create-usage-plan-key-request]
    (-> this (.createUsagePlanKeyAsync create-usage-plan-key-request))))

(defn create-request-validator-async
  "Creates a ReqeustValidator of a given RestApi.

  create-request-validator-request - Creates a RequestValidator of a given RestApi. - `com.amazonaws.services.apigateway.model.CreateRequestValidatorRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRequestValidator operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.CreateRequestValidatorResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateRequestValidatorRequest create-request-validator-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRequestValidatorAsync create-request-validator-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateRequestValidatorRequest create-request-validator-request]
    (-> this (.createRequestValidatorAsync create-request-validator-request))))

(defn delete-documentation-part-async
  "delete-documentation-part-request - Deletes an existing documentation part of an API. - `com.amazonaws.services.apigateway.model.DeleteDocumentationPartRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDocumentationPart operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.DeleteDocumentationPartResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteDocumentationPartRequest delete-documentation-part-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDocumentationPartAsync delete-documentation-part-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteDocumentationPartRequest delete-documentation-part-request]
    (-> this (.deleteDocumentationPartAsync delete-documentation-part-request))))

(defn update-client-certificate-async
  "Changes information about an ClientCertificate resource.

  update-client-certificate-request - A request to change information about an ClientCertificate resource. - `com.amazonaws.services.apigateway.model.UpdateClientCertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateClientCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateClientCertificateResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateClientCertificateRequest update-client-certificate-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateClientCertificateAsync update-client-certificate-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateClientCertificateRequest update-client-certificate-request]
    (-> this (.updateClientCertificateAsync update-client-certificate-request))))

(defn update-resource-async
  "Changes information about a Resource resource.

  update-resource-request - Request to change information about a Resource resource. - `com.amazonaws.services.apigateway.model.UpdateResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateResourceResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateResourceRequest update-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateResourceAsync update-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateResourceRequest update-resource-request]
    (-> this (.updateResourceAsync update-resource-request))))

(defn create-resource-async
  "Creates a Resource resource.

  create-resource-request - Requests API Gateway to create a Resource resource. - `com.amazonaws.services.apigateway.model.CreateResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.CreateResourceResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateResourceRequest create-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createResourceAsync create-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateResourceRequest create-resource-request]
    (-> this (.createResourceAsync create-resource-request))))

(defn get-method-async
  "Describe an existing Method resource.

  get-method-request - Request to describe an existing Method resource. - `com.amazonaws.services.apigateway.model.GetMethodRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMethod operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetMethodResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetMethodRequest get-method-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMethodAsync get-method-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetMethodRequest get-method-request]
    (-> this (.getMethodAsync get-method-request))))

(defn create-documentation-part-async
  "create-documentation-part-request - Creates a new documentation part of a given API. - `com.amazonaws.services.apigateway.model.CreateDocumentationPartRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDocumentationPart operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.CreateDocumentationPartResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateDocumentationPartRequest create-documentation-part-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDocumentationPartAsync create-documentation-part-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateDocumentationPartRequest create-documentation-part-request]
    (-> this (.createDocumentationPartAsync create-documentation-part-request))))

(defn get-api-key-async
  "Gets information about the current ApiKey resource.

  get-api-key-request - A request to get information about the current ApiKey resource. - `com.amazonaws.services.apigateway.model.GetApiKeyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetApiKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetApiKeyResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetApiKeyRequest get-api-key-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getApiKeyAsync get-api-key-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetApiKeyRequest get-api-key-request]
    (-> this (.getApiKeyAsync get-api-key-request))))

(defn delete-stage-async
  "Deletes a Stage resource.

  delete-stage-request - Requests API Gateway to delete a Stage resource. - `com.amazonaws.services.apigateway.model.DeleteStageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteStage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.DeleteStageResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteStageRequest delete-stage-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteStageAsync delete-stage-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteStageRequest delete-stage-request]
    (-> this (.deleteStageAsync delete-stage-request))))

(defn get-usage-plans-async
  "Gets all the usage plans of the caller's account.

  get-usage-plans-request - The GET request to get all the usage plans of the caller's account. - `com.amazonaws.services.apigateway.model.GetUsagePlansRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUsagePlans operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetUsagePlansResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetUsagePlansRequest get-usage-plans-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUsagePlansAsync get-usage-plans-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetUsagePlansRequest get-usage-plans-request]
    (-> this (.getUsagePlansAsync get-usage-plans-request))))

(defn get-api-keys-async
  "Gets information about the current ApiKeys resource.

  get-api-keys-request - A request to get information about the current ApiKeys resource. - `com.amazonaws.services.apigateway.model.GetApiKeysRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetApiKeys operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetApiKeysResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetApiKeysRequest get-api-keys-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getApiKeysAsync get-api-keys-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetApiKeysRequest get-api-keys-request]
    (-> this (.getApiKeysAsync get-api-keys-request))))

(defn create-model-async
  "Adds a new Model resource to an existing RestApi resource.

  create-model-request - Request to add a new Model to an existing RestApi resource. - `com.amazonaws.services.apigateway.model.CreateModelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateModel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.CreateModelResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateModelRequest create-model-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createModelAsync create-model-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateModelRequest create-model-request]
    (-> this (.createModelAsync create-model-request))))

(defn create-rest-api-async
  "Creates a new RestApi resource.

  create-rest-api-request - The POST Request to add a new RestApi resource to your collection. - `com.amazonaws.services.apigateway.model.CreateRestApiRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRestApi operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.CreateRestApiResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateRestApiRequest create-rest-api-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRestApiAsync create-rest-api-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateRestApiRequest create-rest-api-request]
    (-> this (.createRestApiAsync create-rest-api-request))))

(defn get-request-validators-async
  "Gets the RequestValidators collection of a given RestApi.

  get-request-validators-request - Gets the RequestValidators collection of a given RestApi. - `com.amazonaws.services.apigateway.model.GetRequestValidatorsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRequestValidators operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetRequestValidatorsResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetRequestValidatorsRequest get-request-validators-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRequestValidatorsAsync get-request-validators-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetRequestValidatorsRequest get-request-validators-request]
    (-> this (.getRequestValidatorsAsync get-request-validators-request))))

(defn get-documentation-versions-async
  "get-documentation-versions-request - Gets the documentation versions of an API. - `com.amazonaws.services.apigateway.model.GetDocumentationVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDocumentationVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetDocumentationVersionsResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetDocumentationVersionsRequest get-documentation-versions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDocumentationVersionsAsync get-documentation-versions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetDocumentationVersionsRequest get-documentation-versions-request]
    (-> this (.getDocumentationVersionsAsync get-documentation-versions-request))))

(defn create-vpc-link-async
  "Creates a VPC link, under the caller's account in a selected region, in an asynchronous operation that typically
   takes 2-4 minutes to complete and become operational. The caller must have permissions to create and update VPC
   Endpoint services.

  create-vpc-link-request - Creates a VPC link, under the caller's account in a selected region, in an asynchronous operation that typically takes 2-4 minutes to complete and become operational. The caller must have permissions to create and update VPC Endpoint services. - `com.amazonaws.services.apigateway.model.CreateVpcLinkRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateVpcLink operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.CreateVpcLinkResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateVpcLinkRequest create-vpc-link-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createVpcLinkAsync create-vpc-link-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateVpcLinkRequest create-vpc-link-request]
    (-> this (.createVpcLinkAsync create-vpc-link-request))))

(defn update-documentation-version-async
  "update-documentation-version-request - Updates an existing documentation version of an API. - `com.amazonaws.services.apigateway.model.UpdateDocumentationVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDocumentationVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateDocumentationVersionResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateDocumentationVersionRequest update-documentation-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDocumentationVersionAsync update-documentation-version-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateDocumentationVersionRequest update-documentation-version-request]
    (-> this (.updateDocumentationVersionAsync update-documentation-version-request))))

(defn delete-method-async
  "Deletes an existing Method resource.

  delete-method-request - Request to delete an existing Method resource. - `com.amazonaws.services.apigateway.model.DeleteMethodRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteMethod operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.DeleteMethodResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteMethodRequest delete-method-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteMethodAsync delete-method-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteMethodRequest delete-method-request]
    (-> this (.deleteMethodAsync delete-method-request))))

(defn flush-stage-cache-async
  "Flushes a stage's cache.

  flush-stage-cache-request - Requests API Gateway to flush a stage's cache. - `com.amazonaws.services.apigateway.model.FlushStageCacheRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the FlushStageCache operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.FlushStageCacheResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.FlushStageCacheRequest flush-stage-cache-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.flushStageCacheAsync flush-stage-cache-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.FlushStageCacheRequest flush-stage-cache-request]
    (-> this (.flushStageCacheAsync flush-stage-cache-request))))

(defn get-authorizers-async
  "Describe an existing Authorizers resource.

   AWS CLI

  get-authorizers-request - Request to describe an existing Authorizers resource. - `com.amazonaws.services.apigateway.model.GetAuthorizersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAuthorizers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetAuthorizersResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetAuthorizersRequest get-authorizers-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAuthorizersAsync get-authorizers-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetAuthorizersRequest get-authorizers-request]
    (-> this (.getAuthorizersAsync get-authorizers-request))))

(defn get-documentation-part-async
  "get-documentation-part-request - Gets a specified documentation part of a given API. - `com.amazonaws.services.apigateway.model.GetDocumentationPartRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDocumentationPart operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetDocumentationPartResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetDocumentationPartRequest get-documentation-part-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDocumentationPartAsync get-documentation-part-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetDocumentationPartRequest get-documentation-part-request]
    (-> this (.getDocumentationPartAsync get-documentation-part-request))))

(defn put-integration-response-async
  "Represents a put integration.

  put-integration-response-request - Represents a put integration response request. - `com.amazonaws.services.apigateway.model.PutIntegrationResponseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutIntegrationResponse operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.PutIntegrationResponseResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.PutIntegrationResponseRequest put-integration-response-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putIntegrationResponseAsync put-integration-response-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.PutIntegrationResponseRequest put-integration-response-request]
    (-> this (.putIntegrationResponseAsync put-integration-response-request))))

(defn delete-domain-name-async
  "Deletes the DomainName resource.

  delete-domain-name-request - A request to delete the DomainName resource. - `com.amazonaws.services.apigateway.model.DeleteDomainNameRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDomainName operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.DeleteDomainNameResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteDomainNameRequest delete-domain-name-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDomainNameAsync delete-domain-name-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteDomainNameRequest delete-domain-name-request]
    (-> this (.deleteDomainNameAsync delete-domain-name-request))))

(defn create-deployment-async
  "Creates a Deployment resource, which makes a specified RestApi callable over the internet.

  create-deployment-request - Requests API Gateway to create a Deployment resource. - `com.amazonaws.services.apigateway.model.CreateDeploymentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDeployment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.CreateDeploymentResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateDeploymentRequest create-deployment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDeploymentAsync create-deployment-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateDeploymentRequest create-deployment-request]
    (-> this (.createDeploymentAsync create-deployment-request))))

(defn delete-base-path-mapping-async
  "Deletes the BasePathMapping resource.

  delete-base-path-mapping-request - A request to delete the BasePathMapping resource. - `com.amazonaws.services.apigateway.model.DeleteBasePathMappingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBasePathMapping operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.DeleteBasePathMappingResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteBasePathMappingRequest delete-base-path-mapping-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBasePathMappingAsync delete-base-path-mapping-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteBasePathMappingRequest delete-base-path-mapping-request]
    (-> this (.deleteBasePathMappingAsync delete-base-path-mapping-request))))

(defn get-vpc-link-async
  "Gets a specified VPC link under the caller's account in a region.

  get-vpc-link-request - Gets a specified VPC link under the caller's account in a region. - `com.amazonaws.services.apigateway.model.GetVpcLinkRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetVpcLink operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetVpcLinkResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetVpcLinkRequest get-vpc-link-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getVpcLinkAsync get-vpc-link-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetVpcLinkRequest get-vpc-link-request]
    (-> this (.getVpcLinkAsync get-vpc-link-request))))

(defn delete-request-validator-async
  "Deletes a RequestValidator of a given RestApi.

  delete-request-validator-request - Deletes a specified RequestValidator of a given RestApi. - `com.amazonaws.services.apigateway.model.DeleteRequestValidatorRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRequestValidator operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.DeleteRequestValidatorResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteRequestValidatorRequest delete-request-validator-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRequestValidatorAsync delete-request-validator-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.DeleteRequestValidatorRequest delete-request-validator-request]
    (-> this (.deleteRequestValidatorAsync delete-request-validator-request))))

(defn put-gateway-response-async
  "Creates a customization of a GatewayResponse of a specified response type and status code on the given
   RestApi.

  put-gateway-response-request - Creates a customization of a GatewayResponse of a specified response type and status code on the given RestApi. - `com.amazonaws.services.apigateway.model.PutGatewayResponseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutGatewayResponse operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.PutGatewayResponseResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.PutGatewayResponseRequest put-gateway-response-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putGatewayResponseAsync put-gateway-response-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.PutGatewayResponseRequest put-gateway-response-request]
    (-> this (.putGatewayResponseAsync put-gateway-response-request))))

(defn get-gateway-responses-async
  "Gets the GatewayResponses collection on the given RestApi. If an API developer has not added any
   definitions for gateway responses, the result will be the API Gateway-generated default GatewayResponses
   collection for the supported response types.

  get-gateway-responses-request - Gets the GatewayResponses collection on the given RestApi. If an API developer has not added any definitions for gateway responses, the result will be the API Gateway-generated default GatewayResponses collection for the supported response types. - `com.amazonaws.services.apigateway.model.GetGatewayResponsesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetGatewayResponses operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetGatewayResponsesResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetGatewayResponsesRequest get-gateway-responses-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getGatewayResponsesAsync get-gateway-responses-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetGatewayResponsesRequest get-gateway-responses-request]
    (-> this (.getGatewayResponsesAsync get-gateway-responses-request))))

(defn update-account-async
  "Changes information about the current Account resource.

  update-account-request - Requests API Gateway to change information about the current Account resource. - `com.amazonaws.services.apigateway.model.UpdateAccountRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateAccountResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateAccountRequest update-account-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAccountAsync update-account-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateAccountRequest update-account-request]
    (-> this (.updateAccountAsync update-account-request))))

(defn update-base-path-mapping-async
  "Changes information about the BasePathMapping resource.

  update-base-path-mapping-request - A request to change information about the BasePathMapping resource. - `com.amazonaws.services.apigateway.model.UpdateBasePathMappingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateBasePathMapping operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateBasePathMappingResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateBasePathMappingRequest update-base-path-mapping-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateBasePathMappingAsync update-base-path-mapping-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateBasePathMappingRequest update-base-path-mapping-request]
    (-> this (.updateBasePathMappingAsync update-base-path-mapping-request))))

(defn get-rest-apis-async
  "Lists the RestApis resources for your collection.

  get-rest-apis-request - The GET request to list existing RestApis defined for your collection. - `com.amazonaws.services.apigateway.model.GetRestApisRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRestApis operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetRestApisResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetRestApisRequest get-rest-apis-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRestApisAsync get-rest-apis-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetRestApisRequest get-rest-apis-request]
    (-> this (.getRestApisAsync get-rest-apis-request))))

(defn create-documentation-version-async
  "create-documentation-version-request - Creates a new documentation version of a given API. - `com.amazonaws.services.apigateway.model.CreateDocumentationVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDocumentationVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.CreateDocumentationVersionResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateDocumentationVersionRequest create-documentation-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDocumentationVersionAsync create-documentation-version-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateDocumentationVersionRequest create-documentation-version-request]
    (-> this (.createDocumentationVersionAsync create-documentation-version-request))))

(defn tag-resource-async
  "Adds or updates a tag on a given resource.

  tag-resource-request - Adds or updates a tag on a given resource. - `com.amazonaws.services.apigateway.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn update-method-response-async
  "Updates an existing MethodResponse resource.

  update-method-response-request - A request to update an existing MethodResponse resource. - `com.amazonaws.services.apigateway.model.UpdateMethodResponseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateMethodResponse operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateMethodResponseResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateMethodResponseRequest update-method-response-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateMethodResponseAsync update-method-response-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateMethodResponseRequest update-method-response-request]
    (-> this (.updateMethodResponseAsync update-method-response-request))))

(defn update-authorizer-async
  "Updates an existing Authorizer resource.

   AWS CLI

  update-authorizer-request - Request to update an existing Authorizer resource. - `com.amazonaws.services.apigateway.model.UpdateAuthorizerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAuthorizer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateAuthorizerResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateAuthorizerRequest update-authorizer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAuthorizerAsync update-authorizer-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateAuthorizerRequest update-authorizer-request]
    (-> this (.updateAuthorizerAsync update-authorizer-request))))

(defn import-documentation-parts-async
  "import-documentation-parts-request - Import documentation parts from an external (e.g., OpenAPI) definition file. - `com.amazonaws.services.apigateway.model.ImportDocumentationPartsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ImportDocumentationParts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.ImportDocumentationPartsResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.ImportDocumentationPartsRequest import-documentation-parts-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.importDocumentationPartsAsync import-documentation-parts-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.ImportDocumentationPartsRequest import-documentation-parts-request]
    (-> this (.importDocumentationPartsAsync import-documentation-parts-request))))

(defn get-authorizer-async
  "Describe an existing Authorizer resource.

   AWS CLI

  get-authorizer-request - Request to describe an existing Authorizer resource. - `com.amazonaws.services.apigateway.model.GetAuthorizerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAuthorizer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetAuthorizerResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetAuthorizerRequest get-authorizer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAuthorizerAsync get-authorizer-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetAuthorizerRequest get-authorizer-request]
    (-> this (.getAuthorizerAsync get-authorizer-request))))

(defn create-api-key-async
  "Create an ApiKey resource.

   AWS CLI

  create-api-key-request - Request to create an ApiKey resource. - `com.amazonaws.services.apigateway.model.CreateApiKeyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateApiKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.CreateApiKeyResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateApiKeyRequest create-api-key-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createApiKeyAsync create-api-key-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.CreateApiKeyRequest create-api-key-request]
    (-> this (.createApiKeyAsync create-api-key-request))))

(defn update-model-async
  "Changes information about a model.

  update-model-request - Request to update an existing model in an existing RestApi resource. - `com.amazonaws.services.apigateway.model.UpdateModelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateModel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.UpdateModelResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateModelRequest update-model-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateModelAsync update-model-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.UpdateModelRequest update-model-request]
    (-> this (.updateModelAsync update-model-request))))

(defn get-model-template-async
  "Generates a sample mapping template that can be used to transform a payload into the structure of a model.

  get-model-template-request - Request to generate a sample mapping template used to transform the payload. - `com.amazonaws.services.apigateway.model.GetModelTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetModelTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetModelTemplateResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetModelTemplateRequest get-model-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getModelTemplateAsync get-model-template-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetModelTemplateRequest get-model-template-request]
    (-> this (.getModelTemplateAsync get-model-template-request))))

(defn flush-stage-authorizers-cache-async
  "Flushes all authorizer cache entries on a stage.

  flush-stage-authorizers-cache-request - Request to flush authorizer cache entries on a specified stage. - `com.amazonaws.services.apigateway.model.FlushStageAuthorizersCacheRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the FlushStageAuthorizersCache operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.FlushStageAuthorizersCacheResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.FlushStageAuthorizersCacheRequest flush-stage-authorizers-cache-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.flushStageAuthorizersCacheAsync flush-stage-authorizers-cache-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.FlushStageAuthorizersCacheRequest flush-stage-authorizers-cache-request]
    (-> this (.flushStageAuthorizersCacheAsync flush-stage-authorizers-cache-request))))

(defn get-sdk-async
  "Generates a client SDK for a RestApi and Stage.

  get-sdk-request - Request a new generated client SDK for a RestApi and Stage. - `com.amazonaws.services.apigateway.model.GetSdkRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSdk operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetSdkResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetSdkRequest get-sdk-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSdkAsync get-sdk-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetSdkRequest get-sdk-request]
    (-> this (.getSdkAsync get-sdk-request))))

(defn get-rest-api-async
  "Lists the RestApi resource in the collection.

  get-rest-api-request - The GET request to list an existing RestApi defined for your collection. - `com.amazonaws.services.apigateway.model.GetRestApiRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRestApi operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetRestApiResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetRestApiRequest get-rest-api-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRestApiAsync get-rest-api-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetRestApiRequest get-rest-api-request]
    (-> this (.getRestApiAsync get-rest-api-request))))

(defn get-models-async
  "Describes existing Models defined for a RestApi resource.

  get-models-request - Request to list existing Models defined for a RestApi resource. - `com.amazonaws.services.apigateway.model.GetModelsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetModels operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetModelsResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetModelsRequest get-models-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getModelsAsync get-models-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetModelsRequest get-models-request]
    (-> this (.getModelsAsync get-models-request))))

(defn get-tags-async
  "Gets the Tags collection for a given resource.

  get-tags-request - Gets the Tags collection for a given resource. - `com.amazonaws.services.apigateway.model.GetTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigateway.model.GetTagsResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetTagsRequest get-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTagsAsync get-tags-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayAsync this ^com.amazonaws.services.apigateway.model.GetTagsRequest get-tags-request]
    (-> this (.getTagsAsync get-tags-request))))

