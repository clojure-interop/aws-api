(ns com.amazonaws.services.apigateway.AmazonApiGatewayClient
  "Client for accessing Amazon API Gateway. All service calls made using this client are blocking, and will not return
  until the service call completes.

  Amazon API Gateway

  Amazon API Gateway helps developers deliver robust, secure, and scalable mobile and web application back ends. API
  Gateway allows developers to securely connect mobile and web applications to APIs that run on AWS Lambda, Amazon EC2,
  or other publicly addressable web services that are hosted outside of AWS."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.apigateway AmazonApiGatewayClient]))

(defn ->amazon-api-gateway-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to Amazon API Gateway (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AmazonApiGatewayClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AmazonApiGatewayClient aws-credentials-provider client-configuration request-metric-collector))
  (^AmazonApiGatewayClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonApiGatewayClient aws-credentials client-configuration))
  (^AmazonApiGatewayClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonApiGatewayClient client-configuration))
  (^AmazonApiGatewayClient []
    (new AmazonApiGatewayClient )))

(defn *builder
  "returns: `com.amazonaws.services.apigateway.AmazonApiGatewayClientBuilder`"
  (^com.amazonaws.services.apigateway.AmazonApiGatewayClientBuilder []
    (AmazonApiGatewayClient/builder )))

(defn delete-documentation-part
  "request - `com.amazonaws.services.apigateway.model.DeleteDocumentationPartRequest`

  returns: Result of the DeleteDocumentationPart operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteDocumentationPartResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.DeleteDocumentationPartResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.DeleteDocumentationPartRequest request]
    (-> this (.deleteDocumentationPart request))))

(defn get-authorizers
  "Describe an existing Authorizers resource.

   AWS CLI

  request - `com.amazonaws.services.apigateway.model.GetAuthorizersRequest`

  returns: Result of the GetAuthorizers operation returned by the service. - `com.amazonaws.services.apigateway.model.GetAuthorizersResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.GetAuthorizersResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetAuthorizersRequest request]
    (-> this (.getAuthorizers request))))

(defn put-integration-response
  "Represents a put integration.

  request - `com.amazonaws.services.apigateway.model.PutIntegrationResponseRequest`

  returns: Result of the PutIntegrationResponse operation returned by the service. - `com.amazonaws.services.apigateway.model.PutIntegrationResponseResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.PutIntegrationResponseResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.PutIntegrationResponseRequest request]
    (-> this (.putIntegrationResponse request))))

(defn update-method-response
  "Updates an existing MethodResponse resource.

  request - `com.amazonaws.services.apigateway.model.UpdateMethodResponseRequest`

  returns: Result of the UpdateMethodResponse operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateMethodResponseResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.UpdateMethodResponseResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.UpdateMethodResponseRequest request]
    (-> this (.updateMethodResponse request))))

(defn get-resources
  "Lists information about a collection of Resource resources.

  request - `com.amazonaws.services.apigateway.model.GetResourcesRequest`

  returns: Result of the GetResources operation returned by the service. - `com.amazonaws.services.apigateway.model.GetResourcesResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.GetResourcesResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetResourcesRequest request]
    (-> this (.getResources request))))

(defn put-integration
  "Sets up a method's integration.

  request - `com.amazonaws.services.apigateway.model.PutIntegrationRequest`

  returns: Result of the PutIntegration operation returned by the service. - `com.amazonaws.services.apigateway.model.PutIntegrationResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.PutIntegrationResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.PutIntegrationRequest request]
    (-> this (.putIntegration request))))

(defn get-vpc-links
  "Gets the VpcLinks collection under the caller's account in a selected region.

  request - `com.amazonaws.services.apigateway.model.GetVpcLinksRequest`

  returns: Result of the GetVpcLinks operation returned by the service. - `com.amazonaws.services.apigateway.model.GetVpcLinksResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.GetVpcLinksResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetVpcLinksRequest request]
    (-> this (.getVpcLinks request))))

(defn get-sdk-types
  "request - `com.amazonaws.services.apigateway.model.GetSdkTypesRequest`

  returns: Result of the GetSdkTypes operation returned by the service. - `com.amazonaws.services.apigateway.model.GetSdkTypesResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetSdkTypesResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetSdkTypesRequest request]
    (-> this (.getSdkTypes request))))

(defn get-usage-plan-keys
  "Gets all the usage plan keys representing the API keys added to a specified usage plan.

  request - `com.amazonaws.services.apigateway.model.GetUsagePlanKeysRequest`

  returns: Result of the GetUsagePlanKeys operation returned by the service. - `com.amazonaws.services.apigateway.model.GetUsagePlanKeysResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.GetUsagePlanKeysResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetUsagePlanKeysRequest request]
    (-> this (.getUsagePlanKeys request))))

(defn delete-method
  "Deletes an existing Method resource.

  request - `com.amazonaws.services.apigateway.model.DeleteMethodRequest`

  returns: Result of the DeleteMethod operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteMethodResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.DeleteMethodResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.DeleteMethodRequest request]
    (-> this (.deleteMethod request))))

(defn update-usage
  "Grants a temporary extension to the remaining quota of a usage plan associated with a specified API key.

  request - `com.amazonaws.services.apigateway.model.UpdateUsageRequest`

  returns: Result of the UpdateUsage operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateUsageResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.UpdateUsageResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.UpdateUsageRequest request]
    (-> this (.updateUsage request))))

(defn delete-base-path-mapping
  "Deletes the BasePathMapping resource.

  request - `com.amazonaws.services.apigateway.model.DeleteBasePathMappingRequest`

  returns: Result of the DeleteBasePathMapping operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteBasePathMappingResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.DeleteBasePathMappingResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.DeleteBasePathMappingRequest request]
    (-> this (.deleteBasePathMapping request))))

(defn delete-client-certificate
  "Deletes the ClientCertificate resource.

  request - `com.amazonaws.services.apigateway.model.DeleteClientCertificateRequest`

  returns: Result of the DeleteClientCertificate operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteClientCertificateResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.DeleteClientCertificateResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.DeleteClientCertificateRequest request]
    (-> this (.deleteClientCertificate request))))

(defn get-usage-plan-key
  "Gets a usage plan key of a given key identifier.

  request - `com.amazonaws.services.apigateway.model.GetUsagePlanKeyRequest`

  returns: Result of the GetUsagePlanKey operation returned by the service. - `com.amazonaws.services.apigateway.model.GetUsagePlanKeyResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.GetUsagePlanKeyResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetUsagePlanKeyRequest request]
    (-> this (.getUsagePlanKey request))))

