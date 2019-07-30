(ns com.amazonaws.services.greengrass.AWSGreengrassClient
  "Client for accessing AWS Greengrass. All service calls made using this client are blocking, and will not return until
  the service call completes.

  AWS IoT Greengrass seamlessly extends AWS onto physical devices so they can act locally on the data they generate,
  while still using the cloud for management, analytics, and durable storage. AWS IoT Greengrass ensures your devices
  can respond quickly to local events and operate with intermittent connectivity. AWS IoT Greengrass minimizes the cost
  of transmitting data to the cloud by allowing you to author AWS Lambda functions that execute locally."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.greengrass AWSGreengrassClient]))

(defn *builder
  "returns: `com.amazonaws.services.greengrass.AWSGreengrassClientBuilder`"
  (^com.amazonaws.services.greengrass.AWSGreengrassClientBuilder []
    (AWSGreengrassClient/builder )))

(defn delete-group
  "Deletes a group.

  request - `com.amazonaws.services.greengrass.model.DeleteGroupRequest`

  returns: Result of the DeleteGroup operation returned by the service. - `com.amazonaws.services.greengrass.model.DeleteGroupResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.DeleteGroupResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.DeleteGroupRequest request]
    (-> this (.deleteGroup request))))

(defn create-device-definition
  "Creates a device definition. You may provide the initial version of the device definition now or use
   ''CreateDeviceDefinitionVersion'' at a later time.

  request - `com.amazonaws.services.greengrass.model.CreateDeviceDefinitionRequest`

  returns: Result of the CreateDeviceDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateDeviceDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.CreateDeviceDefinitionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.CreateDeviceDefinitionRequest request]
    (-> this (.createDeviceDefinition request))))

(defn create-group-certificate-authority
  "Creates a CA for the group. If a CA already exists, it will rotate the existing CA.

  request - `com.amazonaws.services.greengrass.model.CreateGroupCertificateAuthorityRequest`

  returns: Result of the CreateGroupCertificateAuthority operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateGroupCertificateAuthorityResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.CreateGroupCertificateAuthorityResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.CreateGroupCertificateAuthorityRequest request]
    (-> this (.createGroupCertificateAuthority request))))

(defn update-group
  "Updates a group.

  request - `com.amazonaws.services.greengrass.model.UpdateGroupRequest`

  returns: Result of the UpdateGroup operation returned by the service. - `com.amazonaws.services.greengrass.model.UpdateGroupResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.UpdateGroupResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.UpdateGroupRequest request]
    (-> this (.updateGroup request))))

(defn get-bulk-deployment-status
  "Returns the status of a bulk deployment.

  request - `com.amazonaws.services.greengrass.model.GetBulkDeploymentStatusRequest`

  returns: Result of the GetBulkDeploymentStatus operation returned by the service. - `com.amazonaws.services.greengrass.model.GetBulkDeploymentStatusResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetBulkDeploymentStatusResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.GetBulkDeploymentStatusRequest request]
    (-> this (.getBulkDeploymentStatus request))))

(defn create-logger-definition-version
  "Creates a version of a logger definition that has already been defined.

  request - `com.amazonaws.services.greengrass.model.CreateLoggerDefinitionVersionRequest`

  returns: Result of the CreateLoggerDefinitionVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateLoggerDefinitionVersionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.CreateLoggerDefinitionVersionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.CreateLoggerDefinitionVersionRequest request]
    (-> this (.createLoggerDefinitionVersion request))))

(defn list-tags-for-resource
  "Retrieves a list of resource tags for a resource arn.

  request - `com.amazonaws.services.greengrass.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.greengrass.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.ListTagsForResourceResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn get-function-definition
  "Retrieves information about a Lambda function definition, including its creation time and latest version.

  request - `com.amazonaws.services.greengrass.model.GetFunctionDefinitionRequest`

  returns: Result of the GetFunctionDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.GetFunctionDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetFunctionDefinitionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.GetFunctionDefinitionRequest request]
    (-> this (.getFunctionDefinition request))))

(defn create-connector-definition
  "Creates a connector definition. You may provide the initial version of the connector definition now or use
   ''CreateConnectorDefinitionVersion'' at a later time.

  request - `com.amazonaws.services.greengrass.model.CreateConnectorDefinitionRequest`

  returns: Result of the CreateConnectorDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateConnectorDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.CreateConnectorDefinitionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.CreateConnectorDefinitionRequest request]
    (-> this (.createConnectorDefinition request))))

(defn get-subscription-definition
  "Retrieves information about a subscription definition.

  request - `com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionRequest`

  returns: Result of the GetSubscriptionDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionRequest request]
    (-> this (.getSubscriptionDefinition request))))

