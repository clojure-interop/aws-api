(ns com.amazonaws.services.elasticmapreduce.AbstractAmazonElasticMapReduceAsync
  "Abstract implementation of AmazonElasticMapReduceAsync. Convenient method forms pass through to the
  corresponding overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.elasticmapreduce AbstractAmazonElasticMapReduceAsync]))

(defn put-auto-scaling-policy-async
  "Description copied from interface: AmazonElasticMapReduceAsync

  request - `com.amazonaws.services.elasticmapreduce.model.PutAutoScalingPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutAutoScalingPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.PutAutoScalingPolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.PutAutoScalingPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putAutoScalingPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.PutAutoScalingPolicyRequest request]
    (-> this (.putAutoScalingPolicyAsync request))))

(defn list-instance-groups-async
  "Description copied from interface: AmazonElasticMapReduceAsync

  request - This input determines which instance groups to retrieve. - `com.amazonaws.services.elasticmapreduce.model.ListInstanceGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListInstanceGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.ListInstanceGroupsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.ListInstanceGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listInstanceGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.ListInstanceGroupsRequest request]
    (-> this (.listInstanceGroupsAsync request))))

(defn create-security-configuration-async
  "Description copied from interface: AmazonElasticMapReduceAsync

  request - `com.amazonaws.services.elasticmapreduce.model.CreateSecurityConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSecurityConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.CreateSecurityConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.CreateSecurityConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSecurityConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.CreateSecurityConfigurationRequest request]
    (-> this (.createSecurityConfigurationAsync request))))

(defn cancel-steps-async
  "Description copied from interface: AmazonElasticMapReduceAsync

  request - The input argument to the CancelSteps operation. - `com.amazonaws.services.elasticmapreduce.model.CancelStepsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelSteps operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.CancelStepsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.CancelStepsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelStepsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.CancelStepsRequest request]
    (-> this (.cancelStepsAsync request))))

(defn add-instance-groups-async
  "Description copied from interface: AmazonElasticMapReduceAsync

  request - Input to an AddInstanceGroups call. - `com.amazonaws.services.elasticmapreduce.model.AddInstanceGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddInstanceGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.AddInstanceGroupsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.AddInstanceGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addInstanceGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.AddInstanceGroupsRequest request]
    (-> this (.addInstanceGroupsAsync request))))

(defn modify-instance-groups-async
  "Description copied from interface: AmazonElasticMapReduceAsync

  request - Change the size of some instance groups. - `com.amazonaws.services.elasticmapreduce.model.ModifyInstanceGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyInstanceGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.ModifyInstanceGroupsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.ModifyInstanceGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyInstanceGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.ModifyInstanceGroupsRequest request]
    (-> this (.modifyInstanceGroupsAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this]
    (-> this (.modifyInstanceGroupsAsync))))

(defn list-instance-fleets-async
  "Description copied from interface: AmazonElasticMapReduceAsync

  request - `com.amazonaws.services.elasticmapreduce.model.ListInstanceFleetsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListInstanceFleets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.ListInstanceFleetsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.ListInstanceFleetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listInstanceFleetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.ListInstanceFleetsRequest request]
    (-> this (.listInstanceFleetsAsync request))))

(defn set-visible-to-all-users-async
  "Description copied from interface: AmazonElasticMapReduceAsync

  request - The input to the SetVisibleToAllUsers action. - `com.amazonaws.services.elasticmapreduce.model.SetVisibleToAllUsersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetVisibleToAllUsers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.SetVisibleToAllUsersResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.SetVisibleToAllUsersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setVisibleToAllUsersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.SetVisibleToAllUsersRequest request]
    (-> this (.setVisibleToAllUsersAsync request))))

(defn delete-security-configuration-async
  "Description copied from interface: AmazonElasticMapReduceAsync

  request - `com.amazonaws.services.elasticmapreduce.model.DeleteSecurityConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSecurityConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.DeleteSecurityConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.DeleteSecurityConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSecurityConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.DeleteSecurityConfigurationRequest request]
    (-> this (.deleteSecurityConfigurationAsync request))))

(defn run-job-flow-async
  "Description copied from interface: AmazonElasticMapReduceAsync

  request - Input to the RunJobFlow operation. - `com.amazonaws.services.elasticmapreduce.model.RunJobFlowRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RunJobFlow operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.RunJobFlowResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.RunJobFlowRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.runJobFlowAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.RunJobFlowRequest request]
    (-> this (.runJobFlowAsync request))))

(defn list-security-configurations-async
  "Description copied from interface: AmazonElasticMapReduceAsync

  request - `com.amazonaws.services.elasticmapreduce.model.ListSecurityConfigurationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSecurityConfigurations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.ListSecurityConfigurationsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.ListSecurityConfigurationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSecurityConfigurationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.ListSecurityConfigurationsRequest request]
    (-> this (.listSecurityConfigurationsAsync request))))

(defn describe-step-async
  "Description copied from interface: AmazonElasticMapReduceAsync

  request - This input determines which step to describe. - `com.amazonaws.services.elasticmapreduce.model.DescribeStepRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStep operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.DescribeStepResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.DescribeStepRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStepAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.DescribeStepRequest request]
    (-> this (.describeStepAsync request))))

