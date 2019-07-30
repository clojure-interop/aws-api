(ns com.amazonaws.services.migrationhub.AbstractAWSMigrationHub
  "Abstract implementation of AWSMigrationHub. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.migrationhub AbstractAWSMigrationHub]))

(defn describe-application-state
  "Description copied from interface: AWSMigrationHub

  request - `com.amazonaws.services.migrationhub.model.DescribeApplicationStateRequest`

  returns: Result of the DescribeApplicationState operation returned by the service. - `com.amazonaws.services.migrationhub.model.DescribeApplicationStateResult`"
  (^com.amazonaws.services.migrationhub.model.DescribeApplicationStateResult [^AbstractAWSMigrationHub this ^com.amazonaws.services.migrationhub.model.DescribeApplicationStateRequest request]
    (-> this (.describeApplicationState request))))

(defn associate-discovered-resource
  "Description copied from interface: AWSMigrationHub

  request - `com.amazonaws.services.migrationhub.model.AssociateDiscoveredResourceRequest`

  returns: Result of the AssociateDiscoveredResource operation returned by the service. - `com.amazonaws.services.migrationhub.model.AssociateDiscoveredResourceResult`"
  (^com.amazonaws.services.migrationhub.model.AssociateDiscoveredResourceResult [^AbstractAWSMigrationHub this ^com.amazonaws.services.migrationhub.model.AssociateDiscoveredResourceRequest request]
    (-> this (.associateDiscoveredResource request))))

(defn delete-progress-update-stream
  "Description copied from interface: AWSMigrationHub

  request - `com.amazonaws.services.migrationhub.model.DeleteProgressUpdateStreamRequest`

  returns: Result of the DeleteProgressUpdateStream operation returned by the service. - `com.amazonaws.services.migrationhub.model.DeleteProgressUpdateStreamResult`"
  (^com.amazonaws.services.migrationhub.model.DeleteProgressUpdateStreamResult [^AbstractAWSMigrationHub this ^com.amazonaws.services.migrationhub.model.DeleteProgressUpdateStreamRequest request]
    (-> this (.deleteProgressUpdateStream request))))

(defn list-migration-tasks
  "Description copied from interface: AWSMigrationHub

  request - `com.amazonaws.services.migrationhub.model.ListMigrationTasksRequest`

  returns: Result of the ListMigrationTasks operation returned by the service. - `com.amazonaws.services.migrationhub.model.ListMigrationTasksResult`"
  (^com.amazonaws.services.migrationhub.model.ListMigrationTasksResult [^AbstractAWSMigrationHub this ^com.amazonaws.services.migrationhub.model.ListMigrationTasksRequest request]
    (-> this (.listMigrationTasks request))))

(defn notify-migration-task-state
  "Description copied from interface: AWSMigrationHub

  request - `com.amazonaws.services.migrationhub.model.NotifyMigrationTaskStateRequest`

  returns: Result of the NotifyMigrationTaskState operation returned by the service. - `com.amazonaws.services.migrationhub.model.NotifyMigrationTaskStateResult`"
  (^com.amazonaws.services.migrationhub.model.NotifyMigrationTaskStateResult [^AbstractAWSMigrationHub this ^com.amazonaws.services.migrationhub.model.NotifyMigrationTaskStateRequest request]
    (-> this (.notifyMigrationTaskState request))))

(defn list-created-artifacts
  "Description copied from interface: AWSMigrationHub

  request - `com.amazonaws.services.migrationhub.model.ListCreatedArtifactsRequest`

  returns: Result of the ListCreatedArtifacts operation returned by the service. - `com.amazonaws.services.migrationhub.model.ListCreatedArtifactsResult`"
  (^com.amazonaws.services.migrationhub.model.ListCreatedArtifactsResult [^AbstractAWSMigrationHub this ^com.amazonaws.services.migrationhub.model.ListCreatedArtifactsRequest request]
    (-> this (.listCreatedArtifacts request))))

(defn shutdown
  "Description copied from interface: AWSMigrationHub"
  ([^AbstractAWSMigrationHub this]
    (-> this (.shutdown))))

(defn list-progress-update-streams
  "Description copied from interface: AWSMigrationHub

  request - `com.amazonaws.services.migrationhub.model.ListProgressUpdateStreamsRequest`

  returns: Result of the ListProgressUpdateStreams operation returned by the service. - `com.amazonaws.services.migrationhub.model.ListProgressUpdateStreamsResult`"
  (^com.amazonaws.services.migrationhub.model.ListProgressUpdateStreamsResult [^AbstractAWSMigrationHub this ^com.amazonaws.services.migrationhub.model.ListProgressUpdateStreamsRequest request]
    (-> this (.listProgressUpdateStreams request))))

(defn associate-created-artifact
  "Description copied from interface: AWSMigrationHub

  request - `com.amazonaws.services.migrationhub.model.AssociateCreatedArtifactRequest`

  returns: Result of the AssociateCreatedArtifact operation returned by the service. - `com.amazonaws.services.migrationhub.model.AssociateCreatedArtifactResult`"
  (^com.amazonaws.services.migrationhub.model.AssociateCreatedArtifactResult [^AbstractAWSMigrationHub this ^com.amazonaws.services.migrationhub.model.AssociateCreatedArtifactRequest request]
    (-> this (.associateCreatedArtifact request))))

(defn describe-migration-task
  "Description copied from interface: AWSMigrationHub

  request - `com.amazonaws.services.migrationhub.model.DescribeMigrationTaskRequest`

  returns: Result of the DescribeMigrationTask operation returned by the service. - `com.amazonaws.services.migrationhub.model.DescribeMigrationTaskResult`"
  (^com.amazonaws.services.migrationhub.model.DescribeMigrationTaskResult [^AbstractAWSMigrationHub this ^com.amazonaws.services.migrationhub.model.DescribeMigrationTaskRequest request]
    (-> this (.describeMigrationTask request))))

(defn create-progress-update-stream
  "Description copied from interface: AWSMigrationHub

  request - `com.amazonaws.services.migrationhub.model.CreateProgressUpdateStreamRequest`

  returns: Result of the CreateProgressUpdateStream operation returned by the service. - `com.amazonaws.services.migrationhub.model.CreateProgressUpdateStreamResult`"
  (^com.amazonaws.services.migrationhub.model.CreateProgressUpdateStreamResult [^AbstractAWSMigrationHub this ^com.amazonaws.services.migrationhub.model.CreateProgressUpdateStreamRequest request]
    (-> this (.createProgressUpdateStream request))))

(defn import-migration-task
  "Description copied from interface: AWSMigrationHub

  request - `com.amazonaws.services.migrationhub.model.ImportMigrationTaskRequest`

  returns: Result of the ImportMigrationTask operation returned by the service. - `com.amazonaws.services.migrationhub.model.ImportMigrationTaskResult`"
  (^com.amazonaws.services.migrationhub.model.ImportMigrationTaskResult [^AbstractAWSMigrationHub this ^com.amazonaws.services.migrationhub.model.ImportMigrationTaskRequest request]
    (-> this (.importMigrationTask request))))

(defn notify-application-state
  "Description copied from interface: AWSMigrationHub

  request - `com.amazonaws.services.migrationhub.model.NotifyApplicationStateRequest`

  returns: Result of the NotifyApplicationState operation returned by the service. - `com.amazonaws.services.migrationhub.model.NotifyApplicationStateResult`"
  (^com.amazonaws.services.migrationhub.model.NotifyApplicationStateResult [^AbstractAWSMigrationHub this ^com.amazonaws.services.migrationhub.model.NotifyApplicationStateRequest request]
    (-> this (.notifyApplicationState request))))

(defn list-discovered-resources
  "Description copied from interface: AWSMigrationHub

  request - `com.amazonaws.services.migrationhub.model.ListDiscoveredResourcesRequest`

  returns: Result of the ListDiscoveredResources operation returned by the service. - `com.amazonaws.services.migrationhub.model.ListDiscoveredResourcesResult`"
  (^com.amazonaws.services.migrationhub.model.ListDiscoveredResourcesResult [^AbstractAWSMigrationHub this ^com.amazonaws.services.migrationhub.model.ListDiscoveredResourcesRequest request]
    (-> this (.listDiscoveredResources request))))

(defn disassociate-created-artifact
  "Description copied from interface: AWSMigrationHub

  request - `com.amazonaws.services.migrationhub.model.DisassociateCreatedArtifactRequest`

  returns: Result of the DisassociateCreatedArtifact operation returned by the service. - `com.amazonaws.services.migrationhub.model.DisassociateCreatedArtifactResult`"
  (^com.amazonaws.services.migrationhub.model.DisassociateCreatedArtifactResult [^AbstractAWSMigrationHub this ^com.amazonaws.services.migrationhub.model.DisassociateCreatedArtifactRequest request]
    (-> this (.disassociateCreatedArtifact request))))

(defn disassociate-discovered-resource
  "Description copied from interface: AWSMigrationHub

  request - `com.amazonaws.services.migrationhub.model.DisassociateDiscoveredResourceRequest`

  returns: Result of the DisassociateDiscoveredResource operation returned by the service. - `com.amazonaws.services.migrationhub.model.DisassociateDiscoveredResourceResult`"
  (^com.amazonaws.services.migrationhub.model.DisassociateDiscoveredResourceResult [^AbstractAWSMigrationHub this ^com.amazonaws.services.migrationhub.model.DisassociateDiscoveredResourceRequest request]
    (-> this (.disassociateDiscoveredResource request))))

(defn put-resource-attributes
  "Description copied from interface: AWSMigrationHub

  request - `com.amazonaws.services.migrationhub.model.PutResourceAttributesRequest`

  returns: Result of the PutResourceAttributes operation returned by the service. - `com.amazonaws.services.migrationhub.model.PutResourceAttributesResult`"
  (^com.amazonaws.services.migrationhub.model.PutResourceAttributesResult [^AbstractAWSMigrationHub this ^com.amazonaws.services.migrationhub.model.PutResourceAttributesRequest request]
    (-> this (.putResourceAttributes request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSMigrationHub

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSMigrationHub this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