(defn get-connector-definition-version
  "Retrieves information about a connector definition version, including the connectors that the version contains.
   Connectors are prebuilt modules that interact with local infrastructure, device protocols, AWS, and other cloud
   services.

  request - `com.amazonaws.services.greengrass.model.GetConnectorDefinitionVersionRequest`

  returns: Result of the GetConnectorDefinitionVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.GetConnectorDefinitionVersionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetConnectorDefinitionVersionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.GetConnectorDefinitionVersionRequest request]
    (-> this (.getConnectorDefinitionVersion request))))

(defn get-device-definition-version
  "Retrieves information about a device definition version.

  request - `com.amazonaws.services.greengrass.model.GetDeviceDefinitionVersionRequest`

  returns: Result of the GetDeviceDefinitionVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.GetDeviceDefinitionVersionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetDeviceDefinitionVersionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.GetDeviceDefinitionVersionRequest request]
    (-> this (.getDeviceDefinitionVersion request))))

(defn delete-resource-definition
  "Deletes a resource definition.

  request - `com.amazonaws.services.greengrass.model.DeleteResourceDefinitionRequest`

  returns: Result of the DeleteResourceDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.DeleteResourceDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.DeleteResourceDefinitionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.DeleteResourceDefinitionRequest request]
    (-> this (.deleteResourceDefinition request))))

(defn list-subscription-definitions
  "Retrieves a list of subscription definitions.

  request - `com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionsRequest`

  returns: Result of the ListSubscriptionDefinitions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionsResult`"
  (^com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionsResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionsRequest request]
    (-> this (.listSubscriptionDefinitions request))))

(defn create-function-definition-version
  "Creates a version of a Lambda function definition that has already been defined.

  request - `com.amazonaws.services.greengrass.model.CreateFunctionDefinitionVersionRequest`

  returns: Result of the CreateFunctionDefinitionVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateFunctionDefinitionVersionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.CreateFunctionDefinitionVersionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.CreateFunctionDefinitionVersionRequest request]
    (-> this (.createFunctionDefinitionVersion request))))

(defn update-group-certificate-configuration
  "Updates the Certificate expiry time for a group.

  request - `com.amazonaws.services.greengrass.model.UpdateGroupCertificateConfigurationRequest`

  returns: Result of the UpdateGroupCertificateConfiguration operation returned by the service. - `com.amazonaws.services.greengrass.model.UpdateGroupCertificateConfigurationResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.UpdateGroupCertificateConfigurationResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.UpdateGroupCertificateConfigurationRequest request]
    (-> this (.updateGroupCertificateConfiguration request))))

(defn create-group
  "Creates a group. You may provide the initial version of the group or use ''CreateGroupVersion'' at a later time.
   Tip: You can use the ''gg_group_setup'' package (https://github.com/awslabs/aws-greengrass-group-setup) as a
   library or command-line application to create and deploy Greengrass groups.

  request - `com.amazonaws.services.greengrass.model.CreateGroupRequest`

  returns: Result of the CreateGroup operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateGroupResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.CreateGroupResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.CreateGroupRequest request]
    (-> this (.createGroup request))))

