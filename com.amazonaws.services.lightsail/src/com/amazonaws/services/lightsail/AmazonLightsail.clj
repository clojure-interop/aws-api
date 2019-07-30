(ns com.amazonaws.services.lightsail.AmazonLightsail
  "Interface for accessing Amazon Lightsail.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonLightsail instead.



  Amazon Lightsail is the easiest way to get started with AWS for developers who just need virtual private servers.
  Lightsail includes everything you need to launch your project quickly - a virtual machine, a managed database,
  SSD-based storage, data transfer, DNS management, and a static IP - for a low, predictable price. You manage those
  Lightsail servers through the Lightsail console or by using the API or command-line interface (CLI).


  For more information about Lightsail concepts and tasks, see the Lightsail Dev Guide.


  To use the Lightsail API or the CLI, you will need to use AWS Identity and Access Management (IAM) to generate access
  keys. For details about how to set this up, see the Lightsail Dev Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.lightsail AmazonLightsail]))

(defn update-relational-database-parameters
  "Allows the update of one or more parameters of a database in Amazon Lightsail.


   Parameter updates don't cause outages; therefore, their application is not subject to the preferred maintenance
   window. However, there are two ways in which paramater updates are applied: dynamic or
   pending-reboot. Parameters marked with a dynamic apply type are applied immediately.
   Parameters marked with a pending-reboot apply type are applied only after the database is rebooted
   using the reboot relational database operation.


   The update relational database parameters operation supports tag-based access control via resource
   tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.

  update-relational-database-parameters-request - `com.amazonaws.services.lightsail.model.UpdateRelationalDatabaseParametersRequest`

  returns: Result of the UpdateRelationalDatabaseParameters operation returned by the service. - `com.amazonaws.services.lightsail.model.UpdateRelationalDatabaseParametersResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.UpdateRelationalDatabaseParametersResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.UpdateRelationalDatabaseParametersRequest update-relational-database-parameters-request]
    (-> this (.updateRelationalDatabaseParameters update-relational-database-parameters-request))))

(defn delete-domain-entry
  "Deletes a specific domain entry.


   The delete domain entry operation supports tag-based access control via resource tags applied to the
   resource identified by domainName. For more information, see the Lightsail Dev Guide.

  delete-domain-entry-request - `com.amazonaws.services.lightsail.model.DeleteDomainEntryRequest`

  returns: Result of the DeleteDomainEntry operation returned by the service. - `com.amazonaws.services.lightsail.model.DeleteDomainEntryResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.DeleteDomainEntryResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.DeleteDomainEntryRequest delete-domain-entry-request]
    (-> this (.deleteDomainEntry delete-domain-entry-request))))

(defn detach-instances-from-load-balancer
  "Detaches the specified instances from a Lightsail load balancer.


   This operation waits until the instances are no longer needed before they are detached from the load balancer.


   The detach instances from load balancer operation supports tag-based access control via resource
   tags applied to the resource identified by loadBalancerName. For more information, see the Lightsail Dev Guide.

  detach-instances-from-load-balancer-request - `com.amazonaws.services.lightsail.model.DetachInstancesFromLoadBalancerRequest`

  returns: Result of the DetachInstancesFromLoadBalancer operation returned by the service. - `com.amazonaws.services.lightsail.model.DetachInstancesFromLoadBalancerResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.DetachInstancesFromLoadBalancerResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.DetachInstancesFromLoadBalancerRequest detach-instances-from-load-balancer-request]
    (-> this (.detachInstancesFromLoadBalancer detach-instances-from-load-balancer-request))))

(defn delete-relational-database
  "Deletes a database in Amazon Lightsail.


   The delete relational database operation supports tag-based access control via resource tags applied
   to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.

  delete-relational-database-request - `com.amazonaws.services.lightsail.model.DeleteRelationalDatabaseRequest`

  returns: Result of the DeleteRelationalDatabase operation returned by the service. - `com.amazonaws.services.lightsail.model.DeleteRelationalDatabaseResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.DeleteRelationalDatabaseResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.DeleteRelationalDatabaseRequest delete-relational-database-request]
    (-> this (.deleteRelationalDatabase delete-relational-database-request))))

(defn peer-vpc
  "Tries to peer the Lightsail VPC with the user's default VPC.

  peer-vpc-request - `com.amazonaws.services.lightsail.model.PeerVpcRequest`

  returns: Result of the PeerVpc operation returned by the service. - `com.amazonaws.services.lightsail.model.PeerVpcResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.PeerVpcResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.PeerVpcRequest peer-vpc-request]
    (-> this (.peerVpc peer-vpc-request))))

(defn release-static-ip
  "Deletes a specific static IP from your account.

  release-static-ip-request - `com.amazonaws.services.lightsail.model.ReleaseStaticIpRequest`

  returns: Result of the ReleaseStaticIp operation returned by the service. - `com.amazonaws.services.lightsail.model.ReleaseStaticIpResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.ReleaseStaticIpResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.ReleaseStaticIpRequest release-static-ip-request]
    (-> this (.releaseStaticIp release-static-ip-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AmazonLightsail this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn create-instance-snapshot
  "Creates a snapshot of a specific virtual private server, or instance. You can use a snapshot to create a
   new instance that is based on that snapshot.


   The create instance snapshot operation supports tag-based access control via request tags. For more
   information, see the Lightsail Dev Guide.

  create-instance-snapshot-request - `com.amazonaws.services.lightsail.model.CreateInstanceSnapshotRequest`

  returns: Result of the CreateInstanceSnapshot operation returned by the service. - `com.amazonaws.services.lightsail.model.CreateInstanceSnapshotResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.CreateInstanceSnapshotResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.CreateInstanceSnapshotRequest create-instance-snapshot-request]
    (-> this (.createInstanceSnapshot create-instance-snapshot-request))))

(defn get-relational-database-master-user-password
  "Returns the current, previous, or pending versions of the master user password for a Lightsail database.


   The asdf operation GetRelationalDatabaseMasterUserPassword supports tag-based access control via
   resource tags applied to the resource identified by relationalDatabaseName.

  get-relational-database-master-user-password-request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseMasterUserPasswordRequest`

  returns: Result of the GetRelationalDatabaseMasterUserPassword operation returned by the service. - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseMasterUserPasswordResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.GetRelationalDatabaseMasterUserPasswordResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseMasterUserPasswordRequest get-relational-database-master-user-password-request]
    (-> this (.getRelationalDatabaseMasterUserPassword get-relational-database-master-user-password-request))))

(defn get-instance-metric-data
  "Returns the data points for the specified Amazon Lightsail instance metric, given an instance name.

  get-instance-metric-data-request - `com.amazonaws.services.lightsail.model.GetInstanceMetricDataRequest`

  returns: Result of the GetInstanceMetricData operation returned by the service. - `com.amazonaws.services.lightsail.model.GetInstanceMetricDataResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.GetInstanceMetricDataResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.GetInstanceMetricDataRequest get-instance-metric-data-request]
    (-> this (.getInstanceMetricData get-instance-metric-data-request))))

(defn start-instance
  "Starts a specific Amazon Lightsail instance from a stopped state. To restart an instance, use the
   reboot instance operation.



   When you start a stopped instance, Lightsail assigns a new public IP address to the instance. To use the same IP
   address after stopping and starting an instance, create a static IP address and attach it to the instance. For
   more information, see the Lightsail Dev Guide.



   The start instance operation supports tag-based access control via resource tags applied to the
   resource identified by instanceName. For more information, see the Lightsail Dev Guide.

  start-instance-request - `com.amazonaws.services.lightsail.model.StartInstanceRequest`

  returns: Result of the StartInstance operation returned by the service. - `com.amazonaws.services.lightsail.model.StartInstanceResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.StartInstanceResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.StartInstanceRequest start-instance-request]
    (-> this (.startInstance start-instance-request))))

