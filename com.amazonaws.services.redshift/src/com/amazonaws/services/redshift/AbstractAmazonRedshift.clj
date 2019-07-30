(ns com.amazonaws.services.redshift.AbstractAmazonRedshift
  "Abstract implementation of AmazonRedshift. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.redshift AbstractAmazonRedshift]))

(defn delete-tags
  "Description copied from interface: AmazonRedshift

  request - Contains the output from the DeleteTags action. - `com.amazonaws.services.redshift.model.DeleteTagsRequest`

  returns: Result of the DeleteTags operation returned by the service. - `com.amazonaws.services.redshift.model.DeleteTagsResult`"
  (^com.amazonaws.services.redshift.model.DeleteTagsResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.DeleteTagsRequest request]
    (-> this (.deleteTags request))))

(defn modify-cluster
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.ModifyClusterRequest`

  returns: Result of the ModifyCluster operation returned by the service. - `com.amazonaws.services.redshift.model.Cluster`"
  (^com.amazonaws.services.redshift.model.Cluster [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.ModifyClusterRequest request]
    (-> this (.modifyCluster request))))

(defn reset-cluster-parameter-group
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.ResetClusterParameterGroupRequest`

  returns: Result of the ResetClusterParameterGroup operation returned by the service. - `com.amazonaws.services.redshift.model.ResetClusterParameterGroupResult`"
  (^com.amazonaws.services.redshift.model.ResetClusterParameterGroupResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.ResetClusterParameterGroupRequest request]
    (-> this (.resetClusterParameterGroup request))))

(defn create-snapshot-schedule
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.CreateSnapshotScheduleRequest`

  returns: Result of the CreateSnapshotSchedule operation returned by the service. - `com.amazonaws.services.redshift.model.CreateSnapshotScheduleResult`"
  (^com.amazonaws.services.redshift.model.CreateSnapshotScheduleResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.CreateSnapshotScheduleRequest request]
    (-> this (.createSnapshotSchedule request))))

(defn modify-cluster-parameter-group
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.ModifyClusterParameterGroupRequest`

  returns: Result of the ModifyClusterParameterGroup operation returned by the service. - `com.amazonaws.services.redshift.model.ModifyClusterParameterGroupResult`"
  (^com.amazonaws.services.redshift.model.ModifyClusterParameterGroupResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.ModifyClusterParameterGroupRequest request]
    (-> this (.modifyClusterParameterGroup request))))

(defn describe-tags
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.DescribeTagsRequest`

  returns: Result of the DescribeTags operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeTagsResult`"
  (^com.amazonaws.services.redshift.model.DescribeTagsResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.DescribeTagsRequest request]
    (-> this (.describeTags request)))
  (^com.amazonaws.services.redshift.model.DescribeTagsResult [^AbstractAmazonRedshift this]
    (-> this (.describeTags))))

(defn set-region
  "Description copied from interface: AmazonRedshift

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonRedshift this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn modify-cluster-maintenance
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.ModifyClusterMaintenanceRequest`

  returns: Result of the ModifyClusterMaintenance operation returned by the service. - `com.amazonaws.services.redshift.model.Cluster`"
  (^com.amazonaws.services.redshift.model.Cluster [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.ModifyClusterMaintenanceRequest request]
    (-> this (.modifyClusterMaintenance request))))

(defn copy-cluster-snapshot
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.CopyClusterSnapshotRequest`

  returns: Result of the CopyClusterSnapshot operation returned by the service. - `com.amazonaws.services.redshift.model.Snapshot`"
  (^com.amazonaws.services.redshift.model.Snapshot [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.CopyClusterSnapshotRequest request]
    (-> this (.copyClusterSnapshot request))))

(defn create-event-subscription
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.CreateEventSubscriptionRequest`

  returns: Result of the CreateEventSubscription operation returned by the service. - `com.amazonaws.services.redshift.model.EventSubscription`"
  (^com.amazonaws.services.redshift.model.EventSubscription [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.CreateEventSubscriptionRequest request]
    (-> this (.createEventSubscription request))))

(defn waiters
  "returns: `com.amazonaws.services.redshift.waiters.AmazonRedshiftWaiters`"
  (^com.amazonaws.services.redshift.waiters.AmazonRedshiftWaiters [^AbstractAmazonRedshift this]
    (-> this (.waiters))))

(defn describe-event-subscriptions
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.DescribeEventSubscriptionsRequest`

  returns: Result of the DescribeEventSubscriptions operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeEventSubscriptionsResult`"
  (^com.amazonaws.services.redshift.model.DescribeEventSubscriptionsResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.DescribeEventSubscriptionsRequest request]
    (-> this (.describeEventSubscriptions request)))
  (^com.amazonaws.services.redshift.model.DescribeEventSubscriptionsResult [^AbstractAmazonRedshift this]
    (-> this (.describeEventSubscriptions))))

(defn enable-snapshot-copy
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.EnableSnapshotCopyRequest`

  returns: Result of the EnableSnapshotCopy operation returned by the service. - `com.amazonaws.services.redshift.model.Cluster`"
  (^com.amazonaws.services.redshift.model.Cluster [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.EnableSnapshotCopyRequest request]
    (-> this (.enableSnapshotCopy request))))