(defn associate-role-to-group
  "Associates a role with a group. Your Greengrass core will use the role to access AWS cloud services. The role's
   permissions should allow Greengrass core Lambda functions to perform actions against the cloud.

  request - `com.amazonaws.services.greengrass.model.AssociateRoleToGroupRequest`

  returns: Result of the AssociateRoleToGroup operation returned by the service. - `com.amazonaws.services.greengrass.model.AssociateRoleToGroupResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.AssociateRoleToGroupResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.AssociateRoleToGroupRequest request]
    (-> this (.associateRoleToGroup request))))

(defn get-function-definition-version
  "Retrieves information about a Lambda function definition version, including which Lambda functions are included
   in the version and their configurations.

  request - `com.amazonaws.services.greengrass.model.GetFunctionDefinitionVersionRequest`

  returns: Result of the GetFunctionDefinitionVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.GetFunctionDefinitionVersionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetFunctionDefinitionVersionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.GetFunctionDefinitionVersionRequest request]
    (-> this (.getFunctionDefinitionVersion request))))

(defn create-subscription-definition
  "Creates a subscription definition. You may provide the initial version of the subscription definition now or use
   ''CreateSubscriptionDefinitionVersion'' at a later time.

  request - `com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionRequest`

  returns: Result of the CreateSubscriptionDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionRequest request]
    (-> this (.createSubscriptionDefinition request))))

(defn get-service-role-for-account
  "Retrieves the service role that is attached to your account.

  request - `com.amazonaws.services.greengrass.model.GetServiceRoleForAccountRequest`

  returns: Result of the GetServiceRoleForAccount operation returned by the service. - `com.amazonaws.services.greengrass.model.GetServiceRoleForAccountResult`

  throws: com.amazonaws.services.greengrass.model.InternalServerErrorException - server error"
  (^com.amazonaws.services.greengrass.model.GetServiceRoleForAccountResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.GetServiceRoleForAccountRequest request]
    (-> this (.getServiceRoleForAccount request))))

(defn list-connector-definition-versions
  "Lists the versions of a connector definition, which are containers for connectors. Connectors run on the
   Greengrass core and contain built-in integration with local infrastructure, device protocols, AWS, and other
   cloud services.

  request - `com.amazonaws.services.greengrass.model.ListConnectorDefinitionVersionsRequest`

  returns: Result of the ListConnectorDefinitionVersions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListConnectorDefinitionVersionsResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.ListConnectorDefinitionVersionsResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.ListConnectorDefinitionVersionsRequest request]
    (-> this (.listConnectorDefinitionVersions request))))

(defn delete-core-definition
  "Deletes a core definition.

  request - `com.amazonaws.services.greengrass.model.DeleteCoreDefinitionRequest`

  returns: Result of the DeleteCoreDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.DeleteCoreDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.DeleteCoreDefinitionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.DeleteCoreDefinitionRequest request]
    (-> this (.deleteCoreDefinition request))))

(defn update-subscription-definition
  "Updates a subscription definition.

  request - `com.amazonaws.services.greengrass.model.UpdateSubscriptionDefinitionRequest`

  returns: Result of the UpdateSubscriptionDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.UpdateSubscriptionDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.UpdateSubscriptionDefinitionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.UpdateSubscriptionDefinitionRequest request]
    (-> this (.updateSubscriptionDefinition request))))

(defn get-device-definition
  "Retrieves information about a device definition.

  request - `com.amazonaws.services.greengrass.model.GetDeviceDefinitionRequest`

  returns: Result of the GetDeviceDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.GetDeviceDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetDeviceDefinitionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.GetDeviceDefinitionRequest request]
    (-> this (.getDeviceDefinition request))))

(defn list-group-versions
  "Lists the versions of a group.

  request - `com.amazonaws.services.greengrass.model.ListGroupVersionsRequest`

  returns: Result of the ListGroupVersions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListGroupVersionsResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.ListGroupVersionsResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.ListGroupVersionsRequest request]
    (-> this (.listGroupVersions request))))

(defn list-core-definitions
  "Retrieves a list of core definitions.

  request - `com.amazonaws.services.greengrass.model.ListCoreDefinitionsRequest`

  returns: Result of the ListCoreDefinitions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListCoreDefinitionsResult`"
  (^com.amazonaws.services.greengrass.model.ListCoreDefinitionsResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.ListCoreDefinitionsRequest request]
    (-> this (.listCoreDefinitions request))))

(defn disassociate-service-role-from-account
  "Disassociates the service role from your account. Without a service role, deployments will not work.

  request - `com.amazonaws.services.greengrass.model.DisassociateServiceRoleFromAccountRequest`

  returns: Result of the DisassociateServiceRoleFromAccount operation returned by the service. - `com.amazonaws.services.greengrass.model.DisassociateServiceRoleFromAccountResult`

  throws: com.amazonaws.services.greengrass.model.InternalServerErrorException - server error"
  (^com.amazonaws.services.greengrass.model.DisassociateServiceRoleFromAccountResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.DisassociateServiceRoleFromAccountRequest request]
    (-> this (.disassociateServiceRoleFromAccount request))))

(defn untag-resource
  "Remove resource tags from a Greengrass Resource.

  request - `com.amazonaws.services.greengrass.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.greengrass.model.UntagResourceResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.UntagResourceResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn get-logger-definition
  "Retrieves information about a logger definition.

  request - `com.amazonaws.services.greengrass.model.GetLoggerDefinitionRequest`

  returns: Result of the GetLoggerDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.GetLoggerDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetLoggerDefinitionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.GetLoggerDefinitionRequest request]
    (-> this (.getLoggerDefinition request))))

(defn create-resource-definition-version
  "Creates a version of a resource definition that has already been defined.

  request - `com.amazonaws.services.greengrass.model.CreateResourceDefinitionVersionRequest`

  returns: Result of the CreateResourceDefinitionVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateResourceDefinitionVersionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.CreateResourceDefinitionVersionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.CreateResourceDefinitionVersionRequest request]
    (-> this (.createResourceDefinitionVersion request))))

(defn list-function-definitions
  "Retrieves a list of Lambda function definitions.

  request - `com.amazonaws.services.greengrass.model.ListFunctionDefinitionsRequest`

  returns: Result of the ListFunctionDefinitions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListFunctionDefinitionsResult`"
  (^com.amazonaws.services.greengrass.model.ListFunctionDefinitionsResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.ListFunctionDefinitionsRequest request]
    (-> this (.listFunctionDefinitions request))))

(defn delete-device-definition
  "Deletes a device definition.

  request - `com.amazonaws.services.greengrass.model.DeleteDeviceDefinitionRequest`

  returns: Result of the DeleteDeviceDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.DeleteDeviceDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.DeleteDeviceDefinitionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.DeleteDeviceDefinitionRequest request]
    (-> this (.deleteDeviceDefinition request))))

