(ns com.amazonaws.services.redshift.AmazonRedshiftClient
  "Client for accessing Amazon Redshift. All service calls made using this client are blocking, and will not return
  until the service call completes.

  Amazon Redshift

  Overview


  This is an interface reference for Amazon Redshift. It contains documentation for one of the programming or command
  line interfaces you can use to manage Amazon Redshift clusters. Note that Amazon Redshift is asynchronous, which
  means that some interfaces may require techniques, such as polling or asynchronous callback handlers, to determine
  when a command has been applied. In this reference, the parameter descriptions indicate whether a change is applied
  immediately, on the next instance reboot, or during the next maintenance window. For a summary of the Amazon Redshift
  cluster management interfaces, go to Using the Amazon Redshift Management
  Interfaces.


  Amazon Redshift manages all the work of setting up, operating, and scaling a data warehouse: provisioning capacity,
  monitoring and backing up the cluster, and applying patches and upgrades to the Amazon Redshift engine. You can focus
  on using your data to acquire new insights for your business and customers.


  If you are a first-time user of Amazon Redshift, we recommend that you begin by reading the Amazon Redshift Getting Started
  Guide.


  If you are a database developer, the Amazon
  Redshift Database Developer Guide explains how to design, build, query, and maintain the databases that make up
  your data warehouse."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.redshift AmazonRedshiftClient]))

(defn ->amazon-redshift-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to Amazon Redshift (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AmazonRedshiftClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AmazonRedshiftClient aws-credentials-provider client-configuration request-metric-collector))
  (^AmazonRedshiftClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonRedshiftClient aws-credentials client-configuration))
  (^AmazonRedshiftClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonRedshiftClient client-configuration))
  (^AmazonRedshiftClient []
    (new AmazonRedshiftClient )))

(defn *builder
  "returns: `com.amazonaws.services.redshift.AmazonRedshiftClientBuilder`"
  (^com.amazonaws.services.redshift.AmazonRedshiftClientBuilder []
    (AmazonRedshiftClient/builder )))

(defn delete-tags
  "Deletes a tag or tags from a resource. You must provide the ARN of the resource from which you want to delete the
   tag or tags.

  request - `com.amazonaws.services.redshift.model.DeleteTagsRequest`

  returns: Result of the DeleteTags operation returned by the service. - `com.amazonaws.services.redshift.model.DeleteTagsResult`

  throws: com.amazonaws.services.redshift.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.redshift.model.DeleteTagsResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.DeleteTagsRequest request]
    (-> this (.deleteTags request))))

(defn modify-cluster
  "Modifies the settings for a cluster. For example, you can add another security or parameter group, update the
   preferred maintenance window, or change the master user password. Resetting a cluster password or modifying the
   security groups associated with a cluster do not need a reboot. However, modifying a parameter group requires a
   reboot for parameters to take effect. For more information about managing clusters, go to Amazon Redshift Clusters
   in the Amazon Redshift Cluster Management Guide.


   You can also change node type and the number of nodes to scale up or down the cluster. When resizing a cluster,
   you must specify both the number of nodes and the node type even if one of the parameters does not change.

  request - `com.amazonaws.services.redshift.model.ModifyClusterRequest`

  returns: Result of the ModifyCluster operation returned by the service. - `com.amazonaws.services.redshift.model.Cluster`

  throws: com.amazonaws.services.redshift.model.InvalidElasticIpException - The Elastic IP (EIP) is invalid or cannot be found."
  (^com.amazonaws.services.redshift.model.Cluster [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.ModifyClusterRequest request]
    (-> this (.modifyCluster request))))

(defn reset-cluster-parameter-group
  "Sets one or more parameters of the specified parameter group to their default values and sets the source values
   of the parameters to \"engine-default\". To reset the entire parameter group specify the ResetAllParameters
   parameter. For parameter changes to take effect you must reboot any associated clusters.

  request - `com.amazonaws.services.redshift.model.ResetClusterParameterGroupRequest`

  returns: Result of the ResetClusterParameterGroup operation returned by the service. - `com.amazonaws.services.redshift.model.ResetClusterParameterGroupResult`

  throws: com.amazonaws.services.redshift.model.InvalidClusterParameterGroupStateException - The cluster parameter group action can not be completed because another task is in progress that involves the parameter group. Wait a few moments and try the operation again."
  (^com.amazonaws.services.redshift.model.ResetClusterParameterGroupResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.ResetClusterParameterGroupRequest request]
    (-> this (.resetClusterParameterGroup request))))

(defn create-snapshot-schedule
  "Creates a new snapshot schedule.

  request - `com.amazonaws.services.redshift.model.CreateSnapshotScheduleRequest`

  returns: Result of the CreateSnapshotSchedule operation returned by the service. - `com.amazonaws.services.redshift.model.CreateSnapshotScheduleResult`

  throws: com.amazonaws.services.redshift.model.SnapshotScheduleAlreadyExistsException - The specified snapshot schedule already exists."
  (^com.amazonaws.services.redshift.model.CreateSnapshotScheduleResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.CreateSnapshotScheduleRequest request]
    (-> this (.createSnapshotSchedule request))))

(defn modify-cluster-parameter-group
  "Modifies the parameters of a parameter group.


   For more information about parameters and parameter groups, go to Amazon Redshift
   Parameter Groups in the Amazon Redshift Cluster Management Guide.

  request - `com.amazonaws.services.redshift.model.ModifyClusterParameterGroupRequest`

  returns: Result of the ModifyClusterParameterGroup operation returned by the service. - `com.amazonaws.services.redshift.model.ModifyClusterParameterGroupResult`

  throws: com.amazonaws.services.redshift.model.ClusterParameterGroupNotFoundException - The parameter group name does not refer to an existing parameter group."
  (^com.amazonaws.services.redshift.model.ModifyClusterParameterGroupResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.ModifyClusterParameterGroupRequest request]
    (-> this (.modifyClusterParameterGroup request))))

(defn describe-tags
  "Returns a list of tags. You can return tags from a specific resource by specifying an ARN, or you can return all
   tags for a given type of resource, such as clusters, snapshots, and so on.


   The following are limitations for DescribeTags:




   You cannot specify an ARN and a resource-type value together in the same request.




   You cannot use the MaxRecords and Marker parameters together with the ARN parameter.




   The MaxRecords parameter can be a range from 10 to 50 results to return in a request.




   If you specify both tag keys and tag values in the same request, Amazon Redshift returns all resources that match
   any combination of the specified keys and values. For example, if you have owner and
   environment for tag keys, and admin and test for tag values, all resources
   that have any combination of those values are returned.


   If both tag keys and values are omitted from the request, resources are returned regardless of whether they have
   tag keys or values associated with them.

  request - `com.amazonaws.services.redshift.model.DescribeTagsRequest`

  returns: Result of the DescribeTags operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeTagsResult`

  throws: com.amazonaws.services.redshift.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.redshift.model.DescribeTagsResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.DescribeTagsRequest request]
    (-> this (.describeTags request)))
  (^com.amazonaws.services.redshift.model.DescribeTagsResult [^AmazonRedshiftClient this]
    (-> this (.describeTags))))

(defn modify-cluster-maintenance
  "Modifies the maintenance settings of a cluster. For example, you can defer a maintenance window. You can also
   update or cancel a deferment.

  request - `com.amazonaws.services.redshift.model.ModifyClusterMaintenanceRequest`

  returns: Result of the ModifyClusterMaintenance operation returned by the service. - `com.amazonaws.services.redshift.model.Cluster`

  throws: com.amazonaws.services.redshift.model.ClusterNotFoundException - The ClusterIdentifier parameter does not refer to an existing cluster."
  (^com.amazonaws.services.redshift.model.Cluster [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.ModifyClusterMaintenanceRequest request]
    (-> this (.modifyClusterMaintenance request))))

(defn copy-cluster-snapshot
  "Copies the specified automated cluster snapshot to a new manual cluster snapshot. The source must be an automated
   snapshot and it must be in the available state.


   When you delete a cluster, Amazon Redshift deletes any automated snapshots of the cluster. Also, when the
   retention period of the snapshot expires, Amazon Redshift automatically deletes it. If you want to keep an
   automated snapshot for a longer period, you can make a manual copy of the snapshot. Manual snapshots are retained
   until you delete them.


   For more information about working with snapshots, go to Amazon Redshift Snapshots
   in the Amazon Redshift Cluster Management Guide.

  request - `com.amazonaws.services.redshift.model.CopyClusterSnapshotRequest`

  returns: Result of the CopyClusterSnapshot operation returned by the service. - `com.amazonaws.services.redshift.model.Snapshot`

  throws: com.amazonaws.services.redshift.model.ClusterSnapshotAlreadyExistsException - The value specified as a snapshot identifier is already used by an existing snapshot."
  (^com.amazonaws.services.redshift.model.Snapshot [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.CopyClusterSnapshotRequest request]
    (-> this (.copyClusterSnapshot request))))

(defn create-event-subscription
  "Creates an Amazon Redshift event notification subscription. This action requires an ARN (Amazon Resource Name) of
   an Amazon SNS topic created by either the Amazon Redshift console, the Amazon SNS console, or the Amazon SNS API.
   To obtain an ARN with Amazon SNS, you must create a topic in Amazon SNS and subscribe to the topic. The ARN is
   displayed in the SNS console.


   You can specify the source type, and lists of Amazon Redshift source IDs, event categories, and event severities.
   Notifications will be sent for all events you want that match those criteria. For example, you can specify source
   type = cluster, source ID = my-cluster-1 and mycluster2, event categories = Availability, Backup, and severity =
   ERROR. The subscription will only send notifications for those ERROR events in the Availability and Backup
   categories for the specified clusters.


   If you specify both the source type and source IDs, such as source type = cluster and source identifier =
   my-cluster-1, notifications will be sent for all the cluster events for my-cluster-1. If you specify a source
   type but do not specify a source identifier, you will receive notice of the events for the objects of that type
   in your AWS account. If you do not specify either the SourceType nor the SourceIdentifier, you will be notified
   of events generated from all Amazon Redshift sources belonging to your AWS account. You must specify a source
   type if you specify a source ID.

  request - `com.amazonaws.services.redshift.model.CreateEventSubscriptionRequest`

  returns: Result of the CreateEventSubscription operation returned by the service. - `com.amazonaws.services.redshift.model.EventSubscription`

  throws: com.amazonaws.services.redshift.model.TagLimitExceededException - You have exceeded the number of tags allowed."
  (^com.amazonaws.services.redshift.model.EventSubscription [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.CreateEventSubscriptionRequest request]
    (-> this (.createEventSubscription request))))

(defn waiters
  "returns: `com.amazonaws.services.redshift.waiters.AmazonRedshiftWaiters`"
  (^com.amazonaws.services.redshift.waiters.AmazonRedshiftWaiters [^AmazonRedshiftClient this]
    (-> this (.waiters))))

(defn describe-event-subscriptions
  "Lists descriptions of all the Amazon Redshift event notification subscriptions for a customer account. If you
   specify a subscription name, lists the description for that subscription.


   If you specify both tag keys and tag values in the same request, Amazon Redshift returns all event notification
   subscriptions that match any combination of the specified keys and values. For example, if you have
   owner and environment for tag keys, and admin and test for
   tag values, all subscriptions that have any combination of those values are returned.


   If both tag keys and values are omitted from the request, subscriptions are returned regardless of whether they
   have tag keys or values associated with them.

  request - `com.amazonaws.services.redshift.model.DescribeEventSubscriptionsRequest`

  returns: Result of the DescribeEventSubscriptions operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeEventSubscriptionsResult`

  throws: com.amazonaws.services.redshift.model.SubscriptionNotFoundException - An Amazon Redshift event notification subscription with the specified name does not exist."
  (^com.amazonaws.services.redshift.model.DescribeEventSubscriptionsResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.DescribeEventSubscriptionsRequest request]
    (-> this (.describeEventSubscriptions request)))
  (^com.amazonaws.services.redshift.model.DescribeEventSubscriptionsResult [^AmazonRedshiftClient this]
    (-> this (.describeEventSubscriptions))))

