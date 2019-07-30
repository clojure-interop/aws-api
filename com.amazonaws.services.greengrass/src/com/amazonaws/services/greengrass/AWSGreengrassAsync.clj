(ns com.amazonaws.services.greengrass.AWSGreengrassAsync
  "Interface for accessing AWS Greengrass asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSGreengrassAsync instead.


  AWS IoT Greengrass seamlessly extends AWS onto physical devices so they can act locally on the data they generate,
  while still using the cloud for management, analytics, and durable storage. AWS IoT Greengrass ensures your devices
  can respond quickly to local events and operate with intermittent connectivity. AWS IoT Greengrass minimizes the cost
  of transmitting data to the cloud by allowing you to author AWS Lambda functions that execute locally."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.greengrass AWSGreengrassAsync]))

(defn untag-resource-async
  "Remove resource tags from a Greengrass Resource.

  untag-resource-request - `com.amazonaws.services.greengrass.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn disassociate-role-from-group-async
  "Disassociates the role from a group.

  disassociate-role-from-group-request - `com.amazonaws.services.greengrass.model.DisassociateRoleFromGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateRoleFromGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.DisassociateRoleFromGroupResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.DisassociateRoleFromGroupRequest disassociate-role-from-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateRoleFromGroupAsync disassociate-role-from-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.DisassociateRoleFromGroupRequest disassociate-role-from-group-request]
    (-> this (.disassociateRoleFromGroupAsync disassociate-role-from-group-request))))

(defn get-connectivity-info-async
  "Retrieves the connectivity information for a core.

  get-connectivity-info-request - `com.amazonaws.services.greengrass.model.GetConnectivityInfoRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetConnectivityInfo operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetConnectivityInfoResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetConnectivityInfoRequest get-connectivity-info-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getConnectivityInfoAsync get-connectivity-info-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetConnectivityInfoRequest get-connectivity-info-request]
    (-> this (.getConnectivityInfoAsync get-connectivity-info-request))))

(defn create-logger-definition-async
  "Creates a logger definition. You may provide the initial version of the logger definition now or use
   ''CreateLoggerDefinitionVersion'' at a later time.

  create-logger-definition-request - `com.amazonaws.services.greengrass.model.CreateLoggerDefinitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLoggerDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.CreateLoggerDefinitionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateLoggerDefinitionRequest create-logger-definition-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLoggerDefinitionAsync create-logger-definition-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateLoggerDefinitionRequest create-logger-definition-request]
    (-> this (.createLoggerDefinitionAsync create-logger-definition-request))))

(defn disassociate-service-role-from-account-async
  "Disassociates the service role from your account. Without a service role, deployments will not work.

  disassociate-service-role-from-account-request - `com.amazonaws.services.greengrass.model.DisassociateServiceRoleFromAccountRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateServiceRoleFromAccount operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.DisassociateServiceRoleFromAccountResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.DisassociateServiceRoleFromAccountRequest disassociate-service-role-from-account-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateServiceRoleFromAccountAsync disassociate-service-role-from-account-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.DisassociateServiceRoleFromAccountRequest disassociate-service-role-from-account-request]
    (-> this (.disassociateServiceRoleFromAccountAsync disassociate-service-role-from-account-request))))

(defn list-function-definition-versions-async
  "Lists the versions of a Lambda function definition.

  list-function-definition-versions-request - `com.amazonaws.services.greengrass.model.ListFunctionDefinitionVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListFunctionDefinitionVersions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ListFunctionDefinitionVersionsResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListFunctionDefinitionVersionsRequest list-function-definition-versions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listFunctionDefinitionVersionsAsync list-function-definition-versions-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListFunctionDefinitionVersionsRequest list-function-definition-versions-request]
    (-> this (.listFunctionDefinitionVersionsAsync list-function-definition-versions-request))))

(defn update-connector-definition-async
  "Updates a connector definition.

  update-connector-definition-request - `com.amazonaws.services.greengrass.model.UpdateConnectorDefinitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateConnectorDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.UpdateConnectorDefinitionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UpdateConnectorDefinitionRequest update-connector-definition-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateConnectorDefinitionAsync update-connector-definition-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UpdateConnectorDefinitionRequest update-connector-definition-request]
    (-> this (.updateConnectorDefinitionAsync update-connector-definition-request))))

(defn list-logger-definition-versions-async
  "Lists the versions of a logger definition.

  list-logger-definition-versions-request - `com.amazonaws.services.greengrass.model.ListLoggerDefinitionVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListLoggerDefinitionVersions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ListLoggerDefinitionVersionsResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListLoggerDefinitionVersionsRequest list-logger-definition-versions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listLoggerDefinitionVersionsAsync list-logger-definition-versions-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListLoggerDefinitionVersionsRequest list-logger-definition-versions-request]
    (-> this (.listLoggerDefinitionVersionsAsync list-logger-definition-versions-request))))

(defn delete-function-definition-async
  "Deletes a Lambda function definition.

  delete-function-definition-request - `com.amazonaws.services.greengrass.model.DeleteFunctionDefinitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFunctionDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.DeleteFunctionDefinitionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.DeleteFunctionDefinitionRequest delete-function-definition-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFunctionDefinitionAsync delete-function-definition-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.DeleteFunctionDefinitionRequest delete-function-definition-request]
    (-> this (.deleteFunctionDefinitionAsync delete-function-definition-request))))

(defn list-subscription-definition-versions-async
  "Lists the versions of a subscription definition.

  list-subscription-definition-versions-request - `com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSubscriptionDefinitionVersions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionVersionsResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionVersionsRequest list-subscription-definition-versions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSubscriptionDefinitionVersionsAsync list-subscription-definition-versions-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionVersionsRequest list-subscription-definition-versions-request]
    (-> this (.listSubscriptionDefinitionVersionsAsync list-subscription-definition-versions-request))))

