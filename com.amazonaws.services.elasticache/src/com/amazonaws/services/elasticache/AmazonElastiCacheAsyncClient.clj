(ns com.amazonaws.services.elasticache.AmazonElastiCacheAsyncClient
  "Client for accessing Amazon ElastiCache asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Amazon ElastiCache

  Amazon ElastiCache is a web service that makes it easier to set up, operate, and scale a distributed cache in the
  cloud.


  With ElastiCache, customers get all of the benefits of a high-performance, in-memory cache with less of the
  administrative burden involved in launching and managing a distributed cache. The service makes setup, scaling, and
  cluster failure handling much simpler than in a self-managed cache deployment.


  In addition, through integration with Amazon CloudWatch, customers get enhanced visibility into the key performance
  statistics associated with their cache and can receive alarms if a part of their cache runs hot."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.elasticache AmazonElastiCacheAsyncClient]))

(defn ->amazon-elasti-cache-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AmazonElastiCacheAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonElastiCacheAsyncClient aws-credentials client-configuration executor-service))
  (^AmazonElastiCacheAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonElastiCacheAsyncClient aws-credentials executor-service))
  (^AmazonElastiCacheAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonElastiCacheAsyncClient client-configuration))
  (^AmazonElastiCacheAsyncClient []
    (new AmazonElastiCacheAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.elasticache.AmazonElastiCacheAsyncClientBuilder`"
  (^com.amazonaws.services.elasticache.AmazonElastiCacheAsyncClientBuilder []
    (AmazonElastiCacheAsyncClient/asyncBuilder )))

(defn create-cache-subnet-group-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - Represents the input of a CreateCacheSubnetGroup operation. - `com.amazonaws.services.elasticache.model.CreateCacheSubnetGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCacheSubnetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.CacheSubnetGroup>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.CreateCacheSubnetGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCacheSubnetGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.CreateCacheSubnetGroupRequest request]
    (-> this (.createCacheSubnetGroupAsync request))))

(defn list-allowed-node-type-modifications-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - The input parameters for the ListAllowedNodeTypeModifications operation. - `com.amazonaws.services.elasticache.model.ListAllowedNodeTypeModificationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAllowedNodeTypeModifications operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.ListAllowedNodeTypeModificationsResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.ListAllowedNodeTypeModificationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAllowedNodeTypeModificationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.ListAllowedNodeTypeModificationsRequest request]
    (-> this (.listAllowedNodeTypeModificationsAsync request)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this]
    (-> this (.listAllowedNodeTypeModificationsAsync))))

(defn delete-cache-cluster-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - Represents the input of a DeleteCacheCluster operation. - `com.amazonaws.services.elasticache.model.DeleteCacheClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCacheCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.CacheCluster>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.DeleteCacheClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCacheClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.DeleteCacheClusterRequest request]
    (-> this (.deleteCacheClusterAsync request))))

(defn describe-cache-subnet-groups-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - Represents the input of a DescribeCacheSubnetGroups operation. - `com.amazonaws.services.elasticache.model.DescribeCacheSubnetGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCacheSubnetGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.DescribeCacheSubnetGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.DescribeCacheSubnetGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCacheSubnetGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.DescribeCacheSubnetGroupsRequest request]
    (-> this (.describeCacheSubnetGroupsAsync request)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this]
    (-> this (.describeCacheSubnetGroupsAsync))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonElastiCacheAsyncClient this]
    (-> this (.getExecutorService))))

(defn revoke-cache-security-group-ingress-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - Represents the input of a RevokeCacheSecurityGroupIngress operation. - `com.amazonaws.services.elasticache.model.RevokeCacheSecurityGroupIngressRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RevokeCacheSecurityGroupIngress operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.CacheSecurityGroup>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.RevokeCacheSecurityGroupIngressRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.revokeCacheSecurityGroupIngressAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.RevokeCacheSecurityGroupIngressRequest request]
    (-> this (.revokeCacheSecurityGroupIngressAsync request))))

