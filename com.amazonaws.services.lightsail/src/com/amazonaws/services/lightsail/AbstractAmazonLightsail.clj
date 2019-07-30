(ns com.amazonaws.services.lightsail.AbstractAmazonLightsail
  "Abstract implementation of AmazonLightsail. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.lightsail AbstractAmazonLightsail]))

(defn update-relational-database-parameters
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.UpdateRelationalDatabaseParametersRequest`

  returns: Result of the UpdateRelationalDatabaseParameters operation returned by the service. - `com.amazonaws.services.lightsail.model.UpdateRelationalDatabaseParametersResult`"
  (^com.amazonaws.services.lightsail.model.UpdateRelationalDatabaseParametersResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.UpdateRelationalDatabaseParametersRequest request]
    (-> this (.updateRelationalDatabaseParameters request))))

(defn delete-domain-entry
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.DeleteDomainEntryRequest`

  returns: Result of the DeleteDomainEntry operation returned by the service. - `com.amazonaws.services.lightsail.model.DeleteDomainEntryResult`"
  (^com.amazonaws.services.lightsail.model.DeleteDomainEntryResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.DeleteDomainEntryRequest request]
    (-> this (.deleteDomainEntry request))))

(defn detach-instances-from-load-balancer
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.DetachInstancesFromLoadBalancerRequest`

  returns: Result of the DetachInstancesFromLoadBalancer operation returned by the service. - `com.amazonaws.services.lightsail.model.DetachInstancesFromLoadBalancerResult`"
  (^com.amazonaws.services.lightsail.model.DetachInstancesFromLoadBalancerResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.DetachInstancesFromLoadBalancerRequest request]
    (-> this (.detachInstancesFromLoadBalancer request))))

(defn delete-relational-database
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.DeleteRelationalDatabaseRequest`

  returns: Result of the DeleteRelationalDatabase operation returned by the service. - `com.amazonaws.services.lightsail.model.DeleteRelationalDatabaseResult`"
  (^com.amazonaws.services.lightsail.model.DeleteRelationalDatabaseResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.DeleteRelationalDatabaseRequest request]
    (-> this (.deleteRelationalDatabase request))))

(defn peer-vpc
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.PeerVpcRequest`

  returns: Result of the PeerVpc operation returned by the service. - `com.amazonaws.services.lightsail.model.PeerVpcResult`"
  (^com.amazonaws.services.lightsail.model.PeerVpcResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.PeerVpcRequest request]
    (-> this (.peerVpc request))))

(defn release-static-ip
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.ReleaseStaticIpRequest`

  returns: Result of the ReleaseStaticIp operation returned by the service. - `com.amazonaws.services.lightsail.model.ReleaseStaticIpResult`"
  (^com.amazonaws.services.lightsail.model.ReleaseStaticIpResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.ReleaseStaticIpRequest request]
    (-> this (.releaseStaticIp request))))

(defn set-region
  "Description copied from interface: AmazonLightsail

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonLightsail this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn create-instance-snapshot
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.CreateInstanceSnapshotRequest`

  returns: Result of the CreateInstanceSnapshot operation returned by the service. - `com.amazonaws.services.lightsail.model.CreateInstanceSnapshotResult`"
  (^com.amazonaws.services.lightsail.model.CreateInstanceSnapshotResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.CreateInstanceSnapshotRequest request]
    (-> this (.createInstanceSnapshot request))))

(defn get-relational-database-master-user-password
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseMasterUserPasswordRequest`

  returns: Result of the GetRelationalDatabaseMasterUserPassword operation returned by the service. - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseMasterUserPasswordResult`"
  (^com.amazonaws.services.lightsail.model.GetRelationalDatabaseMasterUserPasswordResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseMasterUserPasswordRequest request]
    (-> this (.getRelationalDatabaseMasterUserPassword request))))

(defn get-instance-metric-data
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.GetInstanceMetricDataRequest`

  returns: Result of the GetInstanceMetricData operation returned by the service. - `com.amazonaws.services.lightsail.model.GetInstanceMetricDataResult`"
  (^com.amazonaws.services.lightsail.model.GetInstanceMetricDataResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.GetInstanceMetricDataRequest request]
    (-> this (.getInstanceMetricData request))))

(defn start-instance
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.StartInstanceRequest`

  returns: Result of the StartInstance operation returned by the service. - `com.amazonaws.services.lightsail.model.StartInstanceResult`"
  (^com.amazonaws.services.lightsail.model.StartInstanceResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.StartInstanceRequest request]
    (-> this (.startInstance request))))

(defn unpeer-vpc
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.UnpeerVpcRequest`

  returns: Result of the UnpeerVpc operation returned by the service. - `com.amazonaws.services.lightsail.model.UnpeerVpcResult`"
  (^com.amazonaws.services.lightsail.model.UnpeerVpcResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.UnpeerVpcRequest request]
    (-> this (.unpeerVpc request))))

