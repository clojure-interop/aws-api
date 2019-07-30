(ns com.amazonaws.services.dax.AbstractAmazonDax
  "Abstract implementation of AmazonDax. Convenient method forms pass through to the corresponding overload that
  takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.dax AbstractAmazonDax]))

(defn reboot-node
  "Description copied from interface: AmazonDax

  request - `com.amazonaws.services.dax.model.RebootNodeRequest`

  returns: Result of the RebootNode operation returned by the service. - `com.amazonaws.services.dax.model.RebootNodeResult`"
  (^com.amazonaws.services.dax.model.RebootNodeResult [^AbstractAmazonDax this ^com.amazonaws.services.dax.model.RebootNodeRequest request]
    (-> this (.rebootNode request))))

(defn delete-subnet-group
  "Description copied from interface: AmazonDax

  request - `com.amazonaws.services.dax.model.DeleteSubnetGroupRequest`

  returns: Result of the DeleteSubnetGroup operation returned by the service. - `com.amazonaws.services.dax.model.DeleteSubnetGroupResult`"
  (^com.amazonaws.services.dax.model.DeleteSubnetGroupResult [^AbstractAmazonDax this ^com.amazonaws.services.dax.model.DeleteSubnetGroupRequest request]
    (-> this (.deleteSubnetGroup request))))

(defn delete-parameter-group
  "Description copied from interface: AmazonDax

  request - `com.amazonaws.services.dax.model.DeleteParameterGroupRequest`

  returns: Result of the DeleteParameterGroup operation returned by the service. - `com.amazonaws.services.dax.model.DeleteParameterGroupResult`"
  (^com.amazonaws.services.dax.model.DeleteParameterGroupResult [^AbstractAmazonDax this ^com.amazonaws.services.dax.model.DeleteParameterGroupRequest request]
    (-> this (.deleteParameterGroup request))))

(defn list-tags
  "Description copied from interface: AmazonDax

  request - `com.amazonaws.services.dax.model.ListTagsRequest`

  returns: Result of the ListTags operation returned by the service. - `com.amazonaws.services.dax.model.ListTagsResult`"
  (^com.amazonaws.services.dax.model.ListTagsResult [^AbstractAmazonDax this ^com.amazonaws.services.dax.model.ListTagsRequest request]
    (-> this (.listTags request))))

(defn describe-parameter-groups
  "Description copied from interface: AmazonDax

  request - `com.amazonaws.services.dax.model.DescribeParameterGroupsRequest`

  returns: Result of the DescribeParameterGroups operation returned by the service. - `com.amazonaws.services.dax.model.DescribeParameterGroupsResult`"
  (^com.amazonaws.services.dax.model.DescribeParameterGroupsResult [^AbstractAmazonDax this ^com.amazonaws.services.dax.model.DescribeParameterGroupsRequest request]
    (-> this (.describeParameterGroups request))))