(defn modify-instance-fleet-async
  "Description copied from interface: AmazonElasticMapReduceAsync

  request - `com.amazonaws.services.elasticmapreduce.model.ModifyInstanceFleetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyInstanceFleet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.ModifyInstanceFleetResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.ModifyInstanceFleetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyInstanceFleetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.ModifyInstanceFleetRequest request]
    (-> this (.modifyInstanceFleetAsync request))))

(defn describe-security-configuration-async
  "Description copied from interface: AmazonElasticMapReduceAsync

  request - `com.amazonaws.services.elasticmapreduce.model.DescribeSecurityConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSecurityConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.DescribeSecurityConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.DescribeSecurityConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSecurityConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.DescribeSecurityConfigurationRequest request]
    (-> this (.describeSecurityConfigurationAsync request))))

(defn remove-auto-scaling-policy-async
  "Description copied from interface: AmazonElasticMapReduceAsync

  request - `com.amazonaws.services.elasticmapreduce.model.RemoveAutoScalingPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveAutoScalingPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.RemoveAutoScalingPolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.RemoveAutoScalingPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeAutoScalingPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.RemoveAutoScalingPolicyRequest request]
    (-> this (.removeAutoScalingPolicyAsync request))))

(defn list-bootstrap-actions-async
  "Description copied from interface: AmazonElasticMapReduceAsync

  request - This input determines which bootstrap actions to retrieve. - `com.amazonaws.services.elasticmapreduce.model.ListBootstrapActionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBootstrapActions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.ListBootstrapActionsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.ListBootstrapActionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBootstrapActionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.ListBootstrapActionsRequest request]
    (-> this (.listBootstrapActionsAsync request))))

(defn list-instances-async
  "Description copied from interface: AmazonElasticMapReduceAsync

  request - This input determines which instances to list. - `com.amazonaws.services.elasticmapreduce.model.ListInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.ListInstancesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.ListInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.ListInstancesRequest request]
    (-> this (.listInstancesAsync request))))

(defn list-clusters-async
  "Description copied from interface: AmazonElasticMapReduceAsync

  request - This input determines how the ListClusters action filters the list of clusters that it returns. - `com.amazonaws.services.elasticmapreduce.model.ListClustersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListClusters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.ListClustersResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.ListClustersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listClustersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.ListClustersRequest request]
    (-> this (.listClustersAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this]
    (-> this (.listClustersAsync))))

(defn set-termination-protection-async
  "Description copied from interface: AmazonElasticMapReduceAsync

  request - The input argument to the TerminationProtection operation. - `com.amazonaws.services.elasticmapreduce.model.SetTerminationProtectionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetTerminationProtection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.SetTerminationProtectionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.SetTerminationProtectionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setTerminationProtectionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.SetTerminationProtectionRequest request]
    (-> this (.setTerminationProtectionAsync request))))

(defn remove-tags-async
  "Description copied from interface: AmazonElasticMapReduceAsync

  request - This input identifies a cluster and a list of tags to remove. - `com.amazonaws.services.elasticmapreduce.model.RemoveTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.RemoveTagsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.RemoveTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.RemoveTagsRequest request]
    (-> this (.removeTagsAsync request))))

(defn terminate-job-flows-async
  "Description copied from interface: AmazonElasticMapReduceAsync

  request - Input to the TerminateJobFlows operation. - `com.amazonaws.services.elasticmapreduce.model.TerminateJobFlowsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TerminateJobFlows operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.TerminateJobFlowsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.TerminateJobFlowsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.terminateJobFlowsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.TerminateJobFlowsRequest request]
    (-> this (.terminateJobFlowsAsync request))))

(defn add-job-flow-steps-async
  "Description copied from interface: AmazonElasticMapReduceAsync

  request - The input argument to the AddJobFlowSteps operation. - `com.amazonaws.services.elasticmapreduce.model.AddJobFlowStepsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddJobFlowSteps operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.AddJobFlowStepsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.AddJobFlowStepsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addJobFlowStepsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.AddJobFlowStepsRequest request]
    (-> this (.addJobFlowStepsAsync request))))

(defn describe-cluster-async
  "Description copied from interface: AmazonElasticMapReduceAsync

  request - This input determines which cluster to describe. - `com.amazonaws.services.elasticmapreduce.model.DescribeClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.DescribeClusterResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.DescribeClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.DescribeClusterRequest request]
    (-> this (.describeClusterAsync request))))

(defn describe-job-flows-async
  "Deprecated.

  request - The input for the DescribeJobFlows operation. - `com.amazonaws.services.elasticmapreduce.model.DescribeJobFlowsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeJobFlows operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.DescribeJobFlowsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.DescribeJobFlowsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeJobFlowsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.DescribeJobFlowsRequest request]
    (-> this (.describeJobFlowsAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this]
    (-> this (.describeJobFlowsAsync))))

(defn list-steps-async
  "Description copied from interface: AmazonElasticMapReduceAsync

  request - This input determines which steps to list. - `com.amazonaws.services.elasticmapreduce.model.ListStepsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSteps operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.ListStepsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.ListStepsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listStepsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.ListStepsRequest request]
    (-> this (.listStepsAsync request))))

(defn add-instance-fleet-async
  "Description copied from interface: AmazonElasticMapReduceAsync

  request - `com.amazonaws.services.elasticmapreduce.model.AddInstanceFleetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddInstanceFleet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.AddInstanceFleetResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.AddInstanceFleetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addInstanceFleetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.AddInstanceFleetRequest request]
    (-> this (.addInstanceFleetAsync request))))

(defn add-tags-async
  "Description copied from interface: AmazonElasticMapReduceAsync

  request - This input identifies a cluster and a list of tags to attach. - `com.amazonaws.services.elasticmapreduce.model.AddTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.AddTagsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.AddTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.AddTagsRequest request]
    (-> this (.addTagsAsync request))))

