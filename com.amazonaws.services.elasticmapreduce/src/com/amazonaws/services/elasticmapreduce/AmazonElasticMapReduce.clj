(ns com.amazonaws.services.elasticmapreduce.AmazonElasticMapReduce
  "Interface for accessing Amazon EMR.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonElasticMapReduce instead.



  Amazon EMR is a web service that makes it easy to process large amounts of data efficiently. Amazon EMR uses Hadoop
  processing combined with several AWS products to do tasks such as web indexing, data mining, log file analysis,
  machine learning, scientific simulation, and data warehousing."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.elasticmapreduce AmazonElasticMapReduce]))

(defn run-job-flow
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

  returns: Result of the RunJobFlow operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.RunJobFlowResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerErrorException - Indicates that an error occurred while processing the request and that the request was not completed."
  (^com.amazonaws.services.elasticmapreduce.model.RunJobFlowResult [^AmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.RunJobFlowRequest run-job-flow-request]
    (-> this (.runJobFlow run-job-flow-request))))

(defn remove-auto-scaling-policy
  "Removes an automatic scaling policy from a specified instance group within an EMR cluster.

  remove-auto-scaling-policy-request - `com.amazonaws.services.elasticmapreduce.model.RemoveAutoScalingPolicyRequest`

  returns: Result of the RemoveAutoScalingPolicy operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.RemoveAutoScalingPolicyResult`"
  (^com.amazonaws.services.elasticmapreduce.model.RemoveAutoScalingPolicyResult [^AmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.RemoveAutoScalingPolicyRequest remove-auto-scaling-policy-request]
    (-> this (.removeAutoScalingPolicy remove-auto-scaling-policy-request))))

(defn add-tags
  "Adds tags to an Amazon EMR resource. Tags make it easier to associate clusters in various ways, such as grouping
   clusters to track your Amazon EMR resource allocation costs. For more information, see Tag Clusters.

  add-tags-request - This input identifies a cluster and a list of tags to attach. - `com.amazonaws.services.elasticmapreduce.model.AddTagsRequest`

  returns: Result of the AddTags operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.AddTagsResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerException - This exception occurs when there is an internal failure in the EMR service."
  (^com.amazonaws.services.elasticmapreduce.model.AddTagsResult [^AmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.AddTagsRequest add-tags-request]
    (-> this (.addTags add-tags-request))))

(defn describe-cluster
  "Provides cluster-level details including status, hardware and software configuration, VPC settings, and so on.

  describe-cluster-request - This input determines which cluster to describe. - `com.amazonaws.services.elasticmapreduce.model.DescribeClusterRequest`

  returns: Result of the DescribeCluster operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.DescribeClusterResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerException - This exception occurs when there is an internal failure in the EMR service."
  (^com.amazonaws.services.elasticmapreduce.model.DescribeClusterResult [^AmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.DescribeClusterRequest describe-cluster-request]
    (-> this (.describeCluster describe-cluster-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AmazonElasticMapReduce this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn waiters
  "returns: `com.amazonaws.services.elasticmapreduce.waiters.AmazonElasticMapReduceWaiters`"
  (^com.amazonaws.services.elasticmapreduce.waiters.AmazonElasticMapReduceWaiters [^AmazonElasticMapReduce this]
    (-> this (.waiters))))

(defn add-instance-fleet
  "Adds an instance fleet to a running cluster.



   The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x.

  add-instance-fleet-request - `com.amazonaws.services.elasticmapreduce.model.AddInstanceFleetRequest`

  returns: Result of the AddInstanceFleet operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.AddInstanceFleetResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerException - This exception occurs when there is an internal failure in the EMR service."
  (^com.amazonaws.services.elasticmapreduce.model.AddInstanceFleetResult [^AmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.AddInstanceFleetRequest add-instance-fleet-request]
    (-> this (.addInstanceFleet add-instance-fleet-request))))

(defn delete-security-configuration
  "Deletes a security configuration.

  delete-security-configuration-request - `com.amazonaws.services.elasticmapreduce.model.DeleteSecurityConfigurationRequest`

  returns: Result of the DeleteSecurityConfiguration operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.DeleteSecurityConfigurationResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerException - This exception occurs when there is an internal failure in the EMR service."
  (^com.amazonaws.services.elasticmapreduce.model.DeleteSecurityConfigurationResult [^AmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.DeleteSecurityConfigurationRequest delete-security-configuration-request]
    (-> this (.deleteSecurityConfiguration delete-security-configuration-request))))

(defn set-termination-protection
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

  returns: Result of the SetTerminationProtection operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.SetTerminationProtectionResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerErrorException - Indicates that an error occurred while processing the request and that the request was not completed."
  (^com.amazonaws.services.elasticmapreduce.model.SetTerminationProtectionResult [^AmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.SetTerminationProtectionRequest set-termination-protection-request]
    (-> this (.setTerminationProtection set-termination-protection-request))))

(defn list-instance-groups
  "Provides all available details about the instance groups in a cluster.

  list-instance-groups-request - This input determines which instance groups to retrieve. - `com.amazonaws.services.elasticmapreduce.model.ListInstanceGroupsRequest`

  returns: Result of the ListInstanceGroups operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.ListInstanceGroupsResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerException - This exception occurs when there is an internal failure in the EMR service."
  (^com.amazonaws.services.elasticmapreduce.model.ListInstanceGroupsResult [^AmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.ListInstanceGroupsRequest list-instance-groups-request]
    (-> this (.listInstanceGroups list-instance-groups-request))))

(defn remove-tags
  "Removes tags from an Amazon EMR resource. Tags make it easier to associate clusters in various ways, such as
   grouping clusters to track your Amazon EMR resource allocation costs. For more information, see Tag Clusters.


   The following example removes the stack tag with value Prod from a cluster:

  remove-tags-request - This input identifies a cluster and a list of tags to remove. - `com.amazonaws.services.elasticmapreduce.model.RemoveTagsRequest`

  returns: Result of the RemoveTags operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.RemoveTagsResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerException - This exception occurs when there is an internal failure in the EMR service."
  (^com.amazonaws.services.elasticmapreduce.model.RemoveTagsResult [^AmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.RemoveTagsRequest remove-tags-request]
    (-> this (.removeTags remove-tags-request))))

(defn set-visible-to-all-users
  "Sets whether all AWS Identity and Access Management (IAM) users under your account can access the specified
   clusters (job flows). This action works on running clusters. You can also set the visibility of a cluster when
   you launch it using the VisibleToAllUsers parameter of RunJobFlow. The SetVisibleToAllUsers
   action can be called only by an IAM user who created the cluster or the AWS account that owns the cluster.

  set-visible-to-all-users-request - The input to the SetVisibleToAllUsers action. - `com.amazonaws.services.elasticmapreduce.model.SetVisibleToAllUsersRequest`

  returns: Result of the SetVisibleToAllUsers operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.SetVisibleToAllUsersResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerErrorException - Indicates that an error occurred while processing the request and that the request was not completed."
  (^com.amazonaws.services.elasticmapreduce.model.SetVisibleToAllUsersResult [^AmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.SetVisibleToAllUsersRequest set-visible-to-all-users-request]
    (-> this (.setVisibleToAllUsers set-visible-to-all-users-request))))

(defn modify-instance-fleet
  "Modifies the target On-Demand and target Spot capacities for the instance fleet with the specified
   InstanceFleetID within the cluster specified using ClusterID. The call either succeeds or fails atomically.



   The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x
   versions.

  modify-instance-fleet-request - `com.amazonaws.services.elasticmapreduce.model.ModifyInstanceFleetRequest`

  returns: Result of the ModifyInstanceFleet operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.ModifyInstanceFleetResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerException - This exception occurs when there is an internal failure in the EMR service."
  (^com.amazonaws.services.elasticmapreduce.model.ModifyInstanceFleetResult [^AmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.ModifyInstanceFleetRequest modify-instance-fleet-request]
    (-> this (.modifyInstanceFleet modify-instance-fleet-request))))

(defn list-instances
  "Provides information for all active EC2 instances and EC2 instances terminated in the last 30 days, up to a
   maximum of 2,000. EC2 instances in any of the following states are considered active: AWAITING_FULFILLMENT,
   PROVISIONING, BOOTSTRAPPING, RUNNING.

  list-instances-request - This input determines which instances to list. - `com.amazonaws.services.elasticmapreduce.model.ListInstancesRequest`

  returns: Result of the ListInstances operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.ListInstancesResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerException - This exception occurs when there is an internal failure in the EMR service."
  (^com.amazonaws.services.elasticmapreduce.model.ListInstancesResult [^AmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.ListInstancesRequest list-instances-request]
    (-> this (.listInstances list-instances-request))))

(defn describe-security-configuration
  "Provides the details of a security configuration by returning the configuration JSON.

  describe-security-configuration-request - `com.amazonaws.services.elasticmapreduce.model.DescribeSecurityConfigurationRequest`

  returns: Result of the DescribeSecurityConfiguration operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.DescribeSecurityConfigurationResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerException - This exception occurs when there is an internal failure in the EMR service."
  (^com.amazonaws.services.elasticmapreduce.model.DescribeSecurityConfigurationResult [^AmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.DescribeSecurityConfigurationRequest describe-security-configuration-request]
    (-> this (.describeSecurityConfiguration describe-security-configuration-request))))

(defn describe-job-flows
  "Deprecated.

  describe-job-flows-request - The input for the DescribeJobFlows operation. - `com.amazonaws.services.elasticmapreduce.model.DescribeJobFlowsRequest`

  returns: Result of the DescribeJobFlows operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.DescribeJobFlowsResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerErrorException - Indicates that an error occurred while processing the request and that the request was not completed."
  (^com.amazonaws.services.elasticmapreduce.model.DescribeJobFlowsResult [^AmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.DescribeJobFlowsRequest describe-job-flows-request]
    (-> this (.describeJobFlows describe-job-flows-request)))
  (^com.amazonaws.services.elasticmapreduce.model.DescribeJobFlowsResult [^AmazonElasticMapReduce this]
    (-> this (.describeJobFlows))))

(defn create-security-configuration
  "Creates a security configuration, which is stored in the service and can be specified when a cluster is created.

  create-security-configuration-request - `com.amazonaws.services.elasticmapreduce.model.CreateSecurityConfigurationRequest`

  returns: Result of the CreateSecurityConfiguration operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.CreateSecurityConfigurationResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerException - This exception occurs when there is an internal failure in the EMR service."
  (^com.amazonaws.services.elasticmapreduce.model.CreateSecurityConfigurationResult [^AmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.CreateSecurityConfigurationRequest create-security-configuration-request]
    (-> this (.createSecurityConfiguration create-security-configuration-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonElasticMapReduce this]
    (-> this (.shutdown))))

(defn add-instance-groups
  "Adds one or more instance groups to a running cluster.

  add-instance-groups-request - Input to an AddInstanceGroups call. - `com.amazonaws.services.elasticmapreduce.model.AddInstanceGroupsRequest`

  returns: Result of the AddInstanceGroups operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.AddInstanceGroupsResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerErrorException - Indicates that an error occurred while processing the request and that the request was not completed."
  (^com.amazonaws.services.elasticmapreduce.model.AddInstanceGroupsResult [^AmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.AddInstanceGroupsRequest add-instance-groups-request]
    (-> this (.addInstanceGroups add-instance-groups-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"elasticmapreduce.amazonaws.com\") or a full URL, including the protocol (ex: \"https://elasticmapreduce.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AmazonElasticMapReduce this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn list-instance-fleets
  "Lists all available details about the instance fleets in a cluster.



   The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x
   versions.

  list-instance-fleets-request - `com.amazonaws.services.elasticmapreduce.model.ListInstanceFleetsRequest`

  returns: Result of the ListInstanceFleets operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.ListInstanceFleetsResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerException - This exception occurs when there is an internal failure in the EMR service."
  (^com.amazonaws.services.elasticmapreduce.model.ListInstanceFleetsResult [^AmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.ListInstanceFleetsRequest list-instance-fleets-request]
    (-> this (.listInstanceFleets list-instance-fleets-request))))

(defn add-job-flow-steps
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

  returns: Result of the AddJobFlowSteps operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.AddJobFlowStepsResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerErrorException - Indicates that an error occurred while processing the request and that the request was not completed."
  (^com.amazonaws.services.elasticmapreduce.model.AddJobFlowStepsResult [^AmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.AddJobFlowStepsRequest add-job-flow-steps-request]
    (-> this (.addJobFlowSteps add-job-flow-steps-request))))

(defn list-security-configurations
  "Lists all the security configurations visible to this account, providing their creation dates and times, and
   their names. This call returns a maximum of 50 clusters per call, but returns a marker to track the paging of the
   cluster list across multiple ListSecurityConfigurations calls.

  list-security-configurations-request - `com.amazonaws.services.elasticmapreduce.model.ListSecurityConfigurationsRequest`

  returns: Result of the ListSecurityConfigurations operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.ListSecurityConfigurationsResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerException - This exception occurs when there is an internal failure in the EMR service."
  (^com.amazonaws.services.elasticmapreduce.model.ListSecurityConfigurationsResult [^AmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.ListSecurityConfigurationsRequest list-security-configurations-request]
    (-> this (.listSecurityConfigurations list-security-configurations-request))))

(defn list-bootstrap-actions
  "Provides information about the bootstrap actions associated with a cluster.

  list-bootstrap-actions-request - This input determines which bootstrap actions to retrieve. - `com.amazonaws.services.elasticmapreduce.model.ListBootstrapActionsRequest`

  returns: Result of the ListBootstrapActions operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.ListBootstrapActionsResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerException - This exception occurs when there is an internal failure in the EMR service."
  (^com.amazonaws.services.elasticmapreduce.model.ListBootstrapActionsResult [^AmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.ListBootstrapActionsRequest list-bootstrap-actions-request]
    (-> this (.listBootstrapActions list-bootstrap-actions-request))))

(defn list-steps
  "Provides a list of steps for the cluster in reverse order unless you specify stepIds with the request.

  list-steps-request - This input determines which steps to list. - `com.amazonaws.services.elasticmapreduce.model.ListStepsRequest`

  returns: Result of the ListSteps operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.ListStepsResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerException - This exception occurs when there is an internal failure in the EMR service."
  (^com.amazonaws.services.elasticmapreduce.model.ListStepsResult [^AmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.ListStepsRequest list-steps-request]
    (-> this (.listSteps list-steps-request))))

(defn terminate-job-flows
  "TerminateJobFlows shuts a list of clusters (job flows) down. When a job flow is shut down, any step not yet
   completed is canceled and the EC2 instances on which the cluster is running are stopped. Any log files not
   already saved are uploaded to Amazon S3 if a LogUri was specified when the cluster was created.


   The maximum number of clusters allowed is 10. The call to TerminateJobFlows is asynchronous.
   Depending on the configuration of the cluster, it may take up to 1-5 minutes for the cluster to completely
   terminate and release allocated resources, such as Amazon EC2 instances.

  terminate-job-flows-request - Input to the TerminateJobFlows operation. - `com.amazonaws.services.elasticmapreduce.model.TerminateJobFlowsRequest`

  returns: Result of the TerminateJobFlows operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.TerminateJobFlowsResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerErrorException - Indicates that an error occurred while processing the request and that the request was not completed."
  (^com.amazonaws.services.elasticmapreduce.model.TerminateJobFlowsResult [^AmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.TerminateJobFlowsRequest terminate-job-flows-request]
    (-> this (.terminateJobFlows terminate-job-flows-request))))

(defn modify-instance-groups
  "ModifyInstanceGroups modifies the number of nodes and configuration settings of an instance group. The input
   parameters include the new target instance count for the group and the instance group ID. The call will either
   succeed or fail atomically.

  modify-instance-groups-request - Change the size of some instance groups. - `com.amazonaws.services.elasticmapreduce.model.ModifyInstanceGroupsRequest`

  returns: Result of the ModifyInstanceGroups operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.ModifyInstanceGroupsResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerErrorException - Indicates that an error occurred while processing the request and that the request was not completed."
  (^com.amazonaws.services.elasticmapreduce.model.ModifyInstanceGroupsResult [^AmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.ModifyInstanceGroupsRequest modify-instance-groups-request]
    (-> this (.modifyInstanceGroups modify-instance-groups-request)))
  (^com.amazonaws.services.elasticmapreduce.model.ModifyInstanceGroupsResult [^AmazonElasticMapReduce this]
    (-> this (.modifyInstanceGroups))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonElasticMapReduce this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn put-auto-scaling-policy
  "Creates or updates an automatic scaling policy for a core instance group or task instance group in an Amazon EMR
   cluster. The automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances
   in response to the value of a CloudWatch metric.

  put-auto-scaling-policy-request - `com.amazonaws.services.elasticmapreduce.model.PutAutoScalingPolicyRequest`

  returns: Result of the PutAutoScalingPolicy operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.PutAutoScalingPolicyResult`"
  (^com.amazonaws.services.elasticmapreduce.model.PutAutoScalingPolicyResult [^AmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.PutAutoScalingPolicyRequest put-auto-scaling-policy-request]
    (-> this (.putAutoScalingPolicy put-auto-scaling-policy-request))))

(defn cancel-steps
  "Cancels a pending step or steps in a running cluster. Available only in Amazon EMR versions 4.8.0 and later,
   excluding version 5.0.0. A maximum of 256 steps are allowed in each CancelSteps request. CancelSteps is
   idempotent but asynchronous; it does not guarantee a step will be canceled, even if the request is successfully
   submitted. You can only cancel steps that are in a PENDING state.

  cancel-steps-request - The input argument to the CancelSteps operation. - `com.amazonaws.services.elasticmapreduce.model.CancelStepsRequest`

  returns: Result of the CancelSteps operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.CancelStepsResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerErrorException - Indicates that an error occurred while processing the request and that the request was not completed."
  (^com.amazonaws.services.elasticmapreduce.model.CancelStepsResult [^AmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.CancelStepsRequest cancel-steps-request]
    (-> this (.cancelSteps cancel-steps-request))))

(defn list-clusters
  "Provides the status of all clusters visible to this AWS account. Allows you to filter the list of clusters based
   on certain criteria; for example, filtering by cluster creation date and time or by status. This call returns a
   maximum of 50 clusters per call, but returns a marker to track the paging of the cluster list across multiple
   ListClusters calls.

  list-clusters-request - This input determines how the ListClusters action filters the list of clusters that it returns. - `com.amazonaws.services.elasticmapreduce.model.ListClustersRequest`

  returns: Result of the ListClusters operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.ListClustersResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerException - This exception occurs when there is an internal failure in the EMR service."
  (^com.amazonaws.services.elasticmapreduce.model.ListClustersResult [^AmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.ListClustersRequest list-clusters-request]
    (-> this (.listClusters list-clusters-request)))
  (^com.amazonaws.services.elasticmapreduce.model.ListClustersResult [^AmazonElasticMapReduce this]
    (-> this (.listClusters))))

(defn describe-step
  "Provides more detail about the cluster step.

  describe-step-request - This input determines which step to describe. - `com.amazonaws.services.elasticmapreduce.model.DescribeStepRequest`

  returns: Result of the DescribeStep operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.DescribeStepResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerException - This exception occurs when there is an internal failure in the EMR service."
  (^com.amazonaws.services.elasticmapreduce.model.DescribeStepResult [^AmazonElasticMapReduce this ^com.amazonaws.services.elasticmapreduce.model.DescribeStepRequest describe-step-request]
    (-> this (.describeStep describe-step-request))))

