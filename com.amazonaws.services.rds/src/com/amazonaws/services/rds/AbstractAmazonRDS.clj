(ns com.amazonaws.services.rds.AbstractAmazonRDS
  "Abstract implementation of AmazonRDS. Convenient method forms pass through to the corresponding overload that
  takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.rds AbstractAmazonRDS]))

(defn create-db-cluster-endpoint
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.CreateDBClusterEndpointRequest`

  returns: Result of the CreateDBClusterEndpoint operation returned by the service. - `com.amazonaws.services.rds.model.CreateDBClusterEndpointResult`"
  (^com.amazonaws.services.rds.model.CreateDBClusterEndpointResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.CreateDBClusterEndpointRequest request]
    (-> this (.createDBClusterEndpoint request))))

(defn stop-db-cluster
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.StopDBClusterRequest`

  returns: Result of the StopDBCluster operation returned by the service. - `com.amazonaws.services.rds.model.DBCluster`"
  (^com.amazonaws.services.rds.model.DBCluster [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.StopDBClusterRequest request]
    (-> this (.stopDBCluster request))))

(defn modify-db-cluster-snapshot-attribute
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.ModifyDBClusterSnapshotAttributeRequest`

  returns: Result of the ModifyDBClusterSnapshotAttribute operation returned by the service. - `com.amazonaws.services.rds.model.DBClusterSnapshotAttributesResult`"
  (^com.amazonaws.services.rds.model.DBClusterSnapshotAttributesResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.ModifyDBClusterSnapshotAttributeRequest request]
    (-> this (.modifyDBClusterSnapshotAttribute request))))

(defn create-db-instance
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.CreateDBInstanceRequest`

  returns: Result of the CreateDBInstance operation returned by the service. - `com.amazonaws.services.rds.model.DBInstance`"
  (^com.amazonaws.services.rds.model.DBInstance [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.CreateDBInstanceRequest request]
    (-> this (.createDBInstance request))))

(defn list-tags-for-resource
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.rds.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.rds.model.ListTagsForResourceResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn modify-db-snapshot-attribute
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.ModifyDBSnapshotAttributeRequest`

  returns: Result of the ModifyDBSnapshotAttribute operation returned by the service. - `com.amazonaws.services.rds.model.DBSnapshotAttributesResult`"
  (^com.amazonaws.services.rds.model.DBSnapshotAttributesResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.ModifyDBSnapshotAttributeRequest request]
    (-> this (.modifyDBSnapshotAttribute request))))

(defn describe-db-security-groups
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DescribeDBSecurityGroupsRequest`

  returns: Result of the DescribeDBSecurityGroups operation returned by the service. - `com.amazonaws.services.rds.model.DescribeDBSecurityGroupsResult`"
  (^com.amazonaws.services.rds.model.DescribeDBSecurityGroupsResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DescribeDBSecurityGroupsRequest request]
    (-> this (.describeDBSecurityGroups request)))
  (^com.amazonaws.services.rds.model.DescribeDBSecurityGroupsResult [^AbstractAmazonRDS this]
    (-> this (.describeDBSecurityGroups))))

(defn stop-db-instance
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.StopDBInstanceRequest`

  returns: Result of the StopDBInstance operation returned by the service. - `com.amazonaws.services.rds.model.DBInstance`"
  (^com.amazonaws.services.rds.model.DBInstance [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.StopDBInstanceRequest request]
    (-> this (.stopDBInstance request))))

(defn modify-db-subnet-group
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.ModifyDBSubnetGroupRequest`

  returns: Result of the ModifyDBSubnetGroup operation returned by the service. - `com.amazonaws.services.rds.model.DBSubnetGroup`"
  (^com.amazonaws.services.rds.model.DBSubnetGroup [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.ModifyDBSubnetGroupRequest request]
    (-> this (.modifyDBSubnetGroup request))))

(defn stop-activity-stream
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.StopActivityStreamRequest`

  returns: Result of the StopActivityStream operation returned by the service. - `com.amazonaws.services.rds.model.StopActivityStreamResult`"
  (^com.amazonaws.services.rds.model.StopActivityStreamResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.StopActivityStreamRequest request]
    (-> this (.stopActivityStream request))))

(defn describe-db-cluster-snapshot-attributes
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DescribeDBClusterSnapshotAttributesRequest`

  returns: Result of the DescribeDBClusterSnapshotAttributes operation returned by the service. - `com.amazonaws.services.rds.model.DBClusterSnapshotAttributesResult`"
  (^com.amazonaws.services.rds.model.DBClusterSnapshotAttributesResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DescribeDBClusterSnapshotAttributesRequest request]
    (-> this (.describeDBClusterSnapshotAttributes request))))

(defn set-region
  "Description copied from interface: AmazonRDS

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonRDS this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn describe-db-subnet-groups
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DescribeDBSubnetGroupsRequest`

  returns: Result of the DescribeDBSubnetGroups operation returned by the service. - `com.amazonaws.services.rds.model.DescribeDBSubnetGroupsResult`"
  (^com.amazonaws.services.rds.model.DescribeDBSubnetGroupsResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DescribeDBSubnetGroupsRequest request]
    (-> this (.describeDBSubnetGroups request)))
  (^com.amazonaws.services.rds.model.DescribeDBSubnetGroupsResult [^AbstractAmazonRDS this]
    (-> this (.describeDBSubnetGroups))))

(defn reboot-db-instance
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.RebootDBInstanceRequest`

  returns: Result of the RebootDBInstance operation returned by the service. - `com.amazonaws.services.rds.model.DBInstance`"
  (^com.amazonaws.services.rds.model.DBInstance [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.RebootDBInstanceRequest request]
    (-> this (.rebootDBInstance request))))

(defn copy-db-parameter-group
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.CopyDBParameterGroupRequest`

  returns: Result of the CopyDBParameterGroup operation returned by the service. - `com.amazonaws.services.rds.model.DBParameterGroup`"
  (^com.amazonaws.services.rds.model.DBParameterGroup [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.CopyDBParameterGroupRequest request]
    (-> this (.copyDBParameterGroup request))))

(defn delete-db-cluster-snapshot
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DeleteDBClusterSnapshotRequest`

  returns: Result of the DeleteDBClusterSnapshot operation returned by the service. - `com.amazonaws.services.rds.model.DBClusterSnapshot`"
  (^com.amazonaws.services.rds.model.DBClusterSnapshot [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DeleteDBClusterSnapshotRequest request]
    (-> this (.deleteDBClusterSnapshot request))))

