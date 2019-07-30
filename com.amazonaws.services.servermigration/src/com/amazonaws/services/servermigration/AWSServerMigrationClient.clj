(ns com.amazonaws.services.servermigration.AWSServerMigrationClient
  "Client for accessing SMS. All service calls made using this client are blocking, and will not return until the
  service call completes.

  AAWS Sever Migration Service

  This is the AWS Sever Migration Service API Reference. It provides descriptions, syntax, and usage examples
  for each of the actions and data types for the AWS Sever Migration Service (AWS SMS). The topic for each action shows
  the Query API request parameters and the XML response. You can also view the XML request elements in the WSDL.


  Alternatively, you can use one of the AWS SDKs to access an API that's tailored to the programming language or
  platform that you're using. For more information, see AWS SDKs.


  To learn more about the Server Migration Service, see the following resources:




  AWS Sever Migration Service product page




  AWS Sever
  Migration Service User Guide"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.servermigration AWSServerMigrationClient]))

(defn ->aws-server-migration-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to SMS (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AWSServerMigrationClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AWSServerMigrationClient aws-credentials-provider client-configuration request-metric-collector))
  (^AWSServerMigrationClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSServerMigrationClient aws-credentials client-configuration))
  (^AWSServerMigrationClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSServerMigrationClient client-configuration))
  (^AWSServerMigrationClient []
    (new AWSServerMigrationClient )))

(defn *builder
  "returns: `com.amazonaws.services.servermigration.AWSServerMigrationClientBuilder`"
  (^com.amazonaws.services.servermigration.AWSServerMigrationClientBuilder []
    (AWSServerMigrationClient/builder )))

(defn create-app
  "Creates an application. An application consists of one or more server groups. Each server group contain one or
   more servers.

  request - `com.amazonaws.services.servermigration.model.CreateAppRequest`

  returns: Result of the CreateApp operation returned by the service. - `com.amazonaws.services.servermigration.model.CreateAppResult`

  throws: com.amazonaws.services.servermigration.model.UnauthorizedOperationException - You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are using the correct access keys."
  (^com.amazonaws.services.servermigration.model.CreateAppResult [^AWSServerMigrationClient this ^com.amazonaws.services.servermigration.model.CreateAppRequest request]
    (-> this (.createApp request))))

(defn get-app-replication-configuration
  "Retrieves an application replication configuration associatd with an application.

  request - `com.amazonaws.services.servermigration.model.GetAppReplicationConfigurationRequest`

  returns: Result of the GetAppReplicationConfiguration operation returned by the service. - `com.amazonaws.services.servermigration.model.GetAppReplicationConfigurationResult`

  throws: com.amazonaws.services.servermigration.model.UnauthorizedOperationException - You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are using the correct access keys."
  (^com.amazonaws.services.servermigration.model.GetAppReplicationConfigurationResult [^AWSServerMigrationClient this ^com.amazonaws.services.servermigration.model.GetAppReplicationConfigurationRequest request]
    (-> this (.getAppReplicationConfiguration request))))

(defn delete-replication-job
  "Deletes the specified replication job.


   After you delete a replication job, there are no further replication runs. AWS deletes the contents of the Amazon
   S3 bucket used to store AWS SMS artifacts. The AMIs created by the replication runs are not deleted.

  request - `com.amazonaws.services.servermigration.model.DeleteReplicationJobRequest`

  returns: Result of the DeleteReplicationJob operation returned by the service. - `com.amazonaws.services.servermigration.model.DeleteReplicationJobResult`

  throws: com.amazonaws.services.servermigration.model.InvalidParameterException - A specified parameter is not valid."
  (^com.amazonaws.services.servermigration.model.DeleteReplicationJobResult [^AWSServerMigrationClient this ^com.amazonaws.services.servermigration.model.DeleteReplicationJobRequest request]
    (-> this (.deleteReplicationJob request))))

(defn get-servers
  "Describes the servers in your server catalog.


   Before you can describe your servers, you must import them using ImportServerCatalog.

  request - `com.amazonaws.services.servermigration.model.GetServersRequest`

  returns: Result of the GetServers operation returned by the service. - `com.amazonaws.services.servermigration.model.GetServersResult`

  throws: com.amazonaws.services.servermigration.model.UnauthorizedOperationException - You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are using the correct access keys."
  (^com.amazonaws.services.servermigration.model.GetServersResult [^AWSServerMigrationClient this ^com.amazonaws.services.servermigration.model.GetServersRequest request]
    (-> this (.getServers request))))

