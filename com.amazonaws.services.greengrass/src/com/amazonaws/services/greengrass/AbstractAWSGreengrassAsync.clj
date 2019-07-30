(ns com.amazonaws.services.greengrass.AbstractAWSGreengrassAsync
  "Abstract implementation of AWSGreengrassAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.greengrass AbstractAWSGreengrassAsync]))

(defn untag-resource-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn disassociate-role-from-group-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.DisassociateRoleFromGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateRoleFromGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.DisassociateRoleFromGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.DisassociateRoleFromGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateRoleFromGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.DisassociateRoleFromGroupRequest request]
    (-> this (.disassociateRoleFromGroupAsync request))))

(defn get-connectivity-info-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.GetConnectivityInfoRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetConnectivityInfo operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetConnectivityInfoResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetConnectivityInfoRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getConnectivityInfoAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetConnectivityInfoRequest request]
    (-> this (.getConnectivityInfoAsync request))))

(defn create-logger-definition-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.CreateLoggerDefinitionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLoggerDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.CreateLoggerDefinitionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateLoggerDefinitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLoggerDefinitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateLoggerDefinitionRequest request]
    (-> this (.createLoggerDefinitionAsync request))))

(defn disassociate-service-role-from-account-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.DisassociateServiceRoleFromAccountRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateServiceRoleFromAccount operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.DisassociateServiceRoleFromAccountResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.DisassociateServiceRoleFromAccountRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateServiceRoleFromAccountAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.DisassociateServiceRoleFromAccountRequest request]
    (-> this (.disassociateServiceRoleFromAccountAsync request))))

(defn list-function-definition-versions-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.ListFunctionDefinitionVersionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListFunctionDefinitionVersions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ListFunctionDefinitionVersionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListFunctionDefinitionVersionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listFunctionDefinitionVersionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListFunctionDefinitionVersionsRequest request]
    (-> this (.listFunctionDefinitionVersionsAsync request))))

(defn update-connector-definition-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.UpdateConnectorDefinitionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateConnectorDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.UpdateConnectorDefinitionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UpdateConnectorDefinitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateConnectorDefinitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UpdateConnectorDefinitionRequest request]
    (-> this (.updateConnectorDefinitionAsync request))))

(defn list-logger-definition-versions-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.ListLoggerDefinitionVersionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListLoggerDefinitionVersions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ListLoggerDefinitionVersionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListLoggerDefinitionVersionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listLoggerDefinitionVersionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListLoggerDefinitionVersionsRequest request]
    (-> this (.listLoggerDefinitionVersionsAsync request))))

(defn delete-function-definition-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.DeleteFunctionDefinitionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFunctionDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.DeleteFunctionDefinitionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.DeleteFunctionDefinitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFunctionDefinitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.DeleteFunctionDefinitionRequest request]
    (-> this (.deleteFunctionDefinitionAsync request))))

(defn list-subscription-definition-versions-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionVersionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSubscriptionDefinitionVersions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionVersionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionVersionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSubscriptionDefinitionVersionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionVersionsRequest request]
    (-> this (.listSubscriptionDefinitionVersionsAsync request))))

(defn list-device-definition-versions-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.ListDeviceDefinitionVersionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDeviceDefinitionVersions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ListDeviceDefinitionVersionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListDeviceDefinitionVersionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDeviceDefinitionVersionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListDeviceDefinitionVersionsRequest request]
    (-> this (.listDeviceDefinitionVersionsAsync request))))

(defn get-device-definition-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.GetDeviceDefinitionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDeviceDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetDeviceDefinitionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetDeviceDefinitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDeviceDefinitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetDeviceDefinitionRequest request]
    (-> this (.getDeviceDefinitionAsync request))))

(defn create-group-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.CreateGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.CreateGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateGroupRequest request]
    (-> this (.createGroupAsync request))))

(defn list-bulk-deployments-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.ListBulkDeploymentsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBulkDeployments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ListBulkDeploymentsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListBulkDeploymentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBulkDeploymentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListBulkDeploymentsRequest request]
    (-> this (.listBulkDeploymentsAsync request))))

