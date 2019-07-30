(ns com.amazonaws.services.apigateway.AbstractAmazonApiGateway
  "Abstract implementation of AmazonApiGateway. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.apigateway AbstractAmazonApiGateway]))

(defn delete-documentation-part
  "request - Deletes an existing documentation part of an API. - `com.amazonaws.services.apigateway.model.DeleteDocumentationPartRequest`

  returns: Result of the DeleteDocumentationPart operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteDocumentationPartResult`"
  (^com.amazonaws.services.apigateway.model.DeleteDocumentationPartResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.DeleteDocumentationPartRequest request]
    (-> this (.deleteDocumentationPart request))))

(defn get-authorizers
  "Description copied from interface: AmazonApiGateway

  request - Request to describe an existing Authorizers resource. - `com.amazonaws.services.apigateway.model.GetAuthorizersRequest`

  returns: Result of the GetAuthorizers operation returned by the service. - `com.amazonaws.services.apigateway.model.GetAuthorizersResult`"
  (^com.amazonaws.services.apigateway.model.GetAuthorizersResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetAuthorizersRequest request]
    (-> this (.getAuthorizers request))))

(defn put-integration-response
  "Description copied from interface: AmazonApiGateway

  request - Represents a put integration response request. - `com.amazonaws.services.apigateway.model.PutIntegrationResponseRequest`

  returns: Result of the PutIntegrationResponse operation returned by the service. - `com.amazonaws.services.apigateway.model.PutIntegrationResponseResult`"
  (^com.amazonaws.services.apigateway.model.PutIntegrationResponseResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.PutIntegrationResponseRequest request]
    (-> this (.putIntegrationResponse request))))

(defn update-method-response
  "Description copied from interface: AmazonApiGateway

  request - A request to update an existing MethodResponse resource. - `com.amazonaws.services.apigateway.model.UpdateMethodResponseRequest`

  returns: Result of the UpdateMethodResponse operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateMethodResponseResult`"
  (^com.amazonaws.services.apigateway.model.UpdateMethodResponseResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateMethodResponseRequest request]
    (-> this (.updateMethodResponse request))))

(defn get-resources
  "Description copied from interface: AmazonApiGateway

  request - Request to list information about a collection of resources. - `com.amazonaws.services.apigateway.model.GetResourcesRequest`

  returns: Result of the GetResources operation returned by the service. - `com.amazonaws.services.apigateway.model.GetResourcesResult`"
  (^com.amazonaws.services.apigateway.model.GetResourcesResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetResourcesRequest request]
    (-> this (.getResources request))))

(defn put-integration
  "Description copied from interface: AmazonApiGateway

  request - Sets up a method's integration. - `com.amazonaws.services.apigateway.model.PutIntegrationRequest`

  returns: Result of the PutIntegration operation returned by the service. - `com.amazonaws.services.apigateway.model.PutIntegrationResult`"
  (^com.amazonaws.services.apigateway.model.PutIntegrationResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.PutIntegrationRequest request]
    (-> this (.putIntegration request))))

(defn get-vpc-links
  "Description copied from interface: AmazonApiGateway

  request - Gets the VpcLinks collection under the caller's account in a selected region. - `com.amazonaws.services.apigateway.model.GetVpcLinksRequest`

  returns: Result of the GetVpcLinks operation returned by the service. - `com.amazonaws.services.apigateway.model.GetVpcLinksResult`"
  (^com.amazonaws.services.apigateway.model.GetVpcLinksResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetVpcLinksRequest request]
    (-> this (.getVpcLinks request))))

(defn get-sdk-types
  "request - Get the SdkTypes collection. - `com.amazonaws.services.apigateway.model.GetSdkTypesRequest`

  returns: Result of the GetSdkTypes operation returned by the service. - `com.amazonaws.services.apigateway.model.GetSdkTypesResult`"
  (^com.amazonaws.services.apigateway.model.GetSdkTypesResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetSdkTypesRequest request]
    (-> this (.getSdkTypes request))))

(defn get-usage-plan-keys
  "Description copied from interface: AmazonApiGateway

  request - The GET request to get all the usage plan keys representing the API keys added to a specified usage plan. - `com.amazonaws.services.apigateway.model.GetUsagePlanKeysRequest`

  returns: Result of the GetUsagePlanKeys operation returned by the service. - `com.amazonaws.services.apigateway.model.GetUsagePlanKeysResult`"
  (^com.amazonaws.services.apigateway.model.GetUsagePlanKeysResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetUsagePlanKeysRequest request]
    (-> this (.getUsagePlanKeys request))))

(defn delete-method
  "Description copied from interface: AmazonApiGateway

  request - Request to delete an existing Method resource. - `com.amazonaws.services.apigateway.model.DeleteMethodRequest`

  returns: Result of the DeleteMethod operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteMethodResult`"
  (^com.amazonaws.services.apigateway.model.DeleteMethodResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.DeleteMethodRequest request]
    (-> this (.deleteMethod request))))

(defn update-usage
  "Description copied from interface: AmazonApiGateway

  request - The PATCH request to grant a temporary extension to the remaining quota of a usage plan associated with a specified API key. - `com.amazonaws.services.apigateway.model.UpdateUsageRequest`

  returns: Result of the UpdateUsage operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateUsageResult`"
  (^com.amazonaws.services.apigateway.model.UpdateUsageResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateUsageRequest request]
    (-> this (.updateUsage request))))

(defn delete-base-path-mapping
  "Description copied from interface: AmazonApiGateway

  request - A request to delete the BasePathMapping resource. - `com.amazonaws.services.apigateway.model.DeleteBasePathMappingRequest`

  returns: Result of the DeleteBasePathMapping operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteBasePathMappingResult`"
  (^com.amazonaws.services.apigateway.model.DeleteBasePathMappingResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.DeleteBasePathMappingRequest request]
    (-> this (.deleteBasePathMapping request))))

(defn delete-client-certificate
  "Description copied from interface: AmazonApiGateway

  request - A request to delete the ClientCertificate resource. - `com.amazonaws.services.apigateway.model.DeleteClientCertificateRequest`

  returns: Result of the DeleteClientCertificate operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteClientCertificateResult`"
  (^com.amazonaws.services.apigateway.model.DeleteClientCertificateResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.DeleteClientCertificateRequest request]
    (-> this (.deleteClientCertificate request))))

(defn get-usage-plan-key
  "Description copied from interface: AmazonApiGateway

  request - The GET request to get a usage plan key of a given key identifier. - `com.amazonaws.services.apigateway.model.GetUsagePlanKeyRequest`

  returns: Result of the GetUsagePlanKey operation returned by the service. - `com.amazonaws.services.apigateway.model.GetUsagePlanKeyResult`"
  (^com.amazonaws.services.apigateway.model.GetUsagePlanKeyResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetUsagePlanKeyRequest request]
    (-> this (.getUsagePlanKey request))))

