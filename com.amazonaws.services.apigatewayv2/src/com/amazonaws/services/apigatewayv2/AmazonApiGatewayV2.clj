(ns com.amazonaws.services.apigatewayv2.AmazonApiGatewayV2
  "Interface for accessing AmazonApiGatewayV2.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonApiGatewayV2 instead.



  Amazon API Gateway V2"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.apigatewayv2 AmazonApiGatewayV2]))

(defn get-authorizers
  "Gets the Authorizers for an API.

  get-authorizers-request - `com.amazonaws.services.apigatewayv2.model.GetAuthorizersRequest`

  returns: Result of the GetAuthorizers operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetAuthorizersResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetAuthorizersResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetAuthorizersRequest get-authorizers-request]
    (-> this (.getAuthorizers get-authorizers-request))))

(defn create-integration
  "Creates an Integration.

  create-integration-request - `com.amazonaws.services.apigatewayv2.model.CreateIntegrationRequest`

  returns: Result of the CreateIntegration operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.CreateIntegrationResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.CreateIntegrationResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.CreateIntegrationRequest create-integration-request]
    (-> this (.createIntegration create-integration-request))))

(defn create-api
  "Creates an Api resource.

  create-api-request - `com.amazonaws.services.apigatewayv2.model.CreateApiRequest`

  returns: Result of the CreateApi operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.CreateApiResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.CreateApiResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.CreateApiRequest create-api-request]
    (-> this (.createApi create-api-request))))

(defn create-api-mapping
  "Creates an API mapping.

  create-api-mapping-request - `com.amazonaws.services.apigatewayv2.model.CreateApiMappingRequest`

  returns: Result of the CreateApiMapping operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.CreateApiMappingResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.CreateApiMappingResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.CreateApiMappingRequest create-api-mapping-request]
    (-> this (.createApiMapping create-api-mapping-request))))

(defn get-integrations
  "Gets the Integrations for an API.

  get-integrations-request - `com.amazonaws.services.apigatewayv2.model.GetIntegrationsRequest`

  returns: Result of the GetIntegrations operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetIntegrationsResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetIntegrationsResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetIntegrationsRequest get-integrations-request]
    (-> this (.getIntegrations get-integrations-request))))

(defn update-deployment
  "Updates a Deployment.

  update-deployment-request - `com.amazonaws.services.apigatewayv2.model.UpdateDeploymentRequest`

  returns: Result of the UpdateDeployment operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.UpdateDeploymentResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.UpdateDeploymentResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.UpdateDeploymentRequest update-deployment-request]
    (-> this (.updateDeployment update-deployment-request))))

