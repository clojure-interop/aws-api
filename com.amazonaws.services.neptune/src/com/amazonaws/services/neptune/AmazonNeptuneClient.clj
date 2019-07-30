(ns com.amazonaws.services.neptune.AmazonNeptuneClient
  "Client for accessing Amazon Neptune. All service calls made using this client are blocking, and will not return until
  the service call completes.

  Amazon Neptune

  Amazon Neptune is a fast, reliable, fully-managed graph database service that makes it easy to build and run
  applications that work with highly connected datasets. The core of Amazon Neptune is a purpose-built,
  high-performance graph database engine optimized for storing billions of relationships and querying the graph with
  milliseconds latency. Amazon Neptune supports popular graph models Property Graph and W3C's RDF, and their respective
  query languages Apache TinkerPop Gremlin and SPARQL, allowing you to easily build queries that efficiently navigate
  highly connected datasets. Neptune powers graph use cases such as recommendation engines, fraud detection, knowledge
  graphs, drug discovery, and network security.


  This interface reference for Amazon Neptune contains documentation for a programming or command line interface you
  can use to manage Amazon Neptune. Note that Amazon Neptune is asynchronous, which means that some interfaces might
  require techniques such as polling or callback functions to determine when a command has been applied. In this
  reference, the parameter descriptions indicate whether a command is applied immediately, on the next instance reboot,
  or during the maintenance window. The reference structure is as follows, and we list following some related topics
  from the user guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.neptune AmazonNeptuneClient]))

(defn *builder
  "returns: `com.amazonaws.services.neptune.AmazonNeptuneClientBuilder`"
  (^com.amazonaws.services.neptune.AmazonNeptuneClientBuilder []
    (AmazonNeptuneClient/builder )))

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

  request - `com.amazonaws.services.neptune.model.ModifyDBClusterSnapshotAttributeRequest`

  returns: Result of the ModifyDBClusterSnapshotAttribute operation returned by the service. - `com.amazonaws.services.neptune.model.DBClusterSnapshotAttributesResult`

  throws: com.amazonaws.services.neptune.model.DBClusterSnapshotNotFoundException - DBClusterSnapshotIdentifier does not refer to an existing DB cluster snapshot."
  (^com.amazonaws.services.neptune.model.DBClusterSnapshotAttributesResult [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.ModifyDBClusterSnapshotAttributeRequest request]
    (-> this (.modifyDBClusterSnapshotAttribute request))))

(defn create-db-instance
  "Creates a new DB instance.

  request - `com.amazonaws.services.neptune.model.CreateDBInstanceRequest`

  returns: Result of the CreateDBInstance operation returned by the service. - `com.amazonaws.services.neptune.model.DBInstance`

  throws: com.amazonaws.services.neptune.model.StorageQuotaExceededException - Request would result in user exceeding the allowed amount of storage available across all DB instances."
  (^com.amazonaws.services.neptune.model.DBInstance [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.CreateDBInstanceRequest request]
    (-> this (.createDBInstance request))))

