(ns com.amazonaws.services.kafka.AWSKafkaAsync
  "Interface for accessing Kafka asynchronously. Each asynchronous method will return a Java Future object representing
  the asynchronous operation; overloads which accept an AsyncHandler can be used to receive notification when
  an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSKafkaAsync instead.




  The operations for managing an Amazon MSK cluster."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kafka AWSKafkaAsync]))

(defn untag-resource-async
  "Removes the tags associated with the keys that are provided in the query.

  untag-resource-request - `com.amazonaws.services.kafka.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kafka.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSKafkaAsync this ^com.amazonaws.services.kafka.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSKafkaAsync this ^com.amazonaws.services.kafka.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn describe-cluster-operation-async
  "Returns a description of the cluster operation specified by the ARN.

  describe-cluster-operation-request - `com.amazonaws.services.kafka.model.DescribeClusterOperationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeClusterOperation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kafka.model.DescribeClusterOperationResult>`"
  (^java.util.concurrent.Future [^AWSKafkaAsync this ^com.amazonaws.services.kafka.model.DescribeClusterOperationRequest describe-cluster-operation-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClusterOperationAsync describe-cluster-operation-request async-handler)))
  (^java.util.concurrent.Future [^AWSKafkaAsync this ^com.amazonaws.services.kafka.model.DescribeClusterOperationRequest describe-cluster-operation-request]
    (-> this (.describeClusterOperationAsync describe-cluster-operation-request))))

(defn create-cluster-async
  "Creates a new MSK cluster.

  create-cluster-request - `com.amazonaws.services.kafka.model.CreateClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kafka.model.CreateClusterResult>`"
  (^java.util.concurrent.Future [^AWSKafkaAsync this ^com.amazonaws.services.kafka.model.CreateClusterRequest create-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createClusterAsync create-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AWSKafkaAsync this ^com.amazonaws.services.kafka.model.CreateClusterRequest create-cluster-request]
    (-> this (.createClusterAsync create-cluster-request))))

(defn update-broker-storage-async
  "Updates the EBS storage associated with MSK brokers.

  update-broker-storage-request - `com.amazonaws.services.kafka.model.UpdateBrokerStorageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateBrokerStorage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kafka.model.UpdateBrokerStorageResult>`"
  (^java.util.concurrent.Future [^AWSKafkaAsync this ^com.amazonaws.services.kafka.model.UpdateBrokerStorageRequest update-broker-storage-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateBrokerStorageAsync update-broker-storage-request async-handler)))
  (^java.util.concurrent.Future [^AWSKafkaAsync this ^com.amazonaws.services.kafka.model.UpdateBrokerStorageRequest update-broker-storage-request]
    (-> this (.updateBrokerStorageAsync update-broker-storage-request))))

(defn list-configuration-revisions-async
  "Returns a list of all the MSK configurations in this Region.

  list-configuration-revisions-request - `com.amazonaws.services.kafka.model.ListConfigurationRevisionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListConfigurationRevisions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kafka.model.ListConfigurationRevisionsResult>`"
  (^java.util.concurrent.Future [^AWSKafkaAsync this ^com.amazonaws.services.kafka.model.ListConfigurationRevisionsRequest list-configuration-revisions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listConfigurationRevisionsAsync list-configuration-revisions-request async-handler)))
  (^java.util.concurrent.Future [^AWSKafkaAsync this ^com.amazonaws.services.kafka.model.ListConfigurationRevisionsRequest list-configuration-revisions-request]
    (-> this (.listConfigurationRevisionsAsync list-configuration-revisions-request))))

(defn describe-configuration-async
  "Returns a description of this MSK configuration.

  describe-configuration-request - `com.amazonaws.services.kafka.model.DescribeConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kafka.model.DescribeConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSKafkaAsync this ^com.amazonaws.services.kafka.model.DescribeConfigurationRequest describe-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeConfigurationAsync describe-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AWSKafkaAsync this ^com.amazonaws.services.kafka.model.DescribeConfigurationRequest describe-configuration-request]
    (-> this (.describeConfigurationAsync describe-configuration-request))))

(defn list-nodes-async
  "Returns a list of the broker nodes in the cluster.

  list-nodes-request - `com.amazonaws.services.kafka.model.ListNodesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListNodes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kafka.model.ListNodesResult>`"
  (^java.util.concurrent.Future [^AWSKafkaAsync this ^com.amazonaws.services.kafka.model.ListNodesRequest list-nodes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listNodesAsync list-nodes-request async-handler)))
  (^java.util.concurrent.Future [^AWSKafkaAsync this ^com.amazonaws.services.kafka.model.ListNodesRequest list-nodes-request]
    (-> this (.listNodesAsync list-nodes-request))))

(defn list-configurations-async
  "Returns a list of all the MSK configurations in this Region.

  list-configurations-request - `com.amazonaws.services.kafka.model.ListConfigurationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListConfigurations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kafka.model.ListConfigurationsResult>`"
  (^java.util.concurrent.Future [^AWSKafkaAsync this ^com.amazonaws.services.kafka.model.ListConfigurationsRequest list-configurations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listConfigurationsAsync list-configurations-request async-handler)))
  (^java.util.concurrent.Future [^AWSKafkaAsync this ^com.amazonaws.services.kafka.model.ListConfigurationsRequest list-configurations-request]
    (-> this (.listConfigurationsAsync list-configurations-request))))

