(ns com.amazonaws.services.dax.AmazonDaxAsync
  "Interface for accessing Amazon DAX asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonDaxAsync instead.



  DAX is a managed caching service engineered for Amazon DynamoDB. DAX dramatically speeds up database reads by caching
  frequently-accessed data from DynamoDB, so applications can access that data with sub-millisecond latency. You can
  create a DAX cluster easily, using the AWS Management Console. With a few simple modifications to your code, your
  application can begin taking advantage of the DAX cluster and realize significant improvements in read performance."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.dax AmazonDaxAsync]))

(defn untag-resource-async
  "Removes the association of tags from a DAX resource. You can call UntagResource up to 5 times per
   second, per account.

  untag-resource-request - `com.amazonaws.services.dax.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dax.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonDaxAsync this ^com.amazonaws.services.dax.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDaxAsync this ^com.amazonaws.services.dax.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn reboot-node-async
  "Reboots a single node of a DAX cluster. The reboot action takes place as soon as possible. During the reboot, the
   node status is set to REBOOTING.

  reboot-node-request - `com.amazonaws.services.dax.model.RebootNodeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RebootNode operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dax.model.RebootNodeResult>`"
  (^java.util.concurrent.Future [^AmazonDaxAsync this ^com.amazonaws.services.dax.model.RebootNodeRequest reboot-node-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rebootNodeAsync reboot-node-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDaxAsync this ^com.amazonaws.services.dax.model.RebootNodeRequest reboot-node-request]
    (-> this (.rebootNodeAsync reboot-node-request))))

(defn increase-replication-factor-async
  "Adds one or more nodes to a DAX cluster.

  increase-replication-factor-request - `com.amazonaws.services.dax.model.IncreaseReplicationFactorRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the IncreaseReplicationFactor operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dax.model.IncreaseReplicationFactorResult>`"
  (^java.util.concurrent.Future [^AmazonDaxAsync this ^com.amazonaws.services.dax.model.IncreaseReplicationFactorRequest increase-replication-factor-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.increaseReplicationFactorAsync increase-replication-factor-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDaxAsync this ^com.amazonaws.services.dax.model.IncreaseReplicationFactorRequest increase-replication-factor-request]
    (-> this (.increaseReplicationFactorAsync increase-replication-factor-request))))

(defn create-cluster-async
  "Creates a DAX cluster. All nodes in the cluster run the same DAX caching software.

  create-cluster-request - `com.amazonaws.services.dax.model.CreateClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dax.model.CreateClusterResult>`"
  (^java.util.concurrent.Future [^AmazonDaxAsync this ^com.amazonaws.services.dax.model.CreateClusterRequest create-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createClusterAsync create-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDaxAsync this ^com.amazonaws.services.dax.model.CreateClusterRequest create-cluster-request]
    (-> this (.createClusterAsync create-cluster-request))))

(defn create-subnet-group-async
  "Creates a new subnet group.

  create-subnet-group-request - `com.amazonaws.services.dax.model.CreateSubnetGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSubnetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dax.model.CreateSubnetGroupResult>`"
  (^java.util.concurrent.Future [^AmazonDaxAsync this ^com.amazonaws.services.dax.model.CreateSubnetGroupRequest create-subnet-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSubnetGroupAsync create-subnet-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDaxAsync this ^com.amazonaws.services.dax.model.CreateSubnetGroupRequest create-subnet-group-request]
    (-> this (.createSubnetGroupAsync create-subnet-group-request))))

(defn list-tags-async
  "List all of the tags for a DAX cluster. You can call ListTags up to 10 times per second, per
   account.

  list-tags-request - `com.amazonaws.services.dax.model.ListTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dax.model.ListTagsResult>`"
  (^java.util.concurrent.Future [^AmazonDaxAsync this ^com.amazonaws.services.dax.model.ListTagsRequest list-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsAsync list-tags-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDaxAsync this ^com.amazonaws.services.dax.model.ListTagsRequest list-tags-request]
    (-> this (.listTagsAsync list-tags-request))))

(defn update-parameter-group-async
  "Modifies the parameters of a parameter group. You can modify up to 20 parameters in a single request by
   submitting a list parameter name and value pairs.

  update-parameter-group-request - `com.amazonaws.services.dax.model.UpdateParameterGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dax.model.UpdateParameterGroupResult>`"
  (^java.util.concurrent.Future [^AmazonDaxAsync this ^com.amazonaws.services.dax.model.UpdateParameterGroupRequest update-parameter-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateParameterGroupAsync update-parameter-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDaxAsync this ^com.amazonaws.services.dax.model.UpdateParameterGroupRequest update-parameter-group-request]
    (-> this (.updateParameterGroupAsync update-parameter-group-request))))

(defn update-subnet-group-async
  "Modifies an existing subnet group.

  update-subnet-group-request - `com.amazonaws.services.dax.model.UpdateSubnetGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSubnetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dax.model.UpdateSubnetGroupResult>`"
  (^java.util.concurrent.Future [^AmazonDaxAsync this ^com.amazonaws.services.dax.model.UpdateSubnetGroupRequest update-subnet-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSubnetGroupAsync update-subnet-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDaxAsync this ^com.amazonaws.services.dax.model.UpdateSubnetGroupRequest update-subnet-group-request]
    (-> this (.updateSubnetGroupAsync update-subnet-group-request))))

(defn describe-parameters-async
  "Returns the detailed parameter list for a particular parameter group.

  describe-parameters-request - `com.amazonaws.services.dax.model.DescribeParametersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeParameters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dax.model.DescribeParametersResult>`"
  (^java.util.concurrent.Future [^AmazonDaxAsync this ^com.amazonaws.services.dax.model.DescribeParametersRequest describe-parameters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeParametersAsync describe-parameters-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDaxAsync this ^com.amazonaws.services.dax.model.DescribeParametersRequest describe-parameters-request]
    (-> this (.describeParametersAsync describe-parameters-request))))

(defn delete-cluster-async
  "Deletes a previously provisioned DAX cluster. DeleteCluster deletes all associated nodes, node endpoints
   and the DAX cluster itself. When you receive a successful response from this action, DAX immediately begins
   deleting the cluster; you cannot cancel or revert this action.

  delete-cluster-request - `com.amazonaws.services.dax.model.DeleteClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dax.model.DeleteClusterResult>`"
  (^java.util.concurrent.Future [^AmazonDaxAsync this ^com.amazonaws.services.dax.model.DeleteClusterRequest delete-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteClusterAsync delete-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDaxAsync this ^com.amazonaws.services.dax.model.DeleteClusterRequest delete-cluster-request]
    (-> this (.deleteClusterAsync delete-cluster-request))))

(defn describe-parameter-groups-async
  "Returns a list of parameter group descriptions. If a parameter group name is specified, the list will contain
   only the descriptions for that group.

  describe-parameter-groups-request - `com.amazonaws.services.dax.model.DescribeParameterGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeParameterGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dax.model.DescribeParameterGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonDaxAsync this ^com.amazonaws.services.dax.model.DescribeParameterGroupsRequest describe-parameter-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeParameterGroupsAsync describe-parameter-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDaxAsync this ^com.amazonaws.services.dax.model.DescribeParameterGroupsRequest describe-parameter-groups-request]
    (-> this (.describeParameterGroupsAsync describe-parameter-groups-request))))