(defn create-cache-parameter-group-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - Represents the input of a CreateCacheParameterGroup operation. - `com.amazonaws.services.elasticache.model.CreateCacheParameterGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCacheParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.CacheParameterGroup>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.CreateCacheParameterGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCacheParameterGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.CreateCacheParameterGroupRequest request]
    (-> this (.createCacheParameterGroupAsync request))))

(defn batch-apply-update-action-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - `com.amazonaws.services.elasticache.model.BatchApplyUpdateActionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchApplyUpdateAction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.BatchApplyUpdateActionResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.BatchApplyUpdateActionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchApplyUpdateActionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.BatchApplyUpdateActionRequest request]
    (-> this (.batchApplyUpdateActionAsync request))))

(defn create-replication-group-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - Represents the input of a CreateReplicationGroup operation. - `com.amazonaws.services.elasticache.model.CreateReplicationGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateReplicationGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.ReplicationGroup>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.CreateReplicationGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createReplicationGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.CreateReplicationGroupRequest request]
    (-> this (.createReplicationGroupAsync request))))

(defn modify-cache-parameter-group-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - Represents the input of a ModifyCacheParameterGroup operation. - `com.amazonaws.services.elasticache.model.ModifyCacheParameterGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyCacheParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.ModifyCacheParameterGroupResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.ModifyCacheParameterGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyCacheParameterGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.ModifyCacheParameterGroupRequest request]
    (-> this (.modifyCacheParameterGroupAsync request))))

(defn describe-cache-parameter-groups-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - Represents the input of a DescribeCacheParameterGroups operation. - `com.amazonaws.services.elasticache.model.DescribeCacheParameterGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCacheParameterGroups operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.DescribeCacheParameterGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.DescribeCacheParameterGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCacheParameterGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.DescribeCacheParameterGroupsRequest request]
    (-> this (.describeCacheParameterGroupsAsync request)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this]
    (-> this (.describeCacheParameterGroupsAsync))))

(defn describe-reserved-cache-nodes-offerings-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - Represents the input of a DescribeReservedCacheNodesOfferings operation. - `com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesOfferingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReservedCacheNodesOfferings operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesOfferingsResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesOfferingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReservedCacheNodesOfferingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesOfferingsRequest request]
    (-> this (.describeReservedCacheNodesOfferingsAsync request)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this]
    (-> this (.describeReservedCacheNodesOfferingsAsync))))

(defn create-snapshot-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - Represents the input of a CreateSnapshot operation. - `com.amazonaws.services.elasticache.model.CreateSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.Snapshot>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.CreateSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.CreateSnapshotRequest request]
    (-> this (.createSnapshotAsync request))))

(defn create-cache-cluster-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - Represents the input of a CreateCacheCluster operation. - `com.amazonaws.services.elasticache.model.CreateCacheClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCacheCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.CacheCluster>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.CreateCacheClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCacheClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.CreateCacheClusterRequest request]
    (-> this (.createCacheClusterAsync request))))

(defn delete-replication-group-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - Represents the input of a DeleteReplicationGroup operation. - `com.amazonaws.services.elasticache.model.DeleteReplicationGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteReplicationGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.ReplicationGroup>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.DeleteReplicationGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteReplicationGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.DeleteReplicationGroupRequest request]
    (-> this (.deleteReplicationGroupAsync request))))

(defn modify-cache-subnet-group-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - Represents the input of a ModifyCacheSubnetGroup operation. - `com.amazonaws.services.elasticache.model.ModifyCacheSubnetGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyCacheSubnetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.CacheSubnetGroup>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.ModifyCacheSubnetGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyCacheSubnetGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.ModifyCacheSubnetGroupRequest request]
    (-> this (.modifyCacheSubnetGroupAsync request))))

