(ns com.amazonaws.services.servermigration.AbstractAWSServerMigrationAsync
  "Abstract implementation of AWSServerMigrationAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.servermigration AbstractAWSServerMigrationAsync]))

(defn get-app-async
  "Description copied from interface: AWSServerMigrationAsync

  request - `com.amazonaws.services.servermigration.model.GetAppRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetApp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.GetAppResult>`"
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.GetAppRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAppAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.GetAppRequest request]
    (-> this (.getAppAsync request))))

(defn disassociate-connector-async
  "Description copied from interface: AWSServerMigrationAsync

  request - `com.amazonaws.services.servermigration.model.DisassociateConnectorRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateConnector operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.DisassociateConnectorResult>`"
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.DisassociateConnectorRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateConnectorAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.DisassociateConnectorRequest request]
    (-> this (.disassociateConnectorAsync request))))

(defn create-replication-job-async
  "Description copied from interface: AWSServerMigrationAsync

  request - `com.amazonaws.services.servermigration.model.CreateReplicationJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateReplicationJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.CreateReplicationJobResult>`"
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.CreateReplicationJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createReplicationJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.CreateReplicationJobRequest request]
    (-> this (.createReplicationJobAsync request))))

(defn generate-change-set-async
  "Description copied from interface: AWSServerMigrationAsync

  request - `com.amazonaws.services.servermigration.model.GenerateChangeSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GenerateChangeSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.GenerateChangeSetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.GenerateChangeSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.generateChangeSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.GenerateChangeSetRequest request]
    (-> this (.generateChangeSetAsync request))))

(defn delete-server-catalog-async
  "Description copied from interface: AWSServerMigrationAsync

  request - `com.amazonaws.services.servermigration.model.DeleteServerCatalogRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteServerCatalog operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.DeleteServerCatalogResult>`"
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.DeleteServerCatalogRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteServerCatalogAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.DeleteServerCatalogRequest request]
    (-> this (.deleteServerCatalogAsync request))))

(defn delete-app-async
  "Description copied from interface: AWSServerMigrationAsync

  request - `com.amazonaws.services.servermigration.model.DeleteAppRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.DeleteAppResult>`"
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.DeleteAppRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAppAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.DeleteAppRequest request]
    (-> this (.deleteAppAsync request))))

(defn update-replication-job-async
  "Description copied from interface: AWSServerMigrationAsync

  request - `com.amazonaws.services.servermigration.model.UpdateReplicationJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateReplicationJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.UpdateReplicationJobResult>`"
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.UpdateReplicationJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateReplicationJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.UpdateReplicationJobRequest request]
    (-> this (.updateReplicationJobAsync request))))

(defn update-app-async
  "Description copied from interface: AWSServerMigrationAsync

  request - `com.amazonaws.services.servermigration.model.UpdateAppRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateApp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.UpdateAppResult>`"
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.UpdateAppRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAppAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.UpdateAppRequest request]
    (-> this (.updateAppAsync request))))

(defn get-replication-jobs-async
  "Description copied from interface: AWSServerMigrationAsync

  request - `com.amazonaws.services.servermigration.model.GetReplicationJobsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetReplicationJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.GetReplicationJobsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.GetReplicationJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getReplicationJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.GetReplicationJobsRequest request]
    (-> this (.getReplicationJobsAsync request))))

(defn delete-app-replication-configuration-async
  "Description copied from interface: AWSServerMigrationAsync

  request - `com.amazonaws.services.servermigration.model.DeleteAppReplicationConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAppReplicationConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.DeleteAppReplicationConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.DeleteAppReplicationConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAppReplicationConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.DeleteAppReplicationConfigurationRequest request]
    (-> this (.deleteAppReplicationConfigurationAsync request))))

(defn delete-app-launch-configuration-async
  "Description copied from interface: AWSServerMigrationAsync

  request - `com.amazonaws.services.servermigration.model.DeleteAppLaunchConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAppLaunchConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.DeleteAppLaunchConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.DeleteAppLaunchConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAppLaunchConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.DeleteAppLaunchConfigurationRequest request]
    (-> this (.deleteAppLaunchConfigurationAsync request))))

(defn list-apps-async
  "Description copied from interface: AWSServerMigrationAsync

  request - `com.amazonaws.services.servermigration.model.ListAppsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListApps operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.ListAppsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.ListAppsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAppsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.ListAppsRequest request]
    (-> this (.listAppsAsync request))))

(defn launch-app-async
  "Description copied from interface: AWSServerMigrationAsync

  request - `com.amazonaws.services.servermigration.model.LaunchAppRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the LaunchApp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.LaunchAppResult>`"
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.LaunchAppRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.launchAppAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.LaunchAppRequest request]
    (-> this (.launchAppAsync request))))

(defn generate-template-async
  "Description copied from interface: AWSServerMigrationAsync

  request - `com.amazonaws.services.servermigration.model.GenerateTemplateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GenerateTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.GenerateTemplateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.GenerateTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.generateTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.GenerateTemplateRequest request]
    (-> this (.generateTemplateAsync request))))

