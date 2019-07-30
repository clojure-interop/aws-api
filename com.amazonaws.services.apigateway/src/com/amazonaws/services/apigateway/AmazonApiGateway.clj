(ns com.amazonaws.services.apigateway.AmazonApiGateway
  "Interface for accessing Amazon API Gateway.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonApiGateway instead.


  Amazon API Gateway

  Amazon API Gateway helps developers deliver robust, secure, and scalable mobile and web application back ends. API
  Gateway allows developers to securely connect mobile and web applications to APIs that run on AWS Lambda, Amazon EC2,
  or other publicly addressable web services that are hosted outside of AWS."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.apigateway AmazonApiGateway]))

(defn delete-documentation-part
  "delete-documentation-part-request - Deletes an existing documentation part of an API. - `com.amazonaws.services.apigateway.model.DeleteDocumentationPartRequest`

  returns: Result of the DeleteDocumentationPart operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteDocumentationPartResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.DeleteDocumentationPartResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.DeleteDocumentationPartRequest delete-documentation-part-request]
    (-> this (.deleteDocumentationPart delete-documentation-part-request))))

(defn get-authorizers
  "Describe an existing Authorizers resource.

   AWS CLI

  get-authorizers-request - Request to describe an existing Authorizers resource. - `com.amazonaws.services.apigateway.model.GetAuthorizersRequest`

  returns: Result of the GetAuthorizers operation returned by the service. - `com.amazonaws.services.apigateway.model.GetAuthorizersResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.GetAuthorizersResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetAuthorizersRequest get-authorizers-request]
    (-> this (.getAuthorizers get-authorizers-request))))

(defn put-integration-response
  "Represents a put integration.

  put-integration-response-request - Represents a put integration response request. - `com.amazonaws.services.apigateway.model.PutIntegrationResponseRequest`

  returns: Result of the PutIntegrationResponse operation returned by the service. - `com.amazonaws.services.apigateway.model.PutIntegrationResponseResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.PutIntegrationResponseResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.PutIntegrationResponseRequest put-integration-response-request]
    (-> this (.putIntegrationResponse put-integration-response-request))))

(defn update-method-response
  "Updates an existing MethodResponse resource.

  update-method-response-request - A request to update an existing MethodResponse resource. - `com.amazonaws.services.apigateway.model.UpdateMethodResponseRequest`

  returns: Result of the UpdateMethodResponse operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateMethodResponseResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.UpdateMethodResponseResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateMethodResponseRequest update-method-response-request]
    (-> this (.updateMethodResponse update-method-response-request))))

(defn get-resources
  "Lists information about a collection of Resource resources.

  get-resources-request - Request to list information about a collection of resources. - `com.amazonaws.services.apigateway.model.GetResourcesRequest`

  returns: Result of the GetResources operation returned by the service. - `com.amazonaws.services.apigateway.model.GetResourcesResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.GetResourcesResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetResourcesRequest get-resources-request]
    (-> this (.getResources get-resources-request))))

(defn put-integration
  "Sets up a method's integration.

  put-integration-request - Sets up a method's integration. - `com.amazonaws.services.apigateway.model.PutIntegrationRequest`

  returns: Result of the PutIntegration operation returned by the service. - `com.amazonaws.services.apigateway.model.PutIntegrationResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.PutIntegrationResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.PutIntegrationRequest put-integration-request]
    (-> this (.putIntegration put-integration-request))))

(defn get-vpc-links
  "Gets the VpcLinks collection under the caller's account in a selected region.

  get-vpc-links-request - Gets the VpcLinks collection under the caller's account in a selected region. - `com.amazonaws.services.apigateway.model.GetVpcLinksRequest`

  returns: Result of the GetVpcLinks operation returned by the service. - `com.amazonaws.services.apigateway.model.GetVpcLinksResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.GetVpcLinksResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetVpcLinksRequest get-vpc-links-request]
    (-> this (.getVpcLinks get-vpc-links-request))))

(defn get-sdk-types
  "get-sdk-types-request - Get the SdkTypes collection. - `com.amazonaws.services.apigateway.model.GetSdkTypesRequest`

  returns: Result of the GetSdkTypes operation returned by the service. - `com.amazonaws.services.apigateway.model.GetSdkTypesResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetSdkTypesResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetSdkTypesRequest get-sdk-types-request]
    (-> this (.getSdkTypes get-sdk-types-request))))

(defn get-usage-plan-keys
  "Gets all the usage plan keys representing the API keys added to a specified usage plan.

  get-usage-plan-keys-request - The GET request to get all the usage plan keys representing the API keys added to a specified usage plan. - `com.amazonaws.services.apigateway.model.GetUsagePlanKeysRequest`

  returns: Result of the GetUsagePlanKeys operation returned by the service. - `com.amazonaws.services.apigateway.model.GetUsagePlanKeysResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.GetUsagePlanKeysResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetUsagePlanKeysRequest get-usage-plan-keys-request]
    (-> this (.getUsagePlanKeys get-usage-plan-keys-request))))

(defn delete-method
  "Deletes an existing Method resource.

  delete-method-request - Request to delete an existing Method resource. - `com.amazonaws.services.apigateway.model.DeleteMethodRequest`

  returns: Result of the DeleteMethod operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteMethodResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.DeleteMethodResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.DeleteMethodRequest delete-method-request]
    (-> this (.deleteMethod delete-method-request))))

(defn update-usage
  "Grants a temporary extension to the remaining quota of a usage plan associated with a specified API key.

  update-usage-request - The PATCH request to grant a temporary extension to the remaining quota of a usage plan associated with a specified API key. - `com.amazonaws.services.apigateway.model.UpdateUsageRequest`

  returns: Result of the UpdateUsage operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateUsageResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.UpdateUsageResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateUsageRequest update-usage-request]
    (-> this (.updateUsage update-usage-request))))

(defn delete-base-path-mapping
  "Deletes the BasePathMapping resource.

  delete-base-path-mapping-request - A request to delete the BasePathMapping resource. - `com.amazonaws.services.apigateway.model.DeleteBasePathMappingRequest`

  returns: Result of the DeleteBasePathMapping operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteBasePathMappingResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.DeleteBasePathMappingResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.DeleteBasePathMappingRequest delete-base-path-mapping-request]
    (-> this (.deleteBasePathMapping delete-base-path-mapping-request))))

(defn delete-client-certificate
  "Deletes the ClientCertificate resource.

  delete-client-certificate-request - A request to delete the ClientCertificate resource. - `com.amazonaws.services.apigateway.model.DeleteClientCertificateRequest`

  returns: Result of the DeleteClientCertificate operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteClientCertificateResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.DeleteClientCertificateResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.DeleteClientCertificateRequest delete-client-certificate-request]
    (-> this (.deleteClientCertificate delete-client-certificate-request))))

(defn get-usage-plan-key
  "Gets a usage plan key of a given key identifier.

  get-usage-plan-key-request - The GET request to get a usage plan key of a given key identifier. - `com.amazonaws.services.apigateway.model.GetUsagePlanKeyRequest`

  returns: Result of the GetUsagePlanKey operation returned by the service. - `com.amazonaws.services.apigateway.model.GetUsagePlanKeyResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.GetUsagePlanKeyResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetUsagePlanKeyRequest get-usage-plan-key-request]
    (-> this (.getUsagePlanKey get-usage-plan-key-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AmazonApiGateway this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn create-usage-plan
  "Creates a usage plan with the throttle and quota limits, as well as the associated API stages, specified in the
   payload.

  create-usage-plan-request - The POST request to create a usage plan with the name, description, throttle limits and quota limits, as well as the associated API stages, specified in the payload. - `com.amazonaws.services.apigateway.model.CreateUsagePlanRequest`

  returns: Result of the CreateUsagePlan operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateUsagePlanResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.CreateUsagePlanResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.CreateUsagePlanRequest create-usage-plan-request]
    (-> this (.createUsagePlan create-usage-plan-request))))

