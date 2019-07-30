(ns com.amazonaws.services.iotthingsgraph.AbstractAWSIoTThingsGraph
  "Abstract implementation of AWSIoTThingsGraph. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.iotthingsgraph AbstractAWSIoTThingsGraph]))

(defn create-system-instance
  "Description copied from interface: AWSIoTThingsGraph

  request - `com.amazonaws.services.iotthingsgraph.model.CreateSystemInstanceRequest`

  returns: Result of the CreateSystemInstance operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.CreateSystemInstanceResult`"
  (^com.amazonaws.services.iotthingsgraph.model.CreateSystemInstanceResult [^AbstractAWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.CreateSystemInstanceRequest request]
    (-> this (.createSystemInstance request))))

(defn deploy-system-instance
  "Description copied from interface: AWSIoTThingsGraph

  request - `com.amazonaws.services.iotthingsgraph.model.DeploySystemInstanceRequest`

  returns: Result of the DeploySystemInstance operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.DeploySystemInstanceResult`"
  (^com.amazonaws.services.iotthingsgraph.model.DeploySystemInstanceResult [^AbstractAWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.DeploySystemInstanceRequest request]
    (-> this (.deploySystemInstance request))))

(defn list-tags-for-resource
  "Description copied from interface: AWSIoTThingsGraph

  request - `com.amazonaws.services.iotthingsgraph.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.iotthingsgraph.model.ListTagsForResourceResult [^AbstractAWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn get-system-template
  "Description copied from interface: AWSIoTThingsGraph

  request - `com.amazonaws.services.iotthingsgraph.model.GetSystemTemplateRequest`

  returns: Result of the GetSystemTemplate operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.GetSystemTemplateResult`"
  (^com.amazonaws.services.iotthingsgraph.model.GetSystemTemplateResult [^AbstractAWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.GetSystemTemplateRequest request]
    (-> this (.getSystemTemplate request))))

(defn search-system-instances
  "Description copied from interface: AWSIoTThingsGraph

  request - `com.amazonaws.services.iotthingsgraph.model.SearchSystemInstancesRequest`

  returns: Result of the SearchSystemInstances operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.SearchSystemInstancesResult`"
  (^com.amazonaws.services.iotthingsgraph.model.SearchSystemInstancesResult [^AbstractAWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.SearchSystemInstancesRequest request]
    (-> this (.searchSystemInstances request))))

(defn associate-entity-to-thing
  "Description copied from interface: AWSIoTThingsGraph

  request - `com.amazonaws.services.iotthingsgraph.model.AssociateEntityToThingRequest`

  returns: Result of the AssociateEntityToThing operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.AssociateEntityToThingResult`"
  (^com.amazonaws.services.iotthingsgraph.model.AssociateEntityToThingResult [^AbstractAWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.AssociateEntityToThingRequest request]
    (-> this (.associateEntityToThing request))))

(defn create-flow-template
  "Description copied from interface: AWSIoTThingsGraph

  request - `com.amazonaws.services.iotthingsgraph.model.CreateFlowTemplateRequest`

  returns: Result of the CreateFlowTemplate operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.CreateFlowTemplateResult`"
  (^com.amazonaws.services.iotthingsgraph.model.CreateFlowTemplateResult [^AbstractAWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.CreateFlowTemplateRequest request]
    (-> this (.createFlowTemplate request))))

(defn get-entities
  "Description copied from interface: AWSIoTThingsGraph

  request - `com.amazonaws.services.iotthingsgraph.model.GetEntitiesRequest`

  returns: Result of the GetEntities operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.GetEntitiesResult`"
  (^com.amazonaws.services.iotthingsgraph.model.GetEntitiesResult [^AbstractAWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.GetEntitiesRequest request]
    (-> this (.getEntities request))))

(defn untag-resource
  "Description copied from interface: AWSIoTThingsGraph

  request - `com.amazonaws.services.iotthingsgraph.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.UntagResourceResult`"
  (^com.amazonaws.services.iotthingsgraph.model.UntagResourceResult [^AbstractAWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn deprecate-flow-template
  "Description copied from interface: AWSIoTThingsGraph

  request - `com.amazonaws.services.iotthingsgraph.model.DeprecateFlowTemplateRequest`

  returns: Result of the DeprecateFlowTemplate operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.DeprecateFlowTemplateResult`"
  (^com.amazonaws.services.iotthingsgraph.model.DeprecateFlowTemplateResult [^AbstractAWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.DeprecateFlowTemplateRequest request]
    (-> this (.deprecateFlowTemplate request))))

(defn list-flow-execution-messages
  "Description copied from interface: AWSIoTThingsGraph

  request - `com.amazonaws.services.iotthingsgraph.model.ListFlowExecutionMessagesRequest`

  returns: Result of the ListFlowExecutionMessages operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.ListFlowExecutionMessagesResult`"
  (^com.amazonaws.services.iotthingsgraph.model.ListFlowExecutionMessagesResult [^AbstractAWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.ListFlowExecutionMessagesRequest request]
    (-> this (.listFlowExecutionMessages request))))

(defn search-system-templates
  "Description copied from interface: AWSIoTThingsGraph

  request - `com.amazonaws.services.iotthingsgraph.model.SearchSystemTemplatesRequest`

  returns: Result of the SearchSystemTemplates operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.SearchSystemTemplatesResult`"
  (^com.amazonaws.services.iotthingsgraph.model.SearchSystemTemplatesResult [^AbstractAWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.SearchSystemTemplatesRequest request]
    (-> this (.searchSystemTemplates request))))

(defn deprecate-system-template
  "Description copied from interface: AWSIoTThingsGraph

  request - `com.amazonaws.services.iotthingsgraph.model.DeprecateSystemTemplateRequest`

  returns: Result of the DeprecateSystemTemplate operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.DeprecateSystemTemplateResult`"
  (^com.amazonaws.services.iotthingsgraph.model.DeprecateSystemTemplateResult [^AbstractAWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.DeprecateSystemTemplateRequest request]
    (-> this (.deprecateSystemTemplate request))))

(defn search-flow-executions
  "Description copied from interface: AWSIoTThingsGraph

  request - `com.amazonaws.services.iotthingsgraph.model.SearchFlowExecutionsRequest`

  returns: Result of the SearchFlowExecutions operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.SearchFlowExecutionsResult`"
  (^com.amazonaws.services.iotthingsgraph.model.SearchFlowExecutionsResult [^AbstractAWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.SearchFlowExecutionsRequest request]
    (-> this (.searchFlowExecutions request))))

(defn get-upload-status
  "Description copied from interface: AWSIoTThingsGraph

  request - `com.amazonaws.services.iotthingsgraph.model.GetUploadStatusRequest`

  returns: Result of the GetUploadStatus operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.GetUploadStatusResult`"
  (^com.amazonaws.services.iotthingsgraph.model.GetUploadStatusResult [^AbstractAWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.GetUploadStatusRequest request]
    (-> this (.getUploadStatus request))))

(defn create-system-template
  "Description copied from interface: AWSIoTThingsGraph

  request - `com.amazonaws.services.iotthingsgraph.model.CreateSystemTemplateRequest`

  returns: Result of the CreateSystemTemplate operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.CreateSystemTemplateResult`"
  (^com.amazonaws.services.iotthingsgraph.model.CreateSystemTemplateResult [^AbstractAWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.CreateSystemTemplateRequest request]
    (-> this (.createSystemTemplate request))))

(defn describe-namespace
  "Description copied from interface: AWSIoTThingsGraph

  request - `com.amazonaws.services.iotthingsgraph.model.DescribeNamespaceRequest`

  returns: Result of the DescribeNamespace operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.DescribeNamespaceResult`"
  (^com.amazonaws.services.iotthingsgraph.model.DescribeNamespaceResult [^AbstractAWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.DescribeNamespaceRequest request]
    (-> this (.describeNamespace request))))

(defn delete-flow-template
  "Description copied from interface: AWSIoTThingsGraph

  request - `com.amazonaws.services.iotthingsgraph.model.DeleteFlowTemplateRequest`

  returns: Result of the DeleteFlowTemplate operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.DeleteFlowTemplateResult`"
  (^com.amazonaws.services.iotthingsgraph.model.DeleteFlowTemplateResult [^AbstractAWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.DeleteFlowTemplateRequest request]
    (-> this (.deleteFlowTemplate request))))

(defn search-things
  "Description copied from interface: AWSIoTThingsGraph

  request - `com.amazonaws.services.iotthingsgraph.model.SearchThingsRequest`

  returns: Result of the SearchThings operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.SearchThingsResult`"
  (^com.amazonaws.services.iotthingsgraph.model.SearchThingsResult [^AbstractAWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.SearchThingsRequest request]
    (-> this (.searchThings request))))

(defn shutdown
  "Description copied from interface: AWSIoTThingsGraph"
  ([^AbstractAWSIoTThingsGraph this]
    (-> this (.shutdown))))

(defn update-system-template
  "Description copied from interface: AWSIoTThingsGraph

  request - `com.amazonaws.services.iotthingsgraph.model.UpdateSystemTemplateRequest`

  returns: Result of the UpdateSystemTemplate operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.UpdateSystemTemplateResult`"
  (^com.amazonaws.services.iotthingsgraph.model.UpdateSystemTemplateResult [^AbstractAWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.UpdateSystemTemplateRequest request]
    (-> this (.updateSystemTemplate request))))

(defn get-namespace-deletion-status
  "Description copied from interface: AWSIoTThingsGraph

  request - `com.amazonaws.services.iotthingsgraph.model.GetNamespaceDeletionStatusRequest`

  returns: Result of the GetNamespaceDeletionStatus operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.GetNamespaceDeletionStatusResult`"
  (^com.amazonaws.services.iotthingsgraph.model.GetNamespaceDeletionStatusResult [^AbstractAWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.GetNamespaceDeletionStatusRequest request]
    (-> this (.getNamespaceDeletionStatus request))))

(defn get-system-template-revisions
  "Description copied from interface: AWSIoTThingsGraph

  request - `com.amazonaws.services.iotthingsgraph.model.GetSystemTemplateRevisionsRequest`

  returns: Result of the GetSystemTemplateRevisions operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.GetSystemTemplateRevisionsResult`"
  (^com.amazonaws.services.iotthingsgraph.model.GetSystemTemplateRevisionsResult [^AbstractAWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.GetSystemTemplateRevisionsRequest request]
    (-> this (.getSystemTemplateRevisions request))))

(defn update-flow-template
  "Description copied from interface: AWSIoTThingsGraph

  request - `com.amazonaws.services.iotthingsgraph.model.UpdateFlowTemplateRequest`

  returns: Result of the UpdateFlowTemplate operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.UpdateFlowTemplateResult`"
  (^com.amazonaws.services.iotthingsgraph.model.UpdateFlowTemplateResult [^AbstractAWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.UpdateFlowTemplateRequest request]
    (-> this (.updateFlowTemplate request))))

(defn get-system-instance
  "Description copied from interface: AWSIoTThingsGraph

  request - `com.amazonaws.services.iotthingsgraph.model.GetSystemInstanceRequest`

  returns: Result of the GetSystemInstance operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.GetSystemInstanceResult`"
  (^com.amazonaws.services.iotthingsgraph.model.GetSystemInstanceResult [^AbstractAWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.GetSystemInstanceRequest request]
    (-> this (.getSystemInstance request))))

(defn delete-system-instance
  "Description copied from interface: AWSIoTThingsGraph

  request - `com.amazonaws.services.iotthingsgraph.model.DeleteSystemInstanceRequest`

  returns: Result of the DeleteSystemInstance operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.DeleteSystemInstanceResult`"
  (^com.amazonaws.services.iotthingsgraph.model.DeleteSystemInstanceResult [^AbstractAWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.DeleteSystemInstanceRequest request]
    (-> this (.deleteSystemInstance request))))

(defn upload-entity-definitions
  "Description copied from interface: AWSIoTThingsGraph

  request - `com.amazonaws.services.iotthingsgraph.model.UploadEntityDefinitionsRequest`

  returns: Result of the UploadEntityDefinitions operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.UploadEntityDefinitionsResult`"
  (^com.amazonaws.services.iotthingsgraph.model.UploadEntityDefinitionsResult [^AbstractAWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.UploadEntityDefinitionsRequest request]
    (-> this (.uploadEntityDefinitions request))))

(defn search-entities
  "Description copied from interface: AWSIoTThingsGraph

  request - `com.amazonaws.services.iotthingsgraph.model.SearchEntitiesRequest`

  returns: Result of the SearchEntities operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.SearchEntitiesResult`"
  (^com.amazonaws.services.iotthingsgraph.model.SearchEntitiesResult [^AbstractAWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.SearchEntitiesRequest request]
    (-> this (.searchEntities request))))

(defn undeploy-system-instance
  "Description copied from interface: AWSIoTThingsGraph

  request - `com.amazonaws.services.iotthingsgraph.model.UndeploySystemInstanceRequest`

  returns: Result of the UndeploySystemInstance operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.UndeploySystemInstanceResult`"
  (^com.amazonaws.services.iotthingsgraph.model.UndeploySystemInstanceResult [^AbstractAWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.UndeploySystemInstanceRequest request]
    (-> this (.undeploySystemInstance request))))

(defn delete-system-template
  "Description copied from interface: AWSIoTThingsGraph

  request - `com.amazonaws.services.iotthingsgraph.model.DeleteSystemTemplateRequest`

  returns: Result of the DeleteSystemTemplate operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.DeleteSystemTemplateResult`"
  (^com.amazonaws.services.iotthingsgraph.model.DeleteSystemTemplateResult [^AbstractAWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.DeleteSystemTemplateRequest request]
    (-> this (.deleteSystemTemplate request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSIoTThingsGraph

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSIoTThingsGraph this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn dissociate-entity-from-thing
  "Description copied from interface: AWSIoTThingsGraph

  request - `com.amazonaws.services.iotthingsgraph.model.DissociateEntityFromThingRequest`

  returns: Result of the DissociateEntityFromThing operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.DissociateEntityFromThingResult`"
  (^com.amazonaws.services.iotthingsgraph.model.DissociateEntityFromThingResult [^AbstractAWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.DissociateEntityFromThingRequest request]
    (-> this (.dissociateEntityFromThing request))))

(defn get-flow-template-revisions
  "Description copied from interface: AWSIoTThingsGraph

  request - `com.amazonaws.services.iotthingsgraph.model.GetFlowTemplateRevisionsRequest`

  returns: Result of the GetFlowTemplateRevisions operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.GetFlowTemplateRevisionsResult`"
  (^com.amazonaws.services.iotthingsgraph.model.GetFlowTemplateRevisionsResult [^AbstractAWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.GetFlowTemplateRevisionsRequest request]
    (-> this (.getFlowTemplateRevisions request))))

(defn search-flow-templates
  "Description copied from interface: AWSIoTThingsGraph

  request - `com.amazonaws.services.iotthingsgraph.model.SearchFlowTemplatesRequest`

  returns: Result of the SearchFlowTemplates operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.SearchFlowTemplatesResult`"
  (^com.amazonaws.services.iotthingsgraph.model.SearchFlowTemplatesResult [^AbstractAWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.SearchFlowTemplatesRequest request]
    (-> this (.searchFlowTemplates request))))

(defn tag-resource
  "Description copied from interface: AWSIoTThingsGraph

  request - `com.amazonaws.services.iotthingsgraph.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.TagResourceResult`"
  (^com.amazonaws.services.iotthingsgraph.model.TagResourceResult [^AbstractAWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn delete-namespace
  "Description copied from interface: AWSIoTThingsGraph

  request - `com.amazonaws.services.iotthingsgraph.model.DeleteNamespaceRequest`

  returns: Result of the DeleteNamespace operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.DeleteNamespaceResult`"
  (^com.amazonaws.services.iotthingsgraph.model.DeleteNamespaceResult [^AbstractAWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.DeleteNamespaceRequest request]
    (-> this (.deleteNamespace request))))

(defn get-flow-template
  "Description copied from interface: AWSIoTThingsGraph

  request - `com.amazonaws.services.iotthingsgraph.model.GetFlowTemplateRequest`

  returns: Result of the GetFlowTemplate operation returned by the service. - `com.amazonaws.services.iotthingsgraph.model.GetFlowTemplateResult`"
  (^com.amazonaws.services.iotthingsgraph.model.GetFlowTemplateResult [^AbstractAWSIoTThingsGraph this ^com.amazonaws.services.iotthingsgraph.model.GetFlowTemplateRequest request]
    (-> this (.getFlowTemplate request))))

