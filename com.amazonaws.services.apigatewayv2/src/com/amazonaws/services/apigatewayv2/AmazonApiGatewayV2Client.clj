(ns com.amazonaws.services.apigatewayv2.AmazonApiGatewayV2Client
  "Client for accessing AmazonApiGatewayV2. All service calls made using this client are blocking, and will not return
  until the service call completes.


  Amazon API Gateway V2"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.apigatewayv2 AmazonApiGatewayV2Client]))

(defn *builder
  "returns: `com.amazonaws.services.apigatewayv2.AmazonApiGatewayV2ClientBuilder`"
  (^com.amazonaws.services.apigatewayv2.AmazonApiGatewayV2ClientBuilder []
    (AmazonApiGatewayV2Client/builder )))

(defn get-authorizers
  "Gets the Authorizers for an API.

  request - `com.amazonaws.services.apigatewayv2.model.GetAuthorizersRequest`

  returns: Result of the GetAuthorizers operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetAuthorizersResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetAuthorizersResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.GetAuthorizersRequest request]
    (-> this (.getAuthorizers request))))

(defn create-integration
  "Creates an Integration.

  request - `com.amazonaws.services.apigatewayv2.model.CreateIntegrationRequest`

  returns: Result of the CreateIntegration operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.CreateIntegrationResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.CreateIntegrationResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.CreateIntegrationRequest request]
    (-> this (.createIntegration request))))

(defn create-api
  "Creates an Api resource.

  request - `com.amazonaws.services.apigatewayv2.model.CreateApiRequest`

  returns: Result of the CreateApi operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.CreateApiResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.CreateApiResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.CreateApiRequest request]
    (-> this (.createApi request))))

(defn create-api-mapping
  "Creates an API mapping.

  request - `com.amazonaws.services.apigatewayv2.model.CreateApiMappingRequest`

  returns: Result of the CreateApiMapping operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.CreateApiMappingResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.CreateApiMappingResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.CreateApiMappingRequest request]
    (-> this (.createApiMapping request))))

(defn get-integrations
  "Gets the Integrations for an API.

  request - `com.amazonaws.services.apigatewayv2.model.GetIntegrationsRequest`

  returns: Result of the GetIntegrations operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetIntegrationsResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetIntegrationsResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.GetIntegrationsRequest request]
    (-> this (.getIntegrations request))))

(defn update-deployment
  "Updates a Deployment.

  request - `com.amazonaws.services.apigatewayv2.model.UpdateDeploymentRequest`

  returns: Result of the UpdateDeployment operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.UpdateDeploymentResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.UpdateDeploymentResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.UpdateDeploymentRequest request]
    (-> this (.updateDeployment request))))

