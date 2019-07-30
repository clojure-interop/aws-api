(ns com.amazonaws.services.dax.AmazonDaxClient
  "Client for accessing Amazon DAX. All service calls made using this client are blocking, and will not return until the
  service call completes.


  DAX is a managed caching service engineered for Amazon DynamoDB. DAX dramatically speeds up database reads by caching
  frequently-accessed data from DynamoDB, so applications can access that data with sub-millisecond latency. You can
  create a DAX cluster easily, using the AWS Management Console. With a few simple modifications to your code, your
  application can begin taking advantage of the DAX cluster and realize significant improvements in read performance."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.dax AmazonDaxClient]))

(defn *builder
  "returns: `com.amazonaws.services.dax.AmazonDaxClientBuilder`"
  (^com.amazonaws.services.dax.AmazonDaxClientBuilder []
    (AmazonDaxClient/builder )))

(defn reboot-node
  "Reboots a single node of a DAX cluster. The reboot action takes place as soon as possible. During the reboot, the
   node status is set to REBOOTING.

  request - `com.amazonaws.services.dax.model.RebootNodeRequest`

  returns: Result of the RebootNode operation returned by the service. - `com.amazonaws.services.dax.model.RebootNodeResult`

  throws: com.amazonaws.services.dax.model.ClusterNotFoundException - The requested cluster ID does not refer to an existing DAX cluster."
  (^com.amazonaws.services.dax.model.RebootNodeResult [^AmazonDaxClient this ^com.amazonaws.services.dax.model.RebootNodeRequest request]
    (-> this (.rebootNode request))))

(defn delete-subnet-group
  "Deletes a subnet group.



   You cannot delete a subnet group if it is associated with any DAX clusters.

  request - `com.amazonaws.services.dax.model.DeleteSubnetGroupRequest`

  returns: Result of the DeleteSubnetGroup operation returned by the service. - `com.amazonaws.services.dax.model.DeleteSubnetGroupResult`

  throws: com.amazonaws.services.dax.model.SubnetGroupInUseException - The specified subnet group is currently in use."
  (^com.amazonaws.services.dax.model.DeleteSubnetGroupResult [^AmazonDaxClient this ^com.amazonaws.services.dax.model.DeleteSubnetGroupRequest request]
    (-> this (.deleteSubnetGroup request))))

(defn delete-parameter-group
  "Deletes the specified parameter group. You cannot delete a parameter group if it is associated with any DAX
   clusters.

  request - `com.amazonaws.services.dax.model.DeleteParameterGroupRequest`

  returns: Result of the DeleteParameterGroup operation returned by the service. - `com.amazonaws.services.dax.model.DeleteParameterGroupResult`

  throws: com.amazonaws.services.dax.model.InvalidParameterGroupStateException - One or more parameters in a parameter group are in an invalid state."
  (^com.amazonaws.services.dax.model.DeleteParameterGroupResult [^AmazonDaxClient this ^com.amazonaws.services.dax.model.DeleteParameterGroupRequest request]
    (-> this (.deleteParameterGroup request))))

(defn list-tags
  "List all of the tags for a DAX cluster. You can call ListTags up to 10 times per second, per
   account.

  request - `com.amazonaws.services.dax.model.ListTagsRequest`

  returns: Result of the ListTags operation returned by the service. - `com.amazonaws.services.dax.model.ListTagsResult`

  throws: com.amazonaws.services.dax.model.ClusterNotFoundException - The requested cluster ID does not refer to an existing DAX cluster."
  (^com.amazonaws.services.dax.model.ListTagsResult [^AmazonDaxClient this ^com.amazonaws.services.dax.model.ListTagsRequest request]
    (-> this (.listTags request))))

(defn describe-parameter-groups
  "Returns a list of parameter group descriptions. If a parameter group name is specified, the list will contain
   only the descriptions for that group.

  request - `com.amazonaws.services.dax.model.DescribeParameterGroupsRequest`

  returns: Result of the DescribeParameterGroups operation returned by the service. - `com.amazonaws.services.dax.model.DescribeParameterGroupsResult`

  throws: com.amazonaws.services.dax.model.ParameterGroupNotFoundException - The specified parameter group does not exist."
  (^com.amazonaws.services.dax.model.DescribeParameterGroupsResult [^AmazonDaxClient this ^com.amazonaws.services.dax.model.DescribeParameterGroupsRequest request]
    (-> this (.describeParameterGroups request))))

(defn untag-resource
  "Removes the association of tags from a DAX resource. You can call UntagResource up to 5 times per
   second, per account.

  request - `com.amazonaws.services.dax.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.dax.model.UntagResourceResult`

  throws: com.amazonaws.services.dax.model.ClusterNotFoundException - The requested cluster ID does not refer to an existing DAX cluster."
  (^com.amazonaws.services.dax.model.UntagResourceResult [^AmazonDaxClient this ^com.amazonaws.services.dax.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn update-subnet-group
  "Modifies an existing subnet group.

  request - `com.amazonaws.services.dax.model.UpdateSubnetGroupRequest`

  returns: Result of the UpdateSubnetGroup operation returned by the service. - `com.amazonaws.services.dax.model.UpdateSubnetGroupResult`

  throws: com.amazonaws.services.dax.model.SubnetGroupNotFoundException - The requested subnet group name does not refer to an existing subnet group."
  (^com.amazonaws.services.dax.model.UpdateSubnetGroupResult [^AmazonDaxClient this ^com.amazonaws.services.dax.model.UpdateSubnetGroupRequest request]
    (-> this (.updateSubnetGroup request))))

(defn create-subnet-group
  "Creates a new subnet group.

  request - `com.amazonaws.services.dax.model.CreateSubnetGroupRequest`

  returns: Result of the CreateSubnetGroup operation returned by the service. - `com.amazonaws.services.dax.model.CreateSubnetGroupResult`

  throws: com.amazonaws.services.dax.model.SubnetGroupAlreadyExistsException - The specified subnet group already exists."
  (^com.amazonaws.services.dax.model.CreateSubnetGroupResult [^AmazonDaxClient this ^com.amazonaws.services.dax.model.CreateSubnetGroupRequest request]
    (-> this (.createSubnetGroup request))))

(defn create-parameter-group
  "Creates a new parameter group. A parameter group is a collection of parameters that you apply to all of the nodes
   in a DAX cluster.

  request - `com.amazonaws.services.dax.model.CreateParameterGroupRequest`

  returns: Result of the CreateParameterGroup operation returned by the service. - `com.amazonaws.services.dax.model.CreateParameterGroupResult`

  throws: com.amazonaws.services.dax.model.ParameterGroupQuotaExceededException - You have attempted to exceed the maximum number of parameter groups."
  (^com.amazonaws.services.dax.model.CreateParameterGroupResult [^AmazonDaxClient this ^com.amazonaws.services.dax.model.CreateParameterGroupRequest request]
    (-> this (.createParameterGroup request))))

(defn describe-events
  "Returns events related to DAX clusters and parameter groups. You can obtain events specific to a particular DAX
   cluster or parameter group by providing the name as a parameter.


   By default, only the events occurring within the last hour are returned; however, you can retrieve up to 14 days'
   worth of events if necessary.

  request - `com.amazonaws.services.dax.model.DescribeEventsRequest`

  returns: Result of the DescribeEvents operation returned by the service. - `com.amazonaws.services.dax.model.DescribeEventsResult`

  throws: com.amazonaws.services.dax.model.ServiceLinkedRoleNotFoundException"
  (^com.amazonaws.services.dax.model.DescribeEventsResult [^AmazonDaxClient this ^com.amazonaws.services.dax.model.DescribeEventsRequest request]
    (-> this (.describeEvents request))))

(defn decrease-replication-factor
  "Removes one or more nodes from a DAX cluster.



   You cannot use DecreaseReplicationFactor to remove the last node in a DAX cluster. If you need to do
   this, use DeleteCluster instead.

  request - `com.amazonaws.services.dax.model.DecreaseReplicationFactorRequest`

  returns: Result of the DecreaseReplicationFactor operation returned by the service. - `com.amazonaws.services.dax.model.DecreaseReplicationFactorResult`

  throws: com.amazonaws.services.dax.model.ClusterNotFoundException - The requested cluster ID does not refer to an existing DAX cluster."
  (^com.amazonaws.services.dax.model.DecreaseReplicationFactorResult [^AmazonDaxClient this ^com.amazonaws.services.dax.model.DecreaseReplicationFactorRequest request]
    (-> this (.decreaseReplicationFactor request))))

(defn describe-default-parameters
  "Returns the default system parameter information for the DAX caching software.

  request - `com.amazonaws.services.dax.model.DescribeDefaultParametersRequest`

  returns: Result of the DescribeDefaultParameters operation returned by the service. - `com.amazonaws.services.dax.model.DescribeDefaultParametersResult`

  throws: com.amazonaws.services.dax.model.ServiceLinkedRoleNotFoundException"
  (^com.amazonaws.services.dax.model.DescribeDefaultParametersResult [^AmazonDaxClient this ^com.amazonaws.services.dax.model.DescribeDefaultParametersRequest request]
    (-> this (.describeDefaultParameters request))))

(defn increase-replication-factor
  "Adds one or more nodes to a DAX cluster.

  request - `com.amazonaws.services.dax.model.IncreaseReplicationFactorRequest`

  returns: Result of the IncreaseReplicationFactor operation returned by the service. - `com.amazonaws.services.dax.model.IncreaseReplicationFactorResult`

  throws: com.amazonaws.services.dax.model.ServiceLinkedRoleNotFoundException"
  (^com.amazonaws.services.dax.model.IncreaseReplicationFactorResult [^AmazonDaxClient this ^com.amazonaws.services.dax.model.IncreaseReplicationFactorRequest request]
    (-> this (.increaseReplicationFactor request))))

(defn describe-parameters
  "Returns the detailed parameter list for a particular parameter group.

  request - `com.amazonaws.services.dax.model.DescribeParametersRequest`

  returns: Result of the DescribeParameters operation returned by the service. - `com.amazonaws.services.dax.model.DescribeParametersResult`

  throws: com.amazonaws.services.dax.model.ParameterGroupNotFoundException - The specified parameter group does not exist."
  (^com.amazonaws.services.dax.model.DescribeParametersResult [^AmazonDaxClient this ^com.amazonaws.services.dax.model.DescribeParametersRequest request]
    (-> this (.describeParameters request))))

(defn create-cluster
  "Creates a DAX cluster. All nodes in the cluster run the same DAX caching software.

  request - `com.amazonaws.services.dax.model.CreateClusterRequest`

  returns: Result of the CreateCluster operation returned by the service. - `com.amazonaws.services.dax.model.CreateClusterResult`

  throws: com.amazonaws.services.dax.model.ServiceLinkedRoleNotFoundException"
  (^com.amazonaws.services.dax.model.CreateClusterResult [^AmazonDaxClient this ^com.amazonaws.services.dax.model.CreateClusterRequest request]
    (-> this (.createCluster request))))

(defn describe-subnet-groups
  "Returns a list of subnet group descriptions. If a subnet group name is specified, the list will contain only the
   description of that group.

  request - `com.amazonaws.services.dax.model.DescribeSubnetGroupsRequest`

  returns: Result of the DescribeSubnetGroups operation returned by the service. - `com.amazonaws.services.dax.model.DescribeSubnetGroupsResult`

  throws: com.amazonaws.services.dax.model.SubnetGroupNotFoundException - The requested subnet group name does not refer to an existing subnet group."
  (^com.amazonaws.services.dax.model.DescribeSubnetGroupsResult [^AmazonDaxClient this ^com.amazonaws.services.dax.model.DescribeSubnetGroupsRequest request]
    (-> this (.describeSubnetGroups request))))

(defn update-cluster
  "Modifies the settings for a DAX cluster. You can use this action to change one or more cluster configuration
   parameters by specifying the parameters and the new values.

  request - `com.amazonaws.services.dax.model.UpdateClusterRequest`

  returns: Result of the UpdateCluster operation returned by the service. - `com.amazonaws.services.dax.model.UpdateClusterResult`

  throws: com.amazonaws.services.dax.model.InvalidClusterStateException - The requested DAX cluster is not in the available state."
  (^com.amazonaws.services.dax.model.UpdateClusterResult [^AmazonDaxClient this ^com.amazonaws.services.dax.model.UpdateClusterRequest request]
    (-> this (.updateCluster request))))

(defn delete-cluster
  "Deletes a previously provisioned DAX cluster. DeleteCluster deletes all associated nodes, node endpoints
   and the DAX cluster itself. When you receive a successful response from this action, DAX immediately begins
   deleting the cluster; you cannot cancel or revert this action.

  request - `com.amazonaws.services.dax.model.DeleteClusterRequest`

  returns: Result of the DeleteCluster operation returned by the service. - `com.amazonaws.services.dax.model.DeleteClusterResult`

  throws: com.amazonaws.services.dax.model.ClusterNotFoundException - The requested cluster ID does not refer to an existing DAX cluster."
  (^com.amazonaws.services.dax.model.DeleteClusterResult [^AmazonDaxClient this ^com.amazonaws.services.dax.model.DeleteClusterRequest request]
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
  (^com.amazonaws.ResponseMetadata [^AmazonDaxClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn update-parameter-group
  "Modifies the parameters of a parameter group. You can modify up to 20 parameters in a single request by
   submitting a list parameter name and value pairs.

  request - `com.amazonaws.services.dax.model.UpdateParameterGroupRequest`

  returns: Result of the UpdateParameterGroup operation returned by the service. - `com.amazonaws.services.dax.model.UpdateParameterGroupResult`

  throws: com.amazonaws.services.dax.model.InvalidParameterGroupStateException - One or more parameters in a parameter group are in an invalid state."
  (^com.amazonaws.services.dax.model.UpdateParameterGroupResult [^AmazonDaxClient this ^com.amazonaws.services.dax.model.UpdateParameterGroupRequest request]
    (-> this (.updateParameterGroup request))))

(defn tag-resource
  "Associates a set of tags with a DAX resource. You can call TagResource up to 5 times per second, per
   account.

  request - `com.amazonaws.services.dax.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.dax.model.TagResourceResult`

  throws: com.amazonaws.services.dax.model.ClusterNotFoundException - The requested cluster ID does not refer to an existing DAX cluster."
  (^com.amazonaws.services.dax.model.TagResourceResult [^AmazonDaxClient this ^com.amazonaws.services.dax.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn describe-clusters
  "Returns information about all provisioned DAX clusters if no cluster identifier is specified, or about a specific
   DAX cluster if a cluster identifier is supplied.


   If the cluster is in the CREATING state, only cluster level information will be displayed until all of the nodes
   are successfully provisioned.


   If the cluster is in the DELETING state, only cluster level information will be displayed.


   If nodes are currently being added to the DAX cluster, node endpoint information and creation time for the
   additional nodes will not be displayed until they are completely provisioned. When the DAX cluster state is
   available, the cluster is ready for use.


   If nodes are currently being removed from the DAX cluster, no endpoint information for the removed nodes is
   displayed.

  request - `com.amazonaws.services.dax.model.DescribeClustersRequest`

  returns: Result of the DescribeClusters operation returned by the service. - `com.amazonaws.services.dax.model.DescribeClustersResult`

  throws: com.amazonaws.services.dax.model.ClusterNotFoundException - The requested cluster ID does not refer to an existing DAX cluster."
  (^com.amazonaws.services.dax.model.DescribeClustersResult [^AmazonDaxClient this ^com.amazonaws.services.dax.model.DescribeClustersRequest request]
    (-> this (.describeClusters request))))

