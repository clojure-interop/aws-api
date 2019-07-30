(ns com.amazonaws.services.servicediscovery.AWSServiceDiscoveryAsyncClient
  "Client for accessing ServiceDiscovery asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.


  AWS Cloud Map lets you configure public DNS, private DNS, or HTTP namespaces that your microservice applications run
  in. When an instance of the service becomes available, you can call the AWS Cloud Map API to register the instance
  with AWS Cloud Map. For public or private DNS namespaces, AWS Cloud Map automatically creates DNS records and an
  optional health check. Clients that submit public or private DNS queries, or HTTP requests, for the service receive
  an answer that contains up to eight healthy records."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.servicediscovery AWSServiceDiscoveryAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.servicediscovery.AWSServiceDiscoveryAsyncClientBuilder`"
  (^com.amazonaws.services.servicediscovery.AWSServiceDiscoveryAsyncClientBuilder []
    (AWSServiceDiscoveryAsyncClient/asyncBuilder )))

(defn create-private-dns-namespace-async
  "Description copied from interface: AWSServiceDiscoveryAsync

  request - `com.amazonaws.services.servicediscovery.model.CreatePrivateDnsNamespaceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePrivateDnsNamespace operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicediscovery.model.CreatePrivateDnsNamespaceResult>`"
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsyncClient this ^com.amazonaws.services.servicediscovery.model.CreatePrivateDnsNamespaceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPrivateDnsNamespaceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsyncClient this ^com.amazonaws.services.servicediscovery.model.CreatePrivateDnsNamespaceRequest request]
    (-> this (.createPrivateDnsNamespaceAsync request))))

(defn discover-instances-async
  "Description copied from interface: AWSServiceDiscoveryAsync

  request - `com.amazonaws.services.servicediscovery.model.DiscoverInstancesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DiscoverInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicediscovery.model.DiscoverInstancesResult>`"
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsyncClient this ^com.amazonaws.services.servicediscovery.model.DiscoverInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.discoverInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsyncClient this ^com.amazonaws.services.servicediscovery.model.DiscoverInstancesRequest request]
    (-> this (.discoverInstancesAsync request))))

(defn delete-namespace-async
  "Description copied from interface: AWSServiceDiscoveryAsync

  request - `com.amazonaws.services.servicediscovery.model.DeleteNamespaceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteNamespace operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicediscovery.model.DeleteNamespaceResult>`"
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsyncClient this ^com.amazonaws.services.servicediscovery.model.DeleteNamespaceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteNamespaceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsyncClient this ^com.amazonaws.services.servicediscovery.model.DeleteNamespaceRequest request]
    (-> this (.deleteNamespaceAsync request))))

(defn delete-service-async
  "Description copied from interface: AWSServiceDiscoveryAsync

  request - `com.amazonaws.services.servicediscovery.model.DeleteServiceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteService operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicediscovery.model.DeleteServiceResult>`"
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsyncClient this ^com.amazonaws.services.servicediscovery.model.DeleteServiceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteServiceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsyncClient this ^com.amazonaws.services.servicediscovery.model.DeleteServiceRequest request]
    (-> this (.deleteServiceAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSServiceDiscoveryAsyncClient this]
    (-> this (.getExecutorService))))

(defn create-http-namespace-async
  "Description copied from interface: AWSServiceDiscoveryAsync

  request - `com.amazonaws.services.servicediscovery.model.CreateHttpNamespaceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateHttpNamespace operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicediscovery.model.CreateHttpNamespaceResult>`"
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsyncClient this ^com.amazonaws.services.servicediscovery.model.CreateHttpNamespaceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createHttpNamespaceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsyncClient this ^com.amazonaws.services.servicediscovery.model.CreateHttpNamespaceRequest request]
    (-> this (.createHttpNamespaceAsync request))))

(defn get-service-async
  "Description copied from interface: AWSServiceDiscoveryAsync

  request - `com.amazonaws.services.servicediscovery.model.GetServiceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetService operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicediscovery.model.GetServiceResult>`"
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsyncClient this ^com.amazonaws.services.servicediscovery.model.GetServiceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getServiceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsyncClient this ^com.amazonaws.services.servicediscovery.model.GetServiceRequest request]
    (-> this (.getServiceAsync request))))

(defn list-namespaces-async
  "Description copied from interface: AWSServiceDiscoveryAsync

  request - `com.amazonaws.services.servicediscovery.model.ListNamespacesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListNamespaces operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicediscovery.model.ListNamespacesResult>`"
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsyncClient this ^com.amazonaws.services.servicediscovery.model.ListNamespacesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listNamespacesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsyncClient this ^com.amazonaws.services.servicediscovery.model.ListNamespacesRequest request]
    (-> this (.listNamespacesAsync request))))

(defn list-operations-async
  "Description copied from interface: AWSServiceDiscoveryAsync

  request - `com.amazonaws.services.servicediscovery.model.ListOperationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListOperations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicediscovery.model.ListOperationsResult>`"
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsyncClient this ^com.amazonaws.services.servicediscovery.model.ListOperationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listOperationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsyncClient this ^com.amazonaws.services.servicediscovery.model.ListOperationsRequest request]
    (-> this (.listOperationsAsync request))))

(defn create-public-dns-namespace-async
  "Description copied from interface: AWSServiceDiscoveryAsync

  request - `com.amazonaws.services.servicediscovery.model.CreatePublicDnsNamespaceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePublicDnsNamespace operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicediscovery.model.CreatePublicDnsNamespaceResult>`"
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsyncClient this ^com.amazonaws.services.servicediscovery.model.CreatePublicDnsNamespaceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPublicDnsNamespaceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsyncClient this ^com.amazonaws.services.servicediscovery.model.CreatePublicDnsNamespaceRequest request]
    (-> this (.createPublicDnsNamespaceAsync request))))

