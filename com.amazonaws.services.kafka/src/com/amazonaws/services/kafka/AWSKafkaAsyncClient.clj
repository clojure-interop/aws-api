(ns com.amazonaws.services.kafka.AWSKafkaAsyncClient
  "Client for accessing Kafka asynchronously. Each asynchronous method will return a Java Future object representing the
  asynchronous operation; overloads which accept an AsyncHandler can be used to receive notification when an
  asynchronous operation completes.



  The operations for managing an Amazon MSK cluster."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kafka AWSKafkaAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.kafka.AWSKafkaAsyncClientBuilder`"
  (^com.amazonaws.services.kafka.AWSKafkaAsyncClientBuilder []
    (AWSKafkaAsyncClient/asyncBuilder )))

(defn untag-resource-async
  "Description copied from interface: AWSKafkaAsync

  request - `com.amazonaws.services.kafka.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kafka.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSKafkaAsyncClient this ^com.amazonaws.services.kafka.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKafkaAsyncClient this ^com.amazonaws.services.kafka.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn describe-cluster-operation-async
  "Description copied from interface: AWSKafkaAsync

  request - `com.amazonaws.services.kafka.model.DescribeClusterOperationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeClusterOperation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kafka.model.DescribeClusterOperationResult>`"
  (^java.util.concurrent.Future [^AWSKafkaAsyncClient this ^com.amazonaws.services.kafka.model.DescribeClusterOperationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClusterOperationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKafkaAsyncClient this ^com.amazonaws.services.kafka.model.DescribeClusterOperationRequest request]
    (-> this (.describeClusterOperationAsync request))))

(defn create-cluster-async
  "Description copied from interface: AWSKafkaAsync

  request - `com.amazonaws.services.kafka.model.CreateClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kafka.model.CreateClusterResult>`"
  (^java.util.concurrent.Future [^AWSKafkaAsyncClient this ^com.amazonaws.services.kafka.model.CreateClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKafkaAsyncClient this ^com.amazonaws.services.kafka.model.CreateClusterRequest request]
    (-> this (.createClusterAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSKafkaAsyncClient this]
    (-> this (.getExecutorService))))

(defn update-broker-storage-async
  "Description copied from interface: AWSKafkaAsync

  request - `com.amazonaws.services.kafka.model.UpdateBrokerStorageRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateBrokerStorage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kafka.model.UpdateBrokerStorageResult>`"
  (^java.util.concurrent.Future [^AWSKafkaAsyncClient this ^com.amazonaws.services.kafka.model.UpdateBrokerStorageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateBrokerStorageAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKafkaAsyncClient this ^com.amazonaws.services.kafka.model.UpdateBrokerStorageRequest request]
    (-> this (.updateBrokerStorageAsync request))))

(defn list-configuration-revisions-async
  "Description copied from interface: AWSKafkaAsync

  request - `com.amazonaws.services.kafka.model.ListConfigurationRevisionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListConfigurationRevisions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kafka.model.ListConfigurationRevisionsResult>`"
  (^java.util.concurrent.Future [^AWSKafkaAsyncClient this ^com.amazonaws.services.kafka.model.ListConfigurationRevisionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listConfigurationRevisionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKafkaAsyncClient this ^com.amazonaws.services.kafka.model.ListConfigurationRevisionsRequest request]
    (-> this (.listConfigurationRevisionsAsync request))))

(defn describe-configuration-async
  "Description copied from interface: AWSKafkaAsync

  request - `com.amazonaws.services.kafka.model.DescribeConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kafka.model.DescribeConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSKafkaAsyncClient this ^com.amazonaws.services.kafka.model.DescribeConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKafkaAsyncClient this ^com.amazonaws.services.kafka.model.DescribeConfigurationRequest request]
    (-> this (.describeConfigurationAsync request))))

(defn list-nodes-async
  "Description copied from interface: AWSKafkaAsync

  request - `com.amazonaws.services.kafka.model.ListNodesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListNodes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kafka.model.ListNodesResult>`"
  (^java.util.concurrent.Future [^AWSKafkaAsyncClient this ^com.amazonaws.services.kafka.model.ListNodesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listNodesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKafkaAsyncClient this ^com.amazonaws.services.kafka.model.ListNodesRequest request]
    (-> this (.listNodesAsync request))))

(defn list-configurations-async
  "Description copied from interface: AWSKafkaAsync

  request - `com.amazonaws.services.kafka.model.ListConfigurationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListConfigurations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kafka.model.ListConfigurationsResult>`"
  (^java.util.concurrent.Future [^AWSKafkaAsyncClient this ^com.amazonaws.services.kafka.model.ListConfigurationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listConfigurationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKafkaAsyncClient this ^com.amazonaws.services.kafka.model.ListConfigurationsRequest request]
    (-> this (.listConfigurationsAsync request))))