(defn untag-resource
  "Untag an APIGW resource

  untag-resource-request - `com.amazonaws.services.apigatewayv2.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.UntagResourceResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.UntagResourceResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn update-authorizer
  "Updates an Authorizer.

  update-authorizer-request - `com.amazonaws.services.apigatewayv2.model.UpdateAuthorizerRequest`

  returns: Result of the UpdateAuthorizer operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.UpdateAuthorizerResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.UpdateAuthorizerResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.UpdateAuthorizerRequest update-authorizer-request]
    (-> this (.updateAuthorizer update-authorizer-request))))

(defn delete-api-mapping
  "Deletes an API mapping.

  delete-api-mapping-request - `com.amazonaws.services.apigatewayv2.model.DeleteApiMappingRequest`

  returns: Result of the DeleteApiMapping operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.DeleteApiMappingResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.DeleteApiMappingResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.DeleteApiMappingRequest delete-api-mapping-request]
    (-> this (.deleteApiMapping delete-api-mapping-request))))

(defn get-model-template
  "Gets a model template.

  get-model-template-request - `com.amazonaws.services.apigatewayv2.model.GetModelTemplateRequest`

  returns: Result of the GetModelTemplate operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetModelTemplateResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetModelTemplateResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetModelTemplateRequest get-model-template-request]
    (-> this (.getModelTemplate get-model-template-request))))

(defn get-route-response
  "Gets a RouteResponse.

  get-route-response-request - `com.amazonaws.services.apigatewayv2.model.GetRouteResponseRequest`

  returns: Result of the GetRouteResponse operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetRouteResponseResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetRouteResponseResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetRouteResponseRequest get-route-response-request]
    (-> this (.getRouteResponse get-route-response-request))))

(defn delete-stage
  "Deletes a Stage.

  delete-stage-request - `com.amazonaws.services.apigatewayv2.model.DeleteStageRequest`

  returns: Result of the DeleteStage operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.DeleteStageResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.DeleteStageResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.DeleteStageRequest delete-stage-request]
    (-> this (.deleteStage delete-stage-request))))

(defn get-api-mapping
  "The API mapping.

  get-api-mapping-request - `com.amazonaws.services.apigatewayv2.model.GetApiMappingRequest`

  returns: Result of the GetApiMapping operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetApiMappingResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetApiMappingResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetApiMappingRequest get-api-mapping-request]
    (-> this (.getApiMapping get-api-mapping-request))))

(defn get-deployment
  "Gets a Deployment.

  get-deployment-request - `com.amazonaws.services.apigatewayv2.model.GetDeploymentRequest`

  returns: Result of the GetDeployment operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetDeploymentResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetDeploymentResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetDeploymentRequest get-deployment-request]
    (-> this (.getDeployment get-deployment-request))))

(defn get-stages
  "Gets the Stages for an API.

  get-stages-request - `com.amazonaws.services.apigatewayv2.model.GetStagesRequest`

  returns: Result of the GetStages operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetStagesResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetStagesResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetStagesRequest get-stages-request]
    (-> this (.getStages get-stages-request))))

(defn update-api-mapping
  "The API mapping.

  update-api-mapping-request - `com.amazonaws.services.apigatewayv2.model.UpdateApiMappingRequest`

  returns: Result of the UpdateApiMapping operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.UpdateApiMappingResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.UpdateApiMappingResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.UpdateApiMappingRequest update-api-mapping-request]
    (-> this (.updateApiMapping update-api-mapping-request))))

(defn delete-integration
  "Deletes an Integration.

  delete-integration-request - `com.amazonaws.services.apigatewayv2.model.DeleteIntegrationRequest`

  returns: Result of the DeleteIntegration operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.DeleteIntegrationResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.DeleteIntegrationResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.DeleteIntegrationRequest delete-integration-request]
    (-> this (.deleteIntegration delete-integration-request))))

(defn update-route-response
  "Updates a RouteResponse.

  update-route-response-request - `com.amazonaws.services.apigatewayv2.model.UpdateRouteResponseRequest`

  returns: Result of the UpdateRouteResponse operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.UpdateRouteResponseResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.UpdateRouteResponseResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.UpdateRouteResponseRequest update-route-response-request]
    (-> this (.updateRouteResponse update-route-response-request))))

(defn create-route
  "Creates a Route for an API.

  create-route-request - `com.amazonaws.services.apigatewayv2.model.CreateRouteRequest`

  returns: Result of the CreateRoute operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.CreateRouteResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.CreateRouteResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.CreateRouteRequest create-route-request]
    (-> this (.createRoute create-route-request))))

(defn delete-route-response
  "Deletes a RouteResponse.

  delete-route-response-request - `com.amazonaws.services.apigatewayv2.model.DeleteRouteResponseRequest`

  returns: Result of the DeleteRouteResponse operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.DeleteRouteResponseResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.DeleteRouteResponseResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.DeleteRouteResponseRequest delete-route-response-request]
    (-> this (.deleteRouteResponse delete-route-response-request))))

(defn create-deployment
  "Creates a Deployment for an API.

  create-deployment-request - `com.amazonaws.services.apigatewayv2.model.CreateDeploymentRequest`

  returns: Result of the CreateDeployment operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.CreateDeploymentResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.CreateDeploymentResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.CreateDeploymentRequest create-deployment-request]
    (-> this (.createDeployment create-deployment-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonApiGatewayV2 this]
    (-> this (.shutdown))))

(defn get-models
  "Gets the Models for an API.

  get-models-request - `com.amazonaws.services.apigatewayv2.model.GetModelsRequest`

  returns: Result of the GetModels operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetModelsResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetModelsResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetModelsRequest get-models-request]
    (-> this (.getModels get-models-request))))

(defn create-model
  "Creates a Model for an API.

  create-model-request - `com.amazonaws.services.apigatewayv2.model.CreateModelRequest`

  returns: Result of the CreateModel operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.CreateModelResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.CreateModelResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.CreateModelRequest create-model-request]
    (-> this (.createModel create-model-request))))

(defn create-domain-name
  "Creates a domain name.

  create-domain-name-request - `com.amazonaws.services.apigatewayv2.model.CreateDomainNameRequest`

  returns: Result of the CreateDomainName operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.CreateDomainNameResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.CreateDomainNameResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.CreateDomainNameRequest create-domain-name-request]
    (-> this (.createDomainName create-domain-name-request))))

(defn get-integration-responses
  "Gets the IntegrationResponses for an Integration.

  get-integration-responses-request - `com.amazonaws.services.apigatewayv2.model.GetIntegrationResponsesRequest`

  returns: Result of the GetIntegrationResponses operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetIntegrationResponsesResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetIntegrationResponsesResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetIntegrationResponsesRequest get-integration-responses-request]
    (-> this (.getIntegrationResponses get-integration-responses-request))))

(defn get-authorizer
  "Gets an Authorizer.

  get-authorizer-request - `com.amazonaws.services.apigatewayv2.model.GetAuthorizerRequest`

  returns: Result of the GetAuthorizer operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetAuthorizerResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetAuthorizerResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetAuthorizerRequest get-authorizer-request]
    (-> this (.getAuthorizer get-authorizer-request))))

(defn update-stage
  "Updates a Stage.

  update-stage-request - `com.amazonaws.services.apigatewayv2.model.UpdateStageRequest`

  returns: Result of the UpdateStage operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.UpdateStageResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.UpdateStageResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.UpdateStageRequest update-stage-request]
    (-> this (.updateStage update-stage-request))))

(defn get-api-mappings
  "The API mappings.

  get-api-mappings-request - `com.amazonaws.services.apigatewayv2.model.GetApiMappingsRequest`

  returns: Result of the GetApiMappings operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetApiMappingsResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetApiMappingsResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetApiMappingsRequest get-api-mappings-request]
    (-> this (.getApiMappings get-api-mappings-request))))

(defn update-domain-name
  "Updates a domain name.

  update-domain-name-request - `com.amazonaws.services.apigatewayv2.model.UpdateDomainNameRequest`

  returns: Result of the UpdateDomainName operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.UpdateDomainNameResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.UpdateDomainNameResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.UpdateDomainNameRequest update-domain-name-request]
    (-> this (.updateDomainName update-domain-name-request))))

(defn get-route-responses
  "Gets the RouteResponses for a Route.

  get-route-responses-request - `com.amazonaws.services.apigatewayv2.model.GetRouteResponsesRequest`

  returns: Result of the GetRouteResponses operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetRouteResponsesResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetRouteResponsesResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetRouteResponsesRequest get-route-responses-request]
    (-> this (.getRouteResponses get-route-responses-request))))

(defn get-tags
  "Gets the Tags for an API.

  get-tags-request - `com.amazonaws.services.apigatewayv2.model.GetTagsRequest`

  returns: Result of the GetTags operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetTagsResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetTagsResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetTagsRequest get-tags-request]
    (-> this (.getTags get-tags-request))))

(defn get-domain-name
  "Gets a domain name.

  get-domain-name-request - `com.amazonaws.services.apigatewayv2.model.GetDomainNameRequest`

  returns: Result of the GetDomainName operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetDomainNameResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetDomainNameResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetDomainNameRequest get-domain-name-request]
    (-> this (.getDomainName get-domain-name-request))))

(defn delete-model
  "Deletes a Model.

  delete-model-request - `com.amazonaws.services.apigatewayv2.model.DeleteModelRequest`

  returns: Result of the DeleteModel operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.DeleteModelResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.DeleteModelResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.DeleteModelRequest delete-model-request]
    (-> this (.deleteModel delete-model-request))))

(defn update-integration-response
  "Updates an IntegrationResponses.

  update-integration-response-request - `com.amazonaws.services.apigatewayv2.model.UpdateIntegrationResponseRequest`

  returns: Result of the UpdateIntegrationResponse operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.UpdateIntegrationResponseResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.UpdateIntegrationResponseResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.UpdateIntegrationResponseRequest update-integration-response-request]
    (-> this (.updateIntegrationResponse update-integration-response-request))))

(defn get-route
  "Gets a Route.

  get-route-request - `com.amazonaws.services.apigatewayv2.model.GetRouteRequest`

  returns: Result of the GetRoute operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetRouteResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetRouteResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetRouteRequest get-route-request]
    (-> this (.getRoute get-route-request))))

(defn delete-api
  "Deletes an Api resource.

  delete-api-request - `com.amazonaws.services.apigatewayv2.model.DeleteApiRequest`

  returns: Result of the DeleteApi operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.DeleteApiResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.DeleteApiResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.DeleteApiRequest delete-api-request]
    (-> this (.deleteApi delete-api-request))))

(defn create-integration-response
  "Creates an IntegrationResponses.

  create-integration-response-request - `com.amazonaws.services.apigatewayv2.model.CreateIntegrationResponseRequest`

  returns: Result of the CreateIntegrationResponse operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.CreateIntegrationResponseResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.CreateIntegrationResponseResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.CreateIntegrationResponseRequest create-integration-response-request]
    (-> this (.createIntegrationResponse create-integration-response-request))))

(defn get-domain-names
  "Gets the domain names for an AWS account.

  get-domain-names-request - `com.amazonaws.services.apigatewayv2.model.GetDomainNamesRequest`

  returns: Result of the GetDomainNames operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetDomainNamesResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetDomainNamesResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetDomainNamesRequest get-domain-names-request]
    (-> this (.getDomainNames get-domain-names-request))))

(defn update-integration
  "Updates an Integration.

  update-integration-request - `com.amazonaws.services.apigatewayv2.model.UpdateIntegrationRequest`

  returns: Result of the UpdateIntegration operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.UpdateIntegrationResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.UpdateIntegrationResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.UpdateIntegrationRequest update-integration-request]
    (-> this (.updateIntegration update-integration-request))))

(defn get-routes
  "Gets the Routes for an API.

  get-routes-request - `com.amazonaws.services.apigatewayv2.model.GetRoutesRequest`

  returns: Result of the GetRoutes operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetRoutesResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetRoutesResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetRoutesRequest get-routes-request]
    (-> this (.getRoutes get-routes-request))))

(defn update-model
  "Updates a Model.

  update-model-request - `com.amazonaws.services.apigatewayv2.model.UpdateModelRequest`

  returns: Result of the UpdateModel operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.UpdateModelResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.UpdateModelResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.UpdateModelRequest update-model-request]
    (-> this (.updateModel update-model-request))))

(defn get-api
  "Gets an Api resource.

  get-api-request - `com.amazonaws.services.apigatewayv2.model.GetApiRequest`

  returns: Result of the GetApi operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetApiResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetApiResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetApiRequest get-api-request]
    (-> this (.getApi get-api-request))))

(defn get-apis
  "Gets a collection of Api resources.

  get-apis-request - `com.amazonaws.services.apigatewayv2.model.GetApisRequest`

  returns: Result of the GetApis operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetApisResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetApisResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetApisRequest get-apis-request]
    (-> this (.getApis get-apis-request))))

(defn create-authorizer
  "Creates an Authorizer for an API.

  create-authorizer-request - `com.amazonaws.services.apigatewayv2.model.CreateAuthorizerRequest`

  returns: Result of the CreateAuthorizer operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.CreateAuthorizerResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.CreateAuthorizerResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.CreateAuthorizerRequest create-authorizer-request]
    (-> this (.createAuthorizer create-authorizer-request))))

(defn delete-deployment
  "Deletes a Deployment.

  delete-deployment-request - `com.amazonaws.services.apigatewayv2.model.DeleteDeploymentRequest`

  returns: Result of the DeleteDeployment operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.DeleteDeploymentResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.DeleteDeploymentResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.DeleteDeploymentRequest delete-deployment-request]
    (-> this (.deleteDeployment delete-deployment-request))))

(defn create-route-response
  "Creates a RouteResponse for a Route.

  create-route-response-request - `com.amazonaws.services.apigatewayv2.model.CreateRouteResponseRequest`

  returns: Result of the CreateRouteResponse operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.CreateRouteResponseResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.CreateRouteResponseResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.CreateRouteResponseRequest create-route-response-request]
    (-> this (.createRouteResponse create-route-response-request))))

(defn get-model
  "Gets a Model.

  get-model-request - `com.amazonaws.services.apigatewayv2.model.GetModelRequest`

  returns: Result of the GetModel operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetModelResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetModelResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetModelRequest get-model-request]
    (-> this (.getModel get-model-request))))

(defn delete-route
  "Deletes a Route.

  delete-route-request - `com.amazonaws.services.apigatewayv2.model.DeleteRouteRequest`

  returns: Result of the DeleteRoute operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.DeleteRouteResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.DeleteRouteResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.DeleteRouteRequest delete-route-request]
    (-> this (.deleteRoute delete-route-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonApiGatewayV2 this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn update-api
  "Updates an Api resource.

  update-api-request - `com.amazonaws.services.apigatewayv2.model.UpdateApiRequest`

  returns: Result of the UpdateApi operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.UpdateApiResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.UpdateApiResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.UpdateApiRequest update-api-request]
    (-> this (.updateApi update-api-request))))

(defn get-deployments
  "Gets the Deployments for an API.

  get-deployments-request - `com.amazonaws.services.apigatewayv2.model.GetDeploymentsRequest`

  returns: Result of the GetDeployments operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetDeploymentsResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetDeploymentsResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetDeploymentsRequest get-deployments-request]
    (-> this (.getDeployments get-deployments-request))))

(defn tag-resource
  "Tag an APIGW resource

  tag-resource-request - `com.amazonaws.services.apigatewayv2.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.TagResourceResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.TagResourceResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

(defn delete-authorizer
  "Deletes an Authorizer.

  delete-authorizer-request - `com.amazonaws.services.apigatewayv2.model.DeleteAuthorizerRequest`

  returns: Result of the DeleteAuthorizer operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.DeleteAuthorizerResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.DeleteAuthorizerResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.DeleteAuthorizerRequest delete-authorizer-request]
    (-> this (.deleteAuthorizer delete-authorizer-request))))