(defn list-device-definition-versions
  "Lists the versions of a device definition.

  request - `com.amazonaws.services.greengrass.model.ListDeviceDefinitionVersionsRequest`

  returns: Result of the ListDeviceDefinitionVersions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListDeviceDefinitionVersionsResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.ListDeviceDefinitionVersionsResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.ListDeviceDefinitionVersionsRequest request]
    (-> this (.listDeviceDefinitionVersions request))))

(defn create-subscription-definition-version
  "Creates a version of a subscription definition which has already been defined.

  request - `com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionVersionRequest`

  returns: Result of the CreateSubscriptionDefinitionVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionVersionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionVersionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionVersionRequest request]
    (-> this (.createSubscriptionDefinitionVersion request))))

(defn create-core-definition
  "Creates a core definition. You may provide the initial version of the core definition now or use
   ''CreateCoreDefinitionVersion'' at a later time. Greengrass groups must each contain exactly one Greengrass core.

  request - `com.amazonaws.services.greengrass.model.CreateCoreDefinitionRequest`

  returns: Result of the CreateCoreDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateCoreDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.CreateCoreDefinitionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.CreateCoreDefinitionRequest request]
    (-> this (.createCoreDefinition request))))

(defn create-function-definition
  "Creates a Lambda function definition which contains a list of Lambda functions and their configurations to be
   used in a group. You can create an initial version of the definition by providing a list of Lambda functions and
   their configurations now, or use ''CreateFunctionDefinitionVersion'' later.

  request - `com.amazonaws.services.greengrass.model.CreateFunctionDefinitionRequest`

  returns: Result of the CreateFunctionDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateFunctionDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.CreateFunctionDefinitionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.CreateFunctionDefinitionRequest request]
    (-> this (.createFunctionDefinition request))))

(defn list-function-definition-versions
  "Lists the versions of a Lambda function definition.

  request - `com.amazonaws.services.greengrass.model.ListFunctionDefinitionVersionsRequest`

  returns: Result of the ListFunctionDefinitionVersions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListFunctionDefinitionVersionsResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.ListFunctionDefinitionVersionsResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.ListFunctionDefinitionVersionsRequest request]
    (-> this (.listFunctionDefinitionVersions request))))

(defn update-resource-definition
  "Updates a resource definition.

  request - `com.amazonaws.services.greengrass.model.UpdateResourceDefinitionRequest`

  returns: Result of the UpdateResourceDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.UpdateResourceDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.UpdateResourceDefinitionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.UpdateResourceDefinitionRequest request]
    (-> this (.updateResourceDefinition request))))

(defn create-resource-definition
  "Creates a resource definition which contains a list of resources to be used in a group. You can create an initial
   version of the definition by providing a list of resources now, or use ''CreateResourceDefinitionVersion'' later.

  request - `com.amazonaws.services.greengrass.model.CreateResourceDefinitionRequest`

  returns: Result of the CreateResourceDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateResourceDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.CreateResourceDefinitionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.CreateResourceDefinitionRequest request]
    (-> this (.createResourceDefinition request))))

(defn get-subscription-definition-version
  "Retrieves information about a subscription definition version.

  request - `com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionVersionRequest`

  returns: Result of the GetSubscriptionDefinitionVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionVersionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionVersionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionVersionRequest request]
    (-> this (.getSubscriptionDefinitionVersion request))))

(defn update-logger-definition
  "Updates a logger definition.

  request - `com.amazonaws.services.greengrass.model.UpdateLoggerDefinitionRequest`

  returns: Result of the UpdateLoggerDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.UpdateLoggerDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.UpdateLoggerDefinitionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.UpdateLoggerDefinitionRequest request]
    (-> this (.updateLoggerDefinition request))))

(defn associate-service-role-to-account
  "Associates a role with your account. AWS IoT Greengrass will use the role to access your Lambda functions and AWS
   IoT resources. This is necessary for deployments to succeed. The role must have at least minimum permissions in
   the policy ''AWSGreengrassResourceAccessRolePolicy''.

  request - `com.amazonaws.services.greengrass.model.AssociateServiceRoleToAccountRequest`

  returns: Result of the AssociateServiceRoleToAccount operation returned by the service. - `com.amazonaws.services.greengrass.model.AssociateServiceRoleToAccountResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.AssociateServiceRoleToAccountResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.AssociateServiceRoleToAccountRequest request]
    (-> this (.associateServiceRoleToAccount request))))

(defn list-device-definitions
  "Retrieves a list of device definitions.

  request - `com.amazonaws.services.greengrass.model.ListDeviceDefinitionsRequest`

  returns: Result of the ListDeviceDefinitions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListDeviceDefinitionsResult`"
  (^com.amazonaws.services.greengrass.model.ListDeviceDefinitionsResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.ListDeviceDefinitionsRequest request]
    (-> this (.listDeviceDefinitions request))))