(defn start-app-replication
  "Starts replicating an application.

  request - `com.amazonaws.services.servermigration.model.StartAppReplicationRequest`

  returns: Result of the StartAppReplication operation returned by the service. - `com.amazonaws.services.servermigration.model.StartAppReplicationResult`

  throws: com.amazonaws.services.servermigration.model.UnauthorizedOperationException - You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are using the correct access keys."
  (^com.amazonaws.services.servermigration.model.StartAppReplicationResult [^AWSServerMigrationClient this ^com.amazonaws.services.servermigration.model.StartAppReplicationRequest request]
    (-> this (.startAppReplication request))))

(defn list-apps
  "Returns a list of summaries for all applications.

  request - `com.amazonaws.services.servermigration.model.ListAppsRequest`

  returns: Result of the ListApps operation returned by the service. - `com.amazonaws.services.servermigration.model.ListAppsResult`

  throws: com.amazonaws.services.servermigration.model.UnauthorizedOperationException - You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are using the correct access keys."
  (^com.amazonaws.services.servermigration.model.ListAppsResult [^AWSServerMigrationClient this ^com.amazonaws.services.servermigration.model.ListAppsRequest request]
    (-> this (.listApps request))))

(defn delete-server-catalog
  "Deletes all servers from your server catalog.

  request - `com.amazonaws.services.servermigration.model.DeleteServerCatalogRequest`

  returns: Result of the DeleteServerCatalog operation returned by the service. - `com.amazonaws.services.servermigration.model.DeleteServerCatalogResult`

  throws: com.amazonaws.services.servermigration.model.UnauthorizedOperationException - You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are using the correct access keys."
  (^com.amazonaws.services.servermigration.model.DeleteServerCatalogResult [^AWSServerMigrationClient this ^com.amazonaws.services.servermigration.model.DeleteServerCatalogRequest request]
    (-> this (.deleteServerCatalog request))))

(defn put-app-launch-configuration
  "Creates a launch configuration for an application.

  request - `com.amazonaws.services.servermigration.model.PutAppLaunchConfigurationRequest`

  returns: Result of the PutAppLaunchConfiguration operation returned by the service. - `com.amazonaws.services.servermigration.model.PutAppLaunchConfigurationResult`

  throws: com.amazonaws.services.servermigration.model.UnauthorizedOperationException - You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are using the correct access keys."
  (^com.amazonaws.services.servermigration.model.PutAppLaunchConfigurationResult [^AWSServerMigrationClient this ^com.amazonaws.services.servermigration.model.PutAppLaunchConfigurationRequest request]
    (-> this (.putAppLaunchConfiguration request))))

(defn launch-app
  "Launches an application stack.

  request - `com.amazonaws.services.servermigration.model.LaunchAppRequest`

  returns: Result of the LaunchApp operation returned by the service. - `com.amazonaws.services.servermigration.model.LaunchAppResult`

  throws: com.amazonaws.services.servermigration.model.UnauthorizedOperationException - You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are using the correct access keys."
  (^com.amazonaws.services.servermigration.model.LaunchAppResult [^AWSServerMigrationClient this ^com.amazonaws.services.servermigration.model.LaunchAppRequest request]
    (-> this (.launchApp request))))

(defn get-replication-jobs
  "Describes the specified replication job or all of your replication jobs.

  request - `com.amazonaws.services.servermigration.model.GetReplicationJobsRequest`

  returns: Result of the GetReplicationJobs operation returned by the service. - `com.amazonaws.services.servermigration.model.GetReplicationJobsResult`

  throws: com.amazonaws.services.servermigration.model.InvalidParameterException - A specified parameter is not valid."
  (^com.amazonaws.services.servermigration.model.GetReplicationJobsResult [^AWSServerMigrationClient this ^com.amazonaws.services.servermigration.model.GetReplicationJobsRequest request]
    (-> this (.getReplicationJobs request))))