(defn create-service-async
  "Description copied from interface: AWSServiceDiscoveryAsync

  request - `com.amazonaws.services.servicediscovery.model.CreateServiceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateService operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicediscovery.model.CreateServiceResult>`"
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsyncClient this ^com.amazonaws.services.servicediscovery.model.CreateServiceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createServiceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsyncClient this ^com.amazonaws.services.servicediscovery.model.CreateServiceRequest request]
    (-> this (.createServiceAsync request))))

(defn get-instance-async
  "Description copied from interface: AWSServiceDiscoveryAsync

  request - `com.amazonaws.services.servicediscovery.model.GetInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicediscovery.model.GetInstanceResult>`"
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsyncClient this ^com.amazonaws.services.servicediscovery.model.GetInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsyncClient this ^com.amazonaws.services.servicediscovery.model.GetInstanceRequest request]
    (-> this (.getInstanceAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSServiceDiscoveryAsyncClient this]
    (-> this (.shutdown))))

(defn list-services-async
  "Description copied from interface: AWSServiceDiscoveryAsync

  request - `com.amazonaws.services.servicediscovery.model.ListServicesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListServices operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicediscovery.model.ListServicesResult>`"
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsyncClient this ^com.amazonaws.services.servicediscovery.model.ListServicesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listServicesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsyncClient this ^com.amazonaws.services.servicediscovery.model.ListServicesRequest request]
    (-> this (.listServicesAsync request))))

(defn update-instance-custom-health-status-async
  "Description copied from interface: AWSServiceDiscoveryAsync

  request - `com.amazonaws.services.servicediscovery.model.UpdateInstanceCustomHealthStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateInstanceCustomHealthStatus operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicediscovery.model.UpdateInstanceCustomHealthStatusResult>`"
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsyncClient this ^com.amazonaws.services.servicediscovery.model.UpdateInstanceCustomHealthStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateInstanceCustomHealthStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsyncClient this ^com.amazonaws.services.servicediscovery.model.UpdateInstanceCustomHealthStatusRequest request]
    (-> this (.updateInstanceCustomHealthStatusAsync request))))

(defn register-instance-async
  "Description copied from interface: AWSServiceDiscoveryAsync

  request - `com.amazonaws.services.servicediscovery.model.RegisterInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicediscovery.model.RegisterInstanceResult>`"
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsyncClient this ^com.amazonaws.services.servicediscovery.model.RegisterInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsyncClient this ^com.amazonaws.services.servicediscovery.model.RegisterInstanceRequest request]
    (-> this (.registerInstanceAsync request))))

(defn list-instances-async
  "Description copied from interface: AWSServiceDiscoveryAsync

  request - `com.amazonaws.services.servicediscovery.model.ListInstancesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicediscovery.model.ListInstancesResult>`"
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsyncClient this ^com.amazonaws.services.servicediscovery.model.ListInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsyncClient this ^com.amazonaws.services.servicediscovery.model.ListInstancesRequest request]
    (-> this (.listInstancesAsync request))))

(defn update-service-async
  "Description copied from interface: AWSServiceDiscoveryAsync

  request - `com.amazonaws.services.servicediscovery.model.UpdateServiceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateService operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicediscovery.model.UpdateServiceResult>`"
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsyncClient this ^com.amazonaws.services.servicediscovery.model.UpdateServiceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateServiceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsyncClient this ^com.amazonaws.services.servicediscovery.model.UpdateServiceRequest request]
    (-> this (.updateServiceAsync request))))

(defn deregister-instance-async
  "Description copied from interface: AWSServiceDiscoveryAsync

  request - `com.amazonaws.services.servicediscovery.model.DeregisterInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicediscovery.model.DeregisterInstanceResult>`"
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsyncClient this ^com.amazonaws.services.servicediscovery.model.DeregisterInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsyncClient this ^com.amazonaws.services.servicediscovery.model.DeregisterInstanceRequest request]
    (-> this (.deregisterInstanceAsync request))))

(defn get-operation-async
  "Description copied from interface: AWSServiceDiscoveryAsync

  request - `com.amazonaws.services.servicediscovery.model.GetOperationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetOperation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicediscovery.model.GetOperationResult>`"
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsyncClient this ^com.amazonaws.services.servicediscovery.model.GetOperationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getOperationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsyncClient this ^com.amazonaws.services.servicediscovery.model.GetOperationRequest request]
    (-> this (.getOperationAsync request))))

(defn get-namespace-async
  "Description copied from interface: AWSServiceDiscoveryAsync

  request - `com.amazonaws.services.servicediscovery.model.GetNamespaceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetNamespace operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicediscovery.model.GetNamespaceResult>`"
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsyncClient this ^com.amazonaws.services.servicediscovery.model.GetNamespaceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getNamespaceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsyncClient this ^com.amazonaws.services.servicediscovery.model.GetNamespaceRequest request]
    (-> this (.getNamespaceAsync request))))

(defn get-instances-health-status-async
  "Description copied from interface: AWSServiceDiscoveryAsync

  request - `com.amazonaws.services.servicediscovery.model.GetInstancesHealthStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetInstancesHealthStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicediscovery.model.GetInstancesHealthStatusResult>`"
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsyncClient this ^com.amazonaws.services.servicediscovery.model.GetInstancesHealthStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getInstancesHealthStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsyncClient this ^com.amazonaws.services.servicediscovery.model.GetInstancesHealthStatusRequest request]
    (-> this (.getInstancesHealthStatusAsync request))))

