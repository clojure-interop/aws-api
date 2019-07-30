(ns com.amazonaws.services.servermigration.AWSServerMigration
  "Interface for accessing SMS.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSServerMigration instead.


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
  (:import [com.amazonaws.services.servermigration AWSServerMigration]))

(defn create-app
  "Creates an application. An application consists of one or more server groups. Each server group contain one or
   more servers.

  create-app-request - `com.amazonaws.services.servermigration.model.CreateAppRequest`

  returns: Result of the CreateApp operation returned by the service. - `com.amazonaws.services.servermigration.model.CreateAppResult`

  throws: com.amazonaws.services.servermigration.model.UnauthorizedOperationException - You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are using the correct access keys."
  (^com.amazonaws.services.servermigration.model.CreateAppResult [^AWSServerMigration this ^com.amazonaws.services.servermigration.model.CreateAppRequest create-app-request]
    (-> this (.createApp create-app-request))))

(defn get-app-replication-configuration
  "Retrieves an application replication configuration associatd with an application.

  get-app-replication-configuration-request - `com.amazonaws.services.servermigration.model.GetAppReplicationConfigurationRequest`

  returns: Result of the GetAppReplicationConfiguration operation returned by the service. - `com.amazonaws.services.servermigration.model.GetAppReplicationConfigurationResult`

  throws: com.amazonaws.services.servermigration.model.UnauthorizedOperationException - You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are using the correct access keys."
  (^com.amazonaws.services.servermigration.model.GetAppReplicationConfigurationResult [^AWSServerMigration this ^com.amazonaws.services.servermigration.model.GetAppReplicationConfigurationRequest get-app-replication-configuration-request]
    (-> this (.getAppReplicationConfiguration get-app-replication-configuration-request))))