(defn create-db-security-group
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.CreateDBSecurityGroupRequest`

  returns: Result of the CreateDBSecurityGroup operation returned by the service. - `com.amazonaws.services.rds.model.DBSecurityGroup`"
  (^com.amazonaws.services.rds.model.DBSecurityGroup [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.CreateDBSecurityGroupRequest request]
    (-> this (.createDBSecurityGroup request))))

(defn create-event-subscription
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.CreateEventSubscriptionRequest`

  returns: Result of the CreateEventSubscription operation returned by the service. - `com.amazonaws.services.rds.model.EventSubscription`"
  (^com.amazonaws.services.rds.model.EventSubscription [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.CreateEventSubscriptionRequest request]
    (-> this (.createEventSubscription request))))

(defn waiters
  "returns: `com.amazonaws.services.rds.waiters.AmazonRDSWaiters`"
  (^com.amazonaws.services.rds.waiters.AmazonRDSWaiters [^AbstractAmazonRDS this]
    (-> this (.waiters))))

(defn describe-event-subscriptions
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DescribeEventSubscriptionsRequest`

  returns: Result of the DescribeEventSubscriptions operation returned by the service. - `com.amazonaws.services.rds.model.DescribeEventSubscriptionsResult`"
  (^com.amazonaws.services.rds.model.DescribeEventSubscriptionsResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DescribeEventSubscriptionsRequest request]
    (-> this (.describeEventSubscriptions request)))
  (^com.amazonaws.services.rds.model.DescribeEventSubscriptionsResult [^AbstractAmazonRDS this]
    (-> this (.describeEventSubscriptions))))

(defn restore-db-instance-to-point-in-time
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.RestoreDBInstanceToPointInTimeRequest`

  returns: Result of the RestoreDBInstanceToPointInTime operation returned by the service. - `com.amazonaws.services.rds.model.DBInstance`"
  (^com.amazonaws.services.rds.model.DBInstance [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.RestoreDBInstanceToPointInTimeRequest request]
    (-> this (.restoreDBInstanceToPointInTime request))))

(defn delete-db-snapshot
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DeleteDBSnapshotRequest`

  returns: Result of the DeleteDBSnapshot operation returned by the service. - `com.amazonaws.services.rds.model.DBSnapshot`"
  (^com.amazonaws.services.rds.model.DBSnapshot [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DeleteDBSnapshotRequest request]
    (-> this (.deleteDBSnapshot request))))

(defn promote-read-replica-db-cluster
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.PromoteReadReplicaDBClusterRequest`

  returns: Result of the PromoteReadReplicaDBCluster operation returned by the service. - `com.amazonaws.services.rds.model.DBCluster`"
  (^com.amazonaws.services.rds.model.DBCluster [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.PromoteReadReplicaDBClusterRequest request]
    (-> this (.promoteReadReplicaDBCluster request))))

(defn delete-db-cluster-parameter-group
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DeleteDBClusterParameterGroupRequest`

  returns: Result of the DeleteDBClusterParameterGroup operation returned by the service. - `com.amazonaws.services.rds.model.DeleteDBClusterParameterGroupResult`"
  (^com.amazonaws.services.rds.model.DeleteDBClusterParameterGroupResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DeleteDBClusterParameterGroupRequest request]
    (-> this (.deleteDBClusterParameterGroup request))))

(defn describe-engine-default-cluster-parameters
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DescribeEngineDefaultClusterParametersRequest`

  returns: Result of the DescribeEngineDefaultClusterParameters operation returned by the service. - `com.amazonaws.services.rds.model.EngineDefaults`"
  (^com.amazonaws.services.rds.model.EngineDefaults [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DescribeEngineDefaultClusterParametersRequest request]
    (-> this (.describeEngineDefaultClusterParameters request))))

(defn describe-option-groups
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DescribeOptionGroupsRequest`

  returns: Result of the DescribeOptionGroups operation returned by the service. - `com.amazonaws.services.rds.model.DescribeOptionGroupsResult`"
  (^com.amazonaws.services.rds.model.DescribeOptionGroupsResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DescribeOptionGroupsRequest request]
    (-> this (.describeOptionGroups request)))
  (^com.amazonaws.services.rds.model.DescribeOptionGroupsResult [^AbstractAmazonRDS this]
    (-> this (.describeOptionGroups))))

(defn describe-pending-maintenance-actions
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DescribePendingMaintenanceActionsRequest`

  returns: Result of the DescribePendingMaintenanceActions operation returned by the service. - `com.amazonaws.services.rds.model.DescribePendingMaintenanceActionsResult`"
  (^com.amazonaws.services.rds.model.DescribePendingMaintenanceActionsResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DescribePendingMaintenanceActionsRequest request]
    (-> this (.describePendingMaintenanceActions request)))
  (^com.amazonaws.services.rds.model.DescribePendingMaintenanceActionsResult [^AbstractAmazonRDS this]
    (-> this (.describePendingMaintenanceActions))))

(defn failover-db-cluster
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.FailoverDBClusterRequest`

  returns: Result of the FailoverDBCluster operation returned by the service. - `com.amazonaws.services.rds.model.DBCluster`"
  (^com.amazonaws.services.rds.model.DBCluster [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.FailoverDBClusterRequest request]
    (-> this (.failoverDBCluster request)))
  (^com.amazonaws.services.rds.model.DBCluster [^AbstractAmazonRDS this]
    (-> this (.failoverDBCluster))))

(defn modify-db-instance
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.ModifyDBInstanceRequest`

  returns: Result of the ModifyDBInstance operation returned by the service. - `com.amazonaws.services.rds.model.DBInstance`"
  (^com.amazonaws.services.rds.model.DBInstance [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.ModifyDBInstanceRequest request]
    (-> this (.modifyDBInstance request))))