(defn update-device-definition-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.UpdateDeviceDefinitionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDeviceDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.UpdateDeviceDefinitionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UpdateDeviceDefinitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDeviceDefinitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UpdateDeviceDefinitionRequest request]
    (-> this (.updateDeviceDefinitionAsync request))))

(defn create-logger-definition-version-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.CreateLoggerDefinitionVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLoggerDefinitionVersion operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.CreateLoggerDefinitionVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateLoggerDefinitionVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLoggerDefinitionVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateLoggerDefinitionVersionRequest request]
    (-> this (.createLoggerDefinitionVersionAsync request))))

(defn get-logger-definition-version-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.GetLoggerDefinitionVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLoggerDefinitionVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetLoggerDefinitionVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetLoggerDefinitionVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLoggerDefinitionVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetLoggerDefinitionVersionRequest request]
    (-> this (.getLoggerDefinitionVersionAsync request))))

(defn get-deployment-status-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.GetDeploymentStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDeploymentStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetDeploymentStatusResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetDeploymentStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDeploymentStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetDeploymentStatusRequest request]
    (-> this (.getDeploymentStatusAsync request))))

(defn update-function-definition-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.UpdateFunctionDefinitionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateFunctionDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.UpdateFunctionDefinitionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UpdateFunctionDefinitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateFunctionDefinitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UpdateFunctionDefinitionRequest request]
    (-> this (.updateFunctionDefinitionAsync request))))

(defn update-subscription-definition-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.UpdateSubscriptionDefinitionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSubscriptionDefinition operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.UpdateSubscriptionDefinitionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UpdateSubscriptionDefinitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSubscriptionDefinitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UpdateSubscriptionDefinitionRequest request]
    (-> this (.updateSubscriptionDefinitionAsync request))))

(defn get-connector-definition-version-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.GetConnectorDefinitionVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetConnectorDefinitionVersion operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetConnectorDefinitionVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetConnectorDefinitionVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getConnectorDefinitionVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetConnectorDefinitionVersionRequest request]
    (-> this (.getConnectorDefinitionVersionAsync request))))

(defn get-core-definition-version-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.GetCoreDefinitionVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCoreDefinitionVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetCoreDefinitionVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetCoreDefinitionVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCoreDefinitionVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetCoreDefinitionVersionRequest request]
    (-> this (.getCoreDefinitionVersionAsync request))))

(defn list-connector-definitions-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.ListConnectorDefinitionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListConnectorDefinitions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ListConnectorDefinitionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListConnectorDefinitionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listConnectorDefinitionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListConnectorDefinitionsRequest request]
    (-> this (.listConnectorDefinitionsAsync request))))

(defn update-core-definition-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.UpdateCoreDefinitionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateCoreDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.UpdateCoreDefinitionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UpdateCoreDefinitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateCoreDefinitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UpdateCoreDefinitionRequest request]
    (-> this (.updateCoreDefinitionAsync request))))

(defn delete-core-definition-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.DeleteCoreDefinitionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCoreDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.DeleteCoreDefinitionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.DeleteCoreDefinitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCoreDefinitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.DeleteCoreDefinitionRequest request]
    (-> this (.deleteCoreDefinitionAsync request))))

(defn associate-role-to-group-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.AssociateRoleToGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateRoleToGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.AssociateRoleToGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.AssociateRoleToGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateRoleToGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.AssociateRoleToGroupRequest request]
    (-> this (.associateRoleToGroupAsync request))))