(defn create-usage-plan
  "Creates a usage plan with the throttle and quota limits, as well as the associated API stages, specified in the
   payload.

  request - `com.amazonaws.services.apigateway.model.CreateUsagePlanRequest`

  returns: Result of the CreateUsagePlan operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateUsagePlanResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.CreateUsagePlanResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.CreateUsagePlanRequest request]
    (-> this (.createUsagePlan request))))

(defn get-documentation-version
  "request - `com.amazonaws.services.apigateway.model.GetDocumentationVersionRequest`

  returns: Result of the GetDocumentationVersion operation returned by the service. - `com.amazonaws.services.apigateway.model.GetDocumentationVersionResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetDocumentationVersionResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetDocumentationVersionRequest request]
    (-> this (.getDocumentationVersion request))))

(defn get-base-path-mappings
  "Represents a collection of BasePathMapping resources.

  request - `com.amazonaws.services.apigateway.model.GetBasePathMappingsRequest`

  returns: Result of the GetBasePathMappings operation returned by the service. - `com.amazonaws.services.apigateway.model.GetBasePathMappingsResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetBasePathMappingsResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetBasePathMappingsRequest request]
    (-> this (.getBasePathMappings request))))

(defn get-resource
  "Lists information about a resource.

  request - `com.amazonaws.services.apigateway.model.GetResourceRequest`

  returns: Result of the GetResource operation returned by the service. - `com.amazonaws.services.apigateway.model.GetResourceResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetResourceResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetResourceRequest request]
    (-> this (.getResource request))))

(defn update-deployment
  "Changes information about a Deployment resource.

  request - `com.amazonaws.services.apigateway.model.UpdateDeploymentRequest`

  returns: Result of the UpdateDeployment operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateDeploymentResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.UpdateDeploymentResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.UpdateDeploymentRequest request]
    (-> this (.updateDeployment request))))

(defn update-documentation-part
  "request - `com.amazonaws.services.apigateway.model.UpdateDocumentationPartRequest`

  returns: Result of the UpdateDocumentationPart operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateDocumentationPartResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.UpdateDocumentationPartResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.UpdateDocumentationPartRequest request]
    (-> this (.updateDocumentationPart request))))

(defn update-vpc-link
  "Updates an existing VpcLink of a specified identifier.

  request - `com.amazonaws.services.apigateway.model.UpdateVpcLinkRequest`

  returns: Result of the UpdateVpcLink operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateVpcLinkResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.UpdateVpcLinkResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.UpdateVpcLinkRequest request]
    (-> this (.updateVpcLink request))))

(defn update-resource
  "Changes information about a Resource resource.

  request - `com.amazonaws.services.apigateway.model.UpdateResourceRequest`

  returns: Result of the UpdateResource operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateResourceResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.UpdateResourceResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.UpdateResourceRequest request]
    (-> this (.updateResource request))))

(defn create-base-path-mapping
  "Creates a new BasePathMapping resource.

  request - `com.amazonaws.services.apigateway.model.CreateBasePathMappingRequest`

  returns: Result of the CreateBasePathMapping operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateBasePathMappingResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.CreateBasePathMappingResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.CreateBasePathMappingRequest request]
    (-> this (.createBasePathMapping request))))

(defn untag-resource
  "Removes a tag from a given resource.

  request - `com.amazonaws.services.apigateway.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.apigateway.model.UntagResourceResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.UntagResourceResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn get-vpc-link
  "Gets a specified VPC link under the caller's account in a region.

  request - `com.amazonaws.services.apigateway.model.GetVpcLinkRequest`

  returns: Result of the GetVpcLink operation returned by the service. - `com.amazonaws.services.apigateway.model.GetVpcLinkResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetVpcLinkResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetVpcLinkRequest request]
    (-> this (.getVpcLink request))))

(defn update-authorizer
  "Updates an existing Authorizer resource.

   AWS CLI

  request - `com.amazonaws.services.apigateway.model.UpdateAuthorizerRequest`

  returns: Result of the UpdateAuthorizer operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateAuthorizerResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.UpdateAuthorizerResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.UpdateAuthorizerRequest request]
    (-> this (.updateAuthorizer request))))

(defn update-client-certificate
  "Changes information about an ClientCertificate resource.

  request - `com.amazonaws.services.apigateway.model.UpdateClientCertificateRequest`

  returns: Result of the UpdateClientCertificate operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateClientCertificateResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.UpdateClientCertificateResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.UpdateClientCertificateRequest request]
    (-> this (.updateClientCertificate request))))

(defn create-api-key
  "Create an ApiKey resource.

   AWS CLI

  request - `com.amazonaws.services.apigateway.model.CreateApiKeyRequest`

  returns: Result of the CreateApiKey operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateApiKeyResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.CreateApiKeyResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.CreateApiKeyRequest request]
    (-> this (.createApiKey request))))

(defn get-model-template
  "Generates a sample mapping template that can be used to transform a payload into the structure of a model.

  request - `com.amazonaws.services.apigateway.model.GetModelTemplateRequest`

  returns: Result of the GetModelTemplate operation returned by the service. - `com.amazonaws.services.apigateway.model.GetModelTemplateResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetModelTemplateResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetModelTemplateRequest request]
    (-> this (.getModelTemplate request))))