(defn unpeer-vpc
  "Attempts to unpeer the Lightsail VPC from the user's default VPC.

  unpeer-vpc-request - `com.amazonaws.services.lightsail.model.UnpeerVpcRequest`

  returns: Result of the UnpeerVpc operation returned by the service. - `com.amazonaws.services.lightsail.model.UnpeerVpcResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.UnpeerVpcResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.UnpeerVpcRequest unpeer-vpc-request]
    (-> this (.unpeerVpc unpeer-vpc-request))))

(defn get-relational-database-events
  "Returns a list of events for a specific database in Amazon Lightsail.

  get-relational-database-events-request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseEventsRequest`

  returns: Result of the GetRelationalDatabaseEvents operation returned by the service. - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseEventsResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.GetRelationalDatabaseEventsResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseEventsRequest get-relational-database-events-request]
    (-> this (.getRelationalDatabaseEvents get-relational-database-events-request))))

(defn attach-static-ip
  "Attaches a static IP address to a specific Amazon Lightsail instance.

  attach-static-ip-request - `com.amazonaws.services.lightsail.model.AttachStaticIpRequest`

  returns: Result of the AttachStaticIp operation returned by the service. - `com.amazonaws.services.lightsail.model.AttachStaticIpResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.AttachStaticIpResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.AttachStaticIpRequest attach-static-ip-request]
    (-> this (.attachStaticIp attach-static-ip-request))))

(defn delete-disk-snapshot
  "Deletes the specified disk snapshot.


   When you make periodic snapshots of a disk, the snapshots are incremental, and only the blocks on the device that
   have changed since your last snapshot are saved in the new snapshot. When you delete a snapshot, only the data
   not needed for any other snapshot is removed. So regardless of which prior snapshots have been deleted, all
   active snapshots will have access to all the information needed to restore the disk.


   The delete disk snapshot operation supports tag-based access control via resource tags applied to
   the resource identified by diskSnapshotName. For more information, see the Lightsail Dev Guide.

  delete-disk-snapshot-request - `com.amazonaws.services.lightsail.model.DeleteDiskSnapshotRequest`

  returns: Result of the DeleteDiskSnapshot operation returned by the service. - `com.amazonaws.services.lightsail.model.DeleteDiskSnapshotResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.DeleteDiskSnapshotResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.DeleteDiskSnapshotRequest delete-disk-snapshot-request]
    (-> this (.deleteDiskSnapshot delete-disk-snapshot-request))))

(defn delete-instance-snapshot
  "Deletes a specific snapshot of a virtual private server (or instance).


   The delete instance snapshot operation supports tag-based access control via resource tags applied
   to the resource identified by instanceSnapshotName. For more information, see the Lightsail Dev Guide.

  delete-instance-snapshot-request - `com.amazonaws.services.lightsail.model.DeleteInstanceSnapshotRequest`

  returns: Result of the DeleteInstanceSnapshot operation returned by the service. - `com.amazonaws.services.lightsail.model.DeleteInstanceSnapshotResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.DeleteInstanceSnapshotResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.DeleteInstanceSnapshotRequest delete-instance-snapshot-request]
    (-> this (.deleteInstanceSnapshot delete-instance-snapshot-request))))

(defn get-instance-snapshots
  "Returns all instance snapshots for the user's account.

  get-instance-snapshots-request - `com.amazonaws.services.lightsail.model.GetInstanceSnapshotsRequest`

  returns: Result of the GetInstanceSnapshots operation returned by the service. - `com.amazonaws.services.lightsail.model.GetInstanceSnapshotsResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.GetInstanceSnapshotsResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.GetInstanceSnapshotsRequest get-instance-snapshots-request]
    (-> this (.getInstanceSnapshots get-instance-snapshots-request))))

(defn create-disk-snapshot
  "Creates a snapshot of a block storage disk. You can use snapshots for backups, to make copies of disks, and to
   save data before shutting down a Lightsail instance.


   You can take a snapshot of an attached disk that is in use; however, snapshots only capture data that has been
   written to your disk at the time the snapshot command is issued. This may exclude any data that has been cached
   by any applications or the operating system. If you can pause any file systems on the disk long enough to take a
   snapshot, your snapshot should be complete. Nevertheless, if you cannot pause all file writes to the disk, you
   should unmount the disk from within the Lightsail instance, issue the create disk snapshot command, and then
   remount the disk to ensure a consistent and complete snapshot. You may remount and use your disk while the
   snapshot status is pending.


   You can also use this operation to create a snapshot of an instance's system volume. You might want to do this,
   for example, to recover data from the system volume of a botched instance or to create a backup of the system
   volume like you would for a block storage disk. To create a snapshot of a system volume, just define the
   instance name parameter when issuing the snapshot command, and a snapshot of the defined instance's
   system volume will be created. After the snapshot is available, you can create a block storage disk from the
   snapshot and attach it to a running instance to access the data on the disk.


   The create disk snapshot operation supports tag-based access control via request tags. For more
   information, see the Lightsail Dev Guide.

  create-disk-snapshot-request - `com.amazonaws.services.lightsail.model.CreateDiskSnapshotRequest`

  returns: Result of the CreateDiskSnapshot operation returned by the service. - `com.amazonaws.services.lightsail.model.CreateDiskSnapshotResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.CreateDiskSnapshotResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.CreateDiskSnapshotRequest create-disk-snapshot-request]
    (-> this (.createDiskSnapshot create-disk-snapshot-request))))

(defn delete-disk
  "Deletes the specified block storage disk. The disk must be in the available state (not attached to a
   Lightsail instance).



   The disk may remain in the deleting state for several minutes.



   The delete disk operation supports tag-based access control via resource tags applied to the
   resource identified by diskName. For more information, see the Lightsail Dev Guide.

  delete-disk-request - `com.amazonaws.services.lightsail.model.DeleteDiskRequest`

  returns: Result of the DeleteDisk operation returned by the service. - `com.amazonaws.services.lightsail.model.DeleteDiskResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.DeleteDiskResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.DeleteDiskRequest delete-disk-request]
    (-> this (.deleteDisk delete-disk-request))))

(defn get-operations
  "Returns information about all operations.


   Results are returned from oldest to newest, up to a maximum of 200. Results can be paged by making each
   subsequent call to GetOperations use the maximum (last) statusChangedAt value from the
   previous request.

  get-operations-request - `com.amazonaws.services.lightsail.model.GetOperationsRequest`

  returns: Result of the GetOperations operation returned by the service. - `com.amazonaws.services.lightsail.model.GetOperationsResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.GetOperationsResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.GetOperationsRequest get-operations-request]
    (-> this (.getOperations get-operations-request))))

(defn delete-relational-database-snapshot
  "Deletes a database snapshot in Amazon Lightsail.


   The delete relational database snapshot operation supports tag-based access control via resource
   tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.

  delete-relational-database-snapshot-request - `com.amazonaws.services.lightsail.model.DeleteRelationalDatabaseSnapshotRequest`

  returns: Result of the DeleteRelationalDatabaseSnapshot operation returned by the service. - `com.amazonaws.services.lightsail.model.DeleteRelationalDatabaseSnapshotResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.DeleteRelationalDatabaseSnapshotResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.DeleteRelationalDatabaseSnapshotRequest delete-relational-database-snapshot-request]
    (-> this (.deleteRelationalDatabaseSnapshot delete-relational-database-snapshot-request))))

(defn get-instances
  "Returns information about all Amazon Lightsail virtual private servers, or instances.

  get-instances-request - `com.amazonaws.services.lightsail.model.GetInstancesRequest`

  returns: Result of the GetInstances operation returned by the service. - `com.amazonaws.services.lightsail.model.GetInstancesResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.GetInstancesResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.GetInstancesRequest get-instances-request]
    (-> this (.getInstances get-instances-request))))

(defn is-vpc-peered
  "Returns a Boolean value indicating whether your Lightsail VPC is peered.

  is-vpc-peered-request - `com.amazonaws.services.lightsail.model.IsVpcPeeredRequest`

  returns: Result of the IsVpcPeered operation returned by the service. - `com.amazonaws.services.lightsail.model.IsVpcPeeredResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.IsVpcPeeredResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.IsVpcPeeredRequest is-vpc-peered-request]
    (-> this (.isVpcPeered is-vpc-peered-request))))

