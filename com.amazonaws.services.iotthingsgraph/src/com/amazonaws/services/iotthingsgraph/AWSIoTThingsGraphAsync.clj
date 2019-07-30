(ns com.amazonaws.services.iotthingsgraph.AWSIoTThingsGraphAsync
  "Interface for accessing AWS IoT Things Graph asynchronously. Each asynchronous method will return a Java Future
  object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSIoTThingsGraphAsync instead.


  AWS IoT Things Graph

  AWS IoT Things Graph provides an integrated set of tools that enable developers to connect devices and services that
  use different standards, such as units of measure and communication protocols. AWS IoT Things Graph makes it possible
  to build IoT applications with little to no code by connecting devices and services and defining how they interact at
  an abstract level.


  For more information about how AWS IoT Things Graph works, see the User Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.iotthingsgraph AWSIoTThingsGraphAsync]))

(defn get-system-template-async
  "Gets a system.

  get-system-template-request - `com.amazonaws.services.iotthingsgraph.model.GetSystemTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSystemTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.GetSystemTemplateResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.GetSystemTemplateRequest get-system-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSystemTemplateAsync get-system-template-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.GetSystemTemplateRequest get-system-template-request]
    (-> this (.getSystemTemplateAsync get-system-template-request))))

(defn untag-resource-async
  "Removes a tag from the specified resource.

  untag-resource-request - `com.amazonaws.services.iotthingsgraph.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn update-system-template-async
  "Updates the specified system. You don't need to run this action after updating a workflow. Any deployment that
   uses the system will see the changes in the system when it is redeployed.

  update-system-template-request - `com.amazonaws.services.iotthingsgraph.model.UpdateSystemTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSystemTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.UpdateSystemTemplateResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.UpdateSystemTemplateRequest update-system-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSystemTemplateAsync update-system-template-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.UpdateSystemTemplateRequest update-system-template-request]
    (-> this (.updateSystemTemplateAsync update-system-template-request))))

(defn delete-namespace-async
  "Deletes the specified namespace. This action deletes all of the entities in the namespace. Delete the systems and
   flows that use entities in the namespace before performing this action.

  delete-namespace-request - `com.amazonaws.services.iotthingsgraph.model.DeleteNamespaceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteNamespace operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.DeleteNamespaceResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.DeleteNamespaceRequest delete-namespace-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteNamespaceAsync delete-namespace-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.DeleteNamespaceRequest delete-namespace-request]
    (-> this (.deleteNamespaceAsync delete-namespace-request))))

(defn search-things-async
  "Searches for things associated with the specified entity. You can search by both device and device model.


   For example, if two different devices, camera1 and camera2, implement the camera device model, the user can
   associate thing1 to camera1 and thing2 to camera2. SearchThings(camera2) will return only thing2,
   but SearchThings(camera) will return both thing1 and thing2.


   This action searches for exact matches and doesn't perform partial text matching.

  search-things-request - `com.amazonaws.services.iotthingsgraph.model.SearchThingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchThings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.SearchThingsResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.SearchThingsRequest search-things-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchThingsAsync search-things-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.SearchThingsRequest search-things-request]
    (-> this (.searchThingsAsync search-things-request))))

(defn deprecate-system-template-async
  "Deprecates the specified system.

  deprecate-system-template-request - `com.amazonaws.services.iotthingsgraph.model.DeprecateSystemTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeprecateSystemTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.DeprecateSystemTemplateResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.DeprecateSystemTemplateRequest deprecate-system-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deprecateSystemTemplateAsync deprecate-system-template-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.DeprecateSystemTemplateRequest deprecate-system-template-request]
    (-> this (.deprecateSystemTemplateAsync deprecate-system-template-request))))

(defn undeploy-system-instance-async
  "Removes a system instance from its target (Cloud or Greengrass).

  undeploy-system-instance-request - `com.amazonaws.services.iotthingsgraph.model.UndeploySystemInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UndeploySystemInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.UndeploySystemInstanceResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.UndeploySystemInstanceRequest undeploy-system-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.undeploySystemInstanceAsync undeploy-system-instance-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.UndeploySystemInstanceRequest undeploy-system-instance-request]
    (-> this (.undeploySystemInstanceAsync undeploy-system-instance-request))))

(defn search-system-templates-async
  "Searches for summary information about systems in the user's account. You can filter by the ID of a workflow to
   return only systems that use the specified workflow.

  search-system-templates-request - `com.amazonaws.services.iotthingsgraph.model.SearchSystemTemplatesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchSystemTemplates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.SearchSystemTemplatesResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.SearchSystemTemplatesRequest search-system-templates-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchSystemTemplatesAsync search-system-templates-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.SearchSystemTemplatesRequest search-system-templates-request]
    (-> this (.searchSystemTemplatesAsync search-system-templates-request))))

