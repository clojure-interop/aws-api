(ns com.amazonaws.services.migrationhub.AWSMigrationHubAsync
  "Interface for accessing AWS Migration Hub asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSMigrationHubAsync instead.



  The AWS Migration Hub API methods help to obtain server and application migration status and integrate your
  resource-specific migration tool by providing a programmatic interface to Migration Hub."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.migrationhub AWSMigrationHubAsync]))

(defn list-progress-update-streams-async
  "Lists progress update streams associated with the user account making this call.

  list-progress-update-streams-request - `com.amazonaws.services.migrationhub.model.ListProgressUpdateStreamsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListProgressUpdateStreams operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.migrationhub.model.ListProgressUpdateStreamsResult>`"
  (^java.util.concurrent.Future [^AWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.ListProgressUpdateStreamsRequest list-progress-update-streams-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listProgressUpdateStreamsAsync list-progress-update-streams-request async-handler)))
  (^java.util.concurrent.Future [^AWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.ListProgressUpdateStreamsRequest list-progress-update-streams-request]
    (-> this (.listProgressUpdateStreamsAsync list-progress-update-streams-request))))

(defn describe-application-state-async
  "Gets the migration status of an application.

  describe-application-state-request - `com.amazonaws.services.migrationhub.model.DescribeApplicationStateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeApplicationState operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.migrationhub.model.DescribeApplicationStateResult>`"
  (^java.util.concurrent.Future [^AWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.DescribeApplicationStateRequest describe-application-state-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeApplicationStateAsync describe-application-state-request async-handler)))
  (^java.util.concurrent.Future [^AWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.DescribeApplicationStateRequest describe-application-state-request]
    (-> this (.describeApplicationStateAsync describe-application-state-request))))

(defn disassociate-created-artifact-async
  "Disassociates a created artifact of an AWS resource with a migration task performed by a migration tool that was
   previously associated. This API has the following traits:




   A migration user can call the DisassociateCreatedArtifacts operation to disassociate a created AWS
   Artifact from a migration task.




   The created artifact name must be provided in ARN (Amazon Resource Name) format which will contain information
   about type and region; for example: arn:aws:ec2:us-east-1:488216288981:image/ami-6d0ba87b.




   Examples of the AWS resource behind the created artifact are, AMI's, EC2 instance, or RDS instance, etc.

  disassociate-created-artifact-request - `com.amazonaws.services.migrationhub.model.DisassociateCreatedArtifactRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateCreatedArtifact operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.migrationhub.model.DisassociateCreatedArtifactResult>`"
  (^java.util.concurrent.Future [^AWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.DisassociateCreatedArtifactRequest disassociate-created-artifact-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateCreatedArtifactAsync disassociate-created-artifact-request async-handler)))
  (^java.util.concurrent.Future [^AWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.DisassociateCreatedArtifactRequest disassociate-created-artifact-request]
    (-> this (.disassociateCreatedArtifactAsync disassociate-created-artifact-request))))

(defn associate-discovered-resource-async
  "Associates a discovered resource ID from Application Discovery Service (ADS) with a migration task.

  associate-discovered-resource-request - `com.amazonaws.services.migrationhub.model.AssociateDiscoveredResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateDiscoveredResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.migrationhub.model.AssociateDiscoveredResourceResult>`"
  (^java.util.concurrent.Future [^AWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.AssociateDiscoveredResourceRequest associate-discovered-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateDiscoveredResourceAsync associate-discovered-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.AssociateDiscoveredResourceRequest associate-discovered-resource-request]
    (-> this (.associateDiscoveredResourceAsync associate-discovered-resource-request))))

(defn describe-migration-task-async
  "Retrieves a list of all attributes associated with a specific migration task.

  describe-migration-task-request - `com.amazonaws.services.migrationhub.model.DescribeMigrationTaskRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeMigrationTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.migrationhub.model.DescribeMigrationTaskResult>`"
  (^java.util.concurrent.Future [^AWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.DescribeMigrationTaskRequest describe-migration-task-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeMigrationTaskAsync describe-migration-task-request async-handler)))
  (^java.util.concurrent.Future [^AWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.DescribeMigrationTaskRequest describe-migration-task-request]
    (-> this (.describeMigrationTaskAsync describe-migration-task-request))))

(defn list-migration-tasks-async
  "Lists all, or filtered by resource name, migration tasks associated with the user account making this call. This
   API has the following traits:




   Can show a summary list of the most recent migration tasks.




   Can show a summary list of migration tasks associated with a given discovered resource.




   Lists migration tasks in a paginated interface.

  list-migration-tasks-request - `com.amazonaws.services.migrationhub.model.ListMigrationTasksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListMigrationTasks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.migrationhub.model.ListMigrationTasksResult>`"
  (^java.util.concurrent.Future [^AWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.ListMigrationTasksRequest list-migration-tasks-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listMigrationTasksAsync list-migration-tasks-request async-handler)))
  (^java.util.concurrent.Future [^AWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.ListMigrationTasksRequest list-migration-tasks-request]
    (-> this (.listMigrationTasksAsync list-migration-tasks-request))))