(defn untag-resource
  "Description copied from interface: AmazonDax

  request - `com.amazonaws.services.dax.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.dax.model.UntagResourceResult`"
  (^com.amazonaws.services.dax.model.UntagResourceResult [^AbstractAmazonDax this ^com.amazonaws.services.dax.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn update-subnet-group
  "Description copied from interface: AmazonDax

  request - `com.amazonaws.services.dax.model.UpdateSubnetGroupRequest`

  returns: Result of the UpdateSubnetGroup operation returned by the service. - `com.amazonaws.services.dax.model.UpdateSubnetGroupResult`"
  (^com.amazonaws.services.dax.model.UpdateSubnetGroupResult [^AbstractAmazonDax this ^com.amazonaws.services.dax.model.UpdateSubnetGroupRequest request]
    (-> this (.updateSubnetGroup request))))

(defn create-subnet-group
  "Description copied from interface: AmazonDax

  request - `com.amazonaws.services.dax.model.CreateSubnetGroupRequest`

  returns: Result of the CreateSubnetGroup operation returned by the service. - `com.amazonaws.services.dax.model.CreateSubnetGroupResult`"
  (^com.amazonaws.services.dax.model.CreateSubnetGroupResult [^AbstractAmazonDax this ^com.amazonaws.services.dax.model.CreateSubnetGroupRequest request]
    (-> this (.createSubnetGroup request))))

(defn shutdown
  "Description copied from interface: AmazonDax"
  ([^AbstractAmazonDax this]
    (-> this (.shutdown))))

(defn create-parameter-group
  "Description copied from interface: AmazonDax

  request - `com.amazonaws.services.dax.model.CreateParameterGroupRequest`

  returns: Result of the CreateParameterGroup operation returned by the service. - `com.amazonaws.services.dax.model.CreateParameterGroupResult`"
  (^com.amazonaws.services.dax.model.CreateParameterGroupResult [^AbstractAmazonDax this ^com.amazonaws.services.dax.model.CreateParameterGroupRequest request]
    (-> this (.createParameterGroup request))))

(defn describe-events
  "Description copied from interface: AmazonDax

  request - `com.amazonaws.services.dax.model.DescribeEventsRequest`

  returns: Result of the DescribeEvents operation returned by the service. - `com.amazonaws.services.dax.model.DescribeEventsResult`"
  (^com.amazonaws.services.dax.model.DescribeEventsResult [^AbstractAmazonDax this ^com.amazonaws.services.dax.model.DescribeEventsRequest request]
    (-> this (.describeEvents request))))

(defn decrease-replication-factor
  "Description copied from interface: AmazonDax

  request - `com.amazonaws.services.dax.model.DecreaseReplicationFactorRequest`

  returns: Result of the DecreaseReplicationFactor operation returned by the service. - `com.amazonaws.services.dax.model.DecreaseReplicationFactorResult`"
  (^com.amazonaws.services.dax.model.DecreaseReplicationFactorResult [^AbstractAmazonDax this ^com.amazonaws.services.dax.model.DecreaseReplicationFactorRequest request]
    (-> this (.decreaseReplicationFactor request))))

(defn describe-default-parameters
  "Description copied from interface: AmazonDax

  request - `com.amazonaws.services.dax.model.DescribeDefaultParametersRequest`

  returns: Result of the DescribeDefaultParameters operation returned by the service. - `com.amazonaws.services.dax.model.DescribeDefaultParametersResult`"
  (^com.amazonaws.services.dax.model.DescribeDefaultParametersResult [^AbstractAmazonDax this ^com.amazonaws.services.dax.model.DescribeDefaultParametersRequest request]
    (-> this (.describeDefaultParameters request))))

(defn increase-replication-factor
  "Description copied from interface: AmazonDax

  request - `com.amazonaws.services.dax.model.IncreaseReplicationFactorRequest`

  returns: Result of the IncreaseReplicationFactor operation returned by the service. - `com.amazonaws.services.dax.model.IncreaseReplicationFactorResult`"
  (^com.amazonaws.services.dax.model.IncreaseReplicationFactorResult [^AbstractAmazonDax this ^com.amazonaws.services.dax.model.IncreaseReplicationFactorRequest request]
    (-> this (.increaseReplicationFactor request))))

(defn describe-parameters
  "Description copied from interface: AmazonDax

  request - `com.amazonaws.services.dax.model.DescribeParametersRequest`

  returns: Result of the DescribeParameters operation returned by the service. - `com.amazonaws.services.dax.model.DescribeParametersResult`"
  (^com.amazonaws.services.dax.model.DescribeParametersResult [^AbstractAmazonDax this ^com.amazonaws.services.dax.model.DescribeParametersRequest request]
    (-> this (.describeParameters request))))

(defn create-cluster
  "Description copied from interface: AmazonDax

  request - `com.amazonaws.services.dax.model.CreateClusterRequest`

  returns: Result of the CreateCluster operation returned by the service. - `com.amazonaws.services.dax.model.CreateClusterResult`"
  (^com.amazonaws.services.dax.model.CreateClusterResult [^AbstractAmazonDax this ^com.amazonaws.services.dax.model.CreateClusterRequest request]
    (-> this (.createCluster request))))

(defn describe-subnet-groups
  "Description copied from interface: AmazonDax

  request - `com.amazonaws.services.dax.model.DescribeSubnetGroupsRequest`

  returns: Result of the DescribeSubnetGroups operation returned by the service. - `com.amazonaws.services.dax.model.DescribeSubnetGroupsResult`"
  (^com.amazonaws.services.dax.model.DescribeSubnetGroupsResult [^AbstractAmazonDax this ^com.amazonaws.services.dax.model.DescribeSubnetGroupsRequest request]
    (-> this (.describeSubnetGroups request))))

(defn update-cluster
  "Description copied from interface: AmazonDax

  request - `com.amazonaws.services.dax.model.UpdateClusterRequest`

  returns: Result of the UpdateCluster operation returned by the service. - `com.amazonaws.services.dax.model.UpdateClusterResult`"
  (^com.amazonaws.services.dax.model.UpdateClusterResult [^AbstractAmazonDax this ^com.amazonaws.services.dax.model.UpdateClusterRequest request]
    (-> this (.updateCluster request))))

(defn delete-cluster
  "Description copied from interface: AmazonDax

  request - `com.amazonaws.services.dax.model.DeleteClusterRequest`

  returns: Result of the DeleteCluster operation returned by the service. - `com.amazonaws.services.dax.model.DeleteClusterResult`"
  (^com.amazonaws.services.dax.model.DeleteClusterResult [^AbstractAmazonDax this ^com.amazonaws.services.dax.model.DeleteClusterRequest request]
    (-> this (.deleteCluster request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonDax

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonDax this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn update-parameter-group
  "Description copied from interface: AmazonDax

  request - `com.amazonaws.services.dax.model.UpdateParameterGroupRequest`

  returns: Result of the UpdateParameterGroup operation returned by the service. - `com.amazonaws.services.dax.model.UpdateParameterGroupResult`"
  (^com.amazonaws.services.dax.model.UpdateParameterGroupResult [^AbstractAmazonDax this ^com.amazonaws.services.dax.model.UpdateParameterGroupRequest request]
    (-> this (.updateParameterGroup request))))

(defn tag-resource
  "Description copied from interface: AmazonDax

  request - `com.amazonaws.services.dax.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.dax.model.TagResourceResult`"
  (^com.amazonaws.services.dax.model.TagResourceResult [^AbstractAmazonDax this ^com.amazonaws.services.dax.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn describe-clusters
  "Description copied from interface: AmazonDax

  request - `com.amazonaws.services.dax.model.DescribeClustersRequest`

  returns: Result of the DescribeClusters operation returned by the service. - `com.amazonaws.services.dax.model.DescribeClustersResult`"
  (^com.amazonaws.services.dax.model.DescribeClustersResult [^AbstractAmazonDax this ^com.amazonaws.services.dax.model.DescribeClustersRequest request]
    (-> this (.describeClusters request))))

