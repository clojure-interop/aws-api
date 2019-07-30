(ns com.amazonaws.services.greengrass.AbstractAWSGreengrass
  "Abstract implementation of AWSGreengrass. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.greengrass AbstractAWSGreengrass]))

(defn delete-group
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.DeleteGroupRequest`

  returns: Result of the DeleteGroup operation returned by the service. - `com.amazonaws.services.greengrass.model.DeleteGroupResult`"
  (^com.amazonaws.services.greengrass.model.DeleteGroupResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.DeleteGroupRequest request]
    (-> this (.deleteGroup request))))

(defn create-device-definition
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.CreateDeviceDefinitionRequest`

  returns: Result of the CreateDeviceDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateDeviceDefinitionResult`"
  (^com.amazonaws.services.greengrass.model.CreateDeviceDefinitionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.CreateDeviceDefinitionRequest request]
    (-> this (.createDeviceDefinition request))))

(defn create-group-certificate-authority
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.CreateGroupCertificateAuthorityRequest`

  returns: Result of the CreateGroupCertificateAuthority operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateGroupCertificateAuthorityResult`"
  (^com.amazonaws.services.greengrass.model.CreateGroupCertificateAuthorityResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.CreateGroupCertificateAuthorityRequest request]
    (-> this (.createGroupCertificateAuthority request))))

(defn update-group
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.UpdateGroupRequest`

  returns: Result of the UpdateGroup operation returned by the service. - `com.amazonaws.services.greengrass.model.UpdateGroupResult`"
  (^com.amazonaws.services.greengrass.model.UpdateGroupResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.UpdateGroupRequest request]
    (-> this (.updateGroup request))))

(defn get-bulk-deployment-status
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.GetBulkDeploymentStatusRequest`

  returns: Result of the GetBulkDeploymentStatus operation returned by the service. - `com.amazonaws.services.greengrass.model.GetBulkDeploymentStatusResult`"
  (^com.amazonaws.services.greengrass.model.GetBulkDeploymentStatusResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.GetBulkDeploymentStatusRequest request]
    (-> this (.getBulkDeploymentStatus request))))

(defn create-logger-definition-version
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.CreateLoggerDefinitionVersionRequest`

  returns: Result of the CreateLoggerDefinitionVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateLoggerDefinitionVersionResult`"
  (^com.amazonaws.services.greengrass.model.CreateLoggerDefinitionVersionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.CreateLoggerDefinitionVersionRequest request]
    (-> this (.createLoggerDefinitionVersion request))))

(defn list-tags-for-resource
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.greengrass.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.greengrass.model.ListTagsForResourceResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn get-function-definition
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.GetFunctionDefinitionRequest`

  returns: Result of the GetFunctionDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.GetFunctionDefinitionResult`"
  (^com.amazonaws.services.greengrass.model.GetFunctionDefinitionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.GetFunctionDefinitionRequest request]
    (-> this (.getFunctionDefinition request))))

(defn create-connector-definition
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.CreateConnectorDefinitionRequest`

  returns: Result of the CreateConnectorDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateConnectorDefinitionResult`"
  (^com.amazonaws.services.greengrass.model.CreateConnectorDefinitionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.CreateConnectorDefinitionRequest request]
    (-> this (.createConnectorDefinition request))))

(defn get-subscription-definition
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionRequest`

  returns: Result of the GetSubscriptionDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionResult`"
  (^com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionRequest request]
    (-> this (.getSubscriptionDefinition request))))

(defn get-connector-definition-version
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.GetConnectorDefinitionVersionRequest`

  returns: Result of the GetConnectorDefinitionVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.GetConnectorDefinitionVersionResult`"
  (^com.amazonaws.services.greengrass.model.GetConnectorDefinitionVersionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.GetConnectorDefinitionVersionRequest request]
    (-> this (.getConnectorDefinitionVersion request))))

(defn get-device-definition-version
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.GetDeviceDefinitionVersionRequest`

  returns: Result of the GetDeviceDefinitionVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.GetDeviceDefinitionVersionResult`"
  (^com.amazonaws.services.greengrass.model.GetDeviceDefinitionVersionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.GetDeviceDefinitionVersionRequest request]
    (-> this (.getDeviceDefinitionVersion request))))

(defn delete-resource-definition
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.DeleteResourceDefinitionRequest`

  returns: Result of the DeleteResourceDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.DeleteResourceDefinitionResult`"
  (^com.amazonaws.services.greengrass.model.DeleteResourceDefinitionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.DeleteResourceDefinitionRequest request]
    (-> this (.deleteResourceDefinition request))))

(defn list-subscription-definitions
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionsRequest`

  returns: Result of the ListSubscriptionDefinitions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionsResult`"
  (^com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionsResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionsRequest request]
    (-> this (.listSubscriptionDefinitions request))))

(defn create-function-definition-version
  "Description copied from interface: AWSGreengrass

  request - Information needed to create a function definition version. - `com.amazonaws.services.greengrass.model.CreateFunctionDefinitionVersionRequest`

  returns: Result of the CreateFunctionDefinitionVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateFunctionDefinitionVersionResult`"
  (^com.amazonaws.services.greengrass.model.CreateFunctionDefinitionVersionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.CreateFunctionDefinitionVersionRequest request]
    (-> this (.createFunctionDefinitionVersion request))))

