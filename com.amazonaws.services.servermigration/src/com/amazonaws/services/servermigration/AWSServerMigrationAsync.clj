(ns com.amazonaws.services.servermigration.AWSServerMigrationAsync
  "Interface for accessing SMS asynchronously. Each asynchronous method will return a Java Future object representing
  the asynchronous operation; overloads which accept an AsyncHandler can be used to receive notification when
  an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSServerMigrationAsync instead.


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
  (:import [com.amazonaws.services.servermigration AWSServerMigrationAsync]))

(defn get-app-async
  "Retrieve information about an application.

  get-app-request - `com.amazonaws.services.servermigration.model.GetAppRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetApp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.GetAppResult>`"
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.GetAppRequest get-app-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAppAsync get-app-request async-handler)))
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.GetAppRequest get-app-request]
    (-> this (.getAppAsync get-app-request))))

(defn disassociate-connector-async
  "Disassociates the specified connector from AWS SMS.


   After you disassociate a connector, it is no longer available to support replication jobs.

  disassociate-connector-request - `com.amazonaws.services.servermigration.model.DisassociateConnectorRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateConnector operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.DisassociateConnectorResult>`"
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.DisassociateConnectorRequest disassociate-connector-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateConnectorAsync disassociate-connector-request async-handler)))
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.DisassociateConnectorRequest disassociate-connector-request]
    (-> this (.disassociateConnectorAsync disassociate-connector-request))))

(defn create-replication-job-async
  "Creates a replication job. The replication job schedules periodic replication runs to replicate your server to
   AWS. Each replication run creates an Amazon Machine Image (AMI).

  create-replication-job-request - `com.amazonaws.services.servermigration.model.CreateReplicationJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateReplicationJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.CreateReplicationJobResult>`"
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.CreateReplicationJobRequest create-replication-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createReplicationJobAsync create-replication-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.CreateReplicationJobRequest create-replication-job-request]
    (-> this (.createReplicationJobAsync create-replication-job-request))))

(defn generate-change-set-async
  "Generates a target change set for a currently launched stack and writes it to an Amazon S3 object in the
   customer’s Amazon S3 bucket.

  generate-change-set-request - `com.amazonaws.services.servermigration.model.GenerateChangeSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GenerateChangeSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.GenerateChangeSetResult>`"
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.GenerateChangeSetRequest generate-change-set-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.generateChangeSetAsync generate-change-set-request async-handler)))
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.GenerateChangeSetRequest generate-change-set-request]
    (-> this (.generateChangeSetAsync generate-change-set-request))))

(defn delete-server-catalog-async
  "Deletes all servers from your server catalog.

  delete-server-catalog-request - `com.amazonaws.services.servermigration.model.DeleteServerCatalogRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteServerCatalog operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.DeleteServerCatalogResult>`"
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.DeleteServerCatalogRequest delete-server-catalog-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteServerCatalogAsync delete-server-catalog-request async-handler)))
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.DeleteServerCatalogRequest delete-server-catalog-request]
    (-> this (.deleteServerCatalogAsync delete-server-catalog-request))))

(defn delete-app-async
  "Deletes an existing application. Optionally deletes the launched stack associated with the application and all
   AWS SMS replication jobs for servers in the application.

  delete-app-request - `com.amazonaws.services.servermigration.model.DeleteAppRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.DeleteAppResult>`"
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.DeleteAppRequest delete-app-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAppAsync delete-app-request async-handler)))
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.DeleteAppRequest delete-app-request]
    (-> this (.deleteAppAsync delete-app-request))))

(defn update-replication-job-async
  "Updates the specified settings for the specified replication job.

  update-replication-job-request - `com.amazonaws.services.servermigration.model.UpdateReplicationJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateReplicationJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.UpdateReplicationJobResult>`"
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.UpdateReplicationJobRequest update-replication-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateReplicationJobAsync update-replication-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.UpdateReplicationJobRequest update-replication-job-request]
    (-> this (.updateReplicationJobAsync update-replication-job-request))))

(defn update-app-async
  "Updates an application.

  update-app-request - `com.amazonaws.services.servermigration.model.UpdateAppRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateApp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.UpdateAppResult>`"
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.UpdateAppRequest update-app-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAppAsync update-app-request async-handler)))
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.UpdateAppRequest update-app-request]
    (-> this (.updateAppAsync update-app-request))))

(defn get-replication-jobs-async
  "Describes the specified replication job or all of your replication jobs.

  get-replication-jobs-request - `com.amazonaws.services.servermigration.model.GetReplicationJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetReplicationJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.GetReplicationJobsResult>`"
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.GetReplicationJobsRequest get-replication-jobs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getReplicationJobsAsync get-replication-jobs-request async-handler)))
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.GetReplicationJobsRequest get-replication-jobs-request]
    (-> this (.getReplicationJobsAsync get-replication-jobs-request))))

