(ns com.amazonaws.services.elasticache.AmazonElastiCacheAsync
  "Interface for accessing Amazon ElastiCache asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonElastiCacheAsync instead.


  Amazon ElastiCache

  Amazon ElastiCache is a web service that makes it easier to set up, operate, and scale a distributed cache in the
  cloud.


  With ElastiCache, customers get all of the benefits of a high-performance, in-memory cache with less of the
  administrative burden involved in launching and managing a distributed cache. The service makes setup, scaling, and
  cluster failure handling much simpler than in a self-managed cache deployment.


  In addition, through integration with Amazon CloudWatch, customers get enhanced visibility into the key performance
  statistics associated with their cache and can receive alarms if a part of their cache runs hot."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.elasticache AmazonElastiCacheAsync]))

(defn create-cache-subnet-group-async
  "Creates a new cache subnet group.


   Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud (Amazon VPC).

  create-cache-subnet-group-request - Represents the input of a CreateCacheSubnetGroup operation. - `com.amazonaws.services.elasticache.model.CreateCacheSubnetGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCacheSubnetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.CacheSubnetGroup>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.CreateCacheSubnetGroupRequest create-cache-subnet-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCacheSubnetGroupAsync create-cache-subnet-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.CreateCacheSubnetGroupRequest create-cache-subnet-group-request]
    (-> this (.createCacheSubnetGroupAsync create-cache-subnet-group-request))))

(defn list-allowed-node-type-modifications-async
  "Lists all available node types that you can scale your Redis cluster's or replication group's current node type
   up to.


   When you use the ModifyCacheCluster or ModifyReplicationGroup operations to scale up
   your cluster or replication group, the value of the CacheNodeType parameter must be one of the node
   types returned by this operation.

  list-allowed-node-type-modifications-request - The input parameters for the ListAllowedNodeTypeModifications operation. - `com.amazonaws.services.elasticache.model.ListAllowedNodeTypeModificationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAllowedNodeTypeModifications operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.ListAllowedNodeTypeModificationsResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.ListAllowedNodeTypeModificationsRequest list-allowed-node-type-modifications-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAllowedNodeTypeModificationsAsync list-allowed-node-type-modifications-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.ListAllowedNodeTypeModificationsRequest list-allowed-node-type-modifications-request]
    (-> this (.listAllowedNodeTypeModificationsAsync list-allowed-node-type-modifications-request)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this]
    (-> this (.listAllowedNodeTypeModificationsAsync))))

(defn delete-cache-cluster-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCacheCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.CacheCluster>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.DeleteCacheClusterRequest delete-cache-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCacheClusterAsync delete-cache-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.DeleteCacheClusterRequest delete-cache-cluster-request]
    (-> this (.deleteCacheClusterAsync delete-cache-cluster-request))))

(defn describe-cache-subnet-groups-async
  "Returns a list of cache subnet group descriptions. If a subnet group name is specified, the list contains only
   the description of that group. This is applicable only when you have ElastiCache in VPC setup. All ElastiCache
   clusters now launch in VPC by default.

  describe-cache-subnet-groups-request - Represents the input of a DescribeCacheSubnetGroups operation. - `com.amazonaws.services.elasticache.model.DescribeCacheSubnetGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCacheSubnetGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.DescribeCacheSubnetGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.DescribeCacheSubnetGroupsRequest describe-cache-subnet-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCacheSubnetGroupsAsync describe-cache-subnet-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.DescribeCacheSubnetGroupsRequest describe-cache-subnet-groups-request]
    (-> this (.describeCacheSubnetGroupsAsync describe-cache-subnet-groups-request)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this]
    (-> this (.describeCacheSubnetGroupsAsync))))

(defn revoke-cache-security-group-ingress-async
  "Revokes ingress from a cache security group. Use this operation to disallow access from an Amazon EC2 security
   group that had been previously authorized.

  revoke-cache-security-group-ingress-request - Represents the input of a RevokeCacheSecurityGroupIngress operation. - `com.amazonaws.services.elasticache.model.RevokeCacheSecurityGroupIngressRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RevokeCacheSecurityGroupIngress operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.CacheSecurityGroup>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.RevokeCacheSecurityGroupIngressRequest revoke-cache-security-group-ingress-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.revokeCacheSecurityGroupIngressAsync revoke-cache-security-group-ingress-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.RevokeCacheSecurityGroupIngressRequest revoke-cache-security-group-ingress-request]
    (-> this (.revokeCacheSecurityGroupIngressAsync revoke-cache-security-group-ingress-request))))