(defn get-deployment-status
  "Returns the status of a deployment.

  request - `com.amazonaws.services.greengrass.model.GetDeploymentStatusRequest`

  returns: Result of the GetDeploymentStatus operation returned by the service. - `com.amazonaws.services.greengrass.model.GetDeploymentStatusResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetDeploymentStatusResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.GetDeploymentStatusRequest request]
    (-> this (.getDeploymentStatus request))))

(defn get-group-version
  "Retrieves information about a group version.

  request - `com.amazonaws.services.greengrass.model.GetGroupVersionRequest`

  returns: Result of the GetGroupVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.GetGroupVersionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetGroupVersionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.GetGroupVersionRequest request]
    (-> this (.getGroupVersion request))))

(defn create-deployment
  "Creates a deployment. ''CreateDeployment'' requests are idempotent with respect to the ''X-Amzn-Client-Token''
   token and the request parameters.

  request - `com.amazonaws.services.greengrass.model.CreateDeploymentRequest`

  returns: Result of the CreateDeployment operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateDeploymentResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.CreateDeploymentResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.CreateDeploymentRequest request]
    (-> this (.createDeployment request))))

(defn list-logger-definitions
  "Retrieves a list of logger definitions.

  request - `com.amazonaws.services.greengrass.model.ListLoggerDefinitionsRequest`

  returns: Result of the ListLoggerDefinitions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListLoggerDefinitionsResult`"
  (^com.amazonaws.services.greengrass.model.ListLoggerDefinitionsResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.ListLoggerDefinitionsRequest request]
    (-> this (.listLoggerDefinitions request))))

(defn get-resource-definition-version
  "Retrieves information about a resource definition version, including which resources are included in the version.

  request - `com.amazonaws.services.greengrass.model.GetResourceDefinitionVersionRequest`

  returns: Result of the GetResourceDefinitionVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.GetResourceDefinitionVersionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetResourceDefinitionVersionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.GetResourceDefinitionVersionRequest request]
    (-> this (.getResourceDefinitionVersion request))))

(defn list-bulk-deployment-detailed-reports
  "Gets a paginated list of the deployments that have been started in a bulk deployment operation, and their current
   deployment status.

  request - `com.amazonaws.services.greengrass.model.ListBulkDeploymentDetailedReportsRequest`

  returns: Result of the ListBulkDeploymentDetailedReports operation returned by the service. - `com.amazonaws.services.greengrass.model.ListBulkDeploymentDetailedReportsResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.ListBulkDeploymentDetailedReportsResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.ListBulkDeploymentDetailedReportsRequest request]
    (-> this (.listBulkDeploymentDetailedReports request))))

(defn create-connector-definition-version
  "Creates a version of a connector definition which has already been defined.

  request - `com.amazonaws.services.greengrass.model.CreateConnectorDefinitionVersionRequest`

  returns: Result of the CreateConnectorDefinitionVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateConnectorDefinitionVersionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.CreateConnectorDefinitionVersionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.CreateConnectorDefinitionVersionRequest request]
    (-> this (.createConnectorDefinitionVersion request))))

(defn list-bulk-deployments
  "Returns a list of bulk deployments.

  request - `com.amazonaws.services.greengrass.model.ListBulkDeploymentsRequest`

  returns: Result of the ListBulkDeployments operation returned by the service. - `com.amazonaws.services.greengrass.model.ListBulkDeploymentsResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.ListBulkDeploymentsResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.ListBulkDeploymentsRequest request]
    (-> this (.listBulkDeployments request))))

(defn reset-deployments
  "Resets a group's deployments.

  request - `com.amazonaws.services.greengrass.model.ResetDeploymentsRequest`

  returns: Result of the ResetDeployments operation returned by the service. - `com.amazonaws.services.greengrass.model.ResetDeploymentsResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.ResetDeploymentsResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.ResetDeploymentsRequest request]
    (-> this (.resetDeployments request))))

(defn list-resource-definition-versions
  "Lists the versions of a resource definition.

  request - `com.amazonaws.services.greengrass.model.ListResourceDefinitionVersionsRequest`

  returns: Result of the ListResourceDefinitionVersions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListResourceDefinitionVersionsResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.ListResourceDefinitionVersionsResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.ListResourceDefinitionVersionsRequest request]
    (-> this (.listResourceDefinitionVersions request))))

(defn list-group-certificate-authorities
  "Retrieves the current CAs for a group.

  request - `com.amazonaws.services.greengrass.model.ListGroupCertificateAuthoritiesRequest`

  returns: Result of the ListGroupCertificateAuthorities operation returned by the service. - `com.amazonaws.services.greengrass.model.ListGroupCertificateAuthoritiesResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.ListGroupCertificateAuthoritiesResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.ListGroupCertificateAuthoritiesRequest request]
    (-> this (.listGroupCertificateAuthorities request))))

(defn get-resource-definition
  "Retrieves information about a resource definition, including its creation time and latest version.

  request - `com.amazonaws.services.greengrass.model.GetResourceDefinitionRequest`

  returns: Result of the GetResourceDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.GetResourceDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetResourceDefinitionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.GetResourceDefinitionRequest request]
    (-> this (.getResourceDefinition request))))

