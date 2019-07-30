(ns com.amazonaws.services.elasticache.AmazonElastiCacheClient
  "Client for accessing Amazon ElastiCache. All service calls made using this client are blocking, and will not return
  until the service call completes.

  Amazon ElastiCache

  Amazon ElastiCache is a web service that makes it easier to set up, operate, and scale a distributed cache in the
  cloud.


  With ElastiCache, customers get all of the benefits of a high-performance, in-memory cache with less of the
  administrative burden involved in launching and managing a distributed cache. The service makes setup, scaling, and
  cluster failure handling much simpler than in a self-managed cache deployment.


  In addition, through integration with Amazon CloudWatch, customers get enhanced visibility into the key performance
  statistics associated with their cache and can receive alarms if a part of their cache runs hot."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.elasticache AmazonElastiCacheClient]))

(defn ->amazon-elasti-cache-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to Amazon ElastiCache (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AmazonElastiCacheClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AmazonElastiCacheClient aws-credentials-provider client-configuration request-metric-collector))
  (^AmazonElastiCacheClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonElastiCacheClient aws-credentials client-configuration))
  (^AmazonElastiCacheClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonElastiCacheClient client-configuration))
  (^AmazonElastiCacheClient []
    (new AmazonElastiCacheClient )))

(defn *builder
  "returns: `com.amazonaws.services.elasticache.AmazonElastiCacheClientBuilder`"
  (^com.amazonaws.services.elasticache.AmazonElastiCacheClientBuilder []
    (AmazonElastiCacheClient/builder )))

(defn describe-cache-security-groups
  "Returns a list of cache security group descriptions. If a cache security group name is specified, the list
   contains only the description of that group. This applicable only when you have ElastiCache in Classic setup

  request - `com.amazonaws.services.elasticache.model.DescribeCacheSecurityGroupsRequest`

  returns: Result of the DescribeCacheSecurityGroups operation returned by the service. - `com.amazonaws.services.elasticache.model.DescribeCacheSecurityGroupsResult`

  throws: com.amazonaws.services.elasticache.model.CacheSecurityGroupNotFoundException - The requested cache security group name does not refer to an existing cache security group."
  (^com.amazonaws.services.elasticache.model.DescribeCacheSecurityGroupsResult [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.DescribeCacheSecurityGroupsRequest request]
    (-> this (.describeCacheSecurityGroups request)))
  (^com.amazonaws.services.elasticache.model.DescribeCacheSecurityGroupsResult [^AmazonElastiCacheClient this]
    (-> this (.describeCacheSecurityGroups))))

(defn describe-cache-parameter-groups
  "Returns a list of cache parameter group descriptions. If a cache parameter group name is specified, the list
   contains only the descriptions for that group.

  request - `com.amazonaws.services.elasticache.model.DescribeCacheParameterGroupsRequest`

  returns: Result of the DescribeCacheParameterGroups operation returned by the service. - `com.amazonaws.services.elasticache.model.DescribeCacheParameterGroupsResult`

  throws: com.amazonaws.services.elasticache.model.CacheParameterGroupNotFoundException - The requested cache parameter group name does not refer to an existing cache parameter group."
  (^com.amazonaws.services.elasticache.model.DescribeCacheParameterGroupsResult [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.DescribeCacheParameterGroupsRequest request]
    (-> this (.describeCacheParameterGroups request)))
  (^com.amazonaws.services.elasticache.model.DescribeCacheParameterGroupsResult [^AmazonElastiCacheClient this]
    (-> this (.describeCacheParameterGroups))))