(defn get-documentation-version
  "get-documentation-version-request - Gets a documentation snapshot of an API. - `com.amazonaws.services.apigateway.model.GetDocumentationVersionRequest`

  returns: Result of the GetDocumentationVersion operation returned by the service. - `com.amazonaws.services.apigateway.model.GetDocumentationVersionResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetDocumentationVersionResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetDocumentationVersionRequest get-documentation-version-request]
    (-> this (.getDocumentationVersion get-documentation-version-request))))

(defn get-base-path-mappings
  "Represents a collection of BasePathMapping resources.

  get-base-path-mappings-request - A request to get information about a collection of BasePathMapping resources. - `com.amazonaws.services.apigateway.model.GetBasePathMappingsRequest`

  returns: Result of the GetBasePathMappings operation returned by the service. - `com.amazonaws.services.apigateway.model.GetBasePathMappingsResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetBasePathMappingsResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetBasePathMappingsRequest get-base-path-mappings-request]
    (-> this (.getBasePathMappings get-base-path-mappings-request))))

(defn get-resource
  "Lists information about a resource.

  get-resource-request - Request to list information about a resource. - `com.amazonaws.services.apigateway.model.GetResourceRequest`

  returns: Result of the GetResource operation returned by the service. - `com.amazonaws.services.apigateway.model.GetResourceResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetResourceResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetResourceRequest get-resource-request]
    (-> this (.getResource get-resource-request))))

(defn update-deployment
  "Changes information about a Deployment resource.

  update-deployment-request - Requests API Gateway to change information about a Deployment resource. - `com.amazonaws.services.apigateway.model.UpdateDeploymentRequest`

  returns: Result of the UpdateDeployment operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateDeploymentResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.UpdateDeploymentResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateDeploymentRequest update-deployment-request]
    (-> this (.updateDeployment update-deployment-request))))

(defn update-documentation-part
  "update-documentation-part-request - Updates an existing documentation part of a given API. - `com.amazonaws.services.apigateway.model.UpdateDocumentationPartRequest`

  returns: Result of the UpdateDocumentationPart operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateDocumentationPartResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.UpdateDocumentationPartResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateDocumentationPartRequest update-documentation-part-request]
    (-> this (.updateDocumentationPart update-documentation-part-request))))

(defn update-vpc-link
  "Updates an existing VpcLink of a specified identifier.

  update-vpc-link-request - Updates an existing VpcLink of a specified identifier. - `com.amazonaws.services.apigateway.model.UpdateVpcLinkRequest`

  returns: Result of the UpdateVpcLink operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateVpcLinkResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.UpdateVpcLinkResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateVpcLinkRequest update-vpc-link-request]
    (-> this (.updateVpcLink update-vpc-link-request))))

(defn update-resource
  "Changes information about a Resource resource.

  update-resource-request - Request to change information about a Resource resource. - `com.amazonaws.services.apigateway.model.UpdateResourceRequest`

  returns: Result of the UpdateResource operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateResourceResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.UpdateResourceResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateResourceRequest update-resource-request]
    (-> this (.updateResource update-resource-request))))

(defn create-base-path-mapping
  "Creates a new BasePathMapping resource.

  create-base-path-mapping-request - Requests API Gateway to create a new BasePathMapping resource. - `com.amazonaws.services.apigateway.model.CreateBasePathMappingRequest`

  returns: Result of the CreateBasePathMapping operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateBasePathMappingResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.CreateBasePathMappingResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.CreateBasePathMappingRequest create-base-path-mapping-request]
    (-> this (.createBasePathMapping create-base-path-mapping-request))))

(defn untag-resource
  "Removes a tag from a given resource.

  untag-resource-request - Removes a tag from a given resource. - `com.amazonaws.services.apigateway.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.apigateway.model.UntagResourceResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.UntagResourceResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn get-vpc-link
  "Gets a specified VPC link under the caller's account in a region.

  get-vpc-link-request - Gets a specified VPC link under the caller's account in a region. - `com.amazonaws.services.apigateway.model.GetVpcLinkRequest`

  returns: Result of the GetVpcLink operation returned by the service. - `com.amazonaws.services.apigateway.model.GetVpcLinkResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetVpcLinkResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetVpcLinkRequest get-vpc-link-request]
    (-> this (.getVpcLink get-vpc-link-request))))

(defn update-authorizer
  "Updates an existing Authorizer resource.

   AWS CLI

  update-authorizer-request - Request to update an existing Authorizer resource. - `com.amazonaws.services.apigateway.model.UpdateAuthorizerRequest`

  returns: Result of the UpdateAuthorizer operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateAuthorizerResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.UpdateAuthorizerResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateAuthorizerRequest update-authorizer-request]
    (-> this (.updateAuthorizer update-authorizer-request))))

(defn update-client-certificate
  "Changes information about an ClientCertificate resource.

  update-client-certificate-request - A request to change information about an ClientCertificate resource. - `com.amazonaws.services.apigateway.model.UpdateClientCertificateRequest`

  returns: Result of the UpdateClientCertificate operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateClientCertificateResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.UpdateClientCertificateResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateClientCertificateRequest update-client-certificate-request]
    (-> this (.updateClientCertificate update-client-certificate-request))))

(defn create-api-key
  "Create an ApiKey resource.

   AWS CLI

  create-api-key-request - Request to create an ApiKey resource. - `com.amazonaws.services.apigateway.model.CreateApiKeyRequest`

  returns: Result of the CreateApiKey operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateApiKeyResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.CreateApiKeyResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.CreateApiKeyRequest create-api-key-request]
    (-> this (.createApiKey create-api-key-request))))

(defn get-model-template
  "Generates a sample mapping template that can be used to transform a payload into the structure of a model.

  get-model-template-request - Request to generate a sample mapping template used to transform the payload. - `com.amazonaws.services.apigateway.model.GetModelTemplateRequest`

  returns: Result of the GetModelTemplate operation returned by the service. - `com.amazonaws.services.apigateway.model.GetModelTemplateResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetModelTemplateResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetModelTemplateRequest get-model-template-request]
    (-> this (.getModelTemplate get-model-template-request))))