(defn create-db-instance-read-replica
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.CreateDBInstanceReadReplicaRequest`

  returns: Result of the CreateDBInstanceReadReplica operation returned by the service. - `com.amazonaws.services.rds.model.DBInstance`"
  (^com.amazonaws.services.rds.model.DBInstance [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.CreateDBInstanceReadReplicaRequest request]
    (-> this (.createDBInstanceReadReplica request))))

(defn create-db-snapshot
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.CreateDBSnapshotRequest`

  returns: Result of the CreateDBSnapshot operation returned by the service. - `com.amazonaws.services.rds.model.DBSnapshot`"
  (^com.amazonaws.services.rds.model.DBSnapshot [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.CreateDBSnapshotRequest request]
    (-> this (.createDBSnapshot request))))

(defn create-db-cluster
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.CreateDBClusterRequest`

  returns: Result of the CreateDBCluster operation returned by the service. - `com.amazonaws.services.rds.model.DBCluster`"
  (^com.amazonaws.services.rds.model.DBCluster [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.CreateDBClusterRequest request]
    (-> this (.createDBCluster request))))

(defn describe-source-regions
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DescribeSourceRegionsRequest`

  returns: Result of the DescribeSourceRegions operation returned by the service. - `com.amazonaws.services.rds.model.DescribeSourceRegionsResult`"
  (^com.amazonaws.services.rds.model.DescribeSourceRegionsResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DescribeSourceRegionsRequest request]
    (-> this (.describeSourceRegions request))))

(defn describe-db-snapshot-attributes
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DescribeDBSnapshotAttributesRequest`

  returns: Result of the DescribeDBSnapshotAttributes operation returned by the service. - `com.amazonaws.services.rds.model.DBSnapshotAttributesResult`"
  (^com.amazonaws.services.rds.model.DBSnapshotAttributesResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DescribeDBSnapshotAttributesRequest request]
    (-> this (.describeDBSnapshotAttributes request)))
  (^com.amazonaws.services.rds.model.DBSnapshotAttributesResult [^AbstractAmazonRDS this]
    (-> this (.describeDBSnapshotAttributes))))

(defn restore-db-cluster-from-s-3
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.RestoreDBClusterFromS3Request`

  returns: Result of the RestoreDBClusterFromS3 operation returned by the service. - `com.amazonaws.services.rds.model.DBCluster`"
  (^com.amazonaws.services.rds.model.DBCluster [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.RestoreDBClusterFromS3Request request]
    (-> this (.restoreDBClusterFromS3 request))))

(defn remove-role-from-db-instance
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.RemoveRoleFromDBInstanceRequest`

  returns: Result of the RemoveRoleFromDBInstance operation returned by the service. - `com.amazonaws.services.rds.model.RemoveRoleFromDBInstanceResult`"
  (^com.amazonaws.services.rds.model.RemoveRoleFromDBInstanceResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.RemoveRoleFromDBInstanceRequest request]
    (-> this (.removeRoleFromDBInstance request))))

(defn start-activity-stream
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.StartActivityStreamRequest`

  returns: Result of the StartActivityStream operation returned by the service. - `com.amazonaws.services.rds.model.StartActivityStreamResult`"
  (^com.amazonaws.services.rds.model.StartActivityStreamResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.StartActivityStreamRequest request]
    (-> this (.startActivityStream request))))

(defn describe-valid-db-instance-modifications
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DescribeValidDBInstanceModificationsRequest`

  returns: Result of the DescribeValidDBInstanceModifications operation returned by the service. - `com.amazonaws.services.rds.model.ValidDBInstanceModificationsMessage`"
  (^com.amazonaws.services.rds.model.ValidDBInstanceModificationsMessage [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DescribeValidDBInstanceModificationsRequest request]
    (-> this (.describeValidDBInstanceModifications request))))

(defn delete-db-instance
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DeleteDBInstanceRequest`

  returns: Result of the DeleteDBInstance operation returned by the service. - `com.amazonaws.services.rds.model.DBInstance`"
  (^com.amazonaws.services.rds.model.DBInstance [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DeleteDBInstanceRequest request]
    (-> this (.deleteDBInstance request))))

(defn describe-option-group-options
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DescribeOptionGroupOptionsRequest`

  returns: Result of the DescribeOptionGroupOptions operation returned by the service. - `com.amazonaws.services.rds.model.DescribeOptionGroupOptionsResult`"
  (^com.amazonaws.services.rds.model.DescribeOptionGroupOptionsResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DescribeOptionGroupOptionsRequest request]
    (-> this (.describeOptionGroupOptions request))))

(defn describe-certificates
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DescribeCertificatesRequest`

  returns: Result of the DescribeCertificates operation returned by the service. - `com.amazonaws.services.rds.model.DescribeCertificatesResult`"
  (^com.amazonaws.services.rds.model.DescribeCertificatesResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DescribeCertificatesRequest request]
    (-> this (.describeCertificates request)))
  (^com.amazonaws.services.rds.model.DescribeCertificatesResult [^AbstractAmazonRDS this]
    (-> this (.describeCertificates))))

(defn delete-db-subnet-group
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DeleteDBSubnetGroupRequest`

  returns: Result of the DeleteDBSubnetGroup operation returned by the service. - `com.amazonaws.services.rds.model.DeleteDBSubnetGroupResult`"
  (^com.amazonaws.services.rds.model.DeleteDBSubnetGroupResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DeleteDBSubnetGroupRequest request]
    (-> this (.deleteDBSubnetGroup request))))

(defn delete-option-group
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DeleteOptionGroupRequest`

  returns: Result of the DeleteOptionGroup operation returned by the service. - `com.amazonaws.services.rds.model.DeleteOptionGroupResult`"
  (^com.amazonaws.services.rds.model.DeleteOptionGroupResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DeleteOptionGroupRequest request]
    (-> this (.deleteOptionGroup request))))