(defn stop-app-replication
  "Stops replicating an application.

  request - `com.amazonaws.services.servermigration.model.StopAppReplicationRequest`

  returns: Result of the StopAppReplication operation returned by the service. - `com.amazonaws.services.servermigration.model.StopAppReplicationResult`

  throws: com.amazonaws.services.servermigration.model.UnauthorizedOperationException - You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are using the correct access keys."
  (^com.amazonaws.services.servermigration.model.StopAppReplicationResult [^AWSServerMigrationClient this ^com.amazonaws.services.servermigration.model.StopAppReplicationRequest request]
    (-> this (.stopAppReplication request))))

(defn generate-change-set
  "Generates a target change set for a currently launched stack and writes it to an Amazon S3 object in the
   customer’s Amazon S3 bucket.

  request - `com.amazonaws.services.servermigration.model.GenerateChangeSetRequest`

  returns: Result of the GenerateChangeSet operation returned by the service. - `com.amazonaws.services.servermigration.model.GenerateChangeSetResult`

  throws: com.amazonaws.services.servermigration.model.UnauthorizedOperationException - You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are using the correct access keys."
  (^com.amazonaws.services.servermigration.model.GenerateChangeSetResult [^AWSServerMigrationClient this ^com.amazonaws.services.servermigration.model.GenerateChangeSetRequest request]
    (-> this (.generateChangeSet request))))

(defn terminate-app
  "Terminates the stack for an application.

  request - `com.amazonaws.services.servermigration.model.TerminateAppRequest`

  returns: Result of the TerminateApp operation returned by the service. - `com.amazonaws.services.servermigration.model.TerminateAppResult`

  throws: com.amazonaws.services.servermigration.model.UnauthorizedOperationException - You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are using the correct access keys."
  (^com.amazonaws.services.servermigration.model.TerminateAppResult [^AWSServerMigrationClient this ^com.amazonaws.services.servermigration.model.TerminateAppRequest request]
    (-> this (.terminateApp request))))

(defn update-replication-job
  "Updates the specified settings for the specified replication job.

  request - `com.amazonaws.services.servermigration.model.UpdateReplicationJobRequest`

  returns: Result of the UpdateReplicationJob operation returned by the service. - `com.amazonaws.services.servermigration.model.UpdateReplicationJobResult`

  throws: com.amazonaws.services.servermigration.model.InvalidParameterException - A specified parameter is not valid."
  (^com.amazonaws.services.servermigration.model.UpdateReplicationJobResult [^AWSServerMigrationClient this ^com.amazonaws.services.servermigration.model.UpdateReplicationJobRequest request]
    (-> this (.updateReplicationJob request))))

(defn disassociate-connector
  "Disassociates the specified connector from AWS SMS.


   After you disassociate a connector, it is no longer available to support replication jobs.

  request - `com.amazonaws.services.servermigration.model.DisassociateConnectorRequest`

  returns: Result of the DisassociateConnector operation returned by the service. - `com.amazonaws.services.servermigration.model.DisassociateConnectorResult`

  throws: com.amazonaws.services.servermigration.model.MissingRequiredParameterException - A required parameter is missing."
  (^com.amazonaws.services.servermigration.model.DisassociateConnectorResult [^AWSServerMigrationClient this ^com.amazonaws.services.servermigration.model.DisassociateConnectorRequest request]
    (-> this (.disassociateConnector request))))

(defn delete-app
  "Deletes an existing application. Optionally deletes the launched stack associated with the application and all
   AWS SMS replication jobs for servers in the application.

  request - `com.amazonaws.services.servermigration.model.DeleteAppRequest`

  returns: Result of the DeleteApp operation returned by the service. - `com.amazonaws.services.servermigration.model.DeleteAppResult`

  throws: com.amazonaws.services.servermigration.model.UnauthorizedOperationException - You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are using the correct access keys."
  (^com.amazonaws.services.servermigration.model.DeleteAppResult [^AWSServerMigrationClient this ^com.amazonaws.services.servermigration.model.DeleteAppRequest request]
    (-> this (.deleteApp request))))