(defn create-cache-parameter-group-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCacheParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.CacheParameterGroup>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.CreateCacheParameterGroupRequest create-cache-parameter-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCacheParameterGroupAsync create-cache-parameter-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.CreateCacheParameterGroupRequest create-cache-parameter-group-request]
    (-> this (.createCacheParameterGroupAsync create-cache-parameter-group-request))))

(defn batch-apply-update-action-async
  "Apply the service update. For more information on service updates and applying them, see Applying Service
   Updates.

  batch-apply-update-action-request - `com.amazonaws.services.elasticache.model.BatchApplyUpdateActionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchApplyUpdateAction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.BatchApplyUpdateActionResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.BatchApplyUpdateActionRequest batch-apply-update-action-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchApplyUpdateActionAsync batch-apply-update-action-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.BatchApplyUpdateActionRequest batch-apply-update-action-request]
    (-> this (.batchApplyUpdateActionAsync batch-apply-update-action-request))))

(defn create-replication-group-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateReplicationGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.ReplicationGroup>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.CreateReplicationGroupRequest create-replication-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createReplicationGroupAsync create-replication-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.CreateReplicationGroupRequest create-replication-group-request]
    (-> this (.createReplicationGroupAsync create-replication-group-request))))

(defn modify-cache-parameter-group-async
  "Modifies the parameters of a cache parameter group. You can modify up to 20 parameters in a single request by
   submitting a list parameter name and value pairs.

  modify-cache-parameter-group-request - Represents the input of a ModifyCacheParameterGroup operation. - `com.amazonaws.services.elasticache.model.ModifyCacheParameterGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyCacheParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.ModifyCacheParameterGroupResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.ModifyCacheParameterGroupRequest modify-cache-parameter-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyCacheParameterGroupAsync modify-cache-parameter-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.ModifyCacheParameterGroupRequest modify-cache-parameter-group-request]
    (-> this (.modifyCacheParameterGroupAsync modify-cache-parameter-group-request))))

(defn describe-cache-parameter-groups-async
  "Returns a list of cache parameter group descriptions. If a cache parameter group name is specified, the list
   contains only the descriptions for that group.

  describe-cache-parameter-groups-request - Represents the input of a DescribeCacheParameterGroups operation. - `com.amazonaws.services.elasticache.model.DescribeCacheParameterGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCacheParameterGroups operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.DescribeCacheParameterGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.DescribeCacheParameterGroupsRequest describe-cache-parameter-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCacheParameterGroupsAsync describe-cache-parameter-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.DescribeCacheParameterGroupsRequest describe-cache-parameter-groups-request]
    (-> this (.describeCacheParameterGroupsAsync describe-cache-parameter-groups-request)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this]
    (-> this (.describeCacheParameterGroupsAsync))))

(defn describe-reserved-cache-nodes-offerings-async
  "Lists available reserved cache node offerings.

  describe-reserved-cache-nodes-offerings-request - Represents the input of a DescribeReservedCacheNodesOfferings operation. - `com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesOfferingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReservedCacheNodesOfferings operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesOfferingsResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesOfferingsRequest describe-reserved-cache-nodes-offerings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReservedCacheNodesOfferingsAsync describe-reserved-cache-nodes-offerings-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesOfferingsRequest describe-reserved-cache-nodes-offerings-request]
    (-> this (.describeReservedCacheNodesOfferingsAsync describe-reserved-cache-nodes-offerings-request)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this]
    (-> this (.describeReservedCacheNodesOfferingsAsync))))

