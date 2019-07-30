(ns com.amazonaws.services.elasticmapreduce.AmazonElasticMapReduceAsync
  "Interface for accessing Amazon EMR asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonElasticMapReduceAsync instead.



  Amazon EMR is a web service that makes it easy to process large amounts of data efficiently. Amazon EMR uses Hadoop
  processing combined with several AWS products to do tasks such as web indexing, data mining, log file analysis,
  machine learning, scientific simulation, and data warehousing."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.elasticmapreduce AmazonElasticMapReduceAsync]))

(defn put-auto-scaling-policy-async
  "Creates or updates an automatic scaling policy for a core instance group or task instance group in an Amazon EMR
   cluster. The automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances
   in response to the value of a CloudWatch metric.

  put-auto-scaling-policy-request - `com.amazonaws.services.elasticmapreduce.model.PutAutoScalingPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutAutoScalingPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.PutAutoScalingPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.PutAutoScalingPolicyRequest put-auto-scaling-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putAutoScalingPolicyAsync put-auto-scaling-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.PutAutoScalingPolicyRequest put-auto-scaling-policy-request]
    (-> this (.putAutoScalingPolicyAsync put-auto-scaling-policy-request))))

(defn list-instance-groups-async
  "Provides all available details about the instance groups in a cluster.

  list-instance-groups-request - This input determines which instance groups to retrieve. - `com.amazonaws.services.elasticmapreduce.model.ListInstanceGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListInstanceGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.ListInstanceGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.ListInstanceGroupsRequest list-instance-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listInstanceGroupsAsync list-instance-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.ListInstanceGroupsRequest list-instance-groups-request]
    (-> this (.listInstanceGroupsAsync list-instance-groups-request))))

(defn create-security-configuration-async
  "Creates a security configuration, which is stored in the service and can be specified when a cluster is created.

  create-security-configuration-request - `com.amazonaws.services.elasticmapreduce.model.CreateSecurityConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSecurityConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.CreateSecurityConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.CreateSecurityConfigurationRequest create-security-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSecurityConfigurationAsync create-security-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.CreateSecurityConfigurationRequest create-security-configuration-request]
    (-> this (.createSecurityConfigurationAsync create-security-configuration-request))))

(defn cancel-steps-async
  "Cancels a pending step or steps in a running cluster. Available only in Amazon EMR versions 4.8.0 and later,
   excluding version 5.0.0. A maximum of 256 steps are allowed in each CancelSteps request. CancelSteps is
   idempotent but asynchronous; it does not guarantee a step will be canceled, even if the request is successfully
   submitted. You can only cancel steps that are in a PENDING state.

  cancel-steps-request - The input argument to the CancelSteps operation. - `com.amazonaws.services.elasticmapreduce.model.CancelStepsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelSteps operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.CancelStepsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.CancelStepsRequest cancel-steps-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelStepsAsync cancel-steps-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.CancelStepsRequest cancel-steps-request]
    (-> this (.cancelStepsAsync cancel-steps-request))))

(defn add-instance-groups-async
  "Adds one or more instance groups to a running cluster.

  add-instance-groups-request - Input to an AddInstanceGroups call. - `com.amazonaws.services.elasticmapreduce.model.AddInstanceGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddInstanceGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.AddInstanceGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.AddInstanceGroupsRequest add-instance-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addInstanceGroupsAsync add-instance-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.AddInstanceGroupsRequest add-instance-groups-request]
    (-> this (.addInstanceGroupsAsync add-instance-groups-request))))

(defn modify-instance-groups-async
  "ModifyInstanceGroups modifies the number of nodes and configuration settings of an instance group. The input
   parameters include the new target instance count for the group and the instance group ID. The call will either
   succeed or fail atomically.

  modify-instance-groups-request - Change the size of some instance groups. - `com.amazonaws.services.elasticmapreduce.model.ModifyInstanceGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyInstanceGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.ModifyInstanceGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.ModifyInstanceGroupsRequest modify-instance-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyInstanceGroupsAsync modify-instance-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.ModifyInstanceGroupsRequest modify-instance-groups-request]
    (-> this (.modifyInstanceGroupsAsync modify-instance-groups-request)))
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this]
    (-> this (.modifyInstanceGroupsAsync))))