(defn delete-api-key
  "Deletes the ApiKey resource.

  request - `com.amazonaws.services.apigateway.model.DeleteApiKeyRequest`

  returns: Result of the DeleteApiKey operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteApiKeyResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.DeleteApiKeyResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.DeleteApiKeyRequest request]
    (-> this (.deleteApiKey request))))

(defn get-api-keys
  "Gets information about the current ApiKeys resource.

  request - `com.amazonaws.services.apigateway.model.GetApiKeysRequest`

  returns: Result of the GetApiKeys operation returned by the service. - `com.amazonaws.services.apigateway.model.GetApiKeysResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.GetApiKeysResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetApiKeysRequest request]
    (-> this (.getApiKeys request))))

(defn get-client-certificates
  "Gets a collection of ClientCertificate resources.

  request - `com.amazonaws.services.apigateway.model.GetClientCertificatesRequest`

  returns: Result of the GetClientCertificates operation returned by the service. - `com.amazonaws.services.apigateway.model.GetClientCertificatesResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.GetClientCertificatesResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetClientCertificatesRequest request]
    (-> this (.getClientCertificates request))))

(defn delete-stage
  "Deletes a Stage resource.

  request - `com.amazonaws.services.apigateway.model.DeleteStageRequest`

  returns: Result of the DeleteStage operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteStageResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.DeleteStageResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.DeleteStageRequest request]
    (-> this (.deleteStage request))))

(defn test-invoke-method
  "Simulate the execution of a Method in your RestApi with headers, parameters, and an incoming
   request body.

  request - `com.amazonaws.services.apigateway.model.TestInvokeMethodRequest`

  returns: Result of the TestInvokeMethod operation returned by the service. - `com.amazonaws.services.apigateway.model.TestInvokeMethodResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.TestInvokeMethodResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.TestInvokeMethodRequest request]
    (-> this (.testInvokeMethod request))))

(defn update-gateway-response
  "Updates a GatewayResponse of a specified response type on the given RestApi.

  request - `com.amazonaws.services.apigateway.model.UpdateGatewayResponseRequest`

  returns: Result of the UpdateGatewayResponse operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateGatewayResponseResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.UpdateGatewayResponseResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.UpdateGatewayResponseRequest request]
    (-> this (.updateGatewayResponse request))))

(defn get-export
  "Exports a deployed version of a RestApi in a specified format.

  request - `com.amazonaws.services.apigateway.model.GetExportRequest`

  returns: Result of the GetExport operation returned by the service. - `com.amazonaws.services.apigateway.model.GetExportResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetExportResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetExportRequest request]
    (-> this (.getExport request))))

(defn update-method
  "Updates an existing Method resource.

  request - `com.amazonaws.services.apigateway.model.UpdateMethodRequest`

  returns: Result of the UpdateMethod operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateMethodResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.UpdateMethodResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.UpdateMethodRequest request]
    (-> this (.updateMethod request))))

(defn get-client-certificate
  "Gets information about the current ClientCertificate resource.

  request - `com.amazonaws.services.apigateway.model.GetClientCertificateRequest`

  returns: Result of the GetClientCertificate operation returned by the service. - `com.amazonaws.services.apigateway.model.GetClientCertificateResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetClientCertificateResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetClientCertificateRequest request]
    (-> this (.getClientCertificate request))))

(defn get-sdk
  "Generates a client SDK for a RestApi and Stage.

  request - `com.amazonaws.services.apigateway.model.GetSdkRequest`

  returns: Result of the GetSdk operation returned by the service. - `com.amazonaws.services.apigateway.model.GetSdkResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetSdkResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetSdkRequest request]
    (-> this (.getSdk request))))

(defn get-deployment
  "Gets information about a Deployment resource.

  request - `com.amazonaws.services.apigateway.model.GetDeploymentRequest`

  returns: Result of the GetDeployment operation returned by the service. - `com.amazonaws.services.apigateway.model.GetDeploymentResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetDeploymentResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetDeploymentRequest request]
    (-> this (.getDeployment request))))

(defn get-stages
  "Gets information about one or more Stage resources.

  request - `com.amazonaws.services.apigateway.model.GetStagesRequest`

  returns: Result of the GetStages operation returned by the service. - `com.amazonaws.services.apigateway.model.GetStagesResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetStagesResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetStagesRequest request]
    (-> this (.getStages request))))

