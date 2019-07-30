(ns com.amazonaws.services.rds.AmazonRDSAsyncClient
  "Client for accessing Amazon RDS asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Amazon Relational Database Service



  Amazon Relational Database Service (Amazon RDS) is a web service that makes it easier to set up, operate, and scale a
  relational database in the cloud. It provides cost-efficient, resizable capacity for an industry-standard relational
  database and manages common database administration tasks, freeing up developers to focus on what makes their
  applications and businesses unique.


  Amazon RDS gives you access to the capabilities of a MySQL, MariaDB, PostgreSQL, Microsoft SQL Server, Oracle, or
  Amazon Aurora database server. These capabilities mean that the code, applications, and tools you already use today
  with your existing databases work with Amazon RDS without modification. Amazon RDS automatically backs up your
  database and maintains the database software that powers your DB instance. Amazon RDS is flexible: you can scale your
  DB instance's compute resources and storage capacity to meet your application's demand. As with all Amazon Web
  Services, there are no up-front investments, and you pay only for the resources you use.


  This interface reference for Amazon RDS contains documentation for a programming or command line interface you can
  use to manage Amazon RDS. Note that Amazon RDS is asynchronous, which means that some interfaces might require
  techniques such as polling or callback functions to determine when a command has been applied. In this reference, the
  parameter descriptions indicate whether a command is applied immediately, on the next instance reboot, or during the
  maintenance window. The reference structure is as follows, and we list following some related topics from the user
  guide.


  Amazon RDS API Reference




  For the alphabetical list of API actions, see API Actions.




  For the alphabetical list of data types, see Data Types.




  For a list of common query parameters, see Common Parameters.




  For descriptions of the error codes, see Common Errors.




  Amazon RDS User Guide




  For a summary of the Amazon RDS interfaces, see Available RDS
  Interfaces.




  For more information about how to use the Query API, see Using the Query API."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.rds AmazonRDSAsyncClient]))

(defn ->amazon-rds-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AmazonRDSAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonRDSAsyncClient aws-credentials client-configuration executor-service))
  (^AmazonRDSAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonRDSAsyncClient aws-credentials executor-service))
  (^AmazonRDSAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonRDSAsyncClient client-configuration))
  (^AmazonRDSAsyncClient []
    (new AmazonRDSAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.rds.AmazonRDSAsyncClientBuilder`"
  (^com.amazonaws.services.rds.AmazonRDSAsyncClientBuilder []
    (AmazonRDSAsyncClient/asyncBuilder )))

(defn modify-current-db-cluster-capacity-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.ModifyCurrentDBClusterCapacityRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyCurrentDBClusterCapacity operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.ModifyCurrentDBClusterCapacityResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.ModifyCurrentDBClusterCapacityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyCurrentDBClusterCapacityAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.ModifyCurrentDBClusterCapacityRequest request]
    (-> this (.modifyCurrentDBClusterCapacityAsync request))))

(defn modify-db-cluster-snapshot-attribute-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.ModifyDBClusterSnapshotAttributeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyDBClusterSnapshotAttribute operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBClusterSnapshotAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.ModifyDBClusterSnapshotAttributeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyDBClusterSnapshotAttributeAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.ModifyDBClusterSnapshotAttributeRequest request]
    (-> this (.modifyDBClusterSnapshotAttributeAsync request))))

(defn remove-role-from-db-instance-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.RemoveRoleFromDBInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveRoleFromDBInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.RemoveRoleFromDBInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.RemoveRoleFromDBInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeRoleFromDBInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.RemoveRoleFromDBInstanceRequest request]
    (-> this (.removeRoleFromDBInstanceAsync request))))

(defn describe-db-parameter-groups-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DescribeDBParameterGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBParameterGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeDBParameterGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeDBParameterGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBParameterGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeDBParameterGroupsRequest request]
    (-> this (.describeDBParameterGroupsAsync request)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this]
    (-> this (.describeDBParameterGroupsAsync))))

(defn delete-db-instance-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DeleteDBInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDBInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBInstance>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DeleteDBInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDBInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DeleteDBInstanceRequest request]
    (-> this (.deleteDBInstanceAsync request))))

(defn revoke-db-security-group-ingress-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.RevokeDBSecurityGroupIngressRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RevokeDBSecurityGroupIngress operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBSecurityGroup>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.RevokeDBSecurityGroupIngressRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.revokeDBSecurityGroupIngressAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.RevokeDBSecurityGroupIngressRequest request]
    (-> this (.revokeDBSecurityGroupIngressAsync request))))

(defn create-db-snapshot-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.CreateDBSnapshotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDBSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBSnapshot>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.CreateDBSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDBSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.CreateDBSnapshotRequest request]
    (-> this (.createDBSnapshotAsync request))))

(defn delete-option-group-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DeleteOptionGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteOptionGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DeleteOptionGroupResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DeleteOptionGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteOptionGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DeleteOptionGroupRequest request]
    (-> this (.deleteOptionGroupAsync request))))

(defn describe-event-categories-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DescribeEventCategoriesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEventCategories operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeEventCategoriesResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeEventCategoriesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventCategoriesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeEventCategoriesRequest request]
    (-> this (.describeEventCategoriesAsync request)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this]
    (-> this (.describeEventCategoriesAsync))))

(defn stop-db-cluster-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.StopDBClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBCluster>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.StopDBClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopDBClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.StopDBClusterRequest request]
    (-> this (.stopDBClusterAsync request))))

(defn describe-db-subnet-groups-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DescribeDBSubnetGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBSubnetGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeDBSubnetGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeDBSubnetGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBSubnetGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeDBSubnetGroupsRequest request]
    (-> this (.describeDBSubnetGroupsAsync request)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this]
    (-> this (.describeDBSubnetGroupsAsync))))

(defn start-db-cluster-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.StartDBClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBCluster>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.StartDBClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startDBClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.StartDBClusterRequest request]
    (-> this (.startDBClusterAsync request))))

(defn describe-reserved-db-instances-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DescribeReservedDBInstancesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReservedDBInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeReservedDBInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeReservedDBInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReservedDBInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeReservedDBInstancesRequest request]
    (-> this (.describeReservedDBInstancesAsync request)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this]
    (-> this (.describeReservedDBInstancesAsync))))

(defn describe-db-cluster-parameters-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DescribeDBClusterParametersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBClusterParameters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeDBClusterParametersResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeDBClusterParametersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBClusterParametersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeDBClusterParametersRequest request]
    (-> this (.describeDBClusterParametersAsync request))))

(defn copy-db-parameter-group-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.CopyDBParameterGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CopyDBParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBParameterGroup>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.CopyDBParameterGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.copyDBParameterGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.CopyDBParameterGroupRequest request]
    (-> this (.copyDBParameterGroupAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonRDSAsyncClient this]
    (-> this (.getExecutorService))))

(defn delete-event-subscription-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DeleteEventSubscriptionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEventSubscription operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.EventSubscription>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DeleteEventSubscriptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEventSubscriptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DeleteEventSubscriptionRequest request]
    (-> this (.deleteEventSubscriptionAsync request))))

(defn describe-db-security-groups-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DescribeDBSecurityGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBSecurityGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeDBSecurityGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeDBSecurityGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBSecurityGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeDBSecurityGroupsRequest request]
    (-> this (.describeDBSecurityGroupsAsync request)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this]
    (-> this (.describeDBSecurityGroupsAsync))))

(defn start-db-instance-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.StartDBInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartDBInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBInstance>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.StartDBInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startDBInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.StartDBInstanceRequest request]
    (-> this (.startDBInstanceAsync request))))

(defn delete-db-subnet-group-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DeleteDBSubnetGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDBSubnetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DeleteDBSubnetGroupResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DeleteDBSubnetGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDBSubnetGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DeleteDBSubnetGroupRequest request]
    (-> this (.deleteDBSubnetGroupAsync request))))

(defn modify-global-cluster-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.ModifyGlobalClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyGlobalCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.GlobalCluster>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.ModifyGlobalClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyGlobalClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.ModifyGlobalClusterRequest request]
    (-> this (.modifyGlobalClusterAsync request))))

(defn describe-db-cluster-parameter-groups-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DescribeDBClusterParameterGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBClusterParameterGroups operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeDBClusterParameterGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeDBClusterParameterGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBClusterParameterGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeDBClusterParameterGroupsRequest request]
    (-> this (.describeDBClusterParameterGroupsAsync request)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this]
    (-> this (.describeDBClusterParameterGroupsAsync))))

(defn create-option-group-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.CreateOptionGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateOptionGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.OptionGroup>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.CreateOptionGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createOptionGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.CreateOptionGroupRequest request]
    (-> this (.createOptionGroupAsync request))))

(defn describe-db-log-files-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DescribeDBLogFilesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBLogFiles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeDBLogFilesResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeDBLogFilesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBLogFilesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeDBLogFilesRequest request]
    (-> this (.describeDBLogFilesAsync request))))

(defn copy-db-cluster-snapshot-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.CopyDBClusterSnapshotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CopyDBClusterSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBClusterSnapshot>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.CopyDBClusterSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.copyDBClusterSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.CopyDBClusterSnapshotRequest request]
    (-> this (.copyDBClusterSnapshotAsync request))))

(defn remove-role-from-db-cluster-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.RemoveRoleFromDBClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveRoleFromDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.RemoveRoleFromDBClusterResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.RemoveRoleFromDBClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeRoleFromDBClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.RemoveRoleFromDBClusterRequest request]
    (-> this (.removeRoleFromDBClusterAsync request))))

(defn copy-db-cluster-parameter-group-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.CopyDBClusterParameterGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CopyDBClusterParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBClusterParameterGroup>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.CopyDBClusterParameterGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.copyDBClusterParameterGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.CopyDBClusterParameterGroupRequest request]
    (-> this (.copyDBClusterParameterGroupAsync request))))

(defn describe-global-clusters-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DescribeGlobalClustersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeGlobalClusters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeGlobalClustersResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeGlobalClustersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeGlobalClustersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeGlobalClustersRequest request]
    (-> this (.describeGlobalClustersAsync request))))

(defn failover-db-cluster-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.FailoverDBClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the FailoverDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBCluster>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.FailoverDBClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.failoverDBClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.FailoverDBClusterRequest request]
    (-> this (.failoverDBClusterAsync request)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this]
    (-> this (.failoverDBClusterAsync))))

(defn delete-db-snapshot-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DeleteDBSnapshotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDBSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBSnapshot>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DeleteDBSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDBSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DeleteDBSnapshotRequest request]
    (-> this (.deleteDBSnapshotAsync request))))

(defn create-db-parameter-group-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.CreateDBParameterGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDBParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBParameterGroup>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.CreateDBParameterGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDBParameterGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.CreateDBParameterGroupRequest request]
    (-> this (.createDBParameterGroupAsync request))))

(defn promote-read-replica-db-cluster-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.PromoteReadReplicaDBClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PromoteReadReplicaDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBCluster>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.PromoteReadReplicaDBClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.promoteReadReplicaDBClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.PromoteReadReplicaDBClusterRequest request]
    (-> this (.promoteReadReplicaDBClusterAsync request))))

(defn copy-db-snapshot-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.CopyDBSnapshotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CopyDBSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBSnapshot>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.CopyDBSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.copyDBSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.CopyDBSnapshotRequest request]
    (-> this (.copyDBSnapshotAsync request))))

(defn create-db-cluster-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.CreateDBClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBCluster>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.CreateDBClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDBClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.CreateDBClusterRequest request]
    (-> this (.createDBClusterAsync request))))

(defn modify-db-cluster-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.ModifyDBClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBCluster>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.ModifyDBClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyDBClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.ModifyDBClusterRequest request]
    (-> this (.modifyDBClusterAsync request))))

(defn restore-db-instance-from-s-3-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.RestoreDBInstanceFromS3Request`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestoreDBInstanceFromS3 operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBInstance>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.RestoreDBInstanceFromS3Request request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restoreDBInstanceFromS3Async request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.RestoreDBInstanceFromS3Request request]
    (-> this (.restoreDBInstanceFromS3Async request))))