(defn update-group-certificate-configuration
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.UpdateGroupCertificateConfigurationRequest`

  returns: Result of the UpdateGroupCertificateConfiguration operation returned by the service. - `com.amazonaws.services.greengrass.model.UpdateGroupCertificateConfigurationResult`"
  (^com.amazonaws.services.greengrass.model.UpdateGroupCertificateConfigurationResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.UpdateGroupCertificateConfigurationRequest request]
    (-> this (.updateGroupCertificateConfiguration request))))

(defn create-group
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.CreateGroupRequest`

  returns: Result of the CreateGroup operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateGroupResult`"
  (^com.amazonaws.services.greengrass.model.CreateGroupResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.CreateGroupRequest request]
    (-> this (.createGroup request))))

(defn associate-role-to-group
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.AssociateRoleToGroupRequest`

  returns: Result of the AssociateRoleToGroup operation returned by the service. - `com.amazonaws.services.greengrass.model.AssociateRoleToGroupResult`"
  (^com.amazonaws.services.greengrass.model.AssociateRoleToGroupResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.AssociateRoleToGroupRequest request]
    (-> this (.associateRoleToGroup request))))

(defn get-function-definition-version
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.GetFunctionDefinitionVersionRequest`

  returns: Result of the GetFunctionDefinitionVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.GetFunctionDefinitionVersionResult`"
  (^com.amazonaws.services.greengrass.model.GetFunctionDefinitionVersionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.GetFunctionDefinitionVersionRequest request]
    (-> this (.getFunctionDefinitionVersion request))))

(defn create-subscription-definition
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionRequest`

  returns: Result of the CreateSubscriptionDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionResult`"
  (^com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionRequest request]
    (-> this (.createSubscriptionDefinition request))))