(defn list-instance-fleets-async
  "Lists all available details about the instance fleets in a cluster.



   The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x
   versions.

  list-instance-fleets-request - `com.amazonaws.services.elasticmapreduce.model.ListInstanceFleetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListInstanceFleets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.ListInstanceFleetsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.ListInstanceFleetsRequest list-instance-fleets-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listInstanceFleetsAsync list-instance-fleets-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.ListInstanceFleetsRequest list-instance-fleets-request]
    (-> this (.listInstanceFleetsAsync list-instance-fleets-request))))

(defn set-visible-to-all-users-async
  "Sets whether all AWS Identity and Access Management (IAM) users under your account can access the specified
   clusters (job flows). This action works on running clusters. You can also set the visibility of a cluster when
   you launch it using the VisibleToAllUsers parameter of RunJobFlow. The SetVisibleToAllUsers
   action can be called only by an IAM user who created the cluster or the AWS account that owns the cluster.

  set-visible-to-all-users-request - The input to the SetVisibleToAllUsers action. - `com.amazonaws.services.elasticmapreduce.model.SetVisibleToAllUsersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetVisibleToAllUsers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.SetVisibleToAllUsersResult>`"
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.SetVisibleToAllUsersRequest set-visible-to-all-users-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setVisibleToAllUsersAsync set-visible-to-all-users-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.SetVisibleToAllUsersRequest set-visible-to-all-users-request]
    (-> this (.setVisibleToAllUsersAsync set-visible-to-all-users-request))))

(defn delete-security-configuration-async
  "Deletes a security configuration.

  delete-security-configuration-request - `com.amazonaws.services.elasticmapreduce.model.DeleteSecurityConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSecurityConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.DeleteSecurityConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.DeleteSecurityConfigurationRequest delete-security-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSecurityConfigurationAsync delete-security-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.DeleteSecurityConfigurationRequest delete-security-configuration-request]
    (-> this (.deleteSecurityConfigurationAsync delete-security-configuration-request))))

(defn run-job-flow-async
  "RunJobFlow creates and starts running a new cluster (job flow). The cluster runs the steps specified. After the
   steps complete, the cluster stops and the HDFS partition is lost. To prevent loss of data, configure the last
   step of the job flow to store results in Amazon S3. If the JobFlowInstancesConfig
   KeepJobFlowAliveWhenNoSteps parameter is set to TRUE, the cluster transitions to the
   WAITING state rather than shutting down after the steps have completed.


   For additional protection, you can set the JobFlowInstancesConfig TerminationProtected
   parameter to TRUE to lock the cluster and prevent it from being terminated by API call, user
   intervention, or in the event of a job flow error.


   A maximum of 256 steps are allowed in each job flow.


   If your cluster is long-running (such as a Hive data warehouse) or complex, you may require more than 256 steps
   to process your data. You can bypass the 256-step limitation in various ways, including using the SSH shell to
   connect to the master node and submitting queries directly to the software running on the master node, such as
   Hive and Hadoop. For more information on how to do this, see Add More than 256 Steps to
   a Cluster in the Amazon EMR Management Guide.


   For long running clusters, we recommend that you periodically store your results.



   The instance fleets configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x
   versions. The RunJobFlow request can contain InstanceFleets parameters or InstanceGroups parameters, but not
   both.

  run-job-flow-request - Input to the RunJobFlow operation. - `com.amazonaws.services.elasticmapreduce.model.RunJobFlowRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RunJobFlow operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.RunJobFlowResult>`"
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.RunJobFlowRequest run-job-flow-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.runJobFlowAsync run-job-flow-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.RunJobFlowRequest run-job-flow-request]
    (-> this (.runJobFlowAsync run-job-flow-request))))

