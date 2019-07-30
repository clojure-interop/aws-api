(ns com.amazonaws.services.greengrass.AWSGreengrass
  "Interface for accessing AWS Greengrass.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSGreengrass instead.


  AWS IoT Greengrass seamlessly extends AWS onto physical devices so they can act locally on the data they generate,
  while still using the cloud for management, analytics, and durable storage. AWS IoT Greengrass ensures your devices
  can respond quickly to local events and operate with intermittent connectivity. AWS IoT Greengrass minimizes the cost
  of transmitting data to the cloud by allowing you to author AWS Lambda functions that execute locally."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.greengrass AWSGreengrass]))

(defn delete-group
  "Deletes a group.

  delete-group-request - `com.amazonaws.services.greengrass.model.DeleteGroupRequest`

  returns: Result of the DeleteGroup operation returned by the service. - `com.amazonaws.services.greengrass.model.DeleteGroupResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.DeleteGroupResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.DeleteGroupRequest delete-group-request]
    (-> this (.deleteGroup delete-group-request))))

(defn create-device-definition
  "Creates a device definition. You may provide the initial version of the device definition now or use
   ''CreateDeviceDefinitionVersion'' at a later time.

  create-device-definition-request - `com.amazonaws.services.greengrass.model.CreateDeviceDefinitionRequest`

  returns: Result of the CreateDeviceDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateDeviceDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.CreateDeviceDefinitionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.CreateDeviceDefinitionRequest create-device-definition-request]
    (-> this (.createDeviceDefinition create-device-definition-request))))

(defn create-group-certificate-authority
  "Creates a CA for the group. If a CA already exists, it will rotate the existing CA.

  create-group-certificate-authority-request - `com.amazonaws.services.greengrass.model.CreateGroupCertificateAuthorityRequest`

  returns: Result of the CreateGroupCertificateAuthority operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateGroupCertificateAuthorityResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.CreateGroupCertificateAuthorityResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.CreateGroupCertificateAuthorityRequest create-group-certificate-authority-request]
    (-> this (.createGroupCertificateAuthority create-group-certificate-authority-request))))

(defn update-group
  "Updates a group.

  update-group-request - `com.amazonaws.services.greengrass.model.UpdateGroupRequest`

  returns: Result of the UpdateGroup operation returned by the service. - `com.amazonaws.services.greengrass.model.UpdateGroupResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.UpdateGroupResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.UpdateGroupRequest update-group-request]
    (-> this (.updateGroup update-group-request))))

(defn get-bulk-deployment-status
  "Returns the status of a bulk deployment.

  get-bulk-deployment-status-request - `com.amazonaws.services.greengrass.model.GetBulkDeploymentStatusRequest`

  returns: Result of the GetBulkDeploymentStatus operation returned by the service. - `com.amazonaws.services.greengrass.model.GetBulkDeploymentStatusResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetBulkDeploymentStatusResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.GetBulkDeploymentStatusRequest get-bulk-deployment-status-request]
    (-> this (.getBulkDeploymentStatus get-bulk-deployment-status-request))))

(defn create-logger-definition-version
  "Creates a version of a logger definition that has already been defined.

  create-logger-definition-version-request - `com.amazonaws.services.greengrass.model.CreateLoggerDefinitionVersionRequest`

  returns: Result of the CreateLoggerDefinitionVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateLoggerDefinitionVersionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.CreateLoggerDefinitionVersionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.CreateLoggerDefinitionVersionRequest create-logger-definition-version-request]
    (-> this (.createLoggerDefinitionVersion create-logger-definition-version-request))))

(defn list-tags-for-resource
  "Retrieves a list of resource tags for a resource arn.

  list-tags-for-resource-request - `com.amazonaws.services.greengrass.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.greengrass.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.ListTagsForResourceResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn get-function-definition
  "Retrieves information about a Lambda function definition, including its creation time and latest version.

  get-function-definition-request - `com.amazonaws.services.greengrass.model.GetFunctionDefinitionRequest`

  returns: Result of the GetFunctionDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.GetFunctionDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetFunctionDefinitionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.GetFunctionDefinitionRequest get-function-definition-request]
    (-> this (.getFunctionDefinition get-function-definition-request))))

(defn create-connector-definition
  "Creates a connector definition. You may provide the initial version of the connector definition now or use
   ''CreateConnectorDefinitionVersion'' at a later time.

  create-connector-definition-request - `com.amazonaws.services.greengrass.model.CreateConnectorDefinitionRequest`

  returns: Result of the CreateConnectorDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateConnectorDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.CreateConnectorDefinitionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.CreateConnectorDefinitionRequest create-connector-definition-request]
    (-> this (.createConnectorDefinition create-connector-definition-request))))

(defn get-subscription-definition
  "Retrieves information about a subscription definition.

  get-subscription-definition-request - `com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionRequest`

  returns: Result of the GetSubscriptionDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionRequest get-subscription-definition-request]
    (-> this (.getSubscriptionDefinition get-subscription-definition-request))))

(defn get-connector-definition-version
  "Retrieves information about a connector definition version, including the connectors that the version contains.
   Connectors are prebuilt modules that interact with local infrastructure, device protocols, AWS, and other cloud
   services.

  get-connector-definition-version-request - `com.amazonaws.services.greengrass.model.GetConnectorDefinitionVersionRequest`

  returns: Result of the GetConnectorDefinitionVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.GetConnectorDefinitionVersionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetConnectorDefinitionVersionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.GetConnectorDefinitionVersionRequest get-connector-definition-version-request]
    (-> this (.getConnectorDefinitionVersion get-connector-definition-version-request))))

