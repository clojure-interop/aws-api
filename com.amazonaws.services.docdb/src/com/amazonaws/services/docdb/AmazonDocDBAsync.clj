(ns com.amazonaws.services.docdb.AmazonDocDBAsync
  "Interface for accessing Amazon DocDB asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonDocDBAsync instead.



  Amazon DocumentDB API documentation"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.docdb AmazonDocDBAsync]))

(defn modify-db-cluster-snapshot-attribute-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyDBClusterSnapshotAttribute operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DBClusterSnapshotAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.ModifyDBClusterSnapshotAttributeRequest modify-db-cluster-snapshot-attribute-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyDBClusterSnapshotAttributeAsync modify-db-cluster-snapshot-attribute-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.ModifyDBClusterSnapshotAttributeRequest modify-db-cluster-snapshot-attribute-request]
    (-> this (.modifyDBClusterSnapshotAttributeAsync modify-db-cluster-snapshot-attribute-request))))

(defn delete-db-instance-async
  "Deletes a previously provisioned DB instance.

  delete-db-instance-request - Represents the input to DeleteDBInstance. - `com.amazonaws.services.docdb.model.DeleteDBInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDBInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DBInstance>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.DeleteDBInstanceRequest delete-db-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDBInstanceAsync delete-db-instance-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.DeleteDBInstanceRequest delete-db-instance-request]
    (-> this (.deleteDBInstanceAsync delete-db-instance-request))))

(defn describe-event-categories-async
  "Displays a list of categories for all event source types, or, if specified, for a specified source type.

  describe-event-categories-request - Represents the input to DescribeEventCategories. - `com.amazonaws.services.docdb.model.DescribeEventCategoriesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEventCategories operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DescribeEventCategoriesResult>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.DescribeEventCategoriesRequest describe-event-categories-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventCategoriesAsync describe-event-categories-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.DescribeEventCategoriesRequest describe-event-categories-request]
    (-> this (.describeEventCategoriesAsync describe-event-categories-request))))

(defn stop-db-cluster-async
  "Stops the running cluster that is specified by DBClusterIdentifier. The cluster must be in the
   available state. For more information, see Stopping and
   Starting an Amazon DocumentDB Cluster.

  stop-db-cluster-request - `com.amazonaws.services.docdb.model.StopDBClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DBCluster>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.StopDBClusterRequest stop-db-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopDBClusterAsync stop-db-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.StopDBClusterRequest stop-db-cluster-request]
    (-> this (.stopDBClusterAsync stop-db-cluster-request))))

(defn describe-db-subnet-groups-async
  "Returns a list of DBSubnetGroup descriptions. If a DBSubnetGroupName is specified, the
   list will contain only the descriptions of the specified DBSubnetGroup.

  describe-db-subnet-groups-request - Represents the input to DescribeDBSubnetGroups. - `com.amazonaws.services.docdb.model.DescribeDBSubnetGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBSubnetGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DescribeDBSubnetGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.DescribeDBSubnetGroupsRequest describe-db-subnet-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBSubnetGroupsAsync describe-db-subnet-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.DescribeDBSubnetGroupsRequest describe-db-subnet-groups-request]
    (-> this (.describeDBSubnetGroupsAsync describe-db-subnet-groups-request))))

(defn start-db-cluster-async
  "Restarts the stopped cluster that is specified by DBClusterIdentifier. For more information, see Stopping and
   Starting an Amazon DocumentDB Cluster.

  start-db-cluster-request - `com.amazonaws.services.docdb.model.StartDBClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DBCluster>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.StartDBClusterRequest start-db-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startDBClusterAsync start-db-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.StartDBClusterRequest start-db-cluster-request]
    (-> this (.startDBClusterAsync start-db-cluster-request))))

(defn describe-db-cluster-parameters-async
  "Returns the detailed parameter list for a particular DB cluster parameter group.

  describe-db-cluster-parameters-request - Represents the input to DescribeDBClusterParameters. - `com.amazonaws.services.docdb.model.DescribeDBClusterParametersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBClusterParameters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DescribeDBClusterParametersResult>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.DescribeDBClusterParametersRequest describe-db-cluster-parameters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBClusterParametersAsync describe-db-cluster-parameters-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.DescribeDBClusterParametersRequest describe-db-cluster-parameters-request]
    (-> this (.describeDBClusterParametersAsync describe-db-cluster-parameters-request))))