(defn get-gateway-response
  "Gets a GatewayResponse of a specified response type on the given RestApi.

  request - `com.amazonaws.services.apigateway.model.GetGatewayResponseRequest`

  returns: Result of the GetGatewayResponse operation returned by the service. - `com.amazonaws.services.apigateway.model.GetGatewayResponseResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetGatewayResponseResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetGatewayResponseRequest request]
    (-> this (.getGatewayResponse request))))

(defn delete-integration
  "Represents a delete integration.

  request - `com.amazonaws.services.apigateway.model.DeleteIntegrationRequest`

  returns: Result of the DeleteIntegration operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteIntegrationResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.DeleteIntegrationResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.DeleteIntegrationRequest request]
    (-> this (.deleteIntegration request))))

(defn delete-usage-plan-key
  "Deletes a usage plan key and remove the underlying API key from the associated usage plan.

  request - `com.amazonaws.services.apigateway.model.DeleteUsagePlanKeyRequest`

  returns: Result of the DeleteUsagePlanKey operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteUsagePlanKeyResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.DeleteUsagePlanKeyResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.DeleteUsagePlanKeyRequest request]
    (-> this (.deleteUsagePlanKey request))))

(defn delete-request-validator
  "Deletes a RequestValidator of a given RestApi.

  request - `com.amazonaws.services.apigateway.model.DeleteRequestValidatorRequest`

  returns: Result of the DeleteRequestValidator operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteRequestValidatorResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.DeleteRequestValidatorResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.DeleteRequestValidatorRequest request]
    (-> this (.deleteRequestValidator request))))

(defn delete-method-response
  "Deletes an existing MethodResponse resource.

  request - `com.amazonaws.services.apigateway.model.DeleteMethodResponseRequest`

  returns: Result of the DeleteMethodResponse operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteMethodResponseResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.DeleteMethodResponseResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.DeleteMethodResponseRequest request]
    (-> this (.deleteMethodResponse request))))

(defn import-rest-api
  "A feature of the API Gateway control service for creating a new API from an external API definition file.

  request - `com.amazonaws.services.apigateway.model.ImportRestApiRequest`

  returns: Result of the ImportRestApi operation returned by the service. - `com.amazonaws.services.apigateway.model.ImportRestApiResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.ImportRestApiResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.ImportRestApiRequest request]
    (-> this (.importRestApi request))))

(defn create-deployment
  "Creates a Deployment resource, which makes a specified RestApi callable over the internet.

  request - `com.amazonaws.services.apigateway.model.CreateDeploymentRequest`

  returns: Result of the CreateDeployment operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateDeploymentResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.CreateDeploymentResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.CreateDeploymentRequest request]
    (-> this (.createDeployment request))))

(defn create-resource
  "Creates a Resource resource.

  request - `com.amazonaws.services.apigateway.model.CreateResourceRequest`

  returns: Result of the CreateResource operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateResourceResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.CreateResourceResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.CreateResourceRequest request]
    (-> this (.createResource request))))

(defn update-base-path-mapping
  "Changes information about the BasePathMapping resource.

  request - `com.amazonaws.services.apigateway.model.UpdateBasePathMappingRequest`

  returns: Result of the UpdateBasePathMapping operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateBasePathMappingResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.UpdateBasePathMappingResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.UpdateBasePathMappingRequest request]
    (-> this (.updateBasePathMapping request))))

(defn generate-client-certificate
  "Generates a ClientCertificate resource.

  request - `com.amazonaws.services.apigateway.model.GenerateClientCertificateRequest`

  returns: Result of the GenerateClientCertificate operation returned by the service. - `com.amazonaws.services.apigateway.model.GenerateClientCertificateResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GenerateClientCertificateResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GenerateClientCertificateRequest request]
    (-> this (.generateClientCertificate request))))

(defn get-models
  "Describes existing Models defined for a RestApi resource.

  request - `com.amazonaws.services.apigateway.model.GetModelsRequest`

  returns: Result of the GetModels operation returned by the service. - `com.amazonaws.services.apigateway.model.GetModelsResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.GetModelsResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetModelsRequest request]
    (-> this (.getModels request))))

(defn get-sdk-type
  "request - `com.amazonaws.services.apigateway.model.GetSdkTypeRequest`

  returns: Result of the GetSdkType operation returned by the service. - `com.amazonaws.services.apigateway.model.GetSdkTypeResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetSdkTypeResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetSdkTypeRequest request]
    (-> this (.getSdkType request))))

(defn create-model
  "Adds a new Model resource to an existing RestApi resource.

  request - `com.amazonaws.services.apigateway.model.CreateModelRequest`

  returns: Result of the CreateModel operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateModelResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.CreateModelResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.CreateModelRequest request]
    (-> this (.createModel request))))

(defn put-rest-api
  "A feature of the API Gateway control service for updating an existing API with an input of external API
   definitions. The update can take the form of merging the supplied definition into the existing API or overwriting
   the existing API.

  request - `com.amazonaws.services.apigateway.model.PutRestApiRequest`

  returns: Result of the PutRestApi operation returned by the service. - `com.amazonaws.services.apigateway.model.PutRestApiResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.PutRestApiResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.PutRestApiRequest request]
    (-> this (.putRestApi request))))

(defn create-domain-name
  "Creates a new domain name.

  request - `com.amazonaws.services.apigateway.model.CreateDomainNameRequest`

  returns: Result of the CreateDomainName operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateDomainNameResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.CreateDomainNameResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.CreateDomainNameRequest request]
    (-> this (.createDomainName request))))

(defn test-invoke-authorizer
  "Simulate the execution of an Authorizer in your RestApi with headers, parameters, and an incoming
   request body.

    Use
   Lambda Function as Authorizer Use
   Cognito User Pool as Authorizer

  request - `com.amazonaws.services.apigateway.model.TestInvokeAuthorizerRequest`

  returns: Result of the TestInvokeAuthorizer operation returned by the service. - `com.amazonaws.services.apigateway.model.TestInvokeAuthorizerResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.TestInvokeAuthorizerResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.TestInvokeAuthorizerRequest request]
    (-> this (.testInvokeAuthorizer request))))

(defn get-usage
  "Gets the usage data of a usage plan in a specified time interval.

  request - `com.amazonaws.services.apigateway.model.GetUsageRequest`

  returns: Result of the GetUsage operation returned by the service. - `com.amazonaws.services.apigateway.model.GetUsageResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.GetUsageResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetUsageRequest request]
    (-> this (.getUsage request))))

(defn create-vpc-link
  "Creates a VPC link, under the caller's account in a selected region, in an asynchronous operation that typically
   takes 2-4 minutes to complete and become operational. The caller must have permissions to create and update VPC
   Endpoint services.

  request - `com.amazonaws.services.apigateway.model.CreateVpcLinkRequest`

  returns: Result of the CreateVpcLink operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateVpcLinkResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.CreateVpcLinkResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.CreateVpcLinkRequest request]
    (-> this (.createVpcLink request))))