(defn create-configuration-async
  "Description copied from interface: AWSKafkaAsync

  request - `com.amazonaws.services.kafka.model.CreateConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kafka.model.CreateConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSKafkaAsyncClient this ^com.amazonaws.services.kafka.model.CreateConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKafkaAsyncClient this ^com.amazonaws.services.kafka.model.CreateConfigurationRequest request]
    (-> this (.createConfigurationAsync request))))

(defn delete-cluster-async
  "Description copied from interface: AWSKafkaAsync

  request - `com.amazonaws.services.kafka.model.DeleteClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kafka.model.DeleteClusterResult>`"
  (^java.util.concurrent.Future [^AWSKafkaAsyncClient this ^com.amazonaws.services.kafka.model.DeleteClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKafkaAsyncClient this ^com.amazonaws.services.kafka.model.DeleteClusterRequest request]
    (-> this (.deleteClusterAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSKafkaAsyncClient this]
    (-> this (.shutdown))))

(defn list-cluster-operations-async
  "Description copied from interface: AWSKafkaAsync

  request - `com.amazonaws.services.kafka.model.ListClusterOperationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListClusterOperations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kafka.model.ListClusterOperationsResult>`"
  (^java.util.concurrent.Future [^AWSKafkaAsyncClient this ^com.amazonaws.services.kafka.model.ListClusterOperationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listClusterOperationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKafkaAsyncClient this ^com.amazonaws.services.kafka.model.ListClusterOperationsRequest request]
    (-> this (.listClusterOperationsAsync request))))

(defn describe-configuration-revision-async
  "Description copied from interface: AWSKafkaAsync

  request - `com.amazonaws.services.kafka.model.DescribeConfigurationRevisionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeConfigurationRevision operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.kafka.model.DescribeConfigurationRevisionResult>`"
  (^java.util.concurrent.Future [^AWSKafkaAsyncClient this ^com.amazonaws.services.kafka.model.DescribeConfigurationRevisionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeConfigurationRevisionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKafkaAsyncClient this ^com.amazonaws.services.kafka.model.DescribeConfigurationRevisionRequest request]
    (-> this (.describeConfigurationRevisionAsync request))))

(defn list-clusters-async
  "Description copied from interface: AWSKafkaAsync

  request - `com.amazonaws.services.kafka.model.ListClustersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListClusters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kafka.model.ListClustersResult>`"
  (^java.util.concurrent.Future [^AWSKafkaAsyncClient this ^com.amazonaws.services.kafka.model.ListClustersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listClustersAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKafkaAsyncClient this ^com.amazonaws.services.kafka.model.ListClustersRequest request]
    (-> this (.listClustersAsync request))))

(defn update-cluster-configuration-async
  "Description copied from interface: AWSKafkaAsync

  request - `com.amazonaws.services.kafka.model.UpdateClusterConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateClusterConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kafka.model.UpdateClusterConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSKafkaAsyncClient this ^com.amazonaws.services.kafka.model.UpdateClusterConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateClusterConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKafkaAsyncClient this ^com.amazonaws.services.kafka.model.UpdateClusterConfigurationRequest request]
    (-> this (.updateClusterConfigurationAsync request))))

(defn describe-cluster-async
  "Description copied from interface: AWSKafkaAsync

  request - `com.amazonaws.services.kafka.model.DescribeClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kafka.model.DescribeClusterResult>`"
  (^java.util.concurrent.Future [^AWSKafkaAsyncClient this ^com.amazonaws.services.kafka.model.DescribeClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKafkaAsyncClient this ^com.amazonaws.services.kafka.model.DescribeClusterRequest request]
    (-> this (.describeClusterAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AWSKafkaAsync

  request - `com.amazonaws.services.kafka.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kafka.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSKafkaAsyncClient this ^com.amazonaws.services.kafka.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKafkaAsyncClient this ^com.amazonaws.services.kafka.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn get-bootstrap-brokers-async
  "Description copied from interface: AWSKafkaAsync

  request - `com.amazonaws.services.kafka.model.GetBootstrapBrokersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBootstrapBrokers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kafka.model.GetBootstrapBrokersResult>`"
  (^java.util.concurrent.Future [^AWSKafkaAsyncClient this ^com.amazonaws.services.kafka.model.GetBootstrapBrokersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBootstrapBrokersAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKafkaAsyncClient this ^com.amazonaws.services.kafka.model.GetBootstrapBrokersRequest request]
    (-> this (.getBootstrapBrokersAsync request))))

(defn tag-resource-async
  "Description copied from interface: AWSKafkaAsync

  request - `com.amazonaws.services.kafka.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kafka.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSKafkaAsyncClient this ^com.amazonaws.services.kafka.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSKafkaAsyncClient this ^com.amazonaws.services.kafka.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

