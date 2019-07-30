(ns com.amazonaws.services.ecs.AbstractAmazonECS
  "Abstract implementation of AmazonECS. Convenient method forms pass through to the corresponding overload that
  takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.ecs AbstractAmazonECS]))

(defn describe-services
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.DescribeServicesRequest`

  returns: Result of the DescribeServices operation returned by the service. - `com.amazonaws.services.ecs.model.DescribeServicesResult`"
  (^com.amazonaws.services.ecs.model.DescribeServicesResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.DescribeServicesRequest request]
    (-> this (.describeServices request))))

(defn submit-container-state-change
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.SubmitContainerStateChangeRequest`

  returns: Result of the SubmitContainerStateChange operation returned by the service. - `com.amazonaws.services.ecs.model.SubmitContainerStateChangeResult`"
  (^com.amazonaws.services.ecs.model.SubmitContainerStateChangeResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.SubmitContainerStateChangeRequest request]
    (-> this (.submitContainerStateChange request)))
  (^com.amazonaws.services.ecs.model.SubmitContainerStateChangeResult [^AbstractAmazonECS this]
    (-> this (.submitContainerStateChange))))

(defn list-tags-for-resource
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.ecs.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.ecs.model.ListTagsForResourceResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn set-region
  "Description copied from interface: AmazonECS

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonECS this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn create-service
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.CreateServiceRequest`

  returns: Result of the CreateService operation returned by the service. - `com.amazonaws.services.ecs.model.CreateServiceResult`"
  (^com.amazonaws.services.ecs.model.CreateServiceResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.CreateServiceRequest request]
    (-> this (.createService request))))

(defn list-services
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.ListServicesRequest`

  returns: Result of the ListServices operation returned by the service. - `com.amazonaws.services.ecs.model.ListServicesResult`"
  (^com.amazonaws.services.ecs.model.ListServicesResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.ListServicesRequest request]
    (-> this (.listServices request)))
  (^com.amazonaws.services.ecs.model.ListServicesResult [^AbstractAmazonECS this]
    (-> this (.listServices))))

(defn waiters
  "returns: `com.amazonaws.services.ecs.waiters.AmazonECSWaiters`"
  (^com.amazonaws.services.ecs.waiters.AmazonECSWaiters [^AbstractAmazonECS this]
    (-> this (.waiters))))

(defn delete-service
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.DeleteServiceRequest`

  returns: Result of the DeleteService operation returned by the service. - `com.amazonaws.services.ecs.model.DeleteServiceResult`"
  (^com.amazonaws.services.ecs.model.DeleteServiceResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.DeleteServiceRequest request]
    (-> this (.deleteService request))))

(defn update-container-agent
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.UpdateContainerAgentRequest`

  returns: Result of the UpdateContainerAgent operation returned by the service. - `com.amazonaws.services.ecs.model.UpdateContainerAgentResult`"
  (^com.amazonaws.services.ecs.model.UpdateContainerAgentResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.UpdateContainerAgentRequest request]
    (-> this (.updateContainerAgent request))))

(defn put-account-setting-default
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.PutAccountSettingDefaultRequest`

  returns: Result of the PutAccountSettingDefault operation returned by the service. - `com.amazonaws.services.ecs.model.PutAccountSettingDefaultResult`"
  (^com.amazonaws.services.ecs.model.PutAccountSettingDefaultResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.PutAccountSettingDefaultRequest request]
    (-> this (.putAccountSettingDefault request))))

(defn list-task-definition-families
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.ListTaskDefinitionFamiliesRequest`

  returns: Result of the ListTaskDefinitionFamilies operation returned by the service. - `com.amazonaws.services.ecs.model.ListTaskDefinitionFamiliesResult`"
  (^com.amazonaws.services.ecs.model.ListTaskDefinitionFamiliesResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.ListTaskDefinitionFamiliesRequest request]
    (-> this (.listTaskDefinitionFamilies request)))
  (^com.amazonaws.services.ecs.model.ListTaskDefinitionFamiliesResult [^AbstractAmazonECS this]
    (-> this (.listTaskDefinitionFamilies))))