(defn get-relational-database-events
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseEventsRequest`

  returns: Result of the GetRelationalDatabaseEvents operation returned by the service. - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseEventsResult`"
  (^com.amazonaws.services.lightsail.model.GetRelationalDatabaseEventsResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseEventsRequest request]
    (-> this (.getRelationalDatabaseEvents request))))

(defn attach-static-ip
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.AttachStaticIpRequest`

  returns: Result of the AttachStaticIp operation returned by the service. - `com.amazonaws.services.lightsail.model.AttachStaticIpResult`"
  (^com.amazonaws.services.lightsail.model.AttachStaticIpResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.AttachStaticIpRequest request]
    (-> this (.attachStaticIp request))))

(defn delete-disk-snapshot
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.DeleteDiskSnapshotRequest`

  returns: Result of the DeleteDiskSnapshot operation returned by the service. - `com.amazonaws.services.lightsail.model.DeleteDiskSnapshotResult`"
  (^com.amazonaws.services.lightsail.model.DeleteDiskSnapshotResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.DeleteDiskSnapshotRequest request]
    (-> this (.deleteDiskSnapshot request))))

(defn delete-instance-snapshot
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.DeleteInstanceSnapshotRequest`

  returns: Result of the DeleteInstanceSnapshot operation returned by the service. - `com.amazonaws.services.lightsail.model.DeleteInstanceSnapshotResult`"
  (^com.amazonaws.services.lightsail.model.DeleteInstanceSnapshotResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.DeleteInstanceSnapshotRequest request]
    (-> this (.deleteInstanceSnapshot request))))

(defn get-instance-snapshots
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.GetInstanceSnapshotsRequest`

  returns: Result of the GetInstanceSnapshots operation returned by the service. - `com.amazonaws.services.lightsail.model.GetInstanceSnapshotsResult`"
  (^com.amazonaws.services.lightsail.model.GetInstanceSnapshotsResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.GetInstanceSnapshotsRequest request]
    (-> this (.getInstanceSnapshots request))))

(defn create-disk-snapshot
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.CreateDiskSnapshotRequest`

  returns: Result of the CreateDiskSnapshot operation returned by the service. - `com.amazonaws.services.lightsail.model.CreateDiskSnapshotResult`"
  (^com.amazonaws.services.lightsail.model.CreateDiskSnapshotResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.CreateDiskSnapshotRequest request]
    (-> this (.createDiskSnapshot request))))

(defn delete-disk
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.DeleteDiskRequest`

  returns: Result of the DeleteDisk operation returned by the service. - `com.amazonaws.services.lightsail.model.DeleteDiskResult`"
  (^com.amazonaws.services.lightsail.model.DeleteDiskResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.DeleteDiskRequest request]
    (-> this (.deleteDisk request))))

(defn get-operations
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.GetOperationsRequest`

  returns: Result of the GetOperations operation returned by the service. - `com.amazonaws.services.lightsail.model.GetOperationsResult`"
  (^com.amazonaws.services.lightsail.model.GetOperationsResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.GetOperationsRequest request]
    (-> this (.getOperations request))))

(defn delete-relational-database-snapshot
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.DeleteRelationalDatabaseSnapshotRequest`

  returns: Result of the DeleteRelationalDatabaseSnapshot operation returned by the service. - `com.amazonaws.services.lightsail.model.DeleteRelationalDatabaseSnapshotResult`"
  (^com.amazonaws.services.lightsail.model.DeleteRelationalDatabaseSnapshotResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.DeleteRelationalDatabaseSnapshotRequest request]
    (-> this (.deleteRelationalDatabaseSnapshot request))))

(defn get-instances
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.GetInstancesRequest`

  returns: Result of the GetInstances operation returned by the service. - `com.amazonaws.services.lightsail.model.GetInstancesResult`"
  (^com.amazonaws.services.lightsail.model.GetInstancesResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.GetInstancesRequest request]
    (-> this (.getInstances request))))

(defn is-vpc-peered
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.IsVpcPeeredRequest`

  returns: Result of the IsVpcPeered operation returned by the service. - `com.amazonaws.services.lightsail.model.IsVpcPeeredResult`"
  (^com.amazonaws.services.lightsail.model.IsVpcPeeredResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.IsVpcPeeredRequest request]
    (-> this (.isVpcPeered request))))

(defn copy-snapshot
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.CopySnapshotRequest`

  returns: Result of the CopySnapshot operation returned by the service. - `com.amazonaws.services.lightsail.model.CopySnapshotResult`"
  (^com.amazonaws.services.lightsail.model.CopySnapshotResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.CopySnapshotRequest request]
    (-> this (.copySnapshot request))))

(defn get-relational-database-blueprints
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseBlueprintsRequest`

  returns: Result of the GetRelationalDatabaseBlueprints operation returned by the service. - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseBlueprintsResult`"
  (^com.amazonaws.services.lightsail.model.GetRelationalDatabaseBlueprintsResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseBlueprintsRequest request]
    (-> this (.getRelationalDatabaseBlueprints request))))

(defn create-instances-from-snapshot
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.CreateInstancesFromSnapshotRequest`

  returns: Result of the CreateInstancesFromSnapshot operation returned by the service. - `com.amazonaws.services.lightsail.model.CreateInstancesFromSnapshotResult`"
  (^com.amazonaws.services.lightsail.model.CreateInstancesFromSnapshotResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.CreateInstancesFromSnapshotRequest request]
    (-> this (.createInstancesFromSnapshot request))))