(defn delete-api-key
  "Deletes the ApiKey resource.

  delete-api-key-request - A request to delete the ApiKey resource. - `com.amazonaws.services.apigateway.model.DeleteApiKeyRequest`

  returns: Result of the DeleteApiKey operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteApiKeyResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.DeleteApiKeyResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.DeleteApiKeyRequest delete-api-key-request]
    (-> this (.deleteApiKey delete-api-key-request))))

(defn get-api-keys
  "Gets information about the current ApiKeys resource.

  get-api-keys-request - A request to get information about the current ApiKeys resource. - `com.amazonaws.services.apigateway.model.GetApiKeysRequest`

  returns: Result of the GetApiKeys operation returned by the service. - `com.amazonaws.services.apigateway.model.GetApiKeysResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.GetApiKeysResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetApiKeysRequest get-api-keys-request]
    (-> this (.getApiKeys get-api-keys-request))))

(defn get-client-certificates
  "Gets a collection of ClientCertificate resources.

  get-client-certificates-request - A request to get information about a collection of ClientCertificate resources. - `com.amazonaws.services.apigateway.model.GetClientCertificatesRequest`

  returns: Result of the GetClientCertificates operation returned by the service. - `com.amazonaws.services.apigateway.model.GetClientCertificatesResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.GetClientCertificatesResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetClientCertificatesRequest get-client-certificates-request]
    (-> this (.getClientCertificates get-client-certificates-request))))

(defn delete-stage
  "Deletes a Stage resource.

  delete-stage-request - Requests API Gateway to delete a Stage resource. - `com.amazonaws.services.apigateway.model.DeleteStageRequest`

  returns: Result of the DeleteStage operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteStageResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.DeleteStageResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.DeleteStageRequest delete-stage-request]
    (-> this (.deleteStage delete-stage-request))))

(defn test-invoke-method
  "Simulate the execution of a Method in your RestApi with headers, parameters, and an incoming
   request body.

  test-invoke-method-request - Make a request to simulate the execution of a Method. - `com.amazonaws.services.apigateway.model.TestInvokeMethodRequest`

  returns: Result of the TestInvokeMethod operation returned by the service. - `com.amazonaws.services.apigateway.model.TestInvokeMethodResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.TestInvokeMethodResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.TestInvokeMethodRequest test-invoke-method-request]
    (-> this (.testInvokeMethod test-invoke-method-request))))

(defn update-gateway-response
  "Updates a GatewayResponse of a specified response type on the given RestApi.

  update-gateway-response-request - Updates a GatewayResponse of a specified response type on the given RestApi. - `com.amazonaws.services.apigateway.model.UpdateGatewayResponseRequest`

  returns: Result of the UpdateGatewayResponse operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateGatewayResponseResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.UpdateGatewayResponseResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateGatewayResponseRequest update-gateway-response-request]
    (-> this (.updateGatewayResponse update-gateway-response-request))))

(defn get-export
  "Exports a deployed version of a RestApi in a specified format.

  get-export-request - Request a new export of a RestApi for a particular Stage. - `com.amazonaws.services.apigateway.model.GetExportRequest`

  returns: Result of the GetExport operation returned by the service. - `com.amazonaws.services.apigateway.model.GetExportResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetExportResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetExportRequest get-export-request]
    (-> this (.getExport get-export-request))))

(defn update-method
  "Updates an existing Method resource.

  update-method-request - Request to update an existing Method resource. - `com.amazonaws.services.apigateway.model.UpdateMethodRequest`

  returns: Result of the UpdateMethod operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateMethodResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.UpdateMethodResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateMethodRequest update-method-request]
    (-> this (.updateMethod update-method-request))))

(defn get-client-certificate
  "Gets information about the current ClientCertificate resource.

  get-client-certificate-request - A request to get information about the current ClientCertificate resource. - `com.amazonaws.services.apigateway.model.GetClientCertificateRequest`

  returns: Result of the GetClientCertificate operation returned by the service. - `com.amazonaws.services.apigateway.model.GetClientCertificateResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetClientCertificateResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetClientCertificateRequest get-client-certificate-request]
    (-> this (.getClientCertificate get-client-certificate-request))))

(defn get-sdk
  "Generates a client SDK for a RestApi and Stage.

  get-sdk-request - Request a new generated client SDK for a RestApi and Stage. - `com.amazonaws.services.apigateway.model.GetSdkRequest`

  returns: Result of the GetSdk operation returned by the service. - `com.amazonaws.services.apigateway.model.GetSdkResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetSdkResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetSdkRequest get-sdk-request]
    (-> this (.getSdk get-sdk-request))))

(defn get-deployment
  "Gets information about a Deployment resource.

  get-deployment-request - Requests API Gateway to get information about a Deployment resource. - `com.amazonaws.services.apigateway.model.GetDeploymentRequest`

  returns: Result of the GetDeployment operation returned by the service. - `com.amazonaws.services.apigateway.model.GetDeploymentResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetDeploymentResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetDeploymentRequest get-deployment-request]
    (-> this (.getDeployment get-deployment-request))))

(defn get-stages
  "Gets information about one or more Stage resources.

  get-stages-request - Requests API Gateway to get information about one or more Stage resources. - `com.amazonaws.services.apigateway.model.GetStagesRequest`

  returns: Result of the GetStages operation returned by the service. - `com.amazonaws.services.apigateway.model.GetStagesResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetStagesResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetStagesRequest get-stages-request]
    (-> this (.getStages get-stages-request))))

(defn get-gateway-response
  "Gets a GatewayResponse of a specified response type on the given RestApi.

  get-gateway-response-request - Gets a GatewayResponse of a specified response type on the given RestApi. - `com.amazonaws.services.apigateway.model.GetGatewayResponseRequest`

  returns: Result of the GetGatewayResponse operation returned by the service. - `com.amazonaws.services.apigateway.model.GetGatewayResponseResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetGatewayResponseResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetGatewayResponseRequest get-gateway-response-request]
    (-> this (.getGatewayResponse get-gateway-response-request))))

(defn delete-integration
  "Represents a delete integration.

  delete-integration-request - Represents a delete integration request. - `com.amazonaws.services.apigateway.model.DeleteIntegrationRequest`

  returns: Result of the DeleteIntegration operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteIntegrationResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.DeleteIntegrationResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.DeleteIntegrationRequest delete-integration-request]
    (-> this (.deleteIntegration delete-integration-request))))

(defn delete-usage-plan-key
  "Deletes a usage plan key and remove the underlying API key from the associated usage plan.

  delete-usage-plan-key-request - The DELETE request to delete a usage plan key and remove the underlying API key from the associated usage plan. - `com.amazonaws.services.apigateway.model.DeleteUsagePlanKeyRequest`

  returns: Result of the DeleteUsagePlanKey operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteUsagePlanKeyResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.DeleteUsagePlanKeyResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.DeleteUsagePlanKeyRequest delete-usage-plan-key-request]
    (-> this (.deleteUsagePlanKey delete-usage-plan-key-request))))

(defn delete-request-validator
  "Deletes a RequestValidator of a given RestApi.

  delete-request-validator-request - Deletes a specified RequestValidator of a given RestApi. - `com.amazonaws.services.apigateway.model.DeleteRequestValidatorRequest`

  returns: Result of the DeleteRequestValidator operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteRequestValidatorResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.DeleteRequestValidatorResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.DeleteRequestValidatorRequest delete-request-validator-request]
    (-> this (.deleteRequestValidator delete-request-validator-request))))

(defn delete-method-response
  "Deletes an existing MethodResponse resource.

  delete-method-response-request - A request to delete an existing MethodResponse resource. - `com.amazonaws.services.apigateway.model.DeleteMethodResponseRequest`

  returns: Result of the DeleteMethodResponse operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteMethodResponseResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.DeleteMethodResponseResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.DeleteMethodResponseRequest delete-method-response-request]
    (-> this (.deleteMethodResponse delete-method-response-request))))

(defn import-rest-api
  "A feature of the API Gateway control service for creating a new API from an external API definition file.

  import-rest-api-request - A POST request to import an API to API Gateway using an input of an API definition file. - `com.amazonaws.services.apigateway.model.ImportRestApiRequest`

  returns: Result of the ImportRestApi operation returned by the service. - `com.amazonaws.services.apigateway.model.ImportRestApiResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.ImportRestApiResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.ImportRestApiRequest import-rest-api-request]
    (-> this (.importRestApi import-rest-api-request))))