(defn create-snapshot-async
  "Creates a copy of an entire cluster or replication group at a specific moment in time.



   This operation is valid for Redis only.

  create-snapshot-request - Represents the input of a CreateSnapshot operation. - `com.amazonaws.services.elasticache.model.CreateSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.Snapshot>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.CreateSnapshotRequest create-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSnapshotAsync create-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.CreateSnapshotRequest create-snapshot-request]
    (-> this (.createSnapshotAsync create-snapshot-request))))

(defn create-cache-cluster-async
  "Creates a cluster. All nodes in the cluster run the same protocol-compliant cache engine software, either
   Memcached or Redis.


   This operation is not supported for Redis (cluster mode enabled) clusters.

  create-cache-cluster-request - Represents the input of a CreateCacheCluster operation. - `com.amazonaws.services.elasticache.model.CreateCacheClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCacheCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.CacheCluster>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.CreateCacheClusterRequest create-cache-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCacheClusterAsync create-cache-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.CreateCacheClusterRequest create-cache-cluster-request]
    (-> this (.createCacheClusterAsync create-cache-cluster-request))))

(defn delete-replication-group-async
  "Deletes an existing replication group. By default, this operation deletes the entire replication group, including
   the primary/primaries and all of the read replicas. If the replication group has only one primary, you can
   optionally delete only the read replicas, while retaining the primary by setting
   RetainPrimaryCluster=true.


   When you receive a successful response from this operation, Amazon ElastiCache immediately begins deleting the
   selected resources; you cannot cancel or revert this operation.



   This operation is valid for Redis only.

  delete-replication-group-request - Represents the input of a DeleteReplicationGroup operation. - `com.amazonaws.services.elasticache.model.DeleteReplicationGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteReplicationGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.ReplicationGroup>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.DeleteReplicationGroupRequest delete-replication-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteReplicationGroupAsync delete-replication-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.DeleteReplicationGroupRequest delete-replication-group-request]
    (-> this (.deleteReplicationGroupAsync delete-replication-group-request))))

(defn modify-cache-subnet-group-async
  "Modifies an existing cache subnet group.

  modify-cache-subnet-group-request - Represents the input of a ModifyCacheSubnetGroup operation. - `com.amazonaws.services.elasticache.model.ModifyCacheSubnetGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyCacheSubnetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.CacheSubnetGroup>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.ModifyCacheSubnetGroupRequest modify-cache-subnet-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyCacheSubnetGroupAsync modify-cache-subnet-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.ModifyCacheSubnetGroupRequest modify-cache-subnet-group-request]
    (-> this (.modifyCacheSubnetGroupAsync modify-cache-subnet-group-request))))

(defn describe-cache-security-groups-async
  "Returns a list of cache security group descriptions. If a cache security group name is specified, the list
   contains only the description of that group. This applicable only when you have ElastiCache in Classic setup

  describe-cache-security-groups-request - Represents the input of a DescribeCacheSecurityGroups operation. - `com.amazonaws.services.elasticache.model.DescribeCacheSecurityGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCacheSecurityGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.DescribeCacheSecurityGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.DescribeCacheSecurityGroupsRequest describe-cache-security-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCacheSecurityGroupsAsync describe-cache-security-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.DescribeCacheSecurityGroupsRequest describe-cache-security-groups-request]
    (-> this (.describeCacheSecurityGroupsAsync describe-cache-security-groups-request)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this]
    (-> this (.describeCacheSecurityGroupsAsync))))

(defn describe-cache-engine-versions-async
  "Returns a list of the available cache engines and their versions.

  describe-cache-engine-versions-request - Represents the input of a DescribeCacheEngineVersions operation. - `com.amazonaws.services.elasticache.model.DescribeCacheEngineVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCacheEngineVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.DescribeCacheEngineVersionsResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.DescribeCacheEngineVersionsRequest describe-cache-engine-versions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCacheEngineVersionsAsync describe-cache-engine-versions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.DescribeCacheEngineVersionsRequest describe-cache-engine-versions-request]
    (-> this (.describeCacheEngineVersionsAsync describe-cache-engine-versions-request)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this]
    (-> this (.describeCacheEngineVersionsAsync))))