(defn set-region
  "Description copied from interface: AmazonApiGateway

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonApiGateway this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn create-usage-plan
  "Description copied from interface: AmazonApiGateway

  request - The POST request to create a usage plan with the name, description, throttle limits and quota limits, as well as the associated API stages, specified in the payload. - `com.amazonaws.services.apigateway.model.CreateUsagePlanRequest`

  returns: Result of the CreateUsagePlan operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateUsagePlanResult`"
  (^com.amazonaws.services.apigateway.model.CreateUsagePlanResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.CreateUsagePlanRequest request]
    (-> this (.createUsagePlan request))))

(defn get-documentation-version
  "request - Gets a documentation snapshot of an API. - `com.amazonaws.services.apigateway.model.GetDocumentationVersionRequest`

  returns: Result of the GetDocumentationVersion operation returned by the service. - `com.amazonaws.services.apigateway.model.GetDocumentationVersionResult`"
  (^com.amazonaws.services.apigateway.model.GetDocumentationVersionResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetDocumentationVersionRequest request]
    (-> this (.getDocumentationVersion request))))

(defn get-base-path-mappings
  "Description copied from interface: AmazonApiGateway

  request - A request to get information about a collection of BasePathMapping resources. - `com.amazonaws.services.apigateway.model.GetBasePathMappingsRequest`

  returns: Result of the GetBasePathMappings operation returned by the service. - `com.amazonaws.services.apigateway.model.GetBasePathMappingsResult`"
  (^com.amazonaws.services.apigateway.model.GetBasePathMappingsResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetBasePathMappingsRequest request]
    (-> this (.getBasePathMappings request))))

(defn get-resource
  "Description copied from interface: AmazonApiGateway

  request - Request to list information about a resource. - `com.amazonaws.services.apigateway.model.GetResourceRequest`

  returns: Result of the GetResource operation returned by the service. - `com.amazonaws.services.apigateway.model.GetResourceResult`"
  (^com.amazonaws.services.apigateway.model.GetResourceResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetResourceRequest request]
    (-> this (.getResource request))))

(defn update-deployment
  "Description copied from interface: AmazonApiGateway

  request - Requests API Gateway to change information about a Deployment resource. - `com.amazonaws.services.apigateway.model.UpdateDeploymentRequest`

  returns: Result of the UpdateDeployment operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateDeploymentResult`"
  (^com.amazonaws.services.apigateway.model.UpdateDeploymentResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateDeploymentRequest request]
    (-> this (.updateDeployment request))))

(defn update-documentation-part
  "request - Updates an existing documentation part of a given API. - `com.amazonaws.services.apigateway.model.UpdateDocumentationPartRequest`

  returns: Result of the UpdateDocumentationPart operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateDocumentationPartResult`"
  (^com.amazonaws.services.apigateway.model.UpdateDocumentationPartResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateDocumentationPartRequest request]
    (-> this (.updateDocumentationPart request))))

(defn update-vpc-link
  "Description copied from interface: AmazonApiGateway

  request - Updates an existing VpcLink of a specified identifier. - `com.amazonaws.services.apigateway.model.UpdateVpcLinkRequest`

  returns: Result of the UpdateVpcLink operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateVpcLinkResult`"
  (^com.amazonaws.services.apigateway.model.UpdateVpcLinkResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateVpcLinkRequest request]
    (-> this (.updateVpcLink request))))

(defn update-resource
  "Description copied from interface: AmazonApiGateway

  request - Request to change information about a Resource resource. - `com.amazonaws.services.apigateway.model.UpdateResourceRequest`

  returns: Result of the UpdateResource operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateResourceResult`"
  (^com.amazonaws.services.apigateway.model.UpdateResourceResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateResourceRequest request]
    (-> this (.updateResource request))))

(defn create-base-path-mapping
  "Description copied from interface: AmazonApiGateway

  request - Requests API Gateway to create a new BasePathMapping resource. - `com.amazonaws.services.apigateway.model.CreateBasePathMappingRequest`

  returns: Result of the CreateBasePathMapping operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateBasePathMappingResult`"
  (^com.amazonaws.services.apigateway.model.CreateBasePathMappingResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.CreateBasePathMappingRequest request]
    (-> this (.createBasePathMapping request))))

(defn untag-resource
  "Description copied from interface: AmazonApiGateway

  request - Removes a tag from a given resource. - `com.amazonaws.services.apigateway.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.apigateway.model.UntagResourceResult`"
  (^com.amazonaws.services.apigateway.model.UntagResourceResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn get-vpc-link
  "Description copied from interface: AmazonApiGateway

  request - Gets a specified VPC link under the caller's account in a region. - `com.amazonaws.services.apigateway.model.GetVpcLinkRequest`

  returns: Result of the GetVpcLink operation returned by the service. - `com.amazonaws.services.apigateway.model.GetVpcLinkResult`"
  (^com.amazonaws.services.apigateway.model.GetVpcLinkResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetVpcLinkRequest request]
    (-> this (.getVpcLink request))))

(defn update-authorizer
  "Description copied from interface: AmazonApiGateway

  request - Request to update an existing Authorizer resource. - `com.amazonaws.services.apigateway.model.UpdateAuthorizerRequest`

  returns: Result of the UpdateAuthorizer operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateAuthorizerResult`"
  (^com.amazonaws.services.apigateway.model.UpdateAuthorizerResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateAuthorizerRequest request]
    (-> this (.updateAuthorizer request))))

(defn update-client-certificate
  "Description copied from interface: AmazonApiGateway

  request - A request to change information about an ClientCertificate resource. - `com.amazonaws.services.apigateway.model.UpdateClientCertificateRequest`

  returns: Result of the UpdateClientCertificate operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateClientCertificateResult`"
  (^com.amazonaws.services.apigateway.model.UpdateClientCertificateResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateClientCertificateRequest request]
    (-> this (.updateClientCertificate request))))

(defn create-api-key
  "Description copied from interface: AmazonApiGateway

  request - Request to create an ApiKey resource. - `com.amazonaws.services.apigateway.model.CreateApiKeyRequest`

  returns: Result of the CreateApiKey operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateApiKeyResult`"
  (^com.amazonaws.services.apigateway.model.CreateApiKeyResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.CreateApiKeyRequest request]
    (-> this (.createApiKey request))))

(defn get-model-template
  "Description copied from interface: AmazonApiGateway

  request - Request to generate a sample mapping template used to transform the payload. - `com.amazonaws.services.apigateway.model.GetModelTemplateRequest`

  returns: Result of the GetModelTemplate operation returned by the service. - `com.amazonaws.services.apigateway.model.GetModelTemplateResult`"
  (^com.amazonaws.services.apigateway.model.GetModelTemplateResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetModelTemplateRequest request]
    (-> this (.getModelTemplate request))))

(defn delete-api-key
  "Description copied from interface: AmazonApiGateway

  request - A request to delete the ApiKey resource. - `com.amazonaws.services.apigateway.model.DeleteApiKeyRequest`

  returns: Result of the DeleteApiKey operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteApiKeyResult`"
  (^com.amazonaws.services.apigateway.model.DeleteApiKeyResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.DeleteApiKeyRequest request]
    (-> this (.deleteApiKey request))))