(defn create-parameter-group-async
  "Creates a new parameter group. A parameter group is a collection of parameters that you apply to all of the nodes
   in a DAX cluster.

  create-parameter-group-request - `com.amazonaws.services.dax.model.CreateParameterGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dax.model.CreateParameterGroupResult>`"
  (^java.util.concurrent.Future [^AmazonDaxAsync this ^com.amazonaws.services.dax.model.CreateParameterGroupRequest create-parameter-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createParameterGroupAsync create-parameter-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDaxAsync this ^com.amazonaws.services.dax.model.CreateParameterGroupRequest create-parameter-group-request]
    (-> this (.createParameterGroupAsync create-parameter-group-request))))

(defn describe-clusters-async
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

  describe-clusters-request - `com.amazonaws.services.dax.model.DescribeClustersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeClusters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dax.model.DescribeClustersResult>`"
  (^java.util.concurrent.Future [^AmazonDaxAsync this ^com.amazonaws.services.dax.model.DescribeClustersRequest describe-clusters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClustersAsync describe-clusters-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDaxAsync this ^com.amazonaws.services.dax.model.DescribeClustersRequest describe-clusters-request]
    (-> this (.describeClustersAsync describe-clusters-request))))

(defn delete-parameter-group-async
  "Deletes the specified parameter group. You cannot delete a parameter group if it is associated with any DAX
   clusters.

  delete-parameter-group-request - `com.amazonaws.services.dax.model.DeleteParameterGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dax.model.DeleteParameterGroupResult>`"
  (^java.util.concurrent.Future [^AmazonDaxAsync this ^com.amazonaws.services.dax.model.DeleteParameterGroupRequest delete-parameter-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteParameterGroupAsync delete-parameter-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDaxAsync this ^com.amazonaws.services.dax.model.DeleteParameterGroupRequest delete-parameter-group-request]
    (-> this (.deleteParameterGroupAsync delete-parameter-group-request))))

