(ns com.amazonaws.services.apigatewayv2.AbstractAmazonApiGatewayV2
  "Abstract implementation of AmazonApiGatewayV2. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.apigatewayv2 AbstractAmazonApiGatewayV2]))

(defn get-authorizers
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.GetAuthorizersRequest`

  returns: Result of the GetAuthorizers operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetAuthorizersResult`"
  (^com.amazonaws.services.apigatewayv2.model.GetAuthorizersResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetAuthorizersRequest request]
    (-> this (.getAuthorizers request))))

(defn create-integration
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.CreateIntegrationRequest`

  returns: Result of the CreateIntegration operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.CreateIntegrationResult`"
  (^com.amazonaws.services.apigatewayv2.model.CreateIntegrationResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.CreateIntegrationRequest request]
    (-> this (.createIntegration request))))

(defn create-api
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.CreateApiRequest`

  returns: Result of the CreateApi operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.CreateApiResult`"
  (^com.amazonaws.services.apigatewayv2.model.CreateApiResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.CreateApiRequest request]
    (-> this (.createApi request))))

(defn create-api-mapping
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.CreateApiMappingRequest`

  returns: Result of the CreateApiMapping operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.CreateApiMappingResult`"
  (^com.amazonaws.services.apigatewayv2.model.CreateApiMappingResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.CreateApiMappingRequest request]
    (-> this (.createApiMapping request))))

(defn get-integrations
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.GetIntegrationsRequest`

  returns: Result of the GetIntegrations operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetIntegrationsResult`"
  (^com.amazonaws.services.apigatewayv2.model.GetIntegrationsResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetIntegrationsRequest request]
    (-> this (.getIntegrations request))))

(defn update-deployment
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.UpdateDeploymentRequest`

  returns: Result of the UpdateDeployment operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.UpdateDeploymentResult`"
  (^com.amazonaws.services.apigatewayv2.model.UpdateDeploymentResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.UpdateDeploymentRequest request]
    (-> this (.updateDeployment request))))