(defn delete-system-template-async
  "Deletes a system. New deployments can't contain the system after its deletion. Existing deployments that contain
   the system will continue to work because they use a snapshot of the system that is taken when it is deployed.

  delete-system-template-request - `com.amazonaws.services.iotthingsgraph.model.DeleteSystemTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSystemTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.DeleteSystemTemplateResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.DeleteSystemTemplateRequest delete-system-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSystemTemplateAsync delete-system-template-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.DeleteSystemTemplateRequest delete-system-template-request]
    (-> this (.deleteSystemTemplateAsync delete-system-template-request))))

(defn list-flow-execution-messages-async
  "Returns a list of objects that contain information about events in a flow execution.

  list-flow-execution-messages-request - `com.amazonaws.services.iotthingsgraph.model.ListFlowExecutionMessagesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListFlowExecutionMessages operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.ListFlowExecutionMessagesResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.ListFlowExecutionMessagesRequest list-flow-execution-messages-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listFlowExecutionMessagesAsync list-flow-execution-messages-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.ListFlowExecutionMessagesRequest list-flow-execution-messages-request]
    (-> this (.listFlowExecutionMessagesAsync list-flow-execution-messages-request))))

(defn get-flow-template-async
  "Gets the latest version of the DefinitionDocument and FlowTemplateSummary for the
   specified workflow.

  get-flow-template-request - `com.amazonaws.services.iotthingsgraph.model.GetFlowTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFlowTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.GetFlowTemplateResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.GetFlowTemplateRequest get-flow-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFlowTemplateAsync get-flow-template-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.GetFlowTemplateRequest get-flow-template-request]
    (-> this (.getFlowTemplateAsync get-flow-template-request))))

(defn deprecate-flow-template-async
  "Deprecates the specified workflow. This action marks the workflow for deletion. Deprecated flows can't be
   deployed, but existing deployments will continue to run.

  deprecate-flow-template-request - `com.amazonaws.services.iotthingsgraph.model.DeprecateFlowTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeprecateFlowTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.DeprecateFlowTemplateResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.DeprecateFlowTemplateRequest deprecate-flow-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deprecateFlowTemplateAsync deprecate-flow-template-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.DeprecateFlowTemplateRequest deprecate-flow-template-request]
    (-> this (.deprecateFlowTemplateAsync deprecate-flow-template-request))))

(defn get-namespace-deletion-status-async
  "Gets the status of a namespace deletion task.

  get-namespace-deletion-status-request - `com.amazonaws.services.iotthingsgraph.model.GetNamespaceDeletionStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetNamespaceDeletionStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.GetNamespaceDeletionStatusResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.GetNamespaceDeletionStatusRequest get-namespace-deletion-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getNamespaceDeletionStatusAsync get-namespace-deletion-status-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.GetNamespaceDeletionStatusRequest get-namespace-deletion-status-request]
    (-> this (.getNamespaceDeletionStatusAsync get-namespace-deletion-status-request))))

(defn search-flow-templates-async
  "Searches for summary information about workflows.

  search-flow-templates-request - `com.amazonaws.services.iotthingsgraph.model.SearchFlowTemplatesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchFlowTemplates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.SearchFlowTemplatesResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.SearchFlowTemplatesRequest search-flow-templates-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchFlowTemplatesAsync search-flow-templates-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.SearchFlowTemplatesRequest search-flow-templates-request]
    (-> this (.searchFlowTemplatesAsync search-flow-templates-request))))

