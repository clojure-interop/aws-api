(ns com.amazonaws.services.opsworkscm.AWSOpsWorksCMClient
  "Client for accessing OpsWorksCM. All service calls made using this client are blocking, and will not return until the
  service call completes.

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
  (:import [com.amazonaws.services.opsworkscm AWSOpsWorksCMClient]))

(defn ->aws-ops-works-cm-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to OpsWorksCM (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AWSOpsWorksCMClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AWSOpsWorksCMClient aws-credentials-provider client-configuration request-metric-collector))
  (^AWSOpsWorksCMClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSOpsWorksCMClient aws-credentials client-configuration))
  (^AWSOpsWorksCMClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSOpsWorksCMClient client-configuration))
  (^AWSOpsWorksCMClient []
    (new AWSOpsWorksCMClient )))

(defn *builder
  "returns: `com.amazonaws.services.opsworkscm.AWSOpsWorksCMClientBuilder`"
  (^com.amazonaws.services.opsworkscm.AWSOpsWorksCMClientBuilder []
    (AWSOpsWorksCMClient/builder )))

(defn delete-server
  "Deletes the server and the underlying AWS CloudFormation stacks (including the server's EC2 instance). When you
   run this command, the server state is updated to DELETING. After the server is deleted, it is no
   longer returned by DescribeServer requests. If the AWS CloudFormation stack cannot be deleted, the
   server cannot be deleted.


   This operation is asynchronous.


   An InvalidStateException is thrown when a server deletion is already in progress. A
   ResourceNotFoundException is thrown when the server does not exist. A
   ValidationException is raised when parameters of the request are not valid.

  request - `com.amazonaws.services.opsworkscm.model.DeleteServerRequest`

  returns: Result of the DeleteServer operation returned by the service. - `com.amazonaws.services.opsworkscm.model.DeleteServerResult`

  throws: com.amazonaws.services.opsworkscm.model.InvalidStateException - The resource is in a state that does not allow you to perform a specified action."
  (^com.amazonaws.services.opsworkscm.model.DeleteServerResult [^AWSOpsWorksCMClient this ^com.amazonaws.services.opsworkscm.model.DeleteServerRequest request]
    (-> this (.deleteServer request))))

(defn waiters
  "returns: `com.amazonaws.services.opsworkscm.waiters.AWSOpsWorksCMWaiters`"
  (^com.amazonaws.services.opsworkscm.waiters.AWSOpsWorksCMWaiters [^AWSOpsWorksCMClient this]
    (-> this (.waiters))))

(defn describe-node-association-status
  "Returns the current status of an existing association or disassociation request.


   A ResourceNotFoundException is thrown when no recent association or disassociation request with the
   specified token is found, or when the server does not exist. A ValidationException is raised when
   parameters of the request are not valid.

  request - `com.amazonaws.services.opsworkscm.model.DescribeNodeAssociationStatusRequest`

  returns: Result of the DescribeNodeAssociationStatus operation returned by the service. - `com.amazonaws.services.opsworkscm.model.DescribeNodeAssociationStatusResult`

  throws: com.amazonaws.services.opsworkscm.model.ResourceNotFoundException - The requested resource does not exist, or access was denied."
  (^com.amazonaws.services.opsworkscm.model.DescribeNodeAssociationStatusResult [^AWSOpsWorksCMClient this ^com.amazonaws.services.opsworkscm.model.DescribeNodeAssociationStatusRequest request]
    (-> this (.describeNodeAssociationStatus request))))

(defn create-server
  "Creates and immedately starts a new server. The server is ready to use when it is in the HEALTHY
   state. By default, you can create a maximum of 10 servers.


   This operation is asynchronous.


   A LimitExceededException is thrown when you have created the maximum number of servers (10). A
   ResourceAlreadyExistsException is thrown when a server with the same name already exists in the
   account. A ResourceNotFoundException is thrown when you specify a backup ID that is not valid or is
   for a backup that does not exist. A ValidationException is thrown when parameters of the request are
   not valid.


   If you do not specify a security group by adding the SecurityGroupIds parameter, AWS OpsWorks
   creates a new security group.


   Chef Automate: The default security group opens the Chef server to the world on TCP port 443. If a KeyName
   is present, AWS OpsWorks enables SSH access. SSH is also open to the world on TCP port 22.


   Puppet Enterprise: The default security group opens TCP ports 22, 443, 4433, 8140, 8142, 8143, and 8170.
   If a KeyName is present, AWS OpsWorks enables SSH access. SSH is also open to the world on TCP port 22.


   By default, your server is accessible from any IP address. We recommend that you update your security group rules
   to allow access from known IP addresses and address ranges only. To edit security group rules, open Security
   Groups in the navigation pane of the EC2 management console.

  request - `com.amazonaws.services.opsworkscm.model.CreateServerRequest`

  returns: Result of the CreateServer operation returned by the service. - `com.amazonaws.services.opsworkscm.model.CreateServerResult`

  throws: com.amazonaws.services.opsworkscm.model.LimitExceededException - The limit of servers or backups has been reached."
  (^com.amazonaws.services.opsworkscm.model.CreateServerResult [^AWSOpsWorksCMClient this ^com.amazonaws.services.opsworkscm.model.CreateServerRequest request]
    (-> this (.createServer request))))

