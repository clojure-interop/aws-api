(ns com.amazonaws.services.servicediscovery.AWSServiceDiscovery
  "Interface for accessing ServiceDiscovery.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSServiceDiscovery instead.



  AWS Cloud Map lets you configure public DNS, private DNS, or HTTP namespaces that your microservice applications run
  in. When an instance of the service becomes available, you can call the AWS Cloud Map API to register the instance
  with AWS Cloud Map. For public or private DNS namespaces, AWS Cloud Map automatically creates DNS records and an
  optional health check. Clients that submit public or private DNS queries, or HTTP requests, for the service receive
  an answer that contains up to eight healthy records."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.servicediscovery AWSServiceDiscovery]))

(defn create-service
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

  returns: Result of the CreateService operation returned by the service. - `com.amazonaws.services.servicediscovery.model.CreateServiceResult`

  throws: com.amazonaws.services.servicediscovery.model.InvalidInputException - One or more specified values aren't valid. For example, a required value might be missing, a numeric value might be outside the allowed range, or a string value might exceed length constraints."
  (^com.amazonaws.services.servicediscovery.model.CreateServiceResult [^AWSServiceDiscovery this ^com.amazonaws.services.servicediscovery.model.CreateServiceRequest create-service-request]
    (-> this (.createService create-service-request))))

(defn list-services
  "Lists summary information for all the services that are associated with one or more specified namespaces.

  list-services-request - `com.amazonaws.services.servicediscovery.model.ListServicesRequest`

  returns: Result of the ListServices operation returned by the service. - `com.amazonaws.services.servicediscovery.model.ListServicesResult`

  throws: com.amazonaws.services.servicediscovery.model.InvalidInputException - One or more specified values aren't valid. For example, a required value might be missing, a numeric value might be outside the allowed range, or a string value might exceed length constraints."
  (^com.amazonaws.services.servicediscovery.model.ListServicesResult [^AWSServiceDiscovery this ^com.amazonaws.services.servicediscovery.model.ListServicesRequest list-services-request]
    (-> this (.listServices list-services-request))))

(defn delete-service
  "Deletes a specified service. If the service still contains one or more registered instances, the request fails.

  delete-service-request - `com.amazonaws.services.servicediscovery.model.DeleteServiceRequest`

  returns: Result of the DeleteService operation returned by the service. - `com.amazonaws.services.servicediscovery.model.DeleteServiceResult`

  throws: com.amazonaws.services.servicediscovery.model.InvalidInputException - One or more specified values aren't valid. For example, a required value might be missing, a numeric value might be outside the allowed range, or a string value might exceed length constraints."
  (^com.amazonaws.services.servicediscovery.model.DeleteServiceResult [^AWSServiceDiscovery this ^com.amazonaws.services.servicediscovery.model.DeleteServiceRequest delete-service-request]
    (-> this (.deleteService delete-service-request))))

(defn register-instance
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

  returns: Result of the RegisterInstance operation returned by the service. - `com.amazonaws.services.servicediscovery.model.RegisterInstanceResult`

  throws: com.amazonaws.services.servicediscovery.model.DuplicateRequestException - The operation is already in progress."
  (^com.amazonaws.services.servicediscovery.model.RegisterInstanceResult [^AWSServiceDiscovery this ^com.amazonaws.services.servicediscovery.model.RegisterInstanceRequest register-instance-request]
    (-> this (.registerInstance register-instance-request))))

(defn list-namespaces
  "Lists summary information about the namespaces that were created by the current AWS account.

  list-namespaces-request - `com.amazonaws.services.servicediscovery.model.ListNamespacesRequest`

  returns: Result of the ListNamespaces operation returned by the service. - `com.amazonaws.services.servicediscovery.model.ListNamespacesResult`

  throws: com.amazonaws.services.servicediscovery.model.InvalidInputException - One or more specified values aren't valid. For example, a required value might be missing, a numeric value might be outside the allowed range, or a string value might exceed length constraints."
  (^com.amazonaws.services.servicediscovery.model.ListNamespacesResult [^AWSServiceDiscovery this ^com.amazonaws.services.servicediscovery.model.ListNamespacesRequest list-namespaces-request]
    (-> this (.listNamespaces list-namespaces-request))))

(defn discover-instances
  "Discovers registered instances for a specified namespace and service.

  discover-instances-request - `com.amazonaws.services.servicediscovery.model.DiscoverInstancesRequest`

  returns: Result of the DiscoverInstances operation returned by the service. - `com.amazonaws.services.servicediscovery.model.DiscoverInstancesResult`

  throws: com.amazonaws.services.servicediscovery.model.ServiceNotFoundException - No service exists with the specified ID."
  (^com.amazonaws.services.servicediscovery.model.DiscoverInstancesResult [^AWSServiceDiscovery this ^com.amazonaws.services.servicediscovery.model.DiscoverInstancesRequest discover-instances-request]
    (-> this (.discoverInstances discover-instances-request))))

(defn list-instances
  "Lists summary information about the instances that you registered by using a specified service.

  list-instances-request - `com.amazonaws.services.servicediscovery.model.ListInstancesRequest`

  returns: Result of the ListInstances operation returned by the service. - `com.amazonaws.services.servicediscovery.model.ListInstancesResult`

  throws: com.amazonaws.services.servicediscovery.model.ServiceNotFoundException - No service exists with the specified ID."
  (^com.amazonaws.services.servicediscovery.model.ListInstancesResult [^AWSServiceDiscovery this ^com.amazonaws.services.servicediscovery.model.ListInstancesRequest list-instances-request]
    (-> this (.listInstances list-instances-request))))

(defn get-namespace
  "Gets information about a namespace.

  get-namespace-request - `com.amazonaws.services.servicediscovery.model.GetNamespaceRequest`

  returns: Result of the GetNamespace operation returned by the service. - `com.amazonaws.services.servicediscovery.model.GetNamespaceResult`

  throws: com.amazonaws.services.servicediscovery.model.InvalidInputException - One or more specified values aren't valid. For example, a required value might be missing, a numeric value might be outside the allowed range, or a string value might exceed length constraints."
  (^com.amazonaws.services.servicediscovery.model.GetNamespaceResult [^AWSServiceDiscovery this ^com.amazonaws.services.servicediscovery.model.GetNamespaceRequest get-namespace-request]
    (-> this (.getNamespace get-namespace-request))))

(defn create-private-dns-namespace
  "Creates a private namespace based on DNS, which will be visible only inside a specified Amazon VPC. The namespace
   defines your service naming scheme. For example, if you name your namespace example.com and name
   your service backend, the resulting DNS name for the service will be
   backend.example.com. For the current limit on the number of namespaces that you can create using the
   same AWS account, see AWS Cloud
   Map Limits in the AWS Cloud Map Developer Guide.

  create-private-dns-namespace-request - `com.amazonaws.services.servicediscovery.model.CreatePrivateDnsNamespaceRequest`

  returns: Result of the CreatePrivateDnsNamespace operation returned by the service. - `com.amazonaws.services.servicediscovery.model.CreatePrivateDnsNamespaceResult`

  throws: com.amazonaws.services.servicediscovery.model.InvalidInputException - One or more specified values aren't valid. For example, a required value might be missing, a numeric value might be outside the allowed range, or a string value might exceed length constraints."
  (^com.amazonaws.services.servicediscovery.model.CreatePrivateDnsNamespaceResult [^AWSServiceDiscovery this ^com.amazonaws.services.servicediscovery.model.CreatePrivateDnsNamespaceRequest create-private-dns-namespace-request]
    (-> this (.createPrivateDnsNamespace create-private-dns-namespace-request))))

(defn get-service
  "Gets the settings for a specified service.

  get-service-request - `com.amazonaws.services.servicediscovery.model.GetServiceRequest`

  returns: Result of the GetService operation returned by the service. - `com.amazonaws.services.servicediscovery.model.GetServiceResult`

  throws: com.amazonaws.services.servicediscovery.model.InvalidInputException - One or more specified values aren't valid. For example, a required value might be missing, a numeric value might be outside the allowed range, or a string value might exceed length constraints."
  (^com.amazonaws.services.servicediscovery.model.GetServiceResult [^AWSServiceDiscovery this ^com.amazonaws.services.servicediscovery.model.GetServiceRequest get-service-request]
    (-> this (.getService get-service-request))))

(defn deregister-instance
  "Deletes the Amazon Route 53 DNS records and health check, if any, that AWS Cloud Map created for the specified
   instance.

  deregister-instance-request - `com.amazonaws.services.servicediscovery.model.DeregisterInstanceRequest`

  returns: Result of the DeregisterInstance operation returned by the service. - `com.amazonaws.services.servicediscovery.model.DeregisterInstanceResult`

  throws: com.amazonaws.services.servicediscovery.model.DuplicateRequestException - The operation is already in progress."
  (^com.amazonaws.services.servicediscovery.model.DeregisterInstanceResult [^AWSServiceDiscovery this ^com.amazonaws.services.servicediscovery.model.DeregisterInstanceRequest deregister-instance-request]
    (-> this (.deregisterInstance deregister-instance-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSServiceDiscovery this]
    (-> this (.shutdown))))

(defn get-instance
  "Gets information about a specified instance.

  get-instance-request - `com.amazonaws.services.servicediscovery.model.GetInstanceRequest`

  returns: Result of the GetInstance operation returned by the service. - `com.amazonaws.services.servicediscovery.model.GetInstanceResult`

  throws: com.amazonaws.services.servicediscovery.model.InstanceNotFoundException - No instance exists with the specified ID, or the instance was recently registered, and information about the instance hasn't propagated yet."
  (^com.amazonaws.services.servicediscovery.model.GetInstanceResult [^AWSServiceDiscovery this ^com.amazonaws.services.servicediscovery.model.GetInstanceRequest get-instance-request]
    (-> this (.getInstance get-instance-request))))

(defn update-service
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

  returns: Result of the UpdateService operation returned by the service. - `com.amazonaws.services.servicediscovery.model.UpdateServiceResult`

  throws: com.amazonaws.services.servicediscovery.model.DuplicateRequestException - The operation is already in progress."
  (^com.amazonaws.services.servicediscovery.model.UpdateServiceResult [^AWSServiceDiscovery this ^com.amazonaws.services.servicediscovery.model.UpdateServiceRequest update-service-request]
    (-> this (.updateService update-service-request))))

(defn create-public-dns-namespace
  "Creates a public namespace based on DNS, which will be visible on the internet. The namespace defines your
   service naming scheme. For example, if you name your namespace example.com and name your service
   backend, the resulting DNS name for the service will be backend.example.com. For the
   current limit on the number of namespaces that you can create using the same AWS account, see AWS Cloud Map Limits in the
   AWS Cloud Map Developer Guide.

  create-public-dns-namespace-request - `com.amazonaws.services.servicediscovery.model.CreatePublicDnsNamespaceRequest`

  returns: Result of the CreatePublicDnsNamespace operation returned by the service. - `com.amazonaws.services.servicediscovery.model.CreatePublicDnsNamespaceResult`

  throws: com.amazonaws.services.servicediscovery.model.InvalidInputException - One or more specified values aren't valid. For example, a required value might be missing, a numeric value might be outside the allowed range, or a string value might exceed length constraints."
  (^com.amazonaws.services.servicediscovery.model.CreatePublicDnsNamespaceResult [^AWSServiceDiscovery this ^com.amazonaws.services.servicediscovery.model.CreatePublicDnsNamespaceRequest create-public-dns-namespace-request]
    (-> this (.createPublicDnsNamespace create-public-dns-namespace-request))))

(defn get-operation
  "Gets information about any operation that returns an operation ID in the response, such as a
   CreateService request.



   To get a list of operations that match specified criteria, see ListOperations.

  get-operation-request - `com.amazonaws.services.servicediscovery.model.GetOperationRequest`

  returns: Result of the GetOperation operation returned by the service. - `com.amazonaws.services.servicediscovery.model.GetOperationResult`

  throws: com.amazonaws.services.servicediscovery.model.InvalidInputException - One or more specified values aren't valid. For example, a required value might be missing, a numeric value might be outside the allowed range, or a string value might exceed length constraints."
  (^com.amazonaws.services.servicediscovery.model.GetOperationResult [^AWSServiceDiscovery this ^com.amazonaws.services.servicediscovery.model.GetOperationRequest get-operation-request]
    (-> this (.getOperation get-operation-request))))

(defn create-http-namespace
  "Creates an HTTP namespace. Service instances that you register using an HTTP namespace can be discovered using a
   DiscoverInstances request but can't be discovered using DNS.


   For the current limit on the number of namespaces that you can create using the same AWS account, see AWS Cloud Map Limits in the
   AWS Cloud Map Developer Guide.

  create-http-namespace-request - `com.amazonaws.services.servicediscovery.model.CreateHttpNamespaceRequest`

  returns: Result of the CreateHttpNamespace operation returned by the service. - `com.amazonaws.services.servicediscovery.model.CreateHttpNamespaceResult`

  throws: com.amazonaws.services.servicediscovery.model.InvalidInputException - One or more specified values aren't valid. For example, a required value might be missing, a numeric value might be outside the allowed range, or a string value might exceed length constraints."
  (^com.amazonaws.services.servicediscovery.model.CreateHttpNamespaceResult [^AWSServiceDiscovery this ^com.amazonaws.services.servicediscovery.model.CreateHttpNamespaceRequest create-http-namespace-request]
    (-> this (.createHttpNamespace create-http-namespace-request))))

(defn update-instance-custom-health-status
  "Submits a request to change the health status of a custom health check to healthy or unhealthy.


   You can use UpdateInstanceCustomHealthStatus to change the status only for custom health checks,
   which you define using HealthCheckCustomConfig when you create a service. You can't use it to change
   the status for Route 53 health checks, which you define using HealthCheckConfig.


   For more information, see HealthCheckCustomConfig.

  update-instance-custom-health-status-request - `com.amazonaws.services.servicediscovery.model.UpdateInstanceCustomHealthStatusRequest`

  returns: Result of the UpdateInstanceCustomHealthStatus operation returned by the service. - `com.amazonaws.services.servicediscovery.model.UpdateInstanceCustomHealthStatusResult`

  throws: com.amazonaws.services.servicediscovery.model.InstanceNotFoundException - No instance exists with the specified ID, or the instance was recently registered, and information about the instance hasn't propagated yet."
  (^com.amazonaws.services.servicediscovery.model.UpdateInstanceCustomHealthStatusResult [^AWSServiceDiscovery this ^com.amazonaws.services.servicediscovery.model.UpdateInstanceCustomHealthStatusRequest update-instance-custom-health-status-request]
    (-> this (.updateInstanceCustomHealthStatus update-instance-custom-health-status-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSServiceDiscovery this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn delete-namespace
  "Deletes a namespace from the current account. If the namespace still contains one or more services, the request
   fails.

  delete-namespace-request - `com.amazonaws.services.servicediscovery.model.DeleteNamespaceRequest`

  returns: Result of the DeleteNamespace operation returned by the service. - `com.amazonaws.services.servicediscovery.model.DeleteNamespaceResult`

  throws: com.amazonaws.services.servicediscovery.model.InvalidInputException - One or more specified values aren't valid. For example, a required value might be missing, a numeric value might be outside the allowed range, or a string value might exceed length constraints."
  (^com.amazonaws.services.servicediscovery.model.DeleteNamespaceResult [^AWSServiceDiscovery this ^com.amazonaws.services.servicediscovery.model.DeleteNamespaceRequest delete-namespace-request]
    (-> this (.deleteNamespace delete-namespace-request))))

(defn get-instances-health-status
  "Gets the current health status (Healthy, Unhealthy, or Unknown) of one or
   more instances that are associated with a specified service.



   There is a brief delay between when you register an instance and when the health status for the instance is
   available.

  get-instances-health-status-request - `com.amazonaws.services.servicediscovery.model.GetInstancesHealthStatusRequest`

  returns: Result of the GetInstancesHealthStatus operation returned by the service. - `com.amazonaws.services.servicediscovery.model.GetInstancesHealthStatusResult`

  throws: com.amazonaws.services.servicediscovery.model.InstanceNotFoundException - No instance exists with the specified ID, or the instance was recently registered, and information about the instance hasn't propagated yet."
  (^com.amazonaws.services.servicediscovery.model.GetInstancesHealthStatusResult [^AWSServiceDiscovery this ^com.amazonaws.services.servicediscovery.model.GetInstancesHealthStatusRequest get-instances-health-status-request]
    (-> this (.getInstancesHealthStatus get-instances-health-status-request))))

(defn list-operations
  "Lists operations that match the criteria that you specify.

  list-operations-request - `com.amazonaws.services.servicediscovery.model.ListOperationsRequest`

  returns: Result of the ListOperations operation returned by the service. - `com.amazonaws.services.servicediscovery.model.ListOperationsResult`

  throws: com.amazonaws.services.servicediscovery.model.InvalidInputException - One or more specified values aren't valid. For example, a required value might be missing, a numeric value might be outside the allowed range, or a string value might exceed length constraints."
  (^com.amazonaws.services.servicediscovery.model.ListOperationsResult [^AWSServiceDiscovery this ^com.amazonaws.services.servicediscovery.model.ListOperationsRequest list-operations-request]
    (-> this (.listOperations list-operations-request))))