(defn get-device-definition-version
  "Retrieves information about a device definition version.

  get-device-definition-version-request - `com.amazonaws.services.greengrass.model.GetDeviceDefinitionVersionRequest`

  returns: Result of the GetDeviceDefinitionVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.GetDeviceDefinitionVersionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetDeviceDefinitionVersionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.GetDeviceDefinitionVersionRequest get-device-definition-version-request]
    (-> this (.getDeviceDefinitionVersion get-device-definition-version-request))))

(defn delete-resource-definition
  "Deletes a resource definition.

  delete-resource-definition-request - `com.amazonaws.services.greengrass.model.DeleteResourceDefinitionRequest`

  returns: Result of the DeleteResourceDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.DeleteResourceDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.DeleteResourceDefinitionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.DeleteResourceDefinitionRequest delete-resource-definition-request]
    (-> this (.deleteResourceDefinition delete-resource-definition-request))))

(defn list-subscription-definitions
  "Retrieves a list of subscription definitions.

  list-subscription-definitions-request - `com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionsRequest`

  returns: Result of the ListSubscriptionDefinitions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionsResult`"
  (^com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionsResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionsRequest list-subscription-definitions-request]
    (-> this (.listSubscriptionDefinitions list-subscription-definitions-request))))

(defn create-function-definition-version
  "Creates a version of a Lambda function definition that has already been defined.

  create-function-definition-version-request - Information needed to create a function definition version. - `com.amazonaws.services.greengrass.model.CreateFunctionDefinitionVersionRequest`

  returns: Result of the CreateFunctionDefinitionVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateFunctionDefinitionVersionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.CreateFunctionDefinitionVersionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.CreateFunctionDefinitionVersionRequest create-function-definition-version-request]
    (-> this (.createFunctionDefinitionVersion create-function-definition-version-request))))

(defn update-group-certificate-configuration
  "Updates the Certificate expiry time for a group.

  update-group-certificate-configuration-request - `com.amazonaws.services.greengrass.model.UpdateGroupCertificateConfigurationRequest`

  returns: Result of the UpdateGroupCertificateConfiguration operation returned by the service. - `com.amazonaws.services.greengrass.model.UpdateGroupCertificateConfigurationResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.UpdateGroupCertificateConfigurationResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.UpdateGroupCertificateConfigurationRequest update-group-certificate-configuration-request]
    (-> this (.updateGroupCertificateConfiguration update-group-certificate-configuration-request))))

(defn create-group
  "Creates a group. You may provide the initial version of the group or use ''CreateGroupVersion'' at a later time.
   Tip: You can use the ''gg_group_setup'' package (https://github.com/awslabs/aws-greengrass-group-setup) as a
   library or command-line application to create and deploy Greengrass groups.

  create-group-request - `com.amazonaws.services.greengrass.model.CreateGroupRequest`

  returns: Result of the CreateGroup operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateGroupResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.CreateGroupResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.CreateGroupRequest create-group-request]
    (-> this (.createGroup create-group-request))))

(defn associate-role-to-group
  "Associates a role with a group. Your Greengrass core will use the role to access AWS cloud services. The role's
   permissions should allow Greengrass core Lambda functions to perform actions against the cloud.

  associate-role-to-group-request - `com.amazonaws.services.greengrass.model.AssociateRoleToGroupRequest`

  returns: Result of the AssociateRoleToGroup operation returned by the service. - `com.amazonaws.services.greengrass.model.AssociateRoleToGroupResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.AssociateRoleToGroupResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.AssociateRoleToGroupRequest associate-role-to-group-request]
    (-> this (.associateRoleToGroup associate-role-to-group-request))))

(defn get-function-definition-version
  "Retrieves information about a Lambda function definition version, including which Lambda functions are included
   in the version and their configurations.

  get-function-definition-version-request - `com.amazonaws.services.greengrass.model.GetFunctionDefinitionVersionRequest`

  returns: Result of the GetFunctionDefinitionVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.GetFunctionDefinitionVersionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetFunctionDefinitionVersionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.GetFunctionDefinitionVersionRequest get-function-definition-version-request]
    (-> this (.getFunctionDefinitionVersion get-function-definition-version-request))))

(defn create-subscription-definition
  "Creates a subscription definition. You may provide the initial version of the subscription definition now or use
   ''CreateSubscriptionDefinitionVersion'' at a later time.

  create-subscription-definition-request - `com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionRequest`

  returns: Result of the CreateSubscriptionDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionRequest create-subscription-definition-request]
    (-> this (.createSubscriptionDefinition create-subscription-definition-request))))

(defn get-service-role-for-account
  "Retrieves the service role that is attached to your account.

  get-service-role-for-account-request - `com.amazonaws.services.greengrass.model.GetServiceRoleForAccountRequest`

  returns: Result of the GetServiceRoleForAccount operation returned by the service. - `com.amazonaws.services.greengrass.model.GetServiceRoleForAccountResult`

  throws: com.amazonaws.services.greengrass.model.InternalServerErrorException - server error"
  (^com.amazonaws.services.greengrass.model.GetServiceRoleForAccountResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.GetServiceRoleForAccountRequest get-service-role-for-account-request]
    (-> this (.getServiceRoleForAccount get-service-role-for-account-request))))

(defn list-connector-definition-versions
  "Lists the versions of a connector definition, which are containers for connectors. Connectors run on the
   Greengrass core and contain built-in integration with local infrastructure, device protocols, AWS, and other
   cloud services.

  list-connector-definition-versions-request - `com.amazonaws.services.greengrass.model.ListConnectorDefinitionVersionsRequest`

  returns: Result of the ListConnectorDefinitionVersions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListConnectorDefinitionVersionsResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.ListConnectorDefinitionVersionsResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.ListConnectorDefinitionVersionsRequest list-connector-definition-versions-request]
    (-> this (.listConnectorDefinitionVersions list-connector-definition-versions-request))))

(defn delete-core-definition
  "Deletes a core definition.

  delete-core-definition-request - `com.amazonaws.services.greengrass.model.DeleteCoreDefinitionRequest`

  returns: Result of the DeleteCoreDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.DeleteCoreDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.DeleteCoreDefinitionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.DeleteCoreDefinitionRequest delete-core-definition-request]
    (-> this (.deleteCoreDefinition delete-core-definition-request))))

(defn update-subscription-definition
  "Updates a subscription definition.

  update-subscription-definition-request - `com.amazonaws.services.greengrass.model.UpdateSubscriptionDefinitionRequest`

  returns: Result of the UpdateSubscriptionDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.UpdateSubscriptionDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.UpdateSubscriptionDefinitionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.UpdateSubscriptionDefinitionRequest update-subscription-definition-request]
    (-> this (.updateSubscriptionDefinition update-subscription-definition-request))))

(defn get-device-definition
  "Retrieves information about a device definition.

  get-device-definition-request - `com.amazonaws.services.greengrass.model.GetDeviceDefinitionRequest`

  returns: Result of the GetDeviceDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.GetDeviceDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetDeviceDefinitionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.GetDeviceDefinitionRequest get-device-definition-request]
    (-> this (.getDeviceDefinition get-device-definition-request))))

(defn list-group-versions
  "Lists the versions of a group.

  list-group-versions-request - `com.amazonaws.services.greengrass.model.ListGroupVersionsRequest`

  returns: Result of the ListGroupVersions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListGroupVersionsResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.ListGroupVersionsResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.ListGroupVersionsRequest list-group-versions-request]
    (-> this (.listGroupVersions list-group-versions-request))))

(defn list-core-definitions
  "Retrieves a list of core definitions.

  list-core-definitions-request - `com.amazonaws.services.greengrass.model.ListCoreDefinitionsRequest`

  returns: Result of the ListCoreDefinitions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListCoreDefinitionsResult`"
  (^com.amazonaws.services.greengrass.model.ListCoreDefinitionsResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.ListCoreDefinitionsRequest list-core-definitions-request]
    (-> this (.listCoreDefinitions list-core-definitions-request))))