(defn describe-backups
  "Describes backups. The results are ordered by time, with newest backups first. If you do not specify a BackupId
   or ServerName, the command returns all backups.


   This operation is synchronous.


   A ResourceNotFoundException is thrown when the backup does not exist. A
   ValidationException is raised when parameters of the request are not valid.

  request - `com.amazonaws.services.opsworkscm.model.DescribeBackupsRequest`

  returns: Result of the DescribeBackups operation returned by the service. - `com.amazonaws.services.opsworkscm.model.DescribeBackupsResult`

  throws: com.amazonaws.services.opsworkscm.model.ValidationException - One or more of the provided request parameters are not valid."
  (^com.amazonaws.services.opsworkscm.model.DescribeBackupsResult [^AWSOpsWorksCMClient this ^com.amazonaws.services.opsworkscm.model.DescribeBackupsRequest request]
    (-> this (.describeBackups request))))

(defn delete-backup
  "Deletes a backup. You can delete both manual and automated backups. This operation is asynchronous.


   An InvalidStateException is thrown when a backup deletion is already in progress. A
   ResourceNotFoundException is thrown when the backup does not exist. A
   ValidationException is thrown when parameters of the request are not valid.

  request - `com.amazonaws.services.opsworkscm.model.DeleteBackupRequest`

  returns: Result of the DeleteBackup operation returned by the service. - `com.amazonaws.services.opsworkscm.model.DeleteBackupResult`

  throws: com.amazonaws.services.opsworkscm.model.InvalidStateException - The resource is in a state that does not allow you to perform a specified action."
  (^com.amazonaws.services.opsworkscm.model.DeleteBackupResult [^AWSOpsWorksCMClient this ^com.amazonaws.services.opsworkscm.model.DeleteBackupRequest request]
    (-> this (.deleteBackup request))))

(defn describe-account-attributes
  "Describes your OpsWorks-CM account attributes.


   This operation is synchronous.

  request - `com.amazonaws.services.opsworkscm.model.DescribeAccountAttributesRequest`

  returns: Result of the DescribeAccountAttributes operation returned by the service. - `com.amazonaws.services.opsworkscm.model.DescribeAccountAttributesResult`"
  (^com.amazonaws.services.opsworkscm.model.DescribeAccountAttributesResult [^AWSOpsWorksCMClient this ^com.amazonaws.services.opsworkscm.model.DescribeAccountAttributesRequest request]
    (-> this (.describeAccountAttributes request))))

(defn shutdown
  "Description copied from class: AmazonWebServiceClient"
  ([^AWSOpsWorksCMClient this]
    (-> this (.shutdown))))

(defn describe-events
  "Describes events for a specified server. Results are ordered by time, with newest events first.


   This operation is synchronous.


   A ResourceNotFoundException is thrown when the server does not exist. A
   ValidationException is raised when parameters of the request are not valid.

  request - `com.amazonaws.services.opsworkscm.model.DescribeEventsRequest`

  returns: Result of the DescribeEvents operation returned by the service. - `com.amazonaws.services.opsworkscm.model.DescribeEventsResult`

  throws: com.amazonaws.services.opsworkscm.model.ValidationException - One or more of the provided request parameters are not valid."
  (^com.amazonaws.services.opsworkscm.model.DescribeEventsResult [^AWSOpsWorksCMClient this ^com.amazonaws.services.opsworkscm.model.DescribeEventsRequest request]
    (-> this (.describeEvents request))))

(defn restore-server
  "Restores a backup to a server that is in a CONNECTION_LOST, HEALTHY,
   RUNNING, UNHEALTHY, or TERMINATED state. When you run RestoreServer, the
   server's EC2 instance is deleted, and a new EC2 instance is configured. RestoreServer maintains the existing
   server endpoint, so configuration management of the server's client devices (nodes) should continue to work.


   This operation is asynchronous.


   An InvalidStateException is thrown when the server is not in a valid state. A
   ResourceNotFoundException is thrown when the server does not exist. A
   ValidationException is raised when parameters of the request are not valid.

  request - `com.amazonaws.services.opsworkscm.model.RestoreServerRequest`

  returns: Result of the RestoreServer operation returned by the service. - `com.amazonaws.services.opsworkscm.model.RestoreServerResult`

  throws: com.amazonaws.services.opsworkscm.model.InvalidStateException - The resource is in a state that does not allow you to perform a specified action."
  (^com.amazonaws.services.opsworkscm.model.RestoreServerResult [^AWSOpsWorksCMClient this ^com.amazonaws.services.opsworkscm.model.RestoreServerRequest request]
    (-> this (.restoreServer request))))