(defn get-service-role-for-account
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.GetServiceRoleForAccountRequest`

  returns: Result of the GetServiceRoleForAccount operation returned by the service. - `com.amazonaws.services.greengrass.model.GetServiceRoleForAccountResult`"
  (^com.amazonaws.services.greengrass.model.GetServiceRoleForAccountResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.GetServiceRoleForAccountRequest request]
    (-> this (.getServiceRoleForAccount request))))

(defn list-connector-definition-versions
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.ListConnectorDefinitionVersionsRequest`

  returns: Result of the ListConnectorDefinitionVersions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListConnectorDefinitionVersionsResult`"
  (^com.amazonaws.services.greengrass.model.ListConnectorDefinitionVersionsResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.ListConnectorDefinitionVersionsRequest request]
    (-> this (.listConnectorDefinitionVersions request))))

(defn delete-core-definition
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.DeleteCoreDefinitionRequest`

  returns: Result of the DeleteCoreDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.DeleteCoreDefinitionResult`"
  (^com.amazonaws.services.greengrass.model.DeleteCoreDefinitionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.DeleteCoreDefinitionRequest request]
    (-> this (.deleteCoreDefinition request))))

(defn update-subscription-definition
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.UpdateSubscriptionDefinitionRequest`

  returns: Result of the UpdateSubscriptionDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.UpdateSubscriptionDefinitionResult`"
  (^com.amazonaws.services.greengrass.model.UpdateSubscriptionDefinitionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.UpdateSubscriptionDefinitionRequest request]
    (-> this (.updateSubscriptionDefinition request))))

(defn get-device-definition
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.GetDeviceDefinitionRequest`

  returns: Result of the GetDeviceDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.GetDeviceDefinitionResult`"
  (^com.amazonaws.services.greengrass.model.GetDeviceDefinitionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.GetDeviceDefinitionRequest request]
    (-> this (.getDeviceDefinition request))))

(defn list-group-versions
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.ListGroupVersionsRequest`

  returns: Result of the ListGroupVersions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListGroupVersionsResult`"
  (^com.amazonaws.services.greengrass.model.ListGroupVersionsResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.ListGroupVersionsRequest request]
    (-> this (.listGroupVersions request))))

(defn list-core-definitions
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.ListCoreDefinitionsRequest`

  returns: Result of the ListCoreDefinitions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListCoreDefinitionsResult`"
  (^com.amazonaws.services.greengrass.model.ListCoreDefinitionsResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.ListCoreDefinitionsRequest request]
    (-> this (.listCoreDefinitions request))))

(defn disassociate-service-role-from-account
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.DisassociateServiceRoleFromAccountRequest`

  returns: Result of the DisassociateServiceRoleFromAccount operation returned by the service. - `com.amazonaws.services.greengrass.model.DisassociateServiceRoleFromAccountResult`"
  (^com.amazonaws.services.greengrass.model.DisassociateServiceRoleFromAccountResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.DisassociateServiceRoleFromAccountRequest request]
    (-> this (.disassociateServiceRoleFromAccount request))))

(defn untag-resource
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.greengrass.model.UntagResourceResult`"
  (^com.amazonaws.services.greengrass.model.UntagResourceResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn get-logger-definition
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.GetLoggerDefinitionRequest`

  returns: Result of the GetLoggerDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.GetLoggerDefinitionResult`"
  (^com.amazonaws.services.greengrass.model.GetLoggerDefinitionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.GetLoggerDefinitionRequest request]
    (-> this (.getLoggerDefinition request))))

(defn create-resource-definition-version
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.CreateResourceDefinitionVersionRequest`

  returns: Result of the CreateResourceDefinitionVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateResourceDefinitionVersionResult`"
  (^com.amazonaws.services.greengrass.model.CreateResourceDefinitionVersionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.CreateResourceDefinitionVersionRequest request]
    (-> this (.createResourceDefinitionVersion request))))

(defn list-function-definitions
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.ListFunctionDefinitionsRequest`

  returns: Result of the ListFunctionDefinitions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListFunctionDefinitionsResult`"
  (^com.amazonaws.services.greengrass.model.ListFunctionDefinitionsResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.ListFunctionDefinitionsRequest request]
    (-> this (.listFunctionDefinitions request))))

(defn delete-device-definition
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.DeleteDeviceDefinitionRequest`

  returns: Result of the DeleteDeviceDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.DeleteDeviceDefinitionResult`"
  (^com.amazonaws.services.greengrass.model.DeleteDeviceDefinitionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.DeleteDeviceDefinitionRequest request]
    (-> this (.deleteDeviceDefinition request))))

(defn list-device-definition-versions
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.ListDeviceDefinitionVersionsRequest`

  returns: Result of the ListDeviceDefinitionVersions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListDeviceDefinitionVersionsResult`"
  (^com.amazonaws.services.greengrass.model.ListDeviceDefinitionVersionsResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.ListDeviceDefinitionVersionsRequest request]
    (-> this (.listDeviceDefinitionVersions request))))

(defn create-subscription-definition-version
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionVersionRequest`

  returns: Result of the CreateSubscriptionDefinitionVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionVersionResult`"
  (^com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionVersionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionVersionRequest request]
    (-> this (.createSubscriptionDefinitionVersion request))))

(defn create-core-definition
  "Description copied from interface: AWSGreengrass

  request - Information needed to create a core definition. - `com.amazonaws.services.greengrass.model.CreateCoreDefinitionRequest`

  returns: Result of the CreateCoreDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateCoreDefinitionResult`"
  (^com.amazonaws.services.greengrass.model.CreateCoreDefinitionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.CreateCoreDefinitionRequest request]
    (-> this (.createCoreDefinition request))))