(defn describe-orderable-db-instance-options-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DescribeOrderableDBInstanceOptionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeOrderableDBInstanceOptions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeOrderableDBInstanceOptionsResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeOrderableDBInstanceOptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeOrderableDBInstanceOptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeOrderableDBInstanceOptionsRequest request]
    (-> this (.describeOrderableDBInstanceOptionsAsync request))))

(defn modify-db-snapshot-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.ModifyDBSnapshotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyDBSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBSnapshot>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.ModifyDBSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyDBSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.ModifyDBSnapshotRequest request]
    (-> this (.modifyDBSnapshotAsync request))))

(defn create-db-instance-read-replica-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.CreateDBInstanceReadReplicaRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDBInstanceReadReplica operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBInstance>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.CreateDBInstanceReadReplicaRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDBInstanceReadReplicaAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.CreateDBInstanceReadReplicaRequest request]
    (-> this (.createDBInstanceReadReplicaAsync request))))

(defn describe-db-engine-versions-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DescribeDBEngineVersionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBEngineVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeDBEngineVersionsResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeDBEngineVersionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBEngineVersionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeDBEngineVersionsRequest request]
    (-> this (.describeDBEngineVersionsAsync request)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this]
    (-> this (.describeDBEngineVersionsAsync))))