(defn disassociate-service-role-from-account
  "Disassociates the service role from your account. Without a service role, deployments will not work.

  disassociate-service-role-from-account-request - `com.amazonaws.services.greengrass.model.DisassociateServiceRoleFromAccountRequest`

  returns: Result of the DisassociateServiceRoleFromAccount operation returned by the service. - `com.amazonaws.services.greengrass.model.DisassociateServiceRoleFromAccountResult`

  throws: com.amazonaws.services.greengrass.model.InternalServerErrorException - server error"
  (^com.amazonaws.services.greengrass.model.DisassociateServiceRoleFromAccountResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.DisassociateServiceRoleFromAccountRequest disassociate-service-role-from-account-request]
    (-> this (.disassociateServiceRoleFromAccount disassociate-service-role-from-account-request))))

(defn untag-resource
  "Remove resource tags from a Greengrass Resource.

  untag-resource-request - `com.amazonaws.services.greengrass.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.greengrass.model.UntagResourceResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.UntagResourceResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn get-logger-definition
  "Retrieves information about a logger definition.

  get-logger-definition-request - `com.amazonaws.services.greengrass.model.GetLoggerDefinitionRequest`

  returns: Result of the GetLoggerDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.GetLoggerDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetLoggerDefinitionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.GetLoggerDefinitionRequest get-logger-definition-request]
    (-> this (.getLoggerDefinition get-logger-definition-request))))

(defn create-resource-definition-version
  "Creates a version of a resource definition that has already been defined.

  create-resource-definition-version-request - `com.amazonaws.services.greengrass.model.CreateResourceDefinitionVersionRequest`

  returns: Result of the CreateResourceDefinitionVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateResourceDefinitionVersionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.CreateResourceDefinitionVersionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.CreateResourceDefinitionVersionRequest create-resource-definition-version-request]
    (-> this (.createResourceDefinitionVersion create-resource-definition-version-request))))

(defn list-function-definitions
  "Retrieves a list of Lambda function definitions.

  list-function-definitions-request - `com.amazonaws.services.greengrass.model.ListFunctionDefinitionsRequest`

  returns: Result of the ListFunctionDefinitions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListFunctionDefinitionsResult`"
  (^com.amazonaws.services.greengrass.model.ListFunctionDefinitionsResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.ListFunctionDefinitionsRequest list-function-definitions-request]
    (-> this (.listFunctionDefinitions list-function-definitions-request))))

(defn delete-device-definition
  "Deletes a device definition.

  delete-device-definition-request - `com.amazonaws.services.greengrass.model.DeleteDeviceDefinitionRequest`

  returns: Result of the DeleteDeviceDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.DeleteDeviceDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.DeleteDeviceDefinitionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.DeleteDeviceDefinitionRequest delete-device-definition-request]
    (-> this (.deleteDeviceDefinition delete-device-definition-request))))

(defn list-device-definition-versions
  "Lists the versions of a device definition.

  list-device-definition-versions-request - `com.amazonaws.services.greengrass.model.ListDeviceDefinitionVersionsRequest`

  returns: Result of the ListDeviceDefinitionVersions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListDeviceDefinitionVersionsResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.ListDeviceDefinitionVersionsResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.ListDeviceDefinitionVersionsRequest list-device-definition-versions-request]
    (-> this (.listDeviceDefinitionVersions list-device-definition-versions-request))))