(defn describe-snapshot-schedules
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.DescribeSnapshotSchedulesRequest`

  returns: Result of the DescribeSnapshotSchedules operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeSnapshotSchedulesResult`"
  (^com.amazonaws.services.redshift.model.DescribeSnapshotSchedulesResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.DescribeSnapshotSchedulesRequest request]
    (-> this (.describeSnapshotSchedules request))))

(defn authorize-snapshot-access
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.AuthorizeSnapshotAccessRequest`

  returns: Result of the AuthorizeSnapshotAccess operation returned by the service. - `com.amazonaws.services.redshift.model.Snapshot`"
  (^com.amazonaws.services.redshift.model.Snapshot [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.AuthorizeSnapshotAccessRequest request]
    (-> this (.authorizeSnapshotAccess request))))

(defn create-hsm-configuration
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.CreateHsmConfigurationRequest`

  returns: Result of the CreateHsmConfiguration operation returned by the service. - `com.amazonaws.services.redshift.model.HsmConfiguration`"
  (^com.amazonaws.services.redshift.model.HsmConfiguration [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.CreateHsmConfigurationRequest request]
    (-> this (.createHsmConfiguration request))))

(defn enable-logging
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.EnableLoggingRequest`

  returns: Result of the EnableLogging operation returned by the service. - `com.amazonaws.services.redshift.model.EnableLoggingResult`"
  (^com.amazonaws.services.redshift.model.EnableLoggingResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.EnableLoggingRequest request]
    (-> this (.enableLogging request))))

(defn modify-cluster-iam-roles
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.ModifyClusterIamRolesRequest`

  returns: Result of the ModifyClusterIamRoles operation returned by the service. - `com.amazonaws.services.redshift.model.Cluster`"
  (^com.amazonaws.services.redshift.model.Cluster [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.ModifyClusterIamRolesRequest request]
    (-> this (.modifyClusterIamRoles request))))

(defn create-cluster-snapshot
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.CreateClusterSnapshotRequest`

  returns: Result of the CreateClusterSnapshot operation returned by the service. - `com.amazonaws.services.redshift.model.Snapshot`"
  (^com.amazonaws.services.redshift.model.Snapshot [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.CreateClusterSnapshotRequest request]
    (-> this (.createClusterSnapshot request))))

(defn describe-reserved-nodes
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.DescribeReservedNodesRequest`

  returns: Result of the DescribeReservedNodes operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeReservedNodesResult`"
  (^com.amazonaws.services.redshift.model.DescribeReservedNodesResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.DescribeReservedNodesRequest request]
    (-> this (.describeReservedNodes request)))
  (^com.amazonaws.services.redshift.model.DescribeReservedNodesResult [^AbstractAmazonRedshift this]
    (-> this (.describeReservedNodes))))

(defn describe-cluster-versions
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.DescribeClusterVersionsRequest`

  returns: Result of the DescribeClusterVersions operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeClusterVersionsResult`"
  (^com.amazonaws.services.redshift.model.DescribeClusterVersionsResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.DescribeClusterVersionsRequest request]
    (-> this (.describeClusterVersions request)))
  (^com.amazonaws.services.redshift.model.DescribeClusterVersionsResult [^AbstractAmazonRedshift this]
    (-> this (.describeClusterVersions))))

(defn describe-orderable-cluster-options
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.DescribeOrderableClusterOptionsRequest`

  returns: Result of the DescribeOrderableClusterOptions operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeOrderableClusterOptionsResult`"
  (^com.amazonaws.services.redshift.model.DescribeOrderableClusterOptionsResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.DescribeOrderableClusterOptionsRequest request]
    (-> this (.describeOrderableClusterOptions request)))
  (^com.amazonaws.services.redshift.model.DescribeOrderableClusterOptionsResult [^AbstractAmazonRedshift this]
    (-> this (.describeOrderableClusterOptions))))

(defn batch-modify-cluster-snapshots
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.BatchModifyClusterSnapshotsRequest`

  returns: Result of the BatchModifyClusterSnapshots operation returned by the service. - `com.amazonaws.services.redshift.model.BatchModifyClusterSnapshotsResult`"
  (^com.amazonaws.services.redshift.model.BatchModifyClusterSnapshotsResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.BatchModifyClusterSnapshotsRequest request]
    (-> this (.batchModifyClusterSnapshots request))))