(defn list-device-definition-versions-async
  "Lists the versions of a device definition.

  list-device-definition-versions-request - `com.amazonaws.services.greengrass.model.ListDeviceDefinitionVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDeviceDefinitionVersions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ListDeviceDefinitionVersionsResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListDeviceDefinitionVersionsRequest list-device-definition-versions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDeviceDefinitionVersionsAsync list-device-definition-versions-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListDeviceDefinitionVersionsRequest list-device-definition-versions-request]
    (-> this (.listDeviceDefinitionVersionsAsync list-device-definition-versions-request))))

(defn get-device-definition-async
  "Retrieves information about a device definition.

  get-device-definition-request - `com.amazonaws.services.greengrass.model.GetDeviceDefinitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDeviceDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetDeviceDefinitionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetDeviceDefinitionRequest get-device-definition-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDeviceDefinitionAsync get-device-definition-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetDeviceDefinitionRequest get-device-definition-request]
    (-> this (.getDeviceDefinitionAsync get-device-definition-request))))

(defn create-group-async
  "Creates a group. You may provide the initial version of the group or use ''CreateGroupVersion'' at a later time.
   Tip: You can use the ''gg_group_setup'' package (https://github.com/awslabs/aws-greengrass-group-setup) as a
   library or command-line application to create and deploy Greengrass groups.

  create-group-request - `com.amazonaws.services.greengrass.model.CreateGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.CreateGroupResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateGroupRequest create-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createGroupAsync create-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateGroupRequest create-group-request]
    (-> this (.createGroupAsync create-group-request))))

(defn list-bulk-deployments-async
  "Returns a list of bulk deployments.

  list-bulk-deployments-request - `com.amazonaws.services.greengrass.model.ListBulkDeploymentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBulkDeployments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ListBulkDeploymentsResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListBulkDeploymentsRequest list-bulk-deployments-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBulkDeploymentsAsync list-bulk-deployments-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListBulkDeploymentsRequest list-bulk-deployments-request]
    (-> this (.listBulkDeploymentsAsync list-bulk-deployments-request))))

(defn update-device-definition-async
  "Updates a device definition.

  update-device-definition-request - `com.amazonaws.services.greengrass.model.UpdateDeviceDefinitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDeviceDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.UpdateDeviceDefinitionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UpdateDeviceDefinitionRequest update-device-definition-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDeviceDefinitionAsync update-device-definition-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UpdateDeviceDefinitionRequest update-device-definition-request]
    (-> this (.updateDeviceDefinitionAsync update-device-definition-request))))

(defn create-logger-definition-version-async
  "Creates a version of a logger definition that has already been defined.

  create-logger-definition-version-request - `com.amazonaws.services.greengrass.model.CreateLoggerDefinitionVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLoggerDefinitionVersion operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.CreateLoggerDefinitionVersionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateLoggerDefinitionVersionRequest create-logger-definition-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLoggerDefinitionVersionAsync create-logger-definition-version-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateLoggerDefinitionVersionRequest create-logger-definition-version-request]
    (-> this (.createLoggerDefinitionVersionAsync create-logger-definition-version-request))))

(defn get-logger-definition-version-async
  "Retrieves information about a logger definition version.

  get-logger-definition-version-request - `com.amazonaws.services.greengrass.model.GetLoggerDefinitionVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLoggerDefinitionVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetLoggerDefinitionVersionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetLoggerDefinitionVersionRequest get-logger-definition-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLoggerDefinitionVersionAsync get-logger-definition-version-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetLoggerDefinitionVersionRequest get-logger-definition-version-request]
    (-> this (.getLoggerDefinitionVersionAsync get-logger-definition-version-request))))

(defn get-deployment-status-async
  "Returns the status of a deployment.

  get-deployment-status-request - `com.amazonaws.services.greengrass.model.GetDeploymentStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDeploymentStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetDeploymentStatusResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetDeploymentStatusRequest get-deployment-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDeploymentStatusAsync get-deployment-status-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetDeploymentStatusRequest get-deployment-status-request]
    (-> this (.getDeploymentStatusAsync get-deployment-status-request))))

(defn update-function-definition-async
  "Updates a Lambda function definition.

  update-function-definition-request - `com.amazonaws.services.greengrass.model.UpdateFunctionDefinitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateFunctionDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.UpdateFunctionDefinitionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UpdateFunctionDefinitionRequest update-function-definition-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateFunctionDefinitionAsync update-function-definition-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UpdateFunctionDefinitionRequest update-function-definition-request]
    (-> this (.updateFunctionDefinitionAsync update-function-definition-request))))

(defn update-subscription-definition-async
  "Updates a subscription definition.

  update-subscription-definition-request - `com.amazonaws.services.greengrass.model.UpdateSubscriptionDefinitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSubscriptionDefinition operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.UpdateSubscriptionDefinitionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UpdateSubscriptionDefinitionRequest update-subscription-definition-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSubscriptionDefinitionAsync update-subscription-definition-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UpdateSubscriptionDefinitionRequest update-subscription-definition-request]
    (-> this (.updateSubscriptionDefinitionAsync update-subscription-definition-request))))

(defn get-connector-definition-version-async
  "Retrieves information about a connector definition version, including the connectors that the version contains.
   Connectors are prebuilt modules that interact with local infrastructure, device protocols, AWS, and other cloud
   services.

  get-connector-definition-version-request - `com.amazonaws.services.greengrass.model.GetConnectorDefinitionVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetConnectorDefinitionVersion operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetConnectorDefinitionVersionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetConnectorDefinitionVersionRequest get-connector-definition-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getConnectorDefinitionVersionAsync get-connector-definition-version-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetConnectorDefinitionVersionRequest get-connector-definition-version-request]
    (-> this (.getConnectorDefinitionVersionAsync get-connector-definition-version-request))))

(defn get-core-definition-version-async
  "Retrieves information about a core definition version.

  get-core-definition-version-request - `com.amazonaws.services.greengrass.model.GetCoreDefinitionVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCoreDefinitionVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetCoreDefinitionVersionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetCoreDefinitionVersionRequest get-core-definition-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCoreDefinitionVersionAsync get-core-definition-version-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetCoreDefinitionVersionRequest get-core-definition-version-request]
    (-> this (.getCoreDefinitionVersionAsync get-core-definition-version-request))))