(defn delete-app-replication-configuration-async
  "Deletes existing replication configuration for an application.

  delete-app-replication-configuration-request - `com.amazonaws.services.servermigration.model.DeleteAppReplicationConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAppReplicationConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.DeleteAppReplicationConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.DeleteAppReplicationConfigurationRequest delete-app-replication-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAppReplicationConfigurationAsync delete-app-replication-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.DeleteAppReplicationConfigurationRequest delete-app-replication-configuration-request]
    (-> this (.deleteAppReplicationConfigurationAsync delete-app-replication-configuration-request))))

(defn delete-app-launch-configuration-async
  "Deletes existing launch configuration for an application.

  delete-app-launch-configuration-request - `com.amazonaws.services.servermigration.model.DeleteAppLaunchConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAppLaunchConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.DeleteAppLaunchConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.DeleteAppLaunchConfigurationRequest delete-app-launch-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAppLaunchConfigurationAsync delete-app-launch-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.DeleteAppLaunchConfigurationRequest delete-app-launch-configuration-request]
    (-> this (.deleteAppLaunchConfigurationAsync delete-app-launch-configuration-request))))

(defn list-apps-async
  "Returns a list of summaries for all applications.

  list-apps-request - `com.amazonaws.services.servermigration.model.ListAppsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListApps operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.ListAppsResult>`"
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.ListAppsRequest list-apps-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAppsAsync list-apps-request async-handler)))
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.ListAppsRequest list-apps-request]
    (-> this (.listAppsAsync list-apps-request))))

(defn launch-app-async
  "Launches an application stack.

  launch-app-request - `com.amazonaws.services.servermigration.model.LaunchAppRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the LaunchApp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.LaunchAppResult>`"
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.LaunchAppRequest launch-app-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.launchAppAsync launch-app-request async-handler)))
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.LaunchAppRequest launch-app-request]
    (-> this (.launchAppAsync launch-app-request))))

(defn generate-template-async
  "Generates an Amazon CloudFormation template based on the current launch configuration and writes it to an Amazon
   S3 object in the customer’s Amazon S3 bucket.

  generate-template-request - `com.amazonaws.services.servermigration.model.GenerateTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GenerateTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.GenerateTemplateResult>`"
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.GenerateTemplateRequest generate-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.generateTemplateAsync generate-template-request async-handler)))
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.GenerateTemplateRequest generate-template-request]
    (-> this (.generateTemplateAsync generate-template-request))))

(defn terminate-app-async
  "Terminates the stack for an application.

  terminate-app-request - `com.amazonaws.services.servermigration.model.TerminateAppRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TerminateApp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.TerminateAppResult>`"
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.TerminateAppRequest terminate-app-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.terminateAppAsync terminate-app-request async-handler)))
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.TerminateAppRequest terminate-app-request]
    (-> this (.terminateAppAsync terminate-app-request))))

(defn put-app-replication-configuration-async
  "Creates or updates a replication configuration for an application.

  put-app-replication-configuration-request - `com.amazonaws.services.servermigration.model.PutAppReplicationConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutAppReplicationConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.PutAppReplicationConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.PutAppReplicationConfigurationRequest put-app-replication-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putAppReplicationConfigurationAsync put-app-replication-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.PutAppReplicationConfigurationRequest put-app-replication-configuration-request]
    (-> this (.putAppReplicationConfigurationAsync put-app-replication-configuration-request))))

(defn put-app-launch-configuration-async
  "Creates a launch configuration for an application.

  put-app-launch-configuration-request - `com.amazonaws.services.servermigration.model.PutAppLaunchConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutAppLaunchConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.PutAppLaunchConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.PutAppLaunchConfigurationRequest put-app-launch-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putAppLaunchConfigurationAsync put-app-launch-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.PutAppLaunchConfigurationRequest put-app-launch-configuration-request]
    (-> this (.putAppLaunchConfigurationAsync put-app-launch-configuration-request))))