(defn copy-snapshot
  "Copies an instance or disk snapshot from one AWS Region to another in Amazon Lightsail.

  copy-snapshot-request - `com.amazonaws.services.lightsail.model.CopySnapshotRequest`

  returns: Result of the CopySnapshot operation returned by the service. - `com.amazonaws.services.lightsail.model.CopySnapshotResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.CopySnapshotResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.CopySnapshotRequest copy-snapshot-request]
    (-> this (.copySnapshot copy-snapshot-request))))

(defn get-relational-database-blueprints
  "Returns a list of available database blueprints in Amazon Lightsail. A blueprint describes the major engine
   version of a database.


   You can use a blueprint ID to create a new database that runs a specific database engine.

  get-relational-database-blueprints-request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseBlueprintsRequest`

  returns: Result of the GetRelationalDatabaseBlueprints operation returned by the service. - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseBlueprintsResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.GetRelationalDatabaseBlueprintsResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseBlueprintsRequest get-relational-database-blueprints-request]
    (-> this (.getRelationalDatabaseBlueprints get-relational-database-blueprints-request))))

(defn create-instances-from-snapshot
  "Uses a specific snapshot as a blueprint for creating one or more new instances that are based on that identical
   configuration.


   The create instances from snapshot operation supports tag-based access control via request tags and
   resource tags applied to the resource identified by instanceSnapshotName. For more information, see the Lightsail Dev Guide.

  create-instances-from-snapshot-request - `com.amazonaws.services.lightsail.model.CreateInstancesFromSnapshotRequest`

  returns: Result of the CreateInstancesFromSnapshot operation returned by the service. - `com.amazonaws.services.lightsail.model.CreateInstancesFromSnapshotResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.CreateInstancesFromSnapshotResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.CreateInstancesFromSnapshotRequest create-instances-from-snapshot-request]
    (-> this (.createInstancesFromSnapshot create-instances-from-snapshot-request))))

(defn get-load-balancer-tls-certificates
  "Returns information about the TLS certificates that are associated with the specified Lightsail load balancer.


   TLS is just an updated, more secure version of Secure Socket Layer (SSL).


   You can have a maximum of 2 certificates associated with a Lightsail load balancer. One is active and the other
   is inactive.

  get-load-balancer-tls-certificates-request - `com.amazonaws.services.lightsail.model.GetLoadBalancerTlsCertificatesRequest`

  returns: Result of the GetLoadBalancerTlsCertificates operation returned by the service. - `com.amazonaws.services.lightsail.model.GetLoadBalancerTlsCertificatesResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.GetLoadBalancerTlsCertificatesResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.GetLoadBalancerTlsCertificatesRequest get-load-balancer-tls-certificates-request]
    (-> this (.getLoadBalancerTlsCertificates get-load-balancer-tls-certificates-request))))

(defn untag-resource
  "Deletes the specified set of tag keys and their values from the specified Amazon Lightsail resource.


   The untag resource operation supports tag-based access control via request tags and resource tags
   applied to the resource identified by resourceName. For more information, see the Lightsail Dev Guide.

  untag-resource-request - `com.amazonaws.services.lightsail.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.lightsail.model.UntagResourceResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.UntagResourceResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn get-static-ips
  "Returns information about all static IPs in the user's account.

  get-static-ips-request - `com.amazonaws.services.lightsail.model.GetStaticIpsRequest`

  returns: Result of the GetStaticIps operation returned by the service. - `com.amazonaws.services.lightsail.model.GetStaticIpsResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.GetStaticIpsResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.GetStaticIpsRequest get-static-ips-request]
    (-> this (.getStaticIps get-static-ips-request))))

(defn attach-disk
  "Attaches a block storage disk to a running or stopped Lightsail instance and exposes it to the instance with the
   specified disk name.


   The attach disk operation supports tag-based access control via resource tags applied to the
   resource identified by diskName. For more information, see the Lightsail Dev Guide.

  attach-disk-request - `com.amazonaws.services.lightsail.model.AttachDiskRequest`

  returns: Result of the AttachDisk operation returned by the service. - `com.amazonaws.services.lightsail.model.AttachDiskResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.AttachDiskResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.AttachDiskRequest attach-disk-request]
    (-> this (.attachDisk attach-disk-request))))

(defn delete-domain
  "Deletes the specified domain recordset and all of its domain records.


   The delete domain operation supports tag-based access control via resource tags applied to the
   resource identified by domainName. For more information, see the Lightsail Dev Guide.

  delete-domain-request - `com.amazonaws.services.lightsail.model.DeleteDomainRequest`

  returns: Result of the DeleteDomain operation returned by the service. - `com.amazonaws.services.lightsail.model.DeleteDomainResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.DeleteDomainResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.DeleteDomainRequest delete-domain-request]
    (-> this (.deleteDomain delete-domain-request))))

(defn stop-instance
  "Stops a specific Amazon Lightsail instance that is currently running.



   When you start a stopped instance, Lightsail assigns a new public IP address to the instance. To use the same IP
   address after stopping and starting an instance, create a static IP address and attach it to the instance. For
   more information, see the Lightsail Dev Guide.



   The stop instance operation supports tag-based access control via resource tags applied to the
   resource identified by instanceName. For more information, see the Lightsail Dev Guide.

  stop-instance-request - `com.amazonaws.services.lightsail.model.StopInstanceRequest`

  returns: Result of the StopInstance operation returned by the service. - `com.amazonaws.services.lightsail.model.StopInstanceResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.StopInstanceResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.StopInstanceRequest stop-instance-request]
    (-> this (.stopInstance stop-instance-request))))

(defn get-active-names
  "Returns the names of all active (not deleted) resources.

  get-active-names-request - `com.amazonaws.services.lightsail.model.GetActiveNamesRequest`

  returns: Result of the GetActiveNames operation returned by the service. - `com.amazonaws.services.lightsail.model.GetActiveNamesResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.GetActiveNamesResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.GetActiveNamesRequest get-active-names-request]
    (-> this (.getActiveNames get-active-names-request))))

(defn reboot-instance
  "Restarts a specific instance.


   The reboot instance operation supports tag-based access control via resource tags applied to the
   resource identified by instanceName. For more information, see the Lightsail Dev Guide.

  reboot-instance-request - `com.amazonaws.services.lightsail.model.RebootInstanceRequest`

  returns: Result of the RebootInstance operation returned by the service. - `com.amazonaws.services.lightsail.model.RebootInstanceResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.RebootInstanceResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.RebootInstanceRequest reboot-instance-request]
    (-> this (.rebootInstance reboot-instance-request))))

(defn create-relational-database-from-snapshot
  "Creates a new database from an existing database snapshot in Amazon Lightsail.


   You can create a new database from a snapshot in if something goes wrong with your original database, or to
   change it to a different plan, such as a high availability or standard plan.


   The create relational database from snapshot operation supports tag-based access control via request
   tags and resource tags applied to the resource identified by relationalDatabaseSnapshotName. For more
   information, see the Lightsail Dev Guide.

  create-relational-database-from-snapshot-request - `com.amazonaws.services.lightsail.model.CreateRelationalDatabaseFromSnapshotRequest`

  returns: Result of the CreateRelationalDatabaseFromSnapshot operation returned by the service. - `com.amazonaws.services.lightsail.model.CreateRelationalDatabaseFromSnapshotResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.CreateRelationalDatabaseFromSnapshotResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.CreateRelationalDatabaseFromSnapshotRequest create-relational-database-from-snapshot-request]
    (-> this (.createRelationalDatabaseFromSnapshot create-relational-database-from-snapshot-request))))

(defn create-instances
  "Creates one or more Amazon Lightsail virtual private servers, or instances. Create instances using active
   blueprints. Inactive blueprints are listed to support customers with existing instances but are not necessarily
   available for launch of new instances. Blueprints are marked inactive when they become outdated due to operating
   system updates or new application releases. Use the get blueprints operation to return a list of available
   blueprints.


   The create instances operation supports tag-based access control via request tags. For more
   information, see the Lightsail Dev Guide.

  create-instances-request - `com.amazonaws.services.lightsail.model.CreateInstancesRequest`

  returns: Result of the CreateInstances operation returned by the service. - `com.amazonaws.services.lightsail.model.CreateInstancesResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.CreateInstancesResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.CreateInstancesRequest create-instances-request]
    (-> this (.createInstances create-instances-request))))

(defn put-instance-public-ports
  "Sets the specified open ports for an Amazon Lightsail instance, and closes all ports for every protocol not
   included in the current request.


   The put instance public ports operation supports tag-based access control via resource tags applied
   to the resource identified by instanceName. For more information, see the Lightsail Dev Guide.

  put-instance-public-ports-request - `com.amazonaws.services.lightsail.model.PutInstancePublicPortsRequest`

  returns: Result of the PutInstancePublicPorts operation returned by the service. - `com.amazonaws.services.lightsail.model.PutInstancePublicPortsResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.PutInstancePublicPortsResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.PutInstancePublicPortsRequest put-instance-public-ports-request]
    (-> this (.putInstancePublicPorts put-instance-public-ports-request))))

