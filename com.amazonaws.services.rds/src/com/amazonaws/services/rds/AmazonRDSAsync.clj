(ns com.amazonaws.services.rds.AmazonRDSAsync
  "Interface for accessing Amazon RDS asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonRDSAsync instead.


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
  (:import [com.amazonaws.services.rds AmazonRDSAsync]))

(defn modify-current-db-cluster-capacity-async
  "Set the capacity of an Aurora Serverless DB cluster to a specific value.


   Aurora Serverless scales seamlessly based on the workload on the DB cluster. In some cases, the capacity might
   not scale fast enough to meet a sudden change in workload, such as a large number of new transactions. Call
   ModifyCurrentDBClusterCapacity to set the capacity explicitly.


   After this call sets the DB cluster capacity, Aurora Serverless can automatically scale the DB cluster based on
   the cooldown period for scaling up and the cooldown period for scaling down.


   For more information about Aurora Serverless, see Using Amazon Aurora
   Serverless in the Amazon Aurora User Guide.



   If you call ModifyCurrentDBClusterCapacity with the default TimeoutAction, connections
   that prevent Aurora Serverless from finding a scaling point might be dropped. For more information about scaling
   points, see  Autoscaling for Aurora Serverless in the Amazon Aurora User Guide.



   This action only applies to Aurora DB clusters.

  modify-current-db-cluster-capacity-request - `com.amazonaws.services.rds.model.ModifyCurrentDBClusterCapacityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyCurrentDBClusterCapacity operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.ModifyCurrentDBClusterCapacityResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.ModifyCurrentDBClusterCapacityRequest modify-current-db-cluster-capacity-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyCurrentDBClusterCapacityAsync modify-current-db-cluster-capacity-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.ModifyCurrentDBClusterCapacityRequest modify-current-db-cluster-capacity-request]
    (-> this (.modifyCurrentDBClusterCapacityAsync modify-current-db-cluster-capacity-request))))

(defn modify-db-cluster-snapshot-attribute-async
  "Adds an attribute and values to, or removes an attribute and values from, a manual DB cluster snapshot.


   To share a manual DB cluster snapshot with other AWS accounts, specify restore as the
   AttributeName and use the ValuesToAdd parameter to add a list of IDs of the AWS
   accounts that are authorized to restore the manual DB cluster snapshot. Use the value all to make
   the manual DB cluster snapshot public, which means that it can be copied or restored by all AWS accounts. Do not
   add the all value for any manual DB cluster snapshots that contain private information that you
   don't want available to all AWS accounts. If a manual DB cluster snapshot is encrypted, it can be shared, but
   only by specifying a list of authorized AWS account IDs for the ValuesToAdd parameter. You can't use
   all as a value for that parameter in this case.


   To view which AWS accounts have access to copy or restore a manual DB cluster snapshot, or whether a manual DB
   cluster snapshot public or private, use the DescribeDBClusterSnapshotAttributes API action.



   This action only applies to Aurora DB clusters.

  modify-db-cluster-snapshot-attribute-request - `com.amazonaws.services.rds.model.ModifyDBClusterSnapshotAttributeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyDBClusterSnapshotAttribute operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBClusterSnapshotAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.ModifyDBClusterSnapshotAttributeRequest modify-db-cluster-snapshot-attribute-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyDBClusterSnapshotAttributeAsync modify-db-cluster-snapshot-attribute-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.ModifyDBClusterSnapshotAttributeRequest modify-db-cluster-snapshot-attribute-request]
    (-> this (.modifyDBClusterSnapshotAttributeAsync modify-db-cluster-snapshot-attribute-request))))

(defn remove-role-from-db-instance-async
  "Disassociates an AWS Identity and Access Management (IAM) role from a DB instance.

  remove-role-from-db-instance-request - `com.amazonaws.services.rds.model.RemoveRoleFromDBInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveRoleFromDBInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.RemoveRoleFromDBInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.RemoveRoleFromDBInstanceRequest remove-role-from-db-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeRoleFromDBInstanceAsync remove-role-from-db-instance-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.RemoveRoleFromDBInstanceRequest remove-role-from-db-instance-request]
    (-> this (.removeRoleFromDBInstanceAsync remove-role-from-db-instance-request))))

(defn describe-db-parameter-groups-async
  "Returns a list of DBParameterGroup descriptions. If a DBParameterGroupName is
   specified, the list will contain only the description of the specified DB parameter group.

  describe-db-parameter-groups-request - `com.amazonaws.services.rds.model.DescribeDBParameterGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBParameterGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeDBParameterGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeDBParameterGroupsRequest describe-db-parameter-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBParameterGroupsAsync describe-db-parameter-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeDBParameterGroupsRequest describe-db-parameter-groups-request]
    (-> this (.describeDBParameterGroupsAsync describe-db-parameter-groups-request)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this]
    (-> this (.describeDBParameterGroupsAsync))))

(defn delete-db-instance-async
  "The DeleteDBInstance action deletes a previously provisioned DB instance. When you delete a DB instance, all
   automated backups for that instance are deleted and can't be recovered. Manual DB snapshots of the DB instance to
   be deleted by DeleteDBInstance are not deleted.


   If you request a final DB snapshot the status of the Amazon RDS DB instance is deleting until the DB
   snapshot is created. The API action DescribeDBInstance is used to monitor the status of this
   operation. The action can't be canceled or reverted once submitted.


   Note that when a DB instance is in a failure state and has a status of failed,
   incompatible-restore, or incompatible-network, you can only delete it when you skip
   creation of the final snapshot with the SkipFinalSnapshot parameter.


   If the specified DB instance is part of an Amazon Aurora DB cluster, you can't delete the DB instance if both of
   the following conditions are true:




   The DB cluster is a Read Replica of another Amazon Aurora DB cluster.




   The DB instance is the only instance in the DB cluster.




   To delete a DB instance in this case, first call the PromoteReadReplicaDBCluster API action to
   promote the DB cluster so it's no longer a Read Replica. After the promotion completes, then call the
   DeleteDBInstance API action to delete the final instance in the DB cluster.

  delete-db-instance-request - `com.amazonaws.services.rds.model.DeleteDBInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDBInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBInstance>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DeleteDBInstanceRequest delete-db-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDBInstanceAsync delete-db-instance-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DeleteDBInstanceRequest delete-db-instance-request]
    (-> this (.deleteDBInstanceAsync delete-db-instance-request))))

(defn revoke-db-security-group-ingress-async
  "Revokes ingress from a DBSecurityGroup for previously authorized IP ranges or EC2 or VPC Security Groups.
   Required parameters for this API are one of CIDRIP, EC2SecurityGroupId for VPC, or (EC2SecurityGroupOwnerId and
   either EC2SecurityGroupName or EC2SecurityGroupId).

  revoke-db-security-group-ingress-request - `com.amazonaws.services.rds.model.RevokeDBSecurityGroupIngressRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RevokeDBSecurityGroupIngress operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBSecurityGroup>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.RevokeDBSecurityGroupIngressRequest revoke-db-security-group-ingress-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.revokeDBSecurityGroupIngressAsync revoke-db-security-group-ingress-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.RevokeDBSecurityGroupIngressRequest revoke-db-security-group-ingress-request]
    (-> this (.revokeDBSecurityGroupIngressAsync revoke-db-security-group-ingress-request))))

(defn create-db-snapshot-async
  "Creates a DBSnapshot. The source DBInstance must be in \"available\" state.

  create-db-snapshot-request - `com.amazonaws.services.rds.model.CreateDBSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDBSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBSnapshot>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.CreateDBSnapshotRequest create-db-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDBSnapshotAsync create-db-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.CreateDBSnapshotRequest create-db-snapshot-request]
    (-> this (.createDBSnapshotAsync create-db-snapshot-request))))

(defn delete-option-group-async
  "Deletes an existing option group.

  delete-option-group-request - `com.amazonaws.services.rds.model.DeleteOptionGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteOptionGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DeleteOptionGroupResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DeleteOptionGroupRequest delete-option-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteOptionGroupAsync delete-option-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DeleteOptionGroupRequest delete-option-group-request]
    (-> this (.deleteOptionGroupAsync delete-option-group-request))))

(defn describe-event-categories-async
  "Displays a list of categories for all event source types, or, if specified, for a specified source type. You can
   see a list of the event categories and source types in the  Events topic in the Amazon
   RDS User Guide.

  describe-event-categories-request - `com.amazonaws.services.rds.model.DescribeEventCategoriesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEventCategories operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeEventCategoriesResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeEventCategoriesRequest describe-event-categories-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventCategoriesAsync describe-event-categories-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeEventCategoriesRequest describe-event-categories-request]
    (-> this (.describeEventCategoriesAsync describe-event-categories-request)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this]
    (-> this (.describeEventCategoriesAsync))))

(defn stop-db-cluster-async
  "Stops an Amazon Aurora DB cluster. When you stop a DB cluster, Aurora retains the DB cluster's metadata,
   including its endpoints and DB parameter groups. Aurora also retains the transaction logs so you can do a
   point-in-time restore if necessary.


   For more information, see  Stopping and
   Starting an Aurora Cluster in the Amazon Aurora User Guide.



   This action only applies to Aurora DB clusters.

  stop-db-cluster-request - `com.amazonaws.services.rds.model.StopDBClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBCluster>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.StopDBClusterRequest stop-db-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopDBClusterAsync stop-db-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.StopDBClusterRequest stop-db-cluster-request]
    (-> this (.stopDBClusterAsync stop-db-cluster-request))))

(defn describe-db-subnet-groups-async
  "Returns a list of DBSubnetGroup descriptions. If a DBSubnetGroupName is specified, the list will contain only the
   descriptions of the specified DBSubnetGroup.


   For an overview of CIDR ranges, go to the Wikipedia Tutorial.

  describe-db-subnet-groups-request - `com.amazonaws.services.rds.model.DescribeDBSubnetGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBSubnetGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeDBSubnetGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeDBSubnetGroupsRequest describe-db-subnet-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBSubnetGroupsAsync describe-db-subnet-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeDBSubnetGroupsRequest describe-db-subnet-groups-request]
    (-> this (.describeDBSubnetGroupsAsync describe-db-subnet-groups-request)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this]
    (-> this (.describeDBSubnetGroupsAsync))))

(defn start-db-cluster-async
  "Starts an Amazon Aurora DB cluster that was stopped using the AWS console, the stop-db-cluster AWS CLI command,
   or the StopDBCluster action.


   For more information, see  Stopping and
   Starting an Aurora Cluster in the Amazon Aurora User Guide.



   This action only applies to Aurora DB clusters.

  start-db-cluster-request - `com.amazonaws.services.rds.model.StartDBClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBCluster>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.StartDBClusterRequest start-db-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startDBClusterAsync start-db-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.StartDBClusterRequest start-db-cluster-request]
    (-> this (.startDBClusterAsync start-db-cluster-request))))