(defn untag-resource
  "Untag an APIGW resource

  request - `com.amazonaws.services.apigatewayv2.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.UntagResourceResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.UntagResourceResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn update-authorizer
  "Updates an Authorizer.

  request - `com.amazonaws.services.apigatewayv2.model.UpdateAuthorizerRequest`

  returns: Result of the UpdateAuthorizer operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.UpdateAuthorizerResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.UpdateAuthorizerResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.UpdateAuthorizerRequest request]
    (-> this (.updateAuthorizer request))))

(defn delete-api-mapping
  "Deletes an API mapping.

  request - `com.amazonaws.services.apigatewayv2.model.DeleteApiMappingRequest`

  returns: Result of the DeleteApiMapping operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.DeleteApiMappingResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.DeleteApiMappingResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.DeleteApiMappingRequest request]
    (-> this (.deleteApiMapping request))))

(defn get-model-template
  "Gets a model template.

  request - `com.amazonaws.services.apigatewayv2.model.GetModelTemplateRequest`

  returns: Result of the GetModelTemplate operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetModelTemplateResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetModelTemplateResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.GetModelTemplateRequest request]
    (-> this (.getModelTemplate request))))

(defn get-route-response
  "Gets a RouteResponse.

  request - `com.amazonaws.services.apigatewayv2.model.GetRouteResponseRequest`

  returns: Result of the GetRouteResponse operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetRouteResponseResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetRouteResponseResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.GetRouteResponseRequest request]
    (-> this (.getRouteResponse request))))

(defn delete-stage
  "Deletes a Stage.

  request - `com.amazonaws.services.apigatewayv2.model.DeleteStageRequest`

  returns: Result of the DeleteStage operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.DeleteStageResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.DeleteStageResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.DeleteStageRequest request]
    (-> this (.deleteStage request))))

(defn get-api-mapping
  "The API mapping.

  request - `com.amazonaws.services.apigatewayv2.model.GetApiMappingRequest`

  returns: Result of the GetApiMapping operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetApiMappingResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetApiMappingResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.GetApiMappingRequest request]
    (-> this (.getApiMapping request))))

(defn get-deployment
  "Gets a Deployment.

  request - `com.amazonaws.services.apigatewayv2.model.GetDeploymentRequest`

  returns: Result of the GetDeployment operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetDeploymentResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetDeploymentResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.GetDeploymentRequest request]
    (-> this (.getDeployment request))))

(defn get-stages
  "Gets the Stages for an API.

  request - `com.amazonaws.services.apigatewayv2.model.GetStagesRequest`

  returns: Result of the GetStages operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetStagesResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetStagesResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.GetStagesRequest request]
    (-> this (.getStages request))))

(defn update-api-mapping
  "The API mapping.

  request - `com.amazonaws.services.apigatewayv2.model.UpdateApiMappingRequest`

  returns: Result of the UpdateApiMapping operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.UpdateApiMappingResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.UpdateApiMappingResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.UpdateApiMappingRequest request]
    (-> this (.updateApiMapping request))))

(defn delete-integration
  "Deletes an Integration.

  request - `com.amazonaws.services.apigatewayv2.model.DeleteIntegrationRequest`

  returns: Result of the DeleteIntegration operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.DeleteIntegrationResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.DeleteIntegrationResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.DeleteIntegrationRequest request]
    (-> this (.deleteIntegration request))))

(defn update-route-response
  "Updates a RouteResponse.

  request - `com.amazonaws.services.apigatewayv2.model.UpdateRouteResponseRequest`

  returns: Result of the UpdateRouteResponse operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.UpdateRouteResponseResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.UpdateRouteResponseResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.UpdateRouteResponseRequest request]
    (-> this (.updateRouteResponse request))))

(defn create-route
  "Creates a Route for an API.

  request - `com.amazonaws.services.apigatewayv2.model.CreateRouteRequest`

  returns: Result of the CreateRoute operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.CreateRouteResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.CreateRouteResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.CreateRouteRequest request]
    (-> this (.createRoute request))))

(defn delete-route-response
  "Deletes a RouteResponse.

  request - `com.amazonaws.services.apigatewayv2.model.DeleteRouteResponseRequest`

  returns: Result of the DeleteRouteResponse operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.DeleteRouteResponseResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.DeleteRouteResponseResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.DeleteRouteResponseRequest request]
    (-> this (.deleteRouteResponse request))))

(defn create-deployment
  "Creates a Deployment for an API.

  request - `com.amazonaws.services.apigatewayv2.model.CreateDeploymentRequest`

  returns: Result of the CreateDeployment operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.CreateDeploymentResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.CreateDeploymentResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.CreateDeploymentRequest request]
    (-> this (.createDeployment request))))

(defn get-models
  "Gets the Models for an API.

  request - `com.amazonaws.services.apigatewayv2.model.GetModelsRequest`

  returns: Result of the GetModels operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetModelsResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetModelsResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.GetModelsRequest request]
    (-> this (.getModels request))))

(defn create-model
  "Creates a Model for an API.

  request - `com.amazonaws.services.apigatewayv2.model.CreateModelRequest`

  returns: Result of the CreateModel operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.CreateModelResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.CreateModelResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.CreateModelRequest request]
    (-> this (.createModel request))))

(defn create-domain-name
  "Creates a domain name.

  request - `com.amazonaws.services.apigatewayv2.model.CreateDomainNameRequest`

  returns: Result of the CreateDomainName operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.CreateDomainNameResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.CreateDomainNameResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.CreateDomainNameRequest request]
    (-> this (.createDomainName request))))

(defn get-integration-responses
  "Gets the IntegrationResponses for an Integration.

  request - `com.amazonaws.services.apigatewayv2.model.GetIntegrationResponsesRequest`

  returns: Result of the GetIntegrationResponses operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetIntegrationResponsesResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetIntegrationResponsesResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.GetIntegrationResponsesRequest request]
    (-> this (.getIntegrationResponses request))))

(defn get-authorizer
  "Gets an Authorizer.

  request - `com.amazonaws.services.apigatewayv2.model.GetAuthorizerRequest`

  returns: Result of the GetAuthorizer operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetAuthorizerResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetAuthorizerResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.GetAuthorizerRequest request]
    (-> this (.getAuthorizer request))))

(defn update-stage
  "Updates a Stage.

  request - `com.amazonaws.services.apigatewayv2.model.UpdateStageRequest`

  returns: Result of the UpdateStage operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.UpdateStageResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.UpdateStageResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.UpdateStageRequest request]
    (-> this (.updateStage request))))

(defn get-api-mappings
  "The API mappings.

  request - `com.amazonaws.services.apigatewayv2.model.GetApiMappingsRequest`

  returns: Result of the GetApiMappings operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetApiMappingsResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetApiMappingsResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.GetApiMappingsRequest request]
    (-> this (.getApiMappings request))))

(defn update-domain-name
  "Updates a domain name.

  request - `com.amazonaws.services.apigatewayv2.model.UpdateDomainNameRequest`

  returns: Result of the UpdateDomainName operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.UpdateDomainNameResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.UpdateDomainNameResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.UpdateDomainNameRequest request]
    (-> this (.updateDomainName request))))

(defn get-route-responses
  "Gets the RouteResponses for a Route.

  request - `com.amazonaws.services.apigatewayv2.model.GetRouteResponsesRequest`

  returns: Result of the GetRouteResponses operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetRouteResponsesResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetRouteResponsesResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.GetRouteResponsesRequest request]
    (-> this (.getRouteResponses request))))

(defn get-tags
  "Gets the Tags for an API.

  request - `com.amazonaws.services.apigatewayv2.model.GetTagsRequest`

  returns: Result of the GetTags operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetTagsResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetTagsResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.GetTagsRequest request]
    (-> this (.getTags request))))

(defn get-domain-name
  "Gets a domain name.

  request - `com.amazonaws.services.apigatewayv2.model.GetDomainNameRequest`

  returns: Result of the GetDomainName operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetDomainNameResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetDomainNameResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.GetDomainNameRequest request]
    (-> this (.getDomainName request))))

(defn delete-model
  "Deletes a Model.

  request - `com.amazonaws.services.apigatewayv2.model.DeleteModelRequest`

  returns: Result of the DeleteModel operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.DeleteModelResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.DeleteModelResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.DeleteModelRequest request]
    (-> this (.deleteModel request))))

(defn update-integration-response
  "Updates an IntegrationResponses.

  request - `com.amazonaws.services.apigatewayv2.model.UpdateIntegrationResponseRequest`

  returns: Result of the UpdateIntegrationResponse operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.UpdateIntegrationResponseResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.UpdateIntegrationResponseResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.UpdateIntegrationResponseRequest request]
    (-> this (.updateIntegrationResponse request))))

(defn get-route
  "Gets a Route.

  request - `com.amazonaws.services.apigatewayv2.model.GetRouteRequest`

  returns: Result of the GetRoute operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetRouteResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetRouteResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.GetRouteRequest request]
    (-> this (.getRoute request))))

(defn delete-api
  "Deletes an Api resource.

  request - `com.amazonaws.services.apigatewayv2.model.DeleteApiRequest`

  returns: Result of the DeleteApi operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.DeleteApiResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.DeleteApiResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.DeleteApiRequest request]
    (-> this (.deleteApi request))))

(defn create-integration-response
  "Creates an IntegrationResponses.

  request - `com.amazonaws.services.apigatewayv2.model.CreateIntegrationResponseRequest`

  returns: Result of the CreateIntegrationResponse operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.CreateIntegrationResponseResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.CreateIntegrationResponseResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.CreateIntegrationResponseRequest request]
    (-> this (.createIntegrationResponse request))))

(defn get-domain-names
  "Gets the domain names for an AWS account.

  request - `com.amazonaws.services.apigatewayv2.model.GetDomainNamesRequest`

  returns: Result of the GetDomainNames operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetDomainNamesResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetDomainNamesResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.GetDomainNamesRequest request]
    (-> this (.getDomainNames request))))

(defn update-integration
  "Updates an Integration.

  request - `com.amazonaws.services.apigatewayv2.model.UpdateIntegrationRequest`

  returns: Result of the UpdateIntegration operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.UpdateIntegrationResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.UpdateIntegrationResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.UpdateIntegrationRequest request]
    (-> this (.updateIntegration request))))

(defn get-routes
  "Gets the Routes for an API.

  request - `com.amazonaws.services.apigatewayv2.model.GetRoutesRequest`

  returns: Result of the GetRoutes operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetRoutesResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetRoutesResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.GetRoutesRequest request]
    (-> this (.getRoutes request))))

(defn update-model
  "Updates a Model.

  request - `com.amazonaws.services.apigatewayv2.model.UpdateModelRequest`

  returns: Result of the UpdateModel operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.UpdateModelResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.UpdateModelResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.UpdateModelRequest request]
    (-> this (.updateModel request))))

(defn get-api
  "Gets an Api resource.

  request - `com.amazonaws.services.apigatewayv2.model.GetApiRequest`

  returns: Result of the GetApi operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetApiResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetApiResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.GetApiRequest request]
    (-> this (.getApi request))))

(defn get-apis
  "Gets a collection of Api resources.

  request - `com.amazonaws.services.apigatewayv2.model.GetApisRequest`

  returns: Result of the GetApis operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetApisResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetApisResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.GetApisRequest request]
    (-> this (.getApis request))))

(defn create-authorizer
  "Creates an Authorizer for an API.

  request - `com.amazonaws.services.apigatewayv2.model.CreateAuthorizerRequest`

  returns: Result of the CreateAuthorizer operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.CreateAuthorizerResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.CreateAuthorizerResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.CreateAuthorizerRequest request]
    (-> this (.createAuthorizer request))))

(defn delete-deployment
  "Deletes a Deployment.

  request - `com.amazonaws.services.apigatewayv2.model.DeleteDeploymentRequest`

  returns: Result of the DeleteDeployment operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.DeleteDeploymentResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.DeleteDeploymentResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.DeleteDeploymentRequest request]
    (-> this (.deleteDeployment request))))

(defn create-route-response
  "Creates a RouteResponse for a Route.

  request - `com.amazonaws.services.apigatewayv2.model.CreateRouteResponseRequest`

  returns: Result of the CreateRouteResponse operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.CreateRouteResponseResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.CreateRouteResponseResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.CreateRouteResponseRequest request]
    (-> this (.createRouteResponse request))))

(defn get-model
  "Gets a Model.

  request - `com.amazonaws.services.apigatewayv2.model.GetModelRequest`

  returns: Result of the GetModel operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetModelResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetModelResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.GetModelRequest request]
    (-> this (.getModel request))))

(defn delete-route
  "Deletes a Route.

  request - `com.amazonaws.services.apigatewayv2.model.DeleteRouteRequest`

  returns: Result of the DeleteRoute operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.DeleteRouteResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.DeleteRouteResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.DeleteRouteRequest request]
    (-> this (.deleteRoute request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonApiGatewayV2Client this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn update-api
  "Updates an Api resource.

  request - `com.amazonaws.services.apigatewayv2.model.UpdateApiRequest`

  returns: Result of the UpdateApi operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.UpdateApiResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.UpdateApiResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.UpdateApiRequest request]
    (-> this (.updateApi request))))

(defn get-deployments
  "Gets the Deployments for an API.

  request - `com.amazonaws.services.apigatewayv2.model.GetDeploymentsRequest`

  returns: Result of the GetDeployments operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetDeploymentsResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetDeploymentsResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.GetDeploymentsRequest request]
    (-> this (.getDeployments request))))

(defn tag-resource
  "Tag an APIGW resource

  request - `com.amazonaws.services.apigatewayv2.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.TagResourceResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.TagResourceResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn delete-authorizer
  "Deletes an Authorizer.

  request - `com.amazonaws.services.apigatewayv2.model.DeleteAuthorizerRequest`

  returns: Result of the DeleteAuthorizer operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.DeleteAuthorizerResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.DeleteAuthorizerResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.DeleteAuthorizerRequest request]
    (-> this (.deleteAuthorizer request))))