(defn describe-tasks
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.DescribeTasksRequest`

  returns: Result of the DescribeTasks operation returned by the service. - `com.amazonaws.services.ecs.model.DescribeTasksResult`"
  (^com.amazonaws.services.ecs.model.DescribeTasksResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.DescribeTasksRequest request]
    (-> this (.describeTasks request))))

(defn untag-resource
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.ecs.model.UntagResourceResult`"
  (^com.amazonaws.services.ecs.model.UntagResourceResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn deregister-container-instance
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.DeregisterContainerInstanceRequest`

  returns: Result of the DeregisterContainerInstance operation returned by the service. - `com.amazonaws.services.ecs.model.DeregisterContainerInstanceResult`"
  (^com.amazonaws.services.ecs.model.DeregisterContainerInstanceResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.DeregisterContainerInstanceRequest request]
    (-> this (.deregisterContainerInstance request))))

(defn list-account-settings
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.ListAccountSettingsRequest`

  returns: Result of the ListAccountSettings operation returned by the service. - `com.amazonaws.services.ecs.model.ListAccountSettingsResult`"
  (^com.amazonaws.services.ecs.model.ListAccountSettingsResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.ListAccountSettingsRequest request]
    (-> this (.listAccountSettings request))))

(defn describe-container-instances
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.DescribeContainerInstancesRequest`

  returns: Result of the DescribeContainerInstances operation returned by the service. - `com.amazonaws.services.ecs.model.DescribeContainerInstancesResult`"
  (^com.amazonaws.services.ecs.model.DescribeContainerInstancesResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.DescribeContainerInstancesRequest request]
    (-> this (.describeContainerInstances request))))

(defn describe-task-definition
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.DescribeTaskDefinitionRequest`

  returns: Result of the DescribeTaskDefinition operation returned by the service. - `com.amazonaws.services.ecs.model.DescribeTaskDefinitionResult`"
  (^com.amazonaws.services.ecs.model.DescribeTaskDefinitionResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.DescribeTaskDefinitionRequest request]
    (-> this (.describeTaskDefinition request))))

(defn submit-attachment-state-changes
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.SubmitAttachmentStateChangesRequest`

  returns: Result of the SubmitAttachmentStateChanges operation returned by the service. - `com.amazonaws.services.ecs.model.SubmitAttachmentStateChangesResult`"
  (^com.amazonaws.services.ecs.model.SubmitAttachmentStateChangesResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.SubmitAttachmentStateChangesRequest request]
    (-> this (.submitAttachmentStateChanges request))))

(defn put-account-setting
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.PutAccountSettingRequest`

  returns: Result of the PutAccountSetting operation returned by the service. - `com.amazonaws.services.ecs.model.PutAccountSettingResult`"
  (^com.amazonaws.services.ecs.model.PutAccountSettingResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.PutAccountSettingRequest request]
    (-> this (.putAccountSetting request))))

(defn run-task
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.RunTaskRequest`

  returns: Result of the RunTask operation returned by the service. - `com.amazonaws.services.ecs.model.RunTaskResult`"
  (^com.amazonaws.services.ecs.model.RunTaskResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.RunTaskRequest request]
    (-> this (.runTask request))))

(defn describe-task-sets
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.DescribeTaskSetsRequest`

  returns: Result of the DescribeTaskSets operation returned by the service. - `com.amazonaws.services.ecs.model.DescribeTaskSetsResult`"
  (^com.amazonaws.services.ecs.model.DescribeTaskSetsResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.DescribeTaskSetsRequest request]
    (-> this (.describeTaskSets request))))

(defn put-attributes
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.PutAttributesRequest`

  returns: Result of the PutAttributes operation returned by the service. - `com.amazonaws.services.ecs.model.PutAttributesResult`"
  (^com.amazonaws.services.ecs.model.PutAttributesResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.PutAttributesRequest request]
    (-> this (.putAttributes request))))

(defn stop-task
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.StopTaskRequest`

  returns: Result of the StopTask operation returned by the service. - `com.amazonaws.services.ecs.model.StopTaskResult`"
  (^com.amazonaws.services.ecs.model.StopTaskResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.StopTaskRequest request]
    (-> this (.stopTask request))))

(defn create-task-set
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.CreateTaskSetRequest`

  returns: Result of the CreateTaskSet operation returned by the service. - `com.amazonaws.services.ecs.model.CreateTaskSetResult`"
  (^com.amazonaws.services.ecs.model.CreateTaskSetResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.CreateTaskSetRequest request]
    (-> this (.createTaskSet request))))

(defn shutdown
  "Description copied from interface: AmazonECS"
  ([^AbstractAmazonECS this]
    (-> this (.shutdown))))

(defn list-task-definitions
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.ListTaskDefinitionsRequest`

  returns: Result of the ListTaskDefinitions operation returned by the service. - `com.amazonaws.services.ecs.model.ListTaskDefinitionsResult`"
  (^com.amazonaws.services.ecs.model.ListTaskDefinitionsResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.ListTaskDefinitionsRequest request]
    (-> this (.listTaskDefinitions request)))
  (^com.amazonaws.services.ecs.model.ListTaskDefinitionsResult [^AbstractAmazonECS this]
    (-> this (.listTaskDefinitions))))