(defn reset-deployments-async
  "Description copied from interface: AWSGreengrassAsync

  request - Information needed to reset deployments. - `com.amazonaws.services.greengrass.model.ResetDeploymentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResetDeployments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ResetDeploymentsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ResetDeploymentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resetDeploymentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ResetDeploymentsRequest request]
    (-> this (.resetDeploymentsAsync request))))

(defn list-subscription-definitions-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSubscriptionDefinitions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSubscriptionDefinitionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionsRequest request]
    (-> this (.listSubscriptionDefinitionsAsync request))))

(defn create-subscription-definition-version-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSubscriptionDefinitionVersion operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSubscriptionDefinitionVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionVersionRequest request]
    (-> this (.createSubscriptionDefinitionVersionAsync request))))

(defn update-group-certificate-configuration-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.UpdateGroupCertificateConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateGroupCertificateConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.UpdateGroupCertificateConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UpdateGroupCertificateConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateGroupCertificateConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UpdateGroupCertificateConfigurationRequest request]
    (-> this (.updateGroupCertificateConfigurationAsync request))))

(defn list-group-versions-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.ListGroupVersionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGroupVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ListGroupVersionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListGroupVersionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGroupVersionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListGroupVersionsRequest request]
    (-> this (.listGroupVersionsAsync request))))

(defn create-connector-definition-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.CreateConnectorDefinitionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateConnectorDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.CreateConnectorDefinitionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateConnectorDefinitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createConnectorDefinitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateConnectorDefinitionRequest request]
    (-> this (.createConnectorDefinitionAsync request))))

(defn get-subscription-definition-version-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSubscriptionDefinitionVersion operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSubscriptionDefinitionVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionVersionRequest request]
    (-> this (.getSubscriptionDefinitionVersionAsync request))))

(defn get-logger-definition-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.GetLoggerDefinitionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLoggerDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetLoggerDefinitionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetLoggerDefinitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLoggerDefinitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetLoggerDefinitionRequest request]
    (-> this (.getLoggerDefinitionAsync request))))

(defn delete-resource-definition-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.DeleteResourceDefinitionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteResourceDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.DeleteResourceDefinitionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.DeleteResourceDefinitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteResourceDefinitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.DeleteResourceDefinitionRequest request]
    (-> this (.deleteResourceDefinitionAsync request))))

(defn get-device-definition-version-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.GetDeviceDefinitionVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDeviceDefinitionVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetDeviceDefinitionVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetDeviceDefinitionVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDeviceDefinitionVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetDeviceDefinitionVersionRequest request]
    (-> this (.getDeviceDefinitionVersionAsync request))))

(defn delete-connector-definition-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.DeleteConnectorDefinitionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteConnectorDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.DeleteConnectorDefinitionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.DeleteConnectorDefinitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteConnectorDefinitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.DeleteConnectorDefinitionRequest request]
    (-> this (.deleteConnectorDefinitionAsync request))))

(defn create-group-certificate-authority-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.CreateGroupCertificateAuthorityRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateGroupCertificateAuthority operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.CreateGroupCertificateAuthorityResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateGroupCertificateAuthorityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createGroupCertificateAuthorityAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateGroupCertificateAuthorityRequest request]
    (-> this (.createGroupCertificateAuthorityAsync request))))

(defn get-resource-definition-version-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.GetResourceDefinitionVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetResourceDefinitionVersion operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetResourceDefinitionVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetResourceDefinitionVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getResourceDefinitionVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetResourceDefinitionVersionRequest request]
    (-> this (.getResourceDefinitionVersionAsync request))))

(defn create-function-definition-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.CreateFunctionDefinitionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateFunctionDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.CreateFunctionDefinitionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateFunctionDefinitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createFunctionDefinitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateFunctionDefinitionRequest request]
    (-> this (.createFunctionDefinitionAsync request))))

(defn delete-device-definition-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.DeleteDeviceDefinitionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDeviceDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.DeleteDeviceDefinitionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.DeleteDeviceDefinitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDeviceDefinitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.DeleteDeviceDefinitionRequest request]
    (-> this (.deleteDeviceDefinitionAsync request))))

(defn list-resource-definitions-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.ListResourceDefinitionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListResourceDefinitions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ListResourceDefinitionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListResourceDefinitionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listResourceDefinitionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListResourceDefinitionsRequest request]
    (-> this (.listResourceDefinitionsAsync request))))

(defn get-group-version-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.GetGroupVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetGroupVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetGroupVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetGroupVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getGroupVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetGroupVersionRequest request]
    (-> this (.getGroupVersionAsync request))))

(defn list-core-definitions-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.ListCoreDefinitionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListCoreDefinitions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ListCoreDefinitionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListCoreDefinitionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listCoreDefinitionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListCoreDefinitionsRequest request]
    (-> this (.listCoreDefinitionsAsync request))))

(defn create-resource-definition-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.CreateResourceDefinitionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateResourceDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.CreateResourceDefinitionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateResourceDefinitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createResourceDefinitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateResourceDefinitionRequest request]
    (-> this (.createResourceDefinitionAsync request))))

(defn list-connector-definition-versions-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.ListConnectorDefinitionVersionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListConnectorDefinitionVersions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ListConnectorDefinitionVersionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListConnectorDefinitionVersionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listConnectorDefinitionVersionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListConnectorDefinitionVersionsRequest request]
    (-> this (.listConnectorDefinitionVersionsAsync request))))

(defn update-group-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.UpdateGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.UpdateGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UpdateGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UpdateGroupRequest request]
    (-> this (.updateGroupAsync request))))

(defn list-logger-definitions-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.ListLoggerDefinitionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListLoggerDefinitions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ListLoggerDefinitionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListLoggerDefinitionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listLoggerDefinitionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListLoggerDefinitionsRequest request]
    (-> this (.listLoggerDefinitionsAsync request))))

(defn get-core-definition-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.GetCoreDefinitionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCoreDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetCoreDefinitionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetCoreDefinitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCoreDefinitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetCoreDefinitionRequest request]
    (-> this (.getCoreDefinitionAsync request))))

(defn get-service-role-for-account-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.GetServiceRoleForAccountRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetServiceRoleForAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetServiceRoleForAccountResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetServiceRoleForAccountRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getServiceRoleForAccountAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetServiceRoleForAccountRequest request]
    (-> this (.getServiceRoleForAccountAsync request))))

(defn get-group-certificate-configuration-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.GetGroupCertificateConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetGroupCertificateConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetGroupCertificateConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetGroupCertificateConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getGroupCertificateConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetGroupCertificateConfigurationRequest request]
    (-> this (.getGroupCertificateConfigurationAsync request))))

(defn get-group-certificate-authority-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.GetGroupCertificateAuthorityRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetGroupCertificateAuthority operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetGroupCertificateAuthorityResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetGroupCertificateAuthorityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getGroupCertificateAuthorityAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetGroupCertificateAuthorityRequest request]
    (-> this (.getGroupCertificateAuthorityAsync request))))

(defn create-function-definition-version-async
  "Description copied from interface: AWSGreengrassAsync

  request - Information needed to create a function definition version. - `com.amazonaws.services.greengrass.model.CreateFunctionDefinitionVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateFunctionDefinitionVersion operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.CreateFunctionDefinitionVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateFunctionDefinitionVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createFunctionDefinitionVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateFunctionDefinitionVersionRequest request]
    (-> this (.createFunctionDefinitionVersionAsync request))))

