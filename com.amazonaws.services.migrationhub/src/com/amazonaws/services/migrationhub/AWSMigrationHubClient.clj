(ns com.amazonaws.services.migrationhub.AWSMigrationHubClient
  "Client for accessing AWS Migration Hub. All service calls made using this client are blocking, and will not return
  until the service call completes.


  The AWS Migration Hub API methods help to obtain server and application migration status and integrate your
  resource-specific migration tool by providing a programmatic interface to Migration Hub."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.migrationhub AWSMigrationHubClient]))

(defn *builder
  "returns: `com.amazonaws.services.migrationhub.AWSMigrationHubClientBuilder`"
  (^com.amazonaws.services.migrationhub.AWSMigrationHubClientBuilder []
    (AWSMigrationHubClient/builder )))

(defn describe-application-state
  "Gets the migration status of an application.

  request - `com.amazonaws.services.migrationhub.model.DescribeApplicationStateRequest`

  returns: Result of the DescribeApplicationState operation returned by the service. - `com.amazonaws.services.migrationhub.model.DescribeApplicationStateResult`

  throws: com.amazonaws.services.migrationhub.model.AccessDeniedException - You do not have sufficient access to perform this action."
  (^com.amazonaws.services.migrationhub.model.DescribeApplicationStateResult [^AWSMigrationHubClient this ^com.amazonaws.services.migrationhub.model.DescribeApplicationStateRequest request]
    (-> this (.describeApplicationState request))))

(defn associate-discovered-resource
  "Associates a discovered resource ID from Application Discovery Service (ADS) with a migration task.

  request - `com.amazonaws.services.migrationhub.model.AssociateDiscoveredResourceRequest`

  returns: Result of the AssociateDiscoveredResource operation returned by the service. - `com.amazonaws.services.migrationhub.model.AssociateDiscoveredResourceResult`

  throws: com.amazonaws.services.migrationhub.model.AccessDeniedException - You do not have sufficient access to perform this action."
  (^com.amazonaws.services.migrationhub.model.AssociateDiscoveredResourceResult [^AWSMigrationHubClient this ^com.amazonaws.services.migrationhub.model.AssociateDiscoveredResourceRequest request]
    (-> this (.associateDiscoveredResource request))))

(defn delete-progress-update-stream
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

  request - `com.amazonaws.services.migrationhub.model.DeleteProgressUpdateStreamRequest`

  returns: Result of the DeleteProgressUpdateStream operation returned by the service. - `com.amazonaws.services.migrationhub.model.DeleteProgressUpdateStreamResult`

  throws: com.amazonaws.services.migrationhub.model.AccessDeniedException - You do not have sufficient access to perform this action."
  (^com.amazonaws.services.migrationhub.model.DeleteProgressUpdateStreamResult [^AWSMigrationHubClient this ^com.amazonaws.services.migrationhub.model.DeleteProgressUpdateStreamRequest request]
    (-> this (.deleteProgressUpdateStream request))))

(defn list-migration-tasks
  "Lists all, or filtered by resource name, migration tasks associated with the user account making this call. This
   API has the following traits:




   Can show a summary list of the most recent migration tasks.




   Can show a summary list of migration tasks associated with a given discovered resource.




   Lists migration tasks in a paginated interface.

  request - `com.amazonaws.services.migrationhub.model.ListMigrationTasksRequest`

  returns: Result of the ListMigrationTasks operation returned by the service. - `com.amazonaws.services.migrationhub.model.ListMigrationTasksResult`

  throws: com.amazonaws.services.migrationhub.model.AccessDeniedException - You do not have sufficient access to perform this action."
  (^com.amazonaws.services.migrationhub.model.ListMigrationTasksResult [^AWSMigrationHubClient this ^com.amazonaws.services.migrationhub.model.ListMigrationTasksRequest request]
    (-> this (.listMigrationTasks request))))

(defn notify-migration-task-state
  "Notifies Migration Hub of the current status, progress, or other detail regarding a migration task. This API has
   the following traits:




   Migration tools will call the NotifyMigrationTaskState API to share the latest progress and status.




   MigrationTaskName is used for addressing updates to the correct target.




   ProgressUpdateStream is used for access control and to provide a namespace for each migration tool.

  request - `com.amazonaws.services.migrationhub.model.NotifyMigrationTaskStateRequest`

  returns: Result of the NotifyMigrationTaskState operation returned by the service. - `com.amazonaws.services.migrationhub.model.NotifyMigrationTaskStateResult`

  throws: com.amazonaws.services.migrationhub.model.AccessDeniedException - You do not have sufficient access to perform this action."
  (^com.amazonaws.services.migrationhub.model.NotifyMigrationTaskStateResult [^AWSMigrationHubClient this ^com.amazonaws.services.migrationhub.model.NotifyMigrationTaskStateRequest request]
    (-> this (.notifyMigrationTaskState request))))

(defn list-created-artifacts
  "Lists the created artifacts attached to a given migration task in an update stream. This API has the following
   traits:




   Gets the list of the created artifacts while migration is taking place.




   Shows the artifacts created by the migration tool that was associated by the
   AssociateCreatedArtifact API.




   Lists created artifacts in a paginated interface.

  request - `com.amazonaws.services.migrationhub.model.ListCreatedArtifactsRequest`

  returns: Result of the ListCreatedArtifacts operation returned by the service. - `com.amazonaws.services.migrationhub.model.ListCreatedArtifactsResult`

  throws: com.amazonaws.services.migrationhub.model.AccessDeniedException - You do not have sufficient access to perform this action."
  (^com.amazonaws.services.migrationhub.model.ListCreatedArtifactsResult [^AWSMigrationHubClient this ^com.amazonaws.services.migrationhub.model.ListCreatedArtifactsRequest request]
    (-> this (.listCreatedArtifacts request))))

(defn list-progress-update-streams
  "Lists progress update streams associated with the user account making this call.

  request - `com.amazonaws.services.migrationhub.model.ListProgressUpdateStreamsRequest`

  returns: Result of the ListProgressUpdateStreams operation returned by the service. - `com.amazonaws.services.migrationhub.model.ListProgressUpdateStreamsResult`

  throws: com.amazonaws.services.migrationhub.model.AccessDeniedException - You do not have sufficient access to perform this action."
  (^com.amazonaws.services.migrationhub.model.ListProgressUpdateStreamsResult [^AWSMigrationHubClient this ^com.amazonaws.services.migrationhub.model.ListProgressUpdateStreamsRequest request]
    (-> this (.listProgressUpdateStreams request))))

(defn associate-created-artifact
  "Associates a created artifact of an AWS cloud resource, the target receiving the migration, with the migration
   task performed by a migration tool. This API has the following traits:




   Migration tools can call the AssociateCreatedArtifact operation to indicate which AWS artifact is
   associated with a migration task.




   The created artifact name must be provided in ARN (Amazon Resource Name) format which will contain information
   about type and region; for example: arn:aws:ec2:us-east-1:488216288981:image/ami-6d0ba87b.




   Examples of the AWS resource behind the created artifact are, AMI's, EC2 instance, or DMS endpoint, etc.

  request - `com.amazonaws.services.migrationhub.model.AssociateCreatedArtifactRequest`

  returns: Result of the AssociateCreatedArtifact operation returned by the service. - `com.amazonaws.services.migrationhub.model.AssociateCreatedArtifactResult`

  throws: com.amazonaws.services.migrationhub.model.AccessDeniedException - You do not have sufficient access to perform this action."
  (^com.amazonaws.services.migrationhub.model.AssociateCreatedArtifactResult [^AWSMigrationHubClient this ^com.amazonaws.services.migrationhub.model.AssociateCreatedArtifactRequest request]
    (-> this (.associateCreatedArtifact request))))

(defn describe-migration-task
  "Retrieves a list of all attributes associated with a specific migration task.

  request - `com.amazonaws.services.migrationhub.model.DescribeMigrationTaskRequest`

  returns: Result of the DescribeMigrationTask operation returned by the service. - `com.amazonaws.services.migrationhub.model.DescribeMigrationTaskResult`

  throws: com.amazonaws.services.migrationhub.model.AccessDeniedException - You do not have sufficient access to perform this action."
  (^com.amazonaws.services.migrationhub.model.DescribeMigrationTaskResult [^AWSMigrationHubClient this ^com.amazonaws.services.migrationhub.model.DescribeMigrationTaskRequest request]
    (-> this (.describeMigrationTask request))))

(defn create-progress-update-stream
  "Creates a progress update stream which is an AWS resource used for access control as well as a namespace for
   migration task names that is implicitly linked to your AWS account. It must uniquely identify the migration tool
   as it is used for all updates made by the tool; however, it does not need to be unique for each AWS account
   because it is scoped to the AWS account.

  request - `com.amazonaws.services.migrationhub.model.CreateProgressUpdateStreamRequest`

  returns: Result of the CreateProgressUpdateStream operation returned by the service. - `com.amazonaws.services.migrationhub.model.CreateProgressUpdateStreamResult`

  throws: com.amazonaws.services.migrationhub.model.AccessDeniedException - You do not have sufficient access to perform this action."
  (^com.amazonaws.services.migrationhub.model.CreateProgressUpdateStreamResult [^AWSMigrationHubClient this ^com.amazonaws.services.migrationhub.model.CreateProgressUpdateStreamRequest request]
    (-> this (.createProgressUpdateStream request))))

(defn import-migration-task
  "Registers a new migration task which represents a server, database, etc., being migrated to AWS by a migration
   tool.


   This API is a prerequisite to calling the NotifyMigrationTaskState API as the migration tool must
   first register the migration task with Migration Hub.

  request - `com.amazonaws.services.migrationhub.model.ImportMigrationTaskRequest`

  returns: Result of the ImportMigrationTask operation returned by the service. - `com.amazonaws.services.migrationhub.model.ImportMigrationTaskResult`

  throws: com.amazonaws.services.migrationhub.model.AccessDeniedException - You do not have sufficient access to perform this action."
  (^com.amazonaws.services.migrationhub.model.ImportMigrationTaskResult [^AWSMigrationHubClient this ^com.amazonaws.services.migrationhub.model.ImportMigrationTaskRequest request]
    (-> this (.importMigrationTask request))))

(defn notify-application-state
  "Sets the migration state of an application. For a given application identified by the value passed to
   ApplicationId, its status is set or updated by passing one of three values to Status:
   NOT_STARTED | IN_PROGRESS | COMPLETED.

  request - `com.amazonaws.services.migrationhub.model.NotifyApplicationStateRequest`

  returns: Result of the NotifyApplicationState operation returned by the service. - `com.amazonaws.services.migrationhub.model.NotifyApplicationStateResult`

  throws: com.amazonaws.services.migrationhub.model.AccessDeniedException - You do not have sufficient access to perform this action."
  (^com.amazonaws.services.migrationhub.model.NotifyApplicationStateResult [^AWSMigrationHubClient this ^com.amazonaws.services.migrationhub.model.NotifyApplicationStateRequest request]
    (-> this (.notifyApplicationState request))))

(defn list-discovered-resources
  "Lists discovered resources associated with the given MigrationTask.

  request - `com.amazonaws.services.migrationhub.model.ListDiscoveredResourcesRequest`

  returns: Result of the ListDiscoveredResources operation returned by the service. - `com.amazonaws.services.migrationhub.model.ListDiscoveredResourcesResult`

  throws: com.amazonaws.services.migrationhub.model.AccessDeniedException - You do not have sufficient access to perform this action."
  (^com.amazonaws.services.migrationhub.model.ListDiscoveredResourcesResult [^AWSMigrationHubClient this ^com.amazonaws.services.migrationhub.model.ListDiscoveredResourcesRequest request]
    (-> this (.listDiscoveredResources request))))

(defn disassociate-created-artifact
  "Disassociates a created artifact of an AWS resource with a migration task performed by a migration tool that was
   previously associated. This API has the following traits:




   A migration user can call the DisassociateCreatedArtifacts operation to disassociate a created AWS
   Artifact from a migration task.




   The created artifact name must be provided in ARN (Amazon Resource Name) format which will contain information
   about type and region; for example: arn:aws:ec2:us-east-1:488216288981:image/ami-6d0ba87b.




   Examples of the AWS resource behind the created artifact are, AMI's, EC2 instance, or RDS instance, etc.

  request - `com.amazonaws.services.migrationhub.model.DisassociateCreatedArtifactRequest`

  returns: Result of the DisassociateCreatedArtifact operation returned by the service. - `com.amazonaws.services.migrationhub.model.DisassociateCreatedArtifactResult`

  throws: com.amazonaws.services.migrationhub.model.AccessDeniedException - You do not have sufficient access to perform this action."
  (^com.amazonaws.services.migrationhub.model.DisassociateCreatedArtifactResult [^AWSMigrationHubClient this ^com.amazonaws.services.migrationhub.model.DisassociateCreatedArtifactRequest request]
    (-> this (.disassociateCreatedArtifact request))))

(defn disassociate-discovered-resource
  "Disassociate an Application Discovery Service (ADS) discovered resource from a migration task.

  request - `com.amazonaws.services.migrationhub.model.DisassociateDiscoveredResourceRequest`

  returns: Result of the DisassociateDiscoveredResource operation returned by the service. - `com.amazonaws.services.migrationhub.model.DisassociateDiscoveredResourceResult`

  throws: com.amazonaws.services.migrationhub.model.AccessDeniedException - You do not have sufficient access to perform this action."
  (^com.amazonaws.services.migrationhub.model.DisassociateDiscoveredResourceResult [^AWSMigrationHubClient this ^com.amazonaws.services.migrationhub.model.DisassociateDiscoveredResourceRequest request]
    (-> this (.disassociateDiscoveredResource request))))

(defn put-resource-attributes
  "Provides identifying details of the resource being migrated so that it can be associated in the Application
   Discovery Service (ADS)'s repository. This association occurs asynchronously after
   PutResourceAttributes returns.





   Keep in mind that subsequent calls to PutResourceAttributes will override previously stored attributes. For
   example, if it is first called with a MAC address, but later, it is desired to add an IP address, it will
   then be required to call it with both the IP and MAC addresses to prevent overiding the MAC address.




   Note the instructions regarding the special use case of the  ResourceAttributeList  parameter when specifying any \"VM\" related value.





   Because this is an asynchronous call, it will always return 200, whether an association occurs or not. To confirm
   if an association was found based on the provided details, call ListDiscoveredResources.

  request - `com.amazonaws.services.migrationhub.model.PutResourceAttributesRequest`

  returns: Result of the PutResourceAttributes operation returned by the service. - `com.amazonaws.services.migrationhub.model.PutResourceAttributesResult`

  throws: com.amazonaws.services.migrationhub.model.AccessDeniedException - You do not have sufficient access to perform this action."
  (^com.amazonaws.services.migrationhub.model.PutResourceAttributesResult [^AWSMigrationHubClient this ^com.amazonaws.services.migrationhub.model.PutResourceAttributesRequest request]
    (-> this (.putResourceAttributes request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSMigrationHubClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

