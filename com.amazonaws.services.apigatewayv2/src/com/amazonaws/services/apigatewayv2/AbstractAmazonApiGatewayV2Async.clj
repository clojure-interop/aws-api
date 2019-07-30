(ns com.amazonaws.services.apigatewayv2.AbstractAmazonApiGatewayV2Async
  "Abstract implementation of AmazonApiGatewayV2Async. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.apigatewayv2 AbstractAmazonApiGatewayV2Async]))

(defn untag-resource-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn update-route-response-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.UpdateRouteResponseRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRouteResponse operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.UpdateRouteResponseResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateRouteResponseRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRouteResponseAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateRouteResponseRequest request]
    (-> this (.updateRouteResponseAsync request))))

(defn update-api-mapping-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.UpdateApiMappingRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateApiMapping operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.UpdateApiMappingResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateApiMappingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateApiMappingAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateApiMappingRequest request]
    (-> this (.updateApiMappingAsync request))))

(defn delete-api-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.DeleteApiRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApi operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.DeleteApiResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteApiRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApiAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteApiRequest request]
    (-> this (.deleteApiAsync request))))

(defn create-stage-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.CreateStageRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateStage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.CreateStageResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateStageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createStageAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateStageRequest request]
    (-> this (.createStageAsync request))))

(defn delete-api-mapping-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.DeleteApiMappingRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApiMapping operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.DeleteApiMappingResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteApiMappingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApiMappingAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteApiMappingRequest request]
    (-> this (.deleteApiMappingAsync request))))

(defn delete-integration-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.DeleteIntegrationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteIntegration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.DeleteIntegrationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteIntegrationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteIntegrationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteIntegrationRequest request]
    (-> this (.deleteIntegrationAsync request))))

(defn get-model-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.GetModelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetModel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetModelResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetModelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getModelAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetModelRequest request]
    (-> this (.getModelAsync request))))

(defn update-integration-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.UpdateIntegrationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateIntegration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.UpdateIntegrationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateIntegrationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateIntegrationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateIntegrationRequest request]
    (-> this (.updateIntegrationAsync request))))

(defn create-authorizer-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.CreateAuthorizerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAuthorizer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.CreateAuthorizerResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateAuthorizerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAuthorizerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateAuthorizerRequest request]
    (-> this (.createAuthorizerAsync request))))

(defn get-domain-name-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.GetDomainNameRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDomainName operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetDomainNameResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetDomainNameRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDomainNameAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetDomainNameRequest request]
    (-> this (.getDomainNameAsync request))))

(defn get-routes-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.GetRoutesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRoutes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetRoutesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetRoutesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRoutesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetRoutesRequest request]
    (-> this (.getRoutesAsync request))))

(defn get-deployment-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.GetDeploymentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDeployment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetDeploymentResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetDeploymentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDeploymentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetDeploymentRequest request]
    (-> this (.getDeploymentAsync request))))

(defn get-route-responses-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.GetRouteResponsesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRouteResponses operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetRouteResponsesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetRouteResponsesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRouteResponsesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetRouteResponsesRequest request]
    (-> this (.getRouteResponsesAsync request))))

(defn get-domain-names-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.GetDomainNamesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDomainNames operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetDomainNamesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetDomainNamesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDomainNamesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetDomainNamesRequest request]
    (-> this (.getDomainNamesAsync request))))

(defn update-stage-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.UpdateStageRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateStage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.UpdateStageResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateStageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateStageAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateStageRequest request]
    (-> this (.updateStageAsync request))))

(defn get-api-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.GetApiRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetApi operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetApiResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetApiRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getApiAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetApiRequest request]
    (-> this (.getApiAsync request))))

(defn get-integrations-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.GetIntegrationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetIntegrations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetIntegrationsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetIntegrationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIntegrationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetIntegrationsRequest request]
    (-> this (.getIntegrationsAsync request))))

(defn get-integration-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.GetIntegrationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetIntegration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetIntegrationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetIntegrationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIntegrationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetIntegrationRequest request]
    (-> this (.getIntegrationAsync request))))

