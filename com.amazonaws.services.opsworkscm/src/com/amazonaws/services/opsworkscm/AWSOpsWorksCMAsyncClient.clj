(ns com.amazonaws.services.opsworkscm.AWSOpsWorksCMAsyncClient
  "Client for accessing OpsWorksCM asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  AWS OpsWorks CM

  AWS OpsWorks for configuration management (CM) is a service that runs and manages configuration management servers.
  You can use AWS OpsWorks CM to create and manage AWS OpsWorks for Chef Automate and AWS OpsWorks for Puppet
  Enterprise servers, and add or remove nodes for the servers to manage.


  Glossary of terms




  Server: A configuration management server that can be highly-available. The configuration management server
  runs on an Amazon Elastic Compute Cloud (EC2) instance, and may use various other AWS services, such as Amazon
  Relational Database Service (RDS) and Elastic Load Balancing. A server is a generic abstraction over the
  configuration manager that you want to use, much like Amazon RDS. In AWS OpsWorks CM, you do not start or stop
  servers. After you create servers, they continue to run until they are deleted.




  Engine: The engine is the specific configuration manager that you want to use. Valid values in this release
  include ChefAutomate and Puppet.




  Backup: This is an application-level backup of the data that the configuration manager stores. AWS OpsWorks CM
  creates an S3 bucket for backups when you launch the first server. A backup maintains a snapshot of a server's
  configuration-related attributes at the time the backup starts.




  Events: Events are always related to a server. Events are written during server creation, when health checks
  run, when backups are created, when system maintenance is performed, etc. When you delete a server, the server's
  events are also deleted.




  Account attributes: Every account has attributes that are assigned in the AWS OpsWorks CM database. These
  attributes store information about configuration limits (servers, backups, etc.) and your customer account.




  Endpoints


  AWS OpsWorks CM supports the following endpoints, all HTTPS. You must connect to one of the following endpoints. Your
  servers can only be accessed or managed within the endpoint in which they are created.




  opsworks-cm.us-east-1.amazonaws.com




  opsworks-cm.us-east-2.amazonaws.com




  opsworks-cm.us-west-1.amazonaws.com




  opsworks-cm.us-west-2.amazonaws.com




  opsworks-cm.ap-northeast-1.amazonaws.com




  opsworks-cm.ap-southeast-1.amazonaws.com




  opsworks-cm.ap-southeast-2.amazonaws.com




  opsworks-cm.eu-central-1.amazonaws.com




  opsworks-cm.eu-west-1.amazonaws.com




  Throttling limits


  All API operations allow for five requests per second with a burst of 10 requests per second."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.opsworkscm AWSOpsWorksCMAsyncClient]))

(defn ->aws-ops-works-cm-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AWSOpsWorksCMAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AWSOpsWorksCMAsyncClient aws-credentials client-configuration executor-service))
  (^AWSOpsWorksCMAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AWSOpsWorksCMAsyncClient aws-credentials executor-service))
  (^AWSOpsWorksCMAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSOpsWorksCMAsyncClient client-configuration))
  (^AWSOpsWorksCMAsyncClient []
    (new AWSOpsWorksCMAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.opsworkscm.AWSOpsWorksCMAsyncClientBuilder`"
  (^com.amazonaws.services.opsworkscm.AWSOpsWorksCMAsyncClientBuilder []
    (AWSOpsWorksCMAsyncClient/asyncBuilder )))

(defn update-server-async
  "Description copied from interface: AWSOpsWorksCMAsync

  request - `com.amazonaws.services.opsworkscm.model.UpdateServerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateServer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.UpdateServerResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsyncClient this ^com.amazonaws.services.opsworkscm.model.UpdateServerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateServerAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsyncClient this ^com.amazonaws.services.opsworkscm.model.UpdateServerRequest request]
    (-> this (.updateServerAsync request))))

(defn describe-node-association-status-async
  "Description copied from interface: AWSOpsWorksCMAsync

  request - `com.amazonaws.services.opsworkscm.model.DescribeNodeAssociationStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeNodeAssociationStatus operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.DescribeNodeAssociationStatusResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsyncClient this ^com.amazonaws.services.opsworkscm.model.DescribeNodeAssociationStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeNodeAssociationStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsyncClient this ^com.amazonaws.services.opsworkscm.model.DescribeNodeAssociationStatusRequest request]
    (-> this (.describeNodeAssociationStatusAsync request))))

(defn disassociate-node-async
  "Description copied from interface: AWSOpsWorksCMAsync

  request - `com.amazonaws.services.opsworkscm.model.DisassociateNodeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateNode operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.DisassociateNodeResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsyncClient this ^com.amazonaws.services.opsworkscm.model.DisassociateNodeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateNodeAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsyncClient this ^com.amazonaws.services.opsworkscm.model.DisassociateNodeRequest request]
    (-> this (.disassociateNodeAsync request))))

(defn delete-server-async
  "Description copied from interface: AWSOpsWorksCMAsync

  request - `com.amazonaws.services.opsworkscm.model.DeleteServerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteServer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.DeleteServerResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsyncClient this ^com.amazonaws.services.opsworkscm.model.DeleteServerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteServerAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsyncClient this ^com.amazonaws.services.opsworkscm.model.DeleteServerRequest request]
    (-> this (.deleteServerAsync request))))

(defn describe-servers-async
  "Description copied from interface: AWSOpsWorksCMAsync

  request - `com.amazonaws.services.opsworkscm.model.DescribeServersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeServers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.DescribeServersResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsyncClient this ^com.amazonaws.services.opsworkscm.model.DescribeServersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeServersAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsyncClient this ^com.amazonaws.services.opsworkscm.model.DescribeServersRequest request]
    (-> this (.describeServersAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSOpsWorksCMAsyncClient this]
    (-> this (.getExecutorService))))

