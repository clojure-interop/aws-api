(ns com.amazonaws.services.opsworkscm.AWSOpsWorksCMAsync
  "Interface for accessing OpsWorksCM asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSOpsWorksCMAsync instead.


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
  (:import [com.amazonaws.services.opsworkscm AWSOpsWorksCMAsync]))

(defn update-server-async
  "Updates settings for a server.


   This operation is synchronous.

  update-server-request - `com.amazonaws.services.opsworkscm.model.UpdateServerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateServer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.UpdateServerResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.UpdateServerRequest update-server-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateServerAsync update-server-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.UpdateServerRequest update-server-request]
    (-> this (.updateServerAsync update-server-request))))

(defn describe-node-association-status-async
  "Returns the current status of an existing association or disassociation request.


   A ResourceNotFoundException is thrown when no recent association or disassociation request with the
   specified token is found, or when the server does not exist. A ValidationException is raised when
   parameters of the request are not valid.

  describe-node-association-status-request - `com.amazonaws.services.opsworkscm.model.DescribeNodeAssociationStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeNodeAssociationStatus operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.DescribeNodeAssociationStatusResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.DescribeNodeAssociationStatusRequest describe-node-association-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeNodeAssociationStatusAsync describe-node-association-status-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.DescribeNodeAssociationStatusRequest describe-node-association-status-request]
    (-> this (.describeNodeAssociationStatusAsync describe-node-association-status-request))))

(defn disassociate-node-async
  "Disassociates a node from an AWS OpsWorks CM server, and removes the node from the server's managed nodes. After
   a node is disassociated, the node key pair is no longer valid for accessing the configuration manager's API. For
   more information about how to associate a node, see AssociateNode.


   A node can can only be disassociated from a server that is in a HEALTHY state. Otherwise, an
   InvalidStateException is thrown. A ResourceNotFoundException is thrown when the server
   does not exist. A ValidationException is raised when parameters of the request are not valid.

  disassociate-node-request - `com.amazonaws.services.opsworkscm.model.DisassociateNodeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateNode operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.DisassociateNodeResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.DisassociateNodeRequest disassociate-node-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateNodeAsync disassociate-node-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.DisassociateNodeRequest disassociate-node-request]
    (-> this (.disassociateNodeAsync disassociate-node-request))))

(defn delete-server-async
  "Deletes the server and the underlying AWS CloudFormation stacks (including the server's EC2 instance). When you
   run this command, the server state is updated to DELETING. After the server is deleted, it is no
   longer returned by DescribeServer requests. If the AWS CloudFormation stack cannot be deleted, the
   server cannot be deleted.


   This operation is asynchronous.


   An InvalidStateException is thrown when a server deletion is already in progress. A
   ResourceNotFoundException is thrown when the server does not exist. A
   ValidationException is raised when parameters of the request are not valid.

  delete-server-request - `com.amazonaws.services.opsworkscm.model.DeleteServerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteServer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.DeleteServerResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.DeleteServerRequest delete-server-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteServerAsync delete-server-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.DeleteServerRequest delete-server-request]
    (-> this (.deleteServerAsync delete-server-request))))

(defn describe-servers-async
  "Lists all configuration management servers that are identified with your account. Only the stored results from
   Amazon DynamoDB are returned. AWS OpsWorks CM does not query other services.


   This operation is synchronous.


   A ResourceNotFoundException is thrown when the server does not exist. A
   ValidationException is raised when parameters of the request are not valid.

  describe-servers-request - `com.amazonaws.services.opsworkscm.model.DescribeServersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeServers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.DescribeServersResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.DescribeServersRequest describe-servers-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeServersAsync describe-servers-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.DescribeServersRequest describe-servers-request]
    (-> this (.describeServersAsync describe-servers-request))))

(defn associate-node-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateNode operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.AssociateNodeResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.AssociateNodeRequest associate-node-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateNodeAsync associate-node-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.AssociateNodeRequest associate-node-request]
    (-> this (.associateNodeAsync associate-node-request))))

(defn start-maintenance-async
  "Manually starts server maintenance. This command can be useful if an earlier maintenance attempt failed, and the
   underlying cause of maintenance failure has been resolved. The server is in an UNDER_MAINTENANCE
   state while maintenance is in progress.


   Maintenance can only be started on servers in HEALTHY and UNHEALTHY states. Otherwise,
   an InvalidStateException is thrown. A ResourceNotFoundException is thrown when the
   server does not exist. A ValidationException is raised when parameters of the request are not valid.

  start-maintenance-request - `com.amazonaws.services.opsworkscm.model.StartMaintenanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartMaintenance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.StartMaintenanceResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.StartMaintenanceRequest start-maintenance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startMaintenanceAsync start-maintenance-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.StartMaintenanceRequest start-maintenance-request]
    (-> this (.startMaintenanceAsync start-maintenance-request))))