(defn get-app-launch-configuration-async
  "Retrieves the application launch configuration associated with an application.

  get-app-launch-configuration-request - `com.amazonaws.services.servermigration.model.GetAppLaunchConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAppLaunchConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.GetAppLaunchConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.GetAppLaunchConfigurationRequest get-app-launch-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAppLaunchConfigurationAsync get-app-launch-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.GetAppLaunchConfigurationRequest get-app-launch-configuration-request]
    (-> this (.getAppLaunchConfigurationAsync get-app-launch-configuration-request))))

(defn start-app-replication-async
  "Starts replicating an application.

  start-app-replication-request - `com.amazonaws.services.servermigration.model.StartAppReplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartAppReplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.StartAppReplicationResult>`"
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.StartAppReplicationRequest start-app-replication-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startAppReplicationAsync start-app-replication-request async-handler)))
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.StartAppReplicationRequest start-app-replication-request]
    (-> this (.startAppReplicationAsync start-app-replication-request))))

(defn get-replication-runs-async
  "Describes the replication runs for the specified replication job.

  get-replication-runs-request - `com.amazonaws.services.servermigration.model.GetReplicationRunsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetReplicationRuns operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.GetReplicationRunsResult>`"
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.GetReplicationRunsRequest get-replication-runs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getReplicationRunsAsync get-replication-runs-request async-handler)))
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.GetReplicationRunsRequest get-replication-runs-request]
    (-> this (.getReplicationRunsAsync get-replication-runs-request))))

(defn start-on-demand-replication-run-async
  "Starts an on-demand replication run for the specified replication job. This replication run starts immediately.
   This replication run is in addition to the ones already scheduled.


   There is a limit on the number of on-demand replications runs you can request in a 24-hour period.

  start-on-demand-replication-run-request - `com.amazonaws.services.servermigration.model.StartOnDemandReplicationRunRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartOnDemandReplicationRun operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.StartOnDemandReplicationRunResult>`"
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.StartOnDemandReplicationRunRequest start-on-demand-replication-run-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startOnDemandReplicationRunAsync start-on-demand-replication-run-request async-handler)))
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.StartOnDemandReplicationRunRequest start-on-demand-replication-run-request]
    (-> this (.startOnDemandReplicationRunAsync start-on-demand-replication-run-request))))

(defn get-servers-async
  "Describes the servers in your server catalog.


   Before you can describe your servers, you must import them using ImportServerCatalog.

  get-servers-request - `com.amazonaws.services.servermigration.model.GetServersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetServers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.GetServersResult>`"
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.GetServersRequest get-servers-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getServersAsync get-servers-request async-handler)))
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.GetServersRequest get-servers-request]
    (-> this (.getServersAsync get-servers-request))))

(defn delete-replication-job-async
  "Deletes the specified replication job.


   After you delete a replication job, there are no further replication runs. AWS deletes the contents of the Amazon
   S3 bucket used to store AWS SMS artifacts. The AMIs created by the replication runs are not deleted.

  delete-replication-job-request - `com.amazonaws.services.servermigration.model.DeleteReplicationJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteReplicationJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.DeleteReplicationJobResult>`"
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.DeleteReplicationJobRequest delete-replication-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteReplicationJobAsync delete-replication-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.DeleteReplicationJobRequest delete-replication-job-request]
    (-> this (.deleteReplicationJobAsync delete-replication-job-request))))

(defn get-app-replication-configuration-async
  "Retrieves an application replication configuration associatd with an application.

  get-app-replication-configuration-request - `com.amazonaws.services.servermigration.model.GetAppReplicationConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAppReplicationConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.GetAppReplicationConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.GetAppReplicationConfigurationRequest get-app-replication-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAppReplicationConfigurationAsync get-app-replication-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.GetAppReplicationConfigurationRequest get-app-replication-configuration-request]
    (-> this (.getAppReplicationConfigurationAsync get-app-replication-configuration-request))))

(defn stop-app-replication-async
  "Stops replicating an application.

  stop-app-replication-request - `com.amazonaws.services.servermigration.model.StopAppReplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopAppReplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.StopAppReplicationResult>`"
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.StopAppReplicationRequest stop-app-replication-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopAppReplicationAsync stop-app-replication-request async-handler)))
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.StopAppReplicationRequest stop-app-replication-request]
    (-> this (.stopAppReplicationAsync stop-app-replication-request))))

(defn import-server-catalog-async
  "Gathers a complete list of on-premises servers. Connectors must be installed and monitoring all servers that you
   want to import.


   This call returns immediately, but might take additional time to retrieve all the servers.

  import-server-catalog-request - `com.amazonaws.services.servermigration.model.ImportServerCatalogRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ImportServerCatalog operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.ImportServerCatalogResult>`"
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.ImportServerCatalogRequest import-server-catalog-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.importServerCatalogAsync import-server-catalog-request async-handler)))
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.ImportServerCatalogRequest import-server-catalog-request]
    (-> this (.importServerCatalogAsync import-server-catalog-request))))

(defn create-app-async
  "Creates an application. An application consists of one or more server groups. Each server group contain one or
   more servers.

  create-app-request - `com.amazonaws.services.servermigration.model.CreateAppRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateApp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.CreateAppResult>`"
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.CreateAppRequest create-app-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAppAsync create-app-request async-handler)))
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.CreateAppRequest create-app-request]
    (-> this (.createAppAsync create-app-request))))

(defn get-connectors-async
  "Describes the connectors registered with the AWS SMS.

  get-connectors-request - `com.amazonaws.services.servermigration.model.GetConnectorsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetConnectors operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servermigration.model.GetConnectorsResult>`"
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.GetConnectorsRequest get-connectors-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getConnectorsAsync get-connectors-request async-handler)))
  (^java.util.concurrent.Future [^AWSServerMigrationAsync this ^com.amazonaws.services.servermigration.model.GetConnectorsRequest get-connectors-request]
    (-> this (.getConnectorsAsync get-connectors-request))))