(defn describe-reserved-db-instances-async
  "Returns information about reserved DB instances for this account, or about a specified reserved DB instance.

  describe-reserved-db-instances-request - `com.amazonaws.services.rds.model.DescribeReservedDBInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReservedDBInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeReservedDBInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeReservedDBInstancesRequest describe-reserved-db-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReservedDBInstancesAsync describe-reserved-db-instances-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeReservedDBInstancesRequest describe-reserved-db-instances-request]
    (-> this (.describeReservedDBInstancesAsync describe-reserved-db-instances-request)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this]
    (-> this (.describeReservedDBInstancesAsync))))

(defn describe-db-cluster-parameters-async
  "Returns the detailed parameter list for a particular DB cluster parameter group.


   For more information on Amazon Aurora, see  What Is Amazon
   Aurora? in the Amazon Aurora User Guide.



   This action only applies to Aurora DB clusters.

  describe-db-cluster-parameters-request - `com.amazonaws.services.rds.model.DescribeDBClusterParametersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBClusterParameters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeDBClusterParametersResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeDBClusterParametersRequest describe-db-cluster-parameters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBClusterParametersAsync describe-db-cluster-parameters-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeDBClusterParametersRequest describe-db-cluster-parameters-request]
    (-> this (.describeDBClusterParametersAsync describe-db-cluster-parameters-request))))

(defn copy-db-parameter-group-async
  "Copies the specified DB parameter group.

  copy-db-parameter-group-request - `com.amazonaws.services.rds.model.CopyDBParameterGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CopyDBParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBParameterGroup>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.CopyDBParameterGroupRequest copy-db-parameter-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.copyDBParameterGroupAsync copy-db-parameter-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.CopyDBParameterGroupRequest copy-db-parameter-group-request]
    (-> this (.copyDBParameterGroupAsync copy-db-parameter-group-request))))

(defn delete-event-subscription-async
  "Deletes an RDS event notification subscription.

  delete-event-subscription-request - `com.amazonaws.services.rds.model.DeleteEventSubscriptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEventSubscription operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.EventSubscription>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DeleteEventSubscriptionRequest delete-event-subscription-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEventSubscriptionAsync delete-event-subscription-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DeleteEventSubscriptionRequest delete-event-subscription-request]
    (-> this (.deleteEventSubscriptionAsync delete-event-subscription-request))))

(defn describe-db-security-groups-async
  "Returns a list of DBSecurityGroup descriptions. If a DBSecurityGroupName is specified,
   the list will contain only the descriptions of the specified DB security group.

  describe-db-security-groups-request - `com.amazonaws.services.rds.model.DescribeDBSecurityGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBSecurityGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeDBSecurityGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeDBSecurityGroupsRequest describe-db-security-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBSecurityGroupsAsync describe-db-security-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeDBSecurityGroupsRequest describe-db-security-groups-request]
    (-> this (.describeDBSecurityGroupsAsync describe-db-security-groups-request)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this]
    (-> this (.describeDBSecurityGroupsAsync))))

(defn start-db-instance-async
  "Starts an Amazon RDS DB instance that was stopped using the AWS console, the stop-db-instance AWS CLI command, or
   the StopDBInstance action.


   For more information, see  Starting an Amazon RDS DB
   instance That Was Previously Stopped in the Amazon RDS User Guide.



   This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora DB clusters, use
   StartDBCluster instead.

  start-db-instance-request - `com.amazonaws.services.rds.model.StartDBInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartDBInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBInstance>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.StartDBInstanceRequest start-db-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startDBInstanceAsync start-db-instance-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.StartDBInstanceRequest start-db-instance-request]
    (-> this (.startDBInstanceAsync start-db-instance-request))))

(defn delete-db-subnet-group-async
  "Deletes a DB subnet group.



   The specified database subnet group must not be associated with any DB instances.

  delete-db-subnet-group-request - `com.amazonaws.services.rds.model.DeleteDBSubnetGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDBSubnetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DeleteDBSubnetGroupResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DeleteDBSubnetGroupRequest delete-db-subnet-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDBSubnetGroupAsync delete-db-subnet-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DeleteDBSubnetGroupRequest delete-db-subnet-group-request]
    (-> this (.deleteDBSubnetGroupAsync delete-db-subnet-group-request))))

(defn modify-global-cluster-async
  "Modify a setting for an Amazon Aurora global cluster. You can change one or more database configuration
   parameters by specifying these parameters and the new values in the request. For more information on Amazon
   Aurora, see  What
   Is Amazon Aurora? in the Amazon Aurora User Guide.



   This action only applies to Aurora DB clusters.

  modify-global-cluster-request - `com.amazonaws.services.rds.model.ModifyGlobalClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyGlobalCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.GlobalCluster>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.ModifyGlobalClusterRequest modify-global-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyGlobalClusterAsync modify-global-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.ModifyGlobalClusterRequest modify-global-cluster-request]
    (-> this (.modifyGlobalClusterAsync modify-global-cluster-request))))

(defn describe-db-cluster-parameter-groups-async
  "Returns a list of DBClusterParameterGroup descriptions. If a
   DBClusterParameterGroupName parameter is specified, the list will contain only the description of
   the specified DB cluster parameter group.


   For more information on Amazon Aurora, see  What Is Amazon
   Aurora? in the Amazon Aurora User Guide.



   This action only applies to Aurora DB clusters.

  describe-db-cluster-parameter-groups-request - `com.amazonaws.services.rds.model.DescribeDBClusterParameterGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBClusterParameterGroups operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeDBClusterParameterGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeDBClusterParameterGroupsRequest describe-db-cluster-parameter-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBClusterParameterGroupsAsync describe-db-cluster-parameter-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeDBClusterParameterGroupsRequest describe-db-cluster-parameter-groups-request]
    (-> this (.describeDBClusterParameterGroupsAsync describe-db-cluster-parameter-groups-request)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this]
    (-> this (.describeDBClusterParameterGroupsAsync))))

(defn create-option-group-async
  "Creates a new option group. You can create up to 20 option groups.

  create-option-group-request - `com.amazonaws.services.rds.model.CreateOptionGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateOptionGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.OptionGroup>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.CreateOptionGroupRequest create-option-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createOptionGroupAsync create-option-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.CreateOptionGroupRequest create-option-group-request]
    (-> this (.createOptionGroupAsync create-option-group-request))))

(defn describe-db-log-files-async
  "Returns a list of DB log files for the DB instance.

  describe-db-log-files-request - `com.amazonaws.services.rds.model.DescribeDBLogFilesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBLogFiles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeDBLogFilesResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeDBLogFilesRequest describe-db-log-files-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBLogFilesAsync describe-db-log-files-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeDBLogFilesRequest describe-db-log-files-request]
    (-> this (.describeDBLogFilesAsync describe-db-log-files-request))))

(defn copy-db-cluster-snapshot-async
  "Copies a snapshot of a DB cluster.


   To copy a DB cluster snapshot from a shared manual DB cluster snapshot,
   SourceDBClusterSnapshotIdentifier must be the Amazon Resource Name (ARN) of the shared DB cluster
   snapshot.


   You can copy an encrypted DB cluster snapshot from another AWS Region. In that case, the AWS Region where you
   call the CopyDBClusterSnapshot action is the destination AWS Region for the encrypted DB cluster
   snapshot to be copied to. To copy an encrypted DB cluster snapshot from another AWS Region, you must provide the
   following values:




   KmsKeyId - The AWS Key Management System (AWS KMS) key identifier for the key to use to encrypt the
   copy of the DB cluster snapshot in the destination AWS Region.




   PreSignedUrl - A URL that contains a Signature Version 4 signed request for the
   CopyDBClusterSnapshot action to be called in the source AWS Region where the DB cluster snapshot is
   copied from. The pre-signed URL must be a valid request for the CopyDBClusterSnapshot API action
   that can be executed in the source AWS Region that contains the encrypted DB cluster snapshot to be copied.


   The pre-signed URL request must contain the following parameter values:




   KmsKeyId - The KMS key identifier for the key to use to encrypt the copy of the DB cluster snapshot
   in the destination AWS Region. This is the same identifier for both the CopyDBClusterSnapshot action
   that is called in the destination AWS Region, and the action contained in the pre-signed URL.




   DestinationRegion - The name of the AWS Region that the DB cluster snapshot will be created in.




   SourceDBClusterSnapshotIdentifier - The DB cluster snapshot identifier for the encrypted DB cluster
   snapshot to be copied. This identifier must be in the Amazon Resource Name (ARN) format for the source AWS
   Region. For example, if you are copying an encrypted DB cluster snapshot from the us-west-2 AWS Region, then your
   SourceDBClusterSnapshotIdentifier looks like the following example:
   arn:aws:rds:us-west-2:123456789012:cluster-snapshot:aurora-cluster1-snapshot-20161115.




   To learn how to generate a Signature Version 4 signed request, see  Authenticating Requests:
   Using Query Parameters (AWS Signature Version 4) and  Signature Version 4 Signing
   Process.




   TargetDBClusterSnapshotIdentifier - The identifier for the new copy of the DB cluster snapshot in
   the destination AWS Region.




   SourceDBClusterSnapshotIdentifier - The DB cluster snapshot identifier for the encrypted DB cluster
   snapshot to be copied. This identifier must be in the ARN format for the source AWS Region and is the same value
   as the SourceDBClusterSnapshotIdentifier in the pre-signed URL.




   To cancel the copy operation once it is in progress, delete the target DB cluster snapshot identified by
   TargetDBClusterSnapshotIdentifier while that DB cluster snapshot is in \"copying\" status.


   For more information on copying encrypted DB cluster snapshots from one AWS Region to another, see  Copying a
   Snapshot in the Amazon Aurora User Guide.


   For more information on Amazon Aurora, see  What Is Amazon
   Aurora? in the Amazon Aurora User Guide.



   This action only applies to Aurora DB clusters.

  copy-db-cluster-snapshot-request - `com.amazonaws.services.rds.model.CopyDBClusterSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CopyDBClusterSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBClusterSnapshot>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.CopyDBClusterSnapshotRequest copy-db-cluster-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.copyDBClusterSnapshotAsync copy-db-cluster-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.CopyDBClusterSnapshotRequest copy-db-cluster-snapshot-request]
    (-> this (.copyDBClusterSnapshotAsync copy-db-cluster-snapshot-request))))

(defn remove-role-from-db-cluster-async
  "Disassociates an AWS Identity and Access Management (IAM) role from an Amazon Aurora DB cluster. For more
   information, see Authorizing Amazon Aurora MySQL to Access Other AWS Services on Your Behalf  in the Amazon Aurora User
   Guide.



   This action only applies to Aurora DB clusters.

  remove-role-from-db-cluster-request - `com.amazonaws.services.rds.model.RemoveRoleFromDBClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveRoleFromDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.RemoveRoleFromDBClusterResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.RemoveRoleFromDBClusterRequest remove-role-from-db-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeRoleFromDBClusterAsync remove-role-from-db-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.RemoveRoleFromDBClusterRequest remove-role-from-db-cluster-request]
    (-> this (.removeRoleFromDBClusterAsync remove-role-from-db-cluster-request))))

(defn copy-db-cluster-parameter-group-async
  "Copies the specified DB cluster parameter group.



   This action only applies to Aurora DB clusters.

  copy-db-cluster-parameter-group-request - `com.amazonaws.services.rds.model.CopyDBClusterParameterGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CopyDBClusterParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBClusterParameterGroup>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.CopyDBClusterParameterGroupRequest copy-db-cluster-parameter-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.copyDBClusterParameterGroupAsync copy-db-cluster-parameter-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.CopyDBClusterParameterGroupRequest copy-db-cluster-parameter-group-request]
    (-> this (.copyDBClusterParameterGroupAsync copy-db-cluster-parameter-group-request))))