(defn delete-db-subnet-group-async
  "Deletes a DB subnet group.



   The specified database subnet group must not be associated with any DB instances.

  delete-db-subnet-group-request - Represents the input to DeleteDBSubnetGroup. - `com.amazonaws.services.docdb.model.DeleteDBSubnetGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDBSubnetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DeleteDBSubnetGroupResult>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.DeleteDBSubnetGroupRequest delete-db-subnet-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDBSubnetGroupAsync delete-db-subnet-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.DeleteDBSubnetGroupRequest delete-db-subnet-group-request]
    (-> this (.deleteDBSubnetGroupAsync delete-db-subnet-group-request))))

(defn describe-db-cluster-parameter-groups-async
  "Returns a list of DBClusterParameterGroup descriptions. If a
   DBClusterParameterGroupName parameter is specified, the list contains only the description of the
   specified DB cluster parameter group.

  describe-db-cluster-parameter-groups-request - Represents the input to DescribeDBClusterParameterGroups. - `com.amazonaws.services.docdb.model.DescribeDBClusterParameterGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBClusterParameterGroups operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DescribeDBClusterParameterGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.DescribeDBClusterParameterGroupsRequest describe-db-cluster-parameter-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBClusterParameterGroupsAsync describe-db-cluster-parameter-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.DescribeDBClusterParameterGroupsRequest describe-db-cluster-parameter-groups-request]
    (-> this (.describeDBClusterParameterGroupsAsync describe-db-cluster-parameter-groups-request))))

(defn copy-db-cluster-snapshot-async
  "Copies a snapshot of a DB cluster.


   To copy a DB cluster snapshot from a shared manual DB cluster snapshot,
   SourceDBClusterSnapshotIdentifier must be the Amazon Resource Name (ARN) of the shared DB cluster
   snapshot.


   To cancel the copy operation after it is in progress, delete the target DB cluster snapshot identified by
   TargetDBClusterSnapshotIdentifier while that DB cluster snapshot is in the copying status.

  copy-db-cluster-snapshot-request - Represents the input to CopyDBClusterSnapshot. - `com.amazonaws.services.docdb.model.CopyDBClusterSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CopyDBClusterSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DBClusterSnapshot>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.CopyDBClusterSnapshotRequest copy-db-cluster-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.copyDBClusterSnapshotAsync copy-db-cluster-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.CopyDBClusterSnapshotRequest copy-db-cluster-snapshot-request]
    (-> this (.copyDBClusterSnapshotAsync copy-db-cluster-snapshot-request))))

(defn copy-db-cluster-parameter-group-async
  "Copies the specified DB cluster parameter group.

  copy-db-cluster-parameter-group-request - Represents the input to CopyDBClusterParameterGroup. - `com.amazonaws.services.docdb.model.CopyDBClusterParameterGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CopyDBClusterParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DBClusterParameterGroup>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.CopyDBClusterParameterGroupRequest copy-db-cluster-parameter-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.copyDBClusterParameterGroupAsync copy-db-cluster-parameter-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.CopyDBClusterParameterGroupRequest copy-db-cluster-parameter-group-request]
    (-> this (.copyDBClusterParameterGroupAsync copy-db-cluster-parameter-group-request))))