(defn untag-resource
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.UntagResourceResult`"
  (^com.amazonaws.services.apigatewayv2.model.UntagResourceResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn update-authorizer
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.UpdateAuthorizerRequest`

  returns: Result of the UpdateAuthorizer operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.UpdateAuthorizerResult`"
  (^com.amazonaws.services.apigatewayv2.model.UpdateAuthorizerResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.UpdateAuthorizerRequest request]
    (-> this (.updateAuthorizer request))))

(defn delete-api-mapping
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.DeleteApiMappingRequest`

  returns: Result of the DeleteApiMapping operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.DeleteApiMappingResult`"
  (^com.amazonaws.services.apigatewayv2.model.DeleteApiMappingResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.DeleteApiMappingRequest request]
    (-> this (.deleteApiMapping request))))

(defn get-model-template
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.GetModelTemplateRequest`

  returns: Result of the GetModelTemplate operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetModelTemplateResult`"
  (^com.amazonaws.services.apigatewayv2.model.GetModelTemplateResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetModelTemplateRequest request]
    (-> this (.getModelTemplate request))))

(defn get-route-response
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.GetRouteResponseRequest`

  returns: Result of the GetRouteResponse operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetRouteResponseResult`"
  (^com.amazonaws.services.apigatewayv2.model.GetRouteResponseResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetRouteResponseRequest request]
    (-> this (.getRouteResponse request))))

(defn delete-stage
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.DeleteStageRequest`

  returns: Result of the DeleteStage operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.DeleteStageResult`"
  (^com.amazonaws.services.apigatewayv2.model.DeleteStageResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.DeleteStageRequest request]
    (-> this (.deleteStage request))))

(defn get-api-mapping
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.GetApiMappingRequest`

  returns: Result of the GetApiMapping operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetApiMappingResult`"
  (^com.amazonaws.services.apigatewayv2.model.GetApiMappingResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetApiMappingRequest request]
    (-> this (.getApiMapping request))))

(defn get-deployment
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.GetDeploymentRequest`

  returns: Result of the GetDeployment operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetDeploymentResult`"
  (^com.amazonaws.services.apigatewayv2.model.GetDeploymentResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetDeploymentRequest request]
    (-> this (.getDeployment request))))

(defn get-stages
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.GetStagesRequest`

  returns: Result of the GetStages operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetStagesResult`"
  (^com.amazonaws.services.apigatewayv2.model.GetStagesResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetStagesRequest request]
    (-> this (.getStages request))))

(defn update-api-mapping
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.UpdateApiMappingRequest`

  returns: Result of the UpdateApiMapping operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.UpdateApiMappingResult`"
  (^com.amazonaws.services.apigatewayv2.model.UpdateApiMappingResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.UpdateApiMappingRequest request]
    (-> this (.updateApiMapping request))))

(defn delete-integration
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.DeleteIntegrationRequest`

  returns: Result of the DeleteIntegration operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.DeleteIntegrationResult`"
  (^com.amazonaws.services.apigatewayv2.model.DeleteIntegrationResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.DeleteIntegrationRequest request]
    (-> this (.deleteIntegration request))))

(defn update-route-response
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.UpdateRouteResponseRequest`

  returns: Result of the UpdateRouteResponse operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.UpdateRouteResponseResult`"
  (^com.amazonaws.services.apigatewayv2.model.UpdateRouteResponseResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.UpdateRouteResponseRequest request]
    (-> this (.updateRouteResponse request))))

(defn create-route
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.CreateRouteRequest`

  returns: Result of the CreateRoute operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.CreateRouteResult`"
  (^com.amazonaws.services.apigatewayv2.model.CreateRouteResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.CreateRouteRequest request]
    (-> this (.createRoute request))))

(defn delete-route-response
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.DeleteRouteResponseRequest`

  returns: Result of the DeleteRouteResponse operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.DeleteRouteResponseResult`"
  (^com.amazonaws.services.apigatewayv2.model.DeleteRouteResponseResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.DeleteRouteResponseRequest request]
    (-> this (.deleteRouteResponse request))))

(defn create-deployment
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.CreateDeploymentRequest`

  returns: Result of the CreateDeployment operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.CreateDeploymentResult`"
  (^com.amazonaws.services.apigatewayv2.model.CreateDeploymentResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.CreateDeploymentRequest request]
    (-> this (.createDeployment request))))

(defn shutdown
  "Description copied from interface: AmazonApiGatewayV2"
  ([^AbstractAmazonApiGatewayV2 this]
    (-> this (.shutdown))))

(defn get-models
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.GetModelsRequest`

  returns: Result of the GetModels operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetModelsResult`"
  (^com.amazonaws.services.apigatewayv2.model.GetModelsResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetModelsRequest request]
    (-> this (.getModels request))))

(defn create-model
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.CreateModelRequest`

  returns: Result of the CreateModel operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.CreateModelResult`"
  (^com.amazonaws.services.apigatewayv2.model.CreateModelResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.CreateModelRequest request]
    (-> this (.createModel request))))

(defn create-domain-name
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.CreateDomainNameRequest`

  returns: Result of the CreateDomainName operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.CreateDomainNameResult`"
  (^com.amazonaws.services.apigatewayv2.model.CreateDomainNameResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.CreateDomainNameRequest request]
    (-> this (.createDomainName request))))

(defn get-integration-responses
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.GetIntegrationResponsesRequest`

  returns: Result of the GetIntegrationResponses operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetIntegrationResponsesResult`"
  (^com.amazonaws.services.apigatewayv2.model.GetIntegrationResponsesResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetIntegrationResponsesRequest request]
    (-> this (.getIntegrationResponses request))))

(defn get-authorizer
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.GetAuthorizerRequest`

  returns: Result of the GetAuthorizer operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetAuthorizerResult`"
  (^com.amazonaws.services.apigatewayv2.model.GetAuthorizerResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetAuthorizerRequest request]
    (-> this (.getAuthorizer request))))

(defn update-stage
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.UpdateStageRequest`

  returns: Result of the UpdateStage operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.UpdateStageResult`"
  (^com.amazonaws.services.apigatewayv2.model.UpdateStageResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.UpdateStageRequest request]
    (-> this (.updateStage request))))

(defn get-api-mappings
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.GetApiMappingsRequest`

  returns: Result of the GetApiMappings operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetApiMappingsResult`"
  (^com.amazonaws.services.apigatewayv2.model.GetApiMappingsResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetApiMappingsRequest request]
    (-> this (.getApiMappings request))))

(defn update-domain-name
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.UpdateDomainNameRequest`

  returns: Result of the UpdateDomainName operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.UpdateDomainNameResult`"
  (^com.amazonaws.services.apigatewayv2.model.UpdateDomainNameResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.UpdateDomainNameRequest request]
    (-> this (.updateDomainName request))))

(defn get-route-responses
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.GetRouteResponsesRequest`

  returns: Result of the GetRouteResponses operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetRouteResponsesResult`"
  (^com.amazonaws.services.apigatewayv2.model.GetRouteResponsesResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetRouteResponsesRequest request]
    (-> this (.getRouteResponses request))))

(defn get-tags
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.GetTagsRequest`

  returns: Result of the GetTags operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetTagsResult`"
  (^com.amazonaws.services.apigatewayv2.model.GetTagsResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetTagsRequest request]
    (-> this (.getTags request))))

(defn get-domain-name
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.GetDomainNameRequest`

  returns: Result of the GetDomainName operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetDomainNameResult`"
  (^com.amazonaws.services.apigatewayv2.model.GetDomainNameResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetDomainNameRequest request]
    (-> this (.getDomainName request))))

(defn delete-model
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.DeleteModelRequest`

  returns: Result of the DeleteModel operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.DeleteModelResult`"
  (^com.amazonaws.services.apigatewayv2.model.DeleteModelResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.DeleteModelRequest request]
    (-> this (.deleteModel request))))

(defn update-integration-response
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.UpdateIntegrationResponseRequest`

  returns: Result of the UpdateIntegrationResponse operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.UpdateIntegrationResponseResult`"
  (^com.amazonaws.services.apigatewayv2.model.UpdateIntegrationResponseResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.UpdateIntegrationResponseRequest request]
    (-> this (.updateIntegrationResponse request))))

(defn get-route
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.GetRouteRequest`

  returns: Result of the GetRoute operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetRouteResult`"
  (^com.amazonaws.services.apigatewayv2.model.GetRouteResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetRouteRequest request]
    (-> this (.getRoute request))))

(defn delete-api
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.DeleteApiRequest`

  returns: Result of the DeleteApi operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.DeleteApiResult`"
  (^com.amazonaws.services.apigatewayv2.model.DeleteApiResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.DeleteApiRequest request]
    (-> this (.deleteApi request))))

(defn create-integration-response
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.CreateIntegrationResponseRequest`

  returns: Result of the CreateIntegrationResponse operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.CreateIntegrationResponseResult`"
  (^com.amazonaws.services.apigatewayv2.model.CreateIntegrationResponseResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.CreateIntegrationResponseRequest request]
    (-> this (.createIntegrationResponse request))))

(defn get-domain-names
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.GetDomainNamesRequest`

  returns: Result of the GetDomainNames operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetDomainNamesResult`"
  (^com.amazonaws.services.apigatewayv2.model.GetDomainNamesResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetDomainNamesRequest request]
    (-> this (.getDomainNames request))))

(defn update-integration
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.UpdateIntegrationRequest`

  returns: Result of the UpdateIntegration operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.UpdateIntegrationResult`"
  (^com.amazonaws.services.apigatewayv2.model.UpdateIntegrationResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.UpdateIntegrationRequest request]
    (-> this (.updateIntegration request))))

(defn get-routes
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.GetRoutesRequest`

  returns: Result of the GetRoutes operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetRoutesResult`"
  (^com.amazonaws.services.apigatewayv2.model.GetRoutesResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetRoutesRequest request]
    (-> this (.getRoutes request))))

(defn update-model
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.UpdateModelRequest`

  returns: Result of the UpdateModel operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.UpdateModelResult`"
  (^com.amazonaws.services.apigatewayv2.model.UpdateModelResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.UpdateModelRequest request]
    (-> this (.updateModel request))))

(defn get-api
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.GetApiRequest`

  returns: Result of the GetApi operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetApiResult`"
  (^com.amazonaws.services.apigatewayv2.model.GetApiResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetApiRequest request]
    (-> this (.getApi request))))

(defn get-apis
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.GetApisRequest`

  returns: Result of the GetApis operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetApisResult`"
  (^com.amazonaws.services.apigatewayv2.model.GetApisResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetApisRequest request]
    (-> this (.getApis request))))

(defn create-authorizer
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.CreateAuthorizerRequest`

  returns: Result of the CreateAuthorizer operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.CreateAuthorizerResult`"
  (^com.amazonaws.services.apigatewayv2.model.CreateAuthorizerResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.CreateAuthorizerRequest request]
    (-> this (.createAuthorizer request))))

(defn delete-deployment
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.DeleteDeploymentRequest`

  returns: Result of the DeleteDeployment operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.DeleteDeploymentResult`"
  (^com.amazonaws.services.apigatewayv2.model.DeleteDeploymentResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.DeleteDeploymentRequest request]
    (-> this (.deleteDeployment request))))

(defn create-route-response
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.CreateRouteResponseRequest`

  returns: Result of the CreateRouteResponse operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.CreateRouteResponseResult`"
  (^com.amazonaws.services.apigatewayv2.model.CreateRouteResponseResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.CreateRouteResponseRequest request]
    (-> this (.createRouteResponse request))))

(defn get-model
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.GetModelRequest`

  returns: Result of the GetModel operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetModelResult`"
  (^com.amazonaws.services.apigatewayv2.model.GetModelResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetModelRequest request]
    (-> this (.getModel request))))

(defn delete-route
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.DeleteRouteRequest`

  returns: Result of the DeleteRoute operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.DeleteRouteResult`"
  (^com.amazonaws.services.apigatewayv2.model.DeleteRouteResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.DeleteRouteRequest request]
    (-> this (.deleteRoute request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonApiGatewayV2

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn update-api
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.UpdateApiRequest`

  returns: Result of the UpdateApi operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.UpdateApiResult`"
  (^com.amazonaws.services.apigatewayv2.model.UpdateApiResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.UpdateApiRequest request]
    (-> this (.updateApi request))))

(defn get-deployments
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.GetDeploymentsRequest`

  returns: Result of the GetDeployments operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetDeploymentsResult`"
  (^com.amazonaws.services.apigatewayv2.model.GetDeploymentsResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetDeploymentsRequest request]
    (-> this (.getDeployments request))))

(defn tag-resource
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.TagResourceResult`"
  (^com.amazonaws.services.apigatewayv2.model.TagResourceResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn delete-authorizer
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.DeleteAuthorizerRequest`

  returns: Result of the DeleteAuthorizer operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.DeleteAuthorizerResult`"
  (^com.amazonaws.services.apigatewayv2.model.DeleteAuthorizerResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.DeleteAuthorizerRequest request]
    (-> this (.deleteAuthorizer request))))