(defn delete-snapshot-copy-grant
  "Description copied from interface: AmazonRedshift

  request - The result of the DeleteSnapshotCopyGrant action. - `com.amazonaws.services.redshift.model.DeleteSnapshotCopyGrantRequest`

  returns: Result of the DeleteSnapshotCopyGrant operation returned by the service. - `com.amazonaws.services.redshift.model.DeleteSnapshotCopyGrantResult`"
  (^com.amazonaws.services.redshift.model.DeleteSnapshotCopyGrantResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.DeleteSnapshotCopyGrantRequest request]
    (-> this (.deleteSnapshotCopyGrant request))))

(defn describe-table-restore-status
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.DescribeTableRestoreStatusRequest`

  returns: Result of the DescribeTableRestoreStatus operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeTableRestoreStatusResult`"
  (^com.amazonaws.services.redshift.model.DescribeTableRestoreStatusResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.DescribeTableRestoreStatusRequest request]
    (-> this (.describeTableRestoreStatus request)))
  (^com.amazonaws.services.redshift.model.DescribeTableRestoreStatusResult [^AbstractAmazonRedshift this]
    (-> this (.describeTableRestoreStatus))))

(defn describe-hsm-client-certificates
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.DescribeHsmClientCertificatesRequest`

  returns: Result of the DescribeHsmClientCertificates operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeHsmClientCertificatesResult`"
  (^com.amazonaws.services.redshift.model.DescribeHsmClientCertificatesResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.DescribeHsmClientCertificatesRequest request]
    (-> this (.describeHsmClientCertificates request)))
  (^com.amazonaws.services.redshift.model.DescribeHsmClientCertificatesResult [^AbstractAmazonRedshift this]
    (-> this (.describeHsmClientCertificates))))

(defn describe-default-cluster-parameters
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.DescribeDefaultClusterParametersRequest`

  returns: Result of the DescribeDefaultClusterParameters operation returned by the service. - `com.amazonaws.services.redshift.model.DefaultClusterParameters`"
  (^com.amazonaws.services.redshift.model.DefaultClusterParameters [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.DescribeDefaultClusterParametersRequest request]
    (-> this (.describeDefaultClusterParameters request))))

(defn authorize-cluster-security-group-ingress
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.AuthorizeClusterSecurityGroupIngressRequest`

  returns: Result of the AuthorizeClusterSecurityGroupIngress operation returned by the service. - `com.amazonaws.services.redshift.model.ClusterSecurityGroup`"
  (^com.amazonaws.services.redshift.model.ClusterSecurityGroup [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.AuthorizeClusterSecurityGroupIngressRequest request]
    (-> this (.authorizeClusterSecurityGroupIngress request))))

(defn disable-snapshot-copy
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.DisableSnapshotCopyRequest`

  returns: Result of the DisableSnapshotCopy operation returned by the service. - `com.amazonaws.services.redshift.model.Cluster`"
  (^com.amazonaws.services.redshift.model.Cluster [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.DisableSnapshotCopyRequest request]
    (-> this (.disableSnapshotCopy request))))

(defn delete-snapshot-schedule
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.DeleteSnapshotScheduleRequest`

  returns: Result of the DeleteSnapshotSchedule operation returned by the service. - `com.amazonaws.services.redshift.model.DeleteSnapshotScheduleResult`"
  (^com.amazonaws.services.redshift.model.DeleteSnapshotScheduleResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.DeleteSnapshotScheduleRequest request]
    (-> this (.deleteSnapshotSchedule request))))

(defn modify-cluster-snapshot-schedule
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.ModifyClusterSnapshotScheduleRequest`

  returns: Result of the ModifyClusterSnapshotSchedule operation returned by the service. - `com.amazonaws.services.redshift.model.ModifyClusterSnapshotScheduleResult`"
  (^com.amazonaws.services.redshift.model.ModifyClusterSnapshotScheduleResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.ModifyClusterSnapshotScheduleRequest request]
    (-> this (.modifyClusterSnapshotSchedule request))))

(defn revoke-cluster-security-group-ingress
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.RevokeClusterSecurityGroupIngressRequest`

  returns: Result of the RevokeClusterSecurityGroupIngress operation returned by the service. - `com.amazonaws.services.redshift.model.ClusterSecurityGroup`"
  (^com.amazonaws.services.redshift.model.ClusterSecurityGroup [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.RevokeClusterSecurityGroupIngressRequest request]
    (-> this (.revokeClusterSecurityGroupIngress request))))