(defn delete-gateway-response
  "Clears any customization of a GatewayResponse of a specified response type on the given RestApi and
   resets it with the default settings.

  request - `com.amazonaws.services.apigateway.model.DeleteGatewayResponseRequest`

  returns: Result of the DeleteGatewayResponse operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteGatewayResponseResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.DeleteGatewayResponseResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.DeleteGatewayResponseRequest request]
    (-> this (.deleteGatewayResponse request))))

(defn delete-usage-plan
  "Deletes a usage plan of a given plan Id.

  request - `com.amazonaws.services.apigateway.model.DeleteUsagePlanRequest`

  returns: Result of the DeleteUsagePlan operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteUsagePlanResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.DeleteUsagePlanResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.DeleteUsagePlanRequest request]
    (-> this (.deleteUsagePlan request))))

(defn create-request-validator
  "Creates a ReqeustValidator of a given RestApi.

  request - `com.amazonaws.services.apigateway.model.CreateRequestValidatorRequest`

  returns: Result of the CreateRequestValidator operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateRequestValidatorResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.CreateRequestValidatorResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.CreateRequestValidatorRequest request]
    (-> this (.createRequestValidator request))))

(defn get-authorizer
  "Describe an existing Authorizer resource.

   AWS CLI

  request - `com.amazonaws.services.apigateway.model.GetAuthorizerRequest`

  returns: Result of the GetAuthorizer operation returned by the service. - `com.amazonaws.services.apigateway.model.GetAuthorizerResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetAuthorizerResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetAuthorizerRequest request]
    (-> this (.getAuthorizer request))))

(defn update-stage
  "Changes information about a Stage resource.

  request - `com.amazonaws.services.apigateway.model.UpdateStageRequest`

  returns: Result of the UpdateStage operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateStageResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.UpdateStageResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.UpdateStageRequest request]
    (-> this (.updateStage request))))

(defn get-usage-plan
  "Gets a usage plan of a given plan identifier.

  request - `com.amazonaws.services.apigateway.model.GetUsagePlanRequest`

  returns: Result of the GetUsagePlan operation returned by the service. - `com.amazonaws.services.apigateway.model.GetUsagePlanResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.GetUsagePlanResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetUsagePlanRequest request]
    (-> this (.getUsagePlan request))))

(defn update-domain-name
  "Changes information about the DomainName resource.

  request - `com.amazonaws.services.apigateway.model.UpdateDomainNameRequest`

  returns: Result of the UpdateDomainName operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateDomainNameResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.UpdateDomainNameResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.UpdateDomainNameRequest request]
    (-> this (.updateDomainName request))))

(defn flush-stage-authorizers-cache
  "Flushes all authorizer cache entries on a stage.

  request - `com.amazonaws.services.apigateway.model.FlushStageAuthorizersCacheRequest`

  returns: Result of the FlushStageAuthorizersCache operation returned by the service. - `com.amazonaws.services.apigateway.model.FlushStageAuthorizersCacheResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.FlushStageAuthorizersCacheResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.FlushStageAuthorizersCacheRequest request]
    (-> this (.flushStageAuthorizersCache request))))

(defn get-documentation-part
  "request - `com.amazonaws.services.apigateway.model.GetDocumentationPartRequest`

  returns: Result of the GetDocumentationPart operation returned by the service. - `com.amazonaws.services.apigateway.model.GetDocumentationPartResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetDocumentationPartResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetDocumentationPartRequest request]
    (-> this (.getDocumentationPart request))))

(defn get-tags
  "Gets the Tags collection for a given resource.

  request - `com.amazonaws.services.apigateway.model.GetTagsRequest`

  returns: Result of the GetTags operation returned by the service. - `com.amazonaws.services.apigateway.model.GetTagsResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.GetTagsResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetTagsRequest request]
    (-> this (.getTags request))))

(defn get-method-response
  "Describes a MethodResponse resource.

  request - `com.amazonaws.services.apigateway.model.GetMethodResponseRequest`

  returns: Result of the GetMethodResponse operation returned by the service. - `com.amazonaws.services.apigateway.model.GetMethodResponseResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetMethodResponseResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetMethodResponseRequest request]
    (-> this (.getMethodResponse request))))

(defn get-domain-name
  "Represents a domain name that is contained in a simpler, more intuitive URL that can be called.

  request - `com.amazonaws.services.apigateway.model.GetDomainNameRequest`

  returns: Result of the GetDomainName operation returned by the service. - `com.amazonaws.services.apigateway.model.GetDomainNameResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetDomainNameResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetDomainNameRequest request]
    (-> this (.getDomainName request))))

(defn get-base-path-mapping
  "Describe a BasePathMapping resource.

  request - `com.amazonaws.services.apigateway.model.GetBasePathMappingRequest`

  returns: Result of the GetBasePathMapping operation returned by the service. - `com.amazonaws.services.apigateway.model.GetBasePathMappingResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetBasePathMappingResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetBasePathMappingRequest request]
    (-> this (.getBasePathMapping request))))

(defn update-api-key
  "Changes information about an ApiKey resource.

  request - `com.amazonaws.services.apigateway.model.UpdateApiKeyRequest`

  returns: Result of the UpdateApiKey operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateApiKeyResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.UpdateApiKeyResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.UpdateApiKeyRequest request]
    (-> this (.updateApiKey request))))

