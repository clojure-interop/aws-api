(ns com.amazonaws.services.iotthingsgraph.AWSIoTThingsGraph
  "Interface for accessing AWS IoT Things Graph.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSIoTThingsGraph instead.


  AWS IoT Things Graph

  AWS IoT Things Graph provides an integrated set of tools that enable developers to connect devices and services that
  use different standards, such as units of measure and communication protocols. AWS IoT Things Graph makes it possible
  to build IoT applications with little to no code by connecting devices and services and defining how they interact at
  an abstract level.


  For more information about how AWS IoT Things Graph works, see the User Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.iotthingsgraph AWSIoTThingsGraph]))

(defn create-system-instance
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

  returns: Result of the CreateSystemInstance operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.CreateSystemInstanceResult`

  throws: com.amazonaws.services.iotthingsgraph.model.InvalidRequestException"
  (^com.amazonaws.services.iotthingsgraph.model.CreateSystemInstanceResult [^AWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.CreateSystemInstanceRequest create-system-instance-request]
    (-> this (.createSystemInstance create-system-instance-request))))

(defn deploy-system-instance
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

  returns: Result of the DeploySystemInstance operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.DeploySystemInstanceResult`

  throws: com.amazonaws.services.iotthingsgraph.model.ResourceNotFoundException"
  (^com.amazonaws.services.iotthingsgraph.model.DeploySystemInstanceResult [^AWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.DeploySystemInstanceRequest deploy-system-instance-request]
    (-> this (.deploySystemInstance deploy-system-instance-request))))

(defn list-tags-for-resource
  "Lists all tags on an AWS IoT Things Graph resource.

  list-tags-for-resource-request - `com.amazonaws.services.iotthingsgraph.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.iotthingsgraph.model.InvalidRequestException"
  (^com.amazonaws.services.iotthingsgraph.model.ListTagsForResourceResult [^AWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn get-system-template
  "Gets a system.

  get-system-template-request - `com.amazonaws.services.iotthingsgraph.model.GetSystemTemplateRequest`

  returns: Result of the GetSystemTemplate operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.GetSystemTemplateResult`

  throws: com.amazonaws.services.iotthingsgraph.model.InvalidRequestException"
  (^com.amazonaws.services.iotthingsgraph.model.GetSystemTemplateResult [^AWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.GetSystemTemplateRequest get-system-template-request]
    (-> this (.getSystemTemplate get-system-template-request))))

(defn search-system-instances
  "Searches for system instances in the user's account.

  search-system-instances-request - `com.amazonaws.services.iotthingsgraph.model.SearchSystemInstancesRequest`

  returns: Result of the SearchSystemInstances operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.SearchSystemInstancesResult`

  throws: com.amazonaws.services.iotthingsgraph.model.InvalidRequestException"
  (^com.amazonaws.services.iotthingsgraph.model.SearchSystemInstancesResult [^AWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.SearchSystemInstancesRequest search-system-instances-request]
    (-> this (.searchSystemInstances search-system-instances-request))))

(defn associate-entity-to-thing
  "Associates a device with a concrete thing that is in the user's registry.


   A thing can be associated with only one device at a time. If you associate a thing with a new device id, its
   previous association will be removed.

  associate-entity-to-thing-request - `com.amazonaws.services.iotthingsgraph.model.AssociateEntityToThingRequest`

  returns: Result of the AssociateEntityToThing operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.AssociateEntityToThingResult`

  throws: com.amazonaws.services.iotthingsgraph.model.InvalidRequestException"
  (^com.amazonaws.services.iotthingsgraph.model.AssociateEntityToThingResult [^AWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.AssociateEntityToThingRequest associate-entity-to-thing-request]
    (-> this (.associateEntityToThing associate-entity-to-thing-request))))

(defn create-flow-template
  "Creates a workflow template. Workflows can be created only in the user's namespace. (The public namespace
   contains only entities.) The workflow can contain only entities in the specified namespace. The workflow is
   validated against the entities in the latest version of the user's namespace unless another namespace version is
   specified in the request.

  create-flow-template-request - `com.amazonaws.services.iotthingsgraph.model.CreateFlowTemplateRequest`

  returns: Result of the CreateFlowTemplate operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.CreateFlowTemplateResult`

  throws: com.amazonaws.services.iotthingsgraph.model.InvalidRequestException"
  (^com.amazonaws.services.iotthingsgraph.model.CreateFlowTemplateResult [^AWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.CreateFlowTemplateRequest create-flow-template-request]
    (-> this (.createFlowTemplate create-flow-template-request))))

(defn get-entities
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

  returns: Result of the GetEntities operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.GetEntitiesResult`

  throws: com.amazonaws.services.iotthingsgraph.model.InvalidRequestException"
  (^com.amazonaws.services.iotthingsgraph.model.GetEntitiesResult [^AWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.GetEntitiesRequest get-entities-request]
    (-> this (.getEntities get-entities-request))))