(defn describe-cache-security-groups-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - Represents the input of a DescribeCacheSecurityGroups operation. - `com.amazonaws.services.elasticache.model.DescribeCacheSecurityGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCacheSecurityGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.DescribeCacheSecurityGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.DescribeCacheSecurityGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCacheSecurityGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.DescribeCacheSecurityGroupsRequest request]
    (-> this (.describeCacheSecurityGroupsAsync request)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this]
    (-> this (.describeCacheSecurityGroupsAsync))))

(defn describe-cache-engine-versions-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - Represents the input of a DescribeCacheEngineVersions operation. - `com.amazonaws.services.elasticache.model.DescribeCacheEngineVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCacheEngineVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.DescribeCacheEngineVersionsResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.DescribeCacheEngineVersionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCacheEngineVersionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.DescribeCacheEngineVersionsRequest request]
    (-> this (.describeCacheEngineVersionsAsync request)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this]
    (-> this (.describeCacheEngineVersionsAsync))))

(defn describe-cache-clusters-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - Represents the input of a DescribeCacheClusters operation. - `com.amazonaws.services.elasticache.model.DescribeCacheClustersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCacheClusters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.DescribeCacheClustersResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.DescribeCacheClustersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCacheClustersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.DescribeCacheClustersRequest request]
    (-> this (.describeCacheClustersAsync request)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this]
    (-> this (.describeCacheClustersAsync))))

(defn describe-service-updates-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - `com.amazonaws.services.elasticache.model.DescribeServiceUpdatesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeServiceUpdates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.DescribeServiceUpdatesResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.DescribeServiceUpdatesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeServiceUpdatesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.DescribeServiceUpdatesRequest request]
    (-> this (.describeServiceUpdatesAsync request))))

(defn authorize-cache-security-group-ingress-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - Represents the input of an AuthorizeCacheSecurityGroupIngress operation. - `com.amazonaws.services.elasticache.model.AuthorizeCacheSecurityGroupIngressRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AuthorizeCacheSecurityGroupIngress operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.CacheSecurityGroup>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.AuthorizeCacheSecurityGroupIngressRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.authorizeCacheSecurityGroupIngressAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.AuthorizeCacheSecurityGroupIngressRequest request]
    (-> this (.authorizeCacheSecurityGroupIngressAsync request))))

(defn batch-stop-update-action-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - `com.amazonaws.services.elasticache.model.BatchStopUpdateActionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchStopUpdateAction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.BatchStopUpdateActionResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.BatchStopUpdateActionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchStopUpdateActionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.BatchStopUpdateActionRequest request]
    (-> this (.batchStopUpdateActionAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonElastiCacheAsyncClient this]
    (-> this (.shutdown))))

(defn increase-replica-count-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - `com.amazonaws.services.elasticache.model.IncreaseReplicaCountRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the IncreaseReplicaCount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.ReplicationGroup>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.IncreaseReplicaCountRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.increaseReplicaCountAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.IncreaseReplicaCountRequest request]
    (-> this (.increaseReplicaCountAsync request))))

(defn reset-cache-parameter-group-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - Represents the input of a ResetCacheParameterGroup operation. - `com.amazonaws.services.elasticache.model.ResetCacheParameterGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResetCacheParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.ResetCacheParameterGroupResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.ResetCacheParameterGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resetCacheParameterGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.ResetCacheParameterGroupRequest request]
    (-> this (.resetCacheParameterGroupAsync request))))

(defn decrease-replica-count-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - `com.amazonaws.services.elasticache.model.DecreaseReplicaCountRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DecreaseReplicaCount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.ReplicationGroup>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.DecreaseReplicaCountRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.decreaseReplicaCountAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.DecreaseReplicaCountRequest request]
    (-> this (.decreaseReplicaCountAsync request))))

(defn describe-snapshots-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - Represents the input of a DescribeSnapshotsMessage operation. - `com.amazonaws.services.elasticache.model.DescribeSnapshotsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSnapshots operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.DescribeSnapshotsResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.DescribeSnapshotsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSnapshotsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.DescribeSnapshotsRequest request]
    (-> this (.describeSnapshotsAsync request)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this]
    (-> this (.describeSnapshotsAsync))))