(defn update-route
  "Updates a Route.

  request - `com.amazonaws.services.apigatewayv2.model.UpdateRouteRequest`

  returns: Result of the UpdateRoute operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.UpdateRouteResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.UpdateRouteResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.UpdateRouteRequest request]
    (-> this (.updateRoute request))))

(defn delete-integration-response
  "Deletes an IntegrationResponses.

  request - `com.amazonaws.services.apigatewayv2.model.DeleteIntegrationResponseRequest`

  returns: Result of the DeleteIntegrationResponse operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.DeleteIntegrationResponseResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.DeleteIntegrationResponseResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.DeleteIntegrationResponseRequest request]
    (-> this (.deleteIntegrationResponse request))))

(defn get-stage
  "Gets a Stage.

  request - `com.amazonaws.services.apigatewayv2.model.GetStageRequest`

  returns: Result of the GetStage operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetStageResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetStageResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.GetStageRequest request]
    (-> this (.getStage request))))

(defn get-integration
  "Gets an Integration.

  request - `com.amazonaws.services.apigatewayv2.model.GetIntegrationRequest`

  returns: Result of the GetIntegration operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetIntegrationResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetIntegrationResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.GetIntegrationRequest request]
    (-> this (.getIntegration request))))

(defn get-integration-response
  "Gets an IntegrationResponses.

  request - `com.amazonaws.services.apigatewayv2.model.GetIntegrationResponseRequest`

  returns: Result of the GetIntegrationResponse operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetIntegrationResponseResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetIntegrationResponseResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.GetIntegrationResponseRequest request]
    (-> this (.getIntegrationResponse request))))

(defn delete-domain-name
  "Deletes a domain name.

  request - `com.amazonaws.services.apigatewayv2.model.DeleteDomainNameRequest`

  returns: Result of the DeleteDomainName operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.DeleteDomainNameResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.DeleteDomainNameResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.DeleteDomainNameRequest request]
    (-> this (.deleteDomainName request))))

(defn create-stage
  "Creates a Stage for an API.

  request - `com.amazonaws.services.apigatewayv2.model.CreateStageRequest`

  returns: Result of the CreateStage operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.CreateStageResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.CreateStageResult [^AmazonApiGatewayV2Client this ^com.amazonaws.services.apigatewayv2.model.CreateStageRequest request]
    (-> this (.createStage request))))