(defn delete-flow-template-async
  "Deletes a workflow. Any new system or deployment that contains this workflow will fail to update or deploy.
   Existing deployments that contain the workflow will continue to run (since they use a snapshot of the workflow
   taken at the time of deployment).

  delete-flow-template-request - `com.amazonaws.services.iotthingsgraph.model.DeleteFlowTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFlowTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.DeleteFlowTemplateResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.DeleteFlowTemplateRequest delete-flow-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFlowTemplateAsync delete-flow-template-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.DeleteFlowTemplateRequest delete-flow-template-request]
    (-> this (.deleteFlowTemplateAsync delete-flow-template-request))))

(defn associate-entity-to-thing-async
  "Associates a device with a concrete thing that is in the user's registry.


   A thing can be associated with only one device at a time. If you associate a thing with a new device id, its
   previous association will be removed.

  associate-entity-to-thing-request - `com.amazonaws.services.iotthingsgraph.model.AssociateEntityToThingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateEntityToThing operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.AssociateEntityToThingResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.AssociateEntityToThingRequest associate-entity-to-thing-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateEntityToThingAsync associate-entity-to-thing-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.AssociateEntityToThingRequest associate-entity-to-thing-request]
    (-> this (.associateEntityToThingAsync associate-entity-to-thing-request))))

(defn get-system-instance-async
  "Gets a system instance.

  get-system-instance-request - `com.amazonaws.services.iotthingsgraph.model.GetSystemInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSystemInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.GetSystemInstanceResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.GetSystemInstanceRequest get-system-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSystemInstanceAsync get-system-instance-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.GetSystemInstanceRequest get-system-instance-request]
    (-> this (.getSystemInstanceAsync get-system-instance-request))))

(defn upload-entity-definitions-async
  "Asynchronously uploads one or more entity definitions to the user's namespace. The document
   parameter is required if syncWithPublicNamespace and deleteExistingEntites are false.
   If the syncWithPublicNamespace parameter is set to true, the user's namespace will
   synchronize with the latest version of the public namespace. If deprecateExistingEntities is set to
   true, all entities in the latest version will be deleted before the new DefinitionDocument is
   uploaded.


   When a user uploads entity definitions for the first time, the service creates a new namespace for the user. The
   new namespace tracks the public namespace. Currently users can have only one namespace. The namespace version
   increments whenever a user uploads entity definitions that are backwards-incompatible and whenever a user sets
   the syncWithPublicNamespace parameter or the deprecateExistingEntities parameter to
   true.


   The IDs for all of the entities should be in URN format. Each entity must be in the user's namespace. Users can't
   create entities in the public namespace, but entity definitions can refer to entities in the public namespace.


   Valid entities are Device, DeviceModel, Service, Capability,
   State, Action, Event, Property, Mapping,
   Enum.

  upload-entity-definitions-request - `com.amazonaws.services.iotthingsgraph.model.UploadEntityDefinitionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UploadEntityDefinitions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.UploadEntityDefinitionsResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.UploadEntityDefinitionsRequest upload-entity-definitions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.uploadEntityDefinitionsAsync upload-entity-definitions-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.UploadEntityDefinitionsRequest upload-entity-definitions-request]
    (-> this (.uploadEntityDefinitionsAsync upload-entity-definitions-request))))

(defn get-system-template-revisions-async
  "Gets revisions made to the specified system template. Only the previous 100 revisions are stored. If the system
   has been deprecated, this action will return the revisions that occurred before its deprecation. This action
   won't work with systems that have been deleted.

  get-system-template-revisions-request - `com.amazonaws.services.iotthingsgraph.model.GetSystemTemplateRevisionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSystemTemplateRevisions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.GetSystemTemplateRevisionsResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.GetSystemTemplateRevisionsRequest get-system-template-revisions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSystemTemplateRevisionsAsync get-system-template-revisions-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.GetSystemTemplateRevisionsRequest get-system-template-revisions-request]
    (-> this (.getSystemTemplateRevisionsAsync get-system-template-revisions-request))))

(defn search-entities-async
  "Searches for entities of the specified type. You can search for entities in your namespace and the public
   namespace that you're tracking.

  search-entities-request - `com.amazonaws.services.iotthingsgraph.model.SearchEntitiesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchEntities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.SearchEntitiesResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.SearchEntitiesRequest search-entities-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchEntitiesAsync search-entities-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.SearchEntitiesRequest search-entities-request]
    (-> this (.searchEntitiesAsync search-entities-request))))