(defn get-load-balancer-tls-certificates
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.GetLoadBalancerTlsCertificatesRequest`

  returns: Result of the GetLoadBalancerTlsCertificates operation returned by the service. - `com.amazonaws.services.lightsail.model.GetLoadBalancerTlsCertificatesResult`"
  (^com.amazonaws.services.lightsail.model.GetLoadBalancerTlsCertificatesResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.GetLoadBalancerTlsCertificatesRequest request]
    (-> this (.getLoadBalancerTlsCertificates request))))

(defn untag-resource
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.lightsail.model.UntagResourceResult`"
  (^com.amazonaws.services.lightsail.model.UntagResourceResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn get-static-ips
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.GetStaticIpsRequest`

  returns: Result of the GetStaticIps operation returned by the service. - `com.amazonaws.services.lightsail.model.GetStaticIpsResult`"
  (^com.amazonaws.services.lightsail.model.GetStaticIpsResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.GetStaticIpsRequest request]
    (-> this (.getStaticIps request))))

(defn attach-disk
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.AttachDiskRequest`

  returns: Result of the AttachDisk operation returned by the service. - `com.amazonaws.services.lightsail.model.AttachDiskResult`"
  (^com.amazonaws.services.lightsail.model.AttachDiskResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.AttachDiskRequest request]
    (-> this (.attachDisk request))))

(defn delete-domain
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.DeleteDomainRequest`

  returns: Result of the DeleteDomain operation returned by the service. - `com.amazonaws.services.lightsail.model.DeleteDomainResult`"
  (^com.amazonaws.services.lightsail.model.DeleteDomainResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.DeleteDomainRequest request]
    (-> this (.deleteDomain request))))

(defn stop-instance
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.StopInstanceRequest`

  returns: Result of the StopInstance operation returned by the service. - `com.amazonaws.services.lightsail.model.StopInstanceResult`"
  (^com.amazonaws.services.lightsail.model.StopInstanceResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.StopInstanceRequest request]
    (-> this (.stopInstance request))))

(defn get-active-names
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.GetActiveNamesRequest`

  returns: Result of the GetActiveNames operation returned by the service. - `com.amazonaws.services.lightsail.model.GetActiveNamesResult`"
  (^com.amazonaws.services.lightsail.model.GetActiveNamesResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.GetActiveNamesRequest request]
    (-> this (.getActiveNames request))))

(defn reboot-instance
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.RebootInstanceRequest`

  returns: Result of the RebootInstance operation returned by the service. - `com.amazonaws.services.lightsail.model.RebootInstanceResult`"
  (^com.amazonaws.services.lightsail.model.RebootInstanceResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.RebootInstanceRequest request]
    (-> this (.rebootInstance request))))

(defn create-relational-database-from-snapshot
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.CreateRelationalDatabaseFromSnapshotRequest`

  returns: Result of the CreateRelationalDatabaseFromSnapshot operation returned by the service. - `com.amazonaws.services.lightsail.model.CreateRelationalDatabaseFromSnapshotResult`"
  (^com.amazonaws.services.lightsail.model.CreateRelationalDatabaseFromSnapshotResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.CreateRelationalDatabaseFromSnapshotRequest request]
    (-> this (.createRelationalDatabaseFromSnapshot request))))

(defn create-instances
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.CreateInstancesRequest`

  returns: Result of the CreateInstances operation returned by the service. - `com.amazonaws.services.lightsail.model.CreateInstancesResult`"
  (^com.amazonaws.services.lightsail.model.CreateInstancesResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.CreateInstancesRequest request]
    (-> this (.createInstances request))))

(defn put-instance-public-ports
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.PutInstancePublicPortsRequest`

  returns: Result of the PutInstancePublicPorts operation returned by the service. - `com.amazonaws.services.lightsail.model.PutInstancePublicPortsResult`"
  (^com.amazonaws.services.lightsail.model.PutInstancePublicPortsResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.PutInstancePublicPortsRequest request]
    (-> this (.putInstancePublicPorts request))))

(defn get-disk
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.GetDiskRequest`

  returns: Result of the GetDisk operation returned by the service. - `com.amazonaws.services.lightsail.model.GetDiskResult`"
  (^com.amazonaws.services.lightsail.model.GetDiskResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.GetDiskRequest request]
    (-> this (.getDisk request))))

(defn get-relational-database-bundles
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseBundlesRequest`

  returns: Result of the GetRelationalDatabaseBundles operation returned by the service. - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseBundlesResult`"
  (^com.amazonaws.services.lightsail.model.GetRelationalDatabaseBundlesResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseBundlesRequest request]
    (-> this (.getRelationalDatabaseBundles request))))

