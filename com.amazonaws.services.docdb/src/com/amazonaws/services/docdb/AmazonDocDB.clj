(ns com.amazonaws.services.docdb.AmazonDocDB
  "Interface for accessing Amazon DocDB.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonDocDB instead.



  Amazon DocumentDB API documentation"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.docdb AmazonDocDB]))

(defn stop-db-cluster
  "Stops the running cluster that is specified by DBClusterIdentifier. The cluster must be in the
   available state. For more information, see Stopping and
   Starting an Amazon DocumentDB Cluster.

  stop-db-cluster-request - `com.amazonaws.services.docdb.model.StopDBClusterRequest`

  returns: Result of the StopDBCluster operation returned by the service. - `com.amazonaws.services.docdb.model.DBCluster`

  throws: com.amazonaws.services.docdb.model.DBClusterNotFoundException - DBClusterIdentifier doesn't refer to an existing DB cluster."
  (^com.amazonaws.services.docdb.model.DBCluster [^AmazonDocDB this ^com.amazonaws.services.docdb.model.StopDBClusterRequest stop-db-cluster-request]
    (-> this (.stopDBCluster stop-db-cluster-request))))

(defn modify-db-cluster-snapshot-attribute
  "Adds an attribute and values to, or removes an attribute and values from, a manual DB cluster snapshot.


   To share a manual DB cluster snapshot with other AWS accounts, specify restore as the
   AttributeName, and use the ValuesToAdd parameter to add a list of IDs of the AWS
   accounts that are authorized to restore the manual DB cluster snapshot. Use the value all to make
   the manual DB cluster snapshot public, which means that it can be copied or restored by all AWS accounts. Do not
   add the all value for any manual DB cluster snapshots that contain private information that you
   don't want available to all AWS accounts. If a manual DB cluster snapshot is encrypted, it can be shared, but
   only by specifying a list of authorized AWS account IDs for the ValuesToAdd parameter. You can't use
   all as a value for that parameter in this case.

  modify-db-cluster-snapshot-attribute-request - Represents the input to ModifyDBClusterSnapshotAttribute. - `com.amazonaws.services.docdb.model.ModifyDBClusterSnapshotAttributeRequest`

  returns: Result of the ModifyDBClusterSnapshotAttribute operation returned by the service. - `com.amazonaws.services.docdb.model.DBClusterSnapshotAttributesResult`

  throws: com.amazonaws.services.docdb.model.DBClusterSnapshotNotFoundException - DBClusterSnapshotIdentifier doesn't refer to an existing DB cluster snapshot."
  (^com.amazonaws.services.docdb.model.DBClusterSnapshotAttributesResult [^AmazonDocDB this ^com.amazonaws.services.docdb.model.ModifyDBClusterSnapshotAttributeRequest modify-db-cluster-snapshot-attribute-request]
    (-> this (.modifyDBClusterSnapshotAttribute modify-db-cluster-snapshot-attribute-request))))

(defn create-db-instance
  "Creates a new DB instance.

  create-db-instance-request - Represents the input to CreateDBInstance. - `com.amazonaws.services.docdb.model.CreateDBInstanceRequest`

  returns: Result of the CreateDBInstance operation returned by the service. - `com.amazonaws.services.docdb.model.DBInstance`

  throws: com.amazonaws.services.docdb.model.DBSubnetGroupNotFoundException - DBSubnetGroupName doesn't refer to an existing DB subnet group."
  (^com.amazonaws.services.docdb.model.DBInstance [^AmazonDocDB this ^com.amazonaws.services.docdb.model.CreateDBInstanceRequest create-db-instance-request]
    (-> this (.createDBInstance create-db-instance-request))))

(defn list-tags-for-resource
  "Lists all tags on an Amazon DocumentDB resource.

  list-tags-for-resource-request - Represents the input to ListTagsForResource. - `com.amazonaws.services.docdb.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.docdb.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.docdb.model.DBInstanceNotFoundException - DBInstanceIdentifier doesn't refer to an existing DB instance."
  (^com.amazonaws.services.docdb.model.ListTagsForResourceResult [^AmazonDocDB this ^com.amazonaws.services.docdb.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn modify-db-subnet-group
  "Modifies an existing DB subnet group. DB subnet groups must contain at least one subnet in at least two
   Availability Zones in the AWS Region.

  modify-db-subnet-group-request - Represents the input to ModifyDBSubnetGroup. - `com.amazonaws.services.docdb.model.ModifyDBSubnetGroupRequest`

  returns: Result of the ModifyDBSubnetGroup operation returned by the service. - `com.amazonaws.services.docdb.model.DBSubnetGroup`

  throws: com.amazonaws.services.docdb.model.DBSubnetGroupNotFoundException - DBSubnetGroupName doesn't refer to an existing DB subnet group."
  (^com.amazonaws.services.docdb.model.DBSubnetGroup [^AmazonDocDB this ^com.amazonaws.services.docdb.model.ModifyDBSubnetGroupRequest modify-db-subnet-group-request]
    (-> this (.modifyDBSubnetGroup modify-db-subnet-group-request))))

(defn describe-db-cluster-snapshot-attributes
  "Returns a list of DB cluster snapshot attribute names and values for a manual DB cluster snapshot.


   When you share snapshots with other AWS accounts, DescribeDBClusterSnapshotAttributes returns the
   restore attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the
   manual DB cluster snapshot. If all is included in the list of values for the restore
   attribute, then the manual DB cluster snapshot is public and can be copied or restored by all AWS accounts.

  describe-db-cluster-snapshot-attributes-request - Represents the input to DescribeDBClusterSnapshotAttributes. - `com.amazonaws.services.docdb.model.DescribeDBClusterSnapshotAttributesRequest`

  returns: Result of the DescribeDBClusterSnapshotAttributes operation returned by the service. - `com.amazonaws.services.docdb.model.DBClusterSnapshotAttributesResult`

  throws: com.amazonaws.services.docdb.model.DBClusterSnapshotNotFoundException - DBClusterSnapshotIdentifier doesn't refer to an existing DB cluster snapshot."
  (^com.amazonaws.services.docdb.model.DBClusterSnapshotAttributesResult [^AmazonDocDB this ^com.amazonaws.services.docdb.model.DescribeDBClusterSnapshotAttributesRequest describe-db-cluster-snapshot-attributes-request]
    (-> this (.describeDBClusterSnapshotAttributes describe-db-cluster-snapshot-attributes-request))))

(defn describe-db-subnet-groups
  "Returns a list of DBSubnetGroup descriptions. If a DBSubnetGroupName is specified, the
   list will contain only the descriptions of the specified DBSubnetGroup.

  describe-db-subnet-groups-request - Represents the input to DescribeDBSubnetGroups. - `com.amazonaws.services.docdb.model.DescribeDBSubnetGroupsRequest`

  returns: Result of the DescribeDBSubnetGroups operation returned by the service. - `com.amazonaws.services.docdb.model.DescribeDBSubnetGroupsResult`

  throws: com.amazonaws.services.docdb.model.DBSubnetGroupNotFoundException - DBSubnetGroupName doesn't refer to an existing DB subnet group."
  (^com.amazonaws.services.docdb.model.DescribeDBSubnetGroupsResult [^AmazonDocDB this ^com.amazonaws.services.docdb.model.DescribeDBSubnetGroupsRequest describe-db-subnet-groups-request]
    (-> this (.describeDBSubnetGroups describe-db-subnet-groups-request))))

(defn reboot-db-instance
  "You might need to reboot your DB instance, usually for maintenance reasons. For example, if you make certain
   changes, or if you change the DB cluster parameter group that is associated with the DB instance, you must reboot
   the instance for the changes to take effect.


   Rebooting a DB instance restarts the database engine service. Rebooting a DB instance results in a momentary
   outage, during which the DB instance status is set to rebooting.

  reboot-db-instance-request - Represents the input to RebootDBInstance. - `com.amazonaws.services.docdb.model.RebootDBInstanceRequest`

  returns: Result of the RebootDBInstance operation returned by the service. - `com.amazonaws.services.docdb.model.DBInstance`

  throws: com.amazonaws.services.docdb.model.InvalidDBInstanceStateException - The specified DB instance isn't in the available state."
  (^com.amazonaws.services.docdb.model.DBInstance [^AmazonDocDB this ^com.amazonaws.services.docdb.model.RebootDBInstanceRequest reboot-db-instance-request]
    (-> this (.rebootDBInstance reboot-db-instance-request))))

(defn delete-db-cluster-snapshot
  "Deletes a DB cluster snapshot. If the snapshot is being copied, the copy operation is terminated.



   The DB cluster snapshot must be in the available state to be deleted.

  delete-db-cluster-snapshot-request - Represents the input to DeleteDBClusterSnapshot. - `com.amazonaws.services.docdb.model.DeleteDBClusterSnapshotRequest`

  returns: Result of the DeleteDBClusterSnapshot operation returned by the service. - `com.amazonaws.services.docdb.model.DBClusterSnapshot`

  throws: com.amazonaws.services.docdb.model.InvalidDBClusterSnapshotStateException - The provided value isn't a valid DB cluster snapshot state."
  (^com.amazonaws.services.docdb.model.DBClusterSnapshot [^AmazonDocDB this ^com.amazonaws.services.docdb.model.DeleteDBClusterSnapshotRequest delete-db-cluster-snapshot-request]
    (-> this (.deleteDBClusterSnapshot delete-db-cluster-snapshot-request))))

(defn waiters
  "returns: `com.amazonaws.services.docdb.waiters.AmazonDocDBWaiters`"
  (^com.amazonaws.services.docdb.waiters.AmazonDocDBWaiters [^AmazonDocDB this]
    (-> this (.waiters))))

(defn delete-db-cluster-parameter-group
  "Deletes a specified DB cluster parameter group. The DB cluster parameter group to be deleted can't be associated
   with any DB clusters.

  delete-db-cluster-parameter-group-request - Represents the input to DeleteDBClusterParameterGroup. - `com.amazonaws.services.docdb.model.DeleteDBClusterParameterGroupRequest`

  returns: Result of the DeleteDBClusterParameterGroup operation returned by the service. - `com.amazonaws.services.docdb.model.DeleteDBClusterParameterGroupResult`

  throws: com.amazonaws.services.docdb.model.InvalidDBParameterGroupStateException - The DB parameter group is in use, or it is in a state that is not valid. If you are trying to delete the parameter group, you can't delete it when the parameter group is in this state."
  (^com.amazonaws.services.docdb.model.DeleteDBClusterParameterGroupResult [^AmazonDocDB this ^com.amazonaws.services.docdb.model.DeleteDBClusterParameterGroupRequest delete-db-cluster-parameter-group-request]
    (-> this (.deleteDBClusterParameterGroup delete-db-cluster-parameter-group-request))))

(defn describe-engine-default-cluster-parameters
  "Returns the default engine and system parameter information for the cluster database engine.

  describe-engine-default-cluster-parameters-request - Represents the input to DescribeEngineDefaultClusterParameters. - `com.amazonaws.services.docdb.model.DescribeEngineDefaultClusterParametersRequest`

  returns: Result of the DescribeEngineDefaultClusterParameters operation returned by the service. - `com.amazonaws.services.docdb.model.EngineDefaults`"
  (^com.amazonaws.services.docdb.model.EngineDefaults [^AmazonDocDB this ^com.amazonaws.services.docdb.model.DescribeEngineDefaultClusterParametersRequest describe-engine-default-cluster-parameters-request]
    (-> this (.describeEngineDefaultClusterParameters describe-engine-default-cluster-parameters-request))))

(defn describe-pending-maintenance-actions
  "Returns a list of resources (for example, DB instances) that have at least one pending maintenance action.

  describe-pending-maintenance-actions-request - Represents the input to DescribePendingMaintenanceActions. - `com.amazonaws.services.docdb.model.DescribePendingMaintenanceActionsRequest`

  returns: Result of the DescribePendingMaintenanceActions operation returned by the service. - `com.amazonaws.services.docdb.model.DescribePendingMaintenanceActionsResult`

  throws: com.amazonaws.services.docdb.model.ResourceNotFoundException - The specified resource ID was not found."
  (^com.amazonaws.services.docdb.model.DescribePendingMaintenanceActionsResult [^AmazonDocDB this ^com.amazonaws.services.docdb.model.DescribePendingMaintenanceActionsRequest describe-pending-maintenance-actions-request]
    (-> this (.describePendingMaintenanceActions describe-pending-maintenance-actions-request))))

(defn failover-db-cluster
  "Forces a failover for a DB cluster.


   A failover for a DB cluster promotes one of the Amazon DocumentDB replicas (read-only instances) in the DB
   cluster to be the primary instance (the cluster writer).


   If the primary instance fails, Amazon DocumentDB automatically fails over to an Amazon DocumentDB replica, if one
   exists. You can force a failover when you want to simulate a failure of a primary instance for testing.

  failover-db-cluster-request - Represents the input to FailoverDBCluster. - `com.amazonaws.services.docdb.model.FailoverDBClusterRequest`

  returns: Result of the FailoverDBCluster operation returned by the service. - `com.amazonaws.services.docdb.model.DBCluster`

  throws: com.amazonaws.services.docdb.model.DBClusterNotFoundException - DBClusterIdentifier doesn't refer to an existing DB cluster."
  (^com.amazonaws.services.docdb.model.DBCluster [^AmazonDocDB this ^com.amazonaws.services.docdb.model.FailoverDBClusterRequest failover-db-cluster-request]
    (-> this (.failoverDBCluster failover-db-cluster-request))))

(defn modify-db-instance
  "Modifies settings for a DB instance. You can change one or more database configuration parameters by specifying
   these parameters and the new values in the request.

  modify-db-instance-request - Represents the input to ModifyDBInstance. - `com.amazonaws.services.docdb.model.ModifyDBInstanceRequest`

  returns: Result of the ModifyDBInstance operation returned by the service. - `com.amazonaws.services.docdb.model.DBInstance`

  throws: com.amazonaws.services.docdb.model.InvalidDBSecurityGroupStateException - The state of the DB security group doesn't allow deletion."
  (^com.amazonaws.services.docdb.model.DBInstance [^AmazonDocDB this ^com.amazonaws.services.docdb.model.ModifyDBInstanceRequest modify-db-instance-request]
    (-> this (.modifyDBInstance modify-db-instance-request))))

(defn create-db-cluster
  "Creates a new Amazon DocumentDB DB cluster.

  create-db-cluster-request - Represents the input to CreateDBCluster. - `com.amazonaws.services.docdb.model.CreateDBClusterRequest`

  returns: Result of the CreateDBCluster operation returned by the service. - `com.amazonaws.services.docdb.model.DBCluster`

  throws: com.amazonaws.services.docdb.model.DBSubnetGroupNotFoundException - DBSubnetGroupName doesn't refer to an existing DB subnet group."
  (^com.amazonaws.services.docdb.model.DBCluster [^AmazonDocDB this ^com.amazonaws.services.docdb.model.CreateDBClusterRequest create-db-cluster-request]
    (-> this (.createDBCluster create-db-cluster-request))))

(defn delete-db-instance
  "Deletes a previously provisioned DB instance.

  delete-db-instance-request - Represents the input to DeleteDBInstance. - `com.amazonaws.services.docdb.model.DeleteDBInstanceRequest`

  returns: Result of the DeleteDBInstance operation returned by the service. - `com.amazonaws.services.docdb.model.DBInstance`

  throws: com.amazonaws.services.docdb.model.DBInstanceNotFoundException - DBInstanceIdentifier doesn't refer to an existing DB instance."
  (^com.amazonaws.services.docdb.model.DBInstance [^AmazonDocDB this ^com.amazonaws.services.docdb.model.DeleteDBInstanceRequest delete-db-instance-request]
    (-> this (.deleteDBInstance delete-db-instance-request))))

(defn delete-db-subnet-group
  "Deletes a DB subnet group.



   The specified database subnet group must not be associated with any DB instances.

  delete-db-subnet-group-request - Represents the input to DeleteDBSubnetGroup. - `com.amazonaws.services.docdb.model.DeleteDBSubnetGroupRequest`

  returns: Result of the DeleteDBSubnetGroup operation returned by the service. - `com.amazonaws.services.docdb.model.DeleteDBSubnetGroupResult`

  throws: com.amazonaws.services.docdb.model.InvalidDBSubnetGroupStateException - The DB subnet group can't be deleted because it's in use."
  (^com.amazonaws.services.docdb.model.DeleteDBSubnetGroupResult [^AmazonDocDB this ^com.amazonaws.services.docdb.model.DeleteDBSubnetGroupRequest delete-db-subnet-group-request]
    (-> this (.deleteDBSubnetGroup delete-db-subnet-group-request))))

(defn restore-db-cluster-to-point-in-time
  "Restores a DB cluster to an arbitrary point in time. Users can restore to any point in time before
   LatestRestorableTime for up to BackupRetentionPeriod days. The target DB cluster is
   created from the source DB cluster with the same configuration as the original DB cluster, except that the new DB
   cluster is created with the default DB security group.

  restore-db-cluster-to-point-in-time-request - Represents the input to RestoreDBClusterToPointInTime. - `com.amazonaws.services.docdb.model.RestoreDBClusterToPointInTimeRequest`

  returns: Result of the RestoreDBClusterToPointInTime operation returned by the service. - `com.amazonaws.services.docdb.model.DBCluster`

  throws: com.amazonaws.services.docdb.model.DBSubnetGroupNotFoundException - DBSubnetGroupName doesn't refer to an existing DB subnet group."
  (^com.amazonaws.services.docdb.model.DBCluster [^AmazonDocDB this ^com.amazonaws.services.docdb.model.RestoreDBClusterToPointInTimeRequest restore-db-cluster-to-point-in-time-request]
    (-> this (.restoreDBClusterToPointInTime restore-db-cluster-to-point-in-time-request))))

(defn delete-db-cluster
  "Deletes a previously provisioned DB cluster. When you delete a DB cluster, all automated backups for that DB
   cluster are deleted and can't be recovered. Manual DB cluster snapshots of the specified DB cluster are not
   deleted.

  delete-db-cluster-request - Represents the input to DeleteDBCluster. - `com.amazonaws.services.docdb.model.DeleteDBClusterRequest`

  returns: Result of the DeleteDBCluster operation returned by the service. - `com.amazonaws.services.docdb.model.DBCluster`

  throws: com.amazonaws.services.docdb.model.DBClusterNotFoundException - DBClusterIdentifier doesn't refer to an existing DB cluster."
  (^com.amazonaws.services.docdb.model.DBCluster [^AmazonDocDB this ^com.amazonaws.services.docdb.model.DeleteDBClusterRequest delete-db-cluster-request]
    (-> this (.deleteDBCluster delete-db-cluster-request))))

(defn create-db-cluster-snapshot
  "Creates a snapshot of a DB cluster.

  create-db-cluster-snapshot-request - Represents the input of CreateDBClusterSnapshot. - `com.amazonaws.services.docdb.model.CreateDBClusterSnapshotRequest`

  returns: Result of the CreateDBClusterSnapshot operation returned by the service. - `com.amazonaws.services.docdb.model.DBClusterSnapshot`

  throws: com.amazonaws.services.docdb.model.DBClusterSnapshotAlreadyExistsException - You already have a DB cluster snapshot with the given identifier."
  (^com.amazonaws.services.docdb.model.DBClusterSnapshot [^AmazonDocDB this ^com.amazonaws.services.docdb.model.CreateDBClusterSnapshotRequest create-db-cluster-snapshot-request]
    (-> this (.createDBClusterSnapshot create-db-cluster-snapshot-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonDocDB this]
    (-> this (.shutdown))))

(defn describe-events
  "Returns events related to DB instances, DB security groups, DB snapshots, and DB parameter groups for the past 14
   days. You can obtain events specific to a particular DB instance, DB security group, DB snapshot, or DB parameter
   group by providing the name as a parameter. By default, the events of the past hour are returned.

  describe-events-request - Represents the input to DescribeEvents. - `com.amazonaws.services.docdb.model.DescribeEventsRequest`

  returns: Result of the DescribeEvents operation returned by the service. - `com.amazonaws.services.docdb.model.DescribeEventsResult`"
  (^com.amazonaws.services.docdb.model.DescribeEventsResult [^AmazonDocDB this ^com.amazonaws.services.docdb.model.DescribeEventsRequest describe-events-request]
    (-> this (.describeEvents describe-events-request))))

(defn describe-event-categories
  "Displays a list of categories for all event source types, or, if specified, for a specified source type.

  describe-event-categories-request - Represents the input to DescribeEventCategories. - `com.amazonaws.services.docdb.model.DescribeEventCategoriesRequest`

  returns: Result of the DescribeEventCategories operation returned by the service. - `com.amazonaws.services.docdb.model.DescribeEventCategoriesResult`"
  (^com.amazonaws.services.docdb.model.DescribeEventCategoriesResult [^AmazonDocDB this ^com.amazonaws.services.docdb.model.DescribeEventCategoriesRequest describe-event-categories-request]
    (-> this (.describeEventCategories describe-event-categories-request))))

(defn describe-db-engine-versions
  "Returns a list of the available DB engines.

  describe-db-engine-versions-request - Represents the input to DescribeDBEngineVersions. - `com.amazonaws.services.docdb.model.DescribeDBEngineVersionsRequest`

  returns: Result of the DescribeDBEngineVersions operation returned by the service. - `com.amazonaws.services.docdb.model.DescribeDBEngineVersionsResult`"
  (^com.amazonaws.services.docdb.model.DescribeDBEngineVersionsResult [^AmazonDocDB this ^com.amazonaws.services.docdb.model.DescribeDBEngineVersionsRequest describe-db-engine-versions-request]
    (-> this (.describeDBEngineVersions describe-db-engine-versions-request))))

(defn create-db-cluster-parameter-group
  "Creates a new DB cluster parameter group.


   Parameters in a DB cluster parameter group apply to all of the instances in a DB cluster.


   A DB cluster parameter group is initially created with the default parameters for the database engine used by
   instances in the DB cluster. To provide custom values for any of the parameters, you must modify the group after
   you create it. After you create a DB cluster parameter group, you must associate it with your DB cluster. For the
   new DB cluster parameter group and associated settings to take effect, you must then reboot the DB instances in
   the DB cluster without failover.



   After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB
   cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon DocumentDB
   to fully complete the create action before the DB cluster parameter group is used as the default for a new DB
   cluster. This step is especially important for parameters that are critical when creating the default database
   for a DB cluster, such as the character set for the default database defined by the
   character_set_database parameter.

  create-db-cluster-parameter-group-request - Represents the input of CreateDBClusterParameterGroup. - `com.amazonaws.services.docdb.model.CreateDBClusterParameterGroupRequest`

  returns: Result of the CreateDBClusterParameterGroup operation returned by the service. - `com.amazonaws.services.docdb.model.DBClusterParameterGroup`

  throws: com.amazonaws.services.docdb.model.DBParameterGroupQuotaExceededException - This request would cause you to exceed the allowed number of DB parameter groups."
  (^com.amazonaws.services.docdb.model.DBClusterParameterGroup [^AmazonDocDB this ^com.amazonaws.services.docdb.model.CreateDBClusterParameterGroupRequest create-db-cluster-parameter-group-request]
    (-> this (.createDBClusterParameterGroup create-db-cluster-parameter-group-request))))

(defn describe-db-cluster-parameter-groups
  "Returns a list of DBClusterParameterGroup descriptions. If a
   DBClusterParameterGroupName parameter is specified, the list contains only the description of the
   specified DB cluster parameter group.

  describe-db-cluster-parameter-groups-request - Represents the input to DescribeDBClusterParameterGroups. - `com.amazonaws.services.docdb.model.DescribeDBClusterParameterGroupsRequest`

  returns: Result of the DescribeDBClusterParameterGroups operation returned by the service. - `com.amazonaws.services.docdb.model.DescribeDBClusterParameterGroupsResult`

  throws: com.amazonaws.services.docdb.model.DBParameterGroupNotFoundException - DBParameterGroupName doesn't refer to an existing DB parameter group."
  (^com.amazonaws.services.docdb.model.DescribeDBClusterParameterGroupsResult [^AmazonDocDB this ^com.amazonaws.services.docdb.model.DescribeDBClusterParameterGroupsRequest describe-db-cluster-parameter-groups-request]
    (-> this (.describeDBClusterParameterGroups describe-db-cluster-parameter-groups-request))))

(defn describe-db-instances
  "Returns information about provisioned Amazon DocumentDB instances. This API supports pagination.

  describe-db-instances-request - Represents the input to DescribeDBInstances. - `com.amazonaws.services.docdb.model.DescribeDBInstancesRequest`

  returns: Result of the DescribeDBInstances operation returned by the service. - `com.amazonaws.services.docdb.model.DescribeDBInstancesResult`

  throws: com.amazonaws.services.docdb.model.DBInstanceNotFoundException - DBInstanceIdentifier doesn't refer to an existing DB instance."
  (^com.amazonaws.services.docdb.model.DescribeDBInstancesResult [^AmazonDocDB this ^com.amazonaws.services.docdb.model.DescribeDBInstancesRequest describe-db-instances-request]
    (-> this (.describeDBInstances describe-db-instances-request))))

(defn remove-tags-from-resource
  "Removes metadata tags from an Amazon DocumentDB resource.

  remove-tags-from-resource-request - Represents the input to RemoveTagsFromResource. - `com.amazonaws.services.docdb.model.RemoveTagsFromResourceRequest`

  returns: Result of the RemoveTagsFromResource operation returned by the service. - `com.amazonaws.services.docdb.model.RemoveTagsFromResourceResult`

  throws: com.amazonaws.services.docdb.model.DBInstanceNotFoundException - DBInstanceIdentifier doesn't refer to an existing DB instance."
  (^com.amazonaws.services.docdb.model.RemoveTagsFromResourceResult [^AmazonDocDB this ^com.amazonaws.services.docdb.model.RemoveTagsFromResourceRequest remove-tags-from-resource-request]
    (-> this (.removeTagsFromResource remove-tags-from-resource-request))))

(defn describe-db-cluster-snapshots
  "Returns information about DB cluster snapshots. This API operation supports pagination.

  describe-db-cluster-snapshots-request - Represents the input to DescribeDBClusterSnapshots. - `com.amazonaws.services.docdb.model.DescribeDBClusterSnapshotsRequest`

  returns: Result of the DescribeDBClusterSnapshots operation returned by the service. - `com.amazonaws.services.docdb.model.DescribeDBClusterSnapshotsResult`

  throws: com.amazonaws.services.docdb.model.DBClusterSnapshotNotFoundException - DBClusterSnapshotIdentifier doesn't refer to an existing DB cluster snapshot."
  (^com.amazonaws.services.docdb.model.DescribeDBClusterSnapshotsResult [^AmazonDocDB this ^com.amazonaws.services.docdb.model.DescribeDBClusterSnapshotsRequest describe-db-cluster-snapshots-request]
    (-> this (.describeDBClusterSnapshots describe-db-cluster-snapshots-request))))

(defn describe-orderable-db-instance-options
  "Returns a list of orderable DB instance options for the specified engine.

  describe-orderable-db-instance-options-request - Represents the input to DescribeOrderableDBInstanceOptions. - `com.amazonaws.services.docdb.model.DescribeOrderableDBInstanceOptionsRequest`

  returns: Result of the DescribeOrderableDBInstanceOptions operation returned by the service. - `com.amazonaws.services.docdb.model.DescribeOrderableDBInstanceOptionsResult`"
  (^com.amazonaws.services.docdb.model.DescribeOrderableDBInstanceOptionsResult [^AmazonDocDB this ^com.amazonaws.services.docdb.model.DescribeOrderableDBInstanceOptionsRequest describe-orderable-db-instance-options-request]
    (-> this (.describeOrderableDBInstanceOptions describe-orderable-db-instance-options-request))))

(defn describe-db-cluster-parameters
  "Returns the detailed parameter list for a particular DB cluster parameter group.

  describe-db-cluster-parameters-request - Represents the input to DescribeDBClusterParameters. - `com.amazonaws.services.docdb.model.DescribeDBClusterParametersRequest`

  returns: Result of the DescribeDBClusterParameters operation returned by the service. - `com.amazonaws.services.docdb.model.DescribeDBClusterParametersResult`

  throws: com.amazonaws.services.docdb.model.DBParameterGroupNotFoundException - DBParameterGroupName doesn't refer to an existing DB parameter group."
  (^com.amazonaws.services.docdb.model.DescribeDBClusterParametersResult [^AmazonDocDB this ^com.amazonaws.services.docdb.model.DescribeDBClusterParametersRequest describe-db-cluster-parameters-request]
    (-> this (.describeDBClusterParameters describe-db-cluster-parameters-request))))

(defn restore-db-cluster-from-snapshot
  "Creates a new DB cluster from a DB snapshot or DB cluster snapshot.


   If a DB snapshot is specified, the target DB cluster is created from the source DB snapshot with a default
   configuration and default security group.


   If a DB cluster snapshot is specified, the target DB cluster is created from the source DB cluster restore point
   with the same configuration as the original source DB cluster, except that the new DB cluster is created with the
   default security group.

  restore-db-cluster-from-snapshot-request - Represents the input to RestoreDBClusterFromSnapshot. - `com.amazonaws.services.docdb.model.RestoreDBClusterFromSnapshotRequest`

  returns: Result of the RestoreDBClusterFromSnapshot operation returned by the service. - `com.amazonaws.services.docdb.model.DBCluster`

  throws: com.amazonaws.services.docdb.model.DBSubnetGroupNotFoundException - DBSubnetGroupName doesn't refer to an existing DB subnet group."
  (^com.amazonaws.services.docdb.model.DBCluster [^AmazonDocDB this ^com.amazonaws.services.docdb.model.RestoreDBClusterFromSnapshotRequest restore-db-cluster-from-snapshot-request]
    (-> this (.restoreDBClusterFromSnapshot restore-db-cluster-from-snapshot-request))))

(defn describe-db-clusters
  "Returns information about provisioned Amazon DocumentDB DB clusters. This API operation supports pagination.

  describe-db-clusters-request - Represents the input to DescribeDBClusters. - `com.amazonaws.services.docdb.model.DescribeDBClustersRequest`

  returns: Result of the DescribeDBClusters operation returned by the service. - `com.amazonaws.services.docdb.model.DescribeDBClustersResult`

  throws: com.amazonaws.services.docdb.model.DBClusterNotFoundException - DBClusterIdentifier doesn't refer to an existing DB cluster."
  (^com.amazonaws.services.docdb.model.DescribeDBClustersResult [^AmazonDocDB this ^com.amazonaws.services.docdb.model.DescribeDBClustersRequest describe-db-clusters-request]
    (-> this (.describeDBClusters describe-db-clusters-request))))

(defn add-tags-to-resource
  "Adds metadata tags to an Amazon DocumentDB resource. You can use these tags with cost allocation reporting to
   track costs that are associated with Amazon DocumentDB resources. or in a Condition statement in an
   AWS Identity and Access Management (IAM) policy for Amazon DocumentDB.

  add-tags-to-resource-request - Represents the input to AddTagsToResource. - `com.amazonaws.services.docdb.model.AddTagsToResourceRequest`

  returns: Result of the AddTagsToResource operation returned by the service. - `com.amazonaws.services.docdb.model.AddTagsToResourceResult`

  throws: com.amazonaws.services.docdb.model.DBInstanceNotFoundException - DBInstanceIdentifier doesn't refer to an existing DB instance."
  (^com.amazonaws.services.docdb.model.AddTagsToResourceResult [^AmazonDocDB this ^com.amazonaws.services.docdb.model.AddTagsToResourceRequest add-tags-to-resource-request]
    (-> this (.addTagsToResource add-tags-to-resource-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonDocDB this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn modify-db-cluster-parameter-group
  "Modifies the parameters of a DB cluster parameter group. To modify more than one parameter, submit a list of the
   following: ParameterName, ParameterValue, and ApplyMethod. A maximum of 20
   parameters can be modified in a single request.



   Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot or
   maintenance window before the change can take effect.



   After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB
   cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon DocumentDB
   to fully complete the create action before the parameter group is used as the default for a new DB cluster. This
   step is especially important for parameters that are critical when creating the default database for a DB
   cluster, such as the character set for the default database defined by the character_set_database
   parameter.

  modify-db-cluster-parameter-group-request - Represents the input to ModifyDBClusterParameterGroup. - `com.amazonaws.services.docdb.model.ModifyDBClusterParameterGroupRequest`

  returns: Result of the ModifyDBClusterParameterGroup operation returned by the service. - `com.amazonaws.services.docdb.model.ModifyDBClusterParameterGroupResult`

  throws: com.amazonaws.services.docdb.model.DBParameterGroupNotFoundException - DBParameterGroupName doesn't refer to an existing DB parameter group."
  (^com.amazonaws.services.docdb.model.ModifyDBClusterParameterGroupResult [^AmazonDocDB this ^com.amazonaws.services.docdb.model.ModifyDBClusterParameterGroupRequest modify-db-cluster-parameter-group-request]
    (-> this (.modifyDBClusterParameterGroup modify-db-cluster-parameter-group-request))))

(defn reset-db-cluster-parameter-group
  "Modifies the parameters of a DB cluster parameter group to the default value. To reset specific parameters,
   submit a list of the following: ParameterName and ApplyMethod. To reset the entire DB
   cluster parameter group, specify the DBClusterParameterGroupName and ResetAllParameters
   parameters.


   When you reset the entire group, dynamic parameters are updated immediately and static parameters are set to
   pending-reboot to take effect on the next DB instance reboot.

  reset-db-cluster-parameter-group-request - Represents the input to ResetDBClusterParameterGroup. - `com.amazonaws.services.docdb.model.ResetDBClusterParameterGroupRequest`

  returns: Result of the ResetDBClusterParameterGroup operation returned by the service. - `com.amazonaws.services.docdb.model.ResetDBClusterParameterGroupResult`

  throws: com.amazonaws.services.docdb.model.InvalidDBParameterGroupStateException - The DB parameter group is in use, or it is in a state that is not valid. If you are trying to delete the parameter group, you can't delete it when the parameter group is in this state."
  (^com.amazonaws.services.docdb.model.ResetDBClusterParameterGroupResult [^AmazonDocDB this ^com.amazonaws.services.docdb.model.ResetDBClusterParameterGroupRequest reset-db-cluster-parameter-group-request]
    (-> this (.resetDBClusterParameterGroup reset-db-cluster-parameter-group-request))))

(defn modify-db-cluster
  "Modifies a setting for an Amazon DocumentDB DB cluster. You can change one or more database configuration
   parameters by specifying these parameters and the new values in the request.

  modify-db-cluster-request - Represents the input to ModifyDBCluster. - `com.amazonaws.services.docdb.model.ModifyDBClusterRequest`

  returns: Result of the ModifyDBCluster operation returned by the service. - `com.amazonaws.services.docdb.model.DBCluster`

  throws: com.amazonaws.services.docdb.model.DBSubnetGroupNotFoundException - DBSubnetGroupName doesn't refer to an existing DB subnet group."
  (^com.amazonaws.services.docdb.model.DBCluster [^AmazonDocDB this ^com.amazonaws.services.docdb.model.ModifyDBClusterRequest modify-db-cluster-request]
    (-> this (.modifyDBCluster modify-db-cluster-request))))

(defn copy-db-cluster-parameter-group
  "Copies the specified DB cluster parameter group.

  copy-db-cluster-parameter-group-request - Represents the input to CopyDBClusterParameterGroup. - `com.amazonaws.services.docdb.model.CopyDBClusterParameterGroupRequest`

  returns: Result of the CopyDBClusterParameterGroup operation returned by the service. - `com.amazonaws.services.docdb.model.DBClusterParameterGroup`

  throws: com.amazonaws.services.docdb.model.DBParameterGroupNotFoundException - DBParameterGroupName doesn't refer to an existing DB parameter group."
  (^com.amazonaws.services.docdb.model.DBClusterParameterGroup [^AmazonDocDB this ^com.amazonaws.services.docdb.model.CopyDBClusterParameterGroupRequest copy-db-cluster-parameter-group-request]
    (-> this (.copyDBClusterParameterGroup copy-db-cluster-parameter-group-request))))

(defn copy-db-cluster-snapshot
  "Copies a snapshot of a DB cluster.


   To copy a DB cluster snapshot from a shared manual DB cluster snapshot,
   SourceDBClusterSnapshotIdentifier must be the Amazon Resource Name (ARN) of the shared DB cluster
   snapshot.


   To cancel the copy operation after it is in progress, delete the target DB cluster snapshot identified by
   TargetDBClusterSnapshotIdentifier while that DB cluster snapshot is in the copying status.

  copy-db-cluster-snapshot-request - Represents the input to CopyDBClusterSnapshot. - `com.amazonaws.services.docdb.model.CopyDBClusterSnapshotRequest`

  returns: Result of the CopyDBClusterSnapshot operation returned by the service. - `com.amazonaws.services.docdb.model.DBClusterSnapshot`

  throws: com.amazonaws.services.docdb.model.DBClusterSnapshotAlreadyExistsException - You already have a DB cluster snapshot with the given identifier."
  (^com.amazonaws.services.docdb.model.DBClusterSnapshot [^AmazonDocDB this ^com.amazonaws.services.docdb.model.CopyDBClusterSnapshotRequest copy-db-cluster-snapshot-request]
    (-> this (.copyDBClusterSnapshot copy-db-cluster-snapshot-request))))

(defn apply-pending-maintenance-action
  "Applies a pending maintenance action to a resource (for example, to a DB instance).

  apply-pending-maintenance-action-request - Represents the input to ApplyPendingMaintenanceAction. - `com.amazonaws.services.docdb.model.ApplyPendingMaintenanceActionRequest`

  returns: Result of the ApplyPendingMaintenanceAction operation returned by the service. - `com.amazonaws.services.docdb.model.ResourcePendingMaintenanceActions`

  throws: com.amazonaws.services.docdb.model.ResourceNotFoundException - The specified resource ID was not found."
  (^com.amazonaws.services.docdb.model.ResourcePendingMaintenanceActions [^AmazonDocDB this ^com.amazonaws.services.docdb.model.ApplyPendingMaintenanceActionRequest apply-pending-maintenance-action-request]
    (-> this (.applyPendingMaintenanceAction apply-pending-maintenance-action-request))))

(defn start-db-cluster
  "Restarts the stopped cluster that is specified by DBClusterIdentifier. For more information, see Stopping and
   Starting an Amazon DocumentDB Cluster.

  start-db-cluster-request - `com.amazonaws.services.docdb.model.StartDBClusterRequest`

  returns: Result of the StartDBCluster operation returned by the service. - `com.amazonaws.services.docdb.model.DBCluster`

  throws: com.amazonaws.services.docdb.model.DBClusterNotFoundException - DBClusterIdentifier doesn't refer to an existing DB cluster."
  (^com.amazonaws.services.docdb.model.DBCluster [^AmazonDocDB this ^com.amazonaws.services.docdb.model.StartDBClusterRequest start-db-cluster-request]
    (-> this (.startDBCluster start-db-cluster-request))))

(defn create-db-subnet-group
  "Creates a new DB subnet group. DB subnet groups must contain at least one subnet in at least two Availability
   Zones in the AWS Region.

  create-db-subnet-group-request - Represents the input to CreateDBSubnetGroup. - `com.amazonaws.services.docdb.model.CreateDBSubnetGroupRequest`

  returns: Result of the CreateDBSubnetGroup operation returned by the service. - `com.amazonaws.services.docdb.model.DBSubnetGroup`

  throws: com.amazonaws.services.docdb.model.DBSubnetGroupAlreadyExistsException - DBSubnetGroupName is already being used by an existing DB subnet group."
  (^com.amazonaws.services.docdb.model.DBSubnetGroup [^AmazonDocDB this ^com.amazonaws.services.docdb.model.CreateDBSubnetGroupRequest create-db-subnet-group-request]
    (-> this (.createDBSubnetGroup create-db-subnet-group-request))))

