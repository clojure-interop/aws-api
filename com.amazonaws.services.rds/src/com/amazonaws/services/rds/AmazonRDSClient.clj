(ns com.amazonaws.services.rds.AmazonRDSClient
  "Client for accessing Amazon RDS. All service calls made using this client are blocking, and will not return until the
  service call completes.

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
  (:import [com.amazonaws.services.rds AmazonRDSClient]))

(defn ->amazon-rds-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to Amazon RDS (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AmazonRDSClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AmazonRDSClient aws-credentials-provider client-configuration request-metric-collector))
  (^AmazonRDSClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonRDSClient aws-credentials client-configuration))
  (^AmazonRDSClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonRDSClient client-configuration))
  (^AmazonRDSClient []
    (new AmazonRDSClient )))

(defn *builder
  "returns: `com.amazonaws.services.rds.AmazonRDSClientBuilder`"
  (^com.amazonaws.services.rds.AmazonRDSClientBuilder []
    (AmazonRDSClient/builder )))

(defn create-db-cluster-endpoint
  "Creates a new custom endpoint and associates it with an Amazon Aurora DB cluster.



   This action only applies to Aurora DB clusters.

  request - `com.amazonaws.services.rds.model.CreateDBClusterEndpointRequest`

  returns: Result of the CreateDBClusterEndpoint operation returned by the service. - `com.amazonaws.services.rds.model.CreateDBClusterEndpointResult`

  throws: com.amazonaws.services.rds.model.DBClusterEndpointQuotaExceededException - The cluster already has the maximum number of custom endpoints."
  (^com.amazonaws.services.rds.model.CreateDBClusterEndpointResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.CreateDBClusterEndpointRequest request]
    (-> this (.createDBClusterEndpoint request))))

(defn stop-db-cluster
  "Stops an Amazon Aurora DB cluster. When you stop a DB cluster, Aurora retains the DB cluster's metadata,
   including its endpoints and DB parameter groups. Aurora also retains the transaction logs so you can do a
   point-in-time restore if necessary.


   For more information, see  Stopping and
   Starting an Aurora Cluster in the Amazon Aurora User Guide.



   This action only applies to Aurora DB clusters.

  request - `com.amazonaws.services.rds.model.StopDBClusterRequest`

  returns: Result of the StopDBCluster operation returned by the service. - `com.amazonaws.services.rds.model.DBCluster`

  throws: com.amazonaws.services.rds.model.DBClusterNotFoundException - DBClusterIdentifier doesn't refer to an existing DB cluster."
  (^com.amazonaws.services.rds.model.DBCluster [^AmazonRDSClient this ^com.amazonaws.services.rds.model.StopDBClusterRequest request]
    (-> this (.stopDBCluster request))))

(defn modify-db-cluster-snapshot-attribute
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

  request - `com.amazonaws.services.rds.model.ModifyDBClusterSnapshotAttributeRequest`

  returns: Result of the ModifyDBClusterSnapshotAttribute operation returned by the service. - `com.amazonaws.services.rds.model.DBClusterSnapshotAttributesResult`

  throws: com.amazonaws.services.rds.model.DBClusterSnapshotNotFoundException - DBClusterSnapshotIdentifier doesn't refer to an existing DB cluster snapshot."
  (^com.amazonaws.services.rds.model.DBClusterSnapshotAttributesResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.ModifyDBClusterSnapshotAttributeRequest request]
    (-> this (.modifyDBClusterSnapshotAttribute request))))

(defn create-db-instance
  "Creates a new DB instance.

  request - `com.amazonaws.services.rds.model.CreateDBInstanceRequest`

  returns: Result of the CreateDBInstance operation returned by the service. - `com.amazonaws.services.rds.model.DBInstance`

  throws: com.amazonaws.services.rds.model.DomainNotFoundException - Domain doesn't refer to an existing Active Directory domain."
  (^com.amazonaws.services.rds.model.DBInstance [^AmazonRDSClient this ^com.amazonaws.services.rds.model.CreateDBInstanceRequest request]
    (-> this (.createDBInstance request))))