(defn create-core-definition-version
  "Creates a version of a core definition that has already been defined. Greengrass groups must each contain exactly
   one Greengrass core.

  request - `com.amazonaws.services.greengrass.model.CreateCoreDefinitionVersionRequest`

  returns: Result of the CreateCoreDefinitionVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateCoreDefinitionVersionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.CreateCoreDefinitionVersionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.CreateCoreDefinitionVersionRequest request]
    (-> this (.createCoreDefinitionVersion request))))

(defn list-deployments
  "Returns a history of deployments for the group.

  request - `com.amazonaws.services.greengrass.model.ListDeploymentsRequest`

  returns: Result of the ListDeployments operation returned by the service. - `com.amazonaws.services.greengrass.model.ListDeploymentsResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.ListDeploymentsResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.ListDeploymentsRequest request]
    (-> this (.listDeployments request))))

(defn list-core-definition-versions
  "Lists the versions of a core definition.

  request - `com.amazonaws.services.greengrass.model.ListCoreDefinitionVersionsRequest`

  returns: Result of the ListCoreDefinitionVersions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListCoreDefinitionVersionsResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.ListCoreDefinitionVersionsResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.ListCoreDefinitionVersionsRequest request]
    (-> this (.listCoreDefinitionVersions request))))

(defn list-connector-definitions
  "Retrieves a list of connector definitions.

  request - `com.amazonaws.services.greengrass.model.ListConnectorDefinitionsRequest`

  returns: Result of the ListConnectorDefinitions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListConnectorDefinitionsResult`"
  (^com.amazonaws.services.greengrass.model.ListConnectorDefinitionsResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.ListConnectorDefinitionsRequest request]
    (-> this (.listConnectorDefinitions request))))

(defn get-core-definition
  "Retrieves information about a core definition version.

  request - `com.amazonaws.services.greengrass.model.GetCoreDefinitionRequest`

  returns: Result of the GetCoreDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.GetCoreDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetCoreDefinitionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.GetCoreDefinitionRequest request]
    (-> this (.getCoreDefinition request))))

(defn create-logger-definition
  "Creates a logger definition. You may provide the initial version of the logger definition now or use
   ''CreateLoggerDefinitionVersion'' at a later time.

  request - `com.amazonaws.services.greengrass.model.CreateLoggerDefinitionRequest`

  returns: Result of the CreateLoggerDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateLoggerDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.CreateLoggerDefinitionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.CreateLoggerDefinitionRequest request]
    (-> this (.createLoggerDefinition request))))

(defn update-function-definition
  "Updates a Lambda function definition.

  request - `com.amazonaws.services.greengrass.model.UpdateFunctionDefinitionRequest`

  returns: Result of the UpdateFunctionDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.UpdateFunctionDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.UpdateFunctionDefinitionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.UpdateFunctionDefinitionRequest request]
    (-> this (.updateFunctionDefinition request))))

(defn create-device-definition-version
  "Creates a version of a device definition that has already been defined.

  request - `com.amazonaws.services.greengrass.model.CreateDeviceDefinitionVersionRequest`

  returns: Result of the CreateDeviceDefinitionVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateDeviceDefinitionVersionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.CreateDeviceDefinitionVersionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.CreateDeviceDefinitionVersionRequest request]
    (-> this (.createDeviceDefinitionVersion request))))

(defn delete-subscription-definition
  "Deletes a subscription definition.

  request - `com.amazonaws.services.greengrass.model.DeleteSubscriptionDefinitionRequest`

  returns: Result of the DeleteSubscriptionDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.DeleteSubscriptionDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.DeleteSubscriptionDefinitionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.DeleteSubscriptionDefinitionRequest request]
    (-> this (.deleteSubscriptionDefinition request))))

(defn list-logger-definition-versions
  "Lists the versions of a logger definition.

  request - `com.amazonaws.services.greengrass.model.ListLoggerDefinitionVersionsRequest`

  returns: Result of the ListLoggerDefinitionVersions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListLoggerDefinitionVersionsResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.ListLoggerDefinitionVersionsResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.ListLoggerDefinitionVersionsRequest request]
    (-> this (.listLoggerDefinitionVersions request))))

(defn create-software-update-job
  "Creates a software update for a core or group of cores (specified as an IoT thing group.) Use this to update the
   OTA Agent as well as the Greengrass core software. It makes use of the IoT Jobs feature which provides additional
   commands to manage a Greengrass core software update job.

  request - `com.amazonaws.services.greengrass.model.CreateSoftwareUpdateJobRequest`

  returns: Result of the CreateSoftwareUpdateJob operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateSoftwareUpdateJobResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.CreateSoftwareUpdateJobResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.CreateSoftwareUpdateJobRequest request]
    (-> this (.createSoftwareUpdateJob request))))