(defn create-function-definition
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.CreateFunctionDefinitionRequest`

  returns: Result of the CreateFunctionDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateFunctionDefinitionResult`"
  (^com.amazonaws.services.greengrass.model.CreateFunctionDefinitionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.CreateFunctionDefinitionRequest request]
    (-> this (.createFunctionDefinition request))))

(defn list-function-definition-versions
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.ListFunctionDefinitionVersionsRequest`

  returns: Result of the ListFunctionDefinitionVersions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListFunctionDefinitionVersionsResult`"
  (^com.amazonaws.services.greengrass.model.ListFunctionDefinitionVersionsResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.ListFunctionDefinitionVersionsRequest request]
    (-> this (.listFunctionDefinitionVersions request))))

(defn update-resource-definition
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.UpdateResourceDefinitionRequest`

  returns: Result of the UpdateResourceDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.UpdateResourceDefinitionResult`"
  (^com.amazonaws.services.greengrass.model.UpdateResourceDefinitionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.UpdateResourceDefinitionRequest request]
    (-> this (.updateResourceDefinition request))))

(defn create-resource-definition
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.CreateResourceDefinitionRequest`

  returns: Result of the CreateResourceDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateResourceDefinitionResult`"
  (^com.amazonaws.services.greengrass.model.CreateResourceDefinitionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.CreateResourceDefinitionRequest request]
    (-> this (.createResourceDefinition request))))

(defn get-subscription-definition-version
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionVersionRequest`

  returns: Result of the GetSubscriptionDefinitionVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionVersionResult`"
  (^com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionVersionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionVersionRequest request]
    (-> this (.getSubscriptionDefinitionVersion request))))

(defn update-logger-definition
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.UpdateLoggerDefinitionRequest`

  returns: Result of the UpdateLoggerDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.UpdateLoggerDefinitionResult`"
  (^com.amazonaws.services.greengrass.model.UpdateLoggerDefinitionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.UpdateLoggerDefinitionRequest request]
    (-> this (.updateLoggerDefinition request))))

(defn associate-service-role-to-account
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.AssociateServiceRoleToAccountRequest`

  returns: Result of the AssociateServiceRoleToAccount operation returned by the service. - `com.amazonaws.services.greengrass.model.AssociateServiceRoleToAccountResult`"
  (^com.amazonaws.services.greengrass.model.AssociateServiceRoleToAccountResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.AssociateServiceRoleToAccountRequest request]
    (-> this (.associateServiceRoleToAccount request))))

(defn list-device-definitions
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.ListDeviceDefinitionsRequest`

  returns: Result of the ListDeviceDefinitions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListDeviceDefinitionsResult`"
  (^com.amazonaws.services.greengrass.model.ListDeviceDefinitionsResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.ListDeviceDefinitionsRequest request]
    (-> this (.listDeviceDefinitions request))))

(defn get-deployment-status
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.GetDeploymentStatusRequest`

  returns: Result of the GetDeploymentStatus operation returned by the service. - `com.amazonaws.services.greengrass.model.GetDeploymentStatusResult`"
  (^com.amazonaws.services.greengrass.model.GetDeploymentStatusResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.GetDeploymentStatusRequest request]
    (-> this (.getDeploymentStatus request))))

(defn get-group-version
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.GetGroupVersionRequest`

  returns: Result of the GetGroupVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.GetGroupVersionResult`"
  (^com.amazonaws.services.greengrass.model.GetGroupVersionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.GetGroupVersionRequest request]
    (-> this (.getGroupVersion request))))

(defn create-deployment
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.CreateDeploymentRequest`

  returns: Result of the CreateDeployment operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateDeploymentResult`"
  (^com.amazonaws.services.greengrass.model.CreateDeploymentResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.CreateDeploymentRequest request]
    (-> this (.createDeployment request))))