(defn restore-db-cluster-to-point-in-time
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.RestoreDBClusterToPointInTimeRequest`

  returns: Result of the RestoreDBClusterToPointInTime operation returned by the service. - `com.amazonaws.services.rds.model.DBCluster`"
  (^com.amazonaws.services.rds.model.DBCluster [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.RestoreDBClusterToPointInTimeRequest request]
    (-> this (.restoreDBClusterToPointInTime request))))

(defn delete-db-instance-automated-backup
  "Description copied from interface: AmazonRDS

  request - Parameter input for the DeleteDBInstanceAutomatedBackup operation. - `com.amazonaws.services.rds.model.DeleteDBInstanceAutomatedBackupRequest`

  returns: Result of the DeleteDBInstanceAutomatedBackup operation returned by the service. - `com.amazonaws.services.rds.model.DBInstanceAutomatedBackup`"
  (^com.amazonaws.services.rds.model.DBInstanceAutomatedBackup [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DeleteDBInstanceAutomatedBackupRequest request]
    (-> this (.deleteDBInstanceAutomatedBackup request))))

(defn delete-global-cluster
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DeleteGlobalClusterRequest`

  returns: Result of the DeleteGlobalCluster operation returned by the service. - `com.amazonaws.services.rds.model.GlobalCluster`"
  (^com.amazonaws.services.rds.model.GlobalCluster [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DeleteGlobalClusterRequest request]
    (-> this (.deleteGlobalCluster request))))

(defn copy-db-snapshot
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.CopyDBSnapshotRequest`

  returns: Result of the CopyDBSnapshot operation returned by the service. - `com.amazonaws.services.rds.model.DBSnapshot`"
  (^com.amazonaws.services.rds.model.DBSnapshot [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.CopyDBSnapshotRequest request]
    (-> this (.copyDBSnapshot request))))

(defn add-role-to-db-cluster
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.AddRoleToDBClusterRequest`

  returns: Result of the AddRoleToDBCluster operation returned by the service. - `com.amazonaws.services.rds.model.AddRoleToDBClusterResult`"
  (^com.amazonaws.services.rds.model.AddRoleToDBClusterResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.AddRoleToDBClusterRequest request]
    (-> this (.addRoleToDBCluster request))))

(defn delete-db-cluster
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DeleteDBClusterRequest`

  returns: Result of the DeleteDBCluster operation returned by the service. - `com.amazonaws.services.rds.model.DBCluster`"
  (^com.amazonaws.services.rds.model.DBCluster [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DeleteDBClusterRequest request]
    (-> this (.deleteDBCluster request))))

(defn modify-current-db-cluster-capacity
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.ModifyCurrentDBClusterCapacityRequest`

  returns: Result of the ModifyCurrentDBClusterCapacity operation returned by the service. - `com.amazonaws.services.rds.model.ModifyCurrentDBClusterCapacityResult`"
  (^com.amazonaws.services.rds.model.ModifyCurrentDBClusterCapacityResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.ModifyCurrentDBClusterCapacityRequest request]
    (-> this (.modifyCurrentDBClusterCapacity request))))

(defn promote-read-replica
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.PromoteReadReplicaRequest`

  returns: Result of the PromoteReadReplica operation returned by the service. - `com.amazonaws.services.rds.model.DBInstance`"
  (^com.amazonaws.services.rds.model.DBInstance [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.PromoteReadReplicaRequest request]
    (-> this (.promoteReadReplica request))))

(defn copy-option-group
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.CopyOptionGroupRequest`

  returns: Result of the CopyOptionGroup operation returned by the service. - `com.amazonaws.services.rds.model.OptionGroup`"
  (^com.amazonaws.services.rds.model.OptionGroup [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.CopyOptionGroupRequest request]
    (-> this (.copyOptionGroup request))))

(defn modify-event-subscription
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.ModifyEventSubscriptionRequest`

  returns: Result of the ModifyEventSubscription operation returned by the service. - `com.amazonaws.services.rds.model.EventSubscription`"
  (^com.amazonaws.services.rds.model.EventSubscription [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.ModifyEventSubscriptionRequest request]
    (-> this (.modifyEventSubscription request))))

(defn create-db-parameter-group
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.CreateDBParameterGroupRequest`

  returns: Result of the CreateDBParameterGroup operation returned by the service. - `com.amazonaws.services.rds.model.DBParameterGroup`"
  (^com.amazonaws.services.rds.model.DBParameterGroup [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.CreateDBParameterGroupRequest request]
    (-> this (.createDBParameterGroup request))))

(defn create-db-cluster-snapshot
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.CreateDBClusterSnapshotRequest`

  returns: Result of the CreateDBClusterSnapshot operation returned by the service. - `com.amazonaws.services.rds.model.DBClusterSnapshot`"
  (^com.amazonaws.services.rds.model.DBClusterSnapshot [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.CreateDBClusterSnapshotRequest request]
    (-> this (.createDBClusterSnapshot request))))

(defn describe-account-attributes
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DescribeAccountAttributesRequest`

  returns: Result of the DescribeAccountAttributes operation returned by the service. - `com.amazonaws.services.rds.model.DescribeAccountAttributesResult`"
  (^com.amazonaws.services.rds.model.DescribeAccountAttributesResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DescribeAccountAttributesRequest request]
    (-> this (.describeAccountAttributes request)))
  (^com.amazonaws.services.rds.model.DescribeAccountAttributesResult [^AbstractAmazonRDS this]
    (-> this (.describeAccountAttributes))))

(defn shutdown
  "Description copied from interface: AmazonRDS"
  ([^AbstractAmazonRDS this]
    (-> this (.shutdown))))

(defn describe-events
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DescribeEventsRequest`

  returns: Result of the DescribeEvents operation returned by the service. - `com.amazonaws.services.rds.model.DescribeEventsResult`"
  (^com.amazonaws.services.rds.model.DescribeEventsResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DescribeEventsRequest request]
    (-> this (.describeEvents request)))
  (^com.amazonaws.services.rds.model.DescribeEventsResult [^AbstractAmazonRDS this]
    (-> this (.describeEvents))))

(defn describe-global-clusters
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DescribeGlobalClustersRequest`

  returns: Result of the DescribeGlobalClusters operation returned by the service. - `com.amazonaws.services.rds.model.DescribeGlobalClustersResult`"
  (^com.amazonaws.services.rds.model.DescribeGlobalClustersResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DescribeGlobalClustersRequest request]
    (-> this (.describeGlobalClusters request))))

