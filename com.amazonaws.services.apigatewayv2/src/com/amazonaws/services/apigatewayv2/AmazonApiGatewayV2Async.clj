(ns com.amazonaws.services.apigatewayv2.AmazonApiGatewayV2Async
  "Interface for accessing AmazonApiGatewayV2 asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonApiGatewayV2Async instead.



  Amazon API Gateway V2"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.apigatewayv2 AmazonApiGatewayV2Async]))

(defn untag-resource-async
  "Untag an APIGW resource

  untag-resource-request - `com.amazonaws.services.apigatewayv2.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn update-route-response-async
  "Updates a RouteResponse.

  update-route-response-request - `com.amazonaws.services.apigatewayv2.model.UpdateRouteResponseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRouteResponse operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.UpdateRouteResponseResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateRouteResponseRequest update-route-response-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRouteResponseAsync update-route-response-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateRouteResponseRequest update-route-response-request]
    (-> this (.updateRouteResponseAsync update-route-response-request))))

(defn update-api-mapping-async
  "The API mapping.

  update-api-mapping-request - `com.amazonaws.services.apigatewayv2.model.UpdateApiMappingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateApiMapping operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.UpdateApiMappingResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateApiMappingRequest update-api-mapping-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateApiMappingAsync update-api-mapping-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateApiMappingRequest update-api-mapping-request]
    (-> this (.updateApiMappingAsync update-api-mapping-request))))

(defn delete-api-async
  "Deletes an Api resource.

  delete-api-request - `com.amazonaws.services.apigatewayv2.model.DeleteApiRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApi operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.DeleteApiResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteApiRequest delete-api-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApiAsync delete-api-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteApiRequest delete-api-request]
    (-> this (.deleteApiAsync delete-api-request))))

(defn create-stage-async
  "Creates a Stage for an API.

  create-stage-request - `com.amazonaws.services.apigatewayv2.model.CreateStageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateStage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.CreateStageResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateStageRequest create-stage-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createStageAsync create-stage-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateStageRequest create-stage-request]
    (-> this (.createStageAsync create-stage-request))))

(defn delete-api-mapping-async
  "Deletes an API mapping.

  delete-api-mapping-request - `com.amazonaws.services.apigatewayv2.model.DeleteApiMappingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApiMapping operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.DeleteApiMappingResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteApiMappingRequest delete-api-mapping-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApiMappingAsync delete-api-mapping-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteApiMappingRequest delete-api-mapping-request]
    (-> this (.deleteApiMappingAsync delete-api-mapping-request))))

(defn delete-integration-async
  "Deletes an Integration.

  delete-integration-request - `com.amazonaws.services.apigatewayv2.model.DeleteIntegrationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteIntegration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.DeleteIntegrationResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteIntegrationRequest delete-integration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteIntegrationAsync delete-integration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteIntegrationRequest delete-integration-request]
    (-> this (.deleteIntegrationAsync delete-integration-request))))

(defn get-model-async
  "Gets a Model.

  get-model-request - `com.amazonaws.services.apigatewayv2.model.GetModelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetModel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetModelResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetModelRequest get-model-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getModelAsync get-model-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetModelRequest get-model-request]
    (-> this (.getModelAsync get-model-request))))

(defn update-integration-async
  "Updates an Integration.

  update-integration-request - `com.amazonaws.services.apigatewayv2.model.UpdateIntegrationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateIntegration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.UpdateIntegrationResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateIntegrationRequest update-integration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateIntegrationAsync update-integration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateIntegrationRequest update-integration-request]
    (-> this (.updateIntegrationAsync update-integration-request))))

(defn create-authorizer-async
  "Creates an Authorizer for an API.

  create-authorizer-request - `com.amazonaws.services.apigatewayv2.model.CreateAuthorizerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAuthorizer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.CreateAuthorizerResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateAuthorizerRequest create-authorizer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAuthorizerAsync create-authorizer-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateAuthorizerRequest create-authorizer-request]
    (-> this (.createAuthorizerAsync create-authorizer-request))))

(defn get-domain-name-async
  "Gets a domain name.

  get-domain-name-request - `com.amazonaws.services.apigatewayv2.model.GetDomainNameRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDomainName operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetDomainNameResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetDomainNameRequest get-domain-name-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDomainNameAsync get-domain-name-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetDomainNameRequest get-domain-name-request]
    (-> this (.getDomainNameAsync get-domain-name-request))))

(defn get-routes-async
  "Gets the Routes for an API.

  get-routes-request - `com.amazonaws.services.apigatewayv2.model.GetRoutesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRoutes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetRoutesResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetRoutesRequest get-routes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRoutesAsync get-routes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetRoutesRequest get-routes-request]
    (-> this (.getRoutesAsync get-routes-request))))

