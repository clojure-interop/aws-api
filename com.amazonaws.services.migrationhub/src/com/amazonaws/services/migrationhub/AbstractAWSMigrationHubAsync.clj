(ns com.amazonaws.services.migrationhub.AbstractAWSMigrationHubAsync
  "Abstract implementation of AWSMigrationHubAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.migrationhub AbstractAWSMigrationHubAsync]))

(defn list-progress-update-streams-async
  "Description copied from interface: AWSMigrationHubAsync

  request - `com.amazonaws.services.migrationhub.model.ListProgressUpdateStreamsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListProgressUpdateStreams operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.migrationhub.model.ListProgressUpdateStreamsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.ListProgressUpdateStreamsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listProgressUpdateStreamsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.ListProgressUpdateStreamsRequest request]
    (-> this (.listProgressUpdateStreamsAsync request))))

(defn describe-application-state-async
  "Description copied from interface: AWSMigrationHubAsync

  request - `com.amazonaws.services.migrationhub.model.DescribeApplicationStateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeApplicationState operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.migrationhub.model.DescribeApplicationStateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.DescribeApplicationStateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeApplicationStateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.DescribeApplicationStateRequest request]
    (-> this (.describeApplicationStateAsync request))))

(defn disassociate-created-artifact-async
  "Description copied from interface: AWSMigrationHubAsync

  request - `com.amazonaws.services.migrationhub.model.DisassociateCreatedArtifactRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateCreatedArtifact operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.migrationhub.model.DisassociateCreatedArtifactResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.DisassociateCreatedArtifactRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateCreatedArtifactAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.DisassociateCreatedArtifactRequest request]
    (-> this (.disassociateCreatedArtifactAsync request))))

(defn associate-discovered-resource-async
  "Description copied from interface: AWSMigrationHubAsync

  request - `com.amazonaws.services.migrationhub.model.AssociateDiscoveredResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateDiscoveredResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.migrationhub.model.AssociateDiscoveredResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.AssociateDiscoveredResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateDiscoveredResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.AssociateDiscoveredResourceRequest request]
    (-> this (.associateDiscoveredResourceAsync request))))

(defn describe-migration-task-async
  "Description copied from interface: AWSMigrationHubAsync

  request - `com.amazonaws.services.migrationhub.model.DescribeMigrationTaskRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeMigrationTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.migrationhub.model.DescribeMigrationTaskResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.DescribeMigrationTaskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeMigrationTaskAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.DescribeMigrationTaskRequest request]
    (-> this (.describeMigrationTaskAsync request))))

(defn list-migration-tasks-async
  "Description copied from interface: AWSMigrationHubAsync

  request - `com.amazonaws.services.migrationhub.model.ListMigrationTasksRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListMigrationTasks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.migrationhub.model.ListMigrationTasksResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.ListMigrationTasksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listMigrationTasksAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.ListMigrationTasksRequest request]
    (-> this (.listMigrationTasksAsync request))))

(defn notify-migration-task-state-async
  "Description copied from interface: AWSMigrationHubAsync

  request - `com.amazonaws.services.migrationhub.model.NotifyMigrationTaskStateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the NotifyMigrationTaskState operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.migrationhub.model.NotifyMigrationTaskStateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.NotifyMigrationTaskStateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.notifyMigrationTaskStateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.NotifyMigrationTaskStateRequest request]
    (-> this (.notifyMigrationTaskStateAsync request))))

(defn import-migration-task-async
  "Description copied from interface: AWSMigrationHubAsync

  request - `com.amazonaws.services.migrationhub.model.ImportMigrationTaskRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ImportMigrationTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.migrationhub.model.ImportMigrationTaskResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.ImportMigrationTaskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.importMigrationTaskAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.ImportMigrationTaskRequest request]
    (-> this (.importMigrationTaskAsync request))))

(defn delete-progress-update-stream-async
  "Description copied from interface: AWSMigrationHubAsync

  request - `com.amazonaws.services.migrationhub.model.DeleteProgressUpdateStreamRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteProgressUpdateStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.migrationhub.model.DeleteProgressUpdateStreamResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.DeleteProgressUpdateStreamRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteProgressUpdateStreamAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.DeleteProgressUpdateStreamRequest request]
    (-> this (.deleteProgressUpdateStreamAsync request))))

(defn disassociate-discovered-resource-async
  "Description copied from interface: AWSMigrationHubAsync

  request - `com.amazonaws.services.migrationhub.model.DisassociateDiscoveredResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateDiscoveredResource operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.migrationhub.model.DisassociateDiscoveredResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.DisassociateDiscoveredResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateDiscoveredResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.DisassociateDiscoveredResourceRequest request]
    (-> this (.disassociateDiscoveredResourceAsync request))))

(defn associate-created-artifact-async
  "Description copied from interface: AWSMigrationHubAsync

  request - `com.amazonaws.services.migrationhub.model.AssociateCreatedArtifactRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateCreatedArtifact operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.migrationhub.model.AssociateCreatedArtifactResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.AssociateCreatedArtifactRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateCreatedArtifactAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.AssociateCreatedArtifactRequest request]
    (-> this (.associateCreatedArtifactAsync request))))

(defn create-progress-update-stream-async
  "Description copied from interface: AWSMigrationHubAsync

  request - `com.amazonaws.services.migrationhub.model.CreateProgressUpdateStreamRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateProgressUpdateStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.migrationhub.model.CreateProgressUpdateStreamResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.CreateProgressUpdateStreamRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createProgressUpdateStreamAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.CreateProgressUpdateStreamRequest request]
    (-> this (.createProgressUpdateStreamAsync request))))

(defn list-created-artifacts-async
  "Description copied from interface: AWSMigrationHubAsync

  request - `com.amazonaws.services.migrationhub.model.ListCreatedArtifactsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListCreatedArtifacts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.migrationhub.model.ListCreatedArtifactsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.ListCreatedArtifactsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listCreatedArtifactsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.ListCreatedArtifactsRequest request]
    (-> this (.listCreatedArtifactsAsync request))))

(defn put-resource-attributes-async
  "Description copied from interface: AWSMigrationHubAsync

  request - `com.amazonaws.services.migrationhub.model.PutResourceAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutResourceAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.migrationhub.model.PutResourceAttributesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.PutResourceAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putResourceAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.PutResourceAttributesRequest request]
    (-> this (.putResourceAttributesAsync request))))

(defn list-discovered-resources-async
  "Description copied from interface: AWSMigrationHubAsync

  request - `com.amazonaws.services.migrationhub.model.ListDiscoveredResourcesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDiscoveredResources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.migrationhub.model.ListDiscoveredResourcesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.ListDiscoveredResourcesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDiscoveredResourcesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.ListDiscoveredResourcesRequest request]
    (-> this (.listDiscoveredResourcesAsync request))))

(defn notify-application-state-async
  "Description copied from interface: AWSMigrationHubAsync

  request - `com.amazonaws.services.migrationhub.model.NotifyApplicationStateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the NotifyApplicationState operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.migrationhub.model.NotifyApplicationStateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.NotifyApplicationStateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.notifyApplicationStateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMigrationHubAsync this ^com.amazonaws.services.migrationhub.model.NotifyApplicationStateRequest request]
    (-> this (.notifyApplicationStateAsync request))))