(defn disassociate-role-from-group
  "Disassociates the role from a group.

  request - `com.amazonaws.services.greengrass.model.DisassociateRoleFromGroupRequest`

  returns: Result of the DisassociateRoleFromGroup operation returned by the service. - `com.amazonaws.services.greengrass.model.DisassociateRoleFromGroupResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.DisassociateRoleFromGroupResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.DisassociateRoleFromGroupRequest request]
    (-> this (.disassociateRoleFromGroup request))))

(defn update-connector-definition
  "Updates a connector definition.

  request - `com.amazonaws.services.greengrass.model.UpdateConnectorDefinitionRequest`

  returns: Result of the UpdateConnectorDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.UpdateConnectorDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.UpdateConnectorDefinitionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.UpdateConnectorDefinitionRequest request]
    (-> this (.updateConnectorDefinition request))))

(defn get-associated-role
  "Retrieves the role associated with a particular group.

  request - `com.amazonaws.services.greengrass.model.GetAssociatedRoleRequest`

  returns: Result of the GetAssociatedRole operation returned by the service. - `com.amazonaws.services.greengrass.model.GetAssociatedRoleResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetAssociatedRoleResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.GetAssociatedRoleRequest request]
    (-> this (.getAssociatedRole request))))

(defn list-resource-definitions
  "Retrieves a list of resource definitions.

  request - `com.amazonaws.services.greengrass.model.ListResourceDefinitionsRequest`

  returns: Result of the ListResourceDefinitions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListResourceDefinitionsResult`"
  (^com.amazonaws.services.greengrass.model.ListResourceDefinitionsResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.ListResourceDefinitionsRequest request]
    (-> this (.listResourceDefinitions request))))

(defn delete-connector-definition
  "Deletes a connector definition.

  request - `com.amazonaws.services.greengrass.model.DeleteConnectorDefinitionRequest`

  returns: Result of the DeleteConnectorDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.DeleteConnectorDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.DeleteConnectorDefinitionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.DeleteConnectorDefinitionRequest request]
    (-> this (.deleteConnectorDefinition request))))

(defn list-groups
  "Retrieves a list of groups.

  request - `com.amazonaws.services.greengrass.model.ListGroupsRequest`

  returns: Result of the ListGroups operation returned by the service. - `com.amazonaws.services.greengrass.model.ListGroupsResult`"
  (^com.amazonaws.services.greengrass.model.ListGroupsResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.ListGroupsRequest request]
    (-> this (.listGroups request))))

(defn delete-function-definition
  "Deletes a Lambda function definition.

  request - `com.amazonaws.services.greengrass.model.DeleteFunctionDefinitionRequest`

  returns: Result of the DeleteFunctionDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.DeleteFunctionDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.DeleteFunctionDefinitionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.DeleteFunctionDefinitionRequest request]
    (-> this (.deleteFunctionDefinition request))))

(defn update-core-definition
  "Updates a core definition.

  request - `com.amazonaws.services.greengrass.model.UpdateCoreDefinitionRequest`

  returns: Result of the UpdateCoreDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.UpdateCoreDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.UpdateCoreDefinitionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.UpdateCoreDefinitionRequest request]
    (-> this (.updateCoreDefinition request))))

(defn get-connectivity-info
  "Retrieves the connectivity information for a core.

  request - `com.amazonaws.services.greengrass.model.GetConnectivityInfoRequest`

  returns: Result of the GetConnectivityInfo operation returned by the service. - `com.amazonaws.services.greengrass.model.GetConnectivityInfoResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetConnectivityInfoResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.GetConnectivityInfoRequest request]
    (-> this (.getConnectivityInfo request))))

(defn get-group-certificate-authority
  "Retreives the CA associated with a group. Returns the public key of the CA.

  request - `com.amazonaws.services.greengrass.model.GetGroupCertificateAuthorityRequest`

  returns: Result of the GetGroupCertificateAuthority operation returned by the service. - `com.amazonaws.services.greengrass.model.GetGroupCertificateAuthorityResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetGroupCertificateAuthorityResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.GetGroupCertificateAuthorityRequest request]
    (-> this (.getGroupCertificateAuthority request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSGreengrassClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn list-subscription-definition-versions
  "Lists the versions of a subscription definition.

  request - `com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionVersionsRequest`

  returns: Result of the ListSubscriptionDefinitionVersions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionVersionsResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionVersionsResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionVersionsRequest request]
    (-> this (.listSubscriptionDefinitionVersions request))))

(defn start-bulk-deployment
  "Deploys multiple groups in one operation. This action starts the bulk deployment of a specified set of group
   versions. Each group version deployment will be triggered with an adaptive rate that has a fixed upper limit. We
   recommend that you include an ''X-Amzn-Client-Token'' token in every ''StartBulkDeployment'' request. These
   requests are idempotent with respect to the token and the request parameters.

  request - `com.amazonaws.services.greengrass.model.StartBulkDeploymentRequest`

  returns: Result of the StartBulkDeployment operation returned by the service. - `com.amazonaws.services.greengrass.model.StartBulkDeploymentResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.StartBulkDeploymentResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.StartBulkDeploymentRequest request]
    (-> this (.startBulkDeployment request))))