(defn get-operations-for-resource
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.GetOperationsForResourceRequest`

  returns: Result of the GetOperationsForResource operation returned by the service. - `com.amazonaws.services.lightsail.model.GetOperationsForResourceResult`"
  (^com.amazonaws.services.lightsail.model.GetOperationsForResourceResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.GetOperationsForResourceRequest request]
    (-> this (.getOperationsForResource request))))

(defn create-relational-database
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.CreateRelationalDatabaseRequest`

  returns: Result of the CreateRelationalDatabase operation returned by the service. - `com.amazonaws.services.lightsail.model.CreateRelationalDatabaseResult`"
  (^com.amazonaws.services.lightsail.model.CreateRelationalDatabaseResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.CreateRelationalDatabaseRequest request]
    (-> this (.createRelationalDatabase request))))

(defn get-load-balancers
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.GetLoadBalancersRequest`

  returns: Result of the GetLoadBalancers operation returned by the service. - `com.amazonaws.services.lightsail.model.GetLoadBalancersResult`"
  (^com.amazonaws.services.lightsail.model.GetLoadBalancersResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.GetLoadBalancersRequest request]
    (-> this (.getLoadBalancers request))))

(defn get-key-pairs
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.GetKeyPairsRequest`

  returns: Result of the GetKeyPairs operation returned by the service. - `com.amazonaws.services.lightsail.model.GetKeyPairsResult`"
  (^com.amazonaws.services.lightsail.model.GetKeyPairsResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.GetKeyPairsRequest request]
    (-> this (.getKeyPairs request))))

(defn get-instance-snapshot
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.GetInstanceSnapshotRequest`

  returns: Result of the GetInstanceSnapshot operation returned by the service. - `com.amazonaws.services.lightsail.model.GetInstanceSnapshotResult`"
  (^com.amazonaws.services.lightsail.model.GetInstanceSnapshotResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.GetInstanceSnapshotRequest request]
    (-> this (.getInstanceSnapshot request))))

(defn get-bundles
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.GetBundlesRequest`

  returns: Result of the GetBundles operation returned by the service. - `com.amazonaws.services.lightsail.model.GetBundlesResult`"
  (^com.amazonaws.services.lightsail.model.GetBundlesResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.GetBundlesRequest request]
    (-> this (.getBundles request))))

(defn get-instance-state
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.GetInstanceStateRequest`

  returns: Result of the GetInstanceState operation returned by the service. - `com.amazonaws.services.lightsail.model.GetInstanceStateResult`"
  (^com.amazonaws.services.lightsail.model.GetInstanceStateResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.GetInstanceStateRequest request]
    (-> this (.getInstanceState request))))

(defn get-relational-database-snapshots
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseSnapshotsRequest`

  returns: Result of the GetRelationalDatabaseSnapshots operation returned by the service. - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseSnapshotsResult`"
  (^com.amazonaws.services.lightsail.model.GetRelationalDatabaseSnapshotsResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseSnapshotsRequest request]
    (-> this (.getRelationalDatabaseSnapshots request))))

(defn update-relational-database
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.UpdateRelationalDatabaseRequest`

  returns: Result of the UpdateRelationalDatabase operation returned by the service. - `com.amazonaws.services.lightsail.model.UpdateRelationalDatabaseResult`"
  (^com.amazonaws.services.lightsail.model.UpdateRelationalDatabaseResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.UpdateRelationalDatabaseRequest request]
    (-> this (.updateRelationalDatabase request))))

(defn get-relational-database-log-streams
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseLogStreamsRequest`

  returns: Result of the GetRelationalDatabaseLogStreams operation returned by the service. - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseLogStreamsResult`"
  (^com.amazonaws.services.lightsail.model.GetRelationalDatabaseLogStreamsResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseLogStreamsRequest request]
    (-> this (.getRelationalDatabaseLogStreams request))))

(defn get-relational-database-log-events
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseLogEventsRequest`

  returns: Result of the GetRelationalDatabaseLogEvents operation returned by the service. - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseLogEventsResult`"
  (^com.amazonaws.services.lightsail.model.GetRelationalDatabaseLogEventsResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseLogEventsRequest request]
    (-> this (.getRelationalDatabaseLogEvents request))))

(defn start-relational-database
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.StartRelationalDatabaseRequest`

  returns: Result of the StartRelationalDatabase operation returned by the service. - `com.amazonaws.services.lightsail.model.StartRelationalDatabaseResult`"
  (^com.amazonaws.services.lightsail.model.StartRelationalDatabaseResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.StartRelationalDatabaseRequest request]
    (-> this (.startRelationalDatabase request))))

(defn get-relational-database-snapshot
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseSnapshotRequest`

  returns: Result of the GetRelationalDatabaseSnapshot operation returned by the service. - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseSnapshotResult`"
  (^com.amazonaws.services.lightsail.model.GetRelationalDatabaseSnapshotResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseSnapshotRequest request]
    (-> this (.getRelationalDatabaseSnapshot request))))

(defn create-domain
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.CreateDomainRequest`

  returns: Result of the CreateDomain operation returned by the service. - `com.amazonaws.services.lightsail.model.CreateDomainResult`"
  (^com.amazonaws.services.lightsail.model.CreateDomainResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.CreateDomainRequest request]
    (-> this (.createDomain request))))

