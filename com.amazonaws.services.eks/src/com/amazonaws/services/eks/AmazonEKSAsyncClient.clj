(ns com.amazonaws.services.eks.AmazonEKSAsyncClient
  "Client for accessing Amazon EKS asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.


  Amazon Elastic Kubernetes Service (Amazon EKS) is a managed service that makes it easy for you to run Kubernetes on
  AWS without needing to stand up or maintain your own Kubernetes control plane. Kubernetes is an open-source system
  for automating the deployment, scaling, and management of containerized applications.


  Amazon EKS runs up-to-date versions of the open-source Kubernetes software, so you can use all the existing plugins
  and tooling from the Kubernetes community. Applications running on Amazon EKS are fully compatible with applications
  running on any standard Kubernetes environment, whether running in on-premises data centers or public clouds. This
  means that you can easily migrate any standard Kubernetes application to Amazon EKS without any code modification
  required."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.eks AmazonEKSAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.eks.AmazonEKSAsyncClientBuilder`"
  (^com.amazonaws.services.eks.AmazonEKSAsyncClientBuilder []
    (AmazonEKSAsyncClient/asyncBuilder )))

(defn create-cluster-async
  "Description copied from interface: AmazonEKSAsync

  request - `com.amazonaws.services.eks.model.CreateClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eks.model.CreateClusterResult>`"
  (^java.util.concurrent.Future [^AmazonEKSAsyncClient this ^com.amazonaws.services.eks.model.CreateClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEKSAsyncClient this ^com.amazonaws.services.eks.model.CreateClusterRequest request]
    (-> this (.createClusterAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonEKSAsyncClient this]
    (-> this (.getExecutorService))))

(defn update-cluster-version-async
  "Description copied from interface: AmazonEKSAsync

  request - `com.amazonaws.services.eks.model.UpdateClusterVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateClusterVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eks.model.UpdateClusterVersionResult>`"
  (^java.util.concurrent.Future [^AmazonEKSAsyncClient this ^com.amazonaws.services.eks.model.UpdateClusterVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateClusterVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEKSAsyncClient this ^com.amazonaws.services.eks.model.UpdateClusterVersionRequest request]
    (-> this (.updateClusterVersionAsync request))))

(defn list-updates-async
  "Description copied from interface: AmazonEKSAsync

  request - `com.amazonaws.services.eks.model.ListUpdatesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUpdates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eks.model.ListUpdatesResult>`"
  (^java.util.concurrent.Future [^AmazonEKSAsyncClient this ^com.amazonaws.services.eks.model.ListUpdatesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUpdatesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEKSAsyncClient this ^com.amazonaws.services.eks.model.ListUpdatesRequest request]
    (-> this (.listUpdatesAsync request))))

(defn describe-update-async
  "Description copied from interface: AmazonEKSAsync

  request - `com.amazonaws.services.eks.model.DescribeUpdateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeUpdate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eks.model.DescribeUpdateResult>`"
  (^java.util.concurrent.Future [^AmazonEKSAsyncClient this ^com.amazonaws.services.eks.model.DescribeUpdateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeUpdateAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEKSAsyncClient this ^com.amazonaws.services.eks.model.DescribeUpdateRequest request]
    (-> this (.describeUpdateAsync request))))

(defn delete-cluster-async
  "Description copied from interface: AmazonEKSAsync

  request - `com.amazonaws.services.eks.model.DeleteClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eks.model.DeleteClusterResult>`"
  (^java.util.concurrent.Future [^AmazonEKSAsyncClient this ^com.amazonaws.services.eks.model.DeleteClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEKSAsyncClient this ^com.amazonaws.services.eks.model.DeleteClusterRequest request]
    (-> this (.deleteClusterAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonEKSAsyncClient this]
    (-> this (.shutdown))))

(defn list-clusters-async
  "Description copied from interface: AmazonEKSAsync

  request - `com.amazonaws.services.eks.model.ListClustersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListClusters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eks.model.ListClustersResult>`"
  (^java.util.concurrent.Future [^AmazonEKSAsyncClient this ^com.amazonaws.services.eks.model.ListClustersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listClustersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEKSAsyncClient this ^com.amazonaws.services.eks.model.ListClustersRequest request]
    (-> this (.listClustersAsync request))))

(defn describe-cluster-async
  "Description copied from interface: AmazonEKSAsync

  request - `com.amazonaws.services.eks.model.DescribeClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eks.model.DescribeClusterResult>`"
  (^java.util.concurrent.Future [^AmazonEKSAsyncClient this ^com.amazonaws.services.eks.model.DescribeClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEKSAsyncClient this ^com.amazonaws.services.eks.model.DescribeClusterRequest request]
    (-> this (.describeClusterAsync request))))

(defn update-cluster-config-async
  "Description copied from interface: AmazonEKSAsync

  request - `com.amazonaws.services.eks.model.UpdateClusterConfigRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateClusterConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eks.model.UpdateClusterConfigResult>`"
  (^java.util.concurrent.Future [^AmazonEKSAsyncClient this ^com.amazonaws.services.eks.model.UpdateClusterConfigRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateClusterConfigAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEKSAsyncClient this ^com.amazonaws.services.eks.model.UpdateClusterConfigRequest request]
    (-> this (.updateClusterConfigAsync request))))