(defn create-global-cluster
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.CreateGlobalClusterRequest`

  returns: Result of the CreateGlobalCluster operation returned by the service. - `com.amazonaws.services.rds.model.GlobalCluster`"
  (^com.amazonaws.services.rds.model.GlobalCluster [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.CreateGlobalClusterRequest request]
    (-> this (.createGlobalCluster request))))

(defn authorize-db-security-group-ingress
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.AuthorizeDBSecurityGroupIngressRequest`

  returns: Result of the AuthorizeDBSecurityGroupIngress operation returned by the service. - `com.amazonaws.services.rds.model.DBSecurityGroup`"
  (^com.amazonaws.services.rds.model.DBSecurityGroup [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.AuthorizeDBSecurityGroupIngressRequest request]
    (-> this (.authorizeDBSecurityGroupIngress request))))

(defn describe-db-instance-automated-backups
  "Description copied from interface: AmazonRDS

  request - Parameter input for DescribeDBInstanceAutomatedBackups. - `com.amazonaws.services.rds.model.DescribeDBInstanceAutomatedBackupsRequest`

  returns: Result of the DescribeDBInstanceAutomatedBackups operation returned by the service. - `com.amazonaws.services.rds.model.DescribeDBInstanceAutomatedBackupsResult`"
  (^com.amazonaws.services.rds.model.DescribeDBInstanceAutomatedBackupsResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DescribeDBInstanceAutomatedBackupsRequest request]
    (-> this (.describeDBInstanceAutomatedBackups request))))

(defn remove-role-from-db-cluster
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.RemoveRoleFromDBClusterRequest`

  returns: Result of the RemoveRoleFromDBCluster operation returned by the service. - `com.amazonaws.services.rds.model.RemoveRoleFromDBClusterResult`"
  (^com.amazonaws.services.rds.model.RemoveRoleFromDBClusterResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.RemoveRoleFromDBClusterRequest request]
    (-> this (.removeRoleFromDBCluster request))))

(defn set-endpoint
  "Description copied from interface: AmazonRDS

  endpoint - The endpoint (ex: \"rds.amazonaws.com\") or a full URL, including the protocol (ex: \"rds.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonRDS this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn modify-global-cluster
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.ModifyGlobalClusterRequest`

  returns: Result of the ModifyGlobalCluster operation returned by the service. - `com.amazonaws.services.rds.model.GlobalCluster`"
  (^com.amazonaws.services.rds.model.GlobalCluster [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.ModifyGlobalClusterRequest request]
    (-> this (.modifyGlobalCluster request))))

(defn start-db-instance
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.StartDBInstanceRequest`

  returns: Result of the StartDBInstance operation returned by the service. - `com.amazonaws.services.rds.model.DBInstance`"
  (^com.amazonaws.services.rds.model.DBInstance [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.StartDBInstanceRequest request]
    (-> this (.startDBInstance request))))

(defn delete-db-security-group
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DeleteDBSecurityGroupRequest`

  returns: Result of the DeleteDBSecurityGroup operation returned by the service. - `com.amazonaws.services.rds.model.DeleteDBSecurityGroupResult`"
  (^com.amazonaws.services.rds.model.DeleteDBSecurityGroupResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DeleteDBSecurityGroupRequest request]
    (-> this (.deleteDBSecurityGroup request))))

(defn download-db-log-file-portion
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DownloadDBLogFilePortionRequest`

  returns: Result of the DownloadDBLogFilePortion operation returned by the service. - `com.amazonaws.services.rds.model.DownloadDBLogFilePortionResult`"
  (^com.amazonaws.services.rds.model.DownloadDBLogFilePortionResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DownloadDBLogFilePortionRequest request]
    (-> this (.downloadDBLogFilePortion request))))

(defn describe-event-categories
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DescribeEventCategoriesRequest`

  returns: Result of the DescribeEventCategories operation returned by the service. - `com.amazonaws.services.rds.model.DescribeEventCategoriesResult`"
  (^com.amazonaws.services.rds.model.DescribeEventCategoriesResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DescribeEventCategoriesRequest request]
    (-> this (.describeEventCategories request)))
  (^com.amazonaws.services.rds.model.DescribeEventCategoriesResult [^AbstractAmazonRDS this]
    (-> this (.describeEventCategories))))

(defn remove-from-global-cluster
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.RemoveFromGlobalClusterRequest`

  returns: Result of the RemoveFromGlobalCluster operation returned by the service. - `com.amazonaws.services.rds.model.GlobalCluster`"
  (^com.amazonaws.services.rds.model.GlobalCluster [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.RemoveFromGlobalClusterRequest request]
    (-> this (.removeFromGlobalCluster request))))

(defn describe-db-engine-versions
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DescribeDBEngineVersionsRequest`

  returns: Result of the DescribeDBEngineVersions operation returned by the service. - `com.amazonaws.services.rds.model.DescribeDBEngineVersionsResult`"
  (^com.amazonaws.services.rds.model.DescribeDBEngineVersionsResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DescribeDBEngineVersionsRequest request]
    (-> this (.describeDBEngineVersions request)))
  (^com.amazonaws.services.rds.model.DescribeDBEngineVersionsResult [^AbstractAmazonRDS this]
    (-> this (.describeDBEngineVersions))))

(defn describe-db-parameters
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DescribeDBParametersRequest`

  returns: Result of the DescribeDBParameters operation returned by the service. - `com.amazonaws.services.rds.model.DescribeDBParametersResult`"
  (^com.amazonaws.services.rds.model.DescribeDBParametersResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DescribeDBParametersRequest request]
    (-> this (.describeDBParameters request))))

(defn delete-db-cluster-endpoint
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DeleteDBClusterEndpointRequest`

  returns: Result of the DeleteDBClusterEndpoint operation returned by the service. - `com.amazonaws.services.rds.model.DeleteDBClusterEndpointResult`"
  (^com.amazonaws.services.rds.model.DeleteDBClusterEndpointResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DeleteDBClusterEndpointRequest request]
    (-> this (.deleteDBClusterEndpoint request))))

(defn delete-event-subscription
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DeleteEventSubscriptionRequest`

  returns: Result of the DeleteEventSubscription operation returned by the service. - `com.amazonaws.services.rds.model.EventSubscription`"
  (^com.amazonaws.services.rds.model.EventSubscription [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DeleteEventSubscriptionRequest request]
    (-> this (.deleteEventSubscription request))))

(defn purchase-reserved-db-instances-offering
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.PurchaseReservedDBInstancesOfferingRequest`

  returns: Result of the PurchaseReservedDBInstancesOffering operation returned by the service. - `com.amazonaws.services.rds.model.ReservedDBInstance`"
  (^com.amazonaws.services.rds.model.ReservedDBInstance [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.PurchaseReservedDBInstancesOfferingRequest request]
    (-> this (.purchaseReservedDBInstancesOffering request))))