(defn get-disk
  "Returns information about a specific block storage disk.

  get-disk-request - `com.amazonaws.services.lightsail.model.GetDiskRequest`

  returns: Result of the GetDisk operation returned by the service. - `com.amazonaws.services.lightsail.model.GetDiskResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.GetDiskResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.GetDiskRequest get-disk-request]
    (-> this (.getDisk get-disk-request))))

(defn get-relational-database-bundles
  "Returns the list of bundles that are available in Amazon Lightsail. A bundle describes the performance
   specifications for a database.


   You can use a bundle ID to create a new database with explicit performance specifications.

  get-relational-database-bundles-request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseBundlesRequest`

  returns: Result of the GetRelationalDatabaseBundles operation returned by the service. - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseBundlesResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.GetRelationalDatabaseBundlesResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseBundlesRequest get-relational-database-bundles-request]
    (-> this (.getRelationalDatabaseBundles get-relational-database-bundles-request))))

(defn get-operations-for-resource
  "Gets operations for a specific resource (e.g., an instance or a static IP).

  get-operations-for-resource-request - `com.amazonaws.services.lightsail.model.GetOperationsForResourceRequest`

  returns: Result of the GetOperationsForResource operation returned by the service. - `com.amazonaws.services.lightsail.model.GetOperationsForResourceResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.GetOperationsForResourceResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.GetOperationsForResourceRequest get-operations-for-resource-request]
    (-> this (.getOperationsForResource get-operations-for-resource-request))))

(defn create-relational-database
  "Creates a new database in Amazon Lightsail.


   The create relational database operation supports tag-based access control via request tags. For
   more information, see the Lightsail Dev Guide.

  create-relational-database-request - `com.amazonaws.services.lightsail.model.CreateRelationalDatabaseRequest`

  returns: Result of the CreateRelationalDatabase operation returned by the service. - `com.amazonaws.services.lightsail.model.CreateRelationalDatabaseResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.CreateRelationalDatabaseResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.CreateRelationalDatabaseRequest create-relational-database-request]
    (-> this (.createRelationalDatabase create-relational-database-request))))

(defn get-load-balancers
  "Returns information about all load balancers in an account.


   If you are describing a long list of load balancers, you can paginate the output to make the list more
   manageable. You can use the pageToken and nextPageToken values to retrieve the next items in the list.

  get-load-balancers-request - `com.amazonaws.services.lightsail.model.GetLoadBalancersRequest`

  returns: Result of the GetLoadBalancers operation returned by the service. - `com.amazonaws.services.lightsail.model.GetLoadBalancersResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.GetLoadBalancersResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.GetLoadBalancersRequest get-load-balancers-request]
    (-> this (.getLoadBalancers get-load-balancers-request))))

(defn get-key-pairs
  "Returns information about all key pairs in the user's account.

  get-key-pairs-request - `com.amazonaws.services.lightsail.model.GetKeyPairsRequest`

  returns: Result of the GetKeyPairs operation returned by the service. - `com.amazonaws.services.lightsail.model.GetKeyPairsResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.GetKeyPairsResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.GetKeyPairsRequest get-key-pairs-request]
    (-> this (.getKeyPairs get-key-pairs-request))))

(defn get-instance-snapshot
  "Returns information about a specific instance snapshot.

  get-instance-snapshot-request - `com.amazonaws.services.lightsail.model.GetInstanceSnapshotRequest`

  returns: Result of the GetInstanceSnapshot operation returned by the service. - `com.amazonaws.services.lightsail.model.GetInstanceSnapshotResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.GetInstanceSnapshotResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.GetInstanceSnapshotRequest get-instance-snapshot-request]
    (-> this (.getInstanceSnapshot get-instance-snapshot-request))))

(defn get-bundles
  "Returns the list of bundles that are available for purchase. A bundle describes the specs for your virtual
   private server (or instance).

  get-bundles-request - `com.amazonaws.services.lightsail.model.GetBundlesRequest`

  returns: Result of the GetBundles operation returned by the service. - `com.amazonaws.services.lightsail.model.GetBundlesResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.GetBundlesResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.GetBundlesRequest get-bundles-request]
    (-> this (.getBundles get-bundles-request))))

(defn get-instance-state
  "Returns the state of a specific instance. Works on one instance at a time.

  get-instance-state-request - `com.amazonaws.services.lightsail.model.GetInstanceStateRequest`

  returns: Result of the GetInstanceState operation returned by the service. - `com.amazonaws.services.lightsail.model.GetInstanceStateResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.GetInstanceStateResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.GetInstanceStateRequest get-instance-state-request]
    (-> this (.getInstanceState get-instance-state-request))))

(defn get-relational-database-snapshots
  "Returns information about all of your database snapshots in Amazon Lightsail.

  get-relational-database-snapshots-request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseSnapshotsRequest`

  returns: Result of the GetRelationalDatabaseSnapshots operation returned by the service. - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseSnapshotsResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.GetRelationalDatabaseSnapshotsResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseSnapshotsRequest get-relational-database-snapshots-request]
    (-> this (.getRelationalDatabaseSnapshots get-relational-database-snapshots-request))))

(defn update-relational-database
  "Allows the update of one or more attributes of a database in Amazon Lightsail.


   Updates are applied immediately, or in cases where the updates could result in an outage, are applied during the
   database's predefined maintenance window.


   The update relational database operation supports tag-based access control via resource tags applied
   to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.

  update-relational-database-request - `com.amazonaws.services.lightsail.model.UpdateRelationalDatabaseRequest`

  returns: Result of the UpdateRelationalDatabase operation returned by the service. - `com.amazonaws.services.lightsail.model.UpdateRelationalDatabaseResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.UpdateRelationalDatabaseResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.UpdateRelationalDatabaseRequest update-relational-database-request]
    (-> this (.updateRelationalDatabase update-relational-database-request))))

(defn get-relational-database-log-streams
  "Returns a list of available log streams for a specific database in Amazon Lightsail.

  get-relational-database-log-streams-request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseLogStreamsRequest`

  returns: Result of the GetRelationalDatabaseLogStreams operation returned by the service. - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseLogStreamsResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.GetRelationalDatabaseLogStreamsResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseLogStreamsRequest get-relational-database-log-streams-request]
    (-> this (.getRelationalDatabaseLogStreams get-relational-database-log-streams-request))))

(defn get-relational-database-log-events
  "Returns a list of log events for a database in Amazon Lightsail.

  get-relational-database-log-events-request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseLogEventsRequest`

  returns: Result of the GetRelationalDatabaseLogEvents operation returned by the service. - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseLogEventsResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.GetRelationalDatabaseLogEventsResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseLogEventsRequest get-relational-database-log-events-request]
    (-> this (.getRelationalDatabaseLogEvents get-relational-database-log-events-request))))

(defn start-relational-database
  "Starts a specific database from a stopped state in Amazon Lightsail. To restart a database, use the
   reboot relational database operation.


   The start relational database operation supports tag-based access control via resource tags applied
   to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.

  start-relational-database-request - `com.amazonaws.services.lightsail.model.StartRelationalDatabaseRequest`

  returns: Result of the StartRelationalDatabase operation returned by the service. - `com.amazonaws.services.lightsail.model.StartRelationalDatabaseResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.StartRelationalDatabaseResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.StartRelationalDatabaseRequest start-relational-database-request]
    (-> this (.startRelationalDatabase start-relational-database-request))))