(defn update-server
  "Updates settings for a server.


   This operation is synchronous.

  request - `com.amazonaws.services.opsworkscm.model.UpdateServerRequest`

  returns: Result of the UpdateServer operation returned by the service. - `com.amazonaws.services.opsworkscm.model.UpdateServerResult`

  throws: com.amazonaws.services.opsworkscm.model.InvalidStateException - The resource is in a state that does not allow you to perform a specified action."
  (^com.amazonaws.services.opsworkscm.model.UpdateServerResult [^AWSOpsWorksCMClient this ^com.amazonaws.services.opsworkscm.model.UpdateServerRequest request]
    (-> this (.updateServer request))))

(defn export-server-engine-attribute
  "Exports a specified server engine attribute as a base64-encoded string. For example, you can export user data
   that you can use in EC2 to associate nodes with a server.


   This operation is synchronous.


   A ValidationException is raised when parameters of the request are not valid. A
   ResourceNotFoundException is thrown when the server does not exist. An
   InvalidStateException is thrown when the server is in any of the following states: CREATING,
   TERMINATED, FAILED or DELETING.

  request - `com.amazonaws.services.opsworkscm.model.ExportServerEngineAttributeRequest`

  returns: Result of the ExportServerEngineAttribute operation returned by the service. - `com.amazonaws.services.opsworkscm.model.ExportServerEngineAttributeResult`

  throws: com.amazonaws.services.opsworkscm.model.ValidationException - One or more of the provided request parameters are not valid."
  (^com.amazonaws.services.opsworkscm.model.ExportServerEngineAttributeResult [^AWSOpsWorksCMClient this ^com.amazonaws.services.opsworkscm.model.ExportServerEngineAttributeRequest request]
    (-> this (.exportServerEngineAttribute request))))

(defn describe-servers
  "Lists all configuration management servers that are identified with your account. Only the stored results from
   Amazon DynamoDB are returned. AWS OpsWorks CM does not query other services.


   This operation is synchronous.


   A ResourceNotFoundException is thrown when the server does not exist. A
   ValidationException is raised when parameters of the request are not valid.

  request - `com.amazonaws.services.opsworkscm.model.DescribeServersRequest`

  returns: Result of the DescribeServers operation returned by the service. - `com.amazonaws.services.opsworkscm.model.DescribeServersResult`

  throws: com.amazonaws.services.opsworkscm.model.ValidationException - One or more of the provided request parameters are not valid."
  (^com.amazonaws.services.opsworkscm.model.DescribeServersResult [^AWSOpsWorksCMClient this ^com.amazonaws.services.opsworkscm.model.DescribeServersRequest request]
    (-> this (.describeServers request))))