(defn list-security-configurations-async
  "Lists all the security configurations visible to this account, providing their creation dates and times, and
   their names. This call returns a maximum of 50 clusters per call, but returns a marker to track the paging of the
   cluster list across multiple ListSecurityConfigurations calls.

  list-security-configurations-request - `com.amazonaws.services.elasticmapreduce.model.ListSecurityConfigurationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSecurityConfigurations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.ListSecurityConfigurationsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.ListSecurityConfigurationsRequest list-security-configurations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSecurityConfigurationsAsync list-security-configurations-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.ListSecurityConfigurationsRequest list-security-configurations-request]
    (-> this (.listSecurityConfigurationsAsync list-security-configurations-request))))

(defn describe-step-async
  "Provides more detail about the cluster step.

  describe-step-request - This input determines which step to describe. - `com.amazonaws.services.elasticmapreduce.model.DescribeStepRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStep operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.DescribeStepResult>`"
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.DescribeStepRequest describe-step-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStepAsync describe-step-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.DescribeStepRequest describe-step-request]
    (-> this (.describeStepAsync describe-step-request))))

(defn modify-instance-fleet-async
  "Modifies the target On-Demand and target Spot capacities for the instance fleet with the specified
   InstanceFleetID within the cluster specified using ClusterID. The call either succeeds or fails atomically.



   The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x
   versions.

  modify-instance-fleet-request - `com.amazonaws.services.elasticmapreduce.model.ModifyInstanceFleetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyInstanceFleet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.ModifyInstanceFleetResult>`"
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.ModifyInstanceFleetRequest modify-instance-fleet-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyInstanceFleetAsync modify-instance-fleet-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.ModifyInstanceFleetRequest modify-instance-fleet-request]
    (-> this (.modifyInstanceFleetAsync modify-instance-fleet-request))))

(defn describe-security-configuration-async
  "Provides the details of a security configuration by returning the configuration JSON.

  describe-security-configuration-request - `com.amazonaws.services.elasticmapreduce.model.DescribeSecurityConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSecurityConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.DescribeSecurityConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.DescribeSecurityConfigurationRequest describe-security-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSecurityConfigurationAsync describe-security-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.DescribeSecurityConfigurationRequest describe-security-configuration-request]
    (-> this (.describeSecurityConfigurationAsync describe-security-configuration-request))))

(defn remove-auto-scaling-policy-async
  "Removes an automatic scaling policy from a specified instance group within an EMR cluster.

  remove-auto-scaling-policy-request - `com.amazonaws.services.elasticmapreduce.model.RemoveAutoScalingPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveAutoScalingPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.RemoveAutoScalingPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.RemoveAutoScalingPolicyRequest remove-auto-scaling-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeAutoScalingPolicyAsync remove-auto-scaling-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.RemoveAutoScalingPolicyRequest remove-auto-scaling-policy-request]
    (-> this (.removeAutoScalingPolicyAsync remove-auto-scaling-policy-request))))

(defn list-bootstrap-actions-async
  "Provides information about the bootstrap actions associated with a cluster.

  list-bootstrap-actions-request - This input determines which bootstrap actions to retrieve. - `com.amazonaws.services.elasticmapreduce.model.ListBootstrapActionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBootstrapActions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.ListBootstrapActionsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.ListBootstrapActionsRequest list-bootstrap-actions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBootstrapActionsAsync list-bootstrap-actions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.ListBootstrapActionsRequest list-bootstrap-actions-request]
    (-> this (.listBootstrapActionsAsync list-bootstrap-actions-request))))

