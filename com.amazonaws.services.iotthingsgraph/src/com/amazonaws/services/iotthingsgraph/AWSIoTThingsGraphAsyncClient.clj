(ns com.amazonaws.services.iotthingsgraph.AWSIoTThingsGraphAsyncClient
  "Client for accessing AWS IoT Things Graph asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  AWS IoT Things Graph

  AWS IoT Things Graph provides an integrated set of tools that enable developers to connect devices and services that
  use different standards, such as units of measure and communication protocols. AWS IoT Things Graph makes it possible
  to build IoT applications with little to no code by connecting devices and services and defining how they interact at
  an abstract level.


  For more information about how AWS IoT Things Graph works, see the User Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.iotthingsgraph AWSIoTThingsGraphAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.iotthingsgraph.AWSIoTThingsGraphAsyncClientBuilder`"
  (^com.amazonaws.services.iotthingsgraph.AWSIoTThingsGraphAsyncClientBuilder []
    (AWSIoTThingsGraphAsyncClient/asyncBuilder )))

(defn get-system-template-async
  "Description copied from interface: AWSIoTThingsGraphAsync

  request - `com.amazonaws.services.iotthingsgraph.model.GetSystemTemplateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSystemTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.GetSystemTemplateResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.GetSystemTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSystemTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.GetSystemTemplateRequest request]
    (-> this (.getSystemTemplateAsync request))))

(defn untag-resource-async
  "Description copied from interface: AWSIoTThingsGraphAsync

  request - `com.amazonaws.services.iotthingsgraph.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn update-system-template-async
  "Description copied from interface: AWSIoTThingsGraphAsync

  request - `com.amazonaws.services.iotthingsgraph.model.UpdateSystemTemplateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSystemTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.UpdateSystemTemplateResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.UpdateSystemTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSystemTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.UpdateSystemTemplateRequest request]
    (-> this (.updateSystemTemplateAsync request))))

(defn delete-namespace-async
  "Description copied from interface: AWSIoTThingsGraphAsync

  request - `com.amazonaws.services.iotthingsgraph.model.DeleteNamespaceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteNamespace operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.DeleteNamespaceResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.DeleteNamespaceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteNamespaceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.DeleteNamespaceRequest request]
    (-> this (.deleteNamespaceAsync request))))

(defn search-things-async
  "Description copied from interface: AWSIoTThingsGraphAsync

  request - `com.amazonaws.services.iotthingsgraph.model.SearchThingsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchThings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.SearchThingsResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.SearchThingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchThingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.SearchThingsRequest request]
    (-> this (.searchThingsAsync request))))

(defn deprecate-system-template-async
  "Description copied from interface: AWSIoTThingsGraphAsync

  request - `com.amazonaws.services.iotthingsgraph.model.DeprecateSystemTemplateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeprecateSystemTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.DeprecateSystemTemplateResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.DeprecateSystemTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deprecateSystemTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.DeprecateSystemTemplateRequest request]
    (-> this (.deprecateSystemTemplateAsync request))))

(defn undeploy-system-instance-async
  "Description copied from interface: AWSIoTThingsGraphAsync

  request - `com.amazonaws.services.iotthingsgraph.model.UndeploySystemInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UndeploySystemInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.UndeploySystemInstanceResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.UndeploySystemInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.undeploySystemInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.UndeploySystemInstanceRequest request]
    (-> this (.undeploySystemInstanceAsync request))))

(defn search-system-templates-async
  "Description copied from interface: AWSIoTThingsGraphAsync

  request - `com.amazonaws.services.iotthingsgraph.model.SearchSystemTemplatesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchSystemTemplates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.SearchSystemTemplatesResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.SearchSystemTemplatesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchSystemTemplatesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.SearchSystemTemplatesRequest request]
    (-> this (.searchSystemTemplatesAsync request))))

(defn delete-system-template-async
  "Description copied from interface: AWSIoTThingsGraphAsync

  request - `com.amazonaws.services.iotthingsgraph.model.DeleteSystemTemplateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSystemTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.DeleteSystemTemplateResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.DeleteSystemTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSystemTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.DeleteSystemTemplateRequest request]
    (-> this (.deleteSystemTemplateAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSIoTThingsGraphAsyncClient this]
    (-> this (.getExecutorService))))

(defn list-flow-execution-messages-async
  "Description copied from interface: AWSIoTThingsGraphAsync

  request - `com.amazonaws.services.iotthingsgraph.model.ListFlowExecutionMessagesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListFlowExecutionMessages operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.ListFlowExecutionMessagesResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.ListFlowExecutionMessagesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listFlowExecutionMessagesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.ListFlowExecutionMessagesRequest request]
    (-> this (.listFlowExecutionMessagesAsync request))))

(defn get-flow-template-async
  "Description copied from interface: AWSIoTThingsGraphAsync

  request - `com.amazonaws.services.iotthingsgraph.model.GetFlowTemplateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFlowTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.GetFlowTemplateResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.GetFlowTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFlowTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.GetFlowTemplateRequest request]
    (-> this (.getFlowTemplateAsync request))))