(defn update-route
  "Updates a Route.

  update-route-request - `com.amazonaws.services.apigatewayv2.model.UpdateRouteRequest`

  returns: Result of the UpdateRoute operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.UpdateRouteResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.UpdateRouteResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.UpdateRouteRequest update-route-request]
    (-> this (.updateRoute update-route-request))))

(defn delete-integration-response
  "Deletes an IntegrationResponses.

  delete-integration-response-request - `com.amazonaws.services.apigatewayv2.model.DeleteIntegrationResponseRequest`

  returns: Result of the DeleteIntegrationResponse operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.DeleteIntegrationResponseResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.DeleteIntegrationResponseResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.DeleteIntegrationResponseRequest delete-integration-response-request]
    (-> this (.deleteIntegrationResponse delete-integration-response-request))))

(defn get-stage
  "Gets a Stage.

  get-stage-request - `com.amazonaws.services.apigatewayv2.model.GetStageRequest`

  returns: Result of the GetStage operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetStageResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetStageResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetStageRequest get-stage-request]
    (-> this (.getStage get-stage-request))))

(defn get-integration
  "Gets an Integration.

  get-integration-request - `com.amazonaws.services.apigatewayv2.model.GetIntegrationRequest`

  returns: Result of the GetIntegration operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetIntegrationResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetIntegrationResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetIntegrationRequest get-integration-request]
    (-> this (.getIntegration get-integration-request))))