(defn create-subscription-definition-version
  "Creates a version of a subscription definition which has already been defined.

  create-subscription-definition-version-request - `com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionVersionRequest`

  returns: Result of the CreateSubscriptionDefinitionVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionVersionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionVersionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionVersionRequest create-subscription-definition-version-request]
    (-> this (.createSubscriptionDefinitionVersion create-subscription-definition-version-request))))

(defn create-core-definition
  "Creates a core definition. You may provide the initial version of the core definition now or use
   ''CreateCoreDefinitionVersion'' at a later time. Greengrass groups must each contain exactly one Greengrass core.

  create-core-definition-request - Information needed to create a core definition. - `com.amazonaws.services.greengrass.model.CreateCoreDefinitionRequest`

  returns: Result of the CreateCoreDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateCoreDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.CreateCoreDefinitionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.CreateCoreDefinitionRequest create-core-definition-request]
    (-> this (.createCoreDefinition create-core-definition-request))))

(defn create-function-definition
  "Creates a Lambda function definition which contains a list of Lambda functions and their configurations to be
   used in a group. You can create an initial version of the definition by providing a list of Lambda functions and
   their configurations now, or use ''CreateFunctionDefinitionVersion'' later.

  create-function-definition-request - `com.amazonaws.services.greengrass.model.CreateFunctionDefinitionRequest`

  returns: Result of the CreateFunctionDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateFunctionDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.CreateFunctionDefinitionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.CreateFunctionDefinitionRequest create-function-definition-request]
    (-> this (.createFunctionDefinition create-function-definition-request))))

(defn list-function-definition-versions
  "Lists the versions of a Lambda function definition.

  list-function-definition-versions-request - `com.amazonaws.services.greengrass.model.ListFunctionDefinitionVersionsRequest`

  returns: Result of the ListFunctionDefinitionVersions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListFunctionDefinitionVersionsResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.ListFunctionDefinitionVersionsResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.ListFunctionDefinitionVersionsRequest list-function-definition-versions-request]
    (-> this (.listFunctionDefinitionVersions list-function-definition-versions-request))))

(defn update-resource-definition
  "Updates a resource definition.

  update-resource-definition-request - `com.amazonaws.services.greengrass.model.UpdateResourceDefinitionRequest`

  returns: Result of the UpdateResourceDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.UpdateResourceDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.UpdateResourceDefinitionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.UpdateResourceDefinitionRequest update-resource-definition-request]
    (-> this (.updateResourceDefinition update-resource-definition-request))))

(defn create-resource-definition
  "Creates a resource definition which contains a list of resources to be used in a group. You can create an initial
   version of the definition by providing a list of resources now, or use ''CreateResourceDefinitionVersion'' later.

  create-resource-definition-request - `com.amazonaws.services.greengrass.model.CreateResourceDefinitionRequest`

  returns: Result of the CreateResourceDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateResourceDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.CreateResourceDefinitionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.CreateResourceDefinitionRequest create-resource-definition-request]
    (-> this (.createResourceDefinition create-resource-definition-request))))

(defn get-subscription-definition-version
  "Retrieves information about a subscription definition version.

  get-subscription-definition-version-request - `com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionVersionRequest`

  returns: Result of the GetSubscriptionDefinitionVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionVersionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionVersionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionVersionRequest get-subscription-definition-version-request]
    (-> this (.getSubscriptionDefinitionVersion get-subscription-definition-version-request))))

(defn update-logger-definition
  "Updates a logger definition.

  update-logger-definition-request - `com.amazonaws.services.greengrass.model.UpdateLoggerDefinitionRequest`

  returns: Result of the UpdateLoggerDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.UpdateLoggerDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.UpdateLoggerDefinitionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.UpdateLoggerDefinitionRequest update-logger-definition-request]
    (-> this (.updateLoggerDefinition update-logger-definition-request))))

(defn associate-service-role-to-account
  "Associates a role with your account. AWS IoT Greengrass will use the role to access your Lambda functions and AWS
   IoT resources. This is necessary for deployments to succeed. The role must have at least minimum permissions in
   the policy ''AWSGreengrassResourceAccessRolePolicy''.

  associate-service-role-to-account-request - `com.amazonaws.services.greengrass.model.AssociateServiceRoleToAccountRequest`

  returns: Result of the AssociateServiceRoleToAccount operation returned by the service. - `com.amazonaws.services.greengrass.model.AssociateServiceRoleToAccountResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.AssociateServiceRoleToAccountResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.AssociateServiceRoleToAccountRequest associate-service-role-to-account-request]
    (-> this (.associateServiceRoleToAccount associate-service-role-to-account-request))))

(defn list-device-definitions
  "Retrieves a list of device definitions.

  list-device-definitions-request - `com.amazonaws.services.greengrass.model.ListDeviceDefinitionsRequest`

  returns: Result of the ListDeviceDefinitions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListDeviceDefinitionsResult`"
  (^com.amazonaws.services.greengrass.model.ListDeviceDefinitionsResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.ListDeviceDefinitionsRequest list-device-definitions-request]
    (-> this (.listDeviceDefinitions list-device-definitions-request))))