(defn describe-cache-clusters-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCacheClusters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.DescribeCacheClustersResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.DescribeCacheClustersRequest describe-cache-clusters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCacheClustersAsync describe-cache-clusters-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.DescribeCacheClustersRequest describe-cache-clusters-request]
    (-> this (.describeCacheClustersAsync describe-cache-clusters-request)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this]
    (-> this (.describeCacheClustersAsync))))

(defn describe-service-updates-async
  "Returns details of the service updates

  describe-service-updates-request - `com.amazonaws.services.elasticache.model.DescribeServiceUpdatesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeServiceUpdates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.DescribeServiceUpdatesResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.DescribeServiceUpdatesRequest describe-service-updates-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeServiceUpdatesAsync describe-service-updates-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.DescribeServiceUpdatesRequest describe-service-updates-request]
    (-> this (.describeServiceUpdatesAsync describe-service-updates-request))))

(defn authorize-cache-security-group-ingress-async
  "Allows network ingress to a cache security group. Applications using ElastiCache must be running on Amazon EC2,
   and Amazon EC2 security groups are used as the authorization mechanism.



   You cannot authorize ingress from an Amazon EC2 security group in one region to an ElastiCache cluster in another
   region.

  authorize-cache-security-group-ingress-request - Represents the input of an AuthorizeCacheSecurityGroupIngress operation. - `com.amazonaws.services.elasticache.model.AuthorizeCacheSecurityGroupIngressRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AuthorizeCacheSecurityGroupIngress operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.CacheSecurityGroup>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.AuthorizeCacheSecurityGroupIngressRequest authorize-cache-security-group-ingress-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.authorizeCacheSecurityGroupIngressAsync authorize-cache-security-group-ingress-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.AuthorizeCacheSecurityGroupIngressRequest authorize-cache-security-group-ingress-request]
    (-> this (.authorizeCacheSecurityGroupIngressAsync authorize-cache-security-group-ingress-request))))

(defn batch-stop-update-action-async
  "Stop the service update. For more information on service updates and stopping them, see Stopping
   Service Updates.

  batch-stop-update-action-request - `com.amazonaws.services.elasticache.model.BatchStopUpdateActionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchStopUpdateAction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.BatchStopUpdateActionResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.BatchStopUpdateActionRequest batch-stop-update-action-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchStopUpdateActionAsync batch-stop-update-action-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.BatchStopUpdateActionRequest batch-stop-update-action-request]
    (-> this (.batchStopUpdateActionAsync batch-stop-update-action-request))))

(defn increase-replica-count-async
  "Dynamically increases the number of replics in a Redis (cluster mode disabled) replication group or the number of
   replica nodes in one or more node groups (shards) of a Redis (cluster mode enabled) replication group. This
   operation is performed with no cluster down time.

  increase-replica-count-request - `com.amazonaws.services.elasticache.model.IncreaseReplicaCountRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the IncreaseReplicaCount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.ReplicationGroup>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.IncreaseReplicaCountRequest increase-replica-count-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.increaseReplicaCountAsync increase-replica-count-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.IncreaseReplicaCountRequest increase-replica-count-request]
    (-> this (.increaseReplicaCountAsync increase-replica-count-request))))