(defn describe-cache-parameters-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - Represents the input of a DescribeCacheParameters operation. - `com.amazonaws.services.elasticache.model.DescribeCacheParametersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCacheParameters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.DescribeCacheParametersResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.DescribeCacheParametersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCacheParametersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.DescribeCacheParametersRequest request]
    (-> this (.describeCacheParametersAsync request))))

(defn delete-cache-security-group-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - Represents the input of a DeleteCacheSecurityGroup operation. - `com.amazonaws.services.elasticache.model.DeleteCacheSecurityGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCacheSecurityGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.DeleteCacheSecurityGroupResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.DeleteCacheSecurityGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCacheSecurityGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.DeleteCacheSecurityGroupRequest request]
    (-> this (.deleteCacheSecurityGroupAsync request))))

(defn remove-tags-from-resource-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - Represents the input of a RemoveTagsFromResource operation. - `com.amazonaws.services.elasticache.model.RemoveTagsFromResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveTagsFromResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.RemoveTagsFromResourceResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.RemoveTagsFromResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeTagsFromResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.RemoveTagsFromResourceRequest request]
    (-> this (.removeTagsFromResourceAsync request))))

(defn reboot-cache-cluster-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - Represents the input of a RebootCacheCluster operation. - `com.amazonaws.services.elasticache.model.RebootCacheClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RebootCacheCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.CacheCluster>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.RebootCacheClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rebootCacheClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.RebootCacheClusterRequest request]
    (-> this (.rebootCacheClusterAsync request))))

(defn purchase-reserved-cache-nodes-offering-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - Represents the input of a PurchaseReservedCacheNodesOffering operation. - `com.amazonaws.services.elasticache.model.PurchaseReservedCacheNodesOfferingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PurchaseReservedCacheNodesOffering operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.ReservedCacheNode>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.PurchaseReservedCacheNodesOfferingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.purchaseReservedCacheNodesOfferingAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.PurchaseReservedCacheNodesOfferingRequest request]
    (-> this (.purchaseReservedCacheNodesOfferingAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - The input parameters for the ListTagsForResource operation. - `com.amazonaws.services.elasticache.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn modify-replication-group-shard-configuration-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - Represents the input for a ModifyReplicationGroupShardConfiguration operation. - `com.amazonaws.services.elasticache.model.ModifyReplicationGroupShardConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyReplicationGroupShardConfiguration operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.ReplicationGroup>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.ModifyReplicationGroupShardConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyReplicationGroupShardConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.ModifyReplicationGroupShardConfigurationRequest request]
    (-> this (.modifyReplicationGroupShardConfigurationAsync request))))

(defn describe-engine-default-parameters-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - Represents the input of a DescribeEngineDefaultParameters operation. - `com.amazonaws.services.elasticache.model.DescribeEngineDefaultParametersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEngineDefaultParameters operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.EngineDefaults>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.DescribeEngineDefaultParametersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEngineDefaultParametersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.DescribeEngineDefaultParametersRequest request]
    (-> this (.describeEngineDefaultParametersAsync request))))

(defn describe-events-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - Represents the input of a DescribeEvents operation. - `com.amazonaws.services.elasticache.model.DescribeEventsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.DescribeEventsResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.DescribeEventsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.DescribeEventsRequest request]
    (-> this (.describeEventsAsync request)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this]
    (-> this (.describeEventsAsync))))

(defn delete-cache-subnet-group-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - Represents the input of a DeleteCacheSubnetGroup operation. - `com.amazonaws.services.elasticache.model.DeleteCacheSubnetGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCacheSubnetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.DeleteCacheSubnetGroupResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.DeleteCacheSubnetGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCacheSubnetGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.DeleteCacheSubnetGroupRequest request]
    (-> this (.deleteCacheSubnetGroupAsync request))))

