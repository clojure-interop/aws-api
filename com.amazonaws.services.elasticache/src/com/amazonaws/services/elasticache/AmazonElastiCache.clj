(ns com.amazonaws.services.elasticache.AmazonElastiCache
  "Interface for accessing Amazon ElastiCache.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonElastiCache instead.


  Amazon ElastiCache

  Amazon ElastiCache is a web service that makes it easier to set up, operate, and scale a distributed cache in the
  cloud.


  With ElastiCache, customers get all of the benefits of a high-performance, in-memory cache with less of the
  administrative burden involved in launching and managing a distributed cache. The service makes setup, scaling, and
  cluster failure handling much simpler than in a self-managed cache deployment.


  In addition, through integration with Amazon CloudWatch, customers get enhanced visibility into the key performance
  statistics associated with their cache and can receive alarms if a part of their cache runs hot."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.elasticache AmazonElastiCache]))

(defn describe-cache-security-groups
  "Returns a list of cache security group descriptions. If a cache security group name is specified, the list
   contains only the description of that group. This applicable only when you have ElastiCache in Classic setup

  describe-cache-security-groups-request - Represents the input of a DescribeCacheSecurityGroups operation. - `com.amazonaws.services.elasticache.model.DescribeCacheSecurityGroupsRequest`

  returns: Result of the DescribeCacheSecurityGroups operation returned by the service. - `com.amazonaws.services.elasticache.model.DescribeCacheSecurityGroupsResult`

  throws: com.amazonaws.services.elasticache.model.CacheSecurityGroupNotFoundException - The requested cache security group name does not refer to an existing cache security group."
  (^com.amazonaws.services.elasticache.model.DescribeCacheSecurityGroupsResult [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.DescribeCacheSecurityGroupsRequest describe-cache-security-groups-request]
    (-> this (.describeCacheSecurityGroups describe-cache-security-groups-request)))
  (^com.amazonaws.services.elasticache.model.DescribeCacheSecurityGroupsResult [^AmazonElastiCache this]
    (-> this (.describeCacheSecurityGroups))))

(defn describe-cache-parameter-groups
  "Returns a list of cache parameter group descriptions. If a cache parameter group name is specified, the list
   contains only the descriptions for that group.

  describe-cache-parameter-groups-request - Represents the input of a DescribeCacheParameterGroups operation. - `com.amazonaws.services.elasticache.model.DescribeCacheParameterGroupsRequest`

  returns: Result of the DescribeCacheParameterGroups operation returned by the service. - `com.amazonaws.services.elasticache.model.DescribeCacheParameterGroupsResult`

  throws: com.amazonaws.services.elasticache.model.CacheParameterGroupNotFoundException - The requested cache parameter group name does not refer to an existing cache parameter group."
  (^com.amazonaws.services.elasticache.model.DescribeCacheParameterGroupsResult [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.DescribeCacheParameterGroupsRequest describe-cache-parameter-groups-request]
    (-> this (.describeCacheParameterGroups describe-cache-parameter-groups-request)))
  (^com.amazonaws.services.elasticache.model.DescribeCacheParameterGroupsResult [^AmazonElastiCache this]
    (-> this (.describeCacheParameterGroups))))

(defn list-tags-for-resource
  "Lists all cost allocation tags currently on the named resource. A cost allocation tag is a key-value
   pair where the key is case-sensitive and the value is optional. You can use cost allocation tags to categorize
   and track your AWS costs.


   If the cluster is not in the available state, ListTagsForResource returns an error.


   You can have a maximum of 50 cost allocation tags on an ElastiCache resource. For more information, see Monitoring Costs with Tags.

  list-tags-for-resource-request - The input parameters for the ListTagsForResource operation. - `com.amazonaws.services.elasticache.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.elasticache.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.elasticache.model.CacheClusterNotFoundException - The requested cluster ID does not refer to an existing cluster."
  (^com.amazonaws.services.elasticache.model.ListTagsForResourceResult [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn modify-cache-cluster
  "Modifies the settings for a cluster. You can use this operation to change one or more cluster configuration
   parameters by specifying the parameters and the new values.

  modify-cache-cluster-request - Represents the input of a ModifyCacheCluster operation. - `com.amazonaws.services.elasticache.model.ModifyCacheClusterRequest`

  returns: Result of the ModifyCacheCluster operation returned by the service. - `com.amazonaws.services.elasticache.model.CacheCluster`

  throws: com.amazonaws.services.elasticache.model.NodeQuotaForClusterExceededException - The request cannot be processed because it would exceed the allowed number of cache nodes in a single cluster."
  (^com.amazonaws.services.elasticache.model.CacheCluster [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.ModifyCacheClusterRequest modify-cache-cluster-request]
    (-> this (.modifyCacheCluster modify-cache-cluster-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AmazonElastiCache this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn describe-service-updates
  "Returns details of the service updates

  describe-service-updates-request - `com.amazonaws.services.elasticache.model.DescribeServiceUpdatesRequest`

  returns: Result of the DescribeServiceUpdates operation returned by the service. - `com.amazonaws.services.elasticache.model.DescribeServiceUpdatesResult`

  throws: com.amazonaws.services.elasticache.model.ServiceUpdateNotFoundException - The service update doesn't exist"
  (^com.amazonaws.services.elasticache.model.DescribeServiceUpdatesResult [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.DescribeServiceUpdatesRequest describe-service-updates-request]
    (-> this (.describeServiceUpdates describe-service-updates-request))))

(defn delete-cache-subnet-group
  "Deletes a cache subnet group.



   You cannot delete a cache subnet group if it is associated with any clusters.

  delete-cache-subnet-group-request - Represents the input of a DeleteCacheSubnetGroup operation. - `com.amazonaws.services.elasticache.model.DeleteCacheSubnetGroupRequest`

  returns: Result of the DeleteCacheSubnetGroup operation returned by the service. - `com.amazonaws.services.elasticache.model.DeleteCacheSubnetGroupResult`

  throws: com.amazonaws.services.elasticache.model.CacheSubnetGroupInUseException - The requested cache subnet group is currently in use."
  (^com.amazonaws.services.elasticache.model.DeleteCacheSubnetGroupResult [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.DeleteCacheSubnetGroupRequest delete-cache-subnet-group-request]
    (-> this (.deleteCacheSubnetGroup delete-cache-subnet-group-request))))

(defn batch-apply-update-action
  "Apply the service update. For more information on service updates and applying them, see Applying Service
   Updates.

  batch-apply-update-action-request - `com.amazonaws.services.elasticache.model.BatchApplyUpdateActionRequest`

  returns: Result of the BatchApplyUpdateAction operation returned by the service. - `com.amazonaws.services.elasticache.model.BatchApplyUpdateActionResult`

  throws: com.amazonaws.services.elasticache.model.ServiceUpdateNotFoundException - The service update doesn't exist"
  (^com.amazonaws.services.elasticache.model.BatchApplyUpdateActionResult [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.BatchApplyUpdateActionRequest batch-apply-update-action-request]
    (-> this (.batchApplyUpdateAction batch-apply-update-action-request))))

(defn waiters
  "returns: `com.amazonaws.services.elasticache.waiters.AmazonElastiCacheWaiters`"
  (^com.amazonaws.services.elasticache.waiters.AmazonElastiCacheWaiters [^AmazonElastiCache this]
    (-> this (.waiters))))

(defn modify-replication-group-shard-configuration
  "Modifies a replication group's shards (node groups) by allowing you to add shards, remove shards, or rebalance
   the keyspaces among exisiting shards.

  modify-replication-group-shard-configuration-request - Represents the input for a ModifyReplicationGroupShardConfiguration operation. - `com.amazonaws.services.elasticache.model.ModifyReplicationGroupShardConfigurationRequest`

  returns: Result of the ModifyReplicationGroupShardConfiguration operation returned by the service. - `com.amazonaws.services.elasticache.model.ReplicationGroup`

  throws: com.amazonaws.services.elasticache.model.InvalidReplicationGroupStateException - The requested replication group is not in the available state."
  (^com.amazonaws.services.elasticache.model.ReplicationGroup [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.ModifyReplicationGroupShardConfigurationRequest modify-replication-group-shard-configuration-request]
    (-> this (.modifyReplicationGroupShardConfiguration modify-replication-group-shard-configuration-request))))

(defn batch-stop-update-action
  "Stop the service update. For more information on service updates and stopping them, see Stopping
   Service Updates.

  batch-stop-update-action-request - `com.amazonaws.services.elasticache.model.BatchStopUpdateActionRequest`

  returns: Result of the BatchStopUpdateAction operation returned by the service. - `com.amazonaws.services.elasticache.model.BatchStopUpdateActionResult`

  throws: com.amazonaws.services.elasticache.model.ServiceUpdateNotFoundException - The service update doesn't exist"
  (^com.amazonaws.services.elasticache.model.BatchStopUpdateActionResult [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.BatchStopUpdateActionRequest batch-stop-update-action-request]
    (-> this (.batchStopUpdateAction batch-stop-update-action-request))))

(defn create-cache-cluster
  "Creates a cluster. All nodes in the cluster run the same protocol-compliant cache engine software, either
   Memcached or Redis.


   This operation is not supported for Redis (cluster mode enabled) clusters.

  create-cache-cluster-request - Represents the input of a CreateCacheCluster operation. - `com.amazonaws.services.elasticache.model.CreateCacheClusterRequest`

  returns: Result of the CreateCacheCluster operation returned by the service. - `com.amazonaws.services.elasticache.model.CacheCluster`

  throws: com.amazonaws.services.elasticache.model.InvalidReplicationGroupStateException - The requested replication group is not in the available state."
  (^com.amazonaws.services.elasticache.model.CacheCluster [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.CreateCacheClusterRequest create-cache-cluster-request]
    (-> this (.createCacheCluster create-cache-cluster-request))))

(defn increase-replica-count
  "Dynamically increases the number of replics in a Redis (cluster mode disabled) replication group or the number of
   replica nodes in one or more node groups (shards) of a Redis (cluster mode enabled) replication group. This
   operation is performed with no cluster down time.

  increase-replica-count-request - `com.amazonaws.services.elasticache.model.IncreaseReplicaCountRequest`

  returns: Result of the IncreaseReplicaCount operation returned by the service. - `com.amazonaws.services.elasticache.model.ReplicationGroup`

  throws: com.amazonaws.services.elasticache.model.InvalidReplicationGroupStateException - The requested replication group is not in the available state."
  (^com.amazonaws.services.elasticache.model.ReplicationGroup [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.IncreaseReplicaCountRequest increase-replica-count-request]
    (-> this (.increaseReplicaCount increase-replica-count-request))))

(defn copy-snapshot
  "Makes a copy of an existing snapshot.



   This operation is valid for Redis only.



   Users or groups that have permissions to use the CopySnapshot operation can create their own Amazon
   S3 buckets and copy snapshots to it. To control access to your snapshots, use an IAM policy to control who has
   the ability to use the CopySnapshot operation. For more information about using IAM to control the
   use of ElastiCache operations, see Exporting Snapshots
   and Authentication & Access
   Control.



   You could receive the following error messages.


   Error Messages




   Error Message: The S3 bucket %s is outside of the region.


   Solution: Create an Amazon S3 bucket in the same region as your snapshot. For more information, see Step 1: Create an Amazon S3 Bucket in the ElastiCache User Guide.




   Error Message: The S3 bucket %s does not exist.


   Solution: Create an Amazon S3 bucket in the same region as your snapshot. For more information, see Step 1: Create an Amazon S3 Bucket in the ElastiCache User Guide.




   Error Message: The S3 bucket %s is not owned by the authenticated user.


   Solution: Create an Amazon S3 bucket in the same region as your snapshot. For more information, see Step 1: Create an Amazon S3 Bucket in the ElastiCache User Guide.




   Error Message: The authenticated user does not have sufficient permissions to perform the desired
   activity.


   Solution: Contact your system administrator to get the needed permissions.




   Error Message: The S3 bucket %s already contains an object with key %s.


   Solution: Give the TargetSnapshotName a new and unique value. If exporting a snapshot, you
   could alternatively create a new Amazon S3 bucket and use this same value for TargetSnapshotName.




   Error Message:  ElastiCache has not been granted READ permissions %s on the S3 Bucket.


   Solution: Add List and Read permissions on the bucket. For more information, see Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket in the ElastiCache User Guide.




   Error Message:  ElastiCache has not been granted WRITE permissions %s on the S3 Bucket.


   Solution: Add Upload/Delete permissions on the bucket. For more information, see Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket in the ElastiCache User Guide.




   Error Message:  ElastiCache has not been granted READ_ACP permissions %s on the S3 Bucket.


   Solution: Add View Permissions on the bucket. For more information, see Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket in the ElastiCache User Guide.

  copy-snapshot-request - Represents the input of a CopySnapshotMessage operation. - `com.amazonaws.services.elasticache.model.CopySnapshotRequest`

  returns: Result of the CopySnapshot operation returned by the service. - `com.amazonaws.services.elasticache.model.Snapshot`

  throws: com.amazonaws.services.elasticache.model.SnapshotAlreadyExistsException - You already have a snapshot with the given name."
  (^com.amazonaws.services.elasticache.model.Snapshot [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.CopySnapshotRequest copy-snapshot-request]
    (-> this (.copySnapshot copy-snapshot-request))))

(defn delete-cache-security-group
  "Deletes a cache security group.



   You cannot delete a cache security group if it is associated with any clusters.

  delete-cache-security-group-request - Represents the input of a DeleteCacheSecurityGroup operation. - `com.amazonaws.services.elasticache.model.DeleteCacheSecurityGroupRequest`

  returns: Result of the DeleteCacheSecurityGroup operation returned by the service. - `com.amazonaws.services.elasticache.model.DeleteCacheSecurityGroupResult`

  throws: com.amazonaws.services.elasticache.model.InvalidCacheSecurityGroupStateException - The current state of the cache security group does not allow deletion."
  (^com.amazonaws.services.elasticache.model.DeleteCacheSecurityGroupResult [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.DeleteCacheSecurityGroupRequest delete-cache-security-group-request]
    (-> this (.deleteCacheSecurityGroup delete-cache-security-group-request))))

(defn reset-cache-parameter-group
  "Modifies the parameters of a cache parameter group to the engine or system default value. You can reset specific
   parameters by submitting a list of parameter names. To reset the entire cache parameter group, specify the
   ResetAllParameters and CacheParameterGroupName parameters.

  reset-cache-parameter-group-request - Represents the input of a ResetCacheParameterGroup operation. - `com.amazonaws.services.elasticache.model.ResetCacheParameterGroupRequest`

  returns: Result of the ResetCacheParameterGroup operation returned by the service. - `com.amazonaws.services.elasticache.model.ResetCacheParameterGroupResult`

  throws: com.amazonaws.services.elasticache.model.InvalidCacheParameterGroupStateException - The current state of the cache parameter group does not allow the requested operation to occur."
  (^com.amazonaws.services.elasticache.model.ResetCacheParameterGroupResult [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.ResetCacheParameterGroupRequest reset-cache-parameter-group-request]
    (-> this (.resetCacheParameterGroup reset-cache-parameter-group-request))))

(defn create-cache-parameter-group
  "Creates a new Amazon ElastiCache cache parameter group. An ElastiCache cache parameter group is a collection of
   parameters and their values that are applied to all of the nodes in any cluster or replication group using the
   CacheParameterGroup.


   A newly created CacheParameterGroup is an exact duplicate of the default parameter group for the
   CacheParameterGroupFamily. To customize the newly created CacheParameterGroup you can change the values of
   specific parameters. For more information, see:





   ModifyCacheParameterGroup in the ElastiCache API Reference.




   Parameters and
   Parameter Groups in the ElastiCache User Guide.

  create-cache-parameter-group-request - Represents the input of a CreateCacheParameterGroup operation. - `com.amazonaws.services.elasticache.model.CreateCacheParameterGroupRequest`

  returns: Result of the CreateCacheParameterGroup operation returned by the service. - `com.amazonaws.services.elasticache.model.CacheParameterGroup`

  throws: com.amazonaws.services.elasticache.model.CacheParameterGroupQuotaExceededException - The request cannot be processed because it would exceed the maximum number of cache security groups."
  (^com.amazonaws.services.elasticache.model.CacheParameterGroup [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.CreateCacheParameterGroupRequest create-cache-parameter-group-request]
    (-> this (.createCacheParameterGroup create-cache-parameter-group-request))))

(defn describe-replication-groups
  "Returns information about a particular replication group. If no identifier is specified,
   DescribeReplicationGroups returns information about all replication groups.



   This operation is valid for Redis only.

  describe-replication-groups-request - Represents the input of a DescribeReplicationGroups operation. - `com.amazonaws.services.elasticache.model.DescribeReplicationGroupsRequest`

  returns: Result of the DescribeReplicationGroups operation returned by the service. - `com.amazonaws.services.elasticache.model.DescribeReplicationGroupsResult`

  throws: com.amazonaws.services.elasticache.model.ReplicationGroupNotFoundException - The specified replication group does not exist."
  (^com.amazonaws.services.elasticache.model.DescribeReplicationGroupsResult [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.DescribeReplicationGroupsRequest describe-replication-groups-request]
    (-> this (.describeReplicationGroups describe-replication-groups-request)))
  (^com.amazonaws.services.elasticache.model.DescribeReplicationGroupsResult [^AmazonElastiCache this]
    (-> this (.describeReplicationGroups))))

(defn delete-cache-cluster
  "Deletes a previously provisioned cluster. DeleteCacheCluster deletes all associated cache nodes,
   node endpoints and the cluster itself. When you receive a successful response from this operation, Amazon
   ElastiCache immediately begins deleting the cluster; you cannot cancel or revert this operation.


   This operation is not valid for:




   Redis (cluster mode enabled) clusters




   A cluster that is the last read replica of a replication group




   A node group (shard) that has Multi-AZ mode enabled




   A cluster from a Redis (cluster mode enabled) replication group




   A cluster that is not in the available state

  delete-cache-cluster-request - Represents the input of a DeleteCacheCluster operation. - `com.amazonaws.services.elasticache.model.DeleteCacheClusterRequest`

  returns: Result of the DeleteCacheCluster operation returned by the service. - `com.amazonaws.services.elasticache.model.CacheCluster`

  throws: com.amazonaws.services.elasticache.model.CacheClusterNotFoundException - The requested cluster ID does not refer to an existing cluster."
  (^com.amazonaws.services.elasticache.model.CacheCluster [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.DeleteCacheClusterRequest delete-cache-cluster-request]
    (-> this (.deleteCacheCluster delete-cache-cluster-request))))

(defn describe-cache-engine-versions
  "Returns a list of the available cache engines and their versions.

  describe-cache-engine-versions-request - Represents the input of a DescribeCacheEngineVersions operation. - `com.amazonaws.services.elasticache.model.DescribeCacheEngineVersionsRequest`

  returns: Result of the DescribeCacheEngineVersions operation returned by the service. - `com.amazonaws.services.elasticache.model.DescribeCacheEngineVersionsResult`"
  (^com.amazonaws.services.elasticache.model.DescribeCacheEngineVersionsResult [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.DescribeCacheEngineVersionsRequest describe-cache-engine-versions-request]
    (-> this (.describeCacheEngineVersions describe-cache-engine-versions-request)))
  (^com.amazonaws.services.elasticache.model.DescribeCacheEngineVersionsResult [^AmazonElastiCache this]
    (-> this (.describeCacheEngineVersions))))

(defn modify-replication-group
  "Modifies the settings for a replication group.


   For Redis (cluster mode enabled) clusters, this operation cannot be used to change a cluster's node type or
   engine version. For more information, see:





   Scaling for Amazon ElastiCache for Redis (cluster mode enabled) in the ElastiCache User Guide




   ModifyReplicationGroupShardConfiguration in the ElastiCache API Reference





   This operation is valid for Redis only.

  modify-replication-group-request - Represents the input of a ModifyReplicationGroups operation. - `com.amazonaws.services.elasticache.model.ModifyReplicationGroupRequest`

  returns: Result of the ModifyReplicationGroup operation returned by the service. - `com.amazonaws.services.elasticache.model.ReplicationGroup`

  throws: com.amazonaws.services.elasticache.model.InvalidReplicationGroupStateException - The requested replication group is not in the available state."
  (^com.amazonaws.services.elasticache.model.ReplicationGroup [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.ModifyReplicationGroupRequest modify-replication-group-request]
    (-> this (.modifyReplicationGroup modify-replication-group-request))))

(defn describe-update-actions
  "Returns details of the update actions

  describe-update-actions-request - `com.amazonaws.services.elasticache.model.DescribeUpdateActionsRequest`

  returns: Result of the DescribeUpdateActions operation returned by the service. - `com.amazonaws.services.elasticache.model.DescribeUpdateActionsResult`

  throws: com.amazonaws.services.elasticache.model.InvalidParameterValueException - The value for a parameter is invalid."
  (^com.amazonaws.services.elasticache.model.DescribeUpdateActionsResult [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.DescribeUpdateActionsRequest describe-update-actions-request]
    (-> this (.describeUpdateActions describe-update-actions-request))))

(defn decrease-replica-count
  "Dynamically decreases the number of replics in a Redis (cluster mode disabled) replication group or the number of
   replica nodes in one or more node groups (shards) of a Redis (cluster mode enabled) replication group. This
   operation is performed with no cluster down time.

  decrease-replica-count-request - `com.amazonaws.services.elasticache.model.DecreaseReplicaCountRequest`

  returns: Result of the DecreaseReplicaCount operation returned by the service. - `com.amazonaws.services.elasticache.model.ReplicationGroup`

  throws: com.amazonaws.services.elasticache.model.InvalidReplicationGroupStateException - The requested replication group is not in the available state."
  (^com.amazonaws.services.elasticache.model.ReplicationGroup [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.DecreaseReplicaCountRequest decrease-replica-count-request]
    (-> this (.decreaseReplicaCount decrease-replica-count-request))))

(defn describe-cache-clusters
  "Returns information about all provisioned clusters if no cluster identifier is specified, or about a specific
   cache cluster if a cluster identifier is supplied.


   By default, abbreviated information about the clusters is returned. You can use the optional
   ShowCacheNodeInfo flag to retrieve detailed information about the cache nodes associated with the
   clusters. These details include the DNS address and port for the cache node endpoint.


   If the cluster is in the creating state, only cluster-level information is displayed until all of the
   nodes are successfully provisioned.


   If the cluster is in the deleting state, only cluster-level information is displayed.


   If cache nodes are currently being added to the cluster, node endpoint information and creation time for the
   additional nodes are not displayed until they are completely provisioned. When the cluster state is
   available, the cluster is ready for use.


   If cache nodes are currently being removed from the cluster, no endpoint information for the removed nodes is
   displayed.

  describe-cache-clusters-request - Represents the input of a DescribeCacheClusters operation. - `com.amazonaws.services.elasticache.model.DescribeCacheClustersRequest`

  returns: Result of the DescribeCacheClusters operation returned by the service. - `com.amazonaws.services.elasticache.model.DescribeCacheClustersResult`

  throws: com.amazonaws.services.elasticache.model.CacheClusterNotFoundException - The requested cluster ID does not refer to an existing cluster."
  (^com.amazonaws.services.elasticache.model.DescribeCacheClustersResult [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.DescribeCacheClustersRequest describe-cache-clusters-request]
    (-> this (.describeCacheClusters describe-cache-clusters-request)))
  (^com.amazonaws.services.elasticache.model.DescribeCacheClustersResult [^AmazonElastiCache this]
    (-> this (.describeCacheClusters))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonElastiCache this]
    (-> this (.shutdown))))

(defn describe-events
  "Returns events related to clusters, cache security groups, and cache parameter groups. You can obtain events
   specific to a particular cluster, cache security group, or cache parameter group by providing the name as a
   parameter.


   By default, only the events occurring within the last hour are returned; however, you can retrieve up to 14 days'
   worth of events if necessary.

  describe-events-request - Represents the input of a DescribeEvents operation. - `com.amazonaws.services.elasticache.model.DescribeEventsRequest`

  returns: Result of the DescribeEvents operation returned by the service. - `com.amazonaws.services.elasticache.model.DescribeEventsResult`

  throws: com.amazonaws.services.elasticache.model.InvalidParameterValueException - The value for a parameter is invalid."
  (^com.amazonaws.services.elasticache.model.DescribeEventsResult [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.DescribeEventsRequest describe-events-request]
    (-> this (.describeEvents describe-events-request)))
  (^com.amazonaws.services.elasticache.model.DescribeEventsResult [^AmazonElastiCache this]
    (-> this (.describeEvents))))

(defn delete-snapshot
  "Deletes an existing snapshot. When you receive a successful response from this operation, ElastiCache immediately
   begins deleting the snapshot; you cannot cancel or revert this operation.



   This operation is valid for Redis only.

  delete-snapshot-request - Represents the input of a DeleteSnapshot operation. - `com.amazonaws.services.elasticache.model.DeleteSnapshotRequest`

  returns: Result of the DeleteSnapshot operation returned by the service. - `com.amazonaws.services.elasticache.model.Snapshot`

  throws: com.amazonaws.services.elasticache.model.SnapshotNotFoundException - The requested snapshot name does not refer to an existing snapshot."
  (^com.amazonaws.services.elasticache.model.Snapshot [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.DeleteSnapshotRequest delete-snapshot-request]
    (-> this (.deleteSnapshot delete-snapshot-request))))

(defn reboot-cache-cluster
  "Reboots some, or all, of the cache nodes within a provisioned cluster. This operation applies any modified cache
   parameter groups to the cluster. The reboot operation takes place as soon as possible, and results in a momentary
   outage to the cluster. During the reboot, the cluster status is set to REBOOTING.


   The reboot causes the contents of the cache (for each cache node being rebooted) to be lost.


   When the reboot is complete, a cluster event is created.


   Rebooting a cluster is currently supported on Memcached and Redis (cluster mode disabled) clusters. Rebooting is
   not supported on Redis (cluster mode enabled) clusters.


   If you make changes to parameters that require a Redis (cluster mode enabled) cluster reboot for the changes to
   be applied, see Rebooting a Cluster
   for an alternate process.

  reboot-cache-cluster-request - Represents the input of a RebootCacheCluster operation. - `com.amazonaws.services.elasticache.model.RebootCacheClusterRequest`

  returns: Result of the RebootCacheCluster operation returned by the service. - `com.amazonaws.services.elasticache.model.CacheCluster`

  throws: com.amazonaws.services.elasticache.model.InvalidCacheClusterStateException - The requested cluster is not in the available state."
  (^com.amazonaws.services.elasticache.model.CacheCluster [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.RebootCacheClusterRequest reboot-cache-cluster-request]
    (-> this (.rebootCacheCluster reboot-cache-cluster-request))))

(defn revoke-cache-security-group-ingress
  "Revokes ingress from a cache security group. Use this operation to disallow access from an Amazon EC2 security
   group that had been previously authorized.

  revoke-cache-security-group-ingress-request - Represents the input of a RevokeCacheSecurityGroupIngress operation. - `com.amazonaws.services.elasticache.model.RevokeCacheSecurityGroupIngressRequest`

  returns: Result of the RevokeCacheSecurityGroupIngress operation returned by the service. - `com.amazonaws.services.elasticache.model.CacheSecurityGroup`

  throws: com.amazonaws.services.elasticache.model.CacheSecurityGroupNotFoundException - The requested cache security group name does not refer to an existing cache security group."
  (^com.amazonaws.services.elasticache.model.CacheSecurityGroup [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.RevokeCacheSecurityGroupIngressRequest revoke-cache-security-group-ingress-request]
    (-> this (.revokeCacheSecurityGroupIngress revoke-cache-security-group-ingress-request))))

(defn create-cache-security-group
  "Creates a new cache security group. Use a cache security group to control access to one or more clusters.


   Cache security groups are only used when you are creating a cluster outside of an Amazon Virtual Private Cloud
   (Amazon VPC). If you are creating a cluster inside of a VPC, use a cache subnet group instead. For more
   information, see CreateCacheSubnetGroup.

  create-cache-security-group-request - Represents the input of a CreateCacheSecurityGroup operation. - `com.amazonaws.services.elasticache.model.CreateCacheSecurityGroupRequest`

  returns: Result of the CreateCacheSecurityGroup operation returned by the service. - `com.amazonaws.services.elasticache.model.CacheSecurityGroup`

  throws: com.amazonaws.services.elasticache.model.CacheSecurityGroupAlreadyExistsException - A cache security group with the specified name already exists."
  (^com.amazonaws.services.elasticache.model.CacheSecurityGroup [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.CreateCacheSecurityGroupRequest create-cache-security-group-request]
    (-> this (.createCacheSecurityGroup create-cache-security-group-request))))

(defn describe-snapshots
  "Returns information about cluster or replication group snapshots. By default, DescribeSnapshots
   lists all of your snapshots; it can optionally describe a single snapshot, or just the snapshots associated with
   a particular cache cluster.



   This operation is valid for Redis only.

  describe-snapshots-request - Represents the input of a DescribeSnapshotsMessage operation. - `com.amazonaws.services.elasticache.model.DescribeSnapshotsRequest`

  returns: Result of the DescribeSnapshots operation returned by the service. - `com.amazonaws.services.elasticache.model.DescribeSnapshotsResult`

  throws: com.amazonaws.services.elasticache.model.CacheClusterNotFoundException - The requested cluster ID does not refer to an existing cluster."
  (^com.amazonaws.services.elasticache.model.DescribeSnapshotsResult [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.DescribeSnapshotsRequest describe-snapshots-request]
    (-> this (.describeSnapshots describe-snapshots-request)))
  (^com.amazonaws.services.elasticache.model.DescribeSnapshotsResult [^AmazonElastiCache this]
    (-> this (.describeSnapshots))))

(defn describe-reserved-cache-nodes-offerings
  "Lists available reserved cache node offerings.

  describe-reserved-cache-nodes-offerings-request - Represents the input of a DescribeReservedCacheNodesOfferings operation. - `com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesOfferingsRequest`

  returns: Result of the DescribeReservedCacheNodesOfferings operation returned by the service. - `com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesOfferingsResult`

  throws: com.amazonaws.services.elasticache.model.ReservedCacheNodesOfferingNotFoundException - The requested cache node offering does not exist."
  (^com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesOfferingsResult [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesOfferingsRequest describe-reserved-cache-nodes-offerings-request]
    (-> this (.describeReservedCacheNodesOfferings describe-reserved-cache-nodes-offerings-request)))
  (^com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesOfferingsResult [^AmazonElastiCache this]
    (-> this (.describeReservedCacheNodesOfferings))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"elasticache.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"elasticache.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AmazonElastiCache this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn list-allowed-node-type-modifications
  "Lists all available node types that you can scale your Redis cluster's or replication group's current node type
   up to.


   When you use the ModifyCacheCluster or ModifyReplicationGroup operations to scale up
   your cluster or replication group, the value of the CacheNodeType parameter must be one of the node
   types returned by this operation.

  list-allowed-node-type-modifications-request - The input parameters for the ListAllowedNodeTypeModifications operation. - `com.amazonaws.services.elasticache.model.ListAllowedNodeTypeModificationsRequest`

  returns: Result of the ListAllowedNodeTypeModifications operation returned by the service. - `com.amazonaws.services.elasticache.model.ListAllowedNodeTypeModificationsResult`

  throws: com.amazonaws.services.elasticache.model.CacheClusterNotFoundException - The requested cluster ID does not refer to an existing cluster."
  (^com.amazonaws.services.elasticache.model.ListAllowedNodeTypeModificationsResult [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.ListAllowedNodeTypeModificationsRequest list-allowed-node-type-modifications-request]
    (-> this (.listAllowedNodeTypeModifications list-allowed-node-type-modifications-request)))
  (^com.amazonaws.services.elasticache.model.ListAllowedNodeTypeModificationsResult [^AmazonElastiCache this]
    (-> this (.listAllowedNodeTypeModifications))))

(defn modify-cache-subnet-group
  "Modifies an existing cache subnet group.

  modify-cache-subnet-group-request - Represents the input of a ModifyCacheSubnetGroup operation. - `com.amazonaws.services.elasticache.model.ModifyCacheSubnetGroupRequest`

  returns: Result of the ModifyCacheSubnetGroup operation returned by the service. - `com.amazonaws.services.elasticache.model.CacheSubnetGroup`

  throws: com.amazonaws.services.elasticache.model.CacheSubnetGroupNotFoundException - The requested cache subnet group name does not refer to an existing cache subnet group."
  (^com.amazonaws.services.elasticache.model.CacheSubnetGroup [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.ModifyCacheSubnetGroupRequest modify-cache-subnet-group-request]
    (-> this (.modifyCacheSubnetGroup modify-cache-subnet-group-request))))

(defn create-replication-group
  "Creates a Redis (cluster mode disabled) or a Redis (cluster mode enabled) replication group.


   A Redis (cluster mode disabled) replication group is a collection of clusters, where one of the clusters is a
   read/write primary and the others are read-only replicas. Writes to the primary are asynchronously propagated to
   the replicas.


   A Redis (cluster mode enabled) replication group is a collection of 1 to 90 node groups (shards). Each node group
   (shard) has one read/write primary node and up to 5 read-only replica nodes. Writes to the primary are
   asynchronously propagated to the replicas. Redis (cluster mode enabled) replication groups partition the data
   across node groups (shards).


   When a Redis (cluster mode disabled) replication group has been successfully created, you can add one or more
   read replicas to it, up to a total of 5 read replicas. You cannot alter a Redis (cluster mode enabled)
   replication group after it has been created. However, if you need to increase or decrease the number of node
   groups (console: shards), you can avail yourself of ElastiCache for Redis' enhanced backup and restore. For more
   information, see Restoring From a Backup
   with Cluster Resizing in the ElastiCache User Guide.



   This operation is valid for Redis only.

  create-replication-group-request - Represents the input of a CreateReplicationGroup operation. - `com.amazonaws.services.elasticache.model.CreateReplicationGroupRequest`

  returns: Result of the CreateReplicationGroup operation returned by the service. - `com.amazonaws.services.elasticache.model.ReplicationGroup`

  throws: com.amazonaws.services.elasticache.model.NodeQuotaForClusterExceededException - The request cannot be processed because it would exceed the allowed number of cache nodes in a single cluster."
  (^com.amazonaws.services.elasticache.model.ReplicationGroup [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.CreateReplicationGroupRequest create-replication-group-request]
    (-> this (.createReplicationGroup create-replication-group-request))))

(defn delete-cache-parameter-group
  "Deletes the specified cache parameter group. You cannot delete a cache parameter group if it is associated with
   any cache clusters.

  delete-cache-parameter-group-request - Represents the input of a DeleteCacheParameterGroup operation. - `com.amazonaws.services.elasticache.model.DeleteCacheParameterGroupRequest`

  returns: Result of the DeleteCacheParameterGroup operation returned by the service. - `com.amazonaws.services.elasticache.model.DeleteCacheParameterGroupResult`

  throws: com.amazonaws.services.elasticache.model.InvalidCacheParameterGroupStateException - The current state of the cache parameter group does not allow the requested operation to occur."
  (^com.amazonaws.services.elasticache.model.DeleteCacheParameterGroupResult [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.DeleteCacheParameterGroupRequest delete-cache-parameter-group-request]
    (-> this (.deleteCacheParameterGroup delete-cache-parameter-group-request))))

(defn modify-cache-parameter-group
  "Modifies the parameters of a cache parameter group. You can modify up to 20 parameters in a single request by
   submitting a list parameter name and value pairs.

  modify-cache-parameter-group-request - Represents the input of a ModifyCacheParameterGroup operation. - `com.amazonaws.services.elasticache.model.ModifyCacheParameterGroupRequest`

  returns: Result of the ModifyCacheParameterGroup operation returned by the service. - `com.amazonaws.services.elasticache.model.ModifyCacheParameterGroupResult`

  throws: com.amazonaws.services.elasticache.model.CacheParameterGroupNotFoundException - The requested cache parameter group name does not refer to an existing cache parameter group."
  (^com.amazonaws.services.elasticache.model.ModifyCacheParameterGroupResult [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.ModifyCacheParameterGroupRequest modify-cache-parameter-group-request]
    (-> this (.modifyCacheParameterGroup modify-cache-parameter-group-request))))

(defn authorize-cache-security-group-ingress
  "Allows network ingress to a cache security group. Applications using ElastiCache must be running on Amazon EC2,
   and Amazon EC2 security groups are used as the authorization mechanism.



   You cannot authorize ingress from an Amazon EC2 security group in one region to an ElastiCache cluster in another
   region.

  authorize-cache-security-group-ingress-request - Represents the input of an AuthorizeCacheSecurityGroupIngress operation. - `com.amazonaws.services.elasticache.model.AuthorizeCacheSecurityGroupIngressRequest`

  returns: Result of the AuthorizeCacheSecurityGroupIngress operation returned by the service. - `com.amazonaws.services.elasticache.model.CacheSecurityGroup`

  throws: com.amazonaws.services.elasticache.model.CacheSecurityGroupNotFoundException - The requested cache security group name does not refer to an existing cache security group."
  (^com.amazonaws.services.elasticache.model.CacheSecurityGroup [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.AuthorizeCacheSecurityGroupIngressRequest authorize-cache-security-group-ingress-request]
    (-> this (.authorizeCacheSecurityGroupIngress authorize-cache-security-group-ingress-request))))

(defn describe-engine-default-parameters
  "Returns the default engine and system parameter information for the specified cache engine.

  describe-engine-default-parameters-request - Represents the input of a DescribeEngineDefaultParameters operation. - `com.amazonaws.services.elasticache.model.DescribeEngineDefaultParametersRequest`

  returns: Result of the DescribeEngineDefaultParameters operation returned by the service. - `com.amazonaws.services.elasticache.model.EngineDefaults`

  throws: com.amazonaws.services.elasticache.model.InvalidParameterValueException - The value for a parameter is invalid."
  (^com.amazonaws.services.elasticache.model.EngineDefaults [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.DescribeEngineDefaultParametersRequest describe-engine-default-parameters-request]
    (-> this (.describeEngineDefaultParameters describe-engine-default-parameters-request))))

(defn remove-tags-from-resource
  "Removes the tags identified by the TagKeys list from the named resource.

  remove-tags-from-resource-request - Represents the input of a RemoveTagsFromResource operation. - `com.amazonaws.services.elasticache.model.RemoveTagsFromResourceRequest`

  returns: Result of the RemoveTagsFromResource operation returned by the service. - `com.amazonaws.services.elasticache.model.RemoveTagsFromResourceResult`

  throws: com.amazonaws.services.elasticache.model.CacheClusterNotFoundException - The requested cluster ID does not refer to an existing cluster."
  (^com.amazonaws.services.elasticache.model.RemoveTagsFromResourceResult [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.RemoveTagsFromResourceRequest remove-tags-from-resource-request]
    (-> this (.removeTagsFromResource remove-tags-from-resource-request))))

(defn add-tags-to-resource
  "Adds up to 50 cost allocation tags to the named resource. A cost allocation tag is a key-value pair where the key
   and value are case-sensitive. You can use cost allocation tags to categorize and track your AWS costs.


   When you apply tags to your ElastiCache resources, AWS generates a cost allocation report as a comma-separated
   value (CSV) file with your usage and costs aggregated by your tags. You can apply tags that represent business
   categories (such as cost centers, application names, or owners) to organize your costs across multiple services.
   For more information, see Using Cost Allocation Tags in
   Amazon ElastiCache in the ElastiCache User Guide.

  add-tags-to-resource-request - Represents the input of an AddTagsToResource operation. - `com.amazonaws.services.elasticache.model.AddTagsToResourceRequest`

  returns: Result of the AddTagsToResource operation returned by the service. - `com.amazonaws.services.elasticache.model.AddTagsToResourceResult`

  throws: com.amazonaws.services.elasticache.model.CacheClusterNotFoundException - The requested cluster ID does not refer to an existing cluster."
  (^com.amazonaws.services.elasticache.model.AddTagsToResourceResult [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.AddTagsToResourceRequest add-tags-to-resource-request]
    (-> this (.addTagsToResource add-tags-to-resource-request))))

(defn describe-reserved-cache-nodes
  "Returns information about reserved cache nodes for this account, or about a specified reserved cache node.

  describe-reserved-cache-nodes-request - Represents the input of a DescribeReservedCacheNodes operation. - `com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesRequest`

  returns: Result of the DescribeReservedCacheNodes operation returned by the service. - `com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesResult`

  throws: com.amazonaws.services.elasticache.model.ReservedCacheNodeNotFoundException - The requested reserved cache node was not found."
  (^com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesResult [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesRequest describe-reserved-cache-nodes-request]
    (-> this (.describeReservedCacheNodes describe-reserved-cache-nodes-request)))
  (^com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesResult [^AmazonElastiCache this]
    (-> this (.describeReservedCacheNodes))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonElastiCache this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn delete-replication-group
  "Deletes an existing replication group. By default, this operation deletes the entire replication group, including
   the primary/primaries and all of the read replicas. If the replication group has only one primary, you can
   optionally delete only the read replicas, while retaining the primary by setting
   RetainPrimaryCluster=true.


   When you receive a successful response from this operation, Amazon ElastiCache immediately begins deleting the
   selected resources; you cannot cancel or revert this operation.



   This operation is valid for Redis only.

  delete-replication-group-request - Represents the input of a DeleteReplicationGroup operation. - `com.amazonaws.services.elasticache.model.DeleteReplicationGroupRequest`

  returns: Result of the DeleteReplicationGroup operation returned by the service. - `com.amazonaws.services.elasticache.model.ReplicationGroup`

  throws: com.amazonaws.services.elasticache.model.ReplicationGroupNotFoundException - The specified replication group does not exist."
  (^com.amazonaws.services.elasticache.model.ReplicationGroup [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.DeleteReplicationGroupRequest delete-replication-group-request]
    (-> this (.deleteReplicationGroup delete-replication-group-request))))

(defn describe-cache-parameters
  "Returns the detailed parameter list for a particular cache parameter group.

  describe-cache-parameters-request - Represents the input of a DescribeCacheParameters operation. - `com.amazonaws.services.elasticache.model.DescribeCacheParametersRequest`

  returns: Result of the DescribeCacheParameters operation returned by the service. - `com.amazonaws.services.elasticache.model.DescribeCacheParametersResult`

  throws: com.amazonaws.services.elasticache.model.CacheParameterGroupNotFoundException - The requested cache parameter group name does not refer to an existing cache parameter group."
  (^com.amazonaws.services.elasticache.model.DescribeCacheParametersResult [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.DescribeCacheParametersRequest describe-cache-parameters-request]
    (-> this (.describeCacheParameters describe-cache-parameters-request))))

(defn test-failover
  "Represents the input of a TestFailover operation which test automatic failover on a specified node
   group (called shard in the console) in a replication group (called cluster in the console).


   Note the following




   A customer can use this operation to test automatic failover on up to 5 shards (called node groups in the
   ElastiCache API and AWS CLI) in any rolling 24-hour period.




   If calling this operation on shards in different clusters (called replication groups in the API and CLI), the
   calls can be made concurrently.





   If calling this operation multiple times on different shards in the same Redis (cluster mode enabled) replication
   group, the first node replacement must complete before a subsequent call can be made.




   To determine whether the node replacement is complete you can check Events using the Amazon ElastiCache console,
   the AWS CLI, or the ElastiCache API. Look for the following automatic failover related events, listed here in
   order of occurrance:




   Replication group message: Test Failover API called for node group <node-group-id>




   Cache cluster message:
   Failover from master node <primary-node-id> to replica node <node-id> completed




   Replication group message:
   Failover from master node <primary-node-id> to replica node <node-id> completed




   Cache cluster message: Recovering cache nodes <node-id>




   Cache cluster message: Finished recovery for cache nodes <node-id>




   For more information see:




   Viewing ElastiCache
   Events in the ElastiCache User Guide




   DescribeEvents
    in the ElastiCache API Reference






   Also see, Testing
   Multi-AZ with Automatic Failover in the ElastiCache User Guide.

  test-failover-request - `com.amazonaws.services.elasticache.model.TestFailoverRequest`

  returns: Result of the TestFailover operation returned by the service. - `com.amazonaws.services.elasticache.model.ReplicationGroup`

  throws: com.amazonaws.services.elasticache.model.APICallRateForCustomerExceededException - The customer has exceeded the allowed rate of API calls."
  (^com.amazonaws.services.elasticache.model.ReplicationGroup [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.TestFailoverRequest test-failover-request]
    (-> this (.testFailover test-failover-request))))

(defn purchase-reserved-cache-nodes-offering
  "Allows you to purchase a reserved cache node offering.

  purchase-reserved-cache-nodes-offering-request - Represents the input of a PurchaseReservedCacheNodesOffering operation. - `com.amazonaws.services.elasticache.model.PurchaseReservedCacheNodesOfferingRequest`

  returns: Result of the PurchaseReservedCacheNodesOffering operation returned by the service. - `com.amazonaws.services.elasticache.model.ReservedCacheNode`

  throws: com.amazonaws.services.elasticache.model.ReservedCacheNodesOfferingNotFoundException - The requested cache node offering does not exist."
  (^com.amazonaws.services.elasticache.model.ReservedCacheNode [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.PurchaseReservedCacheNodesOfferingRequest purchase-reserved-cache-nodes-offering-request]
    (-> this (.purchaseReservedCacheNodesOffering purchase-reserved-cache-nodes-offering-request))))

(defn create-snapshot
  "Creates a copy of an entire cluster or replication group at a specific moment in time.



   This operation is valid for Redis only.

  create-snapshot-request - Represents the input of a CreateSnapshot operation. - `com.amazonaws.services.elasticache.model.CreateSnapshotRequest`

  returns: Result of the CreateSnapshot operation returned by the service. - `com.amazonaws.services.elasticache.model.Snapshot`

  throws: com.amazonaws.services.elasticache.model.InvalidReplicationGroupStateException - The requested replication group is not in the available state."
  (^com.amazonaws.services.elasticache.model.Snapshot [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.CreateSnapshotRequest create-snapshot-request]
    (-> this (.createSnapshot create-snapshot-request))))

(defn describe-cache-subnet-groups
  "Returns a list of cache subnet group descriptions. If a subnet group name is specified, the list contains only
   the description of that group. This is applicable only when you have ElastiCache in VPC setup. All ElastiCache
   clusters now launch in VPC by default.

  describe-cache-subnet-groups-request - Represents the input of a DescribeCacheSubnetGroups operation. - `com.amazonaws.services.elasticache.model.DescribeCacheSubnetGroupsRequest`

  returns: Result of the DescribeCacheSubnetGroups operation returned by the service. - `com.amazonaws.services.elasticache.model.DescribeCacheSubnetGroupsResult`

  throws: com.amazonaws.services.elasticache.model.CacheSubnetGroupNotFoundException - The requested cache subnet group name does not refer to an existing cache subnet group."
  (^com.amazonaws.services.elasticache.model.DescribeCacheSubnetGroupsResult [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.DescribeCacheSubnetGroupsRequest describe-cache-subnet-groups-request]
    (-> this (.describeCacheSubnetGroups describe-cache-subnet-groups-request)))
  (^com.amazonaws.services.elasticache.model.DescribeCacheSubnetGroupsResult [^AmazonElastiCache this]
    (-> this (.describeCacheSubnetGroups))))

(defn create-cache-subnet-group
  "Creates a new cache subnet group.


   Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud (Amazon VPC).

  create-cache-subnet-group-request - Represents the input of a CreateCacheSubnetGroup operation. - `com.amazonaws.services.elasticache.model.CreateCacheSubnetGroupRequest`

  returns: Result of the CreateCacheSubnetGroup operation returned by the service. - `com.amazonaws.services.elasticache.model.CacheSubnetGroup`

  throws: com.amazonaws.services.elasticache.model.CacheSubnetGroupAlreadyExistsException - The requested cache subnet group name is already in use by an existing cache subnet group."
  (^com.amazonaws.services.elasticache.model.CacheSubnetGroup [^AmazonElastiCache this ^com.amazonaws.services.elasticache.model.CreateCacheSubnetGroupRequest create-cache-subnet-group-request]
    (-> this (.createCacheSubnetGroup create-cache-subnet-group-request))))