(defn get-api-keys
  "Description copied from interface: AmazonApiGateway

  request - A request to get information about the current ApiKeys resource. - `com.amazonaws.services.apigateway.model.GetApiKeysRequest`

  returns: Result of the GetApiKeys operation returned by the service. - `com.amazonaws.services.apigateway.model.GetApiKeysResult`"
  (^com.amazonaws.services.apigateway.model.GetApiKeysResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetApiKeysRequest request]
    (-> this (.getApiKeys request))))

(defn get-client-certificates
  "Description copied from interface: AmazonApiGateway

  request - A request to get information about a collection of ClientCertificate resources. - `com.amazonaws.services.apigateway.model.GetClientCertificatesRequest`

  returns: Result of the GetClientCertificates operation returned by the service. - `com.amazonaws.services.apigateway.model.GetClientCertificatesResult`"
  (^com.amazonaws.services.apigateway.model.GetClientCertificatesResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetClientCertificatesRequest request]
    (-> this (.getClientCertificates request))))

(defn delete-stage
  "Description copied from interface: AmazonApiGateway

  request - Requests API Gateway to delete a Stage resource. - `com.amazonaws.services.apigateway.model.DeleteStageRequest`

  returns: Result of the DeleteStage operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteStageResult`"
  (^com.amazonaws.services.apigateway.model.DeleteStageResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.DeleteStageRequest request]
    (-> this (.deleteStage request))))

(defn test-invoke-method
  "Description copied from interface: AmazonApiGateway

  request - Make a request to simulate the execution of a Method. - `com.amazonaws.services.apigateway.model.TestInvokeMethodRequest`

  returns: Result of the TestInvokeMethod operation returned by the service. - `com.amazonaws.services.apigateway.model.TestInvokeMethodResult`"
  (^com.amazonaws.services.apigateway.model.TestInvokeMethodResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.TestInvokeMethodRequest request]
    (-> this (.testInvokeMethod request))))

(defn update-gateway-response
  "Description copied from interface: AmazonApiGateway

  request - Updates a GatewayResponse of a specified response type on the given RestApi. - `com.amazonaws.services.apigateway.model.UpdateGatewayResponseRequest`

  returns: Result of the UpdateGatewayResponse operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateGatewayResponseResult`"
  (^com.amazonaws.services.apigateway.model.UpdateGatewayResponseResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateGatewayResponseRequest request]
    (-> this (.updateGatewayResponse request))))

(defn get-export
  "Description copied from interface: AmazonApiGateway

  request - Request a new export of a RestApi for a particular Stage. - `com.amazonaws.services.apigateway.model.GetExportRequest`

  returns: Result of the GetExport operation returned by the service. - `com.amazonaws.services.apigateway.model.GetExportResult`"
  (^com.amazonaws.services.apigateway.model.GetExportResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetExportRequest request]
    (-> this (.getExport request))))

(defn update-method
  "Description copied from interface: AmazonApiGateway

  request - Request to update an existing Method resource. - `com.amazonaws.services.apigateway.model.UpdateMethodRequest`

  returns: Result of the UpdateMethod operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateMethodResult`"
  (^com.amazonaws.services.apigateway.model.UpdateMethodResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateMethodRequest request]
    (-> this (.updateMethod request))))

(defn get-client-certificate
  "Description copied from interface: AmazonApiGateway

  request - A request to get information about the current ClientCertificate resource. - `com.amazonaws.services.apigateway.model.GetClientCertificateRequest`

  returns: Result of the GetClientCertificate operation returned by the service. - `com.amazonaws.services.apigateway.model.GetClientCertificateResult`"
  (^com.amazonaws.services.apigateway.model.GetClientCertificateResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetClientCertificateRequest request]
    (-> this (.getClientCertificate request))))

(defn get-sdk
  "Description copied from interface: AmazonApiGateway

  request - Request a new generated client SDK for a RestApi and Stage. - `com.amazonaws.services.apigateway.model.GetSdkRequest`

  returns: Result of the GetSdk operation returned by the service. - `com.amazonaws.services.apigateway.model.GetSdkResult`"
  (^com.amazonaws.services.apigateway.model.GetSdkResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetSdkRequest request]
    (-> this (.getSdk request))))

(defn get-deployment
  "Description copied from interface: AmazonApiGateway

  request - Requests API Gateway to get information about a Deployment resource. - `com.amazonaws.services.apigateway.model.GetDeploymentRequest`

  returns: Result of the GetDeployment operation returned by the service. - `com.amazonaws.services.apigateway.model.GetDeploymentResult`"
  (^com.amazonaws.services.apigateway.model.GetDeploymentResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetDeploymentRequest request]
    (-> this (.getDeployment request))))

(defn get-stages
  "Description copied from interface: AmazonApiGateway

  request - Requests API Gateway to get information about one or more Stage resources. - `com.amazonaws.services.apigateway.model.GetStagesRequest`

  returns: Result of the GetStages operation returned by the service. - `com.amazonaws.services.apigateway.model.GetStagesResult`"
  (^com.amazonaws.services.apigateway.model.GetStagesResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetStagesRequest request]
    (-> this (.getStages request))))

(defn get-gateway-response
  "Description copied from interface: AmazonApiGateway

  request - Gets a GatewayResponse of a specified response type on the given RestApi. - `com.amazonaws.services.apigateway.model.GetGatewayResponseRequest`

  returns: Result of the GetGatewayResponse operation returned by the service. - `com.amazonaws.services.apigateway.model.GetGatewayResponseResult`"
  (^com.amazonaws.services.apigateway.model.GetGatewayResponseResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetGatewayResponseRequest request]
    (-> this (.getGatewayResponse request))))

(defn delete-integration
  "Description copied from interface: AmazonApiGateway

  request - Represents a delete integration request. - `com.amazonaws.services.apigateway.model.DeleteIntegrationRequest`

  returns: Result of the DeleteIntegration operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteIntegrationResult`"
  (^com.amazonaws.services.apigateway.model.DeleteIntegrationResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.DeleteIntegrationRequest request]
    (-> this (.deleteIntegration request))))

(defn delete-usage-plan-key
  "Description copied from interface: AmazonApiGateway

  request - The DELETE request to delete a usage plan key and remove the underlying API key from the associated usage plan. - `com.amazonaws.services.apigateway.model.DeleteUsagePlanKeyRequest`

  returns: Result of the DeleteUsagePlanKey operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteUsagePlanKeyResult`"
  (^com.amazonaws.services.apigateway.model.DeleteUsagePlanKeyResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.DeleteUsagePlanKeyRequest request]
    (-> this (.deleteUsagePlanKey request))))

(defn delete-request-validator
  "Description copied from interface: AmazonApiGateway

  request - Deletes a specified RequestValidator of a given RestApi. - `com.amazonaws.services.apigateway.model.DeleteRequestValidatorRequest`

  returns: Result of the DeleteRequestValidator operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteRequestValidatorResult`"
  (^com.amazonaws.services.apigateway.model.DeleteRequestValidatorResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.DeleteRequestValidatorRequest request]
    (-> this (.deleteRequestValidator request))))