(defn list-tags-for-resource
  "Lists all tags on an Amazon RDS resource.


   For an overview on tagging an Amazon RDS resource, see Tagging Amazon RDS
   Resources in the Amazon RDS User Guide.

  request - `com.amazonaws.services.rds.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.rds.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.rds.model.DBInstanceNotFoundException - DBInstanceIdentifier doesn't refer to an existing DB instance."
  (^com.amazonaws.services.rds.model.ListTagsForResourceResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn modify-db-snapshot-attribute
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

  request - `com.amazonaws.services.rds.model.ModifyDBSnapshotAttributeRequest`

  returns: Result of the ModifyDBSnapshotAttribute operation returned by the service. - `com.amazonaws.services.rds.model.DBSnapshotAttributesResult`

  throws: com.amazonaws.services.rds.model.DBSnapshotNotFoundException - DBSnapshotIdentifier doesn't refer to an existing DB snapshot."
  (^com.amazonaws.services.rds.model.DBSnapshotAttributesResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.ModifyDBSnapshotAttributeRequest request]
    (-> this (.modifyDBSnapshotAttribute request))))

(defn describe-db-security-groups
  "Returns a list of DBSecurityGroup descriptions. If a DBSecurityGroupName is specified,
   the list will contain only the descriptions of the specified DB security group.

  request - `com.amazonaws.services.rds.model.DescribeDBSecurityGroupsRequest`

  returns: Result of the DescribeDBSecurityGroups operation returned by the service. - `com.amazonaws.services.rds.model.DescribeDBSecurityGroupsResult`

  throws: com.amazonaws.services.rds.model.DBSecurityGroupNotFoundException - DBSecurityGroupName doesn't refer to an existing DB security group."
  (^com.amazonaws.services.rds.model.DescribeDBSecurityGroupsResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DescribeDBSecurityGroupsRequest request]
    (-> this (.describeDBSecurityGroups request)))
  (^com.amazonaws.services.rds.model.DescribeDBSecurityGroupsResult [^AmazonRDSClient this]
    (-> this (.describeDBSecurityGroups))))

(defn stop-db-instance
  "Stops an Amazon RDS DB instance. When you stop a DB instance, Amazon RDS retains the DB instance's metadata,
   including its endpoint, DB parameter group, and option group membership. Amazon RDS also retains the transaction
   logs so you can do a point-in-time restore if necessary.


   For more information, see  Stopping an Amazon RDS DB
   Instance Temporarily in the Amazon RDS User Guide.



   This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora clusters, use
   StopDBCluster instead.

  request - `com.amazonaws.services.rds.model.StopDBInstanceRequest`

  returns: Result of the StopDBInstance operation returned by the service. - `com.amazonaws.services.rds.model.DBInstance`

  throws: com.amazonaws.services.rds.model.DBInstanceNotFoundException - DBInstanceIdentifier doesn't refer to an existing DB instance."
  (^com.amazonaws.services.rds.model.DBInstance [^AmazonRDSClient this ^com.amazonaws.services.rds.model.StopDBInstanceRequest request]
    (-> this (.stopDBInstance request))))

(defn modify-db-subnet-group
  "Modifies an existing DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in
   the AWS Region.

  request - `com.amazonaws.services.rds.model.ModifyDBSubnetGroupRequest`

  returns: Result of the ModifyDBSubnetGroup operation returned by the service. - `com.amazonaws.services.rds.model.DBSubnetGroup`

  throws: com.amazonaws.services.rds.model.DBSubnetGroupNotFoundException - DBSubnetGroupName doesn't refer to an existing DB subnet group."
  (^com.amazonaws.services.rds.model.DBSubnetGroup [^AmazonRDSClient this ^com.amazonaws.services.rds.model.ModifyDBSubnetGroupRequest request]
    (-> this (.modifyDBSubnetGroup request))))

(defn stop-activity-stream
  "Stops a database activity stream that was started using the AWS console, the start-activity-stream
   AWS CLI command, or the StartActivityStream action.


   For more information, see Database Activity
   Streams in the Amazon Aurora User Guide.

  request - `com.amazonaws.services.rds.model.StopActivityStreamRequest`

  returns: Result of the StopActivityStream operation returned by the service. - `com.amazonaws.services.rds.model.StopActivityStreamResult`

  throws: com.amazonaws.services.rds.model.InvalidDBInstanceStateException - The DB instance isn't in a valid state."
  (^com.amazonaws.services.rds.model.StopActivityStreamResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.StopActivityStreamRequest request]
    (-> this (.stopActivityStream request))))

(defn describe-db-cluster-snapshot-attributes
  "Returns a list of DB cluster snapshot attribute names and values for a manual DB cluster snapshot.


   When sharing snapshots with other AWS accounts, DescribeDBClusterSnapshotAttributes returns the
   restore attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the
   manual DB cluster snapshot. If all is included in the list of values for the restore
   attribute, then the manual DB cluster snapshot is public and can be copied or restored by all AWS accounts.


   To add or remove access for an AWS account to copy or restore a manual DB cluster snapshot, or to make the manual
   DB cluster snapshot public or private, use the ModifyDBClusterSnapshotAttribute API action.



   This action only applies to Aurora DB clusters.

  request - `com.amazonaws.services.rds.model.DescribeDBClusterSnapshotAttributesRequest`

  returns: Result of the DescribeDBClusterSnapshotAttributes operation returned by the service. - `com.amazonaws.services.rds.model.DBClusterSnapshotAttributesResult`

  throws: com.amazonaws.services.rds.model.DBClusterSnapshotNotFoundException - DBClusterSnapshotIdentifier doesn't refer to an existing DB cluster snapshot."
  (^com.amazonaws.services.rds.model.DBClusterSnapshotAttributesResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DescribeDBClusterSnapshotAttributesRequest request]
    (-> this (.describeDBClusterSnapshotAttributes request))))

(defn describe-db-subnet-groups
  "Returns a list of DBSubnetGroup descriptions. If a DBSubnetGroupName is specified, the list will contain only the
   descriptions of the specified DBSubnetGroup.


   For an overview of CIDR ranges, go to the Wikipedia Tutorial.

  request - `com.amazonaws.services.rds.model.DescribeDBSubnetGroupsRequest`

  returns: Result of the DescribeDBSubnetGroups operation returned by the service. - `com.amazonaws.services.rds.model.DescribeDBSubnetGroupsResult`

  throws: com.amazonaws.services.rds.model.DBSubnetGroupNotFoundException - DBSubnetGroupName doesn't refer to an existing DB subnet group."
  (^com.amazonaws.services.rds.model.DescribeDBSubnetGroupsResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DescribeDBSubnetGroupsRequest request]
    (-> this (.describeDBSubnetGroups request)))
  (^com.amazonaws.services.rds.model.DescribeDBSubnetGroupsResult [^AmazonRDSClient this]
    (-> this (.describeDBSubnetGroups))))

(defn reboot-db-instance
  "You might need to reboot your DB instance, usually for maintenance reasons. For example, if you make certain
   modifications, or if you change the DB parameter group associated with the DB instance, you must reboot the
   instance for the changes to take effect.


   Rebooting a DB instance restarts the database engine service. Rebooting a DB instance results in a momentary
   outage, during which the DB instance status is set to rebooting.


   For more information about rebooting, see Rebooting a DB
   Instance in the Amazon RDS User Guide.

  request - `com.amazonaws.services.rds.model.RebootDBInstanceRequest`

  returns: Result of the RebootDBInstance operation returned by the service. - `com.amazonaws.services.rds.model.DBInstance`

  throws: com.amazonaws.services.rds.model.InvalidDBInstanceStateException - The DB instance isn't in a valid state."
  (^com.amazonaws.services.rds.model.DBInstance [^AmazonRDSClient this ^com.amazonaws.services.rds.model.RebootDBInstanceRequest request]
    (-> this (.rebootDBInstance request))))

(defn copy-db-parameter-group
  "Copies the specified DB parameter group.

  request - `com.amazonaws.services.rds.model.CopyDBParameterGroupRequest`

  returns: Result of the CopyDBParameterGroup operation returned by the service. - `com.amazonaws.services.rds.model.DBParameterGroup`

  throws: com.amazonaws.services.rds.model.DBParameterGroupNotFoundException - DBParameterGroupName doesn't refer to an existing DB parameter group."
  (^com.amazonaws.services.rds.model.DBParameterGroup [^AmazonRDSClient this ^com.amazonaws.services.rds.model.CopyDBParameterGroupRequest request]
    (-> this (.copyDBParameterGroup request))))

(defn delete-db-cluster-snapshot
  "Deletes a DB cluster snapshot. If the snapshot is being copied, the copy operation is terminated.



   The DB cluster snapshot must be in the available state to be deleted.



   For more information on Amazon Aurora, see  What Is Amazon
   Aurora? in the Amazon Aurora User Guide.



   This action only applies to Aurora DB clusters.

  request - `com.amazonaws.services.rds.model.DeleteDBClusterSnapshotRequest`

  returns: Result of the DeleteDBClusterSnapshot operation returned by the service. - `com.amazonaws.services.rds.model.DBClusterSnapshot`

  throws: com.amazonaws.services.rds.model.InvalidDBClusterSnapshotStateException - The supplied value isn't a valid DB cluster snapshot state."
  (^com.amazonaws.services.rds.model.DBClusterSnapshot [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DeleteDBClusterSnapshotRequest request]
    (-> this (.deleteDBClusterSnapshot request))))

(defn create-db-security-group
  "Creates a new DB security group. DB security groups control access to a DB instance.



   A DB security group controls access to EC2-Classic DB instances that are not in a VPC.

  request - `com.amazonaws.services.rds.model.CreateDBSecurityGroupRequest`

  returns: Result of the CreateDBSecurityGroup operation returned by the service. - `com.amazonaws.services.rds.model.DBSecurityGroup`

  throws: com.amazonaws.services.rds.model.DBSecurityGroupAlreadyExistsException - A DB security group with the name specified in DBSecurityGroupName already exists."
  (^com.amazonaws.services.rds.model.DBSecurityGroup [^AmazonRDSClient this ^com.amazonaws.services.rds.model.CreateDBSecurityGroupRequest request]
    (-> this (.createDBSecurityGroup request))))

(defn create-event-subscription
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

  request - `com.amazonaws.services.rds.model.CreateEventSubscriptionRequest`

  returns: Result of the CreateEventSubscription operation returned by the service. - `com.amazonaws.services.rds.model.EventSubscription`

  throws: com.amazonaws.services.rds.model.EventSubscriptionQuotaExceededException - You have reached the maximum number of event subscriptions."
  (^com.amazonaws.services.rds.model.EventSubscription [^AmazonRDSClient this ^com.amazonaws.services.rds.model.CreateEventSubscriptionRequest request]
    (-> this (.createEventSubscription request))))

(defn waiters
  "returns: `com.amazonaws.services.rds.waiters.AmazonRDSWaiters`"
  (^com.amazonaws.services.rds.waiters.AmazonRDSWaiters [^AmazonRDSClient this]
    (-> this (.waiters))))

(defn describe-event-subscriptions
  "Lists all the subscription descriptions for a customer account. The description for a subscription includes
   SubscriptionName, SNSTopicARN, CustomerID, SourceType, SourceID, CreationTime, and Status.


   If you specify a SubscriptionName, lists the description for that subscription.

  request - `com.amazonaws.services.rds.model.DescribeEventSubscriptionsRequest`

  returns: Result of the DescribeEventSubscriptions operation returned by the service. - `com.amazonaws.services.rds.model.DescribeEventSubscriptionsResult`

  throws: com.amazonaws.services.rds.model.SubscriptionNotFoundException - The subscription name does not exist."
  (^com.amazonaws.services.rds.model.DescribeEventSubscriptionsResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DescribeEventSubscriptionsRequest request]
    (-> this (.describeEventSubscriptions request)))
  (^com.amazonaws.services.rds.model.DescribeEventSubscriptionsResult [^AmazonRDSClient this]
    (-> this (.describeEventSubscriptions))))

(defn restore-db-instance-to-point-in-time
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

  request - `com.amazonaws.services.rds.model.RestoreDBInstanceToPointInTimeRequest`

  returns: Result of the RestoreDBInstanceToPointInTime operation returned by the service. - `com.amazonaws.services.rds.model.DBInstance`

  throws: com.amazonaws.services.rds.model.DomainNotFoundException - Domain doesn't refer to an existing Active Directory domain."
  (^com.amazonaws.services.rds.model.DBInstance [^AmazonRDSClient this ^com.amazonaws.services.rds.model.RestoreDBInstanceToPointInTimeRequest request]
    (-> this (.restoreDBInstanceToPointInTime request))))

(defn delete-db-snapshot
  "Deletes a DB snapshot. If the snapshot is being copied, the copy operation is terminated.



   The DB snapshot must be in the available state to be deleted.

  request - `com.amazonaws.services.rds.model.DeleteDBSnapshotRequest`

  returns: Result of the DeleteDBSnapshot operation returned by the service. - `com.amazonaws.services.rds.model.DBSnapshot`

  throws: com.amazonaws.services.rds.model.InvalidDBSnapshotStateException - The state of the DB snapshot doesn't allow deletion."
  (^com.amazonaws.services.rds.model.DBSnapshot [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DeleteDBSnapshotRequest request]
    (-> this (.deleteDBSnapshot request))))

(defn promote-read-replica-db-cluster
  "Promotes a Read Replica DB cluster to a standalone DB cluster.



   This action only applies to Aurora DB clusters.

  request - `com.amazonaws.services.rds.model.PromoteReadReplicaDBClusterRequest`

  returns: Result of the PromoteReadReplicaDBCluster operation returned by the service. - `com.amazonaws.services.rds.model.DBCluster`

  throws: com.amazonaws.services.rds.model.DBClusterNotFoundException - DBClusterIdentifier doesn't refer to an existing DB cluster."
  (^com.amazonaws.services.rds.model.DBCluster [^AmazonRDSClient this ^com.amazonaws.services.rds.model.PromoteReadReplicaDBClusterRequest request]
    (-> this (.promoteReadReplicaDBCluster request))))

(defn delete-db-cluster-parameter-group
  "Deletes a specified DB cluster parameter group. The DB cluster parameter group to be deleted can't be associated
   with any DB clusters.


   For more information on Amazon Aurora, see  What Is Amazon
   Aurora? in the Amazon Aurora User Guide.



   This action only applies to Aurora DB clusters.

  request - `com.amazonaws.services.rds.model.DeleteDBClusterParameterGroupRequest`

  returns: Result of the DeleteDBClusterParameterGroup operation returned by the service. - `com.amazonaws.services.rds.model.DeleteDBClusterParameterGroupResult`

  throws: com.amazonaws.services.rds.model.InvalidDBParameterGroupStateException - The DB parameter group is in use or is in an invalid state. If you are attempting to delete the parameter group, you can't delete it when the parameter group is in this state."
  (^com.amazonaws.services.rds.model.DeleteDBClusterParameterGroupResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DeleteDBClusterParameterGroupRequest request]
    (-> this (.deleteDBClusterParameterGroup request))))

(defn describe-engine-default-cluster-parameters
  "Returns the default engine and system parameter information for the cluster database engine.


   For more information on Amazon Aurora, see  What Is Amazon
   Aurora? in the Amazon Aurora User Guide.

  request - `com.amazonaws.services.rds.model.DescribeEngineDefaultClusterParametersRequest`

  returns: Result of the DescribeEngineDefaultClusterParameters operation returned by the service. - `com.amazonaws.services.rds.model.EngineDefaults`"
  (^com.amazonaws.services.rds.model.EngineDefaults [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DescribeEngineDefaultClusterParametersRequest request]
    (-> this (.describeEngineDefaultClusterParameters request))))

(defn describe-option-groups
  "Describes the available option groups.

  request - `com.amazonaws.services.rds.model.DescribeOptionGroupsRequest`

  returns: Result of the DescribeOptionGroups operation returned by the service. - `com.amazonaws.services.rds.model.DescribeOptionGroupsResult`

  throws: com.amazonaws.services.rds.model.OptionGroupNotFoundException - The specified option group could not be found."
  (^com.amazonaws.services.rds.model.DescribeOptionGroupsResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DescribeOptionGroupsRequest request]
    (-> this (.describeOptionGroups request)))
  (^com.amazonaws.services.rds.model.DescribeOptionGroupsResult [^AmazonRDSClient this]
    (-> this (.describeOptionGroups))))

(defn describe-pending-maintenance-actions
  "Returns a list of resources (for example, DB instances) that have at least one pending maintenance action.

  request - `com.amazonaws.services.rds.model.DescribePendingMaintenanceActionsRequest`

  returns: Result of the DescribePendingMaintenanceActions operation returned by the service. - `com.amazonaws.services.rds.model.DescribePendingMaintenanceActionsResult`

  throws: com.amazonaws.services.rds.model.ResourceNotFoundException - The specified resource ID was not found."
  (^com.amazonaws.services.rds.model.DescribePendingMaintenanceActionsResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DescribePendingMaintenanceActionsRequest request]
    (-> this (.describePendingMaintenanceActions request)))
  (^com.amazonaws.services.rds.model.DescribePendingMaintenanceActionsResult [^AmazonRDSClient this]
    (-> this (.describePendingMaintenanceActions))))

(defn failover-db-cluster
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

  request - `com.amazonaws.services.rds.model.FailoverDBClusterRequest`

  returns: Result of the FailoverDBCluster operation returned by the service. - `com.amazonaws.services.rds.model.DBCluster`

  throws: com.amazonaws.services.rds.model.DBClusterNotFoundException - DBClusterIdentifier doesn't refer to an existing DB cluster."
  (^com.amazonaws.services.rds.model.DBCluster [^AmazonRDSClient this ^com.amazonaws.services.rds.model.FailoverDBClusterRequest request]
    (-> this (.failoverDBCluster request)))
  (^com.amazonaws.services.rds.model.DBCluster [^AmazonRDSClient this]
    (-> this (.failoverDBCluster))))

(defn modify-db-instance
  "Modifies settings for a DB instance. You can change one or more database configuration parameters by specifying
   these parameters and the new values in the request. To learn what modifications you can make to your DB instance,
   call DescribeValidDBInstanceModifications before you call ModifyDBInstance.

  request - `com.amazonaws.services.rds.model.ModifyDBInstanceRequest`

  returns: Result of the ModifyDBInstance operation returned by the service. - `com.amazonaws.services.rds.model.DBInstance`

  throws: com.amazonaws.services.rds.model.DomainNotFoundException - Domain doesn't refer to an existing Active Directory domain."
  (^com.amazonaws.services.rds.model.DBInstance [^AmazonRDSClient this ^com.amazonaws.services.rds.model.ModifyDBInstanceRequest request]
    (-> this (.modifyDBInstance request))))

(defn create-db-instance-read-replica
  "Creates a new DB instance that acts as a Read Replica for an existing source DB instance. You can create a Read
   Replica for a DB instance running MySQL, MariaDB, Oracle, or PostgreSQL. For more information, see Working with Read Replicas
   in the Amazon RDS User Guide.


   Amazon Aurora doesn't support this action. You must call the CreateDBInstance action to create a DB
   instance for an Aurora DB cluster.


   All Read Replica DB instances are created with backups disabled. All other DB instance attributes (including DB
   security groups and DB parameter groups) are inherited from the source DB instance, except as specified
   following.



   Your source DB instance must have backup retention enabled.

  request - `com.amazonaws.services.rds.model.CreateDBInstanceReadReplicaRequest`

  returns: Result of the CreateDBInstanceReadReplica operation returned by the service. - `com.amazonaws.services.rds.model.DBInstance`

  throws: com.amazonaws.services.rds.model.InvalidDBSubnetGroupException - The DBSubnetGroup doesn't belong to the same VPC as that of an existing cross-region read replica of the same source instance."
  (^com.amazonaws.services.rds.model.DBInstance [^AmazonRDSClient this ^com.amazonaws.services.rds.model.CreateDBInstanceReadReplicaRequest request]
    (-> this (.createDBInstanceReadReplica request))))

(defn create-db-snapshot
  "Creates a DBSnapshot. The source DBInstance must be in \"available\" state.

  request - `com.amazonaws.services.rds.model.CreateDBSnapshotRequest`

  returns: Result of the CreateDBSnapshot operation returned by the service. - `com.amazonaws.services.rds.model.DBSnapshot`

  throws: com.amazonaws.services.rds.model.DBSnapshotAlreadyExistsException - DBSnapshotIdentifier is already used by an existing snapshot."
  (^com.amazonaws.services.rds.model.DBSnapshot [^AmazonRDSClient this ^com.amazonaws.services.rds.model.CreateDBSnapshotRequest request]
    (-> this (.createDBSnapshot request))))

(defn create-db-cluster
  "Creates a new Amazon Aurora DB cluster.


   You can use the ReplicationSourceIdentifier parameter to create the DB cluster as a Read Replica of
   another DB cluster or Amazon RDS MySQL DB instance. For cross-region replication where the DB cluster identified
   by ReplicationSourceIdentifier is encrypted, you must also specify the PreSignedUrl
   parameter.


   For more information on Amazon Aurora, see  What Is Amazon
   Aurora? in the Amazon Aurora User Guide.



   This action only applies to Aurora DB clusters.

  request - `com.amazonaws.services.rds.model.CreateDBClusterRequest`

  returns: Result of the CreateDBCluster operation returned by the service. - `com.amazonaws.services.rds.model.DBCluster`

  throws: com.amazonaws.services.rds.model.DBClusterAlreadyExistsException - The user already has a DB cluster with the given identifier."
  (^com.amazonaws.services.rds.model.DBCluster [^AmazonRDSClient this ^com.amazonaws.services.rds.model.CreateDBClusterRequest request]
    (-> this (.createDBCluster request))))

(defn describe-source-regions
  "Returns a list of the source AWS Regions where the current AWS Region can create a Read Replica or copy a DB
   snapshot from. This API action supports pagination.

  request - `com.amazonaws.services.rds.model.DescribeSourceRegionsRequest`

  returns: Result of the DescribeSourceRegions operation returned by the service. - `com.amazonaws.services.rds.model.DescribeSourceRegionsResult`"
  (^com.amazonaws.services.rds.model.DescribeSourceRegionsResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DescribeSourceRegionsRequest request]
    (-> this (.describeSourceRegions request))))

(defn describe-db-snapshot-attributes
  "Returns a list of DB snapshot attribute names and values for a manual DB snapshot.


   When sharing snapshots with other AWS accounts, DescribeDBSnapshotAttributes returns the
   restore attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the
   manual DB snapshot. If all is included in the list of values for the restore attribute,
   then the manual DB snapshot is public and can be copied or restored by all AWS accounts.


   To add or remove access for an AWS account to copy or restore a manual DB snapshot, or to make the manual DB
   snapshot public or private, use the ModifyDBSnapshotAttribute API action.

  request - `com.amazonaws.services.rds.model.DescribeDBSnapshotAttributesRequest`

  returns: Result of the DescribeDBSnapshotAttributes operation returned by the service. - `com.amazonaws.services.rds.model.DBSnapshotAttributesResult`

  throws: com.amazonaws.services.rds.model.DBSnapshotNotFoundException - DBSnapshotIdentifier doesn't refer to an existing DB snapshot."
  (^com.amazonaws.services.rds.model.DBSnapshotAttributesResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DescribeDBSnapshotAttributesRequest request]
    (-> this (.describeDBSnapshotAttributes request)))
  (^com.amazonaws.services.rds.model.DBSnapshotAttributesResult [^AmazonRDSClient this]
    (-> this (.describeDBSnapshotAttributes))))

(defn restore-db-cluster-from-s-3
  "Creates an Amazon Aurora DB cluster from data stored in an Amazon S3 bucket. Amazon RDS must be authorized to
   access the Amazon S3 bucket and the data must be created using the Percona XtraBackup utility as described in  Migrating Data to
   an Amazon Aurora MySQL DB Cluster in the Amazon Aurora User Guide.



   This action only applies to Aurora DB clusters.

  request - `com.amazonaws.services.rds.model.RestoreDBClusterFromS3Request`

  returns: Result of the RestoreDBClusterFromS3 operation returned by the service. - `com.amazonaws.services.rds.model.DBCluster`

  throws: com.amazonaws.services.rds.model.DBClusterAlreadyExistsException - The user already has a DB cluster with the given identifier."
  (^com.amazonaws.services.rds.model.DBCluster [^AmazonRDSClient this ^com.amazonaws.services.rds.model.RestoreDBClusterFromS3Request request]
    (-> this (.restoreDBClusterFromS3 request))))

(defn remove-role-from-db-instance
  "Disassociates an AWS Identity and Access Management (IAM) role from a DB instance.

  request - `com.amazonaws.services.rds.model.RemoveRoleFromDBInstanceRequest`

  returns: Result of the RemoveRoleFromDBInstance operation returned by the service. - `com.amazonaws.services.rds.model.RemoveRoleFromDBInstanceResult`

  throws: com.amazonaws.services.rds.model.DBInstanceNotFoundException - DBInstanceIdentifier doesn't refer to an existing DB instance."
  (^com.amazonaws.services.rds.model.RemoveRoleFromDBInstanceResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.RemoveRoleFromDBInstanceRequest request]
    (-> this (.removeRoleFromDBInstance request))))

(defn start-activity-stream
  "Starts a database activity stream to monitor activity on the database. For more information, see Database Activity
   Streams in the Amazon Aurora User Guide.

  request - `com.amazonaws.services.rds.model.StartActivityStreamRequest`

  returns: Result of the StartActivityStream operation returned by the service. - `com.amazonaws.services.rds.model.StartActivityStreamResult`

  throws: com.amazonaws.services.rds.model.InvalidDBInstanceStateException - The DB instance isn't in a valid state."
  (^com.amazonaws.services.rds.model.StartActivityStreamResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.StartActivityStreamRequest request]
    (-> this (.startActivityStream request))))

(defn describe-valid-db-instance-modifications
  "You can call DescribeValidDBInstanceModifications to learn what modifications you can make to your
   DB instance. You can use this information when you call ModifyDBInstance.

  request - `com.amazonaws.services.rds.model.DescribeValidDBInstanceModificationsRequest`

  returns: Result of the DescribeValidDBInstanceModifications operation returned by the service. - `com.amazonaws.services.rds.model.ValidDBInstanceModificationsMessage`

  throws: com.amazonaws.services.rds.model.DBInstanceNotFoundException - DBInstanceIdentifier doesn't refer to an existing DB instance."
  (^com.amazonaws.services.rds.model.ValidDBInstanceModificationsMessage [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DescribeValidDBInstanceModificationsRequest request]
    (-> this (.describeValidDBInstanceModifications request))))

(defn delete-db-instance
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

  request - `com.amazonaws.services.rds.model.DeleteDBInstanceRequest`

  returns: Result of the DeleteDBInstance operation returned by the service. - `com.amazonaws.services.rds.model.DBInstance`

  throws: com.amazonaws.services.rds.model.DBInstanceNotFoundException - DBInstanceIdentifier doesn't refer to an existing DB instance."
  (^com.amazonaws.services.rds.model.DBInstance [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DeleteDBInstanceRequest request]
    (-> this (.deleteDBInstance request))))

(defn describe-option-group-options
  "Describes all available options.

  request - `com.amazonaws.services.rds.model.DescribeOptionGroupOptionsRequest`

  returns: Result of the DescribeOptionGroupOptions operation returned by the service. - `com.amazonaws.services.rds.model.DescribeOptionGroupOptionsResult`"
  (^com.amazonaws.services.rds.model.DescribeOptionGroupOptionsResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DescribeOptionGroupOptionsRequest request]
    (-> this (.describeOptionGroupOptions request))))

(defn describe-certificates
  "Lists the set of CA certificates provided by Amazon RDS for this AWS account.

  request - `com.amazonaws.services.rds.model.DescribeCertificatesRequest`

  returns: Result of the DescribeCertificates operation returned by the service. - `com.amazonaws.services.rds.model.DescribeCertificatesResult`

  throws: com.amazonaws.services.rds.model.CertificateNotFoundException - CertificateIdentifier doesn't refer to an existing certificate."
  (^com.amazonaws.services.rds.model.DescribeCertificatesResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DescribeCertificatesRequest request]
    (-> this (.describeCertificates request)))
  (^com.amazonaws.services.rds.model.DescribeCertificatesResult [^AmazonRDSClient this]
    (-> this (.describeCertificates))))

(defn delete-db-subnet-group
  "Deletes a DB subnet group.



   The specified database subnet group must not be associated with any DB instances.

  request - `com.amazonaws.services.rds.model.DeleteDBSubnetGroupRequest`

  returns: Result of the DeleteDBSubnetGroup operation returned by the service. - `com.amazonaws.services.rds.model.DeleteDBSubnetGroupResult`

  throws: com.amazonaws.services.rds.model.InvalidDBSubnetGroupStateException - The DB subnet group cannot be deleted because it's in use."
  (^com.amazonaws.services.rds.model.DeleteDBSubnetGroupResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DeleteDBSubnetGroupRequest request]
    (-> this (.deleteDBSubnetGroup request))))

(defn delete-option-group
  "Deletes an existing option group.

  request - `com.amazonaws.services.rds.model.DeleteOptionGroupRequest`

  returns: Result of the DeleteOptionGroup operation returned by the service. - `com.amazonaws.services.rds.model.DeleteOptionGroupResult`

  throws: com.amazonaws.services.rds.model.OptionGroupNotFoundException - The specified option group could not be found."
  (^com.amazonaws.services.rds.model.DeleteOptionGroupResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DeleteOptionGroupRequest request]
    (-> this (.deleteOptionGroup request))))

(defn restore-db-cluster-to-point-in-time
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

  request - `com.amazonaws.services.rds.model.RestoreDBClusterToPointInTimeRequest`

  returns: Result of the RestoreDBClusterToPointInTime operation returned by the service. - `com.amazonaws.services.rds.model.DBCluster`

  throws: com.amazonaws.services.rds.model.DBClusterAlreadyExistsException - The user already has a DB cluster with the given identifier."
  (^com.amazonaws.services.rds.model.DBCluster [^AmazonRDSClient this ^com.amazonaws.services.rds.model.RestoreDBClusterToPointInTimeRequest request]
    (-> this (.restoreDBClusterToPointInTime request))))

(defn delete-db-instance-automated-backup
  "Deletes automated backups based on the source instance's DbiResourceId value or the restorable
   instance's resource ID.

  request - `com.amazonaws.services.rds.model.DeleteDBInstanceAutomatedBackupRequest`

  returns: Result of the DeleteDBInstanceAutomatedBackup operation returned by the service. - `com.amazonaws.services.rds.model.DBInstanceAutomatedBackup`

  throws: com.amazonaws.services.rds.model.InvalidDBInstanceAutomatedBackupStateException - The automated backup is in an invalid state. For example, this automated backup is associated with an active instance."
  (^com.amazonaws.services.rds.model.DBInstanceAutomatedBackup [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DeleteDBInstanceAutomatedBackupRequest request]
    (-> this (.deleteDBInstanceAutomatedBackup request))))

(defn delete-global-cluster
  "Deletes a global database cluster. The primary and secondary clusters must already be detached or destroyed
   first.



   This action only applies to Aurora DB clusters.

  request - `com.amazonaws.services.rds.model.DeleteGlobalClusterRequest`

  returns: Result of the DeleteGlobalCluster operation returned by the service. - `com.amazonaws.services.rds.model.GlobalCluster`

  throws: com.amazonaws.services.rds.model.GlobalClusterNotFoundException"
  (^com.amazonaws.services.rds.model.GlobalCluster [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DeleteGlobalClusterRequest request]
    (-> this (.deleteGlobalCluster request))))

(defn copy-db-snapshot
  "Copies the specified DB snapshot. The source DB snapshot must be in the \"available\" state.


   You can copy a snapshot from one AWS Region to another. In that case, the AWS Region where you call the
   CopyDBSnapshot action is the destination AWS Region for the DB snapshot copy.


   For more information about copying snapshots, see Copying a DB Snapshot
   in the Amazon RDS User Guide.

  request - `com.amazonaws.services.rds.model.CopyDBSnapshotRequest`

  returns: Result of the CopyDBSnapshot operation returned by the service. - `com.amazonaws.services.rds.model.DBSnapshot`

  throws: com.amazonaws.services.rds.model.DBSnapshotAlreadyExistsException - DBSnapshotIdentifier is already used by an existing snapshot."
  (^com.amazonaws.services.rds.model.DBSnapshot [^AmazonRDSClient this ^com.amazonaws.services.rds.model.CopyDBSnapshotRequest request]
    (-> this (.copyDBSnapshot request))))

(defn add-role-to-db-cluster
  "Associates an Identity and Access Management (IAM) role from an Amazon Aurora DB cluster. For more information,
   see Authorizing Amazon Aurora MySQL to Access Other AWS Services on Your Behalf in the Amazon Aurora User
   Guide.



   This action only applies to Aurora DB clusters.

  request - `com.amazonaws.services.rds.model.AddRoleToDBClusterRequest`

  returns: Result of the AddRoleToDBCluster operation returned by the service. - `com.amazonaws.services.rds.model.AddRoleToDBClusterResult`

  throws: com.amazonaws.services.rds.model.DBClusterNotFoundException - DBClusterIdentifier doesn't refer to an existing DB cluster."
  (^com.amazonaws.services.rds.model.AddRoleToDBClusterResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.AddRoleToDBClusterRequest request]
    (-> this (.addRoleToDBCluster request))))

(defn delete-db-cluster
  "The DeleteDBCluster action deletes a previously provisioned DB cluster. When you delete a DB cluster, all
   automated backups for that DB cluster are deleted and can't be recovered. Manual DB cluster snapshots of the
   specified DB cluster are not deleted.



   For more information on Amazon Aurora, see  What Is Amazon
   Aurora? in the Amazon Aurora User Guide.



   This action only applies to Aurora DB clusters.

  request - `com.amazonaws.services.rds.model.DeleteDBClusterRequest`

  returns: Result of the DeleteDBCluster operation returned by the service. - `com.amazonaws.services.rds.model.DBCluster`

  throws: com.amazonaws.services.rds.model.DBClusterNotFoundException - DBClusterIdentifier doesn't refer to an existing DB cluster."
  (^com.amazonaws.services.rds.model.DBCluster [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DeleteDBClusterRequest request]
    (-> this (.deleteDBCluster request))))

(defn modify-current-db-cluster-capacity
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

  request - `com.amazonaws.services.rds.model.ModifyCurrentDBClusterCapacityRequest`

  returns: Result of the ModifyCurrentDBClusterCapacity operation returned by the service. - `com.amazonaws.services.rds.model.ModifyCurrentDBClusterCapacityResult`

  throws: com.amazonaws.services.rds.model.DBClusterNotFoundException - DBClusterIdentifier doesn't refer to an existing DB cluster."
  (^com.amazonaws.services.rds.model.ModifyCurrentDBClusterCapacityResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.ModifyCurrentDBClusterCapacityRequest request]
    (-> this (.modifyCurrentDBClusterCapacity request))))

(defn promote-read-replica
  "Promotes a Read Replica DB instance to a standalone DB instance.





   Backup duration is a function of the amount of changes to the database since the previous backup. If you plan to
   promote a Read Replica to a standalone instance, we recommend that you enable backups and complete at least one
   backup prior to promotion. In addition, a Read Replica cannot be promoted to a standalone instance when it is in
   the backing-up status. If you have enabled backups on your Read Replica, configure the automated
   backup window so that daily backups do not interfere with Read Replica promotion.




   This command doesn't apply to Aurora MySQL and Aurora PostgreSQL.

  request - `com.amazonaws.services.rds.model.PromoteReadReplicaRequest`

  returns: Result of the PromoteReadReplica operation returned by the service. - `com.amazonaws.services.rds.model.DBInstance`

  throws: com.amazonaws.services.rds.model.InvalidDBInstanceStateException - The DB instance isn't in a valid state."
  (^com.amazonaws.services.rds.model.DBInstance [^AmazonRDSClient this ^com.amazonaws.services.rds.model.PromoteReadReplicaRequest request]
    (-> this (.promoteReadReplica request))))

(defn copy-option-group
  "Copies the specified option group.

  request - `com.amazonaws.services.rds.model.CopyOptionGroupRequest`

  returns: Result of the CopyOptionGroup operation returned by the service. - `com.amazonaws.services.rds.model.OptionGroup`

  throws: com.amazonaws.services.rds.model.OptionGroupAlreadyExistsException - The option group you are trying to create already exists."
  (^com.amazonaws.services.rds.model.OptionGroup [^AmazonRDSClient this ^com.amazonaws.services.rds.model.CopyOptionGroupRequest request]
    (-> this (.copyOptionGroup request))))

(defn modify-event-subscription
  "Modifies an existing RDS event notification subscription. Note that you can't modify the source identifiers using
   this call; to change source identifiers for a subscription, use the
   AddSourceIdentifierToSubscription and RemoveSourceIdentifierFromSubscription calls.


   You can see a list of the event categories for a given SourceType in the Events topic in the Amazon
   RDS User Guide or by using the DescribeEventCategories action.

  request - `com.amazonaws.services.rds.model.ModifyEventSubscriptionRequest`

  returns: Result of the ModifyEventSubscription operation returned by the service. - `com.amazonaws.services.rds.model.EventSubscription`

  throws: com.amazonaws.services.rds.model.EventSubscriptionQuotaExceededException - You have reached the maximum number of event subscriptions."
  (^com.amazonaws.services.rds.model.EventSubscription [^AmazonRDSClient this ^com.amazonaws.services.rds.model.ModifyEventSubscriptionRequest request]
    (-> this (.modifyEventSubscription request))))

(defn create-db-parameter-group
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

  request - `com.amazonaws.services.rds.model.CreateDBParameterGroupRequest`

  returns: Result of the CreateDBParameterGroup operation returned by the service. - `com.amazonaws.services.rds.model.DBParameterGroup`

  throws: com.amazonaws.services.rds.model.DBParameterGroupQuotaExceededException - The request would result in the user exceeding the allowed number of DB parameter groups."
  (^com.amazonaws.services.rds.model.DBParameterGroup [^AmazonRDSClient this ^com.amazonaws.services.rds.model.CreateDBParameterGroupRequest request]
    (-> this (.createDBParameterGroup request))))

(defn create-db-cluster-snapshot
  "Creates a snapshot of a DB cluster. For more information on Amazon Aurora, see  What Is Amazon
   Aurora? in the Amazon Aurora User Guide.



   This action only applies to Aurora DB clusters.

  request - `com.amazonaws.services.rds.model.CreateDBClusterSnapshotRequest`

  returns: Result of the CreateDBClusterSnapshot operation returned by the service. - `com.amazonaws.services.rds.model.DBClusterSnapshot`

  throws: com.amazonaws.services.rds.model.DBClusterSnapshotAlreadyExistsException - The user already has a DB cluster snapshot with the given identifier."
  (^com.amazonaws.services.rds.model.DBClusterSnapshot [^AmazonRDSClient this ^com.amazonaws.services.rds.model.CreateDBClusterSnapshotRequest request]
    (-> this (.createDBClusterSnapshot request))))

(defn describe-account-attributes
  "Lists all of the attributes for a customer account. The attributes include Amazon RDS quotas for the account,
   such as the number of DB instances allowed. The description for a quota includes the quota name, current usage
   toward that quota, and the quota's maximum value.


   This command doesn't take any parameters.

  request - `com.amazonaws.services.rds.model.DescribeAccountAttributesRequest`

  returns: Result of the DescribeAccountAttributes operation returned by the service. - `com.amazonaws.services.rds.model.DescribeAccountAttributesResult`"
  (^com.amazonaws.services.rds.model.DescribeAccountAttributesResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DescribeAccountAttributesRequest request]
    (-> this (.describeAccountAttributes request)))
  (^com.amazonaws.services.rds.model.DescribeAccountAttributesResult [^AmazonRDSClient this]
    (-> this (.describeAccountAttributes))))

(defn shutdown
  "Description copied from class: AmazonWebServiceClient"
  ([^AmazonRDSClient this]
    (-> this (.shutdown))))

(defn describe-events
  "Returns events related to DB instances, DB security groups, DB snapshots, and DB parameter groups for the past 14
   days. Events specific to a particular DB instance, DB security group, database snapshot, or DB parameter group
   can be obtained by providing the name as a parameter. By default, the past hour of events are returned.

  request - `com.amazonaws.services.rds.model.DescribeEventsRequest`

  returns: Result of the DescribeEvents operation returned by the service. - `com.amazonaws.services.rds.model.DescribeEventsResult`"
  (^com.amazonaws.services.rds.model.DescribeEventsResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DescribeEventsRequest request]
    (-> this (.describeEvents request)))
  (^com.amazonaws.services.rds.model.DescribeEventsResult [^AmazonRDSClient this]
    (-> this (.describeEvents))))

(defn describe-global-clusters
  "Returns information about Aurora global database clusters. This API supports pagination.


   For more information on Amazon Aurora, see  What Is Amazon
   Aurora? in the Amazon Aurora User Guide.



   This action only applies to Aurora DB clusters.

  request - `com.amazonaws.services.rds.model.DescribeGlobalClustersRequest`

  returns: Result of the DescribeGlobalClusters operation returned by the service. - `com.amazonaws.services.rds.model.DescribeGlobalClustersResult`

  throws: com.amazonaws.services.rds.model.GlobalClusterNotFoundException"
  (^com.amazonaws.services.rds.model.DescribeGlobalClustersResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DescribeGlobalClustersRequest request]
    (-> this (.describeGlobalClusters request))))

(defn create-global-cluster
  "Creates an Aurora global database spread across multiple regions. The global database contains a single primary
   cluster with read-write capability, and a read-only secondary cluster that receives data from the primary cluster
   through high-speed replication performed by the Aurora storage subsystem.


   You can create a global database that is initially empty, and then add a primary cluster and a secondary cluster
   to it. Or you can specify an existing Aurora cluster during the create operation, and this cluster becomes the
   primary cluster of the global database.



   This action only applies to Aurora DB clusters.

  request - `com.amazonaws.services.rds.model.CreateGlobalClusterRequest`

  returns: Result of the CreateGlobalCluster operation returned by the service. - `com.amazonaws.services.rds.model.GlobalCluster`

  throws: com.amazonaws.services.rds.model.GlobalClusterAlreadyExistsException"
  (^com.amazonaws.services.rds.model.GlobalCluster [^AmazonRDSClient this ^com.amazonaws.services.rds.model.CreateGlobalClusterRequest request]
    (-> this (.createGlobalCluster request))))

(defn authorize-db-security-group-ingress
  "Enables ingress to a DBSecurityGroup using one of two forms of authorization. First, EC2 or VPC security groups
   can be added to the DBSecurityGroup if the application using the database is running on EC2 or VPC instances.
   Second, IP ranges are available if the application accessing your database is running on the Internet. Required
   parameters for this API are one of CIDR range, EC2SecurityGroupId for VPC, or (EC2SecurityGroupOwnerId and either
   EC2SecurityGroupName or EC2SecurityGroupId for non-VPC).



   You can't authorize ingress from an EC2 security group in one AWS Region to an Amazon RDS DB instance in another.
   You can't authorize ingress from a VPC security group in one VPC to an Amazon RDS DB instance in another.



   For an overview of CIDR ranges, go to the Wikipedia Tutorial.

  request - `com.amazonaws.services.rds.model.AuthorizeDBSecurityGroupIngressRequest`

  returns: Result of the AuthorizeDBSecurityGroupIngress operation returned by the service. - `com.amazonaws.services.rds.model.DBSecurityGroup`

  throws: com.amazonaws.services.rds.model.DBSecurityGroupNotFoundException - DBSecurityGroupName doesn't refer to an existing DB security group."
  (^com.amazonaws.services.rds.model.DBSecurityGroup [^AmazonRDSClient this ^com.amazonaws.services.rds.model.AuthorizeDBSecurityGroupIngressRequest request]
    (-> this (.authorizeDBSecurityGroupIngress request))))

(defn describe-db-instance-automated-backups
  "Displays backups for both current and deleted instances. For example, use this operation to find details about
   automated backups for previously deleted instances. Current instances with retention periods greater than zero
   (0) are returned for both the DescribeDBInstanceAutomatedBackups and
   DescribeDBInstances operations.


   All parameters are optional.

  request - `com.amazonaws.services.rds.model.DescribeDBInstanceAutomatedBackupsRequest`

  returns: Result of the DescribeDBInstanceAutomatedBackups operation returned by the service. - `com.amazonaws.services.rds.model.DescribeDBInstanceAutomatedBackupsResult`

  throws: com.amazonaws.services.rds.model.DBInstanceAutomatedBackupNotFoundException - No automated backup for this DB instance was found."
  (^com.amazonaws.services.rds.model.DescribeDBInstanceAutomatedBackupsResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DescribeDBInstanceAutomatedBackupsRequest request]
    (-> this (.describeDBInstanceAutomatedBackups request))))

(defn remove-role-from-db-cluster
  "Disassociates an AWS Identity and Access Management (IAM) role from an Amazon Aurora DB cluster. For more
   information, see Authorizing Amazon Aurora MySQL to Access Other AWS Services on Your Behalf  in the Amazon Aurora User
   Guide.



   This action only applies to Aurora DB clusters.

  request - `com.amazonaws.services.rds.model.RemoveRoleFromDBClusterRequest`

  returns: Result of the RemoveRoleFromDBCluster operation returned by the service. - `com.amazonaws.services.rds.model.RemoveRoleFromDBClusterResult`

  throws: com.amazonaws.services.rds.model.DBClusterNotFoundException - DBClusterIdentifier doesn't refer to an existing DB cluster."
  (^com.amazonaws.services.rds.model.RemoveRoleFromDBClusterResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.RemoveRoleFromDBClusterRequest request]
    (-> this (.removeRoleFromDBCluster request))))

(defn modify-global-cluster
  "Modify a setting for an Amazon Aurora global cluster. You can change one or more database configuration
   parameters by specifying these parameters and the new values in the request. For more information on Amazon
   Aurora, see  What
   Is Amazon Aurora? in the Amazon Aurora User Guide.



   This action only applies to Aurora DB clusters.

  request - `com.amazonaws.services.rds.model.ModifyGlobalClusterRequest`

  returns: Result of the ModifyGlobalCluster operation returned by the service. - `com.amazonaws.services.rds.model.GlobalCluster`

  throws: com.amazonaws.services.rds.model.GlobalClusterNotFoundException"
  (^com.amazonaws.services.rds.model.GlobalCluster [^AmazonRDSClient this ^com.amazonaws.services.rds.model.ModifyGlobalClusterRequest request]
    (-> this (.modifyGlobalCluster request))))

(defn start-db-instance
  "Starts an Amazon RDS DB instance that was stopped using the AWS console, the stop-db-instance AWS CLI command, or
   the StopDBInstance action.


   For more information, see  Starting an Amazon RDS DB
   instance That Was Previously Stopped in the Amazon RDS User Guide.



   This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora DB clusters, use
   StartDBCluster instead.

  request - `com.amazonaws.services.rds.model.StartDBInstanceRequest`

  returns: Result of the StartDBInstance operation returned by the service. - `com.amazonaws.services.rds.model.DBInstance`

  throws: com.amazonaws.services.rds.model.DBSubnetGroupNotFoundException - DBSubnetGroupName doesn't refer to an existing DB subnet group."
  (^com.amazonaws.services.rds.model.DBInstance [^AmazonRDSClient this ^com.amazonaws.services.rds.model.StartDBInstanceRequest request]
    (-> this (.startDBInstance request))))

(defn delete-db-security-group
  "Deletes a DB security group.



   The specified DB security group must not be associated with any DB instances.

  request - `com.amazonaws.services.rds.model.DeleteDBSecurityGroupRequest`

  returns: Result of the DeleteDBSecurityGroup operation returned by the service. - `com.amazonaws.services.rds.model.DeleteDBSecurityGroupResult`

  throws: com.amazonaws.services.rds.model.InvalidDBSecurityGroupStateException - The state of the DB security group doesn't allow deletion."
  (^com.amazonaws.services.rds.model.DeleteDBSecurityGroupResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DeleteDBSecurityGroupRequest request]
    (-> this (.deleteDBSecurityGroup request))))

(defn download-db-log-file-portion
  "Downloads all or a portion of the specified log file, up to 1 MB in size.

  request - `com.amazonaws.services.rds.model.DownloadDBLogFilePortionRequest`

  returns: Result of the DownloadDBLogFilePortion operation returned by the service. - `com.amazonaws.services.rds.model.DownloadDBLogFilePortionResult`

  throws: com.amazonaws.services.rds.model.DBInstanceNotFoundException - DBInstanceIdentifier doesn't refer to an existing DB instance."
  (^com.amazonaws.services.rds.model.DownloadDBLogFilePortionResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DownloadDBLogFilePortionRequest request]
    (-> this (.downloadDBLogFilePortion request))))

(defn describe-event-categories
  "Displays a list of categories for all event source types, or, if specified, for a specified source type. You can
   see a list of the event categories and source types in the  Events topic in the Amazon
   RDS User Guide.

  request - `com.amazonaws.services.rds.model.DescribeEventCategoriesRequest`

  returns: Result of the DescribeEventCategories operation returned by the service. - `com.amazonaws.services.rds.model.DescribeEventCategoriesResult`"
  (^com.amazonaws.services.rds.model.DescribeEventCategoriesResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DescribeEventCategoriesRequest request]
    (-> this (.describeEventCategories request)))
  (^com.amazonaws.services.rds.model.DescribeEventCategoriesResult [^AmazonRDSClient this]
    (-> this (.describeEventCategories))))

(defn remove-from-global-cluster
  "Detaches an Aurora secondary cluster from an Aurora global database cluster. The cluster becomes a standalone
   cluster with read-write capability instead of being read-only and receiving data from a primary cluster in a
   different region.



   This action only applies to Aurora DB clusters.

  request - `com.amazonaws.services.rds.model.RemoveFromGlobalClusterRequest`

  returns: Result of the RemoveFromGlobalCluster operation returned by the service. - `com.amazonaws.services.rds.model.GlobalCluster`

  throws: com.amazonaws.services.rds.model.GlobalClusterNotFoundException"
  (^com.amazonaws.services.rds.model.GlobalCluster [^AmazonRDSClient this ^com.amazonaws.services.rds.model.RemoveFromGlobalClusterRequest request]
    (-> this (.removeFromGlobalCluster request))))

(defn describe-db-engine-versions
  "Returns a list of the available DB engines.

  request - `com.amazonaws.services.rds.model.DescribeDBEngineVersionsRequest`

  returns: Result of the DescribeDBEngineVersions operation returned by the service. - `com.amazonaws.services.rds.model.DescribeDBEngineVersionsResult`"
  (^com.amazonaws.services.rds.model.DescribeDBEngineVersionsResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DescribeDBEngineVersionsRequest request]
    (-> this (.describeDBEngineVersions request)))
  (^com.amazonaws.services.rds.model.DescribeDBEngineVersionsResult [^AmazonRDSClient this]
    (-> this (.describeDBEngineVersions))))

(defn describe-db-parameters
  "Returns the detailed parameter list for a particular DB parameter group.

  request - `com.amazonaws.services.rds.model.DescribeDBParametersRequest`

  returns: Result of the DescribeDBParameters operation returned by the service. - `com.amazonaws.services.rds.model.DescribeDBParametersResult`

  throws: com.amazonaws.services.rds.model.DBParameterGroupNotFoundException - DBParameterGroupName doesn't refer to an existing DB parameter group."
  (^com.amazonaws.services.rds.model.DescribeDBParametersResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DescribeDBParametersRequest request]
    (-> this (.describeDBParameters request))))

(defn delete-db-cluster-endpoint
  "Deletes a custom endpoint and removes it from an Amazon Aurora DB cluster.



   This action only applies to Aurora DB clusters.

  request - `com.amazonaws.services.rds.model.DeleteDBClusterEndpointRequest`

  returns: Result of the DeleteDBClusterEndpoint operation returned by the service. - `com.amazonaws.services.rds.model.DeleteDBClusterEndpointResult`

  throws: com.amazonaws.services.rds.model.InvalidDBClusterEndpointStateException - The requested operation can't be performed on the endpoint while the endpoint is in this state."
  (^com.amazonaws.services.rds.model.DeleteDBClusterEndpointResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DeleteDBClusterEndpointRequest request]
    (-> this (.deleteDBClusterEndpoint request))))

(defn delete-event-subscription
  "Deletes an RDS event notification subscription.

  request - `com.amazonaws.services.rds.model.DeleteEventSubscriptionRequest`

  returns: Result of the DeleteEventSubscription operation returned by the service. - `com.amazonaws.services.rds.model.EventSubscription`

  throws: com.amazonaws.services.rds.model.SubscriptionNotFoundException - The subscription name does not exist."
  (^com.amazonaws.services.rds.model.EventSubscription [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DeleteEventSubscriptionRequest request]
    (-> this (.deleteEventSubscription request))))

(defn purchase-reserved-db-instances-offering
  "Purchases a reserved DB instance offering.

  request - `com.amazonaws.services.rds.model.PurchaseReservedDBInstancesOfferingRequest`

  returns: Result of the PurchaseReservedDBInstancesOffering operation returned by the service. - `com.amazonaws.services.rds.model.ReservedDBInstance`

  throws: com.amazonaws.services.rds.model.ReservedDBInstancesOfferingNotFoundException - Specified offering does not exist."
  (^com.amazonaws.services.rds.model.ReservedDBInstance [^AmazonRDSClient this ^com.amazonaws.services.rds.model.PurchaseReservedDBInstancesOfferingRequest request]
    (-> this (.purchaseReservedDBInstancesOffering request))))

(defn create-db-cluster-parameter-group
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

  request - `com.amazonaws.services.rds.model.CreateDBClusterParameterGroupRequest`

  returns: Result of the CreateDBClusterParameterGroup operation returned by the service. - `com.amazonaws.services.rds.model.DBClusterParameterGroup`

  throws: com.amazonaws.services.rds.model.DBParameterGroupQuotaExceededException - The request would result in the user exceeding the allowed number of DB parameter groups."
  (^com.amazonaws.services.rds.model.DBClusterParameterGroup [^AmazonRDSClient this ^com.amazonaws.services.rds.model.CreateDBClusterParameterGroupRequest request]
    (-> this (.createDBClusterParameterGroup request))))

(defn modify-option-group
  "Modifies an existing option group.

  request - `com.amazonaws.services.rds.model.ModifyOptionGroupRequest`

  returns: Result of the ModifyOptionGroup operation returned by the service. - `com.amazonaws.services.rds.model.OptionGroup`

  throws: com.amazonaws.services.rds.model.InvalidOptionGroupStateException - The option group isn't in the available state."
  (^com.amazonaws.services.rds.model.OptionGroup [^AmazonRDSClient this ^com.amazonaws.services.rds.model.ModifyOptionGroupRequest request]
    (-> this (.modifyOptionGroup request))))

(defn describe-reserved-db-instances
  "Returns information about reserved DB instances for this account, or about a specified reserved DB instance.

  request - `com.amazonaws.services.rds.model.DescribeReservedDBInstancesRequest`

  returns: Result of the DescribeReservedDBInstances operation returned by the service. - `com.amazonaws.services.rds.model.DescribeReservedDBInstancesResult`

  throws: com.amazonaws.services.rds.model.ReservedDBInstanceNotFoundException - The specified reserved DB Instance not found."
  (^com.amazonaws.services.rds.model.DescribeReservedDBInstancesResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DescribeReservedDBInstancesRequest request]
    (-> this (.describeReservedDBInstances request)))
  (^com.amazonaws.services.rds.model.DescribeReservedDBInstancesResult [^AmazonRDSClient this]
    (-> this (.describeReservedDBInstances))))

(defn describe-db-parameter-groups
  "Returns a list of DBParameterGroup descriptions. If a DBParameterGroupName is
   specified, the list will contain only the description of the specified DB parameter group.

  request - `com.amazonaws.services.rds.model.DescribeDBParameterGroupsRequest`

  returns: Result of the DescribeDBParameterGroups operation returned by the service. - `com.amazonaws.services.rds.model.DescribeDBParameterGroupsResult`

  throws: com.amazonaws.services.rds.model.DBParameterGroupNotFoundException - DBParameterGroupName doesn't refer to an existing DB parameter group."
  (^com.amazonaws.services.rds.model.DescribeDBParameterGroupsResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DescribeDBParameterGroupsRequest request]
    (-> this (.describeDBParameterGroups request)))
  (^com.amazonaws.services.rds.model.DescribeDBParameterGroupsResult [^AmazonRDSClient this]
    (-> this (.describeDBParameterGroups))))

(defn describe-db-cluster-parameter-groups
  "Returns a list of DBClusterParameterGroup descriptions. If a
   DBClusterParameterGroupName parameter is specified, the list will contain only the description of
   the specified DB cluster parameter group.


   For more information on Amazon Aurora, see  What Is Amazon
   Aurora? in the Amazon Aurora User Guide.



   This action only applies to Aurora DB clusters.

  request - `com.amazonaws.services.rds.model.DescribeDBClusterParameterGroupsRequest`

  returns: Result of the DescribeDBClusterParameterGroups operation returned by the service. - `com.amazonaws.services.rds.model.DescribeDBClusterParameterGroupsResult`

  throws: com.amazonaws.services.rds.model.DBParameterGroupNotFoundException - DBParameterGroupName doesn't refer to an existing DB parameter group."
  (^com.amazonaws.services.rds.model.DescribeDBClusterParameterGroupsResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DescribeDBClusterParameterGroupsRequest request]
    (-> this (.describeDBClusterParameterGroups request)))
  (^com.amazonaws.services.rds.model.DescribeDBClusterParameterGroupsResult [^AmazonRDSClient this]
    (-> this (.describeDBClusterParameterGroups))))

(defn describe-reserved-db-instances-offerings
  "Lists available reserved DB instance offerings.

  request - `com.amazonaws.services.rds.model.DescribeReservedDBInstancesOfferingsRequest`

  returns: Result of the DescribeReservedDBInstancesOfferings operation returned by the service. - `com.amazonaws.services.rds.model.DescribeReservedDBInstancesOfferingsResult`

  throws: com.amazonaws.services.rds.model.ReservedDBInstancesOfferingNotFoundException - Specified offering does not exist."
  (^com.amazonaws.services.rds.model.DescribeReservedDBInstancesOfferingsResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DescribeReservedDBInstancesOfferingsRequest request]
    (-> this (.describeReservedDBInstancesOfferings request)))
  (^com.amazonaws.services.rds.model.DescribeReservedDBInstancesOfferingsResult [^AmazonRDSClient this]
    (-> this (.describeReservedDBInstancesOfferings))))

(defn restore-db-instance-from-s-3
  "Amazon Relational Database Service (Amazon RDS) supports importing MySQL databases by using backup files. You can
   create a backup of your on-premises database, store it on Amazon Simple Storage Service (Amazon S3), and then
   restore the backup file onto a new Amazon RDS DB instance running MySQL. For more information, see Importing Data into
   an Amazon RDS MySQL DB Instance in the Amazon RDS User Guide.

  request - `com.amazonaws.services.rds.model.RestoreDBInstanceFromS3Request`

  returns: Result of the RestoreDBInstanceFromS3 operation returned by the service. - `com.amazonaws.services.rds.model.DBInstance`

  throws: com.amazonaws.services.rds.model.DBSubnetGroupNotFoundException - DBSubnetGroupName doesn't refer to an existing DB subnet group."
  (^com.amazonaws.services.rds.model.DBInstance [^AmazonRDSClient this ^com.amazonaws.services.rds.model.RestoreDBInstanceFromS3Request request]
    (-> this (.restoreDBInstanceFromS3 request))))

(defn describe-db-instances
  "Returns information about provisioned RDS instances. This API supports pagination.

  request - `com.amazonaws.services.rds.model.DescribeDBInstancesRequest`

  returns: Result of the DescribeDBInstances operation returned by the service. - `com.amazonaws.services.rds.model.DescribeDBInstancesResult`

  throws: com.amazonaws.services.rds.model.DBInstanceNotFoundException - DBInstanceIdentifier doesn't refer to an existing DB instance."
  (^com.amazonaws.services.rds.model.DescribeDBInstancesResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DescribeDBInstancesRequest request]
    (-> this (.describeDBInstances request)))
  (^com.amazonaws.services.rds.model.DescribeDBInstancesResult [^AmazonRDSClient this]
    (-> this (.describeDBInstances))))

(defn describe-engine-default-parameters
  "Returns the default engine and system parameter information for the specified database engine.

  request - `com.amazonaws.services.rds.model.DescribeEngineDefaultParametersRequest`

  returns: Result of the DescribeEngineDefaultParameters operation returned by the service. - `com.amazonaws.services.rds.model.EngineDefaults`"
  (^com.amazonaws.services.rds.model.EngineDefaults [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DescribeEngineDefaultParametersRequest request]
    (-> this (.describeEngineDefaultParameters request))))

(defn remove-tags-from-resource
  "Removes metadata tags from an Amazon RDS resource.


   For an overview on tagging an Amazon RDS resource, see Tagging Amazon RDS
   Resources in the Amazon RDS User Guide.

  request - `com.amazonaws.services.rds.model.RemoveTagsFromResourceRequest`

  returns: Result of the RemoveTagsFromResource operation returned by the service. - `com.amazonaws.services.rds.model.RemoveTagsFromResourceResult`

  throws: com.amazonaws.services.rds.model.DBInstanceNotFoundException - DBInstanceIdentifier doesn't refer to an existing DB instance."
  (^com.amazonaws.services.rds.model.RemoveTagsFromResourceResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.RemoveTagsFromResourceRequest request]
    (-> this (.removeTagsFromResource request))))

(defn remove-source-identifier-from-subscription
  "Removes a source identifier from an existing RDS event notification subscription.

  request - `com.amazonaws.services.rds.model.RemoveSourceIdentifierFromSubscriptionRequest`

  returns: Result of the RemoveSourceIdentifierFromSubscription operation returned by the service. - `com.amazonaws.services.rds.model.EventSubscription`

  throws: com.amazonaws.services.rds.model.SubscriptionNotFoundException - The subscription name does not exist."
  (^com.amazonaws.services.rds.model.EventSubscription [^AmazonRDSClient this ^com.amazonaws.services.rds.model.RemoveSourceIdentifierFromSubscriptionRequest request]
    (-> this (.removeSourceIdentifierFromSubscription request))))

(defn describe-db-log-files
  "Returns a list of DB log files for the DB instance.

  request - `com.amazonaws.services.rds.model.DescribeDBLogFilesRequest`

  returns: Result of the DescribeDBLogFiles operation returned by the service. - `com.amazonaws.services.rds.model.DescribeDBLogFilesResult`

  throws: com.amazonaws.services.rds.model.DBInstanceNotFoundException - DBInstanceIdentifier doesn't refer to an existing DB instance."
  (^com.amazonaws.services.rds.model.DescribeDBLogFilesResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DescribeDBLogFilesRequest request]
    (-> this (.describeDBLogFiles request))))

(defn restore-db-instance-from-db-snapshot
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

  request - `com.amazonaws.services.rds.model.RestoreDBInstanceFromDBSnapshotRequest`

  returns: Result of the RestoreDBInstanceFromDBSnapshot operation returned by the service. - `com.amazonaws.services.rds.model.DBInstance`

  throws: com.amazonaws.services.rds.model.DomainNotFoundException - Domain doesn't refer to an existing Active Directory domain."
  (^com.amazonaws.services.rds.model.DBInstance [^AmazonRDSClient this ^com.amazonaws.services.rds.model.RestoreDBInstanceFromDBSnapshotRequest request]
    (-> this (.restoreDBInstanceFromDBSnapshot request))))

(defn reset-db-parameter-group
  "Modifies the parameters of a DB parameter group to the engine/system default value. To reset specific parameters,
   provide a list of the following: ParameterName and ApplyMethod. To reset the entire DB
   parameter group, specify the DBParameterGroup name and ResetAllParameters parameters.
   When resetting the entire group, dynamic parameters are updated immediately and static parameters are set to
   pending-reboot to take effect on the next DB instance restart or RebootDBInstance
   request.

  request - `com.amazonaws.services.rds.model.ResetDBParameterGroupRequest`

  returns: Result of the ResetDBParameterGroup operation returned by the service. - `com.amazonaws.services.rds.model.ResetDBParameterGroupResult`

  throws: com.amazonaws.services.rds.model.InvalidDBParameterGroupStateException - The DB parameter group is in use or is in an invalid state. If you are attempting to delete the parameter group, you can't delete it when the parameter group is in this state."
  (^com.amazonaws.services.rds.model.ResetDBParameterGroupResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.ResetDBParameterGroupRequest request]
    (-> this (.resetDBParameterGroup request))))

(defn describe-db-cluster-snapshots
  "Returns information about DB cluster snapshots. This API action supports pagination.


   For more information on Amazon Aurora, see  What Is Amazon
   Aurora? in the Amazon Aurora User Guide.



   This action only applies to Aurora DB clusters.

  request - `com.amazonaws.services.rds.model.DescribeDBClusterSnapshotsRequest`

  returns: Result of the DescribeDBClusterSnapshots operation returned by the service. - `com.amazonaws.services.rds.model.DescribeDBClusterSnapshotsResult`

  throws: com.amazonaws.services.rds.model.DBClusterSnapshotNotFoundException - DBClusterSnapshotIdentifier doesn't refer to an existing DB cluster snapshot."
  (^com.amazonaws.services.rds.model.DescribeDBClusterSnapshotsResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DescribeDBClusterSnapshotsRequest request]
    (-> this (.describeDBClusterSnapshots request)))
  (^com.amazonaws.services.rds.model.DescribeDBClusterSnapshotsResult [^AmazonRDSClient this]
    (-> this (.describeDBClusterSnapshots))))

(defn revoke-db-security-group-ingress
  "Revokes ingress from a DBSecurityGroup for previously authorized IP ranges or EC2 or VPC Security Groups.
   Required parameters for this API are one of CIDRIP, EC2SecurityGroupId for VPC, or (EC2SecurityGroupOwnerId and
   either EC2SecurityGroupName or EC2SecurityGroupId).

  request - `com.amazonaws.services.rds.model.RevokeDBSecurityGroupIngressRequest`

  returns: Result of the RevokeDBSecurityGroupIngress operation returned by the service. - `com.amazonaws.services.rds.model.DBSecurityGroup`

  throws: com.amazonaws.services.rds.model.DBSecurityGroupNotFoundException - DBSecurityGroupName doesn't refer to an existing DB security group."
  (^com.amazonaws.services.rds.model.DBSecurityGroup [^AmazonRDSClient this ^com.amazonaws.services.rds.model.RevokeDBSecurityGroupIngressRequest request]
    (-> this (.revokeDBSecurityGroupIngress request))))

(defn modify-db-snapshot
  "Updates a manual DB snapshot, which can be encrypted or not encrypted, with a new engine version.


   Amazon RDS supports upgrading DB snapshots for MySQL and Oracle.

  request - `com.amazonaws.services.rds.model.ModifyDBSnapshotRequest`

  returns: Result of the ModifyDBSnapshot operation returned by the service. - `com.amazonaws.services.rds.model.DBSnapshot`

  throws: com.amazonaws.services.rds.model.DBSnapshotNotFoundException - DBSnapshotIdentifier doesn't refer to an existing DB snapshot."
  (^com.amazonaws.services.rds.model.DBSnapshot [^AmazonRDSClient this ^com.amazonaws.services.rds.model.ModifyDBSnapshotRequest request]
    (-> this (.modifyDBSnapshot request))))

(defn delete-db-parameter-group
  "Deletes a specified DB parameter group. The DB parameter group to be deleted can't be associated with any DB
   instances.

  request - `com.amazonaws.services.rds.model.DeleteDBParameterGroupRequest`

  returns: Result of the DeleteDBParameterGroup operation returned by the service. - `com.amazonaws.services.rds.model.DeleteDBParameterGroupResult`

  throws: com.amazonaws.services.rds.model.InvalidDBParameterGroupStateException - The DB parameter group is in use or is in an invalid state. If you are attempting to delete the parameter group, you can't delete it when the parameter group is in this state."
  (^com.amazonaws.services.rds.model.DeleteDBParameterGroupResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DeleteDBParameterGroupRequest request]
    (-> this (.deleteDBParameterGroup request))))

(defn describe-db-cluster-backtracks
  "Returns information about backtracks for a DB cluster.


   For more information on Amazon Aurora, see  What Is Amazon
   Aurora? in the Amazon Aurora User Guide.



   This action only applies to Aurora DB clusters.

  request - `com.amazonaws.services.rds.model.DescribeDBClusterBacktracksRequest`

  returns: Result of the DescribeDBClusterBacktracks operation returned by the service. - `com.amazonaws.services.rds.model.DescribeDBClusterBacktracksResult`

  throws: com.amazonaws.services.rds.model.DBClusterNotFoundException - DBClusterIdentifier doesn't refer to an existing DB cluster."
  (^com.amazonaws.services.rds.model.DescribeDBClusterBacktracksResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DescribeDBClusterBacktracksRequest request]
    (-> this (.describeDBClusterBacktracks request))))

(defn describe-orderable-db-instance-options
  "Returns a list of orderable DB instance options for the specified engine.

  request - `com.amazonaws.services.rds.model.DescribeOrderableDBInstanceOptionsRequest`

  returns: Result of the DescribeOrderableDBInstanceOptions operation returned by the service. - `com.amazonaws.services.rds.model.DescribeOrderableDBInstanceOptionsResult`"
  (^com.amazonaws.services.rds.model.DescribeOrderableDBInstanceOptionsResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DescribeOrderableDBInstanceOptionsRequest request]
    (-> this (.describeOrderableDBInstanceOptions request))))

(defn describe-db-cluster-parameters
  "Returns the detailed parameter list for a particular DB cluster parameter group.


   For more information on Amazon Aurora, see  What Is Amazon
   Aurora? in the Amazon Aurora User Guide.



   This action only applies to Aurora DB clusters.

  request - `com.amazonaws.services.rds.model.DescribeDBClusterParametersRequest`

  returns: Result of the DescribeDBClusterParameters operation returned by the service. - `com.amazonaws.services.rds.model.DescribeDBClusterParametersResult`

  throws: com.amazonaws.services.rds.model.DBParameterGroupNotFoundException - DBParameterGroupName doesn't refer to an existing DB parameter group."
  (^com.amazonaws.services.rds.model.DescribeDBClusterParametersResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DescribeDBClusterParametersRequest request]
    (-> this (.describeDBClusterParameters request))))

(defn describe-db-cluster-endpoints
  "Returns information about endpoints for an Amazon Aurora DB cluster.



   This action only applies to Aurora DB clusters.

  request - `com.amazonaws.services.rds.model.DescribeDBClusterEndpointsRequest`

  returns: Result of the DescribeDBClusterEndpoints operation returned by the service. - `com.amazonaws.services.rds.model.DescribeDBClusterEndpointsResult`

  throws: com.amazonaws.services.rds.model.DBClusterNotFoundException - DBClusterIdentifier doesn't refer to an existing DB cluster."
  (^com.amazonaws.services.rds.model.DescribeDBClusterEndpointsResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DescribeDBClusterEndpointsRequest request]
    (-> this (.describeDBClusterEndpoints request))))

(defn restore-db-cluster-from-snapshot
  "Creates a new DB cluster from a DB snapshot or DB cluster snapshot.


   If a DB snapshot is specified, the target DB cluster is created from the source DB snapshot with a default
   configuration and default security group.


   If a DB cluster snapshot is specified, the target DB cluster is created from the source DB cluster restore point
   with the same configuration as the original source DB cluster, except that the new DB cluster is created with the
   default security group.


   For more information on Amazon Aurora, see  What Is Amazon
   Aurora? in the Amazon Aurora User Guide.



   This action only applies to Aurora DB clusters.

  request - `com.amazonaws.services.rds.model.RestoreDBClusterFromSnapshotRequest`

  returns: Result of the RestoreDBClusterFromSnapshot operation returned by the service. - `com.amazonaws.services.rds.model.DBCluster`

  throws: com.amazonaws.services.rds.model.DBClusterAlreadyExistsException - The user already has a DB cluster with the given identifier."
  (^com.amazonaws.services.rds.model.DBCluster [^AmazonRDSClient this ^com.amazonaws.services.rds.model.RestoreDBClusterFromSnapshotRequest request]
    (-> this (.restoreDBClusterFromSnapshot request))))

(defn describe-db-snapshots
  "Returns information about DB snapshots. This API action supports pagination.

  request - `com.amazonaws.services.rds.model.DescribeDBSnapshotsRequest`

  returns: Result of the DescribeDBSnapshots operation returned by the service. - `com.amazonaws.services.rds.model.DescribeDBSnapshotsResult`

  throws: com.amazonaws.services.rds.model.DBSnapshotNotFoundException - DBSnapshotIdentifier doesn't refer to an existing DB snapshot."
  (^com.amazonaws.services.rds.model.DescribeDBSnapshotsResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DescribeDBSnapshotsRequest request]
    (-> this (.describeDBSnapshots request)))
  (^com.amazonaws.services.rds.model.DescribeDBSnapshotsResult [^AmazonRDSClient this]
    (-> this (.describeDBSnapshots))))

(defn describe-db-clusters
  "Returns information about provisioned Aurora DB clusters. This API supports pagination.


   For more information on Amazon Aurora, see  What Is Amazon
   Aurora? in the Amazon Aurora User Guide.



   This action only applies to Aurora DB clusters.

  request - `com.amazonaws.services.rds.model.DescribeDBClustersRequest`

  returns: Result of the DescribeDBClusters operation returned by the service. - `com.amazonaws.services.rds.model.DescribeDBClustersResult`

  throws: com.amazonaws.services.rds.model.DBClusterNotFoundException - DBClusterIdentifier doesn't refer to an existing DB cluster."
  (^com.amazonaws.services.rds.model.DescribeDBClustersResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.DescribeDBClustersRequest request]
    (-> this (.describeDBClusters request)))
  (^com.amazonaws.services.rds.model.DescribeDBClustersResult [^AmazonRDSClient this]
    (-> this (.describeDBClusters))))

(defn add-tags-to-resource
  "Adds metadata tags to an Amazon RDS resource. These tags can also be used with cost allocation reporting to track
   cost associated with Amazon RDS resources, or used in a Condition statement in an IAM policy for Amazon RDS.


   For an overview on tagging Amazon RDS resources, see Tagging Amazon RDS
   Resources.

  request - `com.amazonaws.services.rds.model.AddTagsToResourceRequest`

  returns: Result of the AddTagsToResource operation returned by the service. - `com.amazonaws.services.rds.model.AddTagsToResourceResult`

  throws: com.amazonaws.services.rds.model.DBInstanceNotFoundException - DBInstanceIdentifier doesn't refer to an existing DB instance."
  (^com.amazonaws.services.rds.model.AddTagsToResourceResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.AddTagsToResourceRequest request]
    (-> this (.addTagsToResource request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonRDSClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn add-source-identifier-to-subscription
  "Adds a source identifier to an existing RDS event notification subscription.

  request - `com.amazonaws.services.rds.model.AddSourceIdentifierToSubscriptionRequest`

  returns: Result of the AddSourceIdentifierToSubscription operation returned by the service. - `com.amazonaws.services.rds.model.EventSubscription`

  throws: com.amazonaws.services.rds.model.SubscriptionNotFoundException - The subscription name does not exist."
  (^com.amazonaws.services.rds.model.EventSubscription [^AmazonRDSClient this ^com.amazonaws.services.rds.model.AddSourceIdentifierToSubscriptionRequest request]
    (-> this (.addSourceIdentifierToSubscription request))))

(defn create-option-group
  "Creates a new option group. You can create up to 20 option groups.

  request - `com.amazonaws.services.rds.model.CreateOptionGroupRequest`

  returns: Result of the CreateOptionGroup operation returned by the service. - `com.amazonaws.services.rds.model.OptionGroup`

  throws: com.amazonaws.services.rds.model.OptionGroupAlreadyExistsException - The option group you are trying to create already exists."
  (^com.amazonaws.services.rds.model.OptionGroup [^AmazonRDSClient this ^com.amazonaws.services.rds.model.CreateOptionGroupRequest request]
    (-> this (.createOptionGroup request))))

(defn modify-db-cluster-parameter-group
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

  request - `com.amazonaws.services.rds.model.ModifyDBClusterParameterGroupRequest`

  returns: Result of the ModifyDBClusterParameterGroup operation returned by the service. - `com.amazonaws.services.rds.model.ModifyDBClusterParameterGroupResult`

  throws: com.amazonaws.services.rds.model.DBParameterGroupNotFoundException - DBParameterGroupName doesn't refer to an existing DB parameter group."
  (^com.amazonaws.services.rds.model.ModifyDBClusterParameterGroupResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.ModifyDBClusterParameterGroupRequest request]
    (-> this (.modifyDBClusterParameterGroup request))))

(defn add-role-to-db-instance
  "Associates an AWS Identity and Access Management (IAM) role with a DB instance.



   To add a role to a DB instance, the status of the DB instance must be available.

  request - `com.amazonaws.services.rds.model.AddRoleToDBInstanceRequest`

  returns: Result of the AddRoleToDBInstance operation returned by the service. - `com.amazonaws.services.rds.model.AddRoleToDBInstanceResult`

  throws: com.amazonaws.services.rds.model.DBInstanceNotFoundException - DBInstanceIdentifier doesn't refer to an existing DB instance."
  (^com.amazonaws.services.rds.model.AddRoleToDBInstanceResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.AddRoleToDBInstanceRequest request]
    (-> this (.addRoleToDBInstance request))))

(defn modify-db-parameter-group
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

  request - `com.amazonaws.services.rds.model.ModifyDBParameterGroupRequest`

  returns: Result of the ModifyDBParameterGroup operation returned by the service. - `com.amazonaws.services.rds.model.ModifyDBParameterGroupResult`

  throws: com.amazonaws.services.rds.model.DBParameterGroupNotFoundException - DBParameterGroupName doesn't refer to an existing DB parameter group."
  (^com.amazonaws.services.rds.model.ModifyDBParameterGroupResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.ModifyDBParameterGroupRequest request]
    (-> this (.modifyDBParameterGroup request))))

(defn reset-db-cluster-parameter-group
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

  request - `com.amazonaws.services.rds.model.ResetDBClusterParameterGroupRequest`

  returns: Result of the ResetDBClusterParameterGroup operation returned by the service. - `com.amazonaws.services.rds.model.ResetDBClusterParameterGroupResult`

  throws: com.amazonaws.services.rds.model.InvalidDBParameterGroupStateException - The DB parameter group is in use or is in an invalid state. If you are attempting to delete the parameter group, you can't delete it when the parameter group is in this state."
  (^com.amazonaws.services.rds.model.ResetDBClusterParameterGroupResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.ResetDBClusterParameterGroupRequest request]
    (-> this (.resetDBClusterParameterGroup request))))

(defn modify-db-cluster
  "Modify a setting for an Amazon Aurora DB cluster. You can change one or more database configuration parameters by
   specifying these parameters and the new values in the request. For more information on Amazon Aurora, see  What Is Amazon
   Aurora? in the Amazon Aurora User Guide.



   This action only applies to Aurora DB clusters.

  request - `com.amazonaws.services.rds.model.ModifyDBClusterRequest`

  returns: Result of the ModifyDBCluster operation returned by the service. - `com.amazonaws.services.rds.model.DBCluster`

  throws: com.amazonaws.services.rds.model.DBClusterAlreadyExistsException - The user already has a DB cluster with the given identifier."
  (^com.amazonaws.services.rds.model.DBCluster [^AmazonRDSClient this ^com.amazonaws.services.rds.model.ModifyDBClusterRequest request]
    (-> this (.modifyDBCluster request))))

(defn backtrack-db-cluster
  "Backtracks a DB cluster to a specific time, without creating a new DB cluster.


   For more information on backtracking, see
   Backtracking an Aurora DB Cluster in the Amazon Aurora User Guide.



   This action only applies to Aurora DB clusters.

  request - `com.amazonaws.services.rds.model.BacktrackDBClusterRequest`

  returns: Result of the BacktrackDBCluster operation returned by the service. - `com.amazonaws.services.rds.model.BacktrackDBClusterResult`

  throws: com.amazonaws.services.rds.model.DBClusterNotFoundException - DBClusterIdentifier doesn't refer to an existing DB cluster."
  (^com.amazonaws.services.rds.model.BacktrackDBClusterResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.BacktrackDBClusterRequest request]
    (-> this (.backtrackDBCluster request))))

(defn copy-db-cluster-parameter-group
  "Copies the specified DB cluster parameter group.



   This action only applies to Aurora DB clusters.

  request - `com.amazonaws.services.rds.model.CopyDBClusterParameterGroupRequest`

  returns: Result of the CopyDBClusterParameterGroup operation returned by the service. - `com.amazonaws.services.rds.model.DBClusterParameterGroup`

  throws: com.amazonaws.services.rds.model.DBParameterGroupNotFoundException - DBParameterGroupName doesn't refer to an existing DB parameter group."
  (^com.amazonaws.services.rds.model.DBClusterParameterGroup [^AmazonRDSClient this ^com.amazonaws.services.rds.model.CopyDBClusterParameterGroupRequest request]
    (-> this (.copyDBClusterParameterGroup request))))

(defn copy-db-cluster-snapshot
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

  request - `com.amazonaws.services.rds.model.CopyDBClusterSnapshotRequest`

  returns: Result of the CopyDBClusterSnapshot operation returned by the service. - `com.amazonaws.services.rds.model.DBClusterSnapshot`

  throws: com.amazonaws.services.rds.model.DBClusterSnapshotAlreadyExistsException - The user already has a DB cluster snapshot with the given identifier."
  (^com.amazonaws.services.rds.model.DBClusterSnapshot [^AmazonRDSClient this ^com.amazonaws.services.rds.model.CopyDBClusterSnapshotRequest request]
    (-> this (.copyDBClusterSnapshot request))))

(defn apply-pending-maintenance-action
  "Applies a pending maintenance action to a resource (for example, to a DB instance).

  request - `com.amazonaws.services.rds.model.ApplyPendingMaintenanceActionRequest`

  returns: Result of the ApplyPendingMaintenanceAction operation returned by the service. - `com.amazonaws.services.rds.model.ResourcePendingMaintenanceActions`

  throws: com.amazonaws.services.rds.model.ResourceNotFoundException - The specified resource ID was not found."
  (^com.amazonaws.services.rds.model.ResourcePendingMaintenanceActions [^AmazonRDSClient this ^com.amazonaws.services.rds.model.ApplyPendingMaintenanceActionRequest request]
    (-> this (.applyPendingMaintenanceAction request))))

(defn modify-db-cluster-endpoint
  "Modifies the properties of an endpoint in an Amazon Aurora DB cluster.



   This action only applies to Aurora DB clusters.

  request - `com.amazonaws.services.rds.model.ModifyDBClusterEndpointRequest`

  returns: Result of the ModifyDBClusterEndpoint operation returned by the service. - `com.amazonaws.services.rds.model.ModifyDBClusterEndpointResult`

  throws: com.amazonaws.services.rds.model.InvalidDBClusterStateException - The requested operation can't be performed while the cluster is in this state."
  (^com.amazonaws.services.rds.model.ModifyDBClusterEndpointResult [^AmazonRDSClient this ^com.amazonaws.services.rds.model.ModifyDBClusterEndpointRequest request]
    (-> this (.modifyDBClusterEndpoint request))))

(defn start-db-cluster
  "Starts an Amazon Aurora DB cluster that was stopped using the AWS console, the stop-db-cluster AWS CLI command,
   or the StopDBCluster action.


   For more information, see  Stopping and
   Starting an Aurora Cluster in the Amazon Aurora User Guide.



   This action only applies to Aurora DB clusters.

  request - `com.amazonaws.services.rds.model.StartDBClusterRequest`

  returns: Result of the StartDBCluster operation returned by the service. - `com.amazonaws.services.rds.model.DBCluster`

  throws: com.amazonaws.services.rds.model.DBClusterNotFoundException - DBClusterIdentifier doesn't refer to an existing DB cluster."
  (^com.amazonaws.services.rds.model.DBCluster [^AmazonRDSClient this ^com.amazonaws.services.rds.model.StartDBClusterRequest request]
    (-> this (.startDBCluster request))))

(defn create-db-subnet-group
  "Creates a new DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in the AWS
   Region.

  request - `com.amazonaws.services.rds.model.CreateDBSubnetGroupRequest`

  returns: Result of the CreateDBSubnetGroup operation returned by the service. - `com.amazonaws.services.rds.model.DBSubnetGroup`

  throws: com.amazonaws.services.rds.model.DBSubnetGroupAlreadyExistsException - DBSubnetGroupName is already used by an existing DB subnet group."
  (^com.amazonaws.services.rds.model.DBSubnetGroup [^AmazonRDSClient this ^com.amazonaws.services.rds.model.CreateDBSubnetGroupRequest request]
    (-> this (.createDBSubnetGroup request))))