(defn get-relational-database-snapshot
  "Returns information about a specific database snapshot in Amazon Lightsail.

  get-relational-database-snapshot-request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseSnapshotRequest`

  returns: Result of the GetRelationalDatabaseSnapshot operation returned by the service. - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseSnapshotResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.GetRelationalDatabaseSnapshotResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseSnapshotRequest get-relational-database-snapshot-request]
    (-> this (.getRelationalDatabaseSnapshot get-relational-database-snapshot-request))))

(defn create-domain
  "Creates a domain resource for the specified domain (e.g., example.com).


   The create domain operation supports tag-based access control via request tags. For more
   information, see the Lightsail Dev Guide.

  create-domain-request - `com.amazonaws.services.lightsail.model.CreateDomainRequest`

  returns: Result of the CreateDomain operation returned by the service. - `com.amazonaws.services.lightsail.model.CreateDomainResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.CreateDomainResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.CreateDomainRequest create-domain-request]
    (-> this (.createDomain create-domain-request))))

(defn get-instance-port-states
  "Returns the port states for a specific virtual private server, or instance.

  get-instance-port-states-request - `com.amazonaws.services.lightsail.model.GetInstancePortStatesRequest`

  returns: Result of the GetInstancePortStates operation returned by the service. - `com.amazonaws.services.lightsail.model.GetInstancePortStatesResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.GetInstancePortStatesResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.GetInstancePortStatesRequest get-instance-port-states-request]
    (-> this (.getInstancePortStates get-instance-port-states-request))))

(defn create-key-pair
  "Creates an SSH key pair.


   The create key pair operation supports tag-based access control via request tags. For more
   information, see the Lightsail Dev Guide.

  create-key-pair-request - `com.amazonaws.services.lightsail.model.CreateKeyPairRequest`

  returns: Result of the CreateKeyPair operation returned by the service. - `com.amazonaws.services.lightsail.model.CreateKeyPairResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.CreateKeyPairResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.CreateKeyPairRequest create-key-pair-request]
    (-> this (.createKeyPair create-key-pair-request))))

(defn delete-instance
  "Deletes a specific Amazon Lightsail virtual private server, or instance.


   The delete instance operation supports tag-based access control via resource tags applied to the
   resource identified by instanceName. For more information, see the Lightsail Dev Guide.

  delete-instance-request - `com.amazonaws.services.lightsail.model.DeleteInstanceRequest`

  returns: Result of the DeleteInstance operation returned by the service. - `com.amazonaws.services.lightsail.model.DeleteInstanceResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.DeleteInstanceResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.DeleteInstanceRequest delete-instance-request]
    (-> this (.deleteInstance delete-instance-request))))

(defn get-relational-databases
  "Returns information about all of your databases in Amazon Lightsail.

  get-relational-databases-request - `com.amazonaws.services.lightsail.model.GetRelationalDatabasesRequest`

  returns: Result of the GetRelationalDatabases operation returned by the service. - `com.amazonaws.services.lightsail.model.GetRelationalDatabasesResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.GetRelationalDatabasesResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.GetRelationalDatabasesRequest get-relational-databases-request]
    (-> this (.getRelationalDatabases get-relational-databases-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonLightsail this]
    (-> this (.shutdown))))

(defn download-default-key-pair
  "Downloads the default SSH key pair from the user's account.

  download-default-key-pair-request - `com.amazonaws.services.lightsail.model.DownloadDefaultKeyPairRequest`

  returns: Result of the DownloadDefaultKeyPair operation returned by the service. - `com.amazonaws.services.lightsail.model.DownloadDefaultKeyPairResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.DownloadDefaultKeyPairResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.DownloadDefaultKeyPairRequest download-default-key-pair-request]
    (-> this (.downloadDefaultKeyPair download-default-key-pair-request))))

(defn close-instance-public-ports
  "Closes the public ports on a specific Amazon Lightsail instance.


   The close instance public ports operation supports tag-based access control via resource tags
   applied to the resource identified by instanceName. For more information, see the Lightsail Dev Guide.

  close-instance-public-ports-request - `com.amazonaws.services.lightsail.model.CloseInstancePublicPortsRequest`

  returns: Result of the CloseInstancePublicPorts operation returned by the service. - `com.amazonaws.services.lightsail.model.CloseInstancePublicPortsResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.CloseInstancePublicPortsResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.CloseInstancePublicPortsRequest close-instance-public-ports-request]
    (-> this (.closeInstancePublicPorts close-instance-public-ports-request))))

(defn get-cloud-formation-stack-records
  "Returns the CloudFormation stack record created as a result of the create cloud formation stack
   operation.


   An AWS CloudFormation stack is used to create a new Amazon EC2 instance from an exported Lightsail snapshot.

  get-cloud-formation-stack-records-request - `com.amazonaws.services.lightsail.model.GetCloudFormationStackRecordsRequest`

  returns: Result of the GetCloudFormationStackRecords operation returned by the service. - `com.amazonaws.services.lightsail.model.GetCloudFormationStackRecordsResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.GetCloudFormationStackRecordsResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.GetCloudFormationStackRecordsRequest get-cloud-formation-stack-records-request]
    (-> this (.getCloudFormationStackRecords get-cloud-formation-stack-records-request))))

(defn reboot-relational-database
  "Restarts a specific database in Amazon Lightsail.


   The reboot relational database operation supports tag-based access control via resource tags applied
   to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.

  reboot-relational-database-request - `com.amazonaws.services.lightsail.model.RebootRelationalDatabaseRequest`

  returns: Result of the RebootRelationalDatabase operation returned by the service. - `com.amazonaws.services.lightsail.model.RebootRelationalDatabaseResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.RebootRelationalDatabaseResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.RebootRelationalDatabaseRequest reboot-relational-database-request]
    (-> this (.rebootRelationalDatabase reboot-relational-database-request))))

(defn get-instance
  "Returns information about a specific Amazon Lightsail instance, which is a virtual private server.

  get-instance-request - `com.amazonaws.services.lightsail.model.GetInstanceRequest`

  returns: Result of the GetInstance operation returned by the service. - `com.amazonaws.services.lightsail.model.GetInstanceResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.GetInstanceResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.GetInstanceRequest get-instance-request]
    (-> this (.getInstance get-instance-request))))

(defn get-load-balancer-metric-data
  "Returns information about health metrics for your Lightsail load balancer.

  get-load-balancer-metric-data-request - `com.amazonaws.services.lightsail.model.GetLoadBalancerMetricDataRequest`

  returns: Result of the GetLoadBalancerMetricData operation returned by the service. - `com.amazonaws.services.lightsail.model.GetLoadBalancerMetricDataResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.GetLoadBalancerMetricDataResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.GetLoadBalancerMetricDataRequest get-load-balancer-metric-data-request]
    (-> this (.getLoadBalancerMetricData get-load-balancer-metric-data-request))))

(defn get-disk-snapshot
  "Returns information about a specific block storage disk snapshot.

  get-disk-snapshot-request - `com.amazonaws.services.lightsail.model.GetDiskSnapshotRequest`

  returns: Result of the GetDiskSnapshot operation returned by the service. - `com.amazonaws.services.lightsail.model.GetDiskSnapshotResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.GetDiskSnapshotResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.GetDiskSnapshotRequest get-disk-snapshot-request]
    (-> this (.getDiskSnapshot get-disk-snapshot-request))))

(defn attach-instances-to-load-balancer
  "Attaches one or more Lightsail instances to a load balancer.


   After some time, the instances are attached to the load balancer and the health check status is available.


   The attach instances to load balancer operation supports tag-based access control via resource tags
   applied to the resource identified by loadBalancerName. For more information, see the Lightsail Dev Guide.

  attach-instances-to-load-balancer-request - `com.amazonaws.services.lightsail.model.AttachInstancesToLoadBalancerRequest`

  returns: Result of the AttachInstancesToLoadBalancer operation returned by the service. - `com.amazonaws.services.lightsail.model.AttachInstancesToLoadBalancerResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.AttachInstancesToLoadBalancerResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.AttachInstancesToLoadBalancerRequest attach-instances-to-load-balancer-request]
    (-> this (.attachInstancesToLoadBalancer attach-instances-to-load-balancer-request))))

