(ns com.amazonaws.services.eks.AmazonEKSAsync
  "Interface for accessing Amazon EKS asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonEKSAsync instead.



  Amazon Elastic Kubernetes Service (Amazon EKS) is a managed service that makes it easy for you to run Kubernetes on
  AWS without needing to stand up or maintain your own Kubernetes control plane. Kubernetes is an open-source system
  for automating the deployment, scaling, and management of containerized applications.


  Amazon EKS runs up-to-date versions of the open-source Kubernetes software, so you can use all the existing plugins
  and tooling from the Kubernetes community. Applications running on Amazon EKS are fully compatible with applications
  running on any standard Kubernetes environment, whether running in on-premises data centers or public clouds. This
  means that you can easily migrate any standard Kubernetes application to Amazon EKS without any code modification
  required."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.eks AmazonEKSAsync]))

(defn create-cluster-async
  "Creates an Amazon EKS control plane.


   The Amazon EKS control plane consists of control plane instances that run the Kubernetes software, such as
   etcd and the API server. The control plane runs in an account managed by AWS, and the Kubernetes API
   is exposed via the Amazon EKS API server endpoint. Each Amazon EKS cluster control plane is single-tenant and
   unique and runs on its own set of Amazon EC2 instances.


   The cluster control plane is provisioned across multiple Availability Zones and fronted by an Elastic Load
   Balancing Network Load Balancer. Amazon EKS also provisions elastic network interfaces in your VPC subnets to
   provide connectivity from the control plane instances to the worker nodes (for example, to support
   kubectl exec, logs, and proxy data flows).


   Amazon EKS worker nodes run in your AWS account and connect to your cluster's control plane via the Kubernetes
   API server endpoint and a certificate file that is created for your cluster.


   You can use the endpointPublicAccess and endpointPrivateAccess parameters to enable or
   disable public and private access to your cluster's Kubernetes API server endpoint. By default, public access is
   enabled, and private access is disabled. For more information, see Amazon EKS Cluster Endpoint Access
   Control in the  Amazon EKS User Guide .


   You can use the logging parameter to enable or disable exporting the Kubernetes control plane logs
   for your cluster to CloudWatch Logs. By default, cluster control plane logs aren't exported to CloudWatch Logs.
   For more information, see Amazon EKS Cluster Control Plane
   Logs in the  Amazon EKS User Guide .



   CloudWatch Logs ingestion, archive storage, and data scanning rates apply to exported control plane logs. For
   more information, see Amazon CloudWatch Pricing.



   Cluster creation typically takes between 10 and 15 minutes. After you create an Amazon EKS cluster, you must
   configure your Kubernetes tooling to communicate with the API server and launch worker nodes into your cluster.
   For more information, see Managing
   Cluster Authentication and Launching Amazon EKS Worker Nodes
   in the Amazon EKS User Guide.

  create-cluster-request - `com.amazonaws.services.eks.model.CreateClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eks.model.CreateClusterResult>`"
  (^java.util.concurrent.Future [^AmazonEKSAsync this ^com.amazonaws.services.eks.model.CreateClusterRequest create-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createClusterAsync create-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEKSAsync this ^com.amazonaws.services.eks.model.CreateClusterRequest create-cluster-request]
    (-> this (.createClusterAsync create-cluster-request))))

(defn delete-cluster-async
  "Deletes the Amazon EKS cluster control plane.



   If you have active services in your cluster that are associated with a load balancer, you must delete those
   services before deleting the cluster so that the load balancers are deleted properly. Otherwise, you can have
   orphaned resources in your VPC that prevent you from being able to delete the VPC. For more information, see Deleting a Cluster in the
   Amazon EKS User Guide.

  delete-cluster-request - `com.amazonaws.services.eks.model.DeleteClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eks.model.DeleteClusterResult>`"
  (^java.util.concurrent.Future [^AmazonEKSAsync this ^com.amazonaws.services.eks.model.DeleteClusterRequest delete-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteClusterAsync delete-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEKSAsync this ^com.amazonaws.services.eks.model.DeleteClusterRequest delete-cluster-request]
    (-> this (.deleteClusterAsync delete-cluster-request))))

(defn describe-cluster-async
  "Returns descriptive information about an Amazon EKS cluster.


   The API server endpoint and certificate authority data returned by this operation are required for
   kubelet and kubectl to communicate with your Kubernetes API server. For more
   information, see Create a
   kubeconfig for Amazon EKS.



   The API server endpoint and certificate authority data aren't available until the cluster reaches the
   ACTIVE state.

  describe-cluster-request - `com.amazonaws.services.eks.model.DescribeClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eks.model.DescribeClusterResult>`"
  (^java.util.concurrent.Future [^AmazonEKSAsync this ^com.amazonaws.services.eks.model.DescribeClusterRequest describe-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClusterAsync describe-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEKSAsync this ^com.amazonaws.services.eks.model.DescribeClusterRequest describe-cluster-request]
    (-> this (.describeClusterAsync describe-cluster-request))))

(defn describe-update-async
  "Returns descriptive information about an update against your Amazon EKS cluster.


   When the status of the update is Succeeded, the update is complete. If an update fails, the status
   is Failed, and an error detail explains the reason for the failure.

  describe-update-request - `com.amazonaws.services.eks.model.DescribeUpdateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeUpdate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eks.model.DescribeUpdateResult>`"
  (^java.util.concurrent.Future [^AmazonEKSAsync this ^com.amazonaws.services.eks.model.DescribeUpdateRequest describe-update-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeUpdateAsync describe-update-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEKSAsync this ^com.amazonaws.services.eks.model.DescribeUpdateRequest describe-update-request]
    (-> this (.describeUpdateAsync describe-update-request))))

(defn list-clusters-async
  "Lists the Amazon EKS clusters in your AWS account in the specified Region.

  list-clusters-request - `com.amazonaws.services.eks.model.ListClustersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListClusters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eks.model.ListClustersResult>`"
  (^java.util.concurrent.Future [^AmazonEKSAsync this ^com.amazonaws.services.eks.model.ListClustersRequest list-clusters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listClustersAsync list-clusters-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEKSAsync this ^com.amazonaws.services.eks.model.ListClustersRequest list-clusters-request]
    (-> this (.listClustersAsync list-clusters-request))))

(defn list-updates-async
  "Lists the updates associated with an Amazon EKS cluster in your AWS account, in the specified Region.

  list-updates-request - `com.amazonaws.services.eks.model.ListUpdatesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUpdates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eks.model.ListUpdatesResult>`"
  (^java.util.concurrent.Future [^AmazonEKSAsync this ^com.amazonaws.services.eks.model.ListUpdatesRequest list-updates-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUpdatesAsync list-updates-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEKSAsync this ^com.amazonaws.services.eks.model.ListUpdatesRequest list-updates-request]
    (-> this (.listUpdatesAsync list-updates-request))))

(defn update-cluster-config-async
  "Updates an Amazon EKS cluster configuration. Your cluster continues to function during the update. The response
   output includes an update ID that you can use to track the status of your cluster update with the
   DescribeUpdate API operation.


   You can use this API operation to enable or disable exporting the Kubernetes control plane logs for your cluster
   to CloudWatch Logs. By default, cluster control plane logs aren't exported to CloudWatch Logs. For more
   information, see Amazon EKS
   Cluster Control Plane Logs in the  Amazon EKS User Guide .



   CloudWatch Logs ingestion, archive storage, and data scanning rates apply to exported control plane logs. For
   more information, see Amazon CloudWatch Pricing.



   You can also use this API operation to enable or disable public and private access to your cluster's Kubernetes
   API server endpoint. By default, public access is enabled, and private access is disabled. For more information,
   see Amazon EKS Cluster Endpoint
   Access Control in the  Amazon EKS User Guide .



   At this time, you can not update the subnets or security group IDs for an existing cluster.



   Cluster updates are asynchronous, and they should finish within a few minutes. During an update, the cluster
   status moves to UPDATING (this status transition is eventually consistent). When the update is
   complete (either Failed or Successful), the cluster status moves to Active
   .

  update-cluster-config-request - `com.amazonaws.services.eks.model.UpdateClusterConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateClusterConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eks.model.UpdateClusterConfigResult>`"
  (^java.util.concurrent.Future [^AmazonEKSAsync this ^com.amazonaws.services.eks.model.UpdateClusterConfigRequest update-cluster-config-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateClusterConfigAsync update-cluster-config-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEKSAsync this ^com.amazonaws.services.eks.model.UpdateClusterConfigRequest update-cluster-config-request]
    (-> this (.updateClusterConfigAsync update-cluster-config-request))))

(defn update-cluster-version-async
  "Updates an Amazon EKS cluster to the specified Kubernetes version. Your cluster continues to function during the
   update. The response output includes an update ID that you can use to track the status of your cluster update
   with the DescribeUpdate API operation.


   Cluster updates are asynchronous, and they should finish within a few minutes. During an update, the cluster
   status moves to UPDATING (this status transition is eventually consistent). When the update is
   complete (either Failed or Successful), the cluster status moves to Active
   .

  update-cluster-version-request - `com.amazonaws.services.eks.model.UpdateClusterVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateClusterVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eks.model.UpdateClusterVersionResult>`"
  (^java.util.concurrent.Future [^AmazonEKSAsync this ^com.amazonaws.services.eks.model.UpdateClusterVersionRequest update-cluster-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateClusterVersionAsync update-cluster-version-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEKSAsync this ^com.amazonaws.services.eks.model.UpdateClusterVersionRequest update-cluster-version-request]
    (-> this (.updateClusterVersionAsync update-cluster-version-request))))