(defn describe-global-clusters-async
  "Returns information about Aurora global database clusters. This API supports pagination.


   For more information on Amazon Aurora, see  What Is Amazon
   Aurora? in the Amazon Aurora User Guide.



   This action only applies to Aurora DB clusters.

  describe-global-clusters-request - `com.amazonaws.services.rds.model.DescribeGlobalClustersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeGlobalClusters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeGlobalClustersResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeGlobalClustersRequest describe-global-clusters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeGlobalClustersAsync describe-global-clusters-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeGlobalClustersRequest describe-global-clusters-request]
    (-> this (.describeGlobalClustersAsync describe-global-clusters-request))))

(defn failover-db-cluster-async
  "Forces a failover for a DB cluster.


   A failover for a DB cluster promotes one of the Aurora Replicas (read-only instances) in the DB cluster to be the
   primary instance (the cluster writer).


   Amazon Aurora will automatically fail over to an Aurora Replica, if one exists, when the primary instance fails.
   You can force a failover when you want to simulate a failure of a primary instance for testing. Because each
   instance in a DB cluster has its own endpoint address, you will need to clean up and re-establish any existing
   connections that use those endpoint addresses when the failover is complete.


   For more information on Amazon Aurora, see  What Is Amazon
   Aurora? in the Amazon Aurora User Guide.



   This action only applies to Aurora DB clusters.

  failover-db-cluster-request - `com.amazonaws.services.rds.model.FailoverDBClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the FailoverDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBCluster>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.FailoverDBClusterRequest failover-db-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.failoverDBClusterAsync failover-db-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.FailoverDBClusterRequest failover-db-cluster-request]
    (-> this (.failoverDBClusterAsync failover-db-cluster-request)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this]
    (-> this (.failoverDBClusterAsync))))

(defn delete-db-snapshot-async
  "Deletes a DB snapshot. If the snapshot is being copied, the copy operation is terminated.



   The DB snapshot must be in the available state to be deleted.

  delete-db-snapshot-request - `com.amazonaws.services.rds.model.DeleteDBSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDBSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBSnapshot>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DeleteDBSnapshotRequest delete-db-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDBSnapshotAsync delete-db-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DeleteDBSnapshotRequest delete-db-snapshot-request]
    (-> this (.deleteDBSnapshotAsync delete-db-snapshot-request))))

(defn create-db-parameter-group-async
  "Creates a new DB parameter group.


   A DB parameter group is initially created with the default parameters for the database engine used by the DB
   instance. To provide custom values for any of the parameters, you must modify the group after creating it using
   ModifyDBParameterGroup. Once you've created a DB parameter group, you need to associate it with your DB
   instance using ModifyDBInstance. When you associate a new DB parameter group with a running DB instance,
   you need to reboot the DB instance without failover for the new DB parameter group and associated settings to
   take effect.



   After you create a DB parameter group, you should wait at least 5 minutes before creating your first DB instance
   that uses that DB parameter group as the default parameter group. This allows Amazon RDS to fully complete the
   create action before the parameter group is used as the default for a new DB instance. This is especially
   important for parameters that are critical when creating the default database for a DB instance, such as the
   character set for the default database defined by the character_set_database parameter. You can use
   the Parameter Groups option of the Amazon RDS console or
   the DescribeDBParameters command to verify that your DB parameter group has been created or modified.

  create-db-parameter-group-request - `com.amazonaws.services.rds.model.CreateDBParameterGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDBParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBParameterGroup>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.CreateDBParameterGroupRequest create-db-parameter-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDBParameterGroupAsync create-db-parameter-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.CreateDBParameterGroupRequest create-db-parameter-group-request]
    (-> this (.createDBParameterGroupAsync create-db-parameter-group-request))))

(defn promote-read-replica-db-cluster-async
  "Promotes a Read Replica DB cluster to a standalone DB cluster.



   This action only applies to Aurora DB clusters.

  promote-read-replica-db-cluster-request - `com.amazonaws.services.rds.model.PromoteReadReplicaDBClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PromoteReadReplicaDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBCluster>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.PromoteReadReplicaDBClusterRequest promote-read-replica-db-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.promoteReadReplicaDBClusterAsync promote-read-replica-db-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.PromoteReadReplicaDBClusterRequest promote-read-replica-db-cluster-request]
    (-> this (.promoteReadReplicaDBClusterAsync promote-read-replica-db-cluster-request))))

(defn copy-db-snapshot-async
  "Copies the specified DB snapshot. The source DB snapshot must be in the \"available\" state.


   You can copy a snapshot from one AWS Region to another. In that case, the AWS Region where you call the
   CopyDBSnapshot action is the destination AWS Region for the DB snapshot copy.


   For more information about copying snapshots, see Copying a DB Snapshot
   in the Amazon RDS User Guide.

  copy-db-snapshot-request - `com.amazonaws.services.rds.model.CopyDBSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CopyDBSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBSnapshot>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.CopyDBSnapshotRequest copy-db-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.copyDBSnapshotAsync copy-db-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.CopyDBSnapshotRequest copy-db-snapshot-request]
    (-> this (.copyDBSnapshotAsync copy-db-snapshot-request))))

(defn create-db-cluster-async
  "Creates a new Amazon Aurora DB cluster.


   You can use the ReplicationSourceIdentifier parameter to create the DB cluster as a Read Replica of
   another DB cluster or Amazon RDS MySQL DB instance. For cross-region replication where the DB cluster identified
   by ReplicationSourceIdentifier is encrypted, you must also specify the PreSignedUrl
   parameter.


   For more information on Amazon Aurora, see  What Is Amazon
   Aurora? in the Amazon Aurora User Guide.



   This action only applies to Aurora DB clusters.

  create-db-cluster-request - `com.amazonaws.services.rds.model.CreateDBClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBCluster>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.CreateDBClusterRequest create-db-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDBClusterAsync create-db-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.CreateDBClusterRequest create-db-cluster-request]
    (-> this (.createDBClusterAsync create-db-cluster-request))))

(defn modify-db-cluster-async
  "Modify a setting for an Amazon Aurora DB cluster. You can change one or more database configuration parameters by
   specifying these parameters and the new values in the request. For more information on Amazon Aurora, see  What Is Amazon
   Aurora? in the Amazon Aurora User Guide.



   This action only applies to Aurora DB clusters.

  modify-db-cluster-request - `com.amazonaws.services.rds.model.ModifyDBClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBCluster>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.ModifyDBClusterRequest modify-db-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyDBClusterAsync modify-db-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.ModifyDBClusterRequest modify-db-cluster-request]
    (-> this (.modifyDBClusterAsync modify-db-cluster-request))))

(defn restore-db-instance-from-s-3-async
  "Amazon Relational Database Service (Amazon RDS) supports importing MySQL databases by using backup files. You can
   create a backup of your on-premises database, store it on Amazon Simple Storage Service (Amazon S3), and then
   restore the backup file onto a new Amazon RDS DB instance running MySQL. For more information, see Importing Data into
   an Amazon RDS MySQL DB Instance in the Amazon RDS User Guide.

  restore-db-instance-from-s-3-request - `com.amazonaws.services.rds.model.RestoreDBInstanceFromS3Request`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestoreDBInstanceFromS3 operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBInstance>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.RestoreDBInstanceFromS3Request restore-db-instance-from-s-3-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restoreDBInstanceFromS3Async restore-db-instance-from-s-3-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.RestoreDBInstanceFromS3Request restore-db-instance-from-s-3-request]
    (-> this (.restoreDBInstanceFromS3Async restore-db-instance-from-s-3-request))))

(defn describe-orderable-db-instance-options-async
  "Returns a list of orderable DB instance options for the specified engine.

  describe-orderable-db-instance-options-request - `com.amazonaws.services.rds.model.DescribeOrderableDBInstanceOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeOrderableDBInstanceOptions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeOrderableDBInstanceOptionsResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeOrderableDBInstanceOptionsRequest describe-orderable-db-instance-options-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeOrderableDBInstanceOptionsAsync describe-orderable-db-instance-options-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeOrderableDBInstanceOptionsRequest describe-orderable-db-instance-options-request]
    (-> this (.describeOrderableDBInstanceOptionsAsync describe-orderable-db-instance-options-request))))

(defn modify-db-snapshot-async
  "Updates a manual DB snapshot, which can be encrypted or not encrypted, with a new engine version.


   Amazon RDS supports upgrading DB snapshots for MySQL and Oracle.

  modify-db-snapshot-request - `com.amazonaws.services.rds.model.ModifyDBSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyDBSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBSnapshot>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.ModifyDBSnapshotRequest modify-db-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyDBSnapshotAsync modify-db-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.ModifyDBSnapshotRequest modify-db-snapshot-request]
    (-> this (.modifyDBSnapshotAsync modify-db-snapshot-request))))

(defn create-db-instance-read-replica-async
  "Creates a new DB instance that acts as a Read Replica for an existing source DB instance. You can create a Read
   Replica for a DB instance running MySQL, MariaDB, Oracle, or PostgreSQL. For more information, see Working with Read Replicas
   in the Amazon RDS User Guide.


   Amazon Aurora doesn't support this action. You must call the CreateDBInstance action to create a DB
   instance for an Aurora DB cluster.


   All Read Replica DB instances are created with backups disabled. All other DB instance attributes (including DB
   security groups and DB parameter groups) are inherited from the source DB instance, except as specified
   following.



   Your source DB instance must have backup retention enabled.

  create-db-instance-read-replica-request - `com.amazonaws.services.rds.model.CreateDBInstanceReadReplicaRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDBInstanceReadReplica operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBInstance>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.CreateDBInstanceReadReplicaRequest create-db-instance-read-replica-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDBInstanceReadReplicaAsync create-db-instance-read-replica-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.CreateDBInstanceReadReplicaRequest create-db-instance-read-replica-request]
    (-> this (.createDBInstanceReadReplicaAsync create-db-instance-read-replica-request))))

(defn describe-db-engine-versions-async
  "Returns a list of the available DB engines.

  describe-db-engine-versions-request - `com.amazonaws.services.rds.model.DescribeDBEngineVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBEngineVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeDBEngineVersionsResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeDBEngineVersionsRequest describe-db-engine-versions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBEngineVersionsAsync describe-db-engine-versions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeDBEngineVersionsRequest describe-db-engine-versions-request]
    (-> this (.describeDBEngineVersionsAsync describe-db-engine-versions-request)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this]
    (-> this (.describeDBEngineVersionsAsync))))