(defn get-deployment-status
  "Returns the status of a deployment.

  get-deployment-status-request - `com.amazonaws.services.greengrass.model.GetDeploymentStatusRequest`

  returns: Result of the GetDeploymentStatus operation returned by the service. - `com.amazonaws.services.greengrass.model.GetDeploymentStatusResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetDeploymentStatusResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.GetDeploymentStatusRequest get-deployment-status-request]
    (-> this (.getDeploymentStatus get-deployment-status-request))))

(defn get-group-version
  "Retrieves information about a group version.

  get-group-version-request - `com.amazonaws.services.greengrass.model.GetGroupVersionRequest`

  returns: Result of the GetGroupVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.GetGroupVersionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetGroupVersionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.GetGroupVersionRequest get-group-version-request]
    (-> this (.getGroupVersion get-group-version-request))))

(defn create-deployment
  "Creates a deployment. ''CreateDeployment'' requests are idempotent with respect to the ''X-Amzn-Client-Token''
   token and the request parameters.

  create-deployment-request - `com.amazonaws.services.greengrass.model.CreateDeploymentRequest`

  returns: Result of the CreateDeployment operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateDeploymentResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.CreateDeploymentResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.CreateDeploymentRequest create-deployment-request]
    (-> this (.createDeployment create-deployment-request))))

(defn list-logger-definitions
  "Retrieves a list of logger definitions.

  list-logger-definitions-request - `com.amazonaws.services.greengrass.model.ListLoggerDefinitionsRequest`

  returns: Result of the ListLoggerDefinitions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListLoggerDefinitionsResult`"
  (^com.amazonaws.services.greengrass.model.ListLoggerDefinitionsResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.ListLoggerDefinitionsRequest list-logger-definitions-request]
    (-> this (.listLoggerDefinitions list-logger-definitions-request))))

(defn get-resource-definition-version
  "Retrieves information about a resource definition version, including which resources are included in the version.

  get-resource-definition-version-request - `com.amazonaws.services.greengrass.model.GetResourceDefinitionVersionRequest`

  returns: Result of the GetResourceDefinitionVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.GetResourceDefinitionVersionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetResourceDefinitionVersionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.GetResourceDefinitionVersionRequest get-resource-definition-version-request]
    (-> this (.getResourceDefinitionVersion get-resource-definition-version-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSGreengrass this]
    (-> this (.shutdown))))

(defn list-bulk-deployment-detailed-reports
  "Gets a paginated list of the deployments that have been started in a bulk deployment operation, and their current
   deployment status.

  list-bulk-deployment-detailed-reports-request - `com.amazonaws.services.greengrass.model.ListBulkDeploymentDetailedReportsRequest`

  returns: Result of the ListBulkDeploymentDetailedReports operation returned by the service. - `com.amazonaws.services.greengrass.model.ListBulkDeploymentDetailedReportsResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.ListBulkDeploymentDetailedReportsResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.ListBulkDeploymentDetailedReportsRequest list-bulk-deployment-detailed-reports-request]
    (-> this (.listBulkDeploymentDetailedReports list-bulk-deployment-detailed-reports-request))))

(defn create-connector-definition-version
  "Creates a version of a connector definition which has already been defined.

  create-connector-definition-version-request - `com.amazonaws.services.greengrass.model.CreateConnectorDefinitionVersionRequest`

  returns: Result of the CreateConnectorDefinitionVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateConnectorDefinitionVersionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.CreateConnectorDefinitionVersionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.CreateConnectorDefinitionVersionRequest create-connector-definition-version-request]
    (-> this (.createConnectorDefinitionVersion create-connector-definition-version-request))))

(defn list-bulk-deployments
  "Returns a list of bulk deployments.

  list-bulk-deployments-request - `com.amazonaws.services.greengrass.model.ListBulkDeploymentsRequest`

  returns: Result of the ListBulkDeployments operation returned by the service. - `com.amazonaws.services.greengrass.model.ListBulkDeploymentsResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.ListBulkDeploymentsResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.ListBulkDeploymentsRequest list-bulk-deployments-request]
    (-> this (.listBulkDeployments list-bulk-deployments-request))))

(defn reset-deployments
  "Resets a group's deployments.

  reset-deployments-request - Information needed to reset deployments. - `com.amazonaws.services.greengrass.model.ResetDeploymentsRequest`

  returns: Result of the ResetDeployments operation returned by the service. - `com.amazonaws.services.greengrass.model.ResetDeploymentsResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.ResetDeploymentsResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.ResetDeploymentsRequest reset-deployments-request]
    (-> this (.resetDeployments reset-deployments-request))))

(defn list-resource-definition-versions
  "Lists the versions of a resource definition.

  list-resource-definition-versions-request - `com.amazonaws.services.greengrass.model.ListResourceDefinitionVersionsRequest`

  returns: Result of the ListResourceDefinitionVersions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListResourceDefinitionVersionsResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.ListResourceDefinitionVersionsResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.ListResourceDefinitionVersionsRequest list-resource-definition-versions-request]
    (-> this (.listResourceDefinitionVersions list-resource-definition-versions-request))))

(defn list-group-certificate-authorities
  "Retrieves the current CAs for a group.

  list-group-certificate-authorities-request - `com.amazonaws.services.greengrass.model.ListGroupCertificateAuthoritiesRequest`

  returns: Result of the ListGroupCertificateAuthorities operation returned by the service. - `com.amazonaws.services.greengrass.model.ListGroupCertificateAuthoritiesResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.ListGroupCertificateAuthoritiesResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.ListGroupCertificateAuthoritiesRequest list-group-certificate-authorities-request]
    (-> this (.listGroupCertificateAuthorities list-group-certificate-authorities-request))))

(defn get-resource-definition
  "Retrieves information about a resource definition, including its creation time and latest version.

  get-resource-definition-request - `com.amazonaws.services.greengrass.model.GetResourceDefinitionRequest`

  returns: Result of the GetResourceDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.GetResourceDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetResourceDefinitionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.GetResourceDefinitionRequest get-resource-definition-request]
    (-> this (.getResourceDefinition get-resource-definition-request))))