(defn delete-method-response
  "Description copied from interface: AmazonApiGateway

  request - A request to delete an existing MethodResponse resource. - `com.amazonaws.services.apigateway.model.DeleteMethodResponseRequest`

  returns: Result of the DeleteMethodResponse operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteMethodResponseResult`"
  (^com.amazonaws.services.apigateway.model.DeleteMethodResponseResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.DeleteMethodResponseRequest request]
    (-> this (.deleteMethodResponse request))))

(defn import-rest-api
  "Description copied from interface: AmazonApiGateway

  request - A POST request to import an API to API Gateway using an input of an API definition file. - `com.amazonaws.services.apigateway.model.ImportRestApiRequest`

  returns: Result of the ImportRestApi operation returned by the service. - `com.amazonaws.services.apigateway.model.ImportRestApiResult`"
  (^com.amazonaws.services.apigateway.model.ImportRestApiResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.ImportRestApiRequest request]
    (-> this (.importRestApi request))))

(defn create-deployment
  "Description copied from interface: AmazonApiGateway

  request - Requests API Gateway to create a Deployment resource. - `com.amazonaws.services.apigateway.model.CreateDeploymentRequest`

  returns: Result of the CreateDeployment operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateDeploymentResult`"
  (^com.amazonaws.services.apigateway.model.CreateDeploymentResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.CreateDeploymentRequest request]
    (-> this (.createDeployment request))))

(defn create-resource
  "Description copied from interface: AmazonApiGateway

  request - Requests API Gateway to create a Resource resource. - `com.amazonaws.services.apigateway.model.CreateResourceRequest`

  returns: Result of the CreateResource operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateResourceResult`"
  (^com.amazonaws.services.apigateway.model.CreateResourceResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.CreateResourceRequest request]
    (-> this (.createResource request))))

(defn update-base-path-mapping
  "Description copied from interface: AmazonApiGateway

  request - A request to change information about the BasePathMapping resource. - `com.amazonaws.services.apigateway.model.UpdateBasePathMappingRequest`

  returns: Result of the UpdateBasePathMapping operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateBasePathMappingResult`"
  (^com.amazonaws.services.apigateway.model.UpdateBasePathMappingResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateBasePathMappingRequest request]
    (-> this (.updateBasePathMapping request))))

(defn generate-client-certificate
  "Description copied from interface: AmazonApiGateway

  request - A request to generate a ClientCertificate resource. - `com.amazonaws.services.apigateway.model.GenerateClientCertificateRequest`

  returns: Result of the GenerateClientCertificate operation returned by the service. - `com.amazonaws.services.apigateway.model.GenerateClientCertificateResult`"
  (^com.amazonaws.services.apigateway.model.GenerateClientCertificateResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GenerateClientCertificateRequest request]
    (-> this (.generateClientCertificate request))))

(defn shutdown
  "Description copied from interface: AmazonApiGateway"
  ([^AbstractAmazonApiGateway this]
    (-> this (.shutdown))))

(defn get-models
  "Description copied from interface: AmazonApiGateway

  request - Request to list existing Models defined for a RestApi resource. - `com.amazonaws.services.apigateway.model.GetModelsRequest`

  returns: Result of the GetModels operation returned by the service. - `com.amazonaws.services.apigateway.model.GetModelsResult`"
  (^com.amazonaws.services.apigateway.model.GetModelsResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetModelsRequest request]
    (-> this (.getModels request))))

(defn get-sdk-type
  "request - Get an SdkType instance. - `com.amazonaws.services.apigateway.model.GetSdkTypeRequest`

  returns: Result of the GetSdkType operation returned by the service. - `com.amazonaws.services.apigateway.model.GetSdkTypeResult`"
  (^com.amazonaws.services.apigateway.model.GetSdkTypeResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetSdkTypeRequest request]
    (-> this (.getSdkType request))))

(defn create-model
  "Description copied from interface: AmazonApiGateway

  request - Request to add a new Model to an existing RestApi resource. - `com.amazonaws.services.apigateway.model.CreateModelRequest`

  returns: Result of the CreateModel operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateModelResult`"
  (^com.amazonaws.services.apigateway.model.CreateModelResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.CreateModelRequest request]
    (-> this (.createModel request))))

(defn put-rest-api
  "Description copied from interface: AmazonApiGateway

  request - A PUT request to update an existing API, with external API definitions specified as the request body. - `com.amazonaws.services.apigateway.model.PutRestApiRequest`

  returns: Result of the PutRestApi operation returned by the service. - `com.amazonaws.services.apigateway.model.PutRestApiResult`"
  (^com.amazonaws.services.apigateway.model.PutRestApiResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.PutRestApiRequest request]
    (-> this (.putRestApi request))))

(defn create-domain-name
  "Description copied from interface: AmazonApiGateway

  request - A request to create a new domain name. - `com.amazonaws.services.apigateway.model.CreateDomainNameRequest`

  returns: Result of the CreateDomainName operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateDomainNameResult`"
  (^com.amazonaws.services.apigateway.model.CreateDomainNameResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.CreateDomainNameRequest request]
    (-> this (.createDomainName request))))

(defn test-invoke-authorizer
  "Description copied from interface: AmazonApiGateway

  request - Make a request to simulate the execution of an Authorizer. - `com.amazonaws.services.apigateway.model.TestInvokeAuthorizerRequest`

  returns: Result of the TestInvokeAuthorizer operation returned by the service. - `com.amazonaws.services.apigateway.model.TestInvokeAuthorizerResult`"
  (^com.amazonaws.services.apigateway.model.TestInvokeAuthorizerResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.TestInvokeAuthorizerRequest request]
    (-> this (.testInvokeAuthorizer request))))

(defn get-usage
  "Description copied from interface: AmazonApiGateway

  request - The GET request to get the usage data of a usage plan in a specified time interval. - `com.amazonaws.services.apigateway.model.GetUsageRequest`

  returns: Result of the GetUsage operation returned by the service. - `com.amazonaws.services.apigateway.model.GetUsageResult`"
  (^com.amazonaws.services.apigateway.model.GetUsageResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetUsageRequest request]
    (-> this (.getUsage request))))

(defn create-vpc-link
  "Description copied from interface: AmazonApiGateway

  request - Creates a VPC link, under the caller's account in a selected region, in an asynchronous operation that typically takes 2-4 minutes to complete and become operational. The caller must have permissions to create and update VPC Endpoint services. - `com.amazonaws.services.apigateway.model.CreateVpcLinkRequest`

  returns: Result of the CreateVpcLink operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateVpcLinkResult`"
  (^com.amazonaws.services.apigateway.model.CreateVpcLinkResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.CreateVpcLinkRequest request]
    (-> this (.createVpcLink request))))

(defn delete-gateway-response
  "Description copied from interface: AmazonApiGateway

  request - Clears any customization of a GatewayResponse of a specified response type on the given RestApi and resets it with the default settings. - `com.amazonaws.services.apigateway.model.DeleteGatewayResponseRequest`

  returns: Result of the DeleteGatewayResponse operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteGatewayResponseResult`"
  (^com.amazonaws.services.apigateway.model.DeleteGatewayResponseResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.DeleteGatewayResponseRequest request]
    (-> this (.deleteGatewayResponse request))))