(defn enable-snapshot-copy
  "Enables the automatic copy of snapshots from one region to another region for a specified cluster.

  request - `com.amazonaws.services.redshift.model.EnableSnapshotCopyRequest`

  returns: Result of the EnableSnapshotCopy operation returned by the service. - `com.amazonaws.services.redshift.model.Cluster`

  throws: com.amazonaws.services.redshift.model.UnknownSnapshotCopyRegionException - The specified region is incorrect or does not exist."
  (^com.amazonaws.services.redshift.model.Cluster [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.EnableSnapshotCopyRequest request]
    (-> this (.enableSnapshotCopy request))))

(defn describe-snapshot-schedules
  "Returns a list of snapshot schedules.

  request - `com.amazonaws.services.redshift.model.DescribeSnapshotSchedulesRequest`

  returns: Result of the DescribeSnapshotSchedules operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeSnapshotSchedulesResult`"
  (^com.amazonaws.services.redshift.model.DescribeSnapshotSchedulesResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.DescribeSnapshotSchedulesRequest request]
    (-> this (.describeSnapshotSchedules request))))

(defn authorize-snapshot-access
  "Authorizes the specified AWS customer account to restore the specified snapshot.


   For more information about working with snapshots, go to Amazon Redshift Snapshots
   in the Amazon Redshift Cluster Management Guide.

  request - `com.amazonaws.services.redshift.model.AuthorizeSnapshotAccessRequest`

  returns: Result of the AuthorizeSnapshotAccess operation returned by the service. - `com.amazonaws.services.redshift.model.Snapshot`

  throws: com.amazonaws.services.redshift.model.ClusterSnapshotNotFoundException - The snapshot identifier does not refer to an existing cluster snapshot."
  (^com.amazonaws.services.redshift.model.Snapshot [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.AuthorizeSnapshotAccessRequest request]
    (-> this (.authorizeSnapshotAccess request))))

(defn create-hsm-configuration
  "Creates an HSM configuration that contains the information required by an Amazon Redshift cluster to store and
   use database encryption keys in a Hardware Security Module (HSM). After creating the HSM configuration, you can
   specify it as a parameter when creating a cluster. The cluster will then store its encryption keys in the HSM.


   In addition to creating an HSM configuration, you must also create an HSM client certificate. For more
   information, go to Hardware
   Security Modules in the Amazon Redshift Cluster Management Guide.

  request - `com.amazonaws.services.redshift.model.CreateHsmConfigurationRequest`

  returns: Result of the CreateHsmConfiguration operation returned by the service. - `com.amazonaws.services.redshift.model.HsmConfiguration`

  throws: com.amazonaws.services.redshift.model.HsmConfigurationAlreadyExistsException - There is already an existing Amazon Redshift HSM configuration with the specified identifier."
  (^com.amazonaws.services.redshift.model.HsmConfiguration [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.CreateHsmConfigurationRequest request]
    (-> this (.createHsmConfiguration request))))

(defn enable-logging
  "Starts logging information, such as queries and connection attempts, for the specified Amazon Redshift cluster.

  request - `com.amazonaws.services.redshift.model.EnableLoggingRequest`

  returns: Result of the EnableLogging operation returned by the service. - `com.amazonaws.services.redshift.model.EnableLoggingResult`

  throws: com.amazonaws.services.redshift.model.ClusterNotFoundException - The ClusterIdentifier parameter does not refer to an existing cluster."
  (^com.amazonaws.services.redshift.model.EnableLoggingResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.EnableLoggingRequest request]
    (-> this (.enableLogging request))))

(defn modify-cluster-iam-roles
  "Modifies the list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access
   other AWS services.


   A cluster can have up to 10 IAM roles associated at any time.

  request - `com.amazonaws.services.redshift.model.ModifyClusterIamRolesRequest`

  returns: Result of the ModifyClusterIamRoles operation returned by the service. - `com.amazonaws.services.redshift.model.Cluster`

  throws: com.amazonaws.services.redshift.model.InvalidClusterStateException - The specified cluster is not in the available state."
  (^com.amazonaws.services.redshift.model.Cluster [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.ModifyClusterIamRolesRequest request]
    (-> this (.modifyClusterIamRoles request))))

(defn create-cluster-snapshot
  "Creates a manual snapshot of the specified cluster. The cluster must be in the available state.


   For more information about working with snapshots, go to Amazon Redshift Snapshots
   in the Amazon Redshift Cluster Management Guide.

  request - `com.amazonaws.services.redshift.model.CreateClusterSnapshotRequest`

  returns: Result of the CreateClusterSnapshot operation returned by the service. - `com.amazonaws.services.redshift.model.Snapshot`

  throws: com.amazonaws.services.redshift.model.ClusterSnapshotAlreadyExistsException - The value specified as a snapshot identifier is already used by an existing snapshot."
  (^com.amazonaws.services.redshift.model.Snapshot [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.CreateClusterSnapshotRequest request]
    (-> this (.createClusterSnapshot request))))

(defn describe-reserved-nodes
  "Returns the descriptions of the reserved nodes.

  request - `com.amazonaws.services.redshift.model.DescribeReservedNodesRequest`

  returns: Result of the DescribeReservedNodes operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeReservedNodesResult`

  throws: com.amazonaws.services.redshift.model.ReservedNodeNotFoundException - The specified reserved compute node not found."
  (^com.amazonaws.services.redshift.model.DescribeReservedNodesResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.DescribeReservedNodesRequest request]
    (-> this (.describeReservedNodes request)))
  (^com.amazonaws.services.redshift.model.DescribeReservedNodesResult [^AmazonRedshiftClient this]
    (-> this (.describeReservedNodes))))

(defn describe-cluster-versions
  "Returns descriptions of the available Amazon Redshift cluster versions. You can call this operation even before
   creating any clusters to learn more about the Amazon Redshift versions. For more information about managing
   clusters, go to Amazon
   Redshift Clusters in the Amazon Redshift Cluster Management Guide.

  request - `com.amazonaws.services.redshift.model.DescribeClusterVersionsRequest`

  returns: Result of the DescribeClusterVersions operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeClusterVersionsResult`"
  (^com.amazonaws.services.redshift.model.DescribeClusterVersionsResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.DescribeClusterVersionsRequest request]
    (-> this (.describeClusterVersions request)))
  (^com.amazonaws.services.redshift.model.DescribeClusterVersionsResult [^AmazonRedshiftClient this]
    (-> this (.describeClusterVersions))))

(defn describe-orderable-cluster-options
  "Returns a list of orderable cluster options. Before you create a new cluster you can use this operation to find
   what options are available, such as the EC2 Availability Zones (AZ) in the specific AWS Region that you can
   specify, and the node types you can request. The node types differ by available storage, memory, CPU and price.
   With the cost involved you might want to obtain a list of cluster options in the specific region and specify
   values when creating a cluster. For more information about managing clusters, go to Amazon Redshift Clusters
   in the Amazon Redshift Cluster Management Guide.

  request - `com.amazonaws.services.redshift.model.DescribeOrderableClusterOptionsRequest`

  returns: Result of the DescribeOrderableClusterOptions operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeOrderableClusterOptionsResult`"
  (^com.amazonaws.services.redshift.model.DescribeOrderableClusterOptionsResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.DescribeOrderableClusterOptionsRequest request]
    (-> this (.describeOrderableClusterOptions request)))
  (^com.amazonaws.services.redshift.model.DescribeOrderableClusterOptionsResult [^AmazonRedshiftClient this]
    (-> this (.describeOrderableClusterOptions))))