(defn create-deployment
  "Creates a Deployment resource, which makes a specified RestApi callable over the internet.

  create-deployment-request - Requests API Gateway to create a Deployment resource. - `com.amazonaws.services.apigateway.model.CreateDeploymentRequest`

  returns: Result of the CreateDeployment operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateDeploymentResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.CreateDeploymentResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.CreateDeploymentRequest create-deployment-request]
    (-> this (.createDeployment create-deployment-request))))

(defn create-resource
  "Creates a Resource resource.

  create-resource-request - Requests API Gateway to create a Resource resource. - `com.amazonaws.services.apigateway.model.CreateResourceRequest`

  returns: Result of the CreateResource operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateResourceResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.CreateResourceResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.CreateResourceRequest create-resource-request]
    (-> this (.createResource create-resource-request))))

(defn update-base-path-mapping
  "Changes information about the BasePathMapping resource.

  update-base-path-mapping-request - A request to change information about the BasePathMapping resource. - `com.amazonaws.services.apigateway.model.UpdateBasePathMappingRequest`

  returns: Result of the UpdateBasePathMapping operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateBasePathMappingResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.UpdateBasePathMappingResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateBasePathMappingRequest update-base-path-mapping-request]
    (-> this (.updateBasePathMapping update-base-path-mapping-request))))

(defn generate-client-certificate
  "Generates a ClientCertificate resource.

  generate-client-certificate-request - A request to generate a ClientCertificate resource. - `com.amazonaws.services.apigateway.model.GenerateClientCertificateRequest`

  returns: Result of the GenerateClientCertificate operation returned by the service. - `com.amazonaws.services.apigateway.model.GenerateClientCertificateResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GenerateClientCertificateResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GenerateClientCertificateRequest generate-client-certificate-request]
    (-> this (.generateClientCertificate generate-client-certificate-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonApiGateway this]
    (-> this (.shutdown))))

(defn get-models
  "Describes existing Models defined for a RestApi resource.

  get-models-request - Request to list existing Models defined for a RestApi resource. - `com.amazonaws.services.apigateway.model.GetModelsRequest`

  returns: Result of the GetModels operation returned by the service. - `com.amazonaws.services.apigateway.model.GetModelsResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.GetModelsResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetModelsRequest get-models-request]
    (-> this (.getModels get-models-request))))

(defn get-sdk-type
  "get-sdk-type-request - Get an SdkType instance. - `com.amazonaws.services.apigateway.model.GetSdkTypeRequest`

  returns: Result of the GetSdkType operation returned by the service. - `com.amazonaws.services.apigateway.model.GetSdkTypeResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetSdkTypeResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetSdkTypeRequest get-sdk-type-request]
    (-> this (.getSdkType get-sdk-type-request))))

(defn create-model
  "Adds a new Model resource to an existing RestApi resource.

  create-model-request - Request to add a new Model to an existing RestApi resource. - `com.amazonaws.services.apigateway.model.CreateModelRequest`

  returns: Result of the CreateModel operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateModelResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.CreateModelResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.CreateModelRequest create-model-request]
    (-> this (.createModel create-model-request))))

(defn put-rest-api
  "A feature of the API Gateway control service for updating an existing API with an input of external API
   definitions. The update can take the form of merging the supplied definition into the existing API or overwriting
   the existing API.

  put-rest-api-request - A PUT request to update an existing API, with external API definitions specified as the request body. - `com.amazonaws.services.apigateway.model.PutRestApiRequest`

  returns: Result of the PutRestApi operation returned by the service. - `com.amazonaws.services.apigateway.model.PutRestApiResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.PutRestApiResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.PutRestApiRequest put-rest-api-request]
    (-> this (.putRestApi put-rest-api-request))))

(defn create-domain-name
  "Creates a new domain name.

  create-domain-name-request - A request to create a new domain name. - `com.amazonaws.services.apigateway.model.CreateDomainNameRequest`

  returns: Result of the CreateDomainName operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateDomainNameResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.CreateDomainNameResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.CreateDomainNameRequest create-domain-name-request]
    (-> this (.createDomainName create-domain-name-request))))

(defn test-invoke-authorizer
  "Simulate the execution of an Authorizer in your RestApi with headers, parameters, and an incoming
   request body.

    Use
   Lambda Function as Authorizer Use
   Cognito User Pool as Authorizer

  test-invoke-authorizer-request - Make a request to simulate the execution of an Authorizer. - `com.amazonaws.services.apigateway.model.TestInvokeAuthorizerRequest`

  returns: Result of the TestInvokeAuthorizer operation returned by the service. - `com.amazonaws.services.apigateway.model.TestInvokeAuthorizerResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.TestInvokeAuthorizerResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.TestInvokeAuthorizerRequest test-invoke-authorizer-request]
    (-> this (.testInvokeAuthorizer test-invoke-authorizer-request))))

(defn get-usage
  "Gets the usage data of a usage plan in a specified time interval.

  get-usage-request - The GET request to get the usage data of a usage plan in a specified time interval. - `com.amazonaws.services.apigateway.model.GetUsageRequest`

  returns: Result of the GetUsage operation returned by the service. - `com.amazonaws.services.apigateway.model.GetUsageResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.GetUsageResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetUsageRequest get-usage-request]
    (-> this (.getUsage get-usage-request))))

(defn create-vpc-link
  "Creates a VPC link, under the caller's account in a selected region, in an asynchronous operation that typically
   takes 2-4 minutes to complete and become operational. The caller must have permissions to create and update VPC
   Endpoint services.

  create-vpc-link-request - Creates a VPC link, under the caller's account in a selected region, in an asynchronous operation that typically takes 2-4 minutes to complete and become operational. The caller must have permissions to create and update VPC Endpoint services. - `com.amazonaws.services.apigateway.model.CreateVpcLinkRequest`

  returns: Result of the CreateVpcLink operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateVpcLinkResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.CreateVpcLinkResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.CreateVpcLinkRequest create-vpc-link-request]
    (-> this (.createVpcLink create-vpc-link-request))))