(defn delete-replication-job
  "Deletes the specified replication job.


   After you delete a replication job, there are no further replication runs. AWS deletes the contents of the Amazon
   S3 bucket used to store AWS SMS artifacts. The AMIs created by the replication runs are not deleted.

  delete-replication-job-request - `com.amazonaws.services.servermigration.model.DeleteReplicationJobRequest`

  returns: Result of the DeleteReplicationJob operation returned by the service. - `com.amazonaws.services.servermigration.model.DeleteReplicationJobResult`

  throws: com.amazonaws.services.servermigration.model.InvalidParameterException - A specified parameter is not valid."
  (^com.amazonaws.services.servermigration.model.DeleteReplicationJobResult [^AWSServerMigration this ^com.amazonaws.services.servermigration.model.DeleteReplicationJobRequest delete-replication-job-request]
    (-> this (.deleteReplicationJob delete-replication-job-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AWSServerMigration this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn get-servers
  "Describes the servers in your server catalog.


   Before you can describe your servers, you must import them using ImportServerCatalog.

  get-servers-request - `com.amazonaws.services.servermigration.model.GetServersRequest`

  returns: Result of the GetServers operation returned by the service. - `com.amazonaws.services.servermigration.model.GetServersResult`

  throws: com.amazonaws.services.servermigration.model.UnauthorizedOperationException - You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are using the correct access keys."
  (^com.amazonaws.services.servermigration.model.GetServersResult [^AWSServerMigration this ^com.amazonaws.services.servermigration.model.GetServersRequest get-servers-request]
    (-> this (.getServers get-servers-request))))

(defn start-app-replication
  "Starts replicating an application.

  start-app-replication-request - `com.amazonaws.services.servermigration.model.StartAppReplicationRequest`

  returns: Result of the StartAppReplication operation returned by the service. - `com.amazonaws.services.servermigration.model.StartAppReplicationResult`

  throws: com.amazonaws.services.servermigration.model.UnauthorizedOperationException - You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are using the correct access keys."
  (^com.amazonaws.services.servermigration.model.StartAppReplicationResult [^AWSServerMigration this ^com.amazonaws.services.servermigration.model.StartAppReplicationRequest start-app-replication-request]
    (-> this (.startAppReplication start-app-replication-request))))

(defn list-apps
  "Returns a list of summaries for all applications.

  list-apps-request - `com.amazonaws.services.servermigration.model.ListAppsRequest`

  returns: Result of the ListApps operation returned by the service. - `com.amazonaws.services.servermigration.model.ListAppsResult`

  throws: com.amazonaws.services.servermigration.model.UnauthorizedOperationException - You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are using the correct access keys."
  (^com.amazonaws.services.servermigration.model.ListAppsResult [^AWSServerMigration this ^com.amazonaws.services.servermigration.model.ListAppsRequest list-apps-request]
    (-> this (.listApps list-apps-request))))

(defn delete-server-catalog
  "Deletes all servers from your server catalog.

  delete-server-catalog-request - `com.amazonaws.services.servermigration.model.DeleteServerCatalogRequest`

  returns: Result of the DeleteServerCatalog operation returned by the service. - `com.amazonaws.services.servermigration.model.DeleteServerCatalogResult`

  throws: com.amazonaws.services.servermigration.model.UnauthorizedOperationException - You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are using the correct access keys."
  (^com.amazonaws.services.servermigration.model.DeleteServerCatalogResult [^AWSServerMigration this ^com.amazonaws.services.servermigration.model.DeleteServerCatalogRequest delete-server-catalog-request]
    (-> this (.deleteServerCatalog delete-server-catalog-request))))

(defn put-app-launch-configuration
  "Creates a launch configuration for an application.

  put-app-launch-configuration-request - `com.amazonaws.services.servermigration.model.PutAppLaunchConfigurationRequest`

  returns: Result of the PutAppLaunchConfiguration operation returned by the service. - `com.amazonaws.services.servermigration.model.PutAppLaunchConfigurationResult`

  throws: com.amazonaws.services.servermigration.model.UnauthorizedOperationException - You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are using the correct access keys."
  (^com.amazonaws.services.servermigration.model.PutAppLaunchConfigurationResult [^AWSServerMigration this ^com.amazonaws.services.servermigration.model.PutAppLaunchConfigurationRequest put-app-launch-configuration-request]
    (-> this (.putAppLaunchConfiguration put-app-launch-configuration-request))))

(defn launch-app
  "Launches an application stack.

  launch-app-request - `com.amazonaws.services.servermigration.model.LaunchAppRequest`

  returns: Result of the LaunchApp operation returned by the service. - `com.amazonaws.services.servermigration.model.LaunchAppResult`

  throws: com.amazonaws.services.servermigration.model.UnauthorizedOperationException - You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are using the correct access keys."
  (^com.amazonaws.services.servermigration.model.LaunchAppResult [^AWSServerMigration this ^com.amazonaws.services.servermigration.model.LaunchAppRequest launch-app-request]
    (-> this (.launchApp launch-app-request))))

(defn get-replication-jobs
  "Describes the specified replication job or all of your replication jobs.

  get-replication-jobs-request - `com.amazonaws.services.servermigration.model.GetReplicationJobsRequest`

  returns: Result of the GetReplicationJobs operation returned by the service. - `com.amazonaws.services.servermigration.model.GetReplicationJobsResult`

  throws: com.amazonaws.services.servermigration.model.InvalidParameterException - A specified parameter is not valid."
  (^com.amazonaws.services.servermigration.model.GetReplicationJobsResult [^AWSServerMigration this ^com.amazonaws.services.servermigration.model.GetReplicationJobsRequest get-replication-jobs-request]
    (-> this (.getReplicationJobs get-replication-jobs-request))))

(defn stop-app-replication
  "Stops replicating an application.

  stop-app-replication-request - `com.amazonaws.services.servermigration.model.StopAppReplicationRequest`

  returns: Result of the StopAppReplication operation returned by the service. - `com.amazonaws.services.servermigration.model.StopAppReplicationResult`

  throws: com.amazonaws.services.servermigration.model.UnauthorizedOperationException - You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are using the correct access keys."
  (^com.amazonaws.services.servermigration.model.StopAppReplicationResult [^AWSServerMigration this ^com.amazonaws.services.servermigration.model.StopAppReplicationRequest stop-app-replication-request]
    (-> this (.stopAppReplication stop-app-replication-request))))

(defn generate-change-set
  "Generates a target change set for a currently launched stack and writes it to an Amazon S3 object in the
   customer’s Amazon S3 bucket.

  generate-change-set-request - `com.amazonaws.services.servermigration.model.GenerateChangeSetRequest`

  returns: Result of the GenerateChangeSet operation returned by the service. - `com.amazonaws.services.servermigration.model.GenerateChangeSetResult`

  throws: com.amazonaws.services.servermigration.model.UnauthorizedOperationException - You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are using the correct access keys."
  (^com.amazonaws.services.servermigration.model.GenerateChangeSetResult [^AWSServerMigration this ^com.amazonaws.services.servermigration.model.GenerateChangeSetRequest generate-change-set-request]
    (-> this (.generateChangeSet generate-change-set-request))))

(defn terminate-app
  "Terminates the stack for an application.

  terminate-app-request - `com.amazonaws.services.servermigration.model.TerminateAppRequest`

  returns: Result of the TerminateApp operation returned by the service. - `com.amazonaws.services.servermigration.model.TerminateAppResult`

  throws: com.amazonaws.services.servermigration.model.UnauthorizedOperationException - You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are using the correct access keys."
  (^com.amazonaws.services.servermigration.model.TerminateAppResult [^AWSServerMigration this ^com.amazonaws.services.servermigration.model.TerminateAppRequest terminate-app-request]
    (-> this (.terminateApp terminate-app-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSServerMigration this]
    (-> this (.shutdown))))

(defn update-replication-job
  "Updates the specified settings for the specified replication job.

  update-replication-job-request - `com.amazonaws.services.servermigration.model.UpdateReplicationJobRequest`

  returns: Result of the UpdateReplicationJob operation returned by the service. - `com.amazonaws.services.servermigration.model.UpdateReplicationJobResult`

  throws: com.amazonaws.services.servermigration.model.InvalidParameterException - A specified parameter is not valid."
  (^com.amazonaws.services.servermigration.model.UpdateReplicationJobResult [^AWSServerMigration this ^com.amazonaws.services.servermigration.model.UpdateReplicationJobRequest update-replication-job-request]
    (-> this (.updateReplicationJob update-replication-job-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"sms.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"sms.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AWSServerMigration this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn disassociate-connector
  "Disassociates the specified connector from AWS SMS.


   After you disassociate a connector, it is no longer available to support replication jobs.

  disassociate-connector-request - `com.amazonaws.services.servermigration.model.DisassociateConnectorRequest`

  returns: Result of the DisassociateConnector operation returned by the service. - `com.amazonaws.services.servermigration.model.DisassociateConnectorResult`

  throws: com.amazonaws.services.servermigration.model.MissingRequiredParameterException - A required parameter is missing."
  (^com.amazonaws.services.servermigration.model.DisassociateConnectorResult [^AWSServerMigration this ^com.amazonaws.services.servermigration.model.DisassociateConnectorRequest disassociate-connector-request]
    (-> this (.disassociateConnector disassociate-connector-request))))

(defn delete-app
  "Deletes an existing application. Optionally deletes the launched stack associated with the application and all
   AWS SMS replication jobs for servers in the application.

  delete-app-request - `com.amazonaws.services.servermigration.model.DeleteAppRequest`

  returns: Result of the DeleteApp operation returned by the service. - `com.amazonaws.services.servermigration.model.DeleteAppResult`

  throws: com.amazonaws.services.servermigration.model.UnauthorizedOperationException - You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are using the correct access keys."
  (^com.amazonaws.services.servermigration.model.DeleteAppResult [^AWSServerMigration this ^com.amazonaws.services.servermigration.model.DeleteAppRequest delete-app-request]
    (-> this (.deleteApp delete-app-request))))

(defn get-app
  "Retrieve information about an application.

  get-app-request - `com.amazonaws.services.servermigration.model.GetAppRequest`

  returns: Result of the GetApp operation returned by the service. - `com.amazonaws.services.servermigration.model.GetAppResult`

  throws: com.amazonaws.services.servermigration.model.UnauthorizedOperationException - You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are using the correct access keys."
  (^com.amazonaws.services.servermigration.model.GetAppResult [^AWSServerMigration this ^com.amazonaws.services.servermigration.model.GetAppRequest get-app-request]
    (-> this (.getApp get-app-request))))

(defn get-replication-runs
  "Describes the replication runs for the specified replication job.

  get-replication-runs-request - `com.amazonaws.services.servermigration.model.GetReplicationRunsRequest`

  returns: Result of the GetReplicationRuns operation returned by the service. - `com.amazonaws.services.servermigration.model.GetReplicationRunsResult`

  throws: com.amazonaws.services.servermigration.model.InvalidParameterException - A specified parameter is not valid."
  (^com.amazonaws.services.servermigration.model.GetReplicationRunsResult [^AWSServerMigration this ^com.amazonaws.services.servermigration.model.GetReplicationRunsRequest get-replication-runs-request]
    (-> this (.getReplicationRuns get-replication-runs-request))))

(defn put-app-replication-configuration
  "Creates or updates a replication configuration for an application.

  put-app-replication-configuration-request - `com.amazonaws.services.servermigration.model.PutAppReplicationConfigurationRequest`

  returns: Result of the PutAppReplicationConfiguration operation returned by the service. - `com.amazonaws.services.servermigration.model.PutAppReplicationConfigurationResult`

  throws: com.amazonaws.services.servermigration.model.UnauthorizedOperationException - You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are using the correct access keys."
  (^com.amazonaws.services.servermigration.model.PutAppReplicationConfigurationResult [^AWSServerMigration this ^com.amazonaws.services.servermigration.model.PutAppReplicationConfigurationRequest put-app-replication-configuration-request]
    (-> this (.putAppReplicationConfiguration put-app-replication-configuration-request))))

(defn get-app-launch-configuration
  "Retrieves the application launch configuration associated with an application.

  get-app-launch-configuration-request - `com.amazonaws.services.servermigration.model.GetAppLaunchConfigurationRequest`

  returns: Result of the GetAppLaunchConfiguration operation returned by the service. - `com.amazonaws.services.servermigration.model.GetAppLaunchConfigurationResult`

  throws: com.amazonaws.services.servermigration.model.UnauthorizedOperationException - You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are using the correct access keys."
  (^com.amazonaws.services.servermigration.model.GetAppLaunchConfigurationResult [^AWSServerMigration this ^com.amazonaws.services.servermigration.model.GetAppLaunchConfigurationRequest get-app-launch-configuration-request]
    (-> this (.getAppLaunchConfiguration get-app-launch-configuration-request))))

(defn generate-template
  "Generates an Amazon CloudFormation template based on the current launch configuration and writes it to an Amazon
   S3 object in the customer’s Amazon S3 bucket.

  generate-template-request - `com.amazonaws.services.servermigration.model.GenerateTemplateRequest`

  returns: Result of the GenerateTemplate operation returned by the service. - `com.amazonaws.services.servermigration.model.GenerateTemplateResult`

  throws: com.amazonaws.services.servermigration.model.UnauthorizedOperationException - You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are using the correct access keys."
  (^com.amazonaws.services.servermigration.model.GenerateTemplateResult [^AWSServerMigration this ^com.amazonaws.services.servermigration.model.GenerateTemplateRequest generate-template-request]
    (-> this (.generateTemplate generate-template-request))))

(defn delete-app-replication-configuration
  "Deletes existing replication configuration for an application.

  delete-app-replication-configuration-request - `com.amazonaws.services.servermigration.model.DeleteAppReplicationConfigurationRequest`

  returns: Result of the DeleteAppReplicationConfiguration operation returned by the service. - `com.amazonaws.services.servermigration.model.DeleteAppReplicationConfigurationResult`

  throws: com.amazonaws.services.servermigration.model.UnauthorizedOperationException - You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are using the correct access keys."
  (^com.amazonaws.services.servermigration.model.DeleteAppReplicationConfigurationResult [^AWSServerMigration this ^com.amazonaws.services.servermigration.model.DeleteAppReplicationConfigurationRequest delete-app-replication-configuration-request]
    (-> this (.deleteAppReplicationConfiguration delete-app-replication-configuration-request))))

(defn get-connectors
  "Describes the connectors registered with the AWS SMS.

  get-connectors-request - `com.amazonaws.services.servermigration.model.GetConnectorsRequest`

  returns: Result of the GetConnectors operation returned by the service. - `com.amazonaws.services.servermigration.model.GetConnectorsResult`

  throws: com.amazonaws.services.servermigration.model.UnauthorizedOperationException - You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are using the correct access keys."
  (^com.amazonaws.services.servermigration.model.GetConnectorsResult [^AWSServerMigration this ^com.amazonaws.services.servermigration.model.GetConnectorsRequest get-connectors-request]
    (-> this (.getConnectors get-connectors-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSServerMigration this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn import-server-catalog
  "Gathers a complete list of on-premises servers. Connectors must be installed and monitoring all servers that you
   want to import.


   This call returns immediately, but might take additional time to retrieve all the servers.

  import-server-catalog-request - `com.amazonaws.services.servermigration.model.ImportServerCatalogRequest`

  returns: Result of the ImportServerCatalog operation returned by the service. - `com.amazonaws.services.servermigration.model.ImportServerCatalogResult`

  throws: com.amazonaws.services.servermigration.model.UnauthorizedOperationException - You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are using the correct access keys."
  (^com.amazonaws.services.servermigration.model.ImportServerCatalogResult [^AWSServerMigration this ^com.amazonaws.services.servermigration.model.ImportServerCatalogRequest import-server-catalog-request]
    (-> this (.importServerCatalog import-server-catalog-request))))

(defn start-on-demand-replication-run
  "Starts an on-demand replication run for the specified replication job. This replication run starts immediately.
   This replication run is in addition to the ones already scheduled.


   There is a limit on the number of on-demand replications runs you can request in a 24-hour period.

  start-on-demand-replication-run-request - `com.amazonaws.services.servermigration.model.StartOnDemandReplicationRunRequest`

  returns: Result of the StartOnDemandReplicationRun operation returned by the service. - `com.amazonaws.services.servermigration.model.StartOnDemandReplicationRunResult`

  throws: com.amazonaws.services.servermigration.model.InvalidParameterException - A specified parameter is not valid."
  (^com.amazonaws.services.servermigration.model.StartOnDemandReplicationRunResult [^AWSServerMigration this ^com.amazonaws.services.servermigration.model.StartOnDemandReplicationRunRequest start-on-demand-replication-run-request]
    (-> this (.startOnDemandReplicationRun start-on-demand-replication-run-request))))

(defn update-app
  "Updates an application.

  update-app-request - `com.amazonaws.services.servermigration.model.UpdateAppRequest`

  returns: Result of the UpdateApp operation returned by the service. - `com.amazonaws.services.servermigration.model.UpdateAppResult`

  throws: com.amazonaws.services.servermigration.model.UnauthorizedOperationException - You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are using the correct access keys."
  (^com.amazonaws.services.servermigration.model.UpdateAppResult [^AWSServerMigration this ^com.amazonaws.services.servermigration.model.UpdateAppRequest update-app-request]
    (-> this (.updateApp update-app-request))))

(defn create-replication-job
  "Creates a replication job. The replication job schedules periodic replication runs to replicate your server to
   AWS. Each replication run creates an Amazon Machine Image (AMI).

  create-replication-job-request - `com.amazonaws.services.servermigration.model.CreateReplicationJobRequest`

  returns: Result of the CreateReplicationJob operation returned by the service. - `com.amazonaws.services.servermigration.model.CreateReplicationJobResult`

  throws: com.amazonaws.services.servermigration.model.ReplicationJobAlreadyExistsException - The specified replication job already exists."
  (^com.amazonaws.services.servermigration.model.CreateReplicationJobResult [^AWSServerMigration this ^com.amazonaws.services.servermigration.model.CreateReplicationJobRequest create-replication-job-request]
    (-> this (.createReplicationJob create-replication-job-request))))

(defn delete-app-launch-configuration
  "Deletes existing launch configuration for an application.

  delete-app-launch-configuration-request - `com.amazonaws.services.servermigration.model.DeleteAppLaunchConfigurationRequest`

  returns: Result of the DeleteAppLaunchConfiguration operation returned by the service. - `com.amazonaws.services.servermigration.model.DeleteAppLaunchConfigurationResult`

  throws: com.amazonaws.services.servermigration.model.UnauthorizedOperationException - You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are using the correct access keys."
  (^com.amazonaws.services.servermigration.model.DeleteAppLaunchConfigurationResult [^AWSServerMigration this ^com.amazonaws.services.servermigration.model.DeleteAppLaunchConfigurationRequest delete-app-launch-configuration-request]
    (-> this (.deleteAppLaunchConfiguration delete-app-launch-configuration-request))))

