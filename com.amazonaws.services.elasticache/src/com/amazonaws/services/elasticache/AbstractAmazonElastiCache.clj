(ns com.amazonaws.services.elasticache.AbstractAmazonElastiCache
  "Abstract implementation of AmazonElastiCache. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.elasticache AbstractAmazonElastiCache]))

(defn describe-cache-security-groups
  "Description copied from interface: AmazonElastiCache

  request - Represents the input of a DescribeCacheSecurityGroups operation. - `com.amazonaws.services.elasticache.model.DescribeCacheSecurityGroupsRequest`

  returns: Result of the DescribeCacheSecurityGroups operation returned by the service. - `com.amazonaws.services.elasticache.model.DescribeCacheSecurityGroupsResult`"
  (^com.amazonaws.services.elasticache.model.DescribeCacheSecurityGroupsResult [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.DescribeCacheSecurityGroupsRequest request]
    (-> this (.describeCacheSecurityGroups request)))
  (^com.amazonaws.services.elasticache.model.DescribeCacheSecurityGroupsResult [^AbstractAmazonElastiCache this]
    (-> this (.describeCacheSecurityGroups))))

(defn describe-cache-parameter-groups
  "Description copied from interface: AmazonElastiCache

  request - Represents the input of a DescribeCacheParameterGroups operation. - `com.amazonaws.services.elasticache.model.DescribeCacheParameterGroupsRequest`

  returns: Result of the DescribeCacheParameterGroups operation returned by the service. - `com.amazonaws.services.elasticache.model.DescribeCacheParameterGroupsResult`"
  (^com.amazonaws.services.elasticache.model.DescribeCacheParameterGroupsResult [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.DescribeCacheParameterGroupsRequest request]
    (-> this (.describeCacheParameterGroups request)))
  (^com.amazonaws.services.elasticache.model.DescribeCacheParameterGroupsResult [^AbstractAmazonElastiCache this]
    (-> this (.describeCacheParameterGroups))))

(defn list-tags-for-resource
  "Description copied from interface: AmazonElastiCache

  request - The input parameters for the ListTagsForResource operation. - `com.amazonaws.services.elasticache.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.elasticache.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.elasticache.model.ListTagsForResourceResult [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn modify-cache-cluster
  "Description copied from interface: AmazonElastiCache

  request - Represents the input of a ModifyCacheCluster operation. - `com.amazonaws.services.elasticache.model.ModifyCacheClusterRequest`

  returns: Result of the ModifyCacheCluster operation returned by the service. - `com.amazonaws.services.elasticache.model.CacheCluster`"
  (^com.amazonaws.services.elasticache.model.CacheCluster [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.ModifyCacheClusterRequest request]
    (-> this (.modifyCacheCluster request))))

(defn set-region
  "Description copied from interface: AmazonElastiCache

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonElastiCache this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn describe-service-updates
  "Description copied from interface: AmazonElastiCache

  request - `com.amazonaws.services.elasticache.model.DescribeServiceUpdatesRequest`

  returns: Result of the DescribeServiceUpdates operation returned by the service. - `com.amazonaws.services.elasticache.model.DescribeServiceUpdatesResult`"
  (^com.amazonaws.services.elasticache.model.DescribeServiceUpdatesResult [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.DescribeServiceUpdatesRequest request]
    (-> this (.describeServiceUpdates request))))

(defn delete-cache-subnet-group
  "Description copied from interface: AmazonElastiCache

  request - Represents the input of a DeleteCacheSubnetGroup operation. - `com.amazonaws.services.elasticache.model.DeleteCacheSubnetGroupRequest`

  returns: Result of the DeleteCacheSubnetGroup operation returned by the service. - `com.amazonaws.services.elasticache.model.DeleteCacheSubnetGroupResult`"
  (^com.amazonaws.services.elasticache.model.DeleteCacheSubnetGroupResult [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.DeleteCacheSubnetGroupRequest request]
    (-> this (.deleteCacheSubnetGroup request))))

(defn batch-apply-update-action
  "Description copied from interface: AmazonElastiCache

  request - `com.amazonaws.services.elasticache.model.BatchApplyUpdateActionRequest`

  returns: Result of the BatchApplyUpdateAction operation returned by the service. - `com.amazonaws.services.elasticache.model.BatchApplyUpdateActionResult`"
  (^com.amazonaws.services.elasticache.model.BatchApplyUpdateActionResult [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.BatchApplyUpdateActionRequest request]
    (-> this (.batchApplyUpdateAction request))))

(defn waiters
  "returns: `com.amazonaws.services.elasticache.waiters.AmazonElastiCacheWaiters`"
  (^com.amazonaws.services.elasticache.waiters.AmazonElastiCacheWaiters [^AbstractAmazonElastiCache this]
    (-> this (.waiters))))

(defn modify-replication-group-shard-configuration
  "Description copied from interface: AmazonElastiCache

  request - Represents the input for a ModifyReplicationGroupShardConfiguration operation. - `com.amazonaws.services.elasticache.model.ModifyReplicationGroupShardConfigurationRequest`

  returns: Result of the ModifyReplicationGroupShardConfiguration operation returned by the service. - `com.amazonaws.services.elasticache.model.ReplicationGroup`"
  (^com.amazonaws.services.elasticache.model.ReplicationGroup [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.ModifyReplicationGroupShardConfigurationRequest request]
    (-> this (.modifyReplicationGroupShardConfiguration request))))

(defn batch-stop-update-action
  "Description copied from interface: AmazonElastiCache

  request - `com.amazonaws.services.elasticache.model.BatchStopUpdateActionRequest`

  returns: Result of the BatchStopUpdateAction operation returned by the service. - `com.amazonaws.services.elasticache.model.BatchStopUpdateActionResult`"
  (^com.amazonaws.services.elasticache.model.BatchStopUpdateActionResult [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.BatchStopUpdateActionRequest request]
    (-> this (.batchStopUpdateAction request))))

(defn create-cache-cluster
  "Description copied from interface: AmazonElastiCache

  request - Represents the input of a CreateCacheCluster operation. - `com.amazonaws.services.elasticache.model.CreateCacheClusterRequest`

  returns: Result of the CreateCacheCluster operation returned by the service. - `com.amazonaws.services.elasticache.model.CacheCluster`"
  (^com.amazonaws.services.elasticache.model.CacheCluster [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.CreateCacheClusterRequest request]
    (-> this (.createCacheCluster request))))

(defn increase-replica-count
  "Description copied from interface: AmazonElastiCache

  request - `com.amazonaws.services.elasticache.model.IncreaseReplicaCountRequest`

  returns: Result of the IncreaseReplicaCount operation returned by the service. - `com.amazonaws.services.elasticache.model.ReplicationGroup`"
  (^com.amazonaws.services.elasticache.model.ReplicationGroup [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.IncreaseReplicaCountRequest request]
    (-> this (.increaseReplicaCount request))))

(defn copy-snapshot
  "Description copied from interface: AmazonElastiCache

  request - Represents the input of a CopySnapshotMessage operation. - `com.amazonaws.services.elasticache.model.CopySnapshotRequest`

  returns: Result of the CopySnapshot operation returned by the service. - `com.amazonaws.services.elasticache.model.Snapshot`"
  (^com.amazonaws.services.elasticache.model.Snapshot [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.CopySnapshotRequest request]
    (-> this (.copySnapshot request))))

(defn delete-cache-security-group
  "Description copied from interface: AmazonElastiCache

  request - Represents the input of a DeleteCacheSecurityGroup operation. - `com.amazonaws.services.elasticache.model.DeleteCacheSecurityGroupRequest`

  returns: Result of the DeleteCacheSecurityGroup operation returned by the service. - `com.amazonaws.services.elasticache.model.DeleteCacheSecurityGroupResult`"
  (^com.amazonaws.services.elasticache.model.DeleteCacheSecurityGroupResult [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.DeleteCacheSecurityGroupRequest request]
    (-> this (.deleteCacheSecurityGroup request))))

(defn reset-cache-parameter-group
  "Description copied from interface: AmazonElastiCache

  request - Represents the input of a ResetCacheParameterGroup operation. - `com.amazonaws.services.elasticache.model.ResetCacheParameterGroupRequest`

  returns: Result of the ResetCacheParameterGroup operation returned by the service. - `com.amazonaws.services.elasticache.model.ResetCacheParameterGroupResult`"
  (^com.amazonaws.services.elasticache.model.ResetCacheParameterGroupResult [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.ResetCacheParameterGroupRequest request]
    (-> this (.resetCacheParameterGroup request))))

(defn create-cache-parameter-group
  "Description copied from interface: AmazonElastiCache

  request - Represents the input of a CreateCacheParameterGroup operation. - `com.amazonaws.services.elasticache.model.CreateCacheParameterGroupRequest`

  returns: Result of the CreateCacheParameterGroup operation returned by the service. - `com.amazonaws.services.elasticache.model.CacheParameterGroup`"
  (^com.amazonaws.services.elasticache.model.CacheParameterGroup [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.CreateCacheParameterGroupRequest request]
    (-> this (.createCacheParameterGroup request))))

(defn describe-replication-groups
  "Description copied from interface: AmazonElastiCache

  request - Represents the input of a DescribeReplicationGroups operation. - `com.amazonaws.services.elasticache.model.DescribeReplicationGroupsRequest`

  returns: Result of the DescribeReplicationGroups operation returned by the service. - `com.amazonaws.services.elasticache.model.DescribeReplicationGroupsResult`"
  (^com.amazonaws.services.elasticache.model.DescribeReplicationGroupsResult [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.DescribeReplicationGroupsRequest request]
    (-> this (.describeReplicationGroups request)))
  (^com.amazonaws.services.elasticache.model.DescribeReplicationGroupsResult [^AbstractAmazonElastiCache this]
    (-> this (.describeReplicationGroups))))

(defn delete-cache-cluster
  "Description copied from interface: AmazonElastiCache

  request - Represents the input of a DeleteCacheCluster operation. - `com.amazonaws.services.elasticache.model.DeleteCacheClusterRequest`

  returns: Result of the DeleteCacheCluster operation returned by the service. - `com.amazonaws.services.elasticache.model.CacheCluster`"
  (^com.amazonaws.services.elasticache.model.CacheCluster [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.DeleteCacheClusterRequest request]
    (-> this (.deleteCacheCluster request))))

(defn describe-cache-engine-versions
  "Description copied from interface: AmazonElastiCache

  request - Represents the input of a DescribeCacheEngineVersions operation. - `com.amazonaws.services.elasticache.model.DescribeCacheEngineVersionsRequest`

  returns: Result of the DescribeCacheEngineVersions operation returned by the service. - `com.amazonaws.services.elasticache.model.DescribeCacheEngineVersionsResult`"
  (^com.amazonaws.services.elasticache.model.DescribeCacheEngineVersionsResult [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.DescribeCacheEngineVersionsRequest request]
    (-> this (.describeCacheEngineVersions request)))
  (^com.amazonaws.services.elasticache.model.DescribeCacheEngineVersionsResult [^AbstractAmazonElastiCache this]
    (-> this (.describeCacheEngineVersions))))

(defn modify-replication-group
  "Description copied from interface: AmazonElastiCache

  request - Represents the input of a ModifyReplicationGroups operation. - `com.amazonaws.services.elasticache.model.ModifyReplicationGroupRequest`

  returns: Result of the ModifyReplicationGroup operation returned by the service. - `com.amazonaws.services.elasticache.model.ReplicationGroup`"
  (^com.amazonaws.services.elasticache.model.ReplicationGroup [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.ModifyReplicationGroupRequest request]
    (-> this (.modifyReplicationGroup request))))

(defn describe-update-actions
  "Description copied from interface: AmazonElastiCache

  request - `com.amazonaws.services.elasticache.model.DescribeUpdateActionsRequest`

  returns: Result of the DescribeUpdateActions operation returned by the service. - `com.amazonaws.services.elasticache.model.DescribeUpdateActionsResult`"
  (^com.amazonaws.services.elasticache.model.DescribeUpdateActionsResult [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.DescribeUpdateActionsRequest request]
    (-> this (.describeUpdateActions request))))

(defn decrease-replica-count
  "Description copied from interface: AmazonElastiCache

  request - `com.amazonaws.services.elasticache.model.DecreaseReplicaCountRequest`

  returns: Result of the DecreaseReplicaCount operation returned by the service. - `com.amazonaws.services.elasticache.model.ReplicationGroup`"
  (^com.amazonaws.services.elasticache.model.ReplicationGroup [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.DecreaseReplicaCountRequest request]
    (-> this (.decreaseReplicaCount request))))

(defn describe-cache-clusters
  "Description copied from interface: AmazonElastiCache

  request - Represents the input of a DescribeCacheClusters operation. - `com.amazonaws.services.elasticache.model.DescribeCacheClustersRequest`

  returns: Result of the DescribeCacheClusters operation returned by the service. - `com.amazonaws.services.elasticache.model.DescribeCacheClustersResult`"
  (^com.amazonaws.services.elasticache.model.DescribeCacheClustersResult [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.DescribeCacheClustersRequest request]
    (-> this (.describeCacheClusters request)))
  (^com.amazonaws.services.elasticache.model.DescribeCacheClustersResult [^AbstractAmazonElastiCache this]
    (-> this (.describeCacheClusters))))

(defn shutdown
  "Description copied from interface: AmazonElastiCache"
  ([^AbstractAmazonElastiCache this]
    (-> this (.shutdown))))

(defn describe-events
  "Description copied from interface: AmazonElastiCache

  request - Represents the input of a DescribeEvents operation. - `com.amazonaws.services.elasticache.model.DescribeEventsRequest`

  returns: Result of the DescribeEvents operation returned by the service. - `com.amazonaws.services.elasticache.model.DescribeEventsResult`"
  (^com.amazonaws.services.elasticache.model.DescribeEventsResult [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.DescribeEventsRequest request]
    (-> this (.describeEvents request)))
  (^com.amazonaws.services.elasticache.model.DescribeEventsResult [^AbstractAmazonElastiCache this]
    (-> this (.describeEvents))))

(defn delete-snapshot
  "Description copied from interface: AmazonElastiCache

  request - Represents the input of a DeleteSnapshot operation. - `com.amazonaws.services.elasticache.model.DeleteSnapshotRequest`

  returns: Result of the DeleteSnapshot operation returned by the service. - `com.amazonaws.services.elasticache.model.Snapshot`"
  (^com.amazonaws.services.elasticache.model.Snapshot [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.DeleteSnapshotRequest request]
    (-> this (.deleteSnapshot request))))

(defn reboot-cache-cluster
  "Description copied from interface: AmazonElastiCache

  request - Represents the input of a RebootCacheCluster operation. - `com.amazonaws.services.elasticache.model.RebootCacheClusterRequest`

  returns: Result of the RebootCacheCluster operation returned by the service. - `com.amazonaws.services.elasticache.model.CacheCluster`"
  (^com.amazonaws.services.elasticache.model.CacheCluster [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.RebootCacheClusterRequest request]
    (-> this (.rebootCacheCluster request))))

(defn revoke-cache-security-group-ingress
  "Description copied from interface: AmazonElastiCache

  request - Represents the input of a RevokeCacheSecurityGroupIngress operation. - `com.amazonaws.services.elasticache.model.RevokeCacheSecurityGroupIngressRequest`

  returns: Result of the RevokeCacheSecurityGroupIngress operation returned by the service. - `com.amazonaws.services.elasticache.model.CacheSecurityGroup`"
  (^com.amazonaws.services.elasticache.model.CacheSecurityGroup [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.RevokeCacheSecurityGroupIngressRequest request]
    (-> this (.revokeCacheSecurityGroupIngress request))))

(defn create-cache-security-group
  "Description copied from interface: AmazonElastiCache

  request - Represents the input of a CreateCacheSecurityGroup operation. - `com.amazonaws.services.elasticache.model.CreateCacheSecurityGroupRequest`

  returns: Result of the CreateCacheSecurityGroup operation returned by the service. - `com.amazonaws.services.elasticache.model.CacheSecurityGroup`"
  (^com.amazonaws.services.elasticache.model.CacheSecurityGroup [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.CreateCacheSecurityGroupRequest request]
    (-> this (.createCacheSecurityGroup request))))

(defn describe-snapshots
  "Description copied from interface: AmazonElastiCache

  request - Represents the input of a DescribeSnapshotsMessage operation. - `com.amazonaws.services.elasticache.model.DescribeSnapshotsRequest`

  returns: Result of the DescribeSnapshots operation returned by the service. - `com.amazonaws.services.elasticache.model.DescribeSnapshotsResult`"
  (^com.amazonaws.services.elasticache.model.DescribeSnapshotsResult [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.DescribeSnapshotsRequest request]
    (-> this (.describeSnapshots request)))
  (^com.amazonaws.services.elasticache.model.DescribeSnapshotsResult [^AbstractAmazonElastiCache this]
    (-> this (.describeSnapshots))))

(defn describe-reserved-cache-nodes-offerings
  "Description copied from interface: AmazonElastiCache

  request - Represents the input of a DescribeReservedCacheNodesOfferings operation. - `com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesOfferingsRequest`

  returns: Result of the DescribeReservedCacheNodesOfferings operation returned by the service. - `com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesOfferingsResult`"
  (^com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesOfferingsResult [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesOfferingsRequest request]
    (-> this (.describeReservedCacheNodesOfferings request)))
  (^com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesOfferingsResult [^AbstractAmazonElastiCache this]
    (-> this (.describeReservedCacheNodesOfferings))))

(defn set-endpoint
  "Description copied from interface: AmazonElastiCache

  endpoint - The endpoint (ex: \"elasticache.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"elasticache.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonElastiCache this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn list-allowed-node-type-modifications
  "Description copied from interface: AmazonElastiCache

  request - The input parameters for the ListAllowedNodeTypeModifications operation. - `com.amazonaws.services.elasticache.model.ListAllowedNodeTypeModificationsRequest`

  returns: Result of the ListAllowedNodeTypeModifications operation returned by the service. - `com.amazonaws.services.elasticache.model.ListAllowedNodeTypeModificationsResult`"
  (^com.amazonaws.services.elasticache.model.ListAllowedNodeTypeModificationsResult [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.ListAllowedNodeTypeModificationsRequest request]
    (-> this (.listAllowedNodeTypeModifications request)))
  (^com.amazonaws.services.elasticache.model.ListAllowedNodeTypeModificationsResult [^AbstractAmazonElastiCache this]
    (-> this (.listAllowedNodeTypeModifications))))

(defn modify-cache-subnet-group
  "Description copied from interface: AmazonElastiCache

  request - Represents the input of a ModifyCacheSubnetGroup operation. - `com.amazonaws.services.elasticache.model.ModifyCacheSubnetGroupRequest`

  returns: Result of the ModifyCacheSubnetGroup operation returned by the service. - `com.amazonaws.services.elasticache.model.CacheSubnetGroup`"
  (^com.amazonaws.services.elasticache.model.CacheSubnetGroup [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.ModifyCacheSubnetGroupRequest request]
    (-> this (.modifyCacheSubnetGroup request))))

(defn create-replication-group
  "Description copied from interface: AmazonElastiCache

  request - Represents the input of a CreateReplicationGroup operation. - `com.amazonaws.services.elasticache.model.CreateReplicationGroupRequest`

  returns: Result of the CreateReplicationGroup operation returned by the service. - `com.amazonaws.services.elasticache.model.ReplicationGroup`"
  (^com.amazonaws.services.elasticache.model.ReplicationGroup [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.CreateReplicationGroupRequest request]
    (-> this (.createReplicationGroup request))))

(defn delete-cache-parameter-group
  "Description copied from interface: AmazonElastiCache

  request - Represents the input of a DeleteCacheParameterGroup operation. - `com.amazonaws.services.elasticache.model.DeleteCacheParameterGroupRequest`

  returns: Result of the DeleteCacheParameterGroup operation returned by the service. - `com.amazonaws.services.elasticache.model.DeleteCacheParameterGroupResult`"
  (^com.amazonaws.services.elasticache.model.DeleteCacheParameterGroupResult [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.DeleteCacheParameterGroupRequest request]
    (-> this (.deleteCacheParameterGroup request))))

(defn modify-cache-parameter-group
  "Description copied from interface: AmazonElastiCache

  request - Represents the input of a ModifyCacheParameterGroup operation. - `com.amazonaws.services.elasticache.model.ModifyCacheParameterGroupRequest`

  returns: Result of the ModifyCacheParameterGroup operation returned by the service. - `com.amazonaws.services.elasticache.model.ModifyCacheParameterGroupResult`"
  (^com.amazonaws.services.elasticache.model.ModifyCacheParameterGroupResult [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.ModifyCacheParameterGroupRequest request]
    (-> this (.modifyCacheParameterGroup request))))

(defn authorize-cache-security-group-ingress
  "Description copied from interface: AmazonElastiCache

  request - Represents the input of an AuthorizeCacheSecurityGroupIngress operation. - `com.amazonaws.services.elasticache.model.AuthorizeCacheSecurityGroupIngressRequest`

  returns: Result of the AuthorizeCacheSecurityGroupIngress operation returned by the service. - `com.amazonaws.services.elasticache.model.CacheSecurityGroup`"
  (^com.amazonaws.services.elasticache.model.CacheSecurityGroup [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.AuthorizeCacheSecurityGroupIngressRequest request]
    (-> this (.authorizeCacheSecurityGroupIngress request))))

(defn describe-engine-default-parameters
  "Description copied from interface: AmazonElastiCache

  request - Represents the input of a DescribeEngineDefaultParameters operation. - `com.amazonaws.services.elasticache.model.DescribeEngineDefaultParametersRequest`

  returns: Result of the DescribeEngineDefaultParameters operation returned by the service. - `com.amazonaws.services.elasticache.model.EngineDefaults`"
  (^com.amazonaws.services.elasticache.model.EngineDefaults [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.DescribeEngineDefaultParametersRequest request]
    (-> this (.describeEngineDefaultParameters request))))

(defn remove-tags-from-resource
  "Description copied from interface: AmazonElastiCache

  request - Represents the input of a RemoveTagsFromResource operation. - `com.amazonaws.services.elasticache.model.RemoveTagsFromResourceRequest`

  returns: Result of the RemoveTagsFromResource operation returned by the service. - `com.amazonaws.services.elasticache.model.RemoveTagsFromResourceResult`"
  (^com.amazonaws.services.elasticache.model.RemoveTagsFromResourceResult [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.RemoveTagsFromResourceRequest request]
    (-> this (.removeTagsFromResource request))))

(defn add-tags-to-resource
  "Description copied from interface: AmazonElastiCache

  request - Represents the input of an AddTagsToResource operation. - `com.amazonaws.services.elasticache.model.AddTagsToResourceRequest`

  returns: Result of the AddTagsToResource operation returned by the service. - `com.amazonaws.services.elasticache.model.AddTagsToResourceResult`"
  (^com.amazonaws.services.elasticache.model.AddTagsToResourceResult [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.AddTagsToResourceRequest request]
    (-> this (.addTagsToResource request))))

(defn describe-reserved-cache-nodes
  "Description copied from interface: AmazonElastiCache

  request - Represents the input of a DescribeReservedCacheNodes operation. - `com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesRequest`

  returns: Result of the DescribeReservedCacheNodes operation returned by the service. - `com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesResult`"
  (^com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesResult [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesRequest request]
    (-> this (.describeReservedCacheNodes request)))
  (^com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesResult [^AbstractAmazonElastiCache this]
    (-> this (.describeReservedCacheNodes))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonElastiCache

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonElastiCache this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn delete-replication-group
  "Description copied from interface: AmazonElastiCache

  request - Represents the input of a DeleteReplicationGroup operation. - `com.amazonaws.services.elasticache.model.DeleteReplicationGroupRequest`

  returns: Result of the DeleteReplicationGroup operation returned by the service. - `com.amazonaws.services.elasticache.model.ReplicationGroup`"
  (^com.amazonaws.services.elasticache.model.ReplicationGroup [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.DeleteReplicationGroupRequest request]
    (-> this (.deleteReplicationGroup request))))

(defn describe-cache-parameters
  "Description copied from interface: AmazonElastiCache

  request - Represents the input of a DescribeCacheParameters operation. - `com.amazonaws.services.elasticache.model.DescribeCacheParametersRequest`

  returns: Result of the DescribeCacheParameters operation returned by the service. - `com.amazonaws.services.elasticache.model.DescribeCacheParametersResult`"
  (^com.amazonaws.services.elasticache.model.DescribeCacheParametersResult [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.DescribeCacheParametersRequest request]
    (-> this (.describeCacheParameters request))))

(defn test-failover
  "Description copied from interface: AmazonElastiCache

  request - `com.amazonaws.services.elasticache.model.TestFailoverRequest`

  returns: Result of the TestFailover operation returned by the service. - `com.amazonaws.services.elasticache.model.ReplicationGroup`"
  (^com.amazonaws.services.elasticache.model.ReplicationGroup [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.TestFailoverRequest request]
    (-> this (.testFailover request))))

(defn purchase-reserved-cache-nodes-offering
  "Description copied from interface: AmazonElastiCache

  request - Represents the input of a PurchaseReservedCacheNodesOffering operation. - `com.amazonaws.services.elasticache.model.PurchaseReservedCacheNodesOfferingRequest`

  returns: Result of the PurchaseReservedCacheNodesOffering operation returned by the service. - `com.amazonaws.services.elasticache.model.ReservedCacheNode`"
  (^com.amazonaws.services.elasticache.model.ReservedCacheNode [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.PurchaseReservedCacheNodesOfferingRequest request]
    (-> this (.purchaseReservedCacheNodesOffering request))))

(defn create-snapshot
  "Description copied from interface: AmazonElastiCache

  request - Represents the input of a CreateSnapshot operation. - `com.amazonaws.services.elasticache.model.CreateSnapshotRequest`

  returns: Result of the CreateSnapshot operation returned by the service. - `com.amazonaws.services.elasticache.model.Snapshot`"
  (^com.amazonaws.services.elasticache.model.Snapshot [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.CreateSnapshotRequest request]
    (-> this (.createSnapshot request))))

(defn describe-cache-subnet-groups
  "Description copied from interface: AmazonElastiCache

  request - Represents the input of a DescribeCacheSubnetGroups operation. - `com.amazonaws.services.elasticache.model.DescribeCacheSubnetGroupsRequest`

  returns: Result of the DescribeCacheSubnetGroups operation returned by the service. - `com.amazonaws.services.elasticache.model.DescribeCacheSubnetGroupsResult`"
  (^com.amazonaws.services.elasticache.model.DescribeCacheSubnetGroupsResult [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.DescribeCacheSubnetGroupsRequest request]
    (-> this (.describeCacheSubnetGroups request)))
  (^com.amazonaws.services.elasticache.model.DescribeCacheSubnetGroupsResult [^AbstractAmazonElastiCache this]
    (-> this (.describeCacheSubnetGroups))))

(defn create-cache-subnet-group
  "Description copied from interface: AmazonElastiCache

  request - Represents the input of a CreateCacheSubnetGroup operation. - `com.amazonaws.services.elasticache.model.CreateCacheSubnetGroupRequest`

  returns: Result of the CreateCacheSubnetGroup operation returned by the service. - `com.amazonaws.services.elasticache.model.CacheSubnetGroup`"
  (^com.amazonaws.services.elasticache.model.CacheSubnetGroup [^AbstractAmazonElastiCache this ^com.amazonaws.services.elasticache.model.CreateCacheSubnetGroupRequest request]
    (-> this (.createCacheSubnetGroup request))))