(defn restore-db-cluster-to-point-in-time-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.RestoreDBClusterToPointInTimeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestoreDBClusterToPointInTime operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBCluster>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.RestoreDBClusterToPointInTimeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restoreDBClusterToPointInTimeAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.RestoreDBClusterToPointInTimeRequest request]
    (-> this (.restoreDBClusterToPointInTimeAsync request))))

(defn describe-db-parameters-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DescribeDBParametersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBParameters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeDBParametersResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeDBParametersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBParametersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeDBParametersRequest request]
    (-> this (.describeDBParametersAsync request))))

(defn describe-db-cluster-endpoints-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DescribeDBClusterEndpointsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBClusterEndpoints operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeDBClusterEndpointsResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeDBClusterEndpointsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBClusterEndpointsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeDBClusterEndpointsRequest request]
    (-> this (.describeDBClusterEndpointsAsync request))))

(defn create-db-instance-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.CreateDBInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDBInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBInstance>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.CreateDBInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDBInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.CreateDBInstanceRequest request]
    (-> this (.createDBInstanceAsync request))))

(defn create-db-security-group-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.CreateDBSecurityGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDBSecurityGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBSecurityGroup>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.CreateDBSecurityGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDBSecurityGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.CreateDBSecurityGroupRequest request]
    (-> this (.createDBSecurityGroupAsync request))))