(defn list-logger-definitions
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.ListLoggerDefinitionsRequest`

  returns: Result of the ListLoggerDefinitions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListLoggerDefinitionsResult`"
  (^com.amazonaws.services.greengrass.model.ListLoggerDefinitionsResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.ListLoggerDefinitionsRequest request]
    (-> this (.listLoggerDefinitions request))))

(defn get-resource-definition-version
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.GetResourceDefinitionVersionRequest`

  returns: Result of the GetResourceDefinitionVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.GetResourceDefinitionVersionResult`"
  (^com.amazonaws.services.greengrass.model.GetResourceDefinitionVersionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.GetResourceDefinitionVersionRequest request]
    (-> this (.getResourceDefinitionVersion request))))

(defn shutdown
  "Description copied from interface: AWSGreengrass"
  ([^AbstractAWSGreengrass this]
    (-> this (.shutdown))))

(defn list-bulk-deployment-detailed-reports
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.ListBulkDeploymentDetailedReportsRequest`

  returns: Result of the ListBulkDeploymentDetailedReports operation returned by the service. - `com.amazonaws.services.greengrass.model.ListBulkDeploymentDetailedReportsResult`"
  (^com.amazonaws.services.greengrass.model.ListBulkDeploymentDetailedReportsResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.ListBulkDeploymentDetailedReportsRequest request]
    (-> this (.listBulkDeploymentDetailedReports request))))

(defn create-connector-definition-version
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.CreateConnectorDefinitionVersionRequest`

  returns: Result of the CreateConnectorDefinitionVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateConnectorDefinitionVersionResult`"
  (^com.amazonaws.services.greengrass.model.CreateConnectorDefinitionVersionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.CreateConnectorDefinitionVersionRequest request]
    (-> this (.createConnectorDefinitionVersion request))))

(defn list-bulk-deployments
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.ListBulkDeploymentsRequest`

  returns: Result of the ListBulkDeployments operation returned by the service. - `com.amazonaws.services.greengrass.model.ListBulkDeploymentsResult`"
  (^com.amazonaws.services.greengrass.model.ListBulkDeploymentsResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.ListBulkDeploymentsRequest request]
    (-> this (.listBulkDeployments request))))

(defn reset-deployments
  "Description copied from interface: AWSGreengrass

  request - Information needed to reset deployments. - `com.amazonaws.services.greengrass.model.ResetDeploymentsRequest`

  returns: Result of the ResetDeployments operation returned by the service. - `com.amazonaws.services.greengrass.model.ResetDeploymentsResult`"
  (^com.amazonaws.services.greengrass.model.ResetDeploymentsResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.ResetDeploymentsRequest request]
    (-> this (.resetDeployments request))))

(defn list-resource-definition-versions
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.ListResourceDefinitionVersionsRequest`

  returns: Result of the ListResourceDefinitionVersions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListResourceDefinitionVersionsResult`"
  (^com.amazonaws.services.greengrass.model.ListResourceDefinitionVersionsResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.ListResourceDefinitionVersionsRequest request]
    (-> this (.listResourceDefinitionVersions request))))

(defn list-group-certificate-authorities
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.ListGroupCertificateAuthoritiesRequest`

  returns: Result of the ListGroupCertificateAuthorities operation returned by the service. - `com.amazonaws.services.greengrass.model.ListGroupCertificateAuthoritiesResult`"
  (^com.amazonaws.services.greengrass.model.ListGroupCertificateAuthoritiesResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.ListGroupCertificateAuthoritiesRequest request]
    (-> this (.listGroupCertificateAuthorities request))))

(defn get-resource-definition
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.GetResourceDefinitionRequest`

  returns: Result of the GetResourceDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.GetResourceDefinitionResult`"
  (^com.amazonaws.services.greengrass.model.GetResourceDefinitionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.GetResourceDefinitionRequest request]
    (-> this (.getResourceDefinition request))))

(defn create-core-definition-version
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.CreateCoreDefinitionVersionRequest`

  returns: Result of the CreateCoreDefinitionVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateCoreDefinitionVersionResult`"
  (^com.amazonaws.services.greengrass.model.CreateCoreDefinitionVersionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.CreateCoreDefinitionVersionRequest request]
    (-> this (.createCoreDefinitionVersion request))))

(defn list-deployments
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.ListDeploymentsRequest`

  returns: Result of the ListDeployments operation returned by the service. - `com.amazonaws.services.greengrass.model.ListDeploymentsResult`"
  (^com.amazonaws.services.greengrass.model.ListDeploymentsResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.ListDeploymentsRequest request]
    (-> this (.listDeployments request))))