(defn delete-gateway-response
  "Clears any customization of a GatewayResponse of a specified response type on the given RestApi and
   resets it with the default settings.

  delete-gateway-response-request - Clears any customization of a GatewayResponse of a specified response type on the given RestApi and resets it with the default settings. - `com.amazonaws.services.apigateway.model.DeleteGatewayResponseRequest`

  returns: Result of the DeleteGatewayResponse operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteGatewayResponseResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.DeleteGatewayResponseResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.DeleteGatewayResponseRequest delete-gateway-response-request]
    (-> this (.deleteGatewayResponse delete-gateway-response-request))))

(defn delete-usage-plan
  "Deletes a usage plan of a given plan Id.

  delete-usage-plan-request - The DELETE request to delete a usage plan of a given plan Id. - `com.amazonaws.services.apigateway.model.DeleteUsagePlanRequest`

  returns: Result of the DeleteUsagePlan operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteUsagePlanResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.DeleteUsagePlanResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.DeleteUsagePlanRequest delete-usage-plan-request]
    (-> this (.deleteUsagePlan delete-usage-plan-request))))

(defn create-request-validator
  "Creates a ReqeustValidator of a given RestApi.

  create-request-validator-request - Creates a RequestValidator of a given RestApi. - `com.amazonaws.services.apigateway.model.CreateRequestValidatorRequest`

  returns: Result of the CreateRequestValidator operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateRequestValidatorResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.CreateRequestValidatorResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.CreateRequestValidatorRequest create-request-validator-request]
    (-> this (.createRequestValidator create-request-validator-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"apigateway.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://apigateway.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AmazonApiGateway this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn get-authorizer
  "Describe an existing Authorizer resource.

   AWS CLI

  get-authorizer-request - Request to describe an existing Authorizer resource. - `com.amazonaws.services.apigateway.model.GetAuthorizerRequest`

  returns: Result of the GetAuthorizer operation returned by the service. - `com.amazonaws.services.apigateway.model.GetAuthorizerResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetAuthorizerResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetAuthorizerRequest get-authorizer-request]
    (-> this (.getAuthorizer get-authorizer-request))))

(defn update-stage
  "Changes information about a Stage resource.

  update-stage-request - Requests API Gateway to change information about a Stage resource. - `com.amazonaws.services.apigateway.model.UpdateStageRequest`

  returns: Result of the UpdateStage operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateStageResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.UpdateStageResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateStageRequest update-stage-request]
    (-> this (.updateStage update-stage-request))))

(defn get-usage-plan
  "Gets a usage plan of a given plan identifier.

  get-usage-plan-request - The GET request to get a usage plan of a given plan identifier. - `com.amazonaws.services.apigateway.model.GetUsagePlanRequest`

  returns: Result of the GetUsagePlan operation returned by the service. - `com.amazonaws.services.apigateway.model.GetUsagePlanResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.GetUsagePlanResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetUsagePlanRequest get-usage-plan-request]
    (-> this (.getUsagePlan get-usage-plan-request))))

(defn update-domain-name
  "Changes information about the DomainName resource.

  update-domain-name-request - A request to change information about the DomainName resource. - `com.amazonaws.services.apigateway.model.UpdateDomainNameRequest`

  returns: Result of the UpdateDomainName operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateDomainNameResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.UpdateDomainNameResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateDomainNameRequest update-domain-name-request]
    (-> this (.updateDomainName update-domain-name-request))))

(defn flush-stage-authorizers-cache
  "Flushes all authorizer cache entries on a stage.

  flush-stage-authorizers-cache-request - Request to flush authorizer cache entries on a specified stage. - `com.amazonaws.services.apigateway.model.FlushStageAuthorizersCacheRequest`

  returns: Result of the FlushStageAuthorizersCache operation returned by the service. - `com.amazonaws.services.apigateway.model.FlushStageAuthorizersCacheResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.FlushStageAuthorizersCacheResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.FlushStageAuthorizersCacheRequest flush-stage-authorizers-cache-request]
    (-> this (.flushStageAuthorizersCache flush-stage-authorizers-cache-request))))

(defn get-documentation-part
  "get-documentation-part-request - Gets a specified documentation part of a given API. - `com.amazonaws.services.apigateway.model.GetDocumentationPartRequest`

  returns: Result of the GetDocumentationPart operation returned by the service. - `com.amazonaws.services.apigateway.model.GetDocumentationPartResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetDocumentationPartResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetDocumentationPartRequest get-documentation-part-request]
    (-> this (.getDocumentationPart get-documentation-part-request))))

(defn get-tags
  "Gets the Tags collection for a given resource.

  get-tags-request - Gets the Tags collection for a given resource. - `com.amazonaws.services.apigateway.model.GetTagsRequest`

  returns: Result of the GetTags operation returned by the service. - `com.amazonaws.services.apigateway.model.GetTagsResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.GetTagsResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetTagsRequest get-tags-request]
    (-> this (.getTags get-tags-request))))

(defn get-method-response
  "Describes a MethodResponse resource.

  get-method-response-request - Request to describe a MethodResponse resource. - `com.amazonaws.services.apigateway.model.GetMethodResponseRequest`

  returns: Result of the GetMethodResponse operation returned by the service. - `com.amazonaws.services.apigateway.model.GetMethodResponseResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetMethodResponseResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetMethodResponseRequest get-method-response-request]
    (-> this (.getMethodResponse get-method-response-request))))

(defn get-domain-name
  "Represents a domain name that is contained in a simpler, more intuitive URL that can be called.

  get-domain-name-request - Request to get the name of a DomainName resource. - `com.amazonaws.services.apigateway.model.GetDomainNameRequest`

  returns: Result of the GetDomainName operation returned by the service. - `com.amazonaws.services.apigateway.model.GetDomainNameResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetDomainNameResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetDomainNameRequest get-domain-name-request]
    (-> this (.getDomainName get-domain-name-request))))

(defn get-base-path-mapping
  "Describe a BasePathMapping resource.

  get-base-path-mapping-request - Request to describe a BasePathMapping resource. - `com.amazonaws.services.apigateway.model.GetBasePathMappingRequest`

  returns: Result of the GetBasePathMapping operation returned by the service. - `com.amazonaws.services.apigateway.model.GetBasePathMappingResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetBasePathMappingResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetBasePathMappingRequest get-base-path-mapping-request]
    (-> this (.getBasePathMapping get-base-path-mapping-request))))

(defn update-api-key
  "Changes information about an ApiKey resource.

  update-api-key-request - A request to change information about an ApiKey resource. - `com.amazonaws.services.apigateway.model.UpdateApiKeyRequest`

  returns: Result of the UpdateApiKey operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateApiKeyResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.UpdateApiKeyResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateApiKeyRequest update-api-key-request]
    (-> this (.updateApiKey update-api-key-request))))