(defn describe-reserved-db-instances-offerings-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DescribeReservedDBInstancesOfferingsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReservedDBInstancesOfferings operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeReservedDBInstancesOfferingsResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeReservedDBInstancesOfferingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReservedDBInstancesOfferingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeReservedDBInstancesOfferingsRequest request]
    (-> this (.describeReservedDBInstancesOfferingsAsync request)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this]
    (-> this (.describeReservedDBInstancesOfferingsAsync))))

(defn create-event-subscription-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.CreateEventSubscriptionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateEventSubscription operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.EventSubscription>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.CreateEventSubscriptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createEventSubscriptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.CreateEventSubscriptionRequest request]
    (-> this (.createEventSubscriptionAsync request))))

(defn reboot-db-instance-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.RebootDBInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RebootDBInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBInstance>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.RebootDBInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rebootDBInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.RebootDBInstanceRequest request]
    (-> this (.rebootDBInstanceAsync request))))

(defn delete-global-cluster-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DeleteGlobalClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteGlobalCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.GlobalCluster>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DeleteGlobalClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteGlobalClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DeleteGlobalClusterRequest request]
    (-> this (.deleteGlobalClusterAsync request))))

(defn describe-pending-maintenance-actions-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DescribePendingMaintenanceActionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePendingMaintenanceActions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribePendingMaintenanceActionsResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribePendingMaintenanceActionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePendingMaintenanceActionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribePendingMaintenanceActionsRequest request]
    (-> this (.describePendingMaintenanceActionsAsync request)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this]
    (-> this (.describePendingMaintenanceActionsAsync))))

(defn add-role-to-db-cluster-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.AddRoleToDBClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddRoleToDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.AddRoleToDBClusterResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.AddRoleToDBClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addRoleToDBClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.AddRoleToDBClusterRequest request]
    (-> this (.addRoleToDBClusterAsync request))))

(defn modify-option-group-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.ModifyOptionGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyOptionGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.OptionGroup>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.ModifyOptionGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyOptionGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.ModifyOptionGroupRequest request]
    (-> this (.modifyOptionGroupAsync request))))

(defn create-db-subnet-group-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.CreateDBSubnetGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDBSubnetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBSubnetGroup>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.CreateDBSubnetGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDBSubnetGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.CreateDBSubnetGroupRequest request]
    (-> this (.createDBSubnetGroupAsync request))))

(defn delete-db-cluster-parameter-group-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DeleteDBClusterParameterGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDBClusterParameterGroup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DeleteDBClusterParameterGroupResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DeleteDBClusterParameterGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDBClusterParameterGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DeleteDBClusterParameterGroupRequest request]
    (-> this (.deleteDBClusterParameterGroupAsync request))))