(defn modify-cluster-snapshot
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.ModifyClusterSnapshotRequest`

  returns: Result of the ModifyClusterSnapshot operation returned by the service. - `com.amazonaws.services.redshift.model.Snapshot`"
  (^com.amazonaws.services.redshift.model.Snapshot [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.ModifyClusterSnapshotRequest request]
    (-> this (.modifyClusterSnapshot request))))

(defn describe-cluster-parameters
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.DescribeClusterParametersRequest`

  returns: Result of the DescribeClusterParameters operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeClusterParametersResult`"
  (^com.amazonaws.services.redshift.model.DescribeClusterParametersResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.DescribeClusterParametersRequest request]
    (-> this (.describeClusterParameters request))))

(defn describe-storage
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.DescribeStorageRequest`

  returns: Result of the DescribeStorage operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeStorageResult`"
  (^com.amazonaws.services.redshift.model.DescribeStorageResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.DescribeStorageRequest request]
    (-> this (.describeStorage request))))

(defn create-cluster-security-group
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.CreateClusterSecurityGroupRequest`

  returns: Result of the CreateClusterSecurityGroup operation returned by the service. - `com.amazonaws.services.redshift.model.ClusterSecurityGroup`"
  (^com.amazonaws.services.redshift.model.ClusterSecurityGroup [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.CreateClusterSecurityGroupRequest request]
    (-> this (.createClusterSecurityGroup request))))

(defn get-reserved-node-exchange-offerings
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.GetReservedNodeExchangeOfferingsRequest`

  returns: Result of the GetReservedNodeExchangeOfferings operation returned by the service. - `com.amazonaws.services.redshift.model.GetReservedNodeExchangeOfferingsResult`"
  (^com.amazonaws.services.redshift.model.GetReservedNodeExchangeOfferingsResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.GetReservedNodeExchangeOfferingsRequest request]
    (-> this (.getReservedNodeExchangeOfferings request))))

(defn disable-logging
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.DisableLoggingRequest`

  returns: Result of the DisableLogging operation returned by the service. - `com.amazonaws.services.redshift.model.DisableLoggingResult`"
  (^com.amazonaws.services.redshift.model.DisableLoggingResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.DisableLoggingRequest request]
    (-> this (.disableLogging request))))

(defn modify-cluster-subnet-group
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.ModifyClusterSubnetGroupRequest`

  returns: Result of the ModifyClusterSubnetGroup operation returned by the service. - `com.amazonaws.services.redshift.model.ClusterSubnetGroup`"
  (^com.amazonaws.services.redshift.model.ClusterSubnetGroup [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.ModifyClusterSubnetGroupRequest request]
    (-> this (.modifyClusterSubnetGroup request))))

(defn describe-snapshot-copy-grants
  "Description copied from interface: AmazonRedshift

  request - The result of the DescribeSnapshotCopyGrants action. - `com.amazonaws.services.redshift.model.DescribeSnapshotCopyGrantsRequest`

  returns: Result of the DescribeSnapshotCopyGrants operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeSnapshotCopyGrantsResult`"
  (^com.amazonaws.services.redshift.model.DescribeSnapshotCopyGrantsResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.DescribeSnapshotCopyGrantsRequest request]
    (-> this (.describeSnapshotCopyGrants request)))
  (^com.amazonaws.services.redshift.model.DescribeSnapshotCopyGrantsResult [^AbstractAmazonRedshift this]
    (-> this (.describeSnapshotCopyGrants))))