(defn get-request-validators
  "Gets the RequestValidators collection of a given RestApi.

  get-request-validators-request - Gets the RequestValidators collection of a given RestApi. - `com.amazonaws.services.apigateway.model.GetRequestValidatorsRequest`

  returns: Result of the GetRequestValidators operation returned by the service. - `com.amazonaws.services.apigateway.model.GetRequestValidatorsResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.GetRequestValidatorsResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetRequestValidatorsRequest get-request-validators-request]
    (-> this (.getRequestValidators get-request-validators-request))))

(defn get-api-key
  "Gets information about the current ApiKey resource.

  get-api-key-request - A request to get information about the current ApiKey resource. - `com.amazonaws.services.apigateway.model.GetApiKeyRequest`

  returns: Result of the GetApiKey operation returned by the service. - `com.amazonaws.services.apigateway.model.GetApiKeyResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetApiKeyResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetApiKeyRequest get-api-key-request]
    (-> this (.getApiKey get-api-key-request))))

(defn delete-documentation-version
  "delete-documentation-version-request - Deletes an existing documentation version of an API. - `com.amazonaws.services.apigateway.model.DeleteDocumentationVersionRequest`

  returns: Result of the DeleteDocumentationVersion operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteDocumentationVersionResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.DeleteDocumentationVersionResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.DeleteDocumentationVersionRequest delete-documentation-version-request]
    (-> this (.deleteDocumentationVersion delete-documentation-version-request))))

(defn delete-model
  "Deletes a model.

  delete-model-request - Request to delete an existing model in an existing RestApi resource. - `com.amazonaws.services.apigateway.model.DeleteModelRequest`

  returns: Result of the DeleteModel operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteModelResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.DeleteModelResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.DeleteModelRequest delete-model-request]
    (-> this (.deleteModel delete-model-request))))

(defn update-integration-response
  "Represents an update integration response.

  update-integration-response-request - Represents an update integration response request. - `com.amazonaws.services.apigateway.model.UpdateIntegrationResponseRequest`

  returns: Result of the UpdateIntegrationResponse operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateIntegrationResponseResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.UpdateIntegrationResponseResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateIntegrationResponseRequest update-integration-response-request]
    (-> this (.updateIntegrationResponse update-integration-response-request))))

(defn delete-resource
  "Deletes a Resource resource.

  delete-resource-request - Request to delete a Resource. - `com.amazonaws.services.apigateway.model.DeleteResourceRequest`

  returns: Result of the DeleteResource operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteResourceResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.DeleteResourceResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.DeleteResourceRequest delete-resource-request]
    (-> this (.deleteResource delete-resource-request))))

(defn update-documentation-version
  "update-documentation-version-request - Updates an existing documentation version of an API. - `com.amazonaws.services.apigateway.model.UpdateDocumentationVersionRequest`

  returns: Result of the UpdateDocumentationVersion operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateDocumentationVersionResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.UpdateDocumentationVersionResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateDocumentationVersionRequest update-documentation-version-request]
    (-> this (.updateDocumentationVersion update-documentation-version-request))))

(defn put-gateway-response
  "Creates a customization of a GatewayResponse of a specified response type and status code on the given
   RestApi.

  put-gateway-response-request - Creates a customization of a GatewayResponse of a specified response type and status code on the given RestApi. - `com.amazonaws.services.apigateway.model.PutGatewayResponseRequest`

  returns: Result of the PutGatewayResponse operation returned by the service. - `com.amazonaws.services.apigateway.model.PutGatewayResponseResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.PutGatewayResponseResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.PutGatewayResponseRequest put-gateway-response-request]
    (-> this (.putGatewayResponse put-gateway-response-request))))

(defn import-documentation-parts
  "import-documentation-parts-request - Import documentation parts from an external (e.g., OpenAPI) definition file. - `com.amazonaws.services.apigateway.model.ImportDocumentationPartsRequest`

  returns: Result of the ImportDocumentationParts operation returned by the service. - `com.amazonaws.services.apigateway.model.ImportDocumentationPartsResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.ImportDocumentationPartsResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.ImportDocumentationPartsRequest import-documentation-parts-request]
    (-> this (.importDocumentationParts import-documentation-parts-request))))

(defn delete-vpc-link
  "Deletes an existing VpcLink of a specified identifier.

  delete-vpc-link-request - Deletes an existing VpcLink of a specified identifier. - `com.amazonaws.services.apigateway.model.DeleteVpcLinkRequest`

  returns: Result of the DeleteVpcLink operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteVpcLinkResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.DeleteVpcLinkResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.DeleteVpcLinkRequest delete-vpc-link-request]
    (-> this (.deleteVpcLink delete-vpc-link-request))))

(defn get-documentation-parts
  "get-documentation-parts-request - Gets the documentation parts of an API. The result may be filtered by the type, name, or path of API entities (targets). - `com.amazonaws.services.apigateway.model.GetDocumentationPartsRequest`

  returns: Result of the GetDocumentationParts operation returned by the service. - `com.amazonaws.services.apigateway.model.GetDocumentationPartsResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.GetDocumentationPartsResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetDocumentationPartsRequest get-documentation-parts-request]
    (-> this (.getDocumentationParts get-documentation-parts-request))))

(defn update-request-validator
  "Updates a RequestValidator of a given RestApi.

  update-request-validator-request - Updates a RequestValidator of a given RestApi. - `com.amazonaws.services.apigateway.model.UpdateRequestValidatorRequest`

  returns: Result of the UpdateRequestValidator operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateRequestValidatorResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.UpdateRequestValidatorResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateRequestValidatorRequest update-request-validator-request]
    (-> this (.updateRequestValidator update-request-validator-request))))

(defn create-documentation-part
  "create-documentation-part-request - Creates a new documentation part of a given API. - `com.amazonaws.services.apigateway.model.CreateDocumentationPartRequest`

  returns: Result of the CreateDocumentationPart operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateDocumentationPartResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.CreateDocumentationPartResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.CreateDocumentationPartRequest create-documentation-part-request]
    (-> this (.createDocumentationPart create-documentation-part-request))))

(defn get-account
  "Gets information about the current Account resource.

  get-account-request - Requests API Gateway to get information about the current Account resource. - `com.amazonaws.services.apigateway.model.GetAccountRequest`

  returns: Result of the GetAccount operation returned by the service. - `com.amazonaws.services.apigateway.model.GetAccountResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetAccountResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetAccountRequest get-account-request]
    (-> this (.getAccount get-account-request))))

(defn update-account
  "Changes information about the current Account resource.

  update-account-request - Requests API Gateway to change information about the current Account resource. - `com.amazonaws.services.apigateway.model.UpdateAccountRequest`

  returns: Result of the UpdateAccount operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateAccountResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.UpdateAccountResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateAccountRequest update-account-request]
    (-> this (.updateAccount update-account-request))))