(defn delete-logger-definition
  "Deletes a logger definition.

  request - `com.amazonaws.services.greengrass.model.DeleteLoggerDefinitionRequest`

  returns: Result of the DeleteLoggerDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.DeleteLoggerDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.DeleteLoggerDefinitionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.DeleteLoggerDefinitionRequest request]
    (-> this (.deleteLoggerDefinition request))))

(defn update-connectivity-info
  "Updates the connectivity information for the core. Any devices that belong to the group which has this core will
   receive this information in order to find the location of the core and connect to it.

  request - `com.amazonaws.services.greengrass.model.UpdateConnectivityInfoRequest`

  returns: Result of the UpdateConnectivityInfo operation returned by the service. - `com.amazonaws.services.greengrass.model.UpdateConnectivityInfoResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.UpdateConnectivityInfoResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.UpdateConnectivityInfoRequest request]
    (-> this (.updateConnectivityInfo request))))

(defn stop-bulk-deployment
  "Stops the execution of a bulk deployment. This action returns a status of ''Stopping'' until the deployment is
   stopped. You cannot start a new bulk deployment while a previous deployment is in the ''Stopping'' state. This
   action doesn't rollback completed deployments or cancel pending deployments.

  request - `com.amazonaws.services.greengrass.model.StopBulkDeploymentRequest`

  returns: Result of the StopBulkDeployment operation returned by the service. - `com.amazonaws.services.greengrass.model.StopBulkDeploymentResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.StopBulkDeploymentResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.StopBulkDeploymentRequest request]
    (-> this (.stopBulkDeployment request))))

(defn tag-resource
  "Add resource tags to a Greengrass Resource. Valid resources are Group, Connector, Core, Device, Function, Logger,
   Subscription, and Resource Defintions, and also BulkDeploymentIds.

  request - `com.amazonaws.services.greengrass.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.greengrass.model.TagResourceResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.TagResourceResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn create-group-version
  "Creates a version of a group which has already been defined.

  request - `com.amazonaws.services.greengrass.model.CreateGroupVersionRequest`

  returns: Result of the CreateGroupVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateGroupVersionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.CreateGroupVersionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.CreateGroupVersionRequest request]
    (-> this (.createGroupVersion request))))

(defn update-device-definition
  "Updates a device definition.

  request - `com.amazonaws.services.greengrass.model.UpdateDeviceDefinitionRequest`

  returns: Result of the UpdateDeviceDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.UpdateDeviceDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.UpdateDeviceDefinitionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.UpdateDeviceDefinitionRequest request]
    (-> this (.updateDeviceDefinition request))))

(defn get-connector-definition
  "Retrieves information about a connector definition.

  request - `com.amazonaws.services.greengrass.model.GetConnectorDefinitionRequest`

  returns: Result of the GetConnectorDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.GetConnectorDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetConnectorDefinitionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.GetConnectorDefinitionRequest request]
    (-> this (.getConnectorDefinition request))))

(defn get-core-definition-version
  "Retrieves information about a core definition version.

  request - `com.amazonaws.services.greengrass.model.GetCoreDefinitionVersionRequest`

  returns: Result of the GetCoreDefinitionVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.GetCoreDefinitionVersionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetCoreDefinitionVersionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.GetCoreDefinitionVersionRequest request]
    (-> this (.getCoreDefinitionVersion request))))

(defn get-logger-definition-version
  "Retrieves information about a logger definition version.

  request - `com.amazonaws.services.greengrass.model.GetLoggerDefinitionVersionRequest`

  returns: Result of the GetLoggerDefinitionVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.GetLoggerDefinitionVersionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetLoggerDefinitionVersionResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.GetLoggerDefinitionVersionRequest request]
    (-> this (.getLoggerDefinitionVersion request))))

(defn get-group
  "Retrieves information about a group.

  request - `com.amazonaws.services.greengrass.model.GetGroupRequest`

  returns: Result of the GetGroup operation returned by the service. - `com.amazonaws.services.greengrass.model.GetGroupResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetGroupResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.GetGroupRequest request]
    (-> this (.getGroup request))))

(defn get-group-certificate-configuration
  "Retrieves the current configuration for the CA used by the group.

  request - `com.amazonaws.services.greengrass.model.GetGroupCertificateConfigurationRequest`

  returns: Result of the GetGroupCertificateConfiguration operation returned by the service. - `com.amazonaws.services.greengrass.model.GetGroupCertificateConfigurationResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetGroupCertificateConfigurationResult [^AWSGreengrassClient this ^com.amazonaws.services.greengrass.model.GetGroupCertificateConfigurationRequest request]
    (-> this (.getGroupCertificateConfiguration request))))