(defn restore-db-cluster-to-point-in-time-async
  "Restores a DB cluster to an arbitrary point in time. Users can restore to any point in time before
   LatestRestorableTime for up to BackupRetentionPeriod days. The target DB cluster is
   created from the source DB cluster with the same configuration as the original DB cluster, except that the new DB
   cluster is created with the default DB security group.



   This action only restores the DB cluster, not the DB instances for that DB cluster. You must invoke the
   CreateDBInstance action to create DB instances for the restored DB cluster, specifying the
   identifier of the restored DB cluster in DBClusterIdentifier. You can create DB instances only after
   the RestoreDBClusterToPointInTime action has completed and the DB cluster is available.



   For more information on Amazon Aurora, see  What Is Amazon
   Aurora? in the Amazon Aurora User Guide.



   This action only applies to Aurora DB clusters.

  restore-db-cluster-to-point-in-time-request - `com.amazonaws.services.rds.model.RestoreDBClusterToPointInTimeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestoreDBClusterToPointInTime operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBCluster>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.RestoreDBClusterToPointInTimeRequest restore-db-cluster-to-point-in-time-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restoreDBClusterToPointInTimeAsync restore-db-cluster-to-point-in-time-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.RestoreDBClusterToPointInTimeRequest restore-db-cluster-to-point-in-time-request]
    (-> this (.restoreDBClusterToPointInTimeAsync restore-db-cluster-to-point-in-time-request))))

(defn describe-db-parameters-async
  "Returns the detailed parameter list for a particular DB parameter group.

  describe-db-parameters-request - `com.amazonaws.services.rds.model.DescribeDBParametersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBParameters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeDBParametersResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeDBParametersRequest describe-db-parameters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBParametersAsync describe-db-parameters-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeDBParametersRequest describe-db-parameters-request]
    (-> this (.describeDBParametersAsync describe-db-parameters-request))))

(defn describe-db-cluster-endpoints-async
  "Returns information about endpoints for an Amazon Aurora DB cluster.



   This action only applies to Aurora DB clusters.

  describe-db-cluster-endpoints-request - `com.amazonaws.services.rds.model.DescribeDBClusterEndpointsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBClusterEndpoints operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeDBClusterEndpointsResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeDBClusterEndpointsRequest describe-db-cluster-endpoints-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBClusterEndpointsAsync describe-db-cluster-endpoints-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeDBClusterEndpointsRequest describe-db-cluster-endpoints-request]
    (-> this (.describeDBClusterEndpointsAsync describe-db-cluster-endpoints-request))))

(defn create-db-instance-async
  "Creates a new DB instance.

  create-db-instance-request - `com.amazonaws.services.rds.model.CreateDBInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDBInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBInstance>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.CreateDBInstanceRequest create-db-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDBInstanceAsync create-db-instance-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.CreateDBInstanceRequest create-db-instance-request]
    (-> this (.createDBInstanceAsync create-db-instance-request))))

(defn create-db-security-group-async
  "Creates a new DB security group. DB security groups control access to a DB instance.



   A DB security group controls access to EC2-Classic DB instances that are not in a VPC.

  create-db-security-group-request - `com.amazonaws.services.rds.model.CreateDBSecurityGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDBSecurityGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBSecurityGroup>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.CreateDBSecurityGroupRequest create-db-security-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDBSecurityGroupAsync create-db-security-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.CreateDBSecurityGroupRequest create-db-security-group-request]
    (-> this (.createDBSecurityGroupAsync create-db-security-group-request))))

(defn describe-reserved-db-instances-offerings-async
  "Lists available reserved DB instance offerings.

  describe-reserved-db-instances-offerings-request - `com.amazonaws.services.rds.model.DescribeReservedDBInstancesOfferingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReservedDBInstancesOfferings operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeReservedDBInstancesOfferingsResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeReservedDBInstancesOfferingsRequest describe-reserved-db-instances-offerings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReservedDBInstancesOfferingsAsync describe-reserved-db-instances-offerings-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeReservedDBInstancesOfferingsRequest describe-reserved-db-instances-offerings-request]
    (-> this (.describeReservedDBInstancesOfferingsAsync describe-reserved-db-instances-offerings-request)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this]
    (-> this (.describeReservedDBInstancesOfferingsAsync))))

(defn create-event-subscription-async
  "Creates an RDS event notification subscription. This action requires a topic ARN (Amazon Resource Name) created
   by either the RDS console, the SNS console, or the SNS API. To obtain an ARN with SNS, you must create a topic in
   Amazon SNS and subscribe to the topic. The ARN is displayed in the SNS console.


   You can specify the type of source (SourceType) you want to be notified of, provide a list of RDS sources
   (SourceIds) that triggers the events, and provide a list of event categories (EventCategories) for events you
   want to be notified of. For example, you can specify SourceType = db-instance, SourceIds = mydbinstance1,
   mydbinstance2 and EventCategories = Availability, Backup.


   If you specify both the SourceType and SourceIds, such as SourceType = db-instance and SourceIdentifier =
   myDBInstance1, you are notified of all the db-instance events for the specified source. If you specify a
   SourceType but do not specify a SourceIdentifier, you receive notice of the events for that source type for all
   your RDS sources. If you do not specify either the SourceType nor the SourceIdentifier, you are notified of
   events generated from all RDS sources belonging to your customer account.

  create-event-subscription-request - `com.amazonaws.services.rds.model.CreateEventSubscriptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateEventSubscription operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.EventSubscription>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.CreateEventSubscriptionRequest create-event-subscription-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createEventSubscriptionAsync create-event-subscription-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.CreateEventSubscriptionRequest create-event-subscription-request]
    (-> this (.createEventSubscriptionAsync create-event-subscription-request))))

(defn reboot-db-instance-async
  "You might need to reboot your DB instance, usually for maintenance reasons. For example, if you make certain
   modifications, or if you change the DB parameter group associated with the DB instance, you must reboot the
   instance for the changes to take effect.


   Rebooting a DB instance restarts the database engine service. Rebooting a DB instance results in a momentary
   outage, during which the DB instance status is set to rebooting.


   For more information about rebooting, see Rebooting a DB
   Instance in the Amazon RDS User Guide.

  reboot-db-instance-request - `com.amazonaws.services.rds.model.RebootDBInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RebootDBInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBInstance>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.RebootDBInstanceRequest reboot-db-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rebootDBInstanceAsync reboot-db-instance-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.RebootDBInstanceRequest reboot-db-instance-request]
    (-> this (.rebootDBInstanceAsync reboot-db-instance-request))))

(defn delete-global-cluster-async
  "Deletes a global database cluster. The primary and secondary clusters must already be detached or destroyed
   first.



   This action only applies to Aurora DB clusters.

  delete-global-cluster-request - `com.amazonaws.services.rds.model.DeleteGlobalClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteGlobalCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.GlobalCluster>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DeleteGlobalClusterRequest delete-global-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteGlobalClusterAsync delete-global-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DeleteGlobalClusterRequest delete-global-cluster-request]
    (-> this (.deleteGlobalClusterAsync delete-global-cluster-request))))

(defn describe-pending-maintenance-actions-async
  "Returns a list of resources (for example, DB instances) that have at least one pending maintenance action.

  describe-pending-maintenance-actions-request - `com.amazonaws.services.rds.model.DescribePendingMaintenanceActionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePendingMaintenanceActions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribePendingMaintenanceActionsResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribePendingMaintenanceActionsRequest describe-pending-maintenance-actions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePendingMaintenanceActionsAsync describe-pending-maintenance-actions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribePendingMaintenanceActionsRequest describe-pending-maintenance-actions-request]
    (-> this (.describePendingMaintenanceActionsAsync describe-pending-maintenance-actions-request)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this]
    (-> this (.describePendingMaintenanceActionsAsync))))

(defn add-role-to-db-cluster-async
  "Associates an Identity and Access Management (IAM) role from an Amazon Aurora DB cluster. For more information,
   see Authorizing Amazon Aurora MySQL to Access Other AWS Services on Your Behalf in the Amazon Aurora User
   Guide.



   This action only applies to Aurora DB clusters.

  add-role-to-db-cluster-request - `com.amazonaws.services.rds.model.AddRoleToDBClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddRoleToDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.AddRoleToDBClusterResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.AddRoleToDBClusterRequest add-role-to-db-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addRoleToDBClusterAsync add-role-to-db-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.AddRoleToDBClusterRequest add-role-to-db-cluster-request]
    (-> this (.addRoleToDBClusterAsync add-role-to-db-cluster-request))))

(defn modify-option-group-async
  "Modifies an existing option group.

  modify-option-group-request - `com.amazonaws.services.rds.model.ModifyOptionGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyOptionGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.OptionGroup>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.ModifyOptionGroupRequest modify-option-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyOptionGroupAsync modify-option-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.ModifyOptionGroupRequest modify-option-group-request]
    (-> this (.modifyOptionGroupAsync modify-option-group-request))))

(defn create-db-subnet-group-async
  "Creates a new DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in the AWS
   Region.

  create-db-subnet-group-request - `com.amazonaws.services.rds.model.CreateDBSubnetGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDBSubnetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBSubnetGroup>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.CreateDBSubnetGroupRequest create-db-subnet-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDBSubnetGroupAsync create-db-subnet-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.CreateDBSubnetGroupRequest create-db-subnet-group-request]
    (-> this (.createDBSubnetGroupAsync create-db-subnet-group-request))))

(defn delete-db-cluster-parameter-group-async
  "Deletes a specified DB cluster parameter group. The DB cluster parameter group to be deleted can't be associated
   with any DB clusters.


   For more information on Amazon Aurora, see  What Is Amazon
   Aurora? in the Amazon Aurora User Guide.



   This action only applies to Aurora DB clusters.

  delete-db-cluster-parameter-group-request - `com.amazonaws.services.rds.model.DeleteDBClusterParameterGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDBClusterParameterGroup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DeleteDBClusterParameterGroupResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DeleteDBClusterParameterGroupRequest delete-db-cluster-parameter-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDBClusterParameterGroupAsync delete-db-cluster-parameter-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DeleteDBClusterParameterGroupRequest delete-db-cluster-parameter-group-request]
    (-> this (.deleteDBClusterParameterGroupAsync delete-db-cluster-parameter-group-request))))

(defn describe-option-groups-async
  "Describes the available option groups.

  describe-option-groups-request - `com.amazonaws.services.rds.model.DescribeOptionGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeOptionGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeOptionGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeOptionGroupsRequest describe-option-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeOptionGroupsAsync describe-option-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeOptionGroupsRequest describe-option-groups-request]
    (-> this (.describeOptionGroupsAsync describe-option-groups-request)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this]
    (-> this (.describeOptionGroupsAsync))))

(defn describe-db-instance-automated-backups-async
  "Displays backups for both current and deleted instances. For example, use this operation to find details about
   automated backups for previously deleted instances. Current instances with retention periods greater than zero
   (0) are returned for both the DescribeDBInstanceAutomatedBackups and
   DescribeDBInstances operations.


   All parameters are optional.

  describe-db-instance-automated-backups-request - Parameter input for DescribeDBInstanceAutomatedBackups. - `com.amazonaws.services.rds.model.DescribeDBInstanceAutomatedBackupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBInstanceAutomatedBackups operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeDBInstanceAutomatedBackupsResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeDBInstanceAutomatedBackupsRequest describe-db-instance-automated-backups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBInstanceAutomatedBackupsAsync describe-db-instance-automated-backups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeDBInstanceAutomatedBackupsRequest describe-db-instance-automated-backups-request]
    (-> this (.describeDBInstanceAutomatedBackupsAsync describe-db-instance-automated-backups-request))))