(defn create-core-definition-version
  "Creates a version of a core definition that has already been defined. Greengrass groups must each contain exactly
   one Greengrass core.

  create-core-definition-version-request - `com.amazonaws.services.greengrass.model.CreateCoreDefinitionVersionRequest`

  returns: Result of the CreateCoreDefinitionVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateCoreDefinitionVersionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.CreateCoreDefinitionVersionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.CreateCoreDefinitionVersionRequest create-core-definition-version-request]
    (-> this (.createCoreDefinitionVersion create-core-definition-version-request))))

(defn list-deployments
  "Returns a history of deployments for the group.

  list-deployments-request - `com.amazonaws.services.greengrass.model.ListDeploymentsRequest`

  returns: Result of the ListDeployments operation returned by the service. - `com.amazonaws.services.greengrass.model.ListDeploymentsResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.ListDeploymentsResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.ListDeploymentsRequest list-deployments-request]
    (-> this (.listDeployments list-deployments-request))))

(defn list-core-definition-versions
  "Lists the versions of a core definition.

  list-core-definition-versions-request - `com.amazonaws.services.greengrass.model.ListCoreDefinitionVersionsRequest`

  returns: Result of the ListCoreDefinitionVersions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListCoreDefinitionVersionsResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.ListCoreDefinitionVersionsResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.ListCoreDefinitionVersionsRequest list-core-definition-versions-request]
    (-> this (.listCoreDefinitionVersions list-core-definition-versions-request))))

(defn list-connector-definitions
  "Retrieves a list of connector definitions.

  list-connector-definitions-request - `com.amazonaws.services.greengrass.model.ListConnectorDefinitionsRequest`

  returns: Result of the ListConnectorDefinitions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListConnectorDefinitionsResult`"
  (^com.amazonaws.services.greengrass.model.ListConnectorDefinitionsResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.ListConnectorDefinitionsRequest list-connector-definitions-request]
    (-> this (.listConnectorDefinitions list-connector-definitions-request))))

(defn get-core-definition
  "Retrieves information about a core definition version.

  get-core-definition-request - `com.amazonaws.services.greengrass.model.GetCoreDefinitionRequest`

  returns: Result of the GetCoreDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.GetCoreDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetCoreDefinitionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.GetCoreDefinitionRequest get-core-definition-request]
    (-> this (.getCoreDefinition get-core-definition-request))))

(defn create-logger-definition
  "Creates a logger definition. You may provide the initial version of the logger definition now or use
   ''CreateLoggerDefinitionVersion'' at a later time.

  create-logger-definition-request - `com.amazonaws.services.greengrass.model.CreateLoggerDefinitionRequest`

  returns: Result of the CreateLoggerDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateLoggerDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.CreateLoggerDefinitionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.CreateLoggerDefinitionRequest create-logger-definition-request]
    (-> this (.createLoggerDefinition create-logger-definition-request))))

(defn update-function-definition
  "Updates a Lambda function definition.

  update-function-definition-request - `com.amazonaws.services.greengrass.model.UpdateFunctionDefinitionRequest`

  returns: Result of the UpdateFunctionDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.UpdateFunctionDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.UpdateFunctionDefinitionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.UpdateFunctionDefinitionRequest update-function-definition-request]
    (-> this (.updateFunctionDefinition update-function-definition-request))))

(defn create-device-definition-version
  "Creates a version of a device definition that has already been defined.

  create-device-definition-version-request - `com.amazonaws.services.greengrass.model.CreateDeviceDefinitionVersionRequest`

  returns: Result of the CreateDeviceDefinitionVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateDeviceDefinitionVersionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.CreateDeviceDefinitionVersionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.CreateDeviceDefinitionVersionRequest create-device-definition-version-request]
    (-> this (.createDeviceDefinitionVersion create-device-definition-version-request))))

(defn delete-subscription-definition
  "Deletes a subscription definition.

  delete-subscription-definition-request - `com.amazonaws.services.greengrass.model.DeleteSubscriptionDefinitionRequest`

  returns: Result of the DeleteSubscriptionDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.DeleteSubscriptionDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.DeleteSubscriptionDefinitionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.DeleteSubscriptionDefinitionRequest delete-subscription-definition-request]
    (-> this (.deleteSubscriptionDefinition delete-subscription-definition-request))))

(defn list-logger-definition-versions
  "Lists the versions of a logger definition.

  list-logger-definition-versions-request - `com.amazonaws.services.greengrass.model.ListLoggerDefinitionVersionsRequest`

  returns: Result of the ListLoggerDefinitionVersions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListLoggerDefinitionVersionsResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.ListLoggerDefinitionVersionsResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.ListLoggerDefinitionVersionsRequest list-logger-definition-versions-request]
    (-> this (.listLoggerDefinitionVersions list-logger-definition-versions-request))))

(defn create-software-update-job
  "Creates a software update for a core or group of cores (specified as an IoT thing group.) Use this to update the
   OTA Agent as well as the Greengrass core software. It makes use of the IoT Jobs feature which provides additional
   commands to manage a Greengrass core software update job.

  create-software-update-job-request - `com.amazonaws.services.greengrass.model.CreateSoftwareUpdateJobRequest`

  returns: Result of the CreateSoftwareUpdateJob operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateSoftwareUpdateJobResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.CreateSoftwareUpdateJobResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.CreateSoftwareUpdateJobRequest create-software-update-job-request]
    (-> this (.createSoftwareUpdateJob create-software-update-job-request))))