(defn associate-node-async
  "Description copied from interface: AWSOpsWorksCMAsync

  request - `com.amazonaws.services.opsworkscm.model.AssociateNodeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateNode operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.AssociateNodeResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsyncClient this ^com.amazonaws.services.opsworkscm.model.AssociateNodeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateNodeAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsyncClient this ^com.amazonaws.services.opsworkscm.model.AssociateNodeRequest request]
    (-> this (.associateNodeAsync request))))

(defn start-maintenance-async
  "Description copied from interface: AWSOpsWorksCMAsync

  request - `com.amazonaws.services.opsworkscm.model.StartMaintenanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartMaintenance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.StartMaintenanceResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsyncClient this ^com.amazonaws.services.opsworkscm.model.StartMaintenanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startMaintenanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsyncClient this ^com.amazonaws.services.opsworkscm.model.StartMaintenanceRequest request]
    (-> this (.startMaintenanceAsync request))))

(defn export-server-engine-attribute-async
  "Description copied from interface: AWSOpsWorksCMAsync

  request - `com.amazonaws.services.opsworkscm.model.ExportServerEngineAttributeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ExportServerEngineAttribute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.ExportServerEngineAttributeResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsyncClient this ^com.amazonaws.services.opsworkscm.model.ExportServerEngineAttributeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.exportServerEngineAttributeAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsyncClient this ^com.amazonaws.services.opsworkscm.model.ExportServerEngineAttributeRequest request]
    (-> this (.exportServerEngineAttributeAsync request))))

(defn restore-server-async
  "Description copied from interface: AWSOpsWorksCMAsync

  request - `com.amazonaws.services.opsworkscm.model.RestoreServerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestoreServer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.RestoreServerResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsyncClient this ^com.amazonaws.services.opsworkscm.model.RestoreServerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restoreServerAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsyncClient this ^com.amazonaws.services.opsworkscm.model.RestoreServerRequest request]
    (-> this (.restoreServerAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSOpsWorksCMAsyncClient this]
    (-> this (.shutdown))))

(defn update-server-engine-attributes-async
  "Description copied from interface: AWSOpsWorksCMAsync

  request - `com.amazonaws.services.opsworkscm.model.UpdateServerEngineAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateServerEngineAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.UpdateServerEngineAttributesResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsyncClient this ^com.amazonaws.services.opsworkscm.model.UpdateServerEngineAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateServerEngineAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsyncClient this ^com.amazonaws.services.opsworkscm.model.UpdateServerEngineAttributesRequest request]
    (-> this (.updateServerEngineAttributesAsync request))))

(defn create-backup-async
  "Description copied from interface: AWSOpsWorksCMAsync

  request - `com.amazonaws.services.opsworkscm.model.CreateBackupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateBackup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.CreateBackupResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsyncClient this ^com.amazonaws.services.opsworkscm.model.CreateBackupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createBackupAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsyncClient this ^com.amazonaws.services.opsworkscm.model.CreateBackupRequest request]
    (-> this (.createBackupAsync request))))

(defn create-server-async
  "Description copied from interface: AWSOpsWorksCMAsync

  request - `com.amazonaws.services.opsworkscm.model.CreateServerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateServer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.CreateServerResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsyncClient this ^com.amazonaws.services.opsworkscm.model.CreateServerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createServerAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsyncClient this ^com.amazonaws.services.opsworkscm.model.CreateServerRequest request]
    (-> this (.createServerAsync request))))

(defn describe-events-async
  "Description copied from interface: AWSOpsWorksCMAsync

  request - `com.amazonaws.services.opsworkscm.model.DescribeEventsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.DescribeEventsResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsyncClient this ^com.amazonaws.services.opsworkscm.model.DescribeEventsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsyncClient this ^com.amazonaws.services.opsworkscm.model.DescribeEventsRequest request]
    (-> this (.describeEventsAsync request))))

(defn delete-backup-async
  "Description copied from interface: AWSOpsWorksCMAsync

  request - `com.amazonaws.services.opsworkscm.model.DeleteBackupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBackup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.DeleteBackupResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsyncClient this ^com.amazonaws.services.opsworkscm.model.DeleteBackupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBackupAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsyncClient this ^com.amazonaws.services.opsworkscm.model.DeleteBackupRequest request]
    (-> this (.deleteBackupAsync request))))

(defn describe-account-attributes-async
  "Description copied from interface: AWSOpsWorksCMAsync

  request - `com.amazonaws.services.opsworkscm.model.DescribeAccountAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAccountAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.DescribeAccountAttributesResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsyncClient this ^com.amazonaws.services.opsworkscm.model.DescribeAccountAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAccountAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsyncClient this ^com.amazonaws.services.opsworkscm.model.DescribeAccountAttributesRequest request]
    (-> this (.describeAccountAttributesAsync request))))

(defn describe-backups-async
  "Description copied from interface: AWSOpsWorksCMAsync

  request - `com.amazonaws.services.opsworkscm.model.DescribeBackupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeBackups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.DescribeBackupsResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsyncClient this ^com.amazonaws.services.opsworkscm.model.DescribeBackupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeBackupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsyncClient this ^com.amazonaws.services.opsworkscm.model.DescribeBackupsRequest request]
    (-> this (.describeBackupsAsync request))))