(defn delete-usage-plan
  "Description copied from interface: AmazonApiGateway

  request - The DELETE request to delete a usage plan of a given plan Id. - `com.amazonaws.services.apigateway.model.DeleteUsagePlanRequest`

  returns: Result of the DeleteUsagePlan operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteUsagePlanResult`"
  (^com.amazonaws.services.apigateway.model.DeleteUsagePlanResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.DeleteUsagePlanRequest request]
    (-> this (.deleteUsagePlan request))))

(defn create-request-validator
  "Description copied from interface: AmazonApiGateway

  request - Creates a RequestValidator of a given RestApi. - `com.amazonaws.services.apigateway.model.CreateRequestValidatorRequest`

  returns: Result of the CreateRequestValidator operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateRequestValidatorResult`"
  (^com.amazonaws.services.apigateway.model.CreateRequestValidatorResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.CreateRequestValidatorRequest request]
    (-> this (.createRequestValidator request))))

(defn set-endpoint
  "Description copied from interface: AmazonApiGateway

  endpoint - The endpoint (ex: \"apigateway.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://apigateway.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonApiGateway this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn get-authorizer
  "Description copied from interface: AmazonApiGateway

  request - Request to describe an existing Authorizer resource. - `com.amazonaws.services.apigateway.model.GetAuthorizerRequest`

  returns: Result of the GetAuthorizer operation returned by the service. - `com.amazonaws.services.apigateway.model.GetAuthorizerResult`"
  (^com.amazonaws.services.apigateway.model.GetAuthorizerResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetAuthorizerRequest request]
    (-> this (.getAuthorizer request))))

(defn update-stage
  "Description copied from interface: AmazonApiGateway

  request - Requests API Gateway to change information about a Stage resource. - `com.amazonaws.services.apigateway.model.UpdateStageRequest`

  returns: Result of the UpdateStage operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateStageResult`"
  (^com.amazonaws.services.apigateway.model.UpdateStageResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateStageRequest request]
    (-> this (.updateStage request))))

(defn get-usage-plan
  "Description copied from interface: AmazonApiGateway

  request - The GET request to get a usage plan of a given plan identifier. - `com.amazonaws.services.apigateway.model.GetUsagePlanRequest`

  returns: Result of the GetUsagePlan operation returned by the service. - `com.amazonaws.services.apigateway.model.GetUsagePlanResult`"
  (^com.amazonaws.services.apigateway.model.GetUsagePlanResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetUsagePlanRequest request]
    (-> this (.getUsagePlan request))))

(defn update-domain-name
  "Description copied from interface: AmazonApiGateway

  request - A request to change information about the DomainName resource. - `com.amazonaws.services.apigateway.model.UpdateDomainNameRequest`

  returns: Result of the UpdateDomainName operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateDomainNameResult`"
  (^com.amazonaws.services.apigateway.model.UpdateDomainNameResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateDomainNameRequest request]
    (-> this (.updateDomainName request))))

(defn flush-stage-authorizers-cache
  "Description copied from interface: AmazonApiGateway

  request - Request to flush authorizer cache entries on a specified stage. - `com.amazonaws.services.apigateway.model.FlushStageAuthorizersCacheRequest`

  returns: Result of the FlushStageAuthorizersCache operation returned by the service. - `com.amazonaws.services.apigateway.model.FlushStageAuthorizersCacheResult`"
  (^com.amazonaws.services.apigateway.model.FlushStageAuthorizersCacheResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.FlushStageAuthorizersCacheRequest request]
    (-> this (.flushStageAuthorizersCache request))))

(defn get-documentation-part
  "request - Gets a specified documentation part of a given API. - `com.amazonaws.services.apigateway.model.GetDocumentationPartRequest`

  returns: Result of the GetDocumentationPart operation returned by the service. - `com.amazonaws.services.apigateway.model.GetDocumentationPartResult`"
  (^com.amazonaws.services.apigateway.model.GetDocumentationPartResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetDocumentationPartRequest request]
    (-> this (.getDocumentationPart request))))

(defn get-tags
  "Description copied from interface: AmazonApiGateway

  request - Gets the Tags collection for a given resource. - `com.amazonaws.services.apigateway.model.GetTagsRequest`

  returns: Result of the GetTags operation returned by the service. - `com.amazonaws.services.apigateway.model.GetTagsResult`"
  (^com.amazonaws.services.apigateway.model.GetTagsResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetTagsRequest request]
    (-> this (.getTags request))))

(defn get-method-response
  "Description copied from interface: AmazonApiGateway

  request - Request to describe a MethodResponse resource. - `com.amazonaws.services.apigateway.model.GetMethodResponseRequest`

  returns: Result of the GetMethodResponse operation returned by the service. - `com.amazonaws.services.apigateway.model.GetMethodResponseResult`"
  (^com.amazonaws.services.apigateway.model.GetMethodResponseResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetMethodResponseRequest request]
    (-> this (.getMethodResponse request))))

(defn get-domain-name
  "Description copied from interface: AmazonApiGateway

  request - Request to get the name of a DomainName resource. - `com.amazonaws.services.apigateway.model.GetDomainNameRequest`

  returns: Result of the GetDomainName operation returned by the service. - `com.amazonaws.services.apigateway.model.GetDomainNameResult`"
  (^com.amazonaws.services.apigateway.model.GetDomainNameResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetDomainNameRequest request]
    (-> this (.getDomainName request))))

(defn get-base-path-mapping
  "Description copied from interface: AmazonApiGateway

  request - Request to describe a BasePathMapping resource. - `com.amazonaws.services.apigateway.model.GetBasePathMappingRequest`

  returns: Result of the GetBasePathMapping operation returned by the service. - `com.amazonaws.services.apigateway.model.GetBasePathMappingResult`"
  (^com.amazonaws.services.apigateway.model.GetBasePathMappingResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetBasePathMappingRequest request]
    (-> this (.getBasePathMapping request))))

(defn update-api-key
  "Description copied from interface: AmazonApiGateway

  request - A request to change information about an ApiKey resource. - `com.amazonaws.services.apigateway.model.UpdateApiKeyRequest`

  returns: Result of the UpdateApiKey operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateApiKeyResult`"
  (^com.amazonaws.services.apigateway.model.UpdateApiKeyResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateApiKeyRequest request]
    (-> this (.updateApiKey request))))

(defn get-request-validators
  "Description copied from interface: AmazonApiGateway

  request - Gets the RequestValidators collection of a given RestApi. - `com.amazonaws.services.apigateway.model.GetRequestValidatorsRequest`

  returns: Result of the GetRequestValidators operation returned by the service. - `com.amazonaws.services.apigateway.model.GetRequestValidatorsResult`"
  (^com.amazonaws.services.apigateway.model.GetRequestValidatorsResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetRequestValidatorsRequest request]
    (-> this (.getRequestValidators request))))

(defn get-api-key
  "Description copied from interface: AmazonApiGateway

  request - A request to get information about the current ApiKey resource. - `com.amazonaws.services.apigateway.model.GetApiKeyRequest`

  returns: Result of the GetApiKey operation returned by the service. - `com.amazonaws.services.apigateway.model.GetApiKeyResult`"
  (^com.amazonaws.services.apigateway.model.GetApiKeyResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetApiKeyRequest request]
    (-> this (.getApiKey request))))

(defn delete-documentation-version
  "request - Deletes an existing documentation version of an API. - `com.amazonaws.services.apigateway.model.DeleteDocumentationVersionRequest`

  returns: Result of the DeleteDocumentationVersion operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteDocumentationVersionResult`"
  (^com.amazonaws.services.apigateway.model.DeleteDocumentationVersionResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.DeleteDocumentationVersionRequest request]
    (-> this (.deleteDocumentationVersion request))))