(defn delete-cluster-snapshot
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.DeleteClusterSnapshotRequest`

  returns: Result of the DeleteClusterSnapshot operation returned by the service. - `com.amazonaws.services.redshift.model.Snapshot`"
  (^com.amazonaws.services.redshift.model.Snapshot [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.DeleteClusterSnapshotRequest request]
    (-> this (.deleteClusterSnapshot request))))

(defn describe-logging-status
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.DescribeLoggingStatusRequest`

  returns: Result of the DescribeLoggingStatus operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeLoggingStatusResult`"
  (^com.amazonaws.services.redshift.model.DescribeLoggingStatusResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.DescribeLoggingStatusRequest request]
    (-> this (.describeLoggingStatus request))))

(defn describe-resize
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.DescribeResizeRequest`

  returns: Result of the DescribeResize operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeResizeResult`"
  (^com.amazonaws.services.redshift.model.DescribeResizeResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.DescribeResizeRequest request]
    (-> this (.describeResize request))))

(defn create-tags
  "Description copied from interface: AmazonRedshift

  request - Contains the output from the CreateTags action. - `com.amazonaws.services.redshift.model.CreateTagsRequest`

  returns: Result of the CreateTags operation returned by the service. - `com.amazonaws.services.redshift.model.CreateTagsResult`"
  (^com.amazonaws.services.redshift.model.CreateTagsResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.CreateTagsRequest request]
    (-> this (.createTags request))))

(defn modify-event-subscription
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.ModifyEventSubscriptionRequest`

  returns: Result of the ModifyEventSubscription operation returned by the service. - `com.amazonaws.services.redshift.model.EventSubscription`"
  (^com.amazonaws.services.redshift.model.EventSubscription [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.ModifyEventSubscriptionRequest request]
    (-> this (.modifyEventSubscription request))))

(defn create-snapshot-copy-grant
  "Description copied from interface: AmazonRedshift

  request - The result of the CreateSnapshotCopyGrant action. - `com.amazonaws.services.redshift.model.CreateSnapshotCopyGrantRequest`

  returns: Result of the CreateSnapshotCopyGrant operation returned by the service. - `com.amazonaws.services.redshift.model.SnapshotCopyGrant`"
  (^com.amazonaws.services.redshift.model.SnapshotCopyGrant [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.CreateSnapshotCopyGrantRequest request]
    (-> this (.createSnapshotCopyGrant request))))

(defn describe-account-attributes
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.DescribeAccountAttributesRequest`

  returns: Result of the DescribeAccountAttributes operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeAccountAttributesResult`"
  (^com.amazonaws.services.redshift.model.DescribeAccountAttributesResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.DescribeAccountAttributesRequest request]
    (-> this (.describeAccountAttributes request))))

(defn shutdown
  "Description copied from interface: AmazonRedshift"
  ([^AbstractAmazonRedshift this]
    (-> this (.shutdown))))

(defn describe-events
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.DescribeEventsRequest`

  returns: Result of the DescribeEvents operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeEventsResult`"
  (^com.amazonaws.services.redshift.model.DescribeEventsResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.DescribeEventsRequest request]
    (-> this (.describeEvents request)))
  (^com.amazonaws.services.redshift.model.DescribeEventsResult [^AbstractAmazonRedshift this]
    (-> this (.describeEvents))))

(defn describe-reserved-node-offerings
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.DescribeReservedNodeOfferingsRequest`

  returns: Result of the DescribeReservedNodeOfferings operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeReservedNodeOfferingsResult`"
  (^com.amazonaws.services.redshift.model.DescribeReservedNodeOfferingsResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.DescribeReservedNodeOfferingsRequest request]
    (-> this (.describeReservedNodeOfferings request)))
  (^com.amazonaws.services.redshift.model.DescribeReservedNodeOfferingsResult [^AbstractAmazonRedshift this]
    (-> this (.describeReservedNodeOfferings))))

(defn cancel-resize
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.CancelResizeRequest`

  returns: Result of the CancelResize operation returned by the service. - `com.amazonaws.services.redshift.model.CancelResizeResult`"
  (^com.amazonaws.services.redshift.model.CancelResizeResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.CancelResizeRequest request]
    (-> this (.cancelResize request))))

(defn batch-delete-cluster-snapshots
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.BatchDeleteClusterSnapshotsRequest`

  returns: Result of the BatchDeleteClusterSnapshots operation returned by the service. - `com.amazonaws.services.redshift.model.BatchDeleteClusterSnapshotsResult`"
  (^com.amazonaws.services.redshift.model.BatchDeleteClusterSnapshotsResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.BatchDeleteClusterSnapshotsRequest request]
    (-> this (.batchDeleteClusterSnapshots request))))

(defn delete-hsm-configuration
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.DeleteHsmConfigurationRequest`

  returns: Result of the DeleteHsmConfiguration operation returned by the service. - `com.amazonaws.services.redshift.model.DeleteHsmConfigurationResult`"
  (^com.amazonaws.services.redshift.model.DeleteHsmConfigurationResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.DeleteHsmConfigurationRequest request]
    (-> this (.deleteHsmConfiguration request))))

(defn restore-from-cluster-snapshot
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.RestoreFromClusterSnapshotRequest`

  returns: Result of the RestoreFromClusterSnapshot operation returned by the service. - `com.amazonaws.services.redshift.model.Cluster`"
  (^com.amazonaws.services.redshift.model.Cluster [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.RestoreFromClusterSnapshotRequest request]
    (-> this (.restoreFromClusterSnapshot request))))