(defn get-request-validators
  "Gets the RequestValidators collection of a given RestApi.

  request - `com.amazonaws.services.apigateway.model.GetRequestValidatorsRequest`

  returns: Result of the GetRequestValidators operation returned by the service. - `com.amazonaws.services.apigateway.model.GetRequestValidatorsResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.GetRequestValidatorsResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetRequestValidatorsRequest request]
    (-> this (.getRequestValidators request))))

(defn get-api-key
  "Gets information about the current ApiKey resource.

  request - `com.amazonaws.services.apigateway.model.GetApiKeyRequest`

  returns: Result of the GetApiKey operation returned by the service. - `com.amazonaws.services.apigateway.model.GetApiKeyResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetApiKeyResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetApiKeyRequest request]
    (-> this (.getApiKey request))))

(defn delete-documentation-version
  "request - `com.amazonaws.services.apigateway.model.DeleteDocumentationVersionRequest`

  returns: Result of the DeleteDocumentationVersion operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteDocumentationVersionResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.DeleteDocumentationVersionResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.DeleteDocumentationVersionRequest request]
    (-> this (.deleteDocumentationVersion request))))

(defn delete-model
  "Deletes a model.

  request - `com.amazonaws.services.apigateway.model.DeleteModelRequest`

  returns: Result of the DeleteModel operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteModelResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.DeleteModelResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.DeleteModelRequest request]
    (-> this (.deleteModel request))))

(defn update-integration-response
  "Represents an update integration response.

  request - `com.amazonaws.services.apigateway.model.UpdateIntegrationResponseRequest`

  returns: Result of the UpdateIntegrationResponse operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateIntegrationResponseResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.UpdateIntegrationResponseResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.UpdateIntegrationResponseRequest request]
    (-> this (.updateIntegrationResponse request))))

(defn delete-resource
  "Deletes a Resource resource.

  request - `com.amazonaws.services.apigateway.model.DeleteResourceRequest`

  returns: Result of the DeleteResource operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteResourceResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.DeleteResourceResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.DeleteResourceRequest request]
    (-> this (.deleteResource request))))

(defn update-documentation-version
  "request - `com.amazonaws.services.apigateway.model.UpdateDocumentationVersionRequest`

  returns: Result of the UpdateDocumentationVersion operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateDocumentationVersionResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.UpdateDocumentationVersionResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.UpdateDocumentationVersionRequest request]
    (-> this (.updateDocumentationVersion request))))

(defn put-gateway-response
  "Creates a customization of a GatewayResponse of a specified response type and status code on the given
   RestApi.

  request - `com.amazonaws.services.apigateway.model.PutGatewayResponseRequest`

  returns: Result of the PutGatewayResponse operation returned by the service. - `com.amazonaws.services.apigateway.model.PutGatewayResponseResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.PutGatewayResponseResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.PutGatewayResponseRequest request]
    (-> this (.putGatewayResponse request))))

(defn import-documentation-parts
  "request - `com.amazonaws.services.apigateway.model.ImportDocumentationPartsRequest`

  returns: Result of the ImportDocumentationParts operation returned by the service. - `com.amazonaws.services.apigateway.model.ImportDocumentationPartsResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.ImportDocumentationPartsResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.ImportDocumentationPartsRequest request]
    (-> this (.importDocumentationParts request))))

(defn delete-vpc-link
  "Deletes an existing VpcLink of a specified identifier.

  request - `com.amazonaws.services.apigateway.model.DeleteVpcLinkRequest`

  returns: Result of the DeleteVpcLink operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteVpcLinkResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.DeleteVpcLinkResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.DeleteVpcLinkRequest request]
    (-> this (.deleteVpcLink request))))

(defn get-documentation-parts
  "request - `com.amazonaws.services.apigateway.model.GetDocumentationPartsRequest`

  returns: Result of the GetDocumentationParts operation returned by the service. - `com.amazonaws.services.apigateway.model.GetDocumentationPartsResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.GetDocumentationPartsResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetDocumentationPartsRequest request]
    (-> this (.getDocumentationParts request))))

(defn update-request-validator
  "Updates a RequestValidator of a given RestApi.

  request - `com.amazonaws.services.apigateway.model.UpdateRequestValidatorRequest`

  returns: Result of the UpdateRequestValidator operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateRequestValidatorResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.UpdateRequestValidatorResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.UpdateRequestValidatorRequest request]
    (-> this (.updateRequestValidator request))))

(defn create-documentation-part
  "request - `com.amazonaws.services.apigateway.model.CreateDocumentationPartRequest`

  returns: Result of the CreateDocumentationPart operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateDocumentationPartResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.CreateDocumentationPartResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.CreateDocumentationPartRequest request]
    (-> this (.createDocumentationPart request))))

(defn get-account
  "Gets information about the current Account resource.

  request - `com.amazonaws.services.apigateway.model.GetAccountRequest`

  returns: Result of the GetAccount operation returned by the service. - `com.amazonaws.services.apigateway.model.GetAccountResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetAccountResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetAccountRequest request]
    (-> this (.getAccount request))))

(defn update-account
  "Changes information about the current Account resource.

  request - `com.amazonaws.services.apigateway.model.UpdateAccountRequest`

  returns: Result of the UpdateAccount operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateAccountResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.UpdateAccountResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.UpdateAccountRequest request]
    (-> this (.updateAccount request))))

(defn get-method
  "Describe an existing Method resource.

  request - `com.amazonaws.services.apigateway.model.GetMethodRequest`

  returns: Result of the GetMethod operation returned by the service. - `com.amazonaws.services.apigateway.model.GetMethodResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetMethodResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetMethodRequest request]
    (-> this (.getMethod request))))

(defn create-documentation-version
  "request - `com.amazonaws.services.apigateway.model.CreateDocumentationVersionRequest`

  returns: Result of the CreateDocumentationVersion operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateDocumentationVersionResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.CreateDocumentationVersionResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.CreateDocumentationVersionRequest request]
    (-> this (.createDocumentationVersion request))))

(defn get-gateway-responses
  "Gets the GatewayResponses collection on the given RestApi. If an API developer has not added any
   definitions for gateway responses, the result will be the API Gateway-generated default GatewayResponses
   collection for the supported response types.

  request - `com.amazonaws.services.apigateway.model.GetGatewayResponsesRequest`

  returns: Result of the GetGatewayResponses operation returned by the service. - `com.amazonaws.services.apigateway.model.GetGatewayResponsesResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.GetGatewayResponsesResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetGatewayResponsesRequest request]
    (-> this (.getGatewayResponses request))))