(defn notify-migration-task-state-async
  "Notifies Migration Hub of the current status, progress, or other detail regarding a migration task. This API has
   the following traits:




   Migration tools will call the NotifyMigrationTaskState API to share the latest progress and status.




   MigrationTaskName is used for addressing updates to the correct target.




   ProgressUpdateStream is used for access control and to provide a namespace for each migration tool.

  notify-migration-task-state-request - `com.amazonaws.services.migrationhub.model.NotifyMigrationTaskStateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the NotifyMigrationTaskState operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.migrationhub.model.NotifyMigrationTaskStateResult>`"
  (^java.util.concurrent.Future [^AWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.NotifyMigrationTaskStateRequest notify-migration-task-state-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.notifyMigrationTaskStateAsync notify-migration-task-state-request async-handler)))
  (^java.util.concurrent.Future [^AWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.NotifyMigrationTaskStateRequest notify-migration-task-state-request]
    (-> this (.notifyMigrationTaskStateAsync notify-migration-task-state-request))))

(defn import-migration-task-async
  "Registers a new migration task which represents a server, database, etc., being migrated to AWS by a migration
   tool.


   This API is a prerequisite to calling the NotifyMigrationTaskState API as the migration tool must
   first register the migration task with Migration Hub.

  import-migration-task-request - `com.amazonaws.services.migrationhub.model.ImportMigrationTaskRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ImportMigrationTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.migrationhub.model.ImportMigrationTaskResult>`"
  (^java.util.concurrent.Future [^AWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.ImportMigrationTaskRequest import-migration-task-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.importMigrationTaskAsync import-migration-task-request async-handler)))
  (^java.util.concurrent.Future [^AWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.ImportMigrationTaskRequest import-migration-task-request]
    (-> this (.importMigrationTaskAsync import-migration-task-request))))

(defn delete-progress-update-stream-async
  "Deletes a progress update stream, including all of its tasks, which was previously created as an AWS resource
   used for access control. This API has the following traits:




   The only parameter needed for DeleteProgressUpdateStream is the stream name (same as a
   CreateProgressUpdateStream call).




   The call will return, and a background process will asynchronously delete the stream and all of its resources
   (tasks, associated resources, resource attributes, created artifacts).




   If the stream takes time to be deleted, it might still show up on a ListProgressUpdateStreams call.




   CreateProgressUpdateStream, ImportMigrationTask, NotifyMigrationTaskState,
   and all Associate[*] APIs realted to the tasks belonging to the stream will throw \"InvalidInputException\" if the
   stream of the same name is in the process of being deleted.




   Once the stream and all of its resources are deleted, CreateProgressUpdateStream for a stream of the
   same name will succeed, and that stream will be an entirely new logical resource (without any resources
   associated with the old stream).

  delete-progress-update-stream-request - `com.amazonaws.services.migrationhub.model.DeleteProgressUpdateStreamRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteProgressUpdateStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.migrationhub.model.DeleteProgressUpdateStreamResult>`"
  (^java.util.concurrent.Future [^AWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.DeleteProgressUpdateStreamRequest delete-progress-update-stream-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteProgressUpdateStreamAsync delete-progress-update-stream-request async-handler)))
  (^java.util.concurrent.Future [^AWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.DeleteProgressUpdateStreamRequest delete-progress-update-stream-request]
    (-> this (.deleteProgressUpdateStreamAsync delete-progress-update-stream-request))))

(defn disassociate-discovered-resource-async
  "Disassociate an Application Discovery Service (ADS) discovered resource from a migration task.

  disassociate-discovered-resource-request - `com.amazonaws.services.migrationhub.model.DisassociateDiscoveredResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateDiscoveredResource operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.migrationhub.model.DisassociateDiscoveredResourceResult>`"
  (^java.util.concurrent.Future [^AWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.DisassociateDiscoveredResourceRequest disassociate-discovered-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateDiscoveredResourceAsync disassociate-discovered-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.DisassociateDiscoveredResourceRequest disassociate-discovered-resource-request]
    (-> this (.disassociateDiscoveredResourceAsync disassociate-discovered-resource-request))))

(defn associate-created-artifact-async
  "Associates a created artifact of an AWS cloud resource, the target receiving the migration, with the migration
   task performed by a migration tool. This API has the following traits:




   Migration tools can call the AssociateCreatedArtifact operation to indicate which AWS artifact is
   associated with a migration task.




   The created artifact name must be provided in ARN (Amazon Resource Name) format which will contain information
   about type and region; for example: arn:aws:ec2:us-east-1:488216288981:image/ami-6d0ba87b.




   Examples of the AWS resource behind the created artifact are, AMI's, EC2 instance, or DMS endpoint, etc.

  associate-created-artifact-request - `com.amazonaws.services.migrationhub.model.AssociateCreatedArtifactRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateCreatedArtifact operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.migrationhub.model.AssociateCreatedArtifactResult>`"
  (^java.util.concurrent.Future [^AWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.AssociateCreatedArtifactRequest associate-created-artifact-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateCreatedArtifactAsync associate-created-artifact-request async-handler)))
  (^java.util.concurrent.Future [^AWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.AssociateCreatedArtifactRequest associate-created-artifact-request]
    (-> this (.associateCreatedArtifactAsync associate-created-artifact-request))))

