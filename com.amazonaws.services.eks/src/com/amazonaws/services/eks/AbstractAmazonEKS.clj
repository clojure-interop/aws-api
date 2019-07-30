(ns com.amazonaws.services.eks.AbstractAmazonEKS
  "Abstract implementation of AmazonEKS. Convenient method forms pass through to the corresponding overload that
  takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.eks AbstractAmazonEKS]))

(defn update-cluster-config
  "Description copied from interface: AmazonEKS

  request - `com.amazonaws.services.eks.model.UpdateClusterConfigRequest`

  returns: Result of the UpdateClusterConfig operation returned by the service. - `com.amazonaws.services.eks.model.UpdateClusterConfigResult`"
  (^com.amazonaws.services.eks.model.UpdateClusterConfigResult [^AbstractAmazonEKS this ^com.amazonaws.services.eks.model.UpdateClusterConfigRequest request]
    (-> this (.updateClusterConfig request))))

(defn describe-cluster
  "Description copied from interface: AmazonEKS

  request - `com.amazonaws.services.eks.model.DescribeClusterRequest`

  returns: Result of the DescribeCluster operation returned by the service. - `com.amazonaws.services.eks.model.DescribeClusterResult`"
  (^com.amazonaws.services.eks.model.DescribeClusterResult [^AbstractAmazonEKS this ^com.amazonaws.services.eks.model.DescribeClusterRequest request]
    (-> this (.describeCluster request))))

(defn waiters
  "returns: `com.amazonaws.services.eks.waiters.AmazonEKSWaiters`"
  (^com.amazonaws.services.eks.waiters.AmazonEKSWaiters [^AbstractAmazonEKS this]
    (-> this (.waiters))))

(defn list-updates
  "Description copied from interface: AmazonEKS

  request - `com.amazonaws.services.eks.model.ListUpdatesRequest`

  returns: Result of the ListUpdates operation returned by the service. - `com.amazonaws.services.eks.model.ListUpdatesResult`"
  (^com.amazonaws.services.eks.model.ListUpdatesResult [^AbstractAmazonEKS this ^com.amazonaws.services.eks.model.ListUpdatesRequest request]
    (-> this (.listUpdates request))))

(defn update-cluster-version
  "Description copied from interface: AmazonEKS

  request - `com.amazonaws.services.eks.model.UpdateClusterVersionRequest`

  returns: Result of the UpdateClusterVersion operation returned by the service. - `com.amazonaws.services.eks.model.UpdateClusterVersionResult`"
  (^com.amazonaws.services.eks.model.UpdateClusterVersionResult [^AbstractAmazonEKS this ^com.amazonaws.services.eks.model.UpdateClusterVersionRequest request]
    (-> this (.updateClusterVersion request))))

(defn shutdown
  "Description copied from interface: AmazonEKS"
  ([^AbstractAmazonEKS this]
    (-> this (.shutdown))))

(defn describe-update
  "Description copied from interface: AmazonEKS

  request - `com.amazonaws.services.eks.model.DescribeUpdateRequest`

  returns: Result of the DescribeUpdate operation returned by the service. - `com.amazonaws.services.eks.model.DescribeUpdateResult`"
  (^com.amazonaws.services.eks.model.DescribeUpdateResult [^AbstractAmazonEKS this ^com.amazonaws.services.eks.model.DescribeUpdateRequest request]
    (-> this (.describeUpdate request))))

(defn create-cluster
  "Description copied from interface: AmazonEKS

  request - `com.amazonaws.services.eks.model.CreateClusterRequest`

  returns: Result of the CreateCluster operation returned by the service. - `com.amazonaws.services.eks.model.CreateClusterResult`"
  (^com.amazonaws.services.eks.model.CreateClusterResult [^AbstractAmazonEKS this ^com.amazonaws.services.eks.model.CreateClusterRequest request]
    (-> this (.createCluster request))))

(defn delete-cluster
  "Description copied from interface: AmazonEKS

  request - `com.amazonaws.services.eks.model.DeleteClusterRequest`

  returns: Result of the DeleteCluster operation returned by the service. - `com.amazonaws.services.eks.model.DeleteClusterResult`"
  (^com.amazonaws.services.eks.model.DeleteClusterResult [^AbstractAmazonEKS this ^com.amazonaws.services.eks.model.DeleteClusterRequest request]
    (-> this (.deleteCluster request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonEKS

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonEKS this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn list-clusters
  "Description copied from interface: AmazonEKS

  request - `com.amazonaws.services.eks.model.ListClustersRequest`

  returns: Result of the ListClusters operation returned by the service. - `com.amazonaws.services.eks.model.ListClustersResult`"
  (^com.amazonaws.services.eks.model.ListClustersResult [^AbstractAmazonEKS this ^com.amazonaws.services.eks.model.ListClustersRequest request]
    (-> this (.listClusters request))))

