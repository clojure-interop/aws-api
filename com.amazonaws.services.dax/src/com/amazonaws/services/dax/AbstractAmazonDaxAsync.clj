(ns com.amazonaws.services.dax.AbstractAmazonDaxAsync
  "Abstract implementation of AmazonDaxAsync. Convenient method forms pass through to the corresponding overload
  that takes a request object and an AsyncHandler, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.dax AbstractAmazonDaxAsync]))

(defn untag-resource-async
  "Description copied from interface: AmazonDaxAsync

  request - `com.amazonaws.services.dax.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dax.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDaxAsync this ^com.amazonaws.services.dax.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDaxAsync this ^com.amazonaws.services.dax.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn reboot-node-async
  "Description copied from interface: AmazonDaxAsync

  request - `com.amazonaws.services.dax.model.RebootNodeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RebootNode operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dax.model.RebootNodeResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDaxAsync this ^com.amazonaws.services.dax.model.RebootNodeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rebootNodeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDaxAsync this ^com.amazonaws.services.dax.model.RebootNodeRequest request]
    (-> this (.rebootNodeAsync request))))

(defn increase-replication-factor-async
  "Description copied from interface: AmazonDaxAsync

  request - `com.amazonaws.services.dax.model.IncreaseReplicationFactorRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the IncreaseReplicationFactor operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dax.model.IncreaseReplicationFactorResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDaxAsync this ^com.amazonaws.services.dax.model.IncreaseReplicationFactorRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.increaseReplicationFactorAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDaxAsync this ^com.amazonaws.services.dax.model.IncreaseReplicationFactorRequest request]
    (-> this (.increaseReplicationFactorAsync request))))

(defn create-cluster-async
  "Description copied from interface: AmazonDaxAsync

  request - `com.amazonaws.services.dax.model.CreateClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dax.model.CreateClusterResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDaxAsync this ^com.amazonaws.services.dax.model.CreateClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDaxAsync this ^com.amazonaws.services.dax.model.CreateClusterRequest request]
    (-> this (.createClusterAsync request))))

(defn create-subnet-group-async
  "Description copied from interface: AmazonDaxAsync

  request - `com.amazonaws.services.dax.model.CreateSubnetGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSubnetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dax.model.CreateSubnetGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDaxAsync this ^com.amazonaws.services.dax.model.CreateSubnetGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSubnetGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDaxAsync this ^com.amazonaws.services.dax.model.CreateSubnetGroupRequest request]
    (-> this (.createSubnetGroupAsync request))))

(defn list-tags-async
  "Description copied from interface: AmazonDaxAsync

  request - `com.amazonaws.services.dax.model.ListTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dax.model.ListTagsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDaxAsync this ^com.amazonaws.services.dax.model.ListTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDaxAsync this ^com.amazonaws.services.dax.model.ListTagsRequest request]
    (-> this (.listTagsAsync request))))

(defn update-parameter-group-async
  "Description copied from interface: AmazonDaxAsync

  request - `com.amazonaws.services.dax.model.UpdateParameterGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dax.model.UpdateParameterGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDaxAsync this ^com.amazonaws.services.dax.model.UpdateParameterGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateParameterGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDaxAsync this ^com.amazonaws.services.dax.model.UpdateParameterGroupRequest request]
    (-> this (.updateParameterGroupAsync request))))

(defn update-subnet-group-async
  "Description copied from interface: AmazonDaxAsync

  request - `com.amazonaws.services.dax.model.UpdateSubnetGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSubnetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dax.model.UpdateSubnetGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDaxAsync this ^com.amazonaws.services.dax.model.UpdateSubnetGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSubnetGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDaxAsync this ^com.amazonaws.services.dax.model.UpdateSubnetGroupRequest request]
    (-> this (.updateSubnetGroupAsync request))))

(defn describe-parameters-async
  "Description copied from interface: AmazonDaxAsync

  request - `com.amazonaws.services.dax.model.DescribeParametersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeParameters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dax.model.DescribeParametersResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDaxAsync this ^com.amazonaws.services.dax.model.DescribeParametersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeParametersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDaxAsync this ^com.amazonaws.services.dax.model.DescribeParametersRequest request]
    (-> this (.describeParametersAsync request))))

(defn delete-cluster-async
  "Description copied from interface: AmazonDaxAsync

  request - `com.amazonaws.services.dax.model.DeleteClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dax.model.DeleteClusterResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDaxAsync this ^com.amazonaws.services.dax.model.DeleteClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDaxAsync this ^com.amazonaws.services.dax.model.DeleteClusterRequest request]
    (-> this (.deleteClusterAsync request))))

