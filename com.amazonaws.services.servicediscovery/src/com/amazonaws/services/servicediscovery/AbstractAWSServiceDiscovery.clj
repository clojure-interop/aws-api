(ns com.amazonaws.services.servicediscovery.AbstractAWSServiceDiscovery
  "Abstract implementation of AWSServiceDiscovery. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.servicediscovery AbstractAWSServiceDiscovery]))

(defn create-service
  "Description copied from interface: AWSServiceDiscovery

  request - `com.amazonaws.services.servicediscovery.model.CreateServiceRequest`

  returns: Result of the CreateService operation returned by the service. - `com.amazonaws.services.servicediscovery.model.CreateServiceResult`"
  (^com.amazonaws.services.servicediscovery.model.CreateServiceResult [^AbstractAWSServiceDiscovery this ^com.amazonaws.services.servicediscovery.model.CreateServiceRequest request]
    (-> this (.createService request))))

(defn list-services
  "Description copied from interface: AWSServiceDiscovery

  request - `com.amazonaws.services.servicediscovery.model.ListServicesRequest`

  returns: Result of the ListServices operation returned by the service. - `com.amazonaws.services.servicediscovery.model.ListServicesResult`"
  (^com.amazonaws.services.servicediscovery.model.ListServicesResult [^AbstractAWSServiceDiscovery this ^com.amazonaws.services.servicediscovery.model.ListServicesRequest request]
    (-> this (.listServices request))))

(defn delete-service
  "Description copied from interface: AWSServiceDiscovery

  request - `com.amazonaws.services.servicediscovery.model.DeleteServiceRequest`

  returns: Result of the DeleteService operation returned by the service. - `com.amazonaws.services.servicediscovery.model.DeleteServiceResult`"
  (^com.amazonaws.services.servicediscovery.model.DeleteServiceResult [^AbstractAWSServiceDiscovery this ^com.amazonaws.services.servicediscovery.model.DeleteServiceRequest request]
    (-> this (.deleteService request))))

(defn register-instance
  "Description copied from interface: AWSServiceDiscovery

  request - `com.amazonaws.services.servicediscovery.model.RegisterInstanceRequest`

  returns: Result of the RegisterInstance operation returned by the service. - `com.amazonaws.services.servicediscovery.model.RegisterInstanceResult`"
  (^com.amazonaws.services.servicediscovery.model.RegisterInstanceResult [^AbstractAWSServiceDiscovery this ^com.amazonaws.services.servicediscovery.model.RegisterInstanceRequest request]
    (-> this (.registerInstance request))))

(defn list-namespaces
  "Description copied from interface: AWSServiceDiscovery

  request - `com.amazonaws.services.servicediscovery.model.ListNamespacesRequest`

  returns: Result of the ListNamespaces operation returned by the service. - `com.amazonaws.services.servicediscovery.model.ListNamespacesResult`"
  (^com.amazonaws.services.servicediscovery.model.ListNamespacesResult [^AbstractAWSServiceDiscovery this ^com.amazonaws.services.servicediscovery.model.ListNamespacesRequest request]
    (-> this (.listNamespaces request))))

(defn discover-instances
  "Description copied from interface: AWSServiceDiscovery

  request - `com.amazonaws.services.servicediscovery.model.DiscoverInstancesRequest`

  returns: Result of the DiscoverInstances operation returned by the service. - `com.amazonaws.services.servicediscovery.model.DiscoverInstancesResult`"
  (^com.amazonaws.services.servicediscovery.model.DiscoverInstancesResult [^AbstractAWSServiceDiscovery this ^com.amazonaws.services.servicediscovery.model.DiscoverInstancesRequest request]
    (-> this (.discoverInstances request))))

(defn list-instances
  "Description copied from interface: AWSServiceDiscovery

  request - `com.amazonaws.services.servicediscovery.model.ListInstancesRequest`

  returns: Result of the ListInstances operation returned by the service. - `com.amazonaws.services.servicediscovery.model.ListInstancesResult`"
  (^com.amazonaws.services.servicediscovery.model.ListInstancesResult [^AbstractAWSServiceDiscovery this ^com.amazonaws.services.servicediscovery.model.ListInstancesRequest request]
    (-> this (.listInstances request))))

(defn get-namespace
  "Description copied from interface: AWSServiceDiscovery

  request - `com.amazonaws.services.servicediscovery.model.GetNamespaceRequest`

  returns: Result of the GetNamespace operation returned by the service. - `com.amazonaws.services.servicediscovery.model.GetNamespaceResult`"
  (^com.amazonaws.services.servicediscovery.model.GetNamespaceResult [^AbstractAWSServiceDiscovery this ^com.amazonaws.services.servicediscovery.model.GetNamespaceRequest request]
    (-> this (.getNamespace request))))

(defn create-private-dns-namespace
  "Description copied from interface: AWSServiceDiscovery

  request - `com.amazonaws.services.servicediscovery.model.CreatePrivateDnsNamespaceRequest`

  returns: Result of the CreatePrivateDnsNamespace operation returned by the service. - `com.amazonaws.services.servicediscovery.model.CreatePrivateDnsNamespaceResult`"
  (^com.amazonaws.services.servicediscovery.model.CreatePrivateDnsNamespaceResult [^AbstractAWSServiceDiscovery this ^com.amazonaws.services.servicediscovery.model.CreatePrivateDnsNamespaceRequest request]
    (-> this (.createPrivateDnsNamespace request))))

(defn get-service
  "Description copied from interface: AWSServiceDiscovery

  request - `com.amazonaws.services.servicediscovery.model.GetServiceRequest`

  returns: Result of the GetService operation returned by the service. - `com.amazonaws.services.servicediscovery.model.GetServiceResult`"
  (^com.amazonaws.services.servicediscovery.model.GetServiceResult [^AbstractAWSServiceDiscovery this ^com.amazonaws.services.servicediscovery.model.GetServiceRequest request]
    (-> this (.getService request))))

(defn deregister-instance
  "Description copied from interface: AWSServiceDiscovery

  request - `com.amazonaws.services.servicediscovery.model.DeregisterInstanceRequest`

  returns: Result of the DeregisterInstance operation returned by the service. - `com.amazonaws.services.servicediscovery.model.DeregisterInstanceResult`"
  (^com.amazonaws.services.servicediscovery.model.DeregisterInstanceResult [^AbstractAWSServiceDiscovery this ^com.amazonaws.services.servicediscovery.model.DeregisterInstanceRequest request]
    (-> this (.deregisterInstance request))))

(defn shutdown
  "Description copied from interface: AWSServiceDiscovery"
  ([^AbstractAWSServiceDiscovery this]
    (-> this (.shutdown))))

(defn get-instance
  "Description copied from interface: AWSServiceDiscovery

  request - `com.amazonaws.services.servicediscovery.model.GetInstanceRequest`

  returns: Result of the GetInstance operation returned by the service. - `com.amazonaws.services.servicediscovery.model.GetInstanceResult`"
  (^com.amazonaws.services.servicediscovery.model.GetInstanceResult [^AbstractAWSServiceDiscovery this ^com.amazonaws.services.servicediscovery.model.GetInstanceRequest request]
    (-> this (.getInstance request))))

(defn update-service
  "Description copied from interface: AWSServiceDiscovery

  request - `com.amazonaws.services.servicediscovery.model.UpdateServiceRequest`

  returns: Result of the UpdateService operation returned by the service. - `com.amazonaws.services.servicediscovery.model.UpdateServiceResult`"
  (^com.amazonaws.services.servicediscovery.model.UpdateServiceResult [^AbstractAWSServiceDiscovery this ^com.amazonaws.services.servicediscovery.model.UpdateServiceRequest request]
    (-> this (.updateService request))))

(defn create-public-dns-namespace
  "Description copied from interface: AWSServiceDiscovery

  request - `com.amazonaws.services.servicediscovery.model.CreatePublicDnsNamespaceRequest`

  returns: Result of the CreatePublicDnsNamespace operation returned by the service. - `com.amazonaws.services.servicediscovery.model.CreatePublicDnsNamespaceResult`"
  (^com.amazonaws.services.servicediscovery.model.CreatePublicDnsNamespaceResult [^AbstractAWSServiceDiscovery this ^com.amazonaws.services.servicediscovery.model.CreatePublicDnsNamespaceRequest request]
    (-> this (.createPublicDnsNamespace request))))

(defn get-operation
  "Description copied from interface: AWSServiceDiscovery

  request - `com.amazonaws.services.servicediscovery.model.GetOperationRequest`

  returns: Result of the GetOperation operation returned by the service. - `com.amazonaws.services.servicediscovery.model.GetOperationResult`"
  (^com.amazonaws.services.servicediscovery.model.GetOperationResult [^AbstractAWSServiceDiscovery this ^com.amazonaws.services.servicediscovery.model.GetOperationRequest request]
    (-> this (.getOperation request))))

(defn create-http-namespace
  "Description copied from interface: AWSServiceDiscovery

  request - `com.amazonaws.services.servicediscovery.model.CreateHttpNamespaceRequest`

  returns: Result of the CreateHttpNamespace operation returned by the service. - `com.amazonaws.services.servicediscovery.model.CreateHttpNamespaceResult`"
  (^com.amazonaws.services.servicediscovery.model.CreateHttpNamespaceResult [^AbstractAWSServiceDiscovery this ^com.amazonaws.services.servicediscovery.model.CreateHttpNamespaceRequest request]
    (-> this (.createHttpNamespace request))))

(defn update-instance-custom-health-status
  "Description copied from interface: AWSServiceDiscovery

  request - `com.amazonaws.services.servicediscovery.model.UpdateInstanceCustomHealthStatusRequest`

  returns: Result of the UpdateInstanceCustomHealthStatus operation returned by the service. - `com.amazonaws.services.servicediscovery.model.UpdateInstanceCustomHealthStatusResult`"
  (^com.amazonaws.services.servicediscovery.model.UpdateInstanceCustomHealthStatusResult [^AbstractAWSServiceDiscovery this ^com.amazonaws.services.servicediscovery.model.UpdateInstanceCustomHealthStatusRequest request]
    (-> this (.updateInstanceCustomHealthStatus request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSServiceDiscovery

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSServiceDiscovery this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn delete-namespace
  "Description copied from interface: AWSServiceDiscovery

  request - `com.amazonaws.services.servicediscovery.model.DeleteNamespaceRequest`

  returns: Result of the DeleteNamespace operation returned by the service. - `com.amazonaws.services.servicediscovery.model.DeleteNamespaceResult`"
  (^com.amazonaws.services.servicediscovery.model.DeleteNamespaceResult [^AbstractAWSServiceDiscovery this ^com.amazonaws.services.servicediscovery.model.DeleteNamespaceRequest request]
    (-> this (.deleteNamespace request))))

(defn get-instances-health-status
  "Description copied from interface: AWSServiceDiscovery

  request - `com.amazonaws.services.servicediscovery.model.GetInstancesHealthStatusRequest`

  returns: Result of the GetInstancesHealthStatus operation returned by the service. - `com.amazonaws.services.servicediscovery.model.GetInstancesHealthStatusResult`"
  (^com.amazonaws.services.servicediscovery.model.GetInstancesHealthStatusResult [^AbstractAWSServiceDiscovery this ^com.amazonaws.services.servicediscovery.model.GetInstancesHealthStatusRequest request]
    (-> this (.getInstancesHealthStatus request))))

(defn list-operations
  "Description copied from interface: AWSServiceDiscovery

  request - `com.amazonaws.services.servicediscovery.model.ListOperationsRequest`

  returns: Result of the ListOperations operation returned by the service. - `com.amazonaws.services.servicediscovery.model.ListOperationsResult`"
  (^com.amazonaws.services.servicediscovery.model.ListOperationsResult [^AbstractAWSServiceDiscovery this ^com.amazonaws.services.servicediscovery.model.ListOperationsRequest request]
    (-> this (.listOperations request))))