(defn list-core-definition-versions
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.ListCoreDefinitionVersionsRequest`

  returns: Result of the ListCoreDefinitionVersions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListCoreDefinitionVersionsResult`"
  (^com.amazonaws.services.greengrass.model.ListCoreDefinitionVersionsResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.ListCoreDefinitionVersionsRequest request]
    (-> this (.listCoreDefinitionVersions request))))

(defn list-connector-definitions
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.ListConnectorDefinitionsRequest`

  returns: Result of the ListConnectorDefinitions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListConnectorDefinitionsResult`"
  (^com.amazonaws.services.greengrass.model.ListConnectorDefinitionsResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.ListConnectorDefinitionsRequest request]
    (-> this (.listConnectorDefinitions request))))

(defn get-core-definition
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.GetCoreDefinitionRequest`

  returns: Result of the GetCoreDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.GetCoreDefinitionResult`"
  (^com.amazonaws.services.greengrass.model.GetCoreDefinitionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.GetCoreDefinitionRequest request]
    (-> this (.getCoreDefinition request))))

(defn create-logger-definition
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.CreateLoggerDefinitionRequest`

  returns: Result of the CreateLoggerDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateLoggerDefinitionResult`"
  (^com.amazonaws.services.greengrass.model.CreateLoggerDefinitionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.CreateLoggerDefinitionRequest request]
    (-> this (.createLoggerDefinition request))))

(defn update-function-definition
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.UpdateFunctionDefinitionRequest`

  returns: Result of the UpdateFunctionDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.UpdateFunctionDefinitionResult`"
  (^com.amazonaws.services.greengrass.model.UpdateFunctionDefinitionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.UpdateFunctionDefinitionRequest request]
    (-> this (.updateFunctionDefinition request))))

(defn create-device-definition-version
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.CreateDeviceDefinitionVersionRequest`

  returns: Result of the CreateDeviceDefinitionVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateDeviceDefinitionVersionResult`"
  (^com.amazonaws.services.greengrass.model.CreateDeviceDefinitionVersionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.CreateDeviceDefinitionVersionRequest request]
    (-> this (.createDeviceDefinitionVersion request))))

(defn delete-subscription-definition
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.DeleteSubscriptionDefinitionRequest`

  returns: Result of the DeleteSubscriptionDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.DeleteSubscriptionDefinitionResult`"
  (^com.amazonaws.services.greengrass.model.DeleteSubscriptionDefinitionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.DeleteSubscriptionDefinitionRequest request]
    (-> this (.deleteSubscriptionDefinition request))))

(defn list-logger-definition-versions
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.ListLoggerDefinitionVersionsRequest`

  returns: Result of the ListLoggerDefinitionVersions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListLoggerDefinitionVersionsResult`"
  (^com.amazonaws.services.greengrass.model.ListLoggerDefinitionVersionsResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.ListLoggerDefinitionVersionsRequest request]
    (-> this (.listLoggerDefinitionVersions request))))

(defn create-software-update-job
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.CreateSoftwareUpdateJobRequest`

  returns: Result of the CreateSoftwareUpdateJob operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateSoftwareUpdateJobResult`"
  (^com.amazonaws.services.greengrass.model.CreateSoftwareUpdateJobResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.CreateSoftwareUpdateJobRequest request]
    (-> this (.createSoftwareUpdateJob request))))