(defn create-db-cluster-parameter-group
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.CreateDBClusterParameterGroupRequest`

  returns: Result of the CreateDBClusterParameterGroup operation returned by the service. - `com.amazonaws.services.rds.model.DBClusterParameterGroup`"
  (^com.amazonaws.services.rds.model.DBClusterParameterGroup [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.CreateDBClusterParameterGroupRequest request]
    (-> this (.createDBClusterParameterGroup request))))

(defn modify-option-group
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.ModifyOptionGroupRequest`

  returns: Result of the ModifyOptionGroup operation returned by the service. - `com.amazonaws.services.rds.model.OptionGroup`"
  (^com.amazonaws.services.rds.model.OptionGroup [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.ModifyOptionGroupRequest request]
    (-> this (.modifyOptionGroup request))))

(defn describe-reserved-db-instances
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DescribeReservedDBInstancesRequest`

  returns: Result of the DescribeReservedDBInstances operation returned by the service. - `com.amazonaws.services.rds.model.DescribeReservedDBInstancesResult`"
  (^com.amazonaws.services.rds.model.DescribeReservedDBInstancesResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DescribeReservedDBInstancesRequest request]
    (-> this (.describeReservedDBInstances request)))
  (^com.amazonaws.services.rds.model.DescribeReservedDBInstancesResult [^AbstractAmazonRDS this]
    (-> this (.describeReservedDBInstances))))

(defn describe-db-parameter-groups
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DescribeDBParameterGroupsRequest`

  returns: Result of the DescribeDBParameterGroups operation returned by the service. - `com.amazonaws.services.rds.model.DescribeDBParameterGroupsResult`"
  (^com.amazonaws.services.rds.model.DescribeDBParameterGroupsResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DescribeDBParameterGroupsRequest request]
    (-> this (.describeDBParameterGroups request)))
  (^com.amazonaws.services.rds.model.DescribeDBParameterGroupsResult [^AbstractAmazonRDS this]
    (-> this (.describeDBParameterGroups))))

(defn describe-db-cluster-parameter-groups
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DescribeDBClusterParameterGroupsRequest`

  returns: Result of the DescribeDBClusterParameterGroups operation returned by the service. - `com.amazonaws.services.rds.model.DescribeDBClusterParameterGroupsResult`"
  (^com.amazonaws.services.rds.model.DescribeDBClusterParameterGroupsResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DescribeDBClusterParameterGroupsRequest request]
    (-> this (.describeDBClusterParameterGroups request)))
  (^com.amazonaws.services.rds.model.DescribeDBClusterParameterGroupsResult [^AbstractAmazonRDS this]
    (-> this (.describeDBClusterParameterGroups))))

(defn describe-reserved-db-instances-offerings
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DescribeReservedDBInstancesOfferingsRequest`

  returns: Result of the DescribeReservedDBInstancesOfferings operation returned by the service. - `com.amazonaws.services.rds.model.DescribeReservedDBInstancesOfferingsResult`"
  (^com.amazonaws.services.rds.model.DescribeReservedDBInstancesOfferingsResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DescribeReservedDBInstancesOfferingsRequest request]
    (-> this (.describeReservedDBInstancesOfferings request)))
  (^com.amazonaws.services.rds.model.DescribeReservedDBInstancesOfferingsResult [^AbstractAmazonRDS this]
    (-> this (.describeReservedDBInstancesOfferings))))

(defn restore-db-instance-from-s-3
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.RestoreDBInstanceFromS3Request`

  returns: Result of the RestoreDBInstanceFromS3 operation returned by the service. - `com.amazonaws.services.rds.model.DBInstance`"
  (^com.amazonaws.services.rds.model.DBInstance [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.RestoreDBInstanceFromS3Request request]
    (-> this (.restoreDBInstanceFromS3 request))))

(defn describe-db-instances
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DescribeDBInstancesRequest`

  returns: Result of the DescribeDBInstances operation returned by the service. - `com.amazonaws.services.rds.model.DescribeDBInstancesResult`"
  (^com.amazonaws.services.rds.model.DescribeDBInstancesResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DescribeDBInstancesRequest request]
    (-> this (.describeDBInstances request)))
  (^com.amazonaws.services.rds.model.DescribeDBInstancesResult [^AbstractAmazonRDS this]
    (-> this (.describeDBInstances))))

(defn describe-engine-default-parameters
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DescribeEngineDefaultParametersRequest`

  returns: Result of the DescribeEngineDefaultParameters operation returned by the service. - `com.amazonaws.services.rds.model.EngineDefaults`"
  (^com.amazonaws.services.rds.model.EngineDefaults [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DescribeEngineDefaultParametersRequest request]
    (-> this (.describeEngineDefaultParameters request))))

(defn remove-tags-from-resource
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.RemoveTagsFromResourceRequest`

  returns: Result of the RemoveTagsFromResource operation returned by the service. - `com.amazonaws.services.rds.model.RemoveTagsFromResourceResult`"
  (^com.amazonaws.services.rds.model.RemoveTagsFromResourceResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.RemoveTagsFromResourceRequest request]
    (-> this (.removeTagsFromResource request))))

(defn remove-source-identifier-from-subscription
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.RemoveSourceIdentifierFromSubscriptionRequest`

  returns: Result of the RemoveSourceIdentifierFromSubscription operation returned by the service. - `com.amazonaws.services.rds.model.EventSubscription`"
  (^com.amazonaws.services.rds.model.EventSubscription [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.RemoveSourceIdentifierFromSubscriptionRequest request]
    (-> this (.removeSourceIdentifierFromSubscription request))))

(defn describe-db-log-files
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DescribeDBLogFilesRequest`

  returns: Result of the DescribeDBLogFiles operation returned by the service. - `com.amazonaws.services.rds.model.DescribeDBLogFilesResult`"
  (^com.amazonaws.services.rds.model.DescribeDBLogFilesResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DescribeDBLogFilesRequest request]
    (-> this (.describeDBLogFiles request))))

