(ns com.amazonaws.services.servicediscovery.AWSServiceDiscoveryAsync
  "Interface for accessing ServiceDiscovery asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSServiceDiscoveryAsync instead.



  AWS Cloud Map lets you configure public DNS, private DNS, or HTTP namespaces that your microservice applications run
  in. When an instance of the service becomes available, you can call the AWS Cloud Map API to register the instance
  with AWS Cloud Map. For public or private DNS namespaces, AWS Cloud Map automatically creates DNS records and an
  optional health check. Clients that submit public or private DNS queries, or HTTP requests, for the service receive
  an answer that contains up to eight healthy records."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.servicediscovery AWSServiceDiscoveryAsync]))

(defn create-private-dns-namespace-async
  "Creates a private namespace based on DNS, which will be visible only inside a specified Amazon VPC. The namespace
   defines your service naming scheme. For example, if you name your namespace example.com and name
   your service backend, the resulting DNS name for the service will be
   backend.example.com. For the current limit on the number of namespaces that you can create using the
   same AWS account, see AWS Cloud
   Map Limits in the AWS Cloud Map Developer Guide.

  create-private-dns-namespace-request - `com.amazonaws.services.servicediscovery.model.CreatePrivateDnsNamespaceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePrivateDnsNamespace operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicediscovery.model.CreatePrivateDnsNamespaceResult>`"
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsync this ^com.amazonaws.services.servicediscovery.model.CreatePrivateDnsNamespaceRequest create-private-dns-namespace-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPrivateDnsNamespaceAsync create-private-dns-namespace-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsync this ^com.amazonaws.services.servicediscovery.model.CreatePrivateDnsNamespaceRequest create-private-dns-namespace-request]
    (-> this (.createPrivateDnsNamespaceAsync create-private-dns-namespace-request))))

(defn discover-instances-async
  "Discovers registered instances for a specified namespace and service.

  discover-instances-request - `com.amazonaws.services.servicediscovery.model.DiscoverInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DiscoverInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicediscovery.model.DiscoverInstancesResult>`"
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsync this ^com.amazonaws.services.servicediscovery.model.DiscoverInstancesRequest discover-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.discoverInstancesAsync discover-instances-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsync this ^com.amazonaws.services.servicediscovery.model.DiscoverInstancesRequest discover-instances-request]
    (-> this (.discoverInstancesAsync discover-instances-request))))

(defn delete-namespace-async
  "Deletes a namespace from the current account. If the namespace still contains one or more services, the request
   fails.

  delete-namespace-request - `com.amazonaws.services.servicediscovery.model.DeleteNamespaceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteNamespace operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicediscovery.model.DeleteNamespaceResult>`"
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsync this ^com.amazonaws.services.servicediscovery.model.DeleteNamespaceRequest delete-namespace-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteNamespaceAsync delete-namespace-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsync this ^com.amazonaws.services.servicediscovery.model.DeleteNamespaceRequest delete-namespace-request]
    (-> this (.deleteNamespaceAsync delete-namespace-request))))

(defn delete-service-async
  "Deletes a specified service. If the service still contains one or more registered instances, the request fails.

  delete-service-request - `com.amazonaws.services.servicediscovery.model.DeleteServiceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteService operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicediscovery.model.DeleteServiceResult>`"
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsync this ^com.amazonaws.services.servicediscovery.model.DeleteServiceRequest delete-service-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteServiceAsync delete-service-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsync this ^com.amazonaws.services.servicediscovery.model.DeleteServiceRequest delete-service-request]
    (-> this (.deleteServiceAsync delete-service-request))))