(defn modify-snapshot-copy-retention-period
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.ModifySnapshotCopyRetentionPeriodRequest`

  returns: Result of the ModifySnapshotCopyRetentionPeriod operation returned by the service. - `com.amazonaws.services.redshift.model.Cluster`"
  (^com.amazonaws.services.redshift.model.Cluster [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.ModifySnapshotCopyRetentionPeriodRequest request]
    (-> this (.modifySnapshotCopyRetentionPeriod request))))

(defn create-hsm-client-certificate
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.CreateHsmClientCertificateRequest`

  returns: Result of the CreateHsmClientCertificate operation returned by the service. - `com.amazonaws.services.redshift.model.HsmClientCertificate`"
  (^com.amazonaws.services.redshift.model.HsmClientCertificate [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.CreateHsmClientCertificateRequest request]
    (-> this (.createHsmClientCertificate request))))

(defn purchase-reserved-node-offering
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.PurchaseReservedNodeOfferingRequest`

  returns: Result of the PurchaseReservedNodeOffering operation returned by the service. - `com.amazonaws.services.redshift.model.ReservedNode`"
  (^com.amazonaws.services.redshift.model.ReservedNode [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.PurchaseReservedNodeOfferingRequest request]
    (-> this (.purchaseReservedNodeOffering request))))

(defn set-endpoint
  "Description copied from interface: AmazonRedshift

  endpoint - The endpoint (ex: \"redshift.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"redshift.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonRedshift this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn describe-cluster-subnet-groups
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.DescribeClusterSubnetGroupsRequest`

  returns: Result of the DescribeClusterSubnetGroups operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeClusterSubnetGroupsResult`"
  (^com.amazonaws.services.redshift.model.DescribeClusterSubnetGroupsResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.DescribeClusterSubnetGroupsRequest request]
    (-> this (.describeClusterSubnetGroups request)))
  (^com.amazonaws.services.redshift.model.DescribeClusterSubnetGroupsResult [^AbstractAmazonRedshift this]
    (-> this (.describeClusterSubnetGroups))))

(defn rotate-encryption-key
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.RotateEncryptionKeyRequest`

  returns: Result of the RotateEncryptionKey operation returned by the service. - `com.amazonaws.services.redshift.model.Cluster`"
  (^com.amazonaws.services.redshift.model.Cluster [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.RotateEncryptionKeyRequest request]
    (-> this (.rotateEncryptionKey request))))

(defn describe-cluster-security-groups
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.DescribeClusterSecurityGroupsRequest`

  returns: Result of the DescribeClusterSecurityGroups operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeClusterSecurityGroupsResult`"
  (^com.amazonaws.services.redshift.model.DescribeClusterSecurityGroupsResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.DescribeClusterSecurityGroupsRequest request]
    (-> this (.describeClusterSecurityGroups request)))
  (^com.amazonaws.services.redshift.model.DescribeClusterSecurityGroupsResult [^AbstractAmazonRedshift this]
    (-> this (.describeClusterSecurityGroups))))

(defn modify-snapshot-schedule
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.ModifySnapshotScheduleRequest`

  returns: Result of the ModifySnapshotSchedule operation returned by the service. - `com.amazonaws.services.redshift.model.ModifySnapshotScheduleResult`"
  (^com.amazonaws.services.redshift.model.ModifySnapshotScheduleResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.ModifySnapshotScheduleRequest request]
    (-> this (.modifySnapshotSchedule request))))

(defn describe-event-categories
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.DescribeEventCategoriesRequest`

  returns: Result of the DescribeEventCategories operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeEventCategoriesResult`"
  (^com.amazonaws.services.redshift.model.DescribeEventCategoriesResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.DescribeEventCategoriesRequest request]
    (-> this (.describeEventCategories request)))
  (^com.amazonaws.services.redshift.model.DescribeEventCategoriesResult [^AbstractAmazonRedshift this]
    (-> this (.describeEventCategories))))

(defn describe-cluster-snapshots
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.DescribeClusterSnapshotsRequest`

  returns: Result of the DescribeClusterSnapshots operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeClusterSnapshotsResult`"
  (^com.amazonaws.services.redshift.model.DescribeClusterSnapshotsResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.DescribeClusterSnapshotsRequest request]
    (-> this (.describeClusterSnapshots request)))
  (^com.amazonaws.services.redshift.model.DescribeClusterSnapshotsResult [^AbstractAmazonRedshift this]
    (-> this (.describeClusterSnapshots))))

(defn create-cluster-parameter-group
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.CreateClusterParameterGroupRequest`

  returns: Result of the CreateClusterParameterGroup operation returned by the service. - `com.amazonaws.services.redshift.model.ClusterParameterGroup`"
  (^com.amazonaws.services.redshift.model.ClusterParameterGroup [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.CreateClusterParameterGroupRequest request]
    (-> this (.createClusterParameterGroup request))))