(defn create-relational-database-snapshot
  "Creates a snapshot of your database in Amazon Lightsail. You can use snapshots for backups, to make copies of a
   database, and to save data before deleting a database.


   The create relational database snapshot operation supports tag-based access control via request
   tags. For more information, see the Lightsail Dev Guide.

  create-relational-database-snapshot-request - `com.amazonaws.services.lightsail.model.CreateRelationalDatabaseSnapshotRequest`

  returns: Result of the CreateRelationalDatabaseSnapshot operation returned by the service. - `com.amazonaws.services.lightsail.model.CreateRelationalDatabaseSnapshotResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.CreateRelationalDatabaseSnapshotResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.CreateRelationalDatabaseSnapshotRequest create-relational-database-snapshot-request]
    (-> this (.createRelationalDatabaseSnapshot create-relational-database-snapshot-request))))

(defn create-load-balancer-tls-certificate
  "Creates a Lightsail load balancer TLS certificate.


   TLS is just an updated, more secure version of Secure Socket Layer (SSL).


   The create load balancer tls certificate operation supports tag-based access control via resource
   tags applied to the resource identified by loadBalancerName. For more information, see the Lightsail Dev Guide.

  create-load-balancer-tls-certificate-request - `com.amazonaws.services.lightsail.model.CreateLoadBalancerTlsCertificateRequest`

  returns: Result of the CreateLoadBalancerTlsCertificate operation returned by the service. - `com.amazonaws.services.lightsail.model.CreateLoadBalancerTlsCertificateResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.CreateLoadBalancerTlsCertificateResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.CreateLoadBalancerTlsCertificateRequest create-load-balancer-tls-certificate-request]
    (-> this (.createLoadBalancerTlsCertificate create-load-balancer-tls-certificate-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"lightsail.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"lightsail.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AmazonLightsail this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn delete-load-balancer
  "Deletes a Lightsail load balancer and all its associated SSL/TLS certificates. Once the load balancer is deleted,
   you will need to create a new load balancer, create a new certificate, and verify domain ownership again.


   The delete load balancer operation supports tag-based access control via resource tags applied to
   the resource identified by loadBalancerName. For more information, see the Lightsail Dev Guide.

  delete-load-balancer-request - `com.amazonaws.services.lightsail.model.DeleteLoadBalancerRequest`

  returns: Result of the DeleteLoadBalancer operation returned by the service. - `com.amazonaws.services.lightsail.model.DeleteLoadBalancerResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.DeleteLoadBalancerResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.DeleteLoadBalancerRequest delete-load-balancer-request]
    (-> this (.deleteLoadBalancer delete-load-balancer-request))))

(defn get-static-ip
  "Returns information about a specific static IP.

  get-static-ip-request - `com.amazonaws.services.lightsail.model.GetStaticIpRequest`

  returns: Result of the GetStaticIp operation returned by the service. - `com.amazonaws.services.lightsail.model.GetStaticIpResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.GetStaticIpResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.GetStaticIpRequest get-static-ip-request]
    (-> this (.getStaticIp get-static-ip-request))))

(defn get-key-pair
  "Returns information about a specific key pair.

  get-key-pair-request - `com.amazonaws.services.lightsail.model.GetKeyPairRequest`

  returns: Result of the GetKeyPair operation returned by the service. - `com.amazonaws.services.lightsail.model.GetKeyPairResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.GetKeyPairResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.GetKeyPairRequest get-key-pair-request]
    (-> this (.getKeyPair get-key-pair-request))))

(defn get-disks
  "Returns information about all block storage disks in your AWS account and region.


   If you are describing a long list of disks, you can paginate the output to make the list more manageable. You can
   use the pageToken and nextPageToken values to retrieve the next items in the list.

  get-disks-request - `com.amazonaws.services.lightsail.model.GetDisksRequest`

  returns: Result of the GetDisks operation returned by the service. - `com.amazonaws.services.lightsail.model.GetDisksResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.GetDisksResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.GetDisksRequest get-disks-request]
    (-> this (.getDisks get-disks-request))))

(defn get-instance-access-details
  "Returns temporary SSH keys you can use to connect to a specific virtual private server, or instance.


   The get instance access details operation supports tag-based access control via resource tags
   applied to the resource identified by instanceName. For more information, see the Lightsail Dev Guide.

  get-instance-access-details-request - `com.amazonaws.services.lightsail.model.GetInstanceAccessDetailsRequest`

  returns: Result of the GetInstanceAccessDetails operation returned by the service. - `com.amazonaws.services.lightsail.model.GetInstanceAccessDetailsResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.GetInstanceAccessDetailsResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.GetInstanceAccessDetailsRequest get-instance-access-details-request]
    (-> this (.getInstanceAccessDetails get-instance-access-details-request))))

(defn import-key-pair
  "Imports a public SSH key from a specific key pair.

  import-key-pair-request - `com.amazonaws.services.lightsail.model.ImportKeyPairRequest`

  returns: Result of the ImportKeyPair operation returned by the service. - `com.amazonaws.services.lightsail.model.ImportKeyPairResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.ImportKeyPairResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.ImportKeyPairRequest import-key-pair-request]
    (-> this (.importKeyPair import-key-pair-request))))

(defn create-domain-entry
  "Creates one of the following entry records associated with the domain: Address (A), canonical name (CNAME), mail
   exchanger (MX), name server (NS), start of authority (SOA), service locator (SRV), or text (TXT).


   The create domain entry operation supports tag-based access control via resource tags applied to the
   resource identified by domainName. For more information, see the Lightsail Dev Guide.

  create-domain-entry-request - `com.amazonaws.services.lightsail.model.CreateDomainEntryRequest`

  returns: Result of the CreateDomainEntry operation returned by the service. - `com.amazonaws.services.lightsail.model.CreateDomainEntryResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.CreateDomainEntryResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.CreateDomainEntryRequest create-domain-entry-request]
    (-> this (.createDomainEntry create-domain-entry-request))))

(defn get-domains
  "Returns a list of all domains in the user's account.

  get-domains-request - `com.amazonaws.services.lightsail.model.GetDomainsRequest`

  returns: Result of the GetDomains operation returned by the service. - `com.amazonaws.services.lightsail.model.GetDomainsResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.GetDomainsResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.GetDomainsRequest get-domains-request]
    (-> this (.getDomains get-domains-request))))

(defn create-load-balancer
  "Creates a Lightsail load balancer. To learn more about deciding whether to load balance your application, see
   Configure your Lightsail instances for load balancing. You can create up to 5 load balancers per AWS Region
   in your account.


   When you create a load balancer, you can specify a unique name and port settings. To change additional load
   balancer settings, use the UpdateLoadBalancerAttribute operation.


   The create load balancer operation supports tag-based access control via request tags. For more
   information, see the Lightsail Dev Guide.

  create-load-balancer-request - `com.amazonaws.services.lightsail.model.CreateLoadBalancerRequest`

  returns: Result of the CreateLoadBalancer operation returned by the service. - `com.amazonaws.services.lightsail.model.CreateLoadBalancerResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.CreateLoadBalancerResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.CreateLoadBalancerRequest create-load-balancer-request]
    (-> this (.createLoadBalancer create-load-balancer-request))))

(defn allocate-static-ip
  "Allocates a static IP address.

  allocate-static-ip-request - `com.amazonaws.services.lightsail.model.AllocateStaticIpRequest`

  returns: Result of the AllocateStaticIp operation returned by the service. - `com.amazonaws.services.lightsail.model.AllocateStaticIpResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.AllocateStaticIpResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.AllocateStaticIpRequest allocate-static-ip-request]
    (-> this (.allocateStaticIp allocate-static-ip-request))))