(defn get-integration-response
  "Gets an IntegrationResponses.

  get-integration-response-request - `com.amazonaws.services.apigatewayv2.model.GetIntegrationResponseRequest`

  returns: Result of the GetIntegrationResponse operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.GetIntegrationResponseResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.GetIntegrationResponseResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.GetIntegrationResponseRequest get-integration-response-request]
    (-> this (.getIntegrationResponse get-integration-response-request))))

(defn delete-domain-name
  "Deletes a domain name.

  delete-domain-name-request - `com.amazonaws.services.apigatewayv2.model.DeleteDomainNameRequest`

  returns: Result of the DeleteDomainName operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.DeleteDomainNameResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.DeleteDomainNameResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.DeleteDomainNameRequest delete-domain-name-request]
    (-> this (.deleteDomainName delete-domain-name-request))))

(defn create-stage
  "Creates a Stage for an API.

  create-stage-request - `com.amazonaws.services.apigatewayv2.model.CreateStageRequest`

  returns: Result of the CreateStage operation returned by the service. - `com.amazonaws.services.apigatewayv2.model.CreateStageResult`

  throws: com.amazonaws.services.apigatewayv2.model.NotFoundException - The resource specified in the request was not found."
  (^com.amazonaws.services.apigatewayv2.model.CreateStageResult [^AmazonApiGatewayV2 this ^com.amazonaws.services.apigatewayv2.model.CreateStageRequest create-stage-request]
    (-> this (.createStage create-stage-request))))