(defn authorize-db-security-group-ingress-async
  "Enables ingress to a DBSecurityGroup using one of two forms of authorization. First, EC2 or VPC security groups
   can be added to the DBSecurityGroup if the application using the database is running on EC2 or VPC instances.
   Second, IP ranges are available if the application accessing your database is running on the Internet. Required
   parameters for this API are one of CIDR range, EC2SecurityGroupId for VPC, or (EC2SecurityGroupOwnerId and either
   EC2SecurityGroupName or EC2SecurityGroupId for non-VPC).



   You can't authorize ingress from an EC2 security group in one AWS Region to an Amazon RDS DB instance in another.
   You can't authorize ingress from a VPC security group in one VPC to an Amazon RDS DB instance in another.



   For an overview of CIDR ranges, go to the Wikipedia Tutorial.

  authorize-db-security-group-ingress-request - `com.amazonaws.services.rds.model.AuthorizeDBSecurityGroupIngressRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AuthorizeDBSecurityGroupIngress operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBSecurityGroup>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.AuthorizeDBSecurityGroupIngressRequest authorize-db-security-group-ingress-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.authorizeDBSecurityGroupIngressAsync authorize-db-security-group-ingress-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.AuthorizeDBSecurityGroupIngressRequest authorize-db-security-group-ingress-request]
    (-> this (.authorizeDBSecurityGroupIngressAsync authorize-db-security-group-ingress-request))))

(defn describe-db-cluster-snapshot-attributes-async
  "Returns a list of DB cluster snapshot attribute names and values for a manual DB cluster snapshot.


   When sharing snapshots with other AWS accounts, DescribeDBClusterSnapshotAttributes returns the
   restore attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the
   manual DB cluster snapshot. If all is included in the list of values for the restore
   attribute, then the manual DB cluster snapshot is public and can be copied or restored by all AWS accounts.


   To add or remove access for an AWS account to copy or restore a manual DB cluster snapshot, or to make the manual
   DB cluster snapshot public or private, use the ModifyDBClusterSnapshotAttribute API action.



   This action only applies to Aurora DB clusters.

  describe-db-cluster-snapshot-attributes-request - `com.amazonaws.services.rds.model.DescribeDBClusterSnapshotAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBClusterSnapshotAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBClusterSnapshotAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeDBClusterSnapshotAttributesRequest describe-db-cluster-snapshot-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBClusterSnapshotAttributesAsync describe-db-cluster-snapshot-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeDBClusterSnapshotAttributesRequest describe-db-cluster-snapshot-attributes-request]
    (-> this (.describeDBClusterSnapshotAttributesAsync describe-db-cluster-snapshot-attributes-request))))

(defn create-db-cluster-snapshot-async
  "Creates a snapshot of a DB cluster. For more information on Amazon Aurora, see  What Is Amazon
   Aurora? in the Amazon Aurora User Guide.



   This action only applies to Aurora DB clusters.

  create-db-cluster-snapshot-request - `com.amazonaws.services.rds.model.CreateDBClusterSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDBClusterSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBClusterSnapshot>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.CreateDBClusterSnapshotRequest create-db-cluster-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDBClusterSnapshotAsync create-db-cluster-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.CreateDBClusterSnapshotRequest create-db-cluster-snapshot-request]
    (-> this (.createDBClusterSnapshotAsync create-db-cluster-snapshot-request))))

(defn describe-db-cluster-backtracks-async
  "Returns information about backtracks for a DB cluster.


   For more information on Amazon Aurora, see  What Is Amazon
   Aurora? in the Amazon Aurora User Guide.



   This action only applies to Aurora DB clusters.

  describe-db-cluster-backtracks-request - `com.amazonaws.services.rds.model.DescribeDBClusterBacktracksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBClusterBacktracks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeDBClusterBacktracksResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeDBClusterBacktracksRequest describe-db-cluster-backtracks-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBClusterBacktracksAsync describe-db-cluster-backtracks-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeDBClusterBacktracksRequest describe-db-cluster-backtracks-request]
    (-> this (.describeDBClusterBacktracksAsync describe-db-cluster-backtracks-request))))

(defn restore-db-instance-from-db-snapshot-async
  "Creates a new DB instance from a DB snapshot. The target database is created from the source database restore
   point with the most of original configuration with the default security group and the default DB parameter group.
   By default, the new DB instance is created as a single-AZ deployment except when the instance is a SQL Server
   instance that has an option group that is associated with mirroring; in this case, the instance becomes a
   mirrored AZ deployment and not a single-AZ deployment.


   If your intent is to replace your original DB instance with the new, restored DB instance, then rename your
   original DB instance before you call the RestoreDBInstanceFromDBSnapshot action. RDS doesn't allow two DB
   instances with the same name. Once you have renamed your original DB instance with a different identifier, then
   you can pass the original name of the DB instance as the DBInstanceIdentifier in the call to the
   RestoreDBInstanceFromDBSnapshot action. The result is that you will replace the original DB instance with the DB
   instance created from the snapshot.


   If you are restoring from a shared manual DB snapshot, the DBSnapshotIdentifier must be the ARN of
   the shared DB snapshot.



   This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora, use
   RestoreDBClusterFromSnapshot.

  restore-db-instance-from-db-snapshot-request - `com.amazonaws.services.rds.model.RestoreDBInstanceFromDBSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestoreDBInstanceFromDBSnapshot operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBInstance>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.RestoreDBInstanceFromDBSnapshotRequest restore-db-instance-from-db-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restoreDBInstanceFromDBSnapshotAsync restore-db-instance-from-db-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.RestoreDBInstanceFromDBSnapshotRequest restore-db-instance-from-db-snapshot-request]
    (-> this (.restoreDBInstanceFromDBSnapshotAsync restore-db-instance-from-db-snapshot-request))))

(defn start-activity-stream-async
  "Starts a database activity stream to monitor activity on the database. For more information, see Database Activity
   Streams in the Amazon Aurora User Guide.

  start-activity-stream-request - `com.amazonaws.services.rds.model.StartActivityStreamRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartActivityStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.StartActivityStreamResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.StartActivityStreamRequest start-activity-stream-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startActivityStreamAsync start-activity-stream-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.StartActivityStreamRequest start-activity-stream-request]
    (-> this (.startActivityStreamAsync start-activity-stream-request))))

(defn modify-db-cluster-parameter-group-async
  "Modifies the parameters of a DB cluster parameter group. To modify more than one parameter, submit a list of the
   following: ParameterName, ParameterValue, and ApplyMethod. A maximum of 20
   parameters can be modified in a single request.


   For more information on Amazon Aurora, see  What Is Amazon
   Aurora? in the Amazon Aurora User Guide.



   Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot without
   failover to the DB cluster associated with the parameter group before the change can take effect.



   After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB
   cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon RDS to fully
   complete the create action before the parameter group is used as the default for a new DB cluster. This is
   especially important for parameters that are critical when creating the default database for a DB cluster, such
   as the character set for the default database defined by the character_set_database parameter. You
   can use the Parameter Groups option of the Amazon RDS
   console or the DescribeDBClusterParameters action to verify that your DB cluster parameter group
   has been created or modified.



   This action only applies to Aurora DB clusters.

  modify-db-cluster-parameter-group-request - `com.amazonaws.services.rds.model.ModifyDBClusterParameterGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyDBClusterParameterGroup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.ModifyDBClusterParameterGroupResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.ModifyDBClusterParameterGroupRequest modify-db-cluster-parameter-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyDBClusterParameterGroupAsync modify-db-cluster-parameter-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.ModifyDBClusterParameterGroupRequest modify-db-cluster-parameter-group-request]
    (-> this (.modifyDBClusterParameterGroupAsync modify-db-cluster-parameter-group-request))))

(defn purchase-reserved-db-instances-offering-async
  "Purchases a reserved DB instance offering.

  purchase-reserved-db-instances-offering-request - `com.amazonaws.services.rds.model.PurchaseReservedDBInstancesOfferingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PurchaseReservedDBInstancesOffering operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.ReservedDBInstance>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.PurchaseReservedDBInstancesOfferingRequest purchase-reserved-db-instances-offering-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.purchaseReservedDBInstancesOfferingAsync purchase-reserved-db-instances-offering-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.PurchaseReservedDBInstancesOfferingRequest purchase-reserved-db-instances-offering-request]
    (-> this (.purchaseReservedDBInstancesOfferingAsync purchase-reserved-db-instances-offering-request))))

(defn describe-db-snapshot-attributes-async
  "Returns a list of DB snapshot attribute names and values for a manual DB snapshot.


   When sharing snapshots with other AWS accounts, DescribeDBSnapshotAttributes returns the
   restore attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the
   manual DB snapshot. If all is included in the list of values for the restore attribute,
   then the manual DB snapshot is public and can be copied or restored by all AWS accounts.


   To add or remove access for an AWS account to copy or restore a manual DB snapshot, or to make the manual DB
   snapshot public or private, use the ModifyDBSnapshotAttribute API action.

  describe-db-snapshot-attributes-request - `com.amazonaws.services.rds.model.DescribeDBSnapshotAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBSnapshotAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBSnapshotAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeDBSnapshotAttributesRequest describe-db-snapshot-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBSnapshotAttributesAsync describe-db-snapshot-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeDBSnapshotAttributesRequest describe-db-snapshot-attributes-request]
    (-> this (.describeDBSnapshotAttributesAsync describe-db-snapshot-attributes-request)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this]
    (-> this (.describeDBSnapshotAttributesAsync))))

(defn restore-db-instance-to-point-in-time-async
  "Restores a DB instance to an arbitrary point in time. You can restore to any point in time before the time
   identified by the LatestRestorableTime property. You can restore to a point up to the number of days specified by
   the BackupRetentionPeriod property.


   The target database is created with most of the original configuration, but in a system-selected Availability
   Zone, with the default security group, the default subnet group, and the default DB parameter group. By default,
   the new DB instance is created as a single-AZ deployment except when the instance is a SQL Server instance that
   has an option group that is associated with mirroring; in this case, the instance becomes a mirrored deployment
   and not a single-AZ deployment.



   This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora, use
   RestoreDBClusterToPointInTime.

  restore-db-instance-to-point-in-time-request - `com.amazonaws.services.rds.model.RestoreDBInstanceToPointInTimeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestoreDBInstanceToPointInTime operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBInstance>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.RestoreDBInstanceToPointInTimeRequest restore-db-instance-to-point-in-time-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restoreDBInstanceToPointInTimeAsync restore-db-instance-to-point-in-time-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.RestoreDBInstanceToPointInTimeRequest restore-db-instance-to-point-in-time-request]
    (-> this (.restoreDBInstanceToPointInTimeAsync restore-db-instance-to-point-in-time-request))))