(defn describe-option-groups-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DescribeOptionGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeOptionGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeOptionGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeOptionGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeOptionGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeOptionGroupsRequest request]
    (-> this (.describeOptionGroupsAsync request)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this]
    (-> this (.describeOptionGroupsAsync))))

(defn describe-db-instance-automated-backups-async
  "Description copied from interface: AmazonRDSAsync

  request - Parameter input for DescribeDBInstanceAutomatedBackups. - `com.amazonaws.services.rds.model.DescribeDBInstanceAutomatedBackupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBInstanceAutomatedBackups operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeDBInstanceAutomatedBackupsResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeDBInstanceAutomatedBackupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBInstanceAutomatedBackupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeDBInstanceAutomatedBackupsRequest request]
    (-> this (.describeDBInstanceAutomatedBackupsAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonRDSAsyncClient this]
    (-> this (.shutdown))))

(defn authorize-db-security-group-ingress-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.AuthorizeDBSecurityGroupIngressRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AuthorizeDBSecurityGroupIngress operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBSecurityGroup>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.AuthorizeDBSecurityGroupIngressRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.authorizeDBSecurityGroupIngressAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.AuthorizeDBSecurityGroupIngressRequest request]
    (-> this (.authorizeDBSecurityGroupIngressAsync request))))

(defn describe-db-cluster-snapshot-attributes-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DescribeDBClusterSnapshotAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBClusterSnapshotAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBClusterSnapshotAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeDBClusterSnapshotAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBClusterSnapshotAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeDBClusterSnapshotAttributesRequest request]
    (-> this (.describeDBClusterSnapshotAttributesAsync request))))

(defn create-db-cluster-snapshot-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.CreateDBClusterSnapshotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDBClusterSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBClusterSnapshot>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.CreateDBClusterSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDBClusterSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.CreateDBClusterSnapshotRequest request]
    (-> this (.createDBClusterSnapshotAsync request))))

(defn describe-db-cluster-backtracks-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DescribeDBClusterBacktracksRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBClusterBacktracks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeDBClusterBacktracksResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeDBClusterBacktracksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBClusterBacktracksAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeDBClusterBacktracksRequest request]
    (-> this (.describeDBClusterBacktracksAsync request))))

(defn restore-db-instance-from-db-snapshot-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.RestoreDBInstanceFromDBSnapshotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestoreDBInstanceFromDBSnapshot operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBInstance>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.RestoreDBInstanceFromDBSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restoreDBInstanceFromDBSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.RestoreDBInstanceFromDBSnapshotRequest request]
    (-> this (.restoreDBInstanceFromDBSnapshotAsync request))))

(defn start-activity-stream-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.StartActivityStreamRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartActivityStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.StartActivityStreamResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.StartActivityStreamRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startActivityStreamAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.StartActivityStreamRequest request]
    (-> this (.startActivityStreamAsync request))))

(defn modify-db-cluster-parameter-group-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.ModifyDBClusterParameterGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyDBClusterParameterGroup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.ModifyDBClusterParameterGroupResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.ModifyDBClusterParameterGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyDBClusterParameterGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.ModifyDBClusterParameterGroupRequest request]
    (-> this (.modifyDBClusterParameterGroupAsync request))))

(defn purchase-reserved-db-instances-offering-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.PurchaseReservedDBInstancesOfferingRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PurchaseReservedDBInstancesOffering operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.ReservedDBInstance>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.PurchaseReservedDBInstancesOfferingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.purchaseReservedDBInstancesOfferingAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.PurchaseReservedDBInstancesOfferingRequest request]
    (-> this (.purchaseReservedDBInstancesOfferingAsync request))))

(defn describe-db-snapshot-attributes-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DescribeDBSnapshotAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBSnapshotAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBSnapshotAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeDBSnapshotAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBSnapshotAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeDBSnapshotAttributesRequest request]
    (-> this (.describeDBSnapshotAttributesAsync request)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this]
    (-> this (.describeDBSnapshotAttributesAsync))))

(defn restore-db-instance-to-point-in-time-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.RestoreDBInstanceToPointInTimeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestoreDBInstanceToPointInTime operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBInstance>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.RestoreDBInstanceToPointInTimeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restoreDBInstanceToPointInTimeAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.RestoreDBInstanceToPointInTimeRequest request]
    (-> this (.restoreDBInstanceToPointInTimeAsync request))))

(defn create-global-cluster-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.CreateGlobalClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateGlobalCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.GlobalCluster>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.CreateGlobalClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createGlobalClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.CreateGlobalClusterRequest request]
    (-> this (.createGlobalClusterAsync request))))

(defn modify-db-cluster-endpoint-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.ModifyDBClusterEndpointRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyDBClusterEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.ModifyDBClusterEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.ModifyDBClusterEndpointRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyDBClusterEndpointAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.ModifyDBClusterEndpointRequest request]
    (-> this (.modifyDBClusterEndpointAsync request))))

(defn modify-db-instance-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.ModifyDBInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyDBInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBInstance>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.ModifyDBInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyDBInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.ModifyDBInstanceRequest request]
    (-> this (.modifyDBInstanceAsync request))))

(defn restore-db-cluster-from-snapshot-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.RestoreDBClusterFromSnapshotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestoreDBClusterFromSnapshot operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBCluster>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.RestoreDBClusterFromSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restoreDBClusterFromSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.RestoreDBClusterFromSnapshotRequest request]
    (-> this (.restoreDBClusterFromSnapshotAsync request))))

(defn remove-from-global-cluster-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.RemoveFromGlobalClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveFromGlobalCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.GlobalCluster>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.RemoveFromGlobalClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeFromGlobalClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.RemoveFromGlobalClusterRequest request]
    (-> this (.removeFromGlobalClusterAsync request))))

(defn promote-read-replica-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.PromoteReadReplicaRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PromoteReadReplica operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBInstance>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.PromoteReadReplicaRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.promoteReadReplicaAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.PromoteReadReplicaRequest request]
    (-> this (.promoteReadReplicaAsync request))))

(defn create-db-cluster-endpoint-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.CreateDBClusterEndpointRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDBClusterEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.CreateDBClusterEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.CreateDBClusterEndpointRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDBClusterEndpointAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.CreateDBClusterEndpointRequest request]
    (-> this (.createDBClusterEndpointAsync request))))

(defn remove-tags-from-resource-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.RemoveTagsFromResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveTagsFromResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.RemoveTagsFromResourceResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.RemoveTagsFromResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeTagsFromResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.RemoveTagsFromResourceRequest request]
    (-> this (.removeTagsFromResourceAsync request))))

(defn describe-event-subscriptions-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DescribeEventSubscriptionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEventSubscriptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeEventSubscriptionsResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeEventSubscriptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventSubscriptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeEventSubscriptionsRequest request]
    (-> this (.describeEventSubscriptionsAsync request)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this]
    (-> this (.describeEventSubscriptionsAsync))))

(defn modify-db-parameter-group-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.ModifyDBParameterGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyDBParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.ModifyDBParameterGroupResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.ModifyDBParameterGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyDBParameterGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.ModifyDBParameterGroupRequest request]
    (-> this (.modifyDBParameterGroupAsync request))))

(defn describe-option-group-options-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DescribeOptionGroupOptionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeOptionGroupOptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeOptionGroupOptionsResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeOptionGroupOptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeOptionGroupOptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeOptionGroupOptionsRequest request]
    (-> this (.describeOptionGroupOptionsAsync request))))

(defn describe-certificates-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DescribeCertificatesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCertificates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeCertificatesResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeCertificatesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCertificatesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeCertificatesRequest request]
    (-> this (.describeCertificatesAsync request)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this]
    (-> this (.describeCertificatesAsync))))

(defn list-tags-for-resource-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn delete-db-security-group-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DeleteDBSecurityGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDBSecurityGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DeleteDBSecurityGroupResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DeleteDBSecurityGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDBSecurityGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DeleteDBSecurityGroupRequest request]
    (-> this (.deleteDBSecurityGroupAsync request))))

(defn restore-db-cluster-from-s-3-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.RestoreDBClusterFromS3Request`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestoreDBClusterFromS3 operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBCluster>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.RestoreDBClusterFromS3Request request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restoreDBClusterFromS3Async request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.RestoreDBClusterFromS3Request request]
    (-> this (.restoreDBClusterFromS3Async request))))

