(ns com.amazonaws.services.neptune.AbstractAmazonNeptuneAsync
  "Abstract implementation of AmazonNeptuneAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.neptune AbstractAmazonNeptuneAsync]))

(defn modify-db-cluster-snapshot-attribute-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.ModifyDBClusterSnapshotAttributeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyDBClusterSnapshotAttribute operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBClusterSnapshotAttributesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ModifyDBClusterSnapshotAttributeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyDBClusterSnapshotAttributeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ModifyDBClusterSnapshotAttributeRequest request]
    (-> this (.modifyDBClusterSnapshotAttributeAsync request))))

(defn describe-db-parameter-groups-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.DescribeDBParameterGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBParameterGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DescribeDBParameterGroupsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeDBParameterGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBParameterGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeDBParameterGroupsRequest request]
    (-> this (.describeDBParameterGroupsAsync request))))

(defn delete-db-instance-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.DeleteDBInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDBInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBInstance>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DeleteDBInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDBInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DeleteDBInstanceRequest request]
    (-> this (.deleteDBInstanceAsync request))))

(defn describe-event-categories-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.DescribeEventCategoriesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEventCategories operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DescribeEventCategoriesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeEventCategoriesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventCategoriesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeEventCategoriesRequest request]
    (-> this (.describeEventCategoriesAsync request))))

(defn describe-db-subnet-groups-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.DescribeDBSubnetGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBSubnetGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DescribeDBSubnetGroupsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeDBSubnetGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBSubnetGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeDBSubnetGroupsRequest request]
    (-> this (.describeDBSubnetGroupsAsync request))))

(defn describe-db-cluster-parameters-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.DescribeDBClusterParametersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBClusterParameters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DescribeDBClusterParametersResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeDBClusterParametersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBClusterParametersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeDBClusterParametersRequest request]
    (-> this (.describeDBClusterParametersAsync request))))

(defn copy-db-parameter-group-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.CopyDBParameterGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CopyDBParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBParameterGroup>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.CopyDBParameterGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.copyDBParameterGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.CopyDBParameterGroupRequest request]
    (-> this (.copyDBParameterGroupAsync request))))

(defn delete-event-subscription-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.DeleteEventSubscriptionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEventSubscription operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.EventSubscription>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DeleteEventSubscriptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEventSubscriptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DeleteEventSubscriptionRequest request]
    (-> this (.deleteEventSubscriptionAsync request))))

(defn delete-db-subnet-group-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.DeleteDBSubnetGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDBSubnetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DeleteDBSubnetGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DeleteDBSubnetGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDBSubnetGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DeleteDBSubnetGroupRequest request]
    (-> this (.deleteDBSubnetGroupAsync request))))

(defn describe-db-cluster-parameter-groups-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.DescribeDBClusterParameterGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBClusterParameterGroups operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DescribeDBClusterParameterGroupsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeDBClusterParameterGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBClusterParameterGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeDBClusterParameterGroupsRequest request]
    (-> this (.describeDBClusterParameterGroupsAsync request))))

(defn copy-db-cluster-snapshot-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.CopyDBClusterSnapshotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CopyDBClusterSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBClusterSnapshot>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.CopyDBClusterSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.copyDBClusterSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.CopyDBClusterSnapshotRequest request]
    (-> this (.copyDBClusterSnapshotAsync request))))

(defn remove-role-from-db-cluster-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.RemoveRoleFromDBClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveRoleFromDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.RemoveRoleFromDBClusterResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.RemoveRoleFromDBClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeRoleFromDBClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.RemoveRoleFromDBClusterRequest request]
    (-> this (.removeRoleFromDBClusterAsync request))))

(defn copy-db-cluster-parameter-group-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.CopyDBClusterParameterGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CopyDBClusterParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBClusterParameterGroup>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.CopyDBClusterParameterGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.copyDBClusterParameterGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.CopyDBClusterParameterGroupRequest request]
    (-> this (.copyDBClusterParameterGroupAsync request))))

