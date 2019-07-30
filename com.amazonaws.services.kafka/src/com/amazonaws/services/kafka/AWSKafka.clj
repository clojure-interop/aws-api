(ns com.amazonaws.services.kafka.AWSKafka
  "Interface for accessing Kafka.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSKafka instead.




  The operations for managing an Amazon MSK cluster."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kafka AWSKafka]))

(defn list-tags-for-resource
  "Returns a list of the tags associated with the specified resource.

  list-tags-for-resource-request - `com.amazonaws.services.kafka.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.kafka.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.kafka.model.NotFoundException - The resource could not be found due to incorrect input. Correct the input, then retry the request."
  (^com.amazonaws.services.kafka.model.ListTagsForResourceResult [^AWSKafka this ^com.amazonaws.services.kafka.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn describe-cluster
  "Returns a description of the MSK cluster whose Amazon Resource Name (ARN) is specified in the request.

  describe-cluster-request - `com.amazonaws.services.kafka.model.DescribeClusterRequest`

  returns: Result of the DescribeCluster operation returned by the service. - `com.amazonaws.services.kafka.model.DescribeClusterResult`

  throws: com.amazonaws.services.kafka.model.NotFoundException - The resource could not be found due to incorrect input. Correct the input, then retry the request."
  (^com.amazonaws.services.kafka.model.DescribeClusterResult [^AWSKafka this ^com.amazonaws.services.kafka.model.DescribeClusterRequest describe-cluster-request]
    (-> this (.describeCluster describe-cluster-request))))

(defn get-bootstrap-brokers
  "A list of brokers that a client application can use to bootstrap.

  get-bootstrap-brokers-request - `com.amazonaws.services.kafka.model.GetBootstrapBrokersRequest`

  returns: Result of the GetBootstrapBrokers operation returned by the service. - `com.amazonaws.services.kafka.model.GetBootstrapBrokersResult`

  throws: com.amazonaws.services.kafka.model.BadRequestException - The request isn't valid because the input is incorrect. Correct your input and then submit it again."
  (^com.amazonaws.services.kafka.model.GetBootstrapBrokersResult [^AWSKafka this ^com.amazonaws.services.kafka.model.GetBootstrapBrokersRequest get-bootstrap-brokers-request]
    (-> this (.getBootstrapBrokers get-bootstrap-brokers-request))))

(defn describe-configuration-revision
  "Returns a description of this revision of the configuration.

  describe-configuration-revision-request - `com.amazonaws.services.kafka.model.DescribeConfigurationRevisionRequest`

  returns: Result of the DescribeConfigurationRevision operation returned by the service. - `com.amazonaws.services.kafka.model.DescribeConfigurationRevisionResult`

  throws: com.amazonaws.services.kafka.model.BadRequestException - The request isn't valid because the input is incorrect. Correct your input and then submit it again."
  (^com.amazonaws.services.kafka.model.DescribeConfigurationRevisionResult [^AWSKafka this ^com.amazonaws.services.kafka.model.DescribeConfigurationRevisionRequest describe-configuration-revision-request]
    (-> this (.describeConfigurationRevision describe-configuration-revision-request))))

(defn list-cluster-operations
  "Returns a list of all the operations that have been performed on the specified MSK cluster.

  list-cluster-operations-request - `com.amazonaws.services.kafka.model.ListClusterOperationsRequest`

  returns: Result of the ListClusterOperations operation returned by the service. - `com.amazonaws.services.kafka.model.ListClusterOperationsResult`

  throws: com.amazonaws.services.kafka.model.BadRequestException - The request isn't valid because the input is incorrect. Correct your input and then submit it again."
  (^com.amazonaws.services.kafka.model.ListClusterOperationsResult [^AWSKafka this ^com.amazonaws.services.kafka.model.ListClusterOperationsRequest list-cluster-operations-request]
    (-> this (.listClusterOperations list-cluster-operations-request))))

(defn untag-resource
  "Removes the tags associated with the keys that are provided in the query.

  untag-resource-request - `com.amazonaws.services.kafka.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.kafka.model.UntagResourceResult`

  throws: com.amazonaws.services.kafka.model.NotFoundException - The resource could not be found due to incorrect input. Correct the input, then retry the request."
  (^com.amazonaws.services.kafka.model.UntagResourceResult [^AWSKafka this ^com.amazonaws.services.kafka.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn list-configurations
  "Returns a list of all the MSK configurations in this Region.

  list-configurations-request - `com.amazonaws.services.kafka.model.ListConfigurationsRequest`

  returns: Result of the ListConfigurations operation returned by the service. - `com.amazonaws.services.kafka.model.ListConfigurationsResult`

  throws: com.amazonaws.services.kafka.model.ServiceUnavailableException - 503 response"
  (^com.amazonaws.services.kafka.model.ListConfigurationsResult [^AWSKafka this ^com.amazonaws.services.kafka.model.ListConfigurationsRequest list-configurations-request]
    (-> this (.listConfigurations list-configurations-request))))

(defn describe-configuration
  "Returns a description of this MSK configuration.

  describe-configuration-request - `com.amazonaws.services.kafka.model.DescribeConfigurationRequest`

  returns: Result of the DescribeConfiguration operation returned by the service. - `com.amazonaws.services.kafka.model.DescribeConfigurationResult`

  throws: com.amazonaws.services.kafka.model.BadRequestException - The request isn't valid because the input is incorrect. Correct your input and then submit it again."
  (^com.amazonaws.services.kafka.model.DescribeConfigurationResult [^AWSKafka this ^com.amazonaws.services.kafka.model.DescribeConfigurationRequest describe-configuration-request]
    (-> this (.describeConfiguration describe-configuration-request))))

(defn list-nodes
  "Returns a list of the broker nodes in the cluster.

  list-nodes-request - `com.amazonaws.services.kafka.model.ListNodesRequest`

  returns: Result of the ListNodes operation returned by the service. - `com.amazonaws.services.kafka.model.ListNodesResult`

  throws: com.amazonaws.services.kafka.model.NotFoundException - The resource could not be found due to incorrect input. Correct the input, then retry the request."
  (^com.amazonaws.services.kafka.model.ListNodesResult [^AWSKafka this ^com.amazonaws.services.kafka.model.ListNodesRequest list-nodes-request]
    (-> this (.listNodes list-nodes-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSKafka this]
    (-> this (.shutdown))))

(defn update-broker-storage
  "Updates the EBS storage associated with MSK brokers.

  update-broker-storage-request - `com.amazonaws.services.kafka.model.UpdateBrokerStorageRequest`

  returns: Result of the UpdateBrokerStorage operation returned by the service. - `com.amazonaws.services.kafka.model.UpdateBrokerStorageResult`

  throws: com.amazonaws.services.kafka.model.ServiceUnavailableException - 503 response"
  (^com.amazonaws.services.kafka.model.UpdateBrokerStorageResult [^AWSKafka this ^com.amazonaws.services.kafka.model.UpdateBrokerStorageRequest update-broker-storage-request]
    (-> this (.updateBrokerStorage update-broker-storage-request))))

(defn create-cluster
  "Creates a new MSK cluster.

  create-cluster-request - `com.amazonaws.services.kafka.model.CreateClusterRequest`

  returns: Result of the CreateCluster operation returned by the service. - `com.amazonaws.services.kafka.model.CreateClusterResult`

  throws: com.amazonaws.services.kafka.model.BadRequestException - The request isn't valid because the input is incorrect. Correct your input and then submit it again."
  (^com.amazonaws.services.kafka.model.CreateClusterResult [^AWSKafka this ^com.amazonaws.services.kafka.model.CreateClusterRequest create-cluster-request]
    (-> this (.createCluster create-cluster-request))))

(defn delete-cluster
  "Deletes the MSK cluster specified by the Amazon Resource Name (ARN) in the request.

  delete-cluster-request - `com.amazonaws.services.kafka.model.DeleteClusterRequest`

  returns: Result of the DeleteCluster operation returned by the service. - `com.amazonaws.services.kafka.model.DeleteClusterResult`

  throws: com.amazonaws.services.kafka.model.NotFoundException - The resource could not be found due to incorrect input. Correct the input, then retry the request."
  (^com.amazonaws.services.kafka.model.DeleteClusterResult [^AWSKafka this ^com.amazonaws.services.kafka.model.DeleteClusterRequest delete-cluster-request]
    (-> this (.deleteCluster delete-cluster-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSKafka this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn list-configuration-revisions
  "Returns a list of all the MSK configurations in this Region.

  list-configuration-revisions-request - `com.amazonaws.services.kafka.model.ListConfigurationRevisionsRequest`

  returns: Result of the ListConfigurationRevisions operation returned by the service. - `com.amazonaws.services.kafka.model.ListConfigurationRevisionsResult`

  throws: com.amazonaws.services.kafka.model.BadRequestException - The request isn't valid because the input is incorrect. Correct your input and then submit it again."
  (^com.amazonaws.services.kafka.model.ListConfigurationRevisionsResult [^AWSKafka this ^com.amazonaws.services.kafka.model.ListConfigurationRevisionsRequest list-configuration-revisions-request]
    (-> this (.listConfigurationRevisions list-configuration-revisions-request))))

(defn tag-resource
  "Adds tags to the specified MSK resource.

  tag-resource-request - `com.amazonaws.services.kafka.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.kafka.model.TagResourceResult`

  throws: com.amazonaws.services.kafka.model.NotFoundException - The resource could not be found due to incorrect input. Correct the input, then retry the request."
  (^com.amazonaws.services.kafka.model.TagResourceResult [^AWSKafka this ^com.amazonaws.services.kafka.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

(defn describe-cluster-operation
  "Returns a description of the cluster operation specified by the ARN.

  describe-cluster-operation-request - `com.amazonaws.services.kafka.model.DescribeClusterOperationRequest`

  returns: Result of the DescribeClusterOperation operation returned by the service. - `com.amazonaws.services.kafka.model.DescribeClusterOperationResult`

  throws: com.amazonaws.services.kafka.model.NotFoundException - The resource could not be found due to incorrect input. Correct the input, then retry the request."
  (^com.amazonaws.services.kafka.model.DescribeClusterOperationResult [^AWSKafka this ^com.amazonaws.services.kafka.model.DescribeClusterOperationRequest describe-cluster-operation-request]
    (-> this (.describeClusterOperation describe-cluster-operation-request))))

(defn update-cluster-configuration
  "Updates the cluster with the configuration that is specified in the request body.

  update-cluster-configuration-request - `com.amazonaws.services.kafka.model.UpdateClusterConfigurationRequest`

  returns: Result of the UpdateClusterConfiguration operation returned by the service. - `com.amazonaws.services.kafka.model.UpdateClusterConfigurationResult`

  throws: com.amazonaws.services.kafka.model.BadRequestException - The request isn't valid because the input is incorrect. Correct your input and then submit it again."
  (^com.amazonaws.services.kafka.model.UpdateClusterConfigurationResult [^AWSKafka this ^com.amazonaws.services.kafka.model.UpdateClusterConfigurationRequest update-cluster-configuration-request]
    (-> this (.updateClusterConfiguration update-cluster-configuration-request))))

(defn create-configuration
  "Creates a new MSK configuration.

  create-configuration-request - `com.amazonaws.services.kafka.model.CreateConfigurationRequest`

  returns: Result of the CreateConfiguration operation returned by the service. - `com.amazonaws.services.kafka.model.CreateConfigurationResult`

  throws: com.amazonaws.services.kafka.model.BadRequestException - The request isn't valid because the input is incorrect. Correct your input and then submit it again."
  (^com.amazonaws.services.kafka.model.CreateConfigurationResult [^AWSKafka this ^com.amazonaws.services.kafka.model.CreateConfigurationRequest create-configuration-request]
    (-> this (.createConfiguration create-configuration-request))))

(defn list-clusters
  "Returns a list of all the MSK clusters in the current Region.

  list-clusters-request - `com.amazonaws.services.kafka.model.ListClustersRequest`

  returns: Result of the ListClusters operation returned by the service. - `com.amazonaws.services.kafka.model.ListClustersResult`

  throws: com.amazonaws.services.kafka.model.BadRequestException - The request isn't valid because the input is incorrect. Correct your input and then submit it again."
  (^com.amazonaws.services.kafka.model.ListClustersResult [^AWSKafka this ^com.amazonaws.services.kafka.model.ListClustersRequest list-clusters-request]
    (-> this (.listClusters list-clusters-request))))