(defn batch-modify-cluster-snapshots
  "Modifies the settings for a list of snapshots.

  request - `com.amazonaws.services.redshift.model.BatchModifyClusterSnapshotsRequest`

  returns: Result of the BatchModifyClusterSnapshots operation returned by the service. - `com.amazonaws.services.redshift.model.BatchModifyClusterSnapshotsResult`

  throws: com.amazonaws.services.redshift.model.InvalidRetentionPeriodException - The retention period specified is either in the past or is not a valid value. The value must be either -1 or an integer between 1 and 3,653."
  (^com.amazonaws.services.redshift.model.BatchModifyClusterSnapshotsResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.BatchModifyClusterSnapshotsRequest request]
    (-> this (.batchModifyClusterSnapshots request))))

(defn delete-snapshot-copy-grant
  "Deletes the specified snapshot copy grant.

  request - `com.amazonaws.services.redshift.model.DeleteSnapshotCopyGrantRequest`

  returns: Result of the DeleteSnapshotCopyGrant operation returned by the service. - `com.amazonaws.services.redshift.model.DeleteSnapshotCopyGrantResult`

  throws: com.amazonaws.services.redshift.model.InvalidSnapshotCopyGrantStateException - The snapshot copy grant can't be deleted because it is used by one or more clusters."
  (^com.amazonaws.services.redshift.model.DeleteSnapshotCopyGrantResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.DeleteSnapshotCopyGrantRequest request]
    (-> this (.deleteSnapshotCopyGrant request))))

(defn describe-table-restore-status
  "Lists the status of one or more table restore requests made using the RestoreTableFromClusterSnapshot API
   action. If you don't specify a value for the TableRestoreRequestId parameter, then
   DescribeTableRestoreStatus returns the status of all table restore requests ordered by the date and
   time of the request in ascending order. Otherwise DescribeTableRestoreStatus returns the status of
   the table specified by TableRestoreRequestId.

  request - `com.amazonaws.services.redshift.model.DescribeTableRestoreStatusRequest`

  returns: Result of the DescribeTableRestoreStatus operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeTableRestoreStatusResult`

  throws: com.amazonaws.services.redshift.model.TableRestoreNotFoundException - The specified TableRestoreRequestId value was not found."
  (^com.amazonaws.services.redshift.model.DescribeTableRestoreStatusResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.DescribeTableRestoreStatusRequest request]
    (-> this (.describeTableRestoreStatus request)))
  (^com.amazonaws.services.redshift.model.DescribeTableRestoreStatusResult [^AmazonRedshiftClient this]
    (-> this (.describeTableRestoreStatus))))

(defn describe-hsm-client-certificates
  "Returns information about the specified HSM client certificate. If no certificate ID is specified, returns
   information about all the HSM certificates owned by your AWS customer account.


   If you specify both tag keys and tag values in the same request, Amazon Redshift returns all HSM client
   certificates that match any combination of the specified keys and values. For example, if you have
   owner and environment for tag keys, and admin and test for
   tag values, all HSM client certificates that have any combination of those values are returned.


   If both tag keys and values are omitted from the request, HSM client certificates are returned regardless of
   whether they have tag keys or values associated with them.

  request - `com.amazonaws.services.redshift.model.DescribeHsmClientCertificatesRequest`

  returns: Result of the DescribeHsmClientCertificates operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeHsmClientCertificatesResult`

  throws: com.amazonaws.services.redshift.model.HsmClientCertificateNotFoundException - There is no Amazon Redshift HSM client certificate with the specified identifier."
  (^com.amazonaws.services.redshift.model.DescribeHsmClientCertificatesResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.DescribeHsmClientCertificatesRequest request]
    (-> this (.describeHsmClientCertificates request)))
  (^com.amazonaws.services.redshift.model.DescribeHsmClientCertificatesResult [^AmazonRedshiftClient this]
    (-> this (.describeHsmClientCertificates))))

(defn describe-default-cluster-parameters
  "Returns a list of parameter settings for the specified parameter group family.


   For more information about parameters and parameter groups, go to Amazon Redshift
   Parameter Groups in the Amazon Redshift Cluster Management Guide.

  request - `com.amazonaws.services.redshift.model.DescribeDefaultClusterParametersRequest`

  returns: Result of the DescribeDefaultClusterParameters operation returned by the service. - `com.amazonaws.services.redshift.model.DefaultClusterParameters`"
  (^com.amazonaws.services.redshift.model.DefaultClusterParameters [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.DescribeDefaultClusterParametersRequest request]
    (-> this (.describeDefaultClusterParameters request))))

(defn authorize-cluster-security-group-ingress
  "Adds an inbound (ingress) rule to an Amazon Redshift security group. Depending on whether the application
   accessing your cluster is running on the Internet or an Amazon EC2 instance, you can authorize inbound access to
   either a Classless Interdomain Routing (CIDR)/Internet Protocol (IP) range or to an Amazon EC2 security group.
   You can add as many as 20 ingress rules to an Amazon Redshift security group.


   If you authorize access to an Amazon EC2 security group, specify EC2SecurityGroupName and
   EC2SecurityGroupOwnerId. The Amazon EC2 security group and Amazon Redshift cluster must be in the same AWS
   Region.


   If you authorize access to a CIDR/IP address range, specify CIDRIP. For an overview of CIDR blocks, see
   the Wikipedia article on Classless
   Inter-Domain Routing.


   You must also associate the security group with a cluster so that clients running on these IP addresses or the
   EC2 instance are authorized to connect to the cluster. For information about managing security groups, go to Working with Security
   Groups in the Amazon Redshift Cluster Management Guide.

  request - `com.amazonaws.services.redshift.model.AuthorizeClusterSecurityGroupIngressRequest`

  returns: Result of the AuthorizeClusterSecurityGroupIngress operation returned by the service. - `com.amazonaws.services.redshift.model.ClusterSecurityGroup`

  throws: com.amazonaws.services.redshift.model.ClusterSecurityGroupNotFoundException - The cluster security group name does not refer to an existing cluster security group."
  (^com.amazonaws.services.redshift.model.ClusterSecurityGroup [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.AuthorizeClusterSecurityGroupIngressRequest request]
    (-> this (.authorizeClusterSecurityGroupIngress request))))

(defn disable-snapshot-copy
  "Disables the automatic copying of snapshots from one region to another region for a specified cluster.


   If your cluster and its snapshots are encrypted using a customer master key (CMK) from AWS KMS, use
   DeleteSnapshotCopyGrant to delete the grant that grants Amazon Redshift permission to the CMK in the
   destination region.

  request - `com.amazonaws.services.redshift.model.DisableSnapshotCopyRequest`

  returns: Result of the DisableSnapshotCopy operation returned by the service. - `com.amazonaws.services.redshift.model.Cluster`

  throws: com.amazonaws.services.redshift.model.ClusterNotFoundException - The ClusterIdentifier parameter does not refer to an existing cluster."
  (^com.amazonaws.services.redshift.model.Cluster [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.DisableSnapshotCopyRequest request]
    (-> this (.disableSnapshotCopy request))))

(defn delete-snapshot-schedule
  "Deletes a snapshot schedule.

  request - `com.amazonaws.services.redshift.model.DeleteSnapshotScheduleRequest`

  returns: Result of the DeleteSnapshotSchedule operation returned by the service. - `com.amazonaws.services.redshift.model.DeleteSnapshotScheduleResult`

  throws: com.amazonaws.services.redshift.model.InvalidClusterSnapshotScheduleStateException - The cluster snapshot schedule state is not valid."
  (^com.amazonaws.services.redshift.model.DeleteSnapshotScheduleResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.DeleteSnapshotScheduleRequest request]
    (-> this (.deleteSnapshotSchedule request))))

(defn modify-cluster-snapshot-schedule
  "Modifies a snapshot schedule for a cluster.

  request - `com.amazonaws.services.redshift.model.ModifyClusterSnapshotScheduleRequest`

  returns: Result of the ModifyClusterSnapshotSchedule operation returned by the service. - `com.amazonaws.services.redshift.model.ModifyClusterSnapshotScheduleResult`

  throws: com.amazonaws.services.redshift.model.ClusterNotFoundException - The ClusterIdentifier parameter does not refer to an existing cluster."
  (^com.amazonaws.services.redshift.model.ModifyClusterSnapshotScheduleResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.ModifyClusterSnapshotScheduleRequest request]
    (-> this (.modifyClusterSnapshotSchedule request))))