(defn get-instance-port-states
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.GetInstancePortStatesRequest`

  returns: Result of the GetInstancePortStates operation returned by the service. - `com.amazonaws.services.lightsail.model.GetInstancePortStatesResult`"
  (^com.amazonaws.services.lightsail.model.GetInstancePortStatesResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.GetInstancePortStatesRequest request]
    (-> this (.getInstancePortStates request))))

(defn create-key-pair
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.CreateKeyPairRequest`

  returns: Result of the CreateKeyPair operation returned by the service. - `com.amazonaws.services.lightsail.model.CreateKeyPairResult`"
  (^com.amazonaws.services.lightsail.model.CreateKeyPairResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.CreateKeyPairRequest request]
    (-> this (.createKeyPair request))))

(defn delete-instance
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.DeleteInstanceRequest`

  returns: Result of the DeleteInstance operation returned by the service. - `com.amazonaws.services.lightsail.model.DeleteInstanceResult`"
  (^com.amazonaws.services.lightsail.model.DeleteInstanceResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.DeleteInstanceRequest request]
    (-> this (.deleteInstance request))))

(defn get-relational-databases
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.GetRelationalDatabasesRequest`

  returns: Result of the GetRelationalDatabases operation returned by the service. - `com.amazonaws.services.lightsail.model.GetRelationalDatabasesResult`"
  (^com.amazonaws.services.lightsail.model.GetRelationalDatabasesResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.GetRelationalDatabasesRequest request]
    (-> this (.getRelationalDatabases request))))

(defn shutdown
  "Description copied from interface: AmazonLightsail"
  ([^AbstractAmazonLightsail this]
    (-> this (.shutdown))))

(defn download-default-key-pair
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.DownloadDefaultKeyPairRequest`

  returns: Result of the DownloadDefaultKeyPair operation returned by the service. - `com.amazonaws.services.lightsail.model.DownloadDefaultKeyPairResult`"
  (^com.amazonaws.services.lightsail.model.DownloadDefaultKeyPairResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.DownloadDefaultKeyPairRequest request]
    (-> this (.downloadDefaultKeyPair request))))

(defn close-instance-public-ports
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.CloseInstancePublicPortsRequest`

  returns: Result of the CloseInstancePublicPorts operation returned by the service. - `com.amazonaws.services.lightsail.model.CloseInstancePublicPortsResult`"
  (^com.amazonaws.services.lightsail.model.CloseInstancePublicPortsResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.CloseInstancePublicPortsRequest request]
    (-> this (.closeInstancePublicPorts request))))

(defn get-cloud-formation-stack-records
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.GetCloudFormationStackRecordsRequest`

  returns: Result of the GetCloudFormationStackRecords operation returned by the service. - `com.amazonaws.services.lightsail.model.GetCloudFormationStackRecordsResult`"
  (^com.amazonaws.services.lightsail.model.GetCloudFormationStackRecordsResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.GetCloudFormationStackRecordsRequest request]
    (-> this (.getCloudFormationStackRecords request))))

(defn reboot-relational-database
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.RebootRelationalDatabaseRequest`

  returns: Result of the RebootRelationalDatabase operation returned by the service. - `com.amazonaws.services.lightsail.model.RebootRelationalDatabaseResult`"
  (^com.amazonaws.services.lightsail.model.RebootRelationalDatabaseResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.RebootRelationalDatabaseRequest request]
    (-> this (.rebootRelationalDatabase request))))

(defn get-instance
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.GetInstanceRequest`

  returns: Result of the GetInstance operation returned by the service. - `com.amazonaws.services.lightsail.model.GetInstanceResult`"
  (^com.amazonaws.services.lightsail.model.GetInstanceResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.GetInstanceRequest request]
    (-> this (.getInstance request))))

(defn get-load-balancer-metric-data
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.GetLoadBalancerMetricDataRequest`

  returns: Result of the GetLoadBalancerMetricData operation returned by the service. - `com.amazonaws.services.lightsail.model.GetLoadBalancerMetricDataResult`"
  (^com.amazonaws.services.lightsail.model.GetLoadBalancerMetricDataResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.GetLoadBalancerMetricDataRequest request]
    (-> this (.getLoadBalancerMetricData request))))