(defn list-connector-definitions-async
  "Retrieves a list of connector definitions.

  list-connector-definitions-request - `com.amazonaws.services.greengrass.model.ListConnectorDefinitionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListConnectorDefinitions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ListConnectorDefinitionsResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListConnectorDefinitionsRequest list-connector-definitions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listConnectorDefinitionsAsync list-connector-definitions-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListConnectorDefinitionsRequest list-connector-definitions-request]
    (-> this (.listConnectorDefinitionsAsync list-connector-definitions-request))))

(defn update-core-definition-async
  "Updates a core definition.

  update-core-definition-request - `com.amazonaws.services.greengrass.model.UpdateCoreDefinitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateCoreDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.UpdateCoreDefinitionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UpdateCoreDefinitionRequest update-core-definition-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateCoreDefinitionAsync update-core-definition-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UpdateCoreDefinitionRequest update-core-definition-request]
    (-> this (.updateCoreDefinitionAsync update-core-definition-request))))

(defn delete-core-definition-async
  "Deletes a core definition.

  delete-core-definition-request - `com.amazonaws.services.greengrass.model.DeleteCoreDefinitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCoreDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.DeleteCoreDefinitionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.DeleteCoreDefinitionRequest delete-core-definition-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCoreDefinitionAsync delete-core-definition-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.DeleteCoreDefinitionRequest delete-core-definition-request]
    (-> this (.deleteCoreDefinitionAsync delete-core-definition-request))))

(defn associate-role-to-group-async
  "Associates a role with a group. Your Greengrass core will use the role to access AWS cloud services. The role's
   permissions should allow Greengrass core Lambda functions to perform actions against the cloud.

  associate-role-to-group-request - `com.amazonaws.services.greengrass.model.AssociateRoleToGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateRoleToGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.AssociateRoleToGroupResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.AssociateRoleToGroupRequest associate-role-to-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateRoleToGroupAsync associate-role-to-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.AssociateRoleToGroupRequest associate-role-to-group-request]
    (-> this (.associateRoleToGroupAsync associate-role-to-group-request))))

(defn reset-deployments-async
  "Resets a group's deployments.

  reset-deployments-request - Information needed to reset deployments. - `com.amazonaws.services.greengrass.model.ResetDeploymentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResetDeployments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ResetDeploymentsResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ResetDeploymentsRequest reset-deployments-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resetDeploymentsAsync reset-deployments-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ResetDeploymentsRequest reset-deployments-request]
    (-> this (.resetDeploymentsAsync reset-deployments-request))))

(defn list-subscription-definitions-async
  "Retrieves a list of subscription definitions.

  list-subscription-definitions-request - `com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSubscriptionDefinitions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionsResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionsRequest list-subscription-definitions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSubscriptionDefinitionsAsync list-subscription-definitions-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionsRequest list-subscription-definitions-request]
    (-> this (.listSubscriptionDefinitionsAsync list-subscription-definitions-request))))

(defn create-subscription-definition-version-async
  "Creates a version of a subscription definition which has already been defined.

  create-subscription-definition-version-request - `com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSubscriptionDefinitionVersion operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionVersionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionVersionRequest create-subscription-definition-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSubscriptionDefinitionVersionAsync create-subscription-definition-version-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionVersionRequest create-subscription-definition-version-request]
    (-> this (.createSubscriptionDefinitionVersionAsync create-subscription-definition-version-request))))

(defn update-group-certificate-configuration-async
  "Updates the Certificate expiry time for a group.

  update-group-certificate-configuration-request - `com.amazonaws.services.greengrass.model.UpdateGroupCertificateConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateGroupCertificateConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.UpdateGroupCertificateConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UpdateGroupCertificateConfigurationRequest update-group-certificate-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateGroupCertificateConfigurationAsync update-group-certificate-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UpdateGroupCertificateConfigurationRequest update-group-certificate-configuration-request]
    (-> this (.updateGroupCertificateConfigurationAsync update-group-certificate-configuration-request))))

(defn list-group-versions-async
  "Lists the versions of a group.

  list-group-versions-request - `com.amazonaws.services.greengrass.model.ListGroupVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGroupVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ListGroupVersionsResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListGroupVersionsRequest list-group-versions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGroupVersionsAsync list-group-versions-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListGroupVersionsRequest list-group-versions-request]
    (-> this (.listGroupVersionsAsync list-group-versions-request))))

(defn create-connector-definition-async
  "Creates a connector definition. You may provide the initial version of the connector definition now or use
   ''CreateConnectorDefinitionVersion'' at a later time.

  create-connector-definition-request - `com.amazonaws.services.greengrass.model.CreateConnectorDefinitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateConnectorDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.CreateConnectorDefinitionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateConnectorDefinitionRequest create-connector-definition-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createConnectorDefinitionAsync create-connector-definition-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateConnectorDefinitionRequest create-connector-definition-request]
    (-> this (.createConnectorDefinitionAsync create-connector-definition-request))))

(defn get-subscription-definition-version-async
  "Retrieves information about a subscription definition version.

  get-subscription-definition-version-request - `com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSubscriptionDefinitionVersion operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionVersionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionVersionRequest get-subscription-definition-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSubscriptionDefinitionVersionAsync get-subscription-definition-version-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionVersionRequest get-subscription-definition-version-request]
    (-> this (.getSubscriptionDefinitionVersionAsync get-subscription-definition-version-request))))

(defn get-logger-definition-async
  "Retrieves information about a logger definition.

  get-logger-definition-request - `com.amazonaws.services.greengrass.model.GetLoggerDefinitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLoggerDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetLoggerDefinitionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetLoggerDefinitionRequest get-logger-definition-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLoggerDefinitionAsync get-logger-definition-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetLoggerDefinitionRequest get-logger-definition-request]
    (-> this (.getLoggerDefinitionAsync get-logger-definition-request))))

