(ns com.amazonaws.services.elasticmapreduce.AmazonElasticMapReduceClient
  "Client for accessing Amazon EMR. All service calls made using this client are blocking, and will not return until the
  service call completes.


  Amazon EMR is a web service that makes it easy to process large amounts of data efficiently. Amazon EMR uses Hadoop
  processing combined with several AWS products to do tasks such as web indexing, data mining, log file analysis,
  machine learning, scientific simulation, and data warehousing."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.elasticmapreduce AmazonElasticMapReduceClient]))

(defn ->amazon-elastic-map-reduce-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to Amazon EMR (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AmazonElasticMapReduceClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AmazonElasticMapReduceClient aws-credentials-provider client-configuration request-metric-collector))
  (^AmazonElasticMapReduceClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonElasticMapReduceClient aws-credentials client-configuration))
  (^AmazonElasticMapReduceClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonElasticMapReduceClient client-configuration))
  (^AmazonElasticMapReduceClient []
    (new AmazonElasticMapReduceClient )))

(defn *builder
  "returns: `com.amazonaws.services.elasticmapreduce.AmazonElasticMapReduceClientBuilder`"
  (^com.amazonaws.services.elasticmapreduce.AmazonElasticMapReduceClientBuilder []
    (AmazonElasticMapReduceClient/builder )))

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

  request - `com.amazonaws.services.elasticmapreduce.model.RunJobFlowRequest`

  returns: Result of the RunJobFlow operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.RunJobFlowResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerErrorException - Indicates that an error occurred while processing the request and that the request was not completed."
  (^com.amazonaws.services.elasticmapreduce.model.RunJobFlowResult [^AmazonElasticMapReduceClient this ^com.amazonaws.services.elasticmapreduce.model.RunJobFlowRequest request]
    (-> this (.runJobFlow request))))