(defn failover-db-cluster-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.FailoverDBClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the FailoverDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBCluster>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.FailoverDBClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.failoverDBClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.FailoverDBClusterRequest request]
    (-> this (.failoverDBClusterAsync request))))

(defn create-db-parameter-group-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.CreateDBParameterGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDBParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBParameterGroup>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.CreateDBParameterGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDBParameterGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.CreateDBParameterGroupRequest request]
    (-> this (.createDBParameterGroupAsync request))))

(defn promote-read-replica-db-cluster-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.PromoteReadReplicaDBClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PromoteReadReplicaDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBCluster>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.PromoteReadReplicaDBClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.promoteReadReplicaDBClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.PromoteReadReplicaDBClusterRequest request]
    (-> this (.promoteReadReplicaDBClusterAsync request))))

(defn create-db-cluster-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.CreateDBClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBCluster>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.CreateDBClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDBClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.CreateDBClusterRequest request]
    (-> this (.createDBClusterAsync request))))

(defn modify-db-cluster-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.ModifyDBClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBCluster>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ModifyDBClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyDBClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ModifyDBClusterRequest request]
    (-> this (.modifyDBClusterAsync request))))

(defn describe-orderable-db-instance-options-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.DescribeOrderableDBInstanceOptionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeOrderableDBInstanceOptions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DescribeOrderableDBInstanceOptionsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeOrderableDBInstanceOptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeOrderableDBInstanceOptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeOrderableDBInstanceOptionsRequest request]
    (-> this (.describeOrderableDBInstanceOptionsAsync request))))

(defn describe-db-engine-versions-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.DescribeDBEngineVersionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBEngineVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DescribeDBEngineVersionsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeDBEngineVersionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBEngineVersionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeDBEngineVersionsRequest request]
    (-> this (.describeDBEngineVersionsAsync request))))

(defn restore-db-cluster-to-point-in-time-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.RestoreDBClusterToPointInTimeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestoreDBClusterToPointInTime operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBCluster>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.RestoreDBClusterToPointInTimeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restoreDBClusterToPointInTimeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.RestoreDBClusterToPointInTimeRequest request]
    (-> this (.restoreDBClusterToPointInTimeAsync request))))

(defn describe-db-parameters-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.DescribeDBParametersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBParameters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DescribeDBParametersResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeDBParametersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBParametersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeDBParametersRequest request]
    (-> this (.describeDBParametersAsync request))))

(defn create-db-instance-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.CreateDBInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDBInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBInstance>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.CreateDBInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDBInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.CreateDBInstanceRequest request]
    (-> this (.createDBInstanceAsync request))))

(defn create-event-subscription-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.CreateEventSubscriptionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateEventSubscription operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.EventSubscription>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.CreateEventSubscriptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createEventSubscriptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.CreateEventSubscriptionRequest request]
    (-> this (.createEventSubscriptionAsync request))))

(defn reboot-db-instance-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.RebootDBInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RebootDBInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBInstance>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.RebootDBInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rebootDBInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.RebootDBInstanceRequest request]
    (-> this (.rebootDBInstanceAsync request))))

(defn describe-pending-maintenance-actions-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.DescribePendingMaintenanceActionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePendingMaintenanceActions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DescribePendingMaintenanceActionsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribePendingMaintenanceActionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePendingMaintenanceActionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribePendingMaintenanceActionsRequest request]
    (-> this (.describePendingMaintenanceActionsAsync request))))

(defn add-role-to-db-cluster-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.AddRoleToDBClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddRoleToDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.AddRoleToDBClusterResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.AddRoleToDBClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addRoleToDBClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.AddRoleToDBClusterRequest request]
    (-> this (.addRoleToDBClusterAsync request))))

(defn create-db-subnet-group-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.CreateDBSubnetGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDBSubnetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBSubnetGroup>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.CreateDBSubnetGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDBSubnetGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.CreateDBSubnetGroupRequest request]
    (-> this (.createDBSubnetGroupAsync request))))