(defn restore-db-instance-from-db-snapshot
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.RestoreDBInstanceFromDBSnapshotRequest`

  returns: Result of the RestoreDBInstanceFromDBSnapshot operation returned by the service. - `com.amazonaws.services.rds.model.DBInstance`"
  (^com.amazonaws.services.rds.model.DBInstance [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.RestoreDBInstanceFromDBSnapshotRequest request]
    (-> this (.restoreDBInstanceFromDBSnapshot request))))

(defn reset-db-parameter-group
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.ResetDBParameterGroupRequest`

  returns: Result of the ResetDBParameterGroup operation returned by the service. - `com.amazonaws.services.rds.model.ResetDBParameterGroupResult`"
  (^com.amazonaws.services.rds.model.ResetDBParameterGroupResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.ResetDBParameterGroupRequest request]
    (-> this (.resetDBParameterGroup request))))

(defn describe-db-cluster-snapshots
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DescribeDBClusterSnapshotsRequest`

  returns: Result of the DescribeDBClusterSnapshots operation returned by the service. - `com.amazonaws.services.rds.model.DescribeDBClusterSnapshotsResult`"
  (^com.amazonaws.services.rds.model.DescribeDBClusterSnapshotsResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DescribeDBClusterSnapshotsRequest request]
    (-> this (.describeDBClusterSnapshots request)))
  (^com.amazonaws.services.rds.model.DescribeDBClusterSnapshotsResult [^AbstractAmazonRDS this]
    (-> this (.describeDBClusterSnapshots))))

(defn revoke-db-security-group-ingress
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.RevokeDBSecurityGroupIngressRequest`

  returns: Result of the RevokeDBSecurityGroupIngress operation returned by the service. - `com.amazonaws.services.rds.model.DBSecurityGroup`"
  (^com.amazonaws.services.rds.model.DBSecurityGroup [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.RevokeDBSecurityGroupIngressRequest request]
    (-> this (.revokeDBSecurityGroupIngress request))))

(defn modify-db-snapshot
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.ModifyDBSnapshotRequest`

  returns: Result of the ModifyDBSnapshot operation returned by the service. - `com.amazonaws.services.rds.model.DBSnapshot`"
  (^com.amazonaws.services.rds.model.DBSnapshot [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.ModifyDBSnapshotRequest request]
    (-> this (.modifyDBSnapshot request))))

(defn delete-db-parameter-group
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DeleteDBParameterGroupRequest`

  returns: Result of the DeleteDBParameterGroup operation returned by the service. - `com.amazonaws.services.rds.model.DeleteDBParameterGroupResult`"
  (^com.amazonaws.services.rds.model.DeleteDBParameterGroupResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DeleteDBParameterGroupRequest request]
    (-> this (.deleteDBParameterGroup request))))

(defn describe-db-cluster-backtracks
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DescribeDBClusterBacktracksRequest`

  returns: Result of the DescribeDBClusterBacktracks operation returned by the service. - `com.amazonaws.services.rds.model.DescribeDBClusterBacktracksResult`"
  (^com.amazonaws.services.rds.model.DescribeDBClusterBacktracksResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DescribeDBClusterBacktracksRequest request]
    (-> this (.describeDBClusterBacktracks request))))

(defn describe-orderable-db-instance-options
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DescribeOrderableDBInstanceOptionsRequest`

  returns: Result of the DescribeOrderableDBInstanceOptions operation returned by the service. - `com.amazonaws.services.rds.model.DescribeOrderableDBInstanceOptionsResult`"
  (^com.amazonaws.services.rds.model.DescribeOrderableDBInstanceOptionsResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DescribeOrderableDBInstanceOptionsRequest request]
    (-> this (.describeOrderableDBInstanceOptions request))))

(defn describe-db-cluster-parameters
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DescribeDBClusterParametersRequest`

  returns: Result of the DescribeDBClusterParameters operation returned by the service. - `com.amazonaws.services.rds.model.DescribeDBClusterParametersResult`"
  (^com.amazonaws.services.rds.model.DescribeDBClusterParametersResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DescribeDBClusterParametersRequest request]
    (-> this (.describeDBClusterParameters request))))

(defn describe-db-cluster-endpoints
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DescribeDBClusterEndpointsRequest`

  returns: Result of the DescribeDBClusterEndpoints operation returned by the service. - `com.amazonaws.services.rds.model.DescribeDBClusterEndpointsResult`"
  (^com.amazonaws.services.rds.model.DescribeDBClusterEndpointsResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DescribeDBClusterEndpointsRequest request]
    (-> this (.describeDBClusterEndpoints request))))

(defn restore-db-cluster-from-snapshot
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.RestoreDBClusterFromSnapshotRequest`

  returns: Result of the RestoreDBClusterFromSnapshot operation returned by the service. - `com.amazonaws.services.rds.model.DBCluster`"
  (^com.amazonaws.services.rds.model.DBCluster [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.RestoreDBClusterFromSnapshotRequest request]
    (-> this (.restoreDBClusterFromSnapshot request))))

(defn describe-db-snapshots
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DescribeDBSnapshotsRequest`

  returns: Result of the DescribeDBSnapshots operation returned by the service. - `com.amazonaws.services.rds.model.DescribeDBSnapshotsResult`"
  (^com.amazonaws.services.rds.model.DescribeDBSnapshotsResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DescribeDBSnapshotsRequest request]
    (-> this (.describeDBSnapshots request)))
  (^com.amazonaws.services.rds.model.DescribeDBSnapshotsResult [^AbstractAmazonRDS this]
    (-> this (.describeDBSnapshots))))