(defn delete-model
  "Description copied from interface: AmazonApiGateway

  request - Request to delete an existing model in an existing RestApi resource. - `com.amazonaws.services.apigateway.model.DeleteModelRequest`

  returns: Result of the DeleteModel operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteModelResult`"
  (^com.amazonaws.services.apigateway.model.DeleteModelResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.DeleteModelRequest request]
    (-> this (.deleteModel request))))

(defn update-integration-response
  "Description copied from interface: AmazonApiGateway

  request - Represents an update integration response request. - `com.amazonaws.services.apigateway.model.UpdateIntegrationResponseRequest`

  returns: Result of the UpdateIntegrationResponse operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateIntegrationResponseResult`"
  (^com.amazonaws.services.apigateway.model.UpdateIntegrationResponseResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateIntegrationResponseRequest request]
    (-> this (.updateIntegrationResponse request))))

(defn delete-resource
  "Description copied from interface: AmazonApiGateway

  request - Request to delete a Resource. - `com.amazonaws.services.apigateway.model.DeleteResourceRequest`

  returns: Result of the DeleteResource operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteResourceResult`"
  (^com.amazonaws.services.apigateway.model.DeleteResourceResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.DeleteResourceRequest request]
    (-> this (.deleteResource request))))

(defn update-documentation-version
  "request - Updates an existing documentation version of an API. - `com.amazonaws.services.apigateway.model.UpdateDocumentationVersionRequest`

  returns: Result of the UpdateDocumentationVersion operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateDocumentationVersionResult`"
  (^com.amazonaws.services.apigateway.model.UpdateDocumentationVersionResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateDocumentationVersionRequest request]
    (-> this (.updateDocumentationVersion request))))

(defn put-gateway-response
  "Description copied from interface: AmazonApiGateway

  request - Creates a customization of a GatewayResponse of a specified response type and status code on the given RestApi. - `com.amazonaws.services.apigateway.model.PutGatewayResponseRequest`

  returns: Result of the PutGatewayResponse operation returned by the service. - `com.amazonaws.services.apigateway.model.PutGatewayResponseResult`"
  (^com.amazonaws.services.apigateway.model.PutGatewayResponseResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.PutGatewayResponseRequest request]
    (-> this (.putGatewayResponse request))))

(defn import-documentation-parts
  "request - Import documentation parts from an external (e.g., OpenAPI) definition file. - `com.amazonaws.services.apigateway.model.ImportDocumentationPartsRequest`

  returns: Result of the ImportDocumentationParts operation returned by the service. - `com.amazonaws.services.apigateway.model.ImportDocumentationPartsResult`"
  (^com.amazonaws.services.apigateway.model.ImportDocumentationPartsResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.ImportDocumentationPartsRequest request]
    (-> this (.importDocumentationParts request))))

(defn delete-vpc-link
  "Description copied from interface: AmazonApiGateway

  request - Deletes an existing VpcLink of a specified identifier. - `com.amazonaws.services.apigateway.model.DeleteVpcLinkRequest`

  returns: Result of the DeleteVpcLink operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteVpcLinkResult`"
  (^com.amazonaws.services.apigateway.model.DeleteVpcLinkResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.DeleteVpcLinkRequest request]
    (-> this (.deleteVpcLink request))))

(defn get-documentation-parts
  "request - Gets the documentation parts of an API. The result may be filtered by the type, name, or path of API entities (targets). - `com.amazonaws.services.apigateway.model.GetDocumentationPartsRequest`

  returns: Result of the GetDocumentationParts operation returned by the service. - `com.amazonaws.services.apigateway.model.GetDocumentationPartsResult`"
  (^com.amazonaws.services.apigateway.model.GetDocumentationPartsResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetDocumentationPartsRequest request]
    (-> this (.getDocumentationParts request))))

(defn update-request-validator
  "Description copied from interface: AmazonApiGateway

  request - Updates a RequestValidator of a given RestApi. - `com.amazonaws.services.apigateway.model.UpdateRequestValidatorRequest`

  returns: Result of the UpdateRequestValidator operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateRequestValidatorResult`"
  (^com.amazonaws.services.apigateway.model.UpdateRequestValidatorResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateRequestValidatorRequest request]
    (-> this (.updateRequestValidator request))))

(defn create-documentation-part
  "request - Creates a new documentation part of a given API. - `com.amazonaws.services.apigateway.model.CreateDocumentationPartRequest`

  returns: Result of the CreateDocumentationPart operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateDocumentationPartResult`"
  (^com.amazonaws.services.apigateway.model.CreateDocumentationPartResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.CreateDocumentationPartRequest request]
    (-> this (.createDocumentationPart request))))

(defn get-account
  "Description copied from interface: AmazonApiGateway

  request - Requests API Gateway to get information about the current Account resource. - `com.amazonaws.services.apigateway.model.GetAccountRequest`

  returns: Result of the GetAccount operation returned by the service. - `com.amazonaws.services.apigateway.model.GetAccountResult`"
  (^com.amazonaws.services.apigateway.model.GetAccountResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetAccountRequest request]
    (-> this (.getAccount request))))

(defn update-account
  "Description copied from interface: AmazonApiGateway

  request - Requests API Gateway to change information about the current Account resource. - `com.amazonaws.services.apigateway.model.UpdateAccountRequest`

  returns: Result of the UpdateAccount operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateAccountResult`"
  (^com.amazonaws.services.apigateway.model.UpdateAccountResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateAccountRequest request]
    (-> this (.updateAccount request))))

(defn get-method
  "Description copied from interface: AmazonApiGateway

  request - Request to describe an existing Method resource. - `com.amazonaws.services.apigateway.model.GetMethodRequest`

  returns: Result of the GetMethod operation returned by the service. - `com.amazonaws.services.apigateway.model.GetMethodResult`"
  (^com.amazonaws.services.apigateway.model.GetMethodResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetMethodRequest request]
    (-> this (.getMethod request))))