(defn create-disk-from-snapshot
  "Creates a block storage disk from a disk snapshot that can be attached to a Lightsail instance in the same
   Availability Zone (e.g., us-east-2a). The disk is created in the regional endpoint that you send the
   HTTP request to. For more information, see Regions and Availability Zones in Lightsail.


   The create disk from snapshot operation supports tag-based access control via request tags and
   resource tags applied to the resource identified by diskSnapshotName. For more information, see the Lightsail Dev Guide.

  create-disk-from-snapshot-request - `com.amazonaws.services.lightsail.model.CreateDiskFromSnapshotRequest`

  returns: Result of the CreateDiskFromSnapshot operation returned by the service. - `com.amazonaws.services.lightsail.model.CreateDiskFromSnapshotResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.CreateDiskFromSnapshotResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.CreateDiskFromSnapshotRequest create-disk-from-snapshot-request]
    (-> this (.createDiskFromSnapshot create-disk-from-snapshot-request))))

(defn delete-known-host-keys
  "Deletes the known host key or certificate used by the Amazon Lightsail browser-based SSH or RDP clients to
   authenticate an instance. This operation enables the Lightsail browser-based SSH or RDP clients to connect to the
   instance after a host key mismatch.



   Perform this operation only if you were expecting the host key or certificate mismatch or if you are familiar
   with the new host key or certificate on the instance. For more information, see Troubleshooting connection issues when using the Amazon Lightsail browser-based SSH or RDP client.

  delete-known-host-keys-request - `com.amazonaws.services.lightsail.model.DeleteKnownHostKeysRequest`

  returns: Result of the DeleteKnownHostKeys operation returned by the service. - `com.amazonaws.services.lightsail.model.DeleteKnownHostKeysResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.DeleteKnownHostKeysResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.DeleteKnownHostKeysRequest delete-known-host-keys-request]
    (-> this (.deleteKnownHostKeys delete-known-host-keys-request))))

(defn update-load-balancer-attribute
  "Updates the specified attribute for a load balancer. You can only update one attribute at a time.


   The update load balancer attribute operation supports tag-based access control via resource tags
   applied to the resource identified by loadBalancerName. For more information, see the Lightsail Dev Guide.

  update-load-balancer-attribute-request - `com.amazonaws.services.lightsail.model.UpdateLoadBalancerAttributeRequest`

  returns: Result of the UpdateLoadBalancerAttribute operation returned by the service. - `com.amazonaws.services.lightsail.model.UpdateLoadBalancerAttributeResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.UpdateLoadBalancerAttributeResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.UpdateLoadBalancerAttributeRequest update-load-balancer-attribute-request]
    (-> this (.updateLoadBalancerAttribute update-load-balancer-attribute-request))))

(defn get-export-snapshot-records
  "Returns the export snapshot record created as a result of the export snapshot operation.


   An export snapshot record can be used to create a new Amazon EC2 instance and its related resources with the
   create cloud formation stack operation.

  get-export-snapshot-records-request - `com.amazonaws.services.lightsail.model.GetExportSnapshotRecordsRequest`

  returns: Result of the GetExportSnapshotRecords operation returned by the service. - `com.amazonaws.services.lightsail.model.GetExportSnapshotRecordsResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.GetExportSnapshotRecordsResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.GetExportSnapshotRecordsRequest get-export-snapshot-records-request]
    (-> this (.getExportSnapshotRecords get-export-snapshot-records-request))))

(defn export-snapshot
  "Exports an Amazon Lightsail instance or block storage disk snapshot to Amazon Elastic Compute Cloud (Amazon EC2).
   This operation results in an export snapshot record that can be used with the
   create cloud formation stack operation to create new Amazon EC2 instances.


   Exported instance snapshots appear in Amazon EC2 as Amazon Machine Images (AMIs), and the instance system disk
   appears as an Amazon Elastic Block Store (Amazon EBS) volume. Exported disk snapshots appear in Amazon EC2 as
   Amazon EBS volumes. Snapshots are exported to the same Amazon Web Services Region in Amazon EC2 as the source
   Lightsail snapshot.



   The export snapshot operation supports tag-based access control via resource tags applied to the
   resource identified by sourceSnapshotName. For more information, see the Lightsail Dev Guide.



   Use the get instance snapshots or get disk snapshots operations to get a list of
   snapshots that you can export to Amazon EC2.

  export-snapshot-request - `com.amazonaws.services.lightsail.model.ExportSnapshotRequest`

  returns: Result of the ExportSnapshot operation returned by the service. - `com.amazonaws.services.lightsail.model.ExportSnapshotResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.ExportSnapshotResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.ExportSnapshotRequest export-snapshot-request]
    (-> this (.exportSnapshot export-snapshot-request))))

(defn delete-load-balancer-tls-certificate
  "Deletes an SSL/TLS certificate associated with a Lightsail load balancer.


   The delete load balancer tls certificate operation supports tag-based access control via resource
   tags applied to the resource identified by loadBalancerName. For more information, see the Lightsail Dev Guide.

  delete-load-balancer-tls-certificate-request - `com.amazonaws.services.lightsail.model.DeleteLoadBalancerTlsCertificateRequest`

  returns: Result of the DeleteLoadBalancerTlsCertificate operation returned by the service. - `com.amazonaws.services.lightsail.model.DeleteLoadBalancerTlsCertificateResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.DeleteLoadBalancerTlsCertificateResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.DeleteLoadBalancerTlsCertificateRequest delete-load-balancer-tls-certificate-request]
    (-> this (.deleteLoadBalancerTlsCertificate delete-load-balancer-tls-certificate-request))))

(defn create-cloud-formation-stack
  "Creates an AWS CloudFormation stack, which creates a new Amazon EC2 instance from an exported Amazon Lightsail
   snapshot. This operation results in a CloudFormation stack record that can be used to track the AWS
   CloudFormation stack created. Use the get cloud formation stack records operation to get a list of
   the CloudFormation stacks created.



   Wait until after your new Amazon EC2 instance is created before running the
   create cloud formation stack operation again with the same export snapshot record.

  create-cloud-formation-stack-request - `com.amazonaws.services.lightsail.model.CreateCloudFormationStackRequest`

  returns: Result of the CreateCloudFormationStack operation returned by the service. - `com.amazonaws.services.lightsail.model.CreateCloudFormationStackResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.CreateCloudFormationStackResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.CreateCloudFormationStackRequest create-cloud-formation-stack-request]
    (-> this (.createCloudFormationStack create-cloud-formation-stack-request))))

(defn get-domain
  "Returns information about a specific domain recordset.

  get-domain-request - `com.amazonaws.services.lightsail.model.GetDomainRequest`

  returns: Result of the GetDomain operation returned by the service. - `com.amazonaws.services.lightsail.model.GetDomainResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.GetDomainResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.GetDomainRequest get-domain-request]
    (-> this (.getDomain get-domain-request))))

(defn create-disk
  "Creates a block storage disk that can be attached to a Lightsail instance in the same Availability Zone (e.g.,
   us-east-2a). The disk is created in the regional endpoint that you send the HTTP request to. For
   more information, see Regions and Availability Zones in Lightsail.


   The create disk operation supports tag-based access control via request tags. For more information,
   see the Lightsail Dev Guide.

  create-disk-request - `com.amazonaws.services.lightsail.model.CreateDiskRequest`

  returns: Result of the CreateDisk operation returned by the service. - `com.amazonaws.services.lightsail.model.CreateDiskResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.CreateDiskResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.CreateDiskRequest create-disk-request]
    (-> this (.createDisk create-disk-request))))

(defn get-disk-snapshots
  "Returns information about all block storage disk snapshots in your AWS account and region.


   If you are describing a long list of disk snapshots, you can paginate the output to make the list more
   manageable. You can use the pageToken and nextPageToken values to retrieve the next items in the list.

  get-disk-snapshots-request - `com.amazonaws.services.lightsail.model.GetDiskSnapshotsRequest`

  returns: Result of the GetDiskSnapshots operation returned by the service. - `com.amazonaws.services.lightsail.model.GetDiskSnapshotsResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.GetDiskSnapshotsResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.GetDiskSnapshotsRequest get-disk-snapshots-request]
    (-> this (.getDiskSnapshots get-disk-snapshots-request))))

(defn detach-disk
  "Detaches a stopped block storage disk from a Lightsail instance. Make sure to unmount any file systems on the
   device within your operating system before stopping the instance and detaching the disk.


   The detach disk operation supports tag-based access control via resource tags applied to the
   resource identified by diskName. For more information, see the Lightsail Dev Guide.

  detach-disk-request - `com.amazonaws.services.lightsail.model.DetachDiskRequest`

  returns: Result of the DetachDisk operation returned by the service. - `com.amazonaws.services.lightsail.model.DetachDiskResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.DetachDiskResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.DetachDiskRequest detach-disk-request]
    (-> this (.detachDisk detach-disk-request))))

(defn get-load-balancer
  "Returns information about the specified Lightsail load balancer.

  get-load-balancer-request - `com.amazonaws.services.lightsail.model.GetLoadBalancerRequest`

  returns: Result of the GetLoadBalancer operation returned by the service. - `com.amazonaws.services.lightsail.model.GetLoadBalancerResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.GetLoadBalancerResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.GetLoadBalancerRequest get-load-balancer-request]
    (-> this (.getLoadBalancer get-load-balancer-request))))