(defn delete-resource-definition-async
  "Deletes a resource definition.

  delete-resource-definition-request - `com.amazonaws.services.greengrass.model.DeleteResourceDefinitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteResourceDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.DeleteResourceDefinitionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.DeleteResourceDefinitionRequest delete-resource-definition-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteResourceDefinitionAsync delete-resource-definition-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.DeleteResourceDefinitionRequest delete-resource-definition-request]
    (-> this (.deleteResourceDefinitionAsync delete-resource-definition-request))))

(defn get-device-definition-version-async
  "Retrieves information about a device definition version.

  get-device-definition-version-request - `com.amazonaws.services.greengrass.model.GetDeviceDefinitionVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDeviceDefinitionVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetDeviceDefinitionVersionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetDeviceDefinitionVersionRequest get-device-definition-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDeviceDefinitionVersionAsync get-device-definition-version-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetDeviceDefinitionVersionRequest get-device-definition-version-request]
    (-> this (.getDeviceDefinitionVersionAsync get-device-definition-version-request))))

(defn delete-connector-definition-async
  "Deletes a connector definition.

  delete-connector-definition-request - `com.amazonaws.services.greengrass.model.DeleteConnectorDefinitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteConnectorDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.DeleteConnectorDefinitionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.DeleteConnectorDefinitionRequest delete-connector-definition-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteConnectorDefinitionAsync delete-connector-definition-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.DeleteConnectorDefinitionRequest delete-connector-definition-request]
    (-> this (.deleteConnectorDefinitionAsync delete-connector-definition-request))))

(defn create-group-certificate-authority-async
  "Creates a CA for the group. If a CA already exists, it will rotate the existing CA.

  create-group-certificate-authority-request - `com.amazonaws.services.greengrass.model.CreateGroupCertificateAuthorityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateGroupCertificateAuthority operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.CreateGroupCertificateAuthorityResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateGroupCertificateAuthorityRequest create-group-certificate-authority-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createGroupCertificateAuthorityAsync create-group-certificate-authority-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateGroupCertificateAuthorityRequest create-group-certificate-authority-request]
    (-> this (.createGroupCertificateAuthorityAsync create-group-certificate-authority-request))))

(defn get-resource-definition-version-async
  "Retrieves information about a resource definition version, including which resources are included in the version.

  get-resource-definition-version-request - `com.amazonaws.services.greengrass.model.GetResourceDefinitionVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetResourceDefinitionVersion operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetResourceDefinitionVersionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetResourceDefinitionVersionRequest get-resource-definition-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getResourceDefinitionVersionAsync get-resource-definition-version-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetResourceDefinitionVersionRequest get-resource-definition-version-request]
    (-> this (.getResourceDefinitionVersionAsync get-resource-definition-version-request))))

(defn create-function-definition-async
  "Creates a Lambda function definition which contains a list of Lambda functions and their configurations to be
   used in a group. You can create an initial version of the definition by providing a list of Lambda functions and
   their configurations now, or use ''CreateFunctionDefinitionVersion'' later.

  create-function-definition-request - `com.amazonaws.services.greengrass.model.CreateFunctionDefinitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateFunctionDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.CreateFunctionDefinitionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateFunctionDefinitionRequest create-function-definition-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createFunctionDefinitionAsync create-function-definition-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateFunctionDefinitionRequest create-function-definition-request]
    (-> this (.createFunctionDefinitionAsync create-function-definition-request))))

(defn delete-device-definition-async
  "Deletes a device definition.

  delete-device-definition-request - `com.amazonaws.services.greengrass.model.DeleteDeviceDefinitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDeviceDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.DeleteDeviceDefinitionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.DeleteDeviceDefinitionRequest delete-device-definition-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDeviceDefinitionAsync delete-device-definition-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.DeleteDeviceDefinitionRequest delete-device-definition-request]
    (-> this (.deleteDeviceDefinitionAsync delete-device-definition-request))))

(defn list-resource-definitions-async
  "Retrieves a list of resource definitions.

  list-resource-definitions-request - `com.amazonaws.services.greengrass.model.ListResourceDefinitionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListResourceDefinitions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ListResourceDefinitionsResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListResourceDefinitionsRequest list-resource-definitions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listResourceDefinitionsAsync list-resource-definitions-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListResourceDefinitionsRequest list-resource-definitions-request]
    (-> this (.listResourceDefinitionsAsync list-resource-definitions-request))))

(defn get-group-version-async
  "Retrieves information about a group version.

  get-group-version-request - `com.amazonaws.services.greengrass.model.GetGroupVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetGroupVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetGroupVersionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetGroupVersionRequest get-group-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getGroupVersionAsync get-group-version-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetGroupVersionRequest get-group-version-request]
    (-> this (.getGroupVersionAsync get-group-version-request))))

(defn list-core-definitions-async
  "Retrieves a list of core definitions.

  list-core-definitions-request - `com.amazonaws.services.greengrass.model.ListCoreDefinitionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListCoreDefinitions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ListCoreDefinitionsResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListCoreDefinitionsRequest list-core-definitions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listCoreDefinitionsAsync list-core-definitions-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListCoreDefinitionsRequest list-core-definitions-request]
    (-> this (.listCoreDefinitionsAsync list-core-definitions-request))))