(defn get-domain-names
  "Represents a collection of DomainName resources.

  request - `com.amazonaws.services.apigateway.model.GetDomainNamesRequest`

  returns: Result of the GetDomainNames operation returned by the service. - `com.amazonaws.services.apigateway.model.GetDomainNamesResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.GetDomainNamesResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetDomainNamesRequest request]
    (-> this (.getDomainNames request))))

(defn update-integration
  "Represents an update integration.

  request - `com.amazonaws.services.apigateway.model.UpdateIntegrationRequest`

  returns: Result of the UpdateIntegration operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateIntegrationResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.UpdateIntegrationResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.UpdateIntegrationRequest request]
    (-> this (.updateIntegration request))))

(defn update-model
  "Changes information about a model.

  request - `com.amazonaws.services.apigateway.model.UpdateModelRequest`

  returns: Result of the UpdateModel operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateModelResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.UpdateModelResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.UpdateModelRequest request]
    (-> this (.updateModel request))))

(defn update-rest-api
  "Changes information about the specified API.

  request - `com.amazonaws.services.apigateway.model.UpdateRestApiRequest`

  returns: Result of the UpdateRestApi operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateRestApiResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.UpdateRestApiResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.UpdateRestApiRequest request]
    (-> this (.updateRestApi request))))

(defn create-authorizer
  "Adds a new Authorizer resource to an existing RestApi resource.

   AWS CLI

  request - `com.amazonaws.services.apigateway.model.CreateAuthorizerRequest`

  returns: Result of the CreateAuthorizer operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateAuthorizerResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.CreateAuthorizerResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.CreateAuthorizerRequest request]
    (-> this (.createAuthorizer request))))

(defn delete-deployment
  "Deletes a Deployment resource. Deleting a deployment will only succeed if there are no Stage
   resources associated with it.

  request - `com.amazonaws.services.apigateway.model.DeleteDeploymentRequest`

  returns: Result of the DeleteDeployment operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteDeploymentResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.DeleteDeploymentResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.DeleteDeploymentRequest request]
    (-> this (.deleteDeployment request))))

(defn delete-rest-api
  "Deletes the specified API.

  request - `com.amazonaws.services.apigateway.model.DeleteRestApiRequest`

  returns: Result of the DeleteRestApi operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteRestApiResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.DeleteRestApiResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.DeleteRestApiRequest request]
    (-> this (.deleteRestApi request))))

(defn get-rest-apis
  "Lists the RestApis resources for your collection.

  request - `com.amazonaws.services.apigateway.model.GetRestApisRequest`

  returns: Result of the GetRestApis operation returned by the service. - `com.amazonaws.services.apigateway.model.GetRestApisResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.GetRestApisResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetRestApisRequest request]
    (-> this (.getRestApis request))))

(defn get-model
  "Describes an existing model defined for a RestApi resource.

  request - `com.amazonaws.services.apigateway.model.GetModelRequest`

  returns: Result of the GetModel operation returned by the service. - `com.amazonaws.services.apigateway.model.GetModelResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetModelResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetModelRequest request]
    (-> this (.getModel request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonApiGatewayClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-documentation-versions
  "request - `com.amazonaws.services.apigateway.model.GetDocumentationVersionsRequest`

  returns: Result of the GetDocumentationVersions operation returned by the service. - `com.amazonaws.services.apigateway.model.GetDocumentationVersionsResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.GetDocumentationVersionsResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetDocumentationVersionsRequest request]
    (-> this (.getDocumentationVersions request))))

(defn get-deployments
  "Gets information about a Deployments collection.

  request - `com.amazonaws.services.apigateway.model.GetDeploymentsRequest`

  returns: Result of the GetDeployments operation returned by the service. - `com.amazonaws.services.apigateway.model.GetDeploymentsResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.GetDeploymentsResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetDeploymentsRequest request]
    (-> this (.getDeployments request))))

(defn get-rest-api
  "Lists the RestApi resource in the collection.

  request - `com.amazonaws.services.apigateway.model.GetRestApiRequest`

  returns: Result of the GetRestApi operation returned by the service. - `com.amazonaws.services.apigateway.model.GetRestApiResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetRestApiResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetRestApiRequest request]
    (-> this (.getRestApi request))))

(defn flush-stage-cache
  "Flushes a stage's cache.

  request - `com.amazonaws.services.apigateway.model.FlushStageCacheRequest`

  returns: Result of the FlushStageCache operation returned by the service. - `com.amazonaws.services.apigateway.model.FlushStageCacheResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.FlushStageCacheResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.FlushStageCacheRequest request]
    (-> this (.flushStageCache request))))

(defn update-usage-plan
  "Updates a usage plan of a given plan Id.

  request - `com.amazonaws.services.apigateway.model.UpdateUsagePlanRequest`

  returns: Result of the UpdateUsagePlan operation returned by the service. - `com.amazonaws.services.apigateway.model.UpdateUsagePlanResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.UpdateUsagePlanResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.UpdateUsagePlanRequest request]
    (-> this (.updateUsagePlan request))))