(defn create-global-cluster-async
  "Creates an Aurora global database spread across multiple regions. The global database contains a single primary
   cluster with read-write capability, and a read-only secondary cluster that receives data from the primary cluster
   through high-speed replication performed by the Aurora storage subsystem.


   You can create a global database that is initially empty, and then add a primary cluster and a secondary cluster
   to it. Or you can specify an existing Aurora cluster during the create operation, and this cluster becomes the
   primary cluster of the global database.



   This action only applies to Aurora DB clusters.

  create-global-cluster-request - `com.amazonaws.services.rds.model.CreateGlobalClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateGlobalCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.GlobalCluster>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.CreateGlobalClusterRequest create-global-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createGlobalClusterAsync create-global-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.CreateGlobalClusterRequest create-global-cluster-request]
    (-> this (.createGlobalClusterAsync create-global-cluster-request))))

(defn modify-db-cluster-endpoint-async
  "Modifies the properties of an endpoint in an Amazon Aurora DB cluster.



   This action only applies to Aurora DB clusters.

  modify-db-cluster-endpoint-request - `com.amazonaws.services.rds.model.ModifyDBClusterEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyDBClusterEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.ModifyDBClusterEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.ModifyDBClusterEndpointRequest modify-db-cluster-endpoint-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyDBClusterEndpointAsync modify-db-cluster-endpoint-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.ModifyDBClusterEndpointRequest modify-db-cluster-endpoint-request]
    (-> this (.modifyDBClusterEndpointAsync modify-db-cluster-endpoint-request))))

(defn modify-db-instance-async
  "Modifies settings for a DB instance. You can change one or more database configuration parameters by specifying
   these parameters and the new values in the request. To learn what modifications you can make to your DB instance,
   call DescribeValidDBInstanceModifications before you call ModifyDBInstance.

  modify-db-instance-request - `com.amazonaws.services.rds.model.ModifyDBInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyDBInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBInstance>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.ModifyDBInstanceRequest modify-db-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyDBInstanceAsync modify-db-instance-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.ModifyDBInstanceRequest modify-db-instance-request]
    (-> this (.modifyDBInstanceAsync modify-db-instance-request))))

(defn restore-db-cluster-from-snapshot-async
  "Creates a new DB cluster from a DB snapshot or DB cluster snapshot.


   If a DB snapshot is specified, the target DB cluster is created from the source DB snapshot with a default
   configuration and default security group.


   If a DB cluster snapshot is specified, the target DB cluster is created from the source DB cluster restore point
   with the same configuration as the original source DB cluster, except that the new DB cluster is created with the
   default security group.


   For more information on Amazon Aurora, see  What Is Amazon
   Aurora? in the Amazon Aurora User Guide.



   This action only applies to Aurora DB clusters.

  restore-db-cluster-from-snapshot-request - `com.amazonaws.services.rds.model.RestoreDBClusterFromSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestoreDBClusterFromSnapshot operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBCluster>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.RestoreDBClusterFromSnapshotRequest restore-db-cluster-from-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restoreDBClusterFromSnapshotAsync restore-db-cluster-from-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.RestoreDBClusterFromSnapshotRequest restore-db-cluster-from-snapshot-request]
    (-> this (.restoreDBClusterFromSnapshotAsync restore-db-cluster-from-snapshot-request))))

(defn remove-from-global-cluster-async
  "Detaches an Aurora secondary cluster from an Aurora global database cluster. The cluster becomes a standalone
   cluster with read-write capability instead of being read-only and receiving data from a primary cluster in a
   different region.



   This action only applies to Aurora DB clusters.

  remove-from-global-cluster-request - `com.amazonaws.services.rds.model.RemoveFromGlobalClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveFromGlobalCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.GlobalCluster>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.RemoveFromGlobalClusterRequest remove-from-global-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeFromGlobalClusterAsync remove-from-global-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.RemoveFromGlobalClusterRequest remove-from-global-cluster-request]
    (-> this (.removeFromGlobalClusterAsync remove-from-global-cluster-request))))

(defn promote-read-replica-async
  "Promotes a Read Replica DB instance to a standalone DB instance.





   Backup duration is a function of the amount of changes to the database since the previous backup. If you plan to
   promote a Read Replica to a standalone instance, we recommend that you enable backups and complete at least one
   backup prior to promotion. In addition, a Read Replica cannot be promoted to a standalone instance when it is in
   the backing-up status. If you have enabled backups on your Read Replica, configure the automated
   backup window so that daily backups do not interfere with Read Replica promotion.




   This command doesn't apply to Aurora MySQL and Aurora PostgreSQL.

  promote-read-replica-request - `com.amazonaws.services.rds.model.PromoteReadReplicaRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PromoteReadReplica operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBInstance>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.PromoteReadReplicaRequest promote-read-replica-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.promoteReadReplicaAsync promote-read-replica-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.PromoteReadReplicaRequest promote-read-replica-request]
    (-> this (.promoteReadReplicaAsync promote-read-replica-request))))

(defn create-db-cluster-endpoint-async
  "Creates a new custom endpoint and associates it with an Amazon Aurora DB cluster.



   This action only applies to Aurora DB clusters.

  create-db-cluster-endpoint-request - `com.amazonaws.services.rds.model.CreateDBClusterEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDBClusterEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.CreateDBClusterEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.CreateDBClusterEndpointRequest create-db-cluster-endpoint-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDBClusterEndpointAsync create-db-cluster-endpoint-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.CreateDBClusterEndpointRequest create-db-cluster-endpoint-request]
    (-> this (.createDBClusterEndpointAsync create-db-cluster-endpoint-request))))

(defn remove-tags-from-resource-async
  "Removes metadata tags from an Amazon RDS resource.


   For an overview on tagging an Amazon RDS resource, see Tagging Amazon RDS
   Resources in the Amazon RDS User Guide.

  remove-tags-from-resource-request - `com.amazonaws.services.rds.model.RemoveTagsFromResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveTagsFromResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.RemoveTagsFromResourceResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.RemoveTagsFromResourceRequest remove-tags-from-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeTagsFromResourceAsync remove-tags-from-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.RemoveTagsFromResourceRequest remove-tags-from-resource-request]
    (-> this (.removeTagsFromResourceAsync remove-tags-from-resource-request))))

(defn describe-event-subscriptions-async
  "Lists all the subscription descriptions for a customer account. The description for a subscription includes
   SubscriptionName, SNSTopicARN, CustomerID, SourceType, SourceID, CreationTime, and Status.


   If you specify a SubscriptionName, lists the description for that subscription.

  describe-event-subscriptions-request - `com.amazonaws.services.rds.model.DescribeEventSubscriptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEventSubscriptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeEventSubscriptionsResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeEventSubscriptionsRequest describe-event-subscriptions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventSubscriptionsAsync describe-event-subscriptions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeEventSubscriptionsRequest describe-event-subscriptions-request]
    (-> this (.describeEventSubscriptionsAsync describe-event-subscriptions-request)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this]
    (-> this (.describeEventSubscriptionsAsync))))

(defn modify-db-parameter-group-async
  "Modifies the parameters of a DB parameter group. To modify more than one parameter, submit a list of the
   following: ParameterName, ParameterValue, and ApplyMethod. A maximum of 20
   parameters can be modified in a single request.



   Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot without
   failover to the DB instance associated with the parameter group before the change can take effect.



   After you modify a DB parameter group, you should wait at least 5 minutes before creating your first DB instance
   that uses that DB parameter group as the default parameter group. This allows Amazon RDS to fully complete the
   modify action before the parameter group is used as the default for a new DB instance. This is especially
   important for parameters that are critical when creating the default database for a DB instance, such as the
   character set for the default database defined by the character_set_database parameter. You can use
   the Parameter Groups option of the Amazon RDS console or
   the DescribeDBParameters command to verify that your DB parameter group has been created or modified.

  modify-db-parameter-group-request - `com.amazonaws.services.rds.model.ModifyDBParameterGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyDBParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.ModifyDBParameterGroupResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.ModifyDBParameterGroupRequest modify-db-parameter-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyDBParameterGroupAsync modify-db-parameter-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.ModifyDBParameterGroupRequest modify-db-parameter-group-request]
    (-> this (.modifyDBParameterGroupAsync modify-db-parameter-group-request))))

(defn describe-option-group-options-async
  "Describes all available options.

  describe-option-group-options-request - `com.amazonaws.services.rds.model.DescribeOptionGroupOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeOptionGroupOptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeOptionGroupOptionsResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeOptionGroupOptionsRequest describe-option-group-options-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeOptionGroupOptionsAsync describe-option-group-options-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeOptionGroupOptionsRequest describe-option-group-options-request]
    (-> this (.describeOptionGroupOptionsAsync describe-option-group-options-request))))

(defn describe-certificates-async
  "Lists the set of CA certificates provided by Amazon RDS for this AWS account.

  describe-certificates-request - `com.amazonaws.services.rds.model.DescribeCertificatesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCertificates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeCertificatesResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeCertificatesRequest describe-certificates-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCertificatesAsync describe-certificates-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeCertificatesRequest describe-certificates-request]
    (-> this (.describeCertificatesAsync describe-certificates-request)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this]
    (-> this (.describeCertificatesAsync))))

(defn list-tags-for-resource-async
  "Lists all tags on an Amazon RDS resource.


   For an overview on tagging an Amazon RDS resource, see Tagging Amazon RDS
   Resources in the Amazon RDS User Guide.

  list-tags-for-resource-request - `com.amazonaws.services.rds.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn delete-db-security-group-async
  "Deletes a DB security group.



   The specified DB security group must not be associated with any DB instances.

  delete-db-security-group-request - `com.amazonaws.services.rds.model.DeleteDBSecurityGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDBSecurityGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DeleteDBSecurityGroupResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DeleteDBSecurityGroupRequest delete-db-security-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDBSecurityGroupAsync delete-db-security-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DeleteDBSecurityGroupRequest delete-db-security-group-request]
    (-> this (.deleteDBSecurityGroupAsync delete-db-security-group-request))))

(defn restore-db-cluster-from-s-3-async
  "Creates an Amazon Aurora DB cluster from data stored in an Amazon S3 bucket. Amazon RDS must be authorized to
   access the Amazon S3 bucket and the data must be created using the Percona XtraBackup utility as described in  Migrating Data to
   an Amazon Aurora MySQL DB Cluster in the Amazon Aurora User Guide.



   This action only applies to Aurora DB clusters.

  restore-db-cluster-from-s-3-request - `com.amazonaws.services.rds.model.RestoreDBClusterFromS3Request`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestoreDBClusterFromS3 operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBCluster>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.RestoreDBClusterFromS3Request restore-db-cluster-from-s-3-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restoreDBClusterFromS3Async restore-db-cluster-from-s-3-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.RestoreDBClusterFromS3Request restore-db-cluster-from-s-3-request]
    (-> this (.restoreDBClusterFromS3Async restore-db-cluster-from-s-3-request))))