(defn update-route
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.UpdateRouteRequest`

  returns: Result of the UpdateRoute operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.UpdateRouteResult`"
  (^com.amazonaws.services.apigatewayv2.model.UpdateRouteResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.UpdateRouteRequest request]
    (-> this (.updateRoute request))))

(defn delete-integration-response
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.DeleteIntegrationResponseRequest`

  returns: Result of the DeleteIntegrationResponse operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.DeleteIntegrationResponseResult`"
  (^com.amazonaws.services.apigatewayv2.model.DeleteIntegrationResponseResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.DeleteIntegrationResponseRequest request]
    (-> this (.deleteIntegrationResponse request))))

(defn get-stage
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.GetStageRequest`

  returns: Result of the GetStage operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetStageResult`"
  (^com.amazonaws.services.apigatewayv2.model.GetStageResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetStageRequest request]
    (-> this (.getStage request))))

(defn get-integration
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.GetIntegrationRequest`

  returns: Result of the GetIntegration operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetIntegrationResult`"
  (^com.amazonaws.services.apigatewayv2.model.GetIntegrationResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetIntegrationRequest request]
    (-> this (.getIntegration request))))

(defn get-integration-response
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.GetIntegrationResponseRequest`

  returns: Result of the GetIntegrationResponse operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetIntegrationResponseResult`"
  (^com.amazonaws.services.apigatewayv2.model.GetIntegrationResponseResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetIntegrationResponseRequest request]
    (-> this (.getIntegrationResponse request))))

(defn delete-domain-name
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.DeleteDomainNameRequest`

  returns: Result of the DeleteDomainName operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.DeleteDomainNameResult`"
  (^com.amazonaws.services.apigatewayv2.model.DeleteDomainNameResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.DeleteDomainNameRequest request]
    (-> this (.deleteDomainName request))))

(defn create-stage
  "Description copied from interface: AmazonApiGatewayV2

  request - `com.amazonaws.services.apigatewayv2.model.CreateStageRequest`

  returns: Result of the CreateStage operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.CreateStageResult`"
  (^com.amazonaws.services.apigatewayv2.model.CreateStageResult [^AbstractAmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.CreateStageRequest request]
    (-> this (.createStage request))))