(defn list-instances-async
  "Provides information for all active EC2 instances and EC2 instances terminated in the last 30 days, up to a
   maximum of 2,000. EC2 instances in any of the following states are considered active: AWAITING_FULFILLMENT,
   PROVISIONING, BOOTSTRAPPING, RUNNING.

  list-instances-request - This input determines which instances to list. - `com.amazonaws.services.elasticmapreduce.model.ListInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.ListInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.ListInstancesRequest list-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listInstancesAsync list-instances-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.ListInstancesRequest list-instances-request]
    (-> this (.listInstancesAsync list-instances-request))))

(defn list-clusters-async
  "Provides the status of all clusters visible to this AWS account. Allows you to filter the list of clusters based
   on certain criteria; for example, filtering by cluster creation date and time or by status. This call returns a
   maximum of 50 clusters per call, but returns a marker to track the paging of the cluster list across multiple
   ListClusters calls.

  list-clusters-request - This input determines how the ListClusters action filters the list of clusters that it returns. - `com.amazonaws.services.elasticmapreduce.model.ListClustersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListClusters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.ListClustersResult>`"
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.ListClustersRequest list-clusters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listClustersAsync list-clusters-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.ListClustersRequest list-clusters-request]
    (-> this (.listClustersAsync list-clusters-request)))
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this]
    (-> this (.listClustersAsync))))

(defn set-termination-protection-async
  "SetTerminationProtection locks a cluster (job flow) so the EC2 instances in the cluster cannot be terminated by
   user intervention, an API call, or in the event of a job-flow error. The cluster still terminates upon successful
   completion of the job flow. Calling SetTerminationProtection on a cluster is similar to calling the
   Amazon EC2 DisableAPITermination API on all EC2 instances in a cluster.


   SetTerminationProtection is used to prevent accidental termination of a cluster and to ensure that
   in the event of an error, the instances persist so that you can recover any data stored in their ephemeral
   instance storage.


   To terminate a cluster that has been locked by setting SetTerminationProtection to true
   , you must first unlock the job flow by a subsequent call to SetTerminationProtection in which you
   set the value to false.


   For more information, seeManaging
   Cluster Termination in the Amazon EMR Management Guide.

  set-termination-protection-request - The input argument to the TerminationProtection operation. - `com.amazonaws.services.elasticmapreduce.model.SetTerminationProtectionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetTerminationProtection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.SetTerminationProtectionResult>`"
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.SetTerminationProtectionRequest set-termination-protection-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setTerminationProtectionAsync set-termination-protection-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.SetTerminationProtectionRequest set-termination-protection-request]
    (-> this (.setTerminationProtectionAsync set-termination-protection-request))))

(defn remove-tags-async
  "Removes tags from an Amazon EMR resource. Tags make it easier to associate clusters in various ways, such as
   grouping clusters to track your Amazon EMR resource allocation costs. For more information, see Tag Clusters.


   The following example removes the stack tag with value Prod from a cluster:

  remove-tags-request - This input identifies a cluster and a list of tags to remove. - `com.amazonaws.services.elasticmapreduce.model.RemoveTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.RemoveTagsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.RemoveTagsRequest remove-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeTagsAsync remove-tags-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.RemoveTagsRequest remove-tags-request]
    (-> this (.removeTagsAsync remove-tags-request))))