(defn deprecate-flow-template-async
  "Description copied from interface: AWSIoTThingsGraphAsync

  request - `com.amazonaws.services.iotthingsgraph.model.DeprecateFlowTemplateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeprecateFlowTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.DeprecateFlowTemplateResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.DeprecateFlowTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deprecateFlowTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.DeprecateFlowTemplateRequest request]
    (-> this (.deprecateFlowTemplateAsync request))))

(defn get-namespace-deletion-status-async
  "Description copied from interface: AWSIoTThingsGraphAsync

  request - `com.amazonaws.services.iotthingsgraph.model.GetNamespaceDeletionStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetNamespaceDeletionStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.GetNamespaceDeletionStatusResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.GetNamespaceDeletionStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getNamespaceDeletionStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.GetNamespaceDeletionStatusRequest request]
    (-> this (.getNamespaceDeletionStatusAsync request))))

(defn search-flow-templates-async
  "Description copied from interface: AWSIoTThingsGraphAsync

  request - `com.amazonaws.services.iotthingsgraph.model.SearchFlowTemplatesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchFlowTemplates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.SearchFlowTemplatesResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.SearchFlowTemplatesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchFlowTemplatesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.SearchFlowTemplatesRequest request]
    (-> this (.searchFlowTemplatesAsync request))))

(defn delete-flow-template-async
  "Description copied from interface: AWSIoTThingsGraphAsync

  request - `com.amazonaws.services.iotthingsgraph.model.DeleteFlowTemplateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFlowTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.DeleteFlowTemplateResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.DeleteFlowTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFlowTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.DeleteFlowTemplateRequest request]
    (-> this (.deleteFlowTemplateAsync request))))

(defn associate-entity-to-thing-async
  "Description copied from interface: AWSIoTThingsGraphAsync

  request - `com.amazonaws.services.iotthingsgraph.model.AssociateEntityToThingRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateEntityToThing operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.AssociateEntityToThingResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.AssociateEntityToThingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateEntityToThingAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.AssociateEntityToThingRequest request]
    (-> this (.associateEntityToThingAsync request))))

(defn get-system-instance-async
  "Description copied from interface: AWSIoTThingsGraphAsync

  request - `com.amazonaws.services.iotthingsgraph.model.GetSystemInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSystemInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.GetSystemInstanceResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.GetSystemInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSystemInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.GetSystemInstanceRequest request]
    (-> this (.getSystemInstanceAsync request))))

(defn upload-entity-definitions-async
  "Description copied from interface: AWSIoTThingsGraphAsync

  request - `com.amazonaws.services.iotthingsgraph.model.UploadEntityDefinitionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UploadEntityDefinitions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.UploadEntityDefinitionsResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.UploadEntityDefinitionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.uploadEntityDefinitionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.UploadEntityDefinitionsRequest request]
    (-> this (.uploadEntityDefinitionsAsync request))))

(defn get-system-template-revisions-async
  "Description copied from interface: AWSIoTThingsGraphAsync

  request - `com.amazonaws.services.iotthingsgraph.model.GetSystemTemplateRevisionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSystemTemplateRevisions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.GetSystemTemplateRevisionsResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.GetSystemTemplateRevisionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSystemTemplateRevisionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.GetSystemTemplateRevisionsRequest request]
    (-> this (.getSystemTemplateRevisionsAsync request))))

(defn search-entities-async
  "Description copied from interface: AWSIoTThingsGraphAsync

  request - `com.amazonaws.services.iotthingsgraph.model.SearchEntitiesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchEntities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.SearchEntitiesResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.SearchEntitiesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchEntitiesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.SearchEntitiesRequest request]
    (-> this (.searchEntitiesAsync request))))

(defn create-system-instance-async
  "Description copied from interface: AWSIoTThingsGraphAsync

  request - `com.amazonaws.services.iotthingsgraph.model.CreateSystemInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSystemInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.CreateSystemInstanceResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.CreateSystemInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSystemInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.CreateSystemInstanceRequest request]
    (-> this (.createSystemInstanceAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSIoTThingsGraphAsyncClient this]
    (-> this (.shutdown))))