(defn create-http-namespace-async
  "Creates an HTTP namespace. Service instances that you register using an HTTP namespace can be discovered using a
   DiscoverInstances request but can't be discovered using DNS.


   For the current limit on the number of namespaces that you can create using the same AWS account, see AWS Cloud Map Limits in the
   AWS Cloud Map Developer Guide.

  create-http-namespace-request - `com.amazonaws.services.servicediscovery.model.CreateHttpNamespaceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateHttpNamespace operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicediscovery.model.CreateHttpNamespaceResult>`"
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsync this ^com.amazonaws.services.servicediscovery.model.CreateHttpNamespaceRequest create-http-namespace-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createHttpNamespaceAsync create-http-namespace-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsync this ^com.amazonaws.services.servicediscovery.model.CreateHttpNamespaceRequest create-http-namespace-request]
    (-> this (.createHttpNamespaceAsync create-http-namespace-request))))

(defn get-service-async
  "Gets the settings for a specified service.

  get-service-request - `com.amazonaws.services.servicediscovery.model.GetServiceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetService operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicediscovery.model.GetServiceResult>`"
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsync this ^com.amazonaws.services.servicediscovery.model.GetServiceRequest get-service-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getServiceAsync get-service-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsync this ^com.amazonaws.services.servicediscovery.model.GetServiceRequest get-service-request]
    (-> this (.getServiceAsync get-service-request))))

(defn list-namespaces-async
  "Lists summary information about the namespaces that were created by the current AWS account.

  list-namespaces-request - `com.amazonaws.services.servicediscovery.model.ListNamespacesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListNamespaces operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicediscovery.model.ListNamespacesResult>`"
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsync this ^com.amazonaws.services.servicediscovery.model.ListNamespacesRequest list-namespaces-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listNamespacesAsync list-namespaces-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsync this ^com.amazonaws.services.servicediscovery.model.ListNamespacesRequest list-namespaces-request]
    (-> this (.listNamespacesAsync list-namespaces-request))))

(defn list-operations-async
  "Lists operations that match the criteria that you specify.

  list-operations-request - `com.amazonaws.services.servicediscovery.model.ListOperationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListOperations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicediscovery.model.ListOperationsResult>`"
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsync this ^com.amazonaws.services.servicediscovery.model.ListOperationsRequest list-operations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listOperationsAsync list-operations-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsync this ^com.amazonaws.services.servicediscovery.model.ListOperationsRequest list-operations-request]
    (-> this (.listOperationsAsync list-operations-request))))

(defn create-public-dns-namespace-async
  "Creates a public namespace based on DNS, which will be visible on the internet. The namespace defines your
   service naming scheme. For example, if you name your namespace example.com and name your service
   backend, the resulting DNS name for the service will be backend.example.com. For the
   current limit on the number of namespaces that you can create using the same AWS account, see AWS Cloud Map Limits in the
   AWS Cloud Map Developer Guide.

  create-public-dns-namespace-request - `com.amazonaws.services.servicediscovery.model.CreatePublicDnsNamespaceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePublicDnsNamespace operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicediscovery.model.CreatePublicDnsNamespaceResult>`"
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsync this ^com.amazonaws.services.servicediscovery.model.CreatePublicDnsNamespaceRequest create-public-dns-namespace-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPublicDnsNamespaceAsync create-public-dns-namespace-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsync this ^com.amazonaws.services.servicediscovery.model.CreatePublicDnsNamespaceRequest create-public-dns-namespace-request]
    (-> this (.createPublicDnsNamespaceAsync create-public-dns-namespace-request))))

(defn create-service-async
  "Creates a service, which defines the configuration for the following entities:




   For public and private DNS namespaces, one of the following combinations of DNS records in Amazon Route 53:




   A




   AAAA




   A and AAAA




   SRV




   CNAME






   Optionally, a health check




   After you create the service, you can submit a RegisterInstance request, and AWS Cloud Map uses the values
   in the configuration to create the specified entities.


   For the current limit on the number of instances that you can register using the same namespace and using the
   same service, see AWS Cloud Map
   Limits in the AWS Cloud Map Developer Guide.

  create-service-request - `com.amazonaws.services.servicediscovery.model.CreateServiceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateService operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicediscovery.model.CreateServiceResult>`"
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsync this ^com.amazonaws.services.servicediscovery.model.CreateServiceRequest create-service-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createServiceAsync create-service-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsync this ^com.amazonaws.services.servicediscovery.model.CreateServiceRequest create-service-request]
    (-> this (.createServiceAsync create-service-request))))