(defn delete-db-cluster-parameter-group-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.DeleteDBClusterParameterGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDBClusterParameterGroup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DeleteDBClusterParameterGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DeleteDBClusterParameterGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDBClusterParameterGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DeleteDBClusterParameterGroupRequest request]
    (-> this (.deleteDBClusterParameterGroupAsync request))))

(defn describe-db-cluster-snapshot-attributes-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.DescribeDBClusterSnapshotAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBClusterSnapshotAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBClusterSnapshotAttributesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeDBClusterSnapshotAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBClusterSnapshotAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeDBClusterSnapshotAttributesRequest request]
    (-> this (.describeDBClusterSnapshotAttributesAsync request))))

(defn create-db-cluster-snapshot-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.CreateDBClusterSnapshotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDBClusterSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBClusterSnapshot>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.CreateDBClusterSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDBClusterSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.CreateDBClusterSnapshotRequest request]
    (-> this (.createDBClusterSnapshotAsync request))))

(defn modify-db-cluster-parameter-group-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.ModifyDBClusterParameterGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyDBClusterParameterGroup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.ModifyDBClusterParameterGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ModifyDBClusterParameterGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyDBClusterParameterGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ModifyDBClusterParameterGroupRequest request]
    (-> this (.modifyDBClusterParameterGroupAsync request))))

(defn modify-db-instance-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.ModifyDBInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyDBInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBInstance>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ModifyDBInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyDBInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ModifyDBInstanceRequest request]
    (-> this (.modifyDBInstanceAsync request))))

(defn restore-db-cluster-from-snapshot-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.RestoreDBClusterFromSnapshotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestoreDBClusterFromSnapshot operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBCluster>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.RestoreDBClusterFromSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restoreDBClusterFromSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.RestoreDBClusterFromSnapshotRequest request]
    (-> this (.restoreDBClusterFromSnapshotAsync request))))

(defn remove-tags-from-resource-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.RemoveTagsFromResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveTagsFromResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.RemoveTagsFromResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.RemoveTagsFromResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeTagsFromResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.RemoveTagsFromResourceRequest request]
    (-> this (.removeTagsFromResourceAsync request))))

(defn describe-event-subscriptions-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.DescribeEventSubscriptionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEventSubscriptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DescribeEventSubscriptionsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeEventSubscriptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventSubscriptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeEventSubscriptionsRequest request]
    (-> this (.describeEventSubscriptionsAsync request))))

(defn modify-db-parameter-group-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.ModifyDBParameterGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyDBParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.ModifyDBParameterGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ModifyDBParameterGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyDBParameterGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ModifyDBParameterGroupRequest request]
    (-> this (.modifyDBParameterGroupAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn create-db-cluster-parameter-group-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.CreateDBClusterParameterGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDBClusterParameterGroup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBClusterParameterGroup>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.CreateDBClusterParameterGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDBClusterParameterGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.CreateDBClusterParameterGroupRequest request]
    (-> this (.createDBClusterParameterGroupAsync request))))

(defn delete-db-cluster-snapshot-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.DeleteDBClusterSnapshotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDBClusterSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBClusterSnapshot>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DeleteDBClusterSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDBClusterSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DeleteDBClusterSnapshotRequest request]
    (-> this (.deleteDBClusterSnapshotAsync request))))

(defn describe-engine-default-parameters-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.DescribeEngineDefaultParametersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEngineDefaultParameters operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.EngineDefaults>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeEngineDefaultParametersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEngineDefaultParametersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeEngineDefaultParametersRequest request]
    (-> this (.describeEngineDefaultParametersAsync request))))

(defn delete-db-parameter-group-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.DeleteDBParameterGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDBParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DeleteDBParameterGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DeleteDBParameterGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDBParameterGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DeleteDBParameterGroupRequest request]
    (-> this (.deleteDBParameterGroupAsync request))))

(defn describe-events-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.DescribeEventsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DescribeEventsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeEventsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeEventsRequest request]
    (-> this (.describeEventsAsync request))))

(defn reset-db-parameter-group-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.ResetDBParameterGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResetDBParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.ResetDBParameterGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ResetDBParameterGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resetDBParameterGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ResetDBParameterGroupRequest request]
    (-> this (.resetDBParameterGroupAsync request))))