(defn reset-cache-parameter-group-async
  "Modifies the parameters of a cache parameter group to the engine or system default value. You can reset specific
   parameters by submitting a list of parameter names. To reset the entire cache parameter group, specify the
   ResetAllParameters and CacheParameterGroupName parameters.

  reset-cache-parameter-group-request - Represents the input of a ResetCacheParameterGroup operation. - `com.amazonaws.services.elasticache.model.ResetCacheParameterGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResetCacheParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.ResetCacheParameterGroupResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.ResetCacheParameterGroupRequest reset-cache-parameter-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resetCacheParameterGroupAsync reset-cache-parameter-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.ResetCacheParameterGroupRequest reset-cache-parameter-group-request]
    (-> this (.resetCacheParameterGroupAsync reset-cache-parameter-group-request))))

(defn decrease-replica-count-async
  "Dynamically decreases the number of replics in a Redis (cluster mode disabled) replication group or the number of
   replica nodes in one or more node groups (shards) of a Redis (cluster mode enabled) replication group. This
   operation is performed with no cluster down time.

  decrease-replica-count-request - `com.amazonaws.services.elasticache.model.DecreaseReplicaCountRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DecreaseReplicaCount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.ReplicationGroup>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.DecreaseReplicaCountRequest decrease-replica-count-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.decreaseReplicaCountAsync decrease-replica-count-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.DecreaseReplicaCountRequest decrease-replica-count-request]
    (-> this (.decreaseReplicaCountAsync decrease-replica-count-request))))

(defn describe-snapshots-async
  "Returns information about cluster or replication group snapshots. By default, DescribeSnapshots
   lists all of your snapshots; it can optionally describe a single snapshot, or just the snapshots associated with
   a particular cache cluster.



   This operation is valid for Redis only.

  describe-snapshots-request - Represents the input of a DescribeSnapshotsMessage operation. - `com.amazonaws.services.elasticache.model.DescribeSnapshotsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSnapshots operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.DescribeSnapshotsResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.DescribeSnapshotsRequest describe-snapshots-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSnapshotsAsync describe-snapshots-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.DescribeSnapshotsRequest describe-snapshots-request]
    (-> this (.describeSnapshotsAsync describe-snapshots-request)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this]
    (-> this (.describeSnapshotsAsync))))

(defn describe-cache-parameters-async
  "Returns the detailed parameter list for a particular cache parameter group.

  describe-cache-parameters-request - Represents the input of a DescribeCacheParameters operation. - `com.amazonaws.services.elasticache.model.DescribeCacheParametersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCacheParameters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.DescribeCacheParametersResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.DescribeCacheParametersRequest describe-cache-parameters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCacheParametersAsync describe-cache-parameters-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.DescribeCacheParametersRequest describe-cache-parameters-request]
    (-> this (.describeCacheParametersAsync describe-cache-parameters-request))))

(defn delete-cache-security-group-async
  "Deletes a cache security group.



   You cannot delete a cache security group if it is associated with any clusters.

  delete-cache-security-group-request - Represents the input of a DeleteCacheSecurityGroup operation. - `com.amazonaws.services.elasticache.model.DeleteCacheSecurityGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCacheSecurityGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.DeleteCacheSecurityGroupResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.DeleteCacheSecurityGroupRequest delete-cache-security-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCacheSecurityGroupAsync delete-cache-security-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.DeleteCacheSecurityGroupRequest delete-cache-security-group-request]
    (-> this (.deleteCacheSecurityGroupAsync delete-cache-security-group-request))))

(defn remove-tags-from-resource-async
  "Removes the tags identified by the TagKeys list from the named resource.

  remove-tags-from-resource-request - Represents the input of a RemoveTagsFromResource operation. - `com.amazonaws.services.elasticache.model.RemoveTagsFromResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveTagsFromResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.RemoveTagsFromResourceResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.RemoveTagsFromResourceRequest remove-tags-from-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeTagsFromResourceAsync remove-tags-from-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.RemoveTagsFromResourceRequest remove-tags-from-resource-request]
    (-> this (.removeTagsFromResourceAsync remove-tags-from-resource-request))))