(defn disassociate-role-from-group
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.DisassociateRoleFromGroupRequest`

  returns: Result of the DisassociateRoleFromGroup operation returned by the service. - `com.amazonaws.services.greengrass.model.DisassociateRoleFromGroupResult`"
  (^com.amazonaws.services.greengrass.model.DisassociateRoleFromGroupResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.DisassociateRoleFromGroupRequest request]
    (-> this (.disassociateRoleFromGroup request))))

(defn update-connector-definition
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.UpdateConnectorDefinitionRequest`

  returns: Result of the UpdateConnectorDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.UpdateConnectorDefinitionResult`"
  (^com.amazonaws.services.greengrass.model.UpdateConnectorDefinitionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.UpdateConnectorDefinitionRequest request]
    (-> this (.updateConnectorDefinition request))))

(defn get-associated-role
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.GetAssociatedRoleRequest`

  returns: Result of the GetAssociatedRole operation returned by the service. - `com.amazonaws.services.greengrass.model.GetAssociatedRoleResult`"
  (^com.amazonaws.services.greengrass.model.GetAssociatedRoleResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.GetAssociatedRoleRequest request]
    (-> this (.getAssociatedRole request))))

(defn list-resource-definitions
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.ListResourceDefinitionsRequest`

  returns: Result of the ListResourceDefinitions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListResourceDefinitionsResult`"
  (^com.amazonaws.services.greengrass.model.ListResourceDefinitionsResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.ListResourceDefinitionsRequest request]
    (-> this (.listResourceDefinitions request))))

(defn delete-connector-definition
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.DeleteConnectorDefinitionRequest`

  returns: Result of the DeleteConnectorDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.DeleteConnectorDefinitionResult`"
  (^com.amazonaws.services.greengrass.model.DeleteConnectorDefinitionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.DeleteConnectorDefinitionRequest request]
    (-> this (.deleteConnectorDefinition request))))

(defn list-groups
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.ListGroupsRequest`

  returns: Result of the ListGroups operation returned by the service. - `com.amazonaws.services.greengrass.model.ListGroupsResult`"
  (^com.amazonaws.services.greengrass.model.ListGroupsResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.ListGroupsRequest request]
    (-> this (.listGroups request))))

(defn delete-function-definition
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.DeleteFunctionDefinitionRequest`

  returns: Result of the DeleteFunctionDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.DeleteFunctionDefinitionResult`"
  (^com.amazonaws.services.greengrass.model.DeleteFunctionDefinitionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.DeleteFunctionDefinitionRequest request]
    (-> this (.deleteFunctionDefinition request))))

(defn update-core-definition
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.UpdateCoreDefinitionRequest`

  returns: Result of the UpdateCoreDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.UpdateCoreDefinitionResult`"
  (^com.amazonaws.services.greengrass.model.UpdateCoreDefinitionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.UpdateCoreDefinitionRequest request]
    (-> this (.updateCoreDefinition request))))

(defn get-connectivity-info
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.GetConnectivityInfoRequest`

  returns: Result of the GetConnectivityInfo operation returned by the service. - `com.amazonaws.services.greengrass.model.GetConnectivityInfoResult`"
  (^com.amazonaws.services.greengrass.model.GetConnectivityInfoResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.GetConnectivityInfoRequest request]
    (-> this (.getConnectivityInfo request))))

(defn get-group-certificate-authority
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.GetGroupCertificateAuthorityRequest`

  returns: Result of the GetGroupCertificateAuthority operation returned by the service. - `com.amazonaws.services.greengrass.model.GetGroupCertificateAuthorityResult`"
  (^com.amazonaws.services.greengrass.model.GetGroupCertificateAuthorityResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.GetGroupCertificateAuthorityRequest request]
    (-> this (.getGroupCertificateAuthority request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSGreengrass

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSGreengrass this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn list-subscription-definition-versions
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionVersionsRequest`

  returns: Result of the ListSubscriptionDefinitionVersions operation returned by the service. - `com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionVersionsResult`"
  (^com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionVersionsResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionVersionsRequest request]
    (-> this (.listSubscriptionDefinitionVersions request))))