(defn get-instance-async
  "Gets information about a specified instance.

  get-instance-request - `com.amazonaws.services.servicediscovery.model.GetInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicediscovery.model.GetInstanceResult>`"
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsync this ^com.amazonaws.services.servicediscovery.model.GetInstanceRequest get-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getInstanceAsync get-instance-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsync this ^com.amazonaws.services.servicediscovery.model.GetInstanceRequest get-instance-request]
    (-> this (.getInstanceAsync get-instance-request))))

(defn list-services-async
  "Lists summary information for all the services that are associated with one or more specified namespaces.

  list-services-request - `com.amazonaws.services.servicediscovery.model.ListServicesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListServices operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicediscovery.model.ListServicesResult>`"
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsync this ^com.amazonaws.services.servicediscovery.model.ListServicesRequest list-services-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listServicesAsync list-services-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsync this ^com.amazonaws.services.servicediscovery.model.ListServicesRequest list-services-request]
    (-> this (.listServicesAsync list-services-request))))

(defn update-instance-custom-health-status-async
  "Submits a request to change the health status of a custom health check to healthy or unhealthy.


   You can use UpdateInstanceCustomHealthStatus to change the status only for custom health checks,
   which you define using HealthCheckCustomConfig when you create a service. You can't use it to change
   the status for Route 53 health checks, which you define using HealthCheckConfig.


   For more information, see HealthCheckCustomConfig.

  update-instance-custom-health-status-request - `com.amazonaws.services.servicediscovery.model.UpdateInstanceCustomHealthStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateInstanceCustomHealthStatus operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicediscovery.model.UpdateInstanceCustomHealthStatusResult>`"
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsync this ^com.amazonaws.services.servicediscovery.model.UpdateInstanceCustomHealthStatusRequest update-instance-custom-health-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateInstanceCustomHealthStatusAsync update-instance-custom-health-status-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsync this ^com.amazonaws.services.servicediscovery.model.UpdateInstanceCustomHealthStatusRequest update-instance-custom-health-status-request]
    (-> this (.updateInstanceCustomHealthStatusAsync update-instance-custom-health-status-request))))

(defn register-instance-async
  "Creates or updates one or more records and, optionally, creates a health check based on the settings in a
   specified service. When you submit a RegisterInstance request, the following occurs:




   For each DNS record that you define in the service that is specified by ServiceId, a record is
   created or updated in the hosted zone that is associated with the corresponding namespace.




   If the service includes HealthCheckConfig, a health check is created based on the settings in the
   health check configuration.




   The health check, if any, is associated with each of the new or updated records.





   One RegisterInstance request must complete before you can submit another request and specify the
   same service ID and instance ID.



   For more information, see CreateService.


   When AWS Cloud Map receives a DNS query for the specified DNS name, it returns the applicable value:




   If the health check is healthy: returns all the records




   If the health check is unhealthy: returns the applicable value for the last healthy instance




   If you didn't specify a health check configuration: returns all the records




   For the current limit on the number of instances that you can register using the same namespace and using the
   same service, see AWS Cloud Map
   Limits in the AWS Cloud Map Developer Guide.

  register-instance-request - `com.amazonaws.services.servicediscovery.model.RegisterInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicediscovery.model.RegisterInstanceResult>`"
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsync this ^com.amazonaws.services.servicediscovery.model.RegisterInstanceRequest register-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerInstanceAsync register-instance-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsync this ^com.amazonaws.services.servicediscovery.model.RegisterInstanceRequest register-instance-request]
    (-> this (.registerInstanceAsync register-instance-request))))