(defn list-core-definition-versions-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.ListCoreDefinitionVersionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListCoreDefinitionVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ListCoreDefinitionVersionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListCoreDefinitionVersionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listCoreDefinitionVersionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListCoreDefinitionVersionsRequest request]
    (-> this (.listCoreDefinitionVersionsAsync request))))

(defn update-connectivity-info-async
  "Description copied from interface: AWSGreengrassAsync

  request - Connectivity information. - `com.amazonaws.services.greengrass.model.UpdateConnectivityInfoRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateConnectivityInfo operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.UpdateConnectivityInfoResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UpdateConnectivityInfoRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateConnectivityInfoAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UpdateConnectivityInfoRequest request]
    (-> this (.updateConnectivityInfoAsync request))))

(defn list-group-certificate-authorities-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.ListGroupCertificateAuthoritiesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGroupCertificateAuthorities operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ListGroupCertificateAuthoritiesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListGroupCertificateAuthoritiesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGroupCertificateAuthoritiesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListGroupCertificateAuthoritiesRequest request]
    (-> this (.listGroupCertificateAuthoritiesAsync request))))

(defn create-connector-definition-version-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.CreateConnectorDefinitionVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateConnectorDefinitionVersion operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.CreateConnectorDefinitionVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateConnectorDefinitionVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createConnectorDefinitionVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateConnectorDefinitionVersionRequest request]
    (-> this (.createConnectorDefinitionVersionAsync request))))

(defn get-group-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.GetGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetGroupRequest request]
    (-> this (.getGroupAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn get-bulk-deployment-status-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.GetBulkDeploymentStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBulkDeploymentStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetBulkDeploymentStatusResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetBulkDeploymentStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBulkDeploymentStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetBulkDeploymentStatusRequest request]
    (-> this (.getBulkDeploymentStatusAsync request))))

(defn get-subscription-definition-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSubscriptionDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSubscriptionDefinitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionRequest request]
    (-> this (.getSubscriptionDefinitionAsync request))))

(defn get-function-definition-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.GetFunctionDefinitionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFunctionDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetFunctionDefinitionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetFunctionDefinitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFunctionDefinitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetFunctionDefinitionRequest request]
    (-> this (.getFunctionDefinitionAsync request))))

(defn start-bulk-deployment-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.StartBulkDeploymentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartBulkDeployment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.StartBulkDeploymentResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.StartBulkDeploymentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startBulkDeploymentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.StartBulkDeploymentRequest request]
    (-> this (.startBulkDeploymentAsync request))))

(defn get-associated-role-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.GetAssociatedRoleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAssociatedRole operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetAssociatedRoleResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetAssociatedRoleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAssociatedRoleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetAssociatedRoleRequest request]
    (-> this (.getAssociatedRoleAsync request))))

(defn create-software-update-job-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.CreateSoftwareUpdateJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSoftwareUpdateJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.CreateSoftwareUpdateJobResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateSoftwareUpdateJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSoftwareUpdateJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateSoftwareUpdateJobRequest request]
    (-> this (.createSoftwareUpdateJobAsync request))))

(defn create-device-definition-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.CreateDeviceDefinitionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDeviceDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.CreateDeviceDefinitionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateDeviceDefinitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDeviceDefinitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateDeviceDefinitionRequest request]
    (-> this (.createDeviceDefinitionAsync request))))

(defn create-device-definition-version-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.CreateDeviceDefinitionVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDeviceDefinitionVersion operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.CreateDeviceDefinitionVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateDeviceDefinitionVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDeviceDefinitionVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateDeviceDefinitionVersionRequest request]
    (-> this (.createDeviceDefinitionVersionAsync request))))

(defn get-function-definition-version-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.GetFunctionDefinitionVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFunctionDefinitionVersion operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetFunctionDefinitionVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetFunctionDefinitionVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFunctionDefinitionVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetFunctionDefinitionVersionRequest request]
    (-> this (.getFunctionDefinitionVersionAsync request))))

(defn associate-service-role-to-account-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.AssociateServiceRoleToAccountRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateServiceRoleToAccount operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.AssociateServiceRoleToAccountResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.AssociateServiceRoleToAccountRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateServiceRoleToAccountAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.AssociateServiceRoleToAccountRequest request]
    (-> this (.associateServiceRoleToAccountAsync request))))

(defn create-resource-definition-version-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.CreateResourceDefinitionVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateResourceDefinitionVersion operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.CreateResourceDefinitionVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateResourceDefinitionVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createResourceDefinitionVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateResourceDefinitionVersionRequest request]
    (-> this (.createResourceDefinitionVersionAsync request))))

(defn get-connector-definition-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.GetConnectorDefinitionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetConnectorDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetConnectorDefinitionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetConnectorDefinitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getConnectorDefinitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetConnectorDefinitionRequest request]
    (-> this (.getConnectorDefinitionAsync request))))

(defn update-logger-definition-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.UpdateLoggerDefinitionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateLoggerDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.UpdateLoggerDefinitionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UpdateLoggerDefinitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateLoggerDefinitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UpdateLoggerDefinitionRequest request]
    (-> this (.updateLoggerDefinitionAsync request))))

(defn list-function-definitions-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.ListFunctionDefinitionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListFunctionDefinitions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ListFunctionDefinitionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListFunctionDefinitionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listFunctionDefinitionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListFunctionDefinitionsRequest request]
    (-> this (.listFunctionDefinitionsAsync request))))

(defn create-deployment-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.CreateDeploymentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDeployment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.CreateDeploymentResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateDeploymentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDeploymentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateDeploymentRequest request]
    (-> this (.createDeploymentAsync request))))

(defn update-resource-definition-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.UpdateResourceDefinitionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateResourceDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.UpdateResourceDefinitionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UpdateResourceDefinitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateResourceDefinitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UpdateResourceDefinitionRequest request]
    (-> this (.updateResourceDefinitionAsync request))))

(defn create-core-definition-version-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.CreateCoreDefinitionVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCoreDefinitionVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.CreateCoreDefinitionVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateCoreDefinitionVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCoreDefinitionVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateCoreDefinitionVersionRequest request]
    (-> this (.createCoreDefinitionVersionAsync request))))

(defn list-bulk-deployment-detailed-reports-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.ListBulkDeploymentDetailedReportsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBulkDeploymentDetailedReports operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ListBulkDeploymentDetailedReportsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListBulkDeploymentDetailedReportsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBulkDeploymentDetailedReportsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListBulkDeploymentDetailedReportsRequest request]
    (-> this (.listBulkDeploymentDetailedReportsAsync request))))

(defn get-resource-definition-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.GetResourceDefinitionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetResourceDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetResourceDefinitionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetResourceDefinitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getResourceDefinitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetResourceDefinitionRequest request]
    (-> this (.getResourceDefinitionAsync request))))

(defn list-groups-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.ListGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ListGroupsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListGroupsRequest request]
    (-> this (.listGroupsAsync request))))

(defn list-deployments-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.ListDeploymentsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDeployments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ListDeploymentsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListDeploymentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDeploymentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListDeploymentsRequest request]
    (-> this (.listDeploymentsAsync request))))

(defn create-subscription-definition-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSubscriptionDefinition operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSubscriptionDefinitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionRequest request]
    (-> this (.createSubscriptionDefinitionAsync request))))

(defn delete-group-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.DeleteGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.DeleteGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.DeleteGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.DeleteGroupRequest request]
    (-> this (.deleteGroupAsync request))))

(defn stop-bulk-deployment-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.StopBulkDeploymentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopBulkDeployment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.StopBulkDeploymentResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.StopBulkDeploymentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopBulkDeploymentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.StopBulkDeploymentRequest request]
    (-> this (.stopBulkDeploymentAsync request))))

(defn tag-resource-async
  "Description copied from interface: AWSGreengrassAsync

  request - A map of the key-value pairs for the resource tag. - `com.amazonaws.services.greengrass.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn list-device-definitions-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.ListDeviceDefinitionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDeviceDefinitions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ListDeviceDefinitionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListDeviceDefinitionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDeviceDefinitionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListDeviceDefinitionsRequest request]
    (-> this (.listDeviceDefinitionsAsync request))))

