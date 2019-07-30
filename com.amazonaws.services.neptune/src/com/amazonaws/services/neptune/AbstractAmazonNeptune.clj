(ns com.amazonaws.services.neptune.AbstractAmazonNeptune
  "Abstract implementation of AmazonNeptune. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.neptune AbstractAmazonNeptune]))

(defn modify-db-cluster-snapshot-attribute
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.ModifyDBClusterSnapshotAttributeRequest`

  returns: Result of the ModifyDBClusterSnapshotAttribute operation returned by the service. - `com.amazonaws.services.neptune.model.DBClusterSnapshotAttributesResult`"
  (^com.amazonaws.services.neptune.model.DBClusterSnapshotAttributesResult [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.ModifyDBClusterSnapshotAttributeRequest request]
    (-> this (.modifyDBClusterSnapshotAttribute request))))

(defn create-db-instance
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.CreateDBInstanceRequest`

  returns: Result of the CreateDBInstance operation returned by the service. - `com.amazonaws.services.neptune.model.DBInstance`"
  (^com.amazonaws.services.neptune.model.DBInstance [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.CreateDBInstanceRequest request]
    (-> this (.createDBInstance request))))

(defn list-tags-for-resource
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.neptune.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.neptune.model.ListTagsForResourceResult [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn modify-db-subnet-group
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.ModifyDBSubnetGroupRequest`

  returns: Result of the ModifyDBSubnetGroup operation returned by the service. - `com.amazonaws.services.neptune.model.DBSubnetGroup`"
  (^com.amazonaws.services.neptune.model.DBSubnetGroup [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.ModifyDBSubnetGroupRequest request]
    (-> this (.modifyDBSubnetGroup request))))

(defn describe-db-cluster-snapshot-attributes
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.DescribeDBClusterSnapshotAttributesRequest`

  returns: Result of the DescribeDBClusterSnapshotAttributes operation returned by the service. - `com.amazonaws.services.neptune.model.DBClusterSnapshotAttributesResult`"
  (^com.amazonaws.services.neptune.model.DBClusterSnapshotAttributesResult [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.DescribeDBClusterSnapshotAttributesRequest request]
    (-> this (.describeDBClusterSnapshotAttributes request))))

(defn describe-db-subnet-groups
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.DescribeDBSubnetGroupsRequest`

  returns: Result of the DescribeDBSubnetGroups operation returned by the service. - `com.amazonaws.services.neptune.model.DescribeDBSubnetGroupsResult`"
  (^com.amazonaws.services.neptune.model.DescribeDBSubnetGroupsResult [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.DescribeDBSubnetGroupsRequest request]
    (-> this (.describeDBSubnetGroups request))))

(defn reboot-db-instance
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.RebootDBInstanceRequest`

  returns: Result of the RebootDBInstance operation returned by the service. - `com.amazonaws.services.neptune.model.DBInstance`"
  (^com.amazonaws.services.neptune.model.DBInstance [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.RebootDBInstanceRequest request]
    (-> this (.rebootDBInstance request))))

(defn copy-db-parameter-group
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.CopyDBParameterGroupRequest`

  returns: Result of the CopyDBParameterGroup operation returned by the service. - `com.amazonaws.services.neptune.model.DBParameterGroup`"
  (^com.amazonaws.services.neptune.model.DBParameterGroup [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.CopyDBParameterGroupRequest request]
    (-> this (.copyDBParameterGroup request))))

(defn delete-db-cluster-snapshot
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.DeleteDBClusterSnapshotRequest`

  returns: Result of the DeleteDBClusterSnapshot operation returned by the service. - `com.amazonaws.services.neptune.model.DBClusterSnapshot`"
  (^com.amazonaws.services.neptune.model.DBClusterSnapshot [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.DeleteDBClusterSnapshotRequest request]
    (-> this (.deleteDBClusterSnapshot request))))

(defn create-event-subscription
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.CreateEventSubscriptionRequest`

  returns: Result of the CreateEventSubscription operation returned by the service. - `com.amazonaws.services.neptune.model.EventSubscription`"
  (^com.amazonaws.services.neptune.model.EventSubscription [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.CreateEventSubscriptionRequest request]
    (-> this (.createEventSubscription request))))

(defn waiters
  "returns: `com.amazonaws.services.neptune.waiters.AmazonNeptuneWaiters`"
  (^com.amazonaws.services.neptune.waiters.AmazonNeptuneWaiters [^AbstractAmazonNeptune this]
    (-> this (.waiters))))

(defn describe-event-subscriptions
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.DescribeEventSubscriptionsRequest`

  returns: Result of the DescribeEventSubscriptions operation returned by the service. - `com.amazonaws.services.neptune.model.DescribeEventSubscriptionsResult`"
  (^com.amazonaws.services.neptune.model.DescribeEventSubscriptionsResult [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.DescribeEventSubscriptionsRequest request]
    (-> this (.describeEventSubscriptions request))))

(defn promote-read-replica-db-cluster
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.PromoteReadReplicaDBClusterRequest`

  returns: Result of the PromoteReadReplicaDBCluster operation returned by the service. - `com.amazonaws.services.neptune.model.DBCluster`"
  (^com.amazonaws.services.neptune.model.DBCluster [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.PromoteReadReplicaDBClusterRequest request]
    (-> this (.promoteReadReplicaDBCluster request))))

(defn delete-db-cluster-parameter-group
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.DeleteDBClusterParameterGroupRequest`

  returns: Result of the DeleteDBClusterParameterGroup operation returned by the service. - `com.amazonaws.services.neptune.model.DeleteDBClusterParameterGroupResult`"
  (^com.amazonaws.services.neptune.model.DeleteDBClusterParameterGroupResult [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.DeleteDBClusterParameterGroupRequest request]
    (-> this (.deleteDBClusterParameterGroup request))))

(defn describe-engine-default-cluster-parameters
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.DescribeEngineDefaultClusterParametersRequest`

  returns: Result of the DescribeEngineDefaultClusterParameters operation returned by the service. - `com.amazonaws.services.neptune.model.EngineDefaults`"
  (^com.amazonaws.services.neptune.model.EngineDefaults [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.DescribeEngineDefaultClusterParametersRequest request]
    (-> this (.describeEngineDefaultClusterParameters request))))

(defn describe-pending-maintenance-actions
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.DescribePendingMaintenanceActionsRequest`

  returns: Result of the DescribePendingMaintenanceActions operation returned by the service. - `com.amazonaws.services.neptune.model.DescribePendingMaintenanceActionsResult`"
  (^com.amazonaws.services.neptune.model.DescribePendingMaintenanceActionsResult [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.DescribePendingMaintenanceActionsRequest request]
    (-> this (.describePendingMaintenanceActions request))))

(defn failover-db-cluster
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.FailoverDBClusterRequest`

  returns: Result of the FailoverDBCluster operation returned by the service. - `com.amazonaws.services.neptune.model.DBCluster`"
  (^com.amazonaws.services.neptune.model.DBCluster [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.FailoverDBClusterRequest request]
    (-> this (.failoverDBCluster request))))

(defn modify-db-instance
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.ModifyDBInstanceRequest`

  returns: Result of the ModifyDBInstance operation returned by the service. - `com.amazonaws.services.neptune.model.DBInstance`"
  (^com.amazonaws.services.neptune.model.DBInstance [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.ModifyDBInstanceRequest request]
    (-> this (.modifyDBInstance request))))

(defn create-db-cluster
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.CreateDBClusterRequest`

  returns: Result of the CreateDBCluster operation returned by the service. - `com.amazonaws.services.neptune.model.DBCluster`"
  (^com.amazonaws.services.neptune.model.DBCluster [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.CreateDBClusterRequest request]
    (-> this (.createDBCluster request))))

(defn describe-valid-db-instance-modifications
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.DescribeValidDBInstanceModificationsRequest`

  returns: Result of the DescribeValidDBInstanceModifications operation returned by the service. - `com.amazonaws.services.neptune.model.ValidDBInstanceModificationsMessage`"
  (^com.amazonaws.services.neptune.model.ValidDBInstanceModificationsMessage [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.DescribeValidDBInstanceModificationsRequest request]
    (-> this (.describeValidDBInstanceModifications request))))

(defn delete-db-instance
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.DeleteDBInstanceRequest`

  returns: Result of the DeleteDBInstance operation returned by the service. - `com.amazonaws.services.neptune.model.DBInstance`"
  (^com.amazonaws.services.neptune.model.DBInstance [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.DeleteDBInstanceRequest request]
    (-> this (.deleteDBInstance request))))

(defn delete-db-subnet-group
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.DeleteDBSubnetGroupRequest`

  returns: Result of the DeleteDBSubnetGroup operation returned by the service. - `com.amazonaws.services.neptune.model.DeleteDBSubnetGroupResult`"
  (^com.amazonaws.services.neptune.model.DeleteDBSubnetGroupResult [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.DeleteDBSubnetGroupRequest request]
    (-> this (.deleteDBSubnetGroup request))))

(defn restore-db-cluster-to-point-in-time
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.RestoreDBClusterToPointInTimeRequest`

  returns: Result of the RestoreDBClusterToPointInTime operation returned by the service. - `com.amazonaws.services.neptune.model.DBCluster`"
  (^com.amazonaws.services.neptune.model.DBCluster [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.RestoreDBClusterToPointInTimeRequest request]
    (-> this (.restoreDBClusterToPointInTime request))))

(defn add-role-to-db-cluster
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.AddRoleToDBClusterRequest`

  returns: Result of the AddRoleToDBCluster operation returned by the service. - `com.amazonaws.services.neptune.model.AddRoleToDBClusterResult`"
  (^com.amazonaws.services.neptune.model.AddRoleToDBClusterResult [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.AddRoleToDBClusterRequest request]
    (-> this (.addRoleToDBCluster request))))

(defn delete-db-cluster
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.DeleteDBClusterRequest`

  returns: Result of the DeleteDBCluster operation returned by the service. - `com.amazonaws.services.neptune.model.DBCluster`"
  (^com.amazonaws.services.neptune.model.DBCluster [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.DeleteDBClusterRequest request]
    (-> this (.deleteDBCluster request))))

(defn modify-event-subscription
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.ModifyEventSubscriptionRequest`

  returns: Result of the ModifyEventSubscription operation returned by the service. - `com.amazonaws.services.neptune.model.EventSubscription`"
  (^com.amazonaws.services.neptune.model.EventSubscription [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.ModifyEventSubscriptionRequest request]
    (-> this (.modifyEventSubscription request))))

(defn create-db-parameter-group
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.CreateDBParameterGroupRequest`

  returns: Result of the CreateDBParameterGroup operation returned by the service. - `com.amazonaws.services.neptune.model.DBParameterGroup`"
  (^com.amazonaws.services.neptune.model.DBParameterGroup [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.CreateDBParameterGroupRequest request]
    (-> this (.createDBParameterGroup request))))

(defn create-db-cluster-snapshot
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.CreateDBClusterSnapshotRequest`

  returns: Result of the CreateDBClusterSnapshot operation returned by the service. - `com.amazonaws.services.neptune.model.DBClusterSnapshot`"
  (^com.amazonaws.services.neptune.model.DBClusterSnapshot [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.CreateDBClusterSnapshotRequest request]
    (-> this (.createDBClusterSnapshot request))))

(defn shutdown
  "Description copied from interface: AmazonNeptune"
  ([^AbstractAmazonNeptune this]
    (-> this (.shutdown))))

(defn describe-events
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.DescribeEventsRequest`

  returns: Result of the DescribeEvents operation returned by the service. - `com.amazonaws.services.neptune.model.DescribeEventsResult`"
  (^com.amazonaws.services.neptune.model.DescribeEventsResult [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.DescribeEventsRequest request]
    (-> this (.describeEvents request))))

(defn remove-role-from-db-cluster
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.RemoveRoleFromDBClusterRequest`

  returns: Result of the RemoveRoleFromDBCluster operation returned by the service. - `com.amazonaws.services.neptune.model.RemoveRoleFromDBClusterResult`"
  (^com.amazonaws.services.neptune.model.RemoveRoleFromDBClusterResult [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.RemoveRoleFromDBClusterRequest request]
    (-> this (.removeRoleFromDBCluster request))))

(defn describe-event-categories
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.DescribeEventCategoriesRequest`

  returns: Result of the DescribeEventCategories operation returned by the service. - `com.amazonaws.services.neptune.model.DescribeEventCategoriesResult`"
  (^com.amazonaws.services.neptune.model.DescribeEventCategoriesResult [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.DescribeEventCategoriesRequest request]
    (-> this (.describeEventCategories request))))

(defn describe-db-engine-versions
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.DescribeDBEngineVersionsRequest`

  returns: Result of the DescribeDBEngineVersions operation returned by the service. - `com.amazonaws.services.neptune.model.DescribeDBEngineVersionsResult`"
  (^com.amazonaws.services.neptune.model.DescribeDBEngineVersionsResult [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.DescribeDBEngineVersionsRequest request]
    (-> this (.describeDBEngineVersions request))))

(defn describe-db-parameters
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.DescribeDBParametersRequest`

  returns: Result of the DescribeDBParameters operation returned by the service. - `com.amazonaws.services.neptune.model.DescribeDBParametersResult`"
  (^com.amazonaws.services.neptune.model.DescribeDBParametersResult [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.DescribeDBParametersRequest request]
    (-> this (.describeDBParameters request))))

(defn delete-event-subscription
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.DeleteEventSubscriptionRequest`

  returns: Result of the DeleteEventSubscription operation returned by the service. - `com.amazonaws.services.neptune.model.EventSubscription`"
  (^com.amazonaws.services.neptune.model.EventSubscription [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.DeleteEventSubscriptionRequest request]
    (-> this (.deleteEventSubscription request))))

(defn create-db-cluster-parameter-group
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.CreateDBClusterParameterGroupRequest`

  returns: Result of the CreateDBClusterParameterGroup operation returned by the service. - `com.amazonaws.services.neptune.model.DBClusterParameterGroup`"
  (^com.amazonaws.services.neptune.model.DBClusterParameterGroup [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.CreateDBClusterParameterGroupRequest request]
    (-> this (.createDBClusterParameterGroup request))))

(defn describe-db-parameter-groups
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.DescribeDBParameterGroupsRequest`

  returns: Result of the DescribeDBParameterGroups operation returned by the service. - `com.amazonaws.services.neptune.model.DescribeDBParameterGroupsResult`"
  (^com.amazonaws.services.neptune.model.DescribeDBParameterGroupsResult [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.DescribeDBParameterGroupsRequest request]
    (-> this (.describeDBParameterGroups request))))

(defn describe-db-cluster-parameter-groups
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.DescribeDBClusterParameterGroupsRequest`

  returns: Result of the DescribeDBClusterParameterGroups operation returned by the service. - `com.amazonaws.services.neptune.model.DescribeDBClusterParameterGroupsResult`"
  (^com.amazonaws.services.neptune.model.DescribeDBClusterParameterGroupsResult [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.DescribeDBClusterParameterGroupsRequest request]
    (-> this (.describeDBClusterParameterGroups request))))

(defn describe-db-instances
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.DescribeDBInstancesRequest`

  returns: Result of the DescribeDBInstances operation returned by the service. - `com.amazonaws.services.neptune.model.DescribeDBInstancesResult`"
  (^com.amazonaws.services.neptune.model.DescribeDBInstancesResult [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.DescribeDBInstancesRequest request]
    (-> this (.describeDBInstances request))))

(defn describe-engine-default-parameters
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.DescribeEngineDefaultParametersRequest`

  returns: Result of the DescribeEngineDefaultParameters operation returned by the service. - `com.amazonaws.services.neptune.model.EngineDefaults`"
  (^com.amazonaws.services.neptune.model.EngineDefaults [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.DescribeEngineDefaultParametersRequest request]
    (-> this (.describeEngineDefaultParameters request))))

(defn remove-tags-from-resource
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.RemoveTagsFromResourceRequest`

  returns: Result of the RemoveTagsFromResource operation returned by the service. - `com.amazonaws.services.neptune.model.RemoveTagsFromResourceResult`"
  (^com.amazonaws.services.neptune.model.RemoveTagsFromResourceResult [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.RemoveTagsFromResourceRequest request]
    (-> this (.removeTagsFromResource request))))

(defn remove-source-identifier-from-subscription
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.RemoveSourceIdentifierFromSubscriptionRequest`

  returns: Result of the RemoveSourceIdentifierFromSubscription operation returned by the service. - `com.amazonaws.services.neptune.model.EventSubscription`"
  (^com.amazonaws.services.neptune.model.EventSubscription [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.RemoveSourceIdentifierFromSubscriptionRequest request]
    (-> this (.removeSourceIdentifierFromSubscription request))))

(defn reset-db-parameter-group
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.ResetDBParameterGroupRequest`

  returns: Result of the ResetDBParameterGroup operation returned by the service. - `com.amazonaws.services.neptune.model.ResetDBParameterGroupResult`"
  (^com.amazonaws.services.neptune.model.ResetDBParameterGroupResult [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.ResetDBParameterGroupRequest request]
    (-> this (.resetDBParameterGroup request))))

(defn describe-db-cluster-snapshots
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.DescribeDBClusterSnapshotsRequest`

  returns: Result of the DescribeDBClusterSnapshots operation returned by the service. - `com.amazonaws.services.neptune.model.DescribeDBClusterSnapshotsResult`"
  (^com.amazonaws.services.neptune.model.DescribeDBClusterSnapshotsResult [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.DescribeDBClusterSnapshotsRequest request]
    (-> this (.describeDBClusterSnapshots request))))

(defn delete-db-parameter-group
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.DeleteDBParameterGroupRequest`

  returns: Result of the DeleteDBParameterGroup operation returned by the service. - `com.amazonaws.services.neptune.model.DeleteDBParameterGroupResult`"
  (^com.amazonaws.services.neptune.model.DeleteDBParameterGroupResult [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.DeleteDBParameterGroupRequest request]
    (-> this (.deleteDBParameterGroup request))))

(defn describe-orderable-db-instance-options
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.DescribeOrderableDBInstanceOptionsRequest`

  returns: Result of the DescribeOrderableDBInstanceOptions operation returned by the service. - `com.amazonaws.services.neptune.model.DescribeOrderableDBInstanceOptionsResult`"
  (^com.amazonaws.services.neptune.model.DescribeOrderableDBInstanceOptionsResult [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.DescribeOrderableDBInstanceOptionsRequest request]
    (-> this (.describeOrderableDBInstanceOptions request))))

(defn describe-db-cluster-parameters
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.DescribeDBClusterParametersRequest`

  returns: Result of the DescribeDBClusterParameters operation returned by the service. - `com.amazonaws.services.neptune.model.DescribeDBClusterParametersResult`"
  (^com.amazonaws.services.neptune.model.DescribeDBClusterParametersResult [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.DescribeDBClusterParametersRequest request]
    (-> this (.describeDBClusterParameters request))))

(defn restore-db-cluster-from-snapshot
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.RestoreDBClusterFromSnapshotRequest`

  returns: Result of the RestoreDBClusterFromSnapshot operation returned by the service. - `com.amazonaws.services.neptune.model.DBCluster`"
  (^com.amazonaws.services.neptune.model.DBCluster [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.RestoreDBClusterFromSnapshotRequest request]
    (-> this (.restoreDBClusterFromSnapshot request))))

(defn describe-db-clusters
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.DescribeDBClustersRequest`

  returns: Result of the DescribeDBClusters operation returned by the service. - `com.amazonaws.services.neptune.model.DescribeDBClustersResult`"
  (^com.amazonaws.services.neptune.model.DescribeDBClustersResult [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.DescribeDBClustersRequest request]
    (-> this (.describeDBClusters request))))

(defn add-tags-to-resource
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.AddTagsToResourceRequest`

  returns: Result of the AddTagsToResource operation returned by the service. - `com.amazonaws.services.neptune.model.AddTagsToResourceResult`"
  (^com.amazonaws.services.neptune.model.AddTagsToResourceResult [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.AddTagsToResourceRequest request]
    (-> this (.addTagsToResource request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonNeptune

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonNeptune this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn add-source-identifier-to-subscription
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.AddSourceIdentifierToSubscriptionRequest`

  returns: Result of the AddSourceIdentifierToSubscription operation returned by the service. - `com.amazonaws.services.neptune.model.EventSubscription`"
  (^com.amazonaws.services.neptune.model.EventSubscription [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.AddSourceIdentifierToSubscriptionRequest request]
    (-> this (.addSourceIdentifierToSubscription request))))

(defn modify-db-cluster-parameter-group
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.ModifyDBClusterParameterGroupRequest`

  returns: Result of the ModifyDBClusterParameterGroup operation returned by the service. - `com.amazonaws.services.neptune.model.ModifyDBClusterParameterGroupResult`"
  (^com.amazonaws.services.neptune.model.ModifyDBClusterParameterGroupResult [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.ModifyDBClusterParameterGroupRequest request]
    (-> this (.modifyDBClusterParameterGroup request))))

(defn modify-db-parameter-group
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.ModifyDBParameterGroupRequest`

  returns: Result of the ModifyDBParameterGroup operation returned by the service. - `com.amazonaws.services.neptune.model.ModifyDBParameterGroupResult`"
  (^com.amazonaws.services.neptune.model.ModifyDBParameterGroupResult [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.ModifyDBParameterGroupRequest request]
    (-> this (.modifyDBParameterGroup request))))

(defn reset-db-cluster-parameter-group
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.ResetDBClusterParameterGroupRequest`

  returns: Result of the ResetDBClusterParameterGroup operation returned by the service. - `com.amazonaws.services.neptune.model.ResetDBClusterParameterGroupResult`"
  (^com.amazonaws.services.neptune.model.ResetDBClusterParameterGroupResult [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.ResetDBClusterParameterGroupRequest request]
    (-> this (.resetDBClusterParameterGroup request))))

(defn modify-db-cluster
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.ModifyDBClusterRequest`

  returns: Result of the ModifyDBCluster operation returned by the service. - `com.amazonaws.services.neptune.model.DBCluster`"
  (^com.amazonaws.services.neptune.model.DBCluster [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.ModifyDBClusterRequest request]
    (-> this (.modifyDBCluster request))))

(defn copy-db-cluster-parameter-group
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.CopyDBClusterParameterGroupRequest`

  returns: Result of the CopyDBClusterParameterGroup operation returned by the service. - `com.amazonaws.services.neptune.model.DBClusterParameterGroup`"
  (^com.amazonaws.services.neptune.model.DBClusterParameterGroup [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.CopyDBClusterParameterGroupRequest request]
    (-> this (.copyDBClusterParameterGroup request))))

(defn copy-db-cluster-snapshot
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.CopyDBClusterSnapshotRequest`

  returns: Result of the CopyDBClusterSnapshot operation returned by the service. - `com.amazonaws.services.neptune.model.DBClusterSnapshot`"
  (^com.amazonaws.services.neptune.model.DBClusterSnapshot [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.CopyDBClusterSnapshotRequest request]
    (-> this (.copyDBClusterSnapshot request))))

(defn apply-pending-maintenance-action
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.ApplyPendingMaintenanceActionRequest`

  returns: Result of the ApplyPendingMaintenanceAction operation returned by the service. - `com.amazonaws.services.neptune.model.ResourcePendingMaintenanceActions`"
  (^com.amazonaws.services.neptune.model.ResourcePendingMaintenanceActions [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.ApplyPendingMaintenanceActionRequest request]
    (-> this (.applyPendingMaintenanceAction request))))

(defn create-db-subnet-group
  "Description copied from interface: AmazonNeptune

  request - `com.amazonaws.services.neptune.model.CreateDBSubnetGroupRequest`

  returns: Result of the CreateDBSubnetGroup operation returned by the service. - `com.amazonaws.services.neptune.model.DBSubnetGroup`"
  (^com.amazonaws.services.neptune.model.DBSubnetGroup [^AbstractAmazonNeptune this ^com.amazonaws.services.neptune.model.CreateDBSubnetGroupRequest request]
    (-> this (.createDBSubnetGroup request))))