(defn set-endpoint
  "Description copied from interface: AmazonECS

  endpoint - The endpoint (ex: \"ecs.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://ecs.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonECS this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn discover-poll-endpoint
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.DiscoverPollEndpointRequest`

  returns: Result of the DiscoverPollEndpoint operation returned by the service. - `com.amazonaws.services.ecs.model.DiscoverPollEndpointResult`"
  (^com.amazonaws.services.ecs.model.DiscoverPollEndpointResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.DiscoverPollEndpointRequest request]
    (-> this (.discoverPollEndpoint request)))
  (^com.amazonaws.services.ecs.model.DiscoverPollEndpointResult [^AbstractAmazonECS this]
    (-> this (.discoverPollEndpoint))))

(defn register-task-definition
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.RegisterTaskDefinitionRequest`

  returns: Result of the RegisterTaskDefinition operation returned by the service. - `com.amazonaws.services.ecs.model.RegisterTaskDefinitionResult`"
  (^com.amazonaws.services.ecs.model.RegisterTaskDefinitionResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.RegisterTaskDefinitionRequest request]
    (-> this (.registerTaskDefinition request))))

(defn list-container-instances
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.ListContainerInstancesRequest`

  returns: Result of the ListContainerInstances operation returned by the service. - `com.amazonaws.services.ecs.model.ListContainerInstancesResult`"
  (^com.amazonaws.services.ecs.model.ListContainerInstancesResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.ListContainerInstancesRequest request]
    (-> this (.listContainerInstances request)))
  (^com.amazonaws.services.ecs.model.ListContainerInstancesResult [^AbstractAmazonECS this]
    (-> this (.listContainerInstances))))

(defn create-cluster
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.CreateClusterRequest`

  returns: Result of the CreateCluster operation returned by the service. - `com.amazonaws.services.ecs.model.CreateClusterResult`"
  (^com.amazonaws.services.ecs.model.CreateClusterResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.CreateClusterRequest request]
    (-> this (.createCluster request)))
  (^com.amazonaws.services.ecs.model.CreateClusterResult [^AbstractAmazonECS this]
    (-> this (.createCluster))))

(defn update-task-set
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.UpdateTaskSetRequest`

  returns: Result of the UpdateTaskSet operation returned by the service. - `com.amazonaws.services.ecs.model.UpdateTaskSetResult`"
  (^com.amazonaws.services.ecs.model.UpdateTaskSetResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.UpdateTaskSetRequest request]
    (-> this (.updateTaskSet request))))

(defn update-service
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.UpdateServiceRequest`

  returns: Result of the UpdateService operation returned by the service. - `com.amazonaws.services.ecs.model.UpdateServiceResult`"
  (^com.amazonaws.services.ecs.model.UpdateServiceResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.UpdateServiceRequest request]
    (-> this (.updateService request))))

(defn delete-account-setting
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.DeleteAccountSettingRequest`

  returns: Result of the DeleteAccountSetting operation returned by the service. - `com.amazonaws.services.ecs.model.DeleteAccountSettingResult`"
  (^com.amazonaws.services.ecs.model.DeleteAccountSettingResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.DeleteAccountSettingRequest request]
    (-> this (.deleteAccountSetting request))))

(defn delete-task-set
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.DeleteTaskSetRequest`

  returns: Result of the DeleteTaskSet operation returned by the service. - `com.amazonaws.services.ecs.model.DeleteTaskSetResult`"
  (^com.amazonaws.services.ecs.model.DeleteTaskSetResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.DeleteTaskSetRequest request]
    (-> this (.deleteTaskSet request))))