(defn open-instance-public-ports
  "Adds public ports to an Amazon Lightsail instance.


   The open instance public ports operation supports tag-based access control via resource tags applied
   to the resource identified by instanceName. For more information, see the Lightsail Dev Guide.

  open-instance-public-ports-request - `com.amazonaws.services.lightsail.model.OpenInstancePublicPortsRequest`

  returns: Result of the OpenInstancePublicPorts operation returned by the service. - `com.amazonaws.services.lightsail.model.OpenInstancePublicPortsResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.OpenInstancePublicPortsResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.OpenInstancePublicPortsRequest open-instance-public-ports-request]
    (-> this (.openInstancePublicPorts open-instance-public-ports-request))))

(defn delete-key-pair
  "Deletes a specific SSH key pair.


   The delete key pair operation supports tag-based access control via resource tags applied to the
   resource identified by keyPairName. For more information, see the Lightsail Dev Guide.

  delete-key-pair-request - `com.amazonaws.services.lightsail.model.DeleteKeyPairRequest`

  returns: Result of the DeleteKeyPair operation returned by the service. - `com.amazonaws.services.lightsail.model.DeleteKeyPairResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.DeleteKeyPairResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.DeleteKeyPairRequest delete-key-pair-request]
    (-> this (.deleteKeyPair delete-key-pair-request))))

(defn attach-load-balancer-tls-certificate
  "Attaches a Transport Layer Security (TLS) certificate to your load balancer. TLS is just an updated, more secure
   version of Secure Socket Layer (SSL).


   Once you create and validate your certificate, you can attach it to your load balancer. You can also use this API
   to rotate the certificates on your account. Use the AttachLoadBalancerTlsCertificate operation with
   the non-attached certificate, and it will replace the existing one and become the attached certificate.


   The attach load balancer tls certificate operation supports tag-based access control via resource
   tags applied to the resource identified by loadBalancerName. For more information, see the Lightsail Dev Guide.

  attach-load-balancer-tls-certificate-request - `com.amazonaws.services.lightsail.model.AttachLoadBalancerTlsCertificateRequest`

  returns: Result of the AttachLoadBalancerTlsCertificate operation returned by the service. - `com.amazonaws.services.lightsail.model.AttachLoadBalancerTlsCertificateResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.AttachLoadBalancerTlsCertificateResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.AttachLoadBalancerTlsCertificateRequest attach-load-balancer-tls-certificate-request]
    (-> this (.attachLoadBalancerTlsCertificate attach-load-balancer-tls-certificate-request))))

(defn get-operation
  "Returns information about a specific operation. Operations include events such as when you create an instance,
   allocate a static IP, attach a static IP, and so on.

  get-operation-request - `com.amazonaws.services.lightsail.model.GetOperationRequest`

  returns: Result of the GetOperation operation returned by the service. - `com.amazonaws.services.lightsail.model.GetOperationResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.GetOperationResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.GetOperationRequest get-operation-request]
    (-> this (.getOperation get-operation-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonLightsail this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-relational-database
  "Returns information about a specific database in Amazon Lightsail.

  get-relational-database-request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseRequest`

  returns: Result of the GetRelationalDatabase operation returned by the service. - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.GetRelationalDatabaseResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseRequest get-relational-database-request]
    (-> this (.getRelationalDatabase get-relational-database-request))))

(defn stop-relational-database
  "Stops a specific database that is currently running in Amazon Lightsail.


   The stop relational database operation supports tag-based access control via resource tags applied
   to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.

  stop-relational-database-request - `com.amazonaws.services.lightsail.model.StopRelationalDatabaseRequest`

  returns: Result of the StopRelationalDatabase operation returned by the service. - `com.amazonaws.services.lightsail.model.StopRelationalDatabaseResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.StopRelationalDatabaseResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.StopRelationalDatabaseRequest stop-relational-database-request]
    (-> this (.stopRelationalDatabase stop-relational-database-request))))

(defn get-relational-database-metric-data
  "Returns the data points of the specified metric for a database in Amazon Lightsail.

  get-relational-database-metric-data-request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseMetricDataRequest`

  returns: Result of the GetRelationalDatabaseMetricData operation returned by the service. - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseMetricDataResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.GetRelationalDatabaseMetricDataResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseMetricDataRequest get-relational-database-metric-data-request]
    (-> this (.getRelationalDatabaseMetricData get-relational-database-metric-data-request))))

(defn tag-resource
  "Adds one or more tags to the specified Amazon Lightsail resource. Each resource can have a maximum of 50 tags.
   Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more information
   about tags, see the Lightsail Dev Guide.


   The tag resource operation supports tag-based access control via request tags and resource tags
   applied to the resource identified by resourceName. For more information, see the Lightsail Dev Guide.

  tag-resource-request - `com.amazonaws.services.lightsail.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.lightsail.model.TagResourceResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.TagResourceResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

(defn get-blueprints
  "Returns the list of available instance images, or blueprints. You can use a blueprint to create a new
   virtual private server already running a specific operating system, as well as a preinstalled app or development
   stack. The software each instance is running depends on the blueprint image you choose.

  get-blueprints-request - `com.amazonaws.services.lightsail.model.GetBlueprintsRequest`

  returns: Result of the GetBlueprints operation returned by the service. - `com.amazonaws.services.lightsail.model.GetBlueprintsResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.GetBlueprintsResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.GetBlueprintsRequest get-blueprints-request]
    (-> this (.getBlueprints get-blueprints-request))))

(defn get-relational-database-parameters
  "Returns all of the runtime parameters offered by the underlying database software, or engine, for a specific
   database in Amazon Lightsail.


   In addition to the parameter names and values, this operation returns other information about each parameter.
   This information includes whether changes require a reboot, whether the parameter is modifiable, the allowed
   values, and the data types.

  get-relational-database-parameters-request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseParametersRequest`

  returns: Result of the GetRelationalDatabaseParameters operation returned by the service. - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseParametersResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.GetRelationalDatabaseParametersResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseParametersRequest get-relational-database-parameters-request]
    (-> this (.getRelationalDatabaseParameters get-relational-database-parameters-request))))

(defn detach-static-ip
  "Detaches a static IP from the Amazon Lightsail instance to which it is attached.

  detach-static-ip-request - `com.amazonaws.services.lightsail.model.DetachStaticIpRequest`

  returns: Result of the DetachStaticIp operation returned by the service. - `com.amazonaws.services.lightsail.model.DetachStaticIpResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.DetachStaticIpResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.DetachStaticIpRequest detach-static-ip-request]
    (-> this (.detachStaticIp detach-static-ip-request))))

(defn get-regions
  "Returns a list of all valid regions for Amazon Lightsail. Use the include availability zones
   parameter to also return the Availability Zones in a region.

  get-regions-request - `com.amazonaws.services.lightsail.model.GetRegionsRequest`

  returns: Result of the GetRegions operation returned by the service. - `com.amazonaws.services.lightsail.model.GetRegionsResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.GetRegionsResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.GetRegionsRequest get-regions-request]
    (-> this (.getRegions get-regions-request))))

(defn update-domain-entry
  "Updates a domain recordset after it is created.


   The update domain entry operation supports tag-based access control via resource tags applied to the
   resource identified by domainName. For more information, see the Lightsail Dev Guide.

  update-domain-entry-request - `com.amazonaws.services.lightsail.model.UpdateDomainEntryRequest`

  returns: Result of the UpdateDomainEntry operation returned by the service. - `com.amazonaws.services.lightsail.model.UpdateDomainEntryResult`

  throws: com.amazonaws.services.lightsail.model.ServiceException - A general service exception."
  (^com.amazonaws.services.lightsail.model.UpdateDomainEntryResult [^AmazonLightsail this ^com.amazonaws.services.lightsail.model.UpdateDomainEntryRequest update-domain-entry-request]
    (-> this (.updateDomainEntry update-domain-entry-request))))

