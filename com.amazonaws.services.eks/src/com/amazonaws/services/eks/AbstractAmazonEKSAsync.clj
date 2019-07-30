(ns com.amazonaws.services.eks.AbstractAmazonEKSAsync
  "Abstract implementation of AmazonEKSAsync. Convenient method forms pass through to the corresponding overload
  that takes a request object and an AsyncHandler, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.eks AbstractAmazonEKSAsync]))

(defn create-cluster-async
  "Description copied from interface: AmazonEKSAsync

  request - `com.amazonaws.services.eks.model.CreateClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eks.model.CreateClusterResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonEKSAsync this ^com.amazonaws.services.eks.model.CreateClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonEKSAsync this ^com.amazonaws.services.eks.model.CreateClusterRequest request]
    (-> this (.createClusterAsync request))))

(defn delete-cluster-async
  "Description copied from interface: AmazonEKSAsync

  request - `com.amazonaws.services.eks.model.DeleteClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eks.model.DeleteClusterResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonEKSAsync this ^com.amazonaws.services.eks.model.DeleteClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonEKSAsync this ^com.amazonaws.services.eks.model.DeleteClusterRequest request]
    (-> this (.deleteClusterAsync request))))

(defn describe-cluster-async
  "Description copied from interface: AmazonEKSAsync

  request - `com.amazonaws.services.eks.model.DescribeClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eks.model.DescribeClusterResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonEKSAsync this ^com.amazonaws.services.eks.model.DescribeClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonEKSAsync this ^com.amazonaws.services.eks.model.DescribeClusterRequest request]
    (-> this (.describeClusterAsync request))))

(defn describe-update-async
  "Description copied from interface: AmazonEKSAsync

  request - `com.amazonaws.services.eks.model.DescribeUpdateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeUpdate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eks.model.DescribeUpdateResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonEKSAsync this ^com.amazonaws.services.eks.model.DescribeUpdateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeUpdateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonEKSAsync this ^com.amazonaws.services.eks.model.DescribeUpdateRequest request]
    (-> this (.describeUpdateAsync request))))

(defn list-clusters-async
  "Description copied from interface: AmazonEKSAsync

  request - `com.amazonaws.services.eks.model.ListClustersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListClusters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eks.model.ListClustersResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonEKSAsync this ^com.amazonaws.services.eks.model.ListClustersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listClustersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonEKSAsync this ^com.amazonaws.services.eks.model.ListClustersRequest request]
    (-> this (.listClustersAsync request))))

(defn list-updates-async
  "Description copied from interface: AmazonEKSAsync

  request - `com.amazonaws.services.eks.model.ListUpdatesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUpdates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eks.model.ListUpdatesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonEKSAsync this ^com.amazonaws.services.eks.model.ListUpdatesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUpdatesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonEKSAsync this ^com.amazonaws.services.eks.model.ListUpdatesRequest request]
    (-> this (.listUpdatesAsync request))))

(defn update-cluster-config-async
  "Description copied from interface: AmazonEKSAsync

  request - `com.amazonaws.services.eks.model.UpdateClusterConfigRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateClusterConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eks.model.UpdateClusterConfigResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonEKSAsync this ^com.amazonaws.services.eks.model.UpdateClusterConfigRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateClusterConfigAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonEKSAsync this ^com.amazonaws.services.eks.model.UpdateClusterConfigRequest request]
    (-> this (.updateClusterConfigAsync request))))

(defn update-cluster-version-async
  "Description copied from interface: AmazonEKSAsync

  request - `com.amazonaws.services.eks.model.UpdateClusterVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateClusterVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eks.model.UpdateClusterVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonEKSAsync this ^com.amazonaws.services.eks.model.UpdateClusterVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateClusterVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonEKSAsync this ^com.amazonaws.services.eks.model.UpdateClusterVersionRequest request]
    (-> this (.updateClusterVersionAsync request))))