(defn disassociate-role-from-group
  "Disassociates the role from a group.

  disassociate-role-from-group-request - `com.amazonaws.services.greengrass.model.DisassociateRoleFromGroupRequest`

  returns: Result of the DisassociateRoleFromGroup operation returned by the service. - `com.amazonaws.services.greengrass.model.DisassociateRoleFromGroupResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.DisassociateRoleFromGroupResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.DisassociateRoleFromGroupRequest disassociate-role-from-group-request]
    (-> this (.disassociateRoleFromGroup disassociate-role-from-group-request))))

(defn update-connector-definition
  "Updates a connector definition.

  update-connector-definition-request - `com.amazonaws.services.greengrass.model.UpdateConnectorDefinitionRequest`

  returns: Result of the UpdateConnectorDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.UpdateConnectorDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.UpdateConnectorDefinitionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.UpdateConnectorDefinitionRequest update-connector-definition-request]
    (-> this (.updateConnectorDefinition update-connector-definition-request))))

(defn get-associated-role
  "Retrieves the role associated with a particular group.

  get-associated-role-request - `com.amazonaws.services.greengrass.model.GetAssociatedRoleRequest`

  returns: Result of the GetAssociatedRole operation returned by the service. - `com.amazonaws.services.greengrass.model.GetAssociatedRoleResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetAssociatedRoleResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.GetAssociatedRoleRequest get-associated-role-request]
    (-> this (.getAssociatedRole get-associated-role-request))))

(defn list-resource-definitions
  "Retrieves a list of resource definitions.

  list-resource-definitions-request - `com.amazonaws.services.greengrass.model.ListResourceDefinitionsRequest`

  returns: Result of the ListResourceDefinitions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListResourceDefinitionsResult`"
  (^com.amazonaws.services.greengrass.model.ListResourceDefinitionsResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.ListResourceDefinitionsRequest list-resource-definitions-request]
    (-> this (.listResourceDefinitions list-resource-definitions-request))))

(defn delete-connector-definition
  "Deletes a connector definition.

  delete-connector-definition-request - `com.amazonaws.services.greengrass.model.DeleteConnectorDefinitionRequest`

  returns: Result of the DeleteConnectorDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.DeleteConnectorDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.DeleteConnectorDefinitionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.DeleteConnectorDefinitionRequest delete-connector-definition-request]
    (-> this (.deleteConnectorDefinition delete-connector-definition-request))))

(defn list-groups
  "Retrieves a list of groups.

  list-groups-request - `com.amazonaws.services.greengrass.model.ListGroupsRequest`

  returns: Result of the ListGroups operation returned by the service. - `com.amazonaws.services.greengrass.model.ListGroupsResult`"
  (^com.amazonaws.services.greengrass.model.ListGroupsResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.ListGroupsRequest list-groups-request]
    (-> this (.listGroups list-groups-request))))

(defn delete-function-definition
  "Deletes a Lambda function definition.

  delete-function-definition-request - `com.amazonaws.services.greengrass.model.DeleteFunctionDefinitionRequest`

  returns: Result of the DeleteFunctionDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.DeleteFunctionDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.DeleteFunctionDefinitionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.DeleteFunctionDefinitionRequest delete-function-definition-request]
    (-> this (.deleteFunctionDefinition delete-function-definition-request))))

(defn update-core-definition
  "Updates a core definition.

  update-core-definition-request - `com.amazonaws.services.greengrass.model.UpdateCoreDefinitionRequest`

  returns: Result of the UpdateCoreDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.UpdateCoreDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.UpdateCoreDefinitionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.UpdateCoreDefinitionRequest update-core-definition-request]
    (-> this (.updateCoreDefinition update-core-definition-request))))

(defn get-connectivity-info
  "Retrieves the connectivity information for a core.

  get-connectivity-info-request - `com.amazonaws.services.greengrass.model.GetConnectivityInfoRequest`

  returns: Result of the GetConnectivityInfo operation returned by the service. - `com.amazonaws.services.greengrass.model.GetConnectivityInfoResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetConnectivityInfoResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.GetConnectivityInfoRequest get-connectivity-info-request]
    (-> this (.getConnectivityInfo get-connectivity-info-request))))

(defn get-group-certificate-authority
  "Retreives the CA associated with a group. Returns the public key of the CA.

  get-group-certificate-authority-request - `com.amazonaws.services.greengrass.model.GetGroupCertificateAuthorityRequest`

  returns: Result of the GetGroupCertificateAuthority operation returned by the service. - `com.amazonaws.services.greengrass.model.GetGroupCertificateAuthorityResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetGroupCertificateAuthorityResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.GetGroupCertificateAuthorityRequest get-group-certificate-authority-request]
    (-> this (.getGroupCertificateAuthority get-group-certificate-authority-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSGreengrass this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn list-subscription-definition-versions
  "Lists the versions of a subscription definition.

  list-subscription-definition-versions-request - `com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionVersionsRequest`

  returns: Result of the ListSubscriptionDefinitionVersions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionVersionsResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionVersionsResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionVersionsRequest list-subscription-definition-versions-request]
    (-> this (.listSubscriptionDefinitionVersions list-subscription-definition-versions-request))))

(defn start-bulk-deployment
  "Deploys multiple groups in one operation. This action starts the bulk deployment of a specified set of group
   versions. Each group version deployment will be triggered with an adaptive rate that has a fixed upper limit. We
   recommend that you include an ''X-Amzn-Client-Token'' token in every ''StartBulkDeployment'' request. These
   requests are idempotent with respect to the token and the request parameters.

  start-bulk-deployment-request - `com.amazonaws.services.greengrass.model.StartBulkDeploymentRequest`

  returns: Result of the StartBulkDeployment operation returned by the service. - `com.amazonaws.services.greengrass.model.StartBulkDeploymentResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.StartBulkDeploymentResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.StartBulkDeploymentRequest start-bulk-deployment-request]
    (-> this (.startBulkDeployment start-bulk-deployment-request))))

