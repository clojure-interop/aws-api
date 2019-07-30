(ns com.amazonaws.services.eks.AmazonEKS
  "Interface for accessing Amazon EKS.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonEKS instead.



  Amazon Elastic Kubernetes Service (Amazon EKS) is a managed service that makes it easy for you to run Kubernetes on
  AWS without needing to stand up or maintain your own Kubernetes control plane. Kubernetes is an open-source system
  for automating the deployment, scaling, and management of containerized applications.


  Amazon EKS runs up-to-date versions of the open-source Kubernetes software, so you can use all the existing plugins
  and tooling from the Kubernetes community. Applications running on Amazon EKS are fully compatible with applications
  running on any standard Kubernetes environment, whether running in on-premises data centers or public clouds. This
  means that you can easily migrate any standard Kubernetes application to Amazon EKS without any code modification
  required."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.eks AmazonEKS]))

(defn update-cluster-config
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

  returns: Result of the UpdateClusterConfig operation returned by the service. - `com.amazonaws.services.eks.model.UpdateClusterConfigResult`

  throws: com.amazonaws.services.eks.model.InvalidParameterException - The specified parameter is invalid. Review the available parameters for the API request."
  (^com.amazonaws.services.eks.model.UpdateClusterConfigResult [^AmazonEKS this ^com.amazonaws.services.eks.model.UpdateClusterConfigRequest update-cluster-config-request]
    (-> this (.updateClusterConfig update-cluster-config-request))))

(defn describe-cluster
  "Returns descriptive information about an Amazon EKS cluster.


   The API server endpoint and certificate authority data returned by this operation are required for
   kubelet and kubectl to communicate with your Kubernetes API server. For more
   information, see Create a
   kubeconfig for Amazon EKS.



   The API server endpoint and certificate authority data aren't available until the cluster reaches the
   ACTIVE state.

  describe-cluster-request - `com.amazonaws.services.eks.model.DescribeClusterRequest`

  returns: Result of the DescribeCluster operation returned by the service. - `com.amazonaws.services.eks.model.DescribeClusterResult`

  throws: com.amazonaws.services.eks.model.ResourceNotFoundException - The specified resource could not be found. You can view your available clusters with ListClusters. Amazon EKS clusters are Region-specific."
  (^com.amazonaws.services.eks.model.DescribeClusterResult [^AmazonEKS this ^com.amazonaws.services.eks.model.DescribeClusterRequest describe-cluster-request]
    (-> this (.describeCluster describe-cluster-request))))

(defn waiters
  "returns: `com.amazonaws.services.eks.waiters.AmazonEKSWaiters`"
  (^com.amazonaws.services.eks.waiters.AmazonEKSWaiters [^AmazonEKS this]
    (-> this (.waiters))))

(defn list-updates
  "Lists the updates associated with an Amazon EKS cluster in your AWS account, in the specified Region.

  list-updates-request - `com.amazonaws.services.eks.model.ListUpdatesRequest`

  returns: Result of the ListUpdates operation returned by the service. - `com.amazonaws.services.eks.model.ListUpdatesResult`

  throws: com.amazonaws.services.eks.model.InvalidParameterException - The specified parameter is invalid. Review the available parameters for the API request."
  (^com.amazonaws.services.eks.model.ListUpdatesResult [^AmazonEKS this ^com.amazonaws.services.eks.model.ListUpdatesRequest list-updates-request]
    (-> this (.listUpdates list-updates-request))))

(defn update-cluster-version
  "Updates an Amazon EKS cluster to the specified Kubernetes version. Your cluster continues to function during the
   update. The response output includes an update ID that you can use to track the status of your cluster update
   with the DescribeUpdate API operation.


   Cluster updates are asynchronous, and they should finish within a few minutes. During an update, the cluster
   status moves to UPDATING (this status transition is eventually consistent). When the update is
   complete (either Failed or Successful), the cluster status moves to Active
   .

  update-cluster-version-request - `com.amazonaws.services.eks.model.UpdateClusterVersionRequest`

  returns: Result of the UpdateClusterVersion operation returned by the service. - `com.amazonaws.services.eks.model.UpdateClusterVersionResult`

  throws: com.amazonaws.services.eks.model.InvalidParameterException - The specified parameter is invalid. Review the available parameters for the API request."
  (^com.amazonaws.services.eks.model.UpdateClusterVersionResult [^AmazonEKS this ^com.amazonaws.services.eks.model.UpdateClusterVersionRequest update-cluster-version-request]
    (-> this (.updateClusterVersion update-cluster-version-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonEKS this]
    (-> this (.shutdown))))

(defn describe-update
  "Returns descriptive information about an update against your Amazon EKS cluster.


   When the status of the update is Succeeded, the update is complete. If an update fails, the status
   is Failed, and an error detail explains the reason for the failure.

  describe-update-request - `com.amazonaws.services.eks.model.DescribeUpdateRequest`

  returns: Result of the DescribeUpdate operation returned by the service. - `com.amazonaws.services.eks.model.DescribeUpdateResult`

  throws: com.amazonaws.services.eks.model.InvalidParameterException - The specified parameter is invalid. Review the available parameters for the API request."
  (^com.amazonaws.services.eks.model.DescribeUpdateResult [^AmazonEKS this ^com.amazonaws.services.eks.model.DescribeUpdateRequest describe-update-request]
    (-> this (.describeUpdate describe-update-request))))

(defn create-cluster
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

  returns: Result of the CreateCluster operation returned by the service. - `com.amazonaws.services.eks.model.CreateClusterResult`

  throws: com.amazonaws.services.eks.model.ResourceInUseException - The specified resource is in use."
  (^com.amazonaws.services.eks.model.CreateClusterResult [^AmazonEKS this ^com.amazonaws.services.eks.model.CreateClusterRequest create-cluster-request]
    (-> this (.createCluster create-cluster-request))))

(defn delete-cluster
  "Deletes the Amazon EKS cluster control plane.



   If you have active services in your cluster that are associated with a load balancer, you must delete those
   services before deleting the cluster so that the load balancers are deleted properly. Otherwise, you can have
   orphaned resources in your VPC that prevent you from being able to delete the VPC. For more information, see Deleting a Cluster in the
   Amazon EKS User Guide.

  delete-cluster-request - `com.amazonaws.services.eks.model.DeleteClusterRequest`

  returns: Result of the DeleteCluster operation returned by the service. - `com.amazonaws.services.eks.model.DeleteClusterResult`

  throws: com.amazonaws.services.eks.model.ResourceInUseException - The specified resource is in use."
  (^com.amazonaws.services.eks.model.DeleteClusterResult [^AmazonEKS this ^com.amazonaws.services.eks.model.DeleteClusterRequest delete-cluster-request]
    (-> this (.deleteCluster delete-cluster-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonEKS this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn list-clusters
  "Lists the Amazon EKS clusters in your AWS account in the specified Region.

  list-clusters-request - `com.amazonaws.services.eks.model.ListClustersRequest`

  returns: Result of the ListClusters operation returned by the service. - `com.amazonaws.services.eks.model.ListClustersResult`

  throws: com.amazonaws.services.eks.model.InvalidParameterException - The specified parameter is invalid. Review the available parameters for the API request."
  (^com.amazonaws.services.eks.model.ListClustersResult [^AmazonEKS this ^com.amazonaws.services.eks.model.ListClustersRequest list-clusters-request]
    (-> this (.listClusters list-clusters-request))))