(defn delete-authorizer-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.DeleteAuthorizerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAuthorizer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.DeleteAuthorizerResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteAuthorizerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAuthorizerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteAuthorizerRequest request]
    (-> this (.deleteAuthorizerAsync request))))

(defn get-api-mappings-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.GetApiMappingsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetApiMappings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetApiMappingsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetApiMappingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getApiMappingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetApiMappingsRequest request]
    (-> this (.getApiMappingsAsync request))))

(defn get-integration-responses-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.GetIntegrationResponsesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetIntegrationResponses operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetIntegrationResponsesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetIntegrationResponsesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIntegrationResponsesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetIntegrationResponsesRequest request]
    (-> this (.getIntegrationResponsesAsync request))))

(defn create-route-response-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.CreateRouteResponseRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRouteResponse operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.CreateRouteResponseResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateRouteResponseRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRouteResponseAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateRouteResponseRequest request]
    (-> this (.createRouteResponseAsync request))))

(defn get-api-mapping-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.GetApiMappingRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetApiMapping operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetApiMappingResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetApiMappingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getApiMappingAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetApiMappingRequest request]
    (-> this (.getApiMappingAsync request))))

(defn get-stages-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.GetStagesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetStages operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetStagesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetStagesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getStagesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetStagesRequest request]
    (-> this (.getStagesAsync request))))

(defn update-route-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.UpdateRouteRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRoute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.UpdateRouteResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateRouteRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRouteAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateRouteRequest request]
    (-> this (.updateRouteAsync request))))

(defn create-api-mapping-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.CreateApiMappingRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateApiMapping operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.CreateApiMappingResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateApiMappingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createApiMappingAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateApiMappingRequest request]
    (-> this (.createApiMappingAsync request))))

(defn update-domain-name-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.UpdateDomainNameRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDomainName operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.UpdateDomainNameResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateDomainNameRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDomainNameAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateDomainNameRequest request]
    (-> this (.updateDomainNameAsync request))))

(defn get-deployments-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.GetDeploymentsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDeployments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetDeploymentsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetDeploymentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDeploymentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetDeploymentsRequest request]
    (-> this (.getDeploymentsAsync request))))

(defn delete-route-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.DeleteRouteRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRoute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.DeleteRouteResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteRouteRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRouteAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteRouteRequest request]
    (-> this (.deleteRouteAsync request))))

(defn create-api-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.CreateApiRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateApi operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.CreateApiResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateApiRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createApiAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateApiRequest request]
    (-> this (.createApiAsync request))))

(defn create-integration-response-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.CreateIntegrationResponseRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateIntegrationResponse operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.CreateIntegrationResponseResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateIntegrationResponseRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createIntegrationResponseAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateIntegrationResponseRequest request]
    (-> this (.createIntegrationResponseAsync request))))

(defn get-route-response-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.GetRouteResponseRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRouteResponse operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetRouteResponseResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetRouteResponseRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRouteResponseAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetRouteResponseRequest request]
    (-> this (.getRouteResponseAsync request))))

(defn delete-deployment-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.DeleteDeploymentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDeployment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.DeleteDeploymentResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteDeploymentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDeploymentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteDeploymentRequest request]
    (-> this (.deleteDeploymentAsync request))))

(defn get-stage-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.GetStageRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetStage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetStageResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetStageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getStageAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetStageRequest request]
    (-> this (.getStageAsync request))))

(defn delete-route-response-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.DeleteRouteResponseRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRouteResponse operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.DeleteRouteResponseResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteRouteResponseRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRouteResponseAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteRouteResponseRequest request]
    (-> this (.deleteRouteResponseAsync request))))

(defn create-integration-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.CreateIntegrationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateIntegration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.CreateIntegrationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateIntegrationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createIntegrationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateIntegrationRequest request]
    (-> this (.createIntegrationAsync request))))

(defn update-integration-response-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.UpdateIntegrationResponseRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateIntegrationResponse operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.UpdateIntegrationResponseResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateIntegrationResponseRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateIntegrationResponseAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateIntegrationResponseRequest request]
    (-> this (.updateIntegrationResponseAsync request))))