(defn describe-subnet-groups-async
  "Returns a list of subnet group descriptions. If a subnet group name is specified, the list will contain only the
   description of that group.

  describe-subnet-groups-request - `com.amazonaws.services.dax.model.DescribeSubnetGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSubnetGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dax.model.DescribeSubnetGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonDaxAsync this ^com.amazonaws.services.dax.model.DescribeSubnetGroupsRequest describe-subnet-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSubnetGroupsAsync describe-subnet-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDaxAsync this ^com.amazonaws.services.dax.model.DescribeSubnetGroupsRequest describe-subnet-groups-request]
    (-> this (.describeSubnetGroupsAsync describe-subnet-groups-request))))

(defn delete-subnet-group-async
  "Deletes a subnet group.



   You cannot delete a subnet group if it is associated with any DAX clusters.

  delete-subnet-group-request - `com.amazonaws.services.dax.model.DeleteSubnetGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSubnetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dax.model.DeleteSubnetGroupResult>`"
  (^java.util.concurrent.Future [^AmazonDaxAsync this ^com.amazonaws.services.dax.model.DeleteSubnetGroupRequest delete-subnet-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSubnetGroupAsync delete-subnet-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDaxAsync this ^com.amazonaws.services.dax.model.DeleteSubnetGroupRequest delete-subnet-group-request]
    (-> this (.deleteSubnetGroupAsync delete-subnet-group-request))))

(defn describe-events-async
  "Returns events related to DAX clusters and parameter groups. You can obtain events specific to a particular DAX
   cluster or parameter group by providing the name as a parameter.


   By default, only the events occurring within the last hour are returned; however, you can retrieve up to 14 days'
   worth of events if necessary.

  describe-events-request - `com.amazonaws.services.dax.model.DescribeEventsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dax.model.DescribeEventsResult>`"
  (^java.util.concurrent.Future [^AmazonDaxAsync this ^com.amazonaws.services.dax.model.DescribeEventsRequest describe-events-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventsAsync describe-events-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDaxAsync this ^com.amazonaws.services.dax.model.DescribeEventsRequest describe-events-request]
    (-> this (.describeEventsAsync describe-events-request))))

(defn describe-default-parameters-async
  "Returns the default system parameter information for the DAX caching software.

  describe-default-parameters-request - `com.amazonaws.services.dax.model.DescribeDefaultParametersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDefaultParameters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dax.model.DescribeDefaultParametersResult>`"
  (^java.util.concurrent.Future [^AmazonDaxAsync this ^com.amazonaws.services.dax.model.DescribeDefaultParametersRequest describe-default-parameters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDefaultParametersAsync describe-default-parameters-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDaxAsync this ^com.amazonaws.services.dax.model.DescribeDefaultParametersRequest describe-default-parameters-request]
    (-> this (.describeDefaultParametersAsync describe-default-parameters-request))))

(defn update-cluster-async
  "Modifies the settings for a DAX cluster. You can use this action to change one or more cluster configuration
   parameters by specifying the parameters and the new values.

  update-cluster-request - `com.amazonaws.services.dax.model.UpdateClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dax.model.UpdateClusterResult>`"
  (^java.util.concurrent.Future [^AmazonDaxAsync this ^com.amazonaws.services.dax.model.UpdateClusterRequest update-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateClusterAsync update-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDaxAsync this ^com.amazonaws.services.dax.model.UpdateClusterRequest update-cluster-request]
    (-> this (.updateClusterAsync update-cluster-request))))

(defn decrease-replication-factor-async
  "Removes one or more nodes from a DAX cluster.



   You cannot use DecreaseReplicationFactor to remove the last node in a DAX cluster. If you need to do
   this, use DeleteCluster instead.

  decrease-replication-factor-request - `com.amazonaws.services.dax.model.DecreaseReplicationFactorRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DecreaseReplicationFactor operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dax.model.DecreaseReplicationFactorResult>`"
  (^java.util.concurrent.Future [^AmazonDaxAsync this ^com.amazonaws.services.dax.model.DecreaseReplicationFactorRequest decrease-replication-factor-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.decreaseReplicationFactorAsync decrease-replication-factor-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDaxAsync this ^com.amazonaws.services.dax.model.DecreaseReplicationFactorRequest decrease-replication-factor-request]
    (-> this (.decreaseReplicationFactorAsync decrease-replication-factor-request))))

(defn tag-resource-async
  "Associates a set of tags with a DAX resource. You can call TagResource up to 5 times per second, per
   account.

  tag-resource-request - `com.amazonaws.services.dax.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dax.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonDaxAsync this ^com.amazonaws.services.dax.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDaxAsync this ^com.amazonaws.services.dax.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