(defn associate-node
  "Associates a new node with the server. For more information about how to disassociate a node, see
   DisassociateNode.


   On a Chef server: This command is an alternative to knife bootstrap.


   Example (Chef):
   aws opsworks-cm associate-node --server-name MyServer --node-name MyManagedNode --engine-attributes \"Name=CHEF_ORGANIZATION,Value=default\" \"Name=CHEF_NODE_PUBLIC_KEY,Value=public-key-pem\"


   On a Puppet server, this command is an alternative to the puppet cert sign command that signs a
   Puppet node CSR.


   Example (Chef):
   aws opsworks-cm associate-node --server-name MyServer --node-name MyManagedNode --engine-attributes \"Name=PUPPET_NODE_CSR,Value=csr-pem\"


   A node can can only be associated with servers that are in a HEALTHY state. Otherwise, an
   InvalidStateException is thrown. A ResourceNotFoundException is thrown when the server
   does not exist. A ValidationException is raised when parameters of the request are not valid. The
   AssociateNode API call can be integrated into Auto Scaling configurations, AWS Cloudformation templates, or the
   user data of a server's instance.

  request - `com.amazonaws.services.opsworkscm.model.AssociateNodeRequest`

  returns: Result of the AssociateNode operation returned by the service. - `com.amazonaws.services.opsworkscm.model.AssociateNodeResult`

  throws: com.amazonaws.services.opsworkscm.model.InvalidStateException - The resource is in a state that does not allow you to perform a specified action."
  (^com.amazonaws.services.opsworkscm.model.AssociateNodeResult [^AWSOpsWorksCMClient this ^com.amazonaws.services.opsworkscm.model.AssociateNodeRequest request]
    (-> this (.associateNode request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSOpsWorksCMClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn update-server-engine-attributes
  "Updates engine-specific attributes on a specified server. The server enters the MODIFYING state when
   this operation is in progress. Only one update can occur at a time. You can use this command to reset a Chef
   server's public key (CHEF_PIVOTAL_KEY) or a Puppet server's admin password (
   PUPPET_ADMIN_PASSWORD).


   This operation is asynchronous.


   This operation can only be called for servers in HEALTHY or UNHEALTHY states.
   Otherwise, an InvalidStateException is raised. A ResourceNotFoundException is thrown
   when the server does not exist. A ValidationException is raised when parameters of the request are
   not valid.

  request - `com.amazonaws.services.opsworkscm.model.UpdateServerEngineAttributesRequest`

  returns: Result of the UpdateServerEngineAttributes operation returned by the service. - `com.amazonaws.services.opsworkscm.model.UpdateServerEngineAttributesResult`

  throws: com.amazonaws.services.opsworkscm.model.InvalidStateException - The resource is in a state that does not allow you to perform a specified action."
  (^com.amazonaws.services.opsworkscm.model.UpdateServerEngineAttributesResult [^AWSOpsWorksCMClient this ^com.amazonaws.services.opsworkscm.model.UpdateServerEngineAttributesRequest request]
    (-> this (.updateServerEngineAttributes request))))

(defn disassociate-node
  "Disassociates a node from an AWS OpsWorks CM server, and removes the node from the server's managed nodes. After
   a node is disassociated, the node key pair is no longer valid for accessing the configuration manager's API. For
   more information about how to associate a node, see AssociateNode.


   A node can can only be disassociated from a server that is in a HEALTHY state. Otherwise, an
   InvalidStateException is thrown. A ResourceNotFoundException is thrown when the server
   does not exist. A ValidationException is raised when parameters of the request are not valid.

  request - `com.amazonaws.services.opsworkscm.model.DisassociateNodeRequest`

  returns: Result of the DisassociateNode operation returned by the service. - `com.amazonaws.services.opsworkscm.model.DisassociateNodeResult`

  throws: com.amazonaws.services.opsworkscm.model.InvalidStateException - The resource is in a state that does not allow you to perform a specified action."
  (^com.amazonaws.services.opsworkscm.model.DisassociateNodeResult [^AWSOpsWorksCMClient this ^com.amazonaws.services.opsworkscm.model.DisassociateNodeRequest request]
    (-> this (.disassociateNode request))))

(defn start-maintenance
  "Manually starts server maintenance. This command can be useful if an earlier maintenance attempt failed, and the
   underlying cause of maintenance failure has been resolved. The server is in an UNDER_MAINTENANCE
   state while maintenance is in progress.


   Maintenance can only be started on servers in HEALTHY and UNHEALTHY states. Otherwise,
   an InvalidStateException is thrown. A ResourceNotFoundException is thrown when the
   server does not exist. A ValidationException is raised when parameters of the request are not valid.

  request - `com.amazonaws.services.opsworkscm.model.StartMaintenanceRequest`

  returns: Result of the StartMaintenance operation returned by the service. - `com.amazonaws.services.opsworkscm.model.StartMaintenanceResult`

  throws: com.amazonaws.services.opsworkscm.model.InvalidStateException - The resource is in a state that does not allow you to perform a specified action."
  (^com.amazonaws.services.opsworkscm.model.StartMaintenanceResult [^AWSOpsWorksCMClient this ^com.amazonaws.services.opsworkscm.model.StartMaintenanceRequest request]
    (-> this (.startMaintenance request))))

(defn create-backup
  "Creates an application-level backup of a server. While the server is in the BACKING_UP state, the
   server cannot be changed, and no additional backup can be created.


   Backups can be created for servers in RUNNING, HEALTHY, and UNHEALTHY
   states. By default, you can create a maximum of 50 manual backups.


   This operation is asynchronous.


   A LimitExceededException is thrown when the maximum number of manual backups is reached. An
   InvalidStateException is thrown when the server is not in any of the following states: RUNNING,
   HEALTHY, or UNHEALTHY. A ResourceNotFoundException is thrown when the server is not found. A
   ValidationException is thrown when parameters of the request are not valid.

  request - `com.amazonaws.services.opsworkscm.model.CreateBackupRequest`

  returns: Result of the CreateBackup operation returned by the service. - `com.amazonaws.services.opsworkscm.model.CreateBackupResult`

  throws: com.amazonaws.services.opsworkscm.model.InvalidStateException - The resource is in a state that does not allow you to perform a specified action."
  (^com.amazonaws.services.opsworkscm.model.CreateBackupResult [^AWSOpsWorksCMClient this ^com.amazonaws.services.opsworkscm.model.CreateBackupRequest request]
    (-> this (.createBackup request))))