(defn create-system-instance-async
  "Creates a system instance.


   This action validates the system instance, prepares the deployment-related resources. For Greengrass deployments,
   it updates the Greengrass group that is specified by the greengrassGroupName parameter. It also adds
   a file to the S3 bucket specified by the s3BucketName parameter. You need to call
   DeploySystemInstance after running this action.


   For Greengrass deployments, since this action modifies and adds resources to a Greengrass group and an S3 bucket
   on the caller's behalf, the calling identity must have write permissions to both the specified Greengrass group
   and S3 bucket. Otherwise, the call will fail with an authorization error.


   For cloud deployments, this action requires a flowActionsRoleArn value. This is an IAM role that has
   permissions to access AWS services, such as AWS Lambda and AWS IoT, that the flow uses when it executes.


   If the definition document doesn't specify a version of the user's namespace, the latest version will be used by
   default.

  create-system-instance-request - `com.amazonaws.services.iotthingsgraph.model.CreateSystemInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSystemInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.CreateSystemInstanceResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.CreateSystemInstanceRequest create-system-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSystemInstanceAsync create-system-instance-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.CreateSystemInstanceRequest create-system-instance-request]
    (-> this (.createSystemInstanceAsync create-system-instance-request))))

(defn get-flow-template-revisions-async
  "Gets revisions of the specified workflow. Only the last 100 revisions are stored. If the workflow has been
   deprecated, this action will return revisions that occurred before the deprecation. This action won't work for
   workflows that have been deleted.

  get-flow-template-revisions-request - `com.amazonaws.services.iotthingsgraph.model.GetFlowTemplateRevisionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFlowTemplateRevisions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.GetFlowTemplateRevisionsResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.GetFlowTemplateRevisionsRequest get-flow-template-revisions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFlowTemplateRevisionsAsync get-flow-template-revisions-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.GetFlowTemplateRevisionsRequest get-flow-template-revisions-request]
    (-> this (.getFlowTemplateRevisionsAsync get-flow-template-revisions-request))))

(defn delete-system-instance-async
  "Deletes a system instance. Only system instances that have never been deployed, or that have been undeployed can
   be deleted.


   Users can create a new system instance that has the same ID as a deleted system instance.

  delete-system-instance-request - `com.amazonaws.services.iotthingsgraph.model.DeleteSystemInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSystemInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.DeleteSystemInstanceResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.DeleteSystemInstanceRequest delete-system-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSystemInstanceAsync delete-system-instance-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.DeleteSystemInstanceRequest delete-system-instance-request]
    (-> this (.deleteSystemInstanceAsync delete-system-instance-request))))

(defn describe-namespace-async
  "Gets the latest version of the user's namespace and the public version that it is tracking.

  describe-namespace-request - `com.amazonaws.services.iotthingsgraph.model.DescribeNamespaceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeNamespace operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.DescribeNamespaceResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.DescribeNamespaceRequest describe-namespace-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeNamespaceAsync describe-namespace-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.DescribeNamespaceRequest describe-namespace-request]
    (-> this (.describeNamespaceAsync describe-namespace-request))))

(defn get-upload-status-async
  "Gets the status of the specified upload.

  get-upload-status-request - `com.amazonaws.services.iotthingsgraph.model.GetUploadStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUploadStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.GetUploadStatusResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.GetUploadStatusRequest get-upload-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUploadStatusAsync get-upload-status-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.GetUploadStatusRequest get-upload-status-request]
    (-> this (.getUploadStatusAsync get-upload-status-request))))

(defn list-tags-for-resource-async
  "Lists all tags on an AWS IoT Things Graph resource.

  list-tags-for-resource-request - `com.amazonaws.services.iotthingsgraph.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn create-flow-template-async
  "Creates a workflow template. Workflows can be created only in the user's namespace. (The public namespace
   contains only entities.) The workflow can contain only entities in the specified namespace. The workflow is
   validated against the entities in the latest version of the user's namespace unless another namespace version is
   specified in the request.

  create-flow-template-request - `com.amazonaws.services.iotthingsgraph.model.CreateFlowTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateFlowTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.CreateFlowTemplateResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.CreateFlowTemplateRequest create-flow-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createFlowTemplateAsync create-flow-template-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.CreateFlowTemplateRequest create-flow-template-request]
    (-> this (.createFlowTemplateAsync create-flow-template-request))))

(defn dissociate-entity-from-thing-async
  "Dissociates a device entity from a concrete thing. The action takes only the type of the entity that you need to
   dissociate because only one entity of a particular type can be associated with a thing.

  dissociate-entity-from-thing-request - `com.amazonaws.services.iotthingsgraph.model.DissociateEntityFromThingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DissociateEntityFromThing operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.DissociateEntityFromThingResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.DissociateEntityFromThingRequest dissociate-entity-from-thing-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.dissociateEntityFromThingAsync dissociate-entity-from-thing-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.DissociateEntityFromThingRequest dissociate-entity-from-thing-request]
    (-> this (.dissociateEntityFromThingAsync dissociate-entity-from-thing-request))))