(defn test-failover-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - `com.amazonaws.services.elasticache.model.TestFailoverRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TestFailover operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.ReplicationGroup>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.TestFailoverRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.testFailoverAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.TestFailoverRequest request]
    (-> this (.testFailoverAsync request))))

(defn create-cache-security-group-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - Represents the input of a CreateCacheSecurityGroup operation. - `com.amazonaws.services.elasticache.model.CreateCacheSecurityGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCacheSecurityGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.CacheSecurityGroup>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.CreateCacheSecurityGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCacheSecurityGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.CreateCacheSecurityGroupRequest request]
    (-> this (.createCacheSecurityGroupAsync request))))

(defn describe-reserved-cache-nodes-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - Represents the input of a DescribeReservedCacheNodes operation. - `com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReservedCacheNodes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReservedCacheNodesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesRequest request]
    (-> this (.describeReservedCacheNodesAsync request)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this]
    (-> this (.describeReservedCacheNodesAsync))))

(defn delete-cache-parameter-group-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - Represents the input of a DeleteCacheParameterGroup operation. - `com.amazonaws.services.elasticache.model.DeleteCacheParameterGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCacheParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.DeleteCacheParameterGroupResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.DeleteCacheParameterGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCacheParameterGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.DeleteCacheParameterGroupRequest request]
    (-> this (.deleteCacheParameterGroupAsync request))))

(defn describe-replication-groups-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - Represents the input of a DescribeReplicationGroups operation. - `com.amazonaws.services.elasticache.model.DescribeReplicationGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReplicationGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.DescribeReplicationGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.DescribeReplicationGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReplicationGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.DescribeReplicationGroupsRequest request]
    (-> this (.describeReplicationGroupsAsync request)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this]
    (-> this (.describeReplicationGroupsAsync))))

(defn describe-update-actions-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - `com.amazonaws.services.elasticache.model.DescribeUpdateActionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeUpdateActions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.DescribeUpdateActionsResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.DescribeUpdateActionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeUpdateActionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.DescribeUpdateActionsRequest request]
    (-> this (.describeUpdateActionsAsync request))))

(defn add-tags-to-resource-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - Represents the input of an AddTagsToResource operation. - `com.amazonaws.services.elasticache.model.AddTagsToResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddTagsToResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.AddTagsToResourceResult>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.AddTagsToResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addTagsToResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.AddTagsToResourceRequest request]
    (-> this (.addTagsToResourceAsync request))))

(defn copy-snapshot-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - Represents the input of a CopySnapshotMessage operation. - `com.amazonaws.services.elasticache.model.CopySnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CopySnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.Snapshot>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.CopySnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.copySnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.CopySnapshotRequest request]
    (-> this (.copySnapshotAsync request))))

(defn modify-cache-cluster-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - Represents the input of a ModifyCacheCluster operation. - `com.amazonaws.services.elasticache.model.ModifyCacheClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyCacheCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.CacheCluster>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.ModifyCacheClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyCacheClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.ModifyCacheClusterRequest request]
    (-> this (.modifyCacheClusterAsync request))))

(defn modify-replication-group-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - Represents the input of a ModifyReplicationGroups operation. - `com.amazonaws.services.elasticache.model.ModifyReplicationGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyReplicationGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.ReplicationGroup>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.ModifyReplicationGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyReplicationGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.ModifyReplicationGroupRequest request]
    (-> this (.modifyReplicationGroupAsync request))))

(defn delete-snapshot-async
  "Description copied from interface: AmazonElastiCacheAsync

  request - Represents the input of a DeleteSnapshot operation. - `com.amazonaws.services.elasticache.model.DeleteSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticache.model.Snapshot>`"
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.DeleteSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElastiCacheAsyncClient this ^com.amazonaws.services.elasticache.model.DeleteSnapshotRequest request]
    (-> this (.deleteSnapshotAsync request))))