(defn delete-event-subscription
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.DeleteEventSubscriptionRequest`

  returns: Result of the DeleteEventSubscription operation returned by the service. - `com.amazonaws.services.redshift.model.DeleteEventSubscriptionResult`"
  (^com.amazonaws.services.redshift.model.DeleteEventSubscriptionResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.DeleteEventSubscriptionRequest request]
    (-> this (.deleteEventSubscription request))))

(defn delete-hsm-client-certificate
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.DeleteHsmClientCertificateRequest`

  returns: Result of the DeleteHsmClientCertificate operation returned by the service. - `com.amazonaws.services.redshift.model.DeleteHsmClientCertificateResult`"
  (^com.amazonaws.services.redshift.model.DeleteHsmClientCertificateResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.DeleteHsmClientCertificateRequest request]
    (-> this (.deleteHsmClientCertificate request))))

(defn describe-cluster-parameter-groups
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.DescribeClusterParameterGroupsRequest`

  returns: Result of the DescribeClusterParameterGroups operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeClusterParameterGroupsResult`"
  (^com.amazonaws.services.redshift.model.DescribeClusterParameterGroupsResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.DescribeClusterParameterGroupsRequest request]
    (-> this (.describeClusterParameterGroups request)))
  (^com.amazonaws.services.redshift.model.DescribeClusterParameterGroupsResult [^AbstractAmazonRedshift this]
    (-> this (.describeClusterParameterGroups))))

(defn create-cluster
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.CreateClusterRequest`

  returns: Result of the CreateCluster operation returned by the service. - `com.amazonaws.services.redshift.model.Cluster`"
  (^com.amazonaws.services.redshift.model.Cluster [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.CreateClusterRequest request]
    (-> this (.createCluster request))))

(defn accept-reserved-node-exchange
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.AcceptReservedNodeExchangeRequest`

  returns: Result of the AcceptReservedNodeExchange operation returned by the service. - `com.amazonaws.services.redshift.model.ReservedNode`"
  (^com.amazonaws.services.redshift.model.ReservedNode [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.AcceptReservedNodeExchangeRequest request]
    (-> this (.acceptReservedNodeExchange request))))

(defn reboot-cluster
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.RebootClusterRequest`

  returns: Result of the RebootCluster operation returned by the service. - `com.amazonaws.services.redshift.model.Cluster`"
  (^com.amazonaws.services.redshift.model.Cluster [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.RebootClusterRequest request]
    (-> this (.rebootCluster request))))

(defn describe-cluster-tracks
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.DescribeClusterTracksRequest`

  returns: Result of the DescribeClusterTracks operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeClusterTracksResult`"
  (^com.amazonaws.services.redshift.model.DescribeClusterTracksResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.DescribeClusterTracksRequest request]
    (-> this (.describeClusterTracks request))))

(defn resize-cluster
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.ResizeClusterRequest`

  returns: Result of the ResizeCluster operation returned by the service. - `com.amazonaws.services.redshift.model.Cluster`"
  (^com.amazonaws.services.redshift.model.Cluster [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.ResizeClusterRequest request]
    (-> this (.resizeCluster request))))

(defn delete-cluster
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.DeleteClusterRequest`

  returns: Result of the DeleteCluster operation returned by the service. - `com.amazonaws.services.redshift.model.Cluster`"
  (^com.amazonaws.services.redshift.model.Cluster [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.DeleteClusterRequest request]
    (-> this (.deleteCluster request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonRedshift

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonRedshift this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn modify-cluster-db-revision
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.ModifyClusterDbRevisionRequest`

  returns: Result of the ModifyClusterDbRevision operation returned by the service. - `com.amazonaws.services.redshift.model.Cluster`"
  (^com.amazonaws.services.redshift.model.Cluster [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.ModifyClusterDbRevisionRequest request]
    (-> this (.modifyClusterDbRevision request))))