(defn create-resource-definition-async
  "Creates a resource definition which contains a list of resources to be used in a group. You can create an initial
   version of the definition by providing a list of resources now, or use ''CreateResourceDefinitionVersion'' later.

  create-resource-definition-request - `com.amazonaws.services.greengrass.model.CreateResourceDefinitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateResourceDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.CreateResourceDefinitionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateResourceDefinitionRequest create-resource-definition-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createResourceDefinitionAsync create-resource-definition-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateResourceDefinitionRequest create-resource-definition-request]
    (-> this (.createResourceDefinitionAsync create-resource-definition-request))))

(defn list-connector-definition-versions-async
  "Lists the versions of a connector definition, which are containers for connectors. Connectors run on the
   Greengrass core and contain built-in integration with local infrastructure, device protocols, AWS, and other
   cloud services.

  list-connector-definition-versions-request - `com.amazonaws.services.greengrass.model.ListConnectorDefinitionVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListConnectorDefinitionVersions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ListConnectorDefinitionVersionsResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListConnectorDefinitionVersionsRequest list-connector-definition-versions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listConnectorDefinitionVersionsAsync list-connector-definition-versions-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListConnectorDefinitionVersionsRequest list-connector-definition-versions-request]
    (-> this (.listConnectorDefinitionVersionsAsync list-connector-definition-versions-request))))

(defn update-group-async
  "Updates a group.

  update-group-request - `com.amazonaws.services.greengrass.model.UpdateGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.UpdateGroupResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UpdateGroupRequest update-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateGroupAsync update-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UpdateGroupRequest update-group-request]
    (-> this (.updateGroupAsync update-group-request))))

(defn list-logger-definitions-async
  "Retrieves a list of logger definitions.

  list-logger-definitions-request - `com.amazonaws.services.greengrass.model.ListLoggerDefinitionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListLoggerDefinitions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ListLoggerDefinitionsResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListLoggerDefinitionsRequest list-logger-definitions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listLoggerDefinitionsAsync list-logger-definitions-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListLoggerDefinitionsRequest list-logger-definitions-request]
    (-> this (.listLoggerDefinitionsAsync list-logger-definitions-request))))

(defn get-core-definition-async
  "Retrieves information about a core definition version.

  get-core-definition-request - `com.amazonaws.services.greengrass.model.GetCoreDefinitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCoreDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetCoreDefinitionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetCoreDefinitionRequest get-core-definition-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCoreDefinitionAsync get-core-definition-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetCoreDefinitionRequest get-core-definition-request]
    (-> this (.getCoreDefinitionAsync get-core-definition-request))))

(defn get-service-role-for-account-async
  "Retrieves the service role that is attached to your account.

  get-service-role-for-account-request - `com.amazonaws.services.greengrass.model.GetServiceRoleForAccountRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetServiceRoleForAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetServiceRoleForAccountResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetServiceRoleForAccountRequest get-service-role-for-account-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getServiceRoleForAccountAsync get-service-role-for-account-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetServiceRoleForAccountRequest get-service-role-for-account-request]
    (-> this (.getServiceRoleForAccountAsync get-service-role-for-account-request))))

(defn get-group-certificate-configuration-async
  "Retrieves the current configuration for the CA used by the group.

  get-group-certificate-configuration-request - `com.amazonaws.services.greengrass.model.GetGroupCertificateConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetGroupCertificateConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetGroupCertificateConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetGroupCertificateConfigurationRequest get-group-certificate-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getGroupCertificateConfigurationAsync get-group-certificate-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetGroupCertificateConfigurationRequest get-group-certificate-configuration-request]
    (-> this (.getGroupCertificateConfigurationAsync get-group-certificate-configuration-request))))

(defn get-group-certificate-authority-async
  "Retreives the CA associated with a group. Returns the public key of the CA.

  get-group-certificate-authority-request - `com.amazonaws.services.greengrass.model.GetGroupCertificateAuthorityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetGroupCertificateAuthority operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetGroupCertificateAuthorityResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetGroupCertificateAuthorityRequest get-group-certificate-authority-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getGroupCertificateAuthorityAsync get-group-certificate-authority-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetGroupCertificateAuthorityRequest get-group-certificate-authority-request]
    (-> this (.getGroupCertificateAuthorityAsync get-group-certificate-authority-request))))

(defn create-function-definition-version-async
  "Creates a version of a Lambda function definition that has already been defined.

  create-function-definition-version-request - Information needed to create a function definition version. - `com.amazonaws.services.greengrass.model.CreateFunctionDefinitionVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateFunctionDefinitionVersion operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.CreateFunctionDefinitionVersionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateFunctionDefinitionVersionRequest create-function-definition-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createFunctionDefinitionVersionAsync create-function-definition-version-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateFunctionDefinitionVersionRequest create-function-definition-version-request]
    (-> this (.createFunctionDefinitionVersionAsync create-function-definition-version-request))))

(defn list-core-definition-versions-async
  "Lists the versions of a core definition.

  list-core-definition-versions-request - `com.amazonaws.services.greengrass.model.ListCoreDefinitionVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListCoreDefinitionVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ListCoreDefinitionVersionsResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListCoreDefinitionVersionsRequest list-core-definition-versions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listCoreDefinitionVersionsAsync list-core-definition-versions-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListCoreDefinitionVersionsRequest list-core-definition-versions-request]
    (-> this (.listCoreDefinitionVersionsAsync list-core-definition-versions-request))))

(defn update-connectivity-info-async
  "Updates the connectivity information for the core. Any devices that belong to the group which has this core will
   receive this information in order to find the location of the core and connect to it.

  update-connectivity-info-request - Connectivity information. - `com.amazonaws.services.greengrass.model.UpdateConnectivityInfoRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateConnectivityInfo operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.UpdateConnectivityInfoResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UpdateConnectivityInfoRequest update-connectivity-info-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateConnectivityInfoAsync update-connectivity-info-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UpdateConnectivityInfoRequest update-connectivity-info-request]
    (-> this (.updateConnectivityInfoAsync update-connectivity-info-request))))

(defn list-group-certificate-authorities-async
  "Retrieves the current CAs for a group.

  list-group-certificate-authorities-request - `com.amazonaws.services.greengrass.model.ListGroupCertificateAuthoritiesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGroupCertificateAuthorities operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ListGroupCertificateAuthoritiesResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListGroupCertificateAuthoritiesRequest list-group-certificate-authorities-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGroupCertificateAuthoritiesAsync list-group-certificate-authorities-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListGroupCertificateAuthoritiesRequest list-group-certificate-authorities-request]
    (-> this (.listGroupCertificateAuthoritiesAsync list-group-certificate-authorities-request))))