(defn get-disk-snapshot
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.GetDiskSnapshotRequest`

  returns: Result of the GetDiskSnapshot operation returned by the service. - `com.amazonaws.services.lightsail.model.GetDiskSnapshotResult`"
  (^com.amazonaws.services.lightsail.model.GetDiskSnapshotResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.GetDiskSnapshotRequest request]
    (-> this (.getDiskSnapshot request))))

(defn attach-instances-to-load-balancer
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.AttachInstancesToLoadBalancerRequest`

  returns: Result of the AttachInstancesToLoadBalancer operation returned by the service. - `com.amazonaws.services.lightsail.model.AttachInstancesToLoadBalancerResult`"
  (^com.amazonaws.services.lightsail.model.AttachInstancesToLoadBalancerResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.AttachInstancesToLoadBalancerRequest request]
    (-> this (.attachInstancesToLoadBalancer request))))

(defn create-relational-database-snapshot
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.CreateRelationalDatabaseSnapshotRequest`

  returns: Result of the CreateRelationalDatabaseSnapshot operation returned by the service. - `com.amazonaws.services.lightsail.model.CreateRelationalDatabaseSnapshotResult`"
  (^com.amazonaws.services.lightsail.model.CreateRelationalDatabaseSnapshotResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.CreateRelationalDatabaseSnapshotRequest request]
    (-> this (.createRelationalDatabaseSnapshot request))))

(defn create-load-balancer-tls-certificate
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.CreateLoadBalancerTlsCertificateRequest`

  returns: Result of the CreateLoadBalancerTlsCertificate operation returned by the service. - `com.amazonaws.services.lightsail.model.CreateLoadBalancerTlsCertificateResult`"
  (^com.amazonaws.services.lightsail.model.CreateLoadBalancerTlsCertificateResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.CreateLoadBalancerTlsCertificateRequest request]
    (-> this (.createLoadBalancerTlsCertificate request))))

(defn set-endpoint
  "Description copied from interface: AmazonLightsail

  endpoint - The endpoint (ex: \"lightsail.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"lightsail.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonLightsail this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn delete-load-balancer
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.DeleteLoadBalancerRequest`

  returns: Result of the DeleteLoadBalancer operation returned by the service. - `com.amazonaws.services.lightsail.model.DeleteLoadBalancerResult`"
  (^com.amazonaws.services.lightsail.model.DeleteLoadBalancerResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.DeleteLoadBalancerRequest request]
    (-> this (.deleteLoadBalancer request))))

(defn get-static-ip
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.GetStaticIpRequest`

  returns: Result of the GetStaticIp operation returned by the service. - `com.amazonaws.services.lightsail.model.GetStaticIpResult`"
  (^com.amazonaws.services.lightsail.model.GetStaticIpResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.GetStaticIpRequest request]
    (-> this (.getStaticIp request))))

(defn get-key-pair
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.GetKeyPairRequest`

  returns: Result of the GetKeyPair operation returned by the service. - `com.amazonaws.services.lightsail.model.GetKeyPairResult`"
  (^com.amazonaws.services.lightsail.model.GetKeyPairResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.GetKeyPairRequest request]
    (-> this (.getKeyPair request))))

(defn get-disks
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.GetDisksRequest`

  returns: Result of the GetDisks operation returned by the service. - `com.amazonaws.services.lightsail.model.GetDisksResult`"
  (^com.amazonaws.services.lightsail.model.GetDisksResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.GetDisksRequest request]
    (-> this (.getDisks request))))

(defn get-instance-access-details
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.GetInstanceAccessDetailsRequest`

  returns: Result of the GetInstanceAccessDetails operation returned by the service. - `com.amazonaws.services.lightsail.model.GetInstanceAccessDetailsResult`"
  (^com.amazonaws.services.lightsail.model.GetInstanceAccessDetailsResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.GetInstanceAccessDetailsRequest request]
    (-> this (.getInstanceAccessDetails request))))

(defn import-key-pair
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.ImportKeyPairRequest`

  returns: Result of the ImportKeyPair operation returned by the service. - `com.amazonaws.services.lightsail.model.ImportKeyPairResult`"
  (^com.amazonaws.services.lightsail.model.ImportKeyPairResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.ImportKeyPairRequest request]
    (-> this (.importKeyPair request))))

(defn create-domain-entry
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.CreateDomainEntryRequest`

  returns: Result of the CreateDomainEntry operation returned by the service. - `com.amazonaws.services.lightsail.model.CreateDomainEntryResult`"
  (^com.amazonaws.services.lightsail.model.CreateDomainEntryResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.CreateDomainEntryRequest request]
    (-> this (.createDomainEntry request))))

(defn get-domains
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.GetDomainsRequest`

  returns: Result of the GetDomains operation returned by the service. - `com.amazonaws.services.lightsail.model.GetDomainsResult`"
  (^com.amazonaws.services.lightsail.model.GetDomainsResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.GetDomainsRequest request]
    (-> this (.getDomains request))))

(defn create-load-balancer
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.CreateLoadBalancerRequest`

  returns: Result of the CreateLoadBalancer operation returned by the service. - `com.amazonaws.services.lightsail.model.CreateLoadBalancerResult`"
  (^com.amazonaws.services.lightsail.model.CreateLoadBalancerResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.CreateLoadBalancerRequest request]
    (-> this (.createLoadBalancer request))))

(defn allocate-static-ip
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.AllocateStaticIpRequest`

  returns: Result of the AllocateStaticIp operation returned by the service. - `com.amazonaws.services.lightsail.model.AllocateStaticIpResult`"
  (^com.amazonaws.services.lightsail.model.AllocateStaticIpResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.AllocateStaticIpRequest request]
    (-> this (.allocateStaticIp request))))