(defn list-resource-definition-versions-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.ListResourceDefinitionVersionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListResourceDefinitionVersions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ListResourceDefinitionVersionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListResourceDefinitionVersionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listResourceDefinitionVersionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListResourceDefinitionVersionsRequest request]
    (-> this (.listResourceDefinitionVersionsAsync request))))

(defn create-group-version-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.CreateGroupVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateGroupVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.CreateGroupVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateGroupVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createGroupVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateGroupVersionRequest request]
    (-> this (.createGroupVersionAsync request))))

(defn delete-subscription-definition-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.DeleteSubscriptionDefinitionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSubscriptionDefinition operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.DeleteSubscriptionDefinitionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.DeleteSubscriptionDefinitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSubscriptionDefinitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.DeleteSubscriptionDefinitionRequest request]
    (-> this (.deleteSubscriptionDefinitionAsync request))))

(defn create-core-definition-async
  "Description copied from interface: AWSGreengrassAsync

  request - Information needed to create a core definition. - `com.amazonaws.services.greengrass.model.CreateCoreDefinitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCoreDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.CreateCoreDefinitionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateCoreDefinitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCoreDefinitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateCoreDefinitionRequest request]
    (-> this (.createCoreDefinitionAsync request))))

(defn delete-logger-definition-async
  "Description copied from interface: AWSGreengrassAsync

  request - `com.amazonaws.services.greengrass.model.DeleteLoggerDefinitionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLoggerDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.DeleteLoggerDefinitionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.DeleteLoggerDefinitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLoggerDefinitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.DeleteLoggerDefinitionRequest request]
    (-> this (.deleteLoggerDefinitionAsync request))))