(defn remove-auto-scaling-policy
  "Removes an automatic scaling policy from a specified instance group within an EMR cluster.

  request - `com.amazonaws.services.elasticmapreduce.model.RemoveAutoScalingPolicyRequest`

  returns: Result of the RemoveAutoScalingPolicy operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.RemoveAutoScalingPolicyResult`"
  (^com.amazonaws.services.elasticmapreduce.model.RemoveAutoScalingPolicyResult [^AmazonElasticMapReduceClient this ^com.amazonaws.services.elasticmapreduce.model.RemoveAutoScalingPolicyRequest request]
    (-> this (.removeAutoScalingPolicy request))))

(defn add-tags
  "Adds tags to an Amazon EMR resource. Tags make it easier to associate clusters in various ways, such as grouping
   clusters to track your Amazon EMR resource allocation costs. For more information, see Tag Clusters.

  request - `com.amazonaws.services.elasticmapreduce.model.AddTagsRequest`

  returns: Result of the AddTags operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.AddTagsResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerException - This exception occurs when there is an internal failure in the EMR service."
  (^com.amazonaws.services.elasticmapreduce.model.AddTagsResult [^AmazonElasticMapReduceClient this ^com.amazonaws.services.elasticmapreduce.model.AddTagsRequest request]
    (-> this (.addTags request))))

(defn describe-cluster
  "Provides cluster-level details including status, hardware and software configuration, VPC settings, and so on.

  request - `com.amazonaws.services.elasticmapreduce.model.DescribeClusterRequest`

  returns: Result of the DescribeCluster operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.DescribeClusterResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerException - This exception occurs when there is an internal failure in the EMR service."
  (^com.amazonaws.services.elasticmapreduce.model.DescribeClusterResult [^AmazonElasticMapReduceClient this ^com.amazonaws.services.elasticmapreduce.model.DescribeClusterRequest request]
    (-> this (.describeCluster request))))

(defn waiters
  "returns: `com.amazonaws.services.elasticmapreduce.waiters.AmazonElasticMapReduceWaiters`"
  (^com.amazonaws.services.elasticmapreduce.waiters.AmazonElasticMapReduceWaiters [^AmazonElasticMapReduceClient this]
    (-> this (.waiters))))

(defn add-instance-fleet
  "Adds an instance fleet to a running cluster.



   The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x.

  request - `com.amazonaws.services.elasticmapreduce.model.AddInstanceFleetRequest`

  returns: Result of the AddInstanceFleet operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.AddInstanceFleetResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerException - This exception occurs when there is an internal failure in the EMR service."
  (^com.amazonaws.services.elasticmapreduce.model.AddInstanceFleetResult [^AmazonElasticMapReduceClient this ^com.amazonaws.services.elasticmapreduce.model.AddInstanceFleetRequest request]
    (-> this (.addInstanceFleet request))))

(defn delete-security-configuration
  "Deletes a security configuration.

  request - `com.amazonaws.services.elasticmapreduce.model.DeleteSecurityConfigurationRequest`

  returns: Result of the DeleteSecurityConfiguration operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.DeleteSecurityConfigurationResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerException - This exception occurs when there is an internal failure in the EMR service."
  (^com.amazonaws.services.elasticmapreduce.model.DeleteSecurityConfigurationResult [^AmazonElasticMapReduceClient this ^com.amazonaws.services.elasticmapreduce.model.DeleteSecurityConfigurationRequest request]
    (-> this (.deleteSecurityConfiguration request))))

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

  request - `com.amazonaws.services.elasticmapreduce.model.SetTerminationProtectionRequest`

  returns: Result of the SetTerminationProtection operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.SetTerminationProtectionResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerErrorException - Indicates that an error occurred while processing the request and that the request was not completed."
  (^com.amazonaws.services.elasticmapreduce.model.SetTerminationProtectionResult [^AmazonElasticMapReduceClient this ^com.amazonaws.services.elasticmapreduce.model.SetTerminationProtectionRequest request]
    (-> this (.setTerminationProtection request))))

(defn list-instance-groups
  "Provides all available details about the instance groups in a cluster.

  request - `com.amazonaws.services.elasticmapreduce.model.ListInstanceGroupsRequest`

  returns: Result of the ListInstanceGroups operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.ListInstanceGroupsResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerException - This exception occurs when there is an internal failure in the EMR service."
  (^com.amazonaws.services.elasticmapreduce.model.ListInstanceGroupsResult [^AmazonElasticMapReduceClient this ^com.amazonaws.services.elasticmapreduce.model.ListInstanceGroupsRequest request]
    (-> this (.listInstanceGroups request))))

(defn remove-tags
  "Removes tags from an Amazon EMR resource. Tags make it easier to associate clusters in various ways, such as
   grouping clusters to track your Amazon EMR resource allocation costs. For more information, see Tag Clusters.


   The following example removes the stack tag with value Prod from a cluster:

  request - `com.amazonaws.services.elasticmapreduce.model.RemoveTagsRequest`

  returns: Result of the RemoveTags operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.RemoveTagsResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerException - This exception occurs when there is an internal failure in the EMR service."
  (^com.amazonaws.services.elasticmapreduce.model.RemoveTagsResult [^AmazonElasticMapReduceClient this ^com.amazonaws.services.elasticmapreduce.model.RemoveTagsRequest request]
    (-> this (.removeTags request))))

(defn set-visible-to-all-users
  "Sets whether all AWS Identity and Access Management (IAM) users under your account can access the specified
   clusters (job flows). This action works on running clusters. You can also set the visibility of a cluster when
   you launch it using the VisibleToAllUsers parameter of RunJobFlow. The SetVisibleToAllUsers
   action can be called only by an IAM user who created the cluster or the AWS account that owns the cluster.

  request - `com.amazonaws.services.elasticmapreduce.model.SetVisibleToAllUsersRequest`

  returns: Result of the SetVisibleToAllUsers operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.SetVisibleToAllUsersResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerErrorException - Indicates that an error occurred while processing the request and that the request was not completed."
  (^com.amazonaws.services.elasticmapreduce.model.SetVisibleToAllUsersResult [^AmazonElasticMapReduceClient this ^com.amazonaws.services.elasticmapreduce.model.SetVisibleToAllUsersRequest request]
    (-> this (.setVisibleToAllUsers request))))

(defn modify-instance-fleet
  "Modifies the target On-Demand and target Spot capacities for the instance fleet with the specified
   InstanceFleetID within the cluster specified using ClusterID. The call either succeeds or fails atomically.



   The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x
   versions.

  request - `com.amazonaws.services.elasticmapreduce.model.ModifyInstanceFleetRequest`

  returns: Result of the ModifyInstanceFleet operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.ModifyInstanceFleetResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerException - This exception occurs when there is an internal failure in the EMR service."
  (^com.amazonaws.services.elasticmapreduce.model.ModifyInstanceFleetResult [^AmazonElasticMapReduceClient this ^com.amazonaws.services.elasticmapreduce.model.ModifyInstanceFleetRequest request]
    (-> this (.modifyInstanceFleet request))))

(defn list-instances
  "Provides information for all active EC2 instances and EC2 instances terminated in the last 30 days, up to a
   maximum of 2,000. EC2 instances in any of the following states are considered active: AWAITING_FULFILLMENT,
   PROVISIONING, BOOTSTRAPPING, RUNNING.

  request - `com.amazonaws.services.elasticmapreduce.model.ListInstancesRequest`

  returns: Result of the ListInstances operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.ListInstancesResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerException - This exception occurs when there is an internal failure in the EMR service."
  (^com.amazonaws.services.elasticmapreduce.model.ListInstancesResult [^AmazonElasticMapReduceClient this ^com.amazonaws.services.elasticmapreduce.model.ListInstancesRequest request]
    (-> this (.listInstances request))))

(defn describe-security-configuration
  "Provides the details of a security configuration by returning the configuration JSON.

  request - `com.amazonaws.services.elasticmapreduce.model.DescribeSecurityConfigurationRequest`

  returns: Result of the DescribeSecurityConfiguration operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.DescribeSecurityConfigurationResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerException - This exception occurs when there is an internal failure in the EMR service."
  (^com.amazonaws.services.elasticmapreduce.model.DescribeSecurityConfigurationResult [^AmazonElasticMapReduceClient this ^com.amazonaws.services.elasticmapreduce.model.DescribeSecurityConfigurationRequest request]
    (-> this (.describeSecurityConfiguration request))))

(defn describe-job-flows
  "Deprecated.

  request - `com.amazonaws.services.elasticmapreduce.model.DescribeJobFlowsRequest`

  returns: Result of the DescribeJobFlows operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.DescribeJobFlowsResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerErrorException - Indicates that an error occurred while processing the request and that the request was not completed."
  (^com.amazonaws.services.elasticmapreduce.model.DescribeJobFlowsResult [^AmazonElasticMapReduceClient this ^com.amazonaws.services.elasticmapreduce.model.DescribeJobFlowsRequest request]
    (-> this (.describeJobFlows request)))
  (^com.amazonaws.services.elasticmapreduce.model.DescribeJobFlowsResult [^AmazonElasticMapReduceClient this]
    (-> this (.describeJobFlows))))

(defn create-security-configuration
  "Creates a security configuration, which is stored in the service and can be specified when a cluster is created.

  request - `com.amazonaws.services.elasticmapreduce.model.CreateSecurityConfigurationRequest`

  returns: Result of the CreateSecurityConfiguration operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.CreateSecurityConfigurationResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerException - This exception occurs when there is an internal failure in the EMR service."
  (^com.amazonaws.services.elasticmapreduce.model.CreateSecurityConfigurationResult [^AmazonElasticMapReduceClient this ^com.amazonaws.services.elasticmapreduce.model.CreateSecurityConfigurationRequest request]
    (-> this (.createSecurityConfiguration request))))

(defn shutdown
  "Description copied from class: AmazonWebServiceClient"
  ([^AmazonElasticMapReduceClient this]
    (-> this (.shutdown))))

(defn add-instance-groups
  "Adds one or more instance groups to a running cluster.

  request - `com.amazonaws.services.elasticmapreduce.model.AddInstanceGroupsRequest`

  returns: Result of the AddInstanceGroups operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.AddInstanceGroupsResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerErrorException - Indicates that an error occurred while processing the request and that the request was not completed."
  (^com.amazonaws.services.elasticmapreduce.model.AddInstanceGroupsResult [^AmazonElasticMapReduceClient this ^com.amazonaws.services.elasticmapreduce.model.AddInstanceGroupsRequest request]
    (-> this (.addInstanceGroups request))))

(defn list-instance-fleets
  "Lists all available details about the instance fleets in a cluster.



   The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x
   versions.

  request - `com.amazonaws.services.elasticmapreduce.model.ListInstanceFleetsRequest`

  returns: Result of the ListInstanceFleets operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.ListInstanceFleetsResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerException - This exception occurs when there is an internal failure in the EMR service."
  (^com.amazonaws.services.elasticmapreduce.model.ListInstanceFleetsResult [^AmazonElasticMapReduceClient this ^com.amazonaws.services.elasticmapreduce.model.ListInstanceFleetsRequest request]
    (-> this (.listInstanceFleets request))))

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

  request - `com.amazonaws.services.elasticmapreduce.model.AddJobFlowStepsRequest`

  returns: Result of the AddJobFlowSteps operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.AddJobFlowStepsResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerErrorException - Indicates that an error occurred while processing the request and that the request was not completed."
  (^com.amazonaws.services.elasticmapreduce.model.AddJobFlowStepsResult [^AmazonElasticMapReduceClient this ^com.amazonaws.services.elasticmapreduce.model.AddJobFlowStepsRequest request]
    (-> this (.addJobFlowSteps request))))

(defn list-security-configurations
  "Lists all the security configurations visible to this account, providing their creation dates and times, and
   their names. This call returns a maximum of 50 clusters per call, but returns a marker to track the paging of the
   cluster list across multiple ListSecurityConfigurations calls.

  request - `com.amazonaws.services.elasticmapreduce.model.ListSecurityConfigurationsRequest`

  returns: Result of the ListSecurityConfigurations operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.ListSecurityConfigurationsResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerException - This exception occurs when there is an internal failure in the EMR service."
  (^com.amazonaws.services.elasticmapreduce.model.ListSecurityConfigurationsResult [^AmazonElasticMapReduceClient this ^com.amazonaws.services.elasticmapreduce.model.ListSecurityConfigurationsRequest request]
    (-> this (.listSecurityConfigurations request))))

(defn list-bootstrap-actions
  "Provides information about the bootstrap actions associated with a cluster.

  request - `com.amazonaws.services.elasticmapreduce.model.ListBootstrapActionsRequest`

  returns: Result of the ListBootstrapActions operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.ListBootstrapActionsResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerException - This exception occurs when there is an internal failure in the EMR service."
  (^com.amazonaws.services.elasticmapreduce.model.ListBootstrapActionsResult [^AmazonElasticMapReduceClient this ^com.amazonaws.services.elasticmapreduce.model.ListBootstrapActionsRequest request]
    (-> this (.listBootstrapActions request))))

(defn list-steps
  "Provides a list of steps for the cluster in reverse order unless you specify stepIds with the request.

  request - `com.amazonaws.services.elasticmapreduce.model.ListStepsRequest`

  returns: Result of the ListSteps operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.ListStepsResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerException - This exception occurs when there is an internal failure in the EMR service."
  (^com.amazonaws.services.elasticmapreduce.model.ListStepsResult [^AmazonElasticMapReduceClient this ^com.amazonaws.services.elasticmapreduce.model.ListStepsRequest request]
    (-> this (.listSteps request))))

(defn terminate-job-flows
  "TerminateJobFlows shuts a list of clusters (job flows) down. When a job flow is shut down, any step not yet
   completed is canceled and the EC2 instances on which the cluster is running are stopped. Any log files not
   already saved are uploaded to Amazon S3 if a LogUri was specified when the cluster was created.


   The maximum number of clusters allowed is 10. The call to TerminateJobFlows is asynchronous.
   Depending on the configuration of the cluster, it may take up to 1-5 minutes for the cluster to completely
   terminate and release allocated resources, such as Amazon EC2 instances.

  request - `com.amazonaws.services.elasticmapreduce.model.TerminateJobFlowsRequest`

  returns: Result of the TerminateJobFlows operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.TerminateJobFlowsResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerErrorException - Indicates that an error occurred while processing the request and that the request was not completed."
  (^com.amazonaws.services.elasticmapreduce.model.TerminateJobFlowsResult [^AmazonElasticMapReduceClient this ^com.amazonaws.services.elasticmapreduce.model.TerminateJobFlowsRequest request]
    (-> this (.terminateJobFlows request))))

(defn modify-instance-groups
  "ModifyInstanceGroups modifies the number of nodes and configuration settings of an instance group. The input
   parameters include the new target instance count for the group and the instance group ID. The call will either
   succeed or fail atomically.

  request - `com.amazonaws.services.elasticmapreduce.model.ModifyInstanceGroupsRequest`

  returns: Result of the ModifyInstanceGroups operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.ModifyInstanceGroupsResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerErrorException - Indicates that an error occurred while processing the request and that the request was not completed."
  (^com.amazonaws.services.elasticmapreduce.model.ModifyInstanceGroupsResult [^AmazonElasticMapReduceClient this ^com.amazonaws.services.elasticmapreduce.model.ModifyInstanceGroupsRequest request]
    (-> this (.modifyInstanceGroups request)))
  (^com.amazonaws.services.elasticmapreduce.model.ModifyInstanceGroupsResult [^AmazonElasticMapReduceClient this]
    (-> this (.modifyInstanceGroups))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonElasticMapReduceClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn put-auto-scaling-policy
  "Creates or updates an automatic scaling policy for a core instance group or task instance group in an Amazon EMR
   cluster. The automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances
   in response to the value of a CloudWatch metric.

  request - `com.amazonaws.services.elasticmapreduce.model.PutAutoScalingPolicyRequest`

  returns: Result of the PutAutoScalingPolicy operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.PutAutoScalingPolicyResult`"
  (^com.amazonaws.services.elasticmapreduce.model.PutAutoScalingPolicyResult [^AmazonElasticMapReduceClient this ^com.amazonaws.services.elasticmapreduce.model.PutAutoScalingPolicyRequest request]
    (-> this (.putAutoScalingPolicy request))))