(defn failover-db-cluster-async
  "Forces a failover for a DB cluster.


   A failover for a DB cluster promotes one of the Amazon DocumentDB replicas (read-only instances) in the DB
   cluster to be the primary instance (the cluster writer).


   If the primary instance fails, Amazon DocumentDB automatically fails over to an Amazon DocumentDB replica, if one
   exists. You can force a failover when you want to simulate a failure of a primary instance for testing.

  failover-db-cluster-request - Represents the input to FailoverDBCluster. - `com.amazonaws.services.docdb.model.FailoverDBClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the FailoverDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DBCluster>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.FailoverDBClusterRequest failover-db-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.failoverDBClusterAsync failover-db-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.FailoverDBClusterRequest failover-db-cluster-request]
    (-> this (.failoverDBClusterAsync failover-db-cluster-request))))

(defn create-db-cluster-async
  "Creates a new Amazon DocumentDB DB cluster.

  create-db-cluster-request - Represents the input to CreateDBCluster. - `com.amazonaws.services.docdb.model.CreateDBClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DBCluster>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.CreateDBClusterRequest create-db-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDBClusterAsync create-db-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.CreateDBClusterRequest create-db-cluster-request]
    (-> this (.createDBClusterAsync create-db-cluster-request))))

(defn modify-db-cluster-async
  "Modifies a setting for an Amazon DocumentDB DB cluster. You can change one or more database configuration
   parameters by specifying these parameters and the new values in the request.

  modify-db-cluster-request - Represents the input to ModifyDBCluster. - `com.amazonaws.services.docdb.model.ModifyDBClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DBCluster>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.ModifyDBClusterRequest modify-db-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyDBClusterAsync modify-db-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.ModifyDBClusterRequest modify-db-cluster-request]
    (-> this (.modifyDBClusterAsync modify-db-cluster-request))))

(defn describe-orderable-db-instance-options-async
  "Returns a list of orderable DB instance options for the specified engine.

  describe-orderable-db-instance-options-request - Represents the input to DescribeOrderableDBInstanceOptions. - `com.amazonaws.services.docdb.model.DescribeOrderableDBInstanceOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeOrderableDBInstanceOptions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DescribeOrderableDBInstanceOptionsResult>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.DescribeOrderableDBInstanceOptionsRequest describe-orderable-db-instance-options-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeOrderableDBInstanceOptionsAsync describe-orderable-db-instance-options-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.DescribeOrderableDBInstanceOptionsRequest describe-orderable-db-instance-options-request]
    (-> this (.describeOrderableDBInstanceOptionsAsync describe-orderable-db-instance-options-request))))

(defn describe-db-engine-versions-async
  "Returns a list of the available DB engines.

  describe-db-engine-versions-request - Represents the input to DescribeDBEngineVersions. - `com.amazonaws.services.docdb.model.DescribeDBEngineVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBEngineVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DescribeDBEngineVersionsResult>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.DescribeDBEngineVersionsRequest describe-db-engine-versions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBEngineVersionsAsync describe-db-engine-versions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.DescribeDBEngineVersionsRequest describe-db-engine-versions-request]
    (-> this (.describeDBEngineVersionsAsync describe-db-engine-versions-request))))

(defn restore-db-cluster-to-point-in-time-async
  "Restores a DB cluster to an arbitrary point in time. Users can restore to any point in time before
   LatestRestorableTime for up to BackupRetentionPeriod days. The target DB cluster is
   created from the source DB cluster with the same configuration as the original DB cluster, except that the new DB
   cluster is created with the default DB security group.

  restore-db-cluster-to-point-in-time-request - Represents the input to RestoreDBClusterToPointInTime. - `com.amazonaws.services.docdb.model.RestoreDBClusterToPointInTimeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestoreDBClusterToPointInTime operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DBCluster>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.RestoreDBClusterToPointInTimeRequest restore-db-cluster-to-point-in-time-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restoreDBClusterToPointInTimeAsync restore-db-cluster-to-point-in-time-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.RestoreDBClusterToPointInTimeRequest restore-db-cluster-to-point-in-time-request]
    (-> this (.restoreDBClusterToPointInTimeAsync restore-db-cluster-to-point-in-time-request))))