(defn export-server-engine-attribute-async
  "Exports a specified server engine attribute as a base64-encoded string. For example, you can export user data
   that you can use in EC2 to associate nodes with a server.


   This operation is synchronous.


   A ValidationException is raised when parameters of the request are not valid. A
   ResourceNotFoundException is thrown when the server does not exist. An
   InvalidStateException is thrown when the server is in any of the following states: CREATING,
   TERMINATED, FAILED or DELETING.

  export-server-engine-attribute-request - `com.amazonaws.services.opsworkscm.model.ExportServerEngineAttributeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ExportServerEngineAttribute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.ExportServerEngineAttributeResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.ExportServerEngineAttributeRequest export-server-engine-attribute-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.exportServerEngineAttributeAsync export-server-engine-attribute-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.ExportServerEngineAttributeRequest export-server-engine-attribute-request]
    (-> this (.exportServerEngineAttributeAsync export-server-engine-attribute-request))))

(defn restore-server-async
  "Restores a backup to a server that is in a CONNECTION_LOST, HEALTHY,
   RUNNING, UNHEALTHY, or TERMINATED state. When you run RestoreServer, the
   server's EC2 instance is deleted, and a new EC2 instance is configured. RestoreServer maintains the existing
   server endpoint, so configuration management of the server's client devices (nodes) should continue to work.


   This operation is asynchronous.


   An InvalidStateException is thrown when the server is not in a valid state. A
   ResourceNotFoundException is thrown when the server does not exist. A
   ValidationException is raised when parameters of the request are not valid.

  restore-server-request - `com.amazonaws.services.opsworkscm.model.RestoreServerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestoreServer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.RestoreServerResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.RestoreServerRequest restore-server-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restoreServerAsync restore-server-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.RestoreServerRequest restore-server-request]
    (-> this (.restoreServerAsync restore-server-request))))

(defn update-server-engine-attributes-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateServerEngineAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.UpdateServerEngineAttributesResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.UpdateServerEngineAttributesRequest update-server-engine-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateServerEngineAttributesAsync update-server-engine-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.UpdateServerEngineAttributesRequest update-server-engine-attributes-request]
    (-> this (.updateServerEngineAttributesAsync update-server-engine-attributes-request))))

(defn create-backup-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateBackup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.CreateBackupResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.CreateBackupRequest create-backup-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createBackupAsync create-backup-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.CreateBackupRequest create-backup-request]
    (-> this (.createBackupAsync create-backup-request))))

(defn create-server-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateServer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.CreateServerResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.CreateServerRequest create-server-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createServerAsync create-server-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.CreateServerRequest create-server-request]
    (-> this (.createServerAsync create-server-request))))

(defn describe-events-async
  "Describes events for a specified server. Results are ordered by time, with newest events first.


   This operation is synchronous.


   A ResourceNotFoundException is thrown when the server does not exist. A
   ValidationException is raised when parameters of the request are not valid.

  describe-events-request - `com.amazonaws.services.opsworkscm.model.DescribeEventsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.DescribeEventsResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.DescribeEventsRequest describe-events-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventsAsync describe-events-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.DescribeEventsRequest describe-events-request]
    (-> this (.describeEventsAsync describe-events-request))))

(defn delete-backup-async
  "Deletes a backup. You can delete both manual and automated backups. This operation is asynchronous.


   An InvalidStateException is thrown when a backup deletion is already in progress. A
   ResourceNotFoundException is thrown when the backup does not exist. A
   ValidationException is thrown when parameters of the request are not valid.

  delete-backup-request - `com.amazonaws.services.opsworkscm.model.DeleteBackupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBackup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.DeleteBackupResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.DeleteBackupRequest delete-backup-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBackupAsync delete-backup-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.DeleteBackupRequest delete-backup-request]
    (-> this (.deleteBackupAsync delete-backup-request))))

(defn describe-account-attributes-async
  "Describes your OpsWorks-CM account attributes.


   This operation is synchronous.

  describe-account-attributes-request - `com.amazonaws.services.opsworkscm.model.DescribeAccountAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAccountAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.DescribeAccountAttributesResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.DescribeAccountAttributesRequest describe-account-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAccountAttributesAsync describe-account-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.DescribeAccountAttributesRequest describe-account-attributes-request]
    (-> this (.describeAccountAttributesAsync describe-account-attributes-request))))

(defn describe-backups-async
  "Describes backups. The results are ordered by time, with newest backups first. If you do not specify a BackupId
   or ServerName, the command returns all backups.


   This operation is synchronous.


   A ResourceNotFoundException is thrown when the backup does not exist. A
   ValidationException is raised when parameters of the request are not valid.

  describe-backups-request - `com.amazonaws.services.opsworkscm.model.DescribeBackupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeBackups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.DescribeBackupsResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.DescribeBackupsRequest describe-backups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeBackupsAsync describe-backups-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.DescribeBackupsRequest describe-backups-request]
    (-> this (.describeBackupsAsync describe-backups-request))))