(defn list-tags-for-resource
  "Lists all cost allocation tags currently on the named resource. A cost allocation tag is a key-value
   pair where the key is case-sensitive and the value is optional. You can use cost allocation tags to categorize
   and track your AWS costs.


   If the cluster is not in the available state, ListTagsForResource returns an error.


   You can have a maximum of 50 cost allocation tags on an ElastiCache resource. For more information, see Monitoring Costs with Tags.

  request - `com.amazonaws.services.elasticache.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.elasticache.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.elasticache.model.CacheClusterNotFoundException - The requested cluster ID does not refer to an existing cluster."
  (^com.amazonaws.services.elasticache.model.ListTagsForResourceResult [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn modify-cache-cluster
  "Modifies the settings for a cluster. You can use this operation to change one or more cluster configuration
   parameters by specifying the parameters and the new values.

  request - `com.amazonaws.services.elasticache.model.ModifyCacheClusterRequest`

  returns: Result of the ModifyCacheCluster operation returned by the service. - `com.amazonaws.services.elasticache.model.CacheCluster`

  throws: com.amazonaws.services.elasticache.model.NodeQuotaForClusterExceededException - The request cannot be processed because it would exceed the allowed number of cache nodes in a single cluster."
  (^com.amazonaws.services.elasticache.model.CacheCluster [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.ModifyCacheClusterRequest request]
    (-> this (.modifyCacheCluster request))))

(defn describe-service-updates
  "Returns details of the service updates

  request - `com.amazonaws.services.elasticache.model.DescribeServiceUpdatesRequest`

  returns: Result of the DescribeServiceUpdates operation returned by the service. - `com.amazonaws.services.elasticache.model.DescribeServiceUpdatesResult`

  throws: com.amazonaws.services.elasticache.model.ServiceUpdateNotFoundException - The service update doesn't exist"
  (^com.amazonaws.services.elasticache.model.DescribeServiceUpdatesResult [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.DescribeServiceUpdatesRequest request]
    (-> this (.describeServiceUpdates request))))

(defn delete-cache-subnet-group
  "Deletes a cache subnet group.



   You cannot delete a cache subnet group if it is associated with any clusters.

  request - `com.amazonaws.services.elasticache.model.DeleteCacheSubnetGroupRequest`

  returns: Result of the DeleteCacheSubnetGroup operation returned by the service. - `com.amazonaws.services.elasticache.model.DeleteCacheSubnetGroupResult`

  throws: com.amazonaws.services.elasticache.model.CacheSubnetGroupInUseException - The requested cache subnet group is currently in use."
  (^com.amazonaws.services.elasticache.model.DeleteCacheSubnetGroupResult [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.DeleteCacheSubnetGroupRequest request]
    (-> this (.deleteCacheSubnetGroup request))))

(defn batch-apply-update-action
  "Apply the service update. For more information on service updates and applying them, see Applying Service
   Updates.

  request - `com.amazonaws.services.elasticache.model.BatchApplyUpdateActionRequest`

  returns: Result of the BatchApplyUpdateAction operation returned by the service. - `com.amazonaws.services.elasticache.model.BatchApplyUpdateActionResult`

  throws: com.amazonaws.services.elasticache.model.ServiceUpdateNotFoundException - The service update doesn't exist"
  (^com.amazonaws.services.elasticache.model.BatchApplyUpdateActionResult [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.BatchApplyUpdateActionRequest request]
    (-> this (.batchApplyUpdateAction request))))

(defn waiters
  "returns: `com.amazonaws.services.elasticache.waiters.AmazonElastiCacheWaiters`"
  (^com.amazonaws.services.elasticache.waiters.AmazonElastiCacheWaiters [^AmazonElastiCacheClient this]
    (-> this (.waiters))))

(defn modify-replication-group-shard-configuration
  "Modifies a replication group's shards (node groups) by allowing you to add shards, remove shards, or rebalance
   the keyspaces among exisiting shards.

  request - `com.amazonaws.services.elasticache.model.ModifyReplicationGroupShardConfigurationRequest`

  returns: Result of the ModifyReplicationGroupShardConfiguration operation returned by the service. - `com.amazonaws.services.elasticache.model.ReplicationGroup`

  throws: com.amazonaws.services.elasticache.model.InvalidReplicationGroupStateException - The requested replication group is not in the available state."
  (^com.amazonaws.services.elasticache.model.ReplicationGroup [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.ModifyReplicationGroupShardConfigurationRequest request]
    (-> this (.modifyReplicationGroupShardConfiguration request))))

(defn batch-stop-update-action
  "Stop the service update. For more information on service updates and stopping them, see Stopping
   Service Updates.

  request - `com.amazonaws.services.elasticache.model.BatchStopUpdateActionRequest`

  returns: Result of the BatchStopUpdateAction operation returned by the service. - `com.amazonaws.services.elasticache.model.BatchStopUpdateActionResult`

  throws: com.amazonaws.services.elasticache.model.ServiceUpdateNotFoundException - The service update doesn't exist"
  (^com.amazonaws.services.elasticache.model.BatchStopUpdateActionResult [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.BatchStopUpdateActionRequest request]
    (-> this (.batchStopUpdateAction request))))

(defn create-cache-cluster
  "Creates a cluster. All nodes in the cluster run the same protocol-compliant cache engine software, either
   Memcached or Redis.


   This operation is not supported for Redis (cluster mode enabled) clusters.

  request - `com.amazonaws.services.elasticache.model.CreateCacheClusterRequest`

  returns: Result of the CreateCacheCluster operation returned by the service. - `com.amazonaws.services.elasticache.model.CacheCluster`

  throws: com.amazonaws.services.elasticache.model.InvalidReplicationGroupStateException - The requested replication group is not in the available state."
  (^com.amazonaws.services.elasticache.model.CacheCluster [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.CreateCacheClusterRequest request]
    (-> this (.createCacheCluster request))))

(defn increase-replica-count
  "Dynamically increases the number of replics in a Redis (cluster mode disabled) replication group or the number of
   replica nodes in one or more node groups (shards) of a Redis (cluster mode enabled) replication group. This
   operation is performed with no cluster down time.

  request - `com.amazonaws.services.elasticache.model.IncreaseReplicaCountRequest`

  returns: Result of the IncreaseReplicaCount operation returned by the service. - `com.amazonaws.services.elasticache.model.ReplicationGroup`

  throws: com.amazonaws.services.elasticache.model.InvalidReplicationGroupStateException - The requested replication group is not in the available state."
  (^com.amazonaws.services.elasticache.model.ReplicationGroup [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.IncreaseReplicaCountRequest request]
    (-> this (.increaseReplicaCount request))))

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

  request - `com.amazonaws.services.elasticache.model.CopySnapshotRequest`

  returns: Result of the CopySnapshot operation returned by the service. - `com.amazonaws.services.elasticache.model.Snapshot`

  throws: com.amazonaws.services.elasticache.model.SnapshotAlreadyExistsException - You already have a snapshot with the given name."
  (^com.amazonaws.services.elasticache.model.Snapshot [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.CopySnapshotRequest request]
    (-> this (.copySnapshot request))))

(defn delete-cache-security-group
  "Deletes a cache security group.



   You cannot delete a cache security group if it is associated with any clusters.

  request - `com.amazonaws.services.elasticache.model.DeleteCacheSecurityGroupRequest`

  returns: Result of the DeleteCacheSecurityGroup operation returned by the service. - `com.amazonaws.services.elasticache.model.DeleteCacheSecurityGroupResult`

  throws: com.amazonaws.services.elasticache.model.InvalidCacheSecurityGroupStateException - The current state of the cache security group does not allow deletion."
  (^com.amazonaws.services.elasticache.model.DeleteCacheSecurityGroupResult [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.DeleteCacheSecurityGroupRequest request]
    (-> this (.deleteCacheSecurityGroup request))))

(defn reset-cache-parameter-group
  "Modifies the parameters of a cache parameter group to the engine or system default value. You can reset specific
   parameters by submitting a list of parameter names. To reset the entire cache parameter group, specify the
   ResetAllParameters and CacheParameterGroupName parameters.

  request - `com.amazonaws.services.elasticache.model.ResetCacheParameterGroupRequest`

  returns: Result of the ResetCacheParameterGroup operation returned by the service. - `com.amazonaws.services.elasticache.model.ResetCacheParameterGroupResult`

  throws: com.amazonaws.services.elasticache.model.InvalidCacheParameterGroupStateException - The current state of the cache parameter group does not allow the requested operation to occur."
  (^com.amazonaws.services.elasticache.model.ResetCacheParameterGroupResult [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.ResetCacheParameterGroupRequest request]
    (-> this (.resetCacheParameterGroup request))))

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

  request - `com.amazonaws.services.elasticache.model.CreateCacheParameterGroupRequest`

  returns: Result of the CreateCacheParameterGroup operation returned by the service. - `com.amazonaws.services.elasticache.model.CacheParameterGroup`

  throws: com.amazonaws.services.elasticache.model.CacheParameterGroupQuotaExceededException - The request cannot be processed because it would exceed the maximum number of cache security groups."
  (^com.amazonaws.services.elasticache.model.CacheParameterGroup [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.CreateCacheParameterGroupRequest request]
    (-> this (.createCacheParameterGroup request))))

(defn describe-replication-groups
  "Returns information about a particular replication group. If no identifier is specified,
   DescribeReplicationGroups returns information about all replication groups.



   This operation is valid for Redis only.

  request - `com.amazonaws.services.elasticache.model.DescribeReplicationGroupsRequest`

  returns: Result of the DescribeReplicationGroups operation returned by the service. - `com.amazonaws.services.elasticache.model.DescribeReplicationGroupsResult`

  throws: com.amazonaws.services.elasticache.model.ReplicationGroupNotFoundException - The specified replication group does not exist."
  (^com.amazonaws.services.elasticache.model.DescribeReplicationGroupsResult [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.DescribeReplicationGroupsRequest request]
    (-> this (.describeReplicationGroups request)))
  (^com.amazonaws.services.elasticache.model.DescribeReplicationGroupsResult [^AmazonElastiCacheClient this]
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

  request - `com.amazonaws.services.elasticache.model.DeleteCacheClusterRequest`

  returns: Result of the DeleteCacheCluster operation returned by the service. - `com.amazonaws.services.elasticache.model.CacheCluster`

  throws: com.amazonaws.services.elasticache.model.CacheClusterNotFoundException - The requested cluster ID does not refer to an existing cluster."
  (^com.amazonaws.services.elasticache.model.CacheCluster [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.DeleteCacheClusterRequest request]
    (-> this (.deleteCacheCluster request))))

(defn describe-cache-engine-versions
  "Returns a list of the available cache engines and their versions.

  request - `com.amazonaws.services.elasticache.model.DescribeCacheEngineVersionsRequest`

  returns: Result of the DescribeCacheEngineVersions operation returned by the service. - `com.amazonaws.services.elasticache.model.DescribeCacheEngineVersionsResult`"
  (^com.amazonaws.services.elasticache.model.DescribeCacheEngineVersionsResult [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.DescribeCacheEngineVersionsRequest request]
    (-> this (.describeCacheEngineVersions request)))
  (^com.amazonaws.services.elasticache.model.DescribeCacheEngineVersionsResult [^AmazonElastiCacheClient this]
    (-> this (.describeCacheEngineVersions))))

(defn modify-replication-group
  "Modifies the settings for a replication group.


   For Redis (cluster mode enabled) clusters, this operation cannot be used to change a cluster's node type or
   engine version. For more information, see:





   Scaling for Amazon ElastiCache for Redis (cluster mode enabled) in the ElastiCache User Guide




   ModifyReplicationGroupShardConfiguration in the ElastiCache API Reference





   This operation is valid for Redis only.

  request - `com.amazonaws.services.elasticache.model.ModifyReplicationGroupRequest`

  returns: Result of the ModifyReplicationGroup operation returned by the service. - `com.amazonaws.services.elasticache.model.ReplicationGroup`

  throws: com.amazonaws.services.elasticache.model.InvalidReplicationGroupStateException - The requested replication group is not in the available state."
  (^com.amazonaws.services.elasticache.model.ReplicationGroup [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.ModifyReplicationGroupRequest request]
    (-> this (.modifyReplicationGroup request))))

(defn describe-update-actions
  "Returns details of the update actions

  request - `com.amazonaws.services.elasticache.model.DescribeUpdateActionsRequest`

  returns: Result of the DescribeUpdateActions operation returned by the service. - `com.amazonaws.services.elasticache.model.DescribeUpdateActionsResult`

  throws: com.amazonaws.services.elasticache.model.InvalidParameterValueException - The value for a parameter is invalid."
  (^com.amazonaws.services.elasticache.model.DescribeUpdateActionsResult [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.DescribeUpdateActionsRequest request]
    (-> this (.describeUpdateActions request))))

(defn decrease-replica-count
  "Dynamically decreases the number of replics in a Redis (cluster mode disabled) replication group or the number of
   replica nodes in one or more node groups (shards) of a Redis (cluster mode enabled) replication group. This
   operation is performed with no cluster down time.

  request - `com.amazonaws.services.elasticache.model.DecreaseReplicaCountRequest`

  returns: Result of the DecreaseReplicaCount operation returned by the service. - `com.amazonaws.services.elasticache.model.ReplicationGroup`

  throws: com.amazonaws.services.elasticache.model.InvalidReplicationGroupStateException - The requested replication group is not in the available state."
  (^com.amazonaws.services.elasticache.model.ReplicationGroup [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.DecreaseReplicaCountRequest request]
    (-> this (.decreaseReplicaCount request))))

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

  request - `com.amazonaws.services.elasticache.model.DescribeCacheClustersRequest`

  returns: Result of the DescribeCacheClusters operation returned by the service. - `com.amazonaws.services.elasticache.model.DescribeCacheClustersResult`

  throws: com.amazonaws.services.elasticache.model.CacheClusterNotFoundException - The requested cluster ID does not refer to an existing cluster."
  (^com.amazonaws.services.elasticache.model.DescribeCacheClustersResult [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.DescribeCacheClustersRequest request]
    (-> this (.describeCacheClusters request)))
  (^com.amazonaws.services.elasticache.model.DescribeCacheClustersResult [^AmazonElastiCacheClient this]
    (-> this (.describeCacheClusters))))

(defn shutdown
  "Description copied from class: AmazonWebServiceClient"
  ([^AmazonElastiCacheClient this]
    (-> this (.shutdown))))

(defn describe-events
  "Returns events related to clusters, cache security groups, and cache parameter groups. You can obtain events
   specific to a particular cluster, cache security group, or cache parameter group by providing the name as a
   parameter.


   By default, only the events occurring within the last hour are returned; however, you can retrieve up to 14 days'
   worth of events if necessary.

  request - `com.amazonaws.services.elasticache.model.DescribeEventsRequest`

  returns: Result of the DescribeEvents operation returned by the service. - `com.amazonaws.services.elasticache.model.DescribeEventsResult`

  throws: com.amazonaws.services.elasticache.model.InvalidParameterValueException - The value for a parameter is invalid."
  (^com.amazonaws.services.elasticache.model.DescribeEventsResult [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.DescribeEventsRequest request]
    (-> this (.describeEvents request)))
  (^com.amazonaws.services.elasticache.model.DescribeEventsResult [^AmazonElastiCacheClient this]
    (-> this (.describeEvents))))

(defn delete-snapshot
  "Deletes an existing snapshot. When you receive a successful response from this operation, ElastiCache immediately
   begins deleting the snapshot; you cannot cancel or revert this operation.



   This operation is valid for Redis only.

  request - `com.amazonaws.services.elasticache.model.DeleteSnapshotRequest`

  returns: Result of the DeleteSnapshot operation returned by the service. - `com.amazonaws.services.elasticache.model.Snapshot`

  throws: com.amazonaws.services.elasticache.model.SnapshotNotFoundException - The requested snapshot name does not refer to an existing snapshot."
  (^com.amazonaws.services.elasticache.model.Snapshot [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.DeleteSnapshotRequest request]
    (-> this (.deleteSnapshot request))))

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

  request - `com.amazonaws.services.elasticache.model.RebootCacheClusterRequest`

  returns: Result of the RebootCacheCluster operation returned by the service. - `com.amazonaws.services.elasticache.model.CacheCluster`

  throws: com.amazonaws.services.elasticache.model.InvalidCacheClusterStateException - The requested cluster is not in the available state."
  (^com.amazonaws.services.elasticache.model.CacheCluster [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.RebootCacheClusterRequest request]
    (-> this (.rebootCacheCluster request))))

(defn revoke-cache-security-group-ingress
  "Revokes ingress from a cache security group. Use this operation to disallow access from an Amazon EC2 security
   group that had been previously authorized.

  request - `com.amazonaws.services.elasticache.model.RevokeCacheSecurityGroupIngressRequest`

  returns: Result of the RevokeCacheSecurityGroupIngress operation returned by the service. - `com.amazonaws.services.elasticache.model.CacheSecurityGroup`

  throws: com.amazonaws.services.elasticache.model.CacheSecurityGroupNotFoundException - The requested cache security group name does not refer to an existing cache security group."
  (^com.amazonaws.services.elasticache.model.CacheSecurityGroup [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.RevokeCacheSecurityGroupIngressRequest request]
    (-> this (.revokeCacheSecurityGroupIngress request))))

(defn create-cache-security-group
  "Creates a new cache security group. Use a cache security group to control access to one or more clusters.


   Cache security groups are only used when you are creating a cluster outside of an Amazon Virtual Private Cloud
   (Amazon VPC). If you are creating a cluster inside of a VPC, use a cache subnet group instead. For more
   information, see CreateCacheSubnetGroup.

  request - `com.amazonaws.services.elasticache.model.CreateCacheSecurityGroupRequest`

  returns: Result of the CreateCacheSecurityGroup operation returned by the service. - `com.amazonaws.services.elasticache.model.CacheSecurityGroup`

  throws: com.amazonaws.services.elasticache.model.CacheSecurityGroupAlreadyExistsException - A cache security group with the specified name already exists."
  (^com.amazonaws.services.elasticache.model.CacheSecurityGroup [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.CreateCacheSecurityGroupRequest request]
    (-> this (.createCacheSecurityGroup request))))

(defn describe-snapshots
  "Returns information about cluster or replication group snapshots. By default, DescribeSnapshots
   lists all of your snapshots; it can optionally describe a single snapshot, or just the snapshots associated with
   a particular cache cluster.



   This operation is valid for Redis only.

  request - `com.amazonaws.services.elasticache.model.DescribeSnapshotsRequest`

  returns: Result of the DescribeSnapshots operation returned by the service. - `com.amazonaws.services.elasticache.model.DescribeSnapshotsResult`

  throws: com.amazonaws.services.elasticache.model.CacheClusterNotFoundException - The requested cluster ID does not refer to an existing cluster."
  (^com.amazonaws.services.elasticache.model.DescribeSnapshotsResult [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.DescribeSnapshotsRequest request]
    (-> this (.describeSnapshots request)))
  (^com.amazonaws.services.elasticache.model.DescribeSnapshotsResult [^AmazonElastiCacheClient this]
    (-> this (.describeSnapshots))))

(defn describe-reserved-cache-nodes-offerings
  "Lists available reserved cache node offerings.

  request - `com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesOfferingsRequest`

  returns: Result of the DescribeReservedCacheNodesOfferings operation returned by the service. - `com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesOfferingsResult`

  throws: com.amazonaws.services.elasticache.model.ReservedCacheNodesOfferingNotFoundException - The requested cache node offering does not exist."
  (^com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesOfferingsResult [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesOfferingsRequest request]
    (-> this (.describeReservedCacheNodesOfferings request)))
  (^com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesOfferingsResult [^AmazonElastiCacheClient this]
    (-> this (.describeReservedCacheNodesOfferings))))

(defn list-allowed-node-type-modifications
  "Lists all available node types that you can scale your Redis cluster's or replication group's current node type
   up to.


   When you use the ModifyCacheCluster or ModifyReplicationGroup operations to scale up
   your cluster or replication group, the value of the CacheNodeType parameter must be one of the node
   types returned by this operation.

  request - `com.amazonaws.services.elasticache.model.ListAllowedNodeTypeModificationsRequest`

  returns: Result of the ListAllowedNodeTypeModifications operation returned by the service. - `com.amazonaws.services.elasticache.model.ListAllowedNodeTypeModificationsResult`

  throws: com.amazonaws.services.elasticache.model.CacheClusterNotFoundException - The requested cluster ID does not refer to an existing cluster."
  (^com.amazonaws.services.elasticache.model.ListAllowedNodeTypeModificationsResult [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.ListAllowedNodeTypeModificationsRequest request]
    (-> this (.listAllowedNodeTypeModifications request)))
  (^com.amazonaws.services.elasticache.model.ListAllowedNodeTypeModificationsResult [^AmazonElastiCacheClient this]
    (-> this (.listAllowedNodeTypeModifications))))

(defn modify-cache-subnet-group
  "Modifies an existing cache subnet group.

  request - `com.amazonaws.services.elasticache.model.ModifyCacheSubnetGroupRequest`

  returns: Result of the ModifyCacheSubnetGroup operation returned by the service. - `com.amazonaws.services.elasticache.model.CacheSubnetGroup`

  throws: com.amazonaws.services.elasticache.model.CacheSubnetGroupNotFoundException - The requested cache subnet group name does not refer to an existing cache subnet group."
  (^com.amazonaws.services.elasticache.model.CacheSubnetGroup [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.ModifyCacheSubnetGroupRequest request]
    (-> this (.modifyCacheSubnetGroup request))))

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

  request - `com.amazonaws.services.elasticache.model.CreateReplicationGroupRequest`

  returns: Result of the CreateReplicationGroup operation returned by the service. - `com.amazonaws.services.elasticache.model.ReplicationGroup`

  throws: com.amazonaws.services.elasticache.model.NodeQuotaForClusterExceededException - The request cannot be processed because it would exceed the allowed number of cache nodes in a single cluster."
  (^com.amazonaws.services.elasticache.model.ReplicationGroup [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.CreateReplicationGroupRequest request]
    (-> this (.createReplicationGroup request))))

(defn delete-cache-parameter-group
  "Deletes the specified cache parameter group. You cannot delete a cache parameter group if it is associated with
   any cache clusters.

  request - `com.amazonaws.services.elasticache.model.DeleteCacheParameterGroupRequest`

  returns: Result of the DeleteCacheParameterGroup operation returned by the service. - `com.amazonaws.services.elasticache.model.DeleteCacheParameterGroupResult`

  throws: com.amazonaws.services.elasticache.model.InvalidCacheParameterGroupStateException - The current state of the cache parameter group does not allow the requested operation to occur."
  (^com.amazonaws.services.elasticache.model.DeleteCacheParameterGroupResult [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.DeleteCacheParameterGroupRequest request]
    (-> this (.deleteCacheParameterGroup request))))

(defn modify-cache-parameter-group
  "Modifies the parameters of a cache parameter group. You can modify up to 20 parameters in a single request by
   submitting a list parameter name and value pairs.

  request - `com.amazonaws.services.elasticache.model.ModifyCacheParameterGroupRequest`

  returns: Result of the ModifyCacheParameterGroup operation returned by the service. - `com.amazonaws.services.elasticache.model.ModifyCacheParameterGroupResult`

  throws: com.amazonaws.services.elasticache.model.CacheParameterGroupNotFoundException - The requested cache parameter group name does not refer to an existing cache parameter group."
  (^com.amazonaws.services.elasticache.model.ModifyCacheParameterGroupResult [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.ModifyCacheParameterGroupRequest request]
    (-> this (.modifyCacheParameterGroup request))))

(defn authorize-cache-security-group-ingress
  "Allows network ingress to a cache security group. Applications using ElastiCache must be running on Amazon EC2,
   and Amazon EC2 security groups are used as the authorization mechanism.



   You cannot authorize ingress from an Amazon EC2 security group in one region to an ElastiCache cluster in another
   region.

  request - `com.amazonaws.services.elasticache.model.AuthorizeCacheSecurityGroupIngressRequest`

  returns: Result of the AuthorizeCacheSecurityGroupIngress operation returned by the service. - `com.amazonaws.services.elasticache.model.CacheSecurityGroup`

  throws: com.amazonaws.services.elasticache.model.CacheSecurityGroupNotFoundException - The requested cache security group name does not refer to an existing cache security group."
  (^com.amazonaws.services.elasticache.model.CacheSecurityGroup [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.AuthorizeCacheSecurityGroupIngressRequest request]
    (-> this (.authorizeCacheSecurityGroupIngress request))))

(defn describe-engine-default-parameters
  "Returns the default engine and system parameter information for the specified cache engine.

  request - `com.amazonaws.services.elasticache.model.DescribeEngineDefaultParametersRequest`

  returns: Result of the DescribeEngineDefaultParameters operation returned by the service. - `com.amazonaws.services.elasticache.model.EngineDefaults`

  throws: com.amazonaws.services.elasticache.model.InvalidParameterValueException - The value for a parameter is invalid."
  (^com.amazonaws.services.elasticache.model.EngineDefaults [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.DescribeEngineDefaultParametersRequest request]
    (-> this (.describeEngineDefaultParameters request))))

(defn remove-tags-from-resource
  "Removes the tags identified by the TagKeys list from the named resource.

  request - `com.amazonaws.services.elasticache.model.RemoveTagsFromResourceRequest`

  returns: Result of the RemoveTagsFromResource operation returned by the service. - `com.amazonaws.services.elasticache.model.RemoveTagsFromResourceResult`

  throws: com.amazonaws.services.elasticache.model.CacheClusterNotFoundException - The requested cluster ID does not refer to an existing cluster."
  (^com.amazonaws.services.elasticache.model.RemoveTagsFromResourceResult [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.RemoveTagsFromResourceRequest request]
    (-> this (.removeTagsFromResource request))))

(defn add-tags-to-resource
  "Adds up to 50 cost allocation tags to the named resource. A cost allocation tag is a key-value pair where the key
   and value are case-sensitive. You can use cost allocation tags to categorize and track your AWS costs.


   When you apply tags to your ElastiCache resources, AWS generates a cost allocation report as a comma-separated
   value (CSV) file with your usage and costs aggregated by your tags. You can apply tags that represent business
   categories (such as cost centers, application names, or owners) to organize your costs across multiple services.
   For more information, see Using Cost Allocation Tags in
   Amazon ElastiCache in the ElastiCache User Guide.

  request - `com.amazonaws.services.elasticache.model.AddTagsToResourceRequest`

  returns: Result of the AddTagsToResource operation returned by the service. - `com.amazonaws.services.elasticache.model.AddTagsToResourceResult`

  throws: com.amazonaws.services.elasticache.model.CacheClusterNotFoundException - The requested cluster ID does not refer to an existing cluster."
  (^com.amazonaws.services.elasticache.model.AddTagsToResourceResult [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.AddTagsToResourceRequest request]
    (-> this (.addTagsToResource request))))

(defn describe-reserved-cache-nodes
  "Returns information about reserved cache nodes for this account, or about a specified reserved cache node.

  request - `com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesRequest`

  returns: Result of the DescribeReservedCacheNodes operation returned by the service. - `com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesResult`

  throws: com.amazonaws.services.elasticache.model.ReservedCacheNodeNotFoundException - The requested reserved cache node was not found."
  (^com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesResult [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesRequest request]
    (-> this (.describeReservedCacheNodes request)))
  (^com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesResult [^AmazonElastiCacheClient this]
    (-> this (.describeReservedCacheNodes))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonElastiCacheClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn delete-replication-group
  "Deletes an existing replication group. By default, this operation deletes the entire replication group, including
   the primary/primaries and all of the read replicas. If the replication group has only one primary, you can
   optionally delete only the read replicas, while retaining the primary by setting
   RetainPrimaryCluster=true.


   When you receive a successful response from this operation, Amazon ElastiCache immediately begins deleting the
   selected resources; you cannot cancel or revert this operation.



   This operation is valid for Redis only.

  request - `com.amazonaws.services.elasticache.model.DeleteReplicationGroupRequest`

  returns: Result of the DeleteReplicationGroup operation returned by the service. - `com.amazonaws.services.elasticache.model.ReplicationGroup`

  throws: com.amazonaws.services.elasticache.model.ReplicationGroupNotFoundException - The specified replication group does not exist."
  (^com.amazonaws.services.elasticache.model.ReplicationGroup [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.DeleteReplicationGroupRequest request]
    (-> this (.deleteReplicationGroup request))))

(defn describe-cache-parameters
  "Returns the detailed parameter list for a particular cache parameter group.

  request - `com.amazonaws.services.elasticache.model.DescribeCacheParametersRequest`

  returns: Result of the DescribeCacheParameters operation returned by the service. - `com.amazonaws.services.elasticache.model.DescribeCacheParametersResult`

  throws: com.amazonaws.services.elasticache.model.CacheParameterGroupNotFoundException - The requested cache parameter group name does not refer to an existing cache parameter group."
  (^com.amazonaws.services.elasticache.model.DescribeCacheParametersResult [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.DescribeCacheParametersRequest request]
    (-> this (.describeCacheParameters request))))

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

  request - `com.amazonaws.services.elasticache.model.TestFailoverRequest`

  returns: Result of the TestFailover operation returned by the service. - `com.amazonaws.services.elasticache.model.ReplicationGroup`

  throws: com.amazonaws.services.elasticache.model.APICallRateForCustomerExceededException - The customer has exceeded the allowed rate of API calls."
  (^com.amazonaws.services.elasticache.model.ReplicationGroup [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.TestFailoverRequest request]
    (-> this (.testFailover request))))

(defn purchase-reserved-cache-nodes-offering
  "Allows you to purchase a reserved cache node offering.

  request - `com.amazonaws.services.elasticache.model.PurchaseReservedCacheNodesOfferingRequest`

  returns: Result of the PurchaseReservedCacheNodesOffering operation returned by the service. - `com.amazonaws.services.elasticache.model.ReservedCacheNode`

  throws: com.amazonaws.services.elasticache.model.ReservedCacheNodesOfferingNotFoundException - The requested cache node offering does not exist."
  (^com.amazonaws.services.elasticache.model.ReservedCacheNode [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.PurchaseReservedCacheNodesOfferingRequest request]
    (-> this (.purchaseReservedCacheNodesOffering request))))

(defn create-snapshot
  "Creates a copy of an entire cluster or replication group at a specific moment in time.



   This operation is valid for Redis only.

  request - `com.amazonaws.services.elasticache.model.CreateSnapshotRequest`

  returns: Result of the CreateSnapshot operation returned by the service. - `com.amazonaws.services.elasticache.model.Snapshot`

  throws: com.amazonaws.services.elasticache.model.InvalidReplicationGroupStateException - The requested replication group is not in the available state."
  (^com.amazonaws.services.elasticache.model.Snapshot [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.CreateSnapshotRequest request]
    (-> this (.createSnapshot request))))

(defn describe-cache-subnet-groups
  "Returns a list of cache subnet group descriptions. If a subnet group name is specified, the list contains only
   the description of that group. This is applicable only when you have ElastiCache in VPC setup. All ElastiCache
   clusters now launch in VPC by default.

  request - `com.amazonaws.services.elasticache.model.DescribeCacheSubnetGroupsRequest`

  returns: Result of the DescribeCacheSubnetGroups operation returned by the service. - `com.amazonaws.services.elasticache.model.DescribeCacheSubnetGroupsResult`

  throws: com.amazonaws.services.elasticache.model.CacheSubnetGroupNotFoundException - The requested cache subnet group name does not refer to an existing cache subnet group."
  (^com.amazonaws.services.elasticache.model.DescribeCacheSubnetGroupsResult [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.DescribeCacheSubnetGroupsRequest request]
    (-> this (.describeCacheSubnetGroups request)))
  (^com.amazonaws.services.elasticache.model.DescribeCacheSubnetGroupsResult [^AmazonElastiCacheClient this]
    (-> this (.describeCacheSubnetGroups))))

(defn create-cache-subnet-group
  "Creates a new cache subnet group.


   Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud (Amazon VPC).

  request - `com.amazonaws.services.elasticache.model.CreateCacheSubnetGroupRequest`

  returns: Result of the CreateCacheSubnetGroup operation returned by the service. - `com.amazonaws.services.elasticache.model.CacheSubnetGroup`

  throws: com.amazonaws.services.elasticache.model.CacheSubnetGroupAlreadyExistsException - The requested cache subnet group name is already in use by an existing cache subnet group."
  (^com.amazonaws.services.elasticache.model.CacheSubnetGroup [^AmazonElastiCacheClient this ^com.amazonaws.services.elasticache.model.CreateCacheSubnetGroupRequest request]
    (-> this (.createCacheSubnetGroup request))))