(defn revoke-cluster-security-group-ingress
  "Revokes an ingress rule in an Amazon Redshift security group for a previously authorized IP range or Amazon EC2
   security group. To add an ingress rule, see AuthorizeClusterSecurityGroupIngress. For information about
   managing security groups, go to Amazon Redshift Cluster
   Security Groups in the Amazon Redshift Cluster Management Guide.

  request - `com.amazonaws.services.redshift.model.RevokeClusterSecurityGroupIngressRequest`

  returns: Result of the RevokeClusterSecurityGroupIngress operation returned by the service. - `com.amazonaws.services.redshift.model.ClusterSecurityGroup`

  throws: com.amazonaws.services.redshift.model.ClusterSecurityGroupNotFoundException - The cluster security group name does not refer to an existing cluster security group."
  (^com.amazonaws.services.redshift.model.ClusterSecurityGroup [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.RevokeClusterSecurityGroupIngressRequest request]
    (-> this (.revokeClusterSecurityGroupIngress request))))

(defn modify-cluster-snapshot
  "Modifies the settings for a snapshot.

  request - `com.amazonaws.services.redshift.model.ModifyClusterSnapshotRequest`

  returns: Result of the ModifyClusterSnapshot operation returned by the service. - `com.amazonaws.services.redshift.model.Snapshot`

  throws: com.amazonaws.services.redshift.model.InvalidClusterSnapshotStateException - The specified cluster snapshot is not in the available state, or other accounts are authorized to access the snapshot."
  (^com.amazonaws.services.redshift.model.Snapshot [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.ModifyClusterSnapshotRequest request]
    (-> this (.modifyClusterSnapshot request))))

(defn describe-cluster-parameters
  "Returns a detailed list of parameters contained within the specified Amazon Redshift parameter group. For each
   parameter the response includes information such as parameter name, description, data type, value, whether the
   parameter value is modifiable, and so on.


   You can specify source filter to retrieve parameters of only specific type. For example, to retrieve
   parameters that were modified by a user action such as from ModifyClusterParameterGroup, you can specify
   source equal to user.


   For more information about parameters and parameter groups, go to Amazon Redshift
   Parameter Groups in the Amazon Redshift Cluster Management Guide.

  request - `com.amazonaws.services.redshift.model.DescribeClusterParametersRequest`

  returns: Result of the DescribeClusterParameters operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeClusterParametersResult`

  throws: com.amazonaws.services.redshift.model.ClusterParameterGroupNotFoundException - The parameter group name does not refer to an existing parameter group."
  (^com.amazonaws.services.redshift.model.DescribeClusterParametersResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.DescribeClusterParametersRequest request]
    (-> this (.describeClusterParameters request))))

(defn describe-storage
  "Returns the total amount of snapshot usage and provisioned storage for a user in megabytes.

  request - `com.amazonaws.services.redshift.model.DescribeStorageRequest`

  returns: Result of the DescribeStorage operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeStorageResult`"
  (^com.amazonaws.services.redshift.model.DescribeStorageResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.DescribeStorageRequest request]
    (-> this (.describeStorage request))))

(defn create-cluster-security-group
  "Creates a new Amazon Redshift security group. You use security groups to control access to non-VPC clusters.


   For information about managing security groups, go to Amazon Redshift Cluster
   Security Groups in the Amazon Redshift Cluster Management Guide.

  request - `com.amazonaws.services.redshift.model.CreateClusterSecurityGroupRequest`

  returns: Result of the CreateClusterSecurityGroup operation returned by the service. - `com.amazonaws.services.redshift.model.ClusterSecurityGroup`

  throws: com.amazonaws.services.redshift.model.ClusterSecurityGroupAlreadyExistsException - A cluster security group with the same name already exists."
  (^com.amazonaws.services.redshift.model.ClusterSecurityGroup [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.CreateClusterSecurityGroupRequest request]
    (-> this (.createClusterSecurityGroup request))))

(defn get-reserved-node-exchange-offerings
  "Returns an array of DC2 ReservedNodeOfferings that matches the payment type, term, and usage price of the given
   DC1 reserved node.

  request - `com.amazonaws.services.redshift.model.GetReservedNodeExchangeOfferingsRequest`

  returns: Result of the GetReservedNodeExchangeOfferings operation returned by the service. - `com.amazonaws.services.redshift.model.GetReservedNodeExchangeOfferingsResult`

  throws: com.amazonaws.services.redshift.model.ReservedNodeNotFoundException - The specified reserved compute node not found."
  (^com.amazonaws.services.redshift.model.GetReservedNodeExchangeOfferingsResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.GetReservedNodeExchangeOfferingsRequest request]
    (-> this (.getReservedNodeExchangeOfferings request))))

(defn disable-logging
  "Stops logging information, such as queries and connection attempts, for the specified Amazon Redshift cluster.

  request - `com.amazonaws.services.redshift.model.DisableLoggingRequest`

  returns: Result of the DisableLogging operation returned by the service. - `com.amazonaws.services.redshift.model.DisableLoggingResult`

  throws: com.amazonaws.services.redshift.model.ClusterNotFoundException - The ClusterIdentifier parameter does not refer to an existing cluster."
  (^com.amazonaws.services.redshift.model.DisableLoggingResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.DisableLoggingRequest request]
    (-> this (.disableLogging request))))

(defn modify-cluster-subnet-group
  "Modifies a cluster subnet group to include the specified list of VPC subnets. The operation replaces the existing
   list of subnets with the new list of subnets.

  request - `com.amazonaws.services.redshift.model.ModifyClusterSubnetGroupRequest`

  returns: Result of the ModifyClusterSubnetGroup operation returned by the service. - `com.amazonaws.services.redshift.model.ClusterSubnetGroup`

  throws: com.amazonaws.services.redshift.model.ClusterSubnetGroupNotFoundException - The cluster subnet group name does not refer to an existing cluster subnet group."
  (^com.amazonaws.services.redshift.model.ClusterSubnetGroup [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.ModifyClusterSubnetGroupRequest request]
    (-> this (.modifyClusterSubnetGroup request))))

(defn describe-snapshot-copy-grants
  "Returns a list of snapshot copy grants owned by the AWS account in the destination region.


   For more information about managing snapshot copy grants, go to Amazon Redshift Database
   Encryption in the Amazon Redshift Cluster Management Guide.

  request - `com.amazonaws.services.redshift.model.DescribeSnapshotCopyGrantsRequest`

  returns: Result of the DescribeSnapshotCopyGrants operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeSnapshotCopyGrantsResult`

  throws: com.amazonaws.services.redshift.model.SnapshotCopyGrantNotFoundException - The specified snapshot copy grant can't be found. Make sure that the name is typed correctly and that the grant exists in the destination region."
  (^com.amazonaws.services.redshift.model.DescribeSnapshotCopyGrantsResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.DescribeSnapshotCopyGrantsRequest request]
    (-> this (.describeSnapshotCopyGrants request)))
  (^com.amazonaws.services.redshift.model.DescribeSnapshotCopyGrantsResult [^AmazonRedshiftClient this]
    (-> this (.describeSnapshotCopyGrants))))

(defn delete-cluster-snapshot
  "Deletes the specified manual snapshot. The snapshot must be in the available state, with no other
   users authorized to access the snapshot.


   Unlike automated snapshots, manual snapshots are retained even after you delete your cluster. Amazon Redshift
   does not delete your manual snapshots. You must delete manual snapshot explicitly to avoid getting charged. If
   other accounts are authorized to access the snapshot, you must revoke all of the authorizations before you can
   delete the snapshot.

  request - `com.amazonaws.services.redshift.model.DeleteClusterSnapshotRequest`

  returns: Result of the DeleteClusterSnapshot operation returned by the service. - `com.amazonaws.services.redshift.model.Snapshot`

  throws: com.amazonaws.services.redshift.model.InvalidClusterSnapshotStateException - The specified cluster snapshot is not in the available state, or other accounts are authorized to access the snapshot."
  (^com.amazonaws.services.redshift.model.Snapshot [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.DeleteClusterSnapshotRequest request]
    (-> this (.deleteClusterSnapshot request))))

(defn describe-logging-status
  "Describes whether information, such as queries and connection attempts, is being logged for the specified Amazon
   Redshift cluster.

  request - `com.amazonaws.services.redshift.model.DescribeLoggingStatusRequest`

  returns: Result of the DescribeLoggingStatus operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeLoggingStatusResult`

  throws: com.amazonaws.services.redshift.model.ClusterNotFoundException - The ClusterIdentifier parameter does not refer to an existing cluster."
  (^com.amazonaws.services.redshift.model.DescribeLoggingStatusResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.DescribeLoggingStatusRequest request]
    (-> this (.describeLoggingStatus request))))