(defn create-db-instance-async
  "Creates a new DB instance.

  create-db-instance-request - Represents the input to CreateDBInstance. - `com.amazonaws.services.docdb.model.CreateDBInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDBInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DBInstance>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.CreateDBInstanceRequest create-db-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDBInstanceAsync create-db-instance-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.CreateDBInstanceRequest create-db-instance-request]
    (-> this (.createDBInstanceAsync create-db-instance-request))))

(defn reboot-db-instance-async
  "You might need to reboot your DB instance, usually for maintenance reasons. For example, if you make certain
   changes, or if you change the DB cluster parameter group that is associated with the DB instance, you must reboot
   the instance for the changes to take effect.


   Rebooting a DB instance restarts the database engine service. Rebooting a DB instance results in a momentary
   outage, during which the DB instance status is set to rebooting.

  reboot-db-instance-request - Represents the input to RebootDBInstance. - `com.amazonaws.services.docdb.model.RebootDBInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RebootDBInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DBInstance>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.RebootDBInstanceRequest reboot-db-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rebootDBInstanceAsync reboot-db-instance-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.RebootDBInstanceRequest reboot-db-instance-request]
    (-> this (.rebootDBInstanceAsync reboot-db-instance-request))))

(defn describe-pending-maintenance-actions-async
  "Returns a list of resources (for example, DB instances) that have at least one pending maintenance action.

  describe-pending-maintenance-actions-request - Represents the input to DescribePendingMaintenanceActions. - `com.amazonaws.services.docdb.model.DescribePendingMaintenanceActionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePendingMaintenanceActions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DescribePendingMaintenanceActionsResult>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.DescribePendingMaintenanceActionsRequest describe-pending-maintenance-actions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePendingMaintenanceActionsAsync describe-pending-maintenance-actions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.DescribePendingMaintenanceActionsRequest describe-pending-maintenance-actions-request]
    (-> this (.describePendingMaintenanceActionsAsync describe-pending-maintenance-actions-request))))

(defn create-db-subnet-group-async
  "Creates a new DB subnet group. DB subnet groups must contain at least one subnet in at least two Availability
   Zones in the AWS Region.

  create-db-subnet-group-request - Represents the input to CreateDBSubnetGroup. - `com.amazonaws.services.docdb.model.CreateDBSubnetGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDBSubnetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DBSubnetGroup>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.CreateDBSubnetGroupRequest create-db-subnet-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDBSubnetGroupAsync create-db-subnet-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.CreateDBSubnetGroupRequest create-db-subnet-group-request]
    (-> this (.createDBSubnetGroupAsync create-db-subnet-group-request))))

(defn delete-db-cluster-parameter-group-async
  "Deletes a specified DB cluster parameter group. The DB cluster parameter group to be deleted can't be associated
   with any DB clusters.

  delete-db-cluster-parameter-group-request - Represents the input to DeleteDBClusterParameterGroup. - `com.amazonaws.services.docdb.model.DeleteDBClusterParameterGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDBClusterParameterGroup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DeleteDBClusterParameterGroupResult>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.DeleteDBClusterParameterGroupRequest delete-db-cluster-parameter-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDBClusterParameterGroupAsync delete-db-cluster-parameter-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.DeleteDBClusterParameterGroupRequest delete-db-cluster-parameter-group-request]
    (-> this (.deleteDBClusterParameterGroupAsync delete-db-cluster-parameter-group-request))))

(defn describe-db-cluster-snapshot-attributes-async
  "Returns a list of DB cluster snapshot attribute names and values for a manual DB cluster snapshot.


   When you share snapshots with other AWS accounts, DescribeDBClusterSnapshotAttributes returns the
   restore attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the
   manual DB cluster snapshot. If all is included in the list of values for the restore
   attribute, then the manual DB cluster snapshot is public and can be copied or restored by all AWS accounts.

  describe-db-cluster-snapshot-attributes-request - Represents the input to DescribeDBClusterSnapshotAttributes. - `com.amazonaws.services.docdb.model.DescribeDBClusterSnapshotAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBClusterSnapshotAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DBClusterSnapshotAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.DescribeDBClusterSnapshotAttributesRequest describe-db-cluster-snapshot-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBClusterSnapshotAttributesAsync describe-db-cluster-snapshot-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.DescribeDBClusterSnapshotAttributesRequest describe-db-cluster-snapshot-attributes-request]
    (-> this (.describeDBClusterSnapshotAttributesAsync describe-db-cluster-snapshot-attributes-request))))

