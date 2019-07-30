(ns com.amazonaws.services.opsworkscm.AWSOpsWorksCM
  "Interface for accessing OpsWorksCM.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSOpsWorksCM instead.


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
  (:import [com.amazonaws.services.opsworkscm AWSOpsWorksCM]))

(defn delete-server
  "Deletes the server and the underlying AWS CloudFormation stacks (including the server's EC2 instance). When you
   run this command, the server state is updated to DELETING. After the server is deleted, it is no
   longer returned by DescribeServer requests. If the AWS CloudFormation stack cannot be deleted, the
   server cannot be deleted.


   This operation is asynchronous.


   An InvalidStateException is thrown when a server deletion is already in progress. A
   ResourceNotFoundException is thrown when the server does not exist. A
   ValidationException is raised when parameters of the request are not valid.

  delete-server-request - `com.amazonaws.services.opsworkscm.model.DeleteServerRequest`

  returns: Result of the DeleteServer operation returned by the service. - `com.amazonaws.services.opsworkscm.model.DeleteServerResult`

  throws: com.amazonaws.services.opsworkscm.model.InvalidStateException - The resource is in a state that does not allow you to perform a specified action."
  (^com.amazonaws.services.opsworkscm.model.DeleteServerResult [^AWSOpsWorksCM this ^com.amazonaws.services.opsworkscm.model.DeleteServerRequest delete-server-request]
    (-> this (.deleteServer delete-server-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AWSOpsWorksCM this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn waiters
  "returns: `com.amazonaws.services.opsworkscm.waiters.AWSOpsWorksCMWaiters`"
  (^com.amazonaws.services.opsworkscm.waiters.AWSOpsWorksCMWaiters [^AWSOpsWorksCM this]
    (-> this (.waiters))))

(defn describe-node-association-status
  "Returns the current status of an existing association or disassociation request.


   A ResourceNotFoundException is thrown when no recent association or disassociation request with the
   specified token is found, or when the server does not exist. A ValidationException is raised when
   parameters of the request are not valid.

  describe-node-association-status-request - `com.amazonaws.services.opsworkscm.model.DescribeNodeAssociationStatusRequest`

  returns: Result of the DescribeNodeAssociationStatus operation returned by the service. - `com.amazonaws.services.opsworkscm.model.DescribeNodeAssociationStatusResult`

  throws: com.amazonaws.services.opsworkscm.model.ResourceNotFoundException - The requested resource does not exist, or access was denied."
  (^com.amazonaws.services.opsworkscm.model.DescribeNodeAssociationStatusResult [^AWSOpsWorksCM this ^com.amazonaws.services.opsworkscm.model.DescribeNodeAssociationStatusRequest describe-node-association-status-request]
    (-> this (.describeNodeAssociationStatus describe-node-association-status-request))))

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

  create-server-request - `com.amazonaws.services.opsworkscm.model.CreateServerRequest`

  returns: Result of the CreateServer operation returned by the service. - `com.amazonaws.services.opsworkscm.model.CreateServerResult`

  throws: com.amazonaws.services.opsworkscm.model.LimitExceededException - The limit of servers or backups has been reached."
  (^com.amazonaws.services.opsworkscm.model.CreateServerResult [^AWSOpsWorksCM this ^com.amazonaws.services.opsworkscm.model.CreateServerRequest create-server-request]
    (-> this (.createServer create-server-request))))

(defn describe-backups
  "Describes backups. The results are ordered by time, with newest backups first. If you do not specify a BackupId
   or ServerName, the command returns all backups.


   This operation is synchronous.


   A ResourceNotFoundException is thrown when the backup does not exist. A
   ValidationException is raised when parameters of the request are not valid.

  describe-backups-request - `com.amazonaws.services.opsworkscm.model.DescribeBackupsRequest`

  returns: Result of the DescribeBackups operation returned by the service. - `com.amazonaws.services.opsworkscm.model.DescribeBackupsResult`

  throws: com.amazonaws.services.opsworkscm.model.ValidationException - One or more of the provided request parameters are not valid."
  (^com.amazonaws.services.opsworkscm.model.DescribeBackupsResult [^AWSOpsWorksCM this ^com.amazonaws.services.opsworkscm.model.DescribeBackupsRequest describe-backups-request]
    (-> this (.describeBackups describe-backups-request))))

(defn delete-backup
  "Deletes a backup. You can delete both manual and automated backups. This operation is asynchronous.


   An InvalidStateException is thrown when a backup deletion is already in progress. A
   ResourceNotFoundException is thrown when the backup does not exist. A
   ValidationException is thrown when parameters of the request are not valid.

  delete-backup-request - `com.amazonaws.services.opsworkscm.model.DeleteBackupRequest`

  returns: Result of the DeleteBackup operation returned by the service. - `com.amazonaws.services.opsworkscm.model.DeleteBackupResult`

  throws: com.amazonaws.services.opsworkscm.model.InvalidStateException - The resource is in a state that does not allow you to perform a specified action."
  (^com.amazonaws.services.opsworkscm.model.DeleteBackupResult [^AWSOpsWorksCM this ^com.amazonaws.services.opsworkscm.model.DeleteBackupRequest delete-backup-request]
    (-> this (.deleteBackup delete-backup-request))))

(defn describe-account-attributes
  "Describes your OpsWorks-CM account attributes.


   This operation is synchronous.

  describe-account-attributes-request - `com.amazonaws.services.opsworkscm.model.DescribeAccountAttributesRequest`

  returns: Result of the DescribeAccountAttributes operation returned by the service. - `com.amazonaws.services.opsworkscm.model.DescribeAccountAttributesResult`"
  (^com.amazonaws.services.opsworkscm.model.DescribeAccountAttributesResult [^AWSOpsWorksCM this ^com.amazonaws.services.opsworkscm.model.DescribeAccountAttributesRequest describe-account-attributes-request]
    (-> this (.describeAccountAttributes describe-account-attributes-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSOpsWorksCM this]
    (-> this (.shutdown))))

(defn describe-events
  "Describes events for a specified server. Results are ordered by time, with newest events first.


   This operation is synchronous.


   A ResourceNotFoundException is thrown when the server does not exist. A
   ValidationException is raised when parameters of the request are not valid.

  describe-events-request - `com.amazonaws.services.opsworkscm.model.DescribeEventsRequest`

  returns: Result of the DescribeEvents operation returned by the service. - `com.amazonaws.services.opsworkscm.model.DescribeEventsResult`

  throws: com.amazonaws.services.opsworkscm.model.ValidationException - One or more of the provided request parameters are not valid."
  (^com.amazonaws.services.opsworkscm.model.DescribeEventsResult [^AWSOpsWorksCM this ^com.amazonaws.services.opsworkscm.model.DescribeEventsRequest describe-events-request]
    (-> this (.describeEvents describe-events-request))))

(defn restore-server
  "Restores a backup to a server that is in a CONNECTION_LOST, HEALTHY,
   RUNNING, UNHEALTHY, or TERMINATED state. When you run RestoreServer, the
   server's EC2 instance is deleted, and a new EC2 instance is configured. RestoreServer maintains the existing
   server endpoint, so configuration management of the server's client devices (nodes) should continue to work.


   This operation is asynchronous.


   An InvalidStateException is thrown when the server is not in a valid state. A
   ResourceNotFoundException is thrown when the server does not exist. A
   ValidationException is raised when parameters of the request are not valid.

  restore-server-request - `com.amazonaws.services.opsworkscm.model.RestoreServerRequest`

  returns: Result of the RestoreServer operation returned by the service. - `com.amazonaws.services.opsworkscm.model.RestoreServerResult`

  throws: com.amazonaws.services.opsworkscm.model.InvalidStateException - The resource is in a state that does not allow you to perform a specified action."
  (^com.amazonaws.services.opsworkscm.model.RestoreServerResult [^AWSOpsWorksCM this ^com.amazonaws.services.opsworkscm.model.RestoreServerRequest restore-server-request]
    (-> this (.restoreServer restore-server-request))))

(defn update-server
  "Updates settings for a server.


   This operation is synchronous.

  update-server-request - `com.amazonaws.services.opsworkscm.model.UpdateServerRequest`

  returns: Result of the UpdateServer operation returned by the service. - `com.amazonaws.services.opsworkscm.model.UpdateServerResult`

  throws: com.amazonaws.services.opsworkscm.model.InvalidStateException - The resource is in a state that does not allow you to perform a specified action."
  (^com.amazonaws.services.opsworkscm.model.UpdateServerResult [^AWSOpsWorksCM this ^com.amazonaws.services.opsworkscm.model.UpdateServerRequest update-server-request]
    (-> this (.updateServer update-server-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"opsworks-cm.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"opsworks-cm.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AWSOpsWorksCM this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn export-server-engine-attribute
  "Exports a specified server engine attribute as a base64-encoded string. For example, you can export user data
   that you can use in EC2 to associate nodes with a server.


   This operation is synchronous.


   A ValidationException is raised when parameters of the request are not valid. A
   ResourceNotFoundException is thrown when the server does not exist. An
   InvalidStateException is thrown when the server is in any of the following states: CREATING,
   TERMINATED, FAILED or DELETING.

  export-server-engine-attribute-request - `com.amazonaws.services.opsworkscm.model.ExportServerEngineAttributeRequest`

  returns: Result of the ExportServerEngineAttribute operation returned by the service. - `com.amazonaws.services.opsworkscm.model.ExportServerEngineAttributeResult`

  throws: com.amazonaws.services.opsworkscm.model.ValidationException - One or more of the provided request parameters are not valid."
  (^com.amazonaws.services.opsworkscm.model.ExportServerEngineAttributeResult [^AWSOpsWorksCM this ^com.amazonaws.services.opsworkscm.model.ExportServerEngineAttributeRequest export-server-engine-attribute-request]
    (-> this (.exportServerEngineAttribute export-server-engine-attribute-request))))

(defn describe-servers
  "Lists all configuration management servers that are identified with your account. Only the stored results from
   Amazon DynamoDB are returned. AWS OpsWorks CM does not query other services.


   This operation is synchronous.


   A ResourceNotFoundException is thrown when the server does not exist. A
   ValidationException is raised when parameters of the request are not valid.

  describe-servers-request - `com.amazonaws.services.opsworkscm.model.DescribeServersRequest`

  returns: Result of the DescribeServers operation returned by the service. - `com.amazonaws.services.opsworkscm.model.DescribeServersResult`

  throws: com.amazonaws.services.opsworkscm.model.ValidationException - One or more of the provided request parameters are not valid."
  (^com.amazonaws.services.opsworkscm.model.DescribeServersResult [^AWSOpsWorksCM this ^com.amazonaws.services.opsworkscm.model.DescribeServersRequest describe-servers-request]
    (-> this (.describeServers describe-servers-request))))

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

  associate-node-request - `com.amazonaws.services.opsworkscm.model.AssociateNodeRequest`

  returns: Result of the AssociateNode operation returned by the service. - `com.amazonaws.services.opsworkscm.model.AssociateNodeResult`

  throws: com.amazonaws.services.opsworkscm.model.InvalidStateException - The resource is in a state that does not allow you to perform a specified action."
  (^com.amazonaws.services.opsworkscm.model.AssociateNodeResult [^AWSOpsWorksCM this ^com.amazonaws.services.opsworkscm.model.AssociateNodeRequest associate-node-request]
    (-> this (.associateNode associate-node-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSOpsWorksCM this ^com.amazonaws.AmazonWebServiceRequest request]
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

  update-server-engine-attributes-request - `com.amazonaws.services.opsworkscm.model.UpdateServerEngineAttributesRequest`

  returns: Result of the UpdateServerEngineAttributes operation returned by the service. - `com.amazonaws.services.opsworkscm.model.UpdateServerEngineAttributesResult`

  throws: com.amazonaws.services.opsworkscm.model.InvalidStateException - The resource is in a state that does not allow you to perform a specified action."
  (^com.amazonaws.services.opsworkscm.model.UpdateServerEngineAttributesResult [^AWSOpsWorksCM this ^com.amazonaws.services.opsworkscm.model.UpdateServerEngineAttributesRequest update-server-engine-attributes-request]
    (-> this (.updateServerEngineAttributes update-server-engine-attributes-request))))

(defn disassociate-node
  "Disassociates a node from an AWS OpsWorks CM server, and removes the node from the server's managed nodes. After
   a node is disassociated, the node key pair is no longer valid for accessing the configuration manager's API. For
   more information about how to associate a node, see AssociateNode.


   A node can can only be disassociated from a server that is in a HEALTHY state. Otherwise, an
   InvalidStateException is thrown. A ResourceNotFoundException is thrown when the server
   does not exist. A ValidationException is raised when parameters of the request are not valid.

  disassociate-node-request - `com.amazonaws.services.opsworkscm.model.DisassociateNodeRequest`

  returns: Result of the DisassociateNode operation returned by the service. - `com.amazonaws.services.opsworkscm.model.DisassociateNodeResult`

  throws: com.amazonaws.services.opsworkscm.model.InvalidStateException - The resource is in a state that does not allow you to perform a specified action."
  (^com.amazonaws.services.opsworkscm.model.DisassociateNodeResult [^AWSOpsWorksCM this ^com.amazonaws.services.opsworkscm.model.DisassociateNodeRequest disassociate-node-request]
    (-> this (.disassociateNode disassociate-node-request))))

(defn start-maintenance
  "Manually starts server maintenance. This command can be useful if an earlier maintenance attempt failed, and the
   underlying cause of maintenance failure has been resolved. The server is in an UNDER_MAINTENANCE
   state while maintenance is in progress.


   Maintenance can only be started on servers in HEALTHY and UNHEALTHY states. Otherwise,
   an InvalidStateException is thrown. A ResourceNotFoundException is thrown when the
   server does not exist. A ValidationException is raised when parameters of the request are not valid.

  start-maintenance-request - `com.amazonaws.services.opsworkscm.model.StartMaintenanceRequest`

  returns: Result of the StartMaintenance operation returned by the service. - `com.amazonaws.services.opsworkscm.model.StartMaintenanceResult`

  throws: com.amazonaws.services.opsworkscm.model.InvalidStateException - The resource is in a state that does not allow you to perform a specified action."
  (^com.amazonaws.services.opsworkscm.model.StartMaintenanceResult [^AWSOpsWorksCM this ^com.amazonaws.services.opsworkscm.model.StartMaintenanceRequest start-maintenance-request]
    (-> this (.startMaintenance start-maintenance-request))))

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

  create-backup-request - `com.amazonaws.services.opsworkscm.model.CreateBackupRequest`

  returns: Result of the CreateBackup operation returned by the service. - `com.amazonaws.services.opsworkscm.model.CreateBackupResult`

  throws: com.amazonaws.services.opsworkscm.model.InvalidStateException - The resource is in a state that does not allow you to perform a specified action."
  (^com.amazonaws.services.opsworkscm.model.CreateBackupResult [^AWSOpsWorksCM this ^com.amazonaws.services.opsworkscm.model.CreateBackupRequest create-backup-request]
    (-> this (.createBackup create-backup-request))))