(defn create-documentation-version
  "request - Creates a new documentation version of a given API. - `com.amazonaws.services.apigateway.model.CreateDocumentationVersionRequest`

  returns: Result of the CreateDocumentationVersion operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateDocumentationVersionResult`"
  (^com.amazonaws.services.apigateway.model.CreateDocumentationVersionResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.CreateDocumentationVersionRequest request]
    (-> this (.createDocumentationVersion request))))

(defn get-gateway-responses
  "Description copied from interface: AmazonApiGateway

  request - Gets the GatewayResponses collection on the given RestApi. If an API developer has not added any definitions for gateway responses, the result will be the API Gateway-generated default GatewayResponses collection for the supported response types. - `com.amazonaws.services.apigateway.model.GetGatewayResponsesRequest`

  returns: Result of the GetGatewayResponses operation returned by the service. - `com.amazonaws.services.apigateway.model.GetGatewayResponsesResult`"
  (^com.amazonaws.services.apigateway.model.GetGatewayResponsesResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetGatewayResponsesRequest request]
    (-> this (.getGatewayResponses request))))

(defn get-domain-names
  "Description copied from interface: AmazonApiGateway

  request - Request to describe a collection of DomainName resources. - `com.amazonaws.services.apigateway.model.GetDomainNamesRequest`

  returns: Result of the GetDomainNames operation returned by the service. - `com.amazonaws.services.apigateway.model.GetDomainNamesResult`"
  (^com.amazonaws.services.apigateway.model.GetDomainNamesResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetDomainNamesRequest request]
    (-> this (.getDomainNames request))))

(defn update-integration
  "Description copied from interface: AmazonApiGateway

  request - Represents an update integration request. - `com.amazonaws.services.apigateway.model.UpdateIntegrationRequest`

  returns: Result of the UpdateIntegration operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateIntegrationResult`"
  (^com.amazonaws.services.apigateway.model.UpdateIntegrationResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateIntegrationRequest request]
    (-> this (.updateIntegration request))))

(defn update-model
  "Description copied from interface: AmazonApiGateway

  request - Request to update an existing model in an existing RestApi resource. - `com.amazonaws.services.apigateway.model.UpdateModelRequest`

  returns: Result of the UpdateModel operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateModelResult`"
  (^com.amazonaws.services.apigateway.model.UpdateModelResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateModelRequest request]
    (-> this (.updateModel request))))

(defn update-rest-api
  "Description copied from interface: AmazonApiGateway

  request - Request to update an existing RestApi resource in your collection. - `com.amazonaws.services.apigateway.model.UpdateRestApiRequest`

  returns: Result of the UpdateRestApi operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateRestApiResult`"
  (^com.amazonaws.services.apigateway.model.UpdateRestApiResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateRestApiRequest request]
    (-> this (.updateRestApi request))))

(defn create-authorizer
  "Description copied from interface: AmazonApiGateway

  request - Request to add a new Authorizer to an existing RestApi resource. - `com.amazonaws.services.apigateway.model.CreateAuthorizerRequest`

  returns: Result of the CreateAuthorizer operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateAuthorizerResult`"
  (^com.amazonaws.services.apigateway.model.CreateAuthorizerResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.CreateAuthorizerRequest request]
    (-> this (.createAuthorizer request))))

(defn delete-deployment
  "Description copied from interface: AmazonApiGateway

  request - Requests API Gateway to delete a Deployment resource. - `com.amazonaws.services.apigateway.model.DeleteDeploymentRequest`

  returns: Result of the DeleteDeployment operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteDeploymentResult`"
  (^com.amazonaws.services.apigateway.model.DeleteDeploymentResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.DeleteDeploymentRequest request]
    (-> this (.deleteDeployment request))))

(defn delete-rest-api
  "Description copied from interface: AmazonApiGateway

  request - Request to delete the specified API from your collection. - `com.amazonaws.services.apigateway.model.DeleteRestApiRequest`

  returns: Result of the DeleteRestApi operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteRestApiResult`"
  (^com.amazonaws.services.apigateway.model.DeleteRestApiResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.DeleteRestApiRequest request]
    (-> this (.deleteRestApi request))))

(defn get-rest-apis
  "Description copied from interface: AmazonApiGateway

  request - The GET request to list existing RestApis defined for your collection. - `com.amazonaws.services.apigateway.model.GetRestApisRequest`

  returns: Result of the GetRestApis operation returned by the service. - `com.amazonaws.services.apigateway.model.GetRestApisResult`"
  (^com.amazonaws.services.apigateway.model.GetRestApisResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetRestApisRequest request]
    (-> this (.getRestApis request))))

(defn get-model
  "Description copied from interface: AmazonApiGateway

  request - Request to list information about a model in an existing RestApi resource. - `com.amazonaws.services.apigateway.model.GetModelRequest`

  returns: Result of the GetModel operation returned by the service. - `com.amazonaws.services.apigateway.model.GetModelResult`"
  (^com.amazonaws.services.apigateway.model.GetModelResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetModelRequest request]
    (-> this (.getModel request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonApiGateway

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonApiGateway this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-documentation-versions
  "request - Gets the documentation versions of an API. - `com.amazonaws.services.apigateway.model.GetDocumentationVersionsRequest`

  returns: Result of the GetDocumentationVersions operation returned by the service. - `com.amazonaws.services.apigateway.model.GetDocumentationVersionsResult`"
  (^com.amazonaws.services.apigateway.model.GetDocumentationVersionsResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetDocumentationVersionsRequest request]
    (-> this (.getDocumentationVersions request))))

(defn get-deployments
  "Description copied from interface: AmazonApiGateway

  request - Requests API Gateway to get information about a Deployments collection. - `com.amazonaws.services.apigateway.model.GetDeploymentsRequest`

  returns: Result of the GetDeployments operation returned by the service. - `com.amazonaws.services.apigateway.model.GetDeploymentsResult`"
  (^com.amazonaws.services.apigateway.model.GetDeploymentsResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetDeploymentsRequest request]
    (-> this (.getDeployments request))))

(defn get-rest-api
  "Description copied from interface: AmazonApiGateway

  request - The GET request to list an existing RestApi defined for your collection. - `com.amazonaws.services.apigateway.model.GetRestApiRequest`

  returns: Result of the GetRestApi operation returned by the service. - `com.amazonaws.services.apigateway.model.GetRestApiResult`"
  (^com.amazonaws.services.apigateway.model.GetRestApiResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetRestApiRequest request]
    (-> this (.getRestApi request))))

(defn flush-stage-cache
  "Description copied from interface: AmazonApiGateway

  request - Requests API Gateway to flush a stage's cache. - `com.amazonaws.services.apigateway.model.FlushStageCacheRequest`

  returns: Result of the FlushStageCache operation returned by the service. - `com.amazonaws.services.apigateway.model.FlushStageCacheResult`"
  (^com.amazonaws.services.apigateway.model.FlushStageCacheResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.FlushStageCacheRequest request]
    (-> this (.flushStageCache request))))

(defn update-usage-plan
  "Description copied from interface: AmazonApiGateway

  request - The PATCH request to update a usage plan of a given plan Id. - `com.amazonaws.services.apigateway.model.UpdateUsagePlanRequest`

  returns: Result of the UpdateUsagePlan operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateUsagePlanResult`"
  (^com.amazonaws.services.apigateway.model.UpdateUsagePlanResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateUsagePlanRequest request]
    (-> this (.updateUsagePlan request))))