(defn get-app
  "Retrieve information about an application.

  request - `com.amazonaws.services.servermigration.model.GetAppRequest`

  returns: Result of the GetApp operation returned by the service. - `com.amazonaws.services.servermigration.model.GetAppResult`

  throws: com.amazonaws.services.servermigration.model.UnauthorizedOperationException - You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are using the correct access keys."
  (^com.amazonaws.services.servermigration.model.GetAppResult [^AWSServerMigrationClient this ^com.amazonaws.services.servermigration.model.GetAppRequest request]
    (-> this (.getApp request))))

(defn get-replication-runs
  "Describes the replication runs for the specified replication job.

  request - `com.amazonaws.services.servermigration.model.GetReplicationRunsRequest`

  returns: Result of the GetReplicationRuns operation returned by the service. - `com.amazonaws.services.servermigration.model.GetReplicationRunsResult`

  throws: com.amazonaws.services.servermigration.model.InvalidParameterException - A specified parameter is not valid."
  (^com.amazonaws.services.servermigration.model.GetReplicationRunsResult [^AWSServerMigrationClient this ^com.amazonaws.services.servermigration.model.GetReplicationRunsRequest request]
    (-> this (.getReplicationRuns request))))

(defn put-app-replication-configuration
  "Creates or updates a replication configuration for an application.

  request - `com.amazonaws.services.servermigration.model.PutAppReplicationConfigurationRequest`

  returns: Result of the PutAppReplicationConfiguration operation returned by the service. - `com.amazonaws.services.servermigration.model.PutAppReplicationConfigurationResult`

  throws: com.amazonaws.services.servermigration.model.UnauthorizedOperationException - You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are using the correct access keys."
  (^com.amazonaws.services.servermigration.model.PutAppReplicationConfigurationResult [^AWSServerMigrationClient this ^com.amazonaws.services.servermigration.model.PutAppReplicationConfigurationRequest request]
    (-> this (.putAppReplicationConfiguration request))))

(defn get-app-launch-configuration
  "Retrieves the application launch configuration associated with an application.

  request - `com.amazonaws.services.servermigration.model.GetAppLaunchConfigurationRequest`

  returns: Result of the GetAppLaunchConfiguration operation returned by the service. - `com.amazonaws.services.servermigration.model.GetAppLaunchConfigurationResult`

  throws: com.amazonaws.services.servermigration.model.UnauthorizedOperationException - You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are using the correct access keys."
  (^com.amazonaws.services.servermigration.model.GetAppLaunchConfigurationResult [^AWSServerMigrationClient this ^com.amazonaws.services.servermigration.model.GetAppLaunchConfigurationRequest request]
    (-> this (.getAppLaunchConfiguration request))))

(defn generate-template
  "Generates an Amazon CloudFormation template based on the current launch configuration and writes it to an Amazon
   S3 object in the customer’s Amazon S3 bucket.

  request - `com.amazonaws.services.servermigration.model.GenerateTemplateRequest`

  returns: Result of the GenerateTemplate operation returned by the service. - `com.amazonaws.services.servermigration.model.GenerateTemplateResult`

  throws: com.amazonaws.services.servermigration.model.UnauthorizedOperationException - You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are using the correct access keys."
  (^com.amazonaws.services.servermigration.model.GenerateTemplateResult [^AWSServerMigrationClient this ^com.amazonaws.services.servermigration.model.GenerateTemplateRequest request]
    (-> this (.generateTemplate request))))

(defn delete-app-replication-configuration
  "Deletes existing replication configuration for an application.

  request - `com.amazonaws.services.servermigration.model.DeleteAppReplicationConfigurationRequest`

  returns: Result of the DeleteAppReplicationConfiguration operation returned by the service. - `com.amazonaws.services.servermigration.model.DeleteAppReplicationConfigurationResult`

  throws: com.amazonaws.services.servermigration.model.UnauthorizedOperationException - You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are using the correct access keys."
  (^com.amazonaws.services.servermigration.model.DeleteAppReplicationConfigurationResult [^AWSServerMigrationClient this ^com.amazonaws.services.servermigration.model.DeleteAppReplicationConfigurationRequest request]
    (-> this (.deleteAppReplicationConfiguration request))))