(defn describe-resize
  "Returns information about the last resize operation for the specified cluster. If no resize operation has ever
   been initiated for the specified cluster, a HTTP 404 error is returned. If a resize operation was
   initiated and completed, the status of the resize remains as SUCCEEDED until the next resize.


   A resize operation can be requested using ModifyCluster and specifying a different number or type of nodes
   for the cluster.

  request - `com.amazonaws.services.redshift.model.DescribeResizeRequest`

  returns: Result of the DescribeResize operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeResizeResult`

  throws: com.amazonaws.services.redshift.model.ClusterNotFoundException - The ClusterIdentifier parameter does not refer to an existing cluster."
  (^com.amazonaws.services.redshift.model.DescribeResizeResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.DescribeResizeRequest request]
    (-> this (.describeResize request))))

(defn create-tags
  "Adds one or more tags to a specified resource.


   A resource can have up to 50 tags. If you try to create more than 50 tags for a resource, you will receive an
   error and the attempt will fail.


   If you specify a key that already exists for the resource, the value for that key will be updated with the new
   value.

  request - `com.amazonaws.services.redshift.model.CreateTagsRequest`

  returns: Result of the CreateTags operation returned by the service. - `com.amazonaws.services.redshift.model.CreateTagsResult`

  throws: com.amazonaws.services.redshift.model.TagLimitExceededException - You have exceeded the number of tags allowed."
  (^com.amazonaws.services.redshift.model.CreateTagsResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.CreateTagsRequest request]
    (-> this (.createTags request))))

(defn modify-event-subscription
  "Modifies an existing Amazon Redshift event notification subscription.

  request - `com.amazonaws.services.redshift.model.ModifyEventSubscriptionRequest`

  returns: Result of the ModifyEventSubscription operation returned by the service. - `com.amazonaws.services.redshift.model.EventSubscription`

  throws: com.amazonaws.services.redshift.model.SubscriptionCategoryNotFoundException - The value specified for the event category was not one of the allowed values, or it specified a category that does not apply to the specified source type. The allowed values are Configuration, Management, Monitoring, and Security."
  (^com.amazonaws.services.redshift.model.EventSubscription [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.ModifyEventSubscriptionRequest request]
    (-> this (.modifyEventSubscription request))))

(defn create-snapshot-copy-grant
  "Creates a snapshot copy grant that permits Amazon Redshift to use a customer master key (CMK) from AWS Key
   Management Service (AWS KMS) to encrypt copied snapshots in a destination region.


   For more information about managing snapshot copy grants, go to Amazon Redshift Database
   Encryption in the Amazon Redshift Cluster Management Guide.

  request - `com.amazonaws.services.redshift.model.CreateSnapshotCopyGrantRequest`

  returns: Result of the CreateSnapshotCopyGrant operation returned by the service. - `com.amazonaws.services.redshift.model.SnapshotCopyGrant`

  throws: com.amazonaws.services.redshift.model.SnapshotCopyGrantAlreadyExistsException - The snapshot copy grant can't be created because a grant with the same name already exists."
  (^com.amazonaws.services.redshift.model.SnapshotCopyGrant [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.CreateSnapshotCopyGrantRequest request]
    (-> this (.createSnapshotCopyGrant request))))

(defn describe-account-attributes
  "Returns a list of attributes attached to an account

  request - `com.amazonaws.services.redshift.model.DescribeAccountAttributesRequest`

  returns: Result of the DescribeAccountAttributes operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeAccountAttributesResult`"
  (^com.amazonaws.services.redshift.model.DescribeAccountAttributesResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.DescribeAccountAttributesRequest request]
    (-> this (.describeAccountAttributes request))))

(defn shutdown
  "Description copied from class: AmazonWebServiceClient"
  ([^AmazonRedshiftClient this]
    (-> this (.shutdown))))

(defn describe-events
  "Returns events related to clusters, security groups, snapshots, and parameter groups for the past 14 days. Events
   specific to a particular cluster, security group, snapshot or parameter group can be obtained by providing the
   name as a parameter. By default, the past hour of events are returned.

  request - `com.amazonaws.services.redshift.model.DescribeEventsRequest`

  returns: Result of the DescribeEvents operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeEventsResult`"
  (^com.amazonaws.services.redshift.model.DescribeEventsResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.DescribeEventsRequest request]
    (-> this (.describeEvents request)))
  (^com.amazonaws.services.redshift.model.DescribeEventsResult [^AmazonRedshiftClient this]
    (-> this (.describeEvents))))

(defn describe-reserved-node-offerings
  "Returns a list of the available reserved node offerings by Amazon Redshift with their descriptions including the
   node type, the fixed and recurring costs of reserving the node and duration the node will be reserved for you.
   These descriptions help you determine which reserve node offering you want to purchase. You then use the unique
   offering ID in you call to PurchaseReservedNodeOffering to reserve one or more nodes for your Amazon
   Redshift cluster.


   For more information about reserved node offerings, go to Purchasing Reserved
   Nodes in the Amazon Redshift Cluster Management Guide.

  request - `com.amazonaws.services.redshift.model.DescribeReservedNodeOfferingsRequest`

  returns: Result of the DescribeReservedNodeOfferings operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeReservedNodeOfferingsResult`

  throws: com.amazonaws.services.redshift.model.ReservedNodeOfferingNotFoundException - Specified offering does not exist."
  (^com.amazonaws.services.redshift.model.DescribeReservedNodeOfferingsResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.DescribeReservedNodeOfferingsRequest request]
    (-> this (.describeReservedNodeOfferings request)))
  (^com.amazonaws.services.redshift.model.DescribeReservedNodeOfferingsResult [^AmazonRedshiftClient this]
    (-> this (.describeReservedNodeOfferings))))

(defn cancel-resize
  "Cancels a resize operation.

  request - `com.amazonaws.services.redshift.model.CancelResizeRequest`

  returns: Result of the CancelResize operation returned by the service. - `com.amazonaws.services.redshift.model.CancelResizeResult`

  throws: com.amazonaws.services.redshift.model.ClusterNotFoundException - The ClusterIdentifier parameter does not refer to an existing cluster."
  (^com.amazonaws.services.redshift.model.CancelResizeResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.CancelResizeRequest request]
    (-> this (.cancelResize request))))

(defn batch-delete-cluster-snapshots
  "Deletes a set of cluster snapshots.

  request - `com.amazonaws.services.redshift.model.BatchDeleteClusterSnapshotsRequest`

  returns: Result of the BatchDeleteClusterSnapshots operation returned by the service. - `com.amazonaws.services.redshift.model.BatchDeleteClusterSnapshotsResult`

  throws: com.amazonaws.services.redshift.model.BatchDeleteRequestSizeExceededException - The maximum number for a batch delete of snapshots has been reached. The limit is 100."
  (^com.amazonaws.services.redshift.model.BatchDeleteClusterSnapshotsResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.BatchDeleteClusterSnapshotsRequest request]
    (-> this (.batchDeleteClusterSnapshots request))))

(defn delete-hsm-configuration
  "Deletes the specified Amazon Redshift HSM configuration.

  request - `com.amazonaws.services.redshift.model.DeleteHsmConfigurationRequest`

  returns: Result of the DeleteHsmConfiguration operation returned by the service. - `com.amazonaws.services.redshift.model.DeleteHsmConfigurationResult`

  throws: com.amazonaws.services.redshift.model.InvalidHsmConfigurationStateException - The specified HSM configuration is not in the available state, or it is still in use by one or more Amazon Redshift clusters."
  (^com.amazonaws.services.redshift.model.DeleteHsmConfigurationResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.DeleteHsmConfigurationRequest request]
    (-> this (.deleteHsmConfiguration request))))

(defn restore-from-cluster-snapshot
  "Creates a new cluster from a snapshot. By default, Amazon Redshift creates the resulting cluster with the same
   configuration as the original cluster from which the snapshot was created, except that the new cluster is created
   with the default cluster security and parameter groups. After Amazon Redshift creates the cluster, you can use
   the ModifyCluster API to associate a different security group and different parameter group with the
   restored cluster. If you are using a DS node type, you can also choose to change to another DS node type of the
   same size during restore.


   If you restore a cluster into a VPC, you must provide a cluster subnet group where you want the cluster restored.


   For more information about working with snapshots, go to Amazon Redshift Snapshots
   in the Amazon Redshift Cluster Management Guide.

  request - `com.amazonaws.services.redshift.model.RestoreFromClusterSnapshotRequest`

  returns: Result of the RestoreFromClusterSnapshot operation returned by the service. - `com.amazonaws.services.redshift.model.Cluster`

  throws: com.amazonaws.services.redshift.model.InvalidElasticIpException - The Elastic IP (EIP) is invalid or cannot be found."
  (^com.amazonaws.services.redshift.model.Cluster [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.RestoreFromClusterSnapshotRequest request]
    (-> this (.restoreFromClusterSnapshot request))))

(defn modify-snapshot-copy-retention-period
  "Modifies the number of days to retain snapshots in the destination AWS Region after they are copied from the
   source AWS Region. By default, this operation only changes the retention period of copied automated snapshots.
   The retention periods for both new and existing copied automated snapshots are updated with the new retention
   period. You can set the manual option to change only the retention periods of copied manual snapshots. If you set
   this option, only newly copied manual snapshots have the new retention period.

  request - `com.amazonaws.services.redshift.model.ModifySnapshotCopyRetentionPeriodRequest`

  returns: Result of the ModifySnapshotCopyRetentionPeriod operation returned by the service. - `com.amazonaws.services.redshift.model.Cluster`

  throws: com.amazonaws.services.redshift.model.ClusterNotFoundException - The ClusterIdentifier parameter does not refer to an existing cluster."
  (^com.amazonaws.services.redshift.model.Cluster [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.ModifySnapshotCopyRetentionPeriodRequest request]
    (-> this (.modifySnapshotCopyRetentionPeriod request))))

