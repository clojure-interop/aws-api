(ns com.amazonaws.services.kafka.AbstractAWSKafka
  "Abstract implementation of AWSKafka. Convenient method forms pass through to the corresponding overload that
  takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kafka AbstractAWSKafka]))

(defn list-tags-for-resource
  "Description copied from interface: AWSKafka

  request - `com.amazonaws.services.kafka.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.kafka.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.kafka.model.ListTagsForResourceResult [^AbstractAWSKafka this ^com.amazonaws.services.kafka.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn describe-cluster
  "Description copied from interface: AWSKafka

  request - `com.amazonaws.services.kafka.model.DescribeClusterRequest`

  returns: Result of the DescribeCluster operation returned by the service. - `com.amazonaws.services.kafka.model.DescribeClusterResult`"
  (^com.amazonaws.services.kafka.model.DescribeClusterResult [^AbstractAWSKafka this ^com.amazonaws.services.kafka.model.DescribeClusterRequest request]
    (-> this (.describeCluster request))))

(defn get-bootstrap-brokers
  "Description copied from interface: AWSKafka

  request - `com.amazonaws.services.kafka.model.GetBootstrapBrokersRequest`

  returns: Result of the GetBootstrapBrokers operation returned by the service. - `com.amazonaws.services.kafka.model.GetBootstrapBrokersResult`"
  (^com.amazonaws.services.kafka.model.GetBootstrapBrokersResult [^AbstractAWSKafka this ^com.amazonaws.services.kafka.model.GetBootstrapBrokersRequest request]
    (-> this (.getBootstrapBrokers request))))

(defn describe-configuration-revision
  "Description copied from interface: AWSKafka

  request - `com.amazonaws.services.kafka.model.DescribeConfigurationRevisionRequest`

  returns: Result of the DescribeConfigurationRevision operation returned by the service. - `com.amazonaws.services.kafka.model.DescribeConfigurationRevisionResult`"
  (^com.amazonaws.services.kafka.model.DescribeConfigurationRevisionResult [^AbstractAWSKafka this ^com.amazonaws.services.kafka.model.DescribeConfigurationRevisionRequest request]
    (-> this (.describeConfigurationRevision request))))

(defn list-cluster-operations
  "Description copied from interface: AWSKafka

  request - `com.amazonaws.services.kafka.model.ListClusterOperationsRequest`

  returns: Result of the ListClusterOperations operation returned by the service. - `com.amazonaws.services.kafka.model.ListClusterOperationsResult`"
  (^com.amazonaws.services.kafka.model.ListClusterOperationsResult [^AbstractAWSKafka this ^com.amazonaws.services.kafka.model.ListClusterOperationsRequest request]
    (-> this (.listClusterOperations request))))

(defn untag-resource
  "Description copied from interface: AWSKafka

  request - `com.amazonaws.services.kafka.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.kafka.model.UntagResourceResult`"
  (^com.amazonaws.services.kafka.model.UntagResourceResult [^AbstractAWSKafka this ^com.amazonaws.services.kafka.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn list-configurations
  "Description copied from interface: AWSKafka

  request - `com.amazonaws.services.kafka.model.ListConfigurationsRequest`

  returns: Result of the ListConfigurations operation returned by the service. - `com.amazonaws.services.kafka.model.ListConfigurationsResult`"
  (^com.amazonaws.services.kafka.model.ListConfigurationsResult [^AbstractAWSKafka this ^com.amazonaws.services.kafka.model.ListConfigurationsRequest request]
    (-> this (.listConfigurations request))))

(defn describe-configuration
  "Description copied from interface: AWSKafka

  request - `com.amazonaws.services.kafka.model.DescribeConfigurationRequest`

  returns: Result of the DescribeConfiguration operation returned by the service. - `com.amazonaws.services.kafka.model.DescribeConfigurationResult`"
  (^com.amazonaws.services.kafka.model.DescribeConfigurationResult [^AbstractAWSKafka this ^com.amazonaws.services.kafka.model.DescribeConfigurationRequest request]
    (-> this (.describeConfiguration request))))

(defn list-nodes
  "Description copied from interface: AWSKafka

  request - `com.amazonaws.services.kafka.model.ListNodesRequest`

  returns: Result of the ListNodes operation returned by the service. - `com.amazonaws.services.kafka.model.ListNodesResult`"
  (^com.amazonaws.services.kafka.model.ListNodesResult [^AbstractAWSKafka this ^com.amazonaws.services.kafka.model.ListNodesRequest request]
    (-> this (.listNodes request))))

(defn shutdown
  "Description copied from interface: AWSKafka"
  ([^AbstractAWSKafka this]
    (-> this (.shutdown))))

(defn update-broker-storage
  "Description copied from interface: AWSKafka

  request - `com.amazonaws.services.kafka.model.UpdateBrokerStorageRequest`

  returns: Result of the UpdateBrokerStorage operation returned by the service. - `com.amazonaws.services.kafka.model.UpdateBrokerStorageResult`"
  (^com.amazonaws.services.kafka.model.UpdateBrokerStorageResult [^AbstractAWSKafka this ^com.amazonaws.services.kafka.model.UpdateBrokerStorageRequest request]
    (-> this (.updateBrokerStorage request))))

(defn create-cluster
  "Description copied from interface: AWSKafka

  request - `com.amazonaws.services.kafka.model.CreateClusterRequest`

  returns: Result of the CreateCluster operation returned by the service. - `com.amazonaws.services.kafka.model.CreateClusterResult`"
  (^com.amazonaws.services.kafka.model.CreateClusterResult [^AbstractAWSKafka this ^com.amazonaws.services.kafka.model.CreateClusterRequest request]
    (-> this (.createCluster request))))

(defn delete-cluster
  "Description copied from interface: AWSKafka

  request - `com.amazonaws.services.kafka.model.DeleteClusterRequest`

  returns: Result of the DeleteCluster operation returned by the service. - `com.amazonaws.services.kafka.model.DeleteClusterResult`"
  (^com.amazonaws.services.kafka.model.DeleteClusterResult [^AbstractAWSKafka this ^com.amazonaws.services.kafka.model.DeleteClusterRequest request]
    (-> this (.deleteCluster request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSKafka

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSKafka this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn list-configuration-revisions
  "Description copied from interface: AWSKafka

  request - `com.amazonaws.services.kafka.model.ListConfigurationRevisionsRequest`

  returns: Result of the ListConfigurationRevisions operation returned by the service. - `com.amazonaws.services.kafka.model.ListConfigurationRevisionsResult`"
  (^com.amazonaws.services.kafka.model.ListConfigurationRevisionsResult [^AbstractAWSKafka this ^com.amazonaws.services.kafka.model.ListConfigurationRevisionsRequest request]
    (-> this (.listConfigurationRevisions request))))

(defn tag-resource
  "Description copied from interface: AWSKafka

  request - `com.amazonaws.services.kafka.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.kafka.model.TagResourceResult`"
  (^com.amazonaws.services.kafka.model.TagResourceResult [^AbstractAWSKafka this ^com.amazonaws.services.kafka.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn describe-cluster-operation
  "Description copied from interface: AWSKafka

  request - `com.amazonaws.services.kafka.model.DescribeClusterOperationRequest`

  returns: Result of the DescribeClusterOperation operation returned by the service. - `com.amazonaws.services.kafka.model.DescribeClusterOperationResult`"
  (^com.amazonaws.services.kafka.model.DescribeClusterOperationResult [^AbstractAWSKafka this ^com.amazonaws.services.kafka.model.DescribeClusterOperationRequest request]
    (-> this (.describeClusterOperation request))))

(defn update-cluster-configuration
  "Description copied from interface: AWSKafka

  request - `com.amazonaws.services.kafka.model.UpdateClusterConfigurationRequest`

  returns: Result of the UpdateClusterConfiguration operation returned by the service. - `com.amazonaws.services.kafka.model.UpdateClusterConfigurationResult`"
  (^com.amazonaws.services.kafka.model.UpdateClusterConfigurationResult [^AbstractAWSKafka this ^com.amazonaws.services.kafka.model.UpdateClusterConfigurationRequest request]
    (-> this (.updateClusterConfiguration request))))

(defn create-configuration
  "Description copied from interface: AWSKafka

  request - `com.amazonaws.services.kafka.model.CreateConfigurationRequest`

  returns: Result of the CreateConfiguration operation returned by the service. - `com.amazonaws.services.kafka.model.CreateConfigurationResult`"
  (^com.amazonaws.services.kafka.model.CreateConfigurationResult [^AbstractAWSKafka this ^com.amazonaws.services.kafka.model.CreateConfigurationRequest request]
    (-> this (.createConfiguration request))))

(defn list-clusters
  "Description copied from interface: AWSKafka

  request - `com.amazonaws.services.kafka.model.ListClustersRequest`

  returns: Result of the ListClusters operation returned by the service. - `com.amazonaws.services.kafka.model.ListClustersResult`"
  (^com.amazonaws.services.kafka.model.ListClustersResult [^AbstractAWSKafka this ^com.amazonaws.services.kafka.model.ListClustersRequest request]
    (-> this (.listClusters request))))