(defn get-deployment-async
  "Gets a Deployment.

  get-deployment-request - `com.amazonaws.services.apigatewayv2.model.GetDeploymentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDeployment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetDeploymentResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetDeploymentRequest get-deployment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDeploymentAsync get-deployment-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetDeploymentRequest get-deployment-request]
    (-> this (.getDeploymentAsync get-deployment-request))))

(defn get-route-responses-async
  "Gets the RouteResponses for a Route.

  get-route-responses-request - `com.amazonaws.services.apigatewayv2.model.GetRouteResponsesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRouteResponses operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetRouteResponsesResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetRouteResponsesRequest get-route-responses-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRouteResponsesAsync get-route-responses-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetRouteResponsesRequest get-route-responses-request]
    (-> this (.getRouteResponsesAsync get-route-responses-request))))

(defn get-domain-names-async
  "Gets the domain names for an AWS account.

  get-domain-names-request - `com.amazonaws.services.apigatewayv2.model.GetDomainNamesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDomainNames operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetDomainNamesResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetDomainNamesRequest get-domain-names-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDomainNamesAsync get-domain-names-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetDomainNamesRequest get-domain-names-request]
    (-> this (.getDomainNamesAsync get-domain-names-request))))

(defn update-stage-async
  "Updates a Stage.

  update-stage-request - `com.amazonaws.services.apigatewayv2.model.UpdateStageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateStage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.UpdateStageResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateStageRequest update-stage-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateStageAsync update-stage-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateStageRequest update-stage-request]
    (-> this (.updateStageAsync update-stage-request))))

(defn get-api-async
  "Gets an Api resource.

  get-api-request - `com.amazonaws.services.apigatewayv2.model.GetApiRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetApi operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetApiResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetApiRequest get-api-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getApiAsync get-api-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetApiRequest get-api-request]
    (-> this (.getApiAsync get-api-request))))

(defn get-integrations-async
  "Gets the Integrations for an API.

  get-integrations-request - `com.amazonaws.services.apigatewayv2.model.GetIntegrationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetIntegrations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetIntegrationsResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetIntegrationsRequest get-integrations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIntegrationsAsync get-integrations-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetIntegrationsRequest get-integrations-request]
    (-> this (.getIntegrationsAsync get-integrations-request))))

(defn get-integration-async
  "Gets an Integration.

  get-integration-request - `com.amazonaws.services.apigatewayv2.model.GetIntegrationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetIntegration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetIntegrationResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetIntegrationRequest get-integration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIntegrationAsync get-integration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetIntegrationRequest get-integration-request]
    (-> this (.getIntegrationAsync get-integration-request))))

(defn delete-authorizer-async
  "Deletes an Authorizer.

  delete-authorizer-request - `com.amazonaws.services.apigatewayv2.model.DeleteAuthorizerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAuthorizer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.DeleteAuthorizerResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteAuthorizerRequest delete-authorizer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAuthorizerAsync delete-authorizer-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteAuthorizerRequest delete-authorizer-request]
    (-> this (.deleteAuthorizerAsync delete-authorizer-request))))

(defn get-api-mappings-async
  "The API mappings.

  get-api-mappings-request - `com.amazonaws.services.apigatewayv2.model.GetApiMappingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetApiMappings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetApiMappingsResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetApiMappingsRequest get-api-mappings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getApiMappingsAsync get-api-mappings-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetApiMappingsRequest get-api-mappings-request]
    (-> this (.getApiMappingsAsync get-api-mappings-request))))

(defn get-integration-responses-async
  "Gets the IntegrationResponses for an Integration.

  get-integration-responses-request - `com.amazonaws.services.apigatewayv2.model.GetIntegrationResponsesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetIntegrationResponses operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetIntegrationResponsesResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetIntegrationResponsesRequest get-integration-responses-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIntegrationResponsesAsync get-integration-responses-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetIntegrationResponsesRequest get-integration-responses-request]
    (-> this (.getIntegrationResponsesAsync get-integration-responses-request))))

