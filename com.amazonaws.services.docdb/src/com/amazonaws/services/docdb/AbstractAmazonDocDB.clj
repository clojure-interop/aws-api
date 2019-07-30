(ns com.amazonaws.services.docdb.AbstractAmazonDocDB
  "Abstract implementation of AmazonDocDB. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.docdb AbstractAmazonDocDB]))

(defn stop-db-cluster
  "Description copied from interface: AmazonDocDB

  request - `com.amazonaws.services.docdb.model.StopDBClusterRequest`

  returns: Result of the StopDBCluster operation returned by the service. - `com.amazonaws.services.docdb.model.DBCluster`"
  (^com.amazonaws.services.docdb.model.DBCluster [^AbstractAmazonDocDB this ^com.amazonaws.services.docdb.model.StopDBClusterRequest request]
    (-> this (.stopDBCluster request))))

(defn modify-db-cluster-snapshot-attribute
  "Description copied from interface: AmazonDocDB

  request - Represents the input to ModifyDBClusterSnapshotAttribute. - `com.amazonaws.services.docdb.model.ModifyDBClusterSnapshotAttributeRequest`

  returns: Result of the ModifyDBClusterSnapshotAttribute operation returned by the service. - `com.amazonaws.services.docdb.model.DBClusterSnapshotAttributesResult`"
  (^com.amazonaws.services.docdb.model.DBClusterSnapshotAttributesResult [^AbstractAmazonDocDB this ^com.amazonaws.services.docdb.model.ModifyDBClusterSnapshotAttributeRequest request]
    (-> this (.modifyDBClusterSnapshotAttribute request))))

(defn create-db-instance
  "Description copied from interface: AmazonDocDB

  request - Represents the input to CreateDBInstance. - `com.amazonaws.services.docdb.model.CreateDBInstanceRequest`

  returns: Result of the CreateDBInstance operation returned by the service. - `com.amazonaws.services.docdb.model.DBInstance`"
  (^com.amazonaws.services.docdb.model.DBInstance [^AbstractAmazonDocDB this ^com.amazonaws.services.docdb.model.CreateDBInstanceRequest request]
    (-> this (.createDBInstance request))))

(defn list-tags-for-resource
  "Description copied from interface: AmazonDocDB

  request - Represents the input to ListTagsForResource. - `com.amazonaws.services.docdb.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.docdb.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.docdb.model.ListTagsForResourceResult [^AbstractAmazonDocDB this ^com.amazonaws.services.docdb.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn modify-db-subnet-group
  "Description copied from interface: AmazonDocDB

  request - Represents the input to ModifyDBSubnetGroup. - `com.amazonaws.services.docdb.model.ModifyDBSubnetGroupRequest`

  returns: Result of the ModifyDBSubnetGroup operation returned by the service. - `com.amazonaws.services.docdb.model.DBSubnetGroup`"
  (^com.amazonaws.services.docdb.model.DBSubnetGroup [^AbstractAmazonDocDB this ^com.amazonaws.services.docdb.model.ModifyDBSubnetGroupRequest request]
    (-> this (.modifyDBSubnetGroup request))))

(defn describe-db-cluster-snapshot-attributes
  "Description copied from interface: AmazonDocDB

  request - Represents the input to DescribeDBClusterSnapshotAttributes. - `com.amazonaws.services.docdb.model.DescribeDBClusterSnapshotAttributesRequest`

  returns: Result of the DescribeDBClusterSnapshotAttributes operation returned by the service. - `com.amazonaws.services.docdb.model.DBClusterSnapshotAttributesResult`"
  (^com.amazonaws.services.docdb.model.DBClusterSnapshotAttributesResult [^AbstractAmazonDocDB this ^com.amazonaws.services.docdb.model.DescribeDBClusterSnapshotAttributesRequest request]
    (-> this (.describeDBClusterSnapshotAttributes request))))

(defn describe-db-subnet-groups
  "Description copied from interface: AmazonDocDB

  request - Represents the input to DescribeDBSubnetGroups. - `com.amazonaws.services.docdb.model.DescribeDBSubnetGroupsRequest`

  returns: Result of the DescribeDBSubnetGroups operation returned by the service. - `com.amazonaws.services.docdb.model.DescribeDBSubnetGroupsResult`"
  (^com.amazonaws.services.docdb.model.DescribeDBSubnetGroupsResult [^AbstractAmazonDocDB this ^com.amazonaws.services.docdb.model.DescribeDBSubnetGroupsRequest request]
    (-> this (.describeDBSubnetGroups request))))

(defn reboot-db-instance
  "Description copied from interface: AmazonDocDB

  request - Represents the input to RebootDBInstance. - `com.amazonaws.services.docdb.model.RebootDBInstanceRequest`

  returns: Result of the RebootDBInstance operation returned by the service. - `com.amazonaws.services.docdb.model.DBInstance`"
  (^com.amazonaws.services.docdb.model.DBInstance [^AbstractAmazonDocDB this ^com.amazonaws.services.docdb.model.RebootDBInstanceRequest request]
    (-> this (.rebootDBInstance request))))

(defn delete-db-cluster-snapshot
  "Description copied from interface: AmazonDocDB

  request - Represents the input to DeleteDBClusterSnapshot. - `com.amazonaws.services.docdb.model.DeleteDBClusterSnapshotRequest`

  returns: Result of the DeleteDBClusterSnapshot operation returned by the service. - `com.amazonaws.services.docdb.model.DBClusterSnapshot`"
  (^com.amazonaws.services.docdb.model.DBClusterSnapshot [^AbstractAmazonDocDB this ^com.amazonaws.services.docdb.model.DeleteDBClusterSnapshotRequest request]
    (-> this (.deleteDBClusterSnapshot request))))

(defn waiters
  "returns: `com.amazonaws.services.docdb.waiters.AmazonDocDBWaiters`"
  (^com.amazonaws.services.docdb.waiters.AmazonDocDBWaiters [^AbstractAmazonDocDB this]
    (-> this (.waiters))))

(defn delete-db-cluster-parameter-group
  "Description copied from interface: AmazonDocDB

  request - Represents the input to DeleteDBClusterParameterGroup. - `com.amazonaws.services.docdb.model.DeleteDBClusterParameterGroupRequest`

  returns: Result of the DeleteDBClusterParameterGroup operation returned by the service. - `com.amazonaws.services.docdb.model.DeleteDBClusterParameterGroupResult`"
  (^com.amazonaws.services.docdb.model.DeleteDBClusterParameterGroupResult [^AbstractAmazonDocDB this ^com.amazonaws.services.docdb.model.DeleteDBClusterParameterGroupRequest request]
    (-> this (.deleteDBClusterParameterGroup request))))

(defn describe-engine-default-cluster-parameters
  "Description copied from interface: AmazonDocDB

  request - Represents the input to DescribeEngineDefaultClusterParameters. - `com.amazonaws.services.docdb.model.DescribeEngineDefaultClusterParametersRequest`

  returns: Result of the DescribeEngineDefaultClusterParameters operation returned by the service. - `com.amazonaws.services.docdb.model.EngineDefaults`"
  (^com.amazonaws.services.docdb.model.EngineDefaults [^AbstractAmazonDocDB this ^com.amazonaws.services.docdb.model.DescribeEngineDefaultClusterParametersRequest request]
    (-> this (.describeEngineDefaultClusterParameters request))))

(defn describe-pending-maintenance-actions
  "Description copied from interface: AmazonDocDB

  request - Represents the input to DescribePendingMaintenanceActions. - `com.amazonaws.services.docdb.model.DescribePendingMaintenanceActionsRequest`

  returns: Result of the DescribePendingMaintenanceActions operation returned by the service. - `com.amazonaws.services.docdb.model.DescribePendingMaintenanceActionsResult`"
  (^com.amazonaws.services.docdb.model.DescribePendingMaintenanceActionsResult [^AbstractAmazonDocDB this ^com.amazonaws.services.docdb.model.DescribePendingMaintenanceActionsRequest request]
    (-> this (.describePendingMaintenanceActions request))))

(defn failover-db-cluster
  "Description copied from interface: AmazonDocDB

  request - Represents the input to FailoverDBCluster. - `com.amazonaws.services.docdb.model.FailoverDBClusterRequest`

  returns: Result of the FailoverDBCluster operation returned by the service. - `com.amazonaws.services.docdb.model.DBCluster`"
  (^com.amazonaws.services.docdb.model.DBCluster [^AbstractAmazonDocDB this ^com.amazonaws.services.docdb.model.FailoverDBClusterRequest request]
    (-> this (.failoverDBCluster request))))

(defn modify-db-instance
  "Description copied from interface: AmazonDocDB

  request - Represents the input to ModifyDBInstance. - `com.amazonaws.services.docdb.model.ModifyDBInstanceRequest`

  returns: Result of the ModifyDBInstance operation returned by the service. - `com.amazonaws.services.docdb.model.DBInstance`"
  (^com.amazonaws.services.docdb.model.DBInstance [^AbstractAmazonDocDB this ^com.amazonaws.services.docdb.model.ModifyDBInstanceRequest request]
    (-> this (.modifyDBInstance request))))

(defn create-db-cluster
  "Description copied from interface: AmazonDocDB

  request - Represents the input to CreateDBCluster. - `com.amazonaws.services.docdb.model.CreateDBClusterRequest`

  returns: Result of the CreateDBCluster operation returned by the service. - `com.amazonaws.services.docdb.model.DBCluster`"
  (^com.amazonaws.services.docdb.model.DBCluster [^AbstractAmazonDocDB this ^com.amazonaws.services.docdb.model.CreateDBClusterRequest request]
    (-> this (.createDBCluster request))))

(defn delete-db-instance
  "Description copied from interface: AmazonDocDB

  request - Represents the input to DeleteDBInstance. - `com.amazonaws.services.docdb.model.DeleteDBInstanceRequest`

  returns: Result of the DeleteDBInstance operation returned by the service. - `com.amazonaws.services.docdb.model.DBInstance`"
  (^com.amazonaws.services.docdb.model.DBInstance [^AbstractAmazonDocDB this ^com.amazonaws.services.docdb.model.DeleteDBInstanceRequest request]
    (-> this (.deleteDBInstance request))))

(defn delete-db-subnet-group
  "Description copied from interface: AmazonDocDB

  request - Represents the input to DeleteDBSubnetGroup. - `com.amazonaws.services.docdb.model.DeleteDBSubnetGroupRequest`

  returns: Result of the DeleteDBSubnetGroup operation returned by the service. - `com.amazonaws.services.docdb.model.DeleteDBSubnetGroupResult`"
  (^com.amazonaws.services.docdb.model.DeleteDBSubnetGroupResult [^AbstractAmazonDocDB this ^com.amazonaws.services.docdb.model.DeleteDBSubnetGroupRequest request]
    (-> this (.deleteDBSubnetGroup request))))

(defn restore-db-cluster-to-point-in-time
  "Description copied from interface: AmazonDocDB

  request - Represents the input to RestoreDBClusterToPointInTime. - `com.amazonaws.services.docdb.model.RestoreDBClusterToPointInTimeRequest`

  returns: Result of the RestoreDBClusterToPointInTime operation returned by the service. - `com.amazonaws.services.docdb.model.DBCluster`"
  (^com.amazonaws.services.docdb.model.DBCluster [^AbstractAmazonDocDB this ^com.amazonaws.services.docdb.model.RestoreDBClusterToPointInTimeRequest request]
    (-> this (.restoreDBClusterToPointInTime request))))

(defn delete-db-cluster
  "Description copied from interface: AmazonDocDB

  request - Represents the input to DeleteDBCluster. - `com.amazonaws.services.docdb.model.DeleteDBClusterRequest`

  returns: Result of the DeleteDBCluster operation returned by the service. - `com.amazonaws.services.docdb.model.DBCluster`"
  (^com.amazonaws.services.docdb.model.DBCluster [^AbstractAmazonDocDB this ^com.amazonaws.services.docdb.model.DeleteDBClusterRequest request]
    (-> this (.deleteDBCluster request))))

(defn create-db-cluster-snapshot
  "Description copied from interface: AmazonDocDB

  request - Represents the input of CreateDBClusterSnapshot. - `com.amazonaws.services.docdb.model.CreateDBClusterSnapshotRequest`

  returns: Result of the CreateDBClusterSnapshot operation returned by the service. - `com.amazonaws.services.docdb.model.DBClusterSnapshot`"
  (^com.amazonaws.services.docdb.model.DBClusterSnapshot [^AbstractAmazonDocDB this ^com.amazonaws.services.docdb.model.CreateDBClusterSnapshotRequest request]
    (-> this (.createDBClusterSnapshot request))))

(defn shutdown
  "Description copied from interface: AmazonDocDB"
  ([^AbstractAmazonDocDB this]
    (-> this (.shutdown))))

(defn describe-events
  "Description copied from interface: AmazonDocDB

  request - Represents the input to DescribeEvents. - `com.amazonaws.services.docdb.model.DescribeEventsRequest`

  returns: Result of the DescribeEvents operation returned by the service. - `com.amazonaws.services.docdb.model.DescribeEventsResult`"
  (^com.amazonaws.services.docdb.model.DescribeEventsResult [^AbstractAmazonDocDB this ^com.amazonaws.services.docdb.model.DescribeEventsRequest request]
    (-> this (.describeEvents request))))

(defn describe-event-categories
  "Description copied from interface: AmazonDocDB

  request - Represents the input to DescribeEventCategories. - `com.amazonaws.services.docdb.model.DescribeEventCategoriesRequest`

  returns: Result of the DescribeEventCategories operation returned by the service. - `com.amazonaws.services.docdb.model.DescribeEventCategoriesResult`"
  (^com.amazonaws.services.docdb.model.DescribeEventCategoriesResult [^AbstractAmazonDocDB this ^com.amazonaws.services.docdb.model.DescribeEventCategoriesRequest request]
    (-> this (.describeEventCategories request))))

(defn describe-db-engine-versions
  "Description copied from interface: AmazonDocDB

  request - Represents the input to DescribeDBEngineVersions. - `com.amazonaws.services.docdb.model.DescribeDBEngineVersionsRequest`

  returns: Result of the DescribeDBEngineVersions operation returned by the service. - `com.amazonaws.services.docdb.model.DescribeDBEngineVersionsResult`"
  (^com.amazonaws.services.docdb.model.DescribeDBEngineVersionsResult [^AbstractAmazonDocDB this ^com.amazonaws.services.docdb.model.DescribeDBEngineVersionsRequest request]
    (-> this (.describeDBEngineVersions request))))

(defn create-db-cluster-parameter-group
  "Description copied from interface: AmazonDocDB

  request - Represents the input of CreateDBClusterParameterGroup. - `com.amazonaws.services.docdb.model.CreateDBClusterParameterGroupRequest`

  returns: Result of the CreateDBClusterParameterGroup operation returned by the service. - `com.amazonaws.services.docdb.model.DBClusterParameterGroup`"
  (^com.amazonaws.services.docdb.model.DBClusterParameterGroup [^AbstractAmazonDocDB this ^com.amazonaws.services.docdb.model.CreateDBClusterParameterGroupRequest request]
    (-> this (.createDBClusterParameterGroup request))))

(defn describe-db-cluster-parameter-groups
  "Description copied from interface: AmazonDocDB

  request - Represents the input to DescribeDBClusterParameterGroups. - `com.amazonaws.services.docdb.model.DescribeDBClusterParameterGroupsRequest`

  returns: Result of the DescribeDBClusterParameterGroups operation returned by the service. - `com.amazonaws.services.docdb.model.DescribeDBClusterParameterGroupsResult`"
  (^com.amazonaws.services.docdb.model.DescribeDBClusterParameterGroupsResult [^AbstractAmazonDocDB this ^com.amazonaws.services.docdb.model.DescribeDBClusterParameterGroupsRequest request]
    (-> this (.describeDBClusterParameterGroups request))))

(defn describe-db-instances
  "Description copied from interface: AmazonDocDB

  request - Represents the input to DescribeDBInstances. - `com.amazonaws.services.docdb.model.DescribeDBInstancesRequest`

  returns: Result of the DescribeDBInstances operation returned by the service. - `com.amazonaws.services.docdb.model.DescribeDBInstancesResult`"
  (^com.amazonaws.services.docdb.model.DescribeDBInstancesResult [^AbstractAmazonDocDB this ^com.amazonaws.services.docdb.model.DescribeDBInstancesRequest request]
    (-> this (.describeDBInstances request))))

(defn remove-tags-from-resource
  "Description copied from interface: AmazonDocDB

  request - Represents the input to RemoveTagsFromResource. - `com.amazonaws.services.docdb.model.RemoveTagsFromResourceRequest`

  returns: Result of the RemoveTagsFromResource operation returned by the service. - `com.amazonaws.services.docdb.model.RemoveTagsFromResourceResult`"
  (^com.amazonaws.services.docdb.model.RemoveTagsFromResourceResult [^AbstractAmazonDocDB this ^com.amazonaws.services.docdb.model.RemoveTagsFromResourceRequest request]
    (-> this (.removeTagsFromResource request))))

(defn describe-db-cluster-snapshots
  "Description copied from interface: AmazonDocDB

  request - Represents the input to DescribeDBClusterSnapshots. - `com.amazonaws.services.docdb.model.DescribeDBClusterSnapshotsRequest`

  returns: Result of the DescribeDBClusterSnapshots operation returned by the service. - `com.amazonaws.services.docdb.model.DescribeDBClusterSnapshotsResult`"
  (^com.amazonaws.services.docdb.model.DescribeDBClusterSnapshotsResult [^AbstractAmazonDocDB this ^com.amazonaws.services.docdb.model.DescribeDBClusterSnapshotsRequest request]
    (-> this (.describeDBClusterSnapshots request))))

(defn describe-orderable-db-instance-options
  "Description copied from interface: AmazonDocDB

  request - Represents the input to DescribeOrderableDBInstanceOptions. - `com.amazonaws.services.docdb.model.DescribeOrderableDBInstanceOptionsRequest`

  returns: Result of the DescribeOrderableDBInstanceOptions operation returned by the service. - `com.amazonaws.services.docdb.model.DescribeOrderableDBInstanceOptionsResult`"
  (^com.amazonaws.services.docdb.model.DescribeOrderableDBInstanceOptionsResult [^AbstractAmazonDocDB this ^com.amazonaws.services.docdb.model.DescribeOrderableDBInstanceOptionsRequest request]
    (-> this (.describeOrderableDBInstanceOptions request))))

(defn describe-db-cluster-parameters
  "Description copied from interface: AmazonDocDB

  request - Represents the input to DescribeDBClusterParameters. - `com.amazonaws.services.docdb.model.DescribeDBClusterParametersRequest`

  returns: Result of the DescribeDBClusterParameters operation returned by the service. - `com.amazonaws.services.docdb.model.DescribeDBClusterParametersResult`"
  (^com.amazonaws.services.docdb.model.DescribeDBClusterParametersResult [^AbstractAmazonDocDB this ^com.amazonaws.services.docdb.model.DescribeDBClusterParametersRequest request]
    (-> this (.describeDBClusterParameters request))))

(defn restore-db-cluster-from-snapshot
  "Description copied from interface: AmazonDocDB

  request - Represents the input to RestoreDBClusterFromSnapshot. - `com.amazonaws.services.docdb.model.RestoreDBClusterFromSnapshotRequest`

  returns: Result of the RestoreDBClusterFromSnapshot operation returned by the service. - `com.amazonaws.services.docdb.model.DBCluster`"
  (^com.amazonaws.services.docdb.model.DBCluster [^AbstractAmazonDocDB this ^com.amazonaws.services.docdb.model.RestoreDBClusterFromSnapshotRequest request]
    (-> this (.restoreDBClusterFromSnapshot request))))

(defn describe-db-clusters
  "Description copied from interface: AmazonDocDB

  request - Represents the input to DescribeDBClusters. - `com.amazonaws.services.docdb.model.DescribeDBClustersRequest`

  returns: Result of the DescribeDBClusters operation returned by the service. - `com.amazonaws.services.docdb.model.DescribeDBClustersResult`"
  (^com.amazonaws.services.docdb.model.DescribeDBClustersResult [^AbstractAmazonDocDB this ^com.amazonaws.services.docdb.model.DescribeDBClustersRequest request]
    (-> this (.describeDBClusters request))))

(defn add-tags-to-resource
  "Description copied from interface: AmazonDocDB

  request - Represents the input to AddTagsToResource. - `com.amazonaws.services.docdb.model.AddTagsToResourceRequest`

  returns: Result of the AddTagsToResource operation returned by the service. - `com.amazonaws.services.docdb.model.AddTagsToResourceResult`"
  (^com.amazonaws.services.docdb.model.AddTagsToResourceResult [^AbstractAmazonDocDB this ^com.amazonaws.services.docdb.model.AddTagsToResourceRequest request]
    (-> this (.addTagsToResource request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonDocDB

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonDocDB this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn modify-db-cluster-parameter-group
  "Description copied from interface: AmazonDocDB

  request - Represents the input to ModifyDBClusterParameterGroup. - `com.amazonaws.services.docdb.model.ModifyDBClusterParameterGroupRequest`

  returns: Result of the ModifyDBClusterParameterGroup operation returned by the service. - `com.amazonaws.services.docdb.model.ModifyDBClusterParameterGroupResult`"
  (^com.amazonaws.services.docdb.model.ModifyDBClusterParameterGroupResult [^AbstractAmazonDocDB this ^com.amazonaws.services.docdb.model.ModifyDBClusterParameterGroupRequest request]
    (-> this (.modifyDBClusterParameterGroup request))))

(defn reset-db-cluster-parameter-group
  "Description copied from interface: AmazonDocDB

  request - Represents the input to ResetDBClusterParameterGroup. - `com.amazonaws.services.docdb.model.ResetDBClusterParameterGroupRequest`

  returns: Result of the ResetDBClusterParameterGroup operation returned by the service. - `com.amazonaws.services.docdb.model.ResetDBClusterParameterGroupResult`"
  (^com.amazonaws.services.docdb.model.ResetDBClusterParameterGroupResult [^AbstractAmazonDocDB this ^com.amazonaws.services.docdb.model.ResetDBClusterParameterGroupRequest request]
    (-> this (.resetDBClusterParameterGroup request))))

(defn modify-db-cluster
  "Description copied from interface: AmazonDocDB

  request - Represents the input to ModifyDBCluster. - `com.amazonaws.services.docdb.model.ModifyDBClusterRequest`

  returns: Result of the ModifyDBCluster operation returned by the service. - `com.amazonaws.services.docdb.model.DBCluster`"
  (^com.amazonaws.services.docdb.model.DBCluster [^AbstractAmazonDocDB this ^com.amazonaws.services.docdb.model.ModifyDBClusterRequest request]
    (-> this (.modifyDBCluster request))))

(defn copy-db-cluster-parameter-group
  "Description copied from interface: AmazonDocDB

  request - Represents the input to CopyDBClusterParameterGroup. - `com.amazonaws.services.docdb.model.CopyDBClusterParameterGroupRequest`

  returns: Result of the CopyDBClusterParameterGroup operation returned by the service. - `com.amazonaws.services.docdb.model.DBClusterParameterGroup`"
  (^com.amazonaws.services.docdb.model.DBClusterParameterGroup [^AbstractAmazonDocDB this ^com.amazonaws.services.docdb.model.CopyDBClusterParameterGroupRequest request]
    (-> this (.copyDBClusterParameterGroup request))))

(defn copy-db-cluster-snapshot
  "Description copied from interface: AmazonDocDB

  request - Represents the input to CopyDBClusterSnapshot. - `com.amazonaws.services.docdb.model.CopyDBClusterSnapshotRequest`

  returns: Result of the CopyDBClusterSnapshot operation returned by the service. - `com.amazonaws.services.docdb.model.DBClusterSnapshot`"
  (^com.amazonaws.services.docdb.model.DBClusterSnapshot [^AbstractAmazonDocDB this ^com.amazonaws.services.docdb.model.CopyDBClusterSnapshotRequest request]
    (-> this (.copyDBClusterSnapshot request))))

(defn apply-pending-maintenance-action
  "Description copied from interface: AmazonDocDB

  request - Represents the input to ApplyPendingMaintenanceAction. - `com.amazonaws.services.docdb.model.ApplyPendingMaintenanceActionRequest`

  returns: Result of the ApplyPendingMaintenanceAction operation returned by the service. - `com.amazonaws.services.docdb.model.ResourcePendingMaintenanceActions`"
  (^com.amazonaws.services.docdb.model.ResourcePendingMaintenanceActions [^AbstractAmazonDocDB this ^com.amazonaws.services.docdb.model.ApplyPendingMaintenanceActionRequest request]
    (-> this (.applyPendingMaintenanceAction request))))

(defn start-db-cluster
  "Description copied from interface: AmazonDocDB

  request - `com.amazonaws.services.docdb.model.StartDBClusterRequest`

  returns: Result of the StartDBCluster operation returned by the service. - `com.amazonaws.services.docdb.model.DBCluster`"
  (^com.amazonaws.services.docdb.model.DBCluster [^AbstractAmazonDocDB this ^com.amazonaws.services.docdb.model.StartDBClusterRequest request]
    (-> this (.startDBCluster request))))

(defn create-db-subnet-group
  "Description copied from interface: AmazonDocDB

  request - Represents the input to CreateDBSubnetGroup. - `com.amazonaws.services.docdb.model.CreateDBSubnetGroupRequest`

  returns: Result of the CreateDBSubnetGroup operation returned by the service. - `com.amazonaws.services.docdb.model.DBSubnetGroup`"
  (^com.amazonaws.services.docdb.model.DBSubnetGroup [^AbstractAmazonDocDB this ^com.amazonaws.services.docdb.model.CreateDBSubnetGroupRequest request]
    (-> this (.createDBSubnetGroup request))))