(defn cancel-steps
  "Cancels a pending step or steps in a running cluster. Available only in Amazon EMR versions 4.8.0 and later,
   excluding version 5.0.0. A maximum of 256 steps are allowed in each CancelSteps request. CancelSteps is
   idempotent but asynchronous; it does not guarantee a step will be canceled, even if the request is successfully
   submitted. You can only cancel steps that are in a PENDING state.

  request - `com.amazonaws.services.elasticmapreduce.model.CancelStepsRequest`

  returns: Result of the CancelSteps operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.CancelStepsResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerErrorException - Indicates that an error occurred while processing the request and that the request was not completed."
  (^com.amazonaws.services.elasticmapreduce.model.CancelStepsResult [^AmazonElasticMapReduceClient this ^com.amazonaws.services.elasticmapreduce.model.CancelStepsRequest request]
    (-> this (.cancelSteps request))))

(defn list-clusters
  "Provides the status of all clusters visible to this AWS account. Allows you to filter the list of clusters based
   on certain criteria; for example, filtering by cluster creation date and time or by status. This call returns a
   maximum of 50 clusters per call, but returns a marker to track the paging of the cluster list across multiple
   ListClusters calls.

  request - `com.amazonaws.services.elasticmapreduce.model.ListClustersRequest`

  returns: Result of the ListClusters operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.ListClustersResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerException - This exception occurs when there is an internal failure in the EMR service."
  (^com.amazonaws.services.elasticmapreduce.model.ListClustersResult [^AmazonElasticMapReduceClient this ^com.amazonaws.services.elasticmapreduce.model.ListClustersRequest request]
    (-> this (.listClusters request)))
  (^com.amazonaws.services.elasticmapreduce.model.ListClustersResult [^AmazonElasticMapReduceClient this]
    (-> this (.listClusters))))

(defn describe-step
  "Provides more detail about the cluster step.

  request - `com.amazonaws.services.elasticmapreduce.model.DescribeStepRequest`

  returns: Result of the DescribeStep operation returned by the service. - `com.amazonaws.services.elasticmapreduce.model.DescribeStepResult`

  throws: com.amazonaws.services.elasticmapreduce.model.InternalServerException - This exception occurs when there is an internal failure in the EMR service."
  (^com.amazonaws.services.elasticmapreduce.model.DescribeStepResult [^AmazonElasticMapReduceClient this ^com.amazonaws.services.elasticmapreduce.model.DescribeStepRequest request]
    (-> this (.describeStep request))))