(defn terminate-app-async
  "Description copied from interface: AWSServerMigrationAsync

  request - `com.amazonaws.services.servermigration.model.TerminateAppRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TerminateApp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.TerminateAppResult>`"
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.TerminateAppRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.terminateAppAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.TerminateAppRequest request]
    (-> this (.terminateAppAsync request))))

(defn put-app-replication-configuration-async
  "Description copied from interface: AWSServerMigrationAsync

  request - `com.amazonaws.services.servermigration.model.PutAppReplicationConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutAppReplicationConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.PutAppReplicationConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.PutAppReplicationConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putAppReplicationConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.PutAppReplicationConfigurationRequest request]
    (-> this (.putAppReplicationConfigurationAsync request))))

(defn put-app-launch-configuration-async
  "Description copied from interface: AWSServerMigrationAsync

  request - `com.amazonaws.services.servermigration.model.PutAppLaunchConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutAppLaunchConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.PutAppLaunchConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.PutAppLaunchConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putAppLaunchConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.PutAppLaunchConfigurationRequest request]
    (-> this (.putAppLaunchConfigurationAsync request))))

(defn get-app-launch-configuration-async
  "Description copied from interface: AWSServerMigrationAsync

  request - `com.amazonaws.services.servermigration.model.GetAppLaunchConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAppLaunchConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.GetAppLaunchConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.GetAppLaunchConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAppLaunchConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.GetAppLaunchConfigurationRequest request]
    (-> this (.getAppLaunchConfigurationAsync request))))

(defn start-app-replication-async
  "Description copied from interface: AWSServerMigrationAsync

  request - `com.amazonaws.services.servermigration.model.StartAppReplicationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartAppReplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.StartAppReplicationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.StartAppReplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startAppReplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.StartAppReplicationRequest request]
    (-> this (.startAppReplicationAsync request))))

(defn get-replication-runs-async
  "Description copied from interface: AWSServerMigrationAsync

  request - `com.amazonaws.services.servermigration.model.GetReplicationRunsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetReplicationRuns operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.GetReplicationRunsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.GetReplicationRunsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getReplicationRunsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.GetReplicationRunsRequest request]
    (-> this (.getReplicationRunsAsync request))))

(defn start-on-demand-replication-run-async
  "Description copied from interface: AWSServerMigrationAsync

  request - `com.amazonaws.services.servermigration.model.StartOnDemandReplicationRunRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartOnDemandReplicationRun operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.StartOnDemandReplicationRunResult>`"
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.StartOnDemandReplicationRunRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startOnDemandReplicationRunAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.StartOnDemandReplicationRunRequest request]
    (-> this (.startOnDemandReplicationRunAsync request))))

(defn get-servers-async
  "Description copied from interface: AWSServerMigrationAsync

  request - `com.amazonaws.services.servermigration.model.GetServersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetServers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.GetServersResult>`"
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.GetServersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getServersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.GetServersRequest request]
    (-> this (.getServersAsync request))))

(defn delete-replication-job-async
  "Description copied from interface: AWSServerMigrationAsync

  request - `com.amazonaws.services.servermigration.model.DeleteReplicationJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteReplicationJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.DeleteReplicationJobResult>`"
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.DeleteReplicationJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteReplicationJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.DeleteReplicationJobRequest request]
    (-> this (.deleteReplicationJobAsync request))))

(defn get-app-replication-configuration-async
  "Description copied from interface: AWSServerMigrationAsync

  request - `com.amazonaws.services.servermigration.model.GetAppReplicationConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAppReplicationConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.GetAppReplicationConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.GetAppReplicationConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAppReplicationConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.GetAppReplicationConfigurationRequest request]
    (-> this (.getAppReplicationConfigurationAsync request))))

(defn stop-app-replication-async
  "Description copied from interface: AWSServerMigrationAsync

  request - `com.amazonaws.services.servermigration.model.StopAppReplicationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopAppReplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.StopAppReplicationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.StopAppReplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopAppReplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.StopAppReplicationRequest request]
    (-> this (.stopAppReplicationAsync request))))

(defn import-server-catalog-async
  "Description copied from interface: AWSServerMigrationAsync

  request - `com.amazonaws.services.servermigration.model.ImportServerCatalogRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ImportServerCatalog operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.ImportServerCatalogResult>`"
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.ImportServerCatalogRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.importServerCatalogAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.ImportServerCatalogRequest request]
    (-> this (.importServerCatalogAsync request))))

(defn create-app-async
  "Description copied from interface: AWSServerMigrationAsync

  request - `com.amazonaws.services.servermigration.model.CreateAppRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateApp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.CreateAppResult>`"
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.CreateAppRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAppAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.CreateAppRequest request]
    (-> this (.createAppAsync request))))

(defn get-connectors-async
  "Description copied from interface: AWSServerMigrationAsync

  request - `com.amazonaws.services.servermigration.model.GetConnectorsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetConnectors operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.GetConnectorsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.GetConnectorsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getConnectorsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.GetConnectorsRequest request]
    (-> this (.getConnectorsAsync request))))