(defn create-route-response-async
  "Creates a RouteResponse for a Route.

  create-route-response-request - `com.amazonaws.services.apigatewayv2.model.CreateRouteResponseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRouteResponse operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.CreateRouteResponseResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateRouteResponseRequest create-route-response-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRouteResponseAsync create-route-response-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateRouteResponseRequest create-route-response-request]
    (-> this (.createRouteResponseAsync create-route-response-request))))

(defn get-api-mapping-async
  "The API mapping.

  get-api-mapping-request - `com.amazonaws.services.apigatewayv2.model.GetApiMappingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetApiMapping operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetApiMappingResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetApiMappingRequest get-api-mapping-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getApiMappingAsync get-api-mapping-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetApiMappingRequest get-api-mapping-request]
    (-> this (.getApiMappingAsync get-api-mapping-request))))

(defn get-stages-async
  "Gets the Stages for an API.

  get-stages-request - `com.amazonaws.services.apigatewayv2.model.GetStagesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetStages operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetStagesResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetStagesRequest get-stages-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getStagesAsync get-stages-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetStagesRequest get-stages-request]
    (-> this (.getStagesAsync get-stages-request))))

(defn update-route-async
  "Updates a Route.

  update-route-request - `com.amazonaws.services.apigatewayv2.model.UpdateRouteRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRoute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.UpdateRouteResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateRouteRequest update-route-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRouteAsync update-route-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateRouteRequest update-route-request]
    (-> this (.updateRouteAsync update-route-request))))

(defn create-api-mapping-async
  "Creates an API mapping.

  create-api-mapping-request - `com.amazonaws.services.apigatewayv2.model.CreateApiMappingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateApiMapping operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.CreateApiMappingResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateApiMappingRequest create-api-mapping-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createApiMappingAsync create-api-mapping-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateApiMappingRequest create-api-mapping-request]
    (-> this (.createApiMappingAsync create-api-mapping-request))))

(defn update-domain-name-async
  "Updates a domain name.

  update-domain-name-request - `com.amazonaws.services.apigatewayv2.model.UpdateDomainNameRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDomainName operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.UpdateDomainNameResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateDomainNameRequest update-domain-name-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDomainNameAsync update-domain-name-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateDomainNameRequest update-domain-name-request]
    (-> this (.updateDomainNameAsync update-domain-name-request))))

(defn get-deployments-async
  "Gets the Deployments for an API.

  get-deployments-request - `com.amazonaws.services.apigatewayv2.model.GetDeploymentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDeployments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetDeploymentsResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetDeploymentsRequest get-deployments-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDeploymentsAsync get-deployments-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetDeploymentsRequest get-deployments-request]
    (-> this (.getDeploymentsAsync get-deployments-request))))

(defn delete-route-async
  "Deletes a Route.

  delete-route-request - `com.amazonaws.services.apigatewayv2.model.DeleteRouteRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRoute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.DeleteRouteResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteRouteRequest delete-route-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRouteAsync delete-route-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteRouteRequest delete-route-request]
    (-> this (.deleteRouteAsync delete-route-request))))

(defn create-api-async
  "Creates an Api resource.

  create-api-request - `com.amazonaws.services.apigatewayv2.model.CreateApiRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateApi operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.CreateApiResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateApiRequest create-api-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createApiAsync create-api-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateApiRequest create-api-request]
    (-> this (.createApiAsync create-api-request))))

(defn create-integration-response-async
  "Creates an IntegrationResponses.

  create-integration-response-request - `com.amazonaws.services.apigatewayv2.model.CreateIntegrationResponseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateIntegrationResponse operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.CreateIntegrationResponseResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateIntegrationResponseRequest create-integration-response-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createIntegrationResponseAsync create-integration-response-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateIntegrationResponseRequest create-integration-response-request]
    (-> this (.createIntegrationResponseAsync create-integration-response-request))))

(defn get-route-response-async
  "Gets a RouteResponse.

  get-route-response-request - `com.amazonaws.services.apigatewayv2.model.GetRouteResponseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRouteResponse operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetRouteResponseResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetRouteResponseRequest get-route-response-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRouteResponseAsync get-route-response-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetRouteResponseRequest get-route-response-request]
    (-> this (.getRouteResponseAsync get-route-response-request))))

(defn delete-deployment-async
  "Deletes a Deployment.

  delete-deployment-request - `com.amazonaws.services.apigatewayv2.model.DeleteDeploymentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDeployment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.DeleteDeploymentResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteDeploymentRequest delete-deployment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDeploymentAsync delete-deployment-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteDeploymentRequest delete-deployment-request]
    (-> this (.deleteDeploymentAsync delete-deployment-request))))