(defn copy-option-group-async
  "Copies the specified option group.

  copy-option-group-request - `com.amazonaws.services.rds.model.CopyOptionGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CopyOptionGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.OptionGroup>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.CopyOptionGroupRequest copy-option-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.copyOptionGroupAsync copy-option-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.CopyOptionGroupRequest copy-option-group-request]
    (-> this (.copyOptionGroupAsync copy-option-group-request))))

(defn create-db-cluster-parameter-group-async
  "Creates a new DB cluster parameter group.


   Parameters in a DB cluster parameter group apply to all of the instances in a DB cluster.


   A DB cluster parameter group is initially created with the default parameters for the database engine used by
   instances in the DB cluster. To provide custom values for any of the parameters, you must modify the group after
   creating it using ModifyDBClusterParameterGroup. Once you've created a DB cluster parameter group,
   you need to associate it with your DB cluster using ModifyDBCluster. When you associate a new DB
   cluster parameter group with a running DB cluster, you need to reboot the DB instances in the DB cluster without
   failover for the new DB cluster parameter group and associated settings to take effect.



   After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB
   cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon RDS to fully
   complete the create action before the DB cluster parameter group is used as the default for a new DB cluster.
   This is especially important for parameters that are critical when creating the default database for a DB
   cluster, such as the character set for the default database defined by the character_set_database
   parameter. You can use the Parameter Groups option of the Amazon RDS console or the DescribeDBClusterParameters
   action to verify that your DB cluster parameter group has been created or modified.



   For more information on Amazon Aurora, see  What Is Amazon
   Aurora? in the Amazon Aurora User Guide.



   This action only applies to Aurora DB clusters.

  create-db-cluster-parameter-group-request - `com.amazonaws.services.rds.model.CreateDBClusterParameterGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDBClusterParameterGroup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBClusterParameterGroup>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.CreateDBClusterParameterGroupRequest create-db-cluster-parameter-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDBClusterParameterGroupAsync create-db-cluster-parameter-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.CreateDBClusterParameterGroupRequest create-db-cluster-parameter-group-request]
    (-> this (.createDBClusterParameterGroupAsync create-db-cluster-parameter-group-request))))

(defn delete-db-instance-automated-backup-async
  "Deletes automated backups based on the source instance's DbiResourceId value or the restorable
   instance's resource ID.

  delete-db-instance-automated-backup-request - Parameter input for the DeleteDBInstanceAutomatedBackup operation. - `com.amazonaws.services.rds.model.DeleteDBInstanceAutomatedBackupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDBInstanceAutomatedBackup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBInstanceAutomatedBackup>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DeleteDBInstanceAutomatedBackupRequest delete-db-instance-automated-backup-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDBInstanceAutomatedBackupAsync delete-db-instance-automated-backup-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DeleteDBInstanceAutomatedBackupRequest delete-db-instance-automated-backup-request]
    (-> this (.deleteDBInstanceAutomatedBackupAsync delete-db-instance-automated-backup-request))))

(defn delete-db-cluster-snapshot-async
  "Deletes a DB cluster snapshot. If the snapshot is being copied, the copy operation is terminated.



   The DB cluster snapshot must be in the available state to be deleted.



   For more information on Amazon Aurora, see  What Is Amazon
   Aurora? in the Amazon Aurora User Guide.



   This action only applies to Aurora DB clusters.

  delete-db-cluster-snapshot-request - `com.amazonaws.services.rds.model.DeleteDBClusterSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDBClusterSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBClusterSnapshot>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DeleteDBClusterSnapshotRequest delete-db-cluster-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDBClusterSnapshotAsync delete-db-cluster-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DeleteDBClusterSnapshotRequest delete-db-cluster-snapshot-request]
    (-> this (.deleteDBClusterSnapshotAsync delete-db-cluster-snapshot-request))))

(defn modify-db-snapshot-attribute-async
  "Adds an attribute and values to, or removes an attribute and values from, a manual DB snapshot.


   To share a manual DB snapshot with other AWS accounts, specify restore as the
   AttributeName and use the ValuesToAdd parameter to add a list of IDs of the AWS
   accounts that are authorized to restore the manual DB snapshot. Uses the value all to make the
   manual DB snapshot public, which means it can be copied or restored by all AWS accounts. Do not add the
   all value for any manual DB snapshots that contain private information that you don't want available
   to all AWS accounts. If the manual DB snapshot is encrypted, it can be shared, but only by specifying a list of
   authorized AWS account IDs for the ValuesToAdd parameter. You can't use all as a value
   for that parameter in this case.


   To view which AWS accounts have access to copy or restore a manual DB snapshot, or whether a manual DB snapshot
   public or private, use the DescribeDBSnapshotAttributes API action.

  modify-db-snapshot-attribute-request - `com.amazonaws.services.rds.model.ModifyDBSnapshotAttributeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyDBSnapshotAttribute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBSnapshotAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.ModifyDBSnapshotAttributeRequest modify-db-snapshot-attribute-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyDBSnapshotAttributeAsync modify-db-snapshot-attribute-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.ModifyDBSnapshotAttributeRequest modify-db-snapshot-attribute-request]
    (-> this (.modifyDBSnapshotAttributeAsync modify-db-snapshot-attribute-request))))

(defn describe-engine-default-parameters-async
  "Returns the default engine and system parameter information for the specified database engine.

  describe-engine-default-parameters-request - `com.amazonaws.services.rds.model.DescribeEngineDefaultParametersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEngineDefaultParameters operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.EngineDefaults>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeEngineDefaultParametersRequest describe-engine-default-parameters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEngineDefaultParametersAsync describe-engine-default-parameters-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeEngineDefaultParametersRequest describe-engine-default-parameters-request]
    (-> this (.describeEngineDefaultParametersAsync describe-engine-default-parameters-request))))

(defn delete-db-parameter-group-async
  "Deletes a specified DB parameter group. The DB parameter group to be deleted can't be associated with any DB
   instances.

  delete-db-parameter-group-request - `com.amazonaws.services.rds.model.DeleteDBParameterGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDBParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DeleteDBParameterGroupResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DeleteDBParameterGroupRequest delete-db-parameter-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDBParameterGroupAsync delete-db-parameter-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DeleteDBParameterGroupRequest delete-db-parameter-group-request]
    (-> this (.deleteDBParameterGroupAsync delete-db-parameter-group-request))))

(defn describe-events-async
  "Returns events related to DB instances, DB security groups, DB snapshots, and DB parameter groups for the past 14
   days. Events specific to a particular DB instance, DB security group, database snapshot, or DB parameter group
   can be obtained by providing the name as a parameter. By default, the past hour of events are returned.

  describe-events-request - `com.amazonaws.services.rds.model.DescribeEventsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeEventsResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeEventsRequest describe-events-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventsAsync describe-events-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeEventsRequest describe-events-request]
    (-> this (.describeEventsAsync describe-events-request)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this]
    (-> this (.describeEventsAsync))))

(defn reset-db-parameter-group-async
  "Modifies the parameters of a DB parameter group to the engine/system default value. To reset specific parameters,
   provide a list of the following: ParameterName and ApplyMethod. To reset the entire DB
   parameter group, specify the DBParameterGroup name and ResetAllParameters parameters.
   When resetting the entire group, dynamic parameters are updated immediately and static parameters are set to
   pending-reboot to take effect on the next DB instance restart or RebootDBInstance
   request.

  reset-db-parameter-group-request - `com.amazonaws.services.rds.model.ResetDBParameterGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResetDBParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.ResetDBParameterGroupResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.ResetDBParameterGroupRequest reset-db-parameter-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resetDBParameterGroupAsync reset-db-parameter-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.ResetDBParameterGroupRequest reset-db-parameter-group-request]
    (-> this (.resetDBParameterGroupAsync reset-db-parameter-group-request))))

(defn delete-db-cluster-async
  "The DeleteDBCluster action deletes a previously provisioned DB cluster. When you delete a DB cluster, all
   automated backups for that DB cluster are deleted and can't be recovered. Manual DB cluster snapshots of the
   specified DB cluster are not deleted.



   For more information on Amazon Aurora, see  What Is Amazon
   Aurora? in the Amazon Aurora User Guide.



   This action only applies to Aurora DB clusters.

  delete-db-cluster-request - `com.amazonaws.services.rds.model.DeleteDBClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBCluster>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DeleteDBClusterRequest delete-db-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDBClusterAsync delete-db-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DeleteDBClusterRequest delete-db-cluster-request]
    (-> this (.deleteDBClusterAsync delete-db-cluster-request))))

(defn reset-db-cluster-parameter-group-async
  "Modifies the parameters of a DB cluster parameter group to the default value. To reset specific parameters submit
   a list of the following: ParameterName and ApplyMethod. To reset the entire DB cluster
   parameter group, specify the DBClusterParameterGroupName and ResetAllParameters
   parameters.


   When resetting the entire group, dynamic parameters are updated immediately and static parameters are set to
   pending-reboot to take effect on the next DB instance restart or RebootDBInstance
   request. You must call RebootDBInstance for every DB instance in your DB cluster that you want the
   updated static parameter to apply to.


   For more information on Amazon Aurora, see  What Is Amazon
   Aurora? in the Amazon Aurora User Guide.



   This action only applies to Aurora DB clusters.

  reset-db-cluster-parameter-group-request - `com.amazonaws.services.rds.model.ResetDBClusterParameterGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResetDBClusterParameterGroup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.ResetDBClusterParameterGroupResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.ResetDBClusterParameterGroupRequest reset-db-cluster-parameter-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resetDBClusterParameterGroupAsync reset-db-cluster-parameter-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.ResetDBClusterParameterGroupRequest reset-db-cluster-parameter-group-request]
    (-> this (.resetDBClusterParameterGroupAsync reset-db-cluster-parameter-group-request))))

(defn add-role-to-db-instance-async
  "Associates an AWS Identity and Access Management (IAM) role with a DB instance.



   To add a role to a DB instance, the status of the DB instance must be available.

  add-role-to-db-instance-request - `com.amazonaws.services.rds.model.AddRoleToDBInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddRoleToDBInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.AddRoleToDBInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.AddRoleToDBInstanceRequest add-role-to-db-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addRoleToDBInstanceAsync add-role-to-db-instance-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.AddRoleToDBInstanceRequest add-role-to-db-instance-request]
    (-> this (.addRoleToDBInstanceAsync add-role-to-db-instance-request))))

(defn modify-db-subnet-group-async
  "Modifies an existing DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in
   the AWS Region.

  modify-db-subnet-group-request - `com.amazonaws.services.rds.model.ModifyDBSubnetGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyDBSubnetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBSubnetGroup>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.ModifyDBSubnetGroupRequest modify-db-subnet-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyDBSubnetGroupAsync modify-db-subnet-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.ModifyDBSubnetGroupRequest modify-db-subnet-group-request]
    (-> this (.modifyDBSubnetGroupAsync modify-db-subnet-group-request))))

(defn stop-db-instance-async
  "Stops an Amazon RDS DB instance. When you stop a DB instance, Amazon RDS retains the DB instance's metadata,
   including its endpoint, DB parameter group, and option group membership. Amazon RDS also retains the transaction
   logs so you can do a point-in-time restore if necessary.


   For more information, see  Stopping an Amazon RDS DB
   Instance Temporarily in the Amazon RDS User Guide.



   This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora clusters, use
   StopDBCluster instead.

  stop-db-instance-request - `com.amazonaws.services.rds.model.StopDBInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopDBInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DBInstance>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.StopDBInstanceRequest stop-db-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopDBInstanceAsync stop-db-instance-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.StopDBInstanceRequest stop-db-instance-request]
    (-> this (.stopDBInstanceAsync stop-db-instance-request))))