(defn create-hsm-client-certificate
  "Creates an HSM client certificate that an Amazon Redshift cluster will use to connect to the client's HSM in
   order to store and retrieve the keys used to encrypt the cluster databases.


   The command returns a public key, which you must store in the HSM. In addition to creating the HSM certificate,
   you must create an Amazon Redshift HSM configuration that provides a cluster the information needed to store and
   use encryption keys in the HSM. For more information, go to Hardware Security Modules in
   the Amazon Redshift Cluster Management Guide.

  request - `com.amazonaws.services.redshift.model.CreateHsmClientCertificateRequest`

  returns: Result of the CreateHsmClientCertificate operation returned by the service. - `com.amazonaws.services.redshift.model.HsmClientCertificate`

  throws: com.amazonaws.services.redshift.model.HsmClientCertificateAlreadyExistsException - There is already an existing Amazon Redshift HSM client certificate with the specified identifier."
  (^com.amazonaws.services.redshift.model.HsmClientCertificate [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.CreateHsmClientCertificateRequest request]
    (-> this (.createHsmClientCertificate request))))

(defn purchase-reserved-node-offering
  "Allows you to purchase reserved nodes. Amazon Redshift offers a predefined set of reserved node offerings. You
   can purchase one or more of the offerings. You can call the DescribeReservedNodeOfferings API to obtain
   the available reserved node offerings. You can call this API by providing a specific reserved node offering and
   the number of nodes you want to reserve.


   For more information about reserved node offerings, go to Purchasing Reserved
   Nodes in the Amazon Redshift Cluster Management Guide.

  request - `com.amazonaws.services.redshift.model.PurchaseReservedNodeOfferingRequest`

  returns: Result of the PurchaseReservedNodeOffering operation returned by the service. - `com.amazonaws.services.redshift.model.ReservedNode`

  throws: com.amazonaws.services.redshift.model.ReservedNodeOfferingNotFoundException - Specified offering does not exist."
  (^com.amazonaws.services.redshift.model.ReservedNode [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.PurchaseReservedNodeOfferingRequest request]
    (-> this (.purchaseReservedNodeOffering request))))

(defn describe-cluster-subnet-groups
  "Returns one or more cluster subnet group objects, which contain metadata about your cluster subnet groups. By
   default, this operation returns information about all cluster subnet groups that are defined in you AWS account.


   If you specify both tag keys and tag values in the same request, Amazon Redshift returns all subnet groups that
   match any combination of the specified keys and values. For example, if you have owner and
   environment for tag keys, and admin and test for tag values, all subnet
   groups that have any combination of those values are returned.


   If both tag keys and values are omitted from the request, subnet groups are returned regardless of whether they
   have tag keys or values associated with them.

  request - `com.amazonaws.services.redshift.model.DescribeClusterSubnetGroupsRequest`

  returns: Result of the DescribeClusterSubnetGroups operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeClusterSubnetGroupsResult`

  throws: com.amazonaws.services.redshift.model.ClusterSubnetGroupNotFoundException - The cluster subnet group name does not refer to an existing cluster subnet group."
  (^com.amazonaws.services.redshift.model.DescribeClusterSubnetGroupsResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.DescribeClusterSubnetGroupsRequest request]
    (-> this (.describeClusterSubnetGroups request)))
  (^com.amazonaws.services.redshift.model.DescribeClusterSubnetGroupsResult [^AmazonRedshiftClient this]
    (-> this (.describeClusterSubnetGroups))))

(defn rotate-encryption-key
  "Rotates the encryption keys for a cluster.

  request - `com.amazonaws.services.redshift.model.RotateEncryptionKeyRequest`

  returns: Result of the RotateEncryptionKey operation returned by the service. - `com.amazonaws.services.redshift.model.Cluster`

  throws: com.amazonaws.services.redshift.model.ClusterNotFoundException - The ClusterIdentifier parameter does not refer to an existing cluster."
  (^com.amazonaws.services.redshift.model.Cluster [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.RotateEncryptionKeyRequest request]
    (-> this (.rotateEncryptionKey request))))

(defn describe-cluster-security-groups
  "Returns information about Amazon Redshift security groups. If the name of a security group is specified, the
   response will contain only information about only that security group.


   For information about managing security groups, go to Amazon Redshift Cluster
   Security Groups in the Amazon Redshift Cluster Management Guide.


   If you specify both tag keys and tag values in the same request, Amazon Redshift returns all security groups that
   match any combination of the specified keys and values. For example, if you have owner and
   environment for tag keys, and admin and test for tag values, all security
   groups that have any combination of those values are returned.


   If both tag keys and values are omitted from the request, security groups are returned regardless of whether they
   have tag keys or values associated with them.

  request - `com.amazonaws.services.redshift.model.DescribeClusterSecurityGroupsRequest`

  returns: Result of the DescribeClusterSecurityGroups operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeClusterSecurityGroupsResult`

  throws: com.amazonaws.services.redshift.model.ClusterSecurityGroupNotFoundException - The cluster security group name does not refer to an existing cluster security group."
  (^com.amazonaws.services.redshift.model.DescribeClusterSecurityGroupsResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.DescribeClusterSecurityGroupsRequest request]
    (-> this (.describeClusterSecurityGroups request)))
  (^com.amazonaws.services.redshift.model.DescribeClusterSecurityGroupsResult [^AmazonRedshiftClient this]
    (-> this (.describeClusterSecurityGroups))))

(defn modify-snapshot-schedule
  "Modifies a snapshot schedule. Any schedule associated with a cluster is modified asynchronously.

  request - `com.amazonaws.services.redshift.model.ModifySnapshotScheduleRequest`

  returns: Result of the ModifySnapshotSchedule operation returned by the service. - `com.amazonaws.services.redshift.model.ModifySnapshotScheduleResult`

  throws: com.amazonaws.services.redshift.model.InvalidScheduleException - The schedule you submitted isn't valid."
  (^com.amazonaws.services.redshift.model.ModifySnapshotScheduleResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.ModifySnapshotScheduleRequest request]
    (-> this (.modifySnapshotSchedule request))))

(defn describe-event-categories
  "Displays a list of event categories for all event source types, or for a specified source type. For a list of the
   event categories and source types, go to Amazon Redshift
   Event Notifications.

  request - `com.amazonaws.services.redshift.model.DescribeEventCategoriesRequest`

  returns: Result of the DescribeEventCategories operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeEventCategoriesResult`"
  (^com.amazonaws.services.redshift.model.DescribeEventCategoriesResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.DescribeEventCategoriesRequest request]
    (-> this (.describeEventCategories request)))
  (^com.amazonaws.services.redshift.model.DescribeEventCategoriesResult [^AmazonRedshiftClient this]
    (-> this (.describeEventCategories))))

(defn describe-cluster-snapshots
  "Returns one or more snapshot objects, which contain metadata about your cluster snapshots. By default, this
   operation returns information about all snapshots of all clusters that are owned by you AWS customer account. No
   information is returned for snapshots owned by inactive AWS customer accounts.


   If you specify both tag keys and tag values in the same request, Amazon Redshift returns all snapshots that match
   any combination of the specified keys and values. For example, if you have owner and
   environment for tag keys, and admin and test for tag values, all snapshots
   that have any combination of those values are returned. Only snapshots that you own are returned in the response;
   shared snapshots are not returned with the tag key and tag value request parameters.


   If both tag keys and values are omitted from the request, snapshots are returned regardless of whether they have
   tag keys or values associated with them.

  request - `com.amazonaws.services.redshift.model.DescribeClusterSnapshotsRequest`

  returns: Result of the DescribeClusterSnapshots operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeClusterSnapshotsResult`

  throws: com.amazonaws.services.redshift.model.ClusterNotFoundException - The ClusterIdentifier parameter does not refer to an existing cluster."
  (^com.amazonaws.services.redshift.model.DescribeClusterSnapshotsResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.DescribeClusterSnapshotsRequest request]
    (-> this (.describeClusterSnapshots request)))
  (^com.amazonaws.services.redshift.model.DescribeClusterSnapshotsResult [^AmazonRedshiftClient this]
    (-> this (.describeClusterSnapshots))))

(defn create-cluster-parameter-group
  "Creates an Amazon Redshift parameter group.


   Creating parameter groups is independent of creating clusters. You can associate a cluster with a parameter group
   when you create the cluster. You can also associate an existing cluster with a parameter group after the cluster
   is created by using ModifyCluster.


   Parameters in the parameter group define specific behavior that applies to the databases you create on the
   cluster. For more information about parameters and parameter groups, go to Amazon Redshift
   Parameter Groups in the Amazon Redshift Cluster Management Guide.

  request - `com.amazonaws.services.redshift.model.CreateClusterParameterGroupRequest`

  returns: Result of the CreateClusterParameterGroup operation returned by the service. - `com.amazonaws.services.redshift.model.ClusterParameterGroup`

  throws: com.amazonaws.services.redshift.model.ClusterParameterGroupQuotaExceededException - The request would result in the user exceeding the allowed number of cluster parameter groups. For information about increasing your quota, go to Limits in Amazon Redshift in the Amazon Redshift Cluster Management Guide."
  (^com.amazonaws.services.redshift.model.ClusterParameterGroup [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.CreateClusterParameterGroupRequest request]
    (-> this (.createClusterParameterGroup request))))

(defn delete-event-subscription
  "Deletes an Amazon Redshift event notification subscription.

  request - `com.amazonaws.services.redshift.model.DeleteEventSubscriptionRequest`

  returns: Result of the DeleteEventSubscription operation returned by the service. - `com.amazonaws.services.redshift.model.DeleteEventSubscriptionResult`

  throws: com.amazonaws.services.redshift.model.SubscriptionNotFoundException - An Amazon Redshift event notification subscription with the specified name does not exist."
  (^com.amazonaws.services.redshift.model.DeleteEventSubscriptionResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.DeleteEventSubscriptionRequest request]
    (-> this (.deleteEventSubscription request))))