(defn get-method
  "Describe an existing Method resource.

  get-method-request - Request to describe an existing Method resource. - `com.amazonaws.services.apigateway.model.GetMethodRequest`

  returns: Result of the GetMethod operation returned by the service. - `com.amazonaws.services.apigateway.model.GetMethodResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetMethodResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetMethodRequest get-method-request]
    (-> this (.getMethod get-method-request))))

(defn create-documentation-version
  "create-documentation-version-request - Creates a new documentation version of a given API. - `com.amazonaws.services.apigateway.model.CreateDocumentationVersionRequest`

  returns: Result of the CreateDocumentationVersion operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateDocumentationVersionResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.CreateDocumentationVersionResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.CreateDocumentationVersionRequest create-documentation-version-request]
    (-> this (.createDocumentationVersion create-documentation-version-request))))

(defn get-gateway-responses
  "Gets the GatewayResponses collection on the given RestApi. If an API developer has not added any
   definitions for gateway responses, the result will be the API Gateway-generated default GatewayResponses
   collection for the supported response types.

  get-gateway-responses-request - Gets the GatewayResponses collection on the given RestApi. If an API developer has not added any definitions for gateway responses, the result will be the API Gateway-generated default GatewayResponses collection for the supported response types. - `com.amazonaws.services.apigateway.model.GetGatewayResponsesRequest`

  returns: Result of the GetGatewayResponses operation returned by the service. - `com.amazonaws.services.apigateway.model.GetGatewayResponsesResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.GetGatewayResponsesResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetGatewayResponsesRequest get-gateway-responses-request]
    (-> this (.getGatewayResponses get-gateway-responses-request))))

(defn get-domain-names
  "Represents a collection of DomainName resources.

  get-domain-names-request - Request to describe a collection of DomainName resources. - `com.amazonaws.services.apigateway.model.GetDomainNamesRequest`

  returns: Result of the GetDomainNames operation returned by the service. - `com.amazonaws.services.apigateway.model.GetDomainNamesResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.GetDomainNamesResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetDomainNamesRequest get-domain-names-request]
    (-> this (.getDomainNames get-domain-names-request))))

(defn update-integration
  "Represents an update integration.

  update-integration-request - Represents an update integration request. - `com.amazonaws.services.apigateway.model.UpdateIntegrationRequest`

  returns: Result of the UpdateIntegration operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateIntegrationResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.UpdateIntegrationResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateIntegrationRequest update-integration-request]
    (-> this (.updateIntegration update-integration-request))))

(defn update-model
  "Changes information about a model.

  update-model-request - Request to update an existing model in an existing RestApi resource. - `com.amazonaws.services.apigateway.model.UpdateModelRequest`

  returns: Result of the UpdateModel operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateModelResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.UpdateModelResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateModelRequest update-model-request]
    (-> this (.updateModel update-model-request))))

(defn update-rest-api
  "Changes information about the specified API.

  update-rest-api-request - Request to update an existing RestApi resource in your collection. - `com.amazonaws.services.apigateway.model.UpdateRestApiRequest`

  returns: Result of the UpdateRestApi operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateRestApiResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.UpdateRestApiResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateRestApiRequest update-rest-api-request]
    (-> this (.updateRestApi update-rest-api-request))))

(defn create-authorizer
  "Adds a new Authorizer resource to an existing RestApi resource.

   AWS CLI

  create-authorizer-request - Request to add a new Authorizer to an existing RestApi resource. - `com.amazonaws.services.apigateway.model.CreateAuthorizerRequest`

  returns: Result of the CreateAuthorizer operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateAuthorizerResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.CreateAuthorizerResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.CreateAuthorizerRequest create-authorizer-request]
    (-> this (.createAuthorizer create-authorizer-request))))

(defn delete-deployment
  "Deletes a Deployment resource. Deleting a deployment will only succeed if there are no Stage
   resources associated with it.

  delete-deployment-request - Requests API Gateway to delete a Deployment resource. - `com.amazonaws.services.apigateway.model.DeleteDeploymentRequest`

  returns: Result of the DeleteDeployment operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteDeploymentResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.DeleteDeploymentResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.DeleteDeploymentRequest delete-deployment-request]
    (-> this (.deleteDeployment delete-deployment-request))))

(defn delete-rest-api
  "Deletes the specified API.

  delete-rest-api-request - Request to delete the specified API from your collection. - `com.amazonaws.services.apigateway.model.DeleteRestApiRequest`

  returns: Result of the DeleteRestApi operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteRestApiResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.DeleteRestApiResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.DeleteRestApiRequest delete-rest-api-request]
    (-> this (.deleteRestApi delete-rest-api-request))))

(defn get-rest-apis
  "Lists the RestApis resources for your collection.

  get-rest-apis-request - The GET request to list existing RestApis defined for your collection. - `com.amazonaws.services.apigateway.model.GetRestApisRequest`

  returns: Result of the GetRestApis operation returned by the service. - `com.amazonaws.services.apigateway.model.GetRestApisResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.GetRestApisResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetRestApisRequest get-rest-apis-request]
    (-> this (.getRestApis get-rest-apis-request))))

(defn get-model
  "Describes an existing model defined for a RestApi resource.

  get-model-request - Request to list information about a model in an existing RestApi resource. - `com.amazonaws.services.apigateway.model.GetModelRequest`

  returns: Result of the GetModel operation returned by the service. - `com.amazonaws.services.apigateway.model.GetModelResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetModelResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetModelRequest get-model-request]
    (-> this (.getModel get-model-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonApiGateway this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-documentation-versions
  "get-documentation-versions-request - Gets the documentation versions of an API. - `com.amazonaws.services.apigateway.model.GetDocumentationVersionsRequest`

  returns: Result of the GetDocumentationVersions operation returned by the service. - `com.amazonaws.services.apigateway.model.GetDocumentationVersionsResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.GetDocumentationVersionsResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetDocumentationVersionsRequest get-documentation-versions-request]
    (-> this (.getDocumentationVersions get-documentation-versions-request))))

(defn get-deployments
  "Gets information about a Deployments collection.

  get-deployments-request - Requests API Gateway to get information about a Deployments collection. - `com.amazonaws.services.apigateway.model.GetDeploymentsRequest`

  returns: Result of the GetDeployments operation returned by the service. - `com.amazonaws.services.apigateway.model.GetDeploymentsResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.GetDeploymentsResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetDeploymentsRequest get-deployments-request]
    (-> this (.getDeployments get-deployments-request))))

(defn get-rest-api
  "Lists the RestApi resource in the collection.

  get-rest-api-request - The GET request to list an existing RestApi defined for your collection. - `com.amazonaws.services.apigateway.model.GetRestApiRequest`

  returns: Result of the GetRestApi operation returned by the service. - `com.amazonaws.services.apigateway.model.GetRestApiResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetRestApiResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetRestApiRequest get-rest-api-request]
    (-> this (.getRestApi get-rest-api-request))))