(defn create-connector-definition-version-async
  "Creates a version of a connector definition which has already been defined.

  create-connector-definition-version-request - `com.amazonaws.services.greengrass.model.CreateConnectorDefinitionVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateConnectorDefinitionVersion operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.CreateConnectorDefinitionVersionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateConnectorDefinitionVersionRequest create-connector-definition-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createConnectorDefinitionVersionAsync create-connector-definition-version-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateConnectorDefinitionVersionRequest create-connector-definition-version-request]
    (-> this (.createConnectorDefinitionVersionAsync create-connector-definition-version-request))))

(defn get-group-async
  "Retrieves information about a group.

  get-group-request - `com.amazonaws.services.greengrass.model.GetGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetGroupResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetGroupRequest get-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getGroupAsync get-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetGroupRequest get-group-request]
    (-> this (.getGroupAsync get-group-request))))

(defn list-tags-for-resource-async
  "Retrieves a list of resource tags for a resource arn.

  list-tags-for-resource-request - `com.amazonaws.services.greengrass.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn get-bulk-deployment-status-async
  "Returns the status of a bulk deployment.

  get-bulk-deployment-status-request - `com.amazonaws.services.greengrass.model.GetBulkDeploymentStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBulkDeploymentStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetBulkDeploymentStatusResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetBulkDeploymentStatusRequest get-bulk-deployment-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBulkDeploymentStatusAsync get-bulk-deployment-status-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetBulkDeploymentStatusRequest get-bulk-deployment-status-request]
    (-> this (.getBulkDeploymentStatusAsync get-bulk-deployment-status-request))))

(defn get-subscription-definition-async
  "Retrieves information about a subscription definition.

  get-subscription-definition-request - `com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSubscriptionDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionRequest get-subscription-definition-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSubscriptionDefinitionAsync get-subscription-definition-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionRequest get-subscription-definition-request]
    (-> this (.getSubscriptionDefinitionAsync get-subscription-definition-request))))

(defn get-function-definition-async
  "Retrieves information about a Lambda function definition, including its creation time and latest version.

  get-function-definition-request - `com.amazonaws.services.greengrass.model.GetFunctionDefinitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFunctionDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetFunctionDefinitionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetFunctionDefinitionRequest get-function-definition-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFunctionDefinitionAsync get-function-definition-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetFunctionDefinitionRequest get-function-definition-request]
    (-> this (.getFunctionDefinitionAsync get-function-definition-request))))

(defn start-bulk-deployment-async
  "Deploys multiple groups in one operation. This action starts the bulk deployment of a specified set of group
   versions. Each group version deployment will be triggered with an adaptive rate that has a fixed upper limit. We
   recommend that you include an ''X-Amzn-Client-Token'' token in every ''StartBulkDeployment'' request. These
   requests are idempotent with respect to the token and the request parameters.

  start-bulk-deployment-request - `com.amazonaws.services.greengrass.model.StartBulkDeploymentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartBulkDeployment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.StartBulkDeploymentResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.StartBulkDeploymentRequest start-bulk-deployment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startBulkDeploymentAsync start-bulk-deployment-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.StartBulkDeploymentRequest start-bulk-deployment-request]
    (-> this (.startBulkDeploymentAsync start-bulk-deployment-request))))

(defn get-associated-role-async
  "Retrieves the role associated with a particular group.

  get-associated-role-request - `com.amazonaws.services.greengrass.model.GetAssociatedRoleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAssociatedRole operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetAssociatedRoleResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetAssociatedRoleRequest get-associated-role-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAssociatedRoleAsync get-associated-role-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetAssociatedRoleRequest get-associated-role-request]
    (-> this (.getAssociatedRoleAsync get-associated-role-request))))

(defn create-software-update-job-async
  "Creates a software update for a core or group of cores (specified as an IoT thing group.) Use this to update the
   OTA Agent as well as the Greengrass core software. It makes use of the IoT Jobs feature which provides additional
   commands to manage a Greengrass core software update job.

  create-software-update-job-request - `com.amazonaws.services.greengrass.model.CreateSoftwareUpdateJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSoftwareUpdateJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.CreateSoftwareUpdateJobResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateSoftwareUpdateJobRequest create-software-update-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSoftwareUpdateJobAsync create-software-update-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateSoftwareUpdateJobRequest create-software-update-job-request]
    (-> this (.createSoftwareUpdateJobAsync create-software-update-job-request))))

(defn create-device-definition-async
  "Creates a device definition. You may provide the initial version of the device definition now or use
   ''CreateDeviceDefinitionVersion'' at a later time.

  create-device-definition-request - `com.amazonaws.services.greengrass.model.CreateDeviceDefinitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDeviceDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.CreateDeviceDefinitionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateDeviceDefinitionRequest create-device-definition-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDeviceDefinitionAsync create-device-definition-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateDeviceDefinitionRequest create-device-definition-request]
    (-> this (.createDeviceDefinitionAsync create-device-definition-request))))

(defn create-device-definition-version-async
  "Creates a version of a device definition that has already been defined.

  create-device-definition-version-request - `com.amazonaws.services.greengrass.model.CreateDeviceDefinitionVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDeviceDefinitionVersion operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.CreateDeviceDefinitionVersionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateDeviceDefinitionVersionRequest create-device-definition-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDeviceDefinitionVersionAsync create-device-definition-version-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateDeviceDefinitionVersionRequest create-device-definition-version-request]
    (-> this (.createDeviceDefinitionVersionAsync create-device-definition-version-request))))

(defn get-function-definition-version-async
  "Retrieves information about a Lambda function definition version, including which Lambda functions are included
   in the version and their configurations.

  get-function-definition-version-request - `com.amazonaws.services.greengrass.model.GetFunctionDefinitionVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFunctionDefinitionVersion operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetFunctionDefinitionVersionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetFunctionDefinitionVersionRequest get-function-definition-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFunctionDefinitionVersionAsync get-function-definition-version-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetFunctionDefinitionVersionRequest get-function-definition-version-request]
    (-> this (.getFunctionDefinitionVersionAsync get-function-definition-version-request))))

