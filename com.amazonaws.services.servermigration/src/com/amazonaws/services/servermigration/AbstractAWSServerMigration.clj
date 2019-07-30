(ns com.amazonaws.services.servermigration.AbstractAWSServerMigration
  "Abstract implementation of AWSServerMigration. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.servermigration AbstractAWSServerMigration]))

(defn create-app
  "Description copied from interface: AWSServerMigration

  request - `com.amazonaws.services.servermigration.model.CreateAppRequest`

  returns: Result of the CreateApp operation returned by the service. - `com.amazonaws.services.servermigration.model.CreateAppResult`"
  (^com.amazonaws.services.servermigration.model.CreateAppResult [^AbstractAWSServerMigration this ^com.amazonaws.services.servermigration.model.CreateAppRequest request]
    (-> this (.createApp request))))

(defn get-app-replication-configuration
  "Description copied from interface: AWSServerMigration

  request - `com.amazonaws.services.servermigration.model.GetAppReplicationConfigurationRequest`

  returns: Result of the GetAppReplicationConfiguration operation returned by the service. - `com.amazonaws.services.servermigration.model.GetAppReplicationConfigurationResult`"
  (^com.amazonaws.services.servermigration.model.GetAppReplicationConfigurationResult [^AbstractAWSServerMigration this ^com.amazonaws.services.servermigration.model.GetAppReplicationConfigurationRequest request]
    (-> this (.getAppReplicationConfiguration request))))

(defn delete-replication-job
  "Description copied from interface: AWSServerMigration

  request - `com.amazonaws.services.servermigration.model.DeleteReplicationJobRequest`

  returns: Result of the DeleteReplicationJob operation returned by the service. - `com.amazonaws.services.servermigration.model.DeleteReplicationJobResult`"
  (^com.amazonaws.services.servermigration.model.DeleteReplicationJobResult [^AbstractAWSServerMigration this ^com.amazonaws.services.servermigration.model.DeleteReplicationJobRequest request]
    (-> this (.deleteReplicationJob request))))

(defn set-region
  "Description copied from interface: AWSServerMigration

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAWSServerMigration this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn get-servers
  "Description copied from interface: AWSServerMigration

  request - `com.amazonaws.services.servermigration.model.GetServersRequest`

  returns: Result of the GetServers operation returned by the service. - `com.amazonaws.services.servermigration.model.GetServersResult`"
  (^com.amazonaws.services.servermigration.model.GetServersResult [^AbstractAWSServerMigration this ^com.amazonaws.services.servermigration.model.GetServersRequest request]
    (-> this (.getServers request))))

(defn start-app-replication
  "Description copied from interface: AWSServerMigration

  request - `com.amazonaws.services.servermigration.model.StartAppReplicationRequest`

  returns: Result of the StartAppReplication operation returned by the service. - `com.amazonaws.services.servermigration.model.StartAppReplicationResult`"
  (^com.amazonaws.services.servermigration.model.StartAppReplicationResult [^AbstractAWSServerMigration this ^com.amazonaws.services.servermigration.model.StartAppReplicationRequest request]
    (-> this (.startAppReplication request))))

(defn list-apps
  "Description copied from interface: AWSServerMigration

  request - `com.amazonaws.services.servermigration.model.ListAppsRequest`

  returns: Result of the ListApps operation returned by the service. - `com.amazonaws.services.servermigration.model.ListAppsResult`"
  (^com.amazonaws.services.servermigration.model.ListAppsResult [^AbstractAWSServerMigration this ^com.amazonaws.services.servermigration.model.ListAppsRequest request]
    (-> this (.listApps request))))

(defn delete-server-catalog
  "Description copied from interface: AWSServerMigration

  request - `com.amazonaws.services.servermigration.model.DeleteServerCatalogRequest`

  returns: Result of the DeleteServerCatalog operation returned by the service. - `com.amazonaws.services.servermigration.model.DeleteServerCatalogResult`"
  (^com.amazonaws.services.servermigration.model.DeleteServerCatalogResult [^AbstractAWSServerMigration this ^com.amazonaws.services.servermigration.model.DeleteServerCatalogRequest request]
    (-> this (.deleteServerCatalog request))))

(defn put-app-launch-configuration
  "Description copied from interface: AWSServerMigration

  request - `com.amazonaws.services.servermigration.model.PutAppLaunchConfigurationRequest`

  returns: Result of the PutAppLaunchConfiguration operation returned by the service. - `com.amazonaws.services.servermigration.model.PutAppLaunchConfigurationResult`"
  (^com.amazonaws.services.servermigration.model.PutAppLaunchConfigurationResult [^AbstractAWSServerMigration this ^com.amazonaws.services.servermigration.model.PutAppLaunchConfigurationRequest request]
    (-> this (.putAppLaunchConfiguration request))))

(defn launch-app
  "Description copied from interface: AWSServerMigration

  request - `com.amazonaws.services.servermigration.model.LaunchAppRequest`

  returns: Result of the LaunchApp operation returned by the service. - `com.amazonaws.services.servermigration.model.LaunchAppResult`"
  (^com.amazonaws.services.servermigration.model.LaunchAppResult [^AbstractAWSServerMigration this ^com.amazonaws.services.servermigration.model.LaunchAppRequest request]
    (-> this (.launchApp request))))

(defn get-replication-jobs
  "Description copied from interface: AWSServerMigration

  request - `com.amazonaws.services.servermigration.model.GetReplicationJobsRequest`

  returns: Result of the GetReplicationJobs operation returned by the service. - `com.amazonaws.services.servermigration.model.GetReplicationJobsResult`"
  (^com.amazonaws.services.servermigration.model.GetReplicationJobsResult [^AbstractAWSServerMigration this ^com.amazonaws.services.servermigration.model.GetReplicationJobsRequest request]
    (-> this (.getReplicationJobs request))))

(defn stop-app-replication
  "Description copied from interface: AWSServerMigration

  request - `com.amazonaws.services.servermigration.model.StopAppReplicationRequest`

  returns: Result of the StopAppReplication operation returned by the service. - `com.amazonaws.services.servermigration.model.StopAppReplicationResult`"
  (^com.amazonaws.services.servermigration.model.StopAppReplicationResult [^AbstractAWSServerMigration this ^com.amazonaws.services.servermigration.model.StopAppReplicationRequest request]
    (-> this (.stopAppReplication request))))

(defn generate-change-set
  "Description copied from interface: AWSServerMigration

  request - `com.amazonaws.services.servermigration.model.GenerateChangeSetRequest`

  returns: Result of the GenerateChangeSet operation returned by the service. - `com.amazonaws.services.servermigration.model.GenerateChangeSetResult`"
  (^com.amazonaws.services.servermigration.model.GenerateChangeSetResult [^AbstractAWSServerMigration this ^com.amazonaws.services.servermigration.model.GenerateChangeSetRequest request]
    (-> this (.generateChangeSet request))))

(defn terminate-app
  "Description copied from interface: AWSServerMigration

  request - `com.amazonaws.services.servermigration.model.TerminateAppRequest`

  returns: Result of the TerminateApp operation returned by the service. - `com.amazonaws.services.servermigration.model.TerminateAppResult`"
  (^com.amazonaws.services.servermigration.model.TerminateAppResult [^AbstractAWSServerMigration this ^com.amazonaws.services.servermigration.model.TerminateAppRequest request]
    (-> this (.terminateApp request))))

(defn shutdown
  "Description copied from interface: AWSServerMigration"
  ([^AbstractAWSServerMigration this]
    (-> this (.shutdown))))

(defn update-replication-job
  "Description copied from interface: AWSServerMigration

  request - `com.amazonaws.services.servermigration.model.UpdateReplicationJobRequest`

  returns: Result of the UpdateReplicationJob operation returned by the service. - `com.amazonaws.services.servermigration.model.UpdateReplicationJobResult`"
  (^com.amazonaws.services.servermigration.model.UpdateReplicationJobResult [^AbstractAWSServerMigration this ^com.amazonaws.services.servermigration.model.UpdateReplicationJobRequest request]
    (-> this (.updateReplicationJob request))))

(defn set-endpoint
  "Description copied from interface: AWSServerMigration

  endpoint - The endpoint (ex: \"sms.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"sms.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAWSServerMigration this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn disassociate-connector
  "Description copied from interface: AWSServerMigration

  request - `com.amazonaws.services.servermigration.model.DisassociateConnectorRequest`

  returns: Result of the DisassociateConnector operation returned by the service. - `com.amazonaws.services.servermigration.model.DisassociateConnectorResult`"
  (^com.amazonaws.services.servermigration.model.DisassociateConnectorResult [^AbstractAWSServerMigration this ^com.amazonaws.services.servermigration.model.DisassociateConnectorRequest request]
    (-> this (.disassociateConnector request))))

(defn delete-app
  "Description copied from interface: AWSServerMigration

  request - `com.amazonaws.services.servermigration.model.DeleteAppRequest`

  returns: Result of the DeleteApp operation returned by the service. - `com.amazonaws.services.servermigration.model.DeleteAppResult`"
  (^com.amazonaws.services.servermigration.model.DeleteAppResult [^AbstractAWSServerMigration this ^com.amazonaws.services.servermigration.model.DeleteAppRequest request]
    (-> this (.deleteApp request))))

(defn get-app
  "Description copied from interface: AWSServerMigration

  request - `com.amazonaws.services.servermigration.model.GetAppRequest`

  returns: Result of the GetApp operation returned by the service. - `com.amazonaws.services.servermigration.model.GetAppResult`"
  (^com.amazonaws.services.servermigration.model.GetAppResult [^AbstractAWSServerMigration this ^com.amazonaws.services.servermigration.model.GetAppRequest request]
    (-> this (.getApp request))))

(defn get-replication-runs
  "Description copied from interface: AWSServerMigration

  request - `com.amazonaws.services.servermigration.model.GetReplicationRunsRequest`

  returns: Result of the GetReplicationRuns operation returned by the service. - `com.amazonaws.services.servermigration.model.GetReplicationRunsResult`"
  (^com.amazonaws.services.servermigration.model.GetReplicationRunsResult [^AbstractAWSServerMigration this ^com.amazonaws.services.servermigration.model.GetReplicationRunsRequest request]
    (-> this (.getReplicationRuns request))))

(defn put-app-replication-configuration
  "Description copied from interface: AWSServerMigration

  request - `com.amazonaws.services.servermigration.model.PutAppReplicationConfigurationRequest`

  returns: Result of the PutAppReplicationConfiguration operation returned by the service. - `com.amazonaws.services.servermigration.model.PutAppReplicationConfigurationResult`"
  (^com.amazonaws.services.servermigration.model.PutAppReplicationConfigurationResult [^AbstractAWSServerMigration this ^com.amazonaws.services.servermigration.model.PutAppReplicationConfigurationRequest request]
    (-> this (.putAppReplicationConfiguration request))))

(defn get-app-launch-configuration
  "Description copied from interface: AWSServerMigration

  request - `com.amazonaws.services.servermigration.model.GetAppLaunchConfigurationRequest`

  returns: Result of the GetAppLaunchConfiguration operation returned by the service. - `com.amazonaws.services.servermigration.model.GetAppLaunchConfigurationResult`"
  (^com.amazonaws.services.servermigration.model.GetAppLaunchConfigurationResult [^AbstractAWSServerMigration this ^com.amazonaws.services.servermigration.model.GetAppLaunchConfigurationRequest request]
    (-> this (.getAppLaunchConfiguration request))))

(defn generate-template
  "Description copied from interface: AWSServerMigration

  request - `com.amazonaws.services.servermigration.model.GenerateTemplateRequest`

  returns: Result of the GenerateTemplate operation returned by the service. - `com.amazonaws.services.servermigration.model.GenerateTemplateResult`"
  (^com.amazonaws.services.servermigration.model.GenerateTemplateResult [^AbstractAWSServerMigration this ^com.amazonaws.services.servermigration.model.GenerateTemplateRequest request]
    (-> this (.generateTemplate request))))

(defn delete-app-replication-configuration
  "Description copied from interface: AWSServerMigration

  request - `com.amazonaws.services.servermigration.model.DeleteAppReplicationConfigurationRequest`

  returns: Result of the DeleteAppReplicationConfiguration operation returned by the service. - `com.amazonaws.services.servermigration.model.DeleteAppReplicationConfigurationResult`"
  (^com.amazonaws.services.servermigration.model.DeleteAppReplicationConfigurationResult [^AbstractAWSServerMigration this ^com.amazonaws.services.servermigration.model.DeleteAppReplicationConfigurationRequest request]
    (-> this (.deleteAppReplicationConfiguration request))))

(defn get-connectors
  "Description copied from interface: AWSServerMigration

  request - `com.amazonaws.services.servermigration.model.GetConnectorsRequest`

  returns: Result of the GetConnectors operation returned by the service. - `com.amazonaws.services.servermigration.model.GetConnectorsResult`"
  (^com.amazonaws.services.servermigration.model.GetConnectorsResult [^AbstractAWSServerMigration this ^com.amazonaws.services.servermigration.model.GetConnectorsRequest request]
    (-> this (.getConnectors request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSServerMigration

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSServerMigration this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn import-server-catalog
  "Description copied from interface: AWSServerMigration

  request - `com.amazonaws.services.servermigration.model.ImportServerCatalogRequest`

  returns: Result of the ImportServerCatalog operation returned by the service. - `com.amazonaws.services.servermigration.model.ImportServerCatalogResult`"
  (^com.amazonaws.services.servermigration.model.ImportServerCatalogResult [^AbstractAWSServerMigration this ^com.amazonaws.services.servermigration.model.ImportServerCatalogRequest request]
    (-> this (.importServerCatalog request))))

(defn start-on-demand-replication-run
  "Description copied from interface: AWSServerMigration

  request - `com.amazonaws.services.servermigration.model.StartOnDemandReplicationRunRequest`

  returns: Result of the StartOnDemandReplicationRun operation returned by the service. - `com.amazonaws.services.servermigration.model.StartOnDemandReplicationRunResult`"
  (^com.amazonaws.services.servermigration.model.StartOnDemandReplicationRunResult [^AbstractAWSServerMigration this ^com.amazonaws.services.servermigration.model.StartOnDemandReplicationRunRequest request]
    (-> this (.startOnDemandReplicationRun request))))

(defn update-app
  "Description copied from interface: AWSServerMigration

  request - `com.amazonaws.services.servermigration.model.UpdateAppRequest`

  returns: Result of the UpdateApp operation returned by the service. - `com.amazonaws.services.servermigration.model.UpdateAppResult`"
  (^com.amazonaws.services.servermigration.model.UpdateAppResult [^AbstractAWSServerMigration this ^com.amazonaws.services.servermigration.model.UpdateAppRequest request]
    (-> this (.updateApp request))))

(defn create-replication-job
  "Description copied from interface: AWSServerMigration

  request - `com.amazonaws.services.servermigration.model.CreateReplicationJobRequest`

  returns: Result of the CreateReplicationJob operation returned by the service. - `com.amazonaws.services.servermigration.model.CreateReplicationJobResult`"
  (^com.amazonaws.services.servermigration.model.CreateReplicationJobResult [^AbstractAWSServerMigration this ^com.amazonaws.services.servermigration.model.CreateReplicationJobRequest request]
    (-> this (.createReplicationJob request))))

(defn delete-app-launch-configuration
  "Description copied from interface: AWSServerMigration

  request - `com.amazonaws.services.servermigration.model.DeleteAppLaunchConfigurationRequest`

  returns: Result of the DeleteAppLaunchConfiguration operation returned by the service. - `com.amazonaws.services.servermigration.model.DeleteAppLaunchConfigurationResult`"
  (^com.amazonaws.services.servermigration.model.DeleteAppLaunchConfigurationResult [^AbstractAWSServerMigration this ^com.amazonaws.services.servermigration.model.DeleteAppLaunchConfigurationRequest request]
    (-> this (.deleteAppLaunchConfiguration request))))