(defn get-flow-template-revisions-async
  "Description copied from interface: AWSIoTThingsGraphAsync

  request - `com.amazonaws.services.iotthingsgraph.model.GetFlowTemplateRevisionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFlowTemplateRevisions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.GetFlowTemplateRevisionsResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.GetFlowTemplateRevisionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFlowTemplateRevisionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.GetFlowTemplateRevisionsRequest request]
    (-> this (.getFlowTemplateRevisionsAsync request))))

(defn delete-system-instance-async
  "Description copied from interface: AWSIoTThingsGraphAsync

  request - `com.amazonaws.services.iotthingsgraph.model.DeleteSystemInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSystemInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.DeleteSystemInstanceResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.DeleteSystemInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSystemInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.DeleteSystemInstanceRequest request]
    (-> this (.deleteSystemInstanceAsync request))))

(defn describe-namespace-async
  "Description copied from interface: AWSIoTThingsGraphAsync

  request - `com.amazonaws.services.iotthingsgraph.model.DescribeNamespaceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeNamespace operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.DescribeNamespaceResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.DescribeNamespaceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeNamespaceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.DescribeNamespaceRequest request]
    (-> this (.describeNamespaceAsync request))))

(defn get-upload-status-async
  "Description copied from interface: AWSIoTThingsGraphAsync

  request - `com.amazonaws.services.iotthingsgraph.model.GetUploadStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUploadStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.GetUploadStatusResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.GetUploadStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUploadStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.GetUploadStatusRequest request]
    (-> this (.getUploadStatusAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AWSIoTThingsGraphAsync

  request - `com.amazonaws.services.iotthingsgraph.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn create-flow-template-async
  "Description copied from interface: AWSIoTThingsGraphAsync

  request - `com.amazonaws.services.iotthingsgraph.model.CreateFlowTemplateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateFlowTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.CreateFlowTemplateResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.CreateFlowTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createFlowTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.CreateFlowTemplateRequest request]
    (-> this (.createFlowTemplateAsync request))))

(defn dissociate-entity-from-thing-async
  "Description copied from interface: AWSIoTThingsGraphAsync

  request - `com.amazonaws.services.iotthingsgraph.model.DissociateEntityFromThingRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DissociateEntityFromThing operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.DissociateEntityFromThingResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.DissociateEntityFromThingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.dissociateEntityFromThingAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.DissociateEntityFromThingRequest request]
    (-> this (.dissociateEntityFromThingAsync request))))

(defn search-system-instances-async
  "Description copied from interface: AWSIoTThingsGraphAsync

  request - `com.amazonaws.services.iotthingsgraph.model.SearchSystemInstancesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchSystemInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.SearchSystemInstancesResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.SearchSystemInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchSystemInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.SearchSystemInstancesRequest request]
    (-> this (.searchSystemInstancesAsync request))))

(defn deploy-system-instance-async
  "Description copied from interface: AWSIoTThingsGraphAsync

  request - `com.amazonaws.services.iotthingsgraph.model.DeploySystemInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeploySystemInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.DeploySystemInstanceResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.DeploySystemInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deploySystemInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.DeploySystemInstanceRequest request]
    (-> this (.deploySystemInstanceAsync request))))

(defn search-flow-executions-async
  "Description copied from interface: AWSIoTThingsGraphAsync

  request - `com.amazonaws.services.iotthingsgraph.model.SearchFlowExecutionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchFlowExecutions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.SearchFlowExecutionsResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.SearchFlowExecutionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchFlowExecutionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.SearchFlowExecutionsRequest request]
    (-> this (.searchFlowExecutionsAsync request))))

(defn tag-resource-async
  "Description copied from interface: AWSIoTThingsGraphAsync

  request - `com.amazonaws.services.iotthingsgraph.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn update-flow-template-async
  "Description copied from interface: AWSIoTThingsGraphAsync

  request - `com.amazonaws.services.iotthingsgraph.model.UpdateFlowTemplateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateFlowTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.UpdateFlowTemplateResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.UpdateFlowTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateFlowTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.UpdateFlowTemplateRequest request]
    (-> this (.updateFlowTemplateAsync request))))

(defn get-entities-async
  "Description copied from interface: AWSIoTThingsGraphAsync

  request - `com.amazonaws.services.iotthingsgraph.model.GetEntitiesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetEntities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.GetEntitiesResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.GetEntitiesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getEntitiesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.GetEntitiesRequest request]
    (-> this (.getEntitiesAsync request))))

(defn create-system-template-async
  "Description copied from interface: AWSIoTThingsGraphAsync

  request - `com.amazonaws.services.iotthingsgraph.model.CreateSystemTemplateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSystemTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotthingsgraph.model.CreateSystemTemplateResult>`"
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.CreateSystemTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSystemTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTThingsGraphAsyncClient this ^com.amazonaws.services.iotthingsgraph.model.CreateSystemTemplateRequest request]
    (-> this (.createSystemTemplateAsync request))))