(defn describe-cluster-db-revisions
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.DescribeClusterDbRevisionsRequest`

  returns: Result of the DescribeClusterDbRevisions operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeClusterDbRevisionsResult`"
  (^com.amazonaws.services.redshift.model.DescribeClusterDbRevisionsResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.DescribeClusterDbRevisionsRequest request]
    (-> this (.describeClusterDbRevisions request))))

(defn restore-table-from-cluster-snapshot
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.RestoreTableFromClusterSnapshotRequest`

  returns: Result of the RestoreTableFromClusterSnapshot operation returned by the service. - `com.amazonaws.services.redshift.model.TableRestoreStatus`"
  (^com.amazonaws.services.redshift.model.TableRestoreStatus [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.RestoreTableFromClusterSnapshotRequest request]
    (-> this (.restoreTableFromClusterSnapshot request))))

(defn describe-hsm-configurations
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.DescribeHsmConfigurationsRequest`

  returns: Result of the DescribeHsmConfigurations operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeHsmConfigurationsResult`"
  (^com.amazonaws.services.redshift.model.DescribeHsmConfigurationsResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.DescribeHsmConfigurationsRequest request]
    (-> this (.describeHsmConfigurations request)))
  (^com.amazonaws.services.redshift.model.DescribeHsmConfigurationsResult [^AbstractAmazonRedshift this]
    (-> this (.describeHsmConfigurations))))

(defn delete-cluster-subnet-group
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.DeleteClusterSubnetGroupRequest`

  returns: Result of the DeleteClusterSubnetGroup operation returned by the service. - `com.amazonaws.services.redshift.model.DeleteClusterSubnetGroupResult`"
  (^com.amazonaws.services.redshift.model.DeleteClusterSubnetGroupResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.DeleteClusterSubnetGroupRequest request]
    (-> this (.deleteClusterSubnetGroup request))))

(defn revoke-snapshot-access
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.RevokeSnapshotAccessRequest`

  returns: Result of the RevokeSnapshotAccess operation returned by the service. - `com.amazonaws.services.redshift.model.Snapshot`"
  (^com.amazonaws.services.redshift.model.Snapshot [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.RevokeSnapshotAccessRequest request]
    (-> this (.revokeSnapshotAccess request))))

(defn get-cluster-credentials
  "Description copied from interface: AmazonRedshift

  request - The request parameters to get cluster credentials. - `com.amazonaws.services.redshift.model.GetClusterCredentialsRequest`

  returns: Result of the GetClusterCredentials operation returned by the service. - `com.amazonaws.services.redshift.model.GetClusterCredentialsResult`"
  (^com.amazonaws.services.redshift.model.GetClusterCredentialsResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.GetClusterCredentialsRequest request]
    (-> this (.getClusterCredentials request))))

(defn create-cluster-subnet-group
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.CreateClusterSubnetGroupRequest`

  returns: Result of the CreateClusterSubnetGroup operation returned by the service. - `com.amazonaws.services.redshift.model.ClusterSubnetGroup`"
  (^com.amazonaws.services.redshift.model.ClusterSubnetGroup [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.CreateClusterSubnetGroupRequest request]
    (-> this (.createClusterSubnetGroup request))))

(defn describe-clusters
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.DescribeClustersRequest`

  returns: Result of the DescribeClusters operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeClustersResult`"
  (^com.amazonaws.services.redshift.model.DescribeClustersResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.DescribeClustersRequest request]
    (-> this (.describeClusters request)))
  (^com.amazonaws.services.redshift.model.DescribeClustersResult [^AbstractAmazonRedshift this]
    (-> this (.describeClusters))))

(defn delete-cluster-parameter-group
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.DeleteClusterParameterGroupRequest`

  returns: Result of the DeleteClusterParameterGroup operation returned by the service. - `com.amazonaws.services.redshift.model.DeleteClusterParameterGroupResult`"
  (^com.amazonaws.services.redshift.model.DeleteClusterParameterGroupResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.DeleteClusterParameterGroupRequest request]
    (-> this (.deleteClusterParameterGroup request))))

(defn delete-cluster-security-group
  "Description copied from interface: AmazonRedshift

  request - `com.amazonaws.services.redshift.model.DeleteClusterSecurityGroupRequest`

  returns: Result of the DeleteClusterSecurityGroup operation returned by the service. - `com.amazonaws.services.redshift.model.DeleteClusterSecurityGroupResult`"
  (^com.amazonaws.services.redshift.model.DeleteClusterSecurityGroupResult [^AbstractAmazonRedshift this ^com.amazonaws.services.redshift.model.DeleteClusterSecurityGroupRequest request]
    (-> this (.deleteClusterSecurityGroup request))))