(defn create-progress-update-stream-async
  "Creates a progress update stream which is an AWS resource used for access control as well as a namespace for
   migration task names that is implicitly linked to your AWS account. It must uniquely identify the migration tool
   as it is used for all updates made by the tool; however, it does not need to be unique for each AWS account
   because it is scoped to the AWS account.

  create-progress-update-stream-request - `com.amazonaws.services.migrationhub.model.CreateProgressUpdateStreamRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateProgressUpdateStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.migrationhub.model.CreateProgressUpdateStreamResult>`"
  (^java.util.concurrent.Future [^AWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.CreateProgressUpdateStreamRequest create-progress-update-stream-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createProgressUpdateStreamAsync create-progress-update-stream-request async-handler)))
  (^java.util.concurrent.Future [^AWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.CreateProgressUpdateStreamRequest create-progress-update-stream-request]
    (-> this (.createProgressUpdateStreamAsync create-progress-update-stream-request))))

(defn list-created-artifacts-async
  "Lists the created artifacts attached to a given migration task in an update stream. This API has the following
   traits:




   Gets the list of the created artifacts while migration is taking place.




   Shows the artifacts created by the migration tool that was associated by the
   AssociateCreatedArtifact API.




   Lists created artifacts in a paginated interface.

  list-created-artifacts-request - `com.amazonaws.services.migrationhub.model.ListCreatedArtifactsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListCreatedArtifacts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.migrationhub.model.ListCreatedArtifactsResult>`"
  (^java.util.concurrent.Future [^AWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.ListCreatedArtifactsRequest list-created-artifacts-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listCreatedArtifactsAsync list-created-artifacts-request async-handler)))
  (^java.util.concurrent.Future [^AWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.ListCreatedArtifactsRequest list-created-artifacts-request]
    (-> this (.listCreatedArtifactsAsync list-created-artifacts-request))))

(defn put-resource-attributes-async
  "Provides identifying details of the resource being migrated so that it can be associated in the Application
   Discovery Service (ADS)'s repository. This association occurs asynchronously after
   PutResourceAttributes returns.





   Keep in mind that subsequent calls to PutResourceAttributes will override previously stored attributes. For
   example, if it is first called with a MAC address, but later, it is desired to add an IP address, it will
   then be required to call it with both the IP and MAC addresses to prevent overiding the MAC address.




   Note the instructions regarding the special use case of the  ResourceAttributeList  parameter when specifying any \"VM\" related value.





   Because this is an asynchronous call, it will always return 200, whether an association occurs or not. To confirm
   if an association was found based on the provided details, call ListDiscoveredResources.

  put-resource-attributes-request - `com.amazonaws.services.migrationhub.model.PutResourceAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutResourceAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.migrationhub.model.PutResourceAttributesResult>`"
  (^java.util.concurrent.Future [^AWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.PutResourceAttributesRequest put-resource-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putResourceAttributesAsync put-resource-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.PutResourceAttributesRequest put-resource-attributes-request]
    (-> this (.putResourceAttributesAsync put-resource-attributes-request))))

(defn list-discovered-resources-async
  "Lists discovered resources associated with the given MigrationTask.

  list-discovered-resources-request - `com.amazonaws.services.migrationhub.model.ListDiscoveredResourcesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDiscoveredResources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.migrationhub.model.ListDiscoveredResourcesResult>`"
  (^java.util.concurrent.Future [^AWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.ListDiscoveredResourcesRequest list-discovered-resources-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDiscoveredResourcesAsync list-discovered-resources-request async-handler)))
  (^java.util.concurrent.Future [^AWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.ListDiscoveredResourcesRequest list-discovered-resources-request]
    (-> this (.listDiscoveredResourcesAsync list-discovered-resources-request))))

(defn notify-application-state-async
  "Sets the migration state of an application. For a given application identified by the value passed to
   ApplicationId, its status is set or updated by passing one of three values to Status:
   NOT_STARTED | IN_PROGRESS | COMPLETED.

  notify-application-state-request - `com.amazonaws.services.migrationhub.model.NotifyApplicationStateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the NotifyApplicationState operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.migrationhub.model.NotifyApplicationStateResult>`"
  (^java.util.concurrent.Future [^AWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.NotifyApplicationStateRequest notify-application-state-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.notifyApplicationStateAsync notify-application-state-request async-handler)))
  (^java.util.concurrent.Future [^AWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.NotifyApplicationStateRequest notify-application-state-request]
    (-> this (.notifyApplicationStateAsync notify-application-state-request))))