(defn tag-resource
  "Adds or updates a tag on a given resource.

  request - `com.amazonaws.services.apigateway.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.apigateway.model.TagResourceResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.TagResourceResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn delete-authorizer
  "Deletes an existing Authorizer resource.

   AWS CLI

  request - `com.amazonaws.services.apigateway.model.DeleteAuthorizerRequest`

  returns: Result of the DeleteAuthorizer operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteAuthorizerResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.DeleteAuthorizerResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.DeleteAuthorizerRequest request]
    (-> this (.deleteAuthorizer request))))

(defn create-usage-plan-key
  "Creates a usage plan key for adding an existing API key to a usage plan.

  request - `com.amazonaws.services.apigateway.model.CreateUsagePlanKeyRequest`

  returns: Result of the CreateUsagePlanKey operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateUsagePlanKeyResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.CreateUsagePlanKeyResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.CreateUsagePlanKeyRequest request]
    (-> this (.createUsagePlanKey request))))

(defn import-api-keys
  "Import API keys from an external source, such as a CSV-formatted file.

  request - `com.amazonaws.services.apigateway.model.ImportApiKeysRequest`

  returns: Result of the ImportApiKeys operation returned by the service. - `com.amazonaws.services.apigateway.model.ImportApiKeysResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.ImportApiKeysResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.ImportApiKeysRequest request]
    (-> this (.importApiKeys request))))

(defn get-usage-plans
  "Gets all the usage plans of the caller's account.

  request - `com.amazonaws.services.apigateway.model.GetUsagePlansRequest`

  returns: Result of the GetUsagePlans operation returned by the service. - `com.amazonaws.services.apigateway.model.GetUsagePlansResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.GetUsagePlansResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetUsagePlansRequest request]
    (-> this (.getUsagePlans request))))

(defn put-method-response
  "Adds a MethodResponse to an existing Method resource.

  request - `com.amazonaws.services.apigateway.model.PutMethodResponseRequest`

  returns: Result of the PutMethodResponse operation returned by the service. - `com.amazonaws.services.apigateway.model.PutMethodResponseResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.PutMethodResponseResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.PutMethodResponseRequest request]
    (-> this (.putMethodResponse request))))

(defn delete-integration-response
  "Represents a delete integration response.

  request - `com.amazonaws.services.apigateway.model.DeleteIntegrationResponseRequest`

  returns: Result of the DeleteIntegrationResponse operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteIntegrationResponseResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.DeleteIntegrationResponseResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.DeleteIntegrationResponseRequest request]
    (-> this (.deleteIntegrationResponse request))))

(defn get-stage
  "Gets information about a Stage resource.

  request - `com.amazonaws.services.apigateway.model.GetStageRequest`

  returns: Result of the GetStage operation returned by the service. - `com.amazonaws.services.apigateway.model.GetStageResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetStageResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetStageRequest request]
    (-> this (.getStage request))))

(defn get-integration
  "Get the integration settings.

  request - `com.amazonaws.services.apigateway.model.GetIntegrationRequest`

  returns: Result of the GetIntegration operation returned by the service. - `com.amazonaws.services.apigateway.model.GetIntegrationResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetIntegrationResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetIntegrationRequest request]
    (-> this (.getIntegration request))))

(defn create-rest-api
  "Creates a new RestApi resource.

  request - `com.amazonaws.services.apigateway.model.CreateRestApiRequest`

  returns: Result of the CreateRestApi operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateRestApiResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.CreateRestApiResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.CreateRestApiRequest request]
    (-> this (.createRestApi request))))

(defn get-request-validator
  "Gets a RequestValidator of a given RestApi.

  request - `com.amazonaws.services.apigateway.model.GetRequestValidatorRequest`

  returns: Result of the GetRequestValidator operation returned by the service. - `com.amazonaws.services.apigateway.model.GetRequestValidatorResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetRequestValidatorResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetRequestValidatorRequest request]
    (-> this (.getRequestValidator request))))

(defn put-method
  "Add a method to an existing Resource resource.

  request - `com.amazonaws.services.apigateway.model.PutMethodRequest`

  returns: Result of the PutMethod operation returned by the service. - `com.amazonaws.services.apigateway.model.PutMethodResult`

  throws: com.amazonaws.services.apigateway.model.BadRequestException - The submitted request is not valid, for example, the input is incomplete or incorrect. See the accompanying error message for details."
  (^com.amazonaws.services.apigateway.model.PutMethodResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.PutMethodRequest request]
    (-> this (.putMethod request))))

(defn get-integration-response
  "Represents a get integration response.

  request - `com.amazonaws.services.apigateway.model.GetIntegrationResponseRequest`

  returns: Result of the GetIntegrationResponse operation returned by the service. - `com.amazonaws.services.apigateway.model.GetIntegrationResponseResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.GetIntegrationResponseResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.GetIntegrationResponseRequest request]
    (-> this (.getIntegrationResponse request))))

(defn delete-domain-name
  "Deletes the DomainName resource.

  request - `com.amazonaws.services.apigateway.model.DeleteDomainNameRequest`

  returns: Result of the DeleteDomainName operation returned by the service. - `com.amazonaws.services.apigateway.model.DeleteDomainNameResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.DeleteDomainNameResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.DeleteDomainNameRequest request]
    (-> this (.deleteDomainName request))))

(defn create-stage
  "Creates a new Stage resource that references a pre-existing Deployment for the API.

  request - `com.amazonaws.services.apigateway.model.CreateStageRequest`

  returns: Result of the CreateStage operation returned by the service. - `com.amazonaws.services.apigateway.model.CreateStageResult`

  throws: com.amazonaws.services.apigateway.model.UnauthorizedException - The request is denied because the caller has insufficient permissions."
  (^com.amazonaws.services.apigateway.model.CreateStageResult [^AmazonApiGatewayClient this ^com.amazonaws.services.apigateway.model.CreateStageRequest request]
    (-> this (.createStage request))))