(defn describe-parameter-groups-async
  "Description copied from interface: AmazonDaxAsync

  request - `com.amazonaws.services.dax.model.DescribeParameterGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeParameterGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dax.model.DescribeParameterGroupsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDaxAsync this ^com.amazonaws.services.dax.model.DescribeParameterGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeParameterGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDaxAsync this ^com.amazonaws.services.dax.model.DescribeParameterGroupsRequest request]
    (-> this (.describeParameterGroupsAsync request))))

(defn create-parameter-group-async
  "Description copied from interface: AmazonDaxAsync

  request - `com.amazonaws.services.dax.model.CreateParameterGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dax.model.CreateParameterGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDaxAsync this ^com.amazonaws.services.dax.model.CreateParameterGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createParameterGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDaxAsync this ^com.amazonaws.services.dax.model.CreateParameterGroupRequest request]
    (-> this (.createParameterGroupAsync request))))

(defn describe-clusters-async
  "Description copied from interface: AmazonDaxAsync

  request - `com.amazonaws.services.dax.model.DescribeClustersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeClusters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dax.model.DescribeClustersResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDaxAsync this ^com.amazonaws.services.dax.model.DescribeClustersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClustersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDaxAsync this ^com.amazonaws.services.dax.model.DescribeClustersRequest request]
    (-> this (.describeClustersAsync request))))

(defn delete-parameter-group-async
  "Description copied from interface: AmazonDaxAsync

  request - `com.amazonaws.services.dax.model.DeleteParameterGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dax.model.DeleteParameterGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDaxAsync this ^com.amazonaws.services.dax.model.DeleteParameterGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteParameterGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDaxAsync this ^com.amazonaws.services.dax.model.DeleteParameterGroupRequest request]
    (-> this (.deleteParameterGroupAsync request))))

(defn describe-subnet-groups-async
  "Description copied from interface: AmazonDaxAsync

  request - `com.amazonaws.services.dax.model.DescribeSubnetGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSubnetGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dax.model.DescribeSubnetGroupsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDaxAsync this ^com.amazonaws.services.dax.model.DescribeSubnetGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSubnetGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDaxAsync this ^com.amazonaws.services.dax.model.DescribeSubnetGroupsRequest request]
    (-> this (.describeSubnetGroupsAsync request))))

(defn delete-subnet-group-async
  "Description copied from interface: AmazonDaxAsync

  request - `com.amazonaws.services.dax.model.DeleteSubnetGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSubnetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dax.model.DeleteSubnetGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDaxAsync this ^com.amazonaws.services.dax.model.DeleteSubnetGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSubnetGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDaxAsync this ^com.amazonaws.services.dax.model.DeleteSubnetGroupRequest request]
    (-> this (.deleteSubnetGroupAsync request))))

(defn describe-events-async
  "Description copied from interface: AmazonDaxAsync

  request - `com.amazonaws.services.dax.model.DescribeEventsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dax.model.DescribeEventsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDaxAsync this ^com.amazonaws.services.dax.model.DescribeEventsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDaxAsync this ^com.amazonaws.services.dax.model.DescribeEventsRequest request]
    (-> this (.describeEventsAsync request))))

(defn describe-default-parameters-async
  "Description copied from interface: AmazonDaxAsync

  request - `com.amazonaws.services.dax.model.DescribeDefaultParametersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDefaultParameters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dax.model.DescribeDefaultParametersResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDaxAsync this ^com.amazonaws.services.dax.model.DescribeDefaultParametersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDefaultParametersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDaxAsync this ^com.amazonaws.services.dax.model.DescribeDefaultParametersRequest request]
    (-> this (.describeDefaultParametersAsync request))))

(defn update-cluster-async
  "Description copied from interface: AmazonDaxAsync

  request - `com.amazonaws.services.dax.model.UpdateClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dax.model.UpdateClusterResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDaxAsync this ^com.amazonaws.services.dax.model.UpdateClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDaxAsync this ^com.amazonaws.services.dax.model.UpdateClusterRequest request]
    (-> this (.updateClusterAsync request))))

(defn decrease-replication-factor-async
  "Description copied from interface: AmazonDaxAsync

  request - `com.amazonaws.services.dax.model.DecreaseReplicationFactorRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DecreaseReplicationFactor operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dax.model.DecreaseReplicationFactorResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDaxAsync this ^com.amazonaws.services.dax.model.DecreaseReplicationFactorRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.decreaseReplicationFactorAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDaxAsync this ^com.amazonaws.services.dax.model.DecreaseReplicationFactorRequest request]
    (-> this (.decreaseReplicationFactorAsync request))))

(defn tag-resource-async
  "Description copied from interface: AmazonDaxAsync

  request - `com.amazonaws.services.dax.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dax.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDaxAsync this ^com.amazonaws.services.dax.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDaxAsync this ^com.amazonaws.services.dax.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