(defn delete-db-cluster-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.DeleteDBClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBCluster>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DeleteDBClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDBClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DeleteDBClusterRequest request]
    (-> this (.deleteDBClusterAsync request))))

(defn reset-db-cluster-parameter-group-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.ResetDBClusterParameterGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResetDBClusterParameterGroup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.ResetDBClusterParameterGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ResetDBClusterParameterGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resetDBClusterParameterGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ResetDBClusterParameterGroupRequest request]
    (-> this (.resetDBClusterParameterGroupAsync request))))

(defn modify-db-subnet-group-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.ModifyDBSubnetGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyDBSubnetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBSubnetGroup>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ModifyDBSubnetGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyDBSubnetGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ModifyDBSubnetGroupRequest request]
    (-> this (.modifyDBSubnetGroupAsync request))))

(defn remove-source-identifier-from-subscription-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.RemoveSourceIdentifierFromSubscriptionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveSourceIdentifierFromSubscription operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.EventSubscription>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.RemoveSourceIdentifierFromSubscriptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeSourceIdentifierFromSubscriptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.RemoveSourceIdentifierFromSubscriptionRequest request]
    (-> this (.removeSourceIdentifierFromSubscriptionAsync request))))

(defn describe-db-instances-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.DescribeDBInstancesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DescribeDBInstancesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeDBInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeDBInstancesRequest request]
    (-> this (.describeDBInstancesAsync request))))

(defn add-tags-to-resource-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.AddTagsToResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddTagsToResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.AddTagsToResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.AddTagsToResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addTagsToResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.AddTagsToResourceRequest request]
    (-> this (.addTagsToResourceAsync request))))

(defn describe-db-clusters-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.DescribeDBClustersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBClusters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DescribeDBClustersResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeDBClustersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBClustersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeDBClustersRequest request]
    (-> this (.describeDBClustersAsync request))))

(defn modify-event-subscription-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.ModifyEventSubscriptionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyEventSubscription operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.EventSubscription>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ModifyEventSubscriptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyEventSubscriptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ModifyEventSubscriptionRequest request]
    (-> this (.modifyEventSubscriptionAsync request))))

(defn apply-pending-maintenance-action-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.ApplyPendingMaintenanceActionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ApplyPendingMaintenanceAction operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.ResourcePendingMaintenanceActions>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ApplyPendingMaintenanceActionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.applyPendingMaintenanceActionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ApplyPendingMaintenanceActionRequest request]
    (-> this (.applyPendingMaintenanceActionAsync request))))

(defn describe-db-cluster-snapshots-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.DescribeDBClusterSnapshotsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBClusterSnapshots operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DescribeDBClusterSnapshotsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeDBClusterSnapshotsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBClusterSnapshotsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeDBClusterSnapshotsRequest request]
    (-> this (.describeDBClusterSnapshotsAsync request))))

(defn add-source-identifier-to-subscription-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.AddSourceIdentifierToSubscriptionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddSourceIdentifierToSubscription operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.EventSubscription>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.AddSourceIdentifierToSubscriptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addSourceIdentifierToSubscriptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.AddSourceIdentifierToSubscriptionRequest request]
    (-> this (.addSourceIdentifierToSubscriptionAsync request))))

(defn describe-valid-db-instance-modifications-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.DescribeValidDBInstanceModificationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeValidDBInstanceModifications operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.ValidDBInstanceModificationsMessage>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeValidDBInstanceModificationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeValidDBInstanceModificationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeValidDBInstanceModificationsRequest request]
    (-> this (.describeValidDBInstanceModificationsAsync request))))

(defn describe-engine-default-cluster-parameters-async
  "Description copied from interface: AmazonNeptuneAsync

  request - `com.amazonaws.services.neptune.model.DescribeEngineDefaultClusterParametersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEngineDefaultClusterParameters operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.EngineDefaults>`"
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeEngineDefaultClusterParametersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEngineDefaultClusterParametersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeEngineDefaultClusterParametersRequest request]
    (-> this (.describeEngineDefaultClusterParametersAsync request))))