(defn tag-resource
  "Description copied from interface: AmazonApiGateway

  request - Adds or updates a tag on a given resource. - `com.amazonaws.services.apigateway.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.apigateway.model.TagResourceResult`"
  (^com.amazonaws.services.apigateway.model.TagResourceResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn delete-authorizer
  "Description copied from interface: AmazonApiGateway

  request - Request to delete an existing Authorizer resource. - `com.amazonaws.services.apigateway.model.DeleteAuthorizerRequest`

  returns: Result of the DeleteAuthorizer operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteAuthorizerResult`"
  (^com.amazonaws.services.apigateway.model.DeleteAuthorizerResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.DeleteAuthorizerRequest request]
    (-> this (.deleteAuthorizer request))))

(defn create-usage-plan-key
  "Description copied from interface: AmazonApiGateway

  request - The POST request to create a usage plan key for adding an existing API key to a usage plan. - `com.amazonaws.services.apigateway.model.CreateUsagePlanKeyRequest`

  returns: Result of the CreateUsagePlanKey operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateUsagePlanKeyResult`"
  (^com.amazonaws.services.apigateway.model.CreateUsagePlanKeyResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.CreateUsagePlanKeyRequest request]
    (-> this (.createUsagePlanKey request))))

(defn import-api-keys
  "Description copied from interface: AmazonApiGateway

  request - The POST request to import API keys from an external source, such as a CSV-formatted file. - `com.amazonaws.services.apigateway.model.ImportApiKeysRequest`

  returns: Result of the ImportApiKeys operation returned by the service. - `com.amazonaws.services.apigateway.model.ImportApiKeysResult`"
  (^com.amazonaws.services.apigateway.model.ImportApiKeysResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.ImportApiKeysRequest request]
    (-> this (.importApiKeys request))))

(defn get-usage-plans
  "Description copied from interface: AmazonApiGateway

  request - The GET request to get all the usage plans of the caller's account. - `com.amazonaws.services.apigateway.model.GetUsagePlansRequest`

  returns: Result of the GetUsagePlans operation returned by the service. - `com.amazonaws.services.apigateway.model.GetUsagePlansResult`"
  (^com.amazonaws.services.apigateway.model.GetUsagePlansResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetUsagePlansRequest request]
    (-> this (.getUsagePlans request))))

(defn put-method-response
  "Description copied from interface: AmazonApiGateway

  request - Request to add a MethodResponse to an existing Method resource. - `com.amazonaws.services.apigateway.model.PutMethodResponseRequest`

  returns: Result of the PutMethodResponse operation returned by the service. - `com.amazonaws.services.apigateway.model.PutMethodResponseResult`"
  (^com.amazonaws.services.apigateway.model.PutMethodResponseResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.PutMethodResponseRequest request]
    (-> this (.putMethodResponse request))))

(defn delete-integration-response
  "Description copied from interface: AmazonApiGateway

  request - Represents a delete integration response request. - `com.amazonaws.services.apigateway.model.DeleteIntegrationResponseRequest`

  returns: Result of the DeleteIntegrationResponse operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteIntegrationResponseResult`"
  (^com.amazonaws.services.apigateway.model.DeleteIntegrationResponseResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.DeleteIntegrationResponseRequest request]
    (-> this (.deleteIntegrationResponse request))))

(defn get-stage
  "Description copied from interface: AmazonApiGateway

  request - Requests API Gateway to get information about a Stage resource. - `com.amazonaws.services.apigateway.model.GetStageRequest`

  returns: Result of the GetStage operation returned by the service. - `com.amazonaws.services.apigateway.model.GetStageResult`"
  (^com.amazonaws.services.apigateway.model.GetStageResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetStageRequest request]
    (-> this (.getStage request))))

(defn get-integration
  "Description copied from interface: AmazonApiGateway

  request - Represents a request to get the integration configuration. - `com.amazonaws.services.apigateway.model.GetIntegrationRequest`

  returns: Result of the GetIntegration operation returned by the service. - `com.amazonaws.services.apigateway.model.GetIntegrationResult`"
  (^com.amazonaws.services.apigateway.model.GetIntegrationResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetIntegrationRequest request]
    (-> this (.getIntegration request))))

(defn create-rest-api
  "Description copied from interface: AmazonApiGateway

  request - The POST Request to add a new RestApi resource to your collection. - `com.amazonaws.services.apigateway.model.CreateRestApiRequest`

  returns: Result of the CreateRestApi operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateRestApiResult`"
  (^com.amazonaws.services.apigateway.model.CreateRestApiResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.CreateRestApiRequest request]
    (-> this (.createRestApi request))))

(defn get-request-validator
  "Description copied from interface: AmazonApiGateway

  request - Gets a RequestValidator of a given RestApi. - `com.amazonaws.services.apigateway.model.GetRequestValidatorRequest`

  returns: Result of the GetRequestValidator operation returned by the service. - `com.amazonaws.services.apigateway.model.GetRequestValidatorResult`"
  (^com.amazonaws.services.apigateway.model.GetRequestValidatorResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetRequestValidatorRequest request]
    (-> this (.getRequestValidator request))))

(defn put-method
  "Description copied from interface: AmazonApiGateway

  request - Request to add a method to an existing Resource resource. - `com.amazonaws.services.apigateway.model.PutMethodRequest`

  returns: Result of the PutMethod operation returned by the service. - `com.amazonaws.services.apigateway.model.PutMethodResult`"
  (^com.amazonaws.services.apigateway.model.PutMethodResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.PutMethodRequest request]
    (-> this (.putMethod request))))

(defn get-integration-response
  "Description copied from interface: AmazonApiGateway

  request - Represents a get integration response request. - `com.amazonaws.services.apigateway.model.GetIntegrationResponseRequest`

  returns: Result of the GetIntegrationResponse operation returned by the service. - `com.amazonaws.services.apigateway.model.GetIntegrationResponseResult`"
  (^com.amazonaws.services.apigateway.model.GetIntegrationResponseResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetIntegrationResponseRequest request]
    (-> this (.getIntegrationResponse request))))

(defn delete-domain-name
  "Description copied from interface: AmazonApiGateway

  request - A request to delete the DomainName resource. - `com.amazonaws.services.apigateway.model.DeleteDomainNameRequest`

  returns: Result of the DeleteDomainName operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteDomainNameResult`"
  (^com.amazonaws.services.apigateway.model.DeleteDomainNameResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.DeleteDomainNameRequest request]
    (-> this (.deleteDomainName request))))

(defn create-stage
  "Description copied from interface: AmazonApiGateway

  request - Requests API Gateway to create a Stage resource. - `com.amazonaws.services.apigateway.model.CreateStageRequest`

  returns: Result of the CreateStage operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateStageResult`"
  (^com.amazonaws.services.apigateway.model.CreateStageResult [^AbstractAmazonApiGateway this ^com.amazonaws.services.apigateway.model.CreateStageRequest request]
    (-> this (.createStage request))))