(defn get-connectors
  "Describes the connectors registered with the AWS SMS.

  request - `com.amazonaws.services.servermigration.model.GetConnectorsRequest`

  returns: Result of the GetConnectors operation returned by the service. - `com.amazonaws.services.servermigration.model.GetConnectorsResult`

  throws: com.amazonaws.services.servermigration.model.UnauthorizedOperationException - You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are using the correct access keys."
  (^com.amazonaws.services.servermigration.model.GetConnectorsResult [^AWSServerMigrationClient this ^com.amazonaws.services.servermigration.model.GetConnectorsRequest request]
    (-> this (.getConnectors request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSServerMigrationClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn import-server-catalog
  "Gathers a complete list of on-premises servers. Connectors must be installed and monitoring all servers that you
   want to import.


   This call returns immediately, but might take additional time to retrieve all the servers.

  request - `com.amazonaws.services.servermigration.model.ImportServerCatalogRequest`

  returns: Result of the ImportServerCatalog operation returned by the service. - `com.amazonaws.services.servermigration.model.ImportServerCatalogResult`

  throws: com.amazonaws.services.servermigration.model.UnauthorizedOperationException - You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are using the correct access keys."
  (^com.amazonaws.services.servermigration.model.ImportServerCatalogResult [^AWSServerMigrationClient this ^com.amazonaws.services.servermigration.model.ImportServerCatalogRequest request]
    (-> this (.importServerCatalog request))))

(defn start-on-demand-replication-run
  "Starts an on-demand replication run for the specified replication job. This replication run starts immediately.
   This replication run is in addition to the ones already scheduled.


   There is a limit on the number of on-demand replications runs you can request in a 24-hour period.

  request - `com.amazonaws.services.servermigration.model.StartOnDemandReplicationRunRequest`

  returns: Result of the StartOnDemandReplicationRun operation returned by the service. - `com.amazonaws.services.servermigration.model.StartOnDemandReplicationRunResult`

  throws: com.amazonaws.services.servermigration.model.InvalidParameterException - A specified parameter is not valid."
  (^com.amazonaws.services.servermigration.model.StartOnDemandReplicationRunResult [^AWSServerMigrationClient this ^com.amazonaws.services.servermigration.model.StartOnDemandReplicationRunRequest request]
    (-> this (.startOnDemandReplicationRun request))))

(defn update-app
  "Updates an application.

  request - `com.amazonaws.services.servermigration.model.UpdateAppRequest`

  returns: Result of the UpdateApp operation returned by the service. - `com.amazonaws.services.servermigration.model.UpdateAppResult`

  throws: com.amazonaws.services.servermigration.model.UnauthorizedOperationException - You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are using the correct access keys."
  (^com.amazonaws.services.servermigration.model.UpdateAppResult [^AWSServerMigrationClient this ^com.amazonaws.services.servermigration.model.UpdateAppRequest request]
    (-> this (.updateApp request))))

(defn create-replication-job
  "Creates a replication job. The replication job schedules periodic replication runs to replicate your server to
   AWS. Each replication run creates an Amazon Machine Image (AMI).

  request - `com.amazonaws.services.servermigration.model.CreateReplicationJobRequest`

  returns: Result of the CreateReplicationJob operation returned by the service. - `com.amazonaws.services.servermigration.model.CreateReplicationJobResult`

  throws: com.amazonaws.services.servermigration.model.ReplicationJobAlreadyExistsException - The specified replication job already exists."
  (^com.amazonaws.services.servermigration.model.CreateReplicationJobResult [^AWSServerMigrationClient this ^com.amazonaws.services.servermigration.model.CreateReplicationJobRequest request]
    (-> this (.createReplicationJob request))))

(defn delete-app-launch-configuration
  "Deletes existing launch configuration for an application.

  request - `com.amazonaws.services.servermigration.model.DeleteAppLaunchConfigurationRequest`

  returns: Result of the DeleteAppLaunchConfiguration operation returned by the service. - `com.amazonaws.services.servermigration.model.DeleteAppLaunchConfigurationResult`

  throws: com.amazonaws.services.servermigration.model.UnauthorizedOperationException - You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are using the correct access keys."
  (^com.amazonaws.services.servermigration.model.DeleteAppLaunchConfigurationResult [^AWSServerMigrationClient this ^com.amazonaws.services.servermigration.model.DeleteAppLaunchConfigurationRequest request]
    (-> this (.deleteAppLaunchConfiguration request))))