(defn stop-activity-stream-async
  "Stops a database activity stream that was started using the AWS console, the start-activity-stream
   AWS CLI command, or the StartActivityStream action.


   For more information, see Database Activity
   Streams in the Amazon Aurora User Guide.

  stop-activity-stream-request - `com.amazonaws.services.rds.model.StopActivityStreamRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopActivityStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.StopActivityStreamResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.StopActivityStreamRequest stop-activity-stream-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopActivityStreamAsync stop-activity-stream-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.StopActivityStreamRequest stop-activity-stream-request]
    (-> this (.stopActivityStreamAsync stop-activity-stream-request))))

(defn remove-source-identifier-from-subscription-async
  "Removes a source identifier from an existing RDS event notification subscription.

  remove-source-identifier-from-subscription-request - `com.amazonaws.services.rds.model.RemoveSourceIdentifierFromSubscriptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveSourceIdentifierFromSubscription operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.EventSubscription>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.RemoveSourceIdentifierFromSubscriptionRequest remove-source-identifier-from-subscription-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeSourceIdentifierFromSubscriptionAsync remove-source-identifier-from-subscription-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.RemoveSourceIdentifierFromSubscriptionRequest remove-source-identifier-from-subscription-request]
    (-> this (.removeSourceIdentifierFromSubscriptionAsync remove-source-identifier-from-subscription-request))))

(defn describe-db-instances-async
  "Returns information about provisioned RDS instances. This API supports pagination.

  describe-db-instances-request - `com.amazonaws.services.rds.model.DescribeDBInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeDBInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeDBInstancesRequest describe-db-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBInstancesAsync describe-db-instances-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeDBInstancesRequest describe-db-instances-request]
    (-> this (.describeDBInstancesAsync describe-db-instances-request)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this]
    (-> this (.describeDBInstancesAsync))))

(defn add-tags-to-resource-async
  "Adds metadata tags to an Amazon RDS resource. These tags can also be used with cost allocation reporting to track
   cost associated with Amazon RDS resources, or used in a Condition statement in an IAM policy for Amazon RDS.


   For an overview on tagging Amazon RDS resources, see Tagging Amazon RDS
   Resources.

  add-tags-to-resource-request - `com.amazonaws.services.rds.model.AddTagsToResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddTagsToResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.AddTagsToResourceResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.AddTagsToResourceRequest add-tags-to-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addTagsToResourceAsync add-tags-to-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.AddTagsToResourceRequest add-tags-to-resource-request]
    (-> this (.addTagsToResourceAsync add-tags-to-resource-request))))

(defn describe-db-clusters-async
  "Returns information about provisioned Aurora DB clusters. This API supports pagination.


   For more information on Amazon Aurora, see  What Is Amazon
   Aurora? in the Amazon Aurora User Guide.



   This action only applies to Aurora DB clusters.

  describe-db-clusters-request - `com.amazonaws.services.rds.model.DescribeDBClustersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBClusters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeDBClustersResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeDBClustersRequest describe-db-clusters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBClustersAsync describe-db-clusters-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeDBClustersRequest describe-db-clusters-request]
    (-> this (.describeDBClustersAsync describe-db-clusters-request)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this]
    (-> this (.describeDBClustersAsync))))

(defn describe-db-snapshots-async
  "Returns information about DB snapshots. This API action supports pagination.

  describe-db-snapshots-request - `com.amazonaws.services.rds.model.DescribeDBSnapshotsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBSnapshots operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeDBSnapshotsResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeDBSnapshotsRequest describe-db-snapshots-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBSnapshotsAsync describe-db-snapshots-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeDBSnapshotsRequest describe-db-snapshots-request]
    (-> this (.describeDBSnapshotsAsync describe-db-snapshots-request)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this]
    (-> this (.describeDBSnapshotsAsync))))

(defn backtrack-db-cluster-async
  "Backtracks a DB cluster to a specific time, without creating a new DB cluster.


   For more information on backtracking, see
   Backtracking an Aurora DB Cluster in the Amazon Aurora User Guide.



   This action only applies to Aurora DB clusters.

  backtrack-db-cluster-request - `com.amazonaws.services.rds.model.BacktrackDBClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BacktrackDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.BacktrackDBClusterResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.BacktrackDBClusterRequest backtrack-db-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.backtrackDBClusterAsync backtrack-db-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.BacktrackDBClusterRequest backtrack-db-cluster-request]
    (-> this (.backtrackDBClusterAsync backtrack-db-cluster-request))))

(defn download-db-log-file-portion-async
  "Downloads all or a portion of the specified log file, up to 1 MB in size.

  download-db-log-file-portion-request - `com.amazonaws.services.rds.model.DownloadDBLogFilePortionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DownloadDBLogFilePortion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DownloadDBLogFilePortionResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DownloadDBLogFilePortionRequest download-db-log-file-portion-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.downloadDBLogFilePortionAsync download-db-log-file-portion-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DownloadDBLogFilePortionRequest download-db-log-file-portion-request]
    (-> this (.downloadDBLogFilePortionAsync download-db-log-file-portion-request))))

(defn modify-event-subscription-async
  "Modifies an existing RDS event notification subscription. Note that you can't modify the source identifiers using
   this call; to change source identifiers for a subscription, use the
   AddSourceIdentifierToSubscription and RemoveSourceIdentifierFromSubscription calls.


   You can see a list of the event categories for a given SourceType in the Events topic in the Amazon
   RDS User Guide or by using the DescribeEventCategories action.

  modify-event-subscription-request - `com.amazonaws.services.rds.model.ModifyEventSubscriptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyEventSubscription operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.EventSubscription>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.ModifyEventSubscriptionRequest modify-event-subscription-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyEventSubscriptionAsync modify-event-subscription-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.ModifyEventSubscriptionRequest modify-event-subscription-request]
    (-> this (.modifyEventSubscriptionAsync modify-event-subscription-request))))

(defn describe-account-attributes-async
  "Lists all of the attributes for a customer account. The attributes include Amazon RDS quotas for the account,
   such as the number of DB instances allowed. The description for a quota includes the quota name, current usage
   toward that quota, and the quota's maximum value.


   This command doesn't take any parameters.

  describe-account-attributes-request - `com.amazonaws.services.rds.model.DescribeAccountAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAccountAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeAccountAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeAccountAttributesRequest describe-account-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAccountAttributesAsync describe-account-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeAccountAttributesRequest describe-account-attributes-request]
    (-> this (.describeAccountAttributesAsync describe-account-attributes-request)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this]
    (-> this (.describeAccountAttributesAsync))))

(defn apply-pending-maintenance-action-async
  "Applies a pending maintenance action to a resource (for example, to a DB instance).

  apply-pending-maintenance-action-request - `com.amazonaws.services.rds.model.ApplyPendingMaintenanceActionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ApplyPendingMaintenanceAction operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.ResourcePendingMaintenanceActions>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.ApplyPendingMaintenanceActionRequest apply-pending-maintenance-action-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.applyPendingMaintenanceActionAsync apply-pending-maintenance-action-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.ApplyPendingMaintenanceActionRequest apply-pending-maintenance-action-request]
    (-> this (.applyPendingMaintenanceActionAsync apply-pending-maintenance-action-request))))

(defn describe-db-cluster-snapshots-async
  "Returns information about DB cluster snapshots. This API action supports pagination.


   For more information on Amazon Aurora, see  What Is Amazon
   Aurora? in the Amazon Aurora User Guide.



   This action only applies to Aurora DB clusters.

  describe-db-cluster-snapshots-request - `com.amazonaws.services.rds.model.DescribeDBClusterSnapshotsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBClusterSnapshots operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeDBClusterSnapshotsResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeDBClusterSnapshotsRequest describe-db-cluster-snapshots-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBClusterSnapshotsAsync describe-db-cluster-snapshots-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeDBClusterSnapshotsRequest describe-db-cluster-snapshots-request]
    (-> this (.describeDBClusterSnapshotsAsync describe-db-cluster-snapshots-request)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this]
    (-> this (.describeDBClusterSnapshotsAsync))))

(defn add-source-identifier-to-subscription-async
  "Adds a source identifier to an existing RDS event notification subscription.

  add-source-identifier-to-subscription-request - `com.amazonaws.services.rds.model.AddSourceIdentifierToSubscriptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddSourceIdentifierToSubscription operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.EventSubscription>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.AddSourceIdentifierToSubscriptionRequest add-source-identifier-to-subscription-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addSourceIdentifierToSubscriptionAsync add-source-identifier-to-subscription-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.AddSourceIdentifierToSubscriptionRequest add-source-identifier-to-subscription-request]
    (-> this (.addSourceIdentifierToSubscriptionAsync add-source-identifier-to-subscription-request))))

(defn describe-valid-db-instance-modifications-async
  "You can call DescribeValidDBInstanceModifications to learn what modifications you can make to your
   DB instance. You can use this information when you call ModifyDBInstance.

  describe-valid-db-instance-modifications-request - `com.amazonaws.services.rds.model.DescribeValidDBInstanceModificationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeValidDBInstanceModifications operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.ValidDBInstanceModificationsMessage>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeValidDBInstanceModificationsRequest describe-valid-db-instance-modifications-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeValidDBInstanceModificationsAsync describe-valid-db-instance-modifications-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeValidDBInstanceModificationsRequest describe-valid-db-instance-modifications-request]
    (-> this (.describeValidDBInstanceModificationsAsync describe-valid-db-instance-modifications-request))))

(defn describe-engine-default-cluster-parameters-async
  "Returns the default engine and system parameter information for the cluster database engine.


   For more information on Amazon Aurora, see  What Is Amazon
   Aurora? in the Amazon Aurora User Guide.

  describe-engine-default-cluster-parameters-request - `com.amazonaws.services.rds.model.DescribeEngineDefaultClusterParametersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEngineDefaultClusterParameters operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.EngineDefaults>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeEngineDefaultClusterParametersRequest describe-engine-default-cluster-parameters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEngineDefaultClusterParametersAsync describe-engine-default-cluster-parameters-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeEngineDefaultClusterParametersRequest describe-engine-default-cluster-parameters-request]
    (-> this (.describeEngineDefaultClusterParametersAsync describe-engine-default-cluster-parameters-request))))

(defn describe-source-regions-async
  "Returns a list of the source AWS Regions where the current AWS Region can create a Read Replica or copy a DB
   snapshot from. This API action supports pagination.

  describe-source-regions-request - `com.amazonaws.services.rds.model.DescribeSourceRegionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSourceRegions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DescribeSourceRegionsResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeSourceRegionsRequest describe-source-regions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSourceRegionsAsync describe-source-regions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DescribeSourceRegionsRequest describe-source-regions-request]
    (-> this (.describeSourceRegionsAsync describe-source-regions-request))))

(defn delete-db-cluster-endpoint-async
  "Deletes a custom endpoint and removes it from an Amazon Aurora DB cluster.



   This action only applies to Aurora DB clusters.

  delete-db-cluster-endpoint-request - `com.amazonaws.services.rds.model.DeleteDBClusterEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDBClusterEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rds.model.DeleteDBClusterEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DeleteDBClusterEndpointRequest delete-db-cluster-endpoint-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDBClusterEndpointAsync delete-db-cluster-endpoint-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRDSAsync this ^com.amazonaws.services.rds.model.DeleteDBClusterEndpointRequest delete-db-cluster-endpoint-request]
    (-> this (.deleteDBClusterEndpointAsync delete-db-cluster-endpoint-request))))