(defn create-db-cluster-snapshot-async
  "Creates a snapshot of a DB cluster.

  create-db-cluster-snapshot-request - Represents the input of CreateDBClusterSnapshot. - `com.amazonaws.services.docdb.model.CreateDBClusterSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDBClusterSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DBClusterSnapshot>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.CreateDBClusterSnapshotRequest create-db-cluster-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDBClusterSnapshotAsync create-db-cluster-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.CreateDBClusterSnapshotRequest create-db-cluster-snapshot-request]
    (-> this (.createDBClusterSnapshotAsync create-db-cluster-snapshot-request))))

(defn modify-db-cluster-parameter-group-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyDBClusterParameterGroup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.ModifyDBClusterParameterGroupResult>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.ModifyDBClusterParameterGroupRequest modify-db-cluster-parameter-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyDBClusterParameterGroupAsync modify-db-cluster-parameter-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.ModifyDBClusterParameterGroupRequest modify-db-cluster-parameter-group-request]
    (-> this (.modifyDBClusterParameterGroupAsync modify-db-cluster-parameter-group-request))))

(defn modify-db-instance-async
  "Modifies settings for a DB instance. You can change one or more database configuration parameters by specifying
   these parameters and the new values in the request.

  modify-db-instance-request - Represents the input to ModifyDBInstance. - `com.amazonaws.services.docdb.model.ModifyDBInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyDBInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DBInstance>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.ModifyDBInstanceRequest modify-db-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyDBInstanceAsync modify-db-instance-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.ModifyDBInstanceRequest modify-db-instance-request]
    (-> this (.modifyDBInstanceAsync modify-db-instance-request))))

(defn restore-db-cluster-from-snapshot-async
  "Creates a new DB cluster from a DB snapshot or DB cluster snapshot.


   If a DB snapshot is specified, the target DB cluster is created from the source DB snapshot with a default
   configuration and default security group.


   If a DB cluster snapshot is specified, the target DB cluster is created from the source DB cluster restore point
   with the same configuration as the original source DB cluster, except that the new DB cluster is created with the
   default security group.

  restore-db-cluster-from-snapshot-request - Represents the input to RestoreDBClusterFromSnapshot. - `com.amazonaws.services.docdb.model.RestoreDBClusterFromSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestoreDBClusterFromSnapshot operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DBCluster>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.RestoreDBClusterFromSnapshotRequest restore-db-cluster-from-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restoreDBClusterFromSnapshotAsync restore-db-cluster-from-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.RestoreDBClusterFromSnapshotRequest restore-db-cluster-from-snapshot-request]
    (-> this (.restoreDBClusterFromSnapshotAsync restore-db-cluster-from-snapshot-request))))

(defn remove-tags-from-resource-async
  "Removes metadata tags from an Amazon DocumentDB resource.

  remove-tags-from-resource-request - Represents the input to RemoveTagsFromResource. - `com.amazonaws.services.docdb.model.RemoveTagsFromResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveTagsFromResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.RemoveTagsFromResourceResult>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.RemoveTagsFromResourceRequest remove-tags-from-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeTagsFromResourceAsync remove-tags-from-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.RemoveTagsFromResourceRequest remove-tags-from-resource-request]
    (-> this (.removeTagsFromResourceAsync remove-tags-from-resource-request))))