(defn start-bulk-deployment
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.StartBulkDeploymentRequest`

  returns: Result of the StartBulkDeployment operation returned by the service. - `com.amazonaws.services.greengrass.model.StartBulkDeploymentResult`"
  (^com.amazonaws.services.greengrass.model.StartBulkDeploymentResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.StartBulkDeploymentRequest request]
    (-> this (.startBulkDeployment request))))

(defn delete-logger-definition
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.DeleteLoggerDefinitionRequest`

  returns: Result of the DeleteLoggerDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.DeleteLoggerDefinitionResult`"
  (^com.amazonaws.services.greengrass.model.DeleteLoggerDefinitionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.DeleteLoggerDefinitionRequest request]
    (-> this (.deleteLoggerDefinition request))))

(defn update-connectivity-info
  "Description copied from interface: AWSGreengrass

  request - Connectivity information. - `com.amazonaws.services.greengrass.model.UpdateConnectivityInfoRequest`

  returns: Result of the UpdateConnectivityInfo operation returned by the service. - `com.amazonaws.services.greengrass.model.UpdateConnectivityInfoResult`"
  (^com.amazonaws.services.greengrass.model.UpdateConnectivityInfoResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.UpdateConnectivityInfoRequest request]
    (-> this (.updateConnectivityInfo request))))

(defn stop-bulk-deployment
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.StopBulkDeploymentRequest`

  returns: Result of the StopBulkDeployment operation returned by the service. - `com.amazonaws.services.greengrass.model.StopBulkDeploymentResult`"
  (^com.amazonaws.services.greengrass.model.StopBulkDeploymentResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.StopBulkDeploymentRequest request]
    (-> this (.stopBulkDeployment request))))

(defn tag-resource
  "Description copied from interface: AWSGreengrass

  request - A map of the key-value pairs for the resource tag. - `com.amazonaws.services.greengrass.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.greengrass.model.TagResourceResult`"
  (^com.amazonaws.services.greengrass.model.TagResourceResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn create-group-version
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.CreateGroupVersionRequest`

  returns: Result of the CreateGroupVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.CreateGroupVersionResult`"
  (^com.amazonaws.services.greengrass.model.CreateGroupVersionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.CreateGroupVersionRequest request]
    (-> this (.createGroupVersion request))))

(defn update-device-definition
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.UpdateDeviceDefinitionRequest`

  returns: Result of the UpdateDeviceDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.UpdateDeviceDefinitionResult`"
  (^com.amazonaws.services.greengrass.model.UpdateDeviceDefinitionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.UpdateDeviceDefinitionRequest request]
    (-> this (.updateDeviceDefinition request))))

(defn get-connector-definition
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.GetConnectorDefinitionRequest`

  returns: Result of the GetConnectorDefinition operation returned by the service. - `com.amazonaws.services.greengrass.model.GetConnectorDefinitionResult`"
  (^com.amazonaws.services.greengrass.model.GetConnectorDefinitionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.GetConnectorDefinitionRequest request]
    (-> this (.getConnectorDefinition request))))

(defn get-core-definition-version
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.GetCoreDefinitionVersionRequest`

  returns: Result of the GetCoreDefinitionVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.GetCoreDefinitionVersionResult`"
  (^com.amazonaws.services.greengrass.model.GetCoreDefinitionVersionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.GetCoreDefinitionVersionRequest request]
    (-> this (.getCoreDefinitionVersion request))))

(defn get-logger-definition-version
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.GetLoggerDefinitionVersionRequest`

  returns: Result of the GetLoggerDefinitionVersion operation returned by the service. - `com.amazonaws.services.greengrass.model.GetLoggerDefinitionVersionResult`"
  (^com.amazonaws.services.greengrass.model.GetLoggerDefinitionVersionResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.GetLoggerDefinitionVersionRequest request]
    (-> this (.getLoggerDefinitionVersion request))))

(defn get-group
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.GetGroupRequest`

  returns: Result of the GetGroup operation returned by the service. - `com.amazonaws.services.greengrass.model.GetGroupResult`"
  (^com.amazonaws.services.greengrass.model.GetGroupResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.GetGroupRequest request]
    (-> this (.getGroup request))))

(defn get-group-certificate-configuration
  "Description copied from interface: AWSGreengrass

  request - `com.amazonaws.services.greengrass.model.GetGroupCertificateConfigurationRequest`

  returns: Result of the GetGroupCertificateConfiguration operation returned by the service. - `com.amazonaws.services.greengrass.model.GetGroupCertificateConfigurationResult`"
  (^com.amazonaws.services.greengrass.model.GetGroupCertificateConfigurationResult [^AbstractAWSGreengrass this ^com.amazonaws.services.greengrass.model.GetGroupCertificateConfigurationRequest request]
    (-> this (.getGroupCertificateConfiguration request))))