(defn list-instances-async
  "Lists summary information about the instances that you registered by using a specified service.

  list-instances-request - `com.amazonaws.services.servicediscovery.model.ListInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicediscovery.model.ListInstancesResult>`"
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsync this ^com.amazonaws.services.servicediscovery.model.ListInstancesRequest list-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listInstancesAsync list-instances-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsync this ^com.amazonaws.services.servicediscovery.model.ListInstancesRequest list-instances-request]
    (-> this (.listInstancesAsync list-instances-request))))

(defn update-service-async
  "Submits a request to perform the following operations:




   Add or delete DnsRecords configurations




   Update the TTL setting for existing DnsRecords configurations




   Add, update, or delete HealthCheckConfig for a specified service




   For public and private DNS namespaces, you must specify all DnsRecords configurations (and,
   optionally, HealthCheckConfig) that you want to appear in the updated service. Any current
   configurations that don't appear in an UpdateService request are deleted.


   When you update the TTL setting for a service, AWS Cloud Map also updates the corresponding settings in all the
   records and health checks that were created by using the specified service.

  update-service-request - `com.amazonaws.services.servicediscovery.model.UpdateServiceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateService operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicediscovery.model.UpdateServiceResult>`"
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsync this ^com.amazonaws.services.servicediscovery.model.UpdateServiceRequest update-service-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateServiceAsync update-service-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsync this ^com.amazonaws.services.servicediscovery.model.UpdateServiceRequest update-service-request]
    (-> this (.updateServiceAsync update-service-request))))

(defn deregister-instance-async
  "Deletes the Amazon Route 53 DNS records and health check, if any, that AWS Cloud Map created for the specified
   instance.

  deregister-instance-request - `com.amazonaws.services.servicediscovery.model.DeregisterInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicediscovery.model.DeregisterInstanceResult>`"
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsync this ^com.amazonaws.services.servicediscovery.model.DeregisterInstanceRequest deregister-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterInstanceAsync deregister-instance-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsync this ^com.amazonaws.services.servicediscovery.model.DeregisterInstanceRequest deregister-instance-request]
    (-> this (.deregisterInstanceAsync deregister-instance-request))))

(defn get-operation-async
  "Gets information about any operation that returns an operation ID in the response, such as a
   CreateService request.



   To get a list of operations that match specified criteria, see ListOperations.

  get-operation-request - `com.amazonaws.services.servicediscovery.model.GetOperationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetOperation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicediscovery.model.GetOperationResult>`"
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsync this ^com.amazonaws.services.servicediscovery.model.GetOperationRequest get-operation-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getOperationAsync get-operation-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsync this ^com.amazonaws.services.servicediscovery.model.GetOperationRequest get-operation-request]
    (-> this (.getOperationAsync get-operation-request))))

(defn get-namespace-async
  "Gets information about a namespace.

  get-namespace-request - `com.amazonaws.services.servicediscovery.model.GetNamespaceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetNamespace operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicediscovery.model.GetNamespaceResult>`"
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsync this ^com.amazonaws.services.servicediscovery.model.GetNamespaceRequest get-namespace-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getNamespaceAsync get-namespace-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsync this ^com.amazonaws.services.servicediscovery.model.GetNamespaceRequest get-namespace-request]
    (-> this (.getNamespaceAsync get-namespace-request))))

(defn get-instances-health-status-async
  "Gets the current health status (Healthy, Unhealthy, or Unknown) of one or
   more instances that are associated with a specified service.



   There is a brief delay between when you register an instance and when the health status for the instance is
   available.

  get-instances-health-status-request - `com.amazonaws.services.servicediscovery.model.GetInstancesHealthStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetInstancesHealthStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicediscovery.model.GetInstancesHealthStatusResult>`"
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsync this ^com.amazonaws.services.servicediscovery.model.GetInstancesHealthStatusRequest get-instances-health-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getInstancesHealthStatusAsync get-instances-health-status-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceDiscoveryAsync this ^com.amazonaws.services.servicediscovery.model.GetInstancesHealthStatusRequest get-instances-health-status-request]
    (-> this (.getInstancesHealthStatusAsync get-instances-health-status-request))))