(defn reboot-cache-cluster-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RebootCacheCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.CacheCluster>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.RebootCacheClusterRequest reboot-cache-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rebootCacheClusterAsync reboot-cache-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.RebootCacheClusterRequest reboot-cache-cluster-request]
    (-> this (.rebootCacheClusterAsync reboot-cache-cluster-request))))

(defn purchase-reserved-cache-nodes-offering-async
  "Allows you to purchase a reserved cache node offering.

  purchase-reserved-cache-nodes-offering-request - Represents the input of a PurchaseReservedCacheNodesOffering operation. - `com.amazonaws.services.elasticache.model.PurchaseReservedCacheNodesOfferingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PurchaseReservedCacheNodesOffering operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.ReservedCacheNode>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.PurchaseReservedCacheNodesOfferingRequest purchase-reserved-cache-nodes-offering-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.purchaseReservedCacheNodesOfferingAsync purchase-reserved-cache-nodes-offering-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.PurchaseReservedCacheNodesOfferingRequest purchase-reserved-cache-nodes-offering-request]
    (-> this (.purchaseReservedCacheNodesOfferingAsync purchase-reserved-cache-nodes-offering-request))))

(defn list-tags-for-resource-async
  "Lists all cost allocation tags currently on the named resource. A cost allocation tag is a key-value
   pair where the key is case-sensitive and the value is optional. You can use cost allocation tags to categorize
   and track your AWS costs.


   If the cluster is not in the available state, ListTagsForResource returns an error.


   You can have a maximum of 50 cost allocation tags on an ElastiCache resource. For more information, see Monitoring Costs with Tags.

  list-tags-for-resource-request - The input parameters for the ListTagsForResource operation. - `com.amazonaws.services.elasticache.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn modify-replication-group-shard-configuration-async
  "Modifies a replication group's shards (node groups) by allowing you to add shards, remove shards, or rebalance
   the keyspaces among exisiting shards.

  modify-replication-group-shard-configuration-request - Represents the input for a ModifyReplicationGroupShardConfiguration operation. - `com.amazonaws.services.elasticache.model.ModifyReplicationGroupShardConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyReplicationGroupShardConfiguration operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.ReplicationGroup>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.ModifyReplicationGroupShardConfigurationRequest modify-replication-group-shard-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyReplicationGroupShardConfigurationAsync modify-replication-group-shard-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.ModifyReplicationGroupShardConfigurationRequest modify-replication-group-shard-configuration-request]
    (-> this (.modifyReplicationGroupShardConfigurationAsync modify-replication-group-shard-configuration-request))))

(defn describe-engine-default-parameters-async
  "Returns the default engine and system parameter information for the specified cache engine.

  describe-engine-default-parameters-request - Represents the input of a DescribeEngineDefaultParameters operation. - `com.amazonaws.services.elasticache.model.DescribeEngineDefaultParametersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEngineDefaultParameters operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.EngineDefaults>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.DescribeEngineDefaultParametersRequest describe-engine-default-parameters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEngineDefaultParametersAsync describe-engine-default-parameters-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.DescribeEngineDefaultParametersRequest describe-engine-default-parameters-request]
    (-> this (.describeEngineDefaultParametersAsync describe-engine-default-parameters-request))))