(defn search-system-instances-async
  "Searches for system instances in the user's account.

  search-system-instances-request - `com.amazonaws.services.iotthingsgraph.model.SearchSystemInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchSystemInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.SearchSystemInstancesResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.SearchSystemInstancesRequest search-system-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchSystemInstancesAsync search-system-instances-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.SearchSystemInstancesRequest search-system-instances-request]
    (-> this (.searchSystemInstancesAsync search-system-instances-request))))

(defn deploy-system-instance-async
  "Greengrass and Cloud Deployments


   Deploys the system instance to the target specified in CreateSystemInstance.


   Greengrass Deployments


   If the system or any workflows and entities have been updated before this action is called, then the deployment
   will create a new Amazon Simple Storage Service resource file and then deploy it.


   Since this action creates a Greengrass deployment on the caller's behalf, the calling identity must have write
   permissions to the specified Greengrass group. Otherwise, the call will fail with an authorization error.


   For information about the artifacts that get added to your Greengrass core device when you use this API, see AWS IoT Things Graph and AWS IoT
   Greengrass.

  deploy-system-instance-request - `com.amazonaws.services.iotthingsgraph.model.DeploySystemInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeploySystemInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.DeploySystemInstanceResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.DeploySystemInstanceRequest deploy-system-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deploySystemInstanceAsync deploy-system-instance-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.DeploySystemInstanceRequest deploy-system-instance-request]
    (-> this (.deploySystemInstanceAsync deploy-system-instance-request))))

(defn search-flow-executions-async
  "Searches for AWS IoT Things Graph workflow execution instances.

  search-flow-executions-request - `com.amazonaws.services.iotthingsgraph.model.SearchFlowExecutionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchFlowExecutions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.SearchFlowExecutionsResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.SearchFlowExecutionsRequest search-flow-executions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchFlowExecutionsAsync search-flow-executions-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.SearchFlowExecutionsRequest search-flow-executions-request]
    (-> this (.searchFlowExecutionsAsync search-flow-executions-request))))

(defn tag-resource-async
  "Creates a tag for the specified resource.

  tag-resource-request - `com.amazonaws.services.iotthingsgraph.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn update-flow-template-async
  "Updates the specified workflow. All deployed systems and system instances that use the workflow will see the
   changes in the flow when it is redeployed. If you don't want this behavior, copy the workflow (creating a new
   workflow with a different ID), and update the copy. The workflow can contain only entities in the specified
   namespace.

  update-flow-template-request - `com.amazonaws.services.iotthingsgraph.model.UpdateFlowTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateFlowTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.UpdateFlowTemplateResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.UpdateFlowTemplateRequest update-flow-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateFlowTemplateAsync update-flow-template-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.UpdateFlowTemplateRequest update-flow-template-request]
    (-> this (.updateFlowTemplateAsync update-flow-template-request))))

(defn get-entities-async
  "Gets definitions of the specified entities. Uses the latest version of the user's namespace by default. This API
   returns the following TDM entities.




   Properties




   States




   Events




   Actions




   Capabilities




   Mappings




   Devices




   Device Models




   Services




   This action doesn't return definitions for systems, flows, and deployments.

  get-entities-request - `com.amazonaws.services.iotthingsgraph.model.GetEntitiesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetEntities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.GetEntitiesResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.GetEntitiesRequest get-entities-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getEntitiesAsync get-entities-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.GetEntitiesRequest get-entities-request]
    (-> this (.getEntitiesAsync get-entities-request))))

(defn create-system-template-async
  "Creates a system. The system is validated against the entities in the latest version of the user's namespace
   unless another namespace version is specified in the request.

  create-system-template-request - `com.amazonaws.services.iotthingsgraph.model.CreateSystemTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSystemTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.CreateSystemTemplateResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.CreateSystemTemplateRequest create-system-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSystemTemplateAsync create-system-template-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsync this ^com.amazonaws.services.iotthingsgraph.model.CreateSystemTemplateRequest create-system-template-request]
    (-> this (.createSystemTemplateAsync create-system-template-request))))