(defn create-configuration-async
  "Creates a new MSK configuration.

  create-configuration-request - `com.amazonaws.services.kafka.model.CreateConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kafka.model.CreateConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSKafkaAsync this ^com.amazonaws.services.kafka.model.CreateConfigurationRequest create-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createConfigurationAsync create-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AWSKafkaAsync this ^com.amazonaws.services.kafka.model.CreateConfigurationRequest create-configuration-request]
    (-> this (.createConfigurationAsync create-configuration-request))))

(defn delete-cluster-async
  "Deletes the MSK cluster specified by the Amazon Resource Name (ARN) in the request.

  delete-cluster-request - `com.amazonaws.services.kafka.model.DeleteClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kafka.model.DeleteClusterResult>`"
  (^java.util.concurrent.Future [^AWSKafkaAsync this ^com.amazonaws.services.kafka.model.DeleteClusterRequest delete-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteClusterAsync delete-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AWSKafkaAsync this ^com.amazonaws.services.kafka.model.DeleteClusterRequest delete-cluster-request]
    (-> this (.deleteClusterAsync delete-cluster-request))))

(defn list-cluster-operations-async
  "Returns a list of all the operations that have been performed on the specified MSK cluster.

  list-cluster-operations-request - `com.amazonaws.services.kafka.model.ListClusterOperationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListClusterOperations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kafka.model.ListClusterOperationsResult>`"
  (^java.util.concurrent.Future [^AWSKafkaAsync this ^com.amazonaws.services.kafka.model.ListClusterOperationsRequest list-cluster-operations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listClusterOperationsAsync list-cluster-operations-request async-handler)))
  (^java.util.concurrent.Future [^AWSKafkaAsync this ^com.amazonaws.services.kafka.model.ListClusterOperationsRequest list-cluster-operations-request]
    (-> this (.listClusterOperationsAsync list-cluster-operations-request))))

(defn describe-configuration-revision-async
  "Returns a description of this revision of the configuration.

  describe-configuration-revision-request - `com.amazonaws.services.kafka.model.DescribeConfigurationRevisionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeConfigurationRevision operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.kafka.model.DescribeConfigurationRevisionResult>`"
  (^java.util.concurrent.Future [^AWSKafkaAsync this ^com.amazonaws.services.kafka.model.DescribeConfigurationRevisionRequest describe-configuration-revision-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeConfigurationRevisionAsync describe-configuration-revision-request async-handler)))
  (^java.util.concurrent.Future [^AWSKafkaAsync this ^com.amazonaws.services.kafka.model.DescribeConfigurationRevisionRequest describe-configuration-revision-request]
    (-> this (.describeConfigurationRevisionAsync describe-configuration-revision-request))))

(defn list-clusters-async
  "Returns a list of all the MSK clusters in the current Region.

  list-clusters-request - `com.amazonaws.services.kafka.model.ListClustersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListClusters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kafka.model.ListClustersResult>`"
  (^java.util.concurrent.Future [^AWSKafkaAsync this ^com.amazonaws.services.kafka.model.ListClustersRequest list-clusters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listClustersAsync list-clusters-request async-handler)))
  (^java.util.concurrent.Future [^AWSKafkaAsync this ^com.amazonaws.services.kafka.model.ListClustersRequest list-clusters-request]
    (-> this (.listClustersAsync list-clusters-request))))

(defn update-cluster-configuration-async
  "Updates the cluster with the configuration that is specified in the request body.

  update-cluster-configuration-request - `com.amazonaws.services.kafka.model.UpdateClusterConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateClusterConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kafka.model.UpdateClusterConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSKafkaAsync this ^com.amazonaws.services.kafka.model.UpdateClusterConfigurationRequest update-cluster-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateClusterConfigurationAsync update-cluster-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AWSKafkaAsync this ^com.amazonaws.services.kafka.model.UpdateClusterConfigurationRequest update-cluster-configuration-request]
    (-> this (.updateClusterConfigurationAsync update-cluster-configuration-request))))

(defn describe-cluster-async
  "Returns a description of the MSK cluster whose Amazon Resource Name (ARN) is specified in the request.

  describe-cluster-request - `com.amazonaws.services.kafka.model.DescribeClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kafka.model.DescribeClusterResult>`"
  (^java.util.concurrent.Future [^AWSKafkaAsync this ^com.amazonaws.services.kafka.model.DescribeClusterRequest describe-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClusterAsync describe-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AWSKafkaAsync this ^com.amazonaws.services.kafka.model.DescribeClusterRequest describe-cluster-request]
    (-> this (.describeClusterAsync describe-cluster-request))))

(defn list-tags-for-resource-async
  "Returns a list of the tags associated with the specified resource.

  list-tags-for-resource-request - `com.amazonaws.services.kafka.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kafka.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSKafkaAsync this ^com.amazonaws.services.kafka.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSKafkaAsync this ^com.amazonaws.services.kafka.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn get-bootstrap-brokers-async
  "A list of brokers that a client application can use to bootstrap.

  get-bootstrap-brokers-request - `com.amazonaws.services.kafka.model.GetBootstrapBrokersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBootstrapBrokers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kafka.model.GetBootstrapBrokersResult>`"
  (^java.util.concurrent.Future [^AWSKafkaAsync this ^com.amazonaws.services.kafka.model.GetBootstrapBrokersRequest get-bootstrap-brokers-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBootstrapBrokersAsync get-bootstrap-brokers-request async-handler)))
  (^java.util.concurrent.Future [^AWSKafkaAsync this ^com.amazonaws.services.kafka.model.GetBootstrapBrokersRequest get-bootstrap-brokers-request]
    (-> this (.getBootstrapBrokersAsync get-bootstrap-brokers-request))))

(defn tag-resource-async
  "Adds tags to the specified MSK resource.

  tag-resource-request - `com.amazonaws.services.kafka.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kafka.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSKafkaAsync this ^com.amazonaws.services.kafka.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSKafkaAsync this ^com.amazonaws.services.kafka.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

