(ns com.amazonaws.services.kafka.AWSKafkaClient
  "Client for accessing Kafka. All service calls made using this client are blocking, and will not return until the
  service call completes.



  The operations for managing an Amazon MSK cluster."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kafka AWSKafkaClient]))

(defn *builder
  "returns: `com.amazonaws.services.kafka.AWSKafkaClientBuilder`"
  (^com.amazonaws.services.kafka.AWSKafkaClientBuilder []
    (AWSKafkaClient/builder )))

(defn list-tags-for-resource
  "Returns a list of the tags associated with the specified resource.

  request - `com.amazonaws.services.kafka.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.kafka.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.kafka.model.NotFoundException - The resource could not be found due to incorrect input. Correct the input, then retry the request."
  (^com.amazonaws.services.kafka.model.ListTagsForResourceResult [^AWSKafkaClient this ^com.amazonaws.services.kafka.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn describe-cluster
  "Returns a description of the MSK cluster whose Amazon Resource Name (ARN) is specified in the request.

  request - `com.amazonaws.services.kafka.model.DescribeClusterRequest`

  returns: Result of the DescribeCluster operation returned by the service. - `com.amazonaws.services.kafka.model.DescribeClusterResult`

  throws: com.amazonaws.services.kafka.model.NotFoundException - The resource could not be found due to incorrect input. Correct the input, then retry the request."
  (^com.amazonaws.services.kafka.model.DescribeClusterResult [^AWSKafkaClient this ^com.amazonaws.services.kafka.model.DescribeClusterRequest request]
    (-> this (.describeCluster request))))

(defn get-bootstrap-brokers
  "A list of brokers that a client application can use to bootstrap.

  request - `com.amazonaws.services.kafka.model.GetBootstrapBrokersRequest`

  returns: Result of the GetBootstrapBrokers operation returned by the service. - `com.amazonaws.services.kafka.model.GetBootstrapBrokersResult`

  throws: com.amazonaws.services.kafka.model.BadRequestException - The request isn't valid because the input is incorrect. Correct your input and then submit it again."
  (^com.amazonaws.services.kafka.model.GetBootstrapBrokersResult [^AWSKafkaClient this ^com.amazonaws.services.kafka.model.GetBootstrapBrokersRequest request]
    (-> this (.getBootstrapBrokers request))))

(defn describe-configuration-revision
  "Returns a description of this revision of the configuration.

  request - `com.amazonaws.services.kafka.model.DescribeConfigurationRevisionRequest`

  returns: Result of the DescribeConfigurationRevision operation returned by the service. - `com.amazonaws.services.kafka.model.DescribeConfigurationRevisionResult`

  throws: com.amazonaws.services.kafka.model.BadRequestException - The request isn't valid because the input is incorrect. Correct your input and then submit it again."
  (^com.amazonaws.services.kafka.model.DescribeConfigurationRevisionResult [^AWSKafkaClient this ^com.amazonaws.services.kafka.model.DescribeConfigurationRevisionRequest request]
    (-> this (.describeConfigurationRevision request))))

(defn list-cluster-operations
  "Returns a list of all the operations that have been performed on the specified MSK cluster.

  request - `com.amazonaws.services.kafka.model.ListClusterOperationsRequest`

  returns: Result of the ListClusterOperations operation returned by the service. - `com.amazonaws.services.kafka.model.ListClusterOperationsResult`

  throws: com.amazonaws.services.kafka.model.BadRequestException - The request isn't valid because the input is incorrect. Correct your input and then submit it again."
  (^com.amazonaws.services.kafka.model.ListClusterOperationsResult [^AWSKafkaClient this ^com.amazonaws.services.kafka.model.ListClusterOperationsRequest request]
    (-> this (.listClusterOperations request))))

(defn untag-resource
  "Removes the tags associated with the keys that are provided in the query.

  request - `com.amazonaws.services.kafka.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.kafka.model.UntagResourceResult`

  throws: com.amazonaws.services.kafka.model.NotFoundException - The resource could not be found due to incorrect input. Correct the input, then retry the request."
  (^com.amazonaws.services.kafka.model.UntagResourceResult [^AWSKafkaClient this ^com.amazonaws.services.kafka.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn list-configurations
  "Returns a list of all the MSK configurations in this Region.

  request - `com.amazonaws.services.kafka.model.ListConfigurationsRequest`

  returns: Result of the ListConfigurations operation returned by the service. - `com.amazonaws.services.kafka.model.ListConfigurationsResult`

  throws: com.amazonaws.services.kafka.model.ServiceUnavailableException - 503 response"
  (^com.amazonaws.services.kafka.model.ListConfigurationsResult [^AWSKafkaClient this ^com.amazonaws.services.kafka.model.ListConfigurationsRequest request]
    (-> this (.listConfigurations request))))

(defn describe-configuration
  "Returns a description of this MSK configuration.

  request - `com.amazonaws.services.kafka.model.DescribeConfigurationRequest`

  returns: Result of the DescribeConfiguration operation returned by the service. - `com.amazonaws.services.kafka.model.DescribeConfigurationResult`

  throws: com.amazonaws.services.kafka.model.BadRequestException - The request isn't valid because the input is incorrect. Correct your input and then submit it again."
  (^com.amazonaws.services.kafka.model.DescribeConfigurationResult [^AWSKafkaClient this ^com.amazonaws.services.kafka.model.DescribeConfigurationRequest request]
    (-> this (.describeConfiguration request))))

(defn list-nodes
  "Returns a list of the broker nodes in the cluster.

  request - `com.amazonaws.services.kafka.model.ListNodesRequest`

  returns: Result of the ListNodes operation returned by the service. - `com.amazonaws.services.kafka.model.ListNodesResult`

  throws: com.amazonaws.services.kafka.model.NotFoundException - The resource could not be found due to incorrect input. Correct the input, then retry the request."
  (^com.amazonaws.services.kafka.model.ListNodesResult [^AWSKafkaClient this ^com.amazonaws.services.kafka.model.ListNodesRequest request]
    (-> this (.listNodes request))))

(defn update-broker-storage
  "Updates the EBS storage associated with MSK brokers.

  request - `com.amazonaws.services.kafka.model.UpdateBrokerStorageRequest`

  returns: Result of the UpdateBrokerStorage operation returned by the service. - `com.amazonaws.services.kafka.model.UpdateBrokerStorageResult`

  throws: com.amazonaws.services.kafka.model.ServiceUnavailableException - 503 response"
  (^com.amazonaws.services.kafka.model.UpdateBrokerStorageResult [^AWSKafkaClient this ^com.amazonaws.services.kafka.model.UpdateBrokerStorageRequest request]
    (-> this (.updateBrokerStorage request))))

(defn create-cluster
  "Creates a new MSK cluster.

  request - `com.amazonaws.services.kafka.model.CreateClusterRequest`

  returns: Result of the CreateCluster operation returned by the service. - `com.amazonaws.services.kafka.model.CreateClusterResult`

  throws: com.amazonaws.services.kafka.model.BadRequestException - The request isn't valid because the input is incorrect. Correct your input and then submit it again."
  (^com.amazonaws.services.kafka.model.CreateClusterResult [^AWSKafkaClient this ^com.amazonaws.services.kafka.model.CreateClusterRequest request]
    (-> this (.createCluster request))))

(defn delete-cluster
  "Deletes the MSK cluster specified by the Amazon Resource Name (ARN) in the request.

  request - `com.amazonaws.services.kafka.model.DeleteClusterRequest`

  returns: Result of the DeleteCluster operation returned by the service. - `com.amazonaws.services.kafka.model.DeleteClusterResult`

  throws: com.amazonaws.services.kafka.model.NotFoundException - The resource could not be found due to incorrect input. Correct the input, then retry the request."
  (^com.amazonaws.services.kafka.model.DeleteClusterResult [^AWSKafkaClient this ^com.amazonaws.services.kafka.model.DeleteClusterRequest request]
    (-> this (.deleteCluster request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSKafkaClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn list-configuration-revisions
  "Returns a list of all the MSK configurations in this Region.

  request - `com.amazonaws.services.kafka.model.ListConfigurationRevisionsRequest`

  returns: Result of the ListConfigurationRevisions operation returned by the service. - `com.amazonaws.services.kafka.model.ListConfigurationRevisionsResult`

  throws: com.amazonaws.services.kafka.model.BadRequestException - The request isn't valid because the input is incorrect. Correct your input and then submit it again."
  (^com.amazonaws.services.kafka.model.ListConfigurationRevisionsResult [^AWSKafkaClient this ^com.amazonaws.services.kafka.model.ListConfigurationRevisionsRequest request]
    (-> this (.listConfigurationRevisions request))))

(defn tag-resource
  "Adds tags to the specified MSK resource.

  request - `com.amazonaws.services.kafka.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.kafka.model.TagResourceResult`

  throws: com.amazonaws.services.kafka.model.NotFoundException - The resource could not be found due to incorrect input. Correct the input, then retry the request."
  (^com.amazonaws.services.kafka.model.TagResourceResult [^AWSKafkaClient this ^com.amazonaws.services.kafka.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn describe-cluster-operation
  "Returns a description of the cluster operation specified by the ARN.

  request - `com.amazonaws.services.kafka.model.DescribeClusterOperationRequest`

  returns: Result of the DescribeClusterOperation operation returned by the service. - `com.amazonaws.services.kafka.model.DescribeClusterOperationResult`

  throws: com.amazonaws.services.kafka.model.NotFoundException - The resource could not be found due to incorrect input. Correct the input, then retry the request."
  (^com.amazonaws.services.kafka.model.DescribeClusterOperationResult [^AWSKafkaClient this ^com.amazonaws.services.kafka.model.DescribeClusterOperationRequest request]
    (-> this (.describeClusterOperation request))))

(defn update-cluster-configuration
  "Updates the cluster with the configuration that is specified in the request body.

  request - `com.amazonaws.services.kafka.model.UpdateClusterConfigurationRequest`

  returns: Result of the UpdateClusterConfiguration operation returned by the service. - `com.amazonaws.services.kafka.model.UpdateClusterConfigurationResult`

  throws: com.amazonaws.services.kafka.model.BadRequestException - The request isn't valid because the input is incorrect. Correct your input and then submit it again."
  (^com.amazonaws.services.kafka.model.UpdateClusterConfigurationResult [^AWSKafkaClient this ^com.amazonaws.services.kafka.model.UpdateClusterConfigurationRequest request]
    (-> this (.updateClusterConfiguration request))))

(defn create-configuration
  "Creates a new MSK configuration.

  request - `com.amazonaws.services.kafka.model.CreateConfigurationRequest`

  returns: Result of the CreateConfiguration operation returned by the service. - `com.amazonaws.services.kafka.model.CreateConfigurationResult`

  throws: com.amazonaws.services.kafka.model.BadRequestException - The request isn't valid because the input is incorrect. Correct your input and then submit it again."
  (^com.amazonaws.services.kafka.model.CreateConfigurationResult [^AWSKafkaClient this ^com.amazonaws.services.kafka.model.CreateConfigurationRequest request]
    (-> this (.createConfiguration request))))

(defn list-clusters
  "Returns a list of all the MSK clusters in the current Region.

  request - `com.amazonaws.services.kafka.model.ListClustersRequest`

  returns: Result of the ListClusters operation returned by the service. - `com.amazonaws.services.kafka.model.ListClustersResult`

  throws: com.amazonaws.services.kafka.model.BadRequestException - The request isn't valid because the input is incorrect. Correct your input and then submit it again."
  (^com.amazonaws.services.kafka.model.ListClustersResult [^AWSKafkaClient this ^com.amazonaws.services.kafka.model.ListClustersRequest request]
    (-> this (.listClusters request))))