(defn describe-events-async
  "Returns events related to clusters, cache security groups, and cache parameter groups. You can obtain events
   specific to a particular cluster, cache security group, or cache parameter group by providing the name as a
   parameter.


   By default, only the events occurring within the last hour are returned; however, you can retrieve up to 14 days'
   worth of events if necessary.

  describe-events-request - Represents the input of a DescribeEvents operation. - `com.amazonaws.services.elasticache.model.DescribeEventsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.DescribeEventsResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.DescribeEventsRequest describe-events-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventsAsync describe-events-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.DescribeEventsRequest describe-events-request]
    (-> this (.describeEventsAsync describe-events-request)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this]
    (-> this (.describeEventsAsync))))

(defn delete-cache-subnet-group-async
  "Deletes a cache subnet group.



   You cannot delete a cache subnet group if it is associated with any clusters.

  delete-cache-subnet-group-request - Represents the input of a DeleteCacheSubnetGroup operation. - `com.amazonaws.services.elasticache.model.DeleteCacheSubnetGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCacheSubnetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.DeleteCacheSubnetGroupResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.DeleteCacheSubnetGroupRequest delete-cache-subnet-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCacheSubnetGroupAsync delete-cache-subnet-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.DeleteCacheSubnetGroupRequest delete-cache-subnet-group-request]
    (-> this (.deleteCacheSubnetGroupAsync delete-cache-subnet-group-request))))

(defn test-failover-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TestFailover operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.ReplicationGroup>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.TestFailoverRequest test-failover-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.testFailoverAsync test-failover-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.TestFailoverRequest test-failover-request]
    (-> this (.testFailoverAsync test-failover-request))))

(defn create-cache-security-group-async
  "Creates a new cache security group. Use a cache security group to control access to one or more clusters.


   Cache security groups are only used when you are creating a cluster outside of an Amazon Virtual Private Cloud
   (Amazon VPC). If you are creating a cluster inside of a VPC, use a cache subnet group instead. For more
   information, see CreateCacheSubnetGroup.

  create-cache-security-group-request - Represents the input of a CreateCacheSecurityGroup operation. - `com.amazonaws.services.elasticache.model.CreateCacheSecurityGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCacheSecurityGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.CacheSecurityGroup>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.CreateCacheSecurityGroupRequest create-cache-security-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCacheSecurityGroupAsync create-cache-security-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.CreateCacheSecurityGroupRequest create-cache-security-group-request]
    (-> this (.createCacheSecurityGroupAsync create-cache-security-group-request))))

(defn describe-reserved-cache-nodes-async
  "Returns information about reserved cache nodes for this account, or about a specified reserved cache node.

  describe-reserved-cache-nodes-request - Represents the input of a DescribeReservedCacheNodes operation. - `com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReservedCacheNodes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesRequest describe-reserved-cache-nodes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReservedCacheNodesAsync describe-reserved-cache-nodes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesRequest describe-reserved-cache-nodes-request]
    (-> this (.describeReservedCacheNodesAsync describe-reserved-cache-nodes-request)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this]
    (-> this (.describeReservedCacheNodesAsync))))

(defn delete-cache-parameter-group-async
  "Deletes the specified cache parameter group. You cannot delete a cache parameter group if it is associated with
   any cache clusters.

  delete-cache-parameter-group-request - Represents the input of a DeleteCacheParameterGroup operation. - `com.amazonaws.services.elasticache.model.DeleteCacheParameterGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCacheParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.DeleteCacheParameterGroupResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.DeleteCacheParameterGroupRequest delete-cache-parameter-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCacheParameterGroupAsync delete-cache-parameter-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.DeleteCacheParameterGroupRequest delete-cache-parameter-group-request]
    (-> this (.deleteCacheParameterGroupAsync delete-cache-parameter-group-request))))

(defn describe-replication-groups-async
  "Returns information about a particular replication group. If no identifier is specified,
   DescribeReplicationGroups returns information about all replication groups.



   This operation is valid for Redis only.

  describe-replication-groups-request - Represents the input of a DescribeReplicationGroups operation. - `com.amazonaws.services.elasticache.model.DescribeReplicationGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReplicationGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.DescribeReplicationGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.DescribeReplicationGroupsRequest describe-replication-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReplicationGroupsAsync describe-replication-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.DescribeReplicationGroupsRequest describe-replication-groups-request]
    (-> this (.describeReplicationGroupsAsync describe-replication-groups-request)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this]
    (-> this (.describeReplicationGroupsAsync))))