(defn get-stage-async
  "Gets a Stage.

  get-stage-request - `com.amazonaws.services.apigatewayv2.model.GetStageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetStage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetStageResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetStageRequest get-stage-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getStageAsync get-stage-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetStageRequest get-stage-request]
    (-> this (.getStageAsync get-stage-request))))

(defn delete-route-response-async
  "Deletes a RouteResponse.

  delete-route-response-request - `com.amazonaws.services.apigatewayv2.model.DeleteRouteResponseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRouteResponse operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.DeleteRouteResponseResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteRouteResponseRequest delete-route-response-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRouteResponseAsync delete-route-response-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteRouteResponseRequest delete-route-response-request]
    (-> this (.deleteRouteResponseAsync delete-route-response-request))))

(defn create-integration-async
  "Creates an Integration.

  create-integration-request - `com.amazonaws.services.apigatewayv2.model.CreateIntegrationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateIntegration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.CreateIntegrationResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateIntegrationRequest create-integration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createIntegrationAsync create-integration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateIntegrationRequest create-integration-request]
    (-> this (.createIntegrationAsync create-integration-request))))

(defn update-integration-response-async
  "Updates an IntegrationResponses.

  update-integration-response-request - `com.amazonaws.services.apigatewayv2.model.UpdateIntegrationResponseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateIntegrationResponse operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.UpdateIntegrationResponseResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateIntegrationResponseRequest update-integration-response-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateIntegrationResponseAsync update-integration-response-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateIntegrationResponseRequest update-integration-response-request]
    (-> this (.updateIntegrationResponseAsync update-integration-response-request))))

(defn get-integration-response-async
  "Gets an IntegrationResponses.

  get-integration-response-request - `com.amazonaws.services.apigatewayv2.model.GetIntegrationResponseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetIntegrationResponse operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetIntegrationResponseResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetIntegrationResponseRequest get-integration-response-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIntegrationResponseAsync get-integration-response-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetIntegrationResponseRequest get-integration-response-request]
    (-> this (.getIntegrationResponseAsync get-integration-response-request))))

(defn update-deployment-async
  "Updates a Deployment.

  update-deployment-request - `com.amazonaws.services.apigatewayv2.model.UpdateDeploymentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDeployment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.UpdateDeploymentResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateDeploymentRequest update-deployment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDeploymentAsync update-deployment-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateDeploymentRequest update-deployment-request]
    (-> this (.updateDeploymentAsync update-deployment-request))))

(defn delete-integration-response-async
  "Deletes an IntegrationResponses.

  delete-integration-response-request - `com.amazonaws.services.apigatewayv2.model.DeleteIntegrationResponseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteIntegrationResponse operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.DeleteIntegrationResponseResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteIntegrationResponseRequest delete-integration-response-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteIntegrationResponseAsync delete-integration-response-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteIntegrationResponseRequest delete-integration-response-request]
    (-> this (.deleteIntegrationResponseAsync delete-integration-response-request))))

(defn create-domain-name-async
  "Creates a domain name.

  create-domain-name-request - `com.amazonaws.services.apigatewayv2.model.CreateDomainNameRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDomainName operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.CreateDomainNameResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateDomainNameRequest create-domain-name-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDomainNameAsync create-domain-name-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateDomainNameRequest create-domain-name-request]
    (-> this (.createDomainNameAsync create-domain-name-request))))

(defn delete-model-async
  "Deletes a Model.

  delete-model-request - `com.amazonaws.services.apigatewayv2.model.DeleteModelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteModel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.DeleteModelResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteModelRequest delete-model-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteModelAsync delete-model-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteModelRequest delete-model-request]
    (-> this (.deleteModelAsync delete-model-request))))

(defn delete-stage-async
  "Deletes a Stage.

  delete-stage-request - `com.amazonaws.services.apigatewayv2.model.DeleteStageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteStage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.DeleteStageResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteStageRequest delete-stage-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteStageAsync delete-stage-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteStageRequest delete-stage-request]
    (-> this (.deleteStageAsync delete-stage-request))))

(defn create-model-async
  "Creates a Model for an API.

  create-model-request - `com.amazonaws.services.apigatewayv2.model.CreateModelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateModel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.CreateModelResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateModelRequest create-model-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createModelAsync create-model-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateModelRequest create-model-request]
    (-> this (.createModelAsync create-model-request))))

(defn get-route-async
  "Gets a Route.

  get-route-request - `com.amazonaws.services.apigatewayv2.model.GetRouteRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRoute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetRouteResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetRouteRequest get-route-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRouteAsync get-route-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetRouteRequest get-route-request]
    (-> this (.getRouteAsync get-route-request))))

