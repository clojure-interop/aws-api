(ns com.amazonaws.services.ecs.AmazonECSAsyncClient
  "Client for accessing Amazon ECS asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Amazon Elastic Container Service

  Amazon Elastic Container Service (Amazon ECS) is a highly scalable, fast, container management service that makes it
  easy to run, stop, and manage Docker containers on a cluster. You can host your cluster on a serverless
  infrastructure that is managed by Amazon ECS by launching your services or tasks using the Fargate launch type. For
  more control, you can host your tasks on a cluster of Amazon Elastic Compute Cloud (Amazon EC2) instances that you
  manage by using the EC2 launch type. For more information about launch types, see Amazon ECS Launch Types.


  Amazon ECS lets you launch and stop container-based applications with simple API calls, allows you to get the state
  of your cluster from a centralized service, and gives you access to many familiar Amazon EC2 features.


  You can use Amazon ECS to schedule the placement of containers across your cluster based on your resource needs,
  isolation policies, and availability requirements. Amazon ECS eliminates the need for you to operate your own cluster
  management and configuration management systems or worry about scaling your management infrastructure."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.ecs AmazonECSAsyncClient]))

(defn ->amazon-ecs-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AmazonECSAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonECSAsyncClient aws-credentials client-configuration executor-service))
  (^AmazonECSAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonECSAsyncClient aws-credentials executor-service))
  (^AmazonECSAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonECSAsyncClient client-configuration))
  (^AmazonECSAsyncClient []
    (new AmazonECSAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.ecs.AmazonECSAsyncClientBuilder`"
  (^com.amazonaws.services.ecs.AmazonECSAsyncClientBuilder []
    (AmazonECSAsyncClient/asyncBuilder )))

(defn untag-resource-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn put-account-setting-default-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.PutAccountSettingDefaultRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutAccountSettingDefault operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.PutAccountSettingDefaultResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.PutAccountSettingDefaultRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putAccountSettingDefaultAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.PutAccountSettingDefaultRequest request]
    (-> this (.putAccountSettingDefaultAsync request))))

(defn delete-task-set-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.DeleteTaskSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTaskSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.DeleteTaskSetResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.DeleteTaskSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTaskSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.DeleteTaskSetRequest request]
    (-> this (.deleteTaskSetAsync request))))

(defn list-task-definitions-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.ListTaskDefinitionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTaskDefinitions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.ListTaskDefinitionsResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.ListTaskDefinitionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTaskDefinitionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.ListTaskDefinitionsRequest request]
    (-> this (.listTaskDefinitionsAsync request)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this]
    (-> this (.listTaskDefinitionsAsync))))

(defn delete-service-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.DeleteServiceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteService operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.DeleteServiceResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.DeleteServiceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteServiceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.DeleteServiceRequest request]
    (-> this (.deleteServiceAsync request))))

(defn submit-attachment-state-changes-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.SubmitAttachmentStateChangesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SubmitAttachmentStateChanges operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.SubmitAttachmentStateChangesResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.SubmitAttachmentStateChangesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.submitAttachmentStateChangesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.SubmitAttachmentStateChangesRequest request]
    (-> this (.submitAttachmentStateChangesAsync request))))

(defn create-cluster-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.CreateClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.CreateClusterResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.CreateClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.CreateClusterRequest request]
    (-> this (.createClusterAsync request)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this]
    (-> this (.createClusterAsync))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonECSAsyncClient this]
    (-> this (.getExecutorService))))

(defn run-task-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.RunTaskRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RunTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.RunTaskResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.RunTaskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.runTaskAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.RunTaskRequest request]
    (-> this (.runTaskAsync request))))

(defn describe-services-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.DescribeServicesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeServices operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.DescribeServicesResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.DescribeServicesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeServicesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.DescribeServicesRequest request]
    (-> this (.describeServicesAsync request))))

(defn register-task-definition-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.RegisterTaskDefinitionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterTaskDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.RegisterTaskDefinitionResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.RegisterTaskDefinitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerTaskDefinitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.RegisterTaskDefinitionRequest request]
    (-> this (.registerTaskDefinitionAsync request))))

(defn describe-task-sets-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.DescribeTaskSetsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTaskSets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.DescribeTaskSetsResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.DescribeTaskSetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTaskSetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.DescribeTaskSetsRequest request]
    (-> this (.describeTaskSetsAsync request))))

(defn update-container-agent-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.UpdateContainerAgentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateContainerAgent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.UpdateContainerAgentResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.UpdateContainerAgentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateContainerAgentAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.UpdateContainerAgentRequest request]
    (-> this (.updateContainerAgentAsync request))))

(defn update-service-primary-task-set-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.UpdateServicePrimaryTaskSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateServicePrimaryTaskSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.UpdateServicePrimaryTaskSetResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.UpdateServicePrimaryTaskSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateServicePrimaryTaskSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.UpdateServicePrimaryTaskSetRequest request]
    (-> this (.updateServicePrimaryTaskSetAsync request))))

(defn list-tasks-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.ListTasksRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTasks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.ListTasksResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.ListTasksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTasksAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.ListTasksRequest request]
    (-> this (.listTasksAsync request)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this]
    (-> this (.listTasksAsync))))

(defn list-attributes-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.ListAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.ListAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.ListAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.ListAttributesRequest request]
    (-> this (.listAttributesAsync request))))

(defn discover-poll-endpoint-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.DiscoverPollEndpointRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DiscoverPollEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.DiscoverPollEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.DiscoverPollEndpointRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.discoverPollEndpointAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.DiscoverPollEndpointRequest request]
    (-> this (.discoverPollEndpointAsync request)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this]
    (-> this (.discoverPollEndpointAsync))))

(defn create-service-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.CreateServiceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateService operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.CreateServiceResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.CreateServiceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createServiceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.CreateServiceRequest request]
    (-> this (.createServiceAsync request))))

(defn delete-cluster-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.DeleteClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.DeleteClusterResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.DeleteClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.DeleteClusterRequest request]
    (-> this (.deleteClusterAsync request))))

(defn describe-task-definition-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.DescribeTaskDefinitionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTaskDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.DescribeTaskDefinitionResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.DescribeTaskDefinitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTaskDefinitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.DescribeTaskDefinitionRequest request]
    (-> this (.describeTaskDefinitionAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonECSAsyncClient this]
    (-> this (.shutdown))))

(defn describe-clusters-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.DescribeClustersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeClusters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.DescribeClustersResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.DescribeClustersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClustersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.DescribeClustersRequest request]
    (-> this (.describeClustersAsync request)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this]
    (-> this (.describeClustersAsync))))

(defn submit-task-state-change-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.SubmitTaskStateChangeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SubmitTaskStateChange operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.SubmitTaskStateChangeResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.SubmitTaskStateChangeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.submitTaskStateChangeAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.SubmitTaskStateChangeRequest request]
    (-> this (.submitTaskStateChangeAsync request))))

(defn list-services-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.ListServicesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListServices operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.ListServicesResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.ListServicesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listServicesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.ListServicesRequest request]
    (-> this (.listServicesAsync request)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this]
    (-> this (.listServicesAsync))))

(defn describe-container-instances-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.DescribeContainerInstancesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeContainerInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.DescribeContainerInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.DescribeContainerInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeContainerInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.DescribeContainerInstancesRequest request]
    (-> this (.describeContainerInstancesAsync request))))

(defn update-container-instances-state-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.UpdateContainerInstancesStateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateContainerInstancesState operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.UpdateContainerInstancesStateResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.UpdateContainerInstancesStateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateContainerInstancesStateAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.UpdateContainerInstancesStateRequest request]
    (-> this (.updateContainerInstancesStateAsync request))))

(defn register-container-instance-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.RegisterContainerInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterContainerInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.RegisterContainerInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.RegisterContainerInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerContainerInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.RegisterContainerInstanceRequest request]
    (-> this (.registerContainerInstanceAsync request))))

(defn create-task-set-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.CreateTaskSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTaskSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.CreateTaskSetResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.CreateTaskSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTaskSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.CreateTaskSetRequest request]
    (-> this (.createTaskSetAsync request))))

(defn put-attributes-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.PutAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.PutAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.PutAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.PutAttributesRequest request]
    (-> this (.putAttributesAsync request))))

(defn list-clusters-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.ListClustersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListClusters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.ListClustersResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.ListClustersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listClustersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.ListClustersRequest request]
    (-> this (.listClustersAsync request)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this]
    (-> this (.listClustersAsync))))

(defn describe-tasks-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.DescribeTasksRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTasks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.DescribeTasksResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.DescribeTasksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTasksAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.DescribeTasksRequest request]
    (-> this (.describeTasksAsync request))))

(defn update-service-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.UpdateServiceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateService operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.UpdateServiceResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.UpdateServiceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateServiceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.UpdateServiceRequest request]
    (-> this (.updateServiceAsync request))))

(defn list-account-settings-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.ListAccountSettingsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAccountSettings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.ListAccountSettingsResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.ListAccountSettingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAccountSettingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.ListAccountSettingsRequest request]
    (-> this (.listAccountSettingsAsync request))))

(defn put-account-setting-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.PutAccountSettingRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutAccountSetting operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.PutAccountSettingResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.PutAccountSettingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putAccountSettingAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.PutAccountSettingRequest request]
    (-> this (.putAccountSettingAsync request))))

(defn deregister-container-instance-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.DeregisterContainerInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterContainerInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.DeregisterContainerInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.DeregisterContainerInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterContainerInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.DeregisterContainerInstanceRequest request]
    (-> this (.deregisterContainerInstanceAsync request))))

(defn deregister-task-definition-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.DeregisterTaskDefinitionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterTaskDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.DeregisterTaskDefinitionResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.DeregisterTaskDefinitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterTaskDefinitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.DeregisterTaskDefinitionRequest request]
    (-> this (.deregisterTaskDefinitionAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn submit-container-state-change-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.SubmitContainerStateChangeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SubmitContainerStateChange operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.SubmitContainerStateChangeResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.SubmitContainerStateChangeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.submitContainerStateChangeAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.SubmitContainerStateChangeRequest request]
    (-> this (.submitContainerStateChangeAsync request)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this]
    (-> this (.submitContainerStateChangeAsync))))

(defn start-task-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.StartTaskRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.StartTaskResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.StartTaskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startTaskAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.StartTaskRequest request]
    (-> this (.startTaskAsync request))))

(defn list-task-definition-families-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.ListTaskDefinitionFamiliesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTaskDefinitionFamilies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.ListTaskDefinitionFamiliesResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.ListTaskDefinitionFamiliesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTaskDefinitionFamiliesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.ListTaskDefinitionFamiliesRequest request]
    (-> this (.listTaskDefinitionFamiliesAsync request)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this]
    (-> this (.listTaskDefinitionFamiliesAsync))))

(defn delete-account-setting-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.DeleteAccountSettingRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAccountSetting operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.DeleteAccountSettingResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.DeleteAccountSettingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAccountSettingAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.DeleteAccountSettingRequest request]
    (-> this (.deleteAccountSettingAsync request))))

(defn update-task-set-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.UpdateTaskSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateTaskSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.UpdateTaskSetResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.UpdateTaskSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateTaskSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.UpdateTaskSetRequest request]
    (-> this (.updateTaskSetAsync request))))

(defn stop-task-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.StopTaskRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.StopTaskResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.StopTaskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopTaskAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.StopTaskRequest request]
    (-> this (.stopTaskAsync request))))

(defn list-container-instances-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.ListContainerInstancesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListContainerInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.ListContainerInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.ListContainerInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listContainerInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.ListContainerInstancesRequest request]
    (-> this (.listContainerInstancesAsync request)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this]
    (-> this (.listContainerInstancesAsync))))

(defn delete-attributes-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.DeleteAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.DeleteAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.DeleteAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.DeleteAttributesRequest request]
    (-> this (.deleteAttributesAsync request))))

(defn tag-resource-async
  "Description copied from interface: AmazonECSAsync

  request - `com.amazonaws.services.ecs.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ecs.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonECSAsyncClient this ^com.amazonaws.services.ecs.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