(defn create-disk-from-snapshot
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.CreateDiskFromSnapshotRequest`

  returns: Result of the CreateDiskFromSnapshot operation returned by the service. - `com.amazonaws.services.lightsail.model.CreateDiskFromSnapshotResult`"
  (^com.amazonaws.services.lightsail.model.CreateDiskFromSnapshotResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.CreateDiskFromSnapshotRequest request]
    (-> this (.createDiskFromSnapshot request))))

(defn delete-known-host-keys
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.DeleteKnownHostKeysRequest`

  returns: Result of the DeleteKnownHostKeys operation returned by the service. - `com.amazonaws.services.lightsail.model.DeleteKnownHostKeysResult`"
  (^com.amazonaws.services.lightsail.model.DeleteKnownHostKeysResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.DeleteKnownHostKeysRequest request]
    (-> this (.deleteKnownHostKeys request))))

(defn update-load-balancer-attribute
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.UpdateLoadBalancerAttributeRequest`

  returns: Result of the UpdateLoadBalancerAttribute operation returned by the service. - `com.amazonaws.services.lightsail.model.UpdateLoadBalancerAttributeResult`"
  (^com.amazonaws.services.lightsail.model.UpdateLoadBalancerAttributeResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.UpdateLoadBalancerAttributeRequest request]
    (-> this (.updateLoadBalancerAttribute request))))

(defn get-export-snapshot-records
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.GetExportSnapshotRecordsRequest`

  returns: Result of the GetExportSnapshotRecords operation returned by the service. - `com.amazonaws.services.lightsail.model.GetExportSnapshotRecordsResult`"
  (^com.amazonaws.services.lightsail.model.GetExportSnapshotRecordsResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.GetExportSnapshotRecordsRequest request]
    (-> this (.getExportSnapshotRecords request))))

(defn export-snapshot
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.ExportSnapshotRequest`

  returns: Result of the ExportSnapshot operation returned by the service. - `com.amazonaws.services.lightsail.model.ExportSnapshotResult`"
  (^com.amazonaws.services.lightsail.model.ExportSnapshotResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.ExportSnapshotRequest request]
    (-> this (.exportSnapshot request))))

(defn delete-load-balancer-tls-certificate
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.DeleteLoadBalancerTlsCertificateRequest`

  returns: Result of the DeleteLoadBalancerTlsCertificate operation returned by the service. - `com.amazonaws.services.lightsail.model.DeleteLoadBalancerTlsCertificateResult`"
  (^com.amazonaws.services.lightsail.model.DeleteLoadBalancerTlsCertificateResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.DeleteLoadBalancerTlsCertificateRequest request]
    (-> this (.deleteLoadBalancerTlsCertificate request))))

(defn create-cloud-formation-stack
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.CreateCloudFormationStackRequest`

  returns: Result of the CreateCloudFormationStack operation returned by the service. - `com.amazonaws.services.lightsail.model.CreateCloudFormationStackResult`"
  (^com.amazonaws.services.lightsail.model.CreateCloudFormationStackResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.CreateCloudFormationStackRequest request]
    (-> this (.createCloudFormationStack request))))

(defn get-domain
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.GetDomainRequest`

  returns: Result of the GetDomain operation returned by the service. - `com.amazonaws.services.lightsail.model.GetDomainResult`"
  (^com.amazonaws.services.lightsail.model.GetDomainResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.GetDomainRequest request]
    (-> this (.getDomain request))))

(defn create-disk
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.CreateDiskRequest`

  returns: Result of the CreateDisk operation returned by the service. - `com.amazonaws.services.lightsail.model.CreateDiskResult`"
  (^com.amazonaws.services.lightsail.model.CreateDiskResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.CreateDiskRequest request]
    (-> this (.createDisk request))))

(defn get-disk-snapshots
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.GetDiskSnapshotsRequest`

  returns: Result of the GetDiskSnapshots operation returned by the service. - `com.amazonaws.services.lightsail.model.GetDiskSnapshotsResult`"
  (^com.amazonaws.services.lightsail.model.GetDiskSnapshotsResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.GetDiskSnapshotsRequest request]
    (-> this (.getDiskSnapshots request))))

(defn detach-disk
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.DetachDiskRequest`

  returns: Result of the DetachDisk operation returned by the service. - `com.amazonaws.services.lightsail.model.DetachDiskResult`"
  (^com.amazonaws.services.lightsail.model.DetachDiskResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.DetachDiskRequest request]
    (-> this (.detachDisk request))))

(defn get-load-balancer
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.GetLoadBalancerRequest`

  returns: Result of the GetLoadBalancer operation returned by the service. - `com.amazonaws.services.lightsail.model.GetLoadBalancerResult`"
  (^com.amazonaws.services.lightsail.model.GetLoadBalancerResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.GetLoadBalancerRequest request]
    (-> this (.getLoadBalancer request))))