(defn delete-cluster
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.DeleteClusterRequest`

  returns: Result of the DeleteCluster operation returned by the service. - `com.amazonaws.services.ecs.model.DeleteClusterResult`"
  (^com.amazonaws.services.ecs.model.DeleteClusterResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.DeleteClusterRequest request]
    (-> this (.deleteCluster request))))

(defn start-task
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.StartTaskRequest`

  returns: Result of the StartTask operation returned by the service. - `com.amazonaws.services.ecs.model.StartTaskResult`"
  (^com.amazonaws.services.ecs.model.StartTaskResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.StartTaskRequest request]
    (-> this (.startTask request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonECS

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonECS this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn list-tasks
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.ListTasksRequest`

  returns: Result of the ListTasks operation returned by the service. - `com.amazonaws.services.ecs.model.ListTasksResult`"
  (^com.amazonaws.services.ecs.model.ListTasksResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.ListTasksRequest request]
    (-> this (.listTasks request)))
  (^com.amazonaws.services.ecs.model.ListTasksResult [^AbstractAmazonECS this]
    (-> this (.listTasks))))

(defn deregister-task-definition
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.DeregisterTaskDefinitionRequest`

  returns: Result of the DeregisterTaskDefinition operation returned by the service. - `com.amazonaws.services.ecs.model.DeregisterTaskDefinitionResult`"
  (^com.amazonaws.services.ecs.model.DeregisterTaskDefinitionResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.DeregisterTaskDefinitionRequest request]
    (-> this (.deregisterTaskDefinition request))))

(defn update-service-primary-task-set
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.UpdateServicePrimaryTaskSetRequest`

  returns: Result of the UpdateServicePrimaryTaskSet operation returned by the service. - `com.amazonaws.services.ecs.model.UpdateServicePrimaryTaskSetResult`"
  (^com.amazonaws.services.ecs.model.UpdateServicePrimaryTaskSetResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.UpdateServicePrimaryTaskSetRequest request]
    (-> this (.updateServicePrimaryTaskSet request))))

(defn register-container-instance
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.RegisterContainerInstanceRequest`

  returns: Result of the RegisterContainerInstance operation returned by the service. - `com.amazonaws.services.ecs.model.RegisterContainerInstanceResult`"
  (^com.amazonaws.services.ecs.model.RegisterContainerInstanceResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.RegisterContainerInstanceRequest request]
    (-> this (.registerContainerInstance request))))

(defn tag-resource
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.ecs.model.TagResourceResult`"
  (^com.amazonaws.services.ecs.model.TagResourceResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn delete-attributes
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.DeleteAttributesRequest`

  returns: Result of the DeleteAttributes operation returned by the service. - `com.amazonaws.services.ecs.model.DeleteAttributesResult`"
  (^com.amazonaws.services.ecs.model.DeleteAttributesResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.DeleteAttributesRequest request]
    (-> this (.deleteAttributes request))))

(defn update-container-instances-state
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.UpdateContainerInstancesStateRequest`

  returns: Result of the UpdateContainerInstancesState operation returned by the service. - `com.amazonaws.services.ecs.model.UpdateContainerInstancesStateResult`"
  (^com.amazonaws.services.ecs.model.UpdateContainerInstancesStateResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.UpdateContainerInstancesStateRequest request]
    (-> this (.updateContainerInstancesState request))))

(defn list-attributes
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.ListAttributesRequest`

  returns: Result of the ListAttributes operation returned by the service. - `com.amazonaws.services.ecs.model.ListAttributesResult`"
  (^com.amazonaws.services.ecs.model.ListAttributesResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.ListAttributesRequest request]
    (-> this (.listAttributes request))))

(defn describe-clusters
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.DescribeClustersRequest`

  returns: Result of the DescribeClusters operation returned by the service. - `com.amazonaws.services.ecs.model.DescribeClustersResult`"
  (^com.amazonaws.services.ecs.model.DescribeClustersResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.DescribeClustersRequest request]
    (-> this (.describeClusters request)))
  (^com.amazonaws.services.ecs.model.DescribeClustersResult [^AbstractAmazonECS this]
    (-> this (.describeClusters))))

(defn submit-task-state-change
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.SubmitTaskStateChangeRequest`

  returns: Result of the SubmitTaskStateChange operation returned by the service. - `com.amazonaws.services.ecs.model.SubmitTaskStateChangeResult`"
  (^com.amazonaws.services.ecs.model.SubmitTaskStateChangeResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.SubmitTaskStateChangeRequest request]
    (-> this (.submitTaskStateChange request))))

(defn list-clusters
  "Description copied from interface: AmazonECS

  request - `com.amazonaws.services.ecs.model.ListClustersRequest`

  returns: Result of the ListClusters operation returned by the service. - `com.amazonaws.services.ecs.model.ListClustersResult`"
  (^com.amazonaws.services.ecs.model.ListClustersResult [^AbstractAmazonECS this ^com.amazonaws.services.ecs.model.ListClustersRequest request]
    (-> this (.listClusters request)))
  (^com.amazonaws.services.ecs.model.ListClustersResult [^AbstractAmazonECS this]
    (-> this (.listClusters))))