(defn list-tags-for-resource-async
  "Lists all tags on an Amazon DocumentDB resource.

  list-tags-for-resource-request - Represents the input to ListTagsForResource. - `com.amazonaws.services.docdb.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn create-db-cluster-parameter-group-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDBClusterParameterGroup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DBClusterParameterGroup>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.CreateDBClusterParameterGroupRequest create-db-cluster-parameter-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDBClusterParameterGroupAsync create-db-cluster-parameter-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.CreateDBClusterParameterGroupRequest create-db-cluster-parameter-group-request]
    (-> this (.createDBClusterParameterGroupAsync create-db-cluster-parameter-group-request))))

(defn delete-db-cluster-snapshot-async
  "Deletes a DB cluster snapshot. If the snapshot is being copied, the copy operation is terminated.



   The DB cluster snapshot must be in the available state to be deleted.

  delete-db-cluster-snapshot-request - Represents the input to DeleteDBClusterSnapshot. - `com.amazonaws.services.docdb.model.DeleteDBClusterSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDBClusterSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DBClusterSnapshot>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.DeleteDBClusterSnapshotRequest delete-db-cluster-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDBClusterSnapshotAsync delete-db-cluster-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.DeleteDBClusterSnapshotRequest delete-db-cluster-snapshot-request]
    (-> this (.deleteDBClusterSnapshotAsync delete-db-cluster-snapshot-request))))

(defn describe-events-async
  "Returns events related to DB instances, DB security groups, DB snapshots, and DB parameter groups for the past 14
   days. You can obtain events specific to a particular DB instance, DB security group, DB snapshot, or DB parameter
   group by providing the name as a parameter. By default, the events of the past hour are returned.

  describe-events-request - Represents the input to DescribeEvents. - `com.amazonaws.services.docdb.model.DescribeEventsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DescribeEventsResult>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.DescribeEventsRequest describe-events-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventsAsync describe-events-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.DescribeEventsRequest describe-events-request]
    (-> this (.describeEventsAsync describe-events-request))))

(defn delete-db-cluster-async
  "Deletes a previously provisioned DB cluster. When you delete a DB cluster, all automated backups for that DB
   cluster are deleted and can't be recovered. Manual DB cluster snapshots of the specified DB cluster are not
   deleted.

  delete-db-cluster-request - Represents the input to DeleteDBCluster. - `com.amazonaws.services.docdb.model.DeleteDBClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DBCluster>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.DeleteDBClusterRequest delete-db-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDBClusterAsync delete-db-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.DeleteDBClusterRequest delete-db-cluster-request]
    (-> this (.deleteDBClusterAsync delete-db-cluster-request))))

(defn reset-db-cluster-parameter-group-async
  "Modifies the parameters of a DB cluster parameter group to the default value. To reset specific parameters,
   submit a list of the following: ParameterName and ApplyMethod. To reset the entire DB
   cluster parameter group, specify the DBClusterParameterGroupName and ResetAllParameters
   parameters.


   When you reset the entire group, dynamic parameters are updated immediately and static parameters are set to
   pending-reboot to take effect on the next DB instance reboot.

  reset-db-cluster-parameter-group-request - Represents the input to ResetDBClusterParameterGroup. - `com.amazonaws.services.docdb.model.ResetDBClusterParameterGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResetDBClusterParameterGroup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.ResetDBClusterParameterGroupResult>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.ResetDBClusterParameterGroupRequest reset-db-cluster-parameter-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resetDBClusterParameterGroupAsync reset-db-cluster-parameter-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.ResetDBClusterParameterGroupRequest reset-db-cluster-parameter-group-request]
    (-> this (.resetDBClusterParameterGroupAsync reset-db-cluster-parameter-group-request))))

(defn modify-db-subnet-group-async
  "Modifies an existing DB subnet group. DB subnet groups must contain at least one subnet in at least two
   Availability Zones in the AWS Region.

  modify-db-subnet-group-request - Represents the input to ModifyDBSubnetGroup. - `com.amazonaws.services.docdb.model.ModifyDBSubnetGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyDBSubnetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DBSubnetGroup>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.ModifyDBSubnetGroupRequest modify-db-subnet-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyDBSubnetGroupAsync modify-db-subnet-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.ModifyDBSubnetGroupRequest modify-db-subnet-group-request]
    (-> this (.modifyDBSubnetGroupAsync modify-db-subnet-group-request))))