(defn associate-service-role-to-account-async
  "Associates a role with your account. AWS IoT Greengrass will use the role to access your Lambda functions and AWS
   IoT resources. This is necessary for deployments to succeed. The role must have at least minimum permissions in
   the policy ''AWSGreengrassResourceAccessRolePolicy''.

  associate-service-role-to-account-request - `com.amazonaws.services.greengrass.model.AssociateServiceRoleToAccountRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateServiceRoleToAccount operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.AssociateServiceRoleToAccountResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.AssociateServiceRoleToAccountRequest associate-service-role-to-account-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateServiceRoleToAccountAsync associate-service-role-to-account-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.AssociateServiceRoleToAccountRequest associate-service-role-to-account-request]
    (-> this (.associateServiceRoleToAccountAsync associate-service-role-to-account-request))))

(defn create-resource-definition-version-async
  "Creates a version of a resource definition that has already been defined.

  create-resource-definition-version-request - `com.amazonaws.services.greengrass.model.CreateResourceDefinitionVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateResourceDefinitionVersion operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.CreateResourceDefinitionVersionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateResourceDefinitionVersionRequest create-resource-definition-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createResourceDefinitionVersionAsync create-resource-definition-version-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateResourceDefinitionVersionRequest create-resource-definition-version-request]
    (-> this (.createResourceDefinitionVersionAsync create-resource-definition-version-request))))

(defn get-connector-definition-async
  "Retrieves information about a connector definition.

  get-connector-definition-request - `com.amazonaws.services.greengrass.model.GetConnectorDefinitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetConnectorDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetConnectorDefinitionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetConnectorDefinitionRequest get-connector-definition-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getConnectorDefinitionAsync get-connector-definition-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetConnectorDefinitionRequest get-connector-definition-request]
    (-> this (.getConnectorDefinitionAsync get-connector-definition-request))))

(defn update-logger-definition-async
  "Updates a logger definition.

  update-logger-definition-request - `com.amazonaws.services.greengrass.model.UpdateLoggerDefinitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateLoggerDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.UpdateLoggerDefinitionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UpdateLoggerDefinitionRequest update-logger-definition-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateLoggerDefinitionAsync update-logger-definition-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UpdateLoggerDefinitionRequest update-logger-definition-request]
    (-> this (.updateLoggerDefinitionAsync update-logger-definition-request))))

(defn list-function-definitions-async
  "Retrieves a list of Lambda function definitions.

  list-function-definitions-request - `com.amazonaws.services.greengrass.model.ListFunctionDefinitionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListFunctionDefinitions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ListFunctionDefinitionsResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListFunctionDefinitionsRequest list-function-definitions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listFunctionDefinitionsAsync list-function-definitions-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListFunctionDefinitionsRequest list-function-definitions-request]
    (-> this (.listFunctionDefinitionsAsync list-function-definitions-request))))

(defn create-deployment-async
  "Creates a deployment. ''CreateDeployment'' requests are idempotent with respect to the ''X-Amzn-Client-Token''
   token and the request parameters.

  create-deployment-request - `com.amazonaws.services.greengrass.model.CreateDeploymentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDeployment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.CreateDeploymentResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateDeploymentRequest create-deployment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDeploymentAsync create-deployment-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateDeploymentRequest create-deployment-request]
    (-> this (.createDeploymentAsync create-deployment-request))))

(defn update-resource-definition-async
  "Updates a resource definition.

  update-resource-definition-request - `com.amazonaws.services.greengrass.model.UpdateResourceDefinitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateResourceDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.UpdateResourceDefinitionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UpdateResourceDefinitionRequest update-resource-definition-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateResourceDefinitionAsync update-resource-definition-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.UpdateResourceDefinitionRequest update-resource-definition-request]
    (-> this (.updateResourceDefinitionAsync update-resource-definition-request))))

(defn create-core-definition-version-async
  "Creates a version of a core definition that has already been defined. Greengrass groups must each contain exactly
   one Greengrass core.

  create-core-definition-version-request - `com.amazonaws.services.greengrass.model.CreateCoreDefinitionVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCoreDefinitionVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.CreateCoreDefinitionVersionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateCoreDefinitionVersionRequest create-core-definition-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCoreDefinitionVersionAsync create-core-definition-version-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateCoreDefinitionVersionRequest create-core-definition-version-request]
    (-> this (.createCoreDefinitionVersionAsync create-core-definition-version-request))))

(defn list-bulk-deployment-detailed-reports-async
  "Gets a paginated list of the deployments that have been started in a bulk deployment operation, and their current
   deployment status.

  list-bulk-deployment-detailed-reports-request - `com.amazonaws.services.greengrass.model.ListBulkDeploymentDetailedReportsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBulkDeploymentDetailedReports operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ListBulkDeploymentDetailedReportsResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListBulkDeploymentDetailedReportsRequest list-bulk-deployment-detailed-reports-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBulkDeploymentDetailedReportsAsync list-bulk-deployment-detailed-reports-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListBulkDeploymentDetailedReportsRequest list-bulk-deployment-detailed-reports-request]
    (-> this (.listBulkDeploymentDetailedReportsAsync list-bulk-deployment-detailed-reports-request))))

(defn get-resource-definition-async
  "Retrieves information about a resource definition, including its creation time and latest version.

  get-resource-definition-request - `com.amazonaws.services.greengrass.model.GetResourceDefinitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetResourceDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.GetResourceDefinitionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetResourceDefinitionRequest get-resource-definition-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getResourceDefinitionAsync get-resource-definition-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.GetResourceDefinitionRequest get-resource-definition-request]
    (-> this (.getResourceDefinitionAsync get-resource-definition-request))))