(defn terminate-job-flows-async
  "TerminateJobFlows shuts a list of clusters (job flows) down. When a job flow is shut down, any step not yet
   completed is canceled and the EC2 instances on which the cluster is running are stopped. Any log files not
   already saved are uploaded to Amazon S3 if a LogUri was specified when the cluster was created.


   The maximum number of clusters allowed is 10. The call to TerminateJobFlows is asynchronous.
   Depending on the configuration of the cluster, it may take up to 1-5 minutes for the cluster to completely
   terminate and release allocated resources, such as Amazon EC2 instances.

  terminate-job-flows-request - Input to the TerminateJobFlows operation. - `com.amazonaws.services.elasticmapreduce.model.TerminateJobFlowsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TerminateJobFlows operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.TerminateJobFlowsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.TerminateJobFlowsRequest terminate-job-flows-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.terminateJobFlowsAsync terminate-job-flows-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.TerminateJobFlowsRequest terminate-job-flows-request]
    (-> this (.terminateJobFlowsAsync terminate-job-flows-request))))

(defn add-job-flow-steps-async
  "AddJobFlowSteps adds new steps to a running cluster. A maximum of 256 steps are allowed in each job flow.


   If your cluster is long-running (such as a Hive data warehouse) or complex, you may require more than 256 steps
   to process your data. You can bypass the 256-step limitation in various ways, including using SSH to connect to
   the master node and submitting queries directly to the software running on the master node, such as Hive and
   Hadoop. For more information on how to do this, see Add More than 256 Steps to
   a Cluster in the Amazon EMR Management Guide.


   A step specifies the location of a JAR file stored either on the master node of the cluster or in Amazon S3. Each
   step is performed by the main function of the main class of the JAR file. The main class can be specified either
   in the manifest of the JAR or by using the MainFunction parameter of the step.


   Amazon EMR executes each step in the order listed. For a step to be considered complete, the main function must
   exit with a zero exit code and all Hadoop jobs started while the step was running must have completed and run
   successfully.


   You can only add steps to a cluster that is in one of the following states: STARTING, BOOTSTRAPPING, RUNNING, or
   WAITING.

  add-job-flow-steps-request - The input argument to the AddJobFlowSteps operation. - `com.amazonaws.services.elasticmapreduce.model.AddJobFlowStepsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddJobFlowSteps operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.AddJobFlowStepsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.AddJobFlowStepsRequest add-job-flow-steps-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addJobFlowStepsAsync add-job-flow-steps-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.AddJobFlowStepsRequest add-job-flow-steps-request]
    (-> this (.addJobFlowStepsAsync add-job-flow-steps-request))))

(defn describe-cluster-async
  "Provides cluster-level details including status, hardware and software configuration, VPC settings, and so on.

  describe-cluster-request - This input determines which cluster to describe. - `com.amazonaws.services.elasticmapreduce.model.DescribeClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.DescribeClusterResult>`"
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.DescribeClusterRequest describe-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClusterAsync describe-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.DescribeClusterRequest describe-cluster-request]
    (-> this (.describeClusterAsync describe-cluster-request))))

(defn describe-job-flows-async
  "Deprecated.

  describe-job-flows-request - The input for the DescribeJobFlows operation. - `com.amazonaws.services.elasticmapreduce.model.DescribeJobFlowsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeJobFlows operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.DescribeJobFlowsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.DescribeJobFlowsRequest describe-job-flows-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeJobFlowsAsync describe-job-flows-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.DescribeJobFlowsRequest describe-job-flows-request]
    (-> this (.describeJobFlowsAsync describe-job-flows-request)))
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this]
    (-> this (.describeJobFlowsAsync))))

(defn list-steps-async
  "Provides a list of steps for the cluster in reverse order unless you specify stepIds with the request.

  list-steps-request - This input determines which steps to list. - `com.amazonaws.services.elasticmapreduce.model.ListStepsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSteps operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.ListStepsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.ListStepsRequest list-steps-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listStepsAsync list-steps-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.ListStepsRequest list-steps-request]
    (-> this (.listStepsAsync list-steps-request))))

(defn add-instance-fleet-async
  "Adds an instance fleet to a running cluster.



   The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x.

  add-instance-fleet-request - `com.amazonaws.services.elasticmapreduce.model.AddInstanceFleetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddInstanceFleet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.AddInstanceFleetResult>`"
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.AddInstanceFleetRequest add-instance-fleet-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addInstanceFleetAsync add-instance-fleet-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.AddInstanceFleetRequest add-instance-fleet-request]
    (-> this (.addInstanceFleetAsync add-instance-fleet-request))))

(defn add-tags-async
  "Adds tags to an Amazon EMR resource. Tags make it easier to associate clusters in various ways, such as grouping
   clusters to track your Amazon EMR resource allocation costs. For more information, see Tag Clusters.

  add-tags-request - This input identifies a cluster and a list of tags to attach. - `com.amazonaws.services.elasticmapreduce.model.AddTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticmapreduce.model.AddTagsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.AddTagsRequest add-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addTagsAsync add-tags-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticMapReduceAsync this ^com.amazonaws.services.elasticmapreduce.model.AddTagsRequest add-tags-request]
    (-> this (.addTagsAsync add-tags-request))))