(defn delete-logger-definition
  "Deletes a logger definition.

  delete-logger-definition-request - `com.amazonaws.services.greengrass.model.DeleteLoggerDefinitionRequest`

  returns: Result of the DeleteLoggerDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.DeleteLoggerDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.DeleteLoggerDefinitionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.DeleteLoggerDefinitionRequest delete-logger-definition-request]
    (-> this (.deleteLoggerDefinition delete-logger-definition-request))))

(defn update-connectivity-info
  "Updates the connectivity information for the core. Any devices that belong to the group which has this core will
   receive this information in order to find the location of the core and connect to it.

  update-connectivity-info-request - Connectivity information. - `com.amazonaws.services.greengrass.model.UpdateConnectivityInfoRequest`

  returns: Result of the UpdateConnectivityInfo operation returned by the service. - `com.amazonaws.services.greengrass.model.UpdateConnectivityInfoResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.UpdateConnectivityInfoResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.UpdateConnectivityInfoRequest update-connectivity-info-request]
    (-> this (.updateConnectivityInfo update-connectivity-info-request))))

(defn stop-bulk-deployment
  "Stops the execution of a bulk deployment. This action returns a status of ''Stopping'' until the deployment is
   stopped. You cannot start a new bulk deployment while a previous deployment is in the ''Stopping'' state. This
   action doesn't rollback completed deployments or cancel pending deployments.

  stop-bulk-deployment-request - `com.amazonaws.services.greengrass.model.StopBulkDeploymentRequest`

  returns: Result of the StopBulkDeployment operation returned by the service. - `com.amazonaws.services.greengrass.model.StopBulkDeploymentResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.StopBulkDeploymentResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.StopBulkDeploymentRequest stop-bulk-deployment-request]
    (-> this (.stopBulkDeployment stop-bulk-deployment-request))))

(defn tag-resource
  "Add resource tags to a Greengrass Resource. Valid resources are Group, Connector, Core, Device, Function, Logger,
   Subscription, and Resource Defintions, and also BulkDeploymentIds.

  tag-resource-request - A map of the key-value pairs for the resource tag. - `com.amazonaws.services.greengrass.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.greengrass.model.TagResourceResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.TagResourceResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

(defn create-group-version
  "Creates a version of a group which has already been defined.

  create-group-version-request - `com.amazonaws.services.greengrass.model.CreateGroupVersionRequest`

  returns: Result of the CreateGroupVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateGroupVersionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.CreateGroupVersionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.CreateGroupVersionRequest create-group-version-request]
    (-> this (.createGroupVersion create-group-version-request))))

(defn update-device-definition
  "Updates a device definition.

  update-device-definition-request - `com.amazonaws.services.greengrass.model.UpdateDeviceDefinitionRequest`

  returns: Result of the UpdateDeviceDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.UpdateDeviceDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.UpdateDeviceDefinitionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.UpdateDeviceDefinitionRequest update-device-definition-request]
    (-> this (.updateDeviceDefinition update-device-definition-request))))

(defn get-connector-definition
  "Retrieves information about a connector definition.

  get-connector-definition-request - `com.amazonaws.services.greengrass.model.GetConnectorDefinitionRequest`

  returns: Result of the GetConnectorDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.GetConnectorDefinitionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetConnectorDefinitionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.GetConnectorDefinitionRequest get-connector-definition-request]
    (-> this (.getConnectorDefinition get-connector-definition-request))))

(defn get-core-definition-version
  "Retrieves information about a core definition version.

  get-core-definition-version-request - `com.amazonaws.services.greengrass.model.GetCoreDefinitionVersionRequest`

  returns: Result of the GetCoreDefinitionVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.GetCoreDefinitionVersionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetCoreDefinitionVersionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.GetCoreDefinitionVersionRequest get-core-definition-version-request]
    (-> this (.getCoreDefinitionVersion get-core-definition-version-request))))

(defn get-logger-definition-version
  "Retrieves information about a logger definition version.

  get-logger-definition-version-request - `com.amazonaws.services.greengrass.model.GetLoggerDefinitionVersionRequest`

  returns: Result of the GetLoggerDefinitionVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.GetLoggerDefinitionVersionResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetLoggerDefinitionVersionResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.GetLoggerDefinitionVersionRequest get-logger-definition-version-request]
    (-> this (.getLoggerDefinitionVersion get-logger-definition-version-request))))

(defn get-group
  "Retrieves information about a group.

  get-group-request - `com.amazonaws.services.greengrass.model.GetGroupRequest`

  returns: Result of the GetGroup operation returned by the service. - `com.amazonaws.services.greengrass.model.GetGroupResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetGroupResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.GetGroupRequest get-group-request]
    (-> this (.getGroup get-group-request))))

(defn get-group-certificate-configuration
  "Retrieves the current configuration for the CA used by the group.

  get-group-certificate-configuration-request - `com.amazonaws.services.greengrass.model.GetGroupCertificateConfigurationRequest`

  returns: Result of the GetGroupCertificateConfiguration operation returned by the service. - `com.amazonaws.services.greengrass.model.GetGroupCertificateConfigurationResult`

  throws: com.amazonaws.services.greengrass.model.BadRequestException - invalid request"
  (^com.amazonaws.services.greengrass.model.GetGroupCertificateConfigurationResult [^AWSGreengrass this ^com.amazonaws.services.greengrass.model.GetGroupCertificateConfigurationRequest get-group-certificate-configuration-request]
    (-> this (.getGroupCertificateConfiguration get-group-certificate-configuration-request))))