(defn describe-db-clusters
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.DescribeDBClustersRequest`

  returns: Result of the DescribeDBClusters operation returned by the service. - `com.amazonaws.services.rds.model.DescribeDBClustersResult`"
  (^com.amazonaws.services.rds.model.DescribeDBClustersResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.DescribeDBClustersRequest request]
    (-> this (.describeDBClusters request)))
  (^com.amazonaws.services.rds.model.DescribeDBClustersResult [^AbstractAmazonRDS this]
    (-> this (.describeDBClusters))))

(defn add-tags-to-resource
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.AddTagsToResourceRequest`

  returns: Result of the AddTagsToResource operation returned by the service. - `com.amazonaws.services.rds.model.AddTagsToResourceResult`"
  (^com.amazonaws.services.rds.model.AddTagsToResourceResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.AddTagsToResourceRequest request]
    (-> this (.addTagsToResource request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonRDS

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonRDS this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn add-source-identifier-to-subscription
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.AddSourceIdentifierToSubscriptionRequest`

  returns: Result of the AddSourceIdentifierToSubscription operation returned by the service. - `com.amazonaws.services.rds.model.EventSubscription`"
  (^com.amazonaws.services.rds.model.EventSubscription [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.AddSourceIdentifierToSubscriptionRequest request]
    (-> this (.addSourceIdentifierToSubscription request))))

(defn create-option-group
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.CreateOptionGroupRequest`

  returns: Result of the CreateOptionGroup operation returned by the service. - `com.amazonaws.services.rds.model.OptionGroup`"
  (^com.amazonaws.services.rds.model.OptionGroup [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.CreateOptionGroupRequest request]
    (-> this (.createOptionGroup request))))

(defn modify-db-cluster-parameter-group
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.ModifyDBClusterParameterGroupRequest`

  returns: Result of the ModifyDBClusterParameterGroup operation returned by the service. - `com.amazonaws.services.rds.model.ModifyDBClusterParameterGroupResult`"
  (^com.amazonaws.services.rds.model.ModifyDBClusterParameterGroupResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.ModifyDBClusterParameterGroupRequest request]
    (-> this (.modifyDBClusterParameterGroup request))))

(defn add-role-to-db-instance
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.AddRoleToDBInstanceRequest`

  returns: Result of the AddRoleToDBInstance operation returned by the service. - `com.amazonaws.services.rds.model.AddRoleToDBInstanceResult`"
  (^com.amazonaws.services.rds.model.AddRoleToDBInstanceResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.AddRoleToDBInstanceRequest request]
    (-> this (.addRoleToDBInstance request))))

(defn modify-db-parameter-group
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.ModifyDBParameterGroupRequest`

  returns: Result of the ModifyDBParameterGroup operation returned by the service. - `com.amazonaws.services.rds.model.ModifyDBParameterGroupResult`"
  (^com.amazonaws.services.rds.model.ModifyDBParameterGroupResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.ModifyDBParameterGroupRequest request]
    (-> this (.modifyDBParameterGroup request))))

(defn reset-db-cluster-parameter-group
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.ResetDBClusterParameterGroupRequest`

  returns: Result of the ResetDBClusterParameterGroup operation returned by the service. - `com.amazonaws.services.rds.model.ResetDBClusterParameterGroupResult`"
  (^com.amazonaws.services.rds.model.ResetDBClusterParameterGroupResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.ResetDBClusterParameterGroupRequest request]
    (-> this (.resetDBClusterParameterGroup request))))

(defn modify-db-cluster
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.ModifyDBClusterRequest`

  returns: Result of the ModifyDBCluster operation returned by the service. - `com.amazonaws.services.rds.model.DBCluster`"
  (^com.amazonaws.services.rds.model.DBCluster [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.ModifyDBClusterRequest request]
    (-> this (.modifyDBCluster request))))

(defn backtrack-db-cluster
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.BacktrackDBClusterRequest`

  returns: Result of the BacktrackDBCluster operation returned by the service. - `com.amazonaws.services.rds.model.BacktrackDBClusterResult`"
  (^com.amazonaws.services.rds.model.BacktrackDBClusterResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.BacktrackDBClusterRequest request]
    (-> this (.backtrackDBCluster request))))

(defn copy-db-cluster-parameter-group
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.CopyDBClusterParameterGroupRequest`

  returns: Result of the CopyDBClusterParameterGroup operation returned by the service. - `com.amazonaws.services.rds.model.DBClusterParameterGroup`"
  (^com.amazonaws.services.rds.model.DBClusterParameterGroup [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.CopyDBClusterParameterGroupRequest request]
    (-> this (.copyDBClusterParameterGroup request))))

(defn copy-db-cluster-snapshot
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.CopyDBClusterSnapshotRequest`

  returns: Result of the CopyDBClusterSnapshot operation returned by the service. - `com.amazonaws.services.rds.model.DBClusterSnapshot`"
  (^com.amazonaws.services.rds.model.DBClusterSnapshot [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.CopyDBClusterSnapshotRequest request]
    (-> this (.copyDBClusterSnapshot request))))

(defn apply-pending-maintenance-action
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.ApplyPendingMaintenanceActionRequest`

  returns: Result of the ApplyPendingMaintenanceAction operation returned by the service. - `com.amazonaws.services.rds.model.ResourcePendingMaintenanceActions`"
  (^com.amazonaws.services.rds.model.ResourcePendingMaintenanceActions [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.ApplyPendingMaintenanceActionRequest request]
    (-> this (.applyPendingMaintenanceAction request))))

(defn modify-db-cluster-endpoint
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.ModifyDBClusterEndpointRequest`

  returns: Result of the ModifyDBClusterEndpoint operation returned by the service. - `com.amazonaws.services.rds.model.ModifyDBClusterEndpointResult`"
  (^com.amazonaws.services.rds.model.ModifyDBClusterEndpointResult [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.ModifyDBClusterEndpointRequest request]
    (-> this (.modifyDBClusterEndpoint request))))

(defn start-db-cluster
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.StartDBClusterRequest`

  returns: Result of the StartDBCluster operation returned by the service. - `com.amazonaws.services.rds.model.DBCluster`"
  (^com.amazonaws.services.rds.model.DBCluster [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.StartDBClusterRequest request]
    (-> this (.startDBCluster request))))

(defn create-db-subnet-group
  "Description copied from interface: AmazonRDS

  request - `com.amazonaws.services.rds.model.CreateDBSubnetGroupRequest`

  returns: Result of the CreateDBSubnetGroup operation returned by the service. - `com.amazonaws.services.rds.model.DBSubnetGroup`"
  (^com.amazonaws.services.rds.model.DBSubnetGroup [^AbstractAmazonRDS this ^com.amazonaws.services.rds.model.CreateDBSubnetGroupRequest request]
    (-> this (.createDBSubnetGroup request))))