(defn get-authorizers-async
  "Gets the Authorizers for an API.

  get-authorizers-request - `com.amazonaws.services.apigatewayv2.model.GetAuthorizersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAuthorizers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetAuthorizersResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetAuthorizersRequest get-authorizers-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAuthorizersAsync get-authorizers-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetAuthorizersRequest get-authorizers-request]
    (-> this (.getAuthorizersAsync get-authorizers-request))))

(defn delete-domain-name-async
  "Deletes a domain name.

  delete-domain-name-request - `com.amazonaws.services.apigatewayv2.model.DeleteDomainNameRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDomainName operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.DeleteDomainNameResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteDomainNameRequest delete-domain-name-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDomainNameAsync delete-domain-name-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteDomainNameRequest delete-domain-name-request]
    (-> this (.deleteDomainNameAsync delete-domain-name-request))))

(defn create-deployment-async
  "Creates a Deployment for an API.

  create-deployment-request - `com.amazonaws.services.apigatewayv2.model.CreateDeploymentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDeployment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.CreateDeploymentResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateDeploymentRequest create-deployment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDeploymentAsync create-deployment-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateDeploymentRequest create-deployment-request]
    (-> this (.createDeploymentAsync create-deployment-request))))

(defn create-route-async
  "Creates a Route for an API.

  create-route-request - `com.amazonaws.services.apigatewayv2.model.CreateRouteRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRoute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.CreateRouteResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateRouteRequest create-route-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRouteAsync create-route-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateRouteRequest create-route-request]
    (-> this (.createRouteAsync create-route-request))))

(defn tag-resource-async
  "Tag an APIGW resource

  tag-resource-request - `com.amazonaws.services.apigatewayv2.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn update-authorizer-async
  "Updates an Authorizer.

  update-authorizer-request - `com.amazonaws.services.apigatewayv2.model.UpdateAuthorizerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAuthorizer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.UpdateAuthorizerResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateAuthorizerRequest update-authorizer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAuthorizerAsync update-authorizer-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateAuthorizerRequest update-authorizer-request]
    (-> this (.updateAuthorizerAsync update-authorizer-request))))

(defn get-apis-async
  "Gets a collection of Api resources.

  get-apis-request - `com.amazonaws.services.apigatewayv2.model.GetApisRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetApis operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetApisResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetApisRequest get-apis-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getApisAsync get-apis-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetApisRequest get-apis-request]
    (-> this (.getApisAsync get-apis-request))))

(defn get-authorizer-async
  "Gets an Authorizer.

  get-authorizer-request - `com.amazonaws.services.apigatewayv2.model.GetAuthorizerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAuthorizer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetAuthorizerResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetAuthorizerRequest get-authorizer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAuthorizerAsync get-authorizer-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetAuthorizerRequest get-authorizer-request]
    (-> this (.getAuthorizerAsync get-authorizer-request))))

(defn update-model-async
  "Updates a Model.

  update-model-request - `com.amazonaws.services.apigatewayv2.model.UpdateModelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateModel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.UpdateModelResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateModelRequest update-model-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateModelAsync update-model-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateModelRequest update-model-request]
    (-> this (.updateModelAsync update-model-request))))

(defn get-model-template-async
  "Gets a model template.

  get-model-template-request - `com.amazonaws.services.apigatewayv2.model.GetModelTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetModelTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetModelTemplateResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetModelTemplateRequest get-model-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getModelTemplateAsync get-model-template-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetModelTemplateRequest get-model-template-request]
    (-> this (.getModelTemplateAsync get-model-template-request))))

(defn get-models-async
  "Gets the Models for an API.

  get-models-request - `com.amazonaws.services.apigatewayv2.model.GetModelsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetModels operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetModelsResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetModelsRequest get-models-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getModelsAsync get-models-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetModelsRequest get-models-request]
    (-> this (.getModelsAsync get-models-request))))

(defn update-api-async
  "Updates an Api resource.

  update-api-request - `com.amazonaws.services.apigatewayv2.model.UpdateApiRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateApi operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.UpdateApiResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateApiRequest update-api-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateApiAsync update-api-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateApiRequest update-api-request]
    (-> this (.updateApiAsync update-api-request))))

(defn get-tags-async
  "Gets the Tags for an API.

  get-tags-request - `com.amazonaws.services.apigatewayv2.model.GetTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetTagsResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetTagsRequest get-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTagsAsync get-tags-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetTagsRequest get-tags-request]
    (-> this (.getTagsAsync get-tags-request))))