(defn list-groups-async
  "Retrieves a list of groups.

  list-groups-request - `com.amazonaws.services.greengrass.model.ListGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ListGroupsResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListGroupsRequest list-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGroupsAsync list-groups-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListGroupsRequest list-groups-request]
    (-> this (.listGroupsAsync list-groups-request))))

(defn list-deployments-async
  "Returns a history of deployments for the group.

  list-deployments-request - `com.amazonaws.services.greengrass.model.ListDeploymentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDeployments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ListDeploymentsResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListDeploymentsRequest list-deployments-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDeploymentsAsync list-deployments-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListDeploymentsRequest list-deployments-request]
    (-> this (.listDeploymentsAsync list-deployments-request))))

(defn create-subscription-definition-async
  "Creates a subscription definition. You may provide the initial version of the subscription definition now or use
   ''CreateSubscriptionDefinitionVersion'' at a later time.

  create-subscription-definition-request - `com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSubscriptionDefinition operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionRequest create-subscription-definition-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSubscriptionDefinitionAsync create-subscription-definition-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionRequest create-subscription-definition-request]
    (-> this (.createSubscriptionDefinitionAsync create-subscription-definition-request))))

(defn delete-group-async
  "Deletes a group.

  delete-group-request - `com.amazonaws.services.greengrass.model.DeleteGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.DeleteGroupResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.DeleteGroupRequest delete-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteGroupAsync delete-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.DeleteGroupRequest delete-group-request]
    (-> this (.deleteGroupAsync delete-group-request))))

(defn stop-bulk-deployment-async
  "Stops the execution of a bulk deployment. This action returns a status of ''Stopping'' until the deployment is
   stopped. You cannot start a new bulk deployment while a previous deployment is in the ''Stopping'' state. This
   action doesn't rollback completed deployments or cancel pending deployments.

  stop-bulk-deployment-request - `com.amazonaws.services.greengrass.model.StopBulkDeploymentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopBulkDeployment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.StopBulkDeploymentResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.StopBulkDeploymentRequest stop-bulk-deployment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopBulkDeploymentAsync stop-bulk-deployment-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.StopBulkDeploymentRequest stop-bulk-deployment-request]
    (-> this (.stopBulkDeploymentAsync stop-bulk-deployment-request))))

(defn tag-resource-async
  "Add resource tags to a Greengrass Resource. Valid resources are Group, Connector, Core, Device, Function, Logger,
   Subscription, and Resource Defintions, and also BulkDeploymentIds.

  tag-resource-request - A map of the key-value pairs for the resource tag. - `com.amazonaws.services.greengrass.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn list-device-definitions-async
  "Retrieves a list of device definitions.

  list-device-definitions-request - `com.amazonaws.services.greengrass.model.ListDeviceDefinitionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDeviceDefinitions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ListDeviceDefinitionsResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListDeviceDefinitionsRequest list-device-definitions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDeviceDefinitionsAsync list-device-definitions-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListDeviceDefinitionsRequest list-device-definitions-request]
    (-> this (.listDeviceDefinitionsAsync list-device-definitions-request))))

(defn list-resource-definition-versions-async
  "Lists the versions of a resource definition.

  list-resource-definition-versions-request - `com.amazonaws.services.greengrass.model.ListResourceDefinitionVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListResourceDefinitionVersions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.ListResourceDefinitionVersionsResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListResourceDefinitionVersionsRequest list-resource-definition-versions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listResourceDefinitionVersionsAsync list-resource-definition-versions-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.ListResourceDefinitionVersionsRequest list-resource-definition-versions-request]
    (-> this (.listResourceDefinitionVersionsAsync list-resource-definition-versions-request))))

(defn create-group-version-async
  "Creates a version of a group which has already been defined.

  create-group-version-request - `com.amazonaws.services.greengrass.model.CreateGroupVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateGroupVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.CreateGroupVersionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateGroupVersionRequest create-group-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createGroupVersionAsync create-group-version-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateGroupVersionRequest create-group-version-request]
    (-> this (.createGroupVersionAsync create-group-version-request))))

(defn delete-subscription-definition-async
  "Deletes a subscription definition.

  delete-subscription-definition-request - `com.amazonaws.services.greengrass.model.DeleteSubscriptionDefinitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSubscriptionDefinition operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.DeleteSubscriptionDefinitionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.DeleteSubscriptionDefinitionRequest delete-subscription-definition-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSubscriptionDefinitionAsync delete-subscription-definition-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.DeleteSubscriptionDefinitionRequest delete-subscription-definition-request]
    (-> this (.deleteSubscriptionDefinitionAsync delete-subscription-definition-request))))

(defn create-core-definition-async
  "Creates a core definition. You may provide the initial version of the core definition now or use
   ''CreateCoreDefinitionVersion'' at a later time. Greengrass groups must each contain exactly one Greengrass core.

  create-core-definition-request - Information needed to create a core definition. - `com.amazonaws.services.greengrass.model.CreateCoreDefinitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCoreDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.CreateCoreDefinitionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateCoreDefinitionRequest create-core-definition-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCoreDefinitionAsync create-core-definition-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.CreateCoreDefinitionRequest create-core-definition-request]
    (-> this (.createCoreDefinitionAsync create-core-definition-request))))

(defn delete-logger-definition-async
  "Deletes a logger definition.

  delete-logger-definition-request - `com.amazonaws.services.greengrass.model.DeleteLoggerDefinitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLoggerDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.greengrass.model.DeleteLoggerDefinitionResult>`"
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.DeleteLoggerDefinitionRequest delete-logger-definition-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLoggerDefinitionAsync delete-logger-definition-request async-handler)))
  (^java.util.concurrent.Future [^AWSGreengrassAsync this ^com.amazonaws.services.greengrass.model.DeleteLoggerDefinitionRequest delete-logger-definition-request]
    (-> this (.deleteLoggerDefinitionAsync delete-logger-definition-request))))