(defn untag-resource
  "Removes a tag from the specified resource.

  untag-resource-request - `com.amazonaws.services.iotthingsgraph.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.UntagResourceResult`

  throws: com.amazonaws.services.iotthingsgraph.model.InvalidRequestException"
  (^com.amazonaws.services.iotthingsgraph.model.UntagResourceResult [^AWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn deprecate-flow-template
  "Deprecates the specified workflow. This action marks the workflow for deletion. Deprecated flows can't be
   deployed, but existing deployments will continue to run.

  deprecate-flow-template-request - `com.amazonaws.services.iotthingsgraph.model.DeprecateFlowTemplateRequest`

  returns: Result of the DeprecateFlowTemplate operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.DeprecateFlowTemplateResult`

  throws: com.amazonaws.services.iotthingsgraph.model.InvalidRequestException"
  (^com.amazonaws.services.iotthingsgraph.model.DeprecateFlowTemplateResult [^AWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.DeprecateFlowTemplateRequest deprecate-flow-template-request]
    (-> this (.deprecateFlowTemplate deprecate-flow-template-request))))

(defn list-flow-execution-messages
  "Returns a list of objects that contain information about events in a flow execution.

  list-flow-execution-messages-request - `com.amazonaws.services.iotthingsgraph.model.ListFlowExecutionMessagesRequest`

  returns: Result of the ListFlowExecutionMessages operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.ListFlowExecutionMessagesResult`

  throws: com.amazonaws.services.iotthingsgraph.model.InvalidRequestException"
  (^com.amazonaws.services.iotthingsgraph.model.ListFlowExecutionMessagesResult [^AWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.ListFlowExecutionMessagesRequest list-flow-execution-messages-request]
    (-> this (.listFlowExecutionMessages list-flow-execution-messages-request))))

(defn search-system-templates
  "Searches for summary information about systems in the user's account. You can filter by the ID of a workflow to
   return only systems that use the specified workflow.

  search-system-templates-request - `com.amazonaws.services.iotthingsgraph.model.SearchSystemTemplatesRequest`

  returns: Result of the SearchSystemTemplates operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.SearchSystemTemplatesResult`

  throws: com.amazonaws.services.iotthingsgraph.model.InvalidRequestException"
  (^com.amazonaws.services.iotthingsgraph.model.SearchSystemTemplatesResult [^AWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.SearchSystemTemplatesRequest search-system-templates-request]
    (-> this (.searchSystemTemplates search-system-templates-request))))

(defn deprecate-system-template
  "Deprecates the specified system.

  deprecate-system-template-request - `com.amazonaws.services.iotthingsgraph.model.DeprecateSystemTemplateRequest`

  returns: Result of the DeprecateSystemTemplate operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.DeprecateSystemTemplateResult`

  throws: com.amazonaws.services.iotthingsgraph.model.InvalidRequestException"
  (^com.amazonaws.services.iotthingsgraph.model.DeprecateSystemTemplateResult [^AWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.DeprecateSystemTemplateRequest deprecate-system-template-request]
    (-> this (.deprecateSystemTemplate deprecate-system-template-request))))

(defn search-flow-executions
  "Searches for AWS IoT Things Graph workflow execution instances.

  search-flow-executions-request - `com.amazonaws.services.iotthingsgraph.model.SearchFlowExecutionsRequest`

  returns: Result of the SearchFlowExecutions operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.SearchFlowExecutionsResult`

  throws: com.amazonaws.services.iotthingsgraph.model.InvalidRequestException"
  (^com.amazonaws.services.iotthingsgraph.model.SearchFlowExecutionsResult [^AWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.SearchFlowExecutionsRequest search-flow-executions-request]
    (-> this (.searchFlowExecutions search-flow-executions-request))))

(defn get-upload-status
  "Gets the status of the specified upload.

  get-upload-status-request - `com.amazonaws.services.iotthingsgraph.model.GetUploadStatusRequest`

  returns: Result of the GetUploadStatus operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.GetUploadStatusResult`

  throws: com.amazonaws.services.iotthingsgraph.model.InvalidRequestException"
  (^com.amazonaws.services.iotthingsgraph.model.GetUploadStatusResult [^AWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.GetUploadStatusRequest get-upload-status-request]
    (-> this (.getUploadStatus get-upload-status-request))))

(defn create-system-template
  "Creates a system. The system is validated against the entities in the latest version of the user's namespace
   unless another namespace version is specified in the request.

  create-system-template-request - `com.amazonaws.services.iotthingsgraph.model.CreateSystemTemplateRequest`

  returns: Result of the CreateSystemTemplate operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.CreateSystemTemplateResult`

  throws: com.amazonaws.services.iotthingsgraph.model.InvalidRequestException"
  (^com.amazonaws.services.iotthingsgraph.model.CreateSystemTemplateResult [^AWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.CreateSystemTemplateRequest create-system-template-request]
    (-> this (.createSystemTemplate create-system-template-request))))

(defn describe-namespace
  "Gets the latest version of the user's namespace and the public version that it is tracking.

  describe-namespace-request - `com.amazonaws.services.iotthingsgraph.model.DescribeNamespaceRequest`

  returns: Result of the DescribeNamespace operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.DescribeNamespaceResult`

  throws: com.amazonaws.services.iotthingsgraph.model.ResourceNotFoundException"
  (^com.amazonaws.services.iotthingsgraph.model.DescribeNamespaceResult [^AWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.DescribeNamespaceRequest describe-namespace-request]
    (-> this (.describeNamespace describe-namespace-request))))

(defn delete-flow-template
  "Deletes a workflow. Any new system or deployment that contains this workflow will fail to update or deploy.
   Existing deployments that contain the workflow will continue to run (since they use a snapshot of the workflow
   taken at the time of deployment).

  delete-flow-template-request - `com.amazonaws.services.iotthingsgraph.model.DeleteFlowTemplateRequest`

  returns: Result of the DeleteFlowTemplate operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.DeleteFlowTemplateResult`

  throws: com.amazonaws.services.iotthingsgraph.model.InvalidRequestException"
  (^com.amazonaws.services.iotthingsgraph.model.DeleteFlowTemplateResult [^AWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.DeleteFlowTemplateRequest delete-flow-template-request]
    (-> this (.deleteFlowTemplate delete-flow-template-request))))

(defn search-things
  "Searches for things associated with the specified entity. You can search by both device and device model.


   For example, if two different devices, camera1 and camera2, implement the camera device model, the user can
   associate thing1 to camera1 and thing2 to camera2. SearchThings(camera2) will return only thing2,
   but SearchThings(camera) will return both thing1 and thing2.


   This action searches for exact matches and doesn't perform partial text matching.

  search-things-request - `com.amazonaws.services.iotthingsgraph.model.SearchThingsRequest`

  returns: Result of the SearchThings operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.SearchThingsResult`

  throws: com.amazonaws.services.iotthingsgraph.model.InvalidRequestException"
  (^com.amazonaws.services.iotthingsgraph.model.SearchThingsResult [^AWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.SearchThingsRequest search-things-request]
    (-> this (.searchThings search-things-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSIoTThingsGraph this]
    (-> this (.shutdown))))

(defn update-system-template
  "Updates the specified system. You don't need to run this action after updating a workflow. Any deployment that
   uses the system will see the changes in the system when it is redeployed.

  update-system-template-request - `com.amazonaws.services.iotthingsgraph.model.UpdateSystemTemplateRequest`

  returns: Result of the UpdateSystemTemplate operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.UpdateSystemTemplateResult`

  throws: com.amazonaws.services.iotthingsgraph.model.InvalidRequestException"
  (^com.amazonaws.services.iotthingsgraph.model.UpdateSystemTemplateResult [^AWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.UpdateSystemTemplateRequest update-system-template-request]
    (-> this (.updateSystemTemplate update-system-template-request))))

(defn get-namespace-deletion-status
  "Gets the status of a namespace deletion task.

  get-namespace-deletion-status-request - `com.amazonaws.services.iotthingsgraph.model.GetNamespaceDeletionStatusRequest`

  returns: Result of the GetNamespaceDeletionStatus operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.GetNamespaceDeletionStatusResult`

  throws: com.amazonaws.services.iotthingsgraph.model.InvalidRequestException"
  (^com.amazonaws.services.iotthingsgraph.model.GetNamespaceDeletionStatusResult [^AWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.GetNamespaceDeletionStatusRequest get-namespace-deletion-status-request]
    (-> this (.getNamespaceDeletionStatus get-namespace-deletion-status-request))))

(defn get-system-template-revisions
  "Gets revisions made to the specified system template. Only the previous 100 revisions are stored. If the system
   has been deprecated, this action will return the revisions that occurred before its deprecation. This action
   won't work with systems that have been deleted.

  get-system-template-revisions-request - `com.amazonaws.services.iotthingsgraph.model.GetSystemTemplateRevisionsRequest`

  returns: Result of the GetSystemTemplateRevisions operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.GetSystemTemplateRevisionsResult`

  throws: com.amazonaws.services.iotthingsgraph.model.InvalidRequestException"
  (^com.amazonaws.services.iotthingsgraph.model.GetSystemTemplateRevisionsResult [^AWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.GetSystemTemplateRevisionsRequest get-system-template-revisions-request]
    (-> this (.getSystemTemplateRevisions get-system-template-revisions-request))))

(defn update-flow-template
  "Updates the specified workflow. All deployed systems and system instances that use the workflow will see the
   changes in the flow when it is redeployed. If you don't want this behavior, copy the workflow (creating a new
   workflow with a different ID), and update the copy. The workflow can contain only entities in the specified
   namespace.

  update-flow-template-request - `com.amazonaws.services.iotthingsgraph.model.UpdateFlowTemplateRequest`

  returns: Result of the UpdateFlowTemplate operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.UpdateFlowTemplateResult`

  throws: com.amazonaws.services.iotthingsgraph.model.InvalidRequestException"
  (^com.amazonaws.services.iotthingsgraph.model.UpdateFlowTemplateResult [^AWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.UpdateFlowTemplateRequest update-flow-template-request]
    (-> this (.updateFlowTemplate update-flow-template-request))))

(defn get-system-instance
  "Gets a system instance.

  get-system-instance-request - `com.amazonaws.services.iotthingsgraph.model.GetSystemInstanceRequest`

  returns: Result of the GetSystemInstance operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.GetSystemInstanceResult`

  throws: com.amazonaws.services.iotthingsgraph.model.InvalidRequestException"
  (^com.amazonaws.services.iotthingsgraph.model.GetSystemInstanceResult [^AWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.GetSystemInstanceRequest get-system-instance-request]
    (-> this (.getSystemInstance get-system-instance-request))))

(defn delete-system-instance
  "Deletes a system instance. Only system instances that have never been deployed, or that have been undeployed can
   be deleted.


   Users can create a new system instance that has the same ID as a deleted system instance.

  delete-system-instance-request - `com.amazonaws.services.iotthingsgraph.model.DeleteSystemInstanceRequest`

  returns: Result of the DeleteSystemInstance operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.DeleteSystemInstanceResult`

  throws: com.amazonaws.services.iotthingsgraph.model.InvalidRequestException"
  (^com.amazonaws.services.iotthingsgraph.model.DeleteSystemInstanceResult [^AWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.DeleteSystemInstanceRequest delete-system-instance-request]
    (-> this (.deleteSystemInstance delete-system-instance-request))))

(defn upload-entity-definitions
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

  returns: Result of the UploadEntityDefinitions operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.UploadEntityDefinitionsResult`

  throws: com.amazonaws.services.iotthingsgraph.model.InvalidRequestException"
  (^com.amazonaws.services.iotthingsgraph.model.UploadEntityDefinitionsResult [^AWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.UploadEntityDefinitionsRequest upload-entity-definitions-request]
    (-> this (.uploadEntityDefinitions upload-entity-definitions-request))))

(defn search-entities
  "Searches for entities of the specified type. You can search for entities in your namespace and the public
   namespace that you're tracking.

  search-entities-request - `com.amazonaws.services.iotthingsgraph.model.SearchEntitiesRequest`

  returns: Result of the SearchEntities operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.SearchEntitiesResult`

  throws: com.amazonaws.services.iotthingsgraph.model.InvalidRequestException"
  (^com.amazonaws.services.iotthingsgraph.model.SearchEntitiesResult [^AWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.SearchEntitiesRequest search-entities-request]
    (-> this (.searchEntities search-entities-request))))

(defn undeploy-system-instance
  "Removes a system instance from its target (Cloud or Greengrass).

  undeploy-system-instance-request - `com.amazonaws.services.iotthingsgraph.model.UndeploySystemInstanceRequest`

  returns: Result of the UndeploySystemInstance operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.UndeploySystemInstanceResult`

  throws: com.amazonaws.services.iotthingsgraph.model.InvalidRequestException"
  (^com.amazonaws.services.iotthingsgraph.model.UndeploySystemInstanceResult [^AWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.UndeploySystemInstanceRequest undeploy-system-instance-request]
    (-> this (.undeploySystemInstance undeploy-system-instance-request))))

(defn delete-system-template
  "Deletes a system. New deployments can't contain the system after its deletion. Existing deployments that contain
   the system will continue to work because they use a snapshot of the system that is taken when it is deployed.

  delete-system-template-request - `com.amazonaws.services.iotthingsgraph.model.DeleteSystemTemplateRequest`

  returns: Result of the DeleteSystemTemplate operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.DeleteSystemTemplateResult`

  throws: com.amazonaws.services.iotthingsgraph.model.InvalidRequestException"
  (^com.amazonaws.services.iotthingsgraph.model.DeleteSystemTemplateResult [^AWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.DeleteSystemTemplateRequest delete-system-template-request]
    (-> this (.deleteSystemTemplate delete-system-template-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSIoTThingsGraph this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn dissociate-entity-from-thing
  "Dissociates a device entity from a concrete thing. The action takes only the type of the entity that you need to
   dissociate because only one entity of a particular type can be associated with a thing.

  dissociate-entity-from-thing-request - `com.amazonaws.services.iotthingsgraph.model.DissociateEntityFromThingRequest`

  returns: Result of the DissociateEntityFromThing operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.DissociateEntityFromThingResult`

  throws: com.amazonaws.services.iotthingsgraph.model.InvalidRequestException"
  (^com.amazonaws.services.iotthingsgraph.model.DissociateEntityFromThingResult [^AWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.DissociateEntityFromThingRequest dissociate-entity-from-thing-request]
    (-> this (.dissociateEntityFromThing dissociate-entity-from-thing-request))))

(defn get-flow-template-revisions
  "Gets revisions of the specified workflow. Only the last 100 revisions are stored. If the workflow has been
   deprecated, this action will return revisions that occurred before the deprecation. This action won't work for
   workflows that have been deleted.

  get-flow-template-revisions-request - `com.amazonaws.services.iotthingsgraph.model.GetFlowTemplateRevisionsRequest`

  returns: Result of the GetFlowTemplateRevisions operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.GetFlowTemplateRevisionsResult`

  throws: com.amazonaws.services.iotthingsgraph.model.InvalidRequestException"
  (^com.amazonaws.services.iotthingsgraph.model.GetFlowTemplateRevisionsResult [^AWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.GetFlowTemplateRevisionsRequest get-flow-template-revisions-request]
    (-> this (.getFlowTemplateRevisions get-flow-template-revisions-request))))

(defn search-flow-templates
  "Searches for summary information about workflows.

  search-flow-templates-request - `com.amazonaws.services.iotthingsgraph.model.SearchFlowTemplatesRequest`

  returns: Result of the SearchFlowTemplates operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.SearchFlowTemplatesResult`

  throws: com.amazonaws.services.iotthingsgraph.model.InvalidRequestException"
  (^com.amazonaws.services.iotthingsgraph.model.SearchFlowTemplatesResult [^AWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.SearchFlowTemplatesRequest search-flow-templates-request]
    (-> this (.searchFlowTemplates search-flow-templates-request))))

(defn tag-resource
  "Creates a tag for the specified resource.

  tag-resource-request - `com.amazonaws.services.iotthingsgraph.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.TagResourceResult`

  throws: com.amazonaws.services.iotthingsgraph.model.InvalidRequestException"
  (^com.amazonaws.services.iotthingsgraph.model.TagResourceResult [^AWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

(defn delete-namespace
  "Deletes the specified namespace. This action deletes all of the entities in the namespace. Delete the systems and
   flows that use entities in the namespace before performing this action.

  delete-namespace-request - `com.amazonaws.services.iotthingsgraph.model.DeleteNamespaceRequest`

  returns: Result of the DeleteNamespace operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.DeleteNamespaceResult`

  throws: com.amazonaws.services.iotthingsgraph.model.InternalFailureException"
  (^com.amazonaws.services.iotthingsgraph.model.DeleteNamespaceResult [^AWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.DeleteNamespaceRequest delete-namespace-request]
    (-> this (.deleteNamespace delete-namespace-request))))

(defn get-flow-template
  "Gets the latest version of the DefinitionDocument and FlowTemplateSummary for the
   specified workflow.

  get-flow-template-request - `com.amazonaws.services.iotthingsgraph.model.GetFlowTemplateRequest`

  returns: Result of the GetFlowTemplate operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.GetFlowTemplateResult`

  throws: com.amazonaws.services.iotthingsgraph.model.InvalidRequestException"
  (^com.amazonaws.services.iotthingsgraph.model.GetFlowTemplateResult [^AWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.GetFlowTemplateRequest get-flow-template-request]
    (-> this (.getFlowTemplate get-flow-template-request))))