(defn delete-hsm-client-certificate
  "Deletes the specified HSM client certificate.

  request - `com.amazonaws.services.redshift.model.DeleteHsmClientCertificateRequest`

  returns: Result of the DeleteHsmClientCertificate operation returned by the service. - `com.amazonaws.services.redshift.model.DeleteHsmClientCertificateResult`

  throws: com.amazonaws.services.redshift.model.InvalidHsmClientCertificateStateException - The specified HSM client certificate is not in the available state, or it is still in use by one or more Amazon Redshift clusters."
  (^com.amazonaws.services.redshift.model.DeleteHsmClientCertificateResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.DeleteHsmClientCertificateRequest request]
    (-> this (.deleteHsmClientCertificate request))))

(defn describe-cluster-parameter-groups
  "Returns a list of Amazon Redshift parameter groups, including parameter groups you created and the default
   parameter group. For each parameter group, the response includes the parameter group name, description, and
   parameter group family name. You can optionally specify a name to retrieve the description of a specific
   parameter group.


   For more information about parameters and parameter groups, go to Amazon Redshift
   Parameter Groups in the Amazon Redshift Cluster Management Guide.


   If you specify both tag keys and tag values in the same request, Amazon Redshift returns all parameter groups
   that match any combination of the specified keys and values. For example, if you have owner and
   environment for tag keys, and admin and test for tag values, all parameter
   groups that have any combination of those values are returned.


   If both tag keys and values are omitted from the request, parameter groups are returned regardless of whether
   they have tag keys or values associated with them.

  request - `com.amazonaws.services.redshift.model.DescribeClusterParameterGroupsRequest`

  returns: Result of the DescribeClusterParameterGroups operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeClusterParameterGroupsResult`

  throws: com.amazonaws.services.redshift.model.ClusterParameterGroupNotFoundException - The parameter group name does not refer to an existing parameter group."
  (^com.amazonaws.services.redshift.model.DescribeClusterParameterGroupsResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.DescribeClusterParameterGroupsRequest request]
    (-> this (.describeClusterParameterGroups request)))
  (^com.amazonaws.services.redshift.model.DescribeClusterParameterGroupsResult [^AmazonRedshiftClient this]
    (-> this (.describeClusterParameterGroups))))

(defn create-cluster
  "Creates a new cluster.


   To create a cluster in Virtual Private Cloud (VPC), you must provide a cluster subnet group name. The cluster
   subnet group identifies the subnets of your VPC that Amazon Redshift uses when creating the cluster. For more
   information about managing clusters, go to Amazon Redshift Clusters
   in the Amazon Redshift Cluster Management Guide.

  request - `com.amazonaws.services.redshift.model.CreateClusterRequest`

  returns: Result of the CreateCluster operation returned by the service. - `com.amazonaws.services.redshift.model.Cluster`

  throws: com.amazonaws.services.redshift.model.InvalidElasticIpException - The Elastic IP (EIP) is invalid or cannot be found."
  (^com.amazonaws.services.redshift.model.Cluster [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.CreateClusterRequest request]
    (-> this (.createCluster request))))

(defn accept-reserved-node-exchange
  "Exchanges a DC1 Reserved Node for a DC2 Reserved Node with no changes to the configuration (term, payment type,
   or number of nodes) and no additional costs.

  request - `com.amazonaws.services.redshift.model.AcceptReservedNodeExchangeRequest`

  returns: Result of the AcceptReservedNodeExchange operation returned by the service. - `com.amazonaws.services.redshift.model.ReservedNode`

  throws: com.amazonaws.services.redshift.model.ReservedNodeNotFoundException - The specified reserved compute node not found."
  (^com.amazonaws.services.redshift.model.ReservedNode [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.AcceptReservedNodeExchangeRequest request]
    (-> this (.acceptReservedNodeExchange request))))

(defn reboot-cluster
  "Reboots a cluster. This action is taken as soon as possible. It results in a momentary outage to the cluster,
   during which the cluster status is set to rebooting. A cluster event is created when the reboot is
   completed. Any pending cluster modifications (see ModifyCluster) are applied at this reboot. For more
   information about managing clusters, go to Amazon Redshift Clusters
   in the Amazon Redshift Cluster Management Guide.

  request - `com.amazonaws.services.redshift.model.RebootClusterRequest`

  returns: Result of the RebootCluster operation returned by the service. - `com.amazonaws.services.redshift.model.Cluster`

  throws: com.amazonaws.services.redshift.model.InvalidClusterStateException - The specified cluster is not in the available state."
  (^com.amazonaws.services.redshift.model.Cluster [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.RebootClusterRequest request]
    (-> this (.rebootCluster request))))

(defn describe-cluster-tracks
  "Returns a list of all the available maintenance tracks.

  request - `com.amazonaws.services.redshift.model.DescribeClusterTracksRequest`

  returns: Result of the DescribeClusterTracks operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeClusterTracksResult`

  throws: com.amazonaws.services.redshift.model.InvalidClusterTrackException - The provided cluster track name is not valid."
  (^com.amazonaws.services.redshift.model.DescribeClusterTracksResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.DescribeClusterTracksRequest request]
    (-> this (.describeClusterTracks request))))

(defn resize-cluster
  "Changes the size of the cluster. You can change the cluster's type, or change the number or type of nodes. The
   default behavior is to use the elastic resize method. With an elastic resize, your cluster is available for read
   and write operations more quickly than with the classic resize method.


   Elastic resize operations have the following restrictions:




   You can only resize clusters of the following types:




   dc2.large




   dc2.8xlarge




   ds2.xlarge




   ds2.8xlarge






   The type of nodes that you add must match the node type for the cluster.

  request - `com.amazonaws.services.redshift.model.ResizeClusterRequest`

  returns: Result of the ResizeCluster operation returned by the service. - `com.amazonaws.services.redshift.model.Cluster`

  throws: com.amazonaws.services.redshift.model.NumberOfNodesQuotaExceededException - The operation would exceed the number of nodes allotted to the account. For information about increasing your quota, go to Limits in Amazon Redshift in the Amazon Redshift Cluster Management Guide."
  (^com.amazonaws.services.redshift.model.Cluster [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.ResizeClusterRequest request]
    (-> this (.resizeCluster request))))