(defn open-instance-public-ports
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.OpenInstancePublicPortsRequest`

  returns: Result of the OpenInstancePublicPorts operation returned by the service. - `com.amazonaws.services.lightsail.model.OpenInstancePublicPortsResult`"
  (^com.amazonaws.services.lightsail.model.OpenInstancePublicPortsResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.OpenInstancePublicPortsRequest request]
    (-> this (.openInstancePublicPorts request))))

(defn delete-key-pair
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.DeleteKeyPairRequest`

  returns: Result of the DeleteKeyPair operation returned by the service. - `com.amazonaws.services.lightsail.model.DeleteKeyPairResult`"
  (^com.amazonaws.services.lightsail.model.DeleteKeyPairResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.DeleteKeyPairRequest request]
    (-> this (.deleteKeyPair request))))

(defn attach-load-balancer-tls-certificate
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.AttachLoadBalancerTlsCertificateRequest`

  returns: Result of the AttachLoadBalancerTlsCertificate operation returned by the service. - `com.amazonaws.services.lightsail.model.AttachLoadBalancerTlsCertificateResult`"
  (^com.amazonaws.services.lightsail.model.AttachLoadBalancerTlsCertificateResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.AttachLoadBalancerTlsCertificateRequest request]
    (-> this (.attachLoadBalancerTlsCertificate request))))

(defn get-operation
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.GetOperationRequest`

  returns: Result of the GetOperation operation returned by the service. - `com.amazonaws.services.lightsail.model.GetOperationResult`"
  (^com.amazonaws.services.lightsail.model.GetOperationResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.GetOperationRequest request]
    (-> this (.getOperation request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonLightsail

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonLightsail this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-relational-database
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseRequest`

  returns: Result of the GetRelationalDatabase operation returned by the service. - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseResult`"
  (^com.amazonaws.services.lightsail.model.GetRelationalDatabaseResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseRequest request]
    (-> this (.getRelationalDatabase request))))

(defn stop-relational-database
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.StopRelationalDatabaseRequest`

  returns: Result of the StopRelationalDatabase operation returned by the service. - `com.amazonaws.services.lightsail.model.StopRelationalDatabaseResult`"
  (^com.amazonaws.services.lightsail.model.StopRelationalDatabaseResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.StopRelationalDatabaseRequest request]
    (-> this (.stopRelationalDatabase request))))

(defn get-relational-database-metric-data
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseMetricDataRequest`

  returns: Result of the GetRelationalDatabaseMetricData operation returned by the service. - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseMetricDataResult`"
  (^com.amazonaws.services.lightsail.model.GetRelationalDatabaseMetricDataResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseMetricDataRequest request]
    (-> this (.getRelationalDatabaseMetricData request))))

(defn tag-resource
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.lightsail.model.TagResourceResult`"
  (^com.amazonaws.services.lightsail.model.TagResourceResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn get-blueprints
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.GetBlueprintsRequest`

  returns: Result of the GetBlueprints operation returned by the service. - `com.amazonaws.services.lightsail.model.GetBlueprintsResult`"
  (^com.amazonaws.services.lightsail.model.GetBlueprintsResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.GetBlueprintsRequest request]
    (-> this (.getBlueprints request))))

(defn get-relational-database-parameters
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseParametersRequest`

  returns: Result of the GetRelationalDatabaseParameters operation returned by the service. - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseParametersResult`"
  (^com.amazonaws.services.lightsail.model.GetRelationalDatabaseParametersResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseParametersRequest request]
    (-> this (.getRelationalDatabaseParameters request))))

(defn detach-static-ip
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.DetachStaticIpRequest`

  returns: Result of the DetachStaticIp operation returned by the service. - `com.amazonaws.services.lightsail.model.DetachStaticIpResult`"
  (^com.amazonaws.services.lightsail.model.DetachStaticIpResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.DetachStaticIpRequest request]
    (-> this (.detachStaticIp request))))

(defn get-regions
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.GetRegionsRequest`

  returns: Result of the GetRegions operation returned by the service. - `com.amazonaws.services.lightsail.model.GetRegionsResult`"
  (^com.amazonaws.services.lightsail.model.GetRegionsResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.GetRegionsRequest request]
    (-> this (.getRegions request))))

(defn update-domain-entry
  "Description copied from interface: AmazonLightsail

  request - `com.amazonaws.services.lightsail.model.UpdateDomainEntryRequest`

  returns: Result of the UpdateDomainEntry operation returned by the service. - `com.amazonaws.services.lightsail.model.UpdateDomainEntryResult`"
  (^com.amazonaws.services.lightsail.model.UpdateDomainEntryResult [^AbstractAmazonLightsail this ^com.amazonaws.services.lightsail.model.UpdateDomainEntryRequest request]
    (-> this (.updateDomainEntry request))))