(defn copy-option-group-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.CopyOptionGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CopyOptionGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.OptionGroup>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.CopyOptionGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.copyOptionGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.CopyOptionGroupRequest request]
    (-> this (.copyOptionGroupAsync request))))

(defn create-db-cluster-parameter-group-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.CreateDBClusterParameterGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDBClusterParameterGroup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBClusterParameterGroup>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.CreateDBClusterParameterGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDBClusterParameterGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.CreateDBClusterParameterGroupRequest request]
    (-> this (.createDBClusterParameterGroupAsync request))))

(defn delete-db-instance-automated-backup-async
  "Description copied from interface: AmazonRDSAsync

  request - Parameter input for the DeleteDBInstanceAutomatedBackup operation. - `com.amazonaws.services.rds.model.DeleteDBInstanceAutomatedBackupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDBInstanceAutomatedBackup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBInstanceAutomatedBackup>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DeleteDBInstanceAutomatedBackupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDBInstanceAutomatedBackupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DeleteDBInstanceAutomatedBackupRequest request]
    (-> this (.deleteDBInstanceAutomatedBackupAsync request))))

(defn delete-db-cluster-snapshot-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DeleteDBClusterSnapshotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDBClusterSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBClusterSnapshot>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DeleteDBClusterSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDBClusterSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DeleteDBClusterSnapshotRequest request]
    (-> this (.deleteDBClusterSnapshotAsync request))))

(defn modify-db-snapshot-attribute-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.ModifyDBSnapshotAttributeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyDBSnapshotAttribute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBSnapshotAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.ModifyDBSnapshotAttributeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyDBSnapshotAttributeAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.ModifyDBSnapshotAttributeRequest request]
    (-> this (.modifyDBSnapshotAttributeAsync request))))

(defn describe-engine-default-parameters-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DescribeEngineDefaultParametersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEngineDefaultParameters operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.EngineDefaults>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeEngineDefaultParametersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEngineDefaultParametersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeEngineDefaultParametersRequest request]
    (-> this (.describeEngineDefaultParametersAsync request))))

(defn delete-db-parameter-group-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DeleteDBParameterGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDBParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DeleteDBParameterGroupResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DeleteDBParameterGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDBParameterGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DeleteDBParameterGroupRequest request]
    (-> this (.deleteDBParameterGroupAsync request))))

(defn describe-events-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DescribeEventsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeEventsResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeEventsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeEventsRequest request]
    (-> this (.describeEventsAsync request)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this]
    (-> this (.describeEventsAsync))))

(defn reset-db-parameter-group-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.ResetDBParameterGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResetDBParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.ResetDBParameterGroupResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.ResetDBParameterGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resetDBParameterGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.ResetDBParameterGroupRequest request]
    (-> this (.resetDBParameterGroupAsync request))))

(defn delete-db-cluster-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DeleteDBClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBCluster>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DeleteDBClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDBClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DeleteDBClusterRequest request]
    (-> this (.deleteDBClusterAsync request))))

(defn reset-db-cluster-parameter-group-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.ResetDBClusterParameterGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResetDBClusterParameterGroup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.ResetDBClusterParameterGroupResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.ResetDBClusterParameterGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resetDBClusterParameterGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.ResetDBClusterParameterGroupRequest request]
    (-> this (.resetDBClusterParameterGroupAsync request))))

(defn add-role-to-db-instance-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.AddRoleToDBInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddRoleToDBInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.AddRoleToDBInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.AddRoleToDBInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addRoleToDBInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.AddRoleToDBInstanceRequest request]
    (-> this (.addRoleToDBInstanceAsync request))))

(defn modify-db-subnet-group-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.ModifyDBSubnetGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyDBSubnetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBSubnetGroup>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.ModifyDBSubnetGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyDBSubnetGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.ModifyDBSubnetGroupRequest request]
    (-> this (.modifyDBSubnetGroupAsync request))))

(defn stop-db-instance-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.StopDBInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopDBInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBInstance>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.StopDBInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopDBInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.StopDBInstanceRequest request]
    (-> this (.stopDBInstanceAsync request))))

(defn stop-activity-stream-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.StopActivityStreamRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopActivityStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.StopActivityStreamResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.StopActivityStreamRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopActivityStreamAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.StopActivityStreamRequest request]
    (-> this (.stopActivityStreamAsync request))))

(defn remove-source-identifier-from-subscription-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.RemoveSourceIdentifierFromSubscriptionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveSourceIdentifierFromSubscription operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.EventSubscription>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.RemoveSourceIdentifierFromSubscriptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeSourceIdentifierFromSubscriptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.RemoveSourceIdentifierFromSubscriptionRequest request]
    (-> this (.removeSourceIdentifierFromSubscriptionAsync request))))

(defn describe-db-instances-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DescribeDBInstancesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeDBInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeDBInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeDBInstancesRequest request]
    (-> this (.describeDBInstancesAsync request)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this]
    (-> this (.describeDBInstancesAsync))))

(defn add-tags-to-resource-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.AddTagsToResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddTagsToResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.AddTagsToResourceResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.AddTagsToResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addTagsToResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.AddTagsToResourceRequest request]
    (-> this (.addTagsToResourceAsync request))))

(defn describe-db-clusters-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DescribeDBClustersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBClusters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeDBClustersResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeDBClustersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBClustersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeDBClustersRequest request]
    (-> this (.describeDBClustersAsync request)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this]
    (-> this (.describeDBClustersAsync))))

(defn describe-db-snapshots-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DescribeDBSnapshotsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBSnapshots operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeDBSnapshotsResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeDBSnapshotsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBSnapshotsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeDBSnapshotsRequest request]
    (-> this (.describeDBSnapshotsAsync request)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this]
    (-> this (.describeDBSnapshotsAsync))))

(defn backtrack-db-cluster-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.BacktrackDBClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BacktrackDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.BacktrackDBClusterResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.BacktrackDBClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.backtrackDBClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.BacktrackDBClusterRequest request]
    (-> this (.backtrackDBClusterAsync request))))

(defn download-db-log-file-portion-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DownloadDBLogFilePortionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DownloadDBLogFilePortion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DownloadDBLogFilePortionResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DownloadDBLogFilePortionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.downloadDBLogFilePortionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DownloadDBLogFilePortionRequest request]
    (-> this (.downloadDBLogFilePortionAsync request))))

(defn modify-event-subscription-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.ModifyEventSubscriptionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyEventSubscription operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.EventSubscription>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.ModifyEventSubscriptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyEventSubscriptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.ModifyEventSubscriptionRequest request]
    (-> this (.modifyEventSubscriptionAsync request))))

(defn describe-account-attributes-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DescribeAccountAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAccountAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeAccountAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeAccountAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAccountAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeAccountAttributesRequest request]
    (-> this (.describeAccountAttributesAsync request)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this]
    (-> this (.describeAccountAttributesAsync))))

(defn apply-pending-maintenance-action-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.ApplyPendingMaintenanceActionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ApplyPendingMaintenanceAction operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.ResourcePendingMaintenanceActions>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.ApplyPendingMaintenanceActionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.applyPendingMaintenanceActionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.ApplyPendingMaintenanceActionRequest request]
    (-> this (.applyPendingMaintenanceActionAsync request))))

(defn describe-db-cluster-snapshots-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DescribeDBClusterSnapshotsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBClusterSnapshots operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeDBClusterSnapshotsResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeDBClusterSnapshotsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBClusterSnapshotsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeDBClusterSnapshotsRequest request]
    (-> this (.describeDBClusterSnapshotsAsync request)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this]
    (-> this (.describeDBClusterSnapshotsAsync))))

(defn add-source-identifier-to-subscription-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.AddSourceIdentifierToSubscriptionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddSourceIdentifierToSubscription operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.EventSubscription>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.AddSourceIdentifierToSubscriptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addSourceIdentifierToSubscriptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.AddSourceIdentifierToSubscriptionRequest request]
    (-> this (.addSourceIdentifierToSubscriptionAsync request))))

(defn describe-valid-db-instance-modifications-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DescribeValidDBInstanceModificationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeValidDBInstanceModifications operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.ValidDBInstanceModificationsMessage>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeValidDBInstanceModificationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeValidDBInstanceModificationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeValidDBInstanceModificationsRequest request]
    (-> this (.describeValidDBInstanceModificationsAsync request))))

(defn describe-engine-default-cluster-parameters-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DescribeEngineDefaultClusterParametersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEngineDefaultClusterParameters operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.EngineDefaults>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeEngineDefaultClusterParametersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEngineDefaultClusterParametersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeEngineDefaultClusterParametersRequest request]
    (-> this (.describeEngineDefaultClusterParametersAsync request))))

(defn describe-source-regions-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DescribeSourceRegionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSourceRegions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeSourceRegionsResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeSourceRegionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSourceRegionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DescribeSourceRegionsRequest request]
    (-> this (.describeSourceRegionsAsync request))))

(defn delete-db-cluster-endpoint-async
  "Description copied from interface: AmazonRDSAsync

  request - `com.amazonaws.services.rds.model.DeleteDBClusterEndpointRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDBClusterEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DeleteDBClusterEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DeleteDBClusterEndpointRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDBClusterEndpointAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsyncClient this ^com.amazonaws.services.rds.model.DeleteDBClusterEndpointRequest request]
    (-> this (.deleteDBClusterEndpointAsync request))))

