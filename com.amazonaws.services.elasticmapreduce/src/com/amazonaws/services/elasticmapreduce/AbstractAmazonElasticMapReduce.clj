(ns com.amazonaws.services.elasticmapreduce.AbstractAmazonElasticMapReduce
  "Abstract implementation of AmazonElasticMapReduce. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.elasticmapreduce AbstractAmazonElasticMapReduce]))

(defn run-job-flow
  "Description copied from interface: AmazonElasticMapReduce

  request - Input to the RunJobFlow operation. - `com.amazonaws.services.elasticmapreduce.model.RunJobFlowRequest`

  returns: Result of the RunJobFlow operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.RunJobFlowResult`"
  (^com.amazonaws.services.elasticmapreduce.model.RunJobFlowResult [^AbstractAmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.RunJobFlowRequest request]
    (-> this (.runJobFlow request))))

(defn remove-auto-scaling-policy
  "Description copied from interface: AmazonElasticMapReduce

  request - `com.amazonaws.services.elasticmapreduce.model.RemoveAutoScalingPolicyRequest`

  returns: Result of the RemoveAutoScalingPolicy operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.RemoveAutoScalingPolicyResult`"
  (^com.amazonaws.services.elasticmapreduce.model.RemoveAutoScalingPolicyResult [^AbstractAmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.RemoveAutoScalingPolicyRequest request]
    (-> this (.removeAutoScalingPolicy request))))

(defn add-tags
  "Description copied from interface: AmazonElasticMapReduce

  request - This input identifies a cluster and a list of tags to attach. - `com.amazonaws.services.elasticmapreduce.model.AddTagsRequest`

  returns: Result of the AddTags operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.AddTagsResult`"
  (^com.amazonaws.services.elasticmapreduce.model.AddTagsResult [^AbstractAmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.AddTagsRequest request]
    (-> this (.addTags request))))

(defn describe-cluster
  "Description copied from interface: AmazonElasticMapReduce

  request - This input determines which cluster to describe. - `com.amazonaws.services.elasticmapreduce.model.DescribeClusterRequest`

  returns: Result of the DescribeCluster operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.DescribeClusterResult`"
  (^com.amazonaws.services.elasticmapreduce.model.DescribeClusterResult [^AbstractAmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.DescribeClusterRequest request]
    (-> this (.describeCluster request))))

(defn set-region
  "Description copied from interface: AmazonElasticMapReduce

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonElasticMapReduce this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn waiters
  "returns: `com.amazonaws.services.elasticmapreduce.waiters.AmazonElasticMapReduceWaiters`"
  (^com.amazonaws.services.elasticmapreduce.waiters.AmazonElasticMapReduceWaiters [^AbstractAmazonElasticMapReduce this]
    (-> this (.waiters))))

(defn add-instance-fleet
  "Description copied from interface: AmazonElasticMapReduce

  request - `com.amazonaws.services.elasticmapreduce.model.AddInstanceFleetRequest`

  returns: Result of the AddInstanceFleet operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.AddInstanceFleetResult`"
  (^com.amazonaws.services.elasticmapreduce.model.AddInstanceFleetResult [^AbstractAmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.AddInstanceFleetRequest request]
    (-> this (.addInstanceFleet request))))

(defn delete-security-configuration
  "Description copied from interface: AmazonElasticMapReduce

  request - `com.amazonaws.services.elasticmapreduce.model.DeleteSecurityConfigurationRequest`

  returns: Result of the DeleteSecurityConfiguration operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.DeleteSecurityConfigurationResult`"
  (^com.amazonaws.services.elasticmapreduce.model.DeleteSecurityConfigurationResult [^AbstractAmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.DeleteSecurityConfigurationRequest request]
    (-> this (.deleteSecurityConfiguration request))))

(defn set-termination-protection
  "Description copied from interface: AmazonElasticMapReduce

  request - The input argument to the TerminationProtection operation. - `com.amazonaws.services.elasticmapreduce.model.SetTerminationProtectionRequest`

  returns: Result of the SetTerminationProtection operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.SetTerminationProtectionResult`"
  (^com.amazonaws.services.elasticmapreduce.model.SetTerminationProtectionResult [^AbstractAmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.SetTerminationProtectionRequest request]
    (-> this (.setTerminationProtection request))))

(defn list-instance-groups
  "Description copied from interface: AmazonElasticMapReduce

  request - This input determines which instance groups to retrieve. - `com.amazonaws.services.elasticmapreduce.model.ListInstanceGroupsRequest`

  returns: Result of the ListInstanceGroups operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.ListInstanceGroupsResult`"
  (^com.amazonaws.services.elasticmapreduce.model.ListInstanceGroupsResult [^AbstractAmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.ListInstanceGroupsRequest request]
    (-> this (.listInstanceGroups request))))

(defn remove-tags
  "Description copied from interface: AmazonElasticMapReduce

  request - This input identifies a cluster and a list of tags to remove. - `com.amazonaws.services.elasticmapreduce.model.RemoveTagsRequest`

  returns: Result of the RemoveTags operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.RemoveTagsResult`"
  (^com.amazonaws.services.elasticmapreduce.model.RemoveTagsResult [^AbstractAmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.RemoveTagsRequest request]
    (-> this (.removeTags request))))

(defn set-visible-to-all-users
  "Description copied from interface: AmazonElasticMapReduce

  request - The input to the SetVisibleToAllUsers action. - `com.amazonaws.services.elasticmapreduce.model.SetVisibleToAllUsersRequest`

  returns: Result of the SetVisibleToAllUsers operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.SetVisibleToAllUsersResult`"
  (^com.amazonaws.services.elasticmapreduce.model.SetVisibleToAllUsersResult [^AbstractAmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.SetVisibleToAllUsersRequest request]
    (-> this (.setVisibleToAllUsers request))))

(defn modify-instance-fleet
  "Description copied from interface: AmazonElasticMapReduce

  request - `com.amazonaws.services.elasticmapreduce.model.ModifyInstanceFleetRequest`

  returns: Result of the ModifyInstanceFleet operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.ModifyInstanceFleetResult`"
  (^com.amazonaws.services.elasticmapreduce.model.ModifyInstanceFleetResult [^AbstractAmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.ModifyInstanceFleetRequest request]
    (-> this (.modifyInstanceFleet request))))

(defn list-instances
  "Description copied from interface: AmazonElasticMapReduce

  request - This input determines which instances to list. - `com.amazonaws.services.elasticmapreduce.model.ListInstancesRequest`

  returns: Result of the ListInstances operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.ListInstancesResult`"
  (^com.amazonaws.services.elasticmapreduce.model.ListInstancesResult [^AbstractAmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.ListInstancesRequest request]
    (-> this (.listInstances request))))

(defn describe-security-configuration
  "Description copied from interface: AmazonElasticMapReduce

  request - `com.amazonaws.services.elasticmapreduce.model.DescribeSecurityConfigurationRequest`

  returns: Result of the DescribeSecurityConfiguration operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.DescribeSecurityConfigurationResult`"
  (^com.amazonaws.services.elasticmapreduce.model.DescribeSecurityConfigurationResult [^AbstractAmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.DescribeSecurityConfigurationRequest request]
    (-> this (.describeSecurityConfiguration request))))

(defn describe-job-flows
  "Deprecated.

  request - The input for the DescribeJobFlows operation. - `com.amazonaws.services.elasticmapreduce.model.DescribeJobFlowsRequest`

  returns: Result of the DescribeJobFlows operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.DescribeJobFlowsResult`"
  (^com.amazonaws.services.elasticmapreduce.model.DescribeJobFlowsResult [^AbstractAmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.DescribeJobFlowsRequest request]
    (-> this (.describeJobFlows request)))
  (^com.amazonaws.services.elasticmapreduce.model.DescribeJobFlowsResult [^AbstractAmazonElasticMapReduce this]
    (-> this (.describeJobFlows))))

(defn create-security-configuration
  "Description copied from interface: AmazonElasticMapReduce

  request - `com.amazonaws.services.elasticmapreduce.model.CreateSecurityConfigurationRequest`

  returns: Result of the CreateSecurityConfiguration operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.CreateSecurityConfigurationResult`"
  (^com.amazonaws.services.elasticmapreduce.model.CreateSecurityConfigurationResult [^AbstractAmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.CreateSecurityConfigurationRequest request]
    (-> this (.createSecurityConfiguration request))))

(defn shutdown
  "Description copied from interface: AmazonElasticMapReduce"
  ([^AbstractAmazonElasticMapReduce this]
    (-> this (.shutdown))))

(defn add-instance-groups
  "Description copied from interface: AmazonElasticMapReduce

  request - Input to an AddInstanceGroups call. - `com.amazonaws.services.elasticmapreduce.model.AddInstanceGroupsRequest`

  returns: Result of the AddInstanceGroups operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.AddInstanceGroupsResult`"
  (^com.amazonaws.services.elasticmapreduce.model.AddInstanceGroupsResult [^AbstractAmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.AddInstanceGroupsRequest request]
    (-> this (.addInstanceGroups request))))

(defn set-endpoint
  "Description copied from interface: AmazonElasticMapReduce

  endpoint - The endpoint (ex: \"elasticmapreduce.amazonaws.com\") or a full URL, including the protocol (ex: \"https://elasticmapreduce.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonElasticMapReduce this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn list-instance-fleets
  "Description copied from interface: AmazonElasticMapReduce

  request - `com.amazonaws.services.elasticmapreduce.model.ListInstanceFleetsRequest`

  returns: Result of the ListInstanceFleets operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.ListInstanceFleetsResult`"
  (^com.amazonaws.services.elasticmapreduce.model.ListInstanceFleetsResult [^AbstractAmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.ListInstanceFleetsRequest request]
    (-> this (.listInstanceFleets request))))

(defn add-job-flow-steps
  "Description copied from interface: AmazonElasticMapReduce

  request - The input argument to the AddJobFlowSteps operation. - `com.amazonaws.services.elasticmapreduce.model.AddJobFlowStepsRequest`

  returns: Result of the AddJobFlowSteps operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.AddJobFlowStepsResult`"
  (^com.amazonaws.services.elasticmapreduce.model.AddJobFlowStepsResult [^AbstractAmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.AddJobFlowStepsRequest request]
    (-> this (.addJobFlowSteps request))))

(defn list-security-configurations
  "Description copied from interface: AmazonElasticMapReduce

  request - `com.amazonaws.services.elasticmapreduce.model.ListSecurityConfigurationsRequest`

  returns: Result of the ListSecurityConfigurations operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.ListSecurityConfigurationsResult`"
  (^com.amazonaws.services.elasticmapreduce.model.ListSecurityConfigurationsResult [^AbstractAmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.ListSecurityConfigurationsRequest request]
    (-> this (.listSecurityConfigurations request))))

(defn list-bootstrap-actions
  "Description copied from interface: AmazonElasticMapReduce

  request - This input determines which bootstrap actions to retrieve. - `com.amazonaws.services.elasticmapreduce.model.ListBootstrapActionsRequest`

  returns: Result of the ListBootstrapActions operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.ListBootstrapActionsResult`"
  (^com.amazonaws.services.elasticmapreduce.model.ListBootstrapActionsResult [^AbstractAmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.ListBootstrapActionsRequest request]
    (-> this (.listBootstrapActions request))))

(defn list-steps
  "Description copied from interface: AmazonElasticMapReduce

  request - This input determines which steps to list. - `com.amazonaws.services.elasticmapreduce.model.ListStepsRequest`

  returns: Result of the ListSteps operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.ListStepsResult`"
  (^com.amazonaws.services.elasticmapreduce.model.ListStepsResult [^AbstractAmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.ListStepsRequest request]
    (-> this (.listSteps request))))

(defn terminate-job-flows
  "Description copied from interface: AmazonElasticMapReduce

  request - Input to the TerminateJobFlows operation. - `com.amazonaws.services.elasticmapreduce.model.TerminateJobFlowsRequest`

  returns: Result of the TerminateJobFlows operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.TerminateJobFlowsResult`"
  (^com.amazonaws.services.elasticmapreduce.model.TerminateJobFlowsResult [^AbstractAmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.TerminateJobFlowsRequest request]
    (-> this (.terminateJobFlows request))))

(defn modify-instance-groups
  "Description copied from interface: AmazonElasticMapReduce

  request - Change the size of some instance groups. - `com.amazonaws.services.elasticmapreduce.model.ModifyInstanceGroupsRequest`

  returns: Result of the ModifyInstanceGroups operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.ModifyInstanceGroupsResult`"
  (^com.amazonaws.services.elasticmapreduce.model.ModifyInstanceGroupsResult [^AbstractAmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.ModifyInstanceGroupsRequest request]
    (-> this (.modifyInstanceGroups request)))
  (^com.amazonaws.services.elasticmapreduce.model.ModifyInstanceGroupsResult [^AbstractAmazonElasticMapReduce this]
    (-> this (.modifyInstanceGroups))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonElasticMapReduce

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonElasticMapReduce this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn put-auto-scaling-policy
  "Description copied from interface: AmazonElasticMapReduce

  request - `com.amazonaws.services.elasticmapreduce.model.PutAutoScalingPolicyRequest`

  returns: Result of the PutAutoScalingPolicy operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.PutAutoScalingPolicyResult`"
  (^com.amazonaws.services.elasticmapreduce.model.PutAutoScalingPolicyResult [^AbstractAmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.PutAutoScalingPolicyRequest request]
    (-> this (.putAutoScalingPolicy request))))

(defn cancel-steps
  "Description copied from interface: AmazonElasticMapReduce

  request - The input argument to the CancelSteps operation. - `com.amazonaws.services.elasticmapreduce.model.CancelStepsRequest`

  returns: Result of the CancelSteps operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.CancelStepsResult`"
  (^com.amazonaws.services.elasticmapreduce.model.CancelStepsResult [^AbstractAmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.CancelStepsRequest request]
    (-> this (.cancelSteps request))))

(defn list-clusters
  "Description copied from interface: AmazonElasticMapReduce

  request - This input determines how the ListClusters action filters the list of clusters that it returns. - `com.amazonaws.services.elasticmapreduce.model.ListClustersRequest`

  returns: Result of the ListClusters operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.ListClustersResult`"
  (^com.amazonaws.services.elasticmapreduce.model.ListClustersResult [^AbstractAmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.ListClustersRequest request]
    (-> this (.listClusters request)))
  (^com.amazonaws.services.elasticmapreduce.model.ListClustersResult [^AbstractAmazonElasticMapReduce this]
    (-> this (.listClusters))))

(defn describe-step
  "Description copied from interface: AmazonElasticMapReduce

  request - This input determines which step to describe. - `com.amazonaws.services.elasticmapreduce.model.DescribeStepRequest`

  returns: Result of the DescribeStep operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.DescribeStepResult`"
  (^com.amazonaws.services.elasticmapreduce.model.DescribeStepResult [^AbstractAmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.DescribeStepRequest request]
    (-> this (.describeStep request))))