(defn describe-db-instances-async
  "Returns information about provisioned Amazon DocumentDB instances. This API supports pagination.

  describe-db-instances-request - Represents the input to DescribeDBInstances. - `com.amazonaws.services.docdb.model.DescribeDBInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DescribeDBInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.DescribeDBInstancesRequest describe-db-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBInstancesAsync describe-db-instances-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.DescribeDBInstancesRequest describe-db-instances-request]
    (-> this (.describeDBInstancesAsync describe-db-instances-request))))

(defn add-tags-to-resource-async
  "Adds metadata tags to an Amazon DocumentDB resource. You can use these tags with cost allocation reporting to
   track costs that are associated with Amazon DocumentDB resources. or in a Condition statement in an
   AWS Identity and Access Management (IAM) policy for Amazon DocumentDB.

  add-tags-to-resource-request - Represents the input to AddTagsToResource. - `com.amazonaws.services.docdb.model.AddTagsToResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddTagsToResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.AddTagsToResourceResult>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.AddTagsToResourceRequest add-tags-to-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addTagsToResourceAsync add-tags-to-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.AddTagsToResourceRequest add-tags-to-resource-request]
    (-> this (.addTagsToResourceAsync add-tags-to-resource-request))))

(defn describe-db-clusters-async
  "Returns information about provisioned Amazon DocumentDB DB clusters. This API operation supports pagination.

  describe-db-clusters-request - Represents the input to DescribeDBClusters. - `com.amazonaws.services.docdb.model.DescribeDBClustersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBClusters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DescribeDBClustersResult>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.DescribeDBClustersRequest describe-db-clusters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBClustersAsync describe-db-clusters-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.DescribeDBClustersRequest describe-db-clusters-request]
    (-> this (.describeDBClustersAsync describe-db-clusters-request))))

(defn apply-pending-maintenance-action-async
  "Applies a pending maintenance action to a resource (for example, to a DB instance).

  apply-pending-maintenance-action-request - Represents the input to ApplyPendingMaintenanceAction. - `com.amazonaws.services.docdb.model.ApplyPendingMaintenanceActionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ApplyPendingMaintenanceAction operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.ResourcePendingMaintenanceActions>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.ApplyPendingMaintenanceActionRequest apply-pending-maintenance-action-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.applyPendingMaintenanceActionAsync apply-pending-maintenance-action-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.ApplyPendingMaintenanceActionRequest apply-pending-maintenance-action-request]
    (-> this (.applyPendingMaintenanceActionAsync apply-pending-maintenance-action-request))))

(defn describe-db-cluster-snapshots-async
  "Returns information about DB cluster snapshots. This API operation supports pagination.

  describe-db-cluster-snapshots-request - Represents the input to DescribeDBClusterSnapshots. - `com.amazonaws.services.docdb.model.DescribeDBClusterSnapshotsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBClusterSnapshots operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DescribeDBClusterSnapshotsResult>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.DescribeDBClusterSnapshotsRequest describe-db-cluster-snapshots-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBClusterSnapshotsAsync describe-db-cluster-snapshots-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.DescribeDBClusterSnapshotsRequest describe-db-cluster-snapshots-request]
    (-> this (.describeDBClusterSnapshotsAsync describe-db-cluster-snapshots-request))))

(defn describe-engine-default-cluster-parameters-async
  "Returns the default engine and system parameter information for the cluster database engine.

  describe-engine-default-cluster-parameters-request - Represents the input to DescribeEngineDefaultClusterParameters. - `com.amazonaws.services.docdb.model.DescribeEngineDefaultClusterParametersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEngineDefaultClusterParameters operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.EngineDefaults>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.DescribeEngineDefaultClusterParametersRequest describe-engine-default-cluster-parameters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEngineDefaultClusterParametersAsync describe-engine-default-cluster-parameters-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsync this ^com.amazonaws.services.docdb.model.DescribeEngineDefaultClusterParametersRequest describe-engine-default-cluster-parameters-request]
    (-> this (.describeEngineDefaultClusterParametersAsync describe-engine-default-cluster-parameters-request))))