(defn list-tags-for-resource
  "Lists all tags on an Amazon Neptune resource.

  request - `com.amazonaws.services.neptune.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.neptune.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.neptune.model.DBInstanceNotFoundException - DBInstanceIdentifier does not refer to an existing DB instance."
  (^com.amazonaws.services.neptune.model.ListTagsForResourceResult [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn modify-db-subnet-group
  "Modifies an existing DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in
   the AWS Region.

  request - `com.amazonaws.services.neptune.model.ModifyDBSubnetGroupRequest`

  returns: Result of the ModifyDBSubnetGroup operation returned by the service. - `com.amazonaws.services.neptune.model.DBSubnetGroup`

  throws: com.amazonaws.services.neptune.model.DBSubnetGroupNotFoundException - DBSubnetGroupName does not refer to an existing DB subnet group."
  (^com.amazonaws.services.neptune.model.DBSubnetGroup [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.ModifyDBSubnetGroupRequest request]
    (-> this (.modifyDBSubnetGroup request))))

(defn describe-db-cluster-snapshot-attributes
  "Returns a list of DB cluster snapshot attribute names and values for a manual DB cluster snapshot.


   When sharing snapshots with other AWS accounts, DescribeDBClusterSnapshotAttributes returns the
   restore attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the
   manual DB cluster snapshot. If all is included in the list of values for the restore
   attribute, then the manual DB cluster snapshot is public and can be copied or restored by all AWS accounts.


   To add or remove access for an AWS account to copy or restore a manual DB cluster snapshot, or to make the manual
   DB cluster snapshot public or private, use the ModifyDBClusterSnapshotAttribute API action.

  request - `com.amazonaws.services.neptune.model.DescribeDBClusterSnapshotAttributesRequest`

  returns: Result of the DescribeDBClusterSnapshotAttributes operation returned by the service. - `com.amazonaws.services.neptune.model.DBClusterSnapshotAttributesResult`

  throws: com.amazonaws.services.neptune.model.DBClusterSnapshotNotFoundException - DBClusterSnapshotIdentifier does not refer to an existing DB cluster snapshot."
  (^com.amazonaws.services.neptune.model.DBClusterSnapshotAttributesResult [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.DescribeDBClusterSnapshotAttributesRequest request]
    (-> this (.describeDBClusterSnapshotAttributes request))))

(defn describe-db-subnet-groups
  "Returns a list of DBSubnetGroup descriptions. If a DBSubnetGroupName is specified, the list will contain only the
   descriptions of the specified DBSubnetGroup.


   For an overview of CIDR ranges, go to the Wikipedia Tutorial.

  request - `com.amazonaws.services.neptune.model.DescribeDBSubnetGroupsRequest`

  returns: Result of the DescribeDBSubnetGroups operation returned by the service. - `com.amazonaws.services.neptune.model.DescribeDBSubnetGroupsResult`

  throws: com.amazonaws.services.neptune.model.DBSubnetGroupNotFoundException - DBSubnetGroupName does not refer to an existing DB subnet group."
  (^com.amazonaws.services.neptune.model.DescribeDBSubnetGroupsResult [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.DescribeDBSubnetGroupsRequest request]
    (-> this (.describeDBSubnetGroups request))))

(defn reboot-db-instance
  "You might need to reboot your DB instance, usually for maintenance reasons. For example, if you make certain
   modifications, or if you change the DB parameter group associated with the DB instance, you must reboot the
   instance for the changes to take effect.


   Rebooting a DB instance restarts the database engine service. Rebooting a DB instance results in a momentary
   outage, during which the DB instance status is set to rebooting.

  request - `com.amazonaws.services.neptune.model.RebootDBInstanceRequest`

  returns: Result of the RebootDBInstance operation returned by the service. - `com.amazonaws.services.neptune.model.DBInstance`

  throws: com.amazonaws.services.neptune.model.InvalidDBInstanceStateException - The specified DB instance is not in the available state."
  (^com.amazonaws.services.neptune.model.DBInstance [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.RebootDBInstanceRequest request]
    (-> this (.rebootDBInstance request))))

(defn copy-db-parameter-group
  "Copies the specified DB parameter group.

  request - `com.amazonaws.services.neptune.model.CopyDBParameterGroupRequest`

  returns: Result of the CopyDBParameterGroup operation returned by the service. - `com.amazonaws.services.neptune.model.DBParameterGroup`

  throws: com.amazonaws.services.neptune.model.DBParameterGroupNotFoundException - DBParameterGroupName does not refer to an existing DB parameter group."
  (^com.amazonaws.services.neptune.model.DBParameterGroup [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.CopyDBParameterGroupRequest request]
    (-> this (.copyDBParameterGroup request))))

(defn delete-db-cluster-snapshot
  "Deletes a DB cluster snapshot. If the snapshot is being copied, the copy operation is terminated.



   The DB cluster snapshot must be in the available state to be deleted.

  request - `com.amazonaws.services.neptune.model.DeleteDBClusterSnapshotRequest`

  returns: Result of the DeleteDBClusterSnapshot operation returned by the service. - `com.amazonaws.services.neptune.model.DBClusterSnapshot`

  throws: com.amazonaws.services.neptune.model.InvalidDBClusterSnapshotStateException - The supplied value is not a valid DB cluster snapshot state."
  (^com.amazonaws.services.neptune.model.DBClusterSnapshot [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.DeleteDBClusterSnapshotRequest request]
    (-> this (.deleteDBClusterSnapshot request))))

(defn create-event-subscription
  "Creates an event notification subscription. This action requires a topic ARN (Amazon Resource Name) created by
   either the Neptune console, the SNS console, or the SNS API. To obtain an ARN with SNS, you must create a topic
   in Amazon SNS and subscribe to the topic. The ARN is displayed in the SNS console.


   You can specify the type of source (SourceType) you want to be notified of, provide a list of Neptune sources
   (SourceIds) that triggers the events, and provide a list of event categories (EventCategories) for events you
   want to be notified of. For example, you can specify SourceType = db-instance, SourceIds = mydbinstance1,
   mydbinstance2 and EventCategories = Availability, Backup.


   If you specify both the SourceType and SourceIds, such as SourceType = db-instance and SourceIdentifier =
   myDBInstance1, you are notified of all the db-instance events for the specified source. If you specify a
   SourceType but do not specify a SourceIdentifier, you receive notice of the events for that source type for all
   your Neptune sources. If you do not specify either the SourceType nor the SourceIdentifier, you are notified of
   events generated from all Neptune sources belonging to your customer account.

  request - `com.amazonaws.services.neptune.model.CreateEventSubscriptionRequest`

  returns: Result of the CreateEventSubscription operation returned by the service. - `com.amazonaws.services.neptune.model.EventSubscription`

  throws: com.amazonaws.services.neptune.model.EventSubscriptionQuotaExceededException - You have exceeded the number of events you can subscribe to."
  (^com.amazonaws.services.neptune.model.EventSubscription [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.CreateEventSubscriptionRequest request]
    (-> this (.createEventSubscription request))))

(defn waiters
  "returns: `com.amazonaws.services.neptune.waiters.AmazonNeptuneWaiters`"
  (^com.amazonaws.services.neptune.waiters.AmazonNeptuneWaiters [^AmazonNeptuneClient this]
    (-> this (.waiters))))

(defn describe-event-subscriptions
  "Lists all the subscription descriptions for a customer account. The description for a subscription includes
   SubscriptionName, SNSTopicARN, CustomerID, SourceType, SourceID, CreationTime, and Status.


   If you specify a SubscriptionName, lists the description for that subscription.

  request - `com.amazonaws.services.neptune.model.DescribeEventSubscriptionsRequest`

  returns: Result of the DescribeEventSubscriptions operation returned by the service. - `com.amazonaws.services.neptune.model.DescribeEventSubscriptionsResult`

  throws: com.amazonaws.services.neptune.model.SubscriptionNotFoundException - The designated subscription could not be found."
  (^com.amazonaws.services.neptune.model.DescribeEventSubscriptionsResult [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.DescribeEventSubscriptionsRequest request]
    (-> this (.describeEventSubscriptions request))))

(defn promote-read-replica-db-cluster
  "Not supported.

  request - `com.amazonaws.services.neptune.model.PromoteReadReplicaDBClusterRequest`

  returns: Result of the PromoteReadReplicaDBCluster operation returned by the service. - `com.amazonaws.services.neptune.model.DBCluster`

  throws: com.amazonaws.services.neptune.model.DBClusterNotFoundException - DBClusterIdentifier does not refer to an existing DB cluster."
  (^com.amazonaws.services.neptune.model.DBCluster [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.PromoteReadReplicaDBClusterRequest request]
    (-> this (.promoteReadReplicaDBCluster request))))

(defn delete-db-cluster-parameter-group
  "Deletes a specified DB cluster parameter group. The DB cluster parameter group to be deleted can't be associated
   with any DB clusters.

  request - `com.amazonaws.services.neptune.model.DeleteDBClusterParameterGroupRequest`

  returns: Result of the DeleteDBClusterParameterGroup operation returned by the service. - `com.amazonaws.services.neptune.model.DeleteDBClusterParameterGroupResult`

  throws: com.amazonaws.services.neptune.model.InvalidDBParameterGroupStateException - The DB parameter group is in use or is in an invalid state. If you are attempting to delete the parameter group, you cannot delete it when the parameter group is in this state."
  (^com.amazonaws.services.neptune.model.DeleteDBClusterParameterGroupResult [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.DeleteDBClusterParameterGroupRequest request]
    (-> this (.deleteDBClusterParameterGroup request))))

(defn describe-engine-default-cluster-parameters
  "Returns the default engine and system parameter information for the cluster database engine.

  request - `com.amazonaws.services.neptune.model.DescribeEngineDefaultClusterParametersRequest`

  returns: Result of the DescribeEngineDefaultClusterParameters operation returned by the service. - `com.amazonaws.services.neptune.model.EngineDefaults`"
  (^com.amazonaws.services.neptune.model.EngineDefaults [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.DescribeEngineDefaultClusterParametersRequest request]
    (-> this (.describeEngineDefaultClusterParameters request))))

(defn describe-pending-maintenance-actions
  "Returns a list of resources (for example, DB instances) that have at least one pending maintenance action.

  request - `com.amazonaws.services.neptune.model.DescribePendingMaintenanceActionsRequest`

  returns: Result of the DescribePendingMaintenanceActions operation returned by the service. - `com.amazonaws.services.neptune.model.DescribePendingMaintenanceActionsResult`

  throws: com.amazonaws.services.neptune.model.ResourceNotFoundException - The specified resource ID was not found."
  (^com.amazonaws.services.neptune.model.DescribePendingMaintenanceActionsResult [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.DescribePendingMaintenanceActionsRequest request]
    (-> this (.describePendingMaintenanceActions request))))

(defn failover-db-cluster
  "Forces a failover for a DB cluster.


   A failover for a DB cluster promotes one of the Read Replicas (read-only instances) in the DB cluster to be the
   primary instance (the cluster writer).


   Amazon Neptune will automatically fail over to a Read Replica, if one exists, when the primary instance fails.
   You can force a failover when you want to simulate a failure of a primary instance for testing. Because each
   instance in a DB cluster has its own endpoint address, you will need to clean up and re-establish any existing
   connections that use those endpoint addresses when the failover is complete.

  request - `com.amazonaws.services.neptune.model.FailoverDBClusterRequest`

  returns: Result of the FailoverDBCluster operation returned by the service. - `com.amazonaws.services.neptune.model.DBCluster`

  throws: com.amazonaws.services.neptune.model.DBClusterNotFoundException - DBClusterIdentifier does not refer to an existing DB cluster."
  (^com.amazonaws.services.neptune.model.DBCluster [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.FailoverDBClusterRequest request]
    (-> this (.failoverDBCluster request))))

(defn modify-db-instance
  "Modifies settings for a DB instance. You can change one or more database configuration parameters by specifying
   these parameters and the new values in the request. To learn what modifications you can make to your DB instance,
   call DescribeValidDBInstanceModifications before you call ModifyDBInstance.

  request - `com.amazonaws.services.neptune.model.ModifyDBInstanceRequest`

  returns: Result of the ModifyDBInstance operation returned by the service. - `com.amazonaws.services.neptune.model.DBInstance`

  throws: com.amazonaws.services.neptune.model.StorageQuotaExceededException - Request would result in user exceeding the allowed amount of storage available across all DB instances."
  (^com.amazonaws.services.neptune.model.DBInstance [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.ModifyDBInstanceRequest request]
    (-> this (.modifyDBInstance request))))

(defn create-db-cluster
  "Creates a new Amazon Neptune DB cluster.


   You can use the ReplicationSourceIdentifier parameter to create the DB cluster as a Read Replica of
   another DB cluster or Amazon Neptune DB instance.

  request - `com.amazonaws.services.neptune.model.CreateDBClusterRequest`

  returns: Result of the CreateDBCluster operation returned by the service. - `com.amazonaws.services.neptune.model.DBCluster`

  throws: com.amazonaws.services.neptune.model.StorageQuotaExceededException - Request would result in user exceeding the allowed amount of storage available across all DB instances."
  (^com.amazonaws.services.neptune.model.DBCluster [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.CreateDBClusterRequest request]
    (-> this (.createDBCluster request))))

(defn describe-valid-db-instance-modifications
  "You can call DescribeValidDBInstanceModifications to learn what modifications you can make to your DB
   instance. You can use this information when you call ModifyDBInstance.

  request - `com.amazonaws.services.neptune.model.DescribeValidDBInstanceModificationsRequest`

  returns: Result of the DescribeValidDBInstanceModifications operation returned by the service. - `com.amazonaws.services.neptune.model.ValidDBInstanceModificationsMessage`

  throws: com.amazonaws.services.neptune.model.DBInstanceNotFoundException - DBInstanceIdentifier does not refer to an existing DB instance."
  (^com.amazonaws.services.neptune.model.ValidDBInstanceModificationsMessage [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.DescribeValidDBInstanceModificationsRequest request]
    (-> this (.describeValidDBInstanceModifications request))))

(defn delete-db-instance
  "The DeleteDBInstance action deletes a previously provisioned DB instance. When you delete a DB instance, all
   automated backups for that instance are deleted and can't be recovered. Manual DB snapshots of the DB instance to
   be deleted by DeleteDBInstance are not deleted.


   If you request a final DB snapshot the status of the Amazon Neptune DB instance is deleting until
   the DB snapshot is created. The API action DescribeDBInstance is used to monitor the status of this
   operation. The action can't be canceled or reverted once submitted.


   Note that when a DB instance is in a failure state and has a status of failed,
   incompatible-restore, or incompatible-network, you can only delete it when the
   SkipFinalSnapshot parameter is set to true.


   You can't delete a DB instance if it is the only instance in the DB cluster.

  request - `com.amazonaws.services.neptune.model.DeleteDBInstanceRequest`

  returns: Result of the DeleteDBInstance operation returned by the service. - `com.amazonaws.services.neptune.model.DBInstance`

  throws: com.amazonaws.services.neptune.model.DBInstanceNotFoundException - DBInstanceIdentifier does not refer to an existing DB instance."
  (^com.amazonaws.services.neptune.model.DBInstance [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.DeleteDBInstanceRequest request]
    (-> this (.deleteDBInstance request))))

(defn delete-db-subnet-group
  "Deletes a DB subnet group.



   The specified database subnet group must not be associated with any DB instances.

  request - `com.amazonaws.services.neptune.model.DeleteDBSubnetGroupRequest`

  returns: Result of the DeleteDBSubnetGroup operation returned by the service. - `com.amazonaws.services.neptune.model.DeleteDBSubnetGroupResult`

  throws: com.amazonaws.services.neptune.model.InvalidDBSubnetGroupStateException - The DB subnet group cannot be deleted because it is in use."
  (^com.amazonaws.services.neptune.model.DeleteDBSubnetGroupResult [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.DeleteDBSubnetGroupRequest request]
    (-> this (.deleteDBSubnetGroup request))))

(defn restore-db-cluster-to-point-in-time
  "Restores a DB cluster to an arbitrary point in time. Users can restore to any point in time before
   LatestRestorableTime for up to BackupRetentionPeriod days. The target DB cluster is
   created from the source DB cluster with the same configuration as the original DB cluster, except that the new DB
   cluster is created with the default DB security group.



   This action only restores the DB cluster, not the DB instances for that DB cluster. You must invoke the
   CreateDBInstance action to create DB instances for the restored DB cluster, specifying the identifier of
   the restored DB cluster in DBClusterIdentifier. You can create DB instances only after the
   RestoreDBClusterToPointInTime action has completed and the DB cluster is available.

  request - `com.amazonaws.services.neptune.model.RestoreDBClusterToPointInTimeRequest`

  returns: Result of the RestoreDBClusterToPointInTime operation returned by the service. - `com.amazonaws.services.neptune.model.DBCluster`

  throws: com.amazonaws.services.neptune.model.StorageQuotaExceededException - Request would result in user exceeding the allowed amount of storage available across all DB instances."
  (^com.amazonaws.services.neptune.model.DBCluster [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.RestoreDBClusterToPointInTimeRequest request]
    (-> this (.restoreDBClusterToPointInTime request))))

(defn add-role-to-db-cluster
  "Associates an Identity and Access Management (IAM) role from an Neptune DB cluster.

  request - `com.amazonaws.services.neptune.model.AddRoleToDBClusterRequest`

  returns: Result of the AddRoleToDBCluster operation returned by the service. - `com.amazonaws.services.neptune.model.AddRoleToDBClusterResult`

  throws: com.amazonaws.services.neptune.model.DBClusterNotFoundException - DBClusterIdentifier does not refer to an existing DB cluster."
  (^com.amazonaws.services.neptune.model.AddRoleToDBClusterResult [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.AddRoleToDBClusterRequest request]
    (-> this (.addRoleToDBCluster request))))

(defn delete-db-cluster
  "The DeleteDBCluster action deletes a previously provisioned DB cluster. When you delete a DB cluster, all
   automated backups for that DB cluster are deleted and can't be recovered. Manual DB cluster snapshots of the
   specified DB cluster are not deleted.

  request - `com.amazonaws.services.neptune.model.DeleteDBClusterRequest`

  returns: Result of the DeleteDBCluster operation returned by the service. - `com.amazonaws.services.neptune.model.DBCluster`

  throws: com.amazonaws.services.neptune.model.DBClusterNotFoundException - DBClusterIdentifier does not refer to an existing DB cluster."
  (^com.amazonaws.services.neptune.model.DBCluster [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.DeleteDBClusterRequest request]
    (-> this (.deleteDBCluster request))))

(defn modify-event-subscription
  "Modifies an existing event notification subscription. Note that you can't modify the source identifiers using
   this call; to change source identifiers for a subscription, use the AddSourceIdentifierToSubscription and
   RemoveSourceIdentifierFromSubscription calls.


   You can see a list of the event categories for a given SourceType by using the DescribeEventCategories
   action.

  request - `com.amazonaws.services.neptune.model.ModifyEventSubscriptionRequest`

  returns: Result of the ModifyEventSubscription operation returned by the service. - `com.amazonaws.services.neptune.model.EventSubscription`

  throws: com.amazonaws.services.neptune.model.EventSubscriptionQuotaExceededException - You have exceeded the number of events you can subscribe to."
  (^com.amazonaws.services.neptune.model.EventSubscription [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.ModifyEventSubscriptionRequest request]
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
   that uses that DB parameter group as the default parameter group. This allows Amazon Neptune to fully complete
   the create action before the parameter group is used as the default for a new DB instance. This is especially
   important for parameters that are critical when creating the default database for a DB instance, such as the
   character set for the default database defined by the character_set_database parameter. You can use
   the Parameter Groups option of the Amazon Neptune console or the DescribeDBParameters command to
   verify that your DB parameter group has been created or modified.

  request - `com.amazonaws.services.neptune.model.CreateDBParameterGroupRequest`

  returns: Result of the CreateDBParameterGroup operation returned by the service. - `com.amazonaws.services.neptune.model.DBParameterGroup`

  throws: com.amazonaws.services.neptune.model.DBParameterGroupQuotaExceededException - Request would result in user exceeding the allowed number of DB parameter groups."
  (^com.amazonaws.services.neptune.model.DBParameterGroup [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.CreateDBParameterGroupRequest request]
    (-> this (.createDBParameterGroup request))))

(defn create-db-cluster-snapshot
  "Creates a snapshot of a DB cluster.

  request - `com.amazonaws.services.neptune.model.CreateDBClusterSnapshotRequest`

  returns: Result of the CreateDBClusterSnapshot operation returned by the service. - `com.amazonaws.services.neptune.model.DBClusterSnapshot`

  throws: com.amazonaws.services.neptune.model.DBClusterSnapshotAlreadyExistsException - User already has a DB cluster snapshot with the given identifier."
  (^com.amazonaws.services.neptune.model.DBClusterSnapshot [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.CreateDBClusterSnapshotRequest request]
    (-> this (.createDBClusterSnapshot request))))

(defn shutdown
  "Description copied from class: AmazonWebServiceClient"
  ([^AmazonNeptuneClient this]
    (-> this (.shutdown))))

(defn describe-events
  "Returns events related to DB instances, DB security groups, DB snapshots, and DB parameter groups for the past 14
   days. Events specific to a particular DB instance, DB security group, database snapshot, or DB parameter group
   can be obtained by providing the name as a parameter. By default, the past hour of events are returned.

  request - `com.amazonaws.services.neptune.model.DescribeEventsRequest`

  returns: Result of the DescribeEvents operation returned by the service. - `com.amazonaws.services.neptune.model.DescribeEventsResult`"
  (^com.amazonaws.services.neptune.model.DescribeEventsResult [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.DescribeEventsRequest request]
    (-> this (.describeEvents request))))

(defn remove-role-from-db-cluster
  "Disassociates an Identity and Access Management (IAM) role from a DB cluster.

  request - `com.amazonaws.services.neptune.model.RemoveRoleFromDBClusterRequest`

  returns: Result of the RemoveRoleFromDBCluster operation returned by the service. - `com.amazonaws.services.neptune.model.RemoveRoleFromDBClusterResult`

  throws: com.amazonaws.services.neptune.model.DBClusterNotFoundException - DBClusterIdentifier does not refer to an existing DB cluster."
  (^com.amazonaws.services.neptune.model.RemoveRoleFromDBClusterResult [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.RemoveRoleFromDBClusterRequest request]
    (-> this (.removeRoleFromDBCluster request))))

(defn describe-event-categories
  "Displays a list of categories for all event source types, or, if specified, for a specified source type.

  request - `com.amazonaws.services.neptune.model.DescribeEventCategoriesRequest`

  returns: Result of the DescribeEventCategories operation returned by the service. - `com.amazonaws.services.neptune.model.DescribeEventCategoriesResult`"
  (^com.amazonaws.services.neptune.model.DescribeEventCategoriesResult [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.DescribeEventCategoriesRequest request]
    (-> this (.describeEventCategories request))))

(defn describe-db-engine-versions
  "Returns a list of the available DB engines.

  request - `com.amazonaws.services.neptune.model.DescribeDBEngineVersionsRequest`

  returns: Result of the DescribeDBEngineVersions operation returned by the service. - `com.amazonaws.services.neptune.model.DescribeDBEngineVersionsResult`"
  (^com.amazonaws.services.neptune.model.DescribeDBEngineVersionsResult [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.DescribeDBEngineVersionsRequest request]
    (-> this (.describeDBEngineVersions request))))

(defn describe-db-parameters
  "Returns the detailed parameter list for a particular DB parameter group.

  request - `com.amazonaws.services.neptune.model.DescribeDBParametersRequest`

  returns: Result of the DescribeDBParameters operation returned by the service. - `com.amazonaws.services.neptune.model.DescribeDBParametersResult`

  throws: com.amazonaws.services.neptune.model.DBParameterGroupNotFoundException - DBParameterGroupName does not refer to an existing DB parameter group."
  (^com.amazonaws.services.neptune.model.DescribeDBParametersResult [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.DescribeDBParametersRequest request]
    (-> this (.describeDBParameters request))))

(defn delete-event-subscription
  "Deletes an event notification subscription.

  request - `com.amazonaws.services.neptune.model.DeleteEventSubscriptionRequest`

  returns: Result of the DeleteEventSubscription operation returned by the service. - `com.amazonaws.services.neptune.model.EventSubscription`

  throws: com.amazonaws.services.neptune.model.SubscriptionNotFoundException - The designated subscription could not be found."
  (^com.amazonaws.services.neptune.model.EventSubscription [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.DeleteEventSubscriptionRequest request]
    (-> this (.deleteEventSubscription request))))

(defn create-db-cluster-parameter-group
  "Creates a new DB cluster parameter group.


   Parameters in a DB cluster parameter group apply to all of the instances in a DB cluster.


   A DB cluster parameter group is initially created with the default parameters for the database engine used by
   instances in the DB cluster. To provide custom values for any of the parameters, you must modify the group after
   creating it using ModifyDBClusterParameterGroup. Once you've created a DB cluster parameter group, you
   need to associate it with your DB cluster using ModifyDBCluster. When you associate a new DB cluster
   parameter group with a running DB cluster, you need to reboot the DB instances in the DB cluster without failover
   for the new DB cluster parameter group and associated settings to take effect.



   After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB
   cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon Neptune to
   fully complete the create action before the DB cluster parameter group is used as the default for a new DB
   cluster. This is especially important for parameters that are critical when creating the default database for a
   DB cluster, such as the character set for the default database defined by the character_set_database
   parameter. You can use the Parameter Groups option of the Amazon Neptune console or the DescribeDBClusterParameters
   command to verify that your DB cluster parameter group has been created or modified.

  request - `com.amazonaws.services.neptune.model.CreateDBClusterParameterGroupRequest`

  returns: Result of the CreateDBClusterParameterGroup operation returned by the service. - `com.amazonaws.services.neptune.model.DBClusterParameterGroup`

  throws: com.amazonaws.services.neptune.model.DBParameterGroupQuotaExceededException - Request would result in user exceeding the allowed number of DB parameter groups."
  (^com.amazonaws.services.neptune.model.DBClusterParameterGroup [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.CreateDBClusterParameterGroupRequest request]
    (-> this (.createDBClusterParameterGroup request))))

(defn describe-db-parameter-groups
  "Returns a list of DBParameterGroup descriptions. If a DBParameterGroupName is
   specified, the list will contain only the description of the specified DB parameter group.

  request - `com.amazonaws.services.neptune.model.DescribeDBParameterGroupsRequest`

  returns: Result of the DescribeDBParameterGroups operation returned by the service. - `com.amazonaws.services.neptune.model.DescribeDBParameterGroupsResult`

  throws: com.amazonaws.services.neptune.model.DBParameterGroupNotFoundException - DBParameterGroupName does not refer to an existing DB parameter group."
  (^com.amazonaws.services.neptune.model.DescribeDBParameterGroupsResult [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.DescribeDBParameterGroupsRequest request]
    (-> this (.describeDBParameterGroups request))))

(defn describe-db-cluster-parameter-groups
  "Returns a list of DBClusterParameterGroup descriptions. If a
   DBClusterParameterGroupName parameter is specified, the list will contain only the description of
   the specified DB cluster parameter group.

  request - `com.amazonaws.services.neptune.model.DescribeDBClusterParameterGroupsRequest`

  returns: Result of the DescribeDBClusterParameterGroups operation returned by the service. - `com.amazonaws.services.neptune.model.DescribeDBClusterParameterGroupsResult`

  throws: com.amazonaws.services.neptune.model.DBParameterGroupNotFoundException - DBParameterGroupName does not refer to an existing DB parameter group."
  (^com.amazonaws.services.neptune.model.DescribeDBClusterParameterGroupsResult [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.DescribeDBClusterParameterGroupsRequest request]
    (-> this (.describeDBClusterParameterGroups request))))

(defn describe-db-instances
  "Returns information about provisioned instances. This API supports pagination.

  request - `com.amazonaws.services.neptune.model.DescribeDBInstancesRequest`

  returns: Result of the DescribeDBInstances operation returned by the service. - `com.amazonaws.services.neptune.model.DescribeDBInstancesResult`

  throws: com.amazonaws.services.neptune.model.DBInstanceNotFoundException - DBInstanceIdentifier does not refer to an existing DB instance."
  (^com.amazonaws.services.neptune.model.DescribeDBInstancesResult [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.DescribeDBInstancesRequest request]
    (-> this (.describeDBInstances request))))

(defn describe-engine-default-parameters
  "Returns the default engine and system parameter information for the specified database engine.

  request - `com.amazonaws.services.neptune.model.DescribeEngineDefaultParametersRequest`

  returns: Result of the DescribeEngineDefaultParameters operation returned by the service. - `com.amazonaws.services.neptune.model.EngineDefaults`"
  (^com.amazonaws.services.neptune.model.EngineDefaults [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.DescribeEngineDefaultParametersRequest request]
    (-> this (.describeEngineDefaultParameters request))))

(defn remove-tags-from-resource
  "Removes metadata tags from an Amazon Neptune resource.

  request - `com.amazonaws.services.neptune.model.RemoveTagsFromResourceRequest`

  returns: Result of the RemoveTagsFromResource operation returned by the service. - `com.amazonaws.services.neptune.model.RemoveTagsFromResourceResult`

  throws: com.amazonaws.services.neptune.model.DBInstanceNotFoundException - DBInstanceIdentifier does not refer to an existing DB instance."
  (^com.amazonaws.services.neptune.model.RemoveTagsFromResourceResult [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.RemoveTagsFromResourceRequest request]
    (-> this (.removeTagsFromResource request))))

(defn remove-source-identifier-from-subscription
  "Removes a source identifier from an existing event notification subscription.

  request - `com.amazonaws.services.neptune.model.RemoveSourceIdentifierFromSubscriptionRequest`

  returns: Result of the RemoveSourceIdentifierFromSubscription operation returned by the service. - `com.amazonaws.services.neptune.model.EventSubscription`

  throws: com.amazonaws.services.neptune.model.SubscriptionNotFoundException - The designated subscription could not be found."
  (^com.amazonaws.services.neptune.model.EventSubscription [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.RemoveSourceIdentifierFromSubscriptionRequest request]
    (-> this (.removeSourceIdentifierFromSubscription request))))

(defn reset-db-parameter-group
  "Modifies the parameters of a DB parameter group to the engine/system default value. To reset specific parameters,
   provide a list of the following: ParameterName and ApplyMethod. To reset the entire DB
   parameter group, specify the DBParameterGroup name and ResetAllParameters parameters.
   When resetting the entire group, dynamic parameters are updated immediately and static parameters are set to
   pending-reboot to take effect on the next DB instance restart or RebootDBInstance
   request.

  request - `com.amazonaws.services.neptune.model.ResetDBParameterGroupRequest`

  returns: Result of the ResetDBParameterGroup operation returned by the service. - `com.amazonaws.services.neptune.model.ResetDBParameterGroupResult`

  throws: com.amazonaws.services.neptune.model.InvalidDBParameterGroupStateException - The DB parameter group is in use or is in an invalid state. If you are attempting to delete the parameter group, you cannot delete it when the parameter group is in this state."
  (^com.amazonaws.services.neptune.model.ResetDBParameterGroupResult [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.ResetDBParameterGroupRequest request]
    (-> this (.resetDBParameterGroup request))))

(defn describe-db-cluster-snapshots
  "Returns information about DB cluster snapshots. This API action supports pagination.

  request - `com.amazonaws.services.neptune.model.DescribeDBClusterSnapshotsRequest`

  returns: Result of the DescribeDBClusterSnapshots operation returned by the service. - `com.amazonaws.services.neptune.model.DescribeDBClusterSnapshotsResult`

  throws: com.amazonaws.services.neptune.model.DBClusterSnapshotNotFoundException - DBClusterSnapshotIdentifier does not refer to an existing DB cluster snapshot."
  (^com.amazonaws.services.neptune.model.DescribeDBClusterSnapshotsResult [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.DescribeDBClusterSnapshotsRequest request]
    (-> this (.describeDBClusterSnapshots request))))

(defn delete-db-parameter-group
  "Deletes a specified DBParameterGroup. The DBParameterGroup to be deleted can't be associated with any DB
   instances.

  request - `com.amazonaws.services.neptune.model.DeleteDBParameterGroupRequest`

  returns: Result of the DeleteDBParameterGroup operation returned by the service. - `com.amazonaws.services.neptune.model.DeleteDBParameterGroupResult`

  throws: com.amazonaws.services.neptune.model.InvalidDBParameterGroupStateException - The DB parameter group is in use or is in an invalid state. If you are attempting to delete the parameter group, you cannot delete it when the parameter group is in this state."
  (^com.amazonaws.services.neptune.model.DeleteDBParameterGroupResult [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.DeleteDBParameterGroupRequest request]
    (-> this (.deleteDBParameterGroup request))))

(defn describe-orderable-db-instance-options
  "Returns a list of orderable DB instance options for the specified engine.

  request - `com.amazonaws.services.neptune.model.DescribeOrderableDBInstanceOptionsRequest`

  returns: Result of the DescribeOrderableDBInstanceOptions operation returned by the service. - `com.amazonaws.services.neptune.model.DescribeOrderableDBInstanceOptionsResult`"
  (^com.amazonaws.services.neptune.model.DescribeOrderableDBInstanceOptionsResult [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.DescribeOrderableDBInstanceOptionsRequest request]
    (-> this (.describeOrderableDBInstanceOptions request))))

(defn describe-db-cluster-parameters
  "Returns the detailed parameter list for a particular DB cluster parameter group.

  request - `com.amazonaws.services.neptune.model.DescribeDBClusterParametersRequest`

  returns: Result of the DescribeDBClusterParameters operation returned by the service. - `com.amazonaws.services.neptune.model.DescribeDBClusterParametersResult`

  throws: com.amazonaws.services.neptune.model.DBParameterGroupNotFoundException - DBParameterGroupName does not refer to an existing DB parameter group."
  (^com.amazonaws.services.neptune.model.DescribeDBClusterParametersResult [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.DescribeDBClusterParametersRequest request]
    (-> this (.describeDBClusterParameters request))))

(defn restore-db-cluster-from-snapshot
  "Creates a new DB cluster from a DB snapshot or DB cluster snapshot.


   If a DB snapshot is specified, the target DB cluster is created from the source DB snapshot with a default
   configuration and default security group.


   If a DB cluster snapshot is specified, the target DB cluster is created from the source DB cluster restore point
   with the same configuration as the original source DB cluster, except that the new DB cluster is created with the
   default security group.

  request - `com.amazonaws.services.neptune.model.RestoreDBClusterFromSnapshotRequest`

  returns: Result of the RestoreDBClusterFromSnapshot operation returned by the service. - `com.amazonaws.services.neptune.model.DBCluster`

  throws: com.amazonaws.services.neptune.model.StorageQuotaExceededException - Request would result in user exceeding the allowed amount of storage available across all DB instances."
  (^com.amazonaws.services.neptune.model.DBCluster [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.RestoreDBClusterFromSnapshotRequest request]
    (-> this (.restoreDBClusterFromSnapshot request))))

(defn describe-db-clusters
  "Returns information about provisioned DB clusters. This API supports pagination.

  request - `com.amazonaws.services.neptune.model.DescribeDBClustersRequest`

  returns: Result of the DescribeDBClusters operation returned by the service. - `com.amazonaws.services.neptune.model.DescribeDBClustersResult`

  throws: com.amazonaws.services.neptune.model.DBClusterNotFoundException - DBClusterIdentifier does not refer to an existing DB cluster."
  (^com.amazonaws.services.neptune.model.DescribeDBClustersResult [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.DescribeDBClustersRequest request]
    (-> this (.describeDBClusters request))))

(defn add-tags-to-resource
  "Adds metadata tags to an Amazon Neptune resource. These tags can also be used with cost allocation reporting to
   track cost associated with Amazon Neptune resources, or used in a Condition statement in an IAM policy for Amazon
   Neptune.

  request - `com.amazonaws.services.neptune.model.AddTagsToResourceRequest`

  returns: Result of the AddTagsToResource operation returned by the service. - `com.amazonaws.services.neptune.model.AddTagsToResourceResult`

  throws: com.amazonaws.services.neptune.model.DBInstanceNotFoundException - DBInstanceIdentifier does not refer to an existing DB instance."
  (^com.amazonaws.services.neptune.model.AddTagsToResourceResult [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.AddTagsToResourceRequest request]
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
  (^com.amazonaws.ResponseMetadata [^AmazonNeptuneClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn add-source-identifier-to-subscription
  "Adds a source identifier to an existing event notification subscription.

  request - `com.amazonaws.services.neptune.model.AddSourceIdentifierToSubscriptionRequest`

  returns: Result of the AddSourceIdentifierToSubscription operation returned by the service. - `com.amazonaws.services.neptune.model.EventSubscription`

  throws: com.amazonaws.services.neptune.model.SubscriptionNotFoundException - The designated subscription could not be found."
  (^com.amazonaws.services.neptune.model.EventSubscription [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.AddSourceIdentifierToSubscriptionRequest request]
    (-> this (.addSourceIdentifierToSubscription request))))

(defn modify-db-cluster-parameter-group
  "Modifies the parameters of a DB cluster parameter group. To modify more than one parameter, submit a list of the
   following: ParameterName, ParameterValue, and ApplyMethod. A maximum of 20
   parameters can be modified in a single request.



   Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot without
   failover to the DB cluster associated with the parameter group before the change can take effect.



   After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB
   cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon Neptune to
   fully complete the create action before the parameter group is used as the default for a new DB cluster. This is
   especially important for parameters that are critical when creating the default database for a DB cluster, such
   as the character set for the default database defined by the character_set_database parameter. You
   can use the Parameter Groups option of the Amazon Neptune console or the
   DescribeDBClusterParameters command to verify that your DB cluster parameter group has been created or
   modified.

  request - `com.amazonaws.services.neptune.model.ModifyDBClusterParameterGroupRequest`

  returns: Result of the ModifyDBClusterParameterGroup operation returned by the service. - `com.amazonaws.services.neptune.model.ModifyDBClusterParameterGroupResult`

  throws: com.amazonaws.services.neptune.model.DBParameterGroupNotFoundException - DBParameterGroupName does not refer to an existing DB parameter group."
  (^com.amazonaws.services.neptune.model.ModifyDBClusterParameterGroupResult [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.ModifyDBClusterParameterGroupRequest request]
    (-> this (.modifyDBClusterParameterGroup request))))

(defn modify-db-parameter-group
  "Modifies the parameters of a DB parameter group. To modify more than one parameter, submit a list of the
   following: ParameterName, ParameterValue, and ApplyMethod. A maximum of 20
   parameters can be modified in a single request.



   Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot without
   failover to the DB instance associated with the parameter group before the change can take effect.



   After you modify a DB parameter group, you should wait at least 5 minutes before creating your first DB instance
   that uses that DB parameter group as the default parameter group. This allows Amazon Neptune to fully complete
   the modify action before the parameter group is used as the default for a new DB instance. This is especially
   important for parameters that are critical when creating the default database for a DB instance, such as the
   character set for the default database defined by the character_set_database parameter. You can use
   the Parameter Groups option of the Amazon Neptune console or the DescribeDBParameters command to
   verify that your DB parameter group has been created or modified.

  request - `com.amazonaws.services.neptune.model.ModifyDBParameterGroupRequest`

  returns: Result of the ModifyDBParameterGroup operation returned by the service. - `com.amazonaws.services.neptune.model.ModifyDBParameterGroupResult`

  throws: com.amazonaws.services.neptune.model.DBParameterGroupNotFoundException - DBParameterGroupName does not refer to an existing DB parameter group."
  (^com.amazonaws.services.neptune.model.ModifyDBParameterGroupResult [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.ModifyDBParameterGroupRequest request]
    (-> this (.modifyDBParameterGroup request))))

(defn reset-db-cluster-parameter-group
  "Modifies the parameters of a DB cluster parameter group to the default value. To reset specific parameters submit
   a list of the following: ParameterName and ApplyMethod. To reset the entire DB cluster
   parameter group, specify the DBClusterParameterGroupName and ResetAllParameters
   parameters.


   When resetting the entire group, dynamic parameters are updated immediately and static parameters are set to
   pending-reboot to take effect on the next DB instance restart or RebootDBInstance request.
   You must call RebootDBInstance for every DB instance in your DB cluster that you want the updated static
   parameter to apply to.

  request - `com.amazonaws.services.neptune.model.ResetDBClusterParameterGroupRequest`

  returns: Result of the ResetDBClusterParameterGroup operation returned by the service. - `com.amazonaws.services.neptune.model.ResetDBClusterParameterGroupResult`

  throws: com.amazonaws.services.neptune.model.InvalidDBParameterGroupStateException - The DB parameter group is in use or is in an invalid state. If you are attempting to delete the parameter group, you cannot delete it when the parameter group is in this state."
  (^com.amazonaws.services.neptune.model.ResetDBClusterParameterGroupResult [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.ResetDBClusterParameterGroupRequest request]
    (-> this (.resetDBClusterParameterGroup request))))

(defn modify-db-cluster
  "Modify a setting for a DB cluster. You can change one or more database configuration parameters by specifying
   these parameters and the new values in the request.

  request - `com.amazonaws.services.neptune.model.ModifyDBClusterRequest`

  returns: Result of the ModifyDBCluster operation returned by the service. - `com.amazonaws.services.neptune.model.DBCluster`

  throws: com.amazonaws.services.neptune.model.StorageQuotaExceededException - Request would result in user exceeding the allowed amount of storage available across all DB instances."
  (^com.amazonaws.services.neptune.model.DBCluster [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.ModifyDBClusterRequest request]
    (-> this (.modifyDBCluster request))))

(defn copy-db-cluster-parameter-group
  "Copies the specified DB cluster parameter group.

  request - `com.amazonaws.services.neptune.model.CopyDBClusterParameterGroupRequest`

  returns: Result of the CopyDBClusterParameterGroup operation returned by the service. - `com.amazonaws.services.neptune.model.DBClusterParameterGroup`

  throws: com.amazonaws.services.neptune.model.DBParameterGroupNotFoundException - DBParameterGroupName does not refer to an existing DB parameter group."
  (^com.amazonaws.services.neptune.model.DBClusterParameterGroup [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.CopyDBClusterParameterGroupRequest request]
    (-> this (.copyDBClusterParameterGroup request))))

(defn copy-db-cluster-snapshot
  "Copies a snapshot of a DB cluster.


   To copy a DB cluster snapshot from a shared manual DB cluster snapshot,
   SourceDBClusterSnapshotIdentifier must be the Amazon Resource Name (ARN) of the shared DB cluster
   snapshot.


   You can't copy from one AWS Region to another.

  request - `com.amazonaws.services.neptune.model.CopyDBClusterSnapshotRequest`

  returns: Result of the CopyDBClusterSnapshot operation returned by the service. - `com.amazonaws.services.neptune.model.DBClusterSnapshot`

  throws: com.amazonaws.services.neptune.model.DBClusterSnapshotAlreadyExistsException - User already has a DB cluster snapshot with the given identifier."
  (^com.amazonaws.services.neptune.model.DBClusterSnapshot [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.CopyDBClusterSnapshotRequest request]
    (-> this (.copyDBClusterSnapshot request))))

(defn apply-pending-maintenance-action
  "Applies a pending maintenance action to a resource (for example, to a DB instance).

  request - `com.amazonaws.services.neptune.model.ApplyPendingMaintenanceActionRequest`

  returns: Result of the ApplyPendingMaintenanceAction operation returned by the service. - `com.amazonaws.services.neptune.model.ResourcePendingMaintenanceActions`

  throws: com.amazonaws.services.neptune.model.ResourceNotFoundException - The specified resource ID was not found."
  (^com.amazonaws.services.neptune.model.ResourcePendingMaintenanceActions [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.ApplyPendingMaintenanceActionRequest request]
    (-> this (.applyPendingMaintenanceAction request))))

(defn create-db-subnet-group
  "Creates a new DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in the AWS
   Region.

  request - `com.amazonaws.services.neptune.model.CreateDBSubnetGroupRequest`

  returns: Result of the CreateDBSubnetGroup operation returned by the service. - `com.amazonaws.services.neptune.model.DBSubnetGroup`

  throws: com.amazonaws.services.neptune.model.DBSubnetGroupAlreadyExistsException - DBSubnetGroupName is already used by an existing DB subnet group."
  (^com.amazonaws.services.neptune.model.DBSubnetGroup [^AmazonNeptuneClient this ^com.amazonaws.services.neptune.model.CreateDBSubnetGroupRequest request]
    (-> this (.createDBSubnetGroup request))))