(defn flush-stage-cache
  "Flushes a stage's cache.

  flush-stage-cache-request - Requests API Gateway to flush a stage's cache. - `com.amazonaws.services.apigateway.model.FlushStageCacheRequest`

  returns: Result of the FlushStageCache operation returned by the service. - `com.amazonaws.services.apigateway.model.FlushStageCacheResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.FlushStageCacheResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.FlushStageCacheRequest flush-stage-cache-request]
    (-> this (.flushStageCache flush-stage-cache-request))))

(defn update-usage-plan
  "Updates a usage plan of a given plan Id.

  update-usage-plan-request - The PATCH request to update a usage plan of a given plan Id. - `com.amazonaws.services.apigateway.model.UpdateUsagePlanRequest`

  returns: Result of the UpdateUsagePlan operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateUsagePlanResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.UpdateUsagePlanResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.UpdateUsagePlanRequest update-usage-plan-request]
    (-> this (.updateUsagePlan update-usage-plan-request))))

(defn tag-resource
  "Adds or updates a tag on a given resource.

  tag-resource-request - Adds or updates a tag on a given resource. - `com.amazonaws.services.apigateway.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.apigateway.model.TagResourceResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.TagResourceResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

(defn delete-authorizer
  "Deletes an existing Authorizer resource.

   AWS CLI

  delete-authorizer-request - Request to delete an existing Authorizer resource. - `com.amazonaws.services.apigateway.model.DeleteAuthorizerRequest`

  returns: Result of the DeleteAuthorizer operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteAuthorizerResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.DeleteAuthorizerResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.DeleteAuthorizerRequest delete-authorizer-request]
    (-> this (.deleteAuthorizer delete-authorizer-request))))

(defn create-usage-plan-key
  "Creates a usage plan key for adding an existing API key to a usage plan.

  create-usage-plan-key-request - The POST request to create a usage plan key for adding an existing API key to a usage plan. - `com.amazonaws.services.apigateway.model.CreateUsagePlanKeyRequest`

  returns: Result of the CreateUsagePlanKey operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateUsagePlanKeyResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.CreateUsagePlanKeyResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.CreateUsagePlanKeyRequest create-usage-plan-key-request]
    (-> this (.createUsagePlanKey create-usage-plan-key-request))))

(defn import-api-keys
  "Import API keys from an external source, such as a CSV-formatted file.

  import-api-keys-request - The POST request to import API keys from an external source, such as a CSV-formatted file. - `com.amazonaws.services.apigateway.model.ImportApiKeysRequest`

  returns: Result of the ImportApiKeys operation returned by the service. - `com.amazonaws.services.apigateway.model.ImportApiKeysResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.ImportApiKeysResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.ImportApiKeysRequest import-api-keys-request]
    (-> this (.importApiKeys import-api-keys-request))))

(defn get-usage-plans
  "Gets all the usage plans of the caller's account.

  get-usage-plans-request - The GET request to get all the usage plans of the caller's account. - `com.amazonaws.services.apigateway.model.GetUsagePlansRequest`

  returns: Result of the GetUsagePlans operation returned by the service. - `com.amazonaws.services.apigateway.model.GetUsagePlansResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.GetUsagePlansResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetUsagePlansRequest get-usage-plans-request]
    (-> this (.getUsagePlans get-usage-plans-request))))

(defn put-method-response
  "Adds a MethodResponse to an existing Method resource.

  put-method-response-request - Request to add a MethodResponse to an existing Method resource. - `com.amazonaws.services.apigateway.model.PutMethodResponseRequest`

  returns: Result of the PutMethodResponse operation returned by the service. - `com.amazonaws.services.apigateway.model.PutMethodResponseResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.PutMethodResponseResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.PutMethodResponseRequest put-method-response-request]
    (-> this (.putMethodResponse put-method-response-request))))

(defn delete-integration-response
  "Represents a delete integration response.

  delete-integration-response-request - Represents a delete integration response request. - `com.amazonaws.services.apigateway.model.DeleteIntegrationResponseRequest`

  returns: Result of the DeleteIntegrationResponse operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteIntegrationResponseResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.DeleteIntegrationResponseResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.DeleteIntegrationResponseRequest delete-integration-response-request]
    (-> this (.deleteIntegrationResponse delete-integration-response-request))))

(defn get-stage
  "Gets information about a Stage resource.

  get-stage-request - Requests API Gateway to get information about a Stage resource. - `com.amazonaws.services.apigateway.model.GetStageRequest`

  returns: Result of the GetStage operation returned by the service. - `com.amazonaws.services.apigateway.model.GetStageResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetStageResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetStageRequest get-stage-request]
    (-> this (.getStage get-stage-request))))

(defn get-integration
  "Get the integration settings.

  get-integration-request - Represents a request to get the integration configuration. - `com.amazonaws.services.apigateway.model.GetIntegrationRequest`

  returns: Result of the GetIntegration operation returned by the service. - `com.amazonaws.services.apigateway.model.GetIntegrationResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetIntegrationResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetIntegrationRequest get-integration-request]
    (-> this (.getIntegration get-integration-request))))

(defn create-rest-api
  "Creates a new RestApi resource.

  create-rest-api-request - The POST Request to add a new RestApi resource to your collection. - `com.amazonaws.services.apigateway.model.CreateRestApiRequest`

  returns: Result of the CreateRestApi operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateRestApiResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.CreateRestApiResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.CreateRestApiRequest create-rest-api-request]
    (-> this (.createRestApi create-rest-api-request))))

(defn get-request-validator
  "Gets a RequestValidator of a given RestApi.

  get-request-validator-request - Gets a RequestValidator of a given RestApi. - `com.amazonaws.services.apigateway.model.GetRequestValidatorRequest`

  returns: Result of the GetRequestValidator operation returned by the service. - `com.amazonaws.services.apigateway.model.GetRequestValidatorResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetRequestValidatorResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetRequestValidatorRequest get-request-validator-request]
    (-> this (.getRequestValidator get-request-validator-request))))

(defn put-method
  "Add a method to an existing Resource resource.

  put-method-request - Request to add a method to an existing Resource resource. - `com.amazonaws.services.apigateway.model.PutMethodRequest`

  returns: Result of the PutMethod operation returned by the service. - `com.amazonaws.services.apigateway.model.PutMethodResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.PutMethodResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.PutMethodRequest put-method-request]
    (-> this (.putMethod put-method-request))))

(defn get-integration-response
  "Represents a get integration response.

  get-integration-response-request - Represents a get integration response request. - `com.amazonaws.services.apigateway.model.GetIntegrationResponseRequest`

  returns: Result of the GetIntegrationResponse operation returned by the service. - `com.amazonaws.services.apigateway.model.GetIntegrationResponseResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetIntegrationResponseResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.GetIntegrationResponseRequest get-integration-response-request]
    (-> this (.getIntegrationResponse get-integration-response-request))))

(defn delete-domain-name
  "Deletes the DomainName resource.

  delete-domain-name-request - A request to delete the DomainName resource. - `com.amazonaws.services.apigateway.model.DeleteDomainNameRequest`

  returns: Result of the DeleteDomainName operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteDomainNameResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.DeleteDomainNameResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.DeleteDomainNameRequest delete-domain-name-request]
    (-> this (.deleteDomainName delete-domain-name-request))))

(defn create-stage
  "Creates a new Stage resource that references a pre-existing Deployment for the API.

  create-stage-request - Requests API Gateway to create a Stage resource. - `com.amazonaws.services.apigateway.model.CreateStageRequest`

  returns: Result of the CreateStage operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateStageResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.CreateStageResult [^AmazonApiGateway this ^com.amazonaws.services.apigateway.model.CreateStageRequest create-stage-request]
    (-> this (.createStage create-stage-request))))