(defn get-integration-response-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.GetIntegrationResponseRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetIntegrationResponse operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetIntegrationResponseResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetIntegrationResponseRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIntegrationResponseAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetIntegrationResponseRequest request]
    (-> this (.getIntegrationResponseAsync request))))

(defn update-deployment-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.UpdateDeploymentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDeployment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.UpdateDeploymentResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateDeploymentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDeploymentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateDeploymentRequest request]
    (-> this (.updateDeploymentAsync request))))

(defn delete-integration-response-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.DeleteIntegrationResponseRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteIntegrationResponse operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.DeleteIntegrationResponseResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteIntegrationResponseRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteIntegrationResponseAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteIntegrationResponseRequest request]
    (-> this (.deleteIntegrationResponseAsync request))))

(defn create-domain-name-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.CreateDomainNameRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDomainName operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.CreateDomainNameResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateDomainNameRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDomainNameAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateDomainNameRequest request]
    (-> this (.createDomainNameAsync request))))

(defn delete-model-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.DeleteModelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteModel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.DeleteModelResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteModelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteModelAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteModelRequest request]
    (-> this (.deleteModelAsync request))))

(defn delete-stage-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.DeleteStageRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteStage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.DeleteStageResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteStageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteStageAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteStageRequest request]
    (-> this (.deleteStageAsync request))))

(defn create-model-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.CreateModelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateModel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.CreateModelResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateModelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createModelAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateModelRequest request]
    (-> this (.createModelAsync request))))

(defn get-route-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.GetRouteRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRoute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetRouteResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetRouteRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRouteAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetRouteRequest request]
    (-> this (.getRouteAsync request))))

(defn get-authorizers-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.GetAuthorizersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAuthorizers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetAuthorizersResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetAuthorizersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAuthorizersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetAuthorizersRequest request]
    (-> this (.getAuthorizersAsync request))))

(defn delete-domain-name-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.DeleteDomainNameRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDomainName operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.DeleteDomainNameResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteDomainNameRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDomainNameAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.DeleteDomainNameRequest request]
    (-> this (.deleteDomainNameAsync request))))

(defn create-deployment-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.CreateDeploymentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDeployment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.CreateDeploymentResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateDeploymentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDeploymentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateDeploymentRequest request]
    (-> this (.createDeploymentAsync request))))

(defn create-route-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.CreateRouteRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRoute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.CreateRouteResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateRouteRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRouteAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.CreateRouteRequest request]
    (-> this (.createRouteAsync request))))

(defn tag-resource-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn update-authorizer-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.UpdateAuthorizerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAuthorizer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.UpdateAuthorizerResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateAuthorizerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAuthorizerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateAuthorizerRequest request]
    (-> this (.updateAuthorizerAsync request))))

(defn get-apis-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.GetApisRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetApis operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetApisResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetApisRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getApisAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetApisRequest request]
    (-> this (.getApisAsync request))))

(defn get-authorizer-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.GetAuthorizerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAuthorizer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetAuthorizerResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetAuthorizerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAuthorizerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetAuthorizerRequest request]
    (-> this (.getAuthorizerAsync request))))

(defn update-model-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.UpdateModelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateModel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.UpdateModelResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateModelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateModelAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateModelRequest request]
    (-> this (.updateModelAsync request))))

(defn get-model-template-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.GetModelTemplateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetModelTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetModelTemplateResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetModelTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getModelTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetModelTemplateRequest request]
    (-> this (.getModelTemplateAsync request))))

(defn get-models-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.GetModelsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetModels operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetModelsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetModelsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getModelsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetModelsRequest request]
    (-> this (.getModelsAsync request))))

(defn update-api-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.UpdateApiRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateApi operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.UpdateApiResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateApiRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateApiAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.UpdateApiRequest request]
    (-> this (.updateApiAsync request))))

(defn get-tags-async
  "Description copied from interface: AmazonApiGatewayV2Async

  request - `com.amazonaws.services.apigatewayv2.model.GetTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewayv2.model.GetTagsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayV2Async this ^com.amazonaws.services.apigatewayv2.model.GetTagsRequest request]
    (-> this (.getTagsAsync request))))