(defn describe-update-actions-async
  "Returns details of the update actions

  describe-update-actions-request - `com.amazonaws.services.elasticache.model.DescribeUpdateActionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeUpdateActions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.DescribeUpdateActionsResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.DescribeUpdateActionsRequest describe-update-actions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeUpdateActionsAsync describe-update-actions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.DescribeUpdateActionsRequest describe-update-actions-request]
    (-> this (.describeUpdateActionsAsync describe-update-actions-request))))

(defn add-tags-to-resource-async
  "Adds up to 50 cost allocation tags to the named resource. A cost allocation tag is a key-value pair where the key
   and value are case-sensitive. You can use cost allocation tags to categorize and track your AWS costs.


   When you apply tags to your ElastiCache resources, AWS generates a cost allocation report as a comma-separated
   value (CSV) file with your usage and costs aggregated by your tags. You can apply tags that represent business
   categories (such as cost centers, application names, or owners) to organize your costs across multiple services.
   For more information, see Using Cost Allocation Tags in
   Amazon ElastiCache in the ElastiCache User Guide.

  add-tags-to-resource-request - Represents the input of an AddTagsToResource operation. - `com.amazonaws.services.elasticache.model.AddTagsToResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddTagsToResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.AddTagsToResourceResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.AddTagsToResourceRequest add-tags-to-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addTagsToResourceAsync add-tags-to-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.AddTagsToResourceRequest add-tags-to-resource-request]
    (-> this (.addTagsToResourceAsync add-tags-to-resource-request))))

(defn copy-snapshot-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CopySnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.Snapshot>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.CopySnapshotRequest copy-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.copySnapshotAsync copy-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.CopySnapshotRequest copy-snapshot-request]
    (-> this (.copySnapshotAsync copy-snapshot-request))))

(defn modify-cache-cluster-async
  "Modifies the settings for a cluster. You can use this operation to change one or more cluster configuration
   parameters by specifying the parameters and the new values.

  modify-cache-cluster-request - Represents the input of a ModifyCacheCluster operation. - `com.amazonaws.services.elasticache.model.ModifyCacheClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyCacheCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.CacheCluster>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.ModifyCacheClusterRequest modify-cache-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyCacheClusterAsync modify-cache-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.ModifyCacheClusterRequest modify-cache-cluster-request]
    (-> this (.modifyCacheClusterAsync modify-cache-cluster-request))))

(defn modify-replication-group-async
  "Modifies the settings for a replication group.


   For Redis (cluster mode enabled) clusters, this operation cannot be used to change a cluster's node type or
   engine version. For more information, see:





   Scaling for Amazon ElastiCache for Redis (cluster mode enabled) in the ElastiCache User Guide




   ModifyReplicationGroupShardConfiguration in the ElastiCache API Reference





   This operation is valid for Redis only.

  modify-replication-group-request - Represents the input of a ModifyReplicationGroups operation. - `com.amazonaws.services.elasticache.model.ModifyReplicationGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyReplicationGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.ReplicationGroup>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.ModifyReplicationGroupRequest modify-replication-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyReplicationGroupAsync modify-replication-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.ModifyReplicationGroupRequest modify-replication-group-request]
    (-> this (.modifyReplicationGroupAsync modify-replication-group-request))))

(defn delete-snapshot-async
  "Deletes an existing snapshot. When you receive a successful response from this operation, ElastiCache immediately
   begins deleting the snapshot; you cannot cancel or revert this operation.



   This operation is valid for Redis only.

  delete-snapshot-request - Represents the input of a DeleteSnapshot operation. - `com.amazonaws.services.elasticache.model.DeleteSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.Snapshot>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.DeleteSnapshotRequest delete-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSnapshotAsync delete-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsync this ^com.amazonaws.services.elasticache.model.DeleteSnapshotRequest delete-snapshot-request]
    (-> this (.deleteSnapshotAsync delete-snapshot-request))))