(defn delete-cluster
  "Deletes a previously provisioned cluster. A successful response from the web service indicates that the request
   was received correctly. Use DescribeClusters to monitor the status of the deletion. The delete operation
   cannot be canceled or reverted once submitted. For more information about managing clusters, go to Amazon Redshift Clusters
   in the Amazon Redshift Cluster Management Guide.


   If you want to shut down the cluster and retain it for future use, set SkipFinalClusterSnapshot to
   false and specify a name for FinalClusterSnapshotIdentifier. You can later restore this
   snapshot to resume using the cluster. If a final cluster snapshot is requested, the status of the cluster will be
   \"final-snapshot\" while the snapshot is being taken, then it's \"deleting\" once Amazon Redshift begins deleting the
   cluster.


   For more information about managing clusters, go to Amazon Redshift Clusters
   in the Amazon Redshift Cluster Management Guide.

  request - `com.amazonaws.services.redshift.model.DeleteClusterRequest`

  returns: Result of the DeleteCluster operation returned by the service. - `com.amazonaws.services.redshift.model.Cluster`

  throws: com.amazonaws.services.redshift.model.ClusterNotFoundException - The ClusterIdentifier parameter does not refer to an existing cluster."
  (^com.amazonaws.services.redshift.model.Cluster [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.DeleteClusterRequest request]
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
  (^com.amazonaws.ResponseMetadata [^AmazonRedshiftClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn modify-cluster-db-revision
  "Modifies the database revision of a cluster. The database revision is a unique revision of the database running
   in a cluster.

  request - `com.amazonaws.services.redshift.model.ModifyClusterDbRevisionRequest`

  returns: Result of the ModifyClusterDbRevision operation returned by the service. - `com.amazonaws.services.redshift.model.Cluster`

  throws: com.amazonaws.services.redshift.model.ClusterNotFoundException - The ClusterIdentifier parameter does not refer to an existing cluster."
  (^com.amazonaws.services.redshift.model.Cluster [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.ModifyClusterDbRevisionRequest request]
    (-> this (.modifyClusterDbRevision request))))

(defn describe-cluster-db-revisions
  "Returns an array of ClusterDbRevision objects.

  request - `com.amazonaws.services.redshift.model.DescribeClusterDbRevisionsRequest`

  returns: Result of the DescribeClusterDbRevisions operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeClusterDbRevisionsResult`

  throws: com.amazonaws.services.redshift.model.ClusterNotFoundException - The ClusterIdentifier parameter does not refer to an existing cluster."
  (^com.amazonaws.services.redshift.model.DescribeClusterDbRevisionsResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.DescribeClusterDbRevisionsRequest request]
    (-> this (.describeClusterDbRevisions request))))

(defn restore-table-from-cluster-snapshot
  "Creates a new table from a table in an Amazon Redshift cluster snapshot. You must create the new table within the
   Amazon Redshift cluster that the snapshot was taken from.


   You cannot use RestoreTableFromClusterSnapshot to restore a table with the same name as an existing
   table in an Amazon Redshift cluster. That is, you cannot overwrite an existing table in a cluster with a restored
   table. If you want to replace your original table with a new, restored table, then rename or drop your original
   table before you call RestoreTableFromClusterSnapshot. When you have renamed your original table,
   then you can pass the original name of the table as the NewTableName parameter value in the call to
   RestoreTableFromClusterSnapshot. This way, you can replace the original table with the table created
   from the snapshot.

  request - `com.amazonaws.services.redshift.model.RestoreTableFromClusterSnapshotRequest`

  returns: Result of the RestoreTableFromClusterSnapshot operation returned by the service. - `com.amazonaws.services.redshift.model.TableRestoreStatus`

  throws: com.amazonaws.services.redshift.model.ClusterSnapshotNotFoundException - The snapshot identifier does not refer to an existing cluster snapshot."
  (^com.amazonaws.services.redshift.model.TableRestoreStatus [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.RestoreTableFromClusterSnapshotRequest request]
    (-> this (.restoreTableFromClusterSnapshot request))))

(defn describe-hsm-configurations
  "Returns information about the specified Amazon Redshift HSM configuration. If no configuration ID is specified,
   returns information about all the HSM configurations owned by your AWS customer account.


   If you specify both tag keys and tag values in the same request, Amazon Redshift returns all HSM connections that
   match any combination of the specified keys and values. For example, if you have owner and
   environment for tag keys, and admin and test for tag values, all HSM
   connections that have any combination of those values are returned.


   If both tag keys and values are omitted from the request, HSM connections are returned regardless of whether they
   have tag keys or values associated with them.

  request - `com.amazonaws.services.redshift.model.DescribeHsmConfigurationsRequest`

  returns: Result of the DescribeHsmConfigurations operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeHsmConfigurationsResult`

  throws: com.amazonaws.services.redshift.model.HsmConfigurationNotFoundException - There is no Amazon Redshift HSM configuration with the specified identifier."
  (^com.amazonaws.services.redshift.model.DescribeHsmConfigurationsResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.DescribeHsmConfigurationsRequest request]
    (-> this (.describeHsmConfigurations request)))
  (^com.amazonaws.services.redshift.model.DescribeHsmConfigurationsResult [^AmazonRedshiftClient this]
    (-> this (.describeHsmConfigurations))))

(defn delete-cluster-subnet-group
  "Deletes the specified cluster subnet group.

  request - `com.amazonaws.services.redshift.model.DeleteClusterSubnetGroupRequest`

  returns: Result of the DeleteClusterSubnetGroup operation returned by the service. - `com.amazonaws.services.redshift.model.DeleteClusterSubnetGroupResult`

  throws: com.amazonaws.services.redshift.model.InvalidClusterSubnetGroupStateException - The cluster subnet group cannot be deleted because it is in use."
  (^com.amazonaws.services.redshift.model.DeleteClusterSubnetGroupResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.DeleteClusterSubnetGroupRequest request]
    (-> this (.deleteClusterSubnetGroup request))))

(defn revoke-snapshot-access
  "Removes the ability of the specified AWS customer account to restore the specified snapshot. If the account is
   currently restoring the snapshot, the restore will run to completion.


   For more information about working with snapshots, go to Amazon Redshift Snapshots
   in the Amazon Redshift Cluster Management Guide.

  request - `com.amazonaws.services.redshift.model.RevokeSnapshotAccessRequest`

  returns: Result of the RevokeSnapshotAccess operation returned by the service. - `com.amazonaws.services.redshift.model.Snapshot`

  throws: com.amazonaws.services.redshift.model.AccessToSnapshotDeniedException - The owner of the specified snapshot has not authorized your account to access the snapshot."
  (^com.amazonaws.services.redshift.model.Snapshot [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.RevokeSnapshotAccessRequest request]
    (-> this (.revokeSnapshotAccess request))))

(defn get-cluster-credentials
  "Returns a database user name and temporary password with temporary authorization to log on to an Amazon Redshift
   database. The action returns the database user name prefixed with IAM: if AutoCreate is
   False or IAMA: if AutoCreate is True. You can optionally
   specify one or more database user groups that the user will join at log on. By default, the temporary credentials
   expire in 900 seconds. You can optionally specify a duration between 900 seconds (15 minutes) and 3600 seconds
   (60 minutes). For more information, see Using IAM Authentication
   to Generate Database User Credentials in the Amazon Redshift Cluster Management Guide.


   The AWS Identity and Access Management (IAM)user or role that executes GetClusterCredentials must have an IAM
   policy attached that allows access to all necessary actions and resources. For more information about
   permissions, see Resource Policies for GetClusterCredentials in the Amazon Redshift Cluster Management Guide.


   If the DbGroups parameter is specified, the IAM policy must allow the
   redshift:JoinGroup action with access to the listed dbgroups.


   In addition, if the AutoCreate parameter is set to True, then the policy must include
   the redshift:CreateClusterUser privilege.


   If the DbName parameter is specified, the IAM policy must allow access to the resource
   dbname for the specified database name.

  request - `com.amazonaws.services.redshift.model.GetClusterCredentialsRequest`

  returns: Result of the GetClusterCredentials operation returned by the service. - `com.amazonaws.services.redshift.model.GetClusterCredentialsResult`

  throws: com.amazonaws.services.redshift.model.ClusterNotFoundException - The ClusterIdentifier parameter does not refer to an existing cluster."
  (^com.amazonaws.services.redshift.model.GetClusterCredentialsResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.GetClusterCredentialsRequest request]
    (-> this (.getClusterCredentials request))))

(defn create-cluster-subnet-group
  "Creates a new Amazon Redshift subnet group. You must provide a list of one or more subnets in your existing
   Amazon Virtual Private Cloud (Amazon VPC) when creating Amazon Redshift subnet group.


   For information about subnet groups, go to Amazon Redshift
   Cluster Subnet Groups in the Amazon Redshift Cluster Management Guide.

  request - `com.amazonaws.services.redshift.model.CreateClusterSubnetGroupRequest`

  returns: Result of the CreateClusterSubnetGroup operation returned by the service. - `com.amazonaws.services.redshift.model.ClusterSubnetGroup`

  throws: com.amazonaws.services.redshift.model.ClusterSubnetGroupAlreadyExistsException - A ClusterSubnetGroupName is already used by an existing cluster subnet group."
  (^com.amazonaws.services.redshift.model.ClusterSubnetGroup [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.CreateClusterSubnetGroupRequest request]
    (-> this (.createClusterSubnetGroup request))))

(defn describe-clusters
  "Returns properties of provisioned clusters including general cluster properties, cluster database properties,
   maintenance and backup properties, and security and access properties. This operation supports pagination. For
   more information about managing clusters, go to Amazon Redshift Clusters
   in the Amazon Redshift Cluster Management Guide.


   If you specify both tag keys and tag values in the same request, Amazon Redshift returns all clusters that match
   any combination of the specified keys and values. For example, if you have owner and
   environment for tag keys, and admin and test for tag values, all clusters
   that have any combination of those values are returned.


   If both tag keys and values are omitted from the request, clusters are returned regardless of whether they have
   tag keys or values associated with them.

  request - `com.amazonaws.services.redshift.model.DescribeClustersRequest`

  returns: Result of the DescribeClusters operation returned by the service. - `com.amazonaws.services.redshift.model.DescribeClustersResult`

  throws: com.amazonaws.services.redshift.model.ClusterNotFoundException - The ClusterIdentifier parameter does not refer to an existing cluster."
  (^com.amazonaws.services.redshift.model.DescribeClustersResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.DescribeClustersRequest request]
    (-> this (.describeClusters request)))
  (^com.amazonaws.services.redshift.model.DescribeClustersResult [^AmazonRedshiftClient this]
    (-> this (.describeClusters))))

(defn delete-cluster-parameter-group
  "Deletes a specified Amazon Redshift parameter group.



   You cannot delete a parameter group if it is associated with a cluster.

  request - `com.amazonaws.services.redshift.model.DeleteClusterParameterGroupRequest`

  returns: Result of the DeleteClusterParameterGroup operation returned by the service. - `com.amazonaws.services.redshift.model.DeleteClusterParameterGroupResult`

  throws: com.amazonaws.services.redshift.model.InvalidClusterParameterGroupStateException - The cluster parameter group action can not be completed because another task is in progress that involves the parameter group. Wait a few moments and try the operation again."
  (^com.amazonaws.services.redshift.model.DeleteClusterParameterGroupResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.DeleteClusterParameterGroupRequest request]
    (-> this (.deleteClusterParameterGroup request))))

(defn delete-cluster-security-group
  "Deletes an Amazon Redshift security group.



   You cannot delete a security group that is associated with any clusters. You cannot delete the default security
   group.



   For information about managing security groups, go to Amazon Redshift Cluster
   Security Groups in the Amazon Redshift Cluster Management Guide.

  request - `com.amazonaws.services.redshift.model.DeleteClusterSecurityGroupRequest`

  returns: Result of the DeleteClusterSecurityGroup operation returned by the service. - `com.amazonaws.services.redshift.model.DeleteClusterSecurityGroupResult`

  throws: com.amazonaws.services.redshift.model.InvalidClusterSecurityGroupStateException - The state of the cluster security group is not available."
  (^com.amazonaws.services.redshift.model.DeleteClusterSecurityGroupResult [^AmazonRedshiftClient this ^com.amazonaws.services.redshift.model.DeleteClusterSecurityGroupRequest request]
    (-> this (.deleteClusterSecurityGroup request))))

